import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest17 {

    public static boolean debug = false;

    @Test
    public void test08501() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08501");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.rightPad("Serializabl", (int) '$', "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Serializabl                         " + "'", str3, "Serializabl                         ");
    }

    @Test
    public void test08502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08502");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOf("             Character             utilStri", 70);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test08503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08503");
        java.lang.String str1 = org.apache.commons.lang3.ClassUtils.getPackageName("GnalAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
    }

    @Test
    public void test08504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08504");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trimToEmpty("lass...");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "lass..." + "'", str1, "lass...");
    }

    @Test
    public void test08505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08505");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.capitalize((java.lang.CharSequence) "JAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANG");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "JAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANG" + "'", str1, "JAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANG");
    }

    @Test
    public void test08506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08506");
        int int1 = org.apache.commons.lang3.StringUtils.length((java.lang.CharSequence) "##################################################java.uti#########################################################################");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 131 + "'", int1 == 131);
    }

    @Test
    public void test08507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08507");
        java.lang.ClassLoader classLoader0 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass3 = org.apache.commons.lang3.ClassUtils.getClass(classLoader0, "Arralitu.avajlitu.avaj", true);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassNotFoundException; message: Arralitu/avajlitu/avaj");
        } catch (java.lang.ClassNotFoundException e) {
            // Expected exception.
        }
    }

    @Test
    public void test08508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08508");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.substringsBetween("javal       aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaagn", "Java.litu.avajlitu.avajjava.litu.avajlitu.avajjava.litu.avajlitu.avajjava.litu.avajlitu.avajjava.litu.avajlitu.avajjava.litu.avajlitu.avajjava.litu.avajlitu.avajjava.litu.avajlitu.avajjava.litu.avajlitu.avajjava.litu.avajlitu.avajjava.litu.avajlitu.avajjava.litu.avajlitu.avajjava.litu.avajlitu.avajjava.litu.avajlitu.avajjava.litu.avajlitu.avajjava.litu.avajlitu.avajjava.litu.avajlitu.avajjava.litu.avajlitu.avajjava.litu.avajlitu.avajjava.litu.avajlitu.avajjava.litu.avajlitu.avajjava.litu.avajlitu.avajjava.litu.avajlitu.avajjava.litu.avajlitu.avajjava.litu.avajlitu.avajjava.litu.avajlitu.avajjava.litu.avajlitu.avajjava.litu.avajlitu.avajjava.litu.avajlitu.avajjava.litu.avajlitu.avajjava.litu.avajlitu.avajjava.litu.avajlitu.avajjava.litu.avajlitu.avaj", "..........a");
        org.junit.Assert.assertNull(strArray3);
    }

    @Test
    public void test08509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08509");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.startsWithIgnoreCase("CLASSSLITUGNIRTSSLITUGNIRTSSLITUGNIRTSSLITUGNIRTSSLITUGNIRTSSLITUGNIRTinterfcegg.lng.ClonebleAAAAAAAAAAggl.gnAAAAAAAAAAggl.gnAAAAAAAAAAggl.gnAAAAAAAAAAggl.gnAAAAAAAAAAggl.gnAAAAAAAAAAggl.gnAAAAAAAAAAggl.gnAAAAAAAAAAggl.gnAAAAAAAAAAggl.gnAAAAAAAAAAggl.gnAAAAAAAAAAggl.gnAAAAAAAAAAggl.gnAAAAAAAAAAggl.gnAAAAAAAAAAggl.gnAAAAAAAAAAggl.gnAAAAAAAAAAggl.gnAAAAAAAAAAggl.gnAAAAAAAAAAggl.gnAAAAAAAAAAggl.gnAAAAAAAAAAggl.gnAAAAAAAAAAggl.gnAAAAAAAAAAggl.gnAAAAAAAAAAggl.gnAAAAAAAAAAggl.gnAAAAAAAAAAggl.gnAAAAAAAAAAggl.gnAAAAAAAAAAggl.gnAAAAAAAAAAggl.gnAAAAAAAAAAggl.gnAAAAAAAAAAggl.gnAAAAAAAAAAggl.gnAAAAAAAAAAggl.gnAAAAAAAAAAggl.gnAAAAAAAAAAggl.gnAAAAAAAAAAggl.gnAAAAAAAAAAringinterfcegg.io", "...       ....       .");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test08510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08510");
        int int2 = org.apache.commons.lang3.StringUtils.getLevenshteinDistance((java.lang.CharSequence) "                      Integer                       ", (java.lang.CharSequence) "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 423 + "'", int2 == 423);
    }

    @Test
    public void test08511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08511");
        int int3 = org.apache.commons.lang3.StringUtils.indexOf("Serializable", 94, (int) (short) 100);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test08512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08512");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isWhitespace((java.lang.CharSequence) "A..ayLA.");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test08513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08513");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.difference("interface java.lang.CloneableNG.Llitinterface java.io.Serializable", "tavaj.gnalarraylistarraylistarrayli");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "tavaj.gnalarraylistarraylistarrayli" + "'", str2, "tavaj.gnalarraylistarraylistarrayli");
    }

    @Test
    public void test08514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08514");
        java.util.Locale locale1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.apache.commons.lang3.StringUtils.upperCase("interfacejava.lang.Cloneable#interfacejava.iointerfacejava.lang.Cloneable#interfacejava.iointerfacejava.la", locale1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test08515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08515");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trimToEmpty("interface java.lang.CloneableString[]String[]String[]String[]String[]String[]String[]String[]String[]String[]String[]String[]String[]String[]String[]String[]String[]String[]String[]String[]String[]String[]String[]String[]String[]String[]String[]String[]String[]String[]String[]String[]String[]String[]String[]String[]String[]String[]String[]String[]String[]String[]String[]String[]String[]String[]String[]String[]String[]String[]String[]String[]String[]String[]String[]String[]String[]String[]String[]String[]String[]String[]String[]String[]String[]String[]String[]interface java.io.Serializable");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "interface java.lang.CloneableString[]String[]String[]String[]String[]String[]String[]String[]String[]String[]String[]String[]String[]String[]String[]String[]String[]String[]String[]String[]String[]String[]String[]String[]String[]String[]String[]String[]String[]String[]String[]String[]String[]String[]String[]String[]String[]String[]String[]String[]String[]String[]String[]String[]String[]String[]String[]String[]String[]String[]String[]String[]String[]String[]String[]String[]String[]String[]String[]String[]String[]String[]String[]String[]String[]String[]String[]interface java.io.Serializable" + "'", str1, "interface java.lang.CloneableString[]String[]String[]String[]String[]String[]String[]String[]String[]String[]String[]String[]String[]String[]String[]String[]String[]String[]String[]String[]String[]String[]String[]String[]String[]String[]String[]String[]String[]String[]String[]String[]String[]String[]String[]String[]String[]String[]String[]String[]String[]String[]String[]String[]String[]String[]String[]String[]String[]String[]String[]String[]String[]String[]String[]String[]String[]String[]String[]String[]String[]String[]String[]String[]String[]String[]String[]interface java.io.Serializable");
    }

    @Test
    public void test08516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08516");
        java.lang.CharSequence charSequence2 = org.apache.commons.lang3.StringUtils.defaultIfBlank((java.lang.CharSequence) "$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$", (java.lang.CharSequence) "-1java.utilString[]    ");
        org.junit.Assert.assertEquals("'" + charSequence2 + "' != '" + "$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$" + "'", charSequence2, "$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$");
    }

    @Test
    public void test08517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08517");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOf("                  ...                         ", "$$$$$$$$$$$$$$$$$$$...", 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test08518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08518");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.difference("GNALaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaagn", "erface java.lang.Cloneable....................................................................                       JAVAULANGinterface java.io.Serializable");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "erface java.lang.Cloneable....................................................................                       JAVAULANGinterface java.io.Serializable" + "'", str2, "erface java.lang.Cloneable....................................................................                       JAVAULANGinterface java.io.Serializable");
    }

    @Test
    public void test08519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08519");
        char[] charArray9 = new char[] { '.', '.', ' ', '.', ' ' };
        int int10 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "$       ", charArray9);
        boolean boolean11 = org.apache.commons.lang3.StringUtils.containsAny("interface java.lang.CloneableAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAringinterface java.io.Serializable", charArray9);
        boolean boolean12 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "...aaaaaaaaaaaaaaaaaaaaaaaaaa...", charArray9);
        int int13 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "                      Integer                       ", charArray9);
        org.junit.Assert.assertNotNull(charArray9);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray9), ".. . ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray9), ".. . ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray9), "[., .,  , .,  ]");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
    }

    @Test
    public void test08520() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08520");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("################################...       AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA", "rrayList", (int) (byte) -1);
        java.lang.String str5 = org.apache.commons.lang3.ClassUtils.getPackageName((java.lang.Object) (byte) -1, " ");
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "java.lang" + "'", str5, "java.lang");
    }

    @Test
    public void test08521() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08521");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.substringBetween("ArrayLis.....", "Array", "ARRYLIST");
        org.junit.Assert.assertNull(str3);
    }

    @Test
    public void test08522() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08522");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.split("                                           ", '#');
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test08523() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08523");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeEndIgnoreCase("yList", "Serializabl                         ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "yList" + "'", str2, "yList");
    }

    @Test
    public void test08524() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08524");
        java.util.Locale locale1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.apache.commons.lang3.StringUtils.lowerCase("javal       aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaagn", locale1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test08525() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08525");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.mid("#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#lass java#lang#String", 29, 788);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "J#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#lass java#lang#String" + "'", str3, "J#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#lass java#lang#String");
    }

    @Test
    public void test08526() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08526");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.substring("interfce jv.lng.cloneble", (int) ' ', 525);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test08527() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08527");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAsciiPrintable((java.lang.CharSequence) "   ####   ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test08528() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08528");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.mid("AAAAAAAAAAjaval.agnAAAAAAAAAAjaval.a", 99, 26);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test08529() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08529");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass2 = org.apache.commons.lang3.ClassUtils.getClass("$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$avalitu.$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$", true);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassNotFoundException; message: $$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$avalitu.$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$");
        } catch (java.lang.ClassNotFoundException e) {
            // Expected exception.
        }
    }

    @Test
    public void test08530() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08530");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.startsWith("avajgnal", "vaj.gnaljava.langavaj.gnaljava.langavaj.gnaljava.langavaj.gnaljava.langavaj.gnaljava.langavaj.gnaljava.lang");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test08531() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08531");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.chomp("INTERFACE JAVA.LANG.CLONEABLE$$.JAVA$$$.JAVA$$$.JAVA$$$.JAVA$$$.JAVA$$$.JAVA$$$.JAVA$$$.JAVA$$$.JAVA$$$.JAVA$$$.JAVA$$$.JAVA$$$.JAVA$$$.JAVA$$$.JAVA$$$.JAVA$$$.JAVA$$$.JAVA$$$.JAVA$$$.JAVA$$$.JAVA$$$.JAVA$$$.JAVA$$$.JAVA$$$.JAVA$$$.JAVA$$$.JAVA$$$.JAVA$$$.JAVA$$$.JAVA$$$.JAVA$$$.JAVA$$$.JAVA$$$.JAVA$$$.JAVAINTERFACE JAVA.IO.SERIALIZABLE");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "INTERFACE JAVA.LANG.CLONEABLE$$.JAVA$$$.JAVA$$$.JAVA$$$.JAVA$$$.JAVA$$$.JAVA$$$.JAVA$$$.JAVA$$$.JAVA$$$.JAVA$$$.JAVA$$$.JAVA$$$.JAVA$$$.JAVA$$$.JAVA$$$.JAVA$$$.JAVA$$$.JAVA$$$.JAVA$$$.JAVA$$$.JAVA$$$.JAVA$$$.JAVA$$$.JAVA$$$.JAVA$$$.JAVA$$$.JAVA$$$.JAVA$$$.JAVA$$$.JAVA$$$.JAVA$$$.JAVA$$$.JAVA$$$.JAVA$$$.JAVAINTERFACE JAVA.IO.SERIALIZABLE" + "'", str1, "INTERFACE JAVA.LANG.CLONEABLE$$.JAVA$$$.JAVA$$$.JAVA$$$.JAVA$$$.JAVA$$$.JAVA$$$.JAVA$$$.JAVA$$$.JAVA$$$.JAVA$$$.JAVA$$$.JAVA$$$.JAVA$$$.JAVA$$$.JAVA$$$.JAVA$$$.JAVA$$$.JAVA$$$.JAVA$$$.JAVA$$$.JAVA$$$.JAVA$$$.JAVA$$$.JAVA$$$.JAVA$$$.JAVA$$$.JAVA$$$.JAVA$$$.JAVA$$$.JAVA$$$.JAVA$$$.JAVA$$$.JAVA$$$.JAVA$$$.JAVAINTERFACE JAVA.IO.SERIALIZABLE");
    }

    @Test
    public void test08532() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08532");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.normalizeSpace("44444444444444444.444444444444444444");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "44444444444444444.444444444444444444" + "'", str1, "44444444444444444.444444444444444444");
    }

    @Test
    public void test08533() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08533");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceChars("#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#lass java#lang#String", "", "String");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#lass java#lang#String" + "'", str3, "#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#lass java#lang#String");
    }

    @Test
    public void test08534() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08534");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.left("java.lang.Cloneable4interface java.io.Serializa", 576);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "java.lang.Cloneable4interface java.io.Serializa" + "'", str2, "java.lang.Cloneable4interface java.io.Serializa");
    }

    @Test
    public void test08535() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08535");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("$       ", "class java.lang.String", 35);
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray3, "JAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANG", 22, 11);
        java.lang.String[] strArray8 = org.apache.commons.lang3.StringUtils.stripAll(strArray3);
        java.lang.Class<?>[] wildcardClassArray9 = org.apache.commons.lang3.ClassUtils.toClass((java.lang.Object[]) strArray8);
        java.lang.String str13 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) wildcardClassArray9, "", 788, 9);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertNotNull(wildcardClassArray9);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
    }

    @Test
    public void test08536() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08536");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeStart("GnalAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA", "javajavajavajavajavajavajavajavajavajavajavajavajavajavajavajavajavajavajavajavajavajavajavajavajavajavajavajavajavajavajavajavajavajava");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "GnalAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA" + "'", str2, "GnalAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA");
    }

    @Test
    public void test08537() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08537");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.startsWith("                                 int", "SERIALIZABL...     JAVA44444444444444444.4444");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test08538() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08538");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsAny("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "$$$$$$$$$$$$$$$$$$$...");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test08539() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08539");
        java.util.Locale locale1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.apache.commons.lang3.StringUtils.lowerCase("..........................................................................................", locale1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test08540() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08540");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.stripStart("...       ...       ...       ...       ...       ...       ...       ...       ...       ...   gna", "ArrayListArrayListArrayListavajagnal");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "...       ...       ...       ...       ...       ...       ...       ...       ...       ...   gna" + "'", str2, "...       ...       ...       ...       ...       ...       ...       ...       ...       ...   gna");
    }

    @Test
    public void test08541() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08541");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfIgnoreCase("rrayList", "INTERFACE JAVA.LANG.cLONEABLE.......JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVAINTERFACE JAVA.IO.sERIALIZABL");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test08542() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08542");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeStart("###########################VA.LANGAVAJ.GNALJAVA.LANGAVAJ.GNALJAVA.LANGAVAJ.GNALJAVA.LANGAVAJ.GNALJAVA.LANGAVAJ.GNALJAVA.LANG###########################", "interf$ce#j$v$.l$ng.Clone$ble....................................................................#######################JAVAULANGinterf$ce#j$v$.io.Seri$liz$ble");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "###########################VA.LANGAVAJ.GNALJAVA.LANGAVAJ.GNALJAVA.LANGAVAJ.GNALJAVA.LANGAVAJ.GNALJAVA.LANGAVAJ.GNALJAVA.LANG###########################" + "'", str2, "###########################VA.LANGAVAJ.GNALJAVA.LANGAVAJ.GNALJAVA.LANGAVAJ.GNALJAVA.LANGAVAJ.GNALJAVA.LANGAVAJ.GNALJAVA.LANG###########################");
    }

    @Test
    public void test08543() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08543");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.normalizeSpace("interface java.lang.cloneable");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "interface java.lang.cloneable" + "'", str1, "interface java.lang.cloneable");
    }

    @Test
    public void test08544() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08544");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass1 = org.apache.commons.lang3.ClassUtils.getClass("ja");
            org.junit.Assert.fail("Expected exception of type java.lang.ClassNotFoundException; message: ja");
        } catch (java.lang.ClassNotFoundException e) {
            // Expected exception.
        }
    }

    @Test
    public void test08545() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08545");
        java.lang.ClassLoader classLoader0 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass2 = org.apache.commons.lang3.ClassUtils.getClass(classLoader0, "CEAJ V AL ");
            org.junit.Assert.fail("Expected exception of type java.lang.ClassNotFoundException; message: CEAJVAL");
        } catch (java.lang.ClassNotFoundException e) {
            // Expected exception.
        }
    }

    @Test
    public void test08546() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08546");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBefore("String[]", "irfCo$irfioSriizaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "String[]" + "'", str2, "String[]");
    }

    @Test
    public void test08547() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08547");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.startsWith("...#######", "JAVA.UTILhi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!h");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test08548() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08548");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeStartIgnoreCase("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaagn                                            ", "rrayListrrayListrrayListrrayListrrayListrrayListrrayListrrayListrrayListrr...    ...rrayListrrayListrrayListrrayListrrayListrrayListrrayListrrayListrrayListrra");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaagn                                            " + "'", str2, "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaagn                                            ");
    }

    @Test
    public void test08549() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08549");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.substringsBetween("A rrr rrr rrr rrr rrr rrr rrr rrr rrr rrr", "                  ...                         ", "gnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnal.LANG.LANG.LANG.LANG.LANG.LANG.Llitu");
        org.junit.Assert.assertNull(strArray3);
    }

    @Test
    public void test08550() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08550");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("string", "  ");
        java.lang.String str4 = org.apache.commons.lang3.ClassUtils.getShortClassName((java.lang.Object) "  ", "etyBetyBetyBetyBetyBetyBetyBetyBetyBetyBetyBetyBetyBetyBetyBetyBetyBetyBetyBetyBetyBetyBetyBetyBetyBetyBetyBetyBetyBetyBetyBetyBetyBetyBetyBetyBetyBetyBetyBetyBetyBetyBetyBetyBetyBetyBetyBetyBetyBetyBetyBetyBetyetyBetyBetyBetyBetyBetyBetyBetyBetyBetyBetyBetyBetyBetyBetyBetyBetyBetyBetyBetyBetyBetyBetyBetyBetyBetyBetyBetyBetyBetyBetyBetyBetyBetyBetyBetyBetyBetyBetyBetyBetyBetyBetyBetyBetyBetyBetyBetyBetyBetyBetyBetyBetyB");
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "String" + "'", str4, "String");
    }

    @Test
    public void test08551() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08551");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeStart("JAVA.LANGA", "AtsiLytcejbOlvjsslcrrAtsiLytcejbO.gnal.avaj ssalcrrAva.langGNAL..langjava.langAGNAL.AVAJ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "JAVA.LANGA" + "'", str2, "JAVA.LANGA");
    }

    @Test
    public void test08552() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08552");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isEmpty((java.lang.CharSequence) "$");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test08553() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08553");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.remove("$$$$$$$$$$$$$$$$$$$$$$", "BYTEINTERFACE GAGA.LANG.CLONEABLEAAAAAAAAAAGAGAL.AGNAAAAAAAAAAGAGAL.AGNAAAAAAAAAAGAGAL.AGNAAAAAAAAAAGAGAL.AGNAAAAAAAAAAGAGAL.AGNAAAAAAAAAAGAGAL.AGNAAAAAAAAAAGAGAL.AGNAAAAAAAAAAGAGAL.AGNAAAAAAAAAAGAGAL.AGNAAAAAAAAAAGAGAL.AGNAAAAAAAAAAGAGAL.AGNAAAAAAAAAAGAGAL.AGNAAAAAAAAAAGAGAL.AGNAAAAAAAAAAGAGAL.AGNAAAAAAAAAAGAGAL.AGNAAAAAAAAAAGAGAL.AGNAAAAAAAAAAGAGAL.AGNAAAAAAAAAAGAGAL.AGNAAAAAAAAAAGAGAL.AGNAAAAAAAAAAGAGAL.AGNAAAAAAAAAAGAGAL.AGNAAAAAAAAAAGAGAL.AGNAAAAAAAAAAGAGAL.AGNAAAAAAAAAAGAGAL.AGNAAAAAAAAAAGAGAL.AGNAAAAAAAAAAGAGAL.AGNAAAAAAAAAAGAGAL.AGNAAAAAAAAAAGAGAL.AGNAAAAAAAAAAGAGAL.AGNAAAAAAAAAAGAGAL.AGNAAAAAAAAAAGAGAL.AGNAAAAAAAAAAGAGAL.AGNAAAAAAAAAAGAGAL.AGNAAAAAAAAAAGAGAL.AGNAAAAAAAAAAGAGAL.AGNAAAAAAAAAARINGINTERFACE GAGA.IO.SERIALIZABLE");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "$$$$$$$$$$$$$$$$$$$$$$" + "'", str2, "$$$$$$$$$$$$$$$$$$$$$$");
    }

    @Test
    public void test08554() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08554");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("GNALaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaagn", "....................................................................................................................................................44444444444444444444444444444444444444444444444444444444444444444444444javaulang444444444444444444444444444444444444444444444444444444444444444444444444....................................................................................................................................................");
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test08555() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08555");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeEndIgnoreCase("-1JAVA.UTILsTRING-1JAVA", "avaJ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "-1JAVA.UTILsTRING-1JAVA" + "'", str2, "-1JAVA.UTILsTRING-1JAVA");
    }

    @Test
    public void test08556() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08556");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.endsWith("java.util", "hi!ArrayListArrayListArrayListavaj.... AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA... AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA... AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA... AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA... AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA... AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA... AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA... AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA... AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA... ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test08557() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08557");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("GNAL.AVAJGNAL..langGNAL.AVAJGNAL.", " AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA");
        boolean boolean4 = org.apache.commons.lang3.StringUtils.endsWithAny("", strArray3);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test08558() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08558");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfAnyBut("ylistarraylistarray", "... java.lang.Stringclass java.lang.Stringclass...... java.lang.Stringclass java.lang.Stringclass...... java.lang.Stringclass java.lang.Stringclass...... java.lang.Stringclass java.lang.Stringclass...... java.lang.Stringclass java.lang.Stringclass...... java.lang.Stringclass java.lang.Stringclass...... java.lang.Stringclass java.lang.Stringclass...... java.lang.Stringclass java.lang.Stringclass...... java.lang.Stringclass java.lang.Stringclass...... java.lang.Stringclass java.lang.Stringclass...... java.lang.Stringclass java.lang.Stringclass...... java.lang.Stringclass java.lang.Stringclass...... java.lang.Stringclass java.lang.Stringclass...... java.lang.Stringclass java.lang.Stringclass...... java.lang.Stringclass java.lang.Stringclass...... java.lang.Stringclass java.lang.Stringclass...... java.lang.Stringclass java.lang.Stringclass...... java.lang.Stringclass java.lang.Stringcl...avaj..........avaj..........avaj");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test08559() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08559");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripAccents((java.lang.CharSequence) "     A..ayL A.44444444444444444444444444      ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "     A..ayL A.44444444444444444444444444      " + "'", str1, "     A..ayL A.44444444444444444444444444      ");
    }

    @Test
    public void test08560() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08560");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphanumericSpace((java.lang.CharSequence) "tring");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test08561() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08561");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.upperCase(".lang.Stringclass java.lang.Stringclass java.lang.Stringclas");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + ".LANG.STRINGCLASS JAVA.LANG.STRINGCLASS JAVA.LANG.STRINGCLAS" + "'", str1, ".LANG.STRINGCLASS JAVA.LANG.STRINGCLASS JAVA.LANG.STRINGCLAS");
    }

    @Test
    public void test08562() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08562");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.strip("java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java.......");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java......." + "'", str1, "java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java.......");
    }

    @Test
    public void test08563() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08563");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeStart("avaJ", "       ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "avaJ" + "'", str2, "avaJ");
    }

    @Test
    public void test08564() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08564");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trim("jv..........jv..........jv..........jv..........jv..........jv..........jv..........jv..........jv..........jv..........jv..........jv..........jv..........jv..........jv..........jv..........jv..........jv..........jv..........jv..........jv..........jv..........jv..........jv..........jv..........jv..........jv..........jv..........jv..........jv..........jv..........jv..........jv..........jv..........jvinterfce jv.io");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "jv..........jv..........jv..........jv..........jv..........jv..........jv..........jv..........jv..........jv..........jv..........jv..........jv..........jv..........jv..........jv..........jv..........jv..........jv..........jv..........jv..........jv..........jv..........jv..........jv..........jv..........jv..........jv..........jv..........jv..........jv..........jv..........jv..........jv..........jvinterfce jv.io" + "'", str1, "jv..........jv..........jv..........jv..........jv..........jv..........jv..........jv..........jv..........jv..........jv..........jv..........jv..........jv..........jv..........jv..........jv..........jv..........jv..........jv..........jv..........jv..........jv..........jv..........jv..........jv..........jv..........jv..........jv..........jv..........jv..........jv..........jv..........jv..........jvinterfce jv.io");
    }

    @Test
    public void test08565() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08565");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceChars("JAVA.UTILJAVA.UTIL", 'a', '$');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "JAVA.UTILJAVA.UTIL" + "'", str3, "JAVA.UTILJAVA.UTIL");
    }

    @Test
    public void test08566() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08566");
        java.lang.ClassLoader classLoader0 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass2 = org.apache.commons.lang3.ClassUtils.getClass(classLoader0, "INTERFACE JAVA.LANG.CLONEABLE...                                 INTERFACE JAVA.IO.SERIALIZABLE");
            org.junit.Assert.fail("Expected exception of type java.lang.ClassNotFoundException; message: INTERFACEJAVA/LANG/CLONEABLE///INTERFACEJAVA/IO/SERIALIZABLE");
        } catch (java.lang.ClassNotFoundException e) {
            // Expected exception.
        }
    }

    @Test
    public void test08567() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08567");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.right("                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                             ArryLis", 940);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                             ArryLis" + "'", str2, "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                             ArryLis");
    }

    @Test
    public void test08568() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08568");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.chop("gnal.avaj");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "gnal.ava" + "'", str1, "gnal.ava");
    }

    @Test
    public void test08569() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08569");
        int int1 = org.apache.commons.lang3.StringUtils.length((java.lang.CharSequence) "class java.lang.Objectclass java.lang.Objectclass java.lang.Objectclass java.lang.Objectclass java.lang.Objectclass java.lang.Objectclass java.lang.Objectclass java.lang.Objectclass java.lang.Objectclass java.lang.Objectclass java.lang.Objectclass java.lang.Objectclass java.lang.Objectclass java.lang.Objectclass java.lang.Objectclass java.lang.Objectclass java.lang.Objectclass java.lang.Objectclass java.lang.Objectclass java.lang.Objectclass java.lang.Objectclass java.lang.Object");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 484 + "'", int1 == 484);
    }

    @Test
    public void test08570() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08570");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsAny("jvstringnlrrylistrrylistrrylistvj.gnlrrylistrrylistrryli", "NTERFACEJAVA.LANG.cLONEABLE.......J");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test08571() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08571");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBeforeLast("Java.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava...", ".       .       .       .       .       .       .       .       .       .       .       .       .       .       .       .       .       .       .       .       .       .       .       .       .       .       .       .       .       .       .       .       .       .       .       .       .       .       .       .       .       .       .       .       .       .       .       .       .       .       .       .       .       .       .       .       .       .       .       .       .       .       .       .       .       .       .       .       .       .       .       .       .       .       .       .       .       .       .       .       .       .       .       .       .       .       .       .       .       .       .       .       .       .       .       .       .       .       .       .       ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Java.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava..." + "'", str2, "Java.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava...");
    }

    @Test
    public void test08572() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08572");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOf("Hi!ArrayListArrayListArrayListavaj.... AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA... AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA... AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA... AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA... AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA... AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA... AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA... AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA... AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA... ", 77);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test08573() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08573");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isWhitespace((java.lang.CharSequence) "rrayLi");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test08574() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08574");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.right("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", 939);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa" + "'", str2, "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
    }

    @Test
    public void test08575() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08575");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "CLASS JAVA.LANG.oBJECT", "L.Arr#yListgnaljava..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java.........");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test08576() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08576");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.center("StringStringStringStringStringStringStringStringStringString", 10, "..........a");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "StringStringStringStringStringStringStringStringStringString" + "'", str3, "StringStringStringStringStringStringStringStringStringString");
    }

    @Test
    public void test08577() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08577");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.abbreviate("44444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444             Character             ", 30);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "444444444444444444444444444..." + "'", str2, "444444444444444444444444444...");
    }

    @Test
    public void test08578() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08578");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBeforeLast("class java.lang.Classclass java.lang.Classclass java.lang.Classclass java.lang.Classclass java.lang.Classclass java.lang.Classclass java.lang.Classclass java.lang.Classclass java.lang.Classclass java.lang.Classclass java.lang.Classclass java.lang.Classclass java.lang.Classclass java.lang.Classclass java.lang.Classclass java.lang.Classclass java.lang.Classclass java.lang.Classclass java.lang.Classclass java.lang.Classclass java.lang.Classclass java.lang.Classclass java.lang.Classclass java.lang.Classclass java.lang.Classclass java.lang.Classclass java.lang.Classclass java.lang.Classclass java.lang.Classclass java.lang.Class", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa][ssalC");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "class java.lang.Classclass java.lang.Classclass java.lang.Classclass java.lang.Classclass java.lang.Classclass java.lang.Classclass java.lang.Classclass java.lang.Classclass java.lang.Classclass java.lang.Classclass java.lang.Classclass java.lang.Classclass java.lang.Classclass java.lang.Classclass java.lang.Classclass java.lang.Classclass java.lang.Classclass java.lang.Classclass java.lang.Classclass java.lang.Classclass java.lang.Classclass java.lang.Classclass java.lang.Classclass java.lang.Classclass java.lang.Classclass java.lang.Classclass java.lang.Classclass java.lang.Classclass java.lang.Classclass java.lang.Class" + "'", str2, "class java.lang.Classclass java.lang.Classclass java.lang.Classclass java.lang.Classclass java.lang.Classclass java.lang.Classclass java.lang.Classclass java.lang.Classclass java.lang.Classclass java.lang.Classclass java.lang.Classclass java.lang.Classclass java.lang.Classclass java.lang.Classclass java.lang.Classclass java.lang.Classclass java.lang.Classclass java.lang.Classclass java.lang.Classclass java.lang.Classclass java.lang.Classclass java.lang.Classclass java.lang.Classclass java.lang.Classclass java.lang.Classclass java.lang.Classclass java.lang.Classclass java.lang.Classclass java.lang.Classclass java.lang.Class");
    }

    @Test
    public void test08579() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08579");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphanumericSpace((java.lang.CharSequence) "rgnaluavajtutututututut");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test08580() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08580");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.repeat("irtS", 11);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "irtSirtSirtSirtSirtSirtSirtSirtSirtSirtSirtS" + "'", str2, "irtSirtSirtSirtSirtSirtSirtSirtSirtSirtSirtS");
    }

    @Test
    public void test08581() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08581");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBetween("ssalc gnirtS.gnal.avaj", "][sslC");
        org.junit.Assert.assertNull(str2);
    }

    @Test
    public void test08582() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08582");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.chomp("                       javaulangr...");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "                       javaulangr..." + "'", str1, "                       javaulangr...");
    }

    @Test
    public void test08583() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08583");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBefore("$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$", "interface java.lang.CloneableStringinterface java.io.Serializable");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$" + "'", str2, "$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$");
    }

    @Test
    public void test08584() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08584");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlpha((java.lang.CharSequence) "                                                                                                                                                                                                                                                                  GNAL.AVAJ                                                                                                                                                                                                                                                                  ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test08585() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08585");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.endsWith("... ... ... ... ... ... ... ... ", "interface java.lang.CloneableStringinterface java.io");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test08586() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08586");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripToEmpty("$         ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "$" + "'", str1, "$");
    }

    @Test
    public void test08587() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08587");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceChars("$$$$$$$$", "Java.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.lang", "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "$$$$$$$$" + "'", str3, "$$$$$$$$");
    }

    @Test
    public void test08588() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08588");
        java.lang.String str1 = org.apache.commons.lang3.ClassUtils.getPackageCanonicalName("slitUgnirtS");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
    }

    @Test
    public void test08589() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08589");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsAny("tsiLyarrA.La.lang", "444       AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test08590() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08590");
        char[] charArray9 = new char[] { ' ', ' ', '#', 'a', '4', 'a' };
        int int10 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "", charArray9);
        int int11 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "$", charArray9);
        boolean boolean12 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "gnal.aL.ArrayListgnal.aL.ArrayList", charArray9);
        org.junit.Assert.assertNotNull(charArray9);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray9), "  #a4a");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray9), "  #a4a");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray9), "[ ,  , #, a, 4, a]");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test08591() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08591");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.normalizeSpace("javal$agn");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "javal$agn" + "'", str1, "javal$agn");
    }

    @Test
    public void test08592() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08592");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.leftPad("INTERFACE JAVA.LANG.CLONEABLELANG.GNALJAVA.LANGAVAJ.GNALJAVA.LANGAVAJ.GNALJAVA.LANGAVAJ.GNALJAVA.LANGAVAJ.GNALJAVA.LANGAVAJ.GNALJAVA.LANGAVAJ.GNALJAVA.LANGAVAJ.GNALJAVA.LANGAVAJ.JAVAINTERFACE JAVA.IO.SERIALIZABLE", 666);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                                                                                                                                                                                                                                                                                                                                                                                                                                                      INTERFACE JAVA.LANG.CLONEABLELANG.GNALJAVA.LANGAVAJ.GNALJAVA.LANGAVAJ.GNALJAVA.LANGAVAJ.GNALJAVA.LANGAVAJ.GNALJAVA.LANGAVAJ.GNALJAVA.LANGAVAJ.GNALJAVA.LANGAVAJ.GNALJAVA.LANGAVAJ.JAVAINTERFACE JAVA.IO.SERIALIZABLE" + "'", str2, "                                                                                                                                                                                                                                                                                                                                                                                                                                                                      INTERFACE JAVA.LANG.CLONEABLELANG.GNALJAVA.LANGAVAJ.GNALJAVA.LANGAVAJ.GNALJAVA.LANGAVAJ.GNALJAVA.LANGAVAJ.GNALJAVA.LANGAVAJ.GNALJAVA.LANGAVAJ.GNALJAVA.LANGAVAJ.GNALJAVA.LANGAVAJ.JAVAINTERFACE JAVA.IO.SERIALIZABLE");
    }

    @Test
    public void test08593() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08593");
        int int1 = org.apache.commons.lang3.StringUtils.length((java.lang.CharSequence) "... AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA... AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA... AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA... AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA... AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA... AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA... AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA... AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA... AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA... AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 940 + "'", int1 == 940);
    }

    @Test
    public void test08594() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08594");
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.overlay("                                                                                                                                                                                                                                                                                                                                                                                                          Java.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava...                                                                                                                                                                                                                                                                                                                                                                                                           ", "u", 0, 99);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "u                                                                                                                                                                                                                                                                                                       Java.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava...                                                                                                                                                                                                                                                                                                                                                                                                           " + "'", str4, "u                                                                                                                                                                                                                                                                                                       Java.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava...                                                                                                                                                                                                                                                                                                                                                                                                           ");
    }

    @Test
    public void test08595() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08595");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.startsWith("Hi!ArrayLisaVAJ.GNALAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA       CharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterChara", "NAL.");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test08596() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08596");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.stripStart("$ $ $ $ $ $ $ $ $ $ $ $ $ $ $ $ $ $ $ $ $ $ $ $ $ $ $ $ $ $ $ $ $ $ $ $ $ $ $ $ $ $ $ $ $ $ $ $ $ $ $ $ $ $ $ $ $ $ $ $ $ $ $ $ $ $ $ $ $ $ $ $ $ $ $ $ $ $ $ $ $ $ $ $ $ $ $ $ $ $ $ $ $ $ $ $ $ $ $ $", "Arr... aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa... aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa... aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa... aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa... aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa... aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa... aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa... aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa... aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa..");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "$ $ $ $ $ $ $ $ $ $ $ $ $ $ $ $ $ $ $ $ $ $ $ $ $ $ $ $ $ $ $ $ $ $ $ $ $ $ $ $ $ $ $ $ $ $ $ $ $ $ $ $ $ $ $ $ $ $ $ $ $ $ $ $ $ $ $ $ $ $ $ $ $ $ $ $ $ $ $ $ $ $ $ $ $ $ $ $ $ $ $ $ $ $ $ $ $ $ $ $" + "'", str2, "$ $ $ $ $ $ $ $ $ $ $ $ $ $ $ $ $ $ $ $ $ $ $ $ $ $ $ $ $ $ $ $ $ $ $ $ $ $ $ $ $ $ $ $ $ $ $ $ $ $ $ $ $ $ $ $ $ $ $ $ $ $ $ $ $ $ $ $ $ $ $ $ $ $ $ $ $ $ $ $ $ $ $ $ $ $ $ $ $ $ $ $ $ $ $ $ $ $ $ $");
    }

    @Test
    public void test08597() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08597");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substring(". ", 77);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test08598() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08598");
        int int2 = org.apache.commons.lang3.StringUtils.countMatches("Javaaaaaaaaaava.langava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.lang$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$", "interface java.lang.CloneableetyBinterface java.io.Serializable");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test08599() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08599");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOf("interface java.lang.Cloneable.interface java.io.Serializable", 832);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test08600() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08600");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.uncapitalize((java.lang.CharSequence) "sTRINGuTILSsTRINGuTILSsTRINGuTILSsTRINGuTILSsTRINGuTILSsTRINGuTILSsTRINGuTILSsTRINGuTILSsTRINGuTILSsTRINGuTILS");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "sTRINGuTILSsTRINGuTILSsTRINGuTILSsTRINGuTILSsTRINGuTILSsTRINGuTILSsTRINGuTILSsTRINGuTILSsTRINGuTILSsTRINGuTILS" + "'", str1, "sTRINGuTILSsTRINGuTILSsTRINGuTILSsTRINGuTILSsTRINGuTILSsTRINGuTILSsTRINGuTILSsTRINGuTILSsTRINGuTILSsTRINGuTILS");
    }

    @Test
    public void test08601() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08601");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.leftPad("class javalangclass                       javaulang                       javaulang                       javaulang                       javaulang                       javaulang                       javaulang                       javaulang                       javaulang                       javaulang                       javaulang                       javaulang                       javaulang                       javaulang                       javaulang                       javaulang                       javaulang                       javaulang                       javaulang                       javaulang                       javaulang", 940, 'a');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaclass javalangclass                       javaulang                       javaulang                       javaulang                       javaulang                       javaulang                       javaulang                       javaulang                       javaulang                       javaulang                       javaulang                       javaulang                       javaulang                       javaulang                       javaulang                       javaulang                       javaulang                       javaulang                       javaulang                       javaulang                       javaulang" + "'", str3, "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaclass javalangclass                       javaulang                       javaulang                       javaulang                       javaulang                       javaulang                       javaulang                       javaulang                       javaulang                       javaulang                       javaulang                       javaulang                       javaulang                       javaulang                       javaulang                       javaulang                       javaulang                       javaulang                       javaulang                       javaulang                       javaulang");
    }

    @Test
    public void test08602() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08602");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.split("gnal$.$avaj", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        java.lang.String[] strArray6 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("       $", "gnalArrayListArrayListArrayListavaj.gnalArrayListArrayListArrayLi");
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.getCommonPrefix(strArray6);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str8 = org.apache.commons.lang3.StringUtils.replaceEachRepeatedly("se...", strArray3, strArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Search and Replace array lengths don't match: 4 vs 1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "       $" + "'", str7, "       $");
    }

    @Test
    public void test08603() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08603");
        java.lang.String str2 = org.apache.commons.lang3.ClassUtils.getPackageCanonicalName((java.lang.Object) 35, "$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$class javalangClass                       JAVAULANG                       JAVAULANG                       JAVAULANG                       JAVAULANG                       JAVAULANG                       JAVAULANG                       JAVAULANG                       JAVAULANG                       JAVAULANG                       JAVAULANG                       JAVAULANG                       JAVAULANG                       JAVAULANG                       JAVAULANG                       JAVAULANG                       JAVAULANG                       JAVAULANG                       JAVAULANG                       JAVAULANG                       JAVAULANG        ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "java.lang" + "'", str2, "java.lang");
    }

    @Test
    public void test08604() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08604");
        java.lang.String[] strArray5 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("JAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANG", "#                                             ", 0);
        java.lang.String[] strArray9 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("...       .", "class java.lang.String", (int) (byte) 0);
        java.lang.String str10 = org.apache.commons.lang3.StringUtils.getCommonPrefix(strArray9);
        int int11 = org.apache.commons.lang3.StringUtils.indexOfDifference((java.lang.CharSequence[]) strArray9);
        java.lang.String str12 = org.apache.commons.lang3.StringUtils.replaceEachRepeatedly("javal aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaagn", strArray5, strArray9);
        boolean boolean13 = org.apache.commons.lang3.StringUtils.startsWithAny("hi!ArrayListArrayListArrayListavaj....1AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA...1AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA...1AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA...1AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA...1AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA...1AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA...1AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA...1AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA...1AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA...1AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA", strArray9);
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertNotNull(strArray9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "...       ." + "'", str10, "...       .");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "javal aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaagn" + "'", str12, "javal aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaagn");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test08605() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08605");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.abbreviate("interface java.lang.Cloneable.......java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........javainterface java.io.Serializable", 67);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "interface java.lang.Cloneable.......java..........java............." + "'", str2, "interface java.lang.Cloneable.......java..........java.............");
    }

    @Test
    public void test08606() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08606");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator(".uti#########################################################################ava#########################################################################j", "", 102);
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void test08607() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08607");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.capitalize((java.lang.CharSequence) "lituLlituLlituLlituLlituLlituLlituLlituLlituLlituLlituLlituLlituLlituLlituLlituLlituLlituLlituLlituLlituLlituLlituLlituLlituLlituLlituLlituLlituLlituLlituLlituLlitu");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "LituLlituLlituLlituLlituLlituLlituLlituLlituLlituLlituLlituLlituLlituLlituLlituLlituLlituLlituLlituLlituLlituLlituLlituLlituLlituLlituLlituLlituLlituLlituLlituLlitu" + "'", str1, "LituLlituLlituLlituLlituLlituLlituLlituLlituLlituLlituLlituLlituLlituLlituLlituLlituLlituLlituLlituLlituLlituLlituLlituLlituLlituLlituLlituLlituLlituLlituLlituLlitu");
    }

    @Test
    public void test08608() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08608");
        java.lang.String str1 = org.apache.commons.lang3.ClassUtils.getPackageCanonicalName("                                                                                                                                                                                                                                                                  GNAL.AVAJ                                                                                                                                                                                                                                                                  ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "GNAL" + "'", str1, "GNAL");
    }

    @Test
    public void test08609() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08609");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeEnd("Aaaaaaaaaaaa                                  ", "hi!ArrayListArrayListArrayListavaj.gnalArrayListArrayListArrayListavaj.gnalArrayListArrayListArrayLi");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Aaaaaaaaaaaa                                  " + "'", str2, "Aaaaaaaaaaaa                                  ");
    }

    @Test
    public void test08610() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08610");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeEnd("                                            ...", "... java.lang.Stringclass java.lang.Stringclass...... java.lang.Stringclass java.lang.Stringclass...... java.lang.Stringclass java.lang.Stringclass...... java.lang.Stringclass java.lang.Stringclass...... java.lang.Stringclass java.lang.Stringclass...... java.lang.Stringclass java.lang.Stringclass...... java.lang.Stringclass java.lang.Stringclass...... java.lang.Stringclass java.lang.Stringclass...... java.lang.Stringclass java.lang.Stringclass...... java.lang.Stringclass java.lang.Stringclass...... java.lang.Stringclass java.lang.Stringclass...... java.lang.Stringclass java.lang.Stringclass...... java.lang.Stringclass java.lang.Stringclass...... java.lang.Stringclass java.lang.Stringclass...... java.lang.Stringclass java.lang.Stringclass...... java.lang.Stringclass java.lang.Stringclass...... java.lang.Stringclass java.lang.Stringclass...... java.lang.Stringclass java.lang.Stringcl...avaj..........avaj..........avaj");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                            ..." + "'", str2, "                                            ...");
    }

    @Test
    public void test08611() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08611");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.remove("hi!ArrayListArrayListArrayListavaj....1AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA...1AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA...1AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA...1AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA...1AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA...1AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA...1AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA...1AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA...1AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA...1AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA", "#########################################################################################yList");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!ArrayListArrayListArrayListavaj....1AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA...1AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA...1AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA...1AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA...1AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA...1AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA...1AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA...1AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA...1AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA...1AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA" + "'", str2, "hi!ArrayListArrayListArrayListavaj....1AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA...1AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA...1AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA...1AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA...1AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA...1AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA...1AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA...1AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA...1AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA...1AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA");
    }

    @Test
    public void test08612() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08612");
        int int1 = org.apache.commons.lang3.StringUtils.length((java.lang.CharSequence) "JAVA");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
    }

    @Test
    public void test08613() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08613");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOf("", "-1java.utilString[]");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test08614() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08614");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.strip("...O.gnal.avaj ssalcr4444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444..........");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "...O.gnal.avaj ssalcr4444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444.........." + "'", str1, "...O.gnal.avaj ssalcr4444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444..........");
    }

    @Test
    public void test08615() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08615");
        java.lang.String str2 = org.apache.commons.lang3.ClassUtils.getShortCanonicalName((java.lang.Object) 173, "Javaaaaaaaaaava.langava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.lang");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Integer" + "'", str2, "Integer");
    }

    @Test
    public void test08616() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08616");
        java.util.Locale locale1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.apache.commons.lang3.StringUtils.lowerCase("Stringc", locale1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test08617() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08617");
        java.util.Locale locale1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.apache.commons.lang3.StringUtils.lowerCase("Short", locale1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test08618() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08618");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitByCharacterTypeCamelCase("...       aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        java.lang.String str3 = org.apache.commons.lang3.ClassUtils.getPackageName((java.lang.Object) "...       aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "interface java.lang.Cloneablegnal.avajgnal..LANGgnal.avajgnal.interface java.io.Serializable");
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "java.lang" + "'", str3, "java.lang");
    }

    @Test
    public void test08619() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08619");
        java.lang.CharSequence charSequence0 = null;
        int int2 = org.apache.commons.lang3.StringUtils.indexOfAny(charSequence0, "Arrclass java......................");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test08620() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08620");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass1 = org.apache.commons.lang3.ClassUtils.getClass("lang");
            org.junit.Assert.fail("Expected exception of type java.lang.ClassNotFoundException; message: lang");
        } catch (java.lang.ClassNotFoundException e) {
            // Expected exception.
        }
    }

    @Test
    public void test08621() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08621");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsAny("... AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA... AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA... AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA... AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA... AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA... AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA... AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA... AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA... AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA... AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA", "gnalarraylistarraylistarrayli");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test08622() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08622");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.strip("                                 ...", "gnalarraylistarraylistarrayli");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                 ..." + "'", str2, "                                 ...");
    }

    @Test
    public void test08623() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08623");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlpha((java.lang.CharSequence) "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                             ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test08624() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08624");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.startsWith("4444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444AAAAAAAAAA", "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                       CLASSJAVA.LANGAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAULANG");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test08625() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08625");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.difference("$         44444444444444444444444444444444444444444444444444444444444444444444444444444444", "aaaaaaaaaa...aaaa");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "aaaaaaaaaa...aaaa" + "'", str2, "aaaaaaaaaa...aaaa");
    }

    @Test
    public void test08626() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08626");
        java.lang.Object[] objArray0 = null;
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.join(objArray0, "              Llitu               ");
        org.junit.Assert.assertNull(str2);
    }

    @Test
    public void test08627() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08627");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.startsWith("GN                                            ", "aa...");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test08628() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08628");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphanumeric((java.lang.CharSequence) "GNAL.AVAJGNAL.AVAJGNAL.AVAJGNAL.AVAJGNAL.AVAJGNAL.AVAJGNAL.AVAJ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test08629() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08629");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isBlank((java.lang.CharSequence) "javaStrinSerializableSerializableSerializableSeriali");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test08630() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08630");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.reverse("class java.lang.Class");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "ssalC.gnal.avaj ssalc" + "'", str1, "ssalC.gnal.avaj ssalc");
    }

    @Test
    public void test08631() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08631");
        java.util.Locale locale1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.apache.commons.lang3.StringUtils.lowerCase("JAVA.LITU.AVAJLITU.AVAJJAVA.LITU.AVAJLITU.AVAJJAVA.LITU.AVAJLITU.AVAJJAVA.LITU.AVAJLITU.AVAJJAVA.LITU.AVAJLITU.AVAJJAVA.LITU.AVAJLITU.AVAJJAVA.LITU.AVAJLITU.AVAJJAVA.LITU.AVAJLITU.AVAJJAVA.LITU.AVAJLITU.AVAJJAVA.LITU.AVAJLITU.AVAJJAVA.LITU.AVAJLITU.AVAJJAVA.LITU.AVAJLITU.AVAJJAVA.LITU.AVAJLITU.AVAJJAVA.LITU.AVAJLITU.AVAJJAVA.LITU.AVAJLITU.AVAJJAVA.LITU.AVAJLITU.AVAJJAVA.LITU.AVAJLITU.AVAJJAVA.LITU.AVAJLITU.AVAJJAVA.LITU.AVAJLITU.AVAJJAVA.LITU.AVAJLITU.AVAJJAVA.LITU.AVAJLITU.AVAJJAVA.LITU.AVAJLITU.AVAJJAVA.LITU.AVAJLITU.AVAJJAVA.LITU.AVAJLITU.AVAJJAVA.LITU.AVAJLITU.AVAJJAVA.LITU.AVAJLITU.AVAJJAVA.LITU.AVAJLITU.AVAJJAVA.LITU.AVAJLITU.AVAJJAVA.LITU.AVAJLITU.AVAJJAVA.LITU.AVAJLITU.AVAJJAVA.LITU.AVAJLITU.AVAJJAVA.LITU.AVAJLITU.AVAJJAVA.LITU.AVAJLITU.AVAJ", locale1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test08632() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08632");
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("-1java.utilString[]    ", "avaj", 89);
        java.lang.String[] strArray5 = org.apache.commons.lang3.StringUtils.stripAll(strArray4);
        boolean boolean6 = org.apache.commons.lang3.StringUtils.endsWithAny("aaaaaaaaaaaa                                  ", strArray5);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test08633() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08633");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.endsWith("... AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA... AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA... AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA... AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA... AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA... AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA... AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA... AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA... AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA... AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA", "-1java");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test08634() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08634");
        java.lang.String str1 = org.apache.commons.lang3.ClassUtils.getShortCanonicalName("ARJAVAARRARJAVAARRARJAVAARRARJAVAARRARJAVAARRARJAVAARRARJAVAARRARJAVAARRARJAVAARRARJAVAARRARJAVAARRARJAVAARRARJAVAARRARJAVAARRARJAVAARRARJAVAARRARJAVAARRARJAVAARRARJAVAARRARJAVAARRARJAVAARRARJAVAARRARJAVAARRARJAVAARRARJAVAARRARJAVAARRARJAVAARRARJAVAARRARJAVAARRARJAVAARRARJAVAARRARJAVAARRARJAVAARRARJAVAARRARJAVAARRARJAVAARRARJAVAARRARJAVAARRARJAVAARRARJAVAARRARJAVAARRARJAVAARRARJAVAARRARJAVAARRARJAVAARRARJAVAARRARJAVAARRARJAVAARRARJAVAARRARJAVAARRARJAVAARRARJAVAARRARJAlass java.lang.String");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "String" + "'", str1, "String");
    }

    @Test
    public void test08635() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08635");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAllUpperCase((java.lang.CharSequence) "aaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test08636() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08636");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOf("VAARRARJAVAARRARJAVAARRARJAVAARRARJAVAARRARJAVAARRARJAVAARRARJAVAARRARJAVAARRARJAVAARRARJAVAARRARJAVAARRARJAVAARRARJAVAARRARJAVAARRARJAVAARRARJAVAARRARJAVAARRARJAVAARRARJAVAARRARJAVAARRARJAVAARRARJAVAARRARJAVAARRARJAVAARRARJAVAARRARJAVAARRARJAVAARRARJAVAARRARJAVAARRARJAVAARRARJAVAARRARJAVAARRARJAVAARRARJAVAARRARJAVAARRARJAVAARRARJAVAARRARJAVAARRARJAVAARRARJAVAARRARJAVAARRARJAVAARRARJAVAARRARJAVAARRARJAVAARRARJAVAARRARJAVAARRARJAlass java.lang.String", 15);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test08637() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08637");
        int int3 = org.apache.commons.lang3.StringUtils.indexOfIgnoreCase("44444444444444444.444444444444444444...                                 ", "iSerializabl...     java", 97);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test08638() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08638");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBeforeLast("444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444litu.avajlitu", "t");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444litu.avajli" + "'", str2, "444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444litu.avajli");
    }

    @Test
    public void test08639() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08639");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.difference("                       javaulangrraylist", "aaaaaa...");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "aaaaaa..." + "'", str2, "aaaaaa...");
    }

    @Test
    public void test08640() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08640");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "... ... ... ... ... ... ... ... ... ...", "hi!ArrayListArrayListArrayListavaj....1AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA...1AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA...1AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA...1AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA...1AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA...1AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA...1AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA...1AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA...1AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAJava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.lang");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test08641() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08641");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceOnce("... ... ... ... ... ... ... ... ... ...", "", "4444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444..........");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "... ... ... ... ... ... ... ... ... ..." + "'", str3, "... ... ... ... ... ... ... ... ... ...");
    }

    @Test
    public void test08642() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08642");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeStart("avaj ssalc", "Java.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "avaj ssalc" + "'", str2, "avaj ssalc");
    }

    @Test
    public void test08643() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08643");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringAfter("AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA... AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA... AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA... AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA... AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA... AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA... AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA... AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA... AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA... ...", "4444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test08644() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08644");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripToEmpty("JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA" + "'", str1, "JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA");
    }

    @Test
    public void test08645() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08645");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.split("ArrayLis", ".. u");
        java.lang.String[] strArray7 = org.apache.commons.lang3.StringUtils.split("$         $         $         $         $         $         $         $         $         $         $         $         $         $         $         $         $         $         $         $         $         $         $         $         $         $         $         $         $         $         $         $         $         $         $         $         ", "Sho$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$rrayList$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$t");
        boolean boolean8 = org.apache.commons.lang3.StringUtils.endsWithAny("ArrayListArrayListArrayListavajGNAL.AVAJLANG.JAVAGNAL.AVAJLANG.JAVAGNAL.AVAJLANG.JAVAGNAL.AVAJLANG.JAVAGNAL.AVAJLANG.JAVAGNAL.AVAJLANG.JAVAGNAL.AVAJLANG.JAVAGNAL.AVAJLANG.JAVAGNAL.AVAJgnal", strArray7);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str9 = org.apache.commons.lang3.StringUtils.replaceEachRepeatedly("class", strArray3, strArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Search and Replace array lengths don't match: 1 vs 36");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test08646() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08646");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.substringsBetween(".uti#########################################################################ava#########################################################################j", "tring", "class java.lang.Class");
        org.junit.Assert.assertNull(strArray3);
    }

    @Test
    public void test08647() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08647");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceChars("SERIALIZABL...     JAVA44444444444444444.4444", 'a', '$');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "SERIALIZABL...     JAVA44444444444444444.4444" + "'", str3, "SERIALIZABL...     JAVA44444444444444444.4444");
    }

    @Test
    public void test08648() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08648");
        char[] charArray1 = null;
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "Array", charArray1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test08649() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08649");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.stripEnd("TRING", "stringnlrrylistrrylistrrylistvj");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "TRING" + "'", str2, "TRING");
    }

    @Test
    public void test08650() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08650");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.endsWithIgnoreCase("class java.lang.Class                       JAVAULANG                       JAVAULANG                       JAVAULANG                       JAVAULANG                       JAVAULANG                       JAVAULANG                       JAVAULANG                       JAVAULANG                       JAVAULANG                       JAVAULANG                       JAVAULANG                       JAVAULANG                       JAVAULANG                       JAVAULANG                       JAVAULANG                       JAVAULANG                       JAVAULANG                       JAVAULANG                       JAVAULANG                       JAVAULANG        ", "AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA...");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test08651() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08651");
        int int2 = org.apache.commons.lang3.StringUtils.indexOf(".       .       .       .       .       .       .       .       .       .       .       .       .       .       .       .       .       .       .       .       .       .       .       .       .       .       .       .       .       .       .       .       .       .       .       .       .       .       .       .       .       .       .       .       .       .       .       .       .       .       .       .       .       .       .       .       .       .       .       .       .       .       .       .       .       .       .       .       .       .       .       .       .       .       .       .       .       .       .       .       .       .       .       .       .       .       .       .       .       .       .       .       .       .       .       .       .       .       .       .       ", 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test08652() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08652");
        int int2 = org.apache.commons.lang3.StringUtils.indexOf("444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444litu.avajlitu", "interfac                                    ");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test08653() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08653");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.startsWith("u                                                                                                                                                                                                                                                                                                       Java.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava...                                                                                                                                                                                                                                                                                                                                                                                                           ", "#########################################################################################yList");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test08654() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08654");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass1 = org.apache.commons.lang3.ClassUtils.getClass("gnaaaaaa...aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
            org.junit.Assert.fail("Expected exception of type java.lang.ClassNotFoundException; message: gnaaaaaa///aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        } catch (java.lang.ClassNotFoundException e) {
            // Expected exception.
        }
    }

    @Test
    public void test08655() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08655");
        java.lang.ClassLoader classLoader0 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass2 = org.apache.commons.lang3.ClassUtils.getClass(classLoader0, "va.langGNAL..langjava.langAGNAL.AVAJ");
            org.junit.Assert.fail("Expected exception of type java.lang.ClassNotFoundException; message: va/langGNAL//langjava/langAGNAL/AVAJ");
        } catch (java.lang.ClassNotFoundException e) {
            // Expected exception.
        }
    }

    @Test
    public void test08656() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08656");
        int int2 = org.apache.commons.lang3.StringUtils.indexOf("", (int) (short) -1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test08657() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08657");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("...$$$$$$$$$$$$$$$...", "string.");
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test08658() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08658");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("NTERFACE JAVA.LANG.cLONEABLE.......JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVAINTERFACE JAVA.IO.sERIALIZABLE");
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test08659() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08659");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "       aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "ARR... AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA... AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA... AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA... AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA... AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA... AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA... AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA... AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA... AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA... AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAYLIST");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test08660() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08660");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOf("SERIALIZABLE", 493, 3);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test08661() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08661");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBeforeLast("tsilyarrgnaluavaj                       tsilyarrgnaluavaj", "Arralitu.avajlitu.ava");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "tsilyarrgnaluavaj                       tsilyarrgnaluavaj" + "'", str2, "tsilyarrgnaluavaj                       tsilyarrgnaluavaj");
    }

    @Test
    public void test08662() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08662");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeStart("444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa       444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444", "i4elbaenolC.gnal.avaj ecafretniTRINGi4elbaenolC.gnal.avaj ecafretni");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa       444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444" + "'", str2, "444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa       444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444");
    }

    @Test
    public void test08663() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08663");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "javal$agnjaval$agnjaval$agnjaval$agnjaval$agnjaval$agnjaval$agnjaval$agnjaval$agnjaval$agnjaval$agnjaval$agnjaval$agnjaval$agnjaval$agnjaval$agnjaval$agnjaval$agnjaval$agnjaval$agnjaval$agnjaval$agnjaval$agnjaval$agnjaval$agnjaval$agnjaval$agnjaval$agnjaval$agnjaval$agnjaval$agnjaval$agnjaval$agnjaval$agnjaval$agnjaval$agnjaval$agnjaval$agnjaval$agnjaval$agnjaval$agnjaval$agnjaval$agnjaval$agnjaval$agnjaval$agnjaval$agnjaval$agnjaval$agnjaval$agnjaval$agnjaval$agnjaval$agnjaval$agnjaval$agnjaval$agnjaval$agnjaval$agnjaval$agnjaval$agnjaval$agnjaval$agnjaval$agnjaval$agn", "...O.gnal.avaj ssalcr4444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444..........");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test08664() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08664");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.leftPad("       $                                                                                            ", 29, "gnlrrylistrrylistrryl");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "       $                                                                                            " + "'", str3, "       $                                                                                            ");
    }

    @Test
    public void test08665() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08665");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.substringBetween("LA", "                                              INTEGE                                               ", "JAVALITU");
        org.junit.Assert.assertNull(str3);
    }

    @Test
    public void test08666() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08666");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceOnce("GNALaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaagn                                            ", "", "L.Arr#yListgnaljava..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java.........");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "GNALaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaagn                                            " + "'", str3, "GNALaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaagn                                            ");
    }

    @Test
    public void test08667() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08667");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBetween("#########", "#####A##ayL#A#################################aaaaaaaaaa");
        org.junit.Assert.assertNull(str2);
    }

    @Test
    public void test08668() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08668");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNumericSpace((java.lang.CharSequence) "A..ayL A.");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test08669() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08669");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.split("interface java.lang.Cloneable.######################################################################interface java.io.Serializable", "String.");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str6 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray2, "rrayListrrayListrrayListrrayListrrayListrrayListrrayListrrayListrrayListrr...    ...rrayListrrayListrrayListrrayListrrayListrrayListrrayListrrayListrrayListrra", 159, 493);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 159");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test08670() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08670");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.rightPad("aaaaaa...", 943, "interface java.lang.Cloneable.......java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........javainterface java.io.Serializable");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "aaaaaa...interface java.lang.Cloneable.......java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........javainterface java.io.Serializableinterface java.lang.Cloneable.......java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........ja" + "'", str3, "aaaaaa...interface java.lang.Cloneable.......java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........javainterface java.io.Serializableinterface java.lang.Cloneable.......java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........ja");
    }

    @Test
    public void test08671() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08671");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isBlank((java.lang.CharSequence) "jvstringnlrrylistrrylistrrylistv");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test08672() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08672");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.remove("...................................................................", '$');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "..................................................................." + "'", str2, "...................................................................");
    }

    @Test
    public void test08673() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08673");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringAfter("..$$$$$$$$$$$$$$$$$$$$$$$$$$$$$.....", "..$$$$$$$$$$$$$$$$$$$$$$$$$$$$$.....");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test08674() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08674");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.abbreviate("JAVA.UTILJAVA.UTILJAVA.UTILJAVA.UTILJAVA.UTILJAVA.UTILJAVA.UTILJAVA.UTILJAVA.UTILJAVA.UTILJAVA.UTILJAVA.UTILJAVA.UTILJAVA.UTILJAVA.UTILJAVA.UTILJAVA.UTILJAVA.UTILJAVA.UTILJAVA.UTILJAVA.UTILJAVA.UTILJAVA.UTILJAVA.UTILJAVA.UTILJAVA.UTILJAVA.UTILJAVA.UTILJAVA.UTILJAVA.UTILJAVA.UTILJAVA.UTIL", (int) '4', 940);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "JAVA.UTILJAVA.UTILJAVA.UTILJAVA.UTILJAVA.UTILJAVA.UTILJAVA.UTILJAVA.UTILJAVA.UTILJAVA.UTILJAVA.UTILJAVA.UTILJAVA.UTILJAVA.UTILJAVA.UTILJAVA.UTILJAVA.UTILJAVA.UTILJAVA.UTILJAVA.UTILJAVA.UTILJAVA.UTILJAVA.UTILJAVA.UTILJAVA.UTILJAVA.UTILJAVA.UTILJAVA.UTILJAVA.UTILJAVA.UTILJAVA.UTILJAVA.UTIL" + "'", str3, "JAVA.UTILJAVA.UTILJAVA.UTILJAVA.UTILJAVA.UTILJAVA.UTILJAVA.UTILJAVA.UTILJAVA.UTILJAVA.UTILJAVA.UTILJAVA.UTILJAVA.UTILJAVA.UTILJAVA.UTILJAVA.UTILJAVA.UTILJAVA.UTILJAVA.UTILJAVA.UTILJAVA.UTILJAVA.UTILJAVA.UTILJAVA.UTILJAVA.UTILJAVA.UTILJAVA.UTILJAVA.UTILJAVA.UTILJAVA.UTILJAVA.UTILJAVA.UTIL");
    }

    @Test
    public void test08675() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08675");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAllLowerCase((java.lang.CharSequence) "-1java");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test08676() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08676");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNumericSpace((java.lang.CharSequence) "irfCo$irfioSrA..ayL A.444444444444444444444444444");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test08677() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08677");
        java.lang.String str2 = org.apache.commons.lang3.ClassUtils.getShortCanonicalName((java.lang.Object) "avaJ", "javastringnalarraylistarraylistarraylistavaj");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "String" + "'", str2, "String");
    }

    @Test
    public void test08678() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08678");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.equalsIgnoreCase("4444444string.44444444", "avaj.gnalnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test08679() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08679");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfIgnoreCase("lang", "                                                                                                                                                      ...");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test08680() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08680");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.endsWithIgnoreCase("Arrclas...", "AAAAAAAAAAAAAAAAAAA      ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test08681() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08681");
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
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str45 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) wildcardClassArray29, '.', (int) (byte) -1, 18);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
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
    }

    @Test
    public void test08682() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08682");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceChars("", "class java.lang.Classclass java.lang.Classclass java.lang.Classclass java.lang.Classclass java.lang.Classclass java.lang.Classclass java.lang.Classclass java.lang.Classclass java.lang.Classclass java.lang.Classclass java.lang.Classclass java.lang.Classclass java.lang.Classclass java.lang.Classclass java.lang.Classclass java.lang.Classclass java.lang.Classclass java.lang.Classclass java.lang.Classclass java.lang.Classclass java.lang.Classclass java.lang.Classclass java.lang.Classclass java.lang.Classclass java.lang.Classclass java.lang.Classclass java.lang.Classclass java.lang.Classclass java.lang.Classclass java.lang.Class", "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test08683() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08683");
        int int3 = org.apache.commons.lang3.StringUtils.lastOrdinalIndexOf("IRFCO.IRFIOSRIIZ", "jAVA.L$Arra", 35);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test08684() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08684");
        char[] charArray11 = new char[] { ' ', ' ', '#', 'a', '4', 'a' };
        int int12 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "", charArray11);
        int int13 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "JAVAULANG", charArray11);
        int int14 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "JAVA.UTIL", charArray11);
        int int15 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "                      Integer                       ", charArray11);
        int int16 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "                      Integer                       ", charArray11);
        org.junit.Assert.assertNotNull(charArray11);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray11), "  #a4a");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray11), "  #a4a");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray11), "[ ,  , #, a, 4, a]");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 22 + "'", int16 == 22);
    }

    @Test
    public void test08685() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08685");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("interface java.lang.cloneable.......java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........javainterface java.io.serializable", "avaj.gnalnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAA", 1);
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void test08686() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08686");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.split("interface java.lang.CloneableINTERFACE JAVA.LANG.CLONEABLELANG.GNALJAVA.LANGAVAJ.GNALJAVA.LANGAVAJ.GNALJAVA.LANGAVAJ.GNALJAVA.LANGAVAJ.GNALJAVA.LANGAVAJ.GNALJAVA.LANGAVAJ.GNALJAVA.LANGAVAJ.GNALJAVA.LANGAVAJ.JAVAINTERFACE JAVA.IO.SERIALIZABLEinterface java.io.Serializable", "StringUtilsStringUtilsStringUtilsStringUtilsStringUtilsStringUtilsStringUtilsStringUtilsStringUtilsStringUtils");
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test08687() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08687");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.abbreviate("t", 35, (int) '.');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "t" + "'", str3, "t");
    }

    @Test
    public void test08688() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08688");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.defaultString("interface java.lang.Cloneable.......java.......Objectava..........javainterface java.io.Serializable", "4v4jgn4l");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "interface java.lang.Cloneable.......java.......Objectava..........javainterface java.io.Serializable" + "'", str2, "interface java.lang.Cloneable.......java.......Objectava..........javainterface java.io.Serializable");
    }

    @Test
    public void test08689() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08689");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.split("java.lang$interface java.lang.Cloneable$interface java.io.Serializableinterface java.lang.Cloneable$interface java.io.Serializableinterface java.lang.Cl", "javal$agn", 153);
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void test08690() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08690");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeStartIgnoreCase("444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa       444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444", "44444444444444444444444444444444444444444444444444444444444444444444444javaulang44444444444444444");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa       444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444" + "'", str2, "444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa       444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444");
    }

    @Test
    public void test08691() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08691");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replace("..............................", "lang", "-1java.utilString[]");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + ".............................." + "'", str3, "..............................");
    }

    @Test
    public void test08692() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08692");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeEnd("ARJAVAARR", "gnal.avajgnal..LANGgnal.avajgnal");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "ARJAVAARR" + "'", str2, "ARJAVAARR");
    }

    @Test
    public void test08693() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08693");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.remove("444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444litu.avajlitu.avaj", ' ');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444litu.avajlitu.avaj" + "'", str2, "444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444litu.avajlitu.avaj");
    }

    @Test
    public void test08694() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08694");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass2 = org.apache.commons.lang3.ClassUtils.getClass("... AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA... AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA... AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA... AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA... AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA... AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA... AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA... AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA... AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA... AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA", false);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassNotFoundException; message: ///AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA///AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA///AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA///AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA///AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA///AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA///AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA///AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA///AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA///AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA");
        } catch (java.lang.ClassNotFoundException e) {
            // Expected exception.
        }
    }

    @Test
    public void test08695() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08695");
        int int3 = org.apache.commons.lang3.StringUtils.indexOf("ArrayListArrayListArrayListavajagnal", "aaaaaaaaaa", 423);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test08696() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08696");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.chop("NTERFACEJAVA.LANG.cLONEABLE.......JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVAINTERFACEJAVA.IO.sERIALIZABLE");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "NTERFACEJAVA.LANG.cLONEABLE.......JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVAINTERFACEJAVA.IO.sERIALIZABL" + "'", str1, "NTERFACEJAVA.LANG.cLONEABLE.......JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVAINTERFACEJAVA.IO.sERIALIZABL");
    }

    @Test
    public void test08697() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08697");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeStart("string.", "....................................................................................................");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "string." + "'", str2, "string.");
    }

    @Test
    public void test08698() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08698");
        java.lang.String str1 = org.apache.commons.lang3.ClassUtils.getPackageCanonicalName(".............java..........java..........java..........java..........java..........java..........java..........java..........java..........java...........");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + ".............java..........java..........java..........java..........java..........java..........java..........java..........java..........java.........." + "'", str1, ".............java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........");
    }

    @Test
    public void test08699() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08699");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.startsWith("...nAAA", "interface java.lang.Cloneable$interface java.io.Serializable");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test08700() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08700");
        java.lang.String str1 = org.apache.commons.lang3.ClassUtils.getShortCanonicalName("i4elbaenolC.gnal.avaj ecafretniTRINGi4elbaenolC.gnal.avaj ecaf");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "avajecaf" + "'", str1, "avajecaf");
    }

    @Test
    public void test08701() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08701");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBetween("$#######$########", "iNTEGER");
        org.junit.Assert.assertNull(str2);
    }

    @Test
    public void test08702() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08702");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.chop("irfCo$irfioSriiz");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "irfCo$irfioSrii" + "'", str1, "irfCo$irfioSrii");
    }

    @Test
    public void test08703() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08703");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trimToNull("Javaaaaaaaaaava.langava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.lang");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Javaaaaaaaaaava.langava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.lang" + "'", str1, "Javaaaaaaaaaava.langava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.lang");
    }

    @Test
    public void test08704() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08704");
        java.util.Locale locale1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.apache.commons.lang3.StringUtils.upperCase("                                  Arrclass java.lang.ObjectyList                                   ", locale1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test08705() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08705");
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
        java.lang.Class<?> wildcardClass21 = null;
        java.lang.Class[] classArray23 = new java.lang.Class[1];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray24 = (java.lang.Class<?>[]) classArray23;
        wildcardClassArray24[0] = wildcardClass21;
        java.lang.Class<?>[] wildcardClassArray27 = org.apache.commons.lang3.ClassUtils.primitivesToWrappers(wildcardClassArray24);
        boolean boolean29 = org.apache.commons.lang3.ClassUtils.isAssignable(wildcardClassArray14, wildcardClassArray24, false);
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
        boolean boolean42 = org.apache.commons.lang3.ClassUtils.isAssignable(wildcardClassArray14, wildcardClassArray33);
        java.lang.String[] strArray47 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("...", "avaj.gnal", (int) 'a');
        boolean boolean48 = org.apache.commons.lang3.StringUtils.startsWithAny("", strArray47);
        java.lang.Class<?>[] wildcardClassArray49 = org.apache.commons.lang3.ClassUtils.toClass((java.lang.Object[]) strArray47);
        boolean boolean50 = org.apache.commons.lang3.ClassUtils.isAssignable(wildcardClassArray14, wildcardClassArray49);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str54 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) wildcardClassArray14, "aaaaaaaaaaaaaaaaaaaaaaaJAVAULANG", 832, 940);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 832");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
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
        org.junit.Assert.assertNotNull(classArray23);
        org.junit.Assert.assertNotNull(wildcardClassArray24);
        org.junit.Assert.assertNotNull(wildcardClassArray27);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNotNull(strArray31);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "                                   " + "'", str32, "                                   ");
        org.junit.Assert.assertNotNull(wildcardClassArray33);
        org.junit.Assert.assertNotNull(classArray36);
        org.junit.Assert.assertNotNull(wildcardClassArray37);
        org.junit.Assert.assertNotNull(wildcardClassArray40);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + true + "'", boolean42 == true);
        org.junit.Assert.assertNotNull(strArray47);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertNotNull(wildcardClassArray49);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + true + "'", boolean50 == true);
    }

    @Test
    public void test08706() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08706");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.leftPad("Javaaaaaaaaaava.langava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.lang$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$", 666);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                                                                                                                                                             Javaaaaaaaaaava.langava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.lang$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$" + "'", str2, "                                                                                                                                                                             Javaaaaaaaaaava.langava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.lang$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$");
    }

    @Test
    public void test08707() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08707");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("", "litu.avaj");
        java.lang.String str6 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray2, 'a', 942, 45);
        java.lang.String str10 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray2, "vaj.gnaljava.langavaj.gnaljava.langavaj.gnaljava.langavaj.gnaljava.langavaj.gnaljava.langavaj.gnaljava.lang", 525, 96);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void test08708() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08708");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNotBlank((java.lang.CharSequence) "Serializabl...     java44444444444444444.4444");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test08709() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08709");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.strip("Arrclas...");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Arrclas..." + "'", str1, "Arrclas...");
    }

    @Test
    public void test08710() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08710");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.difference("                             ...aaaaaaaaaaaaaaaaaaaaaaaaaa...                              ", "       $                                                                                            ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "$                                                                                            " + "'", str2, "$                                                                                            ");
    }

    @Test
    public void test08711() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08711");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.remove("... ... ... ... ... ... ... ... ", 'a');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "... ... ... ... ... ... ... ... " + "'", str2, "... ... ... ... ... ... ... ... ");
    }

    @Test
    public void test08712() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08712");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.contains("       444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444", "GNAL.AVAJ ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test08713() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08713");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOf("interface#java.lang.Cloneable4interface#java.io.Serializableinterface#java.lang.Cloneable4interface#java.io.Serializableinterface#java.lang.Cloneable4interface#java.io.Serializableinterface#java.lang.Cloneable4interface#java.io.Serializableinterface#java.lang.Cloneable4interface#java.io.Serializableinterface#java.lang.Cloneable4interface#java.io.Serializableinterface#java.lang.Cloneable4interface#java.io.Serializableaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", 942);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test08714() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08714");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.remove("][ssalC", '.');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "][ssalC" + "'", str2, "][ssalC");
    }

    @Test
    public void test08715() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08715");
        java.lang.String str1 = org.apache.commons.lang3.ClassUtils.getShortCanonicalName("Arrclass java......................Arrclass java......................ArtringArrclass java......................Arrclass java......................Ar");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Ar" + "'", str1, "Ar");
    }

    @Test
    public void test08716() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08716");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "$       ", "String[]");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test08717() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08717");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfDifference((java.lang.CharSequence) "avajssalcrrAtsiLytcejb", (java.lang.CharSequence) "                                  Arrclass java.lang.ObjectyList                                   ");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test08718() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08718");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsIgnoreCase("A..yL A.44444444444444444444444444", "A..yL A.44444444444444444444444444");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test08719() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08719");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAsciiPrintable((java.lang.CharSequence) "interface java.lang.Cloneable4interface java.io.Serializabl");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test08720() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08720");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("                                                                                                                                                                                                                                                                                                                                                                                                                                JAVA.LANGAgnal.avajgnal..LANGgnal.avArrclass java.lang.ObjectyListArrclass java.lang.ObjectyListA                                                                                                                                                                                                                                                                                                                                                                                                                                ", "ArrayListArrayListArrayListavaj.gnal", 64);
        int int4 = org.apache.commons.lang3.StringUtils.indexOfDifference((java.lang.CharSequence[]) strArray3);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
    }

    @Test
    public void test08721() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08721");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("... AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA... AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA... AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA... AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA... AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA... AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA... AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA... AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA... AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA... AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA", "NAL....................", 102);
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray3, 'a', 94, 0);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
    }

    @Test
    public void test08722() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08722");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.left("interface java.lang.cloneable.......java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........javainterface java.io.serializable", 34);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "interface java.lang.cloneable....." + "'", str2, "interface java.lang.cloneable.....");
    }

    @Test
    public void test08723() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08723");
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("       AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA", "STRING", 12);
        java.lang.String str6 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray4, "JAVA");
        boolean boolean7 = org.apache.commons.lang3.StringUtils.startsWithAny("Arra", strArray4);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "       AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA" + "'", str6, "       AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test08724() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08724");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripAccents((java.lang.CharSequence) "Java.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Java.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava" + "'", str1, "Java.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava");
    }

    @Test
    public void test08725() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08725");
        int int2 = org.apache.commons.lang3.StringUtils.indexOf("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaylist", 94);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test08726() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08726");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.strip("JAVAJAVAJAVAJAVAJAVAJAVAJAVAJAVAJAVAJAVAJAVAJAVAJAVAJAVAJAVAJAVAJAVAJAVAJAVAJAVAJAVAJAVAJAVAJAVAJAVAJAVAJAVAJAVAJAVAJAVAJAVAJAVAJAVAJAVA");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "JAVAJAVAJAVAJAVAJAVAJAVAJAVAJAVAJAVAJAVAJAVAJAVAJAVAJAVAJAVAJAVAJAVAJAVAJAVAJAVAJAVAJAVAJAVAJAVAJAVAJAVAJAVAJAVAJAVAJAVAJAVAJAVAJAVAJAVA" + "'", str1, "JAVAJAVAJAVAJAVAJAVAJAVAJAVAJAVAJAVAJAVAJAVAJAVAJAVAJAVAJAVAJAVAJAVAJAVAJAVAJAVAJAVAJAVAJAVAJAVAJAVAJAVAJAVAJAVAJAVAJAVAJAVAJAVAJAVAJAVA");
    }

    @Test
    public void test08727() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08727");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.deleteWhitespace("interface java.lang.CloneableJAVAinterface java.io.Serializable");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "interfacejava.lang.CloneableJAVAinterfacejava.io.Serializable" + "'", str1, "interfacejava.lang.CloneableJAVAinterfacejava.io.Serializable");
    }

    @Test
    public void test08728() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08728");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.chomp("#########################################################...");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "#########################################################..." + "'", str1, "#########################################################...");
    }

    @Test
    public void test08729() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08729");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByCharacterType("... AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA... AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA... AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA... AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA... AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA... AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA... AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA... AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA... AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA... AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA");
        java.lang.String[] strArray5 = org.apache.commons.lang3.StringUtils.stripAll(strArray3, "JAVA");
        java.lang.Class<?>[] wildcardClassArray6 = org.apache.commons.lang3.ClassUtils.toClass((java.lang.Object[]) strArray3);
        int int7 = org.apache.commons.lang3.StringUtils.indexOfAny(".LANG.LANG.LANG.LANG.LLITU", strArray3);
        boolean boolean8 = org.apache.commons.lang3.StringUtils.startsWithAny("", strArray3);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertNotNull(wildcardClassArray6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test08730() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08730");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("                  ...                         ", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", 832);
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void test08731() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08731");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOf("#########################################################################java.uti#########################################################################", 788, 28);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test08732() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08732");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.difference("", "interface java.lang.Cloneable...                                 interface java.io.Serializable");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "interface java.lang.Cloneable...                                 interface java.io.Serializable" + "'", str2, "interface java.lang.Cloneable...                                 interface java.io.Serializable");
    }

    @Test
    public void test08733() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08733");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBeforeLast("gn lu v j                       ....................................................................", "VAJ.GNALJAVA.LANGAVAJ.GNALJAVA.LANGAVAJ.GNALJAVA.LANGAVAJ.GNALJAVA.LANGAVAJ.GNALJAVA.LANGAVAJ.GNALJAVA.LANG");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "gn lu v j                       ...................................................................." + "'", str2, "gn lu v j                       ....................................................................");
    }

    @Test
    public void test08734() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08734");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replace("String", "gnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnal.LANG.LANG.LANG.LANG.LANG.LANG.Llituava", "                           rraylist                            rraylist                            rraylist                            rray$arraylis");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "String" + "'", str3, "String");
    }

    @Test
    public void test08735() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08735");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.startsWith("JavastringslitUgnirtSarraylistarraylistavaj.gnalarraylistarraylistarrayli", "CLASS JAVALANGCLASS                       JAVAULANG                       JAVAULANG                       JAVAULANG                       JAVAULANG                       JAVAULANG                       JAVAULANG                       JAVAULANG                       JAVAULANG                       JAVAULANG                       JAVAULANG                       JAVAULANG                       JAVAULANG                       JAVAULANG                       JAVAULANG                       JAVAULANG                       JAVAULANG                       JAVAULANG                       JAVAULANG                       JAVAULANG                       JAVAULANG        ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test08736() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08736");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trim("ARRYLIST");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "ARRYLIST" + "'", str1, "ARRYLIST");
    }

    @Test
    public void test08737() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08737");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAsciiPrintable((java.lang.CharSequence) "INTEGER");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test08738() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08738");
        java.lang.CharSequence charSequence1 = null;
        char[] charArray14 = new char[] { ' ', ' ', '#', 'a', '4', 'a' };
        int int15 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "", charArray14);
        boolean boolean16 = org.apache.commons.lang3.StringUtils.containsAny("$", charArray14);
        java.lang.String str18 = org.apache.commons.lang3.ClassUtils.getPackageCanonicalName((java.lang.Object) charArray14, "class java.lang.String");
        int int19 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "     A..ayL A.44444444444444444444444444      ", charArray14);
        boolean boolean20 = org.apache.commons.lang3.StringUtils.containsAny("NTERFACE JAVA.LANG.cLONEABLE.......JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVAINTERFACE JAVA.IO.sERIALIZABLE", charArray14);
        boolean boolean21 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA       ", charArray14);
        int int22 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "$$$$$$$$$$$$$$$$$$$$$$$$$$$$$", charArray14);
        boolean boolean23 = org.apache.commons.lang3.StringUtils.containsNone(charSequence1, charArray14);
        boolean boolean24 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "#", charArray14);
        org.junit.Assert.assertNotNull(charArray14);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray14), "  #a4a");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray14), "  #a4a");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray14), "[ ,  , #, a, 4, a]");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 5 + "'", int19 == 5);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
    }

    @Test
    public void test08739() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08739");
        java.lang.String str1 = org.apache.commons.lang3.ClassUtils.getShortClassName("$         44444444444444444444444444444444444444444444444444444444444444444444444444444444                                                           ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + ".         44444444444444444444444444444444444444444444444444444444444444444444444444444444                                                           " + "'", str1, ".         44444444444444444444444444444444444444444444444444444444444444444444444444444444                                                           ");
    }

    @Test
    public void test08740() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08740");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.substring("interface java.lang.CloneableINTERFACE JAVA.LANG.CLONEABLELANG.GNALJAVA.LANGAVAJ.GNALJAVA.LANGAVAJ.GNALJAVA.LANGAVAJ.GNALJAVA.LANGAVAJ.GNALJAVA.LANGAVAJ.GNALJAVA.LANGAVAJ.GNALJAVA.LANGAVAJ.GNALJAVA.LANGAVAJ.JAVAINTERFACE JAVA.IO.SERIALIZABLEinterface java.io.Serializable", 33, 173);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "RFACE JAVA.LANG.CLONEABLELANG.GNALJAVA.LANGAVAJ.GNALJAVA.LANGAVAJ.GNALJAVA.LANGAVAJ.GNALJAVA.LANGAVAJ.GNALJAVA.LANGAVAJ.GNALJAVA.LANGAVAJ.GN" + "'", str3, "RFACE JAVA.LANG.CLONEABLELANG.GNALJAVA.LANGAVAJ.GNALJAVA.LANGAVAJ.GNALJAVA.LANGAVAJ.GNALJAVA.LANGAVAJ.GNALJAVA.LANGAVAJ.GNALJAVA.LANGAVAJ.GN");
    }

    @Test
    public void test08741() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08741");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.abbreviate("                                                                 ", 36, 77);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "                                                                 " + "'", str3, "                                                                 ");
    }

    @Test
    public void test08742() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08742");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.defaultString("....................................................................................................", "ssalC.gnal.avaj ssalc");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "...................................................................................................." + "'", str2, "....................................................................................................");
    }

    @Test
    public void test08743() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08743");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBetween("java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........javainterface java.io", ".LANG.LANG.LANG.LANG.Llitu");
        org.junit.Assert.assertNull(str2);
    }

    @Test
    public void test08744() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08744");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replace("...VA.LANGAVAJ.GNALJAVA.LANGAVAJ.GNALJAVA.LANGAVAJ.GNALJAVA.LANGAVAJ.GNALJAVA.LANGAVAJ.GNALJAVA.LANGgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalg", "444444444444INTERFACE JAVA.LANG.cLONEABLEsTRINGINTERFACE JAVA.IO.sERIALIZABLE444444444444444444444444444444444444444444444444444444444444444444444444444444444litu.avajlitu", "jAVA");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "...VA.LANGAVAJ.GNALJAVA.LANGAVAJ.GNALJAVA.LANGAVAJ.GNALJAVA.LANGAVAJ.GNALJAVA.LANGAVAJ.GNALJAVA.LANGgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalg" + "'", str3, "...VA.LANGAVAJ.GNALJAVA.LANGAVAJ.GNALJAVA.LANGAVAJ.GNALJAVA.LANGAVAJ.GNALJAVA.LANGAVAJ.GNALJAVA.LANGgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalg");
    }

    @Test
    public void test08745() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08745");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNumeric((java.lang.CharSequence) "javastringslitUgnirtSarraylistarraylistavaj");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test08746() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08746");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.stripEnd("ELBAZILAIREs", "                                                                                                                                                                                                                             aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa                                                                                                                                                                                                                             ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "ELBAZILAIREs" + "'", str2, "ELBAZILAIREs");
    }

    @Test
    public void test08747() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08747");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.equalsIgnoreCase("gn", "$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test08748() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08748");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.normalizeSpace("Avaj.gnal");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Avaj.gnal" + "'", str1, "Avaj.gnal");
    }

    @Test
    public void test08749() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08749");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substring("gNAL.AVAJ", (int) (short) 1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "NAL.AVAJ" + "'", str2, "NAL.AVAJ");
    }

    @Test
    public void test08750() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08750");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass1 = org.apache.commons.lang3.ClassUtils.getClass("stringnalarraylistarraylistarraylistavaj.gnalarraylistarraylistarrayli");
            org.junit.Assert.fail("Expected exception of type java.lang.ClassNotFoundException; message: stringnalarraylistarraylistarraylistavaj.gnalarraylistarraylistarrayli");
        } catch (java.lang.ClassNotFoundException e) {
            // Expected exception.
        }
    }

    @Test
    public void test08751() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08751");
        int int2 = org.apache.commons.lang3.StringUtils.indexOf("AVAJ.GNALNaaaaaaaaaaJAVAL.AGNaaaaaaaaaaJAVAL.AGNaaaaaaaaaaJAARRAYLISTARRAYLISTARRAYLISTAVAJ", 493);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test08752() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08752");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceOnce("GNIRT", "AVAJ.GNALAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA       CharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterChara", "444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444litu.avajlitu");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "GNIRT" + "'", str3, "GNIRT");
    }

    @Test
    public void test08753() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08753");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOfIgnoreCase("interface java.lang.Cloneablegnal.avajgnal..LANGgnal.avajgnal.interface java.io.Serializabl", "INTEGER");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test08754() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08754");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.capitalize((java.lang.CharSequence) "#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#lass java#lang#String");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#lass java#lang#String" + "'", str1, "#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#lass java#lang#String");
    }

    @Test
    public void test08755() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08755");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.center("gnirtS.ge       .", (int) (byte) 10);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "gnirtS.ge       ." + "'", str2, "gnirtS.ge       .");
    }

    @Test
    public void test08756() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08756");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens(".aL.ArrayListgnal.aL.ArrayList");
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test08757() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08757");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.rightPad("$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$", 487);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$                                                                                                                                                                                                                                                                                                                                                                                                                                                                    " + "'", str2, "$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$                                                                                                                                                                                                                                                                                                                                                                                                                                                                    ");
    }

    @Test
    public void test08758() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08758");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNotBlank((java.lang.CharSequence) "class java.lang.class");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test08759() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08759");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.rightPad("AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA...", (int) (byte) 1, "AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA... AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA... AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA... AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA... AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA... AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA... AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA... AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA... AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA... ...");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA..." + "'", str3, "AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA...");
    }

    @Test
    public void test08760() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08760");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAllLowerCase((java.lang.CharSequence) "...NaaaaaaaaaaJAVAL.AGNaaaaaaaaaa...");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test08761() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08761");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("avaj.gnal", "$       ");
        java.lang.String[] strArray7 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("...", 'a');
        java.lang.String[] strArray10 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("$", "                                   ");
        java.lang.String str11 = org.apache.commons.lang3.StringUtils.replaceEachRepeatedly("...       ", strArray7, strArray10);
        java.lang.String str12 = org.apache.commons.lang3.StringUtils.replaceEachRepeatedly("                                              ", strArray3, strArray10);
        java.lang.String str13 = org.apache.commons.lang3.StringUtils.getCommonPrefix(strArray3);
        java.lang.String str15 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray3, "AVAJ.GNAL");
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertNotNull(strArray10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "$       " + "'", str11, "$       ");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "                                              " + "'", str12, "                                              ");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "avaj.gnal" + "'", str13, "avaj.gnal");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "avaj.gnal" + "'", str15, "avaj.gnal");
    }

    @Test
    public void test08762() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08762");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBeforeLast("rrayList                            rrayList                            rrayList                            rray$ArrayLis", "java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........javainterface java.io");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "rrayList                            rrayList                            rrayList                            rray$ArrayLis" + "'", str2, "rrayList                            rrayList                            rrayList                            rray$ArrayLis");
    }

    @Test
    public void test08763() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08763");
        int int3 = org.apache.commons.lang3.StringUtils.indexOf("", 152, 15);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test08764() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08764");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("", "", 665);
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void test08765() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08765");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOf("INTERFAVAJ.GNALAVA$$$.JAVA$$$.JAVA$$$.JAVA$$$.JAVA$$$.JAVA$$$.JAVA$$$.JAVA$$$.JAVA$$$.JAVA$$$.JAVA$$$.JAVA$$$.JAVA$$$.JAVA$$$.JAVA$$$.JAVA$$$.JAVA$$$.JAVA$$$.JAVA$$$.JAVA$$$.JAVA$$$.JAVA$$$.JAVA$$$.JAVA$$$.JAVA$$$.JAVA$$$.JAVA$$$.JAVA$$$.JAVA$$$.JAVA$$$.JAVA$$$.JAVA$$$.JAVA$$$.JAVA$$$.JAVAINTERFACE JAVA.IO.SERIALIZABLE", 22);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test08766() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08766");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphanumericSpace((java.lang.CharSequence) "iNTERFACE JAVA$LANG$cLONEABLE$$$$$$$JAVA$$$$$$$$$$JAVA$$$$$$$$$$JAVA$$$$$$$$$$JAVA$$$$$$$$$$JAVA$$$$$$$$$$JAVA$$$$$$$$$$JAVA$$$$$$$$$$JAVA$$$$$$$$$$JAVA$$$$$$$$$$JAVA");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test08767() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08767");
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.overlay("CEAJ V AL NGAcLONE BLEAAAAAAAJ V AAAAAAAAAAJ V AAAAAAAAAAJ V AAAAAAAAAAJ V AAAAAAAAAAJ V AAAAAAAAAAJ V AAAAAAAAAAJ V AAAAAAAAAAJ V AAAAAAAAAAJ V AAAAAAAAAAJ V AAAAAAAAAAJ V AAAAAAAAAAJ V AAAAAAAAAAJ V AAAAAAAAAAJ V AAAAAAAAAAJ V AAAAAAAAAAJ V AAAAAAAAAAJ V AAAAAAAAAAJ V AAAAAAAAAAJ V AAAAAAAAAAJ V AAAAAAAAAAJ V AAAAAAAAAAJ V AAAAAAAAAAJ V AAAAAAAAAAJ V AAAAAAAAAAJ V AAAAAAAAAAJ V AAAAAAAAAAJ V AAAAAAAAAAJ V AAAAAAAAAAJ V AAAAAAAAAAJ V AAAAAAAAAAJ V AAAAAAAAAAJ V AAAAAAAAAAJ V AAAAAAAAAAJ V AAAAAAAAAAJ V INTERF CEAJ V AIOAsERI LIZ BLE", "JAVAlLANGJAVA.LANGAVAJ.GNALJAVA.LANGAVAJ.GNALJAVA.LANGAVAJ.GNALJAVA.LANGAVAJ.GNALJAVA.LANGAVAJ.GNALJAVA.LANGAVAJ.GNALJAVA.LANGAVAJ.GNALJAVA.LANGAVAJ.GNALJAVA.LANG", 44, 669);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "CEAJ V AL NGAcLONE BLEAAAAAAAJ V AAAAAAAAAAJJAVAlLANGJAVA.LANGAVAJ.GNALJAVA.LANGAVAJ.GNALJAVA.LANGAVAJ.GNALJAVA.LANGAVAJ.GNALJAVA.LANGAVAJ.GNALJAVA.LANGAVAJ.GNALJAVA.LANGAVAJ.GNALJAVA.LANGAVAJ.GNALJAVA.LANG" + "'", str4, "CEAJ V AL NGAcLONE BLEAAAAAAAJ V AAAAAAAAAAJJAVAlLANGJAVA.LANGAVAJ.GNALJAVA.LANGAVAJ.GNALJAVA.LANGAVAJ.GNALJAVA.LANGAVAJ.GNALJAVA.LANGAVAJ.GNALJAVA.LANGAVAJ.GNALJAVA.LANGAVAJ.GNALJAVA.LANGAVAJ.GNALJAVA.LANG");
    }

    @Test
    public void test08768() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08768");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.substringsBetween("vaj.gnaljava.langavaj.gnaljava.langavaj.gnaljava.langavaj.gnaljava.langavaj.gnaljava.langavaj.gnaljava.lang", "################################...       AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA", "litu.avajlitu.avaj");
        org.junit.Assert.assertNull(strArray3);
    }

    @Test
    public void test08769() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08769");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNumeric((java.lang.CharSequence) "JAVA.LITU.AVAJLITU.AVAJJAVA.LITU.AVAJLITU.AVAJJAVA.LITU.AVAJLITU.AVAJJAVA.LITU.AVAJLITU.AVAJJAVA.LITU.AVAJLITU.AVAJJAVA.LITU.AVAJLITU.AVAJJAVA.LITU.AVAJLITU.AVAJJAVA.LITU.AVAJLITU.AVAJJAVA.LITU.AVAJLITU.AVAJJAVA.LITU.AVAJLITU.AVAJJAVA.LITU.AVAJLITU.AVAJJAVA.LITU.AVAJLITU.AVAJJAVA.LITU.AVAJLITU.AVAJJAVA.LITU.AVAJLITU.AVAJJAVA.LITU.AVAJLITU.AVAJJAVA.LITU.AVAJLITU.AVAJJAVA.LITU.AVAJLITU.AVAJJAVA.LITU.AVAJLITU.AVAJJAVA.LITU.AVAJLITU.AVAJJAVA.LITU.AVAJLITU.AVAJJAVA.LITU.AVAJLITU.AVAJJAVA.LITU.AVAJLITU.AVAJJAVA.LITU.AVAJLITU.AVAJJAVA.LITU.AVAJLITU.AVAJJAVA.LITU.AVAJLITU.AVAJJAVA.LITU.AVAJLITU.AVAJJAVA.LITU.AVAJLITU.AVAJJAVA.LITU.AVAJLITU.AVAJJAVA.LITU.AVAJLITU.AVAJJAVA.LITU.AVAJLITU.AVAJJAVA.LITU.AVAJLITU.AVAJJAVA.LITU.AVAJLITU.AVAJJAVA.LITU.AVAJLITU");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test08770() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08770");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.endsWith("String[]String[]String[]String[]String[]String[]String[]String[]String[]String[]", "saylavv");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test08771() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08771");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAsciiPrintable((java.lang.CharSequence) "interfacejava.lang.Cloneable#interfacejava.io");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test08772() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08772");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.difference("javajavastrinjavajavastrinjavajavast", "... AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA... AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA... AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA... AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA... AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA... AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA... AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA... AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA... AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA... AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "... AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA... AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA... AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA... AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA... AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA... AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA... AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA... AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA... AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA... AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA" + "'", str2, "... AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA... AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA... AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA... AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA... AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA... AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA... AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA... AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA... AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA... AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA");
    }

    @Test
    public void test08773() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08773");
        int int2 = org.apache.commons.lang3.StringUtils.indexOf("... ... ... ... ... ... ... ... ... ...", "aVAJ.GNALAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA       CharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterChara");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test08774() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08774");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringAfterLast("                                                                                                                                     $                                                                                                                                             ", "ja");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test08775() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08775");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("AAAAAAAAAA", "etyB", 576);
        java.lang.String str5 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray3, "sTRINGuTILSsTRINGuTILSsTRINGuTILSsTRINGuTILSsTRINGuTILSsTRINGuTILSsTRINGuTILSsTRINGuTILSsTRINGuTILSsTRINGuTILS");
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "AAAAAAAAAA" + "'", str5, "AAAAAAAAAA");
    }

    @Test
    public void test08776() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08776");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trim("javaStrinSerializableSerializableSerializableSeriali");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "javaStrinSerializableSerializableSerializableSeriali" + "'", str1, "javaStrinSerializableSerializableSerializableSeriali");
    }

    @Test
    public void test08777() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08777");
        int int3 = org.apache.commons.lang3.StringUtils.indexOf("AVAJ.GNALNaaaaaaaaaaJAVAL.AGNaaaaaaaaaaJAVAL.AGNaaaaaaaaaaJAVAL.AGNaaaaaaaaaaJAVAL.AGNaaaaaaaaaaJAVAL.AGNaaaaaaaaaaJAVAL.AGNaaaaaaaaaaJAVAL.AGNaaaaaaaaaaJAVAL.AGNaaaaaaaaaaJAVAL.AGNaaaaaaaaaaJAVAL.AGNaaaaaaaaaaJAVAL.AGNaaaaaaaaaaJAVAL.AGNaaaaaaaaaaJAVAL.AGNaaaaaaaaaaJAVAL.AGNaaaaaaaaaaJAVAL.AGNaaaaaaaaaaJAVAL.AGNaaaaaaaaaaJAVAL.AGNaaaaaaaaaaJAVAL.AGNaaaaaaaaaaJAVAL.AGNaaaaaaaaaaJAVAL.AGNaaaaaaaaaaJAVAL.AGNaaaaaaaaaaJAVAL.AGNaaaaaaaaaaJAVAL.AGNaaaaaaaaaaJAVAL.AGNaaaaaaaaaaJAVAL.AGNaaaaaaaaaaJAVAL.AGNaaaaaaaaaaJAVAL.AGNaaaaaaaaaaJAVAL.AGNaaaaaaaaaaJAVAL.AGNaaaaaaaaaaJAVAL.AGNaaaaaaaaaaJAVAL.AGNaaaaaaaaaaJAVAL.AGNaaaaaaaaaaJAVAL.AGNaaaaaaaaaaJAVAL", "aaaaaaaaaa", 940);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test08778() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08778");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripToNull("...AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA...AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA...AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA...AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA...AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA...AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA...AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA...AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA...AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA.");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "...AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA...AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA...AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA...AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA...AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA...AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA...AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA...AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA...AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA." + "'", str1, "...AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA...AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA...AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA...AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA...AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA...AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA...AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA...AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA...AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA.");
    }

    @Test
    public void test08779() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08779");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.center("STRING", 943, "interface java.lang.CloneableINTERFACE JAVA.LANG.CLONEABLELANG.GNALJAVA.LANGAVAJ.GNALJAVA.LANGAVAJ.GNALJAVA.LANGAVAJ.GNALJAVA.LANGAVAJ.GNALJAVA.LANGAVAJ.GNALJAVA.LANGAVAJ.GNALJAVA.LANGAVAJ.GNALJAVA.LANGAVAJ.JAVAINTERFACE JAVA.IO.SERIALIZABLEinterface java.io.Serializable");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "interface java.lang.CloneableINTERFACE JAVA.LANG.CLONEABLELANG.GNALJAVA.LANGAVAJ.GNALJAVA.LANGAVAJ.GNALJAVA.LANGAVAJ.GNALJAVA.LANGAVAJ.GNALJAVA.LANGAVAJ.GNALJAVA.LANGAVAJ.GNALJAVA.LANGAVAJ.GNALJAVA.LANGAVAJ.JAVAINTERFACE JAVA.IO.SERIALIZABLEinterface java.io.Serializableinterface java.lang.CloneableINTERFACE JAVA.LANG.CLONEABLELANG.GNALJAVA.LANGAVAJ.GNALJAVA.LANGAVAJ.GNALJAVA.LANGAVAJ.GNALJAVA.LANGAVAJ.GNALJAVA.LANGAVAJ.GNALJAVA.LANGAVAJ.GNALJAVA.LANGAVAJ.GNALJAVASTRINGinterface java.lang.CloneableINTERFACE JAVA.LANG.CLONEABLELANG.GNALJAVA.LANGAVAJ.GNALJAVA.LANGAVAJ.GNALJAVA.LANGAVAJ.GNALJAVA.LANGAVAJ.GNALJAVA.LANGAVAJ.GNALJAVA.LANGAVAJ.GNALJAVA.LANGAVAJ.GNALJAVA.LANGAVAJ.JAVAINTERFACE JAVA.IO.SERIALIZABLEinterface java.io.Serializableinterface java.lang.CloneableINTERFACE JAVA.LANG.CLONEABLELANG.GNALJAVA.LANGAVAJ.GNALJAVA.LANGAVAJ.GNALJAVA.LANGAVAJ.GNALJAVA.LANGAVAJ.GNALJAVA.LANGAVAJ.GNALJAVA.LANGAVAJ.GNALJAVA.LANGAVAJ.GNALJAVA." + "'", str3, "interface java.lang.CloneableINTERFACE JAVA.LANG.CLONEABLELANG.GNALJAVA.LANGAVAJ.GNALJAVA.LANGAVAJ.GNALJAVA.LANGAVAJ.GNALJAVA.LANGAVAJ.GNALJAVA.LANGAVAJ.GNALJAVA.LANGAVAJ.GNALJAVA.LANGAVAJ.GNALJAVA.LANGAVAJ.JAVAINTERFACE JAVA.IO.SERIALIZABLEinterface java.io.Serializableinterface java.lang.CloneableINTERFACE JAVA.LANG.CLONEABLELANG.GNALJAVA.LANGAVAJ.GNALJAVA.LANGAVAJ.GNALJAVA.LANGAVAJ.GNALJAVA.LANGAVAJ.GNALJAVA.LANGAVAJ.GNALJAVA.LANGAVAJ.GNALJAVA.LANGAVAJ.GNALJAVASTRINGinterface java.lang.CloneableINTERFACE JAVA.LANG.CLONEABLELANG.GNALJAVA.LANGAVAJ.GNALJAVA.LANGAVAJ.GNALJAVA.LANGAVAJ.GNALJAVA.LANGAVAJ.GNALJAVA.LANGAVAJ.GNALJAVA.LANGAVAJ.GNALJAVA.LANGAVAJ.GNALJAVA.LANGAVAJ.JAVAINTERFACE JAVA.IO.SERIALIZABLEinterface java.io.Serializableinterface java.lang.CloneableINTERFACE JAVA.LANG.CLONEABLELANG.GNALJAVA.LANGAVAJ.GNALJAVA.LANGAVAJ.GNALJAVA.LANGAVAJ.GNALJAVA.LANGAVAJ.GNALJAVA.LANGAVAJ.GNALJAVA.LANGAVAJ.GNALJAVA.LANGAVAJ.GNALJAVA.");
    }

    @Test
    public void test08780() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08780");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.remove("44444444444444444.444444444444444444...                                 44444444444444444.444444444444444444...                                 44444$        ", "slitUgnirtSslitUgnirtSslitUgnirtSslitUgnirtSslitUgnirtSslitUgnirtSslitUgnirtSslitUgnirtSslitUgnirtSslitUgnirtslitUgnirtSslitUgnirtSslitUgnirtSslitUgnirtSslitUgnirtSslitUgnirtSslitUgnirtSslitUgnirtSslitUgnirtSslitUgnirtslitUgnirtSslitUgnirtSslitUgnirtSslitUgnirtSslitUgnirtSslitUgnirtSslgnalslitUgnirtSslitUgnirtSslitUgnirtSslitUgnirtSslitUgnirtSslitUgnirtSslitUgnirtSslitUgnirtSslitUgnirtSslitUgnirtslitUgnirtSslitUgnirtSslitUgnirtSslitUgnirtSslitUgnirtSslitUgnirtSslitUgnirtSslitUgnirtSslitUgnirtSslitUgnirtslitUgnirtSslitUgnirtSslitUgnirtSslitUgnirtSslitUgnirtSslitUgnirtSsl");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "44444444444444444.444444444444444444...                                 44444444444444444.444444444444444444...                                 44444$        " + "'", str2, "44444444444444444.444444444444444444...                                 44444444444444444.444444444444444444...                                 44444$        ");
    }

    @Test
    public void test08781() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08781");
        int int3 = org.apache.commons.lang3.StringUtils.indexOf(".....java..........java..........java.........", "litu.avajlitu.avaj", 159);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test08782() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08782");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.center("class java.lang.Classclass java.lang.Classclass java.lang.Classclass java.lang.Classclass java.lang.Classclass java.lang.Classclass java.lang.Classclass java.lang.Classclass java.lang.Classclass java.lang.Classclass java.lang.Classclass java.lang.Classclass java.lang.Classclass java.lang.Classclass java.lang.Classclass java.lang.Classclass java.lang.Classclass java.lang.Classclass java.lang.Classclass java.lang.Classclass java.lang.Classclass java.lang.Classclass java.lang.Classclass java.lang.Classclass java.lang.Classclass java.lang.Classclass java.lang.Classclass java.lang.Classclass java.lang.Classclass java.lang.Class", 67, 'a');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "class java.lang.Classclass java.lang.Classclass java.lang.Classclass java.lang.Classclass java.lang.Classclass java.lang.Classclass java.lang.Classclass java.lang.Classclass java.lang.Classclass java.lang.Classclass java.lang.Classclass java.lang.Classclass java.lang.Classclass java.lang.Classclass java.lang.Classclass java.lang.Classclass java.lang.Classclass java.lang.Classclass java.lang.Classclass java.lang.Classclass java.lang.Classclass java.lang.Classclass java.lang.Classclass java.lang.Classclass java.lang.Classclass java.lang.Classclass java.lang.Classclass java.lang.Classclass java.lang.Classclass java.lang.Class" + "'", str3, "class java.lang.Classclass java.lang.Classclass java.lang.Classclass java.lang.Classclass java.lang.Classclass java.lang.Classclass java.lang.Classclass java.lang.Classclass java.lang.Classclass java.lang.Classclass java.lang.Classclass java.lang.Classclass java.lang.Classclass java.lang.Classclass java.lang.Classclass java.lang.Classclass java.lang.Classclass java.lang.Classclass java.lang.Classclass java.lang.Classclass java.lang.Classclass java.lang.Classclass java.lang.Classclass java.lang.Classclass java.lang.Classclass java.lang.Classclass java.lang.Classclass java.lang.Classclass java.lang.Classclass java.lang.Class");
    }

    @Test
    public void test08783() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08783");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAllUpperCase((java.lang.CharSequence) "tSslitUgnirtSslitUgnirtSslitUgnirtSslitUgnirtS");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test08784() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08784");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitByCharacterType("... AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA... AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA... AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA... AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA... AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA... AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA... AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA... AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA... AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA... AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA");
        java.lang.Class<?>[] wildcardClassArray2 = org.apache.commons.lang3.ClassUtils.toClass((java.lang.Object[]) strArray1);
        java.lang.Class<?>[] wildcardClassArray3 = org.apache.commons.lang3.ClassUtils.primitivesToWrappers(wildcardClassArray2);
        java.lang.Class<?>[] wildcardClassArray4 = org.apache.commons.lang3.ClassUtils.wrappersToPrimitives(wildcardClassArray3);
        java.lang.Class<?>[] wildcardClassArray5 = org.apache.commons.lang3.ClassUtils.toClass((java.lang.Object[]) wildcardClassArray3);
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
        java.lang.String str43 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) wildcardClassArray39, '.', 17, 5);
        boolean boolean45 = org.apache.commons.lang3.ClassUtils.isAssignable(wildcardClassArray3, wildcardClassArray39, true);
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertNotNull(wildcardClassArray2);
        org.junit.Assert.assertNotNull(wildcardClassArray3);
        org.junit.Assert.assertNotNull(wildcardClassArray4);
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
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "" + "'", str38, "");
        org.junit.Assert.assertNotNull(wildcardClassArray39);
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "" + "'", str43, "");
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
    }

    @Test
    public void test08785() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08785");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitByCharacterTypeCamelCase("etyB");
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test08786() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08786");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.uncapitalize((java.lang.CharSequence) "java.utiljava.utilarra");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "java.utiljava.utilarra" + "'", str1, "java.utiljava.utilarra");
    }

    @Test
    public void test08787() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08787");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.mid("NTERFACEJAVA.LANG.cLONEABLE.......JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVAINTERFACEJAVA.IO.sERIALIZABLE", (int) (short) 100, 669);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "....JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVAINTERFACEJAVA.IO.sERIALIZABLE" + "'", str3, "....JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVAINTERFACEJAVA.IO.sERIALIZABLE");
    }

    @Test
    public void test08788() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08788");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("JAVAULANG", "              Integer              ", (int) (short) 100);
        java.lang.String str5 = org.apache.commons.lang3.ClassUtils.getShortCanonicalName((java.lang.Object) strArray3, "");
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "String[]" + "'", str5, "String[]");
    }

    @Test
    public void test08789() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08789");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAsciiPrintable((java.lang.CharSequence) "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                             ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test08790() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08790");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.remove("", "                   GNAL.AVAJ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test08791() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08791");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.stripStart("java.utiljava.util", "tsilyarrgnaluavajtsilyarrgnaluavaj");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + ".utiljava.util" + "'", str2, ".utiljava.util");
    }

    @Test
    public void test08792() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08792");
        int int3 = org.apache.commons.lang3.StringUtils.ordinalIndexOf("...       AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA", "rayListArrayListavaj.gnal                                                                ", 64);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test08793() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08793");
        java.lang.String[] strArray5 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("...", "avaj.gnal", (int) 'a');
        java.lang.String str6 = org.apache.commons.lang3.StringUtils.getCommonPrefix(strArray5);
        int int7 = org.apache.commons.lang3.StringUtils.indexOfAny("][sslC", strArray5);
        java.lang.String[] strArray12 = org.apache.commons.lang3.StringUtils.split("                                                                                                    ", "hi!", (int) (byte) -1);
        int int13 = org.apache.commons.lang3.StringUtils.indexOfDifference((java.lang.CharSequence[]) strArray12);
        boolean boolean14 = org.apache.commons.lang3.StringUtils.startsWithAny("ArrayList", strArray12);
        java.lang.String str16 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray12, "Serializabl");
        java.lang.String str17 = org.apache.commons.lang3.StringUtils.replaceEach("$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$A rrr rrr rrr r...", strArray5, strArray12);
        java.lang.String str19 = org.apache.commons.lang3.ClassUtils.getShortClassName((java.lang.Object) "$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$A rrr rrr rrr r...", "");
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "..." + "'", str6, "...");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertNotNull(strArray12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "                                                                                                    " + "'", str16, "                                                                                                    ");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$A rrr rrr rrr r                                                                                                    " + "'", str17, "$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$A rrr rrr rrr r                                                                                                    ");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "String" + "'", str19, "String");
    }

    @Test
    public void test08794() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08794");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.center("javal$agnjaval$agnjaval$agnjaval$agnjaval$agnjaval$agnjaval$agnjaval$agnjaval$agnjaval$agnjaval$agnjaval$agnjaval$agnjaval$agnjaval$agnjaval$agnjaval$agnjaval$agnjaval$agnjaval$agnjaval$agnjaval$agnjaval$agnjaval$agnjaval$agnjaval$agnjaval$agnjaval$agnjaval$agnjaval$agnjaval$agnjaval$agnjaval$agnjaval$agnjaval$agnjaval$agnjaval$agnjaval$agnjaval$agnjaval$agnjaval$agnjaval$agnjaval$agnjaval$agnjaval$agnjaval$agnjaval$agnjaval$agnjaval$agnjaval$agnjaval$agnjaval$agnjaval$agnjaval$agnjaval$agnjaval$agnjaval$agnjaval$agnjaval$agnjaval$agnjaval$agnjaval$agnjaval$agnjaval$agn", 4, '.');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "javal$agnjaval$agnjaval$agnjaval$agnjaval$agnjaval$agnjaval$agnjaval$agnjaval$agnjaval$agnjaval$agnjaval$agnjaval$agnjaval$agnjaval$agnjaval$agnjaval$agnjaval$agnjaval$agnjaval$agnjaval$agnjaval$agnjaval$agnjaval$agnjaval$agnjaval$agnjaval$agnjaval$agnjaval$agnjaval$agnjaval$agnjaval$agnjaval$agnjaval$agnjaval$agnjaval$agnjaval$agnjaval$agnjaval$agnjaval$agnjaval$agnjaval$agnjaval$agnjaval$agnjaval$agnjaval$agnjaval$agnjaval$agnjaval$agnjaval$agnjaval$agnjaval$agnjaval$agnjaval$agnjaval$agnjaval$agnjaval$agnjaval$agnjaval$agnjaval$agnjaval$agnjaval$agnjaval$agnjaval$agn" + "'", str3, "javal$agnjaval$agnjaval$agnjaval$agnjaval$agnjaval$agnjaval$agnjaval$agnjaval$agnjaval$agnjaval$agnjaval$agnjaval$agnjaval$agnjaval$agnjaval$agnjaval$agnjaval$agnjaval$agnjaval$agnjaval$agnjaval$agnjaval$agnjaval$agnjaval$agnjaval$agnjaval$agnjaval$agnjaval$agnjaval$agnjaval$agnjaval$agnjaval$agnjaval$agnjaval$agnjaval$agnjaval$agnjaval$agnjaval$agnjaval$agnjaval$agnjaval$agnjaval$agnjaval$agnjaval$agnjaval$agnjaval$agnjaval$agnjaval$agnjaval$agnjaval$agnjaval$agnjaval$agnjaval$agnjaval$agnjaval$agnjaval$agnjaval$agnjaval$agnjaval$agnjaval$agnjaval$agnjaval$agnjaval$agn");
    }

    @Test
    public void test08795() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08795");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.abbreviate("AtsiLytcejbO.gnal.avaj ssalcrrAtsiLytcejbO...", 15, 62);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "AtsiLytcejbO.gnal.avaj ssalcrrAtsiLytcejbO..." + "'", str3, "AtsiLytcejbO.gnal.avaj ssalcrrAtsiLytcejbO...");
    }

    @Test
    public void test08796() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08796");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.strip("                                                                             SE...               ...");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "SE...               ..." + "'", str1, "SE...               ...");
    }

    @Test
    public void test08797() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08797");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "class java.lang.Class                       JAVAULANG                       JAVAULANG                       JAVAULANG                       JAVAULANG                       JAVAULANG                       JAVAULANG                       JAVAULANG                       JAVAULANG                       JAVAULANG                       JAVAULANG                       JAVAULANG                       JAVAULANG                       JAVAULANG                       JAVAULANG                       JAVAULANG                       JAVAULANG                       JAVAULANG                       JAVAULANG                       JAVAULANG                       JAVAULANG        ", " String  ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test08798() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08798");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceChars("              Llitu               ", "nterface java.lang.Cloneable.......java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........javainterface java.io.Serializable", "INTEGER");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "LNu" + "'", str3, "LNu");
    }

    @Test
    public void test08799() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08799");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) ".............java..........java..........java..........java..........java..........java..........java..........java..........java..........java...........", "GNAL.");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test08800() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08800");
        java.lang.CharSequence charSequence2 = org.apache.commons.lang3.StringUtils.defaultIfEmpty((java.lang.CharSequence) "ngnalarraylistarraylistarraylistavaj.gnalarraylistarraylistarrayli", (java.lang.CharSequence) "CLASSJAVA.LANG.cLASSjavaulangjavaulangjavaulangjavaulangjavaulangjavaulangjavaulangjavaulangjavaulangjavaulangjavaulangjavaulangjavaulangjavaulangjavaulangjavaulangjavaulangjavaulangjavaulangjavaulang");
        org.junit.Assert.assertEquals("'" + charSequence2 + "' != '" + "ngnalarraylistarraylistarraylistavaj.gnalarraylistarraylistarrayli" + "'", charSequence2, "ngnalarraylistarraylistarraylistavaj.gnalarraylistarraylistarrayli");
    }

    @Test
    public void test08801() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08801");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.defaultString("....................................................................                       j v ul ng");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "....................................................................                       j v ul ng" + "'", str1, "....................................................................                       j v ul ng");
    }

    @Test
    public void test08802() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08802");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringAfter("jva..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java", "tsiLyarrA.La.langtsiLyarrA.La.langtsiLyarrA.La.langtsiLyarrA.La.langtsiLyarrA.La.langtsiLyarrA.La.langtsiLyarrA.La.langtsiLyarrA.La.lang");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test08803() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08803");
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("hi!", "");
        java.lang.String str6 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray4, "");
        boolean boolean7 = org.apache.commons.lang3.StringUtils.startsWithAny("              Integer              ", strArray4);
        int int8 = org.apache.commons.lang3.StringUtils.indexOfAny("hi!ArrayListArrayListArrayListavaj.gnalArrayListArrayListArrayListavaj.gnalArrayListArrayListArrayLi", strArray4);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test08804() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08804");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.reverse("                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                             ArryLis");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "siLyrrA                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                             " + "'", str1, "siLyrrA                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                             ");
    }

    @Test
    public void test08805() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08805");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.capitalize((java.lang.CharSequence) "ArryList");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "ArryList" + "'", str1, "ArryList");
    }

    @Test
    public void test08806() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08806");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.upperCase("classjava.lang.ClassJAVAULANGJAVAULANGJAVAULANGJAVAULANGJAVAULANGJAVAULANGJAVAULANGJAVAULANGJAVAULANGJAVAULANGJAVAULANGJAVAULANGJAVAULANGJAVAULANGJAVAULANGJAVAULANGJAVAULANGJAVAULANGJAVAULANGJAVAULANG");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "CLASSJAVA.LANG.CLASSJAVAULANGJAVAULANGJAVAULANGJAVAULANGJAVAULANGJAVAULANGJAVAULANGJAVAULANGJAVAULANGJAVAULANGJAVAULANGJAVAULANGJAVAULANGJAVAULANGJAVAULANGJAVAULANGJAVAULANGJAVAULANGJAVAULANGJAVAULANG" + "'", str1, "CLASSJAVA.LANG.CLASSJAVAULANGJAVAULANGJAVAULANGJAVAULANGJAVAULANGJAVAULANGJAVAULANGJAVAULANGJAVAULANGJAVAULANGJAVAULANGJAVAULANGJAVAULANGJAVAULANGJAVAULANGJAVAULANGJAVAULANGJAVAULANGJAVAULANGJAVAULANG");
    }

    @Test
    public void test08807() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08807");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsIgnoreCase("Javaaaaaaaaaava.langava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.lang", "BYTE");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test08808() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08808");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeEndIgnoreCase("                                                                                                                                                                                                                                                                              ArrayListArrayListArrayListavajagnal                                                                                                                                                                                                                                                                              ", "44444444444444444444-1java444444444444444444444");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                                                                                                                                                                                                                                                              ArrayListArrayListArrayListavajagnal                                                                                                                                                                                                                                                                              " + "'", str2, "                                                                                                                                                                                                                                                                              ArrayListArrayListArrayListavajagnal                                                                                                                                                                                                                                                                              ");
    }

    @Test
    public void test08809() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08809");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOf("A..ayL A.", "$$$$$$jav");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test08810() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08810");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.rightPad("StringStringStringStringStringStringStringStringStringString", 44, '4');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "StringStringStringStringStringStringStringStringStringString" + "'", str3, "StringStringStringStringStringStringStringStringStringString");
    }

    @Test
    public void test08811() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08811");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("classjavalangClassJAVAULANGJAVAULANGJAVAULANGJAVAULANGJAVAULANGJAVAULANGJAVAULANGJAVAULANGJAVAULANGJAVAULANGJAVAULANGJAVAULANGJAVAULANGJAVAULANGJAVAULANGJAVAULANGJAVAULANGJAVAULANGJAVAULANGJAVAULANG$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$", "][ssalC", 38);
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void test08812() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08812");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.leftPad("rgnaluavaj", 47);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                     rgnaluavaj" + "'", str2, "                                     rgnaluavaj");
    }

    @Test
    public void test08813() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08813");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.split("java.lang$interface java.lang.Cloneable$interface java.io.Serializableinterface java.lang.Cloneable$interface java.io.Serializableinterface java.lang.Cl", "");
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test08814() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08814");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.equals((java.lang.CharSequence) "interface java.lang.CloneableAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAringinterface java.io.Serializable", (java.lang.CharSequence) "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa      ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test08815() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08815");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.rightPad("][ssalC", 32, ' ');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "][ssalC                         " + "'", str3, "][ssalC                         ");
    }

    @Test
    public void test08816() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08816");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.rightPad("arrayListArrayListArrayListavaj.gnal                                                                ", 173);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "arrayListArrayListArrayListavaj.gnal                                                                                                                                         " + "'", str2, "arrayListArrayListArrayListavaj.gnal                                                                                                                                         ");
    }

    @Test
    public void test08817() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08817");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.right("hi!ArrayListArrayListArrayListavaj.gnalArrayListArrayListArrayListavaj.gnalArrayListArrayListArrayLi", 484);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!ArrayListArrayListArrayListavaj.gnalArrayListArrayListArrayListavaj.gnalArrayListArrayListArrayLi" + "'", str2, "hi!ArrayListArrayListArrayListavaj.gnalArrayListArrayListArrayListavaj.gnalArrayListArrayListArrayLi");
    }

    @Test
    public void test08818() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08818");
        java.lang.String[] strArray5 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("...", "avaj.gnal", (int) 'a');
        java.lang.String str6 = org.apache.commons.lang3.StringUtils.getCommonPrefix(strArray5);
        int int7 = org.apache.commons.lang3.StringUtils.indexOfAny("][sslC", strArray5);
        java.lang.String[] strArray12 = org.apache.commons.lang3.StringUtils.split("                                                                                                    ", "hi!", (int) (byte) -1);
        int int13 = org.apache.commons.lang3.StringUtils.indexOfDifference((java.lang.CharSequence[]) strArray12);
        boolean boolean14 = org.apache.commons.lang3.StringUtils.startsWithAny("ArrayList", strArray12);
        java.lang.String str16 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray12, "Serializabl");
        java.lang.String str17 = org.apache.commons.lang3.StringUtils.replaceEach("$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$A rrr rrr rrr r...", strArray5, strArray12);
        java.lang.String str18 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray5);
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "..." + "'", str6, "...");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertNotNull(strArray12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "                                                                                                    " + "'", str16, "                                                                                                    ");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$A rrr rrr rrr r                                                                                                    " + "'", str17, "$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$A rrr rrr rrr r                                                                                                    ");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "..." + "'", str18, "...");
    }

    @Test
    public void test08819() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08819");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNotEmpty((java.lang.CharSequence) "##########################################################################Byte###########################################################################");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test08820() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08820");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.upperCase("h!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ihLITU.AVAJ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "H!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IHLITU.AVAJ" + "'", str1, "H!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IHLITU.AVAJ");
    }

    @Test
    public void test08821() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08821");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAllLowerCase((java.lang.CharSequence) "JAVA.LITU.AVAJLITU.AVAJJAVA.LITU.AVAJLITU.AVAJJAVA.LITU.AVAJLITU.AVAJJAVA.LITU.AVAJLITU.AVAJJAVA.LITU.AVAJLITU.AVAJJAVA.LITU.AVAJLITU.AVAJJAVA.LITU.AVAJLITU.AVAJJAVA.LITU.AVAJLITU.AVAJJAVA.LITU.AVAJLITU.AVAJJAVA.LITU.AVAJLITU.AVAJJAVA.LITU.AVAJLITU.AVAJJAVA.LITU.AVAJLITU.AVAJJAVA.LITU.AVAJLITU.AVAJJAVA.LITU.AVAJLITU.AVAJJAVA.LITU.AVAJLITU.AVAJJAVA.LITU.AVAJLITU.AVAJJAVA.LITU.AVAJLITU.AVAJJAVA.LITU.AVAJLITU.AVAJJAVA.LITU.AVAJLITU.AVAJJAVA.LITU.AVAJLITU.AVAJJAVA.LITU.AVAJLITU.AVAJJAVA.LITU.AVAJLITU.AVAJJAVA.LITU.AVAJLITU.AVAJJAVA.LITU.AVAJLITU.AVAJJAVA.LITU.AVAJLITU.AVAJJAVA.LITU.AVAJLITU.AVAJJAVA.LITU.AVAJLITU.AVAJJAVA.LITU.AVAJLITU.AVAJJAVA.LITU.AVAJLITU.AVAJJAVA.LITU.AVAJLITU.AVAJJAVA.LITU.AVAJLITU.AVAJJAVA.LITU.AVAJLITU.AVAJJAVA.LITU.AVAJLITU");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test08822() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08822");
        int int3 = org.apache.commons.lang3.StringUtils.indexOf("arryList", (int) (short) 1, 423);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test08823() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08823");
        int int3 = org.apache.commons.lang3.StringUtils.ordinalIndexOf("44444444444444444444444444444444", "lC.gnal.avaj ecafretnielbazilaireS.oi.avaj ecafretni$elbaenolC.gnal.avaj ecafretnielbazilaireS.oi.avaj ecafretni$elbaenolC.gnal.avaj ecafretni$gnal.avaj", (int) '.');
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test08824() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08824");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAllLowerCase((java.lang.CharSequence) "NAL....................");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test08825() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08825");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.defaultString("class java.lang.Classclass java.lang.Classclass java.lang.Classclass java.lang.Classclass java.lang.Classclass java.lang.Classclass java.lang.Classclass java.lang.Classclass java.lang.Classclass java.lang.Classclass java.lang.Classclass java.lang.Classclass java.lang.Classclass java.lang.Classclass java.lang.Classclass java.lang.Classclass java.lang.Classclass java.lang.Classclass java.lang.Classclass java.lang.Classclass java.lang.Classclass java.lang.Classclass java.lang.Classclass java.lang.Classclass java.lang.Classclass java.lang.Classclass java.lang.Classclass java.lang.Classclass java.lang.Classclass java.lang.Class");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "class java.lang.Classclass java.lang.Classclass java.lang.Classclass java.lang.Classclass java.lang.Classclass java.lang.Classclass java.lang.Classclass java.lang.Classclass java.lang.Classclass java.lang.Classclass java.lang.Classclass java.lang.Classclass java.lang.Classclass java.lang.Classclass java.lang.Classclass java.lang.Classclass java.lang.Classclass java.lang.Classclass java.lang.Classclass java.lang.Classclass java.lang.Classclass java.lang.Classclass java.lang.Classclass java.lang.Classclass java.lang.Classclass java.lang.Classclass java.lang.Classclass java.lang.Classclass java.lang.Classclass java.lang.Class" + "'", str1, "class java.lang.Classclass java.lang.Classclass java.lang.Classclass java.lang.Classclass java.lang.Classclass java.lang.Classclass java.lang.Classclass java.lang.Classclass java.lang.Classclass java.lang.Classclass java.lang.Classclass java.lang.Classclass java.lang.Classclass java.lang.Classclass java.lang.Classclass java.lang.Classclass java.lang.Classclass java.lang.Classclass java.lang.Classclass java.lang.Classclass java.lang.Classclass java.lang.Classclass java.lang.Classclass java.lang.Classclass java.lang.Classclass java.lang.Classclass java.lang.Classclass java.lang.Classclass java.lang.Classclass java.lang.Class");
    }

    @Test
    public void test08826() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08826");
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.replace("...$$$$$$$$$$$$$$$..", "Arra", "h!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ihLITU.AVAJ", 423);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "...$$$$$$$$$$$$$$$.." + "'", str4, "...$$$$$$$$$$$$$$$..");
    }

    @Test
    public void test08827() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08827");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceChars("AVAJ", "arr... aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa... aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa... aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa... aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa... aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa... aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa... aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa... aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa... aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa... aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaylist", "ArrayLis...VA.LANGAVAJ.GNALJAVA.LANGAVAJ.GNALJAVA.LANGAVAJ.GNALJAVA.LANGAVAJ.GNALJAVA.LANGAVAJ.GNALJAVA.LANG");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "AVAJ" + "'", str3, "AVAJ");
    }

    @Test
    public void test08828() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08828");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("AAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAA", "$", 929);
        java.lang.Class<?> wildcardClass4 = strArray3.getClass();
        java.lang.String str6 = org.apache.commons.lang3.ClassUtils.getPackageName((java.lang.Object) wildcardClass4, "$         44444444444444444444444444444444444444444444444444444444444444444444444444444444                                                           ");
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "java.lang" + "'", str6, "java.lang");
    }

    @Test
    public void test08829() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08829");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.chomp("INTEGE");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "INTEGE" + "'", str1, "INTEGE");
    }

    @Test
    public void test08830() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08830");
        java.lang.String str1 = org.apache.commons.lang3.ClassUtils.getPackageCanonicalName(" AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
    }

    @Test
    public void test08831() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08831");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.split("rgnaluavaj", ".langGNAL..langjava.langAGNAL.AVAJ");
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test08832() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08832");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBefore("SLITuGNIRTsSLITuGNIRTsSLITuGNIRTsSLITuGNIRTsSL", "string");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "SLITuGNIRTsSLITuGNIRTsSLITuGNIRTsSLITuGNIRTsSL" + "'", str2, "SLITuGNIRTsSLITuGNIRTsSLITuGNIRTsSLITuGNIRTsSL");
    }

    @Test
    public void test08833() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08833");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("interface java.lang.Cloneable4interface java.io.Serializabl", "][sslC", 22);
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.getCommonPrefix(strArray3);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "interface java.lang.Cloneable4interface java.io.Serializabl" + "'", str4, "interface java.lang.Cloneable4interface java.io.Serializabl");
    }

    @Test
    public void test08834() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08834");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.center("vvaylasa", 487);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                                                                                                                                                                                                                               vvaylasa                                                                                                                                                                                                                                                " + "'", str2, "                                                                                                                                                                                                                                               vvaylasa                                                                                                                                                                                                                                                ");
    }

    @Test
    public void test08835() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08835");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.substringsBetween("                                                                                                    ", "################################...       AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA", "                       JAVAULANGRRAYLIST");
        org.junit.Assert.assertNull(strArray3);
    }

    @Test
    public void test08836() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08836");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.defaultIfEmpty("interface java.lang.CloneableVAJinterface java.io.Serializable", "                                  $$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "interface java.lang.CloneableVAJinterface java.io.Serializable" + "'", str2, "interface java.lang.CloneableVAJinterface java.io.Serializable");
    }

    @Test
    public void test08837() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08837");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("                      ", ' ');
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.stripAll(strArray3);
        java.lang.String[] strArray5 = org.apache.commons.lang3.StringUtils.stripAll(strArray3);
        java.lang.String[] strArray8 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("....................................................................                       j v ul ng", "Java.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.lang");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str9 = org.apache.commons.lang3.StringUtils.replaceEachRepeatedly("aVAJ.GNALAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA       CharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterChara", strArray3, strArray8);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Search and Replace array lengths don't match: 23 vs 1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertNotNull(strArray8);
    }

    @Test
    public void test08838() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08838");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.chomp("                                                                                                                                                                                                                 util                                                                                                                                                                                                                  ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "                                                                                                                                                                                                                 util                                                                                                                                                                                                                  " + "'", str1, "                                                                                                                                                                                                                 util                                                                                                                                                                                                                  ");
    }

    @Test
    public void test08839() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08839");
        int int3 = org.apache.commons.lang3.StringUtils.ordinalIndexOf("A..ayL A.", "", 664);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test08840() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08840");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.containsWhitespace("java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java.......");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test08841() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08841");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNotBlank((java.lang.CharSequence) "                                                                                                                                                                                                                                                                                                               ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test08842() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08842");
        int int3 = org.apache.commons.lang3.StringUtils.indexOf("                                                                                                                                                                                                                                                                                                               ", ".ArrayListArrayListArrayListArrayLis", 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test08843() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08843");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.containsWhitespace("JavastringslitUgnirtSarraylistarraylistavaj.gnalarraylistarraylistarrayl");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test08844() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08844");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.left("a..ayl a", 0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test08845() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08845");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.split("....................................................................                       javaulang", 'a');
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.stripAll(strArray3);
        java.lang.String[] strArray8 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("                       JAVAULANGrrayList", "java.lang", (int) (short) 0);
        java.lang.String str10 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray8, "$ $ $ $ $ $ $ $ $ $ $ $ $ $ $ $ $ $ $ $ $ $ $ $ $ $ $ $ $ $ $ $ $ $ $ $ $ $ $ $ $ $ $ $ $ $ $ $ $ $ $ $ $ $ $ $ $ $ $ $ $ $ $ $ $ $ $ $ $ $ $ $ $ $ $ $ $ $ $ $ $ $ $ $ $ $ $ $ $ $ $ $ $ $ $ $ $ $ $ $");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str11 = org.apache.commons.lang3.StringUtils.replaceEachRepeatedly("interface java.lang.CloneableJ#v#.l#ngj#v#.l#ngj#v#.l#ngj#v#.l#ngj#v#.l#ngj#v#.l#ngj#v#.l#ngj#v#.l#ngj#v#.l#ngj#v#.l#ngj#v#.l#ngj#v#.l#ngj#v#.l#ngj#v#.l#ngj#v#.l#ngj#v#.l#ngj#v#.l#ngj#v#.l#ngj#v#.l#ngj#v#.l#ngj#v#.l#ngj#v#.l#ngj#v#.l#ngj#v#.l#ngj#v#.l#ngj#v#.l#ngj#v#.l#ngj#v#.l#ngj#v#.l#ngj#v#.l#ngj#v#.l#ngj#v#.l#ngj#v#.l#nginterface java.io.Serializabl", strArray4, strArray8);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Search and Replace array lengths don't match: 4 vs 1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "                       JAVAULANGrrayList" + "'", str10, "                       JAVAULANGrrayList");
    }

    @Test
    public void test08846() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08846");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isEmpty((java.lang.CharSequence) "NTERFACE JAVA.LANG.cLONEABLE.......JAVA..........JAVA..........JAVA..........JAVA..........JA...");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test08847() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08847");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.rightPad("GNALUAVAJGNALUAVAJGNALUAVAJGNALUAVAJGNALUAVAJGNALUAVAJGNALUAVAJGNALUAVAJGNALUAVAJGNALUAVAJGNALUAVAJGNALUAVAJGNALUAVAJGNALUAVAJGNALUAVAJGNALUAVAJGNALUAVAJGNALUAVAJGNALUAVAJGNALUAVAJSSALCGNALAVAJSSALC", 576);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "GNALUAVAJGNALUAVAJGNALUAVAJGNALUAVAJGNALUAVAJGNALUAVAJGNALUAVAJGNALUAVAJGNALUAVAJGNALUAVAJGNALUAVAJGNALUAVAJGNALUAVAJGNALUAVAJGNALUAVAJGNALUAVAJGNALUAVAJGNALUAVAJGNALUAVAJGNALUAVAJSSALCGNALAVAJSSALC                                                                                                                                                                                                                                                                                                                                                                                          " + "'", str2, "GNALUAVAJGNALUAVAJGNALUAVAJGNALUAVAJGNALUAVAJGNALUAVAJGNALUAVAJGNALUAVAJGNALUAVAJGNALUAVAJGNALUAVAJGNALUAVAJGNALUAVAJGNALUAVAJGNALUAVAJGNALUAVAJGNALUAVAJGNALUAVAJGNALUAVAJGNALUAVAJSSALCGNALAVAJSSALC                                                                                                                                                                                                                                                                                                                                                                                          ");
    }

    @Test
    public void test08848() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08848");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trimToEmpty("AAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAja                                              AAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAring");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "AAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAja                                              AAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAring" + "'", str1, "AAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAja                                              AAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAring");
    }

    @Test
    public void test08849() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08849");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlpha((java.lang.CharSequence) "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                       CLASSJAVA.LANGAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAULANG");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test08850() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08850");
        char[] charArray6 = new char[] { ' ', '$', '.' };
        boolean boolean7 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "..", charArray6);
        boolean boolean8 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "-1java.utilString[]", charArray6);
        boolean boolean9 = org.apache.commons.lang3.StringUtils.containsAny("                                                                                                                                                      ...", charArray6);
        org.junit.Assert.assertNotNull(charArray6);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray6), " $.");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray6), " $.");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray6), "[ , $, .]");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test08851() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08851");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("#                                   ", "jAVA.L$ArrayListaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", 448);
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void test08852() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08852");
        java.lang.String[] strArray5 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("$       ", "class java.lang.String", 35);
        int int6 = org.apache.commons.lang3.StringUtils.lastIndexOfAny("javal.agn", strArray5);
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray5);
        java.lang.String[] strArray11 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("gn                                            ", "$", (int) (short) -1);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str12 = org.apache.commons.lang3.StringUtils.replaceEach("44444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444Chaace", strArray5, strArray11);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Search and Replace array lengths don't match: 8 vs 1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 9 + "'", int6 == 9);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "$" + "'", str7, "$");
        org.junit.Assert.assertNotNull(strArray11);
    }

    @Test
    public void test08853() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08853");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "                                  $$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$", "AAAAjGNALAAAAAjAAAAAAAAjAGNALAAVAJ                                                                  ");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test08854() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08854");
        int int2 = org.apache.commons.lang3.StringUtils.indexOf("ClassJAVA.LANGaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaULANG", "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                 ");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test08855() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08855");
        java.lang.CharSequence charSequence2 = org.apache.commons.lang3.StringUtils.defaultIfBlank((java.lang.CharSequence) "va1j", (java.lang.CharSequence) "                                                                                                    ");
        org.junit.Assert.assertEquals("'" + charSequence2 + "' != '" + "va1j" + "'", charSequence2, "va1j");
    }

    @Test
    public void test08856() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08856");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.defaultIfBlank("SE...               ...", "java$");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "SE...               ..." + "'", str2, "SE...               ...");
    }

    @Test
    public void test08857() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08857");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOfIgnoreCase("nterface java.lang.Cloneable.......java.......", "$$$$$$$$$$$$..", 91);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test08858() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08858");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceChars("Hi!ArrayLis", '#', 'a');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Hi!ArrayLis" + "'", str3, "Hi!ArrayLis");
    }

    @Test
    public void test08859() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08859");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.chomp("CLASSSLITUGNIRTSSLITUGNIRTSSLITUGNIRTSSLITUGNIRTSSLITUGNIRTSSLITUGNIRTSSLITUGNIRTSSLITUGNIRTSSLITUGNIRTSSLITUGNIRTS", "NAL.");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "CLASSSLITUGNIRTSSLITUGNIRTSSLITUGNIRTSSLITUGNIRTSSLITUGNIRTSSLITUGNIRTSSLITUGNIRTSSLITUGNIRTSSLITUGNIRTSSLITUGNIRTS" + "'", str2, "CLASSSLITUGNIRTSSLITUGNIRTSSLITUGNIRTSSLITUGNIRTSSLITUGNIRTSSLITUGNIRTSSLITUGNIRTSSLITUGNIRTSSLITUGNIRTSSLITUGNIRTS");
    }

    @Test
    public void test08860() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08860");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.defaultIfEmpty("gnaaaaaa...aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "javaaaaaaaaaava.langava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.lang$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "gnaaaaaa...aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa" + "'", str2, "gnaaaaaa...aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
    }

    @Test
    public void test08861() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08861");
        java.lang.Object obj0 = null;
        java.lang.String str2 = org.apache.commons.lang3.ClassUtils.getShortCanonicalName(obj0, "L.Arr yList");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "L.Arr yList" + "'", str2, "L.Arr yList");
    }

    @Test
    public void test08862() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08862");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.left(".........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........javainterface java.io.Serializable", 275);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + ".........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java.........." + "'", str2, ".........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........");
    }

    @Test
    public void test08863() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08863");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.split("ClassJAVA.LANGaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaULANG", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaagn                                            ", 423);
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.getCommonPrefix(strArray3);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
    }

    @Test
    public void test08864() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08864");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBetween("interface java.lang.CloneableINTERFACE JAVA.LANG.CLONEABLELANG.GNALJAVA.LANGAVAJ.GNALJAVA.LANGAVAJ.GNALJAVA.LANGAVAJ.GNALJAVA.LANGAVAJ.GNALJAVA.LANGAVAJ.GNALJAVA.LANGAVAJ.GNALJAVA.LANGAVAJ.GNALJAVA.LANGAVAJ.JAVAINTERFACE JAVA.IO.SERIALIZABLEinterface java.io.Serializableinterface java.lang.CloneableINTERFACE JAVA.LANG.CLONEABLELANG.GNALJAVA.LANGAVAJ.GNALJAVA.LANGAVAJ.GNALJAVA.LANGAVAJ.GNALJAVA.LANGAVAJ.GNALJAVA.LANGAVAJ.GNALJAVA.LANGAVAJ.GNALJAVA.LANGAVAJ.GNALJAVASTRINGinterface java.lang.CloneableINTERFACE JAVA.LANG.CLONEABLELANG.GNALJAVA.LANGAVAJ.GNALJAVA.LANGAVAJ.GNALJAVA.LANGAVAJ.GNALJAVA.LANGAVAJ.GNALJAVA.LANGAVAJ.GNALJAVA.LANGAVAJ.GNALJAVA.LANGAVAJ.GNALJAVA.LANGAVAJ.JAVAINTERFACE JAVA.IO.SERIALIZABLEinterface java.io.Serializableinterface java.lang.CloneableINTERFACE JAVA.LANG.CLONEABLELANG.GNALJAVA.LANGAVAJ.GNALJAVA.LANGAVAJ.GNALJAVA.LANGAVAJ.GNALJAVA.LANGAVAJ.GNALJAVA.LANGAVAJ.GNALJAVA.LANGAVAJ.GNALJAVA.LANGAVAJ.GNALJAVA.", "lang.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.1aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaajava.1aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa.1aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa.1aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa.1aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa.1aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa.1aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa.1aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa.1aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa.hi!arraylistarraylistarraylistavaj");
        org.junit.Assert.assertNull(str2);
    }

    @Test
    public void test08865() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08865");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsAny("AVAJ.GNALNaaaaaaaaaaJAVAL.AGNaaaaaaaaaaJAVAL.AGNaaaaaaaaaaJAARRAYLISTARRAYLISTARRAYLISTAVAJ", "aaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test08866() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08866");
        java.lang.String str1 = org.apache.commons.lang3.ClassUtils.getPackageName("RFACE JAVA.LANG.CLONEABLELANG.GNALJAVA.LANGAVAJ.GNALJAVA.LANGAVAJ.GNALJAVA.LANGAVAJ.GNALJAVA.LANGAVAJ.GNALJAVA.LANGAVAJ.GNALJAVA.LANGAVAJ.GN");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "RFACE JAVA.LANG.CLONEABLELANG.GNALJAVA.LANGAVAJ.GNALJAVA.LANGAVAJ.GNALJAVA.LANGAVAJ.GNALJAVA.LANGAVAJ.GNALJAVA.LANGAVAJ.GNALJAVA.LANGAVAJ" + "'", str1, "RFACE JAVA.LANG.CLONEABLELANG.GNALJAVA.LANGAVAJ.GNALJAVA.LANGAVAJ.GNALJAVA.LANGAVAJ.GNALJAVA.LANGAVAJ.GNALJAVA.LANGAVAJ.GNALJAVA.LANGAVAJ");
    }

    @Test
    public void test08867() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08867");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNotEmpty((java.lang.CharSequence) "... ... ... ... ... ... ... ... ... ... ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test08868() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08868");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.reverseDelimited("GNALUAVAJGNALUAVAJGNALUAVAJGNALUAVAJGNALUAVAJGNALUAVAJGNALUAVAJGNALUAVAJGNALUAVAJGNALUAVAJGNALUAVAJGNALUAVAJGNALUAVAJGNALUAVAJGNALUAVAJGNALUAVAJGNALUAVAJGNALUAVAJGNALUAVAJGNALUAVAJSSALCGNALAVAJSSALC", '.');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "GNALUAVAJGNALUAVAJGNALUAVAJGNALUAVAJGNALUAVAJGNALUAVAJGNALUAVAJGNALUAVAJGNALUAVAJGNALUAVAJGNALUAVAJGNALUAVAJGNALUAVAJGNALUAVAJGNALUAVAJGNALUAVAJGNALUAVAJGNALUAVAJGNALUAVAJGNALUAVAJSSALCGNALAVAJSSALC" + "'", str2, "GNALUAVAJGNALUAVAJGNALUAVAJGNALUAVAJGNALUAVAJGNALUAVAJGNALUAVAJGNALUAVAJGNALUAVAJGNALUAVAJGNALUAVAJGNALUAVAJGNALUAVAJGNALUAVAJGNALUAVAJGNALUAVAJGNALUAVAJGNALUAVAJGNALUAVAJGNALUAVAJSSALCGNALAVAJSSALC");
    }

    @Test
    public void test08869() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08869");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.left("Byte", (int) (short) 10);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Byte" + "'", str2, "Byte");
    }

    @Test
    public void test08870() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08870");
        java.lang.String str1 = org.apache.commons.lang3.ClassUtils.getShortClassName("AtsiLytcejbO.gnal.avajssalcrrAtsiLytcejbO.gnal.avajssalcrrAva.langGNAL..langjava.langAGNALelbazilaireSelbazilaireSelbazilaireSelbazilaireSelbazilaireSelbazilaireSelbazilaireSelbazilaireSelbazilaireSelbazilaireSelbazilaireSelbazilaireSelbazilaireSelbazilaireSelbazilaireSelbazilaireSelbazilaireSelbazilaireSelbazilaireSelbazilaireSelbazilaireSelbazilaireSelbazilaireSelbazilaireSelbazilaireSelbazilaireSelbazilaireSelbazilaireSelbazilaireSelbazilaireSelbazilaireSelbazilaireSelbazilaireSe");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "langAGNALelbazilaireSelbazilaireSelbazilaireSelbazilaireSelbazilaireSelbazilaireSelbazilaireSelbazilaireSelbazilaireSelbazilaireSelbazilaireSelbazilaireSelbazilaireSelbazilaireSelbazilaireSelbazilaireSelbazilaireSelbazilaireSelbazilaireSelbazilaireSelbazilaireSelbazilaireSelbazilaireSelbazilaireSelbazilaireSelbazilaireSelbazilaireSelbazilaireSelbazilaireSelbazilaireSelbazilaireSelbazilaireSelbazilaireSe" + "'", str1, "langAGNALelbazilaireSelbazilaireSelbazilaireSelbazilaireSelbazilaireSelbazilaireSelbazilaireSelbazilaireSelbazilaireSelbazilaireSelbazilaireSelbazilaireSelbazilaireSelbazilaireSelbazilaireSelbazilaireSelbazilaireSelbazilaireSelbazilaireSelbazilaireSelbazilaireSelbazilaireSelbazilaireSelbazilaireSelbazilaireSelbazilaireSelbazilaireSelbazilaireSelbazilaireSelbazilaireSelbazilaireSelbazilaireSelbazilaireSe");
    }

    @Test
    public void test08871() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08871");
        int int2 = org.apache.commons.lang3.StringUtils.getLevenshteinDistance((java.lang.CharSequence) "interfacejava.lang.Cloneable#interfacejava.iointerfacejava.lang.Cloneable#interfacejava.iointerfacejava.la", (java.lang.CharSequence) "                      ");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 106 + "'", int2 == 106);
    }

    @Test
    public void test08872() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08872");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.abbreviateMiddle("interface java.lang.CloneableJ#v#.l#ngj#v#.l#ngj#v#.l#ngj#v#.l#ngj#v#.l#ngj#v#.l#ngj#v#.l#ngj#v#.l#ngj#v#.l#ngj#v#.l#ngj#v#.l#ngj#v#.l#ngj#v#.l#ngj#v#.l#ngj#v#.l#ngj#v#.l#ngj#v#.l#ngj#v#.l#ngj#v#.l#ngj#v#.l#ngj#v#.l#ngj#v#.l#ngj#v#.l#ngj#v#.l#ngj#v#.l#ngj#v#.l#ngj#v#.l#ngj#v#.l#ngj#v#.l#ngj#v#.l#ngj#v#.l#ngj#v#.l#ngj#v#.l#nginterface java.io.Serializabl", "Javaaaaaaaaaava.langava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.lang$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$", 26);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "interface java.lang.CloneableJ#v#.l#ngj#v#.l#ngj#v#.l#ngj#v#.l#ngj#v#.l#ngj#v#.l#ngj#v#.l#ngj#v#.l#ngj#v#.l#ngj#v#.l#ngj#v#.l#ngj#v#.l#ngj#v#.l#ngj#v#.l#ngj#v#.l#ngj#v#.l#ngj#v#.l#ngj#v#.l#ngj#v#.l#ngj#v#.l#ngj#v#.l#ngj#v#.l#ngj#v#.l#ngj#v#.l#ngj#v#.l#ngj#v#.l#ngj#v#.l#ngj#v#.l#ngj#v#.l#ngj#v#.l#ngj#v#.l#ngj#v#.l#ngj#v#.l#nginterface java.io.Serializabl" + "'", str3, "interface java.lang.CloneableJ#v#.l#ngj#v#.l#ngj#v#.l#ngj#v#.l#ngj#v#.l#ngj#v#.l#ngj#v#.l#ngj#v#.l#ngj#v#.l#ngj#v#.l#ngj#v#.l#ngj#v#.l#ngj#v#.l#ngj#v#.l#ngj#v#.l#ngj#v#.l#ngj#v#.l#ngj#v#.l#ngj#v#.l#ngj#v#.l#ngj#v#.l#ngj#v#.l#ngj#v#.l#ngj#v#.l#ngj#v#.l#ngj#v#.l#ngj#v#.l#ngj#v#.l#ngj#v#.l#ngj#v#.l#ngj#v#.l#ngj#v#.l#ngj#v#.l#nginterface java.io.Serializabl");
    }

    @Test
    public void test08873() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08873");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trimToEmpty("...VA.LANGAVAJ.GNALJAVA.LANGAVAJ.GNALJAVA.LANGAVAJ.GNALJAVA.LANGAVAJ.GNALJAVA.LANGAVAJ.GNALJAVA.LANG");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "...VA.LANGAVAJ.GNALJAVA.LANGAVAJ.GNALJAVA.LANGAVAJ.GNALJAVA.LANGAVAJ.GNALJAVA.LANGAVAJ.GNALJAVA.LANG" + "'", str1, "...VA.LANGAVAJ.GNALJAVA.LANGAVAJ.GNALJAVA.LANGAVAJ.GNALJAVA.LANGAVAJ.GNALJAVA.LANGAVAJ.GNALJAVA.LANG");
    }

    @Test
    public void test08874() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08874");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAsciiPrintable((java.lang.CharSequence) "Jav4444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444aaaaaaaaaava.langava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.lang");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test08875() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08875");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringAfterLast("Llitu...O.gnal.avaj ssalcr4444444444444444444444444444444444444444444444444444444444444444444444444444444...O.", "aaa    aaa");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test08876() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08876");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.rightPad("interfce jv.lng.cloneble", 0, "A..ayLA");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "interfce jv.lng.cloneble" + "'", str3, "interfce jv.lng.cloneble");
    }

    @Test
    public void test08877() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08877");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.startsWithIgnoreCase("class java.lang.Class", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test08878() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08878");
        java.lang.String str1 = org.apache.commons.lang3.ClassUtils.getPackageCanonicalName("AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
    }

    @Test
    public void test08879() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08879");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsIgnoreCase("$         44444444444444444444444444444444444444444444444444444444444444444444444444444444                                                           ", "ssalc gnirtS.gnal.avaj");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test08880() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08880");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.containsWhitespace("-1java");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test08881() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08881");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBefore("... AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA... AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA... AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA... AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA... AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA... AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA... AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA... AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA... AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA... AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA", "JAVA.L$ArrayAAAAAAAAAA");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "... AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA... AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA... AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA... AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA... AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA... AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA... AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA... AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA... AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA... AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA" + "'", str2, "... AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA... AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA... AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA... AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA... AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA... AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA... AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA... AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA... AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA... AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA");
    }

    @Test
    public void test08882() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08882");
        int int2 = org.apache.commons.lang3.StringUtils.indexOf("LANGgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalg", "44444444444444444444444444444444");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test08883() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08883");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringAfterLast("irfCo$irfioSriizaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "                                                                                                                                                                                                                                                                         AAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAA");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test08884() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08884");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.defaultIfEmpty("javaStringnalArrayListArrayListArrayListavaj.gnalArrayListArrayListArrayLi", "gnal.avaj");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "javaStringnalArrayListArrayListArrayListavaj.gnalArrayListArrayListArrayLi" + "'", str2, "javaStringnalArrayListArrayListArrayListavaj.gnalArrayListArrayListArrayLi");
    }

    @Test
    public void test08885() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08885");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOf("avajgnal.avajgnal.avajgnal.avajgnal.avajgnal.avajgnal.avajgnal.avajgnal.avajgnal.avaJ", (int) (byte) -1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test08886() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08886");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOfIgnoreCase("...       aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "interfac                                    ");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test08887() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08887");
        java.lang.CharSequence charSequence1 = null;
        boolean boolean2 = org.apache.commons.lang3.StringUtils.equals((java.lang.CharSequence) "String", charSequence1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test08888() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08888");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass1 = org.apache.commons.lang3.ClassUtils.getClass("INTERFACE JAVA.LANG.cLONEABLEsTRING");
            org.junit.Assert.fail("Expected exception of type java.lang.ClassNotFoundException; message: INTERFACEJAVA.LANG.cLONEABLEsTRING");
        } catch (java.lang.ClassNotFoundException e) {
            // Expected exception.
        }
    }

    @Test
    public void test08889() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08889");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.startsWithIgnoreCase("nterface java.lang.Cloneable.......java.......", "arra");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test08890() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08890");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeEnd("interface java.lang.CloneableStringinterface java.io.Serializable", " AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "interface java.lang.CloneableStringinterface java.io.Serializable" + "'", str2, "interface java.lang.CloneableStringinterface java.io.Serializable");
    }

    @Test
    public void test08891() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08891");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.strip("                       JAVAULANGrrayList", "JAVA.LANG.CLONEABLE...                                 INTERFACE JAVA.IO.SERIALIZABLE");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "ULANGrrayList" + "'", str2, "ULANGrrayList");
    }

    @Test
    public void test08892() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08892");
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.overlay("$                                                                                            ", "                                                                                                                                                                                                                                               vvaylasa                                                                                                                                                                                                                                                ", 423, (int) (short) -1);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "                                                                                                                                                                                                                                               vvaylasa                                                                                                                                                                                                                                                " + "'", str4, "                                                                                                                                                                                                                                               vvaylasa                                                                                                                                                                                                                                                ");
    }

    @Test
    public void test08893() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08893");
        java.lang.String str1 = org.apache.commons.lang3.ClassUtils.getPackageCanonicalName("                                                                                                                                                                                                                                             HI!aRRAYlISTaRRAYlISTaRRAYlISTAVAJ.GNALaRRAYlISTaRRAYlISTaRRAYlISTAVAJ                                                                                                                                                                                                                                              javaStrinSerializableSerializableSerializableSerialijavaStrinSerializableSerializableSerializableSerialijavaStrinSerializableSerializableSerializableSerialijavaStrinSerializableSerializableSerializableSerialijavaStrinSerializableSerializableSerializableSerialijavaStrinSerializableSerializableSerializableSerialijavaStrinSerializableSerializableSerializableSerialijavaStrinSerializableSerializable");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "HI!aRRAYlISTaRRAYlISTaRRAYlISTAVAJ" + "'", str1, "HI!aRRAYlISTaRRAYlISTaRRAYlISTAVAJ");
    }

    @Test
    public void test08894() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08894");
        char[] charArray9 = new char[] { ' ', ' ', '#', 'a', '4', 'a' };
        int int10 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "", charArray9);
        boolean boolean11 = org.apache.commons.lang3.StringUtils.containsAny("$", charArray9);
        boolean boolean12 = org.apache.commons.lang3.StringUtils.containsAny("...       AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA...       AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA...       AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA...       AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA...       AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA...       AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA...       AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA...       AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA...       AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA...       AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA", charArray9);
        org.junit.Assert.assertNotNull(charArray9);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray9), "  #a4a");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray9), "  #a4a");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray9), "[ ,  , #, a, 4, a]");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test08895() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08895");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.containsWhitespace("LANG.GNALJAVA.LANGAVAJ.GNALJAVA.LANGAVAJ.GNALJAVA.LANGAVAJ.GNALJAVA.LA");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test08896() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08896");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNotEmpty((java.lang.CharSequence) "  $         $         $         $         $         $         $         $         $         $         $         $ ...");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test08897() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08897");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.right(".#####################################################################", 53);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "#####################################################" + "'", str2, "#####################################################");
    }

    @Test
    public void test08898() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08898");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOf("JAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANG", "       ############################################");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test08899() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08899");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.uncapitalize((java.lang.CharSequence) "       44444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "       44444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444" + "'", str1, "       44444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444");
    }

    @Test
    public void test08900() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08900");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBefore("-1A.A.Auti.StriAj-1A.A.Auti.StriAj", ".lang.Stringclass java.lang.Stringclass java.lang.Stringclas");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "-1A.A.Auti.StriAj-1A.A.Auti.StriAj" + "'", str2, "-1A.A.Auti.StriAj-1A.A.Auti.StriAj");
    }

    @Test
    public void test08901() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08901");
        int int3 = org.apache.commons.lang3.StringUtils.ordinalIndexOf("ulitulitulitulitul####litulitulitulitulitul", "JAVA", 3);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test08902() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08902");
        int int3 = org.apache.commons.lang3.StringUtils.indexOf("CLASSjava.langAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAulang", "gnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnal.LANG.LANG.LANG.LANG.LANG.LANG.Llituava.la", 99);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test08903() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08903");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("aaaaaaaaaajaval.agnaaaaaaaaaajaval.agnaaaaaaaaaajaval.agnaaaaaaaaaajaval.agnaaaaaaaaaajaval.agnaaaaaaaaaajaval.agnaaaaaaaaaajaval.agnaaaaaaaaaajaval.agnaaaaaaaaaajaval.agnaaaaaaaaaajaval.agnaaaaaaaaaajaval.agnaaaaaaaaaajaval.agnaaaaaaaaaaja                                              aaaaaaajaval.agnaaaaaaaaaajaval.agnaaaaaaaaaajaval.agnaaaaaaaaaajaval.agnaaaaaaaaaajaval.agnaaaaaaaaaajaval.agnaaaaaaaaaajaval.agnaaaaaaaaaajaval.agnaaaaaaaaaajaval.agnaaaaaaaaaajaval.agnaaaaaaaaaajaval.agnaaaaaaaaaajaval.agnaaaaaaaaaaring", ' ');
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test08904() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08904");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBefore("classjavalangClassJAVAULANGJAVAULANGJAVAULANGJAVAULANGJAVAULANGJAVAULANGJAVAULANGJAVAULANGJAVAULANGJAVAULANGJAVAULANGJAVAULANGJAVAULANGJAVAULANGJAVAULANGJAVAULANGJAVAULANGJAVAULANGJAVAULANGJAVAULANG$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$", "AtsiLytcejbOlvjsslcrrAtsiLytcejbO.gnal.avaj ssalcrrAva.langGNAL..langjava.langAGNAL.AVAJ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "classjavalangClassJAVAULANGJAVAULANGJAVAULANGJAVAULANGJAVAULANGJAVAULANGJAVAULANGJAVAULANGJAVAULANGJAVAULANGJAVAULANGJAVAULANGJAVAULANGJAVAULANGJAVAULANGJAVAULANGJAVAULANGJAVAULANGJAVAULANGJAVAULANG$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$" + "'", str2, "classjavalangClassJAVAULANGJAVAULANGJAVAULANGJAVAULANGJAVAULANGJAVAULANGJAVAULANGJAVAULANGJAVAULANGJAVAULANGJAVAULANGJAVAULANGJAVAULANGJAVAULANGJAVAULANGJAVAULANGJAVAULANGJAVAULANGJAVAULANGJAVAULANG$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$");
    }

    @Test
    public void test08905() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08905");
        java.lang.CharSequence charSequence4 = null;
        char[] charArray13 = new char[] { ' ', ' ', '#', 'a', '4', 'a' };
        int int14 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "", charArray13);
        boolean boolean15 = org.apache.commons.lang3.StringUtils.containsAny("......", charArray13);
        boolean boolean16 = org.apache.commons.lang3.StringUtils.containsOnly(charSequence4, charArray13);
        boolean boolean17 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "AtsiLytcejbO.gnal.avaj ssalcrrAtsiLytcejbO.gnal.avaj ssalcrrAva.langGNAL..langjava.langAGNAL.AVAJ", charArray13);
        int int18 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "JAVA.UTIL.", charArray13);
        boolean boolean19 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "ArrayListArrayListArrayListavajagnal", charArray13);
        boolean boolean20 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "              Llitu               ", charArray13);
        org.junit.Assert.assertNotNull(charArray13);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray13), "  #a4a");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray13), "  #a4a");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray13), "[ ,  , #, a, 4, a]");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test08906() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08906");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfAnyBut("                            rrayList                            rrayList                            rrayList                            rray$ArrayLis", "hi!ArrayListArrayListArrayListavaj.gnalArrayListArrayListArrayListavaj.gnalArrayListArrayListArrayLi");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test08907() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08907");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.startsWithIgnoreCase("...VA.LANGAVAJ.GNALJAVA.LANGAVAJ.GNALJAVA.LANGAVAJ.GNALJAVA.LANGAVAJ.GNALJAVA.LANGAVAJ.GNALJAVA.LANGgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalg", "");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test08908() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08908");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.contains("ArryLis", 7);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test08909() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08909");
        int int3 = org.apache.commons.lang3.StringUtils.indexOfIgnoreCase("rrayListrrayListrrayListrrayListrrayListrrayListrrayListrrayListrrayListrr...    ...rrayListrrayListrrayListrrayListrrayListrrayListrrayListrrayListrrayListrra", "        44444444444444444444444444444444444444444444444444444444444444444444444444444444", 21);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test08910() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08910");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.substringBetween("langAGNALelbazilaireSelbazilaireSelbazilaireSelbazilaireSelbazilaireSelbazilaireSelbazilaireSelbazilaireSelbazilaireSelbazilaireSelbazilaireSelbazilaireSelbazilaireSelbazilaireSelbazilaireSelbazilaireSelbazilaireSelbazilaireSelbazilaireSelbazilaireSelbazilaireSelbazilaireSelbazilaireSelbazilaireSelbazilaireSelbazilaireSelbazilaireSelbazilaireSelbazilaireSelbazilaireSelbazilaireSelbazilaireSelbazilaireSe", "gn lu v j                       ....................................................................", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaajaval#.#agn");
        org.junit.Assert.assertNull(str3);
    }

    @Test
    public void test08911() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08911");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringAfterLast("lang.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.1AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAJava.1AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA.1AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA.1AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA.1AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA.1AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA.1AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA.1AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA.1AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA.hi!ArrayListArrayListArrayListavaj", "gnirtS.ge       .");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test08912() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08912");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.abbreviate("gnalArrayListArrayListArrayLi", 22, 50);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "gnalArrayListArrayListArrayLi" + "'", str3, "gnalArrayListArrayListArrayLi");
    }

    @Test
    public void test08913() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08913");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "#########################################################...", "interface java.lang.cloneable");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 57 + "'", int2 == 57);
    }

    @Test
    public void test08914() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08914");
        java.lang.ClassLoader classLoader0 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass2 = org.apache.commons.lang3.ClassUtils.getClass(classLoader0, "INTERFACE GAGA.LANG.CLONEABLEAAAAAAAAAAGAGAL.AGNAAAAAAAAAAGAGAL.AGNAAAAAAAAAAGAGAL.AGNAAAAAAAAAAGAGAL.AGNAAAAAAAAAAGAGAL.AGNAAAAAAAAAAGAGAL.AGNAAAAAAAAAAGAGAL.AGNAAAAAAAAAAGAGAL.AGNAAAAAAAAAAGAGAL.AGNAAAAAAAAAAGAGAL.AGNAAAAAAAAAAGAGAL.AGNAAAAAAAAAAGAGAL.AGNAAAAAAAAAAGAGAL.AGNAAAAAAAAAAGAGAL.AGNAAAAAAAAAAGAGAL.AGNAAAAAAAAAAGAGAL.AGNAAAAAAAAAAGAGAL.AGNAAAAAAAAAAGAGAL.AGNAAAAAAAAAAGAGAL.AGNAAAAAAAAAAGAGAL.AGNAAAAAAAAAAGAGAL.AGNAAAAAAAAAAGAGAL.AGNAAAAAAAAAAGAGAL.AGNAAAAAAAAAAGAGAL.AGNAAAAAAAAAAGAGAL.AGNAAAAAAAAAAGAGAL.AGNAAAAAAAAAAGAGAL.AGNAAAAAAAAAAGAGAL.AGNAAAAAAAAAAGAGAL.AGNAAAAAAAAAAGAGAL.AGNAAAAAAAAAAGAGAL.AGNAAAAAAAAAAGAGAL.AGNAAAAAAAAAAGAGAL.AGNAAAAAAAAAAGAGAL.AGNAAAAAAAAAAGAGAL.AGNAAAAAAAAAARINGINTERFACE GAGA.IO.SERIALIZABLE");
            org.junit.Assert.fail("Expected exception of type java.lang.ClassNotFoundException; message: INTERFACEGAGA/LANG/CLONEABLEAAAAAAAAAAGAGAL/AGNAAAAAAAAAAGAGAL/AGNAAAAAAAAAAGAGAL/AGNAAAAAAAAAAGAGAL/AGNAAAAAAAAAAGAGAL/AGNAAAAAAAAAAGAGAL/AGNAAAAAAAAAAGAGAL/AGNAAAAAAAAAAGAGAL/AGNAAAAAAAAAAGAGAL/AGNAAAAAAAAAAGAGAL/AGNAAAAAAAAAAGAGAL/AGNAAAAAAAAAAGAGAL/AGNAAAAAAAAAAGAGAL/AGNAAAAAAAAAAGAGAL/AGNAAAAAAAAAAGAGAL/AGNAAAAAAAAAAGAGAL/AGNAAAAAAAAAAGAGAL/AGNAAAAAAAAAAGAGAL/AGNAAAAAAAAAAGAGAL/AGNAAAAAAAAAAGAGAL/AGNAAAAAAAAAAGAGAL/AGNAAAAAAAAAAGAGAL/AGNAAAAAAAAAAGAGAL/AGNAAAAAAAAAAGAGAL/AGNAAAAAAAAAAGAGAL/AGNAAAAAAAAAAGAGAL/AGNAAAAAAAAAAGAGAL/AGNAAAAAAAAAAGAGAL/AGNAAAAAAAAAAGAGAL/AGNAAAAAAAAAAGAGAL/AGNAAAAAAAAAAGAGAL/AGNAAAAAAAAAAGAGAL/AGNAAAAAAAAAAGAGAL/AGNAAAAAAAAAAGAGAL/AGNAAAAAAAAAAGAGAL/AGNAAAAAAAAAARINGINTERFACEGAGA/IO/SERIALIZABLE");
        } catch (java.lang.ClassNotFoundException e) {
            // Expected exception.
        }
    }

    @Test
    public void test08915() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08915");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.rightPad("                                                                                                                                                                                                                 util                                                                                                                                                                                                                  ", 666);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                                                                                                                                                                                                 util                                                                                                                                                                                                                                                                                                                                                                                                                                                                     " + "'", str2, "                                                                                                                                                                                                                 util                                                                                                                                                                                                                                                                                                                                                                                                                                                                     ");
    }

    @Test
    public void test08916() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08916");
        java.lang.String str2 = org.apache.commons.lang3.ClassUtils.getPackageCanonicalName((java.lang.Object) "                                 int", "sERIALIZABLE");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "java.lang" + "'", str2, "java.lang");
    }

    @Test
    public void test08917() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08917");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.center("                                                                             se...                                                                             ", 13, '#');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "                                                                             se...                                                                             " + "'", str3, "                                                                             se...                                                                             ");
    }

    @Test
    public void test08918() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08918");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.abbreviate("...AAAAAAAAAAAAAAAAAAA      ", 39);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "...AAAAAAAAAAAAAAAAAAA      " + "'", str2, "...AAAAAAAAAAAAAAAAAAA      ");
    }

    @Test
    public void test08919() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08919");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isEmpty((java.lang.CharSequence) "...$$$$$$$$$$$$$$$..                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                            ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test08920() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08920");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("hi!ArrayListArrayListArrayListavajhhhh AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAhhh AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAhhh AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAhhh AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAhhh AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAhhh AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAhhh AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAhhh AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAhhh AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAhhh AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA", 'a');
        boolean boolean4 = org.apache.commons.lang3.StringUtils.endsWithAny("][sslC", strArray3);
        java.lang.String str6 = org.apache.commons.lang3.ClassUtils.getShortClassName((java.lang.Object) strArray3, "interfacejava.lang.CloneableLANG.GNALJAVA.LANGAVAJ.GNALJAVA.LANGAVAJ.GNALJAVA.LANGAVAJ.GNALJAVA.LANGAVAJ.GNALJAVA.LANGAVAJ.GNALJAVA.LANGAVAJ.GNALJAVA.LANGAVAJ.GNALJAVA.LANGAVAJ.JAVAinterfacejava.io.Serializable");
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "String[]" + "'", str6, "String[]");
    }

    @Test
    public void test08921() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08921");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.containsWhitespace("A..ayLA.");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test08922() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08922");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripAccents((java.lang.CharSequence) "                            rrayList");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "                            rrayList" + "'", str1, "                            rrayList");
    }

    @Test
    public void test08923() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08923");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.abbreviateMiddle("A..ayL A##############", "javastring...", 89);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "A..ayL A##############" + "'", str3, "A..ayL A##############");
    }

    @Test
    public void test08924() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08924");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.split("JAVA");
        java.lang.String[] strArray5 = org.apache.commons.lang3.StringUtils.split("AA...", "AAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAA");
        java.lang.String str6 = org.apache.commons.lang3.StringUtils.replaceEachRepeatedly("AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA", strArray2, strArray5);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA" + "'", str6, "AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA");
    }

    @Test
    public void test08925() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08925");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.strip("... ... ... ... ... ... ... ... ... ... GNA");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "... ... ... ... ... ... ... ... ... ... GNA" + "'", str1, "... ... ... ... ... ... ... ... ... ... GNA");
    }

    @Test
    public void test08926() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08926");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substring("                                            ...", 9);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                   ..." + "'", str2, "                                   ...");
    }

    @Test
    public void test08927() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08927");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.remove("                                                             AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA", "BYTEINTERFACE GAGA.LANG.CLONEABLEAAAAAAAAAAGAGAL.AGNAAAAAAAAAAGAGAL.AGNAAAAAAAAAAGAGAL.AGNAAAAAAAAAAGAGAL.AGNAAAAAAAAAAGAGAL.AGNAAAAAAAAAAGAGAL.AGNAAAAAAAAAAGAGAL.AGNAAAAAAAAAAGAGAL.AGNAAAAAAAAAAGAGAL.AGNAAAAAAAAAAGAGAL.AGNAAAAAAAAAAGAGAL.AGNAAAAAAAAAAGAGAL.AGNAAAAAAAAAAGAGAL.AGNAAAAAAAAAAGAGAL.AGNAAAAAAAAAAGAGAL.AGNAAAAAAAAAAGAGAL.AGNAAAAAAAAAAGAGAL.AGNAAAAAAAAAAGAGAL.AGNAAAAAAAAAAGAGAL.AGNAAAAAAAAAAGAGAL.AGNAAAAAAAAAAGAGAL.AGNAAAAAAAAAAGAGAL.AGNAAAAAAAAAAGAGAL.AGNAAAAAAAAAAGAGAL.AGNAAAAAAAAAAGAGAL.AGNAAAAAAAAAAGAGAL.AGNAAAAAAAAAAGAGAL.AGNAAAAAAAAAAGAGAL.AGNAAAAAAAAAAGAGAL.AGNAAAAAAAAAAGAGAL.AGNAAAAAAAAAAGAGAL.AGNAAAAAAAAAAGAGAL.AGNAAAAAAAAAAGAGAL.AGNAAAAAAAAAAGAGAL.AGNAAAAAAAAAAGAGAL.AGNAAAAAAAAAARINGINTERFACE GAGA.IO.SERIALIZABLE");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                                             AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA" + "'", str2, "                                                             AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA");
    }

    @Test
    public void test08928() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08928");
        java.lang.ClassLoader classLoader0 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass3 = org.apache.commons.lang3.ClassUtils.getClass(classLoader0, "javastringnalarraylistarraylistarraylistavaj.gnalarraylistarraylistarrayli", true);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassNotFoundException; message: javastringnalarraylistarraylistarraylistavaj/gnalarraylistarraylistarrayli");
        } catch (java.lang.ClassNotFoundException e) {
            // Expected exception.
        }
    }

    @Test
    public void test08929() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08929");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.substringBetween("aaaaaaaaaaaa                                  ", "BYTEINTERFACE GAGA.LANG.CLONEABLEAAAAAAAAAAGAGAL.AGNAAAAAAAAAAGAGAL.AGNAAAAAAAAAAGAGAL.AGNAAAAAAAAAAGAGAL.AGNAAAAAAAAAAGAGAL.AGNAAAAAAAAAAGAGAL.AGNAAAAAAAAAAGAGAL.AGNAAAAAAAAAAGAGAL.AGNAAAAAAAAAAGAGAL.AGNAAAAAAAAAAGAGAL.AGNAAAAAAAAAAGAGAL.AGNAAAAAAAAAAGAGAL.AGNAAAAAAAAAAGAGAL.AGNAAAAAAAAAAGAGAL.AGNAAAAAAAAAAGAGAL.AGNAAAAAAAAAAGAGAL.AGNAAAAAAAAAAGAGAL.AGNAAAAAAAAAAGAGAL.AGNAAAAAAAAAAGAGAL.AGNAAAAAAAAAAGAGAL.AGNAAAAAAAAAAGAGAL.AGNAAAAAAAAAAGAGAL.AGNAAAAAAAAAAGAGAL.AGNAAAAAAAAAAGAGAL.AGNAAAAAAAAAAGAGAL.AGNAAAAAAAAAAGAGAL.AGNAAAAAAAAAAGAGAL.AGNAAAAAAAAAAGAGAL.AGNAAAAAAAAAAGAGAL.AGNAAAAAAAAAAGAGAL.AGNAAAAAAAAAAGAGAL.AGNAAAAAAAAAAGAGAL.AGNAAAAAAAAAAGAGAL.AGNAAAAAAAAAAGAGAL.AGNAAAAAAAAAAGAGAL.AGNAAAAAAAAAARINGINTERFACE GAGA.IO.SERIALIZABLE", "44444444444444444.444444444444444444");
        org.junit.Assert.assertNull(str3);
    }

    @Test
    public void test08930() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08930");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNumeric((java.lang.CharSequence) "$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$rrayList$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test08931() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08931");
        int int2 = org.apache.commons.lang3.StringUtils.getLevenshteinDistance((java.lang.CharSequence) "jvstringnlrrylistrrylistrrylistvj", (java.lang.CharSequence) "$$$$$$$$$$$$..");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 33 + "'", int2 == 33);
    }

    @Test
    public void test08932() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08932");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.swapCase("][ssalC                         ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "][SSALc                         " + "'", str1, "][SSALc                         ");
    }

    @Test
    public void test08933() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08933");
        java.lang.String str1 = org.apache.commons.lang3.ClassUtils.getPackageCanonicalName("4444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444aaaaaaaaaava");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
    }

    @Test
    public void test08934() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08934");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.repeat("VAJ.GNAL", "AAAAAAAAAAAAAAAAAAAjavaulangAAAAAAAAAAAAAAAAAAA", 5);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "VAJ.GNALAAAAAAAAAAAAAAAAAAAjavaulangAAAAAAAAAAAAAAAAAAAVAJ.GNALAAAAAAAAAAAAAAAAAAAjavaulangAAAAAAAAAAAAAAAAAAAVAJ.GNALAAAAAAAAAAAAAAAAAAAjavaulangAAAAAAAAAAAAAAAAAAAVAJ.GNALAAAAAAAAAAAAAAAAAAAjavaulangAAAAAAAAAAAAAAAAAAAVAJ.GNAL" + "'", str3, "VAJ.GNALAAAAAAAAAAAAAAAAAAAjavaulangAAAAAAAAAAAAAAAAAAAVAJ.GNALAAAAAAAAAAAAAAAAAAAjavaulangAAAAAAAAAAAAAAAAAAAVAJ.GNALAAAAAAAAAAAAAAAAAAAjavaulangAAAAAAAAAAAAAAAAAAAVAJ.GNALAAAAAAAAAAAAAAAAAAAjavaulangAAAAAAAAAAAAAAAAAAAVAJ.GNAL");
    }

    @Test
    public void test08935() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08935");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isEmpty((java.lang.CharSequence) "                                                                                                                                                  4444444");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test08936() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08936");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeStartIgnoreCase("       44444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444", "NAL.");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "       44444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444" + "'", str2, "       44444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444");
    }

    @Test
    public void test08937() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08937");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.endsWithIgnoreCase("                                             ...                                                    ", "interface java.lang.cloneable.....");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test08938() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08938");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.startsWith("gn lu v j                       ....................................................................", "gnal$.$avaj");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test08939() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08939");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isBlank((java.lang.CharSequence) "ra                                         sTRINGuTILSsTRINGuTILSsTRINGuTILSsTRINGuTILSsTRINGuTILSsTRINGuTILSsTRINGuTILSsTRINGuTILSsTRINGuTILSsTRINGuTILS");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test08940() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08940");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.startsWith("AGNaaaaaaaaaaJAARRAYLISTARRAYLISTARRAYLISTAVAJ                                                        ", "gnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnal.LANG.LANG.LANG.LANG.LANG.LANG.Llituava.la");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test08941() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08941");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeStart("AAAAAAAAAA", "rING-1JAVA.UTILsTRING");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "AAAAAAAAAA" + "'", str2, "AAAAAAAAAA");
    }

    @Test
    public void test08942() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08942");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.center("L", 0, 'a');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "L" + "'", str3, "L");
    }

    @Test
    public void test08943() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08943");
        java.lang.ClassLoader classLoader0 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass2 = org.apache.commons.lang3.ClassUtils.getClass(classLoader0, "ArrayLisArrayLisArrayLisArrayLisArr");
            org.junit.Assert.fail("Expected exception of type java.lang.ClassNotFoundException; message: ArrayLisArrayLisArrayLisArrayLisArr");
        } catch (java.lang.ClassNotFoundException e) {
            // Expected exception.
        }
    }

    @Test
    public void test08944() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08944");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.left("$$$$$$java", 487);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "$$$$$$java" + "'", str2, "$$$$$$java");
    }

    @Test
    public void test08945() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08945");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.substringsBetween("tavaj.gnalarraylistarraylistarrayli", "Avaj.gnal", "ttBys");
        org.junit.Assert.assertNull(strArray3);
    }

    @Test
    public void test08946() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08946");
        int int2 = org.apache.commons.lang3.StringUtils.indexOf("interface java.lang.CloneableetyBinterface java.io.Serializable", "aVAJ.GNALAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA       CharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterChara");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test08947() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08947");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.strip("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "aaaaaaaaaajaval.agnaaaaaaaaaajaval.agnaaaaaaaaaajaval.agnaaaaaaaaaajaval.agnaaaaaaaaaajaval.agnaaaaaaaaaajaval.agnaaaaaaaaaajaval.agnaaaaaaaaaajaval.agnaaaaaaaaaajaval.agnaaaaaaaaaajaval.agnaaaaaaaaaajaval.agnaaaaaaaaaajaval.agnaaaaaaaaaaja                                              aaaaaaajaval.agnaaaaaaaaaajaval.agnaaaaaaaaaajaval.agnaaaaaaaaaajaval.agnaaaaaaaaaajaval.agnaaaaaaaaaajaval.agnaaaaaaaaaajaval.agnaaaaaaaaaajaval.agnaaaaaaaaaajaval.agnaaaaaaaaaajaval.agnaaaaaaaaaajaval.agnaaaaaaaaaajaval.agnaaaaaaaaaaring");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test08948() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08948");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.strip("AtsiLytcejbO.gnal.avajssalcrrAtsiLytcejbO.gnal.avajssalcrrAva.langGNAL..langjava.langAGNAL.AVAJAtsiLytcejbO.gnal.avajssalcrrAtsiLytcejbO.gnal.avajssalcrrAva.langGNAL..langjava.langAGNAL.AVAJAtsiLytcejbO.gnal.avajssalcrrAtsiLytcejbO.gnal.avajssalcrrAva.langGNAL..langjava.langAGNAL.AVAJAtsiLytcejbO.gnal.avajssalcrrAtsiLytcejStringAtsiLytcejbO.gnal.avajssalcrrAtsiLytcejbO.gnal.avajssalcrrAva.langGNAL..langjava.langAGNAL.AVAJAtsiLytcejbO.gnal.avajssalcrrAtsiLytcejbO.gnal.avajssalcrrAva.langGNAL..langjava.langAGNAL.AVAJAtsiLytcejbO.gnal.avajssalcrrAtsiLytcejbO.gnal.avajssalcrrAva.langGNAL..langjava.langAGNAL.AVAJAtsiLytcejbO.gnal.avajssalcrrAtsiLytcejb");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "AtsiLytcejbO.gnal.avajssalcrrAtsiLytcejbO.gnal.avajssalcrrAva.langGNAL..langjava.langAGNAL.AVAJAtsiLytcejbO.gnal.avajssalcrrAtsiLytcejbO.gnal.avajssalcrrAva.langGNAL..langjava.langAGNAL.AVAJAtsiLytcejbO.gnal.avajssalcrrAtsiLytcejbO.gnal.avajssalcrrAva.langGNAL..langjava.langAGNAL.AVAJAtsiLytcejbO.gnal.avajssalcrrAtsiLytcejStringAtsiLytcejbO.gnal.avajssalcrrAtsiLytcejbO.gnal.avajssalcrrAva.langGNAL..langjava.langAGNAL.AVAJAtsiLytcejbO.gnal.avajssalcrrAtsiLytcejbO.gnal.avajssalcrrAva.langGNAL..langjava.langAGNAL.AVAJAtsiLytcejbO.gnal.avajssalcrrAtsiLytcejbO.gnal.avajssalcrrAva.langGNAL..langjava.langAGNAL.AVAJAtsiLytcejbO.gnal.avajssalcrrAtsiLytcejb" + "'", str1, "AtsiLytcejbO.gnal.avajssalcrrAtsiLytcejbO.gnal.avajssalcrrAva.langGNAL..langjava.langAGNAL.AVAJAtsiLytcejbO.gnal.avajssalcrrAtsiLytcejbO.gnal.avajssalcrrAva.langGNAL..langjava.langAGNAL.AVAJAtsiLytcejbO.gnal.avajssalcrrAtsiLytcejbO.gnal.avajssalcrrAva.langGNAL..langjava.langAGNAL.AVAJAtsiLytcejbO.gnal.avajssalcrrAtsiLytcejStringAtsiLytcejbO.gnal.avajssalcrrAtsiLytcejbO.gnal.avajssalcrrAva.langGNAL..langjava.langAGNAL.AVAJAtsiLytcejbO.gnal.avajssalcrrAtsiLytcejbO.gnal.avajssalcrrAva.langGNAL..langjava.langAGNAL.AVAJAtsiLytcejbO.gnal.avajssalcrrAtsiLytcejbO.gnal.avajssalcrrAva.langGNAL..langjava.langAGNAL.AVAJAtsiLytcejbO.gnal.avajssalcrrAtsiLytcejb");
    }

    @Test
    public void test08949() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08949");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.startsWithIgnoreCase("#########################################################################################yList", "interface java.lang.CloneableJAVAinterface java.io.Serializable");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test08950() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08950");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.difference("44444444444444444.444444444444444444...                                 44444444444444444.444444444444444444...                                 44444$         ", "gnal.avaj");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "gnal.avaj" + "'", str2, "gnal.avaj");
    }

    @Test
    public void test08951() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08951");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isWhitespace((java.lang.CharSequence) "hi!ArrayListArrayListArrayListavaj.gnalArrayListArrayListArrayListavaj");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test08952() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08952");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOfIgnoreCase("va.langGNAL..langjava.langAGNAL.AVAJ", ".......");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test08953() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08953");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.repeat("JAVA.LANGAgnal.avajgnal..LANGgnal.av", 10);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "JAVA.LANGAgnal.avajgnal..LANGgnal.avJAVA.LANGAgnal.avajgnal..LANGgnal.avJAVA.LANGAgnal.avajgnal..LANGgnal.avJAVA.LANGAgnal.avajgnal..LANGgnal.avJAVA.LANGAgnal.avajgnal..LANGgnal.avJAVA.LANGAgnal.avajgnal..LANGgnal.avJAVA.LANGAgnal.avajgnal..LANGgnal.avJAVA.LANGAgnal.avajgnal..LANGgnal.avJAVA.LANGAgnal.avajgnal..LANGgnal.avJAVA.LANGAgnal.avajgnal..LANGgnal.av" + "'", str2, "JAVA.LANGAgnal.avajgnal..LANGgnal.avJAVA.LANGAgnal.avajgnal..LANGgnal.avJAVA.LANGAgnal.avajgnal..LANGgnal.avJAVA.LANGAgnal.avajgnal..LANGgnal.avJAVA.LANGAgnal.avajgnal..LANGgnal.avJAVA.LANGAgnal.avajgnal..LANGgnal.avJAVA.LANGAgnal.avajgnal..LANGgnal.avJAVA.LANGAgnal.avajgnal..LANGgnal.avJAVA.LANGAgnal.avajgnal..LANGgnal.avJAVA.LANGAgnal.avajgnal..LANGgnal.av");
    }

    @Test
    public void test08954() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08954");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringAfterLast("                                   ", "                       JAVAULANGrrayList");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test08955() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08955");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.split("JAVA.UTILhi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!h", '#');
        int int3 = org.apache.commons.lang3.StringUtils.indexOfDifference((java.lang.CharSequence[]) strArray2);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test08956() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08956");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.abbreviateMiddle("SERIALIZABL...     JAVA44444444444444444.4444", "java.lang.Cloneable4interface java.io.Serializa", 151);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "SERIALIZABL...     JAVA44444444444444444.4444" + "'", str3, "SERIALIZABL...     JAVA44444444444444444.4444");
    }

    @Test
    public void test08957() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08957");
        int int2 = org.apache.commons.lang3.StringUtils.indexOf("CLASSSLITUGNIRTSSLITUGNIRTSSLITUGNIRTSSLITUGNIRTSSLITUGNIRTSSLITUGNIRTinterfacegaga.lang.CloneableAAAAAAAAAAgagal.agnAAAAAAAAAAgagal.agnAAAAAAAAAAgagal.agnAAAAAAAAAAgagal.agnAAAAAAAAAAgagal.agnAAAAAAAAAAgagal.agnAAAAAAAAAAgagal.agnAAAAAAAAAAgagal.agnAAAAAAAAAAgagal.agnAAAAAAAAAAgagal.agnAAAAAAAAAAgagal.agnAAAAAAAAAAgagal.agnAAAAAAAAAAgagal.agnAAAAAAAAAAgagal.agnAAAAAAAAAAgagal.agnAAAAAAAAAAgagal.agnAAAAAAAAAAgagal.agnAAAAAAAAAAgagal.agnAAAAAAAAAAgagal.agnAAAAAAAAAAgagal.agnAAAAAAAAAAgagal.agnAAAAAAAAAAgagal.agnAAAAAAAAAAgagal.agnAAAAAAAAAAgagal.agnAAAAAAAAAAgagal.agnAAAAAAAAAAgagal.agnAAAAAAAAAAgagal.agnAAAAAAAAAAgagal.agnAAAAAAAAAAgagal.agnAAAAAAAAAAgagal.agnAAAAAAAAAAgagal.agnAAAAAAAAAAgagal.agnAAAAAAAAAAgagal.agnAAAAAAAAAAgagal.agnAAAAAAAAAAgagal.agnAAAAAAAAAAringinterfacegaga.io", "SERIA");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test08958() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08958");
        int int3 = org.apache.commons.lang3.StringUtils.indexOf("...#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#lass java#lang#String", 126, 36);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test08959() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08959");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.defaultString("444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA       444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444", ".LANG.STRINGCLASS JAVA.LANG.STRINGCLASS JAVA.LANG.STRINGCLAS");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA       444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444" + "'", str2, "444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA       444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444");
    }

    @Test
    public void test08960() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08960");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.defaultString("4444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "4444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444" + "'", str1, "4444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444");
    }

    @Test
    public void test08961() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08961");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.difference("jAVAJAVAsTRINjAVAJAVAsTRINjAVAJAVAsT", "class java.lang.Class                       JAVAULANG                       JAVAULANG                       JAVAULANG                       JAVAULANG                       JAVAULANG                       JAVAULANG                       JAVAULANG                       JAVAULANG                       JAVAULANG                       JAVAULANG                       JAVAULANG                       JAVAULANG                       JAVAULANG                       JAVAULANG                       JAVAULANG                       JAVAULANG                       JAVAULANG                       JAVAULANG                       JAVAULANG                       JAVAULANG        ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "class java.lang.Class                       JAVAULANG                       JAVAULANG                       JAVAULANG                       JAVAULANG                       JAVAULANG                       JAVAULANG                       JAVAULANG                       JAVAULANG                       JAVAULANG                       JAVAULANG                       JAVAULANG                       JAVAULANG                       JAVAULANG                       JAVAULANG                       JAVAULANG                       JAVAULANG                       JAVAULANG                       JAVAULANG                       JAVAULANG                       JAVAULANG        " + "'", str2, "class java.lang.Class                       JAVAULANG                       JAVAULANG                       JAVAULANG                       JAVAULANG                       JAVAULANG                       JAVAULANG                       JAVAULANG                       JAVAULANG                       JAVAULANG                       JAVAULANG                       JAVAULANG                       JAVAULANG                       JAVAULANG                       JAVAULANG                       JAVAULANG                       JAVAULANG                       JAVAULANG                       JAVAULANG                       JAVAULANG                       JAVAULANG        ");
    }

    @Test
    public void test08962() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08962");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeEndIgnoreCase("java.langjava.langjava.langjava.langjava.langjava.la", "Arr... aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa... aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa... aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa... aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa... aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa... aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa... aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa... aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa... aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa... aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaylist");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "java.langjava.langjava.langjava.langjava.langjava.la" + "'", str2, "java.langjava.langjava.langjava.langjava.langjava.la");
    }

    @Test
    public void test08963() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08963");
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
        java.lang.String[] strArray24 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("hi!", "");
        java.lang.String[] strArray26 = org.apache.commons.lang3.StringUtils.stripAll(strArray24, "$");
        java.lang.Class<?>[] wildcardClassArray27 = org.apache.commons.lang3.ClassUtils.toClass((java.lang.Object[]) strArray24);
        java.lang.Class<?> wildcardClass28 = null;
        java.lang.Class[] classArray30 = new java.lang.Class[1];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray31 = (java.lang.Class<?>[]) classArray30;
        wildcardClassArray31[0] = wildcardClass28;
        java.lang.Class<?>[] wildcardClassArray34 = org.apache.commons.lang3.ClassUtils.primitivesToWrappers(wildcardClassArray31);
        java.lang.String[] strArray36 = new java.lang.String[] { "                                   " };
        java.lang.String str37 = org.apache.commons.lang3.StringUtils.getCommonPrefix(strArray36);
        java.lang.Class<?>[] wildcardClassArray38 = org.apache.commons.lang3.ClassUtils.toClass((java.lang.Object[]) strArray36);
        java.lang.Class<?> wildcardClass39 = null;
        java.lang.Class[] classArray41 = new java.lang.Class[1];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray42 = (java.lang.Class<?>[]) classArray41;
        wildcardClassArray42[0] = wildcardClass39;
        java.lang.Class<?>[] wildcardClassArray45 = org.apache.commons.lang3.ClassUtils.primitivesToWrappers(wildcardClassArray42);
        boolean boolean46 = org.apache.commons.lang3.ClassUtils.isAssignable(wildcardClassArray38, wildcardClassArray42);
        boolean boolean48 = org.apache.commons.lang3.ClassUtils.isAssignable(wildcardClassArray31, wildcardClassArray42, true);
        boolean boolean50 = org.apache.commons.lang3.ClassUtils.isAssignable(wildcardClassArray27, wildcardClassArray42, false);
        java.lang.String str54 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) wildcardClassArray42, '#', (int) ' ', 10);
        java.lang.Class<?>[] wildcardClassArray55 = org.apache.commons.lang3.ClassUtils.primitivesToWrappers(wildcardClassArray42);
        java.lang.String str56 = org.apache.commons.lang3.StringUtils.concat((java.lang.Object[]) wildcardClassArray42);
        java.lang.String str58 = org.apache.commons.lang3.ClassUtils.getPackageCanonicalName((java.lang.Object) wildcardClassArray42, ".......");
        boolean boolean59 = org.apache.commons.lang3.ClassUtils.isAssignable(wildcardClassArray18, wildcardClassArray42);
        java.lang.String str61 = org.apache.commons.lang3.ClassUtils.getPackageName((java.lang.Object) wildcardClassArray18, "jAVA.L$ArrayList");
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
        org.junit.Assert.assertNotNull(strArray24);
        org.junit.Assert.assertNotNull(strArray26);
        org.junit.Assert.assertNotNull(wildcardClassArray27);
        org.junit.Assert.assertNotNull(classArray30);
        org.junit.Assert.assertNotNull(wildcardClassArray31);
        org.junit.Assert.assertNotNull(wildcardClassArray34);
        org.junit.Assert.assertNotNull(strArray36);
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "                                   " + "'", str37, "                                   ");
        org.junit.Assert.assertNotNull(wildcardClassArray38);
        org.junit.Assert.assertNotNull(classArray41);
        org.junit.Assert.assertNotNull(wildcardClassArray42);
        org.junit.Assert.assertNotNull(wildcardClassArray45);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertEquals("'" + str54 + "' != '" + "" + "'", str54, "");
        org.junit.Assert.assertNotNull(wildcardClassArray55);
        org.junit.Assert.assertEquals("'" + str56 + "' != '" + "" + "'", str56, "");
        org.junit.Assert.assertEquals("'" + str58 + "' != '" + "java.lang" + "'", str58, "java.lang");
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + false + "'", boolean59 == false);
        org.junit.Assert.assertEquals("'" + str61 + "' != '" + "java.lang" + "'", str61, "java.lang");
    }

    @Test
    public void test08964() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08964");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass1 = org.apache.commons.lang3.ClassUtils.getClass("interface#java.lang.Cloneable4interface#java.io.Serializable");
            org.junit.Assert.fail("Expected exception of type java.lang.ClassNotFoundException; message: interface#java.lang.Cloneable4interface#java.io.Serializable");
        } catch (java.lang.ClassNotFoundException e) {
            // Expected exception.
        }
    }

    @Test
    public void test08965() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08965");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa       ", '#');
        boolean boolean4 = org.apache.commons.lang3.StringUtils.startsWithAny("ClassslitUgnirtSslitUgnirtSslitUgnirtSslitUgnirtSslitUgnirtSslitUgnirtSslitUgnirtSslitUgnirtSslitUgnirtSslitUgnirtS", strArray3);
        java.lang.String str5 = org.apache.commons.lang3.StringUtils.getCommonPrefix(strArray3);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa       " + "'", str5, "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa       ");
    }

    @Test
    public void test08966() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08966");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substring("GN                                            ", 0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "GN                                            " + "'", str2, "GN                                            ");
    }

    @Test
    public void test08967() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08967");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlpha((java.lang.CharSequence) "jvstringnlrrylistrrylistrrylistvj.gnlrrylistrrylistrryli-1jv.utilString-1jv.utilString-1jv.utilString-1jv.utilString-1jv.utilString-1jv.utilString-1jv.utilString-1jv.utilString-1jv.utilString-1jv.utilString-1jv.utilString-1jv.utilString-1jv.utilString-1jv.utilString-1jv.utilString-1jv.utilString-1jv.utilString-1jv.utilString-1jv.utilString-1jv.utilString-1jv.utilString-1jv.utilString-1jv.utilString-1jv.utilString-1jv.utilString-1jv.utilString-1jv.utilString-1jv.utilString-1jv.utilString-1jv.utilString-1jv.utilString-1jv.utilString-1jv.utilString-1jv.utilString-1jv.utilString-1jv.utilString-1jv.utilString-1jv.utilString-1jv.utilString-1jv.utilString-1jv.utilString-1jv.utilString-1jv.utilString-1jv.utilString-1jv.utilString-1jv.utilString-1jv.utilString-1jv.utilString-1jv.utilString-1jv.utilString-1jv.utilString-1jv.utilString-1jv.utilString-1jv.utilString-1jv.utilString-1jv.utilString-1jv.utilString-1jv.utilString-1jv.utilString-");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test08968() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08968");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.split("aa", ' ');
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test08969() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08969");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOfIgnoreCase("ArryList", "                                                                              INTERFACE JAVA.LANG.CLONEABLE...                                 INTERFACE JAVA.IO.SERIALIZABLE", 3);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test08970() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08970");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBeforeLast("Object", ".LANG");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Object" + "'", str2, "Object");
    }

    @Test
    public void test08971() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08971");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNotEmpty((java.lang.CharSequence) "             Character                          Character                          Character                          Character                          Character                          Character                          Character                          Character                          Character                          Character                          Character                          Character             ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test08972() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08972");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.left("SLITuGNIRTsSLITuGNIRTsSLITuGNIRTsSLITuGNIRTsSL", 788);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "SLITuGNIRTsSLITuGNIRTsSLITuGNIRTsSLITuGNIRTsSL" + "'", str2, "SLITuGNIRTsSLITuGNIRTsSLITuGNIRTsSLITuGNIRTsSL");
    }

    @Test
    public void test08973() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08973");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.endsWith("se...               ...", ".........ava..........java....ja");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test08974() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08974");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.center("$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$A rrr rrr rrr r                                                                                                    ", 36, '#');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$A rrr rrr rrr r                                                                                                    " + "'", str3, "$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$A rrr rrr rrr r                                                                                                    ");
    }

    @Test
    public void test08975() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08975");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.rightPad("classjavalangClassJAVAULANGJAVAULANGJAVAULANGJAVAULANGJAVAULANGJAVAULANGJAVAULANGJAVAULANGJAVAULANGJAVAULANGJAVAULANGJAVAULANGJAVAULANGJAVAULANGJAVAULANGJAVAULANGJAVAULANGJAVAULANGJAVAULANGJAVAULANG$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$", (int) (short) -1, "$$$$$$$$$$$$$$$$$$$...");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "classjavalangClassJAVAULANGJAVAULANGJAVAULANGJAVAULANGJAVAULANGJAVAULANGJAVAULANGJAVAULANGJAVAULANGJAVAULANGJAVAULANGJAVAULANGJAVAULANGJAVAULANGJAVAULANGJAVAULANGJAVAULANGJAVAULANGJAVAULANGJAVAULANG$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$" + "'", str3, "classjavalangClassJAVAULANGJAVAULANGJAVAULANGJAVAULANGJAVAULANGJAVAULANGJAVAULANGJAVAULANGJAVAULANGJAVAULANGJAVAULANGJAVAULANGJAVAULANGJAVAULANGJAVAULANGJAVAULANGJAVAULANGJAVAULANGJAVAULANGJAVAULANG$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$");
    }

    @Test
    public void test08976() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08976");
        java.lang.String str1 = org.apache.commons.lang3.ClassUtils.getPackageCanonicalName("JAVA.LANGAgnal.avajgnal..LANGgnal.avJAVA.LANGAgnal.avajgnal..LANGgnal.avJAVA.LANGAgnal.avajgnal..LANGgnal.avJAVA.LANGAgnal.avajgnal..LANGgnal.avJAVA.LANGAgnal.avajgnal..LANGgnal.avJAVA.LANGAgnal.avajgnal..LANGgnal.avJAVA.LANGAgnal.avajgnal..LANGgnal.avJAVA.LANGAgnal.avajgnal..LANGgnal.avJAVA.LANGAgnal.avajgnal..LANGgnal.avJAVA.LANGAgnal.avajgnal..LANGgnal.av");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "JAVA.LANGAgnal.avajgnal..LANGgnal.avJAVA.LANGAgnal.avajgnal..LANGgnal.avJAVA.LANGAgnal.avajgnal..LANGgnal.avJAVA.LANGAgnal.avajgnal..LANGgnal.avJAVA.LANGAgnal.avajgnal..LANGgnal.avJAVA.LANGAgnal.avajgnal..LANGgnal.avJAVA.LANGAgnal.avajgnal..LANGgnal.avJAVA.LANGAgnal.avajgnal..LANGgnal.avJAVA.LANGAgnal.avajgnal..LANGgnal.avJAVA.LANGAgnal.avajgnal..LANGgnal" + "'", str1, "JAVA.LANGAgnal.avajgnal..LANGgnal.avJAVA.LANGAgnal.avajgnal..LANGgnal.avJAVA.LANGAgnal.avajgnal..LANGgnal.avJAVA.LANGAgnal.avajgnal..LANGgnal.avJAVA.LANGAgnal.avajgnal..LANGgnal.avJAVA.LANGAgnal.avajgnal..LANGgnal.avJAVA.LANGAgnal.avajgnal..LANGgnal.avJAVA.LANGAgnal.avajgnal..LANGgnal.avJAVA.LANGAgnal.avajgnal..LANGgnal.avJAVA.LANGAgnal.avajgnal..LANGgnal");
    }

    @Test
    public void test08977() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08977");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.abbreviate("sAitUJAirtSsAitUJAirtSsAitUJAirtSsAitUJAirtSsAitUJAirtSsAitUJAirtSsAitUJAirtSsAitUJAirtSsAitUJAirtSsAitUJAirtS", 53, 102);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "...sAitUJAirtSsAitUJAirtSsAitUJAirtSsAitUJAirtSsAitUJAirtSsAitUJAirtSsAitUJAirtSsAitUJAirtSsAitUJAirtS" + "'", str3, "...sAitUJAirtSsAitUJAirtSsAitUJAirtSsAitUJAirtSsAitUJAirtSsAitUJAirtSsAitUJAirtSsAitUJAirtSsAitUJAirtS");
    }

    @Test
    public void test08978() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08978");
        int int3 = org.apache.commons.lang3.StringUtils.lastOrdinalIndexOf("arrayListArrayListArrayListavaj.gnal                                                                                                                                         ", ".       .       .       .       .       .       .       .       .       .       .       .       .       .       .       .       .       .       .       .       .       .       .       .       .       .       .       .       .       .       .       .       .       .       .       .       .       .       .       .       .       .       .       .       .       .       .       .       .       .       .       .       .       .       .       .       .       .       .       .       .       .       .       .       .       .       .       .       .       .       .       .       .       .       .       .       .       .       .       .       .       .       .       .       .       .       .       .       .       .       .       .       .       .       .       .       .       .       .       .       ", 34);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test08979() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08979");
        java.util.Locale locale1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.apache.commons.lang3.StringUtils.lowerCase("       INTEGER        ", locale1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test08980() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08980");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeEnd("slitUgnirtSslitUgnirtSslitUgnirtSslitUgnirtSsl", "....................................................................                       JAVAULANG");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "slitUgnirtSslitUgnirtSslitUgnirtSslitUgnirtSsl" + "'", str2, "slitUgnirtSslitUgnirtSslitUgnirtSslitUgnirtSsl");
    }

    @Test
    public void test08981() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08981");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOf("...VA.LANGAVAJ.GNALJAVA.LANGAVAJ.GNALJAVA.LANGAVAJ.GNALJAVA.LANGAVAJ.GNALJAVA.LANGAVAJ.GNALJAVA.LANGgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalg", 315, 63);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test08982() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08982");
        int int3 = org.apache.commons.lang3.StringUtils.indexOfIgnoreCase("INTERFACE JAVA.LANG.CLONEABLE.......JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVAINTERFACE JAVA.IO.SERIALIZABLE", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", (int) 'a');
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test08983() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08983");
        int int3 = org.apache.commons.lang3.StringUtils.indexOf("", "$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$", 99);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test08984() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08984");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.swapCase("avajgnal.avajgnal.avajgnal.avajgnal.avajgnal.avajgnal.avajgnal.avajgnal.avajgnal.avaJ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "AVAJGNAL.AVAJGNAL.AVAJGNAL.AVAJGNAL.AVAJGNAL.AVAJGNAL.AVAJGNAL.AVAJGNAL.AVAJGNAL.AVAj" + "'", str1, "AVAJGNAL.AVAJGNAL.AVAJGNAL.AVAJGNAL.AVAJGNAL.AVAJGNAL.AVAJGNAL.AVAJGNAL.AVAJGNAL.AVAj");
    }

    @Test
    public void test08985() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08985");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNotEmpty((java.lang.CharSequence) "gnal.avaj");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test08986() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08986");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitByCharacterTypeCamelCase("CLASS JAVA.LANG.cLASS");
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test08987() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08987");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsAny("", "44444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444Chaace");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test08988() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08988");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.center("gnl$.$vj", 423, '4');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444gnl$.$vj4444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444" + "'", str3, "444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444gnl$.$vj4444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444");
    }

    @Test
    public void test08989() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08989");
        int int2 = org.apache.commons.lang3.StringUtils.countMatches("", "javajavastrinjavajavastrinjavajavast");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test08990() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08990");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.chop("javalitu");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "javalit" + "'", str1, "javalit");
    }

    @Test
    public void test08991() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08991");
        int int2 = org.apache.commons.lang3.StringUtils.getLevenshteinDistance((java.lang.CharSequence) "avaj.gnalavaj.gnalavaj.gnal", (java.lang.CharSequence) "JAVA.LANGaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 80 + "'", int2 == 80);
    }

    @Test
    public void test08992() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08992");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isBlank((java.lang.CharSequence) "$$$$$$jav");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test08993() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08993");
        java.lang.String str2 = org.apache.commons.lang3.ClassUtils.getPackageCanonicalName((java.lang.Object) "LANGaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "                                  $$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "java.lang" + "'", str2, "java.lang");
    }

    @Test
    public void test08994() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08994");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.remove("                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                    java.langavaj.gnaljava.langavaj.gnaljava.langavaj.gnaljava.langavaj.gnaljava.langavaj.gnaljava.langavaj.gnaljava.langavaj.gnaljava.langavaj.gnaljava.lang", '$');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                    java.langavaj.gnaljava.langavaj.gnaljava.langavaj.gnaljava.langavaj.gnaljava.langavaj.gnaljava.langavaj.gnaljava.langavaj.gnaljava.langavaj.gnaljava.lang" + "'", str2, "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                    java.langavaj.gnaljava.langavaj.gnaljava.langavaj.gnaljava.langavaj.gnaljava.langavaj.gnaljava.langavaj.gnaljava.langavaj.gnaljava.langavaj.gnaljava.lang");
    }

    @Test
    public void test08995() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08995");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.equalsIgnoreCase("ssalC.gnal.avaj ssalc", "interface java.lang.CloneableAvaj.gnalinterface java.io.Serializable");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test08996() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08996");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.leftPad("java.io.Serializable java.lang.CloneableStringinterface interface", 22);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "java.io.Serializable java.lang.CloneableStringinterface interface" + "'", str2, "java.io.Serializable java.lang.CloneableStringinterface interface");
    }

    @Test
    public void test08997() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08997");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.capitalize((java.lang.CharSequence) "Llitu");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Llitu" + "'", str1, "Llitu");
    }

    @Test
    public void test08998() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08998");
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("class java.lang.String", "                                   ");
        java.lang.String str6 = org.apache.commons.lang3.ClassUtils.getShortCanonicalName((java.lang.Object) strArray4, "                                                                                                    ");
        java.lang.String[] strArray9 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("Jav4444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444aaaaaaaaaava.langava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.lang", "java..........java..........java...");
        java.lang.String str10 = org.apache.commons.lang3.StringUtils.replaceEachRepeatedly("$$$$$$$$$$$$$$$$$$$$$$$$$$$$$...", strArray4, strArray9);
        java.lang.String[] strArray15 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("...       AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA", ".ArrayListArrayListArrayListArrayLis", 36);
        java.lang.String[] strArray17 = org.apache.commons.lang3.StringUtils.stripAll(strArray15, "AA...");
        boolean boolean18 = org.apache.commons.lang3.StringUtils.endsWithAny(".lang.Stringclass java.lang.Stringclass java.lang.Stringclas", strArray15);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str19 = org.apache.commons.lang3.StringUtils.replaceEach("nterface java.lang.Cloneable.......java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........javainterface java.io.Serializable", strArray9, strArray15);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Search and Replace array lengths don't match: 1 vs 36");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "String[]" + "'", str6, "String[]");
        org.junit.Assert.assertNotNull(strArray9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "$$$$$$$$$$$$$$$$$$$$$$$$$$$$$..." + "'", str10, "$$$$$$$$$$$$$$$$$$$$$$$$$$$$$...");
        org.junit.Assert.assertNotNull(strArray15);
        org.junit.Assert.assertNotNull(strArray17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
    }

    @Test
    public void test08999() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08999");
        java.lang.ClassLoader classLoader0 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass3 = org.apache.commons.lang3.ClassUtils.getClass(classLoader0, "LA", true);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassNotFoundException; message: LA");
        } catch (java.lang.ClassNotFoundException e) {
            // Expected exception.
        }
    }

    @Test
    public void test09000() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test09000");
        java.util.Locale locale1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.apache.commons.lang3.StringUtils.lowerCase("                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                       CLASSJAVA.LANGAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAULANG", locale1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }
}

