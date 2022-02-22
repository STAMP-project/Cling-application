import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest82 {

    public static boolean debug = false;

    @Test
    public void test41001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest82.test41001");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trim("string.nal.avaj ecafretni");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "string.nal.avaj ecafretni" + "'", str1, "string.nal.avaj ecafretni");
    }

    @Test
    public void test41002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest82.test41002");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("interface java.lang.Cloneable.......java.......Objectava..........javainterface java.io.Serializable###################", "irfSeriaCoSeria$SeriairfioSeriInterface java.lang.Cloneable             Character             interface java.io.SerializableirfSeriaCoSeria$SeriairfioSeria###################################################################################################################################################################################################################################################################################################", 150);
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void test41003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest82.test41003");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.defaultString("                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                            LANGH!IH!IH!IH!IH!IH");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                            LANGH!IH!IH!IH!IH!IH" + "'", str1, "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                            LANGH!IH!IH!IH!IH!IH");
    }

    @Test
    public void test41004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest82.test41004");
        char[] charArray7 = new char[] { ' ', '$', '.' };
        boolean boolean8 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "..", charArray7);
        int int9 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "...aL.ArrayListgnal.aL.ArrayList", charArray7);
        boolean boolean10 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "                                                                                                                                                                                                                                                                                                                           ", charArray7);
        boolean boolean11 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaclass javalangclass                       javaulang                       javaulang                       javaulang                       javaulang                       javaulang                       javaulang                       javaulang                       javaulang                       javaulang                       javaulang                       javaulang                       javaulang                       javaulang                       javaulang                       javaulang                       javaulang                       javaulang                       javaulang                       javaulang                       javaulang  ", charArray7);
        org.junit.Assert.assertNotNull(charArray7);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray7), " $.");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray7), " $.");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray7), "[ , $, .]");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 3 + "'", int9 == 3);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test41005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest82.test41005");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.split("class java.lang.Classclass java.lang.Classclass java.lang.Classclass java.lang.Classclass java.lang.Classclass java.lang.Classclass java.lang.Classclass java.lang.Classclass java.lang.Classclass java.lang.Classclass java.lang.Classclass java.lang.Classclass java.lang.Classclass java.lang.Classclass java.lang.Classclass java.lang.Classclass java.lang.Classclass java.lang.Classclass java.lang.Classclass java.lang.Classclass java.lang.Classclass java.lang.Classclass java.lang.Classclass java.lang.Classclass java.lang.Classclass java.lang.Classclass java.lang.Classclass java.lang.Classclass java.lang.Classclass java.lang.Class");
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test41006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest82.test41006");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAllUpperCase((java.lang.CharSequence) "                                                                                                                                                                                                                                                #########################sClassslitUgnirtSslitUgnirtSslitUgnirtSslitUgnirtSslitUgnirtSslitUgnirtSslitUgnirtSslitUgnirtSslitUgnirtSslitUgnirtS##########################                                                                                                                                                                                                                                                                                                                                                                                                                                        Serializabl                         ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test41007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest82.test41007");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trimToEmpty("A##############################");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "A##############################" + "'", str1, "A##############################");
    }

    @Test
    public void test41008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest82.test41008");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeEndIgnoreCase("$$$$$$$$$$$$.", "       .");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "$$$$$$$$$$$$." + "'", str2, "$$$$$$$$$$$$.");
    }

    @Test
    public void test41009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest82.test41009");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.chop("GNAL.AVAJLANG.JAVAGNAL.AVAJLANG.JAVAGNAL.AVAJLANG.JAVAGNAL.AVAJLANG.JAVAGNAL.AVAJLANG.JAVAGNAL.AVAJLANG.JAVAGNAL.AVAJLANG.JAVAGNAL.gn gnal.avaj");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "GNAL.AVAJLANG.JAVAGNAL.AVAJLANG.JAVAGNAL.AVAJLANG.JAVAGNAL.AVAJLANG.JAVAGNAL.AVAJLANG.JAVAGNAL.AVAJLANG.JAVAGNAL.AVAJLANG.JAVAGNAL.gn gnal.ava" + "'", str1, "GNAL.AVAJLANG.JAVAGNAL.AVAJLANG.JAVAGNAL.AVAJLANG.JAVAGNAL.AVAJLANG.JAVAGNAL.AVAJLANG.JAVAGNAL.AVAJLANG.JAVAGNAL.AVAJLANG.JAVAGNAL.gn gnal.ava");
    }

    @Test
    public void test41010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest82.test41010");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444litu                                             ...                                                    AvAAlitu                                             ...                                                    AvAA", '#');
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test41011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest82.test41011");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("gnalArrayListArrayListArrayLgnalArrayListArrayListArrayLgnalArrayListArrayListArrayLgnalArrayListArrayListArrayLgnalArrayListArrayListArrayLgnalArrayListArrayListArrayLgnalArrayListArrayListArrayLgnalArrayListArrayListArrayLgnalArrayListArrayListArrayLgnalArrayListArrayListArrayLgnalArrayListArrayListAJAVA.LANGAgnal.avajgnal..LANGgnal.avJAVA.LANGAgnal.avajgnal..LANGgnal.avJAVA.LANGAgnal.avajgnal..LANGgnal.avJAVA.LANGAgnal.avajgnal..LANGgnal.avJAVA.LANGAgnal.avajgnal..LANGgnal.avJAVA.LANGAgnal.avajgnal..LANGgnal.avJAVA.LANGAgnal.avajgnal..LANGgnal.avJAVA.LANGAgnal.avajgnal..LANGgnal.avJAVA.LANGAgnal.avajgnal..LANGgnal.avJAVA.LANGAgnal.avajgnal.", '$');
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test41012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest82.test41012");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.center("                                   #############################################################...", 5, "class java.lang.Stringclass java.lang.Stringclass java.lang.Stringclass java.lang.Stringclass java.lang.Stringclass java.lang.Stringclass java.lang.Stringclass java.lang.Stringclass java.lang.Stringclass java.lang.Stringclass java.lang.Stringclass java.lang.Stringclass java.lang.Stringclass java.lang.Stringclass java.lang.Stringclass java.lang.Stringclass java.lang.Stringclass java.lang.Stringclass java.lang.Stringclass java.lang.Stringclass java.lang.Stringclass java.lang.Stringclass java.lang.Stringclass java.lang.Stringclass java.lang.Stringclass java.lang.Stringclass java.lang.Stringclass java.lang.Stringclass java.lang.Stringclass java.lang.String");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "                                   #############################################################..." + "'", str3, "                                   #############################################################...");
    }

    @Test
    public void test41013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest82.test41013");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfAnyBut("arrayListArrayListArrayListavaj.gnal          ...", "CLONEABLEI");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test41014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest82.test41014");
        int int1 = org.apache.commons.lang3.StringUtils.length((java.lang.CharSequence) "4444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 943 + "'", int1 == 943);
    }

    @Test
    public void test41015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest82.test41015");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.chomp("jlvlLAlng                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                  ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "jlvlLAlng                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                  " + "'", str1, "jlvlLAlng                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                  ");
    }

    @Test
    public void test41016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest82.test41016");
        int int2 = org.apache.commons.lang3.StringUtils.indexOf("gnal.avaj ", "...sAitUJAirtSsAitUJAirtSsAitUJAirtSsAitUJAirtSsAitUJAirtSsAitUJAirtSsAitUJAirtSsAitUJAirtSsAitUJAirtS..");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test41017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest82.test41017");
        java.lang.String str1 = org.apache.commons.lang3.ClassUtils.getShortClassName("....................................................................$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$GNAL$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$                       $$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$GNAL$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$JAVAULANG");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "................................................GNAL................................................                       ................................................GNAL................................................JAVAULANG" + "'", str1, "................................................GNAL................................................                       ................................................GNAL................................................JAVAULANG");
    }

    @Test
    public void test41018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest82.test41018");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.remove("vA.LANGAVAJ.GNALJAVA.LANGAVAJ.GNALJAVA.LANG.utiljava.u", ' ');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "vA.LANGAVAJ.GNALJAVA.LANGAVAJ.GNALJAVA.LANG.utiljava.u" + "'", str2, "vA.LANGAVAJ.GNALJAVA.LANGAVAJ.GNALJAVA.LANG.utiljava.u");
    }

    @Test
    public void test41019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest82.test41019");
        java.lang.CharSequence charSequence2 = org.apache.commons.lang3.StringUtils.defaultIfEmpty((java.lang.CharSequence) "Java.lang.Stringclassjava.lang.Stringclassjava.lang.Stringclas.lang.Stringclassjava.lang.Stringc", (java.lang.CharSequence) "gnal.avaj                                                                                                                                                                                                                                                                                                                                                                                                                                                      ");
        org.junit.Assert.assertEquals("'" + charSequence2 + "' != '" + "Java.lang.Stringclassjava.lang.Stringclassjava.lang.Stringclas.lang.Stringclassjava.lang.Stringc" + "'", charSequence2, "Java.lang.Stringclassjava.lang.Stringclassjava.lang.Stringclas.lang.Stringclassjava.lang.Stringc");
    }

    @Test
    public void test41020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest82.test41020");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphaSpace((java.lang.CharSequence) "                                                                                                                       ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test41021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest82.test41021");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.right("SeriaA.", 20);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "SeriaA." + "'", str2, "SeriaA.");
    }

    @Test
    public void test41022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest82.test41022");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.swapCase("   a..IYl ZIIRsOIFRI.OcFRI");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "   A..iyL ziirSoifri.oCfri" + "'", str1, "   A..iyL ziirSoifri.oCfri");
    }

    @Test
    public void test41023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest82.test41023");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isEmpty((java.lang.CharSequence) "retcarahC44444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test41024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest82.test41024");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.split("AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA][SSALc", "       .");
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test41025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest82.test41025");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeEnd("LANGH!IH!IH!IH!IH!IH!", "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "LANGH!IH!IH!IH!IH!IH!" + "'", str2, "LANGH!IH!IH!IH!IH!IH!");
    }

    @Test
    public void test41026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest82.test41026");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlpha((java.lang.CharSequence) "AAAAAAAAAAjaval.agnAAAAAAAAAA");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test41027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest82.test41027");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeEnd("", "aaa                                              ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test41028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest82.test41028");
        int int2 = org.apache.commons.lang3.StringUtils.countMatches("", "");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test41029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest82.test41029");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.mid("$$$$$$$$$$$$rrayList", 200, 325);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test41030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest82.test41030");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOf("HI!aRRAYlISTaRRAYlISTaRRAYlISTAVAJ", "-1JAVA.UTILsTRING[]                                                                                 ", 46);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test41031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest82.test41031");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("objec", "44444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444Chaace", 152);
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void test41032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest82.test41032");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.rightPad(".........................................................................................................................................................................", 948, "$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$Gnal$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$.................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + ".........................................................................................................................................................................$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$Gnal$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$.................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$Gnal$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$" + "'", str3, ".........................................................................................................................................................................$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$Gnal$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$.................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$Gnal$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$");
    }

    @Test
    public void test41033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest82.test41033");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNotBlank((java.lang.CharSequence) "J#v                                                              ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test41034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest82.test41034");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("ULITULITULITULITUL####LITULITULITULITULITUL", "javalgnal.avajgnal.avajgnal.avajgnal.avajgnal.avajgnal.avajgnal.avajgnal.avajgnal.avajgnal.aG.JAVAGNAL.AVAJLANG.J######################", 117);
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void test41035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest82.test41035");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.reverseDelimited("interface java.lang.Cloneableinterface java.lang.CloneableNG.Llitinterface java.io.Serializableinterface java.io.Serializable", 'a');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "blealiza.io.Seriavace jableinterfaliza.io.Seriavace jableNG.Llitinterfang.Clonea.lavace jableinterfang.Clonea.lavace jainterf" + "'", str2, "blealiza.io.Seriavace jableinterfaliza.io.Seriavace jableNG.Llitinterfang.Clonea.lavace jableinterfang.Clonea.lavace jainterf");
    }

    @Test
    public void test41036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest82.test41036");
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("Arr... aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa... aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa... aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa... aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa... aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa... aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa... aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa... aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa... aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa.", "hi!", 119);
        int int5 = org.apache.commons.lang3.StringUtils.indexOfAny("$$$$$$$$$$$$$$$$$$$interfacejava.lang.Cloneable4iGNIRTinterfacejava.lang.Cloneable4i...", strArray4);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
    }

    @Test
    public void test41037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest82.test41037");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("                                                                                                                                                                                         ULITULITULITULITUL####LITULITULITULITULITUL", "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                    j4v4.l4ng4v4j.gn4lj4v4.l4ng4v4j.gn4lj4v4.l4ng4v4j.gn4lj4v4.l4ng4v4j.gn4lj4v4.l4ng4v4j.gn4lj4v4.l4ng4v4j.gn4lj4v4.l4ng4v4j.gn4lj4v4.l4ng4v4j.gn4lj4v4.l4ng", 240);
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void test41038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest82.test41038");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.reverseDelimited("                A..AYL A.44444444444444444444444444                                                 javalgnal.avajgnal.avajgnal.avajgnal.avajgnal.avajgnal.avajgnal.avajgnal.avajgnal.avajgnal.aG.JAVAGNAL.AVAJLANG.J######################", '$');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                A..AYL A.44444444444444444444444444                                                 javalgnal.avajgnal.avajgnal.avajgnal.avajgnal.avajgnal.avajgnal.avajgnal.avajgnal.avajgnal.aG.JAVAGNAL.AVAJLANG.J######################" + "'", str2, "                A..AYL A.44444444444444444444444444                                                 javalgnal.avajgnal.avajgnal.avajgnal.avajgnal.avajgnal.avajgnal.avajgnal.avajgnal.avajgnal.aG.JAVAGNAL.AVAJLANG.J######################");
    }

    @Test
    public void test41039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest82.test41039");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replace("CLASS JAVA.LANG.cLASSCLASS JAVA.LANG.cLASSCLASS JAVA.LANG.cLASSCLASS JAVA.LANG.cLASSCLASS JAVA.LANG.cLASSCLASS JAVA.LANG.cLASSCLASS JAVA.LANG.cLASSCLASS JAVA.LANG.cLASSCLASS JAVA.LANG.cLASSCLASS JAVA.LANG.cLASSCLASS JAVA.LANG.cLASSCLASS JAVA.LANG.cLASSCLASS JAVA.LANG.cLASSCLASS JAVA.LANG.cLASSCLASS JAVA.LANG.cLASSCLASS JAVA.LANG.cLASSCLASS JAVA.LANG.cLASSCLASS JAVA.LANG.cLASSCLASS JAVA.LANG.cLASSCLASS JAVA.LANG.cLASSCLASS JAVA.LANG.cLASSCLASS JAVA.LANG.cLASSCLASS JAVA.LANG.cLASSCLASS JAVA.LANG.cLASSCLASS JAVA.LANG.cLASSCLASS JAVA.LANG.cLASSCLASS JAVA.LANG.cLASSCLASS JAVA.LANG.cLASSCLASS JAVA.LANG.cLASSCLASS JAVA.LANG.cLASS", "javalit", "rface java.lang.cloneable                                                 ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "CLASS JAVA.LANG.cLASSCLASS JAVA.LANG.cLASSCLASS JAVA.LANG.cLASSCLASS JAVA.LANG.cLASSCLASS JAVA.LANG.cLASSCLASS JAVA.LANG.cLASSCLASS JAVA.LANG.cLASSCLASS JAVA.LANG.cLASSCLASS JAVA.LANG.cLASSCLASS JAVA.LANG.cLASSCLASS JAVA.LANG.cLASSCLASS JAVA.LANG.cLASSCLASS JAVA.LANG.cLASSCLASS JAVA.LANG.cLASSCLASS JAVA.LANG.cLASSCLASS JAVA.LANG.cLASSCLASS JAVA.LANG.cLASSCLASS JAVA.LANG.cLASSCLASS JAVA.LANG.cLASSCLASS JAVA.LANG.cLASSCLASS JAVA.LANG.cLASSCLASS JAVA.LANG.cLASSCLASS JAVA.LANG.cLASSCLASS JAVA.LANG.cLASSCLASS JAVA.LANG.cLASSCLASS JAVA.LANG.cLASSCLASS JAVA.LANG.cLASSCLASS JAVA.LANG.cLASSCLASS JAVA.LANG.cLASSCLASS JAVA.LANG.cLASS" + "'", str3, "CLASS JAVA.LANG.cLASSCLASS JAVA.LANG.cLASSCLASS JAVA.LANG.cLASSCLASS JAVA.LANG.cLASSCLASS JAVA.LANG.cLASSCLASS JAVA.LANG.cLASSCLASS JAVA.LANG.cLASSCLASS JAVA.LANG.cLASSCLASS JAVA.LANG.cLASSCLASS JAVA.LANG.cLASSCLASS JAVA.LANG.cLASSCLASS JAVA.LANG.cLASSCLASS JAVA.LANG.cLASSCLASS JAVA.LANG.cLASSCLASS JAVA.LANG.cLASSCLASS JAVA.LANG.cLASSCLASS JAVA.LANG.cLASSCLASS JAVA.LANG.cLASSCLASS JAVA.LANG.cLASSCLASS JAVA.LANG.cLASSCLASS JAVA.LANG.cLASSCLASS JAVA.LANG.cLASSCLASS JAVA.LANG.cLASSCLASS JAVA.LANG.cLASSCLASS JAVA.LANG.cLASSCLASS JAVA.LANG.cLASSCLASS JAVA.LANG.cLASSCLASS JAVA.LANG.cLASSCLASS JAVA.LANG.cLASSCLASS JAVA.LANG.cLASS");
    }

    @Test
    public void test41040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest82.test41040");
        char[] charArray15 = new char[] { ' ', ' ', '#', 'a', '4', 'a' };
        int int16 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "", charArray15);
        boolean boolean17 = org.apache.commons.lang3.StringUtils.containsAny("$", charArray15);
        int int18 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "", charArray15);
        boolean boolean19 = org.apache.commons.lang3.StringUtils.containsAny("$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$", charArray15);
        boolean boolean20 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "Integer", charArray15);
        boolean boolean21 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "gnal.avaj", charArray15);
        int int22 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "jvstringnlrrylistrrylistrrylistvj.gnlrrylistrrylistrryl", charArray15);
        boolean boolean23 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "A..ayLA.", charArray15);
        int int24 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaavaj", charArray15);
        org.junit.Assert.assertNotNull(charArray15);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray15), "  #a4a");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray15), "  #a4a");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray15), "[ ,  , #, a, 4, a]");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
    }

    @Test
    public void test41041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest82.test41041");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "gnirtS.gnal.avaj ssalcgnirtS.gnal.avaj ssalcgnirtS.gnal.avaj ssalcgnirtS.gnal.avaj ssalcgnirtS.gnal.avaj ssalcgnirtS.gnal.avaj ssalcgnirtS.gnal.avaj ssalcgnirtS.gnal.avaj ssalcgnirtS.gnal.avaj ssalcgnirtS.gnal.avaj ssalcgnirtS.gnal.avaj ssalcgnirtS.gnal.avaj ssalcgnirtS.gnal.avaj ssalcgnirtS.gnal.avaj ssalcgnirtS.gnal.avaj ssalcgnirtS.gnal.avaj ... .... .java.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.lang... .... .java.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.lang... .... .java.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.lang... .... .java.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.lang... .... .java.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.lang... .... .4444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444", "LANGaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa44444444444444444444444444..");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 6 + "'", int2 == 6);
    }

    @Test
    public void test41042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest82.test41042");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("hi!", "");
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.stripAll(strArray2, "$");
        java.lang.Class<?>[] wildcardClassArray5 = org.apache.commons.lang3.ClassUtils.toClass((java.lang.Object[]) strArray2);
        java.lang.Class<?> wildcardClass6 = null;
        java.lang.Class[] classArray8 = new java.lang.Class[1];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray9 = (java.lang.Class<?>[]) classArray8;
        wildcardClassArray9[0] = wildcardClass6;
        java.lang.Class<?>[] wildcardClassArray12 = org.apache.commons.lang3.ClassUtils.primitivesToWrappers(wildcardClassArray9);
        java.lang.String[] strArray14 = new java.lang.String[] { "                                   " };
        java.lang.String str15 = org.apache.commons.lang3.StringUtils.getCommonPrefix(strArray14);
        java.lang.Class<?>[] wildcardClassArray16 = org.apache.commons.lang3.ClassUtils.toClass((java.lang.Object[]) strArray14);
        java.lang.Class<?> wildcardClass17 = null;
        java.lang.Class[] classArray19 = new java.lang.Class[1];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray20 = (java.lang.Class<?>[]) classArray19;
        wildcardClassArray20[0] = wildcardClass17;
        java.lang.Class<?>[] wildcardClassArray23 = org.apache.commons.lang3.ClassUtils.primitivesToWrappers(wildcardClassArray20);
        boolean boolean24 = org.apache.commons.lang3.ClassUtils.isAssignable(wildcardClassArray16, wildcardClassArray20);
        boolean boolean26 = org.apache.commons.lang3.ClassUtils.isAssignable(wildcardClassArray9, wildcardClassArray20, true);
        boolean boolean28 = org.apache.commons.lang3.ClassUtils.isAssignable(wildcardClassArray5, wildcardClassArray20, false);
        java.lang.Class<?>[] wildcardClassArray29 = org.apache.commons.lang3.ClassUtils.primitivesToWrappers(wildcardClassArray5);
        java.lang.Class<?>[] wildcardClassArray30 = org.apache.commons.lang3.ClassUtils.primitivesToWrappers(wildcardClassArray29);
        java.lang.Class<?>[] wildcardClassArray31 = org.apache.commons.lang3.ClassUtils.primitivesToWrappers(wildcardClassArray30);
        java.lang.String[] strArray34 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("hi!", "");
        java.lang.String[] strArray36 = org.apache.commons.lang3.StringUtils.stripAll(strArray34, "$");
        java.lang.Class<?>[] wildcardClassArray37 = org.apache.commons.lang3.ClassUtils.toClass((java.lang.Object[]) strArray34);
        java.lang.Class<?>[] wildcardClassArray38 = org.apache.commons.lang3.ClassUtils.toClass((java.lang.Object[]) wildcardClassArray37);
        java.lang.String str42 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) wildcardClassArray38, '#', (int) (byte) -1, (-1));
        java.lang.Class<?> wildcardClass43 = null;
        java.lang.Class[] classArray45 = new java.lang.Class[1];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray46 = (java.lang.Class<?>[]) classArray45;
        wildcardClassArray46[0] = wildcardClass43;
        java.lang.Class<?>[] wildcardClassArray49 = org.apache.commons.lang3.ClassUtils.primitivesToWrappers(wildcardClassArray46);
        java.lang.Class<?>[] wildcardClassArray50 = org.apache.commons.lang3.ClassUtils.primitivesToWrappers(wildcardClassArray46);
        boolean boolean51 = org.apache.commons.lang3.ClassUtils.isAssignable(wildcardClassArray38, wildcardClassArray50);
        boolean boolean52 = org.apache.commons.lang3.ClassUtils.isAssignable(wildcardClassArray30, wildcardClassArray38);
        java.lang.String[] strArray54 = org.apache.commons.lang3.StringUtils.splitByCharacterType("... AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA... AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA... AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA... AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA... AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA... AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA... AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA... AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA... AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA... AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA");
        java.lang.Class<?>[] wildcardClassArray55 = org.apache.commons.lang3.ClassUtils.toClass((java.lang.Object[]) strArray54);
        java.lang.Class<?>[] wildcardClassArray56 = org.apache.commons.lang3.ClassUtils.primitivesToWrappers(wildcardClassArray55);
        java.lang.Class<?>[] wildcardClassArray57 = org.apache.commons.lang3.ClassUtils.wrappersToPrimitives(wildcardClassArray56);
        java.lang.Class<?>[] wildcardClassArray58 = org.apache.commons.lang3.ClassUtils.toClass((java.lang.Object[]) wildcardClassArray57);
        java.lang.Class<?>[] wildcardClassArray59 = org.apache.commons.lang3.ClassUtils.primitivesToWrappers(wildcardClassArray57);
        boolean boolean61 = org.apache.commons.lang3.ClassUtils.isAssignable(wildcardClassArray30, wildcardClassArray57, true);
        java.lang.Class<?>[] wildcardClassArray62 = org.apache.commons.lang3.ClassUtils.primitivesToWrappers(wildcardClassArray57);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertNotNull(wildcardClassArray5);
        org.junit.Assert.assertNotNull(classArray8);
        org.junit.Assert.assertNotNull(wildcardClassArray9);
        org.junit.Assert.assertNotNull(wildcardClassArray12);
        org.junit.Assert.assertNotNull(strArray14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "                                   " + "'", str15, "                                   ");
        org.junit.Assert.assertNotNull(wildcardClassArray16);
        org.junit.Assert.assertNotNull(classArray19);
        org.junit.Assert.assertNotNull(wildcardClassArray20);
        org.junit.Assert.assertNotNull(wildcardClassArray23);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNotNull(wildcardClassArray29);
        org.junit.Assert.assertNotNull(wildcardClassArray30);
        org.junit.Assert.assertNotNull(wildcardClassArray31);
        org.junit.Assert.assertNotNull(strArray34);
        org.junit.Assert.assertNotNull(strArray36);
        org.junit.Assert.assertNotNull(wildcardClassArray37);
        org.junit.Assert.assertNotNull(wildcardClassArray38);
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "" + "'", str42, "");
        org.junit.Assert.assertNotNull(classArray45);
        org.junit.Assert.assertNotNull(wildcardClassArray46);
        org.junit.Assert.assertNotNull(wildcardClassArray49);
        org.junit.Assert.assertNotNull(wildcardClassArray50);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertNotNull(strArray54);
        org.junit.Assert.assertNotNull(wildcardClassArray55);
        org.junit.Assert.assertNotNull(wildcardClassArray56);
        org.junit.Assert.assertNotNull(wildcardClassArray57);
        org.junit.Assert.assertNotNull(wildcardClassArray58);
        org.junit.Assert.assertNotNull(wildcardClassArray59);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + false + "'", boolean61 == false);
        org.junit.Assert.assertNotNull(wildcardClassArray62);
    }

    @Test
    public void test41043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest82.test41043");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.endsWithIgnoreCase("$         ...", " aRRAYlISTaRRAYlISTaRRAYlISTAVAJgnal.avajlang.javagnal.avajlang.javagnal.avajlang.javagnal.avajlang.javagnal.avajlang.javagnal.avajlang.javagnal.avajlang.javagnal.avajlang.javagnal");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test41044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest82.test41044");
        int int3 = org.apache.commons.lang3.StringUtils.indexOfIgnoreCase("JAVAULANGRRAYLIST", "                       REGETNi                      ", 130);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test41045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest82.test41045");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBetween("       aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa...       aaClass[]aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "     A..AYL A.44444444444444444444444444      ");
        org.junit.Assert.assertNull(str2);
    }

    @Test
    public void test41046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest82.test41046");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.remove("J#v#.l#ngj#v#.l#ngj#v#.l#ngj#v#.l#ngj#v#.l#ngj#v#.l#ngj#v#.l#ngj#v#.l#ngj#v#.l#ngj#v#.l#ngj#v#.l#ngj#v#.l#ngj#v#.l#ngj#v#.l#ngj#v#.l#ngj#v#.l#ngj#v#.l#ngj#v#.l#ngj#v#.l#ngj#v#.l#ngj#v#.l#ngj#v#.l#ngj#v#.l#ngj#v#.l#ngj#v#.l#ngj#v#.l#ngj#v#.l#ngj#v#.l#ngj#v#.l#ngj#v#.l#ngj#v#.l#ngj#v#.l#ngj#v#.l#ng", "Gnirt...");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "J#v#.l#ngj#v#.l#ngj#v#.l#ngj#v#.l#ngj#v#.l#ngj#v#.l#ngj#v#.l#ngj#v#.l#ngj#v#.l#ngj#v#.l#ngj#v#.l#ngj#v#.l#ngj#v#.l#ngj#v#.l#ngj#v#.l#ngj#v#.l#ngj#v#.l#ngj#v#.l#ngj#v#.l#ngj#v#.l#ngj#v#.l#ngj#v#.l#ngj#v#.l#ngj#v#.l#ngj#v#.l#ngj#v#.l#ngj#v#.l#ngj#v#.l#ngj#v#.l#ngj#v#.l#ngj#v#.l#ngj#v#.l#ngj#v#.l#ng" + "'", str2, "J#v#.l#ngj#v#.l#ngj#v#.l#ngj#v#.l#ngj#v#.l#ngj#v#.l#ngj#v#.l#ngj#v#.l#ngj#v#.l#ngj#v#.l#ngj#v#.l#ngj#v#.l#ngj#v#.l#ngj#v#.l#ngj#v#.l#ngj#v#.l#ngj#v#.l#ngj#v#.l#ngj#v#.l#ngj#v#.l#ngj#v#.l#ngj#v#.l#ngj#v#.l#ngj#v#.l#ngj#v#.l#ngj#v#.l#ngj#v#.l#ngj#v#.l#ngj#v#.l#ngj#v#.l#ngj#v#.l#ngj#v#.l#ngj#v#.l#ng");
    }

    @Test
    public void test41047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest82.test41047");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.chop("                                                                                                                                                      ...");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "                                                                                                                                                      .." + "'", str1, "                                                                                                                                                      ..");
    }

    @Test
    public void test41048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest82.test41048");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass2 = org.apache.commons.lang3.ClassUtils.getClass("                                                                                                                                                                                                                                                                                                                                                                                                                                                                              ssalC                                                                                                                                                                                                                                                                                                                                                                                                                                                                              ", true);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassNotFoundException; message: ssalC");
        } catch (java.lang.ClassNotFoundException e) {
            // Expected exception.
        }
    }

    @Test
    public void test41049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest82.test41049");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.capitalize((java.lang.CharSequence) "utilString[]");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "UtilString[]" + "'", str1, "UtilString[]");
    }

    @Test
    public void test41050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest82.test41050");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.endsWithIgnoreCase("Class java.lang.Objectclass java.lang.Objectclass java.lang.Objectclass java.lang.Objectclass java.lang.Objectclass java.lang.Objectclass java.lang.Objectclass java.lang.Objectclass java.lang.Objectclass java.lang.Objectclass java.lang.Objectclass java.lang.Objectclass java.lang.Objectclass java.lang.Objectclass java.lang.Objectclass java.lang.Objectclass java.lang.Objectclass java.lang.Objectclass java.lang.Objectclass java.lang.Objectclass java.lang.Objectclass java.lang.Object", "lvj");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test41051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest82.test41051");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("... AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA... AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA... AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA... AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA... AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA... AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA... AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA... AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA... AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA... AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA", "javalitu.");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray2);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "... AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA... AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA... AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA... AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA... AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA... AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA... AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA... AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA... AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA... AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA" + "'", str3, "... AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA... AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA... AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA... AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA... AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA... AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA... AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA... AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA... AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA... AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA");
    }

    @Test
    public void test41052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest82.test41052");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.split("interface java.lang.CloneableString[]String[]String[]String[]String[]String[]String[]String[]String[]String[]String[]String[]String[]String[]String[]String[]String[]String[]String[]String[]String[]String[]String[]String[]String[]String[]String[]String[]String[]String[]String[]String[]String[]String[]String[]String[]String[]String[]String[]String[]String[]String[]String[]String[]String[]String[]String[]String[]String[]String[]String[]String[]String[]String[]String[]String[]String[]String[]String[]String[]String[]String[]String[]String[]String[]String[]String[]interface java.io.Serializable", "litu");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.concat((java.lang.Object[]) strArray2);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "nerface java.ang.ConeabeSrng[]Srng[]Srng[]Srng[]Srng[]Srng[]Srng[]Srng[]Srng[]Srng[]Srng[]Srng[]Srng[]Srng[]Srng[]Srng[]Srng[]Srng[]Srng[]Srng[]Srng[]Srng[]Srng[]Srng[]Srng[]Srng[]Srng[]Srng[]Srng[]Srng[]Srng[]Srng[]Srng[]Srng[]Srng[]Srng[]Srng[]Srng[]Srng[]Srng[]Srng[]Srng[]Srng[]Srng[]Srng[]Srng[]Srng[]Srng[]Srng[]Srng[]Srng[]Srng[]Srng[]Srng[]Srng[]Srng[]Srng[]Srng[]Srng[]Srng[]Srng[]Srng[]Srng[]Srng[]Srng[]Srng[]Srng[]nerface java.o.Serazabe" + "'", str3, "nerface java.ang.ConeabeSrng[]Srng[]Srng[]Srng[]Srng[]Srng[]Srng[]Srng[]Srng[]Srng[]Srng[]Srng[]Srng[]Srng[]Srng[]Srng[]Srng[]Srng[]Srng[]Srng[]Srng[]Srng[]Srng[]Srng[]Srng[]Srng[]Srng[]Srng[]Srng[]Srng[]Srng[]Srng[]Srng[]Srng[]Srng[]Srng[]Srng[]Srng[]Srng[]Srng[]Srng[]Srng[]Srng[]Srng[]Srng[]Srng[]Srng[]Srng[]Srng[]Srng[]Srng[]Srng[]Srng[]Srng[]Srng[]Srng[]Srng[]Srng[]Srng[]Srng[]Srng[]Srng[]Srng[]Srng[]Srng[]Srng[]Srng[]nerface java.o.Serazabe");
    }

    @Test
    public void test41053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest82.test41053");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("", "FAVAJ.GNALAVA$$$.JAVA$$$.JAVA$$$.JAVA$$$.JAVA$$$.JAVA$$$.JAVA$$$.JAVA$$$.JAVA$$$.JAVA$$$.JAVA$$$.JAVA$$$.JAVA$$$.JAVA$$$.JAVA$$$.JAVA$$$.JAVA$$$.JAVA$$$.JAVA$$$.JAVA$$$.JAVA$$$.JAVA$$$.JAVA$$$.JAVA$$$.JAVA$$$.JAVA$$$.JAVA$$$.JAVA$$$.JAVA$$$.JAVA$$$.JAVA$$$.JAVA$$$.JAVA$$$.JAVA$$$.JAVAINTERFACE JAVA.IO.SERIALIZABLE", 535);
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void test41054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest82.test41054");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.startsWith("aaaaaaggginterfaeajavaglanggaloneablegggggggjavaggggggggggjavaggggggggggjavaggggggggggjavaggggggggggjavaggggggggggjavaggggggggggjavaggggggggggjavaggggggggggjavaggggggggggjavaggggggggggjavaggggggggggjavaggggggggggjavaggggggggggjavaggggggggggjavaggggggggggjavaggggggggggjavaggggggggggjavaggggggggggjavaggggggggggjavaggggggggggjavaggggggggggjavaggggggggggjavaggggggggggjavaggggggggggjavaggggggggggjavaggggggggggjavaggggggggggjavaggggggggggjavaggggggggggjavaggggggggggjavaggggggggggjavaggggggggggjavaggggggggggjavaggggggggggjavainterfaeajavagiogSerializableinterfaeajavaglanggaloneablegggggggjavaggggggggggjavaggggggggggjavaggggggggggjavaggggggggggjavaggggggggggjavaggggggggggjavaggggggggggjavaggggggggggjavaggggggggggjavaggggggggggjavaggggggggggjavaggggggggggjavaggggggggggjavaggggggggggjavaggggggggggjavaggggggggggjavaggggggggggjavaggggggggggjavaggggggggggjavaggggggggggjavaggggggggggjavaggggggggggjavaggggggggggjavaggggggggggjavaggggggggggja", "                                                                                                                                                                                                                                                  44444444444444444444-1java444444444444444444444                                                                                                                                                                                                                                                   ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test41055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest82.test41055");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitByCharacterTypeCamelCase(".ArrayListArrayListArrayListArrayLis");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray1, 'a');
        java.lang.String str5 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray1, 'a');
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + ".aArrayaListaArrayaListaArrayaListaArrayaLis" + "'", str3, ".aArrayaListaArrayaListaArrayaListaArrayaLis");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + ".aArrayaListaArrayaListaArrayaListaArrayaLis" + "'", str5, ".aArrayaListaArrayaListaArrayaListaArrayaLis");
    }

    @Test
    public void test41056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest82.test41056");
        java.lang.CharSequence charSequence8 = null;
        char[] charArray17 = new char[] { ' ', ' ', '#', 'a', '4', 'a' };
        int int18 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "", charArray17);
        boolean boolean19 = org.apache.commons.lang3.StringUtils.containsAny("......", charArray17);
        boolean boolean20 = org.apache.commons.lang3.StringUtils.containsOnly(charSequence8, charArray17);
        boolean boolean21 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "AtsiLytcejbO.gnal.avaj ssalcrrAtsiLytcejbO.gnal.avaj ssalcrrAva.langGNAL..langjava.langAGNAL.AVAJ", charArray17);
        int int22 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "JAVA.UTIL.", charArray17);
        boolean boolean23 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "ArrayListArrayListArrayListavajagnal", charArray17);
        boolean boolean24 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "                                                                                                                                                                                                                                             HI!aRRAYlISTaRRAYlISTaRRAYlISTAVAJ.GNALaRRAYlISTaRRAYlISTaRRAYlISTAVAJ                                                                                                                                                                                                                                              ", charArray17);
        int int25 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "ArrayLis", charArray17);
        boolean boolean26 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "-1javaJAVATSILYARRATSILYARRATSILYARRA", charArray17);
        int int27 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "LNuLNuLNuLNuLNuLNuLNuLNuLNuLNuLNuLNuLNuLNuLNuLNuLNuLNuLNuLNuLNuLNuLNuLNuLNuLNuLNuLNuLNuLNuLNuLNuLNuLNuLNuLNuLNuLNuLNuLNuLNuLNuLNuLNuLNuLNuLNuLNuLNuLNuLNuLNuLNuLNuLNuLNuLNuLNuLNuLNuLNuLNuLNuLNuLNuLNuLNuLNuLNuLNuLNuLNuLNuLNuLNuLNuLNuLNuLNuLNuLNuLNuLNuLNuLNuLNuLNuLNuLNuLNuLNuLNuLNuLNuLNuLNuLNuLNuLNuLNuLNuLNuLNuLNuLNuLNuLNuLNuLNuLNuLNLNuLNuLNuLNuLNuLNuLNuLNuLNuLNuLNuLNuLNuLNuLNuLNuLNuLNuLNuLNuLNuLNuLNuLNuLNuLNuLNuLNuLNuLNuLNuLNuLNuLNuLNuLNuLNuLNuLNuLNuLNuLNuLNuLNuLNuLNuLNuLNuLNuLNuLNuLNuLNuLNuLNuLNuLNuLNuLNuLNuLNuLNuLNuLNuLNuLNuLNuLNuLNuLNuLNuLNuLNuLNuLNuLNuLNuLNuLNuLNuLNuLNuLNuLNuLNuLNuLNuLNuLNuLNuLNuLNuLNuLNuLNuLNuLNuLNuLNuLNuLNuLNuLNuLNuLNuLNuLNuLNuLNuLNuL", charArray17);
        boolean boolean28 = org.apache.commons.lang3.StringUtils.containsAny("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaIT.ITaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", charArray17);
        org.junit.Assert.assertNotNull(charArray17);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray17), "  #a4a");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray17), "  #a4a");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray17), "[ ,  , #, a, 4, a]");
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
    }

    @Test
    public void test41057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest82.test41057");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replace("JAVA.LANG", "aj  aj  aj  aj  aj  aj$#######$########aj  aj  aj  aj  aj  aj                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                 ", "                                                                                                                       ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "JAVA.LANG" + "'", str3, "JAVA.LANG");
    }

    @Test
    public void test41058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest82.test41058");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("                                       sl..Ug..r.S                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                       ", '$');
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.stripAll(strArray2);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void test41059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest82.test41059");
        java.util.Locale locale1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.apache.commons.lang3.StringUtils.upperCase("interfacejavaalangaCloneable#interfacejavaaiointerfacejavaalangaCloneable#interfacejavaaiointerfacejav", locale1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test41060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest82.test41060");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.split("RFACE JAVA.LANG.CLONEABLE", "");
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test41061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest82.test41061");
        java.lang.ClassLoader classLoader0 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass2 = org.apache.commons.lang3.ClassUtils.getClass(classLoader0, ".................................................................................................................................................................................................................................JAVA.LANG                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                    .................................................................................................................................................................................................................................");
            org.junit.Assert.fail("Expected exception of type java.lang.ClassNotFoundException; message: /////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////JAVA/LANG/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////");
        } catch (java.lang.ClassNotFoundException e) {
            // Expected exception.
        }
    }

    @Test
    public void test41062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest82.test41062");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass1 = org.apache.commons.lang3.ClassUtils.getClass("..aaaaaaaaaaaaaaaaaaaaaaaaaaaaa.....");
            org.junit.Assert.fail("Expected exception of type java.lang.ClassNotFoundException; message: //aaaaaaaaaaaaaaaaaaaaaaaaaaaaa/////");
        } catch (java.lang.ClassNotFoundException e) {
            // Expected exception.
        }
    }

    @Test
    public void test41063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest82.test41063");
        int int2 = org.apache.commons.lang3.StringUtils.countMatches("J#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#lass java#lang#String", "aaaaaaa$aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test41064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest82.test41064");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.endsWithIgnoreCase("AAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAA", "#####################################################################################################################################################################################################################################################################################################################################################################################################################################################..........a       ..");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test41065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest82.test41065");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replace("arrayListArrayListArrayListavaj.gna", "interface javalangCloneableainterface java.io.Serializable", "AAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agn");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "arrayListArrayListArrayListavaj.gna" + "'", str3, "arrayListArrayListArrayListavaj.gna");
    }

    @Test
    public void test41066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest82.test41066");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripToNull("444444aaaaaaaINTEGERaaaaaaa4444444");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "444444aaaaaaaINTEGERaaaaaaa4444444" + "'", str1, "444444aaaaaaaINTEGERaaaaaaa4444444");
    }

    @Test
    public void test41067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest82.test41067");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeEnd("gnal.avaj                                                                                                                                                                                                                                                                                                                                                                                                                                                      ", "interface java.lang.CloneableAAAAAAAAAAAAAAAAAAAAAAAAAAAinterface java.io.Serializable");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "gnal.avaj                                                                                                                                                                                                                                                                                                                                                                                                                                                      " + "'", str2, "gnal.avaj                                                                                                                                                                                                                                                                                                                                                                                                                                                      ");
    }

    @Test
    public void test41068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest82.test41068");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("Arrclas...", "Character", 23);
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.getCommonPrefix(strArray3);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
    }

    @Test
    public void test41069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest82.test41069");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("rrUTILsTRING.UTILsTRING-1JAVA.-1JAVAlituUTILsTRING.UTILsTRING-1JAVA.-1JAVAvUTILsTRING.UTILsTRING-1JAVA.-1JAVAjlituUTILsTRING.UTILsTRING-1JAVA.-1JAVAvUTILsTRING.UTILsTRING-1JAVA.-1JAVAj");
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test41070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest82.test41070");
        java.lang.CharSequence charSequence2 = org.apache.commons.lang3.StringUtils.defaultIfBlank((java.lang.CharSequence) "agnAAAAAAAAAAistArrayListArrayListavaj.gnalArrayListArrayListArrayLigagnAAAAAAAAAAistArrayListArrayListavaj.gnalArrayListArrayListArrayLigagnAAAAAAAAAAistArrayListArrayListavaj.gnalArrayListArrayListArrayLigagnAAAAAAAAAAistArrayListArrayListavaj.gnalArrayListArrayListArrayLigagnAAAAAAAAAAistArrayListArrayListavaj.gnalArrayListArrayListArr.......    ioayListArrayListArrayLigagnAAAAAAAAAAistArrayListArrayListavaj.gnalArrayListArrayListArrayLigagnAAAAAAAAAAistArrayListArrayListavaj.gnalArrayListArrayListArrayLigagnAAAAAAAAAAistArrayListArrayListavaj.gnalArrayListArrayListArrayLigagnAAAAAAAAAAistinterface java.lang.Cloneable             Character             interface java.io.Serializable", (java.lang.CharSequence) "aAAAAAAAAAAA");
        org.junit.Assert.assertEquals("'" + charSequence2 + "' != '" + "agnAAAAAAAAAAistArrayListArrayListavaj.gnalArrayListArrayListArrayLigagnAAAAAAAAAAistArrayListArrayListavaj.gnalArrayListArrayListArrayLigagnAAAAAAAAAAistArrayListArrayListavaj.gnalArrayListArrayListArrayLigagnAAAAAAAAAAistArrayListArrayListavaj.gnalArrayListArrayListArrayLigagnAAAAAAAAAAistArrayListArrayListavaj.gnalArrayListArrayListArr.......    ioayListArrayListArrayLigagnAAAAAAAAAAistArrayListArrayListavaj.gnalArrayListArrayListArrayLigagnAAAAAAAAAAistArrayListArrayListavaj.gnalArrayListArrayListArrayLigagnAAAAAAAAAAistArrayListArrayListavaj.gnalArrayListArrayListArrayLigagnAAAAAAAAAAistinterface java.lang.Cloneable             Character             interface java.io.Serializable" + "'", charSequence2, "agnAAAAAAAAAAistArrayListArrayListavaj.gnalArrayListArrayListArrayLigagnAAAAAAAAAAistArrayListArrayListavaj.gnalArrayListArrayListArrayLigagnAAAAAAAAAAistArrayListArrayListavaj.gnalArrayListArrayListArrayLigagnAAAAAAAAAAistArrayListArrayListavaj.gnalArrayListArrayListArrayLigagnAAAAAAAAAAistArrayListArrayListavaj.gnalArrayListArrayListArr.......    ioayListArrayListArrayLigagnAAAAAAAAAAistArrayListArrayListavaj.gnalArrayListArrayListArrayLigagnAAAAAAAAAAistArrayListArrayListavaj.gnalArrayListArrayListArrayLigagnAAAAAAAAAAistArrayListArrayListavaj.gnalArrayListArrayListArrayLigagnAAAAAAAAAAistinterface java.lang.Cloneable             Character             interface java.io.Serializable");
    }

    @Test
    public void test41071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest82.test41071");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceChars(".........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........javainterface java.io                                               ", 'a', '#');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + ".........j#v#..........j#v#..........j#v#..........j#v#..........j#v#..........j#v#..........j#v#..........j#v#..........j#v#..........j#v#..........j#v#..........j#v#..........j#v#..........j#v#..........j#v#..........j#v#..........j#v#..........j#v#..........j#v#..........j#v#..........j#v#..........j#v#..........j#v#..........j#v#..........j#v#..........j#v#..........j#v#..........j#v#..........j#v#..........j#v#interf#ce j#v#.io                                               " + "'", str3, ".........j#v#..........j#v#..........j#v#..........j#v#..........j#v#..........j#v#..........j#v#..........j#v#..........j#v#..........j#v#..........j#v#..........j#v#..........j#v#..........j#v#..........j#v#..........j#v#..........j#v#..........j#v#..........j#v#..........j#v#..........j#v#..........j#v#..........j#v#..........j#v#..........j#v#..........j#v#..........j#v#..........j#v#..........j#v#..........j#v#interf#ce j#v#.io                                               ");
    }

    @Test
    public void test41072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest82.test41072");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitByCharacterTypeCamelCase("                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                      LC.GNAL.AVAJ ECAFRETNIELBAZILAIRES.OI.AVAJ ECAFRETNI$ELBAENOLC.GNAL.AVAJ ECAFRETNIELBAZILAIRES.OI.AVAJ ECAFRETNI$ELBAENOLC.GNAL.AVAJ ECAFRETNI$GNAL.AVAJ");
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test41073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest82.test41073");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOf("Arr... 444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444... 444444444444444444444444444444444444444444444444", "                                                                                                                                                    ArryListArryListArryListvjGNAL.AVAJLANG.JAVAGNAL.AVAJLANG.JAVAGNAL.AVAJLANG.JAVAGNAL.AVAJLANG.JAVAGNAL.AVAJLANG.JAVAGNAL.AVAJLANG.JAVAGNAL.AVAJLANG.JAVAGNAL.AVAJLANG.JAVAGNAL.AVAJgnl                                                                                                                                                     ");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test41074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest82.test41074");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.strip("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaastrinaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa. aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaastrinaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaastrinaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa. aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaastrinaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa" + "'", str1, "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaastrinaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa. aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaastrinaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
    }

    @Test
    public void test41075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest82.test41075");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("..................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................GNIRTSLITU.AVAJ1-GNIRTSLITU.AVAJ1-", "va.langGNAL..la.$JAVA$$$$$$$$$$JAVA$$$$$$$$$$JAVA$$$$$$$$$$JAVA$$$$$$$$$$JAVA$$$$$$$$$$JAVA$$$$$$$$$$JAVA$$$$$$$$$$JAVA");
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test41076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest82.test41076");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.split("####################################################################################################################################################################################################################aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa...1aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa...1aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa...1aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa...1aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa...1aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa...1aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa...1aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa...1aaaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test41077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest82.test41077");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isWhitespace((java.lang.CharSequence) "irfSeriaCoSeria.SeriairfioSeriaSriiz                                                                                                                                                                                                                                                                                                                                                                                                                                                         ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test41078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest82.test41078");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("aggginterfaeajavaglanggaloneablegggggggjavaggggggggggjavaggggggggggjavaggggggggggjavaggggggggggjavaggggggggggjavaggggggggggjavaggggggggggjavaggggggggggjavaggggggggggjavaggggggggggjavaggggggggggjavaggggggggggjavaggggggggggjavaggggggggggjavaggggggggggjavaggggggggggjavaggggggggggjavaggggggggggjavaggggggggggjavaggggggggggjavaggggggggggjavaggggggggggjavaggggggggggjavaggggggggggjavaggggggggggjavaggggggggggjavaggggggggggjavaggggggggggjavaggggggggggjavaggggggggggjavaggggggggggjavaggggggggggjavaggggggggggjavaggggggggggjavainterfaeajavagiogSerializableinterfaeajavaglanggaloneablegggggggjavaggggggggggjavaggggggggggjavaggggggggggjavaggggggggggjavaggggggggggjavaggggggggggjavaggggggggggjavaggggggggggjavaggggggggggjavaggggggggggjavaggggggggggjavaggggggggggjavaggggggggggjavaggggggggggjavaggggggggggjavaggggggggggjavaggggggggggjavaggggggggggjavaggggggggggjavaggggggggggjavaggggggggggjavaggggggggggjavaggggggggggjavaggggggggggjavaggggggggggja");
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test41079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest82.test41079");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.reverseDelimited("hi!arraylistarraylistarraylistavaj.gnalarraylistarraylistarraylist", ' ');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!arraylistarraylistarraylistavaj.gnalarraylistarraylistarraylist" + "'", str2, "hi!arraylistarraylistarraylistavaj.gnalarraylistarraylistarraylist");
    }

    @Test
    public void test41080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest82.test41080");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.deleteWhitespace("classslitugnirtsslitugnirtsslitugnirtsslitugnirtsslitugnirtsslitugnirtinterfacegaga.lang.cloneableaaaaaaaaaagagal.agnaaaaaaaaaagagal.agnaaaaaaaaaagagal.agnaaaaaaaaaagagal.agnaaaaaaaaaagagal.agnaaaaaaaaaagagal.agnaaaaaaaaaagagal.agnaaaaaaaaaagagal.agnaaaaaaaaaagagal.agnaaaaaaaaaagagal.agnaaaaaaaaaagagal.agnaaaaaaaaaagagal.agnaaaaaaaaaagagal.agnaaaaaaaaaagagal.agnaaaaaaaaaagagal.agnaaaaaaaaaagagal.agnaaaaaaaaaagagal.agnaaaaaaaaaagagal.agnaaaaaaaaaagagal.agnaaaaaaaaaagagal.agnaaaaaaaaaagagal.agnaaaaaaaaaagagal.agnaaaaaaaaaagagal.agnaaaaaaaaaagagal.agnaaaaaaaaaagagal.agnaaaaaaaaaagagal.agnaaaaaaaaaagagal.agnaaaaaaaaaagagal.agnaaaaaaaaaagagal.agnaaaaaaaaaagagal.agnaaaaaaaaaagagal.agnaaaaaaaaaagagal.agnaaaaaaaaaagagal.agnaaaaaaaaaagagal.agnaaaaaaaaaagagal.agnaaaaaaaaaaringinterfacegaga.io");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "classslitugnirtsslitugnirtsslitugnirtsslitugnirtsslitugnirtsslitugnirtinterfacegaga.lang.cloneableaaaaaaaaaagagal.agnaaaaaaaaaagagal.agnaaaaaaaaaagagal.agnaaaaaaaaaagagal.agnaaaaaaaaaagagal.agnaaaaaaaaaagagal.agnaaaaaaaaaagagal.agnaaaaaaaaaagagal.agnaaaaaaaaaagagal.agnaaaaaaaaaagagal.agnaaaaaaaaaagagal.agnaaaaaaaaaagagal.agnaaaaaaaaaagagal.agnaaaaaaaaaagagal.agnaaaaaaaaaagagal.agnaaaaaaaaaagagal.agnaaaaaaaaaagagal.agnaaaaaaaaaagagal.agnaaaaaaaaaagagal.agnaaaaaaaaaagagal.agnaaaaaaaaaagagal.agnaaaaaaaaaagagal.agnaaaaaaaaaagagal.agnaaaaaaaaaagagal.agnaaaaaaaaaagagal.agnaaaaaaaaaagagal.agnaaaaaaaaaagagal.agnaaaaaaaaaagagal.agnaaaaaaaaaagagal.agnaaaaaaaaaagagal.agnaaaaaaaaaagagal.agnaaaaaaaaaagagal.agnaaaaaaaaaagagal.agnaaaaaaaaaagagal.agnaaaaaaaaaagagal.agnaaaaaaaaaaringinterfacegaga.io" + "'", str1, "classslitugnirtsslitugnirtsslitugnirtsslitugnirtsslitugnirtsslitugnirtinterfacegaga.lang.cloneableaaaaaaaaaagagal.agnaaaaaaaaaagagal.agnaaaaaaaaaagagal.agnaaaaaaaaaagagal.agnaaaaaaaaaagagal.agnaaaaaaaaaagagal.agnaaaaaaaaaagagal.agnaaaaaaaaaagagal.agnaaaaaaaaaagagal.agnaaaaaaaaaagagal.agnaaaaaaaaaagagal.agnaaaaaaaaaagagal.agnaaaaaaaaaagagal.agnaaaaaaaaaagagal.agnaaaaaaaaaagagal.agnaaaaaaaaaagagal.agnaaaaaaaaaagagal.agnaaaaaaaaaagagal.agnaaaaaaaaaagagal.agnaaaaaaaaaagagal.agnaaaaaaaaaagagal.agnaaaaaaaaaagagal.agnaaaaaaaaaagagal.agnaaaaaaaaaagagal.agnaaaaaaaaaagagal.agnaaaaaaaaaagagal.agnaaaaaaaaaagagal.agnaaaaaaaaaagagal.agnaaaaaaaaaagagal.agnaaaaaaaaaagagal.agnaaaaaaaaaagagal.agnaaaaaaaaaagagal.agnaaaaaaaaaagagal.agnaaaaaaaaaagagal.agnaaaaaaaaaagagal.agnaaaaaaaaaaringinterfacegaga.io");
    }

    @Test
    public void test41081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest82.test41081");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isEmpty((java.lang.CharSequence) "$$$$$$$$$$$$$$$$$$$..$                                                                 AtsiLytcejbOlvjsslcrrAtsiLytcejbO.gnal.avaj ssalcrrAva.langGNAL..langjava.langAGNAL.AVAJ$$$$$$$$$$$$$$$$$$$..$$");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test41082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest82.test41082");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.center("javal#.#agn", 0, "LANGaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa                                                                                                                                                                                                                                                                                                                                                                                                           ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "javal#.#agn" + "'", str3, "javal#.#agn");
    }

    @Test
    public void test41083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest82.test41083");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.abbreviate("AAAAangAAAAA", 0, 40);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "AAAAangAAAAA" + "'", str3, "AAAAangAAAAA");
    }

    @Test
    public void test41084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest82.test41084");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.split("...e", "                                                                                                                                                                                       rrlituvjlituvj                                                                                                                                                                                       ", 240);
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void test41085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest82.test41085");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.split("arraylist");
        java.lang.String[] strArray6 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                 ", "StringStringStringStringStringStringStringStringStringString", 0);
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.replaceEachRepeatedly("vvaylasa", strArray2, strArray6);
        java.lang.String str9 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray2, '$');
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "vvaylasa" + "'", str7, "vvaylasa");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "arraylist" + "'", str9, "arraylist");
    }

    @Test
    public void test41086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest82.test41086");
        java.lang.String[] strArray5 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("AVAJ.GNAL", "class java.lang.String", 940);
        boolean boolean6 = org.apache.commons.lang3.StringUtils.startsWithAny("java.langjava.langjava.langjava.langjava.langjava.la                                                ", strArray5);
        int int7 = org.apache.commons.lang3.StringUtils.indexOfDifference((java.lang.CharSequence[]) strArray5);
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.concat((java.lang.Object[]) strArray5);
        java.lang.String[] strArray12 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("1java", "ArrayListArrayListArrayListavajagnal", 493);
        java.lang.String str16 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray12, 'a', 893, 0);
        java.lang.String str18 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray12, ".ALya..A $$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$ $$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$ $$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$ $$$$$$$$$$$$$$$$$$$$$$$");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str19 = org.apache.commons.lang3.StringUtils.replaceEachRepeatedly("                      INTEGER                       ", strArray5, strArray12);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Search and Replace array lengths don't match: 2 vs 1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "AVAJGNAL" + "'", str8, "AVAJGNAL");
        org.junit.Assert.assertNotNull(strArray12);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "1java" + "'", str18, "1java");
    }

    @Test
    public void test41087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest82.test41087");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.split("a..ayl a");
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test41088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest82.test41088");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("INTERFACE JAVA.LANG.cLONEABLEi", "CLASSJAVA.UTIL.ABSTRACTLISTGNLUVJ....................................................................CLASSJAVA.UTIL.ABSTRACTCOLLECTIONGNLUVJ....................................................................CLASSJAVA.LANG", 0);
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void test41089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest82.test41089");
        char[] charArray16 = new char[] { ' ', ' ', '#', 'a', '4', 'a' };
        int int17 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "", charArray16);
        boolean boolean18 = org.apache.commons.lang3.StringUtils.containsAny("$", charArray16);
        boolean boolean19 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "...       AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA...       AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA...       AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA...       AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA...       AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA...       AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA...       AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA...       AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA...       AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA...       AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA", charArray16);
        boolean boolean20 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "java.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.lang", charArray16);
        int int21 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "...", charArray16);
        boolean boolean22 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "LANG.GNALJAVA.LANGAVAJ.GNALJAVA.LANGAVAJ.GNALJAVA.LANGAVAJ.GNALJAVA.LANGAVAJ.GNALJAVA.LANGAVAJ.GNALJAVA.LANGAVAJ.GNALJAVA.LANGAVAJ.GNALJAVA.LANGAVAJ.JAVA", charArray16);
        int int23 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "...       aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", charArray16);
        int int24 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "STRING", charArray16);
        boolean boolean25 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "java$.lang.Stringclass java.lang.Stringclass java.lang.Stringclas.lang.Stringclass java.lang.Stringc", charArray16);
        boolean boolean26 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "                                           ziirSoifri.oCfri                                            ", charArray16);
        org.junit.Assert.assertNotNull(charArray16);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray16), "  #a4a");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray16), "  #a4a");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray16), "[ ,  , #, a, 4, a]");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 3 + "'", int23 == 3);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
    }

    @Test
    public void test41090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest82.test41090");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.endsWith("##RyLRsA##RyLRsA##RyLRsA##RyLRsA##        A##RyLRsA##RyLRsA##RyLRsA##RyLRsA##        A##RyLRsA##RyLRsA##RyLRsA##RyLRsA##        A##RyLRsA##RyLRsA##RyLRs", "");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test41091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest82.test41091");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.defaultIfBlank("444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444litu.avajlitu.avajArrayListArrayListArrayListavajGNAL.AVAJLANG.JAVAGNAL.AVAJLANG.JAVAGNAL.AVAJLANG....", "AAjAvAAAAAAjAvAAAAAAjAvAAAAAAjAvAAAAAAjAvAAAAAAjAvAAAAAAjAvAAAAAAjAvAAAAAAjAvAAAAAAjAvAAAAAAjAvAAAAAAjAvAAAAAAjAvAAAAAAjAvAAAAAAjAvAAAAAAjAvAAAAAAjAvAAAAAAjAvAAAAAAjAvAAAAAAjAvAAAAAAjAvAAAAAAjAvAAAAAAjAvAAAAAAjAvAAAAAAjAvAAAAAAjAvAAAAAAjAvAAAAAAjAvAAAAAAjAvAAAAAAjAvAAAAAAjAvAAAAAAjAvAAAAAAjAvAAAAAAjAvAAAAAAjAvAAAAAAjAvAAAAAAjAvAAAAAAjAvAAAAAAjAvAAAAAAjAvAAAAAAjAvAAAAAAjAvAAAAAAjAvAAAAAAjAvAAAAAAjAvAAAAAAjAvAAAAAAjAvAAAAAAjAvAAAAAAjAvAAAAAAjAvAAAAAAjAvAAAAAAjAvAAAAAAjAlAllAjAvAAlAngAlAAAng");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444litu.avajlitu.avajArrayListArrayListArrayListavajGNAL.AVAJLANG.JAVAGNAL.AVAJLANG.JAVAGNAL.AVAJLANG...." + "'", str2, "444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444litu.avajlitu.avajArrayListArrayListArrayListavajGNAL.AVAJLANG.JAVAGNAL.AVAJLANG.JAVAGNAL.AVAJLANG....");
    }

    @Test
    public void test41092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest82.test41092");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringAfter("javaJ.Jla", "JAVAlLANGJAVAlLANGJAVAlLANGJAVAlLANGJAVAlLANGJAVAlLANGJAVAlLANGJAVAlLANGJAVAlLANGJAVAlLANGJAVAlLANGJAVAlLANGJAVAlLANGJAVAlLANGJAVAlLANGJAVAlLANGJAVAlLANGJAVAlLANGJAVAlLANGJAVAlLANGJAVAlLANGJAVAlLANGJAVAlLANGJAVAlLANGJAVAlLANGJAVAlLANGJAjaval.agnjaval.agnjaval.agnjaval.agnjaval.agnjaval.agnjaval.agnjaval.agnjabytejaval.agnjaval.agnjaval.agnjaval.agnjaval.agnjaval.agnjaval.agnjaval.agnjaJAVAlLANGJAVAlLANGJAVAlLANGJAVAlLANGJAVAlLANGJAVAlLANGJAVAlLANGJAVAlLANGJAVAlLANGJAVAlLANGJAVAlLANGJAVAlLANGJAVAlLANGJAVAlLANGJAVAlLANGJAVAlLANGJAVAlLANGJAVAlLANGJAVAlLANGJAVAlLANGJAVAlLANGJAVAlLANGJAVAlLANGJAVAlLANGJAVAlLANGJAVAlLANGJA");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test41093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest82.test41093");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass2 = org.apache.commons.lang3.ClassUtils.getClass("langagnalj", false);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassNotFoundException; message: langagnalj");
        } catch (java.lang.ClassNotFoundException e) {
            // Expected exception.
        }
    }

    @Test
    public void test41094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest82.test41094");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substring("...L.AGNAAAAAAAAAA..", 358);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test41095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest82.test41095");
        java.util.Locale locale1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.apache.commons.lang3.StringUtils.lowerCase("     AA...", locale1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test41096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest82.test41096");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trimToEmpty("Interface java.lang.Cloneablehi!arr..interface java.io.Serializable...                                                                                                                                     ...");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Interface java.lang.Cloneablehi!arr..interface java.io.Serializable...                                                                                                                                     ..." + "'", str1, "Interface java.lang.Cloneablehi!arr..interface java.io.Serializable...                                                                                                                                     ...");
    }

    @Test
    public void test41097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest82.test41097");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripToEmpty("                                                                                                                                                                                                                                                              ...$$$$$$$$$$$$$$$...");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "...$$$$$$$$$$$$$$$..." + "'", str1, "...$$$$$$$$$$$$$$$...");
    }

    @Test
    public void test41098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest82.test41098");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.startsWithIgnoreCase("interfacejava.lang.Cloneable#interfacejava.iointerfacejava.lang.Cloneable#interfacejava.iointerfacejava.lang.Cloneable#interfacejava.iointerfacejavabOOLEANinterfacejava.lang.Cloneable#interfacejava.iointerfacejava.lang.Cloneable#interfacejava.iointerfacejava.lang.Cloneable#interfacejava.iointerfacejava", "44444444444444444444444444                                 ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test41099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest82.test41099");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.containsWhitespace("A$L.AVA$L.AVA$L.AVAinterfacejava.lang.Cloneable#interfacejava.iointerfacejava.lang.Cloneable#interfacejava.iointerfacejava.laA$L.AVA$L.AVA$L.AVA$");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test41100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest82.test41100");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("GNAL.AVAJGNAL..langGNAL.AVAJGNALLituLlituLlitu", "                                                                                                                                                                                                                                                              ...$$$$$$$$$$$$$$$...");
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test41101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest82.test41101");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trimToNull("gn                                            gn                                            gn                                            #########################################################...#########################################################...#########################################################...#########################################################...###########################################STRING.gn                                            gn                                            gn                                            #########################################################...#########################################################...#########################################################...#########################################################...############################################");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "gn                                            gn                                            gn                                            #########################################################...#########################################################...#########################################################...#########################################################...###########################################STRING.gn                                            gn                                            gn                                            #########################################################...#########################################################...#########################################################...#########################################################...############################################" + "'", str1, "gn                                            gn                                            gn                                            #########################################################...#########################################################...#########################################################...#########################################################...###########################################STRING.gn                                            gn                                            gn                                            #########################################################...#########################################################...#########################################################...#########################################################...############################################");
    }

    @Test
    public void test41102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest82.test41102");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripToNull("GNAL.AVAJ ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "GNAL.AVAJ" + "'", str1, "GNAL.AVAJ");
    }

    @Test
    public void test41103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest82.test41103");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("       $", "gnalArrayListArrayListArrayListavaj.gnalArrayListArrayListArrayLi");
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.getCommonPrefix(strArray3);
        java.lang.String[] strArray8 = org.apache.commons.lang3.StringUtils.split("ArrayList", "$", 10);
        java.lang.String str9 = org.apache.commons.lang3.StringUtils.getCommonPrefix(strArray8);
        java.lang.String str10 = org.apache.commons.lang3.StringUtils.replaceEach("AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA", strArray3, strArray8);
        java.lang.Class<?>[] wildcardClassArray11 = org.apache.commons.lang3.ClassUtils.toClass((java.lang.Object[]) strArray3);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "       $" + "'", str4, "       $");
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "ArrayList" + "'", str9, "ArrayList");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA" + "'", str10, "AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA");
        org.junit.Assert.assertNotNull(wildcardClassArray11);
    }

    @Test
    public void test41104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest82.test41104");
        int int2 = org.apache.commons.lang3.StringUtils.getLevenshteinDistance((java.lang.CharSequence) "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", (java.lang.CharSequence) "-1String[");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 45 + "'", int2 == 45);
    }

    @Test
    public void test41105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest82.test41105");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.split("interface java.lang.CloneableAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAja                                              AAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAringinterface java.io.Serializable");
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test41106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest82.test41106");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfAnyBut("                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                        ylist............................rraylist............................rraylist............................rray$arraylis", "interface java.lang.Cloneable.interface java.io.Serializable");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 824 + "'", int2 == 824);
    }

    @Test
    public void test41107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest82.test41107");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBeforeLast("iNTEGER", "ARRA");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "iNTEGER" + "'", str2, "iNTEGER");
    }

    @Test
    public void test41108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest82.test41108");
        char[] charArray11 = new char[] { ' ', ' ', '#', 'a', '4', 'a' };
        int int12 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "", charArray11);
        boolean boolean13 = org.apache.commons.lang3.StringUtils.containsAny("$", charArray11);
        boolean boolean14 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "hi!ArrayListArrayListArrayListavajhhhh AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAhhh AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAhhh AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAhhh AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAhhh AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAhhh AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAhhh AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAhhh AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAhhh AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAhhh AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA", charArray11);
        boolean boolean15 = org.apache.commons.lang3.StringUtils.containsAny("vaj", charArray11);
        boolean boolean16 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "Arrclass java......................", charArray11);
        org.junit.Assert.assertNotNull(charArray11);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray11), "  #a4a");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray11), "  #a4a");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray11), "[ ,  , #, a, 4, a]");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test41109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest82.test41109");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("nG", "gnal..Array..List..Array..List..Array..L.........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........");
        java.lang.Class<?> wildcardClass3 = strArray2.getClass();
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test41110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest82.test41110");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.difference("Serializable", "Java.litu.avajlitu.avajjava.litu.avajlitu.avajjava.litu.avajlitu.avajjava.litu.avajlitu.avajjava.litu.avajlitu.avajjava.litu.avajlitu.avajjava.litu.avajlitu.avajjava.litu.avajlitu.avajjava.litu.avajlitu.avajjava.litu.avajlitu.avajjava.litu.avajlitu.avajjava.litu.avajlitu.avajjava.litu.avajlitu.avajjava.litu.avajlitu.avajjava.litu.avajlitu.avajjava.litu.avajlitu.avajjava.litu.avajlitu.avajjava.litu.avajlitu.avajjava.litu.avajlitu.avajjava.litu.avajlitu.avajjava.litu.avajlitu.avajjava.litu.avajlitu.avajjava.litu.avajlitu.avajjava.litu.avajlitu.avajjava.litu.avajlitu.avajjava.litu.avajlitu.avajjava.litu.avajlitu.avajjava.litu.avajlitu.avajjava.litu.avajlitu.avajjava.litu.avajlitu.avajjava.litu.avajlitu.avajjava.litu.avajlitu.avajjava.litu.avajlitu.avaj");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Java.litu.avajlitu.avajjava.litu.avajlitu.avajjava.litu.avajlitu.avajjava.litu.avajlitu.avajjava.litu.avajlitu.avajjava.litu.avajlitu.avajjava.litu.avajlitu.avajjava.litu.avajlitu.avajjava.litu.avajlitu.avajjava.litu.avajlitu.avajjava.litu.avajlitu.avajjava.litu.avajlitu.avajjava.litu.avajlitu.avajjava.litu.avajlitu.avajjava.litu.avajlitu.avajjava.litu.avajlitu.avajjava.litu.avajlitu.avajjava.litu.avajlitu.avajjava.litu.avajlitu.avajjava.litu.avajlitu.avajjava.litu.avajlitu.avajjava.litu.avajlitu.avajjava.litu.avajlitu.avajjava.litu.avajlitu.avajjava.litu.avajlitu.avajjava.litu.avajlitu.avajjava.litu.avajlitu.avajjava.litu.avajlitu.avajjava.litu.avajlitu.avajjava.litu.avajlitu.avajjava.litu.avajlitu.avajjava.litu.avajlitu.avajjava.litu.avajlitu.avaj" + "'", str2, "Java.litu.avajlitu.avajjava.litu.avajlitu.avajjava.litu.avajlitu.avajjava.litu.avajlitu.avajjava.litu.avajlitu.avajjava.litu.avajlitu.avajjava.litu.avajlitu.avajjava.litu.avajlitu.avajjava.litu.avajlitu.avajjava.litu.avajlitu.avajjava.litu.avajlitu.avajjava.litu.avajlitu.avajjava.litu.avajlitu.avajjava.litu.avajlitu.avajjava.litu.avajlitu.avajjava.litu.avajlitu.avajjava.litu.avajlitu.avajjava.litu.avajlitu.avajjava.litu.avajlitu.avajjava.litu.avajlitu.avajjava.litu.avajlitu.avajjava.litu.avajlitu.avajjava.litu.avajlitu.avajjava.litu.avajlitu.avajjava.litu.avajlitu.avajjava.litu.avajlitu.avajjava.litu.avajlitu.avajjava.litu.avajlitu.avajjava.litu.avajlitu.avajjava.litu.avajlitu.avajjava.litu.avajlitu.avajjava.litu.avajlitu.avajjava.litu.avajlitu.avaj");
    }

    @Test
    public void test41111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest82.test41111");
        int int2 = org.apache.commons.lang3.StringUtils.countMatches("          j#v## # n          j#v## # n          j#v## # n          j#v## # n          j#v## # n          j#v## # n          j#v## # n          j#v## # n          j#v## # n          j#v## # n          j#v## # n          j#v## # n          j#                                                     j#v## # n          j#v## # n          j#v## # n          j#v## # n          j#v## # n          j#v## # n          j#v## # n          j#v## # n          j#v## # n          j#v## # n          j#v## # n          j#v## # n          rin ", "................interface java.lang.Cloneable.litinterface java.io.erializable                                                                                                                                                                                                                                                                                                                                                                                                                                                                  ................");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test41112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest82.test41112");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfAnyBut("              $Integer$              ", "   A..ayL A    ");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 14 + "'", int2 == 14);
    }

    @Test
    public void test41113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest82.test41113");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.abbreviateMiddle("44444444444444444.4...", "444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444javal.agnjaval.agnjaval.agnjaval.agnjaval.agnjaval.agnjaval.agnjaval.agnjabytejaval.agnjaval.agnjaval.agnjaval.agnjaval.agnjaval.agnjaval.agnjaval.agnja", (int) (byte) 0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "44444444444444444.4..." + "'", str3, "44444444444444444.4...");
    }

    @Test
    public void test41114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest82.test41114");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.contains("etyBetyBetyBetyBetyBetyBAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA...etyBetyBetyBetyBetyBetyBestststststststststststststststststststststststststststststststststststststststststststststststststststststststststststststststststststststststststststststststststststststststststststststststststststststststststststststststststststststststststststststststststststststststststststststststststststststststststststststststststststststststststststststststststststststststststststststststststststststststststststststststststststststststststststststststststststststststststststststststststststststststststststststststststststststststststststststststststststststststststststststst", 303);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test41115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest82.test41115");
        java.lang.CharSequence charSequence0 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.apache.commons.lang3.StringUtils.getLevenshteinDistance(charSequence0, (java.lang.CharSequence) "$$$$$$$$$$$$$$$$$$$interfacejava.lang.Cloneable4iGNIRTinterfacejava.lang.Cloneable4i...");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Strings must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test41116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest82.test41116");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("RFACEJAVALANGCLONEABLELANGGNALJAVALANGAVAJGNALJAVALANGAVAJGNALJAVALANGAVAJGNALJAVALANGAVAJGNALJAVALANGAVAJGNALJAVALANGAVAJ", "tavaj.gnalarraylistarraylistarrayli");
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test41117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest82.test41117");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfAnyBut("ULITULITULITULITUL####LITULITULITULITULITUL", "aRRAYlISTaRRAYlISTaRRAYlISTAVAJAGNA");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test41118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest82.test41118");
        int int3 = org.apache.commons.lang3.StringUtils.indexOfIgnoreCase("nterfae javalangloneablevajgnalinterfae javaioSerializablenterfae javalangloneableGNAL$.$AVA", "                                                                            ][gnirtSlitu.avaj1-", 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test41119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest82.test41119");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphanumericSpace((java.lang.CharSequence) "##RyLRsA##RyLRsA##RyLRsA##RyLRsA##        A##RyLRsA##RyLRsA##RyLRsA##RyLRsA##        A##RyLRsA##RyLRsA##RyLRsA##RyLRsA##        A##RyLRsA##RyLRsA##RyLRs");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test41120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest82.test41120");
        int int2 = org.apache.commons.lang3.StringUtils.indexOf("ETYbjava..........java..........java...java..........java..........java...java..........java..........java...java..........java..........java...java..........java..........java...java..........java..........java...java..........java..........java...java..........java..........java...java..........java..........java...java..........java..........java...java..........java..........java...java..........java..........java...java..........java..........java...java..........java..........java...java..........java..........java...java..........java..........java...java..........java..........java...java..........java..........java...java..........java..........java", 219);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test41121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest82.test41121");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.uncapitalize((java.lang.CharSequence) "$$$$$$$$$$$$$JAVA.IO.SERIALIZABLE INTERFACE JAVA.LANG.CLONEABLE... INTERFACE$$$$$$$$$$$$$");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "$$$$$$$$$$$$$JAVA.IO.SERIALIZABLE INTERFACE JAVA.LANG.CLONEABLE... INTERFACE$$$$$$$$$$$$$" + "'", str1, "$$$$$$$$$$$$$JAVA.IO.SERIALIZABLE INTERFACE JAVA.LANG.CLONEABLE... INTERFACE$$$$$$$$$$$$$");
    }

    @Test
    public void test41122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest82.test41122");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trimToNull("                                                                                                                                                                                                                                                                                                                                                                                                         utiljava");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "utiljava" + "'", str1, "utiljava");
    }

    @Test
    public void test41123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest82.test41123");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBetween("S.r..gU..ls                                       ", "java.langjava.langjava.1aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaajava.1aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa.1aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa.1aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa.1aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa.1aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa.1aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa.1aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa.1aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa.hi!arraylistarraylistarraylistavaj");
        org.junit.Assert.assertNull(str2);
    }

    @Test
    public void test41124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest82.test41124");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBefore("arraylistarraylistarraylistavaj.gnalaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test41125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest82.test41125");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlpha((java.lang.CharSequence) ".......JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAV");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test41126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest82.test41126");
        java.lang.ClassLoader classLoader0 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass2 = org.apache.commons.lang3.ClassUtils.getClass(classLoader0, "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                     ArrayListArrayListArrayListavajagnal");
            org.junit.Assert.fail("Expected exception of type java.lang.ClassNotFoundException; message: ArrayListArrayListArrayListavajagnal");
        } catch (java.lang.ClassNotFoundException e) {
            // Expected exception.
        }
    }

    @Test
    public void test41127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest82.test41127");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.substringBetween("                 ", "      .", "###################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################-1String[]");
        org.junit.Assert.assertNull(str3);
    }

    @Test
    public void test41128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest82.test41128");
        java.lang.CharSequence charSequence2 = org.apache.commons.lang3.StringUtils.defaultIfEmpty((java.lang.CharSequence) "sERILIZBL                         ", (java.lang.CharSequence) "gnal..Array..List..Array..List..Array..L.........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........");
        org.junit.Assert.assertEquals("'" + charSequence2 + "' != '" + "sERILIZBL                         " + "'", charSequence2, "sERILIZBL                         ");
    }

    @Test
    public void test41129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest82.test41129");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOf("jliava444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444litu.", 43, 413);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test41130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest82.test41130");
        java.lang.String str2 = org.apache.commons.lang3.ClassUtils.getShortClassName((java.lang.Object) ".. u", "AAAAJAVAULANGrrayListAAAAJAVAULANGrrayListAAAAJAVAULANGrrayListAAAAJAVAULANGrrayListAAAAJAVAULANGrrayListAAAAJAVAULANGrrayListAAAAJAVAULANGrrayListAAAAJAVAULANGrrayListAAAAJAVAULANGrrayListAAAAJAVAULANGrrayListAAAAJAVAULANGrrayLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLyAAA.");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "String" + "'", str2, "String");
    }

    @Test
    public void test41131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest82.test41131");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOfIgnoreCase("TsiLytcejbclass", "...                                            ..                                            ..                                            ..                                            ..                                            ..                                            ..                                            ..                                            ..                                            ..                                            ..                                            ..                                    ");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test41132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest82.test41132");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNumericSpace((java.lang.CharSequence) "BYTEINTERFACE GAGA.LANG.CLONEABLEAAAAAAAAAAGAGAL.AGNAAAAAAAAAAGAGAL.AGNAAAAAAAAAAGAGAL.AGNAAAAAAAAAAGAGAL.AGNAAAAAAAAAAGAGAL.AGNAAAAAAAAAAGAGAL.AGNAAAAAAAAAAGAGAL.AGNAAAAAAAAAAGAGAL.AGNAAAAAAAAAAGAGAL.AGNAAAAAAAAAAGAGAL.AGNAAAAAAAAAAGAGAL.AGNAAAAAAAAAAGAGAL.AGNAAAAAAAAAAGAGAL.AGNAAAAAAAAAAGAGAL.AGNAAAAAAAAAAGAGAL.AGNAAAAAAAAAAGAGAL.AGNAAAAAAAAAAGAGAL.AGNAAAAAAAAAAGAGAL.AGNAAAAAAAAAAGAGAL.AGNAAAAAAAAAAGAGAL.AGNAAAAAAAAAAGAGAL.AGNAAAAAAAAAAGAGAL.AGNAAAAAAAAAAGAGAL.AGNAAAAAAAAAAGAGAL.AGNAAAAAAAAAAGAGAL.AGNAAAAAAAAAAGAGAL.AGNAAAAAAAAAAGAGAL.AGNAAAAAAAAAAGAGAL.AGNAAAAAAAAAAGAGAL.AGNAAAAAAAAAAGAGAL.AGNAAAAAAAAAAGAGAL.AGNAAAAAAAAAAGAGAL.AGNAAAAAAAAAAGAGAL.AGNAAAAAAAAAAGAGAL.AGNAAAAAAAAAAGAGAL.AGNAAAAAAAAAARINGINTERFACE GAGA.IO.SERIALIZABLE");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test41133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest82.test41133");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.reverse("                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                             jvstringnlrrylistrrylistrrylistv");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "vtsilyrrtsilyrrtsilyrrlngnirtsvj                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                             " + "'", str1, "vtsilyrrtsilyrrtsilyrrlngnirtsvj                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                             ");
    }

    @Test
    public void test41134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest82.test41134");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.reverseDelimited("jAV-1JAVA.UTILsTRING-1JAVA.UTILsTRING-1JAVA.UTILsTRING-1JAVA.UTILsTRING-1JAVA", 'a');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "jAV-1JAVA.UTILsTRING-1JAVA.UTILsTRING-1JAVA.UTILsTRING-1JAVA.UTILsTRING-1JAVA" + "'", str2, "jAV-1JAVA.UTILsTRING-1JAVA.UTILsTRING-1JAVA.UTILsTRING-1JAVA.UTILsTRING-1JAVA");
    }

    @Test
    public void test41135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest82.test41135");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNotBlank((java.lang.CharSequence) "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                         ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test41136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest82.test41136");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlpha((java.lang.CharSequence) "vaj.gnaljava.langavaj.gnaljava.langavaj.gnaljava.langavaj.gnaljava.langavaj.gnaljava.langavaj.gnaljava.lang");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test41137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest82.test41137");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.reverse("interfINTERFACE JAVA.LANG.cLONEABLEsTRINGce jINTERFACE JAVA.LANG.cLONEABLEsTRINGvINTERFACE JAVA.LANG.cLONEABLEsTRING.lINTERFACE JAVA.LANG.cLONEABLEsTRINGng.cloneINTERFACE JAVA.LANG.cLONEABLEsTRINGble");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "elbGNIRTsELBAENOLc.GNAL.AVAJ ECAFRETNIenolc.gnGNIRTsELBAENOLc.GNAL.AVAJ ECAFRETNIl.GNIRTsELBAENOLc.GNAL.AVAJ ECAFRETNIvGNIRTsELBAENOLc.GNAL.AVAJ ECAFRETNIj ecGNIRTsELBAENOLc.GNAL.AVAJ ECAFRETNIfretni" + "'", str1, "elbGNIRTsELBAENOLc.GNAL.AVAJ ECAFRETNIenolc.gnGNIRTsELBAENOLc.GNAL.AVAJ ECAFRETNIl.GNIRTsELBAENOLc.GNAL.AVAJ ECAFRETNIvGNIRTsELBAENOLc.GNAL.AVAJ ECAFRETNIj ecGNIRTsELBAENOLc.GNAL.AVAJ ECAFRETNIfretni");
    }

    @Test
    public void test41138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest82.test41138");
        char[] charArray12 = new char[] { ' ', ' ', '#', 'a', '4', 'a' };
        int int13 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "", charArray12);
        boolean boolean14 = org.apache.commons.lang3.StringUtils.containsAny("$", charArray12);
        boolean boolean15 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "...       AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA...       AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA...       AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA...       AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA...       AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA...       AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA...       AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA...       AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA...       AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA...       AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA", charArray12);
        boolean boolean16 = org.apache.commons.lang3.StringUtils.containsAny("class java.lang.Object", charArray12);
        boolean boolean17 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "st", charArray12);
        boolean boolean18 = org.apache.commons.lang3.StringUtils.containsAny("LANGALANGALANGALANGALANGALANGALANGALANGALANGALANGALANGALANGALANGALANGALANGALANGALANGALANGALANGALANGALANGALANGALANGALANGALANGALANGALANGALANGALANGALANGALANGALANGALANGALANGALANGALANGALANGALANGALANGALANGALANGALANGALANGALANGALANGALANGALANGALANGALANGALANGALANGALANGALANGALANGALANGALANGALANGALANGALANGALANGALANGALANGALANGALANGALANGALANGALANGALANGALANGALANGALANGALANGALANGALANGA", charArray12);
        org.junit.Assert.assertNotNull(charArray12);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray12), "  #a4a");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray12), "  #a4a");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray12), "[ ,  , #, a, 4, a]");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test41139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest82.test41139");
        int int2 = org.apache.commons.lang3.StringUtils.indexOf("gnAls444", 13);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test41140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest82.test41140");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeStartIgnoreCase("$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$Gnal$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$", "$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$vaj.gnaljava.langavaj.gnaljava.langavaj.gnaljava.langavaj.gnaljava.langavaj.gnaljava.langavaj.gnaljava.lang$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$Gnal$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$" + "'", str2, "$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$Gnal$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$");
    }

    @Test
    public void test41141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest82.test41141");
        int int3 = org.apache.commons.lang3.StringUtils.indexOf("rgnalu                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                          ", 71, 687);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test41142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest82.test41142");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.center("         $         $         $         $         $         $         $         $         $         $         $         $         $         $         $         $         $         $         $         $         $         $         $         $         $         $         $         $         $         $         $         $         $         $         $         $", 26, '$');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "         $         $         $         $         $         $         $         $         $         $         $         $         $         $         $         $         $         $         $         $         $         $         $         $         $         $         $         $         $         $         $         $         $         $         $         $" + "'", str3, "         $         $         $         $         $         $         $         $         $         $         $         $         $         $         $         $         $         $         $         $         $         $         $         $         $         $         $         $         $         $         $         $         $         $         $         $");
    }

    @Test
    public void test41143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest82.test41143");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.abbreviate("CLASSSLITUGNIRTSSLITUGNIRTSSLITUGNIRTSSLITUGNIRTSSLITUGNIRTSSLITUGNIRTinterfacegaga.lang.CloneableAAAAAAAAAAgagal.agnAAAAAAAAAAgagal.agnAAAAAAAAAAgagal.agnAAAAAAAAAAgagal.agnAAAAAAAAAAgagal.agnAAAAAAAAAAgagal.agnAAAAAAAAAAgagal.agnAAAAAAAAAAgagal.agnAAAAAAAAAAgagal.agnAAAAAAAAAAgagal.agnAAAAAAAAAAgagal.agnAAAAAAAAAAgagal.agnAAAAAAAAAAgagal.agnAAAAAAAAAAgagal.agnAAAAAAAAAAgagal.agnAAAAAAAAAAgagal.agnAAAAAAAAAAgagal.agnAAAAAAAAAAgagal.agnAAAAAAAAAAgagal.agnAAAAAAAAAAgagal.agnAAAAAAAAAAgagal.agnAAAAAAAAAAgagal.agnAAAAAAAAAAgagal.agnAAAAAAAAAAgagal.agnAAAAAAAAAAgagal.agnAAAAAAAAAAgagal.agnAAAAAAAAAAgagal.agnAAAAAAAAAAgagal.agnAAAAAAAAAAgagal.agnAAAAAAAAAAgagal.agnAAAAAAAAAAgagal.agnAAAAAAAAAAgagal.agnAAAAAAAAAAgagal.agnAAAAAAAAAAgagal.agnAAAAAAAAAAgagal.agnAAAAAAAAAAringinterfacegaga.io", 113, 200);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "....agnAAAAAAAAAAgagal.agnAAAAAAAAAAgagal.agnAAAAAAAAAAgagal.agnAAAAAAAAAAgagal.agnAAAAAAAAAAgagal.agnAAAAAAAAAAgagal.agnAAAAAAAAAAgagal.agnAAAAAAAAAAgagal.agnAAAAAAAAAAgagal.agnAAAAAAAAAAgagal.agn..." + "'", str3, "....agnAAAAAAAAAAgagal.agnAAAAAAAAAAgagal.agnAAAAAAAAAAgagal.agnAAAAAAAAAAgagal.agnAAAAAAAAAAgagal.agnAAAAAAAAAAgagal.agnAAAAAAAAAAgagal.agnAAAAAAAAAAgagal.agnAAAAAAAAAAgagal.agnAAAAAAAAAAgagal.agn...");
    }

    @Test
    public void test41144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest82.test41144");
        java.lang.String str2 = org.apache.commons.lang3.ClassUtils.getShortClassName((java.lang.Object) "JAVALITUJAVALITUJAVALITUJAVALITUJAVALITUJAVALITUJAVALITUJAVALITUJAVALITUJAVALITUJAVALITUJAVALITUJAVALITUJAVALITUJAVALITUJAVALITUJAVALITUJAVALI...", "][sslC][sslCrChahacta][sslC][ssl][sslC][sslCrChahacta][sslC][ssl][sslC][sslCrChahacta][sslC][ssl][sslC][sslCrChahacta][sslC][ssl][sslC][sslCrChahacta][sslC][ssl][sslC][sslCrChahacta][sslC][ssl][sslC][sslCrChahacta][sslC][ssl][sslC][sslCrChahacta][sslC][ssl][sslC][sslCrChahacta][sslC][ssl][sslC][sslCrChahacta][sslC][ssl][sslC][sslCrChahacta][sslC][ssl][sslC][sslCrChahacta][sslC][ssl][sslC][sslCrChahacta][sslC][ssl][sslC][sslCGNALaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaagn                                            ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "String" + "'", str2, "String");
    }

    @Test
    public void test41145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest82.test41145");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                     SSgnlA", ". Gnirt...GniNAL....................");
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test41146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest82.test41146");
        java.lang.String[] strArray5 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("      AAAAAAAAAAAAAAAAAAA                                                                                                                                              AAAAAAAAAAAAAAAAAAA                                                                                                                                              AAAAAAAAAAAAAAAAAAA                                                                                                                                              AAAAAAAAAAAAAAAAAAA                                                                                                                                              AAAAAAAAAAAAAAAAAAA                                                                                                                                              AAAAAAAAAAAAAAAAAAA", "VA");
        int int6 = org.apache.commons.lang3.StringUtils.indexOfAny("$$$$$$$$$$$$.", strArray5);
        boolean boolean7 = org.apache.commons.lang3.StringUtils.endsWithAny("", strArray5);
        int int8 = org.apache.commons.lang3.StringUtils.indexOfAny("langagnaljavaalangavajagnaljavaalangavajagnaljavaalangavajagnaljavaa", strArray5);
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
    }

    @Test
    public void test41147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest82.test41147");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.chop(".aL.ArrayListgnal.aL.ArrayList");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + ".aL.ArrayListgnal.aL.ArrayLis" + "'", str1, ".aL.ArrayListgnal.aL.ArrayLis");
    }

    @Test
    public void test41148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest82.test41148");
        int int2 = org.apache.commons.lang3.StringUtils.countMatches("SERIALIZABL...     JAVA44444444444444444.4444", "AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test41149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest82.test41149");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceChars("GN                                            ", '.', '.');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "GN                                            " + "'", str3, "GN                                            ");
    }

    @Test
    public void test41150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest82.test41150");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.substring("...                                            ..                                            ..                                            ..                                            ..                                            ..                                            ..                                            ..                                            ..                                            ..                                            ..                                            ..                                    ", 121, 493);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "                  ..                                            ..                                            ..                                            ..                                            ..                                            ..                                            ..                                            ..                              " + "'", str3, "                  ..                                            ..                                            ..                                            ..                                            ..                                            ..                                            ..                                            ..                              ");
    }

    @Test
    public void test41151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest82.test41151");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.swapCase("                                                                                                                                                               neable4interface java.io.Serializable");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "                                                                                                                                                               NEABLE4INTERFACE JAVA.IO.sERIALIZABLE" + "'", str1, "                                                                                                                                                               NEABLE4INTERFACE JAVA.IO.sERIALIZABLE");
    }

    @Test
    public void test41152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest82.test41152");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceOnce("stringUtilsStringUtilsStringUtilsStringUtilsStringUtilsStringUtilsStr...", " AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA4444444444444AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAACLASclass java.lang.StringCLASCLASclass java.lang.StringCLASCLASclass java.lang.StringCLASCLASclass java.lang.StringCLASCLASclass java.lang.StringCLASCLASclass java.lang.", "... ... ... ... ... ... ... ... ... ...");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "stringUtilsStringUtilsStringUtilsStringUtilsStringUtilsStringUtilsStr..." + "'", str3, "stringUtilsStringUtilsStringUtilsStringUtilsStringUtilsStringUtilsStr...");
    }

    @Test
    public void test41153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest82.test41153");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("javal#####################", '4');
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test41154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest82.test41154");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitByCharacterType("AAAAAAAAAAAAAAAAAAA      ");
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test41155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest82.test41155");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "............................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................lass...                                       ", "BYAA");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test41156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest82.test41156");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.contains("interface#java.lang.cloneable4interface#java.io.serializableinterface#java.lang.cloneable4interface#java.io.serializableinterface#java.lang.cloneable4interface#jlituface#java.lang.cloneable4interface#java.io.serializableinterface#java.lang.cloneable4interface#java.io.serializableaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "44444444444444444GNALUAVAJ44444444444444444444444444444444444444444444444444444444444444444444444");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test41157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest82.test41157");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "                                                                                      ", "4444444444444444444444444444444444444444444444444444444444444444444444444444444n4444444444444444444444444444444444444444444444444444444444444444444444444444444");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test41158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest82.test41158");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.defaultString("tsiyarr.a.lantsiyarr.a.lantsiyarr.a.lantsiyarr.a.lantsiyarr.a.lantsiyarr.a.lantsiyarr.a.lantsiyarr.asaylavvsaylavvsaylavvsaylavvsaylavvsaylavvsaylavvsaylavvsaylavvsaylavvsaylavvsaylavvsaylavvsaylavvsaylavvsaylavvsaylavvsaylavvsaylavvsaylavvsaylavvsaylavvsaylavvsaylavvsaylavvsaylavvsaylavvsaylavvsaylavvsaylavvsaylavvsaylavvsaylavvsaylavvsaylavvsaylavvsaylavvsaylavvsaylavvsaylavvsaylavvsaylavvsaylavvsaylavvsaylavvsaylavvsaylavvsaylavvsaylavvsaylavvsaylavvsaylavvsaylavvsinterf ce j v  l ng Clone ble inte$$$$$$$$$$$$$$$$$$$$$$$$$$$$$aaa");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "tsiyarr.a.lantsiyarr.a.lantsiyarr.a.lantsiyarr.a.lantsiyarr.a.lantsiyarr.a.lantsiyarr.a.lantsiyarr.asaylavvsaylavvsaylavvsaylavvsaylavvsaylavvsaylavvsaylavvsaylavvsaylavvsaylavvsaylavvsaylavvsaylavvsaylavvsaylavvsaylavvsaylavvsaylavvsaylavvsaylavvsaylavvsaylavvsaylavvsaylavvsaylavvsaylavvsaylavvsaylavvsaylavvsaylavvsaylavvsaylavvsaylavvsaylavvsaylavvsaylavvsaylavvsaylavvsaylavvsaylavvsaylavvsaylavvsaylavvsaylavvsaylavvsaylavvsaylavvsaylavvsaylavvsaylavvsaylavvsaylavvsinterf ce j v  l ng Clone ble inte$$$$$$$$$$$$$$$$$$$$$$$$$$$$$aaa" + "'", str1, "tsiyarr.a.lantsiyarr.a.lantsiyarr.a.lantsiyarr.a.lantsiyarr.a.lantsiyarr.a.lantsiyarr.a.lantsiyarr.asaylavvsaylavvsaylavvsaylavvsaylavvsaylavvsaylavvsaylavvsaylavvsaylavvsaylavvsaylavvsaylavvsaylavvsaylavvsaylavvsaylavvsaylavvsaylavvsaylavvsaylavvsaylavvsaylavvsaylavvsaylavvsaylavvsaylavvsaylavvsaylavvsaylavvsaylavvsaylavvsaylavvsaylavvsaylavvsaylavvsaylavvsaylavvsaylavvsaylavvsaylavvsaylavvsaylavvsaylavvsaylavvsaylavvsaylavvsaylavvsaylavvsaylavvsaylavvsaylavvsaylavvsinterf ce j v  l ng Clone ble inte$$$$$$$$$$$$$$$$$$$$$$$$$$$$$aaa");
    }

    @Test
    public void test41159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest82.test41159");
        java.lang.String str1 = org.apache.commons.lang3.ClassUtils.getPackageCanonicalName("i.......                                                                                                                                                  ...");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "i........." + "'", str1, "i.........");
    }

    @Test
    public void test41160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest82.test41160");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.equals((java.lang.CharSequence) "elbazilaireS.oi.avaj ecafretniav...", (java.lang.CharSequence) "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                       interface java.lang.Cloneable.......java.......Objectava..........javainterface java.io.Serializable###########################################################################################################################################################################################################");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test41161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest82.test41161");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.normalizeSpace("ArrayLisArrayLisArrayLisArrayLisArra....................................................................................................ArrayLisArrayLisArrayLisArrayLisArra....................................................................................................ArrayLisArrayLisArrayLisArrayLisArra....................................................");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "ArrayLisArrayLisArrayLisArrayLisArra....................................................................................................ArrayLisArrayLisArrayLisArrayLisArra....................................................................................................ArrayLisArrayLisArrayLisArrayLisArra...................................................." + "'", str1, "ArrayLisArrayLisArrayLisArrayLisArra....................................................................................................ArrayLisArrayLisArrayLisArrayLisArra....................................................................................................ArrayLisArrayLisArrayLisArrayLisArra....................................................");
    }

    @Test
    public void test41162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest82.test41162");
        int int3 = org.apache.commons.lang3.StringUtils.indexOf("....................................", "...      $ARRAYLIS", 269);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test41163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest82.test41163");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.endsWithIgnoreCase("Gnl$", "IIIEEEEEEEAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEIII44IIIE");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test41164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest82.test41164");
        int int2 = org.apache.commons.lang3.StringUtils.getLevenshteinDistance((java.lang.CharSequence) "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                             ", (java.lang.CharSequence) "....................................................................$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$GNAL$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$                       $$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$GNAL$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$JAVAULANG");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 502 + "'", int2 == 502);
    }

    @Test
    public void test41165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest82.test41165");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replace("                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                    ", "444444444444444444.44444444444444444iNTERFACE JAVA$LANG$cLONEABLE$$$$$$$JAVA$$$$$$$$$$JAVA$$$$$$$$$$JAVA$$$$$$$$$$JAVA$$$$$$$$$$JAVA$$$$$$$$$$JAVA$$$$$$$$$$JAVA$$$$$$$$$$JAVA$$$$$$$$$$JAVA$$$$$$$$$$JAVA", "44444444444444444444444444444444444444444444444444444444444444444444444444       util");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                    " + "'", str3, "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                    ");
    }

    @Test
    public void test41166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest82.test41166");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.split("AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA", "arraylist", 669);
        java.lang.String[] strArray5 = org.apache.commons.lang3.StringUtils.stripAll(strArray3, "##########################java.lang");
        java.lang.String[] strArray6 = org.apache.commons.lang3.StringUtils.stripAll(strArray3);
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.getCommonPrefix(strArray6);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA" + "'", str7, "AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA");
    }

    @Test
    public void test41167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest82.test41167");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.abbreviateMiddle("Avaj.gnalaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa       cHARACTERcHARACTERcHARACTERcHARACTERcHARACTERcHARACTERcHARACTERcHARACTERcHARACTERcHARACTERcHARACTERcHARACTERcHARACTERcHARACTERcHARACTERcHARACTERcHARACTERcHARACTERcHARACTERcHARACTERcHARACTERcHARACTERcHARACTERcHARACTERcHARACTERcHARACTERcHARACTERcHARACTERcHARACTERcHARACTERcHARACTERcHARACTERcHARACTERcHARACTERcHARACTERcHARACTERcHARACTERcHARACTERcHARACTERcHARACTERcHARACTERcHARACTERcHARACTERcHARACTERcHARACTERcHARACTERcHARACTERcHARACTERcHARACTERcHARACTERcHARACTERcHARACTERcHARACTERcHARACTERcHARACTERcHARACTERcHARACTERcHARACTERcHARACTERcHARACTERcHARACTERcHARACTERcHARA", "                                                                                                                                                                                                                                                                              LANGAJAVATSIlYARRaTSIlYARRaTSIlYARRa                                                                                                                                                                                                                                                                             ", (int) (byte) 0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Avaj.gnalaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa       cHARACTERcHARACTERcHARACTERcHARACTERcHARACTERcHARACTERcHARACTERcHARACTERcHARACTERcHARACTERcHARACTERcHARACTERcHARACTERcHARACTERcHARACTERcHARACTERcHARACTERcHARACTERcHARACTERcHARACTERcHARACTERcHARACTERcHARACTERcHARACTERcHARACTERcHARACTERcHARACTERcHARACTERcHARACTERcHARACTERcHARACTERcHARACTERcHARACTERcHARACTERcHARACTERcHARACTERcHARACTERcHARACTERcHARACTERcHARACTERcHARACTERcHARACTERcHARACTERcHARACTERcHARACTERcHARACTERcHARACTERcHARACTERcHARACTERcHARACTERcHARACTERcHARACTERcHARACTERcHARACTERcHARACTERcHARACTERcHARACTERcHARACTERcHARACTERcHARACTERcHARACTERcHARACTERcHARA" + "'", str3, "Avaj.gnalaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa       cHARACTERcHARACTERcHARACTERcHARACTERcHARACTERcHARACTERcHARACTERcHARACTERcHARACTERcHARACTERcHARACTERcHARACTERcHARACTERcHARACTERcHARACTERcHARACTERcHARACTERcHARACTERcHARACTERcHARACTERcHARACTERcHARACTERcHARACTERcHARACTERcHARACTERcHARACTERcHARACTERcHARACTERcHARACTERcHARACTERcHARACTERcHARACTERcHARACTERcHARACTERcHARACTERcHARACTERcHARACTERcHARACTERcHARACTERcHARACTERcHARACTERcHARACTERcHARACTERcHARACTERcHARACTERcHARACTERcHARACTERcHARACTERcHARACTERcHARACTERcHARACTERcHARACTERcHARACTERcHARACTERcHARACTERcHARACTERcHARACTERcHARACTERcHARACTERcHARACTERcHARACTERcHARACTERcHARA");
    }

    @Test
    public void test41168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest82.test41168");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("JAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANG", "...................................................................");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray2);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "JAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANG" + "'", str3, "JAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANG");
    }

    @Test
    public void test41169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest82.test41169");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOf("arr...aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa...aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa...aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa...aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa...aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 446 + "'", int2 == 446);
    }

    @Test
    public void test41170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest82.test41170");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringAfter("hi!ArrayListArrayListArrayListavaj.gnalArrayListArrayListArrayListavaj.gnalArrayListArrayListArrayLi", "irfCo$irfioSriiz");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test41171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest82.test41171");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.defaultString("JAVAL.AGNaaaaaaaaaaJAVAL.AGNaaaaaaaaaaJAVAL.AGNaaaaaaaaaaJAVAL.AGNaaaaaaaaaaJAVAL.AGNaaaaaaaaaaJAVAL.AGNaaaaaaaaaaJAVAL.AGNaaaaaaaaaaJAVAL.AGNaaaaaaaaaaJAVAL.AGNaaaaaaaaaaJAVAL.AGNaaaaaaaaaaJAVAL.AGNaaaaaaaaaaJAVAL.AGNaaaaaaaaaaJAVAL.AGNaaaaaaaaaaJAVAL.AGNaaaaaaaaaaJAVAL.AGNaaaaaaaaaaJAVAL.AGNaaaaaaaaaaJAVAL.AGNaaaaaaaaaaJAVAL.AGNaaaaaaaaaaJAVAL.AGNaaaaaaaaaaJAVAL.AGNaaaaaaaaaaJAVAL.AGNaaaaaaaaaaJAVAL.AGNaaaaaaaaaaJAVAL.AGNaaaaaaaaaaJAVAL.AGNaaaaaaaaaaJAVAL.AGNaaaaaaaaaaJAVAL.AGNaaaaaaaaaaJAVAL.AGNaaaaaaaaaaJAVAL.AGNaaaaaaaaaaJAVAL.AGNaaaaaaaaaaJAVAL.AGNaaaaaaaaaaJAVAL.AGNaaaaaaaaaaJAVAL.AGNaaaaaaaaaaJAVAL.AGNaaaaaaaaaaJAVAL.AGNaaaaaaaaaa");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "JAVAL.AGNaaaaaaaaaaJAVAL.AGNaaaaaaaaaaJAVAL.AGNaaaaaaaaaaJAVAL.AGNaaaaaaaaaaJAVAL.AGNaaaaaaaaaaJAVAL.AGNaaaaaaaaaaJAVAL.AGNaaaaaaaaaaJAVAL.AGNaaaaaaaaaaJAVAL.AGNaaaaaaaaaaJAVAL.AGNaaaaaaaaaaJAVAL.AGNaaaaaaaaaaJAVAL.AGNaaaaaaaaaaJAVAL.AGNaaaaaaaaaaJAVAL.AGNaaaaaaaaaaJAVAL.AGNaaaaaaaaaaJAVAL.AGNaaaaaaaaaaJAVAL.AGNaaaaaaaaaaJAVAL.AGNaaaaaaaaaaJAVAL.AGNaaaaaaaaaaJAVAL.AGNaaaaaaaaaaJAVAL.AGNaaaaaaaaaaJAVAL.AGNaaaaaaaaaaJAVAL.AGNaaaaaaaaaaJAVAL.AGNaaaaaaaaaaJAVAL.AGNaaaaaaaaaaJAVAL.AGNaaaaaaaaaaJAVAL.AGNaaaaaaaaaaJAVAL.AGNaaaaaaaaaaJAVAL.AGNaaaaaaaaaaJAVAL.AGNaaaaaaaaaaJAVAL.AGNaaaaaaaaaaJAVAL.AGNaaaaaaaaaaJAVAL.AGNaaaaaaaaaaJAVAL.AGNaaaaaaaaaa" + "'", str1, "JAVAL.AGNaaaaaaaaaaJAVAL.AGNaaaaaaaaaaJAVAL.AGNaaaaaaaaaaJAVAL.AGNaaaaaaaaaaJAVAL.AGNaaaaaaaaaaJAVAL.AGNaaaaaaaaaaJAVAL.AGNaaaaaaaaaaJAVAL.AGNaaaaaaaaaaJAVAL.AGNaaaaaaaaaaJAVAL.AGNaaaaaaaaaaJAVAL.AGNaaaaaaaaaaJAVAL.AGNaaaaaaaaaaJAVAL.AGNaaaaaaaaaaJAVAL.AGNaaaaaaaaaaJAVAL.AGNaaaaaaaaaaJAVAL.AGNaaaaaaaaaaJAVAL.AGNaaaaaaaaaaJAVAL.AGNaaaaaaaaaaJAVAL.AGNaaaaaaaaaaJAVAL.AGNaaaaaaaaaaJAVAL.AGNaaaaaaaaaaJAVAL.AGNaaaaaaaaaaJAVAL.AGNaaaaaaaaaaJAVAL.AGNaaaaaaaaaaJAVAL.AGNaaaaaaaaaaJAVAL.AGNaaaaaaaaaaJAVAL.AGNaaaaaaaaaaJAVAL.AGNaaaaaaaaaaJAVAL.AGNaaaaaaaaaaJAVAL.AGNaaaaaaaaaaJAVAL.AGNaaaaaaaaaaJAVAL.AGNaaaaaaaaaaJAVAL.AGNaaaaaaaaaaJAVAL.AGNaaaaaaaaaa");
    }

    @Test
    public void test41172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest82.test41172");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("J4V4.L4NGJ4V4.L4NGJ4V4.L4NGJ4V4.L4NGJ4V4.L4NGJ4V4.L4                                                ", "#########A##RyLRsA##RyLRsA##RyLRsA##RyLRsA##        #########");
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test41173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest82.test41173");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripAccents((java.lang.CharSequence) "...                           HI!aRRAYlISTaRRAYlISTaRRAYlISTAVAJ.GNALaRRAYlISTaRRAYlISTaRRAYlIST");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "...                           HI!aRRAYlISTaRRAYlISTaRRAYlISTAVAJ.GNALaRRAYlISTaRRAYlISTaRRAYlIST" + "'", str1, "...                           HI!aRRAYlISTaRRAYlISTaRRAYlISTAVAJ.GNALaRRAYlISTaRRAYlISTaRRAYlIST");
    }

    @Test
    public void test41174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest82.test41174");
        java.lang.String str1 = org.apache.commons.lang3.ClassUtils.getShortClassName("                                                                                                                 sAitUJAirtSsAitUJAirtSsAitUJAi");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "                                                                                                                 sAitUJAirtSsAitUJAirtSsAitUJAi" + "'", str1, "                                                                                                                 sAitUJAirtSsAitUJAirtSsAitUJAi");
    }

    @Test
    public void test41175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest82.test41175");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphanumeric((java.lang.CharSequence) "st");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test41176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest82.test41176");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.reverseDelimited("$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$J#v#.l#ngj#v#.l#ngj#v#.l#ngj#v#.l#ngj#v#.l#ngj#v#.l#ngj#v#.l#ngj#v#.l#ngj#v#.l#ngj#v#.l#ngj#v#.l#ngj#v#.l#ngj#v#.l#ngj#v#.l#ngj#v#.l#ngj#v#.l#ngj#v#.l#ngj#v#.l#ngj#v#.l#ngj#v#.l#ngj#v#.l#ngj#v#.l#ngj#v#.l#ngj#v#.l#ngj#v#.l#ngj#v#.l#ngj#v#.l#ngj#v#.l#ngj#v#.l#ngj#v#.l#ngj#v#.l#ngj#v#.l#ngj#v#", ' ');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$J#v#.l#ngj#v#.l#ngj#v#.l#ngj#v#.l#ngj#v#.l#ngj#v#.l#ngj#v#.l#ngj#v#.l#ngj#v#.l#ngj#v#.l#ngj#v#.l#ngj#v#.l#ngj#v#.l#ngj#v#.l#ngj#v#.l#ngj#v#.l#ngj#v#.l#ngj#v#.l#ngj#v#.l#ngj#v#.l#ngj#v#.l#ngj#v#.l#ngj#v#.l#ngj#v#.l#ngj#v#.l#ngj#v#.l#ngj#v#.l#ngj#v#.l#ngj#v#.l#ngj#v#.l#ngj#v#.l#ngj#v#.l#ngj#v#" + "'", str2, "$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$J#v#.l#ngj#v#.l#ngj#v#.l#ngj#v#.l#ngj#v#.l#ngj#v#.l#ngj#v#.l#ngj#v#.l#ngj#v#.l#ngj#v#.l#ngj#v#.l#ngj#v#.l#ngj#v#.l#ngj#v#.l#ngj#v#.l#ngj#v#.l#ngj#v#.l#ngj#v#.l#ngj#v#.l#ngj#v#.l#ngj#v#.l#ngj#v#.l#ngj#v#.l#ngj#v#.l#ngj#v#.l#ngj#v#.l#ngj#v#.l#ngj#v#.l#ngj#v#.l#ngj#v#.l#ngj#v#.l#ngj#v#.l#ngj#v#");
    }

    @Test
    public void test41177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest82.test41177");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeEndIgnoreCase("444444444444444444444444444444444444444444444444444444444444444gn                                            gn      tvj.gnlrrylistrrylistrryli", ".. RRAYlISTRRAYlISTRRAYlISTAVAJgnlu");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "444444444444444444444444444444444444444444444444444444444444444gn                                            gn      tvj.gnlrrylistrrylistrryli" + "'", str2, "444444444444444444444444444444444444444444444444444444444444444gn                                            gn      tvj.gnlrrylistrrylistrryli");
    }

    @Test
    public void test41178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest82.test41178");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.leftPad("AVAJGNAL.AVAJGNAL.AVAJGNAL.AVAJGNAL.AVAJGNAL.AVAJGNAL.AVAJGNAL.AVAJGNAL.AVAJGNAL.AVAJ", 532, "4444444444444AAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.ag");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "4444444444444AAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.AVAJGNAL.AVAJGNAL.AVAJGNAL.AVAJGNAL.AVAJGNAL.AVAJGNAL.AVAJGNAL.AVAJGNAL.AVAJGNAL.AVAJ" + "'", str3, "4444444444444AAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.AVAJGNAL.AVAJGNAL.AVAJGNAL.AVAJGNAL.AVAJGNAL.AVAJGNAL.AVAJGNAL.AVAJGNAL.AVAJGNAL.AVAJ");
    }

    @Test
    public void test41179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest82.test41179");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trimToNull("uavajtutututututut...");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "uavajtutututututut..." + "'", str1, "uavajtutututututut...");
    }

    @Test
    public void test41180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest82.test41180");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("OI.AVAJECAFRETNI#ELBAENOLc.GNAL.AVAJECAFRETNIaRRAYlISTaRRAYlISTaRRAYlISTaRRAYlISaRRAYlISTaRRAYlISTaRRAYlISTaRRAYlISaRRAYlISTaRRAYlISTaRRAYlISTaRRAYlISaRRAYlISTaRRAYlISTaRRAYlISTaRRAYlISaRRAYlISTaRRAYlISTaRRAYlISTaRRAYlISaRRAYlISTaRRAYlISTaRRAYlISTaRRAYlISaRRAYlISTaRRAYlISTaRRAYlISTaRRAYlISaRRAYlISTaRRAYlISTaRRAYlISTaRRAYlISaRRAYlISTaRRAYlISTaRRAYlISTaRRAYlISaRRAYlISTaRRAYlISTaRRAYlISTaRRAYlISaRRAYlISTaRRAYlISTaRRAYlISTaRRAYlISaRRAYlISTaRRAYlISTaRRAYlISTaRRAYlISaRRAYlISTaRRAYlISTaRRAYlISTaRRAYlISaRRAYlISTaRRAYlISTaRRAYlISTaRRAYlISaRRAYlISTaRRAYlISTaRRAYlISTaRRAYlISaRRAYlISTaRRAYlISTaRRAYlISTaRRAYlISaRRAYlISTaRRAYlISTaRRAYlISTaRRAYlISaRRAYlISTaRRAYlISTaRRAYlIST", "aaaaaaaaaajaval.agnaaaaaaaaaajaval.agnaaaaaaaaaajaval.agnaaaaaaaaaajaval.agnaaaaaaaaaajaval.agnaaaaaaaaaajaval.agnaaaaaaaaaajaval.agnaaaaaaaaaajaval.agnaaaaaaaaaajaval.agnaaaaaaaaaajaval.agnaaaaaaaaaajaval.agnaaaaaaaaaajaval.agnaaaaaaaaaaja                                              aaaaaaajaval.agnaaaaaaaaaajaval.agnaaaaaaaaaajaval.agnaaaaaaaaaajaval.agnaaaaaaaaaajaval.agnaaaaaaaaaajaval.agnaaaaaaaaaajaval.agnaaaaaaaaaajaval.agnaaaaaaaaaajaval.agnaaaaaaaaaajaval.agnaaaaaaaaaajaval.agnaaaaaaaaaajaval.agnaaaaaaaaaarin");
        boolean boolean4 = org.apache.commons.lang3.StringUtils.endsWithAny("interfacejava.lang.CloneableString[]String[]String[]String[]String[]String[]String[]String[]String[]String[]String[]String[]String[]String[]String[]String[]String[]String[]String[]String[]String[]String[]String[]String[]String[]String[]String[]String[]String[]String[]String[]String[]String[]String[]String[]String[]String[]String[]String[]String[]String[]String[]String[]String[]String[]String[]String[]String[]String[]String[]String[]String[]String[]String[]String[]String[]String[]String[]String[]String[]String[]String[]String[]String[]String[]String[]String[]interfacejava.io.Serializable", strArray3);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test41181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest82.test41181");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.deleteWhitespace("Hi!ArrayListArrayListArrayListavaj.... AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA... AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA... AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA... AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA... AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA... AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA... AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA... AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA... AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA...");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Hi!ArrayListArrayListArrayListavaj....AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA...AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA...AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA...AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA...AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA...AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA...AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA...AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA...AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA..." + "'", str1, "Hi!ArrayListArrayListArrayListavaj....AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA...AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA...AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA...AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA...AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA...AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA...AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA...AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA...AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA...");
    }

    @Test
    public void test41182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest82.test41182");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNumericSpace((java.lang.CharSequence) "oBJECTYlISTaR.LANG.AVaRRCLASS JAVA.langGNAL.AVAJGNAL.langaGNAL.                                                                                                                                                                                                                                                                                                                                                                                                                                java");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test41183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest82.test41183");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("$$$NAL", '#');
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test41184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest82.test41184");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.defaultIfEmpty("######################################################################", "atsiLytcejbO.gnal.avajssalcrrAtsiLytcejbO.gnal.avajssalcrrAva.langGNAL..langjava.langAGNAL.AVAJAtsiLytcejbO.gnal.avajssalcrrAtsiLytcejbO.gnal.avajssalcrrAva.langGNAL..langjava.langAGNAL.AVAJAtsiLytcejbO.gnal.avajssalcrrAtsiLytcejbO.gnal.avajssalcrrAva.langGNAL..langjava.langAGNAL.AVAJAtsiLytcejbO.gnal.avajssalcrrAtsiLytcejStringAtsiLytcejbO.gnal.avajssalcrrAtsiLytcejbO.gnal.avajssalcrrAva.langGNAL..langjava.langAGNAL.AVAJAtsiLytcejbO.gnal.avajssalcrrAtsiLytcejbO.gnal.avajssalcrrAva.langGNAL..langjava.langAGNAL.AVAJAtsiLytcejbO.gnal.avajssalcrrAtsiLytcejbO.gnal.avajssalcrrAva.langGNAL..langjava.langAGNAL.AVAJAtsiLytcejbO.gnal");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "######################################################################" + "'", str2, "######################################################################");
    }

    @Test
    public void test41185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest82.test41185");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.rightPad("aaaaaaaaaaJAVAL.AGNaaaaaaaaaaJAVAL.AGNaaaaaaaaaaJAVAL.AGNaaaaaaaaaaJAVAL.AGNaaaaaaaaaaJ                                                                                                                                      ][GNIRTSLITU.AVAJ1AL.AGNaaaaaaaaaaJAVAL.AGNaaaaaaaaaaJAVAL.AGNaaaaaaaaaaJAVAL.AGNaaaaaaaaaaJAVAL.AGNaaaaaaaaaaJAVAL.AGNaaaaaaaaaaJAVAL.AGNaaaaaaaaaaJAVAL", 152, "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "aaaaaaaaaaJAVAL.AGNaaaaaaaaaaJAVAL.AGNaaaaaaaaaaJAVAL.AGNaaaaaaaaaaJAVAL.AGNaaaaaaaaaaJ                                                                                                                                      ][GNIRTSLITU.AVAJ1AL.AGNaaaaaaaaaaJAVAL.AGNaaaaaaaaaaJAVAL.AGNaaaaaaaaaaJAVAL.AGNaaaaaaaaaaJAVAL.AGNaaaaaaaaaaJAVAL.AGNaaaaaaaaaaJAVAL.AGNaaaaaaaaaaJAVAL" + "'", str3, "aaaaaaaaaaJAVAL.AGNaaaaaaaaaaJAVAL.AGNaaaaaaaaaaJAVAL.AGNaaaaaaaaaaJAVAL.AGNaaaaaaaaaaJ                                                                                                                                      ][GNIRTSLITU.AVAJ1AL.AGNaaaaaaaaaaJAVAL.AGNaaaaaaaaaaJAVAL.AGNaaaaaaaaaaJAVAL.AGNaaaaaaaaaaJAVAL.AGNaaaaaaaaaaJAVAL.AGNaaaaaaaaaaJAVAL.AGNaaaaaaaaaaJAVAL");
    }

    @Test
    public void test41186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest82.test41186");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNumeric((java.lang.CharSequence) "RFACEJAVALANGCLONEABLELANGGNALJAVALANGAVAJGNALJAVALANGAVAJGNALJAVALANGAVAJGNALJAVALANGAVAJGNALJAVALANGAVAJGNALJAVALANGAVAJ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test41187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest82.test41187");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceOnce("AtsiLytcejbO.gnal.avajssalcrrAva.langGNAL..langjava.langAGNAL", "44444444444444444444444444444444", "classjavalangClassJAVAULANGJAVAULANGJAVAULANGJAVAULANGJAVAULANGJAVAULANGJAVAULANGJAVAULANGJAVAULANGJAVAULANGJAVAULANGJAVAULANGJAVAULANGJAVAULANGJAVAULANGJAVAULANGJAVAULANGJAVAULANGJAVAULANGJAVAULANG$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "AtsiLytcejbO.gnal.avajssalcrrAva.langGNAL..langjava.langAGNAL" + "'", str3, "AtsiLytcejbO.gnal.avajssalcrrAva.langGNAL..langjava.langAGNAL");
    }

    @Test
    public void test41188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest82.test41188");
        java.lang.ClassLoader classLoader0 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass2 = org.apache.commons.lang3.ClassUtils.getClass(classLoader0, "                                                                                                                                                                                                                                                                                                                                                                                                                            JAVA.L$ArrayAAAAAAAAAA                                                                                                                                                                                                                                        ");
            org.junit.Assert.fail("Expected exception of type java.lang.ClassNotFoundException; message: JAVA/L$ArrayAAAAAAAAAA");
        } catch (java.lang.ClassNotFoundException e) {
            // Expected exception.
        }
    }

    @Test
    public void test41189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest82.test41189");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.endsWith("Jaavaaaaaaaaaavaa.alangavaa.alangjavaa.alangjavaa.alangjavaa.alangjavaa.alangjavaa.alangjavaa.alangjavaa.alangjavaa.alangjavaa.alangjavaa.alangjavaa.alangjavaa.alangjavaa.alangjavaa.alan", "aaaaaaaaaJAVAL.AGNaaaaaaaaaaJAVAL.AGNaaaaaaaaaaJAVAL.AGNaaaaaaaaaaJAVAL.AGNaaaaaaaaaaJAVAL.AGNaaaaaaaaaa");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test41190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest82.test41190");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.remove("AVA.LA", "rayListArrayListArrayListavaj.gnalArrayListArrayListArrayListavaj.gnalArrayListArrayLis...");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "AVA.LA" + "'", str2, "AVA.LA");
    }

    @Test
    public void test41191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest82.test41191");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                       CL SSjava lang                                                                                ulang", "                                                                                               javaulangr...");
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test41192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest82.test41192");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsAny("...$$AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA$...$$AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA$...$$AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA$...$$AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA$...$$AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA$...$$AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA$...$$AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA$...$$AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA$...$$AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA$...$$AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA", "interfacejava.lang.Cloneable.......java.......Objectava..........javainterfacejava.iointerfacejava.lang.Cloneable.......java.......Objectava..........javainterfacejava.iointerfacejava.lang.Cloneable.......jainterfacejava.lang.Cloneable.......java.......Objectava..........javainterfacejava.iointerfacejava.lang.Cloneable.......java.......Objectava..........javainterfacejava.iointerfacejava.lang.Cloneable.......ja");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test41193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest82.test41193");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.difference("gnAls444", "slitUgnirtSslitUgnirtSslitUgnirtSslitUgnirtSslitUgnirtSslitUgnirtSslitUgnirtSslitUgnirtSslitUgnirtSslitUgnirt                                ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "slitUgnirtSslitUgnirtSslitUgnirtSslitUgnirtSslitUgnirtSslitUgnirtSslitUgnirtSslitUgnirtSslitUgnirtSslitUgnirt                                " + "'", str2, "slitUgnirtSslitUgnirtSslitUgnirtSslitUgnirtSslitUgnirtSslitUgnirtSslitUgnirtSslitUgnirtSslitUgnirtSslitUgnirt                                ");
    }

    @Test
    public void test41194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest82.test41194");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphaSpace((java.lang.CharSequence) "################################... AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test41195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest82.test41195");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.right("blealiza.io.Seriavacejable#interfang.Clonea.lavacejainterf44444444444444444444444444444444444444444444444444aaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", 0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test41196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest82.test41196");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("hi!", "");
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.stripAll(strArray2, "$");
        java.lang.Class<?>[] wildcardClassArray5 = org.apache.commons.lang3.ClassUtils.toClass((java.lang.Object[]) strArray2);
        java.lang.Class<?>[] wildcardClassArray6 = org.apache.commons.lang3.ClassUtils.toClass((java.lang.Object[]) wildcardClassArray5);
        java.lang.Class<?>[] wildcardClassArray7 = org.apache.commons.lang3.ClassUtils.primitivesToWrappers(wildcardClassArray5);
        java.lang.Class<?>[] wildcardClassArray8 = org.apache.commons.lang3.ClassUtils.primitivesToWrappers(wildcardClassArray7);
        java.lang.Class<?>[] wildcardClassArray9 = org.apache.commons.lang3.ClassUtils.primitivesToWrappers(wildcardClassArray7);
        java.lang.Class<?>[] wildcardClassArray10 = org.apache.commons.lang3.ClassUtils.primitivesToWrappers(wildcardClassArray9);
        java.lang.String[] strArray13 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("hi!", "");
        java.lang.String[] strArray15 = org.apache.commons.lang3.StringUtils.stripAll(strArray13, "$");
        java.lang.Class<?>[] wildcardClassArray16 = org.apache.commons.lang3.ClassUtils.toClass((java.lang.Object[]) strArray13);
        java.lang.String[] strArray19 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("hi!", "");
        java.lang.String[] strArray21 = org.apache.commons.lang3.StringUtils.stripAll(strArray19, "$");
        java.lang.Class<?>[] wildcardClassArray22 = org.apache.commons.lang3.ClassUtils.toClass((java.lang.Object[]) strArray19);
        java.lang.Class<?> wildcardClass23 = null;
        java.lang.Class[] classArray25 = new java.lang.Class[1];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray26 = (java.lang.Class<?>[]) classArray25;
        wildcardClassArray26[0] = wildcardClass23;
        java.lang.Class<?>[] wildcardClassArray29 = org.apache.commons.lang3.ClassUtils.primitivesToWrappers(wildcardClassArray26);
        java.lang.String[] strArray31 = new java.lang.String[] { "                                   " };
        java.lang.String str32 = org.apache.commons.lang3.StringUtils.getCommonPrefix(strArray31);
        java.lang.Class<?>[] wildcardClassArray33 = org.apache.commons.lang3.ClassUtils.toClass((java.lang.Object[]) strArray31);
        java.lang.Class<?> wildcardClass34 = null;
        java.lang.Class[] classArray36 = new java.lang.Class[1];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray37 = (java.lang.Class<?>[]) classArray36;
        wildcardClassArray37[0] = wildcardClass34;
        java.lang.Class<?>[] wildcardClassArray40 = org.apache.commons.lang3.ClassUtils.primitivesToWrappers(wildcardClassArray37);
        boolean boolean41 = org.apache.commons.lang3.ClassUtils.isAssignable(wildcardClassArray33, wildcardClassArray37);
        boolean boolean43 = org.apache.commons.lang3.ClassUtils.isAssignable(wildcardClassArray26, wildcardClassArray37, true);
        boolean boolean45 = org.apache.commons.lang3.ClassUtils.isAssignable(wildcardClassArray22, wildcardClassArray37, false);
        java.lang.Class<?>[] wildcardClassArray46 = org.apache.commons.lang3.ClassUtils.primitivesToWrappers(wildcardClassArray22);
        boolean boolean47 = org.apache.commons.lang3.ClassUtils.isAssignable(wildcardClassArray16, wildcardClassArray46);
        java.lang.Class<?>[] wildcardClassArray48 = org.apache.commons.lang3.ClassUtils.wrappersToPrimitives(wildcardClassArray46);
        java.lang.String str52 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) wildcardClassArray46, ' ', (int) (short) 0, 0);
        java.lang.Class<?>[] wildcardClassArray53 = org.apache.commons.lang3.ClassUtils.toClass((java.lang.Object[]) wildcardClassArray46);
        java.lang.String str55 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) wildcardClassArray46, "string.nal.avaj ecafretni");
        java.lang.Class<?>[] wildcardClassArray56 = org.apache.commons.lang3.ClassUtils.primitivesToWrappers(wildcardClassArray46);
        boolean boolean57 = org.apache.commons.lang3.ClassUtils.isAssignable(wildcardClassArray10, wildcardClassArray56);
        java.lang.String str58 = org.apache.commons.lang3.StringUtils.concat((java.lang.Object[]) wildcardClassArray10);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertNotNull(wildcardClassArray5);
        org.junit.Assert.assertNotNull(wildcardClassArray6);
        org.junit.Assert.assertNotNull(wildcardClassArray7);
        org.junit.Assert.assertNotNull(wildcardClassArray8);
        org.junit.Assert.assertNotNull(wildcardClassArray9);
        org.junit.Assert.assertNotNull(wildcardClassArray10);
        org.junit.Assert.assertNotNull(strArray13);
        org.junit.Assert.assertNotNull(strArray15);
        org.junit.Assert.assertNotNull(wildcardClassArray16);
        org.junit.Assert.assertNotNull(strArray19);
        org.junit.Assert.assertNotNull(strArray21);
        org.junit.Assert.assertNotNull(wildcardClassArray22);
        org.junit.Assert.assertNotNull(classArray25);
        org.junit.Assert.assertNotNull(wildcardClassArray26);
        org.junit.Assert.assertNotNull(wildcardClassArray29);
        org.junit.Assert.assertNotNull(strArray31);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "                                   " + "'", str32, "                                   ");
        org.junit.Assert.assertNotNull(wildcardClassArray33);
        org.junit.Assert.assertNotNull(classArray36);
        org.junit.Assert.assertNotNull(wildcardClassArray37);
        org.junit.Assert.assertNotNull(wildcardClassArray40);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertNotNull(wildcardClassArray46);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + true + "'", boolean47 == true);
        org.junit.Assert.assertNotNull(wildcardClassArray48);
        org.junit.Assert.assertEquals("'" + str52 + "' != '" + "" + "'", str52, "");
        org.junit.Assert.assertNotNull(wildcardClassArray53);
        org.junit.Assert.assertEquals("'" + str55 + "' != '" + "class java.lang.String" + "'", str55, "class java.lang.String");
        org.junit.Assert.assertNotNull(wildcardClassArray56);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + true + "'", boolean57 == true);
        org.junit.Assert.assertEquals("'" + str58 + "' != '" + "class java.lang.String" + "'", str58, "class java.lang.String");
    }

    @Test
    public void test41197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest82.test41197");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.lowerCase("AAAAAAAAAAngalavajAAAAAAAAAAngalavajAAAAAAAAAAngalavajAAAAAAAAAAngalavajAAAAAAAAAAngalavajAAAAAAAAAAngalavajAAAAAAAAAAngalavajAAAAAAAAAAngalavajAAAAAAAAAAngalavajAAAAAAAAAAngalavajAAAAAAAAAAngalavajAAAAAAAAAAngalavajAAAAAAAAAAngalavajAAAAAAAAAAngalavajAAAAAAAAAAngalavajAAAAAAAAAAngalavajAAAAAAAAAAngalavajAAAAAAAAAAngalavajAAAAAAAAAAngalavajAAAAAAAAAAngalavajAAAAAAAAAAngalavajAAAAAAAAAAngalavajAAAAAAAAAAngalavajAAAAAAAAAAngalavajAAAAAAAAAAngalavajAAAAAAAAAAngalavajAAAAAAAAAAngalavajAAAAAAAAAAngalavajAAAAAAAAAAngalavajAAAAAAAAAAngalavajAAAAAAAAAAngalavajAAAAAAAAAAngalavajAAAAAAAAAAngalavajAAAAAAAAAAngalavajAAAAAAAAAAngalavajAAAAAAAAAA                                                                                                                                                                                                                                                                        ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "aaaaaaaaaangalavajaaaaaaaaaangalavajaaaaaaaaaangalavajaaaaaaaaaangalavajaaaaaaaaaangalavajaaaaaaaaaangalavajaaaaaaaaaangalavajaaaaaaaaaangalavajaaaaaaaaaangalavajaaaaaaaaaangalavajaaaaaaaaaangalavajaaaaaaaaaangalavajaaaaaaaaaangalavajaaaaaaaaaangalavajaaaaaaaaaangalavajaaaaaaaaaangalavajaaaaaaaaaangalavajaaaaaaaaaangalavajaaaaaaaaaangalavajaaaaaaaaaangalavajaaaaaaaaaangalavajaaaaaaaaaangalavajaaaaaaaaaangalavajaaaaaaaaaangalavajaaaaaaaaaangalavajaaaaaaaaaangalavajaaaaaaaaaangalavajaaaaaaaaaangalavajaaaaaaaaaangalavajaaaaaaaaaangalavajaaaaaaaaaangalavajaaaaaaaaaangalavajaaaaaaaaaangalavajaaaaaaaaaangalavajaaaaaaaaaangalavajaaaaaaaaaa                                                                                                                                                                                                                                                                        " + "'", str1, "aaaaaaaaaangalavajaaaaaaaaaangalavajaaaaaaaaaangalavajaaaaaaaaaangalavajaaaaaaaaaangalavajaaaaaaaaaangalavajaaaaaaaaaangalavajaaaaaaaaaangalavajaaaaaaaaaangalavajaaaaaaaaaangalavajaaaaaaaaaangalavajaaaaaaaaaangalavajaaaaaaaaaangalavajaaaaaaaaaangalavajaaaaaaaaaangalavajaaaaaaaaaangalavajaaaaaaaaaangalavajaaaaaaaaaangalavajaaaaaaaaaangalavajaaaaaaaaaangalavajaaaaaaaaaangalavajaaaaaaaaaangalavajaaaaaaaaaangalavajaaaaaaaaaangalavajaaaaaaaaaangalavajaaaaaaaaaangalavajaaaaaaaaaangalavajaaaaaaaaaangalavajaaaaaaaaaangalavajaaaaaaaaaangalavajaaaaaaaaaangalavajaaaaaaaaaangalavajaaaaaaaaaangalavajaaaaaaaaaangalavajaaaaaaaaaangalavajaaaaaaaaaa                                                                                                                                                                                                                                                                        ");
    }

    @Test
    public void test41198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest82.test41198");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.chop("Seria     A..AYL A.44444444444444444444444444     ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Seria     A..AYL A.44444444444444444444444444    " + "'", str1, "Seria     A..AYL A.44444444444444444444444444    ");
    }

    @Test
    public void test41199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest82.test41199");
        int int1 = org.apache.commons.lang3.StringUtils.length((java.lang.CharSequence) "                                                                                                                                                                                                                                                                            utiljava.util444444444444444444444444444444444444444444444444444444444444444444444444444444444ELBAZILAIREs.OI.AVAJ ECAFRETNIGNIRTsELBAENOLc.GNAL.AVAJ ECAFRETNI44444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 723 + "'", int1 == 723);
    }

    @Test
    public void test41200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest82.test41200");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.defaultIfBlank("AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAArLAAAuAAAA", "JAVAULANGJAVAULANGJAVAULANGJAVAULANGJAVAULANGJAVAULANGJAVAULANGJAVAULANGJAVAULANGJAVAULANGJAVAULANGJAVAULANGJAVAULANGJAVAULANGJAVAULANGJAVAULANG");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAArLAAAuAAAA" + "'", str2, "AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAArLAAAuAAAA");
    }

    @Test
    public void test41201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest82.test41201");
        java.lang.String[] strArray5 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("javal#.#agn", "", 6);
        java.lang.String[] strArray9 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator(". ", "                                  ", 90);
        java.lang.String str10 = org.apache.commons.lang3.StringUtils.replaceEach("arr... aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa... aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa... aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa... aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa... aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa... aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa... aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa... aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa... aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa... aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaylist", strArray5, strArray9);
        java.lang.String str11 = org.apache.commons.lang3.StringUtils.getCommonPrefix(strArray9);
        boolean boolean12 = org.apache.commons.lang3.StringUtils.startsWithAny("stringstringstringstringstringstringstringstringstringstring", strArray9);
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertNotNull(strArray9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "arr... aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa... aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa... aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa... aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa... aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa... aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa... aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa... aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa... aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa... aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaylist" + "'", str10, "arr... aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa... aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa... aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa... aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa... aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa... aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa... aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa... aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa... aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa... aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaylist");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + ". " + "'", str11, ". ");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test41202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest82.test41202");
        java.lang.Object[] objArray0 = null;
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.join(objArray0, "ARRAYLISTARRAYLISTARRAYLISTAVAJ", 16, 822);
        org.junit.Assert.assertNull(str4);
    }

    @Test
    public void test41203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest82.test41203");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.abbreviate("", 384, 270);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test41204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest82.test41204");
        java.lang.String str1 = org.apache.commons.lang3.ClassUtils.getShortCanonicalName("############################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "############################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################" + "'", str1, "############################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################");
    }

    @Test
    public void test41205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest82.test41205");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "TSILYARRGNALUAVAJTSILYARRGNALUAVAJ", "classslitugnirtsslitugnirtsslitugnirtsslitugnirtsslitugnirtsslitugnirtinterfacegaga.lang.cloneableaaaaaaaaaagagal.agnaaaaaaaaaagagal.agnaaaaaaaaaagagal.agnaaaaaaaaaagagal.agnaaaaaaaaaagagal.agnaaaaaaaaaagagal.agnaaaaaaaaaagagal.agnaaaaaaaaaagagal.agnaaaaaaaaaagagal.agnaaaaaaaaaagagal.agnaaaaaaaaaagagal.agnaaaaaaaaaagagal.agnaaaaaaaaaagagal.agnaaaaaaaaaagagal.agnaaaaaaaaaagagal.agnaaaaaaaaaagagal.agnaaaaaaaaaagagal.agnaaaaaaaaaagagal.agnaaaaaaaaaagagal.agnaaaaaaaaaagagal.agnaaaaaaaaaagagal.agnaaaaaaaaaagagal.agnaaaaaaaaaagagal.agnaaaaaaaaaagagal.agnaaaaaaaaaagagal.agnaaaaaaaaaagagal.agnaaaaaaaaaagagal.agnaaaaaaaaaagagal.agnaaaaaaaaaagagal.agnaaaaaaaaaagagal.agnaaaaaaaaaagagal.agnaaaaaaaaaagagal.agnaaaaaaaaaagagal.agnaaaaaaaaaagagal.agnaaaaaaaaaagagal.agnaaaaaaaaaaringinterfacegaga.io");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test41206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest82.test41206");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("gnirtSlitu.avaj1-gnirtSlitu.avaj1-", "ja", 108);
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray3, '#', 141, 46);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
    }

    @Test
    public void test41207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest82.test41207");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceChars(" ... ... ... ... ... ... ... ... ... ", "NG                                                                                                                                                                                                                                                                              ArrayListArrayListArrayListavajagnal                                                                                                                                                                                                                                                                              ", "                                                                                                                                                                                                                                                interfacejava.lang.Cloneable4iGNIRTinterfacejava.lang.Cloneable4i                                                                                                                                                                                                                                                ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + " ... ... ... ... ... ... ... ... ... " + "'", str3, " ... ... ... ... ... ... ... ... ... ");
    }

    @Test
    public void test41208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest82.test41208");
        char[] charArray11 = new char[] { '#', '4', '$', ' ' };
        int int12 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "$       ", charArray11);
        int int13 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA", charArray11);
        int int14 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "lutilutilutilutilutil####lutilutilutilutilutil", charArray11);
        boolean boolean15 = org.apache.commons.lang3.StringUtils.containsAny("$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$A rrr rrr rrr r                                                                                                    ", charArray11);
        boolean boolean16 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) ".LANG.LANG.LANG.LANG.LLITU", charArray11);
        boolean boolean17 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "javaulan", charArray11);
        boolean boolean18 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "tSslitUgnirtSslitUgnirtSslitUgnirtSslitUgnirtS", charArray11);
        org.junit.Assert.assertNotNull(charArray11);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray11), "#4$ ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray11), "#4$ ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray11), "[#, 4, $,  ]");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test41209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest82.test41209");
        java.lang.Class<?> wildcardClass0 = null;
        java.lang.Class[] classArray2 = new java.lang.Class[1];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray3 = (java.lang.Class<?>[]) classArray2;
        wildcardClassArray3[0] = wildcardClass0;
        java.lang.Class<?>[] wildcardClassArray6 = org.apache.commons.lang3.ClassUtils.primitivesToWrappers(wildcardClassArray3);
        java.lang.Class<?>[] wildcardClassArray7 = org.apache.commons.lang3.ClassUtils.primitivesToWrappers(wildcardClassArray6);
        java.lang.Class<?>[] wildcardClassArray8 = org.apache.commons.lang3.ClassUtils.wrappersToPrimitives(wildcardClassArray6);
        java.lang.String[] strArray11 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("hi!", "");
        java.lang.String[] strArray13 = org.apache.commons.lang3.StringUtils.stripAll(strArray11, "$");
        java.lang.Class<?>[] wildcardClassArray14 = org.apache.commons.lang3.ClassUtils.toClass((java.lang.Object[]) strArray11);
        java.lang.Class<?>[] wildcardClassArray15 = org.apache.commons.lang3.ClassUtils.toClass((java.lang.Object[]) wildcardClassArray14);
        java.lang.String str19 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) wildcardClassArray15, '#', (int) (byte) -1, (-1));
        java.lang.Class<?> wildcardClass20 = null;
        java.lang.Class[] classArray22 = new java.lang.Class[1];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray23 = (java.lang.Class<?>[]) classArray22;
        wildcardClassArray23[0] = wildcardClass20;
        java.lang.Class<?>[] wildcardClassArray26 = org.apache.commons.lang3.ClassUtils.primitivesToWrappers(wildcardClassArray23);
        java.lang.Class<?>[] wildcardClassArray27 = org.apache.commons.lang3.ClassUtils.primitivesToWrappers(wildcardClassArray23);
        boolean boolean28 = org.apache.commons.lang3.ClassUtils.isAssignable(wildcardClassArray15, wildcardClassArray27);
        java.lang.String str30 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) wildcardClassArray27, "                                  ");
        java.lang.Class<?>[] wildcardClassArray31 = org.apache.commons.lang3.ClassUtils.wrappersToPrimitives(wildcardClassArray27);
        java.lang.Class<?>[] wildcardClassArray32 = org.apache.commons.lang3.ClassUtils.wrappersToPrimitives(wildcardClassArray27);
        boolean boolean34 = org.apache.commons.lang3.ClassUtils.isAssignable(wildcardClassArray6, wildcardClassArray27, true);
        org.junit.Assert.assertNotNull(classArray2);
        org.junit.Assert.assertNotNull(wildcardClassArray3);
        org.junit.Assert.assertNotNull(wildcardClassArray6);
        org.junit.Assert.assertNotNull(wildcardClassArray7);
        org.junit.Assert.assertNotNull(wildcardClassArray8);
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertNotNull(strArray13);
        org.junit.Assert.assertNotNull(wildcardClassArray14);
        org.junit.Assert.assertNotNull(wildcardClassArray15);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertNotNull(classArray22);
        org.junit.Assert.assertNotNull(wildcardClassArray23);
        org.junit.Assert.assertNotNull(wildcardClassArray26);
        org.junit.Assert.assertNotNull(wildcardClassArray27);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "" + "'", str30, "");
        org.junit.Assert.assertNotNull(wildcardClassArray31);
        org.junit.Assert.assertNotNull(wildcardClassArray32);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
    }

    @Test
    public void test41210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest82.test41210");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.defaultString("                                       sl..Ug..r.S                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                       ", "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                     interface java.lang.CloneableAvaj.gnalinterface java.io.Serializable");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                       sl..Ug..r.S                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                       " + "'", str2, "                                       sl..Ug..r.S                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                       ");
    }

    @Test
    public void test41211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest82.test41211");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.center("integer", 472);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                                                                                                                                                                                                                        integer                                                                                                                                                                                                                                         " + "'", str2, "                                                                                                                                                                                                                                        integer                                                                                                                                                                                                                                         ");
    }

    @Test
    public void test41212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest82.test41212");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens(".........................................................................................................................................................................................................................................................................................................................................................LANG.LANG.LANG.LANG", "GNALgn", 939);
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void test41213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest82.test41213");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.center("                     ", 44, "aAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "aAAAAAAAAAA                     aAAAAAAAAAAA" + "'", str3, "aAAAAAAAAAA                     aAAAAAAAAAAA");
    }

    @Test
    public void test41214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest82.test41214");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeStartIgnoreCase("etyBetyBetyBetyBetyBetyBAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA...etyBetyBetyBetyBetyBetyBe                                                                             ", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "etyBetyBetyBetyBetyBetyBAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA...etyBetyBetyBetyBetyBetyBe                                                                             " + "'", str2, "etyBetyBetyBetyBetyBetyBAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA...etyBetyBetyBetyBetyBetyBe                                                                             ");
    }

    @Test
    public void test41215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest82.test41215");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("                                                                                                                                                                             javaaaaaaaaaava.langava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.lang$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$                                                                                                                                                                                                                                                                                                ");
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test41216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest82.test41216");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.substringBetween("elbazilaireS.oi.avaj ecafretniavaj..........avatcejbO.......avaj.......elbaenolC.gnal.avaj ecafretni", "JAVA.LANG                   AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA", "44444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444.alya..a                                  $$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$                                  $$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$                                  $$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$              ");
        org.junit.Assert.assertNull(str3);
    }

    @Test
    public void test41217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest82.test41217");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.chop("4444444444444444444444444444444444444JAVAULANG4444444444444444444444444444444444444");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "4444444444444444444444444444444444444JAVAULANG444444444444444444444444444444444444" + "'", str1, "4444444444444444444444444444444444444JAVAULANG444444444444444444444444444444444444");
    }

    @Test
    public void test41218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest82.test41218");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.remove("444444444444444444444rA4444444444444444444444...                                              ", "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "444444444444444444444rA4444444444444444444444...                                              " + "'", str2, "444444444444444444444rA4444444444444444444444...                                              ");
    }

    @Test
    public void test41219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest82.test41219");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("ang.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.1aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaajava.1aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa.1aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa.1aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa.1aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa.1aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa.1aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa.1aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa.1aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa.hi!arraylistarraylistarraylistavaj");
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test41220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest82.test41220");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.substringBetween("", "GNAL$.$AVAJ", "jvstringnlrrylistrrylistrrylistv");
        org.junit.Assert.assertNull(str3);
    }

    @Test
    public void test41221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest82.test41221");
        java.lang.CharSequence charSequence2 = org.apache.commons.lang3.StringUtils.defaultIfBlank((java.lang.CharSequence) "                                                                   JLANGAVLANGALLANGANG      ", (java.lang.CharSequence) "Java.litu.avajlitu.avajjava.litu.avajlitu.avajjava.litu.avajlitu.avaayL A    Java.litu.avajlitu.avajjava.litu.avajlitu.avajjava.litu.avajlitu.ava");
        org.junit.Assert.assertEquals("'" + charSequence2 + "' != '" + "                                                                   JLANGAVLANGALLANGANG      " + "'", charSequence2, "                                                                   JLANGAVLANGALLANGANG      ");
    }

    @Test
    public void test41222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest82.test41222");
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("StringUtils", "AVAJ.GNAL", 2);
        java.lang.String[] strArray6 = org.apache.commons.lang3.StringUtils.stripAll(strArray4, "");
        java.lang.String[] strArray13 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("...", "                                   ", (int) 'a');
        java.lang.String[] strArray14 = org.apache.commons.lang3.StringUtils.stripAll(strArray13);
        int int15 = org.apache.commons.lang3.StringUtils.lastIndexOfAny("                                                                                                    ", strArray13);
        java.lang.String[] strArray19 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("-1java.utilString[]    ", "avaj", 89);
        java.lang.String str20 = org.apache.commons.lang3.StringUtils.replaceEach("litulitulitulitulitul####litulitulitulitulitul", strArray13, strArray19);
        int int21 = org.apache.commons.lang3.StringUtils.lastIndexOfAny("RChahacta", strArray19);
        java.lang.String str22 = org.apache.commons.lang3.StringUtils.replaceEach("Aaa    aaa", strArray4, strArray19);
        java.lang.String str26 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray4, 'a', 524, 489);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertNotNull(strArray13);
        org.junit.Assert.assertNotNull(strArray14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertNotNull(strArray19);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "litulitulitulitulitul####litulitulitulitulitul" + "'", str20, "litulitulitulitulitul####litulitulitulitulitul");
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "Aaa    aaa" + "'", str22, "Aaa    aaa");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
    }

    @Test
    public void test41223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest82.test41223");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsAny("######################################################...", ".ArrayListArrayListArrayListArrayLis");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test41224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest82.test41224");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOf(".aArrayaListaArrayaListaArrayaListaArrayaLis.aArrayaListaArrayaListaArrayaListaArrayaLis.aArrayaListaArrayaListaArrayaListaArrayaLis.aArrayaListaArrayaListaArrayaListaArrayaLis.aArrayaListaArrayaListaArrayaListaArrayaLis.aArrayaListaArrayaListaArrayaListaArrayaLis.aArrayaListaArrayaListaArrayaListaArrayaLis.aArrayaListaArrayaListaArrayaListaArrayaLis.aArrayaListaArrayaListaArrayaListaArrayaLis.aArrayaListaArrayaListaArrayaListaArrayaLis.aArrayaListaArrayaListaArrayaListaArrayaLis.aArrayaListaArrayaListaArrayaListaArrayaLis.aArrayaListaArrayaListaArrayaListaArrayaLis.aArrayaListaArrayaListaArrayaListaArrayaLis.aArrayaListaArrayaListaArrayaListaArrayaLis.aArrayaListaArrayaListaArrayaListaArrayaLis.aArrayaListaArrayaListaArrayaListaArrayaLis.aArrayaListaArrayaListaArrayaListaArrayaLis.aArrayaListaArrayaListaArr...java..........java..", "...stgnal.aL.ArrayList...aL.ArrayListgnal.aL.", 275);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test41225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest82.test41225");
        char[] charArray12 = new char[] { ' ', ' ', '#', 'a', '4', 'a' };
        int int13 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "", charArray12);
        boolean boolean14 = org.apache.commons.lang3.StringUtils.containsAny("$", charArray12);
        int int15 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "", charArray12);
        boolean boolean16 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "...       AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA", charArray12);
        int int17 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "Llitu", charArray12);
        boolean boolean18 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "                                   TU                                   $ARRAYLIS", charArray12);
        org.junit.Assert.assertNotNull(charArray12);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray12), "  #a4a");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray12), "  #a4a");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray12), "[ ,  , #, a, 4, a]");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test41226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest82.test41226");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.containsWhitespace("loneable#interfacaaaaaaa$aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test41227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest82.test41227");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass1 = org.apache.commons.lang3.ClassUtils.getClass("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
            org.junit.Assert.fail("Expected exception of type java.lang.ClassNotFoundException; message: aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        } catch (java.lang.ClassNotFoundException e) {
            // Expected exception.
        }
    }

    @Test
    public void test41228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest82.test41228");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.rightPad("INTERFACE JAVA.LANG.CLONEABLEJV..........JV..........JV..........JV..........JV..........JV..........JV..........JV..........JV..........JV..........JV..........JV..........JV..........JV..........JV..........JV..........JV..........JV..........JV..........JV..........JV..........JV..........JV..........JV..........JV..........JV..........JV..........JV..........JV..........JV..........JV..........JV..........JV..........JV..........JVINTERFCE JV.IOINTERFACE JAVA.IO.SERIALIZABLE", 275, "arjavaarrarjavaarrarjavaarrarjavaarrarjavaarrarjavaarrarjavaarrarjavaarrarjavaarrarjavaarrarjavaarrarjavaarrarjavaarrarjavaarrarjavaarrarjavaarrarjavaarrarjavaarrarjavaarrarjavaarrarjavaarrarjavaarrarjavaarrarjavaarrarjavaarrarjavaarrarjavaarrarjavaarrarjavaarrarjavaarrarjavaarrarjavaarrarjavaarrarjavaarrarjavaarrarjavaarrarjavaarrarjavaarrarjavaarrarjavaarrarjavaarrarjavaarrarjavaarrarjavaarrarjavaarrarjavaarrarjavaarrarjavaarrarjavaarrarjavaarrarjavaarrarjavaarrarjalass java.lang.stringA..iyL ziirSoifri.oCfriCLASS JAVALANGCLASS                       JAVAULANG                       JAVAULANG                       JAVAULANG                       JAVAULANG                       JAVAULANG                       JAVAULANG                       JAVAULANG                       JAVAULANG                       JAVAULANG         ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "INTERFACE JAVA.LANG.CLONEABLEJV..........JV..........JV..........JV..........JV..........JV..........JV..........JV..........JV..........JV..........JV..........JV..........JV..........JV..........JV..........JV..........JV..........JV..........JV..........JV..........JV..........JV..........JV..........JV..........JV..........JV..........JV..........JV..........JV..........JV..........JV..........JV..........JV..........JV..........JVINTERFCE JV.IOINTERFACE JAVA.IO.SERIALIZABLE" + "'", str3, "INTERFACE JAVA.LANG.CLONEABLEJV..........JV..........JV..........JV..........JV..........JV..........JV..........JV..........JV..........JV..........JV..........JV..........JV..........JV..........JV..........JV..........JV..........JV..........JV..........JV..........JV..........JV..........JV..........JV..........JV..........JV..........JV..........JV..........JV..........JV..........JV..........JV..........JV..........JV..........JVINTERFCE JV.IOINTERFACE JAVA.IO.SERIALIZABLE");
    }

    @Test
    public void test41229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest82.test41229");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.startsWithIgnoreCase("GNAL.AL.ARRAYLISTGNAL.AL.ARRAYLISTGNAL.AGNAL.AVAJGNAL.AVAJGNAL.AVAJGNAL.AVAJGNAL.AVAJGNAL.AVAJGNAL.AVAJGNAL.AVAJGNAL.AVAJGNAL.AVAJGNAL.AVAJGNAL.AVAJGNAL.AVAJGNAL.AVAJGNAL.AVAJGNAL.AVAJGNAL.AVAJGNAL.AVAJGNAL.AVAJGNAL.AVAJGNAL.AVAJGNAL.AVAJGNAL.AVAJGNAL.AVAJGNAL.AVAJGNAL.AVAJGNAL.AVAJGNAL.AVAGNAL.AVAAAAAAAAAAVAJARRAYLISTGNAL.AL.ARRAYLISTGNAL.AL.ARRAYLIST", "      interface java.lang.Cloneable.interface java.io.Serializable      ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test41230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest82.test41230");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNotEmpty((java.lang.CharSequence) "class java.lang.Stringclass java.lang.Stringclass java.lang.Stringclass java.lang.Stringclass java.lang.Stringclass java.lang.Stringclass java.lang.Stringclass java.lang.Stringclass java.lang.Stringclass java.lang.Stringclass java.lang.Stringclass java.lang.Stringclass java.lang.Stringclass java.lang.Stringclass java.lang.Stringclass java.lang.Stringclass java.lang.Stringclass java.lang.Stringclass java.lang.Stringclass java.lang.Stringclass java.lang.Stringclass java.lang.Stringclass java.lang.String");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test41231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest82.test41231");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfDifference((java.lang.CharSequence) "....................................................", (java.lang.CharSequence) "                                           ");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test41232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest82.test41232");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.right("       util", 516);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "       util" + "'", str2, "       util");
    }

    @Test
    public void test41233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest82.test41233");
        char[] charArray1 = null;
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "                                                                                                                                                                                                                                                                                                                                                                               ", charArray1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test41234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest82.test41234");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.split("A..ayLA", "interface java.lang.Cloneablejv..........jv..........jv..........jv..........jv..........jv..........jv..........jv..........jv..........jv..........jv..........jv..........jv..........jv..........jv..........jv..........jv..........jv..........jv..........jv..........jv..........jv..........jv..........jv..........jv..........jv..........jv..........jv..........jv..........jv..........jv..........jv..........jv..........jv..........jvinterfce jv.iointerface java.io.Serializable", 444);
        java.lang.String[] strArray5 = org.apache.commons.lang3.StringUtils.stripAll(strArray3, "                             ...aaaaaaaaaaaaaaaaaaaaaaaaaa...                              ");
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertNotNull(strArray5);
    }

    @Test
    public void test41235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest82.test41235");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.leftPad("$$$$$$$$$$$$$$$$$$$$$$$$$$$$$...                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                               ", 58);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "$$$$$$$$$$$$$$$$$$$$$$$$$$$$$...                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                               " + "'", str2, "$$$$$$$$$$$$$$$$$$$$$$$$$$$$$...                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                               ");
    }

    @Test
    public void test41236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest82.test41236");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAllLowerCase((java.lang.CharSequence) "             aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa...");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test41237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest82.test41237");
        char[] charArray16 = new char[] { ' ', ' ', '#', 'a', '4', 'a' };
        int int17 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "", charArray16);
        int int18 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "JAVAULANG", charArray16);
        int int19 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "JAVA.UTIL", charArray16);
        boolean boolean20 = org.apache.commons.lang3.StringUtils.containsAny("GNAL.AVAJLANG.JAVAGNAL.AVAJLANG.JAVAGNAL.AVAJLANG.JAVAGNAL.AVAJLANG.JAVAGNAL.AVAJLANG.JAVAGNAL.AVAJLANG.JAVAGNAL.AVAJLANG.JAVAGNAL.AVAJLANG.JAVAGNAL.AVAJ", charArray16);
        int int21 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "                                                                                          gnal.avaj ", charArray16);
        boolean boolean22 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "arra", charArray16);
        int int23 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "tsilyarrgnaluavajtsilyarrgnaluavaj", charArray16);
        boolean boolean24 = org.apache.commons.lang3.StringUtils.containsAny("java..........java..........java..........java..........java..........java..........ja...", charArray16);
        boolean boolean25 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "classJAVA.LANGaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaULANG", charArray16);
        boolean boolean26 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "ArryLis", charArray16);
        org.junit.Assert.assertNotNull(charArray16);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray16), "  #a4a");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray16), "  #a4a");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray16), "[ ,  , #, a, 4, a]");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
    }

    @Test
    public void test41238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest82.test41238");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.deleteWhitespace("   ####   ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "####" + "'", str1, "####");
    }

    @Test
    public void test41239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest82.test41239");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBeforeLast("...     javaulangrraylist                   ", "gn gnal.avajgn gnal.avajgn gnal.avajgn gnal.avajgn gnal.avajgn gnal.avajgn gnal.avajgn gnal.avajgn gnal.avajgn gnal.avajgn gnal.avajgn gnal.avajgn gnal.avajgn gnal.avajgn gnal.avajgn gnal.avaj");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "...     javaulangrraylist                   " + "'", str2, "...     javaulangrraylist                   ");
    }

    @Test
    public void test41240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest82.test41240");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.split("$       ", '4');
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test41241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest82.test41241");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.stripStart("", "java.lang.Cloneable4interface java.io.Serializa                                            java.lang.Cloneable4interface java.io.Serializa                                            java.lang.Cloneable4interface java.io.Serializa                                            java.lang.Cloneable4interface java.io.Serializa                                            java.lang.Cloneable4interface java.io.Serializa                                            java.lang.Cloneable4interface java.io.Serializa                                            java.lang.Cloneable4interface java.io.Serial               ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test41242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest82.test41242");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripToEmpty("$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$HO$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$RAYLIST$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$T");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$HO$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$RAYLIST$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$T" + "'", str1, "$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$HO$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$RAYLIST$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$T");
    }

    @Test
    public void test41243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest82.test41243");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.reverseDelimited("                         interfacejavaalangaCloneable#interfacejavaaiointerfacejavaalangaCloneable#interfacejavaaiointerfacejavaala", '#');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "interfacejavaaiointerfacejavaala#interfacejavaaiointerfacejavaalangaCloneable#                         interfacejavaalangaCloneable" + "'", str2, "interfacejavaaiointerfacejavaala#interfacejavaaiointerfacejavaalangaCloneable#                         interfacejavaalangaCloneable");
    }

    @Test
    public void test41244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest82.test41244");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOfIgnoreCase("aaaaaa...                          ", "hi!arraylistarraylistarraylis.1aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa.1aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa.1aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa.1aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa.1aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa.1aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa.1aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa.aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test41245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest82.test41245");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "t", "interfacejava.lang.Cloneable#interfacejava.iointerfacejava.lang.Cloneable#interfacejava.ioinTU                    ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test41246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest82.test41246");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.endsWithIgnoreCase(".o.e.gn.l.................................................................................................charactercharactercharactercharactercharactercharactercharactercharactercharactercharactercharactercharactercharactercharactercharactercharactercharactercharactercharactercharactercharactercharactercharactercharactercharactercharactercharactercharactercharactercharactercharactercharactercharactercharactercharactercharactercharactercharactercharactercharactercharactercharactercharactercharactercharactercharactercharactercharactercharactercharactercharactercharactercharactercharactercharactercharactercharactercharactercharactercharactercharactercharacterchara", "jAVAJAVAJAVAJAVAJAVAJAVAJAVAJAVAJAVAJAVAJAVAJAVAJAVAJAVAJAVAJAVAJAVAJAVAJAVAJAVAJAVAJAVAJAVAJAVAJAVAJAVAJAVAJAVAJAVAJAVAJAVAJAVAJAVAJAVA");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test41247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest82.test41247");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfDifference((java.lang.CharSequence) "                                                                                                                                                    ArryListArryListArryListvjGNAL.AVAJLANG.JAVAGNAL.AVAJLANG.JAVAGNAL.AVAJLANG.JAVAGNAL.AVAJLANG.JAVAGNAL.AVAJLANG.JAVAGNAL.AVAJLANG.JAVAGNAL.AVAJLANG.JAVAGNAL.AVAJLANG.JAVAGNAL.AVAJgnl                                                                                                                                                     ", (java.lang.CharSequence) "AyLsAyLsAyLsAyLsA4444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test41248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest82.test41248");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.split("g.g.g.g.g.g.g.g.g.g.g.g.g.g.g.g.g.g.g.g.g.g.g.g.g.g.g.g.g.g.g.g.g.g.g.g.g.g.g.", "...gnal.avaaaaaaaaaavaJ");
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.stripAll(strArray2, "arryList");
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertNotNull(strArray4);
    }

    @Test
    public void test41249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest82.test41249");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.split("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaastrinaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa. aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaastrinaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray1);
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaastrinaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa.aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaastrinaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa" + "'", str2, "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaastrinaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa.aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaastrinaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
    }

    @Test
    public void test41250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest82.test41250");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphanumericSpace((java.lang.CharSequence) "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaava.langjava.langjava.lang... .... .... .... .");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test41251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest82.test41251");
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("...       ", "hi!", (int) (byte) 0);
        int int5 = org.apache.commons.lang3.StringUtils.indexOfDifference((java.lang.CharSequence[]) strArray4);
        java.lang.String[] strArray6 = org.apache.commons.lang3.StringUtils.stripAll(strArray4);
        java.lang.String str10 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray6, '$', 9, (int) (byte) -1);
        int int11 = org.apache.commons.lang3.StringUtils.indexOfAny("           ", strArray6);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
    }

    @Test
    public void test41252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest82.test41252");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("", "face java.lang.CloneableINTERFACE JAVA.LANG.CLONEABLELANG.GNALJAVA.LANGAVAJ.GNALJAVA.LANGAVAJ.GNALJAVA.LANGAVAJ.GNALJAVA.LANGAVAJ.GNALJAVA.LANGAVAJ.GNALJAVA.LANGAVAJ.GNALJAVA.LANGAVAJ.GNALJAVA.LANGAVAJ.JAVAINTERFACE JAVA.IO.SERIALIZABLEinterf                                                                                          gnal.............RJAVAARR");
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test41253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest82.test41253");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "...A", "Serializabl#...#     #java#44444444444444444#.#4444");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test41254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest82.test41254");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isBlank((java.lang.CharSequence) "a$.lang.Stringclass java.lang.Stringclass java.lang.Stringclas.lang.Stringclass java.lang.Stringc");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test41255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest82.test41255");
        java.lang.ClassLoader classLoader0 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass2 = org.apache.commons.lang3.ClassUtils.getClass(classLoader0, "][SSLc][SSLcRcHAHACTA][SSLc][SSL][SSLc][SSLcRcHAHACTA][SSLc][SSL][SSLc][SSLcRcHAHACTA][SSLc][SSL][SSLc][SSLcRcHAHACTA][SSLc][SSL][SSLc][SSLcRcHAHACTA][SSLc][SSL][SSLc][SSLcRcHAHACTA][SSLc][SSL][SSLc][SSLcRcHAHACTA][SSLc][SSL][SSLc][SSLcRcHAHACTA][SSLc][SSL][SSLc][SSLcRcHAHACTA][SSLc][SSL][SSLc][SSLcRcHAHACTA][SSLc][SSL][SSLc][SSLcRcHAHACTA][SSLc][SSL][SSLc][SSLcRcHAHACTA][SSLc][SSL][SSLc][SSLcRcHAHACTA][SSLc][SSL][SSLc][SSLcgnalAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAGN                     ");
            org.junit.Assert.fail("Expected exception of type java.lang.ClassNotFoundException; message: ][SSLc][SSLcRcHAHACTA][SSLc][SSL][SSLc][SSLcRcHAHACTA][SSLc][SSL][SSLc][SSLcRcHAHACTA][SSLc][SSL][SSLc][SSLcRcHAHACTA][SSLc][SSL][SSLc][SSLcRcHAHACTA][SSLc][SSL][SSLc][SSLcRcHAHACTA][SSLc][SSL][SSLc][SSLcRcHAHACTA][SSLc][SSL][SSLc][SSLcRcHAHACTA][SSLc][SSL][SSLc][SSLcRcHAHACTA][SSLc][SSL][SSLc][SSLcRcHAHACTA][SSLc][SSL][SSLc][SSLcRcHAHACTA][SSLc][SSL][SSLc][SSLcRcHAHACTA][SSLc][SSL][SSLc][SSLcRcHAHACTA][SSLc][SSL][SSLc][SSLcgnalAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAGN");
        } catch (java.lang.ClassNotFoundException e) {
            // Expected exception.
        }
    }

    @Test
    public void test41256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest82.test41256");
        int int1 = org.apache.commons.lang3.StringUtils.length((java.lang.CharSequence) "$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$                                  ");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 68 + "'", int1 == 68);
    }

    @Test
    public void test41257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest82.test41257");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("                                                                     $$$$$$$$$$$$..                                                                     ", "a rrr rrr rrr rrr rrr rrr rrr rrr rrr rrr", 0);
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void test41258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest82.test41258");
        java.lang.String[] strArray1 = new java.lang.String[] { "                                   " };
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.getCommonPrefix(strArray1);
        java.lang.Class<?>[] wildcardClassArray3 = org.apache.commons.lang3.ClassUtils.toClass((java.lang.Object[]) strArray1);
        java.lang.String[] strArray6 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("hi!", "");
        java.lang.String[] strArray8 = org.apache.commons.lang3.StringUtils.stripAll(strArray6, "$");
        java.lang.Class<?>[] wildcardClassArray9 = org.apache.commons.lang3.ClassUtils.toClass((java.lang.Object[]) strArray6);
        java.lang.Class<?> wildcardClass10 = null;
        java.lang.Class[] classArray12 = new java.lang.Class[1];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray13 = (java.lang.Class<?>[]) classArray12;
        wildcardClassArray13[0] = wildcardClass10;
        java.lang.Class<?>[] wildcardClassArray16 = org.apache.commons.lang3.ClassUtils.primitivesToWrappers(wildcardClassArray13);
        java.lang.String[] strArray18 = new java.lang.String[] { "                                   " };
        java.lang.String str19 = org.apache.commons.lang3.StringUtils.getCommonPrefix(strArray18);
        java.lang.Class<?>[] wildcardClassArray20 = org.apache.commons.lang3.ClassUtils.toClass((java.lang.Object[]) strArray18);
        java.lang.Class<?> wildcardClass21 = null;
        java.lang.Class[] classArray23 = new java.lang.Class[1];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray24 = (java.lang.Class<?>[]) classArray23;
        wildcardClassArray24[0] = wildcardClass21;
        java.lang.Class<?>[] wildcardClassArray27 = org.apache.commons.lang3.ClassUtils.primitivesToWrappers(wildcardClassArray24);
        boolean boolean28 = org.apache.commons.lang3.ClassUtils.isAssignable(wildcardClassArray20, wildcardClassArray24);
        boolean boolean30 = org.apache.commons.lang3.ClassUtils.isAssignable(wildcardClassArray13, wildcardClassArray24, true);
        boolean boolean32 = org.apache.commons.lang3.ClassUtils.isAssignable(wildcardClassArray9, wildcardClassArray24, false);
        java.lang.Class<?>[] wildcardClassArray33 = org.apache.commons.lang3.ClassUtils.primitivesToWrappers(wildcardClassArray9);
        java.lang.Class<?>[] wildcardClassArray34 = org.apache.commons.lang3.ClassUtils.primitivesToWrappers(wildcardClassArray33);
        java.lang.Class<?>[] wildcardClassArray35 = org.apache.commons.lang3.ClassUtils.primitivesToWrappers(wildcardClassArray34);
        boolean boolean37 = org.apache.commons.lang3.ClassUtils.isAssignable(wildcardClassArray3, wildcardClassArray34, true);
        java.lang.Class<?>[] wildcardClassArray38 = org.apache.commons.lang3.ClassUtils.primitivesToWrappers(wildcardClassArray34);
        java.lang.Class<?>[] wildcardClassArray39 = org.apache.commons.lang3.ClassUtils.wrappersToPrimitives(wildcardClassArray38);
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                   " + "'", str2, "                                   ");
        org.junit.Assert.assertNotNull(wildcardClassArray3);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertNotNull(wildcardClassArray9);
        org.junit.Assert.assertNotNull(classArray12);
        org.junit.Assert.assertNotNull(wildcardClassArray13);
        org.junit.Assert.assertNotNull(wildcardClassArray16);
        org.junit.Assert.assertNotNull(strArray18);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "                                   " + "'", str19, "                                   ");
        org.junit.Assert.assertNotNull(wildcardClassArray20);
        org.junit.Assert.assertNotNull(classArray23);
        org.junit.Assert.assertNotNull(wildcardClassArray24);
        org.junit.Assert.assertNotNull(wildcardClassArray27);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertNotNull(wildcardClassArray33);
        org.junit.Assert.assertNotNull(wildcardClassArray34);
        org.junit.Assert.assertNotNull(wildcardClassArray35);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
        org.junit.Assert.assertNotNull(wildcardClassArray38);
        org.junit.Assert.assertNotNull(wildcardClassArray39);
    }

    @Test
    public void test41259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest82.test41259");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.capitalize((java.lang.CharSequence) "JavajavaStrinJavajavaStrinJavajavaSt");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "JavajavaStrinJavajavaStrinJavajavaSt" + "'", str1, "JavajavaStrinJavajavaStrinJavajavaSt");
    }

    @Test
    public void test41260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest82.test41260");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringAfter("interface java.lang.Cloneable#interface java.io.Serializable                                                                                                                                                                                                                                                                                                                                                                                                                                                                        ", "                                    ######################                                                                                                            ... ... ... ... ... ... ... ... ... ... ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test41261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest82.test41261");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass1 = org.apache.commons.lang3.ClassUtils.getClass("4444444444444444444444444444444444444444444444444444444444444444444444444444444N4444444444444444444444444444444444444444444444444444444444444444444444444444444");
            org.junit.Assert.fail("Expected exception of type java.lang.ClassNotFoundException; message: 4444444444444444444444444444444444444444444444444444444444444444444444444444444N4444444444444444444444444444444444444444444444444444444444444444444444444444444");
        } catch (java.lang.ClassNotFoundException e) {
            // Expected exception.
        }
    }

    @Test
    public void test41262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest82.test41262");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.stripEnd(".o.e.gn.l.................................................................................................charactercharactercharactercharactercharactercharactercharactercharactercharactercharactercharactercharactercharactercharactercharactercharactercharactercharactercharactercharactercharactercharactercharactercharactercharactercharactercharactercharactercharactercharactercharactercharactercharactercharactercharactercharactercharactercharactercharactercharactercharactercharactercharactercharactercharactercharactercharactercharactercharactercharactercharactercharactercharactercharactercharactercharactercharactercharactercharactercharactercharactercharacterchara", " AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + ".o.e.gn.l.................................................................................................charactercharactercharactercharactercharactercharactercharactercharactercharactercharactercharactercharactercharactercharactercharactercharactercharactercharactercharactercharactercharactercharactercharactercharactercharactercharactercharactercharactercharactercharactercharactercharactercharactercharactercharactercharactercharactercharactercharactercharactercharactercharactercharactercharactercharactercharactercharactercharactercharactercharactercharactercharactercharactercharactercharactercharactercharactercharactercharactercharactercharactercharacterchara" + "'", str2, ".o.e.gn.l.................................................................................................charactercharactercharactercharactercharactercharactercharactercharactercharactercharactercharactercharactercharactercharactercharactercharactercharactercharactercharactercharactercharactercharactercharactercharactercharactercharactercharactercharactercharactercharactercharactercharactercharactercharactercharactercharactercharactercharactercharactercharactercharactercharactercharactercharactercharactercharactercharactercharactercharactercharactercharactercharactercharactercharactercharactercharactercharactercharactercharactercharactercharactercharacterchara");
    }

    @Test
    public void test41263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest82.test41263");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("AAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAA", "$       ", (int) '4');
        java.lang.Class<?> wildcardClass4 = strArray3.getClass();
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test41264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest82.test41264");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNumeric((java.lang.CharSequence) "a                                                                                                                                                                                                                                                                                                                                                                                                                                                              ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test41265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest82.test41265");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAllUpperCase((java.lang.CharSequence) ".......ja                                                                                                                                                                                                                                                                                                                  ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test41266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest82.test41266");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitByCharacterType("gnal.avajgnal..LANGgnal.avajgnal.");
        java.lang.String str5 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray1, "avajlitu", 943, 81);
        java.lang.String[] strArray6 = org.apache.commons.lang3.StringUtils.stripAll(strArray1);
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(strArray6);
    }

    @Test
    public void test41267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest82.test41267");
        int int2 = org.apache.commons.lang3.StringUtils.getLevenshteinDistance((java.lang.CharSequence) "aAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA", (java.lang.CharSequence) "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                         ...sAitUJAirtSsAitUJAirtSsAitUJAirtSsAitUJAirtSsAitUJAirtSsAitUJAirtSsAitUJAirtSsAitUJAirtSsAitUJAirtS");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 637 + "'", int2 == 637);
    }

    @Test
    public void test41268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest82.test41268");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.substringBetween("-1JAVA.UTILsTRING[]                                                      ", ".######################################################################", "                                                                                                                                                    arrylistarrylistarrylistvjgnal.avajlang.javagnal.avajlang.javagnal.avajlang.javagnal.avajlang.javagnal.avajlang.javagnal.avajlang.javagnal.avajlang.javagnal.avajlang.javagnal.avajgnl                                                                                                                                                     ");
        org.junit.Assert.assertNull(str3);
    }

    @Test
    public void test41269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest82.test41269");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.substring("................AA..................", 173, 5);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test41270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest82.test41270");
        int int3 = org.apache.commons.lang3.StringUtils.indexOfIgnoreCase("       util                                                                               ", "...vaj.gnalarraylistarraylistarrayli", 842);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test41271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest82.test41271");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("Javaaaaaaaaaava.langava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava", "...                                            ");
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test41272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest82.test41272");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.left("  ", 940);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "  " + "'", str2, "  ");
    }

    @Test
    public void test41273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest82.test41273");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsAny("INTERFACE JAVA.LANG.cLONEABLEvajINTERFACE JAVA.IO.sERIALIZABLE", "java.langjava.langjava.langjava.langjava.langjava.la");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test41274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest82.test41274");
        int int2 = org.apache.commons.lang3.StringUtils.indexOf("                                                                                                                                                 ", (-1));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test41275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest82.test41275");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.split("......java..........java..........java..........javanignirtSelbaenolC.gnal.avaj ecafretni");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfDifference((java.lang.CharSequence[]) strArray1);
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test41276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest82.test41276");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.split("                                              ][gnirtSlitu.avaj1-", "..");
        boolean boolean4 = org.apache.commons.lang3.StringUtils.startsWithAny("                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                     ", strArray3);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test41277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest82.test41277");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("hi!", "");
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.stripAll(strArray2, "$");
        java.lang.Class<?>[] wildcardClassArray5 = org.apache.commons.lang3.ClassUtils.toClass((java.lang.Object[]) strArray2);
        java.lang.Class<?>[] wildcardClassArray6 = org.apache.commons.lang3.ClassUtils.toClass((java.lang.Object[]) wildcardClassArray5);
        java.lang.Class<?>[] wildcardClassArray7 = org.apache.commons.lang3.ClassUtils.primitivesToWrappers(wildcardClassArray5);
        java.lang.Class<?>[] wildcardClassArray8 = org.apache.commons.lang3.ClassUtils.primitivesToWrappers(wildcardClassArray7);
        java.lang.Class<?>[] wildcardClassArray9 = org.apache.commons.lang3.ClassUtils.primitivesToWrappers(wildcardClassArray7);
        java.lang.String str11 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) wildcardClassArray7, "ylistarraylistarray");
        java.lang.String str12 = org.apache.commons.lang3.StringUtils.concat((java.lang.Object[]) wildcardClassArray7);
        java.lang.String str14 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) wildcardClassArray7, '.');
        java.lang.String str16 = org.apache.commons.lang3.ClassUtils.getPackageName((java.lang.Object) str14, "$######################################################################");
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertNotNull(wildcardClassArray5);
        org.junit.Assert.assertNotNull(wildcardClassArray6);
        org.junit.Assert.assertNotNull(wildcardClassArray7);
        org.junit.Assert.assertNotNull(wildcardClassArray8);
        org.junit.Assert.assertNotNull(wildcardClassArray9);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "class java.lang.String" + "'", str11, "class java.lang.String");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "class java.lang.String" + "'", str12, "class java.lang.String");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "class java.lang.String" + "'", str14, "class java.lang.String");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "java.lang" + "'", str16, "java.lang");
    }

    @Test
    public void test41278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest82.test41278");
        int int3 = org.apache.commons.lang3.StringUtils.ordinalIndexOf("                                                                                                                                                                                                 ", "                                                                                                                                                                                                                                                                              aaaaaa...                                                                                                                                                                                                                                                                                                                                                                                                                                                                        ", 760);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test41279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest82.test41279");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.uncapitalize((java.lang.CharSequence) "slitUgnirtS");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "slitUgnirtS" + "'", str1, "slitUgnirtS");
    }

    @Test
    public void test41280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest82.test41280");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.uncapitalize((java.lang.CharSequence) "classjavalangClassJAVAULANGJAVAULANGJAVAULANGJAVAULANGJAVAULANGJAVAULANGJAVAULANGJAVAULANGJAVAULANGJAVAULANGJAVAULANGJAVAULANGJAVAULANGJAVAULANGJAVAULANGJAVAULANGJAVAULANGJAVAULANGJAVAULANGJAVAULANG");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "classjavalangClassJAVAULANGJAVAULANGJAVAULANGJAVAULANGJAVAULANGJAVAULANGJAVAULANGJAVAULANGJAVAULANGJAVAULANGJAVAULANGJAVAULANGJAVAULANGJAVAULANGJAVAULANGJAVAULANGJAVAULANGJAVAULANGJAVAULANGJAVAULANG" + "'", str1, "classjavalangClassJAVAULANGJAVAULANGJAVAULANGJAVAULANGJAVAULANGJAVAULANGJAVAULANGJAVAULANGJAVAULANGJAVAULANGJAVAULANGJAVAULANGJAVAULANGJAVAULANGJAVAULANGJAVAULANGJAVAULANGJAVAULANGJAVAULANGJAVAULANG");
    }

    @Test
    public void test41281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest82.test41281");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("", "CHARACTER             UTILSTRI", 28);
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void test41282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest82.test41282");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNotBlank((java.lang.CharSequence) "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test41283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest82.test41283");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.contains("$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$", 477);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test41284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest82.test41284");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.containsWhitespace("                                                                                                            ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test41285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest82.test41285");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.split("ssalC", "Aaaaaaaaaaaa                                  ");
        int int4 = org.apache.commons.lang3.StringUtils.indexOfDifference((java.lang.CharSequence[]) strArray3);
        int int5 = org.apache.commons.lang3.StringUtils.indexOfAny("4444444string44444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444.ly..                                  $$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$                                  $$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$                                  $$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$                                  $$$$$$$$$$$$$$$$$$$$$$$44444444                                                                                                                                                                                                                                                                      ", strArray3);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
    }

    @Test
    public void test41286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest82.test41286");
        int int1 = org.apache.commons.lang3.StringUtils.length((java.lang.CharSequence) "                                                                                        i4elbaenolC.gnal.avaj ecafretniTRINGi4elbaenolC.gnal.avaj ecafCLASS JAVALANGCLASS                       JAVAULANG                       JAVAULANG                       JAVAULAN");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 264 + "'", int1 == 264);
    }

    @Test
    public void test41287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest82.test41287");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.normalizeSpace("gNALUAVAJGNALUAVAJGNALUAVAJGNALUAVAJGNALUAVAJGNALUAVAJGNALUAVAJGNALUAVAJGNALUAVAJGNALUAVAJGNALUAVAJGNALUAVAJGNALUAVAJGNALUAVAJGNALUAVAJGNALUAVAJGNALUAVAJGNALUAVAJGNALUAVAJGNALUAVAJSSALCGNALAVAJSSALC                                                                                                                                                                                                                                                                                                                                                                                          ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "gNALUAVAJGNALUAVAJGNALUAVAJGNALUAVAJGNALUAVAJGNALUAVAJGNALUAVAJGNALUAVAJGNALUAVAJGNALUAVAJGNALUAVAJGNALUAVAJGNALUAVAJGNALUAVAJGNALUAVAJGNALUAVAJGNALUAVAJGNALUAVAJGNALUAVAJGNALUAVAJSSALCGNALAVAJSSALC" + "'", str1, "gNALUAVAJGNALUAVAJGNALUAVAJGNALUAVAJGNALUAVAJGNALUAVAJGNALUAVAJGNALUAVAJGNALUAVAJGNALUAVAJGNALUAVAJGNALUAVAJGNALUAVAJGNALUAVAJGNALUAVAJGNALUAVAJGNALUAVAJGNALUAVAJGNALUAVAJGNALUAVAJSSALCGNALAVAJSSALC");
    }

    @Test
    public void test41288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest82.test41288");
        java.lang.Class<?> wildcardClass0 = null;
        java.lang.Class[] classArray2 = new java.lang.Class[1];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray3 = (java.lang.Class<?>[]) classArray2;
        wildcardClassArray3[0] = wildcardClass0;
        java.lang.Class<?>[] wildcardClassArray6 = org.apache.commons.lang3.ClassUtils.primitivesToWrappers(wildcardClassArray3);
        java.lang.Class<?> wildcardClass7 = null;
        java.lang.Class[] classArray9 = new java.lang.Class[1];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray10 = (java.lang.Class<?>[]) classArray9;
        wildcardClassArray10[0] = wildcardClass7;
        java.lang.Class<?>[] wildcardClassArray13 = org.apache.commons.lang3.ClassUtils.primitivesToWrappers(wildcardClassArray10);
        java.lang.String[] strArray15 = new java.lang.String[] { "                                   " };
        java.lang.String str16 = org.apache.commons.lang3.StringUtils.getCommonPrefix(strArray15);
        java.lang.Class<?>[] wildcardClassArray17 = org.apache.commons.lang3.ClassUtils.toClass((java.lang.Object[]) strArray15);
        java.lang.Class<?> wildcardClass18 = null;
        java.lang.Class[] classArray20 = new java.lang.Class[1];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray21 = (java.lang.Class<?>[]) classArray20;
        wildcardClassArray21[0] = wildcardClass18;
        java.lang.Class<?>[] wildcardClassArray24 = org.apache.commons.lang3.ClassUtils.primitivesToWrappers(wildcardClassArray21);
        boolean boolean25 = org.apache.commons.lang3.ClassUtils.isAssignable(wildcardClassArray17, wildcardClassArray21);
        boolean boolean27 = org.apache.commons.lang3.ClassUtils.isAssignable(wildcardClassArray10, wildcardClassArray21, true);
        boolean boolean29 = org.apache.commons.lang3.ClassUtils.isAssignable(wildcardClassArray6, wildcardClassArray21, true);
        java.lang.String str31 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) wildcardClassArray21, 'a');
        java.lang.String str33 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) wildcardClassArray21, "JAVAsTRIN");
        java.lang.Class<?>[] wildcardClassArray34 = org.apache.commons.lang3.ClassUtils.wrappersToPrimitives(wildcardClassArray21);
        org.junit.Assert.assertNotNull(classArray2);
        org.junit.Assert.assertNotNull(wildcardClassArray3);
        org.junit.Assert.assertNotNull(wildcardClassArray6);
        org.junit.Assert.assertNotNull(classArray9);
        org.junit.Assert.assertNotNull(wildcardClassArray10);
        org.junit.Assert.assertNotNull(wildcardClassArray13);
        org.junit.Assert.assertNotNull(strArray15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "                                   " + "'", str16, "                                   ");
        org.junit.Assert.assertNotNull(wildcardClassArray17);
        org.junit.Assert.assertNotNull(classArray20);
        org.junit.Assert.assertNotNull(wildcardClassArray21);
        org.junit.Assert.assertNotNull(wildcardClassArray24);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "" + "'", str31, "");
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "" + "'", str33, "");
        org.junit.Assert.assertNotNull(wildcardClassArray34);
    }

    @Test
    public void test41289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest82.test41289");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceChars("Jv.lngjv.lngjv.lngjv.lngjv.lngjv.lngjv.lngjv.lngjv.lngjv.lngjv.lngjv.lngjv.lngjv.lngjv.lngjv.lngjv...", '4', '#');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Jv.lngjv.lngjv.lngjv.lngjv.lngjv.lngjv.lngjv.lngjv.lngjv.lngjv.lngjv.lngjv.lngjv.lngjv.lngjv.lngjv..." + "'", str3, "Jv.lngjv.lngjv.lngjv.lngjv.lngjv.lngjv.lngjv.lngjv.lngjv.lngjv.lngjv.lngjv.lngjv.lngjv.lngjv.lngjv...");
    }

    @Test
    public void test41290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest82.test41290");
        char[] charArray15 = new char[] { ' ', ' ', '#', 'a', '4', 'a' };
        int int16 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "", charArray15);
        boolean boolean17 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "......", charArray15);
        int int18 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "                                                                                                    ", charArray15);
        int int19 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "avaj.gnal", charArray15);
        boolean boolean20 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "", charArray15);
        boolean boolean21 = org.apache.commons.lang3.StringUtils.containsAny("javaStringnalArrayListArrayListArrayListavaj.gnalArrayListArrayListArrayLi", charArray15);
        int int22 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "444       AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA", charArray15);
        boolean boolean23 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "ayli", charArray15);
        int int24 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "######################################                                                                                                                                                                                                                                                #########################sClassslitUgnirtSslitUgnirtSslitUgnirtSslitUgnirtSslitUgnirtSslitUgnirtSslitUgnirtSslitUgnirtSslitUgnirtSslitUgnirtS##########################                                                                                                                                                                                                                                                                                                                                                                                                                                        Serializabl                         ", charArray15);
        org.junit.Assert.assertNotNull(charArray15);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray15), "  #a4a");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray15), "  #a4a");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray15), "[ ,  , #, a, 4, a]");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 303 + "'", int24 == 303);
    }

    @Test
    public void test41291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest82.test41291");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.endsWithIgnoreCase("BYTE", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa       ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test41292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest82.test41292");
        int int3 = org.apache.commons.lang3.StringUtils.indexOf("hi!ArrayListArrayListArrayListavaj....1AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA...1AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA...1AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA...1AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA...1AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA...1AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA...1AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA...1AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA...1AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAJava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava", 84, 935);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test41293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest82.test41293");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.contains("...       ", 262);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test41294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest82.test41294");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.split("...                                                                                                 ", '$');
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.getCommonPrefix(strArray3);
        boolean boolean5 = org.apache.commons.lang3.StringUtils.endsWithAny("                       javaulangrraylist", strArray3);
        java.lang.String str6 = org.apache.commons.lang3.StringUtils.concat((java.lang.Object[]) strArray3);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "...                                                                                                 " + "'", str4, "...                                                                                                 ");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "...                                                                                                 " + "'", str6, "...                                                                                                 ");
    }

    @Test
    public void test41295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest82.test41295");
        java.lang.String[] strArray3 = new java.lang.String[] { "                                   " };
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.getCommonPrefix(strArray3);
        int int5 = org.apache.commons.lang3.StringUtils.indexOfDifference((java.lang.CharSequence[]) strArray3);
        java.lang.String str6 = org.apache.commons.lang3.StringUtils.concatWith("agnAAAAAAAAAA", (java.lang.Object[]) strArray3);
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.concat((java.lang.Object[]) strArray3);
        java.lang.String[] strArray11 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa       ", '#');
        java.lang.String[] strArray12 = org.apache.commons.lang3.StringUtils.stripAll(strArray11);
        java.lang.String[] strArray17 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("A..ayLA", ".......", 2);
        int int18 = org.apache.commons.lang3.StringUtils.indexOfDifference((java.lang.CharSequence[]) strArray17);
        boolean boolean19 = org.apache.commons.lang3.StringUtils.startsWithAny("rayListArrayListavaj.gnal                                                                ", strArray17);
        java.lang.String str20 = org.apache.commons.lang3.StringUtils.replaceEachRepeatedly("LANG.GNALJAVA.LANGAVAJ.GNALJAVA.LANGAVAJ.GNALJAVA.LANGAVAJ.GNALJAVA.L", strArray12, strArray17);
        java.lang.String str21 = org.apache.commons.lang3.StringUtils.replaceEach("L.AVAJLANG.JAVAGNAL.AVAJLANG.JAVAGNAL.AVAJLANG.JAVAGNAL.AVAJLANG.GNAL", strArray3, strArray12);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "                                   " + "'", str4, "                                   ");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "                                   " + "'", str6, "                                   ");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "                                   " + "'", str7, "                                   ");
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertNotNull(strArray12);
        org.junit.Assert.assertNotNull(strArray17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "LANG.GNALJAVA.LANGAVAJ.GNALJAVA.LANGAVAJ.GNALJAVA.LANGAVAJ.GNALJAVA.L" + "'", str20, "LANG.GNALJAVA.LANGAVAJ.GNALJAVA.LANGAVAJ.GNALJAVA.LANGAVAJ.GNALJAVA.L");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "L.AVAJLANG.JAVAGNAL.AVAJLANG.JAVAGNAL.AVAJLANG.JAVAGNAL.AVAJLANG.GNAL" + "'", str21, "L.AVAJLANG.JAVAGNAL.AVAJLANG.JAVAGNAL.AVAJLANG.JAVAGNAL.AVAJLANG.GNAL");
    }

    @Test
    public void test41296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest82.test41296");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.upperCase("VAJ.GNAL");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "VAJ.GNAL" + "'", str1, "VAJ.GNAL");
    }

    @Test
    public void test41297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest82.test41297");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.uncapitalize((java.lang.CharSequence) "Arra                                                                 AtsiLytcejbOlvjsslcrrAtsiLytcejbO.gnal.avaj ssalcrrAva.langGNAL..langjava.langAGNAL44444444444444444GNALUAVAJ44444444444444444444444444444444444444444444444444444444444444444444444Arra                                                                 AtsiLytcejbOlvjsslcrrAtsiLytcejbO.gnal.avaj ssalcrrAva.langGNAL..langjava.langAGNAL");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "arra                                                                 AtsiLytcejbOlvjsslcrrAtsiLytcejbO.gnal.avaj ssalcrrAva.langGNAL..langjava.langAGNAL44444444444444444GNALUAVAJ44444444444444444444444444444444444444444444444444444444444444444444444Arra                                                                 AtsiLytcejbOlvjsslcrrAtsiLytcejbO.gnal.avaj ssalcrrAva.langGNAL..langjava.langAGNAL" + "'", str1, "arra                                                                 AtsiLytcejbOlvjsslcrrAtsiLytcejbO.gnal.avaj ssalcrrAva.langGNAL..langjava.langAGNAL44444444444444444GNALUAVAJ44444444444444444444444444444444444444444444444444444444444444444444444Arra                                                                 AtsiLytcejbOlvjsslcrrAtsiLytcejbO.gnal.avaj ssalcrrAva.langGNAL..langjava.langAGNAL");
    }

    @Test
    public void test41298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest82.test41298");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trimToEmpty("iLyarrAtsiLyarrAtsiLyarrAlang.javatsiLyarrAtsiLyarrAtsiLyarrAlang");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "iLyarrAtsiLyarrAtsiLyarrAlang.javatsiLyarrAtsiLyarrAtsiLyarrAlang" + "'", str1, "iLyarrAtsiLyarrAtsiLyarrAlang.javatsiLyarrAtsiLyarrAtsiLyarrAlang");
    }

    @Test
    public void test41299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest82.test41299");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens(".........", '.');
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.getCommonPrefix(strArray2);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test41300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest82.test41300");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfDifference((java.lang.CharSequence) "GNAL.AL.ARRAYLISTGNAL.AL.ARRAYLISTGNAL.AGNAL.AVAJGNAL.AVAJGNAL.AVAJGNAL.AVAJGNAL.AVAJGNAL.AVAJGNAL.AVAJGNAL.AVAJGNAL.AVAJGNAL.AVAJGNAL.AVAJGNAL.AVAJGNAL.AVAJGNAL.AVAJGNAL.AVAJGNAL.AVAJGNAL.AVAJGNAL.AVAJGNAL.AVAJGNAL.AVAJGNAL.AVAJGNAL.AVAJGNAL.AVAJGNAL.AVAJGNAL.AVAJGNAL.AVAJGNAL.AVAJGNAL.AVAGNAL.AVAAAAAAAAAAVAJARRAYLISTGNAL.AL.ARRAYLISTGNAL.AL.ARRAYLIST", (java.lang.CharSequence) "         Aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa          ");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test41301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest82.test41301");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("hi!ArrayListArrayListArrayListava", "A..ayL A.44444444444444444444444444                                 ", 156);
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void test41302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest82.test41302");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.normalizeSpace("..aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa ...aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa ...aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa ...aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa ...aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa ...aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa ...aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa ...aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa ...aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa ...rrA");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "..aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa ...aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa ...aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa ...aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa ...aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa ...aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa ...aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa ...aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa ...aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa ...rrA" + "'", str1, "..aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa ...aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa ...aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa ...aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa ...aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa ...aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa ...aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa ...aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa ...aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa ...rrA");
    }

    @Test
    public void test41303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest82.test41303");
        int int2 = org.apache.commons.lang3.StringUtils.indexOf("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaayl", "                                                                                                                                                                                                             j.v.tsily.rr.tsily.rr.tsily.rr                                                                                                                                                                                                              ");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test41304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest82.test41304");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.lowerCase("...       ...       ...       ...       ...       ...       ...       ...       ...       ...   GNA");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "...       ...       ...       ...       ...       ...       ...       ...       ...       ...   gna" + "'", str1, "...       ...       ...       ...       ...       ...       ...       ...       ...       ...   gna");
    }

    @Test
    public void test41305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest82.test41305");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.chop("string              Integer                            Integ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "string              Integer                            Inte" + "'", str1, "string              Integer                            Inte");
    }

    @Test
    public void test41306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest82.test41306");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitByCharacterType("gnal.avajgnal..LANGgnal.avajgnal.");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray1);
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "gnal.avajgnal..LANGgnal.avajgnal." + "'", str2, "gnal.avajgnal..LANGgnal.avajgnal.");
    }

    @Test
    public void test41307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest82.test41307");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.rightPad("GNALUAVAJGNALUAVAJGNALUAVAJGNALUAVAJGNALUAVAJGNALUAVAJGNALUAVAJGNALUAVAJGNALUAVAJGNALUAVAJGNALUAVAJGNALUAVAJGNALUAVAJGNALUAVAJGNALUAVAJGNALUAVAJGNALUAVAJGNALUAVAJGNALUAVAJGNALUAVAJSSALCGNALAVAJSSALC", 21, "INGuTILSsTRINGuTILS");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "GNALUAVAJGNALUAVAJGNALUAVAJGNALUAVAJGNALUAVAJGNALUAVAJGNALUAVAJGNALUAVAJGNALUAVAJGNALUAVAJGNALUAVAJGNALUAVAJGNALUAVAJGNALUAVAJGNALUAVAJGNALUAVAJGNALUAVAJGNALUAVAJGNALUAVAJGNALUAVAJSSALCGNALAVAJSSALC" + "'", str3, "GNALUAVAJGNALUAVAJGNALUAVAJGNALUAVAJGNALUAVAJGNALUAVAJGNALUAVAJGNALUAVAJGNALUAVAJGNALUAVAJGNALUAVAJGNALUAVAJGNALUAVAJGNALUAVAJGNALUAVAJGNALUAVAJGNALUAVAJGNALUAVAJGNALUAVAJGNALUAVAJSSALCGNALAVAJSSALC");
    }

    @Test
    public void test41308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest82.test41308");
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.overlay("JAVA.LANGAGNAL.AVAJGNAL..LANGGNAL.AVARRCLASS JAVA.LANG.OBJECTYLISTARRCLASS JAVA.LANG.OBJECTYLISTA", "a..........java...       ", 188, 605);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "JAVA.LANGAGNAL.AVAJGNAL..LANGGNAL.AVARRCLASS JAVA.LANG.OBJECTYLISTARRCLASS JAVA.LANG.OBJECTYLISTAa..........java...       " + "'", str4, "JAVA.LANGAGNAL.AVAJGNAL..LANGGNAL.AVARRCLASS JAVA.LANG.OBJECTYLISTARRCLASS JAVA.LANG.OBJECTYLISTAa..........java...       ");
    }

    @Test
    public void test41309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest82.test41309");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.leftPad("class java.lang.Class                       JAVAULANG                       JAVAULANG                       JAVAULANG                       JAVAULANG                       JAVAULANG                       JAVAULANG                       JAVAULANG                       JAVAULANG                       JAVAULANG                       JAVAULANG                       JAVAULANG                       JAVAULANG                       JAVAULANG                       JAVAULANG                       JAVAULANG                       JAVAULANG                       JAVAULANG                       JAVAULANG                       JAVAULANG                       JAVAULANG        ", 537, "vj.gnljv.lngvj.gnljv.lngvj.gnljv.lngvj.gnljv.lngvj.gnljv.lngvj.gnljv");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "class java.lang.Class                       JAVAULANG                       JAVAULANG                       JAVAULANG                       JAVAULANG                       JAVAULANG                       JAVAULANG                       JAVAULANG                       JAVAULANG                       JAVAULANG                       JAVAULANG                       JAVAULANG                       JAVAULANG                       JAVAULANG                       JAVAULANG                       JAVAULANG                       JAVAULANG                       JAVAULANG                       JAVAULANG                       JAVAULANG                       JAVAULANG        " + "'", str3, "class java.lang.Class                       JAVAULANG                       JAVAULANG                       JAVAULANG                       JAVAULANG                       JAVAULANG                       JAVAULANG                       JAVAULANG                       JAVAULANG                       JAVAULANG                       JAVAULANG                       JAVAULANG                       JAVAULANG                       JAVAULANG                       JAVAULANG                       JAVAULANG                       JAVAULANG                       JAVAULANG                       JAVAULANG                       JAVAULANG                       JAVAULANG        ");
    }

    @Test
    public void test41310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest82.test41310");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.abbreviate("java$.lang.Stringclass java.lang.Stringclass java.lang.Stringclas.lang.Stringclass java.lang.Stri", 315, 472);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "java$.lang.Stringclass java.lang.Stringclass java.lang.Stringclas.lang.Stringclass java.lang.Stri" + "'", str3, "java$.lang.Stringclass java.lang.Stringclass java.lang.Stringclas.lang.Stringclass java.lang.Stri");
    }

    @Test
    public void test41311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest82.test41311");
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("java.util", "slitUgnirtS");
        boolean boolean5 = org.apache.commons.lang3.StringUtils.startsWithAny("slitUgnirtS", strArray4);
        java.lang.String[] strArray6 = org.apache.commons.lang3.StringUtils.stripAll(strArray4);
        java.lang.String[] strArray10 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("$ArrayList", "$ArrayList");
        java.lang.String str12 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray10, "slitUgnirtS");
        java.lang.String str16 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray10, '.', 152, (int) ' ');
        int int17 = org.apache.commons.lang3.StringUtils.indexOfAny("aVAJ.GNALAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA       CharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterChara", strArray10);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str18 = org.apache.commons.lang3.StringUtils.replaceEach("arjavaarrarjavaarrarjavaarrarjavaarrarjavaarrarjavaarrarjavaarrarjavaarrarjavaarrarjavaarrarjavaarrarjavaarrarjavaarrarjavaarrarjavaarrarjavaarrarjavaarrarjavaarrarjavaarrarjavaarrarjavaarrarjavaarrarjavaarrarjavaarrarjavaarrarjavaarrarjavaarrarjavaarrarjavaarrarjavaarrarjavaarrarjavaarrarjavaarrarjavaarrarjavaarrarjavaarrarjavaarrarjavaarrarjavaarrarjavaarrarjavaarrarjavaarrarjavaarrarjavaarrarjavaarrarjavaarrarjavaarrarjavaarrarjavaarrarjavaarrarjavaarrarjavaarrarjalass java.lang.string", strArray4, strArray10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Search and Replace array lengths don't match: 1 vs 11");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertNotNull(strArray10);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "slitUgnirtSslitUgnirtSslitUgnirtSslitUgnirtSslitUgnirtSslitUgnirtSslitUgnirtSslitUgnirtSslitUgnirtSslitUgnirtS" + "'", str12, "slitUgnirtSslitUgnirtSslitUgnirtSslitUgnirtSslitUgnirtSslitUgnirtSslitUgnirtSslitUgnirtSslitUgnirtSslitUgnirtS");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
    }

    @Test
    public void test41312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest82.test41312");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.defaultString("GNGNAL.AVAJ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "GNGNAL.AVAJ" + "'", str1, "GNGNAL.AVAJ");
    }

    @Test
    public void test41313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest82.test41313");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.strip("#####################################################################################################################################################################################################################################################################################################################################################################################################################################################..........a       ..", "BytBytBytBytBytBytBytBytBytBytBytBjavatsilyarratsilyarratsilyarrBytBytBytBytBytBytBytBytBytBytBytBy");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "#####################################################################################################################################################################################################################################################################################################################################################################################################################################################..........a       .." + "'", str2, "#####################################################################################################################################################################################################################################################################################################################################################################################################################################################..........a       ..");
    }

    @Test
    public void test41314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest82.test41314");
        int int2 = org.apache.commons.lang3.StringUtils.getLevenshteinDistance((java.lang.CharSequence) "][sslC", (java.lang.CharSequence) "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa.1aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa.1aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa.1aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa.1aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa.1aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa.1aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa.1aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa.hi!arraylistarraylistarraylis");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 709 + "'", int2 == 709);
    }

    @Test
    public void test41315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest82.test41315");
        char[] charArray13 = new char[] { ' ', ' ', '#', 'a', '4', 'a' };
        int int14 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "", charArray13);
        boolean boolean15 = org.apache.commons.lang3.StringUtils.containsAny("$", charArray13);
        boolean boolean16 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "...       AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA...       AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA...       AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA...       AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA...       AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA...       AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA...       AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA...       AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA...       AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA...       AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA", charArray13);
        boolean boolean17 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "java.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.lang", charArray13);
        boolean boolean18 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "JAVAULANG", charArray13);
        boolean boolean19 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "                                                                              INTERFACE JAVA.LANG.CLONEABLE...                                 INTERFACE JAVA.IO.SERIALIZABLE", charArray13);
        int int20 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "irfSeriaCoSeria$SeriairfioSeriInterface java.lang.Cloneable             Character             interface java.io.SerializableirfSeriaCoSeria$SeriairfioSeria", charArray13);
        org.junit.Assert.assertNotNull(charArray13);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray13), "  #a4a");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray13), "  #a4a");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray13), "[ ,  , #, a, 4, a]");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 7 + "'", int20 == 7);
    }

    @Test
    public void test41316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest82.test41316");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.chomp("AVAJ.GNAL......java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........javainterfacejava.io.Serializabl", "gnirtSlitu.avaj1-gnirtSlitu.avaj1java.litu.avajlitu.avajjava.litu.avajlitu.avajjava.litu.avajlitu.avajjava.litu.avajlitu.avajjava.litu.avajlitu.avajjava.litu.avajlitu.avajjava.litu.avajlitu.avajjava.litu.avajlitu.avajjava.litu.avajlitu.avajjava.litu.avajlitu.avajjava.litu.avajlitu.avajjava.litu.avajlitu.avajjava.litu.avajlitu.avajjava.litu.avajlitu.avajjava.litu.avajlitu.avajjava.litu.avajlitu.avajjava.litu.avajlitu.avajjava.litu.avajlitu.avajjava.litu.avajlitu.avajjava.litu.avajlitu.avajjava.litu.avajlitu.avajjava.litu.avajlitu.avajjava.litu.avajlitu.avajjava.litu.avajlitu.avajjava.litu.avajlitu.avajjava.litu.avajlitu.avajjava.litu.avajlitu.avajjava.litu.avajlitu.avajjava.litu.avajlitu.avajjava.litu.avajlitu.avajjava.litu.avajlitu.avajjava.litu.avajlitu.avajjava.litu.avajlitu.avaj");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "AVAJ.GNAL......java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........javainterfacejava.io.Serializabl" + "'", str2, "AVAJ.GNAL......java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........javainterfacejava.io.Serializabl");
    }

    @Test
    public void test41317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest82.test41317");
        int int3 = org.apache.commons.lang3.StringUtils.ordinalIndexOf("$$$$$$$$$$$$$$$$$$$$$$$$$$$$$aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa.hi!arraylistarraylistarraylisgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnal$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$", "     A..ayL A.44444444444444444444444444      ", 47);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test41318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest82.test41318");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlpha((java.lang.CharSequence) "                                     rgnaluavaj");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test41319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest82.test41319");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOf("  $         $         $         $         $         $         $         $         $         $         $         $ ...", "rface java.lang.cloneable                                                 ");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test41320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest82.test41320");
        int int3 = org.apache.commons.lang3.StringUtils.lastOrdinalIndexOf("...AAAAA...", "........................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................INTERFACE JAVA.LANG.cLONEABLE4INTERFACE JAVA.IO.sERIALIZABL", 678);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test41321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest82.test41321");
        java.lang.String str1 = org.apache.commons.lang3.ClassUtils.getPackageCanonicalName("avajlitu");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
    }

    @Test
    public void test41322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest82.test41322");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isEmpty((java.lang.CharSequence) "                        ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test41323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest82.test41323");
        java.lang.Class[] classArray1 = new java.lang.Class[0];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray2 = (java.lang.Class<?>[]) classArray1;
        java.lang.Class<?>[] wildcardClassArray3 = org.apache.commons.lang3.ClassUtils.primitivesToWrappers(wildcardClassArray2);
        java.lang.Class<?> wildcardClass4 = null;
        java.lang.Class[] classArray6 = new java.lang.Class[1];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray7 = (java.lang.Class<?>[]) classArray6;
        wildcardClassArray7[0] = wildcardClass4;
        java.lang.Class<?>[] wildcardClassArray10 = org.apache.commons.lang3.ClassUtils.primitivesToWrappers(wildcardClassArray7);
        boolean boolean12 = org.apache.commons.lang3.ClassUtils.isAssignable(wildcardClassArray2, wildcardClassArray7, true);
        java.lang.Class[] classArray14 = new java.lang.Class[0];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray15 = (java.lang.Class<?>[]) classArray14;
        java.lang.Class<?>[] wildcardClassArray16 = org.apache.commons.lang3.ClassUtils.primitivesToWrappers(wildcardClassArray15);
        java.lang.String str18 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) wildcardClassArray16, "...                                 ");
        boolean boolean19 = org.apache.commons.lang3.ClassUtils.isAssignable(wildcardClassArray7, wildcardClassArray16);
        java.lang.Class<?>[] wildcardClassArray20 = org.apache.commons.lang3.ClassUtils.primitivesToWrappers(wildcardClassArray16);
        java.lang.Class<?>[] wildcardClassArray21 = org.apache.commons.lang3.ClassUtils.primitivesToWrappers(wildcardClassArray20);
        java.lang.Class<?>[] wildcardClassArray22 = org.apache.commons.lang3.ClassUtils.wrappersToPrimitives(wildcardClassArray21);
        java.lang.Class<?> wildcardClass23 = null;
        java.lang.Class[] classArray25 = new java.lang.Class[1];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray26 = (java.lang.Class<?>[]) classArray25;
        wildcardClassArray26[0] = wildcardClass23;
        java.lang.Class<?>[] wildcardClassArray29 = org.apache.commons.lang3.ClassUtils.primitivesToWrappers(wildcardClassArray26);
        java.lang.String[] strArray31 = new java.lang.String[] { "                                   " };
        java.lang.String str32 = org.apache.commons.lang3.StringUtils.getCommonPrefix(strArray31);
        java.lang.Class<?>[] wildcardClassArray33 = org.apache.commons.lang3.ClassUtils.toClass((java.lang.Object[]) strArray31);
        java.lang.Class<?> wildcardClass34 = null;
        java.lang.Class[] classArray36 = new java.lang.Class[1];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray37 = (java.lang.Class<?>[]) classArray36;
        wildcardClassArray37[0] = wildcardClass34;
        java.lang.Class<?>[] wildcardClassArray40 = org.apache.commons.lang3.ClassUtils.primitivesToWrappers(wildcardClassArray37);
        boolean boolean41 = org.apache.commons.lang3.ClassUtils.isAssignable(wildcardClassArray33, wildcardClassArray37);
        boolean boolean43 = org.apache.commons.lang3.ClassUtils.isAssignable(wildcardClassArray26, wildcardClassArray37, true);
        java.lang.Class<?> wildcardClass44 = null;
        java.lang.Class[] classArray46 = new java.lang.Class[1];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray47 = (java.lang.Class<?>[]) classArray46;
        wildcardClassArray47[0] = wildcardClass44;
        java.lang.Class<?>[] wildcardClassArray50 = org.apache.commons.lang3.ClassUtils.primitivesToWrappers(wildcardClassArray47);
        boolean boolean52 = org.apache.commons.lang3.ClassUtils.isAssignable(wildcardClassArray37, wildcardClassArray47, false);
        java.lang.String[] strArray54 = new java.lang.String[] { "                                   " };
        java.lang.String str55 = org.apache.commons.lang3.StringUtils.getCommonPrefix(strArray54);
        java.lang.Class<?>[] wildcardClassArray56 = org.apache.commons.lang3.ClassUtils.toClass((java.lang.Object[]) strArray54);
        java.lang.Class<?> wildcardClass57 = null;
        java.lang.Class[] classArray59 = new java.lang.Class[1];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray60 = (java.lang.Class<?>[]) classArray59;
        wildcardClassArray60[0] = wildcardClass57;
        java.lang.Class<?>[] wildcardClassArray63 = org.apache.commons.lang3.ClassUtils.primitivesToWrappers(wildcardClassArray60);
        boolean boolean64 = org.apache.commons.lang3.ClassUtils.isAssignable(wildcardClassArray56, wildcardClassArray60);
        boolean boolean65 = org.apache.commons.lang3.ClassUtils.isAssignable(wildcardClassArray37, wildcardClassArray56);
        java.lang.String[] strArray70 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("...", "avaj.gnal", (int) 'a');
        boolean boolean71 = org.apache.commons.lang3.StringUtils.startsWithAny("", strArray70);
        java.lang.Class<?>[] wildcardClassArray72 = org.apache.commons.lang3.ClassUtils.toClass((java.lang.Object[]) strArray70);
        boolean boolean73 = org.apache.commons.lang3.ClassUtils.isAssignable(wildcardClassArray37, wildcardClassArray72);
        java.lang.String[] strArray78 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("avaj.gnal", "$       ");
        java.lang.String[] strArray82 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("...", 'a');
        java.lang.String[] strArray85 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("$", "                                   ");
        java.lang.String str86 = org.apache.commons.lang3.StringUtils.replaceEachRepeatedly("...       ", strArray82, strArray85);
        java.lang.String str87 = org.apache.commons.lang3.StringUtils.replaceEachRepeatedly("                                              ", strArray78, strArray85);
        java.lang.String str88 = org.apache.commons.lang3.StringUtils.getCommonPrefix(strArray78);
        boolean boolean89 = org.apache.commons.lang3.StringUtils.endsWithAny("ArrayListArrayListArrayListavajGNAL.AVAJLANG.JAVAGNAL.AVAJLANG.JAVAGNAL.AVAJLANG.JAVAGNAL.AVAJLANG.JAVAGNAL.AVAJLANG.JAVAGNAL.AVAJLANG.JAVAGNAL.AVAJLANG.JAVAGNAL.AVAJLANG.JAVAGNAL.AVAJgnal", strArray78);
        java.lang.Class<?>[] wildcardClassArray90 = org.apache.commons.lang3.ClassUtils.toClass((java.lang.Object[]) strArray78);
        boolean boolean92 = org.apache.commons.lang3.ClassUtils.isAssignable(wildcardClassArray72, wildcardClassArray90, true);
        boolean boolean94 = org.apache.commons.lang3.ClassUtils.isAssignable(wildcardClassArray22, wildcardClassArray90, true);
        java.lang.Class<?>[] wildcardClassArray95 = org.apache.commons.lang3.ClassUtils.primitivesToWrappers(wildcardClassArray90);
        java.lang.String str96 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) wildcardClassArray90);
        org.junit.Assert.assertNotNull(classArray1);
        org.junit.Assert.assertNotNull(wildcardClassArray2);
        org.junit.Assert.assertNotNull(wildcardClassArray3);
        org.junit.Assert.assertNotNull(classArray6);
        org.junit.Assert.assertNotNull(wildcardClassArray7);
        org.junit.Assert.assertNotNull(wildcardClassArray10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(classArray14);
        org.junit.Assert.assertNotNull(wildcardClassArray15);
        org.junit.Assert.assertNotNull(wildcardClassArray16);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(wildcardClassArray20);
        org.junit.Assert.assertNotNull(wildcardClassArray21);
        org.junit.Assert.assertNotNull(wildcardClassArray22);
        org.junit.Assert.assertNotNull(classArray25);
        org.junit.Assert.assertNotNull(wildcardClassArray26);
        org.junit.Assert.assertNotNull(wildcardClassArray29);
        org.junit.Assert.assertNotNull(strArray31);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "                                   " + "'", str32, "                                   ");
        org.junit.Assert.assertNotNull(wildcardClassArray33);
        org.junit.Assert.assertNotNull(classArray36);
        org.junit.Assert.assertNotNull(wildcardClassArray37);
        org.junit.Assert.assertNotNull(wildcardClassArray40);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertNotNull(classArray46);
        org.junit.Assert.assertNotNull(wildcardClassArray47);
        org.junit.Assert.assertNotNull(wildcardClassArray50);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertNotNull(strArray54);
        org.junit.Assert.assertEquals("'" + str55 + "' != '" + "                                   " + "'", str55, "                                   ");
        org.junit.Assert.assertNotNull(wildcardClassArray56);
        org.junit.Assert.assertNotNull(classArray59);
        org.junit.Assert.assertNotNull(wildcardClassArray60);
        org.junit.Assert.assertNotNull(wildcardClassArray63);
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + false + "'", boolean64 == false);
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + true + "'", boolean65 == true);
        org.junit.Assert.assertNotNull(strArray70);
        org.junit.Assert.assertTrue("'" + boolean71 + "' != '" + false + "'", boolean71 == false);
        org.junit.Assert.assertNotNull(wildcardClassArray72);
        org.junit.Assert.assertTrue("'" + boolean73 + "' != '" + true + "'", boolean73 == true);
        org.junit.Assert.assertNotNull(strArray78);
        org.junit.Assert.assertNotNull(strArray82);
        org.junit.Assert.assertNotNull(strArray85);
        org.junit.Assert.assertEquals("'" + str86 + "' != '" + "$       " + "'", str86, "$       ");
        org.junit.Assert.assertEquals("'" + str87 + "' != '" + "                                              " + "'", str87, "                                              ");
        org.junit.Assert.assertEquals("'" + str88 + "' != '" + "avaj.gnal" + "'", str88, "avaj.gnal");
        org.junit.Assert.assertTrue("'" + boolean89 + "' != '" + false + "'", boolean89 == false);
        org.junit.Assert.assertNotNull(wildcardClassArray90);
        org.junit.Assert.assertTrue("'" + boolean92 + "' != '" + true + "'", boolean92 == true);
        org.junit.Assert.assertTrue("'" + boolean94 + "' != '" + false + "'", boolean94 == false);
        org.junit.Assert.assertNotNull(wildcardClassArray95);
        org.junit.Assert.assertEquals("'" + str96 + "' != '" + "class java.lang.String" + "'", str96, "class java.lang.String");
    }

    @Test
    public void test41324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest82.test41324");
        java.util.Locale locale1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.apache.commons.lang3.StringUtils.lowerCase("                                                                      ...", locale1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test41325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest82.test41325");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.equals((java.lang.CharSequence) "                                                                                                                                               ", (java.lang.CharSequence) "                                                                 ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test41326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest82.test41326");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfDifference((java.lang.CharSequence) "444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444litu.avajlitu", (java.lang.CharSequence) "lang.gnaljava.langavaj.gnaljava.langavaj.gnaljava.langavaj.gnaljava.lalang.gnaljava.langavaj.gnaljava.langavaj.gnaljava.langavaj.gnaljava.lalang.gnaljava.langavaj.gnaljava.langavaj.gnaljava.langavaj.gnaljava.lalang.gnaljava.langavaj.gnaljava.langavaj.gnaljava.langavaj.gnaljava.lalang.gnaljava.langavaj.gnaljava.langavaj.gnaljava.langavaj.gnaljava.lalang.gnaljava.langavaj.gnaljava.langavaj.gnaljava.langavaj.gnaljava.lalang.gnaljava.langavaj.gnaljava.langavaj.gnaljava.langavaj.gnaljava.lalang.gnaljava.langavaj.gnaljava.langavaj.gnaljava.langavaj.gnaljava.lalang.gnaljava.ljAV");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test41327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest82.test41327");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.chop("AAAAAAAAAAAAAAAAAAA44");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "AAAAAAAAAAAAAAAAAAA4" + "'", str1, "AAAAAAAAAAAAAAAAAAA4");
    }

    @Test
    public void test41328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest82.test41328");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNotEmpty((java.lang.CharSequence) "class java.lang.Stringclass java.lang.Stringclass java.lang.Stringclass java.lang.Stringclass java.lang.Stringclass java.lang.Stringclass java.lang.Stringclass java.lang.Stringclass java.lang.Stringclass java.lang.Stringclass java.lang.Stringclass java.lang.Stringclass java.lang.Stringclass java.lang.Stringclass java.lang.Stringclass java.lang.Stringclass java.lang.Stringclass java.lang.Stringclass java.lang.Stringclass java.lang.Stringclass java.lang.Stringclass java.lang.Stringclass java.lang.Stringclass java.lang.Stringclass java.lang.Stringclass java.lang.Stringclass java.lang.Stringclass java.lang.Stringclass java.lang.Stringclass java.lang.String########################################################################################################");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test41329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest82.test41329");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.strip("java.lang.Cloneable4interface java.io.Serializa");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "java.lang.Cloneable4interface java.io.Serializa" + "'", str1, "java.lang.Cloneable4interface java.io.Serializa");
    }

    @Test
    public void test41330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest82.test41330");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.center("                                                                                                                                                               AAAAAAAAAAAAAAAAAAAgnaluavajAAAAAAAAAAAAAAAAAAA                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                           ", 80);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                                                                                                                                               AAAAAAAAAAAAAAAAAAAgnaluavajAAAAAAAAAAAAAAAAAAA                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                           " + "'", str2, "                                                                                                                                                               AAAAAAAAAAAAAAAAAAAgnaluavajAAAAAAAAAAAAAAAAAAA                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                           ");
    }

    @Test
    public void test41331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest82.test41331");
        int int2 = org.apache.commons.lang3.StringUtils.indexOf("java$", 493);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test41332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest82.test41332");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitByCharacterType("JavajGNALavaaaaaaaaaavaavajGNAL.avajGNALlangavaavajGNAL.avajGNALlangjavaavajGNAL.avajGNALlangjavaavajGNAL.avajGNALlangjavaavajGNAL.avajGNALlangjavaavajGNAL.avajGNALlangjavaavajGNAL.avajGNALlangjavaavajGNAL.avajGNALlangjavaavajGNAL.avajGNALlangjavaavajGNAL.avajGNALlangjavaavajGNAL.avajGNALlangjavaavajGNAL.avajGNALlangjavaavajGNAL.avajGNALlangjavaavajGNAL.avajGNALlangjavaavajGNAL.avajGNALlangjavaavajGNAL.avajGNALlan");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfDifference((java.lang.CharSequence[]) strArray1);
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test41333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest82.test41333");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.uncapitalize((java.lang.CharSequence) "######################################################################################################################..aaaaaaaaaaaaaaaaaaaaaaaaaaaaa.....GNAL.AVAJGNAL..l...");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "######################################################################################################################..aaaaaaaaaaaaaaaaaaaaaaaaaaaaa.....GNAL.AVAJGNAL..l..." + "'", str1, "######################################################################################################################..aaaaaaaaaaaaaaaaaaaaaaaaaaaaa.....GNAL.AVAJGNAL..l...");
    }

    @Test
    public void test41334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest82.test41334");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.strip("AAAAAAAAAAj#v##.#gnAAAAAAAAAAj#v##.#gnAAAAAAAAAAj#v##.#gnAAAAAAAAAAj#v##.#gnAAAAAAAAAAj#v##.#gnAAAAAAAAAAj#v##.#gnAAAAAAAAAAj#v##.#gnAAAAAAAAAAj#v##.#gnAAAAAAAAAAj#v##.#gnAAAAAAAAAAj#v##.#gnAAAAAAAAAAj#v##.#gnAAAAAAAAAAj#v##.#gnAAAAAAAAAAj#                                              AAAAAAAj#v##.#gnAAAAAAAAAAj#v##.#gnAAAAAAAAAAj#v##.#gnAAAAAAAAAAj#v##.#gnAAAAAAAAAAj#v##.#gnAAAAAAAAAAj#v##.#gnAAAAAAAAAAj#v##.#gnAAAAAAAAAAj#v##.#gnAAAAAAAAAAj#v##.#gnAAAAAAAAAAj#v##.#gnAAAAAAAAAAj#v##.#gnAAAAAAAAAAj#v##.#gnAAAAAAAAAAring", "serializabl...     java");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "AAAAAAAAAAj#v##.#gnAAAAAAAAAAj#v##.#gnAAAAAAAAAAj#v##.#gnAAAAAAAAAAj#v##.#gnAAAAAAAAAAj#v##.#gnAAAAAAAAAAj#v##.#gnAAAAAAAAAAj#v##.#gnAAAAAAAAAAj#v##.#gnAAAAAAAAAAj#v##.#gnAAAAAAAAAAj#v##.#gnAAAAAAAAAAj#v##.#gnAAAAAAAAAAj#v##.#gnAAAAAAAAAAj#                                              AAAAAAAj#v##.#gnAAAAAAAAAAj#v##.#gnAAAAAAAAAAj#v##.#gnAAAAAAAAAAj#v##.#gnAAAAAAAAAAj#v##.#gnAAAAAAAAAAj#v##.#gnAAAAAAAAAAj#v##.#gnAAAAAAAAAAj#v##.#gnAAAAAAAAAAj#v##.#gnAAAAAAAAAAj#v##.#gnAAAAAAAAAAj#v##.#gnAAAAAAAAAAj#v##.#gnAAAAAAAAAAring" + "'", str2, "AAAAAAAAAAj#v##.#gnAAAAAAAAAAj#v##.#gnAAAAAAAAAAj#v##.#gnAAAAAAAAAAj#v##.#gnAAAAAAAAAAj#v##.#gnAAAAAAAAAAj#v##.#gnAAAAAAAAAAj#v##.#gnAAAAAAAAAAj#v##.#gnAAAAAAAAAAj#v##.#gnAAAAAAAAAAj#v##.#gnAAAAAAAAAAj#v##.#gnAAAAAAAAAAj#v##.#gnAAAAAAAAAAj#                                              AAAAAAAj#v##.#gnAAAAAAAAAAj#v##.#gnAAAAAAAAAAj#v##.#gnAAAAAAAAAAj#v##.#gnAAAAAAAAAAj#v##.#gnAAAAAAAAAAj#v##.#gnAAAAAAAAAAj#v##.#gnAAAAAAAAAAj#v##.#gnAAAAAAAAAAj#v##.#gnAAAAAAAAAAj#v##.#gnAAAAAAAAAAj#v##.#gnAAAAAAAAAAj#v##.#gnAAAAAAAAAAring");
    }

    @Test
    public void test41335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest82.test41335");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.startsWith("gnirtS.gnal.avaj ssalcgnirtS.gnal.avaj ssalcgnirtS.gnal.avaj ssalcgnirtS.gnal.avaj ssalcgnirtS.gnal.avaj ssalcgnirtS.gnal.avaj ssalcgnirtS.gnal.avaj ssalcgnirtS.gnal.avaj ssalcgnirtS.gnal.avaj ssalcgnirtS.gnal.avaj ssalcgnirtS.gnal.avaj ssalcgnirtS.gnal.avaj ssalcgnirtS.gnal.avaj ssalcgnirtS.gnal.avaj ssalcgnirtS.gnal.avaj ssalcgnirtS.gnal.avaj ... .... .java.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.lang... .... .java.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.lang... .... .java.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.lang... .... .java.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.lang... .... .java.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.lang... .... .4444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444", "                                                                           ...       ....       .");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test41336() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest82.test41336");
        java.lang.String[] strArray2 = new java.lang.String[] { "                                   " };
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.getCommonPrefix(strArray2);
        int int4 = org.apache.commons.lang3.StringUtils.indexOfDifference((java.lang.CharSequence[]) strArray2);
        int int5 = org.apache.commons.lang3.StringUtils.lastIndexOfAny("...       ", strArray2);
        java.lang.String[] strArray7 = org.apache.commons.lang3.StringUtils.stripAll(strArray2, ".");
        java.lang.Class<?>[] wildcardClassArray8 = org.apache.commons.lang3.ClassUtils.toClass((java.lang.Object[]) strArray7);
        java.lang.Class<?>[] wildcardClassArray9 = org.apache.commons.lang3.ClassUtils.toClass((java.lang.Object[]) wildcardClassArray8);
        java.lang.Class<?>[] wildcardClassArray10 = null;
        java.lang.String[] strArray13 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("hi!", "");
        java.lang.String[] strArray15 = org.apache.commons.lang3.StringUtils.stripAll(strArray13, "$");
        java.lang.Class<?>[] wildcardClassArray16 = org.apache.commons.lang3.ClassUtils.toClass((java.lang.Object[]) strArray13);
        java.lang.Class<?>[] wildcardClassArray17 = org.apache.commons.lang3.ClassUtils.toClass((java.lang.Object[]) wildcardClassArray16);
        java.lang.Class<?>[] wildcardClassArray18 = org.apache.commons.lang3.ClassUtils.wrappersToPrimitives(wildcardClassArray17);
        boolean boolean19 = org.apache.commons.lang3.ClassUtils.isAssignable(wildcardClassArray10, wildcardClassArray18);
        boolean boolean20 = org.apache.commons.lang3.ClassUtils.isAssignable(wildcardClassArray9, wildcardClassArray18);
        java.lang.String str22 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) wildcardClassArray9, "$$$VA$LANGAVAJ$GNALJAVA$LANGAVAJ$GNALJAVA$LANGAVAJ$GNALJAVA$LANGAVAJ$GNALJAVA$LANGAVAJ$GNALJAVA$LANGgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalg");
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "                                   " + "'", str3, "                                   ");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertNotNull(wildcardClassArray8);
        org.junit.Assert.assertNotNull(wildcardClassArray9);
        org.junit.Assert.assertNotNull(strArray13);
        org.junit.Assert.assertNotNull(strArray15);
        org.junit.Assert.assertNotNull(wildcardClassArray16);
        org.junit.Assert.assertNotNull(wildcardClassArray17);
        org.junit.Assert.assertNotNull(wildcardClassArray18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "class java.lang.Class" + "'", str22, "class java.lang.Class");
    }

    @Test
    public void test41337() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest82.test41337");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("hi!", "");
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.stripAll(strArray2, "$");
        java.lang.Class<?>[] wildcardClassArray5 = org.apache.commons.lang3.ClassUtils.toClass((java.lang.Object[]) strArray2);
        java.lang.String[] strArray8 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("hi!", "");
        java.lang.String[] strArray10 = org.apache.commons.lang3.StringUtils.stripAll(strArray8, "$");
        java.lang.Class<?>[] wildcardClassArray11 = org.apache.commons.lang3.ClassUtils.toClass((java.lang.Object[]) strArray8);
        java.lang.Class<?> wildcardClass12 = null;
        java.lang.Class[] classArray14 = new java.lang.Class[1];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray15 = (java.lang.Class<?>[]) classArray14;
        wildcardClassArray15[0] = wildcardClass12;
        java.lang.Class<?>[] wildcardClassArray18 = org.apache.commons.lang3.ClassUtils.primitivesToWrappers(wildcardClassArray15);
        java.lang.String[] strArray20 = new java.lang.String[] { "                                   " };
        java.lang.String str21 = org.apache.commons.lang3.StringUtils.getCommonPrefix(strArray20);
        java.lang.Class<?>[] wildcardClassArray22 = org.apache.commons.lang3.ClassUtils.toClass((java.lang.Object[]) strArray20);
        java.lang.Class<?> wildcardClass23 = null;
        java.lang.Class[] classArray25 = new java.lang.Class[1];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray26 = (java.lang.Class<?>[]) classArray25;
        wildcardClassArray26[0] = wildcardClass23;
        java.lang.Class<?>[] wildcardClassArray29 = org.apache.commons.lang3.ClassUtils.primitivesToWrappers(wildcardClassArray26);
        boolean boolean30 = org.apache.commons.lang3.ClassUtils.isAssignable(wildcardClassArray22, wildcardClassArray26);
        boolean boolean32 = org.apache.commons.lang3.ClassUtils.isAssignable(wildcardClassArray15, wildcardClassArray26, true);
        boolean boolean34 = org.apache.commons.lang3.ClassUtils.isAssignable(wildcardClassArray11, wildcardClassArray26, false);
        java.lang.Class<?>[] wildcardClassArray35 = org.apache.commons.lang3.ClassUtils.primitivesToWrappers(wildcardClassArray11);
        boolean boolean36 = org.apache.commons.lang3.ClassUtils.isAssignable(wildcardClassArray5, wildcardClassArray35);
        java.lang.Class<?>[] wildcardClassArray37 = org.apache.commons.lang3.ClassUtils.wrappersToPrimitives(wildcardClassArray35);
        java.lang.String str39 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) wildcardClassArray37, '.');
        java.lang.Class<?>[] wildcardClassArray40 = org.apache.commons.lang3.ClassUtils.wrappersToPrimitives(wildcardClassArray37);
        java.lang.Class<?>[] wildcardClassArray41 = org.apache.commons.lang3.ClassUtils.wrappersToPrimitives(wildcardClassArray37);
        java.lang.Class<?>[] wildcardClassArray42 = org.apache.commons.lang3.ClassUtils.primitivesToWrappers(wildcardClassArray41);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertNotNull(wildcardClassArray5);
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertNotNull(strArray10);
        org.junit.Assert.assertNotNull(wildcardClassArray11);
        org.junit.Assert.assertNotNull(classArray14);
        org.junit.Assert.assertNotNull(wildcardClassArray15);
        org.junit.Assert.assertNotNull(wildcardClassArray18);
        org.junit.Assert.assertNotNull(strArray20);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "                                   " + "'", str21, "                                   ");
        org.junit.Assert.assertNotNull(wildcardClassArray22);
        org.junit.Assert.assertNotNull(classArray25);
        org.junit.Assert.assertNotNull(wildcardClassArray26);
        org.junit.Assert.assertNotNull(wildcardClassArray29);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertNotNull(wildcardClassArray35);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
        org.junit.Assert.assertNotNull(wildcardClassArray37);
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "" + "'", str39, "");
        org.junit.Assert.assertNotNull(wildcardClassArray40);
        org.junit.Assert.assertNotNull(wildcardClassArray41);
        org.junit.Assert.assertNotNull(wildcardClassArray42);
    }

    @Test
    public void test41338() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest82.test41338");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trimToNull("AAAAAAAAAAAAAAAAAAA                                                                                                                                              AAAAAAAAAAAAAAAAAAA                                                                                                                                              AAAAAAAAAAAAAAAAAAA                                                                                                                                              AAAAAAAAAAAAAAAAAAA                                                                                                                                              AAAAAAAAAAAAAAAAAAA                                                                                                                                              AAAAAAAAAAAAAAAAAAA      ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "AAAAAAAAAAAAAAAAAAA                                                                                                                                              AAAAAAAAAAAAAAAAAAA                                                                                                                                              AAAAAAAAAAAAAAAAAAA                                                                                                                                              AAAAAAAAAAAAAAAAAAA                                                                                                                                              AAAAAAAAAAAAAAAAAAA                                                                                                                                              AAAAAAAAAAAAAAAAAAA" + "'", str1, "AAAAAAAAAAAAAAAAAAA                                                                                                                                              AAAAAAAAAAAAAAAAAAA                                                                                                                                              AAAAAAAAAAAAAAAAAAA                                                                                                                                              AAAAAAAAAAAAAAAAAAA                                                                                                                                              AAAAAAAAAAAAAAAAAAA                                                                                                                                              AAAAAAAAAAAAAAAAAAA");
    }

    @Test
    public void test41339() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest82.test41339");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trimToEmpty("java.io.Serializableinterfacejava.lang.Cloneable..");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "java.io.Serializableinterfacejava.lang.Cloneable.." + "'", str1, "java.io.Serializableinterfacejava.lang.Cloneable..");
    }

    @Test
    public void test41340() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest82.test41340");
        int int3 = org.apache.commons.lang3.StringUtils.ordinalIndexOf("J#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#", "Aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaylist", (int) (byte) 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test41341() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest82.test41341");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.abbreviateMiddle("                                                 String                                                   ", "interface java.lang.cloneableinterface java.lang.cloneableinterface ja][sslC][sslCrChahacta][sslC][sslCinterface java.lang.cloneableinterface java.lang.cloneableinterface ja", 410);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "                                                 String                                                   " + "'", str3, "                                                 String                                                   ");
    }

    @Test
    public void test41342() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest82.test41342");
        java.lang.String str1 = org.apache.commons.lang3.ClassUtils.getShortClassName("gnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalLANGLANGLANGLANGLANGLANGLlituava                  ...                         $$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "                         .................................................................................................................................................................................................................................................................................................................................." + "'", str1, "                         ..................................................................................................................................................................................................................................................................................................................................");
    }

    @Test
    public void test41343() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest82.test41343");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripToEmpty("LUAVAJ                       GNALUAVAJ                       SSALCGNALAVAJavaj");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "LUAVAJ                       GNALUAVAJ                       SSALCGNALAVAJavaj" + "'", str1, "LUAVAJ                       GNALUAVAJ                       SSALCGNALAVAJavaj");
    }

    @Test
    public void test41344() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest82.test41344");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.center("javalgnal.avajgnal.avajgnal.avajgnal.avajgnal.avajgnal.avajgnal.avajgnal.avajgnal.avajgnal.aG.JAVAGNAL.AVAJLANG.J######################", 897, '#');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "#############################################################################################################################################################################################################################################################################################################################################################################################javalgnal.avajgnal.avajgnal.avajgnal.avajgnal.avajgnal.avajgnal.avajgnal.avajgnal.avajgnal.aG.JAVAGNAL.AVAJLANG.J###################################################################################################################################################################################################################################################################################################################################################################################################################" + "'", str3, "#############################################################################################################################################################################################################################################################################################################################################################################################javalgnal.avajgnal.avajgnal.avajgnal.avajgnal.avajgnal.avajgnal.avajgnal.avajgnal.avajgnal.aG.JAVAGNAL.AVAJLANG.J###################################################################################################################################################################################################################################################################################################################################################################################################################");
    }

    @Test
    public void test41345() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest82.test41345");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("                                                                              interface java.lang.cloneable...                                 interface java.io.serializable", "javajavajavajavajavajavajavajavajavajavajavajavajavajavajavajavajavajavajavajavajavajavajavajavajavajavajavajavajavajavajavajavajavajav");
        boolean boolean4 = org.apache.commons.lang3.StringUtils.endsWithAny("AAAAAA...1AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA...1AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA...1AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA...1AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA...1AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA", strArray3);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test41346() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest82.test41346");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "IRFcO.IRFIOsRaAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA", "$$$$$$$");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test41347() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest82.test41347");
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.replace("javal4.4agn", "java.lang.stringclass java.lang.stringclass java.lang.stringclas.lang.stringclass java.lang.stringc", "ARR... AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA... AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA... AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA... AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA... AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA... AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA... AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA... AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA... AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA..", 106);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "javal4.4agn" + "'", str4, "javal4.4agn");
    }

    @Test
    public void test41348() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest82.test41348");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBefore("GNALaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaagn                                            ", "vj.gnljv.lngvj.gnljv.lngvj.gnljv.lngvj.gnljv.lngvj.gnljv.lngvj.gnljv.lng");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "GNALaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaagn                                            " + "'", str2, "GNALaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaagn                                            ");
    }

    @Test
    public void test41349() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest82.test41349");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOf("", "CLASS JAVALANGCLASS                       JAVAULANG                       JAVAULANG                       JAVAULANG                       JAVAULANG                       JAVAULANG                       JAVAULANG                       JAVAULANG                       JAVAULANG                       JAVAULANG                       JAVAULANG                       JAVAULANG                       JAVAULANG                       JAVAULANG                       JAVAULANG                       JAVAULANG                       JAVAULANG                       JAVAULANG                       JAVAULANG                       JAVAULANG                       JAVAULANG");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test41350() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest82.test41350");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeStart("interface java.lang.Cloneableinterface java.io.SerializableetyBetyBetyBetyBetyBetyBetyBetyBetyBetyBetyBetyBetyBetyBetyBetyBetyBetyBetyBetyBetyBetyBetyBetyBetyBetyBetyBetyBetyBetyBetyBetyBetyBetyBetyBetyBetyBetyBetyBetyBetyBetyBetyBetyBetyBetyBetyBetyBetyBetyBetyBetyBetyetyBetyBetyBetyBetyBetyBetyBetyBetyBetyBetyBetyBetyBetyBetyBetyBetyBetyBetyBetyBetyBetyBetyBetyBetyBetyBetyBetyBetyBetyBetyBetyBetyBetyBetyBetyBetyBetyBetyBetyBetyBetyBetyBetyBetyBetyBetyBetyBetyBetyBetyBetyBetyB", "                                                                                                                                                                                                                                                                                                               ELBAZILAIREs");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "interface java.lang.Cloneableinterface java.io.SerializableetyBetyBetyBetyBetyBetyBetyBetyBetyBetyBetyBetyBetyBetyBetyBetyBetyBetyBetyBetyBetyBetyBetyBetyBetyBetyBetyBetyBetyBetyBetyBetyBetyBetyBetyBetyBetyBetyBetyBetyBetyBetyBetyBetyBetyBetyBetyBetyBetyBetyBetyBetyBetyetyBetyBetyBetyBetyBetyBetyBetyBetyBetyBetyBetyBetyBetyBetyBetyBetyBetyBetyBetyBetyBetyBetyBetyBetyBetyBetyBetyBetyBetyBetyBetyBetyBetyBetyBetyBetyBetyBetyBetyBetyBetyBetyBetyBetyBetyBetyBetyBetyBetyBetyBetyBetyB" + "'", str2, "interface java.lang.Cloneableinterface java.io.SerializableetyBetyBetyBetyBetyBetyBetyBetyBetyBetyBetyBetyBetyBetyBetyBetyBetyBetyBetyBetyBetyBetyBetyBetyBetyBetyBetyBetyBetyBetyBetyBetyBetyBetyBetyBetyBetyBetyBetyBetyBetyBetyBetyBetyBetyBetyBetyBetyBetyBetyBetyBetyBetyetyBetyBetyBetyBetyBetyBetyBetyBetyBetyBetyBetyBetyBetyBetyBetyBetyBetyBetyBetyBetyBetyBetyBetyBetyBetyBetyBetyBetyBetyBetyBetyBetyBetyBetyBetyBetyBetyBetyBetyBetyBetyBetyBetyBetyBetyBetyBetyBetyBetyBetyBetyBetyB");
    }

    @Test
    public void test41351() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest82.test41351");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.remove("gnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalLANGLANGLANGLANGLANGLANGLlituava", "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "gnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalLANGLANGLANGLANGLANGLANGLlituava" + "'", str2, "gnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalLANGLANGLANGLANGLANGLANGLlituava");
    }

    @Test
    public void test41352() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest82.test41352");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNumeric((java.lang.CharSequence) "LNu");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test41353() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest82.test41353");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "ERFACE JAVA.LANG.CLONEABLEJ#V#.L#NGJ#V#.L#NGJ#V#.L#NGJ#V#.L#NGJ#V#.L#NGJ#V#.L#NGJ#V#.L#NGJ#V#.L#NGJ#V#.L#NGJ#V#.L#NGJ#V#.L#NGJ#V#.L#NGJ#V#.L#NGJ#V#.L#NGJ#V#.L#NGJ#V#.L#NGJ#V#.L#NGJ#V#.L#NGJ#V#.L#NGJ#V#.L#NGJ#V#.L#NGJ#V#.L#NGJ#V#.L#NGJ#V#.L#NGJ#V#.L#NGJ#V#.L#NGJ#V#.L#NGJ#V#.L#NGJ#V#.L#NGJ#V#.L#NGJ#V#.L#NGJ#V#.L#NGJ#V#.L#NGINTERFACE JAVA.IO.SERIALIZABLE", "                                   ...");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 6 + "'", int2 == 6);
    }

    @Test
    public void test41354() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest82.test41354");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("                                                                                                                                                                             javaaaaaaaaaava.langava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.lang$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$                                                                                                                                                                                                                                                                                                ", '4');
        java.lang.String[] strArray5 = org.apache.commons.lang3.StringUtils.splitByCharacterTypeCamelCase("sERIA");
        java.lang.String[] strArray7 = org.apache.commons.lang3.StringUtils.stripAll(strArray5, "INTERFACE JAVA.LANG.cLONEABLEa RRR RRR RRR RRR RRR RRR RRR RRR RRR RRRINTERFACE JAVA.IO.sERIALIZABLE");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str8 = org.apache.commons.lang3.StringUtils.replaceEachRepeatedly("################################... AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA", strArray3, strArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Search and Replace array lengths don't match: 1 vs 2");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertNotNull(strArray7);
    }

    @Test
    public void test41355() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest82.test41355");
        java.lang.Class[] classArray1 = new java.lang.Class[0];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray2 = (java.lang.Class<?>[]) classArray1;
        java.lang.Class<?>[] wildcardClassArray3 = org.apache.commons.lang3.ClassUtils.primitivesToWrappers(wildcardClassArray2);
        java.lang.String str5 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) wildcardClassArray3, "...                                 ");
        java.lang.String[] strArray8 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("hi!", "");
        java.lang.String[] strArray10 = org.apache.commons.lang3.StringUtils.stripAll(strArray8, "$");
        java.lang.Class<?>[] wildcardClassArray11 = org.apache.commons.lang3.ClassUtils.toClass((java.lang.Object[]) strArray8);
        java.lang.Class<?> wildcardClass12 = null;
        java.lang.Class[] classArray14 = new java.lang.Class[1];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray15 = (java.lang.Class<?>[]) classArray14;
        wildcardClassArray15[0] = wildcardClass12;
        java.lang.Class<?>[] wildcardClassArray18 = org.apache.commons.lang3.ClassUtils.primitivesToWrappers(wildcardClassArray15);
        java.lang.String[] strArray20 = new java.lang.String[] { "                                   " };
        java.lang.String str21 = org.apache.commons.lang3.StringUtils.getCommonPrefix(strArray20);
        java.lang.Class<?>[] wildcardClassArray22 = org.apache.commons.lang3.ClassUtils.toClass((java.lang.Object[]) strArray20);
        java.lang.Class<?> wildcardClass23 = null;
        java.lang.Class[] classArray25 = new java.lang.Class[1];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray26 = (java.lang.Class<?>[]) classArray25;
        wildcardClassArray26[0] = wildcardClass23;
        java.lang.Class<?>[] wildcardClassArray29 = org.apache.commons.lang3.ClassUtils.primitivesToWrappers(wildcardClassArray26);
        boolean boolean30 = org.apache.commons.lang3.ClassUtils.isAssignable(wildcardClassArray22, wildcardClassArray26);
        boolean boolean32 = org.apache.commons.lang3.ClassUtils.isAssignable(wildcardClassArray15, wildcardClassArray26, true);
        boolean boolean34 = org.apache.commons.lang3.ClassUtils.isAssignable(wildcardClassArray11, wildcardClassArray26, false);
        java.lang.String str38 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) wildcardClassArray26, '#', (int) ' ', 10);
        java.lang.Class<?>[] wildcardClassArray39 = org.apache.commons.lang3.ClassUtils.primitivesToWrappers(wildcardClassArray26);
        java.lang.Class<?> wildcardClass40 = null;
        java.lang.Class[] classArray42 = new java.lang.Class[1];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray43 = (java.lang.Class<?>[]) classArray42;
        wildcardClassArray43[0] = wildcardClass40;
        java.lang.Class<?>[] wildcardClassArray46 = org.apache.commons.lang3.ClassUtils.primitivesToWrappers(wildcardClassArray43);
        java.lang.Class<?> wildcardClass47 = null;
        java.lang.Class[] classArray49 = new java.lang.Class[1];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray50 = (java.lang.Class<?>[]) classArray49;
        wildcardClassArray50[0] = wildcardClass47;
        java.lang.Class<?>[] wildcardClassArray53 = org.apache.commons.lang3.ClassUtils.primitivesToWrappers(wildcardClassArray50);
        java.lang.String[] strArray55 = new java.lang.String[] { "                                   " };
        java.lang.String str56 = org.apache.commons.lang3.StringUtils.getCommonPrefix(strArray55);
        java.lang.Class<?>[] wildcardClassArray57 = org.apache.commons.lang3.ClassUtils.toClass((java.lang.Object[]) strArray55);
        java.lang.Class<?> wildcardClass58 = null;
        java.lang.Class[] classArray60 = new java.lang.Class[1];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray61 = (java.lang.Class<?>[]) classArray60;
        wildcardClassArray61[0] = wildcardClass58;
        java.lang.Class<?>[] wildcardClassArray64 = org.apache.commons.lang3.ClassUtils.primitivesToWrappers(wildcardClassArray61);
        boolean boolean65 = org.apache.commons.lang3.ClassUtils.isAssignable(wildcardClassArray57, wildcardClassArray61);
        boolean boolean67 = org.apache.commons.lang3.ClassUtils.isAssignable(wildcardClassArray50, wildcardClassArray61, true);
        boolean boolean69 = org.apache.commons.lang3.ClassUtils.isAssignable(wildcardClassArray46, wildcardClassArray61, true);
        boolean boolean71 = org.apache.commons.lang3.ClassUtils.isAssignable(wildcardClassArray39, wildcardClassArray46, true);
        boolean boolean73 = org.apache.commons.lang3.ClassUtils.isAssignable(wildcardClassArray3, wildcardClassArray46, false);
        java.lang.String str77 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) wildcardClassArray46, "                                                                                          gnal.avaj ", 2, (int) (short) -1);
        java.lang.String str79 = org.apache.commons.lang3.ClassUtils.getPackageCanonicalName((java.lang.Object) wildcardClassArray46, "                                  Arrclass java.lang.ObjectyList                                   ");
        org.junit.Assert.assertNotNull(classArray1);
        org.junit.Assert.assertNotNull(wildcardClassArray2);
        org.junit.Assert.assertNotNull(wildcardClassArray3);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertNotNull(strArray10);
        org.junit.Assert.assertNotNull(wildcardClassArray11);
        org.junit.Assert.assertNotNull(classArray14);
        org.junit.Assert.assertNotNull(wildcardClassArray15);
        org.junit.Assert.assertNotNull(wildcardClassArray18);
        org.junit.Assert.assertNotNull(strArray20);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "                                   " + "'", str21, "                                   ");
        org.junit.Assert.assertNotNull(wildcardClassArray22);
        org.junit.Assert.assertNotNull(classArray25);
        org.junit.Assert.assertNotNull(wildcardClassArray26);
        org.junit.Assert.assertNotNull(wildcardClassArray29);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "" + "'", str38, "");
        org.junit.Assert.assertNotNull(wildcardClassArray39);
        org.junit.Assert.assertNotNull(classArray42);
        org.junit.Assert.assertNotNull(wildcardClassArray43);
        org.junit.Assert.assertNotNull(wildcardClassArray46);
        org.junit.Assert.assertNotNull(classArray49);
        org.junit.Assert.assertNotNull(wildcardClassArray50);
        org.junit.Assert.assertNotNull(wildcardClassArray53);
        org.junit.Assert.assertNotNull(strArray55);
        org.junit.Assert.assertEquals("'" + str56 + "' != '" + "                                   " + "'", str56, "                                   ");
        org.junit.Assert.assertNotNull(wildcardClassArray57);
        org.junit.Assert.assertNotNull(classArray60);
        org.junit.Assert.assertNotNull(wildcardClassArray61);
        org.junit.Assert.assertNotNull(wildcardClassArray64);
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + false + "'", boolean65 == false);
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + false + "'", boolean67 == false);
        org.junit.Assert.assertTrue("'" + boolean69 + "' != '" + false + "'", boolean69 == false);
        org.junit.Assert.assertTrue("'" + boolean71 + "' != '" + false + "'", boolean71 == false);
        org.junit.Assert.assertTrue("'" + boolean73 + "' != '" + false + "'", boolean73 == false);
        org.junit.Assert.assertEquals("'" + str77 + "' != '" + "" + "'", str77, "");
        org.junit.Assert.assertEquals("'" + str79 + "' != '" + "java.lang" + "'", str79, "java.lang");
    }

    @Test
    public void test41356() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest82.test41356");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.mid("                                                                                                                                                                                                                                                                    JAVAlLANGJ", 824, 45);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test41357() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest82.test41357");
        java.lang.String str2 = org.apache.commons.lang3.ClassUtils.getPackageCanonicalName((java.lang.Object) "...                                                                                                                                                      ", "hi!                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                   ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "java.lang" + "'", str2, "java.lang");
    }

    @Test
    public void test41358() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest82.test41358");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.split("stArrayListArrayListavaj.gnalArrayListArrayListArrayListavaj.gnalArrayListArrayLis", ' ');
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test41359() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest82.test41359");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("########################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################SILYARRA!IH$$$$$$$$", "-1String[.VJ.VJ.VJ.VJ.VJ.VJ.V");
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test41360() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest82.test41360");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trimToNull("aaaaaaaaaaNGA.LAVAJaaaaaaaaaaNGA.LAVAJaaaaaaaaaaNGA.LAVAJaaaaaaaaaaNGA.LAVAJaaaaaaaaaaNGA.LAVAJaaaaaaaaaaNGA.LAVAJaaaaaaaaaaNGA.LAVAJaaaaaaaaaaNGA.LAVAJaaaaaaaaaaNGA.LAVAJaaaaaaaaaaNGA.LAVAJaaaaaaaaaaNGA.LAVAJaaaaaaaaaaNGA.LAVAJaaaaaaaaaaNGA.LAVAJaaaaaaaaaaNGA.LAVAJaaaaaaaaaaNGA.LAVAJaaaaaaaaaaNGA.LAVAJaaaaaaaaaaNGA.LAVAJaaaaaaaaaaNGA.LAVAJaaaaaaaaaaNGA.LAVAJaaaaaaaaaaNGA.LAVAJaaaaaaaaaaNGA.LAVAJaaaaaaaaaaNGA.LAVAJaaaaaaaaaaNGA.LAVAJaaaaaaaaaaNGA.LAVAJaaaaaaaaaaNGA.LAVAJaaaaaaaaaaNGA.LAVAJaaaaaaaaaaNGA.LAVAJaaaaaaaaaaNGA.LAVAJaaaaaaaaaaNGA.LAVAJaaaaaaaaaaNGA.LAVAJaaaaaaaaaaNGA.LAVAJaaaaaaaaaaNGA.LAVAJaaaaaaaaaaNGA.LAVAJaaaaaaaaaaNGA.LAVAJaaaaaaaaaaNGA.LAVAJaaaaaaaaaa                                                                                                                                                                                                                                                                         ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "aaaaaaaaaaNGA.LAVAJaaaaaaaaaaNGA.LAVAJaaaaaaaaaaNGA.LAVAJaaaaaaaaaaNGA.LAVAJaaaaaaaaaaNGA.LAVAJaaaaaaaaaaNGA.LAVAJaaaaaaaaaaNGA.LAVAJaaaaaaaaaaNGA.LAVAJaaaaaaaaaaNGA.LAVAJaaaaaaaaaaNGA.LAVAJaaaaaaaaaaNGA.LAVAJaaaaaaaaaaNGA.LAVAJaaaaaaaaaaNGA.LAVAJaaaaaaaaaaNGA.LAVAJaaaaaaaaaaNGA.LAVAJaaaaaaaaaaNGA.LAVAJaaaaaaaaaaNGA.LAVAJaaaaaaaaaaNGA.LAVAJaaaaaaaaaaNGA.LAVAJaaaaaaaaaaNGA.LAVAJaaaaaaaaaaNGA.LAVAJaaaaaaaaaaNGA.LAVAJaaaaaaaaaaNGA.LAVAJaaaaaaaaaaNGA.LAVAJaaaaaaaaaaNGA.LAVAJaaaaaaaaaaNGA.LAVAJaaaaaaaaaaNGA.LAVAJaaaaaaaaaaNGA.LAVAJaaaaaaaaaaNGA.LAVAJaaaaaaaaaaNGA.LAVAJaaaaaaaaaaNGA.LAVAJaaaaaaaaaaNGA.LAVAJaaaaaaaaaaNGA.LAVAJaaaaaaaaaaNGA.LAVAJaaaaaaaaaaNGA.LAVAJaaaaaaaaaa" + "'", str1, "aaaaaaaaaaNGA.LAVAJaaaaaaaaaaNGA.LAVAJaaaaaaaaaaNGA.LAVAJaaaaaaaaaaNGA.LAVAJaaaaaaaaaaNGA.LAVAJaaaaaaaaaaNGA.LAVAJaaaaaaaaaaNGA.LAVAJaaaaaaaaaaNGA.LAVAJaaaaaaaaaaNGA.LAVAJaaaaaaaaaaNGA.LAVAJaaaaaaaaaaNGA.LAVAJaaaaaaaaaaNGA.LAVAJaaaaaaaaaaNGA.LAVAJaaaaaaaaaaNGA.LAVAJaaaaaaaaaaNGA.LAVAJaaaaaaaaaaNGA.LAVAJaaaaaaaaaaNGA.LAVAJaaaaaaaaaaNGA.LAVAJaaaaaaaaaaNGA.LAVAJaaaaaaaaaaNGA.LAVAJaaaaaaaaaaNGA.LAVAJaaaaaaaaaaNGA.LAVAJaaaaaaaaaaNGA.LAVAJaaaaaaaaaaNGA.LAVAJaaaaaaaaaaNGA.LAVAJaaaaaaaaaaNGA.LAVAJaaaaaaaaaaNGA.LAVAJaaaaaaaaaaNGA.LAVAJaaaaaaaaaaNGA.LAVAJaaaaaaaaaaNGA.LAVAJaaaaaaaaaaNGA.LAVAJaaaaaaaaaaNGA.LAVAJaaaaaaaaaaNGA.LAVAJaaaaaaaaaaNGA.LAVAJaaaaaaaaaaNGA.LAVAJaaaaaaaaaa");
    }

    @Test
    public void test41361() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest82.test41361");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBefore("..........................................................................................                                                                                                           ", "                       REGETNI                      ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "..........................................................................................                                                                                                           " + "'", str2, "..........................................................................................                                                                                                           ");
    }

    @Test
    public void test41362() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest82.test41362");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripAccents((java.lang.CharSequence) "class [Ljava.lang.Class;class [Ljava.lang.Class;class [Ljava.lang.Class;class [Ljava.lang.Class;");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "class [Ljava.lang.Class;class [Ljava.lang.Class;class [Ljava.lang.Class;class [Ljava.lang.Class;" + "'", str1, "class [Ljava.lang.Class;class [Ljava.lang.Class;class [Ljava.lang.Class;class [Ljava.lang.Class;");
    }

    @Test
    public void test41363() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest82.test41363");
        java.lang.CharSequence charSequence1 = null;
        char[] charArray11 = new char[] { ' ', ' ', '#', 'a', '4', 'a' };
        int int12 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "", charArray11);
        boolean boolean13 = org.apache.commons.lang3.StringUtils.containsAny("$", charArray11);
        java.lang.String str15 = org.apache.commons.lang3.ClassUtils.getPackageCanonicalName((java.lang.Object) charArray11, "class java.lang.String");
        boolean boolean16 = org.apache.commons.lang3.StringUtils.containsAny("AVAJ.GNALNaaaaaaaaaaJAVAL.AGNaaaaaaaaaaJAVAL.AGNaaaaaaaaaaJAVAL.AGNaaaaaaaaaaJAVAL.AGNaaaaaaaaaaJAVAL.AGNaaaaaaaaaaJAVAL.AGNaaaaaaaaaaJAVAL.AGNaaaaaaaaaaJAVAL.AGNaaaaaaaaaaJAVAL.AGNaaaaaaaaaaJAVAL.AGNaaaaaaaaaaJAVAL.AGNaaaaaaaaaaJAVAL.AGNaaaaaaaaaaJAVAL.AGNaaaaaaaaaaJAVAL.AGNaaaaaaaaaaJAVAL.AGNaaaaaaaaaaJAVAL.AGNaaaaaaaaaaJAVAL.AGNaaaaaaaaaaJAVAL.AGNaaaaaaaaaaJAVAL.AGNaaaaaaaaaaJAVAL.AGNaaaaaaaaaaJAVAL.AGNaaaaaaaaaaJAVAL.AGNaaaaaaaaaaJAVAL.AGNaaaaaaaaaaJAVAL.AGNaaaaaaaaaaJAVAL.AGNaaaaaaaaaaJAVAL.AGNaaaaaaaaaaJAVAL.AGNaaaaaaaaaaJAVAL.AGNaaaaaaaaaaJAVAL.AGNaaaaaaaaaaJAVAL.AGNaaaaaaaaaaJAVAL.AGNaaaaaaaaaaJAVAL.AGNaaaaaaaaaaJAVAL.AGNaaaaaaaaaaJAVAL", charArray11);
        boolean boolean17 = org.apache.commons.lang3.StringUtils.containsOnly(charSequence1, charArray11);
        int int18 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "aRRAYlISTaRRAYlISTaRRAYlISTAVAJgnal", charArray11);
        org.junit.Assert.assertNotNull(charArray11);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray11), "  #a4a");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray11), "  #a4a");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray11), "[ ,  , #, a, 4, a]");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
    }

    @Test
    public void test41364() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest82.test41364");
        java.util.Locale locale1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.apache.commons.lang3.StringUtils.lowerCase("hi!", locale1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test41365() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest82.test41365");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.lowerCase("JAVA.IO.SERIALIZABLE INTERFACE JAVA.LANG.CLONEABLE... INTERFAC");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "java.io.serializable interface java.lang.cloneable... interfac" + "'", str1, "java.io.serializable interface java.lang.cloneable... interfac");
    }

    @Test
    public void test41366() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest82.test41366");
        int int2 = org.apache.commons.lang3.StringUtils.indexOf("ARJAVAARR", "j v .io.Seri liz blej v .l ng.Clone bleStringinterf ceinterf ce");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test41367() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest82.test41367");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("Coebe$iterfce ioSeriizbe", '$');
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test41368() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest82.test41368");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.startsWith("interface java.lang.Cloneable4iGNIRTinterface java.lang.Cloneable4i", "elbazilaireS.oi.agagecafretnignirAAAAAAAAAAnga.lagagAAAAAAAAAAnga.lagagAAAAAAAAAAnga.lagagAAAAAAAAAAnga.lagagAAAAAAAAAAnga.lagagAAAAAAAAAAnga.lagagAAAAAAAAAAnga.lagagAAAAAAAAAAnga.lagagAAAAAAAAAAnga.lagagAAAAAAAAAAnga.lagagAAAAAAAAAAnga.lagagAAAAAAAAAAnga.lagagAAAAAAAAAAnga.lagagAAAAAAAAAAnga.lagagAAAAAAAAAAnga.lagagAAAAAAAAAAnga.lagagAAAAAAAAAAnga.lagagAAAAAAAAAAnga.lagagAAAAAAAAAAnga.lagagAAAAAAAAAAnga.lagagAAAAAAAAAAnga.lagagAAAAAAAAAAnga.lagagAAAAAAAAAAnga.lagagAAAAAAAAAAnga.lagagAAAAAAAAAAnga.lagagAAAAAAAAAAnga.lagagAAAAAAAAAAnga.lagagAAAAAAAAAAnga.lagagAAAAAAAAAAnga.lagagAAAAAAAAAAnga.lagagAAAAAAAAAAnga.lagagAAAAAAAAAAnga.lagagAAAAAAAAAAnga.lagagAAAAAAAAAAnga.lagagAAAAAAAAAAnga.lagagAAAAAAAAAAelbaenolC.gnal.agagecafretni");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test41369() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest82.test41369");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.chop("rLLryLiyyALLryLiyyALLryLiyyrrrALrAriiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiii");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "rLLryLiyyALLryLiyyALLryLiyyrrrALrAriiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiii" + "'", str1, "rLLryLiyyALLryLiyyALLryLiyyrrrALrAriiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiii");
    }

    @Test
    public void test41370() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest82.test41370");
        java.lang.CharSequence charSequence0 = null;
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsNone(charSequence0, "                                                                                                                                                                                                                                                interfacejava.lang.Cloneable4iGNIRTinterfacejava.lang.Cloneable4i                                                                                                                                                                                                                                                ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test41371() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest82.test41371");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAllUpperCase((java.lang.CharSequence) "tsilyrrgnluvj                       tsilyrrgnluvj");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test41372() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest82.test41372");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitByCharacterType("GNALAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAACharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterChara");
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test41373() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest82.test41373");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNumeric((java.lang.CharSequence) "cLASSJAVA.LANG.cLASSjavaulangjavaulangjavaulangjavaulangjavaulangjavaulangjavaulangjavaulangjavaulangjavaulangjavaulangjavaulangjavaulangjavaulangjavaulangjavaulangjavaulangjavaulangjavaulangjavaulang");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test41374() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest82.test41374");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringAfterLast("444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444", "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test41375() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest82.test41375");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsAny("sTRINGg.g.g.g.g.g.g.g.g.g.g.g.g.g.g.g.g.g.AVAJ.GNALAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAIRFCO$IRFIOSRA..AYL A.444444444444444444444444444g.g.g.g.g.g.gg.g.g.g.g.g.g.g.g.g.g.g.g.g.g.g.g.g.AVAJ.GNALAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAIRFCO$IRFIOSRA..AYL A.444444444444444444444444444g.g.g.g.g.g.gg.g.g.g.g.g.g.g.g.g.g.g.g.g.g.g.g.g.AVAJ.GNALAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAIRFCO$IRFIOSRA..AYL A.444444444444444444444444444g.g.g.g.g.g.gg.g.g.g.g.g.g.g.g.g.g.g.g.g.g.g.g.g.AVAJ.GNALAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAIRFCO$IRFIOSRA..AYL A.444444444444444444444444444g.g.g.g.g.g.gg.g.g.g.g.g.g.g.g.g.g.g.g.g.g.g.g.g.AVAJ.GNALAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAIRFCO$IRFIOSRA..AYL A.444444444444444444444444444g.g.g.g.g.g.gg.g.g.g.g.g.g.g.g.g.g.g.g.g.g.g.g.g.AVAJ.GNALAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAIRFCO$IRFIOSRA..AYL A.444444444444444444444444444g.g.g.g.g.g.gg.g.g.g.g.g.g.g.g.g.g.g.g.g.g.g.g.g.AVAJ.GNALAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAIRFCO$IRFIOSRA..AYL A.444", "ARRAYLISTARRAYLISTARRAYLISTAVAJGNAL.AVAJLANG.JAVAGNAL.AVAJLANG.JAVAGNAL.AVAJLANG.JAVAGNAL.AVAJLANG.JAVAGNAL.AVAJLANG.JAVAGNAL.AVAJLANG.JAVAGNAL.AVAJLANG.JAVAGNAL.AVAJLANG.JAVAGNAL.AVAJGNAL                                                    ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test41376() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest82.test41376");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.left("lutilutilutilutilutil####lutilutilutilutilutilylistarraylistarrayylistarraylistarrayylistarraylistarrayylistarraylistarrayylistarraylistarrayylistarraylistarrayylistarraylistarrayylistarraylistarrayylistarraylistarrayylistarraylistarrayylistarraylistarrayylistarraylistarrayylistarraylistarrayylistarraylistarrayylistarraylistarrayylistarraylistarrayylistarraylistarrayylistarraylistarrayylistarraylistarrayylistarraylistarrayylistarraylistarrayylistarraylistarrayylistarraylistarrayylistarraylistarrayylistarraylistarrayylistarraylistarrayylistarraylistarrayylistarraylistarrayylistarraylistarrayylistarraylistarrayylistarraylistarrayylistarraylistarrayylistarraylistarrayylistarraylistarrayylistarraylistarrayylistarraylistarrayylistarraylistarrayylistarraylistarrayylistarraylistarrayylistarraylistarrayylistarraylistarrayylistarraylistarrayylistarraylistarrayylistarraylistarrayylistarraylistarrayylistarraylistarrayylistarraylistarrayylistarraylista", 73);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "lutilutilutilutilutil####lutilutilutilutilutilylistarraylistarrayylistarr" + "'", str2, "lutilutilutilutilutil####lutilutilutilutilutilylistarraylistarrayylistarr");
    }

    @Test
    public void test41377() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest82.test41377");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("Javaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa$       ", "                                                                                                                                                                                                                                                                                                                                                                                                                                                            ", 44);
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void test41378() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest82.test41378");
        java.lang.CharSequence charSequence0 = null;
        char[] charArray3 = new char[] {};
        int int4 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "$       ", charArray3);
        int int5 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "JAVA..........JAVA..........JAVA...", charArray3);
        int int6 = org.apache.commons.lang3.StringUtils.indexOfAnyBut(charSequence0, charArray3);
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray3), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray3), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray3), "[]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
    }

    @Test
    public void test41379() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest82.test41379");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.containsWhitespace("$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$ $ $ $ $ $ $ $ $ $ $ $ $ $ $ $ $ $ $ $ $ $ $ siLyarrA!iH$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test41380() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest82.test41380");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphaSpace((java.lang.CharSequence) "irfCo$irfioSrA..ayL.A.444444444444444444444444444");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test41381() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest82.test41381");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.stripStart(".lang.Stringclass j..", "                                                                             se...                                                                             ..........");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "lang.Stringclass j.." + "'", str2, "lang.Stringclass j..");
    }

    @Test
    public void test41382() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest82.test41382");
        java.lang.Object obj0 = null;
        java.lang.String str2 = org.apache.commons.lang3.ClassUtils.getShortClassName(obj0, "a.lang.cloneablestringinterface java.io                          a.lang.cloneablestringinterface java.io                          a.lang.cloneablestringinterface java.io                          a.lang.cloneablestringinterface java.io                          a.lang.cloneablestringinterface java.io                          a.lang.cloneablestringinterface java.io                          a.lang.cloneablestringinterface java.io                          a.lang.cloneablestringinterface java.io                          a.lang.cloneablestringinterface java.io                          a.lang.cloneablestringinterface java.io                          ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "a.lang.cloneablestringinterface java.io                          a.lang.cloneablestringinterface java.io                          a.lang.cloneablestringinterface java.io                          a.lang.cloneablestringinterface java.io                          a.lang.cloneablestringinterface java.io                          a.lang.cloneablestringinterface java.io                          a.lang.cloneablestringinterface java.io                          a.lang.cloneablestringinterface java.io                          a.lang.cloneablestringinterface java.io                          a.lang.cloneablestringinterface java.io                          " + "'", str2, "a.lang.cloneablestringinterface java.io                          a.lang.cloneablestringinterface java.io                          a.lang.cloneablestringinterface java.io                          a.lang.cloneablestringinterface java.io                          a.lang.cloneablestringinterface java.io                          a.lang.cloneablestringinterface java.io                          a.lang.cloneablestringinterface java.io                          a.lang.cloneablestringinterface java.io                          a.lang.cloneablestringinterface java.io                          a.lang.cloneablestringinterface java.io                          ");
    }

    @Test
    public void test41383() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest82.test41383");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.split("interface java.lang.Cloneableinterface java.io.SerializableetyBetyBetyBetyBetyBetyBetyBetyBetyBetyBetyBetyBetyBetyBetyBetyBetyBetyBetyBetyBetyBetyBetyBetyBetyBetyBetyBetyBetyBetyBetyBetyBetyBetyBetyBetyBetyBetyBetyBetyBetyBetyBetyBetyBetyBetyBetyBetyBetyBetyBetyBetyBetyetyBetyBetyBetyBetyBetyBetyBetyBetyBetyBetyBetyBetyBetyBetyBetyBetyBetyBetyBetyBetyBetyBetyBetyBetyBetyBetyBetyBetyBetyBetyBetyBetyBetyBetyBetyBetyBetyBetyBetyBetyBetyBetyBetyBetyBetyBetyBetyBetyBetyBetyBetyBetyB");
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test41384() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest82.test41384");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeStart("$rr$ylis...v$.l$ng$v$j.gn$lj$v$.l$ng$v$j.gn$lj$v$.l$ng$v$j.gn$lj$v$.l$ng$v$j.gn$lj$v$.l$ng$v$j.gn$lj$v$.l$ng", "                A..AYL A.44444444444444444444444444                                                 javalgnal.avajgnal.avajgnal.avajgnal.avajgnal.avajgnal.avajgnal.avajgnal.avajgnal.avajgnal.aG.JAVAGNAL.AVAJLANG.J######################");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "$rr$ylis...v$.l$ng$v$j.gn$lj$v$.l$ng$v$j.gn$lj$v$.l$ng$v$j.gn$lj$v$.l$ng$v$j.gn$lj$v$.l$ng$v$j.gn$lj$v$.l$ng" + "'", str2, "$rr$ylis...v$.l$ng$v$j.gn$lj$v$.l$ng$v$j.gn$lj$v$.l$ng$v$j.gn$lj$v$.l$ng$v$j.gn$lj$v$.l$ng$v$j.gn$lj$v$.l$ng");
    }

    @Test
    public void test41385() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest82.test41385");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.substringBetween("444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444LITU.AVAJLITU.AVAJ", "$$$$$$$$$$$$$$$$$$$$$$$$$$$$$...                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                               ", "  $         $         $         $         $         $         $         $         $         $         $         $ ...");
        org.junit.Assert.assertNull(str3);
    }

    @Test
    public void test41386() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest82.test41386");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripToNull("java.");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "java." + "'", str1, "java.");
    }

    @Test
    public void test41387() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest82.test41387");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBetween("][GNIRTSLITU.AVAJ1", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa                                              ][gnirtslitu.avaj1-                                                                                                                                                              ");
        org.junit.Assert.assertNull(str2);
    }

    @Test
    public void test41388() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest82.test41388");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isEmpty((java.lang.CharSequence) "u.......................................................................................................................................................................................................................................................................................................Java.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava..............................................................................................................................................................................................................................................................................................................................................................................................................");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test41389() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest82.test41389");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trim("                                                                                                                                                                                  gnirtSlitu.avaj1-gnirtSlitu.avaj1-                                                                                                                                                                                  ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "gnirtSlitu.avaj1-gnirtSlitu.avaj1-" + "'", str1, "gnirtSlitu.avaj1-gnirtSlitu.avaj1-");
    }

    @Test
    public void test41390() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest82.test41390");
        java.lang.ClassLoader classLoader0 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass2 = org.apache.commons.lang3.ClassUtils.getClass(classLoader0, "SirtSirtSirtSirtSirtSirtSirtSirtSirtSirtSstring.nal.avajecafretnistring.nal.avajecafretnistring.nal.avajecafretnistring.nal.avajecafretnistring.nal.avajecafretnistring.nal.avajecafretnistring.nal.avajecafretnistring.nal.avajecafretnistring.nal.avajecafretnistring.nal.avajecafretnistring.nal.avajecafretnistring.nal.avajecafretnistring.nal.avajecafretnistring.nal.avajecafretnistring.nal.avajecafretnistring.nal.avajecafretnistring.nal.avajecafretnistring.nal.avajecafretnistring.nal.avajecafretnistring.nal.avajecafretnistring.nal.avajecafretnistring.nal.avajecafretnistring.nal.avajecafretnistring.nal.avajecafretnistring.nal.avajecafretnistring.nal.avajecafretnistring.nal.avajecafretn");
            org.junit.Assert.fail("Expected exception of type java.lang.ClassNotFoundException; message: SirtSirtSirtSirtSirtSirtSirtSirtSirtSirtSstring/nal/avajecafretnistring/nal/avajecafretnistring/nal/avajecafretnistring/nal/avajecafretnistring/nal/avajecafretnistring/nal/avajecafretnistring/nal/avajecafretnistring/nal/avajecafretnistring/nal/avajecafretnistring/nal/avajecafretnistring/nal/avajecafretnistring/nal/avajecafretnistring/nal/avajecafretnistring/nal/avajecafretnistring/nal/avajecafretnistring/nal/avajecafretnistring/nal/avajecafretnistring/nal/avajecafretnistring/nal/avajecafretnistring/nal/avajecafretnistring/nal/avajecafretnistring/nal/avajecafretnistring/nal/avajecafretnistring/nal/avajecafretnistring/nal/avajecafretnistring/nal/avajecafretnistring/nal/avajecafretn");
        } catch (java.lang.ClassNotFoundException e) {
            // Expected exception.
        }
    }

    @Test
    public void test41391() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest82.test41391");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.leftPad("NG.CLASSjava.langAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAulangGNAL.AVAJLANG.CLASSjava.langAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAulangGNAL.AVAJLANG.CLASSjava.langAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAulangGNAL.AVAJLANG.CLASSjava.langAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAulangGNAL.AVAJLANG.CLASSjava.langAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAulangGNAL.AVAJLANG.CLASSjava.langAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAulangGNAL.AVAJLANG.GNALELBAENOLC.GNAL", 151, '#');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "NG.CLASSjava.langAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAulangGNAL.AVAJLANG.CLASSjava.langAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAulangGNAL.AVAJLANG.CLASSjava.langAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAulangGNAL.AVAJLANG.CLASSjava.langAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAulangGNAL.AVAJLANG.CLASSjava.langAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAulangGNAL.AVAJLANG.CLASSjava.langAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAulangGNAL.AVAJLANG.GNALELBAENOLC.GNAL" + "'", str3, "NG.CLASSjava.langAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAulangGNAL.AVAJLANG.CLASSjava.langAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAulangGNAL.AVAJLANG.CLASSjava.langAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAulangGNAL.AVAJLANG.CLASSjava.langAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAulangGNAL.AVAJLANG.CLASSjava.langAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAulangGNAL.AVAJLANG.CLASSjava.langAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAulangGNAL.AVAJLANG.GNALELBAENOLC.GNAL");
    }

    @Test
    public void test41392() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest82.test41392");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("rrayList", "JAVA.LANG");
        java.lang.String str4 = org.apache.commons.lang3.ClassUtils.getPackageCanonicalName((java.lang.Object) strArray2, "$ArrayList");
        java.lang.String str6 = org.apache.commons.lang3.ClassUtils.getPackageName((java.lang.Object) strArray2, "Gnal                                                                1AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA");
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "java.lang" + "'", str4, "java.lang");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "java.lang" + "'", str6, "java.lang");
    }

    @Test
    public void test41393() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest82.test41393");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.startsWithIgnoreCase("interface java.lang.Cloneablegnal.avajgnal..LANGgnal.avajgnal.interface java.io.Serializabl", "avajvv4yL444vv4yL444vv4yL444vv4yL444vv4yL444vv4yL444vv4yL444vv4yL444vv4yL444vv4yL444vv4yL444vv4yL444vv4yL444vv4yL444vv4yL444vv4yL444vv4yL444vv4yL444vv4yL444vv4yL444vv4yL444vv4yL444vv4yL444vv4yL444vv4yL444vv4yL444vv4yL444vv4yL444vv4yL444vv4yL444vv4yL444vv4yL444vv4yL444vv4yL444vv4yL444vv4yL444vv4yL444vv4yL444vv4yL444vv4yL444vv4yL444vv4yL444vv4yL444vv4yL444vv4yL444vv4yL444vv4yL444vv4yL444vv4yL444vv4yL444vv4yL444$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$avalitu.$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$gnal");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test41394() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest82.test41394");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trim("stringstringstringstringstringstringstringstringstringstrin");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "stringstringstringstringstringstringstringstringstringstrin" + "'", str1, "stringstringstringstringstringstringstringstringstringstrin");
    }

    @Test
    public void test41395() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest82.test41395");
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.replace("4444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444aaaaaaaaaa", "ttBysINTER", "ho$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$rayList$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$t", 573);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "4444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444aaaaaaaaaa" + "'", str4, "4444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444aaaaaaaaaa");
    }

    @Test
    public void test41396() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest82.test41396");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNumericSpace((java.lang.CharSequence) "       aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test41397() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest82.test41397");
        int int3 = org.apache.commons.lang3.StringUtils.indexOfIgnoreCase("Arralitu.avajlitu.avaj", "########$#######$          utilutilutilutilutilutilutilutilutilutilutilutilutilutilutilutilutilutilutilutilutilutilutilutilutilutilutilutilutilutilutilutilutilutilutilutilutilutilutilutilutilutilutilutilutilutilutilutilutilutilutilutilutilutilutilutilutilutilutilutilutilutilutilutilutilutilutilutilutilutilutilutilutilutilutilutilutilutilutilutilutilutilutilutilutilutilutilutilutilutilutilutilutilutilutilutilutilutilutilutilutilutilutilutilutilutilutilutilutilutilutilutilutilutilutilutilutilutilutilutilutilutilutilutilutilutilutilutilutilutilutilutilutilutilutilutilutilutilutilutilutilutilutilutilutilutilutilutilutilutilutilutilutilutilutilutilutilutilutilutilutilutilutilutilutilutilutilutilutilutilutilutilutilutilutilutilutilutilutilutilutilutilutilutilutilutilutilutilutilutilutilutilutilutilutilutilutilutilutilutilutilutilutilutilutilutilutilutilutilutilutilutilutilutilutilutilutilutilutilutilutilutilutilutilutilutilutilutiluti", 49);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test41398() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest82.test41398");
        int int3 = org.apache.commons.lang3.StringUtils.lastOrdinalIndexOf("avaJ", ".AVAJ", 96);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test41399() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest82.test41399");
        java.lang.String[] strArray1 = new java.lang.String[] { "                                   " };
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.getCommonPrefix(strArray1);
        java.lang.Class<?>[] wildcardClassArray3 = org.apache.commons.lang3.ClassUtils.toClass((java.lang.Object[]) strArray1);
        java.lang.Class<?> wildcardClass4 = null;
        java.lang.Class[] classArray6 = new java.lang.Class[1];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray7 = (java.lang.Class<?>[]) classArray6;
        wildcardClassArray7[0] = wildcardClass4;
        java.lang.Class<?>[] wildcardClassArray10 = org.apache.commons.lang3.ClassUtils.primitivesToWrappers(wildcardClassArray7);
        boolean boolean11 = org.apache.commons.lang3.ClassUtils.isAssignable(wildcardClassArray3, wildcardClassArray7);
        java.lang.String str15 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) wildcardClassArray7, "$", 18, (int) (byte) 1);
        java.lang.Class<?>[] wildcardClassArray16 = org.apache.commons.lang3.ClassUtils.wrappersToPrimitives(wildcardClassArray7);
        java.lang.String[] strArray19 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("class java.lang.String", "                                   ");
        java.lang.String[] strArray20 = org.apache.commons.lang3.StringUtils.stripAll(strArray19);
        java.lang.Class<?>[] wildcardClassArray21 = org.apache.commons.lang3.ClassUtils.toClass((java.lang.Object[]) strArray20);
        java.lang.String[] strArray23 = new java.lang.String[] { "                                   " };
        java.lang.String str24 = org.apache.commons.lang3.StringUtils.getCommonPrefix(strArray23);
        java.lang.Class<?>[] wildcardClassArray25 = org.apache.commons.lang3.ClassUtils.toClass((java.lang.Object[]) strArray23);
        java.lang.Class<?>[] wildcardClassArray26 = org.apache.commons.lang3.ClassUtils.primitivesToWrappers(wildcardClassArray25);
        boolean boolean28 = org.apache.commons.lang3.ClassUtils.isAssignable(wildcardClassArray21, wildcardClassArray25, false);
        java.lang.String str30 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) wildcardClassArray25, "");
        java.lang.String str31 = org.apache.commons.lang3.StringUtils.concat((java.lang.Object[]) wildcardClassArray25);
        boolean boolean32 = org.apache.commons.lang3.ClassUtils.isAssignable(wildcardClassArray7, wildcardClassArray25);
        java.lang.String[] strArray35 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("hi!", "");
        java.lang.String[] strArray37 = org.apache.commons.lang3.StringUtils.stripAll(strArray35, "$");
        java.lang.Class<?>[] wildcardClassArray38 = org.apache.commons.lang3.ClassUtils.toClass((java.lang.Object[]) strArray35);
        java.lang.Class<?>[] wildcardClassArray39 = org.apache.commons.lang3.ClassUtils.toClass((java.lang.Object[]) wildcardClassArray38);
        java.lang.Class<?>[] wildcardClassArray40 = org.apache.commons.lang3.ClassUtils.wrappersToPrimitives(wildcardClassArray39);
        java.lang.String str41 = org.apache.commons.lang3.StringUtils.concat((java.lang.Object[]) wildcardClassArray40);
        java.lang.String[] strArray43 = new java.lang.String[] { "                                   " };
        java.lang.String str44 = org.apache.commons.lang3.StringUtils.getCommonPrefix(strArray43);
        java.lang.Class<?>[] wildcardClassArray45 = org.apache.commons.lang3.ClassUtils.toClass((java.lang.Object[]) strArray43);
        java.lang.Class<?>[] wildcardClassArray46 = org.apache.commons.lang3.ClassUtils.primitivesToWrappers(wildcardClassArray45);
        boolean boolean47 = org.apache.commons.lang3.ClassUtils.isAssignable(wildcardClassArray40, wildcardClassArray46);
        java.lang.String[] strArray50 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("hi!", "");
        java.lang.String[] strArray52 = org.apache.commons.lang3.StringUtils.stripAll(strArray50, "$");
        java.lang.Class<?>[] wildcardClassArray53 = org.apache.commons.lang3.ClassUtils.toClass((java.lang.Object[]) strArray50);
        java.lang.Class<?>[] wildcardClassArray54 = org.apache.commons.lang3.ClassUtils.toClass((java.lang.Object[]) wildcardClassArray53);
        java.lang.Class<?>[] wildcardClassArray55 = org.apache.commons.lang3.ClassUtils.wrappersToPrimitives(wildcardClassArray54);
        boolean boolean57 = org.apache.commons.lang3.ClassUtils.isAssignable(wildcardClassArray46, wildcardClassArray55, false);
        java.lang.String str59 = org.apache.commons.lang3.ClassUtils.getPackageCanonicalName((java.lang.Object) wildcardClassArray55, ".class javalangClass                       JAVAULANG                       JAVAULANG                       JAVAULANG                       JAVAULANG                       JAVAULANG                       JAVAULANG                       JAVAULANG                       JAVAULANG                       JAVAULANG                       JAVAULANG                       JAVAULANG                       JAVAULANG                       JAVAULANG                       JAVAULANG                       JAVAULANG                       JAVAULANG                       JAVAULANG                       JAVAULANG                       JAVAULANG                       JAVAULANG        rayListArrayListArrayListavaj.gnalArrayListArrayListArrayListavaj.gnalArrayListArrayListArrayLi.                       javaulang");
        java.lang.Class<?>[] wildcardClassArray60 = org.apache.commons.lang3.ClassUtils.wrappersToPrimitives(wildcardClassArray55);
        java.lang.String[] strArray63 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("hi!", "");
        java.lang.String[] strArray65 = org.apache.commons.lang3.StringUtils.stripAll(strArray63, "$");
        java.lang.Class<?>[] wildcardClassArray66 = org.apache.commons.lang3.ClassUtils.toClass((java.lang.Object[]) strArray63);
        java.lang.Class<?>[] wildcardClassArray67 = org.apache.commons.lang3.ClassUtils.toClass((java.lang.Object[]) wildcardClassArray66);
        java.lang.String str71 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) wildcardClassArray67, '#', (int) (byte) -1, (-1));
        boolean boolean72 = org.apache.commons.lang3.ClassUtils.isAssignable(wildcardClassArray60, wildcardClassArray67);
        boolean boolean73 = org.apache.commons.lang3.ClassUtils.isAssignable(wildcardClassArray25, wildcardClassArray60);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str77 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) wildcardClassArray60, '.', 54, 444);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 54");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                   " + "'", str2, "                                   ");
        org.junit.Assert.assertNotNull(wildcardClassArray3);
        org.junit.Assert.assertNotNull(classArray6);
        org.junit.Assert.assertNotNull(wildcardClassArray7);
        org.junit.Assert.assertNotNull(wildcardClassArray10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertNotNull(wildcardClassArray16);
        org.junit.Assert.assertNotNull(strArray19);
        org.junit.Assert.assertNotNull(strArray20);
        org.junit.Assert.assertNotNull(wildcardClassArray21);
        org.junit.Assert.assertNotNull(strArray23);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "                                   " + "'", str24, "                                   ");
        org.junit.Assert.assertNotNull(wildcardClassArray25);
        org.junit.Assert.assertNotNull(wildcardClassArray26);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "class java.lang.String" + "'", str30, "class java.lang.String");
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "class java.lang.String" + "'", str31, "class java.lang.String");
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertNotNull(strArray35);
        org.junit.Assert.assertNotNull(strArray37);
        org.junit.Assert.assertNotNull(wildcardClassArray38);
        org.junit.Assert.assertNotNull(wildcardClassArray39);
        org.junit.Assert.assertNotNull(wildcardClassArray40);
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "" + "'", str41, "");
        org.junit.Assert.assertNotNull(strArray43);
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "                                   " + "'", str44, "                                   ");
        org.junit.Assert.assertNotNull(wildcardClassArray45);
        org.junit.Assert.assertNotNull(wildcardClassArray46);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + true + "'", boolean47 == true);
        org.junit.Assert.assertNotNull(strArray50);
        org.junit.Assert.assertNotNull(strArray52);
        org.junit.Assert.assertNotNull(wildcardClassArray53);
        org.junit.Assert.assertNotNull(wildcardClassArray54);
        org.junit.Assert.assertNotNull(wildcardClassArray55);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
        org.junit.Assert.assertEquals("'" + str59 + "' != '" + "java.lang" + "'", str59, "java.lang");
        org.junit.Assert.assertNotNull(wildcardClassArray60);
        org.junit.Assert.assertNotNull(strArray63);
        org.junit.Assert.assertNotNull(strArray65);
        org.junit.Assert.assertNotNull(wildcardClassArray66);
        org.junit.Assert.assertNotNull(wildcardClassArray67);
        org.junit.Assert.assertEquals("'" + str71 + "' != '" + "" + "'", str71, "");
        org.junit.Assert.assertTrue("'" + boolean72 + "' != '" + true + "'", boolean72 == true);
        org.junit.Assert.assertTrue("'" + boolean73 + "' != '" + false + "'", boolean73 == false);
    }

    @Test
    public void test41400() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest82.test41400");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("gagnAAAAAAAAAAistArrayListArrayListavaj.gnalArrayListArrayListArrayLi", "       util                                                                               ");
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test41401() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest82.test41401");
        int int2 = org.apache.commons.lang3.StringUtils.indexOf("                                                                                                                                                                                                                                                                                                                                                                                                                                                                                          javaaaaaaaaaa                                                                                                                                         ", 164);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test41402() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest82.test41402");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.chop("lass...                                       ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "lass...                                      " + "'", str1, "lass...                                      ");
    }

    @Test
    public void test41403() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest82.test41403");
        java.lang.String[] strArray3 = new java.lang.String[] { "                                   " };
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.getCommonPrefix(strArray3);
        int int5 = org.apache.commons.lang3.StringUtils.indexOfDifference((java.lang.CharSequence[]) strArray3);
        java.lang.String str6 = org.apache.commons.lang3.StringUtils.concatWith("agnAAAAAAAAAA", (java.lang.Object[]) strArray3);
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.getCommonPrefix(strArray3);
        boolean boolean8 = org.apache.commons.lang3.StringUtils.startsWithAny("jv..........jv..........jv..........jv..........jv..........jv..........jv..........jv..........jv..........jv..........jv..........jv..........jv..........jv..........jv..........jv..........jv..........jv..........jv..........jv..........jv..........jv..........jv..........jv..........jv..........jv..........jv..........jv..........jv..........jv..........jv..........jv..........jv..........jv..........jvinterfce jv.io444444444444444444444444444444444444", strArray3);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "                                   " + "'", str4, "                                   ");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "                                   " + "'", str6, "                                   ");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "                                   " + "'", str7, "                                   ");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test41404() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest82.test41404");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replace("ily", "...AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA...1AAAAAAAAAAAAAAAAAAAAA...                                                                                                                                                                                                                                                                                                                                                                                                                                                            ", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaJAVA.LANG.CLONEABLE...                                 INTERFACE JAVA.IO.SERIALIZABLE");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "ily" + "'", str3, "ily");
    }

    @Test
    public void test41405() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest82.test41405");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.split("CLASS JAVA.UTIL.ABSTRACTLISTGN LU V J ....................................................................CLASS JAVA.UTIL.ABSTRACTCOLLECTIONGN LU V J ....................................................................CLASS JAVA.LANG.OBJECT", '4');
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test41406() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest82.test41406");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.capitalize((java.lang.CharSequence) "                                    iLyarrAtsiLyarrAtsiLyarrAlang.javatsiLyarrAtsiLyarrAtsiLyarrA");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "                                    iLyarrAtsiLyarrAtsiLyarrAlang.javatsiLyarrAtsiLyarrAtsiLyarrA" + "'", str1, "                                    iLyarrAtsiLyarrAtsiLyarrAlang.javatsiLyarrAtsiLyarrAtsiLyarrA");
    }

    @Test
    public void test41407() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest82.test41407");
        java.lang.Class<?> wildcardClass1 = null;
        java.lang.Class[] classArray3 = new java.lang.Class[1];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray4 = (java.lang.Class<?>[]) classArray3;
        wildcardClassArray4[0] = wildcardClass1;
        java.lang.Class<?>[] wildcardClassArray7 = org.apache.commons.lang3.ClassUtils.primitivesToWrappers(wildcardClassArray4);
        java.lang.String[] strArray9 = new java.lang.String[] { "                                   " };
        java.lang.String str10 = org.apache.commons.lang3.StringUtils.getCommonPrefix(strArray9);
        java.lang.Class<?>[] wildcardClassArray11 = org.apache.commons.lang3.ClassUtils.toClass((java.lang.Object[]) strArray9);
        java.lang.Class<?> wildcardClass12 = null;
        java.lang.Class[] classArray14 = new java.lang.Class[1];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray15 = (java.lang.Class<?>[]) classArray14;
        wildcardClassArray15[0] = wildcardClass12;
        java.lang.Class<?>[] wildcardClassArray18 = org.apache.commons.lang3.ClassUtils.primitivesToWrappers(wildcardClassArray15);
        boolean boolean19 = org.apache.commons.lang3.ClassUtils.isAssignable(wildcardClassArray11, wildcardClassArray15);
        boolean boolean21 = org.apache.commons.lang3.ClassUtils.isAssignable(wildcardClassArray4, wildcardClassArray15, true);
        java.lang.String[] strArray24 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("class java.lang.String", "                                   ");
        java.lang.String[] strArray25 = org.apache.commons.lang3.StringUtils.stripAll(strArray24);
        java.lang.Class<?>[] wildcardClassArray26 = org.apache.commons.lang3.ClassUtils.toClass((java.lang.Object[]) strArray25);
        java.lang.Class<?>[] wildcardClassArray27 = org.apache.commons.lang3.ClassUtils.primitivesToWrappers(wildcardClassArray26);
        boolean boolean28 = org.apache.commons.lang3.ClassUtils.isAssignable(wildcardClassArray15, wildcardClassArray27);
        java.lang.String str29 = org.apache.commons.lang3.StringUtils.concatWith("javajavajavajavajavajavajavajavajavajavajavajavajavajavajavajavajavajavajavajavajavajavajavajavajavajavajavajavajavajavajavajavajavajava", (java.lang.Object[]) wildcardClassArray27);
        java.lang.Class<?>[] wildcardClassArray30 = org.apache.commons.lang3.ClassUtils.primitivesToWrappers(wildcardClassArray27);
        java.lang.String[] strArray33 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("hi!", "");
        java.lang.String[] strArray35 = org.apache.commons.lang3.StringUtils.stripAll(strArray33, "$");
        java.lang.Class<?>[] wildcardClassArray36 = org.apache.commons.lang3.ClassUtils.toClass((java.lang.Object[]) strArray33);
        java.lang.Class<?> wildcardClass37 = null;
        java.lang.Class[] classArray39 = new java.lang.Class[1];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray40 = (java.lang.Class<?>[]) classArray39;
        wildcardClassArray40[0] = wildcardClass37;
        java.lang.Class<?>[] wildcardClassArray43 = org.apache.commons.lang3.ClassUtils.primitivesToWrappers(wildcardClassArray40);
        java.lang.String[] strArray45 = new java.lang.String[] { "                                   " };
        java.lang.String str46 = org.apache.commons.lang3.StringUtils.getCommonPrefix(strArray45);
        java.lang.Class<?>[] wildcardClassArray47 = org.apache.commons.lang3.ClassUtils.toClass((java.lang.Object[]) strArray45);
        java.lang.Class<?> wildcardClass48 = null;
        java.lang.Class[] classArray50 = new java.lang.Class[1];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray51 = (java.lang.Class<?>[]) classArray50;
        wildcardClassArray51[0] = wildcardClass48;
        java.lang.Class<?>[] wildcardClassArray54 = org.apache.commons.lang3.ClassUtils.primitivesToWrappers(wildcardClassArray51);
        boolean boolean55 = org.apache.commons.lang3.ClassUtils.isAssignable(wildcardClassArray47, wildcardClassArray51);
        boolean boolean57 = org.apache.commons.lang3.ClassUtils.isAssignable(wildcardClassArray40, wildcardClassArray51, true);
        boolean boolean59 = org.apache.commons.lang3.ClassUtils.isAssignable(wildcardClassArray36, wildcardClassArray51, false);
        java.lang.Class<?>[] wildcardClassArray60 = org.apache.commons.lang3.ClassUtils.primitivesToWrappers(wildcardClassArray36);
        java.lang.Class<?>[] wildcardClassArray61 = org.apache.commons.lang3.ClassUtils.wrappersToPrimitives(wildcardClassArray60);
        boolean boolean63 = org.apache.commons.lang3.ClassUtils.isAssignable(wildcardClassArray30, wildcardClassArray61, false);
        java.lang.String[] strArray66 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("class java.lang.String", "                                   ");
        java.lang.String[] strArray67 = org.apache.commons.lang3.StringUtils.stripAll(strArray66);
        java.lang.Class<?>[] wildcardClassArray68 = org.apache.commons.lang3.ClassUtils.toClass((java.lang.Object[]) strArray67);
        java.lang.String[] strArray70 = new java.lang.String[] { "                                   " };
        java.lang.String str71 = org.apache.commons.lang3.StringUtils.getCommonPrefix(strArray70);
        java.lang.Class<?>[] wildcardClassArray72 = org.apache.commons.lang3.ClassUtils.toClass((java.lang.Object[]) strArray70);
        java.lang.Class<?>[] wildcardClassArray73 = org.apache.commons.lang3.ClassUtils.primitivesToWrappers(wildcardClassArray72);
        boolean boolean75 = org.apache.commons.lang3.ClassUtils.isAssignable(wildcardClassArray68, wildcardClassArray72, false);
        boolean boolean77 = org.apache.commons.lang3.ClassUtils.isAssignable(wildcardClassArray30, wildcardClassArray68, true);
        java.lang.Class<?>[] wildcardClassArray78 = org.apache.commons.lang3.ClassUtils.primitivesToWrappers(wildcardClassArray30);
        org.junit.Assert.assertNotNull(classArray3);
        org.junit.Assert.assertNotNull(wildcardClassArray4);
        org.junit.Assert.assertNotNull(wildcardClassArray7);
        org.junit.Assert.assertNotNull(strArray9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "                                   " + "'", str10, "                                   ");
        org.junit.Assert.assertNotNull(wildcardClassArray11);
        org.junit.Assert.assertNotNull(classArray14);
        org.junit.Assert.assertNotNull(wildcardClassArray15);
        org.junit.Assert.assertNotNull(wildcardClassArray18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(strArray24);
        org.junit.Assert.assertNotNull(strArray25);
        org.junit.Assert.assertNotNull(wildcardClassArray26);
        org.junit.Assert.assertNotNull(wildcardClassArray27);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "class java.lang.String" + "'", str29, "class java.lang.String");
        org.junit.Assert.assertNotNull(wildcardClassArray30);
        org.junit.Assert.assertNotNull(strArray33);
        org.junit.Assert.assertNotNull(strArray35);
        org.junit.Assert.assertNotNull(wildcardClassArray36);
        org.junit.Assert.assertNotNull(classArray39);
        org.junit.Assert.assertNotNull(wildcardClassArray40);
        org.junit.Assert.assertNotNull(wildcardClassArray43);
        org.junit.Assert.assertNotNull(strArray45);
        org.junit.Assert.assertEquals("'" + str46 + "' != '" + "                                   " + "'", str46, "                                   ");
        org.junit.Assert.assertNotNull(wildcardClassArray47);
        org.junit.Assert.assertNotNull(classArray50);
        org.junit.Assert.assertNotNull(wildcardClassArray51);
        org.junit.Assert.assertNotNull(wildcardClassArray54);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + false + "'", boolean59 == false);
        org.junit.Assert.assertNotNull(wildcardClassArray60);
        org.junit.Assert.assertNotNull(wildcardClassArray61);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + false + "'", boolean63 == false);
        org.junit.Assert.assertNotNull(strArray66);
        org.junit.Assert.assertNotNull(strArray67);
        org.junit.Assert.assertNotNull(wildcardClassArray68);
        org.junit.Assert.assertNotNull(strArray70);
        org.junit.Assert.assertEquals("'" + str71 + "' != '" + "                                   " + "'", str71, "                                   ");
        org.junit.Assert.assertNotNull(wildcardClassArray72);
        org.junit.Assert.assertNotNull(wildcardClassArray73);
        org.junit.Assert.assertTrue("'" + boolean75 + "' != '" + true + "'", boolean75 == true);
        org.junit.Assert.assertTrue("'" + boolean77 + "' != '" + true + "'", boolean77 == true);
        org.junit.Assert.assertNotNull(wildcardClassArray78);
    }

    @Test
    public void test41408() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest82.test41408");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.deleteWhitespace("     AA...     AA...     AA...     AA...     AA...     AA...     AA...     AA...     AA...     AA...     AA...     AA...     AA...     AA...     AA...     AA...     AA...     AA...     AA...     AA...     AA...     AA...     AA...     AA...     AA...     AA...     AA.444444aaaaaaaINTEGERaaaaaaa4444444     AA...     AA...     AA...     AA...     AA...     AA...     AA...     AA...     AA...     AA...     AA...     AA...     AA...     AA...     AA...     AA...     AA...     AA...     AA...     AA...     AA...     AA...     AA...     AA...     AA...     AA...     AA.");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "AA...AA...AA...AA...AA...AA...AA...AA...AA...AA...AA...AA...AA...AA...AA...AA...AA...AA...AA...AA...AA...AA...AA...AA...AA...AA...AA.444444aaaaaaaINTEGERaaaaaaa4444444AA...AA...AA...AA...AA...AA...AA...AA...AA...AA...AA...AA...AA...AA...AA...AA...AA...AA...AA...AA...AA...AA...AA...AA...AA...AA...AA." + "'", str1, "AA...AA...AA...AA...AA...AA...AA...AA...AA...AA...AA...AA...AA...AA...AA...AA...AA...AA...AA...AA...AA...AA...AA...AA...AA...AA...AA.444444aaaaaaaINTEGERaaaaaaa4444444AA...AA...AA...AA...AA...AA...AA...AA...AA...AA...AA...AA...AA...AA...AA...AA...AA...AA...AA...AA...AA...AA...AA...AA...AA...AA...AA.");
    }

    @Test
    public void test41409() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest82.test41409");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.normalizeSpace("                                ...");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "..." + "'", str1, "...");
    }

    @Test
    public void test41410() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest82.test41410");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass1 = org.apache.commons.lang3.ClassUtils.getClass(".............................................................444444444444444444444444444444444444444444444444444444444444444gn                                            gn      tavaj.gnalarraylistarraylistarrayli..............................................................");
            org.junit.Assert.fail("Expected exception of type java.lang.ClassNotFoundException; message: /////////////////////////////////////////////////////////////444444444444444444444444444444444444444444444444444444444444444gngntavaj/gnalarraylistarraylistarrayli//////////////////////////////////////////////////////////////");
        } catch (java.lang.ClassNotFoundException e) {
            // Expected exception.
        }
    }

    @Test
    public void test41411() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest82.test41411");
        java.lang.String str1 = org.apache.commons.lang3.ClassUtils.getShortClassName("                                                                                                                                            #############################################");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "                                                                                                                                            #############################################" + "'", str1, "                                                                                                                                            #############################################");
    }

    @Test
    public void test41412() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest82.test41412");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trimToNull("                                                                                                                                                                                                                                                                                                                                                                                                                                java.langaGNAL.AVAJGNAL..langGNAL.AVaRRCLASS JAVA.LANG.oBJECTYlISTaR...");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "java.langaGNAL.AVAJGNAL..langGNAL.AVaRRCLASS JAVA.LANG.oBJECTYlISTaR..." + "'", str1, "java.langaGNAL.AVAJGNAL..langGNAL.AVaRRCLASS JAVA.LANG.oBJECTYlISTaR...");
    }

    @Test
    public void test41413() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest82.test41413");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripAccents((java.lang.CharSequence) "interface java.lang.Cloneableaaaaaaaaaaainterface java.io.SerializableinterfaGnirtS.gnal.avajssalcgnirtS.gnal.avajssalcgnirtS.gnal.avajssalcgnirtS.gnal.avajssalcgnirtS.gnal.avajssalcgnirtS.gnal.avajssalcgnirtS.gnal.avajssalcgnirtS.gnal.avajssalcgnirtS.gnal.avajssalcgnirtS.gnal.avajssalcgnirtS.gnal.avajssalcgnirtS.gnal.avajssalcgnirtS.gnal.avajssalcgnirtS.gnal.avajssalcgnirtS.gnal.avajssalcgnirtS.gnal.avaj........java.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.lang........java.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.lang........java.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.lang........java.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.lang........java.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.lang.......");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "interface java.lang.Cloneableaaaaaaaaaaainterface java.io.SerializableinterfaGnirtS.gnal.avajssalcgnirtS.gnal.avajssalcgnirtS.gnal.avajssalcgnirtS.gnal.avajssalcgnirtS.gnal.avajssalcgnirtS.gnal.avajssalcgnirtS.gnal.avajssalcgnirtS.gnal.avajssalcgnirtS.gnal.avajssalcgnirtS.gnal.avajssalcgnirtS.gnal.avajssalcgnirtS.gnal.avajssalcgnirtS.gnal.avajssalcgnirtS.gnal.avajssalcgnirtS.gnal.avajssalcgnirtS.gnal.avaj........java.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.lang........java.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.lang........java.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.lang........java.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.lang........java.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.lang......." + "'", str1, "interface java.lang.Cloneableaaaaaaaaaaainterface java.io.SerializableinterfaGnirtS.gnal.avajssalcgnirtS.gnal.avajssalcgnirtS.gnal.avajssalcgnirtS.gnal.avajssalcgnirtS.gnal.avajssalcgnirtS.gnal.avajssalcgnirtS.gnal.avajssalcgnirtS.gnal.avajssalcgnirtS.gnal.avajssalcgnirtS.gnal.avajssalcgnirtS.gnal.avajssalcgnirtS.gnal.avajssalcgnirtS.gnal.avajssalcgnirtS.gnal.avajssalcgnirtS.gnal.avajssalcgnirtS.gnal.avaj........java.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.lang........java.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.lang........java.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.lang........java.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.lang........java.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.lang.......");
    }

    @Test
    public void test41414() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest82.test41414");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNumericSpace((java.lang.CharSequence) "...       ....       ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test41415() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest82.test41415");
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.split("AtsiLytcejbO.gnal.avajssalcrrAtsiLytcejbO.gnal.avajssalcrrAva.langGNAL..langjava.langAGNAL", "interface java.lang.CloneableJ#v#.l#ngj#v#.l#ngj#v#.l#ngj#v#.l#ngj#v#.l#ngj#v#.l#ngj#v#.l#ngj#v#.l#ngj#v#.l#ngj#v#.l#ngj#v#.l#ngj#v#.l#ngj#v#.l#ngj#v#.l#ngj#v#.l#ngj#v#.l#ngj#v#.l#ngj#v#.l#ngj#v#.l#ngj#v#.l#ngj#v#.l#ngj#v#.l#ngj#v#.l#ngj#v#.l#ngj#v#.l#ngj#v#.l#ngj#v#.l#ngj#v#.l#ngj#v#.l#ngj#v#.l#ngj#v#.l#ngj#v#.l#ngj#v#.l#nginterface java.io.Serializabl", 87);
        boolean boolean5 = org.apache.commons.lang3.StringUtils.startsWithAny("JVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA", strArray4);
        java.lang.String str7 = org.apache.commons.lang3.ClassUtils.getPackageCanonicalName((java.lang.Object) "JVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA", "ajaaaaaaaaaanga.lavajaaaaaaaaaanga.lavajaaaa                                               ");
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "java.lang" + "'", str7, "java.lang");
    }

    @Test
    public void test41416() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest82.test41416");
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("$       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       ", ".", (int) '.');
        boolean boolean5 = org.apache.commons.lang3.StringUtils.endsWithAny("###############################################################################################################################################################", strArray4);
        int int6 = org.apache.commons.lang3.StringUtils.indexOfDifference((java.lang.CharSequence[]) strArray4);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
    }

    @Test
    public void test41417() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest82.test41417");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsIgnoreCase("...$$$$$$$$$$$$$$$..                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                            ", "                   sTRINGsTRINGsTRINGsTRINGsTRINGsTRINGsTRINGsTRINGsTRINGsTRING                    ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test41418() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest82.test41418");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("                       JAVAULANGrrayList", "String[]String[]StLlitung[]String[]String[]String[]String[]String[]");
        java.lang.String[] strArray5 = org.apache.commons.lang3.StringUtils.stripAll(strArray3, "Integer");
        int int6 = org.apache.commons.lang3.StringUtils.lastIndexOfAny("-1JAVA.UTILsTRING[]                                                                                 ", strArray3);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
    }

    @Test
    public void test41419() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest82.test41419");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.stripEnd("                                                                  irfco$irfiosra..ayl a.444444444444444444444444444", "aaaaaaaaaangalavajaaaaaaaaaangalavajaaaaaaaaaangalavajaaaaaaaaaangalavajaaaaaaaaaangalavajaaaaaaaaaangalavajaaaaaaaaaangalavajaaaaaaaaaangalavajaaaaaaaaaangalavajaaaaaaaaaangalavajaaaaaaaaaangalavajaaaaaaaaaangalavajaaaaaaaaaangalavajaaaaaaaaaangalavajaaaaaaaaaangalavajaaaaaaaaaangalavajaaaaaaaaaangalavajaaaaaaaaaangalavajaaaaaaaaaangalavajaaaaaaaaaangalavajaaaaaaaaaangalavajaaaaaaaaaangalavajaaaaaaaaaangalavajaaaaaaaaaangalavajaaaaaaaaaangalavajaaaaaaaaaangalavajaaaaaaaaaangalavajaaaaaaaaaangalavajaaaaaaaaaangalavajaaaaaaaaaangalavajaaaaaaaaaangalavajaaaaaaaaaangalavajaaaaaaaaaangalavajaaaaaaaaaangalavajaaaaaaaaaangalavajaaaaaaaaaa                                                                                                                                                                                                                                                                        ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                                                  irfco$irfiosra..ayl a.444444444444444444444444444" + "'", str2, "                                                                  irfco$irfiosra..ayl a.444444444444444444444444444");
    }

    @Test
    public void test41420() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest82.test41420");
        char[] charArray14 = new char[] { ' ', ' ', '#', 'a', '4', 'a' };
        int int15 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "", charArray14);
        boolean boolean16 = org.apache.commons.lang3.StringUtils.containsAny("$", charArray14);
        java.lang.String str18 = org.apache.commons.lang3.ClassUtils.getPackageCanonicalName((java.lang.Object) charArray14, "class java.lang.String");
        int int19 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "     A..ayL A.44444444444444444444444444      ", charArray14);
        boolean boolean20 = org.apache.commons.lang3.StringUtils.containsAny("NTERFACE JAVA.LANG.cLONEABLE.......JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVAINTERFACE JAVA.IO.sERIALIZABLE", charArray14);
        boolean boolean21 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "....................................................................................................", charArray14);
        boolean boolean22 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "hinterface java.lang.cloneable4interface java.io.serializabl....1aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa...1aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa...1aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa...1aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa...1aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa...1aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa...1aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa...1aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa...1aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa...1aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", charArray14);
        boolean boolean23 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "                                                                                                                                        ", charArray14);
        boolean boolean24 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "jva..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java", charArray14);
        org.junit.Assert.assertNotNull(charArray14);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray14), "  #a4a");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray14), "  #a4a");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray14), "[ ,  , #, a, 4, a]");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 5 + "'", int19 == 5);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
    }

    @Test
    public void test41421() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest82.test41421");
        java.lang.String str1 = org.apache.commons.lang3.ClassUtils.getShortClassName("tSslitUgnirtSslitUgnirtSslitUgnirtSslitUgnirtSaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "tSslitUgnirtSslitUgnirtSslitUgnirtSslitUgnirtSaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa" + "'", str1, "tSslitUgnirtSslitUgnirtSslitUgnirtSslitUgnirtSaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
    }

    @Test
    public void test41422() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest82.test41422");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("                        gnalArrayListArrayListArrayListavaj.gnalArrayListArrayListArrayLi                        ", "INTERFACE JAVA.LANG.cLONEABLEa RRR RRR RRR RRR RRR RRR RRR RRR RRR RRRINTERFACE JAVA.IO.sERIALIZABLE");
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test41423() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest82.test41423");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replace("javastringnalarraylistarraylistarraylistavaj                                                                                                                                                                             ", "AAAAAAAAAAJ#V##.#GNAAAAAAAAAAJ#V##.#GNAAAAAAAAAAJ#V##.#GNAAAAAAAAAAJ#V##.#GNAAAAAAAAAAJ#V##.#GNAAAAAAAAAAJ#V##.#GNAAAAAAAAAAJ#V##.#GNAAAAAAAAAAJ#V##.#GNAAAAAAAAAAJ#V##.#GNAAAAAAAAAAJ#V##.#GNAAAAAAAAAAJ#V##.#GNAAAAAAAAAAJ#V##.#GNAAAAAAAAAAJ#                                              AAAAAAAJ#V##.#GNAAAAAAAAAAJ#V##.#GNAAAAAAAAAAJ#V##.#GNAAAAAAAAAAJ#V##.#GNAAAAAAAAAAJ#V##.#GNAAAAAAAAAAJ#V##.#GNAAAAAAAAAAJ#V##.#GNAAAAAAAAAAJ#V##.#GNAAAAAAAAAAJ#V##.#GNAAAAAAAAAAJ#V##.#GNAAAAAAAAAAJ#V##.#GNAAAAAAAAAAJ#V##.#GNAAAAAAAAAARING", "java.lang.stringclass java.lang.stringclass java.lang.stringclas.lang.stringclass java.lang.stringc");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "javastringnalarraylistarraylistarraylistavaj                                                                                                                                                                             " + "'", str3, "javastringnalarraylistarraylistarraylistavaj                                                                                                                                                                             ");
    }

    @Test
    public void test41424() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest82.test41424");
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("saylavv", "hi!ArrayListArrayListArrayListavaj.gnalArrayListArrayListArrayListavaj", 33);
        java.lang.String[] strArray6 = org.apache.commons.lang3.StringUtils.stripAll(strArray4, "");
        int int7 = org.apache.commons.lang3.StringUtils.lastIndexOfAny("444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444interface java.lang.Cloneable...                                 interface java.io.Serializable", strArray4);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 275 + "'", int7 == 275);
    }

    @Test
    public void test41425() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest82.test41425");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.contains("", "ngaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test41426() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest82.test41426");
        java.lang.String str1 = org.apache.commons.lang3.ClassUtils.getPackageCanonicalName("... java.lang.Stringclass java.lang.Stringclass...");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "...java.lang.Stringclassjava.lang.Stringclass.." + "'", str1, "...java.lang.Stringclassjava.lang.Stringclass..");
    }

    @Test
    public void test41427() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest82.test41427");
        java.lang.String str2 = org.apache.commons.lang3.ClassUtils.getShortCanonicalName((java.lang.Object) "lANGgnalgnalgnalgnalg...gjavaulangjavaulangjavaulangjavaulangjavaulangjavaulangjavaulangjavaulangjavaulangjavaulangnalgnalgnalgnalgnalgn", "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                             4444444.44444444");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "String" + "'", str2, "String");
    }

    @Test
    public void test41428() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest82.test41428");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripToNull(" AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAyList");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAyList" + "'", str1, "AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAyList");
    }

    @Test
    public void test41429() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest82.test41429");
        java.util.Locale locale1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.apache.commons.lang3.StringUtils.lowerCase("gn gnal.avajgn gnal.avajgn gnal.avajgn gnal.avajgn gnal.avajgn gnal.avajgn gnal.avajgn gnal.avajgn gnal.avajgn gnal.avajgn gnal.avajgn gnal.avajgn gnal.avajgn gnal.avajgn gnal.avajgn gnal.avaj", locale1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test41430() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest82.test41430");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAllLowerCase((java.lang.CharSequence) ".lang.Stringclass j..");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test41431() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest82.test41431");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.leftPad("################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################", 91, "iaaarfaaaaaaaaaaaaaaCaoaaaaaa$iaaarfaaaaaaaaaioaSariaaizaaaa");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################" + "'", str3, "################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################");
    }

    @Test
    public void test41432() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest82.test41432");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripToEmpty("VAArra");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "VAArra" + "'", str1, "VAArra");
    }

    @Test
    public void test41433() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest82.test41433");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replace("java.io.Serializable interface java.lang.Cloneable... interface", "AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA", "Jvstringnlrrylistrrylistrrylistvj.gnlrrylistrrylistrryli-1jv.utilString-1jv.utilString-1jv.utilString-1jv.utilString-1jv.utilString-1jv.utilString-1jv.utilString-1jv.utilString-1jv.utilString-1jv.utilString-1jv.utilString-1jv.utilString-1jv.utilString-1jv.utilString-1jv.utilString-1jv.utilString-1jv.utilString-1jv.utilString-1jv.utilString-1jv.utilString-1jv.utilString-1jv.utilString-1jv.utilString-1jv.utilString-1jv.utilString-1jv.utilString-1jv.utilString-1jv.utilString-1jv.utilString-1jv.utilString-1jv.utilString-1jv.utilString-1jv.utilString-1jv.utilString-1jv.utilString-1jv.utilString-1jv.utilString-1jv.utilString-1jv.utilString-1jv.utilString-1jv.utilString-1jv.utilString-1jv.utilString-1jv.utilString-1jv.utilString-1jv.utilString-1jv.utilString-1jv.utilString-1jv.utilString-1jv.utilString-1jv.utilString-1jv.utilString-1jv.utilString-1jv.utilString-1jv.utilString-1jv.utilString-1jv.utilString-1jv.utilString-1jv.utilString-");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "java.io.Serializable interface java.lang.Cloneable... interface" + "'", str3, "java.io.Serializable interface java.lang.Cloneable... interface");
    }

    @Test
    public void test41434() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest82.test41434");
        int int3 = org.apache.commons.lang3.StringUtils.ordinalIndexOf("                                                                                                                                                                                                                                                                                                                                                                                                                                             rgnaluavajtutututututut                                                                                                                                                                                                                                                                                                                                                                                                                                             ", "..........................................................................................................................................................................................................................................................ULITULITULITULITUL####LITULITULITULITULITUL...........................................................................................................................................................................................................................................................", 576);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test41435() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest82.test41435");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceChars("hi!arraylistarraylistarraylis.1aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa.1aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa.1aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa.1aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa.1aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa.1aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa.1aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa.aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", 'a', '$');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!$rr$ylist$rr$ylist$rr$ylis.1$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$.1$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$.1$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$.1$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$.1$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$.1$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$.1$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$.$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$" + "'", str3, "hi!$rr$ylist$rr$ylist$rr$ylis.1$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$.1$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$.1$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$.1$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$.1$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$.1$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$.1$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$.$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$");
    }

    @Test
    public void test41436() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest82.test41436");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substring("", (int) '#');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test41437() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest82.test41437");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeStart("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa                                            .aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "jv.lng$intS.r..gU..ls                                       jv.lng$int");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa                                            .aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa" + "'", str2, "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa                                            .aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
    }

    @Test
    public void test41438() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest82.test41438");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOf("", "utiljava.utilarrAjava.utiljava.utilarrAjava.utiljava.utilarrAjava.utiljava.utilarrAjava.utiljava.utilarrAjava.utiljava.utilarrAjava.utiljava.utilarrA#########################################################################itu.avaj###########################", 21);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test41439() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest82.test41439");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceChars("aaaaaa...                                                                                                                    ", "blealiza.io.Seriavace jableinterfaliza.io.Seriavace jableNG.Llitinterfang.Clonea.lavace jableinterfang.Clonea.lavace jainterf", "AAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAA...");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA" + "'", str3, "AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA");
    }

    @Test
    public void test41440() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest82.test41440");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.equalsIgnoreCase("siLyrrAsiLyrrA        aAAAAAAAAAAAsiLyrrA    tractList$class java.util.AbstractCollection$class java.lang.Object", "GNALUAVAJ                       GNALUAVAJ                       GNALUAVAJ                       GNALUAVAJ                       GNALUAVAJ                       GNALUAVAJ                       GNALUAVAJ                       GNALUAVAJ                       GNALUAVAJ                       GNALUAVAJ                       GNALUAVAJ                       GNALUAVAJ                       GNALUAVAJ                       GNALUAVAJ                       GNALUAVAJ                       GNALUAVAJ                       GNALUAVAJ                       GNALUAVAJ                       GNALUAVAJ                       GNALUAVAJ                       SSALCGNALAVAJavajlitu");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test41441() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest82.test41441");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOf("ArrayLis...VA.LANGAVAJ.GNALJAVA.LANGAVAJ.GNALJAVA.LANGAVAJ.GNALJAVA.LANGAVAJ.GNALJAVA.LANGAVAJ.GNALJAVA.LAN", 545);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test41442() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest82.test41442");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.reverseDelimited("LANGaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa       44444444444444444444444444...", 'a');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "       44444444444444444444444444...aLANG" + "'", str2, "       44444444444444444444444444...aLANG");
    }

    @Test
    public void test41443() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest82.test41443");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.leftPad("             Character                          Character                          Character                          Character                          Character                          Character                          Character                          Character                          Character                          Character                          Character                          Character             ", 793);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                                                                                                                                                                                                                                                                                                                                                                                  Character                          Character                          Character                          Character                          Character                          Character                          Character                          Character                          Character                          Character                          Character                          Character             " + "'", str2, "                                                                                                                                                                                                                                                                                                                                                                                                  Character                          Character                          Character                          Character                          Character                          Character                          Character                          Character                          Character                          Character                          Character                          Character             ");
    }

    @Test
    public void test41444() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest82.test41444");
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.split("ArrayList", "$", 10);
        java.lang.String str5 = org.apache.commons.lang3.StringUtils.getCommonPrefix(strArray4);
        java.lang.String[] strArray8 = new java.lang.String[] { "                                   " };
        java.lang.String str9 = org.apache.commons.lang3.StringUtils.getCommonPrefix(strArray8);
        java.lang.Class<?>[] wildcardClassArray10 = org.apache.commons.lang3.ClassUtils.toClass((java.lang.Object[]) strArray8);
        java.lang.String[] strArray13 = new java.lang.String[] { "                                   " };
        java.lang.String str14 = org.apache.commons.lang3.StringUtils.getCommonPrefix(strArray13);
        int int15 = org.apache.commons.lang3.StringUtils.indexOfDifference((java.lang.CharSequence[]) strArray13);
        int int16 = org.apache.commons.lang3.StringUtils.lastIndexOfAny("...       ", strArray13);
        java.lang.String str17 = org.apache.commons.lang3.StringUtils.replaceEach("...       AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA", strArray8, strArray13);
        java.lang.String[] strArray18 = org.apache.commons.lang3.StringUtils.stripAll(strArray13);
        java.lang.String str19 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray13);
        java.lang.String str20 = org.apache.commons.lang3.StringUtils.getCommonPrefix(strArray13);
        java.lang.String str21 = org.apache.commons.lang3.StringUtils.replaceEachRepeatedly("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaGNALUAVAJGNALUAVAJGNALUAVAJGNALUAVAJGNALUAVAJGNALUAVAJGNALUAVAJGNALUAVAJGNALUAVAJGNALUAVAJGNALUAVAJGNALUAVAJGNALUAVAJGNALUAVAJGNALUAVAJGNALUAVAJGNALUAVAJGNALUAVAJGNALUAVAJGNALUAVAJSSALCGNALAVAJSSALC", strArray4, strArray13);
        java.lang.String[] strArray22 = org.apache.commons.lang3.StringUtils.stripAll(strArray13);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "ArrayList" + "'", str5, "ArrayList");
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "                                   " + "'", str9, "                                   ");
        org.junit.Assert.assertNotNull(wildcardClassArray10);
        org.junit.Assert.assertNotNull(strArray13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "                                   " + "'", str14, "                                   ");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "...       AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA" + "'", str17, "...       AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA");
        org.junit.Assert.assertNotNull(strArray18);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "                                   " + "'", str19, "                                   ");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "                                   " + "'", str20, "                                   ");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaGNALUAVAJGNALUAVAJGNALUAVAJGNALUAVAJGNALUAVAJGNALUAVAJGNALUAVAJGNALUAVAJGNALUAVAJGNALUAVAJGNALUAVAJGNALUAVAJGNALUAVAJGNALUAVAJGNALUAVAJGNALUAVAJGNALUAVAJGNALUAVAJGNALUAVAJGNALUAVAJSSALCGNALAVAJSSALC" + "'", str21, "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaGNALUAVAJGNALUAVAJGNALUAVAJGNALUAVAJGNALUAVAJGNALUAVAJGNALUAVAJGNALUAVAJGNALUAVAJGNALUAVAJGNALUAVAJGNALUAVAJGNALUAVAJGNALUAVAJGNALUAVAJGNALUAVAJGNALUAVAJGNALUAVAJGNALUAVAJGNALUAVAJSSALCGNALAVAJSSALC");
        org.junit.Assert.assertNotNull(strArray22);
    }

    @Test
    public void test41445() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest82.test41445");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.leftPad("][sslC][sslCrChahaAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAA", 70);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "][sslC][sslCrChahaAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAA" + "'", str2, "][sslC][sslCrChahaAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAA");
    }

    @Test
    public void test41446() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest82.test41446");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("                                      J", "litu.avaj");
        java.lang.String str6 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray2, "...AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA...AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA...AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA...AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA...AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA...AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA...AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA...AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA...AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA..", 578, 29);
        java.lang.String[] strArray7 = org.apache.commons.lang3.StringUtils.stripAll(strArray2);
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.getCommonPrefix(strArray2);
        java.lang.String str9 = org.apache.commons.lang3.StringUtils.getCommonPrefix(strArray2);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "                                      J" + "'", str8, "                                      J");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "                                      J" + "'", str9, "                                      J");
    }

    @Test
    public void test41447() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest82.test41447");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "ayLisArrayLisArrayLisA", "javastringslitUgnirtSarraylistarraylistavaj");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test41448() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest82.test41448");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("irfCo$irfioSrA..ayL A.444444444444444444444444444", "SE...               ..");
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test41449() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest82.test41449");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.chomp("AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA" + "'", str1, "AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA");
    }

    @Test
    public void test41450() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest82.test41450");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeEndIgnoreCase("jv..........jv..........jv..                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                    ", "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "jv..........jv..........jv..                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                    " + "'", str2, "jv..........jv..........jv..                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                    ");
    }

    @Test
    public void test41451() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest82.test41451");
        int int2 = org.apache.commons.lang3.StringUtils.getLevenshteinDistance((java.lang.CharSequence) "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                ", (java.lang.CharSequence) "TRING");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 624 + "'", int2 == 624);
    }

    @Test
    public void test41452() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest82.test41452");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripToEmpty("alArrayListArrayListArrayListavaj.gnalArrayListArrayListArrayLi");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "alArrayListArrayListArrayListavaj.gnalArrayListArrayListArrayLi" + "'", str1, "alArrayListArrayListArrayListavaj.gnalArrayListArrayListArrayLi");
    }

    @Test
    public void test41453() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest82.test41453");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeStartIgnoreCase(".........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........", "$rr$ylis...v$.l$ng$v$j.gn$lj$v$.l$ng$v$j.gn$lj$v$.l$ng$v$j.gn$lj$v$.l$ng$v$j.gn$lj$v$.l$ng$v$j.gn$lj$v$.l$ng");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + ".........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java.........." + "'", str2, ".........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........");
    }

    @Test
    public void test41454() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest82.test41454");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.abbreviateMiddle("clss jv.lng.Stringclss jv.lng.Stringclss jv.lng.Stringclss jv.lng.Stringclss jv.lng.Stringclss jv.lng.Stringclss jv.lng.Stringclss jv.lng.Stringclss jv.lng.Stringclss jv.lng.Stringclss jv.lng.Stringclss jv.lng.Stringclss jv.lng.Stringclss jv.lng.Stringclss jv.lng.Stringclss jv.lng.Stringclss jv.lng.Stringjava.lang$interface java.lang.Cloneable$interface java.io.Serializableinterface java.lang.Cloneable$interface java.io.Serializableinterface java.lang.Clclss jv.lng.Stringclss jv.lng.Stringclss jv.lng.Stringclss jv.lng.Stringclss jv.lng.Stringclss jv.lng.Stringclss jv.lng.Stringclss jv.lng.Stringclss jv.lng.Stringclss jv.lng.Stringclss jv.lng.Stringclss jv.lng.Stringclss jv.lng.Stringclss jv.lng.Stringclss jv.lng.Stringclss jv.lng.Stringclss jv.lng.String", "44444444444444444444444444444444444444444444444444444444444444444444444javaulang44444444444444444", 0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "clss jv.lng.Stringclss jv.lng.Stringclss jv.lng.Stringclss jv.lng.Stringclss jv.lng.Stringclss jv.lng.Stringclss jv.lng.Stringclss jv.lng.Stringclss jv.lng.Stringclss jv.lng.Stringclss jv.lng.Stringclss jv.lng.Stringclss jv.lng.Stringclss jv.lng.Stringclss jv.lng.Stringclss jv.lng.Stringclss jv.lng.Stringjava.lang$interface java.lang.Cloneable$interface java.io.Serializableinterface java.lang.Cloneable$interface java.io.Serializableinterface java.lang.Clclss jv.lng.Stringclss jv.lng.Stringclss jv.lng.Stringclss jv.lng.Stringclss jv.lng.Stringclss jv.lng.Stringclss jv.lng.Stringclss jv.lng.Stringclss jv.lng.Stringclss jv.lng.Stringclss jv.lng.Stringclss jv.lng.Stringclss jv.lng.Stringclss jv.lng.Stringclss jv.lng.Stringclss jv.lng.Stringclss jv.lng.String" + "'", str3, "clss jv.lng.Stringclss jv.lng.Stringclss jv.lng.Stringclss jv.lng.Stringclss jv.lng.Stringclss jv.lng.Stringclss jv.lng.Stringclss jv.lng.Stringclss jv.lng.Stringclss jv.lng.Stringclss jv.lng.Stringclss jv.lng.Stringclss jv.lng.Stringclss jv.lng.Stringclss jv.lng.Stringclss jv.lng.Stringclss jv.lng.Stringjava.lang$interface java.lang.Cloneable$interface java.io.Serializableinterface java.lang.Cloneable$interface java.io.Serializableinterface java.lang.Clclss jv.lng.Stringclss jv.lng.Stringclss jv.lng.Stringclss jv.lng.Stringclss jv.lng.Stringclss jv.lng.Stringclss jv.lng.Stringclss jv.lng.Stringclss jv.lng.Stringclss jv.lng.Stringclss jv.lng.Stringclss jv.lng.Stringclss jv.lng.Stringclss jv.lng.Stringclss jv.lng.Stringclss jv.lng.Stringclss jv.lng.String");
    }

    @Test
    public void test41455() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest82.test41455");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsAny("A Lya..A                                      ", "ALAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaainterface java.lang.Cloneable.litinterface java.io.erializable                                                                                                                                                                                                                                                                                                                                                                                                                                                                  NALAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test41456() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest82.test41456");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAllLowerCase((java.lang.CharSequence) "                                               EGETNI                                              ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test41457() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest82.test41457");
        java.lang.String[] strArray5 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("String[]String[]StLlitung[]String[]String[]String[]String[]String[]", "gNAL", 3);
        java.lang.String[] strArray6 = org.apache.commons.lang3.StringUtils.stripAll(strArray5);
        java.lang.String[] strArray9 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("avaj.gnal", "$       ");
        java.lang.String str10 = org.apache.commons.lang3.StringUtils.replaceEachRepeatedly("gagnAAAAAAAAAAistArrayListArrayListavaj.gnalArrayListArrayListArrayLi", strArray5, strArray9);
        java.lang.Class<?>[] wildcardClassArray11 = org.apache.commons.lang3.ClassUtils.toClass((java.lang.Object[]) strArray9);
        int int12 = org.apache.commons.lang3.StringUtils.indexOfDifference((java.lang.CharSequence[]) strArray9);
        int int13 = org.apache.commons.lang3.StringUtils.indexOfAny("etyBetyBetyBetyBetyBetyBetyBetyBetyBetyBetyBetyBetyBetyBetyBetyBetyBetyBetyBetyBetyBetyBetyBetyBetyBetyBetyBetyBetyBetyBetyBetyBetyBetyBetyBetyBetyBetyBetyBetyBetyBetyBetyBetyBetyBetyBetyBetyBetyBetyBetyBetyBetyetyBetyBetyBetyBetyBetyBetyBetyBetyBetyBetyBetyBetyBetyBetyBetyBetyBetyBetyBetyBetyBetyBetyBetyBetyBetyBetyBetyBetyBetyBetyBetyBetyBetyBetyBetyBetyBetyBetyBetyBetyBetyBetyBetyBetyBetyBetyBetyBetyBetyBetyBetyBetyB", strArray9);
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertNotNull(strArray9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "gagnAAAAAAAAAAistArrayListArrayListavaj.gnalArrayListArrayListArrayLi" + "'", str10, "gagnAAAAAAAAAAistArrayListArrayListavaj.gnalArrayListArrayListArrayLi");
        org.junit.Assert.assertNotNull(wildcardClassArray11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
    }

    @Test
    public void test41458() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest82.test41458");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOfIgnoreCase("LANG.GNALJAVA.LANGAVAJ.GNALJAVA.LANGAVAJ.GNALJAVA.LANGAVAJ.GNALJAVA.LA", "A44444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444", 7);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test41459() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest82.test41459");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringAfterLast("CEAJ V AL", "             aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa...");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test41460() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest82.test41460");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("L.ArrayList", "GN");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.getCommonPrefix(strArray2);
        java.lang.String str5 = org.apache.commons.lang3.ClassUtils.getPackageCanonicalName((java.lang.Object) str3, "javajavajavajavajavajavajavajavajavajavajavajavajavajavajavajavajavajavajavajavajavajavajavajavajavajavajavajavajavajavajavajavajavajava");
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "L.ArrayList" + "'", str3, "L.ArrayList");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "java.lang" + "'", str5, "java.lang");
    }

    @Test
    public void test41461() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest82.test41461");
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("4444444444444", "       aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", 47);
        java.lang.String[] strArray7 = org.apache.commons.lang3.StringUtils.split("GNALaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaagn                                            ", "java.utiljava.util");
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.concat((java.lang.Object[]) strArray7);
        java.lang.String[] strArray9 = org.apache.commons.lang3.StringUtils.stripAll(strArray7);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str10 = org.apache.commons.lang3.StringUtils.replaceEach("..avajgnal.avajgnal.avajgnal.avajgnal.avajgnal.avajgnal.avajgnal.avajgnal.avajgnal.avajgnal...aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", strArray4, strArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Search and Replace array lengths don't match: 1 vs 2");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "GNALgn                                            " + "'", str8, "GNALgn                                            ");
        org.junit.Assert.assertNotNull(strArray9);
    }

    @Test
    public void test41462() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest82.test41462");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("ULANGrrVyList", "GGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGNJAVALAGNGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGG");
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test41463() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest82.test41463");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBeforeLast("ajgnal.", "vv4yL444vv4yL444vv4yL444vv4yL444vv4yL444vv4yL444vv4yL444vv4yL444vv4yL444vv4yL444vv4yL444vv4yL444vv4yL444vv4yL444vv4yL444vv4yL444vv4yL444vv4yL444vv4yL444vv4yL444vv4yL444vv4yL444vv4yL444vv4yL444vv4yL444vv4yL444vv4yL444vv4yL444vv4yL444vv4yL444vv4yL444vv4yL444vv4yL444vv4yL444vv4yL444vv4yL444vv4yL444vv4yL444vv4yL444vv4yL444vv4yL444vv4yL444vv4yL444vv4yL444vv4yL444vv4yL444vv4yL444vv4yL444vv4yL444vv4yL444vv4yL444$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$avalitu.$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "ajgnal." + "'", str2, "ajgnal.");
    }

    @Test
    public void test41464() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest82.test41464");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphanumericSpace((java.lang.CharSequence) "javatsilyarratsilyarratsilyarra");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test41465() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest82.test41465");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAsciiPrintable((java.lang.CharSequence) "AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA       ...AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA       ...AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA       ...AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA       ...AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA       ...AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA       ...AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA       ...AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA       ...AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA       ...AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA       ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test41466() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest82.test41466");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substring("AVAJ..........AVAJ..........AVAJ..........AVAJ..........AVAJ..........AVAJ..........AVAJ..........AVAJ..........AVAJ..........AVAJ..........AVAJ..........AVAJ..........AVAJ..........AVAJ..........AVAJ..........AVAJ..........AVAJ..........AVAJ..........AVAJ..........AVAJ..........AVAJ..........AVAJ..........AVAJ..........AVAJ..........AVAJ..........AVAJ..........AVAJ..........AVAJ..........AVAJ..........AVAJ..........AVAJ..........AVAJ..........AVAJ..........AVAJ..........AVAJ..........AVAJ", 481);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + ".........AVAJ" + "'", str2, ".........AVAJ");
    }

    @Test
    public void test41467() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest82.test41467");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("interface java.lang.CloneableJAVA.UTILJAVA.UTILStringcJAVA.UTILJAVA.UTILStringcJAVA.UTILJAVA.UTILStringcJAVA.UTILJAVA.UTILStringcJAVA.UTILJAVA.UTILStringcJAVA.UTILJAVA.UTILStringcJAVA.UTILJAVA.UTILStringcJAVA.UTILJAVA.UTILStringcJAVA.UTILJAVA.UTILStringcJAVA.UTILJAVA.UTILStringcJAVA.UTILJAVA.UTILStringcJAVA.UTILJAVA.UTILStringcJAVA.UTILJAVA.UTILStringcJAVA.UTILJAVA.UTILStringcJAVA.UTILJAVA.UTILStringcJAVA.UTILJAVA.UTILStringcJAVA.UTILJAVA.UTILSlitulitulitulitulitul####litulitulitulitulitulringcJAVA.UTILJAVA.UTILStringcJAVA.UTILJAVA.UTILStringcJAVA.UTILJAVA.UTILinterface java.io.Serializable", "L.ArrayList", 460);
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void test41468() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest82.test41468");
        java.lang.CharSequence charSequence2 = org.apache.commons.lang3.StringUtils.defaultIfEmpty((java.lang.CharSequence) "...aaaaaaaaj v aaaaaaaaaaj v aaaaaaaaaaj v interf ceaj v aioaSeri liz ble", (java.lang.CharSequence) "JAVA.IO.sERIALIZABLE JAVA.LANG.cLONEABLEsTRINGINTERFACE INTERFACE");
        org.junit.Assert.assertEquals("'" + charSequence2 + "' != '" + "...aaaaaaaaj v aaaaaaaaaaj v aaaaaaaaaaj v interf ceaj v aioaSeri liz ble" + "'", charSequence2, "...aaaaaaaaj v aaaaaaaaaaj v aaaaaaaaaaj v interf ceaj v aioaSeri liz ble");
    }

    @Test
    public void test41469() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest82.test41469");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringAfterLast("javaaaaaaaaaava.langava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.lang$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$", "interface java.lang.Cloneablegnal.avajgnal..LANGgnal.avajgnal.interface java.io.Serializabl");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test41470() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest82.test41470");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass1 = org.apache.commons.lang3.ClassUtils.getClass("##########################java.lang");
            org.junit.Assert.fail("Expected exception of type java.lang.ClassNotFoundException; message: ##########################java.lang");
        } catch (java.lang.ClassNotFoundException e) {
            // Expected exception.
        }
    }

    @Test
    public void test41471() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest82.test41471");
        int int1 = org.apache.commons.lang3.StringUtils.length((java.lang.CharSequence) "                                                                                                              GNALgn");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 116 + "'", int1 == 116);
    }

    @Test
    public void test41472() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest82.test41472");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBetween("$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$                                            #$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$", "lbazilaireS.oi.avaj ecafretni4elbaenolC.gnal.avaj ecafretni");
        org.junit.Assert.assertNull(str2);
    }

    @Test
    public void test41473() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest82.test41473");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBeforeLast("                                                                  litu                                                                  ", "... ... ... ... ... ... ... ...                                                             ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                                                  litu                                                                  " + "'", str2, "                                                                  litu                                                                  ");
    }

    @Test
    public void test41474() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest82.test41474");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.remove("                                                                   ", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa                   GNsL.sVsJaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                                                   " + "'", str2, "                                                                   ");
    }

    @Test
    public void test41475() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest82.test41475");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.chomp("#####################################################                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                            ", "...444444444444444444444444444444444444444444444444444");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "#####################################################                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                            " + "'", str2, "#####################################################                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                            ");
    }

    @Test
    public void test41476() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest82.test41476");
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("...       ", "hi!", (int) (byte) 0);
        java.lang.String str5 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray4);
        java.lang.String[] strArray6 = org.apache.commons.lang3.StringUtils.stripAll(strArray4);
        boolean boolean7 = org.apache.commons.lang3.StringUtils.endsWithAny("ylist                            rraylist                            rraylist                            rray$arraylis", strArray6);
        java.lang.String str9 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray6, "Java.litu.avajlitu.avajjava.litu.avajlitu.avajjava.litu.avajlitu.avajjava.litu.avajlitu.avajjava.litu.avajlitu.avajjava.litu.avajlitu.avajjava.litu.avajlitu.avajjava.litu.avajlitu.avajjava.litu.avajlitu.avajjava.litu.avajlitu.avajjava.litu.avajlitu.avajjava.litu.avajlitu.avajjava.litu.avajlitu.avajjava.litu.avajlitu.avajjava.litu.avajlitu.avajjava.litu.avajlitu.avajjava.litu.avajlitu.avajjava.litu.avajlitu.avajjava.litu.avajlitu.avajjava.litu.avajlitu.avajjava.litu.avajlitu.avajjava.litu.avajlitu.avajjava.litu.avajlitu.avajjava.litu.avajlitu.avajjava.litu.avajlitu.avajjava.litu.avajlitu.avajjava.litu.avajlitu.avajjava.litu.avajlitu.avajjava.litu.avajlitu.avajjava.litu.avajlitu.avajjava.litu.avajlitu.avajjava.litu.avajlitu.avajjava.litu.avajlitu.avaj");
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "...       " + "'", str5, "...       ");
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "..." + "'", str9, "...");
    }

    @Test
    public void test41477() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest82.test41477");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "                                                                                                                                                                                                                                                                                                                                                                JAVA.LANGAGNAL.AVAJGNAL..LANGGNAL.AVARRCLASS JAVA.LANG.OBJECTYLISTARRCLASS JAVA.LANG.OBJECTYLISTA                                        ", "SERIALIZABLE");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 353 + "'", int2 == 353);
    }

    @Test
    public void test41478() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest82.test41478");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripToNull("interfce jv.lng.cloneble################################################################################################################################");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "interfce jv.lng.cloneble################################################################################################################################" + "'", str1, "interfce jv.lng.cloneble################################################################################################################################");
    }

    @Test
    public void test41479() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest82.test41479");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.leftPad("interface java.lang.Cloneable$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$interface java.io.Serializable", 51, "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "interface java.lang.Cloneable$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$interface java.io.Serializable" + "'", str3, "interface java.lang.Cloneable$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$interface java.io.Serializable");
    }

    @Test
    public void test41480() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest82.test41480");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.center("hi!arraylistarraylistarraylistavaj.... aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa... aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa... aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa... aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa... aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa... aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa... aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa... aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa... aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa... ", 141, '$');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!arraylistarraylistarraylistavaj.... aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa... aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa... aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa... aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa... aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa... aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa... aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa... aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa... aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa... " + "'", str3, "hi!arraylistarraylistarraylistavaj.... aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa... aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa... aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa... aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa... aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa... aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa... aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa... aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa... aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa... ");
    }

    @Test
    public void test41481() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest82.test41481");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.reverseDelimited("SILYARRA!IH........", '#');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "SILYARRA!IH........" + "'", str2, "SILYARRA!IH........");
    }

    @Test
    public void test41482() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest82.test41482");
        int int1 = org.apache.commons.lang3.StringUtils.length((java.lang.CharSequence) "interface java.util.List4444444444444444444444444444444444INGuTILSsTRINGuTILSinterface java.util.Collection4444444444444444444444444444444444INGuTILSsTRINGuTILSinterface java.lang.Iterable4444444444444444444444444444444444INGuTILSsTRINGuTILSinterface java.util.RandomAccess4444444444444444444444444444444444INGuTILSsTRINGuTILSinterface java.lang.Cloneable4444444444444444444444444444444444INGuTILSsTRINGuTILSinterface java.io.Serializable");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 438 + "'", int1 == 438);
    }

    @Test
    public void test41483() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest82.test41483");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.abbreviateMiddle("elbazilaireS.oi.avaj ecafretnielbaenolC.gnal.avaj ecafretni", "erface java.lang.CloneableJ#v#.l#ngj#v#.l#ngj#v#.l#ngj#v#.l#ngj#v#.l#ngj#v#.l#ngj#v#.l#ngj#v#.l#ngj#v#.l#ngj#v#.l#ngj#v#.l#ngj#v#.l#ngj#v#.l#ngj#v#.l#ngj#v#.l#ngj#v#.l#ngj#v#.l#ngj#v#.l#ngj#v#.l#ngj#v#.l#ngj#v#.l#ngj#v#.l#ngj#v#.l#ngj#v#.l#ngj#v#.l#ngj#v#.l#ngj#v#.l#ngj#v#.l#ngj#v#.l#ngj#v#.l#ngj#v#.l#ngj#v#.l#ngj#v#.l#nginterface java.io.Serializable", (int) (byte) 0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "elbazilaireS.oi.avaj ecafretnielbaenolC.gnal.avaj ecafretni" + "'", str3, "elbazilaireS.oi.avaj ecafretnielbaenolC.gnal.avaj ecafretni");
    }

    @Test
    public void test41484() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest82.test41484");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.remove("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa...", "INTERFACE JAVA.LANG.cLONEABLEa RRR RRR RRR RRR RRR RRR RRR RRR RNAL....................INTERFACE JAVA.");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa..." + "'", str2, "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa...");
    }

    @Test
    public void test41485() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest82.test41485");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.uncapitalize((java.lang.CharSequence) "44444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444Character");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "44444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444Character" + "'", str1, "44444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444Character");
    }

    @Test
    public void test41486() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest82.test41486");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringAfterLast("javaaaaaaaaaa.............................................................4a44                                                                                   ", "...AJ..........AVAJ..........AVAJ..........AVAJ..........AVAJ.......ELBAENOLc.GNAL.AVAJ ECAFRETN");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test41487() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest82.test41487");
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.splitByCharacterTypeCamelCase("irfCo$irfioSriiz");
        java.lang.String str5 = org.apache.commons.lang3.StringUtils.concatWith("Seria", (java.lang.Object[]) strArray4);
        int int6 = org.apache.commons.lang3.StringUtils.lastIndexOfAny("AAAAAAAAAA", strArray4);
        int int7 = org.apache.commons.lang3.StringUtils.indexOfAny("interface java.lang.CloneableLANG.GNALJAVA.LANGAVAJ.GNALJAVA.LANGAV...                                                                                                                                                                                                                                                                                                                                                                                                                                               ", strArray4);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "irfSeriaCoSeria$SeriairfioSeriaSriiz" + "'", str5, "irfSeriaCoSeria$SeriairfioSeriaSriiz");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
    }

    @Test
    public void test41488() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest82.test41488");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.right("#########################################################################################yList", 466);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "#########################################################################################yList" + "'", str2, "#########################################################################################yList");
    }

    @Test
    public void test41489() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest82.test41489");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphanumeric((java.lang.CharSequence) "interfacegaga.l");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test41490() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest82.test41490");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.endsWithIgnoreCase("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaastrin", "A..ayLA.44444444444444444444444444aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test41491() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest82.test41491");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replace("NTERFACE JAVA.LANG.cLONEABLE.......JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVAINTERFACE JAVA.IO.sERIALIZABLE", "interface java.lang.Cloneablevv4yL444vv4yL444vv4yL444vv4yL444vv4yL444vv4yL444vv4yL444vv4yL444vv4yL444vv4yL444vv4yL444vv4yL444vv4yL444vv4yL444vv4yL444vv4yL444vv4yL444vv4yL444vv4yL444vv4yL444vv4yL444vv4yL444vv4yL444vv4yL444vv4yL444vv4yL444vv4yL444vv4yL444vv4yL444vv4yL444vv4yL444vv4yL444vv4yL444vv4yL444vv4yL444vv4yL444vv4yL444vv4yL444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444litu.avajlitu.avajArrayListArrayListArrayListavajGNAL.AVAJLANG.JAVAGNAL.AVAJLANG.JAVAGNAL.AVAJLANG....", "                                                                                                                                                                                                                                                                                                                                                                                                            44444444444444444444444444444444444444444444444444444444444444444444444444444444         $                 aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "NTERFACE JAVA.LANG.cLONEABLE.......JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVAINTERFACE JAVA.IO.sERIALIZABLE" + "'", str3, "NTERFACE JAVA.LANG.cLONEABLE.......JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVAINTERFACE JAVA.IO.sERIALIZABLE");
    }

    @Test
    public void test41492() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest82.test41492");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringAfter("ti.tiCLASSJAVALANGCLASSJAVAULANGJAVAULANGJAVAULANGJAVAULANGJAVAULANGJAVAULANGJAVAULANGJAVAULANGJAVAULANGJAVAULANGJAVAULANGJAVAULANGJAVAULANGJAVAULANGJAVAULANGJAVAULANGJAVAULANGJAVAULANGJAVAULANGJAVAULANG", "....JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVAINTERFACEJAVA.IO");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test41493() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest82.test41493");
        java.util.Locale locale1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.apache.commons.lang3.StringUtils.lowerCase("44444444444444444gnaluavaj44444444444444444444444444444444444444444444444444444444444444444444444", locale1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test41494() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest82.test41494");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.center("INTERFACEJAVA.LANG.CLONEABLELANG.GNALJAVA.LANGAVAJ.GNALJAVA.LANGAVAJ.GNALJAVA.LANGAVAJ.GNALJAVA.LANGAVAJ.GNALJAVA.LANGAVAJ.GNALJAVA.LANGAVAJ.GNALJAVA.LANGAVAJ.GNALJAVA.LANGAVAJ.JAVAINTERFACEJAVA.IO", 457, '$');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$INTERFACEJAVA.LANG.CLONEABLELANG.GNALJAVA.LANGAVAJ.GNALJAVA.LANGAVAJ.GNALJAVA.LANGAVAJ.GNALJAVA.LANGAVAJ.GNALJAVA.LANGAVAJ.GNALJAVA.LANGAVAJ.GNALJAVA.LANGAVAJ.GNALJAVA.LANGAVAJ.JAVAINTERFACEJAVA.IO$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$" + "'", str3, "$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$INTERFACEJAVA.LANG.CLONEABLELANG.GNALJAVA.LANGAVAJ.GNALJAVA.LANGAVAJ.GNALJAVA.LANGAVAJ.GNALJAVA.LANGAVAJ.GNALJAVA.LANGAVAJ.GNALJAVA.LANGAVAJ.GNALJAVA.LANGAVAJ.GNALJAVA.LANGAVAJ.JAVAINTERFACEJAVA.IO$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$");
    }

    @Test
    public void test41495() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest82.test41495");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substring("", 93);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test41496() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest82.test41496");
        char[] charArray15 = new char[] { ' ', ' ', '#', 'a', '4', 'a' };
        int int16 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "", charArray15);
        boolean boolean17 = org.apache.commons.lang3.StringUtils.containsAny("......", charArray15);
        int int18 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "AAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAA", charArray15);
        int int19 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "JAVA.LANGAVAJ.GNALJAVA.LANGAVAJ.GNALJAVA.LANGAVAJ.GNALJAVA.LANGAVAJ.GNALJAVA.LANGAVAJ.GNALJAVA.LANGAVAJ.GNALJAVA.LANGAVAJ.GNALJAVA.LANGAVAJ.GNALJAVA.LANG", charArray15);
        int int20 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "interface java.lang.CloneableAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAringinterface java.io.Serializable", charArray15);
        int int21 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaylist", charArray15);
        boolean boolean22 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "...               ...esl.avaj#ecafretnielbazilaires.oi.avaj#ecafretni4elbaenolc.gnal.avaj#ecafretni", charArray15);
        boolean boolean23 = org.apache.commons.lang3.StringUtils.containsAny("utilString.utilString-1java.-1java", charArray15);
        boolean boolean24 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "jAVA.L$A", charArray15);
        org.junit.Assert.assertNotNull(charArray15);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray15), "  #a4a");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray15), "  #a4a");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray15), "[ ,  , #, a, 4, a]");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
    }

    @Test
    public void test41497() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest82.test41497");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.startsWith("gn gnal.avaj#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#lass java#lang#String#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#lass java#lang#", "gnal                                                                1AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test41498() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest82.test41498");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "ArrayLi", "lang.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.1aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaajava.1aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa.1aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa.1aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa.1aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa.1aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa.1aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa.1aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa.1aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test41499() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest82.test41499");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.strip("                                                                                    .lan                                                                                     ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + ".lan" + "'", str1, ".lan");
    }

    @Test
    public void test41500() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest82.test41500");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass1 = org.apache.commons.lang3.ClassUtils.getClass("u");
            org.junit.Assert.fail("Expected exception of type java.lang.ClassNotFoundException; message: u");
        } catch (java.lang.ClassNotFoundException e) {
            // Expected exception.
        }
    }
}

