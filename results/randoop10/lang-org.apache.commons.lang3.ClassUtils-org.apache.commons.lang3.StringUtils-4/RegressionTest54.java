import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest54 {

    public static boolean debug = false;

    @Test
    public void test27001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest54.test27001");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.remove("interface java.lang.CloneableRFACEJAVA.LANG.CLONEABLEinterface java.io.Serializable", ' ');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "interfacejava.lang.CloneableRFACEJAVA.LANG.CLONEABLEinterfacejava.io.Serializable" + "'", str2, "interfacejava.lang.CloneableRFACEJAVA.LANG.CLONEABLEinterfacejava.io.Serializable");
    }

    @Test
    public void test27002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest54.test27002");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("... ... ... ... ... ... ... ... ... ... ", "444444444444444444.44444444444444444iNTERFACE JAVA$LANG$cLONEABLE$$$$$$$JAVA$$$$$$$$$$JAVA$$$$$$$$$$JAVA$$$$$$$$$$JAVA$$$$$$$$$$JAVA$$$$$$$$$$JAVA$$$$$$$$$$JAVA$$$$$$$$$$JAVA$$$$$$$$$$JAVA$$$$$$$$$$JAVA");
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test27003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest54.test27003");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trimToEmpty("gn lu v j                       ....................................................................");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "gn lu v j                       ...................................................................." + "'", str1, "gn lu v j                       ....................................................................");
    }

    @Test
    public void test27004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest54.test27004");
        int int3 = org.apache.commons.lang3.StringUtils.ordinalIndexOf("interface java.lang.Cloneable-1A.A.Auti.StriAj-1A.A.Auti.StriAjinterface java.io.Serializable", "java.lang.Cloneable4interface java.io.Serializa                                            ", 357);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test27005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest54.test27005");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.upperCase("y");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Y" + "'", str1, "Y");
    }

    @Test
    public void test27006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest54.test27006");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeStart("String[]String[]StLlitung[]String[]String[]String[]String[]String[]", "aaaaaaaaaS.r..gU..lsS.r..gU..lsS.r..gU..lsS.r..gU..lsS.r..gU..lsS.r..gU..lsS.r..gU..lsS.r..gU..lsS.r");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "String[]String[]StLlitung[]String[]String[]String[]String[]String[]" + "'", str2, "String[]String[]StLlitung[]String[]String[]String[]String[]String[]");
    }

    @Test
    public void test27007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest54.test27007");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.reverseDelimited("ss java.lang.Stringu.................................u.................................u.................................u.....................Lass java.lang.Stringu.................................u............................$         44444444444444444444444444444444444444444444444444444444444444444444444444444444                                                           ...saitujairtssaijavaulainterface java.lang.cloneable4interface java.io.serializable...saitujairtssaijavaulainterface java.lang.cloneable4interface java.io.serializable...saitujairtssaijavaulainterface java.lang.cloneable4interface java.io.serializable...saitujairtssaijavaulainterface java.lang.cloneable4interface java.io.serializablLass java.lang.Stringu.................................u.................................u.................................u.....................Lass java.lang.Stringu.................................u............................", '.');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "u.Stringu.lang.Lass java.u.u.u.Stringu.lang.serializablLass java.io.cloneable4interface java.lang.saitujairtssaijavaulainterface java.serializable.io.cloneable4interface java.lang.saitujairtssaijavaulainterface java.serializable.io.cloneable4interface java.lang.saitujairtssaijavaulainterface java.serializable.io.cloneable4interface java.lang.saitujairtssaijavaulainterface java.$         44444444444444444444444444444444444444444444444444444444444444444444444444444444                                                           .u.Stringu.lang.Lass java.u.u.u.Stringu.lang.ss java" + "'", str2, "u.Stringu.lang.Lass java.u.u.u.Stringu.lang.serializablLass java.io.cloneable4interface java.lang.saitujairtssaijavaulainterface java.serializable.io.cloneable4interface java.lang.saitujairtssaijavaulainterface java.serializable.io.cloneable4interface java.lang.saitujairtssaijavaulainterface java.serializable.io.cloneable4interface java.lang.saitujairtssaijavaulainterface java.$         44444444444444444444444444444444444444444444444444444444444444444444444444444444                                                           .u.Stringu.lang.Lass java.u.u.u.Stringu.lang.ss java");
    }

    @Test
    public void test27008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest54.test27008");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceChars("interface java.lang.Cloneableinterface#java.lang.cloneable4interfaceinterface java.io.Serializable", ' ', ' ');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "interface java.lang.Cloneableinterface#java.lang.cloneable4interfaceinterface java.io.Serializable" + "'", str3, "interface java.lang.Cloneableinterface#java.lang.cloneable4interfaceinterface java.io.Serializable");
    }

    @Test
    public void test27009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest54.test27009");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.defaultIfBlank("                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                          ", "CloneableJAVAJAVAJAVAJAVAJA");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "CloneableJAVAJAVAJAVAJAVAJA" + "'", str2, "CloneableJAVAJAVAJAVAJAVAJA");
    }

    @Test
    public void test27010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest54.test27010");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.strip("......javaulainterface java.lang.Cloneable4interface java.io.Serializable.......AyL A4444444444");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "......javaulainterface java.lang.Cloneable4interface java.io.Serializable.......AyL A4444444444" + "'", str1, "......javaulainterface java.lang.Cloneable4interface java.io.Serializable.......AyL A4444444444");
    }

    @Test
    public void test27011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest54.test27011");
        int int2 = org.apache.commons.lang3.StringUtils.countMatches("class java.lang.Objectclass java.lang.Objectclass java.lang.Objectclass java.lang.Objectclass java.lang.Objectclass java.lang.Objectclass java.lang.Objectclass java.lang.Objectclass java.lang.Objectclass java.lang.Objectclass java.lang.Objectclass java.lang.Objectclass java.lang.Objectclass java.lang.Objectclass java.lang.Objectclass java.lang.Objectclass java.lang.Objectclass java.lang.Objectclass java.lang.Objectclass java.lang.Objectclass java.lang.Objectclass java.lang.Object", "");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test27012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest54.test27012");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.contains("AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA", 19);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test27013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest54.test27013");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("JAVAULANG", "              Integer              ", (int) (short) 100);
        java.lang.String str5 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray3, ' ');
        java.lang.String[] strArray6 = org.apache.commons.lang3.StringUtils.stripAll(strArray3);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str10 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray3, ' ', 130, 931);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 130");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "JAVAULANG" + "'", str5, "JAVAULANG");
        org.junit.Assert.assertNotNull(strArray6);
    }

    @Test
    public void test27014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest54.test27014");
        int int3 = org.apache.commons.lang3.StringUtils.ordinalIndexOf("##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#lassjava#lang#String", "aAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA... AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA... AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA... AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA... AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA... AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA... AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA... AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA... AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA... ...ARRAYLISTARRAY", 141);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test27015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest54.test27015");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("gNAL.AVAJ");
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test27016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest54.test27016");
        java.lang.Object obj0 = null;
        java.lang.String str2 = org.apache.commons.lang3.ClassUtils.getShortClassName(obj0, "aa    aaa");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "aa    aaa" + "'", str2, "aa    aaa");
    }

    @Test
    public void test27017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest54.test27017");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOfIgnoreCase("rayListArrayListavaj.gnal                                                           ", "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                               interf$ce#j$v$.l$ng.Clone$ble....................................................................#######################JAVAULANGinterf$ce#j$v$.io.Seri$liz$ble");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test27018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest54.test27018");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.chop("......javaulainterface java.lang.Cloneable4interface java.io.Serializable.......");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "......javaulainterface java.lang.Cloneable4interface java.io.Serializable......" + "'", str1, "......javaulainterface java.lang.Cloneable4interface java.io.Serializable......");
    }

    @Test
    public void test27019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest54.test27019");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.substring("      .", 135, 832);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test27020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest54.test27020");
        java.lang.String[] strArray5 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("-1java.utilString[]    ", "avaj", 89);
        java.lang.String[] strArray6 = org.apache.commons.lang3.StringUtils.stripAll(strArray5);
        java.lang.String[] strArray10 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("..........a", "ARJAVAARRARJAVAARRARJAVAARRARJAVAARRARJAVAARRARJAVAARRARJAVAARRARJAVAARRARJAVAARRARJAVAARRARJAVAARRARJAVAARRARJAVAARRARJAVAARRARJAVAARRARJAVAARRARJAVAARRARJAVAARRARJAVAARRARJAVAARRARJAVAARRARJAVAARRARJAVAARRARJAVAARRARJAVAARRARJAVAARRARJAVAARRARJAVAARRARJAVAARRARJAVAARRARJAVAARRARJAVAARRARJAVAARRARJAVAARRARJAVAARRARJAVAARRARJAVAARRARJAVAARRARJAVAARRARJAVAARRARJAVAARRARJAVAARRARJAVAARRARJAVAARRARJAVAARRARJAVAARRARJAVAARRARJAVAARRARJAVAARRARJAVAARRARJAVAARRARJAVAARRARJAlass java.lang.String", 4);
        java.lang.String str12 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray10, "-1java.utilString[]                                                                                 ");
        java.lang.String str13 = org.apache.commons.lang3.StringUtils.replaceEach("classJAVA.LANGaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaULANG", strArray5, strArray10);
        java.lang.String[] strArray15 = org.apache.commons.lang3.StringUtils.stripAll(strArray5, ".ALya..A");
        boolean boolean16 = org.apache.commons.lang3.StringUtils.endsWithAny("444444444444444444444444444444444444444444444444444444444444444gn                                            gn      tvj.gnlrrylistrrylistrryli", strArray5);
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertNotNull(strArray10);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "..........a" + "'", str12, "..........a");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "classJAVA.LANGaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaULANG" + "'", str13, "classJAVA.LANGaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaULANG");
        org.junit.Assert.assertNotNull(strArray15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test27021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest54.test27021");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("va                                      va                                      va                                      va                                      va                                      va                                      va                                      va                                      va                                      va                                      va                                      va                  lang.javalang.javalang.javava                                      va                                      va                                      va                                      va                                      va                                      va                                      va                                      va                                      va                                      va                                      va                   ", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaava.langjava.langjava.lang... .... .java.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.lang... .... .", 131);
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void test27022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest54.test27022");
        java.lang.CharSequence charSequence2 = org.apache.commons.lang3.StringUtils.defaultIfBlank((java.lang.CharSequence) "java.io.Serializable interface java.lang.Cloneable... interface", (java.lang.CharSequence) "FAVAJ.GNALAVA$$$.JAVA$$$.JAVA$$$.JAVA$$$.JAVA$$$.JAVA$$$.JAVA$$$.JAVA$$$.JAVA$$$.JAVA$$$.JAVA$$$.JAVA$$$.JAVA$$$.JAVA$$$.JAVA$$$.JAVA$$$.JAVA$$$.JAVA$$$.JAVA$$$.JAVA$$$.JAVA$$$.JAVA$$$.JAVA$$$.JAVA$$$.JAVA$$$.JAVA$$$.JAVA$$$.JAVA$$$.JAVA$$$.JAVA$$$.JAVA$$$.JAVA$$$.JAVA$$$.JAVA$$$.JAVAINTERFACE JAVA.IO.SERIALIZABLE");
        org.junit.Assert.assertEquals("'" + charSequence2 + "' != '" + "java.io.Serializable interface java.lang.Cloneable... interface" + "'", charSequence2, "java.io.Serializable interface java.lang.Cloneable... interface");
    }

    @Test
    public void test27023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest54.test27023");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "ava.la", "INTEGERlangAGNALelbazilaireSelbazilaireSelbazilaireSelbazilaireSelbazilaireSelbazilaireSelbazilaireSelbazilaireSelbazilaireSelbazilaireSelbazilaireSelbazilaireSelbazilaireSelbazilaireSelbazilaireSelbazilaireSelbazilaireSelbazilaireSelbazilaireSelbazilaireSelbazilaireSelbazilaireSelbazilaireSelbazilaireSelbazilaireSelbazilaireSelbazilaireSelbazilaireSelbazilaireSelbazilaireSelbazilaireSelbazilaireSelbazilaireSelangAGNALelbazilaireSelbazilaireSelbazilair");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test27024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest54.test27024");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOfIgnoreCase("                                                                                                                                                                                                                                                                    AtsiLytcejbO.gnal.avaj ssalcrrAtsiLytcejbO.gnal.avaj ssalcrrAva.langGNAL..langjava.langAGNAL.AVAJAtsiLytcejbO.gnal.avaj ssalcrrAtsiLytcejbO.gnal.avaj ssalcrrAva.langGNAL..langjava.langAGNAL.AVAJAtsiLytcejbO.gnal.avaj ssalcrrAtsiLytcejbO.gnal.avaj ssalcrrAva.langGNAL..langjava.langAGNAL.AVAJAtsiLytcejbO.gnal.avaj ssalcrrAtsiLytcejStringAtsiLytcejbO.gnal.avaj ssalcrrAtsiLytcejbO.gnal.avaj ssalcrrAva.langGNAL..langjava.langAGNAL.AVAJAtsiLytcejbO.gnal.avaj ssalcrrAtsiLytcejbO.gnal.avaj ssalcrrAva.langGNAL..langjava.langAGNAL.AVAJAtsiLytcejbO.gnal.avaj ssalcrrAtsiLytcejbO.gnal.avaj ssalcrrAva.langGNAL..langjava.langAGNAL.AVAJAtsiLytcejbO.gnal.avaj ssalcrrAtsiLytcejb", "J#v#.l#ngj#v#.l#ngj#v#.l#ngj#v#.l#ngj#v#.l#ngj#v#.l#ngj#v#.l#ngj#v#.l#ngj#v#.l#ngj#v#.l#ngj#v#.l#ngj#v#.l#ngj#v#.l#ngj#v#.l#ngj#v#.l#ngj#v#.l#ngj#v#.l#ngj#v#.l#ngj#v#.l#ngj#v#.l#ngj#v#.l#ngj#v#.l#ngj#v#.l#ngj#v#.l#ngj#v#.l#ngj#v#.l#ngj#v#.l#ngj#v#.l#ngj#v#.l#ngj#v#.l#ngj#v#.l#ngj#v#.l#ngj#v#.l#ng", 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test27025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest54.test27025");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("      AAAAAAAAAAAAAAAAAAA...", "hi!                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                   ", 665);
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.stripAll(strArray3);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertNotNull(strArray4);
    }

    @Test
    public void test27026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest54.test27026");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.substring("INTERFACE GAGA.LANG.CLONEABLEAAAAAAAAAAGAGAL.AGNAAAAAAAAAAGAGAL.AGNAAAAAAAAAAGAGAL.AGNAAAAAAAAAAGAGAL.AGNAAAAAAAAAAGAGAL.AGNAAAAAAAAAAGAGAL.AGNAAAAAAAAAAGAGAL.AGNAAAAAAAAAAGAGAL.AGNAAAAAAAAAAGAGAL.AGNAAAAAAAAAAGAGAL.AGNAAAAAAAAAAGAGAL.AGNAAAAAAAAAAGAGAL.AGNAAAAAAAAAAGAGAL.AGNAAAAAAAAAAGAGAL.AGNAAAAAAAAAAGAGAL.AGNAAAAAAAAAAGAGAL.AGNAAAAAAAAAAGAGAL.AGNAAAAAAAAAAGAGAL.AGNAAAAAAAAAAGAGAL.AGNAAAAAAAAAAGAGAL.AGNAAAAAAAAAAGAGAL.AGNAAAAAAAAAAGAGAL.AGNAAAAAAAAAAGAGAL.AGNAAAAAAAAAAGAGAL.AGNAAAAAAAAAAGAGAL.AGNAAAAAAAAAAGAGAL.AGNAAAAAAAAAAGAGAL.AGNAAAAAAAAAAGAGAL.AGNAAAAAAAAAAGAGAL.AGNAAAAAAAAAAGAGAL.AGNAAAAAAAAAAGAGAL.AGNAAAAAAAAAAGAGAL.AGNAAAAAAAAAAGAGAL.AGNAAAAAAAAAAGAGAL.AGNAAAAAAAAAAGAGAL.AGNAAAAAAAAAARINGINTERFACE GAGA.IO.SERIALIZABLE", 666, 31);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test27027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest54.test27027");
        int int2 = org.apache.commons.lang3.StringUtils.indexOf("                                                                                                                                                                              javaaaaaaaaaava.langava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.lang$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$", 109);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test27028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest54.test27028");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.left("-1JAVA.UTILsTRING-1JAVA ", 662);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "-1JAVA.UTILsTRING-1JAVA " + "'", str2, "-1JAVA.UTILsTRING-1JAVA ");
    }

    @Test
    public void test27029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest54.test27029");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOfIgnoreCase("INTEGE", "a.lang.CloneableStringinterfacejava.io", 524);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test27030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest54.test27030");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBefore("TU", "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test27031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest54.test27031");
        java.util.Locale locale1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.apache.commons.lang3.StringUtils.upperCase("GNALUAVAJ                       GNALUAVAJ                       GNALUAVAJ                       GNALUAVAJ                       GNALUAVAJ                       GNALUAVAJ                       GNALUAVAJ                       GNALUAVAJ                       GNALUAVAJ                       GNALUAVAJ                       GNALUAVAJ                       GNALUAVAJ                       GNALUAVAJ                       GNALUAVAJ                       GNALUAVAJ                       GNALUAVAJ                       GNALUAVAJ                       GNALUAVAJ                       GNALUAVAJ                       GNALUAVAJ                       SSALCGNALAVAJavajlitu", locale1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test27032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest54.test27032");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.substring("         Integer              ", 576, 51);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test27033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest54.test27033");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.chop("etyBetyBetyBetyBetyBetyBetyBetyBetyBetyBetyBetyBetyBetyBetyBetyBetyBetyBetyBetyBetyBetyBetyB");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "etyBetyBetyBetyBetyBetyBetyBetyBetyBetyBetyBetyBetyBetyBetyBetyBetyBetyBetyBetyBetyBetyBety" + "'", str1, "etyBetyBetyBetyBetyBetyBetyBetyBetyBetyBetyBetyBetyBetyBetyBetyBetyBetyBetyBetyBetyBetyBety");
    }

    @Test
    public void test27034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest54.test27034");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass2 = org.apache.commons.lang3.ClassUtils.getClass("444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444JAVA.LANGaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", true);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassNotFoundException; message: 444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444JAVA.LANGaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        } catch (java.lang.ClassNotFoundException e) {
            // Expected exception.
        }
    }

    @Test
    public void test27035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest54.test27035");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.rightPad("Lass java.lang.Stringu.................................u.................................u.................................u.....................", 6, "VAJaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Lass java.lang.Stringu.................................u.................................u.................................u....................." + "'", str3, "Lass java.lang.Stringu.................................u.................................u.................................u.....................");
    }

    @Test
    public void test27036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest54.test27036");
        int int1 = org.apache.commons.lang3.StringUtils.length((java.lang.CharSequence) "siLyarrAtsiLyarrAtsiLyarrAtsiLyarrA.");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 36 + "'", int1 == 36);
    }

    @Test
    public void test27037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest54.test27037");
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("Class", "$######################################################################");
        boolean boolean5 = org.apache.commons.lang3.StringUtils.endsWithAny("JAVA.LANGaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", strArray4);
        int int6 = org.apache.commons.lang3.StringUtils.lastIndexOfAny("", strArray4);
        java.lang.String[] strArray7 = org.apache.commons.lang3.StringUtils.stripAll(strArray4);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNotNull(strArray7);
    }

    @Test
    public void test27038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest54.test27038");
        java.lang.ClassLoader classLoader0 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass3 = org.apache.commons.lang3.ClassUtils.getClass(classLoader0, "                                                                  irfCo$irfioSrA..ayL A.444444444444444444444444444", true);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassNotFoundException; message: irfCo$irfioSrA//ayLA/444444444444444444444444444");
        } catch (java.lang.ClassNotFoundException e) {
            // Expected exception.
        }
    }

    @Test
    public void test27039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest54.test27039");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.leftPad(".......                                                  ", 206, "A..ayL A##############");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "A..ayL A##############A..ayL A##############A..ayL A##############A..ayL A##############A..ayL A##############A..ayL A##############A..ayL A#########.......                                                  " + "'", str3, "A..ayL A##############A..ayL A##############A..ayL A##############A..ayL A##############A..ayL A##############A..ayL A##############A..ayL A#########.......                                                  ");
    }

    @Test
    public void test27040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest54.test27040");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.stripEnd("AL.AGNAAAAAAAAAAJAVAL.AGNAAAAAAAAAAJAVAL.AGNAAAAAAAAAAJAVAL.AGNAAAAAAAAAAJAVAL.AGNAAAAAAAAAAJAVAL.AGNAAAAAAAAAAJAVAL.AGNAAAAAAAAAAJAVAL.AGNAAAAAAAAAAJA                                              AAAAAAAJAVAL.AGNAAAAAAAAAAJAVAL.AGNAAAAAAAAAAJAVAL.AGNAAAAAAAAAAJAVAL.AGNAAAAAAAAAAJAVAL.AGNAAAAAAAAAAJAVAL.AGNAAAAAAAAAAJAVAL.AGNAAAAAAAAAAJAVAL.AGNAAAAAAAAAAJAVAL.AGNAAAAAAAAAAJAVAL.AGNAAAAAAAAAAJAVAL.AGNAAAAAAAAAAJAVAL.AGNAAAAAAAAAARING", "avaj.gnalavaj.gnalavaj.gnal44444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "AL.AGNAAAAAAAAAAJAVAL.AGNAAAAAAAAAAJAVAL.AGNAAAAAAAAAAJAVAL.AGNAAAAAAAAAAJAVAL.AGNAAAAAAAAAAJAVAL.AGNAAAAAAAAAAJAVAL.AGNAAAAAAAAAAJAVAL.AGNAAAAAAAAAAJA                                              AAAAAAAJAVAL.AGNAAAAAAAAAAJAVAL.AGNAAAAAAAAAAJAVAL.AGNAAAAAAAAAAJAVAL.AGNAAAAAAAAAAJAVAL.AGNAAAAAAAAAAJAVAL.AGNAAAAAAAAAAJAVAL.AGNAAAAAAAAAAJAVAL.AGNAAAAAAAAAAJAVAL.AGNAAAAAAAAAAJAVAL.AGNAAAAAAAAAAJAVAL.AGNAAAAAAAAAAJAVAL.AGNAAAAAAAAAARING" + "'", str2, "AL.AGNAAAAAAAAAAJAVAL.AGNAAAAAAAAAAJAVAL.AGNAAAAAAAAAAJAVAL.AGNAAAAAAAAAAJAVAL.AGNAAAAAAAAAAJAVAL.AGNAAAAAAAAAAJAVAL.AGNAAAAAAAAAAJAVAL.AGNAAAAAAAAAAJA                                              AAAAAAAJAVAL.AGNAAAAAAAAAAJAVAL.AGNAAAAAAAAAAJAVAL.AGNAAAAAAAAAAJAVAL.AGNAAAAAAAAAAJAVAL.AGNAAAAAAAAAAJAVAL.AGNAAAAAAAAAAJAVAL.AGNAAAAAAAAAAJAVAL.AGNAAAAAAAAAAJAVAL.AGNAAAAAAAAAAJAVAL.AGNAAAAAAAAAAJAVAL.AGNAAAAAAAAAAJAVAL.AGNAAAAAAAAAARING");
    }

    @Test
    public void test27041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest54.test27041");
        java.lang.String[] strArray0 = null;
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.stripAll(strArray0, "###############################################################################################################################################################");
        org.junit.Assert.assertNull(strArray2);
    }

    @Test
    public void test27042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest54.test27042");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("4444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444aaaaaaaaaa", '$');
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.concat((java.lang.Object[]) strArray2);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "4444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444aaaaaaaaaa" + "'", str3, "4444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444aaaaaaaaaa");
    }

    @Test
    public void test27043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest54.test27043");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOf("GNAL.AVAJGNAL..langGNAL.AVAJGNALLituLlituLlitu444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444", 50, 448);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test27044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest54.test27044");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trim("Av");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Av" + "'", str1, "Av");
    }

    @Test
    public void test27045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest54.test27045");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.reverse("                                 ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "                                 " + "'", str1, "                                 ");
    }

    @Test
    public void test27046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest54.test27046");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.chop("interface java.lang.Cloneable.litinterface java.io.erializable                                                                                                                                                                                                                                                                                                                                                                                                                                                                  ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "interface java.lang.Cloneable.litinterface java.io.erializable                                                                                                                                                                                                                                                                                                                                                                                                                                                                 " + "'", str1, "interface java.lang.Cloneable.litinterface java.io.erializable                                                                                                                                                                                                                                                                                                                                                                                                                                                                 ");
    }

    @Test
    public void test27047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest54.test27047");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.startsWithIgnoreCase("", "Javaaaaaaaaaava.lang");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test27048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest54.test27048");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isWhitespace((java.lang.CharSequence) "                                                                                                                                                                                                                                                                              AAAAAA...                                                                                                                                                                                                                                                                                                                                                                                                    ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test27049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest54.test27049");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfAnyBut("a.lang.CloneableStringinterface java.io                          ", "interface java.lang.CloneableVAJhi!ArrayLis.       444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 16 + "'", int2 == 16);
    }

    @Test
    public void test27050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest54.test27050");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNotBlank((java.lang.CharSequence) "...O.gnal.avaj ssalcrrAtsiLytcejbO.gnal.avaj ssalcrrAva.langGNAL..langjava.langAGNAL.AVA");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test27051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest54.test27051");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("                      integer                       ", "sAitUJAirtSsAitUJAirtSsAitUJAi");
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test27052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest54.test27052");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByCharacterType("BYTEINTERFACE GAGA.LANG.CLONEABLEAAAAAAAAAAGAGAL.AGNAAAAAAAAAAGAGAL.AGNAAAAAAAAAAGAGAL.AGNAAAAAAAAAAGAGAL.AGNAAAAAAAAAAGAGAL.AGNAAAAAAAAAAGAGAL.AGNAAAAAAAAAAGAGAL.AGNAAAAAAAAAAGAGAL.AGNAAAAAAAAAAGAGAL.AGNAAAAAAAAAAGAGAL.AGNAAAAAAAAAAGAGAL.AGNAAAAAAAAAAGAGAL.AGNAAAAAAAAAAGAGAL.AGNAAAAAAAAAAGAGAL.AGNAAAAAAAAAAGAGAL.AGNAAAAAAAAAAGAGAL.AGNAAAAAAAAAAGAGAL.AGNAAAAAAAAAAGAGAL.AGNAAAAAAAAAAGAGAL.AGNAAAAAAAAAAGAGAL.AGNAAAAAAAAAAGAGAL.AGNAAAAAAAAAAGAGAL.AGNAAAAAAAAAAGAGAL.AGNAAAAAAAAAAGAGAL.AGNAAAAAAAAAAGAGAL.AGNAAAAAAAAAAGAGAL.AGNAAAAAAAAAAGAGAL.AGNAAAAAAAAAAGAGAL.AGNAAAAAAAAAAGAGAL.AGNAAAAAAAAAAGAGAL.AGNAAAAAAAAAAGAGAL.AGNAAAAAAAAAAGAGAL.AGNAAAAAAAAAAGAGAL.AGNAAAAAAAAAAGAGAL.AGNAAAAAAAAAAGAGAL.AGNAAAAAAAAAARINGINTERFACE GAGA.IO.SERIALIZABLE");
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.splitByCharacterTypeCamelCase("                                                  ");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str5 = org.apache.commons.lang3.StringUtils.replaceEachRepeatedly(".........ava..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java", strArray2, strArray4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Search and Replace array lengths don't match: 83 vs 1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertNotNull(strArray4);
    }

    @Test
    public void test27053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest54.test27053");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.strip("$$$$$$$$$$$$$$$$$$$$$$$$$$$$$...$$$$$$$$$$$$$$$$$$$$$$$$$$$$$...$$$$$$$$$$$$$$$$$$$$$$$$$$$$$...       ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "$$$$$$$$$$$$$$$$$$$$$$$$$$$$$...$$$$$$$$$$$$$$$$$$$$$$$$$$$$$...$$$$$$$$$$$$$$$$$$$$$$$$$$$$$..." + "'", str1, "$$$$$$$$$$$$$$$$$$$$$$$$$$$$$...$$$$$$$$$$$$$$$$$$$$$$$$$$$$$...$$$$$$$$$$$$$$$$$$$$$$$$$$$$$...");
    }

    @Test
    public void test27054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest54.test27054");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOf("lass java.lang.String$ $ $ $ $ $ $ $ $ $ $ $ $ $ $ $ $ $ $ $ $ $ $ $ $ $ $ $ $ $ $ $ $ $ $ $ $ $ $ $ $ $ $ $ $ $ $ $ $ $ $ $ $ $ $ $ $ $ $ $ $ $ $ $ $ $ $ $ $ $ $ $ $ $ $ $ $ $ $ $ $ $ $ $ $ $ $ $ $ $ $ $ $ $ $ $ $ $ $ $", "aaa");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test27055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest54.test27055");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripToEmpty("                                                                                 ][gnirtSlituGNALUaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaGNAL.AVAJssalCavaj1-");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "][gnirtSlituGNALUaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaGNAL.AVAJssalCavaj1-" + "'", str1, "][gnirtSlituGNALUaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaGNAL.AVAJssalCavaj1-");
    }

    @Test
    public void test27056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest54.test27056");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.chop("tsiyarr.a.lantsiyarr.a.lantsiyarr.a.lantsiyarr.a.lantsiyarr.a.lantsiyarr.a.lantsiyarr.a.lantsiyarr.asaylavvsaylavvsaylavvsaylavvsaylavvsaylavvsaylavvsaylavvsaylavvsaylavvsaylavvsaylavvsaylavvsaylavvsaylavvsaylavvsaylavvsaylavvsaylavvsaylavvsaylavvsaylavvsaylavvsaylavvsaylavvsaylavvsaylavvsaylavvsaylavvsaylavvsaylavvsaylavvsaylavvsaylavvsaylavvsaylavvsaylavvsaylavvsaylavvsaylavvsaylavvsaylavvsaylavvsaylavvsaylavvsaylavvsaylavvsaylavvsaylavvsaylavvsaylavvsaylavvsaylavvsaylavvsaylavvsaylavvsa");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "tsiyarr.a.lantsiyarr.a.lantsiyarr.a.lantsiyarr.a.lantsiyarr.a.lantsiyarr.a.lantsiyarr.a.lantsiyarr.asaylavvsaylavvsaylavvsaylavvsaylavvsaylavvsaylavvsaylavvsaylavvsaylavvsaylavvsaylavvsaylavvsaylavvsaylavvsaylavvsaylavvsaylavvsaylavvsaylavvsaylavvsaylavvsaylavvsaylavvsaylavvsaylavvsaylavvsaylavvsaylavvsaylavvsaylavvsaylavvsaylavvsaylavvsaylavvsaylavvsaylavvsaylavvsaylavvsaylavvsaylavvsaylavvsaylavvsaylavvsaylavvsaylavvsaylavvsaylavvsaylavvsaylavvsaylavvsaylavvsaylavvsaylavvsaylavvsaylavvs" + "'", str1, "tsiyarr.a.lantsiyarr.a.lantsiyarr.a.lantsiyarr.a.lantsiyarr.a.lantsiyarr.a.lantsiyarr.a.lantsiyarr.asaylavvsaylavvsaylavvsaylavvsaylavvsaylavvsaylavvsaylavvsaylavvsaylavvsaylavvsaylavvsaylavvsaylavvsaylavvsaylavvsaylavvsaylavvsaylavvsaylavvsaylavvsaylavvsaylavvsaylavvsaylavvsaylavvsaylavvsaylavvsaylavvsaylavvsaylavvsaylavvsaylavvsaylavvsaylavvsaylavvsaylavvsaylavvsaylavvsaylavvsaylavvsaylavvsaylavvsaylavvsaylavvsaylavvsaylavvsaylavvsaylavvsaylavvsaylavvsaylavvsaylavvsaylavvsaylavvsaylavvs");
    }

    @Test
    public void test27057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest54.test27057");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeStartIgnoreCase("ylist............................rraylist............................rraylist............................rray$arraylis", "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "ylist............................rraylist............................rraylist............................rray$arraylis" + "'", str2, "ylist............................rraylist............................rraylist............................rray$arraylis");
    }

    @Test
    public void test27058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest54.test27058");
        java.lang.String str1 = org.apache.commons.lang3.ClassUtils.getShortClassName("asaayaaaaaaauaaaaaaaaaaaaaaaaaaaaaaaaaaaasaayaaaaaaauaaaa");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "asaayaaaaaaauaaaaaaaaaaaaaaaaaaaaaaaaaaaasaayaaaaaaauaaaa" + "'", str1, "asaayaaaaaaauaaaaaaaaaaaaaaaaaaaaaaaaaaaasaayaaaaaaauaaaa");
    }

    @Test
    public void test27059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest54.test27059");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsIgnoreCase("aaaaaaaaaaaaaaaaaaaaaaGNL$.$VJaaaaaaaaaaaaaaaaaaaaaaasAitUJAirtSsAitUJAirtSsAitUJAirtSsAitUJAirtSsAitUJAirtSsAitUJAirtSsAitUJAirtSsAitUJAirtSsAitUJAirtSsAitUJAirtSsAitUJAirtSsAitUJAirtSsAitUJAirtSsAitUJAirtSsAitUJAirtSsAitUJAirtSsAitUJAirtSsAitUJAirtSsAitUJAirtSsAitUJAirtSsAitUJAirtSsAitUJAirtSsAitUJAirtSsAitUJAirtSsAitUJAirtSsAitUJAirtSsAitUJAirtSsAitUJAirtSsAitUJAirtSsAitUJAirtSsAitUJAirtSsAitUJAirtSsAitUJAirtSsAitUJAirtSsAitUJAirtSsAitUJAirtSsAitUJAirtSsAitUJAirtSsAitUJAirtSsAitUJAirtSsAitUJAirtSsAitUJAirtSsAitUJAirtSsAitUJAirtSsAitUJAirtSsAitUJAirtSsAitUJAirtSsAitUJAirtSsAitUJAirtSsAitUJAirtSsAitUJAirtSsAitUJAirtSsAitUJAirtSsAitUJAirtSsAitUJAirtSsAitUJAirtSsAitUJAirtSsAitUJAirtSsAitUJAirtSsAitUJAirtSsAitUJAirtSsAitUJAirtSsAitUJAirtSsAitUJAirtSsAitUJAirtSsAitUJAirtSsAitUJAirtSsAitUJAirtSsAitUJAirtSsAitUJAirtSsAitUJAirtSsAitUJAirtSsAitUJAirtSsAitUJAirtSsAitUJAirtSsAitUJAirtSsAitUJAirtSsAitUJAirtSsAitUJAirtSsAitUJAirtSsAitUJ", "1java");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test27060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest54.test27060");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trimToNull("$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$ih");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$ih" + "'", str1, "$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$ih");
    }

    @Test
    public void test27061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest54.test27061");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeStartIgnoreCase("                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                    ", "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                    " + "'", str2, "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                    ");
    }

    @Test
    public void test27062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest54.test27062");
        java.lang.String str1 = org.apache.commons.lang3.ClassUtils.getPackageName("ALgAGNAAAAAAAAAAJAVALgAGNAAAAAAAAAAJAVALgAGNAAAAAAAAAAJAVALgAGNAAAAAAAAAAJAVALgAGNAAAAAAAAAAJAVALgAGNAAAAAAAAAAJAVALgAGNAAAAAAAAAAJAVALgAGNAAAAAAAAAAJAAAAAAAAJAVALgAGNAAAAAAAAAAJAVALgAGNAAAAAAAAAAJAVALgAGNAAAAAAAAAAJAVALgAGNAAAAAAAAAAJAVALgAGNAAAAAAAAAAJAVALgAGNAAAAAAAAAAJAVALgAGNAAAAAAAAAAJAVALgAGNAAAAAAAAAAJAVALgAGNAAAAAAAAAAJAVALgAGNAAAAAAAAAAJAVALgAGNAAAAAAAAAAJAVALgAGNAAAAAAAAAARING");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
    }

    @Test
    public void test27063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest54.test27063");
        int int2 = org.apache.commons.lang3.StringUtils.countMatches("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa                                            .aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "444444444444444444.44444444444444444");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test27064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest54.test27064");
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
        java.lang.Class<?>[] wildcardClassArray94 = org.apache.commons.lang3.ClassUtils.primitivesToWrappers(wildcardClassArray91);
        java.lang.String str96 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) wildcardClassArray91, '#');
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
        org.junit.Assert.assertEquals("'" + str96 + "' != '" + "#############################" + "'", str96, "#############################");
    }

    @Test
    public void test27065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest54.test27065");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.uncapitalize((java.lang.CharSequence) "aaaaaaaaaaaa");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "aaaaaaaaaaaa" + "'", str1, "aaaaaaaaaaaa");
    }

    @Test
    public void test27066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest54.test27066");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("JAVA.LITU.AVAJLITU.AVAJJAVA.LITU.AVAJLITU.AVAJJAVA.LITU.AVAJLITU.AVAJJAVA.LITU.AVAJLITU.AVAJJAVA.LITU.AVAJLITU.AVAJJAVA.LITU.AVAJLITU.AVAJJAVA.LITU.AVAJLITU.AVAJJAVA.LITU.AVAJLITU.AVAJJAVA.LITU.AVAJLITU.AVAJJAVA.LITU.AVAJLITU.AVAJJAVA.LITU.AVAJLITU.AVAJJAVA.LITU.AVAJLITU.AVAJJAVA.LITU.AVAJLITU.AVAJJAVA.LITU.AVAJLITU.AVAJJAVA.LITU.AVAJLITU.AVAJJAVA.LITU.AVAJLITU.AVAJJAVA.LITU.AVAJLITU.AVAJJAVA.LITU.AVAJLITU.AVAJJAVA.LITU.AVAJLITU.AVAJJAVA.LITU.AVAJLITU.AVAJJAVA.LITU.AVAJLITU.AVAJJAVA.LITU.AVAJLITU.AVAJJAVA.LITU.AVAJLITU.AVAJJAVA.LITU.AVAJLITU.AVAJJAVA.LITU.AVAJLITU.AVAJJAVA.LITU.AVAJLITU.AVAJJAVA.LITU.AVAJLITU.AVAJJAVA.LITU.AVAJLITU.AVAJJAVA.LITU.AVAJLITU.AVAJJAVA.LITU.AVAJLITU.AVAJJAVA.LITU.AVAJLITU.AVAJJAVA.LITU.AVAJLITU.AVAJJAVA.LITU.AVAJLITU", "ARJAVAARRARJAVAARRARJAVAARRARJAVAARRARJAVAARRARJAVAARRARJAVAARRARJAVAARRARJAVAARRARJAVAARRARJAVAARRARJAVAARRARJAVAARRARJAVAARRARJAVAARRARJAVAARRARJAVAARRARJAVAARRARJAVAARRARJAVAARRARJAVAARRARJAVAARRARJAVAARRARJAVAARRARJAVAARRARJAVAARRARJAVAARRARJAVAARRARJAVAARRARJAVAARRARJAVAARRARJAVAARRARJAVAARRARJAVAARRARJAVAARRARJAVAARRARJAVAARRARJAVAARRARJAVAARRARJAVAARRARJAVAARRARJAVAARRARJAVAARRARJAVAARRARJAVAARRARJAVAARRARJAVAARRARJAVAARRARJAVAARRARJAVAARRARJAVAARRARJAVAARRARJAlass java.lang.String");
        int int3 = org.apache.commons.lang3.StringUtils.indexOfDifference((java.lang.CharSequence[]) strArray2);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test27067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest54.test27067");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.rightPad("###########################################################################$$$$$$$$", 484, "$         $         $         $         $         $         $         $         $         $         $         $         $         $         $         $         $         $         $         $         $         $         $       siLyarrA!iH");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "###########################################################################$$$$$$$$$         $         $         $         $         $         $         $         $         $         $         $         $         $         $         $         $         $         $         $         $         $         $       siLyarrA!iH$         $         $         $         $         $         $         $         $         $         $         $         $         $         $         $         $ " + "'", str3, "###########################################################################$$$$$$$$$         $         $         $         $         $         $         $         $         $         $         $         $         $         $         $         $         $         $         $         $         $         $       siLyarrA!iH$         $         $         $         $         $         $         $         $         $         $         $         $         $         $         $         $ ");
    }

    @Test
    public void test27068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest54.test27068");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.containsWhitespace("-1JAVA.UTILSTRING[]");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test27069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest54.test27069");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.split("44444444444444444.444444444444444444", '#');
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.concat((java.lang.Object[]) strArray2);
        java.lang.Class<?>[] wildcardClassArray4 = org.apache.commons.lang3.ClassUtils.toClass((java.lang.Object[]) strArray2);
        java.lang.Class<?>[] wildcardClassArray5 = org.apache.commons.lang3.ClassUtils.primitivesToWrappers(wildcardClassArray4);
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
        java.lang.Class<?>[] wildcardClassArray36 = org.apache.commons.lang3.ClassUtils.primitivesToWrappers(wildcardClassArray35);
        java.lang.Class<?>[] wildcardClassArray37 = org.apache.commons.lang3.ClassUtils.primitivesToWrappers(wildcardClassArray36);
        java.lang.Class<?>[] wildcardClassArray38 = org.apache.commons.lang3.ClassUtils.wrappersToPrimitives(wildcardClassArray37);
        boolean boolean40 = org.apache.commons.lang3.ClassUtils.isAssignable(wildcardClassArray4, wildcardClassArray37, false);
        java.lang.Class<?>[] wildcardClassArray41 = org.apache.commons.lang3.ClassUtils.wrappersToPrimitives(wildcardClassArray4);
        java.lang.String str43 = org.apache.commons.lang3.ClassUtils.getShortCanonicalName((java.lang.Object) wildcardClassArray4, "oi.agagecafretnignirAAAAAAAAAAnga.lagagAAAAAAAAAAnga.lagagAAAAAAAAAAnga.lagagAAAAAAAAAAnga.lagagAAAAAAAAAAnga.lagagAAAAAAAAAAnga.lagagAAAAAAAAAAnga.lagagAAAAAAAAAAnga.lagagAAAAAAAAAAnga.lagagAAAAAAAAAAnga.lagagAAAAAAAAAAnga.lagagAAAAAAAAAAnga.lagagAAAAAAAAAAnga.lagagAAAAAAAAAAnga.lagagAAAAAAAAAAnga.lagagAAAAAAAAAAnga.lagagAAAAAAAAAAnga.lagagAAAAAAAAAAnga.lagagAAAAAAAAAAnga.lagagAAAAAAAAAAnga.lagagAAAAAAAAAAnga.lagagAAAAAAAAAAnga.lagagAAAAAAAAAAnga.lagagAAAAAAAAAAnga.lagagAAAAAAAAAAnga.lagagAAAAAAAAAAnga.lagagAAAAAAAAAAnga.lagagAAAAAAAAAAnga.lagagAAAAAAAAAAnga.lagagAAAAAAAAAAnga.lagagAAAAAAAAAAnga.lagagAAAAAAAAAAnga.lagagAAAAAAAAAAnga.lagagAAAAAAAAAAnga.lagagAAAAAAAAAAnga.lagagAAAAAAAAAAelbaenolC.gnal.agagecafretni");
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "44444444444444444.444444444444444444" + "'", str3, "44444444444444444.444444444444444444");
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
        org.junit.Assert.assertNotNull(wildcardClassArray35);
        org.junit.Assert.assertNotNull(wildcardClassArray36);
        org.junit.Assert.assertNotNull(wildcardClassArray37);
        org.junit.Assert.assertNotNull(wildcardClassArray38);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + true + "'", boolean40 == true);
        org.junit.Assert.assertNotNull(wildcardClassArray41);
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "Class[]" + "'", str43, "Class[]");
    }

    @Test
    public void test27070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest54.test27070");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNotBlank((java.lang.CharSequence) "gn gnal.avajg");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test27071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest54.test27071");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.split("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaai elbaenolCAgnalAavajiecafretniTRINGi elbaenolCAgnalAavajiecaf", "A..ayLA.", 49);
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void test27072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest54.test27072");
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
        java.lang.String str42 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) wildcardClassArray36, ' ', (int) (short) 0, 0);
        java.lang.String str43 = org.apache.commons.lang3.StringUtils.concatWith("HI!aRRAYlISTaRRAYlISTaRRAYlISTAVAJ.GNALaRRAYlISTaRRAYlISTaRRAYlISTAVAJ", (java.lang.Object[]) wildcardClassArray36);
        java.lang.String[] strArray46 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("hi!", "");
        java.lang.String[] strArray48 = org.apache.commons.lang3.StringUtils.stripAll(strArray46, "$");
        java.lang.Class<?>[] wildcardClassArray49 = org.apache.commons.lang3.ClassUtils.toClass((java.lang.Object[]) strArray46);
        java.lang.Class<?> wildcardClass50 = null;
        java.lang.Class[] classArray52 = new java.lang.Class[1];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray53 = (java.lang.Class<?>[]) classArray52;
        wildcardClassArray53[0] = wildcardClass50;
        java.lang.Class<?>[] wildcardClassArray56 = org.apache.commons.lang3.ClassUtils.primitivesToWrappers(wildcardClassArray53);
        java.lang.String[] strArray58 = new java.lang.String[] { "                                   " };
        java.lang.String str59 = org.apache.commons.lang3.StringUtils.getCommonPrefix(strArray58);
        java.lang.Class<?>[] wildcardClassArray60 = org.apache.commons.lang3.ClassUtils.toClass((java.lang.Object[]) strArray58);
        java.lang.Class<?> wildcardClass61 = null;
        java.lang.Class[] classArray63 = new java.lang.Class[1];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray64 = (java.lang.Class<?>[]) classArray63;
        wildcardClassArray64[0] = wildcardClass61;
        java.lang.Class<?>[] wildcardClassArray67 = org.apache.commons.lang3.ClassUtils.primitivesToWrappers(wildcardClassArray64);
        boolean boolean68 = org.apache.commons.lang3.ClassUtils.isAssignable(wildcardClassArray60, wildcardClassArray64);
        boolean boolean70 = org.apache.commons.lang3.ClassUtils.isAssignable(wildcardClassArray53, wildcardClassArray64, true);
        boolean boolean72 = org.apache.commons.lang3.ClassUtils.isAssignable(wildcardClassArray49, wildcardClassArray64, false);
        java.lang.Class<?>[] wildcardClassArray73 = org.apache.commons.lang3.ClassUtils.primitivesToWrappers(wildcardClassArray49);
        java.lang.Class<?>[] wildcardClassArray74 = org.apache.commons.lang3.ClassUtils.primitivesToWrappers(wildcardClassArray73);
        java.lang.Class<?>[] wildcardClassArray75 = org.apache.commons.lang3.ClassUtils.wrappersToPrimitives(wildcardClassArray73);
        java.lang.String str77 = org.apache.commons.lang3.ClassUtils.getShortClassName((java.lang.Object) wildcardClassArray73, "#                                   ");
        java.lang.Class<?>[] wildcardClassArray78 = org.apache.commons.lang3.ClassUtils.primitivesToWrappers(wildcardClassArray73);
        java.lang.Class<?>[] wildcardClassArray79 = org.apache.commons.lang3.ClassUtils.toClass((java.lang.Object[]) wildcardClassArray78);
        boolean boolean80 = org.apache.commons.lang3.ClassUtils.isAssignable(wildcardClassArray36, wildcardClassArray78);
        java.lang.Class<?> wildcardClass81 = wildcardClassArray36.getClass();
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
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "" + "'", str42, "");
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "class java.lang.String" + "'", str43, "class java.lang.String");
        org.junit.Assert.assertNotNull(strArray46);
        org.junit.Assert.assertNotNull(strArray48);
        org.junit.Assert.assertNotNull(wildcardClassArray49);
        org.junit.Assert.assertNotNull(classArray52);
        org.junit.Assert.assertNotNull(wildcardClassArray53);
        org.junit.Assert.assertNotNull(wildcardClassArray56);
        org.junit.Assert.assertNotNull(strArray58);
        org.junit.Assert.assertEquals("'" + str59 + "' != '" + "                                   " + "'", str59, "                                   ");
        org.junit.Assert.assertNotNull(wildcardClassArray60);
        org.junit.Assert.assertNotNull(classArray63);
        org.junit.Assert.assertNotNull(wildcardClassArray64);
        org.junit.Assert.assertNotNull(wildcardClassArray67);
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + false + "'", boolean68 == false);
        org.junit.Assert.assertTrue("'" + boolean70 + "' != '" + false + "'", boolean70 == false);
        org.junit.Assert.assertTrue("'" + boolean72 + "' != '" + false + "'", boolean72 == false);
        org.junit.Assert.assertNotNull(wildcardClassArray73);
        org.junit.Assert.assertNotNull(wildcardClassArray74);
        org.junit.Assert.assertNotNull(wildcardClassArray75);
        org.junit.Assert.assertEquals("'" + str77 + "' != '" + "Class[]" + "'", str77, "Class[]");
        org.junit.Assert.assertNotNull(wildcardClassArray78);
        org.junit.Assert.assertNotNull(wildcardClassArray79);
        org.junit.Assert.assertTrue("'" + boolean80 + "' != '" + true + "'", boolean80 == true);
        org.junit.Assert.assertNotNull(wildcardClass81);
    }

    @Test
    public void test27073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest54.test27073");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.abbreviate("4444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444aaaaaaaaaa", 200, 325);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "4444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444aaaaaaaaaa" + "'", str3, "4444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444aaaaaaaaaa");
    }

    @Test
    public void test27074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest54.test27074");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphaSpace((java.lang.CharSequence) "####################################################################################################################################################################################################################aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa...1aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa...1aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa...1aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa...1aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa...1aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa...1aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa...1aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa...1aaaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test27075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest54.test27075");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trimToEmpty("rJAVAARR");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "rJAVAARR" + "'", str1, "rJAVAARR");
    }

    @Test
    public void test27076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest54.test27076");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.stripEnd("...tututututututjavaulangr...", "AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA       CharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterChara");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "...tututututututjavaulangr..." + "'", str2, "...tututututututjavaulangr...");
    }

    @Test
    public void test27077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest54.test27077");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsAny("java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java.......", "");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test27078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest54.test27078");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trimToEmpty("ARJAVAARRARJAVAARRARJAVAARRARJAVAARRARJAVAARRARJAVAARRARJAVAARRARJAVAARRARJAVAARRARJAVAARRARJAVAARRARJAVAARRARJAVAARRARJAVAARRARJAVAARRARJAVAARRARJAVAARRARJAVAARRARJAVAARRARJAVAARRARJAVAARRARJAVAARRARJAVAARRARJAVAARRARJAVAARRARJAVAARRARJAVAARRARJAVAARRARJAVAARRARJAVAARRARJAVAARRARJAVAARRARJAVAARRARJAVAARRARJAVAARRARJAVAARRARJAVAARRARJAVAARRARJAVAARRARJAVAARRARJAVAARRARJAVAARRARJAVAARRARJAVAARRARJAVAARRARJAVAARRARJAVAARRARJAVAARRARJAVAARRARJAVAARRARJAVAARRARJAVAARRARJAlass java.lang.String");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "ARJAVAARRARJAVAARRARJAVAARRARJAVAARRARJAVAARRARJAVAARRARJAVAARRARJAVAARRARJAVAARRARJAVAARRARJAVAARRARJAVAARRARJAVAARRARJAVAARRARJAVAARRARJAVAARRARJAVAARRARJAVAARRARJAVAARRARJAVAARRARJAVAARRARJAVAARRARJAVAARRARJAVAARRARJAVAARRARJAVAARRARJAVAARRARJAVAARRARJAVAARRARJAVAARRARJAVAARRARJAVAARRARJAVAARRARJAVAARRARJAVAARRARJAVAARRARJAVAARRARJAVAARRARJAVAARRARJAVAARRARJAVAARRARJAVAARRARJAVAARRARJAVAARRARJAVAARRARJAVAARRARJAVAARRARJAVAARRARJAVAARRARJAVAARRARJAVAARRARJAVAARRARJAlass java.lang.String" + "'", str1, "ARJAVAARRARJAVAARRARJAVAARRARJAVAARRARJAVAARRARJAVAARRARJAVAARRARJAVAARRARJAVAARRARJAVAARRARJAVAARRARJAVAARRARJAVAARRARJAVAARRARJAVAARRARJAVAARRARJAVAARRARJAVAARRARJAVAARRARJAVAARRARJAVAARRARJAVAARRARJAVAARRARJAVAARRARJAVAARRARJAVAARRARJAVAARRARJAVAARRARJAVAARRARJAVAARRARJAVAARRARJAVAARRARJAVAARRARJAVAARRARJAVAARRARJAVAARRARJAVAARRARJAVAARRARJAVAARRARJAVAARRARJAVAARRARJAVAARRARJAVAARRARJAVAARRARJAVAARRARJAVAARRARJAVAARRARJAVAARRARJAVAARRARJAVAARRARJAVAARRARJAVAARRARJAlass java.lang.String");
    }

    @Test
    public void test27079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest54.test27079");
        java.util.Locale locale1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.apache.commons.lang3.StringUtils.lowerCase("A Lya..A                                      ", locale1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test27080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest54.test27080");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("AtsiLytcejbO.gnal.avajssalcrrAtsiLytcejbO.gnal.avajssalcrrAva.langGNAL..langjava.langAGNAL", "                                                                                                                                                                                                                                                              ...$$$$$$$$$$$$$$$...", 850);
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void test27081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest54.test27081");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNumeric((java.lang.CharSequence) "44444444444444444444444444                                 ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test27082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest54.test27082");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.split("TRING", "");
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.stripAll(strArray3);
        boolean boolean5 = org.apache.commons.lang3.StringUtils.endsWithAny("444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444tsilyarrgnaluavajtsilyarrgnaluavaj444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444", strArray4);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test27083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest54.test27083");
        char[] charArray4 = new char[] {};
        int int5 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "$       ", charArray4);
        int int6 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) ".", charArray4);
        int int7 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "                          ", charArray4);
        int int8 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) ".......                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                     ", charArray4);
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray4), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray4), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray4), "[]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
    }

    @Test
    public void test27084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest54.test27084");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("...       ", "hi!", (int) (byte) 0);
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray3);
        java.lang.Class<?>[] wildcardClassArray5 = org.apache.commons.lang3.ClassUtils.toClass((java.lang.Object[]) strArray3);
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
        java.lang.String str39 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) wildcardClassArray27, "JAVAsTRIN");
        boolean boolean41 = org.apache.commons.lang3.ClassUtils.isAssignable(wildcardClassArray5, wildcardClassArray27, false);
        java.lang.Class<?>[] wildcardClassArray42 = org.apache.commons.lang3.ClassUtils.wrappersToPrimitives(wildcardClassArray27);
        java.lang.String str44 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) wildcardClassArray42, 'a');
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "...       " + "'", str4, "...       ");
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
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "" + "'", str39, "");
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertNotNull(wildcardClassArray42);
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "" + "'", str44, "");
    }

    @Test
    public void test27085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest54.test27085");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substring("                                                                               JLANGAVLANGALLANGANG       ", 990);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test27086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest54.test27086");
        int int3 = org.apache.commons.lang3.StringUtils.indexOfIgnoreCase("interface java.lang.Cloneablegnal.avajgnal..LANGgnal.avajgnal.interface java.io.Serializable", "                                                     classjava.langa...                                                      ", 484);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test27087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest54.test27087");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNotEmpty((java.lang.CharSequence) "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                     ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test27088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest54.test27088");
        java.lang.String str2 = org.apache.commons.lang3.ClassUtils.getShortClassName((java.lang.Object) "arrayListArrayListArrayListavaj", "AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "String" + "'", str2, "String");
    }

    @Test
    public void test27089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest54.test27089");
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.split("$       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $", "tringcla", 460);
        boolean boolean5 = org.apache.commons.lang3.StringUtils.startsWithAny("JAVAL.AGNaaaaaaaaaaJAVAL.AGNaaaaaaaaaaJAVAL.AGNaaaaaaaaaaJAVAL.AGNaaaaaaaaaaJAVAL.AGNaaaaaaaaaaJAVAL.AGNaaaaaaaaaaJAVAL.AGNaaaaaaaaaaJAVAL.AGNaaaaaaaaaaJAVAL.AGNaaaaaaaaaaJAVAL.AGNaaaaaaaaaaJAVAL.AGNaaaaaaaaaaJAVAL.AGNaaaaaaaaaaJAVAL.AGNaaaaaaaaaaJAVAL.AGNaaaaaaaaaaJAVAL.AGNaaaaaaaaaaJAVAL.AGNaaaaaaaaaaJAVAL.AGNaaaaaaaaaaJAVAL.AGNaaaaaaaaaaJAVAL.AGNaaaaaaaaaaJAVAL.AGNaaaaaaaaaaJAVAL.AGNaaaaaaaaaaJAVAL.AGNaaaaaaaaaaJAVAL.AGNaaaaaaaaaaJAVAL.AGNaaaaaaaaaaJAVAL.AGNaaaaaaaaaaJAVAL.AGNaaaaaaaaaaJAVAL.AGNaaaaaaaaaaJAVAL.AGNaaaaaaaaaaJAVAL.AGNaaaaaaaaaaJAVAL.AGNaaaaaaaaaaJAVAL.AGNaaaaaaaaaaJAVAL.AGNaaaaaaaaaaJAVAL", strArray4);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test27090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest54.test27090");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.abbreviateMiddle("NTERFACE JAVA.LANG.cLONEABLE....$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$galaa$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$", "GNALUAVAJGNALUAVAJGNALUAVAJGNALUAVAJGNALUAV...", 0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "NTERFACE JAVA.LANG.cLONEABLE....$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$galaa$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$" + "'", str3, "NTERFACE JAVA.LANG.cLONEABLE....$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$galaa$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$");
    }

    @Test
    public void test27091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest54.test27091");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAsciiPrintable((java.lang.CharSequence) "...avaj..........avaj..........avajJAVA..........JAVA..........JAVA..........JA...");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test27092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest54.test27092");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.stripStart("aaaaaaaaaaaa                                  ", "GNL$.$V");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "aaaaaaaaaaaa                                  " + "'", str2, "aaaaaaaaaaaa                                  ");
    }

    @Test
    public void test27093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest54.test27093");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripAccents((java.lang.CharSequence) "A avaj ssalc.gnal.avaa aaalsrrA avaj ssalc.gnal.avaa aaalsrrAva.langGNAa..langaava.langAGNAa.AVAJA avaj ssalc.gnal.avaa aaalsrrA avaj ssalc.gnal.avaa aaalsrrAva.langGNAa..langaava.langAGNAa.AVAJA avaj ssalc.gnal.avaa aaalsrrA avaj ssalc.gnal.avaa aaalsrrAva.langGNAa..langaava.langAGNAa.AVAJA avaj ssalc.gnal.avaa aaalsrrA avaj ssaS rvngA avaj ssalc.gnal.avaa aaalsrrA avaj ssalc.gnal.avaa aaalsrrAva.langGNAa..langaava.langAGNAa.AVAJA avaj ssalc.gnaaaaaa...");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "A avaj ssalc.gnal.avaa aaalsrrA avaj ssalc.gnal.avaa aaalsrrAva.langGNAa..langaava.langAGNAa.AVAJA avaj ssalc.gnal.avaa aaalsrrA avaj ssalc.gnal.avaa aaalsrrAva.langGNAa..langaava.langAGNAa.AVAJA avaj ssalc.gnal.avaa aaalsrrA avaj ssalc.gnal.avaa aaalsrrAva.langGNAa..langaava.langAGNAa.AVAJA avaj ssalc.gnal.avaa aaalsrrA avaj ssaS rvngA avaj ssalc.gnal.avaa aaalsrrA avaj ssalc.gnal.avaa aaalsrrAva.langGNAa..langaava.langAGNAa.AVAJA avaj ssalc.gnaaaaaa..." + "'", str1, "A avaj ssalc.gnal.avaa aaalsrrA avaj ssalc.gnal.avaa aaalsrrAva.langGNAa..langaava.langAGNAa.AVAJA avaj ssalc.gnal.avaa aaalsrrA avaj ssalc.gnal.avaa aaalsrrAva.langGNAa..langaava.langAGNAa.AVAJA avaj ssalc.gnal.avaa aaalsrrA avaj ssalc.gnal.avaa aaalsrrAva.langGNAa..langaava.langAGNAa.AVAJA avaj ssalc.gnal.avaa aaalsrrA avaj ssaS rvngA avaj ssalc.gnal.avaa aaalsrrA avaj ssalc.gnal.avaa aaalsrrAva.langGNAa..langaava.langAGNAa.AVAJA avaj ssalc.gnaaaaaa...");
    }

    @Test
    public void test27094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest54.test27094");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.rightPad("a rrr rrr rrr rrr rrr rrr rrr rrr rrr rrr", (int) (byte) -1, "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "a rrr rrr rrr rrr rrr rrr rrr rrr rrr rrr" + "'", str3, "a rrr rrr rrr rrr rrr rrr rrr rrr rrr rrr");
    }

    @Test
    public void test27095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest54.test27095");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.reverseDelimited("                                                                                 .........", 'a');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                                                                 ........." + "'", str2, "                                                                                 .........");
    }

    @Test
    public void test27096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest54.test27096");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trim("iNTERFjava..........java..........java...IZABLE");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "iNTERFjava..........java..........java...IZABLE" + "'", str1, "iNTERFjava..........java..........java...IZABLE");
    }

    @Test
    public void test27097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest54.test27097");
        java.lang.CharSequence charSequence2 = org.apache.commons.lang3.StringUtils.defaultIfEmpty((java.lang.CharSequence) "Gnirt...", (java.lang.CharSequence) "AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA");
        org.junit.Assert.assertEquals("'" + charSequence2 + "' != '" + "Gnirt..." + "'", charSequence2, "Gnirt...");
    }

    @Test
    public void test27098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest54.test27098");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("ListrrayListrrayListrrayListrrayListrrayListrrayListrrayListrrayListrr...    ...rrayListrrayListrrayListrrayListrrayListrrayListrrayListrrayListrrayListrra", "            java.util             ", 62);
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void test27099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest54.test27099");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) " String  ", "####.........................................####");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test27100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest54.test27100");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("javastringnalarraylistarraylistarraylistavaj.gnalarraylistarraylistarrayli", '.');
        java.lang.String str4 = org.apache.commons.lang3.ClassUtils.getPackageName((java.lang.Object) '.', "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa                                            #aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "java.lang" + "'", str4, "java.lang");
    }

    @Test
    public void test27101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest54.test27101");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trimToEmpty("                                                                                               ass java.lang.String");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "ass java.lang.String" + "'", str1, "ass java.lang.String");
    }

    @Test
    public void test27102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest54.test27102");
        java.lang.CharSequence charSequence2 = org.apache.commons.lang3.StringUtils.defaultIfBlank((java.lang.CharSequence) "gn lu v j                       ....................................................................gn lu v j                       ....................................................................gn lu v j                       ......................................                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                     ArrayListArrayListArrayListavajagnal", (java.lang.CharSequence) "...aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa... aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa... aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa... aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa... aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa... aaaaaaaaaaaaaaaaaaaaaaaaaa...");
        org.junit.Assert.assertEquals("'" + charSequence2 + "' != '" + "gn lu v j                       ....................................................................gn lu v j                       ....................................................................gn lu v j                       ......................................                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                     ArrayListArrayListArrayListavajagnal" + "'", charSequence2, "gn lu v j                       ....................................................................gn lu v j                       ....................................................................gn lu v j                       ......................................                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                     ArrayListArrayListArrayListavajagnal");
    }

    @Test
    public void test27103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest54.test27103");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.rightPad("rraylist                            rraylist                            rraylist                            rray$arrayli", 954);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "rraylist                            rraylist                            rraylist                            rray$arrayli                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                  " + "'", str2, "rraylist                            rraylist                            rraylist                            rray$arrayli                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                  ");
    }

    @Test
    public void test27104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest54.test27104");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.split("jAV-1JAVA.UTILsTRING-1JAVA.UTILsTRING-1JAVA.UTILsTRING-1JAVA.UTILsTRING-1JAVA");
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test27105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest54.test27105");
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("GNALGNALGNALGNALGNALGNALGNALGNALGNALGNALGNALGNALGNALGNALGNALGNALGNALGNALGNALGNALGNALGNALGNALGNALGNALGNALGNALGNALGNAL.lang.lang.lang.lang.lang.lang.lLITUAVA.LA", "AAAAAAAAAAAAAAAAAAA", 47);
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray4, "...       aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", 386, 63);
        boolean boolean9 = org.apache.commons.lang3.StringUtils.startsWithAny("        avajlitu         ", strArray4);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test27106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest54.test27106");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.uncapitalize((java.lang.CharSequence) "class [Ljava.lang.Class;class [Ljava.lang.Class;class [Ljava.lang.Class;class [Ljava.lang");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "class [Ljava.lang.Class;class [Ljava.lang.Class;class [Ljava.lang.Class;class [Ljava.lang" + "'", str1, "class [Ljava.lang.Class;class [Ljava.lang.Class;class [Ljava.lang.Class;class [Ljava.lang");
    }

    @Test
    public void test27107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest54.test27107");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.substringsBetween("blealiza.io.Seriavacejable#interfang.Clonea.lavacejainterf", "ArrayLis.....", "interface#java.lang.Cloneable4interface#java.io.Serializable");
        org.junit.Assert.assertNull(strArray3);
    }

    @Test
    public void test27108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest54.test27108");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("AL..langjava.langAGNAL.AVAJ", "Va                                      ");
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test27109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest54.test27109");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("$ $ $ $ $ $ $ $ $ $ $ $ $ $ $ $ $ $ $ $ $ $ $ siLyarrA!iH", "ArrayLast");
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test27110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest54.test27110");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "lass...", "tuLlituLlituLlituLlituLlituLlituLlituLlituLlituLlituLlituLlituLlituL");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test27111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest54.test27111");
        java.lang.String str1 = org.apache.commons.lang3.ClassUtils.getPackageCanonicalName("GNAL.AVAJLANG.JAVAGNAL.AVAJLANG.JAVAGNAL.AVAJLANG.JAVAGNAL.AVAJLANG.JAVAGNAL.AVAJLANG.JAVAGNAL.AVAJLANG.JAVAGNAL.AVAJLANG.JAVAGNAL.AVAJLANG.JAVAGNAL.AVAJ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "GNAL.AVAJLANG.JAVAGNAL.AVAJLANG.JAVAGNAL.AVAJLANG.JAVAGNAL.AVAJLANG.JAVAGNAL.AVAJLANG.JAVAGNAL.AVAJLANG.JAVAGNAL.AVAJLANG.JAVAGNAL.AVAJLANG.JAVAGNAL" + "'", str1, "GNAL.AVAJLANG.JAVAGNAL.AVAJLANG.JAVAGNAL.AVAJLANG.JAVAGNAL.AVAJLANG.JAVAGNAL.AVAJLANG.JAVAGNAL.AVAJLANG.JAVAGNAL.AVAJLANG.JAVAGNAL.AVAJLANG.JAVAGNAL");
    }

    @Test
    public void test27112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest54.test27112");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trimToNull("aaaaaaaaaajaval.agnaaaaaaaaaajaval.agnaaaaaaaaaajaval$ArrayList");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "aaaaaaaaaajaval.agnaaaaaaaaaajaval.agnaaaaaaaaaajaval$ArrayList" + "'", str1, "aaaaaaaaaajaval.agnaaaaaaaaaajaval.agnaaaaaaaaaajaval$ArrayList");
    }

    @Test
    public void test27113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest54.test27113");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeEndIgnoreCase("java.io.Serializablejava.lang.CloneableStringinterfaceinterface", "                                                                                                                                             va.langGNAL..la..                                                                                   etyBetyBetyBetyBetyBetyBetyBetyBetyBetyBetyBetyBetyBetyBetyBetyBetyBetyBetyBetyBetyBetyBetyB                                                                                                                                                                                                                             va.langGNAL..la..                                                                                    ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "java.io.Serializablejava.lang.CloneableStringinterfaceinterface" + "'", str2, "java.io.Serializablejava.lang.CloneableStringinterfaceinterface");
    }

    @Test
    public void test27114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest54.test27114");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.split("                                  ");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.getCommonPrefix(strArray2);
        boolean boolean4 = org.apache.commons.lang3.StringUtils.endsWithAny("                                                                                                                                                                                                                                                                                                                                                                                                                                                                  aaaaaaaaaaaaaaaaaaaaaaGNL$.$VJaaaaaaaaaaaaaaaaaaaaaaa                                                                                                                                                                                                                                                                                                                                                                                                                                                                   ", strArray2);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test27115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest54.test27115");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.mid("GNAL.AL.ARRAYLISTGNAL.AL.ARRAYLISTGNAL.AGNAL.AVAJGNAL.AVAJGNAL.AVAJGNAL.AVAJGNAL.AVAJGNAL.AVAJGNAL.AVAJGNAL.AVAJGNAL.AVAJGNAL.AVAJGNAL.AVAJGNAL.AVAJGNAL.AVAJGNAL.AVAJGNAL.AVAJGNAL.AVAJGNAL.AVAJGNAL.AVAJGNAL.AVAJGNAL.AVAJGNAL.AVAJGNAL.AVAJGNAL.AVAJGNAL.AVAJGNAL.AVAJGNAL.AVAJGNAL.AVAJGNAL.AVAGNAL.AVAAAAAAAAAAVAJARRAYLISTGNAL.AL.ARRAYLISTGNAL.AL.ARRAYLIST", 993, 12);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test27116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest54.test27116");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNotEmpty((java.lang.CharSequence) "... $$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test27117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest54.test27117");
        java.lang.String str1 = org.apache.commons.lang3.ClassUtils.getPackageName("elbazilaireS.oi.avaj ecafretniavaj..........avatcejbO.......avaj.......elbaenolC.gnal.avaj ecafretni444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "elbazilaireS.oi.avaj ecafretniavaj..........avatcejbO.......avaj.......elbaenolC.gnal" + "'", str1, "elbazilaireS.oi.avaj ecafretniavaj..........avatcejbO.......avaj.......elbaenolC.gnal");
    }

    @Test
    public void test27118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest54.test27118");
        java.lang.ClassLoader classLoader0 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass3 = org.apache.commons.lang3.ClassUtils.getClass(classLoader0, "44444444444444444444444444444444444444444444444]TU44444444444444444444444444444444444444444444444                                                                                                                                                                                                                                                                                                                               ", false);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassNotFoundException; message: 44444444444444444444444444444444444444444444444]TU44444444444444444444444444444444444444444444444");
        } catch (java.lang.ClassNotFoundException e) {
            // Expected exception.
        }
    }

    @Test
    public void test27119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest54.test27119");
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.replace("", "A..AYLA.44444444444444444444444444", "..................................", 446);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
    }

    @Test
    public void test27120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest54.test27120");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOf("#####################################################", 325);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test27121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest54.test27121");
        java.lang.ClassLoader classLoader0 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass3 = org.apache.commons.lang3.ClassUtils.getClass(classLoader0, "..AAAA                       JAVAULANGrrayListyLA.", false);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassNotFoundException; message: //AAAAJAVAULANGrrayListyLA/");
        } catch (java.lang.ClassNotFoundException e) {
            // Expected exception.
        }
    }

    @Test
    public void test27122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest54.test27122");
        java.lang.String str1 = org.apache.commons.lang3.ClassUtils.getPackageName("LANGgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgna");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
    }

    @Test
    public void test27123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest54.test27123");
        int int1 = org.apache.commons.lang3.StringUtils.length((java.lang.CharSequence) "aa                                    ");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 38 + "'", int1 == 38);
    }

    @Test
    public void test27124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest54.test27124");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.uncapitalize((java.lang.CharSequence) "                                                    ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "                                                    " + "'", str1, "                                                    ");
    }

    @Test
    public void test27125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest54.test27125");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.abbreviate("gnaaaaaa...aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", 168);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "gnaaaaaa...aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa" + "'", str2, "gnaaaaaa...aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
    }

    @Test
    public void test27126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest54.test27126");
        java.lang.String[] strArray5 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("AAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAA", "-1java.utilString[]");
        boolean boolean6 = org.apache.commons.lang3.StringUtils.endsWithAny("JAVA", strArray5);
        java.lang.String[] strArray10 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("AAAA                       JAVAULANGrrayList", "hi!ArrayLis");
        java.lang.String[] strArray16 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("...", "                                   ", (int) 'a');
        java.lang.String[] strArray17 = org.apache.commons.lang3.StringUtils.stripAll(strArray16);
        int int18 = org.apache.commons.lang3.StringUtils.lastIndexOfAny("                                                                                                    ", strArray16);
        java.lang.String[] strArray22 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("-1java.utilString[]    ", "avaj", 89);
        java.lang.String str23 = org.apache.commons.lang3.StringUtils.replaceEach("litulitulitulitulitul####litulitulitulitulitul", strArray16, strArray22);
        java.lang.String str24 = org.apache.commons.lang3.StringUtils.replaceEach("4444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444aaaaaaaaaa", strArray10, strArray22);
        java.lang.String str26 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray10, "Stringc");
        java.lang.String str27 = org.apache.commons.lang3.StringUtils.replaceEach("                                  $$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$", strArray5, strArray10);
        java.lang.String[] strArray29 = org.apache.commons.lang3.StringUtils.stripAll(strArray10, "-1JAVA.UTILsTRING-1JAVA");
        java.lang.Class<?>[] wildcardClassArray30 = org.apache.commons.lang3.ClassUtils.toClass((java.lang.Object[]) strArray10);
        java.lang.String[] strArray33 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("################################...       AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA", '.');
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str34 = org.apache.commons.lang3.StringUtils.replaceEach("A                                      .A Lya", strArray10, strArray33);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Search and Replace array lengths don't match: 1 vs 4");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(strArray10);
        org.junit.Assert.assertNotNull(strArray16);
        org.junit.Assert.assertNotNull(strArray17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertNotNull(strArray22);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "litulitulitulitulitul####litulitulitulitulitul" + "'", str23, "litulitulitulitulitul####litulitulitulitulitul");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "4444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444aaaaaaaaaa" + "'", str24, "4444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444aaaaaaaaaa");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "AAAA                       JAVAULANGrrayList" + "'", str26, "AAAA                       JAVAULANGrrayList");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "                                  $$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$" + "'", str27, "                                  $$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$");
        org.junit.Assert.assertNotNull(strArray29);
        org.junit.Assert.assertNotNull(wildcardClassArray30);
        org.junit.Assert.assertNotNull(strArray33);
    }

    @Test
    public void test27127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest54.test27127");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.chomp("a$.lang.Stringclass java.lang.Stringclass java.lang.Stringclas.lang.Stringclass java.lang.Stringc", "AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA... AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA... AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA... AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA... AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA... AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA... AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA... AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA... AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA... AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "a$.lang.Stringclass java.lang.Stringclass java.lang.Stringclas.lang.Stringclass java.lang.Stringc" + "'", str2, "a$.lang.Stringclass java.lang.Stringclass java.lang.Stringclas.lang.Stringclass java.lang.Stringc");
    }

    @Test
    public void test27128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest54.test27128");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.center("##########################################################################################################################################################################################################################JAVA.LANG$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$                                                                                                                                                                                                                                                                                                                                                                                                                                                                 ##########################################################################################################################################################################################################################", 181);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "##########################################################################################################################################################################################################################JAVA.LANG$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$                                                                                                                                                                                                                                                                                                                                                                                                                                                                 ##########################################################################################################################################################################################################################" + "'", str2, "##########################################################################################################################################################################################################################JAVA.LANG$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$                                                                                                                                                                                                                                                                                                                                                                                                                                                                 ##########################################################################################################################################################################################################################");
    }

    @Test
    public void test27129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest54.test27129");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.substringsBetween("444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444litu avajli", "44444444444444444.4....ArrayListArrayListArrayListArrayLis.", "interface java.lang.CloneableLlituLlituLlituLlituLlituLlituLlituLlituLlituLlituLlituLlituLlituLlituLlituLlituLlituLlituLlituLlituLlituLlituLlituLlituLlituLlituLlituLlituLlituLlituLlituLlituLlituLlituLlituinterface java.io.Serializable");
        org.junit.Assert.assertNull(strArray3);
    }

    @Test
    public void test27130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest54.test27130");
        int int3 = org.apache.commons.lang3.StringUtils.ordinalIndexOf("JAVA.L$ArrayAAAAAAAAAA", "Class[]", 217);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test27131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest54.test27131");
        int int1 = org.apache.commons.lang3.StringUtils.length((java.lang.CharSequence) "                                         Hi!ArrayLis$$$$$$$$$$$$$$$$$$$$$$$                                          ");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 117 + "'", int1 == 117);
    }

    @Test
    public void test27132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest54.test27132");
        int int2 = org.apache.commons.lang3.StringUtils.getLevenshteinDistance((java.lang.CharSequence) "ava.la", (java.lang.CharSequence) "avajgnal.avajgnal.avajgnal.avajgnal.avajgnal.avajgnal.avajgnal.avajgnal.avajgnal.avaJavajgnal.avajgnal.avajgnal.avajgnal.avajgnal.avajgnal.avajgnal.avajgnal.avajgnal.avaJavajgnal.avajgnal.avajgnal.avajgnal.avajgnal.avajgnal.avajgnal.avajgnal.avajgnal.avaJavajgnal.avajgnal.avajgnal.avajgnal.avajgnal.avajgnal.avajgnal.avajgnal.avajgnal.avaJavajgnal.avajgnal.avajgnal.avajgnal.avajgnal.avajgnal.avajgnal.avajgnal.avajgnal.avaJavajgnal.avajgnal.avajgnal.avajgnal.avajgnal.avajgnal.avajgnal.avajgnal.avajgnal.avaJavajgnal.avajgnal.avajgnal.avajgnal.avajgnal.avajgnal.avajgnal.avajgnal.avajgnal.avaJavajgnal.avajgnal.avajgnal.avajgnal.avajgnal.avajgnal.avajgnal.avajgnal.avajgnal.avaJavajgnal.avajgnal.avajgnal.avajgnal.avajgnal.avajgnal.avajgnal.avajgnal.avajgnal.avaJavajgnal.avajgnal.avajgnal.avajgnal.avajgnal.avajgnal.avajgnal.avajgnal.avajgnal.avaJ");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 844 + "'", int2 == 844);
    }

    @Test
    public void test27133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest54.test27133");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOfIgnoreCase("AAAA                       JAVAULANGrrayList", "JAVA.LANGAGNAL.AVAJGNAL..LANGGNAL.AVARRCLASS JAVA.LANG.OBJECTYLISTARRCLASS JAVA.LANG.OBJECTYLISTA", 6);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test27134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest54.test27134");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("                                                                                                                                                                                                                                                                                                                                                                                                         utiljava.util444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444                                                                                                                                                                                                                                                                                                                                                                                                         ", "#########################################################...", 954);
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void test27135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest54.test27135");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.split("...AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA...AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA...AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA...AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA...AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA...AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA...AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA...AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA...AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA.", '#');
        java.lang.String[] strArray6 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("Character", ' ');
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.replaceEach("java.langjava.langjava.langjava.langjava.langjava.la                                                ", strArray3, strArray6);
        java.lang.String str9 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray6, "gnal.avajgnal..LANGgnal.avajgnal.");
        java.lang.String str11 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray6, 'a');
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "java.langjava.langjava.langjava.langjava.langjava.la                                                " + "'", str7, "java.langjava.langjava.langjava.langjava.langjava.la                                                ");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Character" + "'", str9, "Character");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Character" + "'", str11, "Character");
    }

    @Test
    public void test27136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest54.test27136");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsIgnoreCase("                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                            ##########################################################################Byte###########################################################################", "4444444444444                           rrayList                            rrayList                            rrayList                            rrayclass java.lang.StringArrayLis");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test27137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest54.test27137");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.remove("javaulangrraylistjavaulangrraylistjavaulangrraylistjavaulangrraylistjavaulangrraylistjavaulangrraylistjavaulangrraylistjavaula", '$');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "javaulangrraylistjavaulangrraylistjavaulangrraylistjavaulangrraylistjavaulangrraylistjavaulangrraylistjavaulangrraylistjavaula" + "'", str2, "javaulangrraylistjavaulangrraylistjavaulangrraylistjavaulangrraylistjavaulangrraylistjavaulangrraylistjavaulangrraylistjavaula");
    }

    @Test
    public void test27138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest54.test27138");
        int int1 = org.apache.commons.lang3.StringUtils.length((java.lang.CharSequence) "                                                                                                                                                                                                                                                                                                                                                        ArryListArryListArryListvjGNAL.AVAJLANG.JAVAGNAL.AVAJLANG.JAVAGNAL.AVAJLANG.JAVAGNAL.AVAJLANG.JAVAGNAL.AVAJLANG.JAVAGNAL.AVAJLANG.JAVAGNAL.AVAJLANG.JAVAGNAL.AVAJLANG.JAVAGNAL.AVAJgnl                                                                                                                                                                                                                                                                                                                                                                                           ");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 905 + "'", int1 == 905);
    }

    @Test
    public void test27139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest54.test27139");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsAny("][gnirtSlitu.avaj1-", "       integer        ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test27140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest54.test27140");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNotEmpty((java.lang.CharSequence) "iLyarrAtsiLyarrAtsiLyarrAlang.javatsiLyarrAtsiLyarrAtsiLyarrA");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test27141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest54.test27141");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.defaultIfEmpty("javaulainterface java.lang.Cloneable4interface java.io.Serializable", "sClassslitUgnirtSslitUgnirtSslitUgnirtSslitUgnirtSslitUgnirtSslitUgnirtSslitUgnirtSslitUgnirtSslitUgnirtSslitUgnirtS");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "javaulainterface java.lang.Cloneable4interface java.io.Serializable" + "'", str2, "javaulainterface java.lang.Cloneable4interface java.io.Serializable");
    }

    @Test
    public void test27142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest54.test27142");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.center("RFACE JAVA.LANG.CLONEABLELANG.GNALJAVA.LANGgnaluAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAgnal.avajSSALC.GNALJAVA.LANGgnaluAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAgnal.avajSSALC.GNALJAVA.LANGgnaluAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAgnal.avajSSALC.GNALJAVA.LANGgnaluAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAgnal.avajSSALC.GNALJAVA.LANGgnaluAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAgnal.avajSSALC.GNALJAVA.LANGgnaluAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAgnal.avajSSALC.GN", 162, '.');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "RFACE JAVA.LANG.CLONEABLELANG.GNALJAVA.LANGgnaluAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAgnal.avajSSALC.GNALJAVA.LANGgnaluAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAgnal.avajSSALC.GNALJAVA.LANGgnaluAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAgnal.avajSSALC.GNALJAVA.LANGgnaluAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAgnal.avajSSALC.GNALJAVA.LANGgnaluAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAgnal.avajSSALC.GNALJAVA.LANGgnaluAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAgnal.avajSSALC.GN" + "'", str3, "RFACE JAVA.LANG.CLONEABLELANG.GNALJAVA.LANGgnaluAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAgnal.avajSSALC.GNALJAVA.LANGgnaluAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAgnal.avajSSALC.GNALJAVA.LANGgnaluAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAgnal.avajSSALC.GNALJAVA.LANGgnaluAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAgnal.avajSSALC.GNALJAVA.LANGgnaluAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAgnal.avajSSALC.GNALJAVA.LANGgnaluAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAgnal.avajSSALC.GN");
    }

    @Test
    public void test27143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest54.test27143");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.remove("String", "JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "String" + "'", str2, "String");
    }

    @Test
    public void test27144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest54.test27144");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass2 = org.apache.commons.lang3.ClassUtils.getClass("...                                                      assJAVA.LANGa                                                     Cl", false);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassNotFoundException; message: ///assJAVA/LANGaCl");
        } catch (java.lang.ClassNotFoundException e) {
            // Expected exception.
        }
    }

    @Test
    public void test27145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest54.test27145");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOf("", 243, 655);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test27146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest54.test27146");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trim("interface gaga.lang.CloneableAAAAAAAAAAgagal.agnAAAAAAAAAAgagal.agnAAAAAAAAAAgagal.agnAAAAAAAAAAgagal.agnAAAAAAAAAAgagal.agnAAAAAAAAAAgagal.agnAAAAAAAAAAgagal.agnAAAAAAAAAAgagal.agnAAAAAAAAAAgagal.agnAAAAAAAAAAgagal.agnAAAAAAAAAAgagal.agnAAAAAAAAAAgagal.agnAAAAAAAAAAgagal.agnAAAAAAAAAAgagal.agnAAAAAAAAAAgagal.agnAAAAAAAAAAgagal.agnAAAAAAAAAAgagal.agnAAAAAAAAAAgagal.agnAAAAAAAAAAgagal.agnAAAAAAAAAAgagal.agnAAAAAAAAAAgagal.agnAAAAAAAAAAgagal.agnAAAAAAAAAAgagal.agnAAAAAAAAAAgagal.agnAAAAAAAAAAgagal.agnAAAAAAAAAAgagal.agnAAAAAAAAAAgagal.agnAAAAAAAAAAgagal.agnAAAAAAAAAAgagal.agnAAAAAAAAAAgagal.agnAAAAAAAAAAgagal.agnAAAAAAAAAAgagal.agnAAAAAAAAAAgagal.agnAAAAAAAAAAgagal.agnAAAAAAAAAAgagal.agnAAAAAAAAAAringinterface gaga.io.Serializable");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "interface gaga.lang.CloneableAAAAAAAAAAgagal.agnAAAAAAAAAAgagal.agnAAAAAAAAAAgagal.agnAAAAAAAAAAgagal.agnAAAAAAAAAAgagal.agnAAAAAAAAAAgagal.agnAAAAAAAAAAgagal.agnAAAAAAAAAAgagal.agnAAAAAAAAAAgagal.agnAAAAAAAAAAgagal.agnAAAAAAAAAAgagal.agnAAAAAAAAAAgagal.agnAAAAAAAAAAgagal.agnAAAAAAAAAAgagal.agnAAAAAAAAAAgagal.agnAAAAAAAAAAgagal.agnAAAAAAAAAAgagal.agnAAAAAAAAAAgagal.agnAAAAAAAAAAgagal.agnAAAAAAAAAAgagal.agnAAAAAAAAAAgagal.agnAAAAAAAAAAgagal.agnAAAAAAAAAAgagal.agnAAAAAAAAAAgagal.agnAAAAAAAAAAgagal.agnAAAAAAAAAAgagal.agnAAAAAAAAAAgagal.agnAAAAAAAAAAgagal.agnAAAAAAAAAAgagal.agnAAAAAAAAAAgagal.agnAAAAAAAAAAgagal.agnAAAAAAAAAAgagal.agnAAAAAAAAAAgagal.agnAAAAAAAAAAgagal.agnAAAAAAAAAAgagal.agnAAAAAAAAAAringinterface gaga.io.Serializable" + "'", str1, "interface gaga.lang.CloneableAAAAAAAAAAgagal.agnAAAAAAAAAAgagal.agnAAAAAAAAAAgagal.agnAAAAAAAAAAgagal.agnAAAAAAAAAAgagal.agnAAAAAAAAAAgagal.agnAAAAAAAAAAgagal.agnAAAAAAAAAAgagal.agnAAAAAAAAAAgagal.agnAAAAAAAAAAgagal.agnAAAAAAAAAAgagal.agnAAAAAAAAAAgagal.agnAAAAAAAAAAgagal.agnAAAAAAAAAAgagal.agnAAAAAAAAAAgagal.agnAAAAAAAAAAgagal.agnAAAAAAAAAAgagal.agnAAAAAAAAAAgagal.agnAAAAAAAAAAgagal.agnAAAAAAAAAAgagal.agnAAAAAAAAAAgagal.agnAAAAAAAAAAgagal.agnAAAAAAAAAAgagal.agnAAAAAAAAAAgagal.agnAAAAAAAAAAgagal.agnAAAAAAAAAAgagal.agnAAAAAAAAAAgagal.agnAAAAAAAAAAgagal.agnAAAAAAAAAAgagal.agnAAAAAAAAAAgagal.agnAAAAAAAAAAgagal.agnAAAAAAAAAAgagal.agnAAAAAAAAAAgagal.agnAAAAAAAAAAgagal.agnAAAAAAAAAAgagal.agnAAAAAAAAAAringinterface gaga.io.Serializable");
    }

    @Test
    public void test27147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest54.test27147");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOf("                                                                                                                                                                                                                                  JAVATSILYARRATSILYARRATSILYARRA                                                                                                                                                                                                                                  ", 990);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test27148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest54.test27148");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeEnd("......................................................................................................................................................................................................................................................................................................................................................................................................................................................................44444444444444444444444444444444444444444444444444444444444444444444444444444444         $", "NTERFACE JAVA.LANG.cLONEABLE....$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$galaa$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "......................................................................................................................................................................................................................................................................................................................................................................................................................................................................44444444444444444444444444444444444444444444444444444444444444444444444444444444         $" + "'", str2, "......................................................................................................................................................................................................................................................................................................................................................................................................................................................................44444444444444444444444444444444444444444444444444444444444444444444444444444444         $");
    }

    @Test
    public void test27149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest54.test27149");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBeforeLast("aaaaaaaaa", "Ar");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "aaaaaaaaa" + "'", str2, "aaaaaaaaa");
    }

    @Test
    public void test27150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest54.test27150");
        java.lang.ClassLoader classLoader0 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass2 = org.apache.commons.lang3.ClassUtils.getClass(classLoader0, "$       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $");
            org.junit.Assert.fail("Expected exception of type java.lang.ClassNotFoundException; message: $$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$");
        } catch (java.lang.ClassNotFoundException e) {
            // Expected exception.
        }
    }

    @Test
    public void test27151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest54.test27151");
        char[] charArray12 = new char[] { ' ', ' ', '#', 'a', '4', 'a' };
        int int13 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "", charArray12);
        boolean boolean14 = org.apache.commons.lang3.StringUtils.containsAny("$", charArray12);
        int int15 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "", charArray12);
        int int16 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "                                  ", charArray12);
        int int17 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "class java.lang.Classclass java.lang.Classclass java.lang.Classclass java.lang.Classclass java.lang.Classclass java.lang.Classclass java.lang.Classclass java.lang.Classclass java.lang.Classclass java.lang.Classclass java.lang.Classclass java.lang.Classclass java.lang.Classclass java.lang.Classclass java.lang.Classclass java.lang.Classclass java.lang.Classclass java.lang.Classclass java.lang.Classclass java.lang.Classclass java.lang.Classclass java.lang.Classclass java.lang.Classclass java.lang.Classclass java.lang.Classclass java.lang.Classclass java.lang.Classclass java.lang.Classclass java.lang.Classclass java.lang.Class", charArray12);
        boolean boolean18 = org.apache.commons.lang3.StringUtils.containsAny("ARR...AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA...AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA...AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA...AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA...AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA...AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA...AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA...AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA...AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA", charArray12);
        org.junit.Assert.assertNotNull(charArray12);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray12), "  #a4a");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray12), "  #a4a");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray12), "[ ,  , #, a, 4, a]");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test27152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest54.test27152");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringAfter(".......                                                  ", "AtsiLytcejbO.gnal.avaj ssalcrrAtsiLytcejbO.gnal.avaj ssalcrrAva.langGNAL..langjava.langAGNAL.AVAJAtsiLytcejbO.gnal.avaj ssalcrrAtsiLytcejbO.gnal.avaj ssalcrrAva.langGNAL..langjava.langAGNAL.AVAJAtsiLytcejbO.gnal.avaj ssalcrrAtsiLytcejbO.gnal.avaj ssalcrrAva.langGNAL..langjava.langAGNAL.AVAJAtsiLytcejbO.gnal.avaj ssalcrrAtsiLytcejStringAtsiLytcejbO.gnal.avaj ssalcrrAtsiLytcejbO.gnal.avaj ssalcrrAva.langGNAL..langjava.langAGNAL.AVAJAtsiLytcejbO.gnaaaaaa...");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test27153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest54.test27153");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.substringsBetween("444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444interface java.lang.Cloneable.......java.......Objectava..........javainterface java.io.Serializable", "ituLlituL", "          AA                                                                        ");
        org.junit.Assert.assertNull(strArray3);
    }

    @Test
    public void test27154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest54.test27154");
        java.lang.String str1 = org.apache.commons.lang3.ClassUtils.getShortCanonicalName("RFACE JAVALANGCLONEABLELANGGNALJAVALANGAVAJGNALJAVALANGAVAJGNALJAVALANGAVAJGNALJAVALANGAVAJGNALJAVALANGAVAJGNALJAVALANGAVAJ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "RFACEJAVALANGCLONEABLELANGGNALJAVALANGAVAJGNALJAVALANGAVAJGNALJAVALANGAVAJGNALJAVALANGAVAJGNALJAVALANGAVAJGNALJAVALANGAVAJ" + "'", str1, "RFACEJAVALANGCLONEABLELANGGNALJAVALANGAVAJGNALJAVALANGAVAJGNALJAVALANGAVAJGNALJAVALANGAVAJGNALJAVALANGAVAJGNALJAVALANGAVAJ");
    }

    @Test
    public void test27155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest54.test27155");
        java.util.Locale locale1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.apache.commons.lang3.StringUtils.upperCase("44444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444rrayList44444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444", locale1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test27156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest54.test27156");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.lowerCase("JAVA.IO.sERIALIZABLE JAVA.LANG");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "java.io.serializable java.lang" + "'", str1, "java.io.serializable java.lang");
    }

    @Test
    public void test27157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest54.test27157");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.normalizeSpace("CEAJ V AL NGAcLONE BLEAAAAAAAJ V AAAAAAAAAAJJAVAlLANGJAVA.LANGAVAJ.GNALJAVA.LANGAVAJ.GNALJAVA.LANGAVAJ.GNALJAVA.LANGAVAJ.GNALJAVA.LANGAVAJ.GNALJAVA.LANGAVAJ.GNALJAVA.LANGAVAJ.GNALJAVA.LANGAVAJ.GNALJAVA.LANG");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "CEAJ V AL NGAcLONE BLEAAAAAAAJ V AAAAAAAAAAJJAVAlLANGJAVA.LANGAVAJ.GNALJAVA.LANGAVAJ.GNALJAVA.LANGAVAJ.GNALJAVA.LANGAVAJ.GNALJAVA.LANGAVAJ.GNALJAVA.LANGAVAJ.GNALJAVA.LANGAVAJ.GNALJAVA.LANGAVAJ.GNALJAVA.LANG" + "'", str1, "CEAJ V AL NGAcLONE BLEAAAAAAAJ V AAAAAAAAAAJJAVAlLANGJAVA.LANGAVAJ.GNALJAVA.LANGAVAJ.GNALJAVA.LANGAVAJ.GNALJAVA.LANGAVAJ.GNALJAVA.LANGAVAJ.GNALJAVA.LANGAVAJ.GNALJAVA.LANGAVAJ.GNALJAVA.LANGAVAJ.GNALJAVA.LANG");
    }

    @Test
    public void test27158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest54.test27158");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isWhitespace((java.lang.CharSequence) "tsilyarrgnaluavaj                       tsilyarrgnaluavaj");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test27159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest54.test27159");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOf("4444444444444", "class java.lang.objectclass java.lang.objectclass java.lang.objectclass java.lang.objectclass java.lang.objectclass java.lang.objectclass java.lang.objectclass java.lang.objectclass java.lang.objectclass java.lang.objectclass java.lang.objectclass java.lang.objectclass java.lang.objectclass java.lang.objectclass java.lang.objectclass java.lang.objectclass java.lang.objectclass java.lang.objectclass java.lang.objectclass java.lang.objectclass java.lang.objectclass java.lang.object                                                                                                                                                                           ", 537);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test27160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest54.test27160");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.rightPad("javal#.#agn       aaaaaaaaaaaaaaaaaaaaaaaaa", 523, '.');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "javal#.#agn       aaaaaaaaaaaaaaaaaaaaaaaaa................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................" + "'", str3, "javal#.#agn       aaaaaaaaaaaaaaaaaaaaaaaaa................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................");
    }

    @Test
    public void test27161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest54.test27161");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass2 = org.apache.commons.lang3.ClassUtils.getClass(".............................................................lang                                                                                    ", true);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassNotFoundException; message: /////////////////////////////////////////////////////////////lang");
        } catch (java.lang.ClassNotFoundException e) {
            // Expected exception.
        }
    }

    @Test
    public void test27162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest54.test27162");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.capitalize((java.lang.CharSequence) "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaIT.ITaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "AaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaIT.ITaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa" + "'", str1, "AaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaIT.ITaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
    }

    @Test
    public void test27163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest54.test27163");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("JAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANG", "...................................................................");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.stripAll(strArray2);
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray2);
        java.lang.Class<?>[] wildcardClassArray5 = org.apache.commons.lang3.ClassUtils.toClass((java.lang.Object[]) strArray2);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "JAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANG" + "'", str4, "JAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANG");
        org.junit.Assert.assertNotNull(wildcardClassArray5);
    }

    @Test
    public void test27164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest54.test27164");
        char[] charArray11 = new char[] { ' ', ' ', '#', 'a', '4', 'a' };
        int int12 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "", charArray11);
        boolean boolean13 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "......", charArray11);
        int int14 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "                                                                                                    ", charArray11);
        java.lang.String str16 = org.apache.commons.lang3.ClassUtils.getPackageCanonicalName((java.lang.Object) charArray11, "");
        int int17 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "interface#java.lang.Cloneable4interface#java.io.Serializableinterface#java.lang.Cloneable4interface#java.io.Serializableinterface#java.lang.Cloneable4interface#java.io.Serializableinterface#java.lang.Cloneable4interface#java.io.Serializableinterface#java.lang.Cloneable4interface#java.io.Serializableinterface#java.lang.Cloneable4interface#java.io.Serializableinterface#java.lang.Cloneable4interface#java.io.Serializableaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", charArray11);
        boolean boolean18 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "jv$.$lnG", charArray11);
        java.lang.String str20 = org.apache.commons.lang3.ClassUtils.getPackageCanonicalName((java.lang.Object) "jv$.$lnG", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaase...aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertNotNull(charArray11);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray11), "  #a4a");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray11), "  #a4a");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray11), "[ ,  , #, a, 4, a]");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "java.lang" + "'", str20, "java.lang");
    }

    @Test
    public void test27165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest54.test27165");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.leftPad("A..ayL A##############A..ayL A##############A..ayL A##############A..ayL A##############A..ayL A##############A..ayL A##############A..ayL A#########.......                                                  ", 173);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "A..ayL A##############A..ayL A##############A..ayL A##############A..ayL A##############A..ayL A##############A..ayL A##############A..ayL A#########.......                                                  " + "'", str2, "A..ayL A##############A..ayL A##############A..ayL A##############A..ayL A##############A..ayL A##############A..ayL A##############A..ayL A#########.......                                                  ");
    }

    @Test
    public void test27166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest54.test27166");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.defaultString("", "                                                                                                                     ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test27167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest54.test27167");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.center("javallangj                                                                                                                                                                                                                                                                                                                           ", 0, 'a');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "javallangj                                                                                                                                                                                                                                                                                                                           " + "'", str3, "javallangj                                                                                                                                                                                                                                                                                                                           ");
    }

    @Test
    public void test27168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest54.test27168");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.abbreviate(".............RJAVAARR", 67);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + ".............RJAVAARR" + "'", str2, ".............RJAVAARR");
    }

    @Test
    public void test27169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest54.test27169");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isBlank((java.lang.CharSequence) "class java.util.AbstractListgn lu v j ....................................................................class java.util.AbstractCollectiongn lu v j ....................................................................class java.lang.Object");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test27170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest54.test27170");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfDifference((java.lang.CharSequence) "44444444444444444444444444444444444444444444444444444444444444444444444javaulang444444444444444444444444444444444444444444444444444444444444444444444444", (java.lang.CharSequence) "java..........java...........");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test27171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest54.test27171");
        java.lang.String str1 = org.apache.commons.lang3.ClassUtils.getShortCanonicalName("java.io.Serializablejava.lang.CloneableStringinterfaceinterface");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "CloneableStringinterfaceinterface" + "'", str1, "CloneableStringinterfaceinterface");
    }

    @Test
    public void test27172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest54.test27172");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass1 = org.apache.commons.lang3.ClassUtils.getClass(".................................................................................................................................................");
            org.junit.Assert.fail("Expected exception of type java.lang.ClassNotFoundException; message: /////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////");
        } catch (java.lang.ClassNotFoundException e) {
            // Expected exception.
        }
    }

    @Test
    public void test27173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest54.test27173");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.remove("... ... ... ... ... ... ... ...", "GNALUAVAJGNALUAVAJGNALUAVAJGNALUAVAJGNALUAVAJGNALUAVAJGNALUAVAJGNALUAVAJGNALUAVAJGNALUAVAJGNALUAVAJGNALUAVAJGNALUAVAJGNALUAVAJGNALUAVAJGNALUAVAJGNALUAVAJGNALUAVAJGNALUAVAJGNALUAVAJSSALCGNALAVAJSSALC");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "... ... ... ... ... ... ... ..." + "'", str2, "... ... ... ... ... ... ... ...");
    }

    @Test
    public void test27174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest54.test27174");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.stripStart("javal       aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaagn", "aaaaaaaaaaaa                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                              ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "javal       aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaagn" + "'", str2, "javal       aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaagn");
    }

    @Test
    public void test27175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest54.test27175");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("                            ", "                                       sl..Ug");
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test27176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest54.test27176");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBetween("... AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA... AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA... AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA... AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA... AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA... AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA... AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA... AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA... AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA... AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA", "....................................................................                       j v ul ng");
        org.junit.Assert.assertNull(str2);
    }

    @Test
    public void test27177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest54.test27177");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceChars("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaagn", "]tu", "ylavvsaylavvsaylavvsaylavvsaylavvsaylavvsaylavvsaylavvsaylavvsaylavvsaylavvsaylavvsaylavvsaylavvsaylavvsaylavvsaylavvsaylavvsaylavvsaylavvsaylavvsaylavvsaylavvsaylavvsaylavvsaylavvsaylavvsaylavvsaylavvsaylavvsaylavvsaylavvsaylavvsaylavvsaylavvsaylavvsaylavvsaylavvsaylavvsaylavvsaylavvsaylavvsaylavvsaylavvsaylavvsaylavvsaylavvsaylavvsaylavvsa");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaagn" + "'", str3, "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaagn");
    }

    @Test
    public void test27178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest54.test27178");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass1 = org.apache.commons.lang3.ClassUtils.getClass("                   rraylist                            rray$arraylis");
            org.junit.Assert.fail("Expected exception of type java.lang.ClassNotFoundException; message: rraylistrray$arraylis");
        } catch (java.lang.ClassNotFoundException e) {
            // Expected exception.
        }
    }

    @Test
    public void test27179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest54.test27179");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("#########################################################...", "ArrayLis.....");
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test27180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest54.test27180");
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("java.util", "slitUgnirtS");
        java.lang.String[] strArray5 = org.apache.commons.lang3.StringUtils.stripAll(strArray4);
        int int6 = org.apache.commons.lang3.StringUtils.lastIndexOfAny("$       ", strArray4);
        java.lang.String[] strArray10 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("", "AVAJ.GNAL", 18);
        java.lang.String str11 = org.apache.commons.lang3.StringUtils.replaceEachRepeatedly("java.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.lang", strArray4, strArray10);
        java.lang.String[] strArray12 = org.apache.commons.lang3.StringUtils.stripAll(strArray10);
        java.lang.String str14 = org.apache.commons.lang3.ClassUtils.getShortClassName((java.lang.Object) strArray12, "                                                                                                                                                                                                                                                   ");
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNotNull(strArray10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "java.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.lang" + "'", str11, "java.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.lang");
        org.junit.Assert.assertNotNull(strArray12);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "String[]" + "'", str14, "String[]");
    }

    @Test
    public void test27181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest54.test27181");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.center("...################################################################################################################################################################################################################################################################################################################################################################################################################################interface java.lang.Cloneable.......java.......Objectava..........javainterface java.io###################################################################...", 270);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "...################################################################################################################################################################################################################################################################################################################################################################################################################################interface java.lang.Cloneable.......java.......Objectava..........javainterface java.io###################################################################..." + "'", str2, "...################################################################################################################################################################################################################################################################################################################################################################################################################################interface java.lang.Cloneable.......java.......Objectava..........javainterface java.io###################################################################...");
    }

    @Test
    public void test27182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest54.test27182");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.chop("jv..........jv..........jv4444444444...");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "jv..........jv..........jv4444444444.." + "'", str1, "jv..........jv..........jv4444444444..");
    }

    @Test
    public void test27183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest54.test27183");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.endsWithIgnoreCase("AAAAAAAAAAnga.lavajAAAAAAAAAAnga.lavajAAAAAAAAAAnga.lavajAAAAAAAAAAnga.lavajAAAAAAAAAAnga.lavajAAAAAAAAAAnga.lavajAAAAAAAAAAnga.lavajAAAAAAAAAAnga.lavajAAAAAAAAAAnga.lavajAAAAAAAAAAnga.lavajAAAAAAAAAAnga.lavajAAAAAAAAAAnga.lavajAAAAAAAAAAnga.lavajAAAAAAAAAAnga.lavajAAAAAAAAAAnga.lavajAAAAAAAAAAnga.lavajAAAAAAAAAAnga.lavajAAAAAAAAAAnga.lavajAAAAAAAAAAnga.lavajAAAAAAAAAAnga.lavajAAAAAAAAAAnga.lavajAAAAAAAAAAnga.lavajAAAAAAAAAAnga.lavajAAAAAAAAAAnga.lavajAAAAAAAAAAnga.lavajAAAAAAAAAAnga.lavajAAAAAAAAAAnga.lavajAAAAAAAAAAnga.lavajAAAAAAAAAAnga.lavajAAAAAAAAAAnga.lavajAAAAAAAAAAnga.lavajAAAAAAAAAAnga.lavajAAAAAAAAAAnga.lavajAAAAAAAAAAnga.lavajAAAAAAAAAAnga.lavajAAAAAAAAAA", "...                   $$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$                             ...");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test27184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest54.test27184");
        int int3 = org.apache.commons.lang3.StringUtils.lastOrdinalIndexOf("AaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaIT.ITaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "", 423);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 130 + "'", int3 == 130);
    }

    @Test
    public void test27185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest54.test27185");
        char[] charArray14 = new char[] { ' ', ' ', '#', 'a', '4', 'a' };
        int int15 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "", charArray14);
        boolean boolean16 = org.apache.commons.lang3.StringUtils.containsAny("......", charArray14);
        int int17 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "AAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAA", charArray14);
        boolean boolean18 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "...       .", charArray14);
        int int19 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "hi!ArrayListArrayListArrayListavaj.... AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA... AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA... AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA... AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA... AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA... AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA... AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA... AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA... AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA... AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA", charArray14);
        int int20 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "interface java.lang.Cloneable.......java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........javainterface java.io.Serializable", charArray14);
        boolean boolean21 = org.apache.commons.lang3.StringUtils.containsAny("ArrayListArrayListArrayListavaj.gnal                                                                ", charArray14);
        int int22 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "       aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa...       aaClass[]aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", charArray14);
        org.junit.Assert.assertNotNull(charArray14);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray14), "  #a4a");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray14), "  #a4a");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray14), "[ ,  , #, a, 4, a]");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 6 + "'", int19 == 6);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 6 + "'", int20 == 6);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
    }

    @Test
    public void test27186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest54.test27186");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.upperCase("4444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "4444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444" + "'", str1, "4444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444");
    }

    @Test
    public void test27187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest54.test27187");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripToNull("                                   #############################################################...");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "#############################################################..." + "'", str1, "#############################################################...");
    }

    @Test
    public void test27188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest54.test27188");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.equals((java.lang.CharSequence) "ylist............................rraylist............................rraylist............................rray$arraylis", (java.lang.CharSequence) "$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$                                                                                                                                                                                                                                                                                                                                                                                                                                         ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test27189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest54.test27189");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("RJAVAARR", "irtS");
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test27190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest54.test27190");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass1 = org.apache.commons.lang3.ClassUtils.getClass("...O.gnal");
            org.junit.Assert.fail("Expected exception of type java.lang.ClassNotFoundException; message: ///O/gnal");
        } catch (java.lang.ClassNotFoundException e) {
            // Expected exception.
        }
    }

    @Test
    public void test27191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest54.test27191");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.leftPad("            java.util             ", 155, "Hi!ArrayLis$$$$$$$$$$$$$$$$$$$$$$$");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Hi!ArrayLis$$$$$$$$$$$$$$$$$$$$$$$Hi!ArrayLis$$$$$$$$$$$$$$$$$$$$$$$Hi!ArrayLis$$$$$$$$$$$$$$$$$$$$$$$Hi!ArrayLis$$$$$$$$            java.util             " + "'", str3, "Hi!ArrayLis$$$$$$$$$$$$$$$$$$$$$$$Hi!ArrayLis$$$$$$$$$$$$$$$$$$$$$$$Hi!ArrayLis$$$$$$$$$$$$$$$$$$$$$$$Hi!ArrayLis$$$$$$$$            java.util             ");
    }

    @Test
    public void test27192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest54.test27192");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripToEmpty("ILyarrAtsiLyarrAtsiLyarrAlang.javatsiLyarrAtsiLyarrAtsiAAAAAAAAAAngag");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "ILyarrAtsiLyarrAtsiLyarrAlang.javatsiLyarrAtsiLyarrAtsiAAAAAAAAAAngag" + "'", str1, "ILyarrAtsiLyarrAtsiLyarrAlang.javatsiLyarrAtsiLyarrAtsiAAAAAAAAAAngag");
    }

    @Test
    public void test27193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest54.test27193");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOf("tsiyarr.a.lantsiyarr.a.lantsiyarr.a.lantsiyarr.a.lantsiyarr.a.lantsiyarr.a.lantsiyarr.a.lantsiyarr.a.lan", "##########################################################################################################################################################################################################################JAVA.LANG                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                    ##########################################################################################################################################################################################################################", 162);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test27194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest54.test27194");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.right("ARRA", 154);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "ARRA" + "'", str2, "ARRA");
    }

    @Test
    public void test27195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest54.test27195");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.substringsBetween("Aaaaaaaaaaaa                                                ", "....................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................LANG.LANG.LANG.LANG.Llitu", "aaaaaaaautil$$$$$$$$$$$$$$$$$$$$$$$                                                                                                                        ");
        org.junit.Assert.assertNull(strArray3);
    }

    @Test
    public void test27196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest54.test27196");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.defaultString("#########################################################################################yList", "...                                 ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "#########################################################################################yList" + "'", str2, "#########################################################################################yList");
    }

    @Test
    public void test27197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest54.test27197");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBeforeLast("A..ayLA..................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................", "hi!ArrayListArrayListArrayListavaj.gnalArrayListArrayListArrayListavaj.gnalArrayListArrayListArrayLi");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "A..ayLA.................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................." + "'", str2, "A..ayLA..................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................");
    }

    @Test
    public void test27198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest54.test27198");
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
        java.lang.Class<?>[] wildcardClassArray16 = org.apache.commons.lang3.ClassUtils.primitivesToWrappers(wildcardClassArray7);
        java.lang.Class<?>[] wildcardClassArray17 = org.apache.commons.lang3.ClassUtils.toClass((java.lang.Object[]) wildcardClassArray7);
        java.lang.String str19 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) wildcardClassArray17, "                                                                               gnal.avaj ");
        java.lang.Class<?>[] wildcardClassArray20 = org.apache.commons.lang3.ClassUtils.primitivesToWrappers(wildcardClassArray17);
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                   " + "'", str2, "                                   ");
        org.junit.Assert.assertNotNull(wildcardClassArray3);
        org.junit.Assert.assertNotNull(classArray6);
        org.junit.Assert.assertNotNull(wildcardClassArray7);
        org.junit.Assert.assertNotNull(wildcardClassArray10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertNotNull(wildcardClassArray16);
        org.junit.Assert.assertNotNull(wildcardClassArray17);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertNotNull(wildcardClassArray20);
    }

    @Test
    public void test27199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest54.test27199");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAsciiPrintable((java.lang.CharSequence) "444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444litu avajli");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test27200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest54.test27200");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.substring(".....................$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$", 25, 84);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$" + "'", str3, "$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$");
    }

    @Test
    public void test27201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest54.test27201");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.remove("...      ", 'a');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "...      " + "'", str2, "...      ");
    }

    @Test
    public void test27202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest54.test27202");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("java.langjava.langjava.langjava.langjava.langjava.la                                                ", "aaaaaaaaaa", 27);
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void test27203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest54.test27203");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphanumeric((java.lang.CharSequence) "44444444444444444a444444444444444444");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test27204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest54.test27204");
        java.util.Locale locale1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.apache.commons.lang3.StringUtils.lowerCase("                                                                                          gnal.avaj ", locale1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test27205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest54.test27205");
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.replace("INTERFACE GAGA.LANG.CLONEABLEAAAAAAAAAAGAGAL.AGNAAAAAAAAAAGAGAL.AGNAAAAAAAAAAGAGAL.AGNAAAAAAAAAAGAGAL.AGNAAAAAAAAAAGAGAL.AGNAAAAAAAAAAGAGAL.AGNAAAAAAAAAAGAGAL.AGNAAAAAAAAAAGAGAL.AGNAAAAAAAAAAGAGAL.AGNAAAAAAAAAAGAGAL.AGNAAAAAAAAAAGAGAL.AGNAAAAAAAAAAGAGAL.AGNAAAAAAAAAAGAGAL.AGNAAAAAAAAAAGAGAL.AGNAAAAAAAAAAGAGAL.AGNAAAAAAAAAAGAGAL.AGNAAAAAAAAAAGAGAL.AGNAAAAAAAAAAGAGAL.AGNAAAAAAAAAAGAGAL.AGNAAAAAAAAAAGAGAL.AGNAAAAAAAAAAGAGAL.AGNAAAAAAAAAAGAGAL.AGNAAAAAAAAAAGAGAL.AGNAAAAAAAAAAGAGAL.AGNAAAAAAAAAAGAGAL.AGNAAAAAAAAAAGAGAL.AGNAAAAAAAAAAGAGAL.AGNAAAAAAAAAAGAGAL.AGNAAAAAAAAAAGAGAL.AGNAAAAAAAAAAGAGAL.AGNAAAAAAAAAAGAGAL.AGNAAAAAAAAAAGAGAL.AGNAAAAAAAAAAGAGAL.AGNAAAAAAAAAAGAGAL.AGNAAAAAAAAAAGAGAL.AGNAAAAAAAAAARINGINTERFACE GAGA.IO.SERIALIZABLE", "  ja", "gnirtSlitu.avaj1-gnirtSlitu.avaj1-", 30);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "INTERFACE GAGA.LANG.CLONEABLEAAAAAAAAAAGAGAL.AGNAAAAAAAAAAGAGAL.AGNAAAAAAAAAAGAGAL.AGNAAAAAAAAAAGAGAL.AGNAAAAAAAAAAGAGAL.AGNAAAAAAAAAAGAGAL.AGNAAAAAAAAAAGAGAL.AGNAAAAAAAAAAGAGAL.AGNAAAAAAAAAAGAGAL.AGNAAAAAAAAAAGAGAL.AGNAAAAAAAAAAGAGAL.AGNAAAAAAAAAAGAGAL.AGNAAAAAAAAAAGAGAL.AGNAAAAAAAAAAGAGAL.AGNAAAAAAAAAAGAGAL.AGNAAAAAAAAAAGAGAL.AGNAAAAAAAAAAGAGAL.AGNAAAAAAAAAAGAGAL.AGNAAAAAAAAAAGAGAL.AGNAAAAAAAAAAGAGAL.AGNAAAAAAAAAAGAGAL.AGNAAAAAAAAAAGAGAL.AGNAAAAAAAAAAGAGAL.AGNAAAAAAAAAAGAGAL.AGNAAAAAAAAAAGAGAL.AGNAAAAAAAAAAGAGAL.AGNAAAAAAAAAAGAGAL.AGNAAAAAAAAAAGAGAL.AGNAAAAAAAAAAGAGAL.AGNAAAAAAAAAAGAGAL.AGNAAAAAAAAAAGAGAL.AGNAAAAAAAAAAGAGAL.AGNAAAAAAAAAAGAGAL.AGNAAAAAAAAAAGAGAL.AGNAAAAAAAAAAGAGAL.AGNAAAAAAAAAARINGINTERFACE GAGA.IO.SERIALIZABLE" + "'", str4, "INTERFACE GAGA.LANG.CLONEABLEAAAAAAAAAAGAGAL.AGNAAAAAAAAAAGAGAL.AGNAAAAAAAAAAGAGAL.AGNAAAAAAAAAAGAGAL.AGNAAAAAAAAAAGAGAL.AGNAAAAAAAAAAGAGAL.AGNAAAAAAAAAAGAGAL.AGNAAAAAAAAAAGAGAL.AGNAAAAAAAAAAGAGAL.AGNAAAAAAAAAAGAGAL.AGNAAAAAAAAAAGAGAL.AGNAAAAAAAAAAGAGAL.AGNAAAAAAAAAAGAGAL.AGNAAAAAAAAAAGAGAL.AGNAAAAAAAAAAGAGAL.AGNAAAAAAAAAAGAGAL.AGNAAAAAAAAAAGAGAL.AGNAAAAAAAAAAGAGAL.AGNAAAAAAAAAAGAGAL.AGNAAAAAAAAAAGAGAL.AGNAAAAAAAAAAGAGAL.AGNAAAAAAAAAAGAGAL.AGNAAAAAAAAAAGAGAL.AGNAAAAAAAAAAGAGAL.AGNAAAAAAAAAAGAGAL.AGNAAAAAAAAAAGAGAL.AGNAAAAAAAAAAGAGAL.AGNAAAAAAAAAAGAGAL.AGNAAAAAAAAAAGAGAL.AGNAAAAAAAAAAGAGAL.AGNAAAAAAAAAAGAGAL.AGNAAAAAAAAAAGAGAL.AGNAAAAAAAAAAGAGAL.AGNAAAAAAAAAAGAGAL.AGNAAAAAAAAAAGAGAL.AGNAAAAAAAAAARINGINTERFACE GAGA.IO.SERIALIZABLE");
    }

    @Test
    public void test27206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest54.test27206");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.substring("4444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444                                                    ", 494, 578);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "44444444444444444444444444444444                                                    " + "'", str3, "44444444444444444444444444444444                                                    ");
    }

    @Test
    public void test27207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest54.test27207");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphaSpace((java.lang.CharSequence) "gnalArrayListArrayListArrayLi");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test27208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest54.test27208");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.equalsIgnoreCase("h!ih!ih!ih!ih!ih!va.langavaj.gnaljava.langavaj.gnaljava.langavaj.gnaljava.langavaj.gnaljava.langavaj.gnaljava.langh!ih!ih!ih!ih!ih!", "gnirtS.gnal.avaj ssalcgnirtS.gnal.avaj ssalcgnirtS.gnal.avaj ssalcgnirtS.gnal.avaj ssalcgnirtS.gnal.avaj ssalcgnirtS.gnal.avaj ssalcgnirtS.gnal.avaj ssalcgnirtS.gnal.avaj ssalcgnirtS.gnal.avaj ssalcgnirtS.gnal.avaj ssalcgnirtS.gnal.avaj ssalcgnirtS.gnal.avaj ssalcgnirtS.gnal.avaj ssalcgnirtS.gnal.avaj ssalcgnirtS.gnal.avaj ssalcgnirtS.gnal.avaj ... .... .java.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.lang... .... .java.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.lang... .... .java.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.lang... .... .java.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.lang... .... .java.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.lang... .... .");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test27209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest54.test27209");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceChars("irfCo$irfioSrA..ayL A.444444444444444444444444444", ' ', '.');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "irfCo$irfioSrA..ayL.A.444444444444444444444444444" + "'", str3, "irfCo$irfioSrA..ayL.A.444444444444444444444444444");
    }

    @Test
    public void test27210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest54.test27210");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripToNull("44444444444444444444444444444444444444444444444444444444444444444444444444       util");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "44444444444444444444444444444444444444444444444444444444444444444444444444       util" + "'", str1, "44444444444444444444444444444444444444444444444444444444444444444444444444       util");
    }

    @Test
    public void test27211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest54.test27211");
        java.util.Locale locale1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.apache.commons.lang3.StringUtils.lowerCase("                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                 ", locale1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test27212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest54.test27212");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.split("....................................................................                       javaulang");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.stripAll(strArray1);
        java.lang.String str4 = org.apache.commons.lang3.ClassUtils.getShortClassName((java.lang.Object) strArray1, "                                                                                                                                                 ");
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "String[]" + "'", str4, "String[]");
    }

    @Test
    public void test27213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest54.test27213");
        java.lang.Object obj0 = null;
        java.lang.String str2 = org.apache.commons.lang3.ClassUtils.getPackageCanonicalName(obj0, "                                  aaaaaaaaaaaa");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                  aaaaaaaaaaaa" + "'", str2, "                                  aaaaaaaaaaaa");
    }

    @Test
    public void test27214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest54.test27214");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.rightPad("javastringslitUgnirtSarraylistarraylistavaj", 89);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "javastringslitUgnirtSarraylistarraylistavaj                                              " + "'", str2, "javastringslitUgnirtSarraylistarraylistavaj                                              ");
    }

    @Test
    public void test27215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest54.test27215");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAllUpperCase((java.lang.CharSequence) "objec");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test27216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest54.test27216");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitByCharacterTypeCamelCase("########$#######$          utilutilutilutilutilutilutilutilutilutilutilutilutilutilutilutilutilutilutilutilutilutilutilutilutilutilutilutilutilutilutilutilutilutilutilutilutilutilutilutilutilutilutilutilutilutilutilutilutilutilutilutilutilutilutilutilutilutilutilutilutilutilutilutilutilutilutilutilutilutilutilutilutilutilutilutilutilutilutilutilutilutilutilutilutilutilutilutilutilutilutilutilutilutilutilutilutilutilutilutilutilutilutilutilutilutilutilutilutilutilutilutilutilutilutilutilutilutilutilutilutilutilutilutilutilutilutilutilutilutilutilutilutilutilutilutilutilutilutilutilutilutilutilutilutilutilutilutilutilutilutilutilutilutilutilutilutilutilutilutilutilutilutilutilutilutilutilutilutilutilutilutilutilutilutilutilutilutilutilutilutilutilutilutilutilutilutilutilutilutilutilutilutilutilutilutilutilutilutilutilutilutilutilutilutilutilutilutilutilutilutilutilutilutilutilutilutilutilutilutilutilutilutilutilutilutilutilutiluti");
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test27217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest54.test27217");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "ra                                         sTRINGuTILSsTRINGuTILSsTRINGuTILSsTRINGuTILSsTRINGuTILSsTRINGuTILSsTRINGuTILSsTRINGuTILSsTRINGuTILSsTRINGuTILS", "io                          ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test27218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest54.test27218");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripToEmpty("saylavv");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "saylavv" + "'", str1, "saylavv");
    }

    @Test
    public void test27219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest54.test27219");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.split(".aArrayaListaArrayaListaArrayaListaArrayaLis");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.stripAll(strArray1, "aGNALJAVAaLANGAVAJaGNALJAVAaLANGAVAJaGNALJAVAaLANGAVAJaGNALJAVAa");
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray3);
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + ".aArrayaListaArrayaListaArrayaListaArrayaLis" + "'", str4, ".aArrayaListaArrayaListaArrayaListaArrayaLis");
    }

    @Test
    public void test27220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest54.test27220");
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("rrclass javalangObjectyst", "i4elbaenolCAgnalAavajiecafretniTRINGi4elbaenolCAgnalAavajiecaf", (int) '4');
        int int5 = org.apache.commons.lang3.StringUtils.lastIndexOfAny("a.lang.objectclass java.lang.objectclass java.lang.objectclass java.lang.objectclass java.lang.objectclass java.lang.objectclass java.lang.objectclass java.lang.objectclass java.lang.objectclass java.lang.objectclass java.lang.objectclass java.lang.objectclass java.lang.objectclass java.lang.objectclass java.lang.objectclass java.lang.objectclass java.lang.objectclass java.lang.objectclass java.lang.objectclass java.lang.objectclass java.lang.object", strArray4);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
    }

    @Test
    public void test27221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest54.test27221");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass1 = org.apache.commons.lang3.ClassUtils.getClass("AAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAja                                              AAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAring");
            org.junit.Assert.fail("Expected exception of type java.lang.ClassNotFoundException; message: AAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAring");
        } catch (java.lang.ClassNotFoundException e) {
            // Expected exception.
        }
    }

    @Test
    public void test27222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest54.test27222");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitByCharacterType("####");
        java.lang.Class<?>[] wildcardClassArray2 = org.apache.commons.lang3.ClassUtils.toClass((java.lang.Object[]) strArray1);
        java.lang.Class<?>[] wildcardClassArray3 = org.apache.commons.lang3.ClassUtils.wrappersToPrimitives(wildcardClassArray2);
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertNotNull(wildcardClassArray2);
        org.junit.Assert.assertNotNull(wildcardClassArray3);
    }

    @Test
    public void test27223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest54.test27223");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfIgnoreCase("...44444...", "... $$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test27224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest54.test27224");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripAccents((java.lang.CharSequence) "                                       sl..Ug");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "                                       sl..Ug" + "'", str1, "                                       sl..Ug");
    }

    @Test
    public void test27225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest54.test27225");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("hi!", "");
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.stripAll(strArray2, "$");
        java.lang.Class<?>[] wildcardClassArray5 = org.apache.commons.lang3.ClassUtils.toClass((java.lang.Object[]) strArray2);
        java.lang.Class<?>[] wildcardClassArray6 = org.apache.commons.lang3.ClassUtils.toClass((java.lang.Object[]) wildcardClassArray5);
        java.lang.Class<?>[] wildcardClassArray7 = org.apache.commons.lang3.ClassUtils.wrappersToPrimitives(wildcardClassArray6);
        java.lang.String str9 = org.apache.commons.lang3.ClassUtils.getPackageName((java.lang.Object) wildcardClassArray7, "interface java.lang.CloneableStringinterface java.io");
        java.lang.Class<?>[] wildcardClassArray10 = org.apache.commons.lang3.ClassUtils.primitivesToWrappers(wildcardClassArray7);
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
        java.lang.Class<?>[] wildcardClassArray41 = org.apache.commons.lang3.ClassUtils.primitivesToWrappers(wildcardClassArray40);
        java.lang.Class<?>[] wildcardClassArray42 = org.apache.commons.lang3.ClassUtils.wrappersToPrimitives(wildcardClassArray40);
        java.lang.String str44 = org.apache.commons.lang3.ClassUtils.getShortClassName((java.lang.Object) wildcardClassArray40, "#                                   ");
        java.lang.Class<?>[] wildcardClassArray45 = org.apache.commons.lang3.ClassUtils.primitivesToWrappers(wildcardClassArray40);
        java.lang.String str47 = org.apache.commons.lang3.ClassUtils.getShortCanonicalName((java.lang.Object) wildcardClassArray40, "AAAA                       JAVAULANGvvayLasa");
        boolean boolean49 = org.apache.commons.lang3.ClassUtils.isAssignable(wildcardClassArray7, wildcardClassArray40, false);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str53 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) wildcardClassArray7, "                                                                                                   ", 90, 931);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 90");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertNotNull(wildcardClassArray5);
        org.junit.Assert.assertNotNull(wildcardClassArray6);
        org.junit.Assert.assertNotNull(wildcardClassArray7);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "java.lang" + "'", str9, "java.lang");
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
        org.junit.Assert.assertNotNull(wildcardClassArray41);
        org.junit.Assert.assertNotNull(wildcardClassArray42);
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "Class[]" + "'", str44, "Class[]");
        org.junit.Assert.assertNotNull(wildcardClassArray45);
        org.junit.Assert.assertEquals("'" + str47 + "' != '" + "Class[]" + "'", str47, "Class[]");
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + true + "'", boolean49 == true);
    }

    @Test
    public void test27226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest54.test27226");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.strip("JAVAlLANG                                                                                                                                                                                                                                                                                                                                                                                                                                                       ", "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "JAVAlLANG                                                                                                                                                                                                                                                                                                                                                                                                                                                       " + "'", str2, "JAVAlLANG                                                                                                                                                                                                                                                                                                                                                                                                                                                       ");
    }

    @Test
    public void test27227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest54.test27227");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.chomp("...    ...");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "...    ..." + "'", str1, "...    ...");
    }

    @Test
    public void test27228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest54.test27228");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.split("...", "gnal                                                                1AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA");
        boolean boolean4 = org.apache.commons.lang3.StringUtils.startsWithAny("aaaaaaaaaaaa                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                              ", strArray3);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test27229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest54.test27229");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.reverseDelimited("interfacejava.lang.Cloneable...interfacejava.io", '#');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "interfacejava.lang.Cloneable...interfacejava.io" + "'", str2, "interfacejava.lang.Cloneable...interfacejava.io");
    }

    @Test
    public void test27230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest54.test27230");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOf("                                                                          ...AAAAAAAAAAAAAAAAAAA      ", "ElbazilaireS.......java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........javanignirtSelbaenolC.gnal.avaj ecafretni");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test27231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest54.test27231");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsAny("java.lang.Stringclass... java.lang.Stringclass ...", "");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test27232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest54.test27232");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsAny("interface#java.lang.Cloneable....................................................................#######################JAVAULANGinterface#java.io", "javal#.#agn       aaaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test27233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest54.test27233");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeEnd("hi!Array...", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!Array..." + "'", str2, "hi!Array...");
    }

    @Test
    public void test27234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest54.test27234");
        java.lang.ClassLoader classLoader0 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass3 = org.apache.commons.lang3.ClassUtils.getClass(classLoader0, "...                              ...", true);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassNotFoundException; message: //////");
        } catch (java.lang.ClassNotFoundException e) {
            // Expected exception.
        }
    }

    @Test
    public void test27235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest54.test27235");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("", "hi!ArrayListArrayListArrayListavaj");
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test27236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest54.test27236");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBeforeLast("", "Arr... aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa... aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa... aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa... aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa... aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa... aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa... aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa... aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa... aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa... aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaylis");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test27237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest54.test27237");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOf("                                                                                                                                                                                                                                                                                                                                                                                                                                                                      INTERFACE JAVA.LANG.CLONEABLELANG.GNALJAVA.LANGAVAJ.GNALJAVA.LANGAVAJ.GNALJAVA.LANGAVAJ.GNALJAVA.LANGAVAJ.GNALJAVA.LANGAVAJ.GNALJAVA.LANGAVAJ.GNALJAVA.LANGAVAJ.GNALJAVA.LANGAVAJ.JAVAINTERFACE JAVA.IO.SERIALIZABLE", "ArrayListA");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test27238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest54.test27238");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.abbreviate("TERFACE JAVA.LANG.cLONEABLE.......JAVA..........JAVA..........JAVA..........JAVA..........JA...", (int) '$', 460);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "TERFACE JAVA.LANG.cLONEABLE.......JAVA..........JAVA..........JAVA..........JAVA..........JA..." + "'", str3, "TERFACE JAVA.LANG.cLONEABLE.......JAVA..........JAVA..........JAVA..........JAVA..........JA...");
    }

    @Test
    public void test27239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest54.test27239");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.chomp("javau");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "javau" + "'", str1, "javau");
    }

    @Test
    public void test27240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest54.test27240");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.left("#                                             ", 104);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "#                                             " + "'", str2, "#                                             ");
    }

    @Test
    public void test27241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest54.test27241");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.contains("ETYB", "AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAArLAAAuAAAA");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test27242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest54.test27242");
        java.lang.String str1 = org.apache.commons.lang3.ClassUtils.getPackageName("jv..........jv..........jv..........jv..........jv..........jv..........jv..........jv..........jv..........jv..........jv..........jv..........jv..........jv..........jv..........jv..........jv..........jv..........jv..........jv..........jv..........jv..........jv..........jv..........jv..........jv..........jv..........jv..........jv..........jv..........jv..........jv..........jv..........jv..........jvinterfcejv.io");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "jv..........jv..........jv..........jv..........jv..........jv..........jv..........jv..........jv..........jv..........jv..........jv..........jv..........jv..........jv..........jv..........jv..........jv..........jv..........jv..........jv..........jv..........jv..........jv..........jv..........jv..........jv..........jv..........jv..........jv..........jv..........jv..........jv..........jv..........jvinterfcejv" + "'", str1, "jv..........jv..........jv..........jv..........jv..........jv..........jv..........jv..........jv..........jv..........jv..........jv..........jv..........jv..........jv..........jv..........jv..........jv..........jv..........jv..........jv..........jv..........jv..........jv..........jv..........jv..........jv..........jv..........jv..........jv..........jv..........jv..........jv..........jv..........jvinterfcejv");
    }

    @Test
    public void test27243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest54.test27243");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripToEmpty("...VA.LANGAVAJ.GNALa.lang.CloneableStringinterfacejava.io...VA.LANGAVAJ.GNALJ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "...VA.LANGAVAJ.GNALa.lang.CloneableStringinterfacejava.io...VA.LANGAVAJ.GNALJ" + "'", str1, "...VA.LANGAVAJ.GNALa.lang.CloneableStringinterfacejava.io...VA.LANGAVAJ.GNALJ");
    }

    @Test
    public void test27244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest54.test27244");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.substring("JavastringslitUgnirtSarraylistarraylistavaj.gnalarraylistarraylistarrayli", 125, 456);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test27245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest54.test27245");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripAccents((java.lang.CharSequence) "gnalarraylistarraylistarrayli");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "gnalarraylistarraylistarrayli" + "'", str1, "gnalarraylistarraylistarrayli");
    }

    @Test
    public void test27246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest54.test27246");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("VAJ.GNAL", "AAAAAAAAAAnga.lavajAAAAAAAAAAnga.lavajAAAAAAAAAAnga.lavajAAAAAAAAAAnga.lavajAAAAAAAAAAnga.lavajAAAAAAAAAAnga.lavajAAAAAAAAAAnga.lavajAAAAAAAAAAnga.lavajAAAAAAAAAAnga.lavajAAAAAAAAAAnga.lavajAAAAAAAAAAnga.lavajAAAAAAAAAAnga.lavajAAAAAAAAAAnga.lavajAAAAAAAAAAnga.lavajAAAAAAAAAAnga.lavajAAAAAAAAAAnga.lavajAAAAAAAAAAnga.lavajAAAAAAAAAAnga.lavajAAAAAAAAAAnga.lavajAAAAAAAAAAnga.lavajAAAAAAAAAAnga.lavajAAAAAAAAAAnga.lavajAAAAAAAAAAnga.lavajAAAAAAAAAAnga.lavajAAAAAAAAAAnga.lavajAAAAAAAAAAnga.lavajAAAAAAAAAAnga.lavajAAAAAAAAAAnga.lavajAAAAAAAAAAnga.lavajAAAAAAAAAAnga.lavajAAAAAAAAAAnga.lavajAAAAAAAAAAnga.lavajAAAAAAAAAAnga.lavajAAAAAAAAAAnga.lavajAAAAAAAAAAnga.lavajAAAAAAAAAA");
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test27247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest54.test27247");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.normalizeSpace("hi!arrylistarrylistarrylistvjhhhh aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaahhh aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaahhh aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaahhh aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaahhh aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaahhh aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaahhh aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaahhh aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaahhh aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaahhh aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hi!arrylistarrylistarrylistvjhhhh aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaahhh aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaahhh aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaahhh aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaahhh aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaahhh aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaahhh aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaahhh aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaahhh aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaahhh aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa" + "'", str1, "hi!arrylistarrylistarrylistvjhhhh aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaahhh aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaahhh aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaahhh aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaahhh aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaahhh aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaahhh aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaahhh aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaahhh aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaahhh aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
    }

    @Test
    public void test27248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest54.test27248");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOfIgnoreCase("aaaa                       javaulangrraylist", ".....................", 655);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test27249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest54.test27249");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.leftPad("interface java.lang.cloneableinterface java.lang.cloneableinterface ja][sslC][sslCrChahacta][sslC][sslCinterface java.lang.cloneableinterface java.lang.cloneableinterface ja", 117, 'a');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "interface java.lang.cloneableinterface java.lang.cloneableinterface ja][sslC][sslCrChahacta][sslC][sslCinterface java.lang.cloneableinterface java.lang.cloneableinterface ja" + "'", str3, "interface java.lang.cloneableinterface java.lang.cloneableinterface ja][sslC][sslCrChahacta][sslC][sslCinterface java.lang.cloneableinterface java.lang.cloneableinterface ja");
    }

    @Test
    public void test27250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest54.test27250");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitByCharacterTypeCamelCase("AAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAA");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.getCommonPrefix(strArray1);
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test27251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest54.test27251");
        char[] charArray13 = new char[] { ' ', ' ', '#', 'a', '4', 'a' };
        int int14 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "", charArray13);
        boolean boolean15 = org.apache.commons.lang3.StringUtils.containsAny("......", charArray13);
        int int16 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "AAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAA", charArray13);
        boolean boolean17 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) ".lang.Stringclass j...", charArray13);
        int int18 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "gnlrrylistrrylistrryl", charArray13);
        int int19 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "JAVA.IO.SERIALIZABLE INTERFACE JAVA.LANG.CLONEABLE... INTERFACE", charArray13);
        int int20 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "gnal.aL.ArrayList", charArray13);
        org.junit.Assert.assertNotNull(charArray13);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray13), "  #a4a");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray13), "  #a4a");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray13), "[ ,  , #, a, 4, a]");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 20 + "'", int19 == 20);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 2 + "'", int20 == 2);
    }

    @Test
    public void test27252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest54.test27252");
        int int2 = org.apache.commons.lang3.StringUtils.getLevenshteinDistance((java.lang.CharSequence) "class java.util.AbstractListgn lu v j ..............................................................", (java.lang.CharSequence) "################################");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
    }

    @Test
    public void test27253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest54.test27253");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphanumericSpace((java.lang.CharSequence) "....java......");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test27254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest54.test27254");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfDifference((java.lang.CharSequence) "stArrayListArrayListavaj.gnalArrayListArrayListArrayListavaj.gnalArrayListArrayLis", (java.lang.CharSequence) "A..ayL################################A.");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test27255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest54.test27255");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replace("..........a       ..", "##################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################avajGNAL", " t i  tcejbO.gnal.avaj  alcrr t i  tcejbO.gnal.avaj  alcrr va.langGN  ..langjava.lang GN  elbazilaireSelbazilaireSelbazilaireSelbazilaireSelbazilaireSelbazilaireSelbazilaireSelbazilaireSelbazilaireSelbazilaireSelbazilaireSelbazilaireSelbazilaireSelbazilaireSelbazilaireSelbazilaireSelbazilaireSelbazilaireSelbazilaireSelbazilaireSelbazilaireSelbazilaireSelbazilaireSelbazilaireSelbazilaireSelbazilaireSelbazilaireSelbazilaireSelbazilaireSelbazilaireSelbazilaireSelbazilaireSelbazilaireSe");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "..........a       .." + "'", str3, "..........a       ..");
    }

    @Test
    public void test27256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest54.test27256");
        java.lang.String[] strArray3 = new java.lang.String[] { "lang.javalang.javalang.java", "-1j#v#.utilString-1j#v#.utilString" };
        int int4 = org.apache.commons.lang3.StringUtils.indexOfAny("JAVA.IO.SERIALIZABLE JAVA.LANG.cLONEABLESTRINGINTERFA.E INTERFA.EJAVA.IO.SERIALIZABLE JAVA.LANG.cLONEABLESTRINGINTERFA.E INTERFA.EJAVA.IO.SERIALIZABLE JAVA.LANG.cLONEABLESTRINGINTERFA.E INTERFA.E", strArray3);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
    }

    @Test
    public void test27257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest54.test27257");
        int int2 = org.apache.commons.lang3.StringUtils.indexOf("gagnAAAAAAAAAAistArrayListArrayListavaj.gnalArrayListArrayListArrayLigagnAAAAAAAAAAistArrayListArrayListavaj.gnalArrayListArrayListArrayLigagnAAAAAAAAAAistArrayListArrayListavaj.gnalArrayListArrayListArrayLigagnAAAAAAAAAAistArrayListArrayListavaj.gnalArrayListArrayListArrayLigagnAAAAAAAAAAistArrayListArrayListavaj.gnalArrayListArrayListArrayLigagnAAAAAAAAAAistArrayListArrayListavaj.gnalArrayListArrayListArrayLigagnAAAAAAAAAAistArrayListArrayListavaj.gnalArrayListArrayListArrayLigagnAAAAAAAAAAistArrayListArrayListavaj.gnalArrayListArrayListArrayLigagnAAAAAAAAAAistArrayListArrayListavaj.gnalArrayListArrayListArrayLigagnAAAAAAAAAAistArrayListArrayListavaj.gnalArrayListArrayListArrayLigagnAAAAAAAAAAistArrayListArrayListavaj.gnalArrayListArrayListArrayLigagnAAAAAAAAAAistArrayListArrayListavaj.gnalArrayListArrayListArrayLigagnAAAAAAAAAAistinterface java.lang.Cloneable             Character             interface java.io.Serializable", "interface java.lang.CloneableLlituLlituLlituLlituLlituLlituLlituLlituLlituLlituLlituLlituLlituLlituLlituLlituLlituLlituLlituLlituLlituLlituLlituLlituLlituLlituLlituLlituLlituLlituLlituLlituLlituLlituLlituinterface java.io.SerializablegnirtS.gegnirtS.gegnirtS.gegnirtS.gegnirtS.gegnirtS.gegnirtS.gegnirtS.gegnirtS.gegnirtS.gegnirtS.gegnirtS.gegnirtS.gegnirtS.gegnirtS.gegnirtS.gegnirtS.gegnirtS.gegnirtS.gegnirtS.gegnirtS.gegnirtS.gegnirtS.gegnirtS.gegnirtS.gegnirtS.gegnirtS.gegnirtS.gegnirtS.gegnirtS.gegnirtS.gegnirtS.gegnirtS.gegnirtS.gegnirtS.gegnirtS.gegnirtS.gegnirtS.gegnirtS.gegnirtS.gegnirtS.gegnirtS.gegnirtS.gegnirtS.gegnirtS.gegnirtS.gegnirtS.gegnirtS.gegni");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test27258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest54.test27258");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("Short", "       $", (int) (byte) 100);
        java.lang.String str5 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray3, '.');
        java.lang.String str9 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray3, "][sslC][sslCrChahaAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAA", 484, 50);
        int int10 = org.apache.commons.lang3.StringUtils.indexOfDifference((java.lang.CharSequence[]) strArray3);
        java.lang.String[] strArray11 = org.apache.commons.lang3.StringUtils.stripAll(strArray3);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Short" + "'", str5, "Short");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertNotNull(strArray11);
    }

    @Test
    public void test27259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest54.test27259");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.contains("                   StringStringStringStringStringStringStringStringStringString                    ", 270);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test27260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest54.test27260");
        char[] charArray11 = new char[] { ' ', ' ', '#', 'a', '4', 'a' };
        int int12 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "", charArray11);
        boolean boolean13 = org.apache.commons.lang3.StringUtils.containsAny("$", charArray11);
        boolean boolean14 = org.apache.commons.lang3.StringUtils.containsAny("                      ", charArray11);
        int int15 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "ARRYLISTARRYLISTARRYLISTARRYLISTARRYLISTARRYLISTARRYLISTARRYLISTARRYLISTARRYLISTARRYLISTARRYLISTARRYLISTARRYLISTARRYLISTARRYLISTARRYLISTARRYLISTARRYLISTARRYLISTARRYLISTARRYLISTARRYLISTARRYLISTARRYLISTARRYLISTARRYLISTARRYLISTARRYLISTARRYLISTARRYLISTARRYLISTARRYLISTARRYLISTARRYLISTARRYLISTARRYLISTARRYLIST", charArray11);
        boolean boolean16 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "java.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.lang", charArray11);
        org.junit.Assert.assertNotNull(charArray11);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray11), "  #a4a");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray11), "  #a4a");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray11), "[ ,  , #, a, 4, a]");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test27261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest54.test27261");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isEmpty((java.lang.CharSequence) "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaara                                            ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test27262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest54.test27262");
        char[] charArray5 = new char[] {};
        int int6 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "$       ", charArray5);
        int int7 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) ". ", charArray5);
        int int8 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "...VA.LANGAVAJ.GNALJAVA.LANGAVAJ.GNALJAVA.LANGAVAJ.GNALJAVA.LANGAVAJ.GNALJAVA.LANGAVAJ.GNALJAVA.LANG", charArray5);
        int int9 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "java$.lang.Stringclassjava.lang.Stringclassjava.lang.Stringclas.lang.Stringclassjava", charArray5);
        boolean boolean10 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "Va.langGNAL..la...", charArray5);
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray5), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray5), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray5), "[]");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test27263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest54.test27263");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.contains("langAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAulang", "hi!ArrayListArrayListArrayListavaj.... AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA... AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA... AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA... AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA... AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA... AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA... AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA... AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA... AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA... ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test27264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest54.test27264");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trimToEmpty("gn                                            gn                                            gn                                            ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "gn                                            gn                                            gn" + "'", str1, "gn                                            gn                                            gn");
    }

    @Test
    public void test27265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest54.test27265");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.chomp("                                                 String                                                   ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "                                                 String                                                   " + "'", str1, "                                                 String                                                   ");
    }

    @Test
    public void test27266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest54.test27266");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("..................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................gnirtSlitu.avaj1-gnirtSlitu.avaj1-");
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test27267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest54.test27267");
        java.lang.String str2 = org.apache.commons.lang3.ClassUtils.getPackageName((java.lang.Object) "Arr... aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa... aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa... aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa... aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa... aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa... aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa... aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa... aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa... aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa..", "444444444444444444.44444444444444444");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "java.lang" + "'", str2, "java.lang");
    }

    @Test
    public void test27268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest54.test27268");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.chomp("VA.LANGAVAJ.GNALJAVA.LANGAVAJ.GNALJAVA.LANGAVAJ.GNALJAVA.LANGAVAJ.GNALJAVA.LANGAVAJ.GNALJAVA.....", "ArrayLis...VA.LANGAVAJ.GNALJAVA.LANGAVAJ.GNALJAVA.LANGAVAJ.GNALJAVA.LANGAVAJ.GNALJAVA.LANGAVAJ.GNALJAVA.LANG");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "VA.LANGAVAJ.GNALJAVA.LANGAVAJ.GNALJAVA.LANGAVAJ.GNALJAVA.LANGAVAJ.GNALJAVA.LANGAVAJ.GNALJAVA....." + "'", str2, "VA.LANGAVAJ.GNALJAVA.LANGAVAJ.GNALJAVA.LANGAVAJ.GNALJAVA.LANGAVAJ.GNALJAVA.LANGAVAJ.GNALJAVA.....");
    }

    @Test
    public void test27269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest54.test27269");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAsciiPrintable((java.lang.CharSequence) "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                        iRFCO.IRFIOSRIIZ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test27270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest54.test27270");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass2 = org.apache.commons.lang3.ClassUtils.getClass("jvstringnlrrylistrrylistrrylistvj", true);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassNotFoundException; message: jvstringnlrrylistrrylistrrylistvj");
        } catch (java.lang.ClassNotFoundException e) {
            // Expected exception.
        }
    }

    @Test
    public void test27271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest54.test27271");
        int int2 = org.apache.commons.lang3.StringUtils.countMatches("lang.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.1aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaajava.1aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa.1aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa.1aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa.1aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa.1aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa.1aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa.1aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa.1aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa.hi!arraylistarraylistarraylis", ".........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........javainterface java.io");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test27272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest54.test27272");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsIgnoreCase("ByteByteByteByteByteByteByteByteByteByteByteByteByteByteByteByteByteByteByteByteByteByteByteByteByteByteByteByteByteByteByteByteByteByteByteByteByteByteByteByteByteByteByteByteByteByteByteByteByteByteByteByteByteyteByteByteByteByteByteByteByteByteByteByteByteByteByteByteByteByteByteByteByteByteByteByteByteByteByteByteByteByteByteByteByteByteByteByteByteByteByteByteByteByteByteByteByteByteByteByteByteByteByteByteByteByt", "gnalArrayListArrayListArrayLi                                                                       ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test27273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest54.test27273");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.swapCase("Java.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.lang");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "jAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANG" + "'", str1, "jAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANG");
    }

    @Test
    public void test27274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest54.test27274");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.center("javaStrinSerializableSerializableSerializableSeriali", 52, '#');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "javaStrinSerializableSerializableSerializableSeriali" + "'", str3, "javaStrinSerializableSerializableSerializableSeriali");
    }

    @Test
    public void test27275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest54.test27275");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfIgnoreCase("                                                                 AtsiLytcejbOlvjsslcrrAtsiLytcejbO.gnal.avaj ssalcrrAva.langGNAL..langjava.langAGNAL.AVAJaa...                                                                                                                                   ", "                                                                                                              ");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 158 + "'", int2 == 158);
    }

    @Test
    public void test27276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest54.test27276");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.startsWithIgnoreCase("INTERFACE JAVA.LANG.cLONEABLEa RRR RRR RRR RRR RRR RRR RRR RRR RNAL....................INTERFACE JAVA.LANG", "AAAAAAAAAAAAAAAAAAAgnaluavajAAAAAAAAAAAAAAAAAAA");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test27277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest54.test27277");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.left("Arr... aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa... aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa... aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa... aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa... aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa... aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa... aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa... aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa... aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa.", 149);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Arr... aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa... aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa" + "'", str2, "Arr... aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa... aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
    }

    @Test
    public void test27278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest54.test27278");
        int int3 = org.apache.commons.lang3.StringUtils.indexOf("ArrNAL.AVAJNAL.AVAJNAL.AVAJNAL.AVAJNAL.AVAJNAL.", "###########################VA.LANGAVAJ.GNALJAVA.LANGAVAJ.GNALJAVA.LANGAVAJ.GNALJAVA.LANGAVAJ.GNALJAVA.LANGAVAJ.GNALJAVA.LANG###########################INTERFACE JAVAaLANGacLONEABLEaaaaaaaJAVAaaaaaaaaaaJAVAaaaaaaaaaaJAVAaaaaaaaaaaJAVAaaaaaaaaaaJAVAaaaaaaaaaaJAVAaaaaaaaaaaJAVAaaaaaaaaaaJAVAaaaaaaaaaaJAVAaaaaaaaaaaJAVAaaaaaaaaaaJAVAaaaaaaaaaaJAVAaaaaaaaaaaJAVAaaaaaaaaaaJAVAaaaaaaaaaaJAVAaaaaaarrINTERFACE JAVAaLANGacLONEABLEaaaaaaaJAVAaaaaaaaaaaJAVAaaaaaaaaaaJAVAaaaaaaaaaaJAVAaaaaaaaaaaJAVAaaaaaaaaaaJAVAaaaaaaaaaaJAVAaaaaaaaaaaJAVAaaaaaaaaaaJAVAaaaaaaaaaaJAVAaaaaaaaaaaJAVAaaaaaaaaaaJAVAaaaaaaaaaaJAVAaaaaaaaaaaJAVAaaaaaaaaaaJAVAaaaaaaa", 444);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test27279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest54.test27279");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substring("java.lang$interface java.lang.Cloneable$interface java.io.Serializableinterface java.lang.Cloneable$interface java.io.Serializableinterface java.lang.Cl", 0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "java.lang$interface java.lang.Cloneable$interface java.io.Serializableinterface java.lang.Cloneable$interface java.io.Serializableinterface java.lang.Cl" + "'", str2, "java.lang$interface java.lang.Cloneable$interface java.io.Serializableinterface java.lang.Cloneable$interface java.io.Serializableinterface java.lang.Cl");
    }

    @Test
    public void test27280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest54.test27280");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isEmpty((java.lang.CharSequence) "l.ngAGNALelb.zil.ireSelb.zil.ireSelb.zil.ireSelb.zil.ireSelb.zil.ireSelb.zil.ireSelb.zil.ireSelb.zil.ireSelb.zil.ireSelb.zil.ireSelb.zil.ireSelb.zil.ireSelb.zil.ireSelb.zil.ireSelb.zil.ireSelb.zil.ireSelb.zil.ireSelb.zil.ireSelb.zil.ireSelb.zil.ireSelb.zil.ireSelb.zil.ireSelb.zil.ireSelb.zil.ireSelb.zil.ireSelb.zil.ireSelb.zil.ireSelb.zil.ireSelb.zil.ireSelb.zil.ireSelb.zil.ireSelb.zil.ireSelb.zil.ireSe");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test27281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest54.test27281");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.upperCase("aaaaaaaaaajaval.agnaaaaaaaaaa");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "AAAAAAAAAAJAVAL.AGNAAAAAAAAAA" + "'", str1, "AAAAAAAAAAJAVAL.AGNAAAAAAAAAA");
    }

    @Test
    public void test27282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest54.test27282");
        int int2 = org.apache.commons.lang3.StringUtils.getLevenshteinDistance((java.lang.CharSequence) "444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444interface java.lang.Cloneable...                                 interface java.io.Serializable", (java.lang.CharSequence) "java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........jav");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 472 + "'", int2 == 472);
    }

    @Test
    public void test27283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest54.test27283");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringAfter("ArrayListArrayListArrayList", "class javalangclass                       javaulang                       javaulang                       javaulang                       javaulang                       javaulang                       javaulang                       javaulang                       javaulang                       javaulang                       javaulang                       javaulang                       javaulang                       javaulang                       javaulang                       javaulang                       javaulang                       javaulang                       javaulang                       javaulang                       javaulang");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test27284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest54.test27284");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.rightPad("ssalC.gnal.avaj ssalc", 0, '4');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "ssalC.gnal.avaj ssalc" + "'", str3, "ssalC.gnal.avaj ssalc");
    }

    @Test
    public void test27285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest54.test27285");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.contains("..........", (int) 'a');
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test27286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest54.test27286");
        java.lang.ClassLoader classLoader0 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass2 = org.apache.commons.lang3.ClassUtils.getClass(classLoader0, "                                                                                                                                                                                                                                                                                                                                                                                            ");
            org.junit.Assert.fail("Expected exception of type java.lang.ClassNotFoundException; message: ");
        } catch (java.lang.ClassNotFoundException e) {
            // Expected exception.
        }
    }

    @Test
    public void test27287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest54.test27287");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("i4elbaenolCAgnalAavajiecafretniTRINGi4elbaenolCAgnalAavajiecaf", '$');
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test27288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest54.test27288");
        int int2 = org.apache.commons.lang3.StringUtils.getLevenshteinDistance((java.lang.CharSequence) "AAAA                       JAVAULANGrrayList", (java.lang.CharSequence) "i");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 43 + "'", int2 == 43);
    }

    @Test
    public void test27289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest54.test27289");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trimToNull("                                  $$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$" + "'", str1, "$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$");
    }

    @Test
    public void test27290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest54.test27290");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNumericSpace((java.lang.CharSequence) "444444444444444444444444444444444444444444444444444444444444444gn                                            gn      tavaj.gnalarraylistarraylistarrayli");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test27291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest54.test27291");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.center("Arr... aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa... aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa... aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa... aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa... aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa... aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa... aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa... aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa... aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa... aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaylis", (int) (byte) 100, "AAAAAAAAAAj#v##.#gnAAAAAAAAAAj#v##.#gnAAAAAAAAAAj#v##.#gnAAAAAAAAAAj#v##.#gnAAAAAAAAAAj#v##.#gnAAAAAAAAAAj#v##.#gnAAAAAAAAAAj#v##.#gnAAAAAAAAAAj#v##.#gnAAAAAAAAAAj#v##.#gnAAAAAAAAAAj#v##.#gnAAAAAAAAAAj#v##.#gnAAAAAAAAAAj#v##.#gnAAAAAAAAAAj#                                              AAAAAAAj#v##.#gnAAAAAAAAAAj#v##.#gnAAAAAAAAAAj#v##.#gnAAAAAAAAAAj#v##.#gnAAAAAAAAAAj#v##.#gnAAAAAAAAAAj#v##.#gnAAAAAAAAAAj#v##.#gnAAAAAAAAAAj#v##.#gnAAAAAAAAAAj#v##.#gnAAAAAAAAAAj#v##.#gnAAAAAAAAAAj#v##.#gnAAAAAAAAAAj#v##.#gnAAAAAAAAAAring");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Arr... aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa... aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa... aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa... aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa... aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa... aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa... aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa... aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa... aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa... aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaylis" + "'", str3, "Arr... aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa... aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa... aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa... aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa... aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa... aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa... aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa... aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa... aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa... aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaylis");
    }

    @Test
    public void test27292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest54.test27292");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOf("JAVA", "                  ...                         $$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$", 92);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test27293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest54.test27293");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("avaj.gnal", "$       ");
        java.lang.String[] strArray7 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("...", 'a');
        java.lang.String[] strArray10 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("$", "                                   ");
        java.lang.String str11 = org.apache.commons.lang3.StringUtils.replaceEachRepeatedly("...       ", strArray7, strArray10);
        java.lang.String str12 = org.apache.commons.lang3.StringUtils.replaceEachRepeatedly("                                              ", strArray3, strArray10);
        java.lang.String str14 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray10, "-1java.utilString[]");
        java.lang.String[] strArray16 = org.apache.commons.lang3.StringUtils.stripAll(strArray10, "Class[]aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        java.lang.String str17 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray10);
        java.lang.Class<?>[] wildcardClassArray18 = org.apache.commons.lang3.ClassUtils.toClass((java.lang.Object[]) strArray10);
        java.lang.String[] strArray22 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("hi!", "");
        java.lang.String[] strArray24 = org.apache.commons.lang3.StringUtils.stripAll(strArray22, "$");
        java.lang.Class<?>[] wildcardClassArray25 = org.apache.commons.lang3.ClassUtils.toClass((java.lang.Object[]) strArray22);
        java.lang.Class<?>[] wildcardClassArray26 = org.apache.commons.lang3.ClassUtils.toClass((java.lang.Object[]) wildcardClassArray25);
        java.lang.Class<?>[] wildcardClassArray27 = org.apache.commons.lang3.ClassUtils.wrappersToPrimitives(wildcardClassArray26);
        java.lang.Class<?> wildcardClass28 = null;
        java.lang.Class[] classArray30 = new java.lang.Class[1];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray31 = (java.lang.Class<?>[]) classArray30;
        wildcardClassArray31[0] = wildcardClass28;
        java.lang.Class<?>[] wildcardClassArray34 = org.apache.commons.lang3.ClassUtils.primitivesToWrappers(wildcardClassArray31);
        boolean boolean36 = org.apache.commons.lang3.ClassUtils.isAssignable(wildcardClassArray27, wildcardClassArray34, true);
        java.lang.String str37 = org.apache.commons.lang3.StringUtils.concatWith("java.langjava.langjava.langjava.langjava.langjava.la                                                ", (java.lang.Object[]) wildcardClassArray34);
        java.lang.Class<?>[] wildcardClassArray38 = org.apache.commons.lang3.ClassUtils.primitivesToWrappers(wildcardClassArray34);
        java.lang.String str40 = org.apache.commons.lang3.ClassUtils.getPackageName((java.lang.Object) wildcardClassArray38, "j ssalcrrAva.langGNAL..langjava.langAGNAL.AVAJ");
        boolean boolean41 = org.apache.commons.lang3.ClassUtils.isAssignable(wildcardClassArray18, wildcardClassArray38);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertNotNull(strArray10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "$       " + "'", str11, "$       ");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "                                              " + "'", str12, "                                              ");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "$" + "'", str14, "$");
        org.junit.Assert.assertNotNull(strArray16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "$" + "'", str17, "$");
        org.junit.Assert.assertNotNull(wildcardClassArray18);
        org.junit.Assert.assertNotNull(strArray22);
        org.junit.Assert.assertNotNull(strArray24);
        org.junit.Assert.assertNotNull(wildcardClassArray25);
        org.junit.Assert.assertNotNull(wildcardClassArray26);
        org.junit.Assert.assertNotNull(wildcardClassArray27);
        org.junit.Assert.assertNotNull(classArray30);
        org.junit.Assert.assertNotNull(wildcardClassArray31);
        org.junit.Assert.assertNotNull(wildcardClassArray34);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "" + "'", str37, "");
        org.junit.Assert.assertNotNull(wildcardClassArray38);
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "java.lang" + "'", str40, "java.lang");
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
    }

    @Test
    public void test27294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest54.test27294");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.right("irfCo$irfioSrA..ayL.A.444444444444444444444444444", 0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test27295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest54.test27295");
        java.lang.String[] strArray5 = org.apache.commons.lang3.StringUtils.split("AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA", "arraylist", 669);
        boolean boolean6 = org.apache.commons.lang3.StringUtils.startsWithAny("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaajaval#.#agn", strArray5);
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.concatWith("Litulitulitulitulitul####litulitulitulitulitul", (java.lang.Object[]) strArray5);
        int int8 = org.apache.commons.lang3.StringUtils.indexOfDifference((java.lang.CharSequence[]) strArray5);
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA" + "'", str7, "AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
    }

    @Test
    public void test27296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest54.test27296");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOfIgnoreCase("", "JAV");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test27297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest54.test27297");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.substring("AAAAAAAAAAnga.lavajAAAAAAAAAAnga.lavajAAAAAAAAAAnga.lavajAAAAAAAAAAnga.lavajAAAAAAAAAAnga.lavajAAAAAAAAAAnga.lavajAAAAAAAAAAnga.lavajAAAAAAAAAAnga.lavajAAAAAAAAAAnga.lavajAAAAAAAAAAnga.lavajAAAAAAAAAAnga.lavajAAAAAAAAAAnga.lavajAAAAAAAAAAnga.lavajAAAAAAAAAAnga.lavajAAAAAAAAAAnga.lavajAAAAAAAAAAnga.lavajAAAAAAAAAAnga.lavajAAAAAAAAAAnga.lavajAAAAAAAAAAnga.lavajAAAAAAAAAAnga.lavajAAAAAAAAAAnga.lavajAAAAAAAAAAnga.lavajAAAAAAAAAAnga.lavajAAAAAAAAAAnga.lavajAAAAAAAAAAnga.lavajAAAAAAAAAAnga.lavajAAAAAAAAAAnga.lavajAAAAAAAAAAnga.lavajAAAAAAAAAAnga.lavajAAAAAAAAAAnga.lavajAAAAAAAAAAnga.lavajAAAAAAAAAAnga.lavajAAAAAAAAAAnga.lavajAAAAAAAAAAnga.lavajAAAAAAAAAAnga.lavajAAAAAAAAAAahahCrClss[]Clss[]", 240, 59);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test27298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest54.test27298");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.swapCase("-1java.utilString[]    ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "-1JAVA.UTILsTRING[]    " + "'", str1, "-1JAVA.UTILsTRING[]    ");
    }

    @Test
    public void test27299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest54.test27299");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlpha((java.lang.CharSequence) "INTERFACEGAGA.LANG.cLONEABLEaaaaaaaaaaGAGAL.AGNaaaaaaaaaaGAGAL.AGNaaaaaaaaaaGAGAL.AGNaaaaaaaaaaGAGAL.AGNaaaaaaaaaaGAGAL.AGNaaaaaaaaaaGAGAL.AGNaaaaaaaaaaGAGAL.AGNaaaaaaaaaaGAGAL.AGNaaaaaaaaaaGAGAL.AGNaaaaaaaaaaGAGAL.AGNaaaaaaaaaaGAGAL.AGNaaaaaaaaaaGAGAL.AGNaaaaaaaaaaGAGAL.AGNaaaaaaaaaaGAGAL.AGNaaaaaaaaaaGAGAL.AGNaaaaaaaaaaGAGAL.AGNaaaaaaaaaaGAGAL.AGNaaaaaaaaaaGAGAL.AGNaaaaaaaaaaGAGAL.AGNaaaaaaaaaaGAGAL.AGNaaaaaaaaaaGAGAL.AGNaaaaaaaaaaGAGAL.AGNaaaaaaaaaaGAGAL.AGNaaaaaaaaaaGAGAL.AGNaaaaaaaaaaGAGAL.AGNaaaaaaaaaaGAGAL.AGNaaaaaaaaaaGAGAL.AGNaaaaaaaaaaGAGAL.AGNaaaaaaaaaaGAGAL.AGNaaaaaaaaaaGAGAL.AGNaaaaaaaaaaGAGAL.AGNaaaaaaaaaaGAGAL.AGNaaaaaaaaaaGAGAL.AGNaaaaaaaaaaGAGAL.AGNaaaaaaaaaaGAGAL.AGNaaaaaaaaaaRINGINTERFACEGAGA.IO.sERIALIZABLE");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test27300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest54.test27300");
        int int2 = org.apache.commons.lang3.StringUtils.indexOf("ssalC.gnal.avaj ssalcinterfacejava.lang.Cloneable#interfacejava.i", 119);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test27301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest54.test27301");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.equalsIgnoreCase("#############################################################...", "$         $         $         $         $         $         $         $         $         $         $         $         $         $         $         $         $         $         $         $         $         $         $         $         $         $         $         $         $         $         $         $         $         $         $         ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test27302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest54.test27302");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.stripStart("...####java.uti###############################...", "...java..........java...");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "####java.uti###############################..." + "'", str2, "####java.uti###############################...");
    }

    @Test
    public void test27303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest54.test27303");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.startsWith("TU                    ", "                                                                                                                                                                                                                                                                                                 classjavalangclassjavaulangjavaulangjavaulangjavaulangjavaulangjavaulangjavaulangjavaulangjavaulangjavaulangjavaulangjavaulangjavaulangjavaulangjavaulangjavaulangjavaulangjavaulangjavaulangjavaulang");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test27304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest54.test27304");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.remove("...............................................................................................................................................................................................................................HI!aRRAYlISTaRRAYlISTaRRAYlISTAVAJ.GNALaRRAYlISTaRRAYlISTaRRAYlISTAVAJ..............................................................................................................................................................................................................................", '4');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "...............................................................................................................................................................................................................................HI!aRRAYlISTaRRAYlISTaRRAYlISTAVAJ.GNALaRRAYlISTaRRAYlISTaRRAYlISTAVAJ.............................................................................................................................................................................................................................." + "'", str2, "...............................................................................................................................................................................................................................HI!aRRAYlISTaRRAYlISTaRRAYlISTAVAJ.GNALaRRAYlISTaRRAYlISTaRRAYlISTAVAJ..............................................................................................................................................................................................................................");
    }

    @Test
    public void test27305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest54.test27305");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.upperCase("$         44444444444444444444444444444444444444444444444444444444444444444444444444444444                                                           ...sAitUJAirtSsAijavaulainterface java.lang.Cloneable4interface java.io.Serializable...sAitUJAirtSsAijavaulainterface java.lang.Cloneable4interface java.io.Serializable...sAitUJAirtSsAijavaulainterface java.lang.Cloneable4interface java.io.Serializable...sAitUJAirtSsAijavaulainterface java.lang.Cloneable4interface java.io.Serializabl");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "$         44444444444444444444444444444444444444444444444444444444444444444444444444444444                                                           ...SAITUJAIRTSSAIJAVAULAINTERFACE JAVA.LANG.CLONEABLE4INTERFACE JAVA.IO.SERIALIZABLE...SAITUJAIRTSSAIJAVAULAINTERFACE JAVA.LANG.CLONEABLE4INTERFACE JAVA.IO.SERIALIZABLE...SAITUJAIRTSSAIJAVAULAINTERFACE JAVA.LANG.CLONEABLE4INTERFACE JAVA.IO.SERIALIZABLE...SAITUJAIRTSSAIJAVAULAINTERFACE JAVA.LANG.CLONEABLE4INTERFACE JAVA.IO.SERIALIZABL" + "'", str1, "$         44444444444444444444444444444444444444444444444444444444444444444444444444444444                                                           ...SAITUJAIRTSSAIJAVAULAINTERFACE JAVA.LANG.CLONEABLE4INTERFACE JAVA.IO.SERIALIZABLE...SAITUJAIRTSSAIJAVAULAINTERFACE JAVA.LANG.CLONEABLE4INTERFACE JAVA.IO.SERIALIZABLE...SAITUJAIRTSSAIJAVAULAINTERFACE JAVA.LANG.CLONEABLE4INTERFACE JAVA.IO.SERIALIZABLE...SAITUJAIRTSSAIJAVAULAINTERFACE JAVA.LANG.CLONEABLE4INTERFACE JAVA.IO.SERIALIZABL");
    }

    @Test
    public void test27306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest54.test27306");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfAnyBut("javal#####################", "stringstringstringstringstringstringstringstringstringstring");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test27307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest54.test27307");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.reverseDelimited("..................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................GNIRTSLITU.AVAJ1-GNIRTSLITU.AVAJ1-", '$');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "..................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................GNIRTSLITU.AVAJ1-GNIRTSLITU.AVAJ1-" + "'", str2, "..................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................GNIRTSLITU.AVAJ1-GNIRTSLITU.AVAJ1-");
    }

    @Test
    public void test27308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest54.test27308");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.strip("UUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUtttSUlUttttttttttSUlUtt", "                                                                                                                                                                                                                                                                                                                                                                                                                 LANG.JAVATSILYARRATSILYARRATSILYARRA");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "UUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUtttSUlUttttttttttSUlUtt" + "'", str2, "UUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUtttSUlUttttttttttSUlUtt");
    }

    @Test
    public void test27309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest54.test27309");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.rightPad("yLista$Arr                                                                                                                                                                                                                                                                                                                                                                                                                                                      ", 92, '4');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "yLista$Arr                                                                                                                                                                                                                                                                                                                                                                                                                                                      " + "'", str3, "yLista$Arr                                                                                                                                                                                                                                                                                                                                                                                                                                                      ");
    }

    @Test
    public void test27310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest54.test27310");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.abbreviateMiddle("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa                              ", "$$$NAL", 844);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa                              " + "'", str3, "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa                              ");
    }

    @Test
    public void test27311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest54.test27311");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphanumericSpace((java.lang.CharSequence) "H!IH!IH!IH!IH!IH!VA.LANGAVAJ.GNALJAVA.LANGAVAJ.GNALJAVA.LANGAVAJ.GNALJAVA.LANGAVAJ.GNALJAVA.LANGAVAJ.GNALJAVA.LANGH!IH!IH!IH!IH!IH!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test27312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest54.test27312");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.substring(".", 924, 401);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test27313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest54.test27313");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.lowerCase("..........a");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "..........a" + "'", str1, "..........a");
    }

    @Test
    public void test27314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest54.test27314");
        java.lang.String str1 = org.apache.commons.lang3.ClassUtils.getShortCanonicalName("$$$$$$$$$$$$.");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
    }

    @Test
    public void test27315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest54.test27315");
        int int2 = org.apache.commons.lang3.StringUtils.getLevenshteinDistance((java.lang.CharSequence) "tarraylitavaj.gnalarraylistarraylistarraylitavaj.gnalarraylistarraylistarraylitavaj.gnalarraylistarraylistarraylitavaj.gnalarraylistarraylistarraylitavaj.gnalarraylistarraylistarraylitavaj.gnalarraylistarraylistarraylitavaj.gnalarraylistarraylistarraylitavaj.gnalarraylistarraylistarraylitavaj.gnalarraylistarraylistarraylitavaj.gnalarraylistarraylistarraylitavaj.gnalarrayli                                 ...", (java.lang.CharSequence) "#####A##ayL#A#################################aaaaaaaaaa");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 399 + "'", int2 == 399);
    }

    @Test
    public void test27316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest54.test27316");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.remove("GNALaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaagn                                            ", '$');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "GNALaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaagn                                            " + "'", str2, "GNALaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaagn                                            ");
    }

    @Test
    public void test27317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest54.test27317");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.center("JAVA.LANGAgnal.avajgnal..LANGgnal.avArrclass java.lang.ObjectyListAr...", 423);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                                                                                                                                                                JAVA.LANGAgnal.avajgnal..LANGgnal.avArrclass java.lang.ObjectyListAr...                                                                                                                                                                                " + "'", str2, "                                                                                                                                                                                JAVA.LANGAgnal.avajgnal..LANGgnal.avArrclass java.lang.ObjectyListAr...                                                                                                                                                                                ");
    }

    @Test
    public void test27318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest54.test27318");
        int int3 = org.apache.commons.lang3.StringUtils.lastOrdinalIndexOf("                                       sl..Ug..r.S                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                       ", "NALaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", 119);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test27319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest54.test27319");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeStartIgnoreCase("interfacejava.lang.Cloneable#interfacejava.io", "J#avaaaaaaaaaava#.#langava#.#langjava#.#langjava#.#langjava#.#langjava#.#langjava#.#langjava#.#langjava#.#langjava#.#langjava#.#langjava#.#langjava#.#langjava#.#langjava#.#langjava#");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "interfacejava.lang.Cloneable#interfacejava.io" + "'", str2, "interfacejava.lang.Cloneable#interfacejava.io");
    }

    @Test
    public void test27320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest54.test27320");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceChars(".lang.Stringclass j...", "hinterface java.lang.cloneable4interface java.io.serializabl....1aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa...1aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa...1aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa...1aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa...1aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa...1aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa...1aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa...1aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa...1aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa...1aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "ayL A    ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + " LS  yL  " + "'", str3, " LS  yL  ");
    }

    @Test
    public void test27321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest54.test27321");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.difference("aaaa......", "irtS");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "irtS" + "'", str2, "irtS");
    }

    @Test
    public void test27322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest54.test27322");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trimToNull("sTRINGuTILSsTRINGuTILSsTRINGuTILSsTRINGuTILSsTRINGuTILSsTRINGuTILSsTRINGuTILSsTRINGuTILSsTRINGuTILSsTRINGuTILS");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "sTRINGuTILSsTRINGuTILSsTRINGuTILSsTRINGuTILSsTRINGuTILSsTRINGuTILSsTRINGuTILSsTRINGuTILSsTRINGuTILSsTRINGuTILS" + "'", str1, "sTRINGuTILSsTRINGuTILSsTRINGuTILSsTRINGuTILSsTRINGuTILSsTRINGuTILSsTRINGuTILSsTRINGuTILSsTRINGuTILSsTRINGuTILS");
    }

    @Test
    public void test27323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest54.test27323");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.abbreviateMiddle("aaaaaaaaaaJAVAL.AGNaaaaaaaaaaJAVAL.AGNaaaaaaaaaaJAVAL.AGNaaaaaaaaaaJAVAL.AGNaaaaaaaaaaJAVAL.AGNaaaaaaaaaaJAVAL.AGNaaaaaaaaaaJAVAL.AGNaaaaaaaaaaJAVAL.AGNaaaaaaaaaaJAVAL.AGNaaaaaaaaaaJAVAL.AGNaaaaaaaaaaJAVAL.AGNaaaaaaaaaaJAVAL.AGNaaaaaaaaaaJAVAL.AGNaaaaaaaaaaJAVAL.AGNaaaaaaaaaaJAVAL.AGNaaaaaaaaaaJAVAL.AGNaaaaaaaaaaJAVAL.AGNaaaaaaaaaaJAVAL.AGNaaaaaaaaaaJAVAL.AGNaaaaaaaaaaJAVAL.AGNaaaaaaaaaaJAVAL.AGNaaaaaaaaaaJAVAL.AGNaaaaaaaaaaJAVAL.AGNaaaaaaaaaaJAVAL.AGNaaaaaaaaaaJAVAL.AGNaaaaaaaaaaJAVAL.AGNaaaaaaaaaaJAVAL.AGNaaaaaaaaaaJAVAL.AGNaaaaaaaaaaJAVAL.AGNaaaaaaaaaaJAVAL.AGNaaaaaaaaaaJAVAL.AGNaaaaaaaaaaJAVAL.AGNaaaaaaaaaaJAVAL.AGNaaaaaaaaaaJAVAL.AGNaaaaaaaaaaJAVAL.AGN", "aRRYlIStavaj.gnalarraylistarraylistarraylitavaj.gnalarraylistarraylistarraylitavaj.gnalarraylistarraylistarraylitavaj.gnalarraylistarraylistarraylitavaj.gnalarraylistarraylistarraylitavaj.gnalarraylistarraylistarraylitavaj.gnalarraylistarraylistarraylitavaj.gnalarraylistarraylistarraylitavaj.gnalarraylistarraylistarraylitavaj.gnalarraylistarraylistarraylitavaj.gnalarraylistarraylistarraylitavaj.gnalarraylistarraylistarraylitavaj.gnalarraylistarraylistarraylitavaj.gnalarraylistarraylistarraylitavaj.gnalarraylistarraylistarraylitavaj.gnalarraylistarraylistarraylitavaj.gnalarraylistarraylistarraylitavaj.gnalarraylistarraylistarraylitavaj.gnalarr", 10);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "aaaaaaaaaaJAVAL.AGNaaaaaaaaaaJAVAL.AGNaaaaaaaaaaJAVAL.AGNaaaaaaaaaaJAVAL.AGNaaaaaaaaaaJAVAL.AGNaaaaaaaaaaJAVAL.AGNaaaaaaaaaaJAVAL.AGNaaaaaaaaaaJAVAL.AGNaaaaaaaaaaJAVAL.AGNaaaaaaaaaaJAVAL.AGNaaaaaaaaaaJAVAL.AGNaaaaaaaaaaJAVAL.AGNaaaaaaaaaaJAVAL.AGNaaaaaaaaaaJAVAL.AGNaaaaaaaaaaJAVAL.AGNaaaaaaaaaaJAVAL.AGNaaaaaaaaaaJAVAL.AGNaaaaaaaaaaJAVAL.AGNaaaaaaaaaaJAVAL.AGNaaaaaaaaaaJAVAL.AGNaaaaaaaaaaJAVAL.AGNaaaaaaaaaaJAVAL.AGNaaaaaaaaaaJAVAL.AGNaaaaaaaaaaJAVAL.AGNaaaaaaaaaaJAVAL.AGNaaaaaaaaaaJAVAL.AGNaaaaaaaaaaJAVAL.AGNaaaaaaaaaaJAVAL.AGNaaaaaaaaaaJAVAL.AGNaaaaaaaaaaJAVAL.AGNaaaaaaaaaaJAVAL.AGNaaaaaaaaaaJAVAL.AGNaaaaaaaaaaJAVAL.AGNaaaaaaaaaaJAVAL.AGNaaaaaaaaaaJAVAL.AGN" + "'", str3, "aaaaaaaaaaJAVAL.AGNaaaaaaaaaaJAVAL.AGNaaaaaaaaaaJAVAL.AGNaaaaaaaaaaJAVAL.AGNaaaaaaaaaaJAVAL.AGNaaaaaaaaaaJAVAL.AGNaaaaaaaaaaJAVAL.AGNaaaaaaaaaaJAVAL.AGNaaaaaaaaaaJAVAL.AGNaaaaaaaaaaJAVAL.AGNaaaaaaaaaaJAVAL.AGNaaaaaaaaaaJAVAL.AGNaaaaaaaaaaJAVAL.AGNaaaaaaaaaaJAVAL.AGNaaaaaaaaaaJAVAL.AGNaaaaaaaaaaJAVAL.AGNaaaaaaaaaaJAVAL.AGNaaaaaaaaaaJAVAL.AGNaaaaaaaaaaJAVAL.AGNaaaaaaaaaaJAVAL.AGNaaaaaaaaaaJAVAL.AGNaaaaaaaaaaJAVAL.AGNaaaaaaaaaaJAVAL.AGNaaaaaaaaaaJAVAL.AGNaaaaaaaaaaJAVAL.AGNaaaaaaaaaaJAVAL.AGNaaaaaaaaaaJAVAL.AGNaaaaaaaaaaJAVAL.AGNaaaaaaaaaaJAVAL.AGNaaaaaaaaaaJAVAL.AGNaaaaaaaaaaJAVAL.AGNaaaaaaaaaaJAVAL.AGNaaaaaaaaaaJAVAL.AGNaaaaaaaaaaJAVAL.AGNaaaaaaaaaaJAVAL.AGN");
    }

    @Test
    public void test27324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest54.test27324");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.chomp("gnirtS.gnal.avaj ssalc");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "gnirtS.gnal.avaj ssalc" + "'", str1, "gnirtS.gnal.avaj ssalc");
    }

    @Test
    public void test27325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest54.test27325");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitByCharacterType("....................................................................                       javaulang");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.stripAll(strArray1);
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.stripAll(strArray2, "rrayList");
        java.lang.String str6 = org.apache.commons.lang3.ClassUtils.getPackageCanonicalName((java.lang.Object) strArray4, "");
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.getCommonPrefix(strArray4);
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "java.lang" + "'", str6, "java.lang");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
    }

    @Test
    public void test27326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest54.test27326");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringAfterLast("$         44444444444444444444444444444444444444444444444444444444444444444444444444444444                                                           ", "JAVA.UTILhi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!h");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test27327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest54.test27327");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "rrclass javalangObjectys", "44444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444.ly..                                  $$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$                                  $$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$                                  $$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$                                  $$$$$$$$$$$$$$$$$$$$$$$");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test27328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest54.test27328");
        java.lang.String[] strArray5 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("...", "avaj.gnal", (int) 'a');
        boolean boolean6 = org.apache.commons.lang3.StringUtils.startsWithAny("", strArray5);
        java.lang.Class<?>[] wildcardClassArray7 = org.apache.commons.lang3.ClassUtils.toClass((java.lang.Object[]) strArray5);
        java.lang.String str9 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray5, "AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA      ");
        java.lang.String[] strArray13 = org.apache.commons.lang3.StringUtils.split("Serializable", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaagn", 22);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str14 = org.apache.commons.lang3.StringUtils.replaceEach("a..AYl a##############", strArray5, strArray13);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Search and Replace array lengths don't match: 1 vs 3");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(wildcardClassArray7);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "..." + "'", str9, "...");
        org.junit.Assert.assertNotNull(strArray13);
    }

    @Test
    public void test27329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest54.test27329");
        int int3 = org.apache.commons.lang3.StringUtils.lastOrdinalIndexOf("                                                                                                                                                                                                                                                                                                                                                          javal#.#agn       aaaaaaaaaaaaaaaaaaaaaaaaa                                                                                                                                                                                                                                                                                                                                                          ", "irfCo$irfioriiirfCo$irfioriiirfCo$irfioriiirfCo$irfioriiirfCo$irfio.ArrayListArrayListArrayListArrayLis", 22);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test27330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest54.test27330");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.containsWhitespace("JLVLlaLNG                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                  ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test27331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest54.test27331");
        int int3 = org.apache.commons.lang3.StringUtils.ordinalIndexOf("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa...aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "      interface java.lang.Cloneable.interface java.io.Serializable      ", 62);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test27332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest54.test27332");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.chomp("$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$", "avajecaf");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$" + "'", str2, "$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$");
    }

    @Test
    public void test27333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest54.test27333");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceChars("VJ", "ULITULITULITULITUL####LITULITULITULITULITUL", "A##RyLRsA##RyLRsA##RyLRsA##RyLRsA##");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "VJ" + "'", str3, "VJ");
    }

    @Test
    public void test27334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest54.test27334");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripAccents((java.lang.CharSequence) "                                                                                                                                                                                                                                                                                                                                                                                                                               #                                                                                                                                                                                                                                                                                                                                                                                                                                ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "                                                                                                                                                                                                                                                                                                                                                                                                                               #                                                                                                                                                                                                                                                                                                                                                                                                                                " + "'", str1, "                                                                                                                                                                                                                                                                                                                                                                                                                               #                                                                                                                                                                                                                                                                                                                                                                                                                                ");
    }

    @Test
    public void test27335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest54.test27335");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("       irfCo.irfioSriiz       ", '4');
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test27336() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest54.test27336");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substring(".lang                                                                                    ", 666);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test27337() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest54.test27337");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.stripStart("string              Integer                            Integ", "stringUtils");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "              Integer                            Integ" + "'", str2, "              Integer                            Integ");
    }

    @Test
    public void test27338() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest54.test27338");
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
        java.lang.Class<?> wildcardClass38 = null;
        java.lang.Class[] classArray40 = new java.lang.Class[1];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray41 = (java.lang.Class<?>[]) classArray40;
        wildcardClassArray41[0] = wildcardClass38;
        java.lang.Class<?>[] wildcardClassArray44 = org.apache.commons.lang3.ClassUtils.primitivesToWrappers(wildcardClassArray41);
        java.lang.String[] strArray46 = new java.lang.String[] { "                                   " };
        java.lang.String str47 = org.apache.commons.lang3.StringUtils.getCommonPrefix(strArray46);
        java.lang.Class<?>[] wildcardClassArray48 = org.apache.commons.lang3.ClassUtils.toClass((java.lang.Object[]) strArray46);
        java.lang.Class<?> wildcardClass49 = null;
        java.lang.Class[] classArray51 = new java.lang.Class[1];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray52 = (java.lang.Class<?>[]) classArray51;
        wildcardClassArray52[0] = wildcardClass49;
        java.lang.Class<?>[] wildcardClassArray55 = org.apache.commons.lang3.ClassUtils.primitivesToWrappers(wildcardClassArray52);
        boolean boolean56 = org.apache.commons.lang3.ClassUtils.isAssignable(wildcardClassArray48, wildcardClassArray52);
        boolean boolean58 = org.apache.commons.lang3.ClassUtils.isAssignable(wildcardClassArray41, wildcardClassArray52, true);
        boolean boolean60 = org.apache.commons.lang3.ClassUtils.isAssignable(wildcardClassArray37, wildcardClassArray52, false);
        java.lang.Class<?>[] wildcardClassArray61 = org.apache.commons.lang3.ClassUtils.primitivesToWrappers(wildcardClassArray37);
        java.lang.Class<?>[] wildcardClassArray62 = org.apache.commons.lang3.ClassUtils.primitivesToWrappers(wildcardClassArray61);
        java.lang.Class<?>[] wildcardClassArray63 = org.apache.commons.lang3.ClassUtils.primitivesToWrappers(wildcardClassArray62);
        boolean boolean64 = org.apache.commons.lang3.ClassUtils.isAssignable(wildcardClassArray30, wildcardClassArray63);
        java.lang.Class<?>[] wildcardClassArray65 = org.apache.commons.lang3.ClassUtils.primitivesToWrappers(wildcardClassArray63);
        java.lang.Class<?> wildcardClass66 = wildcardClassArray63.getClass();
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
        org.junit.Assert.assertNotNull(classArray40);
        org.junit.Assert.assertNotNull(wildcardClassArray41);
        org.junit.Assert.assertNotNull(wildcardClassArray44);
        org.junit.Assert.assertNotNull(strArray46);
        org.junit.Assert.assertEquals("'" + str47 + "' != '" + "                                   " + "'", str47, "                                   ");
        org.junit.Assert.assertNotNull(wildcardClassArray48);
        org.junit.Assert.assertNotNull(classArray51);
        org.junit.Assert.assertNotNull(wildcardClassArray52);
        org.junit.Assert.assertNotNull(wildcardClassArray55);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + false + "'", boolean58 == false);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + false + "'", boolean60 == false);
        org.junit.Assert.assertNotNull(wildcardClassArray61);
        org.junit.Assert.assertNotNull(wildcardClassArray62);
        org.junit.Assert.assertNotNull(wildcardClassArray63);
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + true + "'", boolean64 == true);
        org.junit.Assert.assertNotNull(wildcardClassArray65);
        org.junit.Assert.assertNotNull(wildcardClass66);
    }

    @Test
    public void test27339() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest54.test27339");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAllLowerCase((java.lang.CharSequence) "interfcejv.lng.cloneble#interfcejv.io");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test27340() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest54.test27340");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceChars("IIZ", 'a', ' ');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "IIZ" + "'", str3, "IIZ");
    }

    @Test
    public void test27341() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest54.test27341");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substring("hi!ArrayListArrayListArrayListavaj.... AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA... AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA... AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA... AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA... AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA... AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA... AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA... AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA... AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA... AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA", 155);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA... AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA... AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA... AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA... AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA... AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA... AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA... AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA... AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA" + "'", str2, "AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA... AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA... AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA... AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA... AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA... AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA... AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA... AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA... AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA");
    }

    @Test
    public void test27342() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest54.test27342");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.endsWith("ulitulitulitulitul####litulitulitulitulitul", "Short");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test27343() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest54.test27343");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.abbreviate("######################################################################                                                                                 ][gnirtSlitu.avaj1-                                                                                 ][gnirtSlitu.avaj1-                                                                                 ][gnirtSlitu.avaj1-                                                                                 ][gnirtSlitu.avaj1-                                                                                 ][gnirtSlitu.avaj1-        ", 92, 162);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "...                                                           ][gnirtSlitu.avaj1-                                                                              ..." + "'", str3, "...                                                           ][gnirtSlitu.avaj1-                                                                              ...");
    }

    @Test
    public void test27344() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest54.test27344");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNumericSpace((java.lang.CharSequence) "A..ayL A.44444444444444444444444444                                 ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test27345() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest54.test27345");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.containsWhitespace("class java.util.AbstractListjavaclass java.util.AbstractCollectionjavaclass java.lang.Object");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test27346() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest54.test27346");
        java.lang.CharSequence charSequence2 = org.apache.commons.lang3.StringUtils.defaultIfEmpty((java.lang.CharSequence) "$                                                                                            ", (java.lang.CharSequence) "arrrrrrrrrrrrrrrrrrrrrrrrrrrrrr");
        org.junit.Assert.assertEquals("'" + charSequence2 + "' != '" + "$                                                                                            " + "'", charSequence2, "$                                                                                            ");
    }

    @Test
    public void test27347() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest54.test27347");
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("etyB", "GNIRT");
        int int5 = org.apache.commons.lang3.StringUtils.indexOfAny("-1java.utilString-1java.utilString", strArray4);
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray4, "][ssalCGNIRTGNIRTGNIRTGNIRTGNIRTGNIRTGNIRTGNIRTGNIRTGNIRTGNIRTGNIRTGNIRTGNIRTGNIRTGNIRTGNIRTGNIRTGNIRTGNIRTGNIRTGNIRTGNIRTGNIRTGNIRTGNIRTGNIRTGNIRTGNIRTGNIRTGNIRTGNIRTGNIRTGNIRTGNIRTGNIRTGNIRTGNIRTGNIRTGNIRTGNIRTGNIRTGNIRTGNIRTGNIRTGNIRTGNIRTGNIRTGNIRTGNIRTGNIRTGNIRTGNIRTGNIRTGNIRTGNIRTGNIRTGNIRTGNIRTGNIRTGNIRTGNIRTGNIRTGNIRTGNIRTGNIRTGNIRTGNIRTGNIRTGNIRTGNIRTGNIRTGNIRTGNIRTGNIRTGNIRTGNIRTGNIRTGNIRTGNIRTGNIRTGNIRTGNIRTGNIRTGNIRTGNIRTGNIRTGNIRTGNIRTGNIRTGNIRTGNIRTGNIRTGNIRTGNIRTGNIRTGNIRTG");
        int int8 = org.apache.commons.lang3.StringUtils.indexOfAny("interface java.lang.Cloneablegnal.avajgnal..LANGgnal.avajgnal.interface java.io.Serializableinterface java.lang.Cloneablegnal.avajgnal..LANGgnal.avajgnal.interface java.io.Serializableinterface java.lang.Cloneablegnal.avajgnal..LANGgnal.avajgnal.interface java.io.Serializableinterface java.laninterface java.lang.Cloneableinterface java.lang.Cloneable$interface java.io.Serializableinterface java.io.Serializable", strArray4);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "etyB" + "'", str7, "etyB");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
    }

    @Test
    public void test27348() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest54.test27348");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.strip("AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA                       JAVAULANGRRAYLIST", "$         $         $         $         $         $         $         $         $         $         $         $         $         $         $         $         $         $         $         $         $         $         $         $         $         $         $         $         $         $         $         $         $         $         $         $         ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA                       JAVAULANGRRAYLIST" + "'", str2, "AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA                       JAVAULANGRRAYLIST");
    }

    @Test
    public void test27349() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest54.test27349");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substring("                                                                            ][GNIRTSLITU.AVAJ1", 456);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test27350() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest54.test27350");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.startsWithIgnoreCase("oneable#interfacejava.io", "SERIALIZABL...     JAVA44444444444444444.4444");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test27351() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest54.test27351");
        java.lang.String[] strArray1 = null;
        java.lang.String[] strArray6 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("hi!ArrayListArrayListArrayListavaj.gnalArrayListArrayListArrayListavaj", "CLASSSLITUGNIRTSSLITUGNIRTSSLITUGNIRTSSLITUGNIRTSSLITUGNIRTSSLITUGNIRTinterfcegg.lng.ClonebleAAAAAAAAAAggl.gnAAAAAAAAAAggl.gnAAAAAAAAAAggl.gnAAAAAAAAAAggl.gnAAAAAAAAAAggl.gnAAAAAAAAAAggl.gnAAAAAAAAAAggl.gnAAAAAAAAAAggl.gnAAAAAAAAAAggl.gnAAAAAAAAAAggl.gnAAAAAAAAAAggl.gnAAAAAAAAAAggl.gnAAAAAAAAAAggl.gnAAAAAAAAAAggl.gnAAAAAAAAAAggl.gnAAAAAAAAAAggl.gnAAAAAAAAAAggl.gnAAAAAAAAAAggl.gnAAAAAAAAAAggl.gnAAAAAAAAAAggl.gnAAAAAAAAAAggl.gnAAAAAAAAAAggl.gnAAAAAAAAAAggl.gnAAAAAAAAAAggl.gnAAAAAAAAAAggl.gnAAAAAAAAAAggl.gnAAAAAAAAAAggl.gnAAAAAAAAAAggl.gnAAAAAAAAAAggl.gnAAAAAAAAAAggl.gnAAAAAAAAAAggl.gnAAAAAAAAAAggl.gnAAAAAAAAAAggl.gnAAAAAAAAAAggl.gnAAAAAAAAAAggl.gnAAAAAAAAAAringinterfcegg.io", (int) (byte) 1);
        boolean boolean7 = org.apache.commons.lang3.StringUtils.startsWithAny("GNAL.AVAJLANG.JAVAGNAL.AVAJLANG.JAVAGNAL.AVAJLANG.JAVAGNAL.AVAJLANG.JAVAGNAL.AVAJLANG.JAVAGNAL.AVAJLANG.JAVAGNAL.AVAJLANG.JAVAGNAL.AVAJLANG.JAVAGNAL", strArray6);
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.replaceEachRepeatedly("4444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444aaaaaaaaaava.lang", strArray1, strArray6);
        java.lang.String str10 = org.apache.commons.lang3.ClassUtils.getShortClassName((java.lang.Object) "4444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444aaaaaaaaaava.lang", "Y");
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "4444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444aaaaaaaaaava.lang" + "'", str8, "4444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444aaaaaaaaaava.lang");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "String" + "'", str10, "String");
    }

    @Test
    public void test27352() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest54.test27352");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trim("                      integer                       ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "integer" + "'", str1, "integer");
    }

    @Test
    public void test27353() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest54.test27353");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.contains("sAitUJAirtSsAitUJAirtSsAitUJAirtSsAitUJAirtSsAitUJAirtSsAitUJAirtSsAitUJAirtSsAitUJAirtSsAitUJAirtSsAitUJAirtS", 24);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test27354() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest54.test27354");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isBlank((java.lang.CharSequence) ".......JAVA..........JAVA..........JAVA..........JAVA..........J");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test27355() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest54.test27355");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.chomp(".......JAVA..........JAVA..........JAVA..........JAVA..........J", "arr... aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa... aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa... aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa... aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa... aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa... aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa... aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa... aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa... aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa... aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaylist");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + ".......JAVA..........JAVA..........JAVA..........JAVA..........J" + "'", str2, ".......JAVA..........JAVA..........JAVA..........JAVA..........J");
    }

    @Test
    public void test27356() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest54.test27356");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.strip("interface java.lang.Cloneable.interface java.io.Serializable", "a$.lang.Stringclass java.lang.Stringclass java.lang.Stringclas.lang.Stringclass java.lang.Stringc");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "erface java.lang.Cloneable.interface java.io.Serializable" + "'", str2, "erface java.lang.Cloneable.interface java.io.Serializable");
    }

    @Test
    public void test27357() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest54.test27357");
        java.lang.CharSequence charSequence1 = null;
        boolean boolean2 = org.apache.commons.lang3.StringUtils.equals((java.lang.CharSequence) "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                 ", charSequence1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test27358() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest54.test27358");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("INTEGERlangAGNALelbazilaireSelbazilaireSelbazilaireSelbazilaireSelbazilaireSelbazilaireSelbazilaireSelbazilaireSelbazilaireSelbazilaireSelbazilaireSelbazilaireSelbazilaireSelbazilaireSelbazilaireSelbazilaireSelbazilaireSelbazilaireSelbazilaireSelbazilaireSelbazilaireSelbazilaireSelbazilaireSelbazilaireSelbazilaireSelbazilaireSelbazilaireSelbazilaireSelbazilaireSelbazilaireSelbazilaireSelbazilaireSelbazilaireSelangAGNALelbazilaireSelbazilaireSelbazilair", "erface java.lang.Cloneable4interface java.io.Serializabl", 206);
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void test27359() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest54.test27359");
        java.lang.String str2 = org.apache.commons.lang3.ClassUtils.getShortClassName((java.lang.Object) "ssalinterfacegaga.lang.CloneableAAAAAAAAAAgagal.agnAAAAAAAAAAgagal.agnAAAAAAAAAAgagal.agnAAAAAAAAAAgagal.agnAAAAAAAAAAgagal.agnAAAAAAAAAAgagal.agnAAAAAAAAAAgagal.agnAAAAAAAAAAgagal.agnAAAAAAAAAAgagal.agnAAAAAAAAAAgagal.agnAAAAAAAAAAgagal.agnAAAAAAAAAAgagal.agnAAAAAAAAAAgagal.agnAAAAAAAAAAgagal.agnAAAAAAAAAAgagal.agnAAAAAAAAAAgagal.agnAAAAAAAAAAgagal.agnAAAAAAAAAAgagal.agnAAAAAAAAAAgagal.agnAAAAAAAAAAgagal.agnAAAAAAAAAAgagal.agnAAAAAAAAAAgagal.agnAAAAAAAAAAgagal.agnAAAAAAAAAAgagal.agnAAAAAAAAAAgagal.agnAAAAAAAAAAgagal.agnAAAAAAAAAAgagal.agnAAAAAAAAAAgagal.agnAAAAAAAAAAgagal.agnAAAAAAAAAAgagal.agnAAAAAAAAAAgagal.agnAAAAAAAAAAgagal.agnAAAAAAAAAAgagal.agnAAAAAAAAAAgagal.agnAAAAAAAAAAgagal.agnAAAAAAAAAAringinterfacegaga.io.SerializableC", "arralitu.avajlitu.avaj");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "String" + "'", str2, "String");
    }

    @Test
    public void test27360() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest54.test27360");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.defaultIfEmpty("INTERFACE#JAVA.LANG.cLONEABLE....................................................................#######################javaulangINTERFACE#JAVA.IO", "                                                                            ][GNIRTSLITU.AVAJ1");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "INTERFACE#JAVA.LANG.cLONEABLE....................................................................#######################javaulangINTERFACE#JAVA.IO" + "'", str2, "INTERFACE#JAVA.LANG.cLONEABLE....................................................................#######################javaulangINTERFACE#JAVA.IO");
    }

    @Test
    public void test27361() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest54.test27361");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.split("Java.lang.Stringclass java.lang.Stringclass java.lang.Stringclas.lang.Stringclass java.lang.Stringc", "rrayListrrayListrrayListrrayListrrayListrrayListrrayListrrayListrrayListrra.    .aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaListrrayListrrayListrrayListrrayListrrayListrrayListrrayListrrayListrr", 108);
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void test27362() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest54.test27362");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.normalizeSpace("gnal..Array..List..Array..List..Array..Li");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "gnal..Array..List..Array..List..Array..Li" + "'", str1, "gnal..Array..List..Array..List..Array..Li");
    }

    @Test
    public void test27363() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest54.test27363");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.split("aaaaaaaaaajaval.agnaaaaaaaaaajaval.agnaaaaaaaaaajaval.agnaaaaaaaaaajaval.agnaaaaaaaaaajaval.agnaaaaaaaaaajaval.agnaaaaaaaaaajaval.agnaaaaaaaaaajaval.agnaaaaaaaaaajaval.agnaaaaaaaaaajaval.agnaaaaaaaaaajaval.agnaaaaaaaaaajaval.agnaaaaaaaaaaja                                              aaaaaaajaval.agnaaaaaaaaaajaval.agnaaaaaaaaaajaval.agnaaaaaaaaaajaval.agnaaaaaaaaaajaval.agnaaaaaaaaaajaval.agnaaaaaaaaaajaval.agnaaaaaaaaaajaval.agnaaaaaaaaaajaval.agnaaaaaaaaaajaval.agnaaaaaaaaaajaval.agnaaaaaaaaaajaval.agnaaaaaaaaaarin");
        java.lang.String[] strArray6 = org.apache.commons.lang3.StringUtils.split("interface java.lang.Cloneable.interface java.io.Serializable", "jAVAAAAAAAAAAVA.LANG...", 130);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str7 = org.apache.commons.lang3.StringUtils.replaceEach("aaaag.aaaa", strArray2, strArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Search and Replace array lengths don't match: 2 vs 8");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertNotNull(strArray6);
    }

    @Test
    public void test27364() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest54.test27364");
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
        java.lang.Class<?>[] wildcardClassArray74 = org.apache.commons.lang3.ClassUtils.toClass((java.lang.Object[]) wildcardClassArray46);
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
        org.junit.Assert.assertNotNull(wildcardClassArray74);
    }

    @Test
    public void test27365() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest54.test27365");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substring("                                                                            ][GNIRTSLITU.AVAJ1", 70);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "      ][GNIRTSLITU.AVAJ1" + "'", str2, "      ][GNIRTSLITU.AVAJ1");
    }

    @Test
    public void test27366() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest54.test27366");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.split("");
        java.lang.String[] strArray6 = org.apache.commons.lang3.StringUtils.split("... AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA... AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA... AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA... AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA... AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA... AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA... AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA... AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA... AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA... AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA", "ArrayList");
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.replaceEach("AAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAA", strArray3, strArray6);
        int int8 = org.apache.commons.lang3.StringUtils.indexOfDifference((java.lang.CharSequence[]) strArray6);
        int int9 = org.apache.commons.lang3.StringUtils.lastIndexOfAny("", strArray6);
        java.lang.String str11 = org.apache.commons.lang3.ClassUtils.getPackageName((java.lang.Object) int9, "interface#java.lang.Cloneable4interface#java.io.Serializableinterface#java.lSE...               ");
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "AAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAA" + "'", str7, "AAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAA");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "java.lang" + "'", str11, "java.lang");
    }

    @Test
    public void test27367() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest54.test27367");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphanumeric((java.lang.CharSequence) "aRR...AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA...AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA...AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA...AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA...AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA...AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA...AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA...AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA...AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA..");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test27368() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest54.test27368");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.deleteWhitespace("     A..AYL A.44444444444444444444444444      ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "A..AYLA.44444444444444444444444444" + "'", str1, "A..AYLA.44444444444444444444444444");
    }

    @Test
    public void test27369() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest54.test27369");
        int int3 = org.apache.commons.lang3.StringUtils.indexOf("                                              ", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaastrinaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa. aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaastrinaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", 447);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test27370() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest54.test27370");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeEnd("AA...", "...VAULANGJAVAULANGJAVAULANGJAVAULANGJAVAULANGSTRINGUTILSSTRINGUTILSSTRINGUTILSSTRINGUTILSSTRINGUTILSSTRINGUTILSSTRINGUTILSSTRINGUTILSSTRINGUTILSSTRINGUTILSSTRINGUTILSSTRINGUTILSSTRINGUTILSSTRINGUTILSSTRINGUTILSSTRINGUTILSSTRINGUTILSSTRINGUTILSSTRINGUTILSSTRINGUTILSSTRINGUTILSSTRINGUTILSSTRINGUTILSSTRINGUTILSSTRINGUTILSSTRINGUTILSSTRINGUTILSSTRINGUTILSSTRINGUTILSSTRINGUTILSSTRINGUTILSSTRINGUTILSSTRINGUTILSSTRINGUTILSSTRINGUTILSSTRINGUTILSSTRINGUTILSSTRINGUTILSSTRINGUTILSSTRINGUTILSSTR");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "AA..." + "'", str2, "AA...");
    }

    @Test
    public void test27371() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest54.test27371");
        java.lang.ClassLoader classLoader0 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass3 = org.apache.commons.lang3.ClassUtils.getClass(classLoader0, "....................................................................                       javaulang", true);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassNotFoundException; message: ////////////////////////////////////////////////////////////////////javaulang");
        } catch (java.lang.ClassNotFoundException e) {
            // Expected exception.
        }
    }

    @Test
    public void test27372() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest54.test27372");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeStartIgnoreCase("#####A##ayL#A#################################aaaaaaaaaa", "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "#####A##ayL#A#################################aaaaaaaaaa" + "'", str2, "#####A##ayL#A#################################aaaaaaaaaa");
    }

    @Test
    public void test27373() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest54.test27373");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsIgnoreCase(" aRRAYlISTaRRAYlISTaRRAYlISTAVAJgnal", "VA.LANGAVAJ.GNALJAVA.LANGAVAJ.GNALJAVA.LANGAVAJ.GNALJAVA.LANGAVAJ.GNALJAVA.LANGAVAJ.GNALJAVA");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test27374() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest54.test27374");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.rightPad(".....HI!ARRAYLISTARRAYLISTARRAYLISTAVAJ.GNALARRAYLISTARRAYLISTARRAYLISTAVAJ.GNALARRAYLISTARRAYLISTARRAYLI.                       JAVAULANG", 303, ' ');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + ".....HI!ARRAYLISTARRAYLISTARRAYLISTAVAJ.GNALARRAYLISTARRAYLISTARRAYLISTAVAJ.GNALARRAYLISTARRAYLISTARRAYLI.                       JAVAULANG                                                                                                                                                                     " + "'", str3, ".....HI!ARRAYLISTARRAYLISTARRAYLISTAVAJ.GNALARRAYLISTARRAYLISTARRAYLISTAVAJ.GNALARRAYLISTARRAYLISTARRAYLI.                       JAVAULANG                                                                                                                                                                     ");
    }

    @Test
    public void test27375() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest54.test27375");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.chomp("$         $         $         $         $         $         $         $         $         $         $         $         $         $         $         $         $         $         $         $         $         $         $         $         $         $         $         $         $         $         $         $         $         $         $         ", "LITU.AVAJ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "$         $         $         $         $         $         $         $         $         $         $         $         $         $         $         $         $         $         $         $         $         $         $         $         $         $         $         $         $         $         $         $         $         $         $         " + "'", str2, "$         $         $         $         $         $         $         $         $         $         $         $         $         $         $         $         $         $         $         $         $         $         $         $         $         $         $         $         $         $         $         $         $         $         $         ");
    }

    @Test
    public void test27376() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest54.test27376");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripToEmpty("                       javaulangrraylist");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "javaulangrraylist" + "'", str1, "javaulangrraylist");
    }

    @Test
    public void test27377() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest54.test27377");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.uncapitalize((java.lang.CharSequence) "Arrclas...");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "arrclas..." + "'", str1, "arrclas...");
    }

    @Test
    public void test27378() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest54.test27378");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "object", "Gnal");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test27379() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest54.test27379");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("aaaaaaaaaa                                                                                                                                                                                                                                                                                                                                                                                                                                JAVA.LANGAgnal.avajgnal..LANGgnal.avArrclass java.lang.ObjectyListAr...aaaaaaaaaa", ". ");
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test27380() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest54.test27380");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.center("][sslC", 516, "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "                                                                                                                                                                                                                                                               ][sslC                                                                                                                                                                                                                                                               " + "'", str3, "                                                                                                                                                                                                                                                               ][sslC                                                                                                                                                                                                                                                               ");
    }

    @Test
    public void test27381() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest54.test27381");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substring("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa...java..........java..", 40);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa...java..........java.." + "'", str2, "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa...java..........java..");
    }

    @Test
    public void test27382() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest54.test27382");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfAnyBut("...VA.LANGAVAJ.GNALJAVA.LANGAVAJ.GNALJAVA.LANGAVAJ.GNALJAVA.LANGAVAJ.GNALJAVA.LANGAVAJ.GNALJAVA.LANGgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalg", "###########################################################################$$$$$$$$$         $         $         $         $         $         $         $         $         $         $         $         $         $         $         $         $         $         $         $         $         $         $       siLyarrA!iH$         $         $         $         $         $         $         $         $         $         $         $         $         $         $         $         $ ");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test27383() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest54.test27383");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripToEmpty("javaStringnalArrayListArrayListArrayListavaj.gnalArrayListArrayListArrayLijavaStringnalArrayListArrayListArrayListavaj.gnalArrayListArrayListArrayLijavaStringnalArrayListArrayListArrayListavaj.gnalArrayListArrayListArrayLijavaStringnalArrayListArrayListArrayListavaj.gnalArrayListArrayListArrayLi");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "javaStringnalArrayListArrayListArrayListavaj.gnalArrayListArrayListArrayLijavaStringnalArrayListArrayListArrayListavaj.gnalArrayListArrayListArrayLijavaStringnalArrayListArrayListArrayListavaj.gnalArrayListArrayListArrayLijavaStringnalArrayListArrayListArrayListavaj.gnalArrayListArrayListArrayLi" + "'", str1, "javaStringnalArrayListArrayListArrayListavaj.gnalArrayListArrayListArrayLijavaStringnalArrayListArrayListArrayListavaj.gnalArrayListArrayListArrayLijavaStringnalArrayListArrayListArrayListavaj.gnalArrayListArrayListArrayLijavaStringnalArrayListArrayListArrayListavaj.gnalArrayListArrayListArrayLi");
    }

    @Test
    public void test27384() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest54.test27384");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeEnd("NAELOOB                                                                                                                                                                                                                                                                                                                                                                                                                                                                                        ", "ATSILYTCEJBO.GNAL.AVAJSSALCRRATSILYTCEJBO.GNAL.AVAJSSALCRRAVA.LANGGNAL..LANGJAVA.LANGAGNAL.AVAJ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "NAELOOB                                                                                                                                                                                                                                                                                                                                                                                                                                                                                        " + "'", str2, "NAELOOB                                                                                                                                                                                                                                                                                                                                                                                                                                                                                        ");
    }

    @Test
    public void test27385() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest54.test27385");
        java.lang.String str1 = org.apache.commons.lang3.ClassUtils.getPackageCanonicalName("                                                                                                         ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
    }

    @Test
    public void test27386() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest54.test27386");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.strip("A..AYL A.44444444444444444444444444");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "A..AYL A.44444444444444444444444444" + "'", str1, "A..AYL A.44444444444444444444444444");
    }

    @Test
    public void test27387() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest54.test27387");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.leftPad("###################################################################################################################################################################################################################################################################################################################################################################################################################################################################                                   ", 0, "rING-1JAVA.UTILsTRING");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "###################################################################################################################################################################################################################################################################################################################################################################################################################################################################                                   " + "'", str3, "###################################################################################################################################################################################################################################################################################################################################################################################################################################################################                                   ");
    }

    @Test
    public void test27388() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest54.test27388");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.split("AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA", "arraylist", 669);
        java.lang.String[] strArray5 = org.apache.commons.lang3.StringUtils.stripAll(strArray3, "##########################java.lang");
        java.lang.String[] strArray6 = org.apache.commons.lang3.StringUtils.stripAll(strArray5);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertNotNull(strArray6);
    }

    @Test
    public void test27389() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest54.test27389");
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.overlay("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaastrinaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa. aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaastrinaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "", 620, 481);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaastrinaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa. aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaastrinaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa" + "'", str4, "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaastrinaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa. aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaastrinaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
    }

    @Test
    public void test27390() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest54.test27390");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.containsWhitespace("tsilyarrgnaluavaj.tsilyarrgnaluavaj");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test27391() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest54.test27391");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.abbreviateMiddle("OI.AVAJECAFRETNI#ELBAENOLc.GNAL.AVAJECAFRETNIsTRINGuTILSsTRINGuTILSsTRINGuTILSsTRINGuTILSsTRINGuTILSsTRINGuTILSsTRINGuTILSsTRINGuTILSsTRINGuTILSsTRINGuTILS", "CLASS JAVALANGCLASS                       JAVAULANG                       JAVAULANG                       JAVAULANG                       JAVAULANG                       JAVAULANG                       JAVAULANG                       JAVAULANG                       JAVAULANG                       JAVAULANG                       JAVAULANG                       JAVAULANG                       JAVAULANG                       JAVAULANG                       JAVAULANG                       JAVAULANG                       JAVAULANG                       JAVAULANG                       JAVAULANG                       JAVAULANG                       JAVAULANG", 477);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "OI.AVAJECAFRETNI#ELBAENOLc.GNAL.AVAJECAFRETNIsTRINGuTILSsTRINGuTILSsTRINGuTILSsTRINGuTILSsTRINGuTILSsTRINGuTILSsTRINGuTILSsTRINGuTILSsTRINGuTILSsTRINGuTILS" + "'", str3, "OI.AVAJECAFRETNI#ELBAENOLc.GNAL.AVAJECAFRETNIsTRINGuTILSsTRINGuTILSsTRINGuTILSsTRINGuTILSsTRINGuTILSsTRINGuTILSsTRINGuTILSsTRINGuTILSsTRINGuTILSsTRINGuTILS");
    }

    @Test
    public void test27392() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest54.test27392");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBefore("#########################sClassslitUgnirtSslitUgnirtSslitUgnirtSslitUgnirtSslitUgnirtSslitUgnirtSslitUgnirtSslitUgnirtSslitUgnirtSslitUgnirtS##########################", "... java.lang.Stringclass java.lang.Stringclass...                                                                                                                                                            ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "#########################sClassslitUgnirtSslitUgnirtSslitUgnirtSslitUgnirtSslitUgnirtSslitUgnirtSslitUgnirtSslitUgnirtSslitUgnirtSslitUgnirtS##########################" + "'", str2, "#########################sClassslitUgnirtSslitUgnirtSslitUgnirtSslitUgnirtSslitUgnirtSslitUgnirtSslitUgnirtSslitUgnirtSslitUgnirtSslitUgnirtS##########################");
    }

    @Test
    public void test27393() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest54.test27393");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.defaultString("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "...       OI.AVAJECAFRETNI#ELBAENOLc.GNAL.AVAJECAFRETNIsTRINGuTILSsTRINGuTILSsTRINGuTILSsTRINGuTILSsTRINGuTILSsTRINGuTILSsTRINGuTILSsTRINGuTILSsTRINGuTILSsTRINGuTILS");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa" + "'", str2, "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
    }

    @Test
    public void test27394() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest54.test27394");
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.overlay("Arrclass java......................", "VAgnal.avajgnal.avajgnal.avajgnal.avajgnal.avajgn", 115, 924);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Arrclass java......................VAgnal.avajgnal.avajgnal.avajgnal.avajgnal.avajgn" + "'", str4, "Arrclass java......................VAgnal.avajgnal.avajgnal.avajgnal.avajgnal.avajgn");
    }

    @Test
    public void test27395() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest54.test27395");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass2 = org.apache.commons.lang3.ClassUtils.getClass("interface java.lang.cloneableinterface java.lang.cloneableinterface ja][sslC][sslCrChahacta][sslC][sslCinterface java.lang.cloneableinterface java.lang.cloneableinterface ja", false);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassNotFoundException; message: interfacejava/lang/cloneableinterfacejava/lang/cloneableinterfaceja][sslC][sslCrChahacta][sslC][sslCinterfacejava/lang/cloneableinterfacejava/lang/cloneableinterfaceja");
        } catch (java.lang.ClassNotFoundException e) {
            // Expected exception.
        }
    }

    @Test
    public void test27396() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest54.test27396");
        int int3 = org.apache.commons.lang3.StringUtils.indexOf("444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444INTERFACE JAVA.LANG.cLONEABLEsTRINGINTERFACE JAVA.IO.sERIALIZABLE444444444444444444444444444444444444444444444444444444444444444444444444444444444litu.avajlitu", 53, 126);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test27397() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest54.test27397");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trimToEmpty("44444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "44444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444" + "'", str1, "44444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444");
    }

    @Test
    public void test27398() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest54.test27398");
        int int2 = org.apache.commons.lang3.StringUtils.indexOf("gagnAAAAAAAAAAistArrayListArrayListavaj.gnalArrayListArrayListArrayLigagnAAAAAAAAAAistArrayListArrayListavaj.gnalArrayListArrayListArrayLigagnAAAAAAAAAAistArrayListArrayListavaj.gnalArrayListArrayListArrayLigagnAAAAAAAAAAistArrayListArrayListavaj.gnalArrayListArrayListArrayLigagnAAAAAAAAAAistArrayListArrayListavaj.gnalArrayListArrayListArrayLigagnAAAAAAAAAAistArrayListArrayListavaj.gnalArrayListArrayListArrayLigagnAAAAAAAAAAistArrayListArrayListavaj.gnalArrayListArrayListArrayLigagnAAAAAAAAAAistArrayListArrayListavaj.gnalArrayListArrayListArrayLigagnAAAAAAAAAAistArrayListArrayListavaj.gnalArrayListArrayListArrayLigagnAAAAAAAAAAistArrayListArrayListavaj.gnalArrayListArrayListArrayLigagnAAAAAAAAAAistArrayListArrayListavaj.gnalArrayListArrayListArrayLigagnAAAAAAAAAAistArrayListArrayListavaj.gnalArrayListArrayListArrayLigagnAAAAAAAAAAistinterface java.lang.Cloneable             Character             interface java.io.Serializable", "interfacejava.lang.Cloneable4iGNIRTinterfacejava.lang.Cloneable4i");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test27399() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest54.test27399");
        java.lang.CharSequence charSequence2 = org.apache.commons.lang3.StringUtils.defaultIfBlank((java.lang.CharSequence) "AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA       AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA       AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA       AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA       AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA       AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA       ", (java.lang.CharSequence) "4444444444444AAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agn");
        org.junit.Assert.assertEquals("'" + charSequence2 + "' != '" + "AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA       AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA       AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA       AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA       AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA       AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA       " + "'", charSequence2, "AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA       AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA       AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA       AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA       AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA       AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA       ");
    }

    @Test
    public void test27400() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest54.test27400");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.contains("                                                                                                                                                                                                                                                                                                                                                                                                                             lyrrtsilyrrtsilyrrlng.jvtsilyrrtsilyrrtsilyrrlngnirtsvj", 489);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test27401() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest54.test27401");
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.replace("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "####java.uti###############################..", "                                       sl..Ug..r.S", 26);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa" + "'", str4, "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
    }

    @Test
    public void test27402() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest54.test27402");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeEndIgnoreCase("...nAAAAAAAAAAjaval.agnAAAAAAAAAA...", "javaaaaaaaaaa");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "...nAAAAAAAAAAjaval.agnAAAAAAAAAA..." + "'", str2, "...nAAAAAAAAAAjaval.agnAAAAAAAAAA...");
    }

    @Test
    public void test27403() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest54.test27403");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.containsWhitespace("javaulangrraylist");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test27404() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest54.test27404");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trim("...      ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "..." + "'", str1, "...");
    }

    @Test
    public void test27405() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest54.test27405");
        java.lang.CharSequence charSequence2 = org.apache.commons.lang3.StringUtils.defaultIfEmpty((java.lang.CharSequence) "gn lu v j                       ....................................................................", (java.lang.CharSequence) "java.lang.Stringclass... java.lang.Stringclass ...");
        org.junit.Assert.assertEquals("'" + charSequence2 + "' != '" + "gn lu v j                       ...................................................................." + "'", charSequence2, "gn lu v j                       ....................................................................");
    }

    @Test
    public void test27406() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest54.test27406");
        char[] charArray14 = new char[] { ' ', ' ', '#', 'a', '4', 'a' };
        int int15 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "", charArray14);
        boolean boolean16 = org.apache.commons.lang3.StringUtils.containsAny("......", charArray14);
        int int17 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "AAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAA", charArray14);
        int int18 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "JAVA.LANGAVAJ.GNALJAVA.LANGAVAJ.GNALJAVA.LANGAVAJ.GNALJAVA.LANGAVAJ.GNALJAVA.LANGAVAJ.GNALJAVA.LANGAVAJ.GNALJAVA.LANGAVAJ.GNALJAVA.LANGAVAJ.GNALJAVA.LANG", charArray14);
        boolean boolean19 = org.apache.commons.lang3.StringUtils.containsAny("gnal.avajgnal..LANGgnal.avajgnal.", charArray14);
        boolean boolean20 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "AVAJ.GNAL", charArray14);
        boolean boolean21 = org.apache.commons.lang3.StringUtils.containsAny("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaajaval#.#agn", charArray14);
        boolean boolean22 = org.apache.commons.lang3.StringUtils.containsAny(".................................................................................................................................................................................................................................JAV", charArray14);
        org.junit.Assert.assertNotNull(charArray14);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray14), "  #a4a");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray14), "  #a4a");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray14), "[ ,  , #, a, 4, a]");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
    }

    @Test
    public void test27407() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest54.test27407");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByCharacterType("Gnl$");
        boolean boolean3 = org.apache.commons.lang3.StringUtils.endsWithAny("                                                                                      ", strArray2);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test27408() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest54.test27408");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfIgnoreCase("US", " TU");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test27409() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest54.test27409");
        java.lang.ClassLoader classLoader0 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass3 = org.apache.commons.lang3.ClassUtils.getClass(classLoader0, "$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$stJAVAGNAL                                                           ", false);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassNotFoundException; message: $$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$stJAVAGNAL");
        } catch (java.lang.ClassNotFoundException e) {
            // Expected exception.
        }
    }

    @Test
    public void test27410() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest54.test27410");
        int int2 = org.apache.commons.lang3.StringUtils.indexOf("             CHARACTER             UTILSTRI", 664);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test27411() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest54.test27411");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass2 = org.apache.commons.lang3.ClassUtils.getClass("interface#java.lang.cloneable4interface#java.io.serializableinterface#java.lse...               ...", false);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassNotFoundException; message: interface#java/lang/cloneable4interface#java/io/serializableinterface#java/lse//////");
        } catch (java.lang.ClassNotFoundException e) {
            // Expected exception.
        }
    }

    @Test
    public void test27412() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest54.test27412");
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
        java.lang.Class<?>[] wildcardClassArray30 = org.apache.commons.lang3.ClassUtils.primitivesToWrappers(wildcardClassArray20);
        java.lang.String str32 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) wildcardClassArray30, 'a');
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
        org.junit.Assert.assertNotNull(wildcardClassArray30);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "" + "'", str32, "");
    }

    @Test
    public void test27413() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest54.test27413");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.reverseDelimited("#                                             ", 'a');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "#                                             " + "'", str2, "#                                             ");
    }

    @Test
    public void test27414() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest54.test27414");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceOnce("                                                                                                                                                                                                                                                                              aaaaaa...                                                                                                                                                                                                                                                                                                                                                                                                                                                                        ", "Array                                                                                                                                   ", "$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$                                  ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "                                                                                                                                                                                                                                                                              aaaaaa...                                                                                                                                                                                                                                                                                                                                                                                                                                                                        " + "'", str3, "                                                                                                                                                                                                                                                                              aaaaaa...                                                                                                                                                                                                                                                                                                                                                                                                                                                                        ");
    }

    @Test
    public void test27415() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest54.test27415");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("gnal.avaj ", "javal#.#agn");
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test27416() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest54.test27416");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBefore("javajavastrinjavajavastrinjavajavast", "                                                                   ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "javajavastrinjavajavastrinjavajavast" + "'", str2, "javajavastrinjavajavastrinjavajavast");
    }

    @Test
    public void test27417() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest54.test27417");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("$$$$$$java");
        java.lang.String str5 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray1, "", 149, 94);
        int int6 = org.apache.commons.lang3.StringUtils.indexOfDifference((java.lang.CharSequence[]) strArray1);
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
    }

    @Test
    public void test27418() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest54.test27418");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBeforeLast("AAAAAAAAAAJAVAL.AGNAAAAAAAAAAJAVAL.AGNAAAAAAAAAAJAVAL.AGNAAAAAAAAAAJAVAL.AGNAAAAAAAAAAJAVAL.AGNAAAAAAAAAAJAVAL.AGNAAAAAAAAAAJAVAL.AGNAAAAAAAAAAJAVAL.AGNAAAAAAAAAAJAVAL.AGNAAAAAAAAAAJAVAL.AGNAAAAAAAAAAJAVAL.AGNAAAAAAAAAAJAVAL.AGNAAAAAAAAAAJAVAL.AGNAAAAAAAAAAJAVAL.AGNAAAAAAAAAAJAVAL.AGNAAAAAAAAAAJAVAL.AGNAAAAAAAAAAJAVAL.AGNAAAAAAAAAAJAVAL.AGNAAAAAAAAAAJAVAL.AGNAAAAAAAAAAJAVAL.AGNAAAAAAAAAAJAVAL.AGNAAAAAAAAAAJAVAL.AGNAAAAAAAAAAJAVAL.AGNAAAAAAAAAAJAVAL.AGNAAAAAAAAAAJAVAL.AGNAAAAAAAAAAJAVAL.AGNAAAAAAAAAAJAVAL.AGNAAAAAAAAAAJAVAL.AGNAAAAAAAAAAJAVAL.AGNAAAAAAAAAAJAVAL.AGNAAAAAAAAAAJAVAL.AGNAAAAAAAAAAJAVAL.AGNAAAAAAAAAAJAVAL.AGNAAAAAAAAAAJAVAL.AGNAAAAAAAAAAJAVAL.AGN", "stJAVAGNAL                                                           ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "AAAAAAAAAAJAVAL.AGNAAAAAAAAAAJAVAL.AGNAAAAAAAAAAJAVAL.AGNAAAAAAAAAAJAVAL.AGNAAAAAAAAAAJAVAL.AGNAAAAAAAAAAJAVAL.AGNAAAAAAAAAAJAVAL.AGNAAAAAAAAAAJAVAL.AGNAAAAAAAAAAJAVAL.AGNAAAAAAAAAAJAVAL.AGNAAAAAAAAAAJAVAL.AGNAAAAAAAAAAJAVAL.AGNAAAAAAAAAAJAVAL.AGNAAAAAAAAAAJAVAL.AGNAAAAAAAAAAJAVAL.AGNAAAAAAAAAAJAVAL.AGNAAAAAAAAAAJAVAL.AGNAAAAAAAAAAJAVAL.AGNAAAAAAAAAAJAVAL.AGNAAAAAAAAAAJAVAL.AGNAAAAAAAAAAJAVAL.AGNAAAAAAAAAAJAVAL.AGNAAAAAAAAAAJAVAL.AGNAAAAAAAAAAJAVAL.AGNAAAAAAAAAAJAVAL.AGNAAAAAAAAAAJAVAL.AGNAAAAAAAAAAJAVAL.AGNAAAAAAAAAAJAVAL.AGNAAAAAAAAAAJAVAL.AGNAAAAAAAAAAJAVAL.AGNAAAAAAAAAAJAVAL.AGNAAAAAAAAAAJAVAL.AGNAAAAAAAAAAJAVAL.AGNAAAAAAAAAAJAVAL.AGNAAAAAAAAAAJAVAL.AGN" + "'", str2, "AAAAAAAAAAJAVAL.AGNAAAAAAAAAAJAVAL.AGNAAAAAAAAAAJAVAL.AGNAAAAAAAAAAJAVAL.AGNAAAAAAAAAAJAVAL.AGNAAAAAAAAAAJAVAL.AGNAAAAAAAAAAJAVAL.AGNAAAAAAAAAAJAVAL.AGNAAAAAAAAAAJAVAL.AGNAAAAAAAAAAJAVAL.AGNAAAAAAAAAAJAVAL.AGNAAAAAAAAAAJAVAL.AGNAAAAAAAAAAJAVAL.AGNAAAAAAAAAAJAVAL.AGNAAAAAAAAAAJAVAL.AGNAAAAAAAAAAJAVAL.AGNAAAAAAAAAAJAVAL.AGNAAAAAAAAAAJAVAL.AGNAAAAAAAAAAJAVAL.AGNAAAAAAAAAAJAVAL.AGNAAAAAAAAAAJAVAL.AGNAAAAAAAAAAJAVAL.AGNAAAAAAAAAAJAVAL.AGNAAAAAAAAAAJAVAL.AGNAAAAAAAAAAJAVAL.AGNAAAAAAAAAAJAVAL.AGNAAAAAAAAAAJAVAL.AGNAAAAAAAAAAJAVAL.AGNAAAAAAAAAAJAVAL.AGNAAAAAAAAAAJAVAL.AGNAAAAAAAAAAJAVAL.AGNAAAAAAAAAAJAVAL.AGNAAAAAAAAAAJAVAL.AGNAAAAAAAAAAJAVAL.AGNAAAAAAAAAAJAVAL.AGN");
    }

    @Test
    public void test27419() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest54.test27419");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.deleteWhitespace("                                                                                                                                                                                                                                                                                                                                                                        JAVAlLANGJ                                                                                                                                                                                                                                                                                        ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "JAVAlLANGJ" + "'", str1, "JAVAlLANGJ");
    }

    @Test
    public void test27420() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest54.test27420");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trim("VA.LANGGNAL..LA..");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "VA.LANGGNAL..LA.." + "'", str1, "VA.LANGGNAL..LA..");
    }

    @Test
    public void test27421() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest54.test27421");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.defaultString("             CHARACTER             UTILSTRI", "...o.GNAL");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "             CHARACTER             UTILSTRI" + "'", str2, "             CHARACTER             UTILSTRI");
    }

    @Test
    public void test27422() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest54.test27422");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeEnd("Aaaaaaaaaaaa                                                ", "       ############################################");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Aaaaaaaaaaaa                                                " + "'", str2, "Aaaaaaaaaaaa                                                ");
    }

    @Test
    public void test27423() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest54.test27423");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.leftPad("a.lang.CloneableStringinterface java.io                          ", 942);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                             a.lang.CloneableStringinterface java.io                          " + "'", str2, "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                             a.lang.CloneableStringinterface java.io                          ");
    }

    @Test
    public void test27424() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest54.test27424");
        char[] charArray13 = new char[] { ' ', ' ', '#', 'a', '4', 'a' };
        int int14 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "", charArray13);
        boolean boolean15 = org.apache.commons.lang3.StringUtils.containsAny("$", charArray13);
        int int16 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "", charArray13);
        boolean boolean17 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "...       AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA", charArray13);
        boolean boolean18 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "String[]", charArray13);
        boolean boolean19 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "                                                                                                                       irfCo$irfioSrA..ayL A.444444444444444444444444444", charArray13);
        boolean boolean20 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "irfiosriiz$#################################################################################################################################irfco", charArray13);
        org.junit.Assert.assertNotNull(charArray13);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray13), "  #a4a");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray13), "  #a4a");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray13), "[ ,  , #, a, 4, a]");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test27425() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest54.test27425");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trimToNull("ssalc gnirtS.gnal.avaj");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "ssalc gnirtS.gnal.avaj" + "'", str1, "ssalc gnirtS.gnal.avaj");
    }

    @Test
    public void test27426() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest54.test27426");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.apache.commons.lang3.StringUtils.abbreviate("                                                               Jvstringnlrrylistrrylistrrylistvj", 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Minimum abbreviation width is 4");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test27427() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest54.test27427");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("                                                                                                                                                                                                                                                  44444444444444444444-1java444444444444444444444                                                                       .................................................................................................................................................", "interfacejava.lang.Cloneableinterfacejava.lang.Cloneable.......java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........javainterfacejava.io.Serializableinterfacejava.io.Serializable", 800);
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void test27428() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest54.test27428");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.defaultIfEmpty("Stringc", "sAitUJAirtSsAitUJAirtSsAitUJAi");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Stringc" + "'", str2, "Stringc");
    }

    @Test
    public void test27429() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest54.test27429");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitByCharacterTypeCamelCase("AAAAAA...1AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA...1AAAAAAAAAAAAAAAAAAAAAAAAAA");
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test27430() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest54.test27430");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isEmpty((java.lang.CharSequence) "                                    Jvstringnlrrylistrrylistrrylis");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test27431() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest54.test27431");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.stripEnd("AAAAAAAAAAnga.lavajAAAAAAAAAAnga.lavajAAAAAAAAAAnga.lavajAAAAAAAAAAnga.lavajAAAAAAAAAAnga.lavajAAAAAAAAAAnga.lavajAAAAAAAAAAnga.lavajAAAAAAAAAAnga.lavajAAAAAAAAAAnga.lavajAAAAAAAAAAnga.lavajAAAAAAAAAAnga.lavajAAAAAAAAAAnga.lavajAAAAAAAAAAnga.lavajAAAAAAAAAAnga.lavajAAAAAAAAAAnga.lavajAAAAAAAAAAnga.lavajAAAAAAAAAAnga.lavajAAAAAAAAAAnga.lavajAAAAAAAAAAnga.lavajAAAAAAAAAAnga.lavajAAAAAAAAAAnga.lavajAAAAAAAAAAnga.lavajAAAAAAAAAAnga.lavajAAAAAAAAAAnga.lavajAAAAAAAAAAnga.lavajAAAAAAAAAAnga.lavajAAAAAAAAAAnga.lavajAAAAAAAAAAnga.lavajAAAAAAAAAAnga.lavajAAAAAAAAAAnga.lavajAAAAAAAAAAnga.lavajAAAAAAAAAAnga.lavajAAAAAAAAAAnga.lavajAAAAAAAAAAnga.lavajAAAAAAAAAAnga.lavajAAAAAAAAAA", "Serializab");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "AAAAAAAAAAnga.lavajAAAAAAAAAAnga.lavajAAAAAAAAAAnga.lavajAAAAAAAAAAnga.lavajAAAAAAAAAAnga.lavajAAAAAAAAAAnga.lavajAAAAAAAAAAnga.lavajAAAAAAAAAAnga.lavajAAAAAAAAAAnga.lavajAAAAAAAAAAnga.lavajAAAAAAAAAAnga.lavajAAAAAAAAAAnga.lavajAAAAAAAAAAnga.lavajAAAAAAAAAAnga.lavajAAAAAAAAAAnga.lavajAAAAAAAAAAnga.lavajAAAAAAAAAAnga.lavajAAAAAAAAAAnga.lavajAAAAAAAAAAnga.lavajAAAAAAAAAAnga.lavajAAAAAAAAAAnga.lavajAAAAAAAAAAnga.lavajAAAAAAAAAAnga.lavajAAAAAAAAAAnga.lavajAAAAAAAAAAnga.lavajAAAAAAAAAAnga.lavajAAAAAAAAAAnga.lavajAAAAAAAAAAnga.lavajAAAAAAAAAAnga.lavajAAAAAAAAAAnga.lavajAAAAAAAAAAnga.lavajAAAAAAAAAAnga.lavajAAAAAAAAAAnga.lavajAAAAAAAAAAnga.lavajAAAAAAAAAAnga.lavajAAAAAAAAAA" + "'", str2, "AAAAAAAAAAnga.lavajAAAAAAAAAAnga.lavajAAAAAAAAAAnga.lavajAAAAAAAAAAnga.lavajAAAAAAAAAAnga.lavajAAAAAAAAAAnga.lavajAAAAAAAAAAnga.lavajAAAAAAAAAAnga.lavajAAAAAAAAAAnga.lavajAAAAAAAAAAnga.lavajAAAAAAAAAAnga.lavajAAAAAAAAAAnga.lavajAAAAAAAAAAnga.lavajAAAAAAAAAAnga.lavajAAAAAAAAAAnga.lavajAAAAAAAAAAnga.lavajAAAAAAAAAAnga.lavajAAAAAAAAAAnga.lavajAAAAAAAAAAnga.lavajAAAAAAAAAAnga.lavajAAAAAAAAAAnga.lavajAAAAAAAAAAnga.lavajAAAAAAAAAAnga.lavajAAAAAAAAAAnga.lavajAAAAAAAAAAnga.lavajAAAAAAAAAAnga.lavajAAAAAAAAAAnga.lavajAAAAAAAAAAnga.lavajAAAAAAAAAAnga.lavajAAAAAAAAAAnga.lavajAAAAAAAAAAnga.lavajAAAAAAAAAAnga.lavajAAAAAAAAAAnga.lavajAAAAAAAAAAnga.lavajAAAAAAAAAAnga.lavajAAAAAAAAAA");
    }

    @Test
    public void test27432() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest54.test27432");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.strip("       ..............................", "String.");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "       " + "'", str2, "       ");
    }

    @Test
    public void test27433() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest54.test27433");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNumericSpace((java.lang.CharSequence) "aaaaaaaaaa");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test27434() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest54.test27434");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOf("Arr... AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA... AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA... AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA... AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA... AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA... AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA... AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA... AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA... AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA..", "aaaaaaaINTEGERaaaaaaa");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test27435() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest54.test27435");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripToNull("Seria");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Seria" + "'", str1, "Seria");
    }

    @Test
    public void test27436() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest54.test27436");
        java.lang.ClassLoader classLoader0 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass2 = org.apache.commons.lang3.ClassUtils.getClass(classLoader0, "gnAls444");
            org.junit.Assert.fail("Expected exception of type java.lang.ClassNotFoundException; message: gnAls444");
        } catch (java.lang.ClassNotFoundException e) {
            // Expected exception.
        }
    }

    @Test
    public void test27437() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest54.test27437");
        java.lang.Class<?>[] wildcardClassArray0 = null;
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("hi!", "");
        java.lang.String[] strArray5 = org.apache.commons.lang3.StringUtils.stripAll(strArray3, "$");
        java.lang.Class<?>[] wildcardClassArray6 = org.apache.commons.lang3.ClassUtils.toClass((java.lang.Object[]) strArray3);
        java.lang.Class<?>[] wildcardClassArray7 = org.apache.commons.lang3.ClassUtils.toClass((java.lang.Object[]) wildcardClassArray6);
        java.lang.String str11 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) wildcardClassArray7, '#', (int) (byte) -1, (-1));
        boolean boolean13 = org.apache.commons.lang3.ClassUtils.isAssignable(wildcardClassArray0, wildcardClassArray7, false);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertNotNull(wildcardClassArray6);
        org.junit.Assert.assertNotNull(wildcardClassArray7);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test27438() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest54.test27438");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.leftPad("4444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444aaaaaaaaaava.lang", 605, '#');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "##############################################################################################################################################################################################################################################################################################################################################################################################################################################################4444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444aaaaaaaaaava.lang" + "'", str3, "##############################################################################################################################################################################################################################################################################################################################################################################################################################################################4444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444aaaaaaaaaava.lang");
    }

    @Test
    public void test27439() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest54.test27439");
        java.lang.String str1 = org.apache.commons.lang3.ClassUtils.getPackageCanonicalName("     aaaaaaaaaa      javaStrinSerializableSerializableSerializableSeriali");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
    }

    @Test
    public void test27440() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest54.test27440");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.abbreviateMiddle("arahCretcarahCretcarahCretcarahCretcarahCretcarahCretcarahCretcarahCretcarahCretcarahCretcarahCretcarahCretcarahCretcarahCretcarahCretcarahCretcarahCretcarahCretcarahCretcarahCretcarahCretcarahCretcarahCretcarahCretcarahCretcarahCretcarahCretcarahCretcarahCretcarahCretcarahCretcarahCretcarahCretcarahCretcarahCretcarahCretcarahCretcarahCretcarahCretcarahCretcarahCretcarahCretcarahCretcarahCretcarahCretcarahCretcarahCretcarahCretcarahCretcarahCretcarahCretcarahCretcarahCretcarahCretcarahCretcarahCretcarahCretcarahCretcarahCretcarahCretcarahCretcarahCretcarahCAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAALANG.JAVA", "JAVAlLANG", 64);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "arahCretcarahCretcarahCretcaJAVAlLANGAAAAAAAAAAAAAAAAAALANG.JAVA" + "'", str3, "arahCretcarahCretcarahCretcaJAVAlLANGAAAAAAAAAAAAAAAAAALANG.JAVA");
    }

    @Test
    public void test27441() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest54.test27441");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.contains("Class[]", 29);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test27442() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest54.test27442");
        int int2 = org.apache.commons.lang3.StringUtils.indexOf("aaaaaaaaaaaaaaaaaaaaaaaaaaaaULANGrrayList#######.####################", 84);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test27443() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest54.test27443");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.substringsBetween("TU                    ", "                                                                                                                                                                                                                                                                                                                                                                                                                                                                      INTERFACE JAVALANGCLONEABLELANGGNALJAVALANGAVAJGNALJAVALANGAVAJGNALJAVALANGAVAJGNALJAVALANGAVAJGNALJAVALANGAVAJGNALJAVALANGAVAJGNALJAVALANGAVAJGNALJAVALANGAVAJJAVAINTERFACE JAVAIOSERIALIZABLE", "...44...                                 44444$         ");
        org.junit.Assert.assertNull(strArray3);
    }

    @Test
    public void test27444() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest54.test27444");
        java.lang.CharSequence charSequence0 = null;
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsNone(charSequence0, "...    ...");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test27445() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest54.test27445");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.stripStart("       ..............................", "444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444litu.avajlitu.avajArrayListArrayListArrayListavajGNAL.AVAJLANG.JAVAGNAL.AVAJLANG.JAVAGNAL.AVAJLANG.JAVAGNAL.AVAJLANG.JAVAGNAL.AVAJLANG.JAVAGNAL.AVAJLANG.JAVAGNAL.AVAJLANG.JAVAGNAL.AVAJLANG.JAVAGNAL.AVAJgnalArrayListArrayListArrayListavajGNAL.AVAJLANG.JAVAGNAL.AVAJLANG.JAVAGNAL.AVAJLANG.JAVAGNAL.AVAJLANG.JAVAGNAL.AVAJLANG.JAVAGNAL.AVAJLANG.JAVAGNAL.AVAJLANG.JAVAGNAL.AVAJLANG.JAVAGNAL.AVAJgnalArrayListArrayListArrayListavajGNAL.AVAJLANG.JAVAGNAL.AVAJLANG.JAVAGNAL.AVAJLANG.JAVAGNAL.AVAJLANG.JAVAGNAL.AVAJLANG.JAVAGNAL.AVAJLANG.JAVAGNAL.AVAJLANG.JAVAGNAL.AVAJLANG.JAVAGNAL.AVAJgnalArrayListArrayListArrayListavajGNAL.AVAJLANG.JAVAGNAL.AVAJLANG.JAVAGNAL.AVAJLANG.JAVAGNAL.AVAJLANG.JAVAGNAL.AVAJLANG.JAVAGNAL.AVAJLANG.JAVAGNAL.AVAJLANG.JAVAGNAL.AVAJLANG.JAVAGNAL.AVAJgnalArrayListArrayListArrayListavaj");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "       .............................." + "'", str2, "       ..............................");
    }

    @Test
    public void test27446() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest54.test27446");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.remove("ssalc gnirtS.gnal.avaj", '#');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "ssalc gnirtS.gnal.avaj" + "'", str2, "ssalc gnirtS.gnal.avaj");
    }

    @Test
    public void test27447() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest54.test27447");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringAfter("                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                 int", "blealiza.io.Seriavacejable#interfang.Clonea.lavacejainterf");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test27448() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest54.test27448");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.center(".litu.avajlitu.avajlangjavalitu.avajlitu.avaj.litu.avajlitu.avajlangjavalitu.avajlitu.avaj.litu.avajlitu.avajlangjavalitu.avajlitu.avaj.litu.avajlitu.avajlangjavalitu.avajlitu.avaj.litu.avajlitu.avajlangjavalitu.avajlitu.avaj.litu.avajlitu.avajlangjavalitu.avajlitu.avaj.litu.avajlitu.avajlangjavalitu.avajlitu.avaj.litu.avajlitu.avajlangjavalitu.avajlitu.avaj.litu.avajlitu.avajlangjavalitu.avajlitu.avaj.litu.avajlitu.avaj1litu.avajlitu.avajAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAJlitu.avajlitu.avajavalitu.avajlitu.avaj.litu.avajlitu.avaj1litu.avajlitu.avajAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAlitu.avajlitu.avaj.litu.avajlitu.avaj1litu.avajlitu.avajAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA", 578, "aRRAYlISTaRRAYlISTaRRAYlISTaRRAYlIS");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + ".litu.avajlitu.avajlangjavalitu.avajlitu.avaj.litu.avajlitu.avajlangjavalitu.avajlitu.avaj.litu.avajlitu.avajlangjavalitu.avajlitu.avaj.litu.avajlitu.avajlangjavalitu.avajlitu.avaj.litu.avajlitu.avajlangjavalitu.avajlitu.avaj.litu.avajlitu.avajlangjavalitu.avajlitu.avaj.litu.avajlitu.avajlangjavalitu.avajlitu.avaj.litu.avajlitu.avajlangjavalitu.avajlitu.avaj.litu.avajlitu.avajlangjavalitu.avajlitu.avaj.litu.avajlitu.avaj1litu.avajlitu.avajAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAJlitu.avajlitu.avajavalitu.avajlitu.avaj.litu.avajlitu.avaj1litu.avajlitu.avajAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAlitu.avajlitu.avaj.litu.avajlitu.avaj1litu.avajlitu.avajAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA" + "'", str3, ".litu.avajlitu.avajlangjavalitu.avajlitu.avaj.litu.avajlitu.avajlangjavalitu.avajlitu.avaj.litu.avajlitu.avajlangjavalitu.avajlitu.avaj.litu.avajlitu.avajlangjavalitu.avajlitu.avaj.litu.avajlitu.avajlangjavalitu.avajlitu.avaj.litu.avajlitu.avajlangjavalitu.avajlitu.avaj.litu.avajlitu.avajlangjavalitu.avajlitu.avaj.litu.avajlitu.avajlangjavalitu.avajlitu.avaj.litu.avajlitu.avajlangjavalitu.avajlitu.avaj.litu.avajlitu.avaj1litu.avajlitu.avajAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAJlitu.avajlitu.avajavalitu.avajlitu.avaj.litu.avajlitu.avaj1litu.avajlitu.avajAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAlitu.avajlitu.avaj.litu.avajlitu.avaj1litu.avajlitu.avajAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA");
    }

    @Test
    public void test27449() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest54.test27449");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.startsWith("aaaaaaaaaS.r..gU..lsS.r..gU..lsS.r..gU..lsS.r..gU..lsS.r..gU..lsS.r..gU..lsS.r..gU..lsS.r..gU..lsS.r", "$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test27450() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest54.test27450");
        int int2 = org.apache.commons.lang3.StringUtils.getLevenshteinDistance((java.lang.CharSequence) "Java$.lang.Stringclass java.lang.Stringclass java.lang.Stringclas.lang.Stringclass java.lang.Stringc", (java.lang.CharSequence) "integer");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 95 + "'", int2 == 95);
    }

    @Test
    public void test27451() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest54.test27451");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.split("java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java", "Class", 2);
        java.lang.String[] strArray5 = org.apache.commons.lang3.StringUtils.stripAll(strArray3, "ssalC");
        int int6 = org.apache.commons.lang3.StringUtils.indexOfDifference((java.lang.CharSequence[]) strArray5);
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.getCommonPrefix(strArray5);
        java.lang.String str9 = org.apache.commons.lang3.ClassUtils.getPackageCanonicalName((java.lang.Object) str7, "                       javaulangrraylist                       javaulangrraylist          ");
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "java.lang" + "'", str9, "java.lang");
    }

    @Test
    public void test27452() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest54.test27452");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.defaultString("object", "44444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444AVALITU.");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "object" + "'", str2, "object");
    }

    @Test
    public void test27453() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest54.test27453");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBetween("....................................................................", "4444444444444444444444444444444444444444444444444444444444444444444444444444JAVA.LANGaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertNull(str2);
    }

    @Test
    public void test27454() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest54.test27454");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOf("rrayListrrayListrrayListrrayListrrayListrrayListrrayListrrayListrrayListrr...    ...rrayListrrayListrrayListrrayListrrayListrrayListrrayListrrayListrrayListrra", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa...1aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa...1aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa...1aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa...1aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa...1aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa...1aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa...1aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa...1aaaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test27455() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest54.test27455");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNotEmpty((java.lang.CharSequence) "classjavalangClassJAVAULANGJAVAULANGJAVAULANGJAVAULANGJAVAULANGJAVAULANGJAVAULANGJAVAULANGJAVAULANGJAVAULANGJAVAULANGJAVAULANGJAVAULANGJAVAULANGJAVAULANGJAVAULANGJAVAULANGJAVAULANGJAVAULANGJAVAULANG$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test27456() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest54.test27456");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceChars("                                                                                                                                                                            #agnaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaajaval#.aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaajaval#                                                                                                                                                                            ", "tsiLytcejbO.gnal.avaj ssalcrrA", "javaulang444444444444444444444444444444444444444444444444444444444444444444444444");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "4444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444#44444444444444444444444444444444444444444444444444444444444444g4444#444444444444444444444444444444444444444444444444444444444444g4444#4444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444" + "'", str3, "4444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444#44444444444444444444444444444444444444444444444444444444444444g4444#444444444444444444444444444444444444444444444444444444444444g4444#4444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444");
    }

    @Test
    public void test27457() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest54.test27457");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphanumeric((java.lang.CharSequence) "A..yL A.4444444444...");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test27458() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest54.test27458");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.split("                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                        ");
        java.lang.String str3 = org.apache.commons.lang3.ClassUtils.getShortClassName((java.lang.Object) "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                        ", "gnalAVAJGNAL.AVAJGNALavaj");
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "String" + "'", str3, "String");
    }

    @Test
    public void test27459() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest54.test27459");
        java.lang.ClassLoader classLoader0 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass3 = org.apache.commons.lang3.ClassUtils.getClass(classLoader0, "gagnAAAAAAAAAAistArrayListArrayListavaj.gnalArrayListArrayListArrayLi", true);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassNotFoundException; message: gagnAAAAAAAAAAistArrayListArrayListavaj/gnalArrayListArrayListArrayLi");
        } catch (java.lang.ClassNotFoundException e) {
            // Expected exception.
        }
    }

    @Test
    public void test27460() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest54.test27460");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isBlank((java.lang.CharSequence) "interfacejava.lang.Cloneablegnal.avajgnal..LANGgnal.avajgnal.interfacejava.io");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test27461() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest54.test27461");
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.overlay("aaaa                       javaulangrraylist", "...       ....       ", 31, 60);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "aaaa                       java...       ....       " + "'", str4, "aaaa                       java...       ....       ");
    }

    @Test
    public void test27462() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest54.test27462");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substring("Java.lang.Cloneable4interface java.io.Serializa", 63);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test27463() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest54.test27463");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceChars("RAYlISTaRRAYlISTaRRAYlISTAVAJ.GNALaRRAYlISTaRRAYlISTaRRAYlISTAVAJ.GNALaRRAYlISTaRRAYlIS...", "ArrayListArrayListArrayListavajGNAL.AVAJLANG.JAVAGNAL.AVAJLANG.JAVAGNAL.AVAJLANG.JAVAGNAL.AVAJLANG.JAVAGNAL.AVAJLANG.JAVAGNAL.AVAJLANG.JAVAGNAL.AVAJLANG.JAVAGNAL.AVAJLANG.JAVAGNAL.AVAJgnal", "integer");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "RiYISTeRRiYISTeRRiYISTiiieeRRiYISTeRRiYISTeRRiYISTiiieeRRiYISTeRRiYIS" + "'", str3, "RiYISTeRRiYISTeRRiYISTiiieeRRiYISTeRRiYISTeRRiYISTiiieeRRiYISTeRRiYIS");
    }

    @Test
    public void test27464() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest54.test27464");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("TU                    ", "gnAls4444", 65);
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void test27465() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest54.test27465");
        java.lang.CharSequence charSequence2 = org.apache.commons.lang3.StringUtils.defaultIfBlank((java.lang.CharSequence) "StringUtilsStringUtilsStringUtilsStringUtilsStringUtilsStringUtilsStringUtilsStringUtilsStringUtilsStringUti", (java.lang.CharSequence) "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                ");
        org.junit.Assert.assertEquals("'" + charSequence2 + "' != '" + "StringUtilsStringUtilsStringUtilsStringUtilsStringUtilsStringUtilsStringUtilsStringUtilsStringUtilsStringUti" + "'", charSequence2, "StringUtilsStringUtilsStringUtilsStringUtilsStringUtilsStringUtilsStringUtilsStringUtilsStringUtilsStringUti");
    }

    @Test
    public void test27466() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest54.test27466");
        java.lang.CharSequence charSequence0 = null;
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsOnly(charSequence0, "INTERFACE#JAVA.LANG.cLONEABLE....................................................................#######################javaulangINTERFACE#JAVA.IO");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test27467() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest54.test27467");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfAnyBut("jvstringnlrrylistrrylistrrylistv", "");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test27468() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest54.test27468");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsAny("####################################.aArrayaListaArrayaListaArrayaListaArrayaLis#####################################", "Airfco$irfiosriizcirfco$irfiosriizObirfco$irfiosriizecirfco$irfiosriizL");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test27469() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest54.test27469");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaajaval...agn", "##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#lassjava#lang#String", 939);
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void test27470() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest54.test27470");
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
        java.lang.Class<?>[] wildcardClassArray16 = org.apache.commons.lang3.ClassUtils.primitivesToWrappers(wildcardClassArray7);
        java.lang.String str18 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) wildcardClassArray16, ' ');
        java.lang.String str19 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) wildcardClassArray16);
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                   " + "'", str2, "                                   ");
        org.junit.Assert.assertNotNull(wildcardClassArray3);
        org.junit.Assert.assertNotNull(classArray6);
        org.junit.Assert.assertNotNull(wildcardClassArray7);
        org.junit.Assert.assertNotNull(wildcardClassArray10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertNotNull(wildcardClassArray16);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
    }

    @Test
    public void test27471() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest54.test27471");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.chomp("44444444444444444444444444444444444444444444444444aaaaaaaaaa...", "interface java.lang.CloneableA rrr rrr rrr rrr rrr rrr rrr rrr rrr rrrinterface java.io.Serializable");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "44444444444444444444444444444444444444444444444444aaaaaaaaaa..." + "'", str2, "44444444444444444444444444444444444444444444444444aaaaaaaaaa...");
    }

    @Test
    public void test27472() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest54.test27472");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.center("AAAAAAAAAAAAAAAAAAA AAAAAAAAAAAAAAAAAAA AAAAAAAAAAAAAAAAAAA AAAAAAAAAAAAAAAAAAA AAAAAAAAAAAAAAAAAAA AAAAAAAAAAAAAAAAAAA", 940, '.');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "..........................................................................................................................................................................................................................................................................................................................................................................................................................AAAAAAAAAAAAAAAAAAA AAAAAAAAAAAAAAAAAAA AAAAAAAAAAAAAAAAAAA AAAAAAAAAAAAAAAAAAA AAAAAAAAAAAAAAAAAAA AAAAAAAAAAAAAAAAAAA..........................................................................................................................................................................................................................................................................................................................................................................................................................." + "'", str3, "..........................................................................................................................................................................................................................................................................................................................................................................................................................AAAAAAAAAAAAAAAAAAA AAAAAAAAAAAAAAAAAAA AAAAAAAAAAAAAAAAAAA AAAAAAAAAAAAAAAAAAA AAAAAAAAAAAAAAAAAAA AAAAAAAAAAAAAAAAAAA...........................................................................................................................................................................................................................................................................................................................................................................................................................");
    }

    @Test
    public void test27473() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest54.test27473");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.center("gnal.avajgnal..LANGgnal", 477);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                                                                                                                                                                                                                   gnal.avajgnal..LANGgnal                                                                                                                                                                                                                                   " + "'", str2, "                                                                                                                                                                                                                                   gnal.avajgnal..LANGgnal                                                                                                                                                                                                                                   ");
    }

    @Test
    public void test27474() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest54.test27474");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlpha((java.lang.CharSequence) "CEAJ V AL NGAcLONE BLEAAAAAAAJ V AAAAAAAAAAJJAVAlLANGJAVA.LANGAVAJ.GNALJAVA.LANGAVAJ.GNALJAVA.LANGAVAJ.GNALJAVA.LANGAVAJ.GNALJAVA.LANGAVAJ.GNALJAVA.LANGAVAJ.GNALJAVA.LANGAVAJ.GNALJAVA.LANGAVAJ.GNALJAVA.LANG");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test27475() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest54.test27475");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlpha((java.lang.CharSequence) "     aaaaaaaaaa      ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test27476() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest54.test27476");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.abbreviateMiddle("444444444444444444444444444444444444444444444AAAAAAAAAAAAAAAAAAA4444444444444444444444444444444444444444444444", "vvayLasa", 157);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "444444444444444444444444444444444444444444444AAAAAAAAAAAAAAAAAAA4444444444444444444444444444444444444444444444" + "'", str3, "444444444444444444444444444444444444444444444AAAAAAAAAAAAAAAAAAA4444444444444444444444444444444444444444444444");
    }

    @Test
    public void test27477() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest54.test27477");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isWhitespace((java.lang.CharSequence) "CLASS JAVA.LANG.oBJECT");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test27478() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest54.test27478");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.abbreviate("U                                                                                                                                                                                                                                                                                                       JAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA...", 666);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "U                                                                                                                                                                                                                                                                                                       JAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA..." + "'", str2, "U                                                                                                                                                                                                                                                                                                       JAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA...");
    }

    @Test
    public void test27479() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest54.test27479");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlpha((java.lang.CharSequence) "44444444444444444444444444444444444444444444444444444444444444444444444javaulang44444444444444444");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test27480() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest54.test27480");
        java.util.Locale locale1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.apache.commons.lang3.StringUtils.lowerCase("io", locale1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test27481() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest54.test27481");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.center("AAAAAAAAAAjaval.agnAAAAAAAAAAjaval.a", 22);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "AAAAAAAAAAjaval.agnAAAAAAAAAAjaval.a" + "'", str2, "AAAAAAAAAAjaval.agnAAAAAAAAAAjaval.a");
    }

    @Test
    public void test27482() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest54.test27482");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.leftPad("", 262, "AAAAAAAAAAJ#V##.#GNAAAAAAAAAAJ#V##.#GNAAAAAAAAAAJ#V##.#GNAAAAAAAAAAJ#V##.#GNAAAAAAAAAAJ#V##.#GNAAAAAAAAAAJ#V##.#GNAAAAAAAAAAJ#V##.#GNAAAAAAAAAAJ#V##.#GNAAAAAAAAAAJ#V##.#GNAAAAAAAAAAJ#V##.#GNAAAAAAAAAAJ#V##.#GNAAAAAAAAAAJ#V##.#GNAAAAAAAAAAJ#                                              AAAAAAAJ#V##.#GNAAAAAAAAAAJ#V##.#GNAAAAAAAAAAJ#V##.#GNAAAAAAAAAAJ#V##.#GNAAAAAAAAAAJ#V##.#GNAAAAAAAAAAJ#V##.#GNAAAAAAAAAAJ#V##.#GNAAAAAAAAAAJ#V##.#GNAAAAAAAAAAJ#V##.#GNAAAAAAAAAAJ#V##.#GNAAAAAAAAAAJ#V##.#GNAAAAAAAAAAJ#V##.#GNAAAAAAAAAARING");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "AAAAAAAAAAJ#V##.#GNAAAAAAAAAAJ#V##.#GNAAAAAAAAAAJ#V##.#GNAAAAAAAAAAJ#V##.#GNAAAAAAAAAAJ#V##.#GNAAAAAAAAAAJ#V##.#GNAAAAAAAAAAJ#V##.#GNAAAAAAAAAAJ#V##.#GNAAAAAAAAAAJ#V##.#GNAAAAAAAAAAJ#V##.#GNAAAAAAAAAAJ#V##.#GNAAAAAAAAAAJ#V##.#GNAAAAAAAAAAJ#                      " + "'", str3, "AAAAAAAAAAJ#V##.#GNAAAAAAAAAAJ#V##.#GNAAAAAAAAAAJ#V##.#GNAAAAAAAAAAJ#V##.#GNAAAAAAAAAAJ#V##.#GNAAAAAAAAAAJ#V##.#GNAAAAAAAAAAJ#V##.#GNAAAAAAAAAAJ#V##.#GNAAAAAAAAAAJ#V##.#GNAAAAAAAAAAJ#V##.#GNAAAAAAAAAAJ#V##.#GNAAAAAAAAAAJ#V##.#GNAAAAAAAAAAJ#                      ");
    }

    @Test
    public void test27483() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest54.test27483");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOf("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa                              ", 62, 158);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test27484() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest54.test27484");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfAnyBut("StringCLAS", "                                                                                                                                                                                                                                                                                                                                                        ArryListArryListArryListvjGNAL.AVAJLANG.JAVAGNAL.AVAJLANG.JAVAGNAL.AVAJLANG.JAVAGNAL.AVAJLANG.JAVAGNAL.AVAJLANG.JAVAGNAL.AVAJLANG.JAVAGNAL.AVAJLANG.JAVAGNAL.AVAJLANG.JAVAGNAL.AVAJgnl                                                                                                                                                                                                                                                                                                                                                                                           ");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test27485() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest54.test27485");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.contains("etyBetyBetyBetyBetyBetyBetyBetyBetyB", 167);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test27486() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest54.test27486");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNumericSpace((java.lang.CharSequence) ". ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test27487() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest54.test27487");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.remove("                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                         ...sAitUJAirtSsAitUJAirtSsAitUJAirtSsAitUJAirtSsAitUJAirtSsAitUJAirtSsAitUJAirtSsAitUJAirtSsAitUJAirtS", "JAVAlLANGJAVAlLANGJAVAlLANGJAVAlLANGJAVAlLANGJAVAlLANGJAVAlLANGJAVAlLANGJAVAlLANGJAVAlLANGJAVAlLANGJAVAlLANGJAVAlLANGJAVAlLANGJAVAlLANGJAVAlLANGJAVAlLANGJAVAlLANGJAVAlLANGJAVAlLANGJAVAlLANGJAVAlLANGJAVAlLANGJAVAlLANGJAVAlLANGJAVAlLANGJAjaval.agnjaval.agnjaval.agnjaval.agnjaval.agnjaval.agnjaval.agnjaval.agnjabytejaval.agnjaval.agnjaval.agnjaval.agnjaval.agnjaval.agnjaval.agnjaval.agnjaJAVAlLANGJAVAlLANGJAVAlLANGJAVAlLANGJAVAlLANGJAVAlLANGJAVAlLANGJAVAlLANGJAVAlLANGJAVAlLANGJAVAlLANGJAVAlLANGJAVAlLANGJAVAlLANGJAVAlLANGJAVAlLANGJAVAlLANGJAVAlLANGJAVAlLANGJAVAlLANGJAVAlLANGJAVAlLANGJAVAlLANGJAVAlLANGJAVAlLANGJAVAlLANGJA");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                         ...sAitUJAirtSsAitUJAirtSsAitUJAirtSsAitUJAirtSsAitUJAirtSsAitUJAirtSsAitUJAirtSsAitUJAirtSsAitUJAirtS" + "'", str2, "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                         ...sAitUJAirtSsAitUJAirtSsAitUJAirtSsAitUJAirtSsAitUJAirtSsAitUJAirtSsAitUJAirtSsAitUJAirtSsAitUJAirtS");
    }

    @Test
    public void test27488() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest54.test27488");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.upperCase("..............................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................lass...                                       ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "..............................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................LASS...                                       " + "'", str1, "..............................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................LASS...                                       ");
    }

    @Test
    public void test27489() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest54.test27489");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.deleteWhitespace("interface java.lang.Cloneable.......java.......Objectava..........javainterface java.io.Serializable");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "interfacejava.lang.Cloneable.......java.......Objectava..........javainterfacejava.io.Serializable" + "'", str1, "interfacejava.lang.Cloneable.......java.......Objectava..........javainterfacejava.io.Serializable");
    }

    @Test
    public void test27490() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest54.test27490");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replace("erfacejava.lang.Cloneable#interfacejava.iointerfacejava.lang.Cloneable#interfacejava.iointerfacejava.la", "hi!ArrayListArrayListArrayListavaj.... AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA... AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA... AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA... AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA... AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA... AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA... AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA... AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA... AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA... AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA", "                       ....................................................................");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "erfacejava.lang.Cloneable#interfacejava.iointerfacejava.lang.Cloneable#interfacejava.iointerfacejava.la" + "'", str3, "erfacejava.lang.Cloneable#interfacejava.iointerfacejava.lang.Cloneable#interfacejava.iointerfacejava.la");
    }

    @Test
    public void test27491() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest54.test27491");
        java.lang.String str1 = org.apache.commons.lang3.ClassUtils.getShortCanonicalName("JAVA.UTILhi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!h");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "UTILhi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!h" + "'", str1, "UTILhi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!h");
    }

    @Test
    public void test27492() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest54.test27492");
        java.util.Locale locale1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.apache.commons.lang3.StringUtils.lowerCase("CTERcHARACTERcHARACTERcHARACTERcHARACTERcHARACTERcHARACTERcHARACTERcHARACTERcHARACTERcHAR", locale1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test27493() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest54.test27493");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNumeric((java.lang.CharSequence) "interface java.lang.cloneable.....");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test27494() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest54.test27494");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("aRRAYlISTaRRAYlISTaRRAYlIST", "interfcejv.lng.cloneble#interfcejv.io", 605);
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void test27495() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest54.test27495");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.substringsBetween("############################################", "lC.gnal.avaj ecafretnielbazilaireS.oi.avaj ecafretni$elbaenolC.gnal.avaj ecafretnielbazilaireS.oi.avaj ecafretni$elbaenolC.gnal.avaj ecafretni$gnal.avaj", "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                        HI!aRRAYlISTaRRAYlISTaRRAYlISTAVAJ");
        org.junit.Assert.assertNull(strArray3);
    }

    @Test
    public void test27496() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest54.test27496");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitByCharacterType("...       ....       .");
        java.lang.String str3 = org.apache.commons.lang3.ClassUtils.getPackageName((java.lang.Object) strArray1, "VAJ");
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "java.lang" + "'", str3, "java.lang");
    }

    @Test
    public void test27497() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest54.test27497");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("         ########$#######$          ", "", 28);
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void test27498() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest54.test27498");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.split("AtsiLytcejbO.gnal.avaj ssalcrrAtsiLytcejbO.gnal.avaj ssalcrrAva.langGNAL..langjava.langAGNAL.AVAJ", "...       ...       ...       ...       ...       ...       ...       ...       ...       ...   gna", 6);
        java.lang.Class<?> wildcardClass4 = strArray3.getClass();
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test27499() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest54.test27499");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripToNull("jva..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........jav");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "jva..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........jav" + "'", str1, "jva..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........jav");
    }

    @Test
    public void test27500() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest54.test27500");
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("4444444444444444444444444444444444444444444444gnal", "][sslC][sslCrChahacta][sslC][ssl");
        boolean boolean5 = org.apache.commons.lang3.StringUtils.startsWithAny("hi!ArrayListArrayListArrayListavaj....AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA...AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA...AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA...AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA...AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA...AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA...AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA...AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA...AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA..", strArray4);
        java.lang.String str6 = org.apache.commons.lang3.StringUtils.concatWith("                                  $$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$", (java.lang.Object[]) strArray4);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "4444444444444444444444444444444444444444444444gnal" + "'", str6, "4444444444444444444444444444444444444444444444gnal");
    }
}

