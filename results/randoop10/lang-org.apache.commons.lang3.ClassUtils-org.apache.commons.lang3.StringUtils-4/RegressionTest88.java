import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest88 {

    public static boolean debug = false;

    @Test
    public void test44001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest88.test44001");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.split("AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA#########################################################", "Jsysysys");
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test44002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest88.test44002");
        int int3 = org.apache.commons.lang3.StringUtils.indexOf("a.lang.CloneableStringinterfacejava.io", 146, 544);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test44003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest88.test44003");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.center("1AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA", 655);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                                                                                                                                                                                                                                                                          1AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA                                                                                                                                                                                                                                                                                           " + "'", str2, "                                                                                                                                                                                                                                                                                          1AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA                                                                                                                                                                                                                                                                                           ");
    }

    @Test
    public void test44004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest88.test44004");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfAnyBut("tsilyarrgn...", "INTERFACE JAVA.LANG.cLONEABLEa RRR RRR RRR RRR RRR RRR RRR RRR RNAL....................INTERFACE JAVA.LA");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test44005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest88.test44005");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.deleteWhitespace("                                                           ][gnirtSlitu.avaj1-                                                                              ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "][gnirtSlitu.avaj1-" + "'", str1, "][gnirtSlitu.avaj1-");
    }

    @Test
    public void test44006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest88.test44006");
        char[] charArray12 = new char[] { ' ', ' ', '#', 'a', '4', 'a' };
        int int13 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "", charArray12);
        boolean boolean14 = org.apache.commons.lang3.StringUtils.containsAny("$", charArray12);
        java.lang.String str16 = org.apache.commons.lang3.ClassUtils.getPackageCanonicalName((java.lang.Object) charArray12, "class java.lang.String");
        boolean boolean17 = org.apache.commons.lang3.StringUtils.containsAny("Sho$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$rrayList$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$t", charArray12);
        int int18 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "ayli", charArray12);
        int int19 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "tsilyarra.la.langtsilyarra.la.langtsilyarra.la.langtsilyarra.la.langtsilyarra.la.langtsilyarra.la.langtsilyarra.la.langtsilyarra.la.lang", charArray12);
        boolean boolean20 = org.apache.commons.lang3.StringUtils.containsAny("AAAAAAAAAAAAAAAAAAA...", charArray12);
        org.junit.Assert.assertNotNull(charArray12);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray12), "  #a4a");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray12), "  #a4a");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray12), "[ ,  , #, a, 4, a]");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test44007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest88.test44007");
        java.lang.String[] strArray5 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("4", "AtsiLytcejbO.gnal.avajssalcrrAtsiLytcejbO.gnal.avajssalcrrAva.langGNAL..langjava.langAGNAL");
        boolean boolean6 = org.apache.commons.lang3.StringUtils.startsWithAny("java$", strArray5);
        int int7 = org.apache.commons.lang3.StringUtils.indexOfAny("A..ayL A.44444444444444444444444...", strArray5);
        int int8 = org.apache.commons.lang3.StringUtils.indexOfAny("arryList", strArray5);
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 9 + "'", int7 == 9);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
    }

    @Test
    public void test44008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest88.test44008");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.center("StringU", 401, "lvj");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "lvjlvjlvjlvjlvjlvjlvjlvjlvjlvjlvjlvjlvjlvjlvjlvjlvjlvjlvjlvjlvjlvjlvjlvjlvjlvjlvjlvjlvjlvjlvjlvjlvjlvjlvjlvjlvjlvjlvjlvjlvjlvjlvjlvjlvjlvjlvjlvjlvjlvjlvjlvjlvjlvjlvjlvjlvjlvjlvjlvjlvjlvjlvjlvjlvjlvStringUlvjlvjlvjlvjlvjlvjlvjlvjlvjlvjlvjlvjlvjlvjlvjlvjlvjlvjlvjlvjlvjlvjlvjlvjlvjlvjlvjlvjlvjlvjlvjlvjlvjlvjlvjlvjlvjlvjlvjlvjlvjlvjlvjlvjlvjlvjlvjlvjlvjlvjlvjlvjlvjlvjlvjlvjlvjlvjlvjlvjlvjlvjlvjlvjlvjlv" + "'", str3, "lvjlvjlvjlvjlvjlvjlvjlvjlvjlvjlvjlvjlvjlvjlvjlvjlvjlvjlvjlvjlvjlvjlvjlvjlvjlvjlvjlvjlvjlvjlvjlvjlvjlvjlvjlvjlvjlvjlvjlvjlvjlvjlvjlvjlvjlvjlvjlvjlvjlvjlvjlvjlvjlvjlvjlvjlvjlvjlvjlvjlvjlvjlvjlvjlvjlvStringUlvjlvjlvjlvjlvjlvjlvjlvjlvjlvjlvjlvjlvjlvjlvjlvjlvjlvjlvjlvjlvjlvjlvjlvjlvjlvjlvjlvjlvjlvjlvjlvjlvjlvjlvjlvjlvjlvjlvjlvjlvjlvjlvjlvjlvjlvjlvjlvjlvjlvjlvjlvjlvjlvjlvjlvjlvjlvjlvjlvjlvjlvjlvjlvjlvjlv");
    }

    @Test
    public void test44009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest88.test44009");
        java.lang.String str1 = org.apache.commons.lang3.ClassUtils.getShortClassName("     A..ayL A.44444444444444444444444444           A..ayL A.44444444444444444444444444           A..ayL A.44444444444444444444444444           A..ayL A.44444444444444444444444444           A..ayL A.44444444444444444444444444           A..ayL A.444444444.........java..........java...........     A..ayL A.44444444444444444444444444           A..ayL A.44444444444444444444444444           A..ayL A.44444444444444444444444444           A..ayL A.44444444444444444444444444           A..ayL A.44444444444444444444444444           A..ayL A.444444444");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "444444444" + "'", str1, "444444444");
    }

    @Test
    public void test44010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest88.test44010");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("      ][GNIRTSLITU.AVAJ1", "Lang.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.1aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaajava.1aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa.1aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa.1aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa.1aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa.1aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa.1aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa.1aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa.1aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa.hi!arraylistarraylistarraylistavaj");
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test44011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest88.test44011");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.substring("TU", 0, 303);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "TU" + "'", str3, "TU");
    }

    @Test
    public void test44012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest88.test44012");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("java.util", "slitUgnirtS");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.stripAll(strArray2);
        java.lang.String str5 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray2, '$');
        java.lang.String str6 = org.apache.commons.lang3.StringUtils.concat((java.lang.Object[]) strArray2);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "java.util" + "'", str5, "java.util");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "java.util" + "'", str6, "java.util");
    }

    @Test
    public void test44013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest88.test44013");
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.overlay("$$$$$$$$$$$$$$$.....$$$$", "              ", 494, 228);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "$$$$$$$$$$$$$$$.....$$$$              " + "'", str4, "$$$$$$$$$$$$$$$.....$$$$              ");
    }

    @Test
    public void test44014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest88.test44014");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.leftPad("interface java.lang.CloneableJAVA.UTILJAVA.UTILStringcJAVA.UTILJAVA.UTILStringcJAVA.UTILJAVA.UTILStringcJAVA.UTILJAVA.UTILStringcJAVA.UTILJAVA.UTILStringcJAVA.UTILJAVA.UTILStringcJAVA.UTILJAVA.UTILStringcJAVA.UTILJAVA.UTILStringcJAVA.UTILJAVA.UTILStringcJAVA.UTILJAVA.UTILStringcJAVA.UTILJAVA.UTILStringcJAVA.UTILJAVA.UTILStringcJAVA.UTILJAVA.UTILStringcJAVA.UTILJAVA.UTILStringcJAVA.UTILJAVA.UTILStringcJAVA.UTILJAVA.UTILStringcJAVA.UTILJAVA.UTILStringcJAVA.UTILJAVA.UTILStringcJAVA.UTILJAVA.UTILStringcJAVA.UTILJAVA.UTILStringcJAVA.UTILJAVA.UTILStringcJAVA.UTILJAVA.UTILStringcJAVA.UTILJAVA.UTILinterface java.io.Serializable", 935);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                                                                                                                                                                                                                                                                                                    interface java.lang.CloneableJAVA.UTILJAVA.UTILStringcJAVA.UTILJAVA.UTILStringcJAVA.UTILJAVA.UTILStringcJAVA.UTILJAVA.UTILStringcJAVA.UTILJAVA.UTILStringcJAVA.UTILJAVA.UTILStringcJAVA.UTILJAVA.UTILStringcJAVA.UTILJAVA.UTILStringcJAVA.UTILJAVA.UTILStringcJAVA.UTILJAVA.UTILStringcJAVA.UTILJAVA.UTILStringcJAVA.UTILJAVA.UTILStringcJAVA.UTILJAVA.UTILStringcJAVA.UTILJAVA.UTILStringcJAVA.UTILJAVA.UTILStringcJAVA.UTILJAVA.UTILStringcJAVA.UTILJAVA.UTILStringcJAVA.UTILJAVA.UTILStringcJAVA.UTILJAVA.UTILStringcJAVA.UTILJAVA.UTILStringcJAVA.UTILJAVA.UTILStringcJAVA.UTILJAVA.UTILStringcJAVA.UTILJAVA.UTILinterface java.io.Serializable" + "'", str2, "                                                                                                                                                                                                                                                                                                                    interface java.lang.CloneableJAVA.UTILJAVA.UTILStringcJAVA.UTILJAVA.UTILStringcJAVA.UTILJAVA.UTILStringcJAVA.UTILJAVA.UTILStringcJAVA.UTILJAVA.UTILStringcJAVA.UTILJAVA.UTILStringcJAVA.UTILJAVA.UTILStringcJAVA.UTILJAVA.UTILStringcJAVA.UTILJAVA.UTILStringcJAVA.UTILJAVA.UTILStringcJAVA.UTILJAVA.UTILStringcJAVA.UTILJAVA.UTILStringcJAVA.UTILJAVA.UTILStringcJAVA.UTILJAVA.UTILStringcJAVA.UTILJAVA.UTILStringcJAVA.UTILJAVA.UTILStringcJAVA.UTILJAVA.UTILStringcJAVA.UTILJAVA.UTILStringcJAVA.UTILJAVA.UTILStringcJAVA.UTILJAVA.UTILStringcJAVA.UTILJAVA.UTILStringcJAVA.UTILJAVA.UTILStringcJAVA.UTILJAVA.UTILinterface java.io.Serializable");
    }

    @Test
    public void test44015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest88.test44015");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.center("gnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.ag", 501);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "gnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.ag" + "'", str2, "gnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.ag");
    }

    @Test
    public void test44016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest88.test44016");
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.replace("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaayl", "                                                                                          INTERFAVAJ.GNALAVA$$$.JAVA$$$.JAVA$$$.JAVA$$$.JAVA$$$.JAVA$$$.JAVA$$$.JAVA$$$.JAVA$$$.JAVA$$$.JAVA$$$.JAVA$$$.JAVA$$$.JAVA$$$.JAVA$$$.JAVA$$$.JAVA$$$.JAVA$$$.JAVA$$$.JAVA$$$.JAVA$$$.JAVA$$$.JAVA$$$.JAVA$$$.JAVA$$$.JAVA$$$.JAVA$$$.JAVA$$$.JAVA$$$.JAVA$$$.JAVA$$$.JAVA$$$.JAVA$$$.JAVA$$$.JAVAINTERFACE JAVA.IO.SERIALIZABLE                                                                                           ", ".........ava..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java........", 339);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaayl" + "'", str4, "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaayl");
    }

    @Test
    public void test44017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest88.test44017");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.swapCase("...java..........java..classjavalangClassJAVAULANGJAVAULANGJAVAULANGJAVAULirtS$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "...JAVA..........JAVA..CLASSJAVALANGcLASSjavaulangjavaulangjavaulangjavaulIRTs$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$" + "'", str1, "...JAVA..........JAVA..CLASSJAVALANGcLASSjavaulangjavaulangjavaulangjavaulIRTs$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$");
    }

    @Test
    public void test44018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest88.test44018");
        java.lang.Class<?> wildcardClass1 = null;
        java.lang.Class[] classArray3 = new java.lang.Class[1];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray4 = (java.lang.Class<?>[]) classArray3;
        wildcardClassArray4[0] = wildcardClass1;
        java.lang.Class<?>[] wildcardClassArray7 = org.apache.commons.lang3.ClassUtils.primitivesToWrappers(wildcardClassArray4);
        java.lang.Class<?> wildcardClass8 = null;
        java.lang.Class[] classArray10 = new java.lang.Class[1];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray11 = (java.lang.Class<?>[]) classArray10;
        wildcardClassArray11[0] = wildcardClass8;
        java.lang.Class<?>[] wildcardClassArray14 = org.apache.commons.lang3.ClassUtils.primitivesToWrappers(wildcardClassArray11);
        java.lang.String[] strArray16 = new java.lang.String[] { "                                   " };
        java.lang.String str17 = org.apache.commons.lang3.StringUtils.getCommonPrefix(strArray16);
        java.lang.Class<?>[] wildcardClassArray18 = org.apache.commons.lang3.ClassUtils.toClass((java.lang.Object[]) strArray16);
        java.lang.Class<?> wildcardClass19 = null;
        java.lang.Class[] classArray21 = new java.lang.Class[1];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray22 = (java.lang.Class<?>[]) classArray21;
        wildcardClassArray22[0] = wildcardClass19;
        java.lang.Class<?>[] wildcardClassArray25 = org.apache.commons.lang3.ClassUtils.primitivesToWrappers(wildcardClassArray22);
        boolean boolean26 = org.apache.commons.lang3.ClassUtils.isAssignable(wildcardClassArray18, wildcardClassArray22);
        boolean boolean28 = org.apache.commons.lang3.ClassUtils.isAssignable(wildcardClassArray11, wildcardClassArray22, true);
        boolean boolean30 = org.apache.commons.lang3.ClassUtils.isAssignable(wildcardClassArray7, wildcardClassArray22, true);
        java.lang.String str31 = org.apache.commons.lang3.StringUtils.concat((java.lang.Object[]) wildcardClassArray7);
        java.lang.String str33 = org.apache.commons.lang3.ClassUtils.getShortCanonicalName((java.lang.Object) wildcardClassArray7, ".......");
        java.lang.Class<?>[] wildcardClassArray34 = org.apache.commons.lang3.ClassUtils.wrappersToPrimitives(wildcardClassArray7);
        java.lang.String[] strArray36 = org.apache.commons.lang3.StringUtils.splitByCharacterType("... AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA... AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA... AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA... AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA... AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA... AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA... AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA... AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA... AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA... AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA");
        java.lang.Class<?>[] wildcardClassArray37 = org.apache.commons.lang3.ClassUtils.toClass((java.lang.Object[]) strArray36);
        java.lang.Class<?>[] wildcardClassArray38 = org.apache.commons.lang3.ClassUtils.primitivesToWrappers(wildcardClassArray37);
        java.lang.Class<?>[] wildcardClassArray39 = org.apache.commons.lang3.ClassUtils.wrappersToPrimitives(wildcardClassArray38);
        java.lang.Class<?>[] wildcardClassArray40 = org.apache.commons.lang3.ClassUtils.toClass((java.lang.Object[]) wildcardClassArray38);
        java.lang.String str44 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) wildcardClassArray40, '4', (int) (short) 100, 23);
        boolean boolean45 = org.apache.commons.lang3.ClassUtils.isAssignable(wildcardClassArray34, wildcardClassArray40);
        java.lang.String str47 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) wildcardClassArray34, 'a');
        java.lang.String str48 = org.apache.commons.lang3.StringUtils.concatWith("hi!ArrayListArrayListArrayListavaj.... AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA... AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA... AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA... AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA... AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA... AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA... AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA... AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA... AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA... ", (java.lang.Object[]) wildcardClassArray34);
        java.lang.Class<?>[] wildcardClassArray49 = org.apache.commons.lang3.ClassUtils.wrappersToPrimitives(wildcardClassArray34);
        java.lang.String str51 = org.apache.commons.lang3.ClassUtils.getPackageName((java.lang.Object) wildcardClassArray49, "...avagnal.avajlang.javagnal.avajlang....VA.LANGAVAJ.GNALJAVA.LANGAVAJ.GNALJAVA.LANGAVAJ.GNALJAVA.LANGAVAJ.GNALJAVA.LANGAVAJ.GNALJAVA.LANG");
        java.lang.Class<?>[] wildcardClassArray52 = org.apache.commons.lang3.ClassUtils.primitivesToWrappers(wildcardClassArray49);
        org.junit.Assert.assertNotNull(classArray3);
        org.junit.Assert.assertNotNull(wildcardClassArray4);
        org.junit.Assert.assertNotNull(wildcardClassArray7);
        org.junit.Assert.assertNotNull(classArray10);
        org.junit.Assert.assertNotNull(wildcardClassArray11);
        org.junit.Assert.assertNotNull(wildcardClassArray14);
        org.junit.Assert.assertNotNull(strArray16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "                                   " + "'", str17, "                                   ");
        org.junit.Assert.assertNotNull(wildcardClassArray18);
        org.junit.Assert.assertNotNull(classArray21);
        org.junit.Assert.assertNotNull(wildcardClassArray22);
        org.junit.Assert.assertNotNull(wildcardClassArray25);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "" + "'", str31, "");
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "Class[]" + "'", str33, "Class[]");
        org.junit.Assert.assertNotNull(wildcardClassArray34);
        org.junit.Assert.assertNotNull(strArray36);
        org.junit.Assert.assertNotNull(wildcardClassArray37);
        org.junit.Assert.assertNotNull(wildcardClassArray38);
        org.junit.Assert.assertNotNull(wildcardClassArray39);
        org.junit.Assert.assertNotNull(wildcardClassArray40);
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "" + "'", str44, "");
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertEquals("'" + str47 + "' != '" + "" + "'", str47, "");
        org.junit.Assert.assertEquals("'" + str48 + "' != '" + "" + "'", str48, "");
        org.junit.Assert.assertNotNull(wildcardClassArray49);
        org.junit.Assert.assertEquals("'" + str51 + "' != '" + "java.lang" + "'", str51, "java.lang");
        org.junit.Assert.assertNotNull(wildcardClassArray52);
    }

    @Test
    public void test44019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest88.test44019");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.defaultString("A$L.AVAj", "CloneableStringinterfaceinterface");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "A$L.AVAj" + "'", str2, "A$L.AVAj");
    }

    @Test
    public void test44020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest88.test44020");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trimToNull("Arr.....java..........java..........java.........Arr");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Arr.....java..........java..........java.........Arr" + "'", str1, "Arr.....java..........java..........java.........Arr");
    }

    @Test
    public void test44021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest88.test44021");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceChars("hi!arrylistarrylistarrylistvjhhhh aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaahhh aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaahhh aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaahhh aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaahhh aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaahhh aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaahhh aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaahhh aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaahhh aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaahhh aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", '.', '4');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!arrylistarrylistarrylistvjhhhh aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaahhh aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaahhh aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaahhh aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaahhh aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaahhh aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaahhh aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaahhh aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaahhh aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaahhh aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa" + "'", str3, "hi!arrylistarrylistarrylistvjhhhh aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaahhh aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaahhh aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaahhh aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaahhh aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaahhh aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaahhh aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaahhh aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaahhh aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaahhh aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
    }

    @Test
    public void test44022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest88.test44022");
        java.lang.String str1 = org.apache.commons.lang3.ClassUtils.getShortClassName("AVAJjava.lang.String assGNAL");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "String assGNAL" + "'", str1, "String assGNAL");
    }

    @Test
    public void test44023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest88.test44023");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("Seria     A..AYL A.44444444444444444444444444      ", "Serializabl");
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test44024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest88.test44024");
        int int3 = org.apache.commons.lang3.StringUtils.ordinalIndexOf("                                                                                               ass java.lang.String", "", 472);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test44025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest88.test44025");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isBlank((java.lang.CharSequence) "                                                                                                                                                                                  gnirtSlitu.avaj1-gnirtSlitu.avaj1-                                                                                                                                                                                  ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test44026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest88.test44026");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.startsWithIgnoreCase("A$L.AVAj  ", "4444444string44444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444.ly..                                  $$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$                                  $$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$                                  $$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$                                  $$$$$$$$$$$$$$$$$$$$$$$44444444                                                                                                                                                                                                                                                                       ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test44027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest88.test44027");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.startsWithIgnoreCase("$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$ java.lang$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$", "interfacejava.lang.Cloneable$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$interfacejava.io");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test44028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest88.test44028");
        java.lang.String str2 = org.apache.commons.lang3.ClassUtils.getPackageName((java.lang.Object) "vvay", "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "java.lang" + "'", str2, "java.lang");
    }

    @Test
    public void test44029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest88.test44029");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceOnce("...#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#lass java#lang#Strin", "j.v...........j.v...........j.v.......", "uavajtutututututut..");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "...#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#lass java#lang#Strin" + "'", str3, "...#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#lass java#lang#Strin");
    }

    @Test
    public void test44030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest88.test44030");
        int int3 = org.apache.commons.lang3.StringUtils.indexOf("gnlvj                                                                                                                                                                                                                                                                                                                                                                                                                                                       ", 824, 40);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test44031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest88.test44031");
        java.lang.String str1 = org.apache.commons.lang3.ClassUtils.getShortClassName("                                            ..");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
    }

    @Test
    public void test44032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest88.test44032");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "interface java.lang.Cloneable-1A.A.Auti.StriAj-1A.A.Auti.StriAjinterface java.io.Serializable", "sClassslitUgnirtSslitUgnirtSslitUgnirtSslitUgnirtSslitUgnirtSslitUgnirtSslitUgnirtSslitUgnirtSslitUgnirtSslitUgnirtSsClasssl4rr4ylistsClassslitUgnirtSslitUgnirtSslitUgnirtSslitUgnirtSslitUgnirtSslitUgnirtSslitUgnirtSslitUgnirtSslitUgnirtSslitUgnirtSsClasssl");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test44033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest88.test44033");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOf("jv..........jv..........jv..........jv..........jv..........jv..........jv..........jv..........jv..........jv..........jv..........jv..........jv..........jv..........jv..........jv..........jv..........jv..........jv..........jv..........jv..........jv..........jv..........jv..........jv..........jv..........jv..........jv..........jv..........jv..........jv..........jv..........jv..........jv..........jvinterfcejv.io", 248);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test44034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest88.test44034");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeEndIgnoreCase("..aaaa                       javaulangRRAYlIST", "                               arraylistarraylistarraylistavaj");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "..aaaa                       javaulangRRAYlIST" + "'", str2, "..aaaa                       javaulangRRAYlIST");
    }

    @Test
    public void test44035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest88.test44035");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.chop("                                                                                                                                                                                                                                                                                                                                                                                                                                java.langaGNL.VJGNL..langGNL.VaRRCLSS JV.LNG.oBJECTYlISTaR...");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "                                                                                                                                                                                                                                                                                                                                                                                                                                java.langaGNL.VJGNL..langGNL.VaRRCLSS JV.LNG.oBJECTYlISTaR.." + "'", str1, "                                                                                                                                                                                                                                                                                                                                                                                                                                java.langaGNL.VJGNL..langGNL.VaRRCLSS JV.LNG.oBJECTYlISTaR..");
    }

    @Test
    public void test44036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest88.test44036");
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
        java.lang.String str50 = org.apache.commons.lang3.StringUtils.concat((java.lang.Object[]) wildcardClassArray41);
        boolean boolean51 = org.apache.commons.lang3.ClassUtils.isAssignable(wildcardClassArray14, wildcardClassArray41);
        java.lang.String str55 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) wildcardClassArray14, '4', 605, 158);
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
        org.junit.Assert.assertEquals("'" + str50 + "' != '" + "" + "'", str50, "");
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertEquals("'" + str55 + "' != '" + "" + "'", str55, "");
    }

    @Test
    public void test44037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest88.test44037");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.defaultIfBlank("                                                                            ][gnirtSlitu.avaj1", "Ngaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa       lavaj                                                                                                                                                                                                                                                                                                                                                                                                                                       ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                                                            ][gnirtSlitu.avaj1" + "'", str2, "                                                                            ][gnirtSlitu.avaj1");
    }

    @Test
    public void test44038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest88.test44038");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.left("elbazilaireS.oi.avaj ecafretni44444444444444444444444444444444444444444444444444elbaenolC.gnal.avaj ecafretniarrAtsiLyarrAtsiLyarrAlangnirtSavaJ", 888);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "elbazilaireS.oi.avaj ecafretni44444444444444444444444444444444444444444444444444elbaenolC.gnal.avaj ecafretniarrAtsiLyarrAtsiLyarrAlangnirtSavaJ" + "'", str2, "elbazilaireS.oi.avaj ecafretni44444444444444444444444444444444444444444444444444elbaenolC.gnal.avaj ecafretniarrAtsiLyarrAtsiLyarrAlangnirtSavaJ");
    }

    @Test
    public void test44039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest88.test44039");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceChars("$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$...       AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$", "NTERFACEJAVA.LANG.cLONEABLE.......JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVAINTERFACEJAVA.IO.sERIALIZABL", "elbzilireS.oi.vj ecfretnivj..........vtcejbO.......vj.......elbenolC.gnl");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$iii       llllllllllllllllllllllllllllllllllllllllllllllllllllllllllllllllllllllllllllllllllllllllll$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$" + "'", str3, "$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$iii       llllllllllllllllllllllllllllllllllllllllllllllllllllllllllllllllllllllllllllllllllllllllll$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$");
    }

    @Test
    public void test44040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest88.test44040");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trimToEmpty("                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                             jvstringnlrrylistrrylistrrylistv                                                                                                       ArrayListArrayListArrayListavaj.gnalArrayListArrayListArrayL");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "jvstringnlrrylistrrylistrrylistv                                                                                                       ArrayListArrayListArrayListavaj.gnalArrayListArrayListArrayL" + "'", str1, "jvstringnlrrylistrrylistrrylistv                                                                                                       ArrayListArrayListArrayListavaj.gnalArrayListArrayListArrayL");
    }

    @Test
    public void test44041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest88.test44041");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.center("...L.AGNAAAAAAAAAA...", 0, ' ');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "...L.AGNAAAAAAAAAA..." + "'", str3, "...L.AGNAAAAAAAAAA...");
    }

    @Test
    public void test44042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest88.test44042");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeEndIgnoreCase("a.lang.CloneableStringinterfacejava.i", "AAAAAAAAAAAAAAAAAAIRFCO$IRFIOSRA..AYL A.444444444444444444444444444g.g.g.g.g.g.gg.g.g.g.g.g.g.g.g.g.g.g.g.g.g.g.g.g.AVAJ.GNALAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAIRFCO$IRFIOSRA..AYL A.444444444444444444444444444g.g.g.g.g.g.gg.g.g.g.g.g.g.g.g.g.g.g.g.g.g.g.g.g.AVAJ.GNALAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAIRFCO$IRFIOSRA..AYL A");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "a.lang.CloneableStringinterfacejava.i" + "'", str2, "a.lang.CloneableStringinterfacejava.i");
    }

    @Test
    public void test44043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest88.test44043");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("aAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA       ", 'a');
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test44044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest88.test44044");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.mid("                                                                                                ", 406, 648);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test44045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest88.test44045");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsIgnoreCase("Vaj", "langAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA44444444444444444444444444...");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test44046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest88.test44046");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlpha((java.lang.CharSequence) "gnal");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test44047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest88.test44047");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceChars("loneableI", '4', 'a');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "loneableI" + "'", str3, "loneableI");
    }

    @Test
    public void test44048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest88.test44048");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.chomp("...avagnal.avajlang.javagnal.avajlang....VA.LANGAVAJ.GNALJAVA.LANGAVAJ.GNALJAVA.LANGAVAJ.GNALJAVA.LANGAVAJ.GNALJAVA.LANGAVAJ.GNALJAV...", "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "...avagnal.avajlang.javagnal.avajlang....VA.LANGAVAJ.GNALJAVA.LANGAVAJ.GNALJAVA.LANGAVAJ.GNALJAVA.LANGAVAJ.GNALJAVA.LANGAVAJ.GNALJAV..." + "'", str2, "...avagnal.avajlang.javagnal.avajlang....VA.LANGAVAJ.GNALJAVA.LANGAVAJ.GNALJAVA.LANGAVAJ.GNALJAVA.LANGAVAJ.GNALJAVA.LANGAVAJ.GNALJAV...");
    }

    @Test
    public void test44049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest88.test44049");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("##############################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################");
        java.lang.String str5 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray1, "                                                                       javaStrin                                                                       ", (int) (short) 100, 36);
        java.lang.String str6 = org.apache.commons.lang3.StringUtils.getCommonPrefix(strArray1);
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "##############################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################" + "'", str6, "##############################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################");
    }

    @Test
    public void test44050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest88.test44050");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.rightPad("aaaaaaa       INTEGER        aaaaaaa                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                            ", 651, '4');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "aaaaaaa       INTEGER        aaaaaaa                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                            444444444444444444444444444444444444444444444444444444444444444444444444444" + "'", str3, "aaaaaaa       INTEGER        aaaaaaa                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                            444444444444444444444444444444444444444444444444444444444444444444444444444");
    }

    @Test
    public void test44051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest88.test44051");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOfIgnoreCase("LANGA", "                                     RUV", 97);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test44052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest88.test44052");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsIgnoreCase("AAAAAAAAAAJ#V##.#GNAAAAAAAAAAJ#V##.#GNAAAAAAAAAAJ#V##.#GNAAAAAAAAAAJ#V##.#GNAAAAAAAAAAJ#V##.#GNAAAAAAAAAAJ#V##.#GNAAAAAAAAAAJ#V##.#GNAAAAAAAAAAJ#V##.#GNAAAAAAAAAAJ#V##.#GNAAAAAAAAAAJ#V##.#GNAAAAAAAAAAJ#V##.#GNAAAAAAAAAAJ#V##.#GNAAAAAAAAAAJ#                                              AAAAAAAJ#V##.#GNAAAAAAAAAAJ#V##.#GNAAAAAAAAAAJ#V##.#GNAAAAAAAAAAJ#V##.#GNAAAAAAAAAAJ#V##.#GNAAAAAAAAAAJ#V##.#GNAAAAAAAAAAJ#V##.#GNAAAAAAAAAAJ#V##.#GNAAAAAAAAAAJ#V##.#GNAAAAAAAAAAJ#V##.#GNAAAAAAAAAAJ#V##.#GNAAAAAAAAAAJ#V##.#GNAAAAAAAAAARING", "JAVAL.AGNaaaaaaaaaaJAVAL.AGNaaaaaaaaaaJAVAL.AGNaaaaaaaaaaJAVAL.AGNaaaaaaaaaaJAVAL.AGNaaaaaaaaaaJAVAL.AGNaaaaaaaaaaJAVAL.AGNaaaaaaaaaaJAVAL.AGNaaaaaaaaaaJAVAL.AGNaaaaaaaaaaJAVAL.AGNaaaaaaaaaaJAVAL.AGNaaaaaaaaaaJAVAL.AGNaaaaaaaaaaJAVAL.AGNaaaaaaaaaaJAVAL.AGNaaaaaaaaaaJAVAL.AGNaaaaaaaaaaJAVAL.AGNaaaaaaaaaaJAVAL.AGNaaaaaaaaaaJAVAL.AGNaaaaaaaaaaJAVAL.AGNaaaaaaaaaaJAVAL.AGNaaaaaaaaaaJAVAL.AGNaaaaaaaaaaJAVAL.AGNaaaaaaaaaaJAVAL.AGNaaaaaaaaaaJAVAL.AGNaaaaaaaaaaJAVAL.AGNaaaaaaaaaaJAVAL.AGNaaaaaaaaaaJAVAL.AGNaaaaaaaaaaJAVAL.AGNaaaaaaaaaaJAVAL.AGNaaaaaaaaaaJAVAL.AGNaaaaaaaaaaJAVAL.AGNaaaaaaaaaaJAVAL.AGNaaaaaaaaaaJAVAL");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test44053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest88.test44053");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator(".........ava..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java", "$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$A rrr rrr rrr r...", 61);
        int int4 = org.apache.commons.lang3.StringUtils.indexOfDifference((java.lang.CharSequence[]) strArray3);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
    }

    @Test
    public void test44054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest88.test44054");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitByCharacterType("NTERFACEJAVA.LANG.cLONEABLE.......JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVAINTERFACEJAVA.IO.sERIALIZABLE");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray1);
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "NTERFACEJAVA.LANG.cLONEABLE.......JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVAINTERFACEJAVA.IO.sERIALIZABLE" + "'", str2, "NTERFACEJAVA.LANG.cLONEABLE.......JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVAINTERFACEJAVA.IO.sERIALIZABLE");
    }

    @Test
    public void test44055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest88.test44055");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass2 = org.apache.commons.lang3.ClassUtils.getClass("][sslC][sslCrChahaAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAA", true);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassNotFoundException; message: ][sslC][sslCrChahaAAAAAAAAAAjaval/agnAAAAAAAAAAjaval/agnAAAAAAAAAAjaval/agnAAAAAAAAAAjaval/agnAAAAAAAAAAjaval/agnAAAAAAAAAAjaval/agnAAAAAAAAAAjaval/agnAAAAAAAAAAjaval/agnAAAAAAAAAAjaval/agnAAAAAAAAAAjaval/agnAAAAAAAAAAjaval/agnAAAAAAAAAAjaval/agnAAAAAAAAAAjaval/agnAAAAAAAAAAjaval/agnAAAAAAAAAAjaval/agnAAAAAAAAAAjaval/agnAAAAAAAAAAjaval/agnAAAAAAAAAAjaval/agnAAAAAAAAAAjaval/agnAAAAAAAAAAjaval/agnAAAAAAAAAAjaval/agnAAAAAAAAAAjaval/agnAAAAAAAAAAjaval/agnAAAAAAAAAAjaval/agnAAAAAAAAAAjaval/agnAAAAAAAAAAjaval/agnAAAAAAAAAAjaval/agnAAAAAAAAAAjaval/agnAAAAAAAAAAjaval/agnAAAAAAAAAAjaval/agnAAAAAAAAAAjaval/agnAAAAAAAAAAjaval/agnAAAAAAAAAAjaval/agnAAAAAAAAAAjaval/agnAAAAAAAAAAjaval/agnAAAAAAAAAA");
        } catch (java.lang.ClassNotFoundException e) {
            // Expected exception.
        }
    }

    @Test
    public void test44056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest88.test44056");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "#                                                                                                                                                      #               rrclass javalangObjectys#                                                                                                                                                      #               ", "LITU.AVAJ....................................................................$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$Gnal$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$                       $$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$Gnal$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$javaulang...................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test44057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest88.test44057");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAllUpperCase((java.lang.CharSequence) "interface java.lang.Cloneableainterface java.io.Serializabl");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test44058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest88.test44058");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.rightPad("interface java.lang.Cloneable$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$interface java.io.Serializable                                ", 717);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "interface java.lang.Cloneable$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$interface java.io.Serializable                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                " + "'", str2, "interface java.lang.Cloneable$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$interface java.io.Serializable                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                ");
    }

    @Test
    public void test44059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest88.test44059");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.mid("AAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agn", 303, 109);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "nAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjav" + "'", str3, "nAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjav");
    }

    @Test
    public void test44060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest88.test44060");
        java.lang.String[] strArray1 = null;
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("NG.JAVAGNAL.AVAJLANG.JAVAGNAL.AVAJLANG.JAVAGNAL.AVAJLANG.JAVAGNAL.AVAJLANG.JAVAGNAL.AVAJLANG.JAVAGNAL.AVAJLANG.GNALELBAENOLC.GNAL.AVAJ ECAFR", ' ');
        java.lang.String str5 = org.apache.commons.lang3.StringUtils.replaceEachRepeatedly("#################################################################################################################################irfco$irfiosriiz", strArray1, strArray4);
        java.lang.String str7 = org.apache.commons.lang3.ClassUtils.getPackageCanonicalName((java.lang.Object) strArray1, "interface java.lang.Cloneableinterface#java.lang.cloneable4interfaceinterface java.io.Serializable");
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "#################################################################################################################################irfco$irfiosriiz" + "'", str5, "#################################################################################################################################irfco$irfiosriiz");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "interface java.lang.Cloneableinterface#java.lang.cloneable4interfaceinterface java.io.Serializable" + "'", str7, "interface java.lang.Cloneableinterface#java.lang.cloneable4interfaceinterface java.io.Serializable");
    }

    @Test
    public void test44061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest88.test44061");
        int int2 = org.apache.commons.lang3.StringUtils.getLevenshteinDistance((java.lang.CharSequence) "irfCo.irfioSrAaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", (java.lang.CharSequence) "CLASS [lJAVA.LANG.cLASS;CLASS [lJAVA.LANG.cLASS;CLASS [lJAVA.LANG.cLASS;CLASS [lJAVA.LANG");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 86 + "'", int2 == 86);
    }

    @Test
    public void test44062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest88.test44062");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOf("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "va1jva1jva1jva1jva1jva1jva1jva1jva1jva1jvaJAVAULANGva1jva1jva1jva1jva1jva1jva1jva1jva1jva1jva1va1jva1jva1jva1jva1jva1jva1jva1jva1jva1jvaJAVAULANGva1jva1jva1jva1jva1jva1jva1jva1jva1jva1jva1va1jva1jva1jva1jva1jva1jva1jva1jva1jva1jvaJAVAULANGva1jva1jva1jva1jva1jva1jva1jva1jva1jva1jva1va1jva1jva1jva1jva1jva1jva1jva1jva1jva1jvaJAVAULANGva1jva1jva1jva1jva1jva1jva1jva1jva1jva1jva1va1jva1jva1jva1jva1jva1jva1jva1jva1jva1jvaJAVAULANGva1jva1jva1jva1jva1jva1jva1jva1jva1jva1jva1va1jva1jva1jva1jva1jva1jva1jva1jva1jva1jvaJAVAULANGva1jva1jva1jva1jva1jva1jva1jva1jva1jva1jva1va1jva1jva1jva1jva1jva1jva1jva1jva1jva1jvaJAVAULANGva1jva1jva1jva1jva1jva1jva1jva1jva1jva1jva1va1jva1jva1jva1jva1jva1jva1jva1jva1jva1jvaJAVAULANGva1jva1jva1jva1jva1jva1jva1jva1jva1jva1jva1va1jva1jva1jva1jva1jva1jva1jva1jva1jva1jvaJAVAULANGva1jva1jva1jva1jva1jva1jva1jva1jva1jva1jva1va1jva1jva1jva1jva1jva1jva1jva1jva1jva1jvaJAVAULANGva1jva1jva1jva1jva1jva1jva1jva1jva1jva1jva1", 484);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test44063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest88.test44063");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "                                                                                                                                                                                                                            .lang.Cloneable4i                                                                                                                                                                                                                            ", "Aaaaaaaautilaaaaaaaaa");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 221 + "'", int2 == 221);
    }

    @Test
    public void test44064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest88.test44064");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.equals((java.lang.CharSequence) "interface java.lang.Cloneable4444444string.44444444interface java.io.Serializable", (java.lang.CharSequence) ".......                                                                                                                                                                                                                             va.langGNAL..la..                                                                                                                                                                                                                              ......................................44444444444444444444444444444444444444444444444444444444444444444444444javaulang444444444444444444444444444444444444444444444444444444444444444444444444....................................................................................................................................................");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test44065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest88.test44065");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("A..iyL ziirSoifri.oCfri");
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test44066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest88.test44066");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isEmpty((java.lang.CharSequence) "                 ...");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test44067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest88.test44067");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("interface java.lang.CloneableAtsiLytcejbO.gnal.avajssalcrrAtsiLytcejbO.gnal.avajssalcrrAva.langGNAL..langjavainterface java.io.Serializable", "VAArra", 125);
        java.lang.String[] strArray5 = org.apache.commons.lang3.StringUtils.stripAll(strArray3, "gnirtS.gnal.avaj ssalcgnirtS.gnal.avaj ssalcgnirtS.gnal.avaj ssalcgnirtS.gnal.avaj ssalcgnirtS.gnal.avaj ssalcgnirtS.gnal.avaj ssalcgnirtS.gnal.avaj ssalcgnirtS.gnal.avaj ssalcgnirtS.gnal.avaj ssalcgnirtS.gnal.avaj ssalcgnirtS.gnal.avaj ssalcgnirtS.gnal.avaj ssalcgnirtS.gnal.avaj ssalcgnirtS.gnal.avaj ssalcgnirtS.gnal.avaj ssalcgnirtS.gnal.avaj ... .... .java.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.lang... .... .java.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.lang... .... .java.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.lang... .... .java.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.lang... .... .java.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.lang... .... .");
        java.lang.String str7 = org.apache.commons.lang3.ClassUtils.getShortCanonicalName((java.lang.Object) strArray5, "interfacejava.lang.CloneableJAVAinterfacejava.io.Serializable");
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "String[]" + "'", str7, "String[]");
    }

    @Test
    public void test44068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest88.test44068");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isWhitespace((java.lang.CharSequence) "Aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa...aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test44069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest88.test44069");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.abbreviate("gn lu v j                       ....................................................................gn lu v j                       ....................................................................gn lu v j                       ......................................                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                     ArrayListArrayListArrayListavajagnal", 825);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "gn lu v j                       ....................................................................gn lu v j                       ....................................................................gn lu v j                       ......................................                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                        ..." + "'", str2, "gn lu v j                       ....................................................................gn lu v j                       ....................................................................gn lu v j                       ......................................                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                        ...");
    }

    @Test
    public void test44070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest88.test44070");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOf("interface java.lang.Cloneable-1A.A.Auti.StriAj-1A.A.Auti.StriAjinterface java.io.Serializable", "AVAJ.GNA");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test44071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest88.test44071");
        java.util.Locale locale1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.apache.commons.lang3.StringUtils.upperCase("JAVALAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAGN", locale1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test44072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest88.test44072");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeStart("IZABLESERIALIJAVASTRINSERIALIZABLESERIALIZABLE", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaa44444444444444444444444444444444444444444444444444");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "IZABLESERIALIJAVASTRINSERIALIZABLESERIALIZABLE" + "'", str2, "IZABLESERIALIJAVASTRINSERIALIZABLESERIALIZABLE");
    }

    @Test
    public void test44073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest88.test44073");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.contains("                                                                                                                                                                                                                             aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa                                                                                                                                                                                                                             ", 73);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test44074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest88.test44074");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOf("rface java.lang.cloneable                                                 ", "a.lang.cloneablestringinterface java.io                          a.lang.cloneablestringinterface java.io                          a.lang.cloneablestringinterface java.io                          a.lang.cloneablestringinterface java.io                          a.lang.cloneablestringinterface java.io                          a.lang.cloneablestringinterface java.io                          a.lang.cloneablestringinterface java.io                          a.lang.cloneablestringinterface java.io                          a.lang.cloneablestringinterface java.io                          a.lang.cloneablestringinterface java.io                          ", 103);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test44075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest88.test44075");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("lC.gnal.avaj ecafretnielbazilaireS.oi.avaj ecafretni$elbaenolC.gnal.avaj ecafretnielbazilaireS.oi.avaj ecafretni$elbaenolC.gnal.avaj ecafretni$gnal.avaj", "INTEGER", 666);
        java.lang.String str5 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray3, "ssal#C");
        java.lang.String[] strArray7 = org.apache.commons.lang3.StringUtils.stripAll(strArray3, "AAAAjGNALAAAAAjAAAAAAAAjAGNALAAVAJ");
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "lC.gnal.avaj ecafretnielbazilaireS.oi.avaj ecafretni$elbaenolC.gnal.avaj ecafretnielbazilaireS.oi.avaj ecafretni$elbaenolC.gnal.avaj ecafretni$gnal.avaj" + "'", str5, "lC.gnal.avaj ecafretnielbazilaireS.oi.avaj ecafretni$elbaenolC.gnal.avaj ecafretnielbazilaireS.oi.avaj ecafretni$elbaenolC.gnal.avaj ecafretni$gnal.avaj");
        org.junit.Assert.assertNotNull(strArray7);
    }

    @Test
    public void test44076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest88.test44076");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("avaj.gnal", "$       ");
        java.lang.String[] strArray7 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("...", 'a');
        java.lang.String[] strArray10 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("$", "                                   ");
        java.lang.String str11 = org.apache.commons.lang3.StringUtils.replaceEachRepeatedly("...       ", strArray7, strArray10);
        java.lang.String str12 = org.apache.commons.lang3.StringUtils.replaceEachRepeatedly("                                              ", strArray3, strArray10);
        java.lang.String str14 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray10, "-1java.utilString[]");
        java.lang.String[] strArray16 = org.apache.commons.lang3.StringUtils.stripAll(strArray10, "Class[]aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        java.lang.String str17 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray10);
        java.lang.String str18 = org.apache.commons.lang3.StringUtils.concat((java.lang.Object[]) strArray10);
        java.lang.String str22 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray10, '#', 486, 35);
        java.lang.String[] strArray23 = org.apache.commons.lang3.StringUtils.stripAll(strArray10);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertNotNull(strArray10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "$       " + "'", str11, "$       ");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "                                              " + "'", str12, "                                              ");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "$" + "'", str14, "$");
        org.junit.Assert.assertNotNull(strArray16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "$" + "'", str17, "$");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "$" + "'", str18, "$");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertNotNull(strArray23);
    }

    @Test
    public void test44077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest88.test44077");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.split("...............................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................");
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test44078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest88.test44078");
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
        java.lang.String str29 = org.apache.commons.lang3.StringUtils.concat((java.lang.Object[]) wildcardClassArray20);
        java.lang.Class[] classArray31 = new java.lang.Class[0];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray32 = (java.lang.Class<?>[]) classArray31;
        java.lang.Class<?>[] wildcardClassArray33 = org.apache.commons.lang3.ClassUtils.primitivesToWrappers(wildcardClassArray32);
        boolean boolean34 = org.apache.commons.lang3.ClassUtils.isAssignable(wildcardClassArray20, wildcardClassArray33);
        java.lang.String str36 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) wildcardClassArray20, '#');
        java.lang.Class<?>[] wildcardClassArray37 = org.apache.commons.lang3.ClassUtils.primitivesToWrappers(wildcardClassArray20);
        java.lang.Class<?>[] wildcardClassArray38 = org.apache.commons.lang3.ClassUtils.primitivesToWrappers(wildcardClassArray20);
        java.lang.Class<?>[] wildcardClassArray39 = org.apache.commons.lang3.ClassUtils.wrappersToPrimitives(wildcardClassArray38);
        java.lang.String str40 = org.apache.commons.lang3.StringUtils.concat((java.lang.Object[]) wildcardClassArray38);
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
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "" + "'", str29, "");
        org.junit.Assert.assertNotNull(classArray31);
        org.junit.Assert.assertNotNull(wildcardClassArray32);
        org.junit.Assert.assertNotNull(wildcardClassArray33);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "" + "'", str36, "");
        org.junit.Assert.assertNotNull(wildcardClassArray37);
        org.junit.Assert.assertNotNull(wildcardClassArray38);
        org.junit.Assert.assertNotNull(wildcardClassArray39);
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "" + "'", str40, "");
    }

    @Test
    public void test44079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest88.test44079");
        java.lang.ClassLoader classLoader0 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass2 = org.apache.commons.lang3.ClassUtils.getClass(classLoader0, "interface java.lang.Cloneable...    $         $         $         $         $      -1JAVA.UTILsTRING-1JAVA.UTILsTRINGinterface java.io.Serializable");
            org.junit.Assert.fail("Expected exception of type java.lang.ClassNotFoundException; message: interfacejava/lang/Cloneable///$$$$$-1JAVA/UTILsTRING-1JAVA/UTILsTRINGinterfacejava/io/Serializable");
        } catch (java.lang.ClassNotFoundException e) {
            // Expected exception.
        }
    }

    @Test
    public void test44080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest88.test44080");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.endsWith("                                    444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444litu.avajlitu.avaj                                    ", "rrayListrrayListrrayListrrayListrrayListrrayListrrayListrrayListrrayListrr...    ...rrayListrrayListrrayListrrayListrrayListrrayListrrayListrrayListrrayListrra");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test44081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest88.test44081");
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.overlay("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa...langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava..", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaainterface java.lang.CloneableStringinterface java.io.SerializableINTERFACE JAVA.LANG.cLONEABLE....", 60, 39);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaainterface java.lang.CloneableStringinterface java.io.SerializableINTERFACE JAVA.LANG.cLONEABLE....aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa...langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.." + "'", str4, "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaainterface java.lang.CloneableStringinterface java.io.SerializableINTERFACE JAVA.LANG.cLONEABLE....aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa...langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava..");
    }

    @Test
    public void test44082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest88.test44082");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.upperCase("$         44444444444444444444444444444444444444444444444444444444444444444444444444444444");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "$         44444444444444444444444444444444444444444444444444444444444444444444444444444444" + "'", str1, "$         44444444444444444444444444444444444444444444444444444444444444444444444444444444");
    }

    @Test
    public void test44083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest88.test44083");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("       ", "                            rrayList", 3);
        java.lang.Class<?>[] wildcardClassArray4 = org.apache.commons.lang3.ClassUtils.toClass((java.lang.Object[]) strArray3);
        java.lang.String str5 = org.apache.commons.lang3.StringUtils.concat((java.lang.Object[]) wildcardClassArray4);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertNotNull(wildcardClassArray4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "class java.lang.Stringclass java.lang.Stringclass java.lang.String" + "'", str5, "class java.lang.Stringclass java.lang.Stringclass java.lang.String");
    }

    @Test
    public void test44084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest88.test44084");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.swapCase("GGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGNJAVALAGNGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGG");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "ggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggnjavalagnggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggg" + "'", str1, "ggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggnjavalagnggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggg");
    }

    @Test
    public void test44085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest88.test44085");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.deleteWhitespace("a..AYl a##############");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "a..AYla##############" + "'", str1, "a..AYla##############");
    }

    @Test
    public void test44086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest88.test44086");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringAfterLast("AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA", "java.langaGNAL.AVAJGNAL..langGNAL.AVaRRCLASS JAVA.LANG.oBJECTYlISTaR...");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test44087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest88.test44087");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceChars("$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$java.utiljava.utilarra$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$", 'a', '$');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$j$v$.utilj$v$.util$rr$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$" + "'", str3, "$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$j$v$.utilj$v$.util$rr$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$");
    }

    @Test
    public void test44088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest88.test44088");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.rightPad("a..AYL A.44444444444444444444444444                                 ", 141);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "a..AYL A.44444444444444444444444444                                                                                                          " + "'", str2, "a..AYL A.44444444444444444444444444                                                                                                          ");
    }

    @Test
    public void test44089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest88.test44089");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.lowerCase("                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                        ylist............................rraylist............................rraylist............................rray$arraylis");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                        ylist............................rraylist............................rraylist............................rray$arraylis" + "'", str1, "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                        ylist............................rraylist............................rraylist............................rray$arraylis");
    }

    @Test
    public void test44090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest88.test44090");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("Aaaaaaaaaaaa                                                ", ".utiljava.u", 13);
        java.lang.String str5 = org.apache.commons.lang3.ClassUtils.getPackageName((java.lang.Object) "Aaaaaaaaaaaa                                                ", "hi!ArrayListArrayListArrayListavajhhhh AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAhhh AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAhhh AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAhhh AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAhhh AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAhhh AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAhhh AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAhhh AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAhhh AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAhhh AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA");
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "java.lang" + "'", str5, "java.lang");
    }

    @Test
    public void test44091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest88.test44091");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNotBlank((java.lang.CharSequence) "stringUtilsStringUtilsStringUtilsStringUtilsStringUtilsStringUtilsStringUtilsStringUtilsStringUtilsStringUtil");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test44092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest88.test44092");
        int int3 = org.apache.commons.lang3.StringUtils.lastOrdinalIndexOf("GNAL.AVAJ ", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaVAJ", 280);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test44093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest88.test44093");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isEmpty((java.lang.CharSequence) "arraylis...va.langavaj.gnaljava.langavaj.gnaljava.langavaj.gnaljava.langavaj.gnaljava.langavaj.gnaljava.lang");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test44094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest88.test44094");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("StringUtils", "AVAJ.GNAL", 2);
        java.lang.String[] strArray5 = org.apache.commons.lang3.StringUtils.stripAll(strArray3, "");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str9 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray3, '4', 37, 42);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 37");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertNotNull(strArray5);
    }

    @Test
    public void test44095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest88.test44095");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBefore("$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$ho$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$rayList$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$t", " ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$ho$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$rayList$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$t" + "'", str2, "$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$ho$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$rayList$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$t");
    }

    @Test
    public void test44096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest88.test44096");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.split("                                                                                      ");
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test44097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest88.test44097");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceOnce("siLyarrAtsiLyarrAtsiLyarrAtsiLyarrA.", "", "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "siLyarrAtsiLyarrAtsiLyarrAtsiLyarrA." + "'", str3, "siLyarrAtsiLyarrAtsiLyarrAtsiLyarrA.");
    }

    @Test
    public void test44098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest88.test44098");
        java.lang.ClassLoader classLoader0 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass3 = org.apache.commons.lang3.ClassUtils.getClass(classLoader0, "                                                               ", false);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassNotFoundException; message: ");
        } catch (java.lang.ClassNotFoundException e) {
            // Expected exception.
        }
    }

    @Test
    public void test44099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest88.test44099");
        int int3 = org.apache.commons.lang3.StringUtils.indexOf(".v.j.gn.lnAAAAAAAAAAj.v.l..gnAAAAAAAAAAj.v.l..gnAAAAAAAAAAj.v.l..gnAAAAAAAAAAj.v.l..gnAAAAAAAAAAj.v.l..gnAAAAAAAAAAj.v.l..gnAAAAAAAAAAj.v.l..gnAAAAAAAAAAj.v.l..gnAAAAAAAAAAj.v.l..gnAAAAAAAAAAj.v.l..gnAAAAAAAAAAj.v.l..gnAAAAAAAAAAj.v.l..gnAAAAAAAAAAj.v.l..gnAAAAAAAAAAj.v.l..gnAAAAAAAAAAj.v.l..gnAAAAAAAAAAj.v.l..gnAAAAAAAAAAj.v.l..gnAAAAAAAAAAj.v.l..gnAAAAAAAAAAj.v.l..gnAAAAAAAAAAj.v.l..gnAAAAAAAAAAj.v.l..gnAAAAAAAAAAj.v.l..gnAAAAAAAAAAj.v.l..gnAAAAAAAAAAj.v.l..gnAAAAAAAAAAj.v.l..gnAAAAAAAAAAj.v.l..gnAAAAAAAAAAj.v.l..gnAAAAAAAAAAj.v.l..gnAAAAAAAAAAj.v.l..gnAAAAAAAAAAj.v.l..gnAAAAAAAAAAj.v.l..gnAAAAAAAAAAj.v.l..gnAAAAAAAAAAj.v.l..gnAAAAAAAAAAj.v.l", "irfSeriaCoSeria$SeriairfioSeriInterface java.lang.Cloneable             Character             interface java.io.SerializableirfSeriaCoSeria$SeriairfioSeria", 16);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test44100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest88.test44100");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.startsWith("                                                                                                                                                                                                                 UTIL                                                                                                                                                                                                                                                                                                                                                                                                                                      4444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444AAAAAAAAAA                                                                                                                                                                                      ", "java.lang$interface java.lang.Cloneable$interface java.io.Serializableinterface java.lang.Cloneable$interface java.io.Serializableinterface java.lang.Cl");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test44101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest88.test44101");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.reverse("   A..ayL A    ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "    A Lya..A   " + "'", str1, "    A Lya..A   ");
    }

    @Test
    public void test44102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest88.test44102");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.split("gn gnal.avajgn gnal.avajgn gnal.avajgn gnal.avajgn gnal.avajgn gnal.avajgn gnal.avajgn gnal.avajgn gnal.avajgn gnal.avajgn gnal.avajgn gnal.avajgn gnal.avajgn gnal.avajgn gnal.avajgn gnal.avajgn gnal.avajgn gnal.avajgn gnal.avajgn gnal.avajgn gnal.avajgn gnal.avajgn gnal.avajgn gnal.avajgn gnal.avajgn gnal.avajgn gnal.avajgn gnal.avajgn gnal.avajgn gnal.avajgn gnal.avajgn gnal.avajgn gnal.avajgn gnal.avajgn gnal.avajgn gnal.avajgn gnal.avajgn gnal.avajgn gnal.avajgn gnal.avajgn gnal.avajgn gnal.avajgn gnal.avajgn gnal.avajgn gnal.avajgn gnal.avajgn gnal.avajgn gnal.avajgn gnal.avajgn gnal.avajgn gnalClass[]aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test44103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest88.test44103");
        char[] charArray10 = new char[] { ' ', ' ', '#', 'a', '4', 'a' };
        int int11 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "", charArray10);
        boolean boolean12 = org.apache.commons.lang3.StringUtils.containsAny("......", charArray10);
        boolean boolean13 = org.apache.commons.lang3.StringUtils.containsAny("                                                                                                    ", charArray10);
        int int14 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "JAVAsTRIN", charArray10);
        org.junit.Assert.assertNotNull(charArray10);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray10), "  #a4a");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray10), "  #a4a");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray10), "[ ,  , #, a, 4, a]");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
    }

    @Test
    public void test44104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest88.test44104");
        java.util.Locale locale1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.apache.commons.lang3.StringUtils.lowerCase("CLASSJAVA.UTIL.ABSTRACTLISTGNLUVJ....................................................................CLASSJAVA.UTIL.ABSTRACTCOLLECTIONGNLUVJ....................................................................CLASSJAVA.LANG.OBJECT", locale1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test44105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest88.test44105");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.equalsIgnoreCase("GNALUAVAJGNALUAVAJGNALUAVAJGNALUAVAJGNALUAVAJGNALUAVAJGNALUAVAJGNALUAVAJGNALUAVAJGNALUAVAJGNALUAVAJGNALUAVAJGNALUAVAJGNALUAVAJGNALUAVAJGNALUAVAJGNALUAVAJGNALUAVAJGNALUAVAJGNALUAVAJSSALCGNALAVAJSSALC                                                                                                                                                                                                                                                                                                                                                                                          SLITuGNIRTsSLITuGNIRTsSLITuGNIRTsSLITuGNIRTsSL", "interfacejava.lang.CloneableString[]Strijavaulang[]String[]interfacejava.io");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test44106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest88.test44106");
        int int2 = org.apache.commons.lang3.StringUtils.countMatches("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaajavajavajavajavajavajavajavajavajavajavajavajavajavajavajavajavajavajavajavajavajavajavajavajavajavajavajavajavajavajavajavajavajavajava", "##############################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test44107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest88.test44107");
        java.lang.String str1 = org.apache.commons.lang3.ClassUtils.getPackageCanonicalName("aa                                    ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
    }

    @Test
    public void test44108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest88.test44108");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.difference("VAARRARJAVAARRARJAVAARRARJAVAARRARJAVAARRARJAVAARRARJAVAARRARJAVAARRARJAVAARRARJAVAARRARJAVAARRARJAVAARRARJAVAARRARJAVAARRARJAVAARRARJAVAARRARJAVAARRARJAVAARRARJAVAARRARJAVAARRARJAVAARRARJAVAARRARJAVAARRARJAVAARRARJAVAARRARJAVAARRARJAVAARRARJAVAARRARJAVAARRARJAVAARRARJAVAARRARJAVAARRARJAVAARRARJAVAARRARJAVAARRARJAVAARRARJAVAARRARJAVAARRARJAVAARRARJAVAARRARJAVAARRARJAVAARRARJAVAARRARJAVAARRARJAVAARRARJAVAARRARJAVAARRARJAVAARRARJAlass java.lang.String", "ArrayListArrayListArrayListavaj.gnalAVAJ.GNALAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAACharacterCharacterCharacterCharacterclassjavalangClassJAVAULANGJAVAULANGJAVAULANGJAVAULANGJAVAULANGJAVAULANGJAVAULANGJAVAULANGJAVAULANGJAVAULANGJAVAULANGJAVAULANGJAVAULANGJAVAULANGJAVAULANGJAVAULANGJAVAULANGJAVAULANGJAVAULANGJAVAULANG$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "ArrayListArrayListArrayListavaj.gnalAVAJ.GNALAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAACharacterCharacterCharacterCharacterclassjavalangClassJAVAULANGJAVAULANGJAVAULANGJAVAULANGJAVAULANGJAVAULANGJAVAULANGJAVAULANGJAVAULANGJAVAULANGJAVAULANGJAVAULANGJAVAULANGJAVAULANGJAVAULANGJAVAULANGJAVAULANGJAVAULANGJAVAULANGJAVAULANG$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$" + "'", str2, "ArrayListArrayListArrayListavaj.gnalAVAJ.GNALAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAACharacterCharacterCharacterCharacterclassjavalangClassJAVAULANGJAVAULANGJAVAULANGJAVAULANGJAVAULANGJAVAULANGJAVAULANGJAVAULANGJAVAULANGJAVAULANGJAVAULANGJAVAULANGJAVAULANGJAVAULANGJAVAULANGJAVAULANGJAVAULANGJAVAULANGJAVAULANGJAVAULANG$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$");
    }

    @Test
    public void test44109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest88.test44109");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.split("444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444", "GNALJAVA.LANGAVAJ.GNALJAVA.LANGAVAJ.GNALJAVA.LANGAVAJ.GNALJAVA.LANGAVAJ.GNALJAVA.LANGaArr");
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test44110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest88.test44110");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBetween("4444444444444444ssssssssss", "                                                                                                                                               ...");
        org.junit.Assert.assertNull(str2);
    }

    @Test
    public void test44111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest88.test44111");
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
        java.lang.String str32 = org.apache.commons.lang3.StringUtils.concat((java.lang.Object[]) wildcardClassArray30);
        java.lang.Class<?>[] wildcardClassArray33 = org.apache.commons.lang3.ClassUtils.wrappersToPrimitives(wildcardClassArray30);
        java.lang.Class<?>[] wildcardClassArray34 = org.apache.commons.lang3.ClassUtils.wrappersToPrimitives(wildcardClassArray33);
        java.lang.String[] strArray37 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("ArrayList", '4');
        int int38 = org.apache.commons.lang3.StringUtils.indexOfDifference((java.lang.CharSequence[]) strArray37);
        java.lang.String str39 = org.apache.commons.lang3.StringUtils.getCommonPrefix(strArray37);
        java.lang.Class<?>[] wildcardClassArray40 = org.apache.commons.lang3.ClassUtils.toClass((java.lang.Object[]) strArray37);
        boolean boolean42 = org.apache.commons.lang3.ClassUtils.isAssignable(wildcardClassArray33, wildcardClassArray40, false);
        java.lang.String[] strArray45 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("hi!", "");
        java.lang.String[] strArray47 = org.apache.commons.lang3.StringUtils.stripAll(strArray45, "$");
        java.lang.Class<?>[] wildcardClassArray48 = org.apache.commons.lang3.ClassUtils.toClass((java.lang.Object[]) strArray45);
        java.lang.Class<?>[] wildcardClassArray49 = org.apache.commons.lang3.ClassUtils.toClass((java.lang.Object[]) wildcardClassArray48);
        java.lang.Class<?>[] wildcardClassArray50 = org.apache.commons.lang3.ClassUtils.primitivesToWrappers(wildcardClassArray48);
        java.lang.Class<?>[] wildcardClassArray51 = org.apache.commons.lang3.ClassUtils.primitivesToWrappers(wildcardClassArray50);
        java.lang.Class<?>[] wildcardClassArray52 = org.apache.commons.lang3.ClassUtils.primitivesToWrappers(wildcardClassArray50);
        java.lang.Class<?>[] wildcardClassArray53 = org.apache.commons.lang3.ClassUtils.primitivesToWrappers(wildcardClassArray52);
        boolean boolean54 = org.apache.commons.lang3.ClassUtils.isAssignable(wildcardClassArray40, wildcardClassArray53);
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
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "class java.lang.String" + "'", str32, "class java.lang.String");
        org.junit.Assert.assertNotNull(wildcardClassArray33);
        org.junit.Assert.assertNotNull(wildcardClassArray34);
        org.junit.Assert.assertNotNull(strArray37);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + (-1) + "'", int38 == (-1));
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "ArrayList" + "'", str39, "ArrayList");
        org.junit.Assert.assertNotNull(wildcardClassArray40);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + true + "'", boolean42 == true);
        org.junit.Assert.assertNotNull(strArray45);
        org.junit.Assert.assertNotNull(strArray47);
        org.junit.Assert.assertNotNull(wildcardClassArray48);
        org.junit.Assert.assertNotNull(wildcardClassArray49);
        org.junit.Assert.assertNotNull(wildcardClassArray50);
        org.junit.Assert.assertNotNull(wildcardClassArray51);
        org.junit.Assert.assertNotNull(wildcardClassArray52);
        org.junit.Assert.assertNotNull(wildcardClassArray53);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + true + "'", boolean54 == true);
    }

    @Test
    public void test44112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest88.test44112");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.stripStart(".........AVAJ", "v");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + ".........AVAJ" + "'", str2, ".........AVAJ");
    }

    @Test
    public void test44113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest88.test44113");
        char[] charArray17 = new char[] { ' ', ' ', '#', 'a', '4', 'a' };
        int int18 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "", charArray17);
        boolean boolean19 = org.apache.commons.lang3.StringUtils.containsAny("......", charArray17);
        int int20 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "AAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAA", charArray17);
        int int21 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "JAVA.LANGAVAJ.GNALJAVA.LANGAVAJ.GNALJAVA.LANGAVAJ.GNALJAVA.LANGAVAJ.GNALJAVA.LANGAVAJ.GNALJAVA.LANGAVAJ.GNALJAVA.LANGAVAJ.GNALJAVA.LANGAVAJ.GNALJAVA.LANG", charArray17);
        boolean boolean22 = org.apache.commons.lang3.StringUtils.containsAny("gnal.avajgnal..LANGgnal.avajgnal.", charArray17);
        boolean boolean23 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "STRING", charArray17);
        boolean boolean24 = org.apache.commons.lang3.StringUtils.containsAny("class java.lang.Object", charArray17);
        boolean boolean25 = org.apache.commons.lang3.StringUtils.containsAny("                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                    JAVA.LANGAVAJ.GNALJAVA.LANGAVAJ.GNALJAVA.LANGAVAJ.GNALJAVA.LANGAVAJ.GNALJAVA.LANGAVAJ.GNALJAVA.LANGAVAJ.GNALJAVA.LANGAVAJ.GNALJAVA.LANGAVAJ.GNALJAVA.LANG", charArray17);
        boolean boolean26 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA      ", charArray17);
        int int27 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA ", charArray17);
        boolean boolean28 = org.apache.commons.lang3.StringUtils.containsAny("Arrclas...#####", charArray17);
        org.junit.Assert.assertNotNull(charArray17);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray17), "  #a4a");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray17), "  #a4a");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray17), "[ ,  , #, a, 4, a]");
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 89 + "'", int27 == 89);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
    }

    @Test
    public void test44114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest88.test44114");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAsciiPrintable((java.lang.CharSequence) "                                                                                                                                                                                                                                                                                                                                                                                                                                                  ][gnirtSlituGNALUaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaGNAL.AVAJssalCavaj1-                                                                                                                                                                                                                                                                                                                                                                  ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test44115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest88.test44115");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitByCharacterType("java.lang$interface java.lang.Cloneable$interface java.io.Serializableinterface java.lang.Cloneable$interface java.io.Serializableinterface java.lang.Cl");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.stripAll(strArray1, "$$$$$$$$$$$$$$$$$$$$$$$$$$$$$...");
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void test44116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest88.test44116");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitByCharacterType("                                                                                                                                                                                                                                                                                                                                                                                                                                JAVA.LANGAgnl.vjgnl..LANGgnl.vArrclss jv.lng.ObjectyListAr...                                                                                                                                                                                                                                                                                                                                                         ");
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test44117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest88.test44117");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOfIgnoreCase("#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#lass javaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa                                aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "RING-1JAVA.UTILsTRING");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test44118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest88.test44118");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.endsWith("                                                                                                                                                                                                                                               vvaylasa                                                                                                                                                                                                                                                ", "$       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test44119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest88.test44119");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.rightPad("444444444444444444444444444444444444444444444444NG.Llit4444444444444444444444444444444444444444444444444", 144, 'a');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "444444444444444444444444444444444444444444444444NG.Llit4444444444444444444444444444444444444444444444444aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa" + "'", str3, "444444444444444444444444444444444444444444444444NG.Llit4444444444444444444444444444444444444444444444444aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
    }

    @Test
    public void test44120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest88.test44120");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOfIgnoreCase("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "", 300);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 30 + "'", int3 == 30);
    }

    @Test
    public void test44121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest88.test44121");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.endsWith("", "NTERFACEJAVA.LANG.cLONEABLE.......JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVAINTERFACEJAVA");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test44122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest88.test44122");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.rightPad("aaaaaaaaaa-1jv.utilString-1jv.utilStringaaaaaaaaaa", 840, '$');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "aaaaaaaaaa-1jv.utilString-1jv.utilStringaaaaaaaaaa$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$" + "'", str3, "aaaaaaaaaa-1jv.utilString-1jv.utilStringaaaaaaaaaa$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$");
    }

    @Test
    public void test44123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest88.test44123");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlpha((java.lang.CharSequence) "#..............................");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test44124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest88.test44124");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isEmpty((java.lang.CharSequence) "4444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444rclass java.lang.O...");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test44125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest88.test44125");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass2 = org.apache.commons.lang3.ClassUtils.getClass("a.Leyface javaAla..AClo.eableAAAAAAAjavaAAAAAAAObjecLavaAAAAAAAAAAjavaa.Leyface javaAaoASeyaalazable##################################################", true);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassNotFoundException; message: a/LeyfacejavaAla//AClo/eableAAAAAAAjavaAAAAAAAObjecLavaAAAAAAAAAAjavaa/LeyfacejavaAaoASeyaalazable##################################################");
        } catch (java.lang.ClassNotFoundException e) {
            // Expected exception.
        }
    }

    @Test
    public void test44126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest88.test44126");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.endsWith("JAVA.LANGAVAJ.GNALJAVA.LANGAVAJ.GNALJAVA.LANGAVAJ.GNALJAVA.LANGAVAJ.GNALJAVA.LANGAVAJ.GNALJAVA.LANGAVAJ.GNALJAVA.LANGAVAJ.GNALJAVA.LANGAVAJ.GNALJAVA.LANG", "                                         aAA    AAA");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test44127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest88.test44127");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.abbreviateMiddle("                                                                                                                                                                                                                                                                                                                                                                                                                                                interface java.lang.Cloneable][sslCinterface java.io.Serializable                                                                                                                                                                                                                                                                                                                                                                                                                                                ", "aaaaaaaa#AGNAAAAAAAAGNALaaaaaaaa", 893);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "                                                                                                                                                                                                                                                                                                                                                                                                                                               aaaaaaaa#AGNAAAAAAAAGNALaaaaaaaa                                                                                                                                                                                                                                                                                                                                                                                                                                              " + "'", str3, "                                                                                                                                                                                                                                                                                                                                                                                                                                               aaaaaaaa#AGNAAAAAAAAGNALaaaaaaaa                                                                                                                                                                                                                                                                                                                                                                                                                                              ");
    }

    @Test
    public void test44128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest88.test44128");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.strip("JAVAsTRIN");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "JAVAsTRIN" + "'", str1, "JAVAsTRIN");
    }

    @Test
    public void test44129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest88.test44129");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass2 = org.apache.commons.lang3.ClassUtils.getClass("iLyarrAtsiLyarrAtsiLyarrAlang.javatsiLyarrAtsiLyarrAtsiLyarrA", false);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassNotFoundException; message: iLyarrAtsiLyarrAtsiLyarrAlang.javatsiLyarrAtsiLyarrAtsiLyarrA");
        } catch (java.lang.ClassNotFoundException e) {
            // Expected exception.
        }
    }

    @Test
    public void test44130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest88.test44130");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAsciiPrintable((java.lang.CharSequence) "jAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANG");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test44131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest88.test44131");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass2 = org.apache.commons.lang3.ClassUtils.getClass("                                                                                                                                                                                                                                                                                                                                                                                          ARRYLISTARRYLISTARRYLISTVJGNAL.AVAJLANG.JAVAGNAL.AVAJLANG.JAVAGNAL.AVAJLANG.JAVAGNAL.AVAJLANG.JAVAGNAL.AVAJLANG.JAVAGNAL.AVAJLANG.JAVAGNAL.AVAJLANG.JAVAGNAL.AVAJLANG.JAVAGNAL.AVAJGNL                                                                                                                                                                                                                                                                                                                                                                                           ", false);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassNotFoundException; message: ARRYLISTARRYLISTARRYLISTVJGNAL.AVAJLANG.JAVAGNAL.AVAJLANG.JAVAGNAL.AVAJLANG.JAVAGNAL.AVAJLANG.JAVAGNAL.AVAJLANG.JAVAGNAL.AVAJLANG.JAVAGNAL.AVAJLANG.JAVAGNAL.AVAJLANG.JAVAGNAL.AVAJGNL");
        } catch (java.lang.ClassNotFoundException e) {
            // Expected exception.
        }
    }

    @Test
    public void test44132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest88.test44132");
        java.lang.String[] strArray6 = org.apache.commons.lang3.StringUtils.split("gNAL", "$         ", 525);
        boolean boolean7 = org.apache.commons.lang3.StringUtils.endsWithAny(" ", strArray6);
        boolean boolean8 = org.apache.commons.lang3.StringUtils.endsWithAny("44444444444444444444444444444444444444444444444444444444444444444444444444444444444444aaaaaaaaaava.lang", strArray6);
        java.lang.String[] strArray11 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("                                       sl..Ug..r.S", "Class[");
        java.lang.String str12 = org.apache.commons.lang3.StringUtils.replaceEach("4444444444444444SSSSSSSSSS", strArray6, strArray11);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "4444444444444444SSSSSSSSSS" + "'", str12, "4444444444444444SSSSSSSSSS");
    }

    @Test
    public void test44133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest88.test44133");
        char[] charArray17 = new char[] { ' ', ' ', '#', 'a', '4', 'a' };
        int int18 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "", charArray17);
        boolean boolean19 = org.apache.commons.lang3.StringUtils.containsAny("......", charArray17);
        int int20 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "AAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAA", charArray17);
        int int21 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "JAVA.LANGAVAJ.GNALJAVA.LANGAVAJ.GNALJAVA.LANGAVAJ.GNALJAVA.LANGAVAJ.GNALJAVA.LANGAVAJ.GNALJAVA.LANGAVAJ.GNALJAVA.LANGAVAJ.GNALJAVA.LANGAVAJ.GNALJAVA.LANG", charArray17);
        boolean boolean22 = org.apache.commons.lang3.StringUtils.containsAny("gnal.avajgnal..LANGgnal.avajgnal.", charArray17);
        boolean boolean23 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "STRING", charArray17);
        boolean boolean24 = org.apache.commons.lang3.StringUtils.containsAny("class java.lang.Object", charArray17);
        boolean boolean25 = org.apache.commons.lang3.StringUtils.containsAny("                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                    JAVA.LANGAVAJ.GNALJAVA.LANGAVAJ.GNALJAVA.LANGAVAJ.GNALJAVA.LANGAVAJ.GNALJAVA.LANGAVAJ.GNALJAVA.LANGAVAJ.GNALJAVA.LANGAVAJ.GNALJAVA.LANGAVAJ.GNALJAVA.LANG", charArray17);
        int int26 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "44444444444444444444444444444444444444444444...", charArray17);
        boolean boolean27 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "StringUtilsStringUtilsStringUtilsStringHi!ArrayListArrayListArrayListavaj.... AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA... AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA... AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA... AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA... AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA... AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA... AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA... AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA... AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA... ", charArray17);
        boolean boolean28 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "gnal.avaj                                                                                                                                                                                                                                                                                                                                                                                                                                                       ", charArray17);
        org.junit.Assert.assertNotNull(charArray17);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray17), "  #a4a");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray17), "  #a4a");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray17), "[ ,  , #, a, 4, a]");
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 44 + "'", int26 == 44);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
    }

    @Test
    public void test44134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest88.test44134");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trimToEmpty("                                                                             se...               ...");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "se...               ..." + "'", str1, "se...               ...");
    }

    @Test
    public void test44135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest88.test44135");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.leftPad("AVAJ.GNALAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAIRFCO$IRFIOSRA..AYL A.444444444444444444444444444", 3);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "AVAJ.GNALAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAIRFCO$IRFIOSRA..AYL A.444444444444444444444444444" + "'", str2, "AVAJ.GNALAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAIRFCO$IRFIOSRA..AYL A.444444444444444444444444444");
    }

    @Test
    public void test44136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest88.test44136");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBefore("erface java.lang.Cloneable4interface java.io.Serializabl", "aj  aj  aj  aj  aj  aj$#######$########aj  aj  aj  aj  aj  aj                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                 ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "erface java.lang.Cloneable4interface java.io.Serializabl" + "'", str2, "erface java.lang.Cloneable4interface java.io.Serializabl");
    }

    @Test
    public void test44137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest88.test44137");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.substringsBetween("       44444444444444444444444444...", "gNALUAVAJGNALUAVAJGNALUAVAJGNALUAVAJGNALUAVAJGNALUAVAJGNALUAVAJGNALUAVAJGNALUAVAJGNALUAVAJGNALUAVAJGNALUAVAJGNALUAVAJGNALUAVAJGNALUAVAJGNALUAVAJGNALUAVAJGNALUAVAJGNALUAVAJGNALUAVAJSSALCGNALAVAJSSALC                                                                                                                                                                                                                                                                                                                                                                                          ", "AVAJ.GNALAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA CharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterChara");
        org.junit.Assert.assertNull(strArray3);
    }

    @Test
    public void test44138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest88.test44138");
        java.lang.String str1 = org.apache.commons.lang3.ClassUtils.getShortClassName("utilString[]");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "utilString[]" + "'", str1, "utilString[]");
    }

    @Test
    public void test44139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest88.test44139");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("INTERFACEGAGA.LANG.cLONEABLEaaaaaaaaaaGAGAL.AGNaaaaaaaaaaGAGAL.AGNaaaaaaaaaaGAGAL.AGNaaaaaaaaaaGAGAL.AGNaaaaaaaaaaGAGAL.AGNaaaaaaaaaaGAGAL.AGNaaaaaaaaaaGAGAL.AGNaaaaaaaaaaGAGAL.AGNaaaaaaaaaaGAGAL.AGNaaaaaaaaaaGAGAL.AGNaaaaaaaaaaGAGAL.AGNaaaaaaaaaaGAGAL.AGNaaaaaaaaaaGAGAL.AGNaaaaaaaaaaGAGAL.AGNaaaaaaaaaaGAGAL.AGNaaaaaaaaaaGAGAL.AGNaaaaaaaaaaGAGAL.AGNaaaaaaaaaaGAGAL.AGNaaaaaaaaaaGAGAL.AGNaaaaaaaaaaGAGAL.AGNaaaaaaaaaaGAGAL.AGNaaaaaaaaaaGAGAL.AGNaaaaaaaaaaGAGAL.AGNaaaaaaaaaaGAGAL.AGNaaaaaaaaaaGAGAL.AGNaaaaaaaaaaGAGAL.AGNaaaaaaaaaaGAGAL.AGNaaaaaaaaaaGAGAL.AGNaaaaaaaaaaGAGAL.AGNaaaaaaaaaaGAGAL.AGNaaaaaaaaaaGAGAL.AGNaaaaaaaaaaGAGAL.AGNaaaaaaaaaaGAGAL.AGNaaaaaaaaaaGAGAL.AGNaaaaaaaaaaGAGAL.AGNaaaaaaaaaaRINGINTERFACEGAGA.IO.sERIALIZABLE", "JAVAL.AGNaaaaaaaaaaJAVAL.AGNaaaaaaaaaaJAVAL.AGNaaaaaaaaaaJAVAL.AGNaaaaaaaaaaJAVAL.AGNaaaaaaaaaaJAVAL.AGNaaaaaaaaaaJAVAL.AGNaaaaaaaaaaJAVAL.AGNaaaaaaaaaaJAVAL.AGNaaaaaaaaaaJAVAL.AGNaaaaaaaaaaJAVAL.AGNaaaaaaaaaaJAVAL.AGNaaaaaaaaaaJAVAL.AGNaaaaaaaaaaJAVAL.AGNaaaaaaaaaaJAVAL.AGNaaaaaaaaaaJAVAL.AGNaaaaaaaaaaJAVAL.AGNaaaaaaaaaaJAVAL.AGNaaaaaaaaaaJAVAL.AGNaaaaaaaaaaJAVAL.AGNaaaaaaaaaaJAVAL.AGNaaaaaaaaaaJAVAL.AGNaaaaaaaaaaJAVAL.AGNaaaaaaaaaaJAVAL.AGNaaaaaaaaaaJAVAL.AGNaaaaaaaaaaJAVAL.AGNaaaaaaaaaaJAVAL.AGNaaaaaaaaaaJAVAL.AGNaaaaaaaaaaJAVAL.AGNaaaaaaaaaaJAVAL.AGNaaaaaaaaaaJAVAL.AGNaaaaaaaaaaJAVAL.AGNaaaaaaaaaaJAVAL.AGNaaaaaaaaaaJAVAL", 1000);
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.stripAll(strArray3);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertNotNull(strArray4);
    }

    @Test
    public void test44140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest88.test44140");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.split("GnalAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA", "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                             ");
        boolean boolean4 = org.apache.commons.lang3.StringUtils.endsWithAny("ELBAZILAIREs.OI.AVAJ ECAFRETNIGNIRTsELBAENOLc.GNAL.AVAJ ECAFRETNI", strArray3);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test44141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest88.test44141");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.split("Arr... AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA... AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA... AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA... AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA... AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA... AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA... AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA... AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA... AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA... AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAyList", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa       ", 67);
        java.lang.Class<?>[] wildcardClassArray4 = org.apache.commons.lang3.ClassUtils.toClass((java.lang.Object[]) strArray3);
        java.lang.String str6 = org.apache.commons.lang3.ClassUtils.getPackageCanonicalName((java.lang.Object) wildcardClassArray4, "uti4444444444444444444444444444444444444444444444444444444444444444444444444ava4444444444444444444444444444444444444444444444444444444444444444444444444j");
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertNotNull(wildcardClassArray4);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "java.lang" + "'", str6, "java.lang");
    }

    @Test
    public void test44142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest88.test44142");
        java.lang.String str1 = org.apache.commons.lang3.ClassUtils.getPackageName("INTERFACE#JAVA.LANG.cLONEABLE....................................................................#######################javaulangINTERFACE#JAVA.IO");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "INTERFACE#JAVA.LANG.cLONEABLE....................................................................#######################javaulangINTERFACE#JAVA" + "'", str1, "INTERFACE#JAVA.LANG.cLONEABLE....................................................................#######################javaulangINTERFACE#JAVA");
    }

    @Test
    public void test44143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest88.test44143");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAllUpperCase((java.lang.CharSequence) "A##RyLRsA##RyLRsA##RyLRsA##RyLRsA##");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test44144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest88.test44144");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.upperCase("ARR...AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA...AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA...AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA...AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA...AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA...AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA...AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA...AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA...AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA..");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "ARR...AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA...AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA...AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA...AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA...AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA...AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA...AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA...AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA...AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA.." + "'", str1, "ARR...AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA...AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA...AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA...AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA...AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA...AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA...AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA...AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA...AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA..");
    }

    @Test
    public void test44145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest88.test44145");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeStartIgnoreCase("                                   ####################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################", "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                   ####################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################" + "'", str2, "                                   ####################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################");
    }

    @Test
    public void test44146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest88.test44146");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trimToNull("A$L.AVAj");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "A$L.AVAj" + "'", str1, "A$L.AVAj");
    }

    @Test
    public void test44147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest88.test44147");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripToNull("NTERFACE JAVA.LANG.CLONEABLE.......JAVA..........JAVA..........JAVA..........JAVA..........JAVA.");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "NTERFACE JAVA.LANG.CLONEABLE.......JAVA..........JAVA..........JAVA..........JAVA..........JAVA." + "'", str1, "NTERFACE JAVA.LANG.CLONEABLE.......JAVA..........JAVA..........JAVA..........JAVA..........JAVA.");
    }

    @Test
    public void test44148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest88.test44148");
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.split("AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA", "arraylist", 669);
        boolean boolean5 = org.apache.commons.lang3.StringUtils.startsWithAny("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaajaval#.#agn", strArray4);
        java.lang.String str7 = org.apache.commons.lang3.ClassUtils.getShortClassName((java.lang.Object) "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaajaval#.#agn", "                                                                                                                                                                                                                                                                                                                                                        ArryListArryListArryListvjGNAL.AVAJLANG.JAVAGNAL.AVAJLANG.JAVAGNAL.AVAJLANG.JAVAGNAL.AVAJLANG.JAVAGNAL.AVAJLANG.JAVAGNAL.AVAJLANG.JAVAGNAL.AVAJLANG.JAVAGNAL.AVAJLANG.JAVAGNAL.AVAJgnl                                                                                                                                                                                                                                                                                                                                                                                           ");
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "String" + "'", str7, "String");
    }

    @Test
    public void test44149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest88.test44149");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("Arrclass java......................");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.stripAll(strArray1);
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test44150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest88.test44150");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNotEmpty((java.lang.CharSequence) "                                                                                                                                                                                                                                                                                                               ELBAZILAIREs");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test44151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest88.test44151");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("JAVA.LANG", '#');
        java.lang.String[] strArray7 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("javal#.#agn", "va.lang.Cl", 159);
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.replaceEachRepeatedly("", strArray3, strArray7);
        java.lang.Class<?>[] wildcardClassArray9 = org.apache.commons.lang3.ClassUtils.toClass((java.lang.Object[]) strArray3);
        java.lang.String str11 = org.apache.commons.lang3.ClassUtils.getPackageName((java.lang.Object) wildcardClassArray9, "     A..AYL A.44444444444444444444444444      CLASSSLITUGNIRTSSLITUGNIRTSSLITUGNIRTSSLITUGNIRTSSLITUGNIRTSSLITUGNIRTinterfacegaga.lang.CloneableAAAAAAAAAAgagal.agnAAAAAAAAAAgagal.agnAAAAAAAAAAgagal.agnAAAAAAAAAAgagal.agnAAAAAAAAAAgagal.agnAAAAAAAAAAgagal.agnAAAAAAAAAAgagal.agnAAAAAAAAAAgagal.agnAAAAAAAAAAgagal.agnAAAAAAAAAAgagal.agnAAAAAAAAAAgagal.agnAAAAAAAAAAgagal.agnAAAAAAAAAAgagal.agnAAAAAAAAAAgagal.agnAAAAAAAAAAgagal.agnAAAAAAAAAAgagal.agnAAAAAAAAAAgagal.agnAAAAAAAAAAgagal.agnAAAAAAAAAAgagal.agnAAAAAAAAAAgagal.agnAAAAAAAAAAgagal.agnAAAAAAAAAAgagal.agnAAAAAAAAAAgagal.agnAAAAAAAAAAgagal.agnAAAAAAAAAAgagal.agnAAAAAAAAAAgagal.agnAAAAAAAAAAgagal.a");
        java.lang.String str13 = org.apache.commons.lang3.ClassUtils.getPackageName((java.lang.Object) str11, "...     javaulangrraylist");
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(wildcardClassArray9);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "java.lang" + "'", str11, "java.lang");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "java.lang" + "'", str13, "java.lang");
    }

    @Test
    public void test44152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest88.test44152");
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("AAAAAAAAAAAAAAAAAAIRFCO$IRFIOSRA..AYL A.444444444444444444444444444g.g.g.g.g.g.gg.g.g.g.g.g.g.g.g.g.g.g.g.g.g.g.g.g.AVAJ.GNALAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAIRFCO$IRFIOSRA..AYL A.444444444444444444444444444g.g.g.g.g.g.gg.g.g.g.g.g.g.g.g.g.g.g.g.g.g.g.g.g.AVAJ.GNALAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAIRFCO$IRFIOSRA..AYL A", "aaaa                       javaulangrraylist", 231);
        int int5 = org.apache.commons.lang3.StringUtils.indexOfAny("", strArray4);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
    }

    @Test
    public void test44153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest88.test44153");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass2 = org.apache.commons.lang3.ClassUtils.getClass("4444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444", true);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassNotFoundException; message: 4444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444");
        } catch (java.lang.ClassNotFoundException e) {
            // Expected exception.
        }
    }

    @Test
    public void test44154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest88.test44154");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("...", 'a');
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.stripAll(strArray3);
        java.lang.String str5 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray3);
        java.lang.String str6 = org.apache.commons.lang3.StringUtils.concatWith("][ssalC", (java.lang.Object[]) strArray3);
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.concat((java.lang.Object[]) strArray3);
        java.lang.String str11 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray3, "        44444444444444444444444444444444444444444444444444444444444444444444444444444444", 940, 0);
        java.lang.String str12 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray3);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "..." + "'", str5, "...");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "..." + "'", str6, "...");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "..." + "'", str7, "...");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "..." + "'", str12, "...");
    }

    @Test
    public void test44155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest88.test44155");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.equals((java.lang.CharSequence) "             aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa...", (java.lang.CharSequence) "$$$$$$$$$$$$$$$$$$$interfacejava.lang.Cloneable4iGNIRTinterfacejava.lang.Cloneable4i...");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test44156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest88.test44156");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfDifference((java.lang.CharSequence) "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaJAVA.LANG.CLONEABLE... INTERFACE JAVA.IO.SERIALIZABLE", (java.lang.CharSequence) ".......JAVA..........JAVA..........JAVA..........JAVA..........J");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test44157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest88.test44157");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAllLowerCase((java.lang.CharSequence) "gnirtS.gnal.avaj ssalcgnirtS.gnal.avaj ssalcgnirtS.gnal.avaj ssalcgnirtS.gnal.avaj ssalcgnirtS.gnal.avaj ssalcgnirtS.gnal.avaj ssalcgnirtS.gnal.avaj ssalcgnirtS.gnal.avaj ssalcgnirtS.gnal.avaj ssalcgnirtS.gnal.avaj ssalcgnirtS.gnal.avaj ssalcgnirtS.gnal.avaj ssalcgnirtS.gnal.avaj ssalcgnirtS.gnal.avaj ssalcgnirtS.gnal.avaj ssalcgnirtS.gnal.avaj ... .... .java.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.lang... .... .java.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.lang... .... .java.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.lang... .... .java.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjav...");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test44158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest88.test44158");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAllLowerCase((java.lang.CharSequence) "CLASS JAVA.UTIL.ABSTRACTLISTGN LU V J ....................................................................CLASS JAVA.UTIL.ABSTRACTCOLLECTIONGN LU V J ....................................................................CLASS JAVA.LANG.OBJECT");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test44159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest88.test44159");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.defaultString("################################...       AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA", "java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java.........");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "################################...       AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA" + "'", str2, "################################...       AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA");
    }

    @Test
    public void test44160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest88.test44160");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBeforeLast("...               ...esl.avaj#ecafretnielbazilaires.oi.avaj#ecafretni4elbaenolc.gnal.avaj#ecafretni", "...sAitUJAirtSsAitUJAirtSsAitUJAirtSsAitUJAirtSsAitUJAirtSsAitUJAirtSsAitUJAirtSsAitUJAirtSsAitUJAirtS...sAitUJAirtSsAitUJAirtSsAitUJAi");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "...               ...esl.avaj#ecafretnielbazilaires.oi.avaj#ecafretni4elbaenolc.gnal.avaj#ecafretni" + "'", str2, "...               ...esl.avaj#ecafretnielbazilaires.oi.avaj#ecafretni4elbaenolc.gnal.avaj#ecafretni");
    }

    @Test
    public void test44161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest88.test44161");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.reverseDelimited("                                       -1jeveJiViTSILYiRRiTSILYiRRiTSILYiRRi", 'a');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                       -1jeveJiViTSILYiRRiTSILYiRRiTSILYiRRi" + "'", str2, "                                       -1jeveJiViTSILYiRRiTSILYiRRiTSILYiRRi");
    }

    @Test
    public void test44162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest88.test44162");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.right(" gnirt", 840);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + " gnirt" + "'", str2, " gnirt");
    }

    @Test
    public void test44163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest88.test44163");
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
        java.lang.String str32 = org.apache.commons.lang3.StringUtils.concat((java.lang.Object[]) wildcardClassArray30);
        java.lang.String str34 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) wildcardClassArray30, '.');
        java.lang.Class<?>[] wildcardClassArray35 = org.apache.commons.lang3.ClassUtils.wrappersToPrimitives(wildcardClassArray30);
        java.lang.Class<?>[] wildcardClassArray36 = org.apache.commons.lang3.ClassUtils.wrappersToPrimitives(wildcardClassArray35);
        java.lang.Class<?> wildcardClass37 = null;
        java.lang.Class[] classArray39 = new java.lang.Class[1];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray40 = (java.lang.Class<?>[]) classArray39;
        wildcardClassArray40[0] = wildcardClass37;
        java.lang.Class<?>[] wildcardClassArray43 = org.apache.commons.lang3.ClassUtils.primitivesToWrappers(wildcardClassArray40);
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
        boolean boolean66 = org.apache.commons.lang3.ClassUtils.isAssignable(wildcardClassArray43, wildcardClassArray58, true);
        java.lang.String str68 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) wildcardClassArray58, 'a');
        java.lang.String[] strArray71 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("avaj.gnalavaj.gnalavaj.gnal", 'a');
        java.lang.String str72 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray71);
        java.lang.Class<?>[] wildcardClassArray73 = org.apache.commons.lang3.ClassUtils.toClass((java.lang.Object[]) strArray71);
        boolean boolean74 = org.apache.commons.lang3.ClassUtils.isAssignable(wildcardClassArray58, wildcardClassArray73);
        boolean boolean76 = org.apache.commons.lang3.ClassUtils.isAssignable(wildcardClassArray36, wildcardClassArray58, true);
        java.lang.String[] strArray79 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("class java.lang.String", "                                   ");
        java.lang.String[] strArray80 = org.apache.commons.lang3.StringUtils.stripAll(strArray79);
        java.lang.Class<?>[] wildcardClassArray81 = org.apache.commons.lang3.ClassUtils.toClass((java.lang.Object[]) strArray80);
        java.lang.String[] strArray83 = new java.lang.String[] { "                                   " };
        java.lang.String str84 = org.apache.commons.lang3.StringUtils.getCommonPrefix(strArray83);
        java.lang.Class<?>[] wildcardClassArray85 = org.apache.commons.lang3.ClassUtils.toClass((java.lang.Object[]) strArray83);
        java.lang.Class<?>[] wildcardClassArray86 = org.apache.commons.lang3.ClassUtils.primitivesToWrappers(wildcardClassArray85);
        boolean boolean88 = org.apache.commons.lang3.ClassUtils.isAssignable(wildcardClassArray81, wildcardClassArray85, false);
        boolean boolean90 = org.apache.commons.lang3.ClassUtils.isAssignable(wildcardClassArray36, wildcardClassArray81, true);
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
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "class java.lang.String" + "'", str32, "class java.lang.String");
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "class java.lang.String" + "'", str34, "class java.lang.String");
        org.junit.Assert.assertNotNull(wildcardClassArray35);
        org.junit.Assert.assertNotNull(wildcardClassArray36);
        org.junit.Assert.assertNotNull(classArray39);
        org.junit.Assert.assertNotNull(wildcardClassArray40);
        org.junit.Assert.assertNotNull(wildcardClassArray43);
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
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + false + "'", boolean66 == false);
        org.junit.Assert.assertEquals("'" + str68 + "' != '" + "" + "'", str68, "");
        org.junit.Assert.assertNotNull(strArray71);
        org.junit.Assert.assertEquals("'" + str72 + "' != '" + "vj.gnlvj.gnlvj.gnl" + "'", str72, "vj.gnlvj.gnlvj.gnl");
        org.junit.Assert.assertNotNull(wildcardClassArray73);
        org.junit.Assert.assertTrue("'" + boolean74 + "' != '" + false + "'", boolean74 == false);
        org.junit.Assert.assertTrue("'" + boolean76 + "' != '" + false + "'", boolean76 == false);
        org.junit.Assert.assertNotNull(strArray79);
        org.junit.Assert.assertNotNull(strArray80);
        org.junit.Assert.assertNotNull(wildcardClassArray81);
        org.junit.Assert.assertNotNull(strArray83);
        org.junit.Assert.assertEquals("'" + str84 + "' != '" + "                                   " + "'", str84, "                                   ");
        org.junit.Assert.assertNotNull(wildcardClassArray85);
        org.junit.Assert.assertNotNull(wildcardClassArray86);
        org.junit.Assert.assertTrue("'" + boolean88 + "' != '" + true + "'", boolean88 == true);
        org.junit.Assert.assertTrue("'" + boolean90 + "' != '" + true + "'", boolean90 == true);
    }

    @Test
    public void test44164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest88.test44164");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitByCharacterTypeCamelCase("                   JAVAULANGrrayListyLA.");
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test44165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest88.test44165");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.split("JAVAULANGJAVAULANGJAVAULANGJAVAULANGJAVAULANGJAVAULANGJAVAULANGJAVAULANGJAVAULANGJAVAULANGJAVAULANGJAVAULANGJAVAULANGJAVAULANGJAVAULANGJAVAULANG", 'a');
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test44166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest88.test44166");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.chomp("AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA...", "                                                                  irfCo$irfioSrA..ayL A.444444444444444444444444444");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA..." + "'", str2, "AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA...");
    }

    @Test
    public void test44167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest88.test44167");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.lowerCase("Byte#                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                 ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "byte#                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                 " + "'", str1, "byte#                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                 ");
    }

    @Test
    public void test44168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest88.test44168");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("", '.');
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test44169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest88.test44169");
        java.lang.ClassLoader classLoader0 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass2 = org.apache.commons.lang3.ClassUtils.getClass(classLoader0, "uti4444444444444444444444444444444444444444444444444444444444444444444444444ava4444444444444444444444444444444444444444444444444444444444444444444444444j");
            org.junit.Assert.fail("Expected exception of type java.lang.ClassNotFoundException; message: uti4444444444444444444444444444444444444444444444444444444444444444444444444ava4444444444444444444444444444444444444444444444444444444444444444444444444j");
        } catch (java.lang.ClassNotFoundException e) {
            // Expected exception.
        }
    }

    @Test
    public void test44170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest88.test44170");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.right(".........java..........java..........java..........java..........java..........java..........java...........", 532);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + ".........java..........java..........java..........java..........java..........java..........java..........." + "'", str2, ".........java..........java..........java..........java..........java..........java..........java...........");
    }

    @Test
    public void test44171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest88.test44171");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$", "eBy eBy eBy eBy eBy eBy eBy eBy eBy eBy eBy eBy eBy eBy eBy eBy eBy eBy eBy eBy");
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test44172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest88.test44172");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.center("javastringslitUgnirtSarraylistarraylistavaj", 457, '#');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "###############################################################################################################################################################################################################javastringslitUgnirtSarraylistarraylistavaj###############################################################################################################################################################################################################" + "'", str3, "###############################################################################################################################################################################################################javastringslitUgnirtSarraylistarraylistavaj###############################################################################################################################################################################################################");
    }

    @Test
    public void test44173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest88.test44173");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.substringsBetween("", "a", "Cloneable4i");
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void test44174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest88.test44174");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByCharacterType("JAVA");
        java.lang.Class<?>[] wildcardClassArray3 = org.apache.commons.lang3.ClassUtils.toClass((java.lang.Object[]) strArray2);
        java.lang.String[] strArray5 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("jAVAAAAAAAAAAVA.LANG...");
        java.lang.String str6 = org.apache.commons.lang3.StringUtils.replaceEachRepeatedly("jAV", strArray2, strArray5);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertNotNull(wildcardClassArray3);
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "jAV" + "'", str6, "jAV");
    }

    @Test
    public void test44175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest88.test44175");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.chomp("                        ", "javastringslitUgnirtSarraylistarraylistavaj");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                        " + "'", str2, "                        ");
    }

    @Test
    public void test44176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest88.test44176");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOf("INTERFACEJAVA.LANG.cLONEABLE#INTERFACEJAVA.IOINTERFACEJAVA.LANG.cLONEABLE#INTERFACEJAVA.IOINTERFACEJAVA.LANG.cLONEABLE#INTERFACEJAVA.IOINTERFACEJAVABooleanINTERFACEJAVA.LANG.cLONEABLE#INTERFACEJAVA.IOINTERFACEJAVA.LANG.cLONEABLE#INTERFACEJAVA.IOINTERFACEJAVA.LANG.cLONEABLE#INTERFACEJAVA.IOINTERFACEJAVA", 663);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test44177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest88.test44177");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.endsWithIgnoreCase("############", "aaaaaa...aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test44178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest88.test44178");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.defaultIfEmpty("javalang", "-1String[]");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "javalang" + "'", str2, "javalang");
    }

    @Test
    public void test44179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest88.test44179");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trimToEmpty("JavajGNALavaaaaaaaaaavaavajGNAL.avajGNALlangavaavajGNAL.avajGNALlangjavaavajGNAL.avajGNALlangjavaavajGNAL.avajGNALlangjavaavajGNAL.avajGNALlangjavaavajGNAL.avajGNALlangjavaavajGNAL.avajGNALlangjavaavajGNAL.avajGNALlangjavaavajGNAL.avajGNALlangjavaavajGNAL.avajGNALlangjavaavajGNAL.avajGNALlangjavaavajGNAL.avajGNALlangjavaavajGNAL.avajGNALlangjavaavajGNAL.avajGNALlangjavaavajGNAL.avajGNALlangjavaavajGNAL.avajGNALlan");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "JavajGNALavaaaaaaaaaavaavajGNAL.avajGNALlangavaavajGNAL.avajGNALlangjavaavajGNAL.avajGNALlangjavaavajGNAL.avajGNALlangjavaavajGNAL.avajGNALlangjavaavajGNAL.avajGNALlangjavaavajGNAL.avajGNALlangjavaavajGNAL.avajGNALlangjavaavajGNAL.avajGNALlangjavaavajGNAL.avajGNALlangjavaavajGNAL.avajGNALlangjavaavajGNAL.avajGNALlangjavaavajGNAL.avajGNALlangjavaavajGNAL.avajGNALlangjavaavajGNAL.avajGNALlangjavaavajGNAL.avajGNALlan" + "'", str1, "JavajGNALavaaaaaaaaaavaavajGNAL.avajGNALlangavaavajGNAL.avajGNALlangjavaavajGNAL.avajGNALlangjavaavajGNAL.avajGNALlangjavaavajGNAL.avajGNALlangjavaavajGNAL.avajGNALlangjavaavajGNAL.avajGNALlangjavaavajGNAL.avajGNALlangjavaavajGNAL.avajGNALlangjavaavajGNAL.avajGNALlangjavaavajGNAL.avajGNALlangjavaavajGNAL.avajGNALlangjavaavajGNAL.avajGNALlangjavaavajGNAL.avajGNALlangjavaavajGNAL.avajGNALlangjavaavajGNAL.avajGNALlan");
    }

    @Test
    public void test44180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest88.test44180");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("java..........java....                                                                                                                                                                                                                                                                                                                                                                                                          ClassJAVA.LANGaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaULANGjava..........java....");
        int int3 = org.apache.commons.lang3.StringUtils.indexOfAny("interface java.lang.CloneablearraarraarraarraarraarraarraarraarraarraarraarraarraarraarraarraarraarraarraarraarraarraarraarraarraarraarraarraarraarraarraarraarraarraarraarraarrNALaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaainterface java.io.Serializable", strArray2);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test44181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest88.test44181");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("aaaaaaaaaaaaaaaaaaaaaaaaaGN                                            aaaaaaaaaaaaaaaaaaaaaaaaaa", "litulitulitulitulitul####litulitulitulitulitul");
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test44182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest88.test44182");
        java.lang.String[] strArray5 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("JAVA.LANG", '#');
        java.lang.String[] strArray9 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("javal#.#agn", "va.lang.Cl", 159);
        java.lang.String str10 = org.apache.commons.lang3.StringUtils.replaceEachRepeatedly("", strArray5, strArray9);
        java.lang.String[] strArray13 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........javainterface java.io", '4');
        java.lang.String str14 = org.apache.commons.lang3.StringUtils.replaceEach("javal######################", strArray5, strArray13);
        java.lang.String str16 = org.apache.commons.lang3.ClassUtils.getShortCanonicalName((java.lang.Object) strArray13, "BYTEINTERFACE GAGA.LANG.CLONEABLEAAAAAAAAAAGAGAL.AGNAAAAAAAAAAGAGAL.AGNAAAAAAAAAAGAGAL.AGNAAAAAAAAAAGAGAL.AGNAAAAAAAAAAGAGAL.AGNAAAAAAAAAAGAGAL.AGNAAAAAAAAAAGAGAL.AGNAAAAAAAAAAGAGAL.AGNAAAAAAAAAAGAGAL.AGNAAAAAAAAAAGAGAL.AGNAAAAAAAAAAGAGAL.AGNAAAAAAAAAAGAGAL.AGNAAAAAAAAAAGAGAL.AGNAAAAAAAAAAGAGAL.AGNAAAAAAAAAAGAGAL.AGNAAAAAAAAAAGAGAL.AGNAAAAAAAAAAGAGAL.AGNAAAAAAAAAAGAGAL.AGNAAAAAAAAAAGAGAL.AGNAAAAAAAAAAGAGAL.AGNAAAAAAAAAAGAGAL.AGNAAAAAAAAAAGAGAL.AGNAAAAAAAAAAGAGAL.AGNAAAAAAAAAAGAGAL.AGNAAAAAAAAAAGAGAL.AGNAAAAAAAAAAGAGAL.AGNAAAAAAAAAAGAGAL.AGNAAAAAAAAAAGAGAL.AGNAAAAAAAAAAGAGAL.AGNAAAAAAAAAAGAGAL.AGNAAAAAAAAAAGAGAL.AGNAAAAAAAAAAGAGAL.AGNAAAAAAAAAAGAGAL.AGNAAAAAAAAAAGAGAL.AGNAAAAAAAAAAGAGAL.AGNAAAAAAAAAARINGINTERFACE GAGA.IO.SERIALIZABLE");
        int int17 = org.apache.commons.lang3.StringUtils.indexOfAny("gn lu v j                       ....................................................................gn lu v j                       ....................................................................gn lu v j                       ......................................                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                     ArrayListArrayListArrayListavajagnal", strArray13);
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertNotNull(strArray9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(strArray13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "javal######################" + "'", str14, "javal######################");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "String[]" + "'", str16, "String[]");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
    }

    @Test
    public void test44183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest88.test44183");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.substring("GnalAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA", 29, 964);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA" + "'", str3, "AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA");
    }

    @Test
    public void test44184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest88.test44184");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripToEmpty("$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$...       AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$...       AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$" + "'", str1, "$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$...       AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$");
    }

    @Test
    public void test44185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest88.test44185");
        java.lang.String str1 = org.apache.commons.lang3.ClassUtils.getShortCanonicalName("...e");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "e" + "'", str1, "e");
    }

    @Test
    public void test44186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest88.test44186");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphaSpace((java.lang.CharSequence) "arraylistarraylistarraylistavaj");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test44187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest88.test44187");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.split("VAJ.GNALJAVA.LANGAVAJ.GNALJAVA.LANGAVAJ.GNALJAVA.LANGAVAJ.GNALJAVA.LANGAVAJ.GNALJAVA.LANGAVAJ.GNALJAVA.LAN");
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test44188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest88.test44188");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.rightPad("yList", 63, '.');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "yList.........................................................." + "'", str3, "yList..........................................................");
    }

    @Test
    public void test44189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest88.test44189");
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.replace("         util          ", "interface java.lang.CloneableRChahactaRChahactaRChahactaRChahactaRChahactaRChahactalangagnaljRChahactaRChahactaRChahactaRChahactaRChahactaRChahactainterface java.io.Serializable", "444444444444444444444444444444444444444444444AAAAAAAAAAAAAAAAAAA4444444444444444444444444444444444444444444444", 41);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "         util          " + "'", str4, "         util          ");
    }

    @Test
    public void test44190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest88.test44190");
        int int3 = org.apache.commons.lang3.StringUtils.indexOfIgnoreCase("                                     RGNALUAVAJ", "                                                                      ...", 824);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test44191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest88.test44191");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("ziirSoifri$oCfri", '#');
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray2, '#');
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "ziirSoifri$oCfri" + "'", str4, "ziirSoifri$oCfri");
    }

    @Test
    public void test44192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest88.test44192");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNumeric((java.lang.CharSequence) "ARR... AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA... AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA... AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA... AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA... AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA... AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA... AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA... AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA... AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test44193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest88.test44193");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfIgnoreCase("                                                                                                                                                                                                                                                                    AtsiLytcejbO.gnal.avaj ssalcrrAtsiLytcejbO.gnal.avaj ssalcrrAva.langGNAL..langjava.langAGNAL.AVAJAtsiLytcejbO.gnal.avaj ssalcrrAtsiLytcejbO.gnal.avaj ssalcrrAva.langGNAL..langjava.langAGNAL.AVAJAtsiLytcejbO.gnal.avaj ssalcrrAtsiLytcejbO.gnal.avaj ssalcrrAva.langGNAL..langjava.langAGNAL.AVAJAtsiLytcejbO.gnal.avaj ssalcrrAtsiLytcejStringAtsiLytcejbO.gnal.avaj ssalcrrAtsiLytcejbO.gnal.avaj ssalcrrAva.langGNAL..langjava.langAGNAL.AVAJAtsiLytcejbO.gnal.avaj ssalcrrAtsiLytcejbO.gnal.avaj ssalcrrAva.langGNAL..langjava.langAGNAL.AVAJAtsiLytcejbO.gnal.avaj ssalcrrAtsiLytcejbO.gnal.avaj ssalcrrAva.langGNAL..langjava.langAGNAL.AVAJAtsiLytcejbO.gnal.avaj ssalcrrAtsiLytcejb", "JAVA.LITU.AVAJLITU.AVAJJAVA.LITU.AVAJLITU.AVAJJAVA.LITU.AVAJLITU.AVAJJAVA.LITU.AVAJLITU.AVAJJAVA.LITU.AVAJLITU.AVAJJAVA.LITU.AVAJLITU.AVAJJAVA.LITU.AVAJLITU.AVAJJAVA.LITU.AVAJLITU.AVAJJAVA.LITU.AVAJLITU.AVAJJAVA.LITU.AVAJLITU.AVAJJAVA.LITU.AVAJLITU.AVAJJAVA.LITU.AVAJLITU.AVAJJAVA.LITU.AVAJLITU.AVAJJAVA.LITU.AVAJLITU.AVAJJAVA.LITU.AVAJLITU.AVAJJAVA.LITU.AVAJLITU.AVAJJAVA.LITU.AVAJLITU.AVAJJAVA.LITU.AVAJLITU.AVAJJAVA.LITU.AVAJLITU.AVAJJAVA.LITU.AVAJLITU.AVAJJAVA.LITU.AVAJLITU.AVAJJAVA.LITU.AVAJLITU.AVAJJAVA.LITU.AVAJLITU.AVAJJAVA.LITU.AVAJLITU.AVAJJAVA.LITU.AVAJLITU.AVAJJAVA.LITU.AVAJLITU.AVAJJAVA.LITU.AVAJLITU.AVAJJAVA.LITU.AVAJLITU.AVAJJAVA.LITU.AVAJLITU.AVAJJAVA.LITU.AVAJLITU.AVAJJAVA.LITU.AVAJLITU.AVAJJAVA.LITU.AVAJLITU.AVAJJAVA.LITU.AVAJLITU");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test44194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest88.test44194");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeStartIgnoreCase("                                                                                                     JAVAGNAL", "...avaj..........avaj..........avaj");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                                                                                     JAVAGNAL" + "'", str2, "                                                                                                     JAVAGNAL");
    }

    @Test
    public void test44195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest88.test44195");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitByCharacterTypeCamelCase("interface java.lang.Cloneable... java.lang.Stringclass java.lang.Stringclass...... java.lang.Stringclass java.lang.Stringclass...... java.lang.Stringclass java.lang.Stringclass...... java.lang.Stringclass java.lang.Stringclass...... java.lang.Stringclass java.lang.Stringclass...... java.lang.Stringclass java.lang.Stringclass...... java.lang.Stringclass java.lang.Stringclass...... java.lang.Stringclass java.lang.Stringclass...... java.lang.Stringclass java.lang.Stringclass...... java.lang.Stringclass java.lang.Stringclass...... java.lang.Stringclass java.lang.Stringclass...... java.lang.Stringclass java.lang.Stringclass...... java.lang.Stringclass java.lang.Stringclass...... java.lang.Stringclass java.lang.Stringclass...... java.lang.Stringclass java.lang.Stringclass...... java.lang.Stringclass java.lang.Stringclass...... java.lang.Stringclass java.lang.Stringclass...... java.lang.Stringclass java.lang.Stringcl...avaj..........avaj..........avainterface java.io.Serializable");
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test44196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest88.test44196");
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
        java.lang.String str44 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) wildcardClassArray35, "string.nal.avaj ecafretni");
        java.lang.Class<?>[] wildcardClassArray45 = org.apache.commons.lang3.ClassUtils.primitivesToWrappers(wildcardClassArray35);
        java.lang.String str46 = org.apache.commons.lang3.StringUtils.concat((java.lang.Object[]) wildcardClassArray35);
        java.lang.Class<?>[] wildcardClassArray47 = org.apache.commons.lang3.ClassUtils.wrappersToPrimitives(wildcardClassArray35);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str51 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) wildcardClassArray47, "aAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA... AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA... AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA... AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA... AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA... AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA... AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA... AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA... AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA... ...ARRAYLISTARRAY", 532, 993);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
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
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "class java.lang.String" + "'", str44, "class java.lang.String");
        org.junit.Assert.assertNotNull(wildcardClassArray45);
        org.junit.Assert.assertEquals("'" + str46 + "' != '" + "class java.lang.String" + "'", str46, "class java.lang.String");
        org.junit.Assert.assertNotNull(wildcardClassArray47);
    }

    @Test
    public void test44197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest88.test44197");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOfIgnoreCase("                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                               interf$ce#j$v$.l$ng.Clone$ble....................................................................#######################JAVAULANGinterf$ce#j$v$.io.Seri$liz$ble", "JJJJJJJJJJJJJJJJJJJJJJAA", 360);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test44198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest88.test44198");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringAfter("..#y....iiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiii$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$iiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiii$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$iiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiii$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$iiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiii$$$$$$$$$$$$$$$$$$$$$$$", "AVAJ.GNALNaaaaaaaaaaJAVAL.AGNaaaaaaaaaaJAVAL.AGNaaaaaaaaaaJAVAL.AGNaaaaaaaaaaJAVAL.AGNaaaaaaaaaaJAVAL.AGNaaaaaaaaaaJAVAL.AGNaaaaaaaaaaJAVAL.AGNaaaaaaaaaaJAVAL.AGNaaaaaaaaaaJAVAL.AGNaaaaaaaaaaJAVAL.AGNaaaaaaaaaaJAVAL.AGNaaaaaaaaaaJAVAL.AGNaaaaaaaaaaJAVAL.AGNaaaaaaaaaaJAVAL.AGNaaaaaaaaaaJAVAL.AGNaaaaaaaaaaJAVAL.AGNaaaaaaaaaaJAVAL.AGNaaaaaaaaaaJAVAL.AGNaaaaaaaaaaJAVAL.AGNaaaaaaaaaaJAVAL.AGNaaaaaaaaaaJAVAL.AGNaaaaaaaaaaJAVAL.AGNaaaaaaaaaaJAVAL.AGNaaaaaaaaaaJAVAL.AGNaaaaaaaaaaJAVAL.AGNaaaaaaaaaaJAVAL.AGNaaaaaaaaaaJAVAL.AGNaaaaaaaaaaJAVAL.AGNaaaaaaaaaaJAVAL.AGNaaaaaaaaaaJAVAL.AGNaaaaaaaaaaJAVAL.AGNaaaaaaaaaaJAVAL.AGNaaaaaaaaaaJAVAL.AGNaaaaaaaaaaJAVAL.AGNaaaaaaaaaa");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test44199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest88.test44199");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNotEmpty((java.lang.CharSequence) "NTERFACEJAVA.LANG.cLONEABLE.......JAVA.javatsilyarratsilyarratsilyarra4444");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test44200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest88.test44200");
        java.util.Locale locale1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.apache.commons.lang3.StringUtils.lowerCase("                            gnalArrayLiinterfacejava.lang.Cloneable.interfacejava.io.SerializablegnalArrayLi", locale1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test44201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest88.test44201");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.chomp("hi!Array...                                                                                               ", "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!Array...                                                                                               " + "'", str2, "hi!Array...                                                                                               ");
    }

    @Test
    public void test44202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest88.test44202");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsAny("utilLutilLutilLutilLutilLutilLutilLutilLutilLutilLutilLutilLutilLutilLutilLutilLutilLutilLutilLutilLutilLutilLutilLutilLutilLutilLutilLutilLutilLutilLutilLutilLutiL", "INTERFACEJAVA.LANG.CLONEABLEINTERFACEJAVA.LANG.CLONEABLELANG.GNALJAVA.LANGAVAJ.GNALJAVA.LANGAVAJ.GNALJAVA.LANGAVAJ.GNALJAVA.LANGAVAJ.GNALJAVA.LANGAVAJ.GNALJAVA.LANGAVAJ.GNALJAVA.LANGAVAJ.GNALJAVA.LANGAVAJ.JAVAINTERFACEJAVA.IO.SERIALIZABLEINTERFACEJAVA.IO");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test44203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest88.test44203");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeEndIgnoreCase("nea", "itu.avajli");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "nea" + "'", str2, "nea");
    }

    @Test
    public void test44204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest88.test44204");
        char[] charArray6 = new char[] { '$' };
        int int7 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "java.util", charArray6);
        boolean boolean8 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "                                   ", charArray6);
        boolean boolean9 = org.apache.commons.lang3.StringUtils.containsAny("...       ....       .", charArray6);
        int int10 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "hi!ArrayListArrayListArrayListavaj.gnalArrayListArrayListArrayListavaj", charArray6);
        int int11 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", charArray6);
        org.junit.Assert.assertNotNull(charArray6);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray6), "$");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray6), "$");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray6), "[$]");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test44205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest88.test44205");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOf("................interface java.lang.Cloneable.litinterface java.io.erializable                                                                                                                                                                                                                                                                                                                                                                                                                                                                  ................", 76);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test44206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest88.test44206");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripToEmpty("GnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalLANGLANGLANGLANGLANGLANGLlituava                  ...                         $$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "GnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalLANGLANGLANGLANGLANGLANGLlituava                  ...                         $$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$" + "'", str1, "GnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalLANGLANGLANGLANGLANGLANGLlituava                  ...                         $$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$");
    }

    @Test
    public void test44207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest88.test44207");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass1 = org.apache.commons.lang3.ClassUtils.getClass("sTRINGg.g.g.g.g.g.g.g.g.g.g.g.g.g.g.g.g.g.AVAJ.GNALAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAIRFCO$IRFIOSRA..AYL A.444444444444444444444444444g.g.g.g.g.g.gg.g.g.g.g.g.g.g.g.g.g.g.g.g.g.g.g.g.AVAJ.GNALAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAIRFCO$IRFIOSRA..AYL A.444444444444444444444444444g.g.g.g.g.g.gg.g.g.g.g.g.g.g.g.g.g.g.g.g.g.g.g.g.AVAJ.GNALAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAIRFCO$IRFIOSRA..AYL A.444444444444444444444444444g.g.g.g.g.g.gg.g.g.g.g.g.g.g.g.g.g.g.g.g.g.g.g.g.AVAJ.GNALAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAIRFCO$IRFIOSRA..AYL A.444444444444444444444444444g.g.g.g.g.g.gg.g.g.g.g.g.g.g.g.g.g.g.g.g.g.g.g.g.AVAJ.GNALAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAIRFCO$IRFIOSRA..AYL A.444444444444444444444444444g.g.g.g.g.g.gg.g.g.g.g.g.g.g.g.g.g.g.g.g.g.g.g.g.AVAJ.GNALAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAIRFCO$IRFIOSRA..AYL A.444444444444444444444444444g.g.g.g.g.g.gg.g.g.g.g.g.g.g.g.g.g.g.g.g.g.g.g.g.AVAJ.GNALAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAIRFCO$IRFIOSRA..AYL A.444");
            org.junit.Assert.fail("Expected exception of type java.lang.ClassNotFoundException; message: sTRINGg/g/g/g/g/g/g/g/g/g/g/g/g/g/g/g/g/g/AVAJ/GNALAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAIRFCO$IRFIOSRA//AYLA/444444444444444444444444444g/g/g/g/g/g/gg/g/g/g/g/g/g/g/g/g/g/g/g/g/g/g/g/g/AVAJ/GNALAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAIRFCO$IRFIOSRA//AYLA/444444444444444444444444444g/g/g/g/g/g/gg/g/g/g/g/g/g/g/g/g/g/g/g/g/g/g/g/g/AVAJ/GNALAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAIRFCO$IRFIOSRA//AYLA/444444444444444444444444444g/g/g/g/g/g/gg/g/g/g/g/g/g/g/g/g/g/g/g/g/g/g/g/g/AVAJ/GNALAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAIRFCO$IRFIOSRA//AYLA/444444444444444444444444444g/g/g/g/g/g/gg/g/g/g/g/g/g/g/g/g/g/g/g/g/g/g/g/g/AVAJ/GNALAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAIRFCO$IRFIOSRA//AYLA/444444444444444444444444444g/g/g/g/g/g/gg/g/g/g/g/g/g/g/g/g/g/g/g/g/g/g/g/g/AVAJ/GNALAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAIRFCO$IRFIOSRA//AYLA/444444444444444444444444444g/g/g/g/g/g/gg/g/g/g/g/g/g/g/g/g/g/g/g/g/g/g/g/g/AVAJ/GNALAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAIRFCO$IRFIOSRA//AYLA/444");
        } catch (java.lang.ClassNotFoundException e) {
            // Expected exception.
        }
    }

    @Test
    public void test44208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest88.test44208");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isEmpty((java.lang.CharSequence) ".         44444444444444444444444444444444444444444444444444444444444444444444444444444444.................................................................................................................................................................................................................................");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test44209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest88.test44209");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeStart("a.lang.objectclass java.lang.objectclass java.lang.objectclass java.lang.objectclass java.lang.objectclass java.lang.objectclass java.lang.objectclass java.lang.objectclass java.lang.objectclass java.lang.objectclass java.lang.objectclass java.lang.objectclass java.lang.objectclass java.lang.objectclass java.lang.objectclass java.lang.objectclass java.lang.objectclass java.lang.objectclass java.lang.objectclass java.lang.objectclass java.lang.object", "                   sTRINGsTRINGsTRINGsTRINGsTRINGsTRINGsTRINGsTRINGsTRINGsTRING                    ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "a.lang.objectclass java.lang.objectclass java.lang.objectclass java.lang.objectclass java.lang.objectclass java.lang.objectclass java.lang.objectclass java.lang.objectclass java.lang.objectclass java.lang.objectclass java.lang.objectclass java.lang.objectclass java.lang.objectclass java.lang.objectclass java.lang.objectclass java.lang.objectclass java.lang.objectclass java.lang.objectclass java.lang.objectclass java.lang.objectclass java.lang.object" + "'", str2, "a.lang.objectclass java.lang.objectclass java.lang.objectclass java.lang.objectclass java.lang.objectclass java.lang.objectclass java.lang.objectclass java.lang.objectclass java.lang.objectclass java.lang.objectclass java.lang.objectclass java.lang.objectclass java.lang.objectclass java.lang.objectclass java.lang.objectclass java.lang.objectclass java.lang.objectclass java.lang.objectclass java.lang.objectclass java.lang.objectclass java.lang.object");
    }

    @Test
    public void test44210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest88.test44210");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeStart("Booleaninterface java.lang.Clone", "             Character                          Character                          Character                          Character                          Character                          Character                          Character                          Character                          Character                          Character                          Character                          Character             ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Booleaninterface java.lang.Clone" + "'", str2, "Booleaninterface java.lang.Clone");
    }

    @Test
    public void test44211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest88.test44211");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.rightPad("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaGNAL.AVAJLANG.JAVAGNAL.AVAJLANG.JAVAGNAL.AVAJLANG.JAVAGNAL.AVAJLANG.JAVAGNAL.AVAJLANG.JAVAGNAL.AVAJLANG.JAVAGNAL.AVAJLANG.JAVAGNAL.gn gnal.avaj", 246, "     aaaaaaaaaa      javaStrinSerializableSerializableSerializableSeriali");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaGNAL.AVAJLANG.JAVAGNAL.AVAJLANG.JAVAGNAL.AVAJLANG.JAVAGNAL.AVAJLANG.JAVAGNAL.AVAJLANG.JAVAGNAL.AVAJLANG.JAVAGNAL.AVAJLANG.JAVAGNAL.gn gnal.avaj" + "'", str3, "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaGNAL.AVAJLANG.JAVAGNAL.AVAJLANG.JAVAGNAL.AVAJLANG.JAVAGNAL.AVAJLANG.JAVAGNAL.AVAJLANG.JAVAGNAL.AVAJLANG.JAVAGNAL.AVAJLANG.JAVAGNAL.gn gnal.avaj");
    }

    @Test
    public void test44212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest88.test44212");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass1 = org.apache.commons.lang3.ClassUtils.getClass("                                                                                                                                                                                                                                                                                                                                                        ArryListArryListArryListvjGNAL.AVAJLANG.JAVAGNAL.AVAJLANG.JAVAGNAL.AVAJLANG.JAVAGNAL.AVAJLANG.JAVAGNAL.AVAJLANG.JAVAGNAL.AVAJLANG.JAVAGNAL.AVAJLANG.JAVAGNAL.AVAJLANG.JAVAGNAL.AVAJgnl                                                                                                                                                                                                                                                                                                                                                                                           ");
            org.junit.Assert.fail("Expected exception of type java.lang.ClassNotFoundException; message: ArryListArryListArryListvjGNAL.AVAJLANG.JAVAGNAL.AVAJLANG.JAVAGNAL.AVAJLANG.JAVAGNAL.AVAJLANG.JAVAGNAL.AVAJLANG.JAVAGNAL.AVAJLANG.JAVAGNAL.AVAJLANG.JAVAGNAL.AVAJLANG.JAVAGNAL.AVAJgnl");
        } catch (java.lang.ClassNotFoundException e) {
            // Expected exception.
        }
    }

    @Test
    public void test44213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest88.test44213");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringAfter("44444444444444444444444444444444444444444444...                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                     ", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa.1aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa.1aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa.1aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa.1aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa.1aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa.1aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa.1aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa.hi!arraylistarraylistarraylis");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test44214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest88.test44214");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trim(".       .       .       .       .       .       .       .       .       .       .       .       .       .       .       .       .       .       .       .       .       .       .       .       .       .       .       .       .       .       .       .       .       .       .       .       .       .       .       .       .       .       .       .       .       .       .       .       .       .       .       .       .       .       .       .       .       .       .       .       .       .       .       .       .       .       .       .       .       .       .       .       .       .       .       .       .       .       .       .       .       .       .       .       .       .       .       .       .       .       .       .       .       .       .       .       .       .       .       .       ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + ".       .       .       .       .       .       .       .       .       .       .       .       .       .       .       .       .       .       .       .       .       .       .       .       .       .       .       .       .       .       .       .       .       .       .       .       .       .       .       .       .       .       .       .       .       .       .       .       .       .       .       .       .       .       .       .       .       .       .       .       .       .       .       .       .       .       .       .       .       .       .       .       .       .       .       .       .       .       .       .       .       .       .       .       .       .       .       .       .       .       .       .       .       .       .       .       .       .       .       ." + "'", str1, ".       .       .       .       .       .       .       .       .       .       .       .       .       .       .       .       .       .       .       .       .       .       .       .       .       .       .       .       .       .       .       .       .       .       .       .       .       .       .       .       .       .       .       .       .       .       .       .       .       .       .       .       .       .       .       .       .       .       .       .       .       .       .       .       .       .       .       .       .       .       .       .       .       .       .       .       .       .       .       .       .       .       .       .       .       .       .       .       .       .       .       .       .       .       .       .       .       .       .       .");
    }

    @Test
    public void test44215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest88.test44215");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripAccents((java.lang.CharSequence) "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa...esaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa...esaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa" + "'", str1, "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa...esaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
    }

    @Test
    public void test44216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest88.test44216");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitByCharacterTypeCamelCase("avaj.gnalavaj.gnalavaj.gnal");
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test44217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest88.test44217");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripToEmpty(".......java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + ".......java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java" + "'", str1, ".......java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java");
    }

    @Test
    public void test44218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest88.test44218");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.abbreviate("a..AYL A.44444444444444444444444444                                 ARRAa..AYL A.44444444444444444444444444                                 SILa..AYL A.44444444444444444444444444                                 ARRAa..AYL A.44444444444444444444444444                                 SILa..AYL A.44444444444444444444444444                                 ARRA", 602);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "a..AYL A.44444444444444444444444444                                 ARRAa..AYL A.44444444444444444444444444                                 SILa..AYL A.44444444444444444444444444                                 ARRAa..AYL A.44444444444444444444444444                                 SILa..AYL A.44444444444444444444444444                                 ARRA" + "'", str2, "a..AYL A.44444444444444444444444444                                 ARRAa..AYL A.44444444444444444444444444                                 SILa..AYL A.44444444444444444444444444                                 ARRAa..AYL A.44444444444444444444444444                                 SILa..AYL A.44444444444444444444444444                                 ARRA");
    }

    @Test
    public void test44219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest88.test44219");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens(" AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA", "... AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA... AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA... AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA... AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA... AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA... AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA... AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA... AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA... AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA... AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA");
        int int4 = org.apache.commons.lang3.StringUtils.lastIndexOfAny("", strArray3);
        java.lang.String str6 = org.apache.commons.lang3.ClassUtils.getShortClassName((java.lang.Object) "", "BYTE                                                                             ");
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "String" + "'", str6, "String");
    }

    @Test
    public void test44220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest88.test44220");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass1 = org.apache.commons.lang3.ClassUtils.getClass("                                              aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa...");
            org.junit.Assert.fail("Expected exception of type java.lang.ClassNotFoundException; message: aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa///");
        } catch (java.lang.ClassNotFoundException e) {
            // Expected exception.
        }
    }

    @Test
    public void test44221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest88.test44221");
        char[] charArray15 = new char[] { ' ', ' ', '#', 'a', '4', 'a' };
        int int16 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "", charArray15);
        boolean boolean17 = org.apache.commons.lang3.StringUtils.containsAny("......", charArray15);
        int int18 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "AAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAA", charArray15);
        int int19 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "JAVA.LANGAVAJ.GNALJAVA.LANGAVAJ.GNALJAVA.LANGAVAJ.GNALJAVA.LANGAVAJ.GNALJAVA.LANGAVAJ.GNALJAVA.LANGAVAJ.GNALJAVA.LANGAVAJ.GNALJAVA.LANGAVAJ.GNALJAVA.LANG", charArray15);
        boolean boolean20 = org.apache.commons.lang3.StringUtils.containsAny("gnal.avajgnal..LANGgnal.avajgnal.", charArray15);
        int int21 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "aaaaaaaaaajaval.agnaaaaaaaaaajaval.agnaaaaaaaaaajaval.agnaaaaaaaaaajaval.agnaaaaaaaaaajaval.agnaaaaaaaaaajaval.agnaaaaaaaaaajaval.agnaaaaaaaaaajaval.agnaaaaaaaaaajaval.agnaaaaaaaaaajaval.agnaaaaaaaaaajaval.agnaaaaaaaaaajaval.agnaaaaaaaaaaja                                              aaaaaaajaval.agnaaaaaaaaaajaval.agnaaaaaaaaaajaval.agnaaaaaaaaaajaval.agnaaaaaaaaaajaval.agnaaaaaaaaaajaval.agnaaaaaaaaaajaval.agnaaaaaaaaaajaval.agnaaaaaaaaaajaval.agnaaaaaaaaaajaval.agnaaaaaaaaaajaval.agnaaaaaaaaaajaval.agnaaaaaaaaaarin", charArray15);
        int int22 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "       aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", charArray15);
        int int23 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "-1JAVA.UTILSTRING[]", charArray15);
        boolean boolean24 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "                                      A..ayL ", charArray15);
        org.junit.Assert.assertNotNull(charArray15);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray15), "  #a4a");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray15), "  #a4a");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray15), "[ ,  , #, a, 4, a]");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 10 + "'", int21 == 10);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + (-1) + "'", int23 == (-1));
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
    }

    @Test
    public void test44222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest88.test44222");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.swapCase("$         $         $         $         $         $         $         $         $         $         $     ...");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "$         $         $         $         $         $         $         $         $         $         $     ..." + "'", str1, "$         $         $         $         $         $         $         $         $         $         $     ...");
    }

    @Test
    public void test44223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest88.test44223");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str3 = org.apache.commons.lang3.StringUtils.abbreviate("GNALAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAGN                                            ", 935, (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Minimum abbreviation width is 4");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test44224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest88.test44224");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.strip("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaVAJ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaVAJ" + "'", str1, "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaVAJ");
    }

    @Test
    public void test44225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest88.test44225");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("INTERFACE JAVA.LANG.cLONEABLEsTRINGINTERFACE JAVA.IO.sERIALIZABLE", "][SSALc                         ", 918);
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.getCommonPrefix(strArray3);
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray3, "HI!aRRAYlISTaRRAYlISTaRRAYlISTAVAJ.GNALaRRAYlISTaRRAYlIS", 36, 0);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "INTERFACE JAVA.LANG.cLONEABLEsTRINGINTERFACE JAVA.IO.sERIALIZABLE" + "'", str4, "INTERFACE JAVA.LANG.cLONEABLEsTRINGINTERFACE JAVA.IO.sERIALIZABLE");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test44226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest88.test44226");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.leftPad("#############################", 444);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                                                                                                                                                                                                                                                                                                                                                                                                               #############################" + "'", str2, "                                                                                                                                                                                                                                                                                                                                                                                                                               #############################");
    }

    @Test
    public void test44227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest88.test44227");
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("JAVA.LANG", '#');
        java.lang.String[] strArray8 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("javal#.#agn", "va.lang.Cl", 159);
        java.lang.String str9 = org.apache.commons.lang3.StringUtils.replaceEachRepeatedly("", strArray4, strArray8);
        java.lang.String[] strArray12 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("STRINGUTILS", "hi!arr...");
        java.lang.String str13 = org.apache.commons.lang3.StringUtils.replaceEachRepeatedly("gnal.avajgnal..LANGgnal.avajgnal", strArray8, strArray12);
        java.lang.String str14 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray8);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNotNull(strArray12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "gnal.avajgnal..LANGgnal.avajgnal" + "'", str13, "gnal.avajgnal..LANGgnal.avajgnal");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "javal#.#agn" + "'", str14, "javal#.#agn");
    }

    @Test
    public void test44228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest88.test44228");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.chomp("########$#######$          utilutilutilutilutilutilutilutilutilutilutilutilutilutilutilutilutilutilutilutilutilutilutilutilutilutilutilutilutilutilutilutilutilutilutilutilutilutilutilutilutilutilutilutilutilutilutilutilutilutilutilutilutilutilutilutilutilutilutilutilutilutilutilutilutilutilutilutilutilutilutilutilutilutilutilutilutilutilutilutilutilutilutilutilutilutilutilutilutilutilutilutilutilutilutilutilutilutilutilutilutilutilutilutilutilutilutilutilutilutilutilutilutilutilutilutilutilutilutilutilutilutilutilutilutilutilutilutilutilutilutilutilutilutilutilutilutilutilutilutilutilutilutilutilutilutilutilutilutilutilutilutilutilutilutilutilutilutilutilutilutilutilutilutilutilutilutilutilutilutilutilutilutilutilutilutilutilutilutilutilutilutilutilutilutilutilutilutilutilutilutilutilutilutilutilutilutilutilutilutilutilutilutilutilutilutilutilutilutilutilutilutilutilutilutilutilutilutilutilutilutilutilutilutilutilutilutilutiluti", "100.010");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "########$#######$          utilutilutilutilutilutilutilutilutilutilutilutilutilutilutilutilutilutilutilutilutilutilutilutilutilutilutilutilutilutilutilutilutilutilutilutilutilutilutilutilutilutilutilutilutilutilutilutilutilutilutilutilutilutilutilutilutilutilutilutilutilutilutilutilutilutilutilutilutilutilutilutilutilutilutilutilutilutilutilutilutilutilutilutilutilutilutilutilutilutilutilutilutilutilutilutilutilutilutilutilutilutilutilutilutilutilutilutilutilutilutilutilutilutilutilutilutilutilutilutilutilutilutilutilutilutilutilutilutilutilutilutilutilutilutilutilutilutilutilutilutilutilutilutilutilutilutilutilutilutilutilutilutilutilutilutilutilutilutilutilutilutilutilutilutilutilutilutilutilutilutilutilutilutilutilutilutilutilutilutilutilutilutilutilutilutilutilutilutilutilutilutilutilutilutilutilutilutilutilutilutilutilutilutilutilutilutilutilutilutilutilutilutilutilutilutilutilutilutilutilutilutilutilutilutilutilutilutiluti" + "'", str2, "########$#######$          utilutilutilutilutilutilutilutilutilutilutilutilutilutilutilutilutilutilutilutilutilutilutilutilutilutilutilutilutilutilutilutilutilutilutilutilutilutilutilutilutilutilutilutilutilutilutilutilutilutilutilutilutilutilutilutilutilutilutilutilutilutilutilutilutilutilutilutilutilutilutilutilutilutilutilutilutilutilutilutilutilutilutilutilutilutilutilutilutilutilutilutilutilutilutilutilutilutilutilutilutilutilutilutilutilutilutilutilutilutilutilutilutilutilutilutilutilutilutilutilutilutilutilutilutilutilutilutilutilutilutilutilutilutilutilutilutilutilutilutilutilutilutilutilutilutilutilutilutilutilutilutilutilutilutilutilutilutilutilutilutilutilutilutilutilutilutilutilutilutilutilutilutilutilutilutilutilutilutilutilutilutilutilutilutilutilutilutilutilutilutilutilutilutilutilutilutilutilutilutilutilutilutilutilutilutilutilutilutilutilutilutilutilutilutilutilutilutilutilutilutilutilutilutilutilutilutilutiluti");
    }

    @Test
    public void test44229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest88.test44229");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator(".uti###############################                                               aaaaJAVAL.AGNaaaaaaaaaaJAVAL.AGNaaaaaaaaaaJA########ava#########################################################################j", "irfCo$irfioSrAaaaaaaaaaaa                                  aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", 871);
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.concat((java.lang.Object[]) strArray3);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + ".uti###############################                                               aaaaJAVAL.AGNaaaaaaaaaaJAVAL.AGNaaaaaaaaaaJA########ava#########################################################################j" + "'", str4, ".uti###############################                                               aaaaJAVAL.AGNaaaaaaaaaaJAVAL.AGNaaaaaaaaaaJA########ava#########################################################################j");
    }

    @Test
    public void test44230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest88.test44230");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.defaultIfBlank("sTRING", "gnal.avaj");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "sTRING" + "'", str2, "sTRING");
    }

    @Test
    public void test44231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest88.test44231");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.split("44444444444444444444444444444444                                                    ");
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test44232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest88.test44232");
        java.lang.String str1 = org.apache.commons.lang3.ClassUtils.getShortCanonicalName("cLONEABLEaRRRRRRRRRRRRRRRRRRRRRRRRR");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "cLONEABLEaRRRRRRRRRRRRRRRRRRRRRRRRR" + "'", str1, "cLONEABLEaRRRRRRRRRRRRRRRRRRRRRRRRR");
    }

    @Test
    public void test44233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest88.test44233");
        char[] charArray11 = new char[] { ' ', ' ', '#', 'a', '4', 'a' };
        int int12 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "", charArray11);
        boolean boolean13 = org.apache.commons.lang3.StringUtils.containsAny("......", charArray11);
        int int14 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "Java.lang.Stringclass java.lang.Stringclass java.lang.Stringclas.lang.Stringclass java.lang.Stringc", charArray11);
        boolean boolean15 = org.apache.commons.lang3.StringUtils.containsAny("interface java.lang.CloneablearraarraarraarraarraarraarraarraarraarraarraarraarraarraarraarraarraarraarraarraarraarraarraarraarraarraarraarraarraarraarraarraarraarraarraarraarrNALaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaainterface java.io.Serializable", charArray11);
        int int16 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "aaaaaaaaaaSeriaA..AYLAaaaaaaaaaaa", charArray11);
        org.junit.Assert.assertNotNull(charArray11);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray11), "  #a4a");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray11), "  #a4a");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray11), "[ ,  , #, a, 4, a]");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 10 + "'", int16 == 10);
    }

    @Test
    public void test44234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest88.test44234");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.abbreviate("afretnignirtSelbaenolC.gnal.avaj ecafretni....................LANfretnignirtSelbaenolC.gnal.avaj ecafretniaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", 793);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "afretnignirtSelbaenolC.gnal.avaj ecafretni....................LANfretnignirtSelbaenolC.gnal.avaj ecafretniaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa..." + "'", str2, "afretnignirtSelbaenolC.gnal.avaj ecafretni....................LANfretnignirtSelbaenolC.gnal.avaj ecafretniaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa...");
    }

    @Test
    public void test44235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest88.test44235");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOfIgnoreCase("RChahactaRChahactaRChahactaRChahactaRChahactaRChahactaRChahactaRChahactaRChahactaRChahactaRChahactaRChahactaRChahactaRChahactaRChahactaRChahactaRChahactaRChahactaRChahactaRChahactaRChahactaRChahactaRChahactaRChahactaRChahactaRChahactaRChahactaRChahactaRChahactaRChahactaRChahactaRChahactaRChahactaRChahactaRChahactaRChahactaRChahactaRChahactaRChahactaRChahactaRChahactaRChahactaRChahactaRChahactaRChahactaRChahactaRChahactaRChahactaRChahactaRChahactaRChahactaRChahactaRChahactaRChahactaRChahactaRChahactaRChahactaRChahactaRChahactaRChahactaRChahactaRChahactaRChahactaRChahactaRChahactaRChahactaRChahactaRChahactaRChahactaRChahactaRChahactaRChahactaRChahactaRChahactaRChahactaRChahactaRChahactaRChahactaRChahactaRChahactaRChahactaRChahactaRChahactaRChahactaRChahact", "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                    j4v4.l4ng4v4j.gn4lj4v4.l4ng4v4j.gn4lj4v4.l4ng4v4j.gn4lj4v4.l4ng4v4j.gn4lj4v4.l4ng4v4j.gn4lj4v4.l4ng4v4j.gn4lj4v4.l4ng4v4j.gn4lj4v4.l4ng4v4j.gn4lj4v4.l4ng");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test44236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest88.test44236");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.defaultString("      GNALUAVAJ                       GNALUAVAJ                       SSALCGNALAVAJavajlitu");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "      GNALUAVAJ                       GNALUAVAJ                       SSALCGNALAVAJavajlitu" + "'", str1, "      GNALUAVAJ                       GNALUAVAJ                       SSALCGNALAVAJavajlitu");
    }

    @Test
    public void test44237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest88.test44237");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("hi!", "");
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.stripAll(strArray2, "$");
        java.lang.Class<?>[] wildcardClassArray5 = org.apache.commons.lang3.ClassUtils.toClass((java.lang.Object[]) strArray2);
        java.lang.Class<?>[] wildcardClassArray6 = org.apache.commons.lang3.ClassUtils.toClass((java.lang.Object[]) wildcardClassArray5);
        java.lang.String str10 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) wildcardClassArray6, '#', (int) (byte) -1, (-1));
        java.lang.String str11 = org.apache.commons.lang3.StringUtils.concat((java.lang.Object[]) wildcardClassArray6);
        java.lang.String[] strArray14 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("hi!", "");
        java.lang.String[] strArray16 = org.apache.commons.lang3.StringUtils.stripAll(strArray14, "$");
        java.lang.Class<?>[] wildcardClassArray17 = org.apache.commons.lang3.ClassUtils.toClass((java.lang.Object[]) strArray14);
        java.lang.Class<?> wildcardClass18 = null;
        java.lang.Class[] classArray20 = new java.lang.Class[1];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray21 = (java.lang.Class<?>[]) classArray20;
        wildcardClassArray21[0] = wildcardClass18;
        java.lang.Class<?>[] wildcardClassArray24 = org.apache.commons.lang3.ClassUtils.primitivesToWrappers(wildcardClassArray21);
        java.lang.String[] strArray26 = new java.lang.String[] { "                                   " };
        java.lang.String str27 = org.apache.commons.lang3.StringUtils.getCommonPrefix(strArray26);
        java.lang.Class<?>[] wildcardClassArray28 = org.apache.commons.lang3.ClassUtils.toClass((java.lang.Object[]) strArray26);
        java.lang.Class<?> wildcardClass29 = null;
        java.lang.Class[] classArray31 = new java.lang.Class[1];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray32 = (java.lang.Class<?>[]) classArray31;
        wildcardClassArray32[0] = wildcardClass29;
        java.lang.Class<?>[] wildcardClassArray35 = org.apache.commons.lang3.ClassUtils.primitivesToWrappers(wildcardClassArray32);
        boolean boolean36 = org.apache.commons.lang3.ClassUtils.isAssignable(wildcardClassArray28, wildcardClassArray32);
        boolean boolean38 = org.apache.commons.lang3.ClassUtils.isAssignable(wildcardClassArray21, wildcardClassArray32, true);
        boolean boolean40 = org.apache.commons.lang3.ClassUtils.isAssignable(wildcardClassArray17, wildcardClassArray32, false);
        java.lang.String str41 = org.apache.commons.lang3.StringUtils.concat((java.lang.Object[]) wildcardClassArray32);
        java.lang.Class[] classArray43 = new java.lang.Class[0];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray44 = (java.lang.Class<?>[]) classArray43;
        java.lang.Class<?>[] wildcardClassArray45 = org.apache.commons.lang3.ClassUtils.primitivesToWrappers(wildcardClassArray44);
        boolean boolean46 = org.apache.commons.lang3.ClassUtils.isAssignable(wildcardClassArray32, wildcardClassArray45);
        java.lang.String str48 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) wildcardClassArray32, '#');
        java.lang.Class<?> wildcardClass49 = null;
        java.lang.Class[] classArray51 = new java.lang.Class[1];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray52 = (java.lang.Class<?>[]) classArray51;
        wildcardClassArray52[0] = wildcardClass49;
        java.lang.Class<?>[] wildcardClassArray55 = org.apache.commons.lang3.ClassUtils.primitivesToWrappers(wildcardClassArray52);
        java.lang.String[] strArray57 = new java.lang.String[] { "                                   " };
        java.lang.String str58 = org.apache.commons.lang3.StringUtils.getCommonPrefix(strArray57);
        java.lang.Class<?>[] wildcardClassArray59 = org.apache.commons.lang3.ClassUtils.toClass((java.lang.Object[]) strArray57);
        java.lang.Class<?> wildcardClass60 = null;
        java.lang.Class[] classArray62 = new java.lang.Class[1];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray63 = (java.lang.Class<?>[]) classArray62;
        wildcardClassArray63[0] = wildcardClass60;
        java.lang.Class<?>[] wildcardClassArray66 = org.apache.commons.lang3.ClassUtils.primitivesToWrappers(wildcardClassArray63);
        boolean boolean67 = org.apache.commons.lang3.ClassUtils.isAssignable(wildcardClassArray59, wildcardClassArray63);
        boolean boolean69 = org.apache.commons.lang3.ClassUtils.isAssignable(wildcardClassArray52, wildcardClassArray63, true);
        java.lang.Class<?> wildcardClass70 = null;
        java.lang.Class[] classArray72 = new java.lang.Class[1];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray73 = (java.lang.Class<?>[]) classArray72;
        wildcardClassArray73[0] = wildcardClass70;
        java.lang.Class[] classArray77 = new java.lang.Class[0];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray78 = (java.lang.Class<?>[]) classArray77;
        boolean boolean80 = org.apache.commons.lang3.ClassUtils.isAssignable(wildcardClassArray73, wildcardClassArray78, false);
        boolean boolean81 = org.apache.commons.lang3.ClassUtils.isAssignable(wildcardClassArray63, wildcardClassArray78);
        boolean boolean83 = org.apache.commons.lang3.ClassUtils.isAssignable(wildcardClassArray32, wildcardClassArray78, false);
        boolean boolean84 = org.apache.commons.lang3.ClassUtils.isAssignable(wildcardClassArray6, wildcardClassArray78);
        java.lang.String[] strArray86 = org.apache.commons.lang3.StringUtils.splitByCharacterType("... AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA... AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA... AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA... AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA... AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA... AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA... AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA... AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA... AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA... AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA");
        java.lang.Class<?>[] wildcardClassArray87 = org.apache.commons.lang3.ClassUtils.toClass((java.lang.Object[]) strArray86);
        java.lang.Class<?>[] wildcardClassArray88 = org.apache.commons.lang3.ClassUtils.primitivesToWrappers(wildcardClassArray87);
        java.lang.Class<?>[] wildcardClassArray89 = org.apache.commons.lang3.ClassUtils.wrappersToPrimitives(wildcardClassArray88);
        java.lang.Class<?>[] wildcardClassArray90 = org.apache.commons.lang3.ClassUtils.toClass((java.lang.Object[]) wildcardClassArray89);
        java.lang.Class<?>[] wildcardClassArray91 = org.apache.commons.lang3.ClassUtils.toClass((java.lang.Object[]) wildcardClassArray90);
        boolean boolean92 = org.apache.commons.lang3.ClassUtils.isAssignable(wildcardClassArray78, wildcardClassArray91);
        java.lang.Class<?>[] wildcardClassArray93 = org.apache.commons.lang3.ClassUtils.wrappersToPrimitives(wildcardClassArray91);
        java.lang.Class<?>[] wildcardClassArray94 = org.apache.commons.lang3.ClassUtils.toClass((java.lang.Object[]) wildcardClassArray91);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertNotNull(wildcardClassArray5);
        org.junit.Assert.assertNotNull(wildcardClassArray6);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "class java.lang.Class" + "'", str11, "class java.lang.Class");
        org.junit.Assert.assertNotNull(strArray14);
        org.junit.Assert.assertNotNull(strArray16);
        org.junit.Assert.assertNotNull(wildcardClassArray17);
        org.junit.Assert.assertNotNull(classArray20);
        org.junit.Assert.assertNotNull(wildcardClassArray21);
        org.junit.Assert.assertNotNull(wildcardClassArray24);
        org.junit.Assert.assertNotNull(strArray26);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "                                   " + "'", str27, "                                   ");
        org.junit.Assert.assertNotNull(wildcardClassArray28);
        org.junit.Assert.assertNotNull(classArray31);
        org.junit.Assert.assertNotNull(wildcardClassArray32);
        org.junit.Assert.assertNotNull(wildcardClassArray35);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "" + "'", str41, "");
        org.junit.Assert.assertNotNull(classArray43);
        org.junit.Assert.assertNotNull(wildcardClassArray44);
        org.junit.Assert.assertNotNull(wildcardClassArray45);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertEquals("'" + str48 + "' != '" + "" + "'", str48, "");
        org.junit.Assert.assertNotNull(classArray51);
        org.junit.Assert.assertNotNull(wildcardClassArray52);
        org.junit.Assert.assertNotNull(wildcardClassArray55);
        org.junit.Assert.assertNotNull(strArray57);
        org.junit.Assert.assertEquals("'" + str58 + "' != '" + "                                   " + "'", str58, "                                   ");
        org.junit.Assert.assertNotNull(wildcardClassArray59);
        org.junit.Assert.assertNotNull(classArray62);
        org.junit.Assert.assertNotNull(wildcardClassArray63);
        org.junit.Assert.assertNotNull(wildcardClassArray66);
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + false + "'", boolean67 == false);
        org.junit.Assert.assertTrue("'" + boolean69 + "' != '" + false + "'", boolean69 == false);
        org.junit.Assert.assertNotNull(classArray72);
        org.junit.Assert.assertNotNull(wildcardClassArray73);
        org.junit.Assert.assertNotNull(classArray77);
        org.junit.Assert.assertNotNull(wildcardClassArray78);
        org.junit.Assert.assertTrue("'" + boolean80 + "' != '" + false + "'", boolean80 == false);
        org.junit.Assert.assertTrue("'" + boolean81 + "' != '" + false + "'", boolean81 == false);
        org.junit.Assert.assertTrue("'" + boolean83 + "' != '" + false + "'", boolean83 == false);
        org.junit.Assert.assertTrue("'" + boolean84 + "' != '" + false + "'", boolean84 == false);
        org.junit.Assert.assertNotNull(strArray86);
        org.junit.Assert.assertNotNull(wildcardClassArray87);
        org.junit.Assert.assertNotNull(wildcardClassArray88);
        org.junit.Assert.assertNotNull(wildcardClassArray89);
        org.junit.Assert.assertNotNull(wildcardClassArray90);
        org.junit.Assert.assertNotNull(wildcardClassArray91);
        org.junit.Assert.assertTrue("'" + boolean92 + "' != '" + false + "'", boolean92 == false);
        org.junit.Assert.assertNotNull(wildcardClassArray93);
        org.junit.Assert.assertNotNull(wildcardClassArray94);
    }

    @Test
    public void test44238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest88.test44238");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.rightPad("interface java.lang.CloneableAtsiLytcejbO.gnal.avajssalcrrAtsiLytcejbO.gnal.avajssalcrrAva.langGNAL..langjavainterface java.io.Serializable", 990, "              A..iyL A    ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "interface java.lang.CloneableAtsiLytcejbO.gnal.avajssalcrrAtsiLytcejbO.gnal.avajssalcrrAva.langGNAL..langjavainterface java.io.Serializable              A..iyL A                  A..iyL A                  A..iyL A                  A..iyL A                  A..iyL A                  A..iyL A                  A..iyL A                  A..iyL A                  A..iyL A                  A..iyL A                  A..iyL A                  A..iyL A                  A..iyL A                  A..iyL A                  A..iyL A                  A..iyL A                  A..iyL A                  A..iyL A                  A..iyL A                  A..iyL A                  A..iyL A                  A..iyL A                  A..iyL A                  A..iyL A                  A..iyL A                  A..iyL A                  A..iyL A                  A..iyL A                  A..iyL A                  A..iyL A                  A..iyL A                  A..iyL A                  A..iy" + "'", str3, "interface java.lang.CloneableAtsiLytcejbO.gnal.avajssalcrrAtsiLytcejbO.gnal.avajssalcrrAva.langGNAL..langjavainterface java.io.Serializable              A..iyL A                  A..iyL A                  A..iyL A                  A..iyL A                  A..iyL A                  A..iyL A                  A..iyL A                  A..iyL A                  A..iyL A                  A..iyL A                  A..iyL A                  A..iyL A                  A..iyL A                  A..iyL A                  A..iyL A                  A..iyL A                  A..iyL A                  A..iyL A                  A..iyL A                  A..iyL A                  A..iyL A                  A..iyL A                  A..iyL A                  A..iyL A                  A..iyL A                  A..iyL A                  A..iyL A                  A..iyL A                  A..iyL A                  A..iyL A                  A..iyL A                  A..iyL A                  A..iy");
    }

    @Test
    public void test44239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest88.test44239");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.substring("    slitUgnirtSslitUgnirtSslitUgnirtSslitUgnirtSslitUgnirtSslitUgnirtSslitUgnirtSslitUgnirtSslitUgnirtSslitUgnirt    ", 665, 37);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test44240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest88.test44240");
        java.lang.ClassLoader classLoader0 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass2 = org.apache.commons.lang3.ClassUtils.getClass(classLoader0, "interfacejava.lang.cloneable...interfacejava.io");
            org.junit.Assert.fail("Expected exception of type java.lang.ClassNotFoundException; message: interfacejava/lang/cloneable///interfacejava/io");
        } catch (java.lang.ClassNotFoundException e) {
            // Expected exception.
        }
    }

    @Test
    public void test44241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest88.test44241");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("agn", "java.lang$");
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test44242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest88.test44242");
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.overlay("ClassJAVA.LANGaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaULANG", "tsiLyarrA.La.lan", 537, 936);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "ClassJAVA.LANGaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaULANGtsiLyarrA.La.lan" + "'", str4, "ClassJAVA.LANGaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaULANGtsiLyarrA.La.lan");
    }

    @Test
    public void test44243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest88.test44243");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBeforeLast("ngalavajAAAAAAAAAAngalavajAAAAAAAAAAngalavajAAAAAAAAAAngalavajAAAAAAAAAAngalavajAAAAAAAAAAngalavajAAAAAAAAAAngalavajAAAAAAAAAAngalavajAAAAAAAAAAngalavajAAAAAAAAAAngalavajAAAAAAAAAAngalavajAAAAAAAAAAngalavajAAAAAAAAAAngalavajAAAAAAAAAAngalavajAAAAAAAAAAngalavajAAAAAAAAAAngalavajAAAAAAAAAAngalavajAAAAAAAAAAngalavajAAAAAAAAAAngalavajAAAAAAAAAAngalavajAAAAAAAAAAngalavajAAAAAAAAAAngalavajAAAAAAAAAAngalavajAAAAAAAAAAngalavajAAAAAAAAAAngalavajAAAAAAAAAAngalavajAAAAAAAAAAngalavajAAAAAAAAAAngalavajAAAAAAAAAAngalavajAAAAAAAAAAngalavajAAAAAAAAAAngalavajAAAAAAAAAAngalavajAAAAAAAAAAngalavajAAAAAAAAAAngalavajAAAAAAAAAAngalavajAAAAAAAAAA][gnirtSlitu.avaj1-][gnirtSlitu.avaj1-                                                                                   ", "interfacejava.lang.cloneablestringinterfacejava");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "ngalavajAAAAAAAAAAngalavajAAAAAAAAAAngalavajAAAAAAAAAAngalavajAAAAAAAAAAngalavajAAAAAAAAAAngalavajAAAAAAAAAAngalavajAAAAAAAAAAngalavajAAAAAAAAAAngalavajAAAAAAAAAAngalavajAAAAAAAAAAngalavajAAAAAAAAAAngalavajAAAAAAAAAAngalavajAAAAAAAAAAngalavajAAAAAAAAAAngalavajAAAAAAAAAAngalavajAAAAAAAAAAngalavajAAAAAAAAAAngalavajAAAAAAAAAAngalavajAAAAAAAAAAngalavajAAAAAAAAAAngalavajAAAAAAAAAAngalavajAAAAAAAAAAngalavajAAAAAAAAAAngalavajAAAAAAAAAAngalavajAAAAAAAAAAngalavajAAAAAAAAAAngalavajAAAAAAAAAAngalavajAAAAAAAAAAngalavajAAAAAAAAAAngalavajAAAAAAAAAAngalavajAAAAAAAAAAngalavajAAAAAAAAAAngalavajAAAAAAAAAAngalavajAAAAAAAAAAngalavajAAAAAAAAAA][gnirtSlitu.avaj1-][gnirtSlitu.avaj1-                                                                                   " + "'", str2, "ngalavajAAAAAAAAAAngalavajAAAAAAAAAAngalavajAAAAAAAAAAngalavajAAAAAAAAAAngalavajAAAAAAAAAAngalavajAAAAAAAAAAngalavajAAAAAAAAAAngalavajAAAAAAAAAAngalavajAAAAAAAAAAngalavajAAAAAAAAAAngalavajAAAAAAAAAAngalavajAAAAAAAAAAngalavajAAAAAAAAAAngalavajAAAAAAAAAAngalavajAAAAAAAAAAngalavajAAAAAAAAAAngalavajAAAAAAAAAAngalavajAAAAAAAAAAngalavajAAAAAAAAAAngalavajAAAAAAAAAAngalavajAAAAAAAAAAngalavajAAAAAAAAAAngalavajAAAAAAAAAAngalavajAAAAAAAAAAngalavajAAAAAAAAAAngalavajAAAAAAAAAAngalavajAAAAAAAAAAngalavajAAAAAAAAAAngalavajAAAAAAAAAAngalavajAAAAAAAAAAngalavajAAAAAAAAAAngalavajAAAAAAAAAAngalavajAAAAAAAAAAngalavajAAAAAAAAAAngalavajAAAAAAAAAA][gnirtSlitu.avaj1-][gnirtSlitu.avaj1-                                                                                   ");
    }

    @Test
    public void test44244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest88.test44244");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.remove("aRR...AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA...AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA...AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA...AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA...AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA...AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA...AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA...AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA...AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA...", "GNAL.AVAJGNAL..langGNAL.AVAJGNALLituLlituLlitu");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "aRR...AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA...AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA...AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA...AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA...AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA...AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA...AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA...AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA...AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA..." + "'", str2, "aRR...AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA...AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA...AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA...AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA...AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA...AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA...AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA...AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA...AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA...");
    }

    @Test
    public void test44245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest88.test44245");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.defaultString("interfacejava.lang.Cloneablejv..........jv..........jv..........jv..........jv..........jv..........jv..........jv..........jv..........jv..........jv..........jv..........jv..........jv..........jv..........jv..........jv..........jv..........jv..........jv..........jv..........jv..........jv..........jv..........jv..........jv..........jv..........jv..........jv..........jv..........jv..........jv..........jv..........jv..........jvinterfcejv.iointerfacejava.io.Serializable", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaajaval...agn");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "interfacejava.lang.Cloneablejv..........jv..........jv..........jv..........jv..........jv..........jv..........jv..........jv..........jv..........jv..........jv..........jv..........jv..........jv..........jv..........jv..........jv..........jv..........jv..........jv..........jv..........jv..........jv..........jv..........jv..........jv..........jv..........jv..........jv..........jv..........jv..........jv..........jv..........jvinterfcejv.iointerfacejava.io.Serializable" + "'", str2, "interfacejava.lang.Cloneablejv..........jv..........jv..........jv..........jv..........jv..........jv..........jv..........jv..........jv..........jv..........jv..........jv..........jv..........jv..........jv..........jv..........jv..........jv..........jv..........jv..........jv..........jv..........jv..........jv..........jv..........jv..........jv..........jv..........jv..........jv..........jv..........jv..........jv..........jvinterfcejv.iointerfacejava.io.Serializable");
    }

    @Test
    public void test44246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest88.test44246");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.split("hinterface java.lang.cloneable4interface java.io.serializabl....1aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa...1aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa...1aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa...1aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa...1aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa...1aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa...1aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa...1aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa...1aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa...1aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        int int3 = org.apache.commons.lang3.StringUtils.indexOfAny("", strArray2);
        java.lang.String str5 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray2, '#');
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hinterface#java.lang.cloneable4interface#java.io.serializabl....1aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa...1aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa...1aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa...1aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa...1aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa...1aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa...1aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa...1aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa...1aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa...1aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa" + "'", str5, "hinterface#java.lang.cloneable4interface#java.io.serializabl....1aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa...1aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa...1aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa...1aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa...1aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa...1aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa...1aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa...1aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa...1aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa...1aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
    }

    @Test
    public void test44247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest88.test44247");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.equalsIgnoreCase("..aaaa                       javaulangRRAYlIST", "444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444interface java.lang.Cloneable.                                 interface java.io.Serializable");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test44248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest88.test44248");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfIgnoreCase("     A..ayL A.44444444444444444444444444           A..ayL A.44444444444444444444444444           A..ayL A.44444444444444444444444444           A..ayL A.44444444444444444444444444           A..ayL A.44444444444444444444444444           A..ayL A.444444444.........java..........java...........     A..ayL A.44444444444444444444444444           A..ayL A.44444444444444444444444444           A..ayL A.44444444444444444444444444           A..ayL A.44444444444444444444444444           A..ayL A.44444444444444444444444444           A..ayL A.444444444", "interface java.lang.CloneableAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAringinterface java.io.Serializabl");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test44249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest88.test44249");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.leftPad("aaaaaaaa44444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444", 246);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "aaaaaaaa44444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444" + "'", str2, "aaaaaaaa44444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444");
    }

    @Test
    public void test44250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest88.test44250");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNotBlank((java.lang.CharSequence) "$$$$$$$$$$$$$$$.....$$$$              ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test44251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest88.test44251");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.split("java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java........", "Boolean", 50);
        java.lang.String str5 = org.apache.commons.lang3.ClassUtils.getShortCanonicalName((java.lang.Object) 50, "ERIALIZAB");
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Integer" + "'", str5, "Integer");
    }

    @Test
    public void test44252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest88.test44252");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlpha((java.lang.CharSequence) "JLVLlaLNG");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test44253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest88.test44253");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphanumericSpace((java.lang.CharSequence) "L.AVAJLANG.JAVAGNAL.AVAJLANG.JAVAGNAL.AVAJLANG.JAVAGNAL.AVAJLANG.GNAL");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test44254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest88.test44254");
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
        java.lang.Class<?>[] wildcardClassArray21 = org.apache.commons.lang3.ClassUtils.wrappersToPrimitives(wildcardClassArray20);
        java.lang.Class<?>[] wildcardClassArray22 = org.apache.commons.lang3.ClassUtils.wrappersToPrimitives(wildcardClassArray21);
        java.lang.Class<?> wildcardClass23 = wildcardClassArray22.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test44255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest88.test44255");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeStartIgnoreCase("#######################################################################################################################################################################################################################################################################$#######$          ###############################################################################################################################################################################################################################################################", "interface java.lang.CloneableJAVAJAVAJAVAJAVAJAVAJAVAJAVAJAVAJAVAJAVAJAVAJAVAJAVAJAVAJAVAJAVAJAVAJAVAJAVAJAVAJAVAJAVAJAVAJAVAJAVAJAVAJAVAJAVAJAVAJAVAJAVAJAVAJAVAJAVAinterface java.io.Serializableinterface java.lang.CloneableJAVAJAVAJAVAJAVAJAjvstringnlrrylistrrylistrrylistvj.gnlrrylistrrylistrryliinterface java.lang.CloneableJAVAJAVAJAVAJAVAJAVAJAVAJAVAJAVAJAVAJAVAJAVAJAVAJAVAJAVAJAVAJAVAJAVAJAVAJAVAJAVAJAVAJAVAJAVAJAVAJAVAJAVAJAVAJAVAJAVAJAVAJAVAJAVAJAVAJAVAinterface java.io.Serializableinterface java.lang.CloneableJAVAJAVAJAVAJAVAJA");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "#######################################################################################################################################################################################################################################################################$#######$          ###############################################################################################################################################################################################################################################################" + "'", str2, "#######################################################################################################################################################################################################################################################################$#######$          ###############################################################################################################################################################################################################################################################");
    }

    @Test
    public void test44256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest88.test44256");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNumeric((java.lang.CharSequence) "$$$VA$LANGAVAJ$GNALJAVA$LANGAVAJ$GNALJAVA$LANGAVAJ$GNALJAVA$LANGAVAJ$GNALJAVA$LANGAVAJ$GNALJAVA$LANGgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalg");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test44257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest88.test44257");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("#############...", '4');
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test44258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest88.test44258");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.mid("....................................................................", 159, 136);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test44259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest88.test44259");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.contains("lvj.gnl", "");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test44260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest88.test44260");
        int int3 = org.apache.commons.lang3.StringUtils.indexOfIgnoreCase("                                                ", "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                          javaaaaaaaaaa                                                                                                                                         ", 545);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test44261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest88.test44261");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trimToNull("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa" + "'", str1, "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
    }

    @Test
    public void test44262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest88.test44262");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.left("ArrayLisArrayLisArrayLisArrayLisArra4444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444....", 145);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "ArrayLisArrayLisArrayLisArrayLisArra4444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444" + "'", str2, "ArrayLisArrayLisArrayLisArrayLisArra4444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444");
    }

    @Test
    public void test44263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest88.test44263");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.swapCase("L.Arr yList");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "l.aRR YlIST" + "'", str1, "l.aRR YlIST");
    }

    @Test
    public void test44264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest88.test44264");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripToNull("                                                                                                                                                                                                                                                                                                                                                                                                                                                            ");
        org.junit.Assert.assertNull(str1);
    }

    @Test
    public void test44265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest88.test44265");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.abbreviate("...AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA...AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA...AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA...AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA...AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA...AAA...", 481);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "...AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA...AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA...AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA...AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA...AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA...AAA..." + "'", str2, "...AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA...AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA...AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA...AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA...AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA...AAA...");
    }

    @Test
    public void test44266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest88.test44266");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("4", "hi!ArrayListArrayListArrayListavaj.gnalArrayListArrayListArrayListavaj");
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.getCommonPrefix(strArray3);
        boolean boolean5 = org.apache.commons.lang3.StringUtils.startsWithAny("afretnignirtSelbaenolC.gnal.avaj ecafretni....................LANfretnignirtSelbaenolC.gnal.avaj ecafretni", strArray3);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "4" + "'", str4, "4");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test44267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest88.test44267");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("NAL.", "############");
        boolean boolean4 = org.apache.commons.lang3.StringUtils.startsWithAny("                A..AYL A.44444444444444444444444444                                                 $$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$", strArray3);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test44268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest88.test44268");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.normalizeSpace("interface java.lang.Cloneable...       AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAinterface java.io.Serializable");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "interface java.lang.Cloneable... AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAinterface java.io.Serializable" + "'", str1, "interface java.lang.Cloneable... AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAinterface java.io.Serializable");
    }

    @Test
    public void test44269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest88.test44269");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.rightPad("Arr... 444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444... 444444444444444444444444444444444444444444444444", 50);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Arr... 444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444... 444444444444444444444444444444444444444444444444" + "'", str2, "Arr... 444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444... 444444444444444444444444444444444444444444444444");
    }

    @Test
    public void test44270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest88.test44270");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trimToNull("$$$$$$$$$$$$..");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "$$$$$$$$$$$$.." + "'", str1, "$$$$$$$$$$$$..");
    }

    @Test
    public void test44271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest88.test44271");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.center("CLASSSLITUGNIRTSSLITUGNIRTSSLITUGNIRTSSLITUGNIRTSSLITUGNIRTSSLITUGNIRTinterfcegg.lng.ClonebleAAAAAAAAAAggl.gnAAAAAAAAAAggl.gnAAAAAAAAAAggl.gnAAAAAAAAAAggl.gnAAAAAAAAAAggl.gnAAAAAAAAAAggl.gnAAAAAAAAAAggl.gnAAAAAAAAAAggl.gnAAAAAAAAAAggl.gnAAAAAAAAAAggl.gnAAAAAAAAAAggl.gnAAAAAAAAAAggl.gnAAAAAAAAAAggl.gnAAAAAAAAAAggl.gnAAAAAAAAAAggl.gnAAAAAAAAAAggl.gnAAAAAAAAAAggl.gnAAAAAAAAAAggl.gnAAAAAAAAAAggl.gnAAAAAAAAAAggl.gnAAAAAAAAAAggl.gnAAAAAAAAAAggl.gnAAAAAAAAAAggl.gnAAAAAAAAAAggl.gnAAAAAAAAAAggl.gnAAAAAAAAAAggl.gnAAAAAAAAAAggl.gnAAAAAAAAAAggl.gnAAAAAAAAAAggl.gnAAAAAAAAAAggl.gnAAAAAAAAAAggl.gnAAAAAAAAAAggl.gnAAAAAAAAAAggl.gnAAAAAAAAAAggl.gnAAAAAAAAAAggl.gnAAAAAAAAAAringinterfcegg.io", 108);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "CLASSSLITUGNIRTSSLITUGNIRTSSLITUGNIRTSSLITUGNIRTSSLITUGNIRTSSLITUGNIRTinterfcegg.lng.ClonebleAAAAAAAAAAggl.gnAAAAAAAAAAggl.gnAAAAAAAAAAggl.gnAAAAAAAAAAggl.gnAAAAAAAAAAggl.gnAAAAAAAAAAggl.gnAAAAAAAAAAggl.gnAAAAAAAAAAggl.gnAAAAAAAAAAggl.gnAAAAAAAAAAggl.gnAAAAAAAAAAggl.gnAAAAAAAAAAggl.gnAAAAAAAAAAggl.gnAAAAAAAAAAggl.gnAAAAAAAAAAggl.gnAAAAAAAAAAggl.gnAAAAAAAAAAggl.gnAAAAAAAAAAggl.gnAAAAAAAAAAggl.gnAAAAAAAAAAggl.gnAAAAAAAAAAggl.gnAAAAAAAAAAggl.gnAAAAAAAAAAggl.gnAAAAAAAAAAggl.gnAAAAAAAAAAggl.gnAAAAAAAAAAggl.gnAAAAAAAAAAggl.gnAAAAAAAAAAggl.gnAAAAAAAAAAggl.gnAAAAAAAAAAggl.gnAAAAAAAAAAggl.gnAAAAAAAAAAggl.gnAAAAAAAAAAggl.gnAAAAAAAAAAggl.gnAAAAAAAAAAggl.gnAAAAAAAAAAringinterfcegg.io" + "'", str2, "CLASSSLITUGNIRTSSLITUGNIRTSSLITUGNIRTSSLITUGNIRTSSLITUGNIRTSSLITUGNIRTinterfcegg.lng.ClonebleAAAAAAAAAAggl.gnAAAAAAAAAAggl.gnAAAAAAAAAAggl.gnAAAAAAAAAAggl.gnAAAAAAAAAAggl.gnAAAAAAAAAAggl.gnAAAAAAAAAAggl.gnAAAAAAAAAAggl.gnAAAAAAAAAAggl.gnAAAAAAAAAAggl.gnAAAAAAAAAAggl.gnAAAAAAAAAAggl.gnAAAAAAAAAAggl.gnAAAAAAAAAAggl.gnAAAAAAAAAAggl.gnAAAAAAAAAAggl.gnAAAAAAAAAAggl.gnAAAAAAAAAAggl.gnAAAAAAAAAAggl.gnAAAAAAAAAAggl.gnAAAAAAAAAAggl.gnAAAAAAAAAAggl.gnAAAAAAAAAAggl.gnAAAAAAAAAAggl.gnAAAAAAAAAAggl.gnAAAAAAAAAAggl.gnAAAAAAAAAAggl.gnAAAAAAAAAAggl.gnAAAAAAAAAAggl.gnAAAAAAAAAAggl.gnAAAAAAAAAAggl.gnAAAAAAAAAAggl.gnAAAAAAAAAAggl.gnAAAAAAAAAAggl.gnAAAAAAAAAAggl.gnAAAAAAAAAAringinterfcegg.io");
    }

    @Test
    public void test44272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest88.test44272");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBetween("###################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################-1String[]", "                                                                                                              ");
        org.junit.Assert.assertNull(str2);
    }

    @Test
    public void test44273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest88.test44273");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.upperCase("interfacejava.lang.Cloneable.interfacejava.io.Serializable");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "INTERFACEJAVA.LANG.CLONEABLE.INTERFACEJAVA.IO.SERIALIZABLE" + "'", str1, "INTERFACEJAVA.LANG.CLONEABLE.INTERFACEJAVA.IO.SERIALIZABLE");
    }

    @Test
    public void test44274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest88.test44274");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substring("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa$$$$$$$$$$$$$$$$$$$$$$$$$$...$$$$$$$$$$$$$$$$$$$$$$$$$$$$$...$$$$$$$$$$$$$$$$$$$$$$$$$$$$$", 152);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "$$$$$$$$$$$$...$$$$$$$$$$$$$$$$$$$$$$$$$$$$$...$$$$$$$$$$$$$$$$$$$$$$$$$$$$$" + "'", str2, "$$$$$$$$$$$$...$$$$$$$$$$$$$$$$$$$$$$$$$$$$$...$$$$$$$$$$$$$$$$$$$$$$$$$$$$$");
    }

    @Test
    public void test44275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest88.test44275");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.swapCase("..............................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................LASS...                                       ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "..............................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................lass...                                       " + "'", str1, "..............................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................lass...                                       ");
    }

    @Test
    public void test44276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest88.test44276");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeEndIgnoreCase("LANGaaaaaaAVAJ.GNALNaaaaaaaaaaJAVAL.AGNaaaaaaaaaaJAVAL.AGNaaaaaaaaaaJAVAL.AGNaaaaaaaaaaJAVAL.AGNaaaaaaaaaaJAVAL.AGNaaaaaaaaaaJAVAL.AGNaaaaaaaaaaJAVAL.AGNaaaaaaaaaaJAVAL.AGNaaaaaaaaaaJAVAL.AGNaaaaaaaaaaJAVAL.AGNaaaaaaaaaaJAVAL.AGNaaaaaaaaaaJAVAL.AGNaaaaaaaaaaJAVAL.AGNaaaaaaaaaaJAVAL.AGNaaaaaaaaaaJAVAL.AGNaaaaaaaaaaJAVAL.AGNaaaaaaaaaaJAVAL.AGNaaaaaaaaaaJAVAL.AGNaaaaaaaaaaJAVAL.AGNaaaaaaaaaaJAVAL.AGNaaaaaaaaaaJAVAL.AGNaaaaaaaaaaJAVAL.AGNaaaaaaaaaaJAVAL.AGNaaaaaaaaaaJAVAL.AGNaaaaaaaaaaJAVAL.AGNaaaaaaaaaaJAVAL.AGNaaaaaaaaaaJAVAL.AGNaaaaaaaaaaJAVAL.AGNaaaaaaaaaaJAVAL.AGNaaaaaaaaaaJAVAL.AGNaaaaaaaaaaJAVAL.AGNaaaaaaaaaaJAVAL.AGNaaaaaaaaaaJAVAL.AGNaaaaaaaaaaJAVAL.AGNaaaaaaaaaa", "litulitulitulitulitul####litulitulitulitulitu");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "LANGaaaaaaAVAJ.GNALNaaaaaaaaaaJAVAL.AGNaaaaaaaaaaJAVAL.AGNaaaaaaaaaaJAVAL.AGNaaaaaaaaaaJAVAL.AGNaaaaaaaaaaJAVAL.AGNaaaaaaaaaaJAVAL.AGNaaaaaaaaaaJAVAL.AGNaaaaaaaaaaJAVAL.AGNaaaaaaaaaaJAVAL.AGNaaaaaaaaaaJAVAL.AGNaaaaaaaaaaJAVAL.AGNaaaaaaaaaaJAVAL.AGNaaaaaaaaaaJAVAL.AGNaaaaaaaaaaJAVAL.AGNaaaaaaaaaaJAVAL.AGNaaaaaaaaaaJAVAL.AGNaaaaaaaaaaJAVAL.AGNaaaaaaaaaaJAVAL.AGNaaaaaaaaaaJAVAL.AGNaaaaaaaaaaJAVAL.AGNaaaaaaaaaaJAVAL.AGNaaaaaaaaaaJAVAL.AGNaaaaaaaaaaJAVAL.AGNaaaaaaaaaaJAVAL.AGNaaaaaaaaaaJAVAL.AGNaaaaaaaaaaJAVAL.AGNaaaaaaaaaaJAVAL.AGNaaaaaaaaaaJAVAL.AGNaaaaaaaaaaJAVAL.AGNaaaaaaaaaaJAVAL.AGNaaaaaaaaaaJAVAL.AGNaaaaaaaaaaJAVAL.AGNaaaaaaaaaaJAVAL.AGNaaaaaaaaaaJAVAL.AGNaaaaaaaaaa" + "'", str2, "LANGaaaaaaAVAJ.GNALNaaaaaaaaaaJAVAL.AGNaaaaaaaaaaJAVAL.AGNaaaaaaaaaaJAVAL.AGNaaaaaaaaaaJAVAL.AGNaaaaaaaaaaJAVAL.AGNaaaaaaaaaaJAVAL.AGNaaaaaaaaaaJAVAL.AGNaaaaaaaaaaJAVAL.AGNaaaaaaaaaaJAVAL.AGNaaaaaaaaaaJAVAL.AGNaaaaaaaaaaJAVAL.AGNaaaaaaaaaaJAVAL.AGNaaaaaaaaaaJAVAL.AGNaaaaaaaaaaJAVAL.AGNaaaaaaaaaaJAVAL.AGNaaaaaaaaaaJAVAL.AGNaaaaaaaaaaJAVAL.AGNaaaaaaaaaaJAVAL.AGNaaaaaaaaaaJAVAL.AGNaaaaaaaaaaJAVAL.AGNaaaaaaaaaaJAVAL.AGNaaaaaaaaaaJAVAL.AGNaaaaaaaaaaJAVAL.AGNaaaaaaaaaaJAVAL.AGNaaaaaaaaaaJAVAL.AGNaaaaaaaaaaJAVAL.AGNaaaaaaaaaaJAVAL.AGNaaaaaaaaaaJAVAL.AGNaaaaaaaaaaJAVAL.AGNaaaaaaaaaaJAVAL.AGNaaaaaaaaaaJAVAL.AGNaaaaaaaaaaJAVAL.AGNaaaaaaaaaaJAVAL.AGNaaaaaaaaaaJAVAL.AGNaaaaaaaaaa");
    }

    @Test
    public void test44277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest88.test44277");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isWhitespace((java.lang.CharSequence) "interface java.io.serializable                                                                                                                                                                                                                                                                                                                                          ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test44278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest88.test44278");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.leftPad("java.langAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA", 70, '#');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "java.langAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA" + "'", str3, "java.langAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA");
    }

    @Test
    public void test44279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest88.test44279");
        java.lang.String[] strArray7 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("...", "                                   ", (int) 'a');
        java.lang.String[] strArray8 = org.apache.commons.lang3.StringUtils.stripAll(strArray7);
        java.lang.String str9 = org.apache.commons.lang3.StringUtils.getCommonPrefix(strArray8);
        java.lang.String[] strArray10 = org.apache.commons.lang3.StringUtils.stripAll(strArray8);
        java.lang.String[] strArray15 = new java.lang.String[] { "                                   " };
        java.lang.String str16 = org.apache.commons.lang3.StringUtils.getCommonPrefix(strArray15);
        int int17 = org.apache.commons.lang3.StringUtils.indexOfDifference((java.lang.CharSequence[]) strArray15);
        int int18 = org.apache.commons.lang3.StringUtils.lastIndexOfAny("...       ", strArray15);
        boolean boolean19 = org.apache.commons.lang3.StringUtils.endsWithAny("java.lang", strArray15);
        int int20 = org.apache.commons.lang3.StringUtils.lastIndexOfAny("...$$$$$$$$$$$$$$$...", strArray15);
        java.lang.String[] strArray22 = org.apache.commons.lang3.StringUtils.stripAll(strArray15, "                                                                                                                                                                                                                                                                                                                                                                                                          Java.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava...                                                                                                                                                                                                                                                                                                                                                                                                           ");
        java.lang.String str23 = org.apache.commons.lang3.StringUtils.replaceEach("class", strArray10, strArray22);
        java.lang.String[] strArray27 = org.apache.commons.lang3.StringUtils.split("AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA", "arraylist", 669);
        java.lang.String[] strArray29 = org.apache.commons.lang3.StringUtils.stripAll(strArray27, "iRFCO.IRFIOSRIIZ");
        java.lang.String str30 = org.apache.commons.lang3.StringUtils.replaceEach("44444444444444444.4...", strArray22, strArray27);
        int int31 = org.apache.commons.lang3.StringUtils.indexOfAny("gnal$.$avaj", strArray27);
        boolean boolean32 = org.apache.commons.lang3.StringUtils.startsWithAny("44-1java.utilString[]", strArray27);
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "..." + "'", str9, "...");
        org.junit.Assert.assertNotNull(strArray10);
        org.junit.Assert.assertNotNull(strArray15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "                                   " + "'", str16, "                                   ");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertNotNull(strArray22);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "class" + "'", str23, "class");
        org.junit.Assert.assertNotNull(strArray27);
        org.junit.Assert.assertNotNull(strArray29);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "44444444444444444.4..." + "'", str30, "44444444444444444.4...");
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + (-1) + "'", int31 == (-1));
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
    }

    @Test
    public void test44280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest88.test44280");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitByCharacterType("bYTE");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray1, '$');
        java.lang.String str5 = org.apache.commons.lang3.ClassUtils.getPackageCanonicalName((java.lang.Object) strArray1, "...                                                                                                  v aaaaaaaaaaj v aaaaaaaaaaj v aaaaaaaaaaj v aaaaaaaaaaj v aaaaaaaaaaj v aaaaaaaaaaj v aaaaaaaaaaj v aaaaaaaaaaj v aaaaaaaaaaj v aaaaaaaaaaj v aaaaaaaaaaj v interf ceaj v aioaSeri liz bleA.LAVANGJAceaj v al ngaClone bleaaaaaaaj v aaaaaaaaaaj v aaaaaaaaaaj v aaaaaaaaaaj v aaaaaaaaaaj v aaaaaaaaaaj v aaaaaaaaaaj v aaaaaaaaaaj v aaaaaaaaaaj v aaaaaaaaaaj v aaaaaaaaaaj v aaaaaaaaaaj v a.L");
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "b$YTE" + "'", str3, "b$YTE");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "java.lang" + "'", str5, "java.lang");
    }

    @Test
    public void test44281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest88.test44281");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.leftPad("...yarrAtsiLyarrAtsiAAAAAAAAAAngag", 26, '#');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "...yarrAtsiLyarrAtsiAAAAAAAAAAngag" + "'", str3, "...yarrAtsiLyarrAtsiAAAAAAAAAAngag");
    }

    @Test
    public void test44282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest88.test44282");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOf("interface java.lang.Cloneable4444444444444JAVA.LANGAGNAL.AVAJGNAL..LANGGNAL.AVARRCLASSJAVA.LANG.OBJECTYLISTARRCLASSJAVA.LANG.OBJECTYLISTAinterface java.io.Serializable", 479);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test44283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest88.test44283");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.equals((java.lang.CharSequence) "Llitu", (java.lang.CharSequence) "44444444444444444444444444444444444444444444...");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test44284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest88.test44284");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.split("aAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA...AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA...AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA...AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA...AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA...AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA...AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA...AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA...AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA......");
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test44285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest88.test44285");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "444444                                                                                                                                                                                                                             aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa                                                                                                                                                                                                                             ", "NG.Llit");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test44286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest88.test44286");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("                                                                    aAAAAAAAAAAA                                  tractList$class java.util.AbstractCollection$class java.lang.Object", "                                                                                                                                      ][GNIRTSLITU.AVAJ1");
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test44287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest88.test44287");
        java.lang.String str1 = org.apache.commons.lang3.ClassUtils.getShortClassName("  e f e          o e b e          e f e      oSe     z b e  e f e          o e b eGNAL$ $AVA");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "  e f e          o e b e          e f e      oSe     z b e  e f e          o e b eGNAL. .AVA" + "'", str1, "  e f e          o e b e          e f e      oSe     z b e  e f e          o e b eGNAL. .AVA");
    }

    @Test
    public void test44288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest88.test44288");
        int int2 = org.apache.commons.lang3.StringUtils.indexOf("JLVLlaLNG                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                  ", "arahCretcarahCretcarahCretcarahCretcarahCretcarahCretcarahCretcarahCretcarahCretcarahCretcarahCretcarahCretcarahCretcarahCretcarahCretcarahCretcarahCretcarahCretcarahCretcarahCretcarahCretcarahCretcarahCretcarahCretcarahCretcarahCretcarahCretcarahCretcarahCretcarahCretcar...");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test44289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest88.test44289");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOfIgnoreCase("clssjv.lng.ClssJAVAULANGJAVAULANGJAVAULANGJAVAULANGJAVAULANGJAVAULANGJAVAULANGJAVAULANGJAVAULANGJAVAULANGJAVAULANGJAVAULANGJAVAULANGJAVAULANGJAVAULANGJAVAULANGJAVAULANGJAVAULANGJAVAULANGJAVAULANG", "$$$$$$$$$$$$$$$$$$$$$$$$$$$$", 1000);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test44290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest88.test44290");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.rightPad("ArrayListArrayListArrayListavaj.gnal                                           INTEGER                                       ", (int) (byte) 10, "j v .io.Seri liz blej v .l ng.Clone bleStringinterf ceinterf ce");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "ArrayListArrayListArrayListavaj.gnal                                           INTEGER                                       " + "'", str3, "ArrayListArrayListArrayListavaj.gnal                                           INTEGER                                       ");
    }

    @Test
    public void test44291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest88.test44291");
        java.lang.String str1 = org.apache.commons.lang3.ClassUtils.getShortCanonicalName("                                ava..........java..........java.......ARJAVAARR......java..........java..........javaj");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "javaj" + "'", str1, "javaj");
    }

    @Test
    public void test44292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest88.test44292");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.contains("character", "4444444444444                           rraylist                            rraylist                            rraylist                            rrayclass java.lang.stringarraylis");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test44293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest88.test44293");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripAccents((java.lang.CharSequence) "jvl#.#gn       ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "jvl#.#gn       " + "'", str1, "jvl#.#gn       ");
    }

    @Test
    public void test44294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest88.test44294");
        int int2 = org.apache.commons.lang3.StringUtils.countMatches("interface java.lang.Cloneable4interface java.io.Serializabl", "                   ...");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test44295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest88.test44295");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.split("                                    Jvstringnlrrylistrrylistrrylistvj", "ih");
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray2, '.');
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str8 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray2, "Javaaaaaaaaaava.lang", 153, 942);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "                                    Jvstr.ngnlrryl.strryl.strryl.stvj" + "'", str4, "                                    Jvstr.ngnlrryl.strryl.strryl.stvj");
    }

    @Test
    public void test44296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest88.test44296");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripToNull("             ");
        org.junit.Assert.assertNull(str1);
    }

    @Test
    public void test44297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest88.test44297");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.split(" LS  yL  ", "$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$#");
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test44298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest88.test44298");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAllUpperCase((java.lang.CharSequence) "                                                                                                                                                                                                                                                                  ###########################################################################################################################################gn gnal.avaj                                                                                                                                                                                                                                                                  ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test44299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest88.test44299");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$nterface java.lang.Cloneable.......java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........javainterface java.io.Serializabl", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa                                   aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", 198);
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void test44300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest88.test44300");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlpha((java.lang.CharSequence) ".........java..........java..........java..........java..........java..........java..........java...........");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test44301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest88.test44301");
        int int3 = org.apache.commons.lang3.StringUtils.indexOfIgnoreCase("L.Arr#yList", "GNAL.AVAJLANG.JAVAGNAL.AVAJLANG.J                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                          ", 651);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test44302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest88.test44302");
        java.lang.String str1 = org.apache.commons.lang3.ClassUtils.getShortClassName("aRR...AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA...AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA...AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA...AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA...AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA...AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA...AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA...AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA...AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA...");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
    }

    @Test
    public void test44303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest88.test44303");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.equalsIgnoreCase(".uti#########################################################################ava#########################################################################j", "utiljava");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test44304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest88.test44304");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("NTERFACE JAVA.LANG.cLONEABLE.......JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVAINTERFACE JAVA.IO.sERIALIZABLE");
        java.lang.String str3 = org.apache.commons.lang3.ClassUtils.getShortClassName((java.lang.Object) "NTERFACE JAVA.LANG.cLONEABLE.......JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVAINTERFACE JAVA.IO.sERIALIZABLE", "AL.AGNAAAAAAAAAAJAVAL.AGNAAAAAAAAAAJAVAL.AGNAAAAAAAAAAJAVAL.AGNAAAAAAAAAAJAVAL.AGNAAAAAAAAAAJAVAL.AGNAAAAAAAAAAJAVAL.AGNAAAAAAAAAAJAVAL.AGNAAAAAAAAAAJA                                              AAAAAAAJAVAL.AGNAAAAAAAAAAJAVAL.AGNAAAAAAAAAAJAVAL.AGNAAAAAAAAAAJAVAL.AGNAAAAAAAAAAJAVAL.AGNAAAAAAAAAAJAVAL.AGNAAAAAAAAAAJAVAL.AGNAAAAAAAAAAJAVAL.AGNAAAAAAAAAAJAVAL.AGNAAAAAAAAAAJAVAL.AGNAAAAAAAAAAJAVAL.AGNAAAAAAAAAAJAVAL.AGNAAAAAAAAAARING");
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "String" + "'", str3, "String");
    }

    @Test
    public void test44305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest88.test44305");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOf("...ss.lc gnirtS.gn.l..v.j", 217, 669);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test44306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest88.test44306");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitByCharacterType("... AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA... AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA... AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA... AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA... AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA... AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA... AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA... AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA... AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA... AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.stripAll(strArray1, "JAVA");
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.concat((java.lang.Object[]) strArray1);
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray1, "444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444JAVA.LANGaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", 28, 11);
        java.lang.String[] strArray9 = org.apache.commons.lang3.StringUtils.stripAll(strArray1);
        java.lang.String[] strArray10 = org.apache.commons.lang3.StringUtils.stripAll(strArray9);
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "... AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA... AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA... AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA... AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA... AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA... AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA... AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA... AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA... AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA... AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA" + "'", str4, "... AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA... AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA... AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA... AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA... AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA... AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA... AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA... AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA... AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA... AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(strArray9);
        org.junit.Assert.assertNotNull(strArray10);
    }

    @Test
    public void test44307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest88.test44307");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.startsWithIgnoreCase("", "                                                                                                                                                                                                                                                #########################sClassslitUgnirtSslitUgnirtSslitUgnirtSslitUgnirtSslitUgnirtSslitUgnirtSslitUgnirtSslitUgnirtSslitUgnirtSslitUgnirtS##########################                                                                                                                                                                                                                                                                                                                                                                                                                                        Serializabl                         ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test44308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest88.test44308");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripToNull("                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                javaulangrraylistjavaulangrraylistjavaulangrraylistjavaulangrraylistjavaulangrraylistjavaulangrraylistjavaulangrraylistjavaula");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "javaulangrraylistjavaulangrraylistjavaulangrraylistjavaulangrraylistjavaulangrraylistjavaulangrraylistjavaulangrraylistjavaula" + "'", str1, "javaulangrraylistjavaulangrraylistjavaulangrraylistjavaulangrraylistjavaulangrraylistjavaulangrraylistjavaulangrraylistjavaula");
    }

    @Test
    public void test44309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest88.test44309");
        java.lang.CharSequence charSequence0 = null;
        boolean boolean2 = org.apache.commons.lang3.StringUtils.equals(charSequence0, (java.lang.CharSequence) "aRRYlISTaRRYlISTaRRYlISTVJgnal.avajlang.javagnal.avajlang.javagnal.avajlang.javagnal.avajlang.javagnal.avajlang.javagnal.avajlang.javagnal.avajlang.javagnal.avajlang.javagnal.avajGNL");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test44310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest88.test44310");
        char[] charArray14 = new char[] { ' ', ' ', '#', 'a', '4', 'a' };
        int int15 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "", charArray14);
        boolean boolean16 = org.apache.commons.lang3.StringUtils.containsAny("$", charArray14);
        java.lang.String str18 = org.apache.commons.lang3.ClassUtils.getPackageCanonicalName((java.lang.Object) charArray14, "class java.lang.String");
        int int19 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "     A..ayL A.44444444444444444444444444      ", charArray14);
        boolean boolean20 = org.apache.commons.lang3.StringUtils.containsAny("NTERFACE JAVA.LANG.cLONEABLE.......JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVAINTERFACE JAVA.IO.sERIALIZABLE", charArray14);
        boolean boolean21 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA       ", charArray14);
        int int22 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "$$$$$$$$$$$$$$$$$$$$$$$$$$$$$", charArray14);
        boolean boolean23 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "                                                                                                                                                                                                                                                                              ArrayListArrayListArrayListavajagnal                                                                                                                                                                                                                                                                              ", charArray14);
        int int24 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "                         ...                  ", charArray14);
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
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
    }

    @Test
    public void test44311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest88.test44311");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.abbreviateMiddle("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "A..AYL A.44444444444444444444444444", 563);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa" + "'", str3, "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
    }

    @Test
    public void test44312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest88.test44312");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.endsWith("$$$$$$jav", "                                                                 ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test44313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest88.test44313");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.equals((java.lang.CharSequence) "4444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444", (java.lang.CharSequence) "rING-1JAVA.UTILsTRING");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test44314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest88.test44314");
        int int3 = org.apache.commons.lang3.StringUtils.lastOrdinalIndexOf("        tsiLyarrA.La.lan         ", "jAVAAAAAAAAAAVA.LANG..", 14);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test44315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest88.test44315");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringAfter("Arr...aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa...aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa...aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa...aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa...aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa...aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa...aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa...aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa...aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa.", "lvecfetnioivecfetni#elbenolCgnlvecfetnioivecfetni#elbenolCgnlvecfe");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test44316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest88.test44316");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substring("lass java.lang.Stringlass java.lang.Stringlass java.lang.Stringlass java.lang.Stringlass java.lang.Stringlass java.lang.Stringlass java.lang.StringClassslitUgnirtSslitUgnirtSslitUgnirtSslitUgnirtSslitUgnirtSslitUgnirtSslitUgnirtSslitUgnirtSslitUgnirtSslitUgnirtS", 47);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "java.lang.Stringlass java.lang.Stringlass java.lang.Stringlass java.lang.Stringlass java.lang.StringClassslitUgnirtSslitUgnirtSslitUgnirtSslitUgnirtSslitUgnirtSslitUgnirtSslitUgnirtSslitUgnirtSslitUgnirtSslitUgnirtS" + "'", str2, "java.lang.Stringlass java.lang.Stringlass java.lang.Stringlass java.lang.Stringlass java.lang.StringClassslitUgnirtSslitUgnirtSslitUgnirtSslitUgnirtSslitUgnirtSslitUgnirtSslitUgnirtSslitUgnirtSslitUgnirtSslitUgnirtS");
    }

    @Test
    public void test44317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest88.test44317");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.stripEnd("aj....avaj..........ava.........$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$", "gnalavaj.gnalavaj.gnal44444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "aj....avaj..........ava.........$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$" + "'", str2, "aj....avaj..........ava.........$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$");
    }

    @Test
    public void test44318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest88.test44318");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "                             ...aaaaaaaaaaaaaaaaaaaaaaaaaa...                              java.lang$                         ", "$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$nterface java.lang.Cloneable.......java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........javainterface java.io.Serializable");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test44319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest88.test44319");
        int int3 = org.apache.commons.lang3.StringUtils.indexOf("Arr#yList", "                                                                                                         ", 164);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test44320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest88.test44320");
        java.lang.String[] strArray5 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("ArrayLis", "", 35);
        java.lang.String[] strArray9 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("...       AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA", "tring", (int) (short) 10);
        java.lang.String str10 = org.apache.commons.lang3.StringUtils.replaceEachRepeatedly("sERIALIZABLE", strArray5, strArray9);
        java.lang.String str12 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray5, "aaaaaa...aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        java.lang.String str14 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray5, '4');
        java.lang.String[] strArray15 = org.apache.commons.lang3.StringUtils.stripAll(strArray5);
        java.lang.String[] strArray19 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("RFACE JAVALANGCLONEABLELANGGNALJAVALANGAVAJGNALJAVALANGAVAJGNALJAVALANGAVAJGNALJAVALANGAVAJGNALJAVALANGAVAJGNALJAVALANGAVAJ", "                                                                                 JAVAlLANGJ");
        java.lang.String[] strArray25 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("hi!", "java.lang", (int) '.');
        int int26 = org.apache.commons.lang3.StringUtils.indexOfAny("Short", strArray25);
        boolean boolean27 = org.apache.commons.lang3.StringUtils.startsWithAny("...                                 ", strArray25);
        java.lang.String str28 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray25);
        java.lang.String str29 = org.apache.commons.lang3.StringUtils.replaceEachRepeatedly("VA.LANGAVAJ.GNALJAVA.LANGAVAJ.GNALJAVA.LANGAVAJ.GNALJAVA.LANGAVAJ.GNALJAVA.LANGAVAJ.GNALJAV", strArray19, strArray25);
        java.lang.String str30 = org.apache.commons.lang3.StringUtils.replaceEachRepeatedly("liza.io.Seriavace jable4interfang.Clonea.lavaJ", strArray5, strArray19);
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertNotNull(strArray9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "sERIALIZABLE" + "'", str10, "sERIALIZABLE");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "ArrayLis" + "'", str12, "ArrayLis");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "ArrayLis" + "'", str14, "ArrayLis");
        org.junit.Assert.assertNotNull(strArray15);
        org.junit.Assert.assertNotNull(strArray19);
        org.junit.Assert.assertNotNull(strArray25);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + (-1) + "'", int26 == (-1));
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "hi!" + "'", str28, "hi!");
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "VA.LANGAVAJ.GNALJAVA.LANGAVAJ.GNALJAVA.LANGAVAJ.GNALJAVA.LANGAVAJ.GNALJAVA.LANGAVAJ.GNALJAV" + "'", str29, "VA.LANGAVAJ.GNALJAVA.LANGAVAJ.GNALJAVA.LANGAVAJ.GNALJAVA.LANGAVAJ.GNALJAVA.LANGAVAJ.GNALJAV");
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "liza.io.Seriavace jable4interfang.Clonea.lavaJ" + "'", str30, "liza.io.Seriavace jable4interfang.Clonea.lavaJ");
    }

    @Test
    public void test44321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest88.test44321");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.rightPad("vvayLasavvayLasajavaulainterface java.lang.Cloneable4interface java.io.SerializablevvayLasavvayLasa.", 153, ' ');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "vvayLasavvayLasajavaulainterface java.lang.Cloneable4interface java.io.SerializablevvayLasavvayLasa.                                                     " + "'", str3, "vvayLasavvayLasajavaulainterface java.lang.Cloneable4interface java.io.SerializablevvayLasavvayLasa.                                                     ");
    }

    @Test
    public void test44322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest88.test44322");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceChars("...nAAA", "classJAVA.LANGaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaULANG", "ArrayLisArrayLisArrayLisArrayLisArra.......jv..........jv..........jv..........jv..........jv..........jv..........jv..........jv..........jv..........jv..........jv..........jv..........jv..........jv..........jv..........jv..........jv..........jv..........jv..........jv..........jv..........jv..........jv..........jv..........jv..........jv..........jv..........jv..........jv..........jv..........jv..........jv..........jv..........jv.........");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "rrrniii" + "'", str3, "rrrniii");
    }

    @Test
    public void test44323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest88.test44323");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.split("aaaaaaaaaaaaaaaaaaaaaaaJAVAULANG", '$');
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test44324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest88.test44324");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAllUpperCase((java.lang.CharSequence) "AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA                   GNAL.AVAJ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test44325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest88.test44325");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.lowerCase("...nAAAAAAAAAAjaval.agnAAAAAAAAAA.....nAAAAAAAAAAjaval.agnAAAAAAAAAA.....nAAAAAAAAAAjaval.agnAAAAAAAAAA.....nAAAAAAAAAAjaval.agnAAAAAAAAAA.....nAAAAAAAAAAjaval.agnAAAAAAAAAA.....nAAAAAAAAAAjaval.agnAAAAAAAAAA.....nAAAAAAAAAAjaval.agnAAAAAAAAAA.....nAAAAAAAAAAjaval.agnAAAAAAAAAA.....nAAAAAAAAAAjaval.agnAAAAAAAAAA.....nAAAAAAAAAAjaval.agnAAAAAAAAAA.....nAAAAAAAAAAjaval.agnAAAAAAAAAA.....nAAAAAAAAAAjaval.agnAAAAAAAAAA.....nAAAAAAAAAAjaval.agnAAAAAAAAAA.....nAAAAAAAAAAjaval.agnAAAAAAAAAA.....nAAAAAAAAAAjaval.agnAAAAAAAAAA.....nAAAAAAAAAAjaval.agnAAAAAAAAAA.....nAAAAAAAAAAjaval.agnAAAAAAAAAA.....nAAAAAAAAAAjaval.agnAAAAAAAAAA.....nAAAAAAAAAAjaval.agnAAAAAAAAAA.....nAAAAAAAAAAjaval.agnAAAAAAAAAA.....nAAAAAAAAAAjaval.agnAAAAAAAAAA.....nAAAAAAAAAAjaval.agnAAAAAAAAAA....                                                                       JAVAsTRI");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "...naaaaaaaaaajaval.agnaaaaaaaaaa.....naaaaaaaaaajaval.agnaaaaaaaaaa.....naaaaaaaaaajaval.agnaaaaaaaaaa.....naaaaaaaaaajaval.agnaaaaaaaaaa.....naaaaaaaaaajaval.agnaaaaaaaaaa.....naaaaaaaaaajaval.agnaaaaaaaaaa.....naaaaaaaaaajaval.agnaaaaaaaaaa.....naaaaaaaaaajaval.agnaaaaaaaaaa.....naaaaaaaaaajaval.agnaaaaaaaaaa.....naaaaaaaaaajaval.agnaaaaaaaaaa.....naaaaaaaaaajaval.agnaaaaaaaaaa.....naaaaaaaaaajaval.agnaaaaaaaaaa.....naaaaaaaaaajaval.agnaaaaaaaaaa.....naaaaaaaaaajaval.agnaaaaaaaaaa.....naaaaaaaaaajaval.agnaaaaaaaaaa.....naaaaaaaaaajaval.agnaaaaaaaaaa.....naaaaaaaaaajaval.agnaaaaaaaaaa.....naaaaaaaaaajaval.agnaaaaaaaaaa.....naaaaaaaaaajaval.agnaaaaaaaaaa.....naaaaaaaaaajaval.agnaaaaaaaaaa.....naaaaaaaaaajaval.agnaaaaaaaaaa.....naaaaaaaaaajaval.agnaaaaaaaaaa....                                                                       javastri" + "'", str1, "...naaaaaaaaaajaval.agnaaaaaaaaaa.....naaaaaaaaaajaval.agnaaaaaaaaaa.....naaaaaaaaaajaval.agnaaaaaaaaaa.....naaaaaaaaaajaval.agnaaaaaaaaaa.....naaaaaaaaaajaval.agnaaaaaaaaaa.....naaaaaaaaaajaval.agnaaaaaaaaaa.....naaaaaaaaaajaval.agnaaaaaaaaaa.....naaaaaaaaaajaval.agnaaaaaaaaaa.....naaaaaaaaaajaval.agnaaaaaaaaaa.....naaaaaaaaaajaval.agnaaaaaaaaaa.....naaaaaaaaaajaval.agnaaaaaaaaaa.....naaaaaaaaaajaval.agnaaaaaaaaaa.....naaaaaaaaaajaval.agnaaaaaaaaaa.....naaaaaaaaaajaval.agnaaaaaaaaaa.....naaaaaaaaaajaval.agnaaaaaaaaaa.....naaaaaaaaaajaval.agnaaaaaaaaaa.....naaaaaaaaaajaval.agnaaaaaaaaaa.....naaaaaaaaaajaval.agnaaaaaaaaaa.....naaaaaaaaaajaval.agnaaaaaaaaaa.....naaaaaaaaaajaval.agnaaaaaaaaaa.....naaaaaaaaaajaval.agnaaaaaaaaaa.....naaaaaaaaaajaval.agnaaaaaaaaaa....                                                                       javastri");
    }

    @Test
    public void test44326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest88.test44326");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOf("javaulainterface java.lang.Cloneable4interface java.io.Serializable.......AyL A4444444444", (int) (short) -1, 931);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test44327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest88.test44327");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceChars("................AA..................", "ETYb", "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "................AA.................." + "'", str3, "................AA..................");
    }

    @Test
    public void test44328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest88.test44328");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlpha((java.lang.CharSequence) "aaaaaaaaaajaval.agnaaaaaaaaaajaval.agnaaaaaaaaaajaval.agnaaaaaaaaaajaval.agnaaaaaaaaaajaval.agnaaaaaaaaaajaval.agnaaaaaaaaaajaval.agnaaaaaaaaaajaval.agnaaaaaaaaaajaval.agnaaaaaaaaaajaval.agnaaaaaaaaaajaval.agnaaaaaaaaaajaval.agnaaaaaaaaaaja                                              aaaaaaajaval.agnaaaaaaaaaajaval.agnaaaaaaaaaajaval.agnaaaaaaaaaajaval.agnaaaaaaaaaajaval.agnaaaaaaaaaajaval.agnaaaaaaaaaajaval.agnaaaaaaaaaajaval.agnaaaaaaaaaajaval.agnaaaaaaaaaajaval.agnaaaaaaaaaajaval.agnaaaaaaaaaajaval.agnaaaaaaaaaarin");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test44329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest88.test44329");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.startsWith(" gnirtSString.                             ", "GNALaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaagn                                            ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test44330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest88.test44330");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("a..aylaa..aylaa..aylaa..aylaa..aylaa..aylaa..aylaa..aylaa..aylaa..aylaa..aylaa..aylaa..aylaa..aylaa..aylaa..aylaa..aylaa..aylaa..aylaa..aylaa..aylaa..aylaa..aylaa..aylaa..aylaa..aylaa..aylaa..aylaa..aylaa..aylaa..aylaa..aylaa..aylaa..aylaa..aylaa..aylaa..aylaa..aylaa..aylaa..aylaa..aylaa..aylaa..aylaa..aylaa..aylaa..aylaa..aylaa..aylaa..aylaa..aylaa..aylaa..aylaa..aylaa..aylaa..aylaa..aylaa..aylaa..aylaa..aylaa..aylaa..aylaa..aylaa..aylaa..aylaa..aylaa..aylaa..aylaa..aylaa..aylaa..aylaa..aylaa..aylaa..aylaa..aylaa..aylaa..aylaa..aylaa..aylaa..aylaa..aylaa..aylaa..aylaa..aylaa..aylaa..aylaa..aylaa..aylaa..aylaa..aylaa..aylaa..aylaa..aylaa..aylaa..aylaa..aylaa..aylaa..aylaa..aylaa..aylaa..aylaa..aylaa..aylaa..aylaa..aylaa..ayl", "INTERFACEJAVA.LANG.CLONEABLESTRINGINTERFACEJAVA");
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test44331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest88.test44331");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.startsWith("", "aaaaaaaaaaJAVAL.AGNaaaaaaaaaaJAVAL.AGNaaaaaaaaaaJAVAL.AGNaaaaaaaaaaJAVAL.AGNaaaaaaaaaaJAVAL.AGNaaaaaaaaaaJAVAL.AGNaaaaaaaaaaJAVAL.AGNaaaaaaaaaaJAVAL.AGNaaaaaaaaaaJAVAL.AGNaaaaaaaaaaJAVAL.AGNaaaaaaaaaaJAVAL.AGNaaaaaaaaaaJAVAL.AGNaaaaaaaaaaJAVAL.AGNaaaaaaaaaaJAVAL.AGNaaaaaaaaaaJAVAL.AGNaaaaaaaaaaJAVAL.AGNaaaaaaaaaaJAVAL.AGNaaaaaaaaaaJAVAL.AGNaaaaaaaaaaJAVAL.AGNaaaaaaaaaaJAVAL.AGNaaaaaaaaaaJAVAL.AGNaaaaaaaaaaJAVAL.AGNaaaaaaaaaaJAVAL.AGNaaaaaaaaaaJAVAL.AGNaaaaaaaaaaJAVAL.AGNaaaaaaaaaaJAVAL.AGNaaaaaaaaaaJAVAL.AGNaaaaaaaaaaJAVAL.AGNaaaaaaaaaaJAVAL.AGNaaaaaaaaaaJAVAL.AGNaaaaaaaaaaJAVAL.AGNaaaaaaaaaaJAVAL.AGNaaaaaaaaaaJAVAL.AGNaaaaaaaaaaJAVAL");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test44332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest88.test44332");
        java.lang.Class<?> wildcardClass1 = null;
        java.lang.Class[] classArray3 = new java.lang.Class[1];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray4 = (java.lang.Class<?>[]) classArray3;
        wildcardClassArray4[0] = wildcardClass1;
        java.lang.Class<?>[] wildcardClassArray7 = org.apache.commons.lang3.ClassUtils.primitivesToWrappers(wildcardClassArray4);
        java.lang.Class<?> wildcardClass8 = null;
        java.lang.Class[] classArray10 = new java.lang.Class[1];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray11 = (java.lang.Class<?>[]) classArray10;
        wildcardClassArray11[0] = wildcardClass8;
        java.lang.Class<?>[] wildcardClassArray14 = org.apache.commons.lang3.ClassUtils.primitivesToWrappers(wildcardClassArray11);
        java.lang.String[] strArray16 = new java.lang.String[] { "                                   " };
        java.lang.String str17 = org.apache.commons.lang3.StringUtils.getCommonPrefix(strArray16);
        java.lang.Class<?>[] wildcardClassArray18 = org.apache.commons.lang3.ClassUtils.toClass((java.lang.Object[]) strArray16);
        java.lang.Class<?> wildcardClass19 = null;
        java.lang.Class[] classArray21 = new java.lang.Class[1];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray22 = (java.lang.Class<?>[]) classArray21;
        wildcardClassArray22[0] = wildcardClass19;
        java.lang.Class<?>[] wildcardClassArray25 = org.apache.commons.lang3.ClassUtils.primitivesToWrappers(wildcardClassArray22);
        boolean boolean26 = org.apache.commons.lang3.ClassUtils.isAssignable(wildcardClassArray18, wildcardClassArray22);
        boolean boolean28 = org.apache.commons.lang3.ClassUtils.isAssignable(wildcardClassArray11, wildcardClassArray22, true);
        boolean boolean30 = org.apache.commons.lang3.ClassUtils.isAssignable(wildcardClassArray7, wildcardClassArray22, true);
        java.lang.String str31 = org.apache.commons.lang3.StringUtils.concatWith("$         $         $         $         $         $         $         $         $         $         $         $         $         $         $         $         $         $         $         $         $         $         $         $         $         $         $         $         $         $         $         $         $         $         $         $         ", (java.lang.Object[]) wildcardClassArray7);
        java.lang.Class<?>[] wildcardClassArray32 = org.apache.commons.lang3.ClassUtils.wrappersToPrimitives(wildcardClassArray7);
        org.junit.Assert.assertNotNull(classArray3);
        org.junit.Assert.assertNotNull(wildcardClassArray4);
        org.junit.Assert.assertNotNull(wildcardClassArray7);
        org.junit.Assert.assertNotNull(classArray10);
        org.junit.Assert.assertNotNull(wildcardClassArray11);
        org.junit.Assert.assertNotNull(wildcardClassArray14);
        org.junit.Assert.assertNotNull(strArray16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "                                   " + "'", str17, "                                   ");
        org.junit.Assert.assertNotNull(wildcardClassArray18);
        org.junit.Assert.assertNotNull(classArray21);
        org.junit.Assert.assertNotNull(wildcardClassArray22);
        org.junit.Assert.assertNotNull(wildcardClassArray25);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "" + "'", str31, "");
        org.junit.Assert.assertNotNull(wildcardClassArray32);
    }

    @Test
    public void test44333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest88.test44333");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.rightPad("ssalinterfacegaga.lang.CloneableAAAAAAAAAAgagal.agnAAAAAAAAAAgagal.agnAAAAAAAAAAgagal.agnAAAAAAAAAAgagal.agnAAAAAAAAAAgagal.agnAAAAAAAAAAgagal.agnAAAAAAAAAAgagal.agnAAAAAAAAAAgagal.agnAAAAAAAAAAgagal.agnAAAAAAAAAAgagal.agnAAAAAAAAAAgagal.agnAAAAAAAAAAgagal.agnAAAAAAAAAAgagal.agnAAAAAAAAAAgagal.agnAAAAAAAAAAgagal.agnAAAAAAAAAAgagal.agnAAAAAAAAAAgagal.agnAAAAAAAAAAgagal.agnAAAAAAAAAAgagal.agnAAAAAAAAAAgagal.agnAAAAAAAAAAgagal.agnAAAAAAAAAAgagal.agnAAAAAAAAAAgagal.agnAAAAAAAAAAgagal.agnAAAAAAAAAAgagal.agnAAAAAAAAAAgagal.agnAAAAAAAAAAgagal.agnAAAAAAAAAAgagal.agnAAAAAAAAAAgagal.agnAAAAAAAAAAgagal.agnAAAAAAAAAAgagal.agnAAAAAAAAAAgagal.agnAAAAAAAAAAgagal.agnAAAAAAAAAAgagal.agnAAAAAAAAAAgagal.agnAAAAAAAAAAringinterfacegaga.io.SerializableC", 69, "g.g.g.g.g.g.g.g.g.g.g.g.g.g.g.g.g.g.g.g.g.g.g.g.g.g.g.g.g.g.g.g.g.g.g.g.g.g.g.");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "ssalinterfacegaga.lang.CloneableAAAAAAAAAAgagal.agnAAAAAAAAAAgagal.agnAAAAAAAAAAgagal.agnAAAAAAAAAAgagal.agnAAAAAAAAAAgagal.agnAAAAAAAAAAgagal.agnAAAAAAAAAAgagal.agnAAAAAAAAAAgagal.agnAAAAAAAAAAgagal.agnAAAAAAAAAAgagal.agnAAAAAAAAAAgagal.agnAAAAAAAAAAgagal.agnAAAAAAAAAAgagal.agnAAAAAAAAAAgagal.agnAAAAAAAAAAgagal.agnAAAAAAAAAAgagal.agnAAAAAAAAAAgagal.agnAAAAAAAAAAgagal.agnAAAAAAAAAAgagal.agnAAAAAAAAAAgagal.agnAAAAAAAAAAgagal.agnAAAAAAAAAAgagal.agnAAAAAAAAAAgagal.agnAAAAAAAAAAgagal.agnAAAAAAAAAAgagal.agnAAAAAAAAAAgagal.agnAAAAAAAAAAgagal.agnAAAAAAAAAAgagal.agnAAAAAAAAAAgagal.agnAAAAAAAAAAgagal.agnAAAAAAAAAAgagal.agnAAAAAAAAAAgagal.agnAAAAAAAAAAgagal.agnAAAAAAAAAAgagal.agnAAAAAAAAAAgagal.agnAAAAAAAAAAringinterfacegaga.io.SerializableC" + "'", str3, "ssalinterfacegaga.lang.CloneableAAAAAAAAAAgagal.agnAAAAAAAAAAgagal.agnAAAAAAAAAAgagal.agnAAAAAAAAAAgagal.agnAAAAAAAAAAgagal.agnAAAAAAAAAAgagal.agnAAAAAAAAAAgagal.agnAAAAAAAAAAgagal.agnAAAAAAAAAAgagal.agnAAAAAAAAAAgagal.agnAAAAAAAAAAgagal.agnAAAAAAAAAAgagal.agnAAAAAAAAAAgagal.agnAAAAAAAAAAgagal.agnAAAAAAAAAAgagal.agnAAAAAAAAAAgagal.agnAAAAAAAAAAgagal.agnAAAAAAAAAAgagal.agnAAAAAAAAAAgagal.agnAAAAAAAAAAgagal.agnAAAAAAAAAAgagal.agnAAAAAAAAAAgagal.agnAAAAAAAAAAgagal.agnAAAAAAAAAAgagal.agnAAAAAAAAAAgagal.agnAAAAAAAAAAgagal.agnAAAAAAAAAAgagal.agnAAAAAAAAAAgagal.agnAAAAAAAAAAgagal.agnAAAAAAAAAAgagal.agnAAAAAAAAAAgagal.agnAAAAAAAAAAgagal.agnAAAAAAAAAAgagal.agnAAAAAAAAAAgagal.agnAAAAAAAAAAgagal.agnAAAAAAAAAAringinterfacegaga.io.SerializableC");
    }

    @Test
    public void test44334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest88.test44334");
        java.lang.String str1 = org.apache.commons.lang3.ClassUtils.getShortClassName("aaaaa.............................................................lang                                                                                    aaaaa");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "lang                                                                                    aaaaa" + "'", str1, "lang                                                                                    aaaaa");
    }

    @Test
    public void test44335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest88.test44335");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.left("NTERFACE JAVA.LANG.cLONEABLE.......JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVAINTERFACE JAVA.IO.sERIALIZABLE", 59);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "NTERFACE JAVA.LANG.cLONEABLE.......JAVA..........JAVA......" + "'", str2, "NTERFACE JAVA.LANG.cLONEABLE.......JAVA..........JAVA......");
    }

    @Test
    public void test44336() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest88.test44336");
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.split("..", "");
        int int5 = org.apache.commons.lang3.StringUtils.lastIndexOfAny("##########", strArray4);
        java.lang.String[] strArray9 = org.apache.commons.lang3.StringUtils.split("..", "$       ", 3);
        java.lang.String str13 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray9, "", (int) (byte) 10, (int) (short) -1);
        java.lang.String[] strArray14 = org.apache.commons.lang3.StringUtils.stripAll(strArray9);
        java.lang.String str15 = org.apache.commons.lang3.StringUtils.replaceEach("AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA", strArray4, strArray14);
        java.lang.String str16 = org.apache.commons.lang3.StringUtils.getCommonPrefix(strArray14);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertNotNull(strArray9);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNotNull(strArray14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA" + "'", str15, "AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + ".." + "'", str16, "..");
    }

    @Test
    public void test44337() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest88.test44337");
        java.util.Locale locale1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.apache.commons.lang3.StringUtils.lowerCase(".........................................................................................................................................................................$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$Gnal$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$.................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$Gnal$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$", locale1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test44338() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest88.test44338");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.chomp("                                                             AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "                                                             AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA" + "'", str1, "                                                             AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA");
    }

    @Test
    public void test44339() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest88.test44339");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAllLowerCase((java.lang.CharSequence) "                                                                                                                                                                                                                                               $.$vj                                                                                                                                                                                                                                               ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test44340() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest88.test44340");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.contains("#########################################################################java.uti#########################################################################", "interface java.lang.Cloneable...    $         $         $         $         $      -1JAVA.UTILsTRING-1JAVA.UTILsTRINGinterface java.io.Serializable");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test44341() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest88.test44341");
        int int2 = org.apache.commons.lang3.StringUtils.countMatches("JAVA.LANG                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                    ", "GNAL.AL.ARRAYLIST");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test44342() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest88.test44342");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("GNALUaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaGNAL.AVAJssalC", " gnirtS");
        java.lang.Class<?>[] wildcardClassArray3 = org.apache.commons.lang3.ClassUtils.toClass((java.lang.Object[]) strArray2);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertNotNull(wildcardClassArray3);
    }

    @Test
    public void test44343() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest88.test44343");
        int int3 = org.apache.commons.lang3.StringUtils.ordinalIndexOf("...AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA...1AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA...1AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA...1AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA...1AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA...1AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA...1AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAJava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava", "CLASS JAVALANGCLASS                       JAVAULANG                       JAVAULANG                       JAVAULANG                       JAVAULANG                       JAVAULANG                       JAVAULANG                       JAVAULANG                       JAVAULANG                       JAVAULANG                       JAVAULANG                       JAVAULANG                       JAVAULANG                       JAVAULANG                       JAVAULANG                       JAVAULANG                       JAVAULANG                       JAVAULANG                       JAVAULANG                       JAVAULANG                       JAVAULANG        ", 108);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test44344() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest88.test44344");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.leftPad("A avaj ssalc.gnal.avaa aaalsrrA avaj ssalc.gnal.avaa aaalsrrAva.langGNAa..langaava.langAGNAa.AVAJA avaj ssalc.gnal.avaa aaalsrrA avaj ssalc.gnal.avaa aaalsrrAva.langGNAa..langaava.langAGNAa.AVAJA avaj ssalc.gnal.avaa aaalsrrA avaj ssalc.gnal.avaa aaalsrrAva.langGNAa..langaava.langAGNAa.AVAJA avaj ssalc.gnal.avaa aaalsrrA avaj ssaS rvngA avaj ssalc.gnal.avaa aaalsrrA avaj ssalc.gnal.avaa aaalsrrAva.langGNAa..langaava.langAGNAa.AVAJA avaj ssalc.gnaaaaaa...", 737, "     ##################################################java.uti#########################################################################");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "     ##################################################java.uti#########################################################################     ##################################################java.uti#########################################################################     ##A avaj ssalc.gnal.avaa aaalsrrA avaj ssalc.gnal.avaa aaalsrrAva.langGNAa..langaava.langAGNAa.AVAJA avaj ssalc.gnal.avaa aaalsrrA avaj ssalc.gnal.avaa aaalsrrAva.langGNAa..langaava.langAGNAa.AVAJA avaj ssalc.gnal.avaa aaalsrrA avaj ssalc.gnal.avaa aaalsrrAva.langGNAa..langaava.langAGNAa.AVAJA avaj ssalc.gnal.avaa aaalsrrA avaj ssaS rvngA avaj ssalc.gnal.avaa aaalsrrA avaj ssalc.gnal.avaa aaalsrrAva.langGNAa..langaava.langAGNAa.AVAJA avaj ssalc.gnaaaaaa..." + "'", str3, "     ##################################################java.uti#########################################################################     ##################################################java.uti#########################################################################     ##A avaj ssalc.gnal.avaa aaalsrrA avaj ssalc.gnal.avaa aaalsrrAva.langGNAa..langaava.langAGNAa.AVAJA avaj ssalc.gnal.avaa aaalsrrA avaj ssalc.gnal.avaa aaalsrrAva.langGNAa..langaava.langAGNAa.AVAJA avaj ssalc.gnal.avaa aaalsrrA avaj ssalc.gnal.avaa aaalsrrAva.langGNAa..langaava.langAGNAa.AVAJA avaj ssalc.gnal.avaa aaalsrrA avaj ssaS rvngA avaj ssalc.gnal.avaa aaalsrrA avaj ssalc.gnal.avaa aaalsrrAva.langGNAa..langaava.langAGNAa.AVAJA avaj ssalc.gnaaaaaa...");
    }

    @Test
    public void test44345() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest88.test44345");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.defaultString("aaaag.aaaa", "JAVAlLANG");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "aaaag.aaaa" + "'", str2, "aaaag.aaaa");
    }

    @Test
    public void test44346() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest88.test44346");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.center("SERIALIZABLE", 55);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                     SERIALIZABLE                      " + "'", str2, "                     SERIALIZABLE                      ");
    }

    @Test
    public void test44347() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest88.test44347");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                              IOINTERFACEJAVAIN", "AVAJ.GNALAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA CharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterChara");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test44348() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest88.test44348");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.leftPad("AVAJ.GNALNaaaaaaaaaaJAVAL.AGNaaaaaaaaaaJAVAL.AGNaaaaaaaaaaJAVAL.AGNaaaaaaaaaaJAVAL.AGNaaaaaaaaaaJAVAL.AGNaaaaaaaaaaJAVAL.AGNaaaaaaaaaaJAVAL.AGNaaaaaaaaaaJAVAL.AGNaaaaaaaaaaJAVAL.AGNaaaaaaaaaaJAVAL.AGNaaaaaaaaaaJAVAL.AGNaaaaaaaaaaJAVAL.AGNaaaaaaaaaaJAVAL.AGNaaaaaaaaaaJAVAL.AGNaaaaaaaaaaJAVAL.AGNaaaaaaaaaaJAVAL.AGNaaaaaaaaaaJAVAL.AGNaaaaaaaaaaJAVAL.AGNaaaaaaaaaaJAVAL.AGNaaaaaaaaaaJAVAL.AGNaaaaaaaaaaJAVAL.AGNaaaaaaaaaaJAVAL.AGNaaaaaaaaaaJAVAL.AGNaaaaaaaaaaJAVAL.AGNaaaaaaaaaaJAVAL.AGNaaaaaaaaaaJAVAL.AGNaaaaaaaaaaJAVAL.AGNaaaaaaaaaaJAVAL.AGNaaaaaaaaaaJAVAL.AGNaaaaaaaaaaJAVAL.AGNaaaaaaaaaaJAVAL.AGNaaaaaaaaaaJAVAL.AGNaaaaaaaaaaJAVAL.AGNaaaaaaaaaaJAVAL", 210);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "AVAJ.GNALNaaaaaaaaaaJAVAL.AGNaaaaaaaaaaJAVAL.AGNaaaaaaaaaaJAVAL.AGNaaaaaaaaaaJAVAL.AGNaaaaaaaaaaJAVAL.AGNaaaaaaaaaaJAVAL.AGNaaaaaaaaaaJAVAL.AGNaaaaaaaaaaJAVAL.AGNaaaaaaaaaaJAVAL.AGNaaaaaaaaaaJAVAL.AGNaaaaaaaaaaJAVAL.AGNaaaaaaaaaaJAVAL.AGNaaaaaaaaaaJAVAL.AGNaaaaaaaaaaJAVAL.AGNaaaaaaaaaaJAVAL.AGNaaaaaaaaaaJAVAL.AGNaaaaaaaaaaJAVAL.AGNaaaaaaaaaaJAVAL.AGNaaaaaaaaaaJAVAL.AGNaaaaaaaaaaJAVAL.AGNaaaaaaaaaaJAVAL.AGNaaaaaaaaaaJAVAL.AGNaaaaaaaaaaJAVAL.AGNaaaaaaaaaaJAVAL.AGNaaaaaaaaaaJAVAL.AGNaaaaaaaaaaJAVAL.AGNaaaaaaaaaaJAVAL.AGNaaaaaaaaaaJAVAL.AGNaaaaaaaaaaJAVAL.AGNaaaaaaaaaaJAVAL.AGNaaaaaaaaaaJAVAL.AGNaaaaaaaaaaJAVAL.AGNaaaaaaaaaaJAVAL.AGNaaaaaaaaaaJAVAL" + "'", str2, "AVAJ.GNALNaaaaaaaaaaJAVAL.AGNaaaaaaaaaaJAVAL.AGNaaaaaaaaaaJAVAL.AGNaaaaaaaaaaJAVAL.AGNaaaaaaaaaaJAVAL.AGNaaaaaaaaaaJAVAL.AGNaaaaaaaaaaJAVAL.AGNaaaaaaaaaaJAVAL.AGNaaaaaaaaaaJAVAL.AGNaaaaaaaaaaJAVAL.AGNaaaaaaaaaaJAVAL.AGNaaaaaaaaaaJAVAL.AGNaaaaaaaaaaJAVAL.AGNaaaaaaaaaaJAVAL.AGNaaaaaaaaaaJAVAL.AGNaaaaaaaaaaJAVAL.AGNaaaaaaaaaaJAVAL.AGNaaaaaaaaaaJAVAL.AGNaaaaaaaaaaJAVAL.AGNaaaaaaaaaaJAVAL.AGNaaaaaaaaaaJAVAL.AGNaaaaaaaaaaJAVAL.AGNaaaaaaaaaaJAVAL.AGNaaaaaaaaaaJAVAL.AGNaaaaaaaaaaJAVAL.AGNaaaaaaaaaaJAVAL.AGNaaaaaaaaaaJAVAL.AGNaaaaaaaaaaJAVAL.AGNaaaaaaaaaaJAVAL.AGNaaaaaaaaaaJAVAL.AGNaaaaaaaaaaJAVAL.AGNaaaaaaaaaaJAVAL.AGNaaaaaaaaaaJAVAL.AGNaaaaaaaaaaJAVAL");
    }

    @Test
    public void test44349() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest88.test44349");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.substringsBetween("                                                                                                                                                                                                                                                                                                                                                                            44444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444rrayList44444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaava.langjava.langjava.lang... .... .java.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.lang... .... ", "           ");
        org.junit.Assert.assertNull(strArray3);
    }

    @Test
    public void test44350() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest88.test44350");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfIgnoreCase("JA", "                       javaulangrraylist");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test44351() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest88.test44351");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.endsWith("NAELOOB                                                                                                                                                                                                                                                                                                                                                                                                                                                                                        ", "lANGgnalgnalgnalgnalg...gjavaulangjavaulangjavaulangjavaulangjavaulangjavaulangjavaulangjavaulangjavaulangjavaulangnalgnalgnalgnalgnalgn");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test44352() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest88.test44352");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.reverseDelimited("class j...", ' ');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "j... class" + "'", str2, "j... class");
    }

    @Test
    public void test44353() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest88.test44353");
        int int3 = org.apache.commons.lang3.StringUtils.ordinalIndexOf("444444444444444444444rA4444444444444444444444...                                              ", "arahCretcarahCretcarahCretcarahCretcarahCretcarahCretcarahCretcarahCretcarahCretcarahCretcarahCretcarahCretcarahCretcarahCretcarahCretcarahCretcarahCretcarahCretcarahCretcarahCretcarahCretcarahCretcarahCretcarahCretcarahCretcarahCretcarahCretcarahCretcarahCretcarahCretcar...", 68);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test44354() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest88.test44354");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("                                 ...", "Javaaaaaaaaaava.langava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.lan           ", (int) (short) 0);
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void test44355() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest88.test44355");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.rightPad("JAVAULANGLituLlituLlituLlituLlituLlituLlituLlituLlituLlituLlituLlituLlituLlituLlituLlituLlituLlituLlituLlitu", 446);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "JAVAULANGLituLlituLlituLlituLlituLlituLlituLlituLlituLlituLlituLlituLlituLlituLlituLlituLlituLlituLlituLlitu                                                                                                                                                                                                                                                                                                                                                  " + "'", str2, "JAVAULANGLituLlituLlituLlituLlituLlituLlituLlituLlituLlituLlituLlituLlituLlituLlituLlituLlituLlituLlituLlitu                                                                                                                                                                                                                                                                                                                                                  ");
    }

    @Test
    public void test44356() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest88.test44356");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("BOOLEAN", "L.Arr yList");
        java.lang.String[] strArray5 = org.apache.commons.lang3.StringUtils.stripAll(strArray3, "gnalarraylistarraylistarrayli");
        java.lang.String[] strArray7 = org.apache.commons.lang3.StringUtils.stripAll(strArray5, "...      ");
        java.lang.String[] strArray10 = org.apache.commons.lang3.StringUtils.split("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "...####java.uti###############################..");
        java.lang.String str11 = org.apache.commons.lang3.StringUtils.replaceEach("O.gnal.avaj ssalcr4444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444..........", strArray7, strArray10);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertNotNull(strArray10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "O.gnal.avaj ssalcr4444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444.........." + "'", str11, "O.gnal.avaj ssalcr4444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444..........");
    }

    @Test
    public void test44357() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest88.test44357");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.capitalize((java.lang.CharSequence) "444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444litu                                             ...                                                    AvAAlitu                                             ...                                                    AvAA");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444litu                                             ...                                                    AvAAlitu                                             ...                                                    AvAA" + "'", str1, "444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444litu                                             ...                                                    AvAAlitu                                             ...                                                    AvAA");
    }

    @Test
    public void test44358() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest88.test44358");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.center("interface#java.lang.Cloneable4interface#java.io.Serializableinterface#java.lSE...               ...", 81, '#');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "interface#java.lang.Cloneable4interface#java.io.Serializableinterface#java.lSE...               ..." + "'", str3, "interface#java.lang.Cloneable4interface#java.io.Serializableinterface#java.lSE...               ...");
    }

    @Test
    public void test44359() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest88.test44359");
        java.lang.ClassLoader classLoader0 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass2 = org.apache.commons.lang3.ClassUtils.getClass(classLoader0, "                                                                                                                                                                                                                                                     44444444444444444444444444444444444444444444444444aaaaaaaaaa...");
            org.junit.Assert.fail("Expected exception of type java.lang.ClassNotFoundException; message: 44444444444444444444444444444444444444444444444444aaaaaaaaaa///");
        } catch (java.lang.ClassNotFoundException e) {
            // Expected exception.
        }
    }

    @Test
    public void test44360() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest88.test44360");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.defaultIfEmpty("                                                                                                                                                                                                                                             HI!aRRAYlISTaRRAYlISTaRRAYlISTAVAJ.GNALaRRAYlISTaRRAYlISTaRRAYlIST", "lvj.gnl");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                                                                                                                                                                                                                             HI!aRRAYlISTaRRAYlISTaRRAYlISTAVAJ.GNALaRRAYlISTaRRAYlISTaRRAYlIST" + "'", str2, "                                                                                                                                                                                                                                             HI!aRRAYlISTaRRAYlISTaRRAYlISTAVAJ.GNALaRRAYlISTaRRAYlISTaRRAYlIST");
    }

    @Test
    public void test44361() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest88.test44361");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.strip("Java.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjavaJava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjavaJava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjavaJava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjavaJava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjavaJava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjavaJava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjavaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                     ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Java.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjavaJava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjavaJava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjavaJava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjavaJava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjavaJava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjavaJava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjavaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa" + "'", str2, "Java.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjavaJava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjavaJava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjavaJava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjavaJava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjavaJava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjavaJava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjavaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
    }

    @Test
    public void test44362() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest88.test44362");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeStart("-1jvJAVATSILYARRATSILYARRATSILYARRA", "iyL A    ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "-1jvJAVATSILYARRATSILYARRATSILYARRA" + "'", str2, "-1jvJAVATSILYARRATSILYARRATSILYARRA");
    }

    @Test
    public void test44363() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest88.test44363");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("gnal..Array..List..Array..List..Array..L", 'a');
        int int4 = org.apache.commons.lang3.StringUtils.indexOfAny("                                                                                                                                                                ", strArray3);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
    }

    @Test
    public void test44364() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest88.test44364");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.rightPad("A..iyL ziirSoifri.oCfriCLASS JAVALANGCLASS                       JAVAULANG                       JAVAULANG                       JAVAULANG                       JAVAULANG                       JAVAULANG                       JAVAULANG                       JAVAULANG                       JAVAULANG                       JAVAULANG                       JAVAULANG                       JAVAULANG                       JAVAULANG                       JAVAULANG                       JAVAULANG                       JAVAULANG                       JAVAULANG                       JAVAULANG                       JAVAULANG                       JAVAULANG                       JAVAULANGCLASS JAVALANGCLASS                       JAVAULANG                       JAVAULANG                       JAVAULANG                       JAVAULANG                       JAVAULANG                       JAVAULANG                       JAVAU", 71);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "A..iyL ziirSoifri.oCfriCLASS JAVALANGCLASS                       JAVAULANG                       JAVAULANG                       JAVAULANG                       JAVAULANG                       JAVAULANG                       JAVAULANG                       JAVAULANG                       JAVAULANG                       JAVAULANG                       JAVAULANG                       JAVAULANG                       JAVAULANG                       JAVAULANG                       JAVAULANG                       JAVAULANG                       JAVAULANG                       JAVAULANG                       JAVAULANG                       JAVAULANG                       JAVAULANGCLASS JAVALANGCLASS                       JAVAULANG                       JAVAULANG                       JAVAULANG                       JAVAULANG                       JAVAULANG                       JAVAULANG                       JAVAU" + "'", str2, "A..iyL ziirSoifri.oCfriCLASS JAVALANGCLASS                       JAVAULANG                       JAVAULANG                       JAVAULANG                       JAVAULANG                       JAVAULANG                       JAVAULANG                       JAVAULANG                       JAVAULANG                       JAVAULANG                       JAVAULANG                       JAVAULANG                       JAVAULANG                       JAVAULANG                       JAVAULANG                       JAVAULANG                       JAVAULANG                       JAVAULANG                       JAVAULANG                       JAVAULANG                       JAVAULANGCLASS JAVALANGCLASS                       JAVAULANG                       JAVAULANG                       JAVAULANG                       JAVAULANG                       JAVAULANG                       JAVAULANG                       JAVAU");
    }

    @Test
    public void test44365() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest88.test44365");
        java.lang.String str1 = org.apache.commons.lang3.ClassUtils.getShortClassName("rrayLi");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "rrayLi" + "'", str1, "rrayLi");
    }

    @Test
    public void test44366() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest88.test44366");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBefore("...VA.LANGAVAJ.GNALJAVA.LANGAVAJ.GNALJAVA.LANGAVAJ.GNALJAVA.LANGAVAJ.GNALJAVA.LANGAVAJ.GNALJAVA.LANGgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalg", "44444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444AVALITU.");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "...VA.LANGAVAJ.GNALJAVA.LANGAVAJ.GNALJAVA.LANGAVAJ.GNALJAVA.LANGAVAJ.GNALJAVA.LANGAVAJ.GNALJAVA.LANGgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalg" + "'", str2, "...VA.LANGAVAJ.GNALJAVA.LANGAVAJ.GNALJAVA.LANGAVAJ.GNALJAVA.LANGAVAJ.GNALJAVA.LANGAVAJ.GNALJAVA.LANGgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalg");
    }

    @Test
    public void test44367() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest88.test44367");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfAnyBut("loneable#interfacaaaaaaa$aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                      LC.GNAL.AVAJ ECAFRETNIELBAZILAIRES.OI.AVAJ ECAFRETNI$ELBAENOLC.GNAL.AVAJ ECAFRETNIELBAZILAIRES.OI.AVAJ ECAFRETNI$ELBAENOLC.GNAL.AVAJ ECAFRETNI$GNAL.AVAJ");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test44368() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest88.test44368");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("$######################################################################", '$');
        java.lang.String[] strArray6 = org.apache.commons.lang3.StringUtils.split("JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JA...", '4');
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str7 = org.apache.commons.lang3.StringUtils.replaceEach("jAVAJAVAsTRINjAVAJAVAsTRINjAVAJAVAsT", strArray3, strArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Search and Replace array lengths don't match: 2 vs 1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertNotNull(strArray6);
    }

    @Test
    public void test44369() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest88.test44369");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAsciiPrintable((java.lang.CharSequence) "########################################################################################################################################################################################################################################################################################################################################################################################################################################interface java.lang.Cloneable.......java.......Objectava..........javainterface java.io########################################################################################################################################################################################################################################################################################################################################################################################################################################");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test44370() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest88.test44370");
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("avaj.gnal", "$       ");
        java.lang.String[] strArray8 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("...", 'a');
        java.lang.String[] strArray11 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("$", "                                   ");
        java.lang.String str12 = org.apache.commons.lang3.StringUtils.replaceEachRepeatedly("...       ", strArray8, strArray11);
        java.lang.String str13 = org.apache.commons.lang3.StringUtils.replaceEachRepeatedly("                                              ", strArray4, strArray11);
        java.lang.String str14 = org.apache.commons.lang3.StringUtils.getCommonPrefix(strArray4);
        boolean boolean15 = org.apache.commons.lang3.StringUtils.endsWithAny("ArrayListArrayListArrayListavajGNAL.AVAJLANG.JAVAGNAL.AVAJLANG.JAVAGNAL.AVAJLANG.JAVAGNAL.AVAJLANG.JAVAGNAL.AVAJLANG.JAVAGNAL.AVAJLANG.JAVAGNAL.AVAJLANG.JAVAGNAL.AVAJLANG.JAVAGNAL.AVAJgnal", strArray4);
        java.lang.Class<?>[] wildcardClassArray16 = org.apache.commons.lang3.ClassUtils.toClass((java.lang.Object[]) strArray4);
        java.lang.Class<?>[] wildcardClassArray17 = null;
        boolean boolean19 = org.apache.commons.lang3.ClassUtils.isAssignable(wildcardClassArray16, wildcardClassArray17, true);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "$       " + "'", str12, "$       ");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "                                              " + "'", str13, "                                              ");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "avaj.gnal" + "'", str14, "avaj.gnal");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(wildcardClassArray16);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test44371() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest88.test44371");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBeforeLast("444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444litu.avajlitu.avajArrayListArrayListArrayListavajGNAL.AVAJLANG.JAVAGNAL.AVAJLANG.JAVAGNAL.AVAJLANG.JAVAGNAL.AVAJLANG.JAVAGNAL.AVAJLANG.JAVAGNAL.AVAJLANG.JAVAGNAL.AVAJLANG.JAVAGNAL.AVAJLANG.JAVAGNAL.AVAJgnalArrayListArrayListArrayListavajGNAL.AVAJLANG.JAVAGNAL.AVAJLANG.JAVAGNAL.AVAJLANG.JAVAGNAL.AVAJLANG.JAVAGNAL.AVAJLANG.JAVAGNAL.AVAJLANG.JAVAGNAL.AVAJLANG.JAVAGNAL.AVAJLANG.JAVAGNAL.AVAJgnalArrayListArrayListArrayListavajGNAL.AVAJLANG.JAVAGNAL.AVAJLANG.JAVAGNAL.AVAJLANG.JAVAGNAL.AVAJLANG.JAVAGNAL.AVAJLANG.JAVAGNAL.AVAJLANG.JAVAGNAL.AVAJLANG.JAVAGNAL.AVAJLANG.JAVAGNAL.AVAJgnalArrayListArrayListArrayListavajGNAL.AVAJLANG.JAVAGNAL.AVAJLANG.JAVAGNAL.AVAJLANG.JAVAGNAL.AVAJLANG.JAVAGNAL.AVAJLANG.JAVAGNAL.AVAJLANG.JAVAGNAL.AVAJLANG.JAVAGNAL.AVAJLANG.JAVAGNAL.AVAJgnalArrayListArrayListArrayListavaj", "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444litu.avajlitu.avajArrayListArrayListArrayListavajGNAL.AVAJLANG.JAVAGNAL.AVAJLANG.JAVAGNAL.AVAJLANG.JAVAGNAL.AVAJLANG.JAVAGNAL.AVAJLANG.JAVAGNAL.AVAJLANG.JAVAGNAL.AVAJLANG.JAVAGNAL.AVAJLANG.JAVAGNAL.AVAJgnalArrayListArrayListArrayListavajGNAL.AVAJLANG.JAVAGNAL.AVAJLANG.JAVAGNAL.AVAJLANG.JAVAGNAL.AVAJLANG.JAVAGNAL.AVAJLANG.JAVAGNAL.AVAJLANG.JAVAGNAL.AVAJLANG.JAVAGNAL.AVAJLANG.JAVAGNAL.AVAJgnalArrayListArrayListArrayListavajGNAL.AVAJLANG.JAVAGNAL.AVAJLANG.JAVAGNAL.AVAJLANG.JAVAGNAL.AVAJLANG.JAVAGNAL.AVAJLANG.JAVAGNAL.AVAJLANG.JAVAGNAL.AVAJLANG.JAVAGNAL.AVAJLANG.JAVAGNAL.AVAJgnalArrayListArrayListArrayListavajGNAL.AVAJLANG.JAVAGNAL.AVAJLANG.JAVAGNAL.AVAJLANG.JAVAGNAL.AVAJLANG.JAVAGNAL.AVAJLANG.JAVAGNAL.AVAJLANG.JAVAGNAL.AVAJLANG.JAVAGNAL.AVAJLANG.JAVAGNAL.AVAJgnalArrayListArrayListArrayListavaj" + "'", str2, "444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444litu.avajlitu.avajArrayListArrayListArrayListavajGNAL.AVAJLANG.JAVAGNAL.AVAJLANG.JAVAGNAL.AVAJLANG.JAVAGNAL.AVAJLANG.JAVAGNAL.AVAJLANG.JAVAGNAL.AVAJLANG.JAVAGNAL.AVAJLANG.JAVAGNAL.AVAJLANG.JAVAGNAL.AVAJgnalArrayListArrayListArrayListavajGNAL.AVAJLANG.JAVAGNAL.AVAJLANG.JAVAGNAL.AVAJLANG.JAVAGNAL.AVAJLANG.JAVAGNAL.AVAJLANG.JAVAGNAL.AVAJLANG.JAVAGNAL.AVAJLANG.JAVAGNAL.AVAJLANG.JAVAGNAL.AVAJgnalArrayListArrayListArrayListavajGNAL.AVAJLANG.JAVAGNAL.AVAJLANG.JAVAGNAL.AVAJLANG.JAVAGNAL.AVAJLANG.JAVAGNAL.AVAJLANG.JAVAGNAL.AVAJLANG.JAVAGNAL.AVAJLANG.JAVAGNAL.AVAJLANG.JAVAGNAL.AVAJgnalArrayListArrayListArrayListavajGNAL.AVAJLANG.JAVAGNAL.AVAJLANG.JAVAGNAL.AVAJLANG.JAVAGNAL.AVAJLANG.JAVAGNAL.AVAJLANG.JAVAGNAL.AVAJLANG.JAVAGNAL.AVAJLANG.JAVAGNAL.AVAJLANG.JAVAGNAL.AVAJgnalArrayListArrayListArrayListavaj");
    }

    @Test
    public void test44372() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest88.test44372");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeEndIgnoreCase("J#avaaaaaaaaaava#.#langava#.#langjava#.#langjava#.#langjava#.#langjava#.#langjava#.#langjava#.#langjava#.#langjava#.#langjava#.#langjava#.#langjava#.#langjava#.#langjava#.#langjava#.#la", "g.g.g.g.g.g.g.g.g.g.g.g.g.g.g.g.g.g.g.g.g.g.g.g.g.g.g.g.g.g.g.g.g.g.g.g.g.g.g.");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "J#avaaaaaaaaaava#.#langava#.#langjava#.#langjava#.#langjava#.#langjava#.#langjava#.#langjava#.#langjava#.#langjava#.#langjava#.#langjava#.#langjava#.#langjava#.#langjava#.#langjava#.#la" + "'", str2, "J#avaaaaaaaaaava#.#langava#.#langjava#.#langjava#.#langjava#.#langjava#.#langjava#.#langjava#.#langjava#.#langjava#.#langjava#.#langjava#.#langjava#.#langjava#.#langjava#.#langjava#.#la");
    }

    @Test
    public void test44373() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest88.test44373");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substring("interface java.lang.CloneableJvstringnlrrylistrrylistrryliJAVA..........JAVA..........JAVA...Jvstringnlrrylistrrylistrryliinterface java.io.Serializable", 104);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "rylistrrylistrryliinterface java.io.Serializable" + "'", str2, "rylistrrylistrryliinterface java.io.Serializable");
    }

    @Test
    public void test44374() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest88.test44374");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.split("...                                                      assJAVA.LANGa                                                     Cl", "irfCo#irfioSriiz", 55);
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void test44375() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest88.test44375");
        java.lang.String[] strArray2 = new java.lang.String[] { "                                   " };
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.getCommonPrefix(strArray2);
        java.lang.Class<?>[] wildcardClassArray4 = org.apache.commons.lang3.ClassUtils.toClass((java.lang.Object[]) strArray2);
        java.lang.String str5 = org.apache.commons.lang3.StringUtils.concatWith("$", (java.lang.Object[]) wildcardClassArray4);
        java.lang.Class<?>[] wildcardClassArray6 = org.apache.commons.lang3.ClassUtils.wrappersToPrimitives(wildcardClassArray4);
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
        java.lang.Class<?>[] wildcardClassArray37 = org.apache.commons.lang3.ClassUtils.primitivesToWrappers(wildcardClassArray36);
        java.lang.Class<?>[] wildcardClassArray38 = org.apache.commons.lang3.ClassUtils.primitivesToWrappers(wildcardClassArray37);
        boolean boolean40 = org.apache.commons.lang3.ClassUtils.isAssignable(wildcardClassArray4, wildcardClassArray37, false);
        java.lang.String str42 = org.apache.commons.lang3.ClassUtils.getShortCanonicalName((java.lang.Object) wildcardClassArray4, ".ArrayListArrayListArrayListArrayLis");
        java.lang.Class<?>[] wildcardClassArray43 = org.apache.commons.lang3.ClassUtils.primitivesToWrappers(wildcardClassArray4);
        java.lang.Class<?>[] wildcardClassArray44 = org.apache.commons.lang3.ClassUtils.primitivesToWrappers(wildcardClassArray43);
        java.lang.String str46 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) wildcardClassArray43, '.');
        java.lang.Class<?>[] wildcardClassArray47 = org.apache.commons.lang3.ClassUtils.wrappersToPrimitives(wildcardClassArray43);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "                                   " + "'", str3, "                                   ");
        org.junit.Assert.assertNotNull(wildcardClassArray4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "class java.lang.String" + "'", str5, "class java.lang.String");
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
        org.junit.Assert.assertNotNull(wildcardClassArray37);
        org.junit.Assert.assertNotNull(wildcardClassArray38);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + true + "'", boolean40 == true);
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "Class[]" + "'", str42, "Class[]");
        org.junit.Assert.assertNotNull(wildcardClassArray43);
        org.junit.Assert.assertNotNull(wildcardClassArray44);
        org.junit.Assert.assertEquals("'" + str46 + "' != '" + "class java.lang.String" + "'", str46, "class java.lang.String");
        org.junit.Assert.assertNotNull(wildcardClassArray47);
    }

    @Test
    public void test44376() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest88.test44376");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.startsWith("rrclass javainterfacejavaalangaCloneable#interfacejavaaiointerfacejavaalangaCloneable#interfacejavaaiointerfacejavaalarrclass javal", "lass java.lang.String$ $ $ $ $ $ $ $ $ $ $ $ $ $ $ $ $ $ $ $ $ $ $ $ $ $ $ $ $ $ $ $ $ $ $ $ $ $ $ $ $ $ $ $ $ $ $ $ $ $ $ $ $ $ $ $ $ $ $ $ $ $ $ $ $ $ $ $ $ $ $ $ $ $ $ $ $ $ $ $ $ $ $ $ $ $ $ $ $ $ $ $ $ $ $ $ $ $ $ $");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test44377() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest88.test44377");
        int int3 = org.apache.commons.lang3.StringUtils.indexOf("AVAJgnalArrayListArrayListArrayListavaj##########################################################################################################################################################################################################################################################################################", 444, 477);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test44378() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest88.test44378");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOfIgnoreCase("                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                    ", "44444444444444444444444444444444444444444444444444444444444444444444444444444444 $");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test44379() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest88.test44379");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.chomp("JAVAGNAL                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                     JAVA.LANG.CLONEABLE...                                 INTERFACE JAVA.IO.SERIALIZABLE");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "JAVAGNAL                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                     JAVA.LANG.CLONEABLE...                                 INTERFACE JAVA.IO.SERIALIZABLE" + "'", str1, "JAVAGNAL                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                     JAVA.LANG.CLONEABLE...                                 INTERFACE JAVA.IO.SERIALIZABLE");
    }

    @Test
    public void test44380() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest88.test44380");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.mid("44444444444444444444444444444444444IIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIII44444444444444444444444444444444444IIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIII44444$", 974, 990);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test44381() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest88.test44381");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsAny("                                                                                          ", "....................................................................                       javaulang");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test44382() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest88.test44382");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isBlank((java.lang.CharSequence) "aaaaaaaaaa");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test44383() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest88.test44383");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("gnalArrayListArrayListArrayLi", "ArrayListArrayListArrayListavajGNAL.AVAJLANG.JAVAGNAL.AVAJLANG.JAVAGNAL.AVAJLANG.JAVAGNAL.AVAJLANG.JAVAGNAL.AVAJLANG.JAVAGNAL.AVAJLANG.JAVAGNAL.AVAJLANG.JAVAGNAL.AVAJLANG.JAVAGNAL.AVAJgnal");
        java.lang.String str6 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray2, '#', 918, 483);
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray2, '4');
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "44444444444444444444444444444" + "'", str8, "44444444444444444444444444444");
    }

    @Test
    public void test44384() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest88.test44384");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.defaultString("tavaj.gnalarraylistarraylistarrayli                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                             ", "javalituavajlituavajjavalituavajlituavajjavalituavajlituavajjavalituavajlituavajjavalituavajlituavajjavalituavajlituavajjavalituavajlituavajjavalituavajlituavajjavalituavajlituavajjavalituavajlituavajjavalituavajlituavajjavalituavajlituavajjavalituavajlituavajjavalituavajlituavajjavalituavajlituavajjavalituavajlituavajjavalituavajlituavajjavalituavajlituavajjavalituavajlituavajjavalituavajlituavajjavalituavajlituavajjavalituavajlituavajjavalituavajlituavajjavalituavajlituavajjavalituavajlituavajjavalituavajlituavajjavalituavajlituavajjavalituavajlituavajjavalituavajlituavajjavalituavajlituavajjavalituavajlituavajjavalituavajlituavajjavalituavajlituavaj");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "tavaj.gnalarraylistarraylistarrayli                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                             " + "'", str2, "tavaj.gnalarraylistarraylistarrayli                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                             ");
    }

    @Test
    public void test44385() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest88.test44385");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "JAVALANGAgngnLANGgn", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test44386() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest88.test44386");
        java.lang.String str1 = org.apache.commons.lang3.ClassUtils.getShortCanonicalName("Litulitulitulitulitul####litulitulitulitulitul");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Litulitulitulitulitul####litulitulitulitulitul" + "'", str1, "Litulitulitulitulitul####litulitulitulitulitul");
    }

    @Test
    public void test44387() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest88.test44387");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAsciiPrintable((java.lang.CharSequence) "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaajavajavajavajavajavajavajavajavajavajavajavajavajavajavajavajavajavajavajavajavajavajavajavajavajavajavajavajavajavajavajavajavajavajava");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test44388() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest88.test44388");
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
        boolean boolean26 = org.apache.commons.lang3.StringUtils.containsAny("b$YTE", charArray16);
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
    public void test44389() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest88.test44389");
        java.lang.Object[] objArray0 = null;
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.join(objArray0, "class java.lang.Class                       JAVAULANG                       JAVAULANG                       JAVAULANG                       JAVAULANG                       JAVAULANG                       JAVAULANG                       JAVAULANG                       JAVAULANG                       JAVAULANG                       JAVAULANG                       JAVAULANG                       JAVAULANG                       JAVAULANG                       JAVAULANG                       JAVAULANG                       JAVAULANG                       JAVAULANG                       JAVAULANG                       JAVAULANG                       JAVAULANG", 0, 662);
        org.junit.Assert.assertNull(str4);
    }

    @Test
    public void test44390() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest88.test44390");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeStart("GNAL$.$AVA", "-1java.utilString[]-1java.utilString[]-1java.utilString[]-1java.utilString[]-1java.utilString[]-1java.utilString[]-1java.utilString[]-1java.utilString[]-1java.utilString[]-1java.utilString[]-1gnal");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "GNAL$.$AVA" + "'", str2, "GNAL$.$AVA");
    }

    @Test
    public void test44391() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest88.test44391");
        java.lang.ClassLoader classLoader0 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass3 = org.apache.commons.lang3.ClassUtils.getClass(classLoader0, "ARR... AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA... AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA... AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA... AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA... AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA... AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA... AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA... AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA... AA...", true);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassNotFoundException; message: ARR///AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA///AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA///AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA///AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA///AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA///AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA///AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA///AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA///AA///");
        } catch (java.lang.ClassNotFoundException e) {
            // Expected exception.
        }
    }

    @Test
    public void test44392() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest88.test44392");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringAfterLast("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaajaval#.#agnaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaajaval#.#agnaaaaaaaaGnal", "ArrayListArrayListArrayListavajgnal");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test44393() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest88.test44393");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphanumericSpace((java.lang.CharSequence) "LituLlituLlituLlituLlituLlituLlituLl                                                                                                                                                                                                                                                                                                                                                                                                                                                                  aaaaaaaaaaaaaaaaaaaaaaGNL$.$VJaaaaaaaaaaaaaaaaaaaaaaa                                                                                                                                                                                                                                                                                                                                                                                                                                                                   ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test44394() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest88.test44394");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.endsWithIgnoreCase("sLyAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA 444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444", "ArryLis");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test44395() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest88.test44395");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitByCharacterTypeCamelCase("...l.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAA...");
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test44396() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest88.test44396");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringAfterLast("vaj.gnalaaaaaaaaaaaaaaaaaaajavaulangaaaaaaaaaaaaaaaaaaavaj.gnalaaaaaaaaaaaaaaaaaaajavaulangaaaaaaaaaaaaaaaaaaavaj.gnalaaaaaaaaaaaaaaaaaaajavaulangaaaaaaaaaaaaaaaaaaavaj.gnalaaaaaaaaaaaaaaaaaaajavaulangaaaaaaaaaaaaaaaaaaavaj.gnal", "$$$$$$$$$$$$$$$$$$$$$$$$$$$$$...$$$$$$$$$$$$$$$$$$$$$$$$$$$$$...$$$$$$$$$$$$$$$$$$$$$$$$$$                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                            ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test44397() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest88.test44397");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("interface java.lang.CloneableJ#v#.l#ngj#v#.l#ngj#v#.l#ngj#v#.l#ngj#v#.l#ngj#v#.l#ngj#v#.l#ngj#v#.l#ngj#v#.l#ngj#v#.l#ngj#v#.l#ngj#v#.l#ngj#v#.l#ngj#v#.l#ngj#v#.l#ngj#v#.l#ngj#v#.l#ngj#v#.l#ngj#v#.l#ngj#v#.l#ngj#v#.l#ngj#v#.l#ngj#v#.l#ngj#v#.l#ngj#v#.l#ngj#v#.l#ngj#v#.l#ngj#v#.l#ngj#v#.l#ngj#v#.l#ngj#v#.l#ngj#v#.l#ngj#v#.l#nginterface java.io.Serializable", "gnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnal.LANG.LANG.LANG.LANG.LANG.LANG.Llitu");
        java.lang.Class<?>[] wildcardClassArray3 = org.apache.commons.lang3.ClassUtils.toClass((java.lang.Object[]) strArray2);
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
        java.lang.String[] strArray38 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("hi!", "");
        java.lang.String[] strArray40 = org.apache.commons.lang3.StringUtils.stripAll(strArray38, "$");
        java.lang.Class<?>[] wildcardClassArray41 = org.apache.commons.lang3.ClassUtils.toClass((java.lang.Object[]) strArray38);
        java.lang.Class<?>[] wildcardClassArray42 = org.apache.commons.lang3.ClassUtils.toClass((java.lang.Object[]) wildcardClassArray41);
        java.lang.String str46 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) wildcardClassArray42, '#', (int) (byte) -1, (-1));
        java.lang.Class<?> wildcardClass47 = null;
        java.lang.Class[] classArray49 = new java.lang.Class[1];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray50 = (java.lang.Class<?>[]) classArray49;
        wildcardClassArray50[0] = wildcardClass47;
        java.lang.Class<?>[] wildcardClassArray53 = org.apache.commons.lang3.ClassUtils.primitivesToWrappers(wildcardClassArray50);
        java.lang.Class<?>[] wildcardClassArray54 = org.apache.commons.lang3.ClassUtils.primitivesToWrappers(wildcardClassArray50);
        boolean boolean55 = org.apache.commons.lang3.ClassUtils.isAssignable(wildcardClassArray42, wildcardClassArray54);
        boolean boolean56 = org.apache.commons.lang3.ClassUtils.isAssignable(wildcardClassArray34, wildcardClassArray42);
        java.lang.String[] strArray58 = org.apache.commons.lang3.StringUtils.splitByCharacterType("... AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA... AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA... AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA... AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA... AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA... AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA... AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA... AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA... AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA... AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA");
        java.lang.Class<?>[] wildcardClassArray59 = org.apache.commons.lang3.ClassUtils.toClass((java.lang.Object[]) strArray58);
        java.lang.Class<?>[] wildcardClassArray60 = org.apache.commons.lang3.ClassUtils.primitivesToWrappers(wildcardClassArray59);
        java.lang.Class<?>[] wildcardClassArray61 = org.apache.commons.lang3.ClassUtils.wrappersToPrimitives(wildcardClassArray60);
        java.lang.Class<?>[] wildcardClassArray62 = org.apache.commons.lang3.ClassUtils.toClass((java.lang.Object[]) wildcardClassArray61);
        java.lang.Class<?>[] wildcardClassArray63 = org.apache.commons.lang3.ClassUtils.primitivesToWrappers(wildcardClassArray61);
        boolean boolean65 = org.apache.commons.lang3.ClassUtils.isAssignable(wildcardClassArray34, wildcardClassArray61, true);
        java.lang.String[] strArray68 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("JAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANG", "...................................................................");
        int int69 = org.apache.commons.lang3.StringUtils.indexOfDifference((java.lang.CharSequence[]) strArray68);
        java.lang.Class<?>[] wildcardClassArray70 = org.apache.commons.lang3.ClassUtils.toClass((java.lang.Object[]) strArray68);
        boolean boolean72 = org.apache.commons.lang3.ClassUtils.isAssignable(wildcardClassArray61, wildcardClassArray70, true);
        boolean boolean74 = org.apache.commons.lang3.ClassUtils.isAssignable(wildcardClassArray3, wildcardClassArray70, false);
        org.junit.Assert.assertNotNull(strArray2);
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
        org.junit.Assert.assertNotNull(strArray38);
        org.junit.Assert.assertNotNull(strArray40);
        org.junit.Assert.assertNotNull(wildcardClassArray41);
        org.junit.Assert.assertNotNull(wildcardClassArray42);
        org.junit.Assert.assertEquals("'" + str46 + "' != '" + "" + "'", str46, "");
        org.junit.Assert.assertNotNull(classArray49);
        org.junit.Assert.assertNotNull(wildcardClassArray50);
        org.junit.Assert.assertNotNull(wildcardClassArray53);
        org.junit.Assert.assertNotNull(wildcardClassArray54);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
        org.junit.Assert.assertNotNull(strArray58);
        org.junit.Assert.assertNotNull(wildcardClassArray59);
        org.junit.Assert.assertNotNull(wildcardClassArray60);
        org.junit.Assert.assertNotNull(wildcardClassArray61);
        org.junit.Assert.assertNotNull(wildcardClassArray62);
        org.junit.Assert.assertNotNull(wildcardClassArray63);
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + false + "'", boolean65 == false);
        org.junit.Assert.assertNotNull(strArray68);
        org.junit.Assert.assertTrue("'" + int69 + "' != '" + (-1) + "'", int69 == (-1));
        org.junit.Assert.assertNotNull(wildcardClassArray70);
        org.junit.Assert.assertTrue("'" + boolean72 + "' != '" + false + "'", boolean72 == false);
        org.junit.Assert.assertTrue("'" + boolean74 + "' != '" + true + "'", boolean74 == true);
    }

    @Test
    public void test44398() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest88.test44398");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfIgnoreCase("int", "LANGaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa       44444444444444444444444444...");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test44399() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest88.test44399");
        int int3 = org.apache.commons.lang3.StringUtils.lastOrdinalIndexOf("................................................................................................................................................................................................................................gnal.aL.ArrayListgnal.aL.ArrayList.................................................................................................................................................................................................................................", "gnalarraylistarraylistarrayli", 305);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test44400() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest88.test44400");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOf("java.", 98);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test44401() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest88.test44401");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfIgnoreCase("a.lang.objectclass java.lang.objectclass java.lang.objectclass java.lang.objectclass java.lang.objectclass java.lang.objectclass java.lang.objectclass java.lang.objectclass java.lang.objectclass java.lang.objectclass java.lang.objectclass java.lang.objectclass java.lang.objectclass java.lang.objectclass java.lang.objectclass java.lang.objectclass java.lang.objectclass java.lang.objectclass java.lang.objectclass java.lang.objectclass java.lang.object", "gn lu v j                       ....................................................................gn lu v j                       ....................................................................gn lu v j                       ......................................                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                        ...");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test44402() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest88.test44402");
        int int3 = org.apache.commons.lang3.StringUtils.indexOf("GNAL.AVAJGNAL..langGNAL.AVAJGNALLituLlituLlitu444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444", 257, 217);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test44403() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest88.test44403");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphanumeric((java.lang.CharSequence) "..........java..........java..........javainterface java.io.Serializable");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test44404() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest88.test44404");
        int int3 = org.apache.commons.lang3.StringUtils.indexOfIgnoreCase("ONEABLELANG.GNALJAVA.LANGAVAJ.GNALJAVA.LANGAVAJ.GNALJAVA.LANGAVAJ.GNALJAVA.LANGAVAJ.GNALJAVA.LANGAVAJ.GNALJAVA.LANGAVAJ.GNALJAVA.LANGAVAJ.GNALJAVA.LANGAVAJ.JAVAINTERFACE JAVA.IO.SERIALIZABLEinterface java.io.Serializableinterface java.lang.CloneableINTERFACE JAVA.LANG.CLONEABLELANG.GNALJAVA.LANGAVAJ.GNALJAVA.LANGAVAJ.GNALJAVA.LANGAVAJ.GNALJAVA.LANGAVAJ.GNALJAVA.LANGAVAJ.GNALJAVA.LANGAVAJ.GNALJAVA.LANGAVAJ.GNALJAVA.", ".LANG.LANG.LANG.LANG.LANG.LANG.Llitu...O.gnal.avaj ssalcr4444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444.............O.gnal.avaj ssalcr4444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444.............O.gnal.avaj ssalcr44444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444", 181);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test44405() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest88.test44405");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replace("GNALaRRAYlISTaRRAYlISTaRRAYlISTAVAJ.GNALaRRAYlISTaRRAYlISTaRRAYlI...Al.aRRAYlISTGNAL.Al.aRRAYlIST...Al.aRRAYlISTGNAL.Al.aRRAYlIST...Al.aRRAYlISTGNAL.Al.", "tSslitUgnirtSslitUgnirtSslitUgnirtSslitUgnirtS", "aaaaaaaaaajaval.agnaaaaaaaaaajaval.agnaaaaaaaaaajaval.agnaaaaaaaaaajaval.agnaaaaaaaaaajaval.agnaaaaaaaaaajaval.agnaaaaaaaaaajaval.agnaaaaaaaaaajaval.agnaaaaaaaaaajaval.agnaaaaaaaaaajaval.agnaaaaaaaaaajaval.agnaaaaaaaaaajaval.agnaaaaaaaaaaja                                              aaaaaaajaval.agnaaaaaaaaaajaval.agnaaaaaaaaaajaval.agnaaaaaaaaaajaval.agnaaaaaaaaaajaval.agnaaaaaaaaaajaval.agnaaaaaaaaaajaval.agnaaaaaaaaaajaval.agnaaaaaaaaaajaval.agnaaaaaaaaaajaval.agnaaaaaaaaaajaval.agnaaaaaaaaaajaval.agnaaaaaaaaaarin");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "GNALaRRAYlISTaRRAYlISTaRRAYlISTAVAJ.GNALaRRAYlISTaRRAYlISTaRRAYlI...Al.aRRAYlISTGNAL.Al.aRRAYlIST...Al.aRRAYlISTGNAL.Al.aRRAYlIST...Al.aRRAYlISTGNAL.Al." + "'", str3, "GNALaRRAYlISTaRRAYlISTaRRAYlISTAVAJ.GNALaRRAYlISTaRRAYlISTaRRAYlI...Al.aRRAYlISTGNAL.Al.aRRAYlIST...Al.aRRAYlISTGNAL.Al.aRRAYlIST...Al.aRRAYlISTGNAL.Al.");
    }

    @Test
    public void test44406() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest88.test44406");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.rightPad("interfce jv.lng.ClonebleStringinterfNAL....................interfce jv.lng.ClonebleStringinterf", 57);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "interfce jv.lng.ClonebleStringinterfNAL....................interfce jv.lng.ClonebleStringinterf" + "'", str2, "interfce jv.lng.ClonebleStringinterfNAL....................interfce jv.lng.ClonebleStringinterf");
    }

    @Test
    public void test44407() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest88.test44407");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeStartIgnoreCase("interfac", "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "interfac" + "'", str2, "interfac");
    }

    @Test
    public void test44408() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest88.test44408");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAllLowerCase((java.lang.CharSequence) "Erface java.lang.Cloneable4interface java.io.Serializabl");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test44409() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest88.test44409");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.center("ituLlituLlituLlituLlituLlituLlituLlituLlituLlituLlituLlituLlituLlituLlituLlituLlituLlituLlituLlituLlituLlituLlituLlituLlituLlituLlituLlituLlituLlituLlituLlituLlituLlituLlitu", 788, '$');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$ituLlituLlituLlituLlituLlituLlituLlituLlituLlituLlituLlituLlituLlituLlituLlituLlituLlituLlituLlituLlituLlituLlituLlituLlituLlituLlituLlituLlituLlituLlituLlituLlituLlituLlitu$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$" + "'", str3, "$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$ituLlituLlituLlituLlituLlituLlituLlituLlituLlituLlituLlituLlituLlituLlituLlituLlituLlituLlituLlituLlituLlituLlituLlituLlituLlituLlituLlituLlituLlituLlituLlituLlituLlituLlitu$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$");
    }

    @Test
    public void test44410() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest88.test44410");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfDifference((java.lang.CharSequence) "aaaaaaaaaaaaaaaaaaaaaalitu", (java.lang.CharSequence) "aaaaaaaaaaaaaaaaaaaaaaaJAVAULANG");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 22 + "'", int2 == 22);
    }

    @Test
    public void test44411() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest88.test44411");
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("AAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAA", "-1java.utilString[]");
        boolean boolean5 = org.apache.commons.lang3.StringUtils.endsWithAny("JAVA", strArray4);
        java.lang.String[] strArray9 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("AAAA                       JAVAULANGrrayList", "hi!ArrayLis");
        java.lang.String[] strArray15 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("...", "                                   ", (int) 'a');
        java.lang.String[] strArray16 = org.apache.commons.lang3.StringUtils.stripAll(strArray15);
        int int17 = org.apache.commons.lang3.StringUtils.lastIndexOfAny("                                                                                                    ", strArray15);
        java.lang.String[] strArray21 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("-1java.utilString[]    ", "avaj", 89);
        java.lang.String str22 = org.apache.commons.lang3.StringUtils.replaceEach("litulitulitulitulitul####litulitulitulitulitul", strArray15, strArray21);
        java.lang.String str23 = org.apache.commons.lang3.StringUtils.replaceEach("4444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444aaaaaaaaaa", strArray9, strArray21);
        java.lang.String str25 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray9, "Stringc");
        java.lang.String str26 = org.apache.commons.lang3.StringUtils.replaceEach("                                  $$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$", strArray4, strArray9);
        int int27 = org.apache.commons.lang3.StringUtils.indexOfDifference((java.lang.CharSequence[]) strArray9);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(strArray9);
        org.junit.Assert.assertNotNull(strArray15);
        org.junit.Assert.assertNotNull(strArray16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
        org.junit.Assert.assertNotNull(strArray21);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "litulitulitulitulitul####litulitulitulitulitul" + "'", str22, "litulitulitulitulitul####litulitulitulitulitul");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "4444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444aaaaaaaaaa" + "'", str23, "4444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444aaaaaaaaaa");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "AAAA                       JAVAULANGrrayList" + "'", str25, "AAAA                       JAVAULANGrrayList");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "                                  $$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$" + "'", str26, "                                  $$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$");
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-1) + "'", int27 == (-1));
    }

    @Test
    public void test44412() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest88.test44412");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.leftPad("yyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyy", 602);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                                                                               yyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyy" + "'", str2, "                                                                                               yyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyy");
    }

    @Test
    public void test44413() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest88.test44413");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.stripStart("Arr... AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA... AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA... AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA... AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA... AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA... AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA... AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA... AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA... AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA... AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAyList", "A..yL A.44444444444444444444444444");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "rr... AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA... AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA... AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA... AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA... AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA... AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA... AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA... AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA... AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA... AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAyList" + "'", str2, "rr... AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA... AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA... AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA... AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA... AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA... AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA... AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA... AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA... AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA... AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAyList");
    }

    @Test
    public void test44414() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest88.test44414");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphaSpace((java.lang.CharSequence) "Jvstringnlrrylistrrylistrrylistvj.gnlrrylistrrylistrryli-1jv.utilString-1jv.utilString-1jv.utilString-1jv.utilString-1jv.utilString-1jv.utilString-1jv.utilString-1jv.utilString-1jv.utilString-1jv.utilString-1jv.utilString-1jv.utilString-1jv.utilString-1jv.utilString-1jv.utilString-1jv.utilString-1jv.utilString-1jv.utilString-1jv.utilString-1jv.utilString-1jv.utilString-1jv.utilString-1jv.utilString-1jv.utilString-1jv.utilString-1jv.utilString-1jv.utilString-1jv.utilString-1jv.utilString-1jv.utilString-1jv.utilString-1jv.utilString-1jv.utilString-1jv.utilString-1jv.utilString-1jv.utilString-1jv.utilString-1jv.utilString-1jv.utilString-1jv.utilString-1jv.utilString-1jv.utilString-1jv.utilString-1jv.utilString-1jv.utilString-1jv.utilString-1jv.utilString-1jv.utilString-1jv.utilString-1jv.utilString-1jv.utilString-1jv.utilString-1jv.utilString-1jv.utilString-1jv.utilString-1jv.utilString-1jv.utilString-1jv.utilString-1jv.utilString-");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test44415() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest88.test44415");
        int int2 = org.apache.commons.lang3.StringUtils.countMatches("lang.javatsilyarratsilyarratsilyarra", "                                                                                                                                                                                                                                                                                                                                                                                                         utiljava.util444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444                                                                                                                                                                                                                                                                                                                                                                                                         ");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test44416() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest88.test44416");
        java.util.Locale locale1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.apache.commons.lang3.StringUtils.lowerCase("....................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................LANG.LANG.LANG.LANG.Llitu", locale1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test44417() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest88.test44417");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substring("interf$ce#j$v$.l$ng.Clone$ble....................................................................#######################JAVAULANGinterf$ce#j$v$.io.Seri$liz$ble", 486);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test44418() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest88.test44418");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.startsWith("      AAAAAAAAAAAAAAAAAAA...", "                             ...aaaaaaaaaaaaaaaaaaaaaaaaaa...                              java.lang$                         ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test44419() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest88.test44419");
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
        java.lang.String str25 = org.apache.commons.lang3.ClassUtils.getPackageCanonicalName((java.lang.Object) wildcardClassArray21, "e");
        java.lang.String str27 = org.apache.commons.lang3.ClassUtils.getPackageName((java.lang.Object) wildcardClassArray21, "        avajlitu         ");
        java.lang.String str31 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) wildcardClassArray21, "                                                                                                                                                                                                                                                            ...                     INTERFACE JAVA.LANG.CLONEABLE...                                 INTERFAC..", 664, 124);
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
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "java.lang" + "'", str25, "java.lang");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "java.lang" + "'", str27, "java.lang");
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "" + "'", str31, "");
    }

    @Test
    public void test44420() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest88.test44420");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.upperCase("i elbaenolCAgnalAavajiecafretniTRINGi elbaenolCAgnalAavajiecaf");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "I ELBAENOLCAGNALAAVAJIECAFRETNITRINGI ELBAENOLCAGNALAAVAJIECAF" + "'", str1, "I ELBAENOLCAGNALAAVAJIECAFRETNITRINGI ELBAENOLCAGNALAAVAJIECAF");
    }

    @Test
    public void test44421() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest88.test44421");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("4v4jgn4l", "", 935);
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void test44422() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest88.test44422");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.split("a..AYL A.44444444444444444444444444a..AYL A.44444444444444444444444444a..AYL A.44444444444444444444444444a..AYL A.44444444444444444444444444a..AYL A.44444444444444444444444444a..AYL A.44444444444444444444444444a..AYL A.44444444444444444444444444a..AYL A.44444444444444444444444444a..AYL A.44444444444444444444444444a..AYL A.44444444444444444444444444a..AYL A.44444444444444444444444444a..AYL A.444444444A$L.AVAj  ");
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test44423() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest88.test44423");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.center("####################################.AARRAYALISTAARRAYALISTAARRAYALISTAARRAYALIS#####################################", 401);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                                                                                                                              ####################################.AARRAYALISTAARRAYALISTAARRAYALISTAARRAYALIS#####################################                                                                                                                                              " + "'", str2, "                                                                                                                                              ####################################.AARRAYALISTAARRAYALISTAARRAYALISTAARRAYALIS#####################################                                                                                                                                              ");
    }

    @Test
    public void test44424() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest88.test44424");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.contains("l.ngAGNALelb.zil.ireSelb.zil.ireSelb.zil.ireSelb.zil.ireSelb.zil.ireSelb.zil.ireSelb.zil.ireSelb.zil.ireSelb.zil.ireSelb.zil.ireSelb.zil.ireSelb.zil.ireSelb.zil.ireSelb.zil.ireSelb.zil.ireSelb.zil.ireSelb.zil.ireSelb.zil.ireSelb.zil.ireSelb.zil.ireSelb.zil.ireSelb.zil.ireSelb.zil.ireSelb.zil.ireSelb.zil.ireSelb.zil.ireSelb.zil.ireSelb.zil.ireSelb.zil.ireSelb.zil.ireSelb.zil.ireSelb.zil.ireSelb.zil.ireSe................................................................................................", 44);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test44425() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest88.test44425");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.defaultString("4444444444444444444444444444444aaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "4444444444444444444444444444444aaaaaaaaaaaaaaaaaaaaaaaaaaaaaa" + "'", str1, "4444444444444444444444444444444aaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
    }

    @Test
    public void test44426() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest88.test44426");
        java.lang.String str1 = org.apache.commons.lang3.ClassUtils.getPackageCanonicalName("ja");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
    }

    @Test
    public void test44427() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest88.test44427");
        int int3 = org.apache.commons.lang3.StringUtils.lastOrdinalIndexOf("gagnAAAAAAAAAAistArrayListArrayListavaj.gnalArrayListArrayListArrayLigagnAAAAAAAAAAistArrayListArrayListavaj.gnalArrayListArrayListArrayLigagnAAAAAAAAAAistArrayListArrayListavaj.gnalArrayListArrayListArrayLigagnAAAAAAAAAAistArrayListArrayListavaj.gnalArrayListArrayListArrayLigagnAAAAAAAAAAistArrayListArrayListavaj.gnalArrayListArrayListArrayLigagnAAAAAAAAAAistArrayListArrayListavaj.gnalArrayListArrayListArrayLigagnAAAAAAAAAAistArrayListArrayListavaj.gnalArrayListArrayListArrayLigagnAAAAAAAAAAistArrayListArrayListavaj.gnalArrayListArrayListArrayLigagnAAAAAAAAAAistArrayListArrayListavaj.gnalArrayListArrayListArrayLigagnAAAAAAAAAAistArrayListArrayListavaj.gnalArrayListArrayListArrayLigagnAAAAAAAAAAistArrayListArrayListavaj.gnalArrayListArrayListArrayLigagnAAAAAAAAAAistArrayListArrayListavaj.gnalArrayListArrayListArrayLigagnAAAAAAAAAAistinterface java.lang.Cloneable             Character             interface java.io.Serializable", "444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444interface java.lang.Cloneable4iGNIRTinterface java.lang", 667);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test44428() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest88.test44428");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceOnce("4444444444444Ch.r.cter4444444444444utilStrayl a.a", "GNAL.AVAJGNAL..LANGGNAL.AVAJGNALLITULLITULLITU444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444", "Integer                            Inte");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "4444444444444Ch.r.cter4444444444444utilStrayl a.a" + "'", str3, "4444444444444Ch.r.cter4444444444444utilStrayl a.a");
    }

    @Test
    public void test44429() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest88.test44429");
        java.lang.String[] strArray1 = new java.lang.String[] { "$" };
        java.util.ArrayList<java.lang.String> strList2 = new java.util.ArrayList<java.lang.String>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList2, strArray1);
        java.util.List<java.lang.Class<?>> wildcardClassList4 = org.apache.commons.lang3.ClassUtils.convertClassNamesToClasses((java.util.List<java.lang.String>) strList2);
        java.lang.String str6 = org.apache.commons.lang3.ClassUtils.getPackageCanonicalName((java.lang.Object) strList2, "$");
        java.util.List<java.lang.Class<?>> wildcardClassList7 = org.apache.commons.lang3.ClassUtils.convertClassNamesToClasses((java.util.List<java.lang.String>) strList2);
        java.lang.String str9 = org.apache.commons.lang3.ClassUtils.getPackageCanonicalName((java.lang.Object) wildcardClassList7, "...       ....       .");
        java.lang.String str11 = org.apache.commons.lang3.StringUtils.join((java.lang.Iterable<java.lang.Class<?>>) wildcardClassList7, ' ');
        java.lang.String str13 = org.apache.commons.lang3.StringUtils.join((java.lang.Iterable<java.lang.Class<?>>) wildcardClassList7, "String.");
        java.lang.String str15 = org.apache.commons.lang3.StringUtils.join((java.lang.Iterable<java.lang.Class<?>>) wildcardClassList7, '$');
        java.lang.String str17 = org.apache.commons.lang3.ClassUtils.getShortCanonicalName((java.lang.Object) str15, "4444444444444444444444444444444444444444444444444444444444444444444444444444444N4444444444444444444444444444444444444444444444444444444444444444444444444444444");
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(wildcardClassList4);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "java.util" + "'", str6, "java.util");
        org.junit.Assert.assertNotNull(wildcardClassList7);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "java.util" + "'", str9, "java.util");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "String" + "'", str17, "String");
    }

    @Test
    public void test44430() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest88.test44430");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.startsWith("", "INTERFACEGAGA.LANG.CLONEABLEAAAAAAAAAAGAGAL.AGNAAAAAAAAAAGAGAL.AGNAAAAAAAAAAGAGAL.AGNAAAAAAAAAAGAGAL.AGNAAAAAAAAAAGAGAL.AGNAAAAAAAAAAGAGAL.AGNAAAAAAAAAAGAGAL.AGNAAAAAAAAAAGAGAL.AGNAAAAAAAAAAGAGAL.AGNAAAAAAAAAAGAGAL.AGNAAAAAAAAAAGAGAL.AGNAAAAAAAAAAGAGAL.AGNAAAAAAAAAAGAGAL.AGNAAAAAAAAAAGAGAL.AGNAAAAAAAAAAGAGAL.AGNAAAAAAAAAAGAGAL.AGNAAAAAAAAAAGAGAL.AGNAAAAAAAAAAGAGAL.AGNAAAAAAAAAAGAGAL.AGNAAAAAAAAAAGAGAL.AGNAAAAAAAAAAGAGAL.AGNAAAAAAAAAAGAGAL.AGNAAAAAAAAAAGAGAL.AGNAAAAAAAAAAGAGAL.AGNAAAAAAAAAAGAGAL.AGNAAAAAAAAAAGAGAL.AGNAAAAAAAAAAGAGAL.AGNAAAAAAAAAAGAGAL.AGNAAAAAAAAAAGAGAL.AGNAAAAAAAAAAGAGAL.AGNAAAAAAAAAAGAGAL.AGNAAAAAAAAAAGAGAL.AGNAAAAAAAAAAGAGAL.AGNAAAAAAAAAAGAGAL.AGNAAAAAAAAAAGAGAL.AGNAAAAAAAAAARINGINTERFACEGAGA.IO");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test44431() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest88.test44431");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitByCharacterType("Arr... AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA... AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA... AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA... AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA... AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA... AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA... AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA... AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA... AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA... AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAyList");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.getCommonPrefix(strArray1);
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test44432() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest88.test44432");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripAccents((java.lang.CharSequence) ".LANG.LANG.LANG.LANG.LLITU");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + ".LANG.LANG.LANG.LANG.LLITU" + "'", str1, ".LANG.LANG.LANG.LANG.LLITU");
    }

    @Test
    public void test44433() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest88.test44433");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripAccents((java.lang.CharSequence) "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaagnalarraylistarraylistarrayliaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaagnalarraylistarraylistarrayliaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa" + "'", str1, "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaagnalarraylistarraylistarrayliaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
    }

    @Test
    public void test44434() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest88.test44434");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.leftPad("                                                                                                                                                                                                                                                                           tsilyarrgnaluavaj.tsilyarrgnaluavaj                                                                                                                                                                                                                                                                            ", 149, 'a');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "                                                                                                                                                                                                                                                                           tsilyarrgnaluavaj.tsilyarrgnaluavaj                                                                                                                                                                                                                                                                            " + "'", str3, "                                                                                                                                                                                                                                                                           tsilyarrgnaluavaj.tsilyarrgnaluavaj                                                                                                                                                                                                                                                                            ");
    }

    @Test
    public void test44435() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest88.test44435");
        java.lang.String str1 = org.apache.commons.lang3.ClassUtils.getPackageCanonicalName("              java.io.Serializable interface java.lang.Cloneable... interface              ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "java.io.Serializableinterfacejava.lang.Cloneable.." + "'", str1, "java.io.Serializableinterfacejava.lang.Cloneable..");
    }

    @Test
    public void test44436() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest88.test44436");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isWhitespace((java.lang.CharSequence) "$$$$$$$$$$$$$$$$$$$$$$$$$$$$$aaa                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                         ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test44437() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest88.test44437");
        java.lang.CharSequence charSequence0 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.apache.commons.lang3.StringUtils.getLevenshteinDistance(charSequence0, (java.lang.CharSequence) "AVAJ.GNALAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA       CharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterChara4444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444rclass java.lang.O...44444444444444444444444444444444444444444444444444444444444444444444444444444444444444");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Strings must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test44438() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest88.test44438");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.substringBetween("     A..ayL A.44444444444444444444444444      ", "SILYARRA!IH$$$$$$$$", "$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$AVAJ.GNALNaaaaaaaaaaJAVAL.AGNaaaaaaaaaaJAVAL.AGNaaaaaaaaaaJAVAL.AGNaaaaaaaaaaJAVAL.AGNaaaaaaaaaaJ$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$");
        org.junit.Assert.assertNull(str3);
    }

    @Test
    public void test44439() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest88.test44439");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.lowerCase("..........a       ..#############################################");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "..........a       ..#############################################" + "'", str1, "..........a       ..#############################################");
    }

    @Test
    public void test44440() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest88.test44440");
        java.lang.ClassLoader classLoader0 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass3 = org.apache.commons.lang3.ClassUtils.getClass(classLoader0, "JAVAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA", true);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassNotFoundException; message: JAVAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA");
        } catch (java.lang.ClassNotFoundException e) {
            // Expected exception.
        }
    }

    @Test
    public void test44441() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest88.test44441");
        java.util.Locale locale1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.apache.commons.lang3.StringUtils.upperCase("...44444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444..........", locale1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test44442() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest88.test44442");
        char[] charArray8 = new char[] { '$' };
        int int9 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "java.util", charArray8);
        boolean boolean10 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "                                   ", charArray8);
        boolean boolean11 = org.apache.commons.lang3.StringUtils.containsAny("...       ....       .", charArray8);
        int int12 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "...       ", charArray8);
        boolean boolean13 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA       AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA       AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA       AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA       AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA       AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA       ", charArray8);
        int int14 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) ".44444444444444444444444444444444444444444444444444444444444444444444444444444444", charArray8);
        int int15 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "...AAAAAAAAAAAAAAAAAAA", charArray8);
        org.junit.Assert.assertNotNull(charArray8);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray8), "$");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray8), "$");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray8), "[$]");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
    }

    @Test
    public void test44443() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest88.test44443");
        java.util.Locale locale1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.apache.commons.lang3.StringUtils.upperCase("tsiLy#rrA.L", locale1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test44444() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest88.test44444");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOf("                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                ", "                            ", 113);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 113 + "'", int3 == 113);
    }

    @Test
    public void test44445() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest88.test44445");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.substring("                                     RGNALUAVAJ", 460, 4);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test44446() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest88.test44446");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.normalizeSpace("VA.LANGAVAJ.GNALJAVA.LANGAVAJ.GNALJAVA.LANGAVAJ.GNALJAVA.LANGAVAJ.GNALJAVA.LANGAVAJ.GNALJAVA.....");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "VA.LANGAVAJ.GNALJAVA.LANGAVAJ.GNALJAVA.LANGAVAJ.GNALJAVA.LANGAVAJ.GNALJAVA.LANGAVAJ.GNALJAVA....." + "'", str1, "VA.LANGAVAJ.GNALJAVA.LANGAVAJ.GNALJAVA.LANGAVAJ.GNALJAVA.LANGAVAJ.GNALJAVA.LANGAVAJ.GNALJAVA.....");
    }

    @Test
    public void test44447() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest88.test44447");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.chomp("gNAL.AVAJLANG.JAVAGNAL.AVAJLANG.JAVAGNAL.AVAJLANG.JAVAGNAL.AVAJLANG.JAVAGNAL.AVAJLANG.JAVAGNAL.AVAJLANG.JAVAGNAL.AVAJLANG.JAVAGNAL.gn gnal.avaj");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "gNAL.AVAJLANG.JAVAGNAL.AVAJLANG.JAVAGNAL.AVAJLANG.JAVAGNAL.AVAJLANG.JAVAGNAL.AVAJLANG.JAVAGNAL.AVAJLANG.JAVAGNAL.AVAJLANG.JAVAGNAL.gn gnal.avaj" + "'", str1, "gNAL.AVAJLANG.JAVAGNAL.AVAJLANG.JAVAGNAL.AVAJLANG.JAVAGNAL.AVAJLANG.JAVAGNAL.AVAJLANG.JAVAGNAL.AVAJLANG.JAVAGNAL.AVAJLANG.JAVAGNAL.gn gnal.avaj");
    }

    @Test
    public void test44448() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest88.test44448");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitByCharacterType("Cloneable4i");
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test44449() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest88.test44449");
        java.lang.ClassLoader classLoader0 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass3 = org.apache.commons.lang3.ClassUtils.getClass(classLoader0, "gnal       avaj", true);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassNotFoundException; message: gnalavaj");
        } catch (java.lang.ClassNotFoundException e) {
            // Expected exception.
        }
    }

    @Test
    public void test44450() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest88.test44450");
        int int2 = org.apache.commons.lang3.StringUtils.indexOf("                                                                                                                                                                                                                                                                                                                                                          JAVAL#.#AGN       AAAAAAAAAAAAAAAAAAAAAAAAA                                                                                                                                                                                                                                                                                                                                                         ", 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test44451() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest88.test44451");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.lowerCase("                   StringStringStringStringStringStringStringStringStringString                    ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "                   stringstringstringstringstringstringstringstringstringstring                    " + "'", str1, "                   stringstringstringstringstringstringstringstringstringstring                    ");
    }

    @Test
    public void test44452() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest88.test44452");
        java.lang.String str1 = org.apache.commons.lang3.ClassUtils.getPackageCanonicalName("interfacejava.lang.Cloneable4iGNIRTinterfacejava.lang.Cloneable4i");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "interfacejava.lang.Cloneable4iGNIRTinterfacejava.lang" + "'", str1, "interfacejava.lang.Cloneable4iGNIRTinterfacejava.lang");
    }

    @Test
    public void test44453() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest88.test44453");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.center("                                                                                                                                                                                                                                                                                                                                                                                                                                JAVA.LANGAgnl.vjgnl..LANGgnl.vArrclss jv.lng.ObjectyListAr...", 717, "   A..iyL A    ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "   A..iyL A       A..iyL A       A..iyL A       A..iyL A       A..iyL A       A..iyL A       A..iyL A       A..iyL A                                                                                                                                                                                                                                                                                                                                                                                                                                    JAVA.LANGAgnl.vjgnl..LANGgnl.vArrclss jv.lng.ObjectyListAr...   A..iyL A       A..iyL A       A..iyL A       A..iyL A       A..iyL A       A..iyL A       A..iyL A       A..iyL A    " + "'", str3, "   A..iyL A       A..iyL A       A..iyL A       A..iyL A       A..iyL A       A..iyL A       A..iyL A       A..iyL A                                                                                                                                                                                                                                                                                                                                                                                                                                    JAVA.LANGAgnl.vjgnl..LANGgnl.vArrclss jv.lng.ObjectyListAr...   A..iyL A       A..iyL A       A..iyL A       A..iyL A       A..iyL A       A..iyL A       A..iyL A       A..iyL A    ");
    }

    @Test
    public void test44454() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest88.test44454");
        java.lang.ClassLoader classLoader0 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass2 = org.apache.commons.lang3.ClassUtils.getClass(classLoader0, ".............................................................................................................................................................................................................................................................................................................................................................................LANG.LANG.LANG.LANG");
            org.junit.Assert.fail("Expected exception of type java.lang.ClassNotFoundException; message: /////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////LANG/LANG/LANG/LANG");
        } catch (java.lang.ClassNotFoundException e) {
            // Expected exception.
        }
    }

    @Test
    public void test44455() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest88.test44455");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAllLowerCase((java.lang.CharSequence) "NALAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test44456() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest88.test44456");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAllUpperCase((java.lang.CharSequence) "...aL.ArrayListgnal.aL.ArrayList");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test44457() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest88.test44457");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNotEmpty((java.lang.CharSequence) "utiljava.utilarrAjava.utiljava.utilarrAjava.utiljava.utilarrAjava.utiljava.utilarrAjava.utiljava.utilarrAjava.utiljava.utilarrAjava.utiljava.utilarrA#########################################################################itu.avaj###########################");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test44458() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest88.test44458");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByCharacterTypeCamelCase("irtSirtSirtSirtSirtSirtSirtSirtSirtSirtSirtS");
        java.lang.String[] strArray5 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("javaulainterface java.lang.Cloneable4interface java.io.Serializable", "-1java.utilString[]    ");
        java.lang.Class<?>[] wildcardClassArray6 = org.apache.commons.lang3.ClassUtils.toClass((java.lang.Object[]) strArray5);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str7 = org.apache.commons.lang3.StringUtils.replaceEach("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaJAVA.LANG.CLONEABLE...                                 INTERFACE JAVA.IO.SERIALIZABLE", strArray2, strArray5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Search and Replace array lengths don't match: 12 vs 1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertNotNull(wildcardClassArray6);
    }

    @Test
    public void test44459() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest88.test44459");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("gnirtS.gnal.avaj ssalcgnirtS.gnal.avaj ssalcgnirtS.gnal.avaj ssalcgnirtS.gnal.avaj ssalcgnirtS.gnal.avaj ssalcgnirtS.gnal.avaj ssalcgnirtS.gnal.avaj ssalcgnirtS.gnal.avaj ssalcgnirtS.gnal.avaj ssalcgnirtS.gnal.avaj ssalcgnirtS.gnal.avaj ssalcgnirtS.gnal.avaj ssalcgnirtS.gnal.avaj ssalcgnirtS.gnal.avaj ssalcgnirtS.gnal.avaj ssalcgnirtS.gnal.avaj ... .... .java.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.lang... .... .java.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.lang... .... .java.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.lang... .... .java.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.lang... .... .java.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.lang... .... .", "aaaaaaaautilaaaaaaaaa");
        java.lang.String[] strArray5 = org.apache.commons.lang3.StringUtils.stripAll(strArray3, "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                               aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        int int6 = org.apache.commons.lang3.StringUtils.indexOfAny("...VA.LANGAVAJ.GNALJAVA.LANGAVAJ.GNALJAVA.LANGAVAJ.GNALJAVA.LANGAVAJ.GNALJAVA.LANGAVAJ.GNALJAVA.LANGGNALGNALGNALGNALGNALGNALGNALGNALGNALGNALGNALGNALGNALGNALGNALGNALGNALGNALGNALGNALGNALGNALGNALGNALGNALGNALGNALGNALGNALGNALGNALGNALGNALGNALGNALGNALGNALGNALGNALGNALGNALGNALGNALGNALGNALGNALGNALGNALGNALGNALGNALGNALGNALGNALGNALGNALGNALGNALGNALGNALGNALGNALGNALGNALGNALGNALGNALGNALGNALGNALGNALGNALGNALGNALGNALGNALGNALGNALGNALGNALGNALGNALGNALGNALGNALGNALGNALGNALGNALGNALGNALGNALGNALGNALGNALGNALGNALGNALGNALGNALGNALGNALGNALGNALGNALGNALGNALGNALGNALGNALGNALG", strArray5);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
    }

    @Test
    public void test44460() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest88.test44460");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsIgnoreCase("             Character             utilStri", "lANGgnalgnalgnalgnalg...gjavaulangjavaulangjavaulangjavaulangjavaulangjavaulangjavaulangjavaulangjavaulangjavaulangnalgnalgnalgnalgnalgn");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test44461() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest88.test44461");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsAny("$$$$$$$$$$$$$$$$$$$$$$$$$$$$$...$$$$$$$$$$$$$$$$$$$$$$$$$$$$$...$$$$$$$$$$$$$$$$$$$$$$$$$$$$$...       ", "Rgnaavajaaaaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test44462() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest88.test44462");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "aa", "interface java.lang.CloneableAVAJGNALjavajavajavajavajavajavajavgnal                                                                interface java.io.Serializable");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test44463() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest88.test44463");
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java.......", "gnal.avaj                                                                                                                                                                                                                                                                                                                                                                                                                                                       ", (int) '#');
        int int5 = org.apache.commons.lang3.StringUtils.indexOfAny("       util                                                                                                                                                                                                                                                                                                                                                                                 ", strArray4);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void test44464() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest88.test44464");
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.split("va.langGNAL..la..", "                                                                                                                                                                                                                                                                                                                                                                                                                                                                       ...aaaaaa                                                                                                                                                                                                                                                                              ", 348);
        boolean boolean5 = org.apache.commons.lang3.StringUtils.startsWithAny("GAL.AGNAAAAAAAAAAGAGAL.AGNAAAAAAAAAAGAGAL.AGNAAAAA", strArray4);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test44465() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest88.test44465");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.substring("Aa..aayaLa aAa.a444444444444444444444444444", 905, 410);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test44466() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest88.test44466");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.stripStart("ggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggnjavalagnggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggg", "rry");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "ggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggnjavalagnggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggg" + "'", str2, "ggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggnjavalagnggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggg");
    }

    @Test
    public void test44467() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest88.test44467");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAllLowerCase((java.lang.CharSequence) "elbzilireS.oi.vj ecfretnivj..........vtcejbO.......vj.......elbenolC.gnl");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test44468() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest88.test44468");
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.split("AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA", "t", 7);
        boolean boolean5 = org.apache.commons.lang3.StringUtils.endsWithAny("                                                                                                                                                                                                                  java.io.Serializable java.lang.CloneableStringinterface interface                                                                                                                                                                                                                   ", strArray4);
        java.lang.String[] strArray7 = org.apache.commons.lang3.StringUtils.stripAll(strArray4, "erface java.lang.CloneableA rrr rrr rrr rrr rrr rrr rrr rrr rrr rrrinterface java.io.Serializable");
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(strArray7);
    }

    @Test
    public void test44469() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest88.test44469");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOfIgnoreCase("                                                                 AtsiLytcejbOlvjsslcrrAtsiLytcejbO.gnal.avaj ssalcrrAva.langGNAL..langjava.langAGNAL.AVAJaa...                                                                                                                                   ", "#agnaaaaaaaaGnal                                                                                                                                                    ArryListArryListArryListvjGNAL.AVAJLANG.JAVAGNAL.AVAJLANG.JAVAGNAL.AVAJLANG.JAVAGNAL.AVAJLANG.JAVAGNAL.AVAJLANG.JAVAGNAL.AVAJLANG.JAVAGNAL.AVAJLANG.JAVAGNAL.AVAJLANG.JAVAGNAL.AVAJgnl                                                                                                                                                     ");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test44470() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest88.test44470");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substring("                                                                                 javallangj", 892);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test44471() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest88.test44471");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.repeat("", 206);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test44472() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest88.test44472");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.defaultString("                                                                                    AVAJ.GNALAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA CHARACTERCHARACTERCHARACTERCHARACTERCHARACTERCHARACTERCHARACTERCHARACTERCHARACTERCHARACTERCHARACTERCHARACTERCHARACTERCHARACTERCHARACTERCHARACTERCHARACTERCHARACTERCHARACTERCHARACTERCHARACTERCHARACTERCHARACTERCHARACTERCHARACTERCHARACTERCHARACTERCHARACTERCHARACTERCHARACTERCHARACTERCHARACTERCHARACTERCHARACTERCHARACTERCHARACTERCHARACTERCHARACTERCHARACTERCHARACTERCHARACTERCHARACTERCHARACTERCHARACTERCHARACTERCHARACTERCHARACTERCHARACTERCHARACTERCHARACTERCHARACTERCHARACTERCHARACTERCHARACTERCHARACTERCHARACTERCHARACTERCHARACTERCHARACTERCHARACTERCHARACTERCHARACTERCHARA                                                                                    ", "A$L.AV");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                                                                    AVAJ.GNALAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA CHARACTERCHARACTERCHARACTERCHARACTERCHARACTERCHARACTERCHARACTERCHARACTERCHARACTERCHARACTERCHARACTERCHARACTERCHARACTERCHARACTERCHARACTERCHARACTERCHARACTERCHARACTERCHARACTERCHARACTERCHARACTERCHARACTERCHARACTERCHARACTERCHARACTERCHARACTERCHARACTERCHARACTERCHARACTERCHARACTERCHARACTERCHARACTERCHARACTERCHARACTERCHARACTERCHARACTERCHARACTERCHARACTERCHARACTERCHARACTERCHARACTERCHARACTERCHARACTERCHARACTERCHARACTERCHARACTERCHARACTERCHARACTERCHARACTERCHARACTERCHARACTERCHARACTERCHARACTERCHARACTERCHARACTERCHARACTERCHARACTERCHARACTERCHARACTERCHARACTERCHARACTERCHARACTERCHARA                                                                                    " + "'", str2, "                                                                                    AVAJ.GNALAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA CHARACTERCHARACTERCHARACTERCHARACTERCHARACTERCHARACTERCHARACTERCHARACTERCHARACTERCHARACTERCHARACTERCHARACTERCHARACTERCHARACTERCHARACTERCHARACTERCHARACTERCHARACTERCHARACTERCHARACTERCHARACTERCHARACTERCHARACTERCHARACTERCHARACTERCHARACTERCHARACTERCHARACTERCHARACTERCHARACTERCHARACTERCHARACTERCHARACTERCHARACTERCHARACTERCHARACTERCHARACTERCHARACTERCHARACTERCHARACTERCHARACTERCHARACTERCHARACTERCHARACTERCHARACTERCHARACTERCHARACTERCHARACTERCHARACTERCHARACTERCHARACTERCHARACTERCHARACTERCHARACTERCHARACTERCHARACTERCHARACTERCHARACTERCHARACTERCHARACTERCHARACTERCHARACTERCHARA                                                                                    ");
    }

    @Test
    public void test44473() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest88.test44473");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeEnd("             character             utilstri", "ra                                           ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "             character             utilstri" + "'", str2, "             character             utilstri");
    }

    @Test
    public void test44474() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest88.test44474");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOf("LA", "class java.lang.String$class java.lang.String$class java.lang.String$class java.lang.String$class java.lang.String$class java.lang.String$class java.lang.String$class java.lang.String$class java.lang.String$class java.lang.String$class java.lang.String$class java.lang.String", 11);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test44475() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest88.test44475");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.equals((java.lang.CharSequence) "4444444444444444444444444444444444444444444444444444444ssssssssss4444444444444444444444444444444444444444", (java.lang.CharSequence) "gnal..Array..List..Array..List..Array..L.........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test44476() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest88.test44476");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                             4444444.44444444", "");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test44477() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest88.test44477");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("ArrayLis4444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444.......................................................................CharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterChara", "Hi!ArrayLisaVAJ.GNALAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA CharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterChara");
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test44478() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest88.test44478");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("Sho$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$rrayList$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$t", "......................................................................................................................................................................................................................................................................................................................................................................................................................................................................stJAVAGNAL                                                           ", 573);
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void test44479() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest88.test44479");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.center("                                                                                                                                                                                                                                               ", 536, '#');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "####################################################################################################################################################                                                                                                                                                                                                                                               #####################################################################################################################################################" + "'", str3, "####################################################################################################################################################                                                                                                                                                                                                                                               #####################################################################################################################################################");
    }

    @Test
    public void test44480() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest88.test44480");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.defaultIfEmpty("][sslC][sslCrChahacta][sslC][", "                                                                                                                                         lang.javatsiLyarrAtsiLyarrAtsiLyarrA");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "][sslC][sslCrChahacta][sslC][" + "'", str2, "][sslC][sslCrChahacta][sslC][");
    }

    @Test
    public void test44481() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest88.test44481");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNumericSpace((java.lang.CharSequence) "javal#.#agn       aaaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test44482() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest88.test44482");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBefore("AAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAja                                              AAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval", "NAELOOB                                                                                                                                                                                                                                                                                                                                                                                                                                                                                        ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "AAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAja                                              AAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval" + "'", str2, "AAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAja                                              AAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval");
    }

    @Test
    public void test44483() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest88.test44483");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.repeat("javaj", 100);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "javajjavajjavajjavajjavajjavajjavajjavajjavajjavajjavajjavajjavajjavajjavajjavajjavajjavajjavajjavajjavajjavajjavajjavajjavajjavajjavajjavajjavajjavajjavajjavajjavajjavajjavajjavajjavajjavajjavajjavajjavajjavajjavajjavajjavajjavajjavajjavajjavajjavajjavajjavajjavajjavajjavajjavajjavajjavajjavajjavajjavajjavajjavajjavajjavajjavajjavajjavajjavajjavajjavajjavajjavajjavajjavajjavajjavajjavajjavajjavajjavajjavajjavajjavajjavajjavajjavajjavajjavajjavajjavajjavajjavajjavajjavajjavajjavajjavajjavajjavaj" + "'", str2, "javajjavajjavajjavajjavajjavajjavajjavajjavajjavajjavajjavajjavajjavajjavajjavajjavajjavajjavajjavajjavajjavajjavajjavajjavajjavajjavajjavajjavajjavajjavajjavajjavajjavajjavajjavajjavajjavajjavajjavajjavajjavajjavajjavajjavajjavajjavajjavajjavajjavajjavajjavajjavajjavajjavajjavajjavajjavajjavajjavajjavajjavajjavajjavajjavajjavajjavajjavajjavajjavajjavajjavajjavajjavajjavajjavajjavajjavajjavajjavajjavajjavajjavajjavajjavajjavajjavajjavajjavajjavajjavajjavajjavajjavajjavajjavajjavajjavajjavajjavaj");
    }

    @Test
    public void test44484() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest88.test44484");
        java.lang.Class[] classArray2 = new java.lang.Class[0];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray3 = (java.lang.Class<?>[]) classArray2;
        java.lang.Class<?>[] wildcardClassArray4 = org.apache.commons.lang3.ClassUtils.primitivesToWrappers(wildcardClassArray3);
        java.lang.Class<?> wildcardClass5 = null;
        java.lang.Class[] classArray7 = new java.lang.Class[1];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray8 = (java.lang.Class<?>[]) classArray7;
        wildcardClassArray8[0] = wildcardClass5;
        java.lang.Class<?>[] wildcardClassArray11 = org.apache.commons.lang3.ClassUtils.primitivesToWrappers(wildcardClassArray8);
        boolean boolean13 = org.apache.commons.lang3.ClassUtils.isAssignable(wildcardClassArray3, wildcardClassArray8, true);
        java.lang.Class[] classArray15 = new java.lang.Class[0];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray16 = (java.lang.Class<?>[]) classArray15;
        java.lang.Class<?>[] wildcardClassArray17 = org.apache.commons.lang3.ClassUtils.primitivesToWrappers(wildcardClassArray16);
        java.lang.String str19 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) wildcardClassArray17, "...                                 ");
        boolean boolean20 = org.apache.commons.lang3.ClassUtils.isAssignable(wildcardClassArray8, wildcardClassArray17);
        java.lang.Class<?>[] wildcardClassArray21 = org.apache.commons.lang3.ClassUtils.primitivesToWrappers(wildcardClassArray17);
        java.lang.Class<?>[] wildcardClassArray22 = org.apache.commons.lang3.ClassUtils.primitivesToWrappers(wildcardClassArray21);
        java.lang.Class<?>[] wildcardClassArray23 = org.apache.commons.lang3.ClassUtils.wrappersToPrimitives(wildcardClassArray21);
        java.lang.Class<?>[] wildcardClassArray24 = org.apache.commons.lang3.ClassUtils.primitivesToWrappers(wildcardClassArray23);
        java.lang.String str25 = org.apache.commons.lang3.StringUtils.concatWith("vaj", (java.lang.Object[]) wildcardClassArray24);
        org.junit.Assert.assertNotNull(classArray2);
        org.junit.Assert.assertNotNull(wildcardClassArray3);
        org.junit.Assert.assertNotNull(wildcardClassArray4);
        org.junit.Assert.assertNotNull(classArray7);
        org.junit.Assert.assertNotNull(wildcardClassArray8);
        org.junit.Assert.assertNotNull(wildcardClassArray11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(classArray15);
        org.junit.Assert.assertNotNull(wildcardClassArray16);
        org.junit.Assert.assertNotNull(wildcardClassArray17);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(wildcardClassArray21);
        org.junit.Assert.assertNotNull(wildcardClassArray22);
        org.junit.Assert.assertNotNull(wildcardClassArray23);
        org.junit.Assert.assertNotNull(wildcardClassArray24);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
    }

    @Test
    public void test44485() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest88.test44485");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.substringBetween("", "a.LANG.cLONEABLEsTRINGINTERFACE JAVA.IO", "                                                                       jvStrin                                                                        ");
        org.junit.Assert.assertNull(str3);
    }

    @Test
    public void test44486() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest88.test44486");
        char[] charArray1 = null;
        int int2 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "INTERFACE JAVAaLANGacLONEABLEaaaaaaaJAVAaaaaaaaaaaJAVAaaaaaaaaaaJAVAaaaaaaaaaaJAVAaaaaaaaaaaJAVAaaaaaaaaaaJAVAaaaaaaaaaaJAVAaaaaaaaaaaJAVAaaaaaaaaaaJAVAaaaaaaaaaaJAVAaaaaaaaaaaJAVAaaaaaaaaaaJAVAaaaaaaaaaaJAVAaaaaaaaaaaJAVAaaaaaaaaaaJAVAaaaaaarrINTERFACE JAVAaLANGacLONEABLEaaaaaaaJAVAaaaaaaaaaaJAVAaaaaaaaaaaJAVAaaaaaaaaaaJAVAaaaaaaaaaaJAVAaaaaaaaaaaJAVAaaaaaaaaaaJAVAaaaaaaaaaaJAVAaaaaaaaaaaJAVAaaaaaaaaaaJAVAaaaaaaaaaaJAVAaaaaaaaaaaJAVAaaaaaaaaaaJAVAaaaaaaaaaaJAVAaaaaaaaaaaJAVAaaaaaaa", charArray1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test44487() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest88.test44487");
        java.lang.CharSequence charSequence5 = null;
        char[] charArray15 = new char[] { ' ', ' ', '#', 'a', '4', 'a' };
        int int16 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "", charArray15);
        boolean boolean17 = org.apache.commons.lang3.StringUtils.containsAny("$", charArray15);
        int int18 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "", charArray15);
        boolean boolean19 = org.apache.commons.lang3.StringUtils.containsOnly(charSequence5, charArray15);
        boolean boolean20 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "interface java.lang.CloneableString[]String[]String[]String[]String[]String[]String[]String[]String[]String[]String[]String[]String[]String[]String[]String[]String[]String[]String[]String[]String[]String[]String[]String[]String[]String[]String[]String[]String[]String[]String[]String[]String[]String[]String[]String[]String[]String[]String[]String[]String[]String[]String[]String[]String[]String[]String[]String[]String[]String[]String[]String[]String[]String[]String[]String[]String[]String[]String[]String[]String[]String[]String[]String[]String[]String[]String[]interface java.io.Serializable", charArray15);
        int int21 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "tSslitUgnirtSslitUgnirtSslitUgnirtSslitUgnirtS", charArray15);
        boolean boolean22 = org.apache.commons.lang3.StringUtils.containsAny("                      vv4yL444", charArray15);
        boolean boolean23 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "AVAJECAFRETNI", charArray15);
        int int24 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "   aaaaaa...   ", charArray15);
        org.junit.Assert.assertNotNull(charArray15);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray15), "  #a4a");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray15), "  #a4a");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray15), "[ ,  , #, a, 4, a]");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 9 + "'", int24 == 9);
    }

    @Test
    public void test44488() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest88.test44488");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "                                                                                                                                                                                                                                                                                                                                                                                                                                                                        ", "ASALYAVV                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                            ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test44489() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest88.test44489");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "iNTERFACEJAVA.LANG.cLONEABLE#INTERFACEJAVA.IOINTERFACEJAVA.LANG.cLONEABLE#INTERFACEJAVA.IOINTERFACEJAVA.LANG.cLONEABLE#INTERFACEJAVA.IOINTERFACEJAVABooleanINTERFACEJAVA.LANG.cLONEABLE#INTERFACEJAVA.IOINTERFACEJAVA.LANG.cLONEABLE#INTERFACEJAVA.IOINTERFACEJAVA.LANG.cLONEABLE#INTERFACEJAVA.IOINTERFACEJAVAIN$$$$$$$$$$$$$$$$$$$$$$$$$$$$$...$$$$$$$$$$$$$$$$$$$$$$$$$$$$$...$$$$$$$$$$$$$$$$$$$$$$$$$$aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaINTERFACEJAVA.LANG.cLONEABLE#INTERFACEJAVA.IOINTERFACEJAVA.LANG.cLONEABLE#INTERFACEJAVA.IOINTERFACEJAVA.LANG.cLONEABLE#INTERFACEJAVA.IOINTERFACEJAVABooleanINTERFACEJAVA.LANG.cLONEABLE#INTERFACEJAVA.IOINTERFACEJAVA.LANG.cLONEABLE#INTERFACEJAVA.IOINTERFACEJAVA.LANG.cLONEABLE#INTERFACEJAVA.IOINTERFACEJAVAIN", "####java.uti###############################");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test44490() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest88.test44490");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("Hi!ArrayLis");
        java.lang.String[] strArray7 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("AVAJ.GNAL", "class java.lang.String", 940);
        int int8 = org.apache.commons.lang3.StringUtils.indexOfAny("######################                                                                                                                                  ", strArray7);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str9 = org.apache.commons.lang3.StringUtils.replaceEach("java.io.Serializablejava.lang.CloneableStringinterfaceinterface", strArray2, strArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Search and Replace array lengths don't match: 1 vs 2");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
    }

    @Test
    public void test44491() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest88.test44491");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.defaultString("AAAAAA...1AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA...1AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA...1AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA...1AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA...1AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA", "ayL A    ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "AAAAAA...1AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA...1AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA...1AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA...1AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA...1AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA" + "'", str2, "AAAAAA...1AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA...1AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA...1AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA...1AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA...1AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA");
    }

    @Test
    public void test44492() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest88.test44492");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBetween("javalang", "tcarahCretcarahCretcarahCretcarahCretcarahCretcarahCretcarahCretcarahCretcarahCretcarahCretcarahCretcarahCretcarahCretcarahCretcarahCretcarahCretcarahCretcarahCretcarahCretcarahCretcarahCretcarahCretcarahCretcarahCretcarahCretcarahCretcarahCretcarahCretcara");
        org.junit.Assert.assertNull(str2);
    }

    @Test
    public void test44493() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest88.test44493");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAllLowerCase((java.lang.CharSequence) "StringUtilsStringUtilsStringUtilsStringUtilsStringUtilsStringUtilsStringUtilsStringUtilsStringUtilsStringUtils              Llitu                             Llitu                             Llitu                             Llitu                             Llitu                             Llitu                             Llitu                             Llitu             ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test44494() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest88.test44494");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNumericSpace((java.lang.CharSequence) "                                                                                                                       ylavvsaylavvsaylavvsaylavvsaylavvsaylavvsaylavvsaylavvsaylavvsaylavvsaylavvsaylavvsaylavvsaylavvsaylavvsaylavvsaylavvsaylavvsaylavvsaylavvsaylavvsaylavvsaylavvsaylavvsaylavvsaylavvsaylavvsaylavvsaylavvsaylavvsaylavvsaylavvsaylavvsaylavvsaylavvsaylavvsaylavvsaylavvsaylavvsaylavvsaylavvsaylavvsaylavvsaylavvsaylavvsaylavvsaylavvsaylavvsaylavvsa.LANG.STRINGCLASS JAVA.LANG.STRINGCLASS JAVA.LANG.STRINGCLAS                                                                                                                       ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test44495() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest88.test44495");
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
        java.lang.String str44 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) wildcardClassArray35, "string.nal.avaj ecafretni");
        java.lang.Class<?>[] wildcardClassArray45 = org.apache.commons.lang3.ClassUtils.primitivesToWrappers(wildcardClassArray35);
        java.lang.Class<?>[] wildcardClassArray46 = org.apache.commons.lang3.ClassUtils.toClass((java.lang.Object[]) wildcardClassArray45);
        java.lang.Class<?>[] wildcardClassArray47 = org.apache.commons.lang3.ClassUtils.primitivesToWrappers(wildcardClassArray45);
        java.lang.Class<?>[] wildcardClassArray48 = org.apache.commons.lang3.ClassUtils.wrappersToPrimitives(wildcardClassArray47);
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
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "class java.lang.String" + "'", str44, "class java.lang.String");
        org.junit.Assert.assertNotNull(wildcardClassArray45);
        org.junit.Assert.assertNotNull(wildcardClassArray46);
        org.junit.Assert.assertNotNull(wildcardClassArray47);
        org.junit.Assert.assertNotNull(wildcardClassArray48);
    }

    @Test
    public void test44496() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest88.test44496");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("irfCo.irfioSrAaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAyList");
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test44497() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest88.test44497");
        java.util.Locale locale1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.apache.commons.lang3.StringUtils.lowerCase("GNALJAVA.LANGAVAJ.GNALJAVA.LANGAVAJ.GNALJAVA.LANGH!IH!IH!IH!IH!IH!", locale1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test44498() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest88.test44498");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNumericSpace((java.lang.CharSequence) "$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$-1java.utilString[]");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test44499() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest88.test44499");
        java.lang.Object obj0 = null;
        java.lang.String str2 = org.apache.commons.lang3.ClassUtils.getShortCanonicalName(obj0, "AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA       AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA       AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA       AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA       AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA       AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA       AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA       AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA       AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA       AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA       AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA" + "'", str2, "AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA       AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA       AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA       AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA       AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA       AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA");
    }

    @Test
    public void test44500() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest88.test44500");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("################################...       AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA", "rrayList", (int) (byte) -1);
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray3);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "################################...       AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA" + "'", str4, "################################...       AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA");
    }
}

