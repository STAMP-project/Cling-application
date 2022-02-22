import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest80 {

    public static boolean debug = false;

    @Test
    public void test40001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest80.test40001");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.center("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaajAVAAAAAAAAAAVA.LANG..va.langGNAL..la..                              aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", 893, "elb4zil4ireS.......j4v4..........j4v4..........j4v4..........j4v4..........j4v4..........j4v4..........j4v4..........j4v4..........j4v4..........j4v4..........j4v4..........j4v4..........j4v4..........j4v4..........j4v4..........j4v4..........j4v4..........j4v4..........j4v4..........j4v4..........j4v4..........j4v4..........j4v4..........j4v4..........j4v4..........j4v4..........j4v4..........j4v4..........j4v4..........j4v4..........j4v4..........j4v4..........j4v4..........j4v4..........j4v4nignirtSelb4enolC.gn4l.4v4j ec4fretni");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaajAVAAAAAAAAAAVA.LANG..va.langGNAL..la..                              aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa" + "'", str3, "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaajAVAAAAAAAAAAVA.LANG..va.langGNAL..la..                              aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
    }

    @Test
    public void test40002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest80.test40002");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.split("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaava.langjava.langjava.lang... .... .java.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.lang... ....", '.');
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test40003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest80.test40003");
        char[] charArray16 = new char[] { ' ', ' ', '#', 'a', '4', 'a' };
        int int17 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "", charArray16);
        boolean boolean18 = org.apache.commons.lang3.StringUtils.containsAny("......", charArray16);
        int int19 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "AAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAA", charArray16);
        int int20 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "JAVA.LANGAVAJ.GNALJAVA.LANGAVAJ.GNALJAVA.LANGAVAJ.GNALJAVA.LANGAVAJ.GNALJAVA.LANGAVAJ.GNALJAVA.LANGAVAJ.GNALJAVA.LANGAVAJ.GNALJAVA.LANGAVAJ.GNALJAVA.LANG", charArray16);
        boolean boolean21 = org.apache.commons.lang3.StringUtils.containsAny("gnal.avajgnal..LANGgnal.avajgnal.", charArray16);
        boolean boolean22 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "STRING", charArray16);
        boolean boolean23 = org.apache.commons.lang3.StringUtils.containsAny("class java.lang.Object", charArray16);
        boolean boolean24 = org.apache.commons.lang3.StringUtils.containsAny("                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                    JAVA.LANGAVAJ.GNALJAVA.LANGAVAJ.GNALJAVA.LANGAVAJ.GNALJAVA.LANGAVAJ.GNALJAVA.LANGAVAJ.GNALJAVA.LANGAVAJ.GNALJAVA.LANGAVAJ.GNALJAVA.LANGAVAJ.GNALJAVA.LANG", charArray16);
        boolean boolean25 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA      ", charArray16);
        int int26 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "                                                                                                                                                                                                                                                                                                                                                            ", charArray16);
        org.junit.Assert.assertNotNull(charArray16);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray16), "  #a4a");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray16), "  #a4a");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray16), "[ ,  , #, a, 4, a]");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + (-1) + "'", int26 == (-1));
    }

    @Test
    public void test40004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest80.test40004");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.equals((java.lang.CharSequence) "                                                                                                                                                               AAAAAAAAAAAAAAAAAAAgnaluavajAAAAAAAAAAAAAAAAAAA                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                           ", (java.lang.CharSequence) "hi!ArrayListArrayListArrayListavaj....AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA...AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA...AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA...AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA...AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA...AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA...AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA...AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA...AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA...");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test40005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest80.test40005");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.split("...                                            ..                                            ..                                            ..                                            ..                                            ..                                            ..                                            ..                                            ..                                            ..                                            ..                                            .", "...................................................................................................................................................................................................................................................AyLis");
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test40006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest80.test40006");
        java.lang.CharSequence charSequence0 = null;
        java.lang.CharSequence charSequence2 = org.apache.commons.lang3.StringUtils.defaultIfBlank(charSequence0, (java.lang.CharSequence) "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa...aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertEquals("'" + charSequence2 + "' != '" + "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa...aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa" + "'", charSequence2, "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa...aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
    }

    @Test
    public void test40007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest80.test40007");
        java.lang.ClassLoader classLoader0 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass3 = org.apache.commons.lang3.ClassUtils.getClass(classLoader0, "INGuTILSsTRINGuTILS", false);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassNotFoundException; message: INGuTILSsTRINGuTILS");
        } catch (java.lang.ClassNotFoundException e) {
            // Expected exception.
        }
    }

    @Test
    public void test40008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest80.test40008");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceChars("...sjlaga.gL.AaagyLvsj...gL.AaagyLvsjlaga.gL.", '.', '.');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "...sjlaga.gL.AaagyLvsj...gL.AaagyLvsjlaga.gL." + "'", str3, "...sjlaga.gL.AaagyLvsj...gL.AaagyLvsjlaga.gL.");
    }

    @Test
    public void test40009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest80.test40009");
        int int3 = org.apache.commons.lang3.StringUtils.indexOfIgnoreCase("$$$$$$$$$$$$$$$$$$$$$$$$$$$$$..                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                               ", "...sAitUJAirtSsAitUJAirtSsAitUJAirtSsAitUJAirtSsAitUJAirtSsAitUJAirtSsAitUJAirtSsAitUJAirtSsAitUJAirtS...sAitUJAirtSsAitUJAirtSsAitUJAi", 149);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test40010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest80.test40010");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substring("      ][GNIRTSLITU.AVAJ1", 693);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test40011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest80.test40011");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.deleteWhitespace("                                      A..ayL a");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "A..ayLa" + "'", str1, "A..ayLa");
    }

    @Test
    public void test40012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest80.test40012");
        int int3 = org.apache.commons.lang3.StringUtils.indexOf("S                           ", (int) ' ', 198);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test40013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest80.test40013");
        java.lang.CharSequence charSequence2 = org.apache.commons.lang3.StringUtils.defaultIfBlank((java.lang.CharSequence) "avajssalC", (java.lang.CharSequence) "aRRAYlISTaRRAYlISTaRRAYlISTAVAJAGNA");
        org.junit.Assert.assertEquals("'" + charSequence2 + "' != '" + "avajssalC" + "'", charSequence2, "avajssalC");
    }

    @Test
    public void test40014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest80.test40014");
        int int2 = org.apache.commons.lang3.StringUtils.indexOf("...avagnal.avajlang.javagnal.avajlang.javagnal....", 948);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test40015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest80.test40015");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("                                                                                                                                                                                                                                                                                                                                                          javal#.#agn       aaaaaaaaaaaaaaaaaaaaaaaaa                                                                                                                                                                                                                                                                                                                                                         ", "JAVA.LITU.AVAJLITU.AVAJJAVA.LITU.AVAJLITU.AVAJJAVA.LITU.AVAJLITU.AVAJJAVA.LITU.AVAJLITU.AVAJJAVA.LITU.AVAJLITU.AVAJJAVA.LITU.AVAJLITU.AVAJJAVA.LITU.AVAJLITU.AVAJJAVA.LITU.AVAJLITU.AVAJJAVA.LITU.AVAJLITU.AVAJJAVA.LITU.AVAJLITU.AVAJJAVA.LITU.AVAJLITU.AVAJJAVA.LITU.AVAJLITU.AVAJJAVA.LITU.AVAJLITU.AVAJJAVA.LITU.AVAJLITU.AVAJJAVA.LITU.AVAJLITU.AVAJJAVA.LITU.AVAJLITU.AVAJJAVA.LITU.AVAJLITU.AVAJJAVA.LITU.AVAJLITU.AVAJJAVA.LITU.AVAJLITU.AVAJJAVA.LITU.AVAJLITU.AVAJJAVA.LITU.AVAJLITU.AVAJJAVA.LITU.AVAJLITU.AVAJJAVA.LITU.AVAJLITU.AVAJJAVA.LITU.AVAJLITU.AVAJJAVA.LITU.AVAJLITU.AVAJJAVA.LITU.AVAJLITU.AVAJJAVA.LITU.AVAJLITU.AVAJJAVA.LITU.AVAJLITU.AVAJJAVA.LITU.AVAJLITU.AVAJJAVA.LITU.AVAJLITU.AVAJJAVA.LITU.AVAJLITU.AVAJJAVA.LITU.AVAJLITU.AVAJJAVA.LITU.AVAJLITU");
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test40016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest80.test40016");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitByCharacterType("javal####################");
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test40017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest80.test40017");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.containsWhitespace("SirtSirtSirtSirtSirtSirtSirtSirtSirtSirtSstring.nal.avajecafretnistring.nal.avajecafretnistring.nal.avajecafretnistring.nal.avajecafretnistring.nal.avajecafretnistring.nal.avajecafretnistring.nal.avajecafretnistring.nal.avajecafretnistring.nal.avajecafretnistring.nal.avajecafretnistring.nal.avajecafretnistring.nal.avajecafretnistring.nal.avajecafretnistring.nal.avajecafretnistring.nal.avajecafretnistring.nal.avajecafretnistring.nal.avajecafretnistring.nal.avajecafretnistring.nal.avajecafretnistring.nal.avajecafretnistring.nal.avajecafretnistring.nal.avajecafretnistring.nal.avajecafretnistring.nal.avajecafretnistring.nal.avajecafretnistring.nal.avajecafretnistring.nal.avajecafretn");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test40018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest80.test40018");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("gn gnal.avajg", "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                              IOINTERFACEJAVAIN", 993);
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void test40019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest80.test40019");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.strip("GNAL");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "GNAL" + "'", str1, "GNAL");
    }

    @Test
    public void test40020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest80.test40020");
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("ang                                             ang                                              ", "444444444444444444444444444444", 110);
        java.lang.String str5 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray4);
        java.lang.String[] strArray7 = org.apache.commons.lang3.StringUtils.splitByCharacterTypeCamelCase("slitUgnirtS");
        java.lang.String[] strArray9 = org.apache.commons.lang3.StringUtils.stripAll(strArray7, "AVAJ.GNAL......j.v...........j.v...........j.v...........j.v...........j.v...........j.v...........j.v...........j.v...........j.v...........j.v...........j.v...........j.v...........j.v...........j.v...........j.v...........j.v...........j.v...........j.v...........j.v...........j.v...........j.v...........j.v...........j.v...........j.v...........j.v...........j.v...........j.v...........j.v...........j.v...........j.v...........j.v...........j.v.i.terf.ce j.v..io.Seri.aiz.bae");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str10 = org.apache.commons.lang3.StringUtils.replaceEach("i4elbaenolCAgnalAavajiecafretniTRINGi4elbaenolCAgnalAavajieca", strArray4, strArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Search and Replace array lengths don't match: 1 vs 3");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "ang                                             ang                                              " + "'", str5, "ang                                             ang                                              ");
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertNotNull(strArray9);
    }

    @Test
    public void test40021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest80.test40021");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass2 = org.apache.commons.lang3.ClassUtils.getClass("                        L.Arr#yList", false);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassNotFoundException; message: L.Arr#yList");
        } catch (java.lang.ClassNotFoundException e) {
            // Expected exception.
        }
    }

    @Test
    public void test40022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest80.test40022");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.chomp("utilLutilLutilLutilLutilLutilLutilLutilLutilLutilLutilLutilLutilLutilLutilLutilLutilLutilLutilLutilLutilLutilLutilLutilLutilLutilLutilLutilLutilLutilLutilLutilLutiL", "ttBysINTER");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "utilLutilLutilLutilLutilLutilLutilLutilLutilLutilLutilLutilLutilLutilLutilLutilLutilLutilLutilLutilLutilLutilLutilLutilLutilLutilLutilLutilLutilLutilLutilLutilLutiL" + "'", str2, "utilLutilLutilLutilLutilLutilLutilLutilLutilLutilLutilLutilLutilLutilLutilLutilLutilLutilLutilLutilLutilLutilLutilLutilLutilLutilLutilLutilLutilLutilLutilLutilLutiL");
    }

    @Test
    public void test40023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest80.test40023");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripAccents((java.lang.CharSequence) "Arra");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Arra" + "'", str1, "Arra");
    }

    @Test
    public void test40024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest80.test40024");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.split("                                                                                                                                                                                                                 util                                                                                                                                                                                                                  ", ".langGNAL..langjava.langAGNAL.AVAJAAAAjGNALAAAAAjAAAAAAAAjAG");
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test40025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest80.test40025");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "                                    444444444444444444444444444...444444444444444444444444444...444444444444444444444444444...444444444444444444444444444...444444444444444444444444444...444444444444444444444444444...444444444444444444444444444...444444444444444444444444444...444444444444444444444444444...444444444444444444444444444...4444444][ssalCGNIRTGNIRTGNIRTGNIRTGNIRTGNIRTGNIRTGNIRTGNIRTGNIRTGNIRTGNIRTGNIRTGNIRTGNIRTGNIRTGNIRTGNIRTGNIRTGNIR                                     ", "jbOgnlvjsslsiyjb");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test40026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest80.test40026");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.chomp("serializable.io.javainterface java.java.java.java.java.java.java.java.java.java.java.java.java.java.java.java.java.java.java.java.java.java.java.java.java.java.java.java.java.java.java.java.java.java.java.cloneable.lang.interface java", "444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444interfacejava.lang.Cloneable4iGNIRTinterfacejava.lang.Cloneable4i444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "serializable.io.javainterface java.java.java.java.java.java.java.java.java.java.java.java.java.java.java.java.java.java.java.java.java.java.java.java.java.java.java.java.java.java.java.java.java.java.java.cloneable.lang.interface java" + "'", str2, "serializable.io.javainterface java.java.java.java.java.java.java.java.java.java.java.java.java.java.java.java.java.java.java.java.java.java.java.java.java.java.java.java.java.java.java.java.java.java.java.cloneable.lang.interface java");
    }

    @Test
    public void test40027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest80.test40027");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trimToNull("$$$$$$$$$$$$$$$$$$$$$$$$$$$$");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "$$$$$$$$$$$$$$$$$$$$$$$$$$$$" + "'", str1, "$$$$$$$$$$$$$$$$$$$$$$$$$$$$");
    }

    @Test
    public void test40028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest80.test40028");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceChars("INTERFACE JAVA.LANG.CLONEABLE...                                 INTERFACE JAVA.IO.SERIALIZABLE", 'a', '4');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "INTERFACE JAVA.LANG.CLONEABLE...                                 INTERFACE JAVA.IO.SERIALIZABLE" + "'", str3, "INTERFACE JAVA.LANG.CLONEABLE...                                 INTERFACE JAVA.IO.SERIALIZABLE");
    }

    @Test
    public void test40029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest80.test40029");
        java.lang.String str1 = org.apache.commons.lang3.ClassUtils.getPackageName("                                              langaaaaa                                               ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
    }

    @Test
    public void test40030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest80.test40030");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceChars("gnaaaaaa...aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "JAVAlLANG                                                                                ", "....................................................................                       jvulng");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "gnaaaaaa...aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa" + "'", str3, "gnaaaaaa...aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
    }

    @Test
    public void test40031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest80.test40031");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.endsWithIgnoreCase("1AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA", "javal#4#agn4444444aaaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test40032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest80.test40032");
        int int3 = org.apache.commons.lang3.StringUtils.indexOf(" gnirt", 108, 67);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test40033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest80.test40033");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.lowerCase("...AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA...AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA...AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA...AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA...AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA...AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA...AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA...AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA...AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA.");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "...aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa...aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa...aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa...aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa...aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa...aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa...aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa...aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa...aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa." + "'", str1, "...aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa...aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa...aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa...aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa...aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa...aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa...aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa...aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa...aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa.");
    }

    @Test
    public void test40034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest80.test40034");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphanumeric((java.lang.CharSequence) "444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444...                                        ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test40035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest80.test40035");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOf("AVAJ.GNAL......j.v...........j.v...........j.v...........j.v...........j.v...........j.v...........j.v...........j.v...........j.v...........j.v...........j.v...........j.v...........j.v...........j.v...........j.v...........j.v...........j.v...........j.v...........j.v...........j.v...........j.v...........j.v...........j.v...........j.v...........j.v...........j.v...........j.v...........j.v...........j.v...........j.v...........j.v...........j.v.i.terf.ce j.v..io.Seri.aiz.bae", "############44444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444", 905);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test40036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest80.test40036");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringAfter("java.io.Serializable interface java.lang.Cloneable... interface", "VAgnal.avajgnal.avajgnal.avajgnal.avajgnal.avajgn");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test40037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest80.test40037");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeEnd("aaaaaaaaA..yL A.4444444444...A..yL A.4444444444...A..yL A.4444444444...A..yL A.4444444444...A..yL A.4444444444...A..yL A.4444444444...A..yL A.4444444444...A..yL A.4444444444...A..yL A.4444444444...A..yL A.4444444444...A..yL A.4444444444...A..yL A.4444444444...A..yL A.4444444444...A..yL A.4444444444...A..yL A.4444444444...A..yL A.4444444444...A..yL A.4444444444...A..yL A.4444444444...A..yL A.4444444444...A..yL A.4444444444...A..yL A.4444444444...A..yL A.4444444444...A..yL A.4444444444...A..yL A.4444444444...A..yL A.4444444444...A..yL A.4444444444...A..yL A.4444444444...A..yL A.4444444444...A..yL A.4444444444...A..yL A.4444444444...A..yL A.4444444444...A..yL A.4444444444...A..yL A.4444444444...A..yL A.4444444444...A..yL A.4444444444...A..yL A.4444444444...A..yL A.4444444444...A..yL A.4444444444...A..yL A.4444444444...A..yL A.4444444444...A..yL A.4444444444...A..yL A.4444444444...A..yL A.4444444444...A..yL A.4444444444...A..yL A.44", "ARRYLIST $ $ $ $ $ $ $ $ $ $ $ $ ...");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "aaaaaaaaA..yL A.4444444444...A..yL A.4444444444...A..yL A.4444444444...A..yL A.4444444444...A..yL A.4444444444...A..yL A.4444444444...A..yL A.4444444444...A..yL A.4444444444...A..yL A.4444444444...A..yL A.4444444444...A..yL A.4444444444...A..yL A.4444444444...A..yL A.4444444444...A..yL A.4444444444...A..yL A.4444444444...A..yL A.4444444444...A..yL A.4444444444...A..yL A.4444444444...A..yL A.4444444444...A..yL A.4444444444...A..yL A.4444444444...A..yL A.4444444444...A..yL A.4444444444...A..yL A.4444444444...A..yL A.4444444444...A..yL A.4444444444...A..yL A.4444444444...A..yL A.4444444444...A..yL A.4444444444...A..yL A.4444444444...A..yL A.4444444444...A..yL A.4444444444...A..yL A.4444444444...A..yL A.4444444444...A..yL A.4444444444...A..yL A.4444444444...A..yL A.4444444444...A..yL A.4444444444...A..yL A.4444444444...A..yL A.4444444444...A..yL A.4444444444...A..yL A.4444444444...A..yL A.4444444444...A..yL A.4444444444...A..yL A.44" + "'", str2, "aaaaaaaaA..yL A.4444444444...A..yL A.4444444444...A..yL A.4444444444...A..yL A.4444444444...A..yL A.4444444444...A..yL A.4444444444...A..yL A.4444444444...A..yL A.4444444444...A..yL A.4444444444...A..yL A.4444444444...A..yL A.4444444444...A..yL A.4444444444...A..yL A.4444444444...A..yL A.4444444444...A..yL A.4444444444...A..yL A.4444444444...A..yL A.4444444444...A..yL A.4444444444...A..yL A.4444444444...A..yL A.4444444444...A..yL A.4444444444...A..yL A.4444444444...A..yL A.4444444444...A..yL A.4444444444...A..yL A.4444444444...A..yL A.4444444444...A..yL A.4444444444...A..yL A.4444444444...A..yL A.4444444444...A..yL A.4444444444...A..yL A.4444444444...A..yL A.4444444444...A..yL A.4444444444...A..yL A.4444444444...A..yL A.4444444444...A..yL A.4444444444...A..yL A.4444444444...A..yL A.4444444444...A..yL A.4444444444...A..yL A.4444444444...A..yL A.4444444444...A..yL A.4444444444...A..yL A.4444444444...A..yL A.4444444444...A..yL A.44");
    }

    @Test
    public void test40038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest80.test40038");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.rightPad("Integer                            Inte", 72, 'a');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Integer                            Inteaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa" + "'", str3, "Integer                            Inteaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
    }

    @Test
    public void test40039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest80.test40039");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.split("              Llitu               ", '.');
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test40040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest80.test40040");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.chomp("4444444444444444444444444444444444444444444444444444444ssssssssss4444444444444444444444444444444444444444");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "4444444444444444444444444444444444444444444444444444444ssssssssss4444444444444444444444444444444444444444" + "'", str1, "4444444444444444444444444444444444444444444444444444444ssssssssss4444444444444444444444444444444444444444");
    }

    @Test
    public void test40041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest80.test40041");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.center("gnalArrayListArrayListArrayListavaj.gnalArrayListArrayListArrayLi...aL.ArrayListgnal.aL.ArrayList...aL.ArrayListgnal.aL.ArrayList...aL.ArrayListgnal.aL.aa", 25, "AVAJ.GNALAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA       ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "gnalArrayListArrayListArrayListavaj.gnalArrayListArrayListArrayLi...aL.ArrayListgnal.aL.ArrayList...aL.ArrayListgnal.aL.ArrayList...aL.ArrayListgnal.aL.aa" + "'", str3, "gnalArrayListArrayListArrayListavaj.gnalArrayListArrayListArrayLi...aL.ArrayListgnal.aL.ArrayList...aL.ArrayListgnal.aL.ArrayList...aL.ArrayListgnal.aL.aa");
    }

    @Test
    public void test40042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest80.test40042");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("tavaj.gnalarraylistarraylistarrayli                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                             ", "                                                                                                                                                                                                                                             HI!aRRAYlISTaRRAYlISTaRRAYlISTAVAJ.GNALaRRAYlISTaRRAYlISTaRRAYlIST");
        int int3 = org.apache.commons.lang3.StringUtils.indexOfDifference((java.lang.CharSequence[]) strArray2);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test40043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest80.test40043");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeEnd("cterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterChar", "                                                                                           jlvlLAlng");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "cterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterChar" + "'", str2, "cterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterChar");
    }

    @Test
    public void test40044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest80.test40044");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.endsWithIgnoreCase("L.Arr#yList", "aTSIlYTCEJBoGNALAVAJSSALCRRaTSIlYTCEJBoGNALAVAJSSALCRRaVALANGgnalLANGJAVALANGagnalavajaTSIlYTCEJBoGNALAVAJSSALCRRaTSIlYTCEJBoGNALAVAJSSALCRRaVALANGgnalLANGJAVALANGagnalavajaTSIlYTCEJBoGNALAVAJSSALCRRaTSIlYTCEJBoGNALAVAJSSALCRRaVALANGgnalLANGJAVALANGagnalavajaTSIlYTCEJBoGNALAVAJSSALCRRaTSIlYTCEJsTRINGaTSIlYTCEJBoGNALAVAJSSALCRRaTSIlYTCEJBoGNALAVAJSSALCRRaVALANGgnalLANGJAVALANGagnalavajaTSIlYTCEJBoGNALAVAJSSALCRRaTSIlYTCEJBoGNALAVAJSSALCRRaVALANGgnalLANGJAVALANGagnalavajaTSIlYTCEJBoGNALAVAJSSALCRRaTSIlYTCEJBoGNALAVAJSSALCRRaVALANGgnalLANGJAVALANGagnalavajaTSIlYTCEJBoGNALAVAJSSALCRRaTSIlYTCEJB");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test40045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest80.test40045");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.defaultString("class");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "class" + "'", str1, "class");
    }

    @Test
    public void test40046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest80.test40046");
        java.lang.String[] strArray5 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("javal#.#agn", "", 6);
        boolean boolean6 = org.apache.commons.lang3.StringUtils.endsWithAny("1AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA", strArray5);
        java.lang.String str10 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray5, '.', 380, 126);
        int int11 = org.apache.commons.lang3.StringUtils.lastIndexOfAny("444444444444444444444444444444444444444444444444444444444444444gnJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJgnJJJJJJtvjgnlylstylstyl", strArray5);
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
    }

    @Test
    public void test40047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest80.test40047");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsIgnoreCase("444444444444INTERFACE JAVA.LANG.cLONEABLEsTRINGINTERFACE JAVA.IO.sERIALIZABLE444444444444444444444444444444444444444444444444444444444444444444444444444444444litu.avajlit", "elbazilaireS.oi.avaj ecafretnignirtSelbaenolC.gnal.avaj ecafretni");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test40048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest80.test40048");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("#agnaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaajaval#.aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaajaval#", "class java.lang.Classclass java.lang.Classclass java.lang.Classclass java.lang.Classclass java.lang.Classclass java.lang.Classclass java.lang.Classclass java.lang.Classclass java.lang.Classclass java.lang.Classclass java.lang.Classclass java.lang.Classclass java.lang.Classclass java.lang.Classclass java.lang.Classclass java.lang.Classclass java.lang.Classclass java.lang.Classclass java.lang.Classclass java.lang.Classclass java.lang.Classclass java.lang.Classclass java.lang.Classclass java.lang.Classclass java.lang.Classclass java.lang.Classclass java.lang.Classclass java.lang.Classclass java.lang.Classclass java.lang.Class");
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray2, '4');
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "#agnaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaajaval#.aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaajaval#" + "'", str4, "#agnaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaajaval#.aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaajaval#");
    }

    @Test
    public void test40049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest80.test40049");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsIgnoreCase("arahCretcarahCretcarahCretcarahCretcarahCretcarahCretcarahCretcarahCretcarahCretcarahCretcarahCretcarahCretcarahCretcarahCretcarahCretcarahCretcarahCretcarahCretcarahCretcarahCretcarahCretcarahCretcarahCretcarahCretcarahCretcarahCretcarahCretcarahCretcarahCretcarahCretcarahCretcaraaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa      arahCretcarahCretcarahCretcarahCretcarahCretcarahCretcarahCretcarahCretcarahCretcarahCretcarahCretcarahCretcarahCretcarahCretcarahCretcarahCretcarahCretcarahCretcarahCretcarahCretcarahCretcarahCretcarahCretcarahCretcarahCretcarahCretcarahCretcarahCretcarahCretcarahCretcarahCretcara", "vvayLasavvayLasavvayLasavvayLasavvayLasavvayLasavvayLasavvayLasavvayLasavvayLasavvayLasavvayLasavvayLasavvayLasavvayLasavvayLasavvayLasavvayLasavvayLasavvayLasa");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test40050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest80.test40050");
        char[] charArray14 = new char[] { ' ', ' ', '#', 'a', '4', 'a' };
        int int15 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "", charArray14);
        boolean boolean16 = org.apache.commons.lang3.StringUtils.containsAny("$", charArray14);
        java.lang.String str18 = org.apache.commons.lang3.ClassUtils.getPackageCanonicalName((java.lang.Object) charArray14, "class java.lang.String");
        int int19 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "     A..ayL A.44444444444444444444444444      ", charArray14);
        boolean boolean20 = org.apache.commons.lang3.StringUtils.containsAny("", charArray14);
        int int21 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "                                                interface java.lang.CloneableStringinterface java.io", charArray14);
        boolean boolean22 = org.apache.commons.lang3.StringUtils.containsAny(".lang.Stringclass j...", charArray14);
        boolean boolean23 = org.apache.commons.lang3.StringUtils.containsAny("jva..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java", charArray14);
        boolean boolean24 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "44444444444444444444444444...", charArray14);
        org.junit.Assert.assertNotNull(charArray14);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray14), "  #a4a");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray14), "  #a4a");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray14), "[ ,  , #, a, 4, a]");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 5 + "'", int19 == 5);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
    }

    @Test
    public void test40051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest80.test40051");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.split("ITULLITUL                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                   ", "ARRYLIST");
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test40052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest80.test40052");
        int int3 = org.apache.commons.lang3.StringUtils.indexOf("                                           ...", 918, 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test40053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest80.test40053");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$A rrr rrr rrr rrr rrr rrr rrr rrr rrr rrr", "AAAAAAAAAA");
        int int4 = org.apache.commons.lang3.StringUtils.indexOfAny("javaStrin", strArray3);
        java.lang.String[] strArray6 = org.apache.commons.lang3.StringUtils.stripAll(strArray3, "rLLryLiyyALLryLiyyALLryLiyyrrrALrAriiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiAv");
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertNotNull(strArray6);
    }

    @Test
    public void test40054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest80.test40054");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.center("NG.Llit", 104, '4');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "444444444444444444444444444444444444444444444444NG.Llit4444444444444444444444444444444444444444444444444" + "'", str3, "444444444444444444444444444444444444444444444444NG.Llit4444444444444444444444444444444444444444444444444");
    }

    @Test
    public void test40055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest80.test40055");
        java.util.Locale locale1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.apache.commons.lang3.StringUtils.lowerCase("                                                                             se...                                                                             ", locale1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test40056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest80.test40056");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeStart("                            ", "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                            " + "'", str2, "                            ");
    }

    @Test
    public void test40057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest80.test40057");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.endsWithIgnoreCase("     ", "hI!aRRAYlIShI!aRRAYlIShI!aRRAYlIShI!aRRAYlIShI!aRRAYlIShI!aRRAYlIShI!aRRAYlIShI!aRRAYlIShI!aRRAYlIShI!aRRAYlIShI!aRRAYlIShI!aRRAYlIShI!aRRAYlIShI!aRRAYlIShI!aRRAYlIShI!aRRAYlIShI!aRRAYlIShI!aRRAYlIShI!aRRAYlIShI!aRRAYlIShI!aRRAYlIShI!aRRAYlIShI!aRRAYlIShI!aRRAYlIShI!aRRAYlIShI!aRRAYlIShI!aRRAYlIShI!aRRAYlIShI!aRRAYlIShI!aRRAYlIShI!aRRAYlIShI!aRRAYlIShI!aRRAYlIShI!aRRAYlIShI!aRRAYlIShI!aRRAYlIShI!aRRAYlIShI!aRRAYlIShI!aRRAYlIShI!aRRAYlIShI!aRRAYlIShI!aRRAYlIShI!aRRAYlIShI!aRRAYlIShI!aRRAYlIShI!aRRAYlIShI!aRRAYlIS");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test40058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest80.test40058");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.split("elbazilaireS.......java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........javanignirtSelbaenolC.gnal.avaj ecafretni");
        java.lang.String[] strArray4 = null;
        java.lang.String str5 = org.apache.commons.lang3.StringUtils.replaceEachRepeatedly("interface#java.lang.cloneable4interface", strArray3, strArray4);
        java.lang.String[] strArray6 = org.apache.commons.lang3.StringUtils.stripAll(strArray3);
        int int7 = org.apache.commons.lang3.StringUtils.indexOfAny("..............................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................lass...                                       ", strArray3);
        java.lang.Class<?> wildcardClass8 = strArray3.getClass();
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "interface#java.lang.cloneable4interface" + "'", str5, "interface#java.lang.cloneable4interface");
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test40059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest80.test40059");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphanumeric((java.lang.CharSequence) "...langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava..");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test40060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest80.test40060");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.center("arjavaarrarjavaarrarjavaarrarjavaarrarjavaarra                                                                                                                                                                                                                                                                                                                                                                               ", 664);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                                                                                                             arjavaarrarjavaarrarjavaarrarjavaarrarjavaarra                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                             " + "'", str2, "                                                                                                                             arjavaarrarjavaarrarjavaarrarjavaarrarjavaarra                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                             ");
    }

    @Test
    public void test40061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest80.test40061");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("va.langjava.langjava.lang... .... .java.langjava.langjava.langjava.langjava.langjava.langjava...", "                                                                                                                                                                                                                                                                                                                                                                                          ARRYLISTARRYLISTARRYLISTVJGNAL.AVAJLANG.JAVAGNAL.AVAJLANG.JAVAGNAL.AVAJLANG.JAVAGNAL.AVAJLANG.JAVAGNAL.AVAJLANG.JAVAGNAL.AVAJLANG.JAVAGNAL.AVAJLANG.JAVAGNAL.AVAJLANG.JAVAGNAL.AVAJGNL                                                                                                                                                                                                                                                                                                                                                                                           ");
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test40062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest80.test40062");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass2 = org.apache.commons.lang3.ClassUtils.getClass("$       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $", true);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassNotFoundException; message: $$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$");
        } catch (java.lang.ClassNotFoundException e) {
            // Expected exception.
        }
    }

    @Test
    public void test40063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest80.test40063");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass2 = org.apache.commons.lang3.ClassUtils.getClass("interfINTERFACE JAVA.LANG.cLONEABLEsTRINGce jINTERFACE JAVA.LANG.cLONEABLEsTRINGvINTERFACE JAVA.LANG.cLONEABLEsTRING.lINTERFACE JAVA.LANG.cLONEABLEsTRINGng.cloneINTERFACE JAVA.LANG.cLONEABLEsTRINGble", false);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassNotFoundException; message: interfINTERFACEJAVA.LANG.cLONEABLEsTRINGcejINTERFACEJAVA.LANG.cLONEABLEsTRINGvINTERFACEJAVA.LANG.cLONEABLEsTRING.lINTERFACEJAVA.LANG.cLONEABLEsTRINGng.cloneINTERFACEJAVA.LANG.cLONEABLEsTRINGble");
        } catch (java.lang.ClassNotFoundException e) {
            // Expected exception.
        }
    }

    @Test
    public void test40064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest80.test40064");
        char[] charArray13 = new char[] { ' ', ' ', '#', 'a', '4', 'a' };
        int int14 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "", charArray13);
        boolean boolean15 = org.apache.commons.lang3.StringUtils.containsAny("$", charArray13);
        java.lang.String str17 = org.apache.commons.lang3.ClassUtils.getPackageCanonicalName((java.lang.Object) charArray13, "class java.lang.String");
        int int18 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "     A..ayL A.44444444444444444444444444      ", charArray13);
        int int19 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "LANG.GNALJAVA.LANGAVAJ.GNALJAVA.LANGAVAJ.GNALJAVA.LANGAVAJ.GNALJAVA.LANGAVAJ.GNALJAVA.LANGAVAJ.GNALJAVA.LANGAVAJ.GNALJAVA.LANGAVAJ.GNALJAVA.LANGAVAJ.JAVA", charArray13);
        boolean boolean20 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) ".LANG.LANG.LANG.LANG.Llitu", charArray13);
        boolean boolean21 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "interface java.lang.Cloneable... ... ... ... ... ... ... ... interface java.io.Serializable", charArray13);
        int int22 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "stringstringstringstringstringstringstringstringstringstrin", charArray13);
        org.junit.Assert.assertNotNull(charArray13);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray13), "  #a4a");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray13), "  #a4a");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray13), "[ ,  , #, a, 4, a]");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 5 + "'", int18 == 5);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
    }

    @Test
    public void test40065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest80.test40065");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("class java.lang.String", "                                   ");
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.stripAll(strArray3);
        java.lang.Class<?>[] wildcardClassArray5 = org.apache.commons.lang3.ClassUtils.toClass((java.lang.Object[]) strArray4);
        java.lang.Class<?>[] wildcardClassArray6 = org.apache.commons.lang3.ClassUtils.primitivesToWrappers(wildcardClassArray5);
        java.lang.Class<?> wildcardClass7 = null;
        java.lang.Class[] classArray9 = new java.lang.Class[1];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray10 = (java.lang.Class<?>[]) classArray9;
        wildcardClassArray10[0] = wildcardClass7;
        java.lang.Class<?>[] wildcardClassArray13 = org.apache.commons.lang3.ClassUtils.primitivesToWrappers(wildcardClassArray10);
        java.lang.Class<?> wildcardClass14 = null;
        java.lang.Class[] classArray16 = new java.lang.Class[1];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray17 = (java.lang.Class<?>[]) classArray16;
        wildcardClassArray17[0] = wildcardClass14;
        java.lang.Class<?>[] wildcardClassArray20 = org.apache.commons.lang3.ClassUtils.primitivesToWrappers(wildcardClassArray17);
        java.lang.String[] strArray22 = new java.lang.String[] { "                                   " };
        java.lang.String str23 = org.apache.commons.lang3.StringUtils.getCommonPrefix(strArray22);
        java.lang.Class<?>[] wildcardClassArray24 = org.apache.commons.lang3.ClassUtils.toClass((java.lang.Object[]) strArray22);
        java.lang.Class<?> wildcardClass25 = null;
        java.lang.Class[] classArray27 = new java.lang.Class[1];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray28 = (java.lang.Class<?>[]) classArray27;
        wildcardClassArray28[0] = wildcardClass25;
        java.lang.Class<?>[] wildcardClassArray31 = org.apache.commons.lang3.ClassUtils.primitivesToWrappers(wildcardClassArray28);
        boolean boolean32 = org.apache.commons.lang3.ClassUtils.isAssignable(wildcardClassArray24, wildcardClassArray28);
        boolean boolean34 = org.apache.commons.lang3.ClassUtils.isAssignable(wildcardClassArray17, wildcardClassArray28, true);
        boolean boolean36 = org.apache.commons.lang3.ClassUtils.isAssignable(wildcardClassArray13, wildcardClassArray28, true);
        java.lang.String str38 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) wildcardClassArray28, 'a');
        boolean boolean40 = org.apache.commons.lang3.ClassUtils.isAssignable(wildcardClassArray6, wildcardClassArray28, false);
        java.lang.Class<?>[] wildcardClassArray41 = org.apache.commons.lang3.ClassUtils.primitivesToWrappers(wildcardClassArray6);
        java.lang.String str43 = org.apache.commons.lang3.ClassUtils.getPackageCanonicalName((java.lang.Object) wildcardClassArray41, ".lang.Cloneable4i");
        java.lang.String str44 = org.apache.commons.lang3.StringUtils.concatWith("ulangrraylist                       javaulangrraylis", (java.lang.Object[]) wildcardClassArray41);
        java.lang.Class<?>[] wildcardClassArray45 = org.apache.commons.lang3.ClassUtils.wrappersToPrimitives(wildcardClassArray41);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertNotNull(wildcardClassArray5);
        org.junit.Assert.assertNotNull(wildcardClassArray6);
        org.junit.Assert.assertNotNull(classArray9);
        org.junit.Assert.assertNotNull(wildcardClassArray10);
        org.junit.Assert.assertNotNull(wildcardClassArray13);
        org.junit.Assert.assertNotNull(classArray16);
        org.junit.Assert.assertNotNull(wildcardClassArray17);
        org.junit.Assert.assertNotNull(wildcardClassArray20);
        org.junit.Assert.assertNotNull(strArray22);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "                                   " + "'", str23, "                                   ");
        org.junit.Assert.assertNotNull(wildcardClassArray24);
        org.junit.Assert.assertNotNull(classArray27);
        org.junit.Assert.assertNotNull(wildcardClassArray28);
        org.junit.Assert.assertNotNull(wildcardClassArray31);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "" + "'", str38, "");
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertNotNull(wildcardClassArray41);
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "java.lang" + "'", str43, "java.lang");
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "class java.lang.String" + "'", str44, "class java.lang.String");
        org.junit.Assert.assertNotNull(wildcardClassArray45);
    }

    @Test
    public void test40066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest80.test40066");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.remove("aaaaaaaaA..yL A.4444444444...A..yL A.4444444444...A..yL A.4444444444...A..yL A.4444444444...A..yL A.4444444444...A..yL A.4444444444...A..yL A.4444444444...A..yL A.4444444444...A..yL A.4444444444...A..yL A.4444444444...A..yL A.4444444444...A..yL A.4444444444...A..yL A.4444444444...A..yL A.4444444444...A..yL A.4444444444...A..yL A.4444444444...A..yL A.4444444444...A..yL A.4444444444...A..yL A.4444444444...A..yL A.4444444444...A..yL A.4444444444...A..yL A.4444444444...A..yL A.4444444444...A..yL A.4444444444...A..yL A.4444444444...A..yL A.4444444444...A..yL A.4444444444...A..yL A.4444444444...A..yL A.4444444444...A..yL A.4444444444...A..yL A.4444444444...A..yL A.4444444444...A..yL A.4444444444...A..yL A.4444444444...A..yL A.4444444444...A..yL A.4444444444...A..yL A.4444444444...A..yL A.4444444444...A..yL A.4444444444...A..yL A.4444444444...A..yL A.4444444444...A..yL A.4444444444...A..yL A.4444444444...A..yL A.4444444444...A..yL A.44", "...rgnaluavajtutututututut...");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "aaaaaaaaA..yL A.4444444444...A..yL A.4444444444...A..yL A.4444444444...A..yL A.4444444444...A..yL A.4444444444...A..yL A.4444444444...A..yL A.4444444444...A..yL A.4444444444...A..yL A.4444444444...A..yL A.4444444444...A..yL A.4444444444...A..yL A.4444444444...A..yL A.4444444444...A..yL A.4444444444...A..yL A.4444444444...A..yL A.4444444444...A..yL A.4444444444...A..yL A.4444444444...A..yL A.4444444444...A..yL A.4444444444...A..yL A.4444444444...A..yL A.4444444444...A..yL A.4444444444...A..yL A.4444444444...A..yL A.4444444444...A..yL A.4444444444...A..yL A.4444444444...A..yL A.4444444444...A..yL A.4444444444...A..yL A.4444444444...A..yL A.4444444444...A..yL A.4444444444...A..yL A.4444444444...A..yL A.4444444444...A..yL A.4444444444...A..yL A.4444444444...A..yL A.4444444444...A..yL A.4444444444...A..yL A.4444444444...A..yL A.4444444444...A..yL A.4444444444...A..yL A.4444444444...A..yL A.4444444444...A..yL A.4444444444...A..yL A.44" + "'", str2, "aaaaaaaaA..yL A.4444444444...A..yL A.4444444444...A..yL A.4444444444...A..yL A.4444444444...A..yL A.4444444444...A..yL A.4444444444...A..yL A.4444444444...A..yL A.4444444444...A..yL A.4444444444...A..yL A.4444444444...A..yL A.4444444444...A..yL A.4444444444...A..yL A.4444444444...A..yL A.4444444444...A..yL A.4444444444...A..yL A.4444444444...A..yL A.4444444444...A..yL A.4444444444...A..yL A.4444444444...A..yL A.4444444444...A..yL A.4444444444...A..yL A.4444444444...A..yL A.4444444444...A..yL A.4444444444...A..yL A.4444444444...A..yL A.4444444444...A..yL A.4444444444...A..yL A.4444444444...A..yL A.4444444444...A..yL A.4444444444...A..yL A.4444444444...A..yL A.4444444444...A..yL A.4444444444...A..yL A.4444444444...A..yL A.4444444444...A..yL A.4444444444...A..yL A.4444444444...A..yL A.4444444444...A..yL A.4444444444...A..yL A.4444444444...A..yL A.4444444444...A..yL A.4444444444...A..yL A.4444444444...A..yL A.4444444444...A..yL A.44");
    }

    @Test
    public void test40067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest80.test40067");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("slitUgnirtSslitUgnirtSslitUgnirtSslitUgnirtSslitUgnirtSslitUgnirtSslitUgnirtSslitUgnirtSslitUgnirtSslitUgnirtS");
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test40068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest80.test40068");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.defaultIfBlank("NALAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA", "javaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "NALAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA" + "'", str2, "NALAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA");
    }

    @Test
    public void test40069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest80.test40069");
        int int2 = org.apache.commons.lang3.StringUtils.indexOf("...lizable...lizable...lizable...lizable...lizable...lizable...lizable...lizable...lizable...lizable...liza                                                                                                                              4444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444AAAAAAAAAA                                                                                                                                                                                      ...lizable...lizable...lizable...lizable...lizable...lizable...lizable...lizable...lizable...lizable...lizab", 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test40070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest80.test40070");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitByCharacterType("... AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA... AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA... AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA... AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA... AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA... AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA... AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA... AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA... AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA... AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA");
        java.lang.Class<?>[] wildcardClassArray2 = org.apache.commons.lang3.ClassUtils.toClass((java.lang.Object[]) strArray1);
        java.lang.Class<?>[] wildcardClassArray3 = org.apache.commons.lang3.ClassUtils.primitivesToWrappers(wildcardClassArray2);
        java.lang.Class<?>[] wildcardClassArray4 = org.apache.commons.lang3.ClassUtils.wrappersToPrimitives(wildcardClassArray3);
        java.lang.String[] strArray7 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("hi!", "");
        java.lang.String[] strArray9 = org.apache.commons.lang3.StringUtils.stripAll(strArray7, "$");
        java.lang.Class<?>[] wildcardClassArray10 = org.apache.commons.lang3.ClassUtils.toClass((java.lang.Object[]) strArray7);
        java.lang.String[] strArray13 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("hi!", "");
        java.lang.String[] strArray15 = org.apache.commons.lang3.StringUtils.stripAll(strArray13, "$");
        java.lang.Class<?>[] wildcardClassArray16 = org.apache.commons.lang3.ClassUtils.toClass((java.lang.Object[]) strArray13);
        java.lang.Class<?> wildcardClass17 = null;
        java.lang.Class[] classArray19 = new java.lang.Class[1];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray20 = (java.lang.Class<?>[]) classArray19;
        wildcardClassArray20[0] = wildcardClass17;
        java.lang.Class<?>[] wildcardClassArray23 = org.apache.commons.lang3.ClassUtils.primitivesToWrappers(wildcardClassArray20);
        java.lang.String[] strArray25 = new java.lang.String[] { "                                   " };
        java.lang.String str26 = org.apache.commons.lang3.StringUtils.getCommonPrefix(strArray25);
        java.lang.Class<?>[] wildcardClassArray27 = org.apache.commons.lang3.ClassUtils.toClass((java.lang.Object[]) strArray25);
        java.lang.Class<?> wildcardClass28 = null;
        java.lang.Class[] classArray30 = new java.lang.Class[1];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray31 = (java.lang.Class<?>[]) classArray30;
        wildcardClassArray31[0] = wildcardClass28;
        java.lang.Class<?>[] wildcardClassArray34 = org.apache.commons.lang3.ClassUtils.primitivesToWrappers(wildcardClassArray31);
        boolean boolean35 = org.apache.commons.lang3.ClassUtils.isAssignable(wildcardClassArray27, wildcardClassArray31);
        boolean boolean37 = org.apache.commons.lang3.ClassUtils.isAssignable(wildcardClassArray20, wildcardClassArray31, true);
        boolean boolean39 = org.apache.commons.lang3.ClassUtils.isAssignable(wildcardClassArray16, wildcardClassArray31, false);
        java.lang.Class<?>[] wildcardClassArray40 = org.apache.commons.lang3.ClassUtils.primitivesToWrappers(wildcardClassArray16);
        boolean boolean41 = org.apache.commons.lang3.ClassUtils.isAssignable(wildcardClassArray10, wildcardClassArray40);
        java.lang.Class<?>[] wildcardClassArray42 = org.apache.commons.lang3.ClassUtils.wrappersToPrimitives(wildcardClassArray40);
        boolean boolean43 = org.apache.commons.lang3.ClassUtils.isAssignable(wildcardClassArray3, wildcardClassArray40);
        java.lang.Class<?>[] wildcardClassArray44 = org.apache.commons.lang3.ClassUtils.wrappersToPrimitives(wildcardClassArray40);
        java.lang.String str48 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) wildcardClassArray40, "avajgnal.avajgnal.avajgnal.avajgnal.avajgnal.avajgnal.avajgnal.avajgnal.avajgnal.avaJ", 145, 80);
        java.lang.String[] strArray50 = org.apache.commons.lang3.StringUtils.splitByCharacterType("... AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA... AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA... AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA... AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA... AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA... AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA... AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA... AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA... AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA... AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA");
        java.lang.String[] strArray52 = org.apache.commons.lang3.StringUtils.stripAll(strArray50, "JAVA");
        java.lang.Class<?>[] wildcardClassArray53 = org.apache.commons.lang3.ClassUtils.toClass((java.lang.Object[]) strArray50);
        boolean boolean54 = org.apache.commons.lang3.ClassUtils.isAssignable(wildcardClassArray40, wildcardClassArray53);
        java.lang.String[] strArray56 = org.apache.commons.lang3.StringUtils.splitByCharacterType("... AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA... AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA... AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA... AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA... AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA... AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA... AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA... AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA... AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA... AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA");
        java.lang.Class<?>[] wildcardClassArray57 = org.apache.commons.lang3.ClassUtils.toClass((java.lang.Object[]) strArray56);
        java.lang.Class<?>[] wildcardClassArray58 = org.apache.commons.lang3.ClassUtils.primitivesToWrappers(wildcardClassArray57);
        boolean boolean59 = org.apache.commons.lang3.ClassUtils.isAssignable(wildcardClassArray53, wildcardClassArray57);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str63 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) wildcardClassArray53, "aAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA", 0, 406);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertNotNull(wildcardClassArray2);
        org.junit.Assert.assertNotNull(wildcardClassArray3);
        org.junit.Assert.assertNotNull(wildcardClassArray4);
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertNotNull(strArray9);
        org.junit.Assert.assertNotNull(wildcardClassArray10);
        org.junit.Assert.assertNotNull(strArray13);
        org.junit.Assert.assertNotNull(strArray15);
        org.junit.Assert.assertNotNull(wildcardClassArray16);
        org.junit.Assert.assertNotNull(classArray19);
        org.junit.Assert.assertNotNull(wildcardClassArray20);
        org.junit.Assert.assertNotNull(wildcardClassArray23);
        org.junit.Assert.assertNotNull(strArray25);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "                                   " + "'", str26, "                                   ");
        org.junit.Assert.assertNotNull(wildcardClassArray27);
        org.junit.Assert.assertNotNull(classArray30);
        org.junit.Assert.assertNotNull(wildcardClassArray31);
        org.junit.Assert.assertNotNull(wildcardClassArray34);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertNotNull(wildcardClassArray40);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + true + "'", boolean41 == true);
        org.junit.Assert.assertNotNull(wildcardClassArray42);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertNotNull(wildcardClassArray44);
        org.junit.Assert.assertEquals("'" + str48 + "' != '" + "" + "'", str48, "");
        org.junit.Assert.assertNotNull(strArray50);
        org.junit.Assert.assertNotNull(strArray52);
        org.junit.Assert.assertNotNull(wildcardClassArray53);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertNotNull(strArray56);
        org.junit.Assert.assertNotNull(wildcardClassArray57);
        org.junit.Assert.assertNotNull(wildcardClassArray58);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + true + "'", boolean59 == true);
    }

    @Test
    public void test40071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest80.test40071");
        int int1 = org.apache.commons.lang3.StringUtils.length((java.lang.CharSequence) "......................................................................................................................................................................................................................................................................................................................................................................................................................................................................44444444444444444444444444444444444444444444444444444444444444444444444444444444         $");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 544 + "'", int1 == 544);
    }

    @Test
    public void test40072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest80.test40072");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.center("S.r..gU..ls                                       ", 70, "jv.lng$interfce jv.lng.Cloneble$interfce jv.io.Serilizbleinterfce jv.lng.Cloneble$interfce jv.io.Serilizbleinterfce jv.lng.Cl");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "jv.lng$intS.r..gU..ls                                       jv.lng$int" + "'", str3, "jv.lng$intS.r..gU..ls                                       jv.lng$int");
    }

    @Test
    public void test40073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest80.test40073");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.split("iterface aoatatCoeabeNGtLititerface aoatiotSeriaizabe");
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test40074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest80.test40074");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.stripEnd("se", "aaaaaaaaaaaa######aaaaaaaaaaaaa");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "se" + "'", str2, "se");
    }

    @Test
    public void test40075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest80.test40075");
        int int2 = org.apache.commons.lang3.StringUtils.indexOf("A..ayL A##############", 384);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test40076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest80.test40076");
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("java.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.lang", ".......java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java", 10);
        int int5 = org.apache.commons.lang3.StringUtils.indexOfAny("###############################################################################################################################################################", strArray4);
        java.lang.String str6 = org.apache.commons.lang3.StringUtils.getCommonPrefix(strArray4);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "java.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.lang" + "'", str6, "java.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.lang");
    }

    @Test
    public void test40077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest80.test40077");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOf("RChahactaRChahactaRChahactaRChahactaRChahactaRChahactalangagnaljRChahactaRChahactaRChahactaRChahactaRChahactaRChahacta", 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test40078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest80.test40078");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("Arr... aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa... aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa... aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa... aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa... aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa... aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa... aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa... aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa... aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa..", "                                                                                                       ", 850);
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void test40079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest80.test40079");
        java.lang.Object[] objArray0 = null;
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.join(objArray0, "44444444444444444.4...", 30, 905);
        org.junit.Assert.assertNull(str4);
    }

    @Test
    public void test40080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest80.test40080");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trimToEmpty("4444444444444444444444444444444444444JAVAULANG4444444444444444444444444444444444444");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "4444444444444444444444444444444444444JAVAULANG4444444444444444444444444444444444444" + "'", str1, "4444444444444444444444444444444444444JAVAULANG4444444444444444444444444444444444444");
    }

    @Test
    public void test40081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest80.test40081");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOf("Java.lang.Stringclass java.lang.Stringclass java.lang.Stringclas.lang.Stringclass java.lang.Stringc", 675, 563);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test40082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest80.test40082");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceOnce("                                                                                                                                                                                                                                                                                                                                                                                                                                                               LANG.JAVATSILYARRATSILYARRATSILYARRA", "][ssalC", "AVAJ.GNAL......j.v...........j.v...........j.v...........j.v...........j.v...........j.v...........j.v...........j.v...........j.v...........j.v...........j.v...........j.v...........j.v...........j.v...........j.v...........j.v...........j.v...........j.v...........j.v...........j.v...........j.v...........j.v...........j.v...........j.v...........j.v...........j.v...........j.v...........j.v...........j.v...........j.v...........j.v...........j.v.i.terf.ce j.v..io.Seri.aiz.bae");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "                                                                                                                                                                                                                                                                                                                                                                                                                                                               LANG.JAVATSILYARRATSILYARRATSILYARRA" + "'", str3, "                                                                                                                                                                                                                                                                                                                                                                                                                                                               LANG.JAVATSILYARRATSILYARRATSILYARRA");
    }

    @Test
    public void test40083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest80.test40083");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.swapCase("$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$sERIA$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$Seria$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$" + "'", str1, "$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$Seria$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$");
    }

    @Test
    public void test40084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest80.test40084");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.rightPad("4444444444444444444444444444444444444444444444444444444444444444444444444444444rclassjava.lang.O..", 948);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "4444444444444444444444444444444444444444444444444444444444444444444444444444444rclassjava.lang.O..                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                  " + "'", str2, "4444444444444444444444444444444444444444444444444444444444444444444444444444444rclassjava.lang.O..                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                  ");
    }

    @Test
    public void test40085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest80.test40085");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.difference("                                  aA", "##############################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "##############################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################" + "'", str2, "##############################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################");
    }

    @Test
    public void test40086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest80.test40086");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.upperCase("                                                                                                                                                    ArryListArryListArryListvjGNAL.AVAJLANG.JAVAGNAL.AVAJLANG.JAVAGNAL.AVAJLANG.JAVAGNAL.AVAJLANG.JAVAGNAL.AVAJLANG.JAVAGNAL.AVAJLANG.JAVAGNAL.AVAJLANG.JAVAGNAL.AVAJLANG.JAVAGNAL.AVAJgnl                                                                                                                                                     ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "                                                                                                                                                    ARRYLISTARRYLISTARRYLISTVJGNAL.AVAJLANG.JAVAGNAL.AVAJLANG.JAVAGNAL.AVAJLANG.JAVAGNAL.AVAJLANG.JAVAGNAL.AVAJLANG.JAVAGNAL.AVAJLANG.JAVAGNAL.AVAJLANG.JAVAGNAL.AVAJLANG.JAVAGNAL.AVAJGNL                                                                                                                                                     " + "'", str1, "                                                                                                                                                    ARRYLISTARRYLISTARRYLISTVJGNAL.AVAJLANG.JAVAGNAL.AVAJLANG.JAVAGNAL.AVAJLANG.JAVAGNAL.AVAJLANG.JAVAGNAL.AVAJLANG.JAVAGNAL.AVAJLANG.JAVAGNAL.AVAJLANG.JAVAGNAL.AVAJLANG.JAVAGNAL.AVAJGNL                                                                                                                                                     ");
    }

    @Test
    public void test40087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest80.test40087");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripToEmpty("int");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "int" + "'", str1, "int");
    }

    @Test
    public void test40088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest80.test40088");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.strip("$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$ $ $ $ $ $ $ $ $ $ $ $ $ $ $ $ $ $ $ $ $ $ $ siLyarrA!iH$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$ $ $ $ $ $ $ $ $ $ $ $ $ $ $ $ $ $ $ $ $ $ $ siLyarrA!iH$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$" + "'", str1, "$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$ $ $ $ $ $ $ $ $ $ $ $ $ $ $ $ $ $ $ $ $ $ $ siLyarrA!iH$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$");
    }

    @Test
    public void test40089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest80.test40089");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.contains("sTRINGg.g.g.g.g.g.g.g.g.g.g.g.g.g.g.g.g.g.AVAJ.GNALAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAIRFCO$IRFIOSRA..AYL A.444444444444444444444444444g.g.g.g.g.g.gg.g.g.g.g.g.g.g.g.g.g.g.g.g.g.g.g.g.AVAJ.GNALAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAIRFCO$IRFIOSRA..AYL A.444444444444444444444444444g.g.g.g.g.g.gg.g.g.g.g.g.g.g.g.g.g.g.g.g.g.g.g.g.AVAJ.GNALAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAIRFCO$IRFIOSRA..AYL A.444444444444444444444444444g.g.g.g.g.g.gg.g.g.g.g.g.g.g.g.g.g.g.g.g.g.g.g.g.AVAJ.GNALAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAIRFCO$IRFIOSRA..AYL A.444444444444444444444444444g.g.g.g.g.g.gg.g.g.g.g.g.g.g.g.g.g.g.g.g.g.g.g.g.AVAJ.GNALAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAIRFCO$IRFIOSRA..AYL A.444444444444444444444444444g.g.g.g.g.g.gg.g.g.g.g.g.g.g.g.g.g.g.g.g.g.g.g.g.AVAJ.GNALAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAIRFCO$IRFIOSRA..AYL A.444444444444444444444444444g.g.g.g.g.g.gg.g.g.g.g.g.g.g.g.g.g.g.g.g.g.g.g.g.AVAJ.GNALAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAIRFCO$IRFIOSRA..AYL A.444", 525);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test40090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest80.test40090");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.strip("$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$J#v#.l#ngj#v#.l#ngj#v#.l#ngj#v#.l#ngj#v#.l#ngj#v#.l#ngj#v#.l#ngj#v#.l#ngj#v#.l#ngj#v#.l#ngj#v#.l#ngj#v#.l#ngj#v#.l#ngj#v#.l#ngj#v#.l#ngj#v#.l#ngj#v#.l#ngj#v#.l#ngj#v#.l#ngj#v#.l#ngj#v#.l#ngj#v#.l#ngj#v#.l#ngj#v#.l#ngj#v#.l#ngj#v#.l#ngj#v#.l#ngj#v#.l#ngj#v#.l#ngj#v#.l#ngj#v#.l#ngj#v#");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$J#v#.l#ngj#v#.l#ngj#v#.l#ngj#v#.l#ngj#v#.l#ngj#v#.l#ngj#v#.l#ngj#v#.l#ngj#v#.l#ngj#v#.l#ngj#v#.l#ngj#v#.l#ngj#v#.l#ngj#v#.l#ngj#v#.l#ngj#v#.l#ngj#v#.l#ngj#v#.l#ngj#v#.l#ngj#v#.l#ngj#v#.l#ngj#v#.l#ngj#v#.l#ngj#v#.l#ngj#v#.l#ngj#v#.l#ngj#v#.l#ngj#v#.l#ngj#v#.l#ngj#v#.l#ngj#v#.l#ngj#v#" + "'", str1, "$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$J#v#.l#ngj#v#.l#ngj#v#.l#ngj#v#.l#ngj#v#.l#ngj#v#.l#ngj#v#.l#ngj#v#.l#ngj#v#.l#ngj#v#.l#ngj#v#.l#ngj#v#.l#ngj#v#.l#ngj#v#.l#ngj#v#.l#ngj#v#.l#ngj#v#.l#ngj#v#.l#ngj#v#.l#ngj#v#.l#ngj#v#.l#ngj#v#.l#ngj#v#.l#ngj#v#.l#ngj#v#.l#ngj#v#.l#ngj#v#.l#ngj#v#.l#ngj#v#.l#ngj#v#.l#ngj#v#.l#ngj#v#");
    }

    @Test
    public void test40091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest80.test40091");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNotBlank((java.lang.CharSequence) "interfacejava.lang.Cloneable#interfacejava.iointerfacejava.lang.Cloneable#interfacejava.ioinTU");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test40092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest80.test40092");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.defaultString("aaaaaaaaaaaaaaaaaaaaaalitu", "                                                     classjava.langa...                                                      ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "aaaaaaaaaaaaaaaaaaaaaalitu" + "'", str2, "aaaaaaaaaaaaaaaaaaaaaalitu");
    }

    @Test
    public void test40093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest80.test40093");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringAfterLast("                                                                                                                                                                                                                                                                                                                                                                                                                                JAVA.LANGAgnl.vjgnl..LANGgnl.vArrclss jv.lng.ObjectyListAr...                                                                                                                                                                                                                                                                                                                                                         ", "                                                            -1JAVA.UTILsTRING-1JAVA                                                            ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test40094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest80.test40094");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("                                                                    aAAAAAAAAAAA                                  tractList$class java.util.AbstractCollection$class java.lang.Object", "interface java.lang.cloneable...                                 interface java.io.serializable", 155);
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void test40095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest80.test40095");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.uncapitalize((java.lang.CharSequence) "aRR.AVALITU.AAAAAAAAAAAAAAAAAAAAAAAAAAAAAA... AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA... AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA... AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA... AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA... AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA... AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA... AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA... AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA... AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAYLIST");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "aRR.AVALITU.AAAAAAAAAAAAAAAAAAAAAAAAAAAAAA... AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA... AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA... AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA... AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA... AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA... AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA... AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA... AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA... AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAYLIST" + "'", str1, "aRR.AVALITU.AAAAAAAAAAAAAAAAAAAAAAAAAAAAAA... AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA... AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA... AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA... AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA... AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA... AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA... AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA... AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA... AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAYLIST");
    }

    @Test
    public void test40096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest80.test40096");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripToNull("                                                                                                                                                                                                                                                                                                            i4elbaenolc.gnal.avajecafretnitringi4elbaenolc.gnal.avajecafretni                                                                                                                                                                                                                                                                                                           ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "i4elbaenolc.gnal.avajecafretnitringi4elbaenolc.gnal.avajecafretni" + "'", str1, "i4elbaenolc.gnal.avajecafretnitringi4elbaenolc.gnal.avajecafretni");
    }

    @Test
    public void test40097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest80.test40097");
        java.lang.String[] strArray1 = null;
        boolean boolean2 = org.apache.commons.lang3.StringUtils.endsWithAny("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaat", strArray1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test40098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest80.test40098");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass2 = org.apache.commons.lang3.ClassUtils.getClass("44444444444444444444444444444444444444444444444]TU44444444444444444444444444444444444444444444444                                                                                                                                                                                                                                                                                                                               ", true);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassNotFoundException; message: 44444444444444444444444444444444444444444444444]TU44444444444444444444444444444444444444444444444");
        } catch (java.lang.ClassNotFoundException e) {
            // Expected exception.
        }
    }

    @Test
    public void test40099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest80.test40099");
        java.lang.String[] strArray1 = null;
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOfAny("...loneableainterface java.io.serializable", strArray1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test40100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest80.test40100");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("       .", "AVAJ.GNAL......j.v...........j.v...........j.v...........j.v...........j.v...........j.v...........j.v...........j.v...........j.v...........j.v...........j.v...........j.v...........j.v...........j.v...........j.v...........j.v...........j.v...........j.v...........j.v...........j.v...........j.v...........j.v...........j.v...........j.v...........j.v...........j.v...........j.v...........j.v...........j.v...........j.v...........j.v...........j.v.i.terf.ce j.v..io.Seri.aiz.bae");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.stripAll(strArray2);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void test40101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest80.test40101");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphanumericSpace((java.lang.CharSequence) "$$$$$$$$$$");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test40102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest80.test40102");
        java.lang.String str1 = org.apache.commons.lang3.ClassUtils.getShortClassName("LANGAgnal.avajgnal..LANGg");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "LANGg" + "'", str1, "LANGg");
    }

    @Test
    public void test40103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest80.test40103");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "interface java.lang.CloneableVAJinterface java.io.Serializable", "stringstringstringstringstringstringstringstringstringstrin");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test40104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest80.test40104");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.contains("object", "                                                                JAVA.L$ArrayAAAAAAAAAA                                                                 ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test40105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest80.test40105");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceChars("", "JAVA.UTILJAVA.UTILSTRINGCJAVA.UTILJAVA.UTILSTRINGCJAVA.UTILJAVA.UTILSTRINGCJAVA.UTILJAVA.UTILSTRINGCJAVA.UTILJAVA.UTILSTRINGCJAVA.UTILJAVA.UTILSTRINGCJAVA.UTILJAVA.UTILSTRINGCJAVA.UTILJAVA.UTILSTRINGCJAVA.UTILJAVA.UTILSTRINGCJAVA.UTILJAVA.UTILSTRINGCJAVA.UTILJAVA.UTILSTRINGCJAVA.UTILJAVA.UTILSTRINGCJAVA.UTILJAVA.UTILSTRINGCJAVA.UTILJAVA.UTILSTRINGCJAVA.UTILJAVA.UTILSTRINGCJAVA.UTILJAVA.UTILSTRINGCJAVA.UTILJAVA.UTILSTRINGCJAVA.UTILJAVA.UTILSTRINGCJAVA.UTILJAVA.UTILSTRINGCJAVA.UTILJAVA.UTILSTRINGCJAVA.UTILJAVA.UTILSTRINGCJAVA.UTILJAVA.UTILSTRINGCJAVA.UTILJAVA.UTIL", ".ALya..A");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test40106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest80.test40106");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitByCharacterTypeCamelCase("irfCo$irfioSriiz");
        java.lang.String str3 = org.apache.commons.lang3.ClassUtils.getShortClassName((java.lang.Object) strArray1, "       $$$$$$java");
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "String[]" + "'", str3, "String[]");
    }

    @Test
    public void test40107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest80.test40107");
        java.util.Locale locale1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.apache.commons.lang3.StringUtils.upperCase("$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$aaaaaaa       INTEGER        aaaaaa", locale1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test40108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest80.test40108");
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("interface java.lang.Cloneable4interface java.io.Serializabl", "][sslC", 22);
        java.lang.String[] strArray6 = org.apache.commons.lang3.StringUtils.stripAll(strArray4, "GNALGNALGNALGNALGNALGNALGNALGNALGNALGNALGNALGNALGNALGNALGNALGNALGNALGNALGNALGNALGNALGNALGNALGNALGNALGNALGNALGNALGNAL.lang.lang.lang.lang.lang.lang.lLITUAVA.LA");
        java.lang.String[] strArray7 = null;
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.replaceEachRepeatedly("javaStringnalArrayListArrayListArrayListavaj.gnalArrayListArrayListArrayLijavaStringnalArrayListArrayListArrayListavaj.gnalArrayListArrayListArrayLijavaStringnalArrayListArrayListArrayListavaj.gnalArrayListArrayListArrayLijavaStringnalArrayListArrayListArrayListavaj.gnalArrayListArrayListArrayLi", strArray6, strArray7);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "javaStringnalArrayListArrayListArrayListavaj.gnalArrayListArrayListArrayLijavaStringnalArrayListArrayListArrayListavaj.gnalArrayListArrayListArrayLijavaStringnalArrayListArrayListArrayListavaj.gnalArrayListArrayListArrayLijavaStringnalArrayListArrayListArrayListavaj.gnalArrayListArrayListArrayLi" + "'", str8, "javaStringnalArrayListArrayListArrayListavaj.gnalArrayListArrayListArrayLijavaStringnalArrayListArrayListArrayListavaj.gnalArrayListArrayListArrayLijavaStringnalArrayListArrayListArrayListavaj.gnalArrayListArrayListArrayLijavaStringnalArrayListArrayListArrayListavaj.gnalArrayListArrayListArrayLi");
    }

    @Test
    public void test40109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest80.test40109");
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.replace(".........ava..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........javaj", "va                                      ", "                                                                                    AVAJ.GNALAAAAAAAAAAAAAAAAAAAAAAAAAavajecaf", 447);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + ".........ava..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........javaj" + "'", str4, ".........ava..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........javaj");
    }

    @Test
    public void test40110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest80.test40110");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.rightPad("", 399, '#');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "###############################################################################################################################################################################################################################################################################################################################################################################################################" + "'", str3, "###############################################################################################################################################################################################################################################################################################################################################################################################################");
    }

    @Test
    public void test40111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest80.test40111");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeEndIgnoreCase("       #############################################", "...44444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444..........");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "       #############################################" + "'", str2, "       #############################################");
    }

    @Test
    public void test40112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest80.test40112");
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("gnal.avajgnal..LANGgnal.avajgnal.", '.');
        int int5 = org.apache.commons.lang3.StringUtils.indexOfAny("444444444444444444444444444444444444444444444444444444444444444gn                                            gn      tavaj.gnalarraylistarraylistarrayli", strArray4);
        java.lang.String[] strArray8 = org.apache.commons.lang3.StringUtils.split("CLASSjava.langAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAulang", "       44444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str9 = org.apache.commons.lang3.StringUtils.replaceEachRepeatedly("ava..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java.......", strArray4, strArray8);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Search and Replace array lengths don't match: 6 vs 1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(strArray8);
    }

    @Test
    public void test40113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest80.test40113");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOfIgnoreCase("###################################################################################################################################################class java.util.AbstractList$class java.util.AbstractCollection$class java.lang.Object###################################################################################################################################################", "                                   4444444444...                                   ", 21);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test40114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest80.test40114");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "CTERcHARACTERcHARACTERcHARACTERcHARACTERcHARACTERcHARACTERcHARACTERcHARACTERcHARACTERcHAR", " ArrayListArrayListArrayListavajGNAL.AVAJLANG.JAVAGNAL.AVAJLANG.JAVAGNAL.AVAJLANG.JAVAGNAL.AVAJLANG.JAVAGNAL.AVAJLANG.JAVAGNAL.AVAJLANG.JAVAGNAL.AVAJLANG.JAVAGNAL.AVAJLANG.JAVAGNAL");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 6 + "'", int2 == 6);
    }

    @Test
    public void test40115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest80.test40115");
        char[] charArray14 = new char[] { ' ', ' ', '#', 'a', '4', 'a' };
        int int15 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "", charArray14);
        boolean boolean16 = org.apache.commons.lang3.StringUtils.containsAny("$", charArray14);
        int int17 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "", charArray14);
        boolean boolean18 = org.apache.commons.lang3.StringUtils.containsAny("$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$", charArray14);
        boolean boolean19 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "h!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ihLITU.AVAJ", charArray14);
        int int20 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "lutilutilutilutilutil####lutilutilutilutilutil", charArray14);
        int int21 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "arraylisarraylisarraylisarraylisarra....................................................................................................", charArray14);
        int int22 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "arahCretcarahCretcarahCretcarahCretcarahCretcarahCretcarahCretcarahCretcarahCretcarahCretcarahCretcarahCretcarahCretcarahCretcarahCretcarahCretcarahCretcarahCretcarahCretcarahCretcarahCretcarahCretcarahCretcarahCretcarahCretcarahCretcarahCretcarahCretcarahCretcarahCretcar...", charArray14);
        org.junit.Assert.assertNotNull(charArray14);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray14), "  #a4a");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray14), "  #a4a");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray14), "[ ,  , #, a, 4, a]");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 21 + "'", int20 == 21);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 1 + "'", int22 == 1);
    }

    @Test
    public void test40116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest80.test40116");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceChars("                                                                                                                                                                                                                                                        cLONEABLE4I", "AVAJ.GNAL......java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........javainterfacejava.io.Serializabl", ".......java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java.........");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "                                                                                                                                                                                                                                                        .aO.E.BaE4I" + "'", str3, "                                                                                                                                                                                                                                                        .aO.E.BaE4I");
    }

    @Test
    public void test40117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest80.test40117");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.upperCase("NTERFACEJAVA.LANG.cLONEABLE.......JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVAINTERFACEJAVA");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "NTERFACEJAVA.LANG.CLONEABLE.......JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVAINTERFACEJAVA" + "'", str1, "NTERFACEJAVA.LANG.CLONEABLE.......JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVAINTERFACEJAVA");
    }

    @Test
    public void test40118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest80.test40118");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.defaultString("       uti");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "       uti" + "'", str1, "       uti");
    }

    @Test
    public void test40119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest80.test40119");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.leftPad("                                                                                                                                                                                                                                             HI!aRRAYlISTaRRAYlISTaRRAYlISTAVAJ.GNALaRRAYlISTaRRAYlISTaRRAYlIST", 104, ".LANG");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "                                                                                                                                                                                                                                             HI!aRRAYlISTaRRAYlISTaRRAYlISTAVAJ.GNALaRRAYlISTaRRAYlISTaRRAYlIST" + "'", str3, "                                                                                                                                                                                                                                             HI!aRRAYlISTaRRAYlISTaRRAYlISTAVAJ.GNALaRRAYlISTaRRAYlISTaRRAYlIST");
    }

    @Test
    public void test40120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest80.test40120");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.rightPad("#################################################################slitUgnirtSslitUgnirtSslitUgnirtSslitUgnirtSslitUgnirtSslitUgnirtSslitUgnirtSslitUgnirtSslitUgnirtSslitUgnirts#################################################################", 144);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "#################################################################slitUgnirtSslitUgnirtSslitUgnirtSslitUgnirtSslitUgnirtSslitUgnirtSslitUgnirtSslitUgnirtSslitUgnirtSslitUgnirts#################################################################" + "'", str2, "#################################################################slitUgnirtSslitUgnirtSslitUgnirtSslitUgnirtSslitUgnirtSslitUgnirtSslitUgnirtSslitUgnirtSslitUgnirtSslitUgnirts#################################################################");
    }

    @Test
    public void test40121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest80.test40121");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.leftPad("ziirSoifri$oCfri", 524, '$');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$ziirSoifri$oCfri" + "'", str3, "$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$ziirSoifri$oCfri");
    }

    @Test
    public void test40122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest80.test40122");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfAnyBut("classjavalaiNTERFACE JAVA$LANG$cLONEABLE$$$$$$$JAVA$$$$$$$$$$JAVA$$$$$$$$$$JAVA$$$$$$$$$$JAVA$$$$$$$$$$JAVA$$$$$$$$$$JAVA$$$$$$$$$$JAVA$$$$$$$$$$JAVA$$$$$$$$$$JAVA$$$$$$$$$$JAVALANGJAVAULANGJAVAULANGJAVAULANGJAVAULANGJAVAULANGJAVAULANGJAVAULANGJAVAULANGJAVAULANGJAVAULANGJAVAULANGJAVAULANGJAVAULANGJAVAULANGJAVAULANGJAVAULANGJAVAULANGJAVAULANGJAVAULANG", "slitUgnirtSslitUgnirtSslitUgnirtSslitUgnirtSslitUgnirtSslitUgnirtSslitUgnirtSslitUgnirtSslitUgnirtSslitUgnirtslitUgnirtSslitUgnirtSslitUgnirtSslitUgnirtSslitUgnirtSslitUgnirtSslitUgnirtSslitUgnirtSslitUgnirtSslitUgnirtslitUgnirtSslitUgnirtSslitUgnirtSslitUgnirtSslitUgnirtSslitUgnirtSslgnalslitUgnirtSslitUgnirtSslitUgnirtSslitUgnirtSslitUgnirtSslitUgnirtSslitUgnirtSslitUgnirtSslitUgnirtSslitUgnirtslitUgnirtSslitUgnirtSslitUgnirtSslitUgnirtSslitUgnirtSslitUgnirtSslitUgnirtSslitUgnirtSslitUgnirtSslitUgnirtslitUgnirtSslitUgnirtSslitUgnirtSslitUgnirtSslitUgnirtSslitUgnirtSsl");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test40123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest80.test40123");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.right("slitUgnirtSslitUgnirtSslitUgnirtSslitUgnirtSslitUgnirtSslitUgnirtSslitUgnirtSslitUgnirtSslitUgnirtSslitUgnirtslitUgnirtSslitUgnirtSslitUgnirtSslitUgnirtSslitUgnirtSslitUgnirtSslitUgnirtSslitUgnirtSslitUgnirtSslitUgnirtslitUgnirtSslitUgnirtSslitUgnirtSslitUgnirtSslitUgnirtSslitUgnirtSslgnalslitUgnirtSslitUgnirtSslitUgnirtSslitUgnirtSslitUgnirtSslitUgnirtSslitUgnirtSslitUgnirtSslitUgnirtSslitUgnirtslitUgnirtSslitUgnirtSslitUgnirtSslitUgnirtSslitUgnirtSslitUgnirtSslitUgnirtSslitUgnirtSslitUgnirtSslitUgnirtslitUgnirtSslitUgnirtSslitUgnirtSslitUgnirtSslitUgnirtSslitUgnirtSsl", 69);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "tslitUgnirtSslitUgnirtSslitUgnirtSslitUgnirtSslitUgnirtSslitUgnirtSsl" + "'", str2, "tslitUgnirtSslitUgnirtSslitUgnirtSslitUgnirtSslitUgnirtSslitUgnirtSsl");
    }

    @Test
    public void test40124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest80.test40124");
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa...", "                                                                                                                                                                            #agnaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaajaval#.aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaajaval#                                                                                                                                                                            ", 70);
        java.lang.String[] strArray8 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("      ", "", 24);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str9 = org.apache.commons.lang3.StringUtils.replaceEach(".................................................................................", strArray4, strArray8);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Search and Replace array lengths don't match: 1 vs 7");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertNotNull(strArray8);
    }

    @Test
    public void test40125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest80.test40125");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substring("gnal.avajgnal..langgnal.avajgnallitullitullitu", 76);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test40126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest80.test40126");
        int int2 = org.apache.commons.lang3.StringUtils.indexOf("                                                                                                                                            #############################################", 940);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test40127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest80.test40127");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.center("..........IrfCo$irfioSrii", 63, "NAL.");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "NAL.NAL.NAL.NAL.NAL..........IrfCo$irfioSriiNAL.NAL.NAL.NAL.NAL" + "'", str3, "NAL.NAL.NAL.NAL.NAL..........IrfCo$irfioSriiNAL.NAL.NAL.NAL.NAL");
    }

    @Test
    public void test40128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest80.test40128");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOf("va1jva1jva1jva1jva1jva1jva1jva1jva1jva1jvaJAVAULANGva1jva1jva1jva1jva1jva1jva1jva1jva1jva1jva1", "...vaj.gnalarraylistarraylistarrayli", 47);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test40129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest80.test40129");
        int int3 = org.apache.commons.lang3.StringUtils.indexOf("                       JAVAULANGRRAYLIST", "########################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################SILYARRA!IH$$$$$$$$", 199);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test40130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest80.test40130");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOf("444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444litu.avajlitu.avajArrayListArrayListArrayListavajGNAL.AVAJLANG.JAVAGNAL.AVAJLANG.JAVAGNAL.AVAJLANG.JAVAGNAL.AVAJLANG.JAVAGNAL.AVAJLANG.JAVAGNAL.AVAJLANG.JAVAGNAL.AVAJLANG.JAVAGNAL.AVAJLANG.JAVAGNAL.AVAJgnalArrayListArrayListArrayListavajGNAL.AVAJLANG.JAVAGNAL.AVAJLANG.JAVAGNAL.AVAJLANG.JAVAGNAL.AVAJLANG.JAVAGNAL.AVAJLANG.JAVAGNAL.AVAJLANG.JAVAGNAL.AVAJLANG.JAVAGNAL.AVAJLANG.JAVAGNAL.AVAJgnalArrayListArrayListArrayListavajGNAL.AVAJLANG.JAVAGNAL.AVAJLANG.JAVAGNAL.AVAJLANG.JAVAGNAL.AVAJLANG.JAVAGNAL.AVAJLANG.JAVAGNAL.AVAJLANG.JAVAGNAL.AVAJLANG.JAVAGNAL.AVAJLANG.JAVAGNAL.AVAJgnalArrayListArrayListArrayListavajGNAL.AVAJLANG.JAVAGNAL.AVAJLANG.JAVAGNAL.AVAJLANG.JAVAGNAL.AVAJLANG.JAVAGNAL.AVAJLANG.JAVAGNAL.AVAJLANG.JAVAGNAL.AVAJLANG.JAVAGNAL.AVAJLANG.JAVAGNAL.AVAJgnalArrayListArrayListArrayListavaj", "arr...aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa...aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa...aJava.lang.Stringclassjava.lang.Stringclassjava.lang.Stringclas.lang.Stringclassjava.lang.Stringcarr...aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa...aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa...aa");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test40131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest80.test40131");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBefore("", "JAVAJAVAJAVAJAVAJAVAJAVAJAVAJAVAJAVAJAVAJAVAJAVAJAVAJAVAJAVAJAVAJAVAJAVAJAVAJAVAJAVAJAVAJAVAJAVAJAVAJAVAJAVAJAVAJAVAJAVAJAVAJAVAJAVAJAVA");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test40132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest80.test40132");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.strip("GNAL..aRRAY..lIST..aRRAY..lIST..aRRAY..lI");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "GNAL..aRRAY..lIST..aRRAY..lIST..aRRAY..lI" + "'", str1, "GNAL..aRRAY..lIST..aRRAY..lIST..aRRAY..lI");
    }

    @Test
    public void test40133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest80.test40133");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitByCharacterType("string.");
        java.lang.Class<?> wildcardClass2 = strArray1.getClass();
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test40134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest80.test40134");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNumericSpace((java.lang.CharSequence) "h!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ihlitu.avaj");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test40135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest80.test40135");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isEmpty((java.lang.CharSequence) ".............java..........java..........java..........java..........java..........java..........java..........java..........java..........java...........");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test40136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest80.test40136");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.strip("-1.v.v.uS.rivaizvaa.");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "-1.v.v.uS.rivaizvaa." + "'", str1, "-1.v.v.uS.rivaizvaa.");
    }

    @Test
    public void test40137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest80.test40137");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.strip("#AGNAAAAAAAAGNAL#AGNAAAAAAAAGNAL#AGNAAAAAAAAGNAL#AGNAAAAAAAAGNAL#AGNAAAAAAAAGNAL#AGNAAAAAAAAGNAL#AGNAAAAAAAAGNAL#AGNAAAAAAAAGNAL#AGNAAAAAAAAGNAL#AGNAAAAAAAAGNAL#AGNAAAAAAAAGNAL#AGNAAAAAAAAGNAL#AGNAAAAAAAAGNAL#AGNA########################################################nnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnn#########################################################AGNAAAAAAAAGNAL#AGNAAAAAAAAGNAL#AGNAAAAAAAAGNAL#AGNAAAAAAAAGNAL#AGNAAAAAAAAGNAL#AGNAAAAAAAAGNAL#AGNAAAAAAAAGNAL#AGNAAAAAAAAGNAL#AGNAAAAAAAAGNAL#AGNAAAAAAAAGNAL#AGNAAAAAAAAGNAL#AGNAAAAAAAAGNAL#AGNAAAAAAAAGNAL#AGNA");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "#AGNAAAAAAAAGNAL#AGNAAAAAAAAGNAL#AGNAAAAAAAAGNAL#AGNAAAAAAAAGNAL#AGNAAAAAAAAGNAL#AGNAAAAAAAAGNAL#AGNAAAAAAAAGNAL#AGNAAAAAAAAGNAL#AGNAAAAAAAAGNAL#AGNAAAAAAAAGNAL#AGNAAAAAAAAGNAL#AGNAAAAAAAAGNAL#AGNAAAAAAAAGNAL#AGNA########################################################nnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnn#########################################################AGNAAAAAAAAGNAL#AGNAAAAAAAAGNAL#AGNAAAAAAAAGNAL#AGNAAAAAAAAGNAL#AGNAAAAAAAAGNAL#AGNAAAAAAAAGNAL#AGNAAAAAAAAGNAL#AGNAAAAAAAAGNAL#AGNAAAAAAAAGNAL#AGNAAAAAAAAGNAL#AGNAAAAAAAAGNAL#AGNAAAAAAAAGNAL#AGNAAAAAAAAGNAL#AGNA" + "'", str1, "#AGNAAAAAAAAGNAL#AGNAAAAAAAAGNAL#AGNAAAAAAAAGNAL#AGNAAAAAAAAGNAL#AGNAAAAAAAAGNAL#AGNAAAAAAAAGNAL#AGNAAAAAAAAGNAL#AGNAAAAAAAAGNAL#AGNAAAAAAAAGNAL#AGNAAAAAAAAGNAL#AGNAAAAAAAAGNAL#AGNAAAAAAAAGNAL#AGNAAAAAAAAGNAL#AGNA########################################################nnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnn#########################################################AGNAAAAAAAAGNAL#AGNAAAAAAAAGNAL#AGNAAAAAAAAGNAL#AGNAAAAAAAAGNAL#AGNAAAAAAAAGNAL#AGNAAAAAAAAGNAL#AGNAAAAAAAAGNAL#AGNAAAAAAAAGNAL#AGNAAAAAAAAGNAL#AGNAAAAAAAAGNAL#AGNAAAAAAAAGNAL#AGNAAAAAAAAGNAL#AGNAAAAAAAAGNAL#AGNA");
    }

    @Test
    public void test40138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest80.test40138");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOfIgnoreCase("       444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444", "interface java.lang.Cloneable       aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa...interface java.io.Serializableinterface java.lang.Cloneable       aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa...interface java.io.Serializableinterface java.lang.Cloneable       aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa...interface java.io.Serializableinterface java.lang.Cloneable       aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa...interface java.io.Serializableinterface java.lang.Cloneable       aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa...interface java.io.Serializableinterface java.lang.Cloneable       aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa...interface java.io.Serializableintclassjava.lang");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test40139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest80.test40139");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOfIgnoreCase("##############################################################################################################################################################################################################", "4v4jgn4l", 157);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test40140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest80.test40140");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.capitalize((java.lang.CharSequence) "gnalarraylistarraylistarraylignalarraylistarraylistarraylignalarraylistarraylistarraylignalarraylistarraylistarraylignalarraylistarraylistarraylignalarraylistarraylistarraylignalarraylistarraylistarraylignalarraylistarraylistarraylignalarraylistarrayJAVA.LANGAgnal.avajgnal..LANGgnal.avgnalarraylistarraylistarraylignalarraylistarraylistarraylignalarraylistarraylistarraylignalarraylistarraylistarraylignalarraylistarraylistarraylignalarraylistarraylistarraylignalarraylistarraylistarraylignalarraylistarraylistarraylignalarraylistarrayl");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "GnalarraylistarraylistarraylignalarraylistarraylistarraylignalarraylistarraylistarraylignalarraylistarraylistarraylignalarraylistarraylistarraylignalarraylistarraylistarraylignalarraylistarraylistarraylignalarraylistarraylistarraylignalarraylistarrayJAVA.LANGAgnal.avajgnal..LANGgnal.avgnalarraylistarraylistarraylignalarraylistarraylistarraylignalarraylistarraylistarraylignalarraylistarraylistarraylignalarraylistarraylistarraylignalarraylistarraylistarraylignalarraylistarraylistarraylignalarraylistarraylistarraylignalarraylistarrayl" + "'", str1, "GnalarraylistarraylistarraylignalarraylistarraylistarraylignalarraylistarraylistarraylignalarraylistarraylistarraylignalarraylistarraylistarraylignalarraylistarraylistarraylignalarraylistarraylistarraylignalarraylistarraylistarraylignalarraylistarrayJAVA.LANGAgnal.avajgnal..LANGgnal.avgnalarraylistarraylistarraylignalarraylistarraylistarraylignalarraylistarraylistarraylignalarraylistarraylistarraylignalarraylistarraylistarraylignalarraylistarraylistarraylignalarraylistarraylistarraylignalarraylistarraylistarraylignalarraylistarrayl");
    }

    @Test
    public void test40141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest80.test40141");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.center("nterface java.lang.Cloneable.......java.......", 37, '4');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "nterface java.lang.Cloneable.......java......." + "'", str3, "nterface java.lang.Cloneable.......java.......");
    }

    @Test
    public void test40142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest80.test40142");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.reverseDelimited("                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                            ", 'a');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                            " + "'", str2, "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                            ");
    }

    @Test
    public void test40143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest80.test40143");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trimToNull("Java.litu.avajlitu.avajjava.litu.avajlitu.avajjava.litu.avajlitu.avaayL A    Java.litu.avajlitu.avajjava.litu.avajlitu.avajjava.litu.avajlitu.ava");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Java.litu.avajlitu.avajjava.litu.avajlitu.avajjava.litu.avajlitu.avaayL A    Java.litu.avajlitu.avajjava.litu.avajlitu.avajjava.litu.avajlitu.ava" + "'", str1, "Java.litu.avajlitu.avajjava.litu.avajlitu.avajjava.litu.avajlitu.avaayL A    Java.litu.avajlitu.avajjava.litu.avajlitu.avajjava.litu.avajlitu.ava");
    }

    @Test
    public void test40144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest80.test40144");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("aenolc.gnaelbagaga.langagaga.langagaga.langagaga.langagaga.langagaga.langagaga.langagaga.langagaga.langagaga.langagaga.langagaga.langagaga.langagaga.langagaga.langagaga.langagaga.langagaga.langagaga.langagaga.langagaga.langagaga.langagaga.langagaga.langagaga.langagaga.langagaga.langagaga.langagaga.langagaga.langagaga.langagaga.langagaga.langagaga.langagaga.langafretnigniragecagaoi.", "ASALYAVV                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                            ", 66);
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void test40145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest80.test40145");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA       ", "VAJ.GNAL");
        java.lang.String[] strArray6 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("", "class java.lang.Class");
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.replaceEach("$       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $", strArray3, strArray6);
        java.lang.Class<?>[] wildcardClassArray8 = org.apache.commons.lang3.ClassUtils.toClass((java.lang.Object[]) strArray6);
        java.lang.Class<?>[] wildcardClassArray9 = org.apache.commons.lang3.ClassUtils.wrappersToPrimitives(wildcardClassArray8);
        java.lang.String[] strArray12 = org.apache.commons.lang3.StringUtils.splitByCharacterTypeCamelCase("...44444...");
        int int13 = org.apache.commons.lang3.StringUtils.indexOfAny("$       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       ", strArray12);
        java.lang.Class<?>[] wildcardClassArray14 = org.apache.commons.lang3.ClassUtils.toClass((java.lang.Object[]) strArray12);
        java.lang.Class<?>[] wildcardClassArray15 = org.apache.commons.lang3.ClassUtils.primitivesToWrappers(wildcardClassArray14);
        boolean boolean17 = org.apache.commons.lang3.ClassUtils.isAssignable(wildcardClassArray9, wildcardClassArray14, true);
        java.lang.String str18 = org.apache.commons.lang3.StringUtils.concat((java.lang.Object[]) wildcardClassArray9);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "$       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $" + "'", str7, "$       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $");
        org.junit.Assert.assertNotNull(wildcardClassArray8);
        org.junit.Assert.assertNotNull(wildcardClassArray9);
        org.junit.Assert.assertNotNull(strArray12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertNotNull(wildcardClassArray14);
        org.junit.Assert.assertNotNull(wildcardClassArray15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
    }

    @Test
    public void test40146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest80.test40146");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.lowerCase("tringcla#######################vj.gn vj.gn vj.gn #######################");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "tringcla#######################vj.gn vj.gn vj.gn #######################" + "'", str1, "tringcla#######################vj.gn vj.gn vj.gn #######################");
    }

    @Test
    public void test40147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest80.test40147");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.leftPad("ArrayLis.....", 570);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                             ArrayLis....." + "'", str2, "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                             ArrayLis.....");
    }

    @Test
    public void test40148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest80.test40148");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.split("utiljava.utilarrAjava.utiljava.utilarrAjava.utiljava.utilarrAjava.utiljava.utilarrAjava.utiljava.utilarrAjava.utiljava.utilarrAjava.utiljava.utilarrA#########################################################################itu.avaj#########################################################################", '.');
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test40149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest80.test40149");
        int int2 = org.apache.commons.lang3.StringUtils.indexOf("JAVATSILYARRATSILYARRATSILYARRA", "ArrayListArrayListArrayListavaj.gnal                                                                                                                                         ");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test40150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest80.test40150");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphaSpace((java.lang.CharSequence) "$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$                                  ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test40151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest80.test40151");
        int int3 = org.apache.commons.lang3.StringUtils.indexOf("...java..........java..classjavalangClassJAVAULANGJAVAULANGJAVAULANGJAVAULANGJAVAULANGJAVAULANGJAVAULANGJAVAULANGJAVAULANGJAVAULANGJAVAULANGJAVAULANGJAVAULANGJAVAULANGJAVAULANGJAVAULANGJAVAULANGJAVAULANGJAVAULANGJAVAULANG$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$", "$", 969);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test40152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest80.test40152");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("class java.lang.String", "                                   ");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.stripAll(strArray2);
        java.lang.Class<?>[] wildcardClassArray4 = org.apache.commons.lang3.ClassUtils.toClass((java.lang.Object[]) strArray3);
        java.lang.Class<?>[] wildcardClassArray5 = org.apache.commons.lang3.ClassUtils.primitivesToWrappers(wildcardClassArray4);
        java.lang.Class<?> wildcardClass6 = null;
        java.lang.Class[] classArray8 = new java.lang.Class[1];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray9 = (java.lang.Class<?>[]) classArray8;
        wildcardClassArray9[0] = wildcardClass6;
        java.lang.Class<?>[] wildcardClassArray12 = org.apache.commons.lang3.ClassUtils.primitivesToWrappers(wildcardClassArray9);
        java.lang.Class<?> wildcardClass13 = null;
        java.lang.Class[] classArray15 = new java.lang.Class[1];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray16 = (java.lang.Class<?>[]) classArray15;
        wildcardClassArray16[0] = wildcardClass13;
        java.lang.Class<?>[] wildcardClassArray19 = org.apache.commons.lang3.ClassUtils.primitivesToWrappers(wildcardClassArray16);
        java.lang.String[] strArray21 = new java.lang.String[] { "                                   " };
        java.lang.String str22 = org.apache.commons.lang3.StringUtils.getCommonPrefix(strArray21);
        java.lang.Class<?>[] wildcardClassArray23 = org.apache.commons.lang3.ClassUtils.toClass((java.lang.Object[]) strArray21);
        java.lang.Class<?> wildcardClass24 = null;
        java.lang.Class[] classArray26 = new java.lang.Class[1];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray27 = (java.lang.Class<?>[]) classArray26;
        wildcardClassArray27[0] = wildcardClass24;
        java.lang.Class<?>[] wildcardClassArray30 = org.apache.commons.lang3.ClassUtils.primitivesToWrappers(wildcardClassArray27);
        boolean boolean31 = org.apache.commons.lang3.ClassUtils.isAssignable(wildcardClassArray23, wildcardClassArray27);
        boolean boolean33 = org.apache.commons.lang3.ClassUtils.isAssignable(wildcardClassArray16, wildcardClassArray27, true);
        boolean boolean35 = org.apache.commons.lang3.ClassUtils.isAssignable(wildcardClassArray12, wildcardClassArray27, true);
        java.lang.String str37 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) wildcardClassArray27, 'a');
        boolean boolean39 = org.apache.commons.lang3.ClassUtils.isAssignable(wildcardClassArray5, wildcardClassArray27, false);
        java.lang.String str40 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) wildcardClassArray27);
        java.lang.Class<?>[] wildcardClassArray41 = org.apache.commons.lang3.ClassUtils.toClass((java.lang.Object[]) wildcardClassArray27);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertNotNull(wildcardClassArray4);
        org.junit.Assert.assertNotNull(wildcardClassArray5);
        org.junit.Assert.assertNotNull(classArray8);
        org.junit.Assert.assertNotNull(wildcardClassArray9);
        org.junit.Assert.assertNotNull(wildcardClassArray12);
        org.junit.Assert.assertNotNull(classArray15);
        org.junit.Assert.assertNotNull(wildcardClassArray16);
        org.junit.Assert.assertNotNull(wildcardClassArray19);
        org.junit.Assert.assertNotNull(strArray21);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "                                   " + "'", str22, "                                   ");
        org.junit.Assert.assertNotNull(wildcardClassArray23);
        org.junit.Assert.assertNotNull(classArray26);
        org.junit.Assert.assertNotNull(wildcardClassArray27);
        org.junit.Assert.assertNotNull(wildcardClassArray30);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "" + "'", str37, "");
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "" + "'", str40, "");
        org.junit.Assert.assertNotNull(wildcardClassArray41);
    }

    @Test
    public void test40153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest80.test40153");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.split("JavaStringnalArrayListArrayListArrainterface java.lang.Cloneable44444444444444444444444444444444444444444444444444interface java.io.Serializabl", '#');
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test40154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest80.test40154");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.defaultString("rChahacta");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "rChahacta" + "'", str1, "rChahacta");
    }

    @Test
    public void test40155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest80.test40155");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.left("interface java.lang.Cloneable.......java.......Objectava..........javainterface java.io.Serializable###########################################################################################################################################################################################################", 119);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "interface java.lang.Cloneable.......java.......Objectava..........javainterface java.io.Serializable###################" + "'", str2, "interface java.lang.Cloneable.......java.......Objectava..........javainterface java.io.Serializable###################");
    }

    @Test
    public void test40156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest80.test40156");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.substringsBetween("...                           HI!aRRAYlISTaRRAYlISTaRRAYlISTAVAJ.GNALaRRAYlISTaRRAYlISTaRRAYlIST", "...aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaayl a.a", "classjavalangclassjavaulangjavaulangjavaulangjavaulangjavaulangjavaulangjavaulangjavaulangjavaulangjavaulangjavaulangjavaulangjavaulangjavaulangjavaulangjavaulangjavaulangjavaulangjavaulangjavaulang");
        org.junit.Assert.assertNull(strArray3);
    }

    @Test
    public void test40157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest80.test40157");
        int int2 = org.apache.commons.lang3.StringUtils.countMatches("", "aaaaaaaaaajaval.agnaaaaaaaaaajaval.agnaaaaaaaaaajaval.agnaaaaaaaaaajaval.agnaaaaaaaaaajaval.agnaaaaaaaaaajaval.agnaaaaaaaaaajaval.agnaaaaaaaaaajaval.agnaaaaaaaaaajaval.agnaaaaaaaaaajaval.agnaaaaaaaaaajaval.agnaaaaaaaaaajaval.agnaaaaaaaaaaja                                              aaaaaaajaval.agnaaaaaaaaaajaval.agnaaaaaaaaaajaval.agnaaaaaaaaaajaval.agnaaaaaaaaaajaval.agnaaaaaaaaaajaval.agnaaaaaaaaaajaval.agnaaaaaaaaaajaval.agnaaaaaaaaaajaval.agnaaaaaaaaaajaval.agnaaaaaaaaaajaval.agnaaaaaaaaaajaval.agnaaaaaaaaaarin");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test40158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest80.test40158");
        java.lang.CharSequence charSequence2 = org.apache.commons.lang3.StringUtils.defaultIfEmpty((java.lang.CharSequence) "$$$$$$$$$$$$$$$$$$$$$", (java.lang.CharSequence) "                                                                                               javaulangr...");
        org.junit.Assert.assertEquals("'" + charSequence2 + "' != '" + "$$$$$$$$$$$$$$$$$$$$$" + "'", charSequence2, "$$$$$$$$$$$$$$$$$$$$$");
    }

    @Test
    public void test40159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest80.test40159");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAsciiPrintable((java.lang.CharSequence) "GNALUAVAJGNALUAVAJSSALCGNALAVAJavajlitu");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test40160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest80.test40160");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitByCharacterType("                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                               aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test40161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest80.test40161");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.lowerCase("A##RyLRsA##RyLRsA##RyLRsA##RyLRsA##        A##RyLRsA##RyLRsA##RyLRsA##RyLRsA##        A##RyLRsA##RyLRsA##RyLRsA##RyLRsA##        A##RyLRsA##RyLRsA##RyLRsA##RyLRsA##        A##RyLRsA##RyLRsA##RyLRsA##RyLRsA##        A##RyLRsA##RyLRsA##RyLRsA##RyLRsA##        A##RyLRsA##RyLRsA##RyLRsA##RyLRsA##        A##RyLRsA##RyLRsA##RyLRsA##RyLRsA##        A##RyLRsA##RyLRsA##RyLRsA##RyLRsA##        A##RyLRsA##RyLRsA##RyLRsA##RyLRsA##        A##RyLRsA##RyLRsA##RyLRsA##RyLRsA##        A##RyLRsA##RyLRsA##RyLRsA##RyLRsA##        A##RyLRsA##RyLRs                                    cafretni");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "a##rylrsa##rylrsa##rylrsa##rylrsa##        a##rylrsa##rylrsa##rylrsa##rylrsa##        a##rylrsa##rylrsa##rylrsa##rylrsa##        a##rylrsa##rylrsa##rylrsa##rylrsa##        a##rylrsa##rylrsa##rylrsa##rylrsa##        a##rylrsa##rylrsa##rylrsa##rylrsa##        a##rylrsa##rylrsa##rylrsa##rylrsa##        a##rylrsa##rylrsa##rylrsa##rylrsa##        a##rylrsa##rylrsa##rylrsa##rylrsa##        a##rylrsa##rylrsa##rylrsa##rylrsa##        a##rylrsa##rylrsa##rylrsa##rylrsa##        a##rylrsa##rylrsa##rylrsa##rylrsa##        a##rylrsa##rylrs                                    cafretni" + "'", str1, "a##rylrsa##rylrsa##rylrsa##rylrsa##        a##rylrsa##rylrsa##rylrsa##rylrsa##        a##rylrsa##rylrsa##rylrsa##rylrsa##        a##rylrsa##rylrsa##rylrsa##rylrsa##        a##rylrsa##rylrsa##rylrsa##rylrsa##        a##rylrsa##rylrsa##rylrsa##rylrsa##        a##rylrsa##rylrsa##rylrsa##rylrsa##        a##rylrsa##rylrsa##rylrsa##rylrsa##        a##rylrsa##rylrsa##rylrsa##rylrsa##        a##rylrsa##rylrsa##rylrsa##rylrsa##        a##rylrsa##rylrsa##rylrsa##rylrsa##        a##rylrsa##rylrsa##rylrsa##rylrsa##        a##rylrsa##rylrs                                    cafretni");
    }

    @Test
    public void test40162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest80.test40162");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOfIgnoreCase("tsiLyAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA 444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444", "                                                                                                                              4444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444AAAAAAAAAA                                                                                                                                                                                      ", 181);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test40163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest80.test40163");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBefore("...aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa... aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa... aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa... aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa... aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa... aaaaaaaaaaaaaaaaaaaaaaaaaa...", "......");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "...aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa... aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa... aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa... aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa... aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa... aaaaaaaaaaaaaaaaaaaaaaaaaa..." + "'", str2, "...aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa... aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa... aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa... aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa... aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa... aaaaaaaaaaaaaaaaaaaaaaaaaa...");
    }

    @Test
    public void test40164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest80.test40164");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.contains("444444444444444444444444444444", 154);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test40165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest80.test40165");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isWhitespace((java.lang.CharSequence) "                                                                                                                                                                                                                                                                                                                              ][ssalC                                                                                                                                                                                                                                                                                                                                                        ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test40166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest80.test40166");
        java.lang.String str1 = org.apache.commons.lang3.ClassUtils.getPackageCanonicalName("gn lu v j                       ................................................................");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "gnluvj..............................................................." + "'", str1, "gnluvj...............................................................");
    }

    @Test
    public void test40167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest80.test40167");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "elbazilaireS.oi.avaj ecafretni elbaenolC.gnal.avaj ecafretni", "");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test40168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest80.test40168");
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.replace("         ..44444...         ..44444...         ..44444...         ..44444...         ..44444...         ..44444...         ..44444...         ..44444...         ..44444...         ..44444...         ..44444...         ..44444...         ..44444...         ..44444...         ..44444...         ..44444...         ..44444...         ..44444...         ..44444...         ..44444...         ..44444...         ..44444...         ..44444...         ..44444...         ..44444...         ..44444...         ..44444...         ..44444...         ..44444...         ..44444...         ..44444...         ..44444...         ..44444...         ..44444...         ..44444...         ", "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                         $$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$", "$$$$$$$$$$$$$$$$$$$$44444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444Character", 532);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "         ..44444...         ..44444...         ..44444...         ..44444...         ..44444...         ..44444...         ..44444...         ..44444...         ..44444...         ..44444...         ..44444...         ..44444...         ..44444...         ..44444...         ..44444...         ..44444...         ..44444...         ..44444...         ..44444...         ..44444...         ..44444...         ..44444...         ..44444...         ..44444...         ..44444...         ..44444...         ..44444...         ..44444...         ..44444...         ..44444...         ..44444...         ..44444...         ..44444...         ..44444...         ..44444...         " + "'", str4, "         ..44444...         ..44444...         ..44444...         ..44444...         ..44444...         ..44444...         ..44444...         ..44444...         ..44444...         ..44444...         ..44444...         ..44444...         ..44444...         ..44444...         ..44444...         ..44444...         ..44444...         ..44444...         ..44444...         ..44444...         ..44444...         ..44444...         ..44444...         ..44444...         ..44444...         ..44444...         ..44444...         ..44444...         ..44444...         ..44444...         ..44444...         ..44444...         ..44444...         ..44444...         ..44444...         ");
    }

    @Test
    public void test40169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest80.test40169");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.deleteWhitespace("JAVA.LANG.CLONEABLE...                                 INTERFACE JAVA.IO.SERIALIZABLE");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "JAVA.LANG.CLONEABLE...INTERFACEJAVA.IO.SERIALIZABLE" + "'", str1, "JAVA.LANG.CLONEABLE...INTERFACEJAVA.IO.SERIALIZABLE");
    }

    @Test
    public void test40170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest80.test40170");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBetween("JAVA.LANGAgnal.avajgnal..LANGgnal.av", "$A");
        org.junit.Assert.assertNull(str2);
    }

    @Test
    public void test40171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest80.test40171");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeEndIgnoreCase("$ArrayLis", "AAA$$$$$$$$$$$$$$$$$$$$$$$$$$$$$");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "$ArrayLis" + "'", str2, "$ArrayLis");
    }

    @Test
    public void test40172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest80.test40172");
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
        java.lang.Class<?>[] wildcardClassArray30 = org.apache.commons.lang3.ClassUtils.wrappersToPrimitives(wildcardClassArray21);
        java.lang.String[] strArray33 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("hi!", "");
        java.lang.String[] strArray35 = org.apache.commons.lang3.StringUtils.stripAll(strArray33, "$");
        java.lang.Class<?>[] wildcardClassArray36 = org.apache.commons.lang3.ClassUtils.toClass((java.lang.Object[]) strArray33);
        java.lang.Class<?>[] wildcardClassArray37 = org.apache.commons.lang3.ClassUtils.toClass((java.lang.Object[]) wildcardClassArray36);
        java.lang.String str41 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) wildcardClassArray37, '#', (int) (byte) -1, (-1));
        java.lang.Class<?> wildcardClass42 = null;
        java.lang.Class[] classArray44 = new java.lang.Class[1];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray45 = (java.lang.Class<?>[]) classArray44;
        wildcardClassArray45[0] = wildcardClass42;
        java.lang.Class<?>[] wildcardClassArray48 = org.apache.commons.lang3.ClassUtils.primitivesToWrappers(wildcardClassArray45);
        java.lang.Class<?>[] wildcardClassArray49 = org.apache.commons.lang3.ClassUtils.primitivesToWrappers(wildcardClassArray45);
        boolean boolean50 = org.apache.commons.lang3.ClassUtils.isAssignable(wildcardClassArray37, wildcardClassArray49);
        java.lang.String str52 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) wildcardClassArray49, "                                  ");
        java.lang.Class<?>[] wildcardClassArray53 = org.apache.commons.lang3.ClassUtils.toClass((java.lang.Object[]) wildcardClassArray49);
        java.lang.Class<?>[] wildcardClassArray54 = org.apache.commons.lang3.ClassUtils.wrappersToPrimitives(wildcardClassArray49);
        boolean boolean56 = org.apache.commons.lang3.ClassUtils.isAssignable(wildcardClassArray21, wildcardClassArray49, false);
        java.lang.Class<?>[] wildcardClassArray57 = org.apache.commons.lang3.ClassUtils.primitivesToWrappers(wildcardClassArray49);
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
        org.junit.Assert.assertNotNull(wildcardClassArray30);
        org.junit.Assert.assertNotNull(strArray33);
        org.junit.Assert.assertNotNull(strArray35);
        org.junit.Assert.assertNotNull(wildcardClassArray36);
        org.junit.Assert.assertNotNull(wildcardClassArray37);
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "" + "'", str41, "");
        org.junit.Assert.assertNotNull(classArray44);
        org.junit.Assert.assertNotNull(wildcardClassArray45);
        org.junit.Assert.assertNotNull(wildcardClassArray48);
        org.junit.Assert.assertNotNull(wildcardClassArray49);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertEquals("'" + str52 + "' != '" + "" + "'", str52, "");
        org.junit.Assert.assertNotNull(wildcardClassArray53);
        org.junit.Assert.assertNotNull(wildcardClassArray54);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
        org.junit.Assert.assertNotNull(wildcardClassArray57);
    }

    @Test
    public void test40173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest80.test40173");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.split("...aaaaaaaaaaaaaaaaaaaaaaaaaa...", 'a');
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.stripAll(strArray2, "cLASSJAVA.LANG.cLASSjavaulangjavaulangjavaulangjavaulangjavaulangjavaulangjavaulangjavaulangjavaulangjavaulangjavaulangjavaulangjavaulangjavaulangjavaulangjavaulangjavaulangjavaulangjavaulangjavaulang");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str8 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray2, '.', (int) 'a', 103);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 97");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertNotNull(strArray4);
    }

    @Test
    public void test40174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest80.test40174");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.remove("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa...", "!AVA.IO.SERIALIZABLE !AVA.LANG.cLONEABLESTRINGINTERFA.E INTERFA.E");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa..." + "'", str2, "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa...");
    }

    @Test
    public void test40175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest80.test40175");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOfIgnoreCase("interface java.lang.Cloneable.interface java.io.Serializable", "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                             ArryLis", 563);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test40176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest80.test40176");
        java.lang.CharSequence charSequence5 = null;
        char[] charArray16 = new char[] { ' ', ' ', '#', 'a', '4', 'a' };
        int int17 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "", charArray16);
        boolean boolean18 = org.apache.commons.lang3.StringUtils.containsAny("$", charArray16);
        boolean boolean19 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "...       AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA...       AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA...       AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA...       AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA...       AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA...       AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA...       AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA...       AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA...       AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA...       AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA", charArray16);
        boolean boolean20 = org.apache.commons.lang3.StringUtils.containsAny("class java.lang.Object", charArray16);
        boolean boolean21 = org.apache.commons.lang3.StringUtils.containsOnly(charSequence5, charArray16);
        int int22 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "AAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAA...", charArray16);
        int int23 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "                                                    ...    ", charArray16);
        boolean boolean24 = org.apache.commons.lang3.StringUtils.containsAny("java..........java...........", charArray16);
        int int25 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaVAJ.GNALaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaagn", charArray16);
        int int26 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa       ...$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$", charArray16);
        org.junit.Assert.assertNotNull(charArray16);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray16), "  #a4a");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray16), "  #a4a");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray16), "[ ,  , #, a, 4, a]");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 11 + "'", int22 == 11);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 149 + "'", int25 == 149);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 422 + "'", int26 == 422);
    }

    @Test
    public void test40177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest80.test40177");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isWhitespace((java.lang.CharSequence) "... ... ... ... ... ... ... ... ... ...");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test40178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest80.test40178");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substring(".........................................................................................................................................................................................................................................................................................................................................................LANG.LANG.LANG.LANG", 202);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "...............................................................................................................................................LANG.LANG.LANG.LANG" + "'", str2, "...............................................................................................................................................LANG.LANG.LANG.LANG");
    }

    @Test
    public void test40179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest80.test40179");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.leftPad("AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA... AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA... AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA... AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA... AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA... AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA... AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA... AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA... AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA... ...ARRAYLISTARRAY", 53);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA... AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA... AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA... AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA... AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA... AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA... AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA... AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA... AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA... ...ARRAYLISTARRAY" + "'", str2, "AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA... AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA... AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA... AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA... AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA... AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA... AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA... AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA... AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA... ...ARRAYLISTARRAY");
    }

    @Test
    public void test40180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest80.test40180");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.rightPad("rface java.lang.cloneablelang.gnaljava.langavaj.gnaljava.langavaj.gnaljava.langavaj.gnaljava.langavaj.gnaljava.langavaj.gnaljava.langavaj", 60, 'a');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "rface java.lang.cloneablelang.gnaljava.langavaj.gnaljava.langavaj.gnaljava.langavaj.gnaljava.langavaj.gnaljava.langavaj.gnaljava.langavaj" + "'", str3, "rface java.lang.cloneablelang.gnaljava.langavaj.gnaljava.langavaj.gnaljava.langavaj.gnaljava.langavaj.gnaljava.langavaj.gnaljava.langavaj");
    }

    @Test
    public void test40181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest80.test40181");
        java.util.Locale locale1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.apache.commons.lang3.StringUtils.upperCase("#####################################################################################################################################################################################################################################################################################################################################tS.gnal.avaj#####################################################################################################################################################################################################################################################################################################################################", locale1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test40182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest80.test40182");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNumericSpace((java.lang.CharSequence) "....................................................................................................................lang.javatsilyarratsilyarratsilyarra.....................................................................................................................");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test40183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest80.test40183");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.equals((java.lang.CharSequence) "...............................................................................................................................................................................................................................HI!aRRAYlISTaRRAYlISTaRRAYlISTAVAJ.GNALaRRAYlISTaRRAYlISTaRRAYlISTAVAJ...............................................................................................................................................................................................................................", (java.lang.CharSequence) "java.lang.String ass");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test40184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest80.test40184");
        java.lang.String[] strArray2 = new java.lang.String[] { "                                   " };
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.getCommonPrefix(strArray2);
        java.lang.Class<?>[] wildcardClassArray4 = org.apache.commons.lang3.ClassUtils.toClass((java.lang.Object[]) strArray2);
        java.lang.String[] strArray7 = new java.lang.String[] { "                                   " };
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.getCommonPrefix(strArray7);
        int int9 = org.apache.commons.lang3.StringUtils.indexOfDifference((java.lang.CharSequence[]) strArray7);
        int int10 = org.apache.commons.lang3.StringUtils.lastIndexOfAny("...       ", strArray7);
        java.lang.String str11 = org.apache.commons.lang3.StringUtils.replaceEach("...       AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA", strArray2, strArray7);
        java.lang.Class<?>[] wildcardClassArray12 = org.apache.commons.lang3.ClassUtils.toClass((java.lang.Object[]) strArray2);
        java.lang.String str13 = org.apache.commons.lang3.StringUtils.concat((java.lang.Object[]) wildcardClassArray12);
        java.lang.String[] strArray16 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("hi!", "");
        java.lang.String[] strArray18 = org.apache.commons.lang3.StringUtils.stripAll(strArray16, "$");
        java.lang.Class<?>[] wildcardClassArray19 = org.apache.commons.lang3.ClassUtils.toClass((java.lang.Object[]) strArray16);
        boolean boolean20 = org.apache.commons.lang3.ClassUtils.isAssignable(wildcardClassArray12, wildcardClassArray19);
        java.lang.String[] strArray23 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("hi!", "");
        java.lang.String[] strArray25 = org.apache.commons.lang3.StringUtils.stripAll(strArray23, "$");
        java.lang.Class<?>[] wildcardClassArray26 = org.apache.commons.lang3.ClassUtils.toClass((java.lang.Object[]) strArray23);
        java.lang.Class<?> wildcardClass27 = null;
        java.lang.Class[] classArray29 = new java.lang.Class[1];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray30 = (java.lang.Class<?>[]) classArray29;
        wildcardClassArray30[0] = wildcardClass27;
        java.lang.Class<?>[] wildcardClassArray33 = org.apache.commons.lang3.ClassUtils.primitivesToWrappers(wildcardClassArray30);
        java.lang.String[] strArray35 = new java.lang.String[] { "                                   " };
        java.lang.String str36 = org.apache.commons.lang3.StringUtils.getCommonPrefix(strArray35);
        java.lang.Class<?>[] wildcardClassArray37 = org.apache.commons.lang3.ClassUtils.toClass((java.lang.Object[]) strArray35);
        java.lang.Class<?> wildcardClass38 = null;
        java.lang.Class[] classArray40 = new java.lang.Class[1];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray41 = (java.lang.Class<?>[]) classArray40;
        wildcardClassArray41[0] = wildcardClass38;
        java.lang.Class<?>[] wildcardClassArray44 = org.apache.commons.lang3.ClassUtils.primitivesToWrappers(wildcardClassArray41);
        boolean boolean45 = org.apache.commons.lang3.ClassUtils.isAssignable(wildcardClassArray37, wildcardClassArray41);
        boolean boolean47 = org.apache.commons.lang3.ClassUtils.isAssignable(wildcardClassArray30, wildcardClassArray41, true);
        boolean boolean49 = org.apache.commons.lang3.ClassUtils.isAssignable(wildcardClassArray26, wildcardClassArray41, false);
        java.lang.Class<?>[] wildcardClassArray50 = org.apache.commons.lang3.ClassUtils.primitivesToWrappers(wildcardClassArray26);
        boolean boolean52 = org.apache.commons.lang3.ClassUtils.isAssignable(wildcardClassArray19, wildcardClassArray50, false);
        java.lang.Class<?>[] wildcardClassArray53 = org.apache.commons.lang3.ClassUtils.primitivesToWrappers(wildcardClassArray19);
        java.lang.Class<?>[] wildcardClassArray54 = org.apache.commons.lang3.ClassUtils.primitivesToWrappers(wildcardClassArray19);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "                                   " + "'", str3, "                                   ");
        org.junit.Assert.assertNotNull(wildcardClassArray4);
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "                                   " + "'", str8, "                                   ");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "...       AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA" + "'", str11, "...       AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA");
        org.junit.Assert.assertNotNull(wildcardClassArray12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "class java.lang.String" + "'", str13, "class java.lang.String");
        org.junit.Assert.assertNotNull(strArray16);
        org.junit.Assert.assertNotNull(strArray18);
        org.junit.Assert.assertNotNull(wildcardClassArray19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertNotNull(strArray23);
        org.junit.Assert.assertNotNull(strArray25);
        org.junit.Assert.assertNotNull(wildcardClassArray26);
        org.junit.Assert.assertNotNull(classArray29);
        org.junit.Assert.assertNotNull(wildcardClassArray30);
        org.junit.Assert.assertNotNull(wildcardClassArray33);
        org.junit.Assert.assertNotNull(strArray35);
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "                                   " + "'", str36, "                                   ");
        org.junit.Assert.assertNotNull(wildcardClassArray37);
        org.junit.Assert.assertNotNull(classArray40);
        org.junit.Assert.assertNotNull(wildcardClassArray41);
        org.junit.Assert.assertNotNull(wildcardClassArray44);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertNotNull(wildcardClassArray50);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + true + "'", boolean52 == true);
        org.junit.Assert.assertNotNull(wildcardClassArray53);
        org.junit.Assert.assertNotNull(wildcardClassArray54);
    }

    @Test
    public void test40185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest80.test40185");
        int int3 = org.apache.commons.lang3.StringUtils.ordinalIndexOf("classjava.lang.Stringclassjava.lang.Stringclassjava.lang.Stringclassjava.lang.Stringclassjava.lang.Stringclassjava.lang.Stringclassjava.lang.Stringclassjava.lang.Stringclassjava.lang.Stringclassjava.lang.Stringclassjava.lang.Stringclassjava.lang.Stringclassjava.lang.Stringclassjava.lang.Stringclassjava.lang.Stringclassjava.lang.Stringclassjava.lang.Stringclassjava.lang.Stringclassjava.lang.Stringclassjava.lang.Stringclassjava.lang.Stringclassjava.lang.Stringclassjava.lang.Stringclassjava.lang.Stringclassjava.lang.Stringclassjava.lang.Stringclassjava.lang.Stringclassjava.lang.Stringclassjava.lang.Stringclassjava.lang", "aRR... AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA... AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA... AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA... AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA... AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA... AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA... AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA... AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA... AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA...", 714);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test40186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest80.test40186");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphaSpace((java.lang.CharSequence) "######################");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test40187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest80.test40187");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("     ##################################################java.uti#########################################################################", "ttBysINTER", 584);
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void test40188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest80.test40188");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("...jbO.gnal.avaj ssalcrrAtsiLytcejb", '$');
        java.lang.String[] strArray6 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("hi!", "...       aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.replaceEach("4444444444444                                                                                                                                               ", strArray3, strArray6);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "4444444444444                                                                                                                                               " + "'", str7, "4444444444444                                                                                                                                               ");
    }

    @Test
    public void test40189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest80.test40189");
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.substringsBetween("", "avaj.gnal", "$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$");
        boolean boolean5 = org.apache.commons.lang3.StringUtils.endsWithAny("                                                                                                                                                                                                                                                                                                                                                                                                                                                                                            Gnl$.$vj....................................................................................................................................................................................", strArray4);
        java.lang.String[] strArray7 = org.apache.commons.lang3.StringUtils.stripAll(strArray4, "elbazilaireS.oi.avaj ecafretnignirtSelbaenolC.gnal.avaj ecafretn");
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(strArray7);
    }

    @Test
    public void test40190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest80.test40190");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitByCharacterType("... AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA... AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA... AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA... AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA... AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA... AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA... AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA... AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA... AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA... AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA");
        java.lang.Class<?>[] wildcardClassArray2 = org.apache.commons.lang3.ClassUtils.toClass((java.lang.Object[]) strArray1);
        java.lang.Class<?>[] wildcardClassArray3 = org.apache.commons.lang3.ClassUtils.primitivesToWrappers(wildcardClassArray2);
        java.lang.String str5 = org.apache.commons.lang3.ClassUtils.getPackageName((java.lang.Object) wildcardClassArray2, "yLst");
        java.lang.String[] strArray9 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("...       ", "hi!", (int) (byte) 0);
        java.lang.String str10 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray9);
        java.lang.Class<?>[] wildcardClassArray11 = org.apache.commons.lang3.ClassUtils.toClass((java.lang.Object[]) strArray9);
        java.lang.Class<?> wildcardClass12 = null;
        java.lang.Class[] classArray14 = new java.lang.Class[1];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray15 = (java.lang.Class<?>[]) classArray14;
        wildcardClassArray15[0] = wildcardClass12;
        java.lang.Class<?>[] wildcardClassArray18 = org.apache.commons.lang3.ClassUtils.primitivesToWrappers(wildcardClassArray15);
        java.lang.Class<?> wildcardClass19 = null;
        java.lang.Class[] classArray21 = new java.lang.Class[1];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray22 = (java.lang.Class<?>[]) classArray21;
        wildcardClassArray22[0] = wildcardClass19;
        java.lang.Class<?>[] wildcardClassArray25 = org.apache.commons.lang3.ClassUtils.primitivesToWrappers(wildcardClassArray22);
        java.lang.String[] strArray27 = new java.lang.String[] { "                                   " };
        java.lang.String str28 = org.apache.commons.lang3.StringUtils.getCommonPrefix(strArray27);
        java.lang.Class<?>[] wildcardClassArray29 = org.apache.commons.lang3.ClassUtils.toClass((java.lang.Object[]) strArray27);
        java.lang.Class<?> wildcardClass30 = null;
        java.lang.Class[] classArray32 = new java.lang.Class[1];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray33 = (java.lang.Class<?>[]) classArray32;
        wildcardClassArray33[0] = wildcardClass30;
        java.lang.Class<?>[] wildcardClassArray36 = org.apache.commons.lang3.ClassUtils.primitivesToWrappers(wildcardClassArray33);
        boolean boolean37 = org.apache.commons.lang3.ClassUtils.isAssignable(wildcardClassArray29, wildcardClassArray33);
        boolean boolean39 = org.apache.commons.lang3.ClassUtils.isAssignable(wildcardClassArray22, wildcardClassArray33, true);
        boolean boolean41 = org.apache.commons.lang3.ClassUtils.isAssignable(wildcardClassArray18, wildcardClassArray33, true);
        java.lang.String str43 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) wildcardClassArray33, 'a');
        java.lang.String str45 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) wildcardClassArray33, "JAVAsTRIN");
        boolean boolean47 = org.apache.commons.lang3.ClassUtils.isAssignable(wildcardClassArray11, wildcardClassArray33, false);
        java.lang.Class<?>[] wildcardClassArray48 = org.apache.commons.lang3.ClassUtils.toClass((java.lang.Object[]) wildcardClassArray33);
        java.lang.String str49 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) wildcardClassArray48);
        boolean boolean50 = org.apache.commons.lang3.ClassUtils.isAssignable(wildcardClassArray2, wildcardClassArray48);
        java.lang.String str52 = org.apache.commons.lang3.ClassUtils.getPackageCanonicalName((java.lang.Object) wildcardClassArray2, "                       ....................................................................");
        java.lang.String str54 = org.apache.commons.lang3.ClassUtils.getShortCanonicalName((java.lang.Object) "                       ....................................................................", "aAAAAAAAAAAAAAAAAAA");
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertNotNull(wildcardClassArray2);
        org.junit.Assert.assertNotNull(wildcardClassArray3);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "java.lang" + "'", str5, "java.lang");
        org.junit.Assert.assertNotNull(strArray9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "...       " + "'", str10, "...       ");
        org.junit.Assert.assertNotNull(wildcardClassArray11);
        org.junit.Assert.assertNotNull(classArray14);
        org.junit.Assert.assertNotNull(wildcardClassArray15);
        org.junit.Assert.assertNotNull(wildcardClassArray18);
        org.junit.Assert.assertNotNull(classArray21);
        org.junit.Assert.assertNotNull(wildcardClassArray22);
        org.junit.Assert.assertNotNull(wildcardClassArray25);
        org.junit.Assert.assertNotNull(strArray27);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "                                   " + "'", str28, "                                   ");
        org.junit.Assert.assertNotNull(wildcardClassArray29);
        org.junit.Assert.assertNotNull(classArray32);
        org.junit.Assert.assertNotNull(wildcardClassArray33);
        org.junit.Assert.assertNotNull(wildcardClassArray36);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "" + "'", str43, "");
        org.junit.Assert.assertEquals("'" + str45 + "' != '" + "" + "'", str45, "");
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertNotNull(wildcardClassArray48);
        org.junit.Assert.assertEquals("'" + str49 + "' != '" + "" + "'", str49, "");
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertEquals("'" + str52 + "' != '" + "java.lang" + "'", str52, "java.lang");
        org.junit.Assert.assertEquals("'" + str54 + "' != '" + "String" + "'", str54, "String");
    }

    @Test
    public void test40191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest80.test40191");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsAny("NALAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA", "");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test40192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest80.test40192");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.rightPad("ARAHcRETCARAHcRETCARAHcRETCARAHcRETCARAHcRETCARAHcRETCARAHcRETCARAHcRETCARAHcRETCARAHcRETCARAHcRETCARAHcRETCARAHcRETCARAHcRETCARAHcRETCARAHcRETCARAHcRETCARAHcRETCARAHcRETCARAHcRETCARAHcRETCARAHcRETCARAHcRETCARAHcRETCARAHcRETCARAHcRETCARAHcRETCARAHcRETCARAHcRETCARAHcRETCARAHcRETCARAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA      ARAHcRETCARAHcRETCARAHcRETCARAHcRETCARAHcRETCARAHcRETCARAHcRETCARAHcRETCARAHcRETCARAHcRETCARAHcRETCARAHcRETCARAHcRETCARAHcRETCARAHcRETCARAHcRETCARAHcRETCARAHcRETCARAHcRETCARAHcRETCARAHcRETCARAHcRETCARAHcRETCARAHcRETCARAHcRETCARAHcRETCARAHcRETCARAHcRETCARAHcRETCARAHcRETCARAHcRETCARA", 938);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "ARAHcRETCARAHcRETCARAHcRETCARAHcRETCARAHcRETCARAHcRETCARAHcRETCARAHcRETCARAHcRETCARAHcRETCARAHcRETCARAHcRETCARAHcRETCARAHcRETCARAHcRETCARAHcRETCARAHcRETCARAHcRETCARAHcRETCARAHcRETCARAHcRETCARAHcRETCARAHcRETCARAHcRETCARAHcRETCARAHcRETCARAHcRETCARAHcRETCARAHcRETCARAHcRETCARAHcRETCARAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA      ARAHcRETCARAHcRETCARAHcRETCARAHcRETCARAHcRETCARAHcRETCARAHcRETCARAHcRETCARAHcRETCARAHcRETCARAHcRETCARAHcRETCARAHcRETCARAHcRETCARAHcRETCARAHcRETCARAHcRETCARAHcRETCARAHcRETCARAHcRETCARAHcRETCARAHcRETCARAHcRETCARAHcRETCARAHcRETCARAHcRETCARAHcRETCARAHcRETCARAHcRETCARAHcRETCARAHcRETCARA                                                                                                                                                                                                                                                                                       " + "'", str2, "ARAHcRETCARAHcRETCARAHcRETCARAHcRETCARAHcRETCARAHcRETCARAHcRETCARAHcRETCARAHcRETCARAHcRETCARAHcRETCARAHcRETCARAHcRETCARAHcRETCARAHcRETCARAHcRETCARAHcRETCARAHcRETCARAHcRETCARAHcRETCARAHcRETCARAHcRETCARAHcRETCARAHcRETCARAHcRETCARAHcRETCARAHcRETCARAHcRETCARAHcRETCARAHcRETCARAHcRETCARAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA      ARAHcRETCARAHcRETCARAHcRETCARAHcRETCARAHcRETCARAHcRETCARAHcRETCARAHcRETCARAHcRETCARAHcRETCARAHcRETCARAHcRETCARAHcRETCARAHcRETCARAHcRETCARAHcRETCARAHcRETCARAHcRETCARAHcRETCARAHcRETCARAHcRETCARAHcRETCARAHcRETCARAHcRETCARAHcRETCARAHcRETCARAHcRETCARAHcRETCARAHcRETCARAHcRETCARAHcRETCARA                                                                                                                                                                                                                                                                                       ");
    }

    @Test
    public void test40193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest80.test40193");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.chop("aAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA...AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA...AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA...AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA...AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA...AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA...AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA...AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA...AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA.....");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "aAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA...AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA...AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA...AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA...AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA...AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA...AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA...AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA...AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA...." + "'", str1, "aAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA...AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA...AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA...AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA...AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA...AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA...AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA...AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA...AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA....");
    }

    @Test
    public void test40194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest80.test40194");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA...VAULANGJAVAULANGJAVAULANGJAVAULANGJAVAULANGStringUtilsStringUtilsStringUt", "AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA", 358);
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void test40195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest80.test40195");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("hi!", "");
        java.lang.String str5 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray3, "");
        int int6 = org.apache.commons.lang3.StringUtils.lastIndexOfAny("Gnal", strArray3);
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray3, '$');
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
    }

    @Test
    public void test40196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest80.test40196");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNumericSpace((java.lang.CharSequence) "elbzilireS.oi.vj ecfretnivj..........vtcejbO.......vj.......elbenolC.gnl");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test40197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest80.test40197");
        java.lang.CharSequence charSequence2 = org.apache.commons.lang3.StringUtils.defaultIfBlank((java.lang.CharSequence) "                                                                                    .lan                                                                                     ", (java.lang.CharSequence) "...sAitUJAirtSsAitUJAirtSsAitUJAirtSsAitUJAirtSsAitUJAirtSsAitUJAirtSsAitUJAirtSsAitUJAirtSsAitUJAirtS");
        org.junit.Assert.assertEquals("'" + charSequence2 + "' != '" + "                                                                                    .lan                                                                                     " + "'", charSequence2, "                                                                                    .lan                                                                                     ");
    }

    @Test
    public void test40198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest80.test40198");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass1 = org.apache.commons.lang3.ClassUtils.getClass("L.Arr#yListgnaljava..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java.........");
            org.junit.Assert.fail("Expected exception of type java.lang.ClassNotFoundException; message: L/Arr#yListgnaljava//////////java//////////java//////////java//////////java//////////java//////////java//////////java//////////java//////////java//////////java//////////java//////////java//////////java//////////java//////////java//////////java//////////java//////////java//////////java//////////java//////////java//////////java//////////java//////////java//////////java//////////java//////////java//////////java//////////java//////////java//////////java//////////java//////////java//////////java/////////");
        } catch (java.lang.ClassNotFoundException e) {
            // Expected exception.
        }
    }

    @Test
    public void test40199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest80.test40199");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAllLowerCase((java.lang.CharSequence) "       AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test40200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest80.test40200");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isBlank((java.lang.CharSequence) "##########################################################################Byte###########################################################################");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test40201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest80.test40201");
        int int3 = org.apache.commons.lang3.StringUtils.indexOf("jAVA.L$ArrayListaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", 64, 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test40202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest80.test40202");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.defaultIfBlank("##########################java.lan", "javau");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "##########################java.lan" + "'", str2, "##########################java.lan");
    }

    @Test
    public void test40203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest80.test40203");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("...       ....       .java.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.lang...       ....       .java.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.lang...       ....       .java.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.lang...       ....       .java.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.lang...       ....       .java.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.lang...       ....       .", "                                             ...                                                    ");
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.stripAll(strArray2, "44444444444444444444444444444444444444444444444444444444444444444444444444       util");
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertNotNull(strArray4);
    }

    @Test
    public void test40204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest80.test40204");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.equalsIgnoreCase("             character             utilstri", "y..............................ObjectyList..............................O");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test40205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest80.test40205");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeStartIgnoreCase("", "JAVA.UTIL.");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test40206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest80.test40206");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("J#v#.l#ngj#v#.l#ngj#v#.l#ngj#v#.l#ngj#v#.l#ngj#v#.l#ngj#v#.l#ngj#v#.l#ngj#v#.l#ngj#v#.l#ngj#v#.l#ngj#v#.l#ngj#v#.l#ngj#v#.l#ngj#v#.l#ngj#v#.l#ngj#v#.l#ngj#v#.l#ngj#v#.l#ngj#v#.l#ngj#v#.l#ngj#v#.l#ngj#v#.l#ngj#v#.l#ngj#v#.l#ngj#v#.l#ngj#v#.l#ngj#v#.l#ngj#v#.l#ngj#v#.l#ngj#v#.l#ngj#v#.l#ngj#v#.l#ng", "Aaaaaaaaaaaa                                  ");
        java.lang.String[] strArray5 = org.apache.commons.lang3.StringUtils.split("BYTE");
        java.lang.String str6 = org.apache.commons.lang3.StringUtils.replaceEachRepeatedly("IrfCo$irfioSrii", strArray3, strArray5);
        java.lang.String str8 = org.apache.commons.lang3.ClassUtils.getShortClassName((java.lang.Object) str6, "interfcejv.lng.cloneble#interfcejv.io");
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "IrfCo$irfioSrii" + "'", str6, "IrfCo$irfioSrii");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "String" + "'", str8, "String");
    }

    @Test
    public void test40207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest80.test40207");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsAny("                    Integer                          ", "utilaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test40208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest80.test40208");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfDifference((java.lang.CharSequence) "4444444string.444444444444444string.444444444444444string.444444444444444string.444444444444444string.444444444444444string.444444444444444string.444444444444444string.444444444444444string.444444444444444string.444444444444444string.444444444444444string.444444444444444string.444444444444444string.444444444444444string.44444444", (java.lang.CharSequence) "4444444444444aaaaaaaaaajaval.agnaaaaaaaaaajaval.agnaaaaaaaaaajaval.agnaaaaaaaaaajaval.agnaaaaaaaaaajaval.agnaaaaaaaaaajaval.agnaaaaaaaaaajaval.agnaaaaaaaaaajaval.agnaaaaaaaaaajaval.agnaaaaaaaaaajaval.agnaaaaaaaaaajaval.agnaaaaaaaaaajaval.agnaaaaaaaaaajaval.agnaaaaaaaaaajaval.agnaaaaaaaaaajaval.agnaaaaaaaaaajaval.agnaaaaaaaaaajaval.agnaaaaaaaaaajaval.agnaaaaaaaaaajaval.agnaaaaaaaaaajaval.agnaaaaaaaaaajaval.agnaaaaaaaaaajaval.agnaaaaaaaaaajaval.agnaaaaaaaaaajaval.agnaaaaaaaaaajaval.agnaaaaaaaaaajaval.agnaaaaaaaaaajaval.agnaaaaaaaaaajaval.agnaaaaaaaaaajaval.agnaaaaaaaaaajaval.agnaaaaaaaaaajaval.agnaaaaaaaaaajaval.agnaaaaaaaaaajaval.agnaaaaaaaaaajaval.agnaaaaaaaaaajaval.agn");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 7 + "'", int2 == 7);
    }

    @Test
    public void test40209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest80.test40209");
        java.lang.CharSequence charSequence3 = null;
        char[] charArray14 = new char[] { ' ', ' ', '#', 'a', '4', 'a' };
        int int15 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "", charArray14);
        boolean boolean16 = org.apache.commons.lang3.StringUtils.containsAny("$", charArray14);
        int int17 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "", charArray14);
        boolean boolean18 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "...       AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA", charArray14);
        int int19 = org.apache.commons.lang3.StringUtils.indexOfAnyBut(charSequence3, charArray14);
        boolean boolean20 = org.apache.commons.lang3.StringUtils.containsAny("StringUtil", charArray14);
        boolean boolean21 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "                                                                                          ", charArray14);
        boolean boolean22 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "ArrayListAArrayListAArrayListAArrayListAArrayListAArrayListAArrayListAArrayListAArrayListAArrayListAArrayListAArrayListAArrayListAArrayListAArrayListAArrayListAArrayListAArrayListAArrayListAArrayListAArrayListAArrayListAArrayListAArrayListAArrayListAArrayListAArrayListAArrayListAArrayListAArrayListAArrayListAArrayListAArrayListAArrayListAArrayListAArrayList", charArray14);
        org.junit.Assert.assertNotNull(charArray14);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray14), "  #a4a");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray14), "  #a4a");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray14), "[ ,  , #, a, 4, a]");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
    }

    @Test
    public void test40210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest80.test40210");
        int int3 = org.apache.commons.lang3.StringUtils.indexOfIgnoreCase("                                                                                                                                                                                                                                                                                                                                                                       javal$agnjaval$agnjaval$agnjaval$agnjaval$agnjaval$agnjaval$agnjaval$agnjaval$agnjaval$agnjaval$agnjaval$agnjaval$agnjaval$agnjaval$agnjaval$agnjaval$agnjaval$agnjaval$agnjaval$agnjaval$agnjaval$agnjaval$agnjaval$agnjaval$agnjaval$agnjaval$agnjaval$agnjaval$agnjaval$agnjaval$agnjaval$agnjaval$agnjaval$agnjaval$agnjaval$agnjaval$agnjaval$agnjaval$agnjaval$agnjaval$agnjaval$agnjaval$agnjaval$agnjaval$agnjaval$agnjaval$agnjaval$agnjaval$agnjaval$agnjaval$agnjaval$agnjaval$agnjaval$agnjaval$agnjaval$agnjaval$agnjaval$agnjaval$agnjaval$agnjaval$agnjaval$agnjaval$agnjaval$agn", "aaaaaaaaaa                                                                                                                                                                                                                                                                                                                                                                                                                                JAVA.LANGAgnal.avajgnal..LANGgnal.avArrclass java.lang.ObjectyListAr...aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", 105);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test40211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest80.test40211");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.abbreviate("javaaaaaaaaaa.............................................................4a44                                                                                   ", 250);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "javaaaaaaaaaa.............................................................4a44                                                                                   " + "'", str2, "javaaaaaaaaaa.............................................................4a44                                                                                   ");
    }

    @Test
    public void test40212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest80.test40212");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBeforeLast("", "Javalaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaagn");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test40213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest80.test40213");
        int int3 = org.apache.commons.lang3.StringUtils.ordinalIndexOf("Jvstringnlrrylistrrylistrrylistvj...sAitUJAirt", "                                                             javal$agn                                                             ", 655);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test40214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest80.test40214");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByCharacterTypeCamelCase("AAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAA");
        boolean boolean3 = org.apache.commons.lang3.StringUtils.startsWithAny("", strArray2);
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.stripAll(strArray2);
        int int5 = org.apache.commons.lang3.StringUtils.indexOfDifference((java.lang.CharSequence[]) strArray4);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void test40215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest80.test40215");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("hi!", "");
        java.lang.String str5 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray3, "");
        java.lang.String str6 = org.apache.commons.lang3.StringUtils.concat((java.lang.Object[]) strArray3);
        boolean boolean7 = org.apache.commons.lang3.StringUtils.startsWithAny("Class[]", strArray3);
        java.lang.String[] strArray9 = org.apache.commons.lang3.StringUtils.stripAll(strArray3, "javastringnalarraylistarraylistarraylistavaj.gnalarraylistarraylistarrayli");
        java.lang.Class<?>[] wildcardClassArray10 = org.apache.commons.lang3.ClassUtils.toClass((java.lang.Object[]) strArray3);
        java.lang.String[] strArray11 = org.apache.commons.lang3.StringUtils.stripAll(strArray3);
        java.lang.String[] strArray13 = org.apache.commons.lang3.StringUtils.stripAll(strArray11, "rrayLis...VA.LANGAVAJ");
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(strArray9);
        org.junit.Assert.assertNotNull(wildcardClassArray10);
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertNotNull(strArray13);
    }

    @Test
    public void test40216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest80.test40216");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitByCharacterTypeCamelCase("                                                                                      ");
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test40217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest80.test40217");
        java.lang.ClassLoader classLoader0 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass3 = org.apache.commons.lang3.ClassUtils.getClass(classLoader0, "interface java.lang.Cloneable44444444444444444444444444444444444444444444444444interface java.io.Serializable", false);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassNotFoundException; message: interfacejava/lang/Cloneable44444444444444444444444444444444444444444444444444interfacejava/io/Serializable");
        } catch (java.lang.ClassNotFoundException e) {
            // Expected exception.
        }
    }

    @Test
    public void test40218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest80.test40218");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceChars("iNTERFjava..........java..........java...IZABLE", "vaj", "AVAJGNAL.AVAJGNAL.AVAJGNAL.AVAJGNAL.AVAJGNAL.AVAJGNAL.AVAJGNAL.AVAJGNAL.AVAJGNAL.AVAJ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "iNTERFAVAV..........AVAV..........AVAV...IZABLE" + "'", str3, "iNTERFAVAV..........AVAV..........AVAV...IZABLE");
    }

    @Test
    public void test40219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest80.test40219");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.left("................AA..................", 669);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "................AA.................." + "'", str2, "................AA..................");
    }

    @Test
    public void test40220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest80.test40220");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.leftPad("##RyLRsA##RyLRsA##RyLRsA##RyLRsA##        A##RyLRsA##RyLRsA##RyLRsA##RyLRsA##        A##RyLRsA##RyLRsA##RyLRsA##RyLRsA##        A##RyLRsA##RyLRsA##RyLRsA##RyLRsA##        A##RyLRsA##RyLRsA##RyLRsA##RyLRsA##        A##RyLRsA##RyLRsA##RyLRsA##RyLRsA##        A##RyLRsA##RyLRsA##RyLRsA##RyLRsA##        A##RyLRsA##RyLRsA##RyLRsA##RyLRsA##        A##RyLRsA##RyLRsA##RyLRsA##RyLRsA##        A##RyLRsA##RyLRsA##RyLRsA##RyLRsA##        A##RyLRsA##RyLRsA##RyLRsA##RyLRsA##        A##RyLRsA##RyLRsA##RyLRsA##RyLRsA##        A##RyLRsA##RyLRs                                    cafretni", 262, "                                    444444444444444444444444444...444444444444444444444444444...444444444444444444444444444...444444444444444444444444444...444444444444444444444444444...444444444444444444444444444...444444444444444444444444444...444444444444444444444444444...444444444444444444444444444...444444444444444444444444444...4444444][ssalCGNIRTGNIRTGNIRTGNIRTGNIRTGNIRTGNIRTGNIRTGNIRTGNIRTGNIRTGNIRTGNIRTGNIRTGNIRTGNIRTGNIRTGNIRTGNIRTGNIR                                     ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "##RyLRsA##RyLRsA##RyLRsA##RyLRsA##        A##RyLRsA##RyLRsA##RyLRsA##RyLRsA##        A##RyLRsA##RyLRsA##RyLRsA##RyLRsA##        A##RyLRsA##RyLRsA##RyLRsA##RyLRsA##        A##RyLRsA##RyLRsA##RyLRsA##RyLRsA##        A##RyLRsA##RyLRsA##RyLRsA##RyLRsA##        A##RyLRsA##RyLRsA##RyLRsA##RyLRsA##        A##RyLRsA##RyLRsA##RyLRsA##RyLRsA##        A##RyLRsA##RyLRsA##RyLRsA##RyLRsA##        A##RyLRsA##RyLRsA##RyLRsA##RyLRsA##        A##RyLRsA##RyLRsA##RyLRsA##RyLRsA##        A##RyLRsA##RyLRsA##RyLRsA##RyLRsA##        A##RyLRsA##RyLRs                                    cafretni" + "'", str3, "##RyLRsA##RyLRsA##RyLRsA##RyLRsA##        A##RyLRsA##RyLRsA##RyLRsA##RyLRsA##        A##RyLRsA##RyLRsA##RyLRsA##RyLRsA##        A##RyLRsA##RyLRsA##RyLRsA##RyLRsA##        A##RyLRsA##RyLRsA##RyLRsA##RyLRsA##        A##RyLRsA##RyLRsA##RyLRsA##RyLRsA##        A##RyLRsA##RyLRsA##RyLRsA##RyLRsA##        A##RyLRsA##RyLRsA##RyLRsA##RyLRsA##        A##RyLRsA##RyLRsA##RyLRsA##RyLRsA##        A##RyLRsA##RyLRsA##RyLRsA##RyLRsA##        A##RyLRsA##RyLRsA##RyLRsA##RyLRsA##        A##RyLRsA##RyLRsA##RyLRsA##RyLRsA##        A##RyLRsA##RyLRs                                    cafretni");
    }

    @Test
    public void test40221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest80.test40221");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAArrayListAArrayListAArrayListAArrayListAArrayListAArrayListAArrayListAArrayListAArrayListAArrayListAArrayListAArrayListAArrayListAArrayListAArrayListAArrayListAArrayListAArrayListAArrayListAArrayListAArrayListAArrayListAArrayListAArrayListAArrayListAArrayListAArrayListAArrayListAArrayListAArrayListAArrayListAArrayListAArrayListAArrayListAArrayListAArrayList");
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test40222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest80.test40222");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.abbreviate("..............................ObjectyList", 735);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "..............................ObjectyList" + "'", str2, "..............................ObjectyList");
    }

    @Test
    public void test40223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest80.test40223");
        java.lang.CharSequence charSequence2 = org.apache.commons.lang3.StringUtils.defaultIfEmpty((java.lang.CharSequence) "LLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLyAAA.", (java.lang.CharSequence) "arrclas...");
        org.junit.Assert.assertEquals("'" + charSequence2 + "' != '" + "LLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLyAAA." + "'", charSequence2, "LLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLyAAA.");
    }

    @Test
    public void test40224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest80.test40224");
        int int2 = org.apache.commons.lang3.StringUtils.countMatches("#############################################################################################################################################################################################################################################################################", "e..");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test40225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest80.test40225");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.capitalize((java.lang.CharSequence) "javaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa$       ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Javaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa$       " + "'", str1, "Javaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa$       ");
    }

    @Test
    public void test40226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest80.test40226");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.startsWithIgnoreCase("VAJ", "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                            LANGH!IH!IH!IH!IH!IH!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test40227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest80.test40227");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.swapCase("][sslC][sslCrChahacta][sslC][ssl][sslC][sslCrChahacta][sslC][ssl][sslC][sslCrChahacta][sslC][ssl][sslC][sslCrChahacta][sslC][ssl][sslC][sslCrChahacta][sslC][ssl][sslC][sslCrChahacta][sslC][ssl][sslC][sslCrChahacta][sslC][ssl][sslC][sslCrChahacta][sslC][ssl][sslC][sslCrChahacta][sslC][ssl][sslC][sslCrChahacta][sslC][ssl][sslC][sslCrChahacta][sslC][ssl][sslC][sslCrChahacta][sslC][ssl][sslC][sslCrChahacta][sslC][ssl][sslC][sslCGNALaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaagn                     ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "][SSLc][SSLcRcHAHACTA][SSLc][SSL][SSLc][SSLcRcHAHACTA][SSLc][SSL][SSLc][SSLcRcHAHACTA][SSLc][SSL][SSLc][SSLcRcHAHACTA][SSLc][SSL][SSLc][SSLcRcHAHACTA][SSLc][SSL][SSLc][SSLcRcHAHACTA][SSLc][SSL][SSLc][SSLcRcHAHACTA][SSLc][SSL][SSLc][SSLcRcHAHACTA][SSLc][SSL][SSLc][SSLcRcHAHACTA][SSLc][SSL][SSLc][SSLcRcHAHACTA][SSLc][SSL][SSLc][SSLcRcHAHACTA][SSLc][SSL][SSLc][SSLcRcHAHACTA][SSLc][SSL][SSLc][SSLcRcHAHACTA][SSLc][SSL][SSLc][SSLcgnalAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAGN                     " + "'", str1, "][SSLc][SSLcRcHAHACTA][SSLc][SSL][SSLc][SSLcRcHAHACTA][SSLc][SSL][SSLc][SSLcRcHAHACTA][SSLc][SSL][SSLc][SSLcRcHAHACTA][SSLc][SSL][SSLc][SSLcRcHAHACTA][SSLc][SSL][SSLc][SSLcRcHAHACTA][SSLc][SSL][SSLc][SSLcRcHAHACTA][SSLc][SSL][SSLc][SSLcRcHAHACTA][SSLc][SSL][SSLc][SSLcRcHAHACTA][SSLc][SSL][SSLc][SSLcRcHAHACTA][SSLc][SSL][SSLc][SSLcRcHAHACTA][SSLc][SSL][SSLc][SSLcRcHAHACTA][SSLc][SSL][SSLc][SSLcRcHAHACTA][SSLc][SSL][SSLc][SSLcgnalAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAGN                     ");
    }

    @Test
    public void test40228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest80.test40228");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBeforeLast("interface java.lang.cloneable.....", "YARRATSILYARRATSILYARRA");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "interface java.lang.cloneable....." + "'", str2, "interface java.lang.cloneable.....");
    }

    @Test
    public void test40229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest80.test40229");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("4444444444444444444444444444444444444444444444444444444ssssssssss4444444444444444444444444444444444444444", 'a');
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.stripAll(strArray2);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void test40230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest80.test40230");
        java.lang.CharSequence charSequence2 = null;
        char[] charArray14 = new char[] { ' ', ' ', '#', 'a', '4', 'a' };
        int int15 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "", charArray14);
        boolean boolean16 = org.apache.commons.lang3.StringUtils.containsAny("......", charArray14);
        int int17 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "Object", charArray14);
        boolean boolean18 = org.apache.commons.lang3.StringUtils.containsAny("Java.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.lang", charArray14);
        int int19 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "#####A##ayL#A#################################aaaaaaaaaa", charArray14);
        int int20 = org.apache.commons.lang3.StringUtils.indexOfAny(charSequence2, charArray14);
        boolean boolean21 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "Aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", charArray14);
        boolean boolean22 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "                                                                                                                                        ", charArray14);
        org.junit.Assert.assertNotNull(charArray14);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray14), "  #a4a");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray14), "  #a4a");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray14), "[ ,  , #, a, 4, a]");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
    }

    @Test
    public void test40231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest80.test40231");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.split("Arr... aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa... aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa... aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa... aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa... aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa... aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa... aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa... aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa... aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa... aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaylis");
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test40232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest80.test40232");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBeforeLast("AVAJgnl", "$#######$########");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "AVAJgnl" + "'", str2, "AVAJgnl");
    }

    @Test
    public void test40233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest80.test40233");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphanumeric((java.lang.CharSequence) "LALALALALALALALALALALALALALALALALALALALALALALALALALALALALA");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test40234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest80.test40234");
        java.lang.String str1 = org.apache.commons.lang3.ClassUtils.getPackageCanonicalName("vj.gnljv.lngvj.gnljv.lngvj.gnljv.lngvj.gnljv.lngvj.gnljv.lngvj.gnljv.lng");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "vj.gnljv.lngvj.gnljv.lngvj.gnljv.lngvj.gnljv.lngvj.gnljv.lngvj.gnljv" + "'", str1, "vj.gnljv.lngvj.gnljv.lngvj.gnljv.lngvj.gnljv.lngvj.gnljv.lngvj.gnljv");
    }

    @Test
    public void test40235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest80.test40235");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "NAL", "-1java.utilString[]-1java.utilString[]-1java.utilString[]-1java.utilString[]-1java.utilString[]-1java.utilString[]-1java.utilString[]-1java.utilString[]-1java.utilString[]-1java.utilString[]-1$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$gnal");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test40236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest80.test40236");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.endsWithIgnoreCase("gnaljava..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java.........", "                                                               Jvstringnlrrylistrrylistrrylistvj");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test40237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest80.test40237");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphaSpace((java.lang.CharSequence) "                                     RGNALUAVAJ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test40238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest80.test40238");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.abbreviate("ArrayListArrayListArrayList", 578);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "ArrayListArrayListArrayList" + "'", str2, "ArrayListArrayListArrayList");
    }

    @Test
    public void test40239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest80.test40239");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOfIgnoreCase("                                                                                                                                            #############################################", "AaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaIT.ITaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", 9);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test40240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest80.test40240");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.uncapitalize((java.lang.CharSequence) "                                                                                                                                                   ...");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "                                                                                                                                                   ..." + "'", str1, "                                                                                                                                                   ...");
    }

    @Test
    public void test40241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest80.test40241");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.split("       aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa...", "ArrayListArrayListArrayListavajagna", 67);
        java.lang.Class<?>[] wildcardClassArray4 = org.apache.commons.lang3.ClassUtils.toClass((java.lang.Object[]) strArray3);
        java.lang.Class<?>[] wildcardClassArray5 = org.apache.commons.lang3.ClassUtils.wrappersToPrimitives(wildcardClassArray4);
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) wildcardClassArray5, "");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str11 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) wildcardClassArray5, "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", 0, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertNotNull(wildcardClassArray4);
        org.junit.Assert.assertNotNull(wildcardClassArray5);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
    }

    @Test
    public void test40242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest80.test40242");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOf("", "4444444...");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test40243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest80.test40243");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.abbreviate("######################################################################################################################..aaaaaaaaaaaaaaaaaaaaaaaaaaaaa.....GNAL.AVAJGNAL..langGNAL.AVAJGNAL", 173);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "######################################################################################################################..aaaaaaaaaaaaaaaaaaaaaaaaaaaaa.....GNAL.AVAJGNAL..l..." + "'", str2, "######################################################################################################################..aaaaaaaaaaaaaaaaaaaaaaaaaaaaa.....GNAL.AVAJGNAL..l...");
    }

    @Test
    public void test40244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest80.test40244");
        int int2 = org.apache.commons.lang3.StringUtils.indexOf("JAVA.........................................................................................................................................................................................................................................................................................", "INTERFACE JAVA.LANG.cLONEABLE4INTERFACE JAVA.IO.sERIALIZABLE");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test40245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest80.test40245");
        int int1 = org.apache.commons.lang3.StringUtils.length((java.lang.CharSequence) "      ][GNIRTSLITU.AVAJ1");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 24 + "'", int1 == 24);
    }

    @Test
    public void test40246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest80.test40246");
        int int3 = org.apache.commons.lang3.StringUtils.lastOrdinalIndexOf("                                                                                                                                                                                                                                aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "a..AYl a##############", 57);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test40247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest80.test40247");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.chomp("saitujairtssaitujairtssaitujairtssaitujairtssaitujairtssaitujairtssaitujairtssaitujairtssaitujairtssaitujairts");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "saitujairtssaitujairtssaitujairtssaitujairtssaitujairtssaitujairtssaitujairtssaitujairtssaitujairtssaitujairts" + "'", str1, "saitujairtssaitujairtssaitujairtssaitujairtssaitujairtssaitujairtssaitujairtssaitujairtssaitujairtssaitujairts");
    }

    @Test
    public void test40248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest80.test40248");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.abbreviateMiddle("", "gnal.avajgnal..langgnal.avajgnallitullitullitu", 482);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test40249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest80.test40249");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBeforeLast("                                                                                                                                                                                                                                                                                 444444444444444444444444444...444444444444444444444444444...444444444444444444444444444...444444444444444444444444444...444444444444444444444444444...444444444444444444444444444...444444444444444444444444444...444444444444444444444444444...444444444444444444444444444...444444444444444444444444444...4444444][ssalCGNIRTGNIRTGNIRTGNIRTGNIRTGNIRTGNIRTGNIRTGNIRTGNIRTGNIRTGNIRTGNIRTGNIRTGNIRTGNIRTGNIRTGNIRTGNIRTGNIR4444444444444444444444444444444", "ARRAYLISTAARRAYLISTAARRAYLISTAARRAYLISTAARRAYLISTAARRAYLISTAARRAYLISTAARRAYLISTAARRAYLISTAARRAYLISTAARRAYLISTAARRAYLISTAARRAYLISTAARRAYLISTAARRAYLISTAARRAYLISTAARRAYLISTAARRAYLISTAARRAYLISTAARRAYLISTAARRAYLISTAARRAYLISTAARRAYLISTAARRAYLISTAARRAYLISTAARRAYLISTAARRAYLISTAARRAYLISTAARRAYLISTAARRAYLISTAARRAYLISTAARRAYLISTAARRAYLISTAARRAYLISTAARRAYLISTAARRAYLISTA");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                                                                                                                                                                                                                                                                 444444444444444444444444444...444444444444444444444444444...444444444444444444444444444...444444444444444444444444444...444444444444444444444444444...444444444444444444444444444...444444444444444444444444444...444444444444444444444444444...444444444444444444444444444...444444444444444444444444444...4444444][ssalCGNIRTGNIRTGNIRTGNIRTGNIRTGNIRTGNIRTGNIRTGNIRTGNIRTGNIRTGNIRTGNIRTGNIRTGNIRTGNIRTGNIRTGNIRTGNIRTGNIR4444444444444444444444444444444" + "'", str2, "                                                                                                                                                                                                                                                                                 444444444444444444444444444...444444444444444444444444444...444444444444444444444444444...444444444444444444444444444...444444444444444444444444444...444444444444444444444444444...444444444444444444444444444...444444444444444444444444444...444444444444444444444444444...444444444444444444444444444...4444444][ssalCGNIRTGNIRTGNIRTGNIRTGNIRTGNIRTGNIRTGNIRTGNIRTGNIRTGNIRTGNIRTGNIRTGNIRTGNIRTGNIRTGNIRTGNIRTGNIRTGNIR4444444444444444444444444444444");
    }

    @Test
    public void test40250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest80.test40250");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.defaultString("............................");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "............................" + "'", str1, "............................");
    }

    @Test
    public void test40251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest80.test40251");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeEnd("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaVAJ", "##########################################################################################################################################################################################################################################javaJ.Jlang##########################################################################################################################################################################################################################################");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaVAJ" + "'", str2, "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaVAJ");
    }

    @Test
    public void test40252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest80.test40252");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trimToEmpty("String.                             ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "String." + "'", str1, "String.");
    }

    @Test
    public void test40253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest80.test40253");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isWhitespace((java.lang.CharSequence) "...................................................................");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test40254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest80.test40254");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.center("VAJ", 717, "      AAAAAAAAAAAAAAAAAAA...");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "      AAAAAAAAAAAAAAAAAAA...      AAAAAAAAAAAAAAAAAAA...      AAAAAAAAAAAAAAAAAAA...      AAAAAAAAAAAAAAAAAAA...      AAAAAAAAAAAAAAAAAAA...      AAAAAAAAAAAAAAAAAAA...      AAAAAAAAAAAAAAAAAAA...      AAAAAAAAAAAAAAAAAAA...      AAAAAAAAAAAAAAAAAAA...      AAAAAAAAAAAAAAAAAAA...      AAAAAAAAAAAAAAAAAAA...      AAAAAAAAAAAAAAAAAAA...      AAAAAAAAAAAAAAAVAJ      AAAAAAAAAAAAAAAAAAA...      AAAAAAAAAAAAAAAAAAA...      AAAAAAAAAAAAAAAAAAA...      AAAAAAAAAAAAAAAAAAA...      AAAAAAAAAAAAAAAAAAA...      AAAAAAAAAAAAAAAAAAA...      AAAAAAAAAAAAAAAAAAA...      AAAAAAAAAAAAAAAAAAA...      AAAAAAAAAAAAAAAAAAA...      AAAAAAAAAAAAAAAAAAA...      AAAAAAAAAAAAAAAAAAA...      AAAAAAAAAAAAAAAAAAA...      AAAAAAAAAAAAAAA" + "'", str3, "      AAAAAAAAAAAAAAAAAAA...      AAAAAAAAAAAAAAAAAAA...      AAAAAAAAAAAAAAAAAAA...      AAAAAAAAAAAAAAAAAAA...      AAAAAAAAAAAAAAAAAAA...      AAAAAAAAAAAAAAAAAAA...      AAAAAAAAAAAAAAAAAAA...      AAAAAAAAAAAAAAAAAAA...      AAAAAAAAAAAAAAAAAAA...      AAAAAAAAAAAAAAAAAAA...      AAAAAAAAAAAAAAAAAAA...      AAAAAAAAAAAAAAAAAAA...      AAAAAAAAAAAAAAAVAJ      AAAAAAAAAAAAAAAAAAA...      AAAAAAAAAAAAAAAAAAA...      AAAAAAAAAAAAAAAAAAA...      AAAAAAAAAAAAAAAAAAA...      AAAAAAAAAAAAAAAAAAA...      AAAAAAAAAAAAAAAAAAA...      AAAAAAAAAAAAAAAAAAA...      AAAAAAAAAAAAAAAAAAA...      AAAAAAAAAAAAAAAAAAA...      AAAAAAAAAAAAAAAAAAA...      AAAAAAAAAAAAAAAAAAA...      AAAAAAAAAAAAAAAAAAA...      AAAAAAAAAAAAAAA");
    }

    @Test
    public void test40255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest80.test40255");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$J#v#.l#ngj#v#.l#ngj#v#.l#ngj#v#.l#ngj#v#.l#ngj#v#.l#ngj#v#.l#ngj#v#.l#ngj#v#.l#ngj#v#.l#ngj#v#.l#ngj#v#.l#ngj#v#.l#ngj#v#.l#ngj#v#.l#ngj#v#.l#ngj#v#.l#ngj#v#.l#ngj#v#.l#ngj#v#.l#ngj#v#.l#ngj#v#.l#ngj#v#.l#ngj#v#.l#ngj#v#.l#ngj#v#.l#ngj#v#.l#ngj#v#.l#ngj#v#.l#ngj#v#.l#ngj#v#.l#ngj#v#.l#ngj#v#.l#ng", "javastring..444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444");
        int int3 = org.apache.commons.lang3.StringUtils.indexOfDifference((java.lang.CharSequence[]) strArray2);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test40256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest80.test40256");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAllUpperCase((java.lang.CharSequence) "ceajvalngaClonebleaaaaaaajvaaaaaaaaaajvaaaaaaaaaajvaaaaaaaaaajvaaaaaaaaaajvaaaaaaaaaajvaaaaaaaaaajvaaaaaaaaaajvaaaaaaaaaajvaaaaaaaaaajvaaaaaaaaaajvaaaaaaaaaajvaaaaaaaaaajvaaaaaaaaaajvaaaaaaaaaajvaaaaaaaaaajvaaaaaaaaaajvaaaaaaaaaajvaaaaaaaaaajvaaaaaaaaaajvaaaaaaaaaajvaaaaaaaaaajvaaaaaaaaaajvaaaaaaaaaajvaaaaaaaaaajvaaaaaaaaaajvaaaaaaaaaajvaaaaaaaaaajvaaaaaaaaaajvaaaaaaaaaajvaaaaaaaaaajvaaaaaaaaaajvaaaaaaaaaajvaaaaaaaaaajvaaaaaaaaaajvinterfceajvaioaSerilizble");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test40257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest80.test40257");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfIgnoreCase("i                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                      ", "javallangj                                                                                                                                                                                                                                                                                                                           ");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test40258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest80.test40258");
        int int3 = org.apache.commons.lang3.StringUtils.indexOfIgnoreCase("", ".LANG.STRINGCLASS JAVA.LANG.STRINGCLASS JAVA.LANG.STRINGCLAS", 315);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test40259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest80.test40259");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBeforeLast("AVAJ.GNALAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA CHARACTERCHARACTERCHARACTERCHARACTERCHARACTERCHARACTERCHARACTERCHARACTERCHARACTERCHARACTERCHARACTERCHARACTERCHARACTERCHARACTERCHARACTERCHARACTERCHARACTERCHARACTERCHARACTERCHARACTERCHARACTERCHARACTERCHARACTERCHARACTERCHARACTERCHARACTERCHARACTERCHARACTERCHARACTERCHARACTERCHARACTERCHARACTERCHARACTERCHARACTERCHARACTERCHARACTERCHARACTERCHARACTERCHARACTERCHARACTERCHARACTERCHARACTERCHARACTERCHARACTERCHARACTERCHARACTERCHARACTERCHARACTERCHARACTERCHARACTERCHARACTERCHARACTERCHARACTERCHARACTERCHARACTERCHARACTERCHARACTERCHARACTERCHARACTERCHARACTERCHARACTERCHARACTERCHARA", "jvstringnlrrylistrrylistrrylistvj.gnlrrylistrrylistrryli");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "AVAJ.GNALAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA CHARACTERCHARACTERCHARACTERCHARACTERCHARACTERCHARACTERCHARACTERCHARACTERCHARACTERCHARACTERCHARACTERCHARACTERCHARACTERCHARACTERCHARACTERCHARACTERCHARACTERCHARACTERCHARACTERCHARACTERCHARACTERCHARACTERCHARACTERCHARACTERCHARACTERCHARACTERCHARACTERCHARACTERCHARACTERCHARACTERCHARACTERCHARACTERCHARACTERCHARACTERCHARACTERCHARACTERCHARACTERCHARACTERCHARACTERCHARACTERCHARACTERCHARACTERCHARACTERCHARACTERCHARACTERCHARACTERCHARACTERCHARACTERCHARACTERCHARACTERCHARACTERCHARACTERCHARACTERCHARACTERCHARACTERCHARACTERCHARACTERCHARACTERCHARACTERCHARACTERCHARACTERCHARACTERCHARA" + "'", str2, "AVAJ.GNALAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA CHARACTERCHARACTERCHARACTERCHARACTERCHARACTERCHARACTERCHARACTERCHARACTERCHARACTERCHARACTERCHARACTERCHARACTERCHARACTERCHARACTERCHARACTERCHARACTERCHARACTERCHARACTERCHARACTERCHARACTERCHARACTERCHARACTERCHARACTERCHARACTERCHARACTERCHARACTERCHARACTERCHARACTERCHARACTERCHARACTERCHARACTERCHARACTERCHARACTERCHARACTERCHARACTERCHARACTERCHARACTERCHARACTERCHARACTERCHARACTERCHARACTERCHARACTERCHARACTERCHARACTERCHARACTERCHARACTERCHARACTERCHARACTERCHARACTERCHARACTERCHARACTERCHARACTERCHARACTERCHARACTERCHARACTERCHARACTERCHARACTERCHARACTERCHARACTERCHARACTERCHARACTERCHARACTERCHARA");
    }

    @Test
    public void test40260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest80.test40260");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNotBlank((java.lang.CharSequence) "...tututututututjavaulangr..");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test40261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest80.test40261");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#lass java#lang#String", ".................................................................................................................................................................................................................................JAV", 94);
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.stripAll(strArray3);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str8 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray3, ' ', (int) (short) 0, 26);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertNotNull(strArray4);
    }

    @Test
    public void test40262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest80.test40262");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsIgnoreCase("lituLlituLlituLlituLlituLlituLlituLlituLlituLlituLlituLlituLlituLlituLlituLlituLlituLlituLlituLlituLlituLlituLlituLlituLlituLlituLlituLlituLlituLlituLlituLlituLlitu", "                                      J");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test40263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest80.test40263");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.leftPad(".o.e.GN.L.................................................................................................CharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterChara", 257);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + ".o.e.GN.L.................................................................................................CharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterChara" + "'", str2, ".o.e.GN.L.................................................................................................CharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterChara");
    }

    @Test
    public void test40264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest80.test40264");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trimToNull("gnal                                                                ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "gnal" + "'", str1, "gnal");
    }

    @Test
    public void test40265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest80.test40265");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeStart("tttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttobject44ttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttt", "IO                          ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "tttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttobject44ttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttt" + "'", str2, "tttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttobject44ttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttt");
    }

    @Test
    public void test40266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest80.test40266");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.leftPad("", 878, '$');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$" + "'", str3, "$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$");
    }

    @Test
    public void test40267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest80.test40267");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBetween("                                                                                                                                                                                                                                               ", "...       ");
        org.junit.Assert.assertNull(str2);
    }

    @Test
    public void test40268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest80.test40268");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("NTERF CEAJ V AL NGAcLONE BLEAAAAAAAJ V AAAAAAAAAAJ V AAAAAAAAAAJ V AAAAAAAAAAJ V AAAAAAAAAAJ V AAAAAAAAAAJ V AAAAAAAAAAJ V AAAAAAAAAAJ V AAAAAAAAAAJ V AAAAAAAAAAJ V AAAAAAAAAAJ V AAAAAAAAAAJ V AAAAAAAAAAJ V AAAAAAAAAAJ V AAAAAAAAAAJ V AAAAAAAAAAJ V AAAAAAAAAAJ V AAAAAAAAAAJ V AAAAAAAAAAJ V AAAAAAAAAAJ V AAAAAAAAAAJ V AAAAAAAAAAJ V AAAAAAAAAAJ V AAAAAAAAAAJ V AAAAAAAAAAJ V AAAAAAAAAAJ V AAAAAAAAAAJ V AAAAAAAAAAJ V AAAAAAAAAAJ V AAAAAAAAAAJ V AAAAAAAAAAJ V AAAAAAAAAAJ V AAAAAAAAAAJ V AAAAAAAAAAJ V AAAAAAAAAAJ V INTERF CEAJ V AIOAsERI LIZ BLE", "javaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test40269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest80.test40269");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.right("...Class[ Class[Class[...Class[ Class[Class[...Class[ Class[Class[...Class[ Class[Class[...Class[ Class[Class[...Class[ Class[Class[...Class[ Class[Class[...Class[ Class[Class[...Class[ Class[Class[...Class[ Class[", 124);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + ".Class[ Class[Class[...Class[ Class[Class[...Class[ Class[Class[...Class[ Class[Class[...Class[ Class[Class[...Class[ Class[" + "'", str2, ".Class[ Class[Class[...Class[ Class[Class[...Class[ Class[Class[...Class[ Class[Class[...Class[ Class[Class[...Class[ Class[");
    }

    @Test
    public void test40270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest80.test40270");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.capitalize((java.lang.CharSequence) ".........................................");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "........................................." + "'", str1, ".........................................");
    }

    @Test
    public void test40271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest80.test40271");
        int int1 = org.apache.commons.lang3.StringUtils.length((java.lang.CharSequence) "AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA... AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA... AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA... AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA... AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA... AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA... AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA... AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA... AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA... ...");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 940 + "'", int1 == 940);
    }

    @Test
    public void test40272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest80.test40272");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "#################################################################################################################################irfco$irfiosriiz", "U                                                                                                                                                                                                                                                                                                       JAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA...");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test40273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest80.test40273");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("hi!", "");
        java.lang.String[] strArray5 = org.apache.commons.lang3.StringUtils.stripAll(strArray3, "$");
        java.lang.Class<?>[] wildcardClassArray6 = org.apache.commons.lang3.ClassUtils.toClass((java.lang.Object[]) strArray3);
        java.lang.Class<?>[] wildcardClassArray7 = org.apache.commons.lang3.ClassUtils.toClass((java.lang.Object[]) wildcardClassArray6);
        java.lang.Class<?>[] wildcardClassArray8 = org.apache.commons.lang3.ClassUtils.wrappersToPrimitives(wildcardClassArray7);
        java.lang.Class<?> wildcardClass9 = null;
        java.lang.Class[] classArray11 = new java.lang.Class[1];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray12 = (java.lang.Class<?>[]) classArray11;
        wildcardClassArray12[0] = wildcardClass9;
        java.lang.Class<?>[] wildcardClassArray15 = org.apache.commons.lang3.ClassUtils.primitivesToWrappers(wildcardClassArray12);
        boolean boolean17 = org.apache.commons.lang3.ClassUtils.isAssignable(wildcardClassArray8, wildcardClassArray15, true);
        java.lang.String str18 = org.apache.commons.lang3.StringUtils.concatWith("java.langjava.langjava.langjava.langjava.langjava.la                                                ", (java.lang.Object[]) wildcardClassArray15);
        java.lang.Class<?>[] wildcardClassArray19 = org.apache.commons.lang3.ClassUtils.primitivesToWrappers(wildcardClassArray15);
        java.lang.String str21 = org.apache.commons.lang3.ClassUtils.getPackageName((java.lang.Object) wildcardClassArray19, "j ssalcrrAva.langGNAL..langjava.langAGNAL.AVAJ");
        java.lang.String str22 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) wildcardClassArray19);
        java.lang.Class<?>[] wildcardClassArray23 = org.apache.commons.lang3.ClassUtils.primitivesToWrappers(wildcardClassArray19);
        java.lang.String str25 = org.apache.commons.lang3.ClassUtils.getPackageCanonicalName((java.lang.Object) wildcardClassArray23, "AAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agn");
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertNotNull(wildcardClassArray6);
        org.junit.Assert.assertNotNull(wildcardClassArray7);
        org.junit.Assert.assertNotNull(wildcardClassArray8);
        org.junit.Assert.assertNotNull(classArray11);
        org.junit.Assert.assertNotNull(wildcardClassArray12);
        org.junit.Assert.assertNotNull(wildcardClassArray15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertNotNull(wildcardClassArray19);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "java.lang" + "'", str21, "java.lang");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertNotNull(wildcardClassArray23);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "java.lang" + "'", str25, "java.lang");
    }

    @Test
    public void test40274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest80.test40274");
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.overlay(" gnirtS", "String.                             ", 664, 60);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + " gnirtSString.                             " + "'", str4, " gnirtSString.                             ");
    }

    @Test
    public void test40275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest80.test40275");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphanumeric((java.lang.CharSequence) "se...               ...");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test40276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest80.test40276");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.stripEnd("                                                                                                                                                                                                                                                                                                                                                                                                                                                                                   ", "AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA#########################################################");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                   " + "'", str2, "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                   ");
    }

    @Test
    public void test40277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest80.test40277");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.stripStart("########################################################aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa#########################################################", ".......                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                      ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "########################################################aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa#########################################################" + "'", str2, "########################################################aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa#########################################################");
    }

    @Test
    public void test40278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest80.test40278");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.leftPad("         util          ", 51, "A..AYLA.44444444444444444444444444");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "A..AYLA.44444444444444444444         util          " + "'", str3, "A..AYLA.44444444444444444444         util          ");
    }

    @Test
    public void test40279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest80.test40279");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("", "aAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA       CharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterChara");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str6 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray2, ' ', 97, 477);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 97");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test40280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest80.test40280");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("AAAA                       JAVAULANGrrayList", "ArrayLis", 940);
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.getCommonPrefix(strArray3);
        java.lang.Class<?> wildcardClass5 = strArray3.getClass();
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test40281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest80.test40281");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.normalizeSpace("JAVA.........................................................................................................................................................................................................................................................................................");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "JAVA........................................................................................................................................................................................................................................................................................." + "'", str1, "JAVA.........................................................................................................................................................................................................................................................................................");
    }

    @Test
    public void test40282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest80.test40282");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.endsWithIgnoreCase("slitUgnirtSslitUgnirtSslitUgnirtSslitUgnirtSslitUgnirtSslitUgnirtSslitUgnirtSslitUgnirtSslitUgnirtSslitUgnirtS", ".LANG.STRINGCLASS JAVA.LANG.STRINGCLASS JAVA.LANG.STRINGCLAS");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test40283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest80.test40283");
        int int3 = org.apache.commons.lang3.StringUtils.ordinalIndexOf("GNAL.AVAJGNAL..langGNAL.AVAJGNALLituLlituLlitu444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444", "Javalituavajlituavajjavalituavajlituavajjavalituavajlituavajjavalituavajlituavajjavalituavajlituavajjavalituavajlituavajjavalituavajlituavajjavalituavajlituavajjavalituavajlituavajjavalituavajlituavajjavalituavajlituavajjavalituavajlituavajjavalituavajlituavajjavalituavajlituavajjavalituavajlituavajjavalituavajlituavajjavalituavajlituavajjavalituavajlituavajjavalituavajlituavajjavalituavajlituavajjavalituavajlituavajjavalituavajlituavajjavalituavajlituavajjavalituavajlituavajjavalituavajlituavajjavalituavajlituavajjavalituavajlituavajjavalituavajlituavajjavalituavajlituavajjavalituavajlituavajjavalituavajlituavajjavalituavajlituavajjavalituavajlituavaj", 401);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test40284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest80.test40284");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.leftPad("Sho$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$rrayList$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$t", 678, '4');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "4444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444Sho$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$rrayList$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$t" + "'", str3, "4444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444Sho$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$rrayList$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$t");
    }

    @Test
    public void test40285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest80.test40285");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.defaultIfBlank("ARJAVAARRARJAVAARRARJAVAARRARJAVAARRARJAVAARRARJAVAARRARJAVAARRARJAVAARRARJAVAARRARJAVAARRARJAVAARRARJAVAARRARJAVAARRARJAVAARRARJAVAARRARJAVAARRARJAVAARRARJAVAARRARJAVAARRARJAVAARRARJAVAARRARJAVAARRARJAVAARRARJAVAARRARJAVAARRARJAVAARRARJAVAARRARJAVAARRARJAVAARRARJAVAARRARJAVAARRARJAVAARRARJAVAARRARJAVAARRARJAVAARRARJAVAARRARJAVAARRARJAVAARRARJAVAARRARJAVAARRARJAVAARRARJAVAARRARJAVAARRARJAVAARRARJAVAARRARJAVAARRARJAVAARRARJAVAARRARJAVAARRARJAVAARRARJAVAARRARJAVAARRARJAla javalaS", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa...langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava..");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "ARJAVAARRARJAVAARRARJAVAARRARJAVAARRARJAVAARRARJAVAARRARJAVAARRARJAVAARRARJAVAARRARJAVAARRARJAVAARRARJAVAARRARJAVAARRARJAVAARRARJAVAARRARJAVAARRARJAVAARRARJAVAARRARJAVAARRARJAVAARRARJAVAARRARJAVAARRARJAVAARRARJAVAARRARJAVAARRARJAVAARRARJAVAARRARJAVAARRARJAVAARRARJAVAARRARJAVAARRARJAVAARRARJAVAARRARJAVAARRARJAVAARRARJAVAARRARJAVAARRARJAVAARRARJAVAARRARJAVAARRARJAVAARRARJAVAARRARJAVAARRARJAVAARRARJAVAARRARJAVAARRARJAVAARRARJAVAARRARJAVAARRARJAVAARRARJAVAARRARJAVAARRARJAla javalaS" + "'", str2, "ARJAVAARRARJAVAARRARJAVAARRARJAVAARRARJAVAARRARJAVAARRARJAVAARRARJAVAARRARJAVAARRARJAVAARRARJAVAARRARJAVAARRARJAVAARRARJAVAARRARJAVAARRARJAVAARRARJAVAARRARJAVAARRARJAVAARRARJAVAARRARJAVAARRARJAVAARRARJAVAARRARJAVAARRARJAVAARRARJAVAARRARJAVAARRARJAVAARRARJAVAARRARJAVAARRARJAVAARRARJAVAARRARJAVAARRARJAVAARRARJAVAARRARJAVAARRARJAVAARRARJAVAARRARJAVAARRARJAVAARRARJAVAARRARJAVAARRARJAVAARRARJAVAARRARJAVAARRARJAVAARRARJAVAARRARJAVAARRARJAVAARRARJAVAARRARJAVAARRARJAVAARRARJAla javalaS");
    }

    @Test
    public void test40286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest80.test40286");
        java.lang.String str2 = org.apache.commons.lang3.ClassUtils.getShortCanonicalName((java.lang.Object) "         Aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa          ", "TARRAYLITAVAJ.GNALARRAYLISTARRAYLISTARRAYLITAVAJ.GNALARRAYLISTARRAYLISTARRAYLITAVAJ.GNALARRAYLISTARRAYLISTARRAYLITAVAJ.GNALARRAYLISTARRAYLISTARRAYLITAVAJ.GNALARRAYLISTARRAYLISTARRAYLITAVAJ.GNALARRAYLISTARRAYLISTARRAYLITAVAJ.GNALARRAYLISTARRAYLISTARRAYLITAVAJ.GNALARRAYLISTARRAYLISTARRAYLITAVAJ.GNALARRAYLISTARRAYLISTARRAYLITAVAJ.GNALARRAYLISTARRAYLISTARRAYLITAVAJ.GNALARRAYLI                                 ...");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "String" + "'", str2, "String");
    }

    @Test
    public void test40287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest80.test40287");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphaSpace((java.lang.CharSequence) "             Character             utilStr");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test40288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest80.test40288");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.contains("gnal$.$avaj", 423);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test40289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest80.test40289");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOfIgnoreCase("interface#java.lang.cloneable4interface#java.io.serializableinterface#java.lang.cloneable4interface#java.io.serializableinterface#java.lang.cloneable4interface#jlituface#java.lang.cloneable4interface#java.io.serializableinterface#java.lang.cloneable4interface#java.io.serializableaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 325 + "'", int2 == 325);
    }

    @Test
    public void test40290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest80.test40290");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.abbreviate("Java.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjavaJava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjavaJava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjavaJava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjavaJava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjavaJava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjavaJava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjavaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", (int) ' ', 939);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Java.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjavaJava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjavaJava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjavaJava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjavaJava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjavaJava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjavaJava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjavaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa" + "'", str3, "Java.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjavaJava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjavaJava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjavaJava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjavaJava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjavaJava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjavaJava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjavaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
    }

    @Test
    public void test40291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest80.test40291");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.difference("se", "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                      LC.GNAL.AVAJ ECAFRETNIELBAZILAIRES.OI.AVAJ ECAFRETNI$ELBAENOLC.GNAL.AVAJ ECAFRETNIELBAZILAIRES.OI.AVAJ ECAFRETNI$ELBAENOLC.GNAL.AVAJ ECAFRETNI$GNAL.AVAJ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                      LC.GNAL.AVAJ ECAFRETNIELBAZILAIRES.OI.AVAJ ECAFRETNI$ELBAENOLC.GNAL.AVAJ ECAFRETNIELBAZILAIRES.OI.AVAJ ECAFRETNI$ELBAENOLC.GNAL.AVAJ ECAFRETNI$GNAL.AVAJ" + "'", str2, "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                      LC.GNAL.AVAJ ECAFRETNIELBAZILAIRES.OI.AVAJ ECAFRETNI$ELBAENOLC.GNAL.AVAJ ECAFRETNIELBAZILAIRES.OI.AVAJ ECAFRETNI$ELBAENOLC.GNAL.AVAJ ECAFRETNI$GNAL.AVAJ");
    }

    @Test
    public void test40292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest80.test40292");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.stripEnd("cloneable4i", "AtsiLytcejbO.gnal.avaj ssalcrrAtsiLytcejbO.gnal.avaj ssalcrrAva.langGNAL..langjava.langAGNAL.AVAJAtsiLytcejbO.gnal.avaj ssalcrrAtsiLytcejbO.gnal.avaj ssalcrrAva.langGNAL..langjava.langAGNAL.AVAJAtsiLytcejbO.gnal.avaj ssalcrrAtsiLytcejbO.gnal.avaj ssalcrrAva.langGNAL..langjava.langAGNAL.AVAJAtsiLytcejbO.gnal.avaj ssalcrrAtsiLytcejStringAtsiLytcejbO.gnal.avaj ssalcrrAtsiLytcejbO.gnal.avaj ssalcrrAva.langGNAL..langjava.langAGNAL.AVAJAtsiLytcejbO.gnaaaaaa...");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "cloneable4" + "'", str2, "cloneable4");
    }

    @Test
    public void test40293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest80.test40293");
        java.lang.Object[] objArray0 = null;
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.join(objArray0, ' ', 501, 764);
        org.junit.Assert.assertNull(str4);
    }

    @Test
    public void test40294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest80.test40294");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass1 = org.apache.commons.lang3.ClassUtils.getClass("vvayLasavvayLasavvayLasavvayLasavvayLasavvayLasavvayLasavvayLasavvayLasavvayLasavvayLasavvayLasavvayLasavvayLasavvayLasavvayLasavvayLasavvayLasavvayLasavvayLasa");
            org.junit.Assert.fail("Expected exception of type java.lang.ClassNotFoundException; message: vvayLasavvayLasavvayLasavvayLasavvayLasavvayLasavvayLasavvayLasavvayLasavvayLasavvayLasavvayLasavvayLasavvayLasavvayLasavvayLasavvayLasavvayLasavvayLasavvayLasa");
        } catch (java.lang.ClassNotFoundException e) {
            // Expected exception.
        }
    }

    @Test
    public void test40295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest80.test40295");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.difference("java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java.....AA...                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                           ", " LS  yL  ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + " LS  yL  " + "'", str2, " LS  yL  ");
    }

    @Test
    public void test40296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest80.test40296");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.split("                         ...                  ", "aaaaaaaaaaJAVAL.AGNaaaaaaaaaaJAVAL.AGNaaaaaaaaaaJAVAL.AGNaaaaaaaaaaJAVAL.AGNaaaaaaaaaaJAVAL.AGNaaaaaaaaaaJAVAL.AGNaaaaaaaaaaJAVAL.AGNaaaaaaaaaaJAVAL.AGNaaaaaaaaaaJAVAL.AGNaaaaaaaaaaJAVAL.AGNaaaaaaaaaaJAVAL.AGNaaaaaaaaaaJAVAL.AGNaaaaaaaaaaJAVAL.AGNaaaaaaaaaaJAVAL.AGNaaaaaaaaaaJAVAL.AGNaaaaaaaaaaJAVAL.AGNaaaaaaaaaaJAVAL.AGNaaaaaaaaaaJAVAL.AGNaaaaaaaaaaJAVAL.AGNaaaaaaaaaaJAVAL.AGNaaaaaaaaaaJAVAL.AGNaaaaaaaaaaJAVAL.AGNaaaaaaaaaaJAVAL.AGNaaaaaaaaaaJAVAL.AGNaaaaaaaaaaJAVAL.AGNaaaaaaaaaaJAVAL.AGNaaaaaaaaaaJAVAL.AGNaaaaaaaaaaJAVAL.AGNaaaaaaaaaaJAVAL.AGNaaaaaaaaaaJAVAL.AGNaaaaaaaaaaJAVAL.AGNaaaaaaaaaaJAVAL.AGNaaaaaaaaaaJAVAL.AGNaaaaaaaaaaJAVAL");
        int int3 = org.apache.commons.lang3.StringUtils.indexOfDifference((java.lang.CharSequence[]) strArray2);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 18 + "'", int3 == 18);
    }

    @Test
    public void test40297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest80.test40297");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.equalsIgnoreCase("AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA", "i4elbaenolCAgnalAavajiecafretniTRINGi4elbaenolCAgnalAavajiecaf");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test40298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest80.test40298");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceOnce("Object.lang.class java.AbstractCollectiongn lu v j .util.class java.AbstractListgn lu v j .util.class java", "                                                                                                                                                               AAAAAAAAAAAAAAAAAAAgnaluavajAAAAAAAAAAAAAAAAAAA                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                           ", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa...java..........java..");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Object.lang.class java.AbstractCollectiongn lu v j .util.class java.AbstractListgn lu v j .util.class java" + "'", str3, "Object.lang.class java.AbstractCollectiongn lu v j .util.class java.AbstractListgn lu v j .util.class java");
    }

    @Test
    public void test40299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest80.test40299");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.defaultIfBlank("JAVA.LITU.AVAJLITU.AVAJJAVA.LITU.AVAJLITU.AVAJJAVA.LITU.AVAJLITU.AVAJJAVA.LITU.AVAJLITU.AVAJJAVA.LITU.AVAJLITU.AVAJJAVA.LITU.AVAJLITU.AVAJJAVA.LITU.AVAJLITU.AVAJJAVA.LITU.AVAJLITU.AVAJJAVA.LITU.AVAJLITU.AVAJJAVA.LITU.AVAJLITU.AVAJJAVA.LITU.AVAJLITU.AVAJJAVA.LITU.AVAJLITU.AVAJJAVA.LITU.AVAJLITU.AVAJJAVA.LITU.AVAJLITU.AVAJJAVA.LITU.AVAJLITU.AVAJJAVA.LITU.AVAJLITU.AVAJJAVA.LITU.AVAJLITU.AVAJJAVA.LITU.AVAJLITU.AVAJJAVA.LITU.AVAJLITU.AVAJJAVA.LITU.AVAJLITU.AVAJJAVA.LITU.AVAJLITU.AVAJJAVA.LITU.AVAJLITU.AVAJJAVA.LITU.AVAJLITU.AVAJJAVA.LITU.AVAJLITU.AVAJJAVA.LITU.AVAJLITU.AVAJJAVA.LITU.AVAJLITU.AVAJJAVA.LITU.AVAJLITU.AVAJJAVA.LITU.AVAJLITU.AVAJJAVA.LITU.AVAJLITU.AVAJJAVA.LITU.AVAJLITU.AVAJJAVA.LITU.AVAJLITU.AVAJJAVA.LITU.AVAJLITU.AVAJJAVA.LITU.AVAJLITU.AVAJ", "ArrayLisArrayLisArrayLisArrayLisArra4444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444....");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "JAVA.LITU.AVAJLITU.AVAJJAVA.LITU.AVAJLITU.AVAJJAVA.LITU.AVAJLITU.AVAJJAVA.LITU.AVAJLITU.AVAJJAVA.LITU.AVAJLITU.AVAJJAVA.LITU.AVAJLITU.AVAJJAVA.LITU.AVAJLITU.AVAJJAVA.LITU.AVAJLITU.AVAJJAVA.LITU.AVAJLITU.AVAJJAVA.LITU.AVAJLITU.AVAJJAVA.LITU.AVAJLITU.AVAJJAVA.LITU.AVAJLITU.AVAJJAVA.LITU.AVAJLITU.AVAJJAVA.LITU.AVAJLITU.AVAJJAVA.LITU.AVAJLITU.AVAJJAVA.LITU.AVAJLITU.AVAJJAVA.LITU.AVAJLITU.AVAJJAVA.LITU.AVAJLITU.AVAJJAVA.LITU.AVAJLITU.AVAJJAVA.LITU.AVAJLITU.AVAJJAVA.LITU.AVAJLITU.AVAJJAVA.LITU.AVAJLITU.AVAJJAVA.LITU.AVAJLITU.AVAJJAVA.LITU.AVAJLITU.AVAJJAVA.LITU.AVAJLITU.AVAJJAVA.LITU.AVAJLITU.AVAJJAVA.LITU.AVAJLITU.AVAJJAVA.LITU.AVAJLITU.AVAJJAVA.LITU.AVAJLITU.AVAJJAVA.LITU.AVAJLITU.AVAJJAVA.LITU.AVAJLITU.AVAJJAVA.LITU.AVAJLITU.AVAJJAVA.LITU.AVAJLITU.AVAJ" + "'", str2, "JAVA.LITU.AVAJLITU.AVAJJAVA.LITU.AVAJLITU.AVAJJAVA.LITU.AVAJLITU.AVAJJAVA.LITU.AVAJLITU.AVAJJAVA.LITU.AVAJLITU.AVAJJAVA.LITU.AVAJLITU.AVAJJAVA.LITU.AVAJLITU.AVAJJAVA.LITU.AVAJLITU.AVAJJAVA.LITU.AVAJLITU.AVAJJAVA.LITU.AVAJLITU.AVAJJAVA.LITU.AVAJLITU.AVAJJAVA.LITU.AVAJLITU.AVAJJAVA.LITU.AVAJLITU.AVAJJAVA.LITU.AVAJLITU.AVAJJAVA.LITU.AVAJLITU.AVAJJAVA.LITU.AVAJLITU.AVAJJAVA.LITU.AVAJLITU.AVAJJAVA.LITU.AVAJLITU.AVAJJAVA.LITU.AVAJLITU.AVAJJAVA.LITU.AVAJLITU.AVAJJAVA.LITU.AVAJLITU.AVAJJAVA.LITU.AVAJLITU.AVAJJAVA.LITU.AVAJLITU.AVAJJAVA.LITU.AVAJLITU.AVAJJAVA.LITU.AVAJLITU.AVAJJAVA.LITU.AVAJLITU.AVAJJAVA.LITU.AVAJLITU.AVAJJAVA.LITU.AVAJLITU.AVAJJAVA.LITU.AVAJLITU.AVAJJAVA.LITU.AVAJLITU.AVAJJAVA.LITU.AVAJLITU.AVAJJAVA.LITU.AVAJLITU.AVAJJAVA.LITU.AVAJLITU.AVAJ");
    }

    @Test
    public void test40300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest80.test40300");
        char[] charArray1 = null;
        int int2 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$                                            #$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$", charArray1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test40301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest80.test40301");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("##########################################################################################################################################################################################################################################javaJ.Jlang##########################################################################################################################################################################################################################################", "                                                                                                                                                                                                                                                                                                                                                                                                                                    aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa                                                                                                                                                                                                                                                                                                                                                                                                                                    ", 303);
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void test40302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest80.test40302");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeStart("sAitUJAirtSsAitUJAirtSsAitUJAi", "$..........................................................................................................................................................................................................................................................................................................................");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "sAitUJAirtSsAitUJAirtSsAitUJAi" + "'", str2, "sAitUJAirtSsAitUJAirtSsAitUJAi");
    }

    @Test
    public void test40303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest80.test40303");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.equalsIgnoreCase("", "...$$$$$$$$$$$$$$$..");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test40304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest80.test40304");
        java.lang.String[] strArray6 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("...", "                                   ", (int) 'a');
        java.lang.String[] strArray7 = org.apache.commons.lang3.StringUtils.stripAll(strArray6);
        int int8 = org.apache.commons.lang3.StringUtils.lastIndexOfAny("                                                                                                    ", strArray6);
        java.lang.String[] strArray12 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("-1java.utilString[]    ", "avaj", 89);
        java.lang.String str13 = org.apache.commons.lang3.StringUtils.replaceEach("litulitulitulitulitul####litulitulitulitulitul", strArray6, strArray12);
        int int14 = org.apache.commons.lang3.StringUtils.lastIndexOfAny("RChahacta", strArray12);
        java.lang.String[] strArray16 = org.apache.commons.lang3.StringUtils.stripAll(strArray12, "");
        java.lang.Class<?>[] wildcardClassArray17 = org.apache.commons.lang3.ClassUtils.toClass((java.lang.Object[]) strArray12);
        java.lang.String str18 = org.apache.commons.lang3.StringUtils.getCommonPrefix(strArray12);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNotNull(strArray12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "litulitulitulitulitul####litulitulitulitulitul" + "'", str13, "litulitulitulitulitul####litulitulitulitulitul");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertNotNull(strArray16);
        org.junit.Assert.assertNotNull(wildcardClassArray17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "-1java.utilString[]    " + "'", str18, "-1java.utilString[]    ");
    }

    @Test
    public void test40305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest80.test40305");
        java.lang.String str1 = org.apache.commons.lang3.ClassUtils.getShortClassName("arraylisarraylisarraylisarraylisarra....................................................................................................");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
    }

    @Test
    public void test40306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest80.test40306");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeStartIgnoreCase("aa    aaa", "-1.v.v.uS.rivaizvaa.");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "aa    aaa" + "'", str2, "aa    aaa");
    }

    @Test
    public void test40307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest80.test40307");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOf("444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444INTERFACE JAVA.LANG.cLONEABLEsTRINGINTERFACE JAVA.IO.sERIALIZABLE444444444444444444444444444444444444444444444444444444444444444444444444444444444litu.avajlitu", 348);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test40308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest80.test40308");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsAny("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaVAJ", "          AA                                                                        ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test40309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest80.test40309");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.stripStart("                                                ", ".javainterface java.io.Serializable                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                             ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test40310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest80.test40310");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.center("AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA...AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAinterfacejava.lang.Cloneablejv.........                                                                    ...nAAAAAAAAAAjaval.agnAAAAAAAAAA...                                                                    rfcejv.iointerfacejava.io.SerializableAAAAAAAAAAAAAAAAAAAAAAAAAAA...AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA...AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA......", 91, '#');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA...AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAinterfacejava.lang.Cloneablejv.........                                                                    ...nAAAAAAAAAAjaval.agnAAAAAAAAAA...                                                                    rfcejv.iointerfacejava.io.SerializableAAAAAAAAAAAAAAAAAAAAAAAAAAA...AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA...AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA......" + "'", str3, "AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA...AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAinterfacejava.lang.Cloneablejv.........                                                                    ...nAAAAAAAAAAjaval.agnAAAAAAAAAA...                                                                    rfcejv.iointerfacejava.io.SerializableAAAAAAAAAAAAAAAAAAAAAAAAAAA...AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA...AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA......");
    }

    @Test
    public void test40311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest80.test40311");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.upperCase("aaaaaaaaaaJAVAL.AGNaaaaaaaaaaJAVAL.AGNaaaaaaaaaaJAVAL.AGNaaaaaaaaaaJAVAL.AGNaaaaaaaaaaJ                                                                                                                                      ][GNIRTSLITU.AVAJ1AL.AGNaaaaaaaaaaJAVAL.AGNaaaaaaaaaaJAVAL.AGNaaaaaaaaaaJAVAL.AGNaaaaaaaaaaJAVAL.AGNaaaaaaaaaaJAVAL.AGNaaaaaaaaaaJAVAL.AGNaaaaaaaaaaJAVAL");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "AAAAAAAAAAJAVAL.AGNAAAAAAAAAAJAVAL.AGNAAAAAAAAAAJAVAL.AGNAAAAAAAAAAJAVAL.AGNAAAAAAAAAAJ                                                                                                                                      ][GNIRTSLITU.AVAJ1AL.AGNAAAAAAAAAAJAVAL.AGNAAAAAAAAAAJAVAL.AGNAAAAAAAAAAJAVAL.AGNAAAAAAAAAAJAVAL.AGNAAAAAAAAAAJAVAL.AGNAAAAAAAAAAJAVAL.AGNAAAAAAAAAAJAVAL" + "'", str1, "AAAAAAAAAAJAVAL.AGNAAAAAAAAAAJAVAL.AGNAAAAAAAAAAJAVAL.AGNAAAAAAAAAAJAVAL.AGNAAAAAAAAAAJ                                                                                                                                      ][GNIRTSLITU.AVAJ1AL.AGNAAAAAAAAAAJAVAL.AGNAAAAAAAAAAJAVAL.AGNAAAAAAAAAAJAVAL.AGNAAAAAAAAAAJAVAL.AGNAAAAAAAAAAJAVAL.AGNAAAAAAAAAAJAVAL.AGNAAAAAAAAAAJAVAL");
    }

    @Test
    public void test40312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest80.test40312");
        int int2 = org.apache.commons.lang3.StringUtils.countMatches("         INTEGER              ", "interfacegaga.lang.CloneableAAAAAAAAAAgagal.agnAAAAAAAAAAgagal.agnAAAAAAAAAAgagal.agnAAAAAAAAAAgagal.agnAAAAAAAAAAgagal.agnAAAAAAAAAAgagal.agnAAAAAAAAAAgagal.agnAAAAAAAAAAgagal.agnAAAAAAAAAAgagal.agnAAAAAAAAAAgagal.agnAAAAAAAAAAgagal.agnAAAAAAAAAAgagal.agnAAAAAAAAAAgagal.agnAAAAAAAAAAgagal.agnAAAAAAAAAAgagal.agnAAAAAAAAAAgagal.agnAAAAAAAAAAgagal.agnAAAAAAAAAAgagal.agnAAAAAAAAAAgagal.agnAAAAAAAAAAgagal.agnAAAAAAAAAAgagal.agnAAAAAAAAAAgagal.agnAAAAAAAAAAgagal.agnAAAAAAAAAAgagal.agnAAAAAAAAAAgagal.agnAAAAAAAAAAgagal.agnAAAAAAAAAAgagal.agnAAAAAAAAAAgagal.agnAAAAAAAAAAgagal.agnAAAAAAAAAAgagal.agnAAAAAAAAAAgagal.agnAAAAAAAAAAgagal.agnAAAAAAAAAAgagal.agnAAAAAAAAAAgagal.agnAAAAAAAAAAgagal.agnAAAAAAAAAAringinterfacegaga.io");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test40313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest80.test40313");
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
        java.lang.String[] strArray40 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("hi!", "");
        java.lang.String[] strArray42 = org.apache.commons.lang3.StringUtils.stripAll(strArray40, "$");
        java.lang.Class<?>[] wildcardClassArray43 = org.apache.commons.lang3.ClassUtils.toClass((java.lang.Object[]) strArray40);
        java.lang.Class<?>[] wildcardClassArray44 = org.apache.commons.lang3.ClassUtils.toClass((java.lang.Object[]) wildcardClassArray43);
        java.lang.String str48 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) wildcardClassArray44, '#', (int) (byte) -1, (-1));
        java.lang.Class<?> wildcardClass49 = null;
        java.lang.Class[] classArray51 = new java.lang.Class[1];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray52 = (java.lang.Class<?>[]) classArray51;
        wildcardClassArray52[0] = wildcardClass49;
        java.lang.Class<?>[] wildcardClassArray55 = org.apache.commons.lang3.ClassUtils.primitivesToWrappers(wildcardClassArray52);
        java.lang.Class<?>[] wildcardClassArray56 = org.apache.commons.lang3.ClassUtils.primitivesToWrappers(wildcardClassArray52);
        boolean boolean57 = org.apache.commons.lang3.ClassUtils.isAssignable(wildcardClassArray44, wildcardClassArray56);
        java.lang.String str59 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) wildcardClassArray56, "                                  ");
        java.lang.String[] strArray62 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("class java.lang.String", "                                   ");
        java.lang.String[] strArray63 = org.apache.commons.lang3.StringUtils.stripAll(strArray62);
        java.lang.Class<?>[] wildcardClassArray64 = org.apache.commons.lang3.ClassUtils.toClass((java.lang.Object[]) strArray63);
        java.lang.Class<?>[] wildcardClassArray65 = org.apache.commons.lang3.ClassUtils.primitivesToWrappers(wildcardClassArray64);
        boolean boolean66 = org.apache.commons.lang3.ClassUtils.isAssignable(wildcardClassArray56, wildcardClassArray64);
        java.lang.Class<?>[] wildcardClassArray67 = org.apache.commons.lang3.ClassUtils.wrappersToPrimitives(wildcardClassArray56);
        boolean boolean68 = org.apache.commons.lang3.ClassUtils.isAssignable(wildcardClassArray3, wildcardClassArray56);
        java.lang.Class<?>[] wildcardClassArray69 = org.apache.commons.lang3.ClassUtils.wrappersToPrimitives(wildcardClassArray56);
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
        org.junit.Assert.assertNotNull(strArray40);
        org.junit.Assert.assertNotNull(strArray42);
        org.junit.Assert.assertNotNull(wildcardClassArray43);
        org.junit.Assert.assertNotNull(wildcardClassArray44);
        org.junit.Assert.assertEquals("'" + str48 + "' != '" + "" + "'", str48, "");
        org.junit.Assert.assertNotNull(classArray51);
        org.junit.Assert.assertNotNull(wildcardClassArray52);
        org.junit.Assert.assertNotNull(wildcardClassArray55);
        org.junit.Assert.assertNotNull(wildcardClassArray56);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
        org.junit.Assert.assertEquals("'" + str59 + "' != '" + "" + "'", str59, "");
        org.junit.Assert.assertNotNull(strArray62);
        org.junit.Assert.assertNotNull(strArray63);
        org.junit.Assert.assertNotNull(wildcardClassArray64);
        org.junit.Assert.assertNotNull(wildcardClassArray65);
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + true + "'", boolean66 == true);
        org.junit.Assert.assertNotNull(wildcardClassArray67);
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + false + "'", boolean68 == false);
        org.junit.Assert.assertNotNull(wildcardClassArray69);
    }

    @Test
    public void test40314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest80.test40314");
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
        java.lang.Class<?>[] wildcardClassArray30 = org.apache.commons.lang3.ClassUtils.toClass((java.lang.Object[]) wildcardClassArray21);
        java.lang.String str32 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) wildcardClassArray21, '$');
        java.lang.String str34 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) wildcardClassArray21, '.');
        java.lang.Class<?>[] wildcardClassArray35 = org.apache.commons.lang3.ClassUtils.primitivesToWrappers(wildcardClassArray21);
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
        org.junit.Assert.assertNotNull(wildcardClassArray30);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "" + "'", str32, "");
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "" + "'", str34, "");
        org.junit.Assert.assertNotNull(wildcardClassArray35);
    }

    @Test
    public void test40315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest80.test40315");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeStartIgnoreCase("gnal.avaj ", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "gnal.avaj " + "'", str2, "gnal.avaj ");
    }

    @Test
    public void test40316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest80.test40316");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlpha((java.lang.CharSequence) "h!ih!ih!ih!ih!ih!va.langavaj.gnaljava.langavaj.gnaljava.langavaj.gnaljava.langavaj.gnaljava.langavaj.gnaljava.langh!ih!ih!ih!ih!ih!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test40317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest80.test40317");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.repeat("", 15);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test40318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest80.test40318");
        java.lang.String str2 = org.apache.commons.lang3.ClassUtils.getPackageName((java.lang.Object) "class java.lang.String$class java.lang.String$class java.lang.String$class java.lang.String$class java.lang.String$class java.lang.String$class java.lang.String$class java.lang.String$class java.lang.String$class java.lang.String$class java.lang.String$class java.lang.String$class java.lang.String$class java.lang.String$class java.lang.String$class java.lang.String$class java.lang.String$class java.lang.String$class java.lang.String$class java.lang.String$class java.lang.String$class java.lang.String$class java.lang.String$class java.lang.String$class java.lang.String$class java.lang.String$class java.lang.String$class java.lang.String$class java.lang.String$class java.lang.String", "ng");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "java.lang" + "'", str2, "java.lang");
    }

    @Test
    public void test40319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest80.test40319");
        java.lang.String[] strArray1 = null;
        boolean boolean2 = org.apache.commons.lang3.StringUtils.endsWithAny("      ][GNIRTSLITU.AVAJ1", strArray1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test40320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest80.test40320");
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.overlay("", "aaaaaaaaaajaval.agnaaaaaaaaaajaval.agnaaaaaaaaaajaval.agnaaaaaaaaaajaval.agnaaaaaaaaaajaval.agnaaaaaaaaaajaval.agnaaaaaaaaaajaval.agnaaaaaaaaaajaval.agnaaaaaaaaaajaval.agnaaaaaaaaaajaval.agnaaaaaaaaaajaval.agnaaaaaaaaaajaval.agnaaaaaaaaaaja                                              aaaaaaajaval.agnaaaaaaaaaajaval.agnaaaaaaaaaajaval.agnaaaaaaaaaajaval.agnaaaaaaaaaajaval.agnaaaaaaaaaajaval.agnaaaaaaaaaajaval.agnaaaaaaaaaajaval.agnaaaaaaaaaajaval.agnaaaaaaaaaajaval.agnaaaaaaaaaajaval.agnaaaaaaaaaajaval.agnaaaaaaaaaarin", 535, 720);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "aaaaaaaaaajaval.agnaaaaaaaaaajaval.agnaaaaaaaaaajaval.agnaaaaaaaaaajaval.agnaaaaaaaaaajaval.agnaaaaaaaaaajaval.agnaaaaaaaaaajaval.agnaaaaaaaaaajaval.agnaaaaaaaaaajaval.agnaaaaaaaaaajaval.agnaaaaaaaaaajaval.agnaaaaaaaaaajaval.agnaaaaaaaaaaja                                              aaaaaaajaval.agnaaaaaaaaaajaval.agnaaaaaaaaaajaval.agnaaaaaaaaaajaval.agnaaaaaaaaaajaval.agnaaaaaaaaaajaval.agnaaaaaaaaaajaval.agnaaaaaaaaaajaval.agnaaaaaaaaaajaval.agnaaaaaaaaaajaval.agnaaaaaaaaaajaval.agnaaaaaaaaaajaval.agnaaaaaaaaaarin" + "'", str4, "aaaaaaaaaajaval.agnaaaaaaaaaajaval.agnaaaaaaaaaajaval.agnaaaaaaaaaajaval.agnaaaaaaaaaajaval.agnaaaaaaaaaajaval.agnaaaaaaaaaajaval.agnaaaaaaaaaajaval.agnaaaaaaaaaajaval.agnaaaaaaaaaajaval.agnaaaaaaaaaajaval.agnaaaaaaaaaajaval.agnaaaaaaaaaaja                                              aaaaaaajaval.agnaaaaaaaaaajaval.agnaaaaaaaaaajaval.agnaaaaaaaaaajaval.agnaaaaaaaaaajaval.agnaaaaaaaaaajaval.agnaaaaaaaaaajaval.agnaaaaaaaaaajaval.agnaaaaaaaaaajaval.agnaaaaaaaaaajaval.agnaaaaaaaaaajaval.agnaaaaaaaaaajaval.agnaaaaaaaaaarin");
    }

    @Test
    public void test40321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest80.test40321");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphanumeric((java.lang.CharSequence) "iLyarrAtsiLyarrAtsiLyarrAlang.javatsiLyarrAtsiLyarrAtsiAAAAAAAAAAngag");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test40322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest80.test40322");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceChars("                                       -1javaJAVATSILYARRATSILYARRATSILYARRA", "Array", "interfacegaga.lang.CloneableAAAAAAAAAAgagal.agnAAAAAAAAAAgagal.agnAAAAAAAAAAgagal.agnAAAAAAAAAAgagal.agnAAAAAAAAAAgagal.agnAAAAAAAAAAgagal.agnAAAAAAAAAAgagal.agnAAAAAAAAAAgagal.agnAAAAAAAAAAgagal.agnAAAAAAAAAAgagal.agnAAAAAAAAAAgagal.agnAAAAAAAAAAgagal.agnAAAAAAAAAAgagal.agnAAAAAAAAAAgagal.agnAAAAAAAAAAgagal.agnAAAAAAAAAAgagal.agnAAAAAAAAAAgagal.agnAAAAAAAAAAgagal.agnAAAAAAAAAAgagal.agnAAAAAAAAAAgagal.agnAAAAAAAAAAgagal.agnAAAAAAAAAAgagal.agnAAAAAAAAAAgagal.agnAAAAAAAAAAgagal.agnAAAAAAAAAAgagal.agnAAAAAAAAAAgagal.agnAAAAAAAAAAgagal.agnAAAAAAAAAAgagal.agnAAAAAAAAAAgagal.agnAAAAAAAAAAgagal.agnAAAAAAAAAAgagal.agnAAAAAAAAAAgagal.agnAAAAAAAAAAgagal.agnAAAAAAAAAAgagal.agnAAAAAAAAAAgagal.agnAAAAAAAAAAringinterfacegaga.io.Serializable");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "                                       -1jeveJiViTSILYiRRiTSILYiRRiTSILYiRRi" + "'", str3, "                                       -1jeveJiViTSILYiRRiTSILYiRRiTSILYiRRi");
    }

    @Test
    public void test40323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest80.test40323");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isEmpty((java.lang.CharSequence) "########################################################################");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test40324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest80.test40324");
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.replace("AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA       CharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterChara", "CLASSjava.langAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAulang", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa                                            .aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", 109);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA       CharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterChara" + "'", str4, "AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA       CharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterChara");
    }

    @Test
    public void test40325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest80.test40325");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOfIgnoreCase("ArryLis", " AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA", 655);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test40326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest80.test40326");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "..AAAA                       JAVAULANGrrayListyLA.", "java.lang.Cloneable4interface java.io.Serializa                                            java.lang.Cloneable4interface java.io.Serializa                                            java.lang.Cloneable4interface java.io.Serializa                                            java.lang.Cloneable4interface java.io.Serializa                                            java.lang.Cloneable4interface java.io.Serializa                                            java.lang.Cloneable4interface java.io.Serializa                                            java.lang.Cloneable4interface java.io.Serial               ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test40327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest80.test40327");
        java.lang.ClassLoader classLoader0 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass2 = org.apache.commons.lang3.ClassUtils.getClass(classLoader0, "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaagn                                            ");
            org.junit.Assert.fail("Expected exception of type java.lang.ClassNotFoundException; message: aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaagn");
        } catch (java.lang.ClassNotFoundException e) {
            // Expected exception.
        }
    }

    @Test
    public void test40328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest80.test40328");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.strip("                                                                                                                                                                                                                                                                                                                                                          javal#.#agn       aaaaaaaaaaaaaaaaaaaaaaaaa                                                                                                                                                                                                                                                                                                                                                          ", "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                                                                                                                                                                                                                                                                                                                                          javal#.#agn       aaaaaaaaaaaaaaaaaaaaaaaaa                                                                                                                                                                                                                                                                                                                                                          " + "'", str2, "                                                                                                                                                                                                                                                                                                                                                          javal#.#agn       aaaaaaaaaaaaaaaaaaaaaaaaa                                                                                                                                                                                                                                                                                                                                                          ");
    }

    @Test
    public void test40329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest80.test40329");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.capitalize((java.lang.CharSequence) "...haracterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacter...");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "...haracterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacter..." + "'", str1, "...haracterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacter...");
    }

    @Test
    public void test40330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest80.test40330");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("Java.litu.avajlitu.avajjava.litu.avajlitu.avajjava.litu.avajlitu.avajjava.litu.avajlitu.avajjava.litu.avajlitu.avajjava.litu.avajlitu.avajjava.litu.avajlitu.avajjava.litu.avajlitu.avajjava.litu.avajlitu.avajjava.litu.avajlitu.avajjava.litu.avajlitu.avajjava.litu.avajlitu.avajjava.litu.avajlitu.avajjava.litu.avajlitu.avajjava.litu.avajlitu.avajjava.litu.avajlitu.avajjava.litu.avajlitu.avajjava.litu.avajlitu.avajjava.litu.avajlitu.avajjava.litu.avajlitu.avajjava.litu.avajlitu.avajjava.litu.avajlitu.avajjava.litu.avajlitu.avajjava.litu.avajlitu.avajjava.litu.avajlitu.avajjava.litu.avajlitu.avajjava.litu.avajlitu.avajjava.litu.avajlitu.avajjava.litu.avajlitu.avajjava.litu.avajlitu.avajjava.litu.avajlitu.avajjava.litu.avajlitu.avajjava.litu.avajlitu.avaj", "                                                                                                                                            #############################################");
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test40331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest80.test40331");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.split("GNAL.AL.ARRAYLISTGNAL.AL.ARRAYLISTGNAL.AGNAL.AVAJGNAL.AVAJGNAL.AVAJGNAL.AVAJGNAL.AVAJGNAL.AVAJGNAL.AVAJGNAL.AVAJGNAL.AVAJGNAL.AVAJGNAL.AVAJGNAL.AVAJGNAL.AVAJGNAL.AVAJGNAL.AVAJGNAL.AVAJGNAL.AVAJGNAL.AVAJGNAL.AVAJGNAL.AVAJGNAL.AVAJGNAL.AVAJGNAL.AVAJGNAL.AVAJGNAL.AVAJGNAL.AVAJGNAL.AVAJGNAL.AVAGNAL.AVAAAAAAAAAAVAJARRAYLISTGNAL.AL.ARRAYLISTGNAL.AL.ARRAYLIST", "avajgnal.avajgnal.avajgnal.avajgnal.avajgnal.avajgnal.avajgnal.avajgnal.avajgnal", 131);
        java.lang.String[] strArray5 = org.apache.commons.lang3.StringUtils.stripAll(strArray3, "java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java.........");
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertNotNull(strArray5);
    }

    @Test
    public void test40332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest80.test40332");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("hi!ArrayListArrayListArrayListavaj", "aaaa......", 507);
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void test40333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest80.test40333");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOfIgnoreCase("LNuRChahactaRChahactaRChahactaRChahactaRChahactaRChahactaRChahactaRChahactaRChahactaRChahactaRChahactaRChahactaRChahactaRChahactaRChahactaRChahactaRChahactaRChahactaRChahactaRChahactaRChahactaRChahactaRChahactaRChahacta", "                                      vA.LANGAVAJ.GNALJAVA.LANGAVAJ.GNALJAVA.LANGAVAJ.GNALJAVA.LANGAVAJ.GNALJAVA.LANGAVAJ.GNALJAVA                                      ", 8);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test40334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest80.test40334");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("Arralitu.avajlitu.avaj", "vv4yL444vv4yL444vv4yL444vv4yL444vv4yL444vv4yL444vv4yL444vv4yL444vv4yL444vv4yL444vv4yL444vv4yL444vv4yL444vv4yL444vv4yL444vv4yL444vv4yL444vv4yL444vv4yL444vv4yL444vv4yL444vv4yL444vv4yL444vv4yL444vv4yL444vv4yL444vv4yL444vv4yL444vv4yL444vv4yL444vv4yL444vv4yL444vv4yL444vv4yL444vv4yL444vv4yL444vv4yL444vv4yL444vv4yL444vv4yL444vv4yL444vv4yL444vv4yL444vv4yL444vv4yL444vv4yL444vv4yL444vv4yL444vv4yL444vv4yL444vv4yL444$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$avalitu.$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$", 81);
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void test40335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest80.test40335");
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
        java.lang.String str41 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) wildcardClassArray35, ' ', (int) (short) 0, 0);
        java.lang.Class<?>[] wildcardClassArray42 = org.apache.commons.lang3.ClassUtils.toClass((java.lang.Object[]) wildcardClassArray35);
        java.lang.Class[] classArray44 = new java.lang.Class[0];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray45 = (java.lang.Class<?>[]) classArray44;
        java.lang.Class<?>[] wildcardClassArray46 = org.apache.commons.lang3.ClassUtils.primitivesToWrappers(wildcardClassArray45);
        java.lang.Class<?> wildcardClass47 = null;
        java.lang.Class[] classArray49 = new java.lang.Class[1];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray50 = (java.lang.Class<?>[]) classArray49;
        wildcardClassArray50[0] = wildcardClass47;
        java.lang.Class<?>[] wildcardClassArray53 = org.apache.commons.lang3.ClassUtils.primitivesToWrappers(wildcardClassArray50);
        boolean boolean55 = org.apache.commons.lang3.ClassUtils.isAssignable(wildcardClassArray45, wildcardClassArray50, true);
        java.lang.Class[] classArray57 = new java.lang.Class[0];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray58 = (java.lang.Class<?>[]) classArray57;
        java.lang.Class<?>[] wildcardClassArray59 = org.apache.commons.lang3.ClassUtils.primitivesToWrappers(wildcardClassArray58);
        java.lang.String str61 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) wildcardClassArray59, "...                                 ");
        boolean boolean62 = org.apache.commons.lang3.ClassUtils.isAssignable(wildcardClassArray50, wildcardClassArray59);
        java.lang.Class<?>[] wildcardClassArray63 = org.apache.commons.lang3.ClassUtils.primitivesToWrappers(wildcardClassArray59);
        java.lang.Class<?>[] wildcardClassArray64 = org.apache.commons.lang3.ClassUtils.primitivesToWrappers(wildcardClassArray63);
        java.lang.Class<?>[] wildcardClassArray65 = org.apache.commons.lang3.ClassUtils.primitivesToWrappers(wildcardClassArray64);
        java.lang.Class<?> wildcardClass66 = null;
        java.lang.Class[] classArray68 = new java.lang.Class[1];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray69 = (java.lang.Class<?>[]) classArray68;
        wildcardClassArray69[0] = wildcardClass66;
        java.lang.Class<?>[] wildcardClassArray72 = org.apache.commons.lang3.ClassUtils.primitivesToWrappers(wildcardClassArray69);
        java.lang.Class<?>[] wildcardClassArray73 = org.apache.commons.lang3.ClassUtils.wrappersToPrimitives(wildcardClassArray69);
        boolean boolean75 = org.apache.commons.lang3.ClassUtils.isAssignable(wildcardClassArray64, wildcardClassArray69, false);
        boolean boolean76 = org.apache.commons.lang3.ClassUtils.isAssignable(wildcardClassArray35, wildcardClassArray64);
        java.lang.Class<?>[] wildcardClassArray77 = org.apache.commons.lang3.ClassUtils.primitivesToWrappers(wildcardClassArray64);
        java.lang.String str79 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) wildcardClassArray64, "Java.io.Serializable interface java.lang.Cloneable... interface");
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
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "" + "'", str41, "");
        org.junit.Assert.assertNotNull(wildcardClassArray42);
        org.junit.Assert.assertNotNull(classArray44);
        org.junit.Assert.assertNotNull(wildcardClassArray45);
        org.junit.Assert.assertNotNull(wildcardClassArray46);
        org.junit.Assert.assertNotNull(classArray49);
        org.junit.Assert.assertNotNull(wildcardClassArray50);
        org.junit.Assert.assertNotNull(wildcardClassArray53);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
        org.junit.Assert.assertNotNull(classArray57);
        org.junit.Assert.assertNotNull(wildcardClassArray58);
        org.junit.Assert.assertNotNull(wildcardClassArray59);
        org.junit.Assert.assertEquals("'" + str61 + "' != '" + "" + "'", str61, "");
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + false + "'", boolean62 == false);
        org.junit.Assert.assertNotNull(wildcardClassArray63);
        org.junit.Assert.assertNotNull(wildcardClassArray64);
        org.junit.Assert.assertNotNull(wildcardClassArray65);
        org.junit.Assert.assertNotNull(classArray68);
        org.junit.Assert.assertNotNull(wildcardClassArray69);
        org.junit.Assert.assertNotNull(wildcardClassArray72);
        org.junit.Assert.assertNotNull(wildcardClassArray73);
        org.junit.Assert.assertTrue("'" + boolean75 + "' != '" + false + "'", boolean75 == false);
        org.junit.Assert.assertTrue("'" + boolean76 + "' != '" + false + "'", boolean76 == false);
        org.junit.Assert.assertNotNull(wildcardClassArray77);
        org.junit.Assert.assertEquals("'" + str79 + "' != '" + "" + "'", str79, "");
    }

    @Test
    public void test40336() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest80.test40336");
        java.util.Locale locale1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.apache.commons.lang3.StringUtils.lowerCase("GNL$ $VJ", locale1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test40337() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest80.test40337");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOf("ArrayListAArrayListAArrayListAArrayListAArrayListAArrayListAArrayListAArrayListAArrayListAArrayListAArrayListAArrayListAArrayListAArrayListAArrayListAArrayListAArrayListAArrayListAArrayListAArrayListAArrayListAArrayListAArrayListAArrayListAArrayListAArrayListAArrayListAArrayListAArrayListAArrayListAArrayListAArrayListAArrayListAArrayListAArrayListAArrayListA", (int) (byte) 0, 61);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test40338() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest80.test40338");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.split("langAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAulang", '4');
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test40339() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest80.test40339");
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("IrfCo$irfioSriiIrfCo$irfioSriiIrfCo$irfioSriiIrfCo$irfioSriiIrfCo$irfioSriiIrfCo$irfioSriiIrfCo$irfioSriiIrfCo$irfioSriiIrfCo$irfioSriiIrf..........................................................................................", "INTERFACE JAVA.LANG.CLONEABLEAAAAAAAAAAJAVAL.AGNAAAAAAAAAAJAVAL.AGNAAAAAAAAAAJAVAL.AGNAAAAAAAAAAJAVAL.AGNAAAAAAAAAAJAVAL.AGNAAAAAAAAAAJAVAL.AGNAAAAAAAAAAJAVAL.AGNAAAAAAAAAAJAVAL.AGNAAAAAAAAAAJAVAL.AGNAAAAAAAAAAJAVAL.AGNAAAAAAAAAAJAVAL.AGNAAAAAAAAAAJAVAL.AGNAAAAAAAAAAJAVAL.AGNAAAAAAAAAAJAVAL.AGNAAAAAAAAAAJAVAL.AGNAAAAAAAAAAJAVAL.AGNAAAAAAAAAAJAVAL.AGNAAAAAAAAAAJAVAL.AGNAAAAAAAAAAJAVAL.AGNAAAAAAAAAAJAVAL.AGNAAAAAAAAAAJAVAL.AGNAAAAAAAAAAJAVAL.AGNAAAAAAAAAAJAVAL.AGNAAAAAAAAAAJAVAL.AGNAAAAAAAAAAJAVAL.AGNAAAAAAAAAAJAVAL.AGNAAAAAAAAAAJAVAL.AGNAAAAAAAAAAJAVAL.AGNAAAAAAAAAAJAVAL.AGNAAAAAAAAAAJAVAL.AGNAAAAAAAAAAJAVAL.AGNAAAAAAAAAAJAVAL.AGNAAAAAAAAAAJAVAL.AGNAAAAAAAAAAJAVAL.AGNAAAAAAAAAAJAVAL.AGNAAAAAAAAAARINGINTERFACE JAVA.IO.SERIALIZABL", 969);
        boolean boolean5 = org.apache.commons.lang3.StringUtils.startsWithAny("interface java.lang.Cloneable.......java.......Objectava..........javainterface java.io.Serializable", strArray4);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test40340() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest80.test40340");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("class java.util.AbstractListgn lu v j                       ....................................................................class java.util.AbstractCollectiongn lu v j                       ....................................................................class java.lang.Object", "Gnirt...", 115);
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void test40341() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest80.test40341");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitByCharacterTypeCamelCase("                                                           ");
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test40342() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest80.test40342");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAllLowerCase((java.lang.CharSequence) "Interface java.lang.Cloneablehi!arr..interface java.io.Serializable");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test40343() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest80.test40343");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.capitalize((java.lang.CharSequence) "#########################################################################################yList");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "#########################################################################################yList" + "'", str1, "#########################################################################################yList");
    }

    @Test
    public void test40344() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest80.test40344");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isBlank((java.lang.CharSequence) "                     44444444444444444444-1JAVA444444444444444444444                      ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test40345() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest80.test40345");
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.overlay("Interface java.lang.Cloneablehi!arr..interface java.io.Serializable", "...                                                                                                                                     ...", 830, 116);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Interface java.lang.Cloneablehi!arr..interface java.io.Serializable...                                                                                                                                     ..." + "'", str4, "Interface java.lang.Cloneablehi!arr..interface java.io.Serializable...                                                                                                                                     ...");
    }

    @Test
    public void test40346() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest80.test40346");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.substringBetween("444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444litu                                             ...                                                    avajlitu                                             ...                                                    avaj", "...AAAAA...", "Javaaaaaaaaaava.langava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava");
        org.junit.Assert.assertNull(str3);
    }

    @Test
    public void test40347() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest80.test40347");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("irfCo$irfioSriizaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "javal######################");
        java.lang.String str4 = org.apache.commons.lang3.ClassUtils.getShortClassName((java.lang.Object) "javal######################", "interface java.lang.Cloneable             Character             interface java.io.Serializable");
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "String" + "'", str4, "String");
    }

    @Test
    public void test40348() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest80.test40348");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.remove(".....CHARACTER             UTILSTRI", "interface java.lang.Cloneable$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$interface java.io.Serializable                                ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + ".....CHARACTER             UTILSTRI" + "'", str2, ".....CHARACTER             UTILSTRI");
    }

    @Test
    public void test40349() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest80.test40349");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.leftPad("... $$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$", 477);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "... $$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$" + "'", str2, "... $$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$");
    }

    @Test
    public void test40350() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest80.test40350");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.strip("       $$$$$$java");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "$$$$$$java" + "'", str1, "$$$$$$java");
    }

    @Test
    public void test40351() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest80.test40351");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNumeric((java.lang.CharSequence) "                                                                       JAVAsTRIN                                                                        ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test40352() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest80.test40352");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBeforeLast("         Aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa          ", "                                                                                                                                                                                                                                                              ...$$$$$$$$$$$$$$$...");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "         Aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa          " + "'", str2, "         Aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa          ");
    }

    @Test
    public void test40353() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest80.test40353");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.split("AAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAA", "java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java", (int) '#');
        java.lang.String[] strArray5 = org.apache.commons.lang3.StringUtils.stripAll(strArray3, "ARR...AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA...AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA...AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA...AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA...AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA...AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA...AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA...AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA...AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA");
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertNotNull(strArray5);
    }

    @Test
    public void test40354() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest80.test40354");
        char[] charArray7 = new char[] { '$' };
        int int8 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "java.util", charArray7);
        boolean boolean9 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "                                   ", charArray7);
        boolean boolean10 = org.apache.commons.lang3.StringUtils.containsAny("...       ....       .", charArray7);
        int int11 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "StringUtils", charArray7);
        boolean boolean12 = org.apache.commons.lang3.StringUtils.containsAny("", charArray7);
        boolean boolean13 = org.apache.commons.lang3.StringUtils.containsAny("javal######################", charArray7);
        org.junit.Assert.assertNotNull(charArray7);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray7), "$");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray7), "$");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray7), "[$]");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test40355() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest80.test40355");
        int int3 = org.apache.commons.lang3.StringUtils.indexOfIgnoreCase("                                            Arra                                                                                                                                                                                                                                                                                                                                                                 ", "$$$$$$$$$$$$$$$$$$$..$                                                                 AtsiLytcejbOlvjsslcrrAtsiLytcejbO.gnal.avaj ssalcrrAva.langGNAL..langjava.langAGNAL.AVAJ$$$$$$$$$$$$$$$$$$$..$$", 764);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test40356() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest80.test40356");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("hi!", "");
        java.lang.String[] strArray5 = org.apache.commons.lang3.StringUtils.stripAll(strArray3, "$");
        java.lang.Class<?>[] wildcardClassArray6 = org.apache.commons.lang3.ClassUtils.toClass((java.lang.Object[]) strArray3);
        java.lang.String[] strArray9 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("hi!", "");
        java.lang.String[] strArray11 = org.apache.commons.lang3.StringUtils.stripAll(strArray9, "$");
        java.lang.Class<?>[] wildcardClassArray12 = org.apache.commons.lang3.ClassUtils.toClass((java.lang.Object[]) strArray9);
        java.lang.Class<?> wildcardClass13 = null;
        java.lang.Class[] classArray15 = new java.lang.Class[1];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray16 = (java.lang.Class<?>[]) classArray15;
        wildcardClassArray16[0] = wildcardClass13;
        java.lang.Class<?>[] wildcardClassArray19 = org.apache.commons.lang3.ClassUtils.primitivesToWrappers(wildcardClassArray16);
        java.lang.String[] strArray21 = new java.lang.String[] { "                                   " };
        java.lang.String str22 = org.apache.commons.lang3.StringUtils.getCommonPrefix(strArray21);
        java.lang.Class<?>[] wildcardClassArray23 = org.apache.commons.lang3.ClassUtils.toClass((java.lang.Object[]) strArray21);
        java.lang.Class<?> wildcardClass24 = null;
        java.lang.Class[] classArray26 = new java.lang.Class[1];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray27 = (java.lang.Class<?>[]) classArray26;
        wildcardClassArray27[0] = wildcardClass24;
        java.lang.Class<?>[] wildcardClassArray30 = org.apache.commons.lang3.ClassUtils.primitivesToWrappers(wildcardClassArray27);
        boolean boolean31 = org.apache.commons.lang3.ClassUtils.isAssignable(wildcardClassArray23, wildcardClassArray27);
        boolean boolean33 = org.apache.commons.lang3.ClassUtils.isAssignable(wildcardClassArray16, wildcardClassArray27, true);
        boolean boolean35 = org.apache.commons.lang3.ClassUtils.isAssignable(wildcardClassArray12, wildcardClassArray27, false);
        java.lang.Class<?>[] wildcardClassArray36 = org.apache.commons.lang3.ClassUtils.primitivesToWrappers(wildcardClassArray12);
        boolean boolean37 = org.apache.commons.lang3.ClassUtils.isAssignable(wildcardClassArray6, wildcardClassArray36);
        java.lang.Class<?>[] wildcardClassArray38 = org.apache.commons.lang3.ClassUtils.wrappersToPrimitives(wildcardClassArray36);
        java.lang.String str40 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) wildcardClassArray38, '.');
        java.lang.Class<?>[] wildcardClassArray41 = org.apache.commons.lang3.ClassUtils.wrappersToPrimitives(wildcardClassArray38);
        java.lang.String str42 = org.apache.commons.lang3.StringUtils.concatWith("aRR.AVALITU.AAAAAAAAAAAAAAAAAAAAAAAAAAAAAA... AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA... AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA... AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA... AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA... AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA... AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA... AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA... AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA... AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAYLIST", (java.lang.Object[]) wildcardClassArray41);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertNotNull(wildcardClassArray6);
        org.junit.Assert.assertNotNull(strArray9);
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertNotNull(wildcardClassArray12);
        org.junit.Assert.assertNotNull(classArray15);
        org.junit.Assert.assertNotNull(wildcardClassArray16);
        org.junit.Assert.assertNotNull(wildcardClassArray19);
        org.junit.Assert.assertNotNull(strArray21);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "                                   " + "'", str22, "                                   ");
        org.junit.Assert.assertNotNull(wildcardClassArray23);
        org.junit.Assert.assertNotNull(classArray26);
        org.junit.Assert.assertNotNull(wildcardClassArray27);
        org.junit.Assert.assertNotNull(wildcardClassArray30);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertNotNull(wildcardClassArray36);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
        org.junit.Assert.assertNotNull(wildcardClassArray38);
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "" + "'", str40, "");
        org.junit.Assert.assertNotNull(wildcardClassArray41);
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "" + "'", str42, "");
    }

    @Test
    public void test40357() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest80.test40357");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.equals((java.lang.CharSequence) "][sslC][sslCrChahacta][sslC][ssl][sslC][sslCrChahacta][sslC][ssl][sslC][sslCrChahacta][sslC][ssl][sslC][sslCrChahacta][sslC][ssl][sslC][sslCrChahacta][sslC][ssl][sslC][sslCrChahacta][sslC][ssl][sslC][sslCrChahacta][sslC][ssl][sslC][sslCrChahacta][sslC][ssl][sslC][sslCrChahacta][sslC][ssl][sslC][sslCrChahacta][sslC][ssl][sslC][sslCrChahacta][sslC][ssl][sslC][sslCrChahacta][sslC][ssl][sslC][sslCrChahacta][sslC][ssl][sslC][sslCGNALaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaagn                                            ", (java.lang.CharSequence) "GNL ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test40358() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest80.test40358");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.equalsIgnoreCase("avajgn", "va.langjava.langjava.lang... .... .java.langjava.langjava.langjava.langjava.langjava.langjava...");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test40359() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest80.test40359");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOf("JAVA.L$ArrayAAAAAAAAAA", 881, 9);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test40360() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest80.test40360");
        java.lang.ClassLoader classLoader0 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass3 = org.apache.commons.lang3.ClassUtils.getClass(classLoader0, "interfacejava.lang.Cloneablegnal.avajgnal..LANGgnal.avajgnal.interfacejava.io                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                     ", false);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassNotFoundException; message: interfacejava/lang/Cloneablegnal/avajgnal//LANGgnal/avajgnal/interfacejava/io");
        } catch (java.lang.ClassNotFoundException e) {
            // Expected exception.
        }
    }

    @Test
    public void test40361() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest80.test40361");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAsciiPrintable((java.lang.CharSequence) "AtsiLytcejbO.gnal.avaj ssalcrrAtsiLytcejbO.gnal.avaj ssalcrrAva.langGNAL..langjava.langAGNAL.AVAJAtsiLytcejbO.gnal.avaj ssalcrrAtsiLytcejbO.gnal.avaj ssalcrrAva.langGNAL..langjava.langAGNAL.AVAJAtsiLytcejbO.gnal.avaj ssalcrrAtsiLytcejbO.gnal.avaj ssalcrrAva.langGNAL..langjava.langAGNAL.AVAJAtsiLytcejbO.gnal.avaj ssalcrrAtsiLytcejStringAtsiLytcejbO.gnal.avaj ssalcrrAtsiLytcejbO.gnal.avaj ssalcrrAva.langGNAL..langjava.langAGNAL.AVAJAtsiLytcejbO.gnaaaaaa...                          ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test40362() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest80.test40362");
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.split("int", "...                                 ", 155);
        java.lang.String[] strArray6 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("-1java");
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.concat((java.lang.Object[]) strArray6);
        java.lang.String str9 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray6, "                                           ");
        java.lang.String str13 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray6, '.', 228, 62);
        java.lang.String str14 = org.apache.commons.lang3.StringUtils.replaceEach("jAVAAAAAAAAAAVA.LANG..", strArray4, strArray6);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "-1java" + "'", str7, "-1java");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "-1java" + "'", str9, "-1java");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "jAVAAAAAAAAAAVA.LANG.." + "'", str14, "jAVAAAAAAAAAAVA.LANG..");
    }

    @Test
    public void test40363() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest80.test40363");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.equalsIgnoreCase("Hi!arr...", "###################################################################################################################################################################################################################################interface#java.lang.Cloneable4interface#java.io.Serializable####################################################################################################################################################################################################################################");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test40364() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest80.test40364");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substring("AAAAAA...1AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA...1AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA...1AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA...1AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA...1AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA", 993);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test40365() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest80.test40365");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNumeric((java.lang.CharSequence) "L.Arr#yListgnaljava..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java.........");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test40366() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest80.test40366");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.equalsIgnoreCase(".........clss jv.lng.Stringclss jv.lng.Stringclss jv.lng.Stringclss jv.lng.Stringclss jv.lng.Stringclss jv.lng.Stringclss jv.lng.Stringclss jv.lng.Stringclss jv.lng.Stringclss jv.lng.Stringclss jv.lng.Stringclss jv.lng.Stringclss jv.lng.Stringclss jv.lng.Stringclss jv.lng.Stringclss jv.lng.Stringclss jv.lng.Stringjava.lang$interface java.lang.Cloneable$interface java.io.Serializableinterface java.lang.Cloneable$interface java.io.Serializableinterface java.lang.Clclss jv.lng.Stringclss jv.lng.Stringclss jv.lng.Stringclss jv.lng.Stringclss jv.lng.Stringclss jv.lng.Stringclss jv.lng.Stringclss jv.lng.Stringclss jv.lng.Stringclss jv.lng.Stringclss jv.lng.Stringclss jv.lng.Stringclss jv.lng.Stringclss jv.lng.Stringclss jv.lng.Stringclss jv.lng.Stringclss jv.lng.String...................................................................JAV", "avajssalC");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test40367() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest80.test40367");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.split("...java..........java..");
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test40368() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest80.test40368");
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.replace("Java.litu.avajlitu.avajjava.litu.avajlitu.avajjava.litu.avajlitu.avaayL A    Java.litu.avajlitu.avajjava.litu.avajlitu.avajjava.litu.avajlitu.ava", "...vajlang.javagnal.avajlang.javagnal.avajlang.javagnal.avajlang.javagnal.avajlang.javagnal.avajlang.javagnal.avajlang.javagnal.avajlang.javagnal.ava...", "classjava", 65);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Java.litu.avajlitu.avajjava.litu.avajlitu.avajjava.litu.avajlitu.avaayL A    Java.litu.avajlitu.avajjava.litu.avajlitu.avajjava.litu.avajlitu.ava" + "'", str4, "Java.litu.avajlitu.avajjava.litu.avajlitu.avajjava.litu.avajlitu.avaayL A    Java.litu.avajlitu.avajjava.litu.avajlitu.avajjava.litu.avajlitu.ava");
    }

    @Test
    public void test40369() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest80.test40369");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOf("NAL", 300, 466);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test40370() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest80.test40370");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOfIgnoreCase("NGJAVAGNALAVAJLANGJAVAGNALAVAJLANGJAVAGNALAVAJLANGJAVAGNALAVAJLANGJAVAGNALAVAJLANGJAVAGNALAVAJLANGGNALELBAENOLCGNALAVAJ ECAFR", "JAVALIT", 457);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test40371() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest80.test40371");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.containsWhitespace("RFACE JAVALANGCLONEABLELANGGNALJAVALANGAVAJGNALJAVALANGAVAJGNALJAVALANGAVAJGNALJAVALANGAVAJGNALJAVALANGAVAJGNALJAVALANGAVAJ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test40372() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest80.test40372");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.stripEnd("", "...........................JAV...........................");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test40373() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest80.test40373");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.mid("                                                                  AVAJECAFRETNI                                                                   ", (int) (short) 0, 446);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "                                                                  AVAJECAFRETNI                                                                   " + "'", str3, "                                                                  AVAJECAFRETNI                                                                   ");
    }

    @Test
    public void test40374() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest80.test40374");
        java.lang.String[] strArray1 = null;
        java.lang.String[] strArray8 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("...", "avaj.gnal", (int) 'a');
        boolean boolean9 = org.apache.commons.lang3.StringUtils.startsWithAny("", strArray8);
        java.lang.Class<?>[] wildcardClassArray10 = org.apache.commons.lang3.ClassUtils.toClass((java.lang.Object[]) strArray8);
        java.lang.String[] strArray12 = org.apache.commons.lang3.StringUtils.stripAll(strArray8, "AVAJ.GNAL");
        java.lang.String str14 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray12, "interface java.lang.Cloneablegnal.avajgnal..LANGgnal.avajgnal.interface java.io.Serializabl");
        java.lang.String[] strArray18 = org.apache.commons.lang3.StringUtils.split("AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA      ", "][sslC", (int) '$');
        java.lang.String[] strArray20 = org.apache.commons.lang3.StringUtils.stripAll(strArray18, "Java.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.lang");
        java.lang.String str21 = org.apache.commons.lang3.StringUtils.replaceEachRepeatedly("$", strArray12, strArray20);
        java.lang.String[] strArray24 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("CEAJ V AL NGAcLONE BLEAAAAAAAJ V AAAAAAAAAAJ V AAAAAAAAAAJ V AAAAAAAAAAJ V AAAAAAAAAAJ V AAAAAAAAAAJ V AAAAAAAAAAJ V AAAAAAAAAAJ V AAAAAAAAAAJ V AAAAAAAAAAJ V AAAAAAAAAAJ V AAAAAAAAAAJ V AAAAAAAAAAJ V AAAAAAAAAAJ V AAAAAAAAAAJ V AAAAAAAAAAJ V AAAAAAAAAAJ V AAAAAAAAAAJ V AAAAAAAAAAJ V AAAAAAAAAAJ V AAAAAAAAAAJ V AAAAAAAAAAJ V AAAAAAAAAAJ V AAAAAAAAAAJ V AAAAAAAAAAJ V AAAAAAAAAAJ V AAAAAAAAAAJ V AAAAAAAAAAJ V AAAAAAAAAAJ V AAAAAAAAAAJ V AAAAAAAAAAJ V AAAAAAAAAAJ V AAAAAAAAAAJ V AAAAAAAAAAJ V AAAAAAAAAAJ V INTERF CEAJ V AIOAsERI LIZ BLE", "         util          ");
        java.lang.String str25 = org.apache.commons.lang3.StringUtils.replaceEachRepeatedly("                                                                                                                                                                                                                                                                                                                                                                                                                             lyrrtsilyrrtsilyrrlng.jvtsilyrrtsilyrrtsilyrrlngnirtsvj", strArray20, strArray24);
        int int26 = org.apache.commons.lang3.StringUtils.indexOfDifference((java.lang.CharSequence[]) strArray20);
        java.lang.String str27 = org.apache.commons.lang3.StringUtils.replaceEach("                                                                                                                                                                                                                                                                                                                                                          javal#.#agn       aaaaaaaaaaaaaaaaaaaaaaaaa                                                                                                                                                                                                                                                                                                                                                          ", strArray1, strArray20);
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(wildcardClassArray10);
        org.junit.Assert.assertNotNull(strArray12);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertNotNull(strArray18);
        org.junit.Assert.assertNotNull(strArray20);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "$" + "'", str21, "$");
        org.junit.Assert.assertNotNull(strArray24);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "                                                                                                                                                                                                                                                                                                                                                                                                                             lyrrtsilyrrtsilyrrlng.jvtsilyrrtsilyrrtsilyrrlngnirtsvj" + "'", str25, "                                                                                                                                                                                                                                                                                                                                                                                                                             lyrrtsilyrrtsilyrrlng.jvtsilyrrtsilyrrtsilyrrlngnirtsvj");
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + (-1) + "'", int26 == (-1));
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "                                                                                                                                                                                                                                                                                                                                                          javal#.#agn       aaaaaaaaaaaaaaaaaaaaaaaaa                                                                                                                                                                                                                                                                                                                                                          " + "'", str27, "                                                                                                                                                                                                                                                                                                                                                          javal#.#agn       aaaaaaaaaaaaaaaaaaaaaaaaa                                                                                                                                                                                                                                                                                                                                                          ");
    }

    @Test
    public void test40375() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest80.test40375");
        java.lang.String str1 = org.apache.commons.lang3.ClassUtils.getPackageName("arahCretcarahCretcarahCretcarahCretcarahCretcarahCretcarahCretcarahCretcarahCretcarahCretcarahCretcarahCretcarahCretcarahCretcarahCretcarahCretcarahCretcarahCretcarahCretcarahCretcarahCretcarahCretcarahCretcarahCretcarahCretcarahCretcarahCretcarahCretcarahCretcarahCretcar...");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "arahCretcarahCretcarahCretcarahCretcarahCretcarahCretcarahCretcarahCretcarahCretcarahCretcarahCretcarahCretcarahCretcarahCretcarahCretcarahCretcarahCretcarahCretcarahCretcarahCretcarahCretcarahCretcarahCretcarahCretcarahCretcarahCretcarahCretcarahCretcarahCretcarahCretcar.." + "'", str1, "arahCretcarahCretcarahCretcarahCretcarahCretcarahCretcarahCretcarahCretcarahCretcarahCretcarahCretcarahCretcarahCretcarahCretcarahCretcarahCretcarahCretcarahCretcarahCretcarahCretcarahCretcarahCretcarahCretcarahCretcarahCretcarahCretcarahCretcarahCretcarahCretcarahCretcar..");
    }

    @Test
    public void test40376() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest80.test40376");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("hi!", "");
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.stripAll(strArray2, "$");
        java.lang.Class<?>[] wildcardClassArray5 = org.apache.commons.lang3.ClassUtils.toClass((java.lang.Object[]) strArray2);
        java.lang.Class<?>[] wildcardClassArray6 = org.apache.commons.lang3.ClassUtils.toClass((java.lang.Object[]) wildcardClassArray5);
        java.lang.Class<?>[] wildcardClassArray7 = org.apache.commons.lang3.ClassUtils.primitivesToWrappers(wildcardClassArray5);
        java.lang.Class<?>[] wildcardClassArray8 = org.apache.commons.lang3.ClassUtils.primitivesToWrappers(wildcardClassArray7);
        java.lang.Class<?>[] wildcardClassArray9 = org.apache.commons.lang3.ClassUtils.primitivesToWrappers(wildcardClassArray7);
        java.lang.String str11 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) wildcardClassArray7, "ylistarraylistarray");
        java.lang.String str12 = org.apache.commons.lang3.StringUtils.concat((java.lang.Object[]) wildcardClassArray7);
        java.lang.String[] strArray14 = org.apache.commons.lang3.StringUtils.splitByCharacterType("... AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA... AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA... AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA... AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA... AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA... AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA... AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA... AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA... AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA... AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA");
        java.lang.Class<?>[] wildcardClassArray15 = org.apache.commons.lang3.ClassUtils.toClass((java.lang.Object[]) strArray14);
        java.lang.Class<?>[] wildcardClassArray16 = org.apache.commons.lang3.ClassUtils.primitivesToWrappers(wildcardClassArray15);
        java.lang.Class<?>[] wildcardClassArray17 = org.apache.commons.lang3.ClassUtils.wrappersToPrimitives(wildcardClassArray16);
        java.lang.String[] strArray20 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("hi!", "");
        java.lang.String[] strArray22 = org.apache.commons.lang3.StringUtils.stripAll(strArray20, "$");
        java.lang.Class<?>[] wildcardClassArray23 = org.apache.commons.lang3.ClassUtils.toClass((java.lang.Object[]) strArray20);
        java.lang.String[] strArray26 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("hi!", "");
        java.lang.String[] strArray28 = org.apache.commons.lang3.StringUtils.stripAll(strArray26, "$");
        java.lang.Class<?>[] wildcardClassArray29 = org.apache.commons.lang3.ClassUtils.toClass((java.lang.Object[]) strArray26);
        java.lang.Class<?> wildcardClass30 = null;
        java.lang.Class[] classArray32 = new java.lang.Class[1];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray33 = (java.lang.Class<?>[]) classArray32;
        wildcardClassArray33[0] = wildcardClass30;
        java.lang.Class<?>[] wildcardClassArray36 = org.apache.commons.lang3.ClassUtils.primitivesToWrappers(wildcardClassArray33);
        java.lang.String[] strArray38 = new java.lang.String[] { "                                   " };
        java.lang.String str39 = org.apache.commons.lang3.StringUtils.getCommonPrefix(strArray38);
        java.lang.Class<?>[] wildcardClassArray40 = org.apache.commons.lang3.ClassUtils.toClass((java.lang.Object[]) strArray38);
        java.lang.Class<?> wildcardClass41 = null;
        java.lang.Class[] classArray43 = new java.lang.Class[1];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray44 = (java.lang.Class<?>[]) classArray43;
        wildcardClassArray44[0] = wildcardClass41;
        java.lang.Class<?>[] wildcardClassArray47 = org.apache.commons.lang3.ClassUtils.primitivesToWrappers(wildcardClassArray44);
        boolean boolean48 = org.apache.commons.lang3.ClassUtils.isAssignable(wildcardClassArray40, wildcardClassArray44);
        boolean boolean50 = org.apache.commons.lang3.ClassUtils.isAssignable(wildcardClassArray33, wildcardClassArray44, true);
        boolean boolean52 = org.apache.commons.lang3.ClassUtils.isAssignable(wildcardClassArray29, wildcardClassArray44, false);
        java.lang.Class<?>[] wildcardClassArray53 = org.apache.commons.lang3.ClassUtils.primitivesToWrappers(wildcardClassArray29);
        boolean boolean54 = org.apache.commons.lang3.ClassUtils.isAssignable(wildcardClassArray23, wildcardClassArray53);
        java.lang.Class<?>[] wildcardClassArray55 = org.apache.commons.lang3.ClassUtils.wrappersToPrimitives(wildcardClassArray53);
        boolean boolean56 = org.apache.commons.lang3.ClassUtils.isAssignable(wildcardClassArray16, wildcardClassArray53);
        java.lang.Class<?>[] wildcardClassArray57 = org.apache.commons.lang3.ClassUtils.wrappersToPrimitives(wildcardClassArray53);
        java.lang.Class<?>[] wildcardClassArray58 = org.apache.commons.lang3.ClassUtils.primitivesToWrappers(wildcardClassArray57);
        java.lang.Class[] classArray60 = new java.lang.Class[0];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray61 = (java.lang.Class<?>[]) classArray60;
        java.lang.Class<?>[] wildcardClassArray62 = org.apache.commons.lang3.ClassUtils.primitivesToWrappers(wildcardClassArray61);
        java.lang.Class<?> wildcardClass63 = null;
        java.lang.Class[] classArray65 = new java.lang.Class[1];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray66 = (java.lang.Class<?>[]) classArray65;
        wildcardClassArray66[0] = wildcardClass63;
        java.lang.Class<?>[] wildcardClassArray69 = org.apache.commons.lang3.ClassUtils.primitivesToWrappers(wildcardClassArray66);
        boolean boolean71 = org.apache.commons.lang3.ClassUtils.isAssignable(wildcardClassArray61, wildcardClassArray66, true);
        java.lang.Class<?>[] wildcardClassArray72 = org.apache.commons.lang3.ClassUtils.primitivesToWrappers(wildcardClassArray66);
        java.lang.Class<?>[] wildcardClassArray73 = org.apache.commons.lang3.ClassUtils.primitivesToWrappers(wildcardClassArray66);
        java.lang.Class<?>[] wildcardClassArray74 = org.apache.commons.lang3.ClassUtils.wrappersToPrimitives(wildcardClassArray73);
        boolean boolean76 = org.apache.commons.lang3.ClassUtils.isAssignable(wildcardClassArray57, wildcardClassArray73, false);
        boolean boolean77 = org.apache.commons.lang3.ClassUtils.isAssignable(wildcardClassArray7, wildcardClassArray73);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertNotNull(wildcardClassArray5);
        org.junit.Assert.assertNotNull(wildcardClassArray6);
        org.junit.Assert.assertNotNull(wildcardClassArray7);
        org.junit.Assert.assertNotNull(wildcardClassArray8);
        org.junit.Assert.assertNotNull(wildcardClassArray9);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "class java.lang.String" + "'", str11, "class java.lang.String");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "class java.lang.String" + "'", str12, "class java.lang.String");
        org.junit.Assert.assertNotNull(strArray14);
        org.junit.Assert.assertNotNull(wildcardClassArray15);
        org.junit.Assert.assertNotNull(wildcardClassArray16);
        org.junit.Assert.assertNotNull(wildcardClassArray17);
        org.junit.Assert.assertNotNull(strArray20);
        org.junit.Assert.assertNotNull(strArray22);
        org.junit.Assert.assertNotNull(wildcardClassArray23);
        org.junit.Assert.assertNotNull(strArray26);
        org.junit.Assert.assertNotNull(strArray28);
        org.junit.Assert.assertNotNull(wildcardClassArray29);
        org.junit.Assert.assertNotNull(classArray32);
        org.junit.Assert.assertNotNull(wildcardClassArray33);
        org.junit.Assert.assertNotNull(wildcardClassArray36);
        org.junit.Assert.assertNotNull(strArray38);
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "                                   " + "'", str39, "                                   ");
        org.junit.Assert.assertNotNull(wildcardClassArray40);
        org.junit.Assert.assertNotNull(classArray43);
        org.junit.Assert.assertNotNull(wildcardClassArray44);
        org.junit.Assert.assertNotNull(wildcardClassArray47);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertNotNull(wildcardClassArray53);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + true + "'", boolean54 == true);
        org.junit.Assert.assertNotNull(wildcardClassArray55);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
        org.junit.Assert.assertNotNull(wildcardClassArray57);
        org.junit.Assert.assertNotNull(wildcardClassArray58);
        org.junit.Assert.assertNotNull(classArray60);
        org.junit.Assert.assertNotNull(wildcardClassArray61);
        org.junit.Assert.assertNotNull(wildcardClassArray62);
        org.junit.Assert.assertNotNull(classArray65);
        org.junit.Assert.assertNotNull(wildcardClassArray66);
        org.junit.Assert.assertNotNull(wildcardClassArray69);
        org.junit.Assert.assertTrue("'" + boolean71 + "' != '" + false + "'", boolean71 == false);
        org.junit.Assert.assertNotNull(wildcardClassArray72);
        org.junit.Assert.assertNotNull(wildcardClassArray73);
        org.junit.Assert.assertNotNull(wildcardClassArray74);
        org.junit.Assert.assertTrue("'" + boolean76 + "' != '" + false + "'", boolean76 == false);
        org.junit.Assert.assertTrue("'" + boolean77 + "' != '" + false + "'", boolean77 == false);
    }

    @Test
    public void test40377() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest80.test40377");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.swapCase("  $         $         $         $         $         $         $         $         $         $         $         $ ...");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "  $         $         $         $         $         $         $         $         $         $         $         $ ..." + "'", str1, "  $         $         $         $         $         $         $         $         $         $         $         $ ...");
    }

    @Test
    public void test40378() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest80.test40378");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.substringsBetween("", "l.ngAGNALelb.zil.ireSelb.zil.ireSelb.zil.ireSelb.zil.ireSelb.zil.ireSelb.zil.ireSelb.zil.ireSelb.zil.ireSelb.zil.ireSelb.zil.ireSelb.zil.ireSelb.zil.ireSelb.zil.ireSelb.zil.ireSelb.zil.ireSelb.zil.ireSelb.zil.ireSelb.zil.ireSelb.zil.ireSelb.zil.ireSelb.zil.ireSelb.zil.ireSelb.zil.ireSelb.zil.ireSelb.zil.ireSelb.zil.ireSelb.zil.ireSelb.zil.ireSelb.zil.ireSelb.zil.ireSelb.zil.ireSelb.zil.ireSelb.zil.ireSe................................................................................................", "g.JAVA.L$ArrayListg.JAVA.L$ArrayListg.JAVA.L$ArrayListg.JAVA.L$ArrayListg.JAVA.L$ArrayListg.JAVA.L$ArrayListg.JAVA.L$ArrayListg.JAVA.L$ArrayListg.JAVA.L$ArrayListg.JAVA.L$ArrayListg.JAVA.L$ArrayListg.JAVA.L$ArrayListg.JAVA.L$ArrayListg.JAVA.L$ArrayListg.JAVA.L$ArrayListg.JAVA.L$ArrayListg.JAVA.L$ArrayListg.JAVA.L$ArrayListg.JAVA.L$ArrayListg.JAVA.L$ArrayListg.JAVA.L$ArrayListg.JAVA.L$ArrayListg.JAVA.L$ArrayListg.JAVA.L$ArrayListg.JAVA.L$ArrayListg.JAVA.L$ArrayListg.JAVA.L$ArrayListg.JAVA.L$ArrayListg.JAVA.L$ArrayListg.JAVA.L$ArrayListg.JAVA.L$ArrayListg.JAVA.L$ArrayListg.JAVA.L$ArrayListg.JAVA.L$ArrayListg.JAVA.L$ArrayListg.JAVA.L$ArrayListg.JAVA.L$ArrayListg.JAVA.L$ArrayListg.JAVA.L$ArrayListg.JAVA.L$ArrayListg.JAVA.L$ArrayListg.JAVA.L$ArrayListg.JAVA.L$ArrayListg.JAVA.L$ArrayListg.JAVA.L$ArrayListg.");
        int int4 = org.apache.commons.lang3.StringUtils.indexOfDifference((java.lang.CharSequence[]) strArray3);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
    }

    @Test
    public void test40379() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest80.test40379");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.substringsBetween("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa-1java", "       .", "AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA...");
        org.junit.Assert.assertNull(strArray3);
    }

    @Test
    public void test40380() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest80.test40380");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.uncapitalize((java.lang.CharSequence) "arryLis");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "arryLis" + "'", str1, "arryLis");
    }

    @Test
    public void test40381() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest80.test40381");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("       $", "gnalArrayListArrayListArrayListavaj.gnalArrayListArrayListArrayLi");
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray2, '#');
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "       $" + "'", str4, "       $");
    }

    @Test
    public void test40382() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest80.test40382");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.rightPad("       java..........java..........java...       ", 620);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "       java..........java..........java...                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                  " + "'", str2, "       java..........java..........java...                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                  ");
    }

    @Test
    public void test40383() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest80.test40383");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("va1jva1jva1jva1jva1jva1jva1jva1jva1jva1jvaJAVAULANGva1jva1jva1jva1jva1jva1jva1jva1jva1jva1jva1va1jva1jva1jva1jva1jva1jva1jva1jva1jva1jvaJAVAULANGva1jva1jva1jva1jva1jva1jva1jva1jva1jva1jva1va1jva1jva1jva1jva1jva1jva1jva1jva1jva1jvaJAVAULANGva1jva1jva1jva1jva1jva1jva1jva1jva1jva1jva1va1jva1jva1jva1jva1jva1jva1jva1jva1jva1jvaJAVAULANGva1jva1jva1jva1jva1jva1jva1jva1jva1jva1jva1va1jva1jva1jva1jva1jva1jva1jva1jva1jva1jvaJAVAULANGva1jva1jva1jva1jva1jva1jva1jva1jva1jva1jva1va1jva1jva1jva1jva1jva1jva1jva1jva1jva1jvaJAVAULANGva1jva1jva1jva1jva1jva1jva1jva1jva1jva1jva1va1jva1jva1jva1jva1jva1jva1jva1jva1jva1jvaJAVAULANGva1jva1jva1jva1jva1jva1jva1jva1jva1jva1jva1va1jva1jva1jva1jva1jva1jva1jva1jva1jva1jvaJAVAULANGva1jva1jva1jva1jva1jva1jva1jva1jva1jva1jva1va1jva1jva1jva1jva1jva1jva1jva1jva1jva1jvaJAVAULANGva1jva1jva1jva1jva1jva1jva1jva1jva1jva1jva1va1jva1jva1jva1jva1jva1jva1jva1jva1jva1jvaJAVAULANGva1jva1jva1jva1jva1jva1jva1jva1jva1jva1jva1", 'a');
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.getCommonPrefix(strArray3);
        java.lang.String[] strArray9 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("hi!", "java.lang", (int) '.');
        int int10 = org.apache.commons.lang3.StringUtils.indexOfAny("Short", strArray9);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str11 = org.apache.commons.lang3.StringUtils.replaceEach("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", strArray3, strArray9);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Search and Replace array lengths don't match: 221 vs 1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(strArray9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
    }

    @Test
    public void test40384() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest80.test40384");
        java.lang.String str1 = org.apache.commons.lang3.ClassUtils.getPackageName("aaaa                       javaulangrraylistARACTERcHARACTERcHARACTERcHARACTERcHARACTERcHARACTERcHARACTERcHARACTERcHARACTERcHARACTERcHARACTERcHARACTERcHARACTERcHARACTERcHARACTERcHARACTERcHARACTERcHARACTERcHARACTERcHARACTERcHARACTERcHARACTERcHARACTERcHARACTERcHARACTERcHARACTERcHARACTERcHARACTERcHARACTERcHARACTERcHARACTERcHARACTERcHARACTERcHARACTERcHARACTERcHARACTERcHARACTERcHARACTERcHARACTERcHARA");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
    }

    @Test
    public void test40385() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest80.test40385");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripToEmpty("...hahactaRChahactaRChahactaRChahactaRChahactaRChahactaRChahactaRChahactaRChahactaRChahactaRChahactaRChaha...");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "...hahactaRChahactaRChahactaRChahactaRChahactaRChahactaRChahactaRChahactaRChahactaRChahactaRChahactaRChaha..." + "'", str1, "...hahactaRChahactaRChahactaRChahactaRChahactaRChahactaRChahactaRChahactaRChahactaRChahactaRChahactaRChaha...");
    }

    @Test
    public void test40386() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest80.test40386");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.remove("a..ayl aa..ayl aa..ayl aa..ayl aa..ayl aa..ayl aa..ayl aa..ayl aa..ayl aa..ayl aa..ayl aa..ayl aa..ayl aa..ayl aa..ayl aa..ayl aa..ayl aa..ayl aa..ayl aa..ayl aa..ayl aa..ayl aa..ayl aa..ayl aa..ayl aa..ayl aa..ayl aa..ayl aa..ayl aa..ayl aa..ayl aa..ayl aa..ayl aa..ayl aa..ayl aa..ayl aa..ayl aa..ayl aa..ayl aa..ayl aa..ayl aa..ayl aa..ayl aa..ayl aa..ayl aa..ayl aa..ayl aa..ayl aa..ayl aa..ayl aa..ayl aa..ayl aa..ayl aa..ayl aa..ayl aa..ayl aa..ayl aa..ayl aa..ayl aa..ayl aa..ayl aa..ayl aa..ayl aa..ayl aa..ayl aa..ayl aa..ayl aa..ayl aa..ayl aa..ayl aa..ayl aa..ayl aa..ayl aa..ayl aa..ayl aa..ayl aa..ayl aa..ayl aa..ayl aa..ayl aa..ayl aa..ayl aa..ayl aa..ayl aa..ayl aa..ayl aa..ayl aa..ayl aa..ayl aa..ayl aa..ayl aa..ayl aa..ayl aa..ayl aa..ayl aa..ayl aa..ayl aa..ayl aa..ayl aa..ayl aa..ayl aa..ayl aa..ayl aa..ayl aa..ayl", ' ');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "a..aylaa..aylaa..aylaa..aylaa..aylaa..aylaa..aylaa..aylaa..aylaa..aylaa..aylaa..aylaa..aylaa..aylaa..aylaa..aylaa..aylaa..aylaa..aylaa..aylaa..aylaa..aylaa..aylaa..aylaa..aylaa..aylaa..aylaa..aylaa..aylaa..aylaa..aylaa..aylaa..aylaa..aylaa..aylaa..aylaa..aylaa..aylaa..aylaa..aylaa..aylaa..aylaa..aylaa..aylaa..aylaa..aylaa..aylaa..aylaa..aylaa..aylaa..aylaa..aylaa..aylaa..aylaa..aylaa..aylaa..aylaa..aylaa..aylaa..aylaa..aylaa..aylaa..aylaa..aylaa..aylaa..aylaa..aylaa..aylaa..aylaa..aylaa..aylaa..aylaa..aylaa..aylaa..aylaa..aylaa..aylaa..aylaa..aylaa..aylaa..aylaa..aylaa..aylaa..aylaa..aylaa..aylaa..aylaa..aylaa..aylaa..aylaa..aylaa..aylaa..aylaa..aylaa..aylaa..aylaa..aylaa..aylaa..aylaa..aylaa..aylaa..aylaa..aylaa..aylaa..ayl" + "'", str2, "a..aylaa..aylaa..aylaa..aylaa..aylaa..aylaa..aylaa..aylaa..aylaa..aylaa..aylaa..aylaa..aylaa..aylaa..aylaa..aylaa..aylaa..aylaa..aylaa..aylaa..aylaa..aylaa..aylaa..aylaa..aylaa..aylaa..aylaa..aylaa..aylaa..aylaa..aylaa..aylaa..aylaa..aylaa..aylaa..aylaa..aylaa..aylaa..aylaa..aylaa..aylaa..aylaa..aylaa..aylaa..aylaa..aylaa..aylaa..aylaa..aylaa..aylaa..aylaa..aylaa..aylaa..aylaa..aylaa..aylaa..aylaa..aylaa..aylaa..aylaa..aylaa..aylaa..aylaa..aylaa..aylaa..aylaa..aylaa..aylaa..aylaa..aylaa..aylaa..aylaa..aylaa..aylaa..aylaa..aylaa..aylaa..aylaa..aylaa..aylaa..aylaa..aylaa..aylaa..aylaa..aylaa..aylaa..aylaa..aylaa..aylaa..aylaa..aylaa..aylaa..aylaa..aylaa..aylaa..aylaa..aylaa..aylaa..aylaa..aylaa..aylaa..aylaa..aylaa..aylaa..ayl");
    }

    @Test
    public void test40387() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest80.test40387");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trim("                                                                                                                                                                                                                                                                              langajavatsilyarratsilyarratsilyarra                                                                                                                                                                                                                                                                              ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "langajavatsilyarratsilyarratsilyarra" + "'", str1, "langajavatsilyarratsilyarratsilyarra");
    }

    @Test
    public void test40388() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest80.test40388");
        java.lang.String str1 = org.apache.commons.lang3.ClassUtils.getPackageName("Llitu...O.gn$l.$v$j ss$lcr4444444444444444444444444444444444444444444444444444444444444444444444444444444...O.");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Llitu...O.gn$l.$v$j ss$lcr4444444444444444444444444444444444444444444444444444444444444444444444444444444...O" + "'", str1, "Llitu...O.gn$l.$v$j ss$lcr4444444444444444444444444444444444444444444444444444444444444444444444444444444...O");
    }

    @Test
    public void test40389() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest80.test40389");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.containsWhitespace("4444444");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test40390() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest80.test40390");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("Booleaninterface java.lang.CloneableLANG.GNALJAVA.LANGAVAJ.GNALJAVA.LANGAVAJ.GNALJAVA.LANGAVAJ.GNALJAVA.LANGAVAJ.GNALJAVA.LANGAVAJ.GNALJAVA.LANGAVAJ.GNALJAVA.LANGAVAJ.GNALJAVA.LANGAVAJ.JAVAinterface java.io.Serializable", ' ');
        java.lang.String str4 = org.apache.commons.lang3.ClassUtils.getPackageName((java.lang.Object) strArray2, "...l.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAA...");
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "java.lang" + "'", str4, "java.lang");
    }

    @Test
    public void test40391() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest80.test40391");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.leftPad("interfac                                    ", 167, 'a');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaainterfac                                    " + "'", str3, "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaainterfac                                    ");
    }

    @Test
    public void test40392() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest80.test40392");
        int int2 = org.apache.commons.lang3.StringUtils.getLevenshteinDistance((java.lang.CharSequence) "                     44444444444444444444-1java444444444444444444444                      ", (java.lang.CharSequence) "GNAL.AVAJLANG.JAVAGNAL.AVAJLANG.JAVAGNAL.AVAJLANG.JAVAGNAL.AVAJLANG.JAVAGNAL.AVAJLANG.JAVAGNAL.AVAJLANG.JAVAGNAL.AVAJLANG.JAVAGNAL.AVAJLANG.JAVAGNAL.AVAJ");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 153 + "'", int2 == 153);
    }

    @Test
    public void test40393() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest80.test40393");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.lowerCase("44444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444.ly.");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "44444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444.ly." + "'", str1, "44444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444.ly.");
    }

    @Test
    public void test40394() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest80.test40394");
        int int2 = org.apache.commons.lang3.StringUtils.getLevenshteinDistance((java.lang.CharSequence) "                                        JAVAULANG                                         ", (java.lang.CharSequence) "Gnal..........................................................................................................................................................");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 158 + "'", int2 == 158);
    }

    @Test
    public void test40395() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest80.test40395");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.split("lang.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.1aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaajava.1aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa.1aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa.1aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa.1aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa.1aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa.1aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa.1aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa.1aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa.hi!arraylistarraylistarraylistavaj", "ava.lang.Cloneable.......java.......");
        java.lang.String str4 = org.apache.commons.lang3.ClassUtils.getPackageCanonicalName((java.lang.Object) "lang.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.1aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaajava.1aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa.1aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa.1aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa.1aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa.1aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa.1aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa.1aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa.1aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa.hi!arraylistarraylistarraylistavaj", "");
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "java.lang" + "'", str4, "java.lang");
    }

    @Test
    public void test40396() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest80.test40396");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOf("java.uti", "                                           ziirSoifri.oCfri                                            ");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test40397() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest80.test40397");
        java.lang.ClassLoader classLoader0 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass2 = org.apache.commons.lang3.ClassUtils.getClass(classLoader0, ".........ava..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java.....");
            org.junit.Assert.fail("Expected exception of type java.lang.ClassNotFoundException; message: /////////ava//////////java//////////java//////////java//////////java//////////java//////////java//////////java//////////java//////////java//////////java//////////java//////////java//////////java//////////java//////////java//////////java//////////java//////////java//////////java//////////java//////////java//////////java//////////java//////////java//////////java//////////java//////////java//////////java//////////java//////////java//////////java//////////java//////////java/////");
        } catch (java.lang.ClassNotFoundException e) {
            // Expected exception.
        }
    }

    @Test
    public void test40398() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest80.test40398");
        char[] charArray11 = new char[] { ' ', ' ', '#', 'a', '4', 'a' };
        int int12 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "", charArray11);
        boolean boolean13 = org.apache.commons.lang3.StringUtils.containsAny("$", charArray11);
        boolean boolean14 = org.apache.commons.lang3.StringUtils.containsAny("", charArray11);
        boolean boolean15 = org.apache.commons.lang3.StringUtils.containsAny("######################################################################################################################..aaaaaaaaaaaaaaaaaaaaaaaaaaaaa.....                                                                                                                         ", charArray11);
        boolean boolean16 = org.apache.commons.lang3.StringUtils.containsAny("                       javaulangrraylist", charArray11);
        org.junit.Assert.assertNotNull(charArray11);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray11), "  #a4a");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray11), "  #a4a");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray11), "[ ,  , #, a, 4, a]");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
    }

    @Test
    public void test40399() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest80.test40399");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.leftPad("Arr                                                                               JLANGAVLANGALLANGANG                                                                                yListArr              Hi!ArrayLisaVAJ.GNALAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA       CharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharaArr                                                                               JLANGAVLANGALLANGANG                                                                                yListArr               ", 662);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Arr                                                                               JLANGAVLANGALLANGANG                                                                                yListArr              Hi!ArrayLisaVAJ.GNALAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA       CharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharaArr                                                                               JLANGAVLANGALLANGANG                                                                                yListArr               " + "'", str2, "Arr                                                                               JLANGAVLANGALLANGANG                                                                                yListArr              Hi!ArrayLisaVAJ.GNALAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA       CharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharaArr                                                                               JLANGAVLANGALLANGANG                                                                                yListArr               ");
    }

    @Test
    public void test40400() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest80.test40400");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripToNull(".langjava.la...                                                                                                 ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + ".langjava.la..." + "'", str1, ".langjava.la...");
    }

    @Test
    public void test40401() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest80.test40401");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringAfter("AJaaaaaaaaaaNGA.LAVAJaaaaaaaaaaNGA.LAVAJaaaa                                               ", "aaaaaaaaaaJAVAavajGNAL.AGNaaaaaaaaaa");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test40402() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest80.test40402");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("hi!", "...       aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        java.lang.String str4 = org.apache.commons.lang3.ClassUtils.getShortClassName((java.lang.Object) "hi!", "irfCo.irfioSriiz");
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "String" + "'", str4, "String");
    }

    @Test
    public void test40403() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest80.test40403");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("class java.lang.String4444444444444JAVASTRINGSLITUGNIRTSARRAYLISTARRAYLISTAVAJ.GNALARRAYLISTARRAYLISTARRAYLI44444444444444class java.lang.String4444444444444JAVASTRINGSLITUGNIRTSARRAYLISTARRAYLISTAVAJ.GNALARRAYLISTARRAYLISTARRAYLI44444444444444class java.lang.String4444444444444JAVASTRINGSLITUGNIRTSARRAYLISTARRAYLISTAVAJ.GNALARRAYLISTARRAYLISTARRAYLI44444444444444class java.lang.String4444444444444JAVASTRINGSLITUGNIRTSARRAYLISTARRAYLISTAVAJ.GNALARRAYLISTARRAYLISTARRAYLI44444444444444class java.lang.String4444444444444JAVASTRINGSLITUGNIRTSARRAYLISTARRAYLISTAVAJ.GNALARRAYLISTARRAYLISTARRAYLI44444444444444class java.lang.String4444444444444JAVASTRINGSLITUGNIRTSARRAYLISTARRAYLISTAVAJ.GNALARRAYLISTARRAYLISTARRAYLI44444444444444class java.lang.String4444444444444JAVASTRINGSLITUGNIRTSARRAYLISTARRAYLISTAVAJ.GNALARRAYLISTARRAYLISTARRAYLI44444444444444class java.lang.String", "interf ce j v  l ng Clone ble interf ce j v  io Seri liz ble", 97);
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.stripAll(strArray3);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertNotNull(strArray4);
    }

    @Test
    public void test40404() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest80.test40404");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripToEmpty("se...               ...");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "se...               ..." + "'", str1, "se...               ...");
    }

    @Test
    public void test40405() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest80.test40405");
        int int3 = org.apache.commons.lang3.StringUtils.indexOf("AVAJgnalArrayListArrayListArrayListavaj", 380, 384);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test40406() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest80.test40406");
        int int3 = org.apache.commons.lang3.StringUtils.indexOf("                                            .", 416, (int) '#');
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test40407() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest80.test40407");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.reverseDelimited("yli", ' ');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "yli" + "'", str2, "yli");
    }

    @Test
    public void test40408() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest80.test40408");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("                                                                                                                                                                                                                             aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa                                                                                                                                                                                                                             ");
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test40409() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest80.test40409");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.substringsBetween("ja", "javaaaaaaaaaava.langava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjav", "...stg.JAVA.L$ArrayListg.JAVA.L$ArrayListg.JAVA.L$ArrayListg.JAVA.L$ArrayListg.JAVA.L$ArrayListg.JAVA.L$ArrayListg.JAVA.L$ArrayListg.JAVA.L$ArrayListg.JAVA.L$ArrayListg.JAVA.L$ArrayListg.JAVA.L$ArrayListg.JAVA.L$Ar...");
        org.junit.Assert.assertNull(strArray3);
    }

    @Test
    public void test40410() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest80.test40410");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.chomp("44444444444444444444-1java444444444444444444444");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "44444444444444444444-1java444444444444444444444" + "'", str1, "44444444444444444444-1java444444444444444444444");
    }

    @Test
    public void test40411() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest80.test40411");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.split("avaj.gnalavaj.gnalavaj.gnal", "...$$$$$$$$$$$$$$$..gn                                            gn      tavaj.gnalarraylistarraylistarraylign      ", 150);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str7 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray3, '4', 84, 358);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 84");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void test40412() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest80.test40412");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.swapCase("$$$$$$$$$$$$$$$$$$$$44444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444Character");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "$$$$$$$$$$$$$$$$$$$$44444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444cHARACTER" + "'", str1, "$$$$$$$$$$$$$$$$$$$$44444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444cHARACTER");
    }

    @Test
    public void test40413() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest80.test40413");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitByCharacterTypeCamelCase("AGNaaaaaaaaaaJAARRAYLISTARRAYLISTARRAYLISTAVAJ");
        java.lang.Class<?> wildcardClass2 = strArray1.getClass();
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test40414() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest80.test40414");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOf("                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                             ", "              $Integer$              ", 158);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test40415() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest80.test40415");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.startsWithIgnoreCase("jLvL#LtNGngnLl#ANNLy#LGst#ANNLy#LGst#ANNLy#LGstLvLj#.#gnLl#ANNLy#LGst#ANNLy#LGst#ANNLy#LG", "                                                      #############################################");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test40416() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest80.test40416");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.remove("ssal$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$rrayList$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$C                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                             ", "hi!ArrayListArrayListArrayListavaj.... AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA... AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA... AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA... AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA... AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA... AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA... AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA... AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA... AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA... AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "ssal$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$rrayList$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$C                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                             " + "'", str2, "ssal$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$rrayList$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$C                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                             ");
    }

    @Test
    public void test40417() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest80.test40417");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.split("GNAL.AVAJGNAL.AVAJGNAL.AVAJGNAL.AVAJGNAL.AVAJGNAL.AVAJGNAL.AVAJ", '$');
        java.lang.String[] strArray6 = org.apache.commons.lang3.StringUtils.split("                                    caf...", '#');
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray6, ' ');
        java.lang.String str9 = org.apache.commons.lang3.StringUtils.replaceEach("                                                            ", strArray3, strArray6);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "                                    caf..." + "'", str8, "                                    caf...");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "                                                            " + "'", str9, "                                                            ");
    }

    @Test
    public void test40418() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest80.test40418");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphanumeric((java.lang.CharSequence) "javaaaaaaaaaava.langava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjav");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test40419() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest80.test40419");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNumericSpace((java.lang.CharSequence) "AAAAAAAAAAAAAAAAAAAAAAAAA...1AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA...1AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA...1AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA...1AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA...1AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA...1AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test40420() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest80.test40420");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isWhitespace((java.lang.CharSequence) "                                                    ...    ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test40421() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest80.test40421");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAllLowerCase((java.lang.CharSequence) "$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test40422() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest80.test40422");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.abbreviate("...............................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................", 145);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "................................................................................................................................................." + "'", str2, ".................................................................................................................................................");
    }

    @Test
    public void test40423() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest80.test40423");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.chop("..........................................................................................                                                                                                            ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "..........................................................................................                                                                                                           " + "'", str1, "..........................................................................................                                                                                                           ");
    }

    @Test
    public void test40424() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest80.test40424");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.contains("JavajGNALavaaaaaaaaaavaavajGNAL.avajGNALlangavaavajGNAL.avajGNALlangjavaavajGNAL.avajGNALlangjavaavajGNAL.avajGNALlangjavaavajGNAL.avajGNALlangjavaavajGNAL.avajGNALlangjavaavajGNAL.avajGNALlangjavaavajGNAL.avajGNALlangjavaavajGNAL.avajGNALlangjavaavajGNAL.avajGNALlangjavaavajGNAL.avajGNALlangjavaavajGNAL.avajGNALlangjavaavajGNAL.avajGNALlangjavaavajGNAL.avajGNALlangjavaavajGNAL.avajGNALlangjavaavajGNAL.avajGNALlanARR.AVALITU.AAAAAAAAAAAAAAAAAAAAAAAAAAAAAA... AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA", "gnaljava..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java.........");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test40425() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest80.test40425");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.strip("$$$$$$$$$$$$$$$$$$$$$$$$$$$$$");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "$$$$$$$$$$$$$$$$$$$$$$$$$$$$$" + "'", str1, "$$$$$$$$$$$$$$$$$$$$$$$$$$$$$");
    }

    @Test
    public void test40426() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest80.test40426");
        int int1 = org.apache.commons.lang3.StringUtils.length((java.lang.CharSequence) ".O.E.GN.L.................................................................................................CHARACTERCHARACTERCHARACTERCHARACTERCHARACTERCHARACTERCHARACTERCHARACTERCHARACTERCHARACTERCHARACTERCHARACTERCHARACTERCHARACTERCHARACTERCHARACTERCHARACTERCHARACTERCHARACTERCHARACTERCHARACTERCHARACTERCHARACTERCHARACTERCHARACTERCHARACTERCHARACTERCHARACTERCHARACTERCHARACTERCHARACTERCHARACTERCHARACTERCHARACTERCHARACTERCHARACTERCHARACTERCHARACTERCHARACTERCHARACTERCHARACTERCHARACTERCHARACTERCHARACTERCHARACTERCHARACTERCHARACTERCHARACTERCHARACTERCHARACTERCHARACTERCHARACTERCHARACTERCHARACTERCHARACTERCHARACTERCHARACTERCHARACTERCHARACTERCHARACTERCHARACTERCHARACTERCHARA");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 669 + "'", int1 == 669);
    }

    @Test
    public void test40427() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest80.test40427");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$#", "gn gnal.avajgn gnal.avajgn gnal.avajgn gnal.avajgn gnal.avajgn gnal.avajgn gnal.avajgn gnal.avajgn gnal.avajgn gnal.avajgn gnal.avajgn gnal.avajgn gnal.avajgn gnal.avajgn gnal.avajgn gnal.avaj", 905);
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void test40428() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest80.test40428");
        java.lang.CharSequence charSequence3 = null;
        char[] charArray16 = new char[] { ' ', ' ', '#', 'a', '4', 'a' };
        int int17 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "", charArray16);
        boolean boolean18 = org.apache.commons.lang3.StringUtils.containsAny("$", charArray16);
        int int19 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "", charArray16);
        boolean boolean20 = org.apache.commons.lang3.StringUtils.containsAny("$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$", charArray16);
        boolean boolean21 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "Integer", charArray16);
        boolean boolean22 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "gnaljava..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java.........", charArray16);
        boolean boolean23 = org.apache.commons.lang3.StringUtils.containsNone(charSequence3, charArray16);
        boolean boolean24 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "AtsiLytcejbO.gnal.avaj ssalcrrAtsiLytcejbO.gnal.avaj ssalcrrAva.langGNAL..langjava.langAGNAL.AVAJ", charArray16);
        boolean boolean25 = org.apache.commons.lang3.StringUtils.containsAny("", charArray16);
        boolean boolean26 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "classjava.util.AbstractListgnluvj....................................................................classjava.util.AbstractCollectiongnluvj....................................................................classjava.lang.Object", charArray16);
        org.junit.Assert.assertNotNull(charArray16);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray16), "  #a4a");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray16), "  #a4a");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray16), "[ ,  , #, a, 4, a]");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
    }

    @Test
    public void test40429() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest80.test40429");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.defaultString("44444444444444444.4...");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "44444444444444444.4..." + "'", str1, "44444444444444444.4...");
    }

    @Test
    public void test40430() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest80.test40430");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.substringBetween("                                               EGETNI                                              ", "##############################################################################################################################################################################################################################################################################################################################################Stringc##############################################################################################################################################################################################################################################################################################################################################", "");
        org.junit.Assert.assertNull(str3);
    }

    @Test
    public void test40431() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest80.test40431");
        char[] charArray6 = new char[] {};
        int int7 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "$       ", charArray6);
        boolean boolean8 = org.apache.commons.lang3.StringUtils.containsAny("INTERFACE JAVA.LANG.cLONEABLE.......JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVAINTERFACE JAVA.IO.sERIALIZABLE", charArray6);
        boolean boolean9 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "...       AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA", charArray6);
        boolean boolean10 = org.apache.commons.lang3.StringUtils.containsAny("JAVAAAAAAAAAAVA.LA..", charArray6);
        boolean boolean11 = org.apache.commons.lang3.StringUtils.containsAny("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa...", charArray6);
        boolean boolean12 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "hi!Arr...", charArray6);
        org.junit.Assert.assertNotNull(charArray6);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray6), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray6), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray6), "[]");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test40432() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest80.test40432");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.split("$         44444444444444444444444444444444444444444444444444444444444444444444444444444444");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray1);
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "$44444444444444444444444444444444444444444444444444444444444444444444444444444444" + "'", str2, "$44444444444444444444444444444444444444444444444444444444444444444444444444444444");
    }

    @Test
    public void test40433() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest80.test40433");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.uncapitalize((java.lang.CharSequence) "############44444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "############44444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444" + "'", str1, "############44444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444");
    }

    @Test
    public void test40434() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest80.test40434");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.contains("gnal.avaj", "saylavv");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test40435() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest80.test40435");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlpha((java.lang.CharSequence) "44444444444444444.44444444444444444");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test40436() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest80.test40436");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.chomp("tsiyarr.a.lantsiyarr.a.lantsiyarr.a.lantsiyarr.a.lantsiyarr.a.lantsiyarr.a.lantsiyarr.a.lantsiyarr.asaylavvsaylavvsaylavvsaylavvsaylavvsaylavvsaylavvsaylavvsaylavvsaylavvsaylavvsaylavvsaylavvsaylavvsaylavvsaylavvsaylavvsaylavvsaylavvsaylavvsaylavvsaylavvsaylavvsaylavvsaylavvsaylavvsaylavvsaylavvsaylavvsaylavvsaylavvsaylavvsaylavvsaylavvsaylavvsaylavvsaylavvsaylavvsaylavvsaylavvsaylavvsaylavvsaylavvsaylavvsaylavvsaylavvsaylavvsaylavvsaylavvsaylavvsaylavvsaylavvsaylavvsaylavvsaylavvsaylavvs");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "tsiyarr.a.lantsiyarr.a.lantsiyarr.a.lantsiyarr.a.lantsiyarr.a.lantsiyarr.a.lantsiyarr.a.lantsiyarr.asaylavvsaylavvsaylavvsaylavvsaylavvsaylavvsaylavvsaylavvsaylavvsaylavvsaylavvsaylavvsaylavvsaylavvsaylavvsaylavvsaylavvsaylavvsaylavvsaylavvsaylavvsaylavvsaylavvsaylavvsaylavvsaylavvsaylavvsaylavvsaylavvsaylavvsaylavvsaylavvsaylavvsaylavvsaylavvsaylavvsaylavvsaylavvsaylavvsaylavvsaylavvsaylavvsaylavvsaylavvsaylavvsaylavvsaylavvsaylavvsaylavvsaylavvsaylavvsaylavvsaylavvsaylavvsaylavvsaylavvs" + "'", str1, "tsiyarr.a.lantsiyarr.a.lantsiyarr.a.lantsiyarr.a.lantsiyarr.a.lantsiyarr.a.lantsiyarr.a.lantsiyarr.asaylavvsaylavvsaylavvsaylavvsaylavvsaylavvsaylavvsaylavvsaylavvsaylavvsaylavvsaylavvsaylavvsaylavvsaylavvsaylavvsaylavvsaylavvsaylavvsaylavvsaylavvsaylavvsaylavvsaylavvsaylavvsaylavvsaylavvsaylavvsaylavvsaylavvsaylavvsaylavvsaylavvsaylavvsaylavvsaylavvsaylavvsaylavvsaylavvsaylavvsaylavvsaylavvsaylavvsaylavvsaylavvsaylavvsaylavvsaylavvsaylavvsaylavvsaylavvsaylavvsaylavvsaylavvsaylavvsaylavvs");
    }

    @Test
    public void test40437() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest80.test40437");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.mid("interface java.lang.CloneableAvaj.gnalinterface java.io.Serializable", 629, 72);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test40438() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest80.test40438");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.startsWithIgnoreCase("interface java.lang.Cloneable.......java.......Objectava..........javainterface java.io.Serializable##################################################", "va.langGNAL..la..");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test40439() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest80.test40439");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("avaj.###########################################################################################################################################gn gnal", "CLASSJAVALANGCLASSJAVAULANGJAVAULANGJAVAULANGJAVAULANGJAVAULANGJAVAULANGJAVAULANGJAVAULANGJAVAULANGJAVAULANGJAVAULANGJAVAULANGJAVAULANGJAVAULANGJAVAULANGJAVAULANGJAVAULANGJAVAULANGJAVAULANGJAVAULANG");
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test40440() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest80.test40440");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.rightPad("", 219, "                                                                  litu                                                                 ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "                                                                  litu                                                                                                                                   litu              " + "'", str3, "                                                                  litu                                                                                                                                   litu              ");
    }

    @Test
    public void test40441() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest80.test40441");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNumeric((java.lang.CharSequence) "arrtsclassjava.lang");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test40442() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest80.test40442");
        int int2 = org.apache.commons.lang3.StringUtils.indexOf("$         44444444444444444444444444444444444444444444444444444444444444444444444444444444                                                                                                                                                                                                                                                                                                                                                                                                            ", 210);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test40443() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest80.test40443");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeEnd("           a                                a ", "      AAAAAAAAAAAAAAAAAAA...");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "           a                                a " + "'", str2, "           a                                a ");
    }

    @Test
    public void test40444() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest80.test40444");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isEmpty((java.lang.CharSequence) "       java..........java..........java...                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                  ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test40445() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest80.test40445");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.remove("Seria", '.');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Seria" + "'", str2, "Seria");
    }

    @Test
    public void test40446() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest80.test40446");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.startsWith("interfacegaga.lang.cloneableaaaaaaaaaagagal.agnaaaaaaaaaagagal.agnaaaaaaaaaagagal.agnaaaaaaaaaagagal.agnaaaaaaaaaagagal.agnaaaaaaaaaagagal.agnaaaaaaaaaagagal.agnaaaaaaaaaagagal.agnaaaaaaaaaagagal.agnaaaaaaaaaagagal.agnaaaaaaaaaagagal.agnaaaaaaaaaagagal.agnaaaaaaaaaagagal.agnaaaaaaaaaagagal.agnaaaaaaaaaagagal.agnaaaaaaaaaagagal.agnaaaaaaaaaagagal.agnaaaaaaaaaagagal.agnaaaaaaaaaagagal.agnaaaaaaaaaagagal.agnaaaaaaaaaagagal.agnaaaaaaaaaagagal.agnaaaaaaaaaagagal.agnaaaaaaaaaagagal.agnaaaaaaaaaagagal.agnaaaaaaaaaagagal.agnaaaaaaaaaagagal.agnaaaaaaaaaagagal.agnaaaaaaaaaagagal.agnaaaaaaaaaagagal.agnaaaaaaaaaagagal.agnaaaaaaaaaagagal.agnaaaaaaaaaagagal.agnaaaaaaaaaagagal.agnaaaaaaaaaagagal.agnaaaaaaaaaaringinterfacegaga.io", "                                                                      ...");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test40447() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest80.test40447");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass1 = org.apache.commons.lang3.ClassUtils.getClass("                                   ");
            org.junit.Assert.fail("Expected exception of type java.lang.ClassNotFoundException; message: ");
        } catch (java.lang.ClassNotFoundException e) {
            // Expected exception.
        }
    }

    @Test
    public void test40448() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest80.test40448");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.stripEnd("interfacejava.lang.Cloneable#interfacejava.iointerfacejava.lang.Cloneable#interfacejava.ioinTU                    ", "ONEABLE#INTERFACEJAVA");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "interfacejava.lang.Cloneable#interfacejava.iointerfacejava.lang.Cloneable#interfacejava.ioinTU                    " + "'", str2, "interfacejava.lang.Cloneable#interfacejava.iointerfacejava.lang.Cloneable#interfacejava.ioinTU                    ");
    }

    @Test
    public void test40449() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest80.test40449");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfIgnoreCase("gnirtS.ge", "AVAJ.GNALNaaaaaaaaaaJAVAL.AGNaaaaaaaaaaJAVAL.AGNaaaaaaaaaaJAVAL.AGNaaaaaaaaaaJAVAL.AGNaaaaaaaaaaJ");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test40450() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest80.test40450");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.center("rrclass javalangObjectys", 358, "#                                                                                                                                                      ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "#                                                                                                                                                      #               rrclass javalangObjectys#                                                                                                                                                      #               " + "'", str3, "#                                                                                                                                                      #               rrclass javalangObjectys#                                                                                                                                                      #               ");
    }

    @Test
    public void test40451() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest80.test40451");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphanumeric((java.lang.CharSequence) "FAVAJ.GNALAVA$$$.JAVA$$$.JAVA$$$.JAVA$$$.JAVA$$$.$$$$$$$$$$$$$$$$$$$$$$$$$$$$$...$$$$$$$$$$$$$$$$$$$$$$$$$$$$$...$$$$$$$$$$$$$$$$$$$$$$$$$$$$$...$$$.JAVA$$$.JAVA$$$.JAVA$$$.JAVA$$$.JAVA$$$.JAVA$$$.JAVA$$$.JAVA$$$.JAVA$$$.JAVA$$$.JAVA$$$.JAVA$$$.JAVA$$$.JAVA$$$.JAVA$$$.JAVA$$$.JAVA$$$.JAVA$$$.JAVA$$$.JAVA$$$.JAVA$$$.JAVA$$$.JAVA$$$.JAVA$$$.JAVAINTERFACEJAVA.IO.SERIALIZABLE");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test40452() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest80.test40452");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.right("... ... ... ... ... ... ... ... ... ... ", 735);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "... ... ... ... ... ... ... ... ... ... " + "'", str2, "... ... ... ... ... ... ... ... ... ... ");
    }

    @Test
    public void test40453() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest80.test40453");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("..........a       ..");
        java.lang.Class<?>[] wildcardClassArray2 = org.apache.commons.lang3.ClassUtils.toClass((java.lang.Object[]) strArray1);
        java.lang.Class<?>[] wildcardClassArray3 = org.apache.commons.lang3.ClassUtils.primitivesToWrappers(wildcardClassArray2);
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertNotNull(wildcardClassArray2);
        org.junit.Assert.assertNotNull(wildcardClassArray3);
    }

    @Test
    public void test40454() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest80.test40454");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.split("$       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       ", 'a');
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test40455() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest80.test40455");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.split("                                                                                                                                                                                                                                                                                                                               44444444444444444444444444444444444444444444444]TU44444444444444444444444444444444444444444444444                                                                                                                                                                                                                                                                                                                               ", ' ');
        java.lang.String str4 = org.apache.commons.lang3.ClassUtils.getPackageCanonicalName((java.lang.Object) "                                                                                                                                                                                                                                                                                                                               44444444444444444444444444444444444444444444444]TU44444444444444444444444444444444444444444444444                                                                                                                                                                                                                                                                                                                               ", "AVAJ.GNALAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAIRFCO$IRFIOSRA..AYL A.444444444444444444444444444");
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "java.lang" + "'", str4, "java.lang");
    }

    @Test
    public void test40456() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest80.test40456");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.abbreviate("A..........JAVA..........JAVA..........JAVA..........JAVA.........", 663, 151);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "A..........JAVA..........JAVA..........JAVA..........JAVA........." + "'", str3, "A..........JAVA..........JAVA..........JAVA..........JAVA.........");
    }

    @Test
    public void test40457() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest80.test40457");
        int int2 = org.apache.commons.lang3.StringUtils.indexOf("clss jv.lng.Stringclss jv.lng.Stringclss jv.lng.Stringclss jv.lng.Stringclss jv.lng.Stringclss jv.lng.Stringclss jv.lng.Stringclss jv.lng.Stringclss jv.lng.Stringclss jv.lng.Stringclss jv.lng.Stringclss jv.lng.Stringclss jv.lng.Stringclss jv.lng.Stringclss jv.lng.Stringclss jv.lng.Stringclss jv.lng.Stringclss jv.lng.Stringclss jv.lng.Stringclss jv.lng.Stringclss jv.lng.Stringclss jv.lng.Stringclss jv.lng.Stringclss jv.lng.Stringclss jv.lng.Stclss jv.lng.Stringclss jv.lng.Stringclss jv.lng.Stringclss jv.lng.Stringclss jv.lng.Stringclss jv.lng.Stringclss jv.lng.Stringclss jv.lng.Stringclss jv.lng.Stringclss jv.lng.Stringclss jv.lng.Stringclss jv.lng.Stringclss jv.lng.Stringclss jv.lng.Stringclss jv.lng.Stringclss jv.lng.Stringclss jv.lng.Stringclss jv.lng.Stringclss jv.lng.Stringclss jv.lng.Stringclss jv.lng.Stringclss jv.lng.Stringclss jv.lng.Stringclss jv.lng.Stringclss jv.lng.Str", 198);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test40458() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest80.test40458");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.rightPad("hi!ArrayListArrayListArrayListavaj....AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA...AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA...AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA...AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA...AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA...AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA...AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA...AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA...AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA...", 81, "slitUgnirtSslitUgnirtSslitUgnirtSslitUgnirtSslitUgnirtSslitUgnirtSslitUgnirtSslitUgnirtSslitUgnirtSslitUgnirt                                ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!ArrayListArrayListArrayListavaj....AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA...AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA...AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA...AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA...AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA...AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA...AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA...AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA...AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA..." + "'", str3, "hi!ArrayListArrayListArrayListavaj....AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA...AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA...AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA...AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA...AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA...AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA...AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA...AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA...AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA...");
    }

    @Test
    public void test40459() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest80.test40459");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.substringsBetween("....JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVAINTERFACEJAVA.IO", "1AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA", "                                                                                                                                                                                                                                                                                                                                                                                                                                                    ..$$$$$$$$$$$$$$$$$$$$$$$$$$$$$.....");
        org.junit.Assert.assertNull(strArray3);
    }

    @Test
    public void test40460() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest80.test40460");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphaSpace((java.lang.CharSequence) "                                ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test40461() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest80.test40461");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNotBlank((java.lang.CharSequence) "                                                                                                                                                                                                                                                                              ArrayListArrayListArrayListavajagnal                                                                                                                                                                                                                                                                              ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test40462() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest80.test40462");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.swapCase("AaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaIT.ITaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "aAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAit.itAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA" + "'", str1, "aAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAit.itAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA");
    }

    @Test
    public void test40463() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest80.test40463");
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("NTERFACEJAVA.LANG.cLONEABLE.......JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVAINTERFACEJAVA", "classjavalaiNTERFACE JAVA$LANG$cLONEABLE$$$$$$$JAVA$$$$$$$$$$JAVA$$$$$$$$$$JAVA$$$$$$$$$$JAVA$$$$$$$$$$JAVA$$$$$$$$$$JAVA$$$$$$$$$$JAVA$$$$$$$$$$JAVA$$$$$$$$$$JAVA$$$$$$$$$$JAVALANGJAVAULANGJAVAULANGJAVAULANGJAVAULANGJAVAULANGJAVAULANGJAVAULANGJAVAULANGJAVAULANGJAVAULANGJAVAULANGJAVAULANGJAVAULANGJAVAULANGJAVAULANGJAVAULANGJAVAULANGJAVAULANGJAVAULANG", 264);
        boolean boolean5 = org.apache.commons.lang3.StringUtils.endsWithAny("rrayLirrayLirrayLirrayLirrayLirrayLirrayLirrayLirrayLirrayLirrayLirrayLirrayLirrayLirrayLirrayLirrayLirrayLirrayLirrayLirrayLirrayLirrayLirrayLirrayLirrayLirrayLirrayLirrayLirrayLirrayLirrayLirrayLirrayLirrayLirrayLirrayLirrayLirrayLirrayLirrayLirrayLirrayLirrayLirrayLirrayLirrayLirrayLirrayLirrayLirrayLirrayLi", strArray4);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test40464() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest80.test40464");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBetween("jAVAJAVAJAVAJAVAJAVAJAVAJAVAJAVAJAVAJAVAJAVAJAVAJAVAJAVAJAVAJAVAJAVAJAVAJAVAJAVAJAVAJAVAJAVAJAVAJAVAJAVAJAVAJAVAJAVAJAVAJAVAJAVAJAVAJAVA", "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                             4444444.44444444");
        org.junit.Assert.assertNull(str2);
    }

    @Test
    public void test40465() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest80.test40465");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.swapCase("istArrayListArrayListavaj.gnalArrayListArrayListArrayLi                        ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "ISTaRRAYlISTaRRAYlISTAVAJ.GNALaRRAYlISTaRRAYlISTaRRAYlI                        " + "'", str1, "ISTaRRAYlISTaRRAYlISTAVAJ.GNALaRRAYlISTaRRAYlISTaRRAYlI                        ");
    }

    @Test
    public void test40466() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest80.test40466");
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.split("interface#java#lang#cloneablestringinterface#java#io", "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                             ", 525);
        int int5 = org.apache.commons.lang3.StringUtils.indexOfAny("$         $         $         $         $         $         $         $         $         $         $         $         $         $         $         $         $         $         $         $         $         $         $       SILYARRA!IH", strArray4);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
    }

    @Test
    public void test40467() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest80.test40467");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphanumericSpace((java.lang.CharSequence) "cLASS");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test40468() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest80.test40468");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphanumericSpace((java.lang.CharSequence) "                                                                                                                                                                                                                                                                            utiljava.util444444444444444444444444444444444444444444444444444444444444444444444444444444444ELBAZILAIREs.OI.AVAJ ECAFRETNIGNIRTsELBAENOLc.GNAL.AVAJ ECAFRETNI44444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test40469() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest80.test40469");
        char[] charArray12 = new char[] { ' ', ' ', '#', 'a', '4', 'a' };
        int int13 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "", charArray12);
        boolean boolean14 = org.apache.commons.lang3.StringUtils.containsAny("$", charArray12);
        int int15 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "", charArray12);
        int int16 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "gn gnal.avaj", charArray12);
        boolean boolean17 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "-1JAVA.UTILSTRING[]", charArray12);
        int int18 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "rayListArrayListavaj.gnal                                                                ", charArray12);
        org.junit.Assert.assertNotNull(charArray12);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray12), "  #a4a");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray12), "  #a4a");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray12), "[ ,  , #, a, 4, a]");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 2 + "'", int16 == 2);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
    }

    @Test
    public void test40470() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest80.test40470");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.equals((java.lang.CharSequence) "aaaag.aaaa", (java.lang.CharSequence) "itaraaaa aoatatCoaabaaataititaraaaa aoatiotSariaizaba");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test40471() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest80.test40471");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.normalizeSpace("Gnl$JAVA.LANGAgnal.avajgnal..LANGgna");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Gnl$JAVA.LANGAgnal.avajgnal..LANGgna" + "'", str1, "Gnl$JAVA.LANGAgnal.avajgnal..LANGgna");
    }

    @Test
    public void test40472() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest80.test40472");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.endsWith("utiljava.util444444444444444444444444444444444444444444444444444444444444444444444444444444444ELBAZILAIREs.OI.AVAJ ECAFRETNIGNIRTsELBAENOLc.GNAL.AVAJ ECAFRETNI44444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444", "oi.agagecafretnignirAAAAAAAAAAnga.lagagAAAAAAAAAAnga.lagagAAAAAAAAAAnga.lagagAAAAAAAAAAnga.lagagAAAAAAAAAAnga.lagagAAAAAAAAAAnga.lagagAAAAAAAAAAnga.lagagAAAAAAAAAAnga.lagagAAAAAAAAAAnga.lagagAAAAAAAAAAnga.lagagAAAAAAAAAAnga.lagagAAAAAAAAAAnga.lagagAAAAAAAAAAnga.lagagAAAAAAAAAAnga.lagagAAAAAAAAAAnga.lagagAAAAAAAAAAnga.lagagAAAAAAAAAAnga.lagagAAAAAAAAAAnga.lagagAAAAAAAAAAnga.lagagAAAAAAAAAAnga.lagagAAAAAAAAAAnga.lagagAAAAAAAAAAnga.lagagAAAAAAAAAAnga.lagagAAAAAAAAAAnga.lagagAAAAAAAAAAnga.lagagAAAAAAAAAAnga.lagagAAAAAAAAAAnga.lagagAAAAAAAAAAnga.lagagAAAAAAAAAAnga.lagagAAAAAAAAAAnga.lagagAAAAAAAAAAnga.lagagAAAAAAAAAAnga.lagagAAAAAAAAAAnga.lagagAAAAAAAAAAnga.lagagAAAAAAAAAAnga.lagagAAAAAAAAAAelbaenolC.gnal.agagecafretniTRINGUTILSSTRINGUTILSSTRINGUTILSSTRINGUTILSSTRINGUTILSSTRINGUTILSSSALC");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test40473() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest80.test40473");
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
        java.lang.Class[] classArray42 = new java.lang.Class[0];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray43 = (java.lang.Class<?>[]) classArray42;
        java.lang.Class<?>[] wildcardClassArray44 = org.apache.commons.lang3.ClassUtils.primitivesToWrappers(wildcardClassArray43);
        java.lang.Class<?> wildcardClass45 = null;
        java.lang.Class[] classArray47 = new java.lang.Class[1];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray48 = (java.lang.Class<?>[]) classArray47;
        wildcardClassArray48[0] = wildcardClass45;
        java.lang.Class<?>[] wildcardClassArray51 = org.apache.commons.lang3.ClassUtils.primitivesToWrappers(wildcardClassArray48);
        boolean boolean53 = org.apache.commons.lang3.ClassUtils.isAssignable(wildcardClassArray43, wildcardClassArray48, true);
        java.lang.Class<?>[] wildcardClassArray54 = org.apache.commons.lang3.ClassUtils.wrappersToPrimitives(wildcardClassArray43);
        java.lang.Class<?>[] wildcardClassArray55 = org.apache.commons.lang3.ClassUtils.primitivesToWrappers(wildcardClassArray43);
        java.lang.Class<?>[] wildcardClassArray56 = org.apache.commons.lang3.ClassUtils.primitivesToWrappers(wildcardClassArray43);
        java.lang.Class<?>[] wildcardClassArray57 = org.apache.commons.lang3.ClassUtils.wrappersToPrimitives(wildcardClassArray56);
        boolean boolean58 = org.apache.commons.lang3.ClassUtils.isAssignable(wildcardClassArray37, wildcardClassArray56);
        java.lang.Class<?>[] wildcardClassArray59 = org.apache.commons.lang3.ClassUtils.primitivesToWrappers(wildcardClassArray37);
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
        org.junit.Assert.assertNotNull(classArray42);
        org.junit.Assert.assertNotNull(wildcardClassArray43);
        org.junit.Assert.assertNotNull(wildcardClassArray44);
        org.junit.Assert.assertNotNull(classArray47);
        org.junit.Assert.assertNotNull(wildcardClassArray48);
        org.junit.Assert.assertNotNull(wildcardClassArray51);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
        org.junit.Assert.assertNotNull(wildcardClassArray54);
        org.junit.Assert.assertNotNull(wildcardClassArray55);
        org.junit.Assert.assertNotNull(wildcardClassArray56);
        org.junit.Assert.assertNotNull(wildcardClassArray57);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + false + "'", boolean58 == false);
        org.junit.Assert.assertNotNull(wildcardClassArray59);
    }

    @Test
    public void test40474() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest80.test40474");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("", "java.util");
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.concat((java.lang.Object[]) strArray3);
        java.lang.String[] strArray7 = org.apache.commons.lang3.StringUtils.split("....................................................................                       javaulang", 'a');
        java.lang.String[] strArray8 = org.apache.commons.lang3.StringUtils.stripAll(strArray7);
        java.lang.String str9 = org.apache.commons.lang3.StringUtils.replaceEach("gnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalLANGLANGLANGLANGLANGLANGLlituava                     ", strArray3, strArray8);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "gnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalLANGLANGLANGLANGLANGLANGLlituava                     " + "'", str9, "gnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalLANGLANGLANGLANGLANGLANGLlituava                     ");
    }

    @Test
    public void test40475() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest80.test40475");
        java.lang.ClassLoader classLoader0 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass3 = org.apache.commons.lang3.ClassUtils.getClass(classLoader0, "ayL A    ", false);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassNotFoundException; message: ayLA");
        } catch (java.lang.ClassNotFoundException e) {
            // Expected exception.
        }
    }

    @Test
    public void test40476() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest80.test40476");
        int int1 = org.apache.commons.lang3.StringUtils.length((java.lang.CharSequence) "LITU.AVAJ....................................................................$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$Gnal$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$                       $$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$Gnal$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$javaulang...................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1000 + "'", int1 == 1000);
    }

    @Test
    public void test40477() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest80.test40477");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.strip("arra", "stJAVAGNAL                                                           ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "arra" + "'", str2, "arra");
    }

    @Test
    public void test40478() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest80.test40478");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass1 = org.apache.commons.lang3.ClassUtils.getClass("...                                ");
            org.junit.Assert.fail("Expected exception of type java.lang.ClassNotFoundException; message: ///");
        } catch (java.lang.ClassNotFoundException e) {
            // Expected exception.
        }
    }

    @Test
    public void test40479() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest80.test40479");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfAnyBut("interface gaga.lang.CloneableAAAAAAAAAAgagal.agnAAAAAAAAAAgagal.agnAAAAAAAAAAgagal.agnAAAAAAAAAAgagal.agnAAAAAAAAAAgagal.agnAAAAAAAAAAgagal.agnAAAAAAAAAAgagal.agnAAAAAAAAAAgagal.agnAAAAAAAAAAgagal.agnAAAAAAAAAAgagal.agnAAAAAAAAAAgagal.agnAAAAAAAAAAgagal.agnAAAAAAAAAAgagal.agnAAAAAAAAAAgagal.agnAAAAAAAAAAgagal.agnAAAAAAAAAAgagal.agnAAAAAAAAAAgagal.agnAAAAAAAAAAgagal.agnAAAAAAAAAAgagal.agnAAAAAAAAAAgagal.agnAAAAAAAAAAgagal.agnAAAAAAAAAAgagal.agnAAAAAAAAAAgagal.agnAAAAAAAAAAgagal.agnAAAAAAAAAAgagal.agnAAAAAAAAAAgagal.agnAAAAAAAAAAgagal.agnAAAAAAAAAAgagal.agnAAAAAAAAAAgagal.agnAAAAAAAAAAgagal.agnAAAAAAAAAAgagal.agnAAAAAAAAAAgagal.agnAAAAAAAAAAgagal.agnAAAAAAAAAAgagal.agnAAAAAAAAAAgagal.agnAAAAAAAAAAringinterface gaga.io.Serializable", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa...aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test40480() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest80.test40480");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfAnyBut("##########################################################################Byte###########################################################################", "....................................................................................................................................................................jvstringnlrrylistrrylistrrylistv..............................................................................................................................................................................................................................................................");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test40481() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest80.test40481");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripToEmpty("LANGaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa44444444444444444444444444...");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "LANGaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa44444444444444444444444444..." + "'", str1, "LANGaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa44444444444444444444444444...");
    }

    @Test
    public void test40482() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest80.test40482");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.substringsBetween("interface java.lang.Cloneable...                                 interface java.io.Serializable", "4444444444444444444444444444444444444444444444gnal", "       aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa......................................................................................................................................................................................................................................................................................................................................................................................................................................");
        org.junit.Assert.assertNull(strArray3);
    }

    @Test
    public void test40483() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest80.test40483");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfIgnoreCase("$$$$$$$$$$$$$$$$$$$$44444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444cHARACTER", "   A..iyL A    ");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test40484() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest80.test40484");
        java.lang.String str1 = org.apache.commons.lang3.ClassUtils.getPackageName(".######################################################################");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
    }

    @Test
    public void test40485() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest80.test40485");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.defaultString("sTRING");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "sTRING" + "'", str1, "sTRING");
    }

    @Test
    public void test40486() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest80.test40486");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOfIgnoreCase("ULANGrrVyList", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaIT.ITaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaclass j...");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test40487() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest80.test40487");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.abbreviateMiddle("sTRINGuTILS", "4444444444444Ch.r.cter4444444444444utilStr", 13);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "sTRINGuTILS" + "'", str3, "sTRINGuTILS");
    }

    @Test
    public void test40488() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest80.test40488");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.contains("JAVAGNAL                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                     JAVA.LANG.CLONEABLE...                                 INTERFACE JAVA.IO.SERIALIZABLE", 570);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test40489() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest80.test40489");
        int int3 = org.apache.commons.lang3.StringUtils.indexOf("JV$.$LNG444444444444444444444444444444444444444444444444444444", 675, 487);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test40490() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest80.test40490");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.normalizeSpace(".......                                                                                                                                                                                                                             va.langGNAL..la..                                                                                                                                                                                                                              ......................................javaulang....................................................................................................................................................");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "....... va.langGNAL..la.. ......................................javaulang...................................................................................................................................................." + "'", str1, "....... va.langGNAL..la.. ......................................javaulang....................................................................................................................................................");
    }

    @Test
    public void test40491() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest80.test40491");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.stripStart("cterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterChar", "                       javaulangrraylist");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "cterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterChar" + "'", str2, "cterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterChar");
    }

    @Test
    public void test40492() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest80.test40492");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.rightPad("                                                                                                                                                                                                                                   gnal.avajgnal..LANGgnal                                                                                                                                                                                                                                   ", 0, '.');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "                                                                                                                                                                                                                                   gnal.avajgnal..LANGgnal                                                                                                                                                                                                                                   " + "'", str3, "                                                                                                                                                                                                                                   gnal.avajgnal..LANGgnal                                                                                                                                                                                                                                   ");
    }

    @Test
    public void test40493() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest80.test40493");
        java.lang.Class<?> wildcardClass0 = null;
        java.lang.Class[] classArray2 = new java.lang.Class[1];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray3 = (java.lang.Class<?>[]) classArray2;
        wildcardClassArray3[0] = wildcardClass0;
        java.lang.Class<?>[] wildcardClassArray6 = org.apache.commons.lang3.ClassUtils.primitivesToWrappers(wildcardClassArray3);
        java.lang.String[] strArray8 = new java.lang.String[] { "                                   " };
        java.lang.String str9 = org.apache.commons.lang3.StringUtils.getCommonPrefix(strArray8);
        java.lang.Class<?>[] wildcardClassArray10 = org.apache.commons.lang3.ClassUtils.toClass((java.lang.Object[]) strArray8);
        java.lang.Class<?> wildcardClass11 = null;
        java.lang.Class[] classArray13 = new java.lang.Class[1];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray14 = (java.lang.Class<?>[]) classArray13;
        wildcardClassArray14[0] = wildcardClass11;
        java.lang.Class<?>[] wildcardClassArray17 = org.apache.commons.lang3.ClassUtils.primitivesToWrappers(wildcardClassArray14);
        boolean boolean18 = org.apache.commons.lang3.ClassUtils.isAssignable(wildcardClassArray10, wildcardClassArray14);
        boolean boolean20 = org.apache.commons.lang3.ClassUtils.isAssignable(wildcardClassArray3, wildcardClassArray14, true);
        java.lang.Class<?>[] wildcardClassArray21 = org.apache.commons.lang3.ClassUtils.primitivesToWrappers(wildcardClassArray3);
        java.lang.String str23 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) wildcardClassArray21, ' ');
        java.lang.Class<?>[] wildcardClassArray24 = org.apache.commons.lang3.ClassUtils.primitivesToWrappers(wildcardClassArray21);
        org.junit.Assert.assertNotNull(classArray2);
        org.junit.Assert.assertNotNull(wildcardClassArray3);
        org.junit.Assert.assertNotNull(wildcardClassArray6);
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "                                   " + "'", str9, "                                   ");
        org.junit.Assert.assertNotNull(wildcardClassArray10);
        org.junit.Assert.assertNotNull(classArray13);
        org.junit.Assert.assertNotNull(wildcardClassArray14);
        org.junit.Assert.assertNotNull(wildcardClassArray17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(wildcardClassArray21);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertNotNull(wildcardClassArray24);
    }

    @Test
    public void test40494() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest80.test40494");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.split(".ava", "aRRAYlISTaRRAYlISTaRRAYlIST");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray2);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + ".v" + "'", str3, ".v");
    }

    @Test
    public void test40495() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest80.test40495");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.split("interface java.lang.cloneable", 'a');
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray2, "Serializable");
        java.lang.String str6 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray2, "INTERFACE JAVA.LANG.cLONEABLEsTRING");
        int int7 = org.apache.commons.lang3.StringUtils.indexOfDifference((java.lang.CharSequence[]) strArray2);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "interfSerializablece jSerializablevSerializable.lSerializableng.cloneSerializableble" + "'", str4, "interfSerializablece jSerializablevSerializable.lSerializableng.cloneSerializableble");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "interfINTERFACE JAVA.LANG.cLONEABLEsTRINGce jINTERFACE JAVA.LANG.cLONEABLEsTRINGvINTERFACE JAVA.LANG.cLONEABLEsTRING.lINTERFACE JAVA.LANG.cLONEABLEsTRINGng.cloneINTERFACE JAVA.LANG.cLONEABLEsTRINGble" + "'", str6, "interfINTERFACE JAVA.LANG.cLONEABLEsTRINGce jINTERFACE JAVA.LANG.cLONEABLEsTRINGvINTERFACE JAVA.LANG.cLONEABLEsTRING.lINTERFACE JAVA.LANG.cLONEABLEsTRINGng.cloneINTERFACE JAVA.LANG.cLONEABLEsTRINGble");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test40496() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest80.test40496");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphaSpace((java.lang.CharSequence) "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                             ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test40497() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest80.test40497");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOf("GNAL$.$AVA", "java.lang$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test40498() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest80.test40498");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.split(".......                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                      ", "Arr... aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa... aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa... aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa... aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa... aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa... aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa... aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa... aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa... aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa... aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaylis", 493);
        java.lang.Class<?>[] wildcardClassArray4 = org.apache.commons.lang3.ClassUtils.toClass((java.lang.Object[]) strArray3);
        java.lang.Class<?>[] wildcardClassArray5 = org.apache.commons.lang3.ClassUtils.primitivesToWrappers(wildcardClassArray4);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertNotNull(wildcardClassArray4);
        org.junit.Assert.assertNotNull(wildcardClassArray5);
    }

    @Test
    public void test40499() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest80.test40499");
        java.lang.String str1 = org.apache.commons.lang3.ClassUtils.getShortCanonicalName("GNALUAVAJGNALUAVAJGNALUAVAJGNALUAVAJGNALUAV...");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
    }

    @Test
    public void test40500() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest80.test40500");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripAccents((java.lang.CharSequence) "javastringslitUgnirtSarraylistarraylistavaj");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "javastringslitUgnirtSarraylistarraylistavaj" + "'", str1, "javastringslitUgnirtSarraylistarraylistavaj");
    }
}

