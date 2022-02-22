import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest71 {

    public static boolean debug = false;

    @Test
    public void test35501() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest71.test35501");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfAnyBut("$         $         $         $         $  aaa    aaa$         $         $         $         $  ", "interfacejava.lang.Cloneable...interfacejava.iointerfacejava.lang.Cloneable...interfacejava.iointerfacejava.lang.Cloneable...interfacejava.iointerfacejava.lang.Cloneable...interfacejava.iointerfacejava.lang.Cloneable...interfacejava.iointerfacejava.lang.Cloneable...interfacejava.iointerfacejava.lang.Cloneable...interfacejava.iointerfacejava.lang.Cloneable...interfaJAVA.LANGAgnal.avajgnal..LANGgnal.avArrclass java.lang.ObjectyListArrclass java.lang.ObjectyListAinterfacejava.lang.Cloneable...interfacejava.iointerfacejava.lang.Cloneable...interfacejava.iointerfacejava.lang.Cloneable...interfacejava.iointerfacejava.lang.Cloneable...interfacejava.iointerfacejava.lang.Cloneable...interfacejava.iointerfacejava.lang.Cloneable...interfacejava.iointerfacejava.lang.Cloneable...interfacejava.iointerfacejava.lang.Cloneable...interfac");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test35502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest71.test35502");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphaSpace((java.lang.CharSequence) "Aaa    aaa");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test35503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest71.test35503");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.swapCase("irfCo.irfioSrAaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "IRFcO.IRFIOsRaAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA" + "'", str1, "IRFcO.IRFIOsRaAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA");
    }

    @Test
    public void test35504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest71.test35504");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.difference("", "tS.gnal.avaj################################");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "tS.gnal.avaj################################" + "'", str2, "tS.gnal.avaj################################");
    }

    @Test
    public void test35505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest71.test35505");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.leftPad("java.lang.Stringclass... java.lang.Stringclass ...", 924);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                          java.lang.Stringclass... java.lang.Stringclass ..." + "'", str2, "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                          java.lang.Stringclass... java.lang.Stringclass ...");
    }

    @Test
    public void test35506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest71.test35506");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfIgnoreCase("..#y....iiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiii$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$iiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiii$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$iiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiii$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$iiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiii$$$$$$$$$$$$$$$$$$$$$$$", "javaaaaaaaaaavvsaylavvsaylavvsaylavvsaylavvsaylavvsaylavvsaylavvsaylavvsaylavvsaylavvsaylavvsaylavvsaylav");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test35507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest71.test35507");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphaSpace((java.lang.CharSequence) "sa.lass.Cl");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test35508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest71.test35508");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.leftPad("", 206, "etyBetyBetyBetyBetyBetyBAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA...etyBetyBetyBetyBetyBetyBestststststststststststststststststststststststststststststststststststststststststststststststststststststststststststststststststststststststststststststststststststststststststststststststststststststststststststststststststststststststststststststststststststststststststststststststststststststststststststststststststststststststststststststststststststststststststststststststststststststststststststststststststststststststststststststststststststststststststststststststststststststststststststststststststststststststststststststststststststststststststststststst");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "etyBetyBetyBetyBetyBetyBAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA...etyBetyBetyBetyBetyBetyBestststststststststststststststststststststststststststststststststststststststststststststststststststststststststststs" + "'", str3, "etyBetyBetyBetyBetyBetyBAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA...etyBetyBetyBetyBetyBetyBestststststststststststststststststststststststststststststststststststststststststststststststststststststststststststs");
    }

    @Test
    public void test35509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest71.test35509");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.rightPad("GNALUAVAJ                       GNALUAVAJ                       SSALCGNALAVAJavajlitu", 540, "yyyyyyyyyaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa                                              ][gnirtslitu.avaj1-yyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyy");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "GNALUAVAJ                       GNALUAVAJ                       SSALCGNALAVAJavajlituyyyyyyyyyaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa                                              ][gnirtslitu.avaj1" + "'", str3, "GNALUAVAJ                       GNALUAVAJ                       SSALCGNALAVAJavajlituyyyyyyyyyaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa                                              ][gnirtslitu.avaj1");
    }

    @Test
    public void test35510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest71.test35510");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.difference("AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA", "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test35511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest71.test35511");
        char[] charArray14 = new char[] { ' ', ' ', '#', 'a', '4', 'a' };
        int int15 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "", charArray14);
        boolean boolean16 = org.apache.commons.lang3.StringUtils.containsAny("$", charArray14);
        boolean boolean17 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "...       AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA...       AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA...       AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA...       AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA...       AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA...       AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA...       AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA...       AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA...       AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA...       AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA", charArray14);
        boolean boolean18 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "java.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.lang", charArray14);
        boolean boolean19 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "JAVAULANG", charArray14);
        boolean boolean20 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "gnirtS.gnal.avaj ssalc", charArray14);
        boolean boolean21 = org.apache.commons.lang3.StringUtils.containsAny("                                                                                                                                                                                                                               arjavaarrarjavaarrarjavaarrarjavaarrarjavaarrarjavaarrarjavaarrarjavaarrarjavaarrarjavaarrarjavaarrarjavaarrarjavaarrarjavaarrarjavaarrarjavaarrarjavaarrarjavaarrarjavaarrarjavaarrarjavaarrarjavaarrarjavaarrarjavaarrarjavaarrarjavaarrarjavaarrarjavaarrarjavaarrarjavaarrarjavaarrarjavaarrarjavaarrarjavaarrarjavaarrarjavaarrarjavaarrarjavaarrarjavaarrarjavaarrarjavaarrarjavaarrarjavaarrarjavaarrarjavaarrarjavaarrarjavaarrarjavaarrarjavaarrarjavaarrarjavaarrarjavaarrarjalass java.lang.string                                                                                                                                                                                                                               ", charArray14);
        boolean boolean22 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "... ... ... ... ... ... ... ...                                                             ", charArray14);
        org.junit.Assert.assertNotNull(charArray14);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray14), "  #a4a");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray14), "  #a4a");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray14), "[ ,  , #, a, 4, a]");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
    }

    @Test
    public void test35512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest71.test35512");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlpha((java.lang.CharSequence) "AAAAAAAAAAj#v##.#gnAAAAAAAAAAj#v##.#gnAAAAAAAAAAj#v##.#gnAAAAAAAAAAj#v##.#gnAAAAAAAAAAj#v##.#gnAAAAAAAAAAj#v##.#gnAAAAAAAAAAj#v##.#gnAAAAAAAAAAj#v##.#gnAAAAAAAAAAj#v##.#gnAAAAAAAAAAj#v##.#gnAAAAAAAAAAj#v##.#gnAAAAAAAAAAj#v##.#gnAAAAAAAAAAj#                                              AAAAAAAj#v##.#gnAAAAAAAAAAj#v##.#gnAAAAAAAAAAj#v##.#gnAAAAAAAAAAj#v##.#gnAAAAAAAAAAj#v##.#gnAAAAAAAAAAj#v##.#gnAAAAAAAAAAj#v##.#gnAAAAAAAAAAj#v##.#gnAAAAAAAAAAj#v##.#gnAAAAAAAAAAj#v##.#gnAAAAAAAAAAj#v##.#gnAAAAAAAAAAj#v##.#gnAAAAAAAAAAring");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test35513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest71.test35513");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlpha((java.lang.CharSequence) "...O.gnal.avaj ssalcrrAtsiLytcejbO.gnal.avaj ssalcrrAva.langGNAL..langjava.langAGNAL.AVAJ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test35514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest71.test35514");
        java.lang.ClassLoader classLoader0 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass2 = org.apache.commons.lang3.ClassUtils.getClass(classLoader0, "...AAAAhhh4AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAhhh4AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAhhh4AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAhhh4AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAhhh4AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA");
            org.junit.Assert.fail("Expected exception of type java.lang.ClassNotFoundException; message: ///AAAAhhh4AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAhhh4AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAhhh4AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAhhh4AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAhhh4AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA");
        } catch (java.lang.ClassNotFoundException e) {
            // Expected exception.
        }
    }

    @Test
    public void test35515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest71.test35515");
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("JAVA.LANG", '#');
        java.lang.String[] strArray8 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("javal#.#agn", "va.lang.Cl", 159);
        java.lang.String str9 = org.apache.commons.lang3.StringUtils.replaceEachRepeatedly("", strArray4, strArray8);
        java.lang.String[] strArray12 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("STRINGUTILS", "hi!arr...");
        java.lang.String str13 = org.apache.commons.lang3.StringUtils.replaceEachRepeatedly("gnal.avajgnal..LANGgnal.avajgnal", strArray8, strArray12);
        java.lang.String[] strArray14 = org.apache.commons.lang3.StringUtils.stripAll(strArray8);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNotNull(strArray12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "gnal.avajgnal..LANGgnal.avajgnal" + "'", str13, "gnal.avajgnal..LANGgnal.avajgnal");
        org.junit.Assert.assertNotNull(strArray14);
    }

    @Test
    public void test35516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest71.test35516");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isEmpty((java.lang.CharSequence) "4444444444444444444444");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test35517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest71.test35517");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.chop("JavaStringnalArrayListArrayListArrainterface java.lang.Cloneable44444444444444444444444444444444444444444444444444interface java.io.Serializable");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "JavaStringnalArrayListArrayListArrainterface java.lang.Cloneable44444444444444444444444444444444444444444444444444interface java.io.Serializabl" + "'", str1, "JavaStringnalArrayListArrayListArrainterface java.lang.Cloneable44444444444444444444444444444444444444444444444444interface java.io.Serializabl");
    }

    @Test
    public void test35518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest71.test35518");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.split("Avaj.gnal", "AtsiLytcejbO.gnal.avaj ssalcrrAtsiLytcejbO.gnal.avaj ssalcrrAva.langGNAL..langjava.langAGNAL.AVAJAtsiLytcejbO.gnal.avaj ssalcrrAtsiLytcejbO.gnal.avaj ssalcrrAva.langGNAL..langjava.langAGNAL.AVAJAtsiLytcejbO.gnal.avaj ssalcrrAtsiLytcejbO.gnal.avaj ssalcrrAva.langGNAL..langjava.langAGNAL.AVAJAtsiLytcejbO.gnal.avaj ssalcrrAtsiLytcejStringAtsiLytcejbO.gnal.avaj ssalcrrAtsiLytcejbO.gnal.avaj ssalcrrAva.langGNAL..langjava.langAGNAL.AVAJAtsiLytcejbO.gnaaaaaa...");
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test35519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest71.test35519");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.stripStart("AAAA                       JAVAULANGrrayList", "ssal$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$rrayList$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$C                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                             ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "AAAA                       JAVAULANGrrayList" + "'", str2, "AAAA                       JAVAULANGrrayList");
    }

    @Test
    public void test35520() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest71.test35520");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.chomp("GNIRT", ".........java..........java...........");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "GNIRT" + "'", str2, "GNIRT");
    }

    @Test
    public void test35521() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest71.test35521");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.abbreviate("...AAAAAAAAAA... AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA... AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA... AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA... AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA... AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA", 620);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "...AAAAAAAAAA... AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA... AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA... AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA... AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA... AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA" + "'", str2, "...AAAAAAAAAA... AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA... AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA... AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA... AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA... AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA");
    }

    @Test
    public void test35522() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest71.test35522");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.chomp("A                                      .A Lya", ".gnirts");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "A                                      .A Lya" + "'", str2, "A                                      .A Lya");
    }

    @Test
    public void test35523() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest71.test35523");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitByCharacterType("st");
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test35524() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest71.test35524");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("........................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................", "AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA$AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA$AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA$AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA$AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA$AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA$AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA$AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA$AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA$AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA");
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test35525() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest71.test35525");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substring("hi!ArrayListArrayListArrayListavaj....1AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA...1AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA...1AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA...1AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA...1AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA...1AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA...1AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA...1AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA...1AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA...1AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA", 386);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "AAAAAAAAAAAAAAAAAAAAAAAAA...1AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA...1AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA...1AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA...1AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA...1AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA...1AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA" + "'", str2, "AAAAAAAAAAAAAAAAAAAAAAAAA...1AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA...1AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA...1AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA...1AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA...1AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA...1AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA");
    }

    @Test
    public void test35526() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest71.test35526");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.contains(".............java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........", 3);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test35527() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest71.test35527");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsIgnoreCase("y..............................ObjectyList..............................O", "444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444INTERFACE JAVA.LANG.CLONEABLE4IGNIRTINTERFACE JAVA.LANG");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test35528() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest71.test35528");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isWhitespace((java.lang.CharSequence) "LANGaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa       44444444444444444444444444...");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test35529() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest71.test35529");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.split("Arra", '.');
        java.lang.String[] strArray5 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens(".......");
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray5, ' ');
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.replaceEach("interface java.lang.Cloneable.......java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........javainterface java.io.Serializab", strArray3, strArray5);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "......." + "'", str7, ".......");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "interface java.lang.Cloneable.......java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........javainterface java.io.Serializab" + "'", str8, "interface java.lang.Cloneable.......java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........javainterface java.io.Serializab");
    }

    @Test
    public void test35530() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest71.test35530");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceChars("ARRAYLISTARRAYLISTARRAYLISTARRAYLISTARRAYLISTARRAYLISTARRAYLISTARRAYLISTARRAYLISTARRAYLISTARRAYLISTARRAYLISTARRAYLISTARRAYLISTARRAYLISTARRAYLISTARRAYLISTARRAYLISTARRAYLISTARRAYLISTARRAYLISTARRAYLISTARRAYLISTARRAYLISTARRAYLISTARRAYLISTARRAYLISTARRAYLISTARRAYLISTARRAYLISTARRAYLISTARRAYLISTARRAYLISTARRAYLISTARRAYLISTARRAYLISTARRAYLISTARRAYLISTARRAYLIST", 'a', 'a');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "ARRAYLISTARRAYLISTARRAYLISTARRAYLISTARRAYLISTARRAYLISTARRAYLISTARRAYLISTARRAYLISTARRAYLISTARRAYLISTARRAYLISTARRAYLISTARRAYLISTARRAYLISTARRAYLISTARRAYLISTARRAYLISTARRAYLISTARRAYLISTARRAYLISTARRAYLISTARRAYLISTARRAYLISTARRAYLISTARRAYLISTARRAYLISTARRAYLISTARRAYLISTARRAYLISTARRAYLISTARRAYLISTARRAYLISTARRAYLISTARRAYLISTARRAYLISTARRAYLISTARRAYLISTARRAYLIST" + "'", str3, "ARRAYLISTARRAYLISTARRAYLISTARRAYLISTARRAYLISTARRAYLISTARRAYLISTARRAYLISTARRAYLISTARRAYLISTARRAYLISTARRAYLISTARRAYLISTARRAYLISTARRAYLISTARRAYLISTARRAYLISTARRAYLISTARRAYLISTARRAYLISTARRAYLISTARRAYLISTARRAYLISTARRAYLISTARRAYLISTARRAYLISTARRAYLISTARRAYLISTARRAYLISTARRAYLISTARRAYLISTARRAYLISTARRAYLISTARRAYLISTARRAYLISTARRAYLISTARRAYLISTARRAYLISTARRAYLIST");
    }

    @Test
    public void test35531() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest71.test35531");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.abbreviate("ARR... AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA... AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA... AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA... AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA... AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA... AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA... AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA... AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA... AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA..", 95, 501);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "...AA... AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA... AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA... AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA... AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA... AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA... AAAAAAAAAAAAAAAAAAA..." + "'", str3, "...AA... AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA... AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA... AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA... AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA... AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA... AAAAAAAAAAAAAAAAAAA...");
    }

    @Test
    public void test35532() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest71.test35532");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitByCharacterType("                                                                                                                                                                        h!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ihLITU.AVAJ                                                                                                                                                                        ");
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test35533() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest71.test35533");
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.overlay("...    $         $         $         $         $         $         $         $         $         $         $         $         $         $         $ ...", "-1JAVA.UTILsTRING-1JAVA.UTILsTRING", 717, 54);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "...    $         $         $         $         $      -1JAVA.UTILsTRING-1JAVA.UTILsTRING" + "'", str4, "...    $         $         $         $         $      -1JAVA.UTILsTRING-1JAVA.UTILsTRING");
    }

    @Test
    public void test35534() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest71.test35534");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.leftPad("GNALUAVAJGNALUAVAJGNALUAVAJGNALUAVAJGNALUAVAJGNALUAVAJGNALUAVAJGNALUAVAJGNALUAVAJGNALUAVAJGNALUAVAJGNALUAVAJGNALUAVAJGNALUAVAJGNALUAVAJGNALUAVAJGNALUAVAJGNALUAVAJGNALUAVAJGNALUAVAJSSALCGNALAVAJSSALC                                                                                                                                                                                                                                                                                                                                                                                          ", 446);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "GNALUAVAJGNALUAVAJGNALUAVAJGNALUAVAJGNALUAVAJGNALUAVAJGNALUAVAJGNALUAVAJGNALUAVAJGNALUAVAJGNALUAVAJGNALUAVAJGNALUAVAJGNALUAVAJGNALUAVAJGNALUAVAJGNALUAVAJGNALUAVAJGNALUAVAJGNALUAVAJSSALCGNALAVAJSSALC                                                                                                                                                                                                                                                                                                                                                                                          " + "'", str2, "GNALUAVAJGNALUAVAJGNALUAVAJGNALUAVAJGNALUAVAJGNALUAVAJGNALUAVAJGNALUAVAJGNALUAVAJGNALUAVAJGNALUAVAJGNALUAVAJGNALUAVAJGNALUAVAJGNALUAVAJGNALUAVAJGNALUAVAJGNALUAVAJGNALUAVAJGNALUAVAJSSALCGNALAVAJSSALC                                                                                                                                                                                                                                                                                                                                                                                          ");
    }

    @Test
    public void test35535() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest71.test35535");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "...444444.444444444444444444...44444444444444444.444444444444444444...44444$aenolc.gnaelbagaga.langagaga.langagaga.langagaga.langagaga.langagaga.langagaga.langagaga.langagaga.langagaga.langagaga.langagaga.langagaga.langagaga.langagaga.langagaga.langagaga.langagaga.langagaga.langagaga.langagaga.langagaga.langagaga.langagaga.langagaga.langagaga.langagaga.langagaga.langagaga.langagaga.langagaga.langagaga.langagaga.langagaga.langagaga.langafretnigniragecagaoi.aenolc.gnaelbagaga.langagaga.langagaga.langagaga.langagaga.langagaga.langagaga.langagaga.langagaga.langagaga.langagaga.langagaga.langagaga.langagaga.langagaga.langagaga.langagaga.langagaga.langagaga.langagaga.langagaga.langagaga.langagaga.langagaga.langagaga.langagaga.langagaga.langagaga.langagaga.langagaga.langagaga.langagaga.langagaga.langagaga.langagaga.langafretnigniragecagaoi.aenolc.gnaelb", "$$$$$$$$$$$$$$$$$$$$$$$$$$$$$aaa                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                         ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test35536() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest71.test35536");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.defaultString("INTERFACEJAVA.LANG.CLONEABLEINTERFACEJAVA.LANG.CLONEABLELANG.GNALJAVA.LANGAVAJ.GNALJAVA.LANGAVAJ.GNALJAVA.LANGAVAJ.GNALJAVA.LANGAVAJ.GNALJAVA.LANGAVAJ.GNALJAVA.LANGAVAJ.GNALJAVA.LANGAVAJ.GNALJAVA.LANGAVAJ.JAVAINTERFACEJAVA.IO.SERIALIZABLEINTERFACEJAVA.IO");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "INTERFACEJAVA.LANG.CLONEABLEINTERFACEJAVA.LANG.CLONEABLELANG.GNALJAVA.LANGAVAJ.GNALJAVA.LANGAVAJ.GNALJAVA.LANGAVAJ.GNALJAVA.LANGAVAJ.GNALJAVA.LANGAVAJ.GNALJAVA.LANGAVAJ.GNALJAVA.LANGAVAJ.GNALJAVA.LANGAVAJ.JAVAINTERFACEJAVA.IO.SERIALIZABLEINTERFACEJAVA.IO" + "'", str1, "INTERFACEJAVA.LANG.CLONEABLEINTERFACEJAVA.LANG.CLONEABLELANG.GNALJAVA.LANGAVAJ.GNALJAVA.LANGAVAJ.GNALJAVA.LANGAVAJ.GNALJAVA.LANGAVAJ.GNALJAVA.LANGAVAJ.GNALJAVA.LANGAVAJ.GNALJAVA.LANGAVAJ.GNALJAVA.LANGAVAJ.JAVAINTERFACEJAVA.IO.SERIALIZABLEINTERFACEJAVA.IO");
    }

    @Test
    public void test35537() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest71.test35537");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBefore("", "VA.LANGAVAJ.GNALJAVA.LANGAVAJ.GNALJAVA.LANGAVAJ.GNALJAVA.LANGAVAJ.GNALJAVA.LANGAVAJ.GNALJAVA.LANG");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test35538() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest71.test35538");
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA       ", "VAJ.GNAL");
        java.lang.String[] strArray7 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("", "class java.lang.Class");
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.replaceEach("$       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $", strArray4, strArray7);
        java.lang.Class<?>[] wildcardClassArray9 = org.apache.commons.lang3.ClassUtils.toClass((java.lang.Object[]) strArray7);
        int int10 = org.apache.commons.lang3.StringUtils.indexOfAny("TU                    ", strArray7);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "$       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $" + "'", str8, "$       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $");
        org.junit.Assert.assertNotNull(wildcardClassArray9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
    }

    @Test
    public void test35539() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest71.test35539");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.remove("elbazilaireS.oi.avaj ecafretniavaj..........avaj..........avaj..........avaj..........avaj..........avaj..........avaj..........avaj..........avaj..........avaj..........avaj..........avaj..........avaj..........avaj..........avaj..........avaj..........avaj..........avaj..........avaj..........avaj..........avaj..........avaj..........avaj..........avaj..........avaj..........avaj..........avaj..........avaj..........avaj..........avaj..........avaj..........avaj..........avaj..........avaj..........avaj", "...aaaaaaaaj v aaaaaaaaaaj v aaaaaaaaaaj v interf ceaj v aioaSeri liz ble");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "elbazilaireS.oi.avaj ecafretniavaj..........avaj..........avaj..........avaj..........avaj..........avaj..........avaj..........avaj..........avaj..........avaj..........avaj..........avaj..........avaj..........avaj..........avaj..........avaj..........avaj..........avaj..........avaj..........avaj..........avaj..........avaj..........avaj..........avaj..........avaj..........avaj..........avaj..........avaj..........avaj..........avaj..........avaj..........avaj..........avaj..........avaj..........avaj" + "'", str2, "elbazilaireS.oi.avaj ecafretniavaj..........avaj..........avaj..........avaj..........avaj..........avaj..........avaj..........avaj..........avaj..........avaj..........avaj..........avaj..........avaj..........avaj..........avaj..........avaj..........avaj..........avaj..........avaj..........avaj..........avaj..........avaj..........avaj..........avaj..........avaj..........avaj..........avaj..........avaj..........avaj..........avaj..........avaj..........avaj..........avaj..........avaj..........avaj");
    }

    @Test
    public void test35540() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest71.test35540");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.center("interfSerializablece jSerializablevSerializable.lSerializableng.cloneSerializableble", 502);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                                                                                                                                                                                                 interfSerializablece jSerializablevSerializable.lSerializableng.cloneSerializableble                                                                                                                                                                                                                 " + "'", str2, "                                                                                                                                                                                                                 interfSerializablece jSerializablevSerializable.lSerializableng.cloneSerializableble                                                                                                                                                                                                                 ");
    }

    @Test
    public void test35541() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest71.test35541");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNotBlank((java.lang.CharSequence) "CloneableInea");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test35542() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest71.test35542");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.defaultIfBlank("gnal.avaj ecafretni", "elbazilaireS.......java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........javanignirtSelbaenolC.gnal.avaj ecafretni");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "gnal.avaj ecafretni" + "'", str2, "gnal.avaj ecafretni");
    }

    @Test
    public void test35543() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest71.test35543");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.rightPad("        jvl#.#gn       ", (int) (short) -1, "java.lang.stringclass java.lang.stringclass java.lang.stringclas.lang.stringclass java.lang.stringc");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "        jvl#.#gn       " + "'", str3, "        jvl#.#gn       ");
    }

    @Test
    public void test35544() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest71.test35544");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.abbreviate("$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$nterface java.lang.Cloneable.......java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........javainterface java.io.Serializabl", 99);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$..." + "'", str2, "$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$...");
    }

    @Test
    public void test35545() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest71.test35545");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("                     44444444444444444444-1java444444444444444444444                      ", "Li", 45);
        java.lang.Class<?>[] wildcardClassArray4 = org.apache.commons.lang3.ClassUtils.toClass((java.lang.Object[]) strArray3);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertNotNull(wildcardClassArray4);
    }

    @Test
    public void test35546() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest71.test35546");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.split("                                              ");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.stripAll(strArray1, "....................................................................                       javaulang");
        java.lang.Class<?>[] wildcardClassArray4 = org.apache.commons.lang3.ClassUtils.toClass((java.lang.Object[]) strArray3);
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertNotNull(wildcardClassArray4);
    }

    @Test
    public void test35547() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest71.test35547");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBefore("interface javalangCloneableainterface java.io.Serializable", "...       ....       .java.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.lang...       ....       .java.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.lang...       ....       .java.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.lang...       ....       .java.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.lang...       ....       .java.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.lang...       ....       .");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "interface javalangCloneableainterface java.io.Serializable" + "'", str2, "interface javalangCloneableainterface java.io.Serializable");
    }

    @Test
    public void test35548() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest71.test35548");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.abbreviateMiddle("langagnaljavaalangavajagnaljavaalangavajagnaljavaalangavajagnaljavaa", "lyrrtsilyrrtsilyrrlng.jvtsilyrrtsilyrrtsilyrrlngnirtsvj", 942);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "langagnaljavaalangavajagnaljavaalangavajagnaljavaalangavajagnaljavaa" + "'", str3, "langagnaljavaalangavajagnaljavaalangavajagnaljavaalangavajagnaljavaa");
    }

    @Test
    public void test35549() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest71.test35549");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceChars("...                                              ", '.', 'a');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "aaa                                              " + "'", str3, "aaa                                              ");
    }

    @Test
    public void test35550() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest71.test35550");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.repeat("tringcla", 51);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "tringclatringclatringclatringclatringclatringclatringclatringclatringclatringclatringclatringclatringclatringclatringclatringclatringclatringclatringclatringclatringclatringclatringclatringclatringclatringclatringclatringclatringclatringclatringclatringclatringclatringclatringclatringclatringclatringclatringclatringclatringclatringclatringclatringclatringclatringclatringclatringclatringclatringclatringcla" + "'", str2, "tringclatringclatringclatringclatringclatringclatringclatringclatringclatringclatringclatringclatringclatringclatringclatringclatringclatringclatringclatringclatringclatringclatringclatringclatringclatringclatringclatringclatringclatringclatringclatringclatringclatringclatringclatringclatringclatringclatringclatringclatringclatringclatringclatringclatringclatringclatringclatringclatringclatringclatringcla");
    }

    @Test
    public void test35551() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest71.test35551");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.remove("-1java.utilString[]-1java.utilString[]-1java.utilString[]-1java.utilString[]-1java.utilString[]-1java.utilString[]-1java.utilString[]-1java.utilString[]-1java.utilString[]-1java.utilString[]-1$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$gnal", '$');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "-1java.utilString[]-1java.utilString[]-1java.utilString[]-1java.utilString[]-1java.utilString[]-1java.utilString[]-1java.utilString[]-1java.utilString[]-1java.utilString[]-1java.utilString[]-1gnal" + "'", str2, "-1java.utilString[]-1java.utilString[]-1java.utilString[]-1java.utilString[]-1java.utilString[]-1java.utilString[]-1java.utilString[]-1java.utilString[]-1java.utilString[]-1java.utilString[]-1gnal");
    }

    @Test
    public void test35552() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest71.test35552");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitByCharacterTypeCamelCase("              Integer              ");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray1, '$');
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "              $Integer$              " + "'", str3, "              $Integer$              ");
    }

    @Test
    public void test35553() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest71.test35553");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNotEmpty((java.lang.CharSequence) "4444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444rclass java.lang.O...");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test35554() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest71.test35554");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.rightPad("REGETNi", 16);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "REGETNi         " + "'", str2, "REGETNi         ");
    }

    @Test
    public void test35555() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest71.test35555");
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.overlay("                                               $$$$JAVAL.AGN$$$$$$$$$$JAVAL.AGN$$$$$$$$$$JA", "ARJAVAARR", 487, 240);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "                                               $$$$JAVAL.AGN$$$$$$$$$$JAVAL.AGN$$$$$$$$$$JAARJAVAARR" + "'", str4, "                                               $$$$JAVAL.AGN$$$$$$$$$$JAVAL.AGN$$$$$$$$$$JAARJAVAARR");
    }

    @Test
    public void test35556() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest71.test35556");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "...444444.444444444444444444...                                 44444444444444444.444444444444444444...                                 44444$        ", "java");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test35557() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest71.test35557");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("String");
        java.lang.String[] strArray9 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("...", "avaj.gnal", (int) 'a');
        boolean boolean10 = org.apache.commons.lang3.StringUtils.startsWithAny("", strArray9);
        int int11 = org.apache.commons.lang3.StringUtils.indexOfAny("java.lang", strArray9);
        java.lang.String[] strArray15 = new java.lang.String[] { "                                   " };
        java.lang.String str16 = org.apache.commons.lang3.StringUtils.getCommonPrefix(strArray15);
        int int17 = org.apache.commons.lang3.StringUtils.indexOfAny("", strArray15);
        boolean boolean18 = org.apache.commons.lang3.StringUtils.endsWithAny("INTEGER", strArray15);
        java.lang.String str19 = org.apache.commons.lang3.StringUtils.replaceEachRepeatedly("Avaj.gnal", strArray9, strArray15);
        java.lang.String[] strArray20 = org.apache.commons.lang3.StringUtils.stripAll(strArray9);
        java.lang.String str21 = org.apache.commons.lang3.StringUtils.replaceEach("...AVAJ.GNALJAVA.LANGAVAJ.GNALJAVA.LANGgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgna...", strArray2, strArray9);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertNotNull(strArray9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertNotNull(strArray15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "                                   " + "'", str16, "                                   ");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "Avaj.gnal" + "'", str19, "Avaj.gnal");
        org.junit.Assert.assertNotNull(strArray20);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "...AVAJ.GNALJAVA.LANGAVAJ.GNALJAVA.LANGgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgna..." + "'", str21, "...AVAJ.GNALJAVA.LANGAVAJ.GNALJAVA.LANGgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgna...");
    }

    @Test
    public void test35558() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest71.test35558");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.abbreviate("NG", 77, 620);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "NG" + "'", str3, "NG");
    }

    @Test
    public void test35559() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest71.test35559");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replace("elbazilaireS.oi.avaj ecafretniavaj..........avatcejbO.......avaj.......elbaenolC.gnal.avaj ecafretni444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444", "A..yL A.44444444444444444444444444", "$         $         $         $         $         $         $         $         $         $         $         $         $         $         $         $         $         $         $         $         $         $         $         $         $         $         $         $         $         $         $         $         $         $         $         $");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "elbazilaireS.oi.avaj ecafretniavaj..........avatcejbO.......avaj.......elbaenolC.gnal.avaj ecafretni444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444" + "'", str3, "elbazilaireS.oi.avaj ecafretniavaj..........avatcejbO.......avaj.......elbaenolC.gnal.avaj ecafretni444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444");
    }

    @Test
    public void test35560() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest71.test35560");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("VA.LANGAVAJ.GNALJAVA.LANGAVAJ.GNALJAVA.LANGAVAJ.GNALJAVA.LANGAVAJ.GNALJAVA.LANGAVAJ.GNALJAVA.....", ' ');
        boolean boolean4 = org.apache.commons.lang3.StringUtils.startsWithAny("lCass", strArray3);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test35561() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest71.test35561");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeStart("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa...1aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa...1aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa...1aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa...1aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa...1aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa...1aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa...1aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa...1aaaaaaaaaaaaaaaaaaaaaaaaa", "javal4.4agn");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa...1aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa...1aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa...1aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa...1aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa...1aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa...1aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa...1aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa...1aaaaaaaaaaaaaaaaaaaaaaaaa" + "'", str2, "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa...1aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa...1aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa...1aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa...1aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa...1aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa...1aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa...1aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa...1aaaaaaaaaaaaaaaaaaaaaaaaa");
    }

    @Test
    public void test35562() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest71.test35562");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass1 = org.apache.commons.lang3.ClassUtils.getClass("...O.gnal.avaj ssalcr4444444444444444444444444444444444444444444444444444444444444444444444444444444aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
            org.junit.Assert.fail("Expected exception of type java.lang.ClassNotFoundException; message: ///O/gnal/avajssalcr4444444444444444444444444444444444444444444444444444444444444444444444444444444aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        } catch (java.lang.ClassNotFoundException e) {
            // Expected exception.
        }
    }

    @Test
    public void test35563() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest71.test35563");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("...AAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval", "...jbO.gnal.avaj ssalcrrAtsiLytcejb");
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test35564() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest71.test35564");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.endsWith("                                                     ClassJAVA.LANGa...                                                      ", "aa..");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test35565() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest71.test35565");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trimToEmpty("AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA" + "'", str1, "AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA");
    }

    @Test
    public void test35566() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest71.test35566");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBeforeLast("VAJ.GNALAAAAAAAAAAAAAAAAAAAjavaulangAAAAAAAAAAAAAAAAAAAVAJ.GNALAAAAAAAAAAAAAAAAAAAjavaulangAAAAAAAAAAAAAAAAAAAVAJ.GNALAAAAAAAAAAAAAAAAAAAjavaulangAAAAAAAAAAAAAAAAAAAVAJ.GNALAAAAAAAAAAAAAAAAAAAjavaulangAAAAAAAAAAAAAAAAAAAVAJ.GNAL", "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                 ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "VAJ.GNALAAAAAAAAAAAAAAAAAAAjavaulangAAAAAAAAAAAAAAAAAAAVAJ.GNALAAAAAAAAAAAAAAAAAAAjavaulangAAAAAAAAAAAAAAAAAAAVAJ.GNALAAAAAAAAAAAAAAAAAAAjavaulangAAAAAAAAAAAAAAAAAAAVAJ.GNALAAAAAAAAAAAAAAAAAAAjavaulangAAAAAAAAAAAAAAAAAAAVAJ.GNAL" + "'", str2, "VAJ.GNALAAAAAAAAAAAAAAAAAAAjavaulangAAAAAAAAAAAAAAAAAAAVAJ.GNALAAAAAAAAAAAAAAAAAAAjavaulangAAAAAAAAAAAAAAAAAAAVAJ.GNALAAAAAAAAAAAAAAAAAAAjavaulangAAAAAAAAAAAAAAAAAAAVAJ.GNALAAAAAAAAAAAAAAAAAAAjavaulangAAAAAAAAAAAAAAAAAAAVAJ.GNAL");
    }

    @Test
    public void test35567() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest71.test35567");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass1 = org.apache.commons.lang3.ClassUtils.getClass("class [Ljava.lang.Class;");
            org.junit.Assert.fail("Expected exception of type java.lang.ClassNotFoundException; message: class[Ljava/lang/Class;");
        } catch (java.lang.ClassNotFoundException e) {
            // Expected exception.
        }
    }

    @Test
    public void test35568() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest71.test35568");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.normalizeSpace("interfacejava.lang.Cloneable.......java.......Objectava..........javainterfacejava.io.Serializable");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "interfacejava.lang.Cloneable.......java.......Objectava..........javainterfacejava.io.Serializable" + "'", str1, "interfacejava.lang.Cloneable.......java.......Objectava..........javainterfacejava.io.Serializable");
    }

    @Test
    public void test35569() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest71.test35569");
        java.lang.String str1 = org.apache.commons.lang3.ClassUtils.getPackageName("atsiLytcejbO.gnal.avaj ssalcrrAtsiLytcejbO.gnal.avaj ssalcrrAva.langGNAL..langjava.langAGNAL.AVAJAtsiLytcejbO.gnal.avaj ssalcrrAtsiLytcejbO.gnal.avaj ssalcrrAva.langGNAL..langjava.langAGNAL.AVAJAtsiLytcejbO.gnal.avaj ssalcrrAtsiLytcejbO.gnal.avaj ssalcrrAva.langGNAL..langjava.langAGNAL.AVAJAtsiLytcejbO.gnal.avaj ssalcrrAtsiLytcejStringAtsiLytcejbO.gnal.avaj ssalcrrAtsiLytcejbO.gnal.avaj ssalcrrAva.langGNAL..langjava.langAGNAL.AVAJAtsiLytcejbO.gnal.avaj ssalcrrAtsiLytcejbO.gnal.avaj ssalcrrAva.langGNAL..langjava.langAGNAL.AVAJAtsiLytcejbO.gnal.avaj ssalcrrAtsiLytcejbO.gnal.avaj ssalcrrAva.langGNAL..langjava.langAGNAL.AVAJAtsiLytcejbO.gnal.avaj ssalcrrAtsiLytcejb");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "atsiLytcejbO.gnal.avaj ssalcrrAtsiLytcejbO.gnal.avaj ssalcrrAva.langGNAL..langjava.langAGNAL.AVAJAtsiLytcejbO.gnal.avaj ssalcrrAtsiLytcejbO.gnal.avaj ssalcrrAva.langGNAL..langjava.langAGNAL.AVAJAtsiLytcejbO.gnal.avaj ssalcrrAtsiLytcejbO.gnal.avaj ssalcrrAva.langGNAL..langjava.langAGNAL.AVAJAtsiLytcejbO.gnal.avaj ssalcrrAtsiLytcejStringAtsiLytcejbO.gnal.avaj ssalcrrAtsiLytcejbO.gnal.avaj ssalcrrAva.langGNAL..langjava.langAGNAL.AVAJAtsiLytcejbO.gnal.avaj ssalcrrAtsiLytcejbO.gnal.avaj ssalcrrAva.langGNAL..langjava.langAGNAL.AVAJAtsiLytcejbO.gnal.avaj ssalcrrAtsiLytcejbO.gnal.avaj ssalcrrAva.langGNAL..langjava.langAGNAL.AVAJAtsiLytcejbO.gnal" + "'", str1, "atsiLytcejbO.gnal.avaj ssalcrrAtsiLytcejbO.gnal.avaj ssalcrrAva.langGNAL..langjava.langAGNAL.AVAJAtsiLytcejbO.gnal.avaj ssalcrrAtsiLytcejbO.gnal.avaj ssalcrrAva.langGNAL..langjava.langAGNAL.AVAJAtsiLytcejbO.gnal.avaj ssalcrrAtsiLytcejbO.gnal.avaj ssalcrrAva.langGNAL..langjava.langAGNAL.AVAJAtsiLytcejbO.gnal.avaj ssalcrrAtsiLytcejStringAtsiLytcejbO.gnal.avaj ssalcrrAtsiLytcejbO.gnal.avaj ssalcrrAva.langGNAL..langjava.langAGNAL.AVAJAtsiLytcejbO.gnal.avaj ssalcrrAtsiLytcejbO.gnal.avaj ssalcrrAva.langGNAL..langjava.langAGNAL.AVAJAtsiLytcejbO.gnal.avaj ssalcrrAtsiLytcejbO.gnal.avaj ssalcrrAva.langGNAL..langjava.langAGNAL.AVAJAtsiLytcejbO.gnal");
    }

    @Test
    public void test35570() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest71.test35570");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("iNTERFACE JAVA$LANG$cLONEABLE$$$$$$$JAVA$$$$$$$$$$JAVA$$$$$$$$$$JAVA$$$$$$$$$$JAVA$$$$$$$$$$JAVA$$$$$$$$$$JAVA$$$$$$$$$$JAVA$$$$$$$$$$JAVA$$$$$$$$$$JAVA$$$$$$$$$$JAVA", '#');
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.concatWith("lass...", (java.lang.Object[]) strArray3);
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray3, "aaaaaa...                          ", 583, 0);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "iNTERFACE JAVA$LANG$cLONEABLE$$$$$$$JAVA$$$$$$$$$$JAVA$$$$$$$$$$JAVA$$$$$$$$$$JAVA$$$$$$$$$$JAVA$$$$$$$$$$JAVA$$$$$$$$$$JAVA$$$$$$$$$$JAVA$$$$$$$$$$JAVA$$$$$$$$$$JAVA" + "'", str4, "iNTERFACE JAVA$LANG$cLONEABLE$$$$$$$JAVA$$$$$$$$$$JAVA$$$$$$$$$$JAVA$$$$$$$$$$JAVA$$$$$$$$$$JAVA$$$$$$$$$$JAVA$$$$$$$$$$JAVA$$$$$$$$$$JAVA$$$$$$$$$$JAVA$$$$$$$$$$JAVA");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test35571() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest71.test35571");
        int int2 = org.apache.commons.lang3.StringUtils.countMatches("", "$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$#");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test35572() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest71.test35572");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.leftPad("sAitUJAirtSsAitUJAirtSsAitUJAi", 409);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                                                                                                                                                                                                                                                                                                                                                                           sAitUJAirtSsAitUJAirtSsAitUJAi" + "'", str2, "                                                                                                                                                                                                                                                                                                                                                                                           sAitUJAirtSsAitUJAirtSsAitUJAi");
    }

    @Test
    public void test35573() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest71.test35573");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.stripEnd("         ", "RRAYlISTRRAYlISTRRAYlISTAVAJgnl");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "         " + "'", str2, "         ");
    }

    @Test
    public void test35574() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest71.test35574");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripAccents((java.lang.CharSequence) "ETYb                               ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "ETYb                               " + "'", str1, "ETYb                               ");
    }

    @Test
    public void test35575() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest71.test35575");
        int int1 = org.apache.commons.lang3.StringUtils.length((java.lang.CharSequence) ".ioagacegaringinterfagnal.agagagnal.agagagnal.agagagnal.agagagnal.agagagnal.agagagnal.agagagnal.agagagnal.agagagnal.agagagnal.agagagnal.agagagnal.agagagnal.agagagnal.agagagnal.agagagnal.agagagnal.agagagnal.agagagnal.agagagnal.agagagnal.agagagnal.agagagnal.agagagnal.agagagnal.agagagnal.agagagnal.agagagnal.agagagnal.agagagnal.agagagnal.agagagnal.agagagnal.agagagnal.agagableang.clonea");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 384 + "'", int1 == 384);
    }

    @Test
    public void test35576() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest71.test35576");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.split("44444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444interface java.lang.CloneableVAJhi!ArrayLis.       444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444");
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test35577() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest71.test35577");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringAfter("RChahacta", "interface.java.lang.Cloneableclassjavalangclassjavaulangjavaulangjavaulangjavaulangjavaulangjavaulangjavaulangjavaulangjavaulangjavaulangjavaulangjavaulangjavaulangjavaulangjavaulangjavaulangjavaulangjavaulangjavaulangjavaulanginterface.java.io.Serializable");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test35578() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest71.test35578");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("javaulangrraylist", "lass java.lang.string");
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test35579() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest71.test35579");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.rightPad("nterface java.lang.cloneable....$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$galaa$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$", 360);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "nterface java.lang.cloneable....$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$galaa$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$" + "'", str2, "nterface java.lang.cloneable....$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$galaa$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$");
    }

    @Test
    public void test35580() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest71.test35580");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitByCharacterType(".lang.Cloneable4i");
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test35581() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest71.test35581");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.normalizeSpace("...sAitUJAirtSsAitUJAirtSsAitUJAirtSsAitUJAirtSsAitUJAirtSsAitUJAirtSsAitUJAirtSsAitUJAirtSsAitUJAirtS..");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "...sAitUJAirtSsAitUJAirtSsAitUJAirtSsAitUJAirtSsAitUJAirtSsAitUJAirtSsAitUJAirtSsAitUJAirtSsAitUJAirtS.." + "'", str1, "...sAitUJAirtSsAitUJAirtSsAitUJAirtSsAitUJAirtSsAitUJAirtSsAitUJAirtSsAitUJAirtSsAitUJAirtSsAitUJAirtS..");
    }

    @Test
    public void test35582() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest71.test35582");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.split("irfCo.irfioSriiz", "VAJ");
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray2, '$');
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "irfCo.irfioSriiz" + "'", str4, "irfCo.irfioSriiz");
    }

    @Test
    public void test35583() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest71.test35583");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass1 = org.apache.commons.lang3.ClassUtils.getClass("string.");
            org.junit.Assert.fail("Expected exception of type java.lang.ClassNotFoundException; message: string.");
        } catch (java.lang.ClassNotFoundException e) {
            // Expected exception.
        }
    }

    @Test
    public void test35584() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest71.test35584");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.abbreviateMiddle("AAAAAAAAAAAAAAAAAAAAAAAAAA...       AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA...       AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA...       AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA...       AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA...       AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA...       AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA...       AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA...       AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA...       AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA", "INTERFACE JAVA.LANG.cLONEABLEa RRR RRR RRR RRR RRR RRR RRR RRR RRR RRRINTERFACE JAVA.IO.sERIALIZABLE", 89);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "AAAAAAAAAAAAAAAAAAAAAAAAAA...       AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA...       AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA...       AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA...       AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA...       AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA...       AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA...       AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA...       AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA...       AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA" + "'", str3, "AAAAAAAAAAAAAAAAAAAAAAAAAA...       AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA...       AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA...       AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA...       AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA...       AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA...       AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA...       AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA...       AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA...       AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA");
    }

    @Test
    public void test35585() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest71.test35585");
        java.lang.String str2 = org.apache.commons.lang3.ClassUtils.getShortCanonicalName((java.lang.Object) "                         ", "gnirtSlitu.avaj1-gnirtSlitu.avaj1java.litu.avajlitu.avajjava.litu.avajlitu.avajjava.litu.avajlitu.avajjava.litu.avajlitu.avajjava.litu.avajlitu.avajjava.litu.avajlitu.avajjava.litu.avajlitu.avajjava.litu.avajlitu.avajjava.litu.avajlitu.avajjava.litu.avajlitu.avajjava.litu.avajlitu.avajjava.litu.avajlitu.avajjava.litu.avajlitu.avajjava.litu.avajlitu.avajjava.litu.avajlitu.avajjava.litu.avajlitu.avajjava.litu.avajlitu.avajjava.litu.avajlitu.avajjava.litu.avajlitu.avajjava.litu.avajlitu.avajjava.litu.avajlitu.avajjava.litu.avajlitu.avajjava.litu.avajlitu.avajjava.litu.avajlitu.avajjava.litu.avajlitu.avajjava.litu.avajlitu.avajjava.litu.avajlitu.avajjava.litu.avajlitu.avajjava.litu.avajlitu.avajjava.litu.avajlitu.avajjava.litu.avajlitu.avajjava.litu.avajlitu.avajjava.litu.avajlitu.avaj");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "String" + "'", str2, "String");
    }

    @Test
    public void test35586() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest71.test35586");
        char[] charArray10 = new char[] { '$' };
        int int11 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "java.util", charArray10);
        boolean boolean12 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "################################...       AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA", charArray10);
        int int13 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "                      ", charArray10);
        int int14 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "javalitu", charArray10);
        boolean boolean15 = org.apache.commons.lang3.StringUtils.containsAny("AAAAjGNALAAAAAjAAAAAAAAjAGNALAAVAJ", charArray10);
        boolean boolean16 = org.apache.commons.lang3.StringUtils.containsAny("AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA", charArray10);
        int int17 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "h!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ihgn gnal.avaj", charArray10);
        boolean boolean18 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "ARR... AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA... AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA... AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA... AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA... AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA... AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA... AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA... AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA... AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA... AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAYLIST", charArray10);
        int int19 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "rrayLis...VA.LANGAVAJ", charArray10);
        org.junit.Assert.assertNotNull(charArray10);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray10), "$");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray10), "$");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray10), "[$]");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
    }

    @Test
    public void test35587() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest71.test35587");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.center("                                                                                                                                                                                                                                                                                                                                                                                                                 ##################################################java.uti#########################################################################                                                                                                                                                                                                                                                                                                                                                                                                                                                     ", 830);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                                                                                                                                                                                                                                                                                                                                                                                                 ##################################################java.uti#########################################################################                                                                                                                                                                                                                                                                                                                                                                                                                                                     " + "'", str2, "                                                                                                                                                                                                                                                                                                                                                                                                                 ##################################################java.uti#########################################################################                                                                                                                                                                                                                                                                                                                                                                                                                                                     ");
    }

    @Test
    public void test35588() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest71.test35588");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.center("tsilyarrgnaluavaj.tsilyarrgnaluavaj", 570);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                                                                                                                                                                                                                                                           tsilyarrgnaluavaj.tsilyarrgnaluavaj                                                                                                                                                                                                                                                                            " + "'", str2, "                                                                                                                                                                                                                                                                           tsilyarrgnaluavaj.tsilyarrgnaluavaj                                                                                                                                                                                                                                                                            ");
    }

    @Test
    public void test35589() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest71.test35589");
        java.lang.String str1 = org.apache.commons.lang3.ClassUtils.getPackageName("       INTEGER       ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
    }

    @Test
    public void test35590() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest71.test35590");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.chop("                                            Arra                                            ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "                                            Arra                                           " + "'", str1, "                                            Arra                                           ");
    }

    @Test
    public void test35591() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest71.test35591");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.deleteWhitespace("java$.$lang");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "java$.$lang" + "'", str1, "java$.$lang");
    }

    @Test
    public void test35592() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest71.test35592");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.startsWithIgnoreCase("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa                       javaulangrraylist", "...AAAAAAAAAA... AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA... AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA... AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA... AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA... AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test35593() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest71.test35593");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOf("interfacejava.lang.CloneableRFACEJAVA.LANG.CLONEABLEinterfacejava.io.Serializable", 126, 892);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test35594() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest71.test35594");
        java.lang.ClassLoader classLoader0 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass2 = org.apache.commons.lang3.ClassUtils.getClass(classLoader0, "INTERFACE JAVA.LANG.cLONEABLEsTRINGINTERFACE JAVA.IO.sERIALIZABLE");
            org.junit.Assert.fail("Expected exception of type java.lang.ClassNotFoundException; message: INTERFACEJAVA/LANG/cLONEABLEsTRINGINTERFACEJAVA/IO/sERIALIZABLE");
        } catch (java.lang.ClassNotFoundException e) {
            // Expected exception.
        }
    }

    @Test
    public void test35595() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest71.test35595");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.leftPad("IOINTERFACEJAVAIN", (int) (byte) 0, '4');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "IOINTERFACEJAVAIN" + "'", str3, "IOINTERFACEJAVAIN");
    }

    @Test
    public void test35596() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest71.test35596");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.abbreviate("444444444444444444444444444444444444444444444444444444444444444444444TSILYARRA.LA.LANGTSILYARRA.LA.LANGTSILYARRAJAVAAAAAAAAAAVA.LANGAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGA.LANGTSILYARRA.LA.LANGTSILYARRA.LA.LANG", (int) (short) 10);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "4444444..." + "'", str2, "4444444...");
    }

    @Test
    public void test35597() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest71.test35597");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.split("", "rLLryLiyyALLryLiyyALLryLiyyrrrALrAriiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiii", 940);
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void test35598() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest71.test35598");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.rightPad("java.lang$                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                 ", 6, "                                                                                    AVAJ.GNALAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA CHARACTERCHARACTERCHARACTERCHARACTERCHARACTERCHARACTERCHARACTERCHARACTERCHARACTERCHARACTERCHARACTERCHARACTERCHARACTERCHARACTERCHARACTERCHARACTERCHARACTERCHARACTERCHARACTERCHARACTERCHARACTERCHARACTERCHARACTERCHARACTERCHARACTERCHARACTERCHARACTERCHARACTERCHARACTERCHARACTERCHARACTERCHARACTERCHARACTERCHARACTERCHARACTERCHARACTERCHARACTERCHARACTERCHARACTERCHARACTERCHARACTERCHARACTERCHARACTERCHARACTERCHARACTERCHARACTERCHARACTERCHARACTERCHARACTERCHARACTERCHARACTERCHARACTERCHARACTERCHARACTERCHARACTERCHARACTERCHARACTERCHARACTERCHARACTERCHARACTERCHARACTERCHARACTERCHARA                                                                                     ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "java.lang$                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                 " + "'", str3, "java.lang$                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                 ");
    }

    @Test
    public void test35599() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest71.test35599");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripAccents((java.lang.CharSequence) "interface java.lang.CloneableJAVAinterface java.io.Serializable");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "interface java.lang.CloneableJAVAinterface java.io.Serializable" + "'", str1, "interface java.lang.CloneableJAVAinterface java.io.Serializable");
    }

    @Test
    public void test35600() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest71.test35600");
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
        java.lang.Class<?>[] wildcardClassArray17 = org.apache.commons.lang3.ClassUtils.wrappersToPrimitives(wildcardClassArray16);
        java.lang.String[] strArray20 = org.apache.commons.lang3.StringUtils.splitByCharacterType("####");
        java.lang.String str24 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray20, "", 11, (int) (byte) 10);
        java.lang.String[] strArray27 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("AAAAAAAAAA", "javaStrin");
        java.lang.String str28 = org.apache.commons.lang3.StringUtils.replaceEach("interface java.lang.CloneableString[]String[]String[]String[]String[]String[]String[]String[]String[]String[]String[]String[]String[]String[]String[]String[]String[]String[]String[]String[]String[]String[]String[]String[]String[]String[]String[]String[]String[]String[]String[]String[]String[]String[]String[]String[]String[]String[]String[]String[]String[]String[]String[]String[]String[]String[]String[]String[]String[]String[]String[]String[]String[]String[]String[]String[]String[]String[]String[]String[]String[]String[]String[]String[]String[]String[]String[]interface java.io.Serializable", strArray20, strArray27);
        java.lang.String str29 = org.apache.commons.lang3.StringUtils.getCommonPrefix(strArray27);
        java.lang.Class<?>[] wildcardClassArray30 = org.apache.commons.lang3.ClassUtils.toClass((java.lang.Object[]) strArray27);
        java.lang.String str31 = org.apache.commons.lang3.StringUtils.concat((java.lang.Object[]) wildcardClassArray30);
        boolean boolean32 = org.apache.commons.lang3.ClassUtils.isAssignable(wildcardClassArray17, wildcardClassArray30);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str36 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) wildcardClassArray17, "hi!ArrayListArrayListArrayListavaj....AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA...AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA...AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA...AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA...AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA...AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA...AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA...AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA...AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA...", 357, 938);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
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
        org.junit.Assert.assertNotNull(wildcardClassArray17);
        org.junit.Assert.assertNotNull(strArray20);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
        org.junit.Assert.assertNotNull(strArray27);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "interface java.lang.CloneableString[]String[]String[]String[]String[]String[]String[]String[]String[]String[]String[]String[]String[]String[]String[]String[]String[]String[]String[]String[]String[]String[]String[]String[]String[]String[]String[]String[]String[]String[]String[]String[]String[]String[]String[]String[]String[]String[]String[]String[]String[]String[]String[]String[]String[]String[]String[]String[]String[]String[]String[]String[]String[]String[]String[]String[]String[]String[]String[]String[]String[]String[]String[]String[]String[]String[]String[]interface java.io.Serializable" + "'", str28, "interface java.lang.CloneableString[]String[]String[]String[]String[]String[]String[]String[]String[]String[]String[]String[]String[]String[]String[]String[]String[]String[]String[]String[]String[]String[]String[]String[]String[]String[]String[]String[]String[]String[]String[]String[]String[]String[]String[]String[]String[]String[]String[]String[]String[]String[]String[]String[]String[]String[]String[]String[]String[]String[]String[]String[]String[]String[]String[]String[]String[]String[]String[]String[]String[]String[]String[]String[]String[]String[]String[]interface java.io.Serializable");
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "AAAAAAAAAA" + "'", str29, "AAAAAAAAAA");
        org.junit.Assert.assertNotNull(wildcardClassArray30);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "class java.lang.String" + "'", str31, "class java.lang.String");
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
    }

    @Test
    public void test35601() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest71.test35601");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.abbreviate("", 135, 380);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test35602() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest71.test35602");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("JAVAlLANGJAVA.LANGAVAJ.GNALJAVA.LANGAVAJ.GNALJAVA.LANGAVAJ.GNALJAVA.LANGAVAJ.GNALJAVA.LANGAVAJ.GNALJAVA.LANGAVAJ.GNALJAVA.LANGAVAJ.GNALJAVA.LANGAVAJ.GNALJAVA.LANG", "$         $         $         $         $         $         $         $         $         $         $         $         $         $         $         $         $         $         $         $         $         $         $         $         $         $         $         $         $         $         $         $         $         $         $         $         ", 503);
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void test35603() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest71.test35603");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfIgnoreCase("JLVLlaLN", "1java");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test35604() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest71.test35604");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfAnyBut("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa...stgnal.aL.ArrayList...aL.ArrayListgnal.aL.aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "             CHARACTER             UTILSTRI");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test35605() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest71.test35605");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.remove("#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#lass java#lang#String", 'a');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#lss jv#lng#String" + "'", str2, "#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#lss jv#lng#String");
    }

    @Test
    public void test35606() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest71.test35606");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.split("$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$#agnaaaaaaaaGnal");
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test35607() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest71.test35607");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("...ng... .... .java.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.lang... .... .", "iSerializabl...     java", 305);
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void test35608() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest71.test35608");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.chomp("irfCo$irfioSrA..ayLA                                                                           ", "....................................................................................................................................................................jvstringnlrrylistrrylistrrylistv..............................................................................................................................................................................................................................................................");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "irfCo$irfioSrA..ayLA                                                                           " + "'", str2, "irfCo$irfioSrA..ayLA                                                                           ");
    }

    @Test
    public void test35609() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest71.test35609");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.defaultString("                                                                                                                                                                                                                                             HI!aRRAYlISTaRRAYlISTaRRAYlISTAVAJ.GNALaRRAYlISTaRRAYlISTaRRAYlIS", "interface java.lang.Cloneable4interface java.io.Serializable");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                                                                                                                                                                                                                             HI!aRRAYlISTaRRAYlISTaRRAYlISTAVAJ.GNALaRRAYlISTaRRAYlISTaRRAYlIS" + "'", str2, "                                                                                                                                                                                                                                             HI!aRRAYlISTaRRAYlISTaRRAYlISTAVAJ.GNALaRRAYlISTaRRAYlISTaRRAYlIS");
    }

    @Test
    public void test35610() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest71.test35610");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNumeric((java.lang.CharSequence) "...aaaaaaaaj v aaaaaaaaaaj v aaaaaaaaaaj v interf ceaj v aioaSeri liz ble");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test35611() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest71.test35611");
        int int3 = org.apache.commons.lang3.StringUtils.indexOf("lituLlituLlituLlituLlituLlituLlituLlituLlituLlituLlituLlituLlituLlituLlituLlituLlituLlituLlituLlituLlituLlituLlituLlituLlituLlituLlituLlituLlituLlituLlituLlituLlitu", 80, 660);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test35612() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest71.test35612");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                ", "... java.lang.Stringclass java.lang.Stringclass...                                                                                                                                                            ", 109);
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void test35613() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest71.test35613");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                       CL SSjava lang                                                                                ulang", "gnl$ $vj");
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test35614() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest71.test35614");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("RRAYlISTRRAYlISTRRAYlISTRRAYlISTRRAgn                                            ", "              ", 49);
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void test35615() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest71.test35615");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeEndIgnoreCase("TAVAJ.GNALARRAYLISTARRAYLISTARRAYLITAVAJ.GNALARRAYLISTARRAYLISTARRAYLITAVAJ.GNALARRAYLISTARRAYLISTARRAYLITAVAJ.GNALARRAYLISTARRAYLISTARRAYLITAVAJ.GNALARRAYLISTARRAYLISTARRAYLITAVAJ.GNALARRAYLISTARRAYLISTARRAYLITAVAJ.GNALARRAYLISTARRAYLISTARRAYLITAVAJ.GNALARRAYLISTARRAYLISTARRAYLITAVAJ.GNALARRAYLISTARRAYLISTARRAYLITAVAJ.GNALARRAYLISTARRAYLISTARRAYLITAVAJ.GNALARRAYLISTARRAYLISTARRAYLITAVAJ.GNALARRAYLISTARRAYLISTARRAYLITAVAJ.GNALARRAYLISTARRAYLISTARRAYLITAVAJ.GNALARRAYLISTARRAYLISTARRAYLITAVAJ.GNALARRAYLISTARRAYLISTARRAYLITAVAJ.GNALARRAYLISTARRAYLISTARRAYLITAVAJ.GNALARRAYLISTARRAYLISTARRAYLITAVAJ.GNALARRAYLISTARRAYLISTARRAYLITAVAJ.GNALARRAYLISTARRAYLISTARRAYLITAVAJ.GNALARRAYLISTARRAYLISTARRAYLITAVAJ.GNALARRAYLISTARRAYLISTARRAYLITAVAJ.GNALARRAYLISTARRAYLISTARRAYLITAVAJ.GNALARRAYLISTARRAYLISTARRAYLITAVAJ.GNALARRAYLISTARRAYLISTARRAYLITAVAJ.GNALARRAYLI                                 ..", "AAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAja                                              AAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAring");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "TAVAJ.GNALARRAYLISTARRAYLISTARRAYLITAVAJ.GNALARRAYLISTARRAYLISTARRAYLITAVAJ.GNALARRAYLISTARRAYLISTARRAYLITAVAJ.GNALARRAYLISTARRAYLISTARRAYLITAVAJ.GNALARRAYLISTARRAYLISTARRAYLITAVAJ.GNALARRAYLISTARRAYLISTARRAYLITAVAJ.GNALARRAYLISTARRAYLISTARRAYLITAVAJ.GNALARRAYLISTARRAYLISTARRAYLITAVAJ.GNALARRAYLISTARRAYLISTARRAYLITAVAJ.GNALARRAYLISTARRAYLISTARRAYLITAVAJ.GNALARRAYLISTARRAYLISTARRAYLITAVAJ.GNALARRAYLISTARRAYLISTARRAYLITAVAJ.GNALARRAYLISTARRAYLISTARRAYLITAVAJ.GNALARRAYLISTARRAYLISTARRAYLITAVAJ.GNALARRAYLISTARRAYLISTARRAYLITAVAJ.GNALARRAYLISTARRAYLISTARRAYLITAVAJ.GNALARRAYLISTARRAYLISTARRAYLITAVAJ.GNALARRAYLISTARRAYLISTARRAYLITAVAJ.GNALARRAYLISTARRAYLISTARRAYLITAVAJ.GNALARRAYLISTARRAYLISTARRAYLITAVAJ.GNALARRAYLISTARRAYLISTARRAYLITAVAJ.GNALARRAYLISTARRAYLISTARRAYLITAVAJ.GNALARRAYLISTARRAYLISTARRAYLITAVAJ.GNALARRAYLISTARRAYLISTARRAYLITAVAJ.GNALARRAYLI                                 .." + "'", str2, "TAVAJ.GNALARRAYLISTARRAYLISTARRAYLITAVAJ.GNALARRAYLISTARRAYLISTARRAYLITAVAJ.GNALARRAYLISTARRAYLISTARRAYLITAVAJ.GNALARRAYLISTARRAYLISTARRAYLITAVAJ.GNALARRAYLISTARRAYLISTARRAYLITAVAJ.GNALARRAYLISTARRAYLISTARRAYLITAVAJ.GNALARRAYLISTARRAYLISTARRAYLITAVAJ.GNALARRAYLISTARRAYLISTARRAYLITAVAJ.GNALARRAYLISTARRAYLISTARRAYLITAVAJ.GNALARRAYLISTARRAYLISTARRAYLITAVAJ.GNALARRAYLISTARRAYLISTARRAYLITAVAJ.GNALARRAYLISTARRAYLISTARRAYLITAVAJ.GNALARRAYLISTARRAYLISTARRAYLITAVAJ.GNALARRAYLISTARRAYLISTARRAYLITAVAJ.GNALARRAYLISTARRAYLISTARRAYLITAVAJ.GNALARRAYLISTARRAYLISTARRAYLITAVAJ.GNALARRAYLISTARRAYLISTARRAYLITAVAJ.GNALARRAYLISTARRAYLISTARRAYLITAVAJ.GNALARRAYLISTARRAYLISTARRAYLITAVAJ.GNALARRAYLISTARRAYLISTARRAYLITAVAJ.GNALARRAYLISTARRAYLISTARRAYLITAVAJ.GNALARRAYLISTARRAYLISTARRAYLITAVAJ.GNALARRAYLISTARRAYLISTARRAYLITAVAJ.GNALARRAYLISTARRAYLISTARRAYLITAVAJ.GNALARRAYLI                                 ..");
    }

    @Test
    public void test35616() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest71.test35616");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlpha((java.lang.CharSequence) "Interface java.lang.Cloneable             Character             interface java.io.Serializabl");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test35617() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest71.test35617");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.abbreviateMiddle("java..........java..........java......", "asaayaaaaaaauaaaaaaaaaaaaaaaaaaaaaaaaaaaasaayaaaaaaauaaaa", 19);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "java..........java..........java......" + "'", str3, "java..........java..........java......");
    }

    @Test
    public void test35618() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest71.test35618");
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("ArrayLis", "", 35);
        java.lang.String[] strArray8 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("...       AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA", "tring", (int) (short) 10);
        java.lang.String str9 = org.apache.commons.lang3.StringUtils.replaceEachRepeatedly("sERIALIZABLE", strArray4, strArray8);
        java.lang.Class<?>[] wildcardClassArray10 = org.apache.commons.lang3.ClassUtils.toClass((java.lang.Object[]) strArray4);
        java.lang.Class<?> wildcardClass11 = wildcardClassArray10.getClass();
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "sERIALIZABLE" + "'", str9, "sERIALIZABLE");
        org.junit.Assert.assertNotNull(wildcardClassArray10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test35619() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest71.test35619");
        java.lang.String[] strArray6 = org.apache.commons.lang3.StringUtils.split("AVAJ.GNAL", ' ');
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.concatWith("...                                 ", (java.lang.Object[]) strArray6);
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.concatWith("                                                                                      gNAL", (java.lang.Object[]) strArray6);
        boolean boolean9 = org.apache.commons.lang3.StringUtils.endsWithAny("                                                                                                                                                                                                                             va.langGNAL..la..                                                                                   etyBetyBetyBetyBetyBetyBetyBetyBetyBetyBetyBetyBetyBetyBetyBetyBetyBetyBetyBetyBetyBetyBetyB                                                                                                                                                                                                                             va.langGNAL..la..                                                                                    ", strArray6);
        boolean boolean10 = org.apache.commons.lang3.StringUtils.endsWithAny("", strArray6);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "AVAJ.GNAL" + "'", str7, "AVAJ.GNAL");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "AVAJ.GNAL" + "'", str8, "AVAJ.GNAL");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test35620() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest71.test35620");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.containsWhitespace("                            ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test35621() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest71.test35621");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isEmpty((java.lang.CharSequence) "..........................................................................................");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test35622() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest71.test35622");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.uncapitalize((java.lang.CharSequence) "...larra...");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "...larra..." + "'", str1, "...larra...");
    }

    @Test
    public void test35623() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest71.test35623");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitByCharacterType("va                                      ");
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test35624() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest71.test35624");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.reverse("yli");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "ily" + "'", str1, "ily");
    }

    @Test
    public void test35625() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest71.test35625");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "LANG", "                                       sl..Ug");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test35626() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest71.test35626");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAllUpperCase((java.lang.CharSequence) "gnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalLANGLANGLANGLANGLANGLANGLlituava");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test35627() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest71.test35627");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.abbreviateMiddle("interface java.lang.Cloneablevv4yL444vv4yL444vv4yL444vv4yL444vv4yL444vv4yL444vv4yL444vv4yL444vv4yL444vv4yL444vv4yL444vv4yL444vv4yL444vv4yL444vv4yL444vv4yL444vv4yL444vv4yL444vv4yL444vv4yL444vv4yL444vv4yL444vv4yL444vv4yL444vv4yL444vv4yL444vv4yL444vv4yL444vv4yL444vv4yL444vv4yL444vv4yL444vv4yL444vv4yL444vv4yL444vv4yL444vv4yL444vv4yL444vv4yL444vv4yL444vv4yL444vv4yL444vv4yL444vv4yL444vv4yL444vv4yL444vv4yL444vv4yL444vv4yL444vv4yL444vv4yL444$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$avalitu.$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$interface java.io.Serializable", "javaGnaljavaGnaljavaGnaljavaGnaljavaGnaljavaGnaljavaGnaljavaGnaljavaGnaljavaGnaljavaGnaljavaGnaljavaGnaljavaGnaljavaGnaljavaGnaljavaGnaljavaGnaljavaGnaljavaGnaljavaGnaljavaGnaljavaGnaljavaGnaljavaGnaljavaGnaljavaGnaljavaGnaljavaGnaljavaGnaljavaGnaljavaGnaljavaGnaljavaGnaljavaGnaljavaGnaljavaGnaljavaGnaljavaGnaljavaGnaljavaGnaljavaGnaljavaGnaljavaGnaljavaGnaljavaGnaljavaGnaljavaGnaljavaGnaljavaGnaljavaGnaljavaGnaljavaGnaljavaGnaljavaGnaljavaGnaljavaGnaljavaGnaljavaGnaljavaGnaljavaGnaljavaGnaljavaGnaljavaGnaljavaGnaljavaGnaljavaGnaljavaGnaljavaGnaljavaGnaljavaGnaljavaGnaljavaGnaljavaGnaljavaGnaljavaGnaljavaGnaljavaGnaljavaGnaljavaGnaljavaGnaljavaGnaljavaGnaljavaGnaljavaGnaljavaGnaljavaGnaljavaGnaljavaGnaljavaGnaljavaGnaljavaGnaljavaGnaljavaGnaljavaGnaljavaGnaljavaGnaljavaGnaljavaGnaljavaGnaljavaGnaljavaGnaljavaGnaljavaGnaljavaGnaljavaGnaljavaGnaljavaGnaljava", 12);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "interface java.lang.Cloneablevv4yL444vv4yL444vv4yL444vv4yL444vv4yL444vv4yL444vv4yL444vv4yL444vv4yL444vv4yL444vv4yL444vv4yL444vv4yL444vv4yL444vv4yL444vv4yL444vv4yL444vv4yL444vv4yL444vv4yL444vv4yL444vv4yL444vv4yL444vv4yL444vv4yL444vv4yL444vv4yL444vv4yL444vv4yL444vv4yL444vv4yL444vv4yL444vv4yL444vv4yL444vv4yL444vv4yL444vv4yL444vv4yL444vv4yL444vv4yL444vv4yL444vv4yL444vv4yL444vv4yL444vv4yL444vv4yL444vv4yL444vv4yL444vv4yL444vv4yL444vv4yL444$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$avalitu.$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$interface java.io.Serializable" + "'", str3, "interface java.lang.Cloneablevv4yL444vv4yL444vv4yL444vv4yL444vv4yL444vv4yL444vv4yL444vv4yL444vv4yL444vv4yL444vv4yL444vv4yL444vv4yL444vv4yL444vv4yL444vv4yL444vv4yL444vv4yL444vv4yL444vv4yL444vv4yL444vv4yL444vv4yL444vv4yL444vv4yL444vv4yL444vv4yL444vv4yL444vv4yL444vv4yL444vv4yL444vv4yL444vv4yL444vv4yL444vv4yL444vv4yL444vv4yL444vv4yL444vv4yL444vv4yL444vv4yL444vv4yL444vv4yL444vv4yL444vv4yL444vv4yL444vv4yL444vv4yL444vv4yL444vv4yL444vv4yL444$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$avalitu.$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$interface java.io.Serializable");
    }

    @Test
    public void test35628() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest71.test35628");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("avajssalcrrAtsiLytcejb");
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test35629() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest71.test35629");
        java.lang.String[] strArray6 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("String[]String[]StLlitung[]String[]String[]String[]String[]String[]", "gNAL", 3);
        java.lang.String[] strArray7 = org.apache.commons.lang3.StringUtils.stripAll(strArray6);
        java.lang.String[] strArray10 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("avaj.gnal", "$       ");
        java.lang.String str11 = org.apache.commons.lang3.StringUtils.replaceEachRepeatedly("gagnAAAAAAAAAAistArrayListArrayListavaj.gnalArrayListArrayListArrayLi", strArray6, strArray10);
        int int12 = org.apache.commons.lang3.StringUtils.lastIndexOfAny("gnl$ $vj", strArray6);
        int int13 = org.apache.commons.lang3.StringUtils.indexOfAny("irfCo$irfioSriiz", strArray6);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertNotNull(strArray10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "gagnAAAAAAAAAAistArrayListArrayListavaj.gnalArrayListArrayListArrayLi" + "'", str11, "gagnAAAAAAAAAAistArrayListArrayListavaj.gnalArrayListArrayListArrayLi");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
    }

    @Test
    public void test35630() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest71.test35630");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("###########################################################################################################################################gn gnal.avaj", "... AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA... AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA... AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA... AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA... AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA... AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA... AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA... AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA... AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA... AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA", 423);
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.stripAll(strArray3);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertNotNull(strArray4);
    }

    @Test
    public void test35631() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest71.test35631");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOf("", 524, 401);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test35632() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest71.test35632");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("hi!", "");
        java.lang.String[] strArray5 = org.apache.commons.lang3.StringUtils.stripAll(strArray3, "$");
        java.lang.String str6 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray3);
        java.lang.String[] strArray8 = org.apache.commons.lang3.StringUtils.split("java.util");
        java.lang.String[] strArray10 = org.apache.commons.lang3.StringUtils.stripAll(strArray8, "java.lang");
        java.lang.String str11 = org.apache.commons.lang3.StringUtils.getCommonPrefix(strArray8);
        java.lang.String str12 = org.apache.commons.lang3.StringUtils.replaceEachRepeatedly("$", strArray3, strArray8);
        java.lang.String str13 = org.apache.commons.lang3.StringUtils.concat((java.lang.Object[]) strArray3);
        java.lang.String str15 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray3, "avaj.###########################################################################################################################################gn gnal");
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertNotNull(strArray10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "java.util" + "'", str11, "java.util");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "$" + "'", str12, "$");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
    }

    @Test
    public void test35633() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest71.test35633");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOf("...vajlang.javagnal.avajlang.javagnal.avajlang.javagnal.avajlang.javagnal.avajlang.javagnal.avajlang.javagnal.avajlang.javagnal.avajlang.javagnal.ava...", "#####################################################", 300);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test35634() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest71.test35634");
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
        java.lang.Class<?>[] wildcardClassArray32 = org.apache.commons.lang3.ClassUtils.primitivesToWrappers(wildcardClassArray30);
        java.lang.String str36 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) wildcardClassArray30, "UTILsTRINGUTILsTRING-1JAVA-1JAVA", 881, 5);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str40 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) wildcardClassArray30, '.', 35, 939);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 35");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
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
        org.junit.Assert.assertNotNull(wildcardClassArray32);
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "" + "'", str36, "");
    }

    @Test
    public void test35635() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest71.test35635");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitByCharacterTypeCamelCase("AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA                                            #AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray1);
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA                                            #AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA" + "'", str2, "AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA                                            #AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA");
    }

    @Test
    public void test35636() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest71.test35636");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("interface java.lang.CloneableStringinterface java.io.Serializable", "Serializabl", 4);
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray3, "AVAJGNALjavajavajavajavajavajavajavajavajavajavajavajavajavajavajavajavajavajavajavajavajavajavajavajavajavajavajavajavajavajavajavajavainterface javaioSerializable", 669, 22);
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.getCommonPrefix(strArray3);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test35637() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest71.test35637");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.rightPad("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", 28, '#');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa" + "'", str3, "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
    }

    @Test
    public void test35638() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest71.test35638");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.startsWithIgnoreCase("jAV-1JAVA.UTILsTRING-1JAVA.UTILsTRING-1JAVA.UTILsTRING-1JAVA.UTILsTRING-1JAVA", "                                                                                                                                                                                                                                                                              langajavatsiLyarrAtsiLyarrAtsiLyarrA                                                                                                                                                                                                                                                                             ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test35639() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest71.test35639");
        char[] charArray15 = new char[] { ' ', ' ', '#', 'a', '4', 'a' };
        int int16 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "", charArray15);
        boolean boolean17 = org.apache.commons.lang3.StringUtils.containsAny("......", charArray15);
        int int18 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "AAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAA", charArray15);
        int int19 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "JAVA.LANGAVAJ.GNALJAVA.LANGAVAJ.GNALJAVA.LANGAVAJ.GNALJAVA.LANGAVAJ.GNALJAVA.LANGAVAJ.GNALJAVA.LANGAVAJ.GNALJAVA.LANGAVAJ.GNALJAVA.LANGAVAJ.GNALJAVA.LANG", charArray15);
        boolean boolean20 = org.apache.commons.lang3.StringUtils.containsAny("gnal.avajgnal..LANGgnal.avajgnal.", charArray15);
        boolean boolean21 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "STRING", charArray15);
        boolean boolean22 = org.apache.commons.lang3.StringUtils.containsAny("AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA", charArray15);
        boolean boolean23 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "ArrGNALyList", charArray15);
        boolean boolean24 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "GNAL.", charArray15);
        org.junit.Assert.assertNotNull(charArray15);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray15), "  #a4a");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray15), "  #a4a");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray15), "[ ,  , #, a, 4, a]");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
    }

    @Test
    public void test35640() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest71.test35640");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) ".LANGa.                                                     ClassJAVA########################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################", "ArrayListArrayListArrayLi");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test35641() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest71.test35641");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBeforeLast("interface java.lang.Cloneable interface java.io.Serializable", "AA...");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "interface java.lang.Cloneable interface java.io.Serializable" + "'", str2, "interface java.lang.Cloneable interface java.io.Serializable");
    }

    @Test
    public void test35642() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest71.test35642");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.defaultString("                                                                                                                                                                                                                                                                              aaaaaa..", "sClassslitUgnirtSslitUgnirtSslitUgnirtSslitUgnirtSslitUgnirtSslitUgnirtSslitUgnirtSslitUgnirtSslitUgnirtSslitUgnirtS");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                                                                                                                                                                                                                                                              aaaaaa.." + "'", str2, "                                                                                                                                                                                                                                                                              aaaaaa..");
    }

    @Test
    public void test35643() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest71.test35643");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeEnd("a.lang.CloneableStringinterfacejava.i", "StringUtil");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "a.lang.CloneableStringinterfacejava.i" + "'", str2, "a.lang.CloneableStringinterfacejava.i");
    }

    @Test
    public void test35644() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest71.test35644");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.difference("Arra                                                                 AtsiLytcejbOlvjsslcrrAtsiLytcejbO.gnal.avaj ssalcrrAva.langGNAL..langjava.langAGNAL.AVAJ", "          GNALgn");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "          GNALgn" + "'", str2, "          GNALgn");
    }

    @Test
    public void test35645() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest71.test35645");
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.split("java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java", "Class", 2);
        java.lang.String str5 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray4);
        java.lang.String[] strArray6 = org.apache.commons.lang3.StringUtils.stripAll(strArray4);
        java.lang.String[] strArray10 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("langaaaaa", "", 0);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str11 = org.apache.commons.lang3.StringUtils.replaceEachRepeatedly(".............................................................444444444444444444444444444444444444444444444444444444444444444gn                                            gn      tavaj.gnalarraylistarraylistarrayli..............................................................", strArray6, strArray10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Search and Replace array lengths don't match: 2 vs 1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "jva..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java" + "'", str5, "jva..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java");
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertNotNull(strArray10);
    }

    @Test
    public void test35646() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest71.test35646");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.normalizeSpace("##########################JAVA.LANG");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "##########################JAVA.LANG" + "'", str1, "##########################JAVA.LANG");
    }

    @Test
    public void test35647() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest71.test35647");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.split("-1java.utilString[]");
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test35648() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest71.test35648");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfAnyBut("", "A.UTILStringcJAVA.UTILJAVA.UTILStringcJAVA.UTILJAVA.UTILStringcJAVA.UTILJAVA.UTILStringcJAVA.UTILJAVA.UTILStringcJAVA.UTILJAVA.UTILStringcJAVA.UTILJAVA.UTILStringcJAVA.UTILJAVA.UTILStringcJAVA.UTILJAVA.UTILStringcJAVA.UTILJAVA.UTILStringcJAVA.UTILJAVA.UTILStringcJAVA.UTILJAVA.UTILStringcJAVA.UTILJAVA.UTILStringcJAVA.UTILJAVA.UTILStringcJAVA.UTILJAVA.UTILStringcJAVA.UTILJAVA.UTILStringcJAVA.UTILJAVA.UTILStringcJAVA.UTILJAVA.UTILStringcJAVA.UTILJAVA.UTILStringcJAVA.UTILJAVA.UTILStringcJAVA.UTILJAVA.UTILinterface java.io.Serializable");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test35649() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest71.test35649");
        int int2 = org.apache.commons.lang3.StringUtils.indexOf("javalang", "...AA... AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA... AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA... AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA... AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA... AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA... AAAAAAAAAAAAAAAAAAA...");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test35650() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest71.test35650");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOfIgnoreCase("JAVA.LITU.AVAJLITU.AVAJJAVA.LITU.AVAJLITU.AVAJJAVA.LITU.AVAJLITU.AVAJJAVA.LITU.AVAJLITU.AVAJJAVA.LITU.AVAJLITU.AVAJJAVA.LITU.AVAJLITU.AVAJJAVA.LITU.AVAJLITU.AVAJJAVA.LITU.AVAJLITU.AVAJJAVA.LITU.AVAJLITU.AVAJJAVA.LITU.AVAJLITU.AVAJJAVA.LITU.AVAJLITU.AVAJJAVA.LITU.AVAJLITU.AVAJJAVA.LITU.AVAJLITU.AVAJJAVA.LITU.AVAJLITU.AVAJJAVA.LITU.AVAJLITU.AVAJJAVA.LITU.AVAJLITU.AVAJJAVA.LITU.AVAJLITU.AVAJJAVA.LITU.AVAJLITU.AVAJJAVA.LITU.AVAJLITU.AVAJJAVA.LITU.AVAJLITU.AVAJJAVA.LITU.AVAJLITU.AVAJJAVA.LITU.AVAJLITU.AVAJJAVA.LITU.AVAJLITU.AVAJJAVA.LITU.AVAJLITU.AVAJJAVA.LITU.AVAJLITU.AVAJJAVA.LITU.AVAJLITU.AVAJJAVA.LITU.AVAJLITU.AVAJJAVA.LITU.AVAJLITU.AVAJJAVA.LITU.AVAJLITU.AVAJJAVA.LITU.AVAJLITU.AVAJJAVA.LITU.AVAJLITU.AVAJJAVA.LITU.AVAJLITU.AVAJJAVA.LITU.AVAJLITU.AVAJ", "interface java.lang.Cloneable4interface java.io.Serializableaa ", 793);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test35651() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest71.test35651");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfDifference((java.lang.CharSequence) "LANGaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa44444444444444444444444444...", (java.lang.CharSequence) "io");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test35652() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest71.test35652");
        int int2 = org.apache.commons.lang3.StringUtils.indexOf("#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#lass java#lang#String", "-1java.utilString[]-1java.utilString[]-1java.utilString[]-1java.utilString[]-1java.utilString[]-1java.utilString[]-1java.utilString[]-1java.utilString[]-1java.utilString[]-1java.utilString[]-1$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$gnal44444444444444444444444444444444444444444444444444444");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test35653() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest71.test35653");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.endsWith("..........a                       ..............................................................................a                       ..............................................................................a                       ..............................................................................a                       ..............................................................................a                       ..............................................................................a                       ..............................................................................a                       ..............................................................................a                       ..............................................................................a", "CloneableI");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test35654() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest71.test35654");
        java.lang.CharSequence charSequence6 = null;
        char[] charArray15 = new char[] { ' ', ' ', '#', 'a', '4', 'a' };
        int int16 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "", charArray15);
        boolean boolean17 = org.apache.commons.lang3.StringUtils.containsAny("......", charArray15);
        boolean boolean18 = org.apache.commons.lang3.StringUtils.containsOnly(charSequence6, charArray15);
        boolean boolean19 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "AtsiLytcejbO.gnal.avaj ssalcrrAtsiLytcejbO.gnal.avaj ssalcrrAva.langGNAL..langjava.langAGNAL.AVAJ", charArray15);
        int int20 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "JAVA.UTIL.", charArray15);
        boolean boolean21 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "ArrayListArrayListArrayListavajagnal", charArray15);
        boolean boolean22 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "                                                                                                                                                                                                                                             HI!aRRAYlISTaRRAYlISTaRRAYlISTAVAJ.GNALaRRAYlISTaRRAYlISTaRRAYlISTAVAJ                                                                                                                                                                                                                                              ", charArray15);
        int int23 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "ArrayLis", charArray15);
        boolean boolean24 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "Va.langGNAL..la...", charArray15);
        org.junit.Assert.assertNotNull(charArray15);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray15), "  #a4a");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray15), "  #a4a");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray15), "[ ,  , #, a, 4, a]");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
    }

    @Test
    public void test35655() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest71.test35655");
        java.util.Locale locale1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.apache.commons.lang3.StringUtils.lowerCase("u.................................", locale1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test35656() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest71.test35656");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.substringBetween("                                                                  litu                                                                  ", "aaaaaaaaaaaa                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                              ", "                     ");
        org.junit.Assert.assertNull(str3);
    }

    @Test
    public void test35657() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest71.test35657");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.mid("..................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................gnirtSlitu.avaj1-gnirtSlitu.avaj1-", 990, 162);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test35658() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest71.test35658");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.split("interface java.lang.Cloneable.......java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........javainterface java.io.Serializabl", 'a');
        java.lang.String str4 = org.apache.commons.lang3.ClassUtils.getPackageName((java.lang.Object) "interface java.lang.Cloneable.......java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........javainterface java.io.Serializabl", "                                    iLyarrAtsiLyarrAtsiLyarrAlang.javatsiLyarrAtsiLyarrAtsiLyarrA");
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "java.lang" + "'", str4, "java.lang");
    }

    @Test
    public void test35659() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest71.test35659");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass2 = org.apache.commons.lang3.ClassUtils.getClass("JAVA.LANGAgnal.avajgnal..LANGgnal.avJAVA.LANGAgnal.avajgnal..LANGgnal.avJAVA.LANGAgnal.avajgnal..LANGgnal.avJAVA.LANGAgnal.avajgnal..LANGgnal.avJAVA.LANGAgnal.avajgnal..LANGgnal.avJAVA.LANGAgnal.avajgnal..LANGgnal.avJAVA.LANGAgnal.avajgnal..LANGgnal.avJAVA.LANGAgnal.avajgnal..LANGgnal.avJAVA.LANGAgnal.avajgnal..LANGgnal.avJAVA.LANGAgnal.avajgnal..LANGgnal.av", true);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassNotFoundException; message: JAVA/LANGAgnal/avajgnal//LANGgnal/avJAVA/LANGAgnal/avajgnal//LANGgnal/avJAVA/LANGAgnal/avajgnal//LANGgnal/avJAVA/LANGAgnal/avajgnal//LANGgnal/avJAVA/LANGAgnal/avajgnal//LANGgnal/avJAVA/LANGAgnal/avajgnal//LANGgnal/avJAVA/LANGAgnal/avajgnal//LANGgnal/avJAVA/LANGAgnal/avajgnal//LANGgnal/avJAVA/LANGAgnal/avajgnal//LANGgnal/avJAVA/LANGAgnal/avajgnal//LANGgnal/av");
        } catch (java.lang.ClassNotFoundException e) {
            // Expected exception.
        }
    }

    @Test
    public void test35660() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest71.test35660");
        int int2 = org.apache.commons.lang3.StringUtils.getLevenshteinDistance((java.lang.CharSequence) "vvayLasavvayLasajavaulainterface java.lang.Cloneable4interface java.io.SerializablevvayLasavvayLasa.", (java.lang.CharSequence) "aTSIlYTCEJBoGNALAVAJSSALCRRaTSIlYTCEJBoGNALAVAJSSALCRRaVALANGgnalLANGJAVALANGagnalavajaTSIlYTCEJBoGNALAVAJSSALCRRaTSIlYTCEJBoGNALAVAJSSALCRRaVALANGgnalLANGJAVALANGagnalavajaTSIlYTCEJBoGNALAVAJSSALCRRaTSIlYTCEJBoGNALAVAJSSALCRRaVALANGgnalLANGJAVALANGagnalavajaTSIlYTCEJBoGNALAVAJSSALCRRaTSIlYTCEJsTRINGaTSIlYTCEJBoGNALAVAJSSALCRRaTSIlYTCEJBoGNALAVAJSSALCRRaVALANGgnalLANGJAVALANGagnalavajaTSIlYTCEJBoGNALAVAJSSALCRRaTSIlYTCEJBoGNALAVAJSSALCRRaVALANGgnalLANGJAVALANGagnalavajaTSIlYTCEJBoGNALAVAJSSALCRRaTSIlYTCEJBoGNALAVAJSSALCRRaVALANGgnalLANGJAVALANGagnalavajaTSIlYTCEJBoGNALAVAJSSALCRRaTSIlYTCEJB");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 551 + "'", int2 == 551);
    }

    @Test
    public void test35661() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest71.test35661");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.abbreviate("hi!arr...", 486, 66);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!arr..." + "'", str3, "hi!arr...");
    }

    @Test
    public void test35662() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest71.test35662");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.rightPad("sLyAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA 444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444", 58);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "sLyAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA 444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444" + "'", str2, "sLyAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA 444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444");
    }

    @Test
    public void test35663() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest71.test35663");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByCharacterType("... AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA... AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA... AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA... AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA... AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA... AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA... AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA... AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA... AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA... AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA");
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.stripAll(strArray2, "JAVA");
        java.lang.Class<?>[] wildcardClassArray5 = org.apache.commons.lang3.ClassUtils.toClass((java.lang.Object[]) strArray2);
        int int6 = org.apache.commons.lang3.StringUtils.indexOfAny(".LANG.LANG.LANG.LANG.LLITU", strArray2);
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray2, "");
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertNotNull(wildcardClassArray5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "... AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA... AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA... AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA... AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA... AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA... AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA... AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA... AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA... AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA... AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA" + "'", str8, "... AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA... AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA... AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA... AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA... AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA... AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA... AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA... AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA... AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA... AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA");
    }

    @Test
    public void test35664() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest71.test35664");
        java.lang.String str1 = org.apache.commons.lang3.ClassUtils.getShortCanonicalName("         ....................................................................");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
    }

    @Test
    public void test35665() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest71.test35665");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringAfter("OI.AVAJ ECAFRETNIGNIRTSELBAENOLC.GNAL", "Gnirt...Gnirt...Gnirt...Gni.Gnirt...Gnirt...Gnirt...Gnir");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test35666() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest71.test35666");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitByCharacterType("tttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttobject44ttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttt");
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test35667() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest71.test35667");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripToEmpty("laagaAAAAAAAAAAaaaalaagaAAAAAAAAAAaaaalaagaAAAAAAAAAAaaaalaagaAAAAAAAAAAaaaalaagaAAAAAAAAAAaaaalaagaAAAAAAAAAAaaaalaagaAAAAAAAAAAaaaalaagaAAAAAAAAAAaaaalaagaAAAAAAAAAAaaaalaagaAAAAAAAAAAaaaalaagaAAAAAAAAAAaaaalaagaAAAAAAAAAAaaaalaagaAAAAAAAAAAaaaalaagaAAAAAAAAAAaaaalaagaAAAAAAAAAAaaaalaagaAAAAAAAAAAaaaalaagaAAAAAAAAAAaaaalaagaAAAAAAAAAAaaaalaagaAAAAAAAAAAaaaalaagaAAAAAAAAAAaaaalaagaAAAAAAAAAAaaaalaagaAAAAAAAAAAaaaalaagaAAAAAAAAAAaaaalaagaAAAAAAAAAAaaaalaagaAAAAAAAAAAaaaalaagaAAAAAAAAAAaaaalaagaAAAAAAAAAAaaaalaagaAAAAAAAAAAaaaalaagaAAAAAAAAAAaaaalaagaAAAAAAAAAAaaaalaagaAAAAAAAAAAaaaalaagaAAAAAAAAAAaaaalaagaAAAAAAAAAAaaaalaagaAAAAAAAAAAaaaalaagaAAAAAAAAAA");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "laagaAAAAAAAAAAaaaalaagaAAAAAAAAAAaaaalaagaAAAAAAAAAAaaaalaagaAAAAAAAAAAaaaalaagaAAAAAAAAAAaaaalaagaAAAAAAAAAAaaaalaagaAAAAAAAAAAaaaalaagaAAAAAAAAAAaaaalaagaAAAAAAAAAAaaaalaagaAAAAAAAAAAaaaalaagaAAAAAAAAAAaaaalaagaAAAAAAAAAAaaaalaagaAAAAAAAAAAaaaalaagaAAAAAAAAAAaaaalaagaAAAAAAAAAAaaaalaagaAAAAAAAAAAaaaalaagaAAAAAAAAAAaaaalaagaAAAAAAAAAAaaaalaagaAAAAAAAAAAaaaalaagaAAAAAAAAAAaaaalaagaAAAAAAAAAAaaaalaagaAAAAAAAAAAaaaalaagaAAAAAAAAAAaaaalaagaAAAAAAAAAAaaaalaagaAAAAAAAAAAaaaalaagaAAAAAAAAAAaaaalaagaAAAAAAAAAAaaaalaagaAAAAAAAAAAaaaalaagaAAAAAAAAAAaaaalaagaAAAAAAAAAAaaaalaagaAAAAAAAAAAaaaalaagaAAAAAAAAAAaaaalaagaAAAAAAAAAAaaaalaagaAAAAAAAAAAaaaalaagaAAAAAAAAAA" + "'", str1, "laagaAAAAAAAAAAaaaalaagaAAAAAAAAAAaaaalaagaAAAAAAAAAAaaaalaagaAAAAAAAAAAaaaalaagaAAAAAAAAAAaaaalaagaAAAAAAAAAAaaaalaagaAAAAAAAAAAaaaalaagaAAAAAAAAAAaaaalaagaAAAAAAAAAAaaaalaagaAAAAAAAAAAaaaalaagaAAAAAAAAAAaaaalaagaAAAAAAAAAAaaaalaagaAAAAAAAAAAaaaalaagaAAAAAAAAAAaaaalaagaAAAAAAAAAAaaaalaagaAAAAAAAAAAaaaalaagaAAAAAAAAAAaaaalaagaAAAAAAAAAAaaaalaagaAAAAAAAAAAaaaalaagaAAAAAAAAAAaaaalaagaAAAAAAAAAAaaaalaagaAAAAAAAAAAaaaalaagaAAAAAAAAAAaaaalaagaAAAAAAAAAAaaaalaagaAAAAAAAAAAaaaalaagaAAAAAAAAAAaaaalaagaAAAAAAAAAAaaaalaagaAAAAAAAAAAaaaalaagaAAAAAAAAAAaaaalaagaAAAAAAAAAAaaaalaagaAAAAAAAAAAaaaalaagaAAAAAAAAAAaaaalaagaAAAAAAAAAAaaaalaagaAAAAAAAAAAaaaalaagaAAAAAAAAAA");
    }

    @Test
    public void test35668() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest71.test35668");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfDifference((java.lang.CharSequence) "                                                   ", (java.lang.CharSequence) "                                            Arra                                            ");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 44 + "'", int2 == 44);
    }

    @Test
    public void test35669() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest71.test35669");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.reverse("java.lang.Cloneable4interface java.io.Serializa                                            java.lang.Cloneable4interface java.io.Serializa                                            java.lang.Cloneable4interface java.io.Serializa                                            java.lang.Cloneable4interface java.io.Serializa                                            java.lang.Cloneable4interface java.io.Serializa                                            java.lang.Cloneable4interface java.io.Serializa                                            java.lang.Cloneable4interface java.io.Serial               ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "               laireS.oi.avaj ecafretni4elbaenolC.gnal.avaj                                            azilaireS.oi.avaj ecafretni4elbaenolC.gnal.avaj                                            azilaireS.oi.avaj ecafretni4elbaenolC.gnal.avaj                                            azilaireS.oi.avaj ecafretni4elbaenolC.gnal.avaj                                            azilaireS.oi.avaj ecafretni4elbaenolC.gnal.avaj                                            azilaireS.oi.avaj ecafretni4elbaenolC.gnal.avaj                                            azilaireS.oi.avaj ecafretni4elbaenolC.gnal.avaj" + "'", str1, "               laireS.oi.avaj ecafretni4elbaenolC.gnal.avaj                                            azilaireS.oi.avaj ecafretni4elbaenolC.gnal.avaj                                            azilaireS.oi.avaj ecafretni4elbaenolC.gnal.avaj                                            azilaireS.oi.avaj ecafretni4elbaenolC.gnal.avaj                                            azilaireS.oi.avaj ecafretni4elbaenolC.gnal.avaj                                            azilaireS.oi.avaj ecafretni4elbaenolC.gnal.avaj                                            azilaireS.oi.avaj ecafretni4elbaenolC.gnal.avaj");
    }

    @Test
    public void test35670() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest71.test35670");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.rightPad(".......                                                                                                                                                                                                                             va.langGNAL..la..                                                                                                                                                                                                                              ......................................javaulang....................................................................................................................................................", 28);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + ".......                                                                                                                                                                                                                             va.langGNAL..la..                                                                                                                                                                                                                              ......................................javaulang...................................................................................................................................................." + "'", str2, ".......                                                                                                                                                                                                                             va.langGNAL..la..                                                                                                                                                                                                                              ......................................javaulang....................................................................................................................................................");
    }

    @Test
    public void test35671() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest71.test35671");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.split("JAVA.IO.SERIALIZABLE JAVA.LANG.cLONEABLESTRINGINTERFA.E INTERFA.E");
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test35672() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest71.test35672");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isWhitespace((java.lang.CharSequence) "###################arralitu.avajlitu.avaj");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test35673() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest71.test35673");
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
        java.lang.Class<?>[] wildcardClassArray34 = org.apache.commons.lang3.ClassUtils.toClass((java.lang.Object[]) wildcardClassArray33);
        java.lang.Class<?>[] wildcardClassArray35 = org.apache.commons.lang3.ClassUtils.wrappersToPrimitives(wildcardClassArray33);
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
        org.junit.Assert.assertNotNull(wildcardClassArray35);
    }

    @Test
    public void test35674() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest71.test35674");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.defaultString("                                                                                                                                                                                                                                               vvaylasa                                                                                                                                                                                                                                                ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "                                                                                                                                                                                                                                               vvaylasa                                                                                                                                                                                                                                                " + "'", str1, "                                                                                                                                                                                                                                               vvaylasa                                                                                                                                                                                                                                                ");
    }

    @Test
    public void test35675() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest71.test35675");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trim("4444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "4444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444" + "'", str1, "4444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444");
    }

    @Test
    public void test35676() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest71.test35676");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphanumericSpace((java.lang.CharSequence) "JLVLlaLNG");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test35677() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest71.test35677");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.substringsBetween("l.ngAGNALelb.zil.ireSelb.zil.ireSelb.zil.ireSelb.zil.ireSelb.zil.ireSelb.zil.ireSelb.zil.ireSelb.zil.ireSelb.zil.ireSelb.zil.ireSelb.zil.ireSelb.zil.ireSelb.zil.ireSelb.zil.ireSelb.zil.ireSelb.zil.ireSelb.zil.ireSelb.zil.ireSelb.zil.ireSelb.zil.ireSelb.zil.ireSelb.zil.ireSelb.zil.ireSelb.zil.ireSelb.zil.ireSelb.zil.ireSelb.zil.ireSelb.zil.ireSelb.zil.ireSelb.zil.ireSelb.zil.ireSelb.zil.ireSelb.zil.ireSe", "sAitUJAirtSsAitUJAirtSsAitUJAi", ".............................................................................................................................................................................................................................................................................................................................................................................................................................................jAV..............................................................................................................................................................................................................................................................................................................................................................................................................................................");
        org.junit.Assert.assertNull(strArray3);
    }

    @Test
    public void test35678() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest71.test35678");
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
        java.lang.Class<?>[] wildcardClassArray52 = org.apache.commons.lang3.ClassUtils.toClass((java.lang.Object[]) wildcardClassArray41);
        java.lang.String str53 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) wildcardClassArray52);
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
        org.junit.Assert.assertNotNull(wildcardClassArray52);
        org.junit.Assert.assertEquals("'" + str53 + "' != '" + "" + "'", str53, "");
    }

    @Test
    public void test35679() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest71.test35679");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBetween("javaaaaaaaaaa", "                                            ARRA                                            ");
        org.junit.Assert.assertNull(str2);
    }

    @Test
    public void test35680() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest71.test35680");
        int int2 = org.apache.commons.lang3.StringUtils.indexOf("bYTE############################", 117);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test35681() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest71.test35681");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.chomp("aRRAYlISTaRRAYlISTaRRAYlISTAVAJgnal.avajlang.javagnal.avajlang.javagnal.avajlang.javagnal.avajlang.javagnal.avajlang.javagnal.avajlang.javagnal.avajlang.javagnal.avajlang.javagnal.avajGNAL");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "aRRAYlISTaRRAYlISTaRRAYlISTAVAJgnal.avajlang.javagnal.avajlang.javagnal.avajlang.javagnal.avajlang.javagnal.avajlang.javagnal.avajlang.javagnal.avajlang.javagnal.avajlang.javagnal.avajGNAL" + "'", str1, "aRRAYlISTaRRAYlISTaRRAYlISTAVAJgnal.avajlang.javagnal.avajlang.javagnal.avajlang.javagnal.avajlang.javagnal.avajlang.javagnal.avajlang.javagnal.avajlang.javagnal.avajlang.javagnal.avajGNAL");
    }

    @Test
    public void test35682() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest71.test35682");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.reverseDelimited("lyrrtsilyrrtsilyrrlng.jvtsilyrrtsilyrrtsilyrrlngnirtsvj", ' ');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "lyrrtsilyrrtsilyrrlng.jvtsilyrrtsilyrrtsilyrrlngnirtsvj" + "'", str2, "lyrrtsilyrrtsilyrrlng.jvtsilyrrtsilyrrtsilyrrlngnirtsvj");
    }

    @Test
    public void test35683() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest71.test35683");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("class java.lang.Stringclass java.lang.Stringclass java.lang.Stringclass java.lang.Stringclass java.lang.Stringclass java.lang.Stringclass java.lang.Stringclass java.lang.Stringclass java.lang.Stringclass java.lang.Stringclass java.lang.Stringclass java.lang.Stringclass java.lang.Stringclass java.lang.Stringclass java.lang.Stringclass java.lang.Stringclass java.lang.Stringclass java.lang.Stringclass java.lang.Stringclass java.lang.Stringclass java.lang.Stringclass java.lang.Stringclass java.lang.Stringclass java.lang.Stringclass java.lang.Stringclass java.lang.Stringclass java.lang.Stringclass java.lang.Stringclass java.lang.Stringclass java.lang.String", ' ');
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test35684() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest71.test35684");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.split("langAGNALelbazilaireSelbazilaireSelbazilaireSelbazilaireSelbazilaireSelbazilaireSelbazilaireSelbazilaireSelbazilaireSelbazilaireSelbazilaireSelbazilaireSelbazilaireSelbazilaireSelbazilaireSelbazilaireSelbazilaireSelbazilaireSelbazilaireSelbazilaireSelbazilaireSelbazilaireSelbazilaireSelbazilaireSelbazilaireSelbazilaireSelbazilaireSelbazilaireSelbazilaireSelbazilaireSelbazilaireSelbazilaireSelbazilaireSe", '.');
        java.lang.String str4 = org.apache.commons.lang3.ClassUtils.getPackageName((java.lang.Object) "langAGNALelbazilaireSelbazilaireSelbazilaireSelbazilaireSelbazilaireSelbazilaireSelbazilaireSelbazilaireSelbazilaireSelbazilaireSelbazilaireSelbazilaireSelbazilaireSelbazilaireSelbazilaireSelbazilaireSelbazilaireSelbazilaireSelbazilaireSelbazilaireSelbazilaireSelbazilaireSelbazilaireSelbazilaireSelbazilaireSelbazilaireSelbazilaireSelbazilaireSelbazilaireSelbazilaireSelbazilaireSelbazilaireSelbazilaireSe", "ArrayListArrayListArrayListavaj.gnalArrayListArrayListArrayL");
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "java.lang" + "'", str4, "java.lang");
    }

    @Test
    public void test35685() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest71.test35685");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.leftPad("4444444444C4o4e4b4e4i4terf4ce 44444io4Seri44iz4", 14, "                                                                                                                                                                                                                                                                              langajavatsiLyarrAtsiLyarrAtsiLyarrA                                                                                                                                                                                                                                                                              ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "4444444444C4o4e4b4e4i4terf4ce 44444io4Seri44iz4" + "'", str3, "4444444444C4o4e4b4e4i4terf4ce 44444io4Seri44iz4");
    }

    @Test
    public void test35686() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest71.test35686");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphaSpace((java.lang.CharSequence) "######################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################avajgnal.avajgnal.avajgnal.avajgnal.avELBAZILAIREs");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test35687() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest71.test35687");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.rightPad("GNAL.AVAJLANG.JAVAGNAL.AVAJLANG.J", 651);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "GNAL.AVAJLANG.JAVAGNAL.AVAJLANG.J                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                          " + "'", str2, "GNAL.AVAJLANG.JAVAGNAL.AVAJLANG.J                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                          ");
    }

    @Test
    public void test35688() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest71.test35688");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceChars("44444444444444444.444444444444444444...                                 44444444444444444.444444444444444444...                                 44444$", "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                          java.lang.Stringclass... java.lang.Stringclass ...", "INTERFACE JAVA.LANG.cLONEABLEa RRR RRR RRR RRR RRR RRR RRR RRR RNAL....................INTERFACE JAVA.LAN");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "44444444444444444444444444444444444IIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIII44444444444444444444444444444444444IIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIII44444$" + "'", str3, "44444444444444444444444444444444444IIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIII44444444444444444444444444444444444IIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIII44444$");
    }

    @Test
    public void test35689() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest71.test35689");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass1 = org.apache.commons.lang3.ClassUtils.getClass("slitugnirtsslitugnirtsslitugnirtsslitugnirtssl");
            org.junit.Assert.fail("Expected exception of type java.lang.ClassNotFoundException; message: slitugnirtsslitugnirtsslitugnirtsslitugnirtssl");
        } catch (java.lang.ClassNotFoundException e) {
            // Expected exception.
        }
    }

    @Test
    public void test35690() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest71.test35690");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeStartIgnoreCase("1aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "                 ...");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "1aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa" + "'", str2, "1aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
    }

    @Test
    public void test35691() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest71.test35691");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.rightPad("Jsysysys", 0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Jsysysys" + "'", str2, "Jsysysys");
    }

    @Test
    public void test35692() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest71.test35692");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripAccents((java.lang.CharSequence) "ARRAYLISTARRAYLISTARRAYLISTAVAJ.GNAL");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "ARRAYLISTARRAYLISTARRAYLISTAVAJ.GNAL" + "'", str1, "ARRAYLISTARRAYLISTARRAYLISTAVAJ.GNAL");
    }

    @Test
    public void test35693() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest71.test35693");
        java.lang.String str1 = org.apache.commons.lang3.ClassUtils.getPackageCanonicalName("                                                 ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
    }

    @Test
    public void test35694() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest71.test35694");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.stripStart("444444444444444444444444444444444444444444444AAAAAAAAAAAAAAAAAAA4444444444444444444444444444444444444444444444", "interface java.lang.CloneableINTERFACE JAVA.LANG.CLONEABLELANG.GNALJAVA.LANGAVAJ.GNALJAVA.LANGAVAJ.GNALJAVA.LANGAVAJ.GNALJAVA.LANGAVAJ.GNALJAVA.LANGAVAJ.GNALJAVA.LANGAVAJ.GNALJAVA.LANGAVAJ.GNALJAVA.LANGAVAJ.JAVAINTERFACE JAVA.IO.SERIALIZABLEinterface java.io.Serializable");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "444444444444444444444444444444444444444444444AAAAAAAAAAAAAAAAAAA4444444444444444444444444444444444444444444444" + "'", str2, "444444444444444444444444444444444444444444444AAAAAAAAAAAAAAAAAAA4444444444444444444444444444444444444444444444");
    }

    @Test
    public void test35695() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest71.test35695");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.leftPad("                                                                                                                                                                                                                                                                    AtsiLytcejbO.gnal.avaj ssalcrrAtsiLytcejbO.gnal.avaj ssalcrrAva.langGNAL..langjava.langAGNAL.AVAJAtsiLytcejbO.gnal.avaj ssalcrrAtsiLytcejbO.gnal.avaj ssalcrrAva.langGNAL..langjava.langAGNAL.AVAJAtsiLytcejbO.gnal.avaj ssalcrrAtsiLytcejbO.gnal.avaj ssalcrrAva.langGNAL..langjava.langAGNAL.AVAJAtsiLytcejbO.gnal.avaj ssalcrrAtsiLytcejStringAtsiLytcejbO.gnal.avaj ssalcrrAtsiLytcejbO.gnal.avaj ssalcrrAva.langGNAL..langjava.langAGNAL.AVAJAtsiLytcejbO.gnal.avaj ssalcrrAtsiLytcejbO.gnal.avaj ssalcrrAva.langGNAL..langjava.langAGNAL.AVAJAtsiLytcejbO.gnal.avaj ssalcrrAtsiLytcejbO.gnal.avaj ssalcrrAva.langGNAL..langjava.langAGNAL.AVAJAtsiLytcejbO.gnal.avaj ssalcrrAtsiLytcejb", 401, 'a');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "                                                                                                                                                                                                                                                                    AtsiLytcejbO.gnal.avaj ssalcrrAtsiLytcejbO.gnal.avaj ssalcrrAva.langGNAL..langjava.langAGNAL.AVAJAtsiLytcejbO.gnal.avaj ssalcrrAtsiLytcejbO.gnal.avaj ssalcrrAva.langGNAL..langjava.langAGNAL.AVAJAtsiLytcejbO.gnal.avaj ssalcrrAtsiLytcejbO.gnal.avaj ssalcrrAva.langGNAL..langjava.langAGNAL.AVAJAtsiLytcejbO.gnal.avaj ssalcrrAtsiLytcejStringAtsiLytcejbO.gnal.avaj ssalcrrAtsiLytcejbO.gnal.avaj ssalcrrAva.langGNAL..langjava.langAGNAL.AVAJAtsiLytcejbO.gnal.avaj ssalcrrAtsiLytcejbO.gnal.avaj ssalcrrAva.langGNAL..langjava.langAGNAL.AVAJAtsiLytcejbO.gnal.avaj ssalcrrAtsiLytcejbO.gnal.avaj ssalcrrAva.langGNAL..langjava.langAGNAL.AVAJAtsiLytcejbO.gnal.avaj ssalcrrAtsiLytcejb" + "'", str3, "                                                                                                                                                                                                                                                                    AtsiLytcejbO.gnal.avaj ssalcrrAtsiLytcejbO.gnal.avaj ssalcrrAva.langGNAL..langjava.langAGNAL.AVAJAtsiLytcejbO.gnal.avaj ssalcrrAtsiLytcejbO.gnal.avaj ssalcrrAva.langGNAL..langjava.langAGNAL.AVAJAtsiLytcejbO.gnal.avaj ssalcrrAtsiLytcejbO.gnal.avaj ssalcrrAva.langGNAL..langjava.langAGNAL.AVAJAtsiLytcejbO.gnal.avaj ssalcrrAtsiLytcejStringAtsiLytcejbO.gnal.avaj ssalcrrAtsiLytcejbO.gnal.avaj ssalcrrAva.langGNAL..langjava.langAGNAL.AVAJAtsiLytcejbO.gnal.avaj ssalcrrAtsiLytcejbO.gnal.avaj ssalcrrAva.langGNAL..langjava.langAGNAL.AVAJAtsiLytcejbO.gnal.avaj ssalcrrAtsiLytcejbO.gnal.avaj ssalcrrAva.langGNAL..langjava.langAGNAL.AVAJAtsiLytcejbO.gnal.avaj ssalcrrAtsiLytcejb");
    }

    @Test
    public void test35696() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest71.test35696");
        int int3 = org.apache.commons.lang3.StringUtils.indexOf("interfacejava.lang.Cloneable#interfacejava.iointerfacejava.lang.Cloneable#interfacejava.iointerfacejava.lang.Cloneable#interfacejava.iointerfacejavabOOLEANinterfacejava.lang.Cloneable#interfacejava.iointerfacejava.lang.Cloneable#interfacejava.iointerfacejava.lang.Cloneable#interfacejava.iointerfacejava", 169, 924);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test35697() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest71.test35697");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.mid("-1java.utilString[]    ", 193, 9);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test35698() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest71.test35698");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.substringBetween("aaaaaaaaaaaaaaaaaaaaaaaaainterface java.lang.CloneableStringinterface java.io.Serializableaaaaaaaaaaaaaaaaaaaaaaaaa", "java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........javainterface java.io", ".ALya..A                                  $$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$                                  $$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$                                  $$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$                                  $$$$$$$$$$$$$$$$$$$$$$$");
        org.junit.Assert.assertNull(str3);
    }

    @Test
    public void test35699() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest71.test35699");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeStart("JAVAlLANGJAVAlLANGJAVAlLANGJAVAlLANGJAVAlLANGJAVAlLANGJAVAlLANGJAVAlLANGJAVAlLANGJAVAlLANGJAVAlLANGJAVAlLANGJAVAlLANGJAVAlLANGJAVAlLANGJAVAlLANGJAVAlLANGJAVAlLANGJAVAlLANGJAVAlLANGJAVAlLANGJAVAlLANGJAVAlLANGJAVAlLANGJAVAlLANGJAVAlLANGJAjaval.agnjaval.agnjaval.agnjaval.agnjaval.agnjaval.agnjaval.agnjaval.agnjabytejaval.agnjaval.agnjaval.agnjaval.agnjaval.agnjaval.agnjaval.agnjaval.agnjaJAVAlLANGJAVAlLANGJAVAlLANGJAVAlLANGJAVAlLANGJAVAlLANGJAVAlLANGJAVAlLANGJAVAlLANGJAVAlLANGJAVAlLANGJAVAlLANGJAVAlLANGJAVAlLANGJAVAlLANGJAVAlLANGJAVAlLANGJAVAlLANGJAVAlLANGJAVAlLANGJAVAlLANGJAVAlLANGJAVAlLANGJAVAlLANGJAVAlLANGJAVAlLANGJA", "A..ayLA.");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "JAVAlLANGJAVAlLANGJAVAlLANGJAVAlLANGJAVAlLANGJAVAlLANGJAVAlLANGJAVAlLANGJAVAlLANGJAVAlLANGJAVAlLANGJAVAlLANGJAVAlLANGJAVAlLANGJAVAlLANGJAVAlLANGJAVAlLANGJAVAlLANGJAVAlLANGJAVAlLANGJAVAlLANGJAVAlLANGJAVAlLANGJAVAlLANGJAVAlLANGJAVAlLANGJAjaval.agnjaval.agnjaval.agnjaval.agnjaval.agnjaval.agnjaval.agnjaval.agnjabytejaval.agnjaval.agnjaval.agnjaval.agnjaval.agnjaval.agnjaval.agnjaval.agnjaJAVAlLANGJAVAlLANGJAVAlLANGJAVAlLANGJAVAlLANGJAVAlLANGJAVAlLANGJAVAlLANGJAVAlLANGJAVAlLANGJAVAlLANGJAVAlLANGJAVAlLANGJAVAlLANGJAVAlLANGJAVAlLANGJAVAlLANGJAVAlLANGJAVAlLANGJAVAlLANGJAVAlLANGJAVAlLANGJAVAlLANGJAVAlLANGJAVAlLANGJAVAlLANGJA" + "'", str2, "JAVAlLANGJAVAlLANGJAVAlLANGJAVAlLANGJAVAlLANGJAVAlLANGJAVAlLANGJAVAlLANGJAVAlLANGJAVAlLANGJAVAlLANGJAVAlLANGJAVAlLANGJAVAlLANGJAVAlLANGJAVAlLANGJAVAlLANGJAVAlLANGJAVAlLANGJAVAlLANGJAVAlLANGJAVAlLANGJAVAlLANGJAVAlLANGJAVAlLANGJAVAlLANGJAjaval.agnjaval.agnjaval.agnjaval.agnjaval.agnjaval.agnjaval.agnjaval.agnjabytejaval.agnjaval.agnjaval.agnjaval.agnjaval.agnjaval.agnjaval.agnjaval.agnjaJAVAlLANGJAVAlLANGJAVAlLANGJAVAlLANGJAVAlLANGJAVAlLANGJAVAlLANGJAVAlLANGJAVAlLANGJAVAlLANGJAVAlLANGJAVAlLANGJAVAlLANGJAVAlLANGJAVAlLANGJAVAlLANGJAVAlLANGJAVAlLANGJAVAlLANGJAVAlLANGJAVAlLANGJAVAlLANGJAVAlLANGJAVAlLANGJAVAlLANGJAVAlLANGJA");
    }

    @Test
    public void test35700() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest71.test35700");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.containsWhitespace("       .##JAVAL###########################JAVAL###########################JAVAL###########################");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test35701() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest71.test35701");
        char[] charArray11 = new char[] { ' ', ' ', '#', 'a', '4', 'a' };
        int int12 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "", charArray11);
        boolean boolean13 = org.apache.commons.lang3.StringUtils.containsAny("$", charArray11);
        int int14 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "", charArray11);
        boolean boolean15 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "...       AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA", charArray11);
        boolean boolean16 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "String[]", charArray11);
        java.lang.String str18 = org.apache.commons.lang3.ClassUtils.getPackageName((java.lang.Object) boolean16, "...avagnal.avajlang.javagnal.avajlang.javagnal");
        org.junit.Assert.assertNotNull(charArray11);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray11), "  #a4a");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray11), "  #a4a");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray11), "[ ,  , #, a, 4, a]");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "java.lang" + "'", str18, "java.lang");
    }

    @Test
    public void test35702() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest71.test35702");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.substringsBetween("CLASSjava.langAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAulang", "...AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA...AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA...AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA...AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA...AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA...AAA...", "ObjectyList");
        org.junit.Assert.assertNull(strArray3);
    }

    @Test
    public void test35703() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest71.test35703");
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
        java.lang.Class<?>[] wildcardClassArray22 = org.apache.commons.lang3.ClassUtils.primitivesToWrappers(wildcardClassArray21);
        java.lang.Class<?> wildcardClass23 = null;
        java.lang.Class[] classArray25 = new java.lang.Class[1];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray26 = (java.lang.Class<?>[]) classArray25;
        wildcardClassArray26[0] = wildcardClass23;
        java.lang.Class<?>[] wildcardClassArray29 = org.apache.commons.lang3.ClassUtils.primitivesToWrappers(wildcardClassArray26);
        java.lang.Class<?>[] wildcardClassArray30 = org.apache.commons.lang3.ClassUtils.wrappersToPrimitives(wildcardClassArray26);
        boolean boolean32 = org.apache.commons.lang3.ClassUtils.isAssignable(wildcardClassArray21, wildcardClassArray26, false);
        java.lang.String[] strArray35 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("hi!", "");
        java.lang.String[] strArray37 = org.apache.commons.lang3.StringUtils.stripAll(strArray35, "$");
        java.lang.Class<?>[] wildcardClassArray38 = org.apache.commons.lang3.ClassUtils.toClass((java.lang.Object[]) strArray35);
        java.lang.Class<?> wildcardClass39 = null;
        java.lang.Class[] classArray41 = new java.lang.Class[1];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray42 = (java.lang.Class<?>[]) classArray41;
        wildcardClassArray42[0] = wildcardClass39;
        java.lang.Class<?>[] wildcardClassArray45 = org.apache.commons.lang3.ClassUtils.primitivesToWrappers(wildcardClassArray42);
        java.lang.String[] strArray47 = new java.lang.String[] { "                                   " };
        java.lang.String str48 = org.apache.commons.lang3.StringUtils.getCommonPrefix(strArray47);
        java.lang.Class<?>[] wildcardClassArray49 = org.apache.commons.lang3.ClassUtils.toClass((java.lang.Object[]) strArray47);
        java.lang.Class<?> wildcardClass50 = null;
        java.lang.Class[] classArray52 = new java.lang.Class[1];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray53 = (java.lang.Class<?>[]) classArray52;
        wildcardClassArray53[0] = wildcardClass50;
        java.lang.Class<?>[] wildcardClassArray56 = org.apache.commons.lang3.ClassUtils.primitivesToWrappers(wildcardClassArray53);
        boolean boolean57 = org.apache.commons.lang3.ClassUtils.isAssignable(wildcardClassArray49, wildcardClassArray53);
        boolean boolean59 = org.apache.commons.lang3.ClassUtils.isAssignable(wildcardClassArray42, wildcardClassArray53, true);
        boolean boolean61 = org.apache.commons.lang3.ClassUtils.isAssignable(wildcardClassArray38, wildcardClassArray53, false);
        java.lang.Class<?>[] wildcardClassArray62 = org.apache.commons.lang3.ClassUtils.primitivesToWrappers(wildcardClassArray38);
        boolean boolean63 = org.apache.commons.lang3.ClassUtils.isAssignable(wildcardClassArray26, wildcardClassArray38);
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
        org.junit.Assert.assertNotNull(wildcardClassArray30);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertNotNull(strArray35);
        org.junit.Assert.assertNotNull(strArray37);
        org.junit.Assert.assertNotNull(wildcardClassArray38);
        org.junit.Assert.assertNotNull(classArray41);
        org.junit.Assert.assertNotNull(wildcardClassArray42);
        org.junit.Assert.assertNotNull(wildcardClassArray45);
        org.junit.Assert.assertNotNull(strArray47);
        org.junit.Assert.assertEquals("'" + str48 + "' != '" + "                                   " + "'", str48, "                                   ");
        org.junit.Assert.assertNotNull(wildcardClassArray49);
        org.junit.Assert.assertNotNull(classArray52);
        org.junit.Assert.assertNotNull(wildcardClassArray53);
        org.junit.Assert.assertNotNull(wildcardClassArray56);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + false + "'", boolean59 == false);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + false + "'", boolean61 == false);
        org.junit.Assert.assertNotNull(wildcardClassArray62);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + true + "'", boolean63 == true);
    }

    @Test
    public void test35704() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest71.test35704");
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
        java.lang.Class<?>[] wildcardClassArray31 = org.apache.commons.lang3.ClassUtils.wrappersToPrimitives(wildcardClassArray29);
        java.lang.Class<?>[] wildcardClassArray32 = org.apache.commons.lang3.ClassUtils.wrappersToPrimitives(wildcardClassArray29);
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
        org.junit.Assert.assertNotNull(wildcardClassArray32);
    }

    @Test
    public void test35705() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest71.test35705");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.stripStart("                                                                                                                                                                                                                                                                                                                                                                                                          CLASSJAVA.LANGAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAULANG", "...naaaaaaaaaajaval.agnaaaaaaaaaa..");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                                                                                                                                                                                                                                                                                                                                                                                          CLASSJAVA.LANGAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAULANG" + "'", str2, "                                                                                                                                                                                                                                                                                                                                                                                                          CLASSJAVA.LANGAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAULANG");
    }

    @Test
    public void test35706() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest71.test35706");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.defaultIfBlank("ONEABLE#INTERFACEJAVA.IO", "                                                                                                                                                                                                                                                                                                            i4elbaenolC.gnal.avajecafretniTRINGi4elbaenolC.gnal.avajecafretni                                                                                                                                                                                                                                                                                                           ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "ONEABLE#INTERFACEJAVA.IO" + "'", str2, "ONEABLE#INTERFACEJAVA.IO");
    }

    @Test
    public void test35707() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest71.test35707");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "...$$$$$$$$$$$$$$$...                                                                                                                                                                                                                                                              ", "#                                                                                                                                                      ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test35708() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest71.test35708");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBefore("rraylist                            rraylist                            rraylist                            rray$arrayli", "                                                                                                                                                                                                                                                  44444444444444444444-1JAVA444444444444444444444                                                                                                                                                                                                                                                   ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "rraylist                            rraylist                            rraylist                            rray$arrayli" + "'", str2, "rraylist                            rraylist                            rraylist                            rray$arrayli");
    }

    @Test
    public void test35709() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest71.test35709");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("GNALgn                                            ", "JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA", 940);
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void test35710() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest71.test35710");
        int int3 = org.apache.commons.lang3.StringUtils.indexOf("                    Integer                          ", 71, (int) (byte) -1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test35711() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest71.test35711");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("gnal.aL.ArrayListgnal.aL.ArrayList", "interf$ce#j$v$.l$ng.Clone$ble....................................................................#######################JAVAULANGinterf$ce#j$v$.io.Seri$liz$ble");
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray2, "AAAAjGNALAAAAAjAAAAAAAAjAGNALAAVAJ                                                                  ");
        java.lang.String str5 = org.apache.commons.lang3.StringUtils.getCommonPrefix(strArray2);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "gnal.aL.ArrayListgnal.aL.ArrayList" + "'", str4, "gnal.aL.ArrayListgnal.aL.ArrayList");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "gnal.aL.ArrayListgnal.aL.ArrayList" + "'", str5, "gnal.aL.ArrayListgnal.aL.ArrayList");
    }

    @Test
    public void test35712() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest71.test35712");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNotBlank((java.lang.CharSequence) "aaaaaaaaaaaa");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test35713() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest71.test35713");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "ArrayLast", "ARRAYLIS...VA.LANGAVAJ.GNALJAVA.LANGAVAJ.GNALJAVA.LANGAVAJ.GNALJAVA.LANGAVAJ.GNALJAVA.LANGAVAJ.GNALJAVA.LANG");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test35714() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest71.test35714");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNumeric((java.lang.CharSequence) "AAAAAAAAAAngalavajAAAAAAAAAAngalavajAAAAAAAAAAngalavajAAAAAAAAAAngalavajAAAAAAAAAAngalavajAAAAAAAAAAngalavajAAAAAAAAAAngalavajAAAAAAAAAAngalavajAAAAAAAAAAngalavajAAAAAAAAAAngalavajAAAAAAAAAAngalavajAAAAAAAAAAngalavajAAAAAAAAAAngalavajAAAAAAAAAAngalavajAAAAAAAAAAngalavajAAAAAAAAAAngalavajAAAAAAAAAAngalavajAAAAAAAAAAngalavajAAAAAAAAAAngalavajAAAAAAAAAAngalavajAAAAAAAAAAngalavajAAAAAAAAAAngalavajAAAAAAAAAAngalavajAAAAAAAAAAngalavajAAAAAAAAAAngalavajAAAAAAAAAAngalavajAAAAAAAAAAngalavajAAAAAAAAAAngalavajAAAAAAAAAAngalavajAAAAAAAAAAngalavajAAAAAAAAAAngalavajAAAAAAAAAAngalavajAAAAAAAAAAngalavajAAAAAAAAAAngalavajAAAAAAAAAAngalavajAAAAAAAAAA][gnirtSlitu.avaj1-][gnirtSlitu.avaj1-");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test35715() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest71.test35715");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("##################################################################################a...#################################################################################", "");
        int int3 = org.apache.commons.lang3.StringUtils.indexOfDifference((java.lang.CharSequence[]) strArray2);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test35716() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest71.test35716");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.leftPad("                                                                                                                                                                                                                                                #########################sClassslitUgnirtSslitUgnirtSslitUgnirtSslitUgnirtSslitUgnirtSslitUgnirtSslitUgnirtSslitUgnirtSslitUgnirtSslitUgnirtS##########################                                                                                                                                                                                                                                                                                                                                                                                                                                        Serializabl                         ", 905, '#');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "######################################                                                                                                                                                                                                                                                #########################sClassslitUgnirtSslitUgnirtSslitUgnirtSslitUgnirtSslitUgnirtSslitUgnirtSslitUgnirtSslitUgnirtSslitUgnirtSslitUgnirtS##########################                                                                                                                                                                                                                                                                                                                                                                                                                                        Serializabl                         " + "'", str3, "######################################                                                                                                                                                                                                                                                #########################sClassslitUgnirtSslitUgnirtSslitUgnirtSslitUgnirtSslitUgnirtSslitUgnirtSslitUgnirtSslitUgnirtSslitUgnirtSslitUgnirtS##########################                                                                                                                                                                                                                                                                                                                                                                                                                                        Serializabl                         ");
    }

    @Test
    public void test35717() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest71.test35717");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeStartIgnoreCase("                                                                                                     JAVAGNAL", "gnal      ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                                                                                     JAVAGNAL" + "'", str2, "                                                                                                     JAVAGNAL");
    }

    @Test
    public void test35718() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest71.test35718");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.abbreviate("class java.lang", 406);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "class java.lang" + "'", str2, "class java.lang");
    }

    @Test
    public void test35719() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest71.test35719");
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.overlay("                                                                                                                                                                                                                                                                                                                                                                ARRAYLISTARRAYLISTARRAYLISTAVAJ                                                                                                                                                                                                                                                                                                                                                                ", ".............][ssalc                         .............", 116, 0);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + ".............][ssalc                         .............                                                                                                                                                                                                                                            ARRAYLISTARRAYLISTARRAYLISTAVAJ                                                                                                                                                                                                                                                                                                                                                                " + "'", str4, ".............][ssalc                         .............                                                                                                                                                                                                                                            ARRAYLISTARRAYLISTARRAYLISTAVAJ                                                                                                                                                                                                                                                                                                                                                                ");
    }

    @Test
    public void test35720() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest71.test35720");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.stripStart("JLVLlaLNG                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                  ", "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "JLVLlaLNG                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                  " + "'", str2, "JLVLlaLNG                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                  ");
    }

    @Test
    public void test35721() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest71.test35721");
        char[] charArray1 = null;
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "nAAAAAAAAAAjavalagnAAAAAAAAAA", charArray1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test35722() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest71.test35722");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.startsWith("gnirtS.gnal.avaj ssalcgnirtS.gnal.avaj ssalcgnirtS.gnal.avaj ssalcgnirtS.gnal.avaj ssalcgnirtS.gnal.avaj ssalcgnirtS.gnal.avaj ssalcgnirtS.gnal.avaj ssalcgnirtS.gnal.avaj ssalcgnirtS.gnal.avaj ssalcgnirtS.gnal.avaj ssalcgnirtS.gnal.avaj ssalcgnirtS.gnal.avaj ssalcgnirtS.gnal.avaj ssalcgnirtS.gnal.avaj ssalcgnirtS.gnal.avaj ssalcgnirtS.gnal.avaj ... .... .java.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.lang... .... .java.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.lang... .... .java.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.lang... .... .java.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.lang... .... .java.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.lang... .... .4444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444", "tsilyarrgnaluavaj.tsilyarrgnaluavaj");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test35723() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest71.test35723");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.rightPad("cLASSjavaulangjavaulangjavaulangjavaulangjavaulangjavaulangjavaulangjavaulangjavaulangjavaulangjavaulangjavaulangjavaulangjavaulangjavaulangjavaulangjavaulangjavaulangjavaulangjavaulang", 52, '$');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "cLASSjavaulangjavaulangjavaulangjavaulangjavaulangjavaulangjavaulangjavaulangjavaulangjavaulangjavaulangjavaulangjavaulangjavaulangjavaulangjavaulangjavaulangjavaulangjavaulangjavaulang" + "'", str3, "cLASSjavaulangjavaulangjavaulangjavaulangjavaulangjavaulangjavaulangjavaulangjavaulangjavaulangjavaulangjavaulangjavaulangjavaulangjavaulangjavaulangjavaulangjavaulangjavaulangjavaulang");
    }

    @Test
    public void test35724() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest71.test35724");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens(".......java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java", ".         4444");
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test35725() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest71.test35725");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replace("               ...", "aaaaaaaaaaaa", "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                           ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "               ..." + "'", str3, "               ...");
    }

    @Test
    public void test35726() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest71.test35726");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfDifference((java.lang.CharSequence) "JAVAlLANGJAVA.LANGAVAJ.GNALJAVA.LANGAVAJ.GNALJAVA.LANGAVAJ.GNALJAVA.LANGAVAJ.GNALJAVA.LANGAVAJ.GNALJAVA.LANGAVAJ.GNALJAVA.LANGAVAJ.GNALJAVA.LANGAVAJ.GNALJAVA.LANG", (java.lang.CharSequence) "GNALUAVAJ                       GNALUAVAJ                       SSALCGNALAVAJavajlitu");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test35727() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest71.test35727");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass1 = org.apache.commons.lang3.ClassUtils.getClass("444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa       444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444");
            org.junit.Assert.fail("Expected exception of type java.lang.ClassNotFoundException; message: 444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444");
        } catch (java.lang.ClassNotFoundException e) {
            // Expected exception.
        }
    }

    @Test
    public void test35728() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest71.test35728");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.rightPad("interface java.lang.Cloneablenterface java.lang.CloneableAvaj.gnalinterface java.io.Serializablenterface java.lang.CloneableAvaj.gnalinterface java.io.Serializablenterface java.lang.CloneableAvaj.gnalinterface java.io.Serializablenterface java.lang.CloneableAvaj.gnalinterface java.io.Serializablenterface java.lang.CloneableAvaj.gnalinterface java.io.Serializablenterface java.lang.CloneableAvaj.gnalinterface java.io.Serializablenterface java.lang.CloneableAvaj.gnalinterface java.io.Serializablenterface java.lang.CloneableAvaj.gnalinterface java.io.Serializablenterface java.lang.CloneableAvaj.gnalinterface java.io.Serializablenterface java.lang.CloneableAvaj.gnalinterface java.io.Serializablenterface java.lang.CloneableAvaj.gnalinterface java.io.Serializablenterface java.lang.CloneableA...O.gnal.avaj ssalcr4444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444interface java.io.Serializable", 162, "44444444444444444444444444444444444444444444444444444444444444444444444444444444         ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "interface java.lang.Cloneablenterface java.lang.CloneableAvaj.gnalinterface java.io.Serializablenterface java.lang.CloneableAvaj.gnalinterface java.io.Serializablenterface java.lang.CloneableAvaj.gnalinterface java.io.Serializablenterface java.lang.CloneableAvaj.gnalinterface java.io.Serializablenterface java.lang.CloneableAvaj.gnalinterface java.io.Serializablenterface java.lang.CloneableAvaj.gnalinterface java.io.Serializablenterface java.lang.CloneableAvaj.gnalinterface java.io.Serializablenterface java.lang.CloneableAvaj.gnalinterface java.io.Serializablenterface java.lang.CloneableAvaj.gnalinterface java.io.Serializablenterface java.lang.CloneableAvaj.gnalinterface java.io.Serializablenterface java.lang.CloneableAvaj.gnalinterface java.io.Serializablenterface java.lang.CloneableA...O.gnal.avaj ssalcr4444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444interface java.io.Serializable" + "'", str3, "interface java.lang.Cloneablenterface java.lang.CloneableAvaj.gnalinterface java.io.Serializablenterface java.lang.CloneableAvaj.gnalinterface java.io.Serializablenterface java.lang.CloneableAvaj.gnalinterface java.io.Serializablenterface java.lang.CloneableAvaj.gnalinterface java.io.Serializablenterface java.lang.CloneableAvaj.gnalinterface java.io.Serializablenterface java.lang.CloneableAvaj.gnalinterface java.io.Serializablenterface java.lang.CloneableAvaj.gnalinterface java.io.Serializablenterface java.lang.CloneableAvaj.gnalinterface java.io.Serializablenterface java.lang.CloneableAvaj.gnalinterface java.io.Serializablenterface java.lang.CloneableAvaj.gnalinterface java.io.Serializablenterface java.lang.CloneableAvaj.gnalinterface java.io.Serializablenterface java.lang.CloneableA...O.gnal.avaj ssalcr4444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444interface java.io.Serializable");
    }

    @Test
    public void test35729() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest71.test35729");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNumericSpace((java.lang.CharSequence) "$$$$$$$$$$$$$$$$$$$$$$$$$$$$$...$$$$$$$$$$$$$$$$$$$$$$$$$$$$$...$$$$$$$$$$$$$$$$$$$$$$$$$$                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                            ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test35730() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest71.test35730");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.substringBetween("AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA                                            .AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA", "saitujairtssaitujairtssaitujairtssaitujairtssaitujairtssaitujairtssaitujairtssaitujairtssaitujairtssaitujairts", "...aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertNull(str3);
    }

    @Test
    public void test35731() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest71.test35731");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfIgnoreCase("aaaaaaaautilaaaaaaaaa", "4444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444...AAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test35732() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest71.test35732");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.split("", "lass...", 893);
        java.lang.Class<?> wildcardClass4 = strArray3.getClass();
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test35733() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest71.test35733");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replace("A..AYL A.44444444444444444444444444                                                 $$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$", "interface java.lang.Cloneable.......java.......Objectava..........javainterface java.io.Serializable###########################################################################################################################################################################################################", "                                                                                                                                                                                                                                                Java.io.Serializable interface java.lang.Cloneable... interface                                                                                                                                                                                                                                                 ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "A..AYL A.44444444444444444444444444                                                 $$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$" + "'", str3, "A..AYL A.44444444444444444444444444                                                 $$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$");
    }

    @Test
    public void test35734() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest71.test35734");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOfIgnoreCase("IO", "GNALAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAACharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterChara", 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test35735() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest71.test35735");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isEmpty((java.lang.CharSequence) "false.lang.Stringclass java.lang.Stringclass java.lang.Stringclasinterface java.lang.Cloneable$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$interface java.io.Serializable");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test35736() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest71.test35736");
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
        java.lang.Class<?>[] wildcardClassArray32 = org.apache.commons.lang3.ClassUtils.primitivesToWrappers(wildcardClassArray30);
        java.lang.String str36 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) wildcardClassArray30, "UTILsTRINGUTILsTRING-1JAVA-1JAVA", 881, 5);
        java.lang.String str40 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) wildcardClassArray30, "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaase...aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", 931, 0);
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
        org.junit.Assert.assertNotNull(wildcardClassArray32);
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "" + "'", str36, "");
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "" + "'", str40, "");
    }

    @Test
    public void test35737() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest71.test35737");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringAfter("interfacejava.lang.Cloneable4iGNIRTinterfacejava.lang.Cloneable4i", "V");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test35738() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest71.test35738");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("CAFRETNI");
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test35739() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest71.test35739");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.defaultString("                                                                                        i4elbaenolC.gnal.avaj ecafretniTRINGi4elbaenolC.gnal.avaj ecafCLASS JAVALANGCLASS                       JAVAULANG                       JAVAULANG                       JAVAULAN");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "                                                                                        i4elbaenolC.gnal.avaj ecafretniTRINGi4elbaenolC.gnal.avaj ecafCLASS JAVALANGCLASS                       JAVAULANG                       JAVAULANG                       JAVAULAN" + "'", str1, "                                                                                        i4elbaenolC.gnal.avaj ecafretniTRINGi4elbaenolC.gnal.avaj ecafCLASS JAVALANGCLASS                       JAVAULANG                       JAVAULANG                       JAVAULAN");
    }

    @Test
    public void test35740() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest71.test35740");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.equals((java.lang.CharSequence) "GNALaRRAYlISTaRRAYlISTaRRAYlISTAVAJ.GNALaRRAYlISTaRRAYlISTaRRAYlI...Al.aRRAYlISTGNAL.Al.aRRAYlIST...Al.aRRAYlISTGNAL.Al.aRRAYlIST...Al.aRRAYlISTGNAL.Al.", (java.lang.CharSequence) "RFACE JAVA.LANG.CLONEABLE");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test35741() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest71.test35741");
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("4444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444aaaaaaaaaa", "SERIALIZABLE");
        java.lang.String str5 = org.apache.commons.lang3.StringUtils.getCommonPrefix(strArray4);
        java.lang.String[] strArray9 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("BOOLEAN", "java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java.......", (int) (byte) 100);
        java.lang.String str10 = org.apache.commons.lang3.StringUtils.replaceEachRepeatedly("ArrayListArrayListArrayList", strArray4, strArray9);
        java.lang.String[] strArray15 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("etyB", "...       444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444", (int) (byte) 10);
        int int16 = org.apache.commons.lang3.StringUtils.indexOfAny("interface java.lang.Cloneable#interface java.io.Serializable", strArray15);
        java.lang.String[] strArray18 = org.apache.commons.lang3.StringUtils.stripAll(strArray15, "ava.lang.Cloneable.......java.......");
        java.lang.String[] strArray20 = org.apache.commons.lang3.StringUtils.stripAll(strArray18, "                                                                             SE...               ...");
        java.lang.String str21 = org.apache.commons.lang3.StringUtils.replaceEachRepeatedly("$$$$$$$$$$$$$$$$$$$..$                                                                 AtsiLytcejbOlvjsslcrrAtsiLytcejbO.gnal.avaj ssalcrrAva.langGNAL..langjava.langAGNAL.AVAJ$$$$$$$$$$$$$$$$$$$..$$", strArray4, strArray18);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "4444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444aaaaaaaaaa" + "'", str5, "4444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444aaaaaaaaaa");
        org.junit.Assert.assertNotNull(strArray9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "ArrayListArrayListArrayList" + "'", str10, "ArrayListArrayListArrayList");
        org.junit.Assert.assertNotNull(strArray15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertNotNull(strArray18);
        org.junit.Assert.assertNotNull(strArray20);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "$$$$$$$$$$$$$$$$$$$..$                                                                 AtsiLytcejbOlvjsslcrrAtsiLytcejbO.gnal.avaj ssalcrrAva.langGNAL..langjava.langAGNAL.AVAJ$$$$$$$$$$$$$$$$$$$..$$" + "'", str21, "$$$$$$$$$$$$$$$$$$$..$                                                                 AtsiLytcejbOlvjsslcrrAtsiLytcejbO.gnal.avaj ssalcrrAva.langGNAL..langjava.langAGNAL.AVAJ$$$$$$$$$$$$$$$$$$$..$$");
    }

    @Test
    public void test35742() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest71.test35742");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.chop("ITU.AVAj                                                                                                                                                                                                                                                                                                                                                                                                                 ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "ITU.AVAj                                                                                                                                                                                                                                                                                                                                                                                                                " + "'", str1, "ITU.AVAj                                                                                                                                                                                                                                                                                                                                                                                                                ");
    }

    @Test
    public void test35743() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest71.test35743");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.leftPad("java.lang.stringclass java.lang.stringclass java.lang.stringclas.lang.stringclass java.lang.stringc", 206);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                                                                                           java.lang.stringclass java.lang.stringclass java.lang.stringclas.lang.stringclass java.lang.stringc" + "'", str2, "                                                                                                           java.lang.stringclass java.lang.stringclass java.lang.stringclas.lang.stringclass java.lang.stringc");
    }

    @Test
    public void test35744() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest71.test35744");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("interfacejava.lang.Cloneable#interfacejava.io", "                          ", 4);
        java.lang.String[] strArray5 = org.apache.commons.lang3.StringUtils.stripAll(strArray3, "Serializabl...     java44444444444444444.4444");
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertNotNull(strArray5);
    }

    @Test
    public void test35745() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest71.test35745");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBetween("-1", "stArrayListArrayListavaj.gnalArrayListArrayListArrayListavaj.gnalArrayListArrayLis");
        org.junit.Assert.assertNull(str2);
    }

    @Test
    public void test35746() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest71.test35746");
        int int3 = org.apache.commons.lang3.StringUtils.lastOrdinalIndexOf("langagnalj", "Av", 360);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test35747() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest71.test35747");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "ls", "...VA.LANGAVAJ.GNALa.lang.CloneableStringinterfacejava.io...VA.LANGAVAJ.GNALJ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test35748() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest71.test35748");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.mid("$         44444444444444444444444444444444444444444444444444444444444444444444444444444444                                                           ...saitujairtssaijavaulainterface java.lang.cloneable4interface java.io.serializable...saitujairtssaijavaulainterface java.lang.cloneable4interface java.io.serializable...saitujairtssaijavaulainterface java.lang.cloneable4interface java.io.serializable...saitujairtssaijavaulainterface java.lang.cloneable4interface java.io.serializabl", (int) ' ', 12);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "444444444444" + "'", str3, "444444444444");
    }

    @Test
    public void test35749() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest71.test35749");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.chomp("#JLVLlaLNJLVLlaLNJLVLlaLNJLVLlaLNJLVLlaLNJLVLlaLNJLVLlaLN");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "#JLVLlaLNJLVLlaLNJLVLlaLNJLVLlaLNJLVLlaLNJLVLlaLNJLVLlaLN" + "'", str1, "#JLVLlaLNJLVLlaLNJLVLlaLNJLVLlaLNJLVLlaLNJLVLlaLNJLVLlaLN");
    }

    @Test
    public void test35750() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest71.test35750");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "$#######$########", "JAVAL.AGNaaaaaaaaaaJAVAL.AGNaaaaaaaaaaJAVAL.AGNaaaaaaaaaaJAVAL.AGNaaaaaaaaaaJAVAL.AGNaaaaaaaaaaJAVAL.AGNaaaaaaaaaaJAVAL.AGNaaaaaaaaaaJAVAL.AGNaaaaaaaaaaJAVAL.AGNaaaaaaaaaaJAVAL.AGNaaaaaaaaaaJAVAL.AGNaaaaaaaaaaJAVAL.AGNaaaaaaaaaaJAVAL.AGNaaaaaaaaaaJAVAL.AGNaaaaaaaaaaJAVAL.AGNaaaaaaaaaaJAVAL.AGNaaaaaaaaaaJAVAL.AGNaaaaaaaaaaJAVAL.AGNaaaaaaaaaaJAVAL.AGNaaaaaaaaaaJAVAL.AGNaaaaaaaaaaJAVAL.AGNaaaaaaaaaaJAVAL.AGNaaaaaaaaaaJAVAL.AGNaaaaaaaaaaJAVAL.AGNaaaaaaaaaaJAVAL.AGNaaaaaaaaaaJAVAL.AGNaaaaaaaaaaJAVAL.AGNaaaaaaaaaaJAVAL.AGNaaaaaaaaaaJAVAL.AGNaaaaaaaaaaJAVAL.AGNaaaaaaaaaaJAVAL.AGNaaaaaaaaaaJAVAL.AGNaaaaaaaaaaJAVAL.AGNaaaaaaaaaaJAVAL");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test35751() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest71.test35751");
        int int3 = org.apache.commons.lang3.StringUtils.indexOfIgnoreCase("           ", "#############################################################################################################################################################################################################################################################################################################################################################################################################################################################....java......##############################################################################################################################################################################################################################################################################################################################################################################################################################################################", 57);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test35752() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest71.test35752");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("TERFACE JAVA.LANG.cLONEABLE.......JAVA..........JAVA..........JAVA..........JAVA..........JA...", "gnAls4444", 406);
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void test35753() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest71.test35753");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trimToNull("interf ce j v  l ng Clone ble interf ce j v  io Seri liz ble");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "interf ce j v  l ng Clone ble interf ce j v  io Seri liz ble" + "'", str1, "interf ce j v  l ng Clone ble interf ce j v  io Seri liz ble");
    }

    @Test
    public void test35754() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest71.test35754");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripToNull("4444444444444                                                                                                                                               ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "4444444444444" + "'", str1, "4444444444444");
    }

    @Test
    public void test35755() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest71.test35755");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.startsWithIgnoreCase("                                     ruvj", "NAELOOB                                                                                                                                                                                                                                                                                                                                                                                                                                                                                        ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test35756() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest71.test35756");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isEmpty((java.lang.CharSequence) ".ava.ava.ava.ava.ava.ava.ava.ava.ava.ava.ava.ava.ava.ava.ava.av.ava.ava.ava.ava.ava.ava.ava.ava.ava.ava.ava.ava.ava.ava.ava.av");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test35757() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest71.test35757");
        int int2 = org.apache.commons.lang3.StringUtils.getLevenshteinDistance((java.lang.CharSequence) "INTERFACEJAVA.LANG.CLONEABLESTRINGINTERFACEJAVA..............................................................................................................................................................................................................................................................jvstringnlrrylistrrylistrrylistv..............................................................................................................................................................................................................................................................", (java.lang.CharSequence) "                                        javaulang                                         ");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 584 + "'", int2 == 584);
    }

    @Test
    public void test35758() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest71.test35758");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.rightPad("interfacejava.lang.Cloneable#interfacejava.io.Serializable                                ", 501, "interface java.lang.Cloneableainterface java.io.Serializabl");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "interfacejava.lang.Cloneable#interfacejava.io.Serializable                                interface java.lang.Cloneableainterface java.io.Serializablinterface java.lang.Cloneableainterface java.io.Serializablinterface java.lang.Cloneableainterface java.io.Serializablinterface java.lang.Cloneableainterface java.io.Serializablinterface java.lang.Cloneableainterface java.io.Serializablinterface java.lang.Cloneableainterface java.io.Serializablinterface java.lang.Cloneableainterface java.io.Serializa" + "'", str3, "interfacejava.lang.Cloneable#interfacejava.io.Serializable                                interface java.lang.Cloneableainterface java.io.Serializablinterface java.lang.Cloneableainterface java.io.Serializablinterface java.lang.Cloneableainterface java.io.Serializablinterface java.lang.Cloneableainterface java.io.Serializablinterface java.lang.Cloneableainterface java.io.Serializablinterface java.lang.Cloneableainterface java.io.Serializablinterface java.lang.Cloneableainterface java.io.Serializa");
    }

    @Test
    public void test35759() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest71.test35759");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.deleteWhitespace("JAVALIT");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "JAVALIT" + "'", str1, "JAVALIT");
    }

    @Test
    public void test35760() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest71.test35760");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.defaultString(".........................................................................................................................................................................................................................................................................................................Airfco$irfiosriizcirfco$irfiosriizObirfco$irfiosriizecirfco$irfiosriizL..........................................................................................................................................................................................................................................................................................................");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + ".........................................................................................................................................................................................................................................................................................................Airfco$irfiosriizcirfco$irfiosriizObirfco$irfiosriizecirfco$irfiosriizL.........................................................................................................................................................................................................................................................................................................." + "'", str1, ".........................................................................................................................................................................................................................................................................................................Airfco$irfiosriizcirfco$irfiosriizObirfco$irfiosriizecirfco$irfiosriizL..........................................................................................................................................................................................................................................................................................................");
    }

    @Test
    public void test35761() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest71.test35761");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOf("aaAyLAsAaaAyLAsAaAaAu.A.tefAceaAaA..A...C.o.eAb.e4.tefAceaAaA.o.SeA.zAb.eaaAyLAsAaaAyLAsA", 11, 84);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test35762() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest71.test35762");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfAnyBut("JAVA#############################################################################################", "$$$$$$jav");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test35763() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest71.test35763");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.contains("44444444444444444444444444444444444444444444444444aaaaaaaaaa...", 0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test35764() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest71.test35764");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trimToEmpty("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaara                                            ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaara" + "'", str1, "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaara");
    }

    @Test
    public void test35765() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest71.test35765");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.center("                                                                                                                                                                                                                             va.langGNAL..la..                                                                                   etyBetyBetyBetyBetyBetyBetyBetyBetyBetyBetyBetyBetyBetyBetyBetyBetyBetyBetyBetyBetyBetyBetyB                                                                                                                                                                                                                             va.langGNAL..la..                                                                                    ", 257);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                                                                                                                                                                                                             va.langGNAL..la..                                                                                   etyBetyBetyBetyBetyBetyBetyBetyBetyBetyBetyBetyBetyBetyBetyBetyBetyBetyBetyBetyBetyBetyBetyB                                                                                                                                                                                                                             va.langGNAL..la..                                                                                    " + "'", str2, "                                                                                                                                                                                                                             va.langGNAL..la..                                                                                   etyBetyBetyBetyBetyBetyBetyBetyBetyBetyBetyBetyBetyBetyBetyBetyBetyBetyBetyBetyBetyBetyBetyB                                                                                                                                                                                                                             va.langGNAL..la..                                                                                    ");
    }

    @Test
    public void test35766() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest71.test35766");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.endsWithIgnoreCase("sAitUJAirtSsAitUJAirtSsAitUJAi", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaase...aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test35767() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest71.test35767");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.substringBetween("sERILIZBL                         ", "     A..ayL A.44444444444444444444444444      ", "interfacejava.lang.CloneableJ#v#.l#ngj#v#.l#ngj#v#.l#ngj#v#.l#ngj#v#.l#ngj#v#.l#ngj#v#.l#ngj#v#.l#ngj#v#.l#ngj#v#.l#ngj#v#.l#ngj#v#.l#ngj#v#.l#ngj#v#.l#ngj#v#.l#ngj#v#.l#ngj#v#.l#ngj#v#.l#ngj#v#.l#ngj#v#.l#ngj#v#.l#ngj#v#.l#ngj#v#.l#ngj#v#.l#ngj#v#.l#ngj#v#.l#ngj#v#.l#ngj#v#.l#ngj#v#.l#ngj#v#.l#ngj#v#.l#ngj#v#.l#ngj#v#.l#nginterfacejava.io.Serializabl$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$");
        org.junit.Assert.assertNull(str3);
    }

    @Test
    public void test35768() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest71.test35768");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphaSpace((java.lang.CharSequence) "          j#v## # n          j#v## # n          j#v## # n          j#v## # n          j#v## # n          j#v## # n          j#v## # n          j#v## # n          j#v## # n          j#v## # n          j#v## # n          j#v## # n          j#                                                     j#v## # n          j#v## # n          j#v## # n          j#v## # n          j#v## # n          j#v## # n          j#v## # n          j#v## # n          j#v## # n          j#v## # n          j#v## # n          j#v## # n          rin ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test35769() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest71.test35769");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAllLowerCase((java.lang.CharSequence) "         util         ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test35770() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest71.test35770");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfAnyBut("Java.io.Serializable interface java.lang.Cloneable... interface", "cterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterChar");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test35771() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest71.test35771");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphanumericSpace((java.lang.CharSequence) "                                                                            ][GNIRTSLITU.AVAJ1");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test35772() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest71.test35772");
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.split("", "arraylist");
        boolean boolean5 = org.apache.commons.lang3.StringUtils.endsWithAny("java", strArray4);
        java.lang.String str6 = org.apache.commons.lang3.StringUtils.getCommonPrefix(strArray4);
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.concatWith("                                                                                                                                                                                                                             va.langGNAL..la..                                                                                   etyBetyBetyBetyBetyBetyBetyBetyBetyBetyBetyBetyBetyBetyBetyBetyBetyBetyBetyBetyBetyBetyBetyB                                                                                                                                                                                                                             va.langGNAL..la..                                                                                    ", (java.lang.Object[]) strArray4);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
    }

    @Test
    public void test35773() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest71.test35773");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.right("LANGH!IH!IH!IH!IH!IH!", 173);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "LANGH!IH!IH!IH!IH!IH!" + "'", str2, "LANGH!IH!IH!IH!IH!IH!");
    }

    @Test
    public void test35774() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest71.test35774");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "interfacejava.lang.Cloneable...interfacejava.iointerfacejava.lang.Cloneable...interfacejava.iointerfacejava.lang.Cloneable...interfacejava.iointerfacejava.lang.Cloneable...interfacejava.iointerfacejava.lang.Cloneable...interfacejava.iointerfacejava.lang.Cloneable...interfacejava.iointerfacejava.lang.Cloneable...interfacejava.iointerfacejava.lang.Cloneable...interfaJAVA.LANGAgnal.avajgnal..LANGgnal.avArrclass java.lang.ObjectyListArrclass java.lang.ObjectyListAinterfacejava.lang.Cloneable...interfacejava.iointerfacejava.lang.Cloneable...interfacejava.iointerfacejava.lang.Cloneable...interfacejava.iointerfacejava.lang.Cloneable...interfacejava.iointerfacejava.lang.Cloneable...interfacejava.iointerfacejava.lang.Cloneable...interfacejava.iointerfacejava.lang.Cloneable...interfacejava.iointerfacejava.lang.Cloneable...interfac", "                  ...                         $$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test35775() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest71.test35775");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphanumeric((java.lang.CharSequence) "ja");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test35776() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest71.test35776");
        int int3 = org.apache.commons.lang3.StringUtils.lastOrdinalIndexOf("gnalArrayListArrayListArrayLi", "4444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444", 59);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test35777() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest71.test35777");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBetween("$         44444444444444444444444444444444444444444444444444444444444444444444444444444444                                                           ", "aaaa                       javaulangrraylist");
        org.junit.Assert.assertNull(str2);
    }

    @Test
    public void test35778() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest71.test35778");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceChars("#agnaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaajaval#.aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaajaval#", "etyBetyBetyBetyBetyBetyBetyBetyBetyBetyBetyBetyBetyBetyBetyBetyBetyBetyBetyBetyBetyBetyBety", "javastring...");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "#agnaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaajaval#.aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaajaval#" + "'", str3, "#agnaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaajaval#.aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaajaval#");
    }

    @Test
    public void test35779() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest71.test35779");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBeforeLast("................................................................................................................................................................................................................................................................................................................................................................................ArryList....................................................................................................................................................................................................................................................................................................................................................................................................................................................................................", "...nAAAAAAAAAAjaval.agnAAAAAAAAAA.....nAAAAAAAAAAjaval.agnAAAAAAAAAA.....nAAAAAAAAAAjaval.agnAAAAAAAAAA.....nAAAAAAAAAAjaval.agnAAAAAAAAAA.....nAAAAAAAAAAjaval.agnAAAAAAAAAA.....nAAAAAAAAAAjaval.agnAAAAAAAAAA.....nAAAAAAAAAAjaval.agnAAAAAAAAAA.....nAAAAAAAAAAjaval.agnAAAAAAAAAA.....nAAAAAAAAAAjaval.agnAAAAAAAAAA.....nAAAAAAAAAAjaval.agnAAAAAAAAAA.....nAAAAAAAAAAjaval.agnAAAAAAAAAA.....nAAAAAAAAAAjaval.agnAAAAAAAAAA.....nAAAAAAAAAAjaval.agnAAAAAAAAAA.....nAAAAAAAAAAjaval.agnAAAAAAAAAA.....nAAAAAAAAAAjaval.agnAAAAAAAAAA.....nAAAAAAAAAAjaval.agnAAAAAAAAAA.....nAAAAAAAAAAjaval.agnAAAAAAAAAA.....nAAAAAAAAAAjaval.agnAAAAAAAAAA.....nAAAAAAAAAAjaval.agnAAAAAAAAAA.....nAAAAAAAAAAjaval.agnAAAAAAAAAA.....nAAAAAAAAAAjaval.agnAAAAAAAAAA.....nAAAAAAAAAAjaval.agnAAAAAAAAAA....                                                                       JAVAsTRI");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "................................................................................................................................................................................................................................................................................................................................................................................ArryList...................................................................................................................................................................................................................................................................................................................................................................................................................................................................................." + "'", str2, "................................................................................................................................................................................................................................................................................................................................................................................ArryList....................................................................................................................................................................................................................................................................................................................................................................................................................................................................................");
    }

    @Test
    public void test35780() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest71.test35780");
        java.lang.Class<?>[] wildcardClassArray0 = null;
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
        java.lang.Class<?>[] wildcardClassArray22 = org.apache.commons.lang3.ClassUtils.toClass((java.lang.Object[]) wildcardClassArray4);
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
        boolean boolean44 = org.apache.commons.lang3.ClassUtils.isAssignable(wildcardClassArray4, wildcardClassArray39, false);
        java.lang.Class<?> wildcardClass45 = null;
        java.lang.Class[] classArray47 = new java.lang.Class[1];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray48 = (java.lang.Class<?>[]) classArray47;
        wildcardClassArray48[0] = wildcardClass45;
        java.lang.Class<?>[] wildcardClassArray51 = org.apache.commons.lang3.ClassUtils.primitivesToWrappers(wildcardClassArray48);
        java.lang.String[] strArray53 = new java.lang.String[] { "                                   " };
        java.lang.String str54 = org.apache.commons.lang3.StringUtils.getCommonPrefix(strArray53);
        java.lang.Class<?>[] wildcardClassArray55 = org.apache.commons.lang3.ClassUtils.toClass((java.lang.Object[]) strArray53);
        java.lang.Class<?> wildcardClass56 = null;
        java.lang.Class[] classArray58 = new java.lang.Class[1];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray59 = (java.lang.Class<?>[]) classArray58;
        wildcardClassArray59[0] = wildcardClass56;
        java.lang.Class<?>[] wildcardClassArray62 = org.apache.commons.lang3.ClassUtils.primitivesToWrappers(wildcardClassArray59);
        boolean boolean63 = org.apache.commons.lang3.ClassUtils.isAssignable(wildcardClassArray55, wildcardClassArray59);
        boolean boolean65 = org.apache.commons.lang3.ClassUtils.isAssignable(wildcardClassArray48, wildcardClassArray59, true);
        java.lang.String[] strArray68 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("hi!", "");
        java.lang.String[] strArray70 = org.apache.commons.lang3.StringUtils.stripAll(strArray68, "$");
        java.lang.Class<?>[] wildcardClassArray71 = org.apache.commons.lang3.ClassUtils.toClass((java.lang.Object[]) strArray68);
        java.lang.Class<?> wildcardClass72 = null;
        java.lang.Class[] classArray74 = new java.lang.Class[1];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray75 = (java.lang.Class<?>[]) classArray74;
        wildcardClassArray75[0] = wildcardClass72;
        java.lang.Class<?>[] wildcardClassArray78 = org.apache.commons.lang3.ClassUtils.primitivesToWrappers(wildcardClassArray75);
        java.lang.String[] strArray80 = new java.lang.String[] { "                                   " };
        java.lang.String str81 = org.apache.commons.lang3.StringUtils.getCommonPrefix(strArray80);
        java.lang.Class<?>[] wildcardClassArray82 = org.apache.commons.lang3.ClassUtils.toClass((java.lang.Object[]) strArray80);
        java.lang.Class<?> wildcardClass83 = null;
        java.lang.Class[] classArray85 = new java.lang.Class[1];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray86 = (java.lang.Class<?>[]) classArray85;
        wildcardClassArray86[0] = wildcardClass83;
        java.lang.Class<?>[] wildcardClassArray89 = org.apache.commons.lang3.ClassUtils.primitivesToWrappers(wildcardClassArray86);
        boolean boolean90 = org.apache.commons.lang3.ClassUtils.isAssignable(wildcardClassArray82, wildcardClassArray86);
        boolean boolean92 = org.apache.commons.lang3.ClassUtils.isAssignable(wildcardClassArray75, wildcardClassArray86, true);
        boolean boolean94 = org.apache.commons.lang3.ClassUtils.isAssignable(wildcardClassArray71, wildcardClassArray86, false);
        java.lang.String str95 = org.apache.commons.lang3.StringUtils.concat((java.lang.Object[]) wildcardClassArray86);
        boolean boolean96 = org.apache.commons.lang3.ClassUtils.isAssignable(wildcardClassArray59, wildcardClassArray86);
        boolean boolean97 = org.apache.commons.lang3.ClassUtils.isAssignable(wildcardClassArray39, wildcardClassArray59);
        boolean boolean98 = org.apache.commons.lang3.ClassUtils.isAssignable(wildcardClassArray0, wildcardClassArray59);
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
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertNotNull(classArray47);
        org.junit.Assert.assertNotNull(wildcardClassArray48);
        org.junit.Assert.assertNotNull(wildcardClassArray51);
        org.junit.Assert.assertNotNull(strArray53);
        org.junit.Assert.assertEquals("'" + str54 + "' != '" + "                                   " + "'", str54, "                                   ");
        org.junit.Assert.assertNotNull(wildcardClassArray55);
        org.junit.Assert.assertNotNull(classArray58);
        org.junit.Assert.assertNotNull(wildcardClassArray59);
        org.junit.Assert.assertNotNull(wildcardClassArray62);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + false + "'", boolean63 == false);
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + false + "'", boolean65 == false);
        org.junit.Assert.assertNotNull(strArray68);
        org.junit.Assert.assertNotNull(strArray70);
        org.junit.Assert.assertNotNull(wildcardClassArray71);
        org.junit.Assert.assertNotNull(classArray74);
        org.junit.Assert.assertNotNull(wildcardClassArray75);
        org.junit.Assert.assertNotNull(wildcardClassArray78);
        org.junit.Assert.assertNotNull(strArray80);
        org.junit.Assert.assertEquals("'" + str81 + "' != '" + "                                   " + "'", str81, "                                   ");
        org.junit.Assert.assertNotNull(wildcardClassArray82);
        org.junit.Assert.assertNotNull(classArray85);
        org.junit.Assert.assertNotNull(wildcardClassArray86);
        org.junit.Assert.assertNotNull(wildcardClassArray89);
        org.junit.Assert.assertTrue("'" + boolean90 + "' != '" + false + "'", boolean90 == false);
        org.junit.Assert.assertTrue("'" + boolean92 + "' != '" + false + "'", boolean92 == false);
        org.junit.Assert.assertTrue("'" + boolean94 + "' != '" + false + "'", boolean94 == false);
        org.junit.Assert.assertEquals("'" + str95 + "' != '" + "" + "'", str95, "");
        org.junit.Assert.assertTrue("'" + boolean96 + "' != '" + false + "'", boolean96 == false);
        org.junit.Assert.assertTrue("'" + boolean97 + "' != '" + false + "'", boolean97 == false);
        org.junit.Assert.assertTrue("'" + boolean98 + "' != '" + false + "'", boolean98 == false);
    }

    @Test
    public void test35781() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest71.test35781");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.remove("ARR... AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA... AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA... AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA... AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA... AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA... AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA... AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA... AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA... AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA..", "se..");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "ARR... AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA... AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA... AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA... AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA... AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA... AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA... AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA... AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA... AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA.." + "'", str2, "ARR... AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA... AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA... AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA... AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA... AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA... AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA... AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA... AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA... AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA..");
    }

    @Test
    public void test35782() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest71.test35782");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.right("va                                      va                                      va                                      va                                      va                                      va                                      va                                      va                                      va                                      va                                      va                                      va                  lang.javalang.javalang.javava                                      va                                      va                                      va                                      va                                      va                                      va                                      va                                      va                                      va                                      va                                      va                   ", 489);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + " lang.javalang.javalang.javava                                      va                                      va                                      va                                      va                                      va                                      va                                      va                                      va                                      va                                      va                                      va                   " + "'", str2, " lang.javalang.javalang.javava                                      va                                      va                                      va                                      va                                      va                                      va                                      va                                      va                                      va                                      va                                      va                   ");
    }

    @Test
    public void test35783() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest71.test35783");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitByCharacterTypeCamelCase("################################...       AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.stripAll(strArray1, "                                    cafretni");
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.stripAll(strArray3);
        java.lang.String str6 = org.apache.commons.lang3.ClassUtils.getShortClassName((java.lang.Object) strArray4, "vv$yL$s$");
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "String[]" + "'", str6, "String[]");
    }

    @Test
    public void test35784() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest71.test35784");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "jbOgnlvjsslsiyjb", "..........a       ...");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test35785() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest71.test35785");
        int int3 = org.apache.commons.lang3.StringUtils.indexOfIgnoreCase("      LANGaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaULANG       ", "             cHARACTER             UTILsTRI             cHARACTER   g.JAVA.L$ArrayListg.JAVA.L$ArrayListg.JAVA.L$ArrayListg.JAVA.L$ArrayListg.JAVA.L$ArrayListg.JAVA.L$ArrayListg.JAVA.L$ArrayListg.JAVA.L$ArrayListg.JAVA.L$ArrayListg.JAVA.L$ArrayListg.JAVA.L$ArrayListg.JAVA.L$ArrayListg.JAVA.L$ArrayListg.JAVA.L$ArrayListg.JAVA.L$ArrayListg.JAVA.L$ArrayListg.JAVA.L$ArrayListg.JAVA.L$ArrayListg.JAVA.L$ArrayListg.JAVA.L$ArrayListg.JAVA.L$ArrayListg.JAVA.L$ArrayListg.JAVA.L$ArrayListg.JAVA.L$ArrayListg.JAVA.L$ArrayListg.JAVA.L$ArrayListg.JAVA.L$ArrayListg.JAVA.L$ArrayListg.JAVA.L$ArrayListg.JAVA.L$ArrayListg.JAVA.L$ArrayListg.JAVA.L$ArrayListg.JAVA.L$ArrayListg.JAVA.L$ArrayListg.JAVA.L$ArrayListg.JAVA.L$ArrayListg.JAVA.L$ArrayListg.JAVA.L$ArrayListg.JAVA.L$ArrayListg.JAVA.L$ArrayListg.JAVA.L$ArrayListg.JAVA.L$ArrayListg.JAVA.L$ArrayListg.JAVA.L$ArrayListg.JAVA.L$ArrayListg.             cHARACTER             UTILsTRI             cHARACTER   ", 56);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test35786() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest71.test35786");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitByCharacterTypeCamelCase("gnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalLANGLANGLANGLANGLANGLANGLlituava                  ...                         $$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$");
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test35787() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest71.test35787");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.contains("class java", ".langjava.langjava.langjava.langjava");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test35788() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest71.test35788");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.rightPad("                                  aa                                  aa                                  aa                                  aa                                  aa                                  aa                                  aa                                  aa                                  aa                                  aa", 384);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                  aa                                  aa                                  aa                                  aa                                  aa                                  aa                                  aa                                  aa                                  aa                                  aa                        " + "'", str2, "                                  aa                                  aa                                  aa                                  aa                                  aa                                  aa                                  aa                                  aa                                  aa                                  aa                        ");
    }

    @Test
    public void test35789() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest71.test35789");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.rightPad("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", 570, '4');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa4444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444" + "'", str3, "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa4444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444");
    }

    @Test
    public void test35790() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest71.test35790");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringAfter("JAVA.LANGAgnal.avajgnal..LANGgnal.avArrclassjava.lang.ObjectyListArrclassjava.lang.ObjectyListA", "4444444string.44444444");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test35791() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest71.test35791");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfDifference((java.lang.CharSequence) ".....HI!ARRAYLISTARRAYLISTARRAYLISTAVAJ.GNALARRAYLISTARRAYLISTARRAYLISTAVAJ.GNALARRAYLISTARRAYLISTARRAYLI.                       JAVAULANG                                                                                                                                                                     ", (java.lang.CharSequence) "                                                                    nAAAAAAAAAAjavalagnAAAAAAAAAA                                                                    ");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test35792() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest71.test35792");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.substringsBetween("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaylist", "aaaaaaaaA..yL A.4444444444...A..yL A.4444444444...A..yL A.4444444444...A..yL A.4444444444...A..yL A.4444444444...A..yL A.4444444444...A..yL A.4444444444...A..yL A.4444444444...A..yL A.4444444444...A..yL A.4444444444...A..yL A.4444444444...A..yL A.4444444444...A..yL A.4444444444...A..yL A.4444444444...A..yL A.4444444444...A..yL A.4444444444...A..yL A.4444444444...A..yL A.4444444444...A..yL A.4444444444...A..yL A.4444444444...A..yL A.4444444444...A..yL A.4444444444...A..yL A.4444444444...A..yL A.4444444444...A..yL A.4444444444...A..yL A.4444444444...A..yL A.4444444444...A..yL A.4444444444...A..yL A.4444444444...A..yL A.4444444444...A..yL A.4444444444...A..yL A.4444444444...A..yL A.4444444444...A..yL A.4444444444...A..yL A.4444444444...A..yL A.4444444444...A..yL A.4444444444...A..yL A.4444444444...A..yL A.4444444444...A..yL A.4444444444...A..yL A.4444444444...A..yL A.4444444444...A..yL A.4444444444...A..yL A.4444444444...A..yL A.44", "                                                                                                                                     $                                                                                                                                             ");
        org.junit.Assert.assertNull(strArray3);
    }

    @Test
    public void test35793() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest71.test35793");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.stripStart("aaaaaaaautilaaaaaaaaa", "L");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "aaaaaaaautilaaaaaaaaa" + "'", str2, "aaaaaaaautilaaaaaaaaa");
    }

    @Test
    public void test35794() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest71.test35794");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAllUpperCase((java.lang.CharSequence) "in");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test35795() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest71.test35795");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.stripStart("AaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaVAJ", "AVAJGNAL.AVAJGNAL.AVAJGNAL.AVAJGNAL.AVAJGNAL.AVAJGNAL.AVAJGNAL.AVAJGNAL.AVAJGNAL.AVAj");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaVAJ" + "'", str2, "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaVAJ");
    }

    @Test
    public void test35796() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest71.test35796");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.defaultIfEmpty("GNAL.GNAL.GNAL.GNAL.GNAL.GNAL.GNAL.GNAL.GNAL.GNAL.GNAL.GNAL.GNAL.GNAL.GNAL.GNAL.GNAL.GNAL.GNAL.GNAL.GNAL.GNAL.GNAL.GNAL.GNAL.GNAL.GNAL.GNAL.GNAL.GNAL.GNAL.GNAL.GNAL.GNAL.GNAL.GNAL.GNAL.GNAL.GNAL.GNAL.GNAL.GNAL.GNAL.GNAL.GNAL.GNAL.GNAL.GNAL.GNAL.GNAL.GNAL.GNAL.GNAL.GNAL.GNAL.GNAL.GNAL.GNAL.GNAL.GNAL.GNAL.GNAL.GNAL.GNAL.GNAL.GNAL.GNAL.GNAL.GNAL.GNAL.GNAL.GNAL.GNAL.GNAL.GNAL.GNAL.GNAL.GNAL.GNAL.GNAL.GNAL.GNAL.GNAL.GNAL.GNAL.GNAL.GNAL.GNAL.GNAL.GNAL.GNAL.GNAL.GNAL.GNAL.GNAL.GNAL.GNAL.GNAL.GNAL.GNAL.GNAL.GNAL.GNAL.GNAL.GNAL.GNAL.GNAL.GNAL.GNAL.GNAL.GNAL.GNAL.GNAL.GNAL.GNAL.GNAL.GNAL.GNAL.GNAL.GNAL.GNAL.GNAL.GNAL.GNAL.GNAL.GNAL.GNAL.GNAL.GNAL.GNAL.GNAL.GNAL.GNAL.GNAL.GNAL.GNAL.GNAL.GNAL.GNAL.GNAL.GNAL.GNAL.GNAL.GNAL.GNAL.GNAL.GNAL.GNAL.GNAL.GNAL.", "-1JAVA.UTILsTRING-1JAVA");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "GNAL.GNAL.GNAL.GNAL.GNAL.GNAL.GNAL.GNAL.GNAL.GNAL.GNAL.GNAL.GNAL.GNAL.GNAL.GNAL.GNAL.GNAL.GNAL.GNAL.GNAL.GNAL.GNAL.GNAL.GNAL.GNAL.GNAL.GNAL.GNAL.GNAL.GNAL.GNAL.GNAL.GNAL.GNAL.GNAL.GNAL.GNAL.GNAL.GNAL.GNAL.GNAL.GNAL.GNAL.GNAL.GNAL.GNAL.GNAL.GNAL.GNAL.GNAL.GNAL.GNAL.GNAL.GNAL.GNAL.GNAL.GNAL.GNAL.GNAL.GNAL.GNAL.GNAL.GNAL.GNAL.GNAL.GNAL.GNAL.GNAL.GNAL.GNAL.GNAL.GNAL.GNAL.GNAL.GNAL.GNAL.GNAL.GNAL.GNAL.GNAL.GNAL.GNAL.GNAL.GNAL.GNAL.GNAL.GNAL.GNAL.GNAL.GNAL.GNAL.GNAL.GNAL.GNAL.GNAL.GNAL.GNAL.GNAL.GNAL.GNAL.GNAL.GNAL.GNAL.GNAL.GNAL.GNAL.GNAL.GNAL.GNAL.GNAL.GNAL.GNAL.GNAL.GNAL.GNAL.GNAL.GNAL.GNAL.GNAL.GNAL.GNAL.GNAL.GNAL.GNAL.GNAL.GNAL.GNAL.GNAL.GNAL.GNAL.GNAL.GNAL.GNAL.GNAL.GNAL.GNAL.GNAL.GNAL.GNAL.GNAL.GNAL.GNAL.GNAL.GNAL.GNAL.GNAL.GNAL.GNAL.GNAL." + "'", str2, "GNAL.GNAL.GNAL.GNAL.GNAL.GNAL.GNAL.GNAL.GNAL.GNAL.GNAL.GNAL.GNAL.GNAL.GNAL.GNAL.GNAL.GNAL.GNAL.GNAL.GNAL.GNAL.GNAL.GNAL.GNAL.GNAL.GNAL.GNAL.GNAL.GNAL.GNAL.GNAL.GNAL.GNAL.GNAL.GNAL.GNAL.GNAL.GNAL.GNAL.GNAL.GNAL.GNAL.GNAL.GNAL.GNAL.GNAL.GNAL.GNAL.GNAL.GNAL.GNAL.GNAL.GNAL.GNAL.GNAL.GNAL.GNAL.GNAL.GNAL.GNAL.GNAL.GNAL.GNAL.GNAL.GNAL.GNAL.GNAL.GNAL.GNAL.GNAL.GNAL.GNAL.GNAL.GNAL.GNAL.GNAL.GNAL.GNAL.GNAL.GNAL.GNAL.GNAL.GNAL.GNAL.GNAL.GNAL.GNAL.GNAL.GNAL.GNAL.GNAL.GNAL.GNAL.GNAL.GNAL.GNAL.GNAL.GNAL.GNAL.GNAL.GNAL.GNAL.GNAL.GNAL.GNAL.GNAL.GNAL.GNAL.GNAL.GNAL.GNAL.GNAL.GNAL.GNAL.GNAL.GNAL.GNAL.GNAL.GNAL.GNAL.GNAL.GNAL.GNAL.GNAL.GNAL.GNAL.GNAL.GNAL.GNAL.GNAL.GNAL.GNAL.GNAL.GNAL.GNAL.GNAL.GNAL.GNAL.GNAL.GNAL.GNAL.GNAL.GNAL.GNAL.GNAL.GNAL.GNAL.GNAL.GNAL.");
    }

    @Test
    public void test35797() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest71.test35797");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("                                                                                                                                                                                                                                                                                                                                                                                          ARRYLISTARRYLISTARRYLISTVJGNAL.AVAJLANG.JAVAGNAL.AVAJLANG.JAVAGNAL.AVAJLANG.JAVAGNAL.AVAJLANG.JAVAGNAL.AVAJLANG.JAVAGNAL.AVAJLANG.JAVAGNAL.AVAJLANG.JAVAGNAL.AVAJLANG.JAVAGNAL.AVAJGNL                                                                                                                                                                                                                                                                                                                                                                                           ", "$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$");
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test35798() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest71.test35798");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isWhitespace((java.lang.CharSequence) "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                           ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test35799() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest71.test35799");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.substringBetween("aaaaaaaaaaaaaaaaaaaaaag", "javal.agn#AGNAAAAAAAAGNAL", "                                                                                                                                                                                                                                                  44444444444444444444-1JAVA444444444444444444444                                                                                                                                                                                                                                                   ");
        org.junit.Assert.assertNull(str3);
    }

    @Test
    public void test35800() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest71.test35800");
        int int2 = org.apache.commons.lang3.StringUtils.indexOf("44444444444444444gnaluavaj44444444444444444444444444444444444444444444444444444444444444444444444.aL.ArrayListgnal.aL.ArrayList.aL.ArrayListgnal.aL.ArrayList.aL.ArrayListgnal.aL.ArrayList.aL.ArrayListgnal.aL.ArrayList.aL.ArrayListgnal.aL.ArrayList.aL.ArrayListgnal.aL.ArrayList.aL.ArrayListgnal.aL.ArrayList.aL.ArrayListgnal.aL.ArrayList.aL.ArrayListgnal.aL.ArrayList.aL.ArrayListgnal.aL.ArrayList.aL.ArrayListgnal.aL.ArrayList.aL.ArrayListgnal.aL.ArrayList.aL.ArrayListgnal.aL.ArrayL", "                     44444444444444444444-1JAVA444444444444444444444                      ");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test35801() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest71.test35801");
        char[] charArray16 = new char[] { ' ', ' ', '#', 'a', '4', 'a' };
        int int17 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "", charArray16);
        boolean boolean18 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "......", charArray16);
        int int19 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "                                                                                                    ", charArray16);
        int int20 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "avaj.gnal", charArray16);
        boolean boolean21 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "", charArray16);
        boolean boolean22 = org.apache.commons.lang3.StringUtils.containsAny("javaStringnalArrayListArrayListArrayListavaj.gnalArrayListArrayListArrayLi", charArray16);
        boolean boolean23 = org.apache.commons.lang3.StringUtils.containsAny("gnal.avaj", charArray16);
        java.lang.String str25 = org.apache.commons.lang3.ClassUtils.getPackageName((java.lang.Object) charArray16, "aaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        boolean boolean26 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "                                                                                                                                                                                                                                                                                       aaaaaaaaaaaaaaaaaaaaaagn                                                                                                                                                                                                                                                                                        ", charArray16);
        boolean boolean27 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "aaaaaaaaaaaa######aaaaaaaaaaaaa", charArray16);
        boolean boolean28 = org.apache.commons.lang3.StringUtils.containsAny("aa...                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                           ", charArray16);
        org.junit.Assert.assertNotNull(charArray16);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray16), "  #a4a");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray16), "  #a4a");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray16), "[ ,  , #, a, 4, a]");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
    }

    @Test
    public void test35802() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest71.test35802");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                    JAVA.LANGAVAJ.GNALJAVA.LANGAVAJ.GNALJAVA.LANGAVAJ.GNALJAVA.LANGAVAJ.GNALJAVA.LANGAVAJ.GNALJAVA.LANGAVAJ.GNALJAVA.LANGAVAJ.GNALJAVA.LANGAVAJ.GNALJAVA.LANG", 'a');
        int int4 = org.apache.commons.lang3.StringUtils.indexOfDifference((java.lang.CharSequence[]) strArray3);
        java.lang.String[] strArray8 = org.apache.commons.lang3.StringUtils.split("java.lang$interface java.lang.Cloneable$interface java.io.Serializableinterface java.lang.Cloneable$interface java.io.Serializableinterface java.lang.Cl", "javal$agn", 153);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str9 = org.apache.commons.lang3.StringUtils.replaceEachRepeatedly("gn                                            gn      tavaj.gnalarraylistarraylistarrayli", strArray3, strArray8);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Search and Replace array lengths don't match: 1 vs 36");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertNotNull(strArray8);
    }

    @Test
    public void test35803() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest71.test35803");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.leftPad("..$$$$$$$$$$$$$$$$$$$$$$$$$$$$$.....", 472, ' ');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "                                                                                                                                                                                                                                                                                                                                                                                                                                                    ..$$$$$$$$$$$$$$$$$$$$$$$$$$$$$....." + "'", str3, "                                                                                                                                                                                                                                                                                                                                                                                                                                                    ..$$$$$$$$$$$$$$$$$$$$$$$$$$$$$.....");
    }

    @Test
    public void test35804() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest71.test35804");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBefore("javastringnalarraylistarraylistarraylistavaj                                                                                                                                                                             ", "jAVAAAAAAAAAAVA.LANG..");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "javastringnalarraylistarraylistarraylistavaj                                                                                                                                                                             " + "'", str2, "javastringnalarraylistarraylistarraylistavaj                                                                                                                                                                             ");
    }

    @Test
    public void test35805() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest71.test35805");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.startsWith("java.utiljava.utilarra", "gnal$.$avaj");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test35806() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest71.test35806");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitByCharacterTypeCamelCase("irfCo$irfioSrA..ayL.A.444444444444444444444444444");
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test35807() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest71.test35807");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.endsWithIgnoreCase("444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444JAVA.LANGaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", " ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test35808() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest71.test35808");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByCharacterType("####");
        java.lang.String str6 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray2, "", 11, (int) (byte) 10);
        java.lang.String[] strArray9 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("AAAAAAAAAA", "javaStrin");
        java.lang.String str10 = org.apache.commons.lang3.StringUtils.replaceEach("interface java.lang.CloneableString[]String[]String[]String[]String[]String[]String[]String[]String[]String[]String[]String[]String[]String[]String[]String[]String[]String[]String[]String[]String[]String[]String[]String[]String[]String[]String[]String[]String[]String[]String[]String[]String[]String[]String[]String[]String[]String[]String[]String[]String[]String[]String[]String[]String[]String[]String[]String[]String[]String[]String[]String[]String[]String[]String[]String[]String[]String[]String[]String[]String[]String[]String[]String[]String[]String[]String[]interface java.io.Serializable", strArray2, strArray9);
        java.lang.String[] strArray12 = org.apache.commons.lang3.StringUtils.stripAll(strArray2, "                                                                    ...nAAAAAAAAAAjaval.agnAAAAAAAAAA...                                                                    ");
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(strArray9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "interface java.lang.CloneableString[]String[]String[]String[]String[]String[]String[]String[]String[]String[]String[]String[]String[]String[]String[]String[]String[]String[]String[]String[]String[]String[]String[]String[]String[]String[]String[]String[]String[]String[]String[]String[]String[]String[]String[]String[]String[]String[]String[]String[]String[]String[]String[]String[]String[]String[]String[]String[]String[]String[]String[]String[]String[]String[]String[]String[]String[]String[]String[]String[]String[]String[]String[]String[]String[]String[]String[]interface java.io.Serializable" + "'", str10, "interface java.lang.CloneableString[]String[]String[]String[]String[]String[]String[]String[]String[]String[]String[]String[]String[]String[]String[]String[]String[]String[]String[]String[]String[]String[]String[]String[]String[]String[]String[]String[]String[]String[]String[]String[]String[]String[]String[]String[]String[]String[]String[]String[]String[]String[]String[]String[]String[]String[]String[]String[]String[]String[]String[]String[]String[]String[]String[]String[]String[]String[]String[]String[]String[]String[]String[]String[]String[]String[]String[]interface java.io.Serializable");
        org.junit.Assert.assertNotNull(strArray12);
    }

    @Test
    public void test35809() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest71.test35809");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("ava.la", "rayListArrayListavaj.gnal                                                           ", 27);
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void test35810() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest71.test35810");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.leftPad("SILYARRA!IH$$$$$$$$", 523, '#');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "########################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################SILYARRA!IH$$$$$$$$" + "'", str3, "########################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################SILYARRA!IH$$$$$$$$");
    }

    @Test
    public void test35811() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest71.test35811");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.left("                                                                                    AVAJ.GNALAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA CHARACTERCHARACTERCHARACTERCHARACTERCHARACTERCHARACTERCHARACTERCHARACTERCHARACTERCHARACTERCHARACTERCHARACTERCHARACTERCHARACTERCHARACTERCHARACTERCHARACTERCHARACTERCHARACTERCHARACTERCHARACTERCHARACTERCHARACTERCHARACTERCHARACTERCHARACTERCHARACTERCHARACTERCHARACTERCHARACTERCHARACTERCHARACTERCHARACTERCHARACTERCHARACTERCHARACTERCHARACTERCHARACTERCHARACTERCHARACTERCHARACTERCHARACTERCHARACTERCHARACTERCHARACTERCHARACTERCHARACTERCHARACTERCHARACTERCHARACTERCHARACTERCHARACTERCHARACTERCHARACTERCHARACTERCHARACTERCHARACTERCHARACTERCHARACTERCHARACTERCHARACTERCHARACTERCHARA                                                                                    ", 931);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                                                                    AVAJ.GNALAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA CHARACTERCHARACTERCHARACTERCHARACTERCHARACTERCHARACTERCHARACTERCHARACTERCHARACTERCHARACTERCHARACTERCHARACTERCHARACTERCHARACTERCHARACTERCHARACTERCHARACTERCHARACTERCHARACTERCHARACTERCHARACTERCHARACTERCHARACTERCHARACTERCHARACTERCHARACTERCHARACTERCHARACTERCHARACTERCHARACTERCHARACTERCHARACTERCHARACTERCHARACTERCHARACTERCHARACTERCHARACTERCHARACTERCHARACTERCHARACTERCHARACTERCHARACTERCHARACTERCHARACTERCHARACTERCHARACTERCHARACTERCHARACTERCHARACTERCHARACTERCHARACTERCHARACTERCHARACTERCHARACTERCHARACTERCHARACTERCHARACTERCHARACTERCHARACTERCHARACTERCHARACTERCHARACTERCHARA                                                                                    " + "'", str2, "                                                                                    AVAJ.GNALAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA CHARACTERCHARACTERCHARACTERCHARACTERCHARACTERCHARACTERCHARACTERCHARACTERCHARACTERCHARACTERCHARACTERCHARACTERCHARACTERCHARACTERCHARACTERCHARACTERCHARACTERCHARACTERCHARACTERCHARACTERCHARACTERCHARACTERCHARACTERCHARACTERCHARACTERCHARACTERCHARACTERCHARACTERCHARACTERCHARACTERCHARACTERCHARACTERCHARACTERCHARACTERCHARACTERCHARACTERCHARACTERCHARACTERCHARACTERCHARACTERCHARACTERCHARACTERCHARACTERCHARACTERCHARACTERCHARACTERCHARACTERCHARACTERCHARACTERCHARACTERCHARACTERCHARACTERCHARACTERCHARACTERCHARACTERCHARACTERCHARACTERCHARACTERCHARACTERCHARACTERCHARACTERCHARACTERCHARA                                                                                    ");
    }

    @Test
    public void test35812() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest71.test35812");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("OI.AVAJECAFRETNI#ELBAENOLc.GNAL.AVAJECAFRETNI");
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test35813() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest71.test35813");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass1 = org.apache.commons.lang3.ClassUtils.getClass("                                                       Serializabl...     java44444444444444444.4444");
            org.junit.Assert.fail("Expected exception of type java.lang.ClassNotFoundException; message: Serializabl///java44444444444444444/4444");
        } catch (java.lang.ClassNotFoundException e) {
            // Expected exception.
        }
    }

    @Test
    public void test35814() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest71.test35814");
        char[] charArray11 = new char[] { ' ', ' ', '#', 'a', '4', 'a' };
        int int12 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "", charArray11);
        boolean boolean13 = org.apache.commons.lang3.StringUtils.containsAny("......", charArray11);
        int int14 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "Java.lang.Stringclass java.lang.Stringclass java.lang.Stringclas.lang.Stringclass java.lang.Stringc", charArray11);
        boolean boolean15 = org.apache.commons.lang3.StringUtils.containsAny("interface java.lang.CloneablearraarraarraarraarraarraarraarraarraarraarraarraarraarraarraarraarraarraarraarraarraarraarraarraarraarraarraarraarraarraarraarraarraarraarraarraarrNALaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaainterface java.io.Serializable", charArray11);
        boolean boolean16 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "JAVAlLANGJAVA.LANGAVAJ.GNALJAVA.LANGAVAJ.GNALJAVA.LANGAVAJ.GNALJAVA.LANGAVAJ.GNALJAVA.LANGAVAJ.GNALJAVA.LANGAVAJ.GNALJAVA.LANGAVAJ.GNALJAVA.LANGAVAJ.GNALJAVA.LANG", charArray11);
        org.junit.Assert.assertNotNull(charArray11);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray11), "  #a4a");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray11), "  #a4a");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray11), "[ ,  , #, a, 4, a]");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test35815() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest71.test35815");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("rgnaluavaj", ' ');
        java.lang.String[] strArray7 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("rrclass javalangObjectyst", "i4elbaenolCAgnalAavajiecafretniTRINGi4elbaenolCAgnalAavajiecaf", (int) '4');
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.replaceEach("$         44444444444444444444444444444444444444444444444444444444444444444444444444444444                                                           ", strArray3, strArray7);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "$         44444444444444444444444444444444444444444444444444444444444444444444444444444444                                                           " + "'", str8, "$         44444444444444444444444444444444444444444444444444444444444444444444444444444444                                                           ");
    }

    @Test
    public void test35816() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest71.test35816");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.substring("LANG.GNALJAVA.LANGAVAJ.GNALJAVA.LANGAVAJ.GNALJAVA.LANGAVAJ.GNALJAVA.LALANG.GNALJAVA.LANGAVAJ.GNALJAVA.LANGAVAJ.GNALJAVA.LANGAVAJ.GNALJAVA.LALANG.GNALJAVA.LANGAVAJ.GNALJAVA.LANGAVAJ.GNALJAVA.LANGAVAJ.GNALJAVA.LALANG.GNALJAVA.LANGAVAJ.GNALJAVA.LANGAVAJ.GNALJAVA.LANGAVAJ.GNALJAVA.LALANG.GNALJAVA.LANGAVAJ.GNALJAVA.LANGAVAJ.GNALJAVA.LANGAVAJ.GNALJAVA.LALANG.GNALJAVA.LANGAVAJ.GNALJAVA.LANGAVAJ.GNALJAVA.LANGAVAJ.GNALJAVA.LALANG.GNALJAVA.LANGAVAJ.GNALJAVA.LANGAVAJ.GNALJAVA.LANGAVAJ.GNALJAVA.LALANG.GNALJAVA.LANGAVAJ.GNALJAVA.LANGAVAJ.GNALJAVA.LANGAVAJ.GNALJAVA.LALANG.GNALJAVA.LJav", 441, 457);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "J.GNALJAVA.LANGA" + "'", str3, "J.GNALJAVA.LANGA");
    }

    @Test
    public void test35817() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest71.test35817");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.leftPad("interfacejavaalangaCloneable#interfacejavaaiointerfacejavaalangaCloneable#interfacejavaaiointerfacejavaala", 131);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                         interfacejavaalangaCloneable#interfacejavaaiointerfacejavaalangaCloneable#interfacejavaaiointerfacejavaala" + "'", str2, "                         interfacejavaalangaCloneable#interfacejavaaiointerfacejavaalangaCloneable#interfacejavaaiointerfacejavaala");
    }

    @Test
    public void test35818() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest71.test35818");
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.split("ArrayListArrayListArrayListavaj.gnal", "################################", 0);
        java.lang.String[] strArray7 = org.apache.commons.lang3.StringUtils.split("######################                                                                                                                                  ", '#');
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.replaceEach("J", strArray4, strArray7);
        java.lang.String str10 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray7, "elb4zil4ireS.......j4v4..........j4v4..........j4v4..........j4v4..........j4v4..........j4v4..........j4v4..........j4v4..........j4v4..........j4v4..........j4v4..........j4v4..........j4v4..........j4v4..........j4v4..........j4v4..........j4v4..........j4v4..........j4v4..........j4v4..........j4v4..........j4v4..........j4v4..........j4v4..........j4v4..........j4v4..........j4v4..........j4v4..........j4v4..........j4v4..........j4v4..........j4v4..........j4v4..........j4v4..........j4v4nignirtSelb4enolC.gn4l.4v4j ec4fretni");
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "J" + "'", str8, "J");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "                                                                                                                                  " + "'", str10, "                                                                                                                                  ");
    }

    @Test
    public void test35819() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest71.test35819");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.startsWith("                                                                                                                                                                                                                               arjavaarrarjavaarrarjavaarrarjavaarrarjavaarrarjavaarrarjavaarrarjavaarrarjavaarrarjavaarrarjavaarrarjavaarrarjavaarrarjavaarrarjavaarrarjavaarrarjavaarrarjavaarrarjavaarrarjavaarrarjavaarrarjavaarrarjavaarrarjavaarrarjavaarrarjavaarrarjavaarrarjavaarrarjavaarrarjavaarrarjavaarrarjavaarrarjavaarrarjavaarrarjavaarrarjavaarrarjavaarrarjavaarrarjavaarrarjavaarrarjavaarrarjavaarrarjavaarrarjavaarrarjavaarrarjavaarrarjavaarrarjavaarrarjavaarrarjavaarrarjavaarrarjavaarrarjalass java.lang.string                                                                                                                                                                                                                               ", "44444444444444444444-1JAVA444444444444444444444");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test35820() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest71.test35820");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.contains("...       AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA", "");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test35821() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest71.test35821");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("...aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaayl a.a", "       aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa......................................................................................................................................................................................................................................................................................................................................................................................................................................", 423);
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void test35822() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest71.test35822");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.left("javaStringnalArrayListArrayListArrayListavaj.gnalArrayListArrayListArrayLi", 8);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "javaStri" + "'", str2, "javaStri");
    }

    @Test
    public void test35823() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest71.test35823");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeEnd("             CHARACTER             UTILSTRI", "interface#java.lang.Cloneable4interface#java.io.Serializable...                                                                irfCo$irfioSriiz...                                                                 ...                                                                irfCo$irfioSriiz...                                                                 ...                                                                irfCo$irfioSriiz...                                                      ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "             CHARACTER             UTILSTRI" + "'", str2, "             CHARACTER             UTILSTRI");
    }

    @Test
    public void test35824() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest71.test35824");
        java.lang.CharSequence charSequence1 = null;
        boolean boolean2 = org.apache.commons.lang3.StringUtils.equals((java.lang.CharSequence) "A..........JAVA..........JAVA..........JAVA..........JAVA.........", charSequence1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test35825() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest71.test35825");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.center("aaaaaaaaaaaaaaaaaaaaaaaaaGN                                            aaaaaaaaaaaaaaaaaaaaaaaaaa", 128, '4');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "444444444444444aaaaaaaaaaaaaaaaaaaaaaaaaGN                                            aaaaaaaaaaaaaaaaaaaaaaaaaa4444444444444444" + "'", str3, "444444444444444aaaaaaaaaaaaaaaaaaaaaaaaaGN                                            aaaaaaaaaaaaaaaaaaaaaaaaaa4444444444444444");
    }

    @Test
    public void test35826() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest71.test35826");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trimToNull("44444444444444444444444444                                                 ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "44444444444444444444444444" + "'", str1, "44444444444444444444444444");
    }

    @Test
    public void test35827() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest71.test35827");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replace("AAAAAAAAAAngalavajAAAAAAAAAAngalavajAAAAAAAAAAngalavajAAAAAAAAAAngalavajAAAAAAAAAAngalavajAAAAAAAAAAngalavajAAAAAAAAAAngalavajAAAAAAAAAAngalavajAAAAAAAAAAngalavajAAAAAAAAAAngalavajAAAAAAAAAAngalavajAAAAAAAAAAngalavajAAAAAAAAAAngalavajAAAAAAAAAAngalavajAAAAAAAAAAngalavajAAAAAAAAAAngalavajAAAAAAAAAAngalavajAAAAAAAAAAngalavajAAAAAAAAAAngalavajAAAAAAAAAAngalavajAAAAAAAAAAngalavajAAAAAAAAAAngalavajAAAAAAAAAAngalavajAAAAAAAAAAngalavajAAAAAAAAAAngalavajAAAAAAAAAAngalavajAAAAAAAAAAngalavajAAAAAAAAAAngalavajAAAAAAAAAAngalavajAAAAAAAAAAngalavajAAAAAAAAAAngalavajAAAAAAAAAAngalavajAAAAAAAAAAngalavajAAAAAAAAAAngalavajAAAAAAAAAAngalavajAAAAAAAAAA][gnirtSlitu.avaj1-][gnirtSlitu.avaj1-                                                                                   ", " rrrrrrrrrrrrrrrrrrrrrrrrrrrrrr", ".44444444444444444444444444444444444444444444444444444444444444444444444444444444SERIALIZABLESERIALIZABLESERIALIZABLESERIALIZABLESERIALIZABLESERIALIZABLESERIALIZABLESERIALIZABLESERIALIZABLESERIALIZABLESERIALIZABLESERIALIZABLESERIALIZABLESERIALIZABLESERIALIZABLESERIALIZABLESERIALIZABLESERIALIZABLESERIALIZABLESERIALIZABLESERIALIZABLESERIALIZABLESERIALIZABLESERIALIZABLESERIALIZABLESERIALIZABLESERIALIZABLESERIALIZABLESERIALIZABLESERIALIZABLESERIAL");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "AAAAAAAAAAngalavajAAAAAAAAAAngalavajAAAAAAAAAAngalavajAAAAAAAAAAngalavajAAAAAAAAAAngalavajAAAAAAAAAAngalavajAAAAAAAAAAngalavajAAAAAAAAAAngalavajAAAAAAAAAAngalavajAAAAAAAAAAngalavajAAAAAAAAAAngalavajAAAAAAAAAAngalavajAAAAAAAAAAngalavajAAAAAAAAAAngalavajAAAAAAAAAAngalavajAAAAAAAAAAngalavajAAAAAAAAAAngalavajAAAAAAAAAAngalavajAAAAAAAAAAngalavajAAAAAAAAAAngalavajAAAAAAAAAAngalavajAAAAAAAAAAngalavajAAAAAAAAAAngalavajAAAAAAAAAAngalavajAAAAAAAAAAngalavajAAAAAAAAAAngalavajAAAAAAAAAAngalavajAAAAAAAAAAngalavajAAAAAAAAAAngalavajAAAAAAAAAAngalavajAAAAAAAAAAngalavajAAAAAAAAAAngalavajAAAAAAAAAAngalavajAAAAAAAAAAngalavajAAAAAAAAAAngalavajAAAAAAAAAA][gnirtSlitu.avaj1-][gnirtSlitu.avaj1-                                                                                   " + "'", str3, "AAAAAAAAAAngalavajAAAAAAAAAAngalavajAAAAAAAAAAngalavajAAAAAAAAAAngalavajAAAAAAAAAAngalavajAAAAAAAAAAngalavajAAAAAAAAAAngalavajAAAAAAAAAAngalavajAAAAAAAAAAngalavajAAAAAAAAAAngalavajAAAAAAAAAAngalavajAAAAAAAAAAngalavajAAAAAAAAAAngalavajAAAAAAAAAAngalavajAAAAAAAAAAngalavajAAAAAAAAAAngalavajAAAAAAAAAAngalavajAAAAAAAAAAngalavajAAAAAAAAAAngalavajAAAAAAAAAAngalavajAAAAAAAAAAngalavajAAAAAAAAAAngalavajAAAAAAAAAAngalavajAAAAAAAAAAngalavajAAAAAAAAAAngalavajAAAAAAAAAAngalavajAAAAAAAAAAngalavajAAAAAAAAAAngalavajAAAAAAAAAAngalavajAAAAAAAAAAngalavajAAAAAAAAAAngalavajAAAAAAAAAAngalavajAAAAAAAAAAngalavajAAAAAAAAAAngalavajAAAAAAAAAAngalavajAAAAAAAAAA][gnirtSlitu.avaj1-][gnirtSlitu.avaj1-                                                                                   ");
    }

    @Test
    public void test35828() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest71.test35828");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.capitalize((java.lang.CharSequence) "GN GNAL");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "GN GNAL" + "'", str1, "GN GNAL");
    }

    @Test
    public void test35829() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest71.test35829");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.stripEnd("AAAAAAAAAAAAA", "hi!ArrayListArrayListArrayListavaj.gnalArrayListArrayListArrayListavaj");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test35830() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest71.test35830");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.equals((java.lang.CharSequence) "aaaaaaaaaaaaaaaaaaaaaalitu", (java.lang.CharSequence) "ylist                         java$.$lang");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test35831() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest71.test35831");
        java.lang.CharSequence charSequence0 = null;
        char[] charArray13 = new char[] { ' ', ' ', '#', 'a', '4', 'a' };
        int int14 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "", charArray13);
        boolean boolean15 = org.apache.commons.lang3.StringUtils.containsAny("......", charArray13);
        boolean boolean16 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "$", charArray13);
        boolean boolean17 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "serializable", charArray13);
        int int18 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "                                                                              INTERFACE JAVA.LANG.CLONEABLE...                                 INTERFACE JAVA.IO.SERIALIZABLE", charArray13);
        boolean boolean19 = org.apache.commons.lang3.StringUtils.containsAny("GNAL.AVAJLANG.JAVAGNAL.AVAJLANG.JAVAGNAL.AVAJLANG.JAVAGNAL.AVAJLANG.JAVAGNAL.AVAJLANG.JAVAGNAL.AVAJLANG.JAVAGNAL.AVAJLANG.JAVAGNAL.AVAJLANG.JAVAGNAL", charArray13);
        int int20 = org.apache.commons.lang3.StringUtils.indexOfAnyBut(charSequence0, charArray13);
        org.junit.Assert.assertNotNull(charArray13);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray13), "  #a4a");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray13), "  #a4a");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray13), "[ ,  , #, a, 4, a]");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
    }

    @Test
    public void test35832() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest71.test35832");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass1 = org.apache.commons.lang3.ClassUtils.getClass("va..........java..........java..........java.........");
            org.junit.Assert.fail("Expected exception of type java.lang.ClassNotFoundException; message: va//////////java//////////java//////////java/////////");
        } catch (java.lang.ClassNotFoundException e) {
            // Expected exception.
        }
    }

    @Test
    public void test35833() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest71.test35833");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.substringBetween("Javalituavajlituavajjavalituavajlituavajjavalituavajlituavajjavalituavajlituavajjavalituavajlituavajjavalituavajlituavajjavalituavajlituavajjavalituavajlituavajjavalituavajlituavajjavalituavajlituavajjavalituavajlituavajjavalituavajlituavajjavalituavajlituavajjavalituavajlituavajjavalituavajlituavajjavalituavajlituavajjavalituavajlituavajjavalituavajlituavajjavalituavajlituavajjavalituavajlituavajjavalituavajlituavajjavalituavajlituavajjavalituavajlituavajjavalituavajlituavajjavalituavajlituavajjavalituavajlituavajjavalituavajlituavajjavalituavajlituavajjavalituavajlituavajjavalituavajlituavajjavalituavajlituavajjavalituavajlituavajjavalituavajlituavaj", "         ....................................................................", "false.lang.Stringclass java.lang.Stringclass java.lang.Stringclasinterface java.lang.Cloneable$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$interface java.io.Serializable");
        org.junit.Assert.assertNull(str3);
    }

    @Test
    public void test35834() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest71.test35834");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBetween("44444444444444444444-1java444444444444444444444", "                                                                                                                                                                                                                                  JAVATSILYARRATSILYARRATSILYARRA                                                                                                                                                                                                                                  ");
        org.junit.Assert.assertNull(str2);
    }

    @Test
    public void test35835() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest71.test35835");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.startsWithIgnoreCase("lutilutilutilutilutil####lutilutilutilutilutilylistarraylistarrayylistarraylistarrayylistarraylistarrayylistarraylistarrayylistarraylistarrayylistarraylistarrayylistarraylistarrayylistarraylistarrayylistarraylistarrayylistarraylistarrayylistarraylistarrayylistarraylistarrayylistarraylistarrayylistarraylistarrayylistarraylistarrayylistarraylistarrayylistarraylistarrayylistarraylistarrayylistarraylistarrayylistarraylistarrayylistarraylistarrayylistarraylistarrayylistarraylistarrayylistarraylistarrayylistarraylistarrayylistarraylistarrayylistarraylistarrayylistarraylistarrayylistarraylistarrayylistarraylistarrayylistarraylistarrayylistarraylistarrayylistarraylistarrayylistarraylistarrayylistarraylistarrayylistarraylistarrayylistarraylistarrayylistarraylistarrayylistarraylistarrayylistarraylistarrayylistarraylistarrayylistarraylistarrayylistarraylistarrayylistarraylistarrayylistarraylistarrayylistarraylistarrayylistarraylistarrayylistarraylista", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaJAVA.LANG.CLONEABLE...                                 INTERFACE JAVA.IO.SERIALIZABLE");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test35836() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest71.test35836");
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.overlay("                A..AYL A.44444444444444444444444444                                                 ", "javalgnal.avajgnal.avajgnal.avajgnal.avajgnal.avajgnal.avajgnal.avajgnal.avajgnal.avajgnal.aG.JAVAGNAL.AVAJLANG.J######################", 167, 486);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "                A..AYL A.44444444444444444444444444                                                 javalgnal.avajgnal.avajgnal.avajgnal.avajgnal.avajgnal.avajgnal.avajgnal.avajgnal.avajgnal.aG.JAVAGNAL.AVAJLANG.J######################" + "'", str4, "                A..AYL A.44444444444444444444444444                                                 javalgnal.avajgnal.avajgnal.avajgnal.avajgnal.avajgnal.avajgnal.avajgnal.avajgnal.avajgnal.aG.JAVAGNAL.AVAJLANG.J######################");
    }

    @Test
    public void test35837() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest71.test35837");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphanumeric((java.lang.CharSequence) "       ][sslC][sslCrChahacta][sslC][LAutil][sslC][sslCrChahacta][sslC][LA                                                                               ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test35838() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest71.test35838");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isEmpty((java.lang.CharSequence) "gnal.aL.ArrayList");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test35839() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest71.test35839");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.right("4444444444444444444444444444444444444444444444444444444444444444444444444444444rclass java.lang.O...", 155);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "4444444444444444444444444444444444444444444444444444444444444444444444444444444rclass java.lang.O..." + "'", str2, "4444444444444444444444444444444444444444444444444444444444444444444444444444444rclass java.lang.O...");
    }

    @Test
    public void test35840() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest71.test35840");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.equalsIgnoreCase("$ $ $ $ $ $ $ $ $ $ $ $ $ $ $ $ $ $ $ $ $ $ $ siLyarrA!iH", "avajli 444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444litu");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test35841() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest71.test35841");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.mid("", 40, 0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test35842() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest71.test35842");
        int int3 = org.apache.commons.lang3.StringUtils.lastOrdinalIndexOf("A..ayL################################A.", "A..ayL A", 897);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test35843() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest71.test35843");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOf("                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                             4444444.44444444", 483);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test35844() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest71.test35844");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass2 = org.apache.commons.lang3.ClassUtils.getClass("avaj ..........................................................................................................................................................................................................................................................................................................................................", true);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassNotFoundException; message: avaj//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////");
        } catch (java.lang.ClassNotFoundException e) {
            // Expected exception.
        }
    }

    @Test
    public void test35845() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest71.test35845");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.remove("interface#java.lang.Cloneable4interface#java.io.Serializableinterface#java.lang.Cloneable4interface#java.io.Serializableinterface#java.lang.Cloneable4interface#java.io.Serializableinterface#java.lang.Cloneable4interface#java.io.Serializableinterface#java.lang.Cloneable4interface#java.io.Serializableinterface#java.lang.Cloneable4interface#java.io.Serializableinterface#java.lang.Cloneable4interface#java.io.Serializableaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "444444444444INTERFACE JAVA.LANG.cLONEABLEsTRINGINTERFACE JAVA.IO.sERIALIZABLE444444444444444444444444444444444444444444444444444444444444444444444444444444444litu.avajlit");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "interface#java.lang.Cloneable4interface#java.io.Serializableinterface#java.lang.Cloneable4interface#java.io.Serializableinterface#java.lang.Cloneable4interface#java.io.Serializableinterface#java.lang.Cloneable4interface#java.io.Serializableinterface#java.lang.Cloneable4interface#java.io.Serializableinterface#java.lang.Cloneable4interface#java.io.Serializableinterface#java.lang.Cloneable4interface#java.io.Serializableaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa" + "'", str2, "interface#java.lang.Cloneable4interface#java.io.Serializableinterface#java.lang.Cloneable4interface#java.io.Serializableinterface#java.lang.Cloneable4interface#java.io.Serializableinterface#java.lang.Cloneable4interface#java.io.Serializableinterface#java.lang.Cloneable4interface#java.io.Serializableinterface#java.lang.Cloneable4interface#java.io.Serializableinterface#java.lang.Cloneable4interface#java.io.Serializableaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
    }

    @Test
    public void test35846() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest71.test35846");
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.split("ArrayList", "hi!", (int) (short) 100);
        java.lang.String str6 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray4, 'a');
        java.lang.String[] strArray8 = org.apache.commons.lang3.StringUtils.splitByCharacterTypeCamelCase("aaaaaa...");
        java.lang.String str9 = org.apache.commons.lang3.StringUtils.replaceEachRepeatedly("  $         $         $         $         $         $         $         $         $         $         $         $ ...", strArray4, strArray8);
        java.lang.String str10 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray8);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "ArrayLast" + "'", str6, "ArrayLast");
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "  $         $         $         $         $         $         $         $         $         $         $         $ ..." + "'", str9, "  $         $         $         $         $         $         $         $         $         $         $         $ ...");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "aaaaaa..." + "'", str10, "aaaaaa...");
    }

    @Test
    public void test35847() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest71.test35847");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOf("ASALYAVV", 536);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test35848() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest71.test35848");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfIgnoreCase("                                                                                                                                                                                                                                                                                                                                                              elbazilaire.oi.avaj ecafretn", "L.Arr#yListgnaljava..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java........");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test35849() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest71.test35849");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNumericSpace((java.lang.CharSequence) "                                                                                                                                                                                                                             va.langGNAL..la..                                                                                   etyBetyBetyBetyBetyBetyBetyBetyBetyBetyBetyBetyBetyBetyBetyBetyBetyBetyBetyBetyBetyBetyBetyB                                                                                                                                                                                                                             va.langGNAL..la..                                                                                    ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test35850() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest71.test35850");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNotBlank((java.lang.CharSequence) "GNALJAVA");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test35851() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest71.test35851");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("elbazilaireS.oi.agagecafretnignirAAAAAAAAAAnga.lagagAAAAAAAAAAnga.lagagAAAAAAAAAAnga.lagagAAAAAAAAAAnga.lagagAAAAAAAAAAnga.lagagAAAAAAAAAAnga.lagagAAAAAAAAAAnga.lagagAAAAAAAAAAnga.lagagAAAAAAAAAAnga.lagagAAAAAAAAAAnga.lagagAAAAAAAAAAnga.lagagAAAAAAAAAAnga.lagagAAAAAAAAAAnga.lagagAAAAAAAAAAnga.lagagAAAAAAAAAAnga.lagagAAAAAAAAAAnga.lagagAAAAAAAAAAnga.lagagAAAAAAAAAAnga.lagagAAAAAAAAAAnga.lagagAAAAAAAAAAnga.lagagAAAAAAAAAAnga.lagagAAAAAAAAAAnga.lagagAAAAAAAAAAnga.lagagAAAAAAAAAAnga.lagagAAAAAAAAAAnga.lagagAAAAAAAAAAnga.lagagAAAAAAAAAAnga.lagagAAAAAAAAAAnga.lagagAAAAAAAAAAnga.lagagAAAAAAAAAAnga.lagagAAAAAAAAAAnga.lagagAAAAAAAAAAnga.lagagAAAAAAAAAAnga.lagagAAAAAAAAAAnga.lagagAAAAAAAAAAnga.lagagAAAAAAAAAAelbaenolC.gnal.agagecafretni", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaainterface java.lang.CloneableStringinterface java.io.Serializable");
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test35852() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest71.test35852");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceChars("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaajava.java", '#', 'a');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaajava.java" + "'", str3, "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaajava.java");
    }

    @Test
    public void test35853() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest71.test35853");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.containsWhitespace("interfacejava.lang.CloneableINTERFACEJAVA.LANG.CLONEABLELANG.GNALJAVA.LANGAVAJ.GNALJAVA.LANGAVAJ.GNALJAVA.LANGAVAJ.GNALJAVA.LANGAVAJ.GNALJAVA.LANGAVAJ.GNALJAVA.LANGAVAJ.GNALJAVA.LANGAVAJ.GNALJAVA.LANGAVAJ.JAVAINTERFACEJAVA.IO.SERIALIZABLEinterfacejava.io.Serializable");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test35854() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest71.test35854");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfIgnoreCase("$n$e$f$ce $$$$.$$ng.C$one$b$e$$n$e$f$ce $$$$.$o.Se$$$$$z$b$e", "UAVAJ$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test35855() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest71.test35855");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphaSpace((java.lang.CharSequence) "interfacejava.lang.Cloneable...interfacejava.io");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test35856() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest71.test35856");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.substringsBetween("                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                   avaj ssalc", "$.$vj", "...                   $$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$                             ...");
        org.junit.Assert.assertNull(strArray3);
    }

    @Test
    public void test35857() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest71.test35857");
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("...", "avaj.gnal", (int) 'a');
        boolean boolean5 = org.apache.commons.lang3.StringUtils.startsWithAny("", strArray4);
        java.lang.Class<?>[] wildcardClassArray6 = org.apache.commons.lang3.ClassUtils.toClass((java.lang.Object[]) strArray4);
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
        java.lang.Class<?>[] wildcardClassArray28 = org.apache.commons.lang3.ClassUtils.primitivesToWrappers(wildcardClassArray10);
        boolean boolean29 = org.apache.commons.lang3.ClassUtils.isAssignable(wildcardClassArray6, wildcardClassArray28);
        java.lang.Class<?>[] wildcardClassArray30 = org.apache.commons.lang3.ClassUtils.primitivesToWrappers(wildcardClassArray28);
        java.lang.String[] strArray34 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("...       ", "hi!", (int) (byte) 0);
        java.lang.String str35 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray34);
        java.lang.Class<?>[] wildcardClassArray36 = org.apache.commons.lang3.ClassUtils.toClass((java.lang.Object[]) strArray34);
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
        java.lang.Class<?>[] wildcardClassArray58 = org.apache.commons.lang3.ClassUtils.toClass((java.lang.Object[]) wildcardClassArray40);
        java.lang.Class<?>[] wildcardClassArray59 = org.apache.commons.lang3.ClassUtils.primitivesToWrappers(wildcardClassArray40);
        boolean boolean60 = org.apache.commons.lang3.ClassUtils.isAssignable(wildcardClassArray36, wildcardClassArray59);
        java.lang.Class<?>[] wildcardClassArray61 = org.apache.commons.lang3.ClassUtils.primitivesToWrappers(wildcardClassArray36);
        boolean boolean62 = org.apache.commons.lang3.ClassUtils.isAssignable(wildcardClassArray28, wildcardClassArray36);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str66 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) wildcardClassArray28, ".......", 53, 148);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
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
        org.junit.Assert.assertNotNull(wildcardClassArray28);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNotNull(wildcardClassArray30);
        org.junit.Assert.assertNotNull(strArray34);
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "...       " + "'", str35, "...       ");
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
        org.junit.Assert.assertNotNull(wildcardClassArray58);
        org.junit.Assert.assertNotNull(wildcardClassArray59);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + false + "'", boolean60 == false);
        org.junit.Assert.assertNotNull(wildcardClassArray61);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + true + "'", boolean62 == true);
    }

    @Test
    public void test35858() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest71.test35858");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.contains("interfac                                    ", 7);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test35859() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest71.test35859");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOf("...################################################################################################################################################################################################################################################################################################################################################################################################################################interface java.lang.Cloneable.......java.......Objectava..........javainterface java.io###################################################################...", 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test35860() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest71.test35860");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlpha((java.lang.CharSequence) "##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#lass java#lang#String");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test35861() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest71.test35861");
        java.lang.String str1 = org.apache.commons.lang3.ClassUtils.getShortClassName("irfco$irfiosra..ayla.444444444444444444444444444");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "444444444444444444444444444" + "'", str1, "444444444444444444444444444");
    }

    @Test
    public void test35862() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest71.test35862");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.apache.commons.lang3.StringUtils.abbreviate(".langjava.langjava.langjava.langjava...      ...      ...      ...      ...      ...      ...      ...      ...      ...      ...      ...      ...      ...      ...      ...      ...      ...      ...      ...      ...      ...      ...      ...      ...      ...      ...      ...      ...      ...      ...      ...      ...", 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Minimum abbreviation width is 4");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test35863() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest71.test35863");
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.overlay("..aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa ...aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa ...aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa ...aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa ...aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa ...aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa ...aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa ...aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa ...aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa ...rrA", "Byaa", 357, 104);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "..aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa ...aaaaaaaaByaaaaaaaaaaaaaaaaaaa ...aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa ...aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa ...aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa ...aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa ...aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa ...rrA" + "'", str4, "..aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa ...aaaaaaaaByaaaaaaaaaaaaaaaaaaa ...aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa ...aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa ...aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa ...aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa ...aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa ...rrA");
    }

    @Test
    public void test35864() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest71.test35864");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.split("                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                    java.langavaj.gnaljava.langavaj.gnaljava.langavaj.gnaljava.langavaj.gnaljava.langavaj.gnaljava.langavaj.gnaljava.langavaj.gnaljava.langavaj.gnaljava.lang", '.');
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test35865() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest71.test35865");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.chop("$$$$$$$$$$$$$$$$$$$$$$$$$$$$$aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa.hi!arraylistarraylistarraylisgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnal$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "$$$$$$$$$$$$$$$$$$$$$$$$$$$$$aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa.hi!arraylistarraylistarraylisgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnal$$$$$$$$$$$$$$$$$$$$$$$$$$$$$" + "'", str1, "$$$$$$$$$$$$$$$$$$$$$$$$$$$$$aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa.hi!arraylistarraylistarraylisgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnal$$$$$$$$$$$$$$$$$$$$$$$$$$$$$");
    }

    @Test
    public void test35866() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest71.test35866");
        char[] charArray13 = new char[] { ' ', ' ', '#', 'a', '4', 'a' };
        int int14 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "", charArray13);
        boolean boolean15 = org.apache.commons.lang3.StringUtils.containsAny("......", charArray13);
        int int16 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "Object", charArray13);
        boolean boolean17 = org.apache.commons.lang3.StringUtils.containsAny("Java.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.lang", charArray13);
        int int18 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "etyBetyBetyBetyBetyBetyBetyBetyBetyB", charArray13);
        boolean boolean19 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "44444444444444444444444444.A Lya..A", charArray13);
        boolean boolean20 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "4444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444AAAAAAAAAA", charArray13);
        org.junit.Assert.assertNotNull(charArray13);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray13), "  #a4a");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray13), "  #a4a");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray13), "[ ,  , #, a, 4, a]");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test35867() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest71.test35867");
        int int2 = org.apache.commons.lang3.StringUtils.getLevenshteinDistance((java.lang.CharSequence) "langaaaaaaaaaaaaaaaaaaaaaaa", (java.lang.CharSequence) "aaaaaaaaaaaaaaaaaaaaaaautil$$$$$$$$$$$$$$$$$$$$$$$aaaaaaaaaaaaaaaa");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 42 + "'", int2 == 42);
    }

    @Test
    public void test35868() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest71.test35868");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.substringsBetween("JAVA.LANGAgnal.avajgnal..LANGgnal.av", "JAVA.IO.SERIALIZABLE INTERFACE JAVA.LANG.CLONEABLE... INTERFACE", "                            ");
        org.junit.Assert.assertNull(strArray3);
    }

    @Test
    public void test35869() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest71.test35869");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.startsWithIgnoreCase("interface#java#lang#cloneablestringinterface#java#io", "gna");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test35870() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest71.test35870");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.rightPad("interfacejava.lang.Cloneablegnal.avajgnal..LANGgnal.avajgnal.interfacejava.io", 578);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "interfacejava.lang.Cloneablegnal.avajgnal..LANGgnal.avajgnal.interfacejava.io                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                     " + "'", str2, "interfacejava.lang.Cloneablegnal.avajgnal..LANGgnal.avajgnal.interfacejava.io                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                     ");
    }

    @Test
    public void test35871() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest71.test35871");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOfIgnoreCase("L", "CTERcHARACTERcHARACTERcHARACTERcHARACTERcHARACTERcHARACTERcHARACTERcHARACTERcHARACTERcHAR", 105);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test35872() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest71.test35872");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.chomp("ssal$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$rrayList$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$C", "Seria");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "ssal$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$rrayList$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$C" + "'", str2, "ssal$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$rrayList$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$C");
    }

    @Test
    public void test35873() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest71.test35873");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.equals((java.lang.CharSequence) "...      $ARRAYLIS", (java.lang.CharSequence) "ONEABLELANG.GNALJAVA.LANGAVAJ.GNALJAVA.LANGAVAJ.GNALJAVA.LANGAVAJ.GNALJAVA.LANGAVAJ.GNALJAVA.LANGAVAJ.GNALJAVA.LANGAVAJ.GNALJAVA.LANGAVAJ.GNALJAVA.LANGAVAJ.JAVAINTERFACE JAVA.IO.SERIALIZABLEinterface java.io.Serializableinterface java.lang.CloneableINTERFACE JAVA.LANG.CLONEABLELANG.GNALJAVA.LANGAVAJ.GNALJAVA.LANGAVAJ.GNALJAVA.LANGAVAJ.GNALJAVA.LANGAVAJ.GNALJAVA.LANGAVAJ.GNALJAVA.LANGAVAJ.GNALJAVA.LANGAVAJ.GNALJAVA.");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test35874() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest71.test35874");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.substringsBetween("                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                  4444444string.44444444", "...$$$$$$$$$$$$$$$...                                                                                                                                                                                                                                                              ", "");
        org.junit.Assert.assertNull(strArray3);
    }

    @Test
    public void test35875() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest71.test35875");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripToEmpty("langAGNALelbazilaireSelbazilaireSelbazilaireSelbazilaireSelbazilaireSelbazilaireSelbazilaireSelbazilaireSelbazilaireSelbazilaireSelbazilaireSelbazilaireSelbazilaireSelbazilaireSelbazilaireSelbazilaireSelbazilaireSelbazilaireSelbazilaireSelbazilaireSelbazilaireSelbazilaireSelbazilaireSelbazilaireSelbazilaireSelbazilaireSelbazilaireSelbazilaireSelbazilaireSelbazilaireSelbazilaireSelbazilaireSelbazilaireSe");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "langAGNALelbazilaireSelbazilaireSelbazilaireSelbazilaireSelbazilaireSelbazilaireSelbazilaireSelbazilaireSelbazilaireSelbazilaireSelbazilaireSelbazilaireSelbazilaireSelbazilaireSelbazilaireSelbazilaireSelbazilaireSelbazilaireSelbazilaireSelbazilaireSelbazilaireSelbazilaireSelbazilaireSelbazilaireSelbazilaireSelbazilaireSelbazilaireSelbazilaireSelbazilaireSelbazilaireSelbazilaireSelbazilaireSelbazilaireSe" + "'", str1, "langAGNALelbazilaireSelbazilaireSelbazilaireSelbazilaireSelbazilaireSelbazilaireSelbazilaireSelbazilaireSelbazilaireSelbazilaireSelbazilaireSelbazilaireSelbazilaireSelbazilaireSelbazilaireSelbazilaireSelbazilaireSelbazilaireSelbazilaireSelbazilaireSelbazilaireSelbazilaireSelbazilaireSelbazilaireSelbazilaireSelbazilaireSelbazilaireSelbazilaireSelbazilaireSelbazilaireSelbazilaireSelbazilaireSelbazilaireSe");
    }

    @Test
    public void test35876() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest71.test35876");
        java.lang.ClassLoader classLoader0 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass3 = org.apache.commons.lang3.ClassUtils.getClass(classLoader0, "...AAAAAAAAAA... AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA... AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA... AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA... AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA... AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA", false);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassNotFoundException; message: ///AAAAAAAAAA///AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA///AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA///AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA///AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA///AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA");
        } catch (java.lang.ClassNotFoundException e) {
            // Expected exception.
        }
    }

    @Test
    public void test35877() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest71.test35877");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlpha((java.lang.CharSequence) "gNAL.AVAJ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test35878() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest71.test35878");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.chomp("ULANGrrVyList", "interfacejava.lang.cloneable#interfacejava.io");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "ULANGrrVyList" + "'", str2, "ULANGrrVyList");
    }

    @Test
    public void test35879() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest71.test35879");
        int int2 = org.apache.commons.lang3.StringUtils.countMatches("                 ", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa...esaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test35880() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest71.test35880");
        char[] charArray16 = new char[] { ' ', ' ', '#', 'a', '4', 'a' };
        int int17 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "", charArray16);
        boolean boolean18 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "......", charArray16);
        int int19 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "                                                                                                    ", charArray16);
        int int20 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "avaj.gnal", charArray16);
        boolean boolean21 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "", charArray16);
        boolean boolean22 = org.apache.commons.lang3.StringUtils.containsAny("javaStringnalArrayListArrayListArrayListavaj.gnalArrayListArrayListArrayLi", charArray16);
        int int23 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "444       AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA", charArray16);
        boolean boolean24 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "                                                                                           JLVLlaLNG", charArray16);
        boolean boolean25 = org.apache.commons.lang3.StringUtils.containsAny(".....................", charArray16);
        int int26 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "                                                                                                                                                                                                                  java.io.Serializable java.lang.CloneableStringinterface interface                                                                                                                                                                                                                   ", charArray16);
        org.junit.Assert.assertNotNull(charArray16);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray16), "  #a4a");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray16), "  #a4a");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray16), "[ ,  , #, a, 4, a]");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 210 + "'", int26 == 210);
    }

    @Test
    public void test35881() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest71.test35881");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.equals((java.lang.CharSequence) "Interface java.lang.CloneableNG.Llitinterface java.io.Serializable", (java.lang.CharSequence) "...4444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444...");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test35882() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest71.test35882");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.defaultString("AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA", "nterface java.lang.Cloneable.......java..........java..........java..........java..........java.aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA" + "'", str2, "AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA");
    }

    @Test
    public void test35883() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest71.test35883");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.reverse("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaat");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "taaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa" + "'", str1, "taaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
    }

    @Test
    public void test35884() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest71.test35884");
        java.lang.CharSequence charSequence2 = org.apache.commons.lang3.StringUtils.defaultIfEmpty((java.lang.CharSequence) "VA1J$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$", (java.lang.CharSequence) "$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$Gnal$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$");
        org.junit.Assert.assertEquals("'" + charSequence2 + "' != '" + "VA1J$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$" + "'", charSequence2, "VA1J$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$");
    }

    @Test
    public void test35885() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest71.test35885");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsAny("JAVA.UTILJAVA.UTILStringcJAVA.UTILJAVA.UTILStringcJAVA.UTILJAVA.UTILStringcJAVA.UTILJAVA.UTILStringcJAVA.UTILJAVA.UTILStringcJAVA.UTILJAVA.UTILStringcJAVA.UTILJAVA.UTILStringcJAVA.UTILJAVA.UTILStringcJAVA.UTILJAVA.UTILStringcJAVA.UTILJAVA.UTILStringcJAVA.UTILJAVA.UTILStringcJAVA.UTILJAVA.UTILStringcJAVA.UTILJAVA.UTILStringcJAVA.UTILJAVA.UTILStringcJAVA.UTILJAVA.UTILStringcJAVA.UTILJAVA.UTILStringcJAVA.UTILJAVA.UTILStringcJAVA.UTILJAVA.UTILStringcJAVA.UTILJAVA.UTILStringcJAVA.UTILJAVA.UTILStringcJAVA.UTILJAVA.UTILStringcJAVA.UTILJAVA.UTILStringcJAVA.UTILJAVA.UTIL", "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                   #");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test35886() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest71.test35886");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444litu.avajlitu", "44444444444444444444444444444444444444444444444444444444444444444444444javaulang44444444444444444");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray2);
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.concat((java.lang.Object[]) strArray2);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "it.it" + "'", str3, "it.it");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "it.it" + "'", str4, "it.it");
    }

    @Test
    public void test35887() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest71.test35887");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphaSpace((java.lang.CharSequence) "erface java.lang.CloneableA rrr rrr rrr rrr rrr rrr rrr rrr rrr rrrinterface java.io.Serializable");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test35888() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest71.test35888");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOf("                                                                                                                                                                                                                 interfSerializablece jSerializablevSerializable.lSerializableng.cloneSerializableble                                                                                                                                                                                                                 ", "                                                                                            ");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 410 + "'", int2 == 410);
    }

    @Test
    public void test35889() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest71.test35889");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("gnirtS.gnal.avaj ssalcgnirtS.gnal.avaj ssalcgnirtS.gnal.avaj ssalcgnirtS.gnal.avaj ssalcgnirtS.gnal.avaj ssalcgnirtS.gnal.avaj ssalcgnirtS.gnal.avaj ssalcgnirtS.gnal.avaj ssalcgnirtS.gnal.avaj ssalcgnirtS.gnal.avaj ssalcgnirtS.gnal.avaj ssalcgnirtS.gnal.avaj ssalcgnirtS.gnal.avaj ssalcgnirtS.gnal.avaj ssalcgnirtS.gnal.avaj ssalcgnirtS.gnal.avaj ... .... .java.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.lang... .... .java.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.lang... .... .java.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.lang... .... .java.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.lang... .... .java.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.lang... .... .4444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444", "ITU.AVAj                                                                                                                                                                                                                                                                                                                                                                                                                ");
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test35890() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest71.test35890");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "...avaj..........avaj..........avajJAVA..........JAVA..........JAVA..........JA...", "...444444.444444444444444444...                                 44444444444444444.444444444444444444...                                 44444$        aenolc.gnaelbagaga.langagaga.langagaga.langagaga.langagaga.langagaga.langagaga.langagaga.langagaga.langagaga.langagaga.langagaga.langagaga.langagaga.langagaga.langagaga.langagaga.langagaga.langagaga.langagaga.langagaga.langagaga.langagaga.langagaga.langagaga.langagaga.langagaga.langagaga.langagaga.langagaga.langagaga.langagaga.langagaga.langagaga.langagaga.langafretnigniragecagaoi.aenolc.gnaelbagaga.langagaga.langagaga.langagaga.langagaga.langagaga.langagaga.langagaga.langagaga.langagaga.langagaga.langagaga.langagaga.langagaga.langagaga.langagaga.langagaga.langagaga.langagaga.langagaga.langagaga.langagaga.langagaga.langagaga.langagaga.langagaga.langagaga.langagaga.langagaga.langagaga.langagaga.langagaga.langagaga.langagaga.langagaga.langafretnigniragecagaoi.aenolc.gnaelb");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test35891() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest71.test35891");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.split("                                                                  ", ".litu.avajlitu.avajlangjavalitu.avajlitu.avaj.litu.avajlitu.avajlangjavalitu.avajlitu.avaj.litu.avajlitu.avajlangjavalitu.avajlitu.avaj.litu.avajlitu.avajlangjavalitu.avajlitu.avaj.litu.avajlitu.avajlangjavalitu.avajlitu.avaj.litu.avajlitu.avajlangjavalitu.avajlitu.avaj.litu.avajlitu.avajlangjavalitu.avajlitu.avaj.litu.avajlitu.avajlangjavalitu.avajlitu.avaj.litu.avajlitu.avajlangjavalitu.avajlitu.avaj.litu.avajlitu.avaj1litu.avajlitu.avajAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAJlitu.avajlitu.avajavalitu.avajlitu.avaj.litu.avajlitu.avaj1litu.avajlitu.avajAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAlitu.avajlitu.avaj.litu.avajlitu.avaj1litu.avajlitu.avajAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA", 897);
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void test35892() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest71.test35892");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.strip("interface java.lang.Cloneable.......java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........javainterface java.io.Serializable", "TARRAYLITAVAJ.GNALARRAYLISTARRAYLISTARRAYLITAVAJ.GNALARRAYLISTARRAYLISTARRAYLITAVAJ.GNALARRAYLISTARRAYLISTARRAYLITAVAJ.GNALARRAYLISTARRAYLISTARRAYLITAVAJ.GNALARRAYLISTARRAYLISTARRAYLITAVAJ.GNALARRAYLISTARRAYLISTARRAYLITAVAJ.GNALARRAYLISTARRAYLISTARRAYLITAVAJ.GNALARRAYLISTARRAYLISTARRAYLITAVAJ.GNALARRAYLISTARRAYLISTARRAYLITAVAJ.GNALARRAYLISTARRAYLISTARRAYLITAVAJ.GNALARRAYLI                                 ...");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "interface java.lang.Cloneable.......java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........javainterface java.io.Serializable" + "'", str2, "interface java.lang.Cloneable.......java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........javainterface java.io.Serializable");
    }

    @Test
    public void test35893() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest71.test35893");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.split("integer", "lituLlituLlituLlituLlituLlituLlituLlituLlituLlituLlituLlituLlituLlituLlituLlituLlituLlituLlituLlituLlituLlituLlituLlituLlituLlituLlituLlituLlituLlituLlituLlituLlitu", 524);
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void test35894() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest71.test35894");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.remove("classJAVA.LANGaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaULANG", "interface java.lang.Cloneable...                                 interface java.io.Serializable");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "classJAVA.LANGaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaULANG" + "'", str2, "classJAVA.LANGaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaULANG");
    }

    @Test
    public void test35895() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest71.test35895");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.difference("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa.......................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................", "                                  $$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                  $$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$" + "'", str2, "                                  $$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$");
    }

    @Test
    public void test35896() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest71.test35896");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.chomp("...java..........java..classjavalangClassJAVAULANGJAVAULANGJAVAULANGJAVAULirtS$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$", "1java");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "...java..........java..classjavalangClassJAVAULANGJAVAULANGJAVAULANGJAVAULirtS$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$" + "'", str2, "...java..........java..classjavalangClassJAVAULANGJAVAULANGJAVAULANGJAVAULirtS$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$");
    }

    @Test
    public void test35897() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest71.test35897");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.stripEnd("...vajlang.javagnal.avajlang.javagnal.avajlang.javagnal.avajlang.javagnal.avajlang.javagnal.avajlang.javagnal.avajlang.javagnal.avajlang.javagnal.ava...", "GNALUAVAJGNALUAVAJGNALUAVAJGNALUAVAJGNALUAVAJGNALUAVAJGNALUAVAJGNALUAVAJGNALUAVAJGNALUAVAJGNALUAVAJGNALUAVAJGNALUAVAJGNALUAVAJGNALUAVAJGNALUAVAJGNALUAVAJGNALUAVAJGNALUAVAJGNALUAVAJSSALCGNALAVAJSSALC");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "...vajlang.javagnal.avajlang.javagnal.avajlang.javagnal.avajlang.javagnal.avajlang.javagnal.avajlang.javagnal.avajlang.javagnal.avajlang.javagnal.ava..." + "'", str2, "...vajlang.javagnal.avajlang.javagnal.avajlang.javagnal.avajlang.javagnal.avajlang.javagnal.avajlang.javagnal.avajlang.javagnal.avajlang.javagnal.ava...");
    }

    @Test
    public void test35898() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest71.test35898");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.chomp("java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java........", "class$javalangclass$$$$$$$$$$$$$$$$$$$$$$$javaulang$$$$$$$$$$$$$$$$$$$$$$$javaulang$$$$$$$$$$$$$$$$$$$$$$$javaulang$$$$$$$$$$$$$$$$$$$$$$$javaulang$$$$$$$$$$$$$$$$$$$$$$$javaulang$$$$$$$$$$$$$$$$$$$$$$$javaulang$$$$$$$$$$$$$$$$$$$$$$$javaulang$$$$$$$$$$$$$$$$$$$$$$$javaulang$$$$$$$$$$$$$$$$$$$$$$$javaulang$$$$$$$$$$$$$$$$$$$$$$$javaulang$$$$$$$$$$$$$$$$$$$$$$$javaulang$$$$$$$$$$$$$$$$$$$$$$$javaulang$$$$$$$$$$$$$$$$$$$$$$$javaulang$$$$$$$$$$$$$$$$$$$$$$$javaulang$$$$$$$$$$$$$$$$$$$$$$$javaulang$$$$$$$$$$$$$$$$$$$$$$$javaulang$$$$$$$$$$$$$$$$$$$$$$$javaulang$$$$$$$$$$$$$$$$$$$$$$$javaulang$$$$$$$$$$$$$$$$$$$$$$$javaulang$$$$$$$$$$$$$$$$$$$$$$$javaulang$$$$$$$$");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java........" + "'", str2, "java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java........");
    }

    @Test
    public void test35899() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest71.test35899");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfDifference((java.lang.CharSequence) "gnal                                                                1AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA", (java.lang.CharSequence) "a..IYlZIIRsOIFRI.OcFRI");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test35900() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest71.test35900");
        java.lang.String[] strArray5 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("...", "avaj.gnal", (int) 'a');
        java.lang.String str6 = org.apache.commons.lang3.StringUtils.getCommonPrefix(strArray5);
        int int7 = org.apache.commons.lang3.StringUtils.indexOfAny("][sslC", strArray5);
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.getCommonPrefix(strArray5);
        java.lang.String[] strArray10 = org.apache.commons.lang3.StringUtils.splitByCharacterType("...avaj..........avaj..........avajJAVA..........JAVA..........JAVA..........JA...");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str11 = org.apache.commons.lang3.StringUtils.replaceEachRepeatedly("S.r..gU..ls                                       S.r..gU..ls                                       S.r..gU..ls                                       ", strArray5, strArray10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Search and Replace array lengths don't match: 1 vs 14");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "..." + "'", str6, "...");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "..." + "'", str8, "...");
        org.junit.Assert.assertNotNull(strArray10);
    }

    @Test
    public void test35901() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest71.test35901");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.containsWhitespace("atsiLytcejbO.gnal.avaj ssalcrrAtsiLytcejbO.gnal.avaj ssalcrrAva.langGNAL..langjava.langAGNAL.AVAJAtsiLytcejbO.gnal.avaj ssalcrrAtsiLytcejbO.gnal.avaj ssalcrrAva.langGNAL..langjava.langAGNAL.AVAJAtsiLytcejbO.gnal.avaj ssalcrrAtsiLytcejbO.gnal.avaj ssalcrrAva.langGNAL..langjava.langAGNAL.AVAJAtsiLytcejbO.gnal.avaj ssalcrrAtsiLytcejStringAtsiLytcejbO.gnal.avaj ssalcrrAtsiLytcejbO.gnal.avaj ssalcrrAva.langGNAL..langjava.langAGNAL.AVAJAtsiLytcejbO.gnal.avaj ssalcrrAtsiLytcejbO.gnal.avaj ssalcrrAva.langGNAL..langjava.langAGNAL.AVAJAtsiLytcejbO.gnal.avaj ssalcrrAtsiLytcejbO.gnal.avaj ssalcrrAva.langGNAL..langjava.langAGNAL.AVAJAtsiLytcejbO.gnal.avaj ssalcrrAtsiLytcejb");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test35902() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest71.test35902");
        int int3 = org.apache.commons.lang3.StringUtils.indexOfIgnoreCase("INTERFACE JAVA.LANG.cLONEABLEa RRR RRR RRR RRR RRR RRR RRR RRR RNAL....................INTERFACE JAVA.LANG.cLONEABLEa RRR RRR RRR RRR RRR RRR RRR RRR R", "class java.lang", 93);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test35903() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest71.test35903");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.split("char[]");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray1);
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "char[]" + "'", str2, "char[]");
    }

    @Test
    public void test35904() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest71.test35904");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsIgnoreCase("utilString[]", "                 ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test35905() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest71.test35905");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("         ");
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray2, ' ');
        java.lang.String[] strArray7 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("                   GNAL.AVAJ", "][ssalC");
        java.lang.String str9 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray7, "                                                                                    AVAJ.GNALAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA CHARACTERCHARACTERCHARACTERCHARACTERCHARACTERCHARACTERCHARACTERCHARACTERCHARACTERCHARACTERCHARACTERCHARACTERCHARACTERCHARACTERCHARACTERCHARACTERCHARACTERCHARACTERCHARACTERCHARACTERCHARACTERCHARACTERCHARACTERCHARACTERCHARACTERCHARACTERCHARACTERCHARACTERCHARACTERCHARACTERCHARACTERCHARACTERCHARACTERCHARACTERCHARACTERCHARACTERCHARACTERCHARACTERCHARACTERCHARACTERCHARACTERCHARACTERCHARACTERCHARACTERCHARACTERCHARACTERCHARACTERCHARACTERCHARACTERCHARACTERCHARACTERCHARACTERCHARACTERCHARACTERCHARACTERCHARACTERCHARACTERCHARACTERCHARACTERCHARACTERCHARACTERCHARACTERCHARA                                                                                     ");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str10 = org.apache.commons.lang3.StringUtils.replaceEachRepeatedly(".......                                      ", strArray2, strArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Search and Replace array lengths don't match: 10 vs 1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "         " + "'", str4, "         ");
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "                   GNAL.AVAJ" + "'", str9, "                   GNAL.AVAJ");
    }

    @Test
    public void test35906() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest71.test35906");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.substringsBetween("-1String[]", "UTILsTRINGUTILsTRING-1JAVA-1JAVA", "          GNALgn");
        org.junit.Assert.assertNull(strArray3);
    }

    @Test
    public void test35907() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest71.test35907");
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("JAVA.LANG", '#');
        java.lang.String[] strArray8 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("javal#.#agn", "va.lang.Cl", 159);
        java.lang.String str9 = org.apache.commons.lang3.StringUtils.replaceEachRepeatedly("", strArray4, strArray8);
        java.lang.String[] strArray12 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("STRINGUTILS", "hi!arr...");
        java.lang.String str13 = org.apache.commons.lang3.StringUtils.replaceEachRepeatedly("gnal.avajgnal..LANGgnal.avajgnal", strArray8, strArray12);
        java.lang.String str14 = org.apache.commons.lang3.StringUtils.concat((java.lang.Object[]) strArray12);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNotNull(strArray12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "gnal.avajgnal..LANGgnal.avajgnal" + "'", str13, "gnal.avajgnal..LANGgnal.avajgnal");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "STRINGUTILS" + "'", str14, "STRINGUTILS");
    }

    @Test
    public void test35908() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest71.test35908");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.leftPad("IrfCo$irfioSrii", 25, '.');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "..........IrfCo$irfioSrii" + "'", str3, "..........IrfCo$irfioSrii");
    }

    @Test
    public void test35909() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest71.test35909");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.uncapitalize((java.lang.CharSequence) "                                                                                 JAVAlLANGJ  ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "                                                                                 JAVAlLANGJ  " + "'", str1, "                                                                                 JAVAlLANGJ  ");
    }

    @Test
    public void test35910() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest71.test35910");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("irfCo$irfioSriizaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "javal######################");
        int int4 = org.apache.commons.lang3.StringUtils.indexOfDifference((java.lang.CharSequence[]) strArray3);
        int int5 = org.apache.commons.lang3.StringUtils.lastIndexOfAny("Class[]", strArray3);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
    }

    @Test
    public void test35911() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest71.test35911");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.stripEnd("                                                                                                                                                                                                                                                                                                           interfacejava.lang.cloneable4ignirtinterfacejava.lang.cloneable4i                                                                                                                                                                                                                                                                                                            ", "      .");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                                                                                                                                                                                                                                                                                           interfacejava.lang.cloneable4ignirtinterfacejava.lang.cloneable4i" + "'", str2, "                                                                                                                                                                                                                                                                                                           interfacejava.lang.cloneable4ignirtinterfacejava.lang.cloneable4i");
    }

    @Test
    public void test35912() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest71.test35912");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.remove("4...4...4...4...4...4...4...4...4...4", 'a');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "4...4...4...4...4...4...4...4...4...4" + "'", str2, "4...4...4...4...4...4...4...4...4...4");
    }

    @Test
    public void test35913() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest71.test35913");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.substringBetween("                                                                                                                                                                                                                                                                                                                                                                                                          Java.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava...                                                                                                                                                                                                                                                                                                                                                                                                           ", "h!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ihgn gnal.avaj", "AAAAAAAAAAAAAAAAAAAjavaulangAAAAAAAAAAAAAAAAAA");
        org.junit.Assert.assertNull(str3);
    }

    @Test
    public void test35914() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest71.test35914");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.split("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa       Javaaaaaaaaaava.langava.langjava.langjava.langjava.la", "aaaaaaaaaaaaaaaaaaaaaaaaaGN                                            aaaaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test35915() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest71.test35915");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripToNull("LANG.JAVAGNAL.AVAJLANG.JAVAGNAL.AVAJLANG.JAVAGNAL.AVAJLANG.JAVAG");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "LANG.JAVAGNAL.AVAJLANG.JAVAGNAL.AVAJLANG.JAVAGNAL.AVAJLANG.JAVAG" + "'", str1, "LANG.JAVAGNAL.AVAJLANG.JAVAGNAL.AVAJLANG.JAVAGNAL.AVAJLANG.JAVAG");
    }

    @Test
    public void test35916() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest71.test35916");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.split("                                                                                                                                                                                                                      irfSeriaCoSeria$SeriairfioSeriInterface java.lang.Cloneable             Character             interface java.io.SerializableirfSeriaCoSeria$SeriairfioSeria                                                                                                                                                                                                                                                                                                                                    ", ' ');
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test35917() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest71.test35917");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripToNull("$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$" + "'", str1, "$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$");
    }

    @Test
    public void test35918() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest71.test35918");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitByCharacterType("                                                      #############################################");
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test35919() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest71.test35919");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOfIgnoreCase("JAVA.LANGA", "VA.LANGAVAJ.GNALJAVA.LANGAVAJ.GNALJAVA.LANGAVAJ.GNALJAVA.LANGAVAJ.GNALJAVA.LANGAVAJ.GNALJAV");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test35920() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest71.test35920");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("javaaaaaaaaaava.langava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjav");
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test35921() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest71.test35921");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isWhitespace((java.lang.CharSequence) "$         44444444444444444444444444444444444444444444444444444444444444444444444444444444                                                           ...saitujairtssaijavaulainterface java.lang.cloneable4interface java.io.serializable...saitujairtssaijavaulainterface java.lang.cloneable4interface java.io.serializable...saitujairtssaijavaulainterface java.lang.cloneable4interface java.io.serializable...saitujairtssaijavaulainterface java.lang.cloneable4interface java.io.serializabl");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test35922() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest71.test35922");
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
        java.lang.String str46 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) wildcardClassArray33, ' ', 70, (int) (byte) 1);
        java.lang.Class[] classArray48 = new java.lang.Class[0];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray49 = (java.lang.Class<?>[]) classArray48;
        java.lang.Class<?>[] wildcardClassArray50 = org.apache.commons.lang3.ClassUtils.primitivesToWrappers(wildcardClassArray49);
        boolean boolean51 = org.apache.commons.lang3.ClassUtils.isAssignable(wildcardClassArray33, wildcardClassArray50);
        java.lang.Class<?>[] wildcardClassArray52 = org.apache.commons.lang3.ClassUtils.primitivesToWrappers(wildcardClassArray33);
        java.lang.String str54 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) wildcardClassArray33, 'a');
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
        org.junit.Assert.assertEquals("'" + str46 + "' != '" + "" + "'", str46, "");
        org.junit.Assert.assertNotNull(classArray48);
        org.junit.Assert.assertNotNull(wildcardClassArray49);
        org.junit.Assert.assertNotNull(wildcardClassArray50);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertNotNull(wildcardClassArray52);
        org.junit.Assert.assertEquals("'" + str54 + "' != '" + "class java.lang.String" + "'", str54, "class java.lang.String");
    }

    @Test
    public void test35923() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest71.test35923");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceOnce("Short", "                                    CAFRETNI", "aaaaaa...aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Short" + "'", str3, "Short");
    }

    @Test
    public void test35924() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest71.test35924");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeStartIgnoreCase("gnal.avajgnal..LANGgnal.avajgnal.javal######################javal######################java", "$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "gnal.avajgnal..LANGgnal.avajgnal.javal######################javal######################java" + "'", str2, "gnal.avajgnal..LANGgnal.avajgnal.javal######################javal######################java");
    }

    @Test
    public void test35925() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest71.test35925");
        java.lang.CharSequence charSequence2 = org.apache.commons.lang3.StringUtils.defaultIfEmpty((java.lang.CharSequence) "]tu", (java.lang.CharSequence) "sTRING[]");
        org.junit.Assert.assertEquals("'" + charSequence2 + "' != '" + "]tu" + "'", charSequence2, "]tu");
    }

    @Test
    public void test35926() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest71.test35926");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOf("...nAAAAAAAAAAjaval.agnAAAAAAAAAA..", "gnirt......$$$$$$$$$$$$$$$.....$$$$", (int) '#');
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test35927() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest71.test35927");
        int int2 = org.apache.commons.lang3.StringUtils.getLevenshteinDistance((java.lang.CharSequence) "############", (java.lang.CharSequence) "LANGaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa44444444444444444444444444...");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 70 + "'", int2 == 70);
    }

    @Test
    public void test35928() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest71.test35928");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass2 = org.apache.commons.lang3.ClassUtils.getClass("JAVAL.AGNaaaaaaaaaaJAVAL.AGNaaaaaaaaaaJAVAL.AGNaaaaaaaaaaJAVAL.AGNaaaaaaaaaaJAVAL.AGNaaaaaaaaaaJAVAL.AGNaaaaaaaaaaJAVAL.AGNaaaaaaaaaaJAVAL.AGNaaaaaaaaaaJAVAL.AGNaaaaaaaaaaJAVAL.AGNaaaaaaaaaaJAVAL.AGNaaaaaaaaaaJAVAL.AGNaaaaaaaaaaJAVAL.AGNaaaaaaaaaaJAVAL.AGNaaaaaaaaaaJAVAL.AGNaaaaaaaaaaJAVAL.AGNaaaaaaaaaaJAVAL.AGNaaaaaaaaaaJAVAL.AGNaaaaaaaaaaJAVAL.AGNaaaaaaaaaaJAVAL.AGNaaaaaaaaaaJAVAL.AGNaaaaaaaaaaJAVAL.AGNaaaaaaaaaaJAVAL.AGNaaaaaaaaaaJAVAL.AGNaaaaaaaaaaJAVAL.AGNaaaaaaaaaaJAVAL.AGNaaaaaaaaaaJAVAL.AGNaaaaaaaaaaJAVAL.AGNaaaaaaaaaaJAVAL.AGNaaaaaaaaaaJAVAL.AGNaaaaaaaaaaJAVAL.AGNaaaaaaaaaaJAVAL.AGNaaaaaaaaaaJAVAL.AGNaaaaaaaaaaJAVAL.AGNaaaaaaaaaa", false);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassNotFoundException; message: JAVAL.AGNaaaaaaaaaaJAVAL.AGNaaaaaaaaaaJAVAL.AGNaaaaaaaaaaJAVAL.AGNaaaaaaaaaaJAVAL.AGNaaaaaaaaaaJAVAL.AGNaaaaaaaaaaJAVAL.AGNaaaaaaaaaaJAVAL.AGNaaaaaaaaaaJAVAL.AGNaaaaaaaaaaJAVAL.AGNaaaaaaaaaaJAVAL.AGNaaaaaaaaaaJAVAL.AGNaaaaaaaaaaJAVAL.AGNaaaaaaaaaaJAVAL.AGNaaaaaaaaaaJAVAL.AGNaaaaaaaaaaJAVAL.AGNaaaaaaaaaaJAVAL.AGNaaaaaaaaaaJAVAL.AGNaaaaaaaaaaJAVAL.AGNaaaaaaaaaaJAVAL.AGNaaaaaaaaaaJAVAL.AGNaaaaaaaaaaJAVAL.AGNaaaaaaaaaaJAVAL.AGNaaaaaaaaaaJAVAL.AGNaaaaaaaaaaJAVAL.AGNaaaaaaaaaaJAVAL.AGNaaaaaaaaaaJAVAL.AGNaaaaaaaaaaJAVAL.AGNaaaaaaaaaaJAVAL.AGNaaaaaaaaaaJAVAL.AGNaaaaaaaaaaJAVAL.AGNaaaaaaaaaaJAVAL.AGNaaaaaaaaaaJAVAL.AGNaaaaaaaaaaJAVAL.AGNaaaaaaaaaa");
        } catch (java.lang.ClassNotFoundException e) {
            // Expected exception.
        }
    }

    @Test
    public void test35929() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest71.test35929");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.substring("       java..........java..........java...       ", 24, 87);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "a..........java...       " + "'", str3, "a..........java...       ");
    }

    @Test
    public void test35930() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest71.test35930");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeStart("                                                                                                                                                                                                                                                                                                                                                                       javal$agnjaval$agnjaval$agnjaval$agnjaval$agnjaval$agnjaval$agnjaval$agnjaval$agnjaval$agnjaval$agnjaval$agnjaval$agnjaval$agnjaval$agnjaval$agnjaval$agnjaval$agnjaval$agnjaval$agnjaval$agnjaval$agnjaval$agnjaval$agnjaval$agnjaval$agnjaval$agnjaval$agnjaval$agnjaval$agnjaval$agnjaval$agnjaval$agnjaval$agnjaval$agnjaval$agnjaval$agnjaval$agnjaval$agnjaval$agnjaval$agnjaval$agnjaval$agnjaval$agnjaval$agnjaval$agnjaval$agnjaval$agnjaval$agnjaval$agnjaval$agnjaval$agnjaval$agnjaval$agnjaval$agnjaval$agnjaval$agnjaval$agnjaval$agnjaval$agnjaval$agnjaval$agnjaval$agnjaval$agn", "######################################################################################################################..aaaaaaaaaaaaaaaaaaaaaaaaaaaaa.....                                                                                                                         ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                                                                                                                                                                                                                                                                                                                                                       javal$agnjaval$agnjaval$agnjaval$agnjaval$agnjaval$agnjaval$agnjaval$agnjaval$agnjaval$agnjaval$agnjaval$agnjaval$agnjaval$agnjaval$agnjaval$agnjaval$agnjaval$agnjaval$agnjaval$agnjaval$agnjaval$agnjaval$agnjaval$agnjaval$agnjaval$agnjaval$agnjaval$agnjaval$agnjaval$agnjaval$agnjaval$agnjaval$agnjaval$agnjaval$agnjaval$agnjaval$agnjaval$agnjaval$agnjaval$agnjaval$agnjaval$agnjaval$agnjaval$agnjaval$agnjaval$agnjaval$agnjaval$agnjaval$agnjaval$agnjaval$agnjaval$agnjaval$agnjaval$agnjaval$agnjaval$agnjaval$agnjaval$agnjaval$agnjaval$agnjaval$agnjaval$agnjaval$agnjaval$agn" + "'", str2, "                                                                                                                                                                                                                                                                                                                                                                       javal$agnjaval$agnjaval$agnjaval$agnjaval$agnjaval$agnjaval$agnjaval$agnjaval$agnjaval$agnjaval$agnjaval$agnjaval$agnjaval$agnjaval$agnjaval$agnjaval$agnjaval$agnjaval$agnjaval$agnjaval$agnjaval$agnjaval$agnjaval$agnjaval$agnjaval$agnjaval$agnjaval$agnjaval$agnjaval$agnjaval$agnjaval$agnjaval$agnjaval$agnjaval$agnjaval$agnjaval$agnjaval$agnjaval$agnjaval$agnjaval$agnjaval$agnjaval$agnjaval$agnjaval$agnjaval$agnjaval$agnjaval$agnjaval$agnjaval$agnjaval$agnjaval$agnjaval$agnjaval$agnjaval$agnjaval$agnjaval$agnjaval$agnjaval$agnjaval$agnjaval$agnjaval$agnjaval$agnjaval$agn");
    }

    @Test
    public void test35931() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest71.test35931");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass2 = org.apache.commons.lang3.ClassUtils.getClass("a.Leyface javaAla..AClo.eableAAAAAAAjavaAAAAAAAObjecLavaAAAAAAAAAAjavaa.Leyface javaAaoASeyaalazable##################################################", false);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassNotFoundException; message: a/LeyfacejavaAla//AClo/eableAAAAAAAjavaAAAAAAAObjecLavaAAAAAAAAAAjavaa/LeyfacejavaAaoASeyaalazable##################################################");
        } catch (java.lang.ClassNotFoundException e) {
            // Expected exception.
        }
    }

    @Test
    public void test35932() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest71.test35932");
        java.lang.ClassLoader classLoader0 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass2 = org.apache.commons.lang3.ClassUtils.getClass(classLoader0, "..$$$$$$$$$$$$$$$$$$$$$$$$$$$$$.....");
            org.junit.Assert.fail("Expected exception of type java.lang.ClassNotFoundException; message: //$$$$$$$$$$$$$$$$$$$$$$$$$$$$$/////");
        } catch (java.lang.ClassNotFoundException e) {
            // Expected exception.
        }
    }

    @Test
    public void test35933() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest71.test35933");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "########.#######.", "...........................................................IO   ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test35934() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest71.test35934");
        int int3 = org.apache.commons.lang3.StringUtils.indexOf("rrayListrrayListrrayListrrayListrrayListrrayjavaulangr...rayListrra", "ssalc gnirtSagnalaavajaRRAYlISTaRRAYlISTaRRAYlISTAVAJAGNAaRRAYlISTaRRAYlISTaRRAYlISTAVAJAGNAaRRAYlISTaRRAYlISTaRRAYlIST", 22);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test35935() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest71.test35935");
        int int3 = org.apache.commons.lang3.StringUtils.lastOrdinalIndexOf(".langGNAL..langjava.langAGNAL.AVAJAAAAjGNALAAAAAjAAAAAAAAjAG", "                                                                                                                                                               AAAAAAAAAAAAAAAAAAAgnaluavajAAAAAAAAAAAAAAAAAAA                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                           ", 169);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test35936() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest71.test35936");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.stripStart("ang", "444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444INTERFACE JAVA.LANG.CLONEABLE4IGNIRTINTERFACE JAVA.LANG");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "ang" + "'", str2, "ang");
    }

    @Test
    public void test35937() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest71.test35937");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replace("###################################################################################################################################################class java.util.AbstractList$class java.util.AbstractCollection$class java.lang.Object###################################################################################################################################################", "", "                                                                         slitugnirtsslitugnirtsslitugnirtsslitugnirtssl                                                                          ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "###################################################################################################################################################class java.util.AbstractList$class java.util.AbstractCollection$class java.lang.Object###################################################################################################################################################" + "'", str3, "###################################################################################################################################################class java.util.AbstractList$class java.util.AbstractCollection$class java.lang.Object###################################################################################################################################################");
    }

    @Test
    public void test35938() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest71.test35938");
        java.lang.String str1 = org.apache.commons.lang3.ClassUtils.getShortClassName(".lang.Stringclass j...                                                                                                                                                                                                                                                                                                                                                                                                                                                                                   ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                   " + "'", str1, "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                   ");
    }

    @Test
    public void test35939() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest71.test35939");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("nterface java.lang.CloneableAvaj.gnalinterface java.io.Serializablenterface java.lang.CloneableAvaj.gnalinterface java.io.Serializablenterface java.lang.CloneableAvaj.gnalinterface java.io.Serializablenterface java.lang.CloneableAvaj.gnalinterface java.io.Serializablenterface java.lang.CloneableAvaj.gnalinterface java.io.Serializablenterface java.lang.CloneableAvaj.gnalinterface java.io.Serializablenterface java.lang.CloneableAvaj.gnalinterface java.io.Serializablenterface java.lang.CloneableAvaj.gnalinterface java.io.Serializablenterface java.lang.CloneableAvaj.gnalinterface java.io.Serializablenterface java.lang.CloneableAvaj.gnalinterface java.io.Serializablenterface java.lang.CloneableAvaj.gnalinterface java.io.Serializablenterface java.lang.CloneableA...O.gnal.avaj ssalcr4444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444..........", "INTERFACEJAVA.LANG.cLONEABLE#INTERFACEJAVA.IO", 0);
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray3);
        java.lang.Class<?> wildcardClass5 = strArray3.getClass();
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "nterfae javalangloneablevajgnalinterfae javaioSerializablenterfae javalangloneablevajgnalinterfae javaioSerializablenterfae javalangloneablevajgnalinterfae javaioSerializablenterfae javalangloneablevajgnalinterfae javaioSerializablenterfae javalangloneablevajgnalinterfae javaioSerializablenterfae javalangloneablevajgnalinterfae javaioSerializablenterfae javalangloneablevajgnalinterfae javaioSerializablenterfae javalangloneablevajgnalinterfae javaioSerializablenterfae javalangloneablevajgnalinterfae javaioSerializablenterfae javalangloneablevajgnalinterfae javaioSerializablenterfae javalangloneablevajgnalinterfae javaioSerializablenterfae javalangloneablegnalavaj ssalr4444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444" + "'", str4, "nterfae javalangloneablevajgnalinterfae javaioSerializablenterfae javalangloneablevajgnalinterfae javaioSerializablenterfae javalangloneablevajgnalinterfae javaioSerializablenterfae javalangloneablevajgnalinterfae javaioSerializablenterfae javalangloneablevajgnalinterfae javaioSerializablenterfae javalangloneablevajgnalinterfae javaioSerializablenterfae javalangloneablevajgnalinterfae javaioSerializablenterfae javalangloneablevajgnalinterfae javaioSerializablenterfae javalangloneablevajgnalinterfae javaioSerializablenterfae javalangloneablevajgnalinterfae javaioSerializablenterfae javalangloneablevajgnalinterfae javaioSerializablenterfae javalangloneablegnalavaj ssalr4444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444");
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test35940() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest71.test35940");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.defaultString("rrayListrrayListrrayListrrayListrrayListrrayjavaulangr...rayListrra", "gn lu v j                       ................................................................");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "rrayListrrayListrrayListrrayListrrayListrrayjavaulangr...rayListrra" + "'", str2, "rrayListrrayListrrayListrrayListrrayListrrayjavaulangr...rayListrra");
    }

    @Test
    public void test35941() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest71.test35941");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "gnal.avajgnal.avajgnal.avajgnal.avajgnal.avajgnal.avajgnal.avajgnal.avajgnal.avajgnal.avajgnal.avajgnal.avajgnal.avajgnal.avajgnal.avajgnal.avajgnal.avajgnal.avajgnal.avajgnal.avajgnal.avajgnal.avajgnal.avajgnal.avajgnal.avajgnal.avajgnal.avajgnal.avagnal.avaaaaaaaaaa4444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444vaJgnal.avajgnal.avajgnal.avajgnal.avajgnal.avajgnal.avajgnal.avajgnal.avajgnal.avajgnal.avajgnal.avajgnal.avajgnal.avajgnal.avajgnal.avajgnal.avajgnal.avajgnal.avajgnal.avajgnal.avajgnal.avajgnal.avajgnal.avajgnal.avajgnal.avajgnal.avajgnal.avajgnal.avagnal.avaaaaaaaaaa4444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444vaJgnal.avajgnal.avajgnal.avajgnal.avajgnal.avajgnal.avajgnal", "class java.lang.Class");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test35942() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest71.test35942");
        java.lang.String str2 = org.apache.commons.lang3.ClassUtils.getShortCanonicalName((java.lang.Object) "###############################A..yL A.44444444444444444444444444###############################$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$", "$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$J#v#.l#ngj#v#.l#ngj#v#.l#ngj#v#.l#ngj#v#.l#ngj#v#.l#ngj#v#.l#ngj#v#.l#ngj#v#.l#ngj#v#.l#ngj#v#.l#ngj#v#.l#ngj#v#.l#ngj#v#.l#ngj#v#.l#ngj#v#.l#ngj#v#.l#ngj#v#.l#ngj#v#.l#ngj#v#.l#ngj#v#.l#ngj#v#.l#ngj#v#.l#ngj#v#.l#ngj#v#.l#ngj#v#.l#ngj#v#.l#ngj#v#.l#ngj#v#.l#ngj#v#.l#ngj#v#.l#ngj#v#.l#ngj#v#");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "String" + "'", str2, "String");
    }

    @Test
    public void test35943() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest71.test35943");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.defaultString("RChahactaRChahactaRChahactaRChahactaRChahactaRChahactaRChahactaRChahactaRChahactaRChahactaRChahactaRChahactaRChahactaRChahactaRChahactaRChahactaRChahactaRChahactaRChahactaRChahactaRChahactaRChahactaRChahactaRChahactaRChahactaRChahactaRChahactaRChahactaRChahactaRChahactaRChahactaRChahactaRChahactaRChahactaRChahactaRChahactaRChahactaRChahactaRChahactaRChahactaRChahactaRChahactaRChahactaRChahactaRChahactaRChahactaRChahactaRChahactaRChahactaRChahactaRChahactaRChahactaRChahactaRChahactaRChahactaRChahactaRChahactaRChahactaRChahactaRChahactaRChahactaRChahactaRChahactaRChahactaRChahactaRChahactaRChahactaRChahactaRChahactaRChahactaRChahactaRChahactaRChahactaRChahactaRChahactaRChahactaRChahactaRChahactaRChahactaRChahactaRChahactaRChahactaRChahactaRChahactaRChahact", " ...AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA ...AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA ...AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA ...AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA ...AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA ...AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA ...AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA ...AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA ...AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA ....javatsiLyarrAtsiLyarrAtsiLyarrA!iHgnirtSslitUgnirtSslitUgnirtSslitUgnirtS");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "RChahactaRChahactaRChahactaRChahactaRChahactaRChahactaRChahactaRChahactaRChahactaRChahactaRChahactaRChahactaRChahactaRChahactaRChahactaRChahactaRChahactaRChahactaRChahactaRChahactaRChahactaRChahactaRChahactaRChahactaRChahactaRChahactaRChahactaRChahactaRChahactaRChahactaRChahactaRChahactaRChahactaRChahactaRChahactaRChahactaRChahactaRChahactaRChahactaRChahactaRChahactaRChahactaRChahactaRChahactaRChahactaRChahactaRChahactaRChahactaRChahactaRChahactaRChahactaRChahactaRChahactaRChahactaRChahactaRChahactaRChahactaRChahactaRChahactaRChahactaRChahactaRChahactaRChahactaRChahactaRChahactaRChahactaRChahactaRChahactaRChahactaRChahactaRChahactaRChahactaRChahactaRChahactaRChahactaRChahactaRChahactaRChahactaRChahactaRChahactaRChahactaRChahactaRChahactaRChahactaRChahact" + "'", str2, "RChahactaRChahactaRChahactaRChahactaRChahactaRChahactaRChahactaRChahactaRChahactaRChahactaRChahactaRChahactaRChahactaRChahactaRChahactaRChahactaRChahactaRChahactaRChahactaRChahactaRChahactaRChahactaRChahactaRChahactaRChahactaRChahactaRChahactaRChahactaRChahactaRChahactaRChahactaRChahactaRChahactaRChahactaRChahactaRChahactaRChahactaRChahactaRChahactaRChahactaRChahactaRChahactaRChahactaRChahactaRChahactaRChahactaRChahactaRChahactaRChahactaRChahactaRChahactaRChahactaRChahactaRChahactaRChahactaRChahactaRChahactaRChahactaRChahactaRChahactaRChahactaRChahactaRChahactaRChahactaRChahactaRChahactaRChahactaRChahactaRChahactaRChahactaRChahactaRChahactaRChahactaRChahactaRChahactaRChahactaRChahactaRChahactaRChahactaRChahactaRChahactaRChahactaRChahactaRChahactaRChahact");
    }

    @Test
    public void test35944() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest71.test35944");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOf("interface java.lang.Cloneable-1A.A.Auti.StriAj-1A.A.Auti.StriAjinterface java.io.Serializable", 386, 59);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test35945() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest71.test35945");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.rightPad("AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA... AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA... AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA... AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA... AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA... AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA... AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA... AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA... AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA... AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA", 840);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA... AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA... AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA... AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA... AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA... AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA... AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA... AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA... AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA... AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA" + "'", str2, "AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA... AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA... AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA... AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA... AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA... AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA... AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA... AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA... AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA... AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA");
    }

    @Test
    public void test35946() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest71.test35946");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.chop("GNAL.AVAJ ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "GNAL.AVAJ" + "'", str1, "GNAL.AVAJ");
    }

    @Test
    public void test35947() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest71.test35947");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAsciiPrintable((java.lang.CharSequence) "                                                                   JLANGAVLANGALLANGANG      ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test35948() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest71.test35948");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.strip("INTERFA...", "interface#java.lang.Cloneable....................................................................#######################JAVAULANGinterface#java.io");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "INTERF" + "'", str2, "INTERF");
    }

    @Test
    public void test35949() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest71.test35949");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("                                                                                                                                                                                                                             va.langGNAL..la..                                                                                                                                                                                                                              ");
        java.lang.String[] strArray7 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("tsiLyarrA.La.langtsiLyarrA.La.langtsiLyarrA.La.langtsiLyarrA.La.langtsiLyarrA.La.langtsiLyarrA.La.langtsiLyarrA.La.langtsiLyarrA.La.lang", "JAVA.LANG", 67);
        boolean boolean8 = org.apache.commons.lang3.StringUtils.endsWithAny("gnal.avajgnal..LANGgnal.avajgnal", strArray7);
        java.lang.String str9 = org.apache.commons.lang3.StringUtils.replaceEach("", strArray2, strArray7);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
    }

    @Test
    public void test35950() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest71.test35950");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.stripEnd("                                                                              javaulainterface java.lang.cloneable4interface java.io.serializable", ".....................$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                                                              javaulainterface java.lang.cloneable4interface java.io.serializable" + "'", str2, "                                                                              javaulainterface java.lang.cloneable4interface java.io.serializable");
    }

    @Test
    public void test35951() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest71.test35951");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBefore("rrayLis...VA.LANGAVAJ", "                                              ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "rrayLis...VA.LANGAVAJ" + "'", str2, "rrayLis...VA.LANGAVAJ");
    }

    @Test
    public void test35952() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest71.test35952");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.upperCase("                                                                                                                                                                                                                                                                                                                                                                                                                                                                    se...                                                                             ..........");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "                                                                                                                                                                                                                                                                                                                                                                                                                                                                    SE...                                                                             .........." + "'", str1, "                                                                                                                                                                                                                                                                                                                                                                                                                                                                    SE...                                                                             ..........");
    }

    @Test
    public void test35953() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest71.test35953");
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
        java.lang.String[] strArray43 = new java.lang.String[] { "                                   " };
        java.lang.String str44 = org.apache.commons.lang3.StringUtils.getCommonPrefix(strArray43);
        java.lang.Class<?>[] wildcardClassArray45 = org.apache.commons.lang3.ClassUtils.toClass((java.lang.Object[]) strArray43);
        java.lang.String str46 = org.apache.commons.lang3.StringUtils.concatWith("$", (java.lang.Object[]) wildcardClassArray45);
        java.lang.Class<?>[] wildcardClassArray47 = org.apache.commons.lang3.ClassUtils.wrappersToPrimitives(wildcardClassArray45);
        java.lang.String[] strArray50 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("hi!", "");
        java.lang.String[] strArray52 = org.apache.commons.lang3.StringUtils.stripAll(strArray50, "$");
        java.lang.Class<?>[] wildcardClassArray53 = org.apache.commons.lang3.ClassUtils.toClass((java.lang.Object[]) strArray50);
        java.lang.Class<?> wildcardClass54 = null;
        java.lang.Class[] classArray56 = new java.lang.Class[1];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray57 = (java.lang.Class<?>[]) classArray56;
        wildcardClassArray57[0] = wildcardClass54;
        java.lang.Class<?>[] wildcardClassArray60 = org.apache.commons.lang3.ClassUtils.primitivesToWrappers(wildcardClassArray57);
        java.lang.String[] strArray62 = new java.lang.String[] { "                                   " };
        java.lang.String str63 = org.apache.commons.lang3.StringUtils.getCommonPrefix(strArray62);
        java.lang.Class<?>[] wildcardClassArray64 = org.apache.commons.lang3.ClassUtils.toClass((java.lang.Object[]) strArray62);
        java.lang.Class<?> wildcardClass65 = null;
        java.lang.Class[] classArray67 = new java.lang.Class[1];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray68 = (java.lang.Class<?>[]) classArray67;
        wildcardClassArray68[0] = wildcardClass65;
        java.lang.Class<?>[] wildcardClassArray71 = org.apache.commons.lang3.ClassUtils.primitivesToWrappers(wildcardClassArray68);
        boolean boolean72 = org.apache.commons.lang3.ClassUtils.isAssignable(wildcardClassArray64, wildcardClassArray68);
        boolean boolean74 = org.apache.commons.lang3.ClassUtils.isAssignable(wildcardClassArray57, wildcardClassArray68, true);
        boolean boolean76 = org.apache.commons.lang3.ClassUtils.isAssignable(wildcardClassArray53, wildcardClassArray68, false);
        java.lang.String str80 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) wildcardClassArray68, '#', (int) ' ', 10);
        java.lang.Class<?>[] wildcardClassArray81 = org.apache.commons.lang3.ClassUtils.primitivesToWrappers(wildcardClassArray68);
        java.lang.String str82 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) wildcardClassArray81);
        boolean boolean84 = org.apache.commons.lang3.ClassUtils.isAssignable(wildcardClassArray47, wildcardClassArray81, true);
        boolean boolean86 = org.apache.commons.lang3.ClassUtils.isAssignable(wildcardClassArray40, wildcardClassArray81, false);
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
        org.junit.Assert.assertNotNull(strArray43);
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "                                   " + "'", str44, "                                   ");
        org.junit.Assert.assertNotNull(wildcardClassArray45);
        org.junit.Assert.assertEquals("'" + str46 + "' != '" + "class java.lang.String" + "'", str46, "class java.lang.String");
        org.junit.Assert.assertNotNull(wildcardClassArray47);
        org.junit.Assert.assertNotNull(strArray50);
        org.junit.Assert.assertNotNull(strArray52);
        org.junit.Assert.assertNotNull(wildcardClassArray53);
        org.junit.Assert.assertNotNull(classArray56);
        org.junit.Assert.assertNotNull(wildcardClassArray57);
        org.junit.Assert.assertNotNull(wildcardClassArray60);
        org.junit.Assert.assertNotNull(strArray62);
        org.junit.Assert.assertEquals("'" + str63 + "' != '" + "                                   " + "'", str63, "                                   ");
        org.junit.Assert.assertNotNull(wildcardClassArray64);
        org.junit.Assert.assertNotNull(classArray67);
        org.junit.Assert.assertNotNull(wildcardClassArray68);
        org.junit.Assert.assertNotNull(wildcardClassArray71);
        org.junit.Assert.assertTrue("'" + boolean72 + "' != '" + false + "'", boolean72 == false);
        org.junit.Assert.assertTrue("'" + boolean74 + "' != '" + false + "'", boolean74 == false);
        org.junit.Assert.assertTrue("'" + boolean76 + "' != '" + false + "'", boolean76 == false);
        org.junit.Assert.assertEquals("'" + str80 + "' != '" + "" + "'", str80, "");
        org.junit.Assert.assertNotNull(wildcardClassArray81);
        org.junit.Assert.assertEquals("'" + str82 + "' != '" + "" + "'", str82, "");
        org.junit.Assert.assertTrue("'" + boolean84 + "' != '" + false + "'", boolean84 == false);
        org.junit.Assert.assertTrue("'" + boolean86 + "' != '" + false + "'", boolean86 == false);
    }

    @Test
    public void test35954() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest71.test35954");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceChars("JAVA.LANGaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "....................................................................................................................................................................jvstringnlrrylistrrylistrrylistv..............................................................................................................................................................................................................................................................", "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                 int");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "JAVA LANGaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa" + "'", str3, "JAVA LANGaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
    }

    @Test
    public void test35955() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest71.test35955");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.contains("aAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA       CharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterChara", "UTILSTRING.UTILSTRING-1JAVA.-1JAVA");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test35956() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest71.test35956");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOf("", "AAAAAAAAAA");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test35957() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest71.test35957");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.equals((java.lang.CharSequence) "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", (java.lang.CharSequence) "ttBysINTER");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test35958() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest71.test35958");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaainterface java.lang.CloneableStringinterface java.io.Serializable", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaGNALUAVAJGNALUAVAJGNALUAVAJGNALUAVAJGNALUAVAJGNALUAVAJGNALUAVAJGNALUAVAJGNALUAVAJGNALUAVAJGNALUAVAJGNALUAVAJGNALUAVAJGNALUAVAJGNALUAVAJGNALUAVAJGNALUAVAJGNALUAVAJGNALUAVAJGNALUAVAJSSALCGNALAVAJSSALC");
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test35959() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest71.test35959");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphanumeric((java.lang.CharSequence) "GNALJAVA.LANGAVAJ.GNALJAVA.LANGAVAJ.GNALJAVA.LANGH!IH!IH!IH!IH!IH!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test35960() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest71.test35960");
        char[] charArray14 = new char[] { ' ', ' ', '#', 'a', '4', 'a' };
        int int15 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "", charArray14);
        boolean boolean16 = org.apache.commons.lang3.StringUtils.containsAny("$", charArray14);
        boolean boolean17 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "...       AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA...       AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA...       AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA...       AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA...       AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA...       AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA...       AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA...       AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA...       AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA...       AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA", charArray14);
        boolean boolean18 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "rrayList", charArray14);
        int int19 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "agnAAAAAAAAAA", charArray14);
        boolean boolean20 = org.apache.commons.lang3.StringUtils.containsAny("444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa       444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444", charArray14);
        int int21 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "javal.agnjaval.agnjaval.agnjaval.agnjaval.agnjaval.agnjaval.agnjaval.agnjabytejaval.agnjaval.agnjaval.agnjaval.agnjaval.agnjaval.agnjaval.agnjaval.agnja", charArray14);
        int int22 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "                                                                                                                                                                                                                                                                                                                                                            ", charArray14);
        org.junit.Assert.assertNotNull(charArray14);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray14), "  #a4a");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray14), "  #a4a");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray14), "[ ,  , #, a, 4, a]");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
    }

    @Test
    public void test35961() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest71.test35961");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.lowerCase("class java.lang.Class                       JAVAULANG                       JAVAULANG                       JAVAULANG                       JAVAULANG                       JAVAULANG                       JAVAULANG                       JAVAULANG                       JAVAULANG                       JAVAULANG                       JAVAULANG                       JAVAULANG                       JAVAULANG                       JAVAULANG                       JAVAULANG                       JAVAULANG                       JAVAULANG                       JAVAULANG                       JAVAULANG                       JAVAULANG                       JAVAULANG");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "class java.lang.class                       javaulang                       javaulang                       javaulang                       javaulang                       javaulang                       javaulang                       javaulang                       javaulang                       javaulang                       javaulang                       javaulang                       javaulang                       javaulang                       javaulang                       javaulang                       javaulang                       javaulang                       javaulang                       javaulang                       javaulang" + "'", str1, "class java.lang.class                       javaulang                       javaulang                       javaulang                       javaulang                       javaulang                       javaulang                       javaulang                       javaulang                       javaulang                       javaulang                       javaulang                       javaulang                       javaulang                       javaulang                       javaulang                       javaulang                       javaulang                       javaulang                       javaulang                       javaulang");
    }

    @Test
    public void test35962() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest71.test35962");
        java.lang.String str1 = org.apache.commons.lang3.ClassUtils.getPackageCanonicalName("java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java........");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java......." + "'", str1, "java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java.......");
    }

    @Test
    public void test35963() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest71.test35963");
        java.lang.String[] strArray5 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("ARRAYLISTARRAYLISTARRAYLISTAVAJ.GNAL", "INTERFACE JAVA.LANG.CLONEABLE.......JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVAINTERFACE JAVA.IO.SERIALIZABLE", 448);
        int int6 = org.apache.commons.lang3.StringUtils.lastIndexOfAny("nterface java.lang.Cloneable.......java..........java..........java..........java..........java.", strArray5);
        boolean boolean7 = org.apache.commons.lang3.StringUtils.startsWithAny("                                                interface java.lang.CloneableStringinterface java.io", strArray5);
        java.lang.String[] strArray8 = org.apache.commons.lang3.StringUtils.stripAll(strArray5);
        java.lang.String[] strArray10 = org.apache.commons.lang3.StringUtils.stripAll(strArray5, "                                                                                                                                                                             javaaaaaaaaaava.langava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.lang$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$                                                                                                                                                                                                                                                                                                ");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str14 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray5, "                                                                                                                                                                                                                                               vvaylasa                                                                                                                                                                                                                                                ", 2, 969);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 96 + "'", int6 == 96);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertNotNull(strArray10);
    }

    @Test
    public void test35964() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest71.test35964");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.rightPad("ass...", 156, '.');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "ass........................................................................................................................................................." + "'", str3, "ass.........................................................................................................................................................");
    }

    @Test
    public void test35965() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest71.test35965");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replace("gnal$avaj                                                                                                                                                                                                                                                                                                                                                                                                                                                       ", "       .##JAVAL###########################JAVAL###########################JAVAL###########################", "JavaJ.Jla");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "gnal$avaj                                                                                                                                                                                                                                                                                                                                                                                                                                                       " + "'", str3, "gnal$avaj                                                                                                                                                                                                                                                                                                                                                                                                                                                       ");
    }

    @Test
    public void test35966() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest71.test35966");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("AAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAA", "$", 929);
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.getCommonPrefix(strArray3);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "AAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAA" + "'", str4, "AAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAA");
    }

    @Test
    public void test35967() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest71.test35967");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.rightPad("... $$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$", 0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "... $$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$" + "'", str2, "... $$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$");
    }

    @Test
    public void test35968() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest71.test35968");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.split("hi!ArrayListArrayListArrayListavajhhhh AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAhhh AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAhhh AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAhhh AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAhhh AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAhhh AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAhhh AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAhhh AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAhhh AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAhhh AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA");
        int int3 = org.apache.commons.lang3.StringUtils.indexOfAny("ArryLis", strArray2);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test35969() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest71.test35969");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("aAAAAAAAAAAaaaalaagaAAAAAAAAAAaaaalaagaAAAAAAAAAAaaaalaagaAAAAAAAAAAaaaalaagaAAAAAAAAAAaaaalaagaAAAAAAAAAAaaaalaagaAAAAAAAAAAaaaalaagaAAAAAAAAAAaaaalaagaAAAAAAAAAAaaaalaagaAAAAAAAAAAaaaalaagaAAAAAAAAAAaaaalaagaAAAAAAAAAAaaaalaagaAAAAAAAAAAaaaalaagaAAAAAAAAAAaaaalaagaAAAAAAAAAAaaaalaagaAAAAAAAAAAaaaalaagaAAAAAAAAAAaaaalaagaAAAAAAAAAAaaaalaagaAAAAAAAAAAaaaalaa", ' ');
        java.lang.String str4 = org.apache.commons.lang3.ClassUtils.getPackageCanonicalName((java.lang.Object) strArray2, "ra                                         sTRINGuTILSsTRINGuTILSsTRINGuTILSsTRINGuTILSsTRINGuTILSsTRINGuTILSsTRINGuTILSsTRINGuTILSsTRINGuTILSsTRINGuTILSra                                         sTRINGuTILSsTRINGuTILSarraylis...va.langavaj.gnaljava.langavaj.gnaljava.langavaj.gnaljava.langavaj.gnaljava.langavaj.gnaljava.langra                                         sTRINGuTILSsTRINGuTILSsTRINGuTILSsTRINGuTILSsTRINGuTILSsTRINGuTILSsTRINGuTILSsTRINGuTILSsTRINGuTILSsTRINGuTILSra                                         sTRINGuTILSsTRINGuTILS");
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "java.lang" + "'", str4, "java.lang");
    }

    @Test
    public void test35970() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest71.test35970");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.split("class java.lang.Classclass java.lang.Classclass java.lang.Classclass java.lang.Classclass java.lang.Classclass java.lang.Classclass java.lang.Classclass java.lang.Classclass java.lang.Classclass java.lang.Classclass java.lang.Classclass java.lang.Classclass java.lang.Classclass java.lang.Classclass java.lang.Classclass java.lang.Classclass java.lang.Classclass java.lang.Classclass java.lang.Classclass java.lang.Classclass java.lang.Classclass java.lang.Classclass java.lang.Classclass java.lang.Classclass java.lang.Classclass java.lang.Classclass java.lang.Classclass java.lang.Classclass java.lang.Classclass java.lang.Class", "JAV");
        java.lang.String str4 = org.apache.commons.lang3.ClassUtils.getPackageName((java.lang.Object) "class java.lang.Classclass java.lang.Classclass java.lang.Classclass java.lang.Classclass java.lang.Classclass java.lang.Classclass java.lang.Classclass java.lang.Classclass java.lang.Classclass java.lang.Classclass java.lang.Classclass java.lang.Classclass java.lang.Classclass java.lang.Classclass java.lang.Classclass java.lang.Classclass java.lang.Classclass java.lang.Classclass java.lang.Classclass java.lang.Classclass java.lang.Classclass java.lang.Classclass java.lang.Classclass java.lang.Classclass java.lang.Classclass java.lang.Classclass java.lang.Classclass java.lang.Classclass java.lang.Classclass java.lang.Class", "RJAVAARR");
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "java.lang" + "'", str4, "java.lang");
    }

    @Test
    public void test35971() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest71.test35971");
        int int3 = org.apache.commons.lang3.StringUtils.indexOf("Hi!arraaa", "                                                                    aAAAAAAAAAAA                                  tractList$class java.util.AbstractCollection$class java.lang.Object", 325);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test35972() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest71.test35972");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringAfter("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaVAJ", "aenolc.gnaelbagaga.langagaga.langagaga.langagaga.langagaga.langagaga.langagaga.langagaga.langagaga.langagaga.langagaga.langagaga.langagaga.langagaga.langagaga.langagaga.langagaga.langagaga.langagaga.langagaga.langagaga.langagaga.langagaga.langagaga.langagaga.langagaga.langagaga.langagaga.langagaga.langagaga.langagaga.langagaga.langagaga.langagaga.langagaga.langafretnigniragecagaoi.");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test35973() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest71.test35973");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeStartIgnoreCase("oi#avaj#ecafretnignirtselbaenolc#gnal#avaj#ecafretni", "interface java.lang.Cloneableainterface java.io.Serializabl");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "oi#avaj#ecafretnignirtselbaenolc#gnal#avaj#ecafretni" + "'", str2, "oi#avaj#ecafretnignirtselbaenolc#gnal#avaj#ecafretni");
    }

    @Test
    public void test35974() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest71.test35974");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOfIgnoreCase("rrlvj.gnyListlvj.gnrrlvj.gnyListlvj.gnrrlvj.gnyListlvj.gnrrlvj.gnyListlvj.gnrrlvj.gnyListlvj.gnrrlvj.gnyLi", "AL..langjava.langAGNAL.AVAJ");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test35975() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest71.test35975");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringAfter("Arrclass java......................VAgnal.avajgnal.avajgnal.avajgnal.avajgnal.avajgn", "Llitu...O.gn$l.$v$j ss$lcr4444444444444444444444444444444444444444444444444444444444444444444444444444444...O.                                                                                                                                                                                                                                                                                                                                                                                                                                              ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test35976() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest71.test35976");
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.overlay("GN                                            ", "...AAAAAAAAAA... AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA... AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA... AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA... AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA... AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAirfCo.irfioSrAaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaairfCo.irfioSrAaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaairfCo.irfioSrAaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaairfCo.irfioSrAaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaairfCo.irfioSrAaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaairfCo.irfioSrAaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", (int) '.', 156);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "GN                                            ...AAAAAAAAAA... AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA... AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA... AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA... AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA... AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAirfCo.irfioSrAaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaairfCo.irfioSrAaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaairfCo.irfioSrAaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaairfCo.irfioSrAaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaairfCo.irfioSrAaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaairfCo.irfioSrAaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa" + "'", str4, "GN                                            ...AAAAAAAAAA... AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA... AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA... AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA... AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA... AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAirfCo.irfioSrAaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaairfCo.irfioSrAaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaairfCo.irfioSrAaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaairfCo.irfioSrAaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaairfCo.irfioSrAaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaairfCo.irfioSrAaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
    }

    @Test
    public void test35977() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest71.test35977");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("ClassJAVA.LANGa...", "elbazilaireS.......java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........javanignirtSelbaenolC.gnal.avaj ecafretni");
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test35978() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest71.test35978");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfAnyBut("                                                                                                                                                                                                                                                                                                                                                                                                                                JAVA.LANGAgnl.vjgnl..LANGgnl.vArrclss jv.lng.ObjectyListAr...                                                                                                                                                                                                                                                                                                                                                         ", "aYl a4444444444");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 416 + "'", int2 == 416);
    }

    @Test
    public void test35979() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest71.test35979");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringAfterLast("class j...", "gagnAAAAAAAAAAistArrayListArrayListavaj.gnalArrayListArrayListArrayLigagnAAAAAAAAAAistArrayListArrayListavaj.gnalArrayListArrayListArrayLigagnAAAAAAAAAAistArrayListArrayListavaj.gnalArrayListArrayListArrayLigagnAAAAAAAAAAistArrayListArrayListavaj.gnalArrayListArrayListArrayLigagnAAAAAAAAAAistArrayListArrayListavaj.gnalArrayListArrayListArrayLigagnAAAAAAAAAAistArrayListArrayListavaj.gnalArrayListArrayListArrayLigagnAAAAAAAAAAistArrayListArrayListavaj.gnalArrayListArrayListArrayLigagnAAAAAAAAAAistArrayListArrayListavaj.gnalArrayListArrayListArrayLigagnAAAAAAAAAAistArrayListArrayListavaj.gnalArrayListArrayListArrayLigagnAAAAAAAAAAistArrayListArrayListavaj.gnalArrayListArrayListArrayLigagnAAAAAAAAAAistArrayListArrayListavaj.gnalArrayListArrayListArrayLigagnAAAAAAAAAAistArrayListArrayListavaj.gnalArrayListArrayListArrayLigagnAAAAAAAAAAistinterface java.lang.Cloneable             Character             interface java.io");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test35980() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest71.test35980");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("hi!", "");
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.stripAll(strArray2, "$");
        java.lang.Class<?>[] wildcardClassArray5 = org.apache.commons.lang3.ClassUtils.toClass((java.lang.Object[]) strArray2);
        java.lang.Class<?>[] wildcardClassArray6 = org.apache.commons.lang3.ClassUtils.toClass((java.lang.Object[]) wildcardClassArray5);
        java.lang.String str10 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) wildcardClassArray6, '#', (int) (byte) -1, (-1));
        java.lang.String str11 = org.apache.commons.lang3.StringUtils.concat((java.lang.Object[]) wildcardClassArray6);
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
        java.lang.Class<?> wildcardClass33 = null;
        java.lang.Class[] classArray35 = new java.lang.Class[1];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray36 = (java.lang.Class<?>[]) classArray35;
        wildcardClassArray36[0] = wildcardClass33;
        java.lang.Class<?>[] wildcardClassArray39 = org.apache.commons.lang3.ClassUtils.primitivesToWrappers(wildcardClassArray36);
        boolean boolean41 = org.apache.commons.lang3.ClassUtils.isAssignable(wildcardClassArray26, wildcardClassArray36, false);
        boolean boolean43 = org.apache.commons.lang3.ClassUtils.isAssignable(wildcardClassArray6, wildcardClassArray36, true);
        java.lang.String str47 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) wildcardClassArray36, ' ', 800, 86);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertNotNull(wildcardClassArray5);
        org.junit.Assert.assertNotNull(wildcardClassArray6);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "class java.lang.Class" + "'", str11, "class java.lang.Class");
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
        org.junit.Assert.assertNotNull(classArray35);
        org.junit.Assert.assertNotNull(wildcardClassArray36);
        org.junit.Assert.assertNotNull(wildcardClassArray39);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertEquals("'" + str47 + "' != '" + "" + "'", str47, "");
    }

    @Test
    public void test35981() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest71.test35981");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByCharacterType("TSILYARRGNALUAVAJTSILYARRGNALUAVAJ");
        java.lang.String[] strArray5 = org.apache.commons.lang3.StringUtils.split("");
        java.lang.String[] strArray6 = org.apache.commons.lang3.StringUtils.stripAll(strArray5);
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.replaceEachRepeatedly(".uti#########################################################################ava#########################################################################jaaaaaaaautil", strArray3, strArray5);
        boolean boolean8 = org.apache.commons.lang3.StringUtils.endsWithAny("                                                                                                                                                                                                                                   gnal.avajgnal..LANGgnal                                                                                                                                                                                                                                   ", strArray5);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + ".uti#########################################################################ava#########################################################################jaaaaaaaautil" + "'", str7, ".uti#########################################################################ava#########################################################################jaaaaaaaautil");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test35982() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest71.test35982");
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
        java.lang.Class<?>[] wildcardClassArray20 = org.apache.commons.lang3.ClassUtils.wrappersToPrimitives(wildcardClassArray16);
        java.lang.Class<?>[] wildcardClassArray21 = org.apache.commons.lang3.ClassUtils.wrappersToPrimitives(wildcardClassArray16);
        java.lang.Class<?>[] wildcardClassArray22 = org.apache.commons.lang3.ClassUtils.wrappersToPrimitives(wildcardClassArray16);
        java.lang.Class<?>[] wildcardClassArray23 = org.apache.commons.lang3.ClassUtils.toClass((java.lang.Object[]) wildcardClassArray22);
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
        org.junit.Assert.assertNotNull(wildcardClassArray23);
    }

    @Test
    public void test35983() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest71.test35983");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("...                     INTERFACE JAVA.LANG.CLONEABLE...                                 INTERFAC...", "44444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444.alya..a                                  $$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$                                  $$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$                                  $$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$                                  $$$$$$$$$$$$$$$$$$$$$$$");
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test35984() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest71.test35984");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "                                                                                                                                                                                                                                                                              ArrayListArrayListArrayListavajagnal                                                                                                                                                                                                                                                                              ", "ATSIlYTCEJBo.GNAL.AVAJSSALCRRaTSIlYTCEJBo.GNAL.AVAJSSALCRRaVA.LANGgnal..LANGJAVA.LANGagnal.avajaTSIlYTCEJBo.GNAL.AVAJSSALCRRaTSIlYTCEJBo.GNAL.AVAJSSALCRRaVA.LANGgnal..LANGJAVA.LANGagnal.avajaTSIlYTCEJBo.GNAL.AVAJSSALCRRaTSIlYTCEJBo.GNAL.AVAJSSALCRRaVA.LANGgnal..LANGJAVA.LANGagnal.avajaTSIlYTCEJBo.GNAL.AVAJSSALCRRaTSIlYTCEJsTRINGaTSIlYTCEJBo.GNAL.AVAJSSALCRRaTSIlYTCEJBo.GNAL.AVAJSSALCRRaVA.LANGgnal..LANGJAVA.LANGagnal.avajaTSIlYTCEJBo.GNAL.AVAJSSALCRRaTSIlYTCEJBo.GNAL.AVAJSSALCRRaVA.LANGgnal..LANGJAVA.LANGagnal.avajaTSIlYTCEJBo.GNAL.AVAJSSALCRRaTSIlYTCEJBo.GNAL.AVAJSSALCRRaVA.LANGgnal..LANGJAVA.LANGagnal.avajaTSIlYTCEJBo.GNAL.AVAJSSALCRRaTSIlYTCEJB");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 270 + "'", int2 == 270);
    }

    @Test
    public void test35985() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest71.test35985");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.lowerCase("                                                                                                                                                                                                                                                                                                                                                                                                                 jAVA.UTI");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "                                                                                                                                                                                                                                                                                                                                                                                                                 java.uti" + "'", str1, "                                                                                                                                                                                                                                                                                                                                                                                                                 java.uti");
    }

    @Test
    public void test35986() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest71.test35986");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("class java.lang.String", "                                   ");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.stripAll(strArray2);
        java.lang.Class<?>[] wildcardClassArray4 = org.apache.commons.lang3.ClassUtils.toClass((java.lang.Object[]) strArray3);
        java.lang.String[] strArray6 = new java.lang.String[] { "                                   " };
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.getCommonPrefix(strArray6);
        java.lang.Class<?>[] wildcardClassArray8 = org.apache.commons.lang3.ClassUtils.toClass((java.lang.Object[]) strArray6);
        java.lang.Class<?>[] wildcardClassArray9 = org.apache.commons.lang3.ClassUtils.primitivesToWrappers(wildcardClassArray8);
        boolean boolean11 = org.apache.commons.lang3.ClassUtils.isAssignable(wildcardClassArray4, wildcardClassArray8, false);
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
        java.lang.Class<?>[] wildcardClassArray41 = org.apache.commons.lang3.ClassUtils.primitivesToWrappers(wildcardClassArray17);
        java.lang.Class<?>[] wildcardClassArray42 = org.apache.commons.lang3.ClassUtils.primitivesToWrappers(wildcardClassArray41);
        java.lang.Class<?>[] wildcardClassArray43 = org.apache.commons.lang3.ClassUtils.primitivesToWrappers(wildcardClassArray42);
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
        java.lang.Class<?>[] wildcardClassArray75 = org.apache.commons.lang3.ClassUtils.primitivesToWrappers(wildcardClassArray74);
        boolean boolean76 = org.apache.commons.lang3.ClassUtils.isAssignable(wildcardClassArray42, wildcardClassArray75);
        boolean boolean78 = org.apache.commons.lang3.ClassUtils.isAssignable(wildcardClassArray4, wildcardClassArray42, false);
        java.lang.Class<?> wildcardClass79 = wildcardClassArray4.getClass();
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertNotNull(wildcardClassArray4);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "                                   " + "'", str7, "                                   ");
        org.junit.Assert.assertNotNull(wildcardClassArray8);
        org.junit.Assert.assertNotNull(wildcardClassArray9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
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
        org.junit.Assert.assertNotNull(wildcardClassArray41);
        org.junit.Assert.assertNotNull(wildcardClassArray42);
        org.junit.Assert.assertNotNull(wildcardClassArray43);
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
        org.junit.Assert.assertTrue("'" + boolean76 + "' != '" + true + "'", boolean76 == true);
        org.junit.Assert.assertTrue("'" + boolean78 + "' != '" + true + "'", boolean78 == true);
        org.junit.Assert.assertNotNull(wildcardClass79);
    }

    @Test
    public void test35987() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest71.test35987");
        int int3 = org.apache.commons.lang3.StringUtils.indexOf("Aaaaaaaaaaaa", 448, 844);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test35988() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest71.test35988");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.strip("A..AYLA.44444444444444444444444444");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "A..AYLA.44444444444444444444444444" + "'", str1, "A..AYLA.44444444444444444444444444");
    }

    @Test
    public void test35989() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest71.test35989");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.rightPad("irfSeriaCoSeria$SeriairfioSeriInterface java.lang.Cloneable             Character             interface java.io.SerializableirfSeriaCoSeria$SeriairfioSeria", 446, '#');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "irfSeriaCoSeria$SeriairfioSeriInterface java.lang.Cloneable             Character             interface java.io.SerializableirfSeriaCoSeria$SeriairfioSeria###################################################################################################################################################################################################################################################################################################" + "'", str3, "irfSeriaCoSeria$SeriairfioSeriInterface java.lang.Cloneable             Character             interface java.io.SerializableirfSeriaCoSeria$SeriairfioSeria###################################################################################################################################################################################################################################################################################################");
    }

    @Test
    public void test35990() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest71.test35990");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBeforeLast(".........", "nterface java.lang.CloneableAvaj.gnalinterface java.io.Serializablenterface java.lang.CloneableAvaj.gnalinterface java.io.Serializablenterface java.lang.CloneableAvaj.gnalinterface java.io.Serializablenterface java.lang.CloneableAvaj.gnalinterface java.io.Serializablenterface java.lang.CloneableAvaj.gnalinterface java.io.Serializablenterface java.lang.CloneableAvaj.gnalinterface java.io.Serializablenterface java.lang.CloneableAvaj.gnalinterface java.io.Serializablenterface java.lang.CloneableAvaj.gnalinterface java.io.Serializablenterface java.lang.CloneableAvaj.gnalinterface java.io.Serializablenterface java.lang.CloneableAvaj.gnalinterface java.io.Serializablenterface java.lang.CloneableAvaj.gnalinterface java.io.Serializablenterface java.lang.CloneableA...O.gnal.avaj ssalcr4444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444..........");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "........." + "'", str2, ".........");
    }

    @Test
    public void test35991() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest71.test35991");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripToEmpty("4444444444444444444444444444444444444444444444gnal");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "4444444444444444444444444444444444444444444444gnal" + "'", str1, "4444444444444444444444444444444444444444444444gnal");
    }

    @Test
    public void test35992() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest71.test35992");
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
        java.lang.Class<?>[] wildcardClassArray42 = org.apache.commons.lang3.ClassUtils.wrappersToPrimitives(wildcardClassArray4);
        java.lang.Class<?>[] wildcardClassArray43 = org.apache.commons.lang3.ClassUtils.wrappersToPrimitives(wildcardClassArray42);
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
        org.junit.Assert.assertNotNull(wildcardClassArray42);
        org.junit.Assert.assertNotNull(wildcardClassArray43);
    }

    @Test
    public void test35993() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest71.test35993");
        char[] charArray10 = new char[] { ' ', ' ', '#', 'a', '4', 'a' };
        int int11 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "", charArray10);
        boolean boolean12 = org.apache.commons.lang3.StringUtils.containsAny("......", charArray10);
        int int13 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "rING-1JAVA.UTILsTRING", charArray10);
        boolean boolean14 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "ylist............................rraylist............................rraylist............................rray$arraylis", charArray10);
        org.junit.Assert.assertNotNull(charArray10);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray10), "  #a4a");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray10), "  #a4a");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray10), "[ ,  , #, a, 4, a]");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test35994() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest71.test35994");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.normalizeSpace("aaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "aaaaaaaaaaaaaaaaaaaaaaaaaaaa" + "'", str1, "aaaaaaaaaaaaaaaaaaaaaaaaaaaa");
    }

    @Test
    public void test35995() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest71.test35995");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replace("     A..AYL A.44444444444444444444444444      ", "", "44444444444444444444444444444444444444444444444444444444444444444444444444       util                                                                               ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "     A..AYL A.44444444444444444444444444      " + "'", str3, "     A..AYL A.44444444444444444444444444      ");
    }

    @Test
    public void test35996() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest71.test35996");
        java.util.Locale locale1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.apache.commons.lang3.StringUtils.lowerCase("agnAAAAAAAAA", locale1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test35997() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest71.test35997");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("                                                                                                                                                                                                                                                                                                                                                                                                                                                               LANG.JAVATSILYARRATSILYARRATSILYARRA", "AVAJ.AVAJ.AVAJ.AJ", 89);
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void test35998() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest71.test35998");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.normalizeSpace("#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#lass java#lang#String");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#lass java#lang#String" + "'", str1, "#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#lass java#lang#String");
    }

    @Test
    public void test35999() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest71.test35999");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substring("aaaaaaaaaaaaaaaaaaaaaagn", 37);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test36000() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest71.test36000");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.contains("AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                     ", 66);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }
}

