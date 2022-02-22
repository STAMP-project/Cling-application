import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest75 {

    public static boolean debug = false;

    @Test
    public void test37501() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest75.test37501");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfAnyBut("A##RyLRsA##RyLRsA##RyLRsA##RyLRsA##        ", "");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test37502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest75.test37502");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphaSpace((java.lang.CharSequence) "interfacejava.lang.Cloneable#interfacejava.i");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test37503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest75.test37503");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("j.v.tsily.rr.tsily.rr.tsily.r", "lvj.gnlvj.gnlvj.gnlvj.gnlvj.gnlvj.gnlvj.gnlvj.gnlvj.gnlvj.gnlvj.gnlvj.gnlvj.gnlvj.gnlvj.gnlvj.gnlvj.gnlvj.gnlvj.gnlvj.gnlvj.gnlvj.gnlvj.gnlvj.gnlvj.gnlvj.gnlvj.gnlvj.gnlvj.gnlvj.gnlvj.gnlvj.gnlvj.gnlvj.gnlvj.gnlvj.gnlvj.gnlvj.gnlvj.gnlvj.gnlvj.gnlvj.gnlvj.gnlvj.gnlvj.gnlvj.gnlvj.gnlvj.gnlvj.gnlvj.gnlvj.gnlvj.gnlvj.gnlvj.gnlvj.gnlvj.gnlvj.gnlvj.gnlvj.gnlvj.gnlvj.gnlvj.gnlvj.gnlvj.gnlvj.gnlvj.gnlvj.gnlvj.gnlvj.gnlvj.gnlvj.gnlvj.gnlvj.gnlvj.gnlvj.gnlvj.gnlvj.gnlvj.gnlvj.gnlvj.gnlvj.gnlvj.gnlvj.gnlvj.gnlvj.gnlvj.gnlvj.gnlvj.gnlvj.gnlvj.gnlvj.gnlvj.gnlvj.gnlvj.gnlvj.gnlvj.gnlvj.gnlvj.gnlvj.gnlvj.gnlvj.gnlvj.gnlvj.gnlvj.gnlvj.gnlvj.gnlvj.gnlvj.gnlvj.gnlvj.gnlvj.gnl", 655);
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void test37504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest75.test37504");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBeforeLast("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "AA..");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa" + "'", str2, "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
    }

    @Test
    public void test37505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest75.test37505");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trimToEmpty("                                                                                                       irfCo$irfioSrii");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "irfCo$irfioSrii" + "'", str1, "irfCo$irfioSrii");
    }

    @Test
    public void test37506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest75.test37506");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAsciiPrintable((java.lang.CharSequence) "                                                                                                                                                                                                                                                                                                        Interface java.lang.Cloneablehi!arr..interface java.io.Serializable                                                                                                                                                                                                                                                                                                         ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test37507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest75.test37507");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.split("Class[]aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", '#');
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test37508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest75.test37508");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphanumericSpace((java.lang.CharSequence) "tringclatringclatringclatringclatringclatringclatringclatringclatringclatringclatringclatringclatringclatringclatringclatringclatringclatringclatringclatringclatringclatringclatringclatringclatringclatringclatringclatringclatringclatringclatringclatringclatringclatringclatringclatringclatringclatringclatringclatringclatringclatringclatringclatringclatringclatringclatringclatringclatringclatringclatringcla");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test37509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest75.test37509");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.defaultIfEmpty("                                                                                                                                               ...", "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                                                                                                                               ..." + "'", str2, "                                                                                                                                               ...");
    }

    @Test
    public void test37510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest75.test37510");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeEnd(".....hi!ArrayListArrayListArrayListavaj.gnalArrayListArrayListArrayListavaj.gnalArrayListArrayLis...      44444444444444444444444444.A LYA..A           44444444444444444444444444.A LYA..A           44444444444444444444444444.A LYA..A           44444444444444444444444444.A LYA..A           44444444444444444444444444.A LYA..A           44444444444444444444444444.A LYA..A           44444444444444444444444444.A LYA..A           44444444444444444444444444.A LYA..A           44444444444444444444444444.A LYA..A           44444444444444444444444444.A LYA..A           44444444444444444444444444.A LYA..A           44444444444444444444444444.A LYA..A           44444444444444444444444444.A LYA..A           44444444444444444444444444.A LYA..A           44444444444444444444444444.A LYA..A           44444444444444444444444444.A LYA..A           44444444444444444444444444.A LYA..A           44444444444444444444444444.A LYA..A           44444444", "GNAL.");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + ".....hi!ArrayListArrayListArrayListavaj.gnalArrayListArrayListArrayListavaj.gnalArrayListArrayLis...      44444444444444444444444444.A LYA..A           44444444444444444444444444.A LYA..A           44444444444444444444444444.A LYA..A           44444444444444444444444444.A LYA..A           44444444444444444444444444.A LYA..A           44444444444444444444444444.A LYA..A           44444444444444444444444444.A LYA..A           44444444444444444444444444.A LYA..A           44444444444444444444444444.A LYA..A           44444444444444444444444444.A LYA..A           44444444444444444444444444.A LYA..A           44444444444444444444444444.A LYA..A           44444444444444444444444444.A LYA..A           44444444444444444444444444.A LYA..A           44444444444444444444444444.A LYA..A           44444444444444444444444444.A LYA..A           44444444444444444444444444.A LYA..A           44444444444444444444444444.A LYA..A           44444444" + "'", str2, ".....hi!ArrayListArrayListArrayListavaj.gnalArrayListArrayListArrayListavaj.gnalArrayListArrayLis...      44444444444444444444444444.A LYA..A           44444444444444444444444444.A LYA..A           44444444444444444444444444.A LYA..A           44444444444444444444444444.A LYA..A           44444444444444444444444444.A LYA..A           44444444444444444444444444.A LYA..A           44444444444444444444444444.A LYA..A           44444444444444444444444444.A LYA..A           44444444444444444444444444.A LYA..A           44444444444444444444444444.A LYA..A           44444444444444444444444444.A LYA..A           44444444444444444444444444.A LYA..A           44444444444444444444444444.A LYA..A           44444444444444444444444444.A LYA..A           44444444444444444444444444.A LYA..A           44444444444444444444444444.A LYA..A           44444444444444444444444444.A LYA..A           44444444444444444444444444.A LYA..A           44444444");
    }

    @Test
    public void test37511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest75.test37511");
        java.lang.ClassLoader classLoader0 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass2 = org.apache.commons.lang3.ClassUtils.getClass(classLoader0, "interface java.lang.CloneableINTERFACE JAVA.LANG.CL...");
            org.junit.Assert.fail("Expected exception of type java.lang.ClassNotFoundException; message: interfacejava/lang/CloneableINTERFACEJAVA/LANG/CL///");
        } catch (java.lang.ClassNotFoundException e) {
            // Expected exception.
        }
    }

    @Test
    public void test37512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest75.test37512");
        char[] charArray11 = new char[] { ' ', ' ', '#', 'a', '4', 'a' };
        int int12 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "", charArray11);
        boolean boolean13 = org.apache.commons.lang3.StringUtils.containsAny("......", charArray11);
        int int14 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "AAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAA", charArray11);
        boolean boolean15 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "#############################################################", charArray11);
        int int16 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "ARRA", charArray11);
        java.lang.Class<?> wildcardClass17 = charArray11.getClass();
        org.junit.Assert.assertNotNull(charArray11);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray11), "  #a4a");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray11), "  #a4a");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray11), "[ ,  , #, a, 4, a]");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test37513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest75.test37513");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOfIgnoreCase(".lang.lang.lang.lang.llitu", "GNALGNALGNALGNALGNALGNALGNALGNALGNALGNALGNALGNALGNALGNALGNALGNALGNALGNALGNALGNALGNALGNALGNALGNALGNALGNALGNALGNALGNAL.lang.lang.lang.lang.lang.lang.lLITUAVA.LA");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test37514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest75.test37514");
        int int3 = org.apache.commons.lang3.StringUtils.indexOfIgnoreCase("javastringslitUgnirtSarraylistarraylistavaj.gnalarraylistarraylistarrayli", "                                                                                                                                                                                      4444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444aaaaaaaaaa                                                                                                                                                                                      ", 145);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test37515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest75.test37515");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("interfacegaga.lang.cloneableaaaaaaaaaagagal.agnaaaaaaaaaagagal.agnaaaaaaaaaagagal.agnaaaaaaaaaagagal.agnaaaaaaaaaagagal.agnaaaaaaaaaagagal.agnaaaaaaaaaagagal.agnaaaaaaaaaagagal.agnaaaaaaaaaagagal.agnaaaaaaaaaagagal.agnaaaaaaaaaagagal.agnaaaaaaaaaagagal.agnaaaaaaaaaagagal.agnaaaaaaaaaagagal.agnaaaaaaaaaagagal.agnaaaaaaaaaagagal.agnaaaaaaaaaagagal.agnaaaaaaaaaagagal.agnaaaaaaaaaagagal.agnaaaaaaaaaagagal.agnaaaaaaaaaagagal.agnaaaaaaaaaagagal.agnaaaaaaaaaagagal.agnaaaaaaaaaagagal.agnaaaaaaaaaagagal.agnaaaaaaaaaagagal.agnaaaaaaaaaagagal.agnaaaaaaaaaagagal.agnaaaaaaaaaagagal.agnaaaaaaaaaagagal.agnaaaaaaaaaagagal.agnaaaaaaaaaagagal.agnaaaaaaaaaagagal.agnaaaaaaaaaagagal.agnaaaaaaaaaagagal.agnaaaaaaaaaaringinterfacegaga.io", "TRINGCLA");
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test37516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest75.test37516");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.chop("ARR...AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA...AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA...AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA...AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA...AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA...AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA...AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA...AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA...AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "ARR...AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA...AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA...AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA...AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA...AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA...AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA...AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA...AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA...AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA" + "'", str1, "ARR...AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA...AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA...AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA...AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA...AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA...AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA...AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA...AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA...AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA");
    }

    @Test
    public void test37517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest75.test37517");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.repeat("                                               aaaaJAVAL.AGNaaaaaaaaaaJAVAL", (int) (short) 1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                               aaaaJAVAL.AGNaaaaaaaaaaJAVAL" + "'", str2, "                                               aaaaJAVAL.AGNaaaaaaaaaaJAVAL");
    }

    @Test
    public void test37518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest75.test37518");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsIgnoreCase("...4444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444...", "rrayListrrayListrrayListrrayListrrayListrrayListrrayListrrayListrrayListrra");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test37519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest75.test37519");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphanumericSpace((java.lang.CharSequence) "Aaaaaa");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test37520() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest75.test37520");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.contains("                A..AYL A.44444444444444444444444444                                                 ", "444444.444444444444444444...44444444444444444.444444444444444444...44444$aenolc.gnaelbagaga.langagaga.langagaga.langagaga.langagaga.langagaga.langagaga.langagaga.langagaga.langagaga.langagaga.langagaga.langagaga.langagaga.langagaga.langagaga.langagaga.langagaga.langagaga.langagaga.langagaga.langagaga.langagaga.langagaga.langagaga.langagaga.langagaga.langagaga.langagaga.langagaga.langagaga.langagaga.langagaga.langagaga.langagaga.langafretnigniragecagaoi.aenolc.gnaelbagaga.langagaga.langagaga.langagaga.langagaga.langagaga.langagaga.langagaga.langagaga.langagaga.langagaga.langagaga.langagaga.langagaga.langagaga.langagaga.langagaga.langagaga.langagaga.langagaga.langagaga.langagaga.langagaga.langagaga.langagaga.langagaga.langagaga.langagaga.langagaga.langagaga.langagaga.langagaga.langagaga.langagaga.langagaga.langafretnigniragecagaoi.aenolc.gnaelb");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test37521() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest75.test37521");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNotBlank((java.lang.CharSequence) "####.........................................####");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test37522() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest75.test37522");
        int int1 = org.apache.commons.lang3.StringUtils.length((java.lang.CharSequence) "a..AYL A.44444444444444444444444444a..AYL A.44444444444444444444444444a..AYL A.44444444444444444444444444a..AYL A.44444444444444444444444444a..AYL A.44444444444444444444444444a..AYL A.44444444444444444444444444a..AYL A.44444444444444444444444444a..AYL A.44444444444444444444444444a..AYL A.44444444444444444444444444a..AYL A.44444444444444444444444444a..AYL A.44444444444444444444444444a..AYL A.444444444A$L.AVAj  ");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 413 + "'", int1 == 413);
    }

    @Test
    public void test37523() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest75.test37523");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$ java.lang$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$", "JavaStringnalArrayListArrayListArrayListavaj.gnalArrayListArrayListArrayLi", 678);
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void test37524() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest75.test37524");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "                                                                                                                                                                                                                                                                                                                                                                                                          CLASSJAVA.LANGAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAULANG", "hI!aRRAYlIS");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test37525() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest75.test37525");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAsciiPrintable((java.lang.CharSequence) "ULANGrrVyList");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test37526() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest75.test37526");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "gnl$", "serializable");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test37527() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest75.test37527");
        int int2 = org.apache.commons.lang3.StringUtils.indexOf("tSslitUgnirtSslitUgnirtSslitUgnirtSslitUgnirtS", "class java.lang.String$class java.lang.String$class java.lang.String$class java.lang.String$class java.lang.String$class java.lang.String$class java.lang.String$class java.lang.String$class java.lang.String$class java.lang.String$class java.lang.String$class java.lang.String$class java.lang.String$class java.lang.String$class java.lang.String$class java.lang.String$class java.lang.String$class java.lang.String$class java.lang.String$class java.lang.String$class java.lang.String$class java.lang.String$class java.lang.String$class java.lang.String$class java.lang.String$class java.lang.String$class java.lang.String$class java.lang.String$class java.lang.String$class java.lang.String");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test37528() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest75.test37528");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("Class[]aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "sLyAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA 444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444");
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test37529() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest75.test37529");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeEnd("NALaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "...ss.lc gnirtS.gn.l..v.j");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "NALaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa" + "'", str2, "NALaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
    }

    @Test
    public void test37530() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest75.test37530");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("....................................................................", "#################################################################################...a##################################################################################", 905);
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.stripAll(strArray3);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertNotNull(strArray4);
    }

    @Test
    public void test37531() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest75.test37531");
        java.lang.ClassLoader classLoader0 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass3 = org.apache.commons.lang3.ClassUtils.getClass(classLoader0, "$       $       $       $       $       $       $       $       $       $    rA    $       $       $       $       $       $       $       $       $       ", false);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassNotFoundException; message: $$$$$$$$$$rA$$$$$$$$$");
        } catch (java.lang.ClassNotFoundException e) {
            // Expected exception.
        }
    }

    @Test
    public void test37532() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest75.test37532");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.reverseDelimited("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa...", '#');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa..." + "'", str2, "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa...");
    }

    @Test
    public void test37533() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest75.test37533");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replace("...java.lang.Stringclassjava.lang.Stringclass......java.lang.Stringclassjava.lang.Stringclass......java.lang.Stringclassjava.lang.Stringclass......java.lang.Stringclassjava.lang.Stringclass......java.lang.Stringclassjava.lang.Stringclass......java.lang.Stringclassjava.lang.Stringclass......java.lang.Stringclassjava.lang.Stringclass......java.lang.Stringclassjava.lang.Stringclass......java.lang.Stringclassjava.lang.Stringclass......java.lang.Stringclassjava.lang.Stringclass......java.lang.Stringclassjava.lang.Stringclass......java.lang.Stringclassjava.lang.Stringclass......java.lang.Stringclassjava.lang.Stringclass......java.lang.Stringclassjava.lang.Stringclass......java.lang.Stringclassjava.lang.Stringclass......java.lang.Stringclassjava.lang.Stringclass......java.lang.Stringclassjava.lang.Stringclass......java.lang.Stringclassjava.lang.Stringcl...avaj..........avaj.........", "                                hi!arraylis       $         $         $         $         $         $         $         $         $         $         $         $         $         $         $         $         $         $         $         $         $         $         $                                ", "tavaj.gnalarraylistarraylistarraylitavaj.gnalarraylistarraylistarraylitavaj.gnalarraylistarraylistarraylitavaj.gnalarraylistarraylistarraylitavaj.gnalarraylistarraylistarraylitavaj.gnalarraylistarraylistarraylitavaj.gnalarraylistarraylistarraylitavaj.gnalarraylistarraylistarraylitavaj.gnalarraylistarraylistarraylitavaj.gnalarraylistarraylistarraylitavaj.gnalarraylistarraylistarraylitavaj.gnalarraylistarraylistarraylitavaj.gnalarraylistarraylistarraylitavaj.gnalarraylistarraylistarraylitavaj.gnalarraylistarraylistarraylitavaj.gnalarraylistarraylistarraylitavaj.gnalarraylistarraylistarraylitavaj.gnalarraylistarraylistarraylitavaj.gnalarraylistarraylistarraylitavaj.gnalarraylistarraylistarraylitavaj.gnalarraylistarraylistarraylitavaj.gnalarraylistarraylistarraylitavaj.gnalarraylistarraylistarraylitavaj.gnalarraylistarraylistarraylitavaj.gnalarrayli                                 ...");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "...java.lang.Stringclassjava.lang.Stringclass......java.lang.Stringclassjava.lang.Stringclass......java.lang.Stringclassjava.lang.Stringclass......java.lang.Stringclassjava.lang.Stringclass......java.lang.Stringclassjava.lang.Stringclass......java.lang.Stringclassjava.lang.Stringclass......java.lang.Stringclassjava.lang.Stringclass......java.lang.Stringclassjava.lang.Stringclass......java.lang.Stringclassjava.lang.Stringclass......java.lang.Stringclassjava.lang.Stringclass......java.lang.Stringclassjava.lang.Stringclass......java.lang.Stringclassjava.lang.Stringclass......java.lang.Stringclassjava.lang.Stringclass......java.lang.Stringclassjava.lang.Stringclass......java.lang.Stringclassjava.lang.Stringclass......java.lang.Stringclassjava.lang.Stringclass......java.lang.Stringclassjava.lang.Stringclass......java.lang.Stringclassjava.lang.Stringcl...avaj..........avaj........." + "'", str3, "...java.lang.Stringclassjava.lang.Stringclass......java.lang.Stringclassjava.lang.Stringclass......java.lang.Stringclassjava.lang.Stringclass......java.lang.Stringclassjava.lang.Stringclass......java.lang.Stringclassjava.lang.Stringclass......java.lang.Stringclassjava.lang.Stringclass......java.lang.Stringclassjava.lang.Stringclass......java.lang.Stringclassjava.lang.Stringclass......java.lang.Stringclassjava.lang.Stringclass......java.lang.Stringclassjava.lang.Stringclass......java.lang.Stringclassjava.lang.Stringclass......java.lang.Stringclassjava.lang.Stringclass......java.lang.Stringclassjava.lang.Stringclass......java.lang.Stringclassjava.lang.Stringclass......java.lang.Stringclassjava.lang.Stringclass......java.lang.Stringclassjava.lang.Stringclass......java.lang.Stringclassjava.lang.Stringclass......java.lang.Stringclassjava.lang.Stringcl...avaj..........avaj.........");
    }

    @Test
    public void test37534() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest75.test37534");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isBlank((java.lang.CharSequence) "$$$$$$$$$$$$$$$$$$$..");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test37535() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest75.test37535");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("interface java.lang.Cloneable.......java.......Objectava..........javainterface java.io");
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test37536() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest75.test37536");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringAfterLast("Arr", "interface java.lang.Cloneableg.JAVA.L$ArrayListg.JAVA.L$ArrayListg.JAVA.L$ArrayListg.JAVA.L$ArrayListg.JAVA.L$ArrayListg.JAVA.L$ArrayListg.JAVA.L$ArrayListg.JAVA.L$ArrayListg.JAVA.L$ArrayListg.JAVA.L$ArrayListg.JAVA.L$ArrayListg.JAVA.L$ArrayListg.JAVA.L$ArrayListg.JAVA.L$ArrayListg.JAVA.L$ArrayListg.JAVA.L$ArrayListg.JAVA.L$ArrayListg.JAVA.L$ArrayListg.JAVA.L$ArrayListg.JAVA.L$ArrayListg.JAVA.L$ArrayListg.JAVA.L$ArrayListg.JAVA.L$ArrayListg.JAVA.L$ArrayListg.JAVA.L$ArrayListg.JAVA.L$ArrayListg.JAVA.L$ArrayListg.JAVA.L$ArrayListg.JAVA.L$ArrayListg.JAVA.L$ArrayListg.JAVA.L$ArrayListg.JAVA.L$ArrayListg.JAVA.L$ArrayListg.JAVA.L$ArrayListg.JAVA.L$ArrayListg.JAVA.L$ArrayListg.JAVA.L$ArrayListg.JAVA.L$ArrayListg.JAVA.L$ArrayListg.JAVA.L$ArrayListg.JAVA.L$ArrayListg.JAVA.L$ArrayListg.JAVA.L$ArrayListg.JAVA.L$ArrayListg.JAVA.L$ArrayListginterface java.io.Serializable");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test37537() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest75.test37537");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.abbreviateMiddle("GNALaAVAJLANGaJAVAGNALaAVAJLANGaJ", "", 943);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "GNALaAVAJLANGaJAVAGNALaAVAJLANGaJ" + "'", str3, "GNALaAVAJLANGaJAVAGNALaAVAJLANGaJ");
    }

    @Test
    public void test37538() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest75.test37538");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.upperCase("aAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA... AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA... AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA... AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA... AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA... AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA... AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA... AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA... AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA... ...ARRAYLISTARRAY");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA... AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA... AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA... AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA... AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA... AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA... AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA... AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA... AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA... ...ARRAYLISTARRAY" + "'", str1, "AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA... AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA... AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA... AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA... AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA... AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA... AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA... AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA... AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA... ...ARRAYLISTARRAY");
    }

    @Test
    public void test37539() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest75.test37539");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceChars("..........a", "4444444444444Ch.r.cter4444444444444utilStrayl a.a", "          AA...                                                                        ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "           " + "'", str3, "           ");
    }

    @Test
    public void test37540() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest75.test37540");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.split("lutilutilutilutilutil####lutilutilutilutilutilylistarraylistarrayylistarraylistarrayylistarraylistarrayylistarraylistarrayylistarraylistarrayylistarraylistarrayylistarraylistarrayylistarraylistarrayylistarraylistarrayylistarraylistarrayylistarraylistarrayylistarraylistarrayylistarraylistarrayylistarraylistarrayylistarraylistarrayylistarraylistarrayylistarraylistarrayylistarraylistarrayylistarraylistarrayylistarraylistarrayylistarraylistarrayylistarraylistarrayylistarraylistarrayylistarraylistarrayylistarraylistarrayylistarraylistarrayylistarraylistarrayylistarraylistarrayylistarraylistarrayylistarraylistarrayylistarraylistarrayylistarraylistarrayylistarraylistarrayylistarraylistarrayylistarraylistarrayylistarraylistarrayylistarraylistarrayylistarraylistarrayylistarraylistarrayylistarraylistarrayylistarraylistarrayylistarraylistarrayylistarraylistarrayylistarraylistarrayylistarraylistarrayylistarraylistarrayylistarraylistarrayylistarraylista", "                                                                                                                                                                                                                                                                                                                                                                                                                                        javaulangrraylist                       javaulangrraylist                                                                                                                                                                                                                                                                                                                                                                                                                            ", 151);
        int int4 = org.apache.commons.lang3.StringUtils.indexOfDifference((java.lang.CharSequence[]) strArray3);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
    }

    @Test
    public void test37541() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest75.test37541");
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
        java.lang.String str42 = org.apache.commons.lang3.StringUtils.concat((java.lang.Object[]) wildcardClassArray29);
        java.lang.Class<?>[] wildcardClassArray43 = org.apache.commons.lang3.ClassUtils.wrappersToPrimitives(wildcardClassArray29);
        java.lang.Class<?>[] wildcardClassArray44 = org.apache.commons.lang3.ClassUtils.wrappersToPrimitives(wildcardClassArray43);
        java.lang.Class<?>[] wildcardClassArray45 = org.apache.commons.lang3.ClassUtils.primitivesToWrappers(wildcardClassArray44);
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
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "" + "'", str42, "");
        org.junit.Assert.assertNotNull(wildcardClassArray43);
        org.junit.Assert.assertNotNull(wildcardClassArray44);
        org.junit.Assert.assertNotNull(wildcardClassArray45);
    }

    @Test
    public void test37542() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest75.test37542");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("interface java.lang.CloneableStringinterface java.io", "", 200);
        java.lang.Class<?> wildcardClass4 = strArray3.getClass();
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test37543() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest75.test37543");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.leftPad("interface javalangCloneableINTERFACE JAVALANGCL", 73, '4');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "44444444444444444444444444interface javalangCloneableINTERFACE JAVALANGCL" + "'", str3, "44444444444444444444444444interface javalangCloneableINTERFACE JAVALANGCL");
    }

    @Test
    public void test37544() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest75.test37544");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.reverse(".......jv..........jv..........jv..........jv..........jv..........jv..........jv..........jv..........jv..........jv..........jv..........jv..........jv..........jv..........jv..........jv..........jv..........jv..........jv..........jv..........jv..........jv..........jv..........jv..........jv..........jv..........jv..........jv..........jv..........jv..........jv..........jv..........jv..........jv..........jv");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "vj..........vj..........vj..........vj..........vj..........vj..........vj..........vj..........vj..........vj..........vj..........vj..........vj..........vj..........vj..........vj..........vj..........vj..........vj..........vj..........vj..........vj..........vj..........vj..........vj..........vj..........vj..........vj..........vj..........vj..........vj..........vj..........vj..........vj..........vj......." + "'", str1, "vj..........vj..........vj..........vj..........vj..........vj..........vj..........vj..........vj..........vj..........vj..........vj..........vj..........vj..........vj..........vj..........vj..........vj..........vj..........vj..........vj..........vj..........vj..........vj..........vj..........vj..........vj..........vj..........vj..........vj..........vj..........vj..........vj..........vj..........vj.......");
    }

    @Test
    public void test37545() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest75.test37545");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.leftPad("SSgnlA", 523);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                     SSgnlA" + "'", str2, "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                     SSgnlA");
    }

    @Test
    public void test37546() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest75.test37546");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.leftPad("###################################################################################################################################################################################################################################################################################################################################################################################################################################################################                                   ", 838);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                                                                                                                                                                                                                                                                                                                                                ###################################################################################################################################################################################################################################################################################################################################################################################################################################################################                                   " + "'", str2, "                                                                                                                                                                                                                                                                                                                                                                ###################################################################################################################################################################################################################################################################################################################################################################################################################################################################                                   ");
    }

    @Test
    public void test37547() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest75.test37547");
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
        java.lang.String str30 = org.apache.commons.lang3.StringUtils.concat((java.lang.Object[]) wildcardClassArray6);
        java.lang.String str32 = org.apache.commons.lang3.ClassUtils.getShortCanonicalName((java.lang.Object) wildcardClassArray6, ".......");
        java.lang.Class<?>[] wildcardClassArray33 = org.apache.commons.lang3.ClassUtils.wrappersToPrimitives(wildcardClassArray6);
        java.lang.String[] strArray35 = org.apache.commons.lang3.StringUtils.splitByCharacterType("... AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA... AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA... AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA... AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA... AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA... AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA... AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA... AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA... AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA... AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA");
        java.lang.Class<?>[] wildcardClassArray36 = org.apache.commons.lang3.ClassUtils.toClass((java.lang.Object[]) strArray35);
        java.lang.Class<?>[] wildcardClassArray37 = org.apache.commons.lang3.ClassUtils.primitivesToWrappers(wildcardClassArray36);
        java.lang.Class<?>[] wildcardClassArray38 = org.apache.commons.lang3.ClassUtils.wrappersToPrimitives(wildcardClassArray37);
        java.lang.Class<?>[] wildcardClassArray39 = org.apache.commons.lang3.ClassUtils.toClass((java.lang.Object[]) wildcardClassArray37);
        java.lang.String str43 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) wildcardClassArray39, '4', (int) (short) 100, 23);
        boolean boolean44 = org.apache.commons.lang3.ClassUtils.isAssignable(wildcardClassArray33, wildcardClassArray39);
        java.lang.String str46 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) wildcardClassArray33, "Serializable                                          ");
        java.lang.Class<?>[] wildcardClassArray47 = org.apache.commons.lang3.ClassUtils.primitivesToWrappers(wildcardClassArray33);
        java.lang.Class<?>[] wildcardClassArray48 = org.apache.commons.lang3.ClassUtils.primitivesToWrappers(wildcardClassArray47);
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
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "" + "'", str30, "");
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "Class[]" + "'", str32, "Class[]");
        org.junit.Assert.assertNotNull(wildcardClassArray33);
        org.junit.Assert.assertNotNull(strArray35);
        org.junit.Assert.assertNotNull(wildcardClassArray36);
        org.junit.Assert.assertNotNull(wildcardClassArray37);
        org.junit.Assert.assertNotNull(wildcardClassArray38);
        org.junit.Assert.assertNotNull(wildcardClassArray39);
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "" + "'", str43, "");
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertEquals("'" + str46 + "' != '" + "" + "'", str46, "");
        org.junit.Assert.assertNotNull(wildcardClassArray47);
        org.junit.Assert.assertNotNull(wildcardClassArray48);
    }

    @Test
    public void test37548() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest75.test37548");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.split("$######################################################################", "  AtsiLytcejbOlvjsslcrrAtsiLytcejbO.gn");
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test37549() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest75.test37549");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.containsWhitespace("gnalArrayListArrayListArrayLi                                                                       ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test37550() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest75.test37550");
        int int2 = org.apache.commons.lang3.StringUtils.indexOf("SILYARRA!IH", 87);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test37551() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest75.test37551");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.chomp("sTRINGg.g.g.g.g.g.g.g.g.g.g.g.g.g.g.g.g.g.AVAJ.GNALAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAIRFCO$IRFIOSRA..AYL A.444444444444444444444444444g.g.g.g.g.g.gg.g.g.g.g.g.g.g.g.g.g.g.g.g.g.g.g.g.AVAJ.GNALAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAIRFCO$IRFIOSRA..AYL A.444444444444444444444444444g.g.g.g.g.g.gg.g.g.g.g.g.g.g.g.g.g.g.g.g.g.g.g.g.AVAJ.GNALAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAIRFCO$IRFIOSRA..AYL A.444444444444444444444444444g.g.g.g.g.g.gg.g.g.g.g.g.g.g.g.g.g.g.g.g.g.g.g.g.AVAJ.GNALAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAIRFCO$IRFIOSRA..AYL A.444444444444444444444444444g.g.g.g.g.g.gg.g.g.g.g.g.g.g.g.g.g.g.g.g.g.g.g.g.AVAJ.GNALAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAIRFCO$IRFIOSRA..AYL A.444444444444444444444444444g.g.g.g.g.g.gg.g.g.g.g.g.g.g.g.g.g.g.g.g.g.g.g.g.AVAJ.GNALAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAIRFCO$IRFIOSRA..AYL A.444444444444444444444444444g.g.g.g.g.g.gg.g.g.g.g.g.g.g.g.g.g.g.g.g.g.g.g.g.AVAJ.GNALAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAIRFCO$IRFIOSRA..AYL A.444");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "sTRINGg.g.g.g.g.g.g.g.g.g.g.g.g.g.g.g.g.g.AVAJ.GNALAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAIRFCO$IRFIOSRA..AYL A.444444444444444444444444444g.g.g.g.g.g.gg.g.g.g.g.g.g.g.g.g.g.g.g.g.g.g.g.g.AVAJ.GNALAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAIRFCO$IRFIOSRA..AYL A.444444444444444444444444444g.g.g.g.g.g.gg.g.g.g.g.g.g.g.g.g.g.g.g.g.g.g.g.g.AVAJ.GNALAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAIRFCO$IRFIOSRA..AYL A.444444444444444444444444444g.g.g.g.g.g.gg.g.g.g.g.g.g.g.g.g.g.g.g.g.g.g.g.g.AVAJ.GNALAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAIRFCO$IRFIOSRA..AYL A.444444444444444444444444444g.g.g.g.g.g.gg.g.g.g.g.g.g.g.g.g.g.g.g.g.g.g.g.g.AVAJ.GNALAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAIRFCO$IRFIOSRA..AYL A.444444444444444444444444444g.g.g.g.g.g.gg.g.g.g.g.g.g.g.g.g.g.g.g.g.g.g.g.g.AVAJ.GNALAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAIRFCO$IRFIOSRA..AYL A.444444444444444444444444444g.g.g.g.g.g.gg.g.g.g.g.g.g.g.g.g.g.g.g.g.g.g.g.g.AVAJ.GNALAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAIRFCO$IRFIOSRA..AYL A.444" + "'", str1, "sTRINGg.g.g.g.g.g.g.g.g.g.g.g.g.g.g.g.g.g.AVAJ.GNALAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAIRFCO$IRFIOSRA..AYL A.444444444444444444444444444g.g.g.g.g.g.gg.g.g.g.g.g.g.g.g.g.g.g.g.g.g.g.g.g.AVAJ.GNALAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAIRFCO$IRFIOSRA..AYL A.444444444444444444444444444g.g.g.g.g.g.gg.g.g.g.g.g.g.g.g.g.g.g.g.g.g.g.g.g.AVAJ.GNALAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAIRFCO$IRFIOSRA..AYL A.444444444444444444444444444g.g.g.g.g.g.gg.g.g.g.g.g.g.g.g.g.g.g.g.g.g.g.g.g.AVAJ.GNALAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAIRFCO$IRFIOSRA..AYL A.444444444444444444444444444g.g.g.g.g.g.gg.g.g.g.g.g.g.g.g.g.g.g.g.g.g.g.g.g.AVAJ.GNALAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAIRFCO$IRFIOSRA..AYL A.444444444444444444444444444g.g.g.g.g.g.gg.g.g.g.g.g.g.g.g.g.g.g.g.g.g.g.g.g.AVAJ.GNALAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAIRFCO$IRFIOSRA..AYL A.444444444444444444444444444g.g.g.g.g.g.gg.g.g.g.g.g.g.g.g.g.g.g.g.g.g.g.g.g.AVAJ.GNALAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAIRFCO$IRFIOSRA..AYL A.444");
    }

    @Test
    public void test37552() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest75.test37552");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.chomp("aAAAAAAAAAAAAAAAAAA      ", "avajssalC");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "aAAAAAAAAAAAAAAAAAA      " + "'", str2, "aAAAAAAAAAAAAAAAAAA      ");
    }

    @Test
    public void test37553() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest75.test37553");
        java.lang.String[] strArray5 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("u                                                                                                                                                                                                                                                                                                       Java.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava...                                                                                                                                                                                                                                                                                                                                                                                                           ", "ARR... AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA... AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA... AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA... AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA... AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA... AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA... AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA... AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA... AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA... AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAYLIST", 862);
        int int6 = org.apache.commons.lang3.StringUtils.lastIndexOfAny("tringcla", strArray5);
        java.lang.String[] strArray9 = org.apache.commons.lang3.StringUtils.split(" ..", ".......jv..........jv..........jv..........jv..........jv..........jv..........jv..........jv..........jv..........jv..........jv..........jv..........jv..........jv..........jv..........jv..........jv..........jv..........jv..........jv..........jv..........jv..........jv..........jv..........jv..........jv..........jv..........jv..........jv..........jv..........jv..........jv..........jv..........jv..........jv");
        java.lang.String str10 = org.apache.commons.lang3.StringUtils.replaceEachRepeatedly("Byaa", strArray5, strArray9);
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNotNull(strArray9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Byaa" + "'", str10, "Byaa");
    }

    @Test
    public void test37554() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest75.test37554");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.leftPad("java..........java..........java.......ARJAVAARR......java..........java..........java                                ", 378);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                                                                                                                                                                                                                                                    java..........java..........java.......ARJAVAARR......java..........java..........java                                " + "'", str2, "                                                                                                                                                                                                                                                                    java..........java..........java.......ARJAVAARR......java..........java..........java                                ");
    }

    @Test
    public void test37555() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest75.test37555");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.reverseDelimited("                                                  ", '4');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                                  " + "'", str2, "                                                  ");
    }

    @Test
    public void test37556() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest75.test37556");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.strip("                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                               aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaava.langjava.langjava.lang... .... .java.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.lang... .... ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaava.langjava.langjava.lang... .... .java.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.lang... ...." + "'", str1, "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaava.langjava.langjava.lang... .... .java.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.lang... ....");
    }

    @Test
    public void test37557() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest75.test37557");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.reverse("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaavaj");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "javaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa" + "'", str1, "javaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
    }

    @Test
    public void test37558() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest75.test37558");
        java.lang.String str1 = org.apache.commons.lang3.ClassUtils.getShortClassName("                                                                                                                                                                                                                                                                                                                                                    JAVA.LANG.CLONEABLE...                                 INTERFACE JAVA.IO.SERIALIZABLE");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "SERIALIZABLE" + "'", str1, "SERIALIZABLE");
    }

    @Test
    public void test37559() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest75.test37559");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.contains("###########################j#########################################################################ArrjjArrjjArrjjArrjjArrjjArrjjArrj", (int) ' ');
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test37560() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest75.test37560");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("class java.lang.String", "                                   ");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.stripAll(strArray2);
        java.lang.Class<?>[] wildcardClassArray4 = org.apache.commons.lang3.ClassUtils.toClass((java.lang.Object[]) strArray3);
        java.lang.String[] strArray6 = new java.lang.String[] { "                                   " };
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.getCommonPrefix(strArray6);
        java.lang.Class<?>[] wildcardClassArray8 = org.apache.commons.lang3.ClassUtils.toClass((java.lang.Object[]) strArray6);
        java.lang.Class<?>[] wildcardClassArray9 = org.apache.commons.lang3.ClassUtils.primitivesToWrappers(wildcardClassArray8);
        boolean boolean11 = org.apache.commons.lang3.ClassUtils.isAssignable(wildcardClassArray4, wildcardClassArray8, false);
        java.lang.String str13 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) wildcardClassArray8, "");
        java.lang.String str14 = org.apache.commons.lang3.StringUtils.concat((java.lang.Object[]) wildcardClassArray8);
        java.lang.String[] strArray16 = org.apache.commons.lang3.StringUtils.splitByCharacterType("... AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA... AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA... AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA... AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA... AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA... AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA... AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA... AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA... AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA... AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA");
        java.lang.Class<?>[] wildcardClassArray17 = org.apache.commons.lang3.ClassUtils.toClass((java.lang.Object[]) strArray16);
        java.lang.Class<?>[] wildcardClassArray18 = org.apache.commons.lang3.ClassUtils.primitivesToWrappers(wildcardClassArray17);
        java.lang.Class<?>[] wildcardClassArray19 = org.apache.commons.lang3.ClassUtils.wrappersToPrimitives(wildcardClassArray18);
        java.lang.String str20 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) wildcardClassArray18);
        boolean boolean21 = org.apache.commons.lang3.ClassUtils.isAssignable(wildcardClassArray8, wildcardClassArray18);
        java.lang.Class<?>[] wildcardClassArray22 = org.apache.commons.lang3.ClassUtils.wrappersToPrimitives(wildcardClassArray8);
        java.lang.String[] strArray24 = new java.lang.String[] { "                                   " };
        java.lang.String str25 = org.apache.commons.lang3.StringUtils.getCommonPrefix(strArray24);
        java.lang.Class<?>[] wildcardClassArray26 = org.apache.commons.lang3.ClassUtils.toClass((java.lang.Object[]) strArray24);
        java.lang.Class<?> wildcardClass27 = null;
        java.lang.Class[] classArray29 = new java.lang.Class[1];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray30 = (java.lang.Class<?>[]) classArray29;
        wildcardClassArray30[0] = wildcardClass27;
        java.lang.Class<?>[] wildcardClassArray33 = org.apache.commons.lang3.ClassUtils.primitivesToWrappers(wildcardClassArray30);
        boolean boolean34 = org.apache.commons.lang3.ClassUtils.isAssignable(wildcardClassArray26, wildcardClassArray30);
        java.lang.String str38 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) wildcardClassArray30, "$", 18, (int) (byte) 1);
        java.lang.Class<?>[] wildcardClassArray39 = org.apache.commons.lang3.ClassUtils.primitivesToWrappers(wildcardClassArray30);
        java.lang.Class<?>[] wildcardClassArray40 = org.apache.commons.lang3.ClassUtils.toClass((java.lang.Object[]) wildcardClassArray30);
        java.lang.String str42 = org.apache.commons.lang3.ClassUtils.getPackageCanonicalName((java.lang.Object) wildcardClassArray30, "");
        boolean boolean44 = org.apache.commons.lang3.ClassUtils.isAssignable(wildcardClassArray8, wildcardClassArray30, true);
        java.lang.String[] strArray46 = org.apache.commons.lang3.StringUtils.splitByCharacterType("... AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA... AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA... AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA... AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA... AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA... AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA... AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA... AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA... AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA... AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA");
        java.lang.Class<?>[] wildcardClassArray47 = org.apache.commons.lang3.ClassUtils.toClass((java.lang.Object[]) strArray46);
        java.lang.Class<?>[] wildcardClassArray48 = org.apache.commons.lang3.ClassUtils.primitivesToWrappers(wildcardClassArray47);
        java.lang.Class<?>[] wildcardClassArray49 = org.apache.commons.lang3.ClassUtils.wrappersToPrimitives(wildcardClassArray48);
        java.lang.String[] strArray52 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("hi!", "");
        java.lang.String[] strArray54 = org.apache.commons.lang3.StringUtils.stripAll(strArray52, "$");
        java.lang.Class<?>[] wildcardClassArray55 = org.apache.commons.lang3.ClassUtils.toClass((java.lang.Object[]) strArray52);
        java.lang.String[] strArray58 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("hi!", "");
        java.lang.String[] strArray60 = org.apache.commons.lang3.StringUtils.stripAll(strArray58, "$");
        java.lang.Class<?>[] wildcardClassArray61 = org.apache.commons.lang3.ClassUtils.toClass((java.lang.Object[]) strArray58);
        java.lang.Class<?> wildcardClass62 = null;
        java.lang.Class[] classArray64 = new java.lang.Class[1];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray65 = (java.lang.Class<?>[]) classArray64;
        wildcardClassArray65[0] = wildcardClass62;
        java.lang.Class<?>[] wildcardClassArray68 = org.apache.commons.lang3.ClassUtils.primitivesToWrappers(wildcardClassArray65);
        java.lang.String[] strArray70 = new java.lang.String[] { "                                   " };
        java.lang.String str71 = org.apache.commons.lang3.StringUtils.getCommonPrefix(strArray70);
        java.lang.Class<?>[] wildcardClassArray72 = org.apache.commons.lang3.ClassUtils.toClass((java.lang.Object[]) strArray70);
        java.lang.Class<?> wildcardClass73 = null;
        java.lang.Class[] classArray75 = new java.lang.Class[1];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray76 = (java.lang.Class<?>[]) classArray75;
        wildcardClassArray76[0] = wildcardClass73;
        java.lang.Class<?>[] wildcardClassArray79 = org.apache.commons.lang3.ClassUtils.primitivesToWrappers(wildcardClassArray76);
        boolean boolean80 = org.apache.commons.lang3.ClassUtils.isAssignable(wildcardClassArray72, wildcardClassArray76);
        boolean boolean82 = org.apache.commons.lang3.ClassUtils.isAssignable(wildcardClassArray65, wildcardClassArray76, true);
        boolean boolean84 = org.apache.commons.lang3.ClassUtils.isAssignable(wildcardClassArray61, wildcardClassArray76, false);
        java.lang.Class<?>[] wildcardClassArray85 = org.apache.commons.lang3.ClassUtils.primitivesToWrappers(wildcardClassArray61);
        boolean boolean86 = org.apache.commons.lang3.ClassUtils.isAssignable(wildcardClassArray55, wildcardClassArray85);
        java.lang.Class<?>[] wildcardClassArray87 = org.apache.commons.lang3.ClassUtils.wrappersToPrimitives(wildcardClassArray85);
        boolean boolean88 = org.apache.commons.lang3.ClassUtils.isAssignable(wildcardClassArray48, wildcardClassArray85);
        java.lang.Class<?>[] wildcardClassArray89 = org.apache.commons.lang3.ClassUtils.wrappersToPrimitives(wildcardClassArray85);
        java.lang.Class<?>[] wildcardClassArray90 = org.apache.commons.lang3.ClassUtils.primitivesToWrappers(wildcardClassArray89);
        java.lang.Class<?>[] wildcardClassArray91 = org.apache.commons.lang3.ClassUtils.primitivesToWrappers(wildcardClassArray89);
        boolean boolean93 = org.apache.commons.lang3.ClassUtils.isAssignable(wildcardClassArray8, wildcardClassArray89, true);
        java.lang.Class<?>[] wildcardClassArray94 = org.apache.commons.lang3.ClassUtils.primitivesToWrappers(wildcardClassArray8);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertNotNull(wildcardClassArray4);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "                                   " + "'", str7, "                                   ");
        org.junit.Assert.assertNotNull(wildcardClassArray8);
        org.junit.Assert.assertNotNull(wildcardClassArray9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "class java.lang.String" + "'", str13, "class java.lang.String");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "class java.lang.String" + "'", str14, "class java.lang.String");
        org.junit.Assert.assertNotNull(strArray16);
        org.junit.Assert.assertNotNull(wildcardClassArray17);
        org.junit.Assert.assertNotNull(wildcardClassArray18);
        org.junit.Assert.assertNotNull(wildcardClassArray19);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "class java.lang.Stringclass java.lang.Stringclass java.lang.Stringclass java.lang.Stringclass java.lang.Stringclass java.lang.Stringclass java.lang.Stringclass java.lang.Stringclass java.lang.Stringclass java.lang.Stringclass java.lang.Stringclass java.lang.Stringclass java.lang.Stringclass java.lang.Stringclass java.lang.Stringclass java.lang.Stringclass java.lang.Stringclass java.lang.Stringclass java.lang.Stringclass java.lang.Stringclass java.lang.Stringclass java.lang.Stringclass java.lang.Stringclass java.lang.Stringclass java.lang.Stringclass java.lang.Stringclass java.lang.Stringclass java.lang.Stringclass java.lang.Stringclass java.lang.String" + "'", str20, "class java.lang.Stringclass java.lang.Stringclass java.lang.Stringclass java.lang.Stringclass java.lang.Stringclass java.lang.Stringclass java.lang.Stringclass java.lang.Stringclass java.lang.Stringclass java.lang.Stringclass java.lang.Stringclass java.lang.Stringclass java.lang.Stringclass java.lang.Stringclass java.lang.Stringclass java.lang.Stringclass java.lang.Stringclass java.lang.Stringclass java.lang.Stringclass java.lang.Stringclass java.lang.Stringclass java.lang.Stringclass java.lang.Stringclass java.lang.Stringclass java.lang.Stringclass java.lang.Stringclass java.lang.Stringclass java.lang.Stringclass java.lang.Stringclass java.lang.String");
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(wildcardClassArray22);
        org.junit.Assert.assertNotNull(strArray24);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "                                   " + "'", str25, "                                   ");
        org.junit.Assert.assertNotNull(wildcardClassArray26);
        org.junit.Assert.assertNotNull(classArray29);
        org.junit.Assert.assertNotNull(wildcardClassArray30);
        org.junit.Assert.assertNotNull(wildcardClassArray33);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "" + "'", str38, "");
        org.junit.Assert.assertNotNull(wildcardClassArray39);
        org.junit.Assert.assertNotNull(wildcardClassArray40);
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "java.lang" + "'", str42, "java.lang");
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertNotNull(strArray46);
        org.junit.Assert.assertNotNull(wildcardClassArray47);
        org.junit.Assert.assertNotNull(wildcardClassArray48);
        org.junit.Assert.assertNotNull(wildcardClassArray49);
        org.junit.Assert.assertNotNull(strArray52);
        org.junit.Assert.assertNotNull(strArray54);
        org.junit.Assert.assertNotNull(wildcardClassArray55);
        org.junit.Assert.assertNotNull(strArray58);
        org.junit.Assert.assertNotNull(strArray60);
        org.junit.Assert.assertNotNull(wildcardClassArray61);
        org.junit.Assert.assertNotNull(classArray64);
        org.junit.Assert.assertNotNull(wildcardClassArray65);
        org.junit.Assert.assertNotNull(wildcardClassArray68);
        org.junit.Assert.assertNotNull(strArray70);
        org.junit.Assert.assertEquals("'" + str71 + "' != '" + "                                   " + "'", str71, "                                   ");
        org.junit.Assert.assertNotNull(wildcardClassArray72);
        org.junit.Assert.assertNotNull(classArray75);
        org.junit.Assert.assertNotNull(wildcardClassArray76);
        org.junit.Assert.assertNotNull(wildcardClassArray79);
        org.junit.Assert.assertTrue("'" + boolean80 + "' != '" + false + "'", boolean80 == false);
        org.junit.Assert.assertTrue("'" + boolean82 + "' != '" + false + "'", boolean82 == false);
        org.junit.Assert.assertTrue("'" + boolean84 + "' != '" + false + "'", boolean84 == false);
        org.junit.Assert.assertNotNull(wildcardClassArray85);
        org.junit.Assert.assertTrue("'" + boolean86 + "' != '" + true + "'", boolean86 == true);
        org.junit.Assert.assertNotNull(wildcardClassArray87);
        org.junit.Assert.assertTrue("'" + boolean88 + "' != '" + false + "'", boolean88 == false);
        org.junit.Assert.assertNotNull(wildcardClassArray89);
        org.junit.Assert.assertNotNull(wildcardClassArray90);
        org.junit.Assert.assertNotNull(wildcardClassArray91);
        org.junit.Assert.assertTrue("'" + boolean93 + "' != '" + false + "'", boolean93 == false);
        org.junit.Assert.assertNotNull(wildcardClassArray94);
    }

    @Test
    public void test37561() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest75.test37561");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.swapCase("........................");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "........................" + "'", str1, "........................");
    }

    @Test
    public void test37562() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest75.test37562");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("gnal.avaj");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray2);
        java.lang.String[] strArray5 = new java.lang.String[] { "                                   " };
        java.lang.String str6 = org.apache.commons.lang3.StringUtils.getCommonPrefix(strArray5);
        int int7 = org.apache.commons.lang3.StringUtils.indexOfDifference((java.lang.CharSequence[]) strArray5);
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.replaceEach("INTERFACEJAVA.LANG.cLONEABLE#INTERFACEJAVA.IOINTERFACEJAVA.LANG.cLONEABLE#INTERFACEJAVA.IOINTERFACEJAVA.LANG.cLONEABLE#INTERFACEJAVA.IOINTERFACEJAVABooleanINTERFACEJAVA.LANG.cLONEABLE#INTERFACEJAVA.IOINTERFACEJAVA.LANG.cLONEABLE#INTERFACEJAVA.IOINTERFACEJAVA.LANG.cLONEABLE#INTERFACEJAVA.IOINTERFACEJAVA", strArray2, strArray5);
        java.lang.Class<?>[] wildcardClassArray9 = org.apache.commons.lang3.ClassUtils.toClass((java.lang.Object[]) strArray2);
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
        java.lang.String[] strArray33 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("class java.lang.String", "                                   ");
        java.lang.String[] strArray34 = org.apache.commons.lang3.StringUtils.stripAll(strArray33);
        java.lang.Class<?>[] wildcardClassArray35 = org.apache.commons.lang3.ClassUtils.toClass((java.lang.Object[]) strArray34);
        java.lang.Class<?>[] wildcardClassArray36 = org.apache.commons.lang3.ClassUtils.primitivesToWrappers(wildcardClassArray35);
        boolean boolean37 = org.apache.commons.lang3.ClassUtils.isAssignable(wildcardClassArray24, wildcardClassArray36);
        boolean boolean39 = org.apache.commons.lang3.ClassUtils.isAssignable(wildcardClassArray9, wildcardClassArray36, true);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "gnal.avaj" + "'", str3, "gnal.avaj");
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "                                   " + "'", str6, "                                   ");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "INTERFACEJAVA.LANG.cLONEABLE#INTERFACEJAVA.IOINTERFACEJAVA.LANG.cLONEABLE#INTERFACEJAVA.IOINTERFACEJAVA.LANG.cLONEABLE#INTERFACEJAVA.IOINTERFACEJAVABooleanINTERFACEJAVA.LANG.cLONEABLE#INTERFACEJAVA.IOINTERFACEJAVA.LANG.cLONEABLE#INTERFACEJAVA.IOINTERFACEJAVA.LANG.cLONEABLE#INTERFACEJAVA.IOINTERFACEJAVA" + "'", str8, "INTERFACEJAVA.LANG.cLONEABLE#INTERFACEJAVA.IOINTERFACEJAVA.LANG.cLONEABLE#INTERFACEJAVA.IOINTERFACEJAVA.LANG.cLONEABLE#INTERFACEJAVA.IOINTERFACEJAVABooleanINTERFACEJAVA.LANG.cLONEABLE#INTERFACEJAVA.IOINTERFACEJAVA.LANG.cLONEABLE#INTERFACEJAVA.IOINTERFACEJAVA.LANG.cLONEABLE#INTERFACEJAVA.IOINTERFACEJAVA");
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
        org.junit.Assert.assertNotNull(strArray33);
        org.junit.Assert.assertNotNull(strArray34);
        org.junit.Assert.assertNotNull(wildcardClassArray35);
        org.junit.Assert.assertNotNull(wildcardClassArray36);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
    }

    @Test
    public void test37563() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest75.test37563");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.leftPad("#############################################################...", 168, 'a');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa#############################################################..." + "'", str3, "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa#############################################################...");
    }

    @Test
    public void test37564() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest75.test37564");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfIgnoreCase("###############################java.utiljava.utilarra", "...                     INTERFACE JAVA.LANG.CLONEABLE...                                 INTERFAC...");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test37565() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest75.test37565");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("       ", "AGNaaaaaaaaaaJAARRAYLISTARRAYLISTARRAYLISTAVAJ");
        int int3 = org.apache.commons.lang3.StringUtils.indexOfDifference((java.lang.CharSequence[]) strArray2);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test37566() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest75.test37566");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBefore("INTERFACE JAVA.LANG.cLONEABLE$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$INTERFACE JAVA.IO.sERIALIZABLE", "Va.langGNAL..la...");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "INTERFACE JAVA.LANG.cLONEABLE$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$INTERFACE JAVA.IO.sERIALIZABLE" + "'", str2, "INTERFACE JAVA.LANG.cLONEABLE$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$INTERFACE JAVA.IO.sERIALIZABLE");
    }

    @Test
    public void test37567() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest75.test37567");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.lowerCase("44444444444444444444444444444444444444444444444444444444");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "44444444444444444444444444444444444444444444444444444444" + "'", str1, "44444444444444444444444444444444444444444444444444444444");
    }

    @Test
    public void test37568() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest75.test37568");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.defaultString("                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                        ][gnirtSlitu.avaj1-", "interface java.lang.Cloneable.......java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........javainterface java.io.Serializabl");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                        ][gnirtSlitu.avaj1-" + "'", str2, "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                        ][gnirtSlitu.avaj1-");
    }

    @Test
    public void test37569() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest75.test37569");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.substring("aaaaa.............................................................lang                                                                                    aaaaa", 472, 536);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test37570() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest75.test37570");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBetween("...AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA...AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA...AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA...AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA...AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA...AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA...AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA...AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA...AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA..", "FAVAJ.GNALAVA$$$.JAVA$$$.JAVA$$$.JAVA$$$.JAVA$$$.$$$$$$$$$$$$$$$$$$$$$$$$$$$$$...$$$$$$$$$$$$$$$$$$$$$$$$$$$$$...$$$$$$$$$$$$$$$$$$$$$$$$$$$$$...$$$.JAVA$$$.JAVA$$$.JAVA$$$.JAVA$$$.JAVA$$$.JAVA$$$.JAVA$$$.JAVA$$$.JAVA$$$.JAVA$$$.JAVA$$$.JAVA$$$.JAVA$$$.JAVA$$$.JAVA$$$.JAVA$$$.JAVA$$$.JAVA$$$.JAVA$$$.JAVA$$$.JAVA$$$.JAVA$$$.JAVA$$$.JAVA$$$.JAVAINTERFACE JAVA.IO.SERIALIZABLE");
        org.junit.Assert.assertNull(str2);
    }

    @Test
    public void test37571() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest75.test37571");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripToNull("Cloneable4i");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Cloneable4i" + "'", str1, "Cloneable4i");
    }

    @Test
    public void test37572() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest75.test37572");
        int int3 = org.apache.commons.lang3.StringUtils.indexOf(".........java..........java...........", "y..............................ObjectyList..............................O", (-1));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test37573() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest75.test37573");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlpha((java.lang.CharSequence) "JAVA..........JAVA..........JAVA..........JA...");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test37574() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest75.test37574");
        java.lang.String str2 = org.apache.commons.lang3.ClassUtils.getPackageName((java.lang.Object) "AL.AGNAAAAAAAAAAJAVAL.AGNAAAAAAAAAAJAVAL.AGNAAAAAAAAAAJAVAL.AGNAAAAAAAAAAJAVAL.AGNAAAAAAAAAAJAVAL.AGNAAAAAAAAAAJAVAL.AGNAAAAAAAAAAJAVAL.AGNAAAAAAAAAAJA                                              AAAAAAAJAVAL.AGNAAAAAAAAAAJAVAL.AGNAAAAAAAAAAJAVAL.AGNAAAAAAAAAAJAVAL.AGNAAAAAAAAAAJAVAL.AGNAAAAAAAAAAJAVAL.AGNAAAAAAAAAAJAVAL.AGNAAAAAAAAAAJAVAL.AGNAAAAAAAAAAJAVAL.AGNAAAAAAAAAAJAVAL.AGNAAAAAAAAAAJAVAL.AGNAAAAAAAAAAJAVAL.AGNAAAAAAAAAARING", "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "java.lang" + "'", str2, "java.lang");
    }

    @Test
    public void test37575() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest75.test37575");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "4444444444444JAVA.LANGAGNAL.AVAJGNAL..LANGGNAL.AVARRCLASSJAVA.LANG.OBJECTYLISTARRCLASSJAVA.LANG.OBJECTYLISTA", "GNALUAVAJGNALUAVAJGNALUAVAJGNALUAVAJGNALUAVAJGNALUAVAJGNALUAVAJGNALUAVAJGNALUAVAJGNALUAVAJGNALUAVAJGNALUAVAJGNALUAVAJGNALUAVAJGNALUAVAJGNALUAVAJGNALUAVAJGNALUAVAJGNALUAVAJGNALUAVAJSSALCGNALAVAJSSALC                                                                                                                                                                                                                                                                                                                                                                                          SLITuGNIRTsSLITuGNIRTsSLITuGNIRTsSLITuGNIRTsS");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test37576() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest75.test37576");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBeforeLast("ArrayListArrayListArrayListavaj.gnal                                           INTEGER                                       ", "interface java.lang.CloneableAVAJGNALjavajavajavajavajavajavajavgnal                                                                interface java.io.Serializable");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "ArrayListArrayListArrayListavaj.gnal                                           INTEGER                                       " + "'", str2, "ArrayListArrayListArrayListavaj.gnal                                           INTEGER                                       ");
    }

    @Test
    public void test37577() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest75.test37577");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.split("                                                                  irfCo$irfioSrA..ayL A.444444444444444444444444444", '$');
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test37578() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest75.test37578");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.remove("                A..AYL A.44444444444444444444444444                                                 javalgnal.avajgnal.avajgnal.avajgnal.avajgnal.avajgnal.avajgnal.avajgnal.avajgnal.avajgnal.aG.JAVAGNAL.AVAJLANG.J######################", '#');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                A..AYL A.44444444444444444444444444                                                 javalgnal.avajgnal.avajgnal.avajgnal.avajgnal.avajgnal.avajgnal.avajgnal.avajgnal.avajgnal.aG.JAVAGNAL.AVAJLANG.J" + "'", str2, "                A..AYL A.44444444444444444444444444                                                 javalgnal.avajgnal.avajgnal.avajgnal.avajgnal.avajgnal.avajgnal.avajgnal.avajgnal.avajgnal.aG.JAVAGNAL.AVAJLANG.J");
    }

    @Test
    public void test37579() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest75.test37579");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trim("JAVA.UTILJAVA.UTILStringcJAVA.UTILJAVA.UTILStringcJAVA.UTILJAVA.UTILStringcJAVA.UTILJAVA.UTILStringcJAVA.UTILJAVA.UTILStringcJAVA.UTILJAVA.UTILStringcJAVA.UTILJAVA.UTILStringcJAVA.UTILJAVA.UTILStringcJAVA.UTILJAVA.UTILStringcJAVA.UTILJAVA.UTILStringcJAVA.UTILJAVA.UTILStringcJAVA.UTILJAVA.UTILStringcJAVA.UTILJAVA.UTILStringcJAVA.UTILJAVA.UTILStringcJAVA.UTILJAVA.UTILStringcJAVA.UTILJAVA.UTILStringcJAVA.UTILJAVA.UTILStringcJAVA.UTILJAVA.UTILStringcJAVA.UTILJAVA.UTILStringcJAVA.UTILJAVA.UTILStringcJAVA.UTILJAVA.UTILStringcJAVA.UTILJAVA.UTILStringcJAVA.UTILJAVA");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "JAVA.UTILJAVA.UTILStringcJAVA.UTILJAVA.UTILStringcJAVA.UTILJAVA.UTILStringcJAVA.UTILJAVA.UTILStringcJAVA.UTILJAVA.UTILStringcJAVA.UTILJAVA.UTILStringcJAVA.UTILJAVA.UTILStringcJAVA.UTILJAVA.UTILStringcJAVA.UTILJAVA.UTILStringcJAVA.UTILJAVA.UTILStringcJAVA.UTILJAVA.UTILStringcJAVA.UTILJAVA.UTILStringcJAVA.UTILJAVA.UTILStringcJAVA.UTILJAVA.UTILStringcJAVA.UTILJAVA.UTILStringcJAVA.UTILJAVA.UTILStringcJAVA.UTILJAVA.UTILStringcJAVA.UTILJAVA.UTILStringcJAVA.UTILJAVA.UTILStringcJAVA.UTILJAVA.UTILStringcJAVA.UTILJAVA.UTILStringcJAVA.UTILJAVA.UTILStringcJAVA.UTILJAVA" + "'", str1, "JAVA.UTILJAVA.UTILStringcJAVA.UTILJAVA.UTILStringcJAVA.UTILJAVA.UTILStringcJAVA.UTILJAVA.UTILStringcJAVA.UTILJAVA.UTILStringcJAVA.UTILJAVA.UTILStringcJAVA.UTILJAVA.UTILStringcJAVA.UTILJAVA.UTILStringcJAVA.UTILJAVA.UTILStringcJAVA.UTILJAVA.UTILStringcJAVA.UTILJAVA.UTILStringcJAVA.UTILJAVA.UTILStringcJAVA.UTILJAVA.UTILStringcJAVA.UTILJAVA.UTILStringcJAVA.UTILJAVA.UTILStringcJAVA.UTILJAVA.UTILStringcJAVA.UTILJAVA.UTILStringcJAVA.UTILJAVA.UTILStringcJAVA.UTILJAVA.UTILStringcJAVA.UTILJAVA.UTILStringcJAVA.UTILJAVA.UTILStringcJAVA.UTILJAVA.UTILStringcJAVA.UTILJAVA");
    }

    @Test
    public void test37580() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest75.test37580");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsIgnoreCase("...avaj..........avaj..........avaj", "");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test37581() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest75.test37581");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfIgnoreCase("", "elbzilireS.oi.vj ecfretnivj..........vtcejbO.......vj.......elbenolC.gnl");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test37582() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest75.test37582");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.leftPad("IRFcO$IRFIOsRIIZ", 714, '$');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$IRFcO$IRFIOsRIIZ" + "'", str3, "$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$IRFcO$IRFIOsRIIZ");
    }

    @Test
    public void test37583() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest75.test37583");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.split("A..yL A.4444444444...", '4');
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test37584() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest75.test37584");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.right("aaaaaaggginterfaeajavaglanggaloneablegggggggjavaggggggggggjavaggggggggggjavaggggggggggjavaggggggggggjavaggggggggggjavaggggggggggjavaggggggggggjavaggggggggggjavaggggggggggjavaggggggggggjavaggggggggggjavaggggggggggjavaggggggggggjavaggggggggggjavaggggggggggjavaggggggggggjavaggggggggggjavaggggggggggjavaggggggggggjavaggggggggggjavaggggggggggjavaggggggggggjavaggggggggggjavaggggggggggjavaggggggggggjavaggggggggggjavaggggggggggjavaggggggggggjavaggggggggggjavaggggggggggjavaggggggggggjavaggggggggggjavaggggggggggjavaggggggggggjavainterfaeajavagiogSerializableinterfaeajavaglanggaloneablegggggggjavaggggggggggjavaggggggggggjavaggggggggggjavaggggggggggjavaggggggggggjavaggggggggggjavaggggggggggjavaggggggggggjavaggggggggggjavaggggggggggjavaggggggggggjavaggggggggggjavaggggggggggjavaggggggggggjavaggggggggggjavaggggggggggjavaggggggggggjavaggggggggggjavaggggggggggjavaggggggggggjavaggggggggggjavaggggggggggjavaggggggggggjavaggggggggggjavaggggggggggja", 935);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "aggginterfaeajavaglanggaloneablegggggggjavaggggggggggjavaggggggggggjavaggggggggggjavaggggggggggjavaggggggggggjavaggggggggggjavaggggggggggjavaggggggggggjavaggggggggggjavaggggggggggjavaggggggggggjavaggggggggggjavaggggggggggjavaggggggggggjavaggggggggggjavaggggggggggjavaggggggggggjavaggggggggggjavaggggggggggjavaggggggggggjavaggggggggggjavaggggggggggjavaggggggggggjavaggggggggggjavaggggggggggjavaggggggggggjavaggggggggggjavaggggggggggjavaggggggggggjavaggggggggggjavaggggggggggjavaggggggggggjavaggggggggggjavaggggggggggjavainterfaeajavagiogSerializableinterfaeajavaglanggaloneablegggggggjavaggggggggggjavaggggggggggjavaggggggggggjavaggggggggggjavaggggggggggjavaggggggggggjavaggggggggggjavaggggggggggjavaggggggggggjavaggggggggggjavaggggggggggjavaggggggggggjavaggggggggggjavaggggggggggjavaggggggggggjavaggggggggggjavaggggggggggjavaggggggggggjavaggggggggggjavaggggggggggjavaggggggggggjavaggggggggggjavaggggggggggjavaggggggggggjavaggggggggggja" + "'", str2, "aggginterfaeajavaglanggaloneablegggggggjavaggggggggggjavaggggggggggjavaggggggggggjavaggggggggggjavaggggggggggjavaggggggggggjavaggggggggggjavaggggggggggjavaggggggggggjavaggggggggggjavaggggggggggjavaggggggggggjavaggggggggggjavaggggggggggjavaggggggggggjavaggggggggggjavaggggggggggjavaggggggggggjavaggggggggggjavaggggggggggjavaggggggggggjavaggggggggggjavaggggggggggjavaggggggggggjavaggggggggggjavaggggggggggjavaggggggggggjavaggggggggggjavaggggggggggjavaggggggggggjavaggggggggggjavaggggggggggjavaggggggggggjavaggggggggggjavainterfaeajavagiogSerializableinterfaeajavaglanggaloneablegggggggjavaggggggggggjavaggggggggggjavaggggggggggjavaggggggggggjavaggggggggggjavaggggggggggjavaggggggggggjavaggggggggggjavaggggggggggjavaggggggggggjavaggggggggggjavaggggggggggjavaggggggggggjavaggggggggggjavaggggggggggjavaggggggggggjavaggggggggggjavaggggggggggjavaggggggggggjavaggggggggggjavaggggggggggjavaggggggggggjavaggggggggggjavaggggggggggjavaggggggggggja");
    }

    @Test
    public void test37585() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest75.test37585");
        java.util.Locale locale1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.apache.commons.lang3.StringUtils.lowerCase("      AAAAAAAAAAAAAAAAAAA                                                                                                                                              AAAAAAAAAAAAAAAAAAA                                                                                                                                              AAAAAAAAAAAAAAAAAAA                                                                                                                                              AAAAAAAAAAAAAAAAAAA                                                                                                                                              AAAAAAAAAAAAAAAAAAA                                                                                                                                              AAAAAAAAAAAAAAAAAAA", locale1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test37586() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest75.test37586");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.split("jAVA.LANGAgnal.avajgnal..LANGgnal.avArrclass java.lang.ObjectyListAr...", '.');
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test37587() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest75.test37587");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.chomp("INTERFACE JAVA.LANG.cLONEABLEa RRR RRR RRR RRR RRR RRR RRR RRR RNAL....................INTERFACE JAVA.LAN");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "INTERFACE JAVA.LANG.cLONEABLEa RRR RRR RRR RRR RRR RRR RRR RRR RNAL....................INTERFACE JAVA.LAN" + "'", str1, "INTERFACE JAVA.LANG.cLONEABLEa RRR RRR RRR RRR RRR RRR RRR RRR RNAL....................INTERFACE JAVA.LAN");
    }

    @Test
    public void test37588() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest75.test37588");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.defaultString("4444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444Java.litu.avajlitu.avajjava.litu.avajlitu.avajjava.litu.avajlitu.avajjava.litu.avajlitu.avajjava.litu.avajlitu.avajjava.litu.avajlitu.avajjava.litu.avajlitu.avajjava.litu.avajlitu.avajjava.litu.avajlitu.avajjava.litu.avajlitu.avajjava.litu.avajlitu.avajjava.litu.avajlitu.avajjava.litu.avajlitu.avajjava.litu.avajlitu.avajjava.litu.avajlitu.avajjava.litu.avajlitu.avajjava.litu.avajlitu.avajjava.litu.avajlitu.avajjava.litu.avajlitu.avajjava.litu.avajlitu.avajjava.litu.avajlitu.avajjava.litu.avajlitu.avajjava.litu.avajlitu.avajjava.litu.avajlitu.avajjava.litu.avajlitu.avajjava.litu.avajlitu.avajjava.litu.avajlitu.avajjava.litu.avajlitu.avajjava.litu.avajlitu.avajjava.litu.avajlitu.avajjava.litu.avajlitu.avajjava.litu.avajlitu.avajjava.litu.avajlitu.avaj");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "4444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444Java.litu.avajlitu.avajjava.litu.avajlitu.avajjava.litu.avajlitu.avajjava.litu.avajlitu.avajjava.litu.avajlitu.avajjava.litu.avajlitu.avajjava.litu.avajlitu.avajjava.litu.avajlitu.avajjava.litu.avajlitu.avajjava.litu.avajlitu.avajjava.litu.avajlitu.avajjava.litu.avajlitu.avajjava.litu.avajlitu.avajjava.litu.avajlitu.avajjava.litu.avajlitu.avajjava.litu.avajlitu.avajjava.litu.avajlitu.avajjava.litu.avajlitu.avajjava.litu.avajlitu.avajjava.litu.avajlitu.avajjava.litu.avajlitu.avajjava.litu.avajlitu.avajjava.litu.avajlitu.avajjava.litu.avajlitu.avajjava.litu.avajlitu.avajjava.litu.avajlitu.avajjava.litu.avajlitu.avajjava.litu.avajlitu.avajjava.litu.avajlitu.avajjava.litu.avajlitu.avajjava.litu.avajlitu.avajjava.litu.avajlitu.avajjava.litu.avajlitu.avaj" + "'", str1, "4444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444Java.litu.avajlitu.avajjava.litu.avajlitu.avajjava.litu.avajlitu.avajjava.litu.avajlitu.avajjava.litu.avajlitu.avajjava.litu.avajlitu.avajjava.litu.avajlitu.avajjava.litu.avajlitu.avajjava.litu.avajlitu.avajjava.litu.avajlitu.avajjava.litu.avajlitu.avajjava.litu.avajlitu.avajjava.litu.avajlitu.avajjava.litu.avajlitu.avajjava.litu.avajlitu.avajjava.litu.avajlitu.avajjava.litu.avajlitu.avajjava.litu.avajlitu.avajjava.litu.avajlitu.avajjava.litu.avajlitu.avajjava.litu.avajlitu.avajjava.litu.avajlitu.avajjava.litu.avajlitu.avajjava.litu.avajlitu.avajjava.litu.avajlitu.avajjava.litu.avajlitu.avajjava.litu.avajlitu.avajjava.litu.avajlitu.avajjava.litu.avajlitu.avajjava.litu.avajlitu.avajjava.litu.avajlitu.avajjava.litu.avajlitu.avajjava.litu.avajlitu.avaj");
    }

    @Test
    public void test37589() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest75.test37589");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripToNull("                                             ...                                                    ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "..." + "'", str1, "...");
    }

    @Test
    public void test37590() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest75.test37590");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.center("interface java.lang.Cloneable.litinterface java.io.erializable                                                                                                                                                                                                                                                                                                                                                                                                                                                                  ", 135, "slitUgnirtSslitUgnirtSslitUgnirtSslitUgnirtSslitUgnirtSslitUgnirtSslitUgnirtSslitUgnirtSslitUgnirtSslitUgnirtslitUgnirtSslitUgnirtSslitUgnirtSslitUgnirtSslitUgnirtSslitUgnirtSslitUgnirtSslitUgnirtSslitUgnirtSslitUgnirtslitUgnirtSslitUgnirtSslitUgnirtSslitUgnirtSslitUgnirtSslitUgnirtSslgnalslitUgnirtSslitUgnirtSslitUgnirtSslitUgnirtSslitUgnirtSslitUgnirtSslitUgnirtSslitUgnirtSslitUgnirtSslitUgnirtslitUgnirtSslitUgnirtSslitUgnirtSslitUgnirtSslitUgnirtSslitUgnirtSslitUgnirtSslitUgnirtSslitUgnirtSslitUgnirtslitUgnirtSslitUgnirtSslitUgnirtSslitUgnirtSslitUgnirtSslitUgnirtSsl");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "interface java.lang.Cloneable.litinterface java.io.erializable                                                                                                                                                                                                                                                                                                                                                                                                                                                                  " + "'", str3, "interface java.lang.Cloneable.litinterface java.io.erializable                                                                                                                                                                                                                                                                                                                                                                                                                                                                  ");
    }

    @Test
    public void test37591() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest75.test37591");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.abbreviate("INTERFACE JAVA.LANG.CLONEABLELANG.GNALJAVA.LANGAVAJ.GNALJAVA.LANGAVAJ.GNALJAVA.LANGAVAJ.GNALJAVA.LANGAVAJ.GNALJAVA.LANGAVAJ.GNALJAVA.LANGAVAJ.GNALJAVA.LANGAVAJ.GNALJAVA.LANGAVAJ.JAVAINTERFACE JAVA.IO.SERIALIZABLE", 486);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "INTERFACE JAVA.LANG.CLONEABLELANG.GNALJAVA.LANGAVAJ.GNALJAVA.LANGAVAJ.GNALJAVA.LANGAVAJ.GNALJAVA.LANGAVAJ.GNALJAVA.LANGAVAJ.GNALJAVA.LANGAVAJ.GNALJAVA.LANGAVAJ.GNALJAVA.LANGAVAJ.JAVAINTERFACE JAVA.IO.SERIALIZABLE" + "'", str2, "INTERFACE JAVA.LANG.CLONEABLELANG.GNALJAVA.LANGAVAJ.GNALJAVA.LANGAVAJ.GNALJAVA.LANGAVAJ.GNALJAVA.LANGAVAJ.GNALJAVA.LANGAVAJ.GNALJAVA.LANGAVAJ.GNALJAVA.LANGAVAJ.GNALJAVA.LANGAVAJ.JAVAINTERFACE JAVA.IO.SERIALIZABLE");
    }

    @Test
    public void test37592() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest75.test37592");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitByCharacterType("javastringnalarraylistarraylistarraylistavaj.gnalarraylistarraylistarrayli");
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test37593() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest75.test37593");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.rightPad("$         $         $         $         $         $         $         $         $         $         $         $ ...", 110);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "$         $         $         $         $         $         $         $         $         $         $         $ ..." + "'", str2, "$         $         $         $         $         $         $         $         $         $         $         $ ...");
    }

    @Test
    public void test37594() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest75.test37594");
        java.lang.ClassLoader classLoader0 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass2 = org.apache.commons.lang3.ClassUtils.getClass(classLoader0, "tringcla44444444444444444444444444");
            org.junit.Assert.fail("Expected exception of type java.lang.ClassNotFoundException; message: tringcla44444444444444444444444444");
        } catch (java.lang.ClassNotFoundException e) {
            // Expected exception.
        }
    }

    @Test
    public void test37595() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest75.test37595");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass2 = org.apache.commons.lang3.ClassUtils.getClass("INTERFACE JAVA.LANG.cLONEABLEa RRR RRR RRR RRR RRR RRR RRR RRR RNAL....................INTERFACE JAVA.LANG", true);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassNotFoundException; message: INTERFACEJAVA/LANG/cLONEABLEaRRRRRRRRRRRRRRRRRRRRRRRRRNAL////////////////////INTERFACEJAVA/LANG");
        } catch (java.lang.ClassNotFoundException e) {
            // Expected exception.
        }
    }

    @Test
    public void test37596() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest75.test37596");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.center("gnal.aL.ArrayListgnal.aL.ArrayList", 483, '.');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "................................................................................................................................................................................................................................gnal.aL.ArrayListgnal.aL.ArrayList................................................................................................................................................................................................................................." + "'", str3, "................................................................................................................................................................................................................................gnal.aL.ArrayListgnal.aL.ArrayList.................................................................................................................................................................................................................................");
    }

    @Test
    public void test37597() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest75.test37597");
        java.util.Locale locale1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.apache.commons.lang3.StringUtils.upperCase("JAVATSILYARRATSILYARRATSILYARRA$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$", locale1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test37598() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest75.test37598");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOf("             Character             utilStri", "Arr                                                                               JLANGAVLANGALLANGANG                                                                                yListArr              Hi!ArrayLisaVAJ.GNALAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA       CharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharaArr                                                                               JLANGAVLANGALLANGANG                                                                                yListArr               ", 104);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test37599() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest75.test37599");
        java.lang.CharSequence charSequence0 = null;
        boolean boolean2 = org.apache.commons.lang3.StringUtils.equals(charSequence0, (java.lang.CharSequence) "-1jv.utilString-1jv.utilString");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test37600() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest75.test37600");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripToEmpty("Cloneable4i");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Cloneable4i" + "'", str1, "Cloneable4i");
    }

    @Test
    public void test37601() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest75.test37601");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.abbreviate(".....................", 938, 303);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "....................." + "'", str3, ".....................");
    }

    @Test
    public void test37602() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest75.test37602");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isEmpty((java.lang.CharSequence) "Aaaaaaaaaaaa                                                                            litulitulitulitulitul####litulitulitulitulitul");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test37603() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest75.test37603");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.leftPad(".lang.Stringclass j...                                                                                                                                                                                                                                                                                                                                                                                                                                                                                   ", 40, "... ... ... ... ... ... ... ... ...... ... ... ... ... ... ... ... ...... ... ... ... ... ... ... ...AAAAAAAAAAAAAAAAAAA      $$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + ".lang.Stringclass j...                                                                                                                                                                                                                                                                                                                                                                                                                                                                                   " + "'", str3, ".lang.Stringclass j...                                                                                                                                                                                                                                                                                                                                                                                                                                                                                   ");
    }

    @Test
    public void test37604() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest75.test37604");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.chop("aRRAYlISTaRRAYlISTaRRAYlISTAVAJAGNA");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "aRRAYlISTaRRAYlISTaRRAYlISTAVAJAGN" + "'", str1, "aRRAYlISTaRRAYlISTaRRAYlISTAVAJAGN");
    }

    @Test
    public void test37605() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest75.test37605");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOfIgnoreCase("4444444444444Ch.r", "", 181);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 17 + "'", int3 == 17);
    }

    @Test
    public void test37606() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest75.test37606");
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.replace("                                                                                                                                                                                                                                                                                                                                                        ArryListArryListArryListvjGNAL.AVAJLANG.JAVAGNAL.AVAJLANG.JAVAGNAL.AVAJLANG.JAVAGNAL.AVAJLANG.JAVAGNAL.AVAJLANG.JAVAGNAL.AVAJLANG.JAVAGNAL.AVAJLANG.JAVAGNAL.AVAJLANG.JAVAGNAL.AVAJgnl                                                                                                                                                                                                                                                                                                                                                                                           ", "gnalArrayListArrayListArrayListavaj.gnalArrayListArrayListArrayLi", "java.u", 830);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "                                                                                                                                                                                                                                                                                                                                                        ArryListArryListArryListvjGNAL.AVAJLANG.JAVAGNAL.AVAJLANG.JAVAGNAL.AVAJLANG.JAVAGNAL.AVAJLANG.JAVAGNAL.AVAJLANG.JAVAGNAL.AVAJLANG.JAVAGNAL.AVAJLANG.JAVAGNAL.AVAJLANG.JAVAGNAL.AVAJgnl                                                                                                                                                                                                                                                                                                                                                                                           " + "'", str4, "                                                                                                                                                                                                                                                                                                                                                        ArryListArryListArryListvjGNAL.AVAJLANG.JAVAGNAL.AVAJLANG.JAVAGNAL.AVAJLANG.JAVAGNAL.AVAJLANG.JAVAGNAL.AVAJLANG.JAVAGNAL.AVAJLANG.JAVAGNAL.AVAJLANG.JAVAGNAL.AVAJLANG.JAVAGNAL.AVAJgnl                                                                                                                                                                                                                                                                                                                                                                                           ");
    }

    @Test
    public void test37607() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest75.test37607");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("class javalangClass                       JAVAULANG                       JAVAULANG                       JAVAULANG                       JAVAULANG                       JAVAULANG                       JAVAULANG                       JAVAULANG                       JAVAULANG                       JAVAULANG                       JAVAULANG                       JAVAULANG                       JAVAULANG                       JAVAULANG                       JAVAULANG                       JAVAULANG                       JAVAULANG                       JAVAULANG                       JAVAULANG                       JAVAULANG                       JAVAULANG        ", "aaaaaaaa#AGNAAAAAAAAGNALaaaaaaaa", 168);
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void test37608() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest75.test37608");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.repeat("u", 948);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu" + "'", str2, "uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu");
    }

    @Test
    public void test37609() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest75.test37609");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.lowerCase("interface java.io.Serializable                                                                                                                                                                                                                                                                                                                                          ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "interface java.io.serializable                                                                                                                                                                                                                                                                                                                                          " + "'", str1, "interface java.io.serializable                                                                                                                                                                                                                                                                                                                                          ");
    }

    @Test
    public void test37610() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest75.test37610");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.chop("aTSIlYTCEJBoGNALAVAJSSALCRRaTSIlYTCEJBoGNALAVAJSSALCRRaVALANGgnalLANGJAVALANGagnalavajaTSIlYTCEJBoGNALAVAJSSALCRRaTSIlYTCEJBoGNALAVAJSSALCRRaVALANGgnalLANGJAVALANGagnalavajaTSIlYTCEJBoGNALAVAJSSALCRRaTSIlYTCEJBoGNALAVAJSSALCRRaVALANGgnalLANGJAVALANGagnalavajaTSIlYTCEJBoGNALAVAJSSALCRRaTSIlYTCEJsTRINGaTSIlYTCEJBoGNALAVAJSSALCRRaTSIlYTCEJBoGNALAVAJSSALCRRaVALANGgnalLANGJAVALANGagnalavajaTSIlYTCEJBoGNALAVAJSSALCRRaTSIlYTCEJBoGNALAVAJSSALCRRaVALANGgnalLANGJAVALANGagnalavajaTSIlYTCEJBoGNALAVAJSSALCRRaTSIlYTCEJBoGNALAVAJSSALCRRaVALANGgnalLANGJAVALANGagnalavajaTSIlYTCEJBoGNALAVAJSSALCRRaTSIlYTCEJB");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "aTSIlYTCEJBoGNALAVAJSSALCRRaTSIlYTCEJBoGNALAVAJSSALCRRaVALANGgnalLANGJAVALANGagnalavajaTSIlYTCEJBoGNALAVAJSSALCRRaTSIlYTCEJBoGNALAVAJSSALCRRaVALANGgnalLANGJAVALANGagnalavajaTSIlYTCEJBoGNALAVAJSSALCRRaTSIlYTCEJBoGNALAVAJSSALCRRaVALANGgnalLANGJAVALANGagnalavajaTSIlYTCEJBoGNALAVAJSSALCRRaTSIlYTCEJsTRINGaTSIlYTCEJBoGNALAVAJSSALCRRaTSIlYTCEJBoGNALAVAJSSALCRRaVALANGgnalLANGJAVALANGagnalavajaTSIlYTCEJBoGNALAVAJSSALCRRaTSIlYTCEJBoGNALAVAJSSALCRRaVALANGgnalLANGJAVALANGagnalavajaTSIlYTCEJBoGNALAVAJSSALCRRaTSIlYTCEJBoGNALAVAJSSALCRRaVALANGgnalLANGJAVALANGagnalavajaTSIlYTCEJBoGNALAVAJSSALCRRaTSIlYTCEJ" + "'", str1, "aTSIlYTCEJBoGNALAVAJSSALCRRaTSIlYTCEJBoGNALAVAJSSALCRRaVALANGgnalLANGJAVALANGagnalavajaTSIlYTCEJBoGNALAVAJSSALCRRaTSIlYTCEJBoGNALAVAJSSALCRRaVALANGgnalLANGJAVALANGagnalavajaTSIlYTCEJBoGNALAVAJSSALCRRaTSIlYTCEJBoGNALAVAJSSALCRRaVALANGgnalLANGJAVALANGagnalavajaTSIlYTCEJBoGNALAVAJSSALCRRaTSIlYTCEJsTRINGaTSIlYTCEJBoGNALAVAJSSALCRRaTSIlYTCEJBoGNALAVAJSSALCRRaVALANGgnalLANGJAVALANGagnalavajaTSIlYTCEJBoGNALAVAJSSALCRRaTSIlYTCEJBoGNALAVAJSSALCRRaVALANGgnalLANGJAVALANGagnalavajaTSIlYTCEJBoGNALAVAJSSALCRRaTSIlYTCEJBoGNALAVAJSSALCRRaVALANGgnalLANGJAVALANGagnalavajaTSIlYTCEJBoGNALAVAJSSALCRRaTSIlYTCEJ");
    }

    @Test
    public void test37611() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest75.test37611");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.defaultIfEmpty("class javalangclass                       javaulang                       javaulang                       javaulang                       javaulang                       javaulang                       javaulang                       javaulang                       javaulang                       javaulang                       javaulang                       javaulang                       javaulang                       javaulang                       javaulang                       javaulang                       javaulang                       javaulang                       javaulang                       javaulang                       javaulang", "lass java.lang.String$ $ $ $ $ $ $ $ $ $ $ $ $ $ $ $ $ $ $ $");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "class javalangclass                       javaulang                       javaulang                       javaulang                       javaulang                       javaulang                       javaulang                       javaulang                       javaulang                       javaulang                       javaulang                       javaulang                       javaulang                       javaulang                       javaulang                       javaulang                       javaulang                       javaulang                       javaulang                       javaulang                       javaulang" + "'", str2, "class javalangclass                       javaulang                       javaulang                       javaulang                       javaulang                       javaulang                       javaulang                       javaulang                       javaulang                       javaulang                       javaulang                       javaulang                       javaulang                       javaulang                       javaulang                       javaulang                       javaulang                       javaulang                       javaulang                       javaulang                       javaulang");
    }

    @Test
    public void test37612() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest75.test37612");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.endsWithIgnoreCase("                                            ...", "                                                interf...");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test37613() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest75.test37613");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.center("aRRAYlISTaRRAYlISTaRRAYlISTAVAJgnal.avajlang.javagnal.avajlang.javagnal.avajlang.javagnal.avajlang.javagnal.avajlang.javagnal.avajlang.javagnal.avajlang.javagnal.avajlang", (int) '.', '#');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "aRRAYlISTaRRAYlISTaRRAYlISTAVAJgnal.avajlang.javagnal.avajlang.javagnal.avajlang.javagnal.avajlang.javagnal.avajlang.javagnal.avajlang.javagnal.avajlang.javagnal.avajlang" + "'", str3, "aRRAYlISTaRRAYlISTaRRAYlISTAVAJgnal.avajlang.javagnal.avajlang.javagnal.avajlang.javagnal.avajlang.javagnal.avajlang.javagnal.avajlang.javagnal.avajlang.javagnal.avajlang");
    }

    @Test
    public void test37614() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest75.test37614");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.defaultString("", "interfacejava.lang.Cloneableg.JAVA.L$ArrayListg.JAVA.L$ArrayListg.JAVA.L$ArrayListg.JAVA.L$ArrayListg.JAVA.L$ArrayListg.JAVA.L$ArrayListg.JAVA.L$ArrayListg.JAVA.L$ArrayListg.JAVA.L$ArrayListg.JAVA.L$ArrayListg.JAVA.L$ArrayListg.JAVA.L$ArrayListg.JAVA.L$ArrayListg.JAVA.L$ArrayListg.JAVA.L$ArrayListg.JAVA.L$ArrayListg.JAVA.L$ArrayListg.JAVA.L$ArrayListg.JAVA.L$ArrayListg.JAVA.L$ArrayListg.JAVA.L$ArrayListg.JAVA.L$ArrayListg.JAVA.L$ArrayListg.JAVA.L$ArrayListg.JAVA.L$ArrayListg.JAVA.L$ArrayListg.JAVA.L$ArrayListg.JAVA.L$ArrayListg.JAVA.L$ArrayListg.JAVA.L$ArrayListg.JAVA.L$ArrayListg.JAVA.L$ArrayListg.JAVA.L$ArrayListg.JAVA.L$ArrayListg.JAVA.L$ArrayListg.JAVA.L$ArrayListg.JAVA.L$ArrayListg.JAVA.L$ArrayListg.JAVA.L$ArrayListg.JAVA.L$ArrayListg.JAVA.L$ArrayListg.JAVA.L$ArrayListg.JAVA.L$ArrayListg.JAVA.L$ArrayListg.JAVA.L$ArrayListginterfacejava.io.Serializable");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test37615() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest75.test37615");
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
        java.lang.String str23 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) wildcardClassArray21, '4');
        java.lang.String[] strArray27 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("...O.gnal.avaj ssalcr4444444444444444444444444444444444444444444444444444444444444444444444444444444aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "Arralitu.avajlitu.ava", 940);
        java.lang.Class<?>[] wildcardClassArray28 = org.apache.commons.lang3.ClassUtils.toClass((java.lang.Object[]) strArray27);
        java.lang.String str30 = org.apache.commons.lang3.ClassUtils.getShortClassName((java.lang.Object) wildcardClassArray28, "GNALUaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaGNAL.AVAJssalC");
        boolean boolean31 = org.apache.commons.lang3.ClassUtils.isAssignable(wildcardClassArray21, wildcardClassArray28);
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
        org.junit.Assert.assertNotNull(strArray27);
        org.junit.Assert.assertNotNull(wildcardClassArray28);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "Class[]" + "'", str30, "Class[]");
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
    }

    @Test
    public void test37616() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest75.test37616");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.deleteWhitespace("TU                    ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "TU" + "'", str1, "TU");
    }

    @Test
    public void test37617() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest75.test37617");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.leftPad("TAVAJ.GNALARRAYLISTARRAYLISTARRAYLITAVAJ.GNALARRAYLISTARRAYLISTARRAYLITAVAJ.GNALARRAYLISTARRAYLISTARRAYLITAVAJ.GNALARRAYLISTARRAYLISTARRAYLITAVAJ.GNALARRAYLISTARRAYLISTARRAYLITAVAJ.GNALARRAYLISTARRAYLISTARRAYLITAVAJ.GNALARRAYLISTARRAYLISTARRAYLITAVAJ.GNALARRAYLISTARRAYLISTARRAYLITAVAJ.GNALARRAYLISTARRAYLISTARRAYLITAVAJ.GNALARRAYLISTARRAYLISTARRAYLITAVAJ.GNALARRAYLISTARRAYLISTARRAYLITAVAJ.GNALARRAYLISTARRAYLISTARRAYLITAVAJ.GNALARRAYLISTARRAYLISTARRAYLITAVAJ.GNALARRAYLISTARRAYLISTARRAYLITAVAJ.GNALARRAYLISTARRAYLISTARRAYLITAVAJ.GNALARRAYLISTARRAYLISTARRAYLITAVAJ.GNALARRAYLISTARRAYLISTARRAYLITAVAJ.GNALARRAYLISTARRAYLISTARRAYLITAVAJ.GNALARRAYLISTARRAYLISTARRAYLITAVAJ.GNALARRAYLISTARRAYLISTARRAYLITAVAJ.GNALARRAYLISTARRAYLISTARRAYLITAVAJ.GNALARRAYLISTARRAYLISTARRAYLITAVAJ.GNALARRAYLISTARRAYLISTARRAYLITAVAJ.GNALARRAYLISTARRAYLISTARRAYLITAVAJ.GNALARRAYLI                                 ..", 58);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "TAVAJ.GNALARRAYLISTARRAYLISTARRAYLITAVAJ.GNALARRAYLISTARRAYLISTARRAYLITAVAJ.GNALARRAYLISTARRAYLISTARRAYLITAVAJ.GNALARRAYLISTARRAYLISTARRAYLITAVAJ.GNALARRAYLISTARRAYLISTARRAYLITAVAJ.GNALARRAYLISTARRAYLISTARRAYLITAVAJ.GNALARRAYLISTARRAYLISTARRAYLITAVAJ.GNALARRAYLISTARRAYLISTARRAYLITAVAJ.GNALARRAYLISTARRAYLISTARRAYLITAVAJ.GNALARRAYLISTARRAYLISTARRAYLITAVAJ.GNALARRAYLISTARRAYLISTARRAYLITAVAJ.GNALARRAYLISTARRAYLISTARRAYLITAVAJ.GNALARRAYLISTARRAYLISTARRAYLITAVAJ.GNALARRAYLISTARRAYLISTARRAYLITAVAJ.GNALARRAYLISTARRAYLISTARRAYLITAVAJ.GNALARRAYLISTARRAYLISTARRAYLITAVAJ.GNALARRAYLISTARRAYLISTARRAYLITAVAJ.GNALARRAYLISTARRAYLISTARRAYLITAVAJ.GNALARRAYLISTARRAYLISTARRAYLITAVAJ.GNALARRAYLISTARRAYLISTARRAYLITAVAJ.GNALARRAYLISTARRAYLISTARRAYLITAVAJ.GNALARRAYLISTARRAYLISTARRAYLITAVAJ.GNALARRAYLISTARRAYLISTARRAYLITAVAJ.GNALARRAYLISTARRAYLISTARRAYLITAVAJ.GNALARRAYLI                                 .." + "'", str2, "TAVAJ.GNALARRAYLISTARRAYLISTARRAYLITAVAJ.GNALARRAYLISTARRAYLISTARRAYLITAVAJ.GNALARRAYLISTARRAYLISTARRAYLITAVAJ.GNALARRAYLISTARRAYLISTARRAYLITAVAJ.GNALARRAYLISTARRAYLISTARRAYLITAVAJ.GNALARRAYLISTARRAYLISTARRAYLITAVAJ.GNALARRAYLISTARRAYLISTARRAYLITAVAJ.GNALARRAYLISTARRAYLISTARRAYLITAVAJ.GNALARRAYLISTARRAYLISTARRAYLITAVAJ.GNALARRAYLISTARRAYLISTARRAYLITAVAJ.GNALARRAYLISTARRAYLISTARRAYLITAVAJ.GNALARRAYLISTARRAYLISTARRAYLITAVAJ.GNALARRAYLISTARRAYLISTARRAYLITAVAJ.GNALARRAYLISTARRAYLISTARRAYLITAVAJ.GNALARRAYLISTARRAYLISTARRAYLITAVAJ.GNALARRAYLISTARRAYLISTARRAYLITAVAJ.GNALARRAYLISTARRAYLISTARRAYLITAVAJ.GNALARRAYLISTARRAYLISTARRAYLITAVAJ.GNALARRAYLISTARRAYLISTARRAYLITAVAJ.GNALARRAYLISTARRAYLISTARRAYLITAVAJ.GNALARRAYLISTARRAYLISTARRAYLITAVAJ.GNALARRAYLISTARRAYLISTARRAYLITAVAJ.GNALARRAYLISTARRAYLISTARRAYLITAVAJ.GNALARRAYLISTARRAYLISTARRAYLITAVAJ.GNALARRAYLI                                 ..");
    }

    @Test
    public void test37618() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest75.test37618");
        int int3 = org.apache.commons.lang3.StringUtils.lastOrdinalIndexOf("iNTERFACE JAVA$LANG$cLONEABLE$$$$$$$JAVA$$$$$$$$$$JAVA$$$$$$$$$$JAVA$$$$$$$$$$JAVA$$$$$$$$$$JAVA$$$$$$$$$$JAVA$$$$$$$$$$JAVA$$$$$$$$$$JAVA$$$$$$$$$$JAVA$$$$$$$$$$JAVA", "tuLlituLlituLlituLlituLlituLlituLlituLlituLlituLlituLlituLlituLlituL", 386);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test37619() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest75.test37619");
        int int3 = org.apache.commons.lang3.StringUtils.lastOrdinalIndexOf("NALAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "JAVA LANGaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", 155);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test37620() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest75.test37620");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.capitalize((java.lang.CharSequence) "                                                                                                                                                                                                                             aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa                                                                                                                                                                                                                             ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "                                                                                                                                                                                                                             aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa                                                                                                                                                                                                                             " + "'", str1, "                                                                                                                                                                                                                             aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa                                                                                                                                                                                                                             ");
    }

    @Test
    public void test37621() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest75.test37621");
        int int2 = org.apache.commons.lang3.StringUtils.getLevenshteinDistance((java.lang.CharSequence) "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                          javaaaaaaaaaa", (java.lang.CharSequence) "JavaStringnalArrayListArrayListArrainterface java.lang.Cloneable44444444444444444444444444444444444444444444444444interface java.io.Serializabl");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 483 + "'", int2 == 483);
    }

    @Test
    public void test37622() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest75.test37622");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.uncapitalize((java.lang.CharSequence) "Avaj.###########################################################################################################################################gn gnal");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "avaj.###########################################################################################################################################gn gnal" + "'", str1, "avaj.###########################################################################################################################################gn gnal");
    }

    @Test
    public void test37623() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest75.test37623");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.substringBetween("... java.lang.Stringclass java.lang.Stringclass...... java.lang.Stringclass java.lang.Stringclass...... java.lang.Stringclass java.lang.Stringclass...... java.lang.Stringclass java.lang.Stringclass...... java.lang.Stringclass java.lang.Stringclass...... java.lang.Stringclass java.lang.Stringclass...... java.lang.Stringclass java.lang.Stringclass...... java.lang.Stringclass java.lang.Stringclass...... java.lang.Stringclass java.lang.Stringclass...... java.lang.Stringclass java.lang.Stringclass...... java.lang.Stringclass java.lang.Stringclass...... java.lang.Stringclass java.lang.Stringclass...... java.lang.Stringclass java.lang.Stringclass...... java.lang.Stringclass java.lang.Stringclass...... java.lang.Stringclass java.lang.Stringclass...... java.lang.Stringclass java.lang.Stringclass...... java.lang.Stringclass java.lang.Stringclass...... java.lang.Stringclass java.lang.Stringcl...avaj..........avaj..........ava", "                                                                 A..ayL A    ", "class java.lang.Class                       JAVAULANG                       JAVAULANG                       JAVAULANG                       JAVAULANG                       JAVAULANG                       JAVAULANG                       JAVAULANG                       JAVAULANG                       JAVAULANG                       JAVAULANG                       JAVAULANG                       JAVAULANG                       JAVAULANG                       JAVAULANG                       JAVAULANG                       JAVAULANG                       JAVAULANG                       JAVAULANG                       JAVAULANG                       JAVAULANG");
        org.junit.Assert.assertNull(str3);
    }

    @Test
    public void test37624() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest75.test37624");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.strip("AtsiLytcejbO.gnal.avajssalcrrAtsiLytcejbO");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "AtsiLytcejbO.gnal.avajssalcrrAtsiLytcejbO" + "'", str1, "AtsiLytcejbO.gnal.avajssalcrrAtsiLytcejbO");
    }

    @Test
    public void test37625() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest75.test37625");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.substringsBetween("                                                                                                                                                                                                                                                                  GNAL.", "444444444444444444444444444.alya..arsoifri$ocfri", "yyyyyyyyyaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa                                              ][gnirtslitu.avaj1-yyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyy");
        org.junit.Assert.assertNull(strArray3);
    }

    @Test
    public void test37626() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest75.test37626");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.contains(".ALya..A                                  $$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$                                  $$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$                                  $$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$                                  $$$$$$$$$$$$$$$$$$$$$$$", "aa...");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test37627() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest75.test37627");
        java.lang.ClassLoader classLoader0 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass3 = org.apache.commons.lang3.ClassUtils.getClass(classLoader0, "aAAAAAAAAAAaaaalaagaAAAAAAAAAAaaaalaagaAAAAAAAAAAaaaalaagaAAAAAAAAAAaaaalaagaAAAAAAAAAAaaaalaagaAAAAAAAAAAaaaalaagaAAAAAAAAAAaaaalaagaAAAAAAAAAAaaaalaagaAAAAAAAAAAaaaalaagaAAAAAAAAAAaaaalaagaAAAAAAAAAAaaaalaagaAAAAAAAAAAaaaalaagaAAAAAAAAAAaaaalaagaAAAAAAAAAAaaaalaagaAAAAAAAAAAaaaalaagaAAAAAAAAAAaaaalaagaAAAAAAAAAAaaaalaagaAAAAAAAAAAaaaalaagaAAAAAAAAAAaaaalaa", false);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassNotFoundException; message: aAAAAAAAAAAaaaalaagaAAAAAAAAAAaaaalaagaAAAAAAAAAAaaaalaagaAAAAAAAAAAaaaalaagaAAAAAAAAAAaaaalaagaAAAAAAAAAAaaaalaagaAAAAAAAAAAaaaalaagaAAAAAAAAAAaaaalaagaAAAAAAAAAAaaaalaagaAAAAAAAAAAaaaalaagaAAAAAAAAAAaaaalaagaAAAAAAAAAAaaaalaagaAAAAAAAAAAaaaalaagaAAAAAAAAAAaaaalaagaAAAAAAAAAAaaaalaagaAAAAAAAAAAaaaalaagaAAAAAAAAAAaaaalaagaAAAAAAAAAAaaaalaagaAAAAAAAAAAaaaalaa");
        } catch (java.lang.ClassNotFoundException e) {
            // Expected exception.
        }
    }

    @Test
    public void test37628() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest75.test37628");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceChars("Arralitu.avajlitu.ava", "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                        ", "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Arralitu.avajlitu.ava" + "'", str3, "Arralitu.avajlitu.ava");
    }

    @Test
    public void test37629() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest75.test37629");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trim("gnal.avajgnal.avajgnal.avajgnal.avajgnal.avajgnal.avajgnal.avajgnal.avajgnal.avajgnal.avajgnal.avajgnal.avajgnal.avajgnal.avajgnal.avajgnal.avajgnal.avajgnal.avajgnal.avajgnal.avajgnal.avajgnal.avajgnal.avajgnal.avajgnal.avajgnal.avajgnal.avajgnal.avagnal.avaaaaaaaaaa4444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444vaJgnal.avajgnal.avajgnal.avajgnal.avajgnal.avajgnal.avajgnal.avajgnal.avajgnal.avajgnal.avajgnal.avajgnal.avajgnal.avajgnal.avajgnal.avajgnal.avajgnal.avajgnal.avajgnal.avajgnal.avajgnal.avajgnal.avajgnal.avajgnal.avajgnal.avajgnal.avajgnal.avajgnal.avagnal.avaaaaaaaaaa4444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444vaJgnal.avajgnal.avajgnal.avajgnal.avajgnal.avajgnal.avajgnal");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "gnal.avajgnal.avajgnal.avajgnal.avajgnal.avajgnal.avajgnal.avajgnal.avajgnal.avajgnal.avajgnal.avajgnal.avajgnal.avajgnal.avajgnal.avajgnal.avajgnal.avajgnal.avajgnal.avajgnal.avajgnal.avajgnal.avajgnal.avajgnal.avajgnal.avajgnal.avajgnal.avajgnal.avagnal.avaaaaaaaaaa4444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444vaJgnal.avajgnal.avajgnal.avajgnal.avajgnal.avajgnal.avajgnal.avajgnal.avajgnal.avajgnal.avajgnal.avajgnal.avajgnal.avajgnal.avajgnal.avajgnal.avajgnal.avajgnal.avajgnal.avajgnal.avajgnal.avajgnal.avajgnal.avajgnal.avajgnal.avajgnal.avajgnal.avajgnal.avagnal.avaaaaaaaaaa4444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444vaJgnal.avajgnal.avajgnal.avajgnal.avajgnal.avajgnal.avajgnal" + "'", str1, "gnal.avajgnal.avajgnal.avajgnal.avajgnal.avajgnal.avajgnal.avajgnal.avajgnal.avajgnal.avajgnal.avajgnal.avajgnal.avajgnal.avajgnal.avajgnal.avajgnal.avajgnal.avajgnal.avajgnal.avajgnal.avajgnal.avajgnal.avajgnal.avajgnal.avajgnal.avajgnal.avajgnal.avagnal.avaaaaaaaaaa4444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444vaJgnal.avajgnal.avajgnal.avajgnal.avajgnal.avajgnal.avajgnal.avajgnal.avajgnal.avajgnal.avajgnal.avajgnal.avajgnal.avajgnal.avajgnal.avajgnal.avajgnal.avajgnal.avajgnal.avajgnal.avajgnal.avajgnal.avajgnal.avajgnal.avajgnal.avajgnal.avajgnal.avajgnal.avagnal.avaaaaaaaaaa4444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444vaJgnal.avajgnal.avajgnal.avajgnal.avajgnal.avajgnal.avajgnal");
    }

    @Test
    public void test37630() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest75.test37630");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNumeric((java.lang.CharSequence) " AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test37631() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest75.test37631");
        int int3 = org.apache.commons.lang3.StringUtils.indexOfIgnoreCase("", "                                                                                 JAVAlLANGJ  ", 401);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test37632() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest75.test37632");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.defaultString("Seria     A..AYL A.44444444444444444444444444      ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Seria     A..AYL A.44444444444444444444444444      " + "'", str1, "Seria     A..AYL A.44444444444444444444444444      ");
    }

    @Test
    public void test37633() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest75.test37633");
        java.util.Locale locale1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.apache.commons.lang3.StringUtils.lowerCase("GNALAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAACharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterChara", locale1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test37634() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest75.test37634");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.endsWithIgnoreCase("NTERFACEJAVA.LANG.cLONEABLE.......JAVA..........JAVA..........JAVA..........JAVA..........JA...", "####################################.AaRRAYAlISTAaRRAYAlISTAaRRAYAlISTAaRRAYAlIS#####################################");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test37635() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest75.test37635");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass2 = org.apache.commons.lang3.ClassUtils.getClass("$         44444444444444444444444444444444444444444444444444444444444444444444444444444444                                                           ...sAitUJAirtSsAijavaulainterface java.lang.Cloneable4interface java.io.Serializable...sAitUJAirtSsAijavaulainterface java.lang.Cloneable4interface java.io.Serializable...sAitUJAirtSsAijavaulainterface java.lang.Cloneable4interface java.io.Serializable...sAitUJAirtSsAijavaulainterface java.lang.Cloneable4interface java.io.Serializabl", true);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassNotFoundException; message: $44444444444444444444444444444444444444444444444444444444444444444444444444444444///sAitUJAirtSsAijavaulainterfacejava/lang/Cloneable4interfacejava/io/Serializable///sAitUJAirtSsAijavaulainterfacejava/lang/Cloneable4interfacejava/io/Serializable///sAitUJAirtSsAijavaulainterfacejava/lang/Cloneable4interfacejava/io/Serializable///sAitUJAirtSsAijavaulainterfacejava/lang/Cloneable4interfacejava/io/Serializabl");
        } catch (java.lang.ClassNotFoundException e) {
            // Expected exception.
        }
    }

    @Test
    public void test37636() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest75.test37636");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "av", "java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java........");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test37637() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest75.test37637");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.reverseDelimited("...aaaaJAVAL.AGNaaaaaaaaaaJAVAL.AGNaaaaaaaaaaJAVAL", 'a');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "JAVALaJAVAL.AGNaJAVAL.AGNa..." + "'", str2, "JAVALaJAVAL.AGNaJAVAL.AGNa...");
    }

    @Test
    public void test37638() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest75.test37638");
        char[] charArray15 = new char[] { ' ', ' ', '#', 'a', '4', 'a' };
        int int16 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "", charArray15);
        boolean boolean17 = org.apache.commons.lang3.StringUtils.containsAny("......", charArray15);
        int int18 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "AAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAA", charArray15);
        boolean boolean19 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "...       .", charArray15);
        int int20 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "hi!ArrayListArrayListArrayListavaj.... AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA... AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA... AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA... AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA... AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA... AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA... AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA... AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA... AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA... AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA", charArray15);
        int int21 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "interface java.lang.Cloneable.......java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........javainterface java.io.Serializable", charArray15);
        boolean boolean22 = org.apache.commons.lang3.StringUtils.containsAny("ArrayListArrayListArrayListavaj.gnal                                                                ", charArray15);
        boolean boolean23 = org.apache.commons.lang3.StringUtils.containsAny("AVAJ", charArray15);
        boolean boolean24 = org.apache.commons.lang3.StringUtils.containsAny("a.lang.cloneablestringinterface java.io                          ", charArray15);
        org.junit.Assert.assertNotNull(charArray15);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray15), "  #a4a");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray15), "  #a4a");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray15), "[ ,  , #, a, 4, a]");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 6 + "'", int20 == 6);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 6 + "'", int21 == 6);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
    }

    @Test
    public void test37639() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest75.test37639");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.chomp("interfce jv.lng.cloneble################################################################################################################################", "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "interfce jv.lng.cloneble################################################################################################################################" + "'", str2, "interfce jv.lng.cloneble################################################################################################################################");
    }

    @Test
    public void test37640() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest75.test37640");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isEmpty((java.lang.CharSequence) "javal$agnjaval$agnjaval$agnjaval$agnjaval$agnjaval$agnjaval$agnjaval$agnjaval$agnjaval$agnjaval$agnjaval$agnjaval$agnjaval$agnjaval$agnjaval$agnjaval$agnjaval$agnjaval$agnjaval$agnjaval$agnjaval$agnjaval$agnjaval$agnjaval$agnjaval$agnjaval$agnjaval$agnjaval$agnjaval$agnjaval$agnjaval$agnjaval$agnjaval$agnjaval$agnjaval$agnjaval$agnjaval$agnjaval$agnjaval$agnjaval$agnjaval$agnjaval$agnjaval$agnjaval$agnjaval$agnjaval$agnjaval$agnjaval$agnjaval$agnjaval$agnjaval$agnjaval$agnjaval$agnjaval$agnjaval$agnjaval$agnjaval$agnjaval$agnjaval$agnjaval$agnjaval$agnjaval$agnjaval$agn");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test37641() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest75.test37641");
        java.lang.String str1 = org.apache.commons.lang3.ClassUtils.getShortClassName("JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JA...");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
    }

    @Test
    public void test37642() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest75.test37642");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("jAVA.L$Arra", "Aaaaaa", 61);
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void test37643() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest75.test37643");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripAccents((java.lang.CharSequence) "rrayLi");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "rrayLi" + "'", str1, "rrayLi");
    }

    @Test
    public void test37644() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest75.test37644");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$", "..........");
        int int4 = org.apache.commons.lang3.StringUtils.indexOfAny("AAAAAAAAAAj#v##.#gnAAAAAAAAAAj#v##.#gnAAAAAAAAAAj#v##.#gnAAAAAAAAAAj#v##.#gnAAAAAAAAAAj#v##.#gnAAAAAAAAAAj#v##.#gnAAAAAAAAAAj#v##.#gnAAAAAAAAAAj#v##.#gnAAAAAAAAAAj#v##.#gnAAAAAAAAAAj#v##.#gnAAAAAAAAAAj#v##.#gnAAAAAAAAAAj#v##.#gnAAAAAAAAAAj#                                              AAAAAAAj#v##.#gnAAAAAAAAAAj#v##.#gnAAAAAAAAAAj#v##.#gnAAAAAAAAAAj#v##.#gnAAAAAAAAAAj#v##.#gnAAAAAAAAAAj#v##.#gnAAAAAAAAAAj#v##.#gnAAAAAAAAAAj#v##.#gnAAAAAAAAAAj#v##.#gnAAAAAAAAAAj#v##.#gnAAAAAAAAAAj#v##.#gnAAAAAAAAAAj#v##.#gnAAAAAAAAAAring", strArray3);
        java.lang.String str6 = org.apache.commons.lang3.ClassUtils.getPackageCanonicalName((java.lang.Object) "AAAAAAAAAAj#v##.#gnAAAAAAAAAAj#v##.#gnAAAAAAAAAAj#v##.#gnAAAAAAAAAAj#v##.#gnAAAAAAAAAAj#v##.#gnAAAAAAAAAAj#v##.#gnAAAAAAAAAAj#v##.#gnAAAAAAAAAAj#v##.#gnAAAAAAAAAAj#v##.#gnAAAAAAAAAAj#v##.#gnAAAAAAAAAAj#v##.#gnAAAAAAAAAAj#v##.#gnAAAAAAAAAAj#                                              AAAAAAAj#v##.#gnAAAAAAAAAAj#v##.#gnAAAAAAAAAAj#v##.#gnAAAAAAAAAAj#v##.#gnAAAAAAAAAAj#v##.#gnAAAAAAAAAAj#v##.#gnAAAAAAAAAAj#v##.#gnAAAAAAAAAAj#v##.#gnAAAAAAAAAAj#v##.#gnAAAAAAAAAAj#v##.#gnAAAAAAAAAAj#v##.#gnAAAAAAAAAAj#v##.#gnAAAAAAAAAAring", "                                                                  litu                                                                  ");
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "java.lang" + "'", str6, "java.lang");
    }

    @Test
    public void test37645() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest75.test37645");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.center("                                                                                                                                                                                                                                                                    JAVAlLANGJ", 650, "CLASSJAVA.LANG.cLASSjavaulangjavaulangjavaulangjavaulangjavaulangjavaulangjavaulangjavaulangjavaulangjavaulangjavaulangjavaulangjavaulangjavaulangjavaulangjavaulangjavaulangjavaulangjavaulangjavaulang..................................................................................................................................................................................................................................................................................................................................................................................................................................................................................");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "CLASSJAVA.LANG.cLASSjavaulangjavaulangjavaulangjavaulangjavaulangjavaulangjavaulangjavaulangjavaulangjavaulangjavaulangjavaulangjavaulangjavaulangjavaulangjavaulangjavaulangjavaulangjavaulan                                                                                                                                                                                                                                                                    JAVAlLANGJCLASSJAVA.LANG.cLASSjavaulangjavaulangjavaulangjavaulangjavaulangjavaulangjavaulangjavaulangjavaulangjavaulangjavaulangjavaulangjavaulangjavaulangjavaulangjavaulangjavaulangjavaulangjavaulan" + "'", str3, "CLASSJAVA.LANG.cLASSjavaulangjavaulangjavaulangjavaulangjavaulangjavaulangjavaulangjavaulangjavaulangjavaulangjavaulangjavaulangjavaulangjavaulangjavaulangjavaulangjavaulangjavaulangjavaulan                                                                                                                                                                                                                                                                    JAVAlLANGJCLASSJAVA.LANG.cLASSjavaulangjavaulangjavaulangjavaulangjavaulangjavaulangjavaulangjavaulangjavaulangjavaulangjavaulangjavaulangjavaulangjavaulangjavaulangjavaulangjavaulangjavaulangjavaulan");
    }

    @Test
    public void test37646() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest75.test37646");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.chop(".lang.Stringclass java.lang.Stringclass java.lang.Stringclas");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + ".lang.Stringclass java.lang.Stringclass java.lang.Stringcla" + "'", str1, ".lang.Stringclass java.lang.Stringclass java.lang.Stringcla");
    }

    @Test
    public void test37647() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest75.test37647");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.uncapitalize((java.lang.CharSequence) "hi!arraylistarraylistarraylis.1aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa.1aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa.1aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa.1aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa.1aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa.1aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa.1aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa.aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hi!arraylistarraylistarraylis.1aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa.1aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa.1aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa.1aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa.1aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa.1aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa.1aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa.aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa" + "'", str1, "hi!arraylistarraylistarraylis.1aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa.1aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa.1aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa.1aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa.1aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa.1aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa.1aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa.aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
    }

    @Test
    public void test37648() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest75.test37648");
        char[] charArray14 = new char[] { ' ', ' ', '#', 'a', '4', 'a' };
        int int15 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "", charArray14);
        boolean boolean16 = org.apache.commons.lang3.StringUtils.containsAny("$", charArray14);
        int int17 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "", charArray14);
        boolean boolean18 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "...       AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA", charArray14);
        int int19 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) ".........ava..........java....ja", charArray14);
        boolean boolean20 = org.apache.commons.lang3.StringUtils.containsAny("gnal.avajgnal.avajgnal.avajgnal.avajgnal.avajgnal.avajgnal.avajgnal.avajgnal.avajgnal.aG.JAVAGNAL.AVAJLANG.J", charArray14);
        int int21 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "saitujairtssaitujairtssaitujairtssaitujairtssaitujairtssaitujairtssaitujairtssaitujairtssaitujairtssaitujairts", charArray14);
        int int22 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "iNTERFACE JAVA.LANG.cLONEABLEa RRR RRR RRR RRR RRR RRR RRR RRR RNAL....................INTERFACE JAVA.LANG.cLONEABLEa RRR RRR RRR RRR RRR RRR RRR RRR R", charArray14);
        org.junit.Assert.assertNotNull(charArray14);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray14), "  #a4a");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray14), "  #a4a");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray14), "[ ,  , #, a, 4, a]");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 9 + "'", int19 == 9);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 9 + "'", int22 == 9);
    }

    @Test
    public void test37649() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest75.test37649");
        java.lang.String[] strArray5 = org.apache.commons.lang3.StringUtils.split("ArrayList", "$", 10);
        java.lang.String str6 = org.apache.commons.lang3.StringUtils.getCommonPrefix(strArray5);
        boolean boolean7 = org.apache.commons.lang3.StringUtils.endsWithAny("", strArray5);
        java.lang.String[] strArray9 = org.apache.commons.lang3.StringUtils.stripAll(strArray5, "Byte");
        java.lang.String str13 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray9, '4', 532, 94);
        int int14 = org.apache.commons.lang3.StringUtils.indexOfDifference((java.lang.CharSequence[]) strArray9);
        java.lang.String str15 = org.apache.commons.lang3.StringUtils.getCommonPrefix(strArray9);
        java.lang.String[] strArray16 = org.apache.commons.lang3.StringUtils.stripAll(strArray9);
        int int17 = org.apache.commons.lang3.StringUtils.lastIndexOfAny(".................................................................................................................................................................Aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", strArray16);
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "ArrayList" + "'", str6, "ArrayList");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(strArray9);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "ArrayLis" + "'", str15, "ArrayLis");
        org.junit.Assert.assertNotNull(strArray16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
    }

    @Test
    public void test37650() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest75.test37650");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("interfacejava.lang.Cloneable$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$interfacejava.io", "interface java.io.serializabl4interface java.io.serializable...saitujairtssaijavaulainterface java.lang.cloneable4interface java.io.serializable...saitujairtssaijavaulainterface java.lang.cloneable4interface java.io.serializable...saitujairtssaijavaulainterface java.lang.cloneable4                                                           ...saitujairtssaijavaulainterface java.lang.cloneable4$         ");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str6 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray2, "Java.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.lang", 26, 196);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test37651() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest75.test37651");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphanumericSpace((java.lang.CharSequence) "                                                                                                                                                                                                                                                                                                                                                                ###################################################################################################################################################################################################################################################################################################################################################################################################################################################################                                   ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test37652() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest75.test37652");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBefore(" aRRAYlISTaRRAYlISTaRRAYlISTAVAJgnal.avajlang.javagnal.avajlang.javagnal.avajlang.javagnal.avajlang.javagnal.avajlang.javagnal.avajlang.javagnal.avajlang.javagnal.avajlang.javagnal", "String[]String[]StLlitung[]String[]String[]String[]String[]String[]");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + " aRRAYlISTaRRAYlISTaRRAYlISTAVAJgnal.avajlang.javagnal.avajlang.javagnal.avajlang.javagnal.avajlang.javagnal.avajlang.javagnal.avajlang.javagnal.avajlang.javagnal.avajlang.javagnal" + "'", str2, " aRRAYlISTaRRAYlISTaRRAYlISTAVAJgnal.avajlang.javagnal.avajlang.javagnal.avajlang.javagnal.avajlang.javagnal.avajlang.javagnal.avajlang.javagnal.avajlang.javagnal.avajlang.javagnal");
    }

    @Test
    public void test37653() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest75.test37653");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.uncapitalize((java.lang.CharSequence) "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                     aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa-1java.utilString[]                                                                                                                                                                                                                                                                                                            ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                     aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa-1java.utilString[]                                                                                                                                                                                                                                                                                                            " + "'", str1, "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                     aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa-1java.utilString[]                                                                                                                                                                                                                                                                                                            ");
    }

    @Test
    public void test37654() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest75.test37654");
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("                                           ...", "44444444444444444.444444444444444444...                                 44444444444444444.444444444444444444...                                 44444$        ");
        boolean boolean5 = org.apache.commons.lang3.StringUtils.endsWithAny("vaj.gnaljava.langavaj.gnaljava.langavaj.gnaljava.langavaj.gnaljava.langavaj.gnaljava.langavaj.gnaljava.lang", strArray4);
        java.lang.String[] strArray8 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("                                                                                 ][gnirtSlitu.avaj1-", "avajgnal.avajgnal.avajgnal.avajgnal.avajgnal.avajgnal.avajgnal.avajgnal.avajgnal.avaJ");
        java.lang.String str10 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray8, "gnalArrayListArrayListArrayListavaj.gnalArrayListArrayListArrayLi...aL.ArrayListgnal.aL.ArrayList...aL.ArrayListgnal.aL.ArrayList...aL.ArrayListgnal.aL.");
        java.lang.String str11 = org.apache.commons.lang3.StringUtils.replaceEach("", strArray4, strArray8);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "                                                                                 ][gnirtSlitu.avaj1-" + "'", str10, "                                                                                 ][gnirtSlitu.avaj1-");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
    }

    @Test
    public void test37655() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest75.test37655");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripToEmpty("444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444litugnal                                                                avajlitugnal                                                                avaj");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444litugnal                                                                avajlitugnal                                                                avaj" + "'", str1, "444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444litugnal                                                                avajlitugnal                                                                avaj");
    }

    @Test
    public void test37656() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest75.test37656");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.chomp("                                                                                                                                                                                                                                                                                                           interfacejava.lang.cloneable4ignirtinterfacejava.lang.cloneable4i", "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                                                                                                                                                                                                                                                                                           interfacejava.lang.cloneable4ignirtinterfacejava.lang.cloneable4i" + "'", str2, "                                                                                                                                                                                                                                                                                                           interfacejava.lang.cloneable4ignirtinterfacejava.lang.cloneable4i");
    }

    @Test
    public void test37657() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest75.test37657");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.rightPad("ang                                                                                             ", 41);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "ang                                                                                             " + "'", str2, "ang                                                                                             ");
    }

    @Test
    public void test37658() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest75.test37658");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.abbreviate("GNIRT", 25, 840);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "GNIRT" + "'", str3, "GNIRT");
    }

    @Test
    public void test37659() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest75.test37659");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trimToEmpty("a..........java...       ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "a..........java..." + "'", str1, "a..........java...");
    }

    @Test
    public void test37660() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest75.test37660");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.center("JAVAULANG", 83, "44444444444444444444444444444444444444444444...");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "4444444444444444444444444444444444444JAVAULANG4444444444444444444444444444444444444" + "'", str3, "4444444444444444444444444444444444444JAVAULANG4444444444444444444444444444444444444");
    }

    @Test
    public void test37661() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest75.test37661");
        java.util.Locale locale1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.apache.commons.lang3.StringUtils.upperCase("...                                   ...       ....       .", locale1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test37662() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest75.test37662");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.leftPad("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaclass java.lang.Stringaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", 303, "aRRAYlISTaRRAYlISTaRRAYlISTaRRAYlISvv4yL444");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaclass java.lang.Stringaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa" + "'", str3, "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaclass java.lang.Stringaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
    }

    @Test
    public void test37663() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest75.test37663");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass2 = org.apache.commons.lang3.ClassUtils.getClass("ang.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.1aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaajava.1aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa.1aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa.1aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa.1aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa.1aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa.1aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa.1aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa.1aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa.hi!arraylistarraylistarraylistavaj", false);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassNotFoundException; message: ang.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.1aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaajava.1aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa.1aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa.1aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa.1aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa.1aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa.1aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa.1aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa.1aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa.hi!arraylistarraylistarraylistavaj");
        } catch (java.lang.ClassNotFoundException e) {
            // Expected exception.
        }
    }

    @Test
    public void test37664() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest75.test37664");
        char[] charArray16 = new char[] { ' ', ' ', '#', 'a', '4', 'a' };
        int int17 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "", charArray16);
        boolean boolean18 = org.apache.commons.lang3.StringUtils.containsAny("......", charArray16);
        int int19 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "AAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAA", charArray16);
        int int20 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "JAVA.LANGAVAJ.GNALJAVA.LANGAVAJ.GNALJAVA.LANGAVAJ.GNALJAVA.LANGAVAJ.GNALJAVA.LANGAVAJ.GNALJAVA.LANGAVAJ.GNALJAVA.LANGAVAJ.GNALJAVA.LANGAVAJ.GNALJAVA.LANG", charArray16);
        boolean boolean21 = org.apache.commons.lang3.StringUtils.containsAny("i4elbaenolC.gnal.avaj ecafretniTRINGi4elbaenolC.gnal.avaj ecafretni", charArray16);
        boolean boolean22 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "LANG.GNALJAVA.LANGAVAJ.GNALJAVA.LANGAVAJ.GNALJAVA.LANGAVAJ.GNALJAVA.LANGAVAJ.GNALJAVA.LANGAVAJ.GNALJAVA.LANGAVAJ.GNALJAVA.LANGAVAJ.GNALJAVA.LANGAVAJ.JAVA", charArray16);
        int int23 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "aaaaaa...                          ", charArray16);
        boolean boolean24 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "hi!ArrayListArrayListArrayListavaj....1AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA...1AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA...1AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA...1AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA...1AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA...1AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA...1AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA...1AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA...1AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAJava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.lang", charArray16);
        int int25 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "interface java.lang.CloneableVAJhi!ArrayLis.       444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444", charArray16);
        boolean boolean26 = org.apache.commons.lang3.StringUtils.containsAny("Hi!ArrayLis$$$$$$$$$$$$$$$$$$$$$$$", charArray16);
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
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
    }

    @Test
    public void test37665() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest75.test37665");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNotEmpty((java.lang.CharSequence) "###..");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test37666() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest75.test37666");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "                                                                                                                                                               ", "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                          javaaaaaaaaaa                                                                                                                                         ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test37667() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest75.test37667");
        java.util.Locale locale1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.apache.commons.lang3.StringUtils.lowerCase("GNALaRRAYlISTaRRAYlISTaRRAYlI                                                                       ", locale1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test37668() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest75.test37668");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substring("                                                                                                                                                                             Javaaaaaaaaaava.langava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.lang$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$", 659);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "$$$$$$$" + "'", str2, "$$$$$$$");
    }

    @Test
    public void test37669() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest75.test37669");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitByCharacterType("JAVAAAAAAAAAAVA.LA..");
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test37670() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest75.test37670");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.chop("uavajtutututututut...");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "uavajtutututututut.." + "'", str1, "uavajtutututututut..");
    }

    @Test
    public void test37671() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest75.test37671");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.remove("...................................................................................................................................................................................................................................................................................................................................................................................................................................................................................ArryList....................................................................................................................................................................................................................................................................................................................................................................................................................................................................................", '4');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "...................................................................................................................................................................................................................................................................................................................................................................................................................................................................................ArryList...................................................................................................................................................................................................................................................................................................................................................................................................................................................................................." + "'", str2, "...................................................................................................................................................................................................................................................................................................................................................................................................................................................................................ArryList....................................................................................................................................................................................................................................................................................................................................................................................................................................................................................");
    }

    @Test
    public void test37672() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest75.test37672");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeStart("                                                                                                                                                                                                                                  JAVATSILYARRATSILYARRATSILYARRA                                                                                                                                                                                                                                  ", "Jlang##########################################################################################################################################################################################################################################");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                                                                                                                                                                                                                  JAVATSILYARRATSILYARRATSILYARRA                                                                                                                                                                                                                                  " + "'", str2, "                                                                                                                                                                                                                                  JAVATSILYARRATSILYARRATSILYARRA                                                                                                                                                                                                                                  ");
    }

    @Test
    public void test37673() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest75.test37673");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("###########################java.uti#########################################################################Arralitu.avajlitu.avajArralitu.avajlitu.avajArralitu.avajlitu.avajArralitu.avajlitu.avajArralitu.avajlitu.avajArralitu.avajlitu.avajArralitu.avajlitu", "iiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiii");
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test37674() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest75.test37674");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.center("avaj.gnal", 84, '4');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "4444444444444444444444444444444444444avaj.gnal44444444444444444444444444444444444444" + "'", str3, "4444444444444444444444444444444444444avaj.gnal44444444444444444444444444444444444444");
    }

    @Test
    public void test37675() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest75.test37675");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.split("       irfCo.irfioSriiz       ");
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test37676() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest75.test37676");
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
        java.lang.String str36 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) wildcardClassArray33, 'a');
        java.lang.Class<?>[] wildcardClassArray37 = org.apache.commons.lang3.ClassUtils.wrappersToPrimitives(wildcardClassArray33);
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
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "" + "'", str36, "");
        org.junit.Assert.assertNotNull(wildcardClassArray37);
    }

    @Test
    public void test37677() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest75.test37677");
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("rayListArrayListArrayListavaj.gnalArrayListArrayListArrayListavaj.gnalArrayListArrayLis...", ".................................................................................................................................................................Aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", 423);
        int int5 = org.apache.commons.lang3.StringUtils.lastIndexOfAny("...O.gnal.avaj ssalcr4444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444..........", strArray4);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
    }

    @Test
    public void test37678() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest75.test37678");
        int int2 = org.apache.commons.lang3.StringUtils.getLevenshteinDistance((java.lang.CharSequence) "gnal.avajgnal..LANGgnal", (java.lang.CharSequence) "J#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 386 + "'", int2 == 386);
    }

    @Test
    public void test37679() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest75.test37679");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringAfterLast("jAVAAAAAAAAAAVA.LANG..", "      interface java.lang.Cloneable.interface java.io.Serializable      ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test37680() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest75.test37680");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.chomp("CLASSSLITUGNIRTSSLITUGNIRTSSLITUGNIRTSSLITUGNIRTSSLITUGNIRTSSLITUGNIRTinterfacegaga.lang.CloneableAAAAAAAAAAgagal.agnAAAAAAAAAAgagal.agnAAAAAAAAAAgagal.agnAAAAAAAAAAgagal.agnAAAAAAAAAAgagal.agnAAAAAAAAAAgagal.agnAAAAAAAAAAgagal.agnAAAAAAAAAAgagal.agnAAAAAAAAAAgagal.agnAAAAAAAAAAgagal.agnAAAAAAAAAAgagal.agnAAAAAAAAAAgagal.agnAAAAAAAAAAgagal.agnAAAAAAAAAAgagal.agnAAAAAAAAAAgagal.agnAAAAAAAAAAgagal.agnAAAAAAAAAAgagal.agnAAAAAAAAAAgagal.agnAAAAAAAAAAgagal.agnAAAAAAAAAAgagal.agnAAAAAAAAAAgagal.agnAAAAAAAAAAgagal.agnAAAAAAAAAAgagal.agnAAAAAAAAAAgagal.agnAAAAAAAAAAgagal.agnAAAAAAAAAAgagal.agnAAAAAAAAAAgagal.agnAAAAAAAAAAgagal.agnAAAAAAAAAAgagal.agnAAAAAAAAAAgagal.agnAAAAAAAAAAgagal.agnAAAAAAAAAAgagal.agnAAAAAAAAAAgagal.agnAAAAAAAAAAgagal.agnAAAAAAAAAAgagal.agnAAAAAAAAAAringinterfacegaga.io");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "CLASSSLITUGNIRTSSLITUGNIRTSSLITUGNIRTSSLITUGNIRTSSLITUGNIRTSSLITUGNIRTinterfacegaga.lang.CloneableAAAAAAAAAAgagal.agnAAAAAAAAAAgagal.agnAAAAAAAAAAgagal.agnAAAAAAAAAAgagal.agnAAAAAAAAAAgagal.agnAAAAAAAAAAgagal.agnAAAAAAAAAAgagal.agnAAAAAAAAAAgagal.agnAAAAAAAAAAgagal.agnAAAAAAAAAAgagal.agnAAAAAAAAAAgagal.agnAAAAAAAAAAgagal.agnAAAAAAAAAAgagal.agnAAAAAAAAAAgagal.agnAAAAAAAAAAgagal.agnAAAAAAAAAAgagal.agnAAAAAAAAAAgagal.agnAAAAAAAAAAgagal.agnAAAAAAAAAAgagal.agnAAAAAAAAAAgagal.agnAAAAAAAAAAgagal.agnAAAAAAAAAAgagal.agnAAAAAAAAAAgagal.agnAAAAAAAAAAgagal.agnAAAAAAAAAAgagal.agnAAAAAAAAAAgagal.agnAAAAAAAAAAgagal.agnAAAAAAAAAAgagal.agnAAAAAAAAAAgagal.agnAAAAAAAAAAgagal.agnAAAAAAAAAAgagal.agnAAAAAAAAAAgagal.agnAAAAAAAAAAgagal.agnAAAAAAAAAAgagal.agnAAAAAAAAAAgagal.agnAAAAAAAAAAringinterfacegaga.io" + "'", str1, "CLASSSLITUGNIRTSSLITUGNIRTSSLITUGNIRTSSLITUGNIRTSSLITUGNIRTSSLITUGNIRTinterfacegaga.lang.CloneableAAAAAAAAAAgagal.agnAAAAAAAAAAgagal.agnAAAAAAAAAAgagal.agnAAAAAAAAAAgagal.agnAAAAAAAAAAgagal.agnAAAAAAAAAAgagal.agnAAAAAAAAAAgagal.agnAAAAAAAAAAgagal.agnAAAAAAAAAAgagal.agnAAAAAAAAAAgagal.agnAAAAAAAAAAgagal.agnAAAAAAAAAAgagal.agnAAAAAAAAAAgagal.agnAAAAAAAAAAgagal.agnAAAAAAAAAAgagal.agnAAAAAAAAAAgagal.agnAAAAAAAAAAgagal.agnAAAAAAAAAAgagal.agnAAAAAAAAAAgagal.agnAAAAAAAAAAgagal.agnAAAAAAAAAAgagal.agnAAAAAAAAAAgagal.agnAAAAAAAAAAgagal.agnAAAAAAAAAAgagal.agnAAAAAAAAAAgagal.agnAAAAAAAAAAgagal.agnAAAAAAAAAAgagal.agnAAAAAAAAAAgagal.agnAAAAAAAAAAgagal.agnAAAAAAAAAAgagal.agnAAAAAAAAAAgagal.agnAAAAAAAAAAgagal.agnAAAAAAAAAAgagal.agnAAAAAAAAAAgagal.agnAAAAAAAAAAgagal.agnAAAAAAAAAAringinterfacegaga.io");
    }

    @Test
    public void test37681() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest75.test37681");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeStartIgnoreCase("                                                                                                                                                                                                                 util                                                                                                                                                                                                                  ", "irfCo.irfioSriiz");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                                                                                                                                                                                                 util                                                                                                                                                                                                                  " + "'", str2, "                                                                                                                                                                                                                 util                                                                                                                                                                                                                  ");
    }

    @Test
    public void test37682() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest75.test37682");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphaSpace((java.lang.CharSequence) "       aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test37683() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest75.test37683");
        java.util.Locale locale1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.apache.commons.lang3.StringUtils.upperCase("4444444string", locale1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test37684() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest75.test37684");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.mid("class j...", 7, 540);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "..." + "'", str3, "...");
    }

    @Test
    public void test37685() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest75.test37685");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("44444444444444444444444444444444444444444444444444444444", '#');
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test37686() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest75.test37686");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOfIgnoreCase("interfacegaga.lang.cloneableaaaaaaaaaagagal.agnaaaaaaaaaagagal.agnaaaaaaaaaagagal.agnaaaaaaaaaagagal.agnaaaaaaaaaagagal.agnaaaaaaaaaagagal.agnaaaaaaaaaagagal.agnaaaaaaaaaagagal.agnaaaaaaaaaagagal.agnaaaaaaaaaagagal.agnaaaaaaaaaagagal.agnaaaaaaaaaagagal.agnaaaaaaaaaagagal.agnaaaaaaaaaagagal.agnaaaaaaaaaagagal.agnaaaaaaaaaagagal.agnaaaaaaaaaagagal.agnaaaaaaaaaagagal.agnaaaaaaaaaagagal.agnaaaaaaaaaagagal.agnaaaaaaaaaagagal.agnaaaaaaaaaagagal.agnaaaaaaaaaagagal.agnaaaaaaaaaagagal.agnaaaaaaaaaagagal.agnaaaaaaaaaagagal.agnaaaaaaaaaagagal.agnaaaaaaaaaagagal.agnaaaaaaaaaagagal.agnaaaaaaaaaagagal.agnaaaaaaaaaagagal.agnaaaaaaaaaagagal.agnaaaaaaaaaagagal.agnaaaaaaaaaagagal.agnaaaaaaaaaagagal.agnaaaaaaaaaaringinterfacegaga.io", "44444444444444444444444444444444444444444444444444aaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test37687() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest75.test37687");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.center("interface java.lang.Cloneableaaaaaaaaaaainterface java.io.Serializable", 64, "VA1J444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444litu.avajli444444444444444444444444444444444444444");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "interface java.lang.Cloneableaaaaaaaaaaainterface java.io.Serializable" + "'", str3, "interface java.lang.Cloneableaaaaaaaaaaainterface java.io.Serializable");
    }

    @Test
    public void test37688() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest75.test37688");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsIgnoreCase("AVAJ.GNAL......java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........javainterfacejava.io.Serializable", "");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test37689() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest75.test37689");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.rightPad("                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                             jvstringnlrrylistrrylistrrylistv                                                                                                       ArrayListArrayListArrayListavaj.gnalArrayListArrayListArrayL", 918);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                             jvstringnlrrylistrrylistrrylistv                                                                                                       ArrayListArrayListArrayListavaj.gnalArrayListArrayListArrayL                                                                                      " + "'", str2, "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                             jvstringnlrrylistrrylistrrylistv                                                                                                       ArrayListArrayListArrayListavaj.gnalArrayListArrayListArrayL                                                                                      ");
    }

    @Test
    public void test37690() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest75.test37690");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.reverseDelimited("nAL.AVAJ", '$');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "nAL.AVAJ" + "'", str2, "nAL.AVAJ");
    }

    @Test
    public void test37691() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest75.test37691");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.rightPad("                                                                                                                                                                                                                  java.io.Serializable java.lang.CloneableStringinterface interface                                                                                                                                                                                                                   ", 128, "AAAAAAAAAAAAAAAAAAAjavaulangAAAAAAAAAAAAAAAAAAA");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "                                                                                                                                                                                                                  java.io.Serializable java.lang.CloneableStringinterface interface                                                                                                                                                                                                                   " + "'", str3, "                                                                                                                                                                                                                  java.io.Serializable java.lang.CloneableStringinterface interface                                                                                                                                                                                                                   ");
    }

    @Test
    public void test37692() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest75.test37692");
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("gnalarraylistarraylistarrayli", "                                                      #############################################", 100);
        java.lang.String[] strArray8 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("javal.agn", "AAAAAAAAAAAAAAAAAAAjavaulangAAAAAAAAAAAAAAAAAAA", 29);
        java.lang.String str9 = org.apache.commons.lang3.StringUtils.replaceEachRepeatedly("rING-1JAVA.UTILsTRING", strArray4, strArray8);
        java.lang.String str10 = org.apache.commons.lang3.StringUtils.concat((java.lang.Object[]) strArray4);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "rING-1JAVA.UTILsTRING" + "'", str9, "rING-1JAVA.UTILsTRING");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "gnalarraylistarraylistarrayli" + "'", str10, "gnalarraylistarraylistarrayli");
    }

    @Test
    public void test37693() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest75.test37693");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsIgnoreCase("ATSILYTCEJBO.GNAL.AVAJSSALCRRATSILYTCEJBO.GNAL.AVAJSSALCRRAVA.LANGGNAL..LANGJAVA.LANGAGNAL.AVAJ", "... java.lang.Stringclass java.lang.Stringclass...                                                                                                                              interface java.lang.Cloneable4interface java.io.Serializabl                                                                                                            ... java.lang.Stringclass java.l                        L.Arr#yList");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test37694() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest75.test37694");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.split("...AAAAAAAAAA... AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA... AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA... AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA... AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA... AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA", '$');
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test37695() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest75.test37695");
        java.lang.String str2 = org.apache.commons.lang3.ClassUtils.getShortClassName((java.lang.Object) "rface java.lang.cloneable                                                 ", "444444444444444444444444444444");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "String" + "'", str2, "String");
    }

    @Test
    public void test37696() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest75.test37696");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceOnce("AVAJ.GNALNaaaaaaaaaaJAVAL.AGNaaaaaaaaaaJAVAL.AGNaaaaaaaaaaJAVAL.AGNaaaaaaaaaaJAVAL.AGNaaaaaaaaaaJAVAL.AGNaaaaaaaaaaJAVAL.AGNaaaaaaaaaaJAVAL.AGNaaaaaaaaaaJAVAL.AGNaaaaaaaaaaJAVAL.AGNaaaaaaaaaaJAVAL.AGNaaaaaaaaaaJAVAL.AGNaaaaaaaaaaJAVAL.AGNaaaaaaaaaaJAVAL.AGNaaaaaaaaaaJAVAL.AGNaaaaaaaaaaJAVAL.AGNaaaaaaaaaaJAVAL.AGNaaaaaaaaaaJAVAL.AGNaaaaaaaaaaJAVAL.AGNaaaaaaaaaaJAVAL.AGNaaaaaaaaaaJAVAL.AGNaaaaaaaaaaJAVAL.AGNaaaaaaaaaaJAVAL.AGNaaaaaaaaaaJAVAL.AGNaaaaaaaaaaJAVAL.AGNaaaaaaaaaaJAVAL.AGNaaaaaaaaaaJAVAL.AGNaaaaaaaaaaJAVAL.AGNaaaaaaaaaaJAVAL.AGNaaaaaaaaaaJAVAL.AGNaaaaaaaaaaJAVAL.AGNaaaaaaaaaaJAVAL.AGNaaaaaaaaaaJAVAL.AGNaaaaaaaaaaJAVAL.AGNaaaaaaaaaaJAVAL", "irfiosriiz$#################################################################################################################################irfco", "Gnal                                                                1AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "AVAJ.GNALNaaaaaaaaaaJAVAL.AGNaaaaaaaaaaJAVAL.AGNaaaaaaaaaaJAVAL.AGNaaaaaaaaaaJAVAL.AGNaaaaaaaaaaJAVAL.AGNaaaaaaaaaaJAVAL.AGNaaaaaaaaaaJAVAL.AGNaaaaaaaaaaJAVAL.AGNaaaaaaaaaaJAVAL.AGNaaaaaaaaaaJAVAL.AGNaaaaaaaaaaJAVAL.AGNaaaaaaaaaaJAVAL.AGNaaaaaaaaaaJAVAL.AGNaaaaaaaaaaJAVAL.AGNaaaaaaaaaaJAVAL.AGNaaaaaaaaaaJAVAL.AGNaaaaaaaaaaJAVAL.AGNaaaaaaaaaaJAVAL.AGNaaaaaaaaaaJAVAL.AGNaaaaaaaaaaJAVAL.AGNaaaaaaaaaaJAVAL.AGNaaaaaaaaaaJAVAL.AGNaaaaaaaaaaJAVAL.AGNaaaaaaaaaaJAVAL.AGNaaaaaaaaaaJAVAL.AGNaaaaaaaaaaJAVAL.AGNaaaaaaaaaaJAVAL.AGNaaaaaaaaaaJAVAL.AGNaaaaaaaaaaJAVAL.AGNaaaaaaaaaaJAVAL.AGNaaaaaaaaaaJAVAL.AGNaaaaaaaaaaJAVAL.AGNaaaaaaaaaaJAVAL.AGNaaaaaaaaaaJAVAL" + "'", str3, "AVAJ.GNALNaaaaaaaaaaJAVAL.AGNaaaaaaaaaaJAVAL.AGNaaaaaaaaaaJAVAL.AGNaaaaaaaaaaJAVAL.AGNaaaaaaaaaaJAVAL.AGNaaaaaaaaaaJAVAL.AGNaaaaaaaaaaJAVAL.AGNaaaaaaaaaaJAVAL.AGNaaaaaaaaaaJAVAL.AGNaaaaaaaaaaJAVAL.AGNaaaaaaaaaaJAVAL.AGNaaaaaaaaaaJAVAL.AGNaaaaaaaaaaJAVAL.AGNaaaaaaaaaaJAVAL.AGNaaaaaaaaaaJAVAL.AGNaaaaaaaaaaJAVAL.AGNaaaaaaaaaaJAVAL.AGNaaaaaaaaaaJAVAL.AGNaaaaaaaaaaJAVAL.AGNaaaaaaaaaaJAVAL.AGNaaaaaaaaaaJAVAL.AGNaaaaaaaaaaJAVAL.AGNaaaaaaaaaaJAVAL.AGNaaaaaaaaaaJAVAL.AGNaaaaaaaaaaJAVAL.AGNaaaaaaaaaaJAVAL.AGNaaaaaaaaaaJAVAL.AGNaaaaaaaaaaJAVAL.AGNaaaaaaaaaaJAVAL.AGNaaaaaaaaaaJAVAL.AGNaaaaaaaaaaJAVAL.AGNaaaaaaaaaaJAVAL.AGNaaaaaaaaaaJAVAL.AGNaaaaaaaaaaJAVAL");
    }

    @Test
    public void test37697() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest75.test37697");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.leftPad("                                                                                                                                                                                                                                                                              aaaaaa...                                                                                                                                                                                                                                                                                                         ", 924, "ssalC.gnal#########################################################################################################");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "ssalC.gnal#########################################################################################################ssalC.gnal#########################################################################################################ssalC.gnal#########################################################################################################ssa                                                                                                                                                                                                                                                                              aaaaaa...                                                                                                                                                                                                                                                                                                         " + "'", str3, "ssalC.gnal#########################################################################################################ssalC.gnal#########################################################################################################ssalC.gnal#########################################################################################################ssa                                                                                                                                                                                                                                                                              aaaaaa...                                                                                                                                                                                                                                                                                                         ");
    }

    @Test
    public void test37698() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest75.test37698");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.mid("GNIRT", 59, 108);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test37699() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest75.test37699");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.remove("#####A##ay...#####A##ay...#####A##ay...#####A##ay...#####A##ay...#####A##ay...#####A##ay...#####A##ay...#####A##ay...#####A##ay...#####A##ay...#####A##ay...#####A##ay...#####A##ay...#####A##ay...#####A##ay...#####A##ay...#####A##ay...#####A##ay...#####A##ay...#####A##ay...#####A##ay...#####A##ay...#####A##ay...#####A##ay...#####A##ay...#####A##ay...#####A##ay...#####A##ay...#####A##ay...#####A##ay...#####A##ay..Llitu...O.gnal.avaj ssalcr4444444444444444444444444444444444444444444444444444444444444444444444444444444...O.", '4');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "#####A##ay...#####A##ay...#####A##ay...#####A##ay...#####A##ay...#####A##ay...#####A##ay...#####A##ay...#####A##ay...#####A##ay...#####A##ay...#####A##ay...#####A##ay...#####A##ay...#####A##ay...#####A##ay...#####A##ay...#####A##ay...#####A##ay...#####A##ay...#####A##ay...#####A##ay...#####A##ay...#####A##ay...#####A##ay...#####A##ay...#####A##ay...#####A##ay...#####A##ay...#####A##ay...#####A##ay...#####A##ay..Llitu...O.gnal.avaj ssalcr...O." + "'", str2, "#####A##ay...#####A##ay...#####A##ay...#####A##ay...#####A##ay...#####A##ay...#####A##ay...#####A##ay...#####A##ay...#####A##ay...#####A##ay...#####A##ay...#####A##ay...#####A##ay...#####A##ay...#####A##ay...#####A##ay...#####A##ay...#####A##ay...#####A##ay...#####A##ay...#####A##ay...#####A##ay...#####A##ay...#####A##ay...#####A##ay...#####A##ay...#####A##ay...#####A##ay...#####A##ay...#####A##ay...#####A##ay..Llitu...O.gnal.avaj ssalcr...O.");
    }

    @Test
    public void test37700() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest75.test37700");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "..........                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                    ", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test37701() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest75.test37701");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.strip("interface.java.lang.Cloneableclassjavalangclassjavaulangjavaulangjavaulangjavaulangjavaulangjavaulangjavaulangjavaulangjavaulangjavaulangjavaulangjavaulangjavaulangjavaulangjavaulangjavaulangjavaulangjavaulangjavaulangjavaulanginterface.java.io.Serializable");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "interface.java.lang.Cloneableclassjavalangclassjavaulangjavaulangjavaulangjavaulangjavaulangjavaulangjavaulangjavaulangjavaulangjavaulangjavaulangjavaulangjavaulangjavaulangjavaulangjavaulangjavaulangjavaulangjavaulangjavaulanginterface.java.io.Serializable" + "'", str1, "interface.java.lang.Cloneableclassjavalangclassjavaulangjavaulangjavaulangjavaulangjavaulangjavaulangjavaulangjavaulangjavaulangjavaulangjavaulangjavaulangjavaulangjavaulangjavaulangjavaulangjavaulangjavaulangjavaulangjavaulanginterface.java.io.Serializable");
    }

    @Test
    public void test37702() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest75.test37702");
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.replace("javalgnal.avajgnal.avajgnal.avajgnal.avajgnal.avajgnal.avajgnal.avajgnal.avajgnal.avajgnal.aG.JAVAGNAL.AVAJLANG.J######################                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                            ", "                                                                                                                                                                                                                                                                                                                                                                                                          Java.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava...                                                                                                                                                                                                                                                                                                                                                                                                           ", "... AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA... AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA... AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA... AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA... AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA... AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA... AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA... AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA... AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA... AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA", 0);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "javalgnal.avajgnal.avajgnal.avajgnal.avajgnal.avajgnal.avajgnal.avajgnal.avajgnal.avajgnal.aG.JAVAGNAL.AVAJLANG.J######################                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                            " + "'", str4, "javalgnal.avajgnal.avajgnal.avajgnal.avajgnal.avajgnal.avajgnal.avajgnal.avajgnal.avajgnal.aG.JAVAGNAL.AVAJLANG.J######################                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                            ");
    }

    @Test
    public void test37703() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest75.test37703");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeEndIgnoreCase("avaj.gna", "util#rr#");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "avaj.gna" + "'", str2, "avaj.gna");
    }

    @Test
    public void test37704() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest75.test37704");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass1 = org.apache.commons.lang3.ClassUtils.getClass("                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                  ");
            org.junit.Assert.fail("Expected exception of type java.lang.ClassNotFoundException; message: ");
        } catch (java.lang.ClassNotFoundException e) {
            // Expected exception.
        }
    }

    @Test
    public void test37705() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest75.test37705");
        java.lang.String str1 = org.apache.commons.lang3.ClassUtils.getPackageCanonicalName("OBJECT");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
    }

    @Test
    public void test37706() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest75.test37706");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfDifference((java.lang.CharSequence) "gnal                                                                1AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA", (java.lang.CharSequence) "      GNALUAVAJ                       GNALUAVAJ                       SSALCGNALAVAJavajlitu");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test37707() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest75.test37707");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphanumericSpace((java.lang.CharSequence) "aaaaaaaa#AGNAAAAAAAAGNALaaaaaaaa");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test37708() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest75.test37708");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.center("... ... ... ... ... ... ... ... ... ... GNA", 416);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                                                                                                                                                                          ... ... ... ... ... ... ... ... ... ... GNA                                                                                                                                                                                           " + "'", str2, "                                                                                                                                                                                          ... ... ... ... ... ... ... ... ... ... GNA                                                                                                                                                                                           ");
    }

    @Test
    public void test37709() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest75.test37709");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.lowerCase("jvcclnG");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "jvcclng" + "'", str1, "jvcclng");
    }

    @Test
    public void test37710() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest75.test37710");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("                                                                                                                                                                                        ......java..........java..........java..........javanignirtSelbaenolC.gnal.avaj ecafretni                                                                                                                                                                                        ", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa                                              ][gnirtslitu.avaj1-                                                                                                                                                              ");
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test37711() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest75.test37711");
        java.lang.String[] strArray6 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("...", "avaj.gnal", (int) 'a');
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.getCommonPrefix(strArray6);
        int int8 = org.apache.commons.lang3.StringUtils.indexOfAny("][sslC", strArray6);
        java.lang.String[] strArray13 = org.apache.commons.lang3.StringUtils.split("                                                                                                    ", "hi!", (int) (byte) -1);
        int int14 = org.apache.commons.lang3.StringUtils.indexOfDifference((java.lang.CharSequence[]) strArray13);
        boolean boolean15 = org.apache.commons.lang3.StringUtils.startsWithAny("ArrayList", strArray13);
        java.lang.String str17 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray13, "Serializabl");
        java.lang.String str18 = org.apache.commons.lang3.StringUtils.replaceEach("$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$A rrr rrr rrr r...", strArray6, strArray13);
        java.lang.String[] strArray21 = new java.lang.String[] { "                                   " };
        java.lang.String str22 = org.apache.commons.lang3.StringUtils.getCommonPrefix(strArray21);
        java.lang.Class<?>[] wildcardClassArray23 = org.apache.commons.lang3.ClassUtils.toClass((java.lang.Object[]) strArray21);
        java.lang.String[] strArray26 = new java.lang.String[] { "                                   " };
        java.lang.String str27 = org.apache.commons.lang3.StringUtils.getCommonPrefix(strArray26);
        int int28 = org.apache.commons.lang3.StringUtils.indexOfDifference((java.lang.CharSequence[]) strArray26);
        int int29 = org.apache.commons.lang3.StringUtils.lastIndexOfAny("...       ", strArray26);
        java.lang.String str30 = org.apache.commons.lang3.StringUtils.replaceEach("...       AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA", strArray21, strArray26);
        java.lang.String str31 = org.apache.commons.lang3.StringUtils.replaceEach(".LANG.LANG.LANG.LANG.Llitu", strArray6, strArray21);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "..." + "'", str7, "...");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNotNull(strArray13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "                                                                                                    " + "'", str17, "                                                                                                    ");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$A rrr rrr rrr r                                                                                                    " + "'", str18, "$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$A rrr rrr rrr r                                                                                                    ");
        org.junit.Assert.assertNotNull(strArray21);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "                                   " + "'", str22, "                                   ");
        org.junit.Assert.assertNotNull(wildcardClassArray23);
        org.junit.Assert.assertNotNull(strArray26);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "                                   " + "'", str27, "                                   ");
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + (-1) + "'", int28 == (-1));
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + (-1) + "'", int29 == (-1));
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "...       AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA" + "'", str30, "...       AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA");
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + ".LANG.LANG.LANG.LANG.Llitu" + "'", str31, ".LANG.LANG.LANG.LANG.Llitu");
    }

    @Test
    public void test37712() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest75.test37712");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAllLowerCase((java.lang.CharSequence) "jAVAAAAAAAAAAVA.LANG...");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test37713() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest75.test37713");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.mid("                                                                                                                                                                                                                                aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", 84, 943);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "                                                                                                                                            aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa" + "'", str3, "                                                                                                                                            aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
    }

    @Test
    public void test37714() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest75.test37714");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceOnce("#######################vj.gnlvj.gnlvj.gnl#######################", "AAAAAAAAAAAAAAAAAAAAAAAA", "ArrayListArrayListArrayListavajagnal");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "#######################vj.gnlvj.gnlvj.gnl#######################" + "'", str3, "#######################vj.gnlvj.gnlvj.gnl#######################");
    }

    @Test
    public void test37715() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest75.test37715");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.split("$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$", ".langGNAL..langjava.langAGNAL.AVAJAAAAjGNALAAAAAjAAAAAAAAjAG");
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test37716() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest75.test37716");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.rightPad("        jvl#.#gn       ", 28);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "        jvl#.#gn            " + "'", str2, "        jvl#.#gn            ");
    }

    @Test
    public void test37717() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest75.test37717");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replace("                                                                                                                                                                                                                                                                                                 classjavalangclassjavaulangjavaulangjavaulangjavaulangjavaulangjavaulangjavaulangjavaulangjavaulangjavaulangjavaulangjavaulangjavaulangjavaulangjavaulangjavaulangjavaulangjavaulangjavaulangjavaulang", "interface java.lang.Cloneable.litinterface java.io.erializable                                                                                                                                                                                                                                                                                                                                                                                                                                                                 ", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa                                            .aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "                                                                                                                                                                                                                                                                                                 classjavalangclassjavaulangjavaulangjavaulangjavaulangjavaulangjavaulangjavaulangjavaulangjavaulangjavaulangjavaulangjavaulangjavaulangjavaulangjavaulangjavaulangjavaulangjavaulangjavaulangjavaulang" + "'", str3, "                                                                                                                                                                                                                                                                                                 classjavalangclassjavaulangjavaulangjavaulangjavaulangjavaulangjavaulangjavaulangjavaulangjavaulangjavaulangjavaulangjavaulangjavaulangjavaulangjavaulangjavaulangjavaulangjavaulangjavaulangjavaulang");
    }

    @Test
    public void test37718() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest75.test37718");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.swapCase("                                            Arra                                           ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "                                            aRRA                                           " + "'", str1, "                                            aRRA                                           ");
    }

    @Test
    public void test37719() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest75.test37719");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("arryList");
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test37720() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest75.test37720");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphaSpace((java.lang.CharSequence) "interface java.lang.CloneableNG.Llitinterface java.io.Serializable");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test37721() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest75.test37721");
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
        java.lang.Class[] classArray13 = new java.lang.Class[0];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray14 = (java.lang.Class<?>[]) classArray13;
        java.lang.Class<?>[] wildcardClassArray15 = org.apache.commons.lang3.ClassUtils.primitivesToWrappers(wildcardClassArray14);
        java.lang.Class<?> wildcardClass16 = null;
        java.lang.Class[] classArray18 = new java.lang.Class[1];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray19 = (java.lang.Class<?>[]) classArray18;
        wildcardClassArray19[0] = wildcardClass16;
        java.lang.Class<?>[] wildcardClassArray22 = org.apache.commons.lang3.ClassUtils.primitivesToWrappers(wildcardClassArray19);
        boolean boolean24 = org.apache.commons.lang3.ClassUtils.isAssignable(wildcardClassArray14, wildcardClassArray19, true);
        java.lang.Class[] classArray26 = new java.lang.Class[0];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray27 = (java.lang.Class<?>[]) classArray26;
        java.lang.Class<?>[] wildcardClassArray28 = org.apache.commons.lang3.ClassUtils.primitivesToWrappers(wildcardClassArray27);
        java.lang.String str30 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) wildcardClassArray28, "...                                 ");
        boolean boolean31 = org.apache.commons.lang3.ClassUtils.isAssignable(wildcardClassArray19, wildcardClassArray28);
        boolean boolean33 = org.apache.commons.lang3.ClassUtils.isAssignable(wildcardClassArray3, wildcardClassArray19, true);
        java.lang.String[] strArray36 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("hi!", "");
        java.lang.String[] strArray38 = org.apache.commons.lang3.StringUtils.stripAll(strArray36, "$");
        java.lang.Class<?>[] wildcardClassArray39 = org.apache.commons.lang3.ClassUtils.toClass((java.lang.Object[]) strArray36);
        java.lang.Class<?> wildcardClass40 = null;
        java.lang.Class[] classArray42 = new java.lang.Class[1];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray43 = (java.lang.Class<?>[]) classArray42;
        wildcardClassArray43[0] = wildcardClass40;
        java.lang.Class<?>[] wildcardClassArray46 = org.apache.commons.lang3.ClassUtils.primitivesToWrappers(wildcardClassArray43);
        java.lang.String[] strArray48 = new java.lang.String[] { "                                   " };
        java.lang.String str49 = org.apache.commons.lang3.StringUtils.getCommonPrefix(strArray48);
        java.lang.Class<?>[] wildcardClassArray50 = org.apache.commons.lang3.ClassUtils.toClass((java.lang.Object[]) strArray48);
        java.lang.Class<?> wildcardClass51 = null;
        java.lang.Class[] classArray53 = new java.lang.Class[1];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray54 = (java.lang.Class<?>[]) classArray53;
        wildcardClassArray54[0] = wildcardClass51;
        java.lang.Class<?>[] wildcardClassArray57 = org.apache.commons.lang3.ClassUtils.primitivesToWrappers(wildcardClassArray54);
        boolean boolean58 = org.apache.commons.lang3.ClassUtils.isAssignable(wildcardClassArray50, wildcardClassArray54);
        boolean boolean60 = org.apache.commons.lang3.ClassUtils.isAssignable(wildcardClassArray43, wildcardClassArray54, true);
        boolean boolean62 = org.apache.commons.lang3.ClassUtils.isAssignable(wildcardClassArray39, wildcardClassArray54, false);
        java.lang.Class<?>[] wildcardClassArray63 = org.apache.commons.lang3.ClassUtils.primitivesToWrappers(wildcardClassArray39);
        java.lang.Class<?>[] wildcardClassArray64 = org.apache.commons.lang3.ClassUtils.primitivesToWrappers(wildcardClassArray63);
        java.lang.Class<?>[] wildcardClassArray65 = org.apache.commons.lang3.ClassUtils.wrappersToPrimitives(wildcardClassArray63);
        java.lang.String str67 = org.apache.commons.lang3.ClassUtils.getShortClassName((java.lang.Object) wildcardClassArray63, "#                                   ");
        java.lang.Class<?>[] wildcardClassArray68 = org.apache.commons.lang3.ClassUtils.primitivesToWrappers(wildcardClassArray63);
        java.lang.Class<?>[] wildcardClassArray69 = null;
        boolean boolean71 = org.apache.commons.lang3.ClassUtils.isAssignable(wildcardClassArray63, wildcardClassArray69, true);
        boolean boolean72 = org.apache.commons.lang3.ClassUtils.isAssignable(wildcardClassArray3, wildcardClassArray63);
        java.lang.Class<?>[] wildcardClassArray73 = org.apache.commons.lang3.ClassUtils.wrappersToPrimitives(wildcardClassArray63);
        java.lang.String str74 = org.apache.commons.lang3.StringUtils.concat((java.lang.Object[]) wildcardClassArray73);
        java.lang.String str76 = org.apache.commons.lang3.ClassUtils.getPackageCanonicalName((java.lang.Object) wildcardClassArray73, "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaajavajavajavajavajavajavajavajavajavajavajavajavajavajavajavajavajavajavajavajavajavajavajavajavajavajavajavajavajavajavajavajavajavajava");
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                   " + "'", str2, "                                   ");
        org.junit.Assert.assertNotNull(wildcardClassArray3);
        org.junit.Assert.assertNotNull(classArray6);
        org.junit.Assert.assertNotNull(wildcardClassArray7);
        org.junit.Assert.assertNotNull(wildcardClassArray10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(classArray13);
        org.junit.Assert.assertNotNull(wildcardClassArray14);
        org.junit.Assert.assertNotNull(wildcardClassArray15);
        org.junit.Assert.assertNotNull(classArray18);
        org.junit.Assert.assertNotNull(wildcardClassArray19);
        org.junit.Assert.assertNotNull(wildcardClassArray22);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(classArray26);
        org.junit.Assert.assertNotNull(wildcardClassArray27);
        org.junit.Assert.assertNotNull(wildcardClassArray28);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "" + "'", str30, "");
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertNotNull(strArray36);
        org.junit.Assert.assertNotNull(strArray38);
        org.junit.Assert.assertNotNull(wildcardClassArray39);
        org.junit.Assert.assertNotNull(classArray42);
        org.junit.Assert.assertNotNull(wildcardClassArray43);
        org.junit.Assert.assertNotNull(wildcardClassArray46);
        org.junit.Assert.assertNotNull(strArray48);
        org.junit.Assert.assertEquals("'" + str49 + "' != '" + "                                   " + "'", str49, "                                   ");
        org.junit.Assert.assertNotNull(wildcardClassArray50);
        org.junit.Assert.assertNotNull(classArray53);
        org.junit.Assert.assertNotNull(wildcardClassArray54);
        org.junit.Assert.assertNotNull(wildcardClassArray57);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + false + "'", boolean58 == false);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + false + "'", boolean60 == false);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + false + "'", boolean62 == false);
        org.junit.Assert.assertNotNull(wildcardClassArray63);
        org.junit.Assert.assertNotNull(wildcardClassArray64);
        org.junit.Assert.assertNotNull(wildcardClassArray65);
        org.junit.Assert.assertEquals("'" + str67 + "' != '" + "Class[]" + "'", str67, "Class[]");
        org.junit.Assert.assertNotNull(wildcardClassArray68);
        org.junit.Assert.assertTrue("'" + boolean71 + "' != '" + false + "'", boolean71 == false);
        org.junit.Assert.assertTrue("'" + boolean72 + "' != '" + true + "'", boolean72 == true);
        org.junit.Assert.assertNotNull(wildcardClassArray73);
        org.junit.Assert.assertEquals("'" + str74 + "' != '" + "" + "'", str74, "");
        org.junit.Assert.assertEquals("'" + str76 + "' != '" + "java.lang" + "'", str76, "java.lang");
    }

    @Test
    public void test37722() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest75.test37722");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfDifference((java.lang.CharSequence) "INTEGER                                        ", (java.lang.CharSequence) "YLISTARRAYLISTARRAY");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test37723() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest75.test37723");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trimToEmpty("arahCretcarahCretcarahCretcarahCretcarahCretcarahCretcarahCretcarahCretcarahCretcarahCretcarahCretcarahCretcarahCretcarahCretcarahCretcarahCretcarahCretcarahCretcarahCretcarahCretcarahCretcarahCretcarahCretcarahCretcarahCretcarahCretcarahCretcarahCretcarahCretcarahCretcar...");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "arahCretcarahCretcarahCretcarahCretcarahCretcarahCretcarahCretcarahCretcarahCretcarahCretcarahCretcarahCretcarahCretcarahCretcarahCretcarahCretcarahCretcarahCretcarahCretcarahCretcarahCretcarahCretcarahCretcarahCretcarahCretcarahCretcarahCretcarahCretcarahCretcarahCretcar..." + "'", str1, "arahCretcarahCretcarahCretcarahCretcarahCretcarahCretcarahCretcarahCretcarahCretcarahCretcarahCretcarahCretcarahCretcarahCretcarahCretcarahCretcarahCretcarahCretcarahCretcarahCretcarahCretcarahCretcarahCretcarahCretcarahCretcarahCretcarahCretcarahCretcarahCretcarahCretcar...");
    }

    @Test
    public void test37724() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest75.test37724");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.contains("#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#lass java#lang#String", 24);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test37725() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest75.test37725");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass1 = org.apache.commons.lang3.ClassUtils.getClass("44444444444444444.4..");
            org.junit.Assert.fail("Expected exception of type java.lang.ClassNotFoundException; message: 44444444444444444/4//");
        } catch (java.lang.ClassNotFoundException e) {
            // Expected exception.
        }
    }

    @Test
    public void test37726() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest75.test37726");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringAfterLast("AA..", "................................                       JAVAULANGinterface java.io.Serializable");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test37727() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest75.test37727");
        java.util.Locale locale1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.apache.commons.lang3.StringUtils.upperCase(".........................................................................................................................................................................................................................................................................................................................................................................................................................", locale1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test37728() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest75.test37728");
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("AVAJ.GNALAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA       CharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterChara", "1AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA", 36);
        java.lang.String str5 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray4);
        boolean boolean6 = org.apache.commons.lang3.StringUtils.startsWithAny("", strArray4);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "AVAJ.GNALAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA       CharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterChara" + "'", str5, "AVAJ.GNALAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA       CharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterChara");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test37729() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest75.test37729");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphanumeric((java.lang.CharSequence) "NGJAVAGNALAVAJLANGJAVAGNALAVAJLANGJAVAGNALAVAJLANGJAVAGNALAVAJLANGJAVAGNALAVAJLANGJAVAGNALAVAJLANGGNALELBAENOLCGNALAVAJ ECAFR");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test37730() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest75.test37730");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitByCharacterType("################################... AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA");
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test37731() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest75.test37731");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.strip("$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$NTERFACE JAVA.LANG.cLONEABLE.......JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVAINTERFACE JAVA.IO.sERIALIZABLE", "javalgnal.avajgnal.avajgnal.avajgnal.avajgnal.avajgnal.avajgnal.avajgnal.avajgnal.avajgnal.aG.JAVAGNAL.AVAJLANG.J######################");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$NTERFACE JAVA.LANG.cLONEABLE.......JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVAINTERFACE JAVA.IO.sERIALIZABLE" + "'", str2, "$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$NTERFACE JAVA.LANG.cLONEABLE.......JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVAINTERFACE JAVA.IO.sERIALIZABLE");
    }

    @Test
    public void test37732() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest75.test37732");
        java.lang.String str1 = org.apache.commons.lang3.ClassUtils.getShortClassName("Interfacejava.lang.CloneableNG.Llitinterfacejava.io.Serializable");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Serializable" + "'", str1, "Serializable");
    }

    @Test
    public void test37733() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest75.test37733");
        java.lang.CharSequence charSequence0 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.apache.commons.lang3.StringUtils.getLevenshteinDistance(charSequence0, (java.lang.CharSequence) "GNAL.AVAJLANG.JAVAGNAL.AVAJLANG.JAVAGNAL.AVAJLANG.JAVAGNAL.AVAJLANG.JAVAGNAL.AVAJLANG.JAVAGNAL.AVAJLANG.JAVAGNAL.AVAJLANG.JAVAGNAL.gn gnal.avaj");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Strings must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test37734() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest75.test37734");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.strip("                                                                                                                                                                                                                                                                                                                                                                                                                                                interface java.lang.Cloneable][sslCinterface java.io.Serializable                                                                                                                                                                                                                                                                                                                                                                                                                                                ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "interface java.lang.Cloneable][sslCinterface java.io.Serializable" + "'", str1, "interface java.lang.Cloneable][sslCinterface java.io.Serializable");
    }

    @Test
    public void test37735() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest75.test37735");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.deleteWhitespace("                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                        ][gnirtSlitu.avaj1-");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "][gnirtSlitu.avaj1-" + "'", str1, "][gnirtSlitu.avaj1-");
    }

    @Test
    public void test37736() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest75.test37736");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOfIgnoreCase("interfcejv.lng.cloneble#interfcejv.io", "VAARRARJAVAARRARJAVAARR");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test37737() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest75.test37737");
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
        java.lang.Class<?>[] wildcardClassArray45 = org.apache.commons.lang3.ClassUtils.primitivesToWrappers(wildcardClassArray44);
        java.lang.Class<?>[] wildcardClassArray46 = org.apache.commons.lang3.ClassUtils.primitivesToWrappers(wildcardClassArray44);
        java.lang.Class<?>[] wildcardClassArray47 = org.apache.commons.lang3.ClassUtils.wrappersToPrimitives(wildcardClassArray44);
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
        org.junit.Assert.assertNotNull(wildcardClassArray45);
        org.junit.Assert.assertNotNull(wildcardClassArray46);
        org.junit.Assert.assertNotNull(wildcardClassArray47);
    }

    @Test
    public void test37738() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest75.test37738");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBefore("ra                                           ", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa$$$$$$$$$$$$.$$$$$$$$$$avajssalcrrAtsiLytcejb$$$$$$$$$$$$.$$$$$$$$$$$");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "ra                                           " + "'", str2, "ra                                           ");
    }

    @Test
    public void test37739() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest75.test37739");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isBlank((java.lang.CharSequence) "JAVAL.AGNaaaaaaaaaaJAVAL.AGNaaaaaaaaaaJAVAL.AGNaaaaaaaaaaJAVAL.AGNaaaaaaaaaaJAVAL.AGNaaaaaaaaaaJAVAL.AGNaaaaaaaaaaJAVAL.AGNaaaaaaaaaaJAVAL.AGNaaaaaaaaaaJAVAL.AGNaaaaaaaaaaJAVAL.AGNaaaaaaaaaaJAVAL.AGNaaaaaaaaaaJAVAL.AGNaaaaaaaaaaJAVAL.AGNaaaaaaaaaaJAVAL.AGNaaaaaaaaaaJAVAL.AGNaaaaaaaaaaJAVAL.AGNaaaaaaaaaaJAVAL.AGNaaaaaaaaaaJAVAL.AGNaaaaaaaaaaJAVAL.AGNaaaaaaaaaaJAVAL.AGNaaaaaaaaaaJAVAL.AGNaaaaaaaaaaJAVAL.AGNaaaaaaaaaaJAVAL.AGNaaaaaaaaaaJAVAL.AGNaaaaaaaaaaJAVAL.AGNaaaaaaaaaaJAVAL.AGNaaaaaaaaaaJAVAL.AGNaaaaaaaaaaJAVAL.AGNaaaaaaaaaaJAVAL.AGNaaaaaaaaaaJAVAL.AGNaaaaaaaaaaJAVAL.AGNaaaaaaaaaaJAVAL.AGNaaaaaaaaaaJAVAL.AGNaaaaaaaaaaJAVAL.AGNaaaaaaaaaa");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test37740() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest75.test37740");
        int int3 = org.apache.commons.lang3.StringUtils.lastOrdinalIndexOf("AVAJ.JAVAAAAAAAAAAVA.LA..AVAJ.", "...      ", 58);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test37741() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest75.test37741");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.defaultString("IO");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "IO" + "'", str1, "IO");
    }

    @Test
    public void test37742() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest75.test37742");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.defaultIfEmpty(".ALya..A $$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$ $$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$ $$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$ $$$$$$$$$$$$$$$$$$$$$$$", "              Llitu               ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + ".ALya..A $$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$ $$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$ $$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$ $$$$$$$$$$$$$$$$$$$$$$$" + "'", str2, ".ALya..A $$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$ $$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$ $$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$ $$$$$$$$$$$$$$$$$$$$$$$");
    }

    @Test
    public void test37743() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest75.test37743");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.reverseDelimited(" ArrayListArrayListArrayListavajGNAL.AVAJLANG.JAVAGNAL.AVAJLANG.JAVAGNAL.AVAJLANG.JAVAGNAL.AVAJLANG.JAVAGNAL.AVAJLANG.JAVAGNAL.AVAJLANG.JAVAGNAL.AVAJLANG.JAVAGNAL.AVAJLANG.JAVAGNAL", '.');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "JAVAGNAL.AVAJLANG.JAVAGNAL.AVAJLANG.JAVAGNAL.AVAJLANG.JAVAGNAL.AVAJLANG.JAVAGNAL.AVAJLANG.JAVAGNAL.AVAJLANG.JAVAGNAL.AVAJLANG.JAVAGNAL.AVAJLANG. ArrayListArrayListArrayListavajGNAL" + "'", str2, "JAVAGNAL.AVAJLANG.JAVAGNAL.AVAJLANG.JAVAGNAL.AVAJLANG.JAVAGNAL.AVAJLANG.JAVAGNAL.AVAJLANG.JAVAGNAL.AVAJLANG.JAVAGNAL.AVAJLANG.JAVAGNAL.AVAJLANG. ArrayListArrayListArrayListavajGNAL");
    }

    @Test
    public void test37744() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest75.test37744");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripToEmpty("AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA" + "'", str1, "AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA");
    }

    @Test
    public void test37745() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest75.test37745");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "Java.lang.Stringclassjava.lang.Stringclassjava.lang.Stringclas.lang.Stringclassjava.lang.Stringc", "                                                                                                                                                                                                                                                                                                                                                                                                         444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444litu.avajlitu                                                                                                                                                                                                                                                                                                                                                                                                         ");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
    }

    @Test
    public void test37746() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest75.test37746");
        int int3 = org.apache.commons.lang3.StringUtils.lastOrdinalIndexOf("                      vv4yL444", "$ $ $ $ $ $ $ $ $ $ $ $ $ $ $ $ $$                                                                                                                                                                                                                                                                                                                          ", 83);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test37747() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest75.test37747");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("                                                                                                                                                                                                                                                                                                                                                                                                                                                                        ", "44444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444rrayList44444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444", 119);
        java.lang.Class<?>[] wildcardClassArray4 = org.apache.commons.lang3.ClassUtils.toClass((java.lang.Object[]) strArray3);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertNotNull(wildcardClassArray4);
    }

    @Test
    public void test37748() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest75.test37748");
        java.lang.String str1 = org.apache.commons.lang3.ClassUtils.getShortCanonicalName("string              Integer                            Integ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "stringIntegerInteg" + "'", str1, "stringIntegerInteg");
    }

    @Test
    public void test37749() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest75.test37749");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripToEmpty("                                    Jvstringnlrrylistrrylistrrylis");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Jvstringnlrrylistrrylistrrylis" + "'", str1, "Jvstringnlrrylistrrylistrrylis");
    }

    @Test
    public void test37750() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest75.test37750");
        java.lang.String[] strArray4 = new java.lang.String[] { "                                   " };
        java.lang.String str5 = org.apache.commons.lang3.StringUtils.getCommonPrefix(strArray4);
        int int6 = org.apache.commons.lang3.StringUtils.indexOfDifference((java.lang.CharSequence[]) strArray4);
        int int7 = org.apache.commons.lang3.StringUtils.lastIndexOfAny("...       ", strArray4);
        boolean boolean8 = org.apache.commons.lang3.StringUtils.endsWithAny("java.lang", strArray4);
        java.lang.String str12 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray4, 'a', 7, 4);
        java.lang.String str13 = org.apache.commons.lang3.StringUtils.concat((java.lang.Object[]) strArray4);
        int int14 = org.apache.commons.lang3.StringUtils.indexOfAny("JAVAULANGRRAYLIST", strArray4);
        java.lang.String[] strArray15 = org.apache.commons.lang3.StringUtils.stripAll(strArray4);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "                                   " + "'", str5, "                                   ");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "                                   " + "'", str13, "                                   ");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertNotNull(strArray15);
    }

    @Test
    public void test37751() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest75.test37751");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.endsWithIgnoreCase("AAAAAAAAAAjaval.agnAAAAAAAAAAjaval.a", "aaaaaaaautil");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test37752() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest75.test37752");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.substringsBetween("CloneableJAVAJAVAJAVAJAVAJA", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa                   GNAL.AVAJ", "$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$rrayList");
        org.junit.Assert.assertNull(strArray3);
    }

    @Test
    public void test37753() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest75.test37753");
        java.lang.String str2 = org.apache.commons.lang3.ClassUtils.getPackageName((java.lang.Object) "interfcejv.lng.cloneble#interfcejv.io", "hI!aRRAYlIShI!aRRAYlIShI!aRRAYlIShI!aRRAYlIShI!aRRAYlIShI!aRRAYlIShI!aRRAYlIShI!aRRAYlIShI!aRRAYlIShI!aRRAYlIShI!aRRAYlIShI!aRRAYlIShI!aRRAYlIShI!aRRAYlIShI!aRRAYlIShI!aRRAYlIShI!aRRAYlIShI!aRRAYlIShI!aRRAYlIShI!aRRAYlIShI!aRRAYlIShI!aRRAYlIShI!aRRAYlIShI!aRRAYlIShI!aRRAYlIShI!aRRAYlIShI!aRRAYlIShI!aRRAYlIShI!aRRAYlIShI!aRRAYlIShI!aRRAYlIShI!aRRAYlIShI!aRRAYlIShI!aRRAYlIShI!aRRAYlIShI!aRRAYlIShI!aRRAYlIShI!aRRAYlIShI!aRRAYlIShI!aRRAYlIShI!aRRAYlIShI!aRRAYlIShI!aRRAYlIShI!aRRAYlIShI!aRRAYlIShI!aRRAYlIShI!aRRAYlIS");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "java.lang" + "'", str2, "java.lang");
    }

    @Test
    public void test37754() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest75.test37754");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitByCharacterType("avaJ");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.stripAll(strArray1, "444444444444INTERFACE JAVA.LANG.cLONEABLEsTRINGINTERFACE JAVA.IO.sERIALIZABLE444444444444444444444444444444444444444444444444444444444444444444444444444444444litu.avajlitu");
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray1, ' ', 444, 14);
        java.lang.String[] strArray8 = org.apache.commons.lang3.StringUtils.stripAll(strArray1);
        java.lang.Class<?> wildcardClass9 = strArray1.getClass();
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test37755() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest75.test37755");
        java.lang.CharSequence charSequence1 = null;
        char[] charArray12 = new char[] { ' ', ' ', '#', 'a', '4', 'a' };
        int int13 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "", charArray12);
        boolean boolean14 = org.apache.commons.lang3.StringUtils.containsAny("$", charArray12);
        boolean boolean15 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "...       AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA...       AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA...       AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA...       AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA...       AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA...       AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA...       AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA...       AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA...       AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA...       AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA", charArray12);
        boolean boolean16 = org.apache.commons.lang3.StringUtils.containsAny("class java.lang.Object", charArray12);
        boolean boolean17 = org.apache.commons.lang3.StringUtils.containsOnly(charSequence1, charArray12);
        int int18 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "jAVA.L$ArrayListaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", charArray12);
        org.junit.Assert.assertNotNull(charArray12);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray12), "  #a4a");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray12), "  #a4a");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray12), "[ ,  , #, a, 4, a]");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
    }

    @Test
    public void test37756() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest75.test37756");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.capitalize((java.lang.CharSequence) "                                                                                                                                                                                                                 interfSerializablece jSerializablevSerializable.lSerializableng.cloneSerializableble                                                                                                                                                                                                                 ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "                                                                                                                                                                                                                 interfSerializablece jSerializablevSerializable.lSerializableng.cloneSerializableble                                                                                                                                                                                                                 " + "'", str1, "                                                                                                                                                                                                                 interfSerializablece jSerializablevSerializable.lSerializableng.cloneSerializableble                                                                                                                                                                                                                 ");
    }

    @Test
    public void test37757() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest75.test37757");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("4444444string44444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444.ly..                                  $$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$                                  $$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$                                  $$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$                                  $$$$$$$$$$$$$$$$$$$$$$$44444444", "                                                                                                                                                                                                                                                                                                                                                                                                                 ##################################################java.uti#########################################################################");
        boolean boolean4 = org.apache.commons.lang3.StringUtils.startsWithAny("$         ...", strArray3);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
    }

    @Test
    public void test37758() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest75.test37758");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.split("JAVA.LANGAVAJ.GNALJAVA.LANGAVAJ.GNALJAVA.LANGAVAJ.GNALJAVA.LANGAVAJ.GNALJAVA.LANGAVAJ.GNALJAVA.LANGAVAJ.GNALJAVA.LANGAVAJ.GNALJAVA.LANGAVAJ.GNALJAVA.LANG");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str5 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray1, '$', 105, 583);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 105");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test37759() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest75.test37759");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsAny("LANGaGNALJAVAaLANGAVAJaGNALJAVAaLANGAVAJaGNALJAVAaLANGAVAJaGNALJAVAaLA", "       util                                                                               ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test37760() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest75.test37760");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.normalizeSpace("java.langjava.langjava.langjava.langjava.langjava.la                                                ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "java.langjava.langjava.langjava.langjava.langjava.la" + "'", str1, "java.langjava.langjava.langjava.langjava.langjava.la");
    }

    @Test
    public void test37761() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest75.test37761");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBeforeLast("java..........java..........java", "                                                               Jvstringnlrrylistrrylistrrylistvj");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "java..........java..........java" + "'", str2, "java..........java..........java");
    }

    @Test
    public void test37762() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest75.test37762");
        int int1 = org.apache.commons.lang3.StringUtils.length((java.lang.CharSequence) "aRRAYlISTaRRAYlISTaRRAYlISTAVAJgnal.avajlang.javagnal.avajlang.javagnal.avajlang.javagnal.avajlang.javagnal.avajlang.javagnal.avajlang.javagnal.avajlang.javagnal.avajlang.javagnal.avajGNAL");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 188 + "'", int1 == 188);
    }

    @Test
    public void test37763() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest75.test37763");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.chomp("javaaaaaaaaa");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "javaaaaaaaaa" + "'", str1, "javaaaaaaaaa");
    }

    @Test
    public void test37764() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest75.test37764");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.endsWithIgnoreCase("gagnAAAAAAAAAAistArrayListArrayListavaj.gnalArrayListArrayListArrayLigagnAAAAAAAAAAistArrayListArrayListavaj.gnalArrayListArrayListArrayLigagnAAAAAAAAAAistArrayListArrayListavaj.gnalArrayListArrayListArrayLigagnAAAAAAAAAAistArrayListArrayListavaj.gnalArrayListArrayListArrayLigagnAAAAAAAAAAistArrayListArrayListavaj.gnalArrayListArrayListArrayLigagnAAAAAAAAAAistArrayListArrayListavaj.gnalArrayListArrayListArrayLigagnAAAAAAAAAAistArrayListArrayListavaj.gnalArrayListArrayListArrayLigagnAAAAAAAAAAistArrayListArrayListavaj.gnalArrayListArrayListArrayLigagnAAAAAAAAAAistArrayListArrayListavaj.gnalArrayListArrayListArrayLigagnAAAAAAAAAAistArrayListArrayListavaj.gnalArrayListArrayListArrayLigagnAAAAAAAAAAistArrayListArrayListavaj.gnalArrayListArrayListArrayLigagnAAAAAAAAAAistArrayListArrayListavaj.gnalArrayListArrayListArrayLigagnAAAAAAAAAAistinterface#java.lang.Cloneable#############Character#############interface#java.io.Serializable", "ArrayListArrayListArrayList");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test37765() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest75.test37765");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("", "", 95);
        java.lang.Class<?>[] wildcardClassArray4 = org.apache.commons.lang3.ClassUtils.toClass((java.lang.Object[]) strArray3);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertNotNull(wildcardClassArray4);
    }

    @Test
    public void test37766() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest75.test37766");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeEnd("$ $ $ $ $ $ $ $ $ $ $ $ $ $ $ $ $ $ $ $ $ $ $ siLyarrA!iH", "j v .io.Seri liz blej v .l ng.Clone bleStringinterf ceinterf ce");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "$ $ $ $ $ $ $ $ $ $ $ $ $ $ $ $ $ $ $ $ $ $ $ siLyarrA!iH" + "'", str2, "$ $ $ $ $ $ $ $ $ $ $ $ $ $ $ $ $ $ $ $ $ $ $ siLyarrA!iH");
    }

    @Test
    public void test37767() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest75.test37767");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.defaultIfEmpty("JAVAULANGRRAYLIST", "arrayListArrayListArrayListavaj.gnal                                                                arrayListArrayListArrayListavaj.gnal             L.ArryList");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "JAVAULANGRRAYLIST" + "'", str2, "JAVAULANGRRAYLIST");
    }

    @Test
    public void test37768() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest75.test37768");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.endsWithIgnoreCase("Arrclass java......................VAgnal.avajgnal.avajgnal.avajgnal.avajgnal.avajgn", "aaaaaaaaaajaval.agnaaaaaaaaaaaaaaaaaaaajaval.agnaaaaaaaaaaaaaaaaaaaajaval.agnaaaaaaaaaaaaaaaaaaaajaval.agnaaaaaaaaaaaaaaaaaaaajaval.agnaaaaaaaaaaaaaaaaaaaajaval.agnaaaaaaaaaaaaaaaaaaaajaval.agnaaaaaaaaaaaaaaaaaaaajaval.agnaaaaaaaaaaaaaaaaaaaajaval.agnaaaaaaaaaaaaaaaaaaaajaval.agnaaaaaaaaaaaaaaaaaaaajaval.agnaaaaaaaaaaaaaaaaaaaajaval.agnaaaaaaaaaaaaaaaaaaaajaval.agnaaaaaaaaaaaaaaaaaaaajaval.agnaaaaaaaaaaaaaaaaaaaajaval.agnaaaaaaaaaaaaaaaaaaaajaval.agnaaaaaaaaaaaaaaaaaaaajaval.agnaaaaaaaaaaaaaaaaaaaajaval.agnaaaaaaaaaaaaaaaaaaaajaval.agnaaaaaaaaaaaaaaaaaaaajaval.agnaaaaaaaaaaaaaaaaaaaajaval.agnaaaaaaaaaaaaaaaaaaaajaval.agnaaaaaaaaaaaaaaaaaaaajaval.agnaaaaaaaaaaaaaaaaaaaajaval.agnaaaaaaaaaaaaaaaaaaaajaval.agnaaaaaaaaaaaaaaaaaaaajaval.agnaaaaaaaaaaaaaaaaaaaajaval.agnaaaaaaaaaaaaaaaaaaaajaval.agnaaaaaaaaaaaaaaaaaaaajaval.agnaaaaaaaaaaaaaaaaaaaajaval.agnaaaaaaaaaaaaaaaaaaaajaval.agnaaaaaaaaaaaaaaaaaaaajaval.agnaaaaaaaaaaaaaaaaaNAELOOB");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test37769() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest75.test37769");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.split("....................................................................                       javaulang", 'a');
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.stripAll(strArray2);
        java.lang.String str5 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray3, " ");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str9 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray3, '4', 360, 537);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 360");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "....................................................................                       j v ul ng" + "'", str5, "....................................................................                       j v ul ng");
    }

    @Test
    public void test37770() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest75.test37770");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOf("class java.lang.String$class java.lang.String$class java.lang.String$class java.lang.String$class java.lang.String$class java.lang.String$class java.lang.String$class java.lang.String$class java.lang.String$class java.lang.String$class java.lang.String$class java.lang.String", 43);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test37771() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest75.test37771");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("#####A##ay...#####A##ay...#####A##ay...#####A##ay...#####A##ay...#####A##ay...#####A##ay...#####A##ay...#####A##ay...#####A##ay...#####A##ay...#####A##ay...#####A##ay...#####A##ay...#####A##ay...#####A##ay...#####A##ay...#####A##ay...#####A##ay...#####A##ay...#####A##ay...#####A##ay...#####A##ay...#####A##ay...#####A##ay...#####A##ay...#####A##ay...#####A##ay...#####A##ay...#####A##ay...#####A##ay...#####A##ay..Llitu...O.gnal.avaj ssalcr...O.", 'a');
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test37772() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest75.test37772");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isWhitespace((java.lang.CharSequence) "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test37773() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest75.test37773");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.remove("  $         $         $         $         $         $         $         $         $         $         $         $ ...", "FAVAJ.GNALAVA$$$.JAVA$$$.JAVA$$$.JAVA$$$.JAVA$$$.JAVA$$$.JAVA$$$.JAVA$$$.JAVA$$$.JAVA$$$.JAVA$$$.JAVA$$$.JAVA$$$.JAVA$$$.JAVA$$$.JAVA$$$.JAVA$$$.JAVA$$$.JAVA$$$.JAVA$$$.JAVA$$$.JAVA$$$.JAVA$$$.JAVA$$$.JAVA$$$.JAVA$$$.JAVA$$$.JAVA$$$.JAVA$$$.JAVA$$$.JAVA$$$.JAVA$$$.JAVA$$$.JAVA$$$.JAVAINTERFACE JAVA.IO.SERIALIZABLE");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "  $         $         $         $         $         $         $         $         $         $         $         $ ..." + "'", str2, "  $         $         $         $         $         $         $         $         $         $         $         $ ...");
    }

    @Test
    public void test37774() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest75.test37774");
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
        java.lang.Class<?>[] wildcardClassArray38 = null;
        boolean boolean40 = org.apache.commons.lang3.ClassUtils.isAssignable(wildcardClassArray35, wildcardClassArray38, true);
        java.lang.Class<?>[] wildcardClassArray41 = org.apache.commons.lang3.ClassUtils.primitivesToWrappers(wildcardClassArray38);
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
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertNull(wildcardClassArray41);
    }

    @Test
    public void test37775() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest75.test37775");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.endsWith("...avagnal.avajlang.javagnal.avajlang.javagnal", "interface java.lang.CloneableAvaj.gnalinterface java.io.Serializable");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test37776() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest75.test37776");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.mid("laagaAAAAAAAAAAaaaalaagaAAAAAAAAAAaaaalaagaAAAAAAAAAAaaaalaagaAAAAAAAAAAaaaalaagaAAAAAAAAAAaaaalaagaAAAAAAAAAAaaaalaagaAAAAAAAAAAaaaalaagaAAAAAAAAAAaaaalaagaAAAAAAAAAAaaaalaagaAAAAAAAAAAaaaalaagaAAAAAAAAAAaaaalaagaAAAAAAAAAAaaaalaagaAAAAAAAAAAaaaalaagaAAAAAAAAAAaaaalaagaAAAAAAAAAAaaaalaagaAAAAAAAAAAaaaalaagaAAAAAAAAAAaaaalaagaAAAAAAAAAAaaaalaagaAAAAAAAAAAaaaalaagaAAAAAAAAAAaaaalaagaAAAAAAAAAAaaaalaagaAAAAAAAAAAaaaalaagaAAAAAAAAAAaaaalaagaAAAAAAAAAAaaaalaagaAAAAAAAAAAaaaalaagaAAAAAAAAAAaaaalaagaAAAAAAAAAAaaaalaagaAAAAAAAAAAaaaalaagaAAAAAAAAAAaaaalaagaAAAAAAAAAAaaaalaagaAAAAAAAAAAaaaalaagaAAAAAAAAAAaaaalaagaAAAAAAAAAAaaaalaagaAAAAAAAAAAaaaalaagaAAAAAAAAAA", 678, (int) (byte) 10);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test37777() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest75.test37777");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.center("                                                                                                                              4444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444AAAAAAAAAA                                                                                                                                                                                      ", 675, "...lizable");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "...lizable...lizable...lizable...lizable...lizable...lizable...lizable...lizable...lizable...lizable...liza                                                                                                                              4444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444AAAAAAAAAA                                                                                                                                                                                      ...lizable...lizable...lizable...lizable...lizable...lizable...lizable...lizable...lizable...lizable...lizab" + "'", str3, "...lizable...lizable...lizable...lizable...lizable...lizable...lizable...lizable...lizable...lizable...liza                                                                                                                              4444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444AAAAAAAAAA                                                                                                                                                                                      ...lizable...lizable...lizable...lizable...lizable...lizable...lizable...lizable...lizable...lizable...lizab");
    }

    @Test
    public void test37778() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest75.test37778");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.chomp("                                                                                                                                                                                                                          ........................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................INTERFACE JAVA.LANG.cLONEABLE4INTERFACE JAVA.IO.sERIALIZABL");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "                                                                                                                                                                                                                          ........................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................INTERFACE JAVA.LANG.cLONEABLE4INTERFACE JAVA.IO.sERIALIZABL" + "'", str1, "                                                                                                                                                                                                                          ........................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................INTERFACE JAVA.LANG.cLONEABLE4INTERFACE JAVA.IO.sERIALIZABL");
    }

    @Test
    public void test37779() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest75.test37779");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.defaultIfEmpty(".......", "litulitulitulitulitul####litulitulitulitulitu");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "......." + "'", str2, ".......");
    }

    @Test
    public void test37780() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest75.test37780");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByCharacterTypeCamelCase("aaaaaa...");
        java.lang.String[] strArray6 = org.apache.commons.lang3.StringUtils.substringsBetween("", "AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA", "44444444444444444.444444444444444444...                                 44444444444444444.444444444444444444...                                 44444$");
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.replaceEach("A                                      .A Lya", strArray2, strArray6);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str11 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray6, '#', 13, 525);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 13");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "A                                      .A Lya" + "'", str7, "A                                      .A Lya");
    }

    @Test
    public void test37781() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest75.test37781");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.startsWith("Short", "ELB ZIL IREsAOIA V JAEC FRETNI V JAAAAAAAAAA V JAAAAAAAAAA V JAAAAAAAAAA V JAAAAAAAAAA V JAAAAAAAAAA V JAAAAAAAAAA V JAAAAAAAAAA V JAAAAAAAAAA V JAAAAAAAAAA V JAAAAAAAAAA V JAAAAAAAAAA V JAAAAAAAAAA V JAAAAAAAAAA V JAAAAAAAAAA V JAAAAAAAAAA V JAAAAAAAAAA V JAAAAAAAAAA V JAAAAAAAAAA V JAAAAAAAAAA V JAAAAAAAAAA V JAAAAAAAAAA V JAAAAAAAAAA V JAAAAAAAAAA V JAAAAAAAAAA V JAAAAAAAAAA V JAAAAAAAAAA V JAAAAAAAAAA V JAAAAAAAAAA V JAAAAAAAAAA V JAAAAAAAAAA V JAAAAAAAAAA V JAAAAAAAAAA V JAAAAAAAAAA V JAAAAAAAAAA V JAAAAAAAELB ENOLcAGN LA V JAEC FRETN");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test37782() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest75.test37782");
        java.util.Locale locale1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.apache.commons.lang3.StringUtils.upperCase("Arr#yList", locale1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test37783() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest75.test37783");
        java.lang.ClassLoader classLoader0 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass2 = org.apache.commons.lang3.ClassUtils.getClass(classLoader0, "                                                                                          GNAL");
            org.junit.Assert.fail("Expected exception of type java.lang.ClassNotFoundException; message: GNAL");
        } catch (java.lang.ClassNotFoundException e) {
            // Expected exception.
        }
    }

    @Test
    public void test37784() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest75.test37784");
        int int2 = org.apache.commons.lang3.StringUtils.getLevenshteinDistance((java.lang.CharSequence) "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaJAVAL AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAGNaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", (java.lang.CharSequence) "$ $ $ $ $ $ $ $ $ $ $ $ $ $ $ $ $$                                                                                                                                                                                                                                                                                                                          ");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 664 + "'", int2 == 664);
    }

    @Test
    public void test37785() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest75.test37785");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.remove("4444444444444444444444444444444444444444444444444444444444444444444444444444444rclass java.lang.O...", 'a');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "4444444444444444444444444444444444444444444444444444444444444444444444444444444rclss jv.lng.O..." + "'", str2, "4444444444444444444444444444444444444444444444444444444444444444444444444444444rclss jv.lng.O...");
    }

    @Test
    public void test37786() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest75.test37786");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.strip("TAVAJ.GNALARRAYLISTARRAYLISTARRAYLITAVAJ.GNALARRAYLISTARRAYLISTARRAYLITAVAJ.GNALARRAYLISTARRAYLISTARRAYLITAVAJ.GNALARRAYLISTARRAYLISTARRAYLITAVAJ.GNALARRAYLISTARRAYLISTARRAYLITAVAJ.GNALARRAYLISTARRAYLISTARRAYLITAVAJ.GNALARRAYLISTARRAYLISTARRAYLITAVAJ.GNALARRAYLISTARRAYLISTARRAYLITAVAJ.GNALARRAYLISTARRAYLISTARRAYLITAVAJ.GNALARRAYLISTARRAYLISTARRAYLITAVAJ.GNALARRAYLISTARRAYLISTARRAYLITAVAJ.GNALARRAYLISTARRAYLISTARRAYLITAVAJ.GNALARRAYLISTARRAYLISTARRAYLITAVAJ.GNALARRAYLISTARRAYLISTARRAYLITAVAJ.GNALARRAYLISTARRAYLISTARRAYLITAVAJ.GNALARRAYLISTARRAYLISTARRAYLITAVAJ.GNALARRAYLISTARRAYLISTARRAYLITAVAJ.GNALARRAYLISTARRAYLISTARRAYLITAVAJ.GNALARRAYLISTARRAYLISTARRAYLITAVAJ.GNALARRAYLISTARRAYLISTARRAYLITAVAJ.GNALARRAYLISTARRAYLISTARRAYLITAVAJ.GNALARRAYLISTARRAYLISTARRAYLITAVAJ.GNALARRAYLISTARRAYLISTARRAYLITAVAJ.GNALARRAYLISTARRAYLISTARRAYLITAVAJ.GNALARRAYLI                                 ..");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "TAVAJ.GNALARRAYLISTARRAYLISTARRAYLITAVAJ.GNALARRAYLISTARRAYLISTARRAYLITAVAJ.GNALARRAYLISTARRAYLISTARRAYLITAVAJ.GNALARRAYLISTARRAYLISTARRAYLITAVAJ.GNALARRAYLISTARRAYLISTARRAYLITAVAJ.GNALARRAYLISTARRAYLISTARRAYLITAVAJ.GNALARRAYLISTARRAYLISTARRAYLITAVAJ.GNALARRAYLISTARRAYLISTARRAYLITAVAJ.GNALARRAYLISTARRAYLISTARRAYLITAVAJ.GNALARRAYLISTARRAYLISTARRAYLITAVAJ.GNALARRAYLISTARRAYLISTARRAYLITAVAJ.GNALARRAYLISTARRAYLISTARRAYLITAVAJ.GNALARRAYLISTARRAYLISTARRAYLITAVAJ.GNALARRAYLISTARRAYLISTARRAYLITAVAJ.GNALARRAYLISTARRAYLISTARRAYLITAVAJ.GNALARRAYLISTARRAYLISTARRAYLITAVAJ.GNALARRAYLISTARRAYLISTARRAYLITAVAJ.GNALARRAYLISTARRAYLISTARRAYLITAVAJ.GNALARRAYLISTARRAYLISTARRAYLITAVAJ.GNALARRAYLISTARRAYLISTARRAYLITAVAJ.GNALARRAYLISTARRAYLISTARRAYLITAVAJ.GNALARRAYLISTARRAYLISTARRAYLITAVAJ.GNALARRAYLISTARRAYLISTARRAYLITAVAJ.GNALARRAYLISTARRAYLISTARRAYLITAVAJ.GNALARRAYLI                                 .." + "'", str1, "TAVAJ.GNALARRAYLISTARRAYLISTARRAYLITAVAJ.GNALARRAYLISTARRAYLISTARRAYLITAVAJ.GNALARRAYLISTARRAYLISTARRAYLITAVAJ.GNALARRAYLISTARRAYLISTARRAYLITAVAJ.GNALARRAYLISTARRAYLISTARRAYLITAVAJ.GNALARRAYLISTARRAYLISTARRAYLITAVAJ.GNALARRAYLISTARRAYLISTARRAYLITAVAJ.GNALARRAYLISTARRAYLISTARRAYLITAVAJ.GNALARRAYLISTARRAYLISTARRAYLITAVAJ.GNALARRAYLISTARRAYLISTARRAYLITAVAJ.GNALARRAYLISTARRAYLISTARRAYLITAVAJ.GNALARRAYLISTARRAYLISTARRAYLITAVAJ.GNALARRAYLISTARRAYLISTARRAYLITAVAJ.GNALARRAYLISTARRAYLISTARRAYLITAVAJ.GNALARRAYLISTARRAYLISTARRAYLITAVAJ.GNALARRAYLISTARRAYLISTARRAYLITAVAJ.GNALARRAYLISTARRAYLISTARRAYLITAVAJ.GNALARRAYLISTARRAYLISTARRAYLITAVAJ.GNALARRAYLISTARRAYLISTARRAYLITAVAJ.GNALARRAYLISTARRAYLISTARRAYLITAVAJ.GNALARRAYLISTARRAYLISTARRAYLITAVAJ.GNALARRAYLISTARRAYLISTARRAYLITAVAJ.GNALARRAYLISTARRAYLISTARRAYLITAVAJ.GNALARRAYLISTARRAYLISTARRAYLITAVAJ.GNALARRAYLI                                 ..");
    }

    @Test
    public void test37787() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest75.test37787");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.rightPad("                       ....................................................................", 0, '4');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "                       ...................................................................." + "'", str3, "                       ....................................................................");
    }

    @Test
    public void test37788() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest75.test37788");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAllUpperCase((java.lang.CharSequence) "SILYARRA!IH........");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test37789() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest75.test37789");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.strip("aaaaaaaaaaJAVAL.AGNaaaaaaaaaaJAVAL.AGNaaaaaaaaaaJAVAL.AGNaaaaaaaaaaJAVAL.AGNaaaaaaaaaaJ                                                                                                                                      ][GNIRTSLITU.AVAJ1AL.AGNaaaaaaaaaaJAVAL.AGNaaaaaaaaaaJAVAL.AGNaaaaaaaaaaJAVAL.AGNaaaaaaaaaaJAVAL.AGNaaaaaaaaaaJAVAL.AGNaaaaaaaaaaJAVAL.AGNaaaaaaaaaaJAVAL");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "aaaaaaaaaaJAVAL.AGNaaaaaaaaaaJAVAL.AGNaaaaaaaaaaJAVAL.AGNaaaaaaaaaaJAVAL.AGNaaaaaaaaaaJ                                                                                                                                      ][GNIRTSLITU.AVAJ1AL.AGNaaaaaaaaaaJAVAL.AGNaaaaaaaaaaJAVAL.AGNaaaaaaaaaaJAVAL.AGNaaaaaaaaaaJAVAL.AGNaaaaaaaaaaJAVAL.AGNaaaaaaaaaaJAVAL.AGNaaaaaaaaaaJAVAL" + "'", str1, "aaaaaaaaaaJAVAL.AGNaaaaaaaaaaJAVAL.AGNaaaaaaaaaaJAVAL.AGNaaaaaaaaaaJAVAL.AGNaaaaaaaaaaJ                                                                                                                                      ][GNIRTSLITU.AVAJ1AL.AGNaaaaaaaaaaJAVAL.AGNaaaaaaaaaaJAVAL.AGNaaaaaaaaaaJAVAL.AGNaaaaaaaaaaJAVAL.AGNaaaaaaaaaaJAVAL.AGNaaaaaaaaaaJAVAL.AGNaaaaaaaaaaJAVAL");
    }

    @Test
    public void test37790() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest75.test37790");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.normalizeSpace("JAVA.UTI");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "JAVA.UTI" + "'", str1, "JAVA.UTI");
    }

    @Test
    public void test37791() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest75.test37791");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.equalsIgnoreCase("va.lang.Cl", "JAVA.LANGAgnal.avajgnal..LANGgnal.avJAVA.LANGAgnal.avajgnal..LANGgnal.avJAVA.LANGAgnal.avajgnal..LANGgnal.avJAVA.LANGAgnal.avajgnal..LANGgnal.avJAVA.LANGAgnal.avajgnal..LANGgnal.avJAVA.LANGAgnal.avajgnal..LANGgnal.avJAVA.LANGAgnal.avajgnal..LANGgnal.avJAVA.LANGAgnal.avajgnal..LANGgnal.avJAVA.LANGAgnal.avajgnal..LANGgnal.avJAVA.LANGAgnal.avajgnal..LANGgnal.av");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test37792() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest75.test37792");
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.overlay("tringcla", "#######################vj.gn vj.gn vj.gn #######################", 470, 44);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "tringcla#######################vj.gn vj.gn vj.gn #######################" + "'", str4, "tringcla#######################vj.gn vj.gn vj.gn #######################");
    }

    @Test
    public void test37793() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest75.test37793");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "err...eeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeee...eeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeee...eeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeee...eeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeee...eeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeee...eeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeee...eeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeee...eeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeee...eeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeee", "             Character             ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test37794() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest75.test37794");
        java.lang.CharSequence charSequence2 = org.apache.commons.lang3.StringUtils.defaultIfEmpty((java.lang.CharSequence) "u.................................", (java.lang.CharSequence) "By eBy eBy eBy eBy eBy eBy eBy eBy eBy eBy eBy eBy eBy eBy eBy eBy eBy eBy eBy eBy eBy eBy eBy eBy eBy eBy eBy eBy eBy eBy eBy eBy eBy eBy eBy eBy eBy eBy eBy eBy eBy eBy eBy eBy eBy eBy eBy eBy eBy eBy eBy eBy ey eBy eBy eBy eBy eBy eBy eBy eBy eBy eBy eBy eBy eBy eBy eBy eBy eBy eBy eBy eBy eBy eBy eBy eBy eBy eBy eBy eBy eBy eBy eBy eBy eBy eBy eBy eBy eBy eBy eBy eBy eBy eBy eBy eBy eBy eBy eBy eBy eBy eBy eBy eBy e");
        org.junit.Assert.assertEquals("'" + charSequence2 + "' != '" + "u................................." + "'", charSequence2, "u.................................");
    }

    @Test
    public void test37795() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest75.test37795");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.deleteWhitespace("#############...");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "#############..." + "'", str1, "#############...");
    }

    @Test
    public void test37796() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest75.test37796");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isEmpty((java.lang.CharSequence) "    ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test37797() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest75.test37797");
        int int3 = org.apache.commons.lang3.StringUtils.ordinalIndexOf("....................................................................                       jvulng", "a..AYL A.44444444444444444444444444a..AYL A.44444444444444444444444444a..AYL A.44444444444444444444444444a..AYL A.44444444444444444444444444a..AYL A.44444444444444444444444444a..AYL A.44444444444444444444444444a..AYL A.44444444444444444444444444a..AYL A.44444444444444444444444444a..AYL A.44444444444444444444444444a..AYL A.44444444444444444444444444a..AYL A.44444444444444444444444444a..AYL A.444444444A$L.AVAj  ", 515);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test37798() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest75.test37798");
        int int3 = org.apache.commons.lang3.StringUtils.lastOrdinalIndexOf("                                                                                                                                                                                                                                                                              langajavatsiLyarrAtsiLyarrAtsiLyarrA                                                                                                                                                                                                                                                                              ", "       aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa......................................................................................................................................................................................................................................................................................................................................................................................................................................", 90);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test37799() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest75.test37799");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.strip("javastringslitUgnirtSarraylistarraylistavaj                                              ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "javastringslitUgnirtSarraylistarraylistavaj" + "'", str1, "javastringslitUgnirtSarraylistarraylistavaj");
    }

    @Test
    public void test37800() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest75.test37800");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsIgnoreCase("ArryList", "ARJAVAARRARJAVAARRARJAVAARRARJAVAARRARJAVAARRARJAVAARRARJAVAARRARJAVAARRARJAVAARRARJAVAARRARJAVAARRARJAVAARRARJAVAARRARJAVAARRARJAVAARRARJAVAARRARJAVAARRARJAVAARRARJAVAARRARJAVAARRARJAVAARRARJAVAARRARJAVAARRARJAVAARRARJAVAARRARJAVAARRARJAVAARRARJAVAARRARJAVAARRARJAVAARRARJAVAARRARJAVAARRARJAVAARRARJAVAARRARJAVAARRARJAVAARRARJAVAARRARJAVAARRARJAVAARRARJAVAARRARJAVAARRARJAVAARRARJAVAARRARJAVAARRARJAVAARRARJAVAARRARJAVAARRARJAVAARRARJAVAARRARJAVAARRARJAVAARRARJAVAARRARJAla javalaS");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test37801() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest75.test37801");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.center(".langjava.langjava.langjava.langjava...      ...      ...      ...      ...      ...      ...      ...      ...      ...      ...      ...      ...      ...      ...      ...      ...      ...      ...      ...      ...      ...      ...      ...      ...      ...      ...      ...      ...      ...      ...      ...      ...", 158);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + ".langjava.langjava.langjava.langjava...      ...      ...      ...      ...      ...      ...      ...      ...      ...      ...      ...      ...      ...      ...      ...      ...      ...      ...      ...      ...      ...      ...      ...      ...      ...      ...      ...      ...      ...      ...      ...      ..." + "'", str2, ".langjava.langjava.langjava.langjava...      ...      ...      ...      ...      ...      ...      ...      ...      ...      ...      ...      ...      ...      ...      ...      ...      ...      ...      ...      ...      ...      ...      ...      ...      ...      ...      ...      ...      ...      ...      ...      ...");
    }

    @Test
    public void test37802() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest75.test37802");
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.split("sAitUJAirtSsAitUJAirtSsAitUJAirtSsAitUJAirtSsAitUJAirtSsAitUJAirtSsAitUJAirtSsAitUJAirtSsAitUJAirtSsAitUJAirtS", "avaJ", 49);
        int int5 = org.apache.commons.lang3.StringUtils.indexOfAny("", strArray4);
        java.lang.String str7 = org.apache.commons.lang3.ClassUtils.getShortCanonicalName((java.lang.Object) "", "44444444444444444444444444...");
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "String" + "'", str7, "String");
    }

    @Test
    public void test37803() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest75.test37803");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.rightPad("############", 386, '4');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "############44444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444" + "'", str3, "############44444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444");
    }

    @Test
    public void test37804() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest75.test37804");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfDifference((java.lang.CharSequence) "AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA4444444444444AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAACLASclass java.lang.StringCLASCLASclass java.lang.StringCLASCLASclass java.lang.StringCLASCLASclass java.lang.StringCLASCLASclass java.lang.StringCLASCLASclass java.lang.", (java.lang.CharSequence) "...      aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test37805() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest75.test37805");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBeforeLast("jv.lng$interfce jv.lng.Cloneble$interfce jv.io.Serilizbleinterfce jv.lng.Cloneble$interfce jv.io.Serilizbleinterfce jv.lng.Cl", "iRFCO.IRFIOSRIIZ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "jv.lng$interfce jv.lng.Cloneble$interfce jv.io.Serilizbleinterfce jv.lng.Cloneble$interfce jv.io.Serilizbleinterfce jv.lng.Cl" + "'", str2, "jv.lng$interfce jv.lng.Cloneble$interfce jv.io.Serilizbleinterfce jv.lng.Cloneble$interfce jv.io.Serilizbleinterfce jv.lng.Cl");
    }

    @Test
    public void test37806() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest75.test37806");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.deleteWhitespace("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa...java..........java..");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa...java..........java.." + "'", str1, "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa...java..........java..");
    }

    @Test
    public void test37807() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest75.test37807");
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.overlay("                                       ", "-1javaJAVATSILYARRATSILYARRATSILYARRA", 386, 386);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "                                       -1javaJAVATSILYARRATSILYARRATSILYARRA" + "'", str4, "                                       -1javaJAVATSILYARRATSILYARRATSILYARRA");
    }

    @Test
    public void test37808() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest75.test37808");
        char[] charArray1 = null;
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsAny("        GNALUAVAJ                       GNALUAVAJ                       GNALUAVAJ                       GNALUAVAJ                       GNALUAVAJ                       GNALUAVAJ                       GNALUAVAJ                       GNALUAVAJ                       GNALUAVAJ                       GNALUAVAJ                       GNALUAVAJ                       GNALUAVAJ                       GNALUAVAJ                       GNALUAVAJ                       GNALUAVAJ                       GNALUAVAJ                       GNALUAVAJ                       GNALUAVAJ                       GNALUAVAJ                       GNALUAVAJ                       SSALCGNALAVAJ SSALC", charArray1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test37809() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest75.test37809");
        java.util.Locale locale1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.apache.commons.lang3.StringUtils.lowerCase("vvayLasavvayLasajavaulainterface java.lang.Cloneable4interface java.io.SerializablevvayLasavvayLasa.", locale1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test37810() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest75.test37810");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.reverseDelimited("A..ayL A.444444444444444444444444444", ' ');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "A.444444444444444444444444444 A..ayL" + "'", str2, "A.444444444444444444444444444 A..ayL");
    }

    @Test
    public void test37811() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest75.test37811");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitByCharacterType("....................................................................................................................lang.javatsilyarratsilyarratsilyarra.....................................................................................................................");
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test37812() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest75.test37812");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.contains("javallangj", 169);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test37813() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest75.test37813");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trimToEmpty("4444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444arrAsiLyarrAsiLyarrAsiLyarrAsiLyarrA");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "4444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444arrAsiLyarrAsiLyarrAsiLyarrAsiLyarrA" + "'", str1, "4444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444arrAsiLyarrAsiLyarrAsiLyarrAsiLyarrA");
    }

    @Test
    public void test37814() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest75.test37814");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("JAVA.LANGAVAJ.GNALJAVA.LANGAVAJ.GNALJAVA.LANGAVAJ.GNALJAVA.LANGAVAJ.GNALJAVA.LANGAVAJ.GNALJAVA.LANGAVAJ.GNALJAVA.LANGAVAJ.GNALJAVA.LANGAVAJ.GNALJAVA.LANG", "GNAL.AVAJGNAL..langGNAL.AVAJGNAL.");
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test37815() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest75.test37815");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("                                              ", "JAVAlLANG                                                                                                                                                                                                                                                                                                                                                                                                                                                       ", 90);
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void test37816() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest75.test37816");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.rightPad("rrclass javalangObjectystrrclass javalangObjectystrrclass javalangObjectystrrclass javalangObjectystrrclass javalangObjectystrrclass javalangObjectystrrclass javalangObjectystrrclass javalangObjectystrrclass javalangObjectystrrclass javalangObjectystrrclass javalangObjectystrrclass javalangObjectystrrclass javalangObjectystrrclass javalangObjectystrrclass javalangObjectystrrclass javalangObjectystrrclass javalangObjectystrrclass javalangObjectystrrclass javalangObjectystrrclass javalangO#AGNAAAAAAAAGNALrrclass javalangObjectystrrclass javalangObjectystrrclass javalangObjectystrrclass javalangObjectystrrclass javalangObjectystrrclass javalangObjectystrrclass javalangObjectystrrclass javalangObjectystrrclass javalangObjectystrrclass javalangObjectystrrclass javalangObjectystrrclass javalangObjectystrrclass javalangObjectystrrclass javalangObjectystrrclass javalangObjectystrrclass javalangObjectystrrclass javalangObjectystrrclass javalangObjectystrrclass javalangObjectystrrclass javalangO", 34, "LANGgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgn");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "rrclass javalangObjectystrrclass javalangObjectystrrclass javalangObjectystrrclass javalangObjectystrrclass javalangObjectystrrclass javalangObjectystrrclass javalangObjectystrrclass javalangObjectystrrclass javalangObjectystrrclass javalangObjectystrrclass javalangObjectystrrclass javalangObjectystrrclass javalangObjectystrrclass javalangObjectystrrclass javalangObjectystrrclass javalangObjectystrrclass javalangObjectystrrclass javalangObjectystrrclass javalangObjectystrrclass javalangO#AGNAAAAAAAAGNALrrclass javalangObjectystrrclass javalangObjectystrrclass javalangObjectystrrclass javalangObjectystrrclass javalangObjectystrrclass javalangObjectystrrclass javalangObjectystrrclass javalangObjectystrrclass javalangObjectystrrclass javalangObjectystrrclass javalangObjectystrrclass javalangObjectystrrclass javalangObjectystrrclass javalangObjectystrrclass javalangObjectystrrclass javalangObjectystrrclass javalangObjectystrrclass javalangObjectystrrclass javalangObjectystrrclass javalangO" + "'", str3, "rrclass javalangObjectystrrclass javalangObjectystrrclass javalangObjectystrrclass javalangObjectystrrclass javalangObjectystrrclass javalangObjectystrrclass javalangObjectystrrclass javalangObjectystrrclass javalangObjectystrrclass javalangObjectystrrclass javalangObjectystrrclass javalangObjectystrrclass javalangObjectystrrclass javalangObjectystrrclass javalangObjectystrrclass javalangObjectystrrclass javalangObjectystrrclass javalangObjectystrrclass javalangObjectystrrclass javalangO#AGNAAAAAAAAGNALrrclass javalangObjectystrrclass javalangObjectystrrclass javalangObjectystrrclass javalangObjectystrrclass javalangObjectystrrclass javalangObjectystrrclass javalangObjectystrrclass javalangObjectystrrclass javalangObjectystrrclass javalangObjectystrrclass javalangObjectystrrclass javalangObjectystrrclass javalangObjectystrrclass javalangObjectystrrclass javalangObjectystrrclass javalangObjectystrrclass javalangObjectystrrclass javalangObjectystrrclass javalangObjectystrrclass javalangO");
    }

    @Test
    public void test37817() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest75.test37817");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("gnirtS.ge", "gn gn gn #########################################################...#########################################################...#########################################################...#########################################################...#########################################################...#########################################################...#########################################################...#########################################################...#########################################################...#########################################################...#########################################################...#########################################################...#########################################################..");
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test37818() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest75.test37818");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceChars("         ", '4', ' ');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "         " + "'", str3, "         ");
    }

    @Test
    public void test37819() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest75.test37819");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.reverseDelimited("A.UTILStringcJAVA.UTILJAVA.UTILStringcJAVA.UTILJAVA.UTILStringcJAVA.UTILJAVA.UTILStringcJAVA.UTILJAVA.UTILStringcJAVA.UTILJAVA.UTILStringcJAVA.UTILJAVA.UTILStringcJAVA.UTILJAVA.UTILStringcJAVA.UTILJAVA.UTILStringcJAVA.UTILJAVA.UTILStringcJAVA.UTILJAVA.UTILStringcJAVA.UTILJAVA.UTILStringcJAVA.UTILJAVA.UTILStringcJAVA.UTILJAVA.UTILStringcJAVA.UTILJAVA.UTILStringcJAVA.UTILJAVA.UTILStringcJAVA.UTILJAVA.UTILStringcJAVA.UTILJAVA.UTILStringcJAVA.UTILJAVA.UTILStringcJAVA.UTILJAVA.UTILStringcJAVA.UTILJAVA.UTILinterface java.io.Serializable", '#');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "A.UTILStringcJAVA.UTILJAVA.UTILStringcJAVA.UTILJAVA.UTILStringcJAVA.UTILJAVA.UTILStringcJAVA.UTILJAVA.UTILStringcJAVA.UTILJAVA.UTILStringcJAVA.UTILJAVA.UTILStringcJAVA.UTILJAVA.UTILStringcJAVA.UTILJAVA.UTILStringcJAVA.UTILJAVA.UTILStringcJAVA.UTILJAVA.UTILStringcJAVA.UTILJAVA.UTILStringcJAVA.UTILJAVA.UTILStringcJAVA.UTILJAVA.UTILStringcJAVA.UTILJAVA.UTILStringcJAVA.UTILJAVA.UTILStringcJAVA.UTILJAVA.UTILStringcJAVA.UTILJAVA.UTILStringcJAVA.UTILJAVA.UTILStringcJAVA.UTILJAVA.UTILStringcJAVA.UTILJAVA.UTILinterface java.io.Serializable" + "'", str2, "A.UTILStringcJAVA.UTILJAVA.UTILStringcJAVA.UTILJAVA.UTILStringcJAVA.UTILJAVA.UTILStringcJAVA.UTILJAVA.UTILStringcJAVA.UTILJAVA.UTILStringcJAVA.UTILJAVA.UTILStringcJAVA.UTILJAVA.UTILStringcJAVA.UTILJAVA.UTILStringcJAVA.UTILJAVA.UTILStringcJAVA.UTILJAVA.UTILStringcJAVA.UTILJAVA.UTILStringcJAVA.UTILJAVA.UTILStringcJAVA.UTILJAVA.UTILStringcJAVA.UTILJAVA.UTILStringcJAVA.UTILJAVA.UTILStringcJAVA.UTILJAVA.UTILStringcJAVA.UTILJAVA.UTILStringcJAVA.UTILJAVA.UTILStringcJAVA.UTILJAVA.UTILStringcJAVA.UTILJAVA.UTILinterface java.io.Serializable");
    }

    @Test
    public void test37820() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest75.test37820");
        java.lang.CharSequence charSequence0 = null;
        int int2 = org.apache.commons.lang3.StringUtils.indexOfDifference(charSequence0, (java.lang.CharSequence) "interface java.lang.Cloneable         ....................................................................interface java.io.Serializable");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test37821() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest75.test37821");
        char[] charArray14 = new char[] { ' ', ' ', '#', 'a', '4', 'a' };
        int int15 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "", charArray14);
        int int16 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "JAVAULANG", charArray14);
        int int17 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "JAVA.UTIL", charArray14);
        boolean boolean18 = org.apache.commons.lang3.StringUtils.containsAny("GNAL.AVAJLANG.JAVAGNAL.AVAJLANG.JAVAGNAL.AVAJLANG.JAVAGNAL.AVAJLANG.JAVAGNAL.AVAJLANG.JAVAGNAL.AVAJLANG.JAVAGNAL.AVAJLANG.JAVAGNAL.AVAJLANG.JAVAGNAL.AVAJ", charArray14);
        boolean boolean19 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "class java.lang.Stringclass java.lang.Stringclass java.lang.Stringclass java.lang.Stringclass java.lang.Stringclass java.lang.Stringclass java.lang.Stringclass java.lang.Stringclass java.lang.Stringclass java.lang.Stringclass java.lang.Stringclass java.lang.Stringclass java.lang.Stringclass java.lang.Stringclass java.lang.Stringclass java.lang.Stringclass java.lang.Stringclass java.lang.Stringclass java.lang.Stringclass java.lang.Stringclass java.lang.Stringclass java.lang.Stringclass java.lang.Stringclass java.lang.Stringclass java.lang.Stringclass java.lang.Stringclass java.lang.Stringclass java.lang.Stringclass java.lang.Stringclass java.lang.String", charArray14);
        boolean boolean20 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "jvstringnlrrylistrrylistrrylistvj", charArray14);
        int int21 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "ETYB", charArray14);
        boolean boolean22 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "][ssalc                         ", charArray14);
        org.junit.Assert.assertNotNull(charArray14);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray14), "  #a4a");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray14), "  #a4a");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray14), "[ ,  , #, a, 4, a]");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
    }

    @Test
    public void test37822() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest75.test37822");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("                      integer                       ", "it.it", 493);
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void test37823() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest75.test37823");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.contains("java.langjava.langjava.1aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaajava.1aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa.1aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa.1aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa.1aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa.1aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa.1aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa.1aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa.1aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa.hi!arraylistarraylistarraylistavaj", "                                    Jvstringnlrrylistrrylistrrylis");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test37824() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest75.test37824");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.leftPad("", 990);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                              " + "'", str2, "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                              ");
    }

    @Test
    public void test37825() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest75.test37825");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trimToNull(".........................................................................................................................................................................................................................................................................................................................................................LANG.LANG.LANG.LANG");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + ".........................................................................................................................................................................................................................................................................................................................................................LANG.LANG.LANG.LANG" + "'", str1, ".........................................................................................................................................................................................................................................................................................................................................................LANG.LANG.LANG.LANG");
    }

    @Test
    public void test37826() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest75.test37826");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.stripStart("AtsiLytcejbO.gnal.avaj ssalcrrAtsiLytcejbO.gnal.avaj ssalcrrAva.langGNAL..langjava.langAGNAL.AVAJ", "interface java.lang.CloneableAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAringinterface java.io.Serializable");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "siLytcejbO.gnal.avaj ssalcrrAtsiLytcejbO.gnal.avaj ssalcrrAva.langGNAL..langjava.langAGNAL.AVAJ" + "'", str2, "siLytcejbO.gnal.avaj ssalcrrAtsiLytcejbO.gnal.avaj ssalcrrAva.langGNAL..langjava.langAGNAL.AVAJ");
    }

    @Test
    public void test37827() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest75.test37827");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.startsWithIgnoreCase("AVAJECAFRETNI", "................................                       JAVAULANGinterface java.io.Serializable");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test37828() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest75.test37828");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitByCharacterTypeCamelCase("##########");
        java.lang.String str3 = org.apache.commons.lang3.ClassUtils.getPackageName((java.lang.Object) "##########", "tSslitUgnirtSslitUgnirtSslitUgnirtSslitUgnirtS");
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "java.lang" + "'", str3, "java.lang");
    }

    @Test
    public void test37829() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest75.test37829");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitByCharacterType("########$#######$");
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test37830() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest75.test37830");
        java.lang.String str1 = org.apache.commons.lang3.ClassUtils.getShortCanonicalName("                                                                                                                                                                                                                                                                                                                              ][ssalC                                                                                                                                                                                                                                                                                                                                                        ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "][ssalC" + "'", str1, "][ssalC");
    }

    @Test
    public void test37831() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest75.test37831");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.chomp("ARRYLIST $ $ $ $ $ $ $ $ $ $ $ $ ...", "............................");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "ARRYLIST $ $ $ $ $ $ $ $ $ $ $ $ ..." + "'", str2, "ARRYLIST $ $ $ $ $ $ $ $ $ $ $ $ ...");
    }

    @Test
    public void test37832() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest75.test37832");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBefore("###############################################################################################################################################################", "4444444444444444chaa[]");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "###############################################################################################################################################################" + "'", str2, "###############################################################################################################################################################");
    }

    @Test
    public void test37833() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest75.test37833");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBeforeLast("AAAA                       JAVAULANGvvayLasinterface java.lang.Cloneable.......java.......Objectava..........javainterface java.io.Serializable##################################################", "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "AAAA                       JAVAULANGvvayLasinterface java.lang.Cloneable.......java.......Objectava..........javainterface java.io.Serializable##################################################" + "'", str2, "AAAA                       JAVAULANGvvayLasinterface java.lang.Cloneable.......java.......Objectava..........javainterface java.io.Serializable##################################################");
    }

    @Test
    public void test37834() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest75.test37834");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substring("###################################################################################################################################################################################################################################################################################################################################################################################################################################################################################..........a       ..", 30);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "#####################################################################################################################################################################################################################################################################################################################################################################################################################################################..........a       .." + "'", str2, "#####################################################################################################################################################################################################################################################################################################################################################################################################################################################..........a       ..");
    }

    @Test
    public void test37835() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest75.test37835");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNotEmpty((java.lang.CharSequence) "irfCo$irfioriiirfCo$irfioriiirfCo$irfioriiirfCo$irfioriiirfCo$irfio.ArrayListArrayListArrayListArrayLis");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test37836() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest75.test37836");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.substringsBetween("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa...", "aaaa......", "U                                                                                                                                                                                                                                                                                                       JAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA...");
        org.junit.Assert.assertNull(strArray3);
    }

    @Test
    public void test37837() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest75.test37837");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "vajvajvajvajvajvajvajvajvajvajvajvajvajvajvajvajvajvajvajvajvajvajvajvajvajvajvajvajvajvajvajvajvajvajvajvajvajvajvajvajvajvajvajvajvajvajvajvajvajvajvajvajvajvajvajvajvajvajvajvajvajvajvajvajvajvajvajvajvajvajvajvajvajvajvajvajvajvajvajvajvajvajvajvajvajvajvajvajvajvajvajvajvajvajvajvajvajvajva                                                                                                                                                   ..", "java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java.........");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test37838() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest75.test37838");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNumeric((java.lang.CharSequence) "...       444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test37839() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest75.test37839");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceChars("$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$HO$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$RAYLIST$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$T", "interface java.lang.Cloneable.......java.......Objectava..........javainterface java.io.Serializable", "AAAAAAAAAAJAVAL.AGNAAAAAAAAAA");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$H$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$RAYLIT$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$T" + "'", str3, "$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$H$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$RAYLIT$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$T");
    }

    @Test
    public void test37840() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest75.test37840");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphanumeric((java.lang.CharSequence) "NALAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test37841() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest75.test37841");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAsciiPrintable((java.lang.CharSequence) "########$#######$          utilutilutilutilutilutilutilutilutilutilutilutilutilutilutilutilutilutilutilutilutilutilutilutilutilutilutilutilutilutilutilutilutilutilutilutilutilutilutilutilutilutilutilutilutilutilutilutilutilutilutilutilutilutilutilutilutilutilutilutilutilutilutilutilutilutilutilutilutilutilutilutilutilutilutilutilutilutilutilutilutilutilutilutilutilutilutilutilutilutilutilutilutilutilutilutilutilutilutilutilutilutilutilutilutilutilutilutilutilutilutilutilutilutilutilutilutilutilutilutilutilutilutilutilutilutilutilutilutilutilutilutilutilutilutilutilutilutilutilutilutilutilutilutilutilutilutilutilutilutilutilutilutilutilutilutilutilutilutilutilutilutilutilutilutilutilutilutilutilutilutilutilutilutilutilutilutilutilutilutilutilutilutilutilutilutilutilutilutilutilutilutilutilutilutilutilutilutilutilutilutilutilutilutilutilutilutilutilutilutilutilutilutilutilutilutilutilutilutilutilutilutilutilutilutilutilutilutiluti");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test37842() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest75.test37842");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBetween(".litu.avajlitu.avajlangjavalitu.avajlitu.avaj.litu.avajlitu.avajlangjavalitu.avajlitu.avaj.litu.avajlitu.avajlangjavalitu.avajlitu.avaj.litu.avajlitu.avajlangjavalitu.avajlitu.avaj.litu.avajlitu.avajlangjavalitu.avajlitu.avaj.litu.avajlitu.avajlangjavalitu.avajlitu.avaj.litu.avajlitu.avajlangjavalitu.avajlitu.avaj.litu.avajlitu.avajlangjavalitu.avajlitu.avaj.litu.avajlitu.avajlangjavalitu.avajlitu.avaj.litu.avajlitu.avaj1litu.avajlitu.avajAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAJlitu.avajlitu.avajavalitu.avajlitu.avaj.litu.avajlitu.avaj1litu.avajlitu.avajAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAlitu.avajlitu.avaj.litu.avajlitu.avaj1litu.avajlitu.avajAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA", "interfacejava.lang.cloneablestringinterfacejava");
        org.junit.Assert.assertNull(str2);
    }

    @Test
    public void test37843() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest75.test37843");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlpha((java.lang.CharSequence) "NAL.");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test37844() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest75.test37844");
        java.lang.String str2 = org.apache.commons.lang3.ClassUtils.getPackageCanonicalName((java.lang.Object) "...aaaaaaaaaaaaaaaaaaaaat", "ARRYLIST");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "java.lang" + "'", str2, "java.lang");
    }

    @Test
    public void test37845() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest75.test37845");
        java.lang.String str1 = org.apache.commons.lang3.ClassUtils.getPackageCanonicalName("4444444444444                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
    }

    @Test
    public void test37846() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest75.test37846");
        java.lang.Class[] classArray1 = new java.lang.Class[0];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray2 = (java.lang.Class<?>[]) classArray1;
        java.lang.Class<?>[] wildcardClassArray3 = org.apache.commons.lang3.ClassUtils.primitivesToWrappers(wildcardClassArray2);
        java.lang.String str5 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) wildcardClassArray3, "...                                 ");
        java.lang.Class<?>[] wildcardClassArray6 = org.apache.commons.lang3.ClassUtils.wrappersToPrimitives(wildcardClassArray3);
        java.lang.Class<?>[] wildcardClassArray7 = org.apache.commons.lang3.ClassUtils.toClass((java.lang.Object[]) wildcardClassArray6);
        java.lang.String str9 = org.apache.commons.lang3.ClassUtils.getPackageCanonicalName((java.lang.Object) wildcardClassArray7, "AAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAA");
        java.lang.Class<?>[] wildcardClassArray10 = org.apache.commons.lang3.ClassUtils.primitivesToWrappers(wildcardClassArray7);
        org.junit.Assert.assertNotNull(classArray1);
        org.junit.Assert.assertNotNull(wildcardClassArray2);
        org.junit.Assert.assertNotNull(wildcardClassArray3);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(wildcardClassArray6);
        org.junit.Assert.assertNotNull(wildcardClassArray7);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "java.lang" + "'", str9, "java.lang");
        org.junit.Assert.assertNotNull(wildcardClassArray10);
    }

    @Test
    public void test37847() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest75.test37847");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.stripEnd("irfCo$irfioSrA..ayL.A.44444444444444444444444444", "...     javaulangrraylist                   ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "irfCo$irfioSrA..ayL.A.44444444444444444444444444" + "'", str2, "irfCo$irfioSrA..ayL.A.44444444444444444444444444");
    }

    @Test
    public void test37848() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest75.test37848");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByCharacterType("$$$$$$$$$$$$$$$$$$$$$$$$$$$$$AAA");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOfAny("444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444litu.avajli", strArray2);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test37849() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest75.test37849");
        int int3 = org.apache.commons.lang3.StringUtils.indexOf("-1A.A.Auti.StriAj-1A.A.Auti.StriAj", 570, (int) (short) 100);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test37850() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest75.test37850");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass1 = org.apache.commons.lang3.ClassUtils.getClass("44444444444444444444444444444444444444444444444444444444JAVA.LANGAgnal.avajgnal..LANGgnal.avJAVA.LANGAgnal.avajgnal..LANGgnal.avJAVA.LANGAgnal.avajgnal..LANGgnal.avJAVA.LANGAgnal.avajgnal..LANGgnal.avJAVA.LANGAgnal.avajgnal..LANGgnal.avJAVA.LANGAgnal.avajgnal..LANGgnal.avJAVA.LANGAgnal.avajgnal..LANGgnal.avJAVA.LANGAgnal.avajgnal..LANGgnal.avJAVA.LANGAgnal.avajgnal..LANGgnal.avJAVA.LANGAgnal.avajgnal.");
            org.junit.Assert.fail("Expected exception of type java.lang.ClassNotFoundException; message: 44444444444444444444444444444444444444444444444444444444JAVA/LANGAgnal/avajgnal//LANGgnal/avJAVA/LANGAgnal/avajgnal//LANGgnal/avJAVA/LANGAgnal/avajgnal//LANGgnal/avJAVA/LANGAgnal/avajgnal//LANGgnal/avJAVA/LANGAgnal/avajgnal//LANGgnal/avJAVA/LANGAgnal/avajgnal//LANGgnal/avJAVA/LANGAgnal/avajgnal//LANGgnal/avJAVA/LANGAgnal/avajgnal//LANGgnal/avJAVA/LANGAgnal/avajgnal//LANGgnal/avJAVA/LANGAgnal/avajgnal/");
        } catch (java.lang.ClassNotFoundException e) {
            // Expected exception.
        }
    }

    @Test
    public void test37851() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest75.test37851");
        int int2 = org.apache.commons.lang3.StringUtils.indexOf("JAVATSILYARRATSILYARRATSILYARRA$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$", "ArrayLisArrayLisArrayLisArrayLisArra....................................................................................................");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test37852() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest75.test37852");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.stripStart("", "                                   ####################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test37853() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest75.test37853");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isEmpty((java.lang.CharSequence) "####java.uti###############################..");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test37854() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest75.test37854");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.leftPad("JAVAGNAL                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                     JAVA.LANG.CLONEABLE...                                 INTERFACE JAVA.IO.SERIALIZABLE", 502);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "JAVAGNAL                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                     JAVA.LANG.CLONEABLE...                                 INTERFACE JAVA.IO.SERIALIZABLE" + "'", str2, "JAVAGNAL                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                     JAVA.LANG.CLONEABLE...                                 INTERFACE JAVA.IO.SERIALIZABLE");
    }

    @Test
    public void test37855() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest75.test37855");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBefore("                                                                                                                                                                                                                                                                                                                                                                                                                                             rgnaluavajtutututututut                                                                                                                                                                                                                                                                                                                                                                                                                                             ", "JAVAlLANGJAVAlLANGJAVAlLANGJAVAlLANGJAVAlLANGJAVAlLANGJAVAlLANGJAVAlLANGJAVAlLANGJAVAlLANGJAVAlLANGJAVAlLANGJAVAlLANGJAVAlLANGJAVAlLANGJAVAlLANGJAVAlLANGJAVAlLANGJAVAlLANGJAVAlLANGJAVAlLANGJAVAlLANGJAVAlLANGJAVAlLANGJAVAlLANGJAVAlLANGJAjaval.agnjaval.agnjaval.agnjaval.agnjaval.agnjaval.agnjaval.agnjaval.agnjabytejaval.agnjaval.agnjaval.agnjaval.agnjaval.agnjaval.agnjaval.agnjaval.agnjaJAVAlLANGJAVAlLANGJAVAlLANGJAVAlLANGJAVAlLANGJAVAlLANGJAVAlLANGJAVAlLANGJAVAlLANGJAVAlLANGJAVAlLANGJAVAlLANGJAVAlLANGJAVAlLANGJAVAlLANGJAVAlLANGJAVAlLANGJAVAlLANGJAVAlLANGJAVAlLANGJAVAlLANGJAVAlLANGJAVAlLANGJAVAlLANGJAVAlLANGJAVAlLANGJA");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                                                                                                                                                                                                                                                                                                                                                                                                                             rgnaluavajtutututututut                                                                                                                                                                                                                                                                                                                                                                                                                                             " + "'", str2, "                                                                                                                                                                                                                                                                                                                                                                                                                                             rgnaluavajtutututututut                                                                                                                                                                                                                                                                                                                                                                                                                                             ");
    }

    @Test
    public void test37856() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest75.test37856");
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.split("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "$$$$$$java", 45);
        java.lang.String str5 = org.apache.commons.lang3.StringUtils.concatWith("interface java.lang.Cloneable#interface java.io.Serializable", (java.lang.Object[]) strArray4);
        java.lang.String[] strArray6 = org.apache.commons.lang3.StringUtils.stripAll(strArray4);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(strArray6);
    }

    @Test
    public void test37857() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest75.test37857");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.remove("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa444444444444444444444444444444444444444444444444444444GNL$.$VJaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", '.');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa444444444444444444444444444444444444444444444444444444GNL$$VJaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa" + "'", str2, "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa444444444444444444444444444444444444444444444444444444GNL$$VJaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
    }

    @Test
    public void test37858() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest75.test37858");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitByCharacterTypeCamelCase(".langGNAL..langjava.langAGNAL.AVAJ");
        java.lang.String str5 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray1, '.', 570, 16);
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
    }

    @Test
    public void test37859() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest75.test37859");
        java.lang.ClassLoader classLoader0 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass2 = org.apache.commons.lang3.ClassUtils.getClass(classLoader0, "                                                                                                                                                                                                                                             HI!aRRAYlISTaRRAYlISTaRRAYlISTAVAJ");
            org.junit.Assert.fail("Expected exception of type java.lang.ClassNotFoundException; message: HI!aRRAYlISTaRRAYlISTaRRAYlISTAVAJ");
        } catch (java.lang.ClassNotFoundException e) {
            // Expected exception.
        }
    }

    @Test
    public void test37860() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest75.test37860");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.repeat("gnal.avaj                                                                                                                                                                                                                                                                                                                                                                                                                                                       ", 0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test37861() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest75.test37861");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsIgnoreCase("chaa[]", "arrayListArrayListArrayListavaj                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                               ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test37862() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest75.test37862");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripAccents((java.lang.CharSequence) "u                                                                                                                                                                                                                                                                                                       Java.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava...");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "u                                                                                                                                                                                                                                                                                                       Java.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava..." + "'", str1, "u                                                                                                                                                                                                                                                                                                       Java.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava...");
    }

    @Test
    public void test37863() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest75.test37863");
        java.lang.String str2 = org.apache.commons.lang3.ClassUtils.getPackageCanonicalName((java.lang.Object) "$$$VA$LANGAVAJ$GNALJAVA$LANGAVAJ$GNALJAVA$LANGAVAJ$GNALJAVA$LANGAVAJ$GNALJAVA$LANGAVAJ$GNALJAVA$LANGgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalg", "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "java.lang" + "'", str2, "java.lang");
    }

    @Test
    public void test37864() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest75.test37864");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.split("#####################################################################################################################################################################################################################################################################################################################################tS.gnal.avaj#####################################################################################################################################################################################################################################################################################################################################", ".gnirts", 78);
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void test37865() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest75.test37865");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitByCharacterTypeCamelCase("               I.......               ");
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test37866() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest75.test37866");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.leftPad("class javalangclass                       javaulang                       javaulang                       javaulang                       javaulang                       javaulang                       javaulang                       javaulang                       javaulang                       javaulang                       javaulang                       javaulang                       javaulang                       javaulang                       javaulang                       javaulang                       javaulang                       javaulang                       javaulang                       javaulang                       javaulang", 69, "A..iyL ziirSoifri.oCfriCLASS JAVALANGCLASS                       JAVAULANG                       JAVAULANG                       JAVAULANG                       JAVAULANG                       JAVAULANG                       JAVAULANG                       JAVAULANG                       JAVAULANG                       JAVAULANG                       JAVAULANG                       JAVAULANG                       JAVAULANG                       JAVAULANG                       JAVAULANG                       JAVAULANG                       JAVAULANG                       JAVAULANG                       JAVAULANG                       JAVAULANG                       JAVAULANGCLASS JAVALANGCLASS                       JAVAULANG                       JAVAULANG                       JAVAULANG                       JAVAULANG                       JAVAULANG                       JAVAULANG                       JAVAU");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "class javalangclass                       javaulang                       javaulang                       javaulang                       javaulang                       javaulang                       javaulang                       javaulang                       javaulang                       javaulang                       javaulang                       javaulang                       javaulang                       javaulang                       javaulang                       javaulang                       javaulang                       javaulang                       javaulang                       javaulang                       javaulang" + "'", str3, "class javalangclass                       javaulang                       javaulang                       javaulang                       javaulang                       javaulang                       javaulang                       javaulang                       javaulang                       javaulang                       javaulang                       javaulang                       javaulang                       javaulang                       javaulang                       javaulang                       javaulang                       javaulang                       javaulang                       javaulang                       javaulang");
    }

    @Test
    public void test37867() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest75.test37867");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.endsWithIgnoreCase("cHARACTERUTILsTRI", "..aaaaaaaaaaaaaaaaaaaaaaaaaaaaa.....");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test37868() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest75.test37868");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.chomp("tsiLyarrA.La.langtsiLyarrA.La.langtsiLyarrAJavaaaaaaaaaava.langava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langa.langtsiLyarrA.La.langtsiLyarrA.La.lang", "Litulitulitulitulitul####litulitulitulitulitul");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "tsiLyarrA.La.langtsiLyarrA.La.langtsiLyarrAJavaaaaaaaaaava.langava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langa.langtsiLyarrA.La.langtsiLyarrA.La.lang" + "'", str2, "tsiLyarrA.La.langtsiLyarrA.La.langtsiLyarrAJavaaaaaaaaaava.langava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langa.langtsiLyarrA.La.langtsiLyarrA.La.lang");
    }

    @Test
    public void test37869() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest75.test37869");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.rightPad("   ####   ", (int) (byte) 100, "slitUgnirtSslitUgnirtSslitUgnirtSslitUgnirtSslitUgnirtSslitUgnirtSslitUgnirtSslitUgnirtSslitUgnirtSslitUgnirtslitUgnirtSslitUgnirtSslitUgnirtSslitUgnirtSslitUgnirtSslitUgnirtSslitUgnirtSslitUgnirtSslitUgnirtSslitUgnirtslitUgnirtSslitUgnirtSslitUgnirtSslitUgnirtSslitUgnirtSslitUgnirtSslgnalslitUgnirtSslitUgnirtSslitUgnirtSslitUgnirtSslitUgnirtSslitUgnirtSslitUgnirtSslitUgnirtSslitUgnirtSslitUgnirtslitUgnirtSslitUgnirtSslitUgnirtSslitUgnirtSslitUgnirtSslitUgnirtSslitUgnirtSslitUgnirtSslitUgnirtSslitUgnirtslitUgnirtSslitUgnirtSslitUgnirtSslitUgnirtSslitUgnirtSslitUgnirtSsl");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "   ####   slitUgnirtSslitUgnirtSslitUgnirtSslitUgnirtSslitUgnirtSslitUgnirtSslitUgnirtSslitUgnirtSsl" + "'", str3, "   ####   slitUgnirtSslitUgnirtSslitUgnirtSslitUgnirtSslitUgnirtSslitUgnirtSslitUgnirtSslitUgnirtSsl");
    }

    @Test
    public void test37870() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest75.test37870");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitByCharacterTypeCamelCase("BYTE");
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test37871() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest75.test37871");
        int int2 = org.apache.commons.lang3.StringUtils.getLevenshteinDistance((java.lang.CharSequence) "jAVA.LANGAgnal.avajgnal..LANGgnal.avArrclass java.lang.ObjectyListAr...", (java.lang.CharSequence) "jv..........jv..........jv4444444444..                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                    ");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 563 + "'", int2 == 563);
    }

    @Test
    public void test37872() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest75.test37872");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("                                                                                                                                                                                                                                                                                                                                                          JAVAL#.#AGN       AAAAAAAAAAAAAAAAAAAAAAAAA                                                                                                                                                                                                                                                                                                                                                         ", "avaj ..........................................................................................................................................................................................................................................................................................................................................", 2);
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void test37873() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest75.test37873");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfAnyBut(" ", "A..ayL A##############A..ayL A##############A..ayL A##############A..ayL A##############A..ayL A##############A..ayL A##############A..ayL A#########.......                                                  ");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test37874() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest75.test37874");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.split("L.ArryList", "-1jvJAVATSILYARRATSILYARRATSILYARRA");
        boolean boolean4 = org.apache.commons.lang3.StringUtils.endsWithAny("$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$ih", strArray3);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test37875() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest75.test37875");
        char[] charArray13 = new char[] { ' ', ' ', '#', 'a', '4', 'a' };
        int int14 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "", charArray13);
        boolean boolean15 = org.apache.commons.lang3.StringUtils.containsAny("$", charArray13);
        int int16 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "", charArray13);
        boolean boolean17 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "...       AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA", charArray13);
        int int18 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "tu", charArray13);
        boolean boolean19 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "...$$$$$$$$$$$$$$$..", charArray13);
        boolean boolean20 = org.apache.commons.lang3.StringUtils.containsAny("arahCretcarahCretcarahCretcarahCretcarahCretcarahCretcarahCretcarahCretcarahCretcarahCretcarahCretcarahCretcarahCretcarahCretcarahCretcarahCretcarahCretcarahCretcarahCretcarahCretcarahCretcarahCretcarahCretcarahCretcarahCretcarahCretcarahCretcarahCretcarahCretcarahCretcarahCretcarahCretcarahCretcarahCretcarahCretcarahCretcarahCretcarahCretcarahCretcarahCretcarahCretcarahCretcarahCretcarahCretcarahCretcarahCretcarahCretcarahCretcarahCretcarahCretcarahCretcarahCretcarahCretcarahCretcarahCretcarahCretcarahCretcarahCretcarahCretcarahCretcarahCretcarahCretcarahCAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAALANG.JAVA", charArray13);
        org.junit.Assert.assertNotNull(charArray13);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray13), "  #a4a");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray13), "  #a4a");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray13), "[ ,  , #, a, 4, a]");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
    }

    @Test
    public void test37876() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest75.test37876");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphanumericSpace((java.lang.CharSequence) "         INTEGER              ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test37877() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest75.test37877");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.split("h!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ihgn gnal.avaj", '.');
        java.lang.Class<?>[] wildcardClassArray3 = org.apache.commons.lang3.ClassUtils.toClass((java.lang.Object[]) strArray2);
        java.lang.Class<?> wildcardClass4 = null;
        java.lang.Class[] classArray6 = new java.lang.Class[1];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray7 = (java.lang.Class<?>[]) classArray6;
        wildcardClassArray7[0] = wildcardClass4;
        java.lang.Class[] classArray11 = new java.lang.Class[0];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray12 = (java.lang.Class<?>[]) classArray11;
        boolean boolean14 = org.apache.commons.lang3.ClassUtils.isAssignable(wildcardClassArray7, wildcardClassArray12, false);
        java.lang.String str16 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) wildcardClassArray12, "#");
        boolean boolean17 = org.apache.commons.lang3.ClassUtils.isAssignable(wildcardClassArray3, wildcardClassArray12);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertNotNull(wildcardClassArray3);
        org.junit.Assert.assertNotNull(classArray6);
        org.junit.Assert.assertNotNull(wildcardClassArray7);
        org.junit.Assert.assertNotNull(classArray11);
        org.junit.Assert.assertNotNull(wildcardClassArray12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test37878() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest75.test37878");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.endsWith("ARRA", "      .lang.Stringclass java.lang.Stringclass java.lang.Stringclas       ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test37879() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest75.test37879");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitByCharacterTypeCamelCase("...       aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.concat((java.lang.Object[]) strArray1);
        int int3 = org.apache.commons.lang3.StringUtils.indexOfDifference((java.lang.CharSequence[]) strArray1);
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray1, "####java.uti###############################..", 199, 0);
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "...       aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa" + "'", str2, "...       aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
    }

    @Test
    public void test37880() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest75.test37880");
        char[] charArray1 = null;
        int int2 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "                                                                             se...                                                                             ", charArray1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test37881() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest75.test37881");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.capitalize((java.lang.CharSequence) "       #############################################$$$$$$$$$$$$$$$$$$$$$$$$$$$$$...$$$$$$$$$$$$$$$$$$$$$$$$$$$$$...$$$$$$$$$$$$$$$$$$$$$$$$$$$$$...$$$$$$$$$$$$$$$$$$$");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "       #############################################$$$$$$$$$$$$$$$$$$$$$$$$$$$$$...$$$$$$$$$$$$$$$$$$$$$$$$$$$$$...$$$$$$$$$$$$$$$$$$$$$$$$$$$$$...$$$$$$$$$$$$$$$$$$$" + "'", str1, "       #############################################$$$$$$$$$$$$$$$$$$$$$$$$$$$$$...$$$$$$$$$$$$$$$$$$$$$$$$$$$$$...$$$$$$$$$$$$$$$$$$$$$$$$$$$$$...$$$$$$$$$$$$$$$$$$$");
    }

    @Test
    public void test37882() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest75.test37882");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaagn", "serializable", 655);
        java.lang.String str5 = org.apache.commons.lang3.ClassUtils.getShortCanonicalName((java.lang.Object) "serializable", "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                             jvstringnlrrylistrrylistrrylistv");
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "String" + "'", str5, "String");
    }

    @Test
    public void test37883() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest75.test37883");
        int int3 = org.apache.commons.lang3.StringUtils.indexOf("tuLlituLlituLlituLlituLlituLlituLlituLlituLlituLlituLlituLlituLlituL", "                                                                                                                                                                                                                                                                                                                                                        ", 50);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test37884() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest75.test37884");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("$ArrayList", "$ArrayList");
        java.lang.String str5 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray3, "slitUgnirtS");
        java.lang.String str9 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray3, '.', 152, (int) ' ');
        java.lang.String[] strArray10 = org.apache.commons.lang3.StringUtils.stripAll(strArray3);
        java.lang.String str12 = org.apache.commons.lang3.ClassUtils.getShortClassName((java.lang.Object) strArray10, "...avaj..........avaj..........avaj");
        java.lang.String[] strArray13 = org.apache.commons.lang3.StringUtils.stripAll(strArray10);
        int int14 = org.apache.commons.lang3.StringUtils.indexOfAny("elbazilaireS.oi.avaj ecafretniav...", strArray13);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "slitUgnirtSslitUgnirtSslitUgnirtSslitUgnirtSslitUgnirtSslitUgnirtSslitUgnirtSslitUgnirtSslitUgnirtSslitUgnirtS" + "'", str5, "slitUgnirtSslitUgnirtSslitUgnirtSslitUgnirtSslitUgnirtSslitUgnirtSslitUgnirtSslitUgnirtSslitUgnirtSslitUgnirtS");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNotNull(strArray10);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "String[]" + "'", str12, "String[]");
        org.junit.Assert.assertNotNull(strArray13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
    }

    @Test
    public void test37885() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest75.test37885");
        java.lang.Object[] objArray0 = null;
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.join(objArray0, "...aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa... aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa... aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa... aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa... aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa... aaaaaaaaaaaaaaaaaaaaaaaaaa...");
        org.junit.Assert.assertNull(str2);
    }

    @Test
    public void test37886() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest75.test37886");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceChars("INTERFA...", "interface java.lang.Cloneable][sslCinterface java.io.Serializable", "Serializabl#...#     #java#44444444444444444#.#4444");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "INTERFA..." + "'", str3, "INTERFA...");
    }

    @Test
    public void test37887() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest75.test37887");
        java.util.Locale locale1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.apache.commons.lang3.StringUtils.upperCase("RRAYlISTRRAYlISTRRAYlISTAVAJgnl", locale1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test37888() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest75.test37888");
        java.lang.ClassLoader classLoader0 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass3 = org.apache.commons.lang3.ClassUtils.getClass(classLoader0, "       aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa...", false);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassNotFoundException; message: aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa///");
        } catch (java.lang.ClassNotFoundException e) {
            // Expected exception.
        }
    }

    @Test
    public void test37889() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest75.test37889");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.split("$", ' ');
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.getCommonPrefix(strArray3);
        int int5 = org.apache.commons.lang3.StringUtils.indexOfDifference((java.lang.CharSequence[]) strArray3);
        boolean boolean6 = org.apache.commons.lang3.StringUtils.endsWithAny("$$$$$$$JAVA.UTI", strArray3);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "$" + "'", str4, "$");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test37890() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest75.test37890");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.mid("siLyrrA                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                             ", 40, 143);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "                                                                                                                                               " + "'", str3, "                                                                                                                                               ");
    }

    @Test
    public void test37891() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest75.test37891");
        java.lang.CharSequence charSequence2 = org.apache.commons.lang3.StringUtils.defaultIfEmpty((java.lang.CharSequence) "Jvstringnlrrylistrrylistrrylis", (java.lang.CharSequence) "                                                                              javaulainterface java.lang.cloneable4interface java.io.serializabl");
        org.junit.Assert.assertEquals("'" + charSequence2 + "' != '" + "Jvstringnlrrylistrrylistrrylis" + "'", charSequence2, "Jvstringnlrrylistrrylistrrylis");
    }

    @Test
    public void test37892() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest75.test37892");
        java.lang.CharSequence charSequence2 = org.apache.commons.lang3.StringUtils.defaultIfBlank((java.lang.CharSequence) "OI.AVAJECAFRETNI#ELBAENOLc.GNAL.AVAJECAFRETNIaRRAYlISTaRRAYlISTaRRAYlISTaRRAYlISaRRAYlISTaRRAYlISTaRRAYlISTaRRAYlISaRRAYlISTaRRAYlISTaRRAYlISTaRRAYlISaRRAYlISTaRRAYlISTaRRAYlISTaRRAYlISaRRAYlISTaRRAYlISTaRRAYlISTaRRAYlISaRRAYlISTaRRAYlISTaRRAYlISTaRRAYlISaRRAYlISTaRRAYlISTaRRAYlISTaRRAYlISaRRAYlISTaRRAYlISTaRRAYlISTaRRAYlISaRRAYlISTaRRAYlISTaRRAYlISTaRRAYlISaRRAYlISTaRRAYlISTaRRAYlISTaRRAYlISaRRAYlISTaRRAYlISTaRRAYlISTaRRAYlISaRRAYlISTaRRAYlISTaRRAYlISTaRRAYlISaRRAYlISTaRRAYlISTaRRAYlISTaRRAYlISaRRAYlISTaRRAYlISTaRRAYlISTaRRAYlISaRRAYlISTaRRAYlISTaRRAYlISTaRRAYlISaRRAYlISTaRRAYlISTaRRAYlISTaRRAYlISaRRAYlISTaRRAYlISTaRRAYlISTaRRAYlISaRRAYlISTaRRAYlISTaRRAYlIST", (java.lang.CharSequence) "   A..iyL ziirSoifri.oCfriCLASS JAVALANGCLASS                       JAVAULANG                       JAVAULANG                       JAVAULANG                       JAVAULANG                       JAVAULANG                       JAVAULANG                       JAVAULANG                       JAVAULANG                       JAVAULANG                       JAVAULANG                       JAVAULANG                       JAVAULANG                       JAVAULANG                       JAVAULANG                       JAVAULANG                       JAVAULANG                       JAVAULANG                       JAVAULANG                       JAVAULANG                       JAVAULANGCLASS JAVALANGCLASS                       JAVAULANG                       JAVAULANG                       JAVAULANG                       JAVAULANG                       JAVAULANG                       JAVAULANG                       JAVAU");
        org.junit.Assert.assertEquals("'" + charSequence2 + "' != '" + "OI.AVAJECAFRETNI#ELBAENOLc.GNAL.AVAJECAFRETNIaRRAYlISTaRRAYlISTaRRAYlISTaRRAYlISaRRAYlISTaRRAYlISTaRRAYlISTaRRAYlISaRRAYlISTaRRAYlISTaRRAYlISTaRRAYlISaRRAYlISTaRRAYlISTaRRAYlISTaRRAYlISaRRAYlISTaRRAYlISTaRRAYlISTaRRAYlISaRRAYlISTaRRAYlISTaRRAYlISTaRRAYlISaRRAYlISTaRRAYlISTaRRAYlISTaRRAYlISaRRAYlISTaRRAYlISTaRRAYlISTaRRAYlISaRRAYlISTaRRAYlISTaRRAYlISTaRRAYlISaRRAYlISTaRRAYlISTaRRAYlISTaRRAYlISaRRAYlISTaRRAYlISTaRRAYlISTaRRAYlISaRRAYlISTaRRAYlISTaRRAYlISTaRRAYlISaRRAYlISTaRRAYlISTaRRAYlISTaRRAYlISaRRAYlISTaRRAYlISTaRRAYlISTaRRAYlISaRRAYlISTaRRAYlISTaRRAYlISTaRRAYlISaRRAYlISTaRRAYlISTaRRAYlISTaRRAYlISaRRAYlISTaRRAYlISTaRRAYlISTaRRAYlISaRRAYlISTaRRAYlISTaRRAYlIST" + "'", charSequence2, "OI.AVAJECAFRETNI#ELBAENOLc.GNAL.AVAJECAFRETNIaRRAYlISTaRRAYlISTaRRAYlISTaRRAYlISaRRAYlISTaRRAYlISTaRRAYlISTaRRAYlISaRRAYlISTaRRAYlISTaRRAYlISTaRRAYlISaRRAYlISTaRRAYlISTaRRAYlISTaRRAYlISaRRAYlISTaRRAYlISTaRRAYlISTaRRAYlISaRRAYlISTaRRAYlISTaRRAYlISTaRRAYlISaRRAYlISTaRRAYlISTaRRAYlISTaRRAYlISaRRAYlISTaRRAYlISTaRRAYlISTaRRAYlISaRRAYlISTaRRAYlISTaRRAYlISTaRRAYlISaRRAYlISTaRRAYlISTaRRAYlISTaRRAYlISaRRAYlISTaRRAYlISTaRRAYlISTaRRAYlISaRRAYlISTaRRAYlISTaRRAYlISTaRRAYlISaRRAYlISTaRRAYlISTaRRAYlISTaRRAYlISaRRAYlISTaRRAYlISTaRRAYlISTaRRAYlISaRRAYlISTaRRAYlISTaRRAYlISTaRRAYlISaRRAYlISTaRRAYlISTaRRAYlISTaRRAYlISaRRAYlISTaRRAYlISTaRRAYlISTaRRAYlISaRRAYlISTaRRAYlISTaRRAYlIST");
    }

    @Test
    public void test37893() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest75.test37893");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.left("rrrrrrrrrrrrrrrrrrrrrrrrrrrrrr", 18);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "rrrrrrrrrrrrrrrrrr" + "'", str2, "rrrrrrrrrrrrrrrrrr");
    }

    @Test
    public void test37894() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest75.test37894");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.split("siLyrrA");
        boolean boolean3 = org.apache.commons.lang3.StringUtils.endsWithAny("avaj.gnalavaj.gnalavaj.gnal4444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444", strArray2);
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.concat((java.lang.Object[]) strArray2);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "siLyrrA" + "'", str4, "siLyrrA");
    }

    @Test
    public void test37895() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest75.test37895");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAllUpperCase((java.lang.CharSequence) "avajlitu");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test37896() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest75.test37896");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substring("4444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444", 16);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444" + "'", str2, "444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444");
    }

    @Test
    public void test37897() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest75.test37897");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("arryLis", "L.ArryList", 331);
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void test37898() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest75.test37898");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.leftPad("", 483, 'a');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa" + "'", str3, "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
    }

    @Test
    public void test37899() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest75.test37899");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "..........4444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444rclass java.lang.O...", "...hahactaRChahactaRChahactaRChahactaRChahactaRChahactaRChahactaRChahactaRChahactaRChahactaRChahactaRChaha...");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test37900() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest75.test37900");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.endsWith("y", "arrclas...");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test37901() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest75.test37901");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.leftPad("String[]String[]String[]String[]String[]String[]String[]String[]String[]String[]String[]String[]String[]String[]String[]String[]String[]String[]String[]String[]String[]String[]String[]String[]String[]String[]String[]String[]String[]String[]String[]String[]String[]String[]String[]String[]String[]String[]String[]String[]String[]String[]String[]String[]String[]String[]String[]String[]String[]String[]String[]String[]String[]String[]String[]String[]String[]String[]String[]String[]String[]String[]String[]String[]String[]String[]String[]", 154, "stri");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "String[]String[]String[]String[]String[]String[]String[]String[]String[]String[]String[]String[]String[]String[]String[]String[]String[]String[]String[]String[]String[]String[]String[]String[]String[]String[]String[]String[]String[]String[]String[]String[]String[]String[]String[]String[]String[]String[]String[]String[]String[]String[]String[]String[]String[]String[]String[]String[]String[]String[]String[]String[]String[]String[]String[]String[]String[]String[]String[]String[]String[]String[]String[]String[]String[]String[]String[]" + "'", str3, "String[]String[]String[]String[]String[]String[]String[]String[]String[]String[]String[]String[]String[]String[]String[]String[]String[]String[]String[]String[]String[]String[]String[]String[]String[]String[]String[]String[]String[]String[]String[]String[]String[]String[]String[]String[]String[]String[]String[]String[]String[]String[]String[]String[]String[]String[]String[]String[]String[]String[]String[]String[]String[]String[]String[]String[]String[]String[]String[]String[]String[]String[]String[]String[]String[]String[]String[]");
    }

    @Test
    public void test37902() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest75.test37902");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeEnd("vvayLasavvayLasajavaulainterface java.lang.Cloneable4interface java.io.SerializablevvayLasavvayLasa.", "                                                                                                                                                                                                                                                                              langajavatsiLyarrAtsiLyarrAtsiLyarrA                                                                                                                                                                                                                                                                              ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "vvayLasavvayLasajavaulainterface java.lang.Cloneable4interface java.io.SerializablevvayLasavvayLasa." + "'", str2, "vvayLasavvayLasajavaulainterface java.lang.Cloneable4interface java.io.SerializablevvayLasavvayLasa.");
    }

    @Test
    public void test37903() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest75.test37903");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.center("Integer                            Inte", 104);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                Integer                            Inte                                 " + "'", str2, "                                Integer                            Inte                                 ");
    }

    @Test
    public void test37904() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest75.test37904");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trimToNull("L.Arr yList");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "L.Arr yList" + "'", str1, "L.Arr yList");
    }

    @Test
    public void test37905() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest75.test37905");
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("st", "AtsiLytcejbO.gnal.avaj ssalcrrAtsiLytcejbO.gnal.avaj ssalcrrAva.langGNAL..langjava.langAGNAL.AVAJ", 126);
        java.lang.String[] strArray5 = org.apache.commons.lang3.StringUtils.stripAll(strArray4);
        java.lang.String[] strArray9 = org.apache.commons.lang3.StringUtils.split("44444444444444444.444444444444444444", '#');
        boolean boolean10 = org.apache.commons.lang3.StringUtils.startsWithAny("...       ....       .java.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.lang...       ....       .java.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.lang...       ....       .java.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.lang...       ....       .java.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.lang...       ....       .java.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.lang...       ....       .", strArray9);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str11 = org.apache.commons.lang3.StringUtils.replaceEachRepeatedly("444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444litu.avajli", strArray4, strArray9);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Search and Replace array lengths don't match: 3 vs 1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertNotNull(strArray9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test37906() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest75.test37906");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.defaultIfEmpty("AVAJ.GNALAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAACharacterCharacterCharacterCharacterclassjavalangClassJAVAULANGJAVAULANGJAVAULANGJAVAULANGJAVAULANGJAVAULANGJAVAULANGJAVAULANGJAVAULANGJAVAULANGJAVAULANGJAVAULANGJAVAULANGJAVAULANGJAVAULANGJAVAULANGJAVAULANGJAVAULANGJAVAULANGJAVAULANG$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$AVAJ.GNALAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAACharacterCharacterCharacterCharacter", "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "AVAJ.GNALAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAACharacterCharacterCharacterCharacterclassjavalangClassJAVAULANGJAVAULANGJAVAULANGJAVAULANGJAVAULANGJAVAULANGJAVAULANGJAVAULANGJAVAULANGJAVAULANGJAVAULANGJAVAULANGJAVAULANGJAVAULANGJAVAULANGJAVAULANGJAVAULANGJAVAULANGJAVAULANGJAVAULANG$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$AVAJ.GNALAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAACharacterCharacterCharacterCharacter" + "'", str2, "AVAJ.GNALAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAACharacterCharacterCharacterCharacterclassjavalangClassJAVAULANGJAVAULANGJAVAULANGJAVAULANGJAVAULANGJAVAULANGJAVAULANGJAVAULANGJAVAULANGJAVAULANGJAVAULANGJAVAULANGJAVAULANGJAVAULANGJAVAULANGJAVAULANGJAVAULANGJAVAULANGJAVAULANGJAVAULANG$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$AVAJ.GNALAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAACharacterCharacterCharacterCharacter");
    }

    @Test
    public void test37907() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest75.test37907");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitByCharacterType("... AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA... AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA... AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA... AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA... AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA... AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA... AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA... AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA... AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA... AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA");
        java.lang.Class<?>[] wildcardClassArray2 = org.apache.commons.lang3.ClassUtils.toClass((java.lang.Object[]) strArray1);
        java.lang.Class<?>[] wildcardClassArray3 = org.apache.commons.lang3.ClassUtils.primitivesToWrappers(wildcardClassArray2);
        java.lang.Class<?>[] wildcardClassArray4 = org.apache.commons.lang3.ClassUtils.wrappersToPrimitives(wildcardClassArray3);
        java.lang.Class<?>[] wildcardClassArray5 = org.apache.commons.lang3.ClassUtils.toClass((java.lang.Object[]) wildcardClassArray3);
        java.lang.String[] strArray7 = org.apache.commons.lang3.StringUtils.splitByCharacterType("... AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA... AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA... AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA... AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA... AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA... AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA... AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA... AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA... AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA... AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA");
        java.lang.Class<?>[] wildcardClassArray8 = org.apache.commons.lang3.ClassUtils.toClass((java.lang.Object[]) strArray7);
        java.lang.Class<?>[] wildcardClassArray9 = org.apache.commons.lang3.ClassUtils.primitivesToWrappers(wildcardClassArray8);
        java.lang.Class<?>[] wildcardClassArray10 = org.apache.commons.lang3.ClassUtils.wrappersToPrimitives(wildcardClassArray9);
        java.lang.Class<?>[] wildcardClassArray11 = org.apache.commons.lang3.ClassUtils.toClass((java.lang.Object[]) wildcardClassArray9);
        boolean boolean12 = org.apache.commons.lang3.ClassUtils.isAssignable(wildcardClassArray5, wildcardClassArray9);
        java.lang.String[] strArray15 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("hi!", "");
        java.lang.String[] strArray17 = org.apache.commons.lang3.StringUtils.stripAll(strArray15, "$");
        java.lang.Class<?>[] wildcardClassArray18 = org.apache.commons.lang3.ClassUtils.toClass((java.lang.Object[]) strArray15);
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
        boolean boolean41 = org.apache.commons.lang3.ClassUtils.isAssignable(wildcardClassArray18, wildcardClassArray33, false);
        java.lang.Class<?>[] wildcardClassArray42 = org.apache.commons.lang3.ClassUtils.primitivesToWrappers(wildcardClassArray18);
        java.lang.Class<?>[] wildcardClassArray43 = org.apache.commons.lang3.ClassUtils.primitivesToWrappers(wildcardClassArray42);
        java.lang.Class<?>[] wildcardClassArray44 = org.apache.commons.lang3.ClassUtils.wrappersToPrimitives(wildcardClassArray42);
        boolean boolean46 = org.apache.commons.lang3.ClassUtils.isAssignable(wildcardClassArray5, wildcardClassArray44, false);
        java.lang.String str47 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) wildcardClassArray5);
        java.lang.String[] strArray53 = org.apache.commons.lang3.StringUtils.split("ArrayList", "$", 10);
        java.lang.String str54 = org.apache.commons.lang3.StringUtils.concatWith("java.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.lang", (java.lang.Object[]) strArray53);
        java.lang.String[] strArray56 = org.apache.commons.lang3.StringUtils.splitByCharacterType("javal.agn");
        java.lang.String str57 = org.apache.commons.lang3.StringUtils.replaceEachRepeatedly("", strArray53, strArray56);
        java.lang.Class<?>[] wildcardClassArray58 = org.apache.commons.lang3.ClassUtils.toClass((java.lang.Object[]) strArray53);
        boolean boolean60 = org.apache.commons.lang3.ClassUtils.isAssignable(wildcardClassArray5, wildcardClassArray58, true);
        java.lang.Class<?>[] wildcardClassArray61 = org.apache.commons.lang3.ClassUtils.wrappersToPrimitives(wildcardClassArray58);
        java.lang.Class<?>[] wildcardClassArray62 = org.apache.commons.lang3.ClassUtils.wrappersToPrimitives(wildcardClassArray58);
        java.lang.Class<?> wildcardClass63 = null;
        java.lang.Class[] classArray65 = new java.lang.Class[1];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray66 = (java.lang.Class<?>[]) classArray65;
        wildcardClassArray66[0] = wildcardClass63;
        java.lang.Class<?>[] wildcardClassArray69 = org.apache.commons.lang3.ClassUtils.primitivesToWrappers(wildcardClassArray66);
        java.lang.String[] strArray71 = new java.lang.String[] { "                                   " };
        java.lang.String str72 = org.apache.commons.lang3.StringUtils.getCommonPrefix(strArray71);
        java.lang.Class<?>[] wildcardClassArray73 = org.apache.commons.lang3.ClassUtils.toClass((java.lang.Object[]) strArray71);
        java.lang.Class<?> wildcardClass74 = null;
        java.lang.Class[] classArray76 = new java.lang.Class[1];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray77 = (java.lang.Class<?>[]) classArray76;
        wildcardClassArray77[0] = wildcardClass74;
        java.lang.Class<?>[] wildcardClassArray80 = org.apache.commons.lang3.ClassUtils.primitivesToWrappers(wildcardClassArray77);
        boolean boolean81 = org.apache.commons.lang3.ClassUtils.isAssignable(wildcardClassArray73, wildcardClassArray77);
        boolean boolean83 = org.apache.commons.lang3.ClassUtils.isAssignable(wildcardClassArray66, wildcardClassArray77, true);
        java.lang.Class<?>[] wildcardClassArray84 = org.apache.commons.lang3.ClassUtils.primitivesToWrappers(wildcardClassArray66);
        java.lang.String str86 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) wildcardClassArray84, ' ');
        java.lang.String[] strArray90 = org.apache.commons.lang3.StringUtils.split("Arr... AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA... AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA... AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA... AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA... AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA... AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA... AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA... AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA... AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA... AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAyList", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa       ", 67);
        java.lang.Class<?>[] wildcardClassArray91 = org.apache.commons.lang3.ClassUtils.toClass((java.lang.Object[]) strArray90);
        boolean boolean93 = org.apache.commons.lang3.ClassUtils.isAssignable(wildcardClassArray84, wildcardClassArray91, true);
        boolean boolean94 = org.apache.commons.lang3.ClassUtils.isAssignable(wildcardClassArray58, wildcardClassArray84);
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertNotNull(wildcardClassArray2);
        org.junit.Assert.assertNotNull(wildcardClassArray3);
        org.junit.Assert.assertNotNull(wildcardClassArray4);
        org.junit.Assert.assertNotNull(wildcardClassArray5);
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertNotNull(wildcardClassArray8);
        org.junit.Assert.assertNotNull(wildcardClassArray9);
        org.junit.Assert.assertNotNull(wildcardClassArray10);
        org.junit.Assert.assertNotNull(wildcardClassArray11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(strArray15);
        org.junit.Assert.assertNotNull(strArray17);
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
        org.junit.Assert.assertNotNull(wildcardClassArray42);
        org.junit.Assert.assertNotNull(wildcardClassArray43);
        org.junit.Assert.assertNotNull(wildcardClassArray44);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertEquals("'" + str47 + "' != '" + "class java.lang.Classclass java.lang.Classclass java.lang.Classclass java.lang.Classclass java.lang.Classclass java.lang.Classclass java.lang.Classclass java.lang.Classclass java.lang.Classclass java.lang.Classclass java.lang.Classclass java.lang.Classclass java.lang.Classclass java.lang.Classclass java.lang.Classclass java.lang.Classclass java.lang.Classclass java.lang.Classclass java.lang.Classclass java.lang.Classclass java.lang.Classclass java.lang.Classclass java.lang.Classclass java.lang.Classclass java.lang.Classclass java.lang.Classclass java.lang.Classclass java.lang.Classclass java.lang.Classclass java.lang.Class" + "'", str47, "class java.lang.Classclass java.lang.Classclass java.lang.Classclass java.lang.Classclass java.lang.Classclass java.lang.Classclass java.lang.Classclass java.lang.Classclass java.lang.Classclass java.lang.Classclass java.lang.Classclass java.lang.Classclass java.lang.Classclass java.lang.Classclass java.lang.Classclass java.lang.Classclass java.lang.Classclass java.lang.Classclass java.lang.Classclass java.lang.Classclass java.lang.Classclass java.lang.Classclass java.lang.Classclass java.lang.Classclass java.lang.Classclass java.lang.Classclass java.lang.Classclass java.lang.Classclass java.lang.Classclass java.lang.Class");
        org.junit.Assert.assertNotNull(strArray53);
        org.junit.Assert.assertEquals("'" + str54 + "' != '" + "ArrayList" + "'", str54, "ArrayList");
        org.junit.Assert.assertNotNull(strArray56);
        org.junit.Assert.assertEquals("'" + str57 + "' != '" + "" + "'", str57, "");
        org.junit.Assert.assertNotNull(wildcardClassArray58);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + false + "'", boolean60 == false);
        org.junit.Assert.assertNotNull(wildcardClassArray61);
        org.junit.Assert.assertNotNull(wildcardClassArray62);
        org.junit.Assert.assertNotNull(classArray65);
        org.junit.Assert.assertNotNull(wildcardClassArray66);
        org.junit.Assert.assertNotNull(wildcardClassArray69);
        org.junit.Assert.assertNotNull(strArray71);
        org.junit.Assert.assertEquals("'" + str72 + "' != '" + "                                   " + "'", str72, "                                   ");
        org.junit.Assert.assertNotNull(wildcardClassArray73);
        org.junit.Assert.assertNotNull(classArray76);
        org.junit.Assert.assertNotNull(wildcardClassArray77);
        org.junit.Assert.assertNotNull(wildcardClassArray80);
        org.junit.Assert.assertTrue("'" + boolean81 + "' != '" + false + "'", boolean81 == false);
        org.junit.Assert.assertTrue("'" + boolean83 + "' != '" + false + "'", boolean83 == false);
        org.junit.Assert.assertNotNull(wildcardClassArray84);
        org.junit.Assert.assertEquals("'" + str86 + "' != '" + "" + "'", str86, "");
        org.junit.Assert.assertNotNull(strArray90);
        org.junit.Assert.assertNotNull(wildcardClassArray91);
        org.junit.Assert.assertTrue("'" + boolean93 + "' != '" + false + "'", boolean93 == false);
        org.junit.Assert.assertTrue("'" + boolean94 + "' != '" + false + "'", boolean94 == false);
    }

    @Test
    public void test37908() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest75.test37908");
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.replace("aAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA", "        avajlitu         ", "class java.lang", 540);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "aAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA" + "'", str4, "aAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA");
    }

    @Test
    public void test37909() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest75.test37909");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.center("lvj", 573, "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "                                                                                                                                                                                                                                                                                             lvj                                                                                                                                                                                                                                                                                             " + "'", str3, "                                                                                                                                                                                                                                                                                             lvj                                                                                                                                                                                                                                                                                             ");
    }

    @Test
    public void test37910() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest75.test37910");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isEmpty((java.lang.CharSequence) "JavaStringnalArrayListArrayListArrainterface java.lang.Cloneable44444444444444444444444444444444444444444444444444interface java.io.Serializable");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test37911() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest75.test37911");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.strip("", "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test37912() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest75.test37912");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsAny("......................................................................................................................................................................................................................................................................................................................................................................................................................................................................44444444444444444444444444444444444444444444444444444444444444444444444444444444         $", "interfINTERFACE JAVA.LANG.cLONEABLEsTRINGce jINTERFACE JAVA.LANG.cLONEABLEsTRINGvINTERFACE JAVA.LANG.cLONEABLEsTRING.lINTERFACE JAVA.LANG.cLONEABLEsTRINGng.cloneINTERFACE JAVA.LANG.cLONEABLEsTRINGble");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test37913() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest75.test37913");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.equalsIgnoreCase("tavaj.gnalarraylistarraylistarrayli                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                             ", "clss jv.lng.String");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test37914() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest75.test37914");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsAny("aRR... AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA... AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA... AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA... AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA... AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA... AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA... AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA... AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA... AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA.", ".lang.Stringclass java.lang.Stringclass java.lang.Stringclas");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test37915() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest75.test37915");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.startsWith("                                                                                                                                                                                                                                                                                                                                                                                                                                                                          L                                                                                                                                                                                                                                                                                                                                                                                                                                                                           ", "$       ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test37916() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest75.test37916");
        java.lang.String[] strArray7 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens(".......java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java", "LANG.GNALJAVA.LANGAVAJ.GNALJAVA.LANGAVAJ.GNALJAVA.LANGAVAJ.GNALJAVA.LANGAVAJ.GNALJAVA.LANGAVAJ.GNALJAVA.LANGAVAJ.GNALJAVA.LANGAVAJ.GNALJAVA.LANGAVAJ.JAVA", 33);
        int int8 = org.apache.commons.lang3.StringUtils.indexOfAny("TU", strArray7);
        java.lang.String[] strArray12 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("                                                      #############################################", "NTERFACEJAVA.LANG.cLONEABLE.......JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVAINTERFACEJAVA.IO.sERIALIZABLE", 47);
        java.lang.String str13 = org.apache.commons.lang3.StringUtils.replaceEachRepeatedly("", strArray7, strArray12);
        java.lang.String[] strArray16 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("$         $         $         $         $         $         $         $         $         $         $         $ ...", '4');
        java.lang.String str17 = org.apache.commons.lang3.StringUtils.replaceEach("AAAAAAAAAAnga.lavajAAAAAAAAAAnga.lavajAAAAAAAAAAnga.lavajAAAAAAAAAAnga.lavajAAAAAAAAAAnga.lavajAAAAAAAAAAnga.lavajAAAAAAAAAAnga.lavajAAAAAAAAAAnga.lavajAAAAAAAAAAnga.lavajAAAAAAAAAAnga.lavajAAAAAAAAAAnga.lavajAAAAAAAAAAnga.lavajAAAAAAAAAAnga.lavajAAAAAAAAAAnga.lavajAAAAAAAAAAnga.lavajAAAAAAAAAAnga.lavajAAAAAAAAAAnga.lavajAAAAAAAAAAnga.lavajAAAAAAAAAAnga.lavajAAAAAAAAAAnga.lavajAAAAAAAAAAnga.lavajAAAAAAAAAAnga.lavajAAAAAAAAAAnga.lavajAAAAAAAAAAnga.lavajAAAAAAAAAAnga.lavajAAAAAAAAAAnga.lavajAAAAAAAAAAnga.lavajAAAAAAAAAAnga.lavajAAAAAAAAAAnga.lavajAAAAAAAAAAnga.lavajAAAAAAAAAAnga.lavajAAAAAAAAAAnga.lavajAAAAAAAAAAnga.lavajAAAAAAAAAAnga.lavajAAAAAAAAAAnga.lavajAAAAAAAAAA                                                                                                                                                                                                                                                                         ", strArray12, strArray16);
        java.lang.String[] strArray20 = org.apache.commons.lang3.StringUtils.split("ArrayList", 'a');
        java.lang.String str22 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray20, "... AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA... AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA... AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA... AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA... AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA... AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA... AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA... AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA... AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA... AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str23 = org.apache.commons.lang3.StringUtils.replaceEach("....JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVAINTERFACEJAVA.IO.sERIALIZABLE", strArray16, strArray20);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Search and Replace array lengths don't match: 1 vs 2");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNotNull(strArray12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNotNull(strArray16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "AAAAAAAAAAnga.lavajAAAAAAAAAAnga.lavajAAAAAAAAAAnga.lavajAAAAAAAAAAnga.lavajAAAAAAAAAAnga.lavajAAAAAAAAAAnga.lavajAAAAAAAAAAnga.lavajAAAAAAAAAAnga.lavajAAAAAAAAAAnga.lavajAAAAAAAAAAnga.lavajAAAAAAAAAAnga.lavajAAAAAAAAAAnga.lavajAAAAAAAAAAnga.lavajAAAAAAAAAAnga.lavajAAAAAAAAAAnga.lavajAAAAAAAAAAnga.lavajAAAAAAAAAAnga.lavajAAAAAAAAAAnga.lavajAAAAAAAAAAnga.lavajAAAAAAAAAAnga.lavajAAAAAAAAAAnga.lavajAAAAAAAAAAnga.lavajAAAAAAAAAAnga.lavajAAAAAAAAAAnga.lavajAAAAAAAAAAnga.lavajAAAAAAAAAAnga.lavajAAAAAAAAAAnga.lavajAAAAAAAAAAnga.lavajAAAAAAAAAAnga.lavajAAAAAAAAAAnga.lavajAAAAAAAAAAnga.lavajAAAAAAAAAAnga.lavajAAAAAAAAAAnga.lavajAAAAAAAAAAnga.lavajAAAAAAAAAAnga.lavajAAAAAAAAAA                                                                                                                                                                                                                                                                         " + "'", str17, "AAAAAAAAAAnga.lavajAAAAAAAAAAnga.lavajAAAAAAAAAAnga.lavajAAAAAAAAAAnga.lavajAAAAAAAAAAnga.lavajAAAAAAAAAAnga.lavajAAAAAAAAAAnga.lavajAAAAAAAAAAnga.lavajAAAAAAAAAAnga.lavajAAAAAAAAAAnga.lavajAAAAAAAAAAnga.lavajAAAAAAAAAAnga.lavajAAAAAAAAAAnga.lavajAAAAAAAAAAnga.lavajAAAAAAAAAAnga.lavajAAAAAAAAAAnga.lavajAAAAAAAAAAnga.lavajAAAAAAAAAAnga.lavajAAAAAAAAAAnga.lavajAAAAAAAAAAnga.lavajAAAAAAAAAAnga.lavajAAAAAAAAAAnga.lavajAAAAAAAAAAnga.lavajAAAAAAAAAAnga.lavajAAAAAAAAAAnga.lavajAAAAAAAAAAnga.lavajAAAAAAAAAAnga.lavajAAAAAAAAAAnga.lavajAAAAAAAAAAnga.lavajAAAAAAAAAAnga.lavajAAAAAAAAAAnga.lavajAAAAAAAAAAnga.lavajAAAAAAAAAAnga.lavajAAAAAAAAAAnga.lavajAAAAAAAAAAnga.lavajAAAAAAAAAA                                                                                                                                                                                                                                                                         ");
        org.junit.Assert.assertNotNull(strArray20);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "Arr... AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA... AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA... AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA... AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA... AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA... AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA... AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA... AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA... AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA... AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAyList" + "'", str22, "Arr... AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA... AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA... AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA... AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA... AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA... AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA... AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA... AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA... AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA... AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAyList");
    }

    @Test
    public void test37917() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest75.test37917");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOf("av", "JAVAGNAL.AVAJLANG.JAVAGNAL.AVAJLANG.JAVAGNAL.AVAJLANG.JAVAGNAL.AVAJLANG.JAVAGNAL.AVAJLANG.JAVAGNAL.AVAJLANG.JAVAGNAL.AVAJLANG.JAVAGNAL.AVAJLANG. ArrayListArrayListArrayListavajGNAL");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test37918() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest75.test37918");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.strip("avaj.gnalnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAA", "                                                                           Javastring..                                                                          ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "j.gnalnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAA" + "'", str2, "j.gnalnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAA");
    }

    @Test
    public void test37919() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest75.test37919");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substring("interface java.lang.Cloneablegnal.avajgnal..LANGgnal.avajgnal.interface java.io.Serializabl", 0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "interface java.lang.Cloneablegnal.avajgnal..LANGgnal.avajgnal.interface java.io.Serializabl" + "'", str2, "interface java.lang.Cloneablegnal.avajgnal..LANGgnal.avajgnal.interface java.io.Serializabl");
    }

    @Test
    public void test37920() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest75.test37920");
        int int3 = org.apache.commons.lang3.StringUtils.ordinalIndexOf("iterfce Coebe$iterfce ioSeriizbe", "ja", 27);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test37921() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest75.test37921");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("444444444444INTERFACEJAVA.LANG.cLONEABLEsTRINGINTERFACEJAVA.IO.sERIALIZABLE444444444444444444444444444444444444444444444444444444444444444444444444444444444litu");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray1, '.');
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "444444444444INTERFACEJAVA.LANG.cLONEABLEsTRINGINTERFACEJAVA.IO.sERIALIZABLE444444444444444444444444444444444444444444444444444444444444444444444444444444444litu" + "'", str3, "444444444444INTERFACEJAVA.LANG.cLONEABLEsTRINGINTERFACEJAVA.IO.sERIALIZABLE444444444444444444444444444444444444444444444444444444444444444444444444444444444litu");
    }

    @Test
    public void test37922() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest75.test37922");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.rightPad("444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444litu                                             ...                                                    AvAAlitu                                             ...                                                    AvAA", 264, '$');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444litu                                             ...                                                    AvAAlitu                                             ...                                                    AvAA" + "'", str3, "444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444litu                                             ...                                                    AvAAlitu                                             ...                                                    AvAA");
    }

    @Test
    public void test37923() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest75.test37923");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitByCharacterTypeCamelCase("AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA                                            #AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA");
        java.lang.String str3 = org.apache.commons.lang3.ClassUtils.getShortClassName((java.lang.Object) strArray1, "gn                                            ");
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "String[]" + "'", str3, "String[]");
    }

    @Test
    public void test37924() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest75.test37924");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceChars("                                                                                                                                            aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", 'a', '#');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "                                                                                                                                            #############################################" + "'", str3, "                                                                                                                                            #############################################");
    }

    @Test
    public void test37925() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest75.test37925");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isEmpty((java.lang.CharSequence) "                                                                                                                                                                                                  interface java.lang.CloneableString[]Strijavaulang[]String[]interface java.io.Serializable                                                                                                                                                                                                   ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test37926() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest75.test37926");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("ARRAYLISTARRAYLISTARRAYLISTAVAJ.GNAL");
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test37927() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest75.test37927");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.containsWhitespace("                 ...a..AYL A.444444444444444444");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test37928() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest75.test37928");
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("J#v#.l#ngj#v#.l#ngj#v#.l#ngj#v#.l#ngj#v#.l#ngj#v#.l#ngj#v#.l#ngj#v#.l#ngj#v#.l#ngj#v#.l#ngj#v#.l#ngj#v#.l#ngj#v#.l#ngj#v#.l#ngj#v#.l#ngj#v#.l#ngj#v#.l#ngj#v#.l#ngj#v#.l#ngj#v#.l#ngj#v#.l#ngj#v#.l#ngj#v#.l#ngj#v#.l#ngj#v#.l#ngj#v#.l#ngj#v#.l#ngj#v#.l#ngj#v#.l#ngj#v#.l#ngj#v#.l#ngj#v#.l#ngj#v#.l#ng", "Aaaaaaaaaaaa                                  ");
        java.lang.String[] strArray6 = org.apache.commons.lang3.StringUtils.split("BYTE");
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.replaceEachRepeatedly("IrfCo$irfioSrii", strArray4, strArray6);
        boolean boolean8 = org.apache.commons.lang3.StringUtils.startsWithAny("LANGaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa                                                                                                                                                                                                                                                                                                                                                                                                           ", strArray6);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "IrfCo$irfioSrii" + "'", str7, "IrfCo$irfioSrii");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test37929() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest75.test37929");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.upperCase("GNALaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaagn                                            ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "GNALAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAGN                                            " + "'", str1, "GNALAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAGN                                            ");
    }

    @Test
    public void test37930() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest75.test37930");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.difference("JAVA.UTILJAVA.UTILSTRINGCJAVA.UTILJAVA.UTILSTRINGCJAVA.UTILJAVA.UTILSTRINGCJAVA.UTILJAVA.UTILSTRINGCJAVA.UTILJAVA.UTILSTRINGCJAVA.UTILJAVA.UTILSTRINGCJAVA.UTILJAVA.UTILSTRINGCJAVA.UTILJAVA.UTILSTRINGCJAVA.UTILJAVA.UTILSTRINGCJAVA.UTILJAVA.UTILSTRINGCJAVA.UTILJAVA.UTILSTRINGCJAVA.UTILJAVA.UTILSTRINGCJAVA.UTILJAVA.UTILSTRINGCJAVA.UTILJAVA.UTILSTRINGCJAVA.UTILJAVA.UTILSTRINGCJAVA.UTILJAVA.UTILSTRINGCJAVA.UTILJAVA.UTILSTRINGCJAVA.UTILJAVA.UTILSTRINGCJAVA.UTILJAVA.UTILSTRINGCJAVA.UTILJAVA.UTILSTRINGCJAVA.UTILJAVA.UTILSTRINGCJAVA.UTILJAVA.UTILSTRINGCJAVA.UTILJAVA.UTIL", "$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$" + "'", str2, "$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$");
    }

    @Test
    public void test37931() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest75.test37931");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNotBlank((java.lang.CharSequence) "AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test37932() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest75.test37932");
        int int2 = org.apache.commons.lang3.StringUtils.countMatches("AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA$AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA$AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA$AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA$AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA$AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA$AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA$AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA$AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA$AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA", "                                                                                                                                                                                                                                                                                                                               44444444444444444444444444444444444444444444444]TU44444444444444444444444444444444444444444444444                                                                                                                                                                                                                                                                                                                               ");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test37933() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest75.test37933");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitByCharacterTypeCamelCase("...sAitUJAirtSsAijavaulainterface java.lang.Cloneable4interface java.io.Serializable");
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test37934() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest75.test37934");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.capitalize((java.lang.CharSequence) "4444444444444Ch.r.cter4444444444444utilStr");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "4444444444444Ch.r.cter4444444444444utilStr" + "'", str1, "4444444444444Ch.r.cter4444444444444utilStr");
    }

    @Test
    public void test37935() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest75.test37935");
        int int3 = org.apache.commons.lang3.StringUtils.ordinalIndexOf("hi!ArrayListArrayListArrayListavaj.gnalArrayListArrayListArrayListavaj.gnalArrayListArrayListArrayLi", "NTERFACE JAVA.LANG.cLONEABLE.......JAVA..........JAVA..........JAVA..........JAVA..........JA...", 764);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test37936() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest75.test37936");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.uncapitalize((java.lang.CharSequence) "                                                                    nAAAAAAAAAAjavalagnAAAAAAAAAA                                                                    ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "                                                                    nAAAAAAAAAAjavalagnAAAAAAAAAA                                                                    " + "'", str1, "                                                                    nAAAAAAAAAAjavalagnAAAAAAAAAA                                                                    ");
    }

    @Test
    public void test37937() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest75.test37937");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringAfter("ssalcrrA tsiLytcejbO.gnal.avaj", "UUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUtttSUlUttttttttttSUlUtt");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test37938() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest75.test37938");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa...langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava..", "hi!Arr...", 200);
        int int4 = org.apache.commons.lang3.StringUtils.indexOfDifference((java.lang.CharSequence[]) strArray3);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
    }

    @Test
    public void test37939() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest75.test37939");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfIgnoreCase("GNAL.AVAJGNAL..langGNAL.AVAJGNAL.                                                           ", "llllllllllllllllllllllllllllllllllllllllllllllllllllllllllllllllllllllllllllllllllllllllllyaaa.");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test37940() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest75.test37940");
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.overlay("$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$", "RFACE JAVA.LANG.CLONEA#                                   J.GNALJAVA.LANGAVAJ.GN", 305, 723);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$RFACE JAVA.LANG.CLONEA#                                   J.GNALJAVA.LANGAVAJ.GN" + "'", str4, "$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$RFACE JAVA.LANG.CLONEA#                                   J.GNALJAVA.LANGAVAJ.GN");
    }

    @Test
    public void test37941() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest75.test37941");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.center("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", 162, "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa#############################################################...");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa" + "'", str3, "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
    }

    @Test
    public void test37942() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest75.test37942");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("AAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAA...", "                                                                                                                                                                                                                                                                                                                                                                                                                                JAVA.LANGAGNAL.AVAJGNAL..LANGGNAL.AVARRCLASS JAVA.LANG.OBJECTYLISTARRCLASS JAVA.LANG.OBJECTYLISTA                                                                                                                                                                                                                                                                                                                                                                                                                                ", 32);
        java.lang.String str5 = org.apache.commons.lang3.ClassUtils.getPackageName((java.lang.Object) strArray3, "AVA");
        java.lang.String str6 = org.apache.commons.lang3.StringUtils.concat((java.lang.Object[]) strArray3);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "java.lang" + "'", str5, "java.lang");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "javalagnjavalagnAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAA..." + "'", str6, "javalagnjavalagnAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAA...");
    }

    @Test
    public void test37943() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest75.test37943");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.containsWhitespace("44444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444.alya..a                                  $$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$                                  $$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$                                  $$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$                                  $$$$$$$$$$$$$$$$$$$$$$$");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test37944() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest75.test37944");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByCharacterType("java.lang");
        boolean boolean3 = org.apache.commons.lang3.StringUtils.endsWithAny("JLVLlaLNG", strArray2);
        java.lang.String str5 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray2, "J");
        java.lang.String[] strArray7 = org.apache.commons.lang3.StringUtils.stripAll(strArray2, "");
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "javaJ.Jlang" + "'", str5, "javaJ.Jlang");
        org.junit.Assert.assertNotNull(strArray7);
    }

    @Test
    public void test37945() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest75.test37945");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("AtsiLytcejbO.gnal.avaj ssalcrrAtsiLytcejbO.gnal.avaj ssalcrrAva.langGNAL..langjava.langAGNAL.AVAJ", "JAVA.LANG.CLONEABLE...                                 INTERFACE JAVA.IO.SERIALIZABLE", 502);
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void test37946() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest75.test37946");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.rightPad("jAVA.L$ArrayList", 840, ' ');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "jAVA.L$ArrayList                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                        " + "'", str3, "jAVA.L$ArrayList                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                        ");
    }

    @Test
    public void test37947() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest75.test37947");
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.overlay("4444444444444Ch.r.cter4444444444444utilStr", "$$$$$$$$$$$$$JAVA.IO.SERIALIZABLE INTERFACE JAVA.LANG.CLONEABLE... INTERFACE$$$$$$$$$$$$$", 524, 19);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "4444444444444Ch.r.c$$$$$$$$$$$$$JAVA.IO.SERIALIZABLE INTERFACE JAVA.LANG.CLONEABLE... INTERFACE$$$$$$$$$$$$$" + "'", str4, "4444444444444Ch.r.c$$$$$$$$$$$$$JAVA.IO.SERIALIZABLE INTERFACE JAVA.LANG.CLONEABLE... INTERFACE$$$$$$$$$$$$$");
    }

    @Test
    public void test37948() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest75.test37948");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringAfterLast("$                                                                                                                                                                                                                                                                                                                          ", "                                                                                                                                                                                                                                                                                                                                                                                                                                                            ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test37949() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest75.test37949");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java", "$######################################################################");
        int int4 = org.apache.commons.lang3.StringUtils.indexOfDifference((java.lang.CharSequence[]) strArray3);
        int int5 = org.apache.commons.lang3.StringUtils.lastIndexOfAny("interface java.lang.Cloneable-1A.A.Auti.StriAj-1A.A.Auti.StriAjinterface java.io.Serializable", strArray3);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
    }

    @Test
    public void test37950() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest75.test37950");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlpha((java.lang.CharSequence) "AAAAAAAAAAAAAAAAAAA      ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test37951() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest75.test37951");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.containsWhitespace("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaastrinaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test37952() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest75.test37952");
        int int1 = org.apache.commons.lang3.StringUtils.length((java.lang.CharSequence) "VAJGNALUAVAJGNALUAVAJGNALUAVAJGNALUAVAJGNALUAVAJGNALUAVAJGNALUAVAJGNALUAVAJSSALCGNALAVAJSSALC");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 93 + "'", int1 == 93);
    }

    @Test
    public void test37953() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest75.test37953");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.substringBetween("#####################", "...       .", "                        L.ArryList");
        org.junit.Assert.assertNull(str3);
    }

    @Test
    public void test37954() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest75.test37954");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBeforeLast("etyBetyBetyBetyBetyBetyBAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA...etyBetyBetyBetyBetyBetyBe                                                                             ", "VA.LANGAVAJ.GNALJAVA.LANGAVAJ.GNALJAVA.LANGAVAJ.GNALJAVA.LANGAVAJ.GNALJAVA.LANGAVAJ.GNALJAVA");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "etyBetyBetyBetyBetyBetyBAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA...etyBetyBetyBetyBetyBetyBe                                                                             " + "'", str2, "etyBetyBetyBetyBetyBetyBAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA...etyBetyBetyBetyBetyBetyBe                                                                             ");
    }

    @Test
    public void test37955() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest75.test37955");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.capitalize((java.lang.CharSequence) "gnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalLANGLANGLANGLANGLANGLANGLlituava                  ...                         $$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "GnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalLANGLANGLANGLANGLANGLANGLlituava                  ...                         $$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$" + "'", str1, "GnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalLANGLANGLANGLANGLANGLANGLlituava                  ...                         $$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$");
    }

    @Test
    public void test37956() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest75.test37956");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.containsWhitespace("stringUtilsStringUtilsStringUtilsStringUtilsStringUtilsStringUtilsStringUtilsStringUtilsStringUtilsStringUtil");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test37957() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest75.test37957");
        int int2 = org.apache.commons.lang3.StringUtils.getLevenshteinDistance((java.lang.CharSequence) "LC.GNAL.AVAJ ECAFRETNIELBAZILAIRES.OI.AVAJ ECAFRETNI$ELBAENOLC.GNAL.AVAJ ECAFRETNIELBAZILAIRES.OI.AVAJ ECAFRETNI$ELBAENOLC.GNAL.AVAJ ECAFRETNI$GNAL.AVAJ", (java.lang.CharSequence) "$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$...       aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 938 + "'", int2 == 938);
    }

    @Test
    public void test37958() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest75.test37958");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass2 = org.apache.commons.lang3.ClassUtils.getClass("JAVA.IO.SERIALIZABLE INTERFACE JAVA.LANG.CLONEABLE... INTERFAC", true);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassNotFoundException; message: JAVA/IO/SERIALIZABLEINTERFACEJAVA/LANG/CLONEABLE///INTERFAC");
        } catch (java.lang.ClassNotFoundException e) {
            // Expected exception.
        }
    }

    @Test
    public void test37959() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest75.test37959");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeStart("GNALgn                                            ", "JAVATSILYARRATSILYARRATSILYARRA4444");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "GNALgn                                            " + "'", str2, "GNALgn                                            ");
    }

    @Test
    public void test37960() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest75.test37960");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOfIgnoreCase("...........................................................................................................................................................................................................................................................................TRINGCLA", "###########################VA.LANGAVAJ.GNALJAVA.LANGAVAJ.GNALJAVA.LANGAVAJ.GNALJAVA.LANGAVAJ.GNALJAVA.LANGAVAJ.GNALJAVA.LANG###########################");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test37961() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest75.test37961");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass1 = org.apache.commons.lang3.ClassUtils.getClass("JLVLlaLNG                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                  ");
            org.junit.Assert.fail("Expected exception of type java.lang.ClassNotFoundException; message: JLVLlaLNG");
        } catch (java.lang.ClassNotFoundException e) {
            // Expected exception.
        }
    }

    @Test
    public void test37962() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest75.test37962");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.center("interface java.util.Listinterfacejava.lang.Cloneable#interfacejava.iointerfacejava.lang.Cloneable#interfacejava.ioinTU                    interface java.util.Collectioninterfacejava.lang.Cloneable#interfacejava.iointerfacejava.lang.Cloneable#interfacejava.ioinTU                    interface java.lang.Iterableinterfacejava.lang.Cloneable#interfacejava.iointerfacejava.lang.Cloneable#interfacejava.ioinTU                    interface java.util.RandomAccessinterfacejava.lang.Cloneable#interfacejava.iointerfacejava.lang.Cloneable#interfacejava.ioinTU                    interface java.lang.Cloneableinterfacejava.lang.Cloneable#interfacejava.iointerfacejava.lang.Cloneable#interfacejava.ioinTU                    interface java.io.Serializable", 145);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "interface java.util.Listinterfacejava.lang.Cloneable#interfacejava.iointerfacejava.lang.Cloneable#interfacejava.ioinTU                    interface java.util.Collectioninterfacejava.lang.Cloneable#interfacejava.iointerfacejava.lang.Cloneable#interfacejava.ioinTU                    interface java.lang.Iterableinterfacejava.lang.Cloneable#interfacejava.iointerfacejava.lang.Cloneable#interfacejava.ioinTU                    interface java.util.RandomAccessinterfacejava.lang.Cloneable#interfacejava.iointerfacejava.lang.Cloneable#interfacejava.ioinTU                    interface java.lang.Cloneableinterfacejava.lang.Cloneable#interfacejava.iointerfacejava.lang.Cloneable#interfacejava.ioinTU                    interface java.io.Serializable" + "'", str2, "interface java.util.Listinterfacejava.lang.Cloneable#interfacejava.iointerfacejava.lang.Cloneable#interfacejava.ioinTU                    interface java.util.Collectioninterfacejava.lang.Cloneable#interfacejava.iointerfacejava.lang.Cloneable#interfacejava.ioinTU                    interface java.lang.Iterableinterfacejava.lang.Cloneable#interfacejava.iointerfacejava.lang.Cloneable#interfacejava.ioinTU                    interface java.util.RandomAccessinterfacejava.lang.Cloneable#interfacejava.iointerfacejava.lang.Cloneable#interfacejava.ioinTU                    interface java.lang.Cloneableinterfacejava.lang.Cloneable#interfacejava.iointerfacejava.lang.Cloneable#interfacejava.ioinTU                    interface java.io.Serializable");
    }

    @Test
    public void test37963() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest75.test37963");
        java.util.Locale locale1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.apache.commons.lang3.StringUtils.upperCase("AVAJ.GNALAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAirfCo$irfioSrA..ayL A.444444444444444444444444444", locale1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test37964() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest75.test37964");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNumericSpace((java.lang.CharSequence) "ELBAZILAIREs.OI.AVAJ ECAFRETNIAVAJ..........AVAJ..........AVAJ..........AVAJ..........AVAJ..........AVAJ..........AVAJ..........AVAJ..........AVAJ..........AVAJ..........AVAJ..........AVAJ..........AVAJ..........AVAJ..........AVAJ..........AVAJ..........AVAJ..........AVAJ..........AVAJ..........AVAJ..........AVAJ..........AVAJ..........AVAJ..........AVAJ..........AVAJ..........AVAJ..........AVAJ..........AVAJ..........AVAJ..........AVAJ..........AVAJ..........AVAJ..........AVAJ..........AVAJ..........AVAJ.......ELBAENOLc.GNAL.AVAJ ECAFRETNI");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test37965() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest75.test37965");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trimToNull("                                                                                                                                                                                                                 interfSerializablece jSerializablevSerializable.lSerializableng.cloneSerializableble                                                                                                                                                                                                                 ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "interfSerializablece jSerializablevSerializable.lSerializableng.cloneSerializableble" + "'", str1, "interfSerializablece jSerializablevSerializable.lSerializableng.cloneSerializableble");
    }

    @Test
    public void test37966() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest75.test37966");
        java.lang.CharSequence charSequence2 = null;
        char[] charArray13 = new char[] { ' ', ' ', '#', 'a', '4', 'a' };
        int int14 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "", charArray13);
        boolean boolean15 = org.apache.commons.lang3.StringUtils.containsAny("$", charArray13);
        boolean boolean16 = org.apache.commons.lang3.StringUtils.containsAny("", charArray13);
        boolean boolean17 = org.apache.commons.lang3.StringUtils.containsAny("GNAL.AVAJ", charArray13);
        int int18 = org.apache.commons.lang3.StringUtils.indexOfAnyBut(charSequence2, charArray13);
        int int19 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "a  IYlZIIRsOIFRI OcFRI", charArray13);
        int int20 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "              java.io.Serializable interface java.lang.Cloneable... interface              ", charArray13);
        org.junit.Assert.assertNotNull(charArray13);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray13), "  #a4a");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray13), "  #a4a");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray13), "[ ,  , #, a, 4, a]");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 3 + "'", int19 == 3);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 14 + "'", int20 == 14);
    }

    @Test
    public void test37967() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest75.test37967");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replace("java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java........", "stringUtilsStringUtilsStringUtilsStringUtilsStringUtilsStringUtilsStringUtilsStringUtilsStringUtilsStringUtil", "                         ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java........" + "'", str3, "java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java........");
    }

    @Test
    public void test37968() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest75.test37968");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeStartIgnoreCase("AVAJGNALjavajavajavajavajavajavajavgnal                                                                ", " LS  yL  ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "AVAJGNALjavajavajavajavajavajavajavgnal                                                                " + "'", str2, "AVAJGNALjavajavajavajavajavajavajavgnal                                                                ");
    }

    @Test
    public void test37969() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest75.test37969");
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.split("", "A..ayL A.");
        java.lang.String[] strArray8 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("hi!", "");
        java.lang.String[] strArray10 = org.apache.commons.lang3.StringUtils.stripAll(strArray8, "$");
        int int11 = org.apache.commons.lang3.StringUtils.indexOfAny("", strArray10);
        java.lang.String str13 = org.apache.commons.lang3.ClassUtils.getShortCanonicalName((java.lang.Object) strArray10, "$         ");
        java.lang.String str14 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray10);
        java.lang.String str15 = org.apache.commons.lang3.StringUtils.replaceEach("class javalangclass                       javaulang                       javaulang                       javaulang                       javaulang                       javaulang                       javaulang                       javaulang                       javaulang                       javaulang                       javaulang                       javaulang                       javaulang                       javaulang                       javaulang                       javaulang                       javaulang                       javaulang                       javaulang                       javaulang                       javaulang", strArray4, strArray10);
        boolean boolean16 = org.apache.commons.lang3.StringUtils.startsWithAny("44444444444444444.444444444444444444...                                 44444444444444444.444444444444444444...                                 44444$        ", strArray4);
        java.lang.String str18 = org.apache.commons.lang3.ClassUtils.getShortCanonicalName((java.lang.Object) "44444444444444444.444444444444444444...                                 44444444444444444.444444444444444444...                                 44444$        ", "IRFCO.IRFIOSRIIZ");
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertNotNull(strArray10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "String[]" + "'", str13, "String[]");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "class javalangclass                       javaulang                       javaulang                       javaulang                       javaulang                       javaulang                       javaulang                       javaulang                       javaulang                       javaulang                       javaulang                       javaulang                       javaulang                       javaulang                       javaulang                       javaulang                       javaulang                       javaulang                       javaulang                       javaulang                       javaulang" + "'", str15, "class javalangclass                       javaulang                       javaulang                       javaulang                       javaulang                       javaulang                       javaulang                       javaulang                       javaulang                       javaulang                       javaulang                       javaulang                       javaulang                       javaulang                       javaulang                       javaulang                       javaulang                       javaulang                       javaulang                       javaulang                       javaulang");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "String" + "'", str18, "String");
    }

    @Test
    public void test37970() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest75.test37970");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.remove("JAV", "llllllllllllllllllllllllllllllllllllllllllllllllllllllllllllllllllllllllllllllllllllllllllyaaa.");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "JAV" + "'", str2, "JAV");
    }

    @Test
    public void test37971() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest75.test37971");
        java.util.Locale locale1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.apache.commons.lang3.StringUtils.upperCase("$       $       $       $       $       $       $       $       $       $    rA    $       $       $       $       $       $       $       $       $       ", locale1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test37972() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest75.test37972");
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.split("java.io.Serializableinterfacejava.lang.Cloneable..", "Integer", 39);
        java.lang.String[] strArray6 = org.apache.commons.lang3.StringUtils.stripAll(strArray4, "...       444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444");
        int int7 = org.apache.commons.lang3.StringUtils.indexOfAny("agnAAAAAAAAAA", strArray4);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
    }

    @Test
    public void test37973() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest75.test37973");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripAccents((java.lang.CharSequence) "######################################################...");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "######################################################..." + "'", str1, "######################################################...");
    }

    @Test
    public void test37974() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest75.test37974");
        java.lang.ClassLoader classLoader0 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass3 = org.apache.commons.lang3.ClassUtils.getClass(classLoader0, "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                               aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaava.langjava.langjava.lang... .... .java.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.lang... .... ", false);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassNotFoundException; message: aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaava/langjava/langjava/lang////////java/langjava/langjava/langjava/langjava/langjava/langjava/langjava/langjava/langjava/lang///////");
        } catch (java.lang.ClassNotFoundException e) {
            // Expected exception.
        }
    }

    @Test
    public void test37975() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest75.test37975");
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
        java.lang.Class<?>[] wildcardClassArray19 = org.apache.commons.lang3.ClassUtils.primitivesToWrappers(wildcardClassArray16);
        java.lang.Class<?>[] wildcardClassArray20 = org.apache.commons.lang3.ClassUtils.primitivesToWrappers(wildcardClassArray19);
        java.lang.String[] strArray23 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("hi!", "");
        java.lang.String[] strArray25 = org.apache.commons.lang3.StringUtils.stripAll(strArray23, "$");
        java.lang.Class<?>[] wildcardClassArray26 = org.apache.commons.lang3.ClassUtils.toClass((java.lang.Object[]) strArray23);
        java.lang.Class<?>[] wildcardClassArray27 = org.apache.commons.lang3.ClassUtils.toClass((java.lang.Object[]) wildcardClassArray26);
        java.lang.Class<?>[] wildcardClassArray28 = org.apache.commons.lang3.ClassUtils.wrappersToPrimitives(wildcardClassArray27);
        java.lang.String str29 = org.apache.commons.lang3.StringUtils.concat((java.lang.Object[]) wildcardClassArray28);
        java.lang.String[] strArray32 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("hi!", "");
        java.lang.String[] strArray34 = org.apache.commons.lang3.StringUtils.stripAll(strArray32, "$");
        java.lang.Class<?>[] wildcardClassArray35 = org.apache.commons.lang3.ClassUtils.toClass((java.lang.Object[]) strArray32);
        java.lang.Class<?> wildcardClass36 = null;
        java.lang.Class[] classArray38 = new java.lang.Class[1];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray39 = (java.lang.Class<?>[]) classArray38;
        wildcardClassArray39[0] = wildcardClass36;
        java.lang.Class<?>[] wildcardClassArray42 = org.apache.commons.lang3.ClassUtils.primitivesToWrappers(wildcardClassArray39);
        java.lang.String[] strArray44 = new java.lang.String[] { "                                   " };
        java.lang.String str45 = org.apache.commons.lang3.StringUtils.getCommonPrefix(strArray44);
        java.lang.Class<?>[] wildcardClassArray46 = org.apache.commons.lang3.ClassUtils.toClass((java.lang.Object[]) strArray44);
        java.lang.Class<?> wildcardClass47 = null;
        java.lang.Class[] classArray49 = new java.lang.Class[1];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray50 = (java.lang.Class<?>[]) classArray49;
        wildcardClassArray50[0] = wildcardClass47;
        java.lang.Class<?>[] wildcardClassArray53 = org.apache.commons.lang3.ClassUtils.primitivesToWrappers(wildcardClassArray50);
        boolean boolean54 = org.apache.commons.lang3.ClassUtils.isAssignable(wildcardClassArray46, wildcardClassArray50);
        boolean boolean56 = org.apache.commons.lang3.ClassUtils.isAssignable(wildcardClassArray39, wildcardClassArray50, true);
        boolean boolean58 = org.apache.commons.lang3.ClassUtils.isAssignable(wildcardClassArray35, wildcardClassArray50, false);
        java.lang.Class<?>[] wildcardClassArray59 = org.apache.commons.lang3.ClassUtils.primitivesToWrappers(wildcardClassArray35);
        java.lang.Class<?>[] wildcardClassArray60 = org.apache.commons.lang3.ClassUtils.wrappersToPrimitives(wildcardClassArray59);
        boolean boolean61 = org.apache.commons.lang3.ClassUtils.isAssignable(wildcardClassArray28, wildcardClassArray60);
        java.lang.Class<?>[] wildcardClassArray62 = org.apache.commons.lang3.ClassUtils.toClass((java.lang.Object[]) wildcardClassArray28);
        boolean boolean64 = org.apache.commons.lang3.ClassUtils.isAssignable(wildcardClassArray19, wildcardClassArray28, false);
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
        org.junit.Assert.assertNotNull(wildcardClassArray19);
        org.junit.Assert.assertNotNull(wildcardClassArray20);
        org.junit.Assert.assertNotNull(strArray23);
        org.junit.Assert.assertNotNull(strArray25);
        org.junit.Assert.assertNotNull(wildcardClassArray26);
        org.junit.Assert.assertNotNull(wildcardClassArray27);
        org.junit.Assert.assertNotNull(wildcardClassArray28);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "" + "'", str29, "");
        org.junit.Assert.assertNotNull(strArray32);
        org.junit.Assert.assertNotNull(strArray34);
        org.junit.Assert.assertNotNull(wildcardClassArray35);
        org.junit.Assert.assertNotNull(classArray38);
        org.junit.Assert.assertNotNull(wildcardClassArray39);
        org.junit.Assert.assertNotNull(wildcardClassArray42);
        org.junit.Assert.assertNotNull(strArray44);
        org.junit.Assert.assertEquals("'" + str45 + "' != '" + "                                   " + "'", str45, "                                   ");
        org.junit.Assert.assertNotNull(wildcardClassArray46);
        org.junit.Assert.assertNotNull(classArray49);
        org.junit.Assert.assertNotNull(wildcardClassArray50);
        org.junit.Assert.assertNotNull(wildcardClassArray53);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + false + "'", boolean58 == false);
        org.junit.Assert.assertNotNull(wildcardClassArray59);
        org.junit.Assert.assertNotNull(wildcardClassArray60);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + false + "'", boolean61 == false);
        org.junit.Assert.assertNotNull(wildcardClassArray62);
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + false + "'", boolean64 == false);
    }

    @Test
    public void test37976() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest75.test37976");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.center("Stringc", 675, '#');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "##############################################################################################################################################################################################################################################################################################################################################Stringc##############################################################################################################################################################################################################################################################################################################################################" + "'", str3, "##############################################################################################################################################################################################################################################################################################################################################Stringc##############################################################################################################################################################################################################################################################################################################################################");
    }

    @Test
    public void test37977() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest75.test37977");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOf("        jvl#.#gn       ", 969, (int) '$');
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test37978() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest75.test37978");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAsciiPrintable((java.lang.CharSequence) "][gnirtSlitu");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test37979() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest75.test37979");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNumericSpace((java.lang.CharSequence) "javau");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test37980() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest75.test37980");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.deleteWhitespace("AGNaaaaaaaaaaJAARRAYLISTARRAYLISTARRAYLISTAVAJ                                                        ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "AGNaaaaaaaaaaJAARRAYLISTARRAYLISTARRAYLISTAVAJ" + "'", str1, "AGNaaaaaaaaaaJAARRAYLISTARRAYLISTARRAYLISTAVAJ");
    }

    @Test
    public void test37981() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest75.test37981");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitByCharacterType("... AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA... AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA... AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA... AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA... AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA... AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA... AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA... AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA... AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA... AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA");
        java.lang.Class<?>[] wildcardClassArray2 = org.apache.commons.lang3.ClassUtils.toClass((java.lang.Object[]) strArray1);
        java.lang.Class<?>[] wildcardClassArray3 = org.apache.commons.lang3.ClassUtils.primitivesToWrappers(wildcardClassArray2);
        java.lang.Class<?>[] wildcardClassArray4 = org.apache.commons.lang3.ClassUtils.wrappersToPrimitives(wildcardClassArray3);
        java.lang.Class<?>[] wildcardClassArray5 = org.apache.commons.lang3.ClassUtils.toClass((java.lang.Object[]) wildcardClassArray3);
        java.lang.Class<?>[] wildcardClassArray6 = org.apache.commons.lang3.ClassUtils.primitivesToWrappers(wildcardClassArray5);
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertNotNull(wildcardClassArray2);
        org.junit.Assert.assertNotNull(wildcardClassArray3);
        org.junit.Assert.assertNotNull(wildcardClassArray4);
        org.junit.Assert.assertNotNull(wildcardClassArray5);
        org.junit.Assert.assertNotNull(wildcardClassArray6);
    }

    @Test
    public void test37982() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest75.test37982");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.center("S                           ", 331);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                                                                                                                                       S                                                                                                                                                                                   " + "'", str2, "                                                                                                                                                       S                                                                                                                                                                                   ");
    }

    @Test
    public void test37983() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest75.test37983");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("tsilyrrgnluvj                       tsilyrrgnluvj", "                                                                                                                                                                                                                                   gnal.avajgnal..LANGgnal                                                                                                                                                                                                                                   ");
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test37984() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest75.test37984");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripToEmpty("$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$rrayList");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$rrayList" + "'", str1, "$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$rrayList");
    }

    @Test
    public void test37985() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest75.test37985");
        java.lang.String[] strArray1 = new java.lang.String[] { "                                   " };
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.getCommonPrefix(strArray1);
        java.lang.Class<?>[] wildcardClassArray3 = org.apache.commons.lang3.ClassUtils.toClass((java.lang.Object[]) strArray1);
        java.lang.Class<?>[] wildcardClassArray4 = org.apache.commons.lang3.ClassUtils.primitivesToWrappers(wildcardClassArray3);
        java.lang.Class<?>[] wildcardClassArray5 = org.apache.commons.lang3.ClassUtils.primitivesToWrappers(wildcardClassArray4);
        java.lang.Class<?>[] wildcardClassArray6 = org.apache.commons.lang3.ClassUtils.wrappersToPrimitives(wildcardClassArray5);
        java.lang.String[] strArray9 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("hi!", "");
        java.lang.String[] strArray11 = org.apache.commons.lang3.StringUtils.stripAll(strArray9, "$");
        java.lang.Class<?>[] wildcardClassArray12 = org.apache.commons.lang3.ClassUtils.toClass((java.lang.Object[]) strArray9);
        java.lang.String[] strArray15 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("hi!", "");
        java.lang.String[] strArray17 = org.apache.commons.lang3.StringUtils.stripAll(strArray15, "$");
        java.lang.Class<?>[] wildcardClassArray18 = org.apache.commons.lang3.ClassUtils.toClass((java.lang.Object[]) strArray15);
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
        boolean boolean41 = org.apache.commons.lang3.ClassUtils.isAssignable(wildcardClassArray18, wildcardClassArray33, false);
        java.lang.Class<?>[] wildcardClassArray42 = org.apache.commons.lang3.ClassUtils.primitivesToWrappers(wildcardClassArray18);
        boolean boolean43 = org.apache.commons.lang3.ClassUtils.isAssignable(wildcardClassArray12, wildcardClassArray42);
        java.lang.Class<?>[] wildcardClassArray44 = org.apache.commons.lang3.ClassUtils.wrappersToPrimitives(wildcardClassArray42);
        java.lang.String str48 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) wildcardClassArray42, ' ', (int) (short) 0, 0);
        java.lang.Class<?>[] wildcardClassArray49 = org.apache.commons.lang3.ClassUtils.toClass((java.lang.Object[]) wildcardClassArray42);
        java.lang.Class<?>[] wildcardClassArray50 = org.apache.commons.lang3.ClassUtils.primitivesToWrappers(wildcardClassArray49);
        java.lang.Class<?>[] wildcardClassArray51 = org.apache.commons.lang3.ClassUtils.primitivesToWrappers(wildcardClassArray49);
        java.lang.Class<?>[] wildcardClassArray52 = null;
        java.lang.String[] strArray55 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("hi!", "");
        java.lang.String[] strArray57 = org.apache.commons.lang3.StringUtils.stripAll(strArray55, "$");
        java.lang.Class<?>[] wildcardClassArray58 = org.apache.commons.lang3.ClassUtils.toClass((java.lang.Object[]) strArray55);
        java.lang.Class<?>[] wildcardClassArray59 = org.apache.commons.lang3.ClassUtils.toClass((java.lang.Object[]) wildcardClassArray58);
        java.lang.Class<?>[] wildcardClassArray60 = org.apache.commons.lang3.ClassUtils.wrappersToPrimitives(wildcardClassArray59);
        java.lang.Class<?> wildcardClass61 = null;
        java.lang.Class[] classArray63 = new java.lang.Class[1];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray64 = (java.lang.Class<?>[]) classArray63;
        wildcardClassArray64[0] = wildcardClass61;
        java.lang.Class<?>[] wildcardClassArray67 = org.apache.commons.lang3.ClassUtils.primitivesToWrappers(wildcardClassArray64);
        boolean boolean69 = org.apache.commons.lang3.ClassUtils.isAssignable(wildcardClassArray60, wildcardClassArray67, true);
        boolean boolean71 = org.apache.commons.lang3.ClassUtils.isAssignable(wildcardClassArray52, wildcardClassArray60, false);
        boolean boolean72 = org.apache.commons.lang3.ClassUtils.isAssignable(wildcardClassArray51, wildcardClassArray60);
        boolean boolean73 = org.apache.commons.lang3.ClassUtils.isAssignable(wildcardClassArray5, wildcardClassArray51);
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                   " + "'", str2, "                                   ");
        org.junit.Assert.assertNotNull(wildcardClassArray3);
        org.junit.Assert.assertNotNull(wildcardClassArray4);
        org.junit.Assert.assertNotNull(wildcardClassArray5);
        org.junit.Assert.assertNotNull(wildcardClassArray6);
        org.junit.Assert.assertNotNull(strArray9);
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertNotNull(wildcardClassArray12);
        org.junit.Assert.assertNotNull(strArray15);
        org.junit.Assert.assertNotNull(strArray17);
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
        org.junit.Assert.assertNotNull(wildcardClassArray42);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + true + "'", boolean43 == true);
        org.junit.Assert.assertNotNull(wildcardClassArray44);
        org.junit.Assert.assertEquals("'" + str48 + "' != '" + "" + "'", str48, "");
        org.junit.Assert.assertNotNull(wildcardClassArray49);
        org.junit.Assert.assertNotNull(wildcardClassArray50);
        org.junit.Assert.assertNotNull(wildcardClassArray51);
        org.junit.Assert.assertNotNull(strArray55);
        org.junit.Assert.assertNotNull(strArray57);
        org.junit.Assert.assertNotNull(wildcardClassArray58);
        org.junit.Assert.assertNotNull(wildcardClassArray59);
        org.junit.Assert.assertNotNull(wildcardClassArray60);
        org.junit.Assert.assertNotNull(classArray63);
        org.junit.Assert.assertNotNull(wildcardClassArray64);
        org.junit.Assert.assertNotNull(wildcardClassArray67);
        org.junit.Assert.assertTrue("'" + boolean69 + "' != '" + false + "'", boolean69 == false);
        org.junit.Assert.assertTrue("'" + boolean71 + "' != '" + false + "'", boolean71 == false);
        org.junit.Assert.assertTrue("'" + boolean72 + "' != '" + false + "'", boolean72 == false);
        org.junit.Assert.assertTrue("'" + boolean73 + "' != '" + false + "'", boolean73 == false);
    }

    @Test
    public void test37986() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest75.test37986");
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.substringsBetween("", ".ArrayListArrayListArrayListArrayLis", "                                                                                                                                                                                                                             va.langGNAL..la..                                                                                                                                                                                                                                                                                                                                                                                                                                                           va.langGNAL..la..                                                                                                                                                ");
        java.lang.String[] strArray8 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("g.g.g.g.g.g.g.g.g.g.g.g.g.g.g.g.g.g.g.g.g.g.g.g.g.g.g.g.g.g.g.g.g.g.g.g.g.g.g.", "liza.io.Seriavace jable4interfang.Clonea.lavaJ", 669);
        java.lang.String str9 = org.apache.commons.lang3.StringUtils.replaceEachRepeatedly("$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$aaaaaaa       INTEGER        aaaaaa", strArray4, strArray8);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$aaaaaaa       INTEGER        aaaaaa" + "'", str9, "$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$aaaaaaa       INTEGER        aaaaaa");
    }

    @Test
    public void test37987() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest75.test37987");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNumeric((java.lang.CharSequence) "INTERFACE JAVA.LANG.CLONEABLESTRINGINTERFACE JAVA.IO");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test37988() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest75.test37988");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.leftPad("GnirtS.gnal.avajssalcgnirtS.gnal.avajssalcgnirtS.gnal.avajssalcgnirtS.gnal.avajssalcgnirtS.gnal.avajssalcgnirtS.gnal.avajssalcgnirtS.gnal.avajssalcgnirtS.gnal.avajssalcgnirtS.gnal.avajssalcgnirtS.gnal.avajssalcgnirtS.gnal.avajssalcgnirtS.gnal.avajssalcgnirtS.gnal.avajssalcgnirtS.gnal.avajssalcgnirtS.gnal.avajssalcgnirtS.gnal.avaj........java.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.lang........java.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.lang........java.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.lang........java.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.lang........java.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.lang.......", 905, "interface java.lang.Cloneableaaaaaaaaaaainterface java.io.Serializable");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "interface java.lang.Cloneableaaaaaaaaaaainterface java.io.SerializableinterfaGnirtS.gnal.avajssalcgnirtS.gnal.avajssalcgnirtS.gnal.avajssalcgnirtS.gnal.avajssalcgnirtS.gnal.avajssalcgnirtS.gnal.avajssalcgnirtS.gnal.avajssalcgnirtS.gnal.avajssalcgnirtS.gnal.avajssalcgnirtS.gnal.avajssalcgnirtS.gnal.avajssalcgnirtS.gnal.avajssalcgnirtS.gnal.avajssalcgnirtS.gnal.avajssalcgnirtS.gnal.avajssalcgnirtS.gnal.avaj........java.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.lang........java.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.lang........java.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.lang........java.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.lang........java.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.lang......." + "'", str3, "interface java.lang.Cloneableaaaaaaaaaaainterface java.io.SerializableinterfaGnirtS.gnal.avajssalcgnirtS.gnal.avajssalcgnirtS.gnal.avajssalcgnirtS.gnal.avajssalcgnirtS.gnal.avajssalcgnirtS.gnal.avajssalcgnirtS.gnal.avajssalcgnirtS.gnal.avajssalcgnirtS.gnal.avajssalcgnirtS.gnal.avajssalcgnirtS.gnal.avajssalcgnirtS.gnal.avajssalcgnirtS.gnal.avajssalcgnirtS.gnal.avajssalcgnirtS.gnal.avajssalcgnirtS.gnal.avaj........java.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.lang........java.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.lang........java.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.lang........java.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.lang........java.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.lang.......");
    }

    @Test
    public void test37989() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest75.test37989");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAllUpperCase((java.lang.CharSequence) "AAAAAAAAAAAAAAAAAAA      $$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test37990() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest75.test37990");
        java.lang.CharSequence charSequence0 = null;
        char[] charArray15 = new char[] { ' ', ' ', '#', 'a', '4', 'a' };
        int int16 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "", charArray15);
        boolean boolean17 = org.apache.commons.lang3.StringUtils.containsAny("$", charArray15);
        boolean boolean18 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "...       AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA...       AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA...       AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA...       AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA...       AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA...       AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA...       AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA...       AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA...       AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA...       AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA", charArray15);
        boolean boolean19 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "java.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.lang", charArray15);
        int int20 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "...nAAAAAAAAAAjaval.agnAAAAAAAAAA...", charArray15);
        boolean boolean21 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "hi!ArrayLis", charArray15);
        int int22 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "nterface java.lang.CloneableAvaj.gnalinterface java.io.Serializable", charArray15);
        java.lang.String str24 = org.apache.commons.lang3.ClassUtils.getPackageCanonicalName((java.lang.Object) charArray15, "                                                                                                                                                                                                                                                                                                                                                                                                                                                                  jv..........jv..........jv4444444444...");
        boolean boolean25 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........jav", charArray15);
        boolean boolean26 = org.apache.commons.lang3.StringUtils.containsNone(charSequence0, charArray15);
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
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
    }

    @Test
    public void test37991() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest75.test37991");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripToNull("L.Arr yList                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                            ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "L.Arr yList" + "'", str1, "L.Arr yList");
    }

    @Test
    public void test37992() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest75.test37992");
        java.lang.String[] strArray5 = org.apache.commons.lang3.StringUtils.split("..", "$       ", 3);
        java.lang.String str9 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray5, "", (int) (byte) 10, (int) (short) -1);
        boolean boolean10 = org.apache.commons.lang3.StringUtils.endsWithAny("NTERFACEJAVA.LANG.cLONEABLE.......JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVAINTERFACEJAVA.IO.sERIALIZABLE", strArray5);
        int int11 = org.apache.commons.lang3.StringUtils.indexOfAny("                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                   #", strArray5);
        java.lang.String str12 = org.apache.commons.lang3.StringUtils.getCommonPrefix(strArray5);
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + ".." + "'", str12, "..");
    }

    @Test
    public void test37993() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest75.test37993");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.rightPad("                                                 String                                                   ", 380);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                                 String                                                                                                                                                                                                                                                                                                                                     " + "'", str2, "                                                 String                                                                                                                                                                                                                                                                                                                                     ");
    }

    @Test
    public void test37994() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest75.test37994");
        char[] charArray10 = new char[] { '$' };
        int int11 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "java.util", charArray10);
        boolean boolean12 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "                                   ", charArray10);
        boolean boolean13 = org.apache.commons.lang3.StringUtils.containsAny("...       ....       .", charArray10);
        int int14 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "hi!ArrayListArrayListArrayListavaj.gnalArrayListArrayListArrayListavaj", charArray10);
        boolean boolean15 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "....................................................................................................", charArray10);
        int int16 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "gnl$.$vj", charArray10);
        boolean boolean17 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "rrayListrrayListrrayListrrayListrrayListrrayListrrayListrrayListrrayListrr...    ...rrayListrrayListrrayListrrayListrrayListrrayListrrayListrrayListrrayListrra", charArray10);
        boolean boolean18 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "hinterface java.lang.Cloneable4interface java.io.Serializabl....1AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA...1AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA...1AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA...1AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA...1AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA...1AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA...1AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA...1AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA...1AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA...1AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA", charArray10);
        boolean boolean19 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) " LS  yL  ", charArray10);
        org.junit.Assert.assertNotNull(charArray10);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray10), "$");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray10), "$");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray10), "[$]");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
    }

    @Test
    public void test37995() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest75.test37995");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOf("BYAA", "-1.v.v.uS.rivaizvaa.", 918);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test37996() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest75.test37996");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("AAAAAAAAAA", "etyB", 576);
        int int4 = org.apache.commons.lang3.StringUtils.indexOfDifference((java.lang.CharSequence[]) strArray3);
        java.lang.String str6 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray3, "gnal.aL.ArrayListgnal.aL.ArrayList");
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.getCommonPrefix(strArray3);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "AAAAAAAAAA" + "'", str6, "AAAAAAAAAA");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "AAAAAAAAAA" + "'", str7, "AAAAAAAAAA");
    }

    @Test
    public void test37997() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest75.test37997");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("GNALUAVAJGNALUAVAJGNALUAVAJGNALUAVAJGNALUAVAJGNALUAVAJGNALUAVAJGNALUAVAJGNALUAVAJGNALUAVAJGNALUAVAJGNALUAVAJGNALUAVAJGNALUAVAJGNALUAVAJGNALUAVAJGNALUAVAJGNALUAVAJGNALUAVAJGNALUAVAJSSALCGNALAVAJSSALCit.it", 'a');
        java.lang.String[] strArray6 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("aaaaaaaaaaaa                                  ", "                       javaulangrraylist");
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.replaceEach("....................................................................................................................................................44444444444444444444444444444444444444444444444444444444444444444444444javaulang444444444444444444444444444444444444444444444444444444444444444444444444....................................................................................................................................................", strArray3, strArray6);
        java.lang.String str9 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray6, "#########################################################################     uti#########################################################################");
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "....................................................................................................................................................44444444444444444444444444444444444444444444444444444444444444444444444javaulang444444444444444444444444444444444444444444444444444444444444444444444444...................................................................................................................................................." + "'", str7, "....................................................................................................................................................44444444444444444444444444444444444444444444444444444444444444444444444javaulang444444444444444444444444444444444444444444444444444444444444444444444444....................................................................................................................................................");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "aaaaaaaaaaaa                                  " + "'", str9, "aaaaaaaaaaaa                                  ");
    }

    @Test
    public void test37998() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest75.test37998");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("...", 'a');
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.stripAll(strArray3);
        java.lang.String[] strArray7 = org.apache.commons.lang3.StringUtils.split("$", ' ');
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.getCommonPrefix(strArray7);
        int int9 = org.apache.commons.lang3.StringUtils.indexOfDifference((java.lang.CharSequence[]) strArray7);
        int int10 = org.apache.commons.lang3.StringUtils.indexOfDifference((java.lang.CharSequence[]) strArray7);
        java.lang.String str11 = org.apache.commons.lang3.StringUtils.concat((java.lang.Object[]) strArray7);
        java.lang.String str12 = org.apache.commons.lang3.StringUtils.replaceEach("INTERFACE JAVA.LANG.CLONEABLE.......JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVAINTERFACE JAVA.IO.SERIALIZABLE", strArray3, strArray7);
        java.lang.String str14 = org.apache.commons.lang3.ClassUtils.getShortCanonicalName((java.lang.Object) str12, "");
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "$" + "'", str8, "$");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "$" + "'", str11, "$");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "INTERFACE JAVA.LANG.CLONEABLE$$.JAVA$$$.JAVA$$$.JAVA$$$.JAVA$$$.JAVA$$$.JAVA$$$.JAVA$$$.JAVA$$$.JAVA$$$.JAVA$$$.JAVA$$$.JAVA$$$.JAVA$$$.JAVA$$$.JAVA$$$.JAVA$$$.JAVA$$$.JAVA$$$.JAVA$$$.JAVA$$$.JAVA$$$.JAVA$$$.JAVA$$$.JAVA$$$.JAVA$$$.JAVA$$$.JAVA$$$.JAVA$$$.JAVA$$$.JAVA$$$.JAVA$$$.JAVA$$$.JAVA$$$.JAVA$$$.JAVAINTERFACE JAVA.IO.SERIALIZABLE" + "'", str12, "INTERFACE JAVA.LANG.CLONEABLE$$.JAVA$$$.JAVA$$$.JAVA$$$.JAVA$$$.JAVA$$$.JAVA$$$.JAVA$$$.JAVA$$$.JAVA$$$.JAVA$$$.JAVA$$$.JAVA$$$.JAVA$$$.JAVA$$$.JAVA$$$.JAVA$$$.JAVA$$$.JAVA$$$.JAVA$$$.JAVA$$$.JAVA$$$.JAVA$$$.JAVA$$$.JAVA$$$.JAVA$$$.JAVA$$$.JAVA$$$.JAVA$$$.JAVA$$$.JAVA$$$.JAVA$$$.JAVA$$$.JAVA$$$.JAVA$$$.JAVAINTERFACE JAVA.IO.SERIALIZABLE");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "String" + "'", str14, "String");
    }

    @Test
    public void test37999() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest75.test37999");
        int int3 = org.apache.commons.lang3.StringUtils.lastOrdinalIndexOf("$         $         $         $         $         $         $         $         $         $         $         $         $         $         $         $         $         $         $         $         $         $         $       siLyarrA!iH", "gnirtSlitu.avaj1-gnirtSlitu.avaj1", 52);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test38000() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest75.test38000");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAllUpperCase((java.lang.CharSequence) "..............................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................LASS...                                       ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }
}

