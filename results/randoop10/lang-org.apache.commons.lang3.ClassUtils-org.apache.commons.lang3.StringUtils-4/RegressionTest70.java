import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest70 {

    public static boolean debug = false;

    @Test
    public void test35001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest70.test35001");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.chomp("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaastrinaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa. aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaastrinaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "#                                   ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaastrinaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa. aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaastrinaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa" + "'", str2, "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaastrinaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa. aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaastrinaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
    }

    @Test
    public void test35002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest70.test35002");
        char[] charArray12 = new char[] { ' ', ' ', '#', 'a', '4', 'a' };
        int int13 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "", charArray12);
        boolean boolean14 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "......", charArray12);
        boolean boolean15 = org.apache.commons.lang3.StringUtils.containsAny("                                                                                                                                                                                                                                             HI!aRRAYlISTaRRAYlISTaRRAYlISTAVAJ.GNALaRRAYlISTaRRAYlISTaRRAYlISTAVAJ                                                                                                                                                                                                                                              ", charArray12);
        int int16 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) ".langjava.langjava.langjava.langjava", charArray12);
        boolean boolean17 = org.apache.commons.lang3.StringUtils.containsAny("irfCo$irfioSrAaaaaaaaaaaa                                  aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", charArray12);
        boolean boolean18 = org.apache.commons.lang3.StringUtils.containsAny("", charArray12);
        org.junit.Assert.assertNotNull(charArray12);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray12), "  #a4a");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray12), "  #a4a");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray12), "[ ,  , #, a, 4, a]");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test35003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest70.test35003");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.center("GGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGnjavalagnGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGG", 0, "                                                      #############################################");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "GGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGnjavalagnGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGG" + "'", str3, "GGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGnjavalagnGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGG");
    }

    @Test
    public void test35004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest70.test35004");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOfIgnoreCase("ih", "interfacejava.lang.Cloneable#interfacejava.io.Serializable");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test35005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest70.test35005");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.deleteWhitespace("J#avaaaaaaaaaava#.#langava#.#langjava#.#langjava#.#langjava#.#langjava#.#langjava#.#langjava#.#langjava#.#langjava#.#langjava#.#langjava#.#langjava#.#langjava#.#langjava#.#langjava#");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "J#avaaaaaaaaaava#.#langava#.#langjava#.#langjava#.#langjava#.#langjava#.#langjava#.#langjava#.#langjava#.#langjava#.#langjava#.#langjava#.#langjava#.#langjava#.#langjava#.#langjava#" + "'", str1, "J#avaaaaaaaaaava#.#langava#.#langjava#.#langjava#.#langjava#.#langjava#.#langjava#.#langjava#.#langjava#.#langjava#.#langjava#.#langjava#.#langjava#.#langjava#.#langjava#.#langjava#");
    }

    @Test
    public void test35006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest70.test35006");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeStartIgnoreCase("                                                                                                                                                                                                                                                                  ###########################################################################################################################################gn gnal.avaj                                                                                                                                                                                                                                                                  ", "ArrayListArrayListArrayListavaj.gnal                                           INTEGER                                        ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                                                                                                                                                                                                                                                  ###########################################################################################################################################gn gnal.avaj                                                                                                                                                                                                                                                                  " + "'", str2, "                                                                                                                                                                                                                                                                  ###########################################################################################################################################gn gnal.avaj                                                                                                                                                                                                                                                                  ");
    }

    @Test
    public void test35007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest70.test35007");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.substringsBetween("GNAL.AVAJGNAL..langGNAL.AVAJGNALLituLlituLlitu444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444", "][ssalCGNIRTGNIRTGNIRTGNIRTGNIRTGNIRTGNIRTGNIRTGNIRTGNIRTGNIRTGNIRTGNIRTGNIRTGNIRTGNIRTGNIRTGNIRTGNIRTGNIR", "RING-1JAVA.UTILsTRING");
        org.junit.Assert.assertNull(strArray3);
    }

    @Test
    public void test35008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest70.test35008");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.leftPad("Java.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava..", 13);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Java.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.." + "'", str2, "Java.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava..");
    }

    @Test
    public void test35009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest70.test35009");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "$$$$$$$$$$$$$$$$$$$$$$$$$$$$$", "444444444444INTERFACE JAVA.LANG.cLONEABLEsTRINGINTERFACE JAVA.IO.sERIALIZABLE444444444444444444444444444444444444444444444444444444444444444444444444444444444litu.avajlit");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test35010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest70.test35010");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.remove("A$L.AVAj", "jbOgnlvjsslsiyjbjbOgnlvjsslsiyjbjbOgnlvjsslsiyjbjbOgnlvjsslsiyjbjbOgnlvjsslsiyjbjbOgnlvjsslsiyjbjbOgnlvjsslsiyjbjbOgnlvjsslsiyjbjbOgnlvjsslsiyjbjbOgnlvjsslsiyjbjbOgnlvjsslsiyjbjbOgnlvjsslsiyjbjbOgnlvjsslsiyjbjbOgnlvjsslsiyjbjbOgnlvjsslsiyjbjbOgnlvjsslsiyjbjbOgnlvjsslsiyjbjbOgnlvjsslsiyjbjbOgnlvjsslsiyjbjbOgnlvjsslsiyjbjbOgnlvjsslsiyjbjbOgnlvjsslsiyjbjbOgnlvjsslsiyjbjbOgnlvjsslsiyjbjaaaaaaaaaaaaaaaaaaaaaaaaaGN                                            aaaaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "A$L.AVAj" + "'", str2, "A$L.AVAj");
    }

    @Test
    public void test35011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest70.test35011");
        char[] charArray14 = new char[] { ' ', ' ', '#', 'a', '4', 'a' };
        int int15 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "", charArray14);
        boolean boolean16 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "......", charArray14);
        int int17 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "                                                                                                    ", charArray14);
        int int18 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "avaj.gnal", charArray14);
        boolean boolean19 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "", charArray14);
        boolean boolean20 = org.apache.commons.lang3.StringUtils.containsAny("javaStringnalArrayListArrayListArrayListavaj.gnalArrayListArrayListArrayLi", charArray14);
        boolean boolean21 = org.apache.commons.lang3.StringUtils.containsAny("                                                                                                                                        ", charArray14);
        boolean boolean22 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "AA...", charArray14);
        org.junit.Assert.assertNotNull(charArray14);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray14), "  #a4a");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray14), "  #a4a");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray14), "[ ,  , #, a, 4, a]");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
    }

    @Test
    public void test35012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest70.test35012");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.rightPad("ARRAYLISTARRAYLISTARRAYLISTAVAJGNAL.AVAJLANG.JAVAGNAL.AVAJLANG.JAVAGNAL.AVAJLANG.JAVAGNAL.AVAJLANG.JAVAGNAL.AVAJLANG.JAVAGNAL.AVAJLANG.JAVAGNAL.AVAJLANG.JAVAGNAL.AVAJLANG.JAVAGNAL.AVAJGNAL", 240);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "ARRAYLISTARRAYLISTARRAYLISTAVAJGNAL.AVAJLANG.JAVAGNAL.AVAJLANG.JAVAGNAL.AVAJLANG.JAVAGNAL.AVAJLANG.JAVAGNAL.AVAJLANG.JAVAGNAL.AVAJLANG.JAVAGNAL.AVAJLANG.JAVAGNAL.AVAJLANG.JAVAGNAL.AVAJGNAL                                                    " + "'", str2, "ARRAYLISTARRAYLISTARRAYLISTAVAJGNAL.AVAJLANG.JAVAGNAL.AVAJLANG.JAVAGNAL.AVAJLANG.JAVAGNAL.AVAJLANG.JAVAGNAL.AVAJLANG.JAVAGNAL.AVAJLANG.JAVAGNAL.AVAJLANG.JAVAGNAL.AVAJLANG.JAVAGNAL.AVAJGNAL                                                    ");
    }

    @Test
    public void test35013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest70.test35013");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOf("      .lang.Stringclass java.lang.Stringclass java.lang.Stringclas       ", 862, 842);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test35014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest70.test35014");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("CLASSJAVA.LANG.CLASSJAVAULANGJAVAULANGJAVAULANGJAVAULANGJAVAULANGJAVAULANGJAVAULANGJAVAULANGJAVAULANGJAVAULANGJAVAULANGJAVAULANGJAVAULANGJAVAULANGJAVAULANGJAVAULANGJAVAULANGJAVAULANGJAVAULANGJAVAULANG", "lyrrtsilyrrtsilyrrlng.jvtsilyrrtsilyrrtsilyrrlngnirtsvj", 74);
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void test35015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest70.test35015");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitByCharacterTypeCamelCase("######################                                                                                                            ... ... ... ... ... ... ... ... ... ... ");
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test35016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest70.test35016");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.equalsIgnoreCase("", "io                          ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test35017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest70.test35017");
        char[] charArray13 = new char[] { ' ', ' ', '#', 'a', '4', 'a' };
        int int14 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "", charArray13);
        boolean boolean15 = org.apache.commons.lang3.StringUtils.containsAny("$", charArray13);
        java.lang.String str17 = org.apache.commons.lang3.ClassUtils.getPackageCanonicalName((java.lang.Object) charArray13, "class java.lang.String");
        int int18 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "     A..ayL A.44444444444444444444444444      ", charArray13);
        boolean boolean19 = org.apache.commons.lang3.StringUtils.containsAny("Gnal", charArray13);
        boolean boolean20 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "RARJAVAARRARJAVAARRARJAVAARRARJAVAARRARJAVAARRARJAVAARRARJAVAARRARJAVAARRARJAVAARRARJAVAARRARJAVAARRARJAVAARRARJAVAARRARJAVAARRARJAVAARRARJAVAARRARJAVAARRARJAVAARRARJAVAARRARJAVAARRARJAVAARRARJAVAARRARJAVAARRARJAVAARRARJAVAARRARJAVAARRARJAVAARRARJAVAARRARJAVAARRARJAVAARRARJAVAARRARJAVAARRARJAVAARRARJAVAARRARJAVAARRARJAVAARRARJAVAARRARJAVAARRARJAVAARRARJAVAARRARJAVAARRARJAVAARRARJAVAARRARJAVAARRARJAVAARRARJAVAARRARJAVAARRARJAVAARRARJAlass java.lang.String", charArray13);
        int int21 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "hi!arraylistarraylistarraylistavaj.gnalarraylistarraylistarraylist", charArray13);
        boolean boolean22 = org.apache.commons.lang3.StringUtils.containsAny("jAVAJAVAsTRINjAVAJAVAsTRINjAVAJAVAsTjAVAJAVAsTRINjA                                            ..", charArray13);
        org.junit.Assert.assertNotNull(charArray13);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray13), "  #a4a");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray13), "  #a4a");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray13), "[ ,  , #, a, 4, a]");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 5 + "'", int18 == 5);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 3 + "'", int21 == 3);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
    }

    @Test
    public void test35018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest70.test35018");
        char[] charArray9 = new char[] { '$' };
        int int10 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "java.util", charArray9);
        boolean boolean11 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "                                   ", charArray9);
        boolean boolean12 = org.apache.commons.lang3.StringUtils.containsAny("...       ....       .", charArray9);
        int int13 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "StringUtils", charArray9);
        boolean boolean14 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "interface java.lang.CloneableJ#v#.l#ngj#v#.l#ngj#v#.l#ngj#v#.l#ngj#v#.l#ngj#v#.l#ngj#v#.l#ngj#v#.l#ngj#v#.l#ngj#v#.l#ngj#v#.l#ngj#v#.l#ngj#v#.l#ngj#v#.l#ngj#v#.l#ngj#v#.l#ngj#v#.l#ngj#v#.l#ngj#v#.l#ngj#v#.l#ngj#v#.l#ngj#v#.l#ngj#v#.l#ngj#v#.l#ngj#v#.l#ngj#v#.l#ngj#v#.l#ngj#v#.l#ngj#v#.l#ngj#v#.l#ngj#v#.l#ngj#v#.l#ngj#v#.l#nginterface java.io.Serializabl", charArray9);
        boolean boolean15 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "aRRAYlISTaRRAYlISTaRRAYlISTAVAJgnal.avajlang.javagnal.avajlang.javagnal.avajlang.javagnal.avajlang.javagnal.avajlang.javagnal.avajlang.javagnal.avajlang.javagnal.avajlang.javagnal.avajGNAL", charArray9);
        int int16 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "AAAAAAAAAAAAAAAAAAA                                                                                                                                              AAAAAAAAAAAAAAAAAAA                                                                                                                                              AAAAAAAAAAAAAAAAAAA                                                                                                                                              AAAAAAAAAAAAAAAAAAA                                                                                                                                              AAAAAAAAAAAAAAAAAAA                                                                                                                                              AAAAAAAAAAAAAAAAAAA      ", charArray9);
        int int17 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa a..ayl", charArray9);
        org.junit.Assert.assertNotNull(charArray9);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray9), "$");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray9), "$");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray9), "[$]");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
    }

    @Test
    public void test35019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest70.test35019");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.capitalize((java.lang.CharSequence) "AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA...");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA..." + "'", str1, "AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA...");
    }

    @Test
    public void test35020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest70.test35020");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("JAVAsTRINJAVAsTRINJA...");
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test35021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest70.test35021");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.substringBetween("Gnal                                                                1AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA", "                                                                  ", "444444444444444444444444444444444444444444444444444444444444444gn                                            gn      tvj.gnlrrylistrrylistrryli");
        org.junit.Assert.assertNull(str3);
    }

    @Test
    public void test35022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest70.test35022");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "         INTEGER              ", "44444444444444444gn lu v j44444444444444444444444444444444444444444444444444444444444444444444444");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test35023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest70.test35023");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.mid("4444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444", 3, 231);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "4444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444" + "'", str3, "4444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444");
    }

    @Test
    public void test35024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest70.test35024");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.equals((java.lang.CharSequence) "RFACE JAVA.LANG.CLONEABLELANG.GNALJAVA.LANGAVAJ.GNALJAVA.LANGAVAJ.GNALJAVA.LANGAVAJ.GNALJAVA.LANGAVAJ.GNALJAVA.LANGAVAJ.GNALJAVA.LANGAVAJ.GN", (java.lang.CharSequence) "Gnirt...Gnirt...Gnirt...Gni                                            .Gnirt...Gnirt...Gnirt...Gnir");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test35025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest70.test35025");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringAfter("aaaaaaaaaa...aaaaaaaaaaaaaa...aaaaaaaaaaaaaa...aaaaaaaaaaaaaa...aaaaaaaaaaaaaa...aaaaaaaaaaaaaa...aaaaaaaaaaaaaa...aaaaaaaaaaaaaa...aaaaaaaaaaaaaa...aaaaaaaaaaaaaa...aaaaaaaaaaaaaa...aaaaaaaaaaaaaa...aaaaaaaaaaaaaa...aaaaaaaaaaaaaa...aaaaaaaaaaaaaa...aaaaaaaaaaaaaa...aaaaaaa                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                        iRFCO.IRFIOSRIIZ", "INTERFACE JAVA.LANG.CLONEABLESTRINGINTERFACE JAVA.IO");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test35026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest70.test35026");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "..........a                       ..............................................................................a                       ..............................................................................a                       ..............................................................................a                       ..............................................................................a                       ..............................................................................a                       ..............................................................................a                       ..............................................................................a                       ..............................................................................a", "gnAls444");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test35027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest70.test35027");
        java.lang.String str1 = org.apache.commons.lang3.ClassUtils.getPackageName("       aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa...");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "       aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa.." + "'", str1, "       aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa..");
    }

    @Test
    public void test35028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest70.test35028");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.normalizeSpace("interface java.lang.CloneableLANG.GNALJAVA.LANGAVAJ.GNALJAVA.LANGAV...");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "interface java.lang.CloneableLANG.GNALJAVA.LANGAVAJ.GNALJAVA.LANGAV..." + "'", str1, "interface java.lang.CloneableLANG.GNALJAVA.LANGAVAJ.GNALJAVA.LANGAV...");
    }

    @Test
    public void test35029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest70.test35029");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.split("       aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa...", "ArrayListArrayListArrayListavajagna", 67);
        java.lang.Class<?>[] wildcardClassArray4 = org.apache.commons.lang3.ClassUtils.toClass((java.lang.Object[]) strArray3);
        java.lang.Class<?>[] wildcardClassArray5 = org.apache.commons.lang3.ClassUtils.wrappersToPrimitives(wildcardClassArray4);
        java.lang.String[] strArray8 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("hi!", "");
        java.lang.String[] strArray10 = org.apache.commons.lang3.StringUtils.stripAll(strArray8, "$");
        java.lang.Class<?>[] wildcardClassArray11 = org.apache.commons.lang3.ClassUtils.toClass((java.lang.Object[]) strArray8);
        java.lang.Class<?>[] wildcardClassArray12 = org.apache.commons.lang3.ClassUtils.toClass((java.lang.Object[]) wildcardClassArray11);
        java.lang.Class<?>[] wildcardClassArray13 = org.apache.commons.lang3.ClassUtils.primitivesToWrappers(wildcardClassArray11);
        java.lang.String str15 = org.apache.commons.lang3.ClassUtils.getPackageName((java.lang.Object) wildcardClassArray11, "ARRAYLISTARRAYLISTARRAYLISTAVAJ");
        boolean boolean17 = org.apache.commons.lang3.ClassUtils.isAssignable(wildcardClassArray4, wildcardClassArray11, false);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertNotNull(wildcardClassArray4);
        org.junit.Assert.assertNotNull(wildcardClassArray5);
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertNotNull(strArray10);
        org.junit.Assert.assertNotNull(wildcardClassArray11);
        org.junit.Assert.assertNotNull(wildcardClassArray12);
        org.junit.Assert.assertNotNull(wildcardClassArray13);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "java.lang" + "'", str15, "java.lang");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test35030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest70.test35030");
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.split("litu.avaj", '#');
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray4, 'a', (int) '#', (int) '#');
        java.lang.String str9 = org.apache.commons.lang3.StringUtils.concatWith("JAVA.UTIL.", (java.lang.Object[]) strArray4);
        boolean boolean10 = org.apache.commons.lang3.StringUtils.startsWithAny("AA...                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                           ", strArray4);
        java.lang.String str12 = org.apache.commons.lang3.ClassUtils.getPackageCanonicalName((java.lang.Object) "AA...                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                           ", "ih");
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "litu.avaj" + "'", str9, "litu.avaj");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "java.lang" + "'", str12, "java.lang");
    }

    @Test
    public void test35031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest70.test35031");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.substringsBetween("gnal                                                                1AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA", "l.ngAGNALelb.zil.ireSelb.zil.ireSelb.zil.ireSelb.zil.ireSelb.zil.ireSelb.zil.ireSelb.zil.ireSelb.zil.ireSelb.zil.ireSelb.zil.ireSelb.zil.ireSelb.zil.ireSelb.zil.ireSelb.zil.ireSelb.zil.ireSelb.zil.ireSelb.zil.ireSelb.zil.ireSelb.zil.ireSelb.zil.ireSelb.zil.ireSelb.zil.ireSelb.zil.ireSelb.zil.ireSelb.zil.ireSelb.zil.ireSelb.zil.ireSelb.zil.ireSelb.zil.ireSelb.zil.ireSelb.zil.ireSelb.zil.ireSelb.zil.ireSe................................................................................................", "AAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAA");
        org.junit.Assert.assertNull(strArray3);
    }

    @Test
    public void test35032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest70.test35032");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.swapCase("yLst");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "YlST" + "'", str1, "YlST");
    }

    @Test
    public void test35033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest70.test35033");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeEndIgnoreCase("i4elbaenolC.gnal.avaj ecafretniTRINGi4elbaenolC.gnal.avaj ecaf", "                                          $$$$$$$$$$$$$$$$$$$$$$$siLyarrA!iH                                         ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "i4elbaenolC.gnal.avaj ecafretniTRINGi4elbaenolC.gnal.avaj ecaf" + "'", str2, "i4elbaenolC.gnal.avaj ecafretniTRINGi4elbaenolC.gnal.avaj ecaf");
    }

    @Test
    public void test35034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest70.test35034");
        int int2 = org.apache.commons.lang3.StringUtils.countMatches("...#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#lass java#lang#Strin", "#rj#v##rr#rj#v##rr#rj#v##rr#rj#v##rr#rj#v##rr#rj#v##rr#rj#v##rr#rj#v##rr#rj#v##rr#rj#v##rr#rj#v##rr#rj#v##rr#rj#v##rr#rj#v##rr#rj#v##rr#rj#v##rr#rj#v##rr#rj#v##rr#rj#v##rr#rj#v##rr#rj#v##rr#rj#v##rr#rj#v##rr#rj#v##rr#rj#v##rr#rj#v##rr#rj#v##rr#rj#v##rr#rj#v##rr#rj#v##rr#rj#v##rr#rj#v##rr#rj#v##rr#rj#v##rr#rj#v##rr#rj#v##rr#rj#v##rr#rj#v##rr#rj#v##rr#rj#v##rr#rj#v##rr#rj#v##rr#rj#v##rr#rj#v##rr#rj#v##rr#rj#v##rr#rj#v##rr#rj#v##rr#rj#v##rr#rj#v##rr#rj#v##rr#rj#LASSJAVA#LANG#sTRING");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test35035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest70.test35035");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("###########################VA.LANGAVAJ.GNALJAVA.LANGAVAJ.GNALJAVA.LANGAVAJ.GNALJAVA.LANGAVAJ.GNALJAVA.LANGAVAJ.GNALJAVA.LANG###########################INTERFACE JAVAaLANGacLONEABLEaaaaaaaJAVAaaaaaaaaaaJAVAaaaaaaaaaaJAVAaaaaaaaaaaJAVAaaaaaaaaaaJAVAaaaaaaaaaaJAVAaaaaaaaaaaJAVAaaaaaaaaaaJAVAaaaaaaaaaaJAVAaaaaaaaaaaJAVAaaaaaaaaaaJAVAaaaaaaaaaaJAVAaaaaaaaaaaJAVAaaaaaaaaaaJAVAaaaaaaaaaaJAVAaaaaaarrINTERFACE JAVAaLANGacLONEABLEaaaaaaaJAVAaaaaaaaaaaJAVAaaaaaaaaaaJAVAaaaaaaaaaaJAVAaaaaaaaaaaJAVAaaaaaaaaaaJAVAaaaaaaaaaaJAVAaaaaaaaaaaJAVAaaaaaaaaaaJAVAaaaaaaaaaaJAVAaaaaaaaaaaJAVAaaaaaaaaaaJAVAaaaaaaaaaaJAVAaaaaaaaaaaJAVAaaaaaaaaaaJAVAaaaaaaa", "AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA                   GNAL", 938);
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void test35036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest70.test35036");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.leftPad("gnalArrayListArrayListArrayListavaj.gnalArrayListArrayListArrayLi...aL.ArrayListgnal.aL.ArrayList...aL.ArrayListgnal.aL.ArrayList...aL.ArrayListgnal.aL.", 24, "rrayList");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "gnalArrayListArrayListArrayListavaj.gnalArrayListArrayListArrayLi...aL.ArrayListgnal.aL.ArrayList...aL.ArrayListgnal.aL.ArrayList...aL.ArrayListgnal.aL." + "'", str3, "gnalArrayListArrayListArrayListavaj.gnalArrayListArrayListArrayLi...aL.ArrayListgnal.aL.ArrayList...aL.ArrayListgnal.aL.ArrayList...aL.ArrayListgnal.aL.");
    }

    @Test
    public void test35037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest70.test35037");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.split("...AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA...1AAAAAAAAAAAAAAAAAAAAA...", "iNTERFjava..........java..........java...IZABLE");
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test35038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest70.test35038");
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("VA.LANGAVAJ.GNALJAVA.LANGAVAJ.GNALJAVA.LANGAVAJ.GNALJAVA.LANGAVAJ.GNALJAVA.LANGAVAJ.GNALJAVA", "AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA");
        boolean boolean5 = org.apache.commons.lang3.StringUtils.startsWithAny("va.langjava.langjava.lang...       ....       .java.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.lang...       ....       .", strArray4);
        int int6 = org.apache.commons.lang3.StringUtils.lastIndexOfAny("Arr                                                                               JLANGAVLANGALLANGANG                                                                                yList", strArray4);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
    }

    @Test
    public void test35039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest70.test35039");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "Jaavaaaaaaaaaavaa.alangavaa.alangjavaa.alangjavaa.alangjavaa.alangjavaa.alangjavaa.alangjavaa.alangjavaa.alangjavaa.alangjavaa.alangjavaa.alangjavaa.alangjavaa.alangjavaa.alangjavaa.alan                                                                                                                                                                                                                                                                                                                                                                                                ", "javalitu.");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test35040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest70.test35040");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.abbreviate("                                            Arra                                             ", 115, 441);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "                                            Arra                                             " + "'", str3, "                                            Arra                                             ");
    }

    @Test
    public void test35041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest70.test35041");
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.replace("ssalc gnirtS.gnal", "                                                                                                                                                                                                                                                                                                                                                                                                                                                                        ", "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                          ...     javaulangrraylist                   ...", 97);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "ssalc gnirtS.gnal" + "'", str4, "ssalc gnirtS.gnal");
    }

    @Test
    public void test35042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest70.test35042");
        java.util.Locale locale1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.apache.commons.lang3.StringUtils.upperCase("                                                                                 JAVAlLANGJ  ", locale1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test35043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest70.test35043");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNumericSpace((java.lang.CharSequence) "LGN");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test35044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest70.test35044");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeStartIgnoreCase("interfce jv.lng.Clonebleg.g.g.g.g.g.g.g.g.g.g.g.g.g.g.g.g.g.g.g.g.g.g.g.g.g.g.g.g.g.g.g.g.g.g.g.g.g.ginterfce jv.io.Serilizble", "A..AYLA.44444444444444444444444444");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "interfce jv.lng.Clonebleg.g.g.g.g.g.g.g.g.g.g.g.g.g.g.g.g.g.g.g.g.g.g.g.g.g.g.g.g.g.g.g.g.g.g.g.g.g.ginterfce jv.io.Serilizble" + "'", str2, "interfce jv.lng.Clonebleg.g.g.g.g.g.g.g.g.g.g.g.g.g.g.g.g.g.g.g.g.g.g.g.g.g.g.g.g.g.g.g.g.g.g.g.g.g.ginterfce jv.io.Serilizble");
    }

    @Test
    public void test35045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest70.test35045");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeStart("NTERFACEJAVA.LANG.cLONEABLE.......JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVAINTERFACEJAVA.IO.sERIALIZABL", "util");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "NTERFACEJAVA.LANG.cLONEABLE.......JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVAINTERFACEJAVA.IO.sERIALIZABL" + "'", str2, "NTERFACEJAVA.LANG.cLONEABLE.......JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVAINTERFACEJAVA.IO.sERIALIZABL");
    }

    @Test
    public void test35046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest70.test35046");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.split("ArrayLis", ".. u");
        java.lang.Class<?> wildcardClass3 = strArray2.getClass();
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test35047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest70.test35047");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "avajgnal.avajgnal.avajgnal.avajgnal.avELBAZILAIREs", "JJJJJJJJJJJJJJJJJJJJJJAA  ");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 41 + "'", int2 == 41);
    }

    @Test
    public void test35048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest70.test35048");
        char[] charArray7 = new char[] { ' ', '$', '.' };
        boolean boolean8 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "..", charArray7);
        boolean boolean9 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "-1java.utilString[]", charArray7);
        boolean boolean10 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "                                      A..ayL A", charArray7);
        int int11 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "class java.util.AbstractListjavaclass java.util.AbstractCollectionjavaclass java.lang.Object", charArray7);
        org.junit.Assert.assertNotNull(charArray7);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray7), " $.");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray7), " $.");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray7), "[ , $, .]");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 5 + "'", int11 == 5);
    }

    @Test
    public void test35049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest70.test35049");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphanumericSpace((java.lang.CharSequence) "                                                                 AtsiLytcejbOlvjsslcrrAtsiLytcejbO.gnal.avaj ssalcrrAva.langGNAL..langjava.langAGNAL.AVAJaa...                                                                                                                                   ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test35050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest70.test35050");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.rightPad("                                            Arra                                            ", 401);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                            Arra                                                                                                                                                                                                                                                                                                                                                                 " + "'", str2, "                                            Arra                                                                                                                                                                                                                                                                                                                                                                 ");
    }

    @Test
    public void test35051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest70.test35051");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOf("...tututututututjavaulangr...", 93);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test35052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest70.test35052");
        int int1 = org.apache.commons.lang3.StringUtils.length((java.lang.CharSequence) "interfacejava.lang.CloneableLANG.GNALJAVA.LANGAVAJ.GNALJAVA.LANGAVAJ.GNALJAVA.LANGAVAJ.GNALJAVA.LANGAVAJ.GNALJAVA.LANGAVAJ.GNALJAVA.LANGAVAJ.GNALJAVA.LANGAVAJ.GNALJAVA.LANGAVAJ.JAVAinterfacejava.io.Serializable");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 210 + "'", int1 == 210);
    }

    @Test
    public void test35053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest70.test35053");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("                                                                                                                                                                                                                                             HI!aRRAYlISTaRRAYlISTaRRAYlISTAVAJ", "irfSeriaCoSeria$SeriairfioSeriInterface java.lang.Cloneable             Character             interface java.io.SerializableirfSeriaCoSeria$SeriairfioSeria", 43);
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void test35054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest70.test35054");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringAfterLast("facejavaAAAAAAAAAAAAAAAAAAAAAAAAALANG.JAVA                                                                                    ", "$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$A rrr rrr rrr r...");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test35055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest70.test35055");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "...444444.444444444444444444...                                 44444444444444444.444444444444444444...                                 44444$        aenolc.gnaelbagaga.langagaga.langagaga.langagaga.langagaga.langagaga.langagaga.langagaga.langagaga.langagaga.langagaga.langagaga.langagaga.langagaga.langagaga.langagaga.langagaga.langagaga.langagaga.langagaga.langagaga.langagaga.langagaga.langagaga.langagaga.langagaga.langagaga.langagaga.langagaga.langagaga.langagaga.langagaga.langagaga.langagaga.langagaga.langafretnigniragecagaoi.aenolc.gnaelbagaga.langagaga.langagaga.langagaga.langagaga.langagaga.langagaga.langagaga.langagaga.langagaga.langagaga.langagaga.langagaga.langagaga.langagaga.langagaga.langagaga.langagaga.langagaga.langagaga.langagaga.langagaga.langagaga.langagaga.langagaga.langagaga.langagaga.langagaga.langagaga.langagaga.langagaga.langagaga.langagaga.langagaga.langagaga.langafretnigniragecagaoi.aenolc.gnaelb", "java");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test35056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest70.test35056");
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.split("..", "$       ", 3);
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray4, "", (int) (byte) 10, (int) (short) -1);
        java.lang.String[] strArray9 = org.apache.commons.lang3.StringUtils.stripAll(strArray4);
        int int10 = org.apache.commons.lang3.StringUtils.lastIndexOfAny("interface java.lang.Cloneable.litinterface java.io.erializable                                                                                                                                                                                                                                                                                                                                                                                                                                                                 ", strArray4);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(strArray9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
    }

    @Test
    public void test35057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest70.test35057");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.contains("######################################################################################################################..aaaaaaaaaaaaaaaaaaaaaaaaaaaaa.....", 113);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test35058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest70.test35058");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAllLowerCase((java.lang.CharSequence) "Aaaaaa");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test35059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest70.test35059");
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.split("...nAAAAAAAAAAjaval.agnAAAAAAAAAA...", "interfacegaga.lang.CloneableAAAAAAAAAAgagal.agnAAAAAAAAAAgagal.agnAAAAAAAAAAgagal.agnAAAAAAAAAAgagal.agnAAAAAAAAAAgagal.agnAAAAAAAAAAgagal.agnAAAAAAAAAAgagal.agnAAAAAAAAAAgagal.agnAAAAAAAAAAgagal.agnAAAAAAAAAAgagal.agnAAAAAAAAAAgagal.agnAAAAAAAAAAgagal.agnAAAAAAAAAAgagal.agnAAAAAAAAAAgagal.agnAAAAAAAAAAgagal.agnAAAAAAAAAAgagal.agnAAAAAAAAAAgagal.agnAAAAAAAAAAgagal.agnAAAAAAAAAAgagal.agnAAAAAAAAAAgagal.agnAAAAAAAAAAgagal.agnAAAAAAAAAAgagal.agnAAAAAAAAAAgagal.agnAAAAAAAAAAgagal.agnAAAAAAAAAAgagal.agnAAAAAAAAAAgagal.agnAAAAAAAAAAgagal.agnAAAAAAAAAAgagal.agnAAAAAAAAAAgagal.agnAAAAAAAAAAgagal.agnAAAAAAAAAAgagal.agnAAAAAAAAAAgagal.agnAAAAAAAAAAgagal.agnAAAAAAAAAAgagal.agnAAAAAAAAAAgagal.agnAAAAAAAAAAringinterfacegaga.io.Serializable", 153);
        java.lang.String str5 = org.apache.commons.lang3.StringUtils.concatWith("A44444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444", (java.lang.Object[]) strArray4);
        java.lang.String str6 = org.apache.commons.lang3.StringUtils.getCommonPrefix(strArray4);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "jA44444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444v" + "'", str5, "jA44444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444v");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
    }

    @Test
    public void test35060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest70.test35060");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.left("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaajavaulangrraylist", 64);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa" + "'", str2, "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
    }

    @Test
    public void test35061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest70.test35061");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlpha((java.lang.CharSequence) "TU");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test35062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest70.test35062");
        java.lang.ClassLoader classLoader0 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass2 = org.apache.commons.lang3.ClassUtils.getClass(classLoader0, "                                                                                                                                                                                                                                                                                                                                                                                                                                JAVA.LANGAgnal.avajgnal..LANGgnal.avArrclass java.lang.ObjectyListAr...");
            org.junit.Assert.fail("Expected exception of type java.lang.ClassNotFoundException; message: JAVA/LANGAgnal/avajgnal//LANGgnal/avArrclassjava/lang/ObjectyListAr///");
        } catch (java.lang.ClassNotFoundException e) {
            // Expected exception.
        }
    }

    @Test
    public void test35063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest70.test35063");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.startsWithIgnoreCase("interface java.lang.CloneableINTERFACE JAVA.LANG.CLONEABLELANG.GNALJAVA.LANGAVAJ.GNALJAVA.LANGAVAJ.GNALJAVA.LANGAVAJ.GNALJAVA.LANGAVAJ.GNALJAVA.LANGAVAJ.GNALJAVA.LANGAVAJ.GNALJAVA.LANGAVAJ.GNALJAVA.LANGAVAJ.JAVAINTERFACE JAVA.IO.SERIALIZABLEinterface java.io.Serializableinterface java.lang.CloneableINTERFACE JAVA.LANG.CLONEABLELANG.GNALJAVA.LANGAVAJ.GNALJAVA.LANGAVAJ.GNALJAVA.LANGAVAJ.GNALJAVA.LANGAVAJ.GNALJAVA.LANGAVAJ.GNALJAVA.LANGAVAJ.GNALJAVA.LANGAVAJ.GNALJAVASTRINGinterface java.lang.CloneableINTERFACE JAVA.LANG.CLONEABLELANG.GNALJAVA.LANGAVAJ.GNALJAVA.LANGAVAJ.GNALJAVA.LANGAVAJ.GNALJAVA.LANGAVAJ.GNALJAVA.LANGAVAJ.GNALJAVA.LANGAVAJ.GNALJAVA.LANGAVAJ.GNALJAVA.LANGAVAJ.JAVAINTERFACE JAVA.IO.SERIALIZABLEinterface java.io.Serializableinterface java.lang.CloneableINTERFACE JAVA.LANG.CLONEABLELANG.GNALJAVA.LANGAVAJ.GNALJAVA.LANGAVAJ.GNALJAVA.LANGAVAJ.GNALJAVA.LANGAVAJ.GNALJAVA.LANGAVAJ.GNALJAVA.LANGAVAJ.GNALJAVA.LANGAVAJ.GNALJAVA.", ".......java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java.........");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test35064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest70.test35064");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsIgnoreCase("...       444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444", "javaaaaaaaaaa");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test35065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest70.test35065");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOf("...gnal.avaaaaaaaaaavaJ", "interface java.lang.Cloneable       aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa...interface java.io.Serializable");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test35066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest70.test35066");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.defaultString("OIAVAJECAFRETNI#ELBAENOLcGNALAVAJECAFRETNI", "interface java.lang.CloneableetyBinterface java.io.Serializable");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "OIAVAJECAFRETNI#ELBAENOLcGNALAVAJECAFRETNI" + "'", str2, "OIAVAJECAFRETNI#ELBAENOLcGNALAVAJECAFRETNI");
    }

    @Test
    public void test35067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest70.test35067");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.split("arralitu.avajlitu.avaj", "aaaaaa...");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.concat((java.lang.Object[]) strArray2);
        java.lang.Class<?> wildcardClass4 = strArray2.getClass();
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "rrlituvjlituvj" + "'", str3, "rrlituvjlituvj");
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test35068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest70.test35068");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isWhitespace((java.lang.CharSequence) "TUavajgnal.avajgnal.avajgnal.avajgnal.avajgnal.avajgnal.avajgnal.avajgnal.avajgnal.avaJavajgnal.avajgnal.avajgnal.avajgnal.avajgnal.avajgnal.avajgnal.avajgnal.avajgnal.avaJavajgnal.avajgnal.avajgnal.avajgnal.avajgnal.avajgnal.avajgnal.avajgnal.avajgnal.avaJavajgnal.avajgnal.avajgnal.avajgnal.avajgnal.avajgnal.avajgnal.avajgnal.avajgnal.avaJavajgnal.avajgnal.avajgnal.avajgnal.avajgnal.avajgnal.avajgnal.avajgnal.avajgnal.avaJavajgnal.avajgnal.avajgnal.avajgnal.avajgnal.avajgnal.avajgnal.avajgnal.avajgnal.avaJavajgnal.avajgnal.avajgnal.avajgnal.avajgnal.avajgnal.avajgnal.avajgnal.avajgnal.avaJavajgnal.avajgnal.avajgnal.avajgnal.avajgnal.avajgnal.avajgnal.avajgnal.avajgnal.avaJavajgnal.avajgnal.avajgnal.avajgnal.avajgnal.avajgnal.avajgnal.avajgnal.avajgnal.a");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test35069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest70.test35069");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isEmpty((java.lang.CharSequence) "..................................................................................................................................................................................................................................................................................................................................................................................................................................................................tsilyarrgnaluavajtsilyarrgnaluavaj");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test35070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest70.test35070");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNumeric((java.lang.CharSequence) "####java.uti###############################...");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test35071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest70.test35071");
        int int3 = org.apache.commons.lang3.StringUtils.ordinalIndexOf("#######################vj.gn vj.gn vj.gn #######################", "nolCAgnalAavajiecaf", 27);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test35072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest70.test35072");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.abbreviate("oi.agagecafretnignirAAAAAAAAAAnga.lagagAAAAAAAAAAnga.lagagAAAAAAAAAAnga.lagagAAAAAAAAAAnga.lagagAAAAAAAAAAnga.lagagAAAAAAAAAAnga.lagagAAAAAAAAAAnga.lagagAAAAAAAAAAnga.lagagAAAAAAAAAAnga.lagagAAAAAAAAAAnga.lagagAAAAAAAAAAnga.lagagAAAAAAAAAAnga.lagagAAAAAAAAAAnga.lagagAAAAAAAAAAnga.lagagAAAAAAAAAAnga.lagagAAAAAAAAAAnga.lagagAAAAAAAAAAnga.lagagAAAAAAAAAAnga.lagagAAAAAAAAAAnga.lagagAAAAAAAAAAnga.lagagAAAAAAAAAAnga.lagagAAAAAAAAAAnga.lagagAAAAAAAAAAnga.lagagAAAAAAAAAAnga.lagagAAAAAAAAAAnga.lagagAAAAAAAAAAnga.lagagAAAAAAAAAAnga.lagagAAAAAAAAAAnga.lagagAAAAAAAAAAnga.lagagAAAAAAAAAAnga.lagagAAAAAAAAAAnga.lagagAAAAAAAAAAnga.lagagAAAAAAAAAAnga.lagagAAAAAAAAAAnga.lagagAAAAAAAAAAnga.lagagAAAAAAAAAAelbaenolC.gnal.agagecafretni", 54, 760);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "oi.agagecafretnignirAAAAAAAAAAnga.lagagAAAAAAAAAAnga.lagagAAAAAAAAAAnga.lagagAAAAAAAAAAnga.lagagAAAAAAAAAAnga.lagagAAAAAAAAAAnga.lagagAAAAAAAAAAnga.lagagAAAAAAAAAAnga.lagagAAAAAAAAAAnga.lagagAAAAAAAAAAnga.lagagAAAAAAAAAAnga.lagagAAAAAAAAAAnga.lagagAAAAAAAAAAnga.lagagAAAAAAAAAAnga.lagagAAAAAAAAAAnga.lagagAAAAAAAAAAnga.lagagAAAAAAAAAAnga.lagagAAAAAAAAAAnga.lagagAAAAAAAAAAnga.lagagAAAAAAAAAAnga.lagagAAAAAAAAAAnga.lagagAAAAAAAAAAnga.lagagAAAAAAAAAAnga.lagagAAAAAAAAAAnga.lagagAAAAAAAAAAnga.lagagAAAAAAAAAAnga.lagagAAAAAAAAAAnga.lagagAAAAAAAAAAnga.lagagAAAAAAAAAAnga.lagagAAAAAAAAAAnga.lagagAAAAAAAAAAnga.lagagAAAAAAAAAAnga.lagagAAAAAAAAAAnga.lagagAAAAAAAAAAnga.lagagAAAAAAAAAAnga.lagagAAAAAAAAAAelbaenolC.gnal.agagecafretni" + "'", str3, "oi.agagecafretnignirAAAAAAAAAAnga.lagagAAAAAAAAAAnga.lagagAAAAAAAAAAnga.lagagAAAAAAAAAAnga.lagagAAAAAAAAAAnga.lagagAAAAAAAAAAnga.lagagAAAAAAAAAAnga.lagagAAAAAAAAAAnga.lagagAAAAAAAAAAnga.lagagAAAAAAAAAAnga.lagagAAAAAAAAAAnga.lagagAAAAAAAAAAnga.lagagAAAAAAAAAAnga.lagagAAAAAAAAAAnga.lagagAAAAAAAAAAnga.lagagAAAAAAAAAAnga.lagagAAAAAAAAAAnga.lagagAAAAAAAAAAnga.lagagAAAAAAAAAAnga.lagagAAAAAAAAAAnga.lagagAAAAAAAAAAnga.lagagAAAAAAAAAAnga.lagagAAAAAAAAAAnga.lagagAAAAAAAAAAnga.lagagAAAAAAAAAAnga.lagagAAAAAAAAAAnga.lagagAAAAAAAAAAnga.lagagAAAAAAAAAAnga.lagagAAAAAAAAAAnga.lagagAAAAAAAAAAnga.lagagAAAAAAAAAAnga.lagagAAAAAAAAAAnga.lagagAAAAAAAAAAnga.lagagAAAAAAAAAAnga.lagagAAAAAAAAAAnga.lagagAAAAAAAAAAelbaenolC.gnal.agagecafretni");
    }

    @Test
    public void test35073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest70.test35073");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOf("VA1J", "AA..", 409);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test35074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest70.test35074");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("-1java");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.concat((java.lang.Object[]) strArray2);
        java.lang.String str5 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray2, '$');
        boolean boolean6 = org.apache.commons.lang3.StringUtils.startsWithAny("gnal.avajgnal.avajgnal.avajgnal.avajgnal.avajgnal.avajgnal.avajgnal.avajgnal.avajgnal.avajgnal.avajgnal.avajgnal.avajgnal.avajgnal.avajgnal.avajgnal.avajgnal.avajgnal.avajgnal.avajgnal.avajgnal.avajgnal.avajgnal.avajgnal.avajgnal.avajgnal.avajgnal.avagnal.avaaaaaaaaaa4444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444vaJ", strArray2);
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.getCommonPrefix(strArray2);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "-1java" + "'", str3, "-1java");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "-1java" + "'", str5, "-1java");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "-1java" + "'", str7, "-1java");
    }

    @Test
    public void test35075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest70.test35075");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOf("$$$$$$$$$$$$.$$$$$$$$$$avajssalcrrAtsiLytcejb$$$$$$$$$$$$.$$$$$$$$$$$", "", 32);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 32 + "'", int3 == 32);
    }

    @Test
    public void test35076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest70.test35076");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOfIgnoreCase("", "                             aaaaaaaaaaaaaaaaaaaaaaaaaa                    ");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test35077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest70.test35077");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOf("                           rraylist                            rraylist                            rraylist                            rray$arraylis", "4444444444444                           rrayList                            rrayList                            rrayList                            rrayclass java.lang.StringArrayLis", 929);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test35078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest70.test35078");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.center("########$#######$          ", 537, '#');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "#######################################################################################################################################################################################################################################################################$#######$          ###############################################################################################################################################################################################################################################################" + "'", str3, "#######################################################################################################################################################################################################################################################################$#######$          ###############################################################################################################################################################################################################################################################");
    }

    @Test
    public void test35079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest70.test35079");
        int int3 = org.apache.commons.lang3.StringUtils.indexOfIgnoreCase("##############################################################", "INTERFACEJAVA.LANG.CLONEABLELANG.GNALJAVA.LANGAVAJ.GNALJAVA.LANGAVAJ.GNALJAVA.LANGAVAJ.GNALJAVA.LANGAVAJ.GNALJAVA.LANGAVAJ.GNALJAVA.LANGAVAJ.GNALJAVA.LANGAVAJ.GNALJAVA.LANGAVAJ.JAVAINTERFACEJAVA.IO", 441);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test35080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest70.test35080");
        java.lang.String[] strArray4 = new java.lang.String[] { "                                   " };
        java.lang.String str5 = org.apache.commons.lang3.StringUtils.getCommonPrefix(strArray4);
        int int6 = org.apache.commons.lang3.StringUtils.indexOfDifference((java.lang.CharSequence[]) strArray4);
        int int7 = org.apache.commons.lang3.StringUtils.lastIndexOfAny("...       ", strArray4);
        java.lang.String[] strArray9 = org.apache.commons.lang3.StringUtils.stripAll(strArray4, ".");
        java.lang.String str10 = org.apache.commons.lang3.StringUtils.getCommonPrefix(strArray4);
        int int11 = org.apache.commons.lang3.StringUtils.lastIndexOfAny("A..ayL A.44444444444444444444444444", strArray4);
        java.lang.String[] strArray15 = org.apache.commons.lang3.StringUtils.split("...                                 ");
        java.lang.String[] strArray17 = org.apache.commons.lang3.StringUtils.stripAll(strArray15, "elbazilaireS.oi.avaj ecafretnignirtSelbaenolC.gnal.avaj ecafretni");
        boolean boolean18 = org.apache.commons.lang3.StringUtils.endsWithAny("GNIRT", strArray17);
        java.lang.String[] strArray21 = org.apache.commons.lang3.StringUtils.split("                                              ");
        java.lang.String[] strArray24 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("hi!", "");
        java.lang.String[] strArray26 = org.apache.commons.lang3.StringUtils.stripAll(strArray24, "$");
        java.lang.String str27 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray24);
        java.lang.String str28 = org.apache.commons.lang3.StringUtils.replaceEachRepeatedly("javal#.#agn", strArray21, strArray24);
        java.lang.String str29 = org.apache.commons.lang3.StringUtils.replaceEachRepeatedly("java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........javainterface java.io", strArray17, strArray24);
        java.lang.String str30 = org.apache.commons.lang3.StringUtils.replaceEach("...       aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", strArray4, strArray24);
        java.lang.String str32 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray24, "");
        java.lang.Class<?>[] wildcardClassArray33 = org.apache.commons.lang3.ClassUtils.toClass((java.lang.Object[]) strArray24);
        java.lang.Class<?>[] wildcardClassArray34 = org.apache.commons.lang3.ClassUtils.toClass((java.lang.Object[]) strArray24);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "                                   " + "'", str5, "                                   ");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertNotNull(strArray9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "                                   " + "'", str10, "                                   ");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertNotNull(strArray15);
        org.junit.Assert.assertNotNull(strArray17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(strArray21);
        org.junit.Assert.assertNotNull(strArray24);
        org.junit.Assert.assertNotNull(strArray26);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "hi!" + "'", str27, "hi!");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "javal#.#agn" + "'", str28, "javal#.#agn");
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........javainterface java.io" + "'", str29, "java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........javainterface java.io");
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "...       aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa" + "'", str30, "...       aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "hi!" + "'", str32, "hi!");
        org.junit.Assert.assertNotNull(wildcardClassArray33);
        org.junit.Assert.assertNotNull(wildcardClassArray34);
    }

    @Test
    public void test35081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest70.test35081");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.center("LANG", 4, "ARR... AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA... AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA... AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA... AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA... AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA... AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA... AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA... AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA... AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA..");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "LANG" + "'", str3, "LANG");
    }

    @Test
    public void test35082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest70.test35082");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAsciiPrintable((java.lang.CharSequence) "gn gnal.avajg");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test35083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest70.test35083");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.reverse("irfCo$irfioSriiz");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "ziirSoifri$oCfri" + "'", str1, "ziirSoifri$oCfri");
    }

    @Test
    public void test35084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest70.test35084");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trimToNull("LANGaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa####java.uti###############################...");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "LANGaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa####java.uti###############################..." + "'", str1, "LANGaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa####java.uti###############################...");
    }

    @Test
    public void test35085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest70.test35085");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsAny("erface java.lang.Cloneable.interface java.io.Serializable", "");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test35086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest70.test35086");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceOnce("yLis", "irfSeriaCoSeria$SeriairfioSeriaSriiz", ".AVAJ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "yLis" + "'", str3, "yLis");
    }

    @Test
    public void test35087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest70.test35087");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substring("                                                                                                                                                                                                                                                                                                                                                                                                                                                                  elbazilaire.oi.avaj ecafretn", 100);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                                                                                                                                                                                                                                                                                                                                              elbazilaire.oi.avaj ecafretn" + "'", str2, "                                                                                                                                                                                                                                                                                                                                                              elbazilaire.oi.avaj ecafretn");
    }

    @Test
    public void test35088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest70.test35088");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeEndIgnoreCase("444444444444444444444444444444444444444444444444444444444444444444444TSILYARRA.LA.LANGTSILYARRA.LA.LANGTSILYARRAJAVAAAAAAAAAAVA.LANGAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGA.LANGTSILYARRA.LA.LANGTSILYARRA.LA.LANG", "interface java.lang.CloneableAVAJGNALjavajavajavajavajavajavajavgnal                                                                interface java.io.Serializable");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "444444444444444444444444444444444444444444444444444444444444444444444TSILYARRA.LA.LANGTSILYARRA.LA.LANGTSILYARRAJAVAAAAAAAAAAVA.LANGAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGA.LANGTSILYARRA.LA.LANGTSILYARRA.LA.LANG" + "'", str2, "444444444444444444444444444444444444444444444444444444444444444444444TSILYARRA.LA.LANGTSILYARRA.LA.LANGTSILYARRAJAVAAAAAAAAAAVA.LANGAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGA.LANGTSILYARRA.LA.LANGTSILYARRA.LA.LANG");
    }

    @Test
    public void test35089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest70.test35089");
        int int3 = org.apache.commons.lang3.StringUtils.indexOf("JAVAsTRINJAVAsTRINJA...", "hi!ArrayLis", 167);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test35090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest70.test35090");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripAccents((java.lang.CharSequence) "interfacejava.lang.Cloneable#interfacejava.iointerfacejava.lang.Cloneable#interfacejava.iointerfacejava.la");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "interfacejava.lang.Cloneable#interfacejava.iointerfacejava.lang.Cloneable#interfacejava.iointerfacejava.la" + "'", str1, "interfacejava.lang.Cloneable#interfacejava.iointerfacejava.lang.Cloneable#interfacejava.iointerfacejava.la");
    }

    @Test
    public void test35091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest70.test35091");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.equalsIgnoreCase("                                                                                                                                                                                   ...AJ..........AVAJ..........AVAJ..........AVAJ..........AVAJ.......ELBAENOLc.GNAL.AVAJ ECAFRETN", "                                                                                                   ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test35092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest70.test35092");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "cLASSJAVA.LANG.cLASSjavaulangjavaulangjavaulangjavaulangjavaulangjavaulangjavaulangjavaulangjavaulangjavaulangjavaulangjavaulangjavaulangjavaulangjavaulangjavaulangjavaulangjavaulangjavaulangjavaulang", "llllllllllllllllllllllllllllllllllllllllllllllllllllllllllllllllllllllllllllllllllllllllllyaaa.");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test35093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest70.test35093");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsAny("                 ", "GNL$ $VJ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test35094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest70.test35094");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("                                                                                                                                                                                                                                                                                                                                                                                                                                JAVA.LANGAgnl.vjgnl..LANGgnl.vArrclss jv.lng.ObjectyListAr...                                                                                                                                                                                                                                                                                                                                                         ", "][ssalC                         ", 200);
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void test35095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest70.test35095");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.mid("CLASSSLITUGNIRTSSLITUGNIRTSSLITUGNIRTSSLITUGNIRTSSLITUGNIRTSSLITUGNIRTinterfacegaga.lang.CloneableAAAAAAAAAAgagal.agnAAAAAAAAAAgagal.agnAAAAAAAAAAgagal.agnAAAAAAAAAAgagal.agnAAAAAAAAAAgagal.agnAAAAAAAAAAgagal.agnAAAAAAAAAAgagal.agnAAAAAAAAAAgagal.agnAAAAAAAAAAgagal.agnAAAAAAAAAAgagal.agnAAAAAAAAAAgagal.agnAAAAAAAAAAgagal.agnAAAAAAAAAAgagal.agnAAAAAAAAAAgagal.agnAAAAAAAAAAgagal.agnAAAAAAAAAAgagal.agnAAAAAAAAAAgagal.agnAAAAAAAAAAgagal.agnAAAAAAAAAAgagal.agnAAAAAAAAAAgagal.agnAAAAAAAAAAgagal.agnAAAAAAAAAAgagal.agnAAAAAAAAAAgagal.agnAAAAAAAAAAgagal.agnAAAAAAAAAAgagal.agnAAAAAAAAAAgagal.agnAAAAAAAAAAgagal.agnAAAAAAAAAAgagal.agnAAAAAAAAAAgagal.agnAAAAAAAAAAgagal.agnAAAAAAAAAAgagal.agnAAAAAAAAAAgagal.agnAAAAAAAAAAgagal.agnAAAAAAAAAAgagal.agnAAAAAAAAAAgagal.agnAAAAAAAAAAringinterfacegaga", 888, 523);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test35096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest70.test35096");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeStartIgnoreCase("... assJAVA.LANGa Cl", "RJAVAlLANGRING");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "... assJAVA.LANGa Cl" + "'", str2, "... assJAVA.LANGa Cl");
    }

    @Test
    public void test35097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest70.test35097");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.substringsBetween("gnirtS.gnal.avaj ssalc", "AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA", "CEAJ V AL");
        org.junit.Assert.assertNull(strArray3);
    }

    @Test
    public void test35098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest70.test35098");
        java.lang.ClassLoader classLoader0 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass2 = org.apache.commons.lang3.ClassUtils.getClass(classLoader0, "             Chrcter             utilStri");
            org.junit.Assert.fail("Expected exception of type java.lang.ClassNotFoundException; message: ChrcterutilStri");
        } catch (java.lang.ClassNotFoundException e) {
            // Expected exception.
        }
    }

    @Test
    public void test35099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest70.test35099");
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
        java.lang.Class<?>[] wildcardClassArray22 = org.apache.commons.lang3.ClassUtils.wrappersToPrimitives(wildcardClassArray20);
        java.lang.Class<?>[] wildcardClassArray23 = org.apache.commons.lang3.ClassUtils.primitivesToWrappers(wildcardClassArray22);
        java.lang.Class<?> wildcardClass24 = null;
        java.lang.Class[] classArray26 = new java.lang.Class[1];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray27 = (java.lang.Class<?>[]) classArray26;
        wildcardClassArray27[0] = wildcardClass24;
        java.lang.Class<?>[] wildcardClassArray30 = org.apache.commons.lang3.ClassUtils.primitivesToWrappers(wildcardClassArray27);
        java.lang.Class<?>[] wildcardClassArray31 = org.apache.commons.lang3.ClassUtils.primitivesToWrappers(wildcardClassArray27);
        java.lang.String[] strArray34 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("hi!", "");
        java.lang.String[] strArray36 = org.apache.commons.lang3.StringUtils.stripAll(strArray34, "$");
        java.lang.Class<?>[] wildcardClassArray37 = org.apache.commons.lang3.ClassUtils.toClass((java.lang.Object[]) strArray34);
        java.lang.Class<?>[] wildcardClassArray38 = org.apache.commons.lang3.ClassUtils.toClass((java.lang.Object[]) wildcardClassArray37);
        java.lang.Class<?>[] wildcardClassArray39 = org.apache.commons.lang3.ClassUtils.wrappersToPrimitives(wildcardClassArray38);
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
        java.lang.String str71 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) wildcardClassArray61, 'a');
        boolean boolean73 = org.apache.commons.lang3.ClassUtils.isAssignable(wildcardClassArray39, wildcardClassArray61, true);
        java.lang.Class<?>[] wildcardClassArray74 = org.apache.commons.lang3.ClassUtils.toClass((java.lang.Object[]) wildcardClassArray61);
        boolean boolean75 = org.apache.commons.lang3.ClassUtils.isAssignable(wildcardClassArray31, wildcardClassArray74);
        java.lang.Class<?>[] wildcardClassArray76 = org.apache.commons.lang3.ClassUtils.wrappersToPrimitives(wildcardClassArray31);
        java.lang.Class<?>[] wildcardClassArray77 = org.apache.commons.lang3.ClassUtils.wrappersToPrimitives(wildcardClassArray76);
        boolean boolean79 = org.apache.commons.lang3.ClassUtils.isAssignable(wildcardClassArray22, wildcardClassArray77, false);
        java.lang.String str80 = org.apache.commons.lang3.StringUtils.concat((java.lang.Object[]) wildcardClassArray77);
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
        org.junit.Assert.assertNotNull(classArray26);
        org.junit.Assert.assertNotNull(wildcardClassArray27);
        org.junit.Assert.assertNotNull(wildcardClassArray30);
        org.junit.Assert.assertNotNull(wildcardClassArray31);
        org.junit.Assert.assertNotNull(strArray34);
        org.junit.Assert.assertNotNull(strArray36);
        org.junit.Assert.assertNotNull(wildcardClassArray37);
        org.junit.Assert.assertNotNull(wildcardClassArray38);
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
        org.junit.Assert.assertEquals("'" + str71 + "' != '" + "" + "'", str71, "");
        org.junit.Assert.assertTrue("'" + boolean73 + "' != '" + false + "'", boolean73 == false);
        org.junit.Assert.assertNotNull(wildcardClassArray74);
        org.junit.Assert.assertTrue("'" + boolean75 + "' != '" + false + "'", boolean75 == false);
        org.junit.Assert.assertNotNull(wildcardClassArray76);
        org.junit.Assert.assertNotNull(wildcardClassArray77);
        org.junit.Assert.assertTrue("'" + boolean79 + "' != '" + false + "'", boolean79 == false);
        org.junit.Assert.assertEquals("'" + str80 + "' != '" + "" + "'", str80, "");
    }

    @Test
    public void test35100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest70.test35100");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsIgnoreCase("rgnaavajaaaaaaaaaaaaaaaaaaaaaaaaaa", "AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test35101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest70.test35101");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.abbreviate("slitUgnirtSslitUgnirtSslitUgnirtSslitUgnirtSslitUgnirtSslitUgnirtSslitUgnirtSslitUgnirtSslitUgnirtSslitUgnirt                                ", 315);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "slitUgnirtSslitUgnirtSslitUgnirtSslitUgnirtSslitUgnirtSslitUgnirtSslitUgnirtSslitUgnirtSslitUgnirtSslitUgnirt                                " + "'", str2, "slitUgnirtSslitUgnirtSslitUgnirtSslitUgnirtSslitUgnirtSslitUgnirtSslitUgnirtSslitUgnirtSslitUgnirtSslitUgnirt                                ");
    }

    @Test
    public void test35102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest70.test35102");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens(".");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.stripAll(strArray1, "tsiLyarrA.La.lang");
        java.lang.String str5 = org.apache.commons.lang3.ClassUtils.getPackageName((java.lang.Object) strArray1, "#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#lass java#lang#String");
        int int6 = org.apache.commons.lang3.StringUtils.indexOfDifference((java.lang.CharSequence[]) strArray1);
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray1, "ava..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java.......");
        java.lang.String str9 = org.apache.commons.lang3.StringUtils.getCommonPrefix(strArray1);
        java.lang.String str11 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray1, "interface#java.lang.Cloneable...........         interface#java.lang.Cloneable............");
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "java.lang" + "'", str5, "java.lang");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "." + "'", str8, ".");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "." + "'", str9, ".");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "." + "'", str11, ".");
    }

    @Test
    public void test35103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest70.test35103");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.defaultString("444444444444INTERFACE JAVA.LANG.cLONEABLEsTRINGINTERFACE JAVA.IO.sERIALIZABLE444444444444444444444444444444444444444444444444444444444444444444444444444444444litu.avajlit", "..........a       ..#############################################");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "444444444444INTERFACE JAVA.LANG.cLONEABLEsTRINGINTERFACE JAVA.IO.sERIALIZABLE444444444444444444444444444444444444444444444444444444444444444444444444444444444litu.avajlit" + "'", str2, "444444444444INTERFACE JAVA.LANG.cLONEABLEsTRINGINTERFACE JAVA.IO.sERIALIZABLE444444444444444444444444444444444444444444444444444444444444444444444444444444444litu.avajlit");
    }

    @Test
    public void test35104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest70.test35104");
        java.lang.String[] strArray1 = null;
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("ArrGNALyList", "j4v444$444444444");
        java.lang.String str5 = org.apache.commons.lang3.StringUtils.replaceEachRepeatedly("javalitu.", strArray1, strArray4);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str9 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray4, "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa$$$$$$$$$$$$$$$$$$$$$$$$$$$$$AAAaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", 67, 666);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "javalitu." + "'", str5, "javalitu.");
    }

    @Test
    public void test35105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest70.test35105");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNumericSpace((java.lang.CharSequence) "...4444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444...");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test35106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest70.test35106");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("javal.agn", "AAAAAAAAAAAAAAAAAAAjavaulangAAAAAAAAAAAAAAAAAAA", 29);
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray3);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "javal.agn" + "'", str4, "javal.agn");
    }

    @Test
    public void test35107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest70.test35107");
        java.lang.String str1 = org.apache.commons.lang3.ClassUtils.getShortCanonicalName("                   GNAL.AVAJ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "AVAJ" + "'", str1, "AVAJ");
    }

    @Test
    public void test35108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest70.test35108");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceOnce("javajavajavajavajavajavajavajavajavajavajavajavajavajavajavajavajavajavajavajavajavajavajavajavajavajavajavajavajavajavajavajavajavajav", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "java.io.Serializable java.lang.CloneableStringinterface interface");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "javajavajavajavajavajavajavajavajavajavajavajavajavajavajavajavajavajavajavajavajavajavajavajavajavajavajavajavajavajavajavajavajavajav" + "'", str3, "javajavajavajavajavajavajavajavajavajavajavajavajavajavajavajavajavajavajavajavajavajavajavajavajavajavajavajavajavajavajavajavajavajav");
    }

    @Test
    public void test35109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest70.test35109");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.remove("Java.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava...", 'a');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Jv.lngjv.lngjv.lngjv.lngjv.lngjv.lngjv.lngjv.lngjv.lngjv.lngjv.lngjv.lngjv.lngjv.lngjv.lngjv.lngjv..." + "'", str2, "Jv.lngjv.lngjv.lngjv.lngjv.lngjv.lngjv.lngjv.lngjv.lngjv.lngjv.lngjv.lngjv.lngjv.lngjv.lngjv.lngjv...");
    }

    @Test
    public void test35110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest70.test35110");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.split("interface#java.lang.Cloneable....................................................................#######################JAVAULANGinterface#java.io.Serializable", '.');
        int int4 = org.apache.commons.lang3.StringUtils.lastIndexOfAny("OBJECT", strArray3);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
    }

    @Test
    public void test35111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest70.test35111");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphaSpace((java.lang.CharSequence) "Llitu...O.gn$l.$v$j ss$lcr4444444444444444444444444444444444444444444444444444444444444444444444444444444...O.                                                                                                                                                                                                                                                                                                                                                                                                                                              ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test35112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest70.test35112");
        char[] charArray11 = new char[] { ' ', ' ', '#', 'a', '4', 'a' };
        int int12 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "", charArray11);
        boolean boolean13 = org.apache.commons.lang3.StringUtils.containsAny("......", charArray11);
        int int14 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "Object", charArray11);
        boolean boolean15 = org.apache.commons.lang3.StringUtils.containsAny("Java.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.lang", charArray11);
        int int16 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "Avaj.gnalaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa       cHARACTERcHARACTERcHARACTERcHARACTERcHARACTERcHARACTERcHARACTERcHARACTERcHARACTERcHARACTERcHARACTERcHARACTERcHARACTERcHARACTERcHARACTERcHARACTERcHARACTERcHARACTERcHARACTERcHARACTERcHARACTERcHARACTERcHARACTERcHARACTERcHARACTERcHARACTERcHARACTERcHARACTERcHARACTERcHARACTERcHARACTERcHARACTERcHARACTERcHARACTERcHARACTERcHARACTERcHARACTERcHARACTERcHARACTERcHARACTERcHARACTERcHARACTERcHARACTERcHARACTERcHARACTERcHARACTERcHARACTERcHARACTERcHARACTERcHARACTERcHARACTERcHARACTERcHARACTERcHARACTERcHARACTERcHARACTERcHARACTERcHARACTERcHARACTERcHARACTERcHARACTERcHARACTERcHARA", charArray11);
        java.lang.String str18 = org.apache.commons.lang3.ClassUtils.getShortClassName((java.lang.Object) int16, "ih");
        org.junit.Assert.assertNotNull(charArray11);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray11), "  #a4a");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray11), "  #a4a");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray11), "[ ,  , #, a, 4, a]");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Integer" + "'", str18, "Integer");
    }

    @Test
    public void test35113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest70.test35113");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceChars("ra                                         sTRINGuTILSsTRINGuTILSsTRINGuTILSsTRINGuTILSsTRINGuTILSsTRINGuTILSsTRINGuTILSsTRINGuTILSsTRINGuTILSsTRINGuTILSra                                         sTRINGuTILSsTRINGuTILSsTRINGuTILSsTRINGuTILSsTRINGuTILSsTRINGuTILSsTRINGuTILSsTRINGuTIlitulitulitulitulitul####litulitulitulitulitul                               interface#java.lang.Cloneable....................................................................##################...aaaaaaainterface#java.lang.Cloneable....................................................................##################ra                                         sTRINGuTILSsTRINGuTILSsTRINGuTILSsTRINGuTILSsTRINGuTILSsTRINGuTILSsTRINGuTILSsTRINGuTILSsTRINGuTILSsTRINGuTILSra                                         sTRINGuTILSsTRINGuTILSsTRINGuTILSsTRINGuTILSsTRINGuTILSsTRINGuTILSsTRINGuTILSsTRINGuTI", '4', '4');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "ra                                         sTRINGuTILSsTRINGuTILSsTRINGuTILSsTRINGuTILSsTRINGuTILSsTRINGuTILSsTRINGuTILSsTRINGuTILSsTRINGuTILSsTRINGuTILSra                                         sTRINGuTILSsTRINGuTILSsTRINGuTILSsTRINGuTILSsTRINGuTILSsTRINGuTILSsTRINGuTILSsTRINGuTIlitulitulitulitulitul####litulitulitulitulitul                               interface#java.lang.Cloneable....................................................................##################...aaaaaaainterface#java.lang.Cloneable....................................................................##################ra                                         sTRINGuTILSsTRINGuTILSsTRINGuTILSsTRINGuTILSsTRINGuTILSsTRINGuTILSsTRINGuTILSsTRINGuTILSsTRINGuTILSsTRINGuTILSra                                         sTRINGuTILSsTRINGuTILSsTRINGuTILSsTRINGuTILSsTRINGuTILSsTRINGuTILSsTRINGuTILSsTRINGuTI" + "'", str3, "ra                                         sTRINGuTILSsTRINGuTILSsTRINGuTILSsTRINGuTILSsTRINGuTILSsTRINGuTILSsTRINGuTILSsTRINGuTILSsTRINGuTILSsTRINGuTILSra                                         sTRINGuTILSsTRINGuTILSsTRINGuTILSsTRINGuTILSsTRINGuTILSsTRINGuTILSsTRINGuTILSsTRINGuTIlitulitulitulitulitul####litulitulitulitulitul                               interface#java.lang.Cloneable....................................................................##################...aaaaaaainterface#java.lang.Cloneable....................................................................##################ra                                         sTRINGuTILSsTRINGuTILSsTRINGuTILSsTRINGuTILSsTRINGuTILSsTRINGuTILSsTRINGuTILSsTRINGuTILSsTRINGuTILSsTRINGuTILSra                                         sTRINGuTILSsTRINGuTILSsTRINGuTILSsTRINGuTILSsTRINGuTILSsTRINGuTILSsTRINGuTILSsTRINGuTI");
    }

    @Test
    public void test35114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest70.test35114");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substring("", 110);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test35115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest70.test35115");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBetween("       .##javal###########################javal###########################javal###########################", "CloneableInea");
        org.junit.Assert.assertNull(str2);
    }

    @Test
    public void test35116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest70.test35116");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("interface java.lang.Cloneable.......java.......Objectava..........javainterface java.io.Serializable", "gn", 832);
        int int4 = org.apache.commons.lang3.StringUtils.indexOfDifference((java.lang.CharSequence[]) strArray3);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
    }

    @Test
    public void test35117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest70.test35117");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.chop("                                                                                                                                                                                                                                                                                                                                                          javal#.#agn       aaaaaaaaaaaaaaaaaaaaaaaaa                                                                                                                                                                                                                                                                                                                                                          ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "                                                                                                                                                                                                                                                                                                                                                          javal#.#agn       aaaaaaaaaaaaaaaaaaaaaaaaa                                                                                                                                                                                                                                                                                                                                                         " + "'", str1, "                                                                                                                                                                                                                                                                                                                                                          javal#.#agn       aaaaaaaaaaaaaaaaaaaaaaaaa                                                                                                                                                                                                                                                                                                                                                         ");
    }

    @Test
    public void test35118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest70.test35118");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.startsWithIgnoreCase("444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444LITU.AVAJLITU", "JAVAULANG");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test35119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest70.test35119");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isBlank((java.lang.CharSequence) "face java.lang.CloneableStringinterface java.io");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test35120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest70.test35120");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.substring("LANG.JAVATSILYARRATSILYARRATSILYARRA", 305, 321);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test35121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest70.test35121");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.chomp("NTERFACEJAVA.LANG.cLONEABLE.......JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVAINTERFACEJAVA", "StringUtils");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "NTERFACEJAVA.LANG.cLONEABLE.......JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVAINTERFACEJAVA" + "'", str2, "NTERFACEJAVA.LANG.cLONEABLE.......JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVAINTERFACEJAVA");
    }

    @Test
    public void test35122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest70.test35122");
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
        java.lang.String str35 = org.apache.commons.lang3.StringUtils.concat((java.lang.Object[]) wildcardClassArray26);
        java.lang.Class[] classArray37 = new java.lang.Class[0];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray38 = (java.lang.Class<?>[]) classArray37;
        java.lang.Class<?>[] wildcardClassArray39 = org.apache.commons.lang3.ClassUtils.primitivesToWrappers(wildcardClassArray38);
        boolean boolean40 = org.apache.commons.lang3.ClassUtils.isAssignable(wildcardClassArray26, wildcardClassArray39);
        java.lang.String str42 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) wildcardClassArray26, '#');
        boolean boolean44 = org.apache.commons.lang3.ClassUtils.isAssignable(wildcardClassArray4, wildcardClassArray26, true);
        java.lang.String str48 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) wildcardClassArray4, "NTERFACE JAVA.LANG.cLONEABLE.......JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVAINTERFACE JAVA.IO.sERIALIZABLE", 168, 16);
        java.lang.Class<?>[] wildcardClassArray49 = org.apache.commons.lang3.ClassUtils.primitivesToWrappers(wildcardClassArray4);
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
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "" + "'", str35, "");
        org.junit.Assert.assertNotNull(classArray37);
        org.junit.Assert.assertNotNull(wildcardClassArray38);
        org.junit.Assert.assertNotNull(wildcardClassArray39);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "" + "'", str42, "");
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertEquals("'" + str48 + "' != '" + "" + "'", str48, "");
        org.junit.Assert.assertNotNull(wildcardClassArray49);
    }

    @Test
    public void test35123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest70.test35123");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceChars("GNAL.AVAJGNAL..langGNAL.AVAJGNALLituLlituLlitu444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444", 'a', 'a');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "GNAL.AVAJGNAL..langGNAL.AVAJGNALLituLlituLlitu444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444" + "'", str3, "GNAL.AVAJGNAL..langGNAL.AVAJGNALLituLlituLlitu444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444");
    }

    @Test
    public void test35124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest70.test35124");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trim("$$$$$$$$$$$$$$$$$$$$$$$$$$$$$aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa.hi!arraylistarraylistarraylisgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnal$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                               ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "$$$$$$$$$$$$$$$$$$$$$$$$$$$$$aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa.hi!arraylistarraylistarraylisgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnal$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$" + "'", str1, "$$$$$$$$$$$$$$$$$$$$$$$$$$$$$aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa.hi!arraylistarraylistarraylisgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnal$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$");
    }

    @Test
    public void test35125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest70.test35125");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.mid("aaaaaaaa#AGNAAAAAAAAGNALaaaaaaaa                                                                                                                                                                                  ", 850, (int) ' ');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test35126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest70.test35126");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.leftPad("NG.CLASSjava.langAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAulangGNAL.AVAJLANG.CLASSjava.langAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAulangGNAL.AVAJLANG.CLASSjava.langAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAulangGNAL.AVAJLANG.CLASSjava.langAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAulangGNAL.AVAJLANG.CLASSjava.langAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAulangGNAL.AVAJLANG.CLASSjava.langAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAulangGNAL.AVAJLANG.GNALELBAENOLC.GNAL.AVAJ ECAF", 0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "NG.CLASSjava.langAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAulangGNAL.AVAJLANG.CLASSjava.langAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAulangGNAL.AVAJLANG.CLASSjava.langAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAulangGNAL.AVAJLANG.CLASSjava.langAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAulangGNAL.AVAJLANG.CLASSjava.langAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAulangGNAL.AVAJLANG.CLASSjava.langAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAulangGNAL.AVAJLANG.GNALELBAENOLC.GNAL.AVAJ ECAF" + "'", str2, "NG.CLASSjava.langAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAulangGNAL.AVAJLANG.CLASSjava.langAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAulangGNAL.AVAJLANG.CLASSjava.langAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAulangGNAL.AVAJLANG.CLASSjava.langAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAulangGNAL.AVAJLANG.CLASSjava.langAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAulangGNAL.AVAJLANG.CLASSjava.langAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAulangGNAL.AVAJLANG.GNALELBAENOLC.GNAL.AVAJ ECAF");
    }

    @Test
    public void test35127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest70.test35127");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.containsWhitespace("class [Ljava.lang.Class;");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test35128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest70.test35128");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeEndIgnoreCase("slitUgnirtSslitUgnirtSslitUgnirtSslitUgnirtSslitUgnirtSslitUgnirtSslitUgnirtSslitUgnirtSslitUgnirtSslitUgnirtslitUgnirtSslitUgnirtSslitUgnirtSslitUgnirtSslitUgnirtSslitUgnirtSslitUgnirtSslitUgnirtSslitUgnirtSslitUgnirtslitUgnirtSslitUgnirtSslitUgnirtSslitUgnirtSslitUgnirtSslitUgnirtSslgnalslitUgnirtSslitUgnirtSslitUgnirtSslitUgnirtSslitUgnirtSslitUgnirtSslitUgnirtSslitUgnirtSslitUgnirtSslitUgnirtslitUgnirtSslitUgnirtSslitUgnirtSslitUgnirtSslitUgnirtSslitUgnirtSslitUgnirtSslitUgnirtSslitUgnirtSslitUgnirtslitUgnirtSslitUgnirtSslitUgnirtSslitUgnirtSslitUgnirtSslitUgnirtSsl", "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "slitUgnirtSslitUgnirtSslitUgnirtSslitUgnirtSslitUgnirtSslitUgnirtSslitUgnirtSslitUgnirtSslitUgnirtSslitUgnirtslitUgnirtSslitUgnirtSslitUgnirtSslitUgnirtSslitUgnirtSslitUgnirtSslitUgnirtSslitUgnirtSslitUgnirtSslitUgnirtslitUgnirtSslitUgnirtSslitUgnirtSslitUgnirtSslitUgnirtSslitUgnirtSslgnalslitUgnirtSslitUgnirtSslitUgnirtSslitUgnirtSslitUgnirtSslitUgnirtSslitUgnirtSslitUgnirtSslitUgnirtSslitUgnirtslitUgnirtSslitUgnirtSslitUgnirtSslitUgnirtSslitUgnirtSslitUgnirtSslitUgnirtSslitUgnirtSslitUgnirtSslitUgnirtslitUgnirtSslitUgnirtSslitUgnirtSslitUgnirtSslitUgnirtSslitUgnirtSsl" + "'", str2, "slitUgnirtSslitUgnirtSslitUgnirtSslitUgnirtSslitUgnirtSslitUgnirtSslitUgnirtSslitUgnirtSslitUgnirtSslitUgnirtslitUgnirtSslitUgnirtSslitUgnirtSslitUgnirtSslitUgnirtSslitUgnirtSslitUgnirtSslitUgnirtSslitUgnirtSslitUgnirtslitUgnirtSslitUgnirtSslitUgnirtSslitUgnirtSslitUgnirtSslitUgnirtSslgnalslitUgnirtSslitUgnirtSslitUgnirtSslitUgnirtSslitUgnirtSslitUgnirtSslitUgnirtSslitUgnirtSslitUgnirtSslitUgnirtslitUgnirtSslitUgnirtSslitUgnirtSslitUgnirtSslitUgnirtSslitUgnirtSslitUgnirtSslitUgnirtSslitUgnirtSslitUgnirtslitUgnirtSslitUgnirtSslitUgnirtSslitUgnirtSslitUgnirtSslitUgnirtSsl");
    }

    @Test
    public void test35129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest70.test35129");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeStartIgnoreCase("javau", "TU");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "javau" + "'", str2, "javau");
    }

    @Test
    public void test35130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest70.test35130");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitByCharacterType("javaaaaaaaaaava.lang");
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test35131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest70.test35131");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("#######################vj.gnlvj.gnlvj.gnl#######################", "       aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa...");
        int int4 = org.apache.commons.lang3.StringUtils.indexOfDifference((java.lang.CharSequence[]) strArray3);
        boolean boolean5 = org.apache.commons.lang3.StringUtils.startsWithAny("aaaaaaaaa", strArray3);
        java.lang.Class<?> wildcardClass6 = strArray3.getClass();
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test35132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest70.test35132");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.normalizeSpace("ARRYLIST  $         $         $         $         $         $         $         $         $         $         $         $ ...");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "ARRYLIST $ $ $ $ $ $ $ $ $ $ $ $ ..." + "'", str1, "ARRYLIST $ $ $ $ $ $ $ $ $ $ $ $ ...");
    }

    @Test
    public void test35133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest70.test35133");
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
        java.lang.String[] strArray32 = new java.lang.String[] { "                                   " };
        java.lang.String str33 = org.apache.commons.lang3.StringUtils.getCommonPrefix(strArray32);
        java.lang.Class<?>[] wildcardClassArray34 = org.apache.commons.lang3.ClassUtils.toClass((java.lang.Object[]) strArray32);
        java.lang.String[] strArray37 = new java.lang.String[] { "                                   " };
        java.lang.String str38 = org.apache.commons.lang3.StringUtils.getCommonPrefix(strArray37);
        int int39 = org.apache.commons.lang3.StringUtils.indexOfDifference((java.lang.CharSequence[]) strArray37);
        int int40 = org.apache.commons.lang3.StringUtils.lastIndexOfAny("...       ", strArray37);
        java.lang.String str41 = org.apache.commons.lang3.StringUtils.replaceEach("...       AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA", strArray32, strArray37);
        java.lang.Class<?>[] wildcardClassArray42 = org.apache.commons.lang3.ClassUtils.toClass((java.lang.Object[]) strArray32);
        java.lang.String str43 = org.apache.commons.lang3.StringUtils.concat((java.lang.Object[]) wildcardClassArray42);
        java.lang.String[] strArray46 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("hi!", "");
        java.lang.String[] strArray48 = org.apache.commons.lang3.StringUtils.stripAll(strArray46, "$");
        java.lang.Class<?>[] wildcardClassArray49 = org.apache.commons.lang3.ClassUtils.toClass((java.lang.Object[]) strArray46);
        boolean boolean50 = org.apache.commons.lang3.ClassUtils.isAssignable(wildcardClassArray42, wildcardClassArray49);
        java.lang.String[] strArray53 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("hi!", "");
        java.lang.String[] strArray55 = org.apache.commons.lang3.StringUtils.stripAll(strArray53, "$");
        java.lang.Class<?>[] wildcardClassArray56 = org.apache.commons.lang3.ClassUtils.toClass((java.lang.Object[]) strArray53);
        java.lang.Class<?> wildcardClass57 = null;
        java.lang.Class[] classArray59 = new java.lang.Class[1];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray60 = (java.lang.Class<?>[]) classArray59;
        wildcardClassArray60[0] = wildcardClass57;
        java.lang.Class<?>[] wildcardClassArray63 = org.apache.commons.lang3.ClassUtils.primitivesToWrappers(wildcardClassArray60);
        java.lang.String[] strArray65 = new java.lang.String[] { "                                   " };
        java.lang.String str66 = org.apache.commons.lang3.StringUtils.getCommonPrefix(strArray65);
        java.lang.Class<?>[] wildcardClassArray67 = org.apache.commons.lang3.ClassUtils.toClass((java.lang.Object[]) strArray65);
        java.lang.Class<?> wildcardClass68 = null;
        java.lang.Class[] classArray70 = new java.lang.Class[1];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray71 = (java.lang.Class<?>[]) classArray70;
        wildcardClassArray71[0] = wildcardClass68;
        java.lang.Class<?>[] wildcardClassArray74 = org.apache.commons.lang3.ClassUtils.primitivesToWrappers(wildcardClassArray71);
        boolean boolean75 = org.apache.commons.lang3.ClassUtils.isAssignable(wildcardClassArray67, wildcardClassArray71);
        boolean boolean77 = org.apache.commons.lang3.ClassUtils.isAssignable(wildcardClassArray60, wildcardClassArray71, true);
        boolean boolean79 = org.apache.commons.lang3.ClassUtils.isAssignable(wildcardClassArray56, wildcardClassArray71, false);
        java.lang.Class<?>[] wildcardClassArray80 = org.apache.commons.lang3.ClassUtils.primitivesToWrappers(wildcardClassArray56);
        boolean boolean82 = org.apache.commons.lang3.ClassUtils.isAssignable(wildcardClassArray49, wildcardClassArray80, false);
        boolean boolean83 = org.apache.commons.lang3.ClassUtils.isAssignable(wildcardClassArray29, wildcardClassArray80);
        java.lang.Class<?>[] wildcardClassArray84 = org.apache.commons.lang3.ClassUtils.primitivesToWrappers(wildcardClassArray29);
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
        org.junit.Assert.assertNotNull(strArray32);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "                                   " + "'", str33, "                                   ");
        org.junit.Assert.assertNotNull(wildcardClassArray34);
        org.junit.Assert.assertNotNull(strArray37);
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "                                   " + "'", str38, "                                   ");
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + (-1) + "'", int39 == (-1));
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + (-1) + "'", int40 == (-1));
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "...       AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA" + "'", str41, "...       AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA");
        org.junit.Assert.assertNotNull(wildcardClassArray42);
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "class java.lang.String" + "'", str43, "class java.lang.String");
        org.junit.Assert.assertNotNull(strArray46);
        org.junit.Assert.assertNotNull(strArray48);
        org.junit.Assert.assertNotNull(wildcardClassArray49);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + true + "'", boolean50 == true);
        org.junit.Assert.assertNotNull(strArray53);
        org.junit.Assert.assertNotNull(strArray55);
        org.junit.Assert.assertNotNull(wildcardClassArray56);
        org.junit.Assert.assertNotNull(classArray59);
        org.junit.Assert.assertNotNull(wildcardClassArray60);
        org.junit.Assert.assertNotNull(wildcardClassArray63);
        org.junit.Assert.assertNotNull(strArray65);
        org.junit.Assert.assertEquals("'" + str66 + "' != '" + "                                   " + "'", str66, "                                   ");
        org.junit.Assert.assertNotNull(wildcardClassArray67);
        org.junit.Assert.assertNotNull(classArray70);
        org.junit.Assert.assertNotNull(wildcardClassArray71);
        org.junit.Assert.assertNotNull(wildcardClassArray74);
        org.junit.Assert.assertTrue("'" + boolean75 + "' != '" + false + "'", boolean75 == false);
        org.junit.Assert.assertTrue("'" + boolean77 + "' != '" + false + "'", boolean77 == false);
        org.junit.Assert.assertTrue("'" + boolean79 + "' != '" + false + "'", boolean79 == false);
        org.junit.Assert.assertNotNull(wildcardClassArray80);
        org.junit.Assert.assertTrue("'" + boolean82 + "' != '" + true + "'", boolean82 == true);
        org.junit.Assert.assertTrue("'" + boolean83 + "' != '" + true + "'", boolean83 == true);
        org.junit.Assert.assertNotNull(wildcardClassArray84);
    }

    @Test
    public void test35134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest70.test35134");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.equalsIgnoreCase("javaaaaaaaaaava.langava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjav", "hinterface java.lang.Cloneable4interface java.io.Serializabl....1AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA...1AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA...1AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA...1AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA...1AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA...1AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA...1AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA...1AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA...1AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA...1AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test35135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest70.test35135");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceChars("", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaai elbaenolCAgnalAavajiecafretniTRINGi elbaenolCAgnalAavajiecaf", "class [Ljava.lang.Class;4class [Ljava.lang.Class;4class [Ljava.lang.Class;4class [Ljava.lang.Class;");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test35136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest70.test35136");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "ssal..............................................rrayList..............................................C", "sERIA");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test35137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest70.test35137");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.chomp("                                                                                                                                                                                                                                                                                                                                                                                                ...VA.LANGAVAJ.GNALJAVA.LANGAVAJ.GNALJAVA.LANGAVAJ.GNALJAVA.LANGAVAJ.GNALJAVA.LANGAVAJ.GNALJAVA.LANGgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalg", "ra                                         sTRINGuTILSsTRINGuTILSsTRINGuTILSsTRINGuTILSsTRINGuTILSsTRINGuTILSsTRINGuTILSsTRINGuTILSsTRINGuTILSsTRINGuTILS");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                                                                                                                                                                                                                                                                                                                                                                                ...VA.LANGAVAJ.GNALJAVA.LANGAVAJ.GNALJAVA.LANGAVAJ.GNALJAVA.LANGAVAJ.GNALJAVA.LANGAVAJ.GNALJAVA.LANGgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalg" + "'", str2, "                                                                                                                                                                                                                                                                                                                                                                                                ...VA.LANGAVAJ.GNALJAVA.LANGAVAJ.GNALJAVA.LANGAVAJ.GNALJAVA.LANGAVAJ.GNALJAVA.LANGAVAJ.GNALJAVA.LANGgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalg");
    }

    @Test
    public void test35138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest70.test35138");
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.overlay("                                                                                                                                                                                                                                                                                                                           ", "cLONEABLE4I", 248, 687);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "                                                                                                                                                                                                                                                        cLONEABLE4I" + "'", str4, "                                                                                                                                                                                                                                                        cLONEABLE4I");
    }

    @Test
    public void test35139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest70.test35139");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass2 = org.apache.commons.lang3.ClassUtils.getClass("class java.lang.Class                       JAVAULANG                       JAVAULANG                       JAVAULANG                       JAVAULANG                       JAVAULANG                       JAVAULANG                       JAVAULANG                       JAVAULANG                       JAVAULANG                       JAVAULANG                       JAVAULANG                       JAVAULANG                       JAVAULANG                       JAVAULANG                       JAVAULANG                       JAVAULANG                       JAVAULANG                       JAVAULANG                       JAVAULANG                       JAVAULANG        ", true);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassNotFoundException; message: classjava.lang.ClassJAVAULANGJAVAULANGJAVAULANGJAVAULANGJAVAULANGJAVAULANGJAVAULANGJAVAULANGJAVAULANGJAVAULANGJAVAULANGJAVAULANGJAVAULANGJAVAULANGJAVAULANGJAVAULANGJAVAULANGJAVAULANGJAVAULANGJAVAULANG");
        } catch (java.lang.ClassNotFoundException e) {
            // Expected exception.
        }
    }

    @Test
    public void test35140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest70.test35140");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.upperCase("h!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ihLITU.AVAJ                                                                                                                                                                                                                                                                                                                                                       ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "H!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IHLITU.AVAJ                                                                                                                                                                                                                                                                                                                                                       " + "'", str1, "H!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IHLITU.AVAJ                                                                                                                                                                                                                                                                                                                                                       ");
    }

    @Test
    public void test35141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest70.test35141");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.leftPad("-1j#v#.utilString-1j#v#.utilString", 275, "                                                                                                                                     $                                                                                                                                             ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "                                                                                                                                     $                                                                                                           -1j#v#.utilString-1j#v#.utilString" + "'", str3, "                                                                                                                                     $                                                                                                           -1j#v#.utilString-1j#v#.utilString");
    }

    @Test
    public void test35142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest70.test35142");
        int int2 = org.apache.commons.lang3.StringUtils.getLevenshteinDistance((java.lang.CharSequence) "ArrayListArrayListArrayListavajgnal", (java.lang.CharSequence) "##################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################avajGNAL");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 950 + "'", int2 == 950);
    }

    @Test
    public void test35143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest70.test35143");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.stripEnd("TSIlYARRa.lA.LANG", "aaaaaaaaaa           aaaaaaaaaa         .......");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "TSIlYARRa.lA.LANG" + "'", str2, "TSIlYARRa.lA.LANG");
    }

    @Test
    public void test35144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest70.test35144");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringAfterLast("tsiyarr.a.lantsiyarr.a.lantsiyarr.a.lantsiyarr.a.lantsiyarr.a.lantsiyarr.a.lantsiyarr.a.lantsiyarr.asaylavvsaylavvsaylavvsaylavvsaylavvsaylavvsaylavvsaylavvsaylavvsaylavvsaylavvsaylavvsaylavvsaylavvsaylavvsaylavvsaylavvsaylavvsaylavvsaylavvsaylavvsaylavvsaylavvsaylavvsaylavvsaylavvsaylavvsaylavvsaylavvsaylavvsaylavvsaylavvsaylavvsaylavvsaylavvsaylavvsaylavvsaylavvsaylavvsaylavvsaylavvsaylavvsaylavvsaylavvsaylavvsaylavvsaylavvsaylavvsaylavvsaylavvsaylavvsaylavvsaylavvsaylavvsaylavvsaylavvs", "gnal                                                                ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test35145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest70.test35145");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("...$$$$$$$$$$$$$$$..gn                                            gn      tavaj.gnalarraylistarraylistarraylign      ", "4444444string.44444444", 13);
        int int4 = org.apache.commons.lang3.StringUtils.indexOfDifference((java.lang.CharSequence[]) strArray3);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test35146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest70.test35146");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.lowerCase("ArrayListArrayListArrayListavaj.gnal                                           INTEGER                                       ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "arraylistarraylistarraylistavaj.gnal                                           integer                                       " + "'", str1, "arraylistarraylistarraylistavaj.gnal                                           integer                                       ");
    }

    @Test
    public void test35147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest70.test35147");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.split("                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                  ", '4');
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test35148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest70.test35148");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.split("                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                 ", '.');
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test35149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest70.test35149");
        int int2 = org.apache.commons.lang3.StringUtils.indexOf("                                                                                                                                                                ", 13);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test35150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest70.test35150");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.left("gnirtS.gnal.avaj ssalcgnirtS.gnal.avaj ssalcgnirtS.gnal.avaj ssalcgnirtS.gnal.avaj ssalcgnirtS.gnal.avaj ssalcgnirtS.gnal.avaj ssalcgnirtS.gnal.avaj ssalcgnirtS.gnal.avaj ssalcgnirtS.gnal.avaj ssalcgnirtS.gnal.avaj ssalcgnirtS.gnal.avaj ssalcgnirtS.gnal.avaj ssalcgnirtS.gnal.avaj ssalcgnirtS.gnal.avaj ssalcgnirtS.gnal.avaj ssalcgnirtS.gnal.avaj ... .... .java.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.lang... .... .java.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.lang... .... .java.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.lang... .... .java.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.lang... .... .java.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.lang... .... .4444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444", 87);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "gnirtS.gnal.avaj ssalcgnirtS.gnal.avaj ssalcgnirtS.gnal.avaj ssalcgnirtS.gnal.avaj ssal" + "'", str2, "gnirtS.gnal.avaj ssalcgnirtS.gnal.avaj ssalcgnirtS.gnal.avaj ssalcgnirtS.gnal.avaj ssal");
    }

    @Test
    public void test35151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest70.test35151");
        int int3 = org.apache.commons.lang3.StringUtils.indexOfIgnoreCase("ElbazilaireS.......java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........javanignirtSelbaenolC.gnal", "JAVAL AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAG", 145);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test35152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest70.test35152");
        java.lang.String str1 = org.apache.commons.lang3.ClassUtils.getPackageCanonicalName("Byte");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
    }

    @Test
    public void test35153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest70.test35153");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.center("javal$agn", 131);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                                             javal$agn                                                             " + "'", str2, "                                                             javal$agn                                                             ");
    }

    @Test
    public void test35154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest70.test35154");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.leftPad("JAVA.LANGAGNAL.AVAJGNAL..LANGGNAL.AVARRCLASSJAVA.LANG.OBJECTYLISTARRCLASSJAVA.LANG.OBJECTYLISTA", 108, '4');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "4444444444444JAVA.LANGAGNAL.AVAJGNAL..LANGGNAL.AVARRCLASSJAVA.LANG.OBJECTYLISTARRCLASSJAVA.LANG.OBJECTYLISTA" + "'", str3, "4444444444444JAVA.LANGAGNAL.AVAJGNAL..LANGGNAL.AVARRCLASSJAVA.LANG.OBJECTYLISTARRCLASSJAVA.LANG.OBJECTYLISTA");
    }

    @Test
    public void test35155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest70.test35155");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.capitalize((java.lang.CharSequence) "aaaaaaaautilaaaaaaaaa");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Aaaaaaaautilaaaaaaaaa" + "'", str1, "Aaaaaaaautilaaaaaaaaa");
    }

    @Test
    public void test35156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest70.test35156");
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("class java.lang.String", "                                   ");
        java.lang.String str6 = org.apache.commons.lang3.ClassUtils.getShortCanonicalName((java.lang.Object) strArray4, "                                                                                                    ");
        java.lang.String[] strArray9 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("Jav4444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444aaaaaaaaaava.langava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.lang", "java..........java..........java...");
        java.lang.String str10 = org.apache.commons.lang3.StringUtils.replaceEachRepeatedly("$$$$$$$$$$$$$$$$$$$$$$$$$$$$$...", strArray4, strArray9);
        boolean boolean11 = org.apache.commons.lang3.StringUtils.endsWithAny("JAVAlLANGJ", strArray9);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str15 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray9, "utilLutilLutilLutilLutilLutilLutilLutilLutilLutilLutilLutilLutilLutilLutilLutilLutilLutilLutilLutilLutilLutilLutilLutilLutilLutilLutilLutilLutilLutilLutilLutilLutiL", 60, 470);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "String[]" + "'", str6, "String[]");
        org.junit.Assert.assertNotNull(strArray9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "$$$$$$$$$$$$$$$$$$$$$$$$$$$$$..." + "'", str10, "$$$$$$$$$$$$$$$$$$$$$$$$$$$$$...");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test35157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest70.test35157");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.difference("$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$                                                                                                                                                                                                                                                                                                                                                                                                                                         ", "gnl$ $vj");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "gnl$ $vj" + "'", str2, "gnl$ $vj");
    }

    @Test
    public void test35158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest70.test35158");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.split("arahCretcarahCretcarahCretcarahCretcarahCretcarahCretcarahCretcarahCretcarahCretcarahCretcarahCretcarahCretcarahCretcarahCretcarahCretcarahCretcarahCretcarahCretcarahCretcarahCretcarahCretcarahCretcarahCretcarahCretcarahCretcarahCretcarahCretcarahCretcarahCretcarahCretcar...", ' ');
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test35159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest70.test35159");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphaSpace((java.lang.CharSequence) "              Llitu               ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test35160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest70.test35160");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.rightPad("                   GNAL.AVAJ", 116, '4');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "                   GNAL.AVAJ4444444444444444444444444444444444444444444444444444444444444444444444444444444444444444" + "'", str3, "                   GNAL.AVAJ4444444444444444444444444444444444444444444444444444444444444444444444444444444444444444");
    }

    @Test
    public void test35161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest70.test35161");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.defaultIfEmpty("", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaastrinaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa. aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaastrinaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaastrinaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa. aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaastrinaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa" + "'", str2, "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaastrinaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa. aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaastrinaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
    }

    @Test
    public void test35162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest70.test35162");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeEnd("", "4444444444444AAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agn");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test35163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest70.test35163");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceChars("44444444444444444444444444444444444444444444444]tu44444444444444444444444444444444444444444444444", "javastring..g.g.g.g.g.g.g.g.g.g.g.g.g.g.g.g.g.g.g.g.g.g.g.g.g.g.g.g.g.g.g.g.g.g.g.g.g.g.gg.g.g.g.g.g.g.g.g.g.g.g.g.g.g.g.g.g.g.g.g.g.g.g.g.g.g.g.g.g.g.g.g.g.g.g.g.g.gg.g.g.g.g.g.g.g.g.g.g.g.g.g.g.g.g.g.g.g.g.g.g.g.g.g.g.g.g.g.g.g.g.g.g.g.g.g.gg.g.g.g.g.g.g.g.g.g.g.g.g.g.g.g.g.g.g.g.g.g.g.g.g.g.g.g.g.g.g.g.g.g.g.g.g.g.gg.g.g.g.g.g.g.g.g.g.g.g.g.g.g.g.g.g.g.g.g.g.g.g.g.g.g.g.g.g.g.g.g.g.g.g.g.g.gg.g.g.g.g.g.g.g.g.g.g.g.g.g.g.g.g.g.g.g.g.g.g.g.g.g.g.g.g.g.g.g.g.g.g.g.g.g.gg.g.g.g.g.g.g.g.g.g.g.g.g.g.g.g.g.g.g.g.g.g.g.g.g.g.g.g.g.g.g.g.g.g.g.g.g.g.gg.g.g.g.g.g.g.g.g.g.g.g.g.g.g.g.g.g.g.g.g.g.g.g.g.g.g.g.g.g.g.g.g.g.g.g.g.g.gg.g.g.g.g.g.g.g.g.g.g.g.g.g.g.g.g.", "                                  aaaaaa...aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "44444444444444444444444444444444444444444444444] u44444444444444444444444444444444444444444444444" + "'", str3, "44444444444444444444444444444444444444444444444] u44444444444444444444444444444444444444444444444");
    }

    @Test
    public void test35164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest70.test35164");
        java.lang.String[] strArray5 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("...", "avaj.gnal", (int) 'a');
        java.lang.String str6 = org.apache.commons.lang3.StringUtils.getCommonPrefix(strArray5);
        int int7 = org.apache.commons.lang3.StringUtils.indexOfAny("][sslC", strArray5);
        java.lang.String[] strArray12 = org.apache.commons.lang3.StringUtils.split("                                                                                                    ", "hi!", (int) (byte) -1);
        int int13 = org.apache.commons.lang3.StringUtils.indexOfDifference((java.lang.CharSequence[]) strArray12);
        boolean boolean14 = org.apache.commons.lang3.StringUtils.startsWithAny("ArrayList", strArray12);
        java.lang.String str16 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray12, "Serializabl");
        java.lang.String str17 = org.apache.commons.lang3.StringUtils.replaceEach("$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$A rrr rrr rrr r...", strArray5, strArray12);
        int int18 = org.apache.commons.lang3.StringUtils.indexOfDifference((java.lang.CharSequence[]) strArray5);
        java.lang.String str19 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray5);
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "..." + "'", str6, "...");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertNotNull(strArray12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "                                                                                                    " + "'", str16, "                                                                                                    ");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$A rrr rrr rrr r                                                                                                    " + "'", str17, "$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$A rrr rrr rrr r                                                                                                    ");
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "..." + "'", str19, "...");
    }

    @Test
    public void test35165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest70.test35165");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.right("                                                                                                                                                                                                                                                                                                            i4elbaenolc.gnal.avajecafretnitringi4elbaenolc.gnal.avajecafretni                                                                                                                                                                                                                                                                                                           ", 71);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                                                       " + "'", str2, "                                                                       ");
    }

    @Test
    public void test35166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest70.test35166");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfIgnoreCase("aRRAYlISTaRRAYlISTaRRAYlIST", "AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                     ");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test35167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest70.test35167");
        java.lang.CharSequence charSequence2 = null;
        char[] charArray12 = new char[] { '.', '.', ' ', '.', ' ' };
        int int13 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "$       ", charArray12);
        boolean boolean14 = org.apache.commons.lang3.StringUtils.containsAny("interface java.lang.CloneableAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAringinterface java.io.Serializable", charArray12);
        int int15 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) ".....hi!ArrayListArrayListArrayListavaj.gnalArrayListArrayListArrayListavaj.gnalArrayListArrayListArrayLi.                       javaulang", charArray12);
        boolean boolean16 = org.apache.commons.lang3.StringUtils.containsAny("String[]String[]StLlitung[]String[]String[]String[]String[]String[]", charArray12);
        int int17 = org.apache.commons.lang3.StringUtils.indexOfAny(charSequence2, charArray12);
        boolean boolean18 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java.....AA...                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                           ", charArray12);
        boolean boolean19 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "clssjv.lng.ClssJAVAULANGJAVAULANGJAVAULANGJAVAULANGJAVAULANGJAVAULANGJAVAULANGJAVAULANGJAVAULANGJAVAULANGJAVAULANGJAVAULANGJAVAULANGJAVAULANGJAVAULANGJAVAULANGJAVAULANGJAVAULANGJAVAULANGJAVAULANG", charArray12);
        org.junit.Assert.assertNotNull(charArray12);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray12), ".. . ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray12), ".. . ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray12), "[., .,  , .,  ]");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 5 + "'", int15 == 5);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test35168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest70.test35168");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("arr.avalitu.aaaaaaaaaaaaaaaaaaaaaaaaaaaaaa... aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa... aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa... aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa... aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa... aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa... aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa... aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa... aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa... aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaylist", "UUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUtttSUlUttttttttttSUlUtt");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.stripAll(strArray2);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void test35169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest70.test35169");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.stripEnd("AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA4444444444444AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAACLASclass java.lang.StringCLASCLASclass java.lang.StringCLASCLASclass java.lang.StringCLASCLASclass java.lang.StringCLASCLASclass java.lang.StringCLASCLASclass java.lang.", "iNTERFACE JAVALANGcLONEABLEJAVAJAVAJAVAJAVAJAVAJAVAJAVAJAVAJAVAJAVAJAVAJAVAJAVAJAVAJAVAJAVAJAVAJAVAJAVAJAVAJAVAJAVAJAVAJAVAJAVAJAVAJAVAJAVAJAVAJAVAJAVAJAVAJAVAJAVAJAVAINTERFACE JAVAIOsERIALIZABLE");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA4444444444444AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAACLASclass java.lang.StringCLASCLASclass java.lang.StringCLASCLASclass java.lang.StringCLASCLASclass java.lang.StringCLASCLASclass java.lang.StringCLASCLASclass java.lang." + "'", str2, "AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA4444444444444AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAACLASclass java.lang.StringCLASCLASclass java.lang.StringCLASCLASclass java.lang.StringCLASCLASclass java.lang.StringCLASCLASclass java.lang.StringCLASCLASclass java.lang.");
    }

    @Test
    public void test35170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest70.test35170");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringAfterLast("4444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444                                                    ", "   A..iyL ziirSoifri.oCfriCLASS JAVALANGCLASS                       JAVAULANG                       JAVAULANG                       JAVAULANG                       JAVAULANG                       JAVAULANG                       JAVAULANG                       JAVAULANG                       JAVAULANG                       JAVAULANG                       JAVAULANG                       JAVAULANG                       JAVAULANG                       JAVAULANG                       JAVAULANG                       JAVAULANG                       JAVAULANG                       JAVAULANG                       JAVAULANG                       JAVAULANG                       JAVAULANGCLASS JAVALANGCLASS                       JAVAULANG                       JAVAULANG                       JAVAULANG                       JAVAULANG                       JAVAULANG                       JAVAULANG                       JAVAU");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test35171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest70.test35171");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceChars("AAAAAAAAAAjaval.agn$$$$$$$$$$$$$$$$$$$..l.agnAAAAAAAAAAring$$$$$$$$$$$$$", '.', '.');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "AAAAAAAAAAjaval.agn$$$$$$$$$$$$$$$$$$$..l.agnAAAAAAAAAAring$$$$$$$$$$$$$" + "'", str3, "AAAAAAAAAAjaval.agn$$$$$$$$$$$$$$$$$$$..l.agnAAAAAAAAAAring$$$$$$$$$$$$$");
    }

    @Test
    public void test35172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest70.test35172");
        java.lang.String[] strArray2 = new java.lang.String[] { "                                   " };
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.getCommonPrefix(strArray2);
        java.lang.Class<?>[] wildcardClassArray4 = org.apache.commons.lang3.ClassUtils.toClass((java.lang.Object[]) strArray2);
        java.lang.Class<?>[] wildcardClassArray5 = org.apache.commons.lang3.ClassUtils.primitivesToWrappers(wildcardClassArray4);
        java.lang.String[] strArray8 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("class java.lang.String", "                                   ");
        java.lang.String[] strArray9 = org.apache.commons.lang3.StringUtils.stripAll(strArray8);
        java.lang.Class<?>[] wildcardClassArray10 = org.apache.commons.lang3.ClassUtils.toClass((java.lang.Object[]) strArray9);
        java.lang.Class<?>[] wildcardClassArray11 = org.apache.commons.lang3.ClassUtils.primitivesToWrappers(wildcardClassArray10);
        java.lang.String[] strArray13 = new java.lang.String[] { "                                   " };
        java.lang.String str14 = org.apache.commons.lang3.StringUtils.getCommonPrefix(strArray13);
        java.lang.Class<?>[] wildcardClassArray15 = org.apache.commons.lang3.ClassUtils.toClass((java.lang.Object[]) strArray13);
        java.lang.Class<?> wildcardClass16 = null;
        java.lang.Class[] classArray18 = new java.lang.Class[1];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray19 = (java.lang.Class<?>[]) classArray18;
        wildcardClassArray19[0] = wildcardClass16;
        java.lang.Class<?>[] wildcardClassArray22 = org.apache.commons.lang3.ClassUtils.primitivesToWrappers(wildcardClassArray19);
        boolean boolean23 = org.apache.commons.lang3.ClassUtils.isAssignable(wildcardClassArray15, wildcardClassArray19);
        boolean boolean24 = org.apache.commons.lang3.ClassUtils.isAssignable(wildcardClassArray11, wildcardClassArray19);
        boolean boolean26 = org.apache.commons.lang3.ClassUtils.isAssignable(wildcardClassArray5, wildcardClassArray11, true);
        java.lang.String str27 = org.apache.commons.lang3.StringUtils.concatWith("                                                                  litu                                                                  ", (java.lang.Object[]) wildcardClassArray5);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "                                   " + "'", str3, "                                   ");
        org.junit.Assert.assertNotNull(wildcardClassArray4);
        org.junit.Assert.assertNotNull(wildcardClassArray5);
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertNotNull(strArray9);
        org.junit.Assert.assertNotNull(wildcardClassArray10);
        org.junit.Assert.assertNotNull(wildcardClassArray11);
        org.junit.Assert.assertNotNull(strArray13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "                                   " + "'", str14, "                                   ");
        org.junit.Assert.assertNotNull(wildcardClassArray15);
        org.junit.Assert.assertNotNull(classArray18);
        org.junit.Assert.assertNotNull(wildcardClassArray19);
        org.junit.Assert.assertNotNull(wildcardClassArray22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "class java.lang.String" + "'", str27, "class java.lang.String");
    }

    @Test
    public void test35173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest70.test35173");
        java.lang.CharSequence charSequence2 = org.apache.commons.lang3.StringUtils.defaultIfEmpty((java.lang.CharSequence) ".......java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........jav", (java.lang.CharSequence) "......javaulainterface java.lang.Cloneable4interface java.io.Serializable......");
        org.junit.Assert.assertEquals("'" + charSequence2 + "' != '" + ".......java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........jav" + "'", charSequence2, ".......java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........jav");
    }

    @Test
    public void test35174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest70.test35174");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOf("                                                                                                            ", "RChahacta", 181);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test35175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest70.test35175");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.abbreviateMiddle("4444444444444", "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                     interface java.lang.CloneableAvaj.gnalinterface java.io.Serializable", 38);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "4444444444444" + "'", str3, "4444444444444");
    }

    @Test
    public void test35176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest70.test35176");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.substringsBetween("$$$$$$$$$$$$.", "LANGaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "JLVLlaLNG");
        org.junit.Assert.assertNull(strArray3);
    }

    @Test
    public void test35177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest70.test35177");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphanumericSpace((java.lang.CharSequence) "                                                                                                                                                                                                                 util                                                                                                                                                                                                                  ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test35178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest70.test35178");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlpha((java.lang.CharSequence) "                                                                               JStringStringStringStringStringStringStringStringStringStringVStringStringStringStringStringStringStringStringStringStringLStringStringStringStringStringStringStringStringStringStringNG                                                                                ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test35179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest70.test35179");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("IO   ..........................................................................................IO   ", "gnirtS.gnal.avaj ssalcgnirtS.gnal.avaj ssalcgnirtS.gnal.avaj ssalcgnirtS.gnal.avaj ssalcgnirtS.gnal.avaj ssalcgnirtS.gnal.avaj ssalcgnirtS.gnal.avaj ssalcgnirtS.gnal.avaj ssalcgnirtS.gnal.avaj ssalcgnirtS.gnal.avaj ssalcgnirtS.gnal.avaj ssalcgnirtS.gnal.avaj ssalcgnirtS.gnal.avaj ssalcgnirtS.gnal.avaj ssalcgnirtS.gnal.avaj ssalcgnirtS.gnal.avaj ... .... .java.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.lang... .... .java.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.lang... .... .java.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.lang... .... .java.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.lang... .... .java.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.lang... .... .", 399);
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void test35180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest70.test35180");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceChars("                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                       CLASSjava.langAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAulang", "AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA...AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA...AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA...AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA...AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA...AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA...AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA...AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA...AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA......", "                                                                                                                                                                                                                                                     44444444444444444444444444444444444444444444444444aaaaaaaaaa...");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                       CL SSjava lang                                                                                ulang" + "'", str3, "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                       CL SSjava lang                                                                                ulang");
    }

    @Test
    public void test35181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest70.test35181");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlpha((java.lang.CharSequence) "interface java.lang.Cloneable...    $         $         $         $         $         $         $         $         $         $         $         $         $         $         $ ...interface java.io.Serializable");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test35182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest70.test35182");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.chop("INTERFACE JAVA.LANG.cLONEABLEa RRR RRR RRR RRR RRR RRR RRR RRR RNAL....................INTERFACE JAVA.LAN");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "INTERFACE JAVA.LANG.cLONEABLEa RRR RRR RRR RRR RRR RRR RRR RRR RNAL....................INTERFACE JAVA.LA" + "'", str1, "INTERFACE JAVA.LANG.cLONEABLEa RRR RRR RRR RRR RRR RRR RRR RRR RNAL....................INTERFACE JAVA.LA");
    }

    @Test
    public void test35183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest70.test35183");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.startsWith("gnirtSlitu.avaj1-gnirtSlitu.avaj1", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaanirtsaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test35184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest70.test35184");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.deleteWhitespace("                                                                                                                                                                                                                                                                                                                                               javaStringnalArrayListArrayListArrayListavaj.gnalArrayListArrayListArrayLi");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "javaStringnalArrayListArrayListArrayListavaj.gnalArrayListArrayListArrayLi" + "'", str1, "javaStringnalArrayListArrayListArrayListavaj.gnalArrayListArrayListArrayLi");
    }

    @Test
    public void test35185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest70.test35185");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.capitalize((java.lang.CharSequence) "INTERFACEJAVA.LANG.CLONEABLESTRINGINTERFACEJAVA");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "INTERFACEJAVA.LANG.CLONEABLESTRINGINTERFACEJAVA" + "'", str1, "INTERFACEJAVA.LANG.CLONEABLESTRINGINTERFACEJAVA");
    }

    @Test
    public void test35186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest70.test35186");
        int int3 = org.apache.commons.lang3.StringUtils.indexOfIgnoreCase("                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                            ", "$         44444444444444444444444444444444444444444444444444444444444444444444444444444444                                                                                                                                                                                                                                                                                                                                                                                                            ", 152);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test35187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest70.test35187");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isWhitespace((java.lang.CharSequence) "JAVA.IO.SERIALIZABLE JAVA.LANG.cLONEABLESTRINGINTERFA.E INTERFA.EJAVA.IO.SERIALIZABLE JAVA.LANG.cLONEABLESTRINGINTERFA.E INTERFA.EJAVA.IO.SERIALIZABLE JAVA.LANG.cLONEABLESTRINGINTERFA.E INTERFA.E");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test35188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest70.test35188");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.leftPad(".uti4444444444444444444444444444444444444444444444444444444444444444444444444ava4444444444444444444444444444444444444444444444444444444444444444444444444j", 525);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                                                                                                                                                                                                                                                                                                                                                                   .uti4444444444444444444444444444444444444444444444444444444444444444444444444ava4444444444444444444444444444444444444444444444444444444444444444444444444j" + "'", str2, "                                                                                                                                                                                                                                                                                                                                                                                   .uti4444444444444444444444444444444444444444444444444444444444444444444444444ava4444444444444444444444444444444444444444444444444444444444444444444444444j");
    }

    @Test
    public void test35189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest70.test35189");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.split("RFACE JAVALANGCLONEABLELANGGNALJAVALANGAVAJGNALJAVALANGAVAJGNALJAVALANGAVAJGNALJAVALANGAVAJGNALJAVALANGAVAJGNALJAVALANGAVAJ", "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                      ...       .");
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test35190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest70.test35190");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "UUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUtttSUlUttttttttttSUlUtt");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.stripAll(strArray2);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void test35191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest70.test35191");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeEnd("avaj.gnal", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaanirtsaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "avaj.gnal" + "'", str2, "avaj.gnal");
    }

    @Test
    public void test35192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest70.test35192");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.leftPad(" v aaaaaaaaaaj v aaaaaaaaaaj v aaaaaaaaaaj v aaaaaaaaaaj v aaaaaaaaaaj v aaaaaaaaaaj v aaaaaaaaaaj v aaaaaaaaaaj v aaaaaaaaaaj v aaaaaaaaaaj v aaaaaaaaaaj v aaaaaaaaaaj v aaaaaaaaaaj v aaaaaaaaaaj v aaaaaaaaaaj v aaaaaaaaaaj v aaaaaaaaaaj v aaaaaaaaaaj v aaaaaaaaaaj v aaaaaaaaaaj v aaaaaaaaaaj v aaaaaaaaaaj v aaaaaaaaaaj v aaaaaaaaaaj v aaaaaaaaaaj v aaaaaaaaaaj v aaaaaaaaaaj v aaaaaaaaaaj v aaaaaaaaaaj v aaaaaaaaaaj v aaaaaaaaaaj v aaaaaaaaaaj v aaaaaaaaaaj v interf ceaj v aioaSeri liz ble", 74, "VA.LANGAVAJ.GNALJAVA.LANGAVAJ.GNALJAVA.LANGAVAJ.GNALJAVA.LANGAVAJ.GNALJAVA.LANGAVAJ.GNALJAVA.LANG");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + " v aaaaaaaaaaj v aaaaaaaaaaj v aaaaaaaaaaj v aaaaaaaaaaj v aaaaaaaaaaj v aaaaaaaaaaj v aaaaaaaaaaj v aaaaaaaaaaj v aaaaaaaaaaj v aaaaaaaaaaj v aaaaaaaaaaj v aaaaaaaaaaj v aaaaaaaaaaj v aaaaaaaaaaj v aaaaaaaaaaj v aaaaaaaaaaj v aaaaaaaaaaj v aaaaaaaaaaj v aaaaaaaaaaj v aaaaaaaaaaj v aaaaaaaaaaj v aaaaaaaaaaj v aaaaaaaaaaj v aaaaaaaaaaj v aaaaaaaaaaj v aaaaaaaaaaj v aaaaaaaaaaj v aaaaaaaaaaj v aaaaaaaaaaj v aaaaaaaaaaj v aaaaaaaaaaj v aaaaaaaaaaj v aaaaaaaaaaj v interf ceaj v aioaSeri liz ble" + "'", str3, " v aaaaaaaaaaj v aaaaaaaaaaj v aaaaaaaaaaj v aaaaaaaaaaj v aaaaaaaaaaj v aaaaaaaaaaj v aaaaaaaaaaj v aaaaaaaaaaj v aaaaaaaaaaj v aaaaaaaaaaj v aaaaaaaaaaj v aaaaaaaaaaj v aaaaaaaaaaj v aaaaaaaaaaj v aaaaaaaaaaj v aaaaaaaaaaj v aaaaaaaaaaj v aaaaaaaaaaj v aaaaaaaaaaj v aaaaaaaaaaj v aaaaaaaaaaj v aaaaaaaaaaj v aaaaaaaaaaj v aaaaaaaaaaj v aaaaaaaaaaj v aaaaaaaaaaj v aaaaaaaaaaj v aaaaaaaaaaj v aaaaaaaaaaj v aaaaaaaaaaj v aaaaaaaaaaj v aaaaaaaaaaj v aaaaaaaaaaj v interf ceaj v aioaSeri liz ble");
    }

    @Test
    public void test35193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest70.test35193");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAllUpperCase((java.lang.CharSequence) "ayLisArrayLisArrayLisA");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test35194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest70.test35194");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("avaj.gnal");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.concat((java.lang.Object[]) strArray1);
        java.lang.String str6 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray1, '4', 60, 0);
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "avaj.gnal" + "'", str2, "avaj.gnal");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
    }

    @Test
    public void test35195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest70.test35195");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitByCharacterType("###################################################################################################################################################################################################################################################################################################################################################################################################################################################################################..........a");
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test35196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest70.test35196");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBefore("aRR... AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA... AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA... AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA... AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA... AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAACloneable4iaRR... AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA... AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA... AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA... AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA... AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA", "Va.langGNAL..la...");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "aRR... AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA... AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA... AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA... AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA... AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAACloneable4iaRR... AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA... AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA... AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA... AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA... AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA" + "'", str2, "aRR... AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA... AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA... AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA... AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA... AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAACloneable4iaRR... AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA... AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA... AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA... AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA... AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA");
    }

    @Test
    public void test35197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest70.test35197");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.defaultString("", "INTERFACE JAVA.LANG.cLONEABLE4INTERFACE JAVA.IO.sERIALIZABL");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test35198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest70.test35198");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.containsWhitespace("###################################################################################################################################################################################################################################################################################################################################################################################################################################################################################..........a       ..");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test35199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest70.test35199");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("hi!", "");
        java.lang.String[] strArray5 = org.apache.commons.lang3.StringUtils.stripAll(strArray3, "$");
        java.lang.String str6 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray3);
        java.lang.String[] strArray8 = org.apache.commons.lang3.StringUtils.split("java.util");
        java.lang.String[] strArray10 = org.apache.commons.lang3.StringUtils.stripAll(strArray8, "java.lang");
        java.lang.String str11 = org.apache.commons.lang3.StringUtils.getCommonPrefix(strArray8);
        java.lang.String str12 = org.apache.commons.lang3.StringUtils.replaceEachRepeatedly("$", strArray3, strArray8);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str16 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray8, '.', 378, 655);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 378");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertNotNull(strArray10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "java.util" + "'", str11, "java.util");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "$" + "'", str12, "$");
    }

    @Test
    public void test35200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest70.test35200");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.deleteWhitespace("                                                                          ...AAAAAAAAAAAAAAAAAAA      ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "...AAAAAAAAAAAAAAAAAAA" + "'", str1, "...AAAAAAAAAAAAAAAAAAA");
    }

    @Test
    public void test35201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest70.test35201");
        java.util.Locale locale1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.apache.commons.lang3.StringUtils.lowerCase("Cl", locale1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test35202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest70.test35202");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isEmpty((java.lang.CharSequence) "                                                                                                                                                                                                                                                                                                 classjavalangclassjavaulangjavaulangjavaulangjavaulangjavaulangjavaulangjavaulangjavaulangjavaulangjavaulangjavaulangjavaulangjavaulangjavaulangjavaulangjavaulangjavaulangjavaulangjavaulangjavaulang");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test35203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest70.test35203");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.substring("ByteByteByteByteByteByteByteByteByteByteByteByteByteByteByteByteByteByteByteByteByteByteByteByteByteByteByteByteByteByteByteByteByteByteByteByteByteByteByteByteByteByteByteByteByteByteByteByteByteByteByteByteByteyteByteByteByteByteByteByteByteByteByteByteByteByteByteByteByteByteByteByteByteByteByteByteByteByteByteByteByteByteByteByteByteByteByteByteByteByteByteByteByteByteByteByteByteByteByteByteByteByteByteByteByteByt", 150, 850);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "teByteByteByteByteByteByteByteByteByteByteByteByteByteByteByteyteByteByteByteByteByteByteByteByteByteByteByteByteByteByteByteByteByteByteByteByteByteByteByteByteByteByteByteByteByteByteByteByteByteByteByteByteByteByteByteByteByteByteByteByteByteByteByteByteByteByteByteByt" + "'", str3, "teByteByteByteByteByteByteByteByteByteByteByteByteByteByteByteyteByteByteByteByteByteByteByteByteByteByteByteByteByteByteByteByteByteByteByteByteByteByteByteByteByteByteByteByteByteByteByteByteByteByteByteByteByteByteByteByteByteByteByteByteByteByteByteByteByteByteByteByt");
    }

    @Test
    public void test35204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest70.test35204");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.abbreviate("                                           ", 62, 434);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "                                           " + "'", str3, "                                           ");
    }

    @Test
    public void test35205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest70.test35205");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.swapCase("avaj.gna");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "AVAJ.GNA" + "'", str1, "AVAJ.GNA");
    }

    @Test
    public void test35206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest70.test35206");
        int int3 = org.apache.commons.lang3.StringUtils.lastOrdinalIndexOf("String.                             ", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaavaj", 479);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test35207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest70.test35207");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceChars("", '.', '$');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test35208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest70.test35208");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNotBlank((java.lang.CharSequence) "interface java.lang.Cloneable interface java.io.Serializable");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test35209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest70.test35209");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.equalsIgnoreCase("", "");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test35210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest70.test35210");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.stripStart("arahCretcarahCretcarahCretcarahCretcarahCretcarahCretcarahCretcarahCretcarahCretcarahCretcarahCretcarahCretcarahCretcarahCretcarahCretcarahCretcarahCretcarahCretcarahCretcarahCretcarahCretcarahCretcarahCretcarahCretcarahCretcarahCretcarahCretcarahCretcarahCretcarahCretcar...", "..........................................................................................................................................................................................................................................................................................................................................................................................................................AAAAAAAAAAAAAAAAAAA AAAAAAAAAAAAAAAAAAA AAAAAAAAAAAAAAAAAAA AAAAAAAAAAAAAAAAAAA AAAAAAAAAAAAAAAAAAA AAAAAAAAAAAAAAAAAAA...........................................................................................................................................................................................................................................................................................................................................................................................................................");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "arahCretcarahCretcarahCretcarahCretcarahCretcarahCretcarahCretcarahCretcarahCretcarahCretcarahCretcarahCretcarahCretcarahCretcarahCretcarahCretcarahCretcarahCretcarahCretcarahCretcarahCretcarahCretcarahCretcarahCretcarahCretcarahCretcarahCretcarahCretcarahCretcarahCretcar..." + "'", str2, "arahCretcarahCretcarahCretcarahCretcarahCretcarahCretcarahCretcarahCretcarahCretcarahCretcarahCretcarahCretcarahCretcarahCretcarahCretcarahCretcarahCretcarahCretcarahCretcarahCretcarahCretcarahCretcarahCretcarahCretcarahCretcarahCretcarahCretcarahCretcarahCretcarahCretcar...");
    }

    @Test
    public void test35211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest70.test35211");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.defaultString("", "                                                                                                                                                                                                                                                                                                                                                                                                ...VA.LANGAVAJ.GNALJAVA.LANGAVAJ.GNALJAVA.LANGAVAJ.GNALJAVA.LANGAVAJ.GNALJAVA.LANGAVAJ.GNALJAVA.LANGGNALGNALGNALGNALGNALGNALGNALGNALGNALGNALGNALGNALGNALGNALGNALGNALGNALGNALGNALGNALGNALGNALGNALGNALGNALGNALGNALGNALGNALGNALGNALGNALGNALGNALGNALGNALGNALGNALGNALGNALGNALGNALGNALGNALGNALGNALGNALGNALGNALGNALGNALGNALGNALGNALGNALGNALGNALGNALGNALGNALGNALGNALGNALGNALGNALGNALGNALGNALGNALGNALGNALGNALGNALGNALGNALGNALGNALGNALGNALGNALGNALGNALGNALGNALGNALGNALGNALGNALGNALGNALGNALGNALGNALGNALGNALGNALGNALGNALGNALGNALGNALGNALGNALGNALGNALGNALGNALGNALGNALGNALGNALG");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test35212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest70.test35212");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringAfter("interfacejava.lang.Cloneable#interfacejava.io.Serializable                                          ", "Aaaaaaaaaaaaa");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test35213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest70.test35213");
        int int3 = org.apache.commons.lang3.StringUtils.indexOfIgnoreCase("tttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttutiljava.util444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444ttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttt", "interface#java.lang.cloneable4interface....................................................................$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$Gnal$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$                       $$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$Gnal$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$javaulang", 52);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test35214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest70.test35214");
        int int2 = org.apache.commons.lang3.StringUtils.countMatches("                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                           ", "aaaaaaa       INTEGER        aaaaaaa");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test35215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest70.test35215");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.contains("-1java.utilString-1java.utilString", 89);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test35216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest70.test35216");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444java.langAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA", '$');
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test35217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest70.test35217");
        int int3 = org.apache.commons.lang3.StringUtils.indexOf("                                                                           Javastring..                                                                          ", "aaaaaaaaaaaaaalaagaaaaaaaaaaaaaaalaagaaaaaaaaaaaaaaalaagaaaaaaaaaaaaaaalaagaaaaaaaaaaaaaaalaagaaaaaaaaaaaaaaalaagaaaaaaaaaaaaaaalaagaaaaaaaaaaaaaaalaagaaaaaaaaaaaaaaalaagaaaaaaaaaaaaaaalaagaaaaaaaaaaaaaaalaagaaaaaaaaaaaaaaalaagaaaaaaaaaaaaaaalaagaaaaaaaaaaaaaaalaagaaaaaaaaaaaaaaalaagaaaaaaaaaaaaaaalaagaaaaaaaaaaaaaaalaagaaaaaaaaaaaaaaalaagaaaaaaaaaaaaaaalaagaaaaaaaaaaaaaaalaagaaaaaaaaaaaaaaalaagaaaaaaaaaaaaaaalaagaaaaaaaaaaaaaaalaagaaaaaaaaaaaaaaalaaga", 939);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test35218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest70.test35218");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.strip("$$$$$$$JAVA.UTI", "GnirtS.gnal.avajssalcgnirtS.gnal.avajssalcgnirtS.gnal.avajssalcgnirtS.gnal.avajssalcgnirtS.gnal.avajssalcgnirtS.gnal.avajssalcgnirtS.gnal.avajssalcgnirtS.gnal.avajssalcgnirtS.gnal.avajssalcgnirtS.gnal.avajssalcgnirtS.gnal.avajssalcgnirtS.gnal.avajssalcgnirtS.gnal.avajssalcgnirtS.gnal.avajssalcgnirtS.gnal.avajssalcgnirtS.gnal.avaj........java.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.lang........java.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.lang........java.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.lang........java.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.lang........java.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.lang.......");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "$$$$$$$JAVA.UTI" + "'", str2, "$$$$$$$JAVA.UTI");
    }

    @Test
    public void test35219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest70.test35219");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNumeric((java.lang.CharSequence) "RRAYLIST                            RRAYLIST                            RRAYLIST                            RRAY$ARRAYLIS");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test35220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest70.test35220");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.substringBetween("                                                                                                                                                                                                                                                                                 interface java.lang.Cloneable.......java.......Objectava..........javainterface java.io.Serializable###########################################################################################################################################################################################################", "44444444444444444gnaluavaj44444444444444444444444444444444444444444444444444444444444444444444444", "...######");
        org.junit.Assert.assertNull(str3);
    }

    @Test
    public void test35221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest70.test35221");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphanumeric((java.lang.CharSequence) "       $                                                                                            ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test35222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest70.test35222");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.capitalize((java.lang.CharSequence) "4444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444...AAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "4444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444...AAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval" + "'", str1, "4444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444...AAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval");
    }

    @Test
    public void test35223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest70.test35223");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsIgnoreCase("AVAJ.GNALAAAAAAAAAAAAAAAAAAAAAAAAAavajecaf", "aTSIlYTCEJBoGNALAVAJSSALCRRaTSIlYTCEJBoGNALAVAJSSALCRRaVALANGgnalLANGJAVALANGagnalavajaTSIlYTCEJBoGNALAVAJSSALCRRaTSIlYTCEJBoGNALAVAJSSALCRRaVALANGgnalLANGJAVALANGagnalavajaTSIlYTCEJBoGNALAVAJSSALCRRaTSIlYTCEJBoGNALAVAJSSALCRRaVALANGgnalLANGJAVALANGagnalavajaTSIlYTCEJBoGNALAVAJSSALCRRaTSIlYTCEJsTRINGaTSIlYTCEJBoGNALAVAJSSALCRRaTSIlYTCEJBoGNALAVAJSSALCRRaVALANGgnalLANGJAVALANGagnalavajaTSIlYTCEJBoGNALAVAJSSALCRRaTSIlYTCEJBoGNALAVAJSSALCRRaVALANGgnalLANGJAVALANGagnalavajaTSIlYTCEJBoGNALAVAJSSALCRRaTSIlYTCEJBoGNALAVAJSSALCRRaVALANGgnalLANGJAVALANGagnalavajaTSIlYTCEJBoGNALAVAJSSALCRRaTSIlYTCEJB");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test35224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest70.test35224");
        char[] charArray7 = new char[] { '$' };
        int int8 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "java.util", charArray7);
        boolean boolean9 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "                                   ", charArray7);
        boolean boolean10 = org.apache.commons.lang3.StringUtils.containsAny("...       ....       .", charArray7);
        boolean boolean11 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "ARJAVAARR", charArray7);
        int int12 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "TRING", charArray7);
        boolean boolean13 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "stJAVAGNAL                                                           ", charArray7);
        org.junit.Assert.assertNotNull(charArray7);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray7), "$");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray7), "$");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray7), "[$]");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    }

    @Test
    public void test35225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest70.test35225");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.substring("VAJ.GNAL", 878, 219);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test35226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest70.test35226");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.endsWithIgnoreCase("...o.GNAL", "rayListArrayListArrayListavaj.gnalArrayListArrayListArrayListavaj.gnalArrayListArrayLis...");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test35227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest70.test35227");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAllUpperCase((java.lang.CharSequence) "                                     RGNALUAVAJ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test35228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest70.test35228");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.uncapitalize((java.lang.CharSequence) "ava.lang.Cloneable.......java.......");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "ava.lang.Cloneable.......java......." + "'", str1, "ava.lang.Cloneable.......java.......");
    }

    @Test
    public void test35229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest70.test35229");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("hi!", "");
        java.lang.String[] strArray5 = org.apache.commons.lang3.StringUtils.stripAll(strArray3, "$");
        int int6 = org.apache.commons.lang3.StringUtils.indexOfAny("", strArray5);
        int int7 = org.apache.commons.lang3.StringUtils.indexOfDifference((java.lang.CharSequence[]) strArray5);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
    }

    @Test
    public void test35230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest70.test35230");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.contains("BYTE", 378);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test35231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest70.test35231");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replace("", "-1JAVA.UTILsTRING[]    ", "4444444444444444444444      CLASSSLITUGNIRTSSLITUGNIRTSSLITUGNIRTSSLITUGNIRTSSLITUGNIRTSSLITUGNIRTinterfacegaga.lang.CloneableAAAAAAAAAAgagal.agnAAAAAAAAAAgagal.agnAAAAAAAAAAgagal.agnAAAAAAAAAAgagal.agnAAAAAAAAAAgagal.agnAAAAAAAAAAgagal.agnAAAAAAAAAAgagal.agnAAAAAAAAAAgagal.agnAAAAAAAAAAgagal.agnAAAAAAAAAAgagal.agnAAAAAAAAAAgagal.agnAAAAAAAAAAgagal.agnAAAAAAAAAAgagal.agnAAAAAAAAAAgagal.agnAAAAAAAAAAgagal.agnAAAAAAAAAAgagal.agnAAAAAAAAAAgagal.agnAAAAAAAAAAgagal.agnAAAAAAAAAAgagal.agnAAAAAAAAAAgagal.agnAAAAAAAAAAgagal.agnAAAAAAAAAAgagal.agnAAAAAAAAAAgagal.agnAAAAAAAAAAgagal.agnAAAAAAAAAAgagal.agnAAAAAAAAAAgagal.agnAAAAAAAAAAgagal.a");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test35232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest70.test35232");
        java.lang.String[] strArray6 = org.apache.commons.lang3.StringUtils.split("AVAJ.GNAL", "gagnAAAAAAAAAAistArrayListArrayListavaj.gnalArrayListArrayListArrayLi", (int) (short) 1);
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.concat((java.lang.Object[]) strArray6);
        boolean boolean8 = org.apache.commons.lang3.StringUtils.endsWithAny(" AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA", strArray6);
        java.lang.String str10 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray6, ' ');
        int int11 = org.apache.commons.lang3.StringUtils.indexOfAny("", strArray6);
        java.lang.String str12 = org.apache.commons.lang3.StringUtils.concatWith("LANG.JAVATSILYARRATSILYARRATSILYARRA", (java.lang.Object[]) strArray6);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "VAJ.GNAL" + "'", str7, "VAJ.GNAL");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "VAJ.GNAL" + "'", str10, "VAJ.GNAL");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "VAJ.GNAL" + "'", str12, "VAJ.GNAL");
    }

    @Test
    public void test35233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest70.test35233");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphanumeric((java.lang.CharSequence) "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaylist");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test35234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest70.test35234");
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.replace("...          JAVAULANGrrayListAAAA                       JAVAULANGrrayLLLLLLLLLLL......          JAVAULANGrrayListAAAA                       JAVAULANGrrayLLLLLLLLLLL......          JAVAULANGrrayListAAAA                       JAVAULANGrrayLLLLLLLLLLL......          JAVAULANGrrayListAAAA                       JAVAULANGrrayLLLLLLLLLLL......          JAVAULANGrrayListAAAA                       JAVAULANGrrayLLLLLLLLLLL......          JAVAULANGrrayListAAAA                       JAVAULANGrrayLLLLLLLLLLL......          JAVAULANGrrayListAAAA                       JAVAULANGrrayLLLLLLLLLLL......          JAVAULANGrrayListAAAA                       JAVAULANGrrayLLLLLLLLLLL......          JAVAULANGrrayListAAAA                       JAVAULANGrrayLLLLLLLLLLL......          JAVAULANGrrayListAaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa...aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "nAL.AVAJ", "interfacejava.lang.Cloneablejv..........jv..........jv..........jv..........jv..........jv..........jv..........jv..........jv..........jv..........jv..........jv..........jv..........jv..........jv..........jv..........jv..........jv..........jv..........jv..........jv..........jv..........jv..........jv..........jv..........jv..........jv..........jv..........jv..........jv..........jv..........jv..........jv..........jv..........jvinterfcejv.iointerfacejava.io.Serializable", 687);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "...          JAVAULANGrrayListAAAA                       JAVAULANGrrayLLLLLLLLLLL......          JAVAULANGrrayListAAAA                       JAVAULANGrrayLLLLLLLLLLL......          JAVAULANGrrayListAAAA                       JAVAULANGrrayLLLLLLLLLLL......          JAVAULANGrrayListAAAA                       JAVAULANGrrayLLLLLLLLLLL......          JAVAULANGrrayListAAAA                       JAVAULANGrrayLLLLLLLLLLL......          JAVAULANGrrayListAAAA                       JAVAULANGrrayLLLLLLLLLLL......          JAVAULANGrrayListAAAA                       JAVAULANGrrayLLLLLLLLLLL......          JAVAULANGrrayListAAAA                       JAVAULANGrrayLLLLLLLLLLL......          JAVAULANGrrayListAAAA                       JAVAULANGrrayLLLLLLLLLLL......          JAVAULANGrrayListAaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa...aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa" + "'", str4, "...          JAVAULANGrrayListAAAA                       JAVAULANGrrayLLLLLLLLLLL......          JAVAULANGrrayListAAAA                       JAVAULANGrrayLLLLLLLLLLL......          JAVAULANGrrayListAAAA                       JAVAULANGrrayLLLLLLLLLLL......          JAVAULANGrrayListAAAA                       JAVAULANGrrayLLLLLLLLLLL......          JAVAULANGrrayListAAAA                       JAVAULANGrrayLLLLLLLLLLL......          JAVAULANGrrayListAAAA                       JAVAULANGrrayLLLLLLLLLLL......          JAVAULANGrrayListAAAA                       JAVAULANGrrayLLLLLLLLLLL......          JAVAULANGrrayListAAAA                       JAVAULANGrrayLLLLLLLLLLL......          JAVAULANGrrayListAAAA                       JAVAULANGrrayLLLLLLLLLLL......          JAVAULANGrrayListAaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa...aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
    }

    @Test
    public void test35235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest70.test35235");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.defaultIfEmpty("", "GNL$.$V");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "GNL$.$V" + "'", str2, "GNL$.$V");
    }

    @Test
    public void test35236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest70.test35236");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.chomp("", "javalitu.");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test35237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest70.test35237");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.startsWith("                                                                                                                                                                                                                                                                                                                                                                               ", "                                                                                                                                                                                                                                                                                                                                                                                                                                                            ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test35238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest70.test35238");
        int int2 = org.apache.commons.lang3.StringUtils.getLevenshteinDistance((java.lang.CharSequence) "CLASSJAVA.LANG.CLASSJAVAULANGJAVAULANGJAVAULANGJAVAULANGJAVAULANGJAVAULANGJAVAULANGJAVAULANGJAVAULANGJAVAULANGJAVAULANGJAVAULANGJAVAULANGJAVAULANGJAVAULANGJAVAULANGJAVAULANGJAVAULANGJAVAULANGJAVAULANG", (java.lang.CharSequence) "jbOgnlvjsslsiyjbjbOgnlvjsslsiyjbjbOgnlvjsslsiyjbjbOgnlvjsslsiyjbjbOgnlvjsslsiyjbjbOgnlvjsslsiyjbjbOgnlvjsslsiyjbjbOgnlvjsslsiyjbjbOgnlvjsslsiyjbjbOgnlvjsslsiyjbjbOgnlvjsslsiyjbjbOgnlvjsslsiyjbjbOgnlvjsslsiyjbjbOgnlvjsslsiyjbjbOgnlvjsslsiyjbjbOgnlvjsslsiyjbjbOgnlvjsslsiyjbjbOgnlvjsslsiyjbjbOgnlvjsslsiyjbjbOgnlvjsslsiyjbjbOgnlvjsslsiyjbjbOgnlvjsslsiyjbjbOgnlvjsslsiyjbjbOgnlvjsslsiyjbjaaaaaaaaaaaaaaaaaaaaaaaaaGN                                            aaaaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 481 + "'", int2 == 481);
    }

    @Test
    public void test35239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest70.test35239");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.normalizeSpace("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaajaval#.#agn");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaajaval#.#agn" + "'", str1, "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaajaval#.#agn");
    }

    @Test
    public void test35240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest70.test35240");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceChars("GNAL.AVAJLANG.JAVAGNAL.AVAJLANG.J", '.', 'a');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "GNALaAVAJLANGaJAVAGNALaAVAJLANGaJ" + "'", str3, "GNALaAVAJLANGaJAVAGNALaAVAJLANGaJ");
    }

    @Test
    public void test35241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest70.test35241");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.startsWith("interfacejava.lang.Cloneable.interfacejava.io.Serializable", "string.nal.avajecafretni");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test35242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest70.test35242");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.abbreviateMiddle("               ", "ARRAYLISTARRAYLISTARRAYLISTAVAJGNAL.AVAJLANG.JAVAGNAL.AVAJLANG.JAVAGNAL.AVAJLANG.JAVAGNAL.AVAJLANG.JAVAGNAL.AVAJLANG.JAVAGNAL.AVAJLANG.JAVAGNAL.AVAJLANG.JAVAGNAL.AVAJLANG.JAVAGNAL.AVAJGNAL                                                    ", 570);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "               " + "'", str3, "               ");
    }

    @Test
    public void test35243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest70.test35243");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.defaultIfBlank("EABLELANG.GNALJAVA.LANG", "Llitu...O.gn$l.$v$j ss$lcr4444444444444444444444444444444444444444444444444444444444444444444444444444444...O.                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "EABLELANG.GNALJAVA.LANG" + "'", str2, "EABLELANG.GNALJAVA.LANG");
    }

    @Test
    public void test35244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest70.test35244");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsAny("                                  aa", "lang.Stringclass j...                                                                                                                                                                                                                                                                                                                                                                                                                                                                                   ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test35245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest70.test35245");
        java.lang.ClassLoader classLoader0 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass3 = org.apache.commons.lang3.ClassUtils.getClass(classLoader0, "avajgnal", false);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassNotFoundException; message: avajgnal");
        } catch (java.lang.ClassNotFoundException e) {
            // Expected exception.
        }
    }

    @Test
    public void test35246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest70.test35246");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.mid("#############################", 96, 493);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test35247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest70.test35247");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("Jaavaaaaaaaaaavaa.alangavaa.alangjavaa.alangjavaa.alangjavaa.alangjavaa.alangjavaa.alangjavaa.alangjavaa.alangjavaa.alangjavaa.alangjavaa.alangjavaa.alangjavaa.alangjavaa.alangjavaa.alan                                                                                                                                                                                                                                                                                                                                                                                                ", "");
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test35248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest70.test35248");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.abbreviate("                                             ", 605);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                             " + "'", str2, "                                             ");
    }

    @Test
    public void test35249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest70.test35249");
        java.lang.CharSequence charSequence3 = null;
        char[] charArray12 = new char[] { ' ', ' ', '#', 'a', '4', 'a' };
        int int13 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "", charArray12);
        boolean boolean14 = org.apache.commons.lang3.StringUtils.containsAny("......", charArray12);
        boolean boolean15 = org.apache.commons.lang3.StringUtils.containsOnly(charSequence3, charArray12);
        boolean boolean16 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "AtsiLytcejbO.gnal.avaj ssalcrrAtsiLytcejbO.gnal.avaj ssalcrrAva.langGNAL..langjava.langAGNAL.AVAJ", charArray12);
        int int17 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "JAVA.UTIL.", charArray12);
        int int18 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "..$$$$$$$$$$$$$$$$$$$$$$$$$$$$$.....", charArray12);
        java.lang.Class<?> wildcardClass19 = charArray12.getClass();
        org.junit.Assert.assertNotNull(charArray12);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray12), "  #a4a");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray12), "  #a4a");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray12), "[ ,  , #, a, 4, a]");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test35250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest70.test35250");
        java.lang.String str2 = org.apache.commons.lang3.ClassUtils.getPackageName((java.lang.Object) "$$$$$$$$$$$$$$$$$$$$$$$$$$$$$...                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                               ", "A..ayLA..................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "java.lang" + "'", str2, "java.lang");
    }

    @Test
    public void test35251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest70.test35251");
        java.lang.String[] strArray5 = new java.lang.String[] { "                                   " };
        java.lang.String str6 = org.apache.commons.lang3.StringUtils.getCommonPrefix(strArray5);
        int int7 = org.apache.commons.lang3.StringUtils.indexOfAny("", strArray5);
        boolean boolean8 = org.apache.commons.lang3.StringUtils.endsWithAny("INTEGER", strArray5);
        java.lang.String[] strArray11 = org.apache.commons.lang3.StringUtils.split("", "... AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA... AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA... AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA... AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA... AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA... AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA... AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA... AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA... AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA... AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA");
        java.lang.String str12 = org.apache.commons.lang3.StringUtils.replaceEach("44444444444444444.444444444444444444...                                 44444444444444444.444444444444444444...                                 44444$        ", strArray5, strArray11);
        boolean boolean13 = org.apache.commons.lang3.StringUtils.endsWithAny("                                                                                                                                                                                                                                                                                                                                                                                                                                        javaulangrraylist                       javaulangrraylist                                                                                                                                                                                                                                                                                                                                                                                                                            ", strArray5);
        java.lang.String[] strArray15 = org.apache.commons.lang3.StringUtils.stripAll(strArray5, "         util          ");
        int int16 = org.apache.commons.lang3.StringUtils.indexOfDifference((java.lang.CharSequence[]) strArray5);
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "                                   " + "'", str6, "                                   ");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "44444444444444444.444444444444444444...                                 44444444444444444.444444444444444444...                                 44444$        " + "'", str12, "44444444444444444.444444444444444444...                                 44444444444444444.444444444444444444...                                 44444$        ");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(strArray15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
    }

    @Test
    public void test35252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest70.test35252");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass2 = org.apache.commons.lang3.ClassUtils.getClass("arralitu.avajlitu.ava", true);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassNotFoundException; message: arralitu.avajlitu.ava");
        } catch (java.lang.ClassNotFoundException e) {
            // Expected exception.
        }
    }

    @Test
    public void test35253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest70.test35253");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.leftPad("aaaaaa...interface java.lang.Cloneable.......java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........javainterface java.io.Serializableinterface java.lang.Cloneable.......java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........ja", 659);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "aaaaaa...interface java.lang.Cloneable.......java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........javainterface java.io.Serializableinterface java.lang.Cloneable.......java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........ja" + "'", str2, "aaaaaa...interface java.lang.Cloneable.......java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........javainterface java.io.Serializableinterface java.lang.Cloneable.......java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........ja");
    }

    @Test
    public void test35254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest70.test35254");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substring("                        L.ArryList", 262);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test35255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest70.test35255");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphanumeric((java.lang.CharSequence) "interface java.lang.Cloneable...                                 interface java.io.Serializable");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test35256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest70.test35256");
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.replace("", "#################################################################################################################################irfco$irfiosriiz", "...............................................................................................................................................................................................................................HI!aRRAYlISTaRRAYlISTaRRAYlISTAVAJ.GNALaRRAYlISTaRRAYlISTaRRAYlISTAVAJ...............................................................................................................................................................................................................................", 63);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
    }

    @Test
    public void test35257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest70.test35257");
        java.lang.CharSequence charSequence2 = org.apache.commons.lang3.StringUtils.defaultIfBlank((java.lang.CharSequence) "                                   #", (java.lang.CharSequence) "CLASSjava.langAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAulang");
        org.junit.Assert.assertEquals("'" + charSequence2 + "' != '" + "                                   #" + "'", charSequence2, "                                   #");
    }

    @Test
    public void test35258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest70.test35258");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.contains("INTERFACE JAVA.LANG.cLONEABLEa RRR RRR RRR RRR RRR RRR RRR RRR RNAL....................INTERFACE JAVA.LAN", 9);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test35259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest70.test35259");
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
        java.lang.String str67 = org.apache.commons.lang3.ClassUtils.getPackageName((java.lang.Object) wildcardClassArray63, "ang                                                                                             ");
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
        org.junit.Assert.assertEquals("'" + str67 + "' != '" + "java.lang" + "'", str67, "java.lang");
    }

    @Test
    public void test35260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest70.test35260");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.upperCase("                                                                                                                                                                                                                                                                                                                                                          javal#.#agn       aaaaaaaaaaaaaaaaaaaaaaaaa                                                                                                                                                                                                                                                                                                                                                         ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "                                                                                                                                                                                                                                                                                                                                                          JAVAL#.#AGN       AAAAAAAAAAAAAAAAAAAAAAAAA                                                                                                                                                                                                                                                                                                                                                         " + "'", str1, "                                                                                                                                                                                                                                                                                                                                                          JAVAL#.#AGN       AAAAAAAAAAAAAAAAAAAAAAAAA                                                                                                                                                                                                                                                                                                                                                         ");
    }

    @Test
    public void test35261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest70.test35261");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitByCharacterType("############################...");
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test35262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest70.test35262");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("LLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLyAAA.", "gnal#.#avajgnal#..#LAN#Ggnal#.#avajgnal#.");
        java.lang.String str4 = org.apache.commons.lang3.ClassUtils.getShortClassName((java.lang.Object) strArray2, "Booleaninterface java.lang.CloneableLANG.GNALJAVA.LANGAVAJ.GNALJAVA.LANGAVAJ.GNALJAVA.LANGAVAJ.GNALJAVA.LANGAVAJ.GNALJAVA.LANGAVAJ.GNALJAVA.LANGAVAJ.GNALJAVA.LANGAVAJ.GNALJAVA.LANGAVAJ.JAVAinterface java.io.Serializable");
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "String[]" + "'", str4, "String[]");
    }

    @Test
    public void test35263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest70.test35263");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlpha((java.lang.CharSequence) "A..ayL A##############");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test35264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest70.test35264");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.split("arralitu.avajlitu.avaj", "aaaaaa...");
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.concat((java.lang.Object[]) strArray3);
        java.lang.String str5 = org.apache.commons.lang3.StringUtils.concatWith("UTILsTRING.UTILsTRING-1JAVA.-1JAVA", (java.lang.Object[]) strArray3);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "rrlituvjlituvj" + "'", str4, "rrlituvjlituvj");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "rrUTILsTRING.UTILsTRING-1JAVA.-1JAVAlituUTILsTRING.UTILsTRING-1JAVA.-1JAVAvUTILsTRING.UTILsTRING-1JAVA.-1JAVAjlituUTILsTRING.UTILsTRING-1JAVA.-1JAVAvUTILsTRING.UTILsTRING-1JAVA.-1JAVAj" + "'", str5, "rrUTILsTRING.UTILsTRING-1JAVA.-1JAVAlituUTILsTRING.UTILsTRING-1JAVA.-1JAVAvUTILsTRING.UTILsTRING-1JAVA.-1JAVAjlituUTILsTRING.UTILsTRING-1JAVA.-1JAVAvUTILsTRING.UTILsTRING-1JAVA.-1JAVAj");
    }

    @Test
    public void test35265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest70.test35265");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripToEmpty("                                                                                                                                                                                                                                                                                                        Interface java.lang.Cloneablehi!arr..interface java.io.Serializable                                                                                                                                                                                                                                                                                                         ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Interface java.lang.Cloneablehi!arr..interface java.io.Serializable" + "'", str1, "Interface java.lang.Cloneablehi!arr..interface java.io.Serializable");
    }

    @Test
    public void test35266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest70.test35266");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.startsWithIgnoreCase("AAAAAAAAAAngalavajAAAAAAAAAAngalavajAAAAAAAAAAngalavajAAAAAAAAAAngalavajAAAAAAAAAAngalavajAAAAAAAAAAngalavajAAAAAAAAAAngalavajAAAAAAAAAAngalavajAAAAAAAAAAngalavajAAAAAAAAAAngalavajAAAAAAAAAAngalavajAAAAAAAAAAngalavajAAAAAAAAAAngalavajAAAAAAAAAAngalavajAAAAAAAAAAngalavajAAAAAAAAAAngalavajAAAAAAAAAAngalavajAAAAAAAAAAngalavajAAAAAAAAAAngalavajAAAAAAAAAAngalavajAAAAAAAAAAngalavajAAAAAAAAAAngalavajAAAAAAAAAAngalavajAAAAAAAAAAngalavajAAAAAAAAAAngalavajAAAAAAAAAAngalavajAAAAAAAAAAngalavajAAAAAAAAAAngalavajAAAAAAAAAAngalavajAAAAAAAAAAngalavajAAAAAAAAAAngalavajAAAAAAAAAAngalavajAAAAAAAAAAngalavajAAAAAAAAAAngalavajAAAAAAAAAAngalavajAAAAAAAAAA][gnirtSlitu.avaj1-][gnirtSlitu.avaj1-                                                                                   ", "###################################################################################################################################################################################################################################################################################################################################################################################################################################################################################..........a");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test35267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest70.test35267");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripToEmpty("ITULLITUL                                                                                                                                                                                                                           ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "ITULLITUL" + "'", str1, "ITULLITUL");
    }

    @Test
    public void test35268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest70.test35268");
        int int2 = org.apache.commons.lang3.StringUtils.indexOf("     object      ", (int) (byte) 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test35269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest70.test35269");
        java.lang.CharSequence charSequence2 = null;
        char[] charArray12 = new char[] { ' ', ' ', '#', 'a', '4', 'a' };
        int int13 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "", charArray12);
        boolean boolean14 = org.apache.commons.lang3.StringUtils.containsAny("......", charArray12);
        boolean boolean15 = org.apache.commons.lang3.StringUtils.containsAny("                                                                                                    ", charArray12);
        int int16 = org.apache.commons.lang3.StringUtils.indexOfAny(charSequence2, charArray12);
        int int17 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "###########################VA.LANGAVAJ.GNALJAVA.LANGAVAJ.GNALJAVA.LANGAVAJ.GNALJAVA.LANGAVAJ.GNALJAVA.LANGAVAJ.GNALJAVA.LANG###########################", charArray12);
        boolean boolean18 = org.apache.commons.lang3.StringUtils.containsAny("G.JAVAGNAL.AVAJLANG.J", charArray12);
        org.junit.Assert.assertNotNull(charArray12);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray12), "  #a4a");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray12), "  #a4a");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray12), "[ ,  , #, a, 4, a]");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test35270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest70.test35270");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trimToEmpty("ITULLITUL                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                   ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "ITULLITUL" + "'", str1, "ITULLITUL");
    }

    @Test
    public void test35271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest70.test35271");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeEnd("GNIRTS.GNAL.AVAJ SSALC", "-1JAVA.UTILsTRING[]    ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "GNIRTS.GNAL.AVAJ SSALC" + "'", str2, "GNIRTS.GNAL.AVAJ SSALC");
    }

    @Test
    public void test35272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest70.test35272");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.equals((java.lang.CharSequence) "####################################.AARRAYALISTAARRAYALISTAARRAYALISTAARRAYALIS#####################################", (java.lang.CharSequence) "lang");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test35273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest70.test35273");
        java.lang.CharSequence charSequence1 = null;
        java.lang.CharSequence charSequence2 = org.apache.commons.lang3.StringUtils.defaultIfEmpty((java.lang.CharSequence) "...aaaaaaaaaaaaaaaaaaaaaaaaaa..", charSequence1);
        org.junit.Assert.assertEquals("'" + charSequence2 + "' != '" + "...aaaaaaaaaaaaaaaaaaaaaaaaaa.." + "'", charSequence2, "...aaaaaaaaaaaaaaaaaaaaaaaaaa..");
    }

    @Test
    public void test35274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest70.test35274");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.leftPad("........................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................INTERFACE JAVA.LANG.cLONEABLE4INTERFACE JAVA.IO.sERIALIZABL", 893);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                                                                                                                                                                                                          ........................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................INTERFACE JAVA.LANG.cLONEABLE4INTERFACE JAVA.IO.sERIALIZABL" + "'", str2, "                                                                                                                                                                                                                          ........................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................INTERFACE JAVA.LANG.cLONEABLE4INTERFACE JAVA.IO.sERIALIZABL");
    }

    @Test
    public void test35275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest70.test35275");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.split("interfacejava.lang.Cloneableinterfacejava.lang.Cloneable.......java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........javainterfacejava.io.Serializableinterfacejava.io.Serializable", "rLLryLiyyALLryLiyyALLryLiyyrrrALrAriiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiii");
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test35276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest70.test35276");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripToNull("                                                                                                                                                                                                                             aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa                                                                                                                                                                                                                             ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa" + "'", str1, "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
    }

    @Test
    public void test35277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest70.test35277");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.split("avalitu.", '$');
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test35278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest70.test35278");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.abbreviateMiddle("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaArrayLisArrayLisArrayLisArrayLisArra....................................................................................................aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaainterface java.lang.CloneableStringinterface java.io.Serializable", "...AJ..........AVAJ..........AVAJ..........AVAJ", 97);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "aaaaaaaaaaaaaaaaaaaaaaaaa...AJ..........AVAJ..........AVAJ..........AVAJface java.io.Serializable" + "'", str3, "aaaaaaaaaaaaaaaaaaaaaaaaa...AJ..........AVAJ..........AVAJ..........AVAJface java.io.Serializable");
    }

    @Test
    public void test35279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest70.test35279");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByCharacterType("JAVA");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.stripAll(strArray2);
        boolean boolean4 = org.apache.commons.lang3.StringUtils.startsWithAny("            ", strArray2);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test35280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest70.test35280");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeStartIgnoreCase("ngUtilsStringUtilsStringUtil", "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "ngUtilsStringUtilsStringUtil" + "'", str2, "ngUtilsStringUtilsStringUtil");
    }

    @Test
    public void test35281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest70.test35281");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceChars("                                   ", '.', ' ');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "                                   " + "'", str3, "                                   ");
    }

    @Test
    public void test35282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest70.test35282");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBetween("Llitu...O.gn$l.$v$j ss$lcr4444444444444444444444444444444444444444444444444444444444444444444444444444444...O.                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                ", "NG.Llit                                                                                                                                 ");
        org.junit.Assert.assertNull(str2);
    }

    @Test
    public void test35283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest70.test35283");
        int int3 = org.apache.commons.lang3.StringUtils.indexOf("                                                                  irfCo$irfioSrA..ayL A.444444444444444444444444444", 64, 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test35284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest70.test35284");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlpha((java.lang.CharSequence) "AVAJGNAL.AVAJGNAL.AVAJGNAL.AVAJGNAL.AVAJGNAL.AVAJGNAL.AVAJGNAL.AVAJGNAL.AVAJGNAL.AVAJ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test35285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest70.test35285");
        int int1 = org.apache.commons.lang3.StringUtils.length((java.lang.CharSequence) "$$$$$$$$$$$$$$$$$$$..");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 21 + "'", int1 == 21);
    }

    @Test
    public void test35286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest70.test35286");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.split("                                    java.utiljava.util                                    ", "classJAVA.LANGaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaULANG");
        java.lang.String[] strArray7 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("hi!", "java.lang", (int) '.');
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.getCommonPrefix(strArray7);
        java.lang.String str9 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray7);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str10 = org.apache.commons.lang3.StringUtils.replaceEachRepeatedly("aaaaaaaaaaaaaaaaaaaaaaaaaGN                                            aaaaaaaaaaaaaaaaaaaaaaaaaa", strArray3, strArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Search and Replace array lengths don't match: 7 vs 1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
    }

    @Test
    public void test35287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest70.test35287");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.rightPad("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaJAVAL AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAGNaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", 49, 'a');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaJAVAL AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAGNaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa" + "'", str3, "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaJAVAL AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAGNaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
    }

    @Test
    public void test35288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest70.test35288");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphanumeric((java.lang.CharSequence) "                                                                                                                                                                                                                                                  44444444444444444444-1java444444444444444444444                                                                                                                                                                                                                                                   ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test35289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest70.test35289");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.upperCase("aaaaaa...interface java.lang.Cloneable.......java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........javainterface java.io.Serializableinterface java.lang.Cloneable.......java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........ja");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "AAAAAA...INTERFACE JAVA.LANG.CLONEABLE.......JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVAINTERFACE JAVA.IO.SERIALIZABLEINTERFACE JAVA.LANG.CLONEABLE.......JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JA" + "'", str1, "AAAAAA...INTERFACE JAVA.LANG.CLONEABLE.......JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVAINTERFACE JAVA.IO.SERIALIZABLEINTERFACE JAVA.LANG.CLONEABLE.......JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JA");
    }

    @Test
    public void test35290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest70.test35290");
        java.lang.String str1 = org.apache.commons.lang3.ClassUtils.getShortCanonicalName("YARRATSILYARRATSILYARRA");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "YARRATSILYARRATSILYARRA" + "'", str1, "YARRATSILYARRATSILYARRA");
    }

    @Test
    public void test35291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest70.test35291");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByCharacterType("..........");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.stripAll(strArray2);
        int int4 = org.apache.commons.lang3.StringUtils.lastIndexOfAny("JAVA.UTILJAVA.UTILJAVA.UTILJAVA.UTILJAVA.UTILJAVA.UTILJAVA.UTILJAVA.UTILJAVA.UTILJAVA.UTILJAVA.UTILJAVA.UTILJAVA.UTILJAVA.UTILJAVA.UTILJAVA.UTILJAVA.UTILJAVA.UTILJAVA.UTILJAVA.UTILJAVA.UTILJAVA.UTILJAVA.UTILJAVA.UTILJAVA.UTILJAVA.UTILJAVA.UTILJAVA.UTILJAVA.UTILJAVA.UTILJAVA.UTILJAVA.UTIL", strArray2);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
    }

    @Test
    public void test35292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest70.test35292");
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
        java.lang.Class<?> wildcardClass31 = null;
        java.lang.Class[] classArray33 = new java.lang.Class[1];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray34 = (java.lang.Class<?>[]) classArray33;
        wildcardClassArray34[0] = wildcardClass31;
        java.lang.Class<?>[] wildcardClassArray37 = org.apache.commons.lang3.ClassUtils.primitivesToWrappers(wildcardClassArray34);
        java.lang.String[] strArray39 = new java.lang.String[] { "                                   " };
        java.lang.String str40 = org.apache.commons.lang3.StringUtils.getCommonPrefix(strArray39);
        java.lang.Class<?>[] wildcardClassArray41 = org.apache.commons.lang3.ClassUtils.toClass((java.lang.Object[]) strArray39);
        java.lang.Class<?> wildcardClass42 = null;
        java.lang.Class[] classArray44 = new java.lang.Class[1];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray45 = (java.lang.Class<?>[]) classArray44;
        wildcardClassArray45[0] = wildcardClass42;
        java.lang.Class<?>[] wildcardClassArray48 = org.apache.commons.lang3.ClassUtils.primitivesToWrappers(wildcardClassArray45);
        boolean boolean49 = org.apache.commons.lang3.ClassUtils.isAssignable(wildcardClassArray41, wildcardClassArray45);
        boolean boolean51 = org.apache.commons.lang3.ClassUtils.isAssignable(wildcardClassArray34, wildcardClassArray45, true);
        java.lang.Class<?> wildcardClass52 = null;
        java.lang.Class[] classArray54 = new java.lang.Class[1];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray55 = (java.lang.Class<?>[]) classArray54;
        wildcardClassArray55[0] = wildcardClass52;
        java.lang.Class[] classArray59 = new java.lang.Class[0];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray60 = (java.lang.Class<?>[]) classArray59;
        boolean boolean62 = org.apache.commons.lang3.ClassUtils.isAssignable(wildcardClassArray55, wildcardClassArray60, false);
        boolean boolean63 = org.apache.commons.lang3.ClassUtils.isAssignable(wildcardClassArray45, wildcardClassArray60);
        boolean boolean64 = org.apache.commons.lang3.ClassUtils.isAssignable(wildcardClassArray30, wildcardClassArray45);
        java.lang.String str65 = org.apache.commons.lang3.StringUtils.concat((java.lang.Object[]) wildcardClassArray45);
        java.lang.Class<?> wildcardClass66 = wildcardClassArray45.getClass();
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
        org.junit.Assert.assertNotNull(classArray33);
        org.junit.Assert.assertNotNull(wildcardClassArray34);
        org.junit.Assert.assertNotNull(wildcardClassArray37);
        org.junit.Assert.assertNotNull(strArray39);
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "                                   " + "'", str40, "                                   ");
        org.junit.Assert.assertNotNull(wildcardClassArray41);
        org.junit.Assert.assertNotNull(classArray44);
        org.junit.Assert.assertNotNull(wildcardClassArray45);
        org.junit.Assert.assertNotNull(wildcardClassArray48);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertNotNull(classArray54);
        org.junit.Assert.assertNotNull(wildcardClassArray55);
        org.junit.Assert.assertNotNull(classArray59);
        org.junit.Assert.assertNotNull(wildcardClassArray60);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + false + "'", boolean62 == false);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + false + "'", boolean63 == false);
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + false + "'", boolean64 == false);
        org.junit.Assert.assertEquals("'" + str65 + "' != '" + "" + "'", str65, "");
        org.junit.Assert.assertNotNull(wildcardClass66);
    }

    @Test
    public void test35293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest70.test35293");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replace("gn gnal.avajg", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaajaval...agn", "444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444interface java.lang.Cloneable4iGNIRTinterface java.lang");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "gn gnal.avajg" + "'", str3, "gn gnal.avajg");
    }

    @Test
    public void test35294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest70.test35294");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("java.lang$interface java.lang.Cloneable$interface java.io.Serializableinterface java.lang.Cloneable$interface java.io.Serializableinterface java.lang.Cl", "$$$$$$$$$$$$$$$$$$$$$$$$$$$$$...", 13);
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.concat((java.lang.Object[]) strArray3);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "java.lang$interface java.lang.Cloneable$interface java.io.Serializableinterface java.lang.Cloneable$interface java.io.Serializableinterface java.lang.Cl" + "'", str4, "java.lang$interface java.lang.Cloneable$interface java.io.Serializableinterface java.lang.Cloneable$interface java.io.Serializableinterface java.lang.Cl");
    }

    @Test
    public void test35295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest70.test35295");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replace(".......ja                                                                                                                                             ceaj v al ngaClone bleaaaaaaaj v aaaaaaaaaaj v aaaaaaaaaaj v aaaaaaaaaaj v aaaaaaaaaaj v aaaaaaaaaaj v aaaaaaaaaaj v aaaaaaaaaaj v aaaaaaaaaaj v aaaaaaaaaaj v aaaaaaaaaaj v aaaaaaaaaaj v aaaaaaaaaaj v aaaaaaaaaaj v aaaaaaaaaaj v aaaaaaaaaaj v aaaaaaaaaaj v aaaaaaaaaaj v aaaaaaaaaaj v aaaaaaaaaaj v aaaaaaaaaaj v aaaaaaaaaaj v aaaaaaaaaaj v aaaaaaaaaaj v aaaaaaaaaaj v aaaaaaaaaaj v aaaaaaaaaaj v aaaaaaaaaaj v aaaaaaaaaaj v aaaaaaaaaaj v aaaaaaaaaaj v aaaaaaaaaaj v aaaaaaaaaaj v aaaaaaaaaaj v aaaaaaaaaaj v interf ceaj v aioaSeri liz ble", "interface java.lang.Cloneable$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$interface java.io.Serializable                                ", "iNTERFACEJAVA.LANG.cLONEABLE.......JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVAINTERFACEJAVA.IO.sERIALIZABLE");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + ".......ja                                                                                                                                             ceaj v al ngaClone bleaaaaaaaj v aaaaaaaaaaj v aaaaaaaaaaj v aaaaaaaaaaj v aaaaaaaaaaj v aaaaaaaaaaj v aaaaaaaaaaj v aaaaaaaaaaj v aaaaaaaaaaj v aaaaaaaaaaj v aaaaaaaaaaj v aaaaaaaaaaj v aaaaaaaaaaj v aaaaaaaaaaj v aaaaaaaaaaj v aaaaaaaaaaj v aaaaaaaaaaj v aaaaaaaaaaj v aaaaaaaaaaj v aaaaaaaaaaj v aaaaaaaaaaj v aaaaaaaaaaj v aaaaaaaaaaj v aaaaaaaaaaj v aaaaaaaaaaj v aaaaaaaaaaj v aaaaaaaaaaj v aaaaaaaaaaj v aaaaaaaaaaj v aaaaaaaaaaj v aaaaaaaaaaj v aaaaaaaaaaj v aaaaaaaaaaj v aaaaaaaaaaj v aaaaaaaaaaj v interf ceaj v aioaSeri liz ble" + "'", str3, ".......ja                                                                                                                                             ceaj v al ngaClone bleaaaaaaaj v aaaaaaaaaaj v aaaaaaaaaaj v aaaaaaaaaaj v aaaaaaaaaaj v aaaaaaaaaaj v aaaaaaaaaaj v aaaaaaaaaaj v aaaaaaaaaaj v aaaaaaaaaaj v aaaaaaaaaaj v aaaaaaaaaaj v aaaaaaaaaaj v aaaaaaaaaaj v aaaaaaaaaaj v aaaaaaaaaaj v aaaaaaaaaaj v aaaaaaaaaaj v aaaaaaaaaaj v aaaaaaaaaaj v aaaaaaaaaaj v aaaaaaaaaaj v aaaaaaaaaaj v aaaaaaaaaaj v aaaaaaaaaaj v aaaaaaaaaaj v aaaaaaaaaaj v aaaaaaaaaaj v aaaaaaaaaaj v aaaaaaaaaaj v aaaaaaaaaaj v aaaaaaaaaaj v aaaaaaaaaaj v aaaaaaaaaaj v aaaaaaaaaaj v interf ceaj v aioaSeri liz ble");
    }

    @Test
    public void test35296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest70.test35296");
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
        java.lang.Class<?>[] wildcardClassArray21 = org.apache.commons.lang3.ClassUtils.toClass((java.lang.Object[]) wildcardClassArray3);
        java.lang.Class[] classArray23 = new java.lang.Class[0];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray24 = (java.lang.Class<?>[]) classArray23;
        java.lang.Class<?>[] wildcardClassArray25 = org.apache.commons.lang3.ClassUtils.primitivesToWrappers(wildcardClassArray24);
        java.lang.Class<?> wildcardClass26 = null;
        java.lang.Class[] classArray28 = new java.lang.Class[1];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray29 = (java.lang.Class<?>[]) classArray28;
        wildcardClassArray29[0] = wildcardClass26;
        java.lang.Class<?>[] wildcardClassArray32 = org.apache.commons.lang3.ClassUtils.primitivesToWrappers(wildcardClassArray29);
        boolean boolean34 = org.apache.commons.lang3.ClassUtils.isAssignable(wildcardClassArray24, wildcardClassArray29, true);
        java.lang.Class[] classArray36 = new java.lang.Class[0];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray37 = (java.lang.Class<?>[]) classArray36;
        java.lang.Class<?>[] wildcardClassArray38 = org.apache.commons.lang3.ClassUtils.primitivesToWrappers(wildcardClassArray37);
        java.lang.String str40 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) wildcardClassArray38, "...                                 ");
        boolean boolean41 = org.apache.commons.lang3.ClassUtils.isAssignable(wildcardClassArray29, wildcardClassArray38);
        boolean boolean43 = org.apache.commons.lang3.ClassUtils.isAssignable(wildcardClassArray3, wildcardClassArray38, false);
        java.lang.String[] strArray47 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("...       ", "hi!", (int) (byte) 0);
        java.lang.String str48 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray47);
        java.lang.Class<?>[] wildcardClassArray49 = org.apache.commons.lang3.ClassUtils.toClass((java.lang.Object[]) strArray47);
        java.lang.Class<?> wildcardClass50 = null;
        java.lang.Class[] classArray52 = new java.lang.Class[1];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray53 = (java.lang.Class<?>[]) classArray52;
        wildcardClassArray53[0] = wildcardClass50;
        java.lang.Class<?>[] wildcardClassArray56 = org.apache.commons.lang3.ClassUtils.primitivesToWrappers(wildcardClassArray53);
        java.lang.Class<?> wildcardClass57 = null;
        java.lang.Class[] classArray59 = new java.lang.Class[1];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray60 = (java.lang.Class<?>[]) classArray59;
        wildcardClassArray60[0] = wildcardClass57;
        java.lang.Class<?>[] wildcardClassArray63 = org.apache.commons.lang3.ClassUtils.primitivesToWrappers(wildcardClassArray60);
        java.lang.String[] strArray65 = new java.lang.String[] { "                                   " };
        java.lang.String str66 = org.apache.commons.lang3.StringUtils.getCommonPrefix(strArray65);
        java.lang.Class<?>[] wildcardClassArray67 = org.apache.commons.lang3.ClassUtils.toClass((java.lang.Object[]) strArray65);
        java.lang.Class<?> wildcardClass68 = null;
        java.lang.Class[] classArray70 = new java.lang.Class[1];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray71 = (java.lang.Class<?>[]) classArray70;
        wildcardClassArray71[0] = wildcardClass68;
        java.lang.Class<?>[] wildcardClassArray74 = org.apache.commons.lang3.ClassUtils.primitivesToWrappers(wildcardClassArray71);
        boolean boolean75 = org.apache.commons.lang3.ClassUtils.isAssignable(wildcardClassArray67, wildcardClassArray71);
        boolean boolean77 = org.apache.commons.lang3.ClassUtils.isAssignable(wildcardClassArray60, wildcardClassArray71, true);
        boolean boolean79 = org.apache.commons.lang3.ClassUtils.isAssignable(wildcardClassArray56, wildcardClassArray71, true);
        java.lang.String str81 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) wildcardClassArray71, 'a');
        java.lang.String str83 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) wildcardClassArray71, "JAVAsTRIN");
        boolean boolean85 = org.apache.commons.lang3.ClassUtils.isAssignable(wildcardClassArray49, wildcardClassArray71, false);
        java.lang.Class<?>[] wildcardClassArray86 = org.apache.commons.lang3.ClassUtils.wrappersToPrimitives(wildcardClassArray71);
        boolean boolean87 = org.apache.commons.lang3.ClassUtils.isAssignable(wildcardClassArray3, wildcardClassArray86);
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
        org.junit.Assert.assertNotNull(classArray23);
        org.junit.Assert.assertNotNull(wildcardClassArray24);
        org.junit.Assert.assertNotNull(wildcardClassArray25);
        org.junit.Assert.assertNotNull(classArray28);
        org.junit.Assert.assertNotNull(wildcardClassArray29);
        org.junit.Assert.assertNotNull(wildcardClassArray32);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertNotNull(classArray36);
        org.junit.Assert.assertNotNull(wildcardClassArray37);
        org.junit.Assert.assertNotNull(wildcardClassArray38);
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "" + "'", str40, "");
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertNotNull(strArray47);
        org.junit.Assert.assertEquals("'" + str48 + "' != '" + "...       " + "'", str48, "...       ");
        org.junit.Assert.assertNotNull(wildcardClassArray49);
        org.junit.Assert.assertNotNull(classArray52);
        org.junit.Assert.assertNotNull(wildcardClassArray53);
        org.junit.Assert.assertNotNull(wildcardClassArray56);
        org.junit.Assert.assertNotNull(classArray59);
        org.junit.Assert.assertNotNull(wildcardClassArray60);
        org.junit.Assert.assertNotNull(wildcardClassArray63);
        org.junit.Assert.assertNotNull(strArray65);
        org.junit.Assert.assertEquals("'" + str66 + "' != '" + "                                   " + "'", str66, "                                   ");
        org.junit.Assert.assertNotNull(wildcardClassArray67);
        org.junit.Assert.assertNotNull(classArray70);
        org.junit.Assert.assertNotNull(wildcardClassArray71);
        org.junit.Assert.assertNotNull(wildcardClassArray74);
        org.junit.Assert.assertTrue("'" + boolean75 + "' != '" + false + "'", boolean75 == false);
        org.junit.Assert.assertTrue("'" + boolean77 + "' != '" + false + "'", boolean77 == false);
        org.junit.Assert.assertTrue("'" + boolean79 + "' != '" + false + "'", boolean79 == false);
        org.junit.Assert.assertEquals("'" + str81 + "' != '" + "" + "'", str81, "");
        org.junit.Assert.assertEquals("'" + str83 + "' != '" + "" + "'", str83, "");
        org.junit.Assert.assertTrue("'" + boolean85 + "' != '" + false + "'", boolean85 == false);
        org.junit.Assert.assertNotNull(wildcardClassArray86);
        org.junit.Assert.assertTrue("'" + boolean87 + "' != '" + false + "'", boolean87 == false);
    }

    @Test
    public void test35297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest70.test35297");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.substringsBetween("                                                                           Javastring..                                                                          ", "#########################################################################     uti#########################################################################", "      AAAAAAAAAAAAAAAAAAA...");
        org.junit.Assert.assertNull(strArray3);
    }

    @Test
    public void test35298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest70.test35298");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNotEmpty((java.lang.CharSequence) "444       AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test35299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest70.test35299");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.difference("GNAL..aRRAY..lIST..aRRAY..lIST..aRRAY.", "##########################################################################Byte###########################################################################");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "##########################################################################Byte###########################################################################" + "'", str2, "##########################################################################Byte###########################################################################");
    }

    @Test
    public void test35300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest70.test35300");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("CloneableI");
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test35301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest70.test35301");
        java.lang.String str2 = org.apache.commons.lang3.ClassUtils.getPackageName((java.lang.Object) "AVAJ.GNAL......java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........javainterfacejava.io.Serializabl", "              A..iyL A    ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "java.lang" + "'", str2, "java.lang");
    }

    @Test
    public void test35302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest70.test35302");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.abbreviateMiddle("44444444444444444444444444444444444444444444444444444444444444444444444javaulang44444444444444444", "String", 413);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "44444444444444444444444444444444444444444444444444444444444444444444444javaulang44444444444444444" + "'", str3, "44444444444444444444444444444444444444444444444444444444444444444444444javaulang44444444444444444");
    }

    @Test
    public void test35303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest70.test35303");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.abbreviateMiddle("ULANGrrayList", "aaaaaaaautil", 193);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "ULANGrrayList" + "'", str3, "ULANGrrayList");
    }

    @Test
    public void test35304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest70.test35304");
        int int3 = org.apache.commons.lang3.StringUtils.indexOfIgnoreCase("hi!Array...", "Elb$zil$ireS.oi.$v$j#ec$fretniGNALUAVAJ#######################....................................................................elb$enolC.gn$l.$v$j#ec$fretni", 850);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test35305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest70.test35305");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBetween("INTERFACE JAVA.LANG.CLONEABLE... ... ... ... ... ... ... ... INTERFACE JAVA.IO.SERIALIZABLE", ".....");
        org.junit.Assert.assertNull(str2);
    }

    @Test
    public void test35306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest70.test35306");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "                                                                                                                                                                                                                               arjavaarrarjavaarrarjavaarrarjavaarrarjavaarrarjavaarrarjavaarrarjavaarrarjavaarrarjavaarrarjavaarrarjavaarrarjavaarrarjavaarrarjavaarrarjavaarrarjavaarrarjavaarrarjavaarrarjavaarrarjavaarrarjavaarrarjavaarrarjavaarrarjavaarrarjavaarrarjavaarrarjavaarrarjavaarrarjavaarrarjavaarrarjavaarrarjavaarrarjavaarrarjavaarrarjavaarrarjavaarrarjavaarrarjavaarrarjavaarrarjavaarrarjavaarrarjavaarrarjavaarrarjavaarrarjavaarrarjavaarrarjavaarrarjavaarrarjavaarrarjavaarrarjavaarrarjalass java.lang.string                                                                                                                                                                                                                               ", "$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$nterface java.lang.Cloneable.......java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........javainterface java.io.Serializable");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test35307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest70.test35307");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "jv..........jv..........jv..........jv..........jv..........jv..........jv..........jv..........jv..........jv..........jv..........jv..........jv..........jv..........jv..........jv..........jv..........jv..........jv..........jv..........jv..........jv..........jv..........jv..........jv..........jv..........jv..........jv..........jv..........jv..........jv..........jv..........jv..........jv..........jvinterfcejv.io", "44444444444444444gnaluavaj4444444444444444444444444444444444444444444444444444444444444444444444");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test35308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest70.test35308");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeStart(".aL.ArrayListgnal.aL.ArrayList", ".langjava.la...                                                                                                 ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + ".aL.ArrayListgnal.aL.ArrayList" + "'", str2, ".aL.ArrayListgnal.aL.ArrayList");
    }

    @Test
    public void test35309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest70.test35309");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.contains("a..AYl a.44444444444444444444444444                                 ", 838);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test35310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest70.test35310");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.uncapitalize((java.lang.CharSequence) "iLyarrAtsiLyarrAtsiLyarrAlang.javatsiLyarrAtsiLyarrAtsiLyarrA");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "iLyarrAtsiLyarrAtsiLyarrAlang.javatsiLyarrAtsiLyarrAtsiLyarrA" + "'", str1, "iLyarrAtsiLyarrAtsiLyarrAlang.javatsiLyarrAtsiLyarrAtsiLyarrA");
    }

    @Test
    public void test35311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest70.test35311");
        int int2 = org.apache.commons.lang3.StringUtils.countMatches("GNAL.AVAJLANG.JAVAGNAL.AVAJLANG.JAVAGNAL.AVAJLANG.JAVAGNAL.AVAJLANG.JAVAGNAL.AVAJLANG.JAVAGNAL.AVAJLANG.JAVAGNAL.AVAJLANG.JAVAGNAL.AVAJLANG.JAVAGNAL", "#########");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test35312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest70.test35312");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.equals((java.lang.CharSequence) ".................................................................................................................................................................................................................................JAVA.LANG                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                    .................................................................................................................................................................................................................................", (java.lang.CharSequence) "a$.lang.Stringclass java.lang.Stringclass java.lang.Stringclas.lang.Stringclass java.lang.Stringc");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test35313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest70.test35313");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNotBlank((java.lang.CharSequence) "avajssalcrrAtsiLytcejb");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test35314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest70.test35314");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("                                                                                                         ", "...                                                      assJAVA.LANGa                                                     Cl");
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test35315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest70.test35315");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBetween("                                                                                                                                                                                                              ...LANGAVAJ.GNALJAVA.LANGAVAJ.GNALJAVA.LANGAVAJ.GNALJAVA.LANG###########################                                                         ...", "interface java.lang.Cloneable44444444444444444444444444444444444444444444444444interface java.io.Serializable");
        org.junit.Assert.assertNull(str2);
    }

    @Test
    public void test35316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest70.test35316");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeStart("java.langjava.langjava.langjava.langjava.langjava", "saylavv");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "java.langjava.langjava.langjava.langjava.langjava" + "'", str2, "java.langjava.langjava.langjava.langjava.langjava");
    }

    @Test
    public void test35317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest70.test35317");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.abbreviateMiddle("444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444interface java.lang.Cloneable4iGNIRTinterface java.lang.Cloneable4i444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444", "hi!ArrayListArrayListArrayListavaj.... AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA... AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA... AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA... AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA... AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA... AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA... AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA... AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA... AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA... AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA", 146);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444interface java.lang.Cloneable4iGNIRTinterface java.lang.Cloneable4i444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444" + "'", str3, "444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444interface java.lang.Cloneable4iGNIRTinterface java.lang.Cloneable4i444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444");
    }

    @Test
    public void test35318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest70.test35318");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.swapCase("gnl$.$vj");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "GNL$.$VJ" + "'", str1, "GNL$.$VJ");
    }

    @Test
    public void test35319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest70.test35319");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.split("hi!ArrayListArrayListArrayListavaj", "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                        iRFCO.IRFIOSRIIZ", 929);
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.concat((java.lang.Object[]) strArray3);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "h!ArrayLstArrayLstArrayLstavaj" + "'", str4, "h!ArrayLstArrayLstArrayLstavaj");
    }

    @Test
    public void test35320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest70.test35320");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeStartIgnoreCase("                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                    java.langavaj.gnaljava.langavaj.gnaljava.langavaj.gnaljava.langavaj.gnaljava.langavaj.gnaljava.langavaj.gnaljava.langavaj.gnaljava.langavaj.gnaljava.lang", "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                    java.langavaj.gnaljava.langavaj.gnaljava.langavaj.gnaljava.langavaj.gnaljava.langavaj.gnaljava.langavaj.gnaljava.langavaj.gnaljava.langavaj.gnaljava.lang" + "'", str2, "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                    java.langavaj.gnaljava.langavaj.gnaljava.langavaj.gnaljava.langavaj.gnaljava.langavaj.gnaljava.langavaj.gnaljava.langavaj.gnaljava.langavaj.gnaljava.lang");
    }

    @Test
    public void test35321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest70.test35321");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("aaaaaaaaaaaaaaaaaaaaaaaaainterface java.lang.CloneableStringinterface java.io.Serializableaaaaaaaaaaaaaaaaaaaaaaaaa", "interfacejava.lang.Cloneable#interfacejava.i");
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test35322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest70.test35322");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.leftPad("", 735, 'a');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa" + "'", str3, "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
    }

    @Test
    public void test35323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest70.test35323");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substring("###############################A..yLA.44444444444444444444444444###############################", 181);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test35324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest70.test35324");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.split("rING-1JAVA.UTILsTRING");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOfAny("Lytcejb", strArray2);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test35325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest70.test35325");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsIgnoreCase("4444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444aaaaaaaaaava", "aaaaaaaaaaaaautilarraaaaaaaaaaaaaaa");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test35326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest70.test35326");
        char[] charArray9 = new char[] { '#', '4', '$', ' ' };
        int int10 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "$       ", charArray9);
        int int11 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA", charArray9);
        boolean boolean12 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "JAVA.UTILJAVA.UTILStringcJAVA.UTILJAVA.UTILStringcJAVA.UTILJAVA.UTILStringcJAVA.UTILJAVA.UTILStringcJAVA.UTILJAVA.UTILStringcJAVA.UTILJAVA.UTILStringcJAVA.UTILJAVA.UTILStringcJAVA.UTILJAVA.UTILStringcJAVA.UTILJAVA.UTILStringcJAVA.UTILJAVA.UTILStringcJAVA.UTILJAVA.UTILStringcJAVA.UTILJAVA.UTILStringcJAVA.UTILJAVA.UTILStringcJAVA.UTILJAVA.UTILStringcJAVA.UTILJAVA.UTILStringcJAVA.UTILJAVA.UTILStringcJAVA.UTILJAVA.UTILStringcJAVA.UTILJAVA.UTILStringcJAVA.UTILJAVA.UTILStringcJAVA.UTILJAVA.UTILStringcJAVA.UTILJAVA.UTILStringcJAVA.UTILJAVA.UTILStringcJAVA.UTILJAVA.UTIL", charArray9);
        boolean boolean13 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "java$.$lang", charArray9);
        boolean boolean14 = org.apache.commons.lang3.StringUtils.containsAny("4v4j.gn4lnAAAAAAAAAAj4v4l.4gnAAAAAAAAAAj4v4l.4gnAAAAAAAAAAj4v4l.4gnAAAAAAAAAAj4v4l.4gnAAAAAAAAAAj4v4l.4gnAAAAAAAAAAj4v4l.4gnAAAAAAAAAAj4v4l.4gnAAAAAAAAAAj4v4l.4gnAAAAAAAAAAj4v4l.4gnAAAAAAAAAAj4v4l.4gnAAAAAAAAAAj4v4l.4gnAAAAAAAAAAj4v4l.4gnAAAAAAAAAAj4v4l.4gnAAAAAAAAAAj4v4l.4gnAAAAAAAAAAj4v4l.4gnAAAAAAAAAAj4v4l.4gnAAAAAAAAAAj4v4l.4gnAAAAAAAAAAj4v4l.4gnAAAAAAAAAAj4v4l.4gnAAAAAAAAAAj4v4l.4gnAAAAAAAAAAj4v4l.4gnAAAAAAAAAAj4v4l.4gnAAAAAAAAAAj4v4l.4gnAAAAAAAAAAj4v4l.4gnAAAAAAAAAAj4v4l.4gnAAAAAAAAAAj4v4l.4gnAAAAAAAAAAj4v4l.4gnAAAAAAAAAAj4v4l.4gnAAAAAAAAAAj4v4l.4gnAAAAAAAAAAj4v4l.4gnAAAAAAAAAAj4v4l.4gnAAAAAAAAAAj4v4l.4gnAAAAAAAAAAj4v4l.4gnAAAAAAAAAAj4v4l.4gnAAAAAAAAAA", charArray9);
        org.junit.Assert.assertNotNull(charArray9);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray9), "#4$ ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray9), "#4$ ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray9), "[#, 4, $,  ]");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test35327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest70.test35327");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlpha((java.lang.CharSequence) "vvayLasavvayLasajavaulainterface java.lang.Cloneable4interface java.io.SerializablevvayLasavvayLasa.");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test35328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest70.test35328");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replace("Coebe$iterfce ioSeriizbe", "INTERFACE JAVA.LANG.CLONEABLEVAJINTERFACE JAVA.IO.SERIALIZABLE", "444444444444444444.44444444444444444iNTERFACE JAVA$LANG$cLONEABLE$$$$$$$JAVA$$$$$$$$$$JAVA$$$$$$$$$$JAVA$$$$$$$$$$JAVA$$$$$$$$$$JAVA$$$$$$$$$$JAVA$$$$$$$$$$JAVA$$$$$$$$$$JAVA$$$$$$$$$$JAVA$$$$$$$$$$JAVA");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Coebe$iterfce ioSeriizbe" + "'", str3, "Coebe$iterfce ioSeriizbe");
    }

    @Test
    public void test35329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest70.test35329");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.right(".langGNAL..langjava.langAGNAL.AVAJAAAAjGNALAAAAAjAAAAAAAAjAG", 61);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + ".langGNAL..langjava.langAGNAL.AVAJAAAAjGNALAAAAAjAAAAAAAAjAG" + "'", str2, ".langGNAL..langjava.langAGNAL.AVAJAAAAjGNALAAAAAjAAAAAAAAjAG");
    }

    @Test
    public void test35330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest70.test35330");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNumeric((java.lang.CharSequence) "                                                                                                                                                                                                                                             HI!aRRAYlISTaRRAYlISTaRRAYlISTAVAJ.GNALaRRAYlISTaRRAYlISTaRRAYlISTAVAJ                                                                                                                                                                                                                                              javaStrinSerializableSerializableSerializableSerialijavaStrinSerializableSerializableSerializableSerialijavaStrinSerializableSerializableSerializableSerialijavaStrinSerializableSerializableSerializableSerialijavaStrinSerializableSerializableSerializableSerialijavaStrinSerializableSerializableSerializableSerialijavaStrinSerializableSerializableSerializableSerialijavaStrinSerializableSerializable");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test35331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest70.test35331");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceOnce("..............................................................................................................................................................................................................................................................................................................................................................................................................................ArryList.................................................................................", "SILYARRA!IH$$$$$$$$", "lang.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.1aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaajava.1aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa.1aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa.1aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa.1aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa.1aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa.1aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa.1aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa.1aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa.hi!arraylistarraylistarraylistavaj");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "..............................................................................................................................................................................................................................................................................................................................................................................................................................ArryList................................................................................." + "'", str3, "..............................................................................................................................................................................................................................................................................................................................................................................................................................ArryList.................................................................................");
    }

    @Test
    public void test35332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest70.test35332");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsAny(".......ja", "g.g.g.g.g.g.g.g.g.g.g.g.g.g.g.g.g.g.AVAJ.GNALAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAIRFCO$IRFIOSRA..AYL A.444444444444444444444444444g.g.g.g.g.g.g");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test35333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest70.test35333");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("ArrayList", '4');
        java.lang.Class<?>[] wildcardClassArray3 = org.apache.commons.lang3.ClassUtils.toClass((java.lang.Object[]) strArray2);
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray2, '4', 136, 91);
        java.lang.String str9 = org.apache.commons.lang3.ClassUtils.getShortCanonicalName((java.lang.Object) str7, "                      Integer                       ");
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertNotNull(wildcardClassArray3);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "String" + "'", str9, "String");
    }

    @Test
    public void test35334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest70.test35334");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "Javalituavajlituavajjavalituavajlituavajjavalituavajlituavajjavalituavajlituavajjavalituavajlituavajjavalituavajlituavajjavalituavajlituavajjavalituavajlituavajjavalituavajlituavajjavalituavajlituavajjavalituavajlituavajjavalituavajlituavajjavalituavajlituavajjavalituavajlituavajjavalituavajlituavajjavalituavajlituavajjavalituavajlituavajjavalituavajlituavajjavalituavajlituavajjavalituavajlituavajjavalituavajlituavajjavalituavajlituavajjavalituavajlituavajjavalituavajlituavajjavalituavajlituavajjavalituavajlituavajjavalituavajlituavajjavalituavajlituavajjavalituavajlituavajjavalituavajlituavajjavalituavajlituavajjavalituavajlituavajjavalituavajlituavaj", "elbazilaireS.oi.avajecafretniAVAJ.JAVAGNAL.AVAJLANG.JAVAGNAL.AVAJLANG.JAVAGNAL.AVAJLANG.JAVAGNAL.AVAJLANG.JAVAGNAL.AVAJLANG.JAVAGNAL.AVAJLANG.JAVAGNAL.AVAJLANG.JAVAGNAL.AVAJLANG.GNALelbaenolC.gnal.avajecafretni");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test35335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest70.test35335");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphaSpace((java.lang.CharSequence) "                          javaulangrraylist   ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test35336() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest70.test35336");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.split("lass java.lang.String$ $ $ $ $ $ $ $ $ $ $ $ $ $ $ $ $ $ $ $", "GNALaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaagn", 155);
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void test35337() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest70.test35337");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeEndIgnoreCase("arjavaarrarjavaarrarjavaarrarjavaarrarjavaarrarjavaarrarjavaarrarjavaarrarjavaarrarjavaarrarjavaarrarjavaarrarjavaarrarjavaarrarjavaarrarjavaarrarjavaarrarjavaarrarjavaarrarjavaarrarjavaarrarjavaarrarjavaarrarjavaarrarjavaarrarjavaarrarjavaarrarjavaarrarjavaarrarjavaarrarjavaarrarjavaarrarjavaarrarjavaarrarjavaarrarjavaarrarjavaarrarjavaarrarjavaarrarjavaarrarjavaarrarjavaarrarjavaarrarjavaarrarjavaarrarjavaarrarjavaarrarjavaarrarjavaarrarjavaarrarjavaarrarjavaarrarjalass java.lang.string", "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "arjavaarrarjavaarrarjavaarrarjavaarrarjavaarrarjavaarrarjavaarrarjavaarrarjavaarrarjavaarrarjavaarrarjavaarrarjavaarrarjavaarrarjavaarrarjavaarrarjavaarrarjavaarrarjavaarrarjavaarrarjavaarrarjavaarrarjavaarrarjavaarrarjavaarrarjavaarrarjavaarrarjavaarrarjavaarrarjavaarrarjavaarrarjavaarrarjavaarrarjavaarrarjavaarrarjavaarrarjavaarrarjavaarrarjavaarrarjavaarrarjavaarrarjavaarrarjavaarrarjavaarrarjavaarrarjavaarrarjavaarrarjavaarrarjavaarrarjavaarrarjavaarrarjavaarrarjalass java.lang.string" + "'", str2, "arjavaarrarjavaarrarjavaarrarjavaarrarjavaarrarjavaarrarjavaarrarjavaarrarjavaarrarjavaarrarjavaarrarjavaarrarjavaarrarjavaarrarjavaarrarjavaarrarjavaarrarjavaarrarjavaarrarjavaarrarjavaarrarjavaarrarjavaarrarjavaarrarjavaarrarjavaarrarjavaarrarjavaarrarjavaarrarjavaarrarjavaarrarjavaarrarjavaarrarjavaarrarjavaarrarjavaarrarjavaarrarjavaarrarjavaarrarjavaarrarjavaarrarjavaarrarjavaarrarjavaarrarjavaarrarjavaarrarjavaarrarjavaarrarjavaarrarjavaarrarjavaarrarjavaarrarjalass java.lang.string");
    }

    @Test
    public void test35338() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest70.test35338");
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
        java.lang.Class<?>[] wildcardClassArray30 = org.apache.commons.lang3.ClassUtils.wrappersToPrimitives(wildcardClassArray27);
        java.lang.String str31 = org.apache.commons.lang3.StringUtils.concat((java.lang.Object[]) wildcardClassArray27);
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
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "class java.lang.String" + "'", str31, "class java.lang.String");
    }

    @Test
    public void test35339() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest70.test35339");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsAny("javal aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaagn", "...avagnal.avajlang.javagnal.avajlang.javagnal");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test35340() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest70.test35340");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isEmpty((java.lang.CharSequence) ".........ava..........java..........java....");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test35341() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest70.test35341");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("interface java.lang.Cloneable4interface java.io.Serializable");
        int int3 = org.apache.commons.lang3.StringUtils.indexOfAny("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaainterface java.lang.Cloneable... ... ... ... ... ... ... ... interface java.io.Serializableaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", strArray2);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 159 + "'", int3 == 159);
    }

    @Test
    public void test35342() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest70.test35342");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.rightPad("ssalc gnirtSagnalaavaj", 119, "aRRAYlISTaRRAYlISTaRRAYlISTAVAJAGNA");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "ssalc gnirtSagnalaavajaRRAYlISTaRRAYlISTaRRAYlISTAVAJAGNAaRRAYlISTaRRAYlISTaRRAYlISTAVAJAGNAaRRAYlISTaRRAYlISTaRRAYlIST" + "'", str3, "ssalc gnirtSagnalaavajaRRAYlISTaRRAYlISTaRRAYlISTAVAJAGNAaRRAYlISTaRRAYlISTaRRAYlISTAVAJAGNAaRRAYlISTaRRAYlISTaRRAYlIST");
    }

    @Test
    public void test35343() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest70.test35343");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitByCharacterTypeCamelCase("              Integer              ");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str5 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray1, ' ', 13, 832);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 13");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test35344() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest70.test35344");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.startsWithIgnoreCase("                                                                                                    ", "java.uti");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test35345() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest70.test35345");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.containsWhitespace("#                                             ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test35346() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest70.test35346");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.rightPad("a", 447);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "a                                                                                                                                                                                                                                                                                                                                                                                                                                                              " + "'", str2, "a                                                                                                                                                                                                                                                                                                                                                                                                                                                              ");
    }

    @Test
    public void test35347() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest70.test35347");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitByCharacterType("hi!ArrayListArrayListArrayListavaj.gnalArrayListArrayListArrayListavaj.gnalArrayListArrayLis");
        java.lang.String str3 = org.apache.commons.lang3.ClassUtils.getPackageCanonicalName((java.lang.Object) strArray1, "...aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa... aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa... aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa... aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa... aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa... aaaaaaaaaaaaaaaaaaaaaaaaaa...");
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "java.lang" + "'", str3, "java.lang");
    }

    @Test
    public void test35348() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest70.test35348");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.lowerCase("chaa[]");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "chaa[]" + "'", str1, "chaa[]");
    }

    @Test
    public void test35349() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest70.test35349");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeStart("rrayList rrayList rrayList rray$ArrayLis", "string              Integer                            Integ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "rrayList rrayList rrayList rray$ArrayLis" + "'", str2, "rrayList rrayList rrayList rray$ArrayLis");
    }

    @Test
    public void test35350() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest70.test35350");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.repeat("avajecaf", 18);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "avajecafavajecafavajecafavajecafavajecafavajecafavajecafavajecafavajecafavajecafavajecafavajecafavajecafavajecafavajecafavajecafavajecafavajecaf" + "'", str2, "avajecafavajecafavajecafavajecafavajecafavajecafavajecafavajecafavajecafavajecafavajecafavajecafavajecafavajecafavajecafavajecafavajecafavajecaf");
    }

    @Test
    public void test35351() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest70.test35351");
        int int3 = org.apache.commons.lang3.StringUtils.indexOf("J#v                                                              ", 918, 8);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test35352() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest70.test35352");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.center("444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444lituavajli", 380, "...java..........java..classjavalangClassJAVAULANGJAVAULANGJAVAULANGJAVAULANGJAVAULANGJAVAULANGJAVAULANGJAVAULANGJAVAULANGJAVAULANGJAVAULANGJAVAULANGJAVAULANGJAVAULANGJAVAULANGJAVAULANGJAVAULANGJAVAULANGJAVAULANGJAVAULANG$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "...java..........java..classjavalangClassJAVAULANGJAVAULANGJAVAULANGJAVAULANGJAVAULANGJAVAULANGJAVAULANGJAVAULANGJ444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444lituavajli...java..........java..classjavalangClassJAVAULANGJAVAULANGJAVAULANGJAVAULANGJAVAULANGJAVAULANGJAVAULANGJAVAULANGJA" + "'", str3, "...java..........java..classjavalangClassJAVAULANGJAVAULANGJAVAULANGJAVAULANGJAVAULANGJAVAULANGJAVAULANGJAVAULANGJ444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444lituavajli...java..........java..classjavalangClassJAVAULANGJAVAULANGJAVAULANGJAVAULANGJAVAULANGJAVAULANGJAVAULANGJAVAULANGJA");
    }

    @Test
    public void test35353() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest70.test35353");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.uncapitalize((java.lang.CharSequence) "A Lya..A                                      ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "a Lya..A                                      " + "'", str1, "a Lya..A                                      ");
    }

    @Test
    public void test35354() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest70.test35354");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByCharacterTypeCamelCase("AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA...AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA...AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA...AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA...AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA...AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA...AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA...AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA...AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA.....");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOfAny("IO                          ", strArray2);
        int int4 = org.apache.commons.lang3.StringUtils.indexOfDifference((java.lang.CharSequence[]) strArray2);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test35355() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest70.test35355");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.endsWith("                                                         irfSeriaCoSeria$SeriairfioSeriInterface java.lang.Cloneable             Character             interface java.io.SerializableirfSeriaCoSeria$SeriairfioSeria                                                                                                                                                                                                                                                                                                                                    ", "                                                                                                                                                                JAVA.LANGAgnal.avajgnal..LANGgnal.avArrclass java.lang.ObjectyListArrclass java.lang.ObjectyListA");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test35356() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest70.test35356");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.rightPad("clas", 10, "..........a       ..");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "clas......" + "'", str3, "clas......");
    }

    @Test
    public void test35357() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest70.test35357");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOf("                                                                                                                                                                                                                                                                                                                                                                                                                                                                                          javaaaaaaaaaa", (int) (short) -1, 1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test35358() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest70.test35358");
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("", "java.util");
        java.lang.String str5 = org.apache.commons.lang3.StringUtils.concatWith("AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA", (java.lang.Object[]) strArray4);
        int int6 = org.apache.commons.lang3.StringUtils.lastIndexOfAny("                                                                                                                                                                                      4444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444AAAAAAAAAA                                                                                                                                                                                      ", strArray4);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
    }

    @Test
    public void test35359() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest70.test35359");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.center("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa$$$$$$$$$$$$.$$$$$$$$$$avajssalcrrAtsiLytcejb$$$$$$$$$$$$.$$$$$$$$$$$", 954);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                                                                                                                                                                                                      aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa$$$$$$$$$$$$.$$$$$$$$$$avajssalcrrAtsiLytcejb$$$$$$$$$$$$.$$$$$$$$$$$                                                                                                                                                                                                                       " + "'", str2, "                                                                                                                                                                                                                      aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa$$$$$$$$$$$$.$$$$$$$$$$avajssalcrrAtsiLytcejb$$$$$$$$$$$$.$$$$$$$$$$$                                                                                                                                                                                                                       ");
    }

    @Test
    public void test35360() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest70.test35360");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOf("uu", "      ");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test35361() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest70.test35361");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.left("$$$$$$$$$$$$$JAVA.IO.SERIALIZABLE INTERFACE JAVA.LANG.CLONEABLE... INTERFACE$$$$$$$$$$$$$", 117);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "$$$$$$$$$$$$$JAVA.IO.SERIALIZABLE INTERFACE JAVA.LANG.CLONEABLE... INTERFACE$$$$$$$$$$$$$" + "'", str2, "$$$$$$$$$$$$$JAVA.IO.SERIALIZABLE INTERFACE JAVA.LANG.CLONEABLE... INTERFACE$$$$$$$$$$$$$");
    }

    @Test
    public void test35362() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest70.test35362");
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
        java.lang.String str33 = org.apache.commons.lang3.StringUtils.concat((java.lang.Object[]) wildcardClassArray31);
        java.lang.Class<?>[] wildcardClassArray34 = org.apache.commons.lang3.ClassUtils.wrappersToPrimitives(wildcardClassArray31);
        java.lang.Class<?>[] wildcardClassArray35 = org.apache.commons.lang3.ClassUtils.wrappersToPrimitives(wildcardClassArray34);
        java.lang.String[] strArray37 = org.apache.commons.lang3.StringUtils.splitByCharacterType("... AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA... AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA... AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA... AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA... AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA... AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA... AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA... AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA... AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA... AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA");
        java.lang.Class<?>[] wildcardClassArray38 = org.apache.commons.lang3.ClassUtils.toClass((java.lang.Object[]) strArray37);
        java.lang.Class<?>[] wildcardClassArray39 = org.apache.commons.lang3.ClassUtils.primitivesToWrappers(wildcardClassArray38);
        java.lang.Class<?>[] wildcardClassArray40 = org.apache.commons.lang3.ClassUtils.wrappersToPrimitives(wildcardClassArray39);
        java.lang.String[] strArray42 = new java.lang.String[] { "                                   " };
        java.lang.String str43 = org.apache.commons.lang3.StringUtils.getCommonPrefix(strArray42);
        java.lang.Class<?>[] wildcardClassArray44 = org.apache.commons.lang3.ClassUtils.toClass((java.lang.Object[]) strArray42);
        java.lang.Class<?> wildcardClass45 = null;
        java.lang.Class[] classArray47 = new java.lang.Class[1];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray48 = (java.lang.Class<?>[]) classArray47;
        wildcardClassArray48[0] = wildcardClass45;
        java.lang.Class<?>[] wildcardClassArray51 = org.apache.commons.lang3.ClassUtils.primitivesToWrappers(wildcardClassArray48);
        boolean boolean52 = org.apache.commons.lang3.ClassUtils.isAssignable(wildcardClassArray44, wildcardClassArray48);
        java.lang.String str56 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) wildcardClassArray48, "$", 18, (int) (byte) 1);
        java.lang.Class<?>[] wildcardClassArray57 = org.apache.commons.lang3.ClassUtils.primitivesToWrappers(wildcardClassArray48);
        java.lang.String str59 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) wildcardClassArray48, '$');
        boolean boolean61 = org.apache.commons.lang3.ClassUtils.isAssignable(wildcardClassArray40, wildcardClassArray48, true);
        boolean boolean63 = org.apache.commons.lang3.ClassUtils.isAssignable(wildcardClassArray34, wildcardClassArray48, false);
        java.lang.String str64 = org.apache.commons.lang3.StringUtils.concatWith("AAAAAAAAAAAAAAAAAAAjavaulangAAAAAAAAAAAAAAAAAAA", (java.lang.Object[]) wildcardClassArray34);
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
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "class java.lang.String" + "'", str33, "class java.lang.String");
        org.junit.Assert.assertNotNull(wildcardClassArray34);
        org.junit.Assert.assertNotNull(wildcardClassArray35);
        org.junit.Assert.assertNotNull(strArray37);
        org.junit.Assert.assertNotNull(wildcardClassArray38);
        org.junit.Assert.assertNotNull(wildcardClassArray39);
        org.junit.Assert.assertNotNull(wildcardClassArray40);
        org.junit.Assert.assertNotNull(strArray42);
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "                                   " + "'", str43, "                                   ");
        org.junit.Assert.assertNotNull(wildcardClassArray44);
        org.junit.Assert.assertNotNull(classArray47);
        org.junit.Assert.assertNotNull(wildcardClassArray48);
        org.junit.Assert.assertNotNull(wildcardClassArray51);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertEquals("'" + str56 + "' != '" + "" + "'", str56, "");
        org.junit.Assert.assertNotNull(wildcardClassArray57);
        org.junit.Assert.assertEquals("'" + str59 + "' != '" + "" + "'", str59, "");
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + false + "'", boolean61 == false);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + false + "'", boolean63 == false);
        org.junit.Assert.assertEquals("'" + str64 + "' != '" + "" + "'", str64, "");
    }

    @Test
    public void test35363() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest70.test35363");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isEmpty((java.lang.CharSequence) "irfCo.irfioSriiz");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test35364() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest70.test35364");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeStartIgnoreCase("AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA CharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterChara", "...VA.LANGAVAJ.GNALJAVA.LANGAVAJ.GNALJAVA.LANGAVAJ.GNALJAVA.LANGAVAJ.GNALJAVA.LANGAVAJ.GNALJAVA.LANG");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA CharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterChara" + "'", str2, "AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA CharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterChara");
    }

    @Test
    public void test35365() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest70.test35365");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.startsWithIgnoreCase("       AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA...       AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA...       AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA...       AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA...       AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA...       AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA...       AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA...       AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA...       AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA...       AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA", "hi!                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                   ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test35366() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest70.test35366");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.center("java..........java..........java...", 49, "              Integer                            Inte");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "       java..........java..........java...       " + "'", str3, "       java..........java..........java...       ");
    }

    @Test
    public void test35367() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest70.test35367");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.startsWithIgnoreCase("                                                                           ...       ....       .", "");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test35368() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest70.test35368");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.chop("                                                                                                                                                                                                                                             HI!aRRAYlISTaRRAYlISTaRRAYlISTAVAJ.GNALaRRAYlISTaRRAYlISTaRRAYlIST");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "                                                                                                                                                                                                                                             HI!aRRAYlISTaRRAYlISTaRRAYlISTAVAJ.GNALaRRAYlISTaRRAYlISTaRRAYlIS" + "'", str1, "                                                                                                                                                                                                                                             HI!aRRAYlISTaRRAYlISTaRRAYlISTAVAJ.GNALaRRAYlISTaRRAYlISTaRRAYlIS");
    }

    @Test
    public void test35369() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest70.test35369");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeEndIgnoreCase("Class[", "                                                                                                ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Class[" + "'", str2, "Class[");
    }

    @Test
    public void test35370() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest70.test35370");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.startsWithIgnoreCase(".lang.stringclass java.lang.stringclass java.lang.stringclas", "siLyarrA.La...");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test35371() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest70.test35371");
        java.lang.CharSequence charSequence2 = org.apache.commons.lang3.StringUtils.defaultIfBlank((java.lang.CharSequence) "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaclass java.lang.Stringaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", (java.lang.CharSequence) "Arrclass java......................VAgnal.avajgnal.avajgnal.avajgnal.avajgnal.avajgn");
        org.junit.Assert.assertEquals("'" + charSequence2 + "' != '" + "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaclass java.lang.Stringaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa" + "'", charSequence2, "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaclass java.lang.Stringaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
    }

    @Test
    public void test35372() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest70.test35372");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substring("OI.AVAJECAFRETNI#ELBAENOLc.GNAL.AVAJECAFRETNIsTRINGuTILSsTRINGuTILSsTRINGuTILSsTRINGuTILSsTRINGuTILSsTRINGuTILSsTRINGuTILSsTRINGuTILSsTRINGuTILSsTRINGuTILS", 479);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test35373() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest70.test35373");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "objec", "                                                                     $$$$$$$$$$$$..                                                                     ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test35374() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest70.test35374");
        char[] charArray12 = new char[] { ' ', ' ', '#', 'a', '4', 'a' };
        int int13 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "", charArray12);
        boolean boolean14 = org.apache.commons.lang3.StringUtils.containsAny("$", charArray12);
        int int15 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "", charArray12);
        boolean boolean16 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "...       AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA", charArray12);
        boolean boolean17 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "String[]", charArray12);
        boolean boolean18 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "                                                          va1j", charArray12);
        org.junit.Assert.assertNotNull(charArray12);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray12), "  #a4a");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray12), "  #a4a");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray12), "[ ,  , #, a, 4, a]");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test35375() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest70.test35375");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitByCharacterType("NTERFACEJAVA.LANG.cLONEABLE.......JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVAINTERFACEJAVA.IO.sERIALIZABLE");
        java.lang.String str3 = org.apache.commons.lang3.ClassUtils.getShortClassName((java.lang.Object) strArray1, "siLyarrA.La...");
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "String[]" + "'", str3, "String[]");
    }

    @Test
    public void test35376() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest70.test35376");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trimToNull("aaaaaaaa44444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "aaaaaaaa44444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444" + "'", str1, "aaaaaaaa44444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444");
    }

    @Test
    public void test35377() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest70.test35377");
        java.lang.CharSequence charSequence2 = org.apache.commons.lang3.StringUtils.defaultIfEmpty((java.lang.CharSequence) "LANGAgnal.avajgnal..LANGg", (java.lang.CharSequence) "iRFCO.IRFIOSRIIZ");
        org.junit.Assert.assertEquals("'" + charSequence2 + "' != '" + "LANGAgnal.avajgnal..LANGg" + "'", charSequence2, "LANGAgnal.avajgnal..LANGg");
    }

    @Test
    public void test35378() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest70.test35378");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.split("                                              ");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.stripAll(strArray1, "....................................................................                       javaulang");
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.stripAll(strArray1);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str8 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray4, "RFACE JAVA.LANG.CLONEA#                                   J.GNALJAVA.LANGAVAJ.GN                                                                                                                                                                                                                                                                                                                                                                                                                                                                      INTERFACE JAVALANGCLONEABLELANGGNALJAVALANGAVAJGNALJAVALANGAVAJGNALJAVALANGAVAJGNALJAVALANGAVAJGNALJAVALANGAVAJGNALJAVALANGAVAJGNALJAVALANGAVAJGNALJAVALANGAVAJJAVAINTERFACE JAVAIOSERIALIZABLE", 43, 173);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertNotNull(strArray4);
    }

    @Test
    public void test35379() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest70.test35379");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeStart("", "...rgnaluavajtutututututut...utiljava.");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test35380() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest70.test35380");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeStartIgnoreCase("", "4444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test35381() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest70.test35381");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "arrayListArrayListArrayListavaj.gnal                                                                                                                                         ", "err...eeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeee...eeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeee...eeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeee...eeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeee...eeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeee...eeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeee...eeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeee...eeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeee...eeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeee");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
    }

    @Test
    public void test35382() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest70.test35382");
        char[] charArray13 = new char[] { ' ', ' ', '#', 'a', '4', 'a' };
        int int14 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "", charArray13);
        boolean boolean15 = org.apache.commons.lang3.StringUtils.containsAny("$", charArray13);
        boolean boolean16 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "hi!ArrayListArrayListArrayListavajhhhh AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAhhh AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAhhh AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAhhh AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAhhh AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAhhh AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAhhh AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAhhh AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAhhh AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAhhh AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA", charArray13);
        int int17 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "$ArrayList", charArray13);
        boolean boolean18 = org.apache.commons.lang3.StringUtils.containsAny("arr... aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa... aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa... aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa... aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa... aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa... aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa... aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa... aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa... aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa... aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaylist", charArray13);
        boolean boolean19 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "VAJaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", charArray13);
        int int20 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "-1JAVA.UTILsTRING-1JAVA", charArray13);
        org.junit.Assert.assertNotNull(charArray13);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray13), "  #a4a");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray13), "  #a4a");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray13), "[ ,  , #, a, 4, a]");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 4 + "'", int17 == 4);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
    }

    @Test
    public void test35383() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest70.test35383");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceChars("gnaluAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAgnal", "Seria", "...l.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAA...");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "gn.luAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAgn.l" + "'", str3, "gn.luAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAgn.l");
    }

    @Test
    public void test35384() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest70.test35384");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeStart("interface java.lang.CloneableINTERFACE JAVA.LANG.CL...", "4444444444444CH.R.CTER4444444444444UTILSTRAYL A.A");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "interface java.lang.CloneableINTERFACE JAVA.LANG.CL..." + "'", str2, "interface java.lang.CloneableINTERFACE JAVA.LANG.CL...");
    }

    @Test
    public void test35385() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest70.test35385");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceOnce("avalitu.", "JAVA.LANGAVAJ.GNALJAVA.LANGAVAJ.GNALJAVA.LANGAVAJ.GNALJAVA.LANGAVAJ.GNALJAVA.LANGAVAJ.GNALJAVA.LANGAVAJ.GNALJAVA.LANGAVAJ.GNALJAVA.LANGAVAJ.GNALJAVA.LANG", "interface java.lang.Cloneable.............java..........java..........java..........java..........java..........java..........java..........java..........java..........java...........interface java.io.Serializable");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "avalitu." + "'", str3, "avalitu.");
    }

    @Test
    public void test35386() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest70.test35386");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("       ..............................", ' ');
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.stripAll(strArray2, "          ");
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertNotNull(strArray4);
    }

    @Test
    public void test35387() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest70.test35387");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripAccents((java.lang.CharSequence) "ayLisArrayLisArrayLisA");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "ayLisArrayLisArrayLisA" + "'", str1, "ayLisArrayLisArrayLisA");
    }

    @Test
    public void test35388() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest70.test35388");
        java.lang.CharSequence charSequence2 = org.apache.commons.lang3.StringUtils.defaultIfBlank((java.lang.CharSequence) "se...", (java.lang.CharSequence) "$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$JaaaaaaaaaaNGA.LAVAJaaaaaaaaaaNGA.LAVAJaaaaaaaaaaNGA.LAVAJaaaaaaaaaaNGA.LAVAJaaaaaaaaaaNLANG.JAVA$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$");
        org.junit.Assert.assertEquals("'" + charSequence2 + "' != '" + "se..." + "'", charSequence2, "se...");
    }

    @Test
    public void test35389() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest70.test35389");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceChars("LC.GNAL.AVAJ ECAFRETNIELBAZILAIRES.OI.AVAJ ECAFRETNI$ELBAENOLC.GNAL.AVAJ ECAFRETNIELBAZILAIRES.OI.AVAJ ECAFRETNI$ELBAENOLC.GNAL.AVAJ ECAFRETNI$GNAL.AVAJ", 'a', '4');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "LC.GNAL.AVAJ ECAFRETNIELBAZILAIRES.OI.AVAJ ECAFRETNI$ELBAENOLC.GNAL.AVAJ ECAFRETNIELBAZILAIRES.OI.AVAJ ECAFRETNI$ELBAENOLC.GNAL.AVAJ ECAFRETNI$GNAL.AVAJ" + "'", str3, "LC.GNAL.AVAJ ECAFRETNIELBAZILAIRES.OI.AVAJ ECAFRETNI$ELBAENOLC.GNAL.AVAJ ECAFRETNIELBAZILAIRES.OI.AVAJ ECAFRETNI$ELBAENOLC.GNAL.AVAJ ECAFRETNI$GNAL.AVAJ");
    }

    @Test
    public void test35390() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest70.test35390");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("class java.lang.Object", "$         ");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.stripAll(strArray2);
        java.lang.String str5 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray3, "avaj ssalc");
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "classavaj ssalcjava.lang.Object" + "'", str5, "classavaj ssalcjava.lang.Object");
    }

    @Test
    public void test35391() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest70.test35391");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.substringBetween(".........................................................................................................................................................................................................................................................................................................AIRFCO$IRFIOSRIIZCIRFCO$IRFIOSRIIZOBIRFCO$IRFIOSRIIZECIRFCO$IRFIOSRIIZL..........................................................................................................................................................................................................................................................................................................", "...stgnal.aL.ArrayList...aL.ArrayListgnal.aL.", "javajavastrinjavajavastrinjavajavast                                                                ");
        org.junit.Assert.assertNull(str3);
    }

    @Test
    public void test35392() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest70.test35392");
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("javal$agn", "a.lang.CloneableStringinterface java.io                          ", 2);
        int int5 = org.apache.commons.lang3.StringUtils.indexOfAny("$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$gnal$avaj$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$", strArray4);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
    }

    @Test
    public void test35393() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest70.test35393");
        char[] charArray1 = null;
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "INTERFACE JAVA.LANG.cLONEABLEa RRR RRR RRR RRR RRR RRR RRR RRR RNAL....................INTERFACE JAVA.LANG.cLONEABLEa RRR RRR RRR RRR RRR RRR RRR RRR R", charArray1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test35394() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest70.test35394");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.chomp("litulitulitulitulitul####litulitulitulitulitul                                               ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "litulitulitulitulitul####litulitulitulitulitul                                               " + "'", str1, "litulitulitulitulitul####litulitulitulitulitul                                               ");
    }

    @Test
    public void test35395() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest70.test35395");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.equalsIgnoreCase("", "$$$$$$$$$$$$$$$$$$$$$$$$$$$$$...$$$$$$$$$$$$$$$$$$$$$$$$$$$$$...$$$$$$$$$$$$$$$$$$$$$$$$$");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test35396() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest70.test35396");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsIgnoreCase("AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA       AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA       AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA       AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA       AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA       AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA       ", "tsiyarr.a.lantsiyarr.a.lantsiyarr.a.lantsiyarr.a.lantsiyarr.a.lantsiyarr.a.lantsiyarr.a.lantsiyarr.a");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test35397() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest70.test35397");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceOnce("interfaceajava.lang.Cloneablehi!arr..interfaceajava.io.Serializable", "ssalc gnirtS.gnal", "4444444444444444444444444444444444444444444444444444444444444444444444444444444rclassjava.lang.O..");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "interfaceajava.lang.Cloneablehi!arr..interfaceajava.io.Serializable" + "'", str3, "interfaceajava.lang.Cloneablehi!arr..interfaceajava.io.Serializable");
    }

    @Test
    public void test35398() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest70.test35398");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeEndIgnoreCase("-1j#v#.utilString-1j#v#.utilString", "                                                                         slitugnirtsslitugnirtsslitugnirtsslitugnirtssl                                                                          ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "-1j#v#.utilString-1j#v#.utilString" + "'", str2, "-1j#v#.utilString-1j#v#.utilString");
    }

    @Test
    public void test35399() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest70.test35399");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.substringBetween("...nAAAAAAAAAAjaval.agnAAAAAAAAAA...                                                            ", "ArrayListArrayListArrayListavaj.gnalAVAJ.GNALAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAACharacterCharacterCharacterCharacterclassjavalangClassJAVAULANGJAVAULANGJAVAULANGJAVAULANGJAVAULANGJAVAULANGJAVAULANGJAVAULANGJAVAULANGJAVAULANGJAVAULANGJAVAULANGJAVAULANGJAVAULANGJAVAULANGJAVAULANGJAVAULANGJAVAULANGJAVAULANGJAVAULANG$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$", "java..........java..........java...");
        org.junit.Assert.assertNull(str3);
    }

    @Test
    public void test35400() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest70.test35400");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfAnyBut("#rj#v##rr#rj#v##rr#rj#v##rr#rj#v##rr#rj#v##rr#rj#v##rr#rj#v##rr#rj#v##rr#rj#v##rr#rj#v##rr#rj#v##rr#rj#v##rr#rj#v##rr#rj#v##rr#rj#v##rr#rj#v##rr#rj#v##rr#rj#v##rr#rj#v##rr#rj#v##rr#rj#v##rr#rj#v##rr#rj#v##rr#rj#v##rr#rj#v##rr#rj#v##rr#rj#v##rr#rj#v##rr#rj#v##rr#rj#v##rr#rj#v##rr#rj#v##rr#rj#v##rr#rj#v##rr#rj#v##rr#rj#v##rr#rj#v##rr#rj#v##rr#rj#v##rr#rj#v##rr#rj#v##rr#rj#v##rr#rj#v##rr#rj#v##rr#rj#v##rr#rj#v##rr#rj#v##rr#rj#v##rr#rj#v##rr#rj#v##rr#rj#v##rr#rj#LASSJAVA#LANG#sTRING", "...L.AGNAAAAAAAAAA..");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test35401() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest70.test35401");
        java.lang.ClassLoader classLoader0 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass2 = org.apache.commons.lang3.ClassUtils.getClass(classLoader0, "interface java.lang.Cloneable... ... ... ... ... ... ... ... interface java.io.Serializable444444444444444444444444444444444444444444444444444444444444444");
            org.junit.Assert.fail("Expected exception of type java.lang.ClassNotFoundException; message: interfacejava/lang/Cloneable////////////////////////interfacejava/io/Serializable444444444444444444444444444444444444444444444444444444444444444");
        } catch (java.lang.ClassNotFoundException e) {
            // Expected exception.
        }
    }

    @Test
    public void test35402() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest70.test35402");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("                                   ", 'a');
        java.lang.Class<?>[] wildcardClassArray3 = org.apache.commons.lang3.ClassUtils.toClass((java.lang.Object[]) strArray2);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str7 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) wildcardClassArray3, "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaase...aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", 800, 838);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertNotNull(wildcardClassArray3);
    }

    @Test
    public void test35403() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest70.test35403");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsAny("hi!ArrayListArrayListArrayListavaj.... AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA... AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA... AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA... AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA... AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA... AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA... AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA... AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA... AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA... ", "GNALUAVAJGNALUAVAJGNALUAVAJGNALUAVAJGNALUAVAJGNALUAVAJGNALUAVAJGNALUAVAJGNALUAVAJGNALUAVAJGNALUAVAJGNALUAVAJGNALUAVAJGNALUAVAJGNALUAVAJGNALUAVAJGNALUAVAJGNALUAVAJGNALUAVAJGNALUAVAJSSALCGNALAVAJSSALC");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test35404() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest70.test35404");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.swapCase("44444444444444444.4..");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "44444444444444444.4.." + "'", str1, "44444444444444444.4..");
    }

    @Test
    public void test35405() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest70.test35405");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.split("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa                  ...                         ", "#agnaaaaaaaaGnal", 56);
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray3, "JAVAL AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAG", 662, 159);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
    }

    @Test
    public void test35406() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest70.test35406");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphanumericSpace((java.lang.CharSequence) "...#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RRYARRATSILYARRATSILYARRA");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test35407() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest70.test35407");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str3 = org.apache.commons.lang3.StringUtils.abbreviate("class java.lang.Class444444444444444444444444444444444444444444444444444444444444444444444444444", 231, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Minimum abbreviation width is 4");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test35408() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest70.test35408");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNumericSpace((java.lang.CharSequence) "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                    JAVA.LANGAVAJ.GNALJAVA.LANGAVAJ.GNALJAVA.LANGAVAJ.GNALJAVA.LANGAVAJ.GNALJAVA.LANGAVAJ.GNALJAVA.LANGAVAJ.GNALJAVA.LANGAVAJ.GNALJAVA.LANGAVAJ.GNALJAVA.LANG");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test35409() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest70.test35409");
        java.lang.String str1 = org.apache.commons.lang3.ClassUtils.getPackageCanonicalName("interfacejava.lang.CloneableRFACEJAVA.LANG.CLONEABLEinterfacejava.io.Serializable");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "interfacejava.lang.CloneableRFACEJAVA.LANG.CLONEABLEinterfacejava.io" + "'", str1, "interfacejava.lang.CloneableRFACEJAVA.LANG.CLONEABLEinterfacejava.io");
    }

    @Test
    public void test35410() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest70.test35410");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trimToEmpty(".......ja");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + ".......ja" + "'", str1, ".......ja");
    }

    @Test
    public void test35411() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest70.test35411");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitByCharacterType("loneable#interfacejava.io");
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test35412() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest70.test35412");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.swapCase("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa                                            .aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA                                            .AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA" + "'", str1, "AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA                                            .AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA");
    }

    @Test
    public void test35413() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest70.test35413");
        java.lang.CharSequence charSequence4 = null;
        char[] charArray13 = new char[] { ' ', ' ', '#', 'a', '4', 'a' };
        int int14 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "", charArray13);
        boolean boolean15 = org.apache.commons.lang3.StringUtils.containsAny("......", charArray13);
        boolean boolean16 = org.apache.commons.lang3.StringUtils.containsOnly(charSequence4, charArray13);
        boolean boolean17 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "AtsiLytcejbO.gnal.avaj ssalcrrAtsiLytcejbO.gnal.avaj ssalcrrAva.langGNAL..langjava.langAGNAL.AVAJ", charArray13);
        int int18 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "JAVA.UTIL.", charArray13);
        boolean boolean19 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "ArrayListArrayListArrayListavajagnal", charArray13);
        boolean boolean20 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "................................                       JAVAULANGinterface java.io.Serializable", charArray13);
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
    public void test35414() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest70.test35414");
        int int3 = org.apache.commons.lang3.StringUtils.lastOrdinalIndexOf("-1java.utilString[]", "############################################", 69);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test35415() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest70.test35415");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.equalsIgnoreCase("Aaaaaaaaaaaa                                                                            litulitulitulitulitul####litulitulitulitulitul", "");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test35416() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest70.test35416");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("litulitulitulitulitul####litulitulitulitulitul", "                       JAVAULANG", (int) (short) 1);
        java.lang.String[] strArray5 = org.apache.commons.lang3.StringUtils.stripAll(strArray3, "TSILYARRGNALUAVAJTSILYARRGNALUAVAJ");
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertNotNull(strArray5);
    }

    @Test
    public void test35417() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest70.test35417");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAllLowerCase((java.lang.CharSequence) "#############################################################...");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test35418() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest70.test35418");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOfIgnoreCase("44444444444444444444444444444444444444444444444444444444444444444444ssssssssss", "vvayLasavvayLasajavaulainterface java.lang.Cloneable4interface java.io.SerializablevvayLasavvayLasa.");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test35419() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest70.test35419");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAllUpperCase((java.lang.CharSequence) ".lang.Stringclass java.lang.Stringclass java.lang.Stringclas");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test35420() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest70.test35420");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("irtS", "nterface java.lang.CloneableAvaj.gnalinterface java.io.Serializablenterface java.lang.CloneableAvaj.gnalinterface java.io.Serializablenterface java.lang.CloneableAvaj.gnalinterface java.io.Serializablenterface java.lang.CloneableAvaj.gnalinterface java.io.Serializablenterface java.lang.CloneableAvaj.gnalinterface java.io.Serializablenterface java.lang.CloneableAvaj.gnalinterface java.io.Serializablenterface java.lang.CloneableAvaj.gnalinterface java.io.Serializablenterface java.lang.CloneableAvaj.gnalinterface java.io.Serializablenterface java.lang.CloneableAvaj.gnalinterface java.io.Serializablenterface java.lang.CloneableAvaj.gnalinterface java.io.Serializablenterface java.lang.CloneableAvaj.gnalinterface java.io.Serializablenterface java.lang.CloneableA...O.gnal.avaj ssalcr4444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444..........", 0);
        java.lang.Class<?>[] wildcardClassArray4 = org.apache.commons.lang3.ClassUtils.toClass((java.lang.Object[]) strArray3);
        java.lang.Class<?>[] wildcardClassArray5 = org.apache.commons.lang3.ClassUtils.primitivesToWrappers(wildcardClassArray4);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertNotNull(wildcardClassArray4);
        org.junit.Assert.assertNotNull(wildcardClassArray5);
    }

    @Test
    public void test35421() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest70.test35421");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphanumeric((java.lang.CharSequence) "                                                                                                                                                                                       rrlituvjlituvj                                                                                                                                                                                       ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test35422() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest70.test35422");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNumericSpace((java.lang.CharSequence) "interface java.lang.CloneableJ#v#.l#ngj#v#.l#ngj#v#.l#ngj#v#.l#ngj#v#.l#ngj#v#.l#ngj#v#.l#ngj#v#.l#ngj#v#.l#ngj#v#.l#ngj#v#.l#ngj#v#.l#ngj#v#.l#ngj#v#.l#ngj#v#.l#ngj#v#.l#ngj#v#.l#ngj#v#.l#ngj#v#.l#ngj#v#.l#ngj#v#.l#ngj#v#.l#ngj#v#.l#ngj#v#.l#ngj#v#.l#ngj#v#.l#ngj#v#.l#ngj#v#.l#ngj#v#.l#ngj#v#.l#ngj#v#.l#ngj#v#.l#ngj#v#.l#nginterface java.io.Serializable");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test35423() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest70.test35423");
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("aaaaaaaaaa", "####");
        boolean boolean5 = org.apache.commons.lang3.StringUtils.startsWithAny("44444444444444444.444444444444444444", strArray4);
        java.lang.Class<?>[] wildcardClassArray6 = org.apache.commons.lang3.ClassUtils.toClass((java.lang.Object[]) strArray4);
        java.lang.String[] strArray9 = org.apache.commons.lang3.StringUtils.split("iNTERFACE JAVA.LANG.cLONEABLE.......JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVAINTERFACE JAVA.IO.sERIALIZABLE");
        boolean boolean10 = org.apache.commons.lang3.StringUtils.endsWithAny("aVAJ.GNALAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA       CharacterCharacterCharactegnal..Array..List..Array..List..Array..L.........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........CharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterChara", strArray9);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str11 = org.apache.commons.lang3.StringUtils.replaceEachRepeatedly("4444444string44444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444.ly..                                  $$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$                                  $$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$                                  $$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$                                  $$$$$$$$$$$$$$$$$$$$$$$44444444", strArray4, strArray9);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Search and Replace array lengths don't match: 1 vs 3");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(wildcardClassArray6);
        org.junit.Assert.assertNotNull(strArray9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test35424() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest70.test35424");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("                                                                                                                                                                                                                                                                                                                                                          javal . agn       aaaaaaaaaaaaaaaaaaaaaaaaa                                                                                                                                                                                                                                                                                                                                                          ", "uti");
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test35425() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest70.test35425");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("                       JAVAULANGrrayList", "String[]String[]StLlitung[]String[]String[]String[]String[]String[]");
        java.lang.String[] strArray5 = org.apache.commons.lang3.StringUtils.stripAll(strArray3, "Integer");
        java.lang.String str6 = org.apache.commons.lang3.StringUtils.concatWith("JAVAsTRINJAVAsTRINJA...", (java.lang.Object[]) strArray5);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "                       JAVAULANGrrayLis" + "'", str6, "                       JAVAULANGrrayLis");
    }

    @Test
    public void test35426() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest70.test35426");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "$A", "Aa..aayaLa aAa.a444444444444444444444444444");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test35427() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest70.test35427");
        java.lang.ClassLoader classLoader0 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass3 = org.apache.commons.lang3.ClassUtils.getClass(classLoader0, "AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA... AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA... AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA... AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA... AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA... AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA... AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA... AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA... AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA... ...ARRAYLISTARRAY", false);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassNotFoundException; message: AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA///AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA///AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA///AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA///AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA///AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA///AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA///AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA///AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA//////ARRAYLISTARRAY");
        } catch (java.lang.ClassNotFoundException e) {
            // Expected exception.
        }
    }

    @Test
    public void test35428() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest70.test35428");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.split("..", "");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.concat((java.lang.Object[]) strArray2);
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.getCommonPrefix(strArray2);
        java.lang.String[] strArray6 = org.apache.commons.lang3.StringUtils.stripAll(strArray2, "       aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + ".." + "'", str3, "..");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + ".." + "'", str4, "..");
        org.junit.Assert.assertNotNull(strArray6);
    }

    @Test
    public void test35429() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest70.test35429");
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("interface java.lang.CloneableI", "", 993);
        java.lang.String str5 = org.apache.commons.lang3.StringUtils.concatWith("                                Hi!ArrayLis       $         $         $         $         $         $         $         $         $         $         $         $         $         $         $         $         $         $         $         $         $         $         $                                ", (java.lang.Object[]) strArray4);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "interface                                Hi!ArrayLis       $         $         $         $         $         $         $         $         $         $         $         $         $         $         $         $         $         $         $         $         $         $         $                                java.lang.CloneableI" + "'", str5, "interface                                Hi!ArrayLis       $         $         $         $         $         $         $         $         $         $         $         $         $         $         $         $         $         $         $         $         $         $         $                                java.lang.CloneableI");
    }

    @Test
    public void test35430() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest70.test35430");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfDifference((java.lang.CharSequence) "                                                              erfacejava.lang.Cloneable#interfacejava.iointerfacejava.lang.Cloneable#interfacejava.iointerfacejava.la                                                               ", (java.lang.CharSequence) "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                    JAVA.LANGAVAJ.GNALJAVA.LANGAVAJ.GNALJAVA.LANGAVAJ.GNALJAVA.LANGAVAJ.GNALJAVA.LANGAVAJ.GNALJAVA.LANGAVAJ.GNALJAVA.LANGAVAJ.GNALJAVA.LANGAVAJ.GNALJAVA.LANG");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 62 + "'", int2 == 62);
    }

    @Test
    public void test35431() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest70.test35431");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444litu.avajlitu.avaj", "Arr... AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA... AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA... AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA... AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA... AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA... AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA... AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA... AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA... AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA... AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAyList");
        java.lang.Class<?>[] wildcardClassArray4 = org.apache.commons.lang3.ClassUtils.toClass((java.lang.Object[]) strArray3);
        java.lang.String[] strArray6 = org.apache.commons.lang3.StringUtils.splitByCharacterType("... AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA... AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA... AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA... AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA... AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA... AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA... AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA... AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA... AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA... AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA");
        java.lang.Class<?>[] wildcardClassArray7 = org.apache.commons.lang3.ClassUtils.toClass((java.lang.Object[]) strArray6);
        java.lang.Class<?>[] wildcardClassArray8 = org.apache.commons.lang3.ClassUtils.primitivesToWrappers(wildcardClassArray7);
        boolean boolean10 = org.apache.commons.lang3.ClassUtils.isAssignable(wildcardClassArray4, wildcardClassArray7, true);
        java.lang.String str11 = org.apache.commons.lang3.StringUtils.concatWith("interface#java.lang.Cloneable4interface#java.io.Serializableinterface#java.lang.Cloneable4interface#java.io.Serializableinterface#java.lang.Cloneable4interface#java.io.Serializableinterface#java.lang.Cloneable4interface#java.io.Serializableinterface#java.lang.Cloneable4interface#java.io.Serializableinterface#java.lang.Cloneable4interface#java.io.Serializableinterface#java.lang.Cloneable4interface#java.io.Serializableaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", (java.lang.Object[]) wildcardClassArray4);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str15 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) wildcardClassArray4, 'a', 0, 357);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertNotNull(wildcardClassArray4);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertNotNull(wildcardClassArray7);
        org.junit.Assert.assertNotNull(wildcardClassArray8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "class java.lang.String" + "'", str11, "class java.lang.String");
    }

    @Test
    public void test35432() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest70.test35432");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.center("", 119);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                                                                                                       " + "'", str2, "                                                                                                                       ");
    }

    @Test
    public void test35433() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest70.test35433");
        java.util.Locale locale1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.apache.commons.lang3.StringUtils.upperCase("java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java.........", locale1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test35434() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest70.test35434");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.lowerCase("                                Hi!ArrayLis       $         $         $         $         $         $         $         $         $         $         $         $         $         $         $         $         $         $         $         $         $         $         $                                ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "                                hi!arraylis       $         $         $         $         $         $         $         $         $         $         $         $         $         $         $         $         $         $         $         $         $         $         $                                " + "'", str1, "                                hi!arraylis       $         $         $         $         $         $         $         $         $         $         $         $         $         $         $         $         $         $         $         $         $         $         $                                ");
    }

    @Test
    public void test35435() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest70.test35435");
        java.lang.String str1 = org.apache.commons.lang3.ClassUtils.getPackageCanonicalName("langAGNALelbazilaireSelbazilaireSelbazilaireSelbazilaireSelbazilaireSelbazilaireSelbazilaireSelbazilaireSelbazilaireSelbazilaireSelbazilaireSelbazilaireSelbazilaireSelbazilaireSelbazilaireSelbazilaireSelbazilaireSelbazilaireSelbazilaireSelbazilaireSelbazilaireSelbazilaireSelbazilaireSelbazilaireSelbazilaireSelbazilaireSelbazilaireSelbazilaireSelbazilaireSelbazilaireSelbazilaireSelbazilaireSelbazilaireSe");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
    }

    @Test
    public void test35436() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest70.test35436");
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
        java.lang.Class<?>[] wildcardClassArray21 = org.apache.commons.lang3.ClassUtils.toClass((java.lang.Object[]) wildcardClassArray3);
        java.lang.Class<?>[] wildcardClassArray22 = org.apache.commons.lang3.ClassUtils.primitivesToWrappers(wildcardClassArray3);
        java.lang.String str24 = org.apache.commons.lang3.ClassUtils.getShortClassName((java.lang.Object) wildcardClassArray22, "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        java.lang.Class<?>[] wildcardClassArray25 = org.apache.commons.lang3.ClassUtils.primitivesToWrappers(wildcardClassArray22);
        java.lang.Class<?>[] wildcardClassArray26 = org.apache.commons.lang3.ClassUtils.primitivesToWrappers(wildcardClassArray25);
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
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "Class[]" + "'", str24, "Class[]");
        org.junit.Assert.assertNotNull(wildcardClassArray25);
        org.junit.Assert.assertNotNull(wildcardClassArray26);
    }

    @Test
    public void test35437() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest70.test35437");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.leftPad("Llitu...O.gnal.avaj ssalcr4444444444444444444444444444444444444444444444444444444444444444444444444444444...O.", 525, "#####A##ay...");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "#####A##ay...#####A##ay...#####A##ay...#####A##ay...#####A##ay...#####A##ay...#####A##ay...#####A##ay...#####A##ay...#####A##ay...#####A##ay...#####A##ay...#####A##ay...#####A##ay...#####A##ay...#####A##ay...#####A##ay...#####A##ay...#####A##ay...#####A##ay...#####A##ay...#####A##ay...#####A##ay...#####A##ay...#####A##ay...#####A##ay...#####A##ay...#####A##ay...#####A##ay...#####A##ay...#####A##ay...#####A##ay..Llitu...O.gnal.avaj ssalcr4444444444444444444444444444444444444444444444444444444444444444444444444444444...O." + "'", str3, "#####A##ay...#####A##ay...#####A##ay...#####A##ay...#####A##ay...#####A##ay...#####A##ay...#####A##ay...#####A##ay...#####A##ay...#####A##ay...#####A##ay...#####A##ay...#####A##ay...#####A##ay...#####A##ay...#####A##ay...#####A##ay...#####A##ay...#####A##ay...#####A##ay...#####A##ay...#####A##ay...#####A##ay...#####A##ay...#####A##ay...#####A##ay...#####A##ay...#####A##ay...#####A##ay...#####A##ay...#####A##ay..Llitu...O.gnal.avaj ssalcr4444444444444444444444444444444444444444444444444444444444444444444444444444444...O.");
    }

    @Test
    public void test35438() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest70.test35438");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass2 = org.apache.commons.lang3.ClassUtils.getClass("####################################.AaRRAYAlISTAaRRAYAlISTAaRRAYAlISTAaRRAYAlIS#####################################aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", false);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassNotFoundException; message: ####################################.AaRRAYAlISTAaRRAYAlISTAaRRAYAlISTAaRRAYAlIS#####################################aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        } catch (java.lang.ClassNotFoundException e) {
            // Expected exception.
        }
    }

    @Test
    public void test35439() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest70.test35439");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("nterface java.lang.cloneable....$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$galaa$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$", "INTERFA$", 42);
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void test35440() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest70.test35440");
        java.lang.String str1 = org.apache.commons.lang3.ClassUtils.getShortCanonicalName("aAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA...AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA...AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA...AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA...AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA...AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA...AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA...AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA...AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA.....");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
    }

    @Test
    public void test35441() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest70.test35441");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trimToNull("java.io.Serializableinterfacejava.lang.Cloneable..                                                                   ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "java.io.Serializableinterfacejava.lang.Cloneable.." + "'", str1, "java.io.Serializableinterfacejava.lang.Cloneable..");
    }

    @Test
    public void test35442() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest70.test35442");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringAfterLast("Array", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaVAJ.GNALaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaagn");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test35443() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest70.test35443");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.defaultIfEmpty(".........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........javainterface java.io", "....................................................................");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + ".........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........javainterface java.io" + "'", str2, ".........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........javainterface java.io");
    }

    @Test
    public void test35444() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest70.test35444");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.defaultString("444444.444444444444444444...44444444444444444.444444444444444444...44444$aenolc.gnaelbagaga.langagaga.langagaga.langagaga.langagaga.langagaga.langagaga.langagaga.langagaga.langagaga.langagaga.langagaga.langagaga.langagaga.langagaga.langagaga.langagaga.langagaga.langagaga.langagaga.langagaga.langagaga.langagaga.langagaga.langagaga.langagaga.langagaga.langagaga.langagaga.langagaga.langagaga.langagaga.langagaga.langagaga.langagaga.langafretnigniragecagaoi.aenolc.gnaelbagaga.langagaga.langagaga.langagaga.langagaga.langagaga.langagaga.langagaga.langagaga.langagaga.langagaga.langagaga.langagaga.langagaga.langagaga.langagaga.langagaga.langagaga.langagaga.langagaga.langagaga.langagaga.langagaga.langagaga.langagaga.langagaga.langagaga.langagaga.langagaga.langagaga.langagaga.langagaga.langagaga.langagaga.langagaga.langafretnigniragecagaoi.aenolc.gnaelb", "AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA...VAULANGJAVAULANGJAVAULANGJAVAULANGJAVAULANGStringUtilsStringUtilsStringUt");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "444444.444444444444444444...44444444444444444.444444444444444444...44444$aenolc.gnaelbagaga.langagaga.langagaga.langagaga.langagaga.langagaga.langagaga.langagaga.langagaga.langagaga.langagaga.langagaga.langagaga.langagaga.langagaga.langagaga.langagaga.langagaga.langagaga.langagaga.langagaga.langagaga.langagaga.langagaga.langagaga.langagaga.langagaga.langagaga.langagaga.langagaga.langagaga.langagaga.langagaga.langagaga.langagaga.langafretnigniragecagaoi.aenolc.gnaelbagaga.langagaga.langagaga.langagaga.langagaga.langagaga.langagaga.langagaga.langagaga.langagaga.langagaga.langagaga.langagaga.langagaga.langagaga.langagaga.langagaga.langagaga.langagaga.langagaga.langagaga.langagaga.langagaga.langagaga.langagaga.langagaga.langagaga.langagaga.langagaga.langagaga.langagaga.langagaga.langagaga.langagaga.langagaga.langafretnigniragecagaoi.aenolc.gnaelb" + "'", str2, "444444.444444444444444444...44444444444444444.444444444444444444...44444$aenolc.gnaelbagaga.langagaga.langagaga.langagaga.langagaga.langagaga.langagaga.langagaga.langagaga.langagaga.langagaga.langagaga.langagaga.langagaga.langagaga.langagaga.langagaga.langagaga.langagaga.langagaga.langagaga.langagaga.langagaga.langagaga.langagaga.langagaga.langagaga.langagaga.langagaga.langagaga.langagaga.langagaga.langagaga.langagaga.langagaga.langafretnigniragecagaoi.aenolc.gnaelbagaga.langagaga.langagaga.langagaga.langagaga.langagaga.langagaga.langagaga.langagaga.langagaga.langagaga.langagaga.langagaga.langagaga.langagaga.langagaga.langagaga.langagaga.langagaga.langagaga.langagaga.langagaga.langagaga.langagaga.langagaga.langagaga.langagaga.langagaga.langagaga.langagaga.langagaga.langagaga.langagaga.langagaga.langagaga.langafretnigniragecagaoi.aenolc.gnaelb");
    }

    @Test
    public void test35445() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest70.test35445");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trimToNull("                          a                                a  ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "a                                a" + "'", str1, "a                                a");
    }

    @Test
    public void test35446() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest70.test35446");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOf("444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444litu.avajli", 152, 219);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test35447() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest70.test35447");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trimToNull("TU                    ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "TU" + "'", str1, "TU");
    }

    @Test
    public void test35448() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest70.test35448");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.substringBetween("44444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444gnl$.$vj4444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444", "AVAJ.GNALAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA...L.AGNAAAAAAAAAA...", "char[]INTERFACEJAVA.LANG.cLONEABLEsTRINGINTERFACEJAVA.IO");
        org.junit.Assert.assertNull(str3);
    }

    @Test
    public void test35449() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest70.test35449");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeEndIgnoreCase("....................................................................................................................lang.javatsilyarratsilyarratsilyarra.....................................................................................................................", "java..........java...........");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "....................................................................................................................lang.javatsilyarratsilyarratsilyarra....................................................................................................................." + "'", str2, "....................................................................................................................lang.javatsilyarratsilyarratsilyarra.....................................................................................................................");
    }

    @Test
    public void test35450() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest70.test35450");
        java.lang.CharSequence charSequence0 = null;
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsNone(charSequence0, "#");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test35451() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest70.test35451");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAllUpperCase((java.lang.CharSequence) "                                     rgnaluavaj");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test35452() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest70.test35452");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.strip("LNuCctCctCctCctCctCctCctCctCctCctCctCctCctCctCctCctCctCctCctCctCctCctCctCct");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "LNuCctCctCctCctCctCctCctCctCctCctCctCctCctCctCctCctCctCctCctCctCctCctCctCct" + "'", str1, "LNuCctCctCctCctCctCctCctCctCctCctCctCctCctCctCctCctCctCctCctCctCctCctCctCct");
    }

    @Test
    public void test35453() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest70.test35453");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.endsWithIgnoreCase("                                                interface java.lang.CloneableStringinterface java.io", "javastring...");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test35454() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest70.test35454");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfAnyBut("                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                      sERIALIZABL                         ", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa                   GNAL.AVAJaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 918 + "'", int2 == 918);
    }

    @Test
    public void test35455() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest70.test35455");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.defaultString("jAVAAAAAAAAAAVA.LANG..va.langGNAL..la..                              ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "jAVAAAAAAAAAAVA.LANG..va.langGNAL..la..                              " + "'", str1, "jAVAAAAAAAAAAVA.LANG..va.langGNAL..la..                              ");
    }

    @Test
    public void test35456() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest70.test35456");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBefore("                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                            LANGH!IH!IH!IH!IH!IH!", "AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA       ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                            LANGH!IH!IH!IH!IH!IH!" + "'", str2, "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                            LANGH!IH!IH!IH!IH!IH!");
    }

    @Test
    public void test35457() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest70.test35457");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.split("$.$vj", "#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#lass java#lang#String");
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test35458() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest70.test35458");
        java.lang.ClassLoader classLoader0 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass2 = org.apache.commons.lang3.ClassUtils.getClass(classLoader0, "                                                                                                                                                               AAAAAAAAAAAAAAAAAAAgnaluavajAAAAAAAAAAAAAAAAAAA");
            org.junit.Assert.fail("Expected exception of type java.lang.ClassNotFoundException; message: AAAAAAAAAAAAAAAAAAAgnaluavajAAAAAAAAAAAAAAAAAAA");
        } catch (java.lang.ClassNotFoundException e) {
            // Expected exception.
        }
    }

    @Test
    public void test35459() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest70.test35459");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsIgnoreCase("J#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#lass java#lang#String", "       .");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test35460() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest70.test35460");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBetween("4444444                                                                                                                                                  ", "langaaaaa");
        org.junit.Assert.assertNull(str2);
    }

    @Test
    public void test35461() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest70.test35461");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphanumeric((java.lang.CharSequence) "...aaaaaaaaaaaaaaaaaaaaaaaaaa...");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test35462() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest70.test35462");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNotBlank((java.lang.CharSequence) "...ngagnaljRChahactaRChahactaRChahactaRChahactaRChahactaRChahacta");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test35463() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest70.test35463");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isBlank((java.lang.CharSequence) "blealiza.io.Seriavacejable#interfang.Clonea.lavacejainterf44444444444444444444444444444444444444444444444444aaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test35464() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest70.test35464");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.chomp("vaarrarjavaarrarjavaarr");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "vaarrarjavaarrarjavaarr" + "'", str1, "vaarrarjavaarrarjavaarr");
    }

    @Test
    public void test35465() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest70.test35465");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("interface java.lang.Cloneablegnal.avajgnal..LANGgnal.avajgnal.interface java.io.Serializable", "jAVA", 159);
        java.lang.Class<?>[] wildcardClassArray4 = org.apache.commons.lang3.ClassUtils.toClass((java.lang.Object[]) strArray3);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertNotNull(wildcardClassArray4);
    }

    @Test
    public void test35466() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest70.test35466");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.split("JAVA.UTILJAVA.UTILSTRINGCJAVA.UTILJAVA.UTILSTRINGCJAVA.UTILJAVA.UTILSTRINGCJAVA.UTILJAVA.UTILSTRINGCJAVA.UTILJAVA.UTILSTRINGCJAVA.UTILJAVA.UTILSTRINGCJAVA.UTILJAVA.UTILSTRINGCJAVA.UTILJAVA.UTILSTRINGCJAVA.UTILJAVA.UTILSTRINGCJAVA.UTILJAVA.UTILSTRINGCJAVA.UTILJAVA.UTILSTRINGCJAVA.UTILJAVA.UTILSTRINGCJAVA.UTILJAVA.UTILSTRINGCJAVA.UTILJAVA.UTILSTRINGCJAVA.UTILJAVA.UTILSTRINGCJAVA.UTILJAVA.UTILSTRINGCJAVA.UTILJAVA.UTILSTRINGCJAVA.UTILJAVA.UTILSTRINGCJAVA.UTILJAVA.UTILSTRINGCJAVA.UTILJAVA.UTILSTRINGCJAVA.UTILJAVA.UTILSTRINGCJAVA.UTILJAVA.UTILSTRINGCJAVA.UTILJAVA.UTIL", 'a');
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test35467() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest70.test35467");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("                                                                                                                                     .                                                                                                                                             ", "YlST");
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test35468() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest70.test35468");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.strip(".lnG");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + ".lnG" + "'", str1, ".lnG");
    }

    @Test
    public void test35469() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest70.test35469");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.left("arralitu.avajlitu.ava", 0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test35470() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest70.test35470");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOfIgnoreCase("siLyarrAtsiLyarrAtsiLyarrAtsiLyarrA.", "", 35);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 35 + "'", int3 == 35);
    }

    @Test
    public void test35471() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest70.test35471");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.contains("44444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444AVALITU", "interface java.lang.Cloneable4iGNIRTinterface java.lang.Cloneable4i");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test35472() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest70.test35472");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.repeat("", 938);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test35473() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest70.test35473");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceOnce("#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#lass java#lang#String", "AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#lass java#lang#String" + "'", str3, "#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#lass java#lang#String");
    }

    @Test
    public void test35474() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest70.test35474");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsIgnoreCase("jAVA.L$ArrayList", "                                                                       ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test35475() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest70.test35475");
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("                                                                                                                                                  4444444", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaVAJ.GNALaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaagn                                            ", 3);
        java.lang.String[] strArray10 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("tsiLyarrA.La.langtsiLyarrA.La.langtsiLyarrA.La.langtsiLyarrA.La.langtsiLyarrA.La.langtsiLyarrA.La.langtsiLyarrA.La.langtsiLyarrA.La.lang", "JAVA.LANG", 67);
        boolean boolean11 = org.apache.commons.lang3.StringUtils.endsWithAny("gnal.avajgnal..LANGgnal.avajgnal", strArray10);
        java.lang.String[] strArray14 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("string", '.');
        java.lang.String str15 = org.apache.commons.lang3.StringUtils.replaceEach("##javal#########################", strArray10, strArray14);
        java.lang.String str16 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray14);
        java.lang.String str17 = org.apache.commons.lang3.StringUtils.getCommonPrefix(strArray14);
        java.lang.String str18 = org.apache.commons.lang3.StringUtils.replaceEach("44444444444444444444444444444444444444444444444444444444444444444444444444444444444444aaaaaaaaaava.lang", strArray4, strArray14);
        int int19 = org.apache.commons.lang3.StringUtils.indexOfDifference((java.lang.CharSequence[]) strArray14);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertNotNull(strArray10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(strArray14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "##javal#########################" + "'", str15, "##javal#########################");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "string" + "'", str16, "string");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "string" + "'", str17, "string");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "44444444444444444444444444444444444444444444444444444444444444444444444444444444444444aaaaaaaaaava.lang" + "'", str18, "44444444444444444444444444444444444444444444444444444444444444444444444444444444444444aaaaaaaaaava.lang");
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
    }

    @Test
    public void test35476() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest70.test35476");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.leftPad("444444444444444444444444444444444444444444444444444444444444444gnJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJgnJJJJJJtvjgnlylstylstyl", 481, "...aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "...aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa...aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa...aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa...aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa...aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa...aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa...aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa...aaaaaaaaaaaaaaaaaaaaaaaaaaaaaa444444444444444444444444444444444444444444444444444444444444444gnJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJgnJJJJJJtvjgnlylstylstyl" + "'", str3, "...aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa...aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa...aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa...aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa...aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa...aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa...aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa...aaaaaaaaaaaaaaaaaaaaaaaaaaaaaa444444444444444444444444444444444444444444444444444444444444444gnJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJgnJJJJJJtvjgnlylstylstyl");
    }

    @Test
    public void test35477() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest70.test35477");
        java.util.Locale locale1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.apache.commons.lang3.StringUtils.upperCase(".......    io", locale1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test35478() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest70.test35478");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBefore("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaclassjavalangclassjavaulangjavaulangjavaulangjavaulangjavaulangjavaulangjavaulangjavaulangjavaulangjavaulangjavaulangjavaulangjavaulangjavaulangjavaulangjavaulangjavaulangjavaulangjavaulangjavaulang", "bazilaireS.oi.avaj ecafretnign");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaclassjavalangclassjavaulangjavaulangjavaulangjavaulangjavaulangjavaulangjavaulangjavaulangjavaulangjavaulangjavaulangjavaulangjavaulangjavaulangjavaulangjavaulangjavaulangjavaulangjavaulangjavaulang" + "'", str2, "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaclassjavalangclassjavaulangjavaulangjavaulangjavaulangjavaulangjavaulangjavaulangjavaulangjavaulangjavaulangjavaulangjavaulangjavaulangjavaulangjavaulangjavaulangjavaulangjavaulangjavaulangjavaulang");
    }

    @Test
    public void test35479() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest70.test35479");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOf("EABLELANG.GNALJAVA.LAN", "AVAJ.GNAL......java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........javainterfacejava.io.Serializabl");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test35480() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest70.test35480");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.normalizeSpace("                                                                            ][GNIRTSLITU.AVAJ1");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "][GNIRTSLITU.AVAJ1" + "'", str1, "][GNIRTSLITU.AVAJ1");
    }

    @Test
    public void test35481() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest70.test35481");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceChars("interface java.lang.CloneableClass javalangclass                       javaulang                       javaulang                       javaulang                       javaulang                       javaulang                       javaulang                       javaulang                       javaulang                       javaulang                       javaulang                       javaulang                       javaulang                       javaulang                       javaulang                       javaulang                       javaulang                       javaulang                       javaulang                       javaulang                       javaulanginterface java.io.Serializable", ".......                                                                                                                                                                                                                             va.langGNAL..la..                                                                                                                                                                                                                              ......................................javaulang....................................................................................................................................................", "                   StringStringStringStringStringStringStringStringStringString                    ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "iterfce   CoebeCss css                                                                                                                                                                                                                                                                                                                                                                                                                                                                            iterfce  io Seriizbe" + "'", str3, "iterfce   CoebeCss css                                                                                                                                                                                                                                                                                                                                                                                                                                                                            iterfce  io Seriizbe");
    }

    @Test
    public void test35482() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest70.test35482");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.leftPad("####################################################################################################################################################################################################################aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa...1aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa...1aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa...1aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa...1aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa...1aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa...1aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa...1aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa...1aaaaaaaaaaaaaaaaaaaaaaaaa", 45, '#');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "####################################################################################################################################################################################################################aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa...1aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa...1aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa...1aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa...1aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa...1aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa...1aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa...1aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa...1aaaaaaaaaaaaaaaaaaaaaaaaa" + "'", str3, "####################################################################################################################################################################################################################aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa...1aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa...1aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa...1aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa...1aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa...1aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa...1aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa...1aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa...1aaaaaaaaaaaaaaaaaaaaaaaaa");
    }

    @Test
    public void test35483() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest70.test35483");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitByCharacterTypeCamelCase("       44444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444");
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test35484() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest70.test35484");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.startsWith("                                                                                                                                                                                                                                             HI!aRRAYlISTaRRAYlISTaRRAYlISTAVAJ", "RChahactaRChahactaRChahactaRChahactaRChahactaRChahactaRChahactaRChahactaRChahactaRChahactaRChahactaRChahactaRChahactaRChahactaRChahactaRChahactaRChahactaRChahactaRChahactaRChahactaRChahactaRChahactaRChahactaRChahacta");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test35485() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest70.test35485");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.deleteWhitespace("gnalarraylistarraylistarraylignalarraylistarraylistarraylignalarraylistarraylistarraylignalarraylistarraylistarraylignalarraylistarraylistarraylignalarraylistarraylistarraylignalarraylistarraylistarraylignalarraylistarraylistarraylignalarraylistarrayJAVA.LANGAgnal.avajgnal..LANGgnal.avgnalarraylistarraylistarraylignalarraylistarraylistarraylignalarraylistarraylistarraylignalarraylistarraylistarraylignalarraylistarraylistarraylignalarraylistarraylistarraylignalarraylistarraylistarraylignalarraylistarraylistarraylignalarraylistarrayl");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "gnalarraylistarraylistarraylignalarraylistarraylistarraylignalarraylistarraylistarraylignalarraylistarraylistarraylignalarraylistarraylistarraylignalarraylistarraylistarraylignalarraylistarraylistarraylignalarraylistarraylistarraylignalarraylistarrayJAVA.LANGAgnal.avajgnal..LANGgnal.avgnalarraylistarraylistarraylignalarraylistarraylistarraylignalarraylistarraylistarraylignalarraylistarraylistarraylignalarraylistarraylistarraylignalarraylistarraylistarraylignalarraylistarraylistarraylignalarraylistarraylistarraylignalarraylistarrayl" + "'", str1, "gnalarraylistarraylistarraylignalarraylistarraylistarraylignalarraylistarraylistarraylignalarraylistarraylistarraylignalarraylistarraylistarraylignalarraylistarraylistarraylignalarraylistarraylistarraylignalarraylistarraylistarraylignalarraylistarrayJAVA.LANGAgnal.avajgnal..LANGgnal.avgnalarraylistarraylistarraylignalarraylistarraylistarraylignalarraylistarraylistarraylignalarraylistarraylistarraylignalarraylistarraylistarraylignalarraylistarraylistarraylignalarraylistarraylistarraylignalarraylistarraylistarraylignalarraylistarrayl");
    }

    @Test
    public void test35486() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest70.test35486");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "gNAL.AVAJ", "###########################################################################################################################################gn gnal.avaj");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test35487() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest70.test35487");
        int int1 = org.apache.commons.lang3.StringUtils.length((java.lang.CharSequence) "gnalArrayListArrayListArrayListavaj.gnalArrayListArrayListArrayLi...aL.ArrayListgnal.aL.ArrayList...aL.ArrayListgnal.aL.ArrayList...aL.ArrayListgnal.aL.aa");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 154 + "'", int1 == 154);
    }

    @Test
    public void test35488() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest70.test35488");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isWhitespace((java.lang.CharSequence) "LLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLyAAA.");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test35489() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest70.test35489");
        int int2 = org.apache.commons.lang3.StringUtils.indexOf("########################################################################################################################################################aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa                  ...                         #########################################################################################################################################################", 5);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test35490() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest70.test35490");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsIgnoreCase("", "iNTERFACEJAVA.LANG.cLONEABLE.......JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVAINTERFACEJAVA.IO.sERIALIZABLE");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test35491() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest70.test35491");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.rightPad("JavajGNALavaaaaaaaaaavaavajGNAL.avajGNALlangavaavajGNAL.avajGNALlangjavaavajGNAL.avajGNALlangjavaavajGNAL.avajGNALlangjavaavajGNAL.avajGNALlangjavaavajGNAL.avajGNALlangjavaavajGNAL.avajGNALlangjavaavajGNAL.avajGNALlangjavaavajGNAL.avajGNALlangjavaavajGNAL.avajGNALlangjavaavajGNAL.avajGNALlangjavaavajGNAL.avajGNALlangjavaavajGNAL.avajGNALlangjavaavajGNAL.avajGNALlangjavaavajGNAL.avajGNALlangjavaavajGNAL.avajGNALlan", 507, "ARR.AVALITU.AAAAAAAAAAAAAAAAAAAAAAAAAAAAAA... AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA... AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA... AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA... AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA... AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA... AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA... AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA... AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA... AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAYLIST");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "JavajGNALavaaaaaaaaaavaavajGNAL.avajGNALlangavaavajGNAL.avajGNALlangjavaavajGNAL.avajGNALlangjavaavajGNAL.avajGNALlangjavaavajGNAL.avajGNALlangjavaavajGNAL.avajGNALlangjavaavajGNAL.avajGNALlangjavaavajGNAL.avajGNALlangjavaavajGNAL.avajGNALlangjavaavajGNAL.avajGNALlangjavaavajGNAL.avajGNALlangjavaavajGNAL.avajGNALlangjavaavajGNAL.avajGNALlangjavaavajGNAL.avajGNALlangjavaavajGNAL.avajGNALlangjavaavajGNAL.avajGNALlanARR.AVALITU.AAAAAAAAAAAAAAAAAAAAAAAAAAAAAA... AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA" + "'", str3, "JavajGNALavaaaaaaaaaavaavajGNAL.avajGNALlangavaavajGNAL.avajGNALlangjavaavajGNAL.avajGNALlangjavaavajGNAL.avajGNALlangjavaavajGNAL.avajGNALlangjavaavajGNAL.avajGNALlangjavaavajGNAL.avajGNALlangjavaavajGNAL.avajGNALlangjavaavajGNAL.avajGNALlangjavaavajGNAL.avajGNALlangjavaavajGNAL.avajGNALlangjavaavajGNAL.avajGNALlangjavaavajGNAL.avajGNALlangjavaavajGNAL.avajGNALlangjavaavajGNAL.avajGNALlangjavaavajGNAL.avajGNALlanARR.AVALITU.AAAAAAAAAAAAAAAAAAAAAAAAAAAAAA... AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA");
    }

    @Test
    public void test35492() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest70.test35492");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.split("...       OI.AVAJECAFRETNI#ELBAENOLc.GNAL.AVAJECAFRETNIsTRINGuTILSsTRINGuTILSsTRINGuTILSsTRINGuTILSsTRINGuTILSsTRINGuTILSsTRINGuTILSsTRINGuTILSsTRINGuTILSsTRINGuTILS");
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test35493() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest70.test35493");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.contains("LANGaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa44444444444444444444444444..", "L.Arr yList");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test35494() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest70.test35494");
        java.lang.String str1 = org.apache.commons.lang3.ClassUtils.getShortClassName("iLyarrAtsiLyarrAtsiLyarrAlang");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "iLyarrAtsiLyarrAtsiLyarrAlang" + "'", str1, "iLyarrAtsiLyarrAtsiLyarrAlang");
    }

    @Test
    public void test35495() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest70.test35495");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.equalsIgnoreCase("G", "...444444.444444444444444444...                                 44444444444444444.444444444444444444...                                 44444$        ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test35496() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest70.test35496");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.defaultString("RChahactaRChahactaRChahactaRChahactaRChahactaRChahactaRChahactaRChahactaRChahactaRChahactaRChahactaRChahactaRChahactaRChahactaRChahactaRChahactaRChahactaRChahactaRChahactaRChahactaRChahactaRChahactaRChahactaRChahacta");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "RChahactaRChahactaRChahactaRChahactaRChahactaRChahactaRChahactaRChahactaRChahactaRChahactaRChahactaRChahactaRChahactaRChahactaRChahactaRChahactaRChahactaRChahactaRChahactaRChahactaRChahactaRChahactaRChahactaRChahacta" + "'", str1, "RChahactaRChahactaRChahactaRChahactaRChahactaRChahactaRChahactaRChahactaRChahactaRChahactaRChahactaRChahactaRChahactaRChahactaRChahactaRChahactaRChahactaRChahactaRChahactaRChahactaRChahactaRChahactaRChahactaRChahacta");
    }

    @Test
    public void test35497() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest70.test35497");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.reverse("                                                                                                                                                                                                                                                                              aaaaaa...                                                                                                                                                                                                                                                                                                                                                                                                                                                                       ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "                                                                                                                                                                                                                                                                                                                                                                                                                                                                       ...aaaaaa                                                                                                                                                                                                                                                                              " + "'", str1, "                                                                                                                                                                                                                                                                                                                                                                                                                                                                       ...aaaaaa                                                                                                                                                                                                                                                                              ");
    }

    @Test
    public void test35498() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest70.test35498");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.split("############", ".         44444444444444444444444444444444444444444444444444444444444444444444444444444444", 487);
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray3);
        java.lang.String str6 = org.apache.commons.lang3.ClassUtils.getShortClassName((java.lang.Object) strArray3, "...................................................................................................................................................................................................................................................................................................................................................................................................................................................................................ArryList....................................................................................................................................................................................................................................................................................................................................................................................................................................................................................");
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "############" + "'", str4, "############");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "String[]" + "'", str6, "String[]");
    }

    @Test
    public void test35499() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest70.test35499");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringAfterLast("", "hi!Arr...");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test35500() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest70.test35500");
        java.lang.CharSequence charSequence1 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.apache.commons.lang3.StringUtils.getLevenshteinDistance((java.lang.CharSequence) "LANGANG                                                                                yListArr             ", charSequence1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Strings must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }
}

