import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest78 {

    public static boolean debug = false;

    @Test
    public void test39001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest78.test39001");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNumericSpace((java.lang.CharSequence) "i");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test39002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest78.test39002");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.split(".44444444444444444444444444444444444444444444444444444444444444444444444444444444", '#');
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test39003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest78.test39003");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsAny("JAVA.IO.sERIALIZABLE JAVA.LANG.cLONEABLEsTRINGINTERFACE INTERFACE############################################", "jvstringnlrrylistrrylistrrylistvj.gnlrrylistrrylistrryli-1jv.utilString-1jv.utilString-1jv.utilString-1jv.utilString-1jv.utilString-1jv.utilString-1jv.utilString-1jv.utilString-1jv.utilString-1jv.utilString-1jv.utilString-1jv.utilString-1jv.utilString-1jv.utilString-1jv.utilString-1jv.utilString-1jv.utilString-1jv.utilString-1jv.utilString-1jv.utilString-1jv.utilString-1jv.utilString-1jv.utilString-1jv.utilString-1jv.utilString-1jv.utilString-1jv.utilString-1jv.utilString-1jv.utilString-1jv.utilString-1jv.utilString-1jv.utilString-1jv.utilString-1jv.utilString-1jv.utilString-1jv.utilString-1jv.utilString-1jv.utilString-1jv.utilString-1jv.utilString-1jv.utilString-1jv.utilString-1jv.utilString-1jv.utilString-1jv.utilString-1jv.utilString-1jv.utilString-1jv.utilString-1jv.utilString-1jv.utilString-1jv.utilString-1jv.utilString-1jv.utilString-1jv.utilString-1jv.utilString-1jv.utilString-1jv.utilString-1jv.utilString-1jv.utilString-");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test39004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest78.test39004");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.defaultString("4444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444L.Arr yListaaaaaaaaaaJAVAL.AGNaaaaaaaaaaJAVAL.AGNaaaaaaaaaaJAVAL.AGNaaaaaaaaaaJAVAL.AGNaaaaaaaaaaJAVAL.AGNaaaaaaaaaaJAVAL.AGNaaaaaaaaaaJAVAL.AGNaaaaaaaaaaJAVAL.AGNaaaaaaaaaaJAVAL.AGNaaaaaaaaaaJAVAL.AGNaaaaaaaaaaJAVAL.AGNaaaaaaaaaaJAVAL.AGNaaaaaaaaaaJAVAL.AGNaaaaaaaaaaJAVAL.AGNaaaaaaaaaaJAVAL.AGNaaaaaaaaaaJAVAL.AGNaaaaaaaaaaJAVAL.AGNaaaaaaaaaaJAVAL.AGNaaaaaaaaaaJAVAL.AGNaaaaaaaaaaJAVAL.AGNaaaaaaaaaaJAVAL.AGNaaaaaaaaaaJAVAL.AGNaaaaaaaaaaJAVAL.AGNaaaaaaaaaaJAVAL.AGNaaaaaaaaaaJAVAL.AGNaaaaaaaaaaJAVAL.AGNaaaaaaaaaaJAVAL.AGNaaaaaaaaaaJAVAL.AGNaaaaaaaaaaJAVAL.AGNaaaaaaaaaaJAVAL.AGNaaaaaaaaaaJAVAL.AGNaaaaaaaaaaJAVAL.AGNaaaaaaaaaaJAVAL.AGNaaaaaaaaaaJAVAL.AGNaaaaaaaaaaJAVAL.AGNaaaaaaaaaaJAVAL.AGNaaaaaaaaaaJAVAL.AGNaaaaaaaaaaJAVAL.AGNaaaaaaaaaaJAVAL.AGNaaaaaaaaaaJAVAL.AGNaaaaaaaaaaJAVAL.AGNaaaaaaaaaaJAVAL.A");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "4444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444L.Arr yListaaaaaaaaaaJAVAL.AGNaaaaaaaaaaJAVAL.AGNaaaaaaaaaaJAVAL.AGNaaaaaaaaaaJAVAL.AGNaaaaaaaaaaJAVAL.AGNaaaaaaaaaaJAVAL.AGNaaaaaaaaaaJAVAL.AGNaaaaaaaaaaJAVAL.AGNaaaaaaaaaaJAVAL.AGNaaaaaaaaaaJAVAL.AGNaaaaaaaaaaJAVAL.AGNaaaaaaaaaaJAVAL.AGNaaaaaaaaaaJAVAL.AGNaaaaaaaaaaJAVAL.AGNaaaaaaaaaaJAVAL.AGNaaaaaaaaaaJAVAL.AGNaaaaaaaaaaJAVAL.AGNaaaaaaaaaaJAVAL.AGNaaaaaaaaaaJAVAL.AGNaaaaaaaaaaJAVAL.AGNaaaaaaaaaaJAVAL.AGNaaaaaaaaaaJAVAL.AGNaaaaaaaaaaJAVAL.AGNaaaaaaaaaaJAVAL.AGNaaaaaaaaaaJAVAL.AGNaaaaaaaaaaJAVAL.AGNaaaaaaaaaaJAVAL.AGNaaaaaaaaaaJAVAL.AGNaaaaaaaaaaJAVAL.AGNaaaaaaaaaaJAVAL.AGNaaaaaaaaaaJAVAL.AGNaaaaaaaaaaJAVAL.AGNaaaaaaaaaaJAVAL.AGNaaaaaaaaaaJAVAL.AGNaaaaaaaaaaJAVAL.AGNaaaaaaaaaaJAVAL.AGNaaaaaaaaaaJAVAL.AGNaaaaaaaaaaJAVAL.AGNaaaaaaaaaaJAVAL.AGNaaaaaaaaaaJAVAL.AGNaaaaaaaaaaJAVAL.AGNaaaaaaaaaaJAVAL.A" + "'", str1, "4444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444L.Arr yListaaaaaaaaaaJAVAL.AGNaaaaaaaaaaJAVAL.AGNaaaaaaaaaaJAVAL.AGNaaaaaaaaaaJAVAL.AGNaaaaaaaaaaJAVAL.AGNaaaaaaaaaaJAVAL.AGNaaaaaaaaaaJAVAL.AGNaaaaaaaaaaJAVAL.AGNaaaaaaaaaaJAVAL.AGNaaaaaaaaaaJAVAL.AGNaaaaaaaaaaJAVAL.AGNaaaaaaaaaaJAVAL.AGNaaaaaaaaaaJAVAL.AGNaaaaaaaaaaJAVAL.AGNaaaaaaaaaaJAVAL.AGNaaaaaaaaaaJAVAL.AGNaaaaaaaaaaJAVAL.AGNaaaaaaaaaaJAVAL.AGNaaaaaaaaaaJAVAL.AGNaaaaaaaaaaJAVAL.AGNaaaaaaaaaaJAVAL.AGNaaaaaaaaaaJAVAL.AGNaaaaaaaaaaJAVAL.AGNaaaaaaaaaaJAVAL.AGNaaaaaaaaaaJAVAL.AGNaaaaaaaaaaJAVAL.AGNaaaaaaaaaaJAVAL.AGNaaaaaaaaaaJAVAL.AGNaaaaaaaaaaJAVAL.AGNaaaaaaaaaaJAVAL.AGNaaaaaaaaaaJAVAL.AGNaaaaaaaaaaJAVAL.AGNaaaaaaaaaaJAVAL.AGNaaaaaaaaaaJAVAL.AGNaaaaaaaaaaJAVAL.AGNaaaaaaaaaaJAVAL.AGNaaaaaaaaaaJAVAL.AGNaaaaaaaaaaJAVAL.AGNaaaaaaaaaaJAVAL.AGNaaaaaaaaaaJAVAL.AGNaaaaaaaaaaJAVAL.AGNaaaaaaaaaaJAVAL.A");
    }

    @Test
    public void test39005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest78.test39005");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOfIgnoreCase("ArryLis", "...                              ...");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test39006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest78.test39006");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.defaultString("AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA" + "'", str1, "AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA");
    }

    @Test
    public void test39007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest78.test39007");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replace(".lang.Stringclass j..", "....................................................................................................................................................A..ayL A", "JAVAL.AGNaaaaaaaaaaJAVAL.AGNaaaaaaaaaaJAVAL.AGNaaaaaaaaaaJAVAL.AGNaaaaaaaaaaJAVAL.AGNaaaaaaaaaaJAVAL.AGNaaaaaaaaaaJAVAL.AGNaaaaaaaaaaJAVAL.AGNaaaaaaaaaaJAVAL.AGNaaaaaaaaaaJAVAL.AGNaaaaaaaaaaJAVAL.AGNaaaaaaaaaaJAVAL.AGNaaaaaaaaaaJAVAL.AGNaaaaaaaaaaJAVAL.AGNaaaaaaaaaaJAVAL.AGNaaaaaaaaaaJAVAL.AGNaaaaaaaaaaJAVAL.AGNaaaaaaaaaaJAVAL.AGNaaaaaaaaaaJAVAL.AGNaaaaaaaaaaJAVAL.AGNaaaaaaaaaaJAVAL.AGNaaaaaaaaaaJAVAL.AGNaaaaaaaaaaJAVAL.AGNaaaaaaaaaaJAVAL.AGNaaaaaaaaaaJAVAL.AGNaaaaaaaaaaJAVAL.AGNaaaaaaaaaaJAVAL.AGNaaaaaaaaaaJAVAL.AGNaaaaaaaaaaJAVAL.AGNaaaaaaaaaaJAVAL.AGNaaaaaaaaaaJAVAL.AGNaaaaaaaaaaJAVAL.AGNaaaaaaaaaaJAVAL.AGNaaaaaaaaaaJAVAL");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + ".lang.Stringclass j.." + "'", str3, ".lang.Stringclass j..");
    }

    @Test
    public void test39008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest78.test39008");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringAfterLast("...4444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444...", "JAVAlLANG                                                                                ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test39009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest78.test39009");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.normalizeSpace("aAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA       ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "aAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA" + "'", str1, "aAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA");
    }

    @Test
    public void test39010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest78.test39010");
        java.lang.String[] strArray1 = new java.lang.String[] { "$" };
        java.util.ArrayList<java.lang.String> strList2 = new java.util.ArrayList<java.lang.String>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList2, strArray1);
        java.util.List<java.lang.Class<?>> wildcardClassList4 = org.apache.commons.lang3.ClassUtils.convertClassNamesToClasses((java.util.List<java.lang.String>) strList2);
        java.lang.String str6 = org.apache.commons.lang3.StringUtils.join((java.lang.Iterable<java.lang.Class<?>>) wildcardClassList4, '$');
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.join((java.lang.Iterable<java.lang.Class<?>>) wildcardClassList4, 'a');
        java.lang.String str10 = org.apache.commons.lang3.StringUtils.join((java.lang.Iterable<java.lang.Class<?>>) wildcardClassList4, '#');
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(wildcardClassList4);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void test39011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest78.test39011");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.substringsBetween("         Aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa          ", "classjava.lang", "4444444444444444444444");
        org.junit.Assert.assertNull(strArray3);
    }

    @Test
    public void test39012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest78.test39012");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.substringBetween("zilaireSu.avaj1-", "Jaavaaaaaaaaaavaa.alangavaa.alangjavaa.alangjavaa.alangjavaa.alangjavaa.alangjavaa.alangjavaa.alangjavaa.alangjavaa.alangjavaa.alangjavaa.alangjavaa.alangjavaa.alangjavaa.alangjavaa.alan", "RiYISTeRRiYISTeRRiYISTiiieeRRiYISTeRRiYISTeRRiYISTiiieeRRiYISTeRRiYIS");
        org.junit.Assert.assertNull(str3);
    }

    @Test
    public void test39013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest78.test39013");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.strip("nterface java.lang.Cloneable4iGNIRTinterface java.lang.Cloneable4i");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "nterface java.lang.Cloneable4iGNIRTinterface java.lang.Cloneable4i" + "'", str1, "nterface java.lang.Cloneable4iGNIRTinterface java.lang.Cloneable4i");
    }

    @Test
    public void test39014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest78.test39014");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAllLowerCase((java.lang.CharSequence) "#####################################################");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test39015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest78.test39015");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.center("   AAAAAA...   ", 938);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                AAAAAA...                                                                                                                                                                                                                                                                                                                                                                                                                                                                                 " + "'", str2, "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                AAAAAA...                                                                                                                                                                                                                                                                                                                                                                                                                                                                                 ");
    }

    @Test
    public void test39016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest78.test39016");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.rightPad("Arr... aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa... aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa... aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa... aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa... aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa... aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa... aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa... aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa... aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa... aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaylis", 25, "aa    aaa");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Arr... aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa... aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa... aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa... aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa... aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa... aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa... aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa... aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa... aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa... aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaylis" + "'", str3, "Arr... aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa... aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa... aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa... aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa... aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa... aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa... aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa... aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa... aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa... aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaylis");
    }

    @Test
    public void test39017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest78.test39017");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trim("aaaaaaaaaaaaaaaa$...$$aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "aaaaaaaaaaaaaaaa$...$$aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa" + "'", str1, "aaaaaaaaaaaaaaaa$...$$aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
    }

    @Test
    public void test39018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest78.test39018");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isWhitespace((java.lang.CharSequence) "Vaj");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test39019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest78.test39019");
        java.lang.String[] strArray5 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("...", "                                   ", (int) 'a');
        java.lang.String[] strArray6 = org.apache.commons.lang3.StringUtils.stripAll(strArray5);
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.getCommonPrefix(strArray6);
        int int8 = org.apache.commons.lang3.StringUtils.indexOfAny("interface java.lang.cloneableainterface java.io.serializable", strArray6);
        int int9 = org.apache.commons.lang3.StringUtils.indexOfAny("interface java lang CloneableINTERFACE JAVA LANG CLONEABLELANG GNALJAVA LANGAVAJ GNALJAVA LANGAVAJ GNALJAVA LANGAVAJ GNALJAVA LANGAVAJ GNALJAVA LANGAVAJ GNALJAVA LANGAVAJ GNALJAVA LANGAVAJ GNALJAVA LANGAVAJ JAVAINTERFACE JAVA IO SERIALIZABLEinterface java io Serializable", strArray6);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str13 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray6, '4', 4, 145);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 4");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "..." + "'", str7, "...");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
    }

    @Test
    public void test39020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest78.test39020");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBeforeLast("tSslitUgnirtSslitUgnirtSslitUgnirtSslitUgnirtSaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "HI!aRRAYlISTaRRAYlISTaRRAYlISTAVAJ.GNALaRRAYlISTaRRAYlISTaRRAYlIST");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "tSslitUgnirtSslitUgnirtSslitUgnirtSslitUgnirtSaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa" + "'", str2, "tSslitUgnirtSslitUgnirtSslitUgnirtSslitUgnirtSaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
    }

    @Test
    public void test39021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest78.test39021");
        int int2 = org.apache.commons.lang3.StringUtils.indexOf("NTERFACE JAVA.LANG.cLONEABLE....$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$galaa$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$", 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test39022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest78.test39022");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.strip("                                                                    ", "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                                                    " + "'", str2, "                                                                    ");
    }

    @Test
    public void test39023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest78.test39023");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trim("...java..........java..classjavalangClassJAVAULANGJAVAULANGJAVAULANGJAVAULirtS$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "...java..........java..classjavalangClassJAVAULANGJAVAULANGJAVAULANGJAVAULirtS$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$" + "'", str1, "...java..........java..classjavalangClassJAVAULANGJAVAULANGJAVAULANGJAVAULirtS$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$");
    }

    @Test
    public void test39024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest78.test39024");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOfIgnoreCase("                                                                                                                                                                                                                                                                  GNAL.", "444444444444INTERFACE JAVA.LANG.cLONEABLEsTRINGINTERFACE JAVA.IO.sERIALIZABLE444444444444444444444444444444444444444444444444444444444444444444444444444444444litu.avajlit", 620);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test39025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest78.test39025");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.upperCase("AAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agn");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "AAAAAAAAAAJAVAL.AGNAAAAAAAAAAJAVAL.AGNAAAAAAAAAAJAVAL.AGNAAAAAAAAAAJAVAL.AGNAAAAAAAAAAJAVAL.AGNAAAAAAAAAAJAVAL.AGNAAAAAAAAAAJAVAL.AGNAAAAAAAAAAJAVAL.AGNAAAAAAAAAAJAVAL.AGNAAAAAAAAAAJAVAL.AGNAAAAAAAAAAJAVAL.AGNAAAAAAAAAAJAVAL.AGNAAAAAAAAAAJAVAL.AGNAAAAAAAAAAJAVAL.AGNAAAAAAAAAAJAVAL.AGNAAAAAAAAAAJAVAL.AGNAAAAAAAAAAJAVAL.AGNAAAAAAAAAAJAVAL.AGNAAAAAAAAAAJAVAL.AGNAAAAAAAAAAJAVAL.AGNAAAAAAAAAAJAVAL.AGNAAAAAAAAAAJAVAL.AGNAAAAAAAAAAJAVAL.AGNAAAAAAAAAAJAVAL.AGNAAAAAAAAAAJAVAL.AGNAAAAAAAAAAJAVAL.AGNAAAAAAAAAAJAVAL.AGNAAAAAAAAAAJAVAL.AGNAAAAAAAAAAJAVAL.AGNAAAAAAAAAAJAVAL.AGNAAAAAAAAAAJAVAL.AGNAAAAAAAAAAJAVAL.AGNAAAAAAAAAAJAVAL.AGNAAAAAAAAAAJAVAL.AGNAAAAAAAAAAJAVAL.AGN" + "'", str1, "AAAAAAAAAAJAVAL.AGNAAAAAAAAAAJAVAL.AGNAAAAAAAAAAJAVAL.AGNAAAAAAAAAAJAVAL.AGNAAAAAAAAAAJAVAL.AGNAAAAAAAAAAJAVAL.AGNAAAAAAAAAAJAVAL.AGNAAAAAAAAAAJAVAL.AGNAAAAAAAAAAJAVAL.AGNAAAAAAAAAAJAVAL.AGNAAAAAAAAAAJAVAL.AGNAAAAAAAAAAJAVAL.AGNAAAAAAAAAAJAVAL.AGNAAAAAAAAAAJAVAL.AGNAAAAAAAAAAJAVAL.AGNAAAAAAAAAAJAVAL.AGNAAAAAAAAAAJAVAL.AGNAAAAAAAAAAJAVAL.AGNAAAAAAAAAAJAVAL.AGNAAAAAAAAAAJAVAL.AGNAAAAAAAAAAJAVAL.AGNAAAAAAAAAAJAVAL.AGNAAAAAAAAAAJAVAL.AGNAAAAAAAAAAJAVAL.AGNAAAAAAAAAAJAVAL.AGNAAAAAAAAAAJAVAL.AGNAAAAAAAAAAJAVAL.AGNAAAAAAAAAAJAVAL.AGNAAAAAAAAAAJAVAL.AGNAAAAAAAAAAJAVAL.AGNAAAAAAAAAAJAVAL.AGNAAAAAAAAAAJAVAL.AGNAAAAAAAAAAJAVAL.AGNAAAAAAAAAAJAVAL.AGNAAAAAAAAAAJAVAL.AGN");
    }

    @Test
    public void test39026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest78.test39026");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNumeric((java.lang.CharSequence) "LNuLNuLNuLNuLNuLNuLNuLNuLNuLNuLNuLNuLNuLNuLNuLNuLNuLNuLNuLNuLNuLNuLNuLNuLNuLNuLNuLNuLNuLNuLNuLNuLNuLNuLNuLNuLNuLNuLNuLNuLNuLNuLNuLNuLNuLNuLNuLNuLNLNuLNuLNuLNuLNuLNuLNuLNuLNuLNuLNuLNuLNuLNuLNuLNuLNuLNuLNuLNuLNuLNuLNuLNuLNuLNuLNuLNuLNuLNuLNuLNuLNuLNuLNuLNuLNuLNuLNuLNuLNuLNuLNuLNuLNuLNuLNuLNuLNuLNuLNuLNuLNuLNuLNuLNuLNuLNuLNuLNuLNuLNuLNuLNuLNuLNuLNuLNuLNuLNuLNuLNuLNuLNuLNuLNuLNuLNuLNuLNuLNuLNuLNuLNuLNuLNuLNuLNuLNuLNuLNuLNuLNuLNuLNuLNuLNuLNuLNuLNuLNuLNuLNuLNuLNuLNuLNuLNuLNuLNuLinterface java.io.Serializable");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test39027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest78.test39027");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "$#######$########", "ClassslitUgnirtSslitUgnirtSslitUgnirtSslitUgnirtSslitUgnirtSslitUgnirtSslitUgnirtSslitUgnirtSslitUgnirtSslitUgnirtS");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test39028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest78.test39028");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfDifference((java.lang.CharSequence) "Java.lang.Cloneable4interface java.io.Serializ", (java.lang.CharSequence) "$$$$$$java");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test39029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest78.test39029");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isEmpty((java.lang.CharSequence) "...RGNALUAVAJTUTUTUTUTUTUT..");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test39030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest78.test39030");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitByCharacterTypeCamelCase("RChahactaRChahactaRChahactaRChahactaRChahactaRChahactaRChahactaRChahactaRChahactaRChahactaRChahactaRChahactaRChahactaRChahactaRChahactaRChahactaRChahactaRChahactaRChahactaRChahactaRChahactaRChahactaRChahactaRChahacta");
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test39031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest78.test39031");
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.replace("              ", "$$$VA$LANGAVAJ$GNALJAVA$LANGAVAJ$GNALJAVA$LANGAVAJ$GNALJAVA$LANGAVAJ$GNALJAVA$LANGAVAJ$GNALJAVA$LANGgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalg", "SILYARRA!IH........", (int) (byte) 0);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "              " + "'", str4, "              ");
    }

    @Test
    public void test39032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest78.test39032");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.split("iSerializabl...     java", "JAVA#############################################################################################");
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test39033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest78.test39033");
        int int3 = org.apache.commons.lang3.StringUtils.indexOf("$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$", 102, 188);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test39034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest78.test39034");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.leftPad("interfacejava.lang.Cloneable...interfacejava.io", 355);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                                                                                                                                                                                                                                                                                                    interfacejava.lang.Cloneable...interfacejava.io" + "'", str2, "                                                                                                                                                                                                                                                                                                                    interfacejava.lang.Cloneable...interfacejava.io");
    }

    @Test
    public void test39035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest78.test39035");
        int int3 = org.apache.commons.lang3.StringUtils.indexOf("RFACE JAVA.LANG.CLONEA#                                   J.GNALJAVA.LANGAVAJ.GN", (int) '$', 57);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test39036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest78.test39036");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.abbreviateMiddle(".lang.lang.lang.lang", "                                                                                                                                                                                                                                                                    AtsiLytcejbO.gnal.avaj ssalcrrAtsiLytcejbO.gnal.avaj ssalcrrAva.langGNAL..langjava.langAGNAL.AVAJAtsiLytcejbO.gnal.avaj ssalcrrAtsiLytcejbO.gnal.avaj ssalcrrAva.langGNAL..langjava.langAGNAL.AVAJAtsiLytcejbO.gnal.avaj ssalcrrAtsiLytcejbO.gnal.avaj ssalcrrAva.langGNAL..langjava.langAGNAL.AVAJAtsiLytcejbO.gnal.avaj ssalcrrAtsiLytcejStringAtsiLytcejbO.gnal.avaj ssalcrrAtsiLytcejbO.gnal.avaj ssalcrrAva.langGNAL..langjava.langAGNAL.AVAJAtsiLytcejbO.gnal.avaj ssalcrrAtsiLytcejbO.gnal.avaj ssalcrrAva.langGNAL..langjava.langAGNAL.AVAJAtsiLytcejbO.gnal.avaj ssalcrrAtsiLytcejbO.gnal.avaj ssalcrrAva.langGNAL..langjava.langAGNAL.AVAJAtsiLytcejbO.gnal.avaj ssalcrrAtsiLytcejb", 29);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + ".lang.lang.lang.lang" + "'", str3, ".lang.lang.lang.lang");
    }

    @Test
    public void test39037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest78.test39037");
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.overlay("        ", "....................................................................$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$GNAL$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$                       $$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$GNAL$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$JAVAULANG", 83, 50);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "        ....................................................................$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$GNAL$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$                       $$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$GNAL$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$JAVAULANG" + "'", str4, "        ....................................................................$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$GNAL$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$                       $$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$GNAL$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$JAVAULANG");
    }

    @Test
    public void test39038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest78.test39038");
        java.lang.String str1 = org.apache.commons.lang3.ClassUtils.getPackageName("class java.lang.Class                       JAVAULANG                       JAVAULANG                       JAVAULANG                       JAVAULANG                       JAVAULANG                       JAVAULANG                       JAVAULANG                       JAVAULANG                       JAVAULANG                       JAVAULANG                       JAVAULANG                       JAVAULANG                       JAVAULANG                       JAVAULANG                       JAVAULANG                       JAVAULANG                       JAVAULANG                       JAVAULANG                       JAVAULANG                       JAVAULANG");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "class java.lang" + "'", str1, "class java.lang");
    }

    @Test
    public void test39039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest78.test39039");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("hi!arraylistarraylistarraylis.1aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa.1aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa.1aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa.1aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa.1aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa.1aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa.1aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa.aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "Arrclass java......................Arrclass java......................ArtringArrclass java......................Arrclass java......................Ar");
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test39040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest78.test39040");
        int int3 = org.apache.commons.lang3.StringUtils.indexOf("interface java.lang.Cloneablelitulitulitulitulitul####litulitulitulitulituinterface java.io.Serializable", "gnal.avajgnal.avajgnal.avajgnal.avajgnal.avajgnal.avajgnal.avajgnal.avajgnal.avajgnal.avajgnal.avajgnal.avajgnal.avajgnal.avajgnal.avajgnal.avajgnal.avajgnal.avajgnal.avajgnal.avajgnal.avajgnal.avajgnal.avajgnal.avajgnal.avajgnal.avajgnal.avajgnal.avagnal.avaaaaaaaaaa4444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444vaJ", 10);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test39041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest78.test39041");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceChars("interface java.lang.CloneableJAVA.UTILJAVA.UTILStringcJAVA.UTILJAVA.UTILStringcJAVA.UTILJAVA.UTILStringcJAVA.UTILJAVA.UTILStringcJAVA.UTILJAVA.UTILStringcJAVA.UTILJAVA.UTILStringcJAVA.UTILJAVA.UTILStringcJAVA.UTILJAVA.UTILStringcJAVA.UTILJAVA.UTILStringcJAVA.UTILJAVA.UTILStringcJAVA.UTILJAVA.UTILStringcJAVA.UTILJAVA.UTILStringcJAVA.UTILJAVA.UTILStringcJAVA.UTILJAVA.UTILStringcJAVA.UTILJAVA.UTILStringcJAVA.UTILJAVA.UTILStringcJAVA.UTILJAVA.UTILStringcJAVA.UTILJAVA.UTILStringcJAVA.UTILJAVA.UTILStringcJAVA.UTILJAVA.UTILStringcJAVA.UTILJAVA.UTILStringcJAVA.UTILJAVA.UTILStringcJAVA.UTILJAVA.UTILinterface java.io.Serializable", 'a', '#');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "interf#ce j#v#.l#ng.Clone#bleJAVA.UTILJAVA.UTILStringcJAVA.UTILJAVA.UTILStringcJAVA.UTILJAVA.UTILStringcJAVA.UTILJAVA.UTILStringcJAVA.UTILJAVA.UTILStringcJAVA.UTILJAVA.UTILStringcJAVA.UTILJAVA.UTILStringcJAVA.UTILJAVA.UTILStringcJAVA.UTILJAVA.UTILStringcJAVA.UTILJAVA.UTILStringcJAVA.UTILJAVA.UTILStringcJAVA.UTILJAVA.UTILStringcJAVA.UTILJAVA.UTILStringcJAVA.UTILJAVA.UTILStringcJAVA.UTILJAVA.UTILStringcJAVA.UTILJAVA.UTILStringcJAVA.UTILJAVA.UTILStringcJAVA.UTILJAVA.UTILStringcJAVA.UTILJAVA.UTILStringcJAVA.UTILJAVA.UTILStringcJAVA.UTILJAVA.UTILStringcJAVA.UTILJAVA.UTILStringcJAVA.UTILJAVA.UTILinterf#ce j#v#.io.Seri#liz#ble" + "'", str3, "interf#ce j#v#.l#ng.Clone#bleJAVA.UTILJAVA.UTILStringcJAVA.UTILJAVA.UTILStringcJAVA.UTILJAVA.UTILStringcJAVA.UTILJAVA.UTILStringcJAVA.UTILJAVA.UTILStringcJAVA.UTILJAVA.UTILStringcJAVA.UTILJAVA.UTILStringcJAVA.UTILJAVA.UTILStringcJAVA.UTILJAVA.UTILStringcJAVA.UTILJAVA.UTILStringcJAVA.UTILJAVA.UTILStringcJAVA.UTILJAVA.UTILStringcJAVA.UTILJAVA.UTILStringcJAVA.UTILJAVA.UTILStringcJAVA.UTILJAVA.UTILStringcJAVA.UTILJAVA.UTILStringcJAVA.UTILJAVA.UTILStringcJAVA.UTILJAVA.UTILStringcJAVA.UTILJAVA.UTILStringcJAVA.UTILJAVA.UTILStringcJAVA.UTILJAVA.UTILStringcJAVA.UTILJAVA.UTILStringcJAVA.UTILJAVA.UTILinterf#ce j#v#.io.Seri#liz#ble");
    }

    @Test
    public void test39042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest78.test39042");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.defaultString("$$$$$$$$$$$$$$$$$$$$$$$$$$$$$..", "INTERFACE#JAVA.LANG.cLONEABLE4INTERFACE#JAVA.IO.sERIALIZABLE");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "$$$$$$$$$$$$$$$$$$$$$$$$$$$$$.." + "'", str2, "$$$$$$$$$$$$$$$$$$$$$$$$$$$$$..");
    }

    @Test
    public void test39043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest78.test39043");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.strip("gnalArrayListArrayListArrayListavaj.gnalArrayListArrayListArrayLi", "          GNALgn");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "alArrayListArrayListArrayListavaj.gnalArrayListArrayListArrayLi" + "'", str2, "alArrayListArrayListArrayListavaj.gnalArrayListArrayListArrayLi");
    }

    @Test
    public void test39044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest78.test39044");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOf("44444444444444444444444444444444444444444444444444444444444444444444444444444444$", 401);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test39045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest78.test39045");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByCharacterTypeCamelCase("           a                                a  ");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.concatWith("########$#######$", (java.lang.Object[]) strArray2);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "           ########$#######$a########$#######$                                ########$#######$a########$#######$  " + "'", str3, "           ########$#######$a########$#######$                                ########$#######$a########$#######$  ");
    }

    @Test
    public void test39046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest78.test39046");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("hi!ArrayListArrayListArrayListavajhhhh AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAhhh AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAhhh AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAhhh AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAhhh AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAhhh AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAhhh AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAhhh AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAhhh AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAhhh AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA", 'a');
        boolean boolean4 = org.apache.commons.lang3.StringUtils.endsWithAny("][sslC", strArray3);
        java.lang.String str5 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray3);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!ArryListArryListArryListvjhhhh AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAhhh AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAhhh AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAhhh AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAhhh AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAhhh AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAhhh AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAhhh AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAhhh AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAhhh AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA" + "'", str5, "hi!ArryListArryListArryListvjhhhh AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAhhh AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAhhh AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAhhh AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAhhh AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAhhh AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAhhh AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAhhh AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAhhh AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAhhh AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA");
    }

    @Test
    public void test39047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest78.test39047");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.substringBetween("...langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava..", "Arrclass java......................", "                                                                                                                                                                                                                                                        cLONEABLE4I");
        org.junit.Assert.assertNull(str3);
    }

    @Test
    public void test39048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest78.test39048");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.abbreviate("irfco$irfiosriiz", 99);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "irfco$irfiosriiz" + "'", str2, "irfco$irfiosriiz");
    }

    @Test
    public void test39049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest78.test39049");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.substringBetween("                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                         ", "GNAL.AVAJGNAL..langGNAL.AVAJGNALLituLlituLlitu444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444", "###########################VA.LANGAVAJ.GNALJAVA.LANGAVAJ.GNALJAVA.LANGAVAJ.GNALJAVA.LANGAVAJ.GNALJAVA.LANGAVAJ.GNALJAVA.LANG###########################                                                                                                                                                                                                                                                                 ");
        org.junit.Assert.assertNull(str3);
    }

    @Test
    public void test39050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest78.test39050");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.split("                     ", "INTERFACEJAVA.LANG.cLONEABLE4IgnirtINTERFACEJAVA.LANG.cLONEABLE4IINTERFACEJAVA.LANG.cLONEABLE4IgnirtINTERFACEJAVA.LANG.cLONEABLE4IINTERFACEJAVA.LANG.cLONEABLE4IgnirtINTERFACEJAVA.LANG.cLONEABLE4IINTERFACEJAVA.LANG.cLONEABLE4IgnirtINTERFACEJAVA.LANG.cLONEABLE4IINTERFACEJAVA.LANG.cLONEABLE4IgnirtINTERFACEJAVA.LANG.cLONEABLE4IINTERFACEJAVA.LANG.cLONEABLE4IgnirtINTERFACEJAVA.LANG.cLONEABLE4IINTERFACEJAVA.LANG.cLONEABLE4IgnirtINTERFACEJAVA.LANG.cLONEABLE4IINTERFACEJAVA.LANG.cLONEABLE4IgnirtINTERFACEJAVA.LANG.cLONEABLE4IINTERFACEJAVA.LANG.cLONEABLE4IgnirtINTERFACEJAVA.LANG.cLONEABLE4IINTERFACEJAVA.LANG.cLONEABLE4IgnirtINTERFACEJAVA.LANG.cLONEABLE4IINTERFACEJAVA.LANG.cLONEABLE4IgnirtINTERFACEJAVA.LANG.cLcLONEABLE4I");
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test39051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest78.test39051");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceOnce("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "jbOgnlvjsslsiyjb", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaajaval...agn");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa" + "'", str3, "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
    }

    @Test
    public void test39052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest78.test39052");
        java.lang.String str2 = org.apache.commons.lang3.ClassUtils.getShortClassName((java.lang.Object) "AVAJgnl", "JavastringslitUgnirtSarraylistarraylistavaj.gnalarraylistarraylistarrayli");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "String" + "'", str2, "String");
    }

    @Test
    public void test39053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest78.test39053");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.center("java.lang.stringclass java.lang.stringclass java.lang.stringclas.lang.stringclass java.lang.stringc", 300);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                                                                                    java.lang.stringclass java.lang.stringclass java.lang.stringclas.lang.stringclass java.lang.stringc                                                                                                     " + "'", str2, "                                                                                                    java.lang.stringclass java.lang.stringclass java.lang.stringclas.lang.stringclass java.lang.stringc                                                                                                     ");
    }

    @Test
    public void test39054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest78.test39054");
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
        java.lang.String str32 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) wildcardClassArray20, '#', (int) ' ', 10);
        java.lang.Class<?>[] wildcardClassArray33 = org.apache.commons.lang3.ClassUtils.primitivesToWrappers(wildcardClassArray20);
        java.lang.String str34 = org.apache.commons.lang3.StringUtils.concat((java.lang.Object[]) wildcardClassArray20);
        java.lang.String str35 = org.apache.commons.lang3.StringUtils.concat((java.lang.Object[]) wildcardClassArray20);
        java.lang.Class<?>[] wildcardClassArray36 = org.apache.commons.lang3.ClassUtils.wrappersToPrimitives(wildcardClassArray20);
        java.lang.String str38 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) wildcardClassArray36, 'a');
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
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "" + "'", str32, "");
        org.junit.Assert.assertNotNull(wildcardClassArray33);
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "" + "'", str34, "");
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "" + "'", str35, "");
        org.junit.Assert.assertNotNull(wildcardClassArray36);
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "" + "'", str38, "");
    }

    @Test
    public void test39055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest78.test39055");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.leftPad("string", 0, '4');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "string" + "'", str3, "string");
    }

    @Test
    public void test39056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest78.test39056");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.right("iNTERFACEJAVA.LANG.cLONEABLE#INTERFACEJAVA.IOINTERFACEJAVA.LANG.cLONEABLE#INTERFACEJAVA.IOINTERFACEJAVA.LANG.cLONEABLE#INTERFACEJAVA.IOINTERFACEJAVABooleanINTERFACEJAVA.LANG.cLONEABLE#INTERFACEJAVA.IOINTERFACEJAVA.LANG.cLONEABLE#INTERFACEJAVA.IOINTERFACEJAVA.LANG.cLONEABLE#INTERFACEJAVA.IOINTERFACEJAVAIN$$$$$$$$$$$$$$$$$$$$$$$$$$$$$...$$$$$$$$$$$$$$$$$$$$$$$$$$$$$...$$$$$$$$$$$$$$$$$$$$$$$$$$aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaINTERFACEJAVA.LANG.cLONEABLE#INTERFACEJAVA.IOINTERFACEJAVA.LANG.cLONEABLE#INTERFACEJAVA.IOINTERFACEJAVA.LANG.cLONEABLE#INTERFACEJAVA.IOINTERFACEJAVABooleanINTERFACEJAVA.LANG.cLONEABLE#INTERFACEJAVA.IOINTERFACEJAVA.LANG.cLONEABLE#INTERFACEJAVA.IOINTERFACEJAVA.LANG.cLONEABLE#INTERFACEJAVA.IOINTERFACEJAVAIN", 523);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "$$$$$$$$$$$$$$$$$$$...$$$$$$$$$$$$$$$$$$$$$$$$$$$$$...$$$$$$$$$$$$$$$$$$$$$$$$$$aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaINTERFACEJAVA.LANG.cLONEABLE#INTERFACEJAVA.IOINTERFACEJAVA.LANG.cLONEABLE#INTERFACEJAVA.IOINTERFACEJAVA.LANG.cLONEABLE#INTERFACEJAVA.IOINTERFACEJAVABooleanINTERFACEJAVA.LANG.cLONEABLE#INTERFACEJAVA.IOINTERFACEJAVA.LANG.cLONEABLE#INTERFACEJAVA.IOINTERFACEJAVA.LANG.cLONEABLE#INTERFACEJAVA.IOINTERFACEJAVAIN" + "'", str2, "$$$$$$$$$$$$$$$$$$$...$$$$$$$$$$$$$$$$$$$$$$$$$$$$$...$$$$$$$$$$$$$$$$$$$$$$$$$$aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaINTERFACEJAVA.LANG.cLONEABLE#INTERFACEJAVA.IOINTERFACEJAVA.LANG.cLONEABLE#INTERFACEJAVA.IOINTERFACEJAVA.LANG.cLONEABLE#INTERFACEJAVA.IOINTERFACEJAVABooleanINTERFACEJAVA.LANG.cLONEABLE#INTERFACEJAVA.IOINTERFACEJAVA.LANG.cLONEABLE#INTERFACEJAVA.IOINTERFACEJAVA.LANG.cLONEABLE#INTERFACEJAVA.IOINTERFACEJAVAIN");
    }

    @Test
    public void test39057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest78.test39057");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("       integer        ", "4rr4ylist", 154);
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void test39058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest78.test39058");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.center("j.v.tsily.rr.tsily.rr.tsily.rr", 441);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                                                                                                                                                                                             j.v.tsily.rr.tsily.rr.tsily.rr                                                                                                                                                                                                              " + "'", str2, "                                                                                                                                                                                                             j.v.tsily.rr.tsily.rr.tsily.rr                                                                                                                                                                                                              ");
    }

    @Test
    public void test39059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest78.test39059");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeStart("class java.util.AbstractListgn lu v j ....................................................................class java.util.AbstractCollectiongn lu v j ....................................................................class java.lang.Object", "GNALUAVAJ                       GNALUAVAJ                       GNALUAVAJ                       GNALUAVAJ                       GNALUAVAJ                       GNALUAVAJ                       GNALUAVAJ                       GNALUAVAJ                       GNALUAVAJ                       GNALUAVAJ                       GNALUAVAJ                       GNALUAVAJ                       GNALUAVAJ                       GNALUAVAJ                       GNALUAVAJ                       GNALUAVAJ                       GNALUAVAJ                       GNALUAVAJ                       GNALUAVAJ                       GNALUAVAJ                       SSALCGNALAVAJavajlitu");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "class java.util.AbstractListgn lu v j ....................................................................class java.util.AbstractCollectiongn lu v j ....................................................................class java.lang.Object" + "'", str2, "class java.util.AbstractListgn lu v j ....................................................................class java.util.AbstractCollectiongn lu v j ....................................................................class java.lang.Object");
    }

    @Test
    public void test39060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest78.test39060");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens(".............RJAVAARR", "                                                                               JAVAlLANG                                                                                ");
        java.lang.String[] strArray5 = org.apache.commons.lang3.StringUtils.splitByCharacterTypeCamelCase("interface java.lang.CloneableNG.Llitinterface java.io.Serializable                                                                                                                                                                                                                                                                                                                                                                                                                                                                  ");
        java.lang.String[] strArray6 = org.apache.commons.lang3.StringUtils.stripAll(strArray5);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str7 = org.apache.commons.lang3.StringUtils.replaceEach("LANG.LANG.LANG.LANG.Llitu", strArray3, strArray5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Search and Replace array lengths don't match: 1 vs 17");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertNotNull(strArray6);
    }

    @Test
    public void test39061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest78.test39061");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsAny("y..............................ObjectyList..............................", "ArrGNALyList");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test39062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest78.test39062");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphanumeric((java.lang.CharSequence) "interface java.lang.Cloneable                                                                                                                                                                                                                                                Java.io.Serializable interface java.lang.Cloneable... interface                                                                                                                                                                                                                                                 interface java.io.Serializable");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test39063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest78.test39063");
        int int3 = org.apache.commons.lang3.StringUtils.indexOf("ArryList", 168, 141);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test39064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest78.test39064");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.substringBetween("                                                                                                                                                                                                                                                                                                                                                                                                          CLASSJAVA.LANGAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAULANG", "gnal                                                                1AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA", "4444444444$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$");
        org.junit.Assert.assertNull(str3);
    }

    @Test
    public void test39065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest78.test39065");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNumeric((java.lang.CharSequence) "$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$aaaaaaa       INTEGER        aaaaaa");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test39066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest78.test39066");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringAfter("                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                              IOINTERFACEJAVAIN", "interface#java.lang.Cloneable...........         interface#java.lang.Cloneable............");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test39067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest78.test39067");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.deleteWhitespace("NG.CLASSjava.langAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAulangGNAL.AVAJLANG.CLASSjava.langAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAulangGNAL.AVAJLANG.CLASSjava.langAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAulangGNAL.AVAJLANG.CLASSjava.langAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAulangGNAL.AVAJLANG.CLASSjava.langAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAulangGNAL.AVAJLANG.CLASSjava.langAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAulangGNAL.AVAJLANG.GNALELBAENOLC.GNAL.AVAJ ECAF");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "NG.CLASSjava.langAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAulangGNAL.AVAJLANG.CLASSjava.langAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAulangGNAL.AVAJLANG.CLASSjava.langAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAulangGNAL.AVAJLANG.CLASSjava.langAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAulangGNAL.AVAJLANG.CLASSjava.langAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAulangGNAL.AVAJLANG.CLASSjava.langAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAulangGNAL.AVAJLANG.GNALELBAENOLC.GNAL.AVAJECAF" + "'", str1, "NG.CLASSjava.langAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAulangGNAL.AVAJLANG.CLASSjava.langAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAulangGNAL.AVAJLANG.CLASSjava.langAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAulangGNAL.AVAJLANG.CLASSjava.langAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAulangGNAL.AVAJLANG.CLASSjava.langAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAulangGNAL.AVAJLANG.CLASSjava.langAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAulangGNAL.AVAJLANG.GNALELBAENOLC.GNAL.AVAJECAF");
    }

    @Test
    public void test39068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest78.test39068");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOfIgnoreCase("gnirtS.gnal.avajssalcgnirtS.gnal.avajssalcgnirtS.gnal.avajssalcgnirtS.gnal.avajssalcgnirtS.gnal.avajssalcArrayListArrayListArrayListavaj.gnaljava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.lang........java.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.lang........java.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.lang.......", "                                                                                                                                                                                                                                                Java.io.Serializable interface java.lang.Cloneable... interface                                                                                                                                                                                                                                                 ", 584);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test39069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest78.test39069");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.rightPad("AAAAAAAAAAAAAAAAAAAgnaluavajAAAAAAAAAAAAAAAAAAA", 516);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "AAAAAAAAAAAAAAAAAAAgnaluavajAAAAAAAAAAAAAAAAAAA                                                                                                                                                                                                                                                                                                                                                                                                                                                                                     " + "'", str2, "AAAAAAAAAAAAAAAAAAAgnaluavajAAAAAAAAAAAAAAAAAAA                                                                                                                                                                                                                                                                                                                                                                                                                                                                                     ");
    }

    @Test
    public void test39070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest78.test39070");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlpha((java.lang.CharSequence) "444444444444444444444444444.alya..arsoifri$ocfri");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test39071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest78.test39071");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.split("L.Arr#yList", '4');
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.stripAll(strArray2);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void test39072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest78.test39072");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNotBlank((java.lang.CharSequence) "class java.lang.Object");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test39073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest78.test39073");
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("StringUtils", "AVAJ.GNAL", 2);
        boolean boolean5 = org.apache.commons.lang3.StringUtils.startsWithAny("#################################################################################...a##################################################################################", strArray4);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test39074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest78.test39074");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.abbreviateMiddle("i4elbaenolC.gnal.avaj ecafretniTRINGi4elbaenolC.gnal.avaj ecafretni", "erface java.lang.Cloneable.......java.......Objectava..........javainterface java.io.Serializable", 476);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "i4elbaenolC.gnal.avaj ecafretniTRINGi4elbaenolC.gnal.avaj ecafretni" + "'", str3, "i4elbaenolC.gnal.avaj ecafretniTRINGi4elbaenolC.gnal.avaj ecafretni");
    }

    @Test
    public void test39075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest78.test39075");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.defaultIfEmpty("44444444444444444.44444444444444444", " ... ... ... ... ... ... ... ... ... ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "44444444444444444.44444444444444444" + "'", str2, "44444444444444444.44444444444444444");
    }

    @Test
    public void test39076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest78.test39076");
        java.util.Locale locale1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.apache.commons.lang3.StringUtils.lowerCase("gnalArrayListArrayListArrayListavaj.gnalArrayListArrayListArrayLi", locale1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test39077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest78.test39077");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.endsWithIgnoreCase("##########################################################################################################################################################################################################################################javaJ.Jlang##########################################################################################################################################################################################################################################", "javaulan");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test39078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest78.test39078");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.mid("", 219, 723);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test39079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest78.test39079");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.stripEnd("aVAJ.GNALAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA CharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterChara", "JAVA.L$ArrayAAAAAAAAAA");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "aVAJ.GNALAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA CharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCh" + "'", str2, "aVAJ.GNALAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA CharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCh");
    }

    @Test
    public void test39080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest78.test39080");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.substring("string.", 131, 97);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test39081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest78.test39081");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNumericSpace((java.lang.CharSequence) "444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444litu.avajlitu.avajArrayListArrayListArrayListavajGNAL.AVAJLANG.JAVAGNAL.AVAJLANG.JAVAGNAL.AVAJLANG....");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test39082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest78.test39082");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.uncapitalize((java.lang.CharSequence) "4444444444444CH.R.CTER4444444444444UTILSTRAYL A.A");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "4444444444444CH.R.CTER4444444444444UTILSTRAYL A.A" + "'", str1, "4444444444444CH.R.CTER4444444444444UTILSTRAYL A.A");
    }

    @Test
    public void test39083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest78.test39083");
        char[] charArray7 = new char[] {};
        int int8 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "$       ", charArray7);
        boolean boolean9 = org.apache.commons.lang3.StringUtils.containsAny("INTERFACE JAVA.LANG.cLONEABLE.......JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVAINTERFACE JAVA.IO.sERIALIZABLE", charArray7);
        boolean boolean10 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA       AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA       AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA       AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA       AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA       AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA       ", charArray7);
        boolean boolean11 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444litu.avajlitu.avaj", charArray7);
        boolean boolean12 = org.apache.commons.lang3.StringUtils.containsAny("utilString[]    ", charArray7);
        boolean boolean13 = org.apache.commons.lang3.StringUtils.containsAny("Arrrrrrrrrrrrrrrrrrrrrrrrrrrrrr", charArray7);
        int int14 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$J#v#.l#ngj#v#.l#ngj#v#.l#ngj#v#.l#ngj#v#.l#ngj#v#.l#ngj#v#.l#ngj#v#.l#ngj#v#.l#ngj#v#.l#ngj#v#.l#ngj#v#.l#ngj#v#.l#ngj#v#.l#ngj#v#.l#ngj#v#.l#ngj#v#.l#ngj#v#.l#ngj#v#.l#ngj#v#.l#ngj#v#.l#ngj#v#.l#ngj#v#.l#ngj#v#.l#ngj#v#.l#ngj#v#.l#ngj#v#.l#ngj#v#.l#ngj#v#.l#ngj#v#.l#ngj#v#.l#ngj#v#.l#ngj#v#", charArray7);
        org.junit.Assert.assertNotNull(charArray7);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray7), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray7), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray7), "[]");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
    }

    @Test
    public void test39084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest78.test39084");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.swapCase("...stgnal.aL.ArrayList...aL.ArrayListgnal.aL.");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "...STGNAL.Al.aRRAYlIST...Al.aRRAYlISTGNAL.Al." + "'", str1, "...STGNAL.Al.aRRAYlIST...Al.aRRAYlISTGNAL.Al.");
    }

    @Test
    public void test39085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest78.test39085");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphanumeric((java.lang.CharSequence) "AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA][SSALc");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test39086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest78.test39086");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("                       javaulangrraylist", ' ');
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test39087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest78.test39087");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripAccents((java.lang.CharSequence) "AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA.....................................................................................................................................................................................................................................................................................................");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA....................................................................................................................................................................................................................................................................................................." + "'", str1, "AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA.....................................................................................................................................................................................................................................................................................................");
    }

    @Test
    public void test39088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest78.test39088");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "aa...                                                                                                                                   #############################################################################################################################################################################################################################################################################################################################################################################", "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                     aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa-1java.utilString[]                                                                                 ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test39089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest78.test39089");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.left("elbazilaireSu.avaj1-", 0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test39090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest78.test39090");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass1 = org.apache.commons.lang3.ClassUtils.getClass("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaarING-1JAVA.UTILsTRINGagn                                           ");
            org.junit.Assert.fail("Expected exception of type java.lang.ClassNotFoundException; message: aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaarING-1JAVA.UTILsTRINGagn");
        } catch (java.lang.ClassNotFoundException e) {
            // Expected exception.
        }
    }

    @Test
    public void test39091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest78.test39091");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitByCharacterType("ayListArrayListArrayListavaj.gnal                                                                                                                                         ");
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test39092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest78.test39092");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.swapCase("4444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444AAAAAAAAAA");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "4444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444aaaaaaaaaa" + "'", str1, "4444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444aaaaaaaaaa");
    }

    @Test
    public void test39093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest78.test39093");
        java.lang.CharSequence charSequence1 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.apache.commons.lang3.StringUtils.getLevenshteinDistance((java.lang.CharSequence) "laagaAAAAAAAAAAaaaalaagaAAAAAAAAAAaaaalaagaAAAAAAAAAAaaaalaagaAAAAAAAAAAaaaalaagaAAAAAAAAAAaaaalaagaAAAAAAAAAAaaaalaagaAAAAAAAAAAaaaalaagaAAAAAAAAAAaaaalaagaAAAAAAAAAAaaaalaagaAAAAAAAAAAaaaalaagaAAAAAAAAAAaaaalaagaAAAAAAAAAAaaaalaagaAAAAAAAAAAaaaalaagaAAAAAAAAAAaaaalaagaAAAAAAAAAAaaaalaagaAAAAAAAAAAaaaalaagaAAAAAAAAAAaaaalaagaAAAAAAAAAAaaaalaagaAAAAAAAAAAaaaalaagaAAAAAAAAAAaaaalaagaAAAAAAAAAAaaaalaagaAAAAAAAAAAaaaalaagaAAAAAAAAAAaaaalaagaAAAAAAAAAAaaaalaagaAAAAAAAAAAaaaalaagaAAAAAAAAAAaaaalaagaAAAAAAAAAAaaaalaagaAAAAAAAAAAaaaalaagaAAAAAAAAAAaaaalaagaAAAAAAAAAAaaaalaagaAAAAAAAAAAaaaalaagaAAAAAAAAAAaaaalaagaAAAAAAAAAAaaaalaagaAAAAAAAAAAaaaalaagaAAAAAAAAAA", charSequence1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Strings must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test39094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest78.test39094");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.contains("etyBetyBetyBetyBetyBetyBetyBetyBetyB", 924);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test39095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest78.test39095");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.center("$$$$$$$$$$$$$$$$$$$..$                                                                 AtsiLytcejbOlvjsslcrrAtsiLytcejbO.gnal.avaj ssalcrrAva.langGNAL..langjava.langAGNAL.AVAJ$$$$$$$$$$$$$$$$$$$..$$", 321, "...############################");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "...############################...###########################$$$$$$$$$$$$$$$$$$$..$                                                                 AtsiLytcejbOlvjsslcrrAtsiLytcejbO.gnal.avaj ssalcrrAva.langGNAL..langjava.langAGNAL.AVAJ$$$$$$$$$$$$$$$$$$$..$$...############################...############################" + "'", str3, "...############################...###########################$$$$$$$$$$$$$$$$$$$..$                                                                 AtsiLytcejbOlvjsslcrrAtsiLytcejbO.gnal.avaj ssalcrrAva.langGNAL..langjava.langAGNAL.AVAJ$$$$$$$$$$$$$$$$$$$..$$...############################...############################");
    }

    @Test
    public void test39096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest78.test39096");
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
        java.lang.Class<?>[] wildcardClassArray38 = org.apache.commons.lang3.ClassUtils.wrappersToPrimitives(wildcardClassArray34);
        java.lang.Class<?>[] wildcardClassArray39 = org.apache.commons.lang3.ClassUtils.wrappersToPrimitives(wildcardClassArray38);
        java.lang.String str41 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) wildcardClassArray39, "H!IH!IH!IH!IH!IH!VA.LANGAVAJ.GNALJAVA.LANGAVAJ.GNALJAVA.LANGAVAJ.GNALJAVA.LANGAVAJ.GNALJAVA.LANGAVAJ.GNALJAVA.LANGH!IH!IH!IH!IH!IH!");
        java.lang.String[] strArray43 = org.apache.commons.lang3.StringUtils.splitByCharacterType("... AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA... AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA... AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA... AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA... AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA... AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA... AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA... AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA... AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA... AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA");
        java.lang.Class<?>[] wildcardClassArray44 = org.apache.commons.lang3.ClassUtils.toClass((java.lang.Object[]) strArray43);
        java.lang.Class<?>[] wildcardClassArray45 = org.apache.commons.lang3.ClassUtils.primitivesToWrappers(wildcardClassArray44);
        java.lang.Class<?>[] wildcardClassArray46 = org.apache.commons.lang3.ClassUtils.wrappersToPrimitives(wildcardClassArray45);
        java.lang.String[] strArray49 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("hi!", "");
        java.lang.String[] strArray51 = org.apache.commons.lang3.StringUtils.stripAll(strArray49, "$");
        java.lang.Class<?>[] wildcardClassArray52 = org.apache.commons.lang3.ClassUtils.toClass((java.lang.Object[]) strArray49);
        java.lang.String[] strArray55 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("hi!", "");
        java.lang.String[] strArray57 = org.apache.commons.lang3.StringUtils.stripAll(strArray55, "$");
        java.lang.Class<?>[] wildcardClassArray58 = org.apache.commons.lang3.ClassUtils.toClass((java.lang.Object[]) strArray55);
        java.lang.Class<?> wildcardClass59 = null;
        java.lang.Class[] classArray61 = new java.lang.Class[1];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray62 = (java.lang.Class<?>[]) classArray61;
        wildcardClassArray62[0] = wildcardClass59;
        java.lang.Class<?>[] wildcardClassArray65 = org.apache.commons.lang3.ClassUtils.primitivesToWrappers(wildcardClassArray62);
        java.lang.String[] strArray67 = new java.lang.String[] { "                                   " };
        java.lang.String str68 = org.apache.commons.lang3.StringUtils.getCommonPrefix(strArray67);
        java.lang.Class<?>[] wildcardClassArray69 = org.apache.commons.lang3.ClassUtils.toClass((java.lang.Object[]) strArray67);
        java.lang.Class<?> wildcardClass70 = null;
        java.lang.Class[] classArray72 = new java.lang.Class[1];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray73 = (java.lang.Class<?>[]) classArray72;
        wildcardClassArray73[0] = wildcardClass70;
        java.lang.Class<?>[] wildcardClassArray76 = org.apache.commons.lang3.ClassUtils.primitivesToWrappers(wildcardClassArray73);
        boolean boolean77 = org.apache.commons.lang3.ClassUtils.isAssignable(wildcardClassArray69, wildcardClassArray73);
        boolean boolean79 = org.apache.commons.lang3.ClassUtils.isAssignable(wildcardClassArray62, wildcardClassArray73, true);
        boolean boolean81 = org.apache.commons.lang3.ClassUtils.isAssignable(wildcardClassArray58, wildcardClassArray73, false);
        java.lang.Class<?>[] wildcardClassArray82 = org.apache.commons.lang3.ClassUtils.primitivesToWrappers(wildcardClassArray58);
        boolean boolean83 = org.apache.commons.lang3.ClassUtils.isAssignable(wildcardClassArray52, wildcardClassArray82);
        java.lang.Class<?>[] wildcardClassArray84 = org.apache.commons.lang3.ClassUtils.wrappersToPrimitives(wildcardClassArray82);
        boolean boolean85 = org.apache.commons.lang3.ClassUtils.isAssignable(wildcardClassArray45, wildcardClassArray82);
        java.lang.Class<?>[] wildcardClassArray86 = org.apache.commons.lang3.ClassUtils.wrappersToPrimitives(wildcardClassArray82);
        java.lang.Class<?>[] wildcardClassArray87 = org.apache.commons.lang3.ClassUtils.primitivesToWrappers(wildcardClassArray86);
        java.lang.String str89 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) wildcardClassArray87, "ETYb");
        java.lang.Class<?>[] wildcardClassArray90 = org.apache.commons.lang3.ClassUtils.wrappersToPrimitives(wildcardClassArray87);
        boolean boolean91 = org.apache.commons.lang3.ClassUtils.isAssignable(wildcardClassArray39, wildcardClassArray90);
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
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "" + "'", str41, "");
        org.junit.Assert.assertNotNull(strArray43);
        org.junit.Assert.assertNotNull(wildcardClassArray44);
        org.junit.Assert.assertNotNull(wildcardClassArray45);
        org.junit.Assert.assertNotNull(wildcardClassArray46);
        org.junit.Assert.assertNotNull(strArray49);
        org.junit.Assert.assertNotNull(strArray51);
        org.junit.Assert.assertNotNull(wildcardClassArray52);
        org.junit.Assert.assertNotNull(strArray55);
        org.junit.Assert.assertNotNull(strArray57);
        org.junit.Assert.assertNotNull(wildcardClassArray58);
        org.junit.Assert.assertNotNull(classArray61);
        org.junit.Assert.assertNotNull(wildcardClassArray62);
        org.junit.Assert.assertNotNull(wildcardClassArray65);
        org.junit.Assert.assertNotNull(strArray67);
        org.junit.Assert.assertEquals("'" + str68 + "' != '" + "                                   " + "'", str68, "                                   ");
        org.junit.Assert.assertNotNull(wildcardClassArray69);
        org.junit.Assert.assertNotNull(classArray72);
        org.junit.Assert.assertNotNull(wildcardClassArray73);
        org.junit.Assert.assertNotNull(wildcardClassArray76);
        org.junit.Assert.assertTrue("'" + boolean77 + "' != '" + false + "'", boolean77 == false);
        org.junit.Assert.assertTrue("'" + boolean79 + "' != '" + false + "'", boolean79 == false);
        org.junit.Assert.assertTrue("'" + boolean81 + "' != '" + false + "'", boolean81 == false);
        org.junit.Assert.assertNotNull(wildcardClassArray82);
        org.junit.Assert.assertTrue("'" + boolean83 + "' != '" + true + "'", boolean83 == true);
        org.junit.Assert.assertNotNull(wildcardClassArray84);
        org.junit.Assert.assertTrue("'" + boolean85 + "' != '" + false + "'", boolean85 == false);
        org.junit.Assert.assertNotNull(wildcardClassArray86);
        org.junit.Assert.assertNotNull(wildcardClassArray87);
        org.junit.Assert.assertEquals("'" + str89 + "' != '" + "" + "'", str89, "");
        org.junit.Assert.assertNotNull(wildcardClassArray90);
        org.junit.Assert.assertTrue("'" + boolean91 + "' != '" + false + "'", boolean91 == false);
    }

    @Test
    public void test39097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest78.test39097");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("ArrayLisArrayLisArrayLisArrayLisArra4444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444...", "                                                      #############################################");
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test39098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest78.test39098");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOf("..........................................................................................                                                                                                            ", "stringIntegerInteg", 43);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test39099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest78.test39099");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.normalizeSpace("444444444444444444444444444444444444444444444AAAAAAAAAAAAAAAAAAA4444444444444444444444444444444444444444444444");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "444444444444444444444444444444444444444444444AAAAAAAAAAAAAAAAAAA4444444444444444444444444444444444444444444444" + "'", str1, "444444444444444444444444444444444444444444444AAAAAAAAAAAAAAAAAAA4444444444444444444444444444444444444444444444");
    }

    @Test
    public void test39100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest78.test39100");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.equals((java.lang.CharSequence) "                  ...                         $$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$", (java.lang.CharSequence) "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                     aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa-1java.utilString[]                                                                                 ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test39101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest78.test39101");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "...sAitUJAirtSsAitUJAirtSsAitUJAirtSsAitUJAirtSsAitUJAirtSsAitUJAirtSsAitUJAirtSsAitUJAirtSsAitUJAirtS...sAitUJAirtSsAitUJAirtSsAitUJAi", "                                                      .LANGa.                                                     ClassJAVA");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test39102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest78.test39102");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfAnyBut("                                    Jvstringnlrrylistrrylistrrylistvj", "                                                                                                                                                                                       #########################################################################java.uti#########################################################################Arralitu.avajlitu.avajArralitu.avajlitu.avajArralitu.avajlitu.avajArralitu.avajlitu.avajArralitu.avajlitu.avajArralitu.avajlitu.avajArralitu.avajlitu");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 36 + "'", int2 == 36);
    }

    @Test
    public void test39103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest78.test39103");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOfIgnoreCase("...444444.444444444444444444...44444444444444444.444444444444444444...44444$aenolc.gnaelbagaga.langagaga.langagaga.langagaga.langagaga.langagaga.langagaga.langagaga.langagaga.langagaga.langagaga.langagaga.langagaga.langagaga.langagaga.langagaga.langagaga.langagaga.langagaga.langagaga.langagaga.langagaga.langagaga.langagaga.langagaga.langagaga.langagaga.langagaga.langagaga.langagaga.langagaga.langagaga.langagaga.langagaga.langagaga.langafretnigniragecagaoi.aenolc.gnaelbagaga.langagaga.langagaga.langagaga.langagaga.langagaga.langagaga.langagaga.langagaga.langagaga.langagaga.langagaga.langagaga.langagaga.langagaga.langagaga.langagaga.langagaga.langagaga.langagaga.langagaga.langagaga.langagaga.langagaga.langagaga.langagaga.langagaga.langagaga.langagaga.langagaga.langagaga.langagaga.langagaga.langagaga.langagaga.langafretnigniragecagaoi.aenolc.gnaelb", "         Integer              ");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test39104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest78.test39104");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNotEmpty((java.lang.CharSequence) "AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test39105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest78.test39105");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeStartIgnoreCase("                                                                                                                                                               AAAAAAAAAAAAAAAAAAAgnaluavajAAAAAAAAAAAAAAAAAAA", "44444444444444444444444444interface javalangCloneableINTERFACE JAVALANGCL");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                                                                                                                                               AAAAAAAAAAAAAAAAAAAgnaluavajAAAAAAAAAAAAAAAAAAA" + "'", str2, "                                                                                                                                                               AAAAAAAAAAAAAAAAAAAgnaluavajAAAAAAAAAAAAAAAAAAA");
    }

    @Test
    public void test39106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest78.test39106");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("interface java.lang.CloneableVAJinterface java.io.Serializable", "gnl$LNuLNuLNuLNuLNuLNuLNuLNuLNuLNuLNuLNu", 139);
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void test39107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest78.test39107");
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
        java.lang.Class<?>[] wildcardClassArray21 = org.apache.commons.lang3.ClassUtils.wrappersToPrimitives(wildcardClassArray16);
        java.lang.String[] strArray24 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("hi!", "");
        java.lang.String[] strArray26 = org.apache.commons.lang3.StringUtils.stripAll(strArray24, "$");
        java.lang.Class<?>[] wildcardClassArray27 = org.apache.commons.lang3.ClassUtils.toClass((java.lang.Object[]) strArray24);
        java.lang.Class<?>[] wildcardClassArray28 = org.apache.commons.lang3.ClassUtils.toClass((java.lang.Object[]) wildcardClassArray27);
        java.lang.String str32 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) wildcardClassArray28, '#', (int) (byte) -1, (-1));
        java.lang.Class<?> wildcardClass33 = null;
        java.lang.Class[] classArray35 = new java.lang.Class[1];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray36 = (java.lang.Class<?>[]) classArray35;
        wildcardClassArray36[0] = wildcardClass33;
        java.lang.Class<?>[] wildcardClassArray39 = org.apache.commons.lang3.ClassUtils.primitivesToWrappers(wildcardClassArray36);
        java.lang.Class<?>[] wildcardClassArray40 = org.apache.commons.lang3.ClassUtils.primitivesToWrappers(wildcardClassArray36);
        boolean boolean41 = org.apache.commons.lang3.ClassUtils.isAssignable(wildcardClassArray28, wildcardClassArray40);
        java.lang.String str43 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) wildcardClassArray40, "                                  ");
        java.lang.String[] strArray46 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("class java.lang.String", "                                   ");
        java.lang.String[] strArray47 = org.apache.commons.lang3.StringUtils.stripAll(strArray46);
        java.lang.Class<?>[] wildcardClassArray48 = org.apache.commons.lang3.ClassUtils.toClass((java.lang.Object[]) strArray47);
        java.lang.Class<?>[] wildcardClassArray49 = org.apache.commons.lang3.ClassUtils.primitivesToWrappers(wildcardClassArray48);
        boolean boolean50 = org.apache.commons.lang3.ClassUtils.isAssignable(wildcardClassArray40, wildcardClassArray48);
        java.lang.Class<?>[] wildcardClassArray51 = org.apache.commons.lang3.ClassUtils.wrappersToPrimitives(wildcardClassArray48);
        boolean boolean53 = org.apache.commons.lang3.ClassUtils.isAssignable(wildcardClassArray16, wildcardClassArray48, false);
        java.lang.Class<?>[] wildcardClassArray54 = org.apache.commons.lang3.ClassUtils.primitivesToWrappers(wildcardClassArray48);
        java.lang.String str56 = org.apache.commons.lang3.ClassUtils.getPackageName((java.lang.Object) wildcardClassArray54, "aaaaaaaaaaaaaaaaaaaaaagn");
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
        org.junit.Assert.assertNotNull(strArray24);
        org.junit.Assert.assertNotNull(strArray26);
        org.junit.Assert.assertNotNull(wildcardClassArray27);
        org.junit.Assert.assertNotNull(wildcardClassArray28);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "" + "'", str32, "");
        org.junit.Assert.assertNotNull(classArray35);
        org.junit.Assert.assertNotNull(wildcardClassArray36);
        org.junit.Assert.assertNotNull(wildcardClassArray39);
        org.junit.Assert.assertNotNull(wildcardClassArray40);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "" + "'", str43, "");
        org.junit.Assert.assertNotNull(strArray46);
        org.junit.Assert.assertNotNull(strArray47);
        org.junit.Assert.assertNotNull(wildcardClassArray48);
        org.junit.Assert.assertNotNull(wildcardClassArray49);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + true + "'", boolean50 == true);
        org.junit.Assert.assertNotNull(wildcardClassArray51);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
        org.junit.Assert.assertNotNull(wildcardClassArray54);
        org.junit.Assert.assertEquals("'" + str56 + "' != '" + "java.lang" + "'", str56, "java.lang");
    }

    @Test
    public void test39108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest78.test39108");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceChars("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaat", '#', '#');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaat" + "'", str3, "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaat");
    }

    @Test
    public void test39109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest78.test39109");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass1 = org.apache.commons.lang3.ClassUtils.getClass(".............][ssalc                         .............");
            org.junit.Assert.fail("Expected exception of type java.lang.ClassNotFoundException; message: /////////////][ssalc/////////////");
        } catch (java.lang.ClassNotFoundException e) {
            // Expected exception.
        }
    }

    @Test
    public void test39110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest78.test39110");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlpha((java.lang.CharSequence) "JAVA.UTILJAVA.UTILStringcJAVA.UTILJAVA.UTILStringcJAVA.UTILJAVA.UTILStringcJAVA.UTILJAVA.UTILStringcJAVA.UTILJAVA.UTILStringcJAVA.UTILJAVA.UTILStringcJAVA.UTILJAVA.UTILStringcJAVA.UTILJAVA.UTILStringcJAVA.UTILJAVA.UTILStringcJAVA.UTILJAVA.UTILStringcJAVA.UTILJAVA.UTILStringcJAVA.UTILJAVA.UTILStringcJAVA.UTILJAVA.UTILStringcJAVA.UTILJAVA.UTILStringcJAVA.UTILJAVA.UTILStringcJAVA.UTILJAVA.UTILStringcJAVA.UTILJAVA.UTILStringcJAVA.UTILJAVA.UTILStringcJAVA.UTILJAVA.UTILStringcJAVA.UTILJAVA.UTILStringcJAVA.UTILJAVA.UTILStringcJAVA.UTILJAVA.UTILStringcJAVA.UTILJAVA");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test39111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest78.test39111");
        int int3 = org.apache.commons.lang3.StringUtils.indexOf("saitujairtssaitujairtssaitujairtssaitujairtssaitujairtssaitujairtssaitujairtssaitujairtssaitujairtssaitujairts", "###########itu.avaj###########################", 659);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test39112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest78.test39112");
        java.lang.CharSequence charSequence2 = org.apache.commons.lang3.StringUtils.defaultIfEmpty((java.lang.CharSequence) "gnalArrayListArrayListArrayListavaj.gnalArrayListArrayListArrayLi...aL.ArrayListgnal.aL.ArrayList...aL.ArrayListgnal.aL.ArrayList...aL.ArrayListgnal.aL.", (java.lang.CharSequence) "aenolc.gnaelbagaga.langagaga.langagaga.langagaga.langagaga.langagaga.langagaga.langagaga.langagaga.langagaga.langagaga.langagaga.langagaga.langagaga.langagaga.langagaga.langagaga.langagaga.langagaga.langagaga.langagaga.langagaga.langagaga.langagaga.langagaga.langagaga.langagaga.langagaga.langagaga.langagaga.langagaga.langagaga.langagaga.langagaga.langagaga.langafretnigniragecagaoi.");
        org.junit.Assert.assertEquals("'" + charSequence2 + "' != '" + "gnalArrayListArrayListArrayListavaj.gnalArrayListArrayListArrayLi...aL.ArrayListgnal.aL.ArrayList...aL.ArrayListgnal.aL.ArrayList...aL.ArrayListgnal.aL." + "'", charSequence2, "gnalArrayListArrayListArrayListavaj.gnalArrayListArrayListArrayLi...aL.ArrayListgnal.aL.ArrayList...aL.ArrayListgnal.aL.ArrayList...aL.ArrayListgnal.aL.");
    }

    @Test
    public void test39113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest78.test39113");
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
        java.lang.String str32 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) wildcardClassArray20, '#', (int) ' ', 10);
        java.lang.Class<?>[] wildcardClassArray33 = org.apache.commons.lang3.ClassUtils.primitivesToWrappers(wildcardClassArray20);
        java.lang.Class<?>[] wildcardClassArray34 = org.apache.commons.lang3.ClassUtils.wrappersToPrimitives(wildcardClassArray33);
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
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "" + "'", str32, "");
        org.junit.Assert.assertNotNull(wildcardClassArray33);
        org.junit.Assert.assertNotNull(wildcardClassArray34);
    }

    @Test
    public void test39114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest78.test39114");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBeforeLast("", "Serializable");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test39115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest78.test39115");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.defaultString("                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                     ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                     " + "'", str1, "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                     ");
    }

    @Test
    public void test39116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest78.test39116");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.endsWithIgnoreCase("iRFCO.IRFIOSRII", "Serializable                                                                                                                                                                                                                                                                                                                                                                                                                                                .io.Cloneable][sslCinterface java.lang.                                                                                                                                                                                                                                                                                                                                                                                                                                                interface java");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test39117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest78.test39117");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.containsWhitespace("                                                                                                                                                                                                                                                                                                                                                                                                                 ##################################################java.uti#########################################################################");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test39118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest78.test39118");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("", "interfacejava.lang.Cloneable#interfacejava.i", 409);
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void test39119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest78.test39119");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitByCharacterType("rrclass javalangObjectyst");
        java.lang.String str3 = org.apache.commons.lang3.ClassUtils.getShortCanonicalName((java.lang.Object) "rrclass javalangObjectyst", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaainterface java.lang.Cloneable... ... ... ... ... ... ... ... interface java.io.Serializableaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "String" + "'", str3, "String");
    }

    @Test
    public void test39120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest78.test39120");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.split("a.lang.cloneablestringinterface java.io                          a.lang.cloneablestringinterface java.io                          a.lang.cloneablestringinterface java.io                          a.lang.cloneablestringinterface java.io                          a.lang.cloneablestringinterface java.io                          a.lang.cloneablestringinterface java.io                          a.lang.cloneablestringinterface java.io                          a.lang.cloneablestringinterface java.io                          a.lang.cloneablestringinterface java.io                          a.lang.cloneablestringinterface java.io                          ", "...sAitUJAirtSsAijavaulainterface java.lang.Cloneable4interface java.io.Serializable");
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test39121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest78.test39121");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "LANGgn lgn lgn lgn lgn lgn lgn lgn lgn lgn lgn lgn lgn lgn lgn lgn lgn lgn lgn lgn lgn lgn lgn lgn lgn lgn lgn lgn lgn lgn lgn lgn lgn lgn lgn lgn lgn lgn lgn lgn lgn lgn lgn lgn lgn lgn lgn lgn lgn lgn lgn lgn lgn lgn lgn lgn lgn lgn lgn lgn lgn lgn lgn lgn lgn lgn lgn lgn lgn lgn lgn lgn lgn lgn lgn lgn lgn lgn lgn lgn lgn lgn lgn lgn lgn lgn lgn lgn lgn lgn lgn lgn lgn lgn lgn lgn lgn lgn lgn lgn lgn lgn lgn lgn lgn lgn lgn lgn lgn lgn lgn lg", "iiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiii");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test39122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest78.test39122");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceOnce("                                                                                                                                                                                                                                                                                                                                                                                                                                                                     litu                                                                                                                                                                                                                 ", "                                        javaulang                                         ", "aj  aj  aj  aj  aj  aj$#######$########aj  aj  aj  aj  aj  aj                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                 ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "                                                                                                                                                                                                                                                                                                                                                                                                                                                                     litu                                                                                                                                                                                                                 " + "'", str3, "                                                                                                                                                                                                                                                                                                                                                                                                                                                                     litu                                                                                                                                                                                                                 ");
    }

    @Test
    public void test39123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest78.test39123");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.stripStart("tsilyrrgnluvj                       tsilyrrgnluvj", "4A4A4hhhh4AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAhhh4AAA");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "tsilyrrgnluvj                       tsilyrrgnluvj" + "'", str2, "tsilyrrgnluvj                       tsilyrrgnluvj");
    }

    @Test
    public void test39124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest78.test39124");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "############                                  ", "interface#java.lang.cloneable4interface#java.io.serializableinterface#java.lang.cloneable4interface#java.io.serializableinterface#java.lang.cloneable4interface#java.io.serializableinterface#java.lang.cloneable4interface#java.io.serializableinterface#java.lang.cloneable4interface#java.io.serializableinterface#java.lang.cloneable4interface#java.io.serializableinterface#java.lang.cloneable4interface#java.io.serializableaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test39125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest78.test39125");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.leftPad("Java.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava..", 121, 'a');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Java.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.." + "'", str3, "Java.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava..");
    }

    @Test
    public void test39126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest78.test39126");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.split("javatsi", "...                                            ..                                            ..                                            ..                                            ..                                            ..                                            ..                                            ..                                            ..                                            ..                                            ..                                            ..", 714);
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void test39127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest78.test39127");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.remove("JAVAL AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAGN", "#####A##ay...#####A##ay...#####A##ay...#####A##ay...#####A##ay...#####A##ay...#####A##ay...#####A##ay...#####A##ay...#####A##ay...#####A##ay...#####A##ay...#####A##ay...#####A##ay...#####A##ay...#####A##ay...#####A##ay...#####A##ay...#####A##ay...#####A##ay...#####A##ay...#####A##ay...#####A##ay...#####A##ay...#####A##ay...#####A##ay...#####A##ay...#####A##ay...#####A##ay...#####A##ay...#####A##ay...#####A##ay..Llitu...O.gnal.avaj ssalcr...O.");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "JAVAL AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAGN" + "'", str2, "JAVAL AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAGN");
    }

    @Test
    public void test39128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest78.test39128");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.mid(".........................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................", 494, 98);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + ".................................................................................................." + "'", str3, "..................................................................................................");
    }

    @Test
    public void test39129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest78.test39129");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass1 = org.apache.commons.lang3.ClassUtils.getClass("iLyarrAtsiLyarrAtsiLyarrAlang.javatsiLyarrAtsiLyarrAtsiLyarrA");
            org.junit.Assert.fail("Expected exception of type java.lang.ClassNotFoundException; message: iLyarrAtsiLyarrAtsiLyarrAlang.javatsiLyarrAtsiLyarrAtsiLyarrA");
        } catch (java.lang.ClassNotFoundException e) {
            // Expected exception.
        }
    }

    @Test
    public void test39130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest78.test39130");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isWhitespace((java.lang.CharSequence) "irfCo$irfioSrA..ayLA                                                                           ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test39131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest78.test39131");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.substringsBetween("interface java.lang.Cloneableg.JAVA.L$ArrayListg.JAVA.L$ArrayListg.JAVA.L$ArrayListg.JAVA.L$ArrayListg.JAVA.L$ArrayListg.JAVA.L$ArrayListg.JAVA.L$ArrayListg.JAVA.L$ArrayListg.JAVA.L$ArrayListg.JAVA.L$ArrayListg.JAVA.L$ArrayListg.JAVA.L$ArrayListg.JAVA.L$ArrayListg.JAVA.L$ArrayListg.JAVA.L$ArrayListg.JAVA.L$ArrayListg.JAVA.L$ArrayListg.JAVA.L$ArrayListg.JAVA.L$ArrayListg.JAVA.L$ArrayListg.JAVA.L$ArrayListg.JAVA.L$ArrayListg.JAVA.L$ArrayListg.JAVA.L$ArrayListg.JAVA.L$ArrayListg.JAVA.L$ArrayListg.JAVA.L$ArrayListg.JAVA.L$ArrayListg.JAVA.L$ArrayListg.JAVA.L$ArrayListg.JAVA.L$ArrayListg.JAVA.L$ArrayListg.JAVA.L$ArrayListg.JAVA.L$ArrayListg.JAVA.L$ArrayListg.JAVA.L$ArrayListg.JAVA.L$ArrayListg.JAVA.L$ArrayListg.JAVA.L$ArrayListg.JAVA.L$ArrayListg.JAVA.L$ArrayListg.JAVA.L$ArrayListg.JAVA.L$ArrayListg.JAVA.L$ArrayListg.JAVA.L$ArrayListginterface java.io.Serializable", "        44444444444444444444444444444444444444444444444444444444444444444444444444444444", "]tuaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertNull(strArray3);
    }

    @Test
    public void test39132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest78.test39132");
        int int3 = org.apache.commons.lang3.StringUtils.indexOfIgnoreCase("ceaj v al ngaClone bleaaaaaaaj v aaaaaaaaaaj v aaaaaaaaaaj v aaaaaaaaaaj v aaaaaaaaaaj v aaaaaaaaaaj v aaaaaaaaaaj v aaaaaaaaaaj v aaaaaaaaaaj v aaaaaaaaaaj v aaaaaaaaaaj v aaaaaaaaaaj v aaaaaaaaaaj v aaaaaaaaaaj v aaaaaaaaaaj v aaaaaaaaaaj v aaaaaaaaaaj v aaaaaaaaaaj v aaaaaaaaaaj v aaaaaaaaaaj v aaaaaaaaaaj v aaaaaaaaaaj v aaaaaaaaaaj v aaaaaaaaaaj v aaaaaaaaaaj v aaaaaaaaaaj v aaaaaaaaaaj v aaaaaaaaaaj v aaaaaaaaaaj v aaaaaaaaaaj v aaaaaaaaaaj v aaaaaaaaaaj v aaaaaaaaaaj v aaaaaaaaaaj v aaaaaaaaaaj v interf ceaj v aioaSeri liz ble", "... java.lang.Stringclass java.lang.Stringclass...                                                                                                                              interface java.lang.Cloneable4interface java.io.Serializabl                                                                                                            ... java.lang.Stringclass java.l                        L.Arr#yList", 202);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test39133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest78.test39133");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("                                   ", 'a');
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray2, "g.");
        java.lang.String str6 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray2, "                                                             nga$lavaj                                                             ");
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "                                   " + "'", str4, "                                   ");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "                                   " + "'", str6, "                                   ");
    }

    @Test
    public void test39134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest78.test39134");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.rightPad("JAVALITUAVAJLITUAVAJJAVALITUAVAJLITUAVAJJAVALITUAVAJLITUAVAJJAVALITUAVAJLITUAVAJJAVALITUAVAJLITUAVAJJAVALITUAVAJLITUAVAJJAVALITUAVAJLITUAVAJJAVALITUAVAJLITUAVAJJAVALITUAVAJLITUAVAJJAVALITUAVAJLITUAVAJJAVALITUAVAJLITUAVAJJAVALITUAVAJLITUAVAJJAVALITUAVAJLITUAVAJJAVALITUAVAJLITUAVAJJAVALITUAVAJLITUAVAJJAVALITUAVAJLITUAVAJJAVALITUAVAJLITUAVAJJAVALITUAVAJLITUAVAJJAVALITUAVAJLITUAVAJJAVALITUAVAJLITUAVAJJAVALITUAVAJLITUAVAJJAVALITUAVAJLITUAVAJJAVALITUAVAJLITUAVAJJAVALITUAVAJLITUAVAJJAVALITUAVAJLITUAVAJJAVALITUAVAJLITUAVAJJAVALITUAVAJLITUAVAJJAVALITUAVAJLITUAVAJJAVALITUAVAJLITUAVAJJAVALITUAVAJLITUAVAJJAVALITUAVAJLITUAVAJJAVALITUAVAJLITUAVAJJAVALITUAVAJLITUAVAJ", 257);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "JAVALITUAVAJLITUAVAJJAVALITUAVAJLITUAVAJJAVALITUAVAJLITUAVAJJAVALITUAVAJLITUAVAJJAVALITUAVAJLITUAVAJJAVALITUAVAJLITUAVAJJAVALITUAVAJLITUAVAJJAVALITUAVAJLITUAVAJJAVALITUAVAJLITUAVAJJAVALITUAVAJLITUAVAJJAVALITUAVAJLITUAVAJJAVALITUAVAJLITUAVAJJAVALITUAVAJLITUAVAJJAVALITUAVAJLITUAVAJJAVALITUAVAJLITUAVAJJAVALITUAVAJLITUAVAJJAVALITUAVAJLITUAVAJJAVALITUAVAJLITUAVAJJAVALITUAVAJLITUAVAJJAVALITUAVAJLITUAVAJJAVALITUAVAJLITUAVAJJAVALITUAVAJLITUAVAJJAVALITUAVAJLITUAVAJJAVALITUAVAJLITUAVAJJAVALITUAVAJLITUAVAJJAVALITUAVAJLITUAVAJJAVALITUAVAJLITUAVAJJAVALITUAVAJLITUAVAJJAVALITUAVAJLITUAVAJJAVALITUAVAJLITUAVAJJAVALITUAVAJLITUAVAJJAVALITUAVAJLITUAVAJJAVALITUAVAJLITUAVAJ" + "'", str2, "JAVALITUAVAJLITUAVAJJAVALITUAVAJLITUAVAJJAVALITUAVAJLITUAVAJJAVALITUAVAJLITUAVAJJAVALITUAVAJLITUAVAJJAVALITUAVAJLITUAVAJJAVALITUAVAJLITUAVAJJAVALITUAVAJLITUAVAJJAVALITUAVAJLITUAVAJJAVALITUAVAJLITUAVAJJAVALITUAVAJLITUAVAJJAVALITUAVAJLITUAVAJJAVALITUAVAJLITUAVAJJAVALITUAVAJLITUAVAJJAVALITUAVAJLITUAVAJJAVALITUAVAJLITUAVAJJAVALITUAVAJLITUAVAJJAVALITUAVAJLITUAVAJJAVALITUAVAJLITUAVAJJAVALITUAVAJLITUAVAJJAVALITUAVAJLITUAVAJJAVALITUAVAJLITUAVAJJAVALITUAVAJLITUAVAJJAVALITUAVAJLITUAVAJJAVALITUAVAJLITUAVAJJAVALITUAVAJLITUAVAJJAVALITUAVAJLITUAVAJJAVALITUAVAJLITUAVAJJAVALITUAVAJLITUAVAJJAVALITUAVAJLITUAVAJJAVALITUAVAJLITUAVAJJAVALITUAVAJLITUAVAJJAVALITUAVAJLITUAVAJ");
    }

    @Test
    public void test39135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest78.test39135");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.split("CLASS JAVA.UTIL.ABSTRACTLISTGN LU V J ....................................................................CLASS JAVA.UTIL.ABSTRACTCOLLECTIONGN LU V J ....................................................................CLASS JAVA.LANG.OBJEC", "saaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$", 446);
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void test39136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest78.test39136");
        java.lang.CharSequence charSequence0 = null;
        int int2 = org.apache.commons.lang3.StringUtils.indexOfDifference(charSequence0, (java.lang.CharSequence) "TSILYARRGNALUAVAJTSILYARRGNALUAVAJ");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test39137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest78.test39137");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.substringBetween("interface javalangCloneableINTERFACE JAVALANGCL", "A..AYL A.44444444444444444444444444                                                 $$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$", "aRR... AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA... AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA... AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA... AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA... AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA... AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA... AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA... AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA... AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA.");
        org.junit.Assert.assertNull(str3);
    }

    @Test
    public void test39138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest78.test39138");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "$$$$$$$$$$$$$$$$$$$$$$$$$$$$$", "avaj.gnalnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAA");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test39139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest78.test39139");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trim("stringUtilsStringUtilsStringUtilsStringUtilsStringUtilsStringUtilsStr...");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "stringUtilsStringUtilsStringUtilsStringUtilsStringUtilsStringUtilsStr..." + "'", str1, "stringUtilsStringUtilsStringUtilsStringUtilsStringUtilsStringUtilsStr...");
    }

    @Test
    public void test39140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest78.test39140");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("hi!", "");
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.stripAll(strArray2, "$");
        java.lang.Class<?>[] wildcardClassArray5 = org.apache.commons.lang3.ClassUtils.toClass((java.lang.Object[]) strArray2);
        java.lang.Class<?>[] wildcardClassArray6 = org.apache.commons.lang3.ClassUtils.toClass((java.lang.Object[]) wildcardClassArray5);
        java.lang.String str10 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) wildcardClassArray6, '#', (int) (byte) -1, (-1));
        java.lang.Class<?> wildcardClass11 = null;
        java.lang.Class[] classArray13 = new java.lang.Class[1];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray14 = (java.lang.Class<?>[]) classArray13;
        wildcardClassArray14[0] = wildcardClass11;
        java.lang.Class<?>[] wildcardClassArray17 = org.apache.commons.lang3.ClassUtils.primitivesToWrappers(wildcardClassArray14);
        java.lang.Class<?>[] wildcardClassArray18 = org.apache.commons.lang3.ClassUtils.primitivesToWrappers(wildcardClassArray14);
        boolean boolean19 = org.apache.commons.lang3.ClassUtils.isAssignable(wildcardClassArray6, wildcardClassArray18);
        java.lang.String str21 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) wildcardClassArray18, "                                  ");
        java.lang.Class<?>[] wildcardClassArray22 = org.apache.commons.lang3.ClassUtils.toClass((java.lang.Object[]) wildcardClassArray18);
        java.lang.Class<?>[] wildcardClassArray23 = org.apache.commons.lang3.ClassUtils.wrappersToPrimitives(wildcardClassArray22);
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
        java.lang.Class<?>[] wildcardClassArray54 = org.apache.commons.lang3.ClassUtils.primitivesToWrappers(wildcardClassArray53);
        java.lang.Class<?>[] wildcardClassArray55 = org.apache.commons.lang3.ClassUtils.wrappersToPrimitives(wildcardClassArray53);
        java.lang.String str57 = org.apache.commons.lang3.ClassUtils.getShortClassName((java.lang.Object) wildcardClassArray53, "#                                   ");
        java.lang.Class<?>[] wildcardClassArray58 = org.apache.commons.lang3.ClassUtils.primitivesToWrappers(wildcardClassArray53);
        java.lang.String str60 = org.apache.commons.lang3.ClassUtils.getShortCanonicalName((java.lang.Object) wildcardClassArray53, "AAAA                       JAVAULANGvvayLasa");
        boolean boolean62 = org.apache.commons.lang3.ClassUtils.isAssignable(wildcardClassArray23, wildcardClassArray53, true);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertNotNull(wildcardClassArray5);
        org.junit.Assert.assertNotNull(wildcardClassArray6);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(classArray13);
        org.junit.Assert.assertNotNull(wildcardClassArray14);
        org.junit.Assert.assertNotNull(wildcardClassArray17);
        org.junit.Assert.assertNotNull(wildcardClassArray18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertNotNull(wildcardClassArray22);
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
        org.junit.Assert.assertNotNull(wildcardClassArray54);
        org.junit.Assert.assertNotNull(wildcardClassArray55);
        org.junit.Assert.assertEquals("'" + str57 + "' != '" + "Class[]" + "'", str57, "Class[]");
        org.junit.Assert.assertNotNull(wildcardClassArray58);
        org.junit.Assert.assertEquals("'" + str60 + "' != '" + "Class[]" + "'", str60, "Class[]");
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + true + "'", boolean62 == true);
    }

    @Test
    public void test39141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest78.test39141");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.startsWithIgnoreCase("                                            ARRA                                            ", "");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test39142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest78.test39142");
        java.lang.String[] strArray2 = new java.lang.String[] { "                                   " };
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.getCommonPrefix(strArray2);
        java.lang.Class<?>[] wildcardClassArray4 = org.apache.commons.lang3.ClassUtils.toClass((java.lang.Object[]) strArray2);
        java.lang.String str5 = org.apache.commons.lang3.StringUtils.concatWith("$", (java.lang.Object[]) wildcardClassArray4);
        java.lang.Class<?>[] wildcardClassArray6 = org.apache.commons.lang3.ClassUtils.wrappersToPrimitives(wildcardClassArray4);
        java.lang.Class<?>[] wildcardClassArray7 = org.apache.commons.lang3.ClassUtils.wrappersToPrimitives(wildcardClassArray6);
        java.lang.String[] strArray9 = org.apache.commons.lang3.StringUtils.splitByCharacterType("####");
        java.lang.Class<?>[] wildcardClassArray10 = org.apache.commons.lang3.ClassUtils.toClass((java.lang.Object[]) strArray9);
        boolean boolean12 = org.apache.commons.lang3.ClassUtils.isAssignable(wildcardClassArray6, wildcardClassArray10, true);
        java.lang.Class[] classArray14 = new java.lang.Class[0];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray15 = (java.lang.Class<?>[]) classArray14;
        java.lang.Class<?>[] wildcardClassArray16 = org.apache.commons.lang3.ClassUtils.primitivesToWrappers(wildcardClassArray15);
        java.lang.Class<?> wildcardClass17 = null;
        java.lang.Class[] classArray19 = new java.lang.Class[1];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray20 = (java.lang.Class<?>[]) classArray19;
        wildcardClassArray20[0] = wildcardClass17;
        java.lang.Class<?>[] wildcardClassArray23 = org.apache.commons.lang3.ClassUtils.primitivesToWrappers(wildcardClassArray20);
        boolean boolean25 = org.apache.commons.lang3.ClassUtils.isAssignable(wildcardClassArray15, wildcardClassArray20, true);
        java.lang.Class[] classArray27 = new java.lang.Class[0];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray28 = (java.lang.Class<?>[]) classArray27;
        java.lang.Class<?>[] wildcardClassArray29 = org.apache.commons.lang3.ClassUtils.primitivesToWrappers(wildcardClassArray28);
        java.lang.String str31 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) wildcardClassArray29, "...                                 ");
        boolean boolean32 = org.apache.commons.lang3.ClassUtils.isAssignable(wildcardClassArray20, wildcardClassArray29);
        java.lang.String str36 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) wildcardClassArray29, "aRRAYlISTaRRAYlISTaRRAYlISTaRRAYlIS", 929, 0);
        java.lang.Class<?>[] wildcardClassArray37 = org.apache.commons.lang3.ClassUtils.primitivesToWrappers(wildcardClassArray29);
        java.lang.Class<?>[] wildcardClassArray38 = org.apache.commons.lang3.ClassUtils.wrappersToPrimitives(wildcardClassArray37);
        java.lang.Class<?>[] wildcardClassArray39 = org.apache.commons.lang3.ClassUtils.primitivesToWrappers(wildcardClassArray38);
        boolean boolean41 = org.apache.commons.lang3.ClassUtils.isAssignable(wildcardClassArray6, wildcardClassArray38, false);
        java.lang.Class<?> wildcardClass42 = null;
        java.lang.Class[] classArray44 = new java.lang.Class[1];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray45 = (java.lang.Class<?>[]) classArray44;
        wildcardClassArray45[0] = wildcardClass42;
        java.lang.Class[] classArray49 = new java.lang.Class[0];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray50 = (java.lang.Class<?>[]) classArray49;
        boolean boolean52 = org.apache.commons.lang3.ClassUtils.isAssignable(wildcardClassArray45, wildcardClassArray50, false);
        java.lang.Class<?>[] wildcardClassArray53 = org.apache.commons.lang3.ClassUtils.primitivesToWrappers(wildcardClassArray45);
        boolean boolean55 = org.apache.commons.lang3.ClassUtils.isAssignable(wildcardClassArray6, wildcardClassArray53, false);
        java.lang.String str57 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) wildcardClassArray6, '#');
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "                                   " + "'", str3, "                                   ");
        org.junit.Assert.assertNotNull(wildcardClassArray4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "class java.lang.String" + "'", str5, "class java.lang.String");
        org.junit.Assert.assertNotNull(wildcardClassArray6);
        org.junit.Assert.assertNotNull(wildcardClassArray7);
        org.junit.Assert.assertNotNull(strArray9);
        org.junit.Assert.assertNotNull(wildcardClassArray10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(classArray14);
        org.junit.Assert.assertNotNull(wildcardClassArray15);
        org.junit.Assert.assertNotNull(wildcardClassArray16);
        org.junit.Assert.assertNotNull(classArray19);
        org.junit.Assert.assertNotNull(wildcardClassArray20);
        org.junit.Assert.assertNotNull(wildcardClassArray23);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(classArray27);
        org.junit.Assert.assertNotNull(wildcardClassArray28);
        org.junit.Assert.assertNotNull(wildcardClassArray29);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "" + "'", str31, "");
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "" + "'", str36, "");
        org.junit.Assert.assertNotNull(wildcardClassArray37);
        org.junit.Assert.assertNotNull(wildcardClassArray38);
        org.junit.Assert.assertNotNull(wildcardClassArray39);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertNotNull(classArray44);
        org.junit.Assert.assertNotNull(wildcardClassArray45);
        org.junit.Assert.assertNotNull(classArray49);
        org.junit.Assert.assertNotNull(wildcardClassArray50);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertNotNull(wildcardClassArray53);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
        org.junit.Assert.assertEquals("'" + str57 + "' != '" + "" + "'", str57, "");
    }

    @Test
    public void test39143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest78.test39143");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.rightPad("LANG.GNALJAVA.LANGAVAJ.GNALJAVA.LANGAVAJ.GNALJAVA.LANGAVAJ.GNALJAVA.LANGAVAJ.GNALJAVA.LANGAVAJ.GNALJAVA.LANGAVAJ.GNALJAVA.LANGAVAJ.GNALJAVA.LANGAVAJ.JAVA", 939);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "LANG.GNALJAVA.LANGAVAJ.GNALJAVA.LANGAVAJ.GNALJAVA.LANGAVAJ.GNALJAVA.LANGAVAJ.GNALJAVA.LANGAVAJ.GNALJAVA.LANGAVAJ.GNALJAVA.LANGAVAJ.GNALJAVA.LANGAVAJ.JAVA                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                  " + "'", str2, "LANG.GNALJAVA.LANGAVAJ.GNALJAVA.LANGAVAJ.GNALJAVA.LANGAVAJ.GNALJAVA.LANGAVAJ.GNALJAVA.LANGAVAJ.GNALJAVA.LANGAVAJ.GNALJAVA.LANGAVAJ.GNALJAVA.LANGAVAJ.JAVA                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                  ");
    }

    @Test
    public void test39144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest78.test39144");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripAccents((java.lang.CharSequence) "                                                    ...    ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "                                                    ...    " + "'", str1, "                                                    ...    ");
    }

    @Test
    public void test39145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest78.test39145");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByCharacterTypeCamelCase("$         44444444444444444444444444444444444444444444444444444444444444444444444444444444");
        boolean boolean3 = org.apache.commons.lang3.StringUtils.startsWithAny("################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################", strArray2);
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.stripAll(strArray2);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(strArray4);
    }

    @Test
    public void test39146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest78.test39146");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("gnal.avajgnal.avajgnal.avajgnal.avajgnal.avajgnal.avajgnal.avajgnal.avajgnal.avajgnal.avajgnal.avajgnal.avajgnal.avajgnal.avajgnal.avajgnal.avajgnal.avajgnal.avajgnal.avajgnal.avajgnal.avajgnal.avajgnal.avajgnal.avajgnal.avajgnal.avajgnal.avajgnal.avagnal.avaaaaaaaaaa4444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444vaJgnal.avajgnal.avajgnal.avajgnal.avajgnal.avajgnal.avajgnal.avajgnal.avajgnal.avajgnal.avajgnal.avajgnal.avajgnal.avajgnal.avajgnal.avajgnal.avajgnal.avajgnal.avajgnal.avajgnal.avajgnal.avajgnal.avajgnal.avajgnal.avajgnal.avajgnal.avajgnal.avajgnal.avagnal.avaaaaaaaaaa4444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444vaJgnal.avajgnal.avajgnal.avajgnal.avajgnal.avajgnal.avajgnal", "$         $         $         $         $         $         $         $         $         $         $         $ ...", 206);
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void test39147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest78.test39147");
        int int2 = org.apache.commons.lang3.StringUtils.countMatches("                                                                                                                                     ][gnirtSlitu.avaj1-", "UTILsTRINGSerializabl...     java44444444444444444.4444");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test39148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest78.test39148");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.chop("########################################################################################################################################################################################################################################################################################################################################################################################################################....................................");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "########################################################################################################################################################################################################################################################################################################################################################################################################################..................................." + "'", str1, "########################################################################################################################################################################################################################################################################################################################################################################################################################...................................");
    }

    @Test
    public void test39149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest78.test39149");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.chop("                       javaulangrraylist                       javaulangrraylist          ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "                       javaulangrraylist                       javaulangrraylist         " + "'", str1, "                       javaulangrraylist                       javaulangrraylist         ");
    }

    @Test
    public void test39150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest78.test39150");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.defaultString("......................................................................................................................................................................................................................................................................................................................................................................................................................................................................stJAVAGNAL                                                           ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "......................................................................................................................................................................................................................................................................................................................................................................................................................................................................stJAVAGNAL                                                           " + "'", str1, "......................................................................................................................................................................................................................................................................................................................................................................................................................................................................stJAVAGNAL                                                           ");
    }

    @Test
    public void test39151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest78.test39151");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.strip("char[]INTERFACE JAVA.LANG.cLONEABLEsTRINGINTERFACE JAVA.IO.sERIALIZABLE", "hi!Array...");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "char[]INTERFACE JAVA.LANG.cLONEABLEsTRINGINTERFACE JAVA.IO.sERIALIZABLE" + "'", str2, "char[]INTERFACE JAVA.LANG.cLONEABLEsTRINGINTERFACE JAVA.IO.sERIALIZABLE");
    }

    @Test
    public void test39152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest78.test39152");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("", "                                                                                                                                                                                                                                             HI!aRRAYlISTaRRAYlISTaRRAYlISTAVAJ", 507);
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void test39153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest78.test39153");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceOnce("tu]tu", ".LANG.LANG.LANG.LANG", "             Character             utilStraaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "tu]tu" + "'", str3, "tu]tu");
    }

    @Test
    public void test39154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest78.test39154");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOfIgnoreCase("4444444444444444444444444444", "#########################################################################################yList");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test39155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest78.test39155");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.leftPad("Class444444444444444444444444444444444444444444444444444444444444444444444444444", 423);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                                                                                                                                                                                                                                                                                                                                       Class444444444444444444444444444444444444444444444444444444444444444444444444444" + "'", str2, "                                                                                                                                                                                                                                                                                                                                                       Class444444444444444444444444444444444444444444444444444444444444444444444444444");
    }

    @Test
    public void test39156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest78.test39156");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.swapCase("                                                                                                                                                                                                                                                                              langajavatsiLyarrAtsiLyarrAtsiLyarrA                                                                                                                                                                                                                                                                             ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "                                                                                                                                                                                                                                                                              LANGAJAVATSIlYARRaTSIlYARRaTSIlYARRa                                                                                                                                                                                                                                                                             " + "'", str1, "                                                                                                                                                                                                                                                                              LANGAJAVATSIlYARRaTSIlYARRaTSIlYARRa                                                                                                                                                                                                                                                                             ");
    }

    @Test
    public void test39157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest78.test39157");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeStartIgnoreCase("arrayListArrayListArrayListavaj.gnal                                                                arrayListArrayListArrayListavaj.gnal             L.ArryList", "Booleaninterface java.lang.Clone");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "arrayListArrayListArrayListavaj.gnal                                                                arrayListArrayListArrayListavaj.gnal             L.ArryList" + "'", str2, "arrayListArrayListArrayListavaj.gnal                                                                arrayListArrayListArrayListavaj.gnal             L.ArryList");
    }

    @Test
    public void test39158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest78.test39158");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.chomp("                                     ruvj", "][sslC][sslCrChahacta][sslC][LA");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                     ruvj" + "'", str2, "                                     ruvj");
    }

    @Test
    public void test39159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest78.test39159");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphanumeric((java.lang.CharSequence) "Li                                                                                                     ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test39160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest78.test39160");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAllUpperCase((java.lang.CharSequence) "-1java.utilString-1java.utilString");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test39161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest78.test39161");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.defaultIfBlank("44444444444444444.4....ArrayListArrayListArrayListArrayLis.", "A44444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444...");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "44444444444444444.4....ArrayListArrayListArrayListArrayLis." + "'", str2, "44444444444444444.4....ArrayListArrayListArrayListArrayLis.");
    }

    @Test
    public void test39162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest78.test39162");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.remove("44444444444444444444444444444444444444444444444444444444444444444444444444       util", ".LANG.LANG.LANG.LANG.LANG.LANG.Llitu");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "44444444444444444444444444444444444444444444444444444444444444444444444444       util" + "'", str2, "44444444444444444444444444444444444444444444444444444444444444444444444444       util");
    }

    @Test
    public void test39163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest78.test39163");
        java.lang.String str2 = org.apache.commons.lang3.ClassUtils.getPackageName((java.lang.Object) "...VA.LANGAVAJ.GNALJAVA.LANGAVAJ.GNALJAVA.LANGAVAJ.GNALJAVA.LANGAVAJ.GNALJAVA.LANGAVAJ.GNALJAVA.LANG", "aa..");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "java.lang" + "'", str2, "java.lang");
    }

    @Test
    public void test39164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest78.test39164");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trimToEmpty("stringaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa       ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "stringaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa" + "'", str1, "stringaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
    }

    @Test
    public void test39165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest78.test39165");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.center("                                    Jvstringnlrrylistrrylistrrylistvj", 63);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                    Jvstringnlrrylistrrylistrrylistvj" + "'", str2, "                                    Jvstringnlrrylistrrylistrrylistvj");
    }

    @Test
    public void test39166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest78.test39166");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trim("A..nyL A.ssssssssssssssssssssssssss                                 ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "A..nyL A.ssssssssssssssssssssssssss" + "'", str1, "A..nyL A.ssssssssssssssssssssssssss");
    }

    @Test
    public void test39167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest78.test39167");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceChars(".lang.Stringclass j..", ' ', 'a');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + ".lang.Stringclassaj.." + "'", str3, ".lang.Stringclassaj..");
    }

    @Test
    public void test39168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest78.test39168");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "                                    4rr4ylist", "S.r..gU..ls                                       S.r..gU..ls                                       S.r..gU..ls                                       ");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test39169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest78.test39169");
        java.lang.ClassLoader classLoader0 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass2 = org.apache.commons.lang3.ClassUtils.getClass(classLoader0, "GNALaRRAYlISTaRRAYlISTaRRAYlISTAVAJ.GNALaRRAYlISTaRRAYlISTaRRAYlI...Al.aRRAYlISTGNAL.Al.aRRAYlIST...Al.aRRAYlISTGNAL.Al.aRRAYlIST...Al.aRRAYlISTGNAL.Al.");
            org.junit.Assert.fail("Expected exception of type java.lang.ClassNotFoundException; message: GNALaRRAYlISTaRRAYlISTaRRAYlISTAVAJ/GNALaRRAYlISTaRRAYlISTaRRAYlI///Al/aRRAYlISTGNAL/Al/aRRAYlIST///Al/aRRAYlISTGNAL/Al/aRRAYlIST///Al/aRRAYlISTGNAL/Al/");
        } catch (java.lang.ClassNotFoundException e) {
            // Expected exception.
        }
    }

    @Test
    public void test39170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest78.test39170");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isBlank((java.lang.CharSequence) "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaNALNALNALNALNALNALNALNALNALNALNALNALNALNALNALNALNALNALNALNALNALNALNALNALNALNALNALNALNALNALNALNALNALNALNALNALNALNALNALNALNALNALNALNALNALNALNALNALNALNALNALNALNALNALNALNALNALNALNALNALNALNALNALNALNALNALNALNALNALNALNALNALNALNALNALNALNALNALNALNALNALNALNALNALNALNALNALNALNALNALNALNALNALNALNALNALNALNALNALNALNALNALNALNALNALNALNALNALNALNALNALNALNALNALNALNALNALNALNALNALNALNALNALNALNALNALNALNALNALNALNALNALNALNALNALNALNALNALNALNALNALNALNALNALNALNALNALNALNALNALNALNALNALNALNALNALNALNALNALNALNALNALNALNALNALNALNALNALNALNALNALNALNALNALNALNALNALNALNALNALNALNALNALNALNALNALNALNALNALNALNALNALNALNALNALNALNALNALNALNALNALNALNALNALNALNALNALNALNALNALNALNALNALNALNALNALNALNALNALNALNALNALNALNALNALNALNALNALNALNALNALNALNALNALNALNALNALNALNALNALNALNALNALNALNALNALNALNALNALNALNALNALNALNALNALNALNALNALNALNALNALNALNALNALNALNALNALNALNALNALNAL");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test39171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest78.test39171");
        java.lang.CharSequence charSequence2 = org.apache.commons.lang3.StringUtils.defaultIfEmpty((java.lang.CharSequence) "TRING", (java.lang.CharSequence) "AVAJ.GNAL......java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........javainterface java.io.Serializable");
        org.junit.Assert.assertEquals("'" + charSequence2 + "' != '" + "TRING" + "'", charSequence2, "TRING");
    }

    @Test
    public void test39172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest78.test39172");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.center("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa...aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", 40);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa...aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa" + "'", str2, "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa...aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
    }

    @Test
    public void test39173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest78.test39173");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.uncapitalize((java.lang.CharSequence) "                                                             AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "                                                             AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA" + "'", str1, "                                                             AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA");
    }

    @Test
    public void test39174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest78.test39174");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("JavajavaStrinJavajavaStrinJavajavaStJavajavaStrinJa                                            .", "         util         ");
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test39175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest78.test39175");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.endsWith("44-1java.utilString[]", "#rj#v##rr#rj#v##rr#rj#v##rr#rj#v##rr#rj#v##rr#rj#v##rr#rj#v##rr#rj#v##rr#rj#v##rr#rj#v##rr#rj#v##rr#rj#v##rr#rj#v##rr#rj#v##rr#rj#v##rr#rj#v##rr#rj#v##rr#rj#v##rr#rj#v##rr#rj#v##rr#rj#v##rr#rj#v##rr#rj#v##rr#rj#v##rr#rj#v##rr#rj#v##rr#rj#v##rr#rj#v##rr#rj#v##rr#rj#v##rr#rj#v##rr#rj#v##rr#rj#v##rr#rj#v##rr#rj#v##rr#rj#v##rr#rj#v##rr#rj#v##rr#rj#v##rr#rj#v##rr#rj#v##rr#rj#v##rr#rj#v##rr#rj#v##rr#rj#v##rr#rj#v##rr#rj#v##rr#rj#v##rr#rj#v##rr#rj#v##rr#rj#v##rr#rj#LASSJAVA#LANG#sTRING");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test39176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest78.test39176");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.split("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaVAJ.GNALaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaagn                                            ", "INTERFACE JAVA.LANG.cLONEABLE.......JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVAINTERFACE JAVA.IO.sERIALIZABLE");
        java.lang.String str4 = org.apache.commons.lang3.ClassUtils.getShortCanonicalName((java.lang.Object) strArray2, "java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java........");
        int int5 = org.apache.commons.lang3.StringUtils.indexOfDifference((java.lang.CharSequence[]) strArray2);
        java.lang.String[] strArray6 = org.apache.commons.lang3.StringUtils.stripAll(strArray2);
        java.lang.String str10 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray2, "44444444444stringstringstringstringstringstringstringstringstringstrin", 943, 47);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "String[]" + "'", str4, "String[]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 47 + "'", int5 == 47);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void test39177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest78.test39177");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitByCharacterTypeCamelCase("                                                               ");
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test39178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest78.test39178");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.center("44444444444444444.444444444444444444", 25);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "44444444444444444.444444444444444444" + "'", str2, "44444444444444444.444444444444444444");
    }

    @Test
    public void test39179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest78.test39179");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.split("gnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalLANGLANGLANGLANGLANGLANGLlituava                     ", "java..........java..........java");
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test39180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest78.test39180");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsAny("444444                                                                                                                                                                                                                             aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa                                                                                                                                                                                                                             ", "agnAAAAAAAAAA");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test39181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest78.test39181");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitByCharacterType("lang.java");
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test39182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest78.test39182");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.rightPad("va.langGNAL..la..                                                                                   etyBetyBetyBetyBetyBetyBetyBetyBetyBetyBetyBetyBetyBetyBetyBetyBetyBetyBetyBetyBetyBetyBetyB                                                                                                                                                                                                                             va.langGNAL..la..", 410);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "va.langGNAL..la..                                                                                   etyBetyBetyBetyBetyBetyBetyBetyBetyBetyBetyBetyBetyBetyBetyBetyBetyBetyBetyBetyBetyBetyBetyB                                                                                                                                                                                                                             va.langGNAL..la.." + "'", str2, "va.langGNAL..la..                                                                                   etyBetyBetyBetyBetyBetyBetyBetyBetyBetyBetyBetyBetyBetyBetyBetyBetyBetyBetyBetyBetyBetyBetyB                                                                                                                                                                                                                             va.langGNAL..la..");
    }

    @Test
    public void test39183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest78.test39183");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("arraylist", "##########");
        java.lang.String str6 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray2, ' ', 108, 49);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
    }

    @Test
    public void test39184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest78.test39184");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOf("a.la", 117);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test39185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest78.test39185");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOfIgnoreCase("444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444INTERFACE JAVA.LANG.cLONEABLEsTRINGINTERFACE JAVA.IO.sERIALIZABLE444444444444444444444444444444444444444444444444444444444444444444444444444444444litu.avajlitu", "44444444444444444GNALUAVAJ44444444444444444444444444444444444444444444444444444444444444444444444");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test39186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest78.test39186");
        int int3 = org.apache.commons.lang3.StringUtils.lastOrdinalIndexOf("interfacejava.lang.Cloneable#interfacejava.iointerfacejava.lang.Cloneable#interfacejava.ioinTU", "                                        JAVAULANG                                         ", 830);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test39187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest78.test39187");
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.split("44444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444             Character             ", "utilString[]    ", (int) '4');
        int int5 = org.apache.commons.lang3.StringUtils.lastIndexOfAny("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", strArray4);
        java.lang.String str6 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray4);
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray4, 'a');
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "44444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444Chaace" + "'", str6, "44444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444Chaace");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "44444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444aChaaacae" + "'", str8, "44444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444aChaaacae");
    }

    @Test
    public void test39188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest78.test39188");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.leftPad("interface java.lang.Cloneableainterface java.io.Serializable", 32, "GNIRT");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "interface java.lang.Cloneableainterface java.io.Serializable" + "'", str3, "interface java.lang.Cloneableainterface java.io.Serializable");
    }

    @Test
    public void test39189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest78.test39189");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444litu.avajlitu.avaj", "Arr... AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA... AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA... AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA... AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA... AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA... AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA... AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA... AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA... AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA... AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAyList");
        java.lang.Class<?>[] wildcardClassArray3 = org.apache.commons.lang3.ClassUtils.toClass((java.lang.Object[]) strArray2);
        java.lang.String[] strArray5 = org.apache.commons.lang3.StringUtils.splitByCharacterType("... AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA... AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA... AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA... AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA... AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA... AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA... AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA... AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA... AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA... AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA");
        java.lang.Class<?>[] wildcardClassArray6 = org.apache.commons.lang3.ClassUtils.toClass((java.lang.Object[]) strArray5);
        java.lang.Class<?>[] wildcardClassArray7 = org.apache.commons.lang3.ClassUtils.primitivesToWrappers(wildcardClassArray6);
        boolean boolean9 = org.apache.commons.lang3.ClassUtils.isAssignable(wildcardClassArray3, wildcardClassArray6, true);
        java.lang.Class<?>[] wildcardClassArray10 = null;
        boolean boolean11 = org.apache.commons.lang3.ClassUtils.isAssignable(wildcardClassArray6, wildcardClassArray10);
        java.lang.String str13 = org.apache.commons.lang3.ClassUtils.getPackageName((java.lang.Object) boolean11, "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaclassjavalangclassjavaulangjavaulangjavaulangjavaulangjavaulangjavaulangjavaulangjavaulangjavaulangjavaulangjavaulangjavaulangjavaulangjavaulangjavaulangjavaulangjavaulangjavaulangjavaulangjavaulang");
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertNotNull(wildcardClassArray3);
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertNotNull(wildcardClassArray6);
        org.junit.Assert.assertNotNull(wildcardClassArray7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "java.lang" + "'", str13, "java.lang");
    }

    @Test
    public void test39190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest78.test39190");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.swapCase("                   StringStringStringStringStringStringStringStringStringString                    ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "                   sTRINGsTRINGsTRINGsTRINGsTRINGsTRINGsTRINGsTRINGsTRINGsTRING                    " + "'", str1, "                   sTRINGsTRINGsTRINGsTRINGsTRINGsTRINGsTRINGsTRINGsTRINGsTRING                    ");
    }

    @Test
    public void test39191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest78.test39191");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitByCharacterType("444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444interface java.lang.Cloneable.                                 interface java.io.Serializable");
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test39192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest78.test39192");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.strip("$       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $", "stringstringstringstringstringstringstringstringstringstrin");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "$       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $" + "'", str2, "$       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $");
    }

    @Test
    public void test39193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest78.test39193");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.difference("##############################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################", "-1java.utilString[]-1java.utilString[]-1java.utilString[]-1java.utilString[]-1java.utilString[]-1java.utilString[]-1java.utilString[]-1java.utilString[]-1java.utilString[]-1java.utilString[]-1gnal");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "-1java.utilString[]-1java.utilString[]-1java.utilString[]-1java.utilString[]-1java.utilString[]-1java.utilString[]-1java.utilString[]-1java.utilString[]-1java.utilString[]-1java.utilString[]-1gnal" + "'", str2, "-1java.utilString[]-1java.utilString[]-1java.utilString[]-1java.utilString[]-1java.utilString[]-1java.utilString[]-1java.utilString[]-1java.utilString[]-1java.utilString[]-1java.utilString[]-1gnal");
    }

    @Test
    public void test39194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest78.test39194");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.substringBetween("4444444444444Ch.r.c$$$$$$$$$$$$$JAVA.IO.SERIALIZABLE INTERFACE JAVA.LANG.CLONEABLE... INTERFACE$$$$$$$$$$$$$", "", "interfINTERFACE JAVA.LANG.cLONEABLEsTRINGce jINTERFACE JAVA.LANG.cLONEABLEsTRINGvINTERFACE JAVA.LANG.cLONEABLEsTRING.lINTERFACE JAVA.LANG.cLONEABLEsTRINGng.cloneINTERFACE JAVA.LANG.cLONEABLEsTRINGble");
        org.junit.Assert.assertNull(str3);
    }

    @Test
    public void test39195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest78.test39195");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "interf ce      l ng Clone ble$interf ce      io Seri liz ble", "...# #AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA#...# #AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA#...# #AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA#...# #AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA#...# #AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA#...# #AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA#...# #AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA#...# #AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA#...# #AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA#...# #AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 6 + "'", int2 == 6);
    }

    @Test
    public void test39196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest78.test39196");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.swapCase("interface java.lang.Cloneable4interface java.io.Serializable");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "INTERFACE JAVA.LANG.cLONEABLE4INTERFACE JAVA.IO.sERIALIZABLE" + "'", str1, "INTERFACE JAVA.LANG.cLONEABLE4INTERFACE JAVA.IO.sERIALIZABLE");
    }

    @Test
    public void test39197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest78.test39197");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trimToEmpty("                                                                                          GNAL.AVAJ aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "GNAL.AVAJ aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa" + "'", str1, "GNAL.AVAJ aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
    }

    @Test
    public void test39198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest78.test39198");
        int int3 = org.apache.commons.lang3.StringUtils.indexOf("avaj1-avaj1-avaj1-avaj1-avaj1-avaj1-avaj1-avaj1-avaj1-avaj1-avaj1-avaj1-avaj1-avaj1-avaj1-avaj1-avaj1-avaj1-avaj1-avaj1-avaj1-avaj1-avaj1-avaj1-avaj1-avaj1-avaj1-avaj1-avaj1-avaj1-avaj1-avaj1-avaj1-avaj1-avaj1-avaj1-avaj1-avaj1-avaj1-avaj1-avaj1-avaj1-avaj1-avaj1-avaj1-avaj1-avaj1-avaj1-avaj1-avaj1-avaj1-avaj1-avaj1-avaj1-avaj1-avaj1-avaj1-avaj1-avaj1-avaj1-avaj1-avaj1-avajavajgnal.avajgnal.avajgnal.avajgnal.avajgnal.avajgnal.avajgnal.avajgnal.avajgnal.avajavaj1-avaj1-avaj1-avaj1-avaj1-avaj1-avaj1-avaj1-avaj1-avaj1-avaj1-avaj1-avaj1-avaj1-avaj1-avaj1-avaj1-avaj1-avaj1-avaj1-avaj1-avaj1-avaj1-avaj1-avaj1-avaj1-avaj1-avaj1-avaj1-avaj1-avaj1-avaj1-avaj1-avaj1-avaj1-avaj1-avaj1-avaj1-avaj1-avaj1-avaj1-avaj1-avaj1-avaj1-avaj1-avaj1-avaj1-avaj1-avaj1-avaj1-avaj1-avaj1-avaj1-avaj1-avaj1-avaj1-avaj1-avaj1-avaj1-avaj1-avaj1-avaj1-avaj1", 481, 78);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test39199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest78.test39199");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                        iRFCO.IRFIOSRIIZ", "                                                                                                                                                                                        ......java..........java..........java..........javanignirtSelbaenolC.gnal.avaj ecafretni                                                                                                                                                                                        ");
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test39200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest78.test39200");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.endsWithIgnoreCase("interfacejavaalangaCloneable#interfacejavaaiointerfacejavaalangaCloneable#interfacejavaaiointerfacejav", "LNuCctCctCctCctCctCctCctCctCctCctCctCctCctCctCctCctCctCctCctCctCctCctCctCct");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test39201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest78.test39201");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.upperCase("###################################################################################################################################################################################################################################################                                                                                                                                                                                                                                                                                                                                                                                                                                                            ####################################################################################################################################################################################################################################################");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "###################################################################################################################################################################################################################################################                                                                                                                                                                                                                                                                                                                                                                                                                                                            ####################################################################################################################################################################################################################################################" + "'", str1, "###################################################################################################################################################################################################################################################                                                                                                                                                                                                                                                                                                                                                                                                                                                            ####################################################################################################################################################################################################################################################");
    }

    @Test
    public void test39202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest78.test39202");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOfIgnoreCase("RAYlISTaRRAYlISTaRRAYlISTAVAJ.GNALaRRAYlISTaRRAYlISTaRRAYlISTAVAJ.GNALaRRAYlISTaRRAYlIS...", "4444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444aaaaaaaaaava.lang");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test39203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest78.test39203");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlpha((java.lang.CharSequence) "aaaaaaaaaa");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test39204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest78.test39204");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsAny("Arra", "Av");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test39205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest78.test39205");
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
        java.lang.Class<?>[] wildcardClassArray43 = org.apache.commons.lang3.ClassUtils.primitivesToWrappers(wildcardClassArray42);
        java.lang.Class<?>[] wildcardClassArray44 = org.apache.commons.lang3.ClassUtils.primitivesToWrappers(wildcardClassArray42);
        java.lang.Class<?>[] wildcardClassArray45 = null;
        java.lang.String[] strArray48 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("hi!", "");
        java.lang.String[] strArray50 = org.apache.commons.lang3.StringUtils.stripAll(strArray48, "$");
        java.lang.Class<?>[] wildcardClassArray51 = org.apache.commons.lang3.ClassUtils.toClass((java.lang.Object[]) strArray48);
        java.lang.Class<?>[] wildcardClassArray52 = org.apache.commons.lang3.ClassUtils.toClass((java.lang.Object[]) wildcardClassArray51);
        java.lang.Class<?>[] wildcardClassArray53 = org.apache.commons.lang3.ClassUtils.wrappersToPrimitives(wildcardClassArray52);
        java.lang.Class<?> wildcardClass54 = null;
        java.lang.Class[] classArray56 = new java.lang.Class[1];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray57 = (java.lang.Class<?>[]) classArray56;
        wildcardClassArray57[0] = wildcardClass54;
        java.lang.Class<?>[] wildcardClassArray60 = org.apache.commons.lang3.ClassUtils.primitivesToWrappers(wildcardClassArray57);
        boolean boolean62 = org.apache.commons.lang3.ClassUtils.isAssignable(wildcardClassArray53, wildcardClassArray60, true);
        boolean boolean64 = org.apache.commons.lang3.ClassUtils.isAssignable(wildcardClassArray45, wildcardClassArray53, false);
        boolean boolean65 = org.apache.commons.lang3.ClassUtils.isAssignable(wildcardClassArray44, wildcardClassArray53);
        java.lang.Class<?>[] wildcardClassArray66 = org.apache.commons.lang3.ClassUtils.wrappersToPrimitives(wildcardClassArray53);
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
        org.junit.Assert.assertNotNull(wildcardClassArray43);
        org.junit.Assert.assertNotNull(wildcardClassArray44);
        org.junit.Assert.assertNotNull(strArray48);
        org.junit.Assert.assertNotNull(strArray50);
        org.junit.Assert.assertNotNull(wildcardClassArray51);
        org.junit.Assert.assertNotNull(wildcardClassArray52);
        org.junit.Assert.assertNotNull(wildcardClassArray53);
        org.junit.Assert.assertNotNull(classArray56);
        org.junit.Assert.assertNotNull(wildcardClassArray57);
        org.junit.Assert.assertNotNull(wildcardClassArray60);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + false + "'", boolean62 == false);
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + false + "'", boolean64 == false);
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + false + "'", boolean65 == false);
        org.junit.Assert.assertNotNull(wildcardClassArray66);
    }

    @Test
    public void test39206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest78.test39206");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.endsWith("GNALJAVA.LANGAVAJ.GNALJAVA.LANGAVAJ.GNALJAVA.LANGAVAJ.GNALJAVA.LANGAVAJ.GNALJAVA.LANGaArr", "ERIALIZAB");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test39207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest78.test39207");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOf("etyBetyBetyBetyBetyBetyBAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA...etyBetyBetyBetyBetyBetyBe", 844, 217);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test39208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest78.test39208");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substring("AtsiLytcejbO.gnal.avajssalcrrAtsiLytcejbO.gnal.avajssalcrrAva.langGNAL..langjava.langAGNAL", 29);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "AtsiLytcejbO.gnal.avajssalcrrAva.langGNAL..langjava.langAGNAL" + "'", str2, "AtsiLytcejbO.gnal.avajssalcrrAva.langGNAL..langjava.langAGNAL");
    }

    @Test
    public void test39209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest78.test39209");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAsciiPrintable((java.lang.CharSequence) "....................................");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test39210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest78.test39210");
        char[] charArray1 = null;
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsAny("...nAAAAAAAAAAjaval.agnAAAAAAAAAA.....nAAAAAAAAAAjaval.agnAAAAAAAAAA.....nAAAAAAAAAAjaval.agnAAAAAAAAAA.....nAAAAAAAAAAjaval.agnAAAAAAAAAA.....nAAAAAAAAAAjaval.agnAAAAAAAAAA.....nAAAAAAAAAAjaval.agnAAAAAAAAAA.....nAAAAAAAAAAjaval.agnAAAAAAAAAA.....nAAAAAAAAAAjaval.agnAAAAAAAAAA.....nAAAAAAAAAAjaval.agnAAAAAAAAAA.....nAAAAAAAAAAjaval.agnAAAAAAAAAA.....nAAAAAAAAAAjaval.agnAAAAAAAAAA.....nAAAAAAAAAAjaval.agnAAAAAAAAAA.....nAAAAAAAAAAjaval.agnAAAAAAAAAA.....nAAAAAAAAAAjaval.agnAAAAAAAAAA.....nAAAAAAAAAAjaval.agnAAAAAAAAAA.....nAAAAAAAAAAjaval.agnAAAAAAAAAA.....nAAAAAAAAAAjaval.agnAAAAAAAAAA.....nAAAAAAAAAAjaval.agnAAAAAAAAAA.....nAAAAAAAAAAjaval.agnAAAAAAAAAA.....nAAAAAAAAAAjaval.agnAAAAAAAAAA.....nAAAAAAAAAAjaval.agnAAAAAAAAAA.....nAAAAAAAAAAjaval.agnAAAAAAAAAA....                                                                       JAVAsTRIN                                                                        ", charArray1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test39211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest78.test39211");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.remove("RFACEJAVALANGCLONEABLELANGGNALJAVALANGAVAJGNALJAVALANGAVAJGNALJAVALANGAVAJGNALJAVALANGAVAJGNALJAVALANGAVAJGNALJAVALANGAVAJ", '$');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "RFACEJAVALANGCLONEABLELANGGNALJAVALANGAVAJGNALJAVALANGAVAJGNALJAVALANGAVAJGNALJAVALANGAVAJGNALJAVALANGAVAJGNALJAVALANGAVAJ" + "'", str2, "RFACEJAVALANGCLONEABLELANGGNALJAVALANGAVAJGNALJAVALANGAVAJGNALJAVALANGAVAJGNALJAVALANGAVAJGNALJAVALANGAVAJGNALJAVALANGAVAJ");
    }

    @Test
    public void test39212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest78.test39212");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitByCharacterType("interfacejava.lang.CloneableLANG.GNALJAVA.LANGAVAJ.GNALJAVA.LANGAVAJ.GNALJAVA.LANGAVAJ.GNALJAVA.LANGAVAJ.GNALJAVA.LANGAVAJ.GNALJAVA.LANGAVAJ.GNALJAVA.LANGAVAJ.GNALJAVA.LANGAVAJ.JAVAinterfacejava.io.Serializable");
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test39213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest78.test39213");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBetween("RFACE JAVA.LANG.CLONEABLE        ", "A...ituLlituLlituLlituLlituLlituLlituLlituLlituLlituLlituLlituLlituLlituLlituLlituLlituLlituLlituLlituLlituLlituLlituLlituLlituLlituLlituc...ituLlituLlituLlituLlituLlituLlituLlituLlituLlituLlituLlituLlituLlituLlituLlituLlituLlituLlituLlituLlituLlituLlituLlituLlituLlituLlitu....ituLlituLlituLlituLlituLlituLlituLlituLlituLlituLlituLlituLlituLlituLlituLlituLlituLlituLlituLlituLlituLlituLlituLlituLlituLlituLlitu.Ob...ituLlituLlituLlituLlituLlituLlituLlituLlituLlituLlituLlituLlituLlituLlituLlituLlituLlituLlituLlituLlituLlituLlituLlituLlituLlituLlituec...ituLlituLlituLlituLlituLlituLlituLlituLlituLlituLlituLlituLlituLlituLlituLlituLlituLlituLlituLlituLlituLlituLlituLlituLlituLlituLlituyL");
        org.junit.Assert.assertNull(str2);
    }

    @Test
    public void test39214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest78.test39214");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "$$$$$$$JAVA.UTI");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test39215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest78.test39215");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.right("                                                                       ", 0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test39216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest78.test39216");
        int int2 = org.apache.commons.lang3.StringUtils.indexOf("     AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA", "     A..ayL A.44444444444444444444444444           A..ayL A.44444444444444444444444444           A..ayL A.44444444444444444444444444           A..ayL A.44444444444444444444444444           A..ayL A.44444444444444444444444444           A..ayL A.444444444.........java..........java...........     A..ayL A.44444444444444444444444444           A..ayL A.44444444444444444444444444           A..ayL A.44444444444444444444444444           A..ayL A.44444444444444444444444444           A..ayL A.44444444444444444444444444           A..ayL A.444444444");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test39217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest78.test39217");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.equalsIgnoreCase("interface java.lang.Cloneable...    $         $         $         $         $         $         $         $         $         $         $         $         $         $         $ ...interface java.io.Serializable", "                                  aaaaaa...aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test39218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest78.test39218");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.reverseDelimited("Aaaaaaaaaaaa                                  ", 'a');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                  aA" + "'", str2, "                                  aA");
    }

    @Test
    public void test39219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest78.test39219");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAllUpperCase((java.lang.CharSequence) "character");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test39220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest78.test39220");
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("nterface java.lang.Cloneable.......java..........java..........java..........java..........java.", "     A..ayL A.44444444444444444444444444           A..ayL A.44444444444444444444444444           A..ayL A.44444444444444444444444444           A..ayL A.44444444444444444444444444           A..ayL A.44444444444444444444444444           A..ayL A.444444444.........java..........java...........     A..ayL A.44444444444444444444444444           A..ayL A.44444444444444444444444444           A..ayL A.44444444444444444444444444           A..ayL A.44444444444444444444444444           A..ayL A.44444444444444444444444444           A..ayL A.444444444");
        boolean boolean5 = org.apache.commons.lang3.StringUtils.endsWithAny("..................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................GNIRTSLITU.AVAJ1-GNIRTSLITU.AVAJ1-", strArray4);
        java.lang.String[] strArray8 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("4444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444aaaaaaaaaa", "SERIALIZABLE");
        java.lang.String str9 = org.apache.commons.lang3.StringUtils.replaceEach("", strArray4, strArray8);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
    }

    @Test
    public void test39221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest78.test39221");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsIgnoreCase("Hi!ArrayLis", "SLITuGNIRTsSLITuGNIRTsSLITuGNIRTsSLITuGNIRTsSL");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test39222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest78.test39222");
        int int3 = org.apache.commons.lang3.StringUtils.indexOfIgnoreCase("44444444444444444444444444444444444444444444444444444444444444444444444444444444         $", "J#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#", 918);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test39223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest78.test39223");
        java.lang.String str1 = org.apache.commons.lang3.ClassUtils.getShortClassName(".......                                                                                                                                                                                                                             va.langGNAL..la..                                                                                                                                                                                                                              ......................................44444444444444444444444444444444444444444444444444444444444444444444444javaulang444444444444444444444444444444444444444444444444444444444444444444444444....................................................................................................................................................");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
    }

    @Test
    public void test39224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest78.test39224");
        int int3 = org.apache.commons.lang3.StringUtils.indexOf("utiljava.utilarrAjava.utiljava.utilarrAjava.utiljava.utilarrAjava.utiljava.utilarrAjava.utiljava.utilarrAjava.utiljava.utilarrAjava.utiljava.utilarrA#########################################################################itu.avaj#########################################################################", "u ..", 850);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test39225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest78.test39225");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNumericSpace((java.lang.CharSequence) "langagnaljavaalangavajagnaljavaalangavajagnaljavaalangavajagnaljavaa");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test39226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest78.test39226");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.abbreviate("                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                     ArrayListArrayListArrayListavajagnal", 72);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                                                     ..." + "'", str2, "                                                                     ...");
    }

    @Test
    public void test39227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest78.test39227");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isWhitespace((java.lang.CharSequence) "jAVA.L$ArrayListaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test39228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest78.test39228");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isBlank((java.lang.CharSequence) ".javainterface java.io.Serializable");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test39229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest78.test39229");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.abbreviate("44444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444.alya..a                                  $$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$                                  $$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$                                  $$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$              ", (int) (short) 100);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "4444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444..." + "'", str2, "4444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444...");
    }

    @Test
    public void test39230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest78.test39230");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("                                                                                                                                                                                                                                                                                                                                                    A..ayL A.44444444444444444444444444                                                                                                                                                                                                                                                     ", "ssalc gnirtSagnalaavajaRRAYlISTaRRAYlISTaRRAYlISTAVAJAGNAaRRAYlISTaRRAYlISTaRRAYlISTAVAJAGNAaRRAYlISTaRRAYlISTaRRAYlIST");
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test39231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest78.test39231");
        java.lang.ClassLoader classLoader0 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass3 = org.apache.commons.lang3.ClassUtils.getClass(classLoader0, "...Class[ Class[Class[...Class[ Class[Class[...Class[ Class[Class[...Class[ Class[Class[...Class[ Class[Class[...Class[ Class[Class[...Class[ Class[Class[...Class[ Class[Class[...Class[ Class[Class[...Class[ Class[", false);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassNotFoundException; message: ///Class[Class[Class[///Class[Class[Class[///Class[Class[Class[///Class[Class[Class[///Class[Class[Class[///Class[Class[Class[///Class[Class[Class[///Class[Class[Class[///Class[Class[Class[///Class[Class[");
        } catch (java.lang.ClassNotFoundException e) {
            // Expected exception.
        }
    }

    @Test
    public void test39232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest78.test39232");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBefore("interface java.lang.CloneableJ#v#.l#ngj#v#.l#ngj#v#.l#ngj#v#.l#ngj#v#.l#ngj#v#.l#ngj#v#.l#ngj#v#.l#ngj#v#.l#ngj#v#.l#ngj#v#.l#ngj#v#.l#ngj#v#.l#ngj#v#.l#ngj#v#.l#ngj#v#.l#ngj#v#.l#ngj#v#.l#ngj#v#.l#ngj#v#.l#ngj#v#.l#ngj#v#.l#ngj#v#.l#ngj#v#.l#ngj#v#.l#ngj#v#.l#ngj#v#.l#ngj#v#.l#ngj#v#.l#ngj#v#.l#ngj#v#.l#ngj#v#.l#ngj#v#.l#nginterface java.io.Serializabl", "siLyarrAtsiLyarrAtsiLyarrAtsiLyarrA.");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "interface java.lang.CloneableJ#v#.l#ngj#v#.l#ngj#v#.l#ngj#v#.l#ngj#v#.l#ngj#v#.l#ngj#v#.l#ngj#v#.l#ngj#v#.l#ngj#v#.l#ngj#v#.l#ngj#v#.l#ngj#v#.l#ngj#v#.l#ngj#v#.l#ngj#v#.l#ngj#v#.l#ngj#v#.l#ngj#v#.l#ngj#v#.l#ngj#v#.l#ngj#v#.l#ngj#v#.l#ngj#v#.l#ngj#v#.l#ngj#v#.l#ngj#v#.l#ngj#v#.l#ngj#v#.l#ngj#v#.l#ngj#v#.l#ngj#v#.l#ngj#v#.l#nginterface java.io.Serializabl" + "'", str2, "interface java.lang.CloneableJ#v#.l#ngj#v#.l#ngj#v#.l#ngj#v#.l#ngj#v#.l#ngj#v#.l#ngj#v#.l#ngj#v#.l#ngj#v#.l#ngj#v#.l#ngj#v#.l#ngj#v#.l#ngj#v#.l#ngj#v#.l#ngj#v#.l#ngj#v#.l#ngj#v#.l#ngj#v#.l#ngj#v#.l#ngj#v#.l#ngj#v#.l#ngj#v#.l#ngj#v#.l#ngj#v#.l#ngj#v#.l#ngj#v#.l#ngj#v#.l#ngj#v#.l#ngj#v#.l#ngj#v#.l#ngj#v#.l#ngj#v#.l#ngj#v#.l#nginterface java.io.Serializabl");
    }

    @Test
    public void test39233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest78.test39233");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.remove("ELBAZILAIREs.OI.AVAJ ECAFRETNIAVAJ..........AVAJ..........AVAJ..........AVAJ..........AVAJ..........AVAJ..........AVAJ..........AVAJ..........AVAJ..........AVAJ..........AVAJ..........AVAJ..........AVAJ..........AVAJ..........AVAJ..........AVAJ..........AVAJ..........AVAJ..........AVAJ..........AVAJ..........AVAJ..........AVAJ..........AVAJ..........AVAJ..........AVAJ..........AVAJ..........AVAJ..........AVAJ..........AVAJ..........AVAJ..........AVAJ..........AVAJ..........AVAJ..........AVAJ..........AVAJ.......ELBAENOLc.GNAL.AVAJ ECAFRETNI", ' ');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "ELBAZILAIREs.OI.AVAJECAFRETNIAVAJ..........AVAJ..........AVAJ..........AVAJ..........AVAJ..........AVAJ..........AVAJ..........AVAJ..........AVAJ..........AVAJ..........AVAJ..........AVAJ..........AVAJ..........AVAJ..........AVAJ..........AVAJ..........AVAJ..........AVAJ..........AVAJ..........AVAJ..........AVAJ..........AVAJ..........AVAJ..........AVAJ..........AVAJ..........AVAJ..........AVAJ..........AVAJ..........AVAJ..........AVAJ..........AVAJ..........AVAJ..........AVAJ..........AVAJ..........AVAJ.......ELBAENOLc.GNAL.AVAJECAFRETNI" + "'", str2, "ELBAZILAIREs.OI.AVAJECAFRETNIAVAJ..........AVAJ..........AVAJ..........AVAJ..........AVAJ..........AVAJ..........AVAJ..........AVAJ..........AVAJ..........AVAJ..........AVAJ..........AVAJ..........AVAJ..........AVAJ..........AVAJ..........AVAJ..........AVAJ..........AVAJ..........AVAJ..........AVAJ..........AVAJ..........AVAJ..........AVAJ..........AVAJ..........AVAJ..........AVAJ..........AVAJ..........AVAJ..........AVAJ..........AVAJ..........AVAJ..........AVAJ..........AVAJ..........AVAJ..........AVAJ.......ELBAENOLc.GNAL.AVAJECAFRETNI");
    }

    @Test
    public void test39234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest78.test39234");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceChars("                                                INTERFACE JAVA.LANG.cLONEABLEsTRINGINTERFACE JAVA.IO", "##########################################################################################################################################################################################################################JAVA.LANG$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$                                                                                                                                                                                                                                                                                                                                                                                                                                                                 ##########################################################################################################################################################################################################################", "...AJ..........AVAJ..........AVAJ..........AVAJ                          ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "ITERFCEcOEBEsTRIITERFCEIO" + "'", str3, "ITERFCEcOEBEsTRIITERFCEIO");
    }

    @Test
    public void test39235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest78.test39235");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.remove("LLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLyAAA..uti4444444444444444444444444444444444444444444444444444444444444444444444444ava4444444444444444444444444444444444444444444444444444444444444444444444444j", "-1JAVA.UTILsTRING[]                                                      ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "LLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLyAAA..uti4444444444444444444444444444444444444444444444444444444444444444444444444ava4444444444444444444444444444444444444444444444444444444444444444444444444j" + "'", str2, "LLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLyAAA..uti4444444444444444444444444444444444444444444444444444444444444444444444444ava4444444444444444444444444444444444444444444444444444444444444444444444444j");
    }

    @Test
    public void test39236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest78.test39236");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "Byaa", "]tu");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test39237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest78.test39237");
        java.lang.String[] strArray1 = new java.lang.String[] { "$" };
        java.util.ArrayList<java.lang.String> strList2 = new java.util.ArrayList<java.lang.String>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList2, strArray1);
        java.util.List<java.lang.Class<?>> wildcardClassList4 = org.apache.commons.lang3.ClassUtils.convertClassNamesToClasses((java.util.List<java.lang.String>) strList2);
        java.lang.String str6 = org.apache.commons.lang3.StringUtils.join((java.lang.Iterable<java.lang.Class<?>>) wildcardClassList4, "interface java.lang.cloneable.......java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........javainterface java.io.serializable");
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.join((java.lang.Iterable<java.lang.Class<?>>) wildcardClassList4, ' ');
        java.lang.String str10 = org.apache.commons.lang3.StringUtils.join((java.lang.Iterable<java.lang.Class<?>>) wildcardClassList4, "J#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#lass java#lang#String");
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(wildcardClassList4);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void test39238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest78.test39238");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.leftPad("..........................................................................................................................................................................................................................................................ULITULITULITULITUL####LITULITULITULITULITUL...........................................................................................................................................................................................................................................................", 54);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "..........................................................................................................................................................................................................................................................ULITULITULITULITUL####LITULITULITULITULITUL..........................................................................................................................................................................................................................................................." + "'", str2, "..........................................................................................................................................................................................................................................................ULITULITULITULITUL####LITULITULITULITULITUL...........................................................................................................................................................................................................................................................");
    }

    @Test
    public void test39239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest78.test39239");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("hi!", "");
        java.lang.String[] strArray5 = org.apache.commons.lang3.StringUtils.stripAll(strArray3, "$");
        java.lang.Class<?>[] wildcardClassArray6 = org.apache.commons.lang3.ClassUtils.toClass((java.lang.Object[]) strArray3);
        java.lang.Class<?>[] wildcardClassArray7 = org.apache.commons.lang3.ClassUtils.toClass((java.lang.Object[]) wildcardClassArray6);
        java.lang.Class<?>[] wildcardClassArray8 = org.apache.commons.lang3.ClassUtils.wrappersToPrimitives(wildcardClassArray7);
        java.lang.String str10 = org.apache.commons.lang3.ClassUtils.getPackageName((java.lang.Object) wildcardClassArray8, "interface java.lang.CloneableStringinterface java.io");
        java.lang.Class<?>[] wildcardClassArray11 = org.apache.commons.lang3.ClassUtils.wrappersToPrimitives(wildcardClassArray8);
        java.lang.String str12 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) wildcardClassArray11);
        java.lang.String str13 = org.apache.commons.lang3.StringUtils.concatWith("javalitu", (java.lang.Object[]) wildcardClassArray11);
        java.lang.Class<?>[] wildcardClassArray14 = org.apache.commons.lang3.ClassUtils.wrappersToPrimitives(wildcardClassArray11);
        java.lang.Class<?>[] wildcardClassArray15 = org.apache.commons.lang3.ClassUtils.primitivesToWrappers(wildcardClassArray11);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertNotNull(wildcardClassArray6);
        org.junit.Assert.assertNotNull(wildcardClassArray7);
        org.junit.Assert.assertNotNull(wildcardClassArray8);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "java.lang" + "'", str10, "java.lang");
        org.junit.Assert.assertNotNull(wildcardClassArray11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNotNull(wildcardClassArray14);
        org.junit.Assert.assertNotNull(wildcardClassArray15);
    }

    @Test
    public void test39240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest78.test39240");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.reverseDelimited("CEAJ V AL NGAcLONE BLEAAAAAAAJ V AAAAAAAAAAJ V AAAAAAAAAAJ V AAAAAAAAAAJ V AAAAAAAAAAJ V AAAAAAAAAAJ V AAAAAAAAAAJ V AAAAAAAAAAJ V AAAAAAAAAAJ V AAAAAAAAAAJ V AAAAAAAAAAJ V AAAAAAAAAAJ V A.langjava.la...                                                                                                  V AAAAAAAAAAJ V AAAAAAAAAAJ V AAAAAAAAAAJ V AAAAAAAAAAJ V AAAAAAAAAAJ V AAAAAAAAAAJ V AAAAAAAAAAJ V AAAAAAAAAAJ V AAAAAAAAAAJ V AAAAAAAAAAJ V AAAAAAAAAAJ V INTERF CEAJ V AIOAsERI LIZ BLE", 'a');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "...                                                                                                  V AAAAAAAAAAJ V AAAAAAAAAAJ V AAAAAAAAAAJ V AAAAAAAAAAJ V AAAAAAAAAAJ V AAAAAAAAAAJ V AAAAAAAAAAJ V AAAAAAAAAAJ V AAAAAAAAAAJ V AAAAAAAAAAJ V AAAAAAAAAAJ V INTERF CEAJ V AIOAsERI LIZ BLEa.lavangjaCEAJ V AL NGAcLONE BLEAAAAAAAJ V AAAAAAAAAAJ V AAAAAAAAAAJ V AAAAAAAAAAJ V AAAAAAAAAAJ V AAAAAAAAAAJ V AAAAAAAAAAJ V AAAAAAAAAAJ V AAAAAAAAAAJ V AAAAAAAAAAJ V AAAAAAAAAAJ V AAAAAAAAAAJ V A.l" + "'", str2, "...                                                                                                  V AAAAAAAAAAJ V AAAAAAAAAAJ V AAAAAAAAAAJ V AAAAAAAAAAJ V AAAAAAAAAAJ V AAAAAAAAAAJ V AAAAAAAAAAJ V AAAAAAAAAAJ V AAAAAAAAAAJ V AAAAAAAAAAJ V AAAAAAAAAAJ V INTERF CEAJ V AIOAsERI LIZ BLEa.lavangjaCEAJ V AL NGAcLONE BLEAAAAAAAJ V AAAAAAAAAAJ V AAAAAAAAAAJ V AAAAAAAAAAJ V AAAAAAAAAAJ V AAAAAAAAAAJ V AAAAAAAAAAJ V AAAAAAAAAAJ V AAAAAAAAAAJ V AAAAAAAAAAJ V AAAAAAAAAAJ V AAAAAAAAAAJ V A.l");
    }

    @Test
    public void test39241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest78.test39241");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.leftPad("avajgnal.avajgnal.avajgnal.avajgnal.avELBAZILAIRE", 472, "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "                                                                                                                                                                                                                                                                                                                                                                                                                                       avajgnal.avajgnal.avajgnal.avajgnal.avELBAZILAIRE" + "'", str3, "                                                                                                                                                                                                                                                                                                                                                                                                                                       avajgnal.avajgnal.avajgnal.avajgnal.avELBAZILAIRE");
    }

    @Test
    public void test39242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest78.test39242");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitByCharacterType("              s              ");
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test39243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest78.test39243");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNumeric((java.lang.CharSequence) "#agnaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaajaval#.aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaajaval#");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test39244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest78.test39244");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.contains("                           gnaletyBetyBetyBetyBetyBetyBetyBetyBetyB.etyBetyBetyBetyBetyBetyBetyBetyBetyBavaj                           ", 15);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test39245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest78.test39245");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitByCharacterType("ArrayListArrayListArrayListavaj.gnalArrayListArrayListAVAgnal.avajgnal.avajgnal.avajgnal.avajgnal.avajgn");
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test39246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest78.test39246");
        int int3 = org.apache.commons.lang3.StringUtils.ordinalIndexOf("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaA Lya..A                                      ", "ssalC.gnal.avaj ssalcinterfacejava.lang.Cloneable#interfacejava.i", 11);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test39247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest78.test39247");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.reverse("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa...langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava..");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "..avajgnal.avajgnal.avajgnal.avajgnal.avajgnal.avajgnal.avajgnal.avajgnal.avajgnal.avajgnal...aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa" + "'", str1, "..avajgnal.avajgnal.avajgnal.avajgnal.avajgnal.avajgnal.avajgnal.avajgnal.avajgnal.avajgnal...aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
    }

    @Test
    public void test39248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest78.test39248");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.center("                                                                                                                                                               AAAAAAAAAAAAAAAAAAAgnaluavajAAAAAAAAAAAAAAAAAAA", 152, "$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$NTERFACE JAVA.LANG.cLONEABLE.......JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVAINTERFACE JAVA.IO.sERIALIZABLE");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "                                                                                                                                                               AAAAAAAAAAAAAAAAAAAgnaluavajAAAAAAAAAAAAAAAAAAA" + "'", str3, "                                                                                                                                                               AAAAAAAAAAAAAAAAAAAgnaluavajAAAAAAAAAAAAAAAAAAA");
    }

    @Test
    public void test39249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest78.test39249");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripToEmpty("$       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "$       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $" + "'", str1, "$       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $");
    }

    @Test
    public void test39250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest78.test39250");
        java.lang.String str1 = org.apache.commons.lang3.ClassUtils.getPackageName("44444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444.ly..                                  $$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$                                  $$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$                                  $$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$                                  $$$$$$$$$$$$$$$$$$$$$$$");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "44444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444.ly." + "'", str1, "44444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444.ly.");
    }

    @Test
    public void test39251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest78.test39251");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.reverseDelimited("       $$$$$$javaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", '$');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "javaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa$       " + "'", str2, "javaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa$       ");
    }

    @Test
    public void test39252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest78.test39252");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.reverse("       AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA...       AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA...       AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA...       AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA...       AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA...       AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA...       AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA...       AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA...       AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA...       AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA       ...AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA       ...AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA       ...AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA       ...AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA       ...AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA       ...AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA       ...AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA       ...AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA       ...AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA       " + "'", str1, "AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA       ...AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA       ...AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA       ...AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA       ...AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA       ...AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA       ...AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA       ...AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA       ...AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA       ...AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA       ");
    }

    @Test
    public void test39253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest78.test39253");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceChars("iNTERFACEJAVA.LANG.cLONEABLE#INTERFACEJAVA.IOINTERFACEJAVA.LANG.cLONEABLE#INTERFACEJAVA.IOINTERFACEJAVA.LANG.cLONEABLE#INTERFACEJAVA.IOINTERFACEJAVABooleanINTERFACEJAVA.LANG.cLONEABLE#INTERFACEJAVA.IOINTERFACEJAVA.LANG.cLONEABLE#INTERFACEJAVA.IOINTERFACEJAVA.LANG.cLONEABLE#INTERFACEJAVA.IOINTERFACEJAVAIN$$$$$$$$$$$$$$$$$$$$$$$$$$$$$...$$$$$$$$$$$$$$$$$$$$$$$$$$$$$...$$$$$$$$$$$$$$$$$$$$$$$$$$aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaINTERFACEJAVA.LANG.cLONEABLE#INTERFACEJAVA.IOINTERFACEJAVA.LANG.cLONEABLE#INTERFACEJAVA.IOINTERFACEJAVA.LANG.cLONEABLE#INTERFACEJAVA.IOINTERFACEJAVABooleanINTERFACEJAVA.LANG.cLONEABLE#INTERFACEJAVA.IOINTERFACEJAVA.LANG.cLONEABLE#INTERFACEJAVA.IOINTERFACEJAVA.LANG.cLONEABLE#INTERFACEJAVA.IOINTERFACEJAVAIN", ' ', '4');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "iNTERFACEJAVA.LANG.cLONEABLE#INTERFACEJAVA.IOINTERFACEJAVA.LANG.cLONEABLE#INTERFACEJAVA.IOINTERFACEJAVA.LANG.cLONEABLE#INTERFACEJAVA.IOINTERFACEJAVABooleanINTERFACEJAVA.LANG.cLONEABLE#INTERFACEJAVA.IOINTERFACEJAVA.LANG.cLONEABLE#INTERFACEJAVA.IOINTERFACEJAVA.LANG.cLONEABLE#INTERFACEJAVA.IOINTERFACEJAVAIN$$$$$$$$$$$$$$$$$$$$$$$$$$$$$...$$$$$$$$$$$$$$$$$$$$$$$$$$$$$...$$$$$$$$$$$$$$$$$$$$$$$$$$aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaINTERFACEJAVA.LANG.cLONEABLE#INTERFACEJAVA.IOINTERFACEJAVA.LANG.cLONEABLE#INTERFACEJAVA.IOINTERFACEJAVA.LANG.cLONEABLE#INTERFACEJAVA.IOINTERFACEJAVABooleanINTERFACEJAVA.LANG.cLONEABLE#INTERFACEJAVA.IOINTERFACEJAVA.LANG.cLONEABLE#INTERFACEJAVA.IOINTERFACEJAVA.LANG.cLONEABLE#INTERFACEJAVA.IOINTERFACEJAVAIN" + "'", str3, "iNTERFACEJAVA.LANG.cLONEABLE#INTERFACEJAVA.IOINTERFACEJAVA.LANG.cLONEABLE#INTERFACEJAVA.IOINTERFACEJAVA.LANG.cLONEABLE#INTERFACEJAVA.IOINTERFACEJAVABooleanINTERFACEJAVA.LANG.cLONEABLE#INTERFACEJAVA.IOINTERFACEJAVA.LANG.cLONEABLE#INTERFACEJAVA.IOINTERFACEJAVA.LANG.cLONEABLE#INTERFACEJAVA.IOINTERFACEJAVAIN$$$$$$$$$$$$$$$$$$$$$$$$$$$$$...$$$$$$$$$$$$$$$$$$$$$$$$$$$$$...$$$$$$$$$$$$$$$$$$$$$$$$$$aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaINTERFACEJAVA.LANG.cLONEABLE#INTERFACEJAVA.IOINTERFACEJAVA.LANG.cLONEABLE#INTERFACEJAVA.IOINTERFACEJAVA.LANG.cLONEABLE#INTERFACEJAVA.IOINTERFACEJAVABooleanINTERFACEJAVA.LANG.cLONEABLE#INTERFACEJAVA.IOINTERFACEJAVA.LANG.cLONEABLE#INTERFACEJAVA.IOINTERFACEJAVA.LANG.cLONEABLE#INTERFACEJAVA.IOINTERFACEJAVAIN");
    }

    @Test
    public void test39254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest78.test39254");
        java.lang.String str2 = org.apache.commons.lang3.ClassUtils.getPackageCanonicalName((java.lang.Object) "     ##################################################java.uti#########################################################################", "                                                                                                                                                                                                                                                                                                                                                    JAVA.LANG.CLONEABLE...                                 INTERFACE JAVA.IO.SERIALIZABLE");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "java.lang" + "'", str2, "java.lang");
    }

    @Test
    public void test39255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest78.test39255");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("jAV", '$');
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test39256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest78.test39256");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.rightPad("interface java.lang.CloneableINTERFACE JAVA.LANG.CLONEABLELANG.GNALJAVA.LANGAVAJ.GNALJAVA.LANGAVAJ.GNALJAVA.LANGAVAJ.GNALJAVA.LANGAVAJ.GNALJAVA.LANGAVAJ.GNALJAVA.LANGAVAJ.GNALJAVA.LANGAVAJ.GNALJAVA.LANGAVAJ.JAVAINTERFACE JAVA.IO.SERIALIZABLEinterface java.io.Serializable", 23, '4');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "interface java.lang.CloneableINTERFACE JAVA.LANG.CLONEABLELANG.GNALJAVA.LANGAVAJ.GNALJAVA.LANGAVAJ.GNALJAVA.LANGAVAJ.GNALJAVA.LANGAVAJ.GNALJAVA.LANGAVAJ.GNALJAVA.LANGAVAJ.GNALJAVA.LANGAVAJ.GNALJAVA.LANGAVAJ.JAVAINTERFACE JAVA.IO.SERIALIZABLEinterface java.io.Serializable" + "'", str3, "interface java.lang.CloneableINTERFACE JAVA.LANG.CLONEABLELANG.GNALJAVA.LANGAVAJ.GNALJAVA.LANGAVAJ.GNALJAVA.LANGAVAJ.GNALJAVA.LANGAVAJ.GNALJAVA.LANGAVAJ.GNALJAVA.LANGAVAJ.GNALJAVA.LANGAVAJ.GNALJAVA.LANGAVAJ.JAVAINTERFACE JAVA.IO.SERIALIZABLEinterface java.io.Serializable");
    }

    @Test
    public void test39257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest78.test39257");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.strip("########.#######.");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "########.#######." + "'", str1, "########.#######.");
    }

    @Test
    public void test39258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest78.test39258");
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("       AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA", "STRING", 12);
        java.lang.String str6 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray4, "JAVA");
        int int7 = org.apache.commons.lang3.StringUtils.lastIndexOfAny("java.lang", strArray4);
        java.lang.String str9 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray4, '$');
        java.lang.Class<?>[] wildcardClassArray10 = org.apache.commons.lang3.ClassUtils.toClass((java.lang.Object[]) strArray4);
        java.lang.String str14 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) wildcardClassArray10, '4', 842, 262);
        java.lang.Class<?>[] wildcardClassArray15 = org.apache.commons.lang3.ClassUtils.wrappersToPrimitives(wildcardClassArray10);
        java.lang.String[] strArray19 = org.apache.commons.lang3.StringUtils.split("44444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444             Character             ", "utilString[]    ", (int) '4');
        java.lang.Class<?>[] wildcardClassArray20 = org.apache.commons.lang3.ClassUtils.toClass((java.lang.Object[]) strArray19);
        boolean boolean21 = org.apache.commons.lang3.ClassUtils.isAssignable(wildcardClassArray10, wildcardClassArray20);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "       AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA" + "'", str6, "       AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "       AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA" + "'", str9, "       AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA");
        org.junit.Assert.assertNotNull(wildcardClassArray10);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertNotNull(wildcardClassArray15);
        org.junit.Assert.assertNotNull(strArray19);
        org.junit.Assert.assertNotNull(wildcardClassArray20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
    }

    @Test
    public void test39259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest78.test39259");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.endsWithIgnoreCase("SILYARRA!IH$$$$$$$$", "   A..iyL ziirSoifri.oCfriCLASS JAVALANGCLASS                       JAVAULANG                       JAVAULANG                       JAVAULANG                       JAVAULANG                       JAVAULANG                       JAVAULANG                       JAVAULANG                       JAVAULANG                       JAVAULANG                       JAVAULANG                       JAVAULANG                       JAVAULANG                       JAVAULANG                       JAVAULANG                       JAVAULANG                       JAVAULANG                       JAVAULANG                       JAVAULANG                       JAVAULANG                       JAVAULANGCLASS JAVALANGCLASS                       JAVAULANG                       JAVAULANG                       JAVAULANG                       JAVAULANG                       JAVAULANG                       JAVAULANG                       JAVAU");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test39260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest78.test39260");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.capitalize((java.lang.CharSequence) "...                                            ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "...                                            " + "'", str1, "...                                            ");
    }

    @Test
    public void test39261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest78.test39261");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNumericSpace((java.lang.CharSequence) "####java.uti###############################...");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test39262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest78.test39262");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trimToNull("interfacejavaalangaCloneable#interfacejavaaiointerfacejavaalangaCloneable#interfacejavaaiointerfacejav");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "interfacejavaalangaCloneable#interfacejavaaiointerfacejavaalangaCloneable#interfacejavaaiointerfacejav" + "'", str1, "interfacejavaalangaCloneable#interfacejavaaiointerfacejavaalangaCloneable#interfacejavaaiointerfacejav");
    }

    @Test
    public void test39263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest78.test39263");
        java.lang.ClassLoader classLoader0 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass3 = org.apache.commons.lang3.ClassUtils.getClass(classLoader0, "44444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444Chaace", false);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassNotFoundException; message: 44444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444Chaace");
        } catch (java.lang.ClassNotFoundException e) {
            // Expected exception.
        }
    }

    @Test
    public void test39264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest78.test39264");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.defaultString(".......                                                                                                                                                                                                                             va.langGNAL..la..                                                                                                                                                                                                                              ......................................44444444444444444444444444444444444444444444444444444444444444444444444javaulang444444444444444444444444444444444444444444444444444444444444444444444444....................................................................................................................................................");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + ".......                                                                                                                                                                                                                             va.langGNAL..la..                                                                                                                                                                                                                              ......................................44444444444444444444444444444444444444444444444444444444444444444444444javaulang444444444444444444444444444444444444444444444444444444444444444444444444...................................................................................................................................................." + "'", str1, ".......                                                                                                                                                                                                                             va.langGNAL..la..                                                                                                                                                                                                                              ......................................44444444444444444444444444444444444444444444444444444444444444444444444javaulang444444444444444444444444444444444444444444444444444444444444444444444444....................................................................................................................................................");
    }

    @Test
    public void test39265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest78.test39265");
        int int2 = org.apache.commons.lang3.StringUtils.countMatches("                                   TU                                   ", "");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test39266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest78.test39266");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.split("irfCo$irfioSrAaaaaaaaaaaa                                  aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "interfacejava.lang.Cloneableinterfacejava.lang.Cloneable.......java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........javainterfacejava.io.Serializableinterfacejava.io.Serializable", 832);
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.getCommonPrefix(strArray3);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
    }

    @Test
    public void test39267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest78.test39267");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isWhitespace((java.lang.CharSequence) "ArrayLis4444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444.......................................................................CharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterChara");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test39268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest78.test39268");
        java.lang.String str1 = org.apache.commons.lang3.ClassUtils.getShortClassName("AVAJ.GNAL......j.v...........j.v...........j.v...........j.v...........j.v...........j.v...........j.v...........j.v...........j.v...........j.v...........j.v...........j.v...........j.v...........j.v...........j.v...........j.v...........j.v...........j.v...........j.v...........j.v...........j.v...........j.v...........j.v...........j.v...........j.v...........j.v...........j.v...........j.v...........j.v...........j.v...........j.v...........j.v.i.terf.ce j.v..io.Seri.aiz.ba");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "ba" + "'", str1, "ba");
    }

    @Test
    public void test39269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest78.test39269");
        java.lang.String[] strArray8 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("...", "avaj.gnal", (int) 'a');
        boolean boolean9 = org.apache.commons.lang3.StringUtils.startsWithAny("", strArray8);
        int int10 = org.apache.commons.lang3.StringUtils.indexOfAny("java.lang", strArray8);
        int int11 = org.apache.commons.lang3.StringUtils.indexOfAny("hi!ArrayListArrayListArrayListavaj.gnalArrayListArrayListArrayListavaj.gnalArrayListArrayListArrayLi", strArray8);
        int int12 = org.apache.commons.lang3.StringUtils.lastIndexOfAny("44444444444444444.444444444444444444...                                 ", strArray8);
        java.lang.String[] strArray17 = org.apache.commons.lang3.StringUtils.split("vvayLasa", '.');
        java.lang.String[] strArray21 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("hi!", "");
        java.lang.String[] strArray23 = org.apache.commons.lang3.StringUtils.stripAll(strArray21, "$");
        java.lang.String str24 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray21);
        java.lang.String[] strArray26 = org.apache.commons.lang3.StringUtils.split("java.util");
        java.lang.String[] strArray28 = org.apache.commons.lang3.StringUtils.stripAll(strArray26, "java.lang");
        java.lang.String str29 = org.apache.commons.lang3.StringUtils.getCommonPrefix(strArray26);
        java.lang.String str30 = org.apache.commons.lang3.StringUtils.replaceEachRepeatedly("$", strArray21, strArray26);
        java.lang.String str31 = org.apache.commons.lang3.StringUtils.replaceEachRepeatedly(".......java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java", strArray17, strArray26);
        java.lang.String str32 = org.apache.commons.lang3.StringUtils.getCommonPrefix(strArray17);
        java.lang.String str33 = org.apache.commons.lang3.StringUtils.concatWith("", (java.lang.Object[]) strArray17);
        java.lang.String str34 = org.apache.commons.lang3.StringUtils.replaceEachRepeatedly("......javaulainterface java.lang.Cloneable4interface java.io.Serializable.......", strArray8, strArray17);
        java.lang.String[] strArray36 = org.apache.commons.lang3.StringUtils.stripAll(strArray17, "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaA Lya..A                                      ");
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 36 + "'", int12 == 36);
        org.junit.Assert.assertNotNull(strArray17);
        org.junit.Assert.assertNotNull(strArray21);
        org.junit.Assert.assertNotNull(strArray23);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "hi!" + "'", str24, "hi!");
        org.junit.Assert.assertNotNull(strArray26);
        org.junit.Assert.assertNotNull(strArray28);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "java.util" + "'", str29, "java.util");
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "$" + "'", str30, "$");
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + ".......java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java" + "'", str31, ".......java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java");
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "vvayLasa" + "'", str32, "vvayLasa");
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "vvayLasa" + "'", str33, "vvayLasa");
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "vvayLasavvayLasajavaulainterface java.lang.Cloneable4interface java.io.SerializablevvayLasavvayLasa." + "'", str34, "vvayLasavvayLasajavaulainterface java.lang.Cloneable4interface java.io.SerializablevvayLasavvayLasa.");
        org.junit.Assert.assertNotNull(strArray36);
    }

    @Test
    public void test39270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest78.test39270");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.deleteWhitespace("#JLVLlaLNJLVLlaLNJLVLlaLNJLVLlaLNJLVLlaLNJLVLlaLNJLVLlaLN");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "#JLVLlaLNJLVLlaLNJLVLlaLNJLVLlaLNJLVLlaLNJLVLlaLNJLVLlaLN" + "'", str1, "#JLVLlaLNJLVLlaLNJLVLlaLNJLVLlaLNJLVLlaLNJLVLlaLNJLVLlaLN");
    }

    @Test
    public void test39271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest78.test39271");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.capitalize((java.lang.CharSequence) "GNIRTs.GE       .");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "GNIRTs.GE       ." + "'", str1, "GNIRTs.GE       .");
    }

    @Test
    public void test39272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest78.test39272");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("IelbaenolC");
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test39273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest78.test39273");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.reverse("444444444444444444444444444444444444444444444444444444GNL$.$VJ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "JV$.$LNG444444444444444444444444444444444444444444444444444444" + "'", str1, "JV$.$LNG444444444444444444444444444444444444444444444444444444");
    }

    @Test
    public void test39274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest78.test39274");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.center("       GNALUAVAJ                       GNALUAVAJ                       GNALUAVAJ                       GNALUAVAJ                       GNALUAVAJ                       GNALUAVAJ                       GNALUAVAJ                       GNALUAVAJ                       GNALUAVAJ                       GNALUAVAJ                       GNALUAVAJ                       GNALUAVAJ                       GNALUAVAJ                       GNALUAVAJ                       GNALUAVAJ                       GNALUAVAJ                       GNALUAVAJ                       GNALUAVAJ                       GNALUAVAJ                       GNALUAVAJ                       SSALCGNALAVAJ SSALC", 935);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                                                                                                                             GNALUAVAJ                       GNALUAVAJ                       GNALUAVAJ                       GNALUAVAJ                       GNALUAVAJ                       GNALUAVAJ                       GNALUAVAJ                       GNALUAVAJ                       GNALUAVAJ                       GNALUAVAJ                       GNALUAVAJ                       GNALUAVAJ                       GNALUAVAJ                       GNALUAVAJ                       GNALUAVAJ                       GNALUAVAJ                       GNALUAVAJ                       GNALUAVAJ                       GNALUAVAJ                       GNALUAVAJ                       SSALCGNALAVAJ SSALC                                                                                                                                       " + "'", str2, "                                                                                                                                             GNALUAVAJ                       GNALUAVAJ                       GNALUAVAJ                       GNALUAVAJ                       GNALUAVAJ                       GNALUAVAJ                       GNALUAVAJ                       GNALUAVAJ                       GNALUAVAJ                       GNALUAVAJ                       GNALUAVAJ                       GNALUAVAJ                       GNALUAVAJ                       GNALUAVAJ                       GNALUAVAJ                       GNALUAVAJ                       GNALUAVAJ                       GNALUAVAJ                       GNALUAVAJ                       GNALUAVAJ                       SSALCGNALAVAJ SSALC                                                                                                                                       ");
    }

    @Test
    public void test39275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest78.test39275");
        java.util.Locale locale1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.apache.commons.lang3.StringUtils.upperCase("             cHARACTER             UTILsTRI", locale1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test39276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest78.test39276");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeEndIgnoreCase("stri", "hi!ArrayListArrayListArrayListavaj.gnalArrayListArrayListArrayListavaj.gnalArrayListArrayLis");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "stri" + "'", str2, "stri");
    }

    @Test
    public void test39277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest78.test39277");
        int int3 = org.apache.commons.lang3.StringUtils.lastOrdinalIndexOf("utiljava.util444444444444444444444444444444444444444444444444444444444444444444444444444444444ELBAZILAIREs.OI.AVAJ ECAFRETNIGNIRTsELBAENOLc.GNAL.AVAJ ECAFRETNI444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444", "$       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $", 990);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test39278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest78.test39278");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.rightPad("VAARRARJAVAARRARJAVAARR", 7);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "VAARRARJAVAARRARJAVAARR" + "'", str2, "VAARRARJAVAARRARJAVAARR");
    }

    @Test
    public void test39279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest78.test39279");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.center("gnal.avajgnal..LANGgnal.avajgnal.javal######################javal######################java", 154, "$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$#agnaaaaaaaaGnal");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$gnal.avajgnal..LANGgnal.avajgnal.javal######################javal######################java$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$" + "'", str3, "$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$gnal.avajgnal..LANGgnal.avajgnal.javal######################javal######################java$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$");
    }

    @Test
    public void test39280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest78.test39280");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("tsiLyarrA.La.langtsiLyarrA.La.langtsiLyarrAJavaaaaaaaaaava.langava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langa.langtsiLyarrA.La.langtsiLyarrA.La.lang", '4');
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test39281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest78.test39281");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripToNull("aAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA...AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA...AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA...AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA...AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA...AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA...AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA...AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA...AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA.....");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "aAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA...AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA...AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA...AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA...AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA...AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA...AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA...AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA...AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA....." + "'", str1, "aAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA...AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA...AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA...AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA...AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA...AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA...AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA...AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA...AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA.....");
    }

    @Test
    public void test39282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest78.test39282");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.equalsIgnoreCase("JAVA#############################################################################################", "avaj.gnalnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAA");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test39283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest78.test39283");
        java.lang.CharSequence charSequence2 = org.apache.commons.lang3.StringUtils.defaultIfBlank((java.lang.CharSequence) "gnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalLANGLANGLANGLANGLANGLANGLlituava", (java.lang.CharSequence) "$.$vj");
        org.junit.Assert.assertEquals("'" + charSequence2 + "' != '" + "gnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalLANGLANGLANGLANGLANGLANGLlituava" + "'", charSequence2, "gnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalLANGLANGLANGLANGLANGLANGLlituava");
    }

    @Test
    public void test39284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest78.test39284");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphanumeric((java.lang.CharSequence) "44444444444444444444444444                                                 ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test39285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest78.test39285");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.center("iNTERFACEJAVA.LANG.cLONEABLE.......JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVAINTERFACEJAVA.IO.sERIALIZABLE", 158);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "iNTERFACEJAVA.LANG.cLONEABLE.......JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVAINTERFACEJAVA.IO.sERIALIZABLE" + "'", str2, "iNTERFACEJAVA.LANG.cLONEABLE.......JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVAINTERFACEJAVA.IO.sERIALIZABLE");
    }

    @Test
    public void test39286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest78.test39286");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceChars("4444444444444444444444444444444444444444444444444444444444444444444444444444444rclassjava.lang.O..", 'a', ' ');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "4444444444444444444444444444444444444444444444444444444444444444444444444444444rcl ssj v .l ng.O.." + "'", str3, "4444444444444444444444444444444444444444444444444444444444444444444444444444444rcl ssj v .l ng.O..");
    }

    @Test
    public void test39287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest78.test39287");
        java.lang.CharSequence charSequence1 = null;
        int int2 = org.apache.commons.lang3.StringUtils.indexOfDifference((java.lang.CharSequence) "################################...       AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA", charSequence1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test39288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest78.test39288");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.center("444444aaaaaaaINTEGERaaaaaaa4444444", 570, "     AA...");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "     AA...     AA...     AA...     AA...     AA...     AA...     AA...     AA...     AA...     AA...     AA...     AA...     AA...     AA...     AA...     AA...     AA...     AA...     AA...     AA...     AA...     AA...     AA...     AA...     AA...     AA...     AA.444444aaaaaaaINTEGERaaaaaaa4444444     AA...     AA...     AA...     AA...     AA...     AA...     AA...     AA...     AA...     AA...     AA...     AA...     AA...     AA...     AA...     AA...     AA...     AA...     AA...     AA...     AA...     AA...     AA...     AA...     AA...     AA...     AA." + "'", str3, "     AA...     AA...     AA...     AA...     AA...     AA...     AA...     AA...     AA...     AA...     AA...     AA...     AA...     AA...     AA...     AA...     AA...     AA...     AA...     AA...     AA...     AA...     AA...     AA...     AA...     AA...     AA.444444aaaaaaaINTEGERaaaaaaa4444444     AA...     AA...     AA...     AA...     AA...     AA...     AA...     AA...     AA...     AA...     AA...     AA...     AA...     AA...     AA...     AA...     AA...     AA...     AA...     AA...     AA...     AA...     AA...     AA...     AA...     AA...     AA.");
    }

    @Test
    public void test39289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest78.test39289");
        int int3 = org.apache.commons.lang3.StringUtils.indexOfIgnoreCase("                                  aa                                  aa                                  aa                                  aa                                  aa                                  aa                                  aa                                  aa                                  aa                                  aa", "AAAAAAAAAAjaval.agnAAAAAAAAAA", 92);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test39290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest78.test39290");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByCharacterTypeCamelCase("gnalArrayListArrayListArrayLi");
        boolean boolean3 = org.apache.commons.lang3.StringUtils.startsWithAny("interface java.lang.Cloneable             Character             interface java.io.Serializable", strArray2);
        java.lang.String str5 = org.apache.commons.lang3.ClassUtils.getPackageName((java.lang.Object) "interface java.lang.Cloneable             Character             interface java.io.Serializable", "Arrrrrrrrrrrrrrrrrrrrrrrrrrrrr");
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "java.lang" + "'", str5, "java.lang");
    }

    @Test
    public void test39291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest78.test39291");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replace("javal4.4agn", "                                                                                                                                                                                                                                                                                                                                                                                                         utiljava.util444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444                                                                                                                                                                                                                                                                                                                                                                                                         ", "4444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444       4444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "javal4.4agn" + "'", str3, "javal4.4agn");
    }

    @Test
    public void test39292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest78.test39292");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.rightPad("                                                                                                                                                                                  gnirtSlitu.avaj1-gnirtSlitu.avaj1-                                                                                                                                                                                  ", 21);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                                                                                                                                                                  gnirtSlitu.avaj1-gnirtSlitu.avaj1-                                                                                                                                                                                  " + "'", str2, "                                                                                                                                                                                  gnirtSlitu.avaj1-gnirtSlitu.avaj1-                                                                                                                                                                                  ");
    }

    @Test
    public void test39293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest78.test39293");
        java.lang.ClassLoader classLoader0 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass3 = org.apache.commons.lang3.ClassUtils.getClass(classLoader0, "...avagnal.avajlang.javagnal.avajlang.javagnal", false);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassNotFoundException; message: ///avagnal/avajlang/javagnal/avajlang/javagnal");
        } catch (java.lang.ClassNotFoundException e) {
            // Expected exception.
        }
    }

    @Test
    public void test39294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest78.test39294");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.reverseDelimited(".........................................................................................................................................................................................................................................................................................................Airfco$irfiosriizcirfco$irfiosriizObirfco$irfiosriizecirfco$irfiosriizL..........................................................................................................................................................................................................................................................................................................", 'a');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + ".........................................................................................................................................................................................................................................................................................................Airfco$irfiosriizcirfco$irfiosriizObirfco$irfiosriizecirfco$irfiosriizL.........................................................................................................................................................................................................................................................................................................." + "'", str2, ".........................................................................................................................................................................................................................................................................................................Airfco$irfiosriizcirfco$irfiosriizObirfco$irfiosriizecirfco$irfiosriizL..........................................................................................................................................................................................................................................................................................................");
    }

    @Test
    public void test39295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest78.test39295");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceChars("GnalAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA", "AAAAAAAAAAAAAAAAAAA", ".######################################################################");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Gnal.........................................................................................................................................................." + "'", str3, "Gnal..........................................................................................................................................................");
    }

    @Test
    public void test39296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest78.test39296");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.difference("gnal                                                                ", "                                            Arra                                             ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                            Arra                                             " + "'", str2, "                                            Arra                                             ");
    }

    @Test
    public void test39297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest78.test39297");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeEnd("                                                                                      ...", "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                                                                      ..." + "'", str2, "                                                                                      ...");
    }

    @Test
    public void test39298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest78.test39298");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOf("arralitu.avajlitu.ava", 12, 788);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test39299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest78.test39299");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBetween("", "-1");
        org.junit.Assert.assertNull(str2);
    }

    @Test
    public void test39300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest78.test39300");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.remove("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaagn", ' ');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaagn" + "'", str2, "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaagn");
    }

    @Test
    public void test39301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest78.test39301");
        int int2 = org.apache.commons.lang3.StringUtils.indexOf("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", (int) (short) 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test39302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest78.test39302");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfAnyBut("$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$stJAVAGNAL                                                           ", "iNTEGER");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test39303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest78.test39303");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOfIgnoreCase("CLASS JAVALANGCLASS                       JAVAULANG                       JAVAULANG                       JAVAULANG                       JAVAULANG                       JAVAULANG                       JAVAULANG                       JAVAULANG                       JAVAULANG                       JAVAULANG                       JAVAULANG                       JAVAULANG                       JAVAULANG                       JAVAULANG                       JAVAULANG                       JAVAULANG                       JAVAULANG                       JAVAULANG                       JAVAULANG                       JAVAULANG                       JAVAULANG        ", "... java.lang.stringclass java.lang.stringclass...                                                                                                                                                            ");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test39304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest78.test39304");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByCharacterType("cLASSJAVA.LANG.cLASSjavaulangjavaulangjavaulangjavaulangjavaulangjavaulangjavaulangjavaulangjavaulangjavaulangjavaulangjavaulangjavaulangjavaulangjavaulangjavaulangjavaulangjavaulangjavaulangjavaulang");
        java.lang.String[] strArray6 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("                   GNAL.AVAJ", "][ssalC");
        int int7 = org.apache.commons.lang3.StringUtils.lastIndexOfAny("                                                                                                                                                                                                                                                                                                                                                                                                                      javaulangrraylist                       javaulangrraylist                                                                                                                                                                                                                                                                                                                                                                                                                            ", strArray6);
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray6);
        java.lang.String str9 = org.apache.commons.lang3.StringUtils.replaceEachRepeatedly("", strArray2, strArray6);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "                   GNAL.AVAJ" + "'", str8, "                   GNAL.AVAJ");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
    }

    @Test
    public void test39305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest78.test39305");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.abbreviate("                                                                                                                                                                                                                             va.langGNAL..la..                                                                                                                                                                                                                                                                                                                                                                                                                                                           va.langGNAL..la..                                                                                                                                               ", 67, 139);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "...                                                                                                                                     ..." + "'", str3, "...                                                                                                                                     ...");
    }

    @Test
    public void test39306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest78.test39306");
        java.lang.String str1 = org.apache.commons.lang3.ClassUtils.getPackageCanonicalName("                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                          java.lang");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "java" + "'", str1, "java");
    }

    @Test
    public void test39307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest78.test39307");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlpha((java.lang.CharSequence) "                                                                                                                                                                              javaaaaaaaaaava.langava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.lang$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test39308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest78.test39308");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "tttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttutiljava.util444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444ttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttt", "stringaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa       ");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test39309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest78.test39309");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("avajssalcrrAtsiLytcejb", "A..AYL A.44444444444444444444444444                                                 $$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$", 86);
        java.lang.String str5 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray3, "interface java.lang.Cloneable$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$interface java.io.Serializable                                ");
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "avajssalcrrAtsiLytcejb" + "'", str5, "avajssalcrrAtsiLytcejb");
    }

    @Test
    public void test39310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest78.test39310");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.uncapitalize((java.lang.CharSequence) "$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$AAAAAAAAAAAAAAAAAAAjavaulangAAAAAAAAAAAAAAAAAA$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$AAAAAAAAAAAAAAAAAAAjavaulangAAAAAAAAAAAAAAAAAA$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$" + "'", str1, "$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$AAAAAAAAAAAAAAAAAAAjavaulangAAAAAAAAAAAAAAAAAA$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$");
    }

    @Test
    public void test39311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest78.test39311");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.difference("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaGNAL", ".utiljava.util");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + ".utiljava.util" + "'", str2, ".utiljava.util");
    }

    @Test
    public void test39312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest78.test39312");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("ArrayListArrayListArrayListavajagna", ".............................................................................................................................................................................................................................................................................................................................................................................................................................................jAV..............................................................................................................................................................................................................................................................................................................................................................................................................................................");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray2);
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.stripAll(strArray2);
        java.lang.String[] strArray5 = org.apache.commons.lang3.StringUtils.stripAll(strArray4);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "ArrayListArrayListArrayListavajagna" + "'", str3, "ArrayListArrayListArrayListavajagna");
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertNotNull(strArray5);
    }

    @Test
    public void test39313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest78.test39313");
        java.lang.String str1 = org.apache.commons.lang3.ClassUtils.getShortClassName("       INTEGER        ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "       INTEGER        " + "'", str1, "       INTEGER        ");
    }

    @Test
    public void test39314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest78.test39314");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trimToEmpty("                                         va1j    ..$$$$$$$$$$$$$$$$$$$$$$$$$$$$$.....");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "va1j    ..$$$$$$$$$$$$$$$$$$$$$$$$$$$$$....." + "'", str1, "va1j    ..$$$$$$$$$$$$$$$$$$$$$$$$$$$$$.....");
    }

    @Test
    public void test39315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest78.test39315");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.equals((java.lang.CharSequence) "##########################################################################################################################################################################################################################java.lang                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                    ##########################################################################################################################################################################################################################", (java.lang.CharSequence) "aAAAAAAAAAngalavajAAAAAAAAAAngalavajAAAAAAAAAAngalavajAAAAAAAAAAngalavajAAAAAAAAAAngalavajAAAAAAAAAAngalavajAAAAAAAAAAngalavajAAAAAAAAAAngalavajAAAAAAAAAAngalavajAAAAAAAAAAngalavajAAAAAAAAAAngalavajAAAAAAAAAAngalavajAAAAAAAAAAngalavajAAAAAAAAAAngalavajAAAAAAAAAAngalavajAAAAAAAAAAngalavajAAAAAAAAAAngalavajAAAAAAAAAAngalavajAAAAAAAAAAngalavajAAAAAAAAAAngalavajAAAAAAAAAAngalavajAAAAAAAAAAngalavajAAAAAAAAAAngalavajAAAAAAAAAAngalavajAAAAAAAAAAngalavajAAAAAAAAAAngalavajAAAAAAAAAAngalavajAAAAAAAAAAngalavajAAAAAAAAAAngalavajAAAAAAAAAAngalavajAAAAAAAAAAngalavajAAAAAAAAAAngalavajAAAAAAAAAAngalavajAAAAAAAAAAngalavajAAAAAAAAAAngalavajAAAAAAAAAA                                                                                                                                                                                                                                                                         ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test39316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest78.test39316");
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
        java.lang.Class<?> wildcardClass19 = null;
        java.lang.Class[] classArray21 = new java.lang.Class[1];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray22 = (java.lang.Class<?>[]) classArray21;
        wildcardClassArray22[0] = wildcardClass19;
        java.lang.Class<?>[] wildcardClassArray25 = org.apache.commons.lang3.ClassUtils.primitivesToWrappers(wildcardClassArray22);
        boolean boolean27 = org.apache.commons.lang3.ClassUtils.isAssignable(wildcardClassArray15, wildcardClassArray25, true);
        java.lang.Class<?> wildcardClass29 = null;
        java.lang.Class[] classArray31 = new java.lang.Class[1];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray32 = (java.lang.Class<?>[]) classArray31;
        wildcardClassArray32[0] = wildcardClass29;
        java.lang.Class<?>[] wildcardClassArray35 = org.apache.commons.lang3.ClassUtils.primitivesToWrappers(wildcardClassArray32);
        java.lang.String[] strArray37 = new java.lang.String[] { "                                   " };
        java.lang.String str38 = org.apache.commons.lang3.StringUtils.getCommonPrefix(strArray37);
        java.lang.Class<?>[] wildcardClassArray39 = org.apache.commons.lang3.ClassUtils.toClass((java.lang.Object[]) strArray37);
        java.lang.Class<?> wildcardClass40 = null;
        java.lang.Class[] classArray42 = new java.lang.Class[1];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray43 = (java.lang.Class<?>[]) classArray42;
        wildcardClassArray43[0] = wildcardClass40;
        java.lang.Class<?>[] wildcardClassArray46 = org.apache.commons.lang3.ClassUtils.primitivesToWrappers(wildcardClassArray43);
        boolean boolean47 = org.apache.commons.lang3.ClassUtils.isAssignable(wildcardClassArray39, wildcardClassArray43);
        boolean boolean49 = org.apache.commons.lang3.ClassUtils.isAssignable(wildcardClassArray32, wildcardClassArray43, true);
        java.lang.String[] strArray52 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("class java.lang.String", "                                   ");
        java.lang.String[] strArray53 = org.apache.commons.lang3.StringUtils.stripAll(strArray52);
        java.lang.Class<?>[] wildcardClassArray54 = org.apache.commons.lang3.ClassUtils.toClass((java.lang.Object[]) strArray53);
        java.lang.Class<?>[] wildcardClassArray55 = org.apache.commons.lang3.ClassUtils.primitivesToWrappers(wildcardClassArray54);
        boolean boolean56 = org.apache.commons.lang3.ClassUtils.isAssignable(wildcardClassArray43, wildcardClassArray55);
        java.lang.String str57 = org.apache.commons.lang3.StringUtils.concatWith("javajavajavajavajavajavajavajavajavajavajavajavajavajavajavajavajavajavajavajavajavajavajavajavajavajavajavajavajavajavajavajavajavajava", (java.lang.Object[]) wildcardClassArray55);
        java.lang.Class<?>[] wildcardClassArray58 = org.apache.commons.lang3.ClassUtils.primitivesToWrappers(wildcardClassArray55);
        boolean boolean60 = org.apache.commons.lang3.ClassUtils.isAssignable(wildcardClassArray25, wildcardClassArray58, false);
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
        org.junit.Assert.assertNotNull(classArray21);
        org.junit.Assert.assertNotNull(wildcardClassArray22);
        org.junit.Assert.assertNotNull(wildcardClassArray25);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(classArray31);
        org.junit.Assert.assertNotNull(wildcardClassArray32);
        org.junit.Assert.assertNotNull(wildcardClassArray35);
        org.junit.Assert.assertNotNull(strArray37);
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "                                   " + "'", str38, "                                   ");
        org.junit.Assert.assertNotNull(wildcardClassArray39);
        org.junit.Assert.assertNotNull(classArray42);
        org.junit.Assert.assertNotNull(wildcardClassArray43);
        org.junit.Assert.assertNotNull(wildcardClassArray46);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertNotNull(strArray52);
        org.junit.Assert.assertNotNull(strArray53);
        org.junit.Assert.assertNotNull(wildcardClassArray54);
        org.junit.Assert.assertNotNull(wildcardClassArray55);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + true + "'", boolean56 == true);
        org.junit.Assert.assertEquals("'" + str57 + "' != '" + "class java.lang.String" + "'", str57, "class java.lang.String");
        org.junit.Assert.assertNotNull(wildcardClassArray58);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + true + "'", boolean60 == true);
    }

    @Test
    public void test39317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest78.test39317");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "IRFcO.IRFIOsRaAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA", "...                                                                irfCo$irfioSriiz...                                                                 ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test39318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest78.test39318");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.remove("JAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANG", "javalang");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "JAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANG" + "'", str2, "JAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANG");
    }

    @Test
    public void test39319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest78.test39319");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.center("$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$AVAJ.GNALNaaaaaaaaaaJAVAL.AGNaaaaaaaaaaJAVAL.AGNaaaaaaaaaaJAVAL.AGNaaaaaaaaaaJAVAL.AGNaaaaaaaaaaJ$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$", 0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$AVAJ.GNALNaaaaaaaaaaJAVAL.AGNaaaaaaaaaaJAVAL.AGNaaaaaaaaaaJAVAL.AGNaaaaaaaaaaJAVAL.AGNaaaaaaaaaaJ$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$" + "'", str2, "$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$AVAJ.GNALNaaaaaaaaaaJAVAL.AGNaaaaaaaaaaJAVAL.AGNaaaaaaaaaaJAVAL.AGNaaaaaaaaaaJAVAL.AGNaaaaaaaaaaJ$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$");
    }

    @Test
    public void test39320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest78.test39320");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.rightPad("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa...langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.lang", 21, "4444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444Java.litu.avajlitu.avajjava.litu.avajlitu.avajjava.litu.avajlitu.avajjava.litu.avajlitu.avajjava.litu.avajlitu.avajjava.litu.avajlitu.avajjava.litu.avajlitu.avajjava.litu.avajlitu.avajjava.litu.avajlitu.avajjava.litu.avajlitu.avajjava.litu.avajlitu.avajjava.litu.avajlitu.avajjava.litu.avajlitu.avajjava.litu.avajlitu.avajjava.litu.avajlitu.avajjava.litu.avajlitu.avajjava.litu.avajlitu.avajjava.litu.avajlitu.avajjava.litu.avajlitu.avajjava.litu.avajlitu.avajjava.litu.avajlitu.avajjava.litu.avajlitu.avajjava.litu.avajlitu.avajjava.litu.avajlitu.avajjava.litu.avajlitu.avajjava.litu.avajlitu.avajjava.litu.avajlitu.avajjava.litu.avajlitu.avajjava.litu.avajlitu.avajjava.litu.avajlitu.avajjava.litu.avajlitu.avajjava.litu.avajlitu.avajjava.litu.avajlitu.avaj");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa...langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.lang" + "'", str3, "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa...langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.lang");
    }

    @Test
    public void test39321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest78.test39321");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceOnce("Arralitu.avajlitu.ava", "NAL.AVAJ", "NTERFACE JAVA.LANG.cLONEABLE....$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$galaa$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Arralitu.avajlitu.ava" + "'", str3, "Arralitu.avajlitu.ava");
    }

    @Test
    public void test39322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest78.test39322");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeStart("LANGH!IH!IH!IH!IH!IH!", "a..........java..........java..........java..........java.........");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "LANGH!IH!IH!IH!IH!IH!" + "'", str2, "LANGH!IH!IH!IH!IH!IH!");
    }

    @Test
    public void test39323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest78.test39323");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.leftPad("A..yL A.4444444444...", 39, '#');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "##################A..yL A.4444444444..." + "'", str3, "##################A..yL A.4444444444...");
    }

    @Test
    public void test39324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest78.test39324");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.stripStart("interface java.lang.Cloneable.......java.......Objectava..........javainterface java.io", "ElbazilaireS.......java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........javanignirtSelbaenolC.gnal");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "face java.lang.Cloneable.......java.......Objectava..........javainterface java.io" + "'", str2, "face java.lang.Cloneable.......java.......Objectava..........javainterface java.io");
    }

    @Test
    public void test39325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest78.test39325");
        int int2 = org.apache.commons.lang3.StringUtils.countMatches("i elbaenolCAgnalAavajiecafretniTRINGi elbaenolCAgnalAavajiecaf", "ITU.AVAj                                                                                                                                                                                                                                                                                                                                                                                                                 ");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test39326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest78.test39326");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.endsWithIgnoreCase("                                                                                                                                                                                      4444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444aaaaaaaaaa                                                                                                                                                                                      ", "                                                             nga$lavaj                                                             ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test39327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest78.test39327");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("NAELOOB                                                                                                                                                                                                                                                                                                                                                                                                                                                                                        ", "ArrayListArrayListArrayList", 348);
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void test39328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest78.test39328");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.right("JAVAULANGJAVAULANGJAVAULANGJAVAULANGJAVAULANGJAVAULANGJAVAULANGJAVAULANGJAVAULANGJAVAULANGJAVAULANGJAVAULANGJAVAULANGJAVAULANGJAVAULANGJAVAULANG", 58);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "LANGJAVAULANGJAVAULANGJAVAULANGJAVAULANGJAVAULANGJAVAULANG" + "'", str2, "LANGJAVAULANGJAVAULANGJAVAULANGJAVAULANGJAVAULANGJAVAULANG");
    }

    @Test
    public void test39329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest78.test39329");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.swapCase("Gnal                                                                1");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "gNAL                                                                1" + "'", str1, "gNAL                                                                1");
    }

    @Test
    public void test39330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest78.test39330");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.right("s", 46);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "s" + "'", str2, "s");
    }

    @Test
    public void test39331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest78.test39331");
        java.lang.String str1 = org.apache.commons.lang3.ClassUtils.getPackageCanonicalName("interface java.lang.Cloneable... ... ... ... ... ... ... ... interface java.io.Serializable");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "interfacejava.lang.Cloneable........................interfacejava.io" + "'", str1, "interfacejava.lang.Cloneable........................interfacejava.io");
    }

    @Test
    public void test39332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest78.test39332");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isEmpty((java.lang.CharSequence) "..$$$$$$$$$$$$$$$$$$$$$$$$$$$$$.....");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test39333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest78.test39333");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.normalizeSpace("INTERFACEJAVA.LANG.CLONEABLELANG.GNALJAVA.LANGAVAJ.GNALJAVA.LANGAVAJ.GNALJAVA.LANGAVAJ.GNALJAVA.LANGAVAJ.GNALJAVA.LANGAVAJ.GNALJAVA.LANGAVAJ.GNALJAVA.LANGAVAJ.GNALJAVA.LANGAVAJ.JAVAINTERFACEJAVA");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "INTERFACEJAVA.LANG.CLONEABLELANG.GNALJAVA.LANGAVAJ.GNALJAVA.LANGAVAJ.GNALJAVA.LANGAVAJ.GNALJAVA.LANGAVAJ.GNALJAVA.LANGAVAJ.GNALJAVA.LANGAVAJ.GNALJAVA.LANGAVAJ.GNALJAVA.LANGAVAJ.JAVAINTERFACEJAVA" + "'", str1, "INTERFACEJAVA.LANG.CLONEABLELANG.GNALJAVA.LANGAVAJ.GNALJAVA.LANGAVAJ.GNALJAVA.LANGAVAJ.GNALJAVA.LANGAVAJ.GNALJAVA.LANGAVAJ.GNALJAVA.LANGAVAJ.GNALJAVA.LANGAVAJ.GNALJAVA.LANGAVAJ.JAVAINTERFACEJAVA");
    }

    @Test
    public void test39334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest78.test39334");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringAfterLast("jAVA", "A...ituLlituLlituLlituLlituLlituLlituLlituLlituLlituLlituLlituLlituLlituLlituLlituLlituLlituLlituLlituLlituLlituLlituLlituLlituLlituLlituc...ituLlituLlituLlituLlituLlituLlituLlituLlituLlituLlituLlituLlituLlituLlituLlituLlituLlituLlituLlituLlituLlituLlituLlituLlituLlituLlitu....ituLlituLlituLlituLlituLlituLlituLlituLlituLlituLlituLlituLlituLlituLlituLlituLlituLlituLlituLlituLlituLlituLlituLlituLlituLlituLlitu.Ob...ituLlituLlituLlituLlituLlituLlituLlituLlituLlituLlituLlituLlituLlituLlituLlituLlituLlituLlituLlituLlituLlituLlituLlituLlituLlituLlituec...ituLlituLlituLlituLlituLlituLlituLlituLlituLlituLlituLlituLlituLlituLlituLlituLlituLlituLlituLlituLlituLlituLlituLlituLlituLlituLlituyL");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test39335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest78.test39335");
        java.util.Locale locale1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.apache.commons.lang3.StringUtils.upperCase("INTERFACE#JAVA.LANG.cLONEABLE....................................................................#######################javaulangINTERFACE#JAVA.IO", locale1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test39336() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest78.test39336");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripAccents((java.lang.CharSequence) "444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444LITU.AVAJLITU.AVAJ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444LITU.AVAJLITU.AVAJ" + "'", str1, "444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444LITU.AVAJLITU.AVAJ");
    }

    @Test
    public void test39337() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest78.test39337");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfIgnoreCase("h!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ihLITU.AVAJ", "ssalcrrA tsiLytcejbO.gnal.avaj");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test39338() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest78.test39338");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.center("                                                                                                                                                                                                                                                                                                                                                                                                          ClassJAVA.LANGaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaULANG", 537, "java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........jav");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "java..........java....                                                                                                                                                                                                                                                                                                                                                                                                          ClassJAVA.LANGaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaULANGjava..........java...." + "'", str3, "java..........java....                                                                                                                                                                                                                                                                                                                                                                                                          ClassJAVA.LANGaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaULANGjava..........java....");
    }

    @Test
    public void test39339() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest78.test39339");
        java.lang.Object obj0 = null;
        java.lang.String str2 = org.apache.commons.lang3.ClassUtils.getShortClassName(obj0, "interfacejavaalangaCloneable#interfacejavaaiointerfacejavaalangaCloneable#interfacejavaaiointerfacejavaala");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "interfacejavaalangaCloneable#interfacejavaaiointerfacejavaalangaCloneable#interfacejavaaiointerfacejavaala" + "'", str2, "interfacejavaalangaCloneable#interfacejavaaiointerfacejavaalangaCloneable#interfacejavaaiointerfacejavaala");
    }

    @Test
    public void test39340() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest78.test39340");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.split("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa...#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#lass java#lang#String", '#');
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test39341() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest78.test39341");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.split("Rgnaavajaaaaaaaaaaaaaaaaaaaaaaaaaa", "GNAL.AVAJGNAL..langGNAL.AVAJGNAL", 23);
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void test39342() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest78.test39342");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.rightPad("AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA...AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA...AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA...AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA...AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA...AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA...AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA...AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA...AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA...RRA", 3);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA...AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA...AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA...AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA...AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA...AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA...AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA...AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA...AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA...RRA" + "'", str2, "AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA...AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA...AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA...AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA...AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA...AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA...AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA...AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA...AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA...RRA");
    }

    @Test
    public void test39343() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest78.test39343");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "rrclass javalangObjectystrrclass javalangObjectystrrclass javalangObjectystrrclass javalangObjectystrrclass javalangObjectystrrclass javalangObjectystrrclass javalangObjectystrrclass javalangObjectystrrclass javalangObjectystrrclass javalangObjectystrrclass javalangObjectystrrclass javalangObjectystrrclass javalangObjectystrrclass javalangObjectystrrclass javalangObjectystrrclass javalangObjectystrrclass javalangObjectystrrclass javalangObjectystrrclass javalangObjectystrrclass javalangO#AGNAAAAAAAAGNALrrclass javalangObjectystrrclass javalangObjectystrrclass javalangObjectystrrclass javalangObjectystrrclass javalangObjectystrrclass javalangObjectystrrclass javalangObjectystrrclass javalangObjectystrrclass javalangObjectystrrclass javalangObjectystrrclass javalangObjectystrrclass javalangObjectystrrclass javalangObjectystrrclass javalangObjectystrrclass javalangObjectystrrclass javalangObjectystrrclass javalangObjectystrrclass javalangObjectystrrclass javalangObjectystrrclass javalangO", "...#######");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 492 + "'", int2 == 492);
    }

    @Test
    public void test39344() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest78.test39344");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitByCharacterTypeCamelCase(".............................................................lang                                                                                    ");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.stripAll(strArray1);
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.concat((java.lang.Object[]) strArray1);
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + ".............................................................lang                                                                                    " + "'", str3, ".............................................................lang                                                                                    ");
    }

    @Test
    public void test39345() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest78.test39345");
        java.lang.CharSequence charSequence0 = null;
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsNone(charSequence0, "$                                                                                            ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test39346() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest78.test39346");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.reverse("ylavvsaylavvsaylavvsaylavvsaylavvsaylavvsaylavvsaylavvsaylavvsaylavvsaylavvsaylavvsaylavvsaylavvsaylavvsaylavvsaylavvsaylavvsaylavvsaylavvsaylavvsaylavvsaylavvsaylavvsaylavvsaylavvsaylavvsaylavvsaylavvsaylavvsaylavvsaylavvsaylavvsaylavvsaylavvsaylavvsaylavvsaylavvsaylavvsaylavvsaylavvsaylavvsaylavvsaylavvsaylavvsaylavvsaylavvsaylavvsaylavvsa");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "asvvalyasvvalyasvvalyasvvalyasvvalyasvvalyasvvalyasvvalyasvvalyasvvalyasvvalyasvvalyasvvalyasvvalyasvvalyasvvalyasvvalyasvvalyasvvalyasvvalyasvvalyasvvalyasvvalyasvvalyasvvalyasvvalyasvvalyasvvalyasvvalyasvvalyasvvalyasvvalyasvvalyasvvalyasvvalyasvvalyasvvalyasvvalyasvvalyasvvalyasvvalyasvvalyasvvalyasvvalyasvvalyasvvalyasvvalyasvvalyasvvaly" + "'", str1, "asvvalyasvvalyasvvalyasvvalyasvvalyasvvalyasvvalyasvvalyasvvalyasvvalyasvvalyasvvalyasvvalyasvvalyasvvalyasvvalyasvvalyasvvalyasvvalyasvvalyasvvalyasvvalyasvvalyasvvalyasvvalyasvvalyasvvalyasvvalyasvvalyasvvalyasvvalyasvvalyasvvalyasvvalyasvvalyasvvalyasvvalyasvvalyasvvalyasvvalyasvvalyasvvalyasvvalyasvvalyasvvalyasvvalyasvvalyasvvalyasvvaly");
    }

    @Test
    public void test39347() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest78.test39347");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.center("###########################VA.LANGAVAJ.GNALJAVA.LANGAVAJ.GNALJAVA.LANGAVAJ.GNALJAVA.LANGAVAJ.GNALJAVA.LANGAVAJ.GNALJAVA.LANG###########################INTERFACE JAVAaLANGacLONEABLEaaaaaaaJAVAaaaaaaaaaaJAVAaaaaaaaaaaJAVAaaaaaaaaaaJAVAaaaaaaaaaaJAVAaaaaaaaaaaJAVAaaaaaaaaaaJAVAaaaaaaaaaaJAVAaaaaaaaaaaJAVAaaaaaaaaaaJAVAaaaaaaaaaaJAVAaaaaaaaaaaJAVAaaaaaaaaaaJAVAaaaaaaaaaaJAVAaaaaaaaaaaJAVAaaaaaarrINTERFACE JAVAaLANGacLONEABLEaaaaaaaJAVAaaaaaaaaaaJAVAaaaaaaaaaaJAVAaaaaaaaaaaJAVAaaaaaaaaaaJAVAaaaaaaaaaaJAVAaaaaaaaaaaJAVAaaaaaaaaaaJAVAaaaaaaaaaaJAVAaaaaaaaaaaJAVAaaaaaaaaaaJAVAaaaaaaaaaaJAVAaaaaaaaaaaJAVAaaaaaaaaaaJAVAaaaaaaaaaaJAVAaaaaaaa", 386, "                  ...                         ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "###########################VA.LANGAVAJ.GNALJAVA.LANGAVAJ.GNALJAVA.LANGAVAJ.GNALJAVA.LANGAVAJ.GNALJAVA.LANGAVAJ.GNALJAVA.LANG###########################INTERFACE JAVAaLANGacLONEABLEaaaaaaaJAVAaaaaaaaaaaJAVAaaaaaaaaaaJAVAaaaaaaaaaaJAVAaaaaaaaaaaJAVAaaaaaaaaaaJAVAaaaaaaaaaaJAVAaaaaaaaaaaJAVAaaaaaaaaaaJAVAaaaaaaaaaaJAVAaaaaaaaaaaJAVAaaaaaaaaaaJAVAaaaaaaaaaaJAVAaaaaaaaaaaJAVAaaaaaaaaaaJAVAaaaaaarrINTERFACE JAVAaLANGacLONEABLEaaaaaaaJAVAaaaaaaaaaaJAVAaaaaaaaaaaJAVAaaaaaaaaaaJAVAaaaaaaaaaaJAVAaaaaaaaaaaJAVAaaaaaaaaaaJAVAaaaaaaaaaaJAVAaaaaaaaaaaJAVAaaaaaaaaaaJAVAaaaaaaaaaaJAVAaaaaaaaaaaJAVAaaaaaaaaaaJAVAaaaaaaaaaaJAVAaaaaaaaaaaJAVAaaaaaaa" + "'", str3, "###########################VA.LANGAVAJ.GNALJAVA.LANGAVAJ.GNALJAVA.LANGAVAJ.GNALJAVA.LANGAVAJ.GNALJAVA.LANGAVAJ.GNALJAVA.LANG###########################INTERFACE JAVAaLANGacLONEABLEaaaaaaaJAVAaaaaaaaaaaJAVAaaaaaaaaaaJAVAaaaaaaaaaaJAVAaaaaaaaaaaJAVAaaaaaaaaaaJAVAaaaaaaaaaaJAVAaaaaaaaaaaJAVAaaaaaaaaaaJAVAaaaaaaaaaaJAVAaaaaaaaaaaJAVAaaaaaaaaaaJAVAaaaaaaaaaaJAVAaaaaaaaaaaJAVAaaaaaaaaaaJAVAaaaaaarrINTERFACE JAVAaLANGacLONEABLEaaaaaaaJAVAaaaaaaaaaaJAVAaaaaaaaaaaJAVAaaaaaaaaaaJAVAaaaaaaaaaaJAVAaaaaaaaaaaJAVAaaaaaaaaaaJAVAaaaaaaaaaaJAVAaaaaaaaaaaJAVAaaaaaaaaaaJAVAaaaaaaaaaaJAVAaaaaaaaaaaJAVAaaaaaaaaaaJAVAaaaaaaaaaaJAVAaaaaaaaaaaJAVAaaaaaaa");
    }

    @Test
    public void test39348() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest78.test39348");
        int int3 = org.apache.commons.lang3.StringUtils.lastOrdinalIndexOf("", "yLis...VA.LANGAVAJ.GNALJAVA.LANGAVAJ.GNALJAVA.LANGAVAJ.GNALJAVA.LANGAVAJ.GNALJAVA.LANGAVAJ.GNALJAVA.LANGaArr", 99);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test39349() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest78.test39349");
        int int3 = org.apache.commons.lang3.StringUtils.indexOf("arr...aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa...aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa...aJava.lang.Stringclassjava.lang.Stringclassjava.lang.Stringclas.lang.Stringclassjava.lang.Stringcarr...aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa...aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa...aa", "H!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IHLITU.AVAJ                                                                                                                                                                                                                                                                                                                                                       ", 507);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test39350() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest78.test39350");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAllUpperCase((java.lang.CharSequence) "interface javalangCloneableainterface java.io.Serializable");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test39351() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest78.test39351");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isEmpty((java.lang.CharSequence) ".VJ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test39352() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest78.test39352");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfDifference((java.lang.CharSequence) "........................", (java.lang.CharSequence) "44444444444444444444444444444444444444444444444444444444444444444444444444444444$");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test39353() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest78.test39353");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.center("", 878);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                              " + "'", str2, "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                              ");
    }

    @Test
    public void test39354() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest78.test39354");
        int int2 = org.apache.commons.lang3.StringUtils.getLevenshteinDistance((java.lang.CharSequence) "Arr... aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa... aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa... aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa... aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa... aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa... aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa... aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa... aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa... aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa...", (java.lang.CharSequence) "elbazilaireS.......java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........javanignirtSelbaenolC.gnal.avaj ecafretni");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 737 + "'", int2 == 737);
    }

    @Test
    public void test39355() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest78.test39355");
        java.lang.Class<?> wildcardClass0 = null;
        java.lang.Class[] classArray2 = new java.lang.Class[1];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray3 = (java.lang.Class<?>[]) classArray2;
        wildcardClassArray3[0] = wildcardClass0;
        java.lang.Class[] classArray7 = new java.lang.Class[0];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray8 = (java.lang.Class<?>[]) classArray7;
        boolean boolean10 = org.apache.commons.lang3.ClassUtils.isAssignable(wildcardClassArray3, wildcardClassArray8, false);
        java.lang.String str11 = org.apache.commons.lang3.StringUtils.concat((java.lang.Object[]) wildcardClassArray3);
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
        java.lang.String[] strArray35 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("class java.lang.String", "                                   ");
        java.lang.String[] strArray36 = org.apache.commons.lang3.StringUtils.stripAll(strArray35);
        java.lang.Class<?>[] wildcardClassArray37 = org.apache.commons.lang3.ClassUtils.toClass((java.lang.Object[]) strArray36);
        java.lang.Class<?>[] wildcardClassArray38 = org.apache.commons.lang3.ClassUtils.primitivesToWrappers(wildcardClassArray37);
        boolean boolean39 = org.apache.commons.lang3.ClassUtils.isAssignable(wildcardClassArray26, wildcardClassArray38);
        java.lang.Class<?>[] wildcardClassArray40 = org.apache.commons.lang3.ClassUtils.primitivesToWrappers(wildcardClassArray38);
        boolean boolean41 = org.apache.commons.lang3.ClassUtils.isAssignable(wildcardClassArray3, wildcardClassArray38);
        java.lang.String[] strArray44 = new java.lang.String[] { "                                   " };
        java.lang.String str45 = org.apache.commons.lang3.StringUtils.getCommonPrefix(strArray44);
        java.lang.Class<?>[] wildcardClassArray46 = org.apache.commons.lang3.ClassUtils.toClass((java.lang.Object[]) strArray44);
        java.lang.String str47 = org.apache.commons.lang3.StringUtils.concatWith("$", (java.lang.Object[]) wildcardClassArray46);
        java.lang.Class<?>[] wildcardClassArray48 = org.apache.commons.lang3.ClassUtils.wrappersToPrimitives(wildcardClassArray46);
        java.lang.String[] strArray51 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("hi!", "");
        java.lang.String[] strArray53 = org.apache.commons.lang3.StringUtils.stripAll(strArray51, "$");
        java.lang.Class<?>[] wildcardClassArray54 = org.apache.commons.lang3.ClassUtils.toClass((java.lang.Object[]) strArray51);
        java.lang.Class<?> wildcardClass55 = null;
        java.lang.Class[] classArray57 = new java.lang.Class[1];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray58 = (java.lang.Class<?>[]) classArray57;
        wildcardClassArray58[0] = wildcardClass55;
        java.lang.Class<?>[] wildcardClassArray61 = org.apache.commons.lang3.ClassUtils.primitivesToWrappers(wildcardClassArray58);
        java.lang.String[] strArray63 = new java.lang.String[] { "                                   " };
        java.lang.String str64 = org.apache.commons.lang3.StringUtils.getCommonPrefix(strArray63);
        java.lang.Class<?>[] wildcardClassArray65 = org.apache.commons.lang3.ClassUtils.toClass((java.lang.Object[]) strArray63);
        java.lang.Class<?> wildcardClass66 = null;
        java.lang.Class[] classArray68 = new java.lang.Class[1];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray69 = (java.lang.Class<?>[]) classArray68;
        wildcardClassArray69[0] = wildcardClass66;
        java.lang.Class<?>[] wildcardClassArray72 = org.apache.commons.lang3.ClassUtils.primitivesToWrappers(wildcardClassArray69);
        boolean boolean73 = org.apache.commons.lang3.ClassUtils.isAssignable(wildcardClassArray65, wildcardClassArray69);
        boolean boolean75 = org.apache.commons.lang3.ClassUtils.isAssignable(wildcardClassArray58, wildcardClassArray69, true);
        boolean boolean77 = org.apache.commons.lang3.ClassUtils.isAssignable(wildcardClassArray54, wildcardClassArray69, false);
        java.lang.Class<?>[] wildcardClassArray78 = org.apache.commons.lang3.ClassUtils.primitivesToWrappers(wildcardClassArray54);
        java.lang.Class<?>[] wildcardClassArray79 = org.apache.commons.lang3.ClassUtils.primitivesToWrappers(wildcardClassArray78);
        java.lang.Class<?>[] wildcardClassArray80 = org.apache.commons.lang3.ClassUtils.primitivesToWrappers(wildcardClassArray79);
        boolean boolean82 = org.apache.commons.lang3.ClassUtils.isAssignable(wildcardClassArray46, wildcardClassArray79, false);
        boolean boolean84 = org.apache.commons.lang3.ClassUtils.isAssignable(wildcardClassArray38, wildcardClassArray46, true);
        org.junit.Assert.assertNotNull(classArray2);
        org.junit.Assert.assertNotNull(wildcardClassArray3);
        org.junit.Assert.assertNotNull(classArray7);
        org.junit.Assert.assertNotNull(wildcardClassArray8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
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
        org.junit.Assert.assertNotNull(strArray35);
        org.junit.Assert.assertNotNull(strArray36);
        org.junit.Assert.assertNotNull(wildcardClassArray37);
        org.junit.Assert.assertNotNull(wildcardClassArray38);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
        org.junit.Assert.assertNotNull(wildcardClassArray40);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + true + "'", boolean41 == true);
        org.junit.Assert.assertNotNull(strArray44);
        org.junit.Assert.assertEquals("'" + str45 + "' != '" + "                                   " + "'", str45, "                                   ");
        org.junit.Assert.assertNotNull(wildcardClassArray46);
        org.junit.Assert.assertEquals("'" + str47 + "' != '" + "class java.lang.String" + "'", str47, "class java.lang.String");
        org.junit.Assert.assertNotNull(wildcardClassArray48);
        org.junit.Assert.assertNotNull(strArray51);
        org.junit.Assert.assertNotNull(strArray53);
        org.junit.Assert.assertNotNull(wildcardClassArray54);
        org.junit.Assert.assertNotNull(classArray57);
        org.junit.Assert.assertNotNull(wildcardClassArray58);
        org.junit.Assert.assertNotNull(wildcardClassArray61);
        org.junit.Assert.assertNotNull(strArray63);
        org.junit.Assert.assertEquals("'" + str64 + "' != '" + "                                   " + "'", str64, "                                   ");
        org.junit.Assert.assertNotNull(wildcardClassArray65);
        org.junit.Assert.assertNotNull(classArray68);
        org.junit.Assert.assertNotNull(wildcardClassArray69);
        org.junit.Assert.assertNotNull(wildcardClassArray72);
        org.junit.Assert.assertTrue("'" + boolean73 + "' != '" + false + "'", boolean73 == false);
        org.junit.Assert.assertTrue("'" + boolean75 + "' != '" + false + "'", boolean75 == false);
        org.junit.Assert.assertTrue("'" + boolean77 + "' != '" + false + "'", boolean77 == false);
        org.junit.Assert.assertNotNull(wildcardClassArray78);
        org.junit.Assert.assertNotNull(wildcardClassArray79);
        org.junit.Assert.assertNotNull(wildcardClassArray80);
        org.junit.Assert.assertTrue("'" + boolean82 + "' != '" + true + "'", boolean82 == true);
        org.junit.Assert.assertTrue("'" + boolean84 + "' != '" + true + "'", boolean84 == true);
    }

    @Test
    public void test39356() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest78.test39356");
        int int2 = org.apache.commons.lang3.StringUtils.indexOf("aAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA", "AAAAAAAAAAAAAAAAAAAAAAAA");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
    }

    @Test
    public void test39357() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest78.test39357");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.reverse("ByteByteByteByteByteByteByteByteByteByteByteByteByteByteByteByteByteByteByteByteByteByteByteByteByteByteByteByteByteByteByteByteByteByteByteByteByteByteByteByteByteByteByteByteByteByteByteByteByteByteByteByteByteyteByteByteByteByteByteByteByteByteByteByteByteByteByteByteByteByteByteByteByteByteByteByteByteByteByteByteByteByteByteByteByteByteByteByteByteByteByteByteByteByteByteByteByteByteByteByteByteByteByteByteByteByte");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "etyBetyBetyBetyBetyBetyBetyBetyBetyBetyBetyBetyBetyBetyBetyBetyBetyBetyBetyBetyBetyBetyBetyBetyBetyBetyBetyBetyBetyBetyBetyBetyBetyBetyBetyBetyBetyBetyBetyBetyBetyBetyBetyBetyBetyBetyBetyBetyBetyBetyBetyBetyBetyetyBetyBetyBetyBetyBetyBetyBetyBetyBetyBetyBetyBetyBetyBetyBetyBetyBetyBetyBetyBetyBetyBetyBetyBetyBetyBetyBetyBetyBetyBetyBetyBetyBetyBetyBetyBetyBetyBetyBetyBetyBetyBetyBetyBetyBetyBetyBetyBetyBetyBetyBetyBetyB" + "'", str1, "etyBetyBetyBetyBetyBetyBetyBetyBetyBetyBetyBetyBetyBetyBetyBetyBetyBetyBetyBetyBetyBetyBetyBetyBetyBetyBetyBetyBetyBetyBetyBetyBetyBetyBetyBetyBetyBetyBetyBetyBetyBetyBetyBetyBetyBetyBetyBetyBetyBetyBetyBetyBetyetyBetyBetyBetyBetyBetyBetyBetyBetyBetyBetyBetyBetyBetyBetyBetyBetyBetyBetyBetyBetyBetyBetyBetyBetyBetyBetyBetyBetyBetyBetyBetyBetyBetyBetyBetyBetyBetyBetyBetyBetyBetyBetyBetyBetyBetyBetyBetyBetyBetyBetyBetyBetyB");
    }

    @Test
    public void test39358() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest78.test39358");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.abbreviateMiddle("j4v444$444444444", "...                   $$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$                             ...", 90);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "j4v444$444444444" + "'", str3, "j4v444$444444444");
    }

    @Test
    public void test39359() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest78.test39359");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.abbreviate("va.langjava.langjava.lang... .... .java.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.lang... .... .va.langjava.langjava.lang... .... .java.langjava.langjava.langjava.langjava.langja", 96);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "va.langjava.langjava.lang... .... .java.langjava.langjava.langjava.langjava.langjava.langjava..." + "'", str2, "va.langjava.langjava.lang... .... .java.langjava.langjava.langjava.langjava.langjava.langjava...");
    }

    @Test
    public void test39360() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest78.test39360");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("hi!", "");
        java.lang.String[] strArray5 = org.apache.commons.lang3.StringUtils.stripAll(strArray3, "$");
        java.lang.Class<?>[] wildcardClassArray6 = org.apache.commons.lang3.ClassUtils.toClass((java.lang.Object[]) strArray3);
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
        boolean boolean29 = org.apache.commons.lang3.ClassUtils.isAssignable(wildcardClassArray6, wildcardClassArray21, false);
        java.lang.Class<?>[] wildcardClassArray30 = org.apache.commons.lang3.ClassUtils.primitivesToWrappers(wildcardClassArray6);
        java.lang.Class<?>[] wildcardClassArray31 = org.apache.commons.lang3.ClassUtils.primitivesToWrappers(wildcardClassArray30);
        java.lang.Class<?>[] wildcardClassArray32 = org.apache.commons.lang3.ClassUtils.primitivesToWrappers(wildcardClassArray31);
        java.lang.Class<?> wildcardClass33 = null;
        java.lang.Class[] classArray35 = new java.lang.Class[1];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray36 = (java.lang.Class<?>[]) classArray35;
        wildcardClassArray36[0] = wildcardClass33;
        java.lang.Class<?>[] wildcardClassArray39 = org.apache.commons.lang3.ClassUtils.primitivesToWrappers(wildcardClassArray36);
        java.lang.String[] strArray41 = new java.lang.String[] { "                                   " };
        java.lang.String str42 = org.apache.commons.lang3.StringUtils.getCommonPrefix(strArray41);
        java.lang.Class<?>[] wildcardClassArray43 = org.apache.commons.lang3.ClassUtils.toClass((java.lang.Object[]) strArray41);
        java.lang.Class<?> wildcardClass44 = null;
        java.lang.Class[] classArray46 = new java.lang.Class[1];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray47 = (java.lang.Class<?>[]) classArray46;
        wildcardClassArray47[0] = wildcardClass44;
        java.lang.Class<?>[] wildcardClassArray50 = org.apache.commons.lang3.ClassUtils.primitivesToWrappers(wildcardClassArray47);
        boolean boolean51 = org.apache.commons.lang3.ClassUtils.isAssignable(wildcardClassArray43, wildcardClassArray47);
        boolean boolean53 = org.apache.commons.lang3.ClassUtils.isAssignable(wildcardClassArray36, wildcardClassArray47, true);
        boolean boolean55 = org.apache.commons.lang3.ClassUtils.isAssignable(wildcardClassArray32, wildcardClassArray36, false);
        java.lang.Class<?>[] wildcardClassArray56 = org.apache.commons.lang3.ClassUtils.toClass((java.lang.Object[]) wildcardClassArray32);
        java.lang.String str57 = org.apache.commons.lang3.StringUtils.concatWith("", (java.lang.Object[]) wildcardClassArray32);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertNotNull(strArray5);
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
        org.junit.Assert.assertNotNull(wildcardClassArray31);
        org.junit.Assert.assertNotNull(wildcardClassArray32);
        org.junit.Assert.assertNotNull(classArray35);
        org.junit.Assert.assertNotNull(wildcardClassArray36);
        org.junit.Assert.assertNotNull(wildcardClassArray39);
        org.junit.Assert.assertNotNull(strArray41);
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "                                   " + "'", str42, "                                   ");
        org.junit.Assert.assertNotNull(wildcardClassArray43);
        org.junit.Assert.assertNotNull(classArray46);
        org.junit.Assert.assertNotNull(wildcardClassArray47);
        org.junit.Assert.assertNotNull(wildcardClassArray50);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
        org.junit.Assert.assertNotNull(wildcardClassArray56);
        org.junit.Assert.assertEquals("'" + str57 + "' != '" + "class java.lang.String" + "'", str57, "class java.lang.String");
    }

    @Test
    public void test39361() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest78.test39361");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphaSpace((java.lang.CharSequence) "                                                                                                                                                                                                                                                        cLONEABLE4I");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test39362() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest78.test39362");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNotEmpty((java.lang.CharSequence) "#############################");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test39363() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest78.test39363");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.stripStart("AAAAAAAAAAngalavajAAAAAAAAAAngalavajAAAAAAAAAAngalavajAAAAAAAAAAngalavajAAAAAAAAAAngalavajAAAAAAAAAAngalavajAAAAAAAAAAngalavajAAAAAAAAAAngalavajAAAAAAAAAAngalavajAAAAAAAAAAngalavajAAAAAAAAAAngalavajAAAAAAAAAAngalavajAAAAAAAAAAngalavajAAAAAAAAAAngalavajAAAAAAAAAAngalavajAAAAAAAAAAngalavajAAAAAAAAAAngalavajAAAAAAAAAAngalavajAAAAAAAAAAngalavajAAAAAAAAAAngalavajAAAAAAAAAAngalavajAAAAAAAAAAngalavajAAAAAAAAAAngalavajAAAAAAAAAAngalavajAAAAAAAAAAngalavajAAAAAAAAAAngalavajAAAAAAAAAAngalavajAAAAAAAAAAngalavajAAAAAAAAAAngalavajAAAAAAAAAAngalavajAAAAAAAAAAngalavajAAAAAAAAAAngalavajAAAAAAAAAAngalavajAAAAAAAAAAngalavajAAAAAAAAAAngalavajAAAAAAAAAA][gnirtSlitu.avaj1-][gnirtSlitu.avaj1-                                                                                   ", "Array                                                                                                                                   ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "ngalavajAAAAAAAAAAngalavajAAAAAAAAAAngalavajAAAAAAAAAAngalavajAAAAAAAAAAngalavajAAAAAAAAAAngalavajAAAAAAAAAAngalavajAAAAAAAAAAngalavajAAAAAAAAAAngalavajAAAAAAAAAAngalavajAAAAAAAAAAngalavajAAAAAAAAAAngalavajAAAAAAAAAAngalavajAAAAAAAAAAngalavajAAAAAAAAAAngalavajAAAAAAAAAAngalavajAAAAAAAAAAngalavajAAAAAAAAAAngalavajAAAAAAAAAAngalavajAAAAAAAAAAngalavajAAAAAAAAAAngalavajAAAAAAAAAAngalavajAAAAAAAAAAngalavajAAAAAAAAAAngalavajAAAAAAAAAAngalavajAAAAAAAAAAngalavajAAAAAAAAAAngalavajAAAAAAAAAAngalavajAAAAAAAAAAngalavajAAAAAAAAAAngalavajAAAAAAAAAAngalavajAAAAAAAAAAngalavajAAAAAAAAAAngalavajAAAAAAAAAAngalavajAAAAAAAAAAngalavajAAAAAAAAAA][gnirtSlitu.avaj1-][gnirtSlitu.avaj1-                                                                                   " + "'", str2, "ngalavajAAAAAAAAAAngalavajAAAAAAAAAAngalavajAAAAAAAAAAngalavajAAAAAAAAAAngalavajAAAAAAAAAAngalavajAAAAAAAAAAngalavajAAAAAAAAAAngalavajAAAAAAAAAAngalavajAAAAAAAAAAngalavajAAAAAAAAAAngalavajAAAAAAAAAAngalavajAAAAAAAAAAngalavajAAAAAAAAAAngalavajAAAAAAAAAAngalavajAAAAAAAAAAngalavajAAAAAAAAAAngalavajAAAAAAAAAAngalavajAAAAAAAAAAngalavajAAAAAAAAAAngalavajAAAAAAAAAAngalavajAAAAAAAAAAngalavajAAAAAAAAAAngalavajAAAAAAAAAAngalavajAAAAAAAAAAngalavajAAAAAAAAAAngalavajAAAAAAAAAAngalavajAAAAAAAAAAngalavajAAAAAAAAAAngalavajAAAAAAAAAAngalavajAAAAAAAAAAngalavajAAAAAAAAAAngalavajAAAAAAAAAAngalavajAAAAAAAAAAngalavajAAAAAAAAAAngalavajAAAAAAAAAA][gnirtSlitu.avaj1-][gnirtSlitu.avaj1-                                                                                   ");
    }

    @Test
    public void test39364() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest78.test39364");
        int int2 = org.apache.commons.lang3.StringUtils.countMatches("AAAAAA...1AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA...1AAAAAAAAAAAAAAAAAAAAAAAAAA", "4444444444444javastringslitUgnirtSarraylistarraylistavaj.gnalarraylistarraylistarrayli44444444444444");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test39365() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest78.test39365");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.split("4444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444rclass java.lang.O...");
        boolean boolean3 = org.apache.commons.lang3.StringUtils.startsWithAny("interface java.lang.CloneableStringinterface java.io.Serializable", strArray2);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test39366() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest78.test39366");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.center("interface java.lang.Cloneable.litinterface java.io.erializable                                                                                                                                                                                                                                                                                                                                                                                                                                                                  ", 717, "NALAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "NALAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaainterface java.lang.Cloneable.litinterface java.io.erializable                                                                                                                                                                                                                                                                                                                                                                                                                                                                  NALAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa" + "'", str3, "NALAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaainterface java.lang.Cloneable.litinterface java.io.erializable                                                                                                                                                                                                                                                                                                                                                                                                                                                                  NALAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
    }

    @Test
    public void test39367() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest78.test39367");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isBlank((java.lang.CharSequence) "GN");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test39368() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest78.test39368");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOf(".ArrayListArrayListArrayListArrayLis", "java.langjava.langjava.langjava.langjava.langjava.la");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test39369() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest78.test39369");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOf("ARRYLISTARRYLISTARRYLISTARRYLIST", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa                                              ][gnirtslitu.avaj1-", 624);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test39370() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest78.test39370");
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("java.util", "slitUgnirtS");
        java.lang.String[] strArray5 = org.apache.commons.lang3.StringUtils.stripAll(strArray4);
        int int6 = org.apache.commons.lang3.StringUtils.lastIndexOfAny("$       ", strArray4);
        java.lang.String[] strArray10 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("", "AVAJ.GNAL", 18);
        java.lang.String str11 = org.apache.commons.lang3.StringUtils.replaceEachRepeatedly("java.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.lang", strArray4, strArray10);
        java.lang.String[] strArray12 = org.apache.commons.lang3.StringUtils.stripAll(strArray10);
        java.lang.String str16 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray10, "lang", 357, 29);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNotNull(strArray10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "java.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.lang" + "'", str11, "java.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.lang");
        org.junit.Assert.assertNotNull(strArray12);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
    }

    @Test
    public void test39371() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest78.test39371");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substring("JAVAAAAAAAAAAVA.LANG..", 61);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test39372() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest78.test39372");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.rightPad("i", 551);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "i                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                      " + "'", str2, "i                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                      ");
    }

    @Test
    public void test39373() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest78.test39373");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass1 = org.apache.commons.lang3.ClassUtils.getClass("                                                                                                                                                                                        ......java..........java..........java..........javanignirtSelbaenolC.gnal.avaj ecafretni                                                                                                                                                                                        ");
            org.junit.Assert.fail("Expected exception of type java.lang.ClassNotFoundException; message: //////java//////////java//////////java//////////javanignirtSelbaenolC/gnal/avajecafretni");
        } catch (java.lang.ClassNotFoundException e) {
            // Expected exception.
        }
    }

    @Test
    public void test39374() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest78.test39374");
        int int3 = org.apache.commons.lang3.StringUtils.lastOrdinalIndexOf(".44444444444444444444444444444444444444444444444444444444444444444444444444444444", "interface java.lang.Cloneable....................................................................                  ", 151);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test39375() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest78.test39375");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.abbreviateMiddle("A..AAAA                       JAVAULANGrrayListyLA.", "interface java.lang.CloneableAvaj.gnalinterface java.io.Serializable", 71);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "A..AAAA                       JAVAULANGrrayListyLA." + "'", str3, "A..AAAA                       JAVAULANGrrayListyLA.");
    }

    @Test
    public void test39376() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest78.test39376");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.contains("$       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       ", "                                                                       ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test39377() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest78.test39377");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphanumericSpace((java.lang.CharSequence) "                                                      .LANGa.                                                     ClassJAVA");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test39378() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest78.test39378");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringAfterLast("444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444interface java.lang.Cloneable4iGNIRTinterface java.lang.Cloneable4i444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444", "...STGNAL.Al.aRRAYlIST...Al.aRRAYlISTGNAL.Al.");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test39379() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest78.test39379");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripToNull("java.lang.Cloneable4interface java.io.Serializa");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "java.lang.Cloneable4interface java.io.Serializa" + "'", str1, "java.lang.Cloneable4interface java.io.Serializa");
    }

    @Test
    public void test39380() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest78.test39380");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfAnyBut("byte", "...       OI.AVAJECAFRETNI#ELBAENOLc.GNAL.AVAJECAFRETNIsTRINGuTILSsTRINGuTILSsTRINGuTILSsTRINGuTILSsTRINGuTILSsTRINGuTILSsTRINGuTILSsTRINGuTILSsTRINGuTILSsTRINGuTILS");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test39381() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest78.test39381");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.chomp("                                                                                                                                                                                                                                                                                                                                                                                                                 ##################################################java.uti#########################################################################");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "                                                                                                                                                                                                                                                                                                                                                                                                                 ##################################################java.uti#########################################################################" + "'", str1, "                                                                                                                                                                                                                                                                                                                                                                                                                 ##################################################java.uti#########################################################################");
    }

    @Test
    public void test39382() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest78.test39382");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("", "interfacegaga.lang.CloneableAAAAAAAAAAgagal.agnAAAAAAAAAAgagal.agnAAAAAAAAAAgagal.agnAAAAAAAAAAgagal.agnAAAAAAAAAAgagal.agnAAAAAAAAAAgagal.agnAAAAAAAAAAgagal.agnAAAAAAAAAAgagal.agnAAAAAAAAAAgagal.agnAAAAAAAAAAgagal.agnAAAAAAAAAAgagal.agnAAAAAAAAAAgagal.agnAAAAAAAAAAgagal.agnAAAAAAAAAAgagal.agnAAAAAAAAAAgagal.agnAAAAAAAAAAgagal.agnAAAAAAAAAAgagal.agnAAAAAAAAAAgagal.agnAAAAAAAAAAgagal.agnAAAAAAAAAAgagal.agnAAAAAAAAAAgagal.agnAAAAAAAAAAgagal.agnAAAAAAAAAAgagal.agnAAAAAAAAAAgagal.agnAAAAAAAAAAgagal.agnAAAAAAAAAAgagal.agnAAAAAAAAAAgagal.agnAAAAAAAAAAgagal.agnAAAAAAAAAAgagal.agnAAAAAAAAAAgagal.agnAAAAAAAAAAgagal.agnAAAAAAAAAAgagal.agnAAAAAAAAAAgagal.agnAAAAAAAAAAgagal.agnAAAAAAAAAAgagal.agnAAAAAAAAAAringinterfacegaga.io");
        boolean boolean4 = org.apache.commons.lang3.StringUtils.endsWithAny("gnal.aL.ArrayListgnal.aL.ArrayList", strArray3);
        java.lang.String str5 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray3);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
    }

    @Test
    public void test39383() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest78.test39383");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripAccents((java.lang.CharSequence) "class [Ljava.lang.Class;");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "class [Ljava.lang.Class;" + "'", str1, "class [Ljava.lang.Class;");
    }

    @Test
    public void test39384() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest78.test39384");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("GNALUAVAJ                       GNALUAVAJ                       SSALCGNALAVAJavajlitu", "interface java.lang.CloneableRChahactaRChahactaRChahactaRChahactaRChahactaRChahactalangagnaljRChahactaRChahactaRChahactaRChahactaRChahactaRChahactainterface java.io.Serializable");
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test39385() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest78.test39385");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.split(".................................................................................................................................................................Aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "4444444444444444SSSSSSSSSS", 840);
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.getCommonPrefix(strArray3);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + ".................................................................................................................................................................Aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa" + "'", str4, ".................................................................................................................................................................Aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
    }

    @Test
    public void test39386() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest78.test39386");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.remove("AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                     ", "gn                                            gn                                            gn                                            #########################################################...#########################################################...#########################################################...#########################################################...###########################################STRING.gn                                            gn                                            gn                                            #########################################################...#########################################################...#########################################################...#########################################################...############################################");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                     " + "'", str2, "AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                     ");
    }

    @Test
    public void test39387() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest78.test39387");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.right("ssalc gnirtsagnalaavaj", 929);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "ssalc gnirtsagnalaavaj" + "'", str2, "ssalc gnirtsagnalaavaj");
    }

    @Test
    public void test39388() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest78.test39388");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.reverseDelimited("a.lang.cloneablestringinterface java.io                          a.lang.cloneablestringinterface java.io                          a.lang.cloneablestringinterface java.io                          a.lang.cloneablestringinterface java.io                          a.lang.cloneablestringinterface java.io                          a.lang.cloneablestringinterface java.io                          a.lang.cloneablestringinterface java.io                          a.lang.cloneablestringinterface java.io                          a.lang.cloneablestringinterface java.io                          a.lang.cloneablestringinterface java.io                          ", '#');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "a.lang.cloneablestringinterface java.io                          a.lang.cloneablestringinterface java.io                          a.lang.cloneablestringinterface java.io                          a.lang.cloneablestringinterface java.io                          a.lang.cloneablestringinterface java.io                          a.lang.cloneablestringinterface java.io                          a.lang.cloneablestringinterface java.io                          a.lang.cloneablestringinterface java.io                          a.lang.cloneablestringinterface java.io                          a.lang.cloneablestringinterface java.io                          " + "'", str2, "a.lang.cloneablestringinterface java.io                          a.lang.cloneablestringinterface java.io                          a.lang.cloneablestringinterface java.io                          a.lang.cloneablestringinterface java.io                          a.lang.cloneablestringinterface java.io                          a.lang.cloneablestringinterface java.io                          a.lang.cloneablestringinterface java.io                          a.lang.cloneablestringinterface java.io                          a.lang.cloneablestringinterface java.io                          a.lang.cloneablestringinterface java.io                          ");
    }

    @Test
    public void test39389() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest78.test39389");
        java.lang.String str1 = org.apache.commons.lang3.ClassUtils.getPackageName("                                                                                                                                                                                                                                                                                                                                                                                                         utiljava.util444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444                                                                                                                                                                                                                                                                                                                                                                                                         ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "                                                                                                                                                                                                                                                                                                                                                                                                         utiljava" + "'", str1, "                                                                                                                                                                                                                                                                                                                                                                                                         utiljava");
    }

    @Test
    public void test39390() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest78.test39390");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("                       ....................................................................", "javalgnal.avajgnal.avajgnal.avajgnal.avajgnal.avajgnal.avajgnal.avajgnal.avajgnal.avajgnal.aG.JAVAGNAL.AVAJLANG.J######################                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                            ");
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test39391() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest78.test39391");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.contains("", "... ...");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test39392() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest78.test39392");
        int int3 = org.apache.commons.lang3.StringUtils.indexOfIgnoreCase("iyL A    ", "arrtsiLyarrtsiLyarrtsiLyarrtsiLyarrtsiLyarrtsiLyarrtsiLyarrtsiLyarrtsiLyarr...    ...rrtsiLyarrtsiLyarrtsiLyarrtsiLyarrtsiLyarrtsiLyarrtsiLyarrtsiLyarrtsiLyarr                                                                                                               ", 410);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test39393() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest78.test39393");
        int int3 = org.apache.commons.lang3.StringUtils.lastOrdinalIndexOf("langagnalj", "                                                                                                                                                                                                                                                                                                                                                                                                                 LANG.JAVATSILYARRATSILYARRATSILYARRA", 148);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test39394() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest78.test39394");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.startsWith("jvcclng", "Class");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test39395() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest78.test39395");
        int int2 = org.apache.commons.lang3.StringUtils.indexOf("                                                                        String[]String[]String[]String[]String[]String[]String[]String[]String[]String[]", "JAVA.LANG.CLONEABLE...                                 INTERFACE JAVA.IO.SERIALIZABLE");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test39396() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest78.test39396");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.defaultString("ss.lc gnirtS.gn.l..v.j", "JJJJJJJJJJJJJJJJJJJJJJAA");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "ss.lc gnirtS.gn.l..v.j" + "'", str2, "ss.lc gnirtS.gn.l..v.j");
    }

    @Test
    public void test39397() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest78.test39397");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripToEmpty("Serializabl#...#     #java#44444444444444444#.#4444");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Serializabl#...#     #java#44444444444444444#.#4444" + "'", str1, "Serializabl#...#     #java#44444444444444444#.#4444");
    }

    @Test
    public void test39398() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest78.test39398");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.normalizeSpace("                                                                                                                                     $                                                                                                                                             ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "$" + "'", str1, "$");
    }

    @Test
    public void test39399() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest78.test39399");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.upperCase("                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                       CLASSJAVA.LANGAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAULANG");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                       CLASSJAVA.LANGAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAULANG" + "'", str1, "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                       CLASSJAVA.LANGAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAULANG");
    }

    @Test
    public void test39400() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest78.test39400");
        char[] charArray13 = new char[] { ' ', ' ', '#', 'a', '4', 'a' };
        int int14 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "", charArray13);
        boolean boolean15 = org.apache.commons.lang3.StringUtils.containsAny("$", charArray13);
        boolean boolean16 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "hi!ArrayListArrayListArrayListavajhhhh AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAhhh AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAhhh AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAhhh AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAhhh AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAhhh AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAhhh AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAhhh AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAhhh AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAhhh AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA", charArray13);
        int int17 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "$ArrayList", charArray13);
        int int18 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "############################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################", charArray13);
        boolean boolean19 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "44444444aaaAYL Aa44444444444444444444444444444444444", charArray13);
        boolean boolean20 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "                                                                                 JAVAlLANGJ  ", charArray13);
        org.junit.Assert.assertNotNull(charArray13);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray13), "  #a4a");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray13), "  #a4a");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray13), "[ ,  , #, a, 4, a]");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 4 + "'", int17 == 4);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test39401() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest78.test39401");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.defaultIfBlank("LLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLyAAA..uti4444444444444444444444444444444444444444444444444444444444444444444444444ava4444444444444444444444444444444444444444444444444444444444444444444444444j", "$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$ArrayLis.....");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "LLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLyAAA..uti4444444444444444444444444444444444444444444444444444444444444444444444444ava4444444444444444444444444444444444444444444444444444444444444444444444444j" + "'", str2, "LLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLyAAA..uti4444444444444444444444444444444444444444444444444444444444444444444444444ava4444444444444444444444444444444444444444444444444444444444444444444444444j");
    }

    @Test
    public void test39402() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest78.test39402");
        java.lang.Iterable<java.lang.Class<?>> wildcardClassIterable0 = null;
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.join(wildcardClassIterable0, "         aa          ");
        org.junit.Assert.assertNull(str2);
    }

    @Test
    public void test39403() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest78.test39403");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAllUpperCase((java.lang.CharSequence) "GNALaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaagn                                            ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test39404() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest78.test39404");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.capitalize((java.lang.CharSequence) "                                                                                                                                                                                          ... ... ... ... ... ... ... ... ... ... GNA                                                                                                                                                                                           ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "                                                                                                                                                                                          ... ... ... ... ... ... ... ... ... ... GNA                                                                                                                                                                                           " + "'", str1, "                                                                                                                                                                                          ... ... ... ... ... ... ... ... ... ... GNA                                                                                                                                                                                           ");
    }

    @Test
    public void test39405() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest78.test39405");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.rightPad("LANGaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa                                                                                                                                                                                                                                                                                                                                                                                                           ", 19);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "LANGaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa                                                                                                                                                                                                                                                                                                                                                                                                           " + "'", str2, "LANGaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa                                                                                                                                                                                                                                                                                                                                                                                                           ");
    }

    @Test
    public void test39406() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest78.test39406");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.uncapitalize((java.lang.CharSequence) "444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA       444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA       444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444" + "'", str1, "444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA       444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444");
    }

    @Test
    public void test39407() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest78.test39407");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNumericSpace((java.lang.CharSequence) "TSIlYARRa.lA.LANG");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test39408() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest78.test39408");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAsciiPrintable((java.lang.CharSequence) "              Llitu               ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test39409() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest78.test39409");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "interface java.lang.Cloneable][sslCinterface java.io.Serializable", "Jav4444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444aaaaaaaaaava.langava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.lang");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test39410() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest78.test39410");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.defaultString("A..nyL A.ssssssssssssssssssssssssss                                 ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "A..nyL A.ssssssssssssssssssssssssss                                 " + "'", str1, "A..nyL A.ssssssssssssssssssssssssss                                 ");
    }

    @Test
    public void test39411() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest78.test39411");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.split("interface java.lang.Cloneableinterface java.lang.Cloneable$interface java.io.Serializableinterface java.io.Serializable", ' ');
        boolean boolean4 = org.apache.commons.lang3.StringUtils.startsWithAny("     aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", strArray3);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test39412() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest78.test39412");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("hi!", "");
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.stripAll(strArray2, "$");
        java.lang.Class<?>[] wildcardClassArray5 = org.apache.commons.lang3.ClassUtils.toClass((java.lang.Object[]) strArray2);
        java.lang.Class<?>[] wildcardClassArray6 = org.apache.commons.lang3.ClassUtils.toClass((java.lang.Object[]) wildcardClassArray5);
        java.lang.Class<?>[] wildcardClassArray7 = org.apache.commons.lang3.ClassUtils.wrappersToPrimitives(wildcardClassArray6);
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.concat((java.lang.Object[]) wildcardClassArray7);
        java.lang.String[] strArray10 = new java.lang.String[] { "                                   " };
        java.lang.String str11 = org.apache.commons.lang3.StringUtils.getCommonPrefix(strArray10);
        java.lang.Class<?>[] wildcardClassArray12 = org.apache.commons.lang3.ClassUtils.toClass((java.lang.Object[]) strArray10);
        java.lang.Class<?>[] wildcardClassArray13 = org.apache.commons.lang3.ClassUtils.primitivesToWrappers(wildcardClassArray12);
        boolean boolean14 = org.apache.commons.lang3.ClassUtils.isAssignable(wildcardClassArray7, wildcardClassArray13);
        java.lang.String[] strArray17 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("hi!", "");
        java.lang.String[] strArray19 = org.apache.commons.lang3.StringUtils.stripAll(strArray17, "$");
        java.lang.Class<?>[] wildcardClassArray20 = org.apache.commons.lang3.ClassUtils.toClass((java.lang.Object[]) strArray17);
        java.lang.Class<?>[] wildcardClassArray21 = org.apache.commons.lang3.ClassUtils.toClass((java.lang.Object[]) wildcardClassArray20);
        java.lang.Class<?>[] wildcardClassArray22 = org.apache.commons.lang3.ClassUtils.wrappersToPrimitives(wildcardClassArray21);
        boolean boolean24 = org.apache.commons.lang3.ClassUtils.isAssignable(wildcardClassArray13, wildcardClassArray22, false);
        java.lang.String str26 = org.apache.commons.lang3.ClassUtils.getShortCanonicalName((java.lang.Object) wildcardClassArray13, "                                A..ayL A.44444444444444444444444444                                 ");
        java.lang.Class<?>[] wildcardClassArray27 = null;
        java.lang.String[] strArray30 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("hi!", "");
        java.lang.String[] strArray32 = org.apache.commons.lang3.StringUtils.stripAll(strArray30, "$");
        java.lang.Class<?>[] wildcardClassArray33 = org.apache.commons.lang3.ClassUtils.toClass((java.lang.Object[]) strArray30);
        java.lang.Class<?>[] wildcardClassArray34 = org.apache.commons.lang3.ClassUtils.toClass((java.lang.Object[]) wildcardClassArray33);
        java.lang.Class<?>[] wildcardClassArray35 = org.apache.commons.lang3.ClassUtils.wrappersToPrimitives(wildcardClassArray34);
        java.lang.Class<?> wildcardClass36 = null;
        java.lang.Class[] classArray38 = new java.lang.Class[1];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray39 = (java.lang.Class<?>[]) classArray38;
        wildcardClassArray39[0] = wildcardClass36;
        java.lang.Class<?>[] wildcardClassArray42 = org.apache.commons.lang3.ClassUtils.primitivesToWrappers(wildcardClassArray39);
        boolean boolean44 = org.apache.commons.lang3.ClassUtils.isAssignable(wildcardClassArray35, wildcardClassArray42, true);
        boolean boolean46 = org.apache.commons.lang3.ClassUtils.isAssignable(wildcardClassArray27, wildcardClassArray35, false);
        java.lang.Class<?> wildcardClass48 = null;
        java.lang.Class[] classArray50 = new java.lang.Class[1];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray51 = (java.lang.Class<?>[]) classArray50;
        wildcardClassArray51[0] = wildcardClass48;
        java.lang.Class<?>[] wildcardClassArray54 = org.apache.commons.lang3.ClassUtils.primitivesToWrappers(wildcardClassArray51);
        java.lang.String str55 = org.apache.commons.lang3.StringUtils.concatWith("javalitu.", (java.lang.Object[]) wildcardClassArray54);
        boolean boolean57 = org.apache.commons.lang3.ClassUtils.isAssignable(wildcardClassArray27, wildcardClassArray54, true);
        boolean boolean58 = org.apache.commons.lang3.ClassUtils.isAssignable(wildcardClassArray13, wildcardClassArray54);
        java.lang.Class<?>[] wildcardClassArray59 = org.apache.commons.lang3.ClassUtils.wrappersToPrimitives(wildcardClassArray13);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertNotNull(wildcardClassArray5);
        org.junit.Assert.assertNotNull(wildcardClassArray6);
        org.junit.Assert.assertNotNull(wildcardClassArray7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(strArray10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "                                   " + "'", str11, "                                   ");
        org.junit.Assert.assertNotNull(wildcardClassArray12);
        org.junit.Assert.assertNotNull(wildcardClassArray13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(strArray17);
        org.junit.Assert.assertNotNull(strArray19);
        org.junit.Assert.assertNotNull(wildcardClassArray20);
        org.junit.Assert.assertNotNull(wildcardClassArray21);
        org.junit.Assert.assertNotNull(wildcardClassArray22);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "Class[]" + "'", str26, "Class[]");
        org.junit.Assert.assertNotNull(strArray30);
        org.junit.Assert.assertNotNull(strArray32);
        org.junit.Assert.assertNotNull(wildcardClassArray33);
        org.junit.Assert.assertNotNull(wildcardClassArray34);
        org.junit.Assert.assertNotNull(wildcardClassArray35);
        org.junit.Assert.assertNotNull(classArray38);
        org.junit.Assert.assertNotNull(wildcardClassArray39);
        org.junit.Assert.assertNotNull(wildcardClassArray42);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertNotNull(classArray50);
        org.junit.Assert.assertNotNull(wildcardClassArray51);
        org.junit.Assert.assertNotNull(wildcardClassArray54);
        org.junit.Assert.assertEquals("'" + str55 + "' != '" + "" + "'", str55, "");
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + false + "'", boolean58 == false);
        org.junit.Assert.assertNotNull(wildcardClassArray59);
    }

    @Test
    public void test39413() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest78.test39413");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.chomp("Javaaaaaaaaaava.langava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.lan");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Javaaaaaaaaaava.langava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.lan" + "'", str1, "Javaaaaaaaaaava.langava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.lan");
    }

    @Test
    public void test39414() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest78.test39414");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.defaultString("                           gnaletyBetyBetyBetyBetyBetyBetyBetyBetyB.etyBetyBetyBetyBetyBetyBetyBetyBetyBavaj                           ", " gnirtS");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                           gnaletyBetyBetyBetyBetyBetyBetyBetyBetyB.etyBetyBetyBetyBetyBetyBetyBetyBetyBavaj                           " + "'", str2, "                           gnaletyBetyBetyBetyBetyBetyBetyBetyBetyB.etyBetyBetyBetyBetyBetyBetyBetyBetyBavaj                           ");
    }

    @Test
    public void test39415() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest78.test39415");
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.overlay("String.", "$         $         $         $         $         $         $         $         $         $         $         $ ...", 97, (int) '#');
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "String.$         $         $         $         $         $         $         $         $         $         $         $ ..." + "'", str4, "String.$         $         $         $         $         $         $         $         $         $         $         $ ...");
    }

    @Test
    public void test39416() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest78.test39416");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBefore("                                                                                                            ", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                                                                                            " + "'", str2, "                                                                                                            ");
    }

    @Test
    public void test39417() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest78.test39417");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphanumeric((java.lang.CharSequence) "...                                            ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test39418() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest78.test39418");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeEnd("ArrayListArrayListArrayListavaj.gnal", "avaj1-");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "ArrayListArrayListArrayListavaj.gnal" + "'", str2, "ArrayListArrayListArrayListavaj.gnal");
    }

    @Test
    public void test39419() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest78.test39419");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.split("AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA", "arraylist", 669);
        java.lang.String[] strArray5 = org.apache.commons.lang3.StringUtils.stripAll(strArray3, "iRFCO.IRFIOSRIIZ");
        java.lang.Class<?>[] wildcardClassArray6 = org.apache.commons.lang3.ClassUtils.toClass((java.lang.Object[]) strArray5);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertNotNull(wildcardClassArray6);
    }

    @Test
    public void test39420() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest78.test39420");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfIgnoreCase("E", "                                                                                                              ");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test39421() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest78.test39421");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.rightPad("", 13);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "             " + "'", str2, "             ");
    }

    @Test
    public void test39422() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest78.test39422");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "IRFCO.IRFIOSRIIZ", "UTILsTRINGUTILsTRING-1JAVA-1");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test39423() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest78.test39423");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.startsWithIgnoreCase("...LANGAVAJ.GNALJAVA.LANGAVAJ.GNALJAVA.LANGAVAJ.GNALJAVA.LANG###########################                                                         ...", "RUVJ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test39424() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest78.test39424");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfDifference((java.lang.CharSequence) "AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA$...$$AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA$...$$AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA$...$$AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA$...$$AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA$...$$AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA$...$$AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA$...$$AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA", (java.lang.CharSequence) "                                                      litulitulitulitulitul####litulitulitulitulitul");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test39425() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest78.test39425");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNotEmpty((java.lang.CharSequence) "RFACE JAVA.LANG.CLONEABLELANG.GNALJAVA.LANGgnaluAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAgnal.avajSSALC.GNALJAVA.LANGgnaluAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAgnal.avajSSALC.GNALJAVA.LANGgnaluAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAgnal.avajSSALC.GNALJAVA.LANGgnaluAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAgnal.avajSSALC.GNALJAVA.LANGgnaluAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAgnal.avajSSALC.GNALJAVA.LANGgnaluAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAgnal.avajSSALC.GN");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test39426() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest78.test39426");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.center("GnalAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA", 950);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                                                                                                                                                                                                                                                                                                                                                                                           GnalAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA                                                                                                                                                                                                                                                                                                                                                                                                            " + "'", str2, "                                                                                                                                                                                                                                                                                                                                                                                                           GnalAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA                                                                                                                                                                                                                                                                                                                                                                                                            ");
    }

    @Test
    public void test39427() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest78.test39427");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("AAAA                       JAVAULANGrrayListAAAA                       JAVAULANGrrayListAAAA                       JAVAULANGrrayListAAAA                       JAVAULANGrrayListAAAA                       JAVAULANGrrayListAAAA                       JAVAULANGrrayListAAAA                       JAVAULANGrrayListAAAA                       JAVAULANGrrayListAAAA                       JAVAULANGrrayListAAAA                       JAVAULANGrrayListAAAA                       JAVAULANGrrayLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLyAAA.", "                                                                                                                                                                                JAVA.LANGAgnal.avajgnal..LANGgnal.avArrclass java.lang.ObjectyListAr...                                                                                                                                                                                ");
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test39428() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest78.test39428");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trimToEmpty("GNL$.$VJ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "GNL$.$VJ" + "'", str1, "GNL$.$VJ");
    }

    @Test
    public void test39429() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest78.test39429");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.reverseDelimited("classjava.lang", ' ');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "classjava.lang" + "'", str2, "classjava.lang");
    }

    @Test
    public void test39430() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest78.test39430");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripToEmpty("javaStrin..........................................................................................");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "javaStrin.........................................................................................." + "'", str1, "javaStrin..........................................................................................");
    }

    @Test
    public void test39431() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest78.test39431");
        char[] charArray7 = new char[] { '#', '4', '$', ' ' };
        int int8 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "$       ", charArray7);
        int int9 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "tsilyrrgnluvj                       tsilyrrgnluvj", charArray7);
        boolean boolean10 = org.apache.commons.lang3.StringUtils.containsAny("INTERFACEJAVA.LANG.CLONEABLESTRINGINTERFACEJAVA", charArray7);
        org.junit.Assert.assertNotNull(charArray7);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray7), "#4$ ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray7), "#4$ ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray7), "[#, 4, $,  ]");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test39432() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest78.test39432");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.chomp("AJaaaaaaaaaaNGA.LAVAJaaaaaaaaaaNGA.LAVAJaaaa                                               ", "     AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "AJaaaaaaaaaaNGA.LAVAJaaaaaaaaaaNGA.LAVAJaaaa                                               " + "'", str2, "AJaaaaaaaaaaNGA.LAVAJaaaaaaaaaaNGA.LAVAJaaaa                                               ");
    }

    @Test
    public void test39433() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest78.test39433");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("hi!", "");
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.stripAll(strArray2, "$");
        java.lang.Class<?>[] wildcardClassArray5 = org.apache.commons.lang3.ClassUtils.toClass((java.lang.Object[]) strArray2);
        java.lang.Class<?>[] wildcardClassArray6 = org.apache.commons.lang3.ClassUtils.toClass((java.lang.Object[]) wildcardClassArray5);
        java.lang.Class<?>[] wildcardClassArray7 = org.apache.commons.lang3.ClassUtils.wrappersToPrimitives(wildcardClassArray6);
        java.lang.Class<?> wildcardClass8 = null;
        java.lang.Class[] classArray10 = new java.lang.Class[1];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray11 = (java.lang.Class<?>[]) classArray10;
        wildcardClassArray11[0] = wildcardClass8;
        java.lang.Class<?>[] wildcardClassArray14 = org.apache.commons.lang3.ClassUtils.primitivesToWrappers(wildcardClassArray11);
        java.lang.Class<?> wildcardClass15 = null;
        java.lang.Class[] classArray17 = new java.lang.Class[1];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray18 = (java.lang.Class<?>[]) classArray17;
        wildcardClassArray18[0] = wildcardClass15;
        java.lang.Class<?>[] wildcardClassArray21 = org.apache.commons.lang3.ClassUtils.primitivesToWrappers(wildcardClassArray18);
        java.lang.String[] strArray23 = new java.lang.String[] { "                                   " };
        java.lang.String str24 = org.apache.commons.lang3.StringUtils.getCommonPrefix(strArray23);
        java.lang.Class<?>[] wildcardClassArray25 = org.apache.commons.lang3.ClassUtils.toClass((java.lang.Object[]) strArray23);
        java.lang.Class<?> wildcardClass26 = null;
        java.lang.Class[] classArray28 = new java.lang.Class[1];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray29 = (java.lang.Class<?>[]) classArray28;
        wildcardClassArray29[0] = wildcardClass26;
        java.lang.Class<?>[] wildcardClassArray32 = org.apache.commons.lang3.ClassUtils.primitivesToWrappers(wildcardClassArray29);
        boolean boolean33 = org.apache.commons.lang3.ClassUtils.isAssignable(wildcardClassArray25, wildcardClassArray29);
        boolean boolean35 = org.apache.commons.lang3.ClassUtils.isAssignable(wildcardClassArray18, wildcardClassArray29, true);
        boolean boolean37 = org.apache.commons.lang3.ClassUtils.isAssignable(wildcardClassArray14, wildcardClassArray29, true);
        java.lang.String str39 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) wildcardClassArray29, 'a');
        boolean boolean41 = org.apache.commons.lang3.ClassUtils.isAssignable(wildcardClassArray7, wildcardClassArray29, true);
        java.lang.Class<?>[] wildcardClassArray42 = org.apache.commons.lang3.ClassUtils.toClass((java.lang.Object[]) wildcardClassArray29);
        java.lang.String str43 = org.apache.commons.lang3.StringUtils.concat((java.lang.Object[]) wildcardClassArray29);
        java.lang.String str45 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) wildcardClassArray29, '4');
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertNotNull(wildcardClassArray5);
        org.junit.Assert.assertNotNull(wildcardClassArray6);
        org.junit.Assert.assertNotNull(wildcardClassArray7);
        org.junit.Assert.assertNotNull(classArray10);
        org.junit.Assert.assertNotNull(wildcardClassArray11);
        org.junit.Assert.assertNotNull(wildcardClassArray14);
        org.junit.Assert.assertNotNull(classArray17);
        org.junit.Assert.assertNotNull(wildcardClassArray18);
        org.junit.Assert.assertNotNull(wildcardClassArray21);
        org.junit.Assert.assertNotNull(strArray23);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "                                   " + "'", str24, "                                   ");
        org.junit.Assert.assertNotNull(wildcardClassArray25);
        org.junit.Assert.assertNotNull(classArray28);
        org.junit.Assert.assertNotNull(wildcardClassArray29);
        org.junit.Assert.assertNotNull(wildcardClassArray32);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "" + "'", str39, "");
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertNotNull(wildcardClassArray42);
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "" + "'", str43, "");
        org.junit.Assert.assertEquals("'" + str45 + "' != '" + "" + "'", str45, "");
    }

    @Test
    public void test39434() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest78.test39434");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substring("..............................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................lass...                                       ", 386);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "............................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................lass...                                       " + "'", str2, "............................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................lass...                                       ");
    }

    @Test
    public void test39435() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest78.test39435");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAllLowerCase((java.lang.CharSequence) "SILYARRA!IH$$$$$$$$");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test39436() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest78.test39436");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("java.util", "slitUgnirtS");
        boolean boolean4 = org.apache.commons.lang3.StringUtils.startsWithAny("slitUgnirtS", strArray3);
        java.lang.String[] strArray5 = org.apache.commons.lang3.StringUtils.stripAll(strArray3);
        java.lang.Class<?> wildcardClass6 = strArray5.getClass();
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test39437() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest78.test39437");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.reverseDelimited("j.v.tsily.rr.tsily.rr.tsily.rr", 'a');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "j.v.tsily.rr.tsily.rr.tsily.rr" + "'", str2, "j.v.tsily.rr.tsily.rr.tsily.rr");
    }

    @Test
    public void test39438() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest78.test39438");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.deleteWhitespace("      GNALUAVAJ                       GNALUAVAJ                       SSALCGNALAVAJavajlitu");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "GNALUAVAJGNALUAVAJSSALCGNALAVAJavajlitu" + "'", str1, "GNALUAVAJGNALUAVAJSSALCGNALAVAJavajlitu");
    }

    @Test
    public void test39439() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest78.test39439");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("aa..", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa...stgnal.aL.ArrayList...aL.ArrayListgnal.aL.aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", 188);
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void test39440() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest78.test39440");
        char[] charArray1 = null;
        int int2 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "sTRINGuTILSsTRINGuTILSsTRINGuTILSsTRINGuTILSsTRINGuTILSsTRINGuTILSsTRINGuTILSsTRINGuTILSsTRINGuTILSsTRINGuTILS", charArray1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test39441() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest78.test39441");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.upperCase("...a");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "...A" + "'", str1, "...A");
    }

    @Test
    public void test39442() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest78.test39442");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.startsWithIgnoreCase("ILyarrAtsiLyarrAtsiLyarrAlang.javatsiLyarrAtsiLyarrAtsiAAAAAAAAAAngag", "aenolc.gnaelbagaga.langagaga.langagaga.langagaga.langagaga.langagaga.langagaga.langagaga.langagaga.langagaga.langagaga.langagaga.langagaga.langagaga.langagaga.langagaga.langagaga.langagaga.langagaga.langagaga.langagaga.langagaga.langagaga.langagaga.langagaga.langagaga.langagaga.langagaga.langagaga.langagaga.langagaga.langagaga.langagaga.langagaga.langagaga.langafretnigniragecagaoi.");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test39443() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest78.test39443");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trim("##########################################################################################################################################################################################################################JAVA.LANG$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$                                                                                                                                                                                                                                                                                                                                                                                                                                                                 ##########################################################################################################################################################################################################################");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "##########################################################################################################################################################################################################################JAVA.LANG$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$                                                                                                                                                                                                                                                                                                                                                                                                                                                                 ##########################################################################################################################################################################################################################" + "'", str1, "##########################################################################################################################################################################################################################JAVA.LANG$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$                                                                                                                                                                                                                                                                                                                                                                                                                                                                 ##########################################################################################################################################################################################################################");
    }

    @Test
    public void test39444() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest78.test39444");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripAccents((java.lang.CharSequence) "Va.langGNAL..la...");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Va.langGNAL..la..." + "'", str1, "Va.langGNAL..la...");
    }

    @Test
    public void test39445() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest78.test39445");
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
        java.lang.Class<?>[] wildcardClassArray22 = org.apache.commons.lang3.ClassUtils.wrappersToPrimitives(wildcardClassArray3);
        java.lang.Class[] classArray24 = new java.lang.Class[0];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray25 = (java.lang.Class<?>[]) classArray24;
        java.lang.Class<?>[] wildcardClassArray26 = org.apache.commons.lang3.ClassUtils.primitivesToWrappers(wildcardClassArray25);
        java.lang.Class<?> wildcardClass27 = null;
        java.lang.Class[] classArray29 = new java.lang.Class[1];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray30 = (java.lang.Class<?>[]) classArray29;
        wildcardClassArray30[0] = wildcardClass27;
        java.lang.Class<?>[] wildcardClassArray33 = org.apache.commons.lang3.ClassUtils.primitivesToWrappers(wildcardClassArray30);
        boolean boolean35 = org.apache.commons.lang3.ClassUtils.isAssignable(wildcardClassArray25, wildcardClassArray30, true);
        java.lang.Class[] classArray37 = new java.lang.Class[0];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray38 = (java.lang.Class<?>[]) classArray37;
        java.lang.Class<?>[] wildcardClassArray39 = org.apache.commons.lang3.ClassUtils.primitivesToWrappers(wildcardClassArray38);
        java.lang.String str41 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) wildcardClassArray39, "...                                 ");
        boolean boolean42 = org.apache.commons.lang3.ClassUtils.isAssignable(wildcardClassArray30, wildcardClassArray39);
        java.lang.Class<?>[] wildcardClassArray43 = org.apache.commons.lang3.ClassUtils.primitivesToWrappers(wildcardClassArray39);
        java.lang.Class<?>[] wildcardClassArray44 = org.apache.commons.lang3.ClassUtils.primitivesToWrappers(wildcardClassArray43);
        java.lang.Class<?>[] wildcardClassArray45 = org.apache.commons.lang3.ClassUtils.wrappersToPrimitives(wildcardClassArray43);
        boolean boolean47 = org.apache.commons.lang3.ClassUtils.isAssignable(wildcardClassArray22, wildcardClassArray45, true);
        java.lang.Class<?>[] wildcardClassArray48 = org.apache.commons.lang3.ClassUtils.toClass((java.lang.Object[]) wildcardClassArray45);
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
        org.junit.Assert.assertNotNull(wildcardClassArray22);
        org.junit.Assert.assertNotNull(classArray24);
        org.junit.Assert.assertNotNull(wildcardClassArray25);
        org.junit.Assert.assertNotNull(wildcardClassArray26);
        org.junit.Assert.assertNotNull(classArray29);
        org.junit.Assert.assertNotNull(wildcardClassArray30);
        org.junit.Assert.assertNotNull(wildcardClassArray33);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertNotNull(classArray37);
        org.junit.Assert.assertNotNull(wildcardClassArray38);
        org.junit.Assert.assertNotNull(wildcardClassArray39);
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "" + "'", str41, "");
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertNotNull(wildcardClassArray43);
        org.junit.Assert.assertNotNull(wildcardClassArray44);
        org.junit.Assert.assertNotNull(wildcardClassArray45);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertNotNull(wildcardClassArray48);
    }

    @Test
    public void test39446() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest78.test39446");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.contains("VA.LANGAVAJ.GNALJAVA.LANGAVAJ.GNALJAVA.LANGAVAJ.GNALJAVA.LANGAVAJ.GNALJAVA.LANGAVAJ.GNALJAVA", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa][ssalC");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test39447() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest78.test39447");
        int int3 = org.apache.commons.lang3.StringUtils.indexOf("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa#############################################################...", 822, 484);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test39448() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest78.test39448");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.defaultIfBlank("elbazilaireS.oi.avaj ecafretniav...", "ELBAZILAIREs.OI.AVAJ ECAFRETNIAVAJ..........AVAJ..........AVAJ..........AVAJ..........AVAJ..........AVAJ..........AVAJ..........AVAJ..........AVAJ..........AVAJ..........AVAJ..........AVAJ..........AVAJ..........AVAJ..........AVAJ..........AVAJ..........AVAJ..........AVAJ..........AVAJ..........AVAJ..........AVAJ..........AVAJ..........AVAJ..........AVAJ..........AVAJ..........AVAJ..........AVAJ..........AVAJ..........AVAJ..........AVAJ..........AVAJ..........AVAJ..........AVAJ..........AVAJ..........AVAJ.......ELBAENOLc.GNAL.AVAJ ECAFRETNI");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "elbazilaireS.oi.avaj ecafretniav..." + "'", str2, "elbazilaireS.oi.avaj ecafretniav...");
    }

    @Test
    public void test39449() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest78.test39449");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass2 = org.apache.commons.lang3.ClassUtils.getClass("javatsilyarratsilyarratsilyarra", true);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassNotFoundException; message: javatsilyarratsilyarratsilyarra");
        } catch (java.lang.ClassNotFoundException e) {
            // Expected exception.
        }
    }

    @Test
    public void test39450() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest78.test39450");
        java.lang.Class[] classArray2 = new java.lang.Class[0];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray3 = (java.lang.Class<?>[]) classArray2;
        java.lang.Class<?>[] wildcardClassArray4 = org.apache.commons.lang3.ClassUtils.primitivesToWrappers(wildcardClassArray3);
        java.lang.String str6 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) wildcardClassArray4, "...                                 ");
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
        java.lang.String str39 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) wildcardClassArray27, '#', (int) ' ', 10);
        java.lang.Class<?>[] wildcardClassArray40 = org.apache.commons.lang3.ClassUtils.primitivesToWrappers(wildcardClassArray27);
        java.lang.Class<?> wildcardClass41 = null;
        java.lang.Class[] classArray43 = new java.lang.Class[1];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray44 = (java.lang.Class<?>[]) classArray43;
        wildcardClassArray44[0] = wildcardClass41;
        java.lang.Class<?>[] wildcardClassArray47 = org.apache.commons.lang3.ClassUtils.primitivesToWrappers(wildcardClassArray44);
        java.lang.Class<?> wildcardClass48 = null;
        java.lang.Class[] classArray50 = new java.lang.Class[1];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray51 = (java.lang.Class<?>[]) classArray50;
        wildcardClassArray51[0] = wildcardClass48;
        java.lang.Class<?>[] wildcardClassArray54 = org.apache.commons.lang3.ClassUtils.primitivesToWrappers(wildcardClassArray51);
        java.lang.String[] strArray56 = new java.lang.String[] { "                                   " };
        java.lang.String str57 = org.apache.commons.lang3.StringUtils.getCommonPrefix(strArray56);
        java.lang.Class<?>[] wildcardClassArray58 = org.apache.commons.lang3.ClassUtils.toClass((java.lang.Object[]) strArray56);
        java.lang.Class<?> wildcardClass59 = null;
        java.lang.Class[] classArray61 = new java.lang.Class[1];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray62 = (java.lang.Class<?>[]) classArray61;
        wildcardClassArray62[0] = wildcardClass59;
        java.lang.Class<?>[] wildcardClassArray65 = org.apache.commons.lang3.ClassUtils.primitivesToWrappers(wildcardClassArray62);
        boolean boolean66 = org.apache.commons.lang3.ClassUtils.isAssignable(wildcardClassArray58, wildcardClassArray62);
        boolean boolean68 = org.apache.commons.lang3.ClassUtils.isAssignable(wildcardClassArray51, wildcardClassArray62, true);
        boolean boolean70 = org.apache.commons.lang3.ClassUtils.isAssignable(wildcardClassArray47, wildcardClassArray62, true);
        boolean boolean72 = org.apache.commons.lang3.ClassUtils.isAssignable(wildcardClassArray40, wildcardClassArray47, true);
        boolean boolean74 = org.apache.commons.lang3.ClassUtils.isAssignable(wildcardClassArray4, wildcardClassArray47, false);
        java.lang.Class[] classArray76 = new java.lang.Class[0];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray77 = (java.lang.Class<?>[]) classArray76;
        java.lang.Class<?>[] wildcardClassArray78 = org.apache.commons.lang3.ClassUtils.primitivesToWrappers(wildcardClassArray77);
        java.lang.Class<?> wildcardClass79 = null;
        java.lang.Class[] classArray81 = new java.lang.Class[1];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray82 = (java.lang.Class<?>[]) classArray81;
        wildcardClassArray82[0] = wildcardClass79;
        java.lang.Class<?>[] wildcardClassArray85 = org.apache.commons.lang3.ClassUtils.primitivesToWrappers(wildcardClassArray82);
        boolean boolean87 = org.apache.commons.lang3.ClassUtils.isAssignable(wildcardClassArray77, wildcardClassArray82, true);
        boolean boolean89 = org.apache.commons.lang3.ClassUtils.isAssignable(wildcardClassArray47, wildcardClassArray82, true);
        java.lang.String str90 = org.apache.commons.lang3.StringUtils.concatWith("ssal$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$rrayList$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$C", (java.lang.Object[]) wildcardClassArray82);
        java.lang.String str94 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) wildcardClassArray82, "Java.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjavaJava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjavaJava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjavaJava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjavaJava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjavaJava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjavaJava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjavaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", 472, 57);
        org.junit.Assert.assertNotNull(classArray2);
        org.junit.Assert.assertNotNull(wildcardClassArray3);
        org.junit.Assert.assertNotNull(wildcardClassArray4);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
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
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "" + "'", str39, "");
        org.junit.Assert.assertNotNull(wildcardClassArray40);
        org.junit.Assert.assertNotNull(classArray43);
        org.junit.Assert.assertNotNull(wildcardClassArray44);
        org.junit.Assert.assertNotNull(wildcardClassArray47);
        org.junit.Assert.assertNotNull(classArray50);
        org.junit.Assert.assertNotNull(wildcardClassArray51);
        org.junit.Assert.assertNotNull(wildcardClassArray54);
        org.junit.Assert.assertNotNull(strArray56);
        org.junit.Assert.assertEquals("'" + str57 + "' != '" + "                                   " + "'", str57, "                                   ");
        org.junit.Assert.assertNotNull(wildcardClassArray58);
        org.junit.Assert.assertNotNull(classArray61);
        org.junit.Assert.assertNotNull(wildcardClassArray62);
        org.junit.Assert.assertNotNull(wildcardClassArray65);
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + false + "'", boolean66 == false);
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + false + "'", boolean68 == false);
        org.junit.Assert.assertTrue("'" + boolean70 + "' != '" + false + "'", boolean70 == false);
        org.junit.Assert.assertTrue("'" + boolean72 + "' != '" + false + "'", boolean72 == false);
        org.junit.Assert.assertTrue("'" + boolean74 + "' != '" + false + "'", boolean74 == false);
        org.junit.Assert.assertNotNull(classArray76);
        org.junit.Assert.assertNotNull(wildcardClassArray77);
        org.junit.Assert.assertNotNull(wildcardClassArray78);
        org.junit.Assert.assertNotNull(classArray81);
        org.junit.Assert.assertNotNull(wildcardClassArray82);
        org.junit.Assert.assertNotNull(wildcardClassArray85);
        org.junit.Assert.assertTrue("'" + boolean87 + "' != '" + false + "'", boolean87 == false);
        org.junit.Assert.assertTrue("'" + boolean89 + "' != '" + false + "'", boolean89 == false);
        org.junit.Assert.assertEquals("'" + str90 + "' != '" + "" + "'", str90, "");
        org.junit.Assert.assertEquals("'" + str94 + "' != '" + "" + "'", str94, "");
    }

    @Test
    public void test39451() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest78.test39451");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("AAAAAAAAAAAAAAAAAAAgnaluavajAAAAAAAAAAAAAAAAAAA", "lan         ", 871);
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void test39452() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest78.test39452");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNumericSpace((java.lang.CharSequence) "IOINTERFACEJAVAIN");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test39453() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest78.test39453");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isWhitespace((java.lang.CharSequence) "AAAAAAAAAAngalavajAAAAAAAAAAngalavajAAAAAAAAAAngalavajAAAAAAAAAAngalavajAAAAAAAAAAngalavajAAAAAAAAAAngalavajAAAAAAAAAAngalavajAAAAAAAAAAngalavajAAAAAAAAAAngalavajAAAAAAAAAAngalavajAAAAAAAAAAngalavajAAAAAAAAAAngalavajAAAAAAAAAAngalavajAAAAAAAAAAngalavajAAAAAAAAAAngalavajAAAAAAAAAAngalavajAAAAAAAAAAngalavajAAAAAAAAAAngalavajAAAAAAAAAAngalavajAAAAAAAAAAngalavajAAAAAAAAAAngalavajAAAAAAAAAAngalavajAAAAAAAAAAngalavajAAAAAAAAAAngalavajAAAAAAAAAAngalavajAAAAAAAAAAngalavajAAAAAAAAAAngalavajAAAAAAAAAAngalavajAAAAAAAAAAngalavajAAAAAAAAAAngalavajAAAAAAAAAAngalavajAAAAAAAAAAngalavajAAAAAAAAAAngalavajAAAAAAAAAAngalavajAAAAAAAAAAngalavajAAAAAAAAAA][gnirtSlitu.avaj1-][gnirtSlitu.avaj1-                                                                                   ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test39454() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest78.test39454");
        int int3 = org.apache.commons.lang3.StringUtils.indexOfIgnoreCase("interface#java.lang.Cloneable4interface#java.io.Serializable", "RUVJ", 409);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test39455() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest78.test39455");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.split("4444444444444JAVASTRINGSLITUGNIRTSARRAYLISTARRAYLISTAVAJ.GNALARRAYLISTARRAYLISTARRAYLI44444444444444", "                                    iLyarrAtsiLyarrAtsiLyarrAlang.javatsiLyarrAtsiLyarrAtsiLyarrA");
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test39456() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest78.test39456");
        java.lang.String str1 = org.apache.commons.lang3.ClassUtils.getPackageName("                                                                                                                                                  4444444");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
    }

    @Test
    public void test39457() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest78.test39457");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("LANG.GNALJAVA.LANGAVAJ.GNALJAVA.LANGAVAJ.GNALJAVA.LANGAVAJ.GNALJAVA.LANGAVAJ.GNALJAVA.LANGAVAJ.GNALJAVA.LANGAVAJ.GNALJAVA.LANGAVAJ.GNALJAVA.LANGAVAJ.JAVA                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                  ", "");
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test39458() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest78.test39458");
        int int2 = org.apache.commons.lang3.StringUtils.indexOf("I.......                                                                                                                                                  ...", "...############################...###########################$$$$$$$$$$$$$$$$$$$..$                                                                 AtsiLytcejbOlvjsslcrrAtsiLytcejbO.gnal.avaj ssalcrrAva.langGNAL..langjava.langAGNAL.AVAJ$$$$$$$$$$$$$$$$$$$..$$...############################...############################");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test39459() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest78.test39459");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("hi!ArrayListArrayListArrayListavaj.... AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA... AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA... AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA... AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA... AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA... AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA... AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA... AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA... AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA... ", "$$$$$$$$$$$$$$$$$$$$$$$$$$$$$...                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                               ");
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test39460() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest78.test39460");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.left("...aaaaaaaaj v aaaaaaaaaaj v aaaaaaaaaaj v interf ceaj v aioaSeri liz ble", 199);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "...aaaaaaaaj v aaaaaaaaaaj v aaaaaaaaaaj v interf ceaj v aioaSeri liz ble" + "'", str2, "...aaaaaaaaj v aaaaaaaaaaj v aaaaaaaaaaj v interf ceaj v aioaSeri liz ble");
    }

    @Test
    public void test39461() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest78.test39461");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.substringBetween("interface java.lang.CloneableINTERFACE JAVA.LANG.CLONEABLELANG.GNALJAVA.LANGAVAJ.GNALJAVA.LANGAVAJ.GNALJAVA.LANGAVAJ.GNALJAVA.LANGAVAJ.GNALJAVA.LANGAVAJ.GNALJAVA.LANGAVAJ.GNALJAVA.LANGAVAJ.GNALJAVA.LANGAVAJ.JAVAINTERFACE JAVA.IO.SERIALIZABLEinterface java.io.Serializableinterface java.lang.CloneableINTERFACE JAVA.LANG.CLONEABLELANG.GNALJAVA.LANGAVAJ.GNALJAVA.LANGAVAinterface java.lang.CloneableStringinterface java.iointerface java.lang.CloneableINTERFACE JAVA.LANG.CLONEABLELANG.GNALJAVA.LANGAVAJ.GNALJAVA.LANGAVAJ.GNALJAVA.LANGAVAJ.GNALJAVA.LANGAVAJ.GNALJAVA.LANGAVAJ.GNALJAVA.LANGAVAJ.GNALJAVA.LANGAVAJ.GNALJAVA.LANGAVAJ.JAVAINTERFACE JAVA.IO.SERIALIZABLEinterface java.io.Serializableinterface java.lang.CloneableINTERFACE JAVA.LANG.CLONEABLELANG.GNALJAVA.LANGAVAJ.GNALJAVA.LANGAVA", "class java.lang.Class                       JAVAULANG                       JAVAULANG                       JAVAULANG                       JAVAULANG                       JAVAULANG                       JAVAULANG                       JAVAULANG                       JAVAULANG                       JAVAULANG                       JAVAULANG                       JAVAULANG                       JAVAULANG                       JAVAULANG                       JAVAULANG                       JAVAULANG                       JAVAULANG                       JAVAULANG                       JAVAULANG                       JAVAULANG                       JAVAULANG", "arraylistarraylistarraylistarraylistarraylistarraylistarraylistarraylistarraylistarraylistarraylistarraylistarraylistarraylistarraylistarraylistarraylistarraylistarraylistarraylistarraylistarraylistarraylistarraylistarraylistarraylistarraylistarraylistarraylistarraylistarraylistarraylistarraylistarraylistarraylistarraylistarraylistarraylistarraylist4444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444");
        org.junit.Assert.assertNull(str3);
    }

    @Test
    public void test39462() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest78.test39462");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitByCharacterTypeCamelCase("...       OI.AVAJECAFRETNI#ELBAENOLc.GNAL.AVAJECAFRETNIsTRINGuTILSsTRINGuTILSsTRINGuTILSsTRINGuTILSsTRINGuTILSsTRINGuTILSsTRINGuTILSsTRINGuTILSsTRINGuTILSsTRINGuTILS                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                         ");
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test39463() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest78.test39463");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.right("G", (int) '$');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "G" + "'", str2, "G");
    }

    @Test
    public void test39464() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest78.test39464");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trimToEmpty("interface java.lang.CloneableAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA       AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA       AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA       AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA       AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA       AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA       interface java.io.Serializable");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "interface java.lang.CloneableAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA       AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA       AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA       AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA       AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA       AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA       interface java.io.Serializable" + "'", str1, "interface java.lang.CloneableAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA       AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA       AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA       AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA       AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA       AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA       interface java.io.Serializable");
    }

    @Test
    public void test39465() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest78.test39465");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("BOOLEAN", "L.Arr yList");
        java.lang.String[] strArray5 = org.apache.commons.lang3.StringUtils.stripAll(strArray3, "gnalarraylistarraylistarrayli");
        java.lang.String[] strArray7 = org.apache.commons.lang3.StringUtils.stripAll(strArray5, "...      ");
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.concatWith("NTERFACEJAVA.LANG.cLONEABLE.......JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVAINTERFACEJAVA.IO.sERIALIZABLE", (java.lang.Object[]) strArray7);
        java.lang.String str9 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray7);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "BOOLEAN" + "'", str8, "BOOLEAN");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "BOOLEAN" + "'", str9, "BOOLEAN");
    }

    @Test
    public void test39466() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest78.test39466");
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("g.g.g.g.g.g.g.g.g.g.g.g.g.g.g.g.g.g.g.g.g.g.g.g.g.g.g.g.g.g.g.g.g.g.g.g.g.g.g.", "liza.io.Seriavace jable4interfang.Clonea.lavaJ", 669);
        boolean boolean5 = org.apache.commons.lang3.StringUtils.startsWithAny("a..AYL A.44444444444444444444444444a..AYL A.44444444444444444444444444a..AYL A.44444444444444444444444444a..AYL A.44444444444444444444444444a..AYL A.44444444444444444444444444a..AYL A.44444444444444444444444444a..AYL A.44444444444444444444444444a..AYL A.44444444444444444444444444a..                                                                       javaStrin                                                                       a..AYL A.44444444444444444444444444a..AYL A.44444444444444444444444444a..AYL A.44444444444444444444444444a..AYL A.44444444444444444444444444a..AYL A.44444444444444444444444444a..AYL A.44444444444444444444444444a..AYL A.44444444444444444444444444a..AYL A.44444444444444444444444444a..", strArray4);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test39467() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest78.test39467");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeEndIgnoreCase("j.v...........j.v...........j.v.......", "       .");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "j.v...........j.v...........j.v......." + "'", str2, "j.v...........j.v...........j.v.......");
    }

    @Test
    public void test39468() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest78.test39468");
        int int1 = org.apache.commons.lang3.StringUtils.length((java.lang.CharSequence) "AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAArrayListAArrayListAArrayListAArrayListAArrayListAArrayListAArrayListAArrayListAArrayListAArrayListAArrayListAArrayListAArrayListAArrayListAArrayListAArrayListAArrayListAArrayListAArrayListAArrayListAArrayListAArrayListAArrayListAArrayListAArrayListAArrayListAArrayListAArrayListAArrayListAArrayListAArrayListAArrayListAArrayListAArrayListAArrayListAArrayList");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 545 + "'", int1 == 545);
    }

    @Test
    public void test39469() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest78.test39469");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripAccents((java.lang.CharSequence) "ssalcrrA tsiLytcejbO.gnal.avaj");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "ssalcrrA tsiLytcejbO.gnal.avaj" + "'", str1, "ssalcrrA tsiLytcejbO.gnal.avaj");
    }

    @Test
    public void test39470() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest78.test39470");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.uncapitalize((java.lang.CharSequence) "clss jv.lng.Stringclss jv.lng.Stringclss jv.lng.Stringclss jv.lng.Stringclss jv.lng.Stringclss jv.lng.Stringclss jv.lng.Stringclss jv.lng.Stringclss jv.lng.Stringclss jv.lng.Stringclss jv.lng.Stringclss jv.lng.Stringclss jv.lng.Stringclss jv.lng.Stringclss jv.lng.Stringclss jv.lng.Stringclss jv.lng.Stringclss jv.lng.Stringclss jv.lng.Stringclss jv.lng.Stringclss jv.lng.Stringclss jv.lng.Stringclss jv.lng.Stringclss jv.lng.Stringclss jv.lng.Stclss jv.lng.Stringclss jv.lng.Stringclss jv.lng.Stringclss jv.lng.Stringclss jv.lng.Stringclss jv.lng.Stringclss jv.lng.Stringclss jv.lng.Stringclss jv.lng.Stringclss jv.lng.Stringclss jv.lng.Stringclss jv.lng.Stringclss jv.lng.Stringclss jv.lng.Stringclss jv.lng.Stringclss jv.lng.Stringclss jv.lng.Stringclss jv.lng.Stringclss jv.lng.Stringclss jv.lng.Stringclss jv.lng.Stringclss jv.lng.Stringclss jv.lng.Stringclss jv.lng.Stringclss jv.lng.Str");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "clss jv.lng.Stringclss jv.lng.Stringclss jv.lng.Stringclss jv.lng.Stringclss jv.lng.Stringclss jv.lng.Stringclss jv.lng.Stringclss jv.lng.Stringclss jv.lng.Stringclss jv.lng.Stringclss jv.lng.Stringclss jv.lng.Stringclss jv.lng.Stringclss jv.lng.Stringclss jv.lng.Stringclss jv.lng.Stringclss jv.lng.Stringclss jv.lng.Stringclss jv.lng.Stringclss jv.lng.Stringclss jv.lng.Stringclss jv.lng.Stringclss jv.lng.Stringclss jv.lng.Stringclss jv.lng.Stclss jv.lng.Stringclss jv.lng.Stringclss jv.lng.Stringclss jv.lng.Stringclss jv.lng.Stringclss jv.lng.Stringclss jv.lng.Stringclss jv.lng.Stringclss jv.lng.Stringclss jv.lng.Stringclss jv.lng.Stringclss jv.lng.Stringclss jv.lng.Stringclss jv.lng.Stringclss jv.lng.Stringclss jv.lng.Stringclss jv.lng.Stringclss jv.lng.Stringclss jv.lng.Stringclss jv.lng.Stringclss jv.lng.Stringclss jv.lng.Stringclss jv.lng.Stringclss jv.lng.Stringclss jv.lng.Str" + "'", str1, "clss jv.lng.Stringclss jv.lng.Stringclss jv.lng.Stringclss jv.lng.Stringclss jv.lng.Stringclss jv.lng.Stringclss jv.lng.Stringclss jv.lng.Stringclss jv.lng.Stringclss jv.lng.Stringclss jv.lng.Stringclss jv.lng.Stringclss jv.lng.Stringclss jv.lng.Stringclss jv.lng.Stringclss jv.lng.Stringclss jv.lng.Stringclss jv.lng.Stringclss jv.lng.Stringclss jv.lng.Stringclss jv.lng.Stringclss jv.lng.Stringclss jv.lng.Stringclss jv.lng.Stringclss jv.lng.Stclss jv.lng.Stringclss jv.lng.Stringclss jv.lng.Stringclss jv.lng.Stringclss jv.lng.Stringclss jv.lng.Stringclss jv.lng.Stringclss jv.lng.Stringclss jv.lng.Stringclss jv.lng.Stringclss jv.lng.Stringclss jv.lng.Stringclss jv.lng.Stringclss jv.lng.Stringclss jv.lng.Stringclss jv.lng.Stringclss jv.lng.Stringclss jv.lng.Stringclss jv.lng.Stringclss jv.lng.Stringclss jv.lng.Stringclss jv.lng.Stringclss jv.lng.Stringclss jv.lng.Stringclss jv.lng.Str");
    }

    @Test
    public void test39471() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest78.test39471");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceChars("ArrGNALyLis", "AAAAAAAAAAjaval.agn$$$$$$$$$$$$$$$$$$$..l.agnAAAAAAAAAAring$$$$$$$$$$$$$", "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                           class java.util.AbstractList$class java.util.AbstractCollection$class java.lang.Object");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "   GN LyL s" + "'", str3, "   GN LyL s");
    }

    @Test
    public void test39472() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest78.test39472");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.split("ITU.AVAj                                                                                                                                                                                                                                                                                                                                                                                                                 ", '#');
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test39473() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest78.test39473");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "...l.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAA...A..AYLA.44444444444444444444444444A..AYLA.444444444", "-1String[]");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 6 + "'", int2 == 6);
    }

    @Test
    public void test39474() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest78.test39474");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.startsWith("                                    ######################                                                                                                            ... ... ... ... ... ... ... ... ... ... ", "44444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444Chaace");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test39475() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest78.test39475");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.upperCase("                  ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "                  " + "'", str1, "                  ");
    }

    @Test
    public void test39476() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest78.test39476");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.strip("...       ....       .");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "...       ....       ." + "'", str1, "...       ....       .");
    }

    @Test
    public void test39477() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest78.test39477");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.defaultString("                                                                                                     JAVAGNAL");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "                                                                                                     JAVAGNAL" + "'", str1, "                                                                                                     JAVAGNAL");
    }

    @Test
    public void test39478() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest78.test39478");
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("$       ", "class java.lang.String", 35);
        int int5 = org.apache.commons.lang3.StringUtils.lastIndexOfAny("javal.agn", strArray4);
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray4, '$');
        java.lang.String str9 = org.apache.commons.lang3.ClassUtils.getShortCanonicalName((java.lang.Object) str7, "                                  aa");
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 9 + "'", int5 == 9);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "$$$$$$$$" + "'", str7, "$$$$$$$$");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "String" + "'", str9, "String");
    }

    @Test
    public void test39479() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest78.test39479");
        int int1 = org.apache.commons.lang3.StringUtils.length((java.lang.CharSequence) "                       JAVAULANGrrayList                                                                                                                                                                                            ");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 228 + "'", int1 == 228);
    }

    @Test
    public void test39480() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest78.test39480");
        java.lang.String[] strArray3 = new java.lang.String[] { "                                   " };
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.getCommonPrefix(strArray3);
        java.lang.Class<?>[] wildcardClassArray5 = org.apache.commons.lang3.ClassUtils.toClass((java.lang.Object[]) strArray3);
        java.lang.String[] strArray8 = new java.lang.String[] { "                                   " };
        java.lang.String str9 = org.apache.commons.lang3.StringUtils.getCommonPrefix(strArray8);
        int int10 = org.apache.commons.lang3.StringUtils.indexOfDifference((java.lang.CharSequence[]) strArray8);
        int int11 = org.apache.commons.lang3.StringUtils.lastIndexOfAny("...       ", strArray8);
        java.lang.String str12 = org.apache.commons.lang3.StringUtils.replaceEach("...       AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA", strArray3, strArray8);
        java.lang.String[] strArray13 = org.apache.commons.lang3.StringUtils.stripAll(strArray8);
        java.lang.String[] strArray16 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("Class", "$######################################################################");
        java.lang.String str17 = org.apache.commons.lang3.StringUtils.replaceEachRepeatedly("4444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444AAAAAAAAAA", strArray8, strArray16);
        java.lang.String[] strArray18 = org.apache.commons.lang3.StringUtils.stripAll(strArray8);
        java.lang.String str20 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray18, 'a');
        java.lang.String[] strArray22 = org.apache.commons.lang3.StringUtils.stripAll(strArray18, "interfacegaga.lang.CloneableAAAAAAAAAAgagal.agnAAAAAAAAAAgagal.agnAAAAAAAAAAgagal.agnAAAAAAAAAAgagal.agnAAAAAAAAAAgagal.agnAAAAAAAAAAgagal.agnAAAAAAAAAAgagal.agnAAAAAAAAAAgagal.agnAAAAAAAAAAgagal.agnAAAAAAAAAAgagal.agnAAAAAAAAAAgagal.agnAAAAAAAAAAgagal.agnAAAAAAAAAAgagal.agnAAAAAAAAAAgagal.agnAAAAAAAAAAgagal.agnAAAAAAAAAAgagal.agnAAAAAAAAAAgagal.agnAAAAAAAAAAgagal.agnAAAAAAAAAAgagal.agnAAAAAAAAAAgagal.agnAAAAAAAAAAgagal.agnAAAAAAAAAAgagal.agnAAAAAAAAAAgagal.agnAAAAAAAAAAgagal.agnAAAAAAAAAAgagal.agnAAAAAAAAAAgagal.agnAAAAAAAAAAgagal.agnAAAAAAAAAAgagal.agnAAAAAAAAAAgagal.agnAAAAAAAAAAgagal.agnAAAAAAAAAAgagal.agnAAAAAAAAAAgagal.agnAAAAAAAAAAgagal.agnAAAAAAAAAAgagal.agnAAAAAAAAAAgagal.agnAAAAAAAAAAringinterfacegaga.io.Serializable");
        java.lang.String str23 = org.apache.commons.lang3.StringUtils.concat((java.lang.Object[]) strArray18);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "                                   " + "'", str4, "                                   ");
        org.junit.Assert.assertNotNull(wildcardClassArray5);
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "                                   " + "'", str9, "                                   ");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "...       AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA" + "'", str12, "...       AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA");
        org.junit.Assert.assertNotNull(strArray13);
        org.junit.Assert.assertNotNull(strArray16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "4444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444AAAAAAAAAA" + "'", str17, "4444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444AAAAAAAAAA");
        org.junit.Assert.assertNotNull(strArray18);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertNotNull(strArray22);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
    }

    @Test
    public void test39481() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest78.test39481");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.containsWhitespace("444444                                                                                                                                                                                                                             aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa                                                                                                                                                                                                                             ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test39482() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest78.test39482");
        java.lang.String[] strArray7 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("hi!", "java.lang", (int) '.');
        int int8 = org.apache.commons.lang3.StringUtils.indexOfAny("Short", strArray7);
        boolean boolean9 = org.apache.commons.lang3.StringUtils.startsWithAny("...                                 ", strArray7);
        java.lang.String str10 = org.apache.commons.lang3.StringUtils.concatWith("...      ", (java.lang.Object[]) strArray7);
        int int11 = org.apache.commons.lang3.StringUtils.indexOfAny("NTERF CEAJ V AL NGAcLONE BLEAAAAAAAJ V AAAAAAAAAAJ V AAAAAAAAAAJ V AAAAAAAAAAJ V AAAAAAAAAAJ V AAAAAAAAAAJ V AAAAAAAAAAJ V AAAAAAAAAAJ V AAAAAAAAAAJ V AAAAAAAAAAJ V AAAAAAAAAAJ V AAAAAAAAAAJ V AAAAAAAAAAJ V AAAAAAAAAAJ V AAAAAAAAAAJ V AAAAAAAAAAJ V AAAAAAAAAAJ V AAAAAAAAAAJ V AAAAAAAAAAJ V AAAAAAAAAAJ V AAAAAAAAAAJ V AAAAAAAAAAJ V AAAAAAAAAAJ V AAAAAAAAAAJ V AAAAAAAAAAJ V AAAAAAAAAAJ V AAAAAAAAAAJ V AAAAAAAAAAJ V AAAAAAAAAAJ V AAAAAAAAAAJ V AAAAAAAAAAJ V AAAAAAAAAAJ V AAAAAAAAAAJ V AAAAAAAAAAJ V AAAAAAAAAAJ V INTERF CEAJ V AIOAsERI LIZ BLE", strArray7);
        java.lang.String[] strArray13 = org.apache.commons.lang3.StringUtils.stripAll(strArray7, "...$$AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA$...$$AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA$...$$AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA$...$$AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA$...$$AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA$...$$AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA$...$$AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA$...$$AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA$...$$AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA$...$$AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA");
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertNotNull(strArray13);
    }

    @Test
    public void test39483() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest78.test39483");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceChars("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa...aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", 'a', 'a');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa...aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa" + "'", str3, "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa...aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
    }

    @Test
    public void test39484() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest78.test39484");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsAny("Y", "#$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$                                                                                       ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test39485() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest78.test39485");
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
        java.lang.Class<?> wildcardClass44 = null;
        java.lang.Class[] classArray46 = new java.lang.Class[1];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray47 = (java.lang.Class<?>[]) classArray46;
        wildcardClassArray47[0] = wildcardClass44;
        java.lang.Class<?>[] wildcardClassArray50 = org.apache.commons.lang3.ClassUtils.primitivesToWrappers(wildcardClassArray47);
        java.lang.String[] strArray52 = new java.lang.String[] { "                                   " };
        java.lang.String str53 = org.apache.commons.lang3.StringUtils.getCommonPrefix(strArray52);
        java.lang.Class<?>[] wildcardClassArray54 = org.apache.commons.lang3.ClassUtils.toClass((java.lang.Object[]) strArray52);
        java.lang.Class<?> wildcardClass55 = null;
        java.lang.Class[] classArray57 = new java.lang.Class[1];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray58 = (java.lang.Class<?>[]) classArray57;
        wildcardClassArray58[0] = wildcardClass55;
        java.lang.Class<?>[] wildcardClassArray61 = org.apache.commons.lang3.ClassUtils.primitivesToWrappers(wildcardClassArray58);
        boolean boolean62 = org.apache.commons.lang3.ClassUtils.isAssignable(wildcardClassArray54, wildcardClassArray58);
        boolean boolean64 = org.apache.commons.lang3.ClassUtils.isAssignable(wildcardClassArray47, wildcardClassArray58, true);
        java.lang.Class<?>[] wildcardClassArray65 = org.apache.commons.lang3.ClassUtils.toClass((java.lang.Object[]) wildcardClassArray47);
        java.lang.Class[] classArray67 = new java.lang.Class[0];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray68 = (java.lang.Class<?>[]) classArray67;
        java.lang.Class<?>[] wildcardClassArray69 = org.apache.commons.lang3.ClassUtils.primitivesToWrappers(wildcardClassArray68);
        java.lang.Class<?> wildcardClass70 = null;
        java.lang.Class[] classArray72 = new java.lang.Class[1];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray73 = (java.lang.Class<?>[]) classArray72;
        wildcardClassArray73[0] = wildcardClass70;
        java.lang.Class<?>[] wildcardClassArray76 = org.apache.commons.lang3.ClassUtils.primitivesToWrappers(wildcardClassArray73);
        boolean boolean78 = org.apache.commons.lang3.ClassUtils.isAssignable(wildcardClassArray68, wildcardClassArray73, true);
        java.lang.Class[] classArray80 = new java.lang.Class[0];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray81 = (java.lang.Class<?>[]) classArray80;
        java.lang.Class<?>[] wildcardClassArray82 = org.apache.commons.lang3.ClassUtils.primitivesToWrappers(wildcardClassArray81);
        java.lang.String str84 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) wildcardClassArray82, "...                                 ");
        boolean boolean85 = org.apache.commons.lang3.ClassUtils.isAssignable(wildcardClassArray73, wildcardClassArray82);
        boolean boolean87 = org.apache.commons.lang3.ClassUtils.isAssignable(wildcardClassArray47, wildcardClassArray82, false);
        boolean boolean88 = org.apache.commons.lang3.ClassUtils.isAssignable(wildcardClassArray3, wildcardClassArray82);
        java.lang.Class<?>[] wildcardClassArray89 = org.apache.commons.lang3.ClassUtils.wrappersToPrimitives(wildcardClassArray3);
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
        org.junit.Assert.assertNotNull(classArray46);
        org.junit.Assert.assertNotNull(wildcardClassArray47);
        org.junit.Assert.assertNotNull(wildcardClassArray50);
        org.junit.Assert.assertNotNull(strArray52);
        org.junit.Assert.assertEquals("'" + str53 + "' != '" + "                                   " + "'", str53, "                                   ");
        org.junit.Assert.assertNotNull(wildcardClassArray54);
        org.junit.Assert.assertNotNull(classArray57);
        org.junit.Assert.assertNotNull(wildcardClassArray58);
        org.junit.Assert.assertNotNull(wildcardClassArray61);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + false + "'", boolean62 == false);
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + false + "'", boolean64 == false);
        org.junit.Assert.assertNotNull(wildcardClassArray65);
        org.junit.Assert.assertNotNull(classArray67);
        org.junit.Assert.assertNotNull(wildcardClassArray68);
        org.junit.Assert.assertNotNull(wildcardClassArray69);
        org.junit.Assert.assertNotNull(classArray72);
        org.junit.Assert.assertNotNull(wildcardClassArray73);
        org.junit.Assert.assertNotNull(wildcardClassArray76);
        org.junit.Assert.assertTrue("'" + boolean78 + "' != '" + false + "'", boolean78 == false);
        org.junit.Assert.assertNotNull(classArray80);
        org.junit.Assert.assertNotNull(wildcardClassArray81);
        org.junit.Assert.assertNotNull(wildcardClassArray82);
        org.junit.Assert.assertEquals("'" + str84 + "' != '" + "" + "'", str84, "");
        org.junit.Assert.assertTrue("'" + boolean85 + "' != '" + false + "'", boolean85 == false);
        org.junit.Assert.assertTrue("'" + boolean87 + "' != '" + false + "'", boolean87 == false);
        org.junit.Assert.assertTrue("'" + boolean88 + "' != '" + false + "'", boolean88 == false);
        org.junit.Assert.assertNotNull(wildcardClassArray89);
    }

    @Test
    public void test39486() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest78.test39486");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isWhitespace((java.lang.CharSequence) "             CHARACTER             UTILSTRI");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test39487() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest78.test39487");
        java.lang.CharSequence charSequence2 = org.apache.commons.lang3.StringUtils.defaultIfEmpty((java.lang.CharSequence) "javastring..", (java.lang.CharSequence) "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                          ...     javaulangrraylist                   ..");
        org.junit.Assert.assertEquals("'" + charSequence2 + "' != '" + "javastring.." + "'", charSequence2, "javastring..");
    }

    @Test
    public void test39488() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest78.test39488");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.containsWhitespace("interfacejava.lang.cloneable#interfacejava.io");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test39489() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest78.test39489");
        int int1 = org.apache.commons.lang3.StringUtils.length((java.lang.CharSequence) "interface#java.lang.cloneable4interface....................................................................$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$Gnal$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$                       $$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$Gnal$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$javaulang");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 339 + "'", int1 == 339);
    }

    @Test
    public void test39490() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest78.test39490");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.substringBetween("javallangj                                                                                                                                                                                                                                                                                                                           ", "NALAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertNull(str3);
    }

    @Test
    public void test39491() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest78.test39491");
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.replace("A..ayL A##############A..ayL A##############A..ayL A##############A..ayL A##############A..ayL A##############A..ayL A##############A..ayL A#########.......                                                  ", "", "                                     RGNALUAVAJ", 545);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "A..ayL A##############A..ayL A##############A..ayL A##############A..ayL A##############A..ayL A##############A..ayL A##############A..ayL A#########.......                                                  " + "'", str4, "A..ayL A##############A..ayL A##############A..ayL A##############A..ayL A##############A..ayL A##############A..ayL A##############A..ayL A#########.......                                                  ");
    }

    @Test
    public void test39492() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest78.test39492");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trim("...ngagnaljRChahactaRChahactaRChahactaRChahactaRChahactaRChahacta");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "...ngagnaljRChahactaRChahactaRChahactaRChahactaRChahactaRChahacta" + "'", str1, "...ngagnaljRChahactaRChahactaRChahactaRChahactaRChahactaRChahacta");
    }

    @Test
    public void test39493() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest78.test39493");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.upperCase("44444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444AVALITU");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "44444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444AVALITU" + "'", str1, "44444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444AVALITU");
    }

    @Test
    public void test39494() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest78.test39494");
        int int3 = org.apache.commons.lang3.StringUtils.indexOfIgnoreCase("                                                                                      gjava..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java.....", "INTERFACE JAVA.LANG.cLONEABLEa RRR RRR RRR RRR RRR RRR RRR RRR RNAL....................INTERFACE JAVA.LAN", 52);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test39495() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest78.test39495");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.strip("                                                                                                                                                                                                                                             HI!aRRAYlISTaRRAYlISTaRRAYlISTAVAJ.GNALaRRAYlISTaRRAYlISTaRRAYlISTAVAJ                                                                                                                                                                                                                                              javaStrinSerializableSerializableSerializableSerialijavaStrinSerializableSerializableSerializableSerialijavaStrinSerializableSerializableSerializableSerialijavaStrinSerializableSerializableSerializableSerialijavaStrinSerializableSerializableSerializableSerialijavaStrinSerializableSerializableSerializableSerialijavaStrinSerializableSerializableSerializableSerialijavaStrinSerializableSerializable");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "HI!aRRAYlISTaRRAYlISTaRRAYlISTAVAJ.GNALaRRAYlISTaRRAYlISTaRRAYlISTAVAJ                                                                                                                                                                                                                                              javaStrinSerializableSerializableSerializableSerialijavaStrinSerializableSerializableSerializableSerialijavaStrinSerializableSerializableSerializableSerialijavaStrinSerializableSerializableSerializableSerialijavaStrinSerializableSerializableSerializableSerialijavaStrinSerializableSerializableSerializableSerialijavaStrinSerializableSerializableSerializableSerialijavaStrinSerializableSerializable" + "'", str1, "HI!aRRAYlISTaRRAYlISTaRRAYlISTAVAJ.GNALaRRAYlISTaRRAYlISTaRRAYlISTAVAJ                                                                                                                                                                                                                                              javaStrinSerializableSerializableSerializableSerialijavaStrinSerializableSerializableSerializableSerialijavaStrinSerializableSerializableSerializableSerialijavaStrinSerializableSerializableSerializableSerialijavaStrinSerializableSerializableSerializableSerialijavaStrinSerializableSerializableSerializableSerialijavaStrinSerializableSerializableSerializableSerialijavaStrinSerializableSerializable");
    }

    @Test
    public void test39496() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest78.test39496");
        java.lang.String str1 = org.apache.commons.lang3.ClassUtils.getShortClassName("yLis...VA.LANGAVAJ.GNALJAVA.LANGAVAJ.GNALJAVA.LANGAVAJ.GNALJAVA.LANGAVAJ.GNALJAVA.LANGAVAJ.GNALJAVA.LANGaArr");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "LANGaArr" + "'", str1, "LANGaArr");
    }

    @Test
    public void test39497() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest78.test39497");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByCharacterType("GN                                            ");
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.splitByCharacterType("..........");
        java.lang.String[] strArray5 = org.apache.commons.lang3.StringUtils.stripAll(strArray4);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str6 = org.apache.commons.lang3.StringUtils.replaceEachRepeatedly("                                                                           ..gnirtsavaJ                                                                           ", strArray2, strArray5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Search and Replace array lengths don't match: 2 vs 1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertNotNull(strArray5);
    }

    @Test
    public void test39498() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest78.test39498");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.endsWith("java.langAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA", "aaaaaaaaaaaaaaaaaaaaaaGNL$.$VJaaaaaaaaaaaaaaaaaaaaaaasAitUJAirtSsAitUJAirtSsAitUJAirtSsAitUJAirtSsAitUJAirtSsAitUJAirtSsAitUJAirtSsAitUJAirtSsAitUJAirtSsAitUJAirtSsAitUJAirtSsAitUJAirtSsAitUJAirtSsAitUJAirtSsAitUJAirtSsAitUJAirtSsAitUJAirtSsAitUJAirtSsAitUJAirtSsAitUJAirtSsAitUJAirtSsAitUJAirtSsAitUJAirtSsAitUJAirtSsAitUJAirtSsAitUJAirtSsAitUJAirtSsAitUJAirtSsAitUJAirtSsAitUJAirtSsAitUJAirtSsAitUJAirtSsAitUJAirtSsAitUJAirtSsAitUJAirtSsAitUJAirtSsAitUJAirtSsAitUJAirtSsAitUJAirtSsAitUJAirtSsAitUJAirtSsAitUJAirtSsAitUJAirtSsAitUJAirtSsAitUJAirtSsAitUJAirtSsAitUJAirtSsAitUJAirtSsAitUJAirtSsAitUJAirtSsAitUJAirtSsAitUJAirtSsAitUJAirtSsAitUJAirtSsAitUJAirtSsAitUJAirtSsAitUJAirtSsAitUJAirtSsAitUJAirtSsAitUJAirtSsAitUJAirtSsAitUJAirtSsAitUJAirtSsAitUJAirtSsAitUJAirtSsAitUJAirtSsAitUJAirtSsAitUJAirtSsAitUJAirtSsAitUJAirtSsAitUJAirtSsAitUJAirtSsAitUJAirtSsAitUJAirtSsAitUJAirtSsAitUJAirtSsAitUJAirtSsAitUJAirtSsAitUJAirtSsAitUJAirtSsAitUJ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test39499() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest78.test39499");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsAny("hi!ArrayListArrayListArrayListavaj.gnalArrayListArrayListArrayListavaj.gnalArrayListArrayListArrayLi", "                                  . ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test39500() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest78.test39500");
        int int3 = org.apache.commons.lang3.StringUtils.ordinalIndexOf("j ssalcrrAva.langGNAL..langjava.langAGNAL.AVAJ", "   ####   slitUgnirtSslitUgnirtSslitUgnirtSslitUgnirtSslitUgnirtSslitUgnirtSslitUgnirtSslitUgnirtSsl", 537);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }
}

