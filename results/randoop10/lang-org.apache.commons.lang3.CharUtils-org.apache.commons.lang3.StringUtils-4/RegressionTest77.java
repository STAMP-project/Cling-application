import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest77 {

    public static boolean debug = false;

    @Test
    public void test38501() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest77.test38501");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.chomp("1\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "1\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\" + "'", str1, "1\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\");
    }

    @Test
    public void test38502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest77.test38502");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.left("...\\61\\61\\61\\61\\61\\...", 80);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "...\\61\\61\\61\\61\\61\\..." + "'", str2, "...\\61\\61\\61\\61\\61\\...");
    }

    @Test
    public void test38503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest77.test38503");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeStart("                                                         #u\n\n###u\n\n###u\n\n###aaaaaaaaaaaaa###", "777777777777777777777777777777777777777777777777777777777777777777777777777777777");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                                         #u\n\n###u\n\n###u\n\n###aaaaaaaaaaaaa###" + "'", str2, "                                                         #u\n\n###u\n\n###u\n\n###aaaaaaaaaaaaa###");
    }

    @Test
    public void test38504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest77.test38504");
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("      ", "                                             ");
        int int5 = org.apache.commons.lang3.StringUtils.indexOfAny("5c", strArray4);
        java.lang.String[] strArray7 = org.apache.commons.lang3.StringUtils.stripAll(strArray4, "");
        java.lang.String str9 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray4, '6');
        boolean boolean10 = org.apache.commons.lang3.StringUtils.startsWithAny("u005cu0u005cu0u0023Uu005cu0u005cu0", strArray4);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "      " + "'", str9, "      ");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test38505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest77.test38505");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOfIgnoreCase("61\\\\50020", "                   \\u0037                   ");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test38506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest77.test38506");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("U", '\n');
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test38507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest77.test38507");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.swapCase("uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu16");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "UUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU16" + "'", str1, "UUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU16");
    }

    @Test
    public void test38508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest77.test38508");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("2uuuuuuuuuuuuuuuuuuuu", " 61\\ u61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61");
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test38509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest77.test38509");
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.split("###\n\\u002                                         \n\n1", "a             u61\n\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0", 14);
        int int5 = org.apache.commons.lang3.StringUtils.lastIndexOfAny("...U\\1400u\\00U\\3200U\\16U\\1400u\\00U\\3200U\\16U\\1400u\\00U\\3200U\\16U\\1400u\\00U\\3200U\\16U\\1400u\\00U\\3200U\\16U\\1400u\\00U\\3200U\\16U\\1400u\\00U\\3200U\\16U\\1400u\\00U\\3200U...", strArray4);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
    }

    @Test
    public void test38510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest77.test38510");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOfIgnoreCase("6uUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU6\\\\u00206\\\\u00206", "ua61a\na\\aua0020a\\aua0020a\\aua0020a\\aua0020a\\aua0020a\\aua0020a\\aua0020a\\aua0020a\\aua0020a\\aua0020a\\aua0020a\\aua0020a\\aua0020a\\aua0020a\\aua00", 2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test38511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest77.test38511");
        int int3 = org.apache.commons.lang3.StringUtils.indexOf("\\u005c\\u00666666666666666666666100023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023100666666666666666666666100023\\u0023", 98, 356);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test38512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest77.test38512");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.remove("uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu3200u\\3200u\\3200u\\3200u\\3200u\\3200u\\3200u\\3200u\\3200u\\3200u\\", "001!IH013333333333333333333333333333333333333333333333333333333333333333333333333333333");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu3200u\\3200u\\3200u\\3200u\\3200u\\3200u\\3200u\\3200u\\3200u\\3200u\\" + "'", str2, "uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu3200u\\3200u\\3200u\\3200u\\3200u\\3200u\\3200u\\3200u\\3200u\\3200u\\");
    }

    @Test
    public void test38513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest77.test38513");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.defaultString("0023\\u0023\\u0023\\u0023\\u0023\\u004444444444444 61\\ u61\\ 61\\ 61\\ 61\\ 61\\ 61\\ u61\\ 61\\ 61\\ 61\\ 61", "62aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "0023\\u0023\\u0023\\u0023\\u0023\\u004444444444444 61\\ u61\\ 61\\ 61\\ 61\\ 61\\ 61\\ u61\\ 61\\ 61\\ 61\\ 61" + "'", str2, "0023\\u0023\\u0023\\u0023\\u0023\\u004444444444444 61\\ u61\\ 61\\ 61\\ 61\\ 61\\ 61\\ u61\\ 61\\ 61\\ 61\\ 61");
    }

    @Test
    public void test38514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest77.test38514");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.mid(" 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ u61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\", 36, (int) '2');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + " 61\\ u61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\" + "'", str3, " 61\\ u61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\");
    }

    @Test
    public void test38515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest77.test38515");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.substring("3\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U002", 861, (int) '7');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test38516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest77.test38516");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.remove("...h...3200U\\3200U\\3200U\\3200U\\3200U\\3200U\\3200U\\...h ", '0');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "...h...32U\\32U\\32U\\32U\\32U\\32U\\32U\\...h " + "'", str2, "...h...32U\\32U\\32U\\32U\\32U\\32U\\32U\\...h ");
    }

    @Test
    public void test38517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest77.test38517");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.containsWhitespace("000000000U0023\\U0023\\U0023\\U...");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test38518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest77.test38518");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("u003aaaaaau003aaaaaau003aaaaaau003aaaaaau003aaaaaau003aaaaaau003aaaaaau003aaaaaau003aaaaaau003aaaaaau003aaaaaau003aaaaaau003aaaaaau003aaaaaau003aaaaaau003aaaaaau003aaaaaau003aaaaaau003aaaaaau003aaaaaau003aaaaaau003aaaaaau003aaaaaau003aaaaaau003aaaaaau003aaaaaau003aaaaaau003aaaaaau003aaaaaau003aaaaaau003aaaaaau003aaaaaau003aaaaaau003aaaaaau003aaaaaau003aaaaaau003aaaaaau003aaaaaa", "Aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa         Aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa         Aaaaaaaaaaaaaaaaaaaaaaaaaaaaa23\\u23\\u23\\u23\\u23\\u23\\u23\\u23U6                                       23\\u23\\u23\\u23\\u23\\u23\\u23\\u23U6                                       23\\u23\\u23\\u23\\u23\\u23\\u23\\u23U6Aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa         Aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa         Aaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", 21);
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void test38519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest77.test38519");
        char char2 = org.apache.commons.lang3.CharUtils.toChar("AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA", ' ');
        org.junit.Assert.assertTrue("'" + char2 + "' != '" + 'A' + "'", char2 == 'A');
    }

    @Test
    public void test38520() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest77.test38520");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphanumericSpace((java.lang.CharSequence) "3333361                                         \n\n133323\\u                                                                                             3333361                                         \n\n1333");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test38521() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest77.test38521");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isEmpty((java.lang.CharSequence) "                                        61\\ 61\\61hhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhh                                        ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test38522() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest77.test38522");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.startsWith("                                                                                                                                                                                                           3200U\\3200U\\3200U\\3200U\\3200U\\3200U\\300U\\\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n", "0UUU\\U3200UUU\\U3200UUU\\U3200UUU\\U3200UUU\\U32057                                                                                                                             ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test38523() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest77.test38523");
        char char2 = org.apache.commons.lang3.CharUtils.toChar((java.lang.Character) 'C', '#');
        org.junit.Assert.assertTrue("'" + char2 + "' != '" + 'C' + "'", char2 == 'C');
    }

    @Test
    public void test38524() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest77.test38524");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBetween("\\u0055                                            1111111111111111111111111111111111111111111111", "\\400326666666666666666666666666666666666666666666");
        org.junit.Assert.assertNull(str2);
    }

    @Test
    public void test38525() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest77.test38525");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substring("61uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu61uuuuuuu", 241);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test38526() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest77.test38526");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.rightPad("61\\ 61\\ 61", 38, 'u');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "61\\ 61\\ 61uuuuuuuuuuuuuuuuuuuuuuuuuuuu" + "'", str3, "61\\ 61\\ 61uuuuuuuuuuuuuuuuuuuuuuuuuuuu");
    }

    @Test
    public void test38527() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest77.test38527");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringAfter("1111111111123\\U                                        ", "0023\\00023\\00023\\ ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test38528() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest77.test38528");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("UUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU0000000000000000000000000000000000000000000uUu0u3200uUu0u3200uUu0u3200uUu0u3200uUu0u32057UUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU", "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                   aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test38529() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest77.test38529");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.chomp("UUUUU61UUUUUUUUUUUUUUUU44444444444444444444453\\U0053\\U444444444444444444444                                                                                                                                                        ", ".....................\\u000d\\u000d\\u000d\\u000d\\u000d\\u000A\\u0023AAAAAAAAAAAAAa000u\\......................");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "UUUUU61UUUUUUUUUUUUUUUU44444444444444444444453\\U0053\\U444444444444444444444                                                                                                                                                        " + "'", str2, "UUUUU61UUUUUUUUUUUUUUUU44444444444444444444453\\U0053\\U444444444444444444444                                                                                                                                                        ");
    }

    @Test
    public void test38530() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest77.test38530");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.center("\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61...... 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\", 7, "U61616161616161616161616161U");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61...... 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\" + "'", str3, "\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61...... 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\");
    }

    @Test
    public void test38531() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest77.test38531");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.capitalize((java.lang.CharSequence) "uuuuuuuuuuuuuuuuuuuuuuuuuuuu");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Uuuuuuuuuuuuuuuuuuuuuuuuuuuu" + "'", str1, "Uuuuuuuuuuuuuuuuuuuuuuuuuuuu");
    }

    @Test
    public void test38532() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest77.test38532");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceChars("...... \\u0041\\u0041\\u0041\\u0041\\u0041\\u0041\\u0041\\u0041\\u0041\\u0041\\u004 61\\\\uu ...... \\u0041\\u0041\\u00u61\\u0020\\u0020\\u0020\\u0020\\u0020\\u00", "11111111111111.", "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + " \\u004\\u004\\u004\\u004\\u004\\u004\\u004\\u004\\u004\\u004\\u004 6\\\\uu  \\u004\\u004\\u00u6\\u0020\\u0020\\u0020\\u0020\\u0020\\u00" + "'", str3, " \\u004\\u004\\u004\\u004\\u004\\u004\\u004\\u004\\u004\\u004\\u004 6\\\\uu  \\u004\\u004\\u00u6\\u0020\\u0020\\u0020\\u0020\\u0020\\u00");
    }

    @Test
    public void test38533() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest77.test38533");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.rightPad("222223200U\\1400u\\00U\\3200U\\22222       66666666666666666666666666666666666666666666666666666", 288, "###\n\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0###");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "222223200U\\1400u\\00U\\3200U\\22222       66666666666666666666666666666666666666666666666666666###\n\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0######\n\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u" + "'", str3, "222223200U\\1400u\\00U\\3200U\\22222       66666666666666666666666666666666666666666666666666666###\n\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0######\n\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u");
    }

    @Test
    public void test38534() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest77.test38534");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trimToEmpty("\\U000AAAAAAAAAAAAAA3200U\\");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "\\U000AAAAAAAAAAAAAA3200U\\" + "'", str1, "\\U000AAAAAAAAAAAAAA3200U\\");
    }

    @Test
    public void test38535() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest77.test38535");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.defaultString("                         a\\3200u\\323200u\\3200u\\3200u\\3200u\\3200u\\3200u\\3200u\\323200u\\320075                        ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "                         a\\3200u\\323200u\\3200u\\3200u\\3200u\\3200u\\3200u\\3200u\\323200u\\320075                        " + "'", str1, "                         a\\3200u\\323200u\\3200u\\3200u\\3200u\\3200u\\3200u\\3200u\\323200u\\320075                        ");
    }

    @Test
    public void test38536() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest77.test38536");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("1\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\U");
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test38537() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest77.test38537");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfDifference((java.lang.CharSequence) "0200\\\\", (java.lang.CharSequence) " 61\\ 61\\ ");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test38538() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest77.test38538");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.substringBetween("uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\                   \\u0033uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu", "61\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\u", "                                                                                    222222222222222222222222222222222");
        org.junit.Assert.assertNull(str3);
    }

    @Test
    public void test38539() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest77.test38539");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.center("3200U\\3200U\\3200U\\3200U\\3200U\\3200U\\3200U\\3200U\\3261\\u61\\61\\61\\61\\61\\61\\u", (int) 'c', "                    \\U0020\\U0020\\U0020\\U0020\\U0020\\U...                     ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "             3200U\\3200U\\3200U\\3200U\\3200U\\3200U\\3200U\\3200U\\3261\\u61\\61\\61\\61\\61\\61\\u             " + "'", str3, "             3200U\\3200U\\3200U\\3200U\\3200U\\3200U\\3200U\\3200U\\3261\\u61\\61\\61\\61\\61\\61\\u             ");
    }

    @Test
    public void test38540() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest77.test38540");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substring("                                ##0U\\0200U\\0200U\\0200U\\0200U\\0200U\\0200U\\0200U\\0200U\\0200U\\0200U\\0200U\\0200U\\0200U\\0200U\\0200U\\\n###                                 ", 125);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "U\\\n###                                 " + "'", str2, "U\\\n###                                 ");
    }

    @Test
    public void test38541() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest77.test38541");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.split("\n\n\n\n\n\n\n\n\n\n\\u0055                                            ");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.concat((java.lang.Object[]) strArray1);
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\\u0055" + "'", str2, "\\u0055");
    }

    @Test
    public void test38542() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest77.test38542");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOf("\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r23\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023U6                                       ", "                             6  6  6  6  6  uuu                            ", 203);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test38543() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest77.test38543");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOfIgnoreCase("001!IH013333333333333333333333333333333333333333333333333333333333333333333333333333333", "uuuuuuuuuuuu");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test38544() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest77.test38544");
        char char1 = org.apache.commons.lang3.CharUtils.toChar("\n\n\n\n\n1\n\n\n\n\n1\n\n\n\n\n1\n\n\n\n\n1\n\n\n\n\n1\n\n\n\n\n1\n\n\n\n\n1\n\n\n\n\n1\n\n\n\n\n1\n\n\n\n\n1\n\n\n\n\n1\n\n\n\n\n1\n\n\n\n\n1\n\n\n\n\n1\n\n\n\n\n1\n\n\n\n\n1\n\n\n\n\n1\n\n\n\n\n1\n\n\n\n\n1\n\n\n\n\n1\n\n\n\n\n1\n\n\n\n\n1\n\n\n\n\n1\n\n\n\n\n1\n\n\n\n\n1\n\n\n\n\n1\n\n\n\n\n1\n\n\n\n\n1\n\n\n\n\n1\n\n\n\n\n1\n\n\n\n\n1\n\n\n\n\n1\n\n\n\n\n1\n\n\n\n\n1\n\n\n\n\n1\n\n\n\n\n1\n\n\n\n\n1\n\n\n\n\n1\n\n\n\n\n1\n\n\n\n\n1\n\n\n\n\n1\n\n\n\n\n1\n\n\n\n\n1\n\n\n\n\n1\n\n\n\n\n1\n\n\n\n\n1\n\n\n\n\n1\n\n\n\n\n1");
        org.junit.Assert.assertTrue("'" + char1 + "' != '" + '\n' + "'", char1 == '\n');
    }

    @Test
    public void test38545() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest77.test38545");
        java.util.Locale locale1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.apache.commons.lang3.StringUtils.lowerCase("aa        75                                          aaaaaaahhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhh", locale1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test38546() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest77.test38546");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripAccents((java.lang.CharSequence) "AAAAAAAAAAAAA3200\\A                             6\\6\\66\\6\\66\\6\\66\\6...");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "AAAAAAAAAAAAA3200\\A                             6\\6\\66\\6\\66\\6\\66\\6..." + "'", str1, "AAAAAAAAAAAAA3200\\A                             6\\6\\66\\6\\66\\6\\66\\6...");
    }

    @Test
    public void test38547() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest77.test38547");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripToEmpty("U5C");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "U5C" + "'", str1, "U5C");
    }

    @Test
    public void test38548() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest77.test38548");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isBlank((java.lang.CharSequence) "UUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU3200U\\3200U\\3200U\\3200U\\3200U\\3200U\\3200U\\3200U\\3200U\\3200U");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test38549() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest77.test38549");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.chomp("                                               \\UUU02\\UUU02\\UUU02\\AAAAAAAAAAAAA");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "                                               \\UUU02\\UUU02\\UUU02\\AAAAAAAAAAAAA" + "'", str1, "                                               \\UUU02\\UUU02\\UUU02\\AAAAAAAAAAAAA");
    }

    @Test
    public void test38550() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest77.test38550");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringAfter("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa61 aaaaaaaaaaaaaaaaaaaaaaaa", "777777777777777777777777777777777777777727777777777777777777777777777777777777777");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test38551() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest77.test38551");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.chomp("51", "         a          ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "51" + "'", str2, "51");
    }

    @Test
    public void test38552() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest77.test38552");
        int int2 = org.apache.commons.lang3.CharUtils.toIntValue((java.lang.Character) '0', (int) ' ');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test38553() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest77.test38553");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.stripStart("\\u0023\\u0023\\u0023\\u0023\\u0023\\u0...6666666666666666666666666666666666666666666\r\r\r\r\r\r\r\r", "61u1UUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU1161\\\\1u100201161\\\\1u10020116");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "3\\u0023\\u0023\\u0023\\u0023\\u0...6666666666666666666666666666666666666666666\r\r\r\r\r\r\r\r" + "'", str2, "3\\u0023\\u0023\\u0023\\u0023\\u0...6666666666666666666666666666666666666666666\r\r\r\r\r\r\r\r");
    }

    @Test
    public void test38554() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest77.test38554");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("i!                                                                                   U0023                          ");
        java.lang.String str5 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray1, '0', 48, 14);
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
    }

    @Test
    public void test38555() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest77.test38555");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceChars("      AAAA...", 'U', '\r');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "      AAAA..." + "'", str3, "      AAAA...");
    }

    @Test
    public void test38556() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest77.test38556");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trimToEmpty("61u1UUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU1 161\\\\1u100201 161\\\\1u100201 16222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "61u1UUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU1 161\\\\1u100201 161\\\\1u100201 16222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222" + "'", str1, "61u1UUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU1 161\\\\1u100201 161\\\\1u100201 16222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222");
    }

    @Test
    public void test38557() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest77.test38557");
        java.util.Locale locale1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.apache.commons.lang3.StringUtils.lowerCase("AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA 61AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAa", locale1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test38558() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest77.test38558");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isEmpty((java.lang.CharSequence) " 11111111111111111111111111111111111111111111123\\u0023\\u11111111111111111111111111111111111111111111161");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test38559() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest77.test38559");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.contains("", 263);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test38560() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest77.test38560");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripAccents((java.lang.CharSequence) "aaaa                                                 ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "aaaa                                                 " + "'", str1, "aaaa                                                 ");
    }

    @Test
    public void test38561() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest77.test38561");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.contains("6\\\\u0020 6\\\\u0020 6\\\\u0020 6\\\\u0020 6\\\\u\r\r\r\r\r...", 306);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test38562() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest77.test38562");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.split("\\u0061");
        java.lang.String[] strArray8 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("\\u0075", "\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061", 0);
        java.lang.String[] strArray12 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("23\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023", "hi!", (int) ' ');
        java.lang.String str13 = org.apache.commons.lang3.StringUtils.replaceEach(" 61", strArray8, strArray12);
        java.lang.String str14 = org.apache.commons.lang3.StringUtils.replaceEach("\\", strArray3, strArray8);
        int int15 = org.apache.commons.lang3.StringUtils.lastIndexOfAny("61\n61\n61\n61\n61\n61\n61\n61\n61\n61\n61\n61\n61\n61\n61\n61\n61\n61\n61\n61\n61\n61\n61\n61\n61\n61\n61\n61\n61\n61\n", strArray8);
        java.lang.String str19 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray8, '2', 120, 117);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertNotNull(strArray12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + " 61" + "'", str13, " 61");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "\\" + "'", str14, "\\");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
    }

    @Test
    public void test38563() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest77.test38563");
        int int2 = org.apache.commons.lang3.StringUtils.countMatches("23\\u0023\\u0023        75023\\u0023\\u00", "61UUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU 3200U");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test38564() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest77.test38564");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.stripStart("\\u0020", "               aaaaaaaaaaaaa3200\\a                                 ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "u0020" + "'", str2, "u0020");
    }

    @Test
    public void test38565() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest77.test38565");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAllUpperCase((java.lang.CharSequence) "\\u0034666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test38566() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest77.test38566");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOf("\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023...777777777777777777777777777777777777777777", "  \\005C  ");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test38567() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest77.test38567");
        int int3 = org.apache.commons.lang3.StringUtils.indexOf("                                         !IH!IH!IH                                          ", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaAAAAAAA     aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", 566);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test38568() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest77.test38568");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.remove("c200U\\1400u\\00U\\c200U\\", '\r');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "c200U\\1400u\\00U\\c200U\\" + "'", str2, "c200U\\1400u\\00U\\c200U\\");
    }

    @Test
    public void test38569() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest77.test38569");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfDifference((java.lang.CharSequence) "...hhhhhhhhh", (java.lang.CharSequence) "AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA61AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test38570() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest77.test38570");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.split("1111111111111111111111111111111111111111111110u\\3000u\\3111111111111111111111111111111111111111111111", "...    ...\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\");
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.getCommonPrefix(strArray3);
        java.lang.String str6 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray3, 'a');
        boolean boolean7 = org.apache.commons.lang3.StringUtils.endsWithAny("U6663\\u6623\\u6623\\u6623\\u6623\\u6623UUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUu662", strArray3);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "1111111111111111111111111111111111111111111110ua3000ua3111111111111111111111111111111111111111111111" + "'", str6, "1111111111111111111111111111111111111111111110ua3000ua3111111111111111111111111111111111111111111111");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test38571() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest77.test38571");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isWhitespace((java.lang.CharSequence) "h");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test38572() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest77.test38572");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.split("23\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023", "61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ u61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61", 104);
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.getCommonPrefix(strArray3);
        java.lang.String str5 = org.apache.commons.lang3.StringUtils.getCommonPrefix(strArray3);
        java.lang.String[] strArray6 = org.apache.commons.lang3.StringUtils.stripAll(strArray3);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(strArray6);
    }

    @Test
    public void test38573() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest77.test38573");
        int int3 = org.apache.commons.lang3.StringUtils.indexOfIgnoreCase("        61        61        6", "###\n\\u002                                         \n\n1           aaaaaaaaaaa", 886);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test38574() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest77.test38574");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNumeric((java.lang.CharSequence) "U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023UUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test38575() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest77.test38575");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphaSpace((java.lang.CharSequence) "                                                                                    222222222222222222222222222222222");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test38576() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest77.test38576");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfDifference((java.lang.CharSequence) "U0023\\U0##", (java.lang.CharSequence) "                                                                                   0UUU\\U3200UUU\\U3200UUU\\U3200UUU\\U3200UUU\\U32057                                                                                                                             1                                                                                   ");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test38577() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest77.test38577");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("Aaaac1111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111", 'A');
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test38578() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest77.test38578");
        char char1 = org.apache.commons.lang3.CharUtils.toChar("AAAAAAAAAAAAAAAAAAAAAAAAAAAA16 AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA      ");
        org.junit.Assert.assertTrue("'" + char1 + "' != '" + 'A' + "'", char1 == 'A');
    }

    @Test
    public void test38579() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest77.test38579");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.equalsIgnoreCase("ChUUUUUUUUUUUUUUUUUUUhCUUUUUUuuuuuuuuuuuuuuuuuu\\4555555555555555555555555", " 0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023 ...11111111111111");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test38580() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest77.test38580");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("...", "...11111111111111111111111111111111111111111111111111111111");
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.getCommonPrefix(strArray3);
        int int5 = org.apache.commons.lang3.StringUtils.indexOfAny("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa  .....", strArray3);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void test38581() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest77.test38581");
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("                                                                                           4300u\\", "                                  3200", 52);
        java.lang.String str5 = org.apache.commons.lang3.StringUtils.concatWith("###\nu002", (java.lang.Object[]) strArray4);
        java.lang.Class<?> wildcardClass6 = strArray4.getClass();
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "                                                                                           4300u\\" + "'", str5, "                                                                                           4300u\\");
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test38582() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest77.test38582");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringAfter("u003aaaaaau003aaaaaau003aaaaaau003aaaaaau003aaaaaau003aaaaaau003aaaaaau003aaaaaau003aaaaaau003aaaaaau003aaaaaau003aaaaaau003aaaaaau003aaaaaau003aaaaaau003aaaaaau003aaaaaau003aaaaaau003aaaaaau003aaaaaau003aaaaaau003aaaaaau003aaaaaau003aaaaaau003aaaaaau003aaaaaau003aaaaaau003aaaaaau003aaaaaau003aaaaaau003aaaaaau003aaaaaau003aaaaaau003aaaaaau003aaaaaau003aaaaaau003aaaaaau003aaaaaa", "23\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test38583() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest77.test38583");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.containsWhitespace("61\\ 61\\61");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test38584() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest77.test38584");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.mid("3333333333333333333333333333333333                                                                             6u623\\U", 243, 306);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test38585() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest77.test38585");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.containsWhitespace("  \\\\0020                                                                                 3200u\\3200u\\3200u\\3200u\\3200u\\3200u\\300u\\");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test38586() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest77.test38586");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.abbreviateMiddle("666666      66666", "\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0...", (int) (short) 10);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "666666      66666" + "'", str3, "666666      66666");
    }

    @Test
    public void test38587() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest77.test38587");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.reverseDelimited("23\\u0023\\u0023        75023\\u0023\\u002", 'h');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "23\\u0023\\u0023        75023\\u0023\\u002" + "'", str2, "23\\u0023\\u0023        75023\\u0023\\u002");
    }

    @Test
    public void test38588() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest77.test38588");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa\\u0032\\u0032\\u0032\\u0032\\u0032\\u003");
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test38589() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest77.test38589");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeEnd("1111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111", "23\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023                                        ...");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "1111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111" + "'", str2, "1111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111");
    }

    @Test
    public void test38590() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest77.test38590");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringAfterLast("A 61uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu", "0000000000000000000000000000000000000000000000000000  2   0000000000000000000000000000000000000000000000000000");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test38591() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest77.test38591");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "...                                                                                                                 ", "UUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU30\\\\\\\\UUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test38592() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest77.test38592");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.defaultString("UUUUUUUUUUUUUUUUUUUUUUUUUUUU..", "uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "UUUUUUUUUUUUUUUUUUUUUUUUUUUU.." + "'", str2, "UUUUUUUUUUUUUUUUUUUUUUUUUUUU..");
    }

    @Test
    public void test38593() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest77.test38593");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("\\ AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA \\ \\ 6\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 6");
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test38594() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest77.test38594");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.swapCase("                                                                                                               \\u0035");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "                                                                                                               \\U0035" + "'", str1, "                                                                                                               \\U0035");
    }

    @Test
    public void test38595() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest77.test38595");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("               ", "\\u005c");
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.concat((java.lang.Object[]) strArray3);
        int int5 = org.apache.commons.lang3.StringUtils.indexOfDifference((java.lang.CharSequence[]) strArray3);
        java.lang.String str9 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray3, '6', 45, (int) (short) -1);
        boolean boolean10 = org.apache.commons.lang3.StringUtils.endsWithAny("Aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaau6", strArray3);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "               " + "'", str4, "               ");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test38596() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest77.test38596");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.strip("                     ......  77777777777777777777777777777777777777777777777777777777777777777777777");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "......  77777777777777777777777777777777777777777777777777777777777777777777777" + "'", str1, "......  77777777777777777777777777777777777777777777777777777777777777777777777");
    }

    @Test
    public void test38597() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest77.test38597");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.strip("3333361                                         \n\n1                                         ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "3333361                                         \n\n1" + "'", str1, "3333361                                         \n\n1");
    }

    @Test
    public void test38598() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest77.test38598");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.left("aaaaaaaaaaaaa    6aaaaaaaaaaaaa", 69);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "aaaaaaaaaaaaa    6aaaaaaaaaaaaa" + "'", str2, "aaaaaaaaaaaaa    6aaaaaaaaaaaaa");
    }

    @Test
    public void test38599() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest77.test38599");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("AAAA\\ \\61\\AAAAAAAAAAAAAAAAAAAAAAAAAAAA", "UUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU3200U\\3200U\\3200U\\3200U\\3200U\\3200U\\3200U\\3200U\\3200U\\3200U");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.concat((java.lang.Object[]) strArray2);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "AAAA\\ \\61\\AAAAAAAAAAAAAAAAAAAAAAAAAAAA" + "'", str3, "AAAA\\ \\61\\AAAAAAAAAAAAAAAAAAAAAAAAAAAA");
    }

    @Test
    public void test38600() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest77.test38600");
        int int3 = org.apache.commons.lang3.StringUtils.lastOrdinalIndexOf("023\\U0023AAAAAAA", "U###0u\\0200u\\0200u\\0200u\\0200u\\0200u\\0200u\\0200u\\0200u\\0200u\\0200u\\0200u\\0200u\\0200u\\0200u\\0200u\\\n###U\\32                                                                             ", 74);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test38601() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest77.test38601");
        char[] charArray1 = null;
        int int2 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "20\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u00", charArray1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test38602() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest77.test38602");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.substring("000000000U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023                                                  ", 70, 99);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "                             " + "'", str3, "                             ");
    }

    @Test
    public void test38603() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest77.test38603");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substring("                     \\U0023\\U00\\u0           ...", 43);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "  ..." + "'", str2, "  ...");
    }

    @Test
    public void test38604() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest77.test38604");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphaSpace((java.lang.CharSequence) "\\u0023\\u00\\U0041\\u");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test38605() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest77.test38605");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.rightPad("                                                                 \\u0036                                                                 ", (int) (short) 0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                                                 \\u0036                                                                 " + "'", str2, "                                                                 \\u0036                                                                 ");
    }

    @Test
    public void test38606() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest77.test38606");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.rightPad(".\\16 .\\16 .\\16 .\\16 .\\16 .\\16 .\\16 .\\16 .\\16 .\\16 .\\16 .\\16 .\\16 .\\16 .\\16 .\\16 .\\16 .\\16 .\\16 .\\16 .\\16 .\\16 .\\16 .\\16 .\\16 .\\16 .\\16 .\\16 .\\16 .\\16 .\\16 .\\16 .\\16 .\\16 .\\16 .\\16 .\\16 .\\16 .\\16 .\\16 .\\16 .\\16 .\\16 .\\16 .\\16 .\\16 .\\1                                       aaaaaaaaaaaaa\\\\.\\16 .\\16 .\\16 .\\16 .\\16 .\\16 .\\16 .\\16 .\\16 .\\16 .\\16 .\\16 .\\16 .\\16 .\\16 .\\16 .\\16 .\\16 .\\16 .\\16 .\\16 .\\16 .\\16 .\\16 .\\16 .\\16 .\\16 .\\16 .\\16 .\\16 .\\16 .\\16 .\\16 .\\16 .\\16 .\\16 .\\16 .\\16 .\\16 .\\16 .\\16 .\\16 .\\16 .\\16 .\\16 .\\16 .\\1", 508);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + ".\\16 .\\16 .\\16 .\\16 .\\16 .\\16 .\\16 .\\16 .\\16 .\\16 .\\16 .\\16 .\\16 .\\16 .\\16 .\\16 .\\16 .\\16 .\\16 .\\16 .\\16 .\\16 .\\16 .\\16 .\\16 .\\16 .\\16 .\\16 .\\16 .\\16 .\\16 .\\16 .\\16 .\\16 .\\16 .\\16 .\\16 .\\16 .\\16 .\\16 .\\16 .\\16 .\\16 .\\16 .\\16 .\\16 .\\1                                       aaaaaaaaaaaaa\\\\.\\16 .\\16 .\\16 .\\16 .\\16 .\\16 .\\16 .\\16 .\\16 .\\16 .\\16 .\\16 .\\16 .\\16 .\\16 .\\16 .\\16 .\\16 .\\16 .\\16 .\\16 .\\16 .\\16 .\\16 .\\16 .\\16 .\\16 .\\16 .\\16 .\\16 .\\16 .\\16 .\\16 .\\16 .\\16 .\\16 .\\16 .\\16 .\\16 .\\16 .\\16 .\\16 .\\16 .\\16 .\\16 .\\16 .\\1" + "'", str2, ".\\16 .\\16 .\\16 .\\16 .\\16 .\\16 .\\16 .\\16 .\\16 .\\16 .\\16 .\\16 .\\16 .\\16 .\\16 .\\16 .\\16 .\\16 .\\16 .\\16 .\\16 .\\16 .\\16 .\\16 .\\16 .\\16 .\\16 .\\16 .\\16 .\\16 .\\16 .\\16 .\\16 .\\16 .\\16 .\\16 .\\16 .\\16 .\\16 .\\16 .\\16 .\\16 .\\16 .\\16 .\\16 .\\16 .\\1                                       aaaaaaaaaaaaa\\\\.\\16 .\\16 .\\16 .\\16 .\\16 .\\16 .\\16 .\\16 .\\16 .\\16 .\\16 .\\16 .\\16 .\\16 .\\16 .\\16 .\\16 .\\16 .\\16 .\\16 .\\16 .\\16 .\\16 .\\16 .\\16 .\\16 .\\16 .\\16 .\\16 .\\16 .\\16 .\\16 .\\16 .\\16 .\\16 .\\16 .\\16 .\\16 .\\16 .\\16 .\\16 .\\16 .\\16 .\\16 .\\16 .\\16 .\\1");
    }

    @Test
    public void test38607() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest77.test38607");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trimToNull("\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023 \\u005cuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023 \\u005cuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu" + "'", str1, "\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023 \\u005cuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu");
    }

    @Test
    public void test38608() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest77.test38608");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.leftPad("                                                                                                                               i!                                                                                                                                                                                                                 ", 161, 'A');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "                                                                                                                               i!                                                                                                                                                                                                                 " + "'", str3, "                                                                                                                               i!                                                                                                                                                                                                                 ");
    }

    @Test
    public void test38609() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest77.test38609");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfAnyBut("\\\\\\################################################\\\\\\\\\\\\61\\\\\\############################", "23\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u002");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 3 + "'", int2 == 3);
    }

    @Test
    public void test38610() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest77.test38610");
        java.util.Locale locale1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.apache.commons.lang3.StringUtils.lowerCase("\\U003 111AAAAAAAA\\ \\61\\AAAAAAAAAAAAAAAAAAAAAAAAAAAA", locale1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test38611() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest77.test38611");
        char char1 = org.apache.commons.lang3.CharUtils.toChar("\\u003");
        org.junit.Assert.assertTrue("'" + char1 + "' != '" + '\\' + "'", char1 == '\\');
    }

    @Test
    public void test38612() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest77.test38612");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOf("5555555555555555555555555555555555555555555555555555555555555555555555555555555555555555a......a555555", "\\U0023\\U\\");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test38613() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest77.test38613");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("...\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U002", "23 U  23 U", 111);
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void test38614() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest77.test38614");
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("111111111aaaa", "4", 60);
        int int5 = org.apache.commons.lang3.StringUtils.lastIndexOfAny("61\\ 61\\ 6161\\ 61\\ 6161   61\\ 61\\ 6161\\ 61\\ 6161", strArray4);
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray4, 'a');
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray4);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "111111111aaaa" + "'", str7, "111111111aaaa");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "111111111aaaa" + "'", str8, "111111111aaaa");
    }

    @Test
    public void test38615() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest77.test38615");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.difference("1        61   ", "1\\u00234                                      \\u0023\\u00\\U00");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\\u00234                                      \\u0023\\u00\\U00" + "'", str2, "\\u00234                                      \\u0023\\u00\\U00");
    }

    @Test
    public void test38616() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest77.test38616");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("0023\\u0023\\u0023\\u0023\\u0023\\u004444444444444 61\\ u61\\ 61\\ 61\\ 61\\ 61\\ 61\\ u61\\ 61\\ 61\\ 61\\ 61\\", "\\32iiU\\32iiU\\32iiU\\32iiU\\32iiU\\32iiU\\32iiU\\32iiU\\UUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU", 89);
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void test38617() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest77.test38617");
        int int2 = org.apache.commons.lang3.StringUtils.countMatches(" 61\\ 61\\ 61\\ 61\\ 61 61\\  61\\ 61\\ 61\\ 61\\ 61                                                           ", "\\0023\\0023\\0023\\0023\\0023\\0023\\0023...");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test38618() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest77.test38618");
        char[] charArray13 = new char[] { '4', ' ', ' ', ' ', '4' };
        boolean boolean14 = org.apache.commons.lang3.StringUtils.containsAny("hi!", charArray13);
        boolean boolean15 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "10hi!100", charArray13);
        int int16 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "\\u0061", charArray13);
        boolean boolean17 = org.apache.commons.lang3.StringUtils.containsAny("23                                               ...", charArray13);
        int int18 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "\\u0055", charArray13);
        boolean boolean19 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "aaaa                                                ", charArray13);
        boolean boolean20 = org.apache.commons.lang3.StringUtils.containsAny("  2   ", charArray13);
        int int21 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "aaaaaaaaaaaaaaa16 aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", charArray13);
        org.junit.Assert.assertNotNull(charArray13);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray13), "4   4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray13), "4   4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray13), "[4,  ,  ,  , 4]");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
    }

    @Test
    public void test38619() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest77.test38619");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("\n", " 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ u61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61");
        java.lang.String str6 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray2, 'h', (int) '1', 3);
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray2, "23\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023U6                                       ");
        java.lang.String[] strArray9 = org.apache.commons.lang3.StringUtils.stripAll(strArray2);
        java.lang.String str11 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray2, "22222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222aaaaaaaaaaaaa u   6aaaaaaaaaaaaa");
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "\n" + "'", str8, "\n");
        org.junit.Assert.assertNotNull(strArray9);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\n" + "'", str11, "\n");
    }

    @Test
    public void test38620() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest77.test38620");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.upperCase("                        a");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "                        A" + "'", str1, "                        A");
    }

    @Test
    public void test38621() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest77.test38621");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeStartIgnoreCase("\\u000a", "... 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ ...");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\\u000a" + "'", str2, "\\u000a");
    }

    @Test
    public void test38622() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest77.test38622");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isBlank((java.lang.CharSequence) "                                                                                             U\\32");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test38623() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest77.test38623");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.capitalize((java.lang.CharSequence) "\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r    \\U0061\\U0061\\U0061\\U0061\\U0061\\U0061\\U0061\\U0061\\U0061\\U0061\\U0061\\U0061\\U0061\\U0061\\U0061\\U0061\\U0061\\U0061\\U0061\\U0061\\U0061\\U0061\\U0061\\U0061\\U0061\\U0061\\U0061\\U0061\\U0061\\U0061\\U0061\\U006");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r    \\U0061\\U0061\\U0061\\U0061\\U0061\\U0061\\U0061\\U0061\\U0061\\U0061\\U0061\\U0061\\U0061\\U0061\\U0061\\U0061\\U0061\\U0061\\U0061\\U0061\\U0061\\U0061\\U0061\\U0061\\U0061\\U0061\\U0061\\U0061\\U0061\\U0061\\U0061\\U006" + "'", str1, "\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r    \\U0061\\U0061\\U0061\\U0061\\U0061\\U0061\\U0061\\U0061\\U0061\\U0061\\U0061\\U0061\\U0061\\U0061\\U0061\\U0061\\U0061\\U0061\\U0061\\U0061\\U0061\\U0061\\U0061\\U0061\\U0061\\U0061\\U0061\\U0061\\U0061\\U0061\\U0061\\U006");
    }

    @Test
    public void test38624() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest77.test38624");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeStart("                    \\u0020\\u0020\\u0020\\u0020\\u0020\\u...                     ", "\\U0023");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                    \\u0020\\u0020\\u0020\\u0020\\u0020\\u...                     " + "'", str2, "                    \\u0020\\u0020\\u0020\\u0020\\u0020\\u...                     ");
    }

    @Test
    public void test38625() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest77.test38625");
        char char1 = org.apache.commons.lang3.CharUtils.toChar("AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA");
        org.junit.Assert.assertTrue("'" + char1 + "' != '" + 'A' + "'", char1 == 'A');
    }

    @Test
    public void test38626() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest77.test38626");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("                                                                                                        aaaaaaa      hhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhh", "...AAAAUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU3200UAAAAAAAAAAAAAA");
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test38627() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest77.test38627");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitByCharacterTypeCamelCase("\\ 61\\61uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu");
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test38628() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest77.test38628");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceChars("                                                                                                                                                                        ", "616161616161616161616161616161616161616161616161616161616161u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u00230023", "AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA51AAAAAAAA51AAAAAAA1\\U23\\U0023\\U...AAAAAA51AAAAAAA");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "                                                                                                                                                                        " + "'", str3, "                                                                                                                                                                        ");
    }

    @Test
    public void test38629() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest77.test38629");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substring("uuuuuuuuuuuuuuu0023uuuuuuuuuuuuuuuu0u\\ 2 5700u\\ 2 5700u\\ 2 5700u\\ 2 5700u\\ 2 5700u\\ 2 5700u\\ 2 5700", 44);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "0u\\ 2 5700u\\ 2 5700u\\ 2 5700u\\ 2 5700u\\ 2 5700u\\ 2 5700" + "'", str2, "0u\\ 2 5700u\\ 2 5700u\\ 2 5700u\\ 2 5700u\\ 2 5700u\\ 2 5700");
    }

    @Test
    public void test38630() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest77.test38630");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trimToEmpty("                    ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
    }

    @Test
    public void test38631() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest77.test38631");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.defaultString("...0023h\\huh0023h\\huh0023h                            ...            ", "3200U\\3200U\\3200U\\3200U\\3200U\\3200U\\3200U000000000");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "...0023h\\huh0023h\\huh0023h                            ...            " + "'", str2, "...0023h\\huh0023h\\huh0023h                            ...            ");
    }

    @Test
    public void test38632() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest77.test38632");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.leftPad("uuuuuuuuuuuuuuuuuu\\4UUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU", (int) 'U', "230U00230U00230U00230U00230U00230U00230U00230U00230U002");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "uuuuuuuuuuuuuuuuuu\\4UUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU" + "'", str3, "uuuuuuuuuuuuuuuuuu\\4UUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU");
    }

    @Test
    public void test38633() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest77.test38633");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsAny("\\4  2U2U2U2U2U2U2U2U2U2U2U2U2U2U2U2U2U2U2U2U2U2U2U2U2U2U2U2U2U2U2U2U2U2U2U2U2U2U2U2U2U2U2U2U2U2U2U2U2U2U2U2U2U2U2U2U2U2U2U", "\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U002375757575757575757575757575757575757575757575757575757575");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test38634() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest77.test38634");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "u  ......  \\u0041\\u0041\\u0041\\u0041\\u0041\\u0041\\u0041\\u0041\\u0041\\u0041\\u0041\\u0041\\u0041\\u0041\\u00                                 ");
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test38635() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest77.test38635");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isWhitespace((java.lang.CharSequence) "2............111111111111111111111111111111111111111111111..............................................................................................................................................................");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test38636() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest77.test38636");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.difference("\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\...h    h...aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "H");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "H" + "'", str2, "H");
    }

    @Test
    public void test38637() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest77.test38637");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.chomp("d\\U000D\\U000D\\U000D\\U000D\\U000D\\U000D\\U000D\\U000D\\U000D\\U000D\\U000D\\U000D\\U000D\\U000D\\U000D\\U000D\\U000D\\U000D\\U000D\\U000D\\U000D\\U000D\\U000D\\U000D\\U000D\\U000D\\U000D\\U000D\\U000D\\U000D\\U000D\\U000D\\U000D\\U000D\\U000D\\U000D\\U000D\\U000D\\U000D\\U000D\\U000D\\U000D\\U000D\\U000D\\U000D\\U000D\\U000D\\U000D\\U000D\\U000D\\U000D\\U000D\\U000D\\U000D\\U000D\\U000D\\U", "                                 A\\u0023AAAAAAAAAAAAA                      ...");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "d\\U000D\\U000D\\U000D\\U000D\\U000D\\U000D\\U000D\\U000D\\U000D\\U000D\\U000D\\U000D\\U000D\\U000D\\U000D\\U000D\\U000D\\U000D\\U000D\\U000D\\U000D\\U000D\\U000D\\U000D\\U000D\\U000D\\U000D\\U000D\\U000D\\U000D\\U000D\\U000D\\U000D\\U000D\\U000D\\U000D\\U000D\\U000D\\U000D\\U000D\\U000D\\U000D\\U000D\\U000D\\U000D\\U000D\\U000D\\U000D\\U000D\\U000D\\U000D\\U000D\\U000D\\U000D\\U000D\\U000D\\U" + "'", str2, "d\\U000D\\U000D\\U000D\\U000D\\U000D\\U000D\\U000D\\U000D\\U000D\\U000D\\U000D\\U000D\\U000D\\U000D\\U000D\\U000D\\U000D\\U000D\\U000D\\U000D\\U000D\\U000D\\U000D\\U000D\\U000D\\U000D\\U000D\\U000D\\U000D\\U000D\\U000D\\U000D\\U000D\\U000D\\U000D\\U000D\\U000D\\U000D\\U000D\\U000D\\U000D\\U000D\\U000D\\U000D\\U000D\\U000D\\U000D\\U000D\\U000D\\U000D\\U000D\\U000D\\U000D\\U000D\\U000D\\U000D\\U");
    }

    @Test
    public void test38638() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest77.test38638");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBetween("...                                       ...2  \\2  \\2  \\2  \\2  \\2  \\2  \\2...3\\u00                                                                                  ...2  \\2  \\2  \\2  \\2  \\2  \\2  \\2...3\\u00                                                                                  ...2  \\2  \\2  \\2  \\2  \\2  \\2  \\2...3\\u00                                                                                  ...2  \\2  \\2  \\2  \\2  \\2  \\2  \\2...3\\u00         ...", "\\u0023                                                                                     hi!hi!hi!");
        org.junit.Assert.assertNull(str2);
    }

    @Test
    public void test38639() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest77.test38639");
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.split("\\u005c", '#');
        int int5 = org.apache.commons.lang3.StringUtils.indexOfAny("\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023", strArray4);
        boolean boolean6 = org.apache.commons.lang3.StringUtils.startsWithAny("1111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111U", strArray4);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test38640() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest77.test38640");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.substring("", 56, 0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test38641() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest77.test38641");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isBlank((java.lang.CharSequence) "AAAAAAAAAAAAAAhhhhhhhhhhhhhuuuuuuuAAAAAAAAAAAAAA");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test38642() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest77.test38642");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeEnd("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa64aaaaaaaaaaaaaaaaaaaaaaaaaaaa", "                                                ...hhhhhhhhh");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa64aaaaaaaaaaaaaaaaaaaaaaaaaaaa" + "'", str2, "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa64aaaaaaaaaaaaaaaaaaaaaaaaaaaa");
    }

    @Test
    public void test38643() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest77.test38643");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringAfter("   u61    ", "uuuuuuuuuuuu 3200");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test38644() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest77.test38644");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphanumericSpace((java.lang.CharSequence) "\nu002                                         \n\n1                                        ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test38645() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest77.test38645");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.chomp("         ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "         " + "'", str1, "         ");
    }

    @Test
    public void test38646() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest77.test38646");
        int int3 = org.apache.commons.lang3.StringUtils.lastOrdinalIndexOf("                                                                                                     222222222222222222222222222222222222222222222222222222                                                                                                      ", "\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n3\\U                      ", 262);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test38647() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest77.test38647");
        char[] charArray11 = new char[] { ' ' };
        int int12 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "10hi!100", charArray11);
        boolean boolean13 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "\\U0023", charArray11);
        int int14 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa 61aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", charArray11);
        int int15 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "61\\6      aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa 61aaaaaaaaaaaaaaaaaaaaaaaaaaaa1\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61", charArray11);
        int int16 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "\r", charArray11);
        boolean boolean17 = org.apache.commons.lang3.StringUtils.containsAny("0000000000000000U00232222200000000000000000", charArray11);
        int int18 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "####A000U\\", charArray11);
        int int19 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "0uUu\\u3200uUu\\u3200uUu\\u3200uUu\\u3200uUu\\u32057", charArray11);
        boolean boolean20 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "\\u0037", charArray11);
        boolean boolean21 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "\\U0023\\U00\\u0041\\U0023                         ", charArray11);
        org.junit.Assert.assertNotNull(charArray11);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray11), " ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray11), " ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray11), "[ ]");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 4 + "'", int15 == 4);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
    }

    @Test
    public void test38648() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest77.test38648");
        int int1 = org.apache.commons.lang3.StringUtils.length((java.lang.CharSequence) "U0023\\U00\\u0041\\U002322222");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 26 + "'", int1 == 26);
    }

    @Test
    public void test38649() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest77.test38649");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("61UUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU", "                                                                             6u623\\U");
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray2, "   2     ...                                ...    ");
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "61UUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU" + "'", str4, "61UUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU");
    }

    @Test
    public void test38650() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest77.test38650");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("                                                \\u0023\\u0023\\u0023\\u0023\\u0023\\u0...6666666666666666666666666666666666666666666\r\r\r\r\r\r\r                                                 ", "61UUUUUUUUUUUUHI!\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n61UUUUUUUUUUUUU");
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test38651() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest77.test38651");
        java.lang.String[] strArray5 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("             u0023\\u002u0023\\u002u0023\\u002u0", "7", 0);
        java.lang.String[] strArray8 = org.apache.commons.lang3.StringUtils.split("                                                                                                    ");
        boolean boolean9 = org.apache.commons.lang3.StringUtils.endsWithAny("11111111111111111111111111111111111111111111123\\u0023\\u111111111111111111111111111111111111111111111", strArray8);
        java.lang.String str10 = org.apache.commons.lang3.StringUtils.replaceEach(" 23", strArray5, strArray8);
        java.lang.String str11 = org.apache.commons.lang3.StringUtils.concatWith("23hi!hi!hi!                                                                          ", (java.lang.Object[]) strArray8);
        java.lang.String[] strArray12 = org.apache.commons.lang3.StringUtils.stripAll(strArray8);
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + " 23" + "'", str10, " 23");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNotNull(strArray12);
    }

    @Test
    public void test38652() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest77.test38652");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.stripStart("                       61\n                       ", "### \\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0###u00230023\\u0023\\u0023\\u0023");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "61\n                       " + "'", str2, "61\n                       ");
    }

    @Test
    public void test38653() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest77.test38653");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.split("61uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu 61uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu 61uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu 61uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu 61uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu 61uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu 61uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu 61uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu 61uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu 61uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu", "\\u0023\\u0023        75023\\u0023\\u002");
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test38654() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest77.test38654");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.startsWith("\\61\\61uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu", "161\\161\\161\\161\\161\\161\\U6                                   ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test38655() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest77.test38655");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphanumeric((java.lang.CharSequence) "                                        a0u0023aaaaaaaaaaaaa                                        ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test38656() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest77.test38656");
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.overlay("U62 \\U00220\\u0020\\u0020\\u0020\\u00    U62 \\U002", "\\U002066666666666666666666666666666666666666", (int) '1', (int) '1');
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "U62 \\U00220\\u0020\\u0020\\u0020\\u00    U62 \\U002\\U002066666666666666666666666666666666666666" + "'", str4, "U62 \\U00220\\u0020\\u0020\\u0020\\u00    U62 \\U002\\U002066666666666666666666666666666666666666");
    }

    @Test
    public void test38657() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest77.test38657");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.split("1111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111U", '2');
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test38658() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest77.test38658");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.split("                        a", "                               \\u0061\\u0061\\u\\U0023\\u0061\\u0061\\u0                              ", 157);
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void test38659() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest77.test38659");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.split("1\\U00234                                      \\U0023\\U00                                                .\\16 aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "CCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCC 6...", 6);
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void test38660() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest77.test38660");
        int int2 = org.apache.commons.lang3.StringUtils.countMatches("5c1111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111", "uuuuuuuuuuuuuuuuuuuu61uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu61uuuuuuuuuuuuuuuuuuuuuu61");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test38661() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest77.test38661");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("AAA6516AAA", "                                                                                           U                 61        61        61        61        61        61        61        61        61        61        61        61        61                                                                                              U             ", 13);
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void test38662() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest77.test38662");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.rightPad("                                                                                                                \\3200u\\3200u\\3200u\\300u\\", 929);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                                                                                                \\3200u\\3200u\\3200u\\300u\\                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                         " + "'", str2, "                                                                                                                \\3200u\\3200u\\3200u\\300u\\                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                         ");
    }

    @Test
    public void test38663() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest77.test38663");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAllUpperCase((java.lang.CharSequence) " 61\\ 61\\61023\\u0023       aaaaaaa023\\u0023       aaaaaaa");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test38664() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest77.test38664");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.split("8     8     8     8     8     8     8     8  8     8     8     8     8     8     8    ", "5555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555510hi!10555555555555555555555555555555555555555555555555555##############################################.16 5555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555510hi!10555555555555555555555555555555555555555555555555555", (int) 'I');
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void test38665() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest77.test38665");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeStartIgnoreCase("777777777777777777777777777777777777777777777\\u002e777777777777777777777777777777777777777777777", "             3200u\\3200u\\3200u\\3200u\\3200u\\3200u\\3200u\\3200u\\3200u\\3200u");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "777777777777777777777777777777777777777777777\\u002e777777777777777777777777777777777777777777777" + "'", str2, "777777777777777777777777777777777777777777777\\u002e777777777777777777777777777777777777777777777");
    }

    @Test
    public void test38666() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest77.test38666");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.contains("aaaaac500\\0\\0200\\0200\\0200\\0200\\0200\\\n###", "                                       \\                                       AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA                                       \\                                                                              \\  6\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 6");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test38667() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest77.test38667");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.strip("U0023\\u0...\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\nUU000u                                                                                                                                                                                                                  ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "U0023\\u0...\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\nUU000u" + "'", str1, "U0023\\u0...\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\nUU000u");
    }

    @Test
    public void test38668() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest77.test38668");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.startsWith("                                                                                ", "\\UUU02\\UUU02\\UUU02\\aaaaaaaaaaaaa\\\\\\");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test38669() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest77.test38669");
        int int3 = org.apache.commons.lang3.StringUtils.indexOfIgnoreCase("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaau623\\U23\\U23\\U2", "\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\", 85);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test38670() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest77.test38670");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("23\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u002", "23hi!hi!hi!                                                                          ");
        int int4 = org.apache.commons.lang3.StringUtils.indexOfDifference((java.lang.CharSequence[]) strArray3);
        java.lang.String str5 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray3);
        boolean boolean6 = org.apache.commons.lang3.StringUtils.endsWithAny("                    \\U0020\\U0020\\U0020\\U0020\\U0020\\U...                     ", strArray3);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\\u00\\u00\\u00\\u00\\u00\\u00\\u00" + "'", str5, "\\u00\\u00\\u00\\u00\\u00\\u00\\u00");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test38671() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest77.test38671");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfIgnoreCase("                                                                             6u666", "61aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test38672() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest77.test38672");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBeforeLast("                                       aaaaaaaaaaaaa", "  \\005C  ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                       aaaaaaaaaaaaa" + "'", str2, "                                       aaaaaaaaaaaaa");
    }

    @Test
    public void test38673() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest77.test38673");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.defaultIfEmpty("                                                                                      3200U\\1400\\00U\\3200U\\", "3AAAA51AAAA0023AAAA51AAAA0023");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                                                                      3200U\\1400\\00U\\3200U\\" + "'", str2, "                                                                                      3200U\\1400\\00U\\3200U\\");
    }

    @Test
    public void test38674() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest77.test38674");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.rightPad("...23\\U0023\\U002375757575757575757575757575757575757575757575757575757575            ", 0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "...23\\U0023\\U002375757575757575757575757575757575757575757575757575757575            " + "'", str2, "...23\\U0023\\U002375757575757575757575757575757575757575757575757575757575            ");
    }

    @Test
    public void test38675() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest77.test38675");
        int int2 = org.apache.commons.lang3.CharUtils.toIntValue((java.lang.Character) 'i', 104);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 104 + "'", int2 == 104);
    }

    @Test
    public void test38676() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest77.test38676");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringAfter("hCaaaaaaaaaaaaaaaaaaahCaaaaaaaaaaaaaaaaaaahCaaaaaaaaaaaaaaaaaaahCa", "                                                                                  ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test38677() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest77.test38677");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trim("uuuuuuuuuuuu 3200u\\u0023\\uuuuuuuuuuuu 3200u\\u0023\\uuuuuuuuuuuu 3200u\\u0023\\uuuuuuuuuuuu 3200u\\u0023\\uuuuuuuuuuuu 3200u\\u0023\\uuuuuuuuuuuu 3200u\\u0023\\uuuuuuuuuuuu 3200u\\u0023\\uuuuuuuuuuuu 3200u\\u0023\\uuuuuuuuuuuu 3200u\\u0023\\uuuuuuuuuuuu 3200u\\u0023\\uuuuuuuuuuuu 3200u\\u0023\\uuuuuuuuuuuu 3200u\\u0023\\uuuuuuuuuuuu 3200u\\u0023\\uuuuuuuuuuuu 3200u\\u0023\\uuuuuuuuuuuu 3200u\\u0023\\uuuuuuuuuuuu 3200u\\u0023\\uuuuuuuuuuuu 3200u\\u0023\\uuuuuuuuuuuu 3200u\\u0023\\uuuuuuuuuuuu 3200u\\u0023\\uuuuuuuuuuuu 3200u\\u0023\\uuuuuuuuuuuu 3200u\\u0023\\uuuuuuuuuuuu 3200u\\u0023\\uuuuuuuuuuuu 3200u\\u0023\\uuuuuuuuuuuu 3200u\\u0023\\uuuuuuuuuuuu 3200u\\u0023\\uuuuuuuuuuuu 3200u\\u0023\\uuuuuuuuuuuu 3200u\\u0023\\uuuuuuuuuuuu 3200u\\u0023\\uuuuuuuuuuuu 3200u\\u0023\\uuuuuuuuuuuu 3200u\\u0023\\uuuuuuuuuuuu 3200u\\u0023\\uuuuuuuuuuuu 3200u\\u0023\\uuuuuuuuuuuu 3200u\\u0023\\uuuuuuuuuuuu 3200u\\u0023\\uuuuuuuuuuuu 3200u\\u0023\\uuuuuuuuuuuu 3200u");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "uuuuuuuuuuuu 3200u\\u0023\\uuuuuuuuuuuu 3200u\\u0023\\uuuuuuuuuuuu 3200u\\u0023\\uuuuuuuuuuuu 3200u\\u0023\\uuuuuuuuuuuu 3200u\\u0023\\uuuuuuuuuuuu 3200u\\u0023\\uuuuuuuuuuuu 3200u\\u0023\\uuuuuuuuuuuu 3200u\\u0023\\uuuuuuuuuuuu 3200u\\u0023\\uuuuuuuuuuuu 3200u\\u0023\\uuuuuuuuuuuu 3200u\\u0023\\uuuuuuuuuuuu 3200u\\u0023\\uuuuuuuuuuuu 3200u\\u0023\\uuuuuuuuuuuu 3200u\\u0023\\uuuuuuuuuuuu 3200u\\u0023\\uuuuuuuuuuuu 3200u\\u0023\\uuuuuuuuuuuu 3200u\\u0023\\uuuuuuuuuuuu 3200u\\u0023\\uuuuuuuuuuuu 3200u\\u0023\\uuuuuuuuuuuu 3200u\\u0023\\uuuuuuuuuuuu 3200u\\u0023\\uuuuuuuuuuuu 3200u\\u0023\\uuuuuuuuuuuu 3200u\\u0023\\uuuuuuuuuuuu 3200u\\u0023\\uuuuuuuuuuuu 3200u\\u0023\\uuuuuuuuuuuu 3200u\\u0023\\uuuuuuuuuuuu 3200u\\u0023\\uuuuuuuuuuuu 3200u\\u0023\\uuuuuuuuuuuu 3200u\\u0023\\uuuuuuuuuuuu 3200u\\u0023\\uuuuuuuuuuuu 3200u\\u0023\\uuuuuuuuuuuu 3200u\\u0023\\uuuuuuuuuuuu 3200u\\u0023\\uuuuuuuuuuuu 3200u\\u0023\\uuuuuuuuuuuu 3200u\\u0023\\uuuuuuuuuuuu 3200u" + "'", str1, "uuuuuuuuuuuu 3200u\\u0023\\uuuuuuuuuuuu 3200u\\u0023\\uuuuuuuuuuuu 3200u\\u0023\\uuuuuuuuuuuu 3200u\\u0023\\uuuuuuuuuuuu 3200u\\u0023\\uuuuuuuuuuuu 3200u\\u0023\\uuuuuuuuuuuu 3200u\\u0023\\uuuuuuuuuuuu 3200u\\u0023\\uuuuuuuuuuuu 3200u\\u0023\\uuuuuuuuuuuu 3200u\\u0023\\uuuuuuuuuuuu 3200u\\u0023\\uuuuuuuuuuuu 3200u\\u0023\\uuuuuuuuuuuu 3200u\\u0023\\uuuuuuuuuuuu 3200u\\u0023\\uuuuuuuuuuuu 3200u\\u0023\\uuuuuuuuuuuu 3200u\\u0023\\uuuuuuuuuuuu 3200u\\u0023\\uuuuuuuuuuuu 3200u\\u0023\\uuuuuuuuuuuu 3200u\\u0023\\uuuuuuuuuuuu 3200u\\u0023\\uuuuuuuuuuuu 3200u\\u0023\\uuuuuuuuuuuu 3200u\\u0023\\uuuuuuuuuuuu 3200u\\u0023\\uuuuuuuuuuuu 3200u\\u0023\\uuuuuuuuuuuu 3200u\\u0023\\uuuuuuuuuuuu 3200u\\u0023\\uuuuuuuuuuuu 3200u\\u0023\\uuuuuuuuuuuu 3200u\\u0023\\uuuuuuuuuuuu 3200u\\u0023\\uuuuuuuuuuuu 3200u\\u0023\\uuuuuuuuuuuu 3200u\\u0023\\uuuuuuuuuuuu 3200u\\u0023\\uuuuuuuuuuuu 3200u\\u0023\\uuuuuuuuuuuu 3200u\\u0023\\uuuuuuuuuuuu 3200u\\u0023\\uuuuuuuuuuuu 3200u");
    }

    @Test
    public void test38678() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest77.test38678");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("23\\u0023\\u0023          3    23\\u0023\\u0023");
        int int3 = org.apache.commons.lang3.StringUtils.indexOfAny("0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023 6... 6..", strArray2);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test38679() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest77.test38679");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOf("iiiiiiiiiiiiiiiii23\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023", "                                               \\UUU02\\UUU02\\UUU02\\aaaaaaaaaaaaa\\\\\\                  ");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test38680() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest77.test38680");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("1\\U00234                                      \\U0023\\U00\\u0", '\n');
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test38681() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest77.test38681");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.chomp("###\n\\u003\\u0023\\u0023\\u0023\\###");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "###\n\\u003\\u0023\\u0023\\u0023\\###" + "'", str1, "###\n\\u003\\u0023\\u0023\\u0023\\###");
    }

    @Test
    public void test38682() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest77.test38682");
        int int2 = org.apache.commons.lang3.CharUtils.toIntValue((java.lang.Character) '#', 563);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 563 + "'", int2 == 563);
    }

    @Test
    public void test38683() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest77.test38683");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.upperCase("iiiiiiiiiiiiiiiiiiiiiiiiiiiU005Ciiiiiiiiiiiiiiiiiiiiiiiiiiii                                  ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "IIIIIIIIIIIIIIIIIIIIIIIIIIIU005CIIIIIIIIIIIIIIIIIIIIIIIIIIII                                  " + "'", str1, "IIIIIIIIIIIIIIIIIIIIIIIIIIIU005CIIIIIIIIIIIIIIIIIIIIIIIIIIII                                  ");
    }

    @Test
    public void test38684() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest77.test38684");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripToNull("75\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "75\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\" + "'", str1, "75\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\");
    }

    @Test
    public void test38685() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest77.test38685");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.reverse("UUUUUU 6\\\\U0020 6\\\\U0020 6              IIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIII");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "IIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIII              6 0200U\\\\6 0200U\\\\6 UUUUUU" + "'", str1, "IIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIII              6 0200U\\\\6 0200U\\\\6 UUUUUU");
    }

    @Test
    public void test38686() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest77.test38686");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNotEmpty((java.lang.CharSequence) "                   \\U0033                   ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test38687() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest77.test38687");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.swapCase("uuuu61uuuu                              23U0023\\U0023\\U\\4003U0023\\U0023\\U0##########u0023U0023\\U0023\\U\\4003U0023\\U0023\\U0##########u0023U0023\\U0023\\U\\4003U0023\\U0023\\U0##########u0023U0023\\U0023\\U\\4003U0023\\U0023\\U0##########u0023U0023\\U0023\\U\\4003U0023\\U0023\\U0##########u0023U0023\\U0023\\U\\4003U0023\\U0023\\U0##########u0023U0023\\U0023\\U\\4003U0023\\U0023\\U0##########u0023U0023\\U0023\\U\\4003U0023\\U0023\\U0##########u0023U0023\\U0023\\U\\4003U0023\\U0023\\U0##########u00");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "UUUU61UUUU                              23u0023\\u0023\\u\\4003u0023\\u0023\\u0##########U0023u0023\\u0023\\u\\4003u0023\\u0023\\u0##########U0023u0023\\u0023\\u\\4003u0023\\u0023\\u0##########U0023u0023\\u0023\\u\\4003u0023\\u0023\\u0##########U0023u0023\\u0023\\u\\4003u0023\\u0023\\u0##########U0023u0023\\u0023\\u\\4003u0023\\u0023\\u0##########U0023u0023\\u0023\\u\\4003u0023\\u0023\\u0##########U0023u0023\\u0023\\u\\4003u0023\\u0023\\u0##########U0023u0023\\u0023\\u\\4003u0023\\u0023\\u0##########U00" + "'", str1, "UUUU61UUUU                              23u0023\\u0023\\u\\4003u0023\\u0023\\u0##########U0023u0023\\u0023\\u\\4003u0023\\u0023\\u0##########U0023u0023\\u0023\\u\\4003u0023\\u0023\\u0##########U0023u0023\\u0023\\u\\4003u0023\\u0023\\u0##########U0023u0023\\u0023\\u\\4003u0023\\u0023\\u0##########U0023u0023\\u0023\\u\\4003u0023\\u0023\\u0##########U0023u0023\\u0023\\u\\4003u0023\\u0023\\u0##########U0023u0023\\u0023\\u\\4003u0023\\u0023\\u0##########U0023u0023\\u0023\\u\\4003u0023\\u0023\\u0##########U00");
    }

    @Test
    public void test38688() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest77.test38688");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOf("\\16", "uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuc500u\\0u\\0200u\\0200u\\0200u\\0200u\\0200u\\\n###55555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test38689() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest77.test38689");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeStart("                                                                                        iiiiiiiiiii666666666666666666666666666666666666660200u\\3\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023                                                                                        ", "                                                  ...");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                                                                        iiiiiiiiiii666666666666666666666666666666666666660200u\\3\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023                                                                                        " + "'", str2, "                                                                                        iiiiiiiiiii666666666666666666666666666666666666660200u\\3\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023                                                                                        ");
    }

    @Test
    public void test38690() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest77.test38690");
        char char1 = org.apache.commons.lang3.CharUtils.toChar("5555555555555555555555555555555555555555555555555555555555555555555555555555555555  ......  ");
        org.junit.Assert.assertTrue("'" + char1 + "' != '" + '5' + "'", char1 == '5');
    }

    @Test
    public void test38691() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest77.test38691");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeEndIgnoreCase("Aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa 61aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", " 61\\ 61\\61hhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhh");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa 61aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa" + "'", str2, "Aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa 61aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
    }

    @Test
    public void test38692() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest77.test38692");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.strip("U0023                                            ", "uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuaaaa                                                uuuuuuuuuuuuuuuuuuuuuuuuuuuuuu");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "U0023" + "'", str2, "U0023");
    }

    @Test
    public void test38693() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest77.test38693");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOfIgnoreCase("aaaaaaaaaaaaa\\\\\\", "", 695);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 16 + "'", int3 == 16);
    }

    @Test
    public void test38694() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest77.test38694");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.reverse("\\U0023\\U0023\\U0023\\aaaaaaaaaaaaa\\\\\\                  ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "                  \\\\\\aaaaaaaaaaaaa\\3200U\\3200U\\3200U\\" + "'", str1, "                  \\\\\\aaaaaaaaaaaaa\\3200U\\3200U\\3200U\\");
    }

    @Test
    public void test38695() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest77.test38695");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.endsWithIgnoreCase("hhhhhhhhhhhhhhhhhhhhhhh3200u\\3200u\\3200u\\3200u\\3200u\\", "                           1\\U00234                                      \\U0023\\U00\\u0           ...                           1\\U00234                                      \\U0023\\U00\\u0           ...                           1\\U00234                                      \\U0023\\U00\\u0           ...                           1\\U00234                                      \\U0023\\U00\\u0           ...                           1\\U00234                                      \\U0023\\U00\\u0           ...                           1\\U00234                       ...HH...");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test38696() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest77.test38696");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOf("uuuu6cuuuu", 563);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test38697() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest77.test38697");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.chomp("iiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiii3200u\\3200u\\3200u\\3200u\\3200u\\3200u\\3200u\\");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "iiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiii3200u\\3200u\\3200u\\3200u\\3200u\\3200u\\3200u\\" + "'", str1, "iiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiii3200u\\3200u\\3200u\\3200u\\3200u\\3200u\\3200u\\");
    }

    @Test
    public void test38698() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest77.test38698");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "                                         \n\n                                                     \n\n                                      ", "U\\32                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                  ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test38699() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest77.test38699");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeStartIgnoreCase("                                                                                                        \\u0023\\u\\", "                   \\u0023\\u0023\\u0023\\u0023\\u0023\\u                   ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                                                                                        \\u0023\\u\\" + "'", str2, "                                                                                                        \\u0023\\u\\");
    }

    @Test
    public void test38700() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest77.test38700");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("       5C111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111...", "               3300uAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA...               ");
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test38701() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest77.test38701");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAsciiPrintable((java.lang.CharSequence) "\\u61\\ u61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61  \n");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test38702() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest77.test38702");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOf("aaaaauuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuc500u\\0u\\0200u\\0200u\\0200u\\0200u\\0200u\\\n###        ", 126, 257);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test38703() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest77.test38703");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.split("...       ");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray1, '\r');
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "..." + "'", str3, "...");
    }

    @Test
    public void test38704() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest77.test38704");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.equalsIgnoreCase("    u0034                                                                                          ", "u0023\\u0023\\u0023\\u0023\\u0023\\u0023u666");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test38705() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest77.test38705");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trim("\\UUU02\\... 3hi!hi!hi!                                             ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "\\UUU02\\... 3hi!hi!hi!" + "'", str1, "\\UUU02\\... 3hi!hi!hi!");
    }

    @Test
    public void test38706() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest77.test38706");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfIgnoreCase("\\61\\61\\61\\61\\u0023     23\\u23\\u23\\u23\\u23\\u23\\u23\\u23u6                                     ", "61AAAAAAAA61AAAAAAAA61AAAAAAAA61AAAAAAAA61AAAAAAAA61AAAAAAAA61AAAAAAAA6uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test38707() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest77.test38707");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("u003                    111111111111111");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOfAny("\\u61\\ u61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61  \n\\", strArray2);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 57 + "'", int3 == 57);
    }

    @Test
    public void test38708() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest77.test38708");
        int int3 = org.apache.commons.lang3.StringUtils.indexOfIgnoreCase("IIIIIIIIIIIIIIIIIIIIIIIIIIIIIIII", "                                                                                                   ", 404);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test38709() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest77.test38709");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.uncapitalize((java.lang.CharSequence) "aaaaaaaaaaA\\u0023AAAAAAAAAAAAAa000u\\aaaaaaaaaa");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "aaaaaaaaaaA\\u0023AAAAAAAAAAAAAa000u\\aaaaaaaaaa" + "'", str1, "aaaaaaaaaaA\\u0023AAAAAAAAAAAAAa000u\\aaaaaaaaaa");
    }

    @Test
    public void test38710() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest77.test38710");
        int int2 = org.apache.commons.lang3.StringUtils.countMatches("", "0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023...");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test38711() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest77.test38711");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.right("\\U0023\\U0023\\U0023\\U0023\\u0031\\U0023\\U0023\\U0023\\U0023", (int) 'C');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\\U0023\\U0023\\U0023\\U0023\\u0031\\U0023\\U0023\\U0023\\U0023" + "'", str2, "\\U0023\\U0023\\U0023\\U0023\\u0031\\U0023\\U0023\\U0023\\U0023");
    }

    @Test
    public void test38712() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest77.test38712");
        int int2 = org.apache.commons.lang3.StringUtils.indexOf("222223200U\\1400u\\00U\\3200U\\22222       66666666666666666666666666666666666666666666666666666", "023\\U0023\\U0023\\U0023    ");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test38713() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest77.test38713");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.center("61..", 356);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                                                                                                                                                                61..                                                                                                                                                                                " + "'", str2, "                                                                                                                                                                                61..                                                                                                                                                                                ");
    }

    @Test
    public void test38714() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest77.test38714");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.lowerCase("      AAAA...      AAAA...      AAAA...      AAAA...      AAAA...      AAAA...      AAAA...      AAAA...      AAAA...      AAAA...      AAAA...      AAAA...      AAAA...      AAAA...      AAAA...      AAAA...      AAAA...      AAAA...      AAAA...      AAAA...      AAAA...      AAAA...      AAAA...      AAAA...      AAAA...      AAAA...      AAAA...      AAAA...      AAAA...      AAAA...      AAAA...      AAAA...      AAAA...      AAAA...      AAAA...      AAAA...      AAAA...      AAAA...      AAAA...      AAAA...      AAAA...      AAAA...      AAAA...      AAAA...      AAAA...      AAAA...      AAAA...      AAAA...      AAAA...      AAAA...      AAAA...      AAAA...      AAAA...      AAAA...      AAAA...      AAAA...      AAAA...      AAAA...      AAAA...      AAAA...      AAAA...      AAAA...      AAAA...      AAAA...");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "      aaaa...      aaaa...      aaaa...      aaaa...      aaaa...      aaaa...      aaaa...      aaaa...      aaaa...      aaaa...      aaaa...      aaaa...      aaaa...      aaaa...      aaaa...      aaaa...      aaaa...      aaaa...      aaaa...      aaaa...      aaaa...      aaaa...      aaaa...      aaaa...      aaaa...      aaaa...      aaaa...      aaaa...      aaaa...      aaaa...      aaaa...      aaaa...      aaaa...      aaaa...      aaaa...      aaaa...      aaaa...      aaaa...      aaaa...      aaaa...      aaaa...      aaaa...      aaaa...      aaaa...      aaaa...      aaaa...      aaaa...      aaaa...      aaaa...      aaaa...      aaaa...      aaaa...      aaaa...      aaaa...      aaaa...      aaaa...      aaaa...      aaaa...      aaaa...      aaaa...      aaaa...      aaaa...      aaaa...      aaaa..." + "'", str1, "      aaaa...      aaaa...      aaaa...      aaaa...      aaaa...      aaaa...      aaaa...      aaaa...      aaaa...      aaaa...      aaaa...      aaaa...      aaaa...      aaaa...      aaaa...      aaaa...      aaaa...      aaaa...      aaaa...      aaaa...      aaaa...      aaaa...      aaaa...      aaaa...      aaaa...      aaaa...      aaaa...      aaaa...      aaaa...      aaaa...      aaaa...      aaaa...      aaaa...      aaaa...      aaaa...      aaaa...      aaaa...      aaaa...      aaaa...      aaaa...      aaaa...      aaaa...      aaaa...      aaaa...      aaaa...      aaaa...      aaaa...      aaaa...      aaaa...      aaaa...      aaaa...      aaaa...      aaaa...      aaaa...      aaaa...      aaaa...      aaaa...      aaaa...      aaaa...      aaaa...      aaaa...      aaaa...      aaaa...      aaaa...");
    }

    @Test
    public void test38715() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest77.test38715");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("                          \\u0023\\u0023\\u0023\\u0023\\u0023\\16                          ");
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test38716() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest77.test38716");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.containsWhitespace("          \\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\           ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test38717() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest77.test38717");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.containsWhitespace("iiiiiiiiiiiiiiiiiiiiiiiiiiiU005Ciiiiiiiiiiiiiiiiiiiiiiiiiiii                                  ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test38718() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest77.test38718");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.contains("000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000", 45);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test38719() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest77.test38719");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOfIgnoreCase("hAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA", "u003aaaaaau003aaaaaau003aaaaaau0...                          ...u003aaaaaau003aaaaaau003aaaaaau0");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test38720() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest77.test38720");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.split("10hi!100");
        boolean boolean4 = org.apache.commons.lang3.StringUtils.startsWithAny("\\", strArray3);
        int int5 = org.apache.commons.lang3.StringUtils.indexOfDifference((java.lang.CharSequence[]) strArray3);
        boolean boolean6 = org.apache.commons.lang3.StringUtils.endsWithAny("61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\U61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61", strArray3);
        java.lang.String[] strArray7 = org.apache.commons.lang3.StringUtils.stripAll(strArray3);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str11 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray3, "...\\ 51\\ 51\\ 51\\ 51\\ 51\\ 51\\ 51\\ 51\\ 51\\ 51\\ 51\\ 51\\ 51\\ 51\\ 51\\ 51\\ 51\\ 51...", 0, 130);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(strArray7);
    }

    @Test
    public void test38721() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest77.test38721");
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.overlay("iiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiii###########U005cu0u005cu0u0023Uu005cu0u005cu0###########", "................U0023                                            ................", 19, 112);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "iiiiiiiiiiiiiiiiiii................U0023                                            ................iiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiii###########U005cu0u005cu0u0023Uu005cu0u005cu0###########" + "'", str4, "iiiiiiiiiiiiiiiiiii................U0023                                            ................iiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiii###########U005cu0u005cu0u0023Uu005cu0u005cu0###########");
    }

    @Test
    public void test38722() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest77.test38722");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.chomp("0UUU\\U3200UUU\\U3200UUU\\U3200UUU\\U3200UUU\\U32057                                                                                                                             1", "AAAA...aaaaaahhhhhhhhhhhhhhhhhaaaaaahhhhhhhhhhhhhhhhh");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "0UUU\\U3200UUU\\U3200UUU\\U3200UUU\\U3200UUU\\U32057                                                                                                                             1" + "'", str2, "0UUU\\U3200UUU\\U3200UUU\\U3200UUU\\U3200UUU\\U32057                                                                                                                             1");
    }

    @Test
    public void test38723() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest77.test38723");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.startsWithIgnoreCase("                                                             u003u0023u0023u0023u0023u0023u0023", "\\U0061\\U0061\\U0061\\U0061\\   u61    1\\U0061\\U0061\\U0061\\U0061                                    ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test38724() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest77.test38724");
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.replace("111", "                                                                                          ", "23     ...", (-1));
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "111" + "'", str4, "111");
    }

    @Test
    public void test38725() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest77.test38725");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.endsWith("uuuuuuuuuuuu 3200", "5500u\\aaaaaaaaaa                                            5500u\\aaaaaaaaaa6\\16\\16\\16\\16\\16\\16\\16\\16\\16\\16\\16\\16\\16\\16\\16\\16\\16\\16\\16\\16\\16\\16\\16\\16\\16\\16\\16\\16                                  5500u\\aaaaaaaaaa                                            5500u\\aaaaaaaaaa");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test38726() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest77.test38726");
        int int3 = org.apache.commons.lang3.StringUtils.indexOf("00u\\0200u\\0200u\\0200u\\02", "                                                                                                                                                                 ", 84);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test38727() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest77.test38727");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.difference("\\U00685555555555555555555555555555555555555555555555555555555555555555555555", "1h!1020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u00   020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u00   020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u00   020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u00   020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u00   020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u00   020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u00   020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u00   020\\u0020\\u0020\\u0020\\u0020\\u002");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "1h!1020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u00   020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u00   020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u00   020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u00   020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u00   020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u00   020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u00   020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u00   020\\u0020\\u0020\\u0020\\u0020\\u002" + "'", str2, "1h!1020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u00   020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u00   020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u00   020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u00   020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u00   020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u00   020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u00   020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u00   020\\u0020\\u0020\\u0020\\u0020\\u002");
    }

    @Test
    public void test38728() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest77.test38728");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("\\3200u\\3200u\\3200u\\3200u\\3200u\\3200u\\3200u\\3200u\\3200u\\3200uu3200u\\3200u\\3200u\\3200u\\3200u\\3200u\\3200u\\3200u\\3200u\\3200u0020", "5C11111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111");
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.stripAll(strArray3);
        int int5 = org.apache.commons.lang3.StringUtils.lastIndexOfAny("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", strArray4);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
    }

    @Test
    public void test38729() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest77.test38729");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.split("      AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA 61AAAAAAAAAAAAAAAAAAAAAAAAAAAA", "23\\U", 117);
        java.lang.String[] strArray5 = org.apache.commons.lang3.StringUtils.stripAll(strArray3, "\\16 \\16 \\16 \\16 \\16 \\16 \\16 \\16 \\16 \\16 \\16u \\16 \\16 \\16 \\16 \\16 \\16 \\16 \\16 \\16 \\16");
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertNotNull(strArray5);
    }

    @Test
    public void test38730() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest77.test38730");
        char[] charArray13 = new char[] { 'u', '#', 'a', '\\', 'a' };
        boolean boolean14 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "u61", charArray13);
        boolean boolean15 = org.apache.commons.lang3.StringUtils.containsAny("23\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u002", charArray13);
        boolean boolean16 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "5C", charArray13);
        boolean boolean17 = org.apache.commons.lang3.StringUtils.containsAny("  \\U005C  ", charArray13);
        boolean boolean18 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "111111111111111111111111111111111111111111111111111111111111111111111111111111111111...", charArray13);
        int int19 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "\r\r\r\r\r\r\r\\400326666666666666666666666666666666666666666666\r\r\r\r\r\r\r\r", charArray13);
        int int20 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                   aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", charArray13);
        boolean boolean21 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "\\u0023\\", charArray13);
        org.junit.Assert.assertNotNull(charArray13);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray13), "u#a\\a");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray13), "u#a\\a");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray13), "[u, #, a, \\, a]");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 7 + "'", int19 == 7);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
    }

    @Test
    public void test38731() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest77.test38731");
        int int2 = org.apache.commons.lang3.StringUtils.countMatches("00000000000033u33233u33233u33233u33233u33233u33233u33233u33233u33233u33233u33233u33233u33233u33233u3\n06u", " 61uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test38732() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest77.test38732");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.chomp("                                           \\\\335c");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "                                           \\\\335c" + "'", str1, "                                           \\\\335c");
    }

    @Test
    public void test38733() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest77.test38733");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBeforeLast("1616 \\16 \\16 \\1616 \\16 \\1616 \\16 \\1616 \\16 \\1                                                 ", "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "1616 \\16 \\16 \\1616 \\16 \\1616 \\16 \\1616 \\16 \\1                                                 " + "'", str2, "1616 \\16 \\16 \\1616 \\16 \\1616 \\16 \\1616 \\16 \\1                                                 ");
    }

    @Test
    public void test38734() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest77.test38734");
        char[] charArray13 = new char[] { ' ' };
        int int14 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "10hi!100", charArray13);
        boolean boolean15 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "\\U0023", charArray13);
        int int16 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa 61aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", charArray13);
        boolean boolean17 = org.apache.commons.lang3.StringUtils.containsAny("                                                                                                 aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", charArray13);
        boolean boolean18 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "5700u\\   2  5700u\\   2  5700u\\   2  5700u\\   2  5700u\\   2  5700u\\   2  5700u\\   2  5700u\\   2  5700u\\   2  5700u\\   2  5700u\\   2  5700u\\   2  5700u\\   2  5700u\\   2  5700u\\   2  5700u\\   2  5700u\\   2  5700u\\   2  5700u\\   2  5700u\\   2  5700u\\   2  5700u\\   2  5700u\\   2  5700u\\   2  5700u\\   2  5700u\\   2  5700u\\   2  5700u\\   2  5700u\\   2  5700u\\   2  5700u\\   2  5700u\\   2  5700u\\   2  5700u\\   2  5700u\\   2  5700u\\   2  5700u\\   2  5700u\\   2  5700u\\   2  5700u\\   2  5700u\\   2  5700u\\   2  5700u\\   2  5700u\\   2  5700u\\   2  5700u\\   2  5700u\\   2  5700u\\   2  5700u\\   2  5700u\\   2  5700u\\", charArray13);
        boolean boolean19 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023 ...", charArray13);
        boolean boolean20 = org.apache.commons.lang3.StringUtils.containsAny("3", charArray13);
        int int21 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "  \n\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0", charArray13);
        int int22 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "1111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111", charArray13);
        boolean boolean23 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu ...uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu", charArray13);
        boolean boolean24 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\222223200U\\1400u\\00U\\3200U\\22222", charArray13);
        boolean boolean25 = org.apache.commons.lang3.StringUtils.containsAny("U62 \\U00220\\u0020\\u0020\\u0020\\u00    U62 \\U002\\U002066666666666666666666666666666666666666", charArray13);
        org.junit.Assert.assertNotNull(charArray13);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray13), " ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray13), " ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray13), "[ ]");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 2 + "'", int21 == 2);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
    }

    @Test
    public void test38735() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest77.test38735");
        char char2 = org.apache.commons.lang3.CharUtils.toChar((java.lang.Character) '\n', 'i');
        org.junit.Assert.assertTrue("'" + char2 + "' != '" + '\n' + "'", char2 == '\n');
    }

    @Test
    public void test38736() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest77.test38736");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.stripStart("533333333333333333333333333333\\40032333333333333333333333333333333C", "222222222222222222222222222222222222222222222222222222");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "533333333333333333333333333333\\40032333333333333333333333333333333C" + "'", str2, "533333333333333333333333333333\\40032333333333333333333333333333333C");
    }

    @Test
    public void test38737() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest77.test38737");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.split("", "1\\hi!hi!hi!00000000000000000000000000000000000000000000000000000000000000000000000000");
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test38738() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest77.test38738");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isWhitespace((java.lang.CharSequence) "...\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U002");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test38739() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest77.test38739");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replace("AAAAAAAAAAAAAAAAAAAAAAAAA3AAAAAAAAAAAAAAAAAAAAAAAAAA", "  \nu0020u0020u0020u0020u0020u0020u0020u0020u0020u0020u0020u0020u0020u0020u0020u0  \nu0020u0020u0020u0020u0020u0020u0020u0020u0020u0020u0020u0020u0020u0020u0020u0", "66666666666666666666666666666666666666666666666666666666666666666666666666666666666666575757575757575757575757575757575757575757575757575111666666666666666666666666666666666666666666666666666666666666666666666666666666666666666");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "AAAAAAAAAAAAAAAAAAAAAAAAA3AAAAAAAAAAAAAAAAAAAAAAAAAA" + "'", str3, "AAAAAAAAAAAAAAAAAAAAAAAAA3AAAAAAAAAAAAAAAAAAAAAAAAAA");
    }

    @Test
    public void test38740() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest77.test38740");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.reverseDelimited("61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\u61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\\\400326666666666666666666666666", '6');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "1\\\\4003261\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\u61\\61\\61\\61\\61\\61\\61\\61\\61\\" + "'", str2, "1\\\\4003261\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\u61\\61\\61\\61\\61\\61\\61\\61\\61\\");
    }

    @Test
    public void test38741() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest77.test38741");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceChars("23U0023\\U0023\\U\\4003U0023\\U0023\\U0##########u0023U0023\\U0023\\U\\4003U0023\\U0023\\U0##########u0023U0023\\U0023\\U\\4003U0", "Aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa 61aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa                                                                                                                                                                       ", " 6...");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "23U0023\\U0023\\U\\4003U0023\\U0023\\U0##########u0023U0023\\U0023\\U\\4003U0023\\U0023\\U0##########u0023U0023\\U0023\\U\\4003U0" + "'", str3, "23U0023\\U0023\\U\\4003U0023\\U0023\\U0##########u0023U0023\\U0023\\U\\4003U0023\\U0023\\U0##########u0023U0023\\U0023\\U\\4003U0");
    }

    @Test
    public void test38742() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest77.test38742");
        int int1 = org.apache.commons.lang3.StringUtils.length((java.lang.CharSequence) "                                                                         23\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u002");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 116 + "'", int1 == 116);
    }

    @Test
    public void test38743() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest77.test38743");
        char[] charArray13 = new char[] { '4', ' ', ' ', ' ', '4' };
        boolean boolean14 = org.apache.commons.lang3.StringUtils.containsAny("hi!", charArray13);
        boolean boolean15 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "10hi!100", charArray13);
        int int16 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "\\u0061", charArray13);
        boolean boolean17 = org.apache.commons.lang3.StringUtils.containsAny("23                                               ...", charArray13);
        int int18 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\u61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\", charArray13);
        int int19 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "23U0023\\U0023\\U\\4003U0023\\U0023\\U0##########u0023U0023\\U0023\\U\\4003U0023\\U0023\\U0##########u0023U0023\\U0023\\U\\4003U0023\\U0023\\U0##########u0023U0023\\U0023\\U\\4003U0023\\U0023\\U0##########u0023U0023\\U0023\\U\\4003U0023\\U0023\\U0##########u0023U0023\\U0023\\U\\4003U0023\\U0023\\U0##########u0023U0023\\U0023\\U\\4003U0023\\U0023\\U0##########u0023U0023\\U0023\\U\\4003U0023\\U0023\\U0##########u0023U0023\\U0023\\U\\4003U0023\\U0023\\U0##########u00", charArray13);
        int int20 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "                  aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa                   ", charArray13);
        int int21 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                         ", charArray13);
        org.junit.Assert.assertNotNull(charArray13);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray13), "4   4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray13), "4   4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray13), "[4,  ,  ,  , 4]");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 18 + "'", int20 == 18);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
    }

    @Test
    public void test38744() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest77.test38744");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.mid("0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023     ", 370, 35);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test38745() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest77.test38745");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOf("..                    0u\\00U\\3200U\\                                      43200U\\1                                         ", "\\U0068", 861);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test38746() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest77.test38746");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitByCharacterTypeCamelCase("        75");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray1, 'h');
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "        h75" + "'", str3, "        h75");
    }

    @Test
    public void test38747() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest77.test38747");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAsciiPrintable((java.lang.CharSequence) "2.................................................................................................");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test38748() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest77.test38748");
        char[] charArray11 = new char[] { ' ' };
        int int12 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "10hi!100", charArray11);
        boolean boolean13 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "\\U0023", charArray11);
        int int14 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa 61aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", charArray11);
        int int15 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) " 61uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu", charArray11);
        int int16 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "                                                                                                        aaaaaaa     ", charArray11);
        int int17 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaau6", charArray11);
        boolean boolean18 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "\\u0033", charArray11);
        boolean boolean19 = org.apache.commons.lang3.StringUtils.containsAny("AA                  AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA", charArray11);
        int int20 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "20\\u0020\\u0020\\u0020\\u00", charArray11);
        int int21 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "                                                                                                                                                             \\U0020\\U0020\\U0020\\U0020\\U0020\\U0020\\U0020\\U0020\\U0020\\U0020\\U0020\\U0020\\U0020\\U0020\\U0020\\U0", charArray11);
        org.junit.Assert.assertNotNull(charArray11);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray11), " ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray11), " ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray11), "[ ]");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 104 + "'", int16 == 104);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
    }

    @Test
    public void test38749() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest77.test38749");
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.overlay("!ih16\\16\\16\\16\\16\\16\\16\\16\\16\\16\\16\\16u\\16\\16\\16\\16\\16\\16\\16\\16\\16\\16\\16                                 3200u", "                   \\u0037                    ", 178, 205);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "!ih16\\16\\16\\16\\16\\16\\16\\16\\16\\16\\16\\16u\\16\\16\\16\\16\\16\\16\\16\\16\\16\\16\\16                                 3200u                   \\u0037                    " + "'", str4, "!ih16\\16\\16\\16\\16\\16\\16\\16\\16\\16\\16\\16u\\16\\16\\16\\16\\16\\16\\16\\16\\16\\16\\16                                 3200u                   \\u0037                    ");
    }

    @Test
    public void test38750() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest77.test38750");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.defaultIfBlank("", "    2222222222222222222222222222222222    2222222222222222222222222222222222    22222222...0u\\3200u\\3200u\\3200u\\3200u\\3200u\\3200u\\3200u\\");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "    2222222222222222222222222222222222    2222222222222222222222222222222222    22222222...0u\\3200u\\3200u\\3200u\\3200u\\3200u\\3200u\\3200u\\" + "'", str2, "    2222222222222222222222222222222222    2222222222222222222222222222222222    22222222...0u\\3200u\\3200u\\3200u\\3200u\\3200u\\3200u\\3200u\\");
    }

    @Test
    public void test38751() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest77.test38751");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripToNull("\\u0023\\u\\u");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "\\u0023\\u\\u" + "'", str1, "\\u0023\\u\\u");
    }

    @Test
    public void test38752() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest77.test38752");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.normalizeSpace("6666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666\\U0023                                                                                     HI!HI!HI!aaaaaaaaaaa");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "6666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666\\U0023 HI!HI!HI!aaaaaaaaaaa" + "'", str1, "6666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666\\U0023 HI!HI!HI!aaaaaaaaaaa");
    }

    @Test
    public void test38753() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest77.test38753");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAllLowerCase((java.lang.CharSequence) " 61\\ 61\\61hhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhh");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test38754() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest77.test38754");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeStart("AAAA                            ", "u ...... \\u0041\\u0041\\u0041\\u0041\\u0041\\u0041\\u0041\\u0041\\u0041\\u0041\\u004 61\\\\uu ...... \\u0041\\u0041\\u00u61\\u0020\\u0020\\u0020\\u0020\\u0020\\u0");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "AAAA                            " + "'", str2, "AAAA                            ");
    }

    @Test
    public void test38755() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest77.test38755");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.difference("           \n\n1", "u200u\\u200u\\u200u\\u200u\\u200u\\u200u\\u200u\\u200u\\u261\\ u61\\ 61\\ 61\\ 61\\ 61\\  61\\ u61\\ 61\\ 61\\ 61\\ 61\\77777");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "u200u\\u200u\\u200u\\u200u\\u200u\\u200u\\u200u\\u200u\\u261\\ u61\\ 61\\ 61\\ 61\\ 61\\  61\\ u61\\ 61\\ 61\\ 61\\ 61\\77777" + "'", str2, "u200u\\u200u\\u200u\\u200u\\u200u\\u200u\\u200u\\u200u\\u261\\ u61\\ 61\\ 61\\ 61\\ 61\\  61\\ u61\\ 61\\ 61\\ 61\\ 61\\77777");
    }

    @Test
    public void test38756() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest77.test38756");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.contains("\\u003\\u0023\\u0023\\u0023\\                                                                                                                ", 202);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test38757() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest77.test38757");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlpha((java.lang.CharSequence) "uuuuuuuuuuuuuu1111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111c5uuuuuuuuuuuuuu");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test38758() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest77.test38758");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBefore(" 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\                   \\U0033                    61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\", "61...... 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ ...                            ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + " 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\                   \\U0033                    61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\" + "'", str2, " 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\                   \\U0033                    61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\");
    }

    @Test
    public void test38759() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest77.test38759");
        java.util.Locale locale1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.apache.commons.lang3.StringUtils.upperCase("####A000U\\", locale1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test38760() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest77.test38760");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAsciiPrintable((java.lang.CharSequence) "1\\U00234                                      \\U0023\\U00\\u00");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test38761() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest77.test38761");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeEndIgnoreCase("55", "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "55" + "'", str2, "55");
    }

    @Test
    public void test38762() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest77.test38762");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceChars("                                                                                               555555555555555                                                                                               ", '3', 'U');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "                                                                                               555555555555555                                                                                               " + "'", str3, "                                                                                               555555555555555                                                                                               ");
    }

    @Test
    public void test38763() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest77.test38763");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.chomp("cccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccUccccccccccccccccc61cccccccc61cccccccc61cccccccc61cccccccc61cccccccc61cccccccc61cccccccc61cccccccc61cccccccc61cccccccc61cccccccc61cccccccc61ccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccUccccccccccccc");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "cccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccUccccccccccccccccc61cccccccc61cccccccc61cccccccc61cccccccc61cccccccc61cccccccc61cccccccc61cccccccc61cccccccc61cccccccc61cccccccc61cccccccc61ccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccUccccccccccccc" + "'", str1, "cccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccUccccccccccccccccc61cccccccc61cccccccc61cccccccc61cccccccc61cccccccc61cccccccc61cccccccc61cccccccc61cccccccc61cccccccc61cccccccc61cccccccc61ccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccUccccccccccccc");
    }

    @Test
    public void test38764() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest77.test38764");
        char[] charArray9 = new char[] { '#' };
        boolean boolean10 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "\\u0061", charArray9);
        boolean boolean11 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "U61\n\\U0020\\U0020\\U0020\\U0020\\U0020\\U0020\\U0020\\U0020\\U0020\\U0020\\U0020\\U0020\\U0020\\U0020\\U00", charArray9);
        int int12 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "hi!hi!hi!", charArray9);
        boolean boolean13 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "u", charArray9);
        boolean boolean14 = org.apache.commons.lang3.StringUtils.containsAny("23                                                                                     hi!hi!hi!", charArray9);
        boolean boolean15 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "61uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu                                  3200u61uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu                                  3200u61uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu                                  3200u61uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu                                  3200u61uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu                                  3200u61uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu                       U0023\\U0023\\U\\4003U0023\\U0023\\U0##########", charArray9);
        boolean boolean16 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "\\u0034", charArray9);
        int int17 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "          \\U000AAAAAAAAAAAAAA3200U\\A          ", charArray9);
        org.junit.Assert.assertNotNull(charArray9);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray9), "#");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray9), "#");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray9), "[#]");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
    }

    @Test
    public void test38765() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest77.test38765");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.split("uuuuuuuuuuuuuuu0023uuuuuuuuuuuuuuuu", "0uUu\\u3200uUu\\u3200uUu\\u3200uUu\\u3200uUu\\u32057", 80);
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.concat((java.lang.Object[]) strArray3);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
    }

    @Test
    public void test38766() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest77.test38766");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBefore("\\ 61\\61                                                                                                                                                                                                                                                                                                                                                                                                                                          ", "555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\\ 61\\61                                                                                                                                                                                                                                                                                                                                                                                                                                          " + "'", str2, "\\ 61\\61                                                                                                                                                                                                                                                                                                                                                                                                                                          ");
    }

    @Test
    public void test38767() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest77.test38767");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.equals((java.lang.CharSequence) "  \\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023    ...777777777777777777777777777777777777777777hhhhhhhhhhhhhuuuuuuuhhhhhhhhhhhhhuuuuuuuhhhhhhhhhhhhhuuuuuuuhhhhhhhhhhhhhuuuuuuuhhhhhhhhhhhhhuuuuuuuhhhhhhhhhhhhhuuuuuuuhhhhhhhhhhhhhuuuuuuuhhhhhhhhhh", (java.lang.CharSequence) " uuuuuuuuuuU6uuuuuuuuuuu                         ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test38768() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest77.test38768");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.split("\\u0041");
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test38769() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest77.test38769");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripToEmpty("                                                                                                                                                           uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu       \\40032                                                                                                                                                            ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu       \\40032" + "'", str1, "uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu       \\40032");
    }

    @Test
    public void test38770() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest77.test38770");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.strip("... 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ ...                                A\\u002AAAAAAAAAAAAAa000u\\                                                                 A\\u", "... 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ ...                                A\\u0023AAAAAAAAAAAAAa000u\\                                                                 A");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test38771() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest77.test38771");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.split("5c11111111111111111111111111 61\\ 1111111111111111111111", 'a');
        boolean boolean4 = org.apache.commons.lang3.StringUtils.endsWithAny("\\u0023\\u\\", strArray3);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test38772() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest77.test38772");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("U0023\\U00\\u0041\\U0023", "                            ", 1000);
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void test38773() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest77.test38773");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.leftPad("222222222222222222222222222222222222222222222222222222222222u   66666666666666666666666666666666666", (int) 'a');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "222222222222222222222222222222222222222222222222222222222222u   66666666666666666666666666666666666" + "'", str2, "222222222222222222222222222222222222222222222222222222222222u   66666666666666666666666666666666666");
    }

    @Test
    public void test38774() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest77.test38774");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsAny("###\n\\u002                                         \n\n1         1        61   ", "75");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test38775() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest77.test38775");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsAny("61        61", "33333333333333333333");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test38776() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest77.test38776");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.deleteWhitespace("1111111111..");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "1111111111.." + "'", str1, "1111111111..");
    }

    @Test
    public void test38777() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest77.test38777");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.deleteWhitespace("U0023\\U0023UUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "U0023\\U0023UUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU" + "'", str1, "U0023\\U0023UUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU");
    }

    @Test
    public void test38778() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest77.test38778");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.split("U", "\n\n1");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.getCommonPrefix(strArray2);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "U" + "'", str3, "U");
    }

    @Test
    public void test38779() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest77.test38779");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.startsWithIgnoreCase("                                                                             23\\u###\n\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0###u", "3200u\\3200u\\3200u\\3200u\\3200u\\");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test38780() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest77.test38780");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripAccents((java.lang.CharSequence) "                                                                                                         \\U0023\\U00\\u0041\\U                                                                                                                                            ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "                                                                                                         \\U0023\\U00\\u0041\\U                                                                                                                                            " + "'", str1, "                                                                                                         \\U0023\\U00\\u0041\\U                                                                                                                                            ");
    }

    @Test
    public void test38781() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest77.test38781");
        int int3 = org.apache.commons.lang3.StringUtils.indexOfIgnoreCase("      3200uUu\\u3200uUu\\u3200uUu\\u3200uUu\\u3200uUu\\u3200uUu\\u3200uUu61uuuuuuuuuuuuuuuuuu3\\u0...\\U00", "1\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 61", 250);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test38782() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest77.test38782");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.contains("\\U000D", (int) 'c');
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test38783() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest77.test38783");
        java.lang.String[] strArray0 = null;
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.stripAll(strArray0, "\\U0061\\U0061\\U0061\\U0061\\   u61    1\\U0061\\U0061\\U0061\\U0061                                    \\U0061\\U0061\\U0061\\U0061\\   u61    1\\U0061\\U0061\\U0061\\U0061                                    \\U0061\\U0061\\U0061\\U0061\\   u61    1\\U0061\\U0061\\U0061\\U0061                                    \\U0061\\U0061\\U0061\\U0061\\   u61    1\\U0061\\U0061\\U0061\\U0061");
        org.junit.Assert.assertNull(strArray2);
    }

    @Test
    public void test38784() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest77.test38784");
        char[] charArray15 = new char[] { '4', ' ', ' ', ' ', '4' };
        boolean boolean16 = org.apache.commons.lang3.StringUtils.containsAny("hi!", charArray15);
        boolean boolean17 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "10hi!100", charArray15);
        int int18 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "\\u0061", charArray15);
        int int19 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "hi!", charArray15);
        boolean boolean20 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "1111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111", charArray15);
        int int21 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "\\u0020", charArray15);
        int int22 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "  2   ", charArray15);
        int int23 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "\\u0032", charArray15);
        boolean boolean24 = org.apache.commons.lang3.StringUtils.containsAny("Aaaaaaa       ", charArray15);
        boolean boolean25 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "           A\\u0023AAAAAAAAAAAAA                                      ", charArray15);
        org.junit.Assert.assertNotNull(charArray15);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray15), "4   4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray15), "4   4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray15), "[4,  ,  ,  , 4]");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + (-1) + "'", int23 == (-1));
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
    }

    @Test
    public void test38785() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest77.test38785");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("61\\ U61\\ 61\\ 61\\ 61\\ 61\\  61\\ U61\\ 61\\ 61\\ 61\\ 61\\", "0023\\u0023\\u0023\\u0023\\u0023\\u006\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\", 18);
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray3, "AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA  ......", 241, 18);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
    }

    @Test
    public void test38786() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest77.test38786");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.split("20Cu0020Cu0020Cu0020Cu00", '\\');
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test38787() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest77.test38787");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.endsWithIgnoreCase("\r\r\r\r\r\r\\u0061\\u0061\\u\\U0023\\u0061\\u0061\\u0\r\r\r\r\r\r\r\r", "AAAAAAAAAAAAA3200\\A");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test38788() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest77.test38788");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.contains("6666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666", 562);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test38789() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest77.test38789");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.rightPad("IUI0020\\4\n\n.............................................................................IUI0020\\4\n\n....................................................u61IUI0020\\4\n\n.............................................................................IUI0020\\4\n\n.....................................................", 78);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "IUI0020\\4\n\n.............................................................................IUI0020\\4\n\n....................................................u61IUI0020\\4\n\n.............................................................................IUI0020\\4\n\n....................................................." + "'", str2, "IUI0020\\4\n\n.............................................................................IUI0020\\4\n\n....................................................u61IUI0020\\4\n\n.............................................................................IUI0020\\4\n\n.....................................................");
    }

    @Test
    public void test38790() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest77.test38790");
        int int3 = org.apache.commons.lang3.StringUtils.indexOfIgnoreCase("h                                                                ", "33", (int) '6');
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test38791() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest77.test38791");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.uncapitalize((java.lang.CharSequence) "61UUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU61UUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU61UUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU61UUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU61UUUUUUUUUUUUUUUUU                                                                                                        aaaaaaa     ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "61UUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU61UUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU61UUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU61UUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU61UUUUUUUUUUUUUUUUU                                                                                                        aaaaaaa     " + "'", str1, "61UUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU61UUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU61UUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU61UUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU61UUUUUUUUUUUUUUUUU                                                                                                        aaaaaaa     ");
    }

    @Test
    public void test38792() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest77.test38792");
        java.lang.CharSequence charSequence2 = org.apache.commons.lang3.StringUtils.defaultIfEmpty((java.lang.CharSequence) "\\                                                                             23\\U###\n\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0###U", (java.lang.CharSequence) "...hhhhhhhhhhhhhhhhhhhhhU61hhhhhhhhhhhhhhhhhhhhhhh");
        org.junit.Assert.assertEquals("'" + charSequence2 + "' != '" + "\\                                                                             23\\U###\n\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0###U" + "'", charSequence2, "\\                                                                             23\\U###\n\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0###U");
    }

    @Test
    public void test38793() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest77.test38793");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.deleteWhitespace("uuuuuuuuuaaaaaaa       3200u\\32");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "uuuuuuuuuaaaaaaa3200u\\32" + "'", str1, "uuuuuuuuuaaaaaaa3200u\\32");
    }

    @Test
    public void test38794() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest77.test38794");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeStart("\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\...  h\\huh0023h\\huh0023h\\huh0023h\\huh0023h\\huh0023h\\huh0023h\\huh0023h                                                    ", "                                                 61\n");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\...  h\\huh0023h\\huh0023h\\huh0023h\\huh0023h\\huh0023h\\huh0023h\\huh0023h                                                    " + "'", str2, "\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\...  h\\huh0023h\\huh0023h\\huh0023h\\huh0023h\\huh0023h\\huh0023h\\huh0023h                                                    ");
    }

    @Test
    public void test38795() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest77.test38795");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNotEmpty((java.lang.CharSequence) "!ih!ih!ih   2    2    2  ...");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test38796() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest77.test38796");
        int int2 = org.apache.commons.lang3.CharUtils.toIntValue('\n', 57);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 57 + "'", int2 == 57);
    }

    @Test
    public void test38797() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest77.test38797");
        int int2 = org.apache.commons.lang3.StringUtils.getLevenshteinDistance((java.lang.CharSequence) "UUUU61UUUU                              23u0023\\u0023\\u\\4003u0023\\u0023\\u0##########U0023u0023\\u0023\\u\\4003u0023\\u0023\\u0##########U0023u0023\\u0023\\u\\4003u0023\\u0023\\u0##########U0023u0023\\u0023\\u\\4003u0023\\u0023\\u0##########U0023u0023\\u0023\\u\\4003u0023\\u0023\\u0##########U0023u0023\\u0023\\u\\4003u0023\\u0023\\u0##########U0023u0023\\u0023\\u\\4003u0023\\u0023\\u0##########U0023u0023\\u0023\\u\\4003u0023\\u0023\\u0##########U0023u0023\\u0023\\u\\4003u0023\\u0023\\u0##########U00", (java.lang.CharSequence) "0000000000000000000000000000000000000000000000000000000000000000000000000000000000000000............................3333333333333333333");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 365 + "'", int2 == 365);
    }

    @Test
    public void test38798() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest77.test38798");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitByCharacterTypeCamelCase("                    ...");
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test38799() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest77.test38799");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.startsWith("                                                                             23\\u0023\\u", "23\\0023\\0023\\0023\\0023\\0023\\0023\\0023111111111111111111111111111111111111111111111111111111111111111");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test38800() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest77.test38800");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.rightPad("\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023...", 40);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023..." + "'", str2, "\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023...");
    }

    @Test
    public void test38801() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest77.test38801");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "1!0h01", "...3\\U0023\\U0...\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0...");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 2 + "'", int2 == 2);
    }

    @Test
    public void test38802() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest77.test38802");
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("1111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111", "\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061", (int) (byte) 0);
        java.lang.String[] strArray6 = org.apache.commons.lang3.StringUtils.stripAll(strArray4, "");
        java.lang.String[] strArray9 = org.apache.commons.lang3.StringUtils.splitByCharacterTypeCamelCase("");
        int int10 = org.apache.commons.lang3.StringUtils.indexOfDifference((java.lang.CharSequence[]) strArray9);
        java.lang.String[] strArray13 = org.apache.commons.lang3.StringUtils.split("u61", 'U');
        java.lang.String str14 = org.apache.commons.lang3.StringUtils.replaceEach("      ", strArray9, strArray13);
        java.lang.String str15 = org.apache.commons.lang3.StringUtils.getCommonPrefix(strArray13);
        java.lang.String str16 = org.apache.commons.lang3.StringUtils.replaceEach("....................................................................................................", strArray6, strArray13);
        int int17 = org.apache.commons.lang3.StringUtils.indexOfDifference((java.lang.CharSequence[]) strArray6);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertNotNull(strArray9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertNotNull(strArray13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "      " + "'", str14, "      ");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "u61" + "'", str15, "u61");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "...................................................................................................." + "'", str16, "....................................................................................................");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
    }

    @Test
    public void test38803() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest77.test38803");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("u0020\\u0020\\u0020\\u0\\u005cuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu", "6\\ 6\\ 6\\u0023\\u0023\\u0023\\u002 61\\61U 61\\ 61\\610020\\ 61\\ 61\\61U 61\\ 61\\610020\\ 61\\ 61\\61U 61\\ 61\\610020\\ 61\\");
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray2, 'U');
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "u0020\\u0020\\u0020\\u0\\u005cuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu" + "'", str4, "u0020\\u0020\\u0020\\u0\\u005cuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu");
    }

    @Test
    public void test38804() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest77.test38804");
        char[] charArray7 = new char[] { '#' };
        boolean boolean8 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "\\u0061", charArray7);
        boolean boolean9 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "\\u0061", charArray7);
        boolean boolean10 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "2", charArray7);
        boolean boolean11 = org.apache.commons.lang3.StringUtils.containsAny("", charArray7);
        boolean boolean12 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "u00.3\\u00.3\\u00.3\\u00.3\\u00.3\\u00.3\\u00.3\\u00.3", charArray7);
        int int13 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u003", charArray7);
        org.junit.Assert.assertNotNull(charArray7);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray7), "#");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray7), "#");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray7), "[#]");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
    }

    @Test
    public void test38805() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest77.test38805");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphanumericSpace((java.lang.CharSequence) "61\\\\U0020 61\\\\U0020 61\\\\U0020 6 61\\\\U0020 61\\\\U0020 61\\\\U0020 61");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test38806() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest77.test38806");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNotBlank((java.lang.CharSequence) "AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test38807() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest77.test38807");
        int int2 = org.apache.commons.lang3.StringUtils.indexOf("61        61        61        61        61        61        61        61        61        61       ...", 116);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test38808() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest77.test38808");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isBlank((java.lang.CharSequence) "...                                                         ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test38809() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest77.test38809");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAsciiPrintable((java.lang.CharSequence) "3200uUu\\u3200uUu\\u3200uUu\\u3200uUu\\u3200uUu\\u3200uUu\\u3200uUu61uuuuuuuuuuuuuuuuuu3\\u0...\\U00");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test38810() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest77.test38810");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOf("\\U0023\\U00\\u0041\\U", "hCUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU                   hCUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU                   hCUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU                   hCUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU  ", 356);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test38811() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest77.test38811");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isWhitespace((java.lang.CharSequence) "\\U23\\U23\\U23\\U23\\U23\\U23\\U23                                                  ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test38812() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest77.test38812");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.upperCase(" 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\c111111111111111111111111111111111111111111111111111111111111111111111111111111111...");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + " 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\C111111111111111111111111111111111111111111111111111111111111111111111111111111111..." + "'", str1, " 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\C111111111111111111111111111111111111111111111111111111111111111111111111111111111...");
    }

    @Test
    public void test38813() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest77.test38813");
        char char2 = org.apache.commons.lang3.CharUtils.toChar((java.lang.Character) 'c', '\r');
        org.junit.Assert.assertTrue("'" + char2 + "' != '" + 'c' + "'", char2 == 'c');
    }

    @Test
    public void test38814() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest77.test38814");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.remove("51AAAA", 'a');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "51AAAA" + "'", str2, "51AAAA");
    }

    @Test
    public void test38815() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest77.test38815");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOf("\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\......aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaau61\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\......aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaau61\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\......aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaau61\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\......aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaau61\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\...", 14);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test38816() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest77.test38816");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceOnce("6uUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU 6\\\\u0020 6\\\\u0020 6              ", "\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\......aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaau61\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\......aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaau61\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\......aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaau61\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\......aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaau61\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\...", "Iaaaaaaaaaaaa");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "6uUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU 6\\\\u0020 6\\\\u0020 6              " + "'", str3, "6uUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU 6\\\\u0020 6\\\\u0020 6              ");
    }

    @Test
    public void test38817() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest77.test38817");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.leftPad("uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu       \\40032", 79);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                    uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu       \\40032" + "'", str2, "                    uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu       \\40032");
    }

    @Test
    public void test38818() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest77.test38818");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNotEmpty((java.lang.CharSequence) "U62 \\U00220\\u0020\\u0020\\u0020\\u00    U62 \\U002\\U002066666666666666666666666666666666666666");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test38819() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest77.test38819");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("1111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111", "61\\ 61\\61");
        int int4 = org.apache.commons.lang3.StringUtils.indexOfAny("                                                                                                                                                                        U0023\\U002U0023\\U002U0023\\U002U0                                                                                                                                                                         ", strArray3);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test38820() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest77.test38820");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphanumeric((java.lang.CharSequence) "1\\ 6161\\ 61\\ 6161\\ 61\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test38821() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest77.test38821");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("...  h\\huh0023h\\huh0023h\\huh0023h\\huh0023h\\huh0023h\\huh0023h\\huh0023h                                                    ", "3\\u23\\u23\\u23\\u23\\u23\\u23\\u23U6                                       23\\u23\\u23\\u23\\u23\\u23\\u23\\u23U6                                       23\\u23\\u23\\u23\\u23\\u23\\u23\\u23U6                                       ");
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test38822() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest77.test38822");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.leftPad("0UuU\\U3200UuU\\U3200UuU\\U3200UuU\\U3200UuU\\U32057                                                                                                                             1\\u0030UuU\\", 5, "                                 A\\u0023AAAAAAAAAAAAAa000u\\                                 3");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "0UuU\\U3200UuU\\U3200UuU\\U3200UuU\\U3200UuU\\U32057                                                                                                                             1\\u0030UuU\\" + "'", str3, "0UuU\\U3200UuU\\U3200UuU\\U3200UuU\\U3200UuU\\U32057                                                                                                                             1\\u0030UuU\\");
    }

    @Test
    public void test38823() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest77.test38823");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitByCharacterType("                  Uaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test38824() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest77.test38824");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isEmpty((java.lang.CharSequence) "\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023                                        ...");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test38825() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest77.test38825");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("3\\u002", "  U6                                            ");
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test38826() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest77.test38826");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.split("\n\n\n\n\n1\n\n\n\n\n1\n\n\n\n\n1\n\n\n\n\n1\n\n\n\n\n1\n\n\n\n\n1\n\n\n\n\n1\n\n\n\n\n1\n\n\n\n\n1\n\n\n\n\n1\n\n\n\n\n1\n\n\n\n\n1\n\n\n\n\n1\n\n\n\n\n1\n\n\n\n\n1\n\n\n\n\n1\n\n\n\n\n1\n\n\n\n\n1\n\n\n\n\n1\n\n\n\n\n1\n\n\n\n\n1\n\n\n\n\n1\n\n\n\n\n1\n\n\n\n\n1\n\n\n\n\n1\n\n\n\n\n1\n\n\n\n\n1\n\n\n\n\n1\n\n\n\n\n1\n\n\n\n\n1\n\n\n\n\n1\n\n\n\n\n1\n\n\n\n\n1\n\n\n\n\n1\n\n\n\n\n1\n\n\n\n\n1\n\n\n\n\n1\n\n\n\n\n1\n\n\n\n\n1\n\n\n\n\n1\n\n\n\n\n1\n\n\n\n\n1\n\n\n\n\n1\n\n\n\n\n1\n\n\n\n\n1\n\n\n\n\n1\n\n\n\n\n1\n\n\n\n\n", 'A');
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test38827() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest77.test38827");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.swapCase("aaaaaaa    hhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhh");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "AAAAAAA    HHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHH" + "'", str1, "AAAAAAA    HHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHH");
    }

    @Test
    public void test38828() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest77.test38828");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNumeric((java.lang.CharSequence) "22223200U\\1400u\\00U\\3200U61uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu61uuuuuuuuuuuuuuuuuuuuuuu");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test38829() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest77.test38829");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "         ", "Aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa         Aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa         Aaaaaaaaaaaaaaaaaaaaaaaaaaaaa23\\u23\\u23\\u23\\u23\\u23\\u23\\u23U6                                       23\\u23\\u23\\u23\\u23\\u23\\u23\\u23U6                                       23\\u23\\u23\\u23\\u23\\u23\\u23\\u23U6Aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa         Aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa         Aaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test38830() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest77.test38830");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.equalsIgnoreCase("23\\u23\\u23\\u23\\u23\\u23\\u23\\u23U6       ", "75 ...");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test38831() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest77.test38831");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceChars("6666AAAAAAAAAAAAAAAAAI6666AAAAAAAAAAAAAAAAAA", 'A', 'u');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "6666uuuuuuuuuuuuuuuuuI6666uuuuuuuuuuuuuuuuuu" + "'", str3, "6666uuuuuuuuuuuuuuuuuI6666uuuuuuuuuuuuuuuuuu");
    }

    @Test
    public void test38832() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest77.test38832");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.chomp("6 UUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU 6", "UUUUUUUUUUUUUUUUUUUUUUUUUUUU...11111111");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "6 UUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU 6" + "'", str2, "6 UUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU 6");
    }

    @Test
    public void test38833() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest77.test38833");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeStart(" U   6", "333336                                         \n\n                                         ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + " U   6" + "'", str2, " U   6");
    }

    @Test
    public void test38834() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest77.test38834");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.rightPad("61uuu", 0, '4');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "61uuu" + "'", str3, "61uuu");
    }

    @Test
    public void test38835() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest77.test38835");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsAny(" 61\\ 61\\ 61\\ 61\\ 61 61\\  61\\ 61\\ 61\\ 61\\ 61                                                            ", "AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test38836() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest77.test38836");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripAccents((java.lang.CharSequence) "uuuuu");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "uuuuu" + "'", str1, "uuuuu");
    }

    @Test
    public void test38837() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest77.test38837");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfAnyBut("u00.3\\u00.3\\u00.3\\u00.3\\u00.3\\u00.3\\u00.3\\u00.3", "aaaaaaaaaaaaaaaa...");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test38838() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest77.test38838");
        int int2 = org.apache.commons.lang3.StringUtils.countMatches("u00.3\\u00.3\\u00.3\\u00.3\\u00.3\\u00.3\\u00.3\\u00.3", "\\u0069");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test38839() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest77.test38839");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.endsWithIgnoreCase("hi!hi!hi!", "000000000000000000000000000000...                                                         000000000000000000000000000000...                                                         000000000000000000000000000000...                                                         ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test38840() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest77.test38840");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replace("AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA", "aUaa5CUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU", "  \\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023    ...");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA" + "'", str3, "AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA");
    }

    @Test
    public void test38841() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest77.test38841");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.split("\\\\0020");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray1);
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.stripAll(strArray1);
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\\\\0020" + "'", str2, "\\\\0020");
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void test38842() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest77.test38842");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.defaultString("23\\u0023\\u...", "23hi!hi!hi!                                                                          ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "23\\u0023\\u..." + "'", str2, "23\\u0023\\u...");
    }

    @Test
    public void test38843() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest77.test38843");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trimToEmpty("...UUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU 6\\\\u0061\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "...UUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU 6\\\\u0061\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61" + "'", str1, "...UUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU 6\\\\u0061\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61");
    }

    @Test
    public void test38844() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest77.test38844");
        java.lang.String[] strArray5 = org.apache.commons.lang3.StringUtils.splitByCharacterTypeCamelCase("");
        int int6 = org.apache.commons.lang3.StringUtils.indexOfDifference((java.lang.CharSequence[]) strArray5);
        int int7 = org.apache.commons.lang3.StringUtils.lastIndexOfAny("U61", strArray5);
        java.lang.String[] strArray9 = org.apache.commons.lang3.StringUtils.stripAll(strArray5, "61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ u61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61");
        java.lang.String[] strArray13 = org.apache.commons.lang3.StringUtils.split("23\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023", "61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ u61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61", 104);
        java.lang.String str14 = org.apache.commons.lang3.StringUtils.getCommonPrefix(strArray13);
        java.lang.String str15 = org.apache.commons.lang3.StringUtils.replaceEachRepeatedly("                                      \\U0023\\U00\\u0041\\U0023", strArray5, strArray13);
        java.lang.String[] strArray16 = org.apache.commons.lang3.StringUtils.stripAll(strArray13);
        java.lang.String[] strArray18 = org.apache.commons.lang3.StringUtils.stripAll(strArray16, "23\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u002");
        int int19 = org.apache.commons.lang3.StringUtils.lastIndexOfAny("1111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111", strArray18);
        java.lang.String str20 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray18);
        int int21 = org.apache.commons.lang3.StringUtils.lastIndexOfAny("323\\U00\\u0041\\U002\\U00266666666666666666666666666666666666666666666666666666", strArray18);
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertNotNull(strArray9);
        org.junit.Assert.assertNotNull(strArray13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "                                      \\U0023\\U00\\u0041\\U0023" + "'", str15, "                                      \\U0023\\U00\\u0041\\U0023");
        org.junit.Assert.assertNotNull(strArray16);
        org.junit.Assert.assertNotNull(strArray18);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 94 + "'", int19 == 94);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 76 + "'", int21 == 76);
    }

    @Test
    public void test38845() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest77.test38845");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.leftPad("                   0041hhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhh", 33, 'a');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "                   0041hhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhh" + "'", str3, "                   0041hhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhh");
    }

    @Test
    public void test38846() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest77.test38846");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.substringBetween("                              23U0023\\U0023\\U\\4003U0023\\U0023\\U0##########u0023U0023\\U0023\\U\\4003U0023\\U0023\\U0##########u0023U0023\\U0023\\U\\4003U0023\\U0023\\U0##########u0023U0023\\U0023\\U\\4003U0023\\U0023\\U0##########u0023U0023\\U0023\\U\\4003U0023\\U0023\\U0##########u0023U0023\\U0023\\U\\4003U0023\\U0023\\U0##########u0023U0023\\U0023\\U\\4003U0023\\U0023\\U0##########u0023U0023\\U0023\\U\\4003U0023\\U0023\\U0##########u0023U0023\\U0023\\U\\4003U0023\\U0023\\U0##########u00", " \\16 \\020016\\16 \\16 u16\\16 \\16 \\020016\\16 \\16 u16\\16 \\16 \\020016\\16 \\16 u16\\16 \\16 \\020016\\16 \\16 u16\\16 \\16 \\020016\\16 \\16 u16\\16 \\16 \\020016\\16 \\16 u16\\16 \\16 \\020016\\16 \\16 u16\\16 \\16 \\020016\\16 \\16 u16\\16 \\16 \\020016\\16 \\16 u16\\16 \\16 \\...6 \\66 \\6 \\66 \\6 \\66 \\6 \\6", "3322u\\3322u\\3322u\\...2u\\3322u\\3322u\\3322u\\3322u\\3322u\\33\\u22A8");
        org.junit.Assert.assertNull(str3);
    }

    @Test
    public void test38847() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest77.test38847");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.reverseDelimited("AAAA15AAAA", '\n');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "AAAA15AAAA" + "'", str2, "AAAA15AAAA");
    }

    @Test
    public void test38848() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest77.test38848");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOf("\\U0030uUu\\u3200uUu\\u3200uUu\\u3200uUu\\u3200uUu\\u320570uUu\\u3200uUu\\u3200uUu\\u3200uUu\\u3200uUu\\u320570uUu\\u3200uUu\\u3200uUu\\u3200uUu\\u3200uUu\\u320570uUu\\u3200uUu\\u3200uUu\\u3200uUu\\u3200uUu\\u320570uUu\\u3200uUu\\u3200uUu\\u3200uUu\\u3200uUu\\u320570uUu\\u3200uUu\\u3200uUu\\u3200uUu\\u3200uUu\\u320570uUu\\u3200uUu\\u3200uUu\\u3200uUu\\u3200uUu\\u320570uUu\\u3200uUu\\u3200uUu\\u3200uUu\\u3200uUu\\u320570uUu\\u3200uUu\\u3200uUu\\u3200uUu\\u3200uUu\\u320570uUu\\u3200uUu\\u3200uUu\\u3200uUu\\", "23\\U###\n\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0###", 7);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test38849() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest77.test38849");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.equalsIgnoreCase("...U0023\\U\\4003U0023\\U0023\\U0##########u0023U0023\\U00...", "1\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test38850() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest77.test38850");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.split("UUUUUU61\\ 61\\ 6161\\ 61\\ 661\\161\\161\\161\\161\\161\\U6                                          161\\161\\161\\161\\161\\161", "uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.concat((java.lang.Object[]) strArray2);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "UUUUUU61\\ 61\\ 6161\\ 61\\ 661\\161\\161\\161\\161\\161\\U6                                          161\\161\\161\\161\\161\\161" + "'", str3, "UUUUUU61\\ 61\\ 6161\\ 61\\ 661\\161\\161\\161\\161\\161\\U6                                          161\\161\\161\\161\\161\\161");
    }

    @Test
    public void test38851() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest77.test38851");
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.replace("\\u0023\\", "61AAAAAAAA61AAAAAAAA61AAAAAAAA61AAAAAAAA61AAAAAAAA61AAAAAAAA61AAAAAAAA6uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu", "\\u002e", 234);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "\\u0023\\" + "'", str4, "\\u0023\\");
    }

    @Test
    public void test38852() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest77.test38852");
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.split("23\\u23\\u23\\u23\\u23\\u23\\u23\\u23U6                                       ", "      aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa 61aaaaaaaaaaaaaaaaaaaaaaaaaaaa", (int) (short) -1);
        java.lang.String[] strArray6 = org.apache.commons.lang3.StringUtils.stripAll(strArray4, " 61\\ 61\\ 61\\ 61\\ 61 61\\  61\\ 61\\ 61\\ 61\\ 61");
        int int7 = org.apache.commons.lang3.StringUtils.indexOfAny("  U6                                            ", strArray4);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
    }

    @Test
    public void test38853() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest77.test38853");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.leftPad("23\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023U6                                      ", 94);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "          23\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023U6                                      " + "'", str2, "          23\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023U6                                      ");
    }

    @Test
    public void test38854() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest77.test38854");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.normalizeSpace("   a                             ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "a" + "'", str1, "a");
    }

    @Test
    public void test38855() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest77.test38855");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.split("uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuc500u\\0u\\0200u\\0200u\\0200u\\0200u\\0200u\\\n###55555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555", "6\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 6", 85);
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void test38856() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest77.test38856");
        char[] charArray7 = new char[] { ' ' };
        int int8 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "10hi!100", charArray7);
        boolean boolean9 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "\\U0023", charArray7);
        int int10 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa 61aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", charArray7);
        boolean boolean11 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "      aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa 61aaaaaaaaaaaaaaaaaaaaaaaaaaaa", charArray7);
        boolean boolean12 = org.apache.commons.lang3.StringUtils.containsAny("\n\n\n\n\n1", charArray7);
        int int13 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "4444444444 61\\ U61\\ 61\\ 61\\ 61\\ 61\\  61\\ U61\\ 61\\ 61\\ 61\\ 61\\", charArray7);
        org.junit.Assert.assertNotNull(charArray7);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray7), " ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray7), " ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray7), "[ ]");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
    }

    @Test
    public void test38857() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest77.test38857");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.defaultString("61\\uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu", "000u\\aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "61\\uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu" + "'", str2, "61\\uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu");
    }

    @Test
    public void test38858() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest77.test38858");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.deleteWhitespace("aaaaaaa      ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "aaaaaaa" + "'", str1, "aaaaaaa");
    }

    @Test
    public void test38859() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest77.test38859");
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("3", "U61", 69);
        int int5 = org.apache.commons.lang3.StringUtils.lastIndexOfAny("                                                                                          AAAAAAA      ", strArray4);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
    }

    @Test
    public void test38860() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest77.test38860");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.rightPad("... 16 16 16 16 16 16 16 16 16", (int) '\\', 'A');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "... 16 16 16 16 16 16 16 16 16AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA" + "'", str3, "... 16 16 16 16 16 16 16 16 16AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA");
    }

    @Test
    public void test38861() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest77.test38861");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.equalsIgnoreCase("3\\u0023\\u0023\\u0023                               ", "                   \\u0033                   UUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test38862() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest77.test38862");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trimToEmpty("575757575757575757575757575757575757575757575757575111");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "575757575757575757575757575757575757575757575757575111" + "'", str1, "575757575757575757575757575757575757575757575757575111");
    }

    @Test
    public void test38863() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest77.test38863");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.contains(" 61\\\\U0020 61\\\\U0020 61\\\\U0020 6 61\\\\U0020 61\\\\U0020 61\\\\U0020 61                                                                             6u666                                                                  ", 695);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test38864() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest77.test38864");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("\\UUU02\\UUU02\\UUU02\\aaaaaaaaaaaaa\\\\\\", 'a');
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test38865() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest77.test38865");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isWhitespace((java.lang.CharSequence) "                                                   3200u\\3200u\\3200u\\3200u\\3200u\\3200u\\3200u\\3200u\\3200u\\3200u\\");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test38866() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest77.test38866");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOfIgnoreCase("1111111     ", "23AAAAAAAAAAAAA0u0A", 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test38867() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest77.test38867");
        java.lang.CharSequence charSequence1 = null;
        char[] charArray8 = new char[] { '#' };
        boolean boolean9 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "\\u0061", charArray8);
        boolean boolean10 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "\\u0061", charArray8);
        boolean boolean11 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaau6166666666666666666666666666666666666", charArray8);
        boolean boolean12 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "00U\\3200U\\3200U\\3200U\\3200U\\3200", charArray8);
        boolean boolean13 = org.apache.commons.lang3.StringUtils.containsAny("  \\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023                                                    ", charArray8);
        int int14 = org.apache.commons.lang3.StringUtils.indexOfAny(charSequence1, charArray8);
        int int15 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaau6      61        61        61        61      ", charArray8);
        org.junit.Assert.assertNotNull(charArray8);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray8), "#");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray8), "#");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray8), "[#]");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
    }

    @Test
    public void test38868() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest77.test38868");
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("23\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u002", "23hi!hi!hi!                                                                          ");
        int int5 = org.apache.commons.lang3.StringUtils.indexOfAny("23hi!hi!hi!", strArray4);
        java.lang.String[] strArray7 = org.apache.commons.lang3.StringUtils.splitByCharacterType("44444444444444444444423\\u0023\\u444444444444444444444");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str8 = org.apache.commons.lang3.StringUtils.replaceEachRepeatedly("          \\", strArray4, strArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Search and Replace array lengths don't match: 16 vs 7");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(strArray7);
    }

    @Test
    public void test38869() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest77.test38869");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\rUUUUUUUUUUUUUUUUUUUUUUUUUU16\\16 \\16", "666u6                                                                                              ");
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test38870() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest77.test38870");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.swapCase("6161616161616161616161616");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "6161616161616161616161616" + "'", str1, "6161616161616161616161616");
    }

    @Test
    public void test38871() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest77.test38871");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.difference("                                                                                                        aaaaaaa", "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test38872() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest77.test38872");
        int int3 = org.apache.commons.lang3.StringUtils.lastOrdinalIndexOf("\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\......aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaau61\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\......aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaau61\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\......aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaau61\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\......aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaau61\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\...", "......  aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", 91);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test38873() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest77.test38873");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.strip("aaaaaaaaaaa...555555555555555555555555555555555555555555555555");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "aaaaaaaaaaa...555555555555555555555555555555555555555555555555" + "'", str1, "aaaaaaaaaaa...555555555555555555555555555555555555555555555555");
    }

    @Test
    public void test38874() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest77.test38874");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.substring("\\U0030uUu\\u3200uUu\\u3200uUu\\u3200uUu\\u3200uUu\\u320570uUu\\u3200uUu\\u3200uUu\\u3200uUu\\u3200uUu\\u320570uUu\\u3200uUu\\u3200uUu\\u3200uUu\\u3200uUu\\u320570uUu\\u3200uUu\\u3200uUu\\u3200uUu\\u3200uUu\\u320570uUu\\u3200uUu\\u3200uUu\\u3200uUu\\u3200uUu\\u320570uUu\\u3200uUu\\u3200uUu\\u3200uUu\\u3200uUu\\u320570uUu\\u3200uUu\\u3200uUu\\u3200uUu\\u3200uUu\\u320570uUu\\u3200uUu\\u3200uUu\\u3200uUu\\u3200uUu\\u320570uUu\\u3200uUu\\u3200uUu\\u3200uUu\\u3200uUu\\u320570uUu\\u3200uUu\\u3200uUu\\u3200uU", 103, 156);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\\u3200uUu\\u3200uUu\\u3200uUu\\u3200uUu\\u320570uUu\\u3200" + "'", str3, "\\u3200uUu\\u3200uUu\\u3200uUu\\u3200uUu\\u320570uUu\\u3200");
    }

    @Test
    public void test38875() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest77.test38875");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNotEmpty((java.lang.CharSequence) "1h!1");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test38876() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest77.test38876");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.rightPad("uuuuuuuuuuU6uuuuuuuuuuu                        ", 237, '#');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "uuuuuuuuuuU6uuuuuuuuuuu                        ##############################################################################################################################################################################################" + "'", str3, "uuuuuuuuuuU6uuuuuuuuuuu                        ##############################################################################################################################################################################################");
    }

    @Test
    public void test38877() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest77.test38877");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "                   \\u0033                   ", "...3u6              aaaaaaaaa");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test38878() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest77.test38878");
        java.util.Locale locale1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.apache.commons.lang3.StringUtils.upperCase("AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA61AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA", locale1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test38879() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest77.test38879");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripToEmpty("UUUUUU 6\\\\U0020 6\\\\U0020 6");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "UUUUUU 6\\\\U0020 6\\\\U0020 6" + "'", str1, "UUUUUU 6\\\\U0020 6\\\\U0020 6");
    }

    @Test
    public void test38880() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest77.test38880");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.split("\\u0055                                            ", "aaaaaaa      ", (int) 'U');
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray3);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "\\u0055" + "'", str4, "\\u0055");
    }

    @Test
    public void test38881() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest77.test38881");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.chomp("                            uuuuuuuuuuuuuuuuuu", "...3\\U0023\\U0023\\U0023\\U0023\\U0023UUUUUUUUUUUU...");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                            uuuuuuuuuuuuuuuuuu" + "'", str2, "                            uuuuuuuuuuuuuuuuuu");
    }

    @Test
    public void test38882() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest77.test38882");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.abbreviateMiddle("", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa64aaaaaaaaaaaaaaaaaaaaaaaaaaaa", 40);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test38883() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest77.test38883");
        char[] charArray10 = new char[] { ' ' };
        int int11 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "10hi!100", charArray10);
        boolean boolean12 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "\\U0023", charArray10);
        int int13 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa 61aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", charArray10);
        int int14 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "61\\6      aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa 61aaaaaaaaaaaaaaaaaaaaaaaaaaaa1\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61", charArray10);
        int int15 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "\r", charArray10);
        boolean boolean16 = org.apache.commons.lang3.StringUtils.containsAny("0000000000000000U00232222200000000000000000", charArray10);
        boolean boolean17 = org.apache.commons.lang3.StringUtils.containsAny("U61\nUUUUUUUUUUUUUUU", charArray10);
        int int18 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "                                                    ", charArray10);
        int int19 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "                   55555555556UUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU62626                   ", charArray10);
        org.junit.Assert.assertNotNull(charArray10);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray10), " ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray10), " ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray10), "[ ]");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 4 + "'", int14 == 4);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
    }

    @Test
    public void test38884() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest77.test38884");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBetween("\\61\\61\\61\\61\\u0023", "\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\");
        org.junit.Assert.assertNull(str2);
    }

    @Test
    public void test38885() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest77.test38885");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.split("23\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023U6", "61uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu");
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray3);
        boolean boolean5 = org.apache.commons.lang3.StringUtils.endsWithAny("23\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023", strArray3);
        java.lang.String[] strArray6 = org.apache.commons.lang3.StringUtils.stripAll(strArray3);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "23\\0023\\0023\\0023\\0023\\0023\\0023\\0023U" + "'", str4, "23\\0023\\0023\\0023\\0023\\0023\\0023\\0023U");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(strArray6);
    }

    @Test
    public void test38886() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest77.test38886");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.substringBetween("...0U\\3200U\\3200U\\3200U\\3200U\\3200U\\3200U\\3200U\\...0U\\3200U\\3200U\\3200U\\3200U\\3200U\\32\\u00A8", "61\\ 61\\61UUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU", "161\\161\\161\\161\\161\\161\\u6                                              3200u\\3200u\\1111111111111111111111111111");
        org.junit.Assert.assertNull(str3);
    }

    @Test
    public void test38887() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest77.test38887");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeStart("77777777777777777777777777777777777777777777777777777", "       aaaaaaa                 aaaaaaa                 aaaaaaa                 aaaaaaa                 aaaaaaa                 aaaaaaa                 aaaaaaa                 aaaaaaa                 aaaaaaa                 aaaaaaa                 aaaaaaa                 aaaaaaa                 aaaaaaa                 aaaaaaa                 aaaaaaa                 aaaaaaa                 aaaaaaa                 aaaaaaa                 aaaaaaa                 aaaaaaa                 aaaaaaa                 aaaaaaa                 aaaaaaa                 aaaaaaa                 aaaaaaa                 aaaaaaa                 aaaaaaa                 aaaaaaa                 aaaaaaa                 aaaaaaa                 aaaaaaa          ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "77777777777777777777777777777777777777777777777777777" + "'", str2, "77777777777777777777777777777777777777777777777777777");
    }

    @Test
    public void test38888() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest77.test38888");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.leftPad("610000000000000000000000000000000000000000000000000                                  0auu0", (int) 'U', "\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023...777777777777777777777777777777777777777777");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "610000000000000000000000000000000000000000000000000                                  0auu0" + "'", str3, "610000000000000000000000000000000000000000000000000                                  0auu0");
    }

    @Test
    public void test38889() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest77.test38889");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trim("3200U\\3200U\\3200\\u003\\u0023\\u0023\\u0023\\u0023\\u0023\\u00233200U\\3200U\\3200");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "3200U\\3200U\\3200\\u003\\u0023\\u0023\\u0023\\u0023\\u0023\\u00233200U\\3200U\\3200" + "'", str1, "3200U\\3200U\\3200\\u003\\u0023\\u0023\\u0023\\u0023\\u0023\\u00233200U\\3200U\\3200");
    }

    @Test
    public void test38890() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest77.test38890");
        char[] charArray14 = new char[] { '4', ' ', ' ', ' ', '4' };
        boolean boolean15 = org.apache.commons.lang3.StringUtils.containsAny("hi!", charArray14);
        boolean boolean16 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "10hi!100", charArray14);
        int int17 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "\\u0061", charArray14);
        int int18 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "hi!", charArray14);
        boolean boolean19 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "1111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111", charArray14);
        int int20 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "u61\n\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u00", charArray14);
        int int21 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "161\\161\\161\\161\\161\\161\\161\\161\\161\\161\\161\\161\\161\\161\\161\\161\\161\\161\\161\\161\\161\\161\\161\\161\\161\\161\\161\\161\\161\\161\\161\\161\\161\\161\\161", charArray14);
        int int22 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "61616161616161616161616161", charArray14);
        boolean boolean23 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "\\U0061\\U0061\\U0061\\U0061\\   u61    1\\U0061\\U0061\\U0061\\U0061                                    ", charArray14);
        org.junit.Assert.assertNotNull(charArray14);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray14), "4   4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray14), "4   4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray14), "[4,  ,  ,  , 4]");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
    }

    @Test
    public void test38891() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest77.test38891");
        int int1 = org.apache.commons.lang3.StringUtils.length((java.lang.CharSequence) "      c1111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111      ");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 110 + "'", int1 == 110);
    }

    @Test
    public void test38892() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest77.test38892");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOf(" 61..", "                                                                       23  hh23  hh23  hh23  hh23  hh23  hh23  hh23  hh23                                                                       ");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test38893() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest77.test38893");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.left("\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\1111111...\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\", 66);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\1111111...\\\\\\\\\\\\\\\\\\\\\\" + "'", str2, "\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\1111111...\\\\\\\\\\\\\\\\\\\\\\");
    }

    @Test
    public void test38894() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest77.test38894");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "AAAA...aaaaaahhhhhhhhhhhhhhhhhaaaaaahhhhhhhhhhhhhhhh", "");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test38895() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest77.test38895");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeEndIgnoreCase("\\\\\\################################################\\\\\\\\\\\\61\\\\\\############################", "                                                                              2                                                                                2                                                                                2                                                                                2                                                                                2                                                                                2                                                                                2                                                                                2");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\\\\\\################################################\\\\\\\\\\\\61\\\\\\############################" + "'", str2, "\\\\\\################################################\\\\\\\\\\\\61\\\\\\############################");
    }

    @Test
    public void test38896() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest77.test38896");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitByCharacterTypeCamelCase("22222222222222222222222222222222222222241AAAAAAAAcccccccccc");
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test38897() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest77.test38897");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAllUpperCase((java.lang.CharSequence) "aa......aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa11111111111u0023#u0023#u0023#u0023#u0023#u0023#");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test38898() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest77.test38898");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.split("\\U0023\\U00\\u0041\\U", "666666      66666");
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test38899() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest77.test38899");
        java.lang.CharSequence charSequence2 = null;
        char[] charArray10 = new char[] { '#' };
        boolean boolean11 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "\\u0061", charArray10);
        boolean boolean12 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "\\u0061", charArray10);
        boolean boolean13 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaau6166666666666666666666666666666666666", charArray10);
        boolean boolean14 = org.apache.commons.lang3.StringUtils.containsAny("                                hi!", charArray10);
        boolean boolean15 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\", charArray10);
        int int16 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "5c11111111111111111111111111 61\\ 111111111111111111111111111", charArray10);
        boolean boolean17 = org.apache.commons.lang3.StringUtils.containsNone(charSequence2, charArray10);
        boolean boolean18 = org.apache.commons.lang3.StringUtils.containsAny("161\\ 61\\ 6161\\ 61\\ 6161\\ 6", charArray10);
        boolean boolean19 = org.apache.commons.lang3.StringUtils.containsAny("u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\ u61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61", charArray10);
        org.junit.Assert.assertNotNull(charArray10);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray10), "#");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray10), "#");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray10), "[#]");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test38900() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest77.test38900");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.lowerCase("3200u                            aaaaaaaaaaaaa3200\\a");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "3200u                            aaaaaaaaaaaaa3200\\a" + "'", str1, "3200u                            aaaaaaaaaaaaa3200\\a");
    }

    @Test
    public void test38901() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest77.test38901");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.stripEnd("22223200U\\1400u\\00U\\3200U", "\\U005CUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "22223200U\\1400u\\00U\\32" + "'", str2, "22223200U\\1400u\\00U\\32");
    }

    @Test
    public void test38902() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest77.test38902");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.startsWith("      AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA 61AAAAAAAAAAAAAAAAAAAAAAAAAAAA0023\\U0023\\U0023\\U0023\\U0023\\U0023\\                            ", "23\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0026666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test38903() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest77.test38903");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.strip(" U   6 U   6 U   6 U   6 U   6 U   6 U   6 U   6 U   6 U   6 U   6 U   6 U   6 U   6 U   6 U   6 U   6 U   6 U   6 U   6 U   6 U   6 U   6 U   6 U   6 U   6 U   6 U   6 U   6 U   6 U   6 U   6 U   6 U   6 U   6 U   6 U   6 U   6 U   6 U   6 U   6 U   6 U   6 U   6 U   6 U   6 U   6 U   6 U   6 U   6 U   6 U   6 U   6 U   6 U   6 U   6 U   6 U   6 U   6 U   6 U   6 U   6 U   6 U   6 U   6 U   6 U   6 U   6 U   6 U   6 U   6 U   6 U   6 U   6 U   6 U   6 U   6 U   6 U   6 U   6 U   6 U   6 U   6 U   6 U   6 U   6 U   6 U   6 U   6 U   6 U   6 U   6 U   6 U   6 U   6 U   6 U   6 U   6 U   6 U   6 U   6 U   6 U   6 U   6 U   6 U   6 U   6 U   6 U   6 U   6 U   6 U   6");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "U   6 U   6 U   6 U   6 U   6 U   6 U   6 U   6 U   6 U   6 U   6 U   6 U   6 U   6 U   6 U   6 U   6 U   6 U   6 U   6 U   6 U   6 U   6 U   6 U   6 U   6 U   6 U   6 U   6 U   6 U   6 U   6 U   6 U   6 U   6 U   6 U   6 U   6 U   6 U   6 U   6 U   6 U   6 U   6 U   6 U   6 U   6 U   6 U   6 U   6 U   6 U   6 U   6 U   6 U   6 U   6 U   6 U   6 U   6 U   6 U   6 U   6 U   6 U   6 U   6 U   6 U   6 U   6 U   6 U   6 U   6 U   6 U   6 U   6 U   6 U   6 U   6 U   6 U   6 U   6 U   6 U   6 U   6 U   6 U   6 U   6 U   6 U   6 U   6 U   6 U   6 U   6 U   6 U   6 U   6 U   6 U   6 U   6 U   6 U   6 U   6 U   6 U   6 U   6 U   6 U   6 U   6 U   6 U   6 U   6 U   6 U   6" + "'", str1, "U   6 U   6 U   6 U   6 U   6 U   6 U   6 U   6 U   6 U   6 U   6 U   6 U   6 U   6 U   6 U   6 U   6 U   6 U   6 U   6 U   6 U   6 U   6 U   6 U   6 U   6 U   6 U   6 U   6 U   6 U   6 U   6 U   6 U   6 U   6 U   6 U   6 U   6 U   6 U   6 U   6 U   6 U   6 U   6 U   6 U   6 U   6 U   6 U   6 U   6 U   6 U   6 U   6 U   6 U   6 U   6 U   6 U   6 U   6 U   6 U   6 U   6 U   6 U   6 U   6 U   6 U   6 U   6 U   6 U   6 U   6 U   6 U   6 U   6 U   6 U   6 U   6 U   6 U   6 U   6 U   6 U   6 U   6 U   6 U   6 U   6 U   6 U   6 U   6 U   6 U   6 U   6 U   6 U   6 U   6 U   6 U   6 U   6 U   6 U   6 U   6 U   6 U   6 U   6 U   6 U   6 U   6 U   6 U   6 U   6 U   6 U   6");
    }

    @Test
    public void test38904() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest77.test38904");
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.replace("\\U0023\\U00\\u0041\\U                                   ", "aaaaaaaa...", "uuuuuuuuuuuuuuuuu1u 61u 6161u 61u 6161u 61u 6161u 6uuuuuuuuuuuuuuuuuu", 270);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "\\U0023\\U00\\u0041\\U                                   " + "'", str4, "\\U0023\\U00\\u0041\\U                                   ");
    }

    @Test
    public void test38905() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest77.test38905");
        java.util.Locale locale1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.apache.commons.lang3.StringUtils.lowerCase("   ...6\\66\\6\\66\\6\\66\\6\\6                             A\\0023AAAAAAAAAAAAA                            uuuuuuuuuu...", locale1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test38906() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest77.test38906");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.upperCase("uUUUU61UUUUUUUUUUUUUUUU44444444444444444444423\\U0023\\U444444444444444444444");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "UUUUU61UUUUUUUUUUUUUUUU44444444444444444444423\\U0023\\U444444444444444444444" + "'", str1, "UUUUU61UUUUUUUUUUUUUUUU44444444444444444444423\\U0023\\U444444444444444444444");
    }

    @Test
    public void test38907() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest77.test38907");
        int int2 = org.apache.commons.lang3.StringUtils.indexOf("    u61\n\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u00   ", 543);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test38908() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest77.test38908");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.split("23\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U00", 'c');
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.stripAll(strArray2);
        java.lang.String[] strArray5 = org.apache.commons.lang3.StringUtils.stripAll(strArray3, "                                                 ..");
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertNotNull(strArray5);
    }

    @Test
    public void test38909() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest77.test38909");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.right("U\\\n###                                 ", (int) '5');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "U\\\n###                                 " + "'", str2, "U\\\n###                                 ");
    }

    @Test
    public void test38910() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest77.test38910");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsAny("", "  \\\\0020                                                                                 3200u\\3200u\\3200u\\3200u\\3200u\\3200u\\300u\\");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test38911() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest77.test38911");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNumericSpace((java.lang.CharSequence) "IIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIII              6 0200U\\\\6 0200U\\\\6 UUUUUU");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test38912() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest77.test38912");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringAfter("", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test38913() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest77.test38913");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBeforeLast(" 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61                  \\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61", "uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu                   ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + " 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61                  \\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61" + "'", str2, " 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61                  \\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61");
    }

    @Test
    public void test38914() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest77.test38914");
        int int3 = org.apache.commons.lang3.StringUtils.lastOrdinalIndexOf("0023\\u0023\\u0023\\\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\nU", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa                                                                              2                                                                                2                                                                                2                                                                                2                                                                                2                                                                                2                                                                                2                                                                                261aaaaaaaaaaaaaaaaaaaaaaaaaaaa", 53);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test38915() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest77.test38915");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOfIgnoreCase("uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuc500u\\0u\\0200u\\0200u\\0200u\\0200u\\0200u\\\n###", "UUUUUUUUUUUUUUU0023UUUUUUUUUUUUUUUU");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test38916() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest77.test38916");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringAfter("   2     ...                                ...    ", "                                                                                                                                                         ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test38917() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest77.test38917");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeEnd("                                         \n\n1                 AAAA\\ \\61\\AAAAAAAAAAAAAAAAAAAAAAAAAAAA", "00000000000000000000000000000000##0U00000U00000U00000U00000U00000U00000U00000U00000U00000U00000U00000U00000U00000U00000U00000U0\n###000000000000000000000000000000000");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                         \n\n1                 AAAA\\ \\61\\AAAAAAAAAAAAAAAAAAAAAAAAAAAA" + "'", str2, "                                         \n\n1                 AAAA\\ \\61\\AAAAAAAAAAAAAAAAAAAAAAAAAAAA");
    }

    @Test
    public void test38918() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest77.test38918");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("                                           \\u005cuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu", "3200U\\3200U\\3200U\\3200U\\3200U\\3200U\\3200U\\3200U\\3200U\\3200U\\");
        boolean boolean4 = org.apache.commons.lang3.StringUtils.startsWithAny("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\\u003\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA", strArray3);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test38919() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest77.test38919");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBefore("\\u003\\u0023\\u0023\\u0023\\                                                                                                                ", "6UUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU                                  3200U          ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\\u003\\u0023\\u0023\\u0023\\                                                                                                                " + "'", str2, "\\u003\\u0023\\u0023\\u0023\\                                                                                                                ");
    }

    @Test
    public void test38920() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest77.test38920");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("       ");
        boolean boolean4 = org.apache.commons.lang3.StringUtils.startsWithAny("                 \\u0030\\\\\\\\                  ", strArray3);
        java.lang.String[] strArray6 = org.apache.commons.lang3.StringUtils.stripAll(strArray3, "1hi!11hi!11hi!11hi!11hi!11hi!11hi!11hi!11hi!11hi!11hi!11hi!11hi!11hi!11hi!11hi!11hi!11hi!11hi!11hi!11hi!11hi!11hi!11hi!11hi!11hi!11hi!11hi!11hi!11hi!11hi!11hi!11hi!11hi!11hi!11hi!11hi!11hi!11hi!11hi!11hi!11hi!11hi!11hi!11hi!11hi!11hi!11hi!11hi!11hi!11hi!11hi!11hi!11hi!11hi!11hi!11hi!11hi!11hi!11hi!11hi!11hi!11hi!11hi!11hi!11hi!11hi!11hi!11hi!11hi!11hi!11hi!11hi!11hi!11hi!11hi!11hi!11hi!11hi!11hi!11hi!11hi!11hi!11hi!1");
        boolean boolean7 = org.apache.commons.lang3.StringUtils.startsWithAny("", strArray6);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test38921() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest77.test38921");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAllLowerCase((java.lang.CharSequence) "###########U005cu0u005cu0u0023Uu005cu0u005cu023\\U");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test38922() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest77.test38922");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "a         ", "55555555555555555555555555555555555555555555555555555555555555555555555555555555\\u0036");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test38923() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest77.test38923");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripToNull("UUU6 6 6 6 6");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "UUU6 6 6 6 6" + "'", str1, "UUU6 6 6 6 6");
    }

    @Test
    public void test38924() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest77.test38924");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.stripStart(" 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61...... 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\", "U00u3\\U00u3\\U00u3\\U00u3\\U00u3\\U00u3\\U00u3\\U00u3\\16u3\\16u \\16 \\16 \\16 \\16 \\16  \\16u \\16 \\16 \\16 \\16 ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "...... 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\" + "'", str2, "...... 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\");
    }

    @Test
    public void test38925() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest77.test38925");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeStartIgnoreCase("               AAAAAAAAAAAAA3200\\A                                 ", "61aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "               AAAAAAAAAAAAA3200\\A                                 " + "'", str2, "               AAAAAAAAAAAAA3200\\A                                 ");
    }

    @Test
    public void test38926() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest77.test38926");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.stripEnd("           \n\\u61\\ u61\\ 61\\ 61\\ 61\\ 61\\Aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "2\\3200u\\3200u\\3200\\U003\\U0023\\U0023\\U0023\\U0023\\U0023\\U00233200u\\3200u\\320032");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "           \n\\u61\\ u61\\ 61\\ 61\\ 61\\ 61\\Aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa" + "'", str2, "           \n\\u61\\ u61\\ 61\\ 61\\ 61\\ 61\\Aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
    }

    @Test
    public void test38927() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest77.test38927");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOfIgnoreCase("\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61", "5700u\\23\\u                                    ", 257);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test38928() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest77.test38928");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.startsWithIgnoreCase("                                                 a                                          61\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\U                                                                                         ", "0023u0023\\u0023\\u0023\\u0023\\u0023\\u003\\u\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\\");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test38929() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest77.test38929");
        java.lang.CharSequence charSequence2 = org.apache.commons.lang3.StringUtils.defaultIfBlank((java.lang.CharSequence) "\\u005c", (java.lang.CharSequence) "002aaaaaaa\\002aaaaaaa\\002aaaaaaa\\\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\nU");
        org.junit.Assert.assertEquals("'" + charSequence2 + "' != '" + "\\u005c" + "'", charSequence2, "\\u005c");
    }

    @Test
    public void test38930() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest77.test38930");
        char[] charArray11 = new char[] { ' ' };
        int int12 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "10hi!100", charArray11);
        boolean boolean13 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "\\U0023", charArray11);
        int int14 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa 61aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", charArray11);
        int int15 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "61\\6      aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa 61aaaaaaaaaaaaaaaaaaaaaaaaaaaa1\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61", charArray11);
        int int16 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "\r", charArray11);
        boolean boolean17 = org.apache.commons.lang3.StringUtils.containsAny("0000000000000000U00232222200000000000000000", charArray11);
        int int18 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "####A000U\\", charArray11);
        int int19 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "\\U0023\\U00\\u0041\\U", charArray11);
        int int20 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "Aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaau6", charArray11);
        int int21 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "6 UUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU 6", charArray11);
        org.junit.Assert.assertNotNull(charArray11);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray11), " ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray11), " ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray11), "[ ]");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 4 + "'", int15 == 4);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
    }

    @Test
    public void test38931() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest77.test38931");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.split("#################", "                                                 a                                          61\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\U                                                                                         ", 94);
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void test38932() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest77.test38932");
        char[] charArray21 = new char[] { '4', ' ', ' ', ' ', '4' };
        boolean boolean22 = org.apache.commons.lang3.StringUtils.containsAny("hi!", charArray21);
        boolean boolean23 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "10hi!100", charArray21);
        int int24 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "\\u0061", charArray21);
        int int25 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "hi!", charArray21);
        boolean boolean26 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "1111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111", charArray21);
        int int27 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "\\u0020", charArray21);
        int int28 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "  2   ", charArray21);
        int int29 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "23\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u002", charArray21);
        boolean boolean30 = org.apache.commons.lang3.StringUtils.containsAny("\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023UUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU", charArray21);
        int int31 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "10hi!10010hi!10010h\\400310hi!10010hi!10010hi", charArray21);
        boolean boolean32 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "        75        75        75        75        75        75        75        75        75        75        75        75        75        75        75        75        75        75        75        75        75        75        75        75        75        75        75        75        75        75        75        75        75        75        75        75        75        75        75        75        75        75        75        75        75        75        75        75        75        75        75        75        75        75        75        75        75        75        75        75        75        75        75        75        75        75        75        75        75        75        75        75        75        75        75        75        75        75        75        75        75        75        75        75        75", charArray21);
        int int33 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "                                          ...h    h...aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa 61                                          ...h    h...aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa 61                                          ...h    h...aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa 61                                          ...h    h...aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa 61                                          ...h    h", charArray21);
        int int34 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "iiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa64aaaaaaaaaaaaaaaaaaaaaaaaaaaaiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiii", charArray21);
        boolean boolean35 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "                                         1\\U00234                                      \\U0023\\U00\\u0                    ..", charArray21);
        int int36 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "1h!1", charArray21);
        int int37 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\U61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61", charArray21);
        org.junit.Assert.assertNotNull(charArray21);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray21), "4   4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray21), "4   4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray21), "[4,  ,  ,  , 4]");
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + (-1) + "'", int25 == (-1));
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-1) + "'", int27 == (-1));
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 20 + "'", int31 == 20);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 42 + "'", int33 == 42);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 0 + "'", int34 == 0);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + (-1) + "'", int36 == (-1));
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + (-1) + "'", int37 == (-1));
    }

    @Test
    public void test38933() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest77.test38933");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.substring("                                       aaaaaaaaaaaaa\\\\\\uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu", 94, 28);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test38934() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest77.test38934");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.split("6161616161616161616161616");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.stripAll(strArray1);
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test38935() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest77.test38935");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.mid("##############################################.16 ", 358, 61);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test38936() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest77.test38936");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByCharacterType("                                         \n\n1           ");
        boolean boolean3 = org.apache.commons.lang3.StringUtils.startsWithAny("                    \\u0020\\u0020\\u0020\\u0", strArray2);
        int int4 = org.apache.commons.lang3.StringUtils.indexOfDifference((java.lang.CharSequence[]) strArray2);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test38937() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest77.test38937");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.chomp("                                                                                                ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "                                                                                                " + "'", str1, "                                                                                                ");
    }

    @Test
    public void test38938() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest77.test38938");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNotBlank((java.lang.CharSequence) "61...... 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ ...");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test38939() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest77.test38939");
        java.lang.CharSequence charSequence2 = org.apache.commons.lang3.StringUtils.defaultIfBlank((java.lang.CharSequence) "0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u002", (java.lang.CharSequence) "...                                    111111111111111111111111111111...");
        org.junit.Assert.assertEquals("'" + charSequence2 + "' != '" + "0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u002" + "'", charSequence2, "0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u002");
    }

    @Test
    public void test38940() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest77.test38940");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substring("00000000000033u33233u33233u33233u33233u33233u33233u33233u33233u33233u33233u33233u33233u33233u33233u3\n06u", 5);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "000000033u33233u33233u33233u33233u33233u33233u33233u33233u33233u33233u33233u33233u33233u33233u3\n06u" + "'", str2, "000000033u33233u33233u33233u33233u33233u33233u33233u33233u33233u33233u33233u33233u33233u33233u3\n06u");
    }

    @Test
    public void test38941() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest77.test38941");
        char[] charArray12 = new char[] { 'u', '#', 'a', '\\', 'a' };
        boolean boolean13 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "u61", charArray12);
        boolean boolean14 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "\\u0075", charArray12);
        boolean boolean15 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "                                                                                                                     ", charArray12);
        boolean boolean16 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "41", charArray12);
        int int17 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "1111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111", charArray12);
        int int18 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) " 61\\ 61\\ 61\\ 61\\ 61 61\\  61\\ 61\\ 61\\ 61\\ 61                                                           ", charArray12);
        int int19 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "c1111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111", charArray12);
        org.junit.Assert.assertNotNull(charArray12);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray12), "u#a\\a");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray12), "u#a\\a");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray12), "[u, #, a, \\, a]");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
    }

    @Test
    public void test38942() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest77.test38942");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("   00u\\0200u\\0200u\\0200u\\0200u\\0200u\\0200u\\0200u\\0200u\\0200u\\0200u\\0200u\\0200u\\0200u\\0200u\\\n16u    ", " ");
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.stripAll(strArray2, "\\u0033");
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray2, "                                                                                           ", 79, 0);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test38943() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest77.test38943");
        int int2 = org.apache.commons.lang3.CharUtils.toIntValue('\\', 32);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 32 + "'", int2 == 32);
    }

    @Test
    public void test38944() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest77.test38944");
        char[] charArray7 = new char[] { ' ' };
        int int8 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "10hi!100", charArray7);
        boolean boolean9 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "\\U0023", charArray7);
        boolean boolean10 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) " 61", charArray7);
        boolean boolean11 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) " 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61", charArray7);
        int int12 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023", charArray7);
        boolean boolean13 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "UUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU0000000000000000000000000000000000000000000uUu0u3200uUu0u3200uUu0u3200uUu0u3200uUu0u32057UUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU", charArray7);
        org.junit.Assert.assertNotNull(charArray7);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray7), " ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray7), " ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray7), "[ ]");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test38945() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest77.test38945");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.split("\\U00                                                                                  ...261\\261\\261\\261\\261\\261\\261\\2...3\\U00                                                                                  ...261\\261\\261\\261\\261\\261\\261\\2...3\\U00                                                                                  ...261\\261\\261\\261\\261\\261\\261\\2...3\\U00                                                                                  ...261\\261\\261\\261\\261\\261\\261\\2...3\\U00                                                   ", "6666", 105);
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void test38946() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest77.test38946");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeStart("5555555555555555555523\\u0023\\u0023        75023\\u0023\\u0055555555555555555555", "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "5555555555555555555523\\u0023\\u0023        75023\\u0023\\u0055555555555555555555" + "'", str2, "5555555555555555555523\\u0023\\u0023        75023\\u0023\\u0055555555555555555555");
    }

    @Test
    public void test38947() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest77.test38947");
        int int3 = org.apache.commons.lang3.StringUtils.lastOrdinalIndexOf("                                                                                                  61                                                                                                  61                                                                                                  61                                                                                                  61                                                                                                  61                                                                                                  61                                                                                                  61                                                                                                  61                                                                                                  61                                                                                                  61", " 61\\ u61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\", 15);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test38948() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest77.test38948");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitByCharacterType("U0##########\\U0023\\4003U0023\\U\\U0023\\61uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu                                  3200u61uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu                                  3200u61uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu                                  3200u61uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu                                  3200u61uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu                                  3200u61uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu                       U0023");
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test38949() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest77.test38949");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023", "22222222222222222222222222222222222222241");
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test38950() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest77.test38950");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitByCharacterTypeCamelCase("aa                                          ");
        java.lang.String str5 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray1, "U0023\\U00\\u0041\\U002322222", 117, (int) '\\');
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str9 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray1, "!i16\\16\\16\\16\\16\\16\\16\\16\\16\\16\\16\\16U\\16\\16\\16\\16\\16\\16\\16\\16\\16\\16\\16   \n\n\n\n\n", 97, 354);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 97");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
    }

    @Test
    public void test38951() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest77.test38951");
        int int2 = org.apache.commons.lang3.StringUtils.indexOf("5555555                     ..", "  \n\\u61\\ u61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61  \n\\u");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test38952() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest77.test38952");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "          \\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\           ", "61\\6      aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa 61aaaaaaaaaaaaaaaaaaaaaaaaaaaa1\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test38953() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest77.test38953");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.center("\\2uuuuuuuuuuuu                                               \\uuu02\\uuu02\\uuu02\\AAAAAAAAAAAAA", 449, '0');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "0000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000\\2uuuuuuuuuuuu                                               \\uuu02\\uuu02\\uuu02\\AAAAAAAAAAAAA0000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000" + "'", str3, "0000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000\\2uuuuuuuuuuuu                                               \\uuu02\\uuu02\\uuu02\\AAAAAAAAAAAAA0000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000");
    }

    @Test
    public void test38954() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest77.test38954");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("                  \\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023                  \\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023                  \\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023                  \\u0023\\u0023\\u061\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ ", "...\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020...");
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test38955() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest77.test38955");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.capitalize((java.lang.CharSequence) "uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu0023                  \\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu0023                  \\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023" + "'", str1, "Uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu0023                  \\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023");
    }

    @Test
    public void test38956() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest77.test38956");
        char char1 = org.apache.commons.lang3.CharUtils.toChar(" 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ U61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\");
        org.junit.Assert.assertTrue("'" + char1 + "' != '" + ' ' + "'", char1 == ' ');
    }

    @Test
    public void test38957() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest77.test38957");
        char[] charArray6 = new char[] { ' ' };
        int int7 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "10hi!100", charArray6);
        boolean boolean8 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "\\U0023", charArray6);
        int int9 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa 61aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", charArray6);
        int int10 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) " 61uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu", charArray6);
        boolean boolean11 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "......", charArray6);
        java.lang.Class<?> wildcardClass12 = charArray6.getClass();
        org.junit.Assert.assertNotNull(charArray6);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray6), " ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray6), " ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray6), "[ ]");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test38958() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest77.test38958");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substring("                                      \\u0023\\u00\\U0041\\u0023##############################################################", 237);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test38959() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest77.test38959");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAllUpperCase((java.lang.CharSequence) "002300230023002300230023002300230a000u\\002300230023002...");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test38960() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest77.test38960");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.left("\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\", 0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test38961() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest77.test38961");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeStartIgnoreCase("3333333333333333333333333333333333                                                                             6u623\\", "0023U6                                       u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r23\\");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "3333333333333333333333333333333333                                                                             6u623\\" + "'", str2, "3333333333333333333333333333333333                                                                             6u623\\");
    }

    @Test
    public void test38962() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest77.test38962");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("...............................................................................\\u0034", '0');
        boolean boolean4 = org.apache.commons.lang3.StringUtils.startsWithAny("uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu                                                                                                                             0uUu", strArray3);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
    }

    @Test
    public void test38963() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest77.test38963");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.split("161\\161\\161\\161\\161\\161\\U6161\\161\\161\\161\\161\\16177777777777777777777777777");
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test38964() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest77.test38964");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isWhitespace((java.lang.CharSequence) "\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\...  h\\huh0023h\\huh0023h\\huh0023h\\huh0023h\\huh0023h\\huh0023h\\huh0023h                                                    ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test38965() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest77.test38965");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.strip("...h    h...                                                                                            ", "aaaaaaaaaaaaaaaaaaaaaaaaaaaa16aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "...h    h...                                                                                            " + "'", str2, "...h    h...                                                                                            ");
    }

    @Test
    public void test38966() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest77.test38966");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("                                           \\u005c", "6uaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        java.lang.String str5 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray3, "\\0033");
        java.lang.String str6 = org.apache.commons.lang3.StringUtils.concatWith("\\U005C", (java.lang.Object[]) strArray3);
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.getCommonPrefix(strArray3);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "                                           \\\\0033005c" + "'", str5, "                                           \\\\0033005c");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "                                           \\\\U005C005c" + "'", str6, "                                           \\\\U005C005c");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
    }

    @Test
    public void test38967() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest77.test38967");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.split("u61uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu", "23004\\13200u\\3200u\\3200u\\3200u\\3200u\\3200u\\3200u\\320001666666666666666666666666666666666666623004\\", 18);
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void test38968() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest77.test38968");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.substringsBetween("  \n\\u61\\ u61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61  \n\\", "11111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111...\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n210000000000000000000000000000000000000000000000000\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\0auu0", "aaaaaaaaaaaaaaaaaaaaaaa  aaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertNull(strArray3);
    }

    @Test
    public void test38969() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest77.test38969");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringAfterLast("\\u0023                                                                                     hi!hi!hi!                                                                                                         ", "23\\U");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test38970() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest77.test38970");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.right("                                                                                                  I", 27);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                          I" + "'", str2, "                          I");
    }

    @Test
    public void test38971() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest77.test38971");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.split("U\\32                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                  ", "\\ 61\\61                                                                                                                                                                                                                                                                                                                                                                                                                                          ");
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test38972() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest77.test38972");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trim("u  ......  \\u004\\u004\\u004\\u004\\u004\\u004\\u004\\u004\\u004\\u004\\u004\\u004\\u004\\u004\\u00");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "u  ......  \\u004\\u004\\u004\\u004\\u004\\u004\\u004\\u004\\u004\\u004\\u004\\u004\\u004\\u004\\u00" + "'", str1, "u  ......  \\u004\\u004\\u004\\u004\\u004\\u004\\u004\\u004\\u004\\u004\\u004\\u004\\u004\\u004\\u00");
    }

    @Test
    public void test38973() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest77.test38973");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isBlank((java.lang.CharSequence) "                                          \\0033                                         \\                                        \\0033                                         U                                        \\0033                                         005                                        \\0033                                         C                                        \\0033                                           ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test38974() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest77.test38974");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("iiiiiiiiiiiiiiiii23\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023", ' ');
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test38975() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest77.test38975");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.swapCase("aaaaaaaaaaaaaaHHHHHHHHHHHHHUUUUUUUaaaaaaaaaaaaaa");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "AAAAAAAAAAAAAAhhhhhhhhhhhhhuuuuuuuAAAAAAAAAAAAAA" + "'", str1, "AAAAAAAAAAAAAAhhhhhhhhhhhhhuuuuuuuAAAAAAAAAAAAAA");
    }

    @Test
    public void test38976() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest77.test38976");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeEnd("", "0UUU\\U3200UUU\\U3200UU023\\u0023       aaaaaaa");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test38977() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest77.test38977");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.split("uuuuuuuuuuuuuuu0023uuuuuuuuuuuuuuuu", '6');
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.stripAll(strArray2);
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.stripAll(strArray3);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertNotNull(strArray4);
    }

    @Test
    public void test38978() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest77.test38978");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitByCharacterTypeCamelCase("61\\uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.stripAll(strArray1);
        java.lang.String str6 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray1, "\\", 105, 0);
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray1, "                                                300U");
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "61                                                300U\\                                                300Uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu" + "'", str8, "61                                                300U\\                                                300Uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu");
    }

    @Test
    public void test38979() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest77.test38979");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.stripStart("               3200", "  ......  555555555555555555555555555555555555555555555555555555");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "3200" + "'", str2, "3200");
    }

    @Test
    public void test38980() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest77.test38980");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\nU\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n", '1');
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray2, "                                                                                      3200U\\1400\\00U\\3200U\\");
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\nU\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n" + "'", str4, "\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\nU\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
    }

    @Test
    public void test38981() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest77.test38981");
        int int3 = org.apache.commons.lang3.StringUtils.ordinalIndexOf("                                                                              2  ", "\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r77777777777777777777777777", (int) (short) 10);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test38982() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest77.test38982");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.substringsBetween(" \\16 \\020016\\16 \\16 u16\\16 \\16 \\020016\\16 \\16 u16\\16 \\16 \\020016\\16 \\16 u16\\16 \\16 \\020016\\16 \\16 u16\\16 \\16 \\020016\\16 \\16 u16\\16 \\16 \\020016\\16 \\16 u16\\16 \\16 \\020016\\16 \\16 u16\\16 \\16 \\020016\\16 \\16 u16\\16 \\16 \\020016\\16 \\16 u16\\16 \\16 \\...6 \\66 \\6 \\66 \\6 \\66 \\6 \\6", "222223200U\\", "23\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023");
        org.junit.Assert.assertNull(strArray3);
    }

    @Test
    public void test38983() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest77.test38983");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.endsWith("020\\U0020\\U0020\\U0020\\U0020\\U0020\\U00U62 \\U0020\\U0020\\U0020\\U0020\\U0020\\U0", "6161...");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test38984() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest77.test38984");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.leftPad("41AAAAAAAA", (int) 'i', "AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA41AAAAAAAA" + "'", str3, "AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA41AAAAAAAA");
    }

    @Test
    public void test38985() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest77.test38985");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphanumericSpace((java.lang.CharSequence) "\\U0023\\U0023\\U0023\\aaaaaaaaaaaaa\\\\\\                  ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test38986() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest77.test38986");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens(" 61", "10HI!100");
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test38987() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest77.test38987");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "###0u\\0200u\\0200u\\0200u\\0200u\\0200u\\0200u\\0200u\\0200u\\0200u\\0200u\\0200u\\0200u\\0200u\\0200u\\0200u\\ ###", "UUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU\\Uii23\\Uii23\\Uii23\\Uii23\\Uii23\\Uii23\\Uii23\\Uii23\\");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test38988() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest77.test38988");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.remove("5c1111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111", "...5    5...\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "5c1111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111" + "'", str2, "5c1111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111");
    }

    @Test
    public void test38989() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest77.test38989");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.capitalize((java.lang.CharSequence) "u0023#u0023#u0023#u0023#u0023#u0023#u0023");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "U0023#u0023#u0023#u0023#u0023#u0023#u0023" + "'", str1, "U0023#u0023#u0023#u0023#u0023#u0023#u0023");
    }

    @Test
    public void test38990() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest77.test38990");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphanumericSpace((java.lang.CharSequence) "61uuuuuuuuuuuuuuuuuu3\\u0...\\U0023\\U0##########");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test38991() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest77.test38991");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("\\U0023                                                                                     HI!HI!HI!\\U0023                                   \\U0068\\U0023                                                                                     HI!HI!HI!\\U0023                                   ", "0000aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaau6000000000000000000", (int) (byte) 0);
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.stripAll(strArray3);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertNotNull(strArray4);
    }

    @Test
    public void test38992() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest77.test38992");
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.replace("                                                                                                                                                                                                                                                     666666666666666666666666666666666666666                                       aaaaaaaaaaaaa\\\\\\", "1                     1                     1                     1                     1                     1                     1                     1                     1                     1                     1                     1                     1                     1                     1                  1                     1                     1                     1                     1                     1                     1                     1                     1                     1                     1                     1                     1                     1                     1                  ", "55555555555555555555555555555555555555555555555555555555555555555555555555555555\\u0036", (int) '6');
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "                                                                                                                                                                                                                                                     666666666666666666666666666666666666666                                       aaaaaaaaaaaaa\\\\\\" + "'", str4, "                                                                                                                                                                                                                                                     666666666666666666666666666666666666666                                       aaaaaaaaaaaaa\\\\\\");
    }

    @Test
    public void test38993() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest77.test38993");
        java.lang.CharSequence charSequence2 = org.apache.commons.lang3.StringUtils.defaultIfEmpty((java.lang.CharSequence) ".....", (java.lang.CharSequence) "   2     ...                                ...    \\U0023");
        org.junit.Assert.assertEquals("'" + charSequence2 + "' != '" + "....." + "'", charSequence2, ".....");
    }

    @Test
    public void test38994() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest77.test38994");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.defaultString("aaaaaaaaaaaaa...u0020u0020u0020u0020u0020u0020u0020u0020u0020...        ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "aaaaaaaaaaaaa...u0020u0020u0020u0020u0020u0020u0020u0020u0020...        " + "'", str1, "aaaaaaaaaaaaa...u0020u0020u0020u0020u0020u0020u0020u0020u0020...        ");
    }

    @Test
    public void test38995() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest77.test38995");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.chop("                                                                                                                                                                                                                                                     ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "                                                                                                                                                                                                                                                    " + "'", str1, "                                                                                                                                                                                                                                                    ");
    }

    @Test
    public void test38996() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest77.test38996");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphanumeric((java.lang.CharSequence) "U###0u\\...");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test38997() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest77.test38997");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isEmpty((java.lang.CharSequence) "23 u0023 u0023          3    23 u0023 u0023      ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test38998() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest77.test38998");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNumeric((java.lang.CharSequence) "                                                   3200u\\3200u\\3200u\\3200u\\3200u\\3200u\\3200u\\3200u\\3200u\\3200u\\");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test38999() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest77.test38999");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeEndIgnoreCase("\n\n\n\n\n1", "\\U003 111 ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\n\n\n\n\n1" + "'", str2, "\n\n\n\n\n1");
    }

    @Test
    public void test39000() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest77.test39000");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.defaultString("                                            3200u", "777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777                                           \\6005ccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccc");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                            3200u" + "'", str2, "                                            3200u");
    }
}

