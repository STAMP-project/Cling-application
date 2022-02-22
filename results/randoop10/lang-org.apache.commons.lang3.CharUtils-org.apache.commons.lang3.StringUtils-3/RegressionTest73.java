import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest73 {

    public static boolean debug = false;

    @Test
    public void test36501() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest73.test36501");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.chomp("61uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu                                  3200u          ", ".\\16 .\\16 .\\16 .\\16 .\\16 .\\16 .\\16 .\\16 .\\16 .\\16 .\\16 .\\16 .\\16 .\\16 .\\16 .\\16 .\\16 .\\16 .\\16 .\\16 .\\16 .\\16 .\\16 .\\16 .\\16 .\\16 .\\16 .\\16 .\\16 .\\16 .\\16 .\\16 .\\16 .\\16 .\\16 .\\16 .\\16 .\\16 .\\16 .\\16 .\\16 .\\16 .\\16 .\\16 .\\16 .\\16 .\\1                                       aaaaaaaaaaaaa\\\\.\\16 .\\16 .\\16 .\\16 .\\16 .\\16 .\\16 .\\16 .\\16 .\\16 .\\16 .\\16 .\\16 .\\16 .\\16 .\\16 .\\16 .\\16 .\\16 .\\16 .\\16 .\\16 .\\16 .\\16 .\\16 .\\16 .\\16 .\\16 .\\16 .\\16 .\\16 .\\16 .\\16 .\\16 .\\16 .\\16 .\\16 .\\16 .\\16 .\\16 .\\16 .\\16 .\\16 .\\16 .\\16 .\\16 .\\1");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "61uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu                                  3200u          " + "'", str2, "61uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu                                  3200u          ");
    }

    @Test
    public void test36502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest73.test36502");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.rightPad("                                          23\\U0023\\U                                          ", 20, "0023\\u0023\\u0023\\ U020\\u0020\\u0020\\u00");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "                                          23\\U0023\\U                                          " + "'", str3, "                                          23\\U0023\\U                                          ");
    }

    @Test
    public void test36503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest73.test36503");
        java.lang.String[] strArray5 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("   ...                                                                                           ", "\n\n\n\n\n1\n\n\n\n\n1\n\n\n\n\n1\n\n\n\n\n1\n\n\n\n\n1\n\n\n\n\n1\n\n...", (int) 'i');
        boolean boolean6 = org.apache.commons.lang3.StringUtils.startsWithAny("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaau6 ", strArray5);
        boolean boolean7 = org.apache.commons.lang3.StringUtils.endsWithAny("                       \\U0023\\U00\\u0041\\U                        ", strArray5);
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test36504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest73.test36504");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("\\2uuuuuuuuuuuu                                               \\uuu02\\uuu02\\uuu02\\AAAAAAAAAAAAA");
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test36505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest73.test36505");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsAny("       ...", "                                         ...    ...\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\         u0023\\u002u0023\\u002u0023\\u002u0");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test36506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest73.test36506");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.startsWith("  \n\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0", "\\IUI0020\\4\n\n");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test36507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest73.test36507");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("1111123i23i23i23iui31i23i23i23i23111111", 'a');
        int int4 = org.apache.commons.lang3.StringUtils.indexOfAny("6\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6...\\ 61\\ 61\\61U 61\\ 61\\610020\\ 61\\ 61\\61U 61\\ 61\\610020\\ 61\\ 61\\61U 61\\ 61\\610020\\ 61\\ 61\\61U 61\\ 61\\610020\\ 61\\ 61\\61U 61\\ 61\\610020\\ 61\\ 61\\61U 61\\ 61\\610020\\ 61\\ 61\\61U 61\\ 61\\610020\\ 61\\ 61\\61U 61\\ 61\\610020\\ 61\\ 61\\61U 61\\ 61\\610020\\ 61\\ ", strArray3);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
    }

    @Test
    public void test36508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest73.test36508");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBetween("aaaaaaaaaaaaaaaaaaaaaaaaaaaaa             3200u\\3200u\\3200u\\3200u\\3200u\\3200u\\3200u\\3200u\\3200u\\3200u\\", "c500u\\0u\\0200u\\0200u\\0200u\\0200u\\0200u\\\n###55555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555");
        org.junit.Assert.assertNull(str2);
    }

    @Test
    public void test36509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest73.test36509");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("...0u\\3200u\\3200u\\3200u\\3200u\\3200u\\3200u\\3200u\\hi!", "\\u0043");
        boolean boolean4 = org.apache.commons.lang3.StringUtils.startsWithAny("11111...U\\1400u\\00U\\3200U\\16U\\1400u\\00U\\3200U\\16U\\1400u\\00U\\3200U\\16U\\1400u\\00U\\3200U\\16U\\1400u\\00U\\3200U\\", strArray3);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
    }

    @Test
    public void test36510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest73.test36510");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.abbreviate("\\ 61\\ 61\\61u 61\\ 61\\610020", 118);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\\ 61\\ 61\\61u 61\\ 61\\610020" + "'", str2, "\\ 61\\ 61\\61u 61\\ 61\\610020");
    }

    @Test
    public void test36511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest73.test36511");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.defaultString("1111111111111111111111111111111111111111111110uhi!hi!hi!3000uhi!hi!hi!3111111111111111111111111111111111111111111111");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "1111111111111111111111111111111111111111111110uhi!hi!hi!3000uhi!hi!hi!3111111111111111111111111111111111111111111111" + "'", str1, "1111111111111111111111111111111111111111111110uhi!hi!hi!3000uhi!hi!hi!3111111111111111111111111111111111111111111111");
    }

    @Test
    public void test36512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest73.test36512");
        char[] charArray10 = new char[] { ' ' };
        int int11 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "10hi!100", charArray10);
        boolean boolean12 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "\\U0023", charArray10);
        int int13 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa 61aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", charArray10);
        int int14 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "61\\6      aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa 61aaaaaaaaaaaaaaaaaaaaaaaaaaaa1\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61", charArray10);
        boolean boolean15 = org.apache.commons.lang3.StringUtils.containsAny("Aaaaaaa      ", charArray10);
        boolean boolean16 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "6\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 6", charArray10);
        boolean boolean17 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "\\u0023\\u00\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U002UUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU", charArray10);
        int int18 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "66666666666666666666666666666666666666666666666666666       22222\\U0023\\U0\\u0068", charArray10);
        int int19 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "...\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020...", charArray10);
        org.junit.Assert.assertNotNull(charArray10);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray10), " ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray10), " ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray10), "[ ]");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 4 + "'", int14 == 4);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
    }

    @Test
    public void test36513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest73.test36513");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.split("33333333333333333333", "   ...3\\u23\\u23U6    ", 178);
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void test36514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest73.test36514");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeEndIgnoreCase("                                                                                                                                                                                                                                                                                                                                                      3                                                                                                                                                                                                                                                                                                                                                      ", "\\u003\\u0023\\u0023\\u0023\\  UUUUUUUUUUUUUUUUUU\\4555555555555555555555555                                                                               ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                                                                                                                                                                                                                                                                                                                                      3                                                                                                                                                                                                                                                                                                                                                      " + "'", str2, "                                                                                                                                                                                                                                                                                                                                                      3                                                                                                                                                                                                                                                                                                                                                      ");
    }

    @Test
    public void test36515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest73.test36515");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringAfterLast("\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023...", "uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu\\\\\\AAAAAAAAAAAAAuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test36516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest73.test36516");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isWhitespace((java.lang.CharSequence) "                                                                                                                                                                                                                                                                               #u\n\n###u\n\n###u\n\n###aaaaaaaaaaaaa###                                                                                                                                                                                                                      ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test36517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest73.test36517");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("1!0h01", "                                                                                                                                                                        41                                                                                                                                                                         ", 102);
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void test36518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest73.test36518");
        java.lang.CharSequence charSequence4 = null;
        char[] charArray10 = new char[] { ' ' };
        int int11 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "10hi!100", charArray10);
        boolean boolean12 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "\\U0023", charArray10);
        int int13 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa 61aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", charArray10);
        boolean boolean14 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "      aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa 61aaaaaaaaaaaaaaaaaaaaaaaaaaaa", charArray10);
        boolean boolean15 = org.apache.commons.lang3.StringUtils.containsOnly(charSequence4, charArray10);
        boolean boolean16 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ u61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\", charArray10);
        int int17 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "61                                         \n\n1", charArray10);
        boolean boolean18 = org.apache.commons.lang3.StringUtils.containsAny("u61uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu61uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu", charArray10);
        boolean boolean19 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "                                                                                                                                                                                                                                                                      ", charArray10);
        org.junit.Assert.assertNotNull(charArray10);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray10), " ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray10), " ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray10), "[ ]");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
    }

    @Test
    public void test36519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest73.test36519");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripToNull("3333333333333333333333333333333333                                                                             6u623\\U");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "3333333333333333333333333333333333                                                                             6u623\\U" + "'", str1, "3333333333333333333333333333333333                                                                             6u623\\U");
    }

    @Test
    public void test36520() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest73.test36520");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trimToEmpty("                                             aaa");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "aaa" + "'", str1, "aaa");
    }

    @Test
    public void test36521() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest73.test36521");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBeforeLast("   ...", "111111111111111111111");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "   ..." + "'", str2, "   ...");
    }

    @Test
    public void test36522() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest73.test36522");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOf("61\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6...", "I");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test36523() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest73.test36523");
        int int2 = org.apache.commons.lang3.StringUtils.countMatches("5                                                                                                ", "..................6 \\1616 \\16 \\1616 \\16 \\1616 \\16 \\1.................");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test36524() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest73.test36524");
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.overlay("61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\u61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\\\4003266666666666666666", "14", 682, 96);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\u61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\\\400326666666666666666614" + "'", str4, "61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\u61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\\\400326666666666666666614");
    }

    @Test
    public void test36525() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest73.test36525");
        int int3 = org.apache.commons.lang3.StringUtils.indexOfIgnoreCase("\\U000D", "\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U002375757575757575757575757575757575757575757575757575757575", (int) '\\');
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test36526() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest73.test36526");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("61\\ 61\\\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u006", "###\n##", 88);
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void test36527() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest73.test36527");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.upperCase("\\u0023AAAAAAAAAAAAA");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "\\U0023AAAAAAAAAAAAA" + "'", str1, "\\U0023AAAAAAAAAAAAA");
    }

    @Test
    public void test36528() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest73.test36528");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOf("u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u00230023", 861, 63);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test36529() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest73.test36529");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.chomp("U 32  U 32", "AAAAAAAAAAAAAAUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU3200UAAAAAAAAAAAAAA");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "U 32  U 32" + "'", str2, "U 32  U 32");
    }

    @Test
    public void test36530() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest73.test36530");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.swapCase("3200u\\3200u\\3200\\u003\\u0023\\u0023\\u0023\\u0023\\u0023\\u00233200u\\3200u\\3200");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "3200U\\3200U\\3200\\U003\\U0023\\U0023\\U0023\\U0023\\U0023\\U00233200U\\3200U\\3200" + "'", str1, "3200U\\3200U\\3200\\U003\\U0023\\U0023\\U0023\\U0023\\U0023\\U00233200U\\3200U\\3200");
    }

    @Test
    public void test36531() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest73.test36531");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens(" 61\\ ");
        int int4 = org.apache.commons.lang3.StringUtils.indexOfDifference((java.lang.CharSequence[]) strArray3);
        java.lang.String str5 = org.apache.commons.lang3.StringUtils.concatWith("                     ......  77777777777777777777777777777777777777777777777777777777777777777777777", (java.lang.Object[]) strArray3);
        java.lang.String str6 = org.apache.commons.lang3.StringUtils.concatWith("A000U 61 61 61 61 61 61 61 61 61 61 61A000U 61 61 61 61 61 61 61 61 61 61 61A000U", (java.lang.Object[]) strArray3);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "                     ......  7777777777777777777777777777777777777777777777777777777777777777777777761\\                     ......  77777777777777777777777777777777777777777777777777777777777777777777777" + "'", str5, "                     ......  7777777777777777777777777777777777777777777777777777777777777777777777761\\                     ......  77777777777777777777777777777777777777777777777777777777777777777777777");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "A000U 61 61 61 61 61 61 61 61 61 61 61A000U 61 61 61 61 61 61 61 61 61 61 61A000U61\\A000U 61 61 61 61 61 61 61 61 61 61 61A000U 61 61 61 61 61 61 61 61 61 61 61A000U" + "'", str6, "A000U 61 61 61 61 61 61 61 61 61 61 61A000U 61 61 61 61 61 61 61 61 61 61 61A000U61\\A000U 61 61 61 61 61 61 61 61 61 61 61A000U 61 61 61 61 61 61 61 61 61 61 61A000U");
    }

    @Test
    public void test36532() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest73.test36532");
        char char2 = org.apache.commons.lang3.CharUtils.toChar("2 2 2 2 4444444444444 1 1", 'h');
        org.junit.Assert.assertTrue("'" + char2 + "' != '" + '2' + "'", char2 == '2');
    }

    @Test
    public void test36533() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest73.test36533");
        int int3 = org.apache.commons.lang3.StringUtils.indexOf("                                      \\U0023\\U00\\u0041\\U0023", "uuuuuuuuuaaaaaaa       3200u\\320", 107);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test36534() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest73.test36534");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeEndIgnoreCase("                   55555555556UUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU62626                   ", "  5757575757575757575757575757575757575757575757575757575732U\\32U\\32U\\32U\\32U\\32U\\32U\\");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                   55555555556UUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU62626                   " + "'", str2, "                   55555555556UUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU62626                   ");
    }

    @Test
    public void test36535() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest73.test36535");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfDifference((java.lang.CharSequence) " u   6", (java.lang.CharSequence) "                                                                                ");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
    }

    @Test
    public void test36536() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest73.test36536");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripAccents((java.lang.CharSequence) "\\U0023                                                                                     HI!HI!HI!\\U0023                                   \\U0068\\U0023                                                                                     HI!HI!HI!\\U");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "\\U0023                                                                                     HI!HI!HI!\\U0023                                   \\U0068\\U0023                                                                                     HI!HI!HI!\\U" + "'", str1, "\\U0023                                                                                     HI!HI!HI!\\U0023                                   \\U0068\\U0023                                                                                     HI!HI!HI!\\U");
    }

    @Test
    public void test36537() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest73.test36537");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.center("\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u00220\\u0", 31, "                                        \\0033                                         ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u00220\\u0" + "'", str3, "\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u00220\\u0");
    }

    @Test
    public void test36538() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest73.test36538");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphanumeric((java.lang.CharSequence) "\\4  2U2U2U2U2U2U2U2U2U2U2U2U2U2U2U2U2U2U2U2U2U2U2U2U2U2U2U2U2U2U2U2U2U2U2U2U2U2U2U2U2U2U2U2U2U2U2U2U2U2U2U2U2U2U2U2U2U2U2U");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test36539() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest73.test36539");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                               !ih!ih!ih                                                                                                                                                                                                                                                                                                                                                                                                                                                                ", "  uuuuuuuuuuuu 3200u           ");
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test36540() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest73.test36540");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceChars("3333361                                    ", "         aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "u003aaaaaau003aaaaaau003aaaaaau0...                          ...u003aaaaaau003aaaaaau003aaaaaau00");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "3333361uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu" + "'", str3, "3333361uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu");
    }

    @Test
    public void test36541() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest73.test36541");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.stripEnd("", "   ..");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test36542() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest73.test36542");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substring("    \\U0061\\U0061\\U0061\\U0061\\U0061\\U0061\\U0061\\U0061\\U0061\\U0061\\U0061\\U0061\\U0061\\U0061\\U0061\\U0061\\U0061\\U0061\\U0061\\U0061\\U0061\\U0061\\U0061\\U0061\\U0061\\U0061\\U0061\\U0061\\U0061\\U0061\\U0061\\U006", 103);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "061\\U0061\\U0061\\U0061\\U0061\\U0061\\U0061\\U0061\\U0061\\U0061\\U0061\\U0061\\U0061\\U0061\\U0061\\U006" + "'", str2, "061\\U0061\\U0061\\U0061\\U0061\\U0061\\U0061\\U0061\\U0061\\U0061\\U0061\\U0061\\U0061\\U0061\\U0061\\U006");
    }

    @Test
    public void test36543() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest73.test36543");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.leftPad("                                                                                                                                                                 ", 682);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                          " + "'", str2, "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                          ");
    }

    @Test
    public void test36544() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest73.test36544");
        int int2 = org.apache.commons.lang3.CharUtils.toIntValue((java.lang.Character) 'U', 104);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 104 + "'", int2 == 104);
    }

    @Test
    public void test36545() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest73.test36545");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.reverseDelimited("u003aaaaaau003aaaaaau003aaaaaau0...                          ...u003aaaaaau003aaaaaau003aaaaaau00", 'u');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "00u003aaaaaau003aaaaaau003aaaaaau0...                          ...u003aaaaaau003aaaaaau003aaaaaa" + "'", str2, "00u003aaaaaau003aaaaaau003aaaaaau0...                          ...u003aaaaaau003aaaaaau003aaaaaa");
    }

    @Test
    public void test36546() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest73.test36546");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.endsWith("                              23\\u0023\\u0023\\u002                                                       ", "23\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test36547() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest73.test36547");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.contains("\\u0033", 23);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test36548() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest73.test36548");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.split("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa261", '1');
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.stripAll(strArray3);
        int int5 = org.apache.commons.lang3.StringUtils.indexOfAny("                                                                                     aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", strArray4);
        java.lang.String str6 = org.apache.commons.lang3.StringUtils.concat((java.lang.Object[]) strArray4);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa26" + "'", str6, "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa26");
    }

    @Test
    public void test36549() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest73.test36549");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.containsWhitespace("1\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test36550() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest73.test36550");
        java.lang.String[] strArray1 = null;
        int int2 = org.apache.commons.lang3.StringUtils.indexOfAny("u003            0023         ", strArray1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test36551() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest73.test36551");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceChars("AA                  AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA", "hhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhh                                                ...hhhhhhhhh", "u001\\u000023001\\u00\\001\\u00u001\\u000023001\\u00\\001\\u00u001\\u000023001\\u00\\001\\u00u001\\u000023001\\u00\\001\\u00u001\\u000023001\\u00\\001\\u00u001\\u000023001\\u00\\001\\u00u001\\u000023001\\u00\\001\\u00u001\\u000023001\\u00u001\\u000023001\\u00\\001\\u00u001\\u000023001\\u00\\001\\u00u001\\u000023001\\u00\\001\\u00u001\\u000023001\\u00\\001\\u00u001\\u000023001\\u00\\001\\u00u001\\u000023001\\u00\\001\\u00u001\\u0000230023");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA" + "'", str3, "AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA");
    }

    @Test
    public void test36552() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest73.test36552");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.chomp("\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023", "00U\\0200U\\0200U\\0200U\\0200U\\0200U\\0200U\\0200U\\0200U\\0200U\\0200U\\0200U\\0200U\\0200U\\0200U\\\n16U");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023" + "'", str2, "\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023");
    }

    @Test
    public void test36553() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest73.test36553");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphanumericSpace((java.lang.CharSequence) "55555555556 UUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU 6     2  6     2  6                                                                                                                                                                                                                        ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test36554() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest73.test36554");
        int int2 = org.apache.commons.lang3.StringUtils.indexOf("AAAAAAAAAAAAA3200\\A                             6\\6\\66\\6\\66\\6\\66\\6...", 130);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test36555() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest73.test36555");
        java.lang.String[] strArray6 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("                                                                                                        aaaaaaa     ", "     \\U0023\\U00\\u0041\\U0023     ", 97);
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.concatWith("61uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu                                  3200u", (java.lang.Object[]) strArray6);
        boolean boolean8 = org.apache.commons.lang3.StringUtils.startsWithAny("####AU", strArray6);
        java.lang.String str9 = org.apache.commons.lang3.StringUtils.concatWith("       ...", (java.lang.Object[]) strArray6);
        java.lang.String str11 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray6, '7');
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "                                                                                                        aaaaaaa     " + "'", str7, "                                                                                                        aaaaaaa     ");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "                                                                                                        aaaaaaa     " + "'", str9, "                                                                                                        aaaaaaa     ");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "                                                                                                        aaaaaaa     " + "'", str11, "                                                                                                        aaaaaaa     ");
    }

    @Test
    public void test36556() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest73.test36556");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringAfterLast("\\66666666666666666666666666666666666666666666666666666622222\\U0023\\U0\\u0068\\66666666666666666666666666666666666666666666666666666622222\\U0023\\U0\\u0068\\66666666666666666666666666666666666666666666666666666622222\\U0023\\U0\\u0068\\66666666666666666666666666666666666666666666666666666622222\\U0023\\U0\\u0068\\66666666666666666666666666666666666666666666666666666622222\\U0023\\U0\\u0068\\...", "AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA111111111111111111111u6111111111111111111111AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test36557() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest73.test36557");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.leftPad(" 6\\\\u0020 6\\\\u0020 6\\\\u0020 6\\\\u0020 6\\\\u\r\r\r\r\r...  ", 263, '\n');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n 6\\\\u0020 6\\\\u0020 6\\\\u0020 6\\\\u0020 6\\\\u\r\r\r\r\r...  " + "'", str3, "\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n 6\\\\u0020 6\\\\u0020 6\\\\u0020 6\\\\u0020 6\\\\u\r\r\r\r\r...  ");
    }

    @Test
    public void test36558() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest73.test36558");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAllUpperCase((java.lang.CharSequence) " 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ u61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test36559() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest73.test36559");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.mid("                                                                                                                                                         ", 29, 26);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "                          " + "'", str3, "                          ");
    }

    @Test
    public void test36560() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest73.test36560");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfAnyBut("\r\r\r\r\r\r\\u0061\\u0061\\u\\U0023\\u0061\\u0061\\u0\r\r\r\r\r\r\r", "AAA51AAA");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test36561() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest73.test36561");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceChars("161\\161\\161\\161\\161\\161\\161\\161\\161\\161\\161\\161\\161\\161\\161\\161\\161\\161\\161\\161\\161\\161\\161\\161\\161\\161\\161\\161\\161                                                                                          ", "                                                                                                                                                                                                                                                                                                                                                      3                                                                                                                                                                                                                                                                                                                                                      ", "3200uUu\\u3200uUu\\u3200uUu\\u3200uUu\\u3200uUu\\u3200uUu\\u3200uUu\\u3200uUu\\u3200uUu\\u3200uUu\\");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "161\\161\\161\\161\\161\\161\\161\\161\\161\\161\\161\\161\\161\\161\\161\\161\\161\\161\\161\\161\\161\\161\\161\\161\\161\\161\\161\\161\\161333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333" + "'", str3, "161\\161\\161\\161\\161\\161\\161\\161\\161\\161\\161\\161\\161\\161\\161\\161\\161\\161\\161\\161\\161\\161\\161\\161\\161\\161\\161\\161\\161333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333");
    }

    @Test
    public void test36562() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest73.test36562");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.split("\\4\n\n\n", "\\u0023                                                                                     hi!hi!hi!                                                                                                         ");
        boolean boolean4 = org.apache.commons.lang3.StringUtils.startsWithAny("aaaaaaaaaaaaaaaaaaaaaaa  aaaaaaaaaaaaaaaaaaaaaaaa\\u0032\\u0032\\u0032\\u0032\\u0032\\u003", strArray3);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test36563() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest73.test36563");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.swapCase("                                  3200");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "                                  3200" + "'", str1, "                                  3200");
    }

    @Test
    public void test36564() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest73.test36564");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceChars("AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA 61AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA 61AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA 61AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA 61AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA 61AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA 61AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA 61AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA 61AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA 61AAAAAAAAAAAAAAAAAAAAAAAAAAAA", 'U', '2');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA 61AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA 61AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA 61AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA 61AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA 61AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA 61AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA 61AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA 61AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA 61AAAAAAAAAAAAAAAAAAAAAAAAAAAA" + "'", str3, "AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA 61AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA 61AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA 61AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA 61AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA 61AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA 61AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA 61AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA 61AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA 61AAAAAAAAAAAAAAAAAAAAAAAAAAAA");
    }

    @Test
    public void test36565() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest73.test36565");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsAny("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "\\u003\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023                                                  ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test36566() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest73.test36566");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("161\\161\\161\\161\\161\\161\\161\\161\\161\\161\\161\\161\\161\\161\\161\\161\\161\\161\\161\\161\\161\\161\\161\\161\\161\\161\\161\\161\\161333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333", "161\\161\\161\\161\\161\\161\\u0023                                              6u\\u0023\\1111111111111111111111111111", 164);
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void test36567() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest73.test36567");
        char char1 = org.apache.commons.lang3.CharUtils.toChar("                                                                                                  I");
        org.junit.Assert.assertTrue("'" + char1 + "' != '" + ' ' + "'", char1 == ' ');
    }

    @Test
    public void test36568() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest73.test36568");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBeforeLast("I0I0020\\4\n\n.............................................................................I0I0020\\4\n\n....................................................u\\uI0I0020\\4\n\n.............................................................................I0I0020\\4\n\n.....................................................", "230U00230U00230U00230U00230U00230U00230U00230U00230U002");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "I0I0020\\4\n\n.............................................................................I0I0020\\4\n\n....................................................u\\uI0I0020\\4\n\n.............................................................................I0I0020\\4\n\n....................................................." + "'", str2, "I0I0020\\4\n\n.............................................................................I0I0020\\4\n\n....................................................u\\uI0I0020\\4\n\n.............................................................................I0I0020\\4\n\n.....................................................");
    }

    @Test
    public void test36569() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest73.test36569");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceChars("\\4  ", "", "UUUUUUUUUUU6UUUUUUUUUUU                        ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\\4  " + "'", str3, "\\4  ");
    }

    @Test
    public void test36570() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest73.test36570");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isBlank((java.lang.CharSequence) " 61\\\\u002");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test36571() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest73.test36571");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.remove("                           1\\U00234                                      \\U0023\\U00\\u0           ...", '2');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                           1\\U0034                                      \\U003\\U00\\u0           ..." + "'", str2, "                           1\\U0034                                      \\U003\\U00\\u0           ...");
    }

    @Test
    public void test36572() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest73.test36572");
        char char2 = org.apache.commons.lang3.CharUtils.toChar(" 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61...... 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ ...", 'a');
        org.junit.Assert.assertTrue("'" + char2 + "' != '" + ' ' + "'", char2 == ' ');
    }

    @Test
    public void test36573() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest73.test36573");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfDifference((java.lang.CharSequence) "2222222222222222222222", (java.lang.CharSequence) "                                                                                                  I");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test36574() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest73.test36574");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripAccents((java.lang.CharSequence) "U 61.");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "U 61." + "'", str1, "U 61.");
    }

    @Test
    public void test36575() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest73.test36575");
        int int2 = org.apache.commons.lang3.StringUtils.getLevenshteinDistance((java.lang.CharSequence) "\\U", (java.lang.CharSequence) "\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023                                                  ");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 91 + "'", int2 == 91);
    }

    @Test
    public void test36576() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest73.test36576");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.difference("                                       AAAAAAAAAAAAA3200u\\A                                      ", "... 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ ...                                A\\u0023AAAAAAAAAAAAAa000u\\            ...");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "... 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ ...                                A\\u0023AAAAAAAAAAAAAa000u\\            ..." + "'", str2, "... 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ ...                                A\\u0023AAAAAAAAAAAAAa000u\\            ...");
    }

    @Test
    public void test36577() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest73.test36577");
        java.util.Locale locale1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.apache.commons.lang3.StringUtils.lowerCase("2  U  2  U  2  U  2  U  ", locale1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test36578() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest73.test36578");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.defaultIfBlank("                           1\\U00234                                      \\U0023\\U00\\u0                    .", " 61UUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU 6\\\\u0020 6\\\\u0020 6");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                           1\\U00234                                      \\U0023\\U00\\u0                    ." + "'", str2, "                           1\\U00234                                      \\U0023\\U00\\u0                    .");
    }

    @Test
    public void test36579() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest73.test36579");
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("66666666666666666666666666666661aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa666666666666666666666666666666", "", (int) 'i');
        java.lang.String[] strArray5 = org.apache.commons.lang3.StringUtils.stripAll(strArray4);
        int int6 = org.apache.commons.lang3.StringUtils.lastIndexOfAny("5c111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111...                   \n\n1", strArray4);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
    }

    @Test
    public void test36580() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest73.test36580");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.leftPad("61.61.61.61.61.61.61.61.61.61.61.61.61.61.61.61.61.61.61.61.61.61.61.61.61.61.61.61.61.61.", 24, '1');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "61.61.61.61.61.61.61.61.61.61.61.61.61.61.61.61.61.61.61.61.61.61.61.61.61.61.61.61.61.61." + "'", str3, "61.61.61.61.61.61.61.61.61.61.61.61.61.61.61.61.61.61.61.61.61.61.61.61.61.61.61.61.61.61.");
    }

    @Test
    public void test36581() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest73.test36581");
        int int3 = org.apache.commons.lang3.StringUtils.indexOf("23\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u00", 518, 64);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test36582() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest73.test36582");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.endsWithIgnoreCase("", "U0023\\U00\\u0041\\U");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test36583() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest73.test36583");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("33333333", "....................................................................................................", 563);
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void test36584() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest73.test36584");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.capitalize((java.lang.CharSequence) "23\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023U6                                       ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "23\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023U6                                       " + "'", str1, "23\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023U6                                       ");
    }

    @Test
    public void test36585() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest73.test36585");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.defaultString("111111111111111111111111111111111111111111111111111111111111111111111111111111111111...", "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "111111111111111111111111111111111111111111111111111111111111111111111111111111111111..." + "'", str2, "111111111111111111111111111111111111111111111111111111111111111111111111111111111111...");
    }

    @Test
    public void test36586() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest73.test36586");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.remove("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n1616161616161616161161611616161616161616161", 'A');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n1616161616161616161161611616161616161616161" + "'", str2, "\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n1616161616161616161161611616161616161616161");
    }

    @Test
    public void test36587() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest73.test36587");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("\\0020\\0020\\0020\\0020\\0020\\0020\\0020\\0020\\0020\\0020\\0020\\0020\\0020\\0020\\0020\\0", '3');
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test36588() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest73.test36588");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.swapCase("023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u00");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U00" + "'", str1, "023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U00");
    }

    @Test
    public void test36589() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest73.test36589");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfIgnoreCase("H", "AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test36590() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest73.test36590");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("11111111111u0023#u0023#u0023#u0023#u0023#u0023#u");
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test36591() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest73.test36591");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAsciiPrintable((java.lang.CharSequence) "6666\r\r\r\r\r\r\rAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test36592() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest73.test36592");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsIgnoreCase("1\\ 61\\ 6 ", "\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\u");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test36593() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest73.test36593");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trimToEmpty("\n\\U61\\ U61\\ 61\\ 61\\ 61\\ 61\\AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "\\U61\\ U61\\ 61\\ 61\\ 61\\ 61\\AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA" + "'", str1, "\\U61\\ U61\\ 61\\ 61\\ 61\\ 61\\AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA");
    }

    @Test
    public void test36594() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest73.test36594");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeEndIgnoreCase("    ", "023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U00");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "    " + "'", str2, "    ");
    }

    @Test
    public void test36595() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest73.test36595");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trimToNull("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa061");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa061" + "'", str1, "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa061");
    }

    @Test
    public void test36596() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest73.test36596");
        java.lang.CharSequence charSequence0 = null;
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsOnly(charSequence0, "222222222222222222222222222222222222222222222222222222222222222222222222222222 6uUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU 6\\\\u0020 6\\\\u0020 6              2222222222222222222222222222222222222222222222222222222222222222222222222222222");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test36597() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest73.test36597");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.abbreviate("Aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa         ", 138, 237);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa         " + "'", str3, "Aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa         ");
    }

    @Test
    public void test36598() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest73.test36598");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlpha((java.lang.CharSequence) "\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\u");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test36599() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest73.test36599");
        int int3 = org.apache.commons.lang3.StringUtils.ordinalIndexOf("22222222222222222222uuu0023                                            222222222222222222222cccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccc", "                                                  3200u\\3200u\\3200u\\3200u\\3200u\\3200u\\300u\\", 38);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test36600() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest73.test36600");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.split("222222U0023#U0023#U0023#U0023#U0023#U0023#U0023      222222", "                    \n                     ", 358);
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void test36601() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest73.test36601");
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.overlay("                                       AAAAAAAAAAAAA3200u\\A                                      ", "...6666666666666666661aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa666666666666666666666666666666", 243, (int) 'U');
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "                                       AAAAAAAAAAAAA3200u\\A                          ...6666666666666666661aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa666666666666666666666666666666" + "'", str4, "                                       AAAAAAAAAAAAA3200u\\A                          ...6666666666666666661aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa666666666666666666666666666666");
    }

    @Test
    public void test36602() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest73.test36602");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsIgnoreCase("6161UUUUUUUUUUUUUUUUUUUUUUUU55          aaaaaaa       \\61UUUUUUUUUUUUUUUUUUUUUUUU55          aaaaaaa        61UUUUUUUUUUUUUUUUUUUUUUUU55          aaaaaaa       6161UUUUUUUUUUUUUUUUUUUUUUUU55          aaaaaaa       \\61UUUUUUUUUUUUUUUUUUUUUUUU55          aaaaaaa        61UUUUUUUUUUUUUUUUUUUUUUUU55          aaaaaaa       61", "AA                  AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test36603() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest73.test36603");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.rightPad("3000u\\31111111111111111111111111111111111111111111110U3004\\U\\3200U\\3200U3200u##########0U\\3200U\\3200U3004\\U\\3200U\\3200U3200u##########0U\\3200U\\3200U3004\\U\\3200U\\3200U32      3000u\\31111111111111111111111111111111111111111111110U3004\\U\\3200U\\3200U3200u##########0U\\3200U\\3200U3004\\U\\3200U\\3200U3200u##########0U\\3200U\\3200U3004\\U\\3200U\\3200U32      3000u\\31111111111111111111111111111111111111111111110U3004\\U\\3200U\\3200U3200u##########0U\\3200U\\3200U3004\\U\\3200U\\3200U3200u#      ", 3);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "3000u\\31111111111111111111111111111111111111111111110U3004\\U\\3200U\\3200U3200u##########0U\\3200U\\3200U3004\\U\\3200U\\3200U3200u##########0U\\3200U\\3200U3004\\U\\3200U\\3200U32      3000u\\31111111111111111111111111111111111111111111110U3004\\U\\3200U\\3200U3200u##########0U\\3200U\\3200U3004\\U\\3200U\\3200U3200u##########0U\\3200U\\3200U3004\\U\\3200U\\3200U32      3000u\\31111111111111111111111111111111111111111111110U3004\\U\\3200U\\3200U3200u##########0U\\3200U\\3200U3004\\U\\3200U\\3200U3200u#      " + "'", str2, "3000u\\31111111111111111111111111111111111111111111110U3004\\U\\3200U\\3200U3200u##########0U\\3200U\\3200U3004\\U\\3200U\\3200U3200u##########0U\\3200U\\3200U3004\\U\\3200U\\3200U32      3000u\\31111111111111111111111111111111111111111111110U3004\\U\\3200U\\3200U3200u##########0U\\3200U\\3200U3004\\U\\3200U\\3200U3200u##########0U\\3200U\\3200U3004\\U\\3200U\\3200U32      3000u\\31111111111111111111111111111111111111111111110U3004\\U\\3200U\\3200U3200u##########0U\\3200U\\3200U3004\\U\\3200U\\3200U3200u#      ");
    }

    @Test
    public void test36604() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest73.test36604");
        java.util.Locale locale1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.apache.commons.lang3.StringUtils.lowerCase("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61......61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", locale1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test36605() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest73.test36605");
        java.lang.CharSequence charSequence5 = null;
        char[] charArray15 = new char[] { '4', ' ', ' ', ' ', '4' };
        boolean boolean16 = org.apache.commons.lang3.StringUtils.containsAny("hi!", charArray15);
        boolean boolean17 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "10hi!100", charArray15);
        int int18 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "\\u0061", charArray15);
        int int19 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "hi!", charArray15);
        boolean boolean20 = org.apache.commons.lang3.StringUtils.containsOnly(charSequence5, charArray15);
        int int21 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "\\u0023                                                                                     ", charArray15);
        boolean boolean22 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "\\u0037", charArray15);
        boolean boolean23 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "5", charArray15);
        int int24 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u00220\\u0hhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhh", charArray15);
        boolean boolean25 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "                                ", charArray15);
        org.junit.Assert.assertNotNull(charArray15);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray15), "4   4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray15), "4   4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray15), "[4,  ,  ,  , 4]");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
    }

    @Test
    public void test36606() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest73.test36606");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.stripEnd("                                                    ", " 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ U61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 6");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test36607() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest73.test36607");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.center("...UUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU 6\\\\u0020 6\\\\u0020 6              ", 38, "aaaaaaa    hhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhh");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "...UUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU 6\\\\u0020 6\\\\u0020 6              " + "'", str3, "...UUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU 6\\\\u0020 6\\\\u0020 6              ");
    }

    @Test
    public void test36608() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest73.test36608");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOf("61UUUUUUUUUUUUUUaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa...61UUUUUUUUUUUUUU", "61aaaaaaaaaaaaaaaaaaaaaaaaaaa33333333333333333333", 39);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test36609() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest73.test36609");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("\\u0075", "\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061", 0);
        java.lang.String[] strArray5 = org.apache.commons.lang3.StringUtils.stripAll(strArray3, "23hi!hi!hi!");
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertNotNull(strArray5);
    }

    @Test
    public void test36610() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest73.test36610");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isEmpty((java.lang.CharSequence) "023\\u0023aaaaaaa2222222222222222222222222222222222222222222222222222222222222222222222222222");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test36611() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest73.test36611");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trimToEmpty("#11#1111\n\n\n\n\n\n\n\n");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "#11#1111" + "'", str1, "#11#1111");
    }

    @Test
    public void test36612() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest73.test36612");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.substring("A\\3200U\\323200U\\3200U\\3200U\\3200U\\3200U\\3200U\\3200U\\323200U\\320075", 112, 105);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test36613() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest73.test36613");
        java.util.Locale locale1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.apache.commons.lang3.StringUtils.lowerCase("001!IH013333333333333333333333333333333333333333333333333333333333333333333333333333333", locale1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test36614() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest73.test36614");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeStart("0200iui\\", "333333333333333333333333333333333333333333333333333333333   ...333333333333333333333333333333333333333333333333333333333");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "0200iui\\" + "'", str2, "0200iui\\");
    }

    @Test
    public void test36615() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest73.test36615");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu", "61Uaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa 61aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaUUUUUUUUUUUUUUUUUUUUU");
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test36616() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest73.test36616");
        int int3 = org.apache.commons.lang3.StringUtils.indexOf("5544u4UUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU", 367, 23);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test36617() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest73.test36617");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAllLowerCase((java.lang.CharSequence) "0023");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test36618() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest73.test36618");
        int int3 = org.apache.commons.lang3.StringUtils.lastOrdinalIndexOf("...    ...\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\", "6666aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", 9);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test36619() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest73.test36619");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.split("                                                                                                                                                                                                                                                       aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa 61aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", " 61 61 61 61 61 61 61 6uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu", 73);
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void test36620() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest73.test36620");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa...", "111111111111111111111U6111111111111\r\r\r\r\r\r\rAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test36621() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest73.test36621");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.leftPad("UUUUUUUUUUUUUUUUUUUUUUUUUU16\\16 \\16", (int) 'c', '\r');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\rUUUUUUUUUUUUUUUUUUUUUUUUUU16\\16 \\16" + "'", str3, "\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\rUUUUUUUUUUUUUUUUUUUUUUUUUU16\\16 \\16");
    }

    @Test
    public void test36622() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest73.test36622");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringAfter("0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023................................", "...3\\U0##########333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test36623() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest73.test36623");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens(" 64 64 64 64 64 64 64 6uuuuuuuuuuuuuuuuuu...", "61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61......61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61", 97);
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void test36624() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest73.test36624");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.uncapitalize((java.lang.CharSequence) "\\u0023\\");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "\\u0023\\" + "'", str1, "\\u0023\\");
    }

    @Test
    public void test36625() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest73.test36625");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripToEmpty("\\u0023\\u00\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U002UUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "\\u0023\\u00\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U002UUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU" + "'", str1, "\\u0023\\u00\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U002UUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU");
    }

    @Test
    public void test36626() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest73.test36626");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfIgnoreCase("\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\...h    h...aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaau61\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\...h    h...aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaau61\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\...h    h...aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaau61\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\...h    h...aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaau61\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\...h    h", "HHHHHHHHHHHHHHHHH");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test36627() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest73.test36627");
        int int3 = org.apache.commons.lang3.StringUtils.indexOf("\\u000d", 167, 22);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test36628() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest73.test36628");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.abbreviate("u......\\u004\\u004\\u004\\u004\\u004\\u004\\u004\\u004\\u004\\u004\\u004\\u004\\u004\\u004\\u00", 936, 76);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "...u004\\u004\\u004\\u004\\u004\\u004\\u004\\u004\\u004\\u004\\u004\\u004\\u004\\u004\\u00" + "'", str3, "...u004\\u004\\u004\\u004\\u004\\u004\\u004\\u004\\u004\\u004\\u004\\u004\\u004\\u004\\u00");
    }

    @Test
    public void test36629() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest73.test36629");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeStart("                                                                                               !ih!ih!ih", "               ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                                                                !ih!ih!ih" + "'", str2, "                                                                                !ih!ih!ih");
    }

    @Test
    public void test36630() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest73.test36630");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.endsWith("    \n", "...3\\U0##########");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test36631() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest73.test36631");
        int int2 = org.apache.commons.lang3.CharUtils.toIntValue('a', 71);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 71 + "'", int2 == 71);
    }

    @Test
    public void test36632() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest73.test36632");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.leftPad("i!                                                                                   U0023                          ", 695, " 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ U61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + " 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ U61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\  61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ U61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\  61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ U61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\  61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ U61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\  61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ U61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\  61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ U61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\  61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61i!                                                                                   U0023                          " + "'", str3, " 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ U61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\  61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ U61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\  61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ U61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\  61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ U61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\  61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ U61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\  61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ U61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\  61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61i!                                                                                   U0023                          ");
    }

    @Test
    public void test36633() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest73.test36633");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.defaultIfEmpty("\\u003\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023u                                                          ", "23\\u23\\u23\\u23\\u23\\u23\\u23\\u23U6                                       23\\u23\\u23\\u23\\u23\\u23\\u23\\u23U6                                       23\\u23\\u23\\u23\\u23\\u23\\u23\\u23U6                                       ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\\u003\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023u                                                          " + "'", str2, "\\u003\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023u                                                          ");
    }

    @Test
    public void test36634() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest73.test36634");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.equals((java.lang.CharSequence) "\\u005                                                                                          \\u0\\u005                                                                                          \\u0\\u0023\\U\\u005                                                                                          \\u0\\u005                                                                                          \\u0\\u005", (java.lang.CharSequence) "  uuuuuuu                                                    ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test36635() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest73.test36635");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAllLowerCase((java.lang.CharSequence) "3200u\\3200u\\3200\\u003\\u0023\\u0023\\u0023\\u0023\\u0023\\u00233200u\\3200u\\3200");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test36636() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest73.test36636");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.abbreviate("                                 A\\u0023AAAAAAAAAAAAA                                  ", 78);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                 A\\u0023AAAAAAAAAAAAA                      ..." + "'", str2, "                                 A\\u0023AAAAAAAAAAAAA                      ...");
    }

    @Test
    public void test36637() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest73.test36637");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitByCharacterType("...... \\u0041\\u0041\\u0041\\u0041\\u0041\\u0041\\u0041\\u0041\\u0041\\u0041\\u004 61\\\\uu ...... \\u0041\\u0041\\u00u61\\u0020\\u0020\\u0020\\u0020\\u0020\\u00");
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test36638() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest73.test36638");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trimToNull("UUUUUU 6\\\\U0020 6\\\\U0020 6              ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "UUUUUU 6\\\\U0020 6\\\\U0020 6" + "'", str1, "UUUUUU 6\\\\U0020 6\\\\U0020 6");
    }

    @Test
    public void test36639() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest73.test36639");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("                                                                             11111111111111111111111111111111111                                                                             ", "61AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA", 46);
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void test36640() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest73.test36640");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isEmpty((java.lang.CharSequence) "\\4  ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test36641() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest73.test36641");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeStart("\\u003\\u003\\u0                                         \n\n1                                                    \n\n1     ", "u003                    ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\\u003\\u003\\u0                                         \n\n1                                                    \n\n1     " + "'", str2, "\\u003\\u003\\u0                                         \n\n1                                                    \n\n1     ");
    }

    @Test
    public void test36642() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest73.test36642");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.leftPad("   \\u003 ", 62);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                                        \\u003 " + "'", str2, "                                                        \\u003 ");
    }

    @Test
    public void test36643() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest73.test36643");
        int int3 = org.apache.commons.lang3.StringUtils.indexOf("                                         \n\n1                 AAAA   61 AAAAAAAAAAAAAAAAAAAAAAAAAAAA", 260, (int) 'u');
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test36644() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest73.test36644");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isWhitespace((java.lang.CharSequence) "200U\\u200U\\u200U\\u200U\\u200U\\u200U\\u200U\\u200U\\u261\\ u61\\ 61\\ 61\\ 61\\ 61\\  61\\ u61\\ 61\\ 61\\ 61\\ 61\\");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test36645() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest73.test36645");
        int int2 = org.apache.commons.lang3.StringUtils.indexOf("AAAA51AAAAAAAA51AAAAAAA1\\U23\\u0023\\u...AAAAAA51AAAAAAA", "...U0023\\U00\\u0041\\U61\\U0023\\U00\\u0041\\U61\\U0023\\U00\\u0041\\U61\\U0023\\U00\\u0041\\U61\\U0023\\U00\\u0041\\U61\\U0023\\U00\\u0041\\U61\\U0023\\U00\\u0041\\U61\\U0023\\U00\\u0041\\U...");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test36646() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest73.test36646");
        int int3 = org.apache.commons.lang3.StringUtils.lastOrdinalIndexOf("      c1111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111      ", "61UUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU                                  3200", 88);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test36647() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest73.test36647");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.reverseDelimited("H                                                                ", 'c');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "H                                                                " + "'", str2, "H                                                                ");
    }

    @Test
    public void test36648() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest73.test36648");
        int int2 = org.apache.commons.lang3.StringUtils.countMatches("                                             ...", "\\U0023\\U0023\\U0023\\U0023\\U002\\U0023\\U0023\\U0023\\U0023\\U002         ...h    h...aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa 61\\U0023\\U0023\\U0023\\U0023\\U002\\U0023\\U0023\\U0023\\U0023\\U002            ...h    h...aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa 61\\U0023\\U0023\\U0023\\U0023\\U002\\U0023\\U0023\\U0023\\U0023\\U002            ...h    h...aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa 61\\U0023\\U0023\\U0023\\U0023\\U002\\U0023\\U0023\\U0023\\U0023\\U002            ...h    h...aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa 61\\U0023\\U0023\\U0023\\U0023\\U002\\U0023\\U0023\\U0023\\U0023\\U002            ...h    h");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test36649() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest73.test36649");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfDifference((java.lang.CharSequence) "                            AAAAAAAAAAAAA3200u\\A  ...", (java.lang.CharSequence) "...\\3200U\\3200U\\3200U\\3200U\\3200U\\3200U000000000");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test36650() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest73.test36650");
        java.lang.String[] strArray5 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("\n\n1", "0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023    3    ", 86);
        java.lang.String[] strArray9 = org.apache.commons.lang3.StringUtils.split("A000U\\", "aaaa                                                ", 96);
        java.lang.String str10 = org.apache.commons.lang3.StringUtils.replaceEach(" 61\\", strArray5, strArray9);
        java.lang.String[] strArray13 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("\\4\n\n", "         aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaA");
        java.lang.String[] strArray14 = org.apache.commons.lang3.StringUtils.stripAll(strArray13);
        java.lang.String str15 = org.apache.commons.lang3.StringUtils.replaceEach("                                                                                                                     ", strArray9, strArray13);
        java.lang.String str17 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray13, "23\\0023\\0023\\0023\\0023\\0023\\0023\\0023");
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertNotNull(strArray9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + " 61\\" + "'", str10, " 61\\");
        org.junit.Assert.assertNotNull(strArray13);
        org.junit.Assert.assertNotNull(strArray14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "                                                                                                                     " + "'", str15, "                                                                                                                     ");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "\\4\n\n" + "'", str17, "\\4\n\n");
    }

    @Test
    public void test36651() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest73.test36651");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.defaultIfEmpty("                                      \\u0023\\u00\\u0041\\u0023", "                                                                                              ...");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                      \\u0023\\u00\\u0041\\u0023" + "'", str2, "                                      \\u0023\\u00\\u0041\\u0023");
    }

    @Test
    public void test36652() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest73.test36652");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("1111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111", "        \\u0034         ");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.stripAll(strArray2);
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray2);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "1111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111" + "'", str4, "1111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111");
    }

    @Test
    public void test36653() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest73.test36653");
        int int3 = org.apache.commons.lang3.StringUtils.lastOrdinalIndexOf("032\\40032\\40032\\40032\\40032\\40032\\40032\\40032\\40032\\40032\\40032\\40032\\40032\\40032\\40032\\40032\\40032\\40032\\40032\\40032", "\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061...", (int) (short) 100);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test36654() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest73.test36654");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.split("5c11111111111111111111111111111111111111111111111111111111111111111111111111111111111111111", "\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\...h    h...", 0);
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.concat((java.lang.Object[]) strArray3);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "5c11111111111111111111111111111111111111111111111111111111111111111111111111111111111111111" + "'", str4, "5c11111111111111111111111111111111111111111111111111111111111111111111111111111111111111111");
    }

    @Test
    public void test36655() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest73.test36655");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceChars("       22222\\U0023\\U00\\u0041\\U00232222", " ...", "         0000000000000000000000000000000000000000000000000\\u0037         ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "       22222\\U0023\\U00\\u0041\\U00232222" + "'", str3, "       22222\\U0023\\U00\\u0041\\U00232222");
    }

    @Test
    public void test36656() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest73.test36656");
        int int2 = org.apache.commons.lang3.StringUtils.countMatches("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "23\\u0023\\u0023\\u0023\\u0023\\u0023");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test36657() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest73.test36657");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substring("                        \\uhi!hi!hi!                         ", 7);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                 \\uhi!hi!hi!                         " + "'", str2, "                 \\uhi!hi!hi!                         ");
    }

    @Test
    public void test36658() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest73.test36658");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substring("       11111111111111..", 75);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test36659() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest73.test36659");
        java.util.Locale locale1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.apache.commons.lang3.StringUtils.lowerCase("                                                                        ", locale1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test36660() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest73.test36660");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitByCharacterTypeCamelCase("                                       AAAAAAAAAAAAA3200u\\A                          ...6666666666666666661aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa666666666666666666666666666666");
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test36661() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest73.test36661");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substring("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaau623\\u23\\u23\\u2AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA", 137);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA" + "'", str2, "AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA");
    }

    @Test
    public void test36662() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest73.test36662");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfAnyBut("61\\\\U0020 61\\\\U0020 6 61\\\\U0020 61", "                                  AAAAAAAAAAAAA3200u\\A                                 ");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test36663() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest73.test36663");
        char[] charArray7 = new char[] { ' ' };
        int int8 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "10hi!100", charArray7);
        boolean boolean9 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "\\U0023", charArray7);
        boolean boolean10 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "\\u0075", charArray7);
        boolean boolean11 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "23\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023U6", charArray7);
        boolean boolean12 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "0023\\u0023\\u0023\\u0023\\u0023\\u0044444444444444444444444444444444444444444444444444444444444444444", charArray7);
        int int13 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "aaaaaaaaaaaaaaaaaaaaaaac5aaaaaaaaaaaaaaaaaaaaa\\u", charArray7);
        org.junit.Assert.assertNotNull(charArray7);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray7), " ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray7), " ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray7), "[ ]");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
    }

    @Test
    public void test36664() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest73.test36664");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.stripStart("3200U\\3200U\\3200U\\3200U\\3200U\\3200U\\3200U\\3200U\\3261\\U61\\61\\61\\61\\61\\61\\U61\\61\\61\\61\\61\\", "                                                                                                                                                                                    16AAAAAAAAAAAAAAAAAAAAAAAAAAAA");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "3200U\\3200U\\3200U\\3200U\\3200U\\3200U\\3200U\\3200U\\3261\\U61\\61\\61\\61\\61\\61\\U61\\61\\61\\61\\61\\" + "'", str2, "3200U\\3200U\\3200U\\3200U\\3200U\\3200U\\3200U\\3200U\\3261\\U61\\61\\61\\61\\61\\61\\U61\\61\\61\\61\\61\\");
    }

    @Test
    public void test36665() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest73.test36665");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("uuu \\16 \\16 \\16 \\16 \\16 \\16 \\16 \\16 \\16 \\16 \\16");
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test36666() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest73.test36666");
        int int2 = org.apache.commons.lang3.StringUtils.getLevenshteinDistance((java.lang.CharSequence) "UUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\", (java.lang.CharSequence) "1111111");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 101 + "'", int2 == 101);
    }

    @Test
    public void test36667() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest73.test36667");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeEndIgnoreCase("u003aaaaaa", "\n\n\n\n\n1\n\n\n\n\n1\n\n\n\n\n1\n\n\n\n\n1\n\n\n\n\n1\n\n\n\n\n1\n\n\n\n\n1\n\n\n\n\n1\n\n\n\n\n1\n\n\n\n\n1\n\n\n\n\n1\n\n\n\n\n1\n\n\n\n\n1\n\n\n\n\n1\n\n\n\n\n1\n\n\n\n\n1\n\n\n\n\n1\n\n\n\n\n1\n\n\n\n\n1\n\n\n\n\n1\n\n\n\n\n1\n\n\n\n\n1\n\n\n\n\n1\n\n\n\n\n1\n\n\n\n\n1\n\n\n\n\n1\n\n\n\n\n1\n\n\n\n\n1\n\n\n\n\n1\n\n\n\n\n1\n\n\n\n\n1\n\n\n\n\n1\n\n\n\n\n1\n\n\n\n\n1\n\n\n\n\n1\n\n\n\n\n1\n\n\n\n\n1\n\n\n\n\n1\n\n\n\n\n1\n\n\n\n\n1\n\n\n\n\n1\n\n\n\n\n1\n\n\n\n\n1\n\n\n\n\n1\n\n\n\n\n1\n\n\n\n\n1\n\n\n\n\n1\n\n\n\n\n");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "u003aaaaaa" + "'", str2, "u003aaaaaa");
    }

    @Test
    public void test36668() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest73.test36668");
        java.util.Locale locale1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.apache.commons.lang3.StringUtils.lowerCase("61\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\61", locale1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test36669() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest73.test36669");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.split("", "...uuuuuuuuuu");
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test36670() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest73.test36670");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.split(" 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\                   \\U0033                    61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\", 'C');
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test36671() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest73.test36671");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNumericSpace((java.lang.CharSequence) "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                \\u0032");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test36672() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest73.test36672");
        int int3 = org.apache.commons.lang3.StringUtils.indexOf("                                                                                                                                             0023\\0023\\0023\\\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\nU\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n                                                                                                                                             ", 237, 1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test36673() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest73.test36673");
        int int3 = org.apache.commons.lang3.StringUtils.indexOf("UUUUUUUUUUUUUUUU ...                         UUUUUUUUUUUUUUUU", (int) '\\', 300);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test36674() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest73.test36674");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.equalsIgnoreCase("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "...UUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU 6\\\\u0020 6\\\\u0020 6");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test36675() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest73.test36675");
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("aaaaaaa      ", "0023", (-1));
        int int5 = org.apache.commons.lang3.StringUtils.lastIndexOfAny("\\40032\\40032\\40032\\40032\\40032\\40032\\40032\\40032\\40032\\40032\\40032\\40032\\40032\\40032\\40032\\40032\\40032\\40032\\40032\\40032\\40032\\40032\\40032\\40032\\40032\\40032\\40032\\40032\\40032\\40032\\40032\\40032\\40032\\40032\\40032\\40032\\40032\\40032\\40032\\40032\\40032\\40032\\40032\\40032\\40032\\40032\\40032\\40032", strArray4);
        int int6 = org.apache.commons.lang3.StringUtils.indexOfDifference((java.lang.CharSequence[]) strArray4);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
    }

    @Test
    public void test36676() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest73.test36676");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlpha((java.lang.CharSequence) "533333333333333333333333333333\\40032333333333333333333333333333333C");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test36677() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest73.test36677");
        java.util.Locale locale1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.apache.commons.lang3.StringUtils.lowerCase("###########U005cu0u005cu0u0023Uu005cu0u005cu0###########", locale1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test36678() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest73.test36678");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replace("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa61aaaaaaaaaaaaaaaaaaaaaaaaaaaa", "CCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCC\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023", "61UUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU                                  3200U          ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa61aaaaaaaaaaaaaaaaaaaaaaaaaaaa" + "'", str3, "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa61aaaaaaaaaaaaaaaaaaaaaaaaaaaa");
    }

    @Test
    public void test36679() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest73.test36679");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "66666666666666666666666666666666666666666666666666666       22222\\u0023\\u00\\u0041\\u002322222", "U\\32");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test36680() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest73.test36680");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.uncapitalize((java.lang.CharSequence) "20\\U0020\\U0020\\U0020\\U00   ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "20\\U0020\\U0020\\U0020\\U00   " + "'", str1, "20\\U0020\\U0020\\U0020\\U00   ");
    }

    @Test
    public void test36681() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest73.test36681");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeStartIgnoreCase("1161\\", "   u\\2u\\2u\\2u\\2u\\2u\\2u\\2u\\2u\\2u\\2u\\2u\\2u\\2u\\2u\\\n16u    ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "1161\\" + "'", str2, "1161\\");
    }

    @Test
    public void test36682() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest73.test36682");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("555555555555555", "\\u0061\\u0061\\u\\U0023\\u0061\\u0061\\u   2");
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test36683() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest73.test36683");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.upperCase("\\U002066666666666666666666666666666666666666");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "\\U002066666666666666666666666666666666666666" + "'", str1, "\\U002066666666666666666666666666666666666666");
    }

    @Test
    public void test36684() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest73.test36684");
        int int1 = org.apache.commons.lang3.StringUtils.length((java.lang.CharSequence) "    61        61        61        61        61        61        61        61        61        61        61        61        61   ");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 129 + "'", int1 == 129);
    }

    @Test
    public void test36685() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest73.test36685");
        char[] charArray1 = null;
        int int2 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "61\\ u61\\ 61\\ 61\\ 61\\ 61\\ 61\\ u61\\ 61\\ 61\\ 61\\ 61\\", charArray1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test36686() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest73.test36686");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.split("Aaaaaaaaaaaaa...u0020u0020u0020u0020u0020u0020u0020u0020u0020...        ");
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test36687() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest73.test36687");
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("1111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111", "\\", (int) '\r');
        int int5 = org.apache.commons.lang3.StringUtils.indexOfAny("UUUUUUUUUUUUUUUUUUUUUUUUU...", strArray4);
        int int6 = org.apache.commons.lang3.StringUtils.indexOfDifference((java.lang.CharSequence[]) strArray4);
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray4, "");
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "1111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111" + "'", str8, "1111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111");
    }

    @Test
    public void test36688() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest73.test36688");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.center("AAAA...aaaaaa                             hhhhhhhhhhhhhhhhhaaaaaa                             hhhhhh", 300, "\\u0068");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\\u0068\\u0068\\u0068\\u0068\\u0068\\u0068\\u0068\\u0068\\u0068\\u0068\\u0068\\u0068\\u0068\\u0068\\u0068\\u0068\\u00AAAA...aaaaaa                             hhhhhhhhhhhhhhhhhaaaaaa                             hhhhhh\\u0068\\u0068\\u0068\\u0068\\u0068\\u0068\\u0068\\u0068\\u0068\\u0068\\u0068\\u0068\\u0068\\u0068\\u0068\\u0068\\u00" + "'", str3, "\\u0068\\u0068\\u0068\\u0068\\u0068\\u0068\\u0068\\u0068\\u0068\\u0068\\u0068\\u0068\\u0068\\u0068\\u0068\\u0068\\u00AAAA...aaaaaa                             hhhhhhhhhhhhhhhhhaaaaaa                             hhhhhh\\u0068\\u0068\\u0068\\u0068\\u0068\\u0068\\u0068\\u0068\\u0068\\u0068\\u0068\\u0068\\u0068\\u0068\\u0068\\u0068\\u00");
    }

    @Test
    public void test36689() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest73.test36689");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.defaultString("u061u061061u0061u061u061u061u061", "...023\\U0023\\U00237575757575757575757575757575757575757");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "u061u061061u0061u061u061u061u061" + "'", str2, "u061u061061u0061u061u061u061u061");
    }

    @Test
    public void test36690() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest73.test36690");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.stripEnd(" 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\U", "\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\iiiiiiii\\u");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + " 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\U" + "'", str2, " 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\U");
    }

    @Test
    public void test36691() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest73.test36691");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsAny("\\u005c\\u00", "023\\u0023       aaaaaaauuuuuuuuu");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test36692() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest73.test36692");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "i                                                                                                           ", "61\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 61");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
    }

    @Test
    public void test36693() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest73.test36693");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNotBlank((java.lang.CharSequence) "111111111111111111111111111111111111111111111...");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test36694() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest73.test36694");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.split("11111111111U0023#U0023#U0023#U0023#U0023#U0023#U0023", "!ih16\\16\\16\\16\\16\\16\\16\\16\\16\\16\\16\\16U\\16\\16\\16\\16\\16\\16\\16\\16\\16\\16\\16   \n\n\n\n\n");
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.concatWith("\\U003", (java.lang.Object[]) strArray3);
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray3, "u002311111                             u002311111                             u002311111                             u002311111                             u0011111                             311111                             u0011111                             311111                             u0011111                             311111                             u0011111                             311111                             u0011111                             311111                             u0011111                             311111                             u0011111                             311111                             u0011111                             311111                             u002311111                             u002311111                             u002311111                             u002311111                             u", 268, 120);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "0023#\\U0030023#\\U0030023#\\U0030023#\\U0030023#\\U0030023#\\U0030023" + "'", str4, "0023#\\U0030023#\\U0030023#\\U0030023#\\U0030023#\\U0030023#\\U0030023");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test36695() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest73.test36695");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceChars("...001600000000160000000016000000001600000000160000000016000000001600000000160000000016", "                                 \\U0023\\U00\\u0041\\U                                   1\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 6                                                                                                                                                                                                                                                                       ", "0023\\u0023\\u0023\\ U");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "..." + "'", str3, "...");
    }

    @Test
    public void test36696() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest73.test36696");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphanumericSpace((java.lang.CharSequence) "\\u003\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023                                                  ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test36697() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest73.test36697");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceChars("", '2', 'a');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test36698() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest73.test36698");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replace("3\\U002375757575757575757575757575757575757575757570U\\aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa...", "   2     ...                                ...    ", "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "3\\U002375757575757575757575757575757575757575757570U\\aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa..." + "'", str3, "3\\U002375757575757575757575757575757575757575757570U\\aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa...");
    }

    @Test
    public void test36699() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest73.test36699");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.substringsBetween("AAAAAAAAAAAAAAUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU3200UAAAAAAAAAAAAAA", "\\16 \\1616 \\16 \\1616 \\16 \\1616 \\16 \\16 \\1616 \\16 \\1616 \\16 \\1616 \\16 \\16 \\1616 \\16 \\1616 \\16 \\1616 \\16 \\1", "1\\ 61\\ ...                                A\\u2AAAAAAAAAAAAAau\\                                                                 A\\u");
        org.junit.Assert.assertNull(strArray3);
    }

    @Test
    public void test36700() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest73.test36700");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("                                         \n\n1                                                    \n\n", "6666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666", 155);
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void test36701() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest73.test36701");
        char[] charArray1 = null;
        int int2 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "\\u005c\\u0\\u005c\\u0\\u0023\\U\\u005c\\u0\\u005c\\u0\\u005", charArray1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test36702() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest73.test36702");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.contains("                                                                                                                                                                                                                                                                                                                                                                                 U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023                                                  ", 107);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test36703() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest73.test36703");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isWhitespace((java.lang.CharSequence) "75        75        75        75        75        75        75        75        75        75        75        75        75        75        75        75        75        75        75        75        75        75        75        75        75        75        75        75        75        75        75        75        75        75        75        75        75        75        75        75        75        75        75        75        75        75        75        75        75        75        75        75        75        75        75        75        75        75        75        75        75        75        75        75        75        75        75        75        75        75        75        75        75        75        75        75        75        75        75        75        75        75        75        75        75");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test36704() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest73.test36704");
        int int3 = org.apache.commons.lang3.StringUtils.indexOf("                                 A\\u0023AAAAAAAAAAAAAa000u\\                                 3", "111575757575757575757575757575757575757575757575757575757573200##0U##0\\##03200##0U##0\\##0320##0...", 120);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test36705() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest73.test36705");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator(" 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ u61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ ", " 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ U61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61");
        java.lang.String[] strArray7 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("UUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\", "20\\u0020\\u0020\\u0020\\u00    \\U002322222\\U002322222\\U002322222\\U002322222\\U002322222\\U002322222", 49);
        java.lang.String[] strArray8 = org.apache.commons.lang3.StringUtils.stripAll(strArray7);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str9 = org.apache.commons.lang3.StringUtils.replaceEach("\\u0034666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666", strArray3, strArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Search and Replace array lengths don't match: 1 vs 49");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertNotNull(strArray8);
    }

    @Test
    public void test36706() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest73.test36706");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.startsWithIgnoreCase("23\\u U   6", "161\\161\\161\\161\\161\\161\\u0023                                              6u\\u0023\\1111111111111111111111111111");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test36707() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest73.test36707");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("\\u0055                   23\\u0023\\u0023        75023\\u0023\\u001111111111111111111111111", "23\\u0023\\u0023\\u0023\\u0023\\u0023AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA");
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test36708() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest73.test36708");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trim(" 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ U61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ U61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\" + "'", str1, "61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ U61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\");
    }

    @Test
    public void test36709() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest73.test36709");
        java.util.Locale locale1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.apache.commons.lang3.StringUtils.lowerCase("                            uuuuuuuuuuuuuuuuuu", locale1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test36710() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest73.test36710");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.split("  5757575757575757575757575757575757575757575757575757575732U\\32U\\32U\\32U\\32U\\32U\\32U\\", "    2222222222222222222222222222222222UUUUUUUUUUUUUUUUUUUUUUUUU...UUUUUUUUUUUUUUUUUUUUUUUUU...UUUUUUUUUUUUUUUUUUUUUUU");
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test36711() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest73.test36711");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeEnd("...                                 ...", "\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0###");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "...                                 ..." + "'", str2, "...                                 ...");
    }

    @Test
    public void test36712() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest73.test36712");
        char char1 = org.apache.commons.lang3.CharUtils.toChar(" 3hi!hi!hi!                                                                          ");
        org.junit.Assert.assertTrue("'" + char1 + "' != '" + ' ' + "'", char1 == ' ');
    }

    @Test
    public void test36713() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest73.test36713");
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.overlay("11111111111111111111111111111111111111111111123\\U0023\\U11111111111111111111111111111111111111111111161", "                                         \n\n1                                        ", 183, 110);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "11111111111111111111111111111111111111111111123\\U0023\\U11111111111111111111111111111111111111111111161                                         \n\n1                                        " + "'", str4, "11111111111111111111111111111111111111111111123\\U0023\\U11111111111111111111111111111111111111111111161                                         \n\n1                                        ");
    }

    @Test
    public void test36714() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest73.test36714");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlpha((java.lang.CharSequence) "\\U0075\\U0075\\U0075\\U0075\\U0075\\U00\\U0023\\U00\\u0041\\U0023                         \\U0075\\U0075\\U0075\\U0075\\U0075\\U007");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test36715() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest73.test36715");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.defaultString("AAAAAAAAAAAAAAAAAAAAAAAAA3AAAAAAAAAAAAAAAAAAAAAAAAAA", "\\U000AAAAAAAAAAAAAA3200U\\A");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "AAAAAAAAAAAAAAAAAAAAAAAAA3AAAAAAAAAAAAAAAAAAAAAAAAAA" + "'", str2, "AAAAAAAAAAAAAAAAAAAAAAAAA3AAAAAAAAAAAAAAAAAAAAAAAAAA");
    }

    @Test
    public void test36716() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest73.test36716");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.remove("uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu0023                  \\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023", '0');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu23                  \\U23\\U23\\U23\\U23\\U23\\U23\\U23" + "'", str2, "uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu23                  \\U23\\U23\\U23\\U23\\U23\\U23\\U23");
    }

    @Test
    public void test36717() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest73.test36717");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.center("\\ 1\\ 1\\ 1\\ 1\\ 1\\ 1\\ 1\\ 1\\ 1\\u", 108, "u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u002323\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u002323\\u");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u00\\ 1\\ 1\\ 1\\ 1\\ 1\\ 1\\ 1\\ 1\\ 1\\uu0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u002" + "'", str3, "u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u00\\ 1\\ 1\\ 1\\ 1\\ 1\\ 1\\ 1\\ 1\\ 1\\uu0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u002");
    }

    @Test
    public void test36718() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest73.test36718");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.split("5555555555555555555555555555555555555555555555555555555555555555555555555555555555  ......  ", '\\');
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray2, '7');
        java.lang.String str6 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray2, "                              ...\r                               ");
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "5555555555555555555555555555555555555555555555555555555555555555555555555555555555  ......  " + "'", str4, "5555555555555555555555555555555555555555555555555555555555555555555555555555555555  ......  ");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "5555555555555555555555555555555555555555555555555555555555555555555555555555555555  ......  " + "'", str6, "5555555555555555555555555555555555555555555555555555555555555555555555555555555555  ......  ");
    }

    @Test
    public void test36719() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest73.test36719");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.split("\\ u61\\ 61\\ 61\\ 61\\ 61");
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test36720() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest73.test36720");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAsciiPrintable((java.lang.CharSequence) "1h!1");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test36721() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest73.test36721");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.strip("\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023          ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023" + "'", str1, "\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023");
    }

    @Test
    public void test36722() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest73.test36722");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAllUpperCase((java.lang.CharSequence) "         61\\ u61\\ 61\\ 61\\ 61\\ 61\\  61\\ u61\\ 61\\ 61\\ 61\\ 61\\ ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test36723() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest73.test36723");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.reverse("uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuc500u\\0u\\0200u\\0200u\\0200u\\0200u\\0200u\\\n###55555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "55555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555###\n\\u0020\\u0020\\u0020\\u0020\\u0020\\u0\\u005cuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu" + "'", str1, "55555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555###\n\\u0020\\u0020\\u0020\\u0020\\u0020\\u0\\u005cuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu");
    }

    @Test
    public void test36724() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest73.test36724");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.rightPad("\\u0061\\u0061\\u\\U0023\\u0061\\u0061\\u", 358, "0000000000000000000000000000000000000000000000000000000000000000000000000000000000000000............................3333333333333333333");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\\u0061\\u0061\\u\\U0023\\u0061\\u0061\\u0000000000000000000000000000000000000000000000000000000000000000000000000000000000000000............................33333333333333333330000000000000000000000000000000000000000000000000000000000000000000000000000000000000000............................3333333333333333333000000000000000000000000000000000000000000000000000000" + "'", str3, "\\u0061\\u0061\\u\\U0023\\u0061\\u0061\\u0000000000000000000000000000000000000000000000000000000000000000000000000000000000000000............................33333333333333333330000000000000000000000000000000000000000000000000000000000000000000000000000000000000000............................3333333333333333333000000000000000000000000000000000000000000000000000000");
    }

    @Test
    public void test36725() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest73.test36725");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.swapCase("\\4003211111111111111111111111111111111111111");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "\\4003211111111111111111111111111111111111111" + "'", str1, "\\4003211111111111111111111111111111111111111");
    }

    @Test
    public void test36726() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest73.test36726");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBetween("                                                                       23  hh23  hh23  hh23  hh23  hh23  hh23  hh23  hh23                                                                       ", "1\\6 1\\6 1\\6 1\\6 1\\6 1\\6 1\\6 1\\6 1\\6 1\\6 1\\6 1\\6 1\\6\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\...hh...1\\6 1\\6 1\\6 1\\6 1\\6 1\\6 1\\6 1\\6 1\\6 1\\6 1\\6 1\\6 1\\6 ");
        org.junit.Assert.assertNull(str2);
    }

    @Test
    public void test36727() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest73.test36727");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.reverseDelimited("                                                                                                                                             0023\\0023\\0023\\\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\nU\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n                                                                                                                                             ", '4');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                                                                                                                             0023\\0023\\0023\\\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\nU\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n                                                                                                                                             " + "'", str2, "                                                                                                                                             0023\\0023\\0023\\\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\nU\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n                                                                                                                                             ");
    }

    @Test
    public void test36728() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest73.test36728");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("                  6666\r\r\r\r\r\r\rAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA", "... 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ ...                                A\\u0023AAAAAAAAAAAAAa000u\\                                                                 A");
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test36729() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest73.test36729");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitByCharacterTypeCamelCase("6");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.stripAll(strArray1);
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test36730() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest73.test36730");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphanumeric((java.lang.CharSequence) "5\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\nu003u0023u0023u0023u0023u0023u0023AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA55");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test36731() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest73.test36731");
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("aaaaaaa      ", "\\u0023", 1);
        java.lang.String str5 = org.apache.commons.lang3.StringUtils.concat((java.lang.Object[]) strArray4);
        java.lang.String[] strArray10 = org.apache.commons.lang3.StringUtils.split("23\\u23\\u23\\u23\\u23\\u23\\u23\\u23U6                                       ", "      aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa 61aaaaaaaaaaaaaaaaaaaaaaaaaaaa", (int) (short) -1);
        java.lang.String[] strArray12 = org.apache.commons.lang3.StringUtils.splitByCharacterType(".....");
        java.lang.String str13 = org.apache.commons.lang3.StringUtils.replaceEachRepeatedly("AAAAAAA", strArray10, strArray12);
        java.lang.String[] strArray15 = org.apache.commons.lang3.StringUtils.stripAll(strArray12, "6");
        java.lang.String str16 = org.apache.commons.lang3.StringUtils.replaceEachRepeatedly("6666AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA", strArray4, strArray15);
        java.lang.String str18 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray4, '4');
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "aaaaaaa      " + "'", str5, "aaaaaaa      ");
        org.junit.Assert.assertNotNull(strArray10);
        org.junit.Assert.assertNotNull(strArray12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "AAAAAAA" + "'", str13, "AAAAAAA");
        org.junit.Assert.assertNotNull(strArray15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "6666AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA" + "'", str16, "6666AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "aaaaaaa      " + "'", str18, "aaaaaaa      ");
    }

    @Test
    public void test36732() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest73.test36732");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isWhitespace((java.lang.CharSequence) "            2");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test36733() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest73.test36733");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.right("", 96);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test36734() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest73.test36734");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOfIgnoreCase("3\\u003\\", "hhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhAAAAAAAhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhh");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test36735() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest73.test36735");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeEndIgnoreCase("1111111111111111111111111111111111111111111113\\u0...aaaaaaaaaaaaaaaaaaahhhhhhhhhhhhhhhhhhhhhhh3200u\\3200u\\3200u\\3200u\\3200u\\                        ", "... 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ u61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "1111111111111111111111111111111111111111111113\\u0...aaaaaaaaaaaaaaaaaaahhhhhhhhhhhhhhhhhhhhhhh3200u\\3200u\\3200u\\3200u\\3200u\\                        " + "'", str2, "1111111111111111111111111111111111111111111113\\u0...aaaaaaaaaaaaaaaaaaahhhhhhhhhhhhhhhhhhhhhhh3200u\\3200u\\3200u\\3200u\\3200u\\                        ");
    }

    @Test
    public void test36736() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest73.test36736");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceOnce("AAAA...aaaaaahhhhhhhhhhhhhhhhhaaaaaahhhhhhhhhhhhhhhh", "                           1\\U00234                                      \\U0023\\U00\\u0           ...                           1\\U00234                                      \\U0023\\U00\\u0           ...                           1\\U00234                                      \\U0023\\U00\\u0           ...                           1\\U00234                                      \\U0023\\U00\\u0           ...                           1\\U00234                                      \\U0023\\U00\\u0           ...                           1\\U00234                       ...HH...", "...02...");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "AAAA...aaaaaahhhhhhhhhhhhhhhhhaaaaaahhhhhhhhhhhhhhhh" + "'", str3, "AAAA...aaaaaahhhhhhhhhhhhhhhhhaaaaaahhhhhhhhhhhhhhhh");
    }

    @Test
    public void test36737() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest73.test36737");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.left("A", 17);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "A" + "'", str2, "A");
    }

    @Test
    public void test36738() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest73.test36738");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isBlank((java.lang.CharSequence) "\\u005                                                                                          \\u0\\u005                                                                                          \\u0\\u0023\\U\\u005                                                                                          \\u0\\u005                                                                                          \\u0\\u005");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test36739() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest73.test36739");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.split("5555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555                                                                                                55555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa61 aaaaaaaaaaaaaaaaaaaaaaaa", 74);
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void test36740() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest73.test36740");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.equalsIgnoreCase("U62 \\U00220\\u0020\\u0020\\u0020\\u00    U62 \\U002                                                          ", "                                                                                                                \\3200u\\3200u\\3200u\\300u\\");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test36741() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest73.test36741");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "111111111111111111111U6111111111111111111111", "\\\\uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa\\\\uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test36742() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest73.test36742");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.difference("                                                                                      3200U\\1400u\\00U\\3200U\\", "#################");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "#################" + "'", str2, "#################");
    }

    @Test
    public void test36743() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest73.test36743");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsAny("  575\\u0037200U\\", "6\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6...\\ 61\\ 61\\61U 61\\ 61\\610020\\ 61\\ 61\\61U 61\\ 61\\610020\\ 61\\ 61\\61U 61\\ 61\\610020\\ 61\\ 61\\61U 61\\ 61\\610020\\ 61\\ 61\\61U 61\\ 61\\610020\\ 61\\ 61\\61U 61\\ 61\\610020\\ 61\\ 61\\61U 61\\ 61\\610020\\ 61\\ 61\\61U 61\\ 61\\610020\\ 61\\ 61\\61U 61\\ 61\\610020\\ 61\\ ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test36744() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest73.test36744");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("###\n\\u003\\u0023\\u0023\\u0023\\###", "iiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiii");
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test36745() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest73.test36745");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("000000000000000000aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaau6000000000000000000", "111111111aaaa\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\\\U0023\\U0023\\U0023\\U0023\\U0");
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test36746() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest73.test36746");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ uuu", "#################################################\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test36747() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest73.test36747");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAllUpperCase((java.lang.CharSequence) "                                                         u0023\\u002u0023\\u002u0023\\u002u0");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test36748() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest73.test36748");
        char[] charArray7 = new char[] { ' ' };
        int int8 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "10hi!100", charArray7);
        int int9 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "\\U0023", charArray7);
        int int10 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "\\u005c", charArray7);
        int int11 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "U61\n\\U0020\\U0020\\U0020\\U0020\\U0020\\U0020\\U0020\\U0020\\U0020\\U0020", charArray7);
        boolean boolean12 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "                            aaaaaaaaaaaaa3200\\a                                ", charArray7);
        boolean boolean13 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "222222222222222222222222222222222222222222222U6                                          aaaaaaaaaaaaaaa", charArray7);
        org.junit.Assert.assertNotNull(charArray7);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray7), " ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray7), " ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray7), "[ ]");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test36749() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest73.test36749");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023    ");
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test36750() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest73.test36750");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("5\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\nu003u0023u0023u0023u0023u0023u0023AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA55", "51", 13);
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void test36751() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest73.test36751");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceOnce("  \\005C                                                                                                                                                                      ", "...6666666666666666666666666666666666666666666\r\r\r\r\r\r\r\r", "                                   ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "  \\005C                                                                                                                                                                      " + "'", str3, "  \\005C                                                                                                                                                                      ");
    }

    @Test
    public void test36752() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest73.test36752");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceOnce("H          AAAAAA\\U000D\\U000D\\U000D\\U000D\\U000D\\U000A\\U0023AAAAAAAAAAAAAA000U\\", "  2  UUUUU  2  UUUUU  2  UUUUU  2  UUUUU  2  UUUUU  2  UUUUU  2  UUUUU  2  UUUUU  2  UUUUU  2  UUUU                                                         u0023\\u002u0023\\u002u0023\\u002u0  2  UUUUU  2  UUUUU  2  UUUUU  2  UUUUU  2  UUUUU  2  UUUUU  2  UUUUU  2  UUUUU  2  UUUUU  2  UUUUU", "UUUUUUUUUUUUUUUUUUUUUUUUUUUU...11111111111111111111111111111111111111111111111111111111");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "H          AAAAAA\\U000D\\U000D\\U000D\\U000D\\U000D\\U000A\\U0023AAAAAAAAAAAAAA000U\\" + "'", str3, "H          AAAAAA\\U000D\\U000D\\U000D\\U000D\\U000D\\U000A\\U0023AAAAAAAAAAAAAA000U\\");
    }

    @Test
    public void test36753() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest73.test36753");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("23\\u0023\\u0023323\\u0023\\u0023                                                               ", "4444444444444444444444444444444444444   ...4444444444444444444444444444444444444", 92);
        java.lang.String str5 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray3, '5');
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "23\\u0023\\u0023323\\u0023\\u0023                                                               " + "'", str5, "23\\u0023\\u0023323\\u0023\\u0023                                                               ");
    }

    @Test
    public void test36754() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest73.test36754");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.abbreviate("6\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r", 339);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "6\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r" + "'", str2, "6\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r");
    }

    @Test
    public void test36755() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest73.test36755");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isWhitespace((java.lang.CharSequence) "    u0034                                                                                          ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test36756() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest73.test36756");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBetween("533333333333333333333333333333\\40032333333333333333333333333333333C", "75 ...");
        org.junit.Assert.assertNull(str2);
    }

    @Test
    public void test36757() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest73.test36757");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.swapCase("...");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "..." + "'", str1, "...");
    }

    @Test
    public void test36758() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest73.test36758");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.stripStart("                                       ...h    h...aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa 61                                          ...h    h...aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa 61                                          ...h    h...aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa 61                                          ...h    h...aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa 61                                          ...h    h", "1hi!hi!hi!00000000000000000000000000000000000000000000000000000000000000000000000000");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                       ...h    h...aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa 61                                          ...h    h...aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa 61                                          ...h    h...aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa 61                                          ...h    h...aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa 61                                          ...h    h" + "'", str2, "                                       ...h    h...aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa 61                                          ...h    h...aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa 61                                          ...h    h...aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa 61                                          ...h    h...aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa 61                                          ...h    h");
    }

    @Test
    public void test36759() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest73.test36759");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNumeric((java.lang.CharSequence) "23\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023                                        ...");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test36760() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest73.test36760");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.mid("61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61...... 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ ...", 76, 90);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + " 61\\ 61\\ ..." + "'", str3, " 61\\ 61\\ ...");
    }

    @Test
    public void test36761() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest73.test36761");
        int int3 = org.apache.commons.lang3.StringUtils.lastOrdinalIndexOf("      c1111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111      ", "CCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCChhhhhhhhhhhhhUUUUUUUhhhhhhhhhhhhhUUUUUUUhhhhhhhhhhhhhUUUUUUUhhhhhhhhhhhhhUUUUUUUhhhhhhhhhhhhhUUUUUUUhhhhhhhhhhhhhUUUUUUUhhhhhhhhhhhhhUUUUUUUhhhhhhhhhhhhhUUUUUUUhhhhhhhhhhhhhUUUUUUUhhhhhhhhhhhhhUUUUUUUhhhhhhhhhhhhhUUUUUUUhhhhhhhhhhhhhUUUUUUUhhhhhhhhhhhhhUUUUUUUCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCC", 255);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test36762() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest73.test36762");
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.overlay(" 61..11111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111", "23U0023\\U0023\\U\\4003U0023\\U0023\\U0##########u00", 11, 241);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + " 61..11111123U0023\\U0023\\U\\4003U0023\\U0023\\U0##########u00111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111" + "'", str4, " 61..11111123U0023\\U0023\\U\\4003U0023\\U0023\\U0##########u00111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111");
    }

    @Test
    public void test36763() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest73.test36763");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.split("...0U\\3200U\\3200U\\3200U\\3200U\\3200U\\3200U\\3200U\\...0U\\3200U\\3...", "\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\naaa\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\naaa\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\naaa\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\naaa\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\naaa\n\n   2");
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test36764() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest73.test36764");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.lowerCase("23\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u002");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "23\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u002" + "'", str1, "23\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u002");
    }

    @Test
    public void test36765() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest73.test36765");
        java.lang.String[] strArray5 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("\\u0035", "...h    h...", (int) '1');
        boolean boolean6 = org.apache.commons.lang3.StringUtils.endsWithAny("", strArray5);
        java.lang.String[] strArray10 = org.apache.commons.lang3.StringUtils.split("                                                                                                    ");
        java.lang.String[] strArray11 = org.apache.commons.lang3.StringUtils.stripAll(strArray10);
        java.lang.String[] strArray15 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("10hi!100", "10hi!100", (int) (short) 100);
        java.lang.String str16 = org.apache.commons.lang3.StringUtils.replaceEachRepeatedly("\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061", strArray10, strArray15);
        java.lang.String[] strArray18 = org.apache.commons.lang3.StringUtils.split("\\u0061");
        java.lang.String str19 = org.apache.commons.lang3.StringUtils.replaceEach("61", strArray10, strArray18);
        java.lang.String str20 = org.apache.commons.lang3.StringUtils.replaceEachRepeatedly("61uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu", strArray5, strArray10);
        java.lang.String str21 = org.apache.commons.lang3.StringUtils.concat((java.lang.Object[]) strArray5);
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(strArray10);
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertNotNull(strArray15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061" + "'", str16, "\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061");
        org.junit.Assert.assertNotNull(strArray18);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "61" + "'", str19, "61");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "61uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu" + "'", str20, "61uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "\\u0035" + "'", str21, "\\u0035");
    }

    @Test
    public void test36766() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest73.test36766");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOfIgnoreCase("", "1\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\...3\\U0023\\U0023\\i\\\\U0023\\U0023    3\\U0023\\U0023\\i\\\\U0023\\U0023...", 68);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test36767() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest73.test36767");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.left("61AAAAAAAA61AAAAAAAA61AAAAAAAA61AAAAAAAA61AAAAAAAA61AAAAAAAA61AAAAAAAA6uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu", 241);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "61AAAAAAAA61AAAAAAAA61AAAAAAAA61AAAAAAAA61AAAAAAAA61AAAAAAAA61AAAAAAAA6uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu" + "'", str2, "61AAAAAAAA61AAAAAAAA61AAAAAAAA61AAAAAAAA61AAAAAAAA61AAAAAAAA61AAAAAAAA6uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu");
    }

    @Test
    public void test36768() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest73.test36768");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.endsWith("2..........................................\\U003 .................................................................................................................................................................................................................................................................", "500u\\0u\\                                                                                          500u\\0u\\           6\\6\\66\\6\\66\\6\\66\\6...");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test36769() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest73.test36769");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.uncapitalize((java.lang.CharSequence) "5c111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111...a");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "5c111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111...a" + "'", str1, "5c111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111...a");
    }

    @Test
    public void test36770() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest73.test36770");
        char char2 = org.apache.commons.lang3.CharUtils.toChar((java.lang.Character) 'I', '1');
        org.junit.Assert.assertTrue("'" + char2 + "' != '" + 'I' + "'", char2 == 'I');
    }

    @Test
    public void test36771() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest73.test36771");
        char[] charArray7 = new char[] { '#' };
        boolean boolean8 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "\\u0061", charArray7);
        int int9 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "\\u005c", charArray7);
        int int10 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023    3    ", charArray7);
        boolean boolean11 = org.apache.commons.lang3.StringUtils.containsAny("", charArray7);
        boolean boolean12 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "                                                         U0023\\U002U0023\\U002U0023\\U002U0", charArray7);
        boolean boolean13 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "1111111...", charArray7);
        org.junit.Assert.assertNotNull(charArray7);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray7), "#");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray7), "#");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray7), "[#]");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test36772() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest73.test36772");
        java.lang.CharSequence charSequence2 = org.apache.commons.lang3.StringUtils.defaultIfBlank((java.lang.CharSequence) "\\u0023                                                                                                                                                  hi!hi!hi", (java.lang.CharSequence) "                                                                                                                               i!                                                                                                                                                                                                                 ");
        org.junit.Assert.assertEquals("'" + charSequence2 + "' != '" + "\\u0023                                                                                                                                                  hi!hi!hi" + "'", charSequence2, "\\u0023                                                                                                                                                  hi!hi!hi");
    }

    @Test
    public void test36773() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest73.test36773");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.split("aa......aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test36774() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest73.test36774");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBetween("                  \\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u", "23\\u                100023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u002310023\\u                 ");
        org.junit.Assert.assertNull(str2);
    }

    @Test
    public void test36775() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest73.test36775");
        int int2 = org.apache.commons.lang3.StringUtils.countMatches("aaaaaaaaaaa...555555555555555555555555555555555555555555555555", "61\\ 61\\ 61");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test36776() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest73.test36776");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.split("                                                                                                    ");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.stripAll(strArray1);
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray2);
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.getCommonPrefix(strArray2);
        java.lang.Class<?> wildcardClass5 = strArray2.getClass();
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test36777() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest73.test36777");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeStart("IIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa 61aaaaaaaaaaaaaaaaaaaaaaaaaaaaIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIII", "                                         \n\n1                                                    \n\n1                                  61\\");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "IIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa 61aaaaaaaaaaaaaaaaaaaaaaaaaaaaIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIII" + "'", str2, "IIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa 61aaaaaaaaaaaaaaaaaaaaaaaaaaaaIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIII");
    }

    @Test
    public void test36778() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest73.test36778");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.rightPad(" 61uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu", 18, '4');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + " 61uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu" + "'", str3, " 61uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu");
    }

    @Test
    public void test36779() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest73.test36779");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.center("3200U\\3200U\\3200U\\...0U\\3200U\\3200U\\3200U\\3200U\\3200U\\32\\u00A8", 120, "000000000000000000000000000000...                                                         ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "000000000000000000000000000003200U\\3200U\\3200U\\...0U\\3200U\\3200U\\3200U\\3200U\\3200U\\32\\u00A800000000000000000000000000000" + "'", str3, "000000000000000000000000000003200U\\3200U\\3200U\\...0U\\3200U\\3200U\\3200U\\3200U\\3200U\\32\\u00A800000000000000000000000000000");
    }

    @Test
    public void test36780() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest73.test36780");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                   aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\61", 91);
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray3, '7', 0, 54);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "77777777777777777777777777777777777777777777777777777" + "'", str7, "77777777777777777777777777777777777777777777777777777");
    }

    @Test
    public void test36781() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest73.test36781");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.rightPad("AAAAAAA      ", (int) '.', 'h');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "AAAAAAA      hhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhh" + "'", str3, "AAAAAAA      hhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhh");
    }

    @Test
    public void test36782() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest73.test36782");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.chomp("55555555555555555555555555555555555555555555555555555555555555555555555555555522222\\U0023\\U00\\u0041\\U002322222", "6u666u");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "55555555555555555555555555555555555555555555555555555555555555555555555555555522222\\U0023\\U00\\u0041\\U002322222" + "'", str2, "55555555555555555555555555555555555555555555555555555555555555555555555555555522222\\U0023\\U00\\u0041\\U002322222");
    }

    @Test
    public void test36783() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest73.test36783");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trimToEmpty("...\\U");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "...\\U" + "'", str1, "...\\U");
    }

    @Test
    public void test36784() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest73.test36784");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.abbreviateMiddle("                  AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA", "  \\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023                                                    ", 369);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "                  AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA" + "'", str3, "                  AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA");
    }

    @Test
    public void test36785() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest73.test36785");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfIgnoreCase("61\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 61", "3200U\\3200U\\3200U\\3200U\\3200U\\3200U\\3200U\\3200U\\3261\\u61\\61\\61\\61\\61\\61\\u");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test36786() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest73.test36786");
        int int3 = org.apache.commons.lang3.StringUtils.ordinalIndexOf("UUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU11111111111111111111111111111111111111111111111111111111111111111111111111111111111111111c5U", "2", 118);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test36787() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest73.test36787");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.split("...001600000000160000000016000000001600000000160000000016000000001600000000160000000016", '7');
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test36788() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest73.test36788");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.substringsBetween("\\U005CUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU", "aaaaaaaaaaaaa   uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu", "       11111111111111..");
        org.junit.Assert.assertNull(strArray3);
    }

    @Test
    public void test36789() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest73.test36789");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.chomp("...3\\u0023\\u00231\\40032", "61\\161\\161\\161\\161\\161\\U6                                          161\\161\\161\\161\\161\\161");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "...3\\u0023\\u00231\\40032" + "'", str2, "...3\\u0023\\u00231\\40032");
    }

    @Test
    public void test36790() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest73.test36790");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.difference(" 61\\\\U0020 61\\\\U0020 61\\\\U0020 6 61\\\\U0020 61\\\\U0020 61\\\\U0020 61", "23U0023\\U0023\\U\\4003U0023\\U0023\\U0##########u0023U0023\\U0023\\U\\4003U0023\\U0023\\U0##########u0023U0023\\U0023\\U\\4003U0");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "23U0023\\U0023\\U\\4003U0023\\U0023\\U0##########u0023U0023\\U0023\\U\\4003U0023\\U0023\\U0##########u0023U0023\\U0023\\U\\4003U0" + "'", str2, "23U0023\\U0023\\U\\4003U0023\\U0023\\U0##########u0023U0023\\U0023\\U\\4003U0023\\U0023\\U0##########u0023U0023\\U0023\\U\\4003U0");
    }

    @Test
    public void test36791() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest73.test36791");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("                                                                                                                                                                     61\\ 61\\61                                                                                                                                                                     ", '\\');
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test36792() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest73.test36792");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.leftPad("\\u0068\\u0068\\u0068\\u0068\\u0068\\u0068\\u0068\\u0068\\u0068\\u0068\\u0068\\u0068\\u0068\\u0068\\u0068\\u0068\\u00AAAA...aaaaaa                             hhhhhhhhhhhhhhhhhaaaaaa                             hhhhhh\\u0068\\u0068\\u0068\\u0068\\u0068\\u0068\\u0068\\u0068\\u0068\\u0068\\u0068\\u0068\\u0068\\u0068\\u0068\\u0068\\u00", 19, "\\u0023\\u\\");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\\u0068\\u0068\\u0068\\u0068\\u0068\\u0068\\u0068\\u0068\\u0068\\u0068\\u0068\\u0068\\u0068\\u0068\\u0068\\u0068\\u00AAAA...aaaaaa                             hhhhhhhhhhhhhhhhhaaaaaa                             hhhhhh\\u0068\\u0068\\u0068\\u0068\\u0068\\u0068\\u0068\\u0068\\u0068\\u0068\\u0068\\u0068\\u0068\\u0068\\u0068\\u0068\\u00" + "'", str3, "\\u0068\\u0068\\u0068\\u0068\\u0068\\u0068\\u0068\\u0068\\u0068\\u0068\\u0068\\u0068\\u0068\\u0068\\u0068\\u0068\\u00AAAA...aaaaaa                             hhhhhhhhhhhhhhhhhaaaaaa                             hhhhhh\\u0068\\u0068\\u0068\\u0068\\u0068\\u0068\\u0068\\u0068\\u0068\\u0068\\u0068\\u0068\\u0068\\u0068\\u0068\\u0068\\u00");
    }

    @Test
    public void test36793() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest73.test36793");
        char char1 = org.apache.commons.lang3.CharUtils.toChar("6666\r\r\r\r\r\r\rAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA");
        org.junit.Assert.assertTrue("'" + char1 + "' != '" + '6' + "'", char1 == '6');
    }

    @Test
    public void test36794() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest73.test36794");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("U0023\\U002375757575757575757575757575757575757575757575757575757575", "...3\\U0023\\U0023\\U0023\\U0023\\U0023UUUUUUUUUUUU...", 26);
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void test36795() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest73.test36795");
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.split("\\U0023", "U61\n\\U0020\\U0020\\U0020\\U0020\\U0020\\U0020\\U0020\\U0020\\U0020\\U0020\\U0020\\U0020\\U0020\\U0020\\U00", (int) '\r');
        java.lang.String str6 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray4, '5');
        int int7 = org.apache.commons.lang3.StringUtils.lastIndexOfAny(" 61\\\\U0020 61\\\\U0020 61\\\\U0020 6 61\\\\U0020 61\\\\U0020 61\\\\U0020 61", strArray4);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "3" + "'", str6, "3");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
    }

    @Test
    public void test36796() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest73.test36796");
        int int2 = org.apache.commons.lang3.StringUtils.countMatches("11111111111111111111 111111111111111111111", "");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test36797() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest73.test36797");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.remove("\\u0023                                                                                                                                                  hi!hi!hi!", "u11UUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUu1\\\\100u0u1\\\\100u0u1uuuuuuuuuuuuuu");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\\u0023                                                                                                                                                  hi!hi!hi!" + "'", str2, "\\u0023                                                                                                                                                  hi!hi!hi!");
    }

    @Test
    public void test36798() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest73.test36798");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.remove("222222222222222222222222222222222222222222222u                                           ", 'I');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "222222222222222222222222222222222222222222222u                                           " + "'", str2, "222222222222222222222222222222222222222222222u                                           ");
    }

    @Test
    public void test36799() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest73.test36799");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAllUpperCase((java.lang.CharSequence) "aaaaaaaaaaaaaaaaaaaaaaac5aaaaaaaaaaaaaaaaaaaaa\\u0055                                            1111111111111111111111111111111111111111111111aaaaaaaaaaaaaaaaaaaaaaac5aaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test36800() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest73.test36800");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.leftPad("###AU####################################################AU####################################################AU####################################################AU####################################################AU####################################################AU####################################################AU######                                hi!", 118, " 61\\ u61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 6");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "###AU####################################################AU####################################################AU####################################################AU####################################################AU####################################################AU####################################################AU######                                hi!" + "'", str3, "###AU####################################################AU####################################################AU####################################################AU####################################################AU####################################################AU####################################################AU######                                hi!");
    }

    @Test
    public void test36801() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest73.test36801");
        char[] charArray8 = new char[] { '#' };
        boolean boolean9 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "\\u0061", charArray8);
        boolean boolean10 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "      ", charArray8);
        boolean boolean11 = org.apache.commons.lang3.StringUtils.containsAny("\\u0023                                                                                     hi!hi!hi!", charArray8);
        boolean boolean12 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "11111", charArray8);
        int int13 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "U61\n\\U0020\\U0020\\U0020\\U0020\\U0020\\U0020\\U0020\\U0020\\U0020\\U0020\\U0020\\U0020\\U0020\\U0020\\U00U61\n\\U0020\\U0020\\U0020\\U0020\\U0020\\U0020\\U0020\\U0020\\U0020\\U0020\\U0020\\U0020\\U0020\\U0020\\U00U61\n\\U0020\\U0020\\U0020\\U0020\\U0020\\U0020\\U0020\\U0020\\U0020\\U0020\\U0020\\U0020\\U0020\\U0020\\U00", charArray8);
        boolean boolean14 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "       5c111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111...", charArray8);
        boolean boolean15 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "  ......  \\u00410023\\U0023\\U0023\\U0023\\U0023\\U001\\u0041\\u00", charArray8);
        org.junit.Assert.assertNotNull(charArray8);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray8), "#");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray8), "#");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray8), "[#]");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
    }

    @Test
    public void test36802() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest73.test36802");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.endsWith("                                         \n\n1                                        ", "\\16 \\16 \\16 \\16 \\16 \\16 \\16 \\16 \\16 \\16 \\16u \\16 \\16 \\16 \\16 \\16 \\16 \\16 \\16 \\16 \\16 ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test36803() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest73.test36803");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNotEmpty((java.lang.CharSequence) "###\n###    61        61        615c    61        61        61");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test36804() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest73.test36804");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substring("         61\\ u61\\ 61\\ 61\\ 61\\ 61\\  61\\ u61\\ 61\\ 61\\ 61\\ 61\\ ", 449);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test36805() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest73.test36805");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNumericSpace((java.lang.CharSequence) "...0000000000000000000000000000000");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test36806() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest73.test36806");
        java.lang.String[] strArray5 = org.apache.commons.lang3.StringUtils.split("10hi!100");
        int int6 = org.apache.commons.lang3.StringUtils.indexOfAny("\\u000d", strArray5);
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray5);
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.getCommonPrefix(strArray5);
        java.lang.String str9 = org.apache.commons.lang3.StringUtils.concatWith("  \\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023                                                     ", (java.lang.Object[]) strArray5);
        java.lang.String str10 = org.apache.commons.lang3.StringUtils.concat((java.lang.Object[]) strArray5);
        int int11 = org.apache.commons.lang3.StringUtils.indexOfAny("1111111     ", strArray5);
        java.lang.String str12 = org.apache.commons.lang3.StringUtils.getCommonPrefix(strArray5);
        java.lang.String str14 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray5, "                                                                                                        AAAAAAA     ");
        boolean boolean15 = org.apache.commons.lang3.StringUtils.endsWithAny("61\\61\\61", strArray5);
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "10hi!100" + "'", str7, "10hi!100");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "10hi!100" + "'", str8, "10hi!100");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "10hi!100" + "'", str9, "10hi!100");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "10hi!100" + "'", str10, "10hi!100");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "10hi!100" + "'", str12, "10hi!100");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "10hi!100" + "'", str14, "10hi!100");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test36807() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest73.test36807");
        int int2 = org.apache.commons.lang3.CharUtils.toIntValue((java.lang.Character) 'a', 480);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 480 + "'", int2 == 480);
    }

    @Test
    public void test36808() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest73.test36808");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripToEmpty("                                            3200u                            aaaaaaaaaaaaa3200\\a                                 ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "3200u                            aaaaaaaaaaaaa3200\\a" + "'", str1, "3200u                            aaaaaaaaaaaaa3200\\a");
    }

    @Test
    public void test36809() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest73.test36809");
        int int2 = org.apache.commons.lang3.StringUtils.indexOf("23\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u00", "                                                                                      3200U\\1400u\\00U\\3200U\\");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test36810() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest73.test36810");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAllUpperCase((java.lang.CharSequence) "...h    h...aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaau61\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\...h    h...aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaau61\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\...h    h...aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaau61\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\...h    h...aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaau61\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\...");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test36811() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest73.test36811");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsIgnoreCase("!IH!IH!IH", "   2     ...                                ...    ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test36812() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest73.test36812");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsIgnoreCase("\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\...h    h...aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u002323\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023U6...####AU####AU####AU####AU####AU####AU####AU####AU####AU####AU####AU####AU####AU####AU####AU####AU####AU####AU####AU####AU####AU####AU####AU####AU####AU####AU####AU####AU####AU####AU####AU####AU####AU####");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test36813() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest73.test36813");
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("aaaaaaa      ", "\\u0023", 1);
        java.lang.String str5 = org.apache.commons.lang3.StringUtils.concat((java.lang.Object[]) strArray4);
        java.lang.String str6 = org.apache.commons.lang3.StringUtils.concat((java.lang.Object[]) strArray4);
        java.lang.String[] strArray9 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens(" 61\\");
        int int10 = org.apache.commons.lang3.StringUtils.indexOfAny("3200U\\3200U\\3200U\\3200U\\3200U\\3200U\\3\\u0020666666666U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023                                                  iii", strArray9);
        java.lang.String str11 = org.apache.commons.lang3.StringUtils.replaceEachRepeatedly("", strArray4, strArray9);
        java.lang.String str13 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray4, "U003                                                ");
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "aaaaaaa      " + "'", str5, "aaaaaaa      ");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "aaaaaaa      " + "'", str6, "aaaaaaa      ");
        org.junit.Assert.assertNotNull(strArray9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "aaaaaaa      " + "'", str13, "aaaaaaa      ");
    }

    @Test
    public void test36814() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest73.test36814");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.difference("AAAAAAAAAAAAAAAAAAAAAAAAAA3AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA", "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test36815() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest73.test36815");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceChars("0023#\\U0030023#\\U0030023#\\U0030023#\\U0030023#\\U0030023#\\U0030023", 'A', 'h');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "0023#\\U0030023#\\U0030023#\\U0030023#\\U0030023#\\U0030023#\\U0030023" + "'", str3, "0023#\\U0030023#\\U0030023#\\U0030023#\\U0030023#\\U0030023#\\U0030023");
    }

    @Test
    public void test36816() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest73.test36816");
        java.lang.Object[] objArray0 = null;
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.join(objArray0, "4  h\\huh0023h\\huh0023h\\huh0023h\\huh0023h\\huh0023h\\huh0023h\\huh0023h                                        ");
        org.junit.Assert.assertNull(str2);
    }

    @Test
    public void test36817() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest73.test36817");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfDifference((java.lang.CharSequence) "                  aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa                   ", (java.lang.CharSequence) "\\ 1\\ 1\\ 1\\ 1\\ 1\\ 1\\ 1\\ 1\\ 1\\u");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test36818() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest73.test36818");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringAfter("..                       100023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023100                       ", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa  .....");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test36819() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest73.test36819");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceChars("                            ", "", "uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuAAAAAAAAAAAAA\\\\\\uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "                            " + "'", str3, "                            ");
    }

    @Test
    public void test36820() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest73.test36820");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("                                                \\u0023\\u0023\\u0023\\u0023\\u0023\\u0...6666666666666666666666666666666666666666666\r\r\r\r\r\r\r                                                 ", "                                                                                                     6U3200U\\3200U\\3200U\\3200U\\3200U\\3200U\\3200U\\32", 43);
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void test36821() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest73.test36821");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.remove("u 66u 6666u 66u 6666u 66u 6666u 66u 6666u 66u 6666u 66u 6666u 66u 6666u 66u 6666u 66u 6666u 66uu", "             U0023\\U002U0023\\U002U0023\\U002U0");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "u 66u 6666u 66u 6666u 66u 6666u 66u 6666u 66u 6666u 66u 6666u 66u 6666u 66u 6666u 66u 6666u 66uu" + "'", str2, "u 66u 6666u 66u 6666u 66u 6666u 66u 6666u 66u 6666u 66u 6666u 66u 6666u 66u 6666u 66u 6666u 66uu");
    }

    @Test
    public void test36822() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest73.test36822");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.split("                           \\u0061\\u0061\\u\\U0023\\u0061\\u0061\\u0                                 ", '6');
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test36823() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest73.test36823");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBetween("", "555555555555555");
        org.junit.Assert.assertNull(str2);
    }

    @Test
    public void test36824() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest73.test36824");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringAfter("aaaaaaaaaaaaa\\20UUU\\20UUU\\20UUU\\                                               ", "61u1UUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU1 161\\\\1u100201 161\\\\1u100201 16");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test36825() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest73.test36825");
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("\\u005c", "\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023                                                                                           \\u005cuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu", (int) (byte) 100);
        int int5 = org.apache.commons.lang3.StringUtils.indexOfDifference((java.lang.CharSequence[]) strArray4);
        int int6 = org.apache.commons.lang3.StringUtils.indexOfAny("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa  ......  ", strArray4);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test36826() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest73.test36826");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringAfter("U61\nUUUUUUUUUUUUUUU", "...AAAAAAAAAAAAAAAAAAAAAAAAAAAAAaaaa                                                ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test36827() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest73.test36827");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "\\u003\\u0023                                        ", "      23U0023\\U0023\\U\\4003U0023\\U0023\\U0##########u0023U0023\\U0023\\U\\4003U0023\\U0023\\U0##########u0023U0023\\U0023\\U\\4");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test36828() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest73.test36828");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitByCharacterType("...    ...uuuuu61uuuuuuuuuuuuuuuu44444444444444444444423\\u0023\\u444444444444444444444");
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test36829() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest73.test36829");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.endsWith("\\U002066666666666666666666666666666666666666", "61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\U");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test36830() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest73.test36830");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.center("\\u0023\\u0023\\u0023\\u0023\\u0023\\16", 85);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                          \\u0023\\u0023\\u0023\\u0023\\u0023\\16                          " + "'", str2, "                          \\u0023\\u0023\\u0023\\u0023\\u0023\\16                          ");
    }

    @Test
    public void test36831() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest73.test36831");
        char char1 = org.apache.commons.lang3.CharUtils.toChar("                 \\ 0030                  ");
        org.junit.Assert.assertTrue("'" + char1 + "' != '" + ' ' + "'", char1 == ' ');
    }

    @Test
    public void test36832() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest73.test36832");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substring("\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r", 349);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test36833() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest73.test36833");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOf("                                                                                                 ...11111111111111111111111111111111111111111111111111111111...11111111111111111111111111111111111111111111111111111111...11111111111111111111111111111111111111111111111111111111...11111111111111111111111111111111111111111111111111111111...11111111111111111111111111111111111111111111111111111111...11111111111111111111111111111111111111111111111111111111...11111111111111111111111111111111111111111111111111111111...11111111111111111111111111111111111111111111111111111111", "  2     2     2     2     4444444444444  1    1 ", 148);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test36834() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest73.test36834");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.apache.commons.lang3.StringUtils.abbreviate("3\\u0003\\u0111111111111111111111111111111111111111111111", (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Minimum abbreviation width is 4");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test36835() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest73.test36835");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOf("1111111123\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023u623\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023u623\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023u623\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023u623\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023u623\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023u623\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023u623\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023u623\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023u6", 31, 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test36836() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest73.test36836");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("aaaaaaaaaaaaaaaaaaaaaaaa2aaaaaaaaaaaaaaaaaaaaaaa", "U6663\\u6623\\u6623\\u6623\\u6623\\u6623UUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUu662");
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test36837() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest73.test36837");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.rightPad("...0023h\\huh0023h\\huh0023h                            ...", 69);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "...0023h\\huh0023h\\huh0023h                            ...            " + "'", str2, "...0023h\\huh0023h\\huh0023h                            ...            ");
    }

    @Test
    public void test36838() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest73.test36838");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNotEmpty((java.lang.CharSequence) "i!                                                                                   U002");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test36839() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest73.test36839");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("aaaaaaaaaaaaaaaaaaaaaaac5aaaaaaaaaaaaaaaaaaaaaaa", "6uUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU 6\\\\u0020 6\\\\u0020 6");
        java.lang.String str6 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray2, "3\\U                      ", 886, 566);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
    }

    @Test
    public void test36840() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest73.test36840");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBetween("                                                         AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA", "6161");
        org.junit.Assert.assertNull(str2);
    }

    @Test
    public void test36841() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest73.test36841");
        java.lang.String[] strArray5 = org.apache.commons.lang3.StringUtils.split("                                                                                           U", "3200u\\3200u\\3200u\\3200u\\3200u\\3200u\\3200u\\3200u\\3200u\\3200u", 6);
        java.lang.String[] strArray9 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("\\u0075", "\n");
        int int10 = org.apache.commons.lang3.StringUtils.indexOfAny("23\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023U6", strArray9);
        java.lang.String[] strArray12 = org.apache.commons.lang3.StringUtils.stripAll(strArray9, "5700u\\   2  5700u\\   2  5700u\\   2  5700u\\   2  5700u\\   2  5700u\\   2  5700u\\   2  5700u\\   2  5700u\\   2  5700u\\   2  5700u\\   2  5700u\\   2  5700u\\   2  5700u\\   2  5700u\\   2  5700u\\   2  5700u\\   2  5700u\\   2  5700u\\   2  5700u\\   2  5700u\\   2  5700u\\   2  5700u\\   2  5700u\\   2  5700u\\   2  5700u\\   2  5700u\\   2  5700u\\   2  5700u\\   2  5700u\\   2  5700u\\   2  5700u\\   2  5700u\\   2  5700u\\   2  5700u\\   2  5700u\\   2  5700u\\   2  5700u\\   2  5700u\\   2  5700u\\   2  5700u\\   2  5700u\\   2  5700u\\   2  5700u\\   2  5700u\\   2  5700u\\   2  5700u\\   2  5700u\\   2  5700u\\   2  5700u\\   2  5700u\\");
        java.lang.String str13 = org.apache.commons.lang3.StringUtils.replaceEachRepeatedly("61\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 61", strArray5, strArray12);
        java.lang.String[] strArray15 = org.apache.commons.lang3.StringUtils.stripAll(strArray5, "0023\\u0023\\u0023\\u0023\\u0023\\u0044444444444444444444444444444444444444444444444444444444444444444");
        java.lang.String[] strArray16 = org.apache.commons.lang3.StringUtils.stripAll(strArray5);
        int int17 = org.apache.commons.lang3.StringUtils.lastIndexOfAny("                                                                                                       ", strArray5);
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertNotNull(strArray9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertNotNull(strArray12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "61\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 61" + "'", str13, "61\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 61");
        org.junit.Assert.assertNotNull(strArray15);
        org.junit.Assert.assertNotNull(strArray16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
    }

    @Test
    public void test36842() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest73.test36842");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOfIgnoreCase("0023#\\U0030023#\\U0030023#\\U0030023#\\U0030023#\\U0030023#\\U0030023", "\\u0023\\u0023\\u0023\\u0023\\u0023\\u");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test36843() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest73.test36843");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOf("\\u0023\\u0023\\u0023\\u0023\\u0023", 28);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test36844() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest73.test36844");
        int int3 = org.apache.commons.lang3.StringUtils.indexOf("                         A\\3200U\\323200U\\3200U\\3200U\\3200U\\3200U\\3200U\\3200U\\323200U\\320075                         ", 66, 122);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test36845() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest73.test36845");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.startsWith("                                       ...h    h...aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa 61                                          ...h    h...aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa 61                                          ...h    h...aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa 61                                          ...h    h...aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa 61                                          ...h    h", "...1...                     ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test36846() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest73.test36846");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) " 6\\\\u0020 6\\\\u0020 6\\\\u0020 6\\\\u0020 6\\\\u\r\r\r\r\r...  ", " 6uUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU 6\\\\u0020 6\\\\u0020 6");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test36847() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest73.test36847");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("23                                                                                     hi!hi!hi!", "\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023       aaaaaaa");
        java.lang.String[] strArray5 = org.apache.commons.lang3.StringUtils.stripAll(strArray3, "\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023 \\u005cuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu");
        int int6 = org.apache.commons.lang3.StringUtils.lastIndexOfAny("23", strArray3);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
    }

    @Test
    public void test36848() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest73.test36848");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAllLowerCase((java.lang.CharSequence) "i!                                                                                   U0023");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test36849() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest73.test36849");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.reverseDelimited("              ###########U005cu0u005cu0u0023Uu005cu0u005cu023\\U", 'C');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "              ###########U005cu0u005cu0u0023Uu005cu0u005cu023\\U" + "'", str2, "              ###########U005cu0u005cu0u0023Uu005cu0u005cu023\\U");
    }

    @Test
    public void test36850() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest73.test36850");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfDifference((java.lang.CharSequence) "11111111111111111111111111111111111", (java.lang.CharSequence) "                                                                                                                                                                                                                                                     666666666666666666666666666666666666666                                       aaaaaaaaaaaaa\\\\\\");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test36851() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest73.test36851");
        int int3 = org.apache.commons.lang3.StringUtils.indexOfIgnoreCase("cccccccccccccccccccccccccccccccccccccccccccc\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\cccccccccccccccccccccccccccccccccccccccccccc", "", 192);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test36852() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest73.test36852");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.contains("  2   ", "1hi!11hi!11hi!11hi!11hi!11hi!11hi!11hi!11hi!11hi!11hi!11hi!11hi!11hi!11hi!11hi!11hi!11hi!11hi!11hi!11hi!11hi!11hi!11hi!11hi!11hi!11hi!11hi!11hi!11hi!11hi!11hi!11hi!11hi!11hi!11hi!11hi!11hi!11hi!11hi!11h");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test36853() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest73.test36853");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.defaultString(" 6\\\\u0020 6\\\\u0020 6\\\\u0020 6\\\\u0020 6\\\\u\r\r\r\r\r...  ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + " 6\\\\u0020 6\\\\u0020 6\\\\u0020 6\\\\u0020 6\\\\u\r\r\r\r\r...  " + "'", str1, " 6\\\\u0020 6\\\\u0020 6\\\\u0020 6\\\\u0020 6\\\\u\r\r\r\r\r...  ");
    }

    @Test
    public void test36854() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest73.test36854");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeStart("0U\\\\6 0200U\\\\6 0200U\\\\6 0200U\\\\6 0200U\\\\6 0200U\\\\6 0200U\\\\6 0200U\\\\6 0200U\\\\6 0200U\\\\6 0200U\\\\6 0200U\\\\6 0200U\\\\6 0200U\\\\6 0200U\\\\6 0200U\\\\6 0200U\\\\6 0200U\\\\6 0200U\\\\6 0200U\\\\6 0200U\\\\6 0200U\\\\6 0200U\\\\6 0200U\\\\6 0200U\\\\6 0200U\\\\6 0200U\\\\6 0200U\\\\6 0200U\\\\6 0200U\\\\6                                                             16 \\16 \\16 \\16 \\16  \\16 16 \\16 \\16 \\16 \\16 AAAAAAAAAAAAAAAAAAAAAAA5CAAAAAAAAAAAAAAAAAAAAAAA0U\\\\6 0200U\\\\6 0200U\\\\6 0200U\\\\6 0200U\\\\6 0200U\\\\6 0200U\\\\6 0200U\\\\6 0200U\\\\6 0200U\\\\6 0200U\\\\6 0200U\\\\6 0200U\\\\6 0200U\\\\6 0200U\\\\6 0200U\\\\6 0200U\\\\6 0200U\\\\6 0200U\\\\6 0200U\\\\6 0200U\\\\6 0200U\\\\6 0200U\\\\6 0200U\\\\6 0200U\\\\6 0200U\\\\6 0200U\\\\6 0200U\\\\6 0200U\\\\6 0200U\\\\6 ", "61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ u61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "0U\\\\6 0200U\\\\6 0200U\\\\6 0200U\\\\6 0200U\\\\6 0200U\\\\6 0200U\\\\6 0200U\\\\6 0200U\\\\6 0200U\\\\6 0200U\\\\6 0200U\\\\6 0200U\\\\6 0200U\\\\6 0200U\\\\6 0200U\\\\6 0200U\\\\6 0200U\\\\6 0200U\\\\6 0200U\\\\6 0200U\\\\6 0200U\\\\6 0200U\\\\6 0200U\\\\6 0200U\\\\6 0200U\\\\6 0200U\\\\6 0200U\\\\6 0200U\\\\6 0200U\\\\6                                                             16 \\16 \\16 \\16 \\16  \\16 16 \\16 \\16 \\16 \\16 AAAAAAAAAAAAAAAAAAAAAAA5CAAAAAAAAAAAAAAAAAAAAAAA0U\\\\6 0200U\\\\6 0200U\\\\6 0200U\\\\6 0200U\\\\6 0200U\\\\6 0200U\\\\6 0200U\\\\6 0200U\\\\6 0200U\\\\6 0200U\\\\6 0200U\\\\6 0200U\\\\6 0200U\\\\6 0200U\\\\6 0200U\\\\6 0200U\\\\6 0200U\\\\6 0200U\\\\6 0200U\\\\6 0200U\\\\6 0200U\\\\6 0200U\\\\6 0200U\\\\6 0200U\\\\6 0200U\\\\6 0200U\\\\6 0200U\\\\6 0200U\\\\6 0200U\\\\6 " + "'", str2, "0U\\\\6 0200U\\\\6 0200U\\\\6 0200U\\\\6 0200U\\\\6 0200U\\\\6 0200U\\\\6 0200U\\\\6 0200U\\\\6 0200U\\\\6 0200U\\\\6 0200U\\\\6 0200U\\\\6 0200U\\\\6 0200U\\\\6 0200U\\\\6 0200U\\\\6 0200U\\\\6 0200U\\\\6 0200U\\\\6 0200U\\\\6 0200U\\\\6 0200U\\\\6 0200U\\\\6 0200U\\\\6 0200U\\\\6 0200U\\\\6 0200U\\\\6 0200U\\\\6 0200U\\\\6                                                             16 \\16 \\16 \\16 \\16  \\16 16 \\16 \\16 \\16 \\16 AAAAAAAAAAAAAAAAAAAAAAA5CAAAAAAAAAAAAAAAAAAAAAAA0U\\\\6 0200U\\\\6 0200U\\\\6 0200U\\\\6 0200U\\\\6 0200U\\\\6 0200U\\\\6 0200U\\\\6 0200U\\\\6 0200U\\\\6 0200U\\\\6 0200U\\\\6 0200U\\\\6 0200U\\\\6 0200U\\\\6 0200U\\\\6 0200U\\\\6 0200U\\\\6 0200U\\\\6 0200U\\\\6 0200U\\\\6 0200U\\\\6 0200U\\\\6 0200U\\\\6 0200U\\\\6 0200U\\\\6 0200U\\\\6 0200U\\\\6 0200U\\\\6 0200U\\\\6 ");
    }

    @Test
    public void test36855() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest73.test36855");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.defaultString("U61\n\\U0020\\U0020\\U0020\\U0020\\U0020\\U0020\\U0020\\U0020\\U0020\\U0020", "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "U61\n\\U0020\\U0020\\U0020\\U0020\\U0020\\U0020\\U0020\\U0020\\U0020\\U0020" + "'", str2, "U61\n\\U0020\\U0020\\U0020\\U0020\\U0020\\U0020\\U0020\\U0020\\U0020\\U0020");
    }

    @Test
    public void test36856() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest73.test36856");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAsciiPrintable((java.lang.CharSequence) "uuuu61uuuu                              23U0023\\U0023\\U\\4003U0023\\U0023\\U0##########u0023U0023\\U0023\\U\\4003U0023\\U0023\\U0##########u0023U0023\\U0023\\U\\4003U0023\\U0023\\U0##########u0023U0023\\U0023\\U\\4003U0023\\U0023\\U0##########u0023U0023\\U0023\\U\\4003U0023\\U0023\\U0##########u0023U0023\\U0023\\U\\4003U0023\\U0023\\U0##########u0023U0023\\U0023\\U\\4003U0023\\U0023\\U0##########u0023U0023\\U0023\\U\\4003U0023\\U0023\\U0##########u0023U0023\\U0023\\U\\4003U0023\\U0023\\U0##########u00");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test36857() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest73.test36857");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "0000000000000000000000000000002255                                            0   ..0   ..0   ..0   ..0   ..0   ..0   ..0   ..0   ..", "\r\r\r\r\r\r\rAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test36858() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest73.test36858");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("U002322222", "                  \\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U002", 1);
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray3);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "U002322222" + "'", str4, "U002322222");
    }

    @Test
    public void test36859() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest73.test36859");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfDifference((java.lang.CharSequence) "                                                                             6u666u", (java.lang.CharSequence) " 61\\\\U0020");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
    }

    @Test
    public void test36860() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest73.test36860");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.split("61\\uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu", '6');
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test36861() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest73.test36861");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.split("aaaaaaaaaaaaaaaaaaaaaa...", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa222222222222222222222222222222222222222222222u6                                          ", 173);
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void test36862() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest73.test36862");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.leftPad("AAAAAA                             HHHHHHHHHHHHHHHHHAAAAAAAA", 479);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                                                                                                                                                                                                                                                                                                                                                                                                                   AAAAAA                             HHHHHHHHHHHHHHHHHAAAAAAAA" + "'", str2, "                                                                                                                                                                                                                                                                                                                                                                                                                                   AAAAAA                             HHHHHHHHHHHHHHHHHAAAAAAAA");
    }

    @Test
    public void test36863() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest73.test36863");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.remove("000u\\AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIII", "                   \\\\0020                                                                                 3200u\\3200u\\3200u\\3200u\\3200u\\3200u\\300u\\                 ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "000u\\AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIII" + "'", str2, "000u\\AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIII");
    }

    @Test
    public void test36864() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest73.test36864");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("001!ih01", "AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA", 98);
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void test36865() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest73.test36865");
        int int3 = org.apache.commons.lang3.StringUtils.ordinalIndexOf("61.61.61.61.61.61.61.61.61.61.61.61.61.61.61.61.61.61.61.61.61.61.61.61.61.61.61.61.61.61.", "i!                                                                                   U002", 35);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test36866() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest73.test36866");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOf("4444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444uuuuu", 167, 115);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test36867() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest73.test36867");
        int int3 = org.apache.commons.lang3.StringUtils.indexOf("23\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023U6                                      ", " 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ U61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ ", 110);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test36868() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest73.test36868");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.abbreviate("aaaaaaaaaaaaa u   6aaaaaaaaaaaa", 11);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "aaaaaaaa..." + "'", str2, "aaaaaaaa...");
    }

    @Test
    public void test36869() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest73.test36869");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("66666666666666666666666666666666666666666666666...", "1111111111111111111111111111111111111111110uUu\\u3200uUu\\u3200uUu\\u3200uUu\\u3200uUu\\u32057");
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test36870() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest73.test36870");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.mid("u61uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu", 234, 635);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test36871() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest73.test36871");
        int int3 = org.apache.commons.lang3.StringUtils.indexOfIgnoreCase("                                                                                              6u666", " ...                         ", 78);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test36872() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest73.test36872");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.center(".....................\\u000d\\u000d\\u000d\\u000d\\u000d\\u000A\\u0023AAAAAAAAAAAAAa000u\\......................", 0, "A...\\61\\61\\61\\61\\U0023     ...A");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + ".....................\\u000d\\u000d\\u000d\\u000d\\u000d\\u000A\\u0023AAAAAAAAAAAAAa000u\\......................" + "'", str3, ".....................\\u000d\\u000d\\u000d\\u000d\\u000d\\u000A\\u0023AAAAAAAAAAAAAa000u\\......................");
    }

    @Test
    public void test36873() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest73.test36873");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlpha((java.lang.CharSequence) "      AAAA...");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test36874() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest73.test36874");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNumericSpace((java.lang.CharSequence) "111");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test36875() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest73.test36875");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.strip("u6                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                           ", "1uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu61uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu61uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu61uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu61uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu61uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu61uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu61uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu61uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu61uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                           " + "'", str2, "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                           ");
    }

    @Test
    public void test36876() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest73.test36876");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOf("61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61......61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61", "", 69);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 69 + "'", int3 == 69);
    }

    @Test
    public void test36877() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest73.test36877");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitByCharacterTypeCamelCase("161\\161\\161\\161\\161\\16177777777777777777777777777");
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test36878() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest73.test36878");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfDifference((java.lang.CharSequence) "                                                                                                                                                            000000000000000000000000000000...             ", (java.lang.CharSequence) "...h31\\h31\\h31\\h31\\h31\\h31\\h31\\h...");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test36879() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest73.test36879");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.upperCase("0023\\u00 61\\ 61\\61\n\n\n\n\n\n\n\n");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "0023\\U00 61\\ 61\\61\n\n\n\n\n\n\n\n" + "'", str1, "0023\\U00 61\\ 61\\61\n\n\n\n\n\n\n\n");
    }

    @Test
    public void test36880() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest73.test36880");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.startsWithIgnoreCase("4444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444", "66666666666666666666666666666666666666666666666666666       22222\\U0023\\U0\\u0068");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test36881() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest73.test36881");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.contains("61uuuuuuuuuuuuuuuuuuuuuuu61uuuuuuuuuuuuuuuuuuuuuuuu", "               3300uAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA...               ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test36882() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest73.test36882");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.leftPad("61\\61\\61", (int) '\n');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "  61\\61\\61" + "'", str2, "  61\\61\\61");
    }

    @Test
    public void test36883() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest73.test36883");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsAny("                                          ", "...6666666666666666661aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa666666666666666666666666666666");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test36884() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest73.test36884");
        java.util.Locale locale1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.apache.commons.lang3.StringUtils.upperCase("2", locale1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test36885() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest73.test36885");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.equalsIgnoreCase("UU03UUU033UUU033UUU033UUU033UUU033UUU033UUU033UUU033UUU033UUU03UUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU033UUU033UUU033UUU033UUU033UUU033UUU033UUU033UUU033UUU03UUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU033UUU033UUU033UUU033UUU033UUU033UUU033UUU033UUU033UUU03UUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU033UUU033UUU033UUU033UUU033UUU033UUU033UUU033UUU033UUU03UUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU033UUU033UUU033UUU033UUU033UUU033UUU033UUU033UUU033UUU03UUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU033UUU033UUU033UUU033UUU033UUU033UUU033UUU033UUU033UUU03UUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU033UUU033UUU033UUU033UUU033UUU033UUU033UUU033UUU033UUU03UUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU", "uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test36886() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest73.test36886");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("aaa", "\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U002");
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray2, "D\\U000D\\U000D\\U000D\\U000D\\U000D\\U000D\\U000D\\U000D\\U000D\\U000D\\U000D\\U000D\\U000D\\U000D\\U000D\\U000D\\U000D\\U000D\\U000D\\U000D\\U000D\\U000D\\U000D\\U000D\\U000D\\U000D\\U000D\\U000D\\U000D\\U000D\\U000D\\U000D\\U000D\\U000D\\U000D\\U000D\\U000D\\U000D\\U000D\\U000D\\U000D\\U000D\\U000D\\U000D\\U000D\\U000D\\U000D\\U000D\\U000D\\U000D\\U000D\\U000D\\U000D\\U000D\\U000D\\U000D\\U");
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "aaa" + "'", str4, "aaa");
    }

    @Test
    public void test36887() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest73.test36887");
        char[] charArray13 = new char[] { '4', ' ', ' ', ' ', '4' };
        boolean boolean14 = org.apache.commons.lang3.StringUtils.containsAny("hi!", charArray13);
        boolean boolean15 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "10hi!100", charArray13);
        int int16 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "\\u0061", charArray13);
        int int17 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "hi!", charArray13);
        boolean boolean18 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "1111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111", charArray13);
        int int19 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "u61\n\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u00", charArray13);
        boolean boolean20 = org.apache.commons.lang3.StringUtils.containsAny("\\u005c", charArray13);
        boolean boolean21 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "uuuuuuuuu23\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023U6uuuuuuuuu", charArray13);
        org.junit.Assert.assertNotNull(charArray13);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray13), "4   4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray13), "4   4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray13), "[4,  ,  ,  , 4]");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
    }

    @Test
    public void test36888() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest73.test36888");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.stripEnd("       h", "AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "       h" + "'", str2, "       h");
    }

    @Test
    public void test36889() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest73.test36889");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.split("61        61", "###AU", 51);
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void test36890() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest73.test36890");
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.replace("\\U0023\\U00\\u0041\\U                                   ", "77777###\n\\u002                                         \n\n1           aaaaaaaaaaa77777", "uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuc### \\u0020\\u0020\\u0020\\u0020\\u0020\\u0\\u005", 78);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "\\U0023\\U00\\u0041\\U                                   " + "'", str4, "\\U0023\\U00\\u0041\\U                                   ");
    }

    @Test
    public void test36891() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest73.test36891");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.center("75                                                          ", 0, '\r');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "75                                                          " + "'", str3, "75                                                          ");
    }

    @Test
    public void test36892() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest73.test36892");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isEmpty((java.lang.CharSequence) "IUI0020\\4\n\n.............................................................................");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test36893() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest73.test36893");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.split("...u0020u0020u0020u0020u0020u0020u0020u0020u0020...", "..");
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test36894() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest73.test36894");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("                                                                                                                                                             \\U0020\\U0020\\U0020\\U0020\\U0020\\U0020\\U0020\\U0020\\U0020\\U0020\\U0020\\U0020\\U0020\\U0020\\U0020\\U0", ' ');
        boolean boolean4 = org.apache.commons.lang3.StringUtils.endsWithAny("u003            0023         ", strArray3);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
    }

    @Test
    public void test36895() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest73.test36895");
        int int1 = org.apache.commons.lang3.StringUtils.length((java.lang.CharSequence) "       22222\\U0023\\U00\\u0041\\U00232222");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 38 + "'", int1 == 38);
    }

    @Test
    public void test36896() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest73.test36896");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.split("Aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa         ", '#');
        java.lang.String[] strArray6 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("                               \\u0061\\u0061\\u\\U0023\\u0061\\u0061\\u0                              ", 'h');
        java.lang.String[] strArray7 = org.apache.commons.lang3.StringUtils.stripAll(strArray6);
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.replaceEach("023\\u0023       aaaaaaa", strArray3, strArray7);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "023\\u0023       aaaaaaa" + "'", str8, "023\\u0023       aaaaaaa");
    }

    @Test
    public void test36897() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest73.test36897");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.abbreviateMiddle("023\\U0023AAAAAAA", "i!\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n", 153);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "023\\U0023AAAAAAA" + "'", str3, "023\\U0023AAAAAAA");
    }

    @Test
    public void test36898() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest73.test36898");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.defaultString("61616161616161616161616161616161616161616161616161616161616161616161616161616161616161616161616161616161616161616161616161616161616161616161616161616161616161616161616161616161616161616161616161", "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "61616161616161616161616161616161616161616161616161616161616161616161616161616161616161616161616161616161616161616161616161616161616161616161616161616161616161616161616161616161616161616161616161" + "'", str2, "61616161616161616161616161616161616161616161616161616161616161616161616161616161616161616161616161616161616161616161616161616161616161616161616161616161616161616161616161616161616161616161616161");
    }

    @Test
    public void test36899() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest73.test36899");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.leftPad("u61\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u00\rUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUu61\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u00", 460, "111111111111111111111111111111111111111111111\\u0...aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa 61aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa111111111111111111111111111111111111111111111\\u0...aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa 61aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa111111111111111111111111111111111111111111111\\u0...aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa 61aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa111111111111111111111111111111111111111111111\\u0...");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "111111111111111111111111111111111111111111111\\u0...aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa 61aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa111111111111111111111111111111111111111111111\\u0...aaaaaaaaaaaaaaaaaaaaau61\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u00\rUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUu61\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u00" + "'", str3, "111111111111111111111111111111111111111111111\\u0...aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa 61aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa111111111111111111111111111111111111111111111\\u0...aaaaaaaaaaaaaaaaaaaaau61\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u00\rUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUu61\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u00");
    }

    @Test
    public void test36900() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest73.test36900");
        int int3 = org.apache.commons.lang3.StringUtils.indexOf("                                                                     u6623\\u6623\\u6623\\u6623\\u6623\\u6623U666", 27, 262);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test36901() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest73.test36901");
        char[] charArray19 = new char[] { '4', ' ', ' ', ' ', '4' };
        boolean boolean20 = org.apache.commons.lang3.StringUtils.containsAny("hi!", charArray19);
        boolean boolean21 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "10hi!100", charArray19);
        int int22 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "\\u0061", charArray19);
        int int23 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "hi!", charArray19);
        boolean boolean24 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "1111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111", charArray19);
        int int25 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "\\u0020", charArray19);
        int int26 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "  2   ", charArray19);
        int int27 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "23\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u002", charArray19);
        boolean boolean28 = org.apache.commons.lang3.StringUtils.containsAny("\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023UUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU", charArray19);
        int int29 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "10hi!10010hi!10010h\\400310hi!10010hi!10010hi", charArray19);
        boolean boolean30 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "        75        75        75        75        75        75        75        75        75        75        75        75        75        75        75        75        75        75        75        75        75        75        75        75        75        75        75        75        75        75        75        75        75        75        75        75        75        75        75        75        75        75        75        75        75        75        75        75        75        75        75        75        75        75        75        75        75        75        75        75        75        75        75        75        75        75        75        75        75        75        75        75        75        75        75        75        75        75        75        75        75        75        75        75        75", charArray19);
        int int31 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "                                          ...h    h...aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa 61                                          ...h    h...aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa 61                                          ...h    h...aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa 61                                          ...h    h...aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa 61                                          ...h    h", charArray19);
        boolean boolean32 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023", charArray19);
        boolean boolean33 = org.apache.commons.lang3.StringUtils.containsAny("                              23U0023\\U0023\\U\\4003U0023\\U0023\\U0##########u0023U0023\\U0023\\U\\4003U0023\\U0023\\U0##########u0023U0023\\U0023\\U\\4003U0023\\U0023\\U0##########u0023U0023\\U0023\\U\\4003U0023\\U0023\\U0##########u0023U0023\\U0023\\U\\4003U0023\\U0023\\U0##########u0023U0023\\U0023\\U\\4003U0023\\U0023\\U0##########u0023U0023\\U0023\\U\\4003U0023\\U0023\\U0##########u0023U0023\\U0023\\U\\4003U0023\\U0023\\U0##########u0023U0023\\U0023\\U\\4003U0023\\U0023\\U0##########u00", charArray19);
        org.junit.Assert.assertNotNull(charArray19);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray19), "4   4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray19), "4   4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray19), "[4,  ,  ,  , 4]");
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + (-1) + "'", int23 == (-1));
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + (-1) + "'", int25 == (-1));
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 20 + "'", int29 == 20);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 42 + "'", int31 == 42);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
    }

    @Test
    public void test36902() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest73.test36902");
        char char2 = org.apache.commons.lang3.CharUtils.toChar((java.lang.Character) '7', 'i');
        org.junit.Assert.assertTrue("'" + char2 + "' != '" + '7' + "'", char2 == '7');
    }

    @Test
    public void test36903() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest73.test36903");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.right("6\\ 66\\ 6\\ 66\\ 6\\ 6         61\\ u61\\ 61\\ 61\\ 61\\ 61\\  61\\ u61\\ 61\\ 61\\ 61\\ 61\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66                                                                            ", 543);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "6\\ 66\\ 6\\ 66\\ 6\\ 6         61\\ u61\\ 61\\ 61\\ 61\\ 61\\  61\\ u61\\ 61\\ 61\\ 61\\ 61\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66                                                                            " + "'", str2, "6\\ 66\\ 6\\ 66\\ 6\\ 6         61\\ u61\\ 61\\ 61\\ 61\\ 61\\  61\\ u61\\ 61\\ 61\\ 61\\ 61\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66                                                                            ");
    }

    @Test
    public void test36904() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest73.test36904");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitByCharacterTypeCamelCase("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa16aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test36905() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest73.test36905");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.startsWithIgnoreCase("...0000000000000000000000000000000", "020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u00   ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test36906() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest73.test36906");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.swapCase("666666666666666666666100023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023100");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "666666666666666666666100023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023100" + "'", str1, "666666666666666666666100023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023100");
    }

    @Test
    public void test36907() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest73.test36907");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.abbreviate("  h\\huh0023h\\huh0023h\\huh0023h\\huh0023h\\huh0023h\\huh0023h\\huh0023h                                        ", 191, 183);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "  h\\huh0023h\\huh0023h\\huh0023h\\huh0023h\\huh0023h\\huh0023h\\huh0023h                                        " + "'", str3, "  h\\huh0023h\\huh0023h\\huh0023h\\huh0023h\\huh0023h\\huh0023h\\huh0023h                                        ");
    }

    @Test
    public void test36908() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest73.test36908");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.split("22222222222222222222                                           \\6005c                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                     ", 'u');
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test36909() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest73.test36909");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substring("23\\U0023\\U...                                   ", 245);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test36910() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest73.test36910");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.right("5700u\\   2  5700u\\   2  5700u\\   2  5700u\\   2  5700u\\   2  5700u\\   2  5700u\\   2  5700u\\   2  5700u\\   2  5700u\\   2  5700u\\   2  5700u\\   2  5700u\\   2  5700u\\   2  5700u\\   2  5700u\\   2  5700u\\   2  5700u\\   2  5700u\\   2  5700u\\   2  5700u\\   2  5700u\\   2  5700u\\   2  5700u\\   2  5700u\\   2  5700u\\   2  5700u\\   2  5700u\\   2  5700u\\   2  5700u\\   2  5700u\\   2  5700u\\   2  5700u\\   2  5700u\\   2  5700u\\   2  5700u\\   2  5700u\\   2  5700u\\   2  5700u\\   2  5700u\\   2  5700u\\   2  5700u\\   2  5700u\\   2  5700u\\   2  5700u\\   2  5700u\\   2  5700u\\   2  5700u\\   2  5700u\\   2  5700u\\   2  5700u\\", 125);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "700u\\   2  5700u\\   2  5700u\\   2  5700u\\   2  5700u\\   2  5700u\\   2  5700u\\   2  5700u\\   2  5700u\\   2  5700u\\   2  5700u\\" + "'", str2, "700u\\   2  5700u\\   2  5700u\\   2  5700u\\   2  5700u\\   2  5700u\\   2  5700u\\   2  5700u\\   2  5700u\\   2  5700u\\   2  5700u\\");
    }

    @Test
    public void test36911() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest73.test36911");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceChars("0023U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023UUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023UUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023UUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023UUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023UUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023UUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023UUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU", "                                  3200 61\\ 61\\ 61", "AAAAAAA     ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "UUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU" + "'", str3, "UUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU");
    }

    @Test
    public void test36912() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest73.test36912");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfAnyBut("0\\U0020\\U0020\\U0020\\U0020\\U0020\\U0020\\U0020                       ", "61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\\\u0023                                                                                                                                                  hi!hi!hi!61\\61\\61\\61\\61      aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa 61aaaaaaa");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 2 + "'", int2 == 2);
    }

    @Test
    public void test36913() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest73.test36913");
        int int2 = org.apache.commons.lang3.StringUtils.getLevenshteinDistance((java.lang.CharSequence) "iiiiiiii\\u", (java.lang.CharSequence) "23\\u0023\\u");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 8 + "'", int2 == 8);
    }

    @Test
    public void test36914() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest73.test36914");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.right("555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa 61aaaaaaaaaaaaaaaaaaaaaaaaaaaa555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555", 267);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555" + "'", str2, "555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555");
    }

    @Test
    public void test36915() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest73.test36915");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeStart("6\\\\U0020", "000000000U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "6\\\\U0020" + "'", str2, "6\\\\U0020");
    }

    @Test
    public void test36916() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest73.test36916");
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("               ", "\\u005c");
        boolean boolean5 = org.apache.commons.lang3.StringUtils.endsWithAny("3200U\\3200U\\3200U\\3200U\\3200U\\3200U\\3200U\\3200U\\3200U\\3200U\\", strArray4);
        java.lang.String[] strArray6 = org.apache.commons.lang3.StringUtils.stripAll(strArray4);
        java.lang.String[] strArray10 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("                                                  3200U\\3200U\\3200U\\3200U\\3200U\\3200U\\3200U\\", " 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ u61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\", 51);
        int int11 = org.apache.commons.lang3.StringUtils.indexOfDifference((java.lang.CharSequence[]) strArray10);
        java.lang.String str12 = org.apache.commons.lang3.StringUtils.replaceEach("00000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000UUUUUUUUUUUUUUUUUUUUUUUUU...000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000", strArray4, strArray10);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str16 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray10, 'a', (-1), 479);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertNotNull(strArray10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "00000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000UUUUUUUUUUUUUUUUUUUUUUUUU...000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000" + "'", str12, "00000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000UUUUUUUUUUUUUUUUUUUUUUUUU...000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000");
    }

    @Test
    public void test36917() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest73.test36917");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.defaultString("3333361                                         \n\n1                                         ", "61uuuuuuuuuuuuhi!\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n61uuuuuuuuuuuuu");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "3333361                                         \n\n1                                         " + "'", str2, "3333361                                         \n\n1                                         ");
    }

    @Test
    public void test36918() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest73.test36918");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.stripEnd("\\u61\\ u61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61  \n\\3333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333", "23\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023U6                                       ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\\u61\\ u61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61  \n" + "'", str2, "\\u61\\ u61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61  \n");
    }

    @Test
    public void test36919() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest73.test36919");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOf("                                                                                                                                                           1111111111111111111111111111111111111111111111       64\n\n0U                                                                                                                                                            ", 108);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test36920() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest73.test36920");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isEmpty((java.lang.CharSequence) "4141414141414141414141414141414141414141414141414141414141414141414141414141414141414141414141414141414141414141414141414141414141414141414141414141414141");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test36921() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest73.test36921");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOf("23\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023", 157);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test36922() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest73.test36922");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("", "                                                                                                 aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        int int4 = org.apache.commons.lang3.StringUtils.indexOfAny("                                                                     ", strArray3);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
    }

    @Test
    public void test36923() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest73.test36923");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBefore("1\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\U", "...3\\U0##########333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "1\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\U" + "'", str2, "1\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\U");
    }

    @Test
    public void test36924() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest73.test36924");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripToEmpty("\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
    }

    @Test
    public void test36925() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest73.test36925");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.rightPad("U0023", 181);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "U0023                                                                                                                                                                                " + "'", str2, "U0023                                                                                                                                                                                ");
    }

    @Test
    public void test36926() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest73.test36926");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("                                       aaaaaaaaaaaaa3200u\\a                                      ", '\r');
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test36927() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest73.test36927");
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.replace("\r\r\r\r\r\r\rAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA", "23\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\                       100023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023100                       ", "\\U000aaaaaaaaaaaaaa3200U\\", 29);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "\r\r\r\r\r\r\rAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA" + "'", str4, "\r\r\r\r\r\r\rAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA");
    }

    @Test
    public void test36928() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest73.test36928");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.rightPad("111111111111111111111111", 94);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "111111111111111111111111                                                                      " + "'", str2, "111111111111111111111111                                                                      ");
    }

    @Test
    public void test36929() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest73.test36929");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("", "161\\161\\161\\161\\161\\161\\u6                                              3200u\\3200u\\3200u\\3200u\\3200u\\3200u\\3200u\\3200u\\3200u\\3200u\\161\\161\\161\\161\\161\\161\\u6                                 ", 13);
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void test36930() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest73.test36930");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.substring("22H\\HUH0023H\\HUH0023H\\HUH0023H\\HUH0023H\\HUH0023H\\HUH0023H\\HUH0023H22222222222222222222222222222222222222222222222222222", 164, 63);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test36931() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest73.test36931");
        int int2 = org.apache.commons.lang3.CharUtils.toIntValue((java.lang.Character) '\r', 25);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 25 + "'", int2 == 25);
    }

    @Test
    public void test36932() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest73.test36932");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.deleteWhitespace("            ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
    }

    @Test
    public void test36933() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest73.test36933");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA16 AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA  \\\\0020                                                                                 3200u\\3200u\\3200u\\3200u\\3200u\\3200u\\300u\\  \\\\0020                                                            ", "000000000000000000000000000000000000000000000000016 ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test36934() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest73.test36934");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBetween("", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa\\u0034");
        org.junit.Assert.assertNull(str2);
    }

    @Test
    public void test36935() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest73.test36935");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOfIgnoreCase("..............................", "                       000u                       ", 74);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test36936() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest73.test36936");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBefore("......  aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "600u\\1600u\\1600u\\1600u\\1600u\\1600u\\1600u\\1600u\\1600u1111111111111111111111111111111111111...");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "......  aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa" + "'", str2, "......  aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
    }

    @Test
    public void test36937() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest73.test36937");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("...H    H...", "\n\n\n\n\n\n\n\n\n\n\\u0055                                            \n\n\n\n\n\n\n\n\n\n\\u0055                                  61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\6\n\n\n\n\n\n\n\n\n\n\\u0055                                            \n\n\n\n\n\n\n\n\n\n\\u0055                                   ", 31);
        java.lang.String[] strArray5 = org.apache.commons.lang3.StringUtils.stripAll(strArray3, "                                                                                      3200U\\1400u\\00U\\3200U\\");
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertNotNull(strArray5);
    }

    @Test
    public void test36938() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest73.test36938");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("1111123i23i23i23iui31i23i23i23i23111111", "\\u0061\\u0061\\u\\U0023\\u0061\\u0061\\u0000000000000000000000000000000000000000000000000000000000000000000000000000000000000000............................33333333333333333330000000000000000000000000000000000000000000000000000000000000000000000000000000000000000............................3333333333333333333000000000000000000000000000000000000000000000000000000");
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test36939() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest73.test36939");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.leftPad("\\U003 111AAAAAAAA\\ \\61\\AAAAAAAAAAAAAAAAAAAAAAAAAAAA", (int) 'i', "6\\16\\16\\16\\16\\16\\16\\16\\16\\16\\16\\16\\16\\16\\16\\16\\16\\16\\16\\16\\16\\16\\16\\16\\16\\16\\16\\16\\1");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "6\\16\\16\\16\\16\\16\\16\\16\\16\\16\\16\\16\\16\\16\\16\\16\\16\\16\\1\\U003 111AAAAAAAA\\ \\61\\AAAAAAAAAAAAAAAAAAAAAAAAAAAA" + "'", str3, "6\\16\\16\\16\\16\\16\\16\\16\\16\\16\\16\\16\\16\\16\\16\\16\\16\\16\\1\\U003 111AAAAAAAA\\ \\61\\AAAAAAAAAAAAAAAAAAAAAAAAAAAA");
    }

    @Test
    public void test36940() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest73.test36940");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.strip("                                                                23\\u0023\\u0023\\u0023\\u0023\\u002");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "23\\u0023\\u0023\\u0023\\u0023\\u002" + "'", str1, "23\\u0023\\u0023\\u0023\\u0023\\u002");
    }

    @Test
    public void test36941() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest73.test36941");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfDifference((java.lang.CharSequence) "2                                        uAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA \n\n1                                                                                                                               ", (java.lang.CharSequence) "61");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test36942() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest73.test36942");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsIgnoreCase("\\40032\\40032\\40032\\40032\\40032\\40032\\40032\\40032\\40032\\40032\\40032\\40032\\40032\\40032\\40032\\40032\\40032\\40032\\40032\\40032\\40032\\40032\\40032\\40032\\40032\\40032\\40032\\40032\\40032\\40032\\40032\\40032\\40032\\40032\\40032\\40032\\40032\\40032\\40032\\40032\\40032\\40032\\40032\\40032\\40032\\40032\\40032\\40032", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa ......");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test36943() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest73.test36943");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitByCharacterType("aaaaac500\\0\\0200\\0200\\0200\\0200\\0200\\\n###");
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test36944() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest73.test36944");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.split("###\nu002                                         \n\n1", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa 61aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str6 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray2, 'I', 0, 440);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 2");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test36945() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest73.test36945");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAllLowerCase((java.lang.CharSequence) "........6 \\1616 \\16 \\1616 ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test36946() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest73.test36946");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripAccents((java.lang.CharSequence) "161016101610161016101610161016101610161016101610161016101610161016101610161016101610161016101610161016101610161016101610161016101610161016");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "161016101610161016101610161016101610161016101610161016101610161016101610161016101610161016101610161016101610161016101610161016101610161016" + "'", str1, "161016101610161016101610161016101610161016101610161016101610161016101610161016101610161016101610161016101610161016101610161016101610161016");
    }

    @Test
    public void test36947() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest73.test36947");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trim("\\U0061\\U0061\\U0061\\U0061\\   u61    1\\U0061\\U0061\\U0061\\U0061                                    \\U0061\\U0061\\U0061\\U0061\\   u61    1\\U0061\\U0061\\U0061\\U0061                                    \\U0061\\U0061\\U0061\\U0061\\   u61    1\\U0061\\U0061\\U0061\\U0061                                    \\U0061\\U0061\\U0061\\U0061\\   u61    1\\U0061\\U0061\\U0061\\U0061                                    ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "\\U0061\\U0061\\U0061\\U0061\\   u61    1\\U0061\\U0061\\U0061\\U0061                                    \\U0061\\U0061\\U0061\\U0061\\   u61    1\\U0061\\U0061\\U0061\\U0061                                    \\U0061\\U0061\\U0061\\U0061\\   u61    1\\U0061\\U0061\\U0061\\U0061                                    \\U0061\\U0061\\U0061\\U0061\\   u61    1\\U0061\\U0061\\U0061\\U0061" + "'", str1, "\\U0061\\U0061\\U0061\\U0061\\   u61    1\\U0061\\U0061\\U0061\\U0061                                    \\U0061\\U0061\\U0061\\U0061\\   u61    1\\U0061\\U0061\\U0061\\U0061                                    \\U0061\\U0061\\U0061\\U0061\\   u61    1\\U0061\\U0061\\U0061\\U0061                                    \\U0061\\U0061\\U0061\\U0061\\   u61    1\\U0061\\U0061\\U0061\\U0061");
    }

    @Test
    public void test36948() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest73.test36948");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOf("55                                            u 61..u 61..u 61..u 61..u 61..u 61..u 61..u 61..u 61..", (int) '4');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test36949() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest73.test36949");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlpha((java.lang.CharSequence) "3AAAA51AAAA0023AAAA51AAAA00233AAAA51AAAA0023AAAA51AAAA00233AAAA51AAAA0023AAAA51AAAA00233AAAA51AAAA0023AAAA51AAAA00233AAAA51AAAA0023AAAA51AAAA00233AAAA51AAAA0023AAAA51AAAA00233AAAA51AAAA0023AAAA51AAAA00233AAAA51AAAA\\16 \\1616 \\16 \\1616 \\16 \\1616 \\16 \\16 \\1616 \\16 \\1616 \\16 \\1616 \\16 \\16 \\1616 \\16 \\1616 \\16 \\1616 \\16 \\13AAAA51AAAA0023AAAA51AAAA00233AAAA51AAAA0023AAAA51AAAA00233AAAA51AAAA0023AAAA51AAAA00233AAAA51AAAA0023AAAA51AAAA00233AAAA51AAAA0023AAAA51AAAA00233AAAA51AAAA0023AAAA51AAAA00233AAAA51AAAA0023AAAA51AAAA00233AAAA51AAAA");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test36950() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest73.test36950");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "\\u0075", "                                               \\UUU02\\UUU02\\UUU02\\aaaaaaaaaaaaa");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test36951() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest73.test36951");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.leftPad("    \\U0061\\U0061\\U0061\\U0061\\U0061\\U0061\\U0061\\U0061\\U0061\\U0061\\U0061\\U0061\\U0061\\U0061\\U0061\\U0061\\U0061\\U0061\\U0061\\U0061\\U0061\\U0061\\U0061\\U0061\\U0061\\U0061\\U0061\\U0061\\U0061\\U0061\\U0061\\U006", 476, '\r');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r    \\U0061\\U0061\\U0061\\U0061\\U0061\\U0061\\U0061\\U0061\\U0061\\U0061\\U0061\\U0061\\U0061\\U0061\\U0061\\U0061\\U0061\\U0061\\U0061\\U0061\\U0061\\U0061\\U0061\\U0061\\U0061\\U0061\\U0061\\U0061\\U0061\\U0061\\U0061\\U006" + "'", str3, "\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r    \\U0061\\U0061\\U0061\\U0061\\U0061\\U0061\\U0061\\U0061\\U0061\\U0061\\U0061\\U0061\\U0061\\U0061\\U0061\\U0061\\U0061\\U0061\\U0061\\U0061\\U0061\\U0061\\U0061\\U0061\\U0061\\U0061\\U0061\\U0061\\U0061\\U0061\\U0061\\U006");
    }

    @Test
    public void test36952() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest73.test36952");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.abbreviateMiddle("            00u\\0200u\\0200u\\0200u\\0200u\\0200u\\0200u\\0200u\\0200u\\0200u\\0200u\\0200u\\0200u\\0200u\\0200u\\\n16u    ", "23\\u0023\\u0023\\u00223\\u0023\\u0023\\u00223\\u0023\\u0023\\u002223\\u0023\\u0023\\u00223\\u0023\\u0023\\u00223\\u0023\\u0023\\u00223", 178);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "            00u\\0200u\\0200u\\0200u\\0200u\\0200u\\0200u\\0200u\\0200u\\0200u\\0200u\\0200u\\0200u\\0200u\\0200u\\\n16u    " + "'", str3, "            00u\\0200u\\0200u\\0200u\\0200u\\0200u\\0200u\\0200u\\0200u\\0200u\\0200u\\0200u\\0200u\\0200u\\0200u\\\n16u    ");
    }

    @Test
    public void test36953() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest73.test36953");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.chop("                 \\uhi!hi!hi!                         ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "                 \\uhi!hi!hi!                        " + "'", str1, "                 \\uhi!hi!hi!                        ");
    }

    @Test
    public void test36954() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest73.test36954");
        int int3 = org.apache.commons.lang3.StringUtils.lastOrdinalIndexOf("222222222222222222222222222222222222222222222u6                                          ", "UUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU30\\\\\\\\UUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU", (int) '.');
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test36955() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest73.test36955");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.split("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        boolean boolean3 = org.apache.commons.lang3.StringUtils.endsWithAny("1111111111111111111111111111", strArray2);
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.stripAll(strArray2);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(strArray4);
    }

    @Test
    public void test36956() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest73.test36956");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("u6u6u6u6u6u6u6u6u6u6u6u6u6u6u6u6u6u6u6u6u6u6u6u6u6u6u6u6u6u6u6u6u6u6u6u6u6u6u6u6u6u6u6u6u6u6u6u6u6u6u6u64444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444", "\\4\n\n\n", (int) 'U');
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.concat((java.lang.Object[]) strArray3);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "u6u6u6u6u6u6u6u6u6u6u6u6u6u6u6u6u6u6u6u6u6u6u6u6u6u6u6u6u6u6u6u6u6u6u6u6u6u6u6u6u6u6u6u6u6u6u6u6u6u6u6u64444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444" + "'", str4, "u6u6u6u6u6u6u6u6u6u6u6u6u6u6u6u6u6u6u6u6u6u6u6u6u6u6u6u6u6u6u6u6u6u6u6u6u6u6u6u6u6u6u6u6u6u6u6u6u6u6u6u64444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444");
    }

    @Test
    public void test36957() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest73.test36957");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.chomp(" 11111111111111111111111111111111111111111111123\\u0023\\u1111111111111111111111111111111111111111111116");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + " 11111111111111111111111111111111111111111111123\\u0023\\u1111111111111111111111111111111111111111111116" + "'", str1, " 11111111111111111111111111111111111111111111123\\u0023\\u1111111111111111111111111111111111111111111116");
    }

    @Test
    public void test36958() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest73.test36958");
        char char1 = org.apache.commons.lang3.CharUtils.toChar("1\n\n\n\n\n1\n\n\n\n\n1\n\n\n\n\n1\n\n\n\n\n1\n\n\n\n\n1\n\n\n\n\n1\n\n\n\n\n1\n\n\n\n\n1\n\n\n\n\n1\n\n\n\n\n1\n\n\n\n\n1\n\n\n\n\n1\n\n\n\n\n1\n\n\n\n\n1\n\n\n\n\n1\n\n\n\n\n1\n\n\n\n\n1\n\n\n\n\n1\n\n\n\n\n1\n\n\n\n\n1\n\n\n\n\n1\n\n\n\n\n1\n\n\n\n\n1\n\n\n\n\n1\n\n\n\n\n1\n\n\n\n\n1\n\n\n\n\n1\n\n\n\n\n1\n\n\n\n\n1\n\n\n\n\n1\n\n\n\n\n1\n\n\n\n\n1\n\n\n\n\n1\n\n\n\n\n1\n\n\n\n\n1\n\n\n\n\n1\n\n\n\n\n1\n\n\n\n\n1\n\n\n\n\n1\n\n\n\n\n1\n\n\n\n\n1\n\n\n\n\n1\n\n\n\n\n1\n\n\n\n\n1\n\n\n");
        org.junit.Assert.assertTrue("'" + char1 + "' != '" + '1' + "'", char1 == '1');
    }

    @Test
    public void test36959() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest73.test36959");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfIgnoreCase("11111111111", "");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test36960() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest73.test36960");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("1!0h01aaaaUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU", "\\\\hhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhh");
        int int4 = org.apache.commons.lang3.StringUtils.indexOfAny("\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\", strArray3);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
    }

    @Test
    public void test36961() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest73.test36961");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.equals((java.lang.CharSequence) "3\\U", (java.lang.CharSequence) "                                                                    U61");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test36962() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest73.test36962");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("AAAA51AAAAAAAA51AAAAAAA1\\U23\\U0023\\U...AAAAAA51AAAAAAA", "1111111111111                 \\u0030\\\\\\\\                                      ");
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test36963() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest73.test36963");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.leftPad("1\\U00234                                      \\U0023\\U00\\u0                    ..", 77, "\\u005");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "1\\U00234                                      \\U0023\\U00\\u0                    .." + "'", str3, "1\\U00234                                      \\U0023\\U00\\u0                    ..");
    }

    @Test
    public void test36964() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest73.test36964");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "uuuu6cuuuu", "");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test36965() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest73.test36965");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOf("AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA 61AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA", 260);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test36966() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest73.test36966");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.contains("aaa                                             ", "IIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIII 6\\\\U0020IIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIII");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test36967() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest73.test36967");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.split("20\\u0020\\u0020\\u0020\\u00", "61\\ U61\\ 61\\ 61\\ 61\\ 61\\  61\\ U61\\ 61\\ 61\\ 61\\ 61\\");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.getCommonPrefix(strArray2);
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.concat((java.lang.Object[]) strArray2);
        java.lang.String str6 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray2, 'C');
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "20u0020u0020u0020u00" + "'", str4, "20u0020u0020u0020u00");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "20Cu0020Cu0020Cu0020Cu00" + "'", str6, "20Cu0020Cu0020Cu0020Cu00");
    }

    @Test
    public void test36968() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest73.test36968");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.startsWith("  \n\\u61\\ u61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61  \n\\u", "ccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccc\\u005c\\u00u61\\u005c\\u00u61\\u005c\\u00u61\\u005c\\u00u61\\u005c\\u00u61\\u005c\\u00u61\\u005c\\u00u61\\u005c\\u00u61\\u005c\\u                                  3200\\u005c\\u00u61\\u005c\\u00u61\\u005c\\u00u61\\u005c\\u00u61\\u005c\\u00u61\\u005c\\u00u61\\u005c\\u00u61\\u005c\\u00u61\\u005c\\uccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccc");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test36969() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest73.test36969");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("61uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu                                  3200u61uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu                                  3200u61uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu                                  3200u61uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu                                  3200u61uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu                                  3200u61uuuu3200", "AAAAAAAAAAAAAAUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU3200UAAAAAAAAAAAAAA", (int) (short) -1);
        int int4 = org.apache.commons.lang3.StringUtils.indexOfDifference((java.lang.CharSequence[]) strArray3);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
    }

    @Test
    public void test36970() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest73.test36970");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.center("................U0023       ", (int) (byte) 100);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                    ................U0023                                           " + "'", str2, "                                    ................U0023                                           ");
    }

    @Test
    public void test36971() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest73.test36971");
        int int3 = org.apache.commons.lang3.StringUtils.lastOrdinalIndexOf(" uuuuuuuuuuU6uuuuuuuuuuu                         ", "1111111111111                 \\u0030\\\\\\\\                                      ", 137);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test36972() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest73.test36972");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphanumericSpace((java.lang.CharSequence) "..111111116 \\16 \\16 \\16 \\16 \\16");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test36973() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest73.test36973");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAllLowerCase((java.lang.CharSequence) "aa......aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test36974() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest73.test36974");
        int int3 = org.apache.commons.lang3.StringUtils.indexOf("3000u\\31111111111111111111111111111111111111111111110U3004\\U\\3200U\\3200U3200u##########0U\\3200U\\3200U3004\\U\\3200U\\3200U3200u##########0U\\3200U\\3200U3004\\U\\3200U\\3200U32      3000u\\31111111111111111111111111111111111111111111110U3004\\U\\3200U\\3200U3200u##########0U\\3200U\\3200U3004\\U\\3200U\\3200U3200u##########0U\\3200U\\3200U3004\\U\\3200U\\3200U32      3000u\\31111111111111111111111111111111111111111111110U3004\\U\\3200U\\3200U3200u##########0U\\3200U\\3200U3004\\U\\3200U\\3200U3200u#      ", 21, 88);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test36975() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest73.test36975");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfIgnoreCase("002u0023U0023\\U0023\\U\\4003U0023\\U0023\\U0##########u0023U0023\\U0023\\U\\4003U0023\\U0023\\U0##########u0023U0023\\U0023\\U\\4003U0023\\U0023\\U0##########u0023U0023\\U0023\\U\\4003U0023\\U0023\\U0##########u0023U0023\\U0023\\U\\4003U0023\\U0023\\U0##########u0023U0023\\U0023\\U\\4003U0023\\U0023\\U0##########u0023U0023\\U0023\\U\\4003U0023\\U0023\\U0##########u0023U0023\\U0023\\U\\4003U0023\\U0023\\U0##########u23U0023\\U0023\\U\\4003U0023\\U0023\\U0##########", "000u\\ 61\\ 61\\ 61\\ 61\\ 61 61\\  61\\ 61\\ 61\\ 61\\ 61A000u\\");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test36976() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest73.test36976");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAllLowerCase((java.lang.CharSequence) "Aaaaaaaaaaa...");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test36977() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest73.test36977");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.containsWhitespace("uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu0023                  \\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test36978() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest73.test36978");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsIgnoreCase("IiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiIiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiIiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiii111111111111111111111U6111111111111\r\r\r\r\r\r\rAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAIiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiIiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiIiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiii", "\\\\0020                                                                                 ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test36979() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest73.test36979");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("6\\\\u0020 6\\\\u0020 6\\\\u0020 6\\\\u0020 6\\\\u\r\r\r\r\r\r\r\\400326666666666666666666666666666666666666666666", "U0023\\u0...\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\nUU000u                                                                                                                                                                                                                  ");
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test36980() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest73.test36980");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("A\\U0023AAAAAAAAAAAAAA000U\\", "  \\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023                                                                                           \\u005cuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu   ");
        boolean boolean4 = org.apache.commons.lang3.StringUtils.startsWithAny("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa 61aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", strArray3);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str8 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray3, '.', 8, 19);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 10");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
    }

    @Test
    public void test36981() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest73.test36981");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("a", "\\u003\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023                                                  ", 6);
        java.lang.String[] strArray5 = org.apache.commons.lang3.StringUtils.stripAll(strArray3, "AAAAAAA     u61\n\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str9 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray3, '6', 72, 95);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 72");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertNotNull(strArray5);
    }

    @Test
    public void test36982() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest73.test36982");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.startsWith("                                                                                             U\\32", "i!                                                                                   U002");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test36983() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest73.test36983");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.abbreviateMiddle("\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023UUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU", "161\\ 61\\ 6", 300);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023UUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU" + "'", str3, "\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023UUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU");
    }

    @Test
    public void test36984() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest73.test36984");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.stripEnd("6116116116116116116116116116116116116116116116116116116116116116", "5555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555                                                                                                55555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "6116116116116116116116116116116116116116116116116116116116116116" + "'", str2, "6116116116116116116116116116116116116116116116116116116116116116");
    }

    @Test
    public void test36985() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest73.test36985");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.chomp("\\u005c\\u0\\u005c\\u0\\u0023\\U\\u005c\\u0\\u005c\\u0\\u005");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "\\u005c\\u0\\u005c\\u0\\u0023\\U\\u005c\\u0\\u005c\\u0\\u005" + "'", str1, "\\u005c\\u0\\u005c\\u0\\u0023\\U\\u005c\\u0\\u005c\\u0\\u005");
    }

    @Test
    public void test36986() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest73.test36986");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substring("", 36);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test36987() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest73.test36987");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.split("                                              5c");
        java.lang.String str5 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray1, '\\', 117, 101);
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
    }

    @Test
    public void test36988() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest73.test36988");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.split("...3\\u23\\u23U6              ", "\\\\0020 3200u\\3200u\\3200u\\3200u\\3200u\\3200u\\300u\\", 59);
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void test36989() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest73.test36989");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphaSpace((java.lang.CharSequence) "###\n\\u0020\\u0020\\u0020\\u0020\\u0020\\u0\\u005cuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test36990() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest73.test36990");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeEndIgnoreCase("A000U 61 61 61 61 61 61 61 61 61 61 61A000U 61 61 61 61 61 61 61 61 61 61 61A000U61\\A000U 61 61 61 61 61 61 61 61 61 61 61A000U 61 61 61 61 61 61 61 61 61 61 61A000U", "3\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023    ...061                                         \n\n");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "A000U 61 61 61 61 61 61 61 61 61 61 61A000U 61 61 61 61 61 61 61 61 61 61 61A000U61\\A000U 61 61 61 61 61 61 61 61 61 61 61A000U 61 61 61 61 61 61 61 61 61 61 61A000U" + "'", str2, "A000U 61 61 61 61 61 61 61 61 61 61 61A000U 61 61 61 61 61 61 61 61 61 61 61A000U61\\A000U 61 61 61 61 61 61 61 61 61 61 61A000U 61 61 61 61 61 61 61 61 61 61 61A000U");
    }

    @Test
    public void test36991() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest73.test36991");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isBlank((java.lang.CharSequence) "... 16 16 16 16 16 16 16 16 16                                                                                                                                                                                                                                         ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test36992() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest73.test36992");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsIgnoreCase("1111111111111111111111111111111111111111111111111111", "                                                                                                                                                                                                                                                                                                                                                                          61        61        61        61        61        61        61        61        61        61        61        61                                                                                                                                                                                                                                                                                                                                                                        ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test36993() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest73.test36993");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOf("\\61\\61\\61\\61\\61\\61", (int) 'C');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test36994() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest73.test36994");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOfIgnoreCase("###\n\\U0020\\U0020\\U0020\\U0020\\U0020\\U0020\\U0020\\U0020\\U0020\\U0020\\U0020\\U0020\\U0020\\U0020\\U0020\\U0##", "\\U0055", 130);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test36995() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest73.test36995");
        int int2 = org.apache.commons.lang3.CharUtils.toIntValue('i', 566);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 566 + "'", int2 == 566);
    }

    @Test
    public void test36996() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest73.test36996");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.contains("66666666666666666666666666666666666666666666666666666666666666666666666666666666666666575757575757575757575757575757575757575757575757575111666666666666666666666666666666666666666666666666666666666666666666666666666666666666666", 59);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test36997() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest73.test36997");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.split("\\0u00020", "                                      ");
        java.lang.String str6 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray2, "  \nu0020u0020u0020u0020u0020u0020u0020u0020u0020u0020u0020u0020u0020u0020u0020u0  \nu0020u0020u0020u0020u0020u0020u0020u0020u0020u0020u0020u0020u0020u0020u0020u0", 667, 380);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
    }

    @Test
    public void test36998() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest73.test36998");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.deleteWhitespace("                                                                     u6623\\u6623\\u6623\\u6623\\u6623\\u6623U666");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "u6623\\u6623\\u6623\\u6623\\u6623\\u6623U666" + "'", str1, "u6623\\u6623\\u6623\\u6623\\u6623\\u6623U666");
    }

    @Test
    public void test36999() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest73.test36999");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOf("  2  UUUUU", "000000000000000000000000000000...             ");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test37000() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest73.test37000");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("1111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.concat((java.lang.Object[]) strArray2);
        java.lang.String[] strArray6 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("                                                                                                 aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "aaaaaa");
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.concat((java.lang.Object[]) strArray6);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str8 = org.apache.commons.lang3.StringUtils.replaceEachRepeatedly("...\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61...", strArray2, strArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Search and Replace array lengths don't match: 1 vs 2");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "1111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111" + "'", str3, "1111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111");
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "                                                                                                 aa" + "'", str7, "                                                                                                 aa");
    }
}

