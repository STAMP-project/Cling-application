import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest76 {

    public static boolean debug = false;

    @Test
    public void test38001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest76.test38001");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                     ArrayListArrayListArrayListavajagnal", "BYTEINTERFACE GAGA.LANG.CLONEABLEAAAAAAAAAAGAGAL.AGNAAAAAAAAAAGAGAL.AGNAAAAAAAAAAGAGAL.AGNAAAAAAAAAAGAGAL.AGNAAAAAAAAAAGAGAL.AGNAAAAAAAAAAGAGAL.AGNAAAAAAAAAAGAGAL.AGNAAAAAAAAAAGAGAL.AGNAAAAAAAAAAGAGAL.AGNAAAAAAAAAAGAGAL.AGNAAAAAAAAAAGAGAL.AGNAAAAAAAAAAGAGAL.AGNAAAAAAAAAAGAGAL.AGNAAAAAAAAAAGAGAL.AGNAAAAAAAAAAGAGAL.AGNAAAAAAAAAAGAGAL.AGNAAAAAAAAAAGAGAL.AGNAAAAAAAAAAGAGAL.AGNAAAAAAAAAAGAGAL.AGNAAAAAAAAAAGAGAL.AGNAAAAAAAAAAGAGAL.AGNAAAAAAAAAAGAGAL.AGNAAAAAAAAAAGAGAL.AGNAAAAAAAAAAGAGAL.AGNAAAAAAAAAAGAGAL.AGNAAAAAAAAAAGAGAL.AGNAAAAAAAAAAGAGAL.AGNAAAAAAAAAAGAGAL.AGNAAAAAAAAAAGAGAL.AGNAAAAAAAAAAGAGAL.AGNAAAAAAAAAAGAGAL.AGNAAAAAAAAAAGAGAL.AGNAAAAAAAAAAGAGAL.AGNAAAAAAAAAAGAGAL.AGNAAAAAAAAAAGAGAL.AGNAAAAAAAAAARINGINTERFACE GAGA.IO.SERIALIZABLE");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test38002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest76.test38002");
        java.lang.String[] strArray4 = new java.lang.String[] { "                                   " };
        java.lang.String str5 = org.apache.commons.lang3.StringUtils.getCommonPrefix(strArray4);
        int int6 = org.apache.commons.lang3.StringUtils.indexOfDifference((java.lang.CharSequence[]) strArray4);
        int int7 = org.apache.commons.lang3.StringUtils.lastIndexOfAny("...       ", strArray4);
        boolean boolean8 = org.apache.commons.lang3.StringUtils.endsWithAny("java.lang", strArray4);
        java.lang.String str12 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray4, 'a', 7, 4);
        java.lang.String[] strArray16 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("A..ayL A", "interface java.lang.CloneableLANG.GNALJAVA.LANGAVAJ.GNALJAVA.LANGAVAJ.GNALJAVA.LANGAVAJ.GNALJAVA.LANGAVAJ.GNALJAVA.LANGAVAJ.GNALJAVA.LANGAVAJ.GNALJAVA.LANGAVAJ.GNALJAVA.LANGAVAJ.JAVAinterface java.io.Serializable", 33);
        java.lang.String str17 = org.apache.commons.lang3.StringUtils.replaceEach("################################... AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA", strArray4, strArray16);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "                                   " + "'", str5, "                                   ");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNotNull(strArray16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "################################... AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA" + "'", str17, "################################... AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA");
    }

    @Test
    public void test38003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest76.test38003");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.startsWithIgnoreCase("String[]", "...rgnaluavajtutututututut...");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test38004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest76.test38004");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.remove(". ", 'a');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + ". " + "'", str2, ". ");
    }

    @Test
    public void test38005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest76.test38005");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitByCharacterType("CLASS JAVA.UTIL.ABSTRACTLISTGN LU V J ....................................................................CLASS JAVA.UTIL.ABSTRACTCOLLECTIONGN LU V J ....................................................................CLASS JAVA.LANG.OBJEC");
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test38006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest76.test38006");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.stripEnd("AAAAAAAAAAaaaalaagaAAAAAAAAAAaaaalaagaAANG.Llit                                                                                                                                 AAAAAAAAAAaaaalaagaAAAAAAAAAAaaaalaagaAAA", "avaj ssalc");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "AAAAAAAAAAaaaalaagaAAAAAAAAAAaaaalaagaAANG.Llit                                                                                                                                 AAAAAAAAAAaaaalaagaAAAAAAAAAAaaaalaagaAAA" + "'", str2, "AAAAAAAAAAaaaalaagaAAAAAAAAAAaaaalaagaAANG.Llit                                                                                                                                 AAAAAAAAAAaaaalaagaAAAAAAAAAAaaaalaagaAAA");
    }

    @Test
    public void test38007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest76.test38007");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfIgnoreCase("aaaaaaaa#AGNAAAAAAAAGNALaaaaaaaa", "4444444444444444444444444444444444444444.LANGa.                                                     ClassJAVA4444444444444444444444444444444444444444");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test38008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest76.test38008");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBetween(".....................................................................................................................................................................................................................................tsilyarrgnaluavajtsilyarrgnaluavaj......................................................................................................................................................................................................................................", "..aaaa                       javaulangRRAYlISTYla");
        org.junit.Assert.assertNull(str2);
    }

    @Test
    public void test38009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest76.test38009");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfAnyBut("AGNaaaaaaaaaaJAARRAYLISTARRAYLISTARRAYLISTAVAJ", "objectylist");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test38010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest76.test38010");
        java.lang.String str2 = org.apache.commons.lang3.ClassUtils.getShortClassName((java.lang.Object) "javal####################", "y..............................ObjectyList..............................O");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "String" + "'", str2, "String");
    }

    @Test
    public void test38011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest76.test38011");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeStart("#AGNAAAAAAAAGNAL", ".ava");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "#AGNAAAAAAAAGNAL" + "'", str2, "#AGNAAAAAAAAGNAL");
    }

    @Test
    public void test38012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest76.test38012");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "4444444444444444444444444444444444444444444444444444444444444444444444444444JAVA.LANGaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "GNALUAVAJGNALUAVAJGNALUAVAJGNALUAVAJGNALUAVAJGNALUAVAJGNALUAVAJGNALUAVAJGNALUAVAJGNALUAVAJGNALUAVAJGNALUAVAJGNALUAVAJGNALUAVAJGNALUAVAJGNALUAVAJGNALUAVAJGNALUAVAJGNALUAVAJGNALUAVAJSSALCGNALAVAJSSALC");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 76 + "'", int2 == 76);
    }

    @Test
    public void test38013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest76.test38013");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeStart("................................................................................................................................................................................................................................................................................................................................................................................ArryList...................................................................................................................................................................................................................................................................................................................................................................................................................................................................................", "$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$nterface java.lang.Cloneable.......java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........javainterface java.io.Serializabl");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "................................................................................................................................................................................................................................................................................................................................................................................ArryList..................................................................................................................................................................................................................................................................................................................................................................................................................................................................................." + "'", str2, "................................................................................................................................................................................................................................................................................................................................................................................ArryList...................................................................................................................................................................................................................................................................................................................................................................................................................................................................................");
    }

    @Test
    public void test38014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest76.test38014");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.difference("$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$avalitu.$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$", "AVAJ.GNALAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA CHARACTERCHARACTERCHARACTERCHARACTERCHARACTERCHARACTERCHARACTERCHARACTERCHARACTERCHARACTERCHARACTERCHARACTERCHARACTERCHARACTERCHARACTERCHARACTERCHARACTERCHARACTERCHARACTERCHARACTERCHARACTERCHARACTERCHARACTERCHARACTERCHARACTERCHARACTERCHARACTERCHARACTERCHARACTERCHARACTERCHARACTERCHARACTERCHARACTERCHARACTERCHARACTERCHARACTERCHARACTERCHARACTERCHARACTERCHARACTERCHARACTERCHARACTERCHARACTERCHARACTERCHARACTERCHARACTERCHARACTERCHARACTERCHARACTERCHARACTERCHARACTERCHARACTERCHARACTERCHARACTERCHARACTERCHARACTERCHARACTERCHARACTERCHARACTERCHARACTERCHARACTERCHARACTERCHARA");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "AVAJ.GNALAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA CHARACTERCHARACTERCHARACTERCHARACTERCHARACTERCHARACTERCHARACTERCHARACTERCHARACTERCHARACTERCHARACTERCHARACTERCHARACTERCHARACTERCHARACTERCHARACTERCHARACTERCHARACTERCHARACTERCHARACTERCHARACTERCHARACTERCHARACTERCHARACTERCHARACTERCHARACTERCHARACTERCHARACTERCHARACTERCHARACTERCHARACTERCHARACTERCHARACTERCHARACTERCHARACTERCHARACTERCHARACTERCHARACTERCHARACTERCHARACTERCHARACTERCHARACTERCHARACTERCHARACTERCHARACTERCHARACTERCHARACTERCHARACTERCHARACTERCHARACTERCHARACTERCHARACTERCHARACTERCHARACTERCHARACTERCHARACTERCHARACTERCHARACTERCHARACTERCHARACTERCHARACTERCHARACTERCHARA" + "'", str2, "AVAJ.GNALAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA CHARACTERCHARACTERCHARACTERCHARACTERCHARACTERCHARACTERCHARACTERCHARACTERCHARACTERCHARACTERCHARACTERCHARACTERCHARACTERCHARACTERCHARACTERCHARACTERCHARACTERCHARACTERCHARACTERCHARACTERCHARACTERCHARACTERCHARACTERCHARACTERCHARACTERCHARACTERCHARACTERCHARACTERCHARACTERCHARACTERCHARACTERCHARACTERCHARACTERCHARACTERCHARACTERCHARACTERCHARACTERCHARACTERCHARACTERCHARACTERCHARACTERCHARACTERCHARACTERCHARACTERCHARACTERCHARACTERCHARACTERCHARACTERCHARACTERCHARACTERCHARACTERCHARACTERCHARACTERCHARACTERCHARACTERCHARACTERCHARACTERCHARACTERCHARACTERCHARACTERCHARACTERCHARACTERCHARA");
    }

    @Test
    public void test38015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest76.test38015");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAllLowerCase((java.lang.CharSequence) "interface java.lang.CloneableStringinterface java.io");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test38016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest76.test38016");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.containsWhitespace("                                                                                                                                                                                                                                                                                                                                               javaStringnalArrayListArrayListArrayListavaj.gnalArrayListArrayListArrayLi");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test38017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest76.test38017");
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
        java.lang.Class<?> wildcardClass34 = null;
        java.lang.Class[] classArray36 = new java.lang.Class[1];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray37 = (java.lang.Class<?>[]) classArray36;
        wildcardClassArray37[0] = wildcardClass34;
        java.lang.Class<?>[] wildcardClassArray40 = org.apache.commons.lang3.ClassUtils.primitivesToWrappers(wildcardClassArray37);
        java.lang.Class<?> wildcardClass41 = null;
        java.lang.Class[] classArray43 = new java.lang.Class[1];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray44 = (java.lang.Class<?>[]) classArray43;
        wildcardClassArray44[0] = wildcardClass41;
        java.lang.Class<?>[] wildcardClassArray47 = org.apache.commons.lang3.ClassUtils.primitivesToWrappers(wildcardClassArray44);
        java.lang.String[] strArray49 = new java.lang.String[] { "                                   " };
        java.lang.String str50 = org.apache.commons.lang3.StringUtils.getCommonPrefix(strArray49);
        java.lang.Class<?>[] wildcardClassArray51 = org.apache.commons.lang3.ClassUtils.toClass((java.lang.Object[]) strArray49);
        java.lang.Class<?> wildcardClass52 = null;
        java.lang.Class[] classArray54 = new java.lang.Class[1];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray55 = (java.lang.Class<?>[]) classArray54;
        wildcardClassArray55[0] = wildcardClass52;
        java.lang.Class<?>[] wildcardClassArray58 = org.apache.commons.lang3.ClassUtils.primitivesToWrappers(wildcardClassArray55);
        boolean boolean59 = org.apache.commons.lang3.ClassUtils.isAssignable(wildcardClassArray51, wildcardClassArray55);
        boolean boolean61 = org.apache.commons.lang3.ClassUtils.isAssignable(wildcardClassArray44, wildcardClassArray55, true);
        boolean boolean63 = org.apache.commons.lang3.ClassUtils.isAssignable(wildcardClassArray40, wildcardClassArray55, true);
        boolean boolean65 = org.apache.commons.lang3.ClassUtils.isAssignable(wildcardClassArray33, wildcardClassArray40, true);
        java.lang.String[] strArray68 = new java.lang.String[] { "                                   " };
        java.lang.String str69 = org.apache.commons.lang3.StringUtils.getCommonPrefix(strArray68);
        java.lang.Class<?>[] wildcardClassArray70 = org.apache.commons.lang3.ClassUtils.toClass((java.lang.Object[]) strArray68);
        java.lang.String[] strArray73 = new java.lang.String[] { "                                   " };
        java.lang.String str74 = org.apache.commons.lang3.StringUtils.getCommonPrefix(strArray73);
        int int75 = org.apache.commons.lang3.StringUtils.indexOfDifference((java.lang.CharSequence[]) strArray73);
        int int76 = org.apache.commons.lang3.StringUtils.lastIndexOfAny("...       ", strArray73);
        java.lang.String str77 = org.apache.commons.lang3.StringUtils.replaceEach("...       AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA", strArray68, strArray73);
        java.lang.Class<?>[] wildcardClassArray78 = org.apache.commons.lang3.ClassUtils.toClass((java.lang.Object[]) strArray68);
        java.lang.String str79 = org.apache.commons.lang3.StringUtils.concat((java.lang.Object[]) wildcardClassArray78);
        boolean boolean81 = org.apache.commons.lang3.ClassUtils.isAssignable(wildcardClassArray40, wildcardClassArray78, true);
        java.lang.Class<?> wildcardClass82 = wildcardClassArray78.getClass();
        java.lang.String str84 = org.apache.commons.lang3.ClassUtils.getShortClassName((java.lang.Object) wildcardClassArray78, "SLITuGNIRTsSLITuGNIRTsSLITuGNIRTsSLITuGNIRTsSL");
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
        org.junit.Assert.assertNotNull(classArray36);
        org.junit.Assert.assertNotNull(wildcardClassArray37);
        org.junit.Assert.assertNotNull(wildcardClassArray40);
        org.junit.Assert.assertNotNull(classArray43);
        org.junit.Assert.assertNotNull(wildcardClassArray44);
        org.junit.Assert.assertNotNull(wildcardClassArray47);
        org.junit.Assert.assertNotNull(strArray49);
        org.junit.Assert.assertEquals("'" + str50 + "' != '" + "                                   " + "'", str50, "                                   ");
        org.junit.Assert.assertNotNull(wildcardClassArray51);
        org.junit.Assert.assertNotNull(classArray54);
        org.junit.Assert.assertNotNull(wildcardClassArray55);
        org.junit.Assert.assertNotNull(wildcardClassArray58);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + false + "'", boolean59 == false);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + false + "'", boolean61 == false);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + false + "'", boolean63 == false);
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + false + "'", boolean65 == false);
        org.junit.Assert.assertNotNull(strArray68);
        org.junit.Assert.assertEquals("'" + str69 + "' != '" + "                                   " + "'", str69, "                                   ");
        org.junit.Assert.assertNotNull(wildcardClassArray70);
        org.junit.Assert.assertNotNull(strArray73);
        org.junit.Assert.assertEquals("'" + str74 + "' != '" + "                                   " + "'", str74, "                                   ");
        org.junit.Assert.assertTrue("'" + int75 + "' != '" + (-1) + "'", int75 == (-1));
        org.junit.Assert.assertTrue("'" + int76 + "' != '" + (-1) + "'", int76 == (-1));
        org.junit.Assert.assertEquals("'" + str77 + "' != '" + "...       AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA" + "'", str77, "...       AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA");
        org.junit.Assert.assertNotNull(wildcardClassArray78);
        org.junit.Assert.assertEquals("'" + str79 + "' != '" + "class java.lang.String" + "'", str79, "class java.lang.String");
        org.junit.Assert.assertTrue("'" + boolean81 + "' != '" + true + "'", boolean81 == true);
        org.junit.Assert.assertNotNull(wildcardClass82);
        org.junit.Assert.assertEquals("'" + str84 + "' != '" + "Class[]" + "'", str84, "Class[]");
    }

    @Test
    public void test38018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest76.test38018");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("JAVAJAVAJAVAJAVAJAVAJAVAJAVAJAVAJAVAJAVAJAVAJAVAJAVAJAVAJAVAJAVAJAVAJAVAJAVAJAVAJAVAJAVAJAVAJAVAJAVAJAVAJAVAJAVAJAVAJAVAJAVAJAVAJAVAJAVA");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.stripAll(strArray1);
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.stripAll(strArray1, "#########################################################################################yList");
        java.lang.String str5 = org.apache.commons.lang3.StringUtils.getCommonPrefix(strArray4);
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "JAVAJAVAJAVAJAVAJAVAJAVAJAVAJAVAJAVAJAVAJAVAJAVAJAVAJAVAJAVAJAVAJAVAJAVAJAVAJAVAJAVAJAVAJAVAJAVAJAVAJAVAJAVAJAVAJAVAJAVAJAVAJAVAJAVAJAVA" + "'", str5, "JAVAJAVAJAVAJAVAJAVAJAVAJAVAJAVAJAVAJAVAJAVAJAVAJAVAJAVAJAVAJAVAJAVAJAVAJAVAJAVAJAVAJAVAJAVAJAVAJAVAJAVAJAVAJAVAJAVAJAVAJAVAJAVAJAVAJAVA");
    }

    @Test
    public void test38019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest76.test38019");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "LANG.GNALJ44444444444444444.4...", "AAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAA");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test38020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest76.test38020");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAsciiPrintable((java.lang.CharSequence) "JAVA.LANGAVAJ.GNALJAVA.LANGAVAJ.GNALJAVA.LANGAVAJ.GNALJAVA.LANGAVAJ.GNALJAVA.LANGAVAJ.GNALJAVA.LANGAVAJ.GNALJAVA.LANGAVAJ.GNALJAVA.LANGAVAJ.GNALJAVA.LANG");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test38021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest76.test38021");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.reverse("... ...AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA ...AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA ...AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA ...AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA ...AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA ...AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA ...AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA ...AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA ...AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + " AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA... AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA... AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA... AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA... AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA... AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA... AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA... AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA... AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA... ..." + "'", str1, " AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA... AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA... AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA... AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA... AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA... AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA... AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA... AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA... AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA... ...");
    }

    @Test
    public void test38022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest76.test38022");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.strip("ArryListArryListArryListvjGNAL.AVAJLANG.JAVAGNAL.AVAJLANG.JAVAGNAL.AVAJLANG.JAVAGNAL.AVAJLANG.JAVAGNAL.AVAJLANG.JAVAGNAL.AVAJLANG.JAVAGNAL.AVAJLANG.JAVAGNAL.AVAJLANG.JAVAGNAL.AVAJgnl");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "ArryListArryListArryListvjGNAL.AVAJLANG.JAVAGNAL.AVAJLANG.JAVAGNAL.AVAJLANG.JAVAGNAL.AVAJLANG.JAVAGNAL.AVAJLANG.JAVAGNAL.AVAJLANG.JAVAGNAL.AVAJLANG.JAVAGNAL.AVAJLANG.JAVAGNAL.AVAJgnl" + "'", str1, "ArryListArryListArryListvjGNAL.AVAJLANG.JAVAGNAL.AVAJLANG.JAVAGNAL.AVAJLANG.JAVAGNAL.AVAJLANG.JAVAGNAL.AVAJLANG.JAVAGNAL.AVAJLANG.JAVAGNAL.AVAJLANG.JAVAGNAL.AVAJLANG.JAVAGNAL.AVAJgnl");
    }

    @Test
    public void test38023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest76.test38023");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNotBlank((java.lang.CharSequence) "lANGgnalgnalgnalgnalg...gjavaulangjavaulangjavaulangjavaulangjavaulangjavaulangjavaulangjavaulangjavaulangjavaulangnalgnalgnalgnalgnalgn");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test38024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest76.test38024");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.uncapitalize((java.lang.CharSequence) "LANGgn lgn lgn lgn lgn lgn lgn lgn lgn lgn lgn lgn lgn lgn lgn lgn lgn lgn lgn lgn lgn lgn lgn lgn lgn lgn lgn lgn lgn lgn lgn lgn lgn lgn lgn lgn lgn lgn lgn lgn lgn lgn lgn lgn lgn lgn lgn lgn lgn lgn lgn lgn lgn lgn lgn lgn lgn lgn lgn lgn lgn lgn lgn lgn lgn lgn lgn lgn lgn lgn lgn lgn lgn lgn lgn lgn lgn lgn lgn lgn lgn lgn lgn lgn lgn lgn lgn lgn lgn lgn lgn lgn lgn lgn lgn lgn lgn lgn lgn lgn lgn lgn lgn lgn lgn lgn lgn lgn lgn lgn lgn lg");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "lANGgn lgn lgn lgn lgn lgn lgn lgn lgn lgn lgn lgn lgn lgn lgn lgn lgn lgn lgn lgn lgn lgn lgn lgn lgn lgn lgn lgn lgn lgn lgn lgn lgn lgn lgn lgn lgn lgn lgn lgn lgn lgn lgn lgn lgn lgn lgn lgn lgn lgn lgn lgn lgn lgn lgn lgn lgn lgn lgn lgn lgn lgn lgn lgn lgn lgn lgn lgn lgn lgn lgn lgn lgn lgn lgn lgn lgn lgn lgn lgn lgn lgn lgn lgn lgn lgn lgn lgn lgn lgn lgn lgn lgn lgn lgn lgn lgn lgn lgn lgn lgn lgn lgn lgn lgn lgn lgn lgn lgn lgn lgn lg" + "'", str1, "lANGgn lgn lgn lgn lgn lgn lgn lgn lgn lgn lgn lgn lgn lgn lgn lgn lgn lgn lgn lgn lgn lgn lgn lgn lgn lgn lgn lgn lgn lgn lgn lgn lgn lgn lgn lgn lgn lgn lgn lgn lgn lgn lgn lgn lgn lgn lgn lgn lgn lgn lgn lgn lgn lgn lgn lgn lgn lgn lgn lgn lgn lgn lgn lgn lgn lgn lgn lgn lgn lgn lgn lgn lgn lgn lgn lgn lgn lgn lgn lgn lgn lgn lgn lgn lgn lgn lgn lgn lgn lgn lgn lgn lgn lgn lgn lgn lgn lgn lgn lgn lgn lgn lgn lgn lgn lgn lgn lgn lgn lgn lgn lg");
    }

    @Test
    public void test38025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest76.test38025");
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.split("Gnirt...Gnirt...Gnirt...Gni                                            .Gnirt...Gnirt...Gnirt...Gnir", "#############################################", 532);
        boolean boolean5 = org.apache.commons.lang3.StringUtils.startsWithAny("Lytcejb", strArray4);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test38026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest76.test38026");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.strip("GnalAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "GnalAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA" + "'", str1, "GnalAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA");
    }

    @Test
    public void test38027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest76.test38027");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBeforeLast("                                                                    ...nAAAAAAAAAAjaval.agnAAAAAAAAAA...                                                                     ", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaajAVAAAAAAAAAAVA.LANG..va.langGNAL..la..                              aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                                                    ...nAAAAAAAAAAjaval.agnAAAAAAAAAA...                                                                     " + "'", str2, "                                                                    ...nAAAAAAAAAAjaval.agnAAAAAAAAAA...                                                                     ");
    }

    @Test
    public void test38028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest76.test38028");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOf("StringUtils", "44444444444444444444444444                                 ");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test38029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest76.test38029");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu", "Arrclassjava.lang.ObjectyListArrclassjava.lang.ObjectyListArrclassjava.lang.ObjectyListArrclassjava.lang.ObjectyListArrclassjava.lang.ObjectyListArrclassjava.lang.ObjectyListArrclassjava.lang.ObjectyListArrclassjava.lang.ObjectyListArrclassjava.lang.ObjectyListArrclassjava.lang.ObjectyListArrclassjava.lang.ObjectyListArrclassjava.lang.ObjectyListArrclassjava.lang.ObjectyListArrclassjava.lang.ObjectyListArrclassjava.lang.ObjectyList");
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test38030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest76.test38030");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.equals((java.lang.CharSequence) "INTERFACEGAGA.LANG.CLONEABLEAAAAAAAAAAGAGAL.AGNAAAAAAAAAAGAGAL.AGNAAAAAAAAAAGAGAL.AGNAAAAAAAAAAGAGAL.AGNAAAAAAAAAAGAGAL.AGNAAAAAAAAAAGAGAL.AGNAAAAAAAAAAGAGAL.AGNAAAAAAAAAAGAGAL.AGNAAAAAAAAAAGAGAL.AGNAAAAAAAAAAGAGAL.AGNAAAAAAAAAAGAGAL.AGNAAAAAAAAAAGAGAL.AGNAAAAAAAAAAGAGAL.AGNAAAAAAAAAAGAGAL.AGNAAAAAAAAAAGAGAL.AGNAAAAAAAAAAGAGAL.AGNAAAAAAAAAAGAGAL.AGNAAAAAAAAAAGAGAL.AGNAAAAAAAAAAGAGAL.AGNAAAAAAAAAAGAGAL.AGNAAAAAAAAAAGAGAL.AGNAAAAAAAAAAGAGAL.AGNAAAAAAAAAAGAGAL.AGNAAAAAAAAAAGAGAL.AGNAAAAAAAAAAGAGAL.AGNAAAAAAAAAAGAGAL.AGNAAAAAAAAAAGAGAL.AGNAAAAAAAAAAGAGAL.AGNAAAAAAAAAAGAGAL.AGNAAAAAAAAAAGAGAL.AGNAAAAAAAAAAGAGAL.AGNAAAAAAAAAAGAGAL.AGNAAAAAAAAAAGAGAL.AGNAAAAAAAAAAGAGAL.AGNAAAAAAAAAAGAGAL.AGNAAAAAAAAAARINGINTERFACEGAGA.IO", (java.lang.CharSequence) "arahCretcarahCretcarahCretcarahCretcarahCretcarahCretcarahCretcarahCretcarahCretcarahCretcarahCretcarahCretcarahCretcarahCretcarahCretcarahCretcarahCretcarahCretcarahCretcarahCretcarahCretcarahCretcarahCretcarahCretcarahCretcarahCretcarahCretcarahCretcarahCretcarahCretcarahCretcarahCretcarahCretcarahCretcarahCretcarahCretcarahCretcarahCretcarahCretcarahCretcarahCretcarahCretcarahCretcarahCretcarahCretcarahCretcarahCretcarahCretcarahCretcarahCretcarahCretcarahCretcarahCretcarahCretcarahCretcarahCretcarahCretcarahCretcarahCretcarahCretcarahCretcarahCretcarahC       AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAALANG.JAVa");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test38031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest76.test38031");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.defaultIfBlank("a.Leyface javaAla..AClo.eableAAAAAAAjavaAAAAAAAObjecLavaAAAAAAAAAAjavaa.Leyface javaAaoASeyaalazable##################################################", "GNALaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaagn");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "a.Leyface javaAla..AClo.eableAAAAAAAjavaAAAAAAAObjecLavaAAAAAAAAAAjavaa.Leyface javaAaoASeyaalazable##################################################" + "'", str2, "a.Leyface javaAla..AClo.eableAAAAAAAjavaAAAAAAAObjecLavaAAAAAAAAAAjavaa.Leyface javaAaoASeyaalazable##################################################");
    }

    @Test
    public void test38032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest76.test38032");
        int int2 = org.apache.commons.lang3.StringUtils.getLevenshteinDistance((java.lang.CharSequence) "irfSeriaCoSeria$SeriairfioSeriaSriiz HI!aRRAYlISTaRRAYlISTaRRAYlISTAVAJ.GNALaRRAYlISTaRRAYlISTaRRAYlISTAVAJ javaStrinSerializableSerializableSerializableSerialijavaStrinSerializableSerializableSerializableSerialijavaStrinSerializableSerializableSerializableSerialijavaStrinSerializableSerializableSerializableSerialijavaStrinSerializableSerializableSerializableSerialijavaStrinSerializableSerializableSerializableSerialijavaStrinSerializableSerializableSerializableSerialijavaStrinSerializableSerializable", (java.lang.CharSequence) "                                              ][gnirtslitu.avaj1-");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 492 + "'", int2 == 492);
    }

    @Test
    public void test38033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest76.test38033");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOfIgnoreCase("...............................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................", "NALAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaNALAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAaaaaaaaaaaaaaaaaaaaaaaaaTERFACE JAVA.LANG.cLONEABLE.......JAVA..........JAVA..........JAVA..........JAVA..........JA...", 331);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test38034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest76.test38034");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNotBlank((java.lang.CharSequence) "                                                                                                                                                                                                                      aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa$$$$$$$$$$$$.$$$$$$$$$$avajssalcrrAtsiLytcejb$$$$$$$$$$$$.$$$$$$$$$$$                                                                                                                                                                                                                       ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test38035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest76.test38035");
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
        java.lang.String[] strArray25 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("hi!", "");
        java.lang.String[] strArray27 = org.apache.commons.lang3.StringUtils.stripAll(strArray25, "$");
        java.lang.Class<?>[] wildcardClassArray28 = org.apache.commons.lang3.ClassUtils.toClass((java.lang.Object[]) strArray25);
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
        boolean boolean51 = org.apache.commons.lang3.ClassUtils.isAssignable(wildcardClassArray28, wildcardClassArray43, false);
        java.lang.Class<?>[] wildcardClassArray52 = org.apache.commons.lang3.ClassUtils.primitivesToWrappers(wildcardClassArray28);
        boolean boolean53 = org.apache.commons.lang3.ClassUtils.isAssignable(wildcardClassArray19, wildcardClassArray28);
        java.lang.Class<?>[] wildcardClassArray54 = org.apache.commons.lang3.ClassUtils.wrappersToPrimitives(wildcardClassArray28);
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
        org.junit.Assert.assertNotNull(strArray25);
        org.junit.Assert.assertNotNull(strArray27);
        org.junit.Assert.assertNotNull(wildcardClassArray28);
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
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertNotNull(wildcardClassArray52);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + true + "'", boolean53 == true);
        org.junit.Assert.assertNotNull(wildcardClassArray54);
    }

    @Test
    public void test38036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest76.test38036");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.leftPad(".........................................ArryListArryListArryListArryLis.........................................", 687, '$');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$.........................................ArryListArryListArryListArryLis........................................." + "'", str3, "$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$.........................................ArryListArryListArryListArryLis.........................................");
    }

    @Test
    public void test38037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest76.test38037");
        char[] charArray14 = new char[] { ' ', ' ', '#', 'a', '4', 'a' };
        int int15 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "", charArray14);
        boolean boolean16 = org.apache.commons.lang3.StringUtils.containsAny("$", charArray14);
        int int17 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "", charArray14);
        boolean boolean18 = org.apache.commons.lang3.StringUtils.containsAny("$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$", charArray14);
        boolean boolean19 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "h!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ihLITU.AVAJ", charArray14);
        int int20 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "lutilutilutilutilutil####lutilutilutilutilutil", charArray14);
        int int21 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "arraylisarraylisarraylisarraylisarra....................................................................................................", charArray14);
        boolean boolean22 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "GNALaAVAJLANGaJAVAGNALaAVAJLANGaJ", charArray14);
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
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
    }

    @Test
    public void test38038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest76.test38038");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBetween("uti4444444444444444444444444444444444444444444444444444444444444444444444444ava4444444444444444444444444444444444444444444444444444444444444444444444444j", "                                               aaaaJAVAL.AGNaaaaaaaaaaJAVAL");
        org.junit.Assert.assertNull(str2);
    }

    @Test
    public void test38039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest76.test38039");
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("jAVA.L$A", "#########################################################################################yList", 4);
        java.lang.String str6 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray4, '$');
        java.lang.String[] strArray7 = null;
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.replaceEachRepeatedly("4444444string44444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444.ly..                                  $$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$                                  $$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$                                  $$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$                                  $$$$$$$$$$$$$$$$$$$$$$$44444444                                                                                                                                                                                                                                                                      ", strArray4, strArray7);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "jAVA.L$A" + "'", str6, "jAVA.L$A");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "4444444string44444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444.ly..                                  $$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$                                  $$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$                                  $$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$                                  $$$$$$$$$$$$$$$$$$$$$$$44444444                                                                                                                                                                                                                                                                      " + "'", str8, "4444444string44444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444.ly..                                  $$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$                                  $$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$                                  $$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$                                  $$$$$$$$$$$$$$$$$$$$$$$44444444                                                                                                                                                                                                                                                                      ");
    }

    @Test
    public void test38040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest76.test38040");
        int int2 = org.apache.commons.lang3.StringUtils.getLevenshteinDistance((java.lang.CharSequence) "interface java.lang.CloneablejAV-1JAVA.UTILsTRING-1JAVA.UTILsTRING-1JAVA.UTILsTRING-1JAVA.UTILsTRING-1JAVAinterface java.io.Serializable", (java.lang.CharSequence) "CEAJ V ALCEAJ V ALCEAJ V ALCEAJ V ALCEAJ V ALCEAJ V ALCEAJ V ALCEAJ V AL");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 118 + "'", int2 == 118);
    }

    @Test
    public void test38041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest76.test38041");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.abbreviate(".............java..........java..........java..........java..........java..........java..........java..........java..........java..........java...........", 723, 108);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + ".........java..........java..........java..........java..........java..........java..........java..........." + "'", str3, ".........java..........java..........java..........java..........java..........java..........java...........");
    }

    @Test
    public void test38042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest76.test38042");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$AVAJEGNALN          JAVALEAGN          JAVALEAGN          JAVALEAGN          JAVALEAGN          J$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$", "a.lang.cloneablestrface java.lang.CloneableStringinterface java.io                   ");
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test38043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest76.test38043");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isEmpty((java.lang.CharSequence) "tSslitUgnirtSslitUgnirtSslitUgnirtSslitUgnirtSaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test38044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest76.test38044");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.rightPad("AVAJgnalArrayListArrayListArrayListavaj", 321, '#');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "AVAJgnalArrayListArrayListArrayListavaj##########################################################################################################################################################################################################################################################################################" + "'", str3, "AVAJgnalArrayListArrayListArrayListavaj##########################################################################################################################################################################################################################################################################################");
    }

    @Test
    public void test38045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest76.test38045");
        int int3 = org.apache.commons.lang3.StringUtils.indexOf("##################################################java.uti#########################################################################", "aaaaaaaaaajaval.agnaaaaaaaaaaaaaaaaaaaajaval.agnaaaaaaaaaaaaaaaaaaaajaval.agnaaaaaaaaaaaaaaaaaaaajaval.agnaaaaaaaaaaaaaaaaaaaajaval.agnaaaaaaaaaaaaaaaaaaa                      Integer                       ", 92);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test38046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest76.test38046");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass2 = org.apache.commons.lang3.ClassUtils.getClass("AAAAAAAAAAJ#V##.#GNAAAAAAAAAAJ#V##.#GNAAAAAAAAAAJ#V##.#GNAAAAAAAAAAJ#V##.#GNAAAAAAAAAAJ#V##.#GNAAAAAAAAAAJ#V##.#GNAAAAAAAAAAJ#V##.#GNAAAAAAAAAAJ#V##.#GNAAAAAAAAAAJ#V##.#GNAAAAAAAAAAJ#V##.#GNAAAAAAAAAAJ#V##.#GNAAAAAAAAAAJ#V##.#GNAAAAAAAAAAJ#                      ", true);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassNotFoundException; message: AAAAAAAAAAJ#V##.#GNAAAAAAAAAAJ#V##.#GNAAAAAAAAAAJ#V##.#GNAAAAAAAAAAJ#V##.#GNAAAAAAAAAAJ#V##.#GNAAAAAAAAAAJ#V##.#GNAAAAAAAAAAJ#V##.#GNAAAAAAAAAAJ#V##.#GNAAAAAAAAAAJ#V##.#GNAAAAAAAAAAJ#V##.#GNAAAAAAAAAAJ#V##.#GNAAAAAAAAAAJ#V##.#GNAAAAAAAAAAJ#");
        } catch (java.lang.ClassNotFoundException e) {
            // Expected exception.
        }
    }

    @Test
    public void test38047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest76.test38047");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.leftPad("A..ayL A##############", 516);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                              A..ayL A##############" + "'", str2, "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                              A..ayL A##############");
    }

    @Test
    public void test38048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest76.test38048");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAllUpperCase((java.lang.CharSequence) "A..ayL A.44444444444444444444444444");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test38049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest76.test38049");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.center("                                                                       javaStrin                                                                       ", 717, "a..AYL A.44444444444444444444444444");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "a..AYL A.44444444444444444444444444a..AYL A.44444444444444444444444444a..AYL A.44444444444444444444444444a..AYL A.44444444444444444444444444a..AYL A.44444444444444444444444444a..AYL A.44444444444444444444444444a..AYL A.44444444444444444444444444a..AYL A.44444444444444444444444444a..                                                                       javaStrin                                                                       a..AYL A.44444444444444444444444444a..AYL A.44444444444444444444444444a..AYL A.44444444444444444444444444a..AYL A.44444444444444444444444444a..AYL A.44444444444444444444444444a..AYL A.44444444444444444444444444a..AYL A.44444444444444444444444444a..AYL A.44444444444444444444444444a.." + "'", str3, "a..AYL A.44444444444444444444444444a..AYL A.44444444444444444444444444a..AYL A.44444444444444444444444444a..AYL A.44444444444444444444444444a..AYL A.44444444444444444444444444a..AYL A.44444444444444444444444444a..AYL A.44444444444444444444444444a..AYL A.44444444444444444444444444a..                                                                       javaStrin                                                                       a..AYL A.44444444444444444444444444a..AYL A.44444444444444444444444444a..AYL A.44444444444444444444444444a..AYL A.44444444444444444444444444a..AYL A.44444444444444444444444444a..AYL A.44444444444444444444444444a..AYL A.44444444444444444444444444a..AYL A.44444444444444444444444444a..");
    }

    @Test
    public void test38050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest76.test38050");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.startsWith("                                                                                                                                                                                                                      irfSeriaCoSeria$SeriairfioSeriInterface java.lang.Cloneable             Character             interface java.io.SerializableirfSeriaCoSeria$SeriairfioSeria                                                                                                                                                                                                                                                                                                                                    ", "4444444444444444444444444444444444INGuTILSsTRINGuTILS");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test38051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest76.test38051");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.chop("VAJ.GNALJAVA.LANGAVAJ.GNALJAVA.LANGAVAJ.GNALJAVA.LANGAVAJ.GNALJAVA.LANGAVAJ.GNALJAVA.LANGAVAJ.GNALJAVA.LANG");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "VAJ.GNALJAVA.LANGAVAJ.GNALJAVA.LANGAVAJ.GNALJAVA.LANGAVAJ.GNALJAVA.LANGAVAJ.GNALJAVA.LANGAVAJ.GNALJAVA.LAN" + "'", str1, "VAJ.GNALJAVA.LANGAVAJ.GNALJAVA.LANGAVAJ.GNALJAVA.LANGAVAJ.GNALJAVA.LANGAVAJ.GNALJAVA.LANGAVAJ.GNALJAVA.LAN");
    }

    @Test
    public void test38052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest76.test38052");
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("ArrayLis", "", 35);
        java.lang.String[] strArray8 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("...       AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA", "tring", (int) (short) 10);
        java.lang.String str9 = org.apache.commons.lang3.StringUtils.replaceEachRepeatedly("sERIALIZABLE", strArray4, strArray8);
        java.lang.String str11 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray4, "aaaaaa...aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        java.lang.String str13 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray4, ' ');
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "sERIALIZABLE" + "'", str9, "sERIALIZABLE");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "ArrayLis" + "'", str11, "ArrayLis");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "ArrayLis" + "'", str13, "ArrayLis");
    }

    @Test
    public void test38053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest76.test38053");
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("       AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA", "STRING", 12);
        java.lang.String str6 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray4, "JAVA");
        int int7 = org.apache.commons.lang3.StringUtils.lastIndexOfAny("java.lang", strArray4);
        java.lang.String[] strArray8 = org.apache.commons.lang3.StringUtils.stripAll(strArray4);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "       AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA" + "'", str6, "       AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertNotNull(strArray8);
    }

    @Test
    public void test38054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest76.test38054");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.split("javastringnalarraylistarraylistarraylistavaj.gnalarraylistarraylistarrayli", "STRING", (int) (byte) -1);
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.stripAll(strArray3);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertNotNull(strArray4);
    }

    @Test
    public void test38055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest76.test38055");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.deleteWhitespace("ass...");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "ass..." + "'", str1, "ass...");
    }

    @Test
    public void test38056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest76.test38056");
        java.lang.String str1 = org.apache.commons.lang3.ClassUtils.getPackageCanonicalName("erface java.lang.Cloneable.interface java.io.Serializable");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "erfacejava.lang.Cloneable.interfacejava.io" + "'", str1, "erfacejava.lang.Cloneable.interfacejava.io");
    }

    @Test
    public void test38057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest76.test38057");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.right("aaaaaaaaaaJAVAL.AGNaaaaaaaaaaJAVAL.AGNaaaaaaaaaaJAVAL.AGNaaaaaaaaaaJAVAL.AGNaaaaaaaaaaJAVAL.AGNaaaaaaaaaaJAVAL.AGNaaaaaaaaaaJAVAL.AGNaaaaaaaaaaJAVAL.AGNaaaaaaaaaaJAVAL.AGNaaaaaaaaaaJAVAL.AGNaaaaaaaaaaJAVAL.AGNaaaaaaaaaaJAVAL.AGNaaaaaaaaaaJAVAL.AGNaaaaaaaaaaJAVAL.AGNaaaaaaaaaaJAVAL.AGNaaaaaaaaaaJAVAL.AGNaaaaaaaaaaJAVAL.AGNaaaaaaaaaaJAVAL.AGNaaaaaaaaaaJAVAL.AGNaaaaaaaaaaJAVAL.AGNaaaaaaaaaaJAVAL.AGNaaaaaaaaaaJAVAL.AGNaaaaaaaaaaJAVAL.AGNaaaaaaaaaaJAVAL.AGNaaaaaaaaaaJAVAL.AGNaaaaaaaaaaJAVAL.AGNaaaaaaaaaaJAVAL.AGNaaaaaaaaaaJAVAL.AGNaaaaaaaaaaJAVAL.AGNaaaaaaaaaaJAVAL.AGNaaaaaaaaaaJAVAL.AGNaaaaaaaaaaJAVAL.AGNaaaaaaaaaaJAVAL.AGNaaaaaaaaaaJAVAL.AGNaaaaaaaaaa", 104);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "aaaaaaaaaJAVAL.AGNaaaaaaaaaaJAVAL.AGNaaaaaaaaaaJAVAL.AGNaaaaaaaaaaJAVAL.AGNaaaaaaaaaaJAVAL.AGNaaaaaaaaaa" + "'", str2, "aaaaaaaaaJAVAL.AGNaaaaaaaaaaJAVAL.AGNaaaaaaaaaaJAVAL.AGNaaaaaaaaaaJAVAL.AGNaaaaaaaaaaJAVAL.AGNaaaaaaaaaa");
    }

    @Test
    public void test38058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest76.test38058");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.upperCase("JAVA.IO.SERIALIZABLE JAVA.LANG.cLONEABLESTRINGINTERFA.E INTERFA.E");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "JAVA.IO.SERIALIZABLE JAVA.LANG.CLONEABLESTRINGINTERFA.E INTERFA.E" + "'", str1, "JAVA.IO.SERIALIZABLE JAVA.LANG.CLONEABLESTRINGINTERFA.E INTERFA.E");
    }

    @Test
    public void test38059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest76.test38059");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceChars("interface java.lang.CloneableLANG.GNALJAVA.LANGAVAJ.GNALJAVA.LANGAV...", 'a', '#');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "interf#ce j#v#.l#ng.Clone#bleLANG.GNALJAVA.LANGAVAJ.GNALJAVA.LANGAV..." + "'", str3, "interf#ce j#v#.l#ng.Clone#bleLANG.GNALJAVA.LANGAVAJ.GNALJAVA.LANGAV...");
    }

    @Test
    public void test38060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest76.test38060");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.leftPad("INTERFACE JAVA.LANG.cLONEABLEsTRING", 2, ' ');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "INTERFACE JAVA.LANG.cLONEABLEsTRING" + "'", str3, "INTERFACE JAVA.LANG.cLONEABLEsTRING");
    }

    @Test
    public void test38061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest76.test38061");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isWhitespace((java.lang.CharSequence) "nterface java.lang.Cloneable.......java..........java..........java..........java..........java.aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test38062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest76.test38062");
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
        java.lang.Class<?>[] wildcardClassArray23 = org.apache.commons.lang3.ClassUtils.toClass((java.lang.Object[]) wildcardClassArray22);
        java.lang.Class<?>[] wildcardClassArray24 = org.apache.commons.lang3.ClassUtils.primitivesToWrappers(wildcardClassArray22);
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
        org.junit.Assert.assertNotNull(wildcardClassArray24);
    }

    @Test
    public void test38063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest76.test38063");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeStartIgnoreCase("arraylistarraylistarraylistavaj.gnal", "                         ...                  ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "arraylistarraylistarraylistavaj.gnal" + "'", str2, "arraylistarraylistarraylistavaj.gnal");
    }

    @Test
    public void test38064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest76.test38064");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeStartIgnoreCase("arrayListArrayListArrayListavaj.gna", "HI!ARRAYLISTARRAYLISTARRAYLISTAVAJ.GNALARRAYLISTARRAYLISTARRAYLISTAVAJ                                                                                                                                                                                                                                              JAVASTRINSERIALIZABLESERIALIZABLESERIALIZABLESERIALIJAVASTRINSERIALIZABLESERIALIZABLESERIALIZABLESERIALIJAVASTRINSERIALIZABLESERIALIZABLESERIALIZABLESERIALIJAVASTRINSERIALIZABLESERIALIZABLESERIALIZABLESERIALIJAVASTRINSERIALIZABLESERIALIZABLESERIALIZABLESERIALIJAVASTRINSERIALIZABLESERIALIZABLESERIALIZABLESERIALIJAVASTRINSERIALIZABLESERIALIZABLESERIALIZABLESERIALIJAVASTRINSERIALIZABLESERIALIZABLE");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "arrayListArrayListArrayListavaj.gna" + "'", str2, "arrayListArrayListArrayListavaj.gna");
    }

    @Test
    public void test38065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest76.test38065");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.endsWithIgnoreCase("A44444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444", "][ssalC");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test38066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest76.test38066");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.leftPad("$$$$$$$$$$$$$$$$$$$$$$$$$$$$$...$$$$$$$$$$$$$$$$$$$$$$$$$$$$$...$$$$$$$$$$$$$$$$$$$$$$$$$$", 503, '4');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "44444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444$$$$$$$$$$$$$$$$$$$$$$$$$$$$$...$$$$$$$$$$$$$$$$$$$$$$$$$$$$$...$$$$$$$$$$$$$$$$$$$$$$$$$$" + "'", str3, "44444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444$$$$$$$$$$$$$$$$$$$$$$$$$$$$$...$$$$$$$$$$$$$$$$$$$$$$$$$$$$$...$$$$$$$$$$$$$$$$$$$$$$$$$$");
    }

    @Test
    public void test38067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest76.test38067");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.stripEnd("class [Ljava.lang.Class;4class [Ljava.lang.Class;4class [Ljava.lang.Class;4class [Ljava.lang.Class;", "... java.lang.Stringclass java.lang.Stringclass...                                                                                                                                                            ... java.lang.Stringclass java.lang.Stringclass...                                                                                                                                                            ... java.lang.Stringclass java.l                        L");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "class [Ljava.lang.Class;4class [Ljava.lang.Class;4class [Ljava.lang.Class;4class [Ljava.lang.Class;" + "'", str2, "class [Ljava.lang.Class;4class [Ljava.lang.Class;4class [Ljava.lang.Class;4class [Ljava.lang.Class;");
    }

    @Test
    public void test38068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest76.test38068");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.containsWhitespace("class java.lang.String$class java.lang.String$class java.lang.String$class java.lang.String$class java.lang.String$class java.lang.String$class java.lang.String$class java.lang.String$class java.lang.String$class java.lang.String$class java.lang.String$class java.lang.String");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test38069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest76.test38069");
        int int1 = org.apache.commons.lang3.StringUtils.length((java.lang.CharSequence) "                                    cafretni");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 44 + "'", int1 == 44);
    }

    @Test
    public void test38070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest76.test38070");
        java.lang.ClassLoader classLoader0 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass2 = org.apache.commons.lang3.ClassUtils.getClass(classLoader0, "          ");
            org.junit.Assert.fail("Expected exception of type java.lang.ClassNotFoundException; message: ");
        } catch (java.lang.ClassNotFoundException e) {
            // Expected exception.
        }
    }

    @Test
    public void test38071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest76.test38071");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substring("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa4rr4yaiat", 181);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test38072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest76.test38072");
        int int3 = org.apache.commons.lang3.StringUtils.lastOrdinalIndexOf("java.utiljava.utilarra", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaayl a.a", 410);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test38073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest76.test38073");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsIgnoreCase("javal$agnjaval$agnjaval$ag", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa...esaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test38074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest76.test38074");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.strip("", "NG.CLASSjava.langAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAulangGNAL.AVAJLANG.CLASSjava.langAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAulangGNAL.AVAJLANG.CLASSjava.langAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAulangGNAL.AVAJLANG.CLASSjava.langAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAulangGNAL.AVAJLANG.CLASSjava.langAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAulangGNAL.AVAJLANG.CLASSjava.langAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAulangGNAL.AVAJLANG.GNALELBAENOLC.GNAL.AVAJ ECAFR");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test38075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest76.test38075");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isBlank((java.lang.CharSequence) "...larra...");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test38076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest76.test38076");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.abbreviateMiddle("ylavvsaylavvsaylavvsaylavvsaylavvsaylavvsaylavvsaylavvsaylavvsaylavvsaylavvsaylavvsaylavvsaylavvsaylavvsaylavvsaylavvsaylavvsaylavvsaylavvsaylavvsaylavvsaylavvsaylavvsaylavvsaylavvsaylavvsaylavvsaylavvsaylavvsaylavvsaylavvsaylavvsaylavvsaylavvsaylavvsaylavvsaylavvsaylavvsaylavvsaylavvsaylavvsaylavvsaylavvsaylavvsaylavvsaylavvsaylavvsaylavvsa.LANG.STRINGCLASS JAVA.LANG.STRINGCLASS JAVA.LANG.STRINGCLAS", "ELB ZIL IREsAOIA V JAEC FRETNI V JAAAAAAAAAA V JAAAAAAAAAA V JAAAAAAAAAA V JAAAAAAAAAA V JAAAAAAAAAA V JAAAAAAAAAA V JAAAAAAAAAA V JAAAAAAAAAA V JAAAAAAAAAA V JAAAAAAAAAA V JAAAAAAAAAA V JAAAAAAAAAA V JAAAAAAAAAA V JAAAAAAAAAA V JAAAAAAAAAA V JAAAAAAAAAA V JAAAAAAAAAA V JAAAAAAAAAA V JAAAAAAAAAA V JAAAAAAAAAA V JAAAAAAAAAA V JAAAAAAAAAA V JAAAAAAAAAA V JAAAAAAAAAA V JAAAAAAAAAA V JAAAAAAAAAA V JAAAAAAAAAA V JAAAAAAAAAA V JAAAAAAAAAA V JAAAAAAAAAA V JAAAAAAAAAA V JAAAAAAAAAA V JAAAAAAAAAA V JAAAAAAAAAA V JAAAAAAAELB ENOLcAGN LA V JAEC FRETN", 54);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "ylavvsaylavvsaylavvsaylavvsaylavvsaylavvsaylavvsaylavvsaylavvsaylavvsaylavvsaylavvsaylavvsaylavvsaylavvsaylavvsaylavvsaylavvsaylavvsaylavvsaylavvsaylavvsaylavvsaylavvsaylavvsaylavvsaylavvsaylavvsaylavvsaylavvsaylavvsaylavvsaylavvsaylavvsaylavvsaylavvsaylavvsaylavvsaylavvsaylavvsaylavvsaylavvsaylavvsaylavvsaylavvsaylavvsaylavvsaylavvsaylavvsa.LANG.STRINGCLASS JAVA.LANG.STRINGCLASS JAVA.LANG.STRINGCLAS" + "'", str3, "ylavvsaylavvsaylavvsaylavvsaylavvsaylavvsaylavvsaylavvsaylavvsaylavvsaylavvsaylavvsaylavvsaylavvsaylavvsaylavvsaylavvsaylavvsaylavvsaylavvsaylavvsaylavvsaylavvsaylavvsaylavvsaylavvsaylavvsaylavvsaylavvsaylavvsaylavvsaylavvsaylavvsaylavvsaylavvsaylavvsaylavvsaylavvsaylavvsaylavvsaylavvsaylavvsaylavvsaylavvsaylavvsaylavvsaylavvsaylavvsaylavvsa.LANG.STRINGCLASS JAVA.LANG.STRINGCLASS JAVA.LANG.STRINGCLAS");
    }

    @Test
    public void test38077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest76.test38077");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.right("interface java.lang.Cloneable... java.lang.Stringclass java.lang.Stringclass...... java.lang.Stringclass java.lang.Stringclass...... java.lang.Stringclass java.lang.Stringclass...... java.lang.Stringclass java.lang.Stringclass...... java.lang.Stringclass java.lang.Stringclass...... java.lang.Stringclass java.lang.Stringclass...... java.lang.Stringclass java.lang.Stringclass...... java.lang.Stringclass java.lang.Stringclass...... java.lang.Stringclass java.lang.Stringclass...... java.lang.Stringclass java.lang.Stringclass...... java.lang.Stringclass java.lang.Stringclass...... java.lang.Stringclass java.lang.Stringclass...... java.lang.Stringclass java.lang.Stringclass...... java.lang.Stringclass java.lang.Stringclass...... java.lang.Stringclass java.lang.Stringclass...... java.lang.Stringclass java.lang.Stringclass...... java.lang.Stringclass java.lang.Stringclass...... java.lang.Stringclass java.lang.Stringcl...avaj..........avaj..........avainterface java.io.Serializable", 257);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + ".. java.lang.Stringclass java.lang.Stringclass...... java.lang.Stringclass java.lang.Stringclass...... java.lang.Stringclass java.lang.Stringclass...... java.lang.Stringclass java.lang.Stringcl...avaj..........avaj..........avainterface java.io.Serializable" + "'", str2, ".. java.lang.Stringclass java.lang.Stringclass...... java.lang.Stringclass java.lang.Stringclass...... java.lang.Stringclass java.lang.Stringclass...... java.lang.Stringclass java.lang.Stringcl...avaj..........avaj..........avainterface java.io.Serializable");
    }

    @Test
    public void test38078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest76.test38078");
        int int1 = org.apache.commons.lang3.StringUtils.length((java.lang.CharSequence) "ho$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$rayList$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$t");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 102 + "'", int1 == 102);
    }

    @Test
    public void test38079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest76.test38079");
        java.lang.CharSequence charSequence4 = null;
        char[] charArray14 = new char[] { ' ', ' ', '#', 'a', '4', 'a' };
        int int15 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "", charArray14);
        boolean boolean16 = org.apache.commons.lang3.StringUtils.containsAny("$", charArray14);
        int int17 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "", charArray14);
        boolean boolean18 = org.apache.commons.lang3.StringUtils.containsOnly(charSequence4, charArray14);
        boolean boolean19 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "interface java.lang.CloneableString[]String[]String[]String[]String[]String[]String[]String[]String[]String[]String[]String[]String[]String[]String[]String[]String[]String[]String[]String[]String[]String[]String[]String[]String[]String[]String[]String[]String[]String[]String[]String[]String[]String[]String[]String[]String[]String[]String[]String[]String[]String[]String[]String[]String[]String[]String[]String[]String[]String[]String[]String[]String[]String[]String[]String[]String[]String[]String[]String[]String[]String[]String[]String[]String[]String[]String[]interface java.io.Serializable", charArray14);
        int int20 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "tSslitUgnirtSslitUgnirtSslitUgnirtSslitUgnirtS", charArray14);
        int int21 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "...       ....       .java.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.lang...       ....       .java.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.lang...       ....       .java.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.lang...       ....       .java.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.lang...       ....       .java.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.lang...       ....       .", charArray14);
        boolean boolean22 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "                                                                                 ][gnirtSlituGNALUaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaGNAL.AVAJssalCavaj1-", charArray14);
        org.junit.Assert.assertNotNull(charArray14);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray14), "  #a4a");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray14), "  #a4a");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray14), "[ ,  , #, a, 4, a]");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 3 + "'", int21 == 3);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
    }

    @Test
    public void test38080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest76.test38080");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("irfCo$irfioSrii", "IIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIILLLLLLLLLLLLLLLLLLLLLLLLITIULINGsTRINGuTILSuTuIssISINsuNszuNNI");
        int int4 = org.apache.commons.lang3.StringUtils.lastIndexOfAny("...       OI.AVAJECAFRETNI#ELBAENOLc.GNAL.AVAJECAFRETNIsTRINGuTILSsTRINGuTILSsTRINGuTILSsTRINGuTILSsTRINGuTILSsTRINGuTILSsTRINGuTILSsTRINGuTILSsTRINGuTILSsTRINGuTILS", strArray3);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
    }

    @Test
    public void test38081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest76.test38081");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.leftPad("", 764, 'a');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa" + "'", str3, "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
    }

    @Test
    public void test38082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest76.test38082");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.split("                                                                                                                                                                                                                                                                                                                                                              elbazilaire.oi.avaj ecafretn", '#');
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test38083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest76.test38083");
        java.lang.String[] strArray5 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("...", "                                   ", (int) 'a');
        java.lang.String[] strArray6 = org.apache.commons.lang3.StringUtils.stripAll(strArray5);
        int int7 = org.apache.commons.lang3.StringUtils.lastIndexOfAny("                                                                                                    ", strArray5);
        java.lang.String[] strArray11 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("-1java.utilString[]    ", "avaj", 89);
        java.lang.String str12 = org.apache.commons.lang3.StringUtils.replaceEach("litulitulitulitulitul####litulitulitulitulitul", strArray5, strArray11);
        java.lang.String str14 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray5, ' ');
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "litulitulitulitulitul####litulitulitulitulitul" + "'", str12, "litulitulitulitulitul####litulitulitulitulitul");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "..." + "'", str14, "...");
    }

    @Test
    public void test38084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest76.test38084");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.capitalize((java.lang.CharSequence) "                                                                                                                                                                                                                                                Java.io.Serializable interface java.lang.Cloneable... interface                                                                                                                                                                                                                                                 ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "                                                                                                                                                                                                                                                Java.io.Serializable interface java.lang.Cloneable... interface                                                                                                                                                                                                                                                 " + "'", str1, "                                                                                                                                                                                                                                                Java.io.Serializable interface java.lang.Cloneable... interface                                                                                                                                                                                                                                                 ");
    }

    @Test
    public void test38085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest76.test38085");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.rightPad("afretnignirtSelbaenolC.gnal.avaj ecafretni....................LANfretnignirtSelbaenolC.gnal.avaj ecafretni", 840, 'a');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "afretnignirtSelbaenolC.gnal.avaj ecafretni....................LANfretnignirtSelbaenolC.gnal.avaj ecafretniaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa" + "'", str3, "afretnignirtSelbaenolC.gnal.avaj ecafretni....................LANfretnignirtSelbaenolC.gnal.avaj ecafretniaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
    }

    @Test
    public void test38086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest76.test38086");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replace("GNALGNALGNALGNALGNALGNALGNALGNALGNALGNALGNALGNALGNALGNALGNALGNALGNALGNALGNALGNALGNALGNALGNALGNALGNALGNALGNALGNALGNAL.lang.lang.lang.lang.lang.lang.lLITUAVA.LA", "######################", "Arrclas...444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "GNALGNALGNALGNALGNALGNALGNALGNALGNALGNALGNALGNALGNALGNALGNALGNALGNALGNALGNALGNALGNALGNALGNALGNALGNALGNALGNALGNALGNAL.lang.lang.lang.lang.lang.lang.lLITUAVA.LA" + "'", str3, "GNALGNALGNALGNALGNALGNALGNALGNALGNALGNALGNALGNALGNALGNALGNALGNALGNALGNALGNALGNALGNALGNALGNALGNALGNALGNALGNALGNALGNAL.lang.lang.lang.lang.lang.lang.lLITUAVA.LA");
    }

    @Test
    public void test38087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest76.test38087");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOfIgnoreCase("$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$", "java.lang.Cloneable4interface java.io.Serializa                                            java.lang.Cloneable4interface java.io.Serializa                                            java.lang.Cloneable4interface java.io.Serializa                                            java.lang.Cloneable4interface java.io.Serializa                                            java.lang.Cloneable4interface java.io.Serializa                                            java.lang.Cloneable4interface java.io.Serializa                                            java.lang.Cloneable4interface java.io.Serial               ", 188);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test38088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest76.test38088");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOf("      AAAAAAAAAAAAAAAAAAA...", "sAitUJAirtSsAitUJAirtSsAitUJAirtSsAitUJAirtSsAitUJAirtSsAitUJAirtSsAitUJAirtSsAitUJAirtSsAitUJAirtSsAitUJAirtS", 924);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test38089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest76.test38089");
        char[] charArray15 = new char[] { ' ', ' ', '#', 'a', '4', 'a' };
        int int16 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "", charArray15);
        boolean boolean17 = org.apache.commons.lang3.StringUtils.containsAny("$", charArray15);
        boolean boolean18 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "...       AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA...       AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA...       AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA...       AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA...       AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA...       AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA...       AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA...       AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA...       AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA...       AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA", charArray15);
        boolean boolean19 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "rrayList", charArray15);
        int int20 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "agnAAAAAAAAAA", charArray15);
        boolean boolean21 = org.apache.commons.lang3.StringUtils.containsAny("444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa       444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444", charArray15);
        boolean boolean22 = org.apache.commons.lang3.StringUtils.containsAny("$         44444444444444444444444444444444444444444444444444444444444444444444444444444444", charArray15);
        boolean boolean23 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "Serializab", charArray15);
        int int24 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", charArray15);
        org.junit.Assert.assertNotNull(charArray15);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray15), "  #a4a");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray15), "  #a4a");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray15), "[ ,  , #, a, 4, a]");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
    }

    @Test
    public void test38090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest76.test38090");
        java.lang.String str1 = org.apache.commons.lang3.ClassUtils.getPackageName("jv######################");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
    }

    @Test
    public void test38091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest76.test38091");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfAnyBut("                                                                  litu                                                                                                                                                                                                                                                                                                                                                                                                  ", "gnAlssiLLAAsstAAAssiLLAAsstAAAssiLLAAsst");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test38092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest76.test38092");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsIgnoreCase("hi!arraylistarraylistarraylis.1aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa.1aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa.1aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa.1aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa.1aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa.1aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa.1aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa.aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "                 ...");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test38093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest76.test38093");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.split("                                                                                                                                                                                                                                                                                                                                                                                                                                JAVA.LANGAgnl.vjgnl..LANGgnl.vArrclss jv.lng.ObjectyListAr...", 'a');
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test38094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest76.test38094");
        int int2 = org.apache.commons.lang3.StringUtils.getLevenshteinDistance((java.lang.CharSequence) "java.lang.Cloneable4interface java.io.Serializa  ", (java.lang.CharSequence) "interface java.lang.cloneable interface java.io.serializable                                                                                                                                                                                                                                                                                                                                                                                                                                                                        ");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 470 + "'", int2 == 470);
    }

    @Test
    public void test38095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest76.test38095");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeEnd("                                                                                                                                                                                                                                  JAVATSILYARRATSILYARRATSILYARRA", "AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                                                                                                                                                                                                                  JAVATSILYARRATSILYARRATSILYARRA" + "'", str2, "                                                                                                                                                                                                                                  JAVATSILYARRATSILYARRATSILYARRA");
    }

    @Test
    public void test38096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest76.test38096");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "L.ArrayAAAAAAAAAA                                                                 ", "CLASS JAVALANGCLASS                       JAVAULANG                       JAVAULANG                       JAVAULANG                       JAVAULANG                       JAVAULANG                       JAVAULANG                       JAVAULANG                       JAVAULANG                       JAVAULANG                       JAVAULANG                       JAVAULANG                       JAVAULANG                       JAVAULANG                       JAVAULANG                       JAVAULANG                       JAVAULANG                       JAVAULANG                       JAVAULANG                       JAVAULANG                       JAVAULANG        ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test38097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest76.test38097");
        java.util.Locale locale1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.apache.commons.lang3.StringUtils.upperCase("...................................................................", locale1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test38098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest76.test38098");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("", "JAVAAAAAAAAAAVA.LA..", 156);
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray3, 'a', 535, 32);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
    }

    @Test
    public void test38099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest76.test38099");
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("sERIALIZABLE", "...       ....       .java.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.lang...       ....       .java.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.lang...       ....       .java.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.lang...       ....       .java.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.lang...       ....       .java.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.lang...       ....       .", 940);
        java.lang.String[] strArray6 = org.apache.commons.lang3.StringUtils.stripAll(strArray4, "4444444444444javastringslitUgnirtSarraylistarraylistavaj.gnalarraylistarraylistarrayli44444444444444");
        java.lang.String[] strArray11 = org.apache.commons.lang3.StringUtils.split("", "arraylist");
        boolean boolean12 = org.apache.commons.lang3.StringUtils.endsWithAny("java", strArray11);
        int int13 = org.apache.commons.lang3.StringUtils.indexOfAny("-1java.utilString-1java.utilString", strArray11);
        int int14 = org.apache.commons.lang3.StringUtils.indexOfDifference((java.lang.CharSequence[]) strArray11);
        java.lang.String[] strArray15 = org.apache.commons.lang3.StringUtils.stripAll(strArray11);
        java.lang.String str16 = org.apache.commons.lang3.StringUtils.replaceEach("                                                                                                                                                                                                                                                                                                                                                                  ...", strArray6, strArray11);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertNotNull(strArray15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "                                                                                                                                                                                                                                                                                                                                                                  ..." + "'", str16, "                                                                                                                                                                                                                                                                                                                                                                  ...");
    }

    @Test
    public void test38100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest76.test38100");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.split("arraylist");
        java.lang.String[] strArray6 = org.apache.commons.lang3.StringUtils.split("..", "$       ", 3);
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.replaceEachRepeatedly("langajavatsiLyarrAtsiLyarrAtsiLyarrA", strArray2, strArray6);
        int int8 = org.apache.commons.lang3.StringUtils.indexOfDifference((java.lang.CharSequence[]) strArray2);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "langajavatsiLyarrAtsiLyarrAtsiLyarrA" + "'", str7, "langajavatsiLyarrAtsiLyarrAtsiLyarrA");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
    }

    @Test
    public void test38101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest76.test38101");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.split("$", ' ');
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.stripAll(strArray3);
        boolean boolean5 = org.apache.commons.lang3.StringUtils.endsWithAny("interface java.lang.CloneableAvaj.gnalinterface java.io.Serializable", strArray3);
        java.lang.String str6 = org.apache.commons.lang3.StringUtils.concat((java.lang.Object[]) strArray3);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "$" + "'", str6, "$");
    }

    @Test
    public void test38102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest76.test38102");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.abbreviateMiddle("avaj.gnal", ".lang.Cloneable4i", 143);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "avaj.gnal" + "'", str3, "avaj.gnal");
    }

    @Test
    public void test38103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest76.test38103");
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.replace("", "cterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterChar", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa... aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa... aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa... aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa... aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa... aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa... aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa... aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa... aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa..", 99);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
    }

    @Test
    public void test38104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest76.test38104");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.center("                                                                                 .........", 7, "                                       sl..Ug..r.S");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "                                                                                 ........." + "'", str3, "                                                                                 .........");
    }

    @Test
    public void test38105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest76.test38105");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.upperCase("$         $         $         $         $         $         $         $         $         $         $         $         $         $         $         $         $         $         $         $         $         $         $       siLyarrA!iH");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "$         $         $         $         $         $         $         $         $         $         $         $         $         $         $         $         $         $         $         $         $         $         $       SILYARRA!IH" + "'", str1, "$         $         $         $         $         $         $         $         $         $         $         $         $         $         $         $         $         $         $         $         $         $         $       SILYARRA!IH");
    }

    @Test
    public void test38106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest76.test38106");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("Java.uti", "...AAAAAAAAAAAAAAAAAAAAAAAAAAAAAA...");
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test38107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest76.test38107");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.split("arrgnalylist");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray1, "Jaavaaaaaaaaaavaa.alangavaa.alangjavaa.alangjavaa.alangjavaa.alangjavaa.alangjavaa.alangjavaa.alangjavaa.alangjavaa.alangjavaa.alangjavaa.alangjavaa.alangjavaa.alangjavaa.alangjavaa.alan                                                                                                                                                                                                                                                                                                                                                                                                ");
        java.lang.String str5 = org.apache.commons.lang3.ClassUtils.getShortCanonicalName((java.lang.Object) strArray1, "AL.AGNAAAAAAAAAAJAVAL.AGNAAAAAAAAAAJAVAL.AGNAAAAAAAAAAJAVAL.AGNAAAAAAAAAAJAVAL.AGNAAAAAAAAAAJAVAL.AGNAAAAAAAAAAJAVAL.AGNAAAAAAAAAAJAVAL.AGNAAAAAAAAAAJA                                              AAAAAAAJAVAL.AGNAAAAAAAAAAJAVAL.AGNAAAAAAAAAAJAVAL.AGNAAAAAAAAAAJAVAL.AGNAAAAAAAAAAJAVAL.AGNAAAAAAAAAAJAVAL.AGNAAAAAAAAAAJAVAL.AGNAAAAAAAAAAJAVAL.AGNAAAAAAAAAAJAVAL.AGNAAAAAAAAAAJAVAL.AGNAAAAAAAAAAJAVAL.AGNAAAAAAAAAAJAVAL.AGNAAAAAAAAAARING");
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "arrgnalylist" + "'", str3, "arrgnalylist");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "String[]" + "'", str5, "String[]");
    }

    @Test
    public void test38108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest76.test38108");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.abbreviate("atsiLytcejbO.gnal.avaj ssalcrrAtsiLytcejbO.gnal.avaj ssalcrrAva.langGNAL..langjava.langAGNAL.AVAJAtsiLytcejbO.gnal.avaj ssalcrLj ssalcrrAva.langGNAL..langjava.langAGNAL.AVAJAtsiLytcejbO.gnal.avaj ssalcrrAtsiLytcejbO.gnal.avaj ssalcrrAva.langGNAL..langjava.langAGNAL.AVAJAtsiLytcejbO.gnal.avaj ssalcrrAtsiLytcejStringAtsiLytcejbO.gnal.avaj ssalcrrAtsiLytcejbO.gnal.avaj ssalcrrAva.langGNAL..langjava.langAGNAL.AVAJAtsiLytcejbO.gnal.avaj ssalcrrAtsiLytcejbO.gnal.avaj ssalcrrAva.langGNAL..langjava.langAGNAL.AVAJAtsiLytcejbO.gnal.avaj ssalcrrAtsiLytcejbO.gnal.avaj ssalcrrAva.langGNAL..langjava.langAGNAL.AVAJAtsiLytcejbO.gnal.avaj ssalcrrAtsiLytcejb", 27);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "atsiLytcejbO.gnal.avaj s..." + "'", str2, "atsiLytcejbO.gnal.avaj s...");
    }

    @Test
    public void test38109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest76.test38109");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.right("4444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444L.Arr yList", 155);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "4444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444L.Arr yList" + "'", str2, "4444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444L.Arr yList");
    }

    @Test
    public void test38110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest76.test38110");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsAny(" AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA", "                                ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test38111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest76.test38111");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripToNull("aaaaaaaaaajaval.agnaaaaaaaaaajaval.agnaaaaaaaaaajaval.agnaaaaaaaaaajaval.agnaaaaaaaaaajaval.agnaaaaaaaaaajaval.agnaaaaaaaaaajaval.agnaaaaaaaaaajaval.agnaaaaaaaaaajaval.agnaaaaaaaaaajaval.agnaaaaaaaaaajaval.agnaaaaaaaaaajaval.agnaaaaaaaaaaja                                              aaaaaaajaval.agnaaaaaaaaaajaval.agnaaaaaaaaaajaval.agnaaaaaaaaaajaval.agnaaaaaaaaaajaval.agnaaaaaaaaaajaval.agnaaaaaaaaaajaval.agnaaaaaaaaaajaval.agnaaaaaaaaaajaval.agnaaaaaaaaaajaval.agnaaaaaaaaaajaval.agnaaaaaaaaaajaval.agnaaaaaaaaaaring");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "aaaaaaaaaajaval.agnaaaaaaaaaajaval.agnaaaaaaaaaajaval.agnaaaaaaaaaajaval.agnaaaaaaaaaajaval.agnaaaaaaaaaajaval.agnaaaaaaaaaajaval.agnaaaaaaaaaajaval.agnaaaaaaaaaajaval.agnaaaaaaaaaajaval.agnaaaaaaaaaajaval.agnaaaaaaaaaajaval.agnaaaaaaaaaaja                                              aaaaaaajaval.agnaaaaaaaaaajaval.agnaaaaaaaaaajaval.agnaaaaaaaaaajaval.agnaaaaaaaaaajaval.agnaaaaaaaaaajaval.agnaaaaaaaaaajaval.agnaaaaaaaaaajaval.agnaaaaaaaaaajaval.agnaaaaaaaaaajaval.agnaaaaaaaaaajaval.agnaaaaaaaaaajaval.agnaaaaaaaaaaring" + "'", str1, "aaaaaaaaaajaval.agnaaaaaaaaaajaval.agnaaaaaaaaaajaval.agnaaaaaaaaaajaval.agnaaaaaaaaaajaval.agnaaaaaaaaaajaval.agnaaaaaaaaaajaval.agnaaaaaaaaaajaval.agnaaaaaaaaaajaval.agnaaaaaaaaaajaval.agnaaaaaaaaaajaval.agnaaaaaaaaaajaval.agnaaaaaaaaaaja                                              aaaaaaajaval.agnaaaaaaaaaajaval.agnaaaaaaaaaajaval.agnaaaaaaaaaajaval.agnaaaaaaaaaajaval.agnaaaaaaaaaajaval.agnaaaaaaaaaajaval.agnaaaaaaaaaajaval.agnaaaaaaaaaajaval.agnaaaaaaaaaajaval.agnaaaaaaaaaajaval.agnaaaaaaaaaajaval.agnaaaaaaaaaaring");
    }

    @Test
    public void test38112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest76.test38112");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass2 = org.apache.commons.lang3.ClassUtils.getClass("                                                                                          INTERFAVAJ.GNALAVA$$$.JAVA$$$.JAVA$$$.JAVA$$$.JAVA$$$.JAVA$$$.JAVA$$$.JAVA$$$.JAVA$$$.JAVA$$$.JAVA$$$.JAVA$$$.JAVA$$$.JAVA$$$.JAVA$$$.JAVA$$$.JAVA$$$.JAVA$$$.JAVA$$$.JAVA$$$.JAVA$$$.JAVA$$$.JAVA$$$.JAVA$$$.JAVA$$$.JAVA$$$.JAVA$$$.JAVA$$$.JAVA$$$.JAVA$$$.JAVA$$$.JAVA$$$.JAVA$$$.JAVA$$$.JAVAINTERFACE JAVA.IO.SERIALIZABLE                                                                                           ", true);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassNotFoundException; message: INTERFAVAJ.GNALAVA$$$.JAVA$$$.JAVA$$$.JAVA$$$.JAVA$$$.JAVA$$$.JAVA$$$.JAVA$$$.JAVA$$$.JAVA$$$.JAVA$$$.JAVA$$$.JAVA$$$.JAVA$$$.JAVA$$$.JAVA$$$.JAVA$$$.JAVA$$$.JAVA$$$.JAVA$$$.JAVA$$$.JAVA$$$.JAVA$$$.JAVA$$$.JAVA$$$.JAVA$$$.JAVA$$$.JAVA$$$.JAVA$$$.JAVA$$$.JAVA$$$.JAVA$$$.JAVA$$$.JAVA$$$.JAVAINTERFACEJAVA.IO.SERIALIZABLE");
        } catch (java.lang.ClassNotFoundException e) {
            // Expected exception.
        }
    }

    @Test
    public void test38113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest76.test38113");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.difference("####################################.aArrayaListaArrayaListaArrayaListaArrayaLis#####################################", "                       REGETNI                      ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                       REGETNI                      " + "'", str2, "                       REGETNI                      ");
    }

    @Test
    public void test38114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest76.test38114");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.rightPad("A..iyL ziirSoifri.oCfri", 17);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "A..iyL ziirSoifri.oCfri" + "'", str2, "A..iyL ziirSoifri.oCfri");
    }

    @Test
    public void test38115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest76.test38115");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.substring("arrayListArrayListArrayListavaj.gnal                                                                ", 360, 63);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test38116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest76.test38116");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isBlank((java.lang.CharSequence) "nterface java#io#erializable                                                                                                                                                                                                                                                                                                                                                                                                                                                                  ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test38117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest76.test38117");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "a                                a", "aaaa                       javaulangrraylistARACTERcHARACTERcHARACTERcHARACTERcHARACTERcHARACTERcHARACTERcHARACTERcHARACTERcHARACTERcHARACTERcHARACTERcHARACTERcHARACTERcHARACTERcHARACTERcHARACTERcHARACTERcHARACTERcHARACTERcHARACTERcHARACTERcHARACTERcHARACTERcHARACTERcHARACTERcHARACTERcHARACTERcHARACTERcHARACTERcHARACTERcHARACTERcHARACTERcHARACTERcHARACTERcHARACTERcHARACTERcHARACTERcHARACTERcHARA");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test38118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest76.test38118");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.center("h!ih!ih!ih!ih!ih!va.langavaj.gnaljava.langavaj.gnaljava.langavaj.gnaljava.langavaj.gnaljava.langavaj.gnaljava.langh!ih!ih!ih!ih!ih!", 103, "INTEGER");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "h!ih!ih!ih!ih!ih!va.langavaj.gnaljava.langavaj.gnaljava.langavaj.gnaljava.langavaj.gnaljava.langavaj.gnaljava.langh!ih!ih!ih!ih!ih!" + "'", str3, "h!ih!ih!ih!ih!ih!va.langavaj.gnaljava.langavaj.gnaljava.langavaj.gnaljava.langavaj.gnaljava.langavaj.gnaljava.langh!ih!ih!ih!ih!ih!");
    }

    @Test
    public void test38119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest76.test38119");
        java.lang.ClassLoader classLoader0 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass3 = org.apache.commons.lang3.ClassUtils.getClass(classLoader0, ".lang.lang.lang.lang", true);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassNotFoundException; message: /lang/lang/lang/lang");
        } catch (java.lang.ClassNotFoundException e) {
            // Expected exception.
        }
    }

    @Test
    public void test38120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest76.test38120");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOf("                                   TU                                   $ArrayLis", 551);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test38121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest76.test38121");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.split("", "jAVAJAVAsTRINjAVAJAVAsTRINjAVAJAVAsTRINjAVAJAVAsTRINjAVAJAVAsTRINjAVAJAVAsTRINjAVAJAVAsTRINjAVAJAVAsTRINjAVAJAVAsTRINjAVAJAVAsTRINjAVAJAVAsTRINjAVAJAVAsTRINjAVAJAVAsTRINjAVAJAVAsTRINjAVAJAVAsTRINjAVAJAVAsTRINjAVAJAVAsTRINjAVAJAVAsTRINjAVAJAVAsTRINjAVAJAVAsTRINjAVAJAVAsTRINjAVAJAVAsTRINjAVAJAVAsTRINjAVAJAVAsTRINjAVAJAVAsTRINjAVAJAVAsTRINjAVAJAVAsTRINjAVAJAVAsTRINjAVAJAVAsTRINjAVAJAVAsTRINjAVAJAVAsTRINjAVAJAVAsTRINjAVAJAVAsTRINjAVAJAVAsTRINjAVAJAVAsTRINjAVAJAVAsTRINjAVAJAVAsTRINjAVAJAVAsTRINjAVAJAVAsTRINjAVAJAVAsTRINjAVAJAVAsTRINjAVAJAVAsTRINjAVAJAVAsTRINjAVAJAVAsTRINjAVAJAVAsTRINjAVA");
        java.lang.Class<?>[] wildcardClassArray3 = org.apache.commons.lang3.ClassUtils.toClass((java.lang.Object[]) strArray2);
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.getCommonPrefix(strArray2);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertNotNull(wildcardClassArray3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
    }

    @Test
    public void test38122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest76.test38122");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.reverse("litu.avaj");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "java.util" + "'", str1, "java.util");
    }

    @Test
    public void test38123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest76.test38123");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "LANGgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalg", "4444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444                                                    ");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test38124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest76.test38124");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphaSpace((java.lang.CharSequence) "...############################");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test38125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest76.test38125");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringAfter("aaaaaaaaaajaval.agnaaaaaaaaaajaval.agnaaaaaaaaaajaval.agnaaaaaaaaaaj            aaaaaaajaval.agnaaaaaaaaaajaval.agnaaaaaaaaaajaval.agnaaaaaaaaaaring", "AAAAAAAAAA                                                                                                                                                                                                                                                                                                                                                                                                                                JAVA.LANGAGNAL.AVAJGNAL..LANGGNAL.AVARRCLASS JAVA.LANG.OBJECTYLISTAR...AAAAAAAAAA");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test38126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest76.test38126");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "rgnaavaj", "slitUgnirtSslitUgnirtSslitUgnirtSslitUgnirtSslitUgnirtSslitUgnirtSslitUgnirtSslitUgnirtSslitUgnirtSslitUgnirts");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test38127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest76.test38127");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsIgnoreCase("4444444444444javastringslitUgnirtSarraylistarraylistavaj.gnalarraylistarraylistarrayli44444444444444", "interface java.lang.Cloneable.......java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........javainterface java.io.Serializable");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test38128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest76.test38128");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.rightPad("BYTE", 81);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "BYTE                                                                             " + "'", str2, "BYTE                                                                             ");
    }

    @Test
    public void test38129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest76.test38129");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isEmpty((java.lang.CharSequence) "ArrayListAArrayListAArrayListAArrayListAArrayListAArrayListAArrayListAArrayListAArrayListAArrayListAArrayListAArrayListAArrayListAArrayListAArrayListAArrayListAArrayListAArrayListAArrayListAArrayListAArrayListAArrayListAArrayListAArrayListAArrayListAArrayListAArrayListAArrayListAArrayListAArrayListAArrayListAArrayListAArrayListAArrayListAArrayListAArrayList");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test38130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest76.test38130");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("-1", "44444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444             Character             ", 47);
        java.lang.String[] strArray5 = org.apache.commons.lang3.StringUtils.stripAll(strArray3, "class java.lang.String$class java.lang.String$class java.lang.String$class java.lang.String$class java.lang.String$class java.lang.String$class java.lang.String$class java.lang.String$class java.lang.String$class java.lang.String$class java.lang.String$class java.lang.String$class java.lang.String$class java.lang.String$class java.lang.String$class java.lang.String$class java.lang.String$class java.lang.String$class java.lang.String$class java.lang.String$class java.lang.String$class java.lang.String$class java.lang.String$class java.lang.String$class java.lang.String$class java.lang.String$class java.lang.String$class java.lang.String$class java.lang.String$class java.lang.String");
        java.lang.String[] strArray6 = org.apache.commons.lang3.StringUtils.stripAll(strArray5);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertNotNull(strArray6);
    }

    @Test
    public void test38131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest76.test38131");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.equalsIgnoreCase(" TU", "###############################                                               aaaaJAVAL.AGNaaaaaaaaaaJAVAL.AGNaaaaaaaaaaJA########ava#########################################################################j");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test38132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest76.test38132");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.swapCase("aa...");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "AA..." + "'", str1, "AA...");
    }

    @Test
    public void test38133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest76.test38133");
        int int1 = org.apache.commons.lang3.StringUtils.length((java.lang.CharSequence) "CLASS JAVA.LANG.cLASSCLASS JAVA.LANG.cLASSCLASS JAVA.LANG.cLASSCLASS JAVA.LANG.cLASSCLASS JAVA.LANG.cLASSCLASS JAVA.LANG.cLASSCLASS JAVA.LANG.cLASSCLASS JAVA.LANG.cLASSCLASS JAVA.LANG.cLASSCLASS JAVA.LANG.cLASSCLASS JAVA.LANG.cLASSCLASS JAVA.LANG.cLASSCLASS JAVA.LANG.cLASSCLASS JAVA.LANG.cLASSCLASS JAVA.LANG.cLASSCLASS JAVA.LANG.cLASSCLASS JAVA.LANG.cLASSCLASS JAVA.LANG.cLASSCLASS JAVA.LANG.cLASSCLASS JAVA.LANG.cLASSCLASS JAVA.LANG.cLASSCLASS JAVA.LANG.cLASSCLASS JAVA.LANG.cLASSCLASS JAVA.LANG.cLASSCLASS JAVA.LANG.cLASSCLASS JAVA.LANG.cLASSCLASS JAVA.LANG.cLASSCLASS JAVA.LANG.cLASSCLASS JAVA.LANG.cLASSCLASS JAVA.LANG.cLAS");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 629 + "'", int1 == 629);
    }

    @Test
    public void test38134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest76.test38134");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("ngnalarraylistarraylistarraylistavaj.gnalarraylistarraylistarrayli", "INTEGER                                        ", 0);
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void test38135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest76.test38135");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.leftPad("$$$$$$$$$$$$$$$$$$$$$$$$$$$$$AAA", 30);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "$$$$$$$$$$$$$$$$$$$$$$$$$$$$$AAA" + "'", str2, "$$$$$$$$$$$$$$$$$$$$$$$$$$$$$AAA");
    }

    @Test
    public void test38136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest76.test38136");
        java.lang.CharSequence charSequence0 = null;
        char[] charArray7 = new char[] {};
        int int8 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "$       ", charArray7);
        boolean boolean9 = org.apache.commons.lang3.StringUtils.containsAny("INTERFACE JAVA.LANG.cLONEABLE.......JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVAINTERFACE JAVA.IO.sERIALIZABLE", charArray7);
        boolean boolean10 = org.apache.commons.lang3.StringUtils.containsAny("slitUgnirtS", charArray7);
        boolean boolean11 = org.apache.commons.lang3.StringUtils.containsAny("                                                                                                                                                                                                                                                                                                                                                                                                                                JAVA.LANGAgnal.avajgnal..LANGgnal.avArrclass java.lang.ObjectyListArrclass java.lang.ObjectyListA                                                                                                                                                                                                                                                                                                                                                                                                                                ", charArray7);
        boolean boolean12 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "INTERFACEJAVA.LANG.cLONEABLE#INTERFACEJAVA.IOINTERFACEJAVA.LANG.cLONEABLE#INTERFACEJAVA.IOINTERFACEJAVA.LANG.cLONEABLE#INTERFACEJAVA.IOINTERFACEJAVABooleanINTERFACEJAVA.LANG.cLONEABLE#INTERFACEJAVA.IOINTERFACEJAVA.LANG.cLONEABLE#INTERFACEJAVA.IOINTERFACEJAVA.LANG.cLONEABLE#INTERFACEJAVA.IOINTERFACEJAVA", charArray7);
        int int13 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "a..ayl a", charArray7);
        int int14 = org.apache.commons.lang3.StringUtils.indexOfAnyBut(charSequence0, charArray7);
        org.junit.Assert.assertNotNull(charArray7);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray7), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray7), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray7), "[]");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
    }

    @Test
    public void test38137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest76.test38137");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.contains("                                       sl..Ug..r.S                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                       ", 483);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test38138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest76.test38138");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.defaultString("...java..........java..classjavalangClassJAVAULANGJAVAULANGJAVAULANGJAVAULANGJAVAULANGJAVAULANGJAVAULANGJAVAULANGJ444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444lituavajli...java..........java..classjavalangClassJAVAULANGJAVAULANGJAVAULANGJAVAULANGJAVAULANGJAVAULANGJAVAULANGJAVAULANGJA", "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "...java..........java..classjavalangClassJAVAULANGJAVAULANGJAVAULANGJAVAULANGJAVAULANGJAVAULANGJAVAULANGJAVAULANGJ444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444lituavajli...java..........java..classjavalangClassJAVAULANGJAVAULANGJAVAULANGJAVAULANGJAVAULANGJAVAULANGJAVAULANGJAVAULANGJA" + "'", str2, "...java..........java..classjavalangClassJAVAULANGJAVAULANGJAVAULANGJAVAULANGJAVAULANGJAVAULANGJAVAULANGJAVAULANGJ444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444lituavajli...java..........java..classjavalangClassJAVAULANGJAVAULANGJAVAULANGJAVAULANGJAVAULANGJAVAULANGJAVAULANGJAVAULANGJA");
    }

    @Test
    public void test38139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest76.test38139");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.center("AAAAAAAAAAJ#V##.#GNAAAAAAAAAAJ#V##.#GNAAAAAAAAAAJ#V##.#GNAAAAAAAAAAJ#V##.#GNAAAAAAAAAAJ#V##.#GNAAAAAAAAAAJ#V##.#GNAAAAAAAAAAJ#V##.#GNAAAAAAAAAAJ#V##.#GNAAAAAAAAAAJ#V##.#GNAAAAAAAAAAJ#V##.#GNAAAAAAAAAAJ#V##.#GNAAAAAAAAAAJ#V##.#GNAAAAAAAAAAJ#                                              AAAAAAAJ#V##.#GNAAAAAAAAAAJ#V##.#GNAAAAAAAAAAJ#V##.#GNAAAAAAAAAAJ#V##.#GNAAAAAAAAAAJ#V##.#GNAAAAAAAAAAJ#V##.#GNAAAAAAAAAAJ#V##.#GNAAAAAAAAAAJ#V##.#GNAAAAAAAAAAJ#V##.#GNAAAAAAAAAAJ#V##.#GNAAAAAAAAAAJ#V##.#GNAAAAAAAAAAJ#V##.#GNAAAAAAAAAARING", 735, ' ');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "                                                                                                         AAAAAAAAAAJ#V##.#GNAAAAAAAAAAJ#V##.#GNAAAAAAAAAAJ#V##.#GNAAAAAAAAAAJ#V##.#GNAAAAAAAAAAJ#V##.#GNAAAAAAAAAAJ#V##.#GNAAAAAAAAAAJ#V##.#GNAAAAAAAAAAJ#V##.#GNAAAAAAAAAAJ#V##.#GNAAAAAAAAAAJ#V##.#GNAAAAAAAAAAJ#V##.#GNAAAAAAAAAAJ#V##.#GNAAAAAAAAAAJ#                                              AAAAAAAJ#V##.#GNAAAAAAAAAAJ#V##.#GNAAAAAAAAAAJ#V##.#GNAAAAAAAAAAJ#V##.#GNAAAAAAAAAAJ#V##.#GNAAAAAAAAAAJ#V##.#GNAAAAAAAAAAJ#V##.#GNAAAAAAAAAAJ#V##.#GNAAAAAAAAAAJ#V##.#GNAAAAAAAAAAJ#V##.#GNAAAAAAAAAAJ#V##.#GNAAAAAAAAAAJ#V##.#GNAAAAAAAAAARING                                                                                                         " + "'", str3, "                                                                                                         AAAAAAAAAAJ#V##.#GNAAAAAAAAAAJ#V##.#GNAAAAAAAAAAJ#V##.#GNAAAAAAAAAAJ#V##.#GNAAAAAAAAAAJ#V##.#GNAAAAAAAAAAJ#V##.#GNAAAAAAAAAAJ#V##.#GNAAAAAAAAAAJ#V##.#GNAAAAAAAAAAJ#V##.#GNAAAAAAAAAAJ#V##.#GNAAAAAAAAAAJ#V##.#GNAAAAAAAAAAJ#V##.#GNAAAAAAAAAAJ#                                              AAAAAAAJ#V##.#GNAAAAAAAAAAJ#V##.#GNAAAAAAAAAAJ#V##.#GNAAAAAAAAAAJ#V##.#GNAAAAAAAAAAJ#V##.#GNAAAAAAAAAAJ#V##.#GNAAAAAAAAAAJ#V##.#GNAAAAAAAAAAJ#V##.#GNAAAAAAAAAAJ#V##.#GNAAAAAAAAAAJ#V##.#GNAAAAAAAAAAJ#V##.#GNAAAAAAAAAAJ#V##.#GNAAAAAAAAAARING                                                                                                         ");
    }

    @Test
    public void test38140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest76.test38140");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.defaultString("interface java.util.List interface java.util.Collection interface java.lang.Iterable interface java.util.RandomAccess interface java.lang.Cloneable interface java.io.Serializable", "vv4yL444vv4yL444vv4yL444vv4yL444vv4yL444vv4yL444vv4yL444vv4yL444vv4yL444vv4yL444vv4yL444vv4yL444vv4yL444vv4yL444vv4yL444vv4yL444vv4yL444vv4yL444vv4yL444vv4yL444vv4yL444vv4yL444vv4yL444vv4yL444vv4yL444vv4yL444vv4yL444vv4yL444vv4yL444vv4yL444vv4yL444vv4yL444vv4yL444vv4yL444vv4yL444vv4yL444vv4yL444vv4yL444vv4yL444vv4yL444vv4yL444vv4yL444vv4yL444vv4yL444vv4yL444vv4yL444vv4yL444vv4yL444vv4yL444vv4yL444vv4yL444$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$avalitu");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "interface java.util.List interface java.util.Collection interface java.lang.Iterable interface java.util.RandomAccess interface java.lang.Cloneable interface java.io.Serializable" + "'", str2, "interface java.util.List interface java.util.Collection interface java.lang.Iterable interface java.util.RandomAccess interface java.lang.Cloneable interface java.io.Serializable");
    }

    @Test
    public void test38141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest76.test38141");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.lowerCase("byte...aaaaaaaaj v aaaaaaaaaaj v aaaaaaaaaaj v interf ceaj v aioaseri liz ble");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "byte...aaaaaaaaj v aaaaaaaaaaj v aaaaaaaaaaj v interf ceaj v aioaseri liz ble" + "'", str1, "byte...aaaaaaaaj v aaaaaaaaaaj v aaaaaaaaaaj v interf ceaj v aioaseri liz ble");
    }

    @Test
    public void test38142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest76.test38142");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.difference("GNAL.AVAJLANG.JAVAGNAL.AVAJLANG.JAVAGNAL.AVAJLANG.JAVAGNAL.AVAJLANG.JAVAGNAL.AVAJLANG.JAVAGNAL.AVAJLANG.JAVAGNAL.AVAJLANG.JAVAGNAL.AVAJLANG.JAVAGNAL", "rrayLis...VA.LANGAVAJ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "rrayLis...VA.LANGAVAJ" + "'", str2, "rrayLis...VA.LANGAVAJ");
    }

    @Test
    public void test38143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest76.test38143");
        char[] charArray15 = new char[] { ' ', ' ', '#', 'a', '4', 'a' };
        int int16 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "", charArray15);
        boolean boolean17 = org.apache.commons.lang3.StringUtils.containsAny("$", charArray15);
        java.lang.String str19 = org.apache.commons.lang3.ClassUtils.getPackageCanonicalName((java.lang.Object) charArray15, "class java.lang.String");
        int int20 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "     A..ayL A.44444444444444444444444444      ", charArray15);
        boolean boolean21 = org.apache.commons.lang3.StringUtils.containsAny("NTERFACE JAVA.LANG.cLONEABLE.......JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVAINTERFACE JAVA.IO.sERIALIZABLE", charArray15);
        boolean boolean22 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA       ", charArray15);
        int int23 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "$$$$$$$$$$$$$$$$$$$$$$$$$$$$$", charArray15);
        boolean boolean24 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "                                                                                                                                                                                                                                                                              ArrayListArrayListArrayListavajagnal                                                                                                                                                                                                                                                                              ", charArray15);
        boolean boolean25 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "ArrayListA", charArray15);
        boolean boolean26 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "44444444444444444444444444444444444444444444444444444444444444444444444javaulang444444444444444444444444444444444444444444444444444444444444444444444444", charArray15);
        org.junit.Assert.assertNotNull(charArray15);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray15), "  #a4a");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray15), "  #a4a");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray15), "[ ,  , #, a, 4, a]");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 5 + "'", int20 == 5);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + (-1) + "'", int23 == (-1));
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
    }

    @Test
    public void test38144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest76.test38144");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBeforeLast("ily", "saylavvsaylavvsaylavvsaylavvsaylavvsaylavvsaylavvsaylavvsaylavvsaylavvsaylavvsaylavvsaylavvsaylavvsaylavvsayla");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "ily" + "'", str2, "ily");
    }

    @Test
    public void test38145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest76.test38145");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripToEmpty("interface java lang CloneableINTERFACE JAVA LANG CLONEABLELANG GNALJAVA LANGAVAJ GNALJAVA LANGAVAJ GNALJAVA LANGAVAJ GNALJAVA LANGAVAJ GNALJAVA LANGAVAJ GNALJAVA LANGAVAJ GNALJAVA LANGAVAJ GNALJAVA LANGAVAJ JAVAINTERFACE JAVA IO SERIALIZABLEinterface java io Serializable");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "interface java lang CloneableINTERFACE JAVA LANG CLONEABLELANG GNALJAVA LANGAVAJ GNALJAVA LANGAVAJ GNALJAVA LANGAVAJ GNALJAVA LANGAVAJ GNALJAVA LANGAVAJ GNALJAVA LANGAVAJ GNALJAVA LANGAVAJ GNALJAVA LANGAVAJ JAVAINTERFACE JAVA IO SERIALIZABLEinterface java io Serializable" + "'", str1, "interface java lang CloneableINTERFACE JAVA LANG CLONEABLELANG GNALJAVA LANGAVAJ GNALJAVA LANGAVAJ GNALJAVA LANGAVAJ GNALJAVA LANGAVAJ GNALJAVA LANGAVAJ GNALJAVA LANGAVAJ GNALJAVA LANGAVAJ GNALJAVA LANGAVAJ JAVAINTERFACE JAVA IO SERIALIZABLEinterface java io Serializable");
    }

    @Test
    public void test38146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest76.test38146");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNumeric((java.lang.CharSequence) "interface java.lang.Cloneable         ....................................................................interface java.io.Serializable");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test38147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest76.test38147");
        java.lang.CharSequence charSequence2 = org.apache.commons.lang3.StringUtils.defaultIfBlank((java.lang.CharSequence) "UTILsTRINGUTILsTRING-1JAVA-1JAVA", (java.lang.CharSequence) "444       AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA");
        org.junit.Assert.assertEquals("'" + charSequence2 + "' != '" + "UTILsTRINGUTILsTRING-1JAVA-1JAVA" + "'", charSequence2, "UTILsTRINGUTILsTRING-1JAVA-1JAVA");
    }

    @Test
    public void test38148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest76.test38148");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.containsWhitespace("                                                                                                                                                                                                                                                                                                        Interface java.lang.Cloneablehi!arr..interface java.io.Serializable                                                                                                                                                                                                                                                                                                         ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test38149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest76.test38149");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass2 = org.apache.commons.lang3.ClassUtils.getClass("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa...java..........java..", false);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassNotFoundException; message: aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa///java//////////java//");
        } catch (java.lang.ClassNotFoundException e) {
            // Expected exception.
        }
    }

    @Test
    public void test38150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest76.test38150");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("                                   #############################################################...", "gnalArrayListArrayListArrayListavaj.gnalArrayListArrayListArrayLi...aL.ArrayListgnal.aL.ArrayList...aL.ArrayListgnal.aL.ArrayList...aL.ArrayListgnal.aL.aa");
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test38151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest76.test38151");
        int int2 = org.apache.commons.lang3.StringUtils.countMatches("4444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444AAAAAAAAAA", "...#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#lass java#lang#String");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test38152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest76.test38152");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.chop("y..............................ObjectyList..............................O");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "y..............................ObjectyList.............................." + "'", str1, "y..............................ObjectyList..............................");
    }

    @Test
    public void test38153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest76.test38153");
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.split("AVAJ.GNAL", ' ');
        java.lang.String str5 = org.apache.commons.lang3.StringUtils.concatWith("...                                 ", (java.lang.Object[]) strArray4);
        int int6 = org.apache.commons.lang3.StringUtils.indexOfAny("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaainterface java.lang.CloneableStringinterface java.io.SerializableINTERFACE JAVA.LANG.cLONEABLE....", strArray4);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "AVAJ.GNAL" + "'", str5, "AVAJ.GNAL");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
    }

    @Test
    public void test38154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest76.test38154");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitByCharacterType("a                                a");
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test38155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest76.test38155");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.center("va.langjava.langjava.lang... .... .java.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.lang... .... .va.langjava.langjava.lang... .... .java.langjava.langjava.langjava.langjava.langja", 102, '4');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "va.langjava.langjava.lang... .... .java.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.lang... .... .va.langjava.langjava.lang... .... .java.langjava.langjava.langjava.langjava.langja" + "'", str3, "va.langjava.langjava.lang... .... .java.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.lang... .... .va.langjava.langjava.lang... .... .java.langjava.langjava.langjava.langjava.langja");
    }

    @Test
    public void test38156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest76.test38156");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("lang.java", ' ');
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test38157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest76.test38157");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.stripEnd("...                                 ", ".asaLyavvasaLyavvelbazilaireS.oi.avaj ecafretni4elbaenolC.gnal.avaj ecafretnialuavajasaLyavvasaLyavv");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test38158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest76.test38158");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("javastring...", "interfce jv.lng.Clonebleg.g.g.g.g.g.g.g.g.g.g.g.g.g.g.g.g.g.g.g.g.g.g.g.g.g.g.g.g.g.g.g.g.g.g.g.g.g.ginterfce jv.io.Serilizble", 12);
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void test38159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest76.test38159");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.stripEnd("gn gnal.avajgn gnal.avajgn gnal.avajgn gnal.avajgn gnal.avajgn gnal.avajgn gnal.avajgn gnal.avajgn gnal.avajgn gnal.avajgn gnal.avajgn gnal.avajgn gnal.avajgn gnal.avajgn gnal.avajgn gnal.avajgn gnal.avajgn gnal.avajgn gnal.avajgn gnal.avajgn gnal.avajgn gnal.avajgn gnal.avajgn gnal.avajgn gnal.avajgn gnal.avajgn gnal.avajgn gnal.avajgn gnal.avajgn gnal.avajgn gnal.avajgn gnal.avajgn gnal.avajgn gnal.avajgn gnal.avajgn gnal.avajgn gnal.avajgn gnal.avajgn gnal.avajgn gnal.avajgn gnal.avajgn gnal.avajgn gnal.avajgn gnal.avajgn gnal.avajgn gnal.avajgn gnal.avajgn gnal.avajgn gnal.avajgn gnal.avajgn gnalClass[]aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "gn gnal.avajgn gnal.avajgn gnal.avajgn gnal.avajgn gnal.avajgn gnal.avajgn gnal.avajgn gnal.avajgn gnal.avajgn gnal.avajgn gnal.avajgn gnal.avajgn gnal.avajgn gnal.avajgn gnal.avajgn gnal.avajgn gnal.avajgn gnal.avajgn gnal.avajgn gnal.avajgn gnal.avajgn gnal.avajgn gnal.avajgn gnal.avajgn gnal.avajgn gnal.avajgn gnal.avajgn gnal.avajgn gnal.avajgn gnal.avajgn gnal.avajgn gnal.avajgn gnal.avajgn gnal.avajgn gnal.avajgn gnal.avajgn gnal.avajgn gnal.avajgn gnal.avajgn gnal.avajgn gnal.avajgn gnal.avajgn gnal.avajgn gnal.avajgn gnal.avajgn gnal.avajgn gnal.avajgn gnal.avajgn gnal.avajgn gnal.avajgn gnalClass[]aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa" + "'", str2, "gn gnal.avajgn gnal.avajgn gnal.avajgn gnal.avajgn gnal.avajgn gnal.avajgn gnal.avajgn gnal.avajgn gnal.avajgn gnal.avajgn gnal.avajgn gnal.avajgn gnal.avajgn gnal.avajgn gnal.avajgn gnal.avajgn gnal.avajgn gnal.avajgn gnal.avajgn gnal.avajgn gnal.avajgn gnal.avajgn gnal.avajgn gnal.avajgn gnal.avajgn gnal.avajgn gnal.avajgn gnal.avajgn gnal.avajgn gnal.avajgn gnal.avajgn gnal.avajgn gnal.avajgn gnal.avajgn gnal.avajgn gnal.avajgn gnal.avajgn gnal.avajgn gnal.avajgn gnal.avajgn gnal.avajgn gnal.avajgn gnal.avajgn gnal.avajgn gnal.avajgn gnal.avajgn gnal.avajgn gnal.avajgn gnal.avajgn gnal.avajgn gnalClass[]aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
    }

    @Test
    public void test38160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest76.test38160");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isBlank((java.lang.CharSequence) "... java.lang.Stringclass java.lang.Stringclass...");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test38161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest76.test38161");
        int int3 = org.apache.commons.lang3.StringUtils.indexOfIgnoreCase("lvj.gnl", "-1java.uSerializable", 92);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test38162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest76.test38162");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.abbreviateMiddle("Lass java.lang.Stringu.................................u.................................u.................................u.....................", "iNTERFACE JAVA.LANG.CLONEABLE", 501);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Lass java.lang.Stringu.................................u.................................u.................................u....................." + "'", str3, "Lass java.lang.Stringu.................................u.................................u.................................u.....................");
    }

    @Test
    public void test38163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest76.test38163");
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
        java.lang.Class<?> wildcardClass32 = null;
        java.lang.Class[] classArray34 = new java.lang.Class[1];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray35 = (java.lang.Class<?>[]) classArray34;
        wildcardClassArray35[0] = wildcardClass32;
        java.lang.Class<?>[] wildcardClassArray38 = org.apache.commons.lang3.ClassUtils.primitivesToWrappers(wildcardClassArray35);
        java.lang.String[] strArray40 = new java.lang.String[] { "                                   " };
        java.lang.String str41 = org.apache.commons.lang3.StringUtils.getCommonPrefix(strArray40);
        java.lang.Class<?>[] wildcardClassArray42 = org.apache.commons.lang3.ClassUtils.toClass((java.lang.Object[]) strArray40);
        java.lang.Class<?> wildcardClass43 = null;
        java.lang.Class[] classArray45 = new java.lang.Class[1];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray46 = (java.lang.Class<?>[]) classArray45;
        wildcardClassArray46[0] = wildcardClass43;
        java.lang.Class<?>[] wildcardClassArray49 = org.apache.commons.lang3.ClassUtils.primitivesToWrappers(wildcardClassArray46);
        boolean boolean50 = org.apache.commons.lang3.ClassUtils.isAssignable(wildcardClassArray42, wildcardClassArray46);
        boolean boolean52 = org.apache.commons.lang3.ClassUtils.isAssignable(wildcardClassArray35, wildcardClassArray46, true);
        boolean boolean54 = org.apache.commons.lang3.ClassUtils.isAssignable(wildcardClassArray31, wildcardClassArray35, false);
        java.lang.Class<?>[] wildcardClassArray55 = org.apache.commons.lang3.ClassUtils.toClass((java.lang.Object[]) wildcardClassArray31);
        java.lang.String str56 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) wildcardClassArray31);
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
        org.junit.Assert.assertNotNull(classArray34);
        org.junit.Assert.assertNotNull(wildcardClassArray35);
        org.junit.Assert.assertNotNull(wildcardClassArray38);
        org.junit.Assert.assertNotNull(strArray40);
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "                                   " + "'", str41, "                                   ");
        org.junit.Assert.assertNotNull(wildcardClassArray42);
        org.junit.Assert.assertNotNull(classArray45);
        org.junit.Assert.assertNotNull(wildcardClassArray46);
        org.junit.Assert.assertNotNull(wildcardClassArray49);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertNotNull(wildcardClassArray55);
        org.junit.Assert.assertEquals("'" + str56 + "' != '" + "class java.lang.String" + "'", str56, "class java.lang.String");
    }

    @Test
    public void test38164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest76.test38164");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.split("Aaaaaaaaaaaa                                  ", '#');
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test38165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest76.test38165");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.stripStart("", "                                                                                                                                                                                                                                                  44444444444444444444-1java444444444444444444444                                                                                                                                                                                                                                                   ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test38166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest76.test38166");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNotEmpty((java.lang.CharSequence) "NAL.AVAJ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test38167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest76.test38167");
        char[] charArray10 = new char[] { ' ', ' ', '#', 'a', '4', 'a' };
        int int11 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "", charArray10);
        int int12 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "$", charArray10);
        boolean boolean13 = org.apache.commons.lang3.StringUtils.containsAny("class java.lang.Class                       JAVAULANG                       JAVAULANG                       JAVAULANG                       JAVAULANG                       JAVAULANG                       JAVAULANG                       JAVAULANG                       JAVAULANG                       JAVAULANG                       JAVAULANG                       JAVAULANG                       JAVAULANG                       JAVAULANG                       JAVAULANG                       JAVAULANG                       JAVAULANG                       JAVAULANG                       JAVAULANG                       JAVAULANG                       JAVAULANG        ", charArray10);
        boolean boolean14 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "aaaaaaaaaa                                                                                                                                                                                                                                                                                                                                                                                                                                JAVA.LANGAgnal.avajgnal..LANGgnal.avArrclass java.lang.ObjectyListAr...aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", charArray10);
        org.junit.Assert.assertNotNull(charArray10);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray10), "  #a4a");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray10), "  #a4a");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray10), "[ ,  , #, a, 4, a]");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test38168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest76.test38168");
        int int1 = org.apache.commons.lang3.StringUtils.length((java.lang.CharSequence) "UTILsTRING.UTILsTRING-1JAVA.-1JAVA");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 34 + "'", int1 == 34);
    }

    @Test
    public void test38169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest76.test38169");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripToEmpty("...44...                                 44444$");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "...44...                                 44444$" + "'", str1, "...44...                                 44444$");
    }

    @Test
    public void test38170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest76.test38170");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.defaultString("aVAJ.GNALAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA       CharacterCharacterCharactegnal..Array..List..Array..List..Array..L.........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........CharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterChara", "ass.........................................................................................................................................................");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "aVAJ.GNALAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA       CharacterCharacterCharactegnal..Array..List..Array..List..Array..L.........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........CharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterChara" + "'", str2, "aVAJ.GNALAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA       CharacterCharacterCharactegnal..Array..List..Array..List..Array..L.........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........CharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterChara");
    }

    @Test
    public void test38171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest76.test38171");
        java.lang.String str1 = org.apache.commons.lang3.ClassUtils.getShortClassName("irfSeriaCoSeria$SeriairfioSeriaSriiz                                                                                                                                                                                                                                                                                                                                                                                                                                                         ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "irfSeriaCoSeria.SeriairfioSeriaSriiz                                                                                                                                                                                                                                                                                                                                                                                                                                                         " + "'", str1, "irfSeriaCoSeria.SeriairfioSeriaSriiz                                                                                                                                                                                                                                                                                                                                                                                                                                                         ");
    }

    @Test
    public void test38172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest76.test38172");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfAnyBut("etyBetyBetyBetyBetyBetyBAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA...etyBetyBetyBetyBetyBetyBe                                                                             ", "arraylisarraylisarraylisarraylisarra....................................................................................................");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test38173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest76.test38173");
        java.util.Locale locale1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.apache.commons.lang3.StringUtils.upperCase("AA...                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                           ", locale1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test38174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest76.test38174");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.left("4444444444444444444444444444444444444444444444444444444444444444444444444444444n4444444444444444444444444444444444444444444444444444444444444444444444444444444", 693);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "4444444444444444444444444444444444444444444444444444444444444444444444444444444n4444444444444444444444444444444444444444444444444444444444444444444444444444444" + "'", str2, "4444444444444444444444444444444444444444444444444444444444444444444444444444444n4444444444444444444444444444444444444444444444444444444444444444444444444444444");
    }

    @Test
    public void test38175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest76.test38175");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.right("JAV", 300);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "JAV" + "'", str2, "JAV");
    }

    @Test
    public void test38176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest76.test38176");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.stripEnd("                                                                                                                                                                                                                                                                                                                                                                                                                             ", "#################################################################################");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                                                                                                                                                                                                                                                                                                                                                                                                             " + "'", str2, "                                                                                                                                                                                                                                                                                                                                                                                                                             ");
    }

    @Test
    public void test38177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest76.test38177");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBefore("Lang.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.1aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaajava.1aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa.1aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa.1aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa.1aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa.1aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa.1aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa.1aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa.1aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa.hi!arraylistarraylistarraylistavaj", "ylist                         java$.$lang");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Lang.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.1aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaajava.1aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa.1aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa.1aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa.1aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa.1aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa.1aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa.1aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa.1aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa.hi!arraylistarraylistarraylistavaj" + "'", str2, "Lang.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.1aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaajava.1aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa.1aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa.1aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa.1aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa.1aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa.1aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa.1aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa.1aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa.hi!arraylistarraylistarraylistavaj");
    }

    @Test
    public void test38178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest76.test38178");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.endsWith("ArrGNALyLis", "aaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test38179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest76.test38179");
        int int1 = org.apache.commons.lang3.StringUtils.length((java.lang.CharSequence) "... ...AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA ...AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA ...AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA ...AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA ...AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA ...AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA ...AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA ...AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA ...AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 940 + "'", int1 == 940);
    }

    @Test
    public void test38180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest76.test38180");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.split("JAVA", "");
        java.lang.String[] strArray8 = org.apache.commons.lang3.StringUtils.split("CLASSjava.langAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAulang", '4');
        boolean boolean9 = org.apache.commons.lang3.StringUtils.startsWithAny("AAAAAAAAAAjaval.agnAAAAAAAAAAjaval.a", strArray8);
        java.lang.String str10 = org.apache.commons.lang3.StringUtils.concatWith("JavastringslitUgnirtSarraylistarraylistavaj.gnalarraylistarraylistarrayl", (java.lang.Object[]) strArray8);
        java.lang.String str11 = org.apache.commons.lang3.StringUtils.getCommonPrefix(strArray8);
        java.lang.String str12 = org.apache.commons.lang3.StringUtils.replaceEach("NG.JAVAGNAL.AVAJLANG.JAVAGNAL.AVAJLANG.JAVAGNAL.AVAJLANG.JAVAGNAL.AVAJLANG.JAVAGNAL.AVAJLANG.JAVAGNAL.AVAJLANG.GNALELBAENOLC.GNAL.AVAJ ECAFR", strArray3, strArray8);
        java.lang.String str13 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray8);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "CLASSjava.langAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAulang" + "'", str10, "CLASSjava.langAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAulang");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "CLASSjava.langAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAulang" + "'", str11, "CLASSjava.langAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAulang");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "NG.CLASSjava.langAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAulangGNAL.AVAJLANG.CLASSjava.langAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAulangGNAL.AVAJLANG.CLASSjava.langAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAulangGNAL.AVAJLANG.CLASSjava.langAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAulangGNAL.AVAJLANG.CLASSjava.langAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAulangGNAL.AVAJLANG.CLASSjava.langAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAulangGNAL.AVAJLANG.GNALELBAENOLC.GNAL.AVAJ ECAFR" + "'", str12, "NG.CLASSjava.langAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAulangGNAL.AVAJLANG.CLASSjava.langAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAulangGNAL.AVAJLANG.CLASSjava.langAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAulangGNAL.AVAJLANG.CLASSjava.langAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAulangGNAL.AVAJLANG.CLASSjava.langAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAulangGNAL.AVAJLANG.CLASSjava.langAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAulangGNAL.AVAJLANG.GNALELBAENOLC.GNAL.AVAJ ECAFR");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "CLASSjava.langAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAulang" + "'", str13, "CLASSjava.langAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAulang");
    }

    @Test
    public void test38181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest76.test38181");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.center("ByteByteByteByteByteByteByteByteByteByteByteByteByteByteByteByteByteByteByteByteByteByteByteByteByteByteByteByteByteByteByteByteByteByteByteByteByteByteByteByteByteByteByteByteByteByteByteByteByteByteByteByteByteyteByteByteByteByteByteByteByteByteByteByteByteByteByteByteByteByteByteByteByteByteByteByteByteByteByteByteByteByteByteByteByteByteByteByteByteByteByteByteByteByteByteByteByteByteByteByteByteByteByteByteByteByt", 380, 'a');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "ByteByteByteByteByteByteByteByteByteByteByteByteByteByteByteByteByteByteByteByteByteByteByteByteByteByteByteByteByteByteByteByteByteByteByteByteByteByteByteByteByteByteByteByteByteByteByteByteByteByteByteByteByteyteByteByteByteByteByteByteByteByteByteByteByteByteByteByteByteByteByteByteByteByteByteByteByteByteByteByteByteByteByteByteByteByteByteByteByteByteByteByteByteByteByteByteByteByteByteByteByteByteByteByteByteByt" + "'", str3, "ByteByteByteByteByteByteByteByteByteByteByteByteByteByteByteByteByteByteByteByteByteByteByteByteByteByteByteByteByteByteByteByteByteByteByteByteByteByteByteByteByteByteByteByteByteByteByteByteByteByteByteByteByteyteByteByteByteByteByteByteByteByteByteByteByteByteByteByteByteByteByteByteByteByteByteByteByteByteByteByteByteByteByteByteByteByteByteByteByteByteByteByteByteByteByteByteByteByteByteByteByteByteByteByteByteByt");
    }

    @Test
    public void test38182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest76.test38182");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.startsWithIgnoreCase("ARRAYLISTARRAYLISTARRAYLISTAVAJ.GNAL", ".asaLyavvasaLyavvelbazilaireS.oi.avaj ecafretni4elbaenolC.gnal.avaj ecafretnialuavajasaLyavvasaLyavv");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test38183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest76.test38183");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsIgnoreCase("", " ... ... ... ... ... ... ... ... ... ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test38184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest76.test38184");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.split("JAVAGNAL", '$');
        java.lang.String[] strArray5 = org.apache.commons.lang3.StringUtils.stripAll(strArray3, "A..ayL A##############A..ayL A##############A..ayL A##############A..ayL A##############A..ayL A##############A..ayL A##############A..ayL A#########.......                                                  ");
        boolean boolean6 = org.apache.commons.lang3.StringUtils.endsWithAny("                                                                                                                                                                                                                                                                                                                                                                                                                 ##################################################java.uti#########################################################################", strArray5);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test38185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest76.test38185");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.difference("                                                                  irfco$irfiosra..ayl a.444444444444444444444444444", "...$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$...");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "...$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$..." + "'", str2, "...$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$...");
    }

    @Test
    public void test38186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest76.test38186");
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
        java.lang.String[] strArray23 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("class java.lang.String", "                                   ");
        java.lang.String[] strArray24 = org.apache.commons.lang3.StringUtils.stripAll(strArray23);
        java.lang.Class<?>[] wildcardClassArray25 = org.apache.commons.lang3.ClassUtils.toClass((java.lang.Object[]) strArray24);
        java.lang.Class<?>[] wildcardClassArray26 = org.apache.commons.lang3.ClassUtils.primitivesToWrappers(wildcardClassArray25);
        boolean boolean27 = org.apache.commons.lang3.ClassUtils.isAssignable(wildcardClassArray14, wildcardClassArray26);
        java.lang.Class<?>[] wildcardClassArray28 = org.apache.commons.lang3.ClassUtils.primitivesToWrappers(wildcardClassArray26);
        java.lang.Class<?>[] wildcardClassArray29 = org.apache.commons.lang3.ClassUtils.wrappersToPrimitives(wildcardClassArray26);
        java.lang.Class<?>[] wildcardClassArray30 = org.apache.commons.lang3.ClassUtils.primitivesToWrappers(wildcardClassArray29);
        java.lang.Class<?> wildcardClass31 = wildcardClassArray29.getClass();
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
        org.junit.Assert.assertNotNull(strArray24);
        org.junit.Assert.assertNotNull(wildcardClassArray25);
        org.junit.Assert.assertNotNull(wildcardClassArray26);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertNotNull(wildcardClassArray28);
        org.junit.Assert.assertNotNull(wildcardClassArray29);
        org.junit.Assert.assertNotNull(wildcardClassArray30);
        org.junit.Assert.assertNotNull(wildcardClass31);
    }

    @Test
    public void test38187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest76.test38187");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOfIgnoreCase("######################################################################                                                                               JLANGAVLANGALLANGANG                                                                                     JLANGAVLANGALLANGANG                                                                                     JLANGAVLANGALLANGANG                                                                                     JLANGAVLANGALLANGANG                                                                                     JLANGAVLANGALLANGANG                                                                                     JLANGAVLANGALLANGANG                                                                                     JLANGAVLANGALLANGANG                                                                               ", "", 300);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 300 + "'", int3 == 300);
    }

    @Test
    public void test38188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest76.test38188");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("hi!", "");
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.stripAll(strArray2, "$");
        java.lang.Class<?>[] wildcardClassArray5 = org.apache.commons.lang3.ClassUtils.toClass((java.lang.Object[]) strArray2);
        java.lang.Class<?>[] wildcardClassArray6 = org.apache.commons.lang3.ClassUtils.toClass((java.lang.Object[]) wildcardClassArray5);
        java.lang.Class<?>[] wildcardClassArray7 = org.apache.commons.lang3.ClassUtils.wrappersToPrimitives(wildcardClassArray6);
        java.lang.String str9 = org.apache.commons.lang3.ClassUtils.getPackageName((java.lang.Object) wildcardClassArray7, "interface java.lang.CloneableStringinterface java.io");
        java.lang.Class<?>[] wildcardClassArray10 = org.apache.commons.lang3.ClassUtils.wrappersToPrimitives(wildcardClassArray7);
        java.lang.String[] strArray12 = new java.lang.String[] { "                                   " };
        java.lang.String str13 = org.apache.commons.lang3.StringUtils.getCommonPrefix(strArray12);
        java.lang.Class<?>[] wildcardClassArray14 = org.apache.commons.lang3.ClassUtils.toClass((java.lang.Object[]) strArray12);
        java.lang.String[] strArray17 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("hi!", "");
        java.lang.String[] strArray19 = org.apache.commons.lang3.StringUtils.stripAll(strArray17, "$");
        java.lang.Class<?>[] wildcardClassArray20 = org.apache.commons.lang3.ClassUtils.toClass((java.lang.Object[]) strArray17);
        java.lang.Class<?> wildcardClass21 = null;
        java.lang.Class[] classArray23 = new java.lang.Class[1];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray24 = (java.lang.Class<?>[]) classArray23;
        wildcardClassArray24[0] = wildcardClass21;
        java.lang.Class<?>[] wildcardClassArray27 = org.apache.commons.lang3.ClassUtils.primitivesToWrappers(wildcardClassArray24);
        java.lang.String[] strArray29 = new java.lang.String[] { "                                   " };
        java.lang.String str30 = org.apache.commons.lang3.StringUtils.getCommonPrefix(strArray29);
        java.lang.Class<?>[] wildcardClassArray31 = org.apache.commons.lang3.ClassUtils.toClass((java.lang.Object[]) strArray29);
        java.lang.Class<?> wildcardClass32 = null;
        java.lang.Class[] classArray34 = new java.lang.Class[1];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray35 = (java.lang.Class<?>[]) classArray34;
        wildcardClassArray35[0] = wildcardClass32;
        java.lang.Class<?>[] wildcardClassArray38 = org.apache.commons.lang3.ClassUtils.primitivesToWrappers(wildcardClassArray35);
        boolean boolean39 = org.apache.commons.lang3.ClassUtils.isAssignable(wildcardClassArray31, wildcardClassArray35);
        boolean boolean41 = org.apache.commons.lang3.ClassUtils.isAssignable(wildcardClassArray24, wildcardClassArray35, true);
        boolean boolean43 = org.apache.commons.lang3.ClassUtils.isAssignable(wildcardClassArray20, wildcardClassArray35, false);
        java.lang.Class<?>[] wildcardClassArray44 = org.apache.commons.lang3.ClassUtils.primitivesToWrappers(wildcardClassArray20);
        java.lang.Class<?>[] wildcardClassArray45 = org.apache.commons.lang3.ClassUtils.primitivesToWrappers(wildcardClassArray44);
        java.lang.Class<?>[] wildcardClassArray46 = org.apache.commons.lang3.ClassUtils.primitivesToWrappers(wildcardClassArray45);
        boolean boolean48 = org.apache.commons.lang3.ClassUtils.isAssignable(wildcardClassArray14, wildcardClassArray45, true);
        boolean boolean50 = org.apache.commons.lang3.ClassUtils.isAssignable(wildcardClassArray7, wildcardClassArray45, true);
        java.lang.Class<?> wildcardClass51 = null;
        java.lang.Class[] classArray53 = new java.lang.Class[1];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray54 = (java.lang.Class<?>[]) classArray53;
        wildcardClassArray54[0] = wildcardClass51;
        java.lang.Class<?>[] wildcardClassArray57 = org.apache.commons.lang3.ClassUtils.primitivesToWrappers(wildcardClassArray54);
        java.lang.Class<?> wildcardClass58 = null;
        java.lang.Class[] classArray60 = new java.lang.Class[1];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray61 = (java.lang.Class<?>[]) classArray60;
        wildcardClassArray61[0] = wildcardClass58;
        java.lang.Class<?>[] wildcardClassArray64 = org.apache.commons.lang3.ClassUtils.primitivesToWrappers(wildcardClassArray61);
        java.lang.String[] strArray66 = new java.lang.String[] { "                                   " };
        java.lang.String str67 = org.apache.commons.lang3.StringUtils.getCommonPrefix(strArray66);
        java.lang.Class<?>[] wildcardClassArray68 = org.apache.commons.lang3.ClassUtils.toClass((java.lang.Object[]) strArray66);
        java.lang.Class<?> wildcardClass69 = null;
        java.lang.Class[] classArray71 = new java.lang.Class[1];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray72 = (java.lang.Class<?>[]) classArray71;
        wildcardClassArray72[0] = wildcardClass69;
        java.lang.Class<?>[] wildcardClassArray75 = org.apache.commons.lang3.ClassUtils.primitivesToWrappers(wildcardClassArray72);
        boolean boolean76 = org.apache.commons.lang3.ClassUtils.isAssignable(wildcardClassArray68, wildcardClassArray72);
        boolean boolean78 = org.apache.commons.lang3.ClassUtils.isAssignable(wildcardClassArray61, wildcardClassArray72, true);
        boolean boolean80 = org.apache.commons.lang3.ClassUtils.isAssignable(wildcardClassArray57, wildcardClassArray72, true);
        java.lang.String str81 = org.apache.commons.lang3.StringUtils.concat((java.lang.Object[]) wildcardClassArray57);
        java.lang.String str83 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) wildcardClassArray57, "GN                                            ");
        java.lang.Class<?>[] wildcardClassArray84 = org.apache.commons.lang3.ClassUtils.wrappersToPrimitives(wildcardClassArray57);
        java.lang.Class<?>[] wildcardClassArray85 = org.apache.commons.lang3.ClassUtils.wrappersToPrimitives(wildcardClassArray84);
        java.lang.Class<?>[] wildcardClassArray86 = org.apache.commons.lang3.ClassUtils.wrappersToPrimitives(wildcardClassArray85);
        java.lang.Class<?>[] wildcardClassArray87 = org.apache.commons.lang3.ClassUtils.wrappersToPrimitives(wildcardClassArray86);
        boolean boolean88 = org.apache.commons.lang3.ClassUtils.isAssignable(wildcardClassArray45, wildcardClassArray86);
        java.lang.Class<?>[] wildcardClassArray89 = org.apache.commons.lang3.ClassUtils.primitivesToWrappers(wildcardClassArray45);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertNotNull(wildcardClassArray5);
        org.junit.Assert.assertNotNull(wildcardClassArray6);
        org.junit.Assert.assertNotNull(wildcardClassArray7);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "java.lang" + "'", str9, "java.lang");
        org.junit.Assert.assertNotNull(wildcardClassArray10);
        org.junit.Assert.assertNotNull(strArray12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "                                   " + "'", str13, "                                   ");
        org.junit.Assert.assertNotNull(wildcardClassArray14);
        org.junit.Assert.assertNotNull(strArray17);
        org.junit.Assert.assertNotNull(strArray19);
        org.junit.Assert.assertNotNull(wildcardClassArray20);
        org.junit.Assert.assertNotNull(classArray23);
        org.junit.Assert.assertNotNull(wildcardClassArray24);
        org.junit.Assert.assertNotNull(wildcardClassArray27);
        org.junit.Assert.assertNotNull(strArray29);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "                                   " + "'", str30, "                                   ");
        org.junit.Assert.assertNotNull(wildcardClassArray31);
        org.junit.Assert.assertNotNull(classArray34);
        org.junit.Assert.assertNotNull(wildcardClassArray35);
        org.junit.Assert.assertNotNull(wildcardClassArray38);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertNotNull(wildcardClassArray44);
        org.junit.Assert.assertNotNull(wildcardClassArray45);
        org.junit.Assert.assertNotNull(wildcardClassArray46);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + true + "'", boolean48 == true);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + true + "'", boolean50 == true);
        org.junit.Assert.assertNotNull(classArray53);
        org.junit.Assert.assertNotNull(wildcardClassArray54);
        org.junit.Assert.assertNotNull(wildcardClassArray57);
        org.junit.Assert.assertNotNull(classArray60);
        org.junit.Assert.assertNotNull(wildcardClassArray61);
        org.junit.Assert.assertNotNull(wildcardClassArray64);
        org.junit.Assert.assertNotNull(strArray66);
        org.junit.Assert.assertEquals("'" + str67 + "' != '" + "                                   " + "'", str67, "                                   ");
        org.junit.Assert.assertNotNull(wildcardClassArray68);
        org.junit.Assert.assertNotNull(classArray71);
        org.junit.Assert.assertNotNull(wildcardClassArray72);
        org.junit.Assert.assertNotNull(wildcardClassArray75);
        org.junit.Assert.assertTrue("'" + boolean76 + "' != '" + false + "'", boolean76 == false);
        org.junit.Assert.assertTrue("'" + boolean78 + "' != '" + false + "'", boolean78 == false);
        org.junit.Assert.assertTrue("'" + boolean80 + "' != '" + false + "'", boolean80 == false);
        org.junit.Assert.assertEquals("'" + str81 + "' != '" + "" + "'", str81, "");
        org.junit.Assert.assertEquals("'" + str83 + "' != '" + "" + "'", str83, "");
        org.junit.Assert.assertNotNull(wildcardClassArray84);
        org.junit.Assert.assertNotNull(wildcardClassArray85);
        org.junit.Assert.assertNotNull(wildcardClassArray86);
        org.junit.Assert.assertNotNull(wildcardClassArray87);
        org.junit.Assert.assertTrue("'" + boolean88 + "' != '" + false + "'", boolean88 == false);
        org.junit.Assert.assertNotNull(wildcardClassArray89);
    }

    @Test
    public void test38189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest76.test38189");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.defaultString(".uti#########################################################################ava#########################################################################j", "interface java.lang.CloneableetyBinterface java.io.Serializable");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + ".uti#########################################################################ava#########################################################################j" + "'", str2, ".uti#########################################################################ava#########################################################################j");
    }

    @Test
    public void test38190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest76.test38190");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("gNAL", "NTERFACE JAVA.LANG.cLONEABLE.......JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVAINTERFACE JAVA.IO");
        int int4 = org.apache.commons.lang3.StringUtils.indexOfAny("gjavaulangjavaulangjavaulangjavaulangjavaulangjavaulangjavaulangjavaulangjavaulangjavaulangnalgnalgnalgnalgnalgn", strArray3);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
    }

    @Test
    public void test38191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest76.test38191");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.substring("LNuCctCctCctCctCctCctCctCctCctCctCctCctCctCctCctCctCctCctCctCctCctCctCctCct", 99, 152);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test38192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest76.test38192");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("ArrayList", '4');
        int int3 = org.apache.commons.lang3.StringUtils.indexOfDifference((java.lang.CharSequence[]) strArray2);
        java.lang.String str5 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray2, '#');
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray2, "SERIALIZABLE");
        int int8 = org.apache.commons.lang3.StringUtils.indexOfDifference((java.lang.CharSequence[]) strArray2);
        java.lang.String str12 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray2, '#', 483, 441);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "ArrayList" + "'", str5, "ArrayList");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "ArrayList" + "'", str7, "ArrayList");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
    }

    @Test
    public void test38193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest76.test38193");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.normalizeSpace("444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444interface java.lang.Cloneable4iGNIRTinterface java.lang");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444interface java.lang.Cloneable4iGNIRTinterface java.lang" + "'", str1, "444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444interface java.lang.Cloneable4iGNIRTinterface java.lang");
    }

    @Test
    public void test38194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest76.test38194");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.remove("$$$$$$$$$$$$$JAVA.IO.SERIALIZABLE INTERFACE JAVA.LANG.CLONEABLE... INTERFACE$$$$$$$$$$$$$#############################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################", "jAVAJAVAJAVAJAVAJAVAJAVAJAVAJAVAJAVAJAVAJAVAJAVAJAVAJAVAJAVAJAVAJAVAJAVAJAVAJAVAJAVAJAVAJAVAJAVAJAVAJAVAJAVAJAVAJAVAJAVAJAVAJAVAJAVAJAVA");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "$$$$$$$$$$$$$JAVA.IO.SERIALIZABLE INTERFACE JAVA.LANG.CLONEABLE... INTERFACE$$$$$$$$$$$$$#############################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################" + "'", str2, "$$$$$$$$$$$$$JAVA.IO.SERIALIZABLE INTERFACE JAVA.LANG.CLONEABLE... INTERFACE$$$$$$$$$$$$$#############################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################");
    }

    @Test
    public void test38195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest76.test38195");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfAnyBut("A..AYL A.44444444444444444444444444                                 ", "h!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ihlitu.avaj");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test38196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest76.test38196");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "interface java.lang.CloneableLANG.GNALJAVA.LANGAVAJ.GNALJAVA.LANGAVAJ.GNALJAVA.LANGAVAJ.GNALJAVA.LANGAVAJ.GNALJAVA.LANGAVAJ.GNALJAVA.LANGAVAJ.GNALJAVA.LANGAVAJ.GNALJAVA.LANGAVAJ.JAVAinterface java.io.Serializable", "                                                                                                                                                                                                                                                  44444444444444444444-1java444444444444444444444                                                                       .................................................................................................................................................");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test38197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest76.test38197");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.right("AVAJ.GNALAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA       CharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterChar", 257);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "rCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterChar" + "'", str2, "rCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterChar");
    }

    @Test
    public void test38198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest76.test38198");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.swapCase("LANGgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgn");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "langGNALGNALGNALGNALGNALGNALGNALGNALGNALGNALGNALGNALGNALGNALGNALGNALGNALGNALGNALGNALGNALGNALGNALGNALGNALGNALGNALGNALGNALGNALGNALGNALGNALGNALGNALGNALGN" + "'", str1, "langGNALGNALGNALGNALGNALGNALGNALGNALGNALGNALGNALGNALGNALGNALGNALGNALGNALGNALGNALGNALGNALGNALGNALGNALGNALGNALGNALGNALGNALGNALGNALGNALGNALGNALGNALGNALGN");
    }

    @Test
    public void test38199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest76.test38199");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfDifference((java.lang.CharSequence) "...          JAVAULANGrrayListAAAA                       JAVAULANGrrayLLLLLLLLLLL...", (java.lang.CharSequence) "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa$...$$aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa$...$$aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa$...$$aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa$...$$aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa$...$$aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa$...$$aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa$...$$aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test38200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest76.test38200");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripToNull("                                                                                                                                                                                                                                interface java.lang.Cloneable         ....................................................................interface java.io.Serializable");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "interface java.lang.Cloneable         ....................................................................interface java.io.Serializable" + "'", str1, "interface java.lang.Cloneable         ....................................................................interface java.io.Serializable");
    }

    @Test
    public void test38201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest76.test38201");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringAfterLast("", "javaulangrraylistjavaulangrraylistjavaulangrraylistjavaulangrraylistjavaulangrraylistjavaulangrraylistjavaulangrraylistjavaul");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test38202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest76.test38202");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.contains(" rrrrrrrrrrrrrrrrrrrrrrrrrrrrrr", "       GNALUAVAJ                       GNALUAVAJ                       GNALUAVAJ                       GNALUAVAJ                       GNALUAVAJ                       GNALUAVAJ                       GNALUAVAJ                       GNALUAVAJ                       GNALUAVAJ                       GNALUAVAJ                       GNALUAVAJ                       GNALUAVAJ                       GNALUAVAJ                       GNALUAVAJ                       GNALUAVAJ                       GNALUAVAJ                       GNALUAVAJ                       GNALUAVAJ                       GNALUAVAJ                       GNALUAVAJ                       SSALCGNALAVAJ SSALC");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test38203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest76.test38203");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trimToEmpty("444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444litu.avajlitu.avajArrayListArrayListArrayListavajGNAL.AVAJLANG.JAVAGNAL.AVAJLANG.JAVAGNAL.AVAJLANG....");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444litu.avajlitu.avajArrayListArrayListArrayListavajGNAL.AVAJLANG.JAVAGNAL.AVAJLANG.JAVAGNAL.AVAJLANG...." + "'", str1, "444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444litu.avajlitu.avajArrayListArrayListArrayListavajGNAL.AVAJLANG.JAVAGNAL.AVAJLANG.JAVAGNAL.AVAJLANG....");
    }

    @Test
    public void test38204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest76.test38204");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeEndIgnoreCase("4444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444..........", "serializable...saitujairtssaijavaulainterface java.lang.cloneable4interface java.io.serializable...saitujairtssaijavaulainterface java.lang.cloneable4interface java.io.serializablLass java.lang.Stringu.................................u.................................u.................................u.....................Lass java.lang.Stringu.................................u............................");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "4444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444.........." + "'", str2, "4444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444..........");
    }

    @Test
    public void test38205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest76.test38205");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("INTERFACE JAVA.LANG.cLONEABLEa RRR RRR RRR RRR RRR RRR RRR RRR RNAL....................INTERFACE JAVA.LANG.cLONEABLEa RRR RRR RRR RRR RRR RRR RRR RRR R");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray1, '4');
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "INTERFACE4JAVA.LANG.cLONEABLEa4RRR4RRR4RRR4RRR4RRR4RRR4RRR4RRR4RNAL....................INTERFACE4JAVA.LANG.cLONEABLEa4RRR4RRR4RRR4RRR4RRR4RRR4RRR4RRR4R" + "'", str3, "INTERFACE4JAVA.LANG.cLONEABLEa4RRR4RRR4RRR4RRR4RRR4RRR4RRR4RRR4RNAL....................INTERFACE4JAVA.LANG.cLONEABLEa4RRR4RRR4RRR4RRR4RRR4RRR4RRR4RRR4R");
    }

    @Test
    public void test38206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest76.test38206");
        java.lang.String[] strArray7 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens(".......java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java", "LANG.GNALJAVA.LANGAVAJ.GNALJAVA.LANGAVAJ.GNALJAVA.LANGAVAJ.GNALJAVA.LANGAVAJ.GNALJAVA.LANGAVAJ.GNALJAVA.LANGAVAJ.GNALJAVA.LANGAVAJ.GNALJAVA.LANGAVAJ.JAVA", 33);
        int int8 = org.apache.commons.lang3.StringUtils.indexOfAny("TU", strArray7);
        java.lang.String[] strArray12 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("                                                      #############################################", "NTERFACEJAVA.LANG.cLONEABLE.......JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVAINTERFACEJAVA.IO.sERIALIZABLE", 47);
        java.lang.String str13 = org.apache.commons.lang3.StringUtils.replaceEachRepeatedly("", strArray7, strArray12);
        java.lang.String[] strArray16 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("$         $         $         $         $         $         $         $         $         $         $         $ ...", '4');
        java.lang.String str17 = org.apache.commons.lang3.StringUtils.replaceEach("AAAAAAAAAAnga.lavajAAAAAAAAAAnga.lavajAAAAAAAAAAnga.lavajAAAAAAAAAAnga.lavajAAAAAAAAAAnga.lavajAAAAAAAAAAnga.lavajAAAAAAAAAAnga.lavajAAAAAAAAAAnga.lavajAAAAAAAAAAnga.lavajAAAAAAAAAAnga.lavajAAAAAAAAAAnga.lavajAAAAAAAAAAnga.lavajAAAAAAAAAAnga.lavajAAAAAAAAAAnga.lavajAAAAAAAAAAnga.lavajAAAAAAAAAAnga.lavajAAAAAAAAAAnga.lavajAAAAAAAAAAnga.lavajAAAAAAAAAAnga.lavajAAAAAAAAAAnga.lavajAAAAAAAAAAnga.lavajAAAAAAAAAAnga.lavajAAAAAAAAAAnga.lavajAAAAAAAAAAnga.lavajAAAAAAAAAAnga.lavajAAAAAAAAAAnga.lavajAAAAAAAAAAnga.lavajAAAAAAAAAAnga.lavajAAAAAAAAAAnga.lavajAAAAAAAAAAnga.lavajAAAAAAAAAAnga.lavajAAAAAAAAAAnga.lavajAAAAAAAAAAnga.lavajAAAAAAAAAAnga.lavajAAAAAAAAAAnga.lavajAAAAAAAAAA                                                                                                                                                                                                                                                                         ", strArray12, strArray16);
        boolean boolean18 = org.apache.commons.lang3.StringUtils.endsWithAny("       Arrclass java......................Arrclass java......................ArtringArrclass java......................Arrclass java......................Ar        ", strArray12);
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNotNull(strArray12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNotNull(strArray16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "AAAAAAAAAAnga.lavajAAAAAAAAAAnga.lavajAAAAAAAAAAnga.lavajAAAAAAAAAAnga.lavajAAAAAAAAAAnga.lavajAAAAAAAAAAnga.lavajAAAAAAAAAAnga.lavajAAAAAAAAAAnga.lavajAAAAAAAAAAnga.lavajAAAAAAAAAAnga.lavajAAAAAAAAAAnga.lavajAAAAAAAAAAnga.lavajAAAAAAAAAAnga.lavajAAAAAAAAAAnga.lavajAAAAAAAAAAnga.lavajAAAAAAAAAAnga.lavajAAAAAAAAAAnga.lavajAAAAAAAAAAnga.lavajAAAAAAAAAAnga.lavajAAAAAAAAAAnga.lavajAAAAAAAAAAnga.lavajAAAAAAAAAAnga.lavajAAAAAAAAAAnga.lavajAAAAAAAAAAnga.lavajAAAAAAAAAAnga.lavajAAAAAAAAAAnga.lavajAAAAAAAAAAnga.lavajAAAAAAAAAAnga.lavajAAAAAAAAAAnga.lavajAAAAAAAAAAnga.lavajAAAAAAAAAAnga.lavajAAAAAAAAAAnga.lavajAAAAAAAAAAnga.lavajAAAAAAAAAAnga.lavajAAAAAAAAAAnga.lavajAAAAAAAAAA                                                                                                                                                                                                                                                                         " + "'", str17, "AAAAAAAAAAnga.lavajAAAAAAAAAAnga.lavajAAAAAAAAAAnga.lavajAAAAAAAAAAnga.lavajAAAAAAAAAAnga.lavajAAAAAAAAAAnga.lavajAAAAAAAAAAnga.lavajAAAAAAAAAAnga.lavajAAAAAAAAAAnga.lavajAAAAAAAAAAnga.lavajAAAAAAAAAAnga.lavajAAAAAAAAAAnga.lavajAAAAAAAAAAnga.lavajAAAAAAAAAAnga.lavajAAAAAAAAAAnga.lavajAAAAAAAAAAnga.lavajAAAAAAAAAAnga.lavajAAAAAAAAAAnga.lavajAAAAAAAAAAnga.lavajAAAAAAAAAAnga.lavajAAAAAAAAAAnga.lavajAAAAAAAAAAnga.lavajAAAAAAAAAAnga.lavajAAAAAAAAAAnga.lavajAAAAAAAAAAnga.lavajAAAAAAAAAAnga.lavajAAAAAAAAAAnga.lavajAAAAAAAAAAnga.lavajAAAAAAAAAAnga.lavajAAAAAAAAAAnga.lavajAAAAAAAAAAnga.lavajAAAAAAAAAAnga.lavajAAAAAAAAAAnga.lavajAAAAAAAAAAnga.lavajAAAAAAAAAAnga.lavajAAAAAAAAAA                                                                                                                                                                                                                                                                         ");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test38207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest76.test38207");
        char[] charArray15 = new char[] { ' ', ' ', '#', 'a', '4', 'a' };
        int int16 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "", charArray15);
        boolean boolean17 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "......", charArray15);
        int int18 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "                                                                                                    ", charArray15);
        int int19 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "avaj.gnal", charArray15);
        boolean boolean20 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "", charArray15);
        boolean boolean21 = org.apache.commons.lang3.StringUtils.containsAny("javaStringnalArrayListArrayListArrayListavaj.gnalArrayListArrayListArrayLi", charArray15);
        int int22 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "444       AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA", charArray15);
        int int23 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "AVAJGNALjavajavajavajavajavajavajavgnal                                                                ", charArray15);
        boolean boolean24 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "yli", charArray15);
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
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 9 + "'", int23 == 9);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
    }

    @Test
    public void test38208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest76.test38208");
        int int3 = org.apache.commons.lang3.StringUtils.ordinalIndexOf("hi!", "Arra", 84);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test38209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest76.test38209");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.contains("hi!ArrayListArrayListArrayListavaj....1AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA...1AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA...1AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA...1AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA...1AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA...1AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA...1AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA...1AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA...1AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAJava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.lang", 275);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test38210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest76.test38210");
        char[] charArray6 = new char[] {};
        int int7 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "$       ", charArray6);
        boolean boolean8 = org.apache.commons.lang3.StringUtils.containsAny("INTERFACE JAVA.LANG.cLONEABLE.......JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVAINTERFACE JAVA.IO.sERIALIZABLE", charArray6);
        boolean boolean9 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "...       AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA", charArray6);
        boolean boolean10 = org.apache.commons.lang3.StringUtils.containsAny("JAVAAAAAAAAAAVA.LA..", charArray6);
        boolean boolean11 = org.apache.commons.lang3.StringUtils.containsAny("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa...", charArray6);
        boolean boolean12 = org.apache.commons.lang3.StringUtils.containsAny("                                  $$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$", charArray6);
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
    public void test38211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest76.test38211");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isBlank((java.lang.CharSequence) "vaj");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test38212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest76.test38212");
        java.lang.CharSequence charSequence0 = null;
        java.lang.CharSequence charSequence2 = org.apache.commons.lang3.StringUtils.defaultIfBlank(charSequence0, (java.lang.CharSequence) "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertEquals("'" + charSequence2 + "' != '" + "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa" + "'", charSequence2, "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
    }

    @Test
    public void test38213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest76.test38213");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOf("java.litu.avajlitu.avajjava.litu.avajlitu.avajjava.litu.avajlitu.avajjava.litu.avajlitu.avajjava.litu.avajlitu.avajjava.litu.avajlitu.avajjava.litu.avajlitu.avajjava.litu.avajlitu.avajjava.litu.avajlitu.avajjava.litu.avajlitu.avajjava.litu.avajlitu.avajjava.litu.avajlitu.avajjava.litu.avajlitu.avajjava.litu.avajlitu.avajjava.litu.avajlitu.avajjava.litu.avajlitu.avajjava.litu.avajlitu.avajjava.litu.avajlitu.avajjava.litu.avajlitu.avajjava.litu.avajlitu.avajjava.litu.avajlitu.avajjava.litu.avajlitu.avajjava.litu.avajlitu.avajjava.litu.avajlitu.avajjava.litu.avajlitu.avajjava.litu.avajlitu.avajjava.litu.avajlitu.avajjava.litu.avajlitu.avajjava.litu.avajlitu.avajjava.litu.avajlitu.avajjava.litu.avajlitu.avajjava.litu.avajlitu.avajjava.litu.avajlitu.avaj", "                                                                 ");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test38214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest76.test38214");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.strip("interfacejava.lang.CloneableString[]Strijavaulang[]String[]interfacejava.io");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "interfacejava.lang.CloneableString[]Strijavaulang[]String[]interfacejava.io" + "'", str1, "interfacejava.lang.CloneableString[]Strijavaulang[]String[]interfacejava.io");
    }

    @Test
    public void test38215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest76.test38215");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substring("", 51);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test38216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest76.test38216");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.contains("javastring..", 3);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test38217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest76.test38217");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.abbreviateMiddle("a..AYL A.44444444444444444444444444                                 ARRAa..AYL A.44444444444444444444444444                                 SILa..AYL A.44444444444444444444444444                                 ARRAa..AYL A.44444444444444444444444444                                 SILa..AYL A.44444444444444444444444444                                 ARRA", "                      444444444444444444444avaj1-44444444444444444444                     ", 149);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "a..AYL A.444444444444444444444                      444444444444444444444avaj1-44444444444444444444                                              ARRA" + "'", str3, "a..AYL A.444444444444444444444                      444444444444444444444avaj1-44444444444444444444                                              ARRA");
    }

    @Test
    public void test38218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest76.test38218");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.contains("RARJAVAARRARJAVAARRARJAVAARRARJAVAARRARJAVAARRARJAVAARRARJAVAARRARJAVAARRARJAVAARRARJAVAARRARJAVAARRARJAVAARRARJAVAARRARJAVAARRARJAVAARRARJAVAARRARJAVAARRARJAVAARRARJAVAARRARJAVAARRARJAVAARRARJAVAARRARJAVAARRARJAVAARRARJAVAARRARJAVAARRARJAVAARRARJAVAARRARJAVAARRARJAVAARRARJAVAARRARJAVAARRARJAVAARRARJAVAARRARJAVAARRARJAVAARRARJAVAARRARJAVAARRARJAVAARRARJAVAARRARJAVAARRARJAVAARRARJAVAARRARJAVAARRARJAVAARRARJAVAARRARJAVAARRARJAVAARRARJAlass java.lang.Strin", 472);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test38219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest76.test38219");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.substring("interface java.lang.Cloneable.......java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........jav...", 66, 723);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "va..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........jav..." + "'", str3, "va..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........jav...");
    }

    @Test
    public void test38220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest76.test38220");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.center("                                                                 AtsiLytcejbOlvjsslcrrAtsiLytcejbO.gnal.avaj ssalcrrAva.langGNAL..langjava.langAGNAL.AVAJ", (int) (short) 10);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                                                 AtsiLytcejbOlvjsslcrrAtsiLytcejbO.gnal.avaj ssalcrrAva.langGNAL..langjava.langAGNAL.AVAJ" + "'", str2, "                                                                 AtsiLytcejbOlvjsslcrrAtsiLytcejbO.gnal.avaj ssalcrrAva.langGNAL..langjava.langAGNAL.AVAJ");
    }

    @Test
    public void test38221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest76.test38221");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceChars("4444444444444444444444444444444444444444444444444444444444444444444444444444444rclassjava.lang.O..", '#', ' ');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "4444444444444444444444444444444444444444444444444444444444444444444444444444444rclassjava.lang.O.." + "'", str3, "4444444444444444444444444444444444444444444444444444444444444444444444444444444rclassjava.lang.O..");
    }

    @Test
    public void test38222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest76.test38222");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("...$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$...", "AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA");
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test38223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest76.test38223");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNotBlank((java.lang.CharSequence) "       Arrclass java......................Arrclass java......................ArtringArrclass java......................Arrclass java......................Ar        ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test38224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest76.test38224");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.uncapitalize((java.lang.CharSequence) "A.LANG.cLONEABLEsTRINGINTERFACE JAVA.IO");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "a.LANG.cLONEABLEsTRINGINTERFACE JAVA.IO" + "'", str1, "a.LANG.cLONEABLEsTRINGINTERFACE JAVA.IO");
    }

    @Test
    public void test38225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest76.test38225");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeEnd("                                                               ", "                       REGETNi                      ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                                               " + "'", str2, "                                                               ");
    }

    @Test
    public void test38226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest76.test38226");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphanumericSpace((java.lang.CharSequence) "...java..........java..classjavalangClassJAVAULANGJAVAULANGJAVAULANGJAVAULANGJAVAULANGJAVAULANGJAVAULANGJAVAULANGJ444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444lituavajli...java..........java..classjavalangClassJAVAULANGJAVAULANGJAVAULANGJAVAULANGJAVAULANGJAVAULANGJAVAULANGJAVAULANGJA");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test38227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest76.test38227");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOf("A..AYL A.44444444444444444444444444", 315, 477);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test38228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest76.test38228");
        java.lang.String[] strArray6 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("...", "avaj.gnal", (int) 'a');
        boolean boolean7 = org.apache.commons.lang3.StringUtils.startsWithAny("", strArray6);
        int int8 = org.apache.commons.lang3.StringUtils.indexOfAny("java.lang", strArray6);
        int int9 = org.apache.commons.lang3.StringUtils.indexOfAny("hi!ArrayListArrayListArrayListavaj.gnalArrayListArrayListArrayListavaj.gnalArrayListArrayListArrayLi", strArray6);
        java.lang.String str11 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray6, "rLLryLiyyALLryLiyyALLryLiyyrrrALrAriiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiAv");
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "..." + "'", str11, "...");
    }

    @Test
    public void test38229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest76.test38229");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.center(".......", 167);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                                                                .......                                                                                " + "'", str2, "                                                                                .......                                                                                ");
    }

    @Test
    public void test38230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest76.test38230");
        java.lang.Object obj0 = null;
        java.lang.String str2 = org.apache.commons.lang3.ClassUtils.getShortCanonicalName(obj0, "hI!aRRAYlIShI!aRRAYlIShI!aRRAYlIShI!aRRAYlIShI!aRRAYlIShI!aRRAYlIShI!aRRAYlIShI!aRRAYlIShI!aRRAYlIShI!aRRAYlIShI!aRRAYlIShI!aRRAYlIShI!aRRAYlIShI!aRRAYlIShI!aRRAYlIShI!aRRAYlIShI!aRRAYlIShI!aRRAYlIShI!aRRAYlIShI!aRRAYlIShI!aRRAYlIShI!aRRAYlIShI!aRRAYlIShI!aRRAYlIShI!aRRAYlIShI!aRRAYlIShI!aRRAYlIShI!aRRAYlIShI!aRRAYlIShI!aRRAYlIShI!aRRAYlIShI!aRRAYlIShI!aRRAYlIShI!aRRAYlIShI!aRRAYlIShI!aRRAYlIShI!aRRAYlIShI!aRRAYlIShI!aRRAYlIShI!aRRAYlIShI!aRRAYlIShI!aRRAYlIShI!aRRAYlIShI!aRRAYlIShI!aRRAYlIShI!aRRAYlIShI!aRRAYlIS");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hI!aRRAYlIShI!aRRAYlIShI!aRRAYlIShI!aRRAYlIShI!aRRAYlIShI!aRRAYlIShI!aRRAYlIShI!aRRAYlIShI!aRRAYlIShI!aRRAYlIShI!aRRAYlIShI!aRRAYlIShI!aRRAYlIShI!aRRAYlIShI!aRRAYlIShI!aRRAYlIShI!aRRAYlIShI!aRRAYlIShI!aRRAYlIShI!aRRAYlIShI!aRRAYlIShI!aRRAYlIShI!aRRAYlIShI!aRRAYlIShI!aRRAYlIShI!aRRAYlIShI!aRRAYlIShI!aRRAYlIShI!aRRAYlIShI!aRRAYlIShI!aRRAYlIShI!aRRAYlIShI!aRRAYlIShI!aRRAYlIShI!aRRAYlIShI!aRRAYlIShI!aRRAYlIShI!aRRAYlIShI!aRRAYlIShI!aRRAYlIShI!aRRAYlIShI!aRRAYlIShI!aRRAYlIShI!aRRAYlIShI!aRRAYlIShI!aRRAYlIShI!aRRAYlIS" + "'", str2, "hI!aRRAYlIShI!aRRAYlIShI!aRRAYlIShI!aRRAYlIShI!aRRAYlIShI!aRRAYlIShI!aRRAYlIShI!aRRAYlIShI!aRRAYlIShI!aRRAYlIShI!aRRAYlIShI!aRRAYlIShI!aRRAYlIShI!aRRAYlIShI!aRRAYlIShI!aRRAYlIShI!aRRAYlIShI!aRRAYlIShI!aRRAYlIShI!aRRAYlIShI!aRRAYlIShI!aRRAYlIShI!aRRAYlIShI!aRRAYlIShI!aRRAYlIShI!aRRAYlIShI!aRRAYlIShI!aRRAYlIShI!aRRAYlIShI!aRRAYlIShI!aRRAYlIShI!aRRAYlIShI!aRRAYlIShI!aRRAYlIShI!aRRAYlIShI!aRRAYlIShI!aRRAYlIShI!aRRAYlIShI!aRRAYlIShI!aRRAYlIShI!aRRAYlIShI!aRRAYlIShI!aRRAYlIShI!aRRAYlIShI!aRRAYlIShI!aRRAYlIShI!aRRAYlIS");
    }

    @Test
    public void test38231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest76.test38231");
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.split("lang.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.1aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaajava.1aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa.1aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa.1aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa.1aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa.1aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa.1aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa.1aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa.1aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa.hi!arraylistarraylistarraylis", "...$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$...", 954);
        java.lang.String[] strArray8 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("                                                                                            ", "-1A.A.Auti.StriAj-1A.A.Auti.StriAj", 7);
        java.lang.String[] strArray10 = org.apache.commons.lang3.StringUtils.stripAll(strArray8, "L.Arr#yListgnaljava..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java.........");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str11 = org.apache.commons.lang3.StringUtils.replaceEachRepeatedly("                                                                                           ", strArray4, strArray10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Search and Replace array lengths don't match: 20 vs 1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertNotNull(strArray10);
    }

    @Test
    public void test38232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest76.test38232");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBeforeLast("AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA", "###################################################################################################################################################################################################################################################################################################################################################################################################################################################################################..........a       ..");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA" + "'", str2, "AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA");
    }

    @Test
    public void test38233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest76.test38233");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceOnce("JAVA#############################################################################################", "444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444litu avajli", "CLASSSLITUGNIRTSSLITUGNIRTSSLITUGNIRTSSLITUGNIRTSSLITUGNIRTSSLITUGNIRTinterfacegaga.lang.CloneableAAAAAAAAAAgagal.agnAAAAAAAAAAgagal.agnAAAAAAAAAAgagal.agnAAAAAAAAAAgagal.agnAAAAAAAAAAgagal.agnAAAAAAAAAAgagal.agnAAAAAAAAAAgagal.agnAAAAAAAAAAgagal.agnAAAAAAAAAAgagal.agnAAAAAAAAAAgagal.agnAAAAAAAAAAgagal.agnAAAAAAAAAAgagal.agnAAAAAAAAAAgagal.agnAAAAAAAAAAgagal.agnAAAAAAAAAAgagal.agnAAAAAAAAAAgagal.agnAAAAAAAAAAgagal.agnAAAAAAAAAAgagal.agnAAAAAAAAAAgagal.agnAAAAAAAAAAgagal.agnAAAAAAAAAAgagal.agnAAAAAAAAAAgagal.agnAAAAAAAAAAgagal.agnAAAAAAAAAAgagal.agnAAAAAAAAAAgagal.agnAAAAAAAAAAgagal.agnAAAAAAAAAAgagal.agnAAAAAAAAAAgagal.agnAAAAAAAAAAgagal.agnAAAAAAAAAAgagal.agnAAAAAAAAAAgagal.agnAAAAAAAAAAgagal.agnAAAAAAAAAAgagal.agnAAAAAAAAAAgagal.agnAAAAAAAAAAgagal.agnAAAAAAAAAAringinterfacegaga");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "JAVA#############################################################################################" + "'", str3, "JAVA#############################################################################################");
    }

    @Test
    public void test38234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest76.test38234");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.containsWhitespace("tu]tu");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test38235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest76.test38235");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringAfter("interf ce      l ng Clone ble$interf ce      io Seri liz ble", "NAL");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test38236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest76.test38236");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.defaultString("                                              ][gnirtslitu.avaj1-");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "                                              ][gnirtslitu.avaj1-" + "'", str1, "                                              ][gnirtslitu.avaj1-");
    }

    @Test
    public void test38237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest76.test38237");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceChars("                                                                       JAVAsTRIN                                                                        ", '.', '4');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "                                                                       JAVAsTRIN                                                                        " + "'", str3, "                                                                       JAVAsTRIN                                                                        ");
    }

    @Test
    public void test38238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest76.test38238");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeStartIgnoreCase("gn gnal.avajgn gnal.avajgn gnal.avINTERFACEJAVA.LANG.CLONEABLESTRINGINTERFACEJAVAaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "                                                                                                                                                                                                                                         REGETNi");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "gn gnal.avajgn gnal.avajgn gnal.avINTERFACEJAVA.LANG.CLONEABLESTRINGINTERFACEJAVAaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa" + "'", str2, "gn gnal.avajgn gnal.avajgn gnal.avINTERFACEJAVA.LANG.CLONEABLESTRINGINTERFACEJAVAaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
    }

    @Test
    public void test38239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest76.test38239");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAsciiPrintable((java.lang.CharSequence) "###########################################################################################################################################gn gnal.avaj");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test38240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest76.test38240");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceOnce("y..............................ObjectyList..............................", "java.langAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA", "                                                                                                                                                                                      4444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444aaaaaaaaaa                                                                                                                                                                                      ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "y..............................ObjectyList.............................." + "'", str3, "y..............................ObjectyList..............................");
    }

    @Test
    public void test38241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest76.test38241");
        int int3 = org.apache.commons.lang3.StringUtils.ordinalIndexOf(".AVAJ.AVAJ.AVAJ.AVAJ.AVAJ.AVAJ.AVAJ.AVAJ.AVAJ.AVAJ.AVAJ.AVAJ.AVAJ.AVAJ.AVAJ.AVAJ.AVAJ.AVAJ.AVAJ.AVAJ.AVAJ.AVAJ.AVAJ.AVAJ.AVAJ.AVAJ.AVAJ.AVAJ.AVAJ.AVAJ.AVAJ.AVAJ.AVAJ.AVAJ.AVAJ.AVAJ.AVAJ.AVAJ.AVAJ.AVAJ.AVAJ.AVAJ.AVAJ.AVAJ.AVAJ", "", 331);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test38242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest76.test38242");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripToNull("INTERFACE JAVA.LANG.cLONEABLE$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$INTERFACE JAVA.IO.sERIALIZABLE");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "INTERFACE JAVA.LANG.cLONEABLE$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$INTERFACE JAVA.IO.sERIALIZABLE" + "'", str1, "INTERFACE JAVA.LANG.cLONEABLE$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$INTERFACE JAVA.IO.sERIALIZABLE");
    }

    @Test
    public void test38243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest76.test38243");
        java.lang.String[] strArray1 = null;
        java.lang.String[] strArray2 = null;
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceEachRepeatedly("                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                 int", strArray1, strArray2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                 int" + "'", str3, "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                 int");
    }

    @Test
    public void test38244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest76.test38244");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("JAVAULANG", "              Integer              ", (int) (short) 100);
        java.lang.String str5 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray3, ' ');
        java.lang.String[] strArray6 = org.apache.commons.lang3.StringUtils.stripAll(strArray3);
        int int7 = org.apache.commons.lang3.StringUtils.indexOfDifference((java.lang.CharSequence[]) strArray6);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "JAVAULANG" + "'", str5, "JAVAULANG");
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
    }

    @Test
    public void test38245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest76.test38245");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsAny("... ... ... ... ... ... ... ... ...", "INTERFACEJAVA.LANG.CLONEABLEINTERFACEJAVA.LANG.CLONEABLELANG.GNALJAVA.LANGAVAJ.GNALJAVA.LANGAVAJ.GNALJAVA.LANGAVAJ.GNALJAVA.LANGAVAJ.GNALJAVA.LANGAVAJ.GNALJAVA.LANGAVAJ.GNALJAVA.LANGAVAJ.GNALJAVA.LANGAVAJ.JAVAINTERFACEJAVA.IO.SERIALIZABLEINTERFACEJAVA.IO");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test38246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest76.test38246");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByCharacterType("####");
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray3, "", 11, (int) (byte) 10);
        java.lang.String[] strArray10 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("AAAAAAAAAA", "javaStrin");
        java.lang.String str11 = org.apache.commons.lang3.StringUtils.replaceEach("interface java.lang.CloneableString[]String[]String[]String[]String[]String[]String[]String[]String[]String[]String[]String[]String[]String[]String[]String[]String[]String[]String[]String[]String[]String[]String[]String[]String[]String[]String[]String[]String[]String[]String[]String[]String[]String[]String[]String[]String[]String[]String[]String[]String[]String[]String[]String[]String[]String[]String[]String[]String[]String[]String[]String[]String[]String[]String[]String[]String[]String[]String[]String[]String[]String[]String[]String[]String[]String[]String[]interface java.io.Serializable", strArray3, strArray10);
        java.lang.String[] strArray15 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("atsiLytcejbO.gnal.avaj ssalcrrAtsiLytcejbO.gnal.avaj ssalcrrAva.langGNAL..langjava.langAGNAL.AVAJAtsiLytcejbO.gnal.avaj ssalcrLj ssalcrrAva.langGNAL..langjava.langAGNAL.AVAJAtsiLytcejbO.gnal.avaj ssalcrrAtsiLytcejbO.gnal.avaj ssalcrrAva.langGNAL..langjava.langAGNAL.AVAJAtsiLytcejbO.gnal.avaj ssalcrrAtsiLytcejStringAtsiLytcejbO.gnal.avaj ssalcrrAtsiLytcejbO.gnal.avaj ssalcrrAva.langGNAL..langjava.langAGNAL.AVAJAtsiLytcejbO.gnal.avaj ssalcrrAtsiLytcejbO.gnal.avaj ssalcrrAva.langGNAL..langjava.langAGNAL.AVAJAtsiLytcejbO.gnal.avaj ssalcrrAtsiLytcejbO.gnal.avaj ssalcrrAva.langGNAL..langjava.langAGNAL.AVAJAtsiLytcejbO.gnal.avaj ssalcrrAtsiLytcejb", "Arrcls...", 655);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str16 = org.apache.commons.lang3.StringUtils.replaceEach("iLyarrAtsiLyarrAtsiLyarrAlang.javatsiLyarrAtsiLyarrAtsiAAAAAAAAAAngag", strArray10, strArray15);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Search and Replace array lengths don't match: 1 vs 252");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(strArray10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "interface java.lang.CloneableString[]String[]String[]String[]String[]String[]String[]String[]String[]String[]String[]String[]String[]String[]String[]String[]String[]String[]String[]String[]String[]String[]String[]String[]String[]String[]String[]String[]String[]String[]String[]String[]String[]String[]String[]String[]String[]String[]String[]String[]String[]String[]String[]String[]String[]String[]String[]String[]String[]String[]String[]String[]String[]String[]String[]String[]String[]String[]String[]String[]String[]String[]String[]String[]String[]String[]String[]interface java.io.Serializable" + "'", str11, "interface java.lang.CloneableString[]String[]String[]String[]String[]String[]String[]String[]String[]String[]String[]String[]String[]String[]String[]String[]String[]String[]String[]String[]String[]String[]String[]String[]String[]String[]String[]String[]String[]String[]String[]String[]String[]String[]String[]String[]String[]String[]String[]String[]String[]String[]String[]String[]String[]String[]String[]String[]String[]String[]String[]String[]String[]String[]String[]String[]String[]String[]String[]String[]String[]String[]String[]String[]String[]String[]String[]interface java.io.Serializable");
        org.junit.Assert.assertNotNull(strArray15);
    }

    @Test
    public void test38247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest76.test38247");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.swapCase("va.langjava.langjava.lang...       ....       .java.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.lang...       ....       .");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "VA.LANGJAVA.LANGJAVA.LANG...       ....       .JAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANG...       ....       ." + "'", str1, "VA.LANGJAVA.LANGJAVA.LANG...       ....       .JAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANG...       ....       .");
    }

    @Test
    public void test38248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest76.test38248");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.remove("GNALUAVAJ                       GNALUAVAJ                       SSALCGNALAVAJavajlitu", '.');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "GNALUAVAJ                       GNALUAVAJ                       SSALCGNALAVAJavajlitu" + "'", str2, "GNALUAVAJ                       GNALUAVAJ                       SSALCGNALAVAJavajlitu");
    }

    @Test
    public void test38249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest76.test38249");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsIgnoreCase("AtsiLytcejbO.gnal.avaj ssalcrrAtsiLytcejbO.gnal.avaj ssalcrrAva.langGNAL..langjava.langAGNAL.AVAJAtsiLytcejbO.gnal.avaj ssalcrrAtsiLytcejbO.gnal.avaj ssalcrrAva.langGNAL..langjava.langAGNAL.AVAJAtsiLytcejbO.gnal.avaj ssalcrrAtsiLytcejbO.gnal.avaj ssalcrrAva.langGNAL..langjava.langAGNAL.AVAJAtsiLytcejbO.gnal.avaj ssalcrrAtsiLytcejStringAtsiLytcejbO.gnal.avaj ssalcrrAtsiLytcejbO.gnal.avaj ssalcrrAva.langGNAL..langjava.langAGNAL.AVAJAtsiLytcejbO.gnaaaaaa...", "...larra...");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test38250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest76.test38250");
        char[] charArray15 = new char[] { ' ', ' ', '#', 'a', '4', 'a' };
        int int16 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "", charArray15);
        boolean boolean17 = org.apache.commons.lang3.StringUtils.containsAny("......", charArray15);
        int int18 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "AAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAA", charArray15);
        int int19 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "JAVA.LANGAVAJ.GNALJAVA.LANGAVAJ.GNALJAVA.LANGAVAJ.GNALJAVA.LANGAVAJ.GNALJAVA.LANGAVAJ.GNALJAVA.LANGAVAJ.GNALJAVA.LANGAVAJ.GNALJAVA.LANGAVAJ.GNALJAVA.LANG", charArray15);
        boolean boolean20 = org.apache.commons.lang3.StringUtils.containsAny("gnal.avajgnal..LANGgnal.avajgnal.", charArray15);
        boolean boolean21 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "AVAJ.GNAL", charArray15);
        boolean boolean22 = org.apache.commons.lang3.StringUtils.containsAny("java.litu.avajlitu.avajjava.litu.avajlitu.avajjava.litu.avajlitu.avajjava.litu.avajlitu.avajjava.litu.avajlitu.avajjava.litu.avajlitu.avajjava.litu.avajlitu.avajjava.litu.avajlitu.avajjava.litu.avajlitu.avajjava.litu.avajlitu.avajjava.litu.avajlitu.avajjava.litu.avajlitu.avajjava.litu.avajlitu.avajjava.litu.avajlitu.avajjava.litu.avajlitu.avajjava.litu.avajlitu.avajjava.litu.avajlitu.avajjava.litu.avajlitu.avajjava.litu.avajlitu.avajjava.litu.avajlitu.avajjava.litu.avajlitu.avajjava.litu.avajlitu.avajjava.litu.avajlitu.avajjava.litu.avajlitu.avajjava.litu.avajlitu.avajjava.litu.avajlitu.avajjava.litu.avajlitu.avajjava.litu.avajlitu.avajjava.litu.avajlitu.avajjava.litu.avajlitu.avajjava.litu.avajlitu.avajjava.litu.avajlitu.avajjava.litu.avajlitu.avaj", charArray15);
        int int23 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "nAL.AVAJ", charArray15);
        boolean boolean24 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "                                            ..", charArray15);
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
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + (-1) + "'", int23 == (-1));
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
    }

    @Test
    public void test38251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest76.test38251");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfIgnoreCase("AAAA                       JAVAULANGvvayLasinterface java.lang.Cloneable.......java.......Objectava..........javainterface java.io.Serializable##################################################", "char[]INTERFACEJAVA.LANG.cLONEABLEsTRINGINTERFACEJAVA.IO");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test38252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest76.test38252");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("h!ArrayLstArrayLstArrayLstavaj", '#');
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test38253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest76.test38253");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBefore(".lang.Stringclass j...                                                                                                                                                                                                                                                                                                                                                                                                                                                                                   ", "44444444444444444444444444444444444444444444444444444444444444444444444444444444         ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + ".lang.Stringclass j...                                                                                                                                                                                                                                                                                                                                                                                                                                                                                   " + "'", str2, ".lang.Stringclass j...                                                                                                                                                                                                                                                                                                                                                                                                                                                                                   ");
    }

    @Test
    public void test38254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest76.test38254");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeStart("                                                                                                                                                  4444444", "arrayListArrayListArrayListavaj                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                               ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                                                                                                                                  4444444" + "'", str2, "                                                                                                                                                  4444444");
    }

    @Test
    public void test38255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest76.test38255");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                     ArrayListArrayListArrayListavajagnal", "a                                                                                                                                                                                                                                                                                                                                                                                                                                                              ");
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test38256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest76.test38256");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444interface java.lang.Cloneable4iGNIRTinterface java.lang.Cloneable4i444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.concat((java.lang.Object[]) strArray1);
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444interfacejava.lang.Cloneable4iGNIRTinterfacejava.lang.Cloneable4i444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444" + "'", str2, "444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444interfacejava.lang.Cloneable4iGNIRTinterfacejava.lang.Cloneable4i444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444");
    }

    @Test
    public void test38257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest76.test38257");
        int int2 = org.apache.commons.lang3.StringUtils.indexOf("aa...                                                                                                                                   ", 217);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test38258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest76.test38258");
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
        java.lang.String str82 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) wildcardClassArray36, "NTERFACE JAVA.LANG.cLONEABLE.......JAVA..........JAVA..........JAVA..........JAVA..........JA...");
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
        org.junit.Assert.assertEquals("'" + str82 + "' != '" + "class java.lang.String" + "'", str82, "class java.lang.String");
    }

    @Test
    public void test38259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest76.test38259");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsAny("", "......................................................................................................................................................................................................................................................................................................................................................................................................................................................................stJAVAGNAL                                                           ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test38260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest76.test38260");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.split("                                                                                                                                                                                                                                                                                                                                                                                                                                JAVA.LANGAgnal.avajgnal..LANGgnal.avArrclass java.lang.ObjectyListAr...", "...rgnaluavajtutututututut...utiljava.", 717);
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void test38261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest76.test38261");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAllUpperCase((java.lang.CharSequence) "interfacejava.lang.CloneableINTERFACEJAVA.LANG.CLONEABLELANG.GNALJAVA.LANGAVAJ.GNALJAVA.LANGAVAJ.GNALJAVA.LANGAVAJ.GNALJAVA.LANGAVAJ.GNALJAVA.LANGAVAJ.GNALJAVA.LANGAVAJ.GNALJAVA.LANGAVAJ.GNALJAVA.LANGAVAJ.JAVAINTERFACEJAVA.IO.SERIALIZABLEinterfacejava.io.Serializable");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test38262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest76.test38262");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.leftPad("LANGALANGALANGALANGALANGALANGALANGALANGALANGALANGALANGALANGALANGALANGALANGALANGALANGALANGALANGALANGALANGALANGALANGALANGALANGALANGALANGALANGALANGALANGALANGALANGALANGALANGALANGALANGALANGALANGALANGALANGALANGALANGALANGALANGALANGALANGALANGALANGALANGALANGALANGALANGALANGALANGALANGALANGALANGALANGALANGALANGALANGALANGALANGALANGALANGALANGALANGALANGALANGALANGALANGALANGALANGALANGA", 0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "LANGALANGALANGALANGALANGALANGALANGALANGALANGALANGALANGALANGALANGALANGALANGALANGALANGALANGALANGALANGALANGALANGALANGALANGALANGALANGALANGALANGALANGALANGALANGALANGALANGALANGALANGALANGALANGALANGALANGALANGALANGALANGALANGALANGALANGALANGALANGALANGALANGALANGALANGALANGALANGALANGALANGALANGALANGALANGALANGALANGALANGALANGALANGALANGALANGALANGALANGALANGALANGALANGALANGALANGALANGALANGA" + "'", str2, "LANGALANGALANGALANGALANGALANGALANGALANGALANGALANGALANGALANGALANGALANGALANGALANGALANGALANGALANGALANGALANGALANGALANGALANGALANGALANGALANGALANGALANGALANGALANGALANGALANGALANGALANGALANGALANGALANGALANGALANGALANGALANGALANGALANGALANGALANGALANGALANGALANGALANGALANGALANGALANGALANGALANGALANGALANGALANGALANGALANGALANGALANGALANGALANGALANGALANGALANGALANGALANGALANGALANGALANGALANGALANGA");
    }

    @Test
    public void test38263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest76.test38263");
        int int2 = org.apache.commons.lang3.StringUtils.indexOf("aVAJ.GNALAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA CharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterChara", 93);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test38264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest76.test38264");
        java.lang.String str1 = org.apache.commons.lang3.ClassUtils.getPackageCanonicalName("                                                                                                                                                                                                                                                                                                                                                        ArryListArryListArryListvjGNAL.AVAJLANG.JAVAGNAL.AVAJLANG.JAVAGNAL.AVAJLANG.JAVAGNAL.AVAJLANG.JAVAGNAL.AVAJLANG.JAVAGNAL.AVAJLANG.JAVAGNAL.AVAJLANG.JAVAGNAL.AVAJLANG.JAVAGNAL.AVAJgnl                                                                                                                                                                                                                                                                                                                                                                                           ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "ArryListArryListArryListvjGNAL.AVAJLANG.JAVAGNAL.AVAJLANG.JAVAGNAL.AVAJLANG.JAVAGNAL.AVAJLANG.JAVAGNAL.AVAJLANG.JAVAGNAL.AVAJLANG.JAVAGNAL.AVAJLANG.JAVAGNAL.AVAJLANG.JAVAGNAL" + "'", str1, "ArryListArryListArryListvjGNAL.AVAJLANG.JAVAGNAL.AVAJLANG.JAVAGNAL.AVAJLANG.JAVAGNAL.AVAJLANG.JAVAGNAL.AVAJLANG.JAVAGNAL.AVAJLANG.JAVAGNAL.AVAJLANG.JAVAGNAL.AVAJLANG.JAVAGNAL");
    }

    @Test
    public void test38265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest76.test38265");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.leftPad("etyBetyBetyBetyBetyBetyBAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA...etyBetyBetyBetyBetyBetyBestststststststststststststststststststststststststststststststststststststststststststststststststststststststststststs", 78);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "etyBetyBetyBetyBetyBetyBAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA...etyBetyBetyBetyBetyBetyBestststststststststststststststststststststststststststststststststststststststststststststststststststststststststststs" + "'", str2, "etyBetyBetyBetyBetyBetyBAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA...etyBetyBetyBetyBetyBetyBestststststststststststststststststststststststststststststststststststststststststststststststststststststststststststs");
    }

    @Test
    public void test38266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest76.test38266");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("...       ", "hi!", (int) (byte) 0);
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray3);
        java.lang.String str6 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray3, "");
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "...       " + "'", str4, "...       ");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "...       " + "'", str6, "...       ");
    }

    @Test
    public void test38267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest76.test38267");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlpha((java.lang.CharSequence) "Arrclass java......................VAgnal.avajgnal.avajgnal.avajgnal.avajgnal.avajgn");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test38268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest76.test38268");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("Arralitu.avajlitu.avaj");
        java.lang.Class<?>[] wildcardClassArray2 = org.apache.commons.lang3.ClassUtils.toClass((java.lang.Object[]) strArray1);
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertNotNull(wildcardClassArray2);
    }

    @Test
    public void test38269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest76.test38269");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphanumeric((java.lang.CharSequence) "aaaa......");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test38270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest76.test38270");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphanumericSpace((java.lang.CharSequence) "byte...aaaaaaaaj v aaaaaaaaaaj v aaaaaaaaaaj v interf ceaj v aioaseri liz ble");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test38271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest76.test38271");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.remove("jv..........jv..........jv4444444444..                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                    ", '4');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "jv..........jv..........jv..                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                    " + "'", str2, "jv..........jv..........jv..                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                    ");
    }

    @Test
    public void test38272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest76.test38272");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass2 = org.apache.commons.lang3.ClassUtils.getClass("...44444...", false);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassNotFoundException; message: ///44444///");
        } catch (java.lang.ClassNotFoundException e) {
            // Expected exception.
        }
    }

    @Test
    public void test38273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest76.test38273");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBetween("LANGgn lgn lgn lgn lgn lgn lgn lgn lgn lgn lgn lgn lgn lgn lgn lgn lgn lgn lgn lgn lgn lgn lgn lgn lgn lgn lgn lgn lgn lgn lgn lgn lgn lgn lgn lgn lgn lgn lgn lgn lgn lgn lgn lgn lgn lgn lgn lgn lgn lgn lgn lgn lgn lgn lgn lgn lgn lgn lgn lgn lgn lgn lgn lgn lgn lgn lgn lgn lgn lgn lgn lgn lgn lgn lgn lgn lgn lgn lgn lgn lgn lgn lgn lgn lgn lgn lgn lgn lgn lgn lgn lgn lgn lgn lgn lgn lgn lgn lgn lgn lgn lgn lgn lgn lgn lgn lgn lgn lgn lgn lgn lg", "                                hi!arraylis       $         $         $         $         $         $         $         $         $         $         $         $         $         $         $         $         $         $         $         $         $         $         $                                ");
        org.junit.Assert.assertNull(str2);
    }

    @Test
    public void test38274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest76.test38274");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.startsWith("", "#######################vj.gn vj.gn vj.gn #######################");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test38275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest76.test38275");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("######################################################################");
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test38276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest76.test38276");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.rightPad("...44444...", 935, "JAVAsTRINJAVAsTRINJAVAsTRINJAVAsTRINJAVAsTRINJAVAsTRINJAVAsTRINJAVAsTRINJAVAsTRINJAVAsTRINJAVAsTRINJAVAsTRINJAVAsTRINJAVAsTRINJAVAsTRINJAVAsTRINJAVAsTRINJAVAsTRINJAVAsTRINJAVAsTRINJAVAsTRINJAVAsTRINJAVAsTRINJAVAsTRINJAVAsTRINJAVAsTRINJAVAsTRINJjava.JAVAsTRINJAVAsTRINJAVAsTRINJAVAsTRINJAVAsTRINJAVAsTRINJAVAsTRINJAVAsTRINJAVAsTRINJAVAsTRINJAVAsTRINJAVAsTRINJAVAsTRINJAVAsTRINJAVAsTRINJAVAsTRINJAVAsTRINJAVAsTRINJAVAsTRINJAVAsTRINJAVAsTRINJAVAsTRINJAVAsTRINJAVAsTRINJAVAsTRINJAVAsTRINJAVAsTRINJ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "...44444...JAVAsTRINJAVAsTRINJAVAsTRINJAVAsTRINJAVAsTRINJAVAsTRINJAVAsTRINJAVAsTRINJAVAsTRINJAVAsTRINJAVAsTRINJAVAsTRINJAVAsTRINJAVAsTRINJAVAsTRINJAVAsTRINJAVAsTRINJAVAsTRINJAVAsTRINJAVAsTRINJAVAsTRINJAVAsTRINJAVAsTRINJAVAsTRINJAVAsTRINJAVAsTRINJAVAsTRINJjava.JAVAsTRINJAVAsTRINJAVAsTRINJAVAsTRINJAVAsTRINJAVAsTRINJAVAsTRINJAVAsTRINJAVAsTRINJAVAsTRINJAVAsTRINJAVAsTRINJAVAsTRINJAVAsTRINJAVAsTRINJAVAsTRINJAVAsTRINJAVAsTRINJAVAsTRINJAVAsTRINJAVAsTRINJAVAsTRINJAVAsTRINJAVAsTRINJAVAsTRINJAVAsTRINJAVAsTRINJJAVAsTRINJAVAsTRINJAVAsTRINJAVAsTRINJAVAsTRINJAVAsTRINJAVAsTRINJAVAsTRINJAVAsTRINJAVAsTRINJAVAsTRINJAVAsTRINJAVAsTRINJAVAsTRINJAVAsTRINJAVAsTRINJAVAsTRINJAVAsTRINJAVAsTRINJAVAsTRINJAVAsTRINJAVAsTRINJAVAsTRINJAVAsTRINJAVAsTRINJAVAsTRINJAVAsTRINJjava.JAVAsTRINJAVAsTRINJAVAsTRINJAVAsTRINJAVAsTRINJAVAsTRINJAVAsTRINJAVAsTRINJAVAsTRINJAVAsTRINJAVAsTRINJAVAsTRINJAVAsTRINJAVAsTRINJAVAsTRINJAVAsTRINJAVAsTRINJAVAsTRINJAVAsTRINJAVAsTRINJA" + "'", str3, "...44444...JAVAsTRINJAVAsTRINJAVAsTRINJAVAsTRINJAVAsTRINJAVAsTRINJAVAsTRINJAVAsTRINJAVAsTRINJAVAsTRINJAVAsTRINJAVAsTRINJAVAsTRINJAVAsTRINJAVAsTRINJAVAsTRINJAVAsTRINJAVAsTRINJAVAsTRINJAVAsTRINJAVAsTRINJAVAsTRINJAVAsTRINJAVAsTRINJAVAsTRINJAVAsTRINJAVAsTRINJjava.JAVAsTRINJAVAsTRINJAVAsTRINJAVAsTRINJAVAsTRINJAVAsTRINJAVAsTRINJAVAsTRINJAVAsTRINJAVAsTRINJAVAsTRINJAVAsTRINJAVAsTRINJAVAsTRINJAVAsTRINJAVAsTRINJAVAsTRINJAVAsTRINJAVAsTRINJAVAsTRINJAVAsTRINJAVAsTRINJAVAsTRINJAVAsTRINJAVAsTRINJAVAsTRINJAVAsTRINJJAVAsTRINJAVAsTRINJAVAsTRINJAVAsTRINJAVAsTRINJAVAsTRINJAVAsTRINJAVAsTRINJAVAsTRINJAVAsTRINJAVAsTRINJAVAsTRINJAVAsTRINJAVAsTRINJAVAsTRINJAVAsTRINJAVAsTRINJAVAsTRINJAVAsTRINJAVAsTRINJAVAsTRINJAVAsTRINJAVAsTRINJAVAsTRINJAVAsTRINJAVAsTRINJAVAsTRINJjava.JAVAsTRINJAVAsTRINJAVAsTRINJAVAsTRINJAVAsTRINJAVAsTRINJAVAsTRINJAVAsTRINJAVAsTRINJAVAsTRINJAVAsTRINJAVAsTRINJAVAsTRINJAVAsTRINJAVAsTRINJAVAsTRINJAVAsTRINJAVAsTRINJAVAsTRINJAVAsTRINJA");
    }

    @Test
    public void test38277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest76.test38277");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.lowerCase(".........ava..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + ".........ava..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java" + "'", str1, ".........ava..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java");
    }

    @Test
    public void test38278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest76.test38278");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.defaultString("AVAJ ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "AVAJ " + "'", str1, "AVAJ ");
    }

    @Test
    public void test38279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest76.test38279");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.split("...#######", "                                                                                                                                                                                                                                                                                                                           ");
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test38280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest76.test38280");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replace("J#v#.l#ngj#v#.l#ngj#v#.l#ngj#v#.l#ngj#v#.l#ngj#v#.l#ngj#v#.l#ngj#v#.l#ngj#v#.l#ngj#v#.l#ngj#v#.l#ngj#v#.l#ngj#v#.l#ngj#v#.l#ngj#v#.l#ngj#v#.l#ngj#v#.l#ngj#v#.l#ngj#v#.l#ngj#v#.l#ngj#v#.l#ngj#v#.l#ngj#v#.l#ngj#v#.l#ngj#v#.l#ngj#v#.l#ngj#v#.l#ngj#v#.l#ngj#v#.l#ngj#v#.l#ngj#v#.l#ngj#v#.l#ngj#v#.l#ng", "$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$java$.lang.Stringclass java.lang.Stringclass java.lang.Stringclas.lang.Stringclass java.lang", "........................");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "J#v#.l#ngj#v#.l#ngj#v#.l#ngj#v#.l#ngj#v#.l#ngj#v#.l#ngj#v#.l#ngj#v#.l#ngj#v#.l#ngj#v#.l#ngj#v#.l#ngj#v#.l#ngj#v#.l#ngj#v#.l#ngj#v#.l#ngj#v#.l#ngj#v#.l#ngj#v#.l#ngj#v#.l#ngj#v#.l#ngj#v#.l#ngj#v#.l#ngj#v#.l#ngj#v#.l#ngj#v#.l#ngj#v#.l#ngj#v#.l#ngj#v#.l#ngj#v#.l#ngj#v#.l#ngj#v#.l#ngj#v#.l#ngj#v#.l#ng" + "'", str3, "J#v#.l#ngj#v#.l#ngj#v#.l#ngj#v#.l#ngj#v#.l#ngj#v#.l#ngj#v#.l#ngj#v#.l#ngj#v#.l#ngj#v#.l#ngj#v#.l#ngj#v#.l#ngj#v#.l#ngj#v#.l#ngj#v#.l#ngj#v#.l#ngj#v#.l#ngj#v#.l#ngj#v#.l#ngj#v#.l#ngj#v#.l#ngj#v#.l#ngj#v#.l#ngj#v#.l#ngj#v#.l#ngj#v#.l#ngj#v#.l#ngj#v#.l#ngj#v#.l#ngj#v#.l#ngj#v#.l#ngj#v#.l#ngj#v#.l#ng");
    }

    @Test
    public void test38281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest76.test38281");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.containsWhitespace("  ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test38282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest76.test38282");
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.replace("aRRAYlISTaRRAYlISTaRRAYlISTAVAJgnal", "... ... ... ... ... ... ... ... ...... ... ... ... ... ... ... ... ...... ... ... ... ... ... ... ...AAAAAAAAAAAAAAAAAAA      $$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$", "...############################", 73);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "aRRAYlISTaRRAYlISTaRRAYlISTAVAJgnal" + "'", str4, "aRRAYlISTaRRAYlISTaRRAYlISTAVAJgnal");
    }

    @Test
    public void test38283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest76.test38283");
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.split("AtsiLytcejbO.gnal.avaj ssalcrrAtsiLytcejbO.gnal.avaj ssalcrrAva.langGNAL..langjava.langAGNAL.AVAJAtsiLytcejbO.gnal.avaj ssalcrrAtsiLytcejbO.gnal.avaj ssalcrrAva.langGNAL..langjava.langAGNAL.AVAJAtsiLytcejbO.gnal.avaj ssalcrrAtsiLytcejbO.gnal.avaj ssalcrrAva.langGNAL..langjava.langAGNAL.AVAJAtsiLytcejbO.gnal.avaj ssalcrrAtsiLytcejStringAtsiLytcejbO.gnal.avaj ssalcrrAtsiLytcejbO.gnal.avaj ssalcrrAva.langGNAL..langjava.langAGNAL.AVAJAtsiLytcejbO.gnal.avaj ssalcrrAtsiLytcejbO.gnal.avaj ssalcrrAva.langGNAL..langjava.langAGNAL.AVAJAtsiLytcejbO.gnal.avaj ssalcrrAtsiLytcejbO.gnal.avaj ssalcrrAva.langGNAL..langjava.langAGNAL.AVAJAtsiLytcejbO.gnal.avaj ssalcrrAtsiLytcejb", "444444444444444444444444444...", 842);
        int int5 = org.apache.commons.lang3.StringUtils.lastIndexOfAny("Hi!ArrayListArrayListArrayListavaj.gnalArrayListArrayListArrayListavaj", strArray4);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 35 + "'", int5 == 35);
    }

    @Test
    public void test38284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest76.test38284");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("gnaaaaaa...aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "interface java.lang.CloneableStringinterfNAL....................interface java.lang.CloneableStringinterfa", 943);
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void test38285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest76.test38285");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringAfterLast("a..ayl a", "#gnaaaaaaaaaaring.#gnaaaaaaaaaaj#v##.#gnaaaaaaaaaaj#v##.#gnaaaaaaaaaaj#v##.#gnaaaaaaaaaaj#v##.#gnaaaaaaaaaaj#v##.#gnaaaaaaaaaaj#v##.#gnaaaaaaaaaaj#v##.#gnaaaaaaaaaaj#v##.#gnaaaaaaaaaaj#v##.#gnaaaaaaaaaaj#v##.#gnaaaaaaaaaaj#v##.#gnaaaaaaaaaaj#                                              aaaaaaaj#v##.#gnaaaaaaaaaaj#v##.#gnaaaaaaaaaaj#v##.#gnaaaaaaaaaaj#v##.#gnaaaaaaaaaaj#v##.#gnaaaaaaaaaaj#v##.#gnaaaaaaaaaaj#v##.#gnaaaaaaaaaaj#v##.#gnaaaaaaaaaaj#v##.#gnaaaaaaaaaaj#v##.#gnaaaaaaaaaaj#v##.#gnaaaaaaaaaaj#v##.aaaaaaaaaaj#v##");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test38286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest76.test38286");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOf("$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$.........................................ArryListArryListArryListArryLis.........................................", 78);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test38287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest76.test38287");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.swapCase("JAVA.LANGAgnal.avajgnal..LANGgnal.avJAVA.LANGAgnal.avajgnal..LANGgnal.avJAVA.LANGAgnal.avajgnal..LANGgnal.avJAVA.LANGAgnal.avajgnal..LANGgnal.avJAVA.LANGAgnal.avajgnal..LANGgnal.avJAVA.LANGAgnal.avajgnal..LANGgnal.avJAVA.LANGAgnal.avajgnal..LANGgnal.avJAVA.LANGAgnal.avajgnal..LANGgnal.avJAVA.LANGAgnal.avajgnal..LANGgnal.avJAVA.LANGAgnal.avajgnal..LANGgnal.av");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "java.langaGNAL.AVAJGNAL..langGNAL.AVjava.langaGNAL.AVAJGNAL..langGNAL.AVjava.langaGNAL.AVAJGNAL..langGNAL.AVjava.langaGNAL.AVAJGNAL..langGNAL.AVjava.langaGNAL.AVAJGNAL..langGNAL.AVjava.langaGNAL.AVAJGNAL..langGNAL.AVjava.langaGNAL.AVAJGNAL..langGNAL.AVjava.langaGNAL.AVAJGNAL..langGNAL.AVjava.langaGNAL.AVAJGNAL..langGNAL.AVjava.langaGNAL.AVAJGNAL..langGNAL.AV" + "'", str1, "java.langaGNAL.AVAJGNAL..langGNAL.AVjava.langaGNAL.AVAJGNAL..langGNAL.AVjava.langaGNAL.AVAJGNAL..langGNAL.AVjava.langaGNAL.AVAJGNAL..langGNAL.AVjava.langaGNAL.AVAJGNAL..langGNAL.AVjava.langaGNAL.AVAJGNAL..langGNAL.AVjava.langaGNAL.AVAJGNAL..langGNAL.AVjava.langaGNAL.AVAJGNAL..langGNAL.AVjava.langaGNAL.AVAJGNAL..langGNAL.AVjava.langaGNAL.AVAJGNAL..langGNAL.AV");
    }

    @Test
    public void test38288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest76.test38288");
        int int2 = org.apache.commons.lang3.StringUtils.countMatches(".langGNAL..langjava.langAGNAL.AVAJ", "#AGNAAAAAAAAGNAL#AGNAAAAAAAAGNAL#AGNAAAAAAAAGNAL#AGNAAAAAAAAGNAL#AGNAAAAAAAAGNAL#AGNAAAAAAAAGNAL#AGNAAAAAAAAGNAL#AGNAAAAAAAAGNAL#AGNAAAAAAAAGNAL#AGNAAAAAAAAGNAL#AGNAAAAAAAAGNAL#AGNAAAAAAAAGNAL#AGNAAAAAAAAGNAL#AGNA########################################################nnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnn#########################################################AGNAAAAAAAAGNAL#AGNAAAAAAAAGNAL#AGNAAAAAAAAGNAL#AGNAAAAAAAAGNAL#AGNAAAAAAAAGNAL#AGNAAAAAAAAGNAL#AGNAAAAAAAAGNAL#AGNAAAAAAAAGNAL#AGNAAAAAAAAGNAL#AGNAAAAAAAAGNAL#AGNAAAAAAAAGNAL#AGNAAAAAAAAGNAL#AGNAAAAAAAAGNAL#AGNA");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test38289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest76.test38289");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAllUpperCase((java.lang.CharSequence) "][gnirtSlitu.avaj1");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test38290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest76.test38290");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substring("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaclass java.lang.Stringaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", 515);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa" + "'", str2, "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
    }

    @Test
    public void test38291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest76.test38291");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfIgnoreCase("                                                                                                                                                                                                                                                                         AAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAA", "jvstringnlrrylistrrylistrrylistvj");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test38292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest76.test38292");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripToNull("gnaaaaaa...aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "gnaaaaaa...aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa" + "'", str1, "gnaaaaaa...aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
    }

    @Test
    public void test38293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest76.test38293");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa...", "INTERFACE JAVA.LANG.cLONEABLEa RRR RRR RRR RRR RRR RRR RRR RRR RNAL....................INTERFACE JAVA.LANG.cLONEABLEa RRR RRR RRR RRR RRR RRR RRR RRR R");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str6 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray2, "$.$vj", (int) (byte) -1, 993);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test38294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest76.test38294");
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("tsiLyarrA.La.langtsiLyarrA.La.langtsiLyarrAJavaaaaaaaaaava.langava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langa.langtsiLyarrA.La.langtsiLyarrA.La.lang", "                                      A..ayL A");
        java.lang.String[] strArray8 = org.apache.commons.lang3.StringUtils.split("gnal.avaj", "gnal.avaj", (int) (byte) -1);
        java.lang.String[] strArray9 = org.apache.commons.lang3.StringUtils.stripAll(strArray8);
        java.lang.String str10 = org.apache.commons.lang3.StringUtils.replaceEach("                                                                              INTERFACE JAVA.LANG.CLONEABLE...                                 INTERFACE JAVA.IO.SERIALIZABLE", strArray4, strArray9);
        java.lang.String[] strArray14 = org.apache.commons.lang3.StringUtils.split("irfSeriaCoSeria$SeriairfioSeriaSriiz", "tSslitUgnirtSslitUgnirtSslitUgnirtSslitUgnirtS", 131);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str15 = org.apache.commons.lang3.StringUtils.replaceEach(".lang.lang.lang.lang", strArray4, strArray14);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Search and Replace array lengths don't match: 170 vs 12");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertNotNull(strArray9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "                                                                              INTERFACE JAVA.LANG.CLONEABLE...                                 INTERFACE JAVA.IO.SERIALIZABLE" + "'", str10, "                                                                              INTERFACE JAVA.LANG.CLONEABLE...                                 INTERFACE JAVA.IO.SERIALIZABLE");
        org.junit.Assert.assertNotNull(strArray14);
    }

    @Test
    public void test38295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest76.test38295");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.center("4rr4ylist", 257, "sClassslitUgnirtSslitUgnirtSslitUgnirtSslitUgnirtSslitUgnirtSslitUgnirtSslitUgnirtSslitUgnirtSslitUgnirtSslitUgnirtS");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "sClassslitUgnirtSslitUgnirtSslitUgnirtSslitUgnirtSslitUgnirtSslitUgnirtSslitUgnirtSslitUgnirtSslitUgnirtSslitUgnirtSsClasssl4rr4ylistsClassslitUgnirtSslitUgnirtSslitUgnirtSslitUgnirtSslitUgnirtSslitUgnirtSslitUgnirtSslitUgnirtSslitUgnirtSslitUgnirtSsClasssl" + "'", str3, "sClassslitUgnirtSslitUgnirtSslitUgnirtSslitUgnirtSslitUgnirtSslitUgnirtSslitUgnirtSslitUgnirtSslitUgnirtSslitUgnirtSsClasssl4rr4ylistsClassslitUgnirtSslitUgnirtSslitUgnirtSslitUgnirtSslitUgnirtSslitUgnirtSslitUgnirtSslitUgnirtSslitUgnirtSslitUgnirtSsClasssl");
    }

    @Test
    public void test38296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest76.test38296");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("                                                                                                                                                                                                                                                                                                                                                                                                                             ", '$');
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test38297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest76.test38297");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOfIgnoreCase("String[]", "                                                                                                                                                                             Javaaaaaaaaaava.langava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.lang$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test38298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest76.test38298");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.remove("$         44444444444444444444444444444444444444444444444444444444444444444444444444444444                                                           ...SAITUJAIRTSSAIJAVAULAINTERFACE JAVA.LANG.CLONEABLE4INTERFACE JAVA.IO.SERIALIZABLE...SAITUJAIRTSSAIJAVAULAINTERFACE JAVA.LANG.CLONEABLE4INTERFACE JAVA.IO.SERIALIZABLE...SAITUJAIRTSSAIJAVAULAINTERFACE JAVA.LANG.CLONEABLE4INTERFACE JAVA.IO.SERIALIZABLE...SAITUJAIRTSSAIJAVAULAINTERFACE JAVA.LANG.CLONEABLE4INTERFACE JAVA.IO.SERIALIZABL", "slitUgnirtS");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "$         44444444444444444444444444444444444444444444444444444444444444444444444444444444                                                           ...SAITUJAIRTSSAIJAVAULAINTERFACE JAVA.LANG.CLONEABLE4INTERFACE JAVA.IO.SERIALIZABLE...SAITUJAIRTSSAIJAVAULAINTERFACE JAVA.LANG.CLONEABLE4INTERFACE JAVA.IO.SERIALIZABLE...SAITUJAIRTSSAIJAVAULAINTERFACE JAVA.LANG.CLONEABLE4INTERFACE JAVA.IO.SERIALIZABLE...SAITUJAIRTSSAIJAVAULAINTERFACE JAVA.LANG.CLONEABLE4INTERFACE JAVA.IO.SERIALIZABL" + "'", str2, "$         44444444444444444444444444444444444444444444444444444444444444444444444444444444                                                           ...SAITUJAIRTSSAIJAVAULAINTERFACE JAVA.LANG.CLONEABLE4INTERFACE JAVA.IO.SERIALIZABLE...SAITUJAIRTSSAIJAVAULAINTERFACE JAVA.LANG.CLONEABLE4INTERFACE JAVA.IO.SERIALIZABLE...SAITUJAIRTSSAIJAVAULAINTERFACE JAVA.LANG.CLONEABLE4INTERFACE JAVA.IO.SERIALIZABLE...SAITUJAIRTSSAIJAVAULAINTERFACE JAVA.LANG.CLONEABLE4INTERFACE JAVA.IO.SERIALIZABL");
    }

    @Test
    public void test38299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest76.test38299");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("GNAL.AL.ARRAYLISTGNAL.AL.ARRAYLISTGNAL.AGNAL.AVAJGNAL.AVAJGNAL.AVAJGNAL.AVAJGNAL.AVAJGNAL.AVAJGNAL.AVAJGNAL.AVAJGNAL.AVAJGNAL.AVAJGNAL.AVAJGNAL.AVAJGNAL.AVAJGNAL.AVAJGNAL.AVAJGNAL.AVAJGNAL.AVAJGNAL.AVAJGNAL.AVAJGNAL.AVAJGNAL.AVAJGNAL.AVAJGNAL.AVAJGNAL.AVAJGNAL.AVAJGNAL.AVAJGNAL.AVAJGNAL.AVAGNAL.AVAAAAAAAAAAVAJARRAYLISTGNAL.AL.ARRAYLISTGNAL.AL.ARRAYLIST", "$$$$$$jav", 357);
        java.lang.String str5 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray3, "                                                                                                                                                                                                                                                                                                                                                                                                                                        javaulangrraylist                       javaulangrraylist                                                                                                                                                                                                                                                                                                                                                                                                                            ");
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "GNAL.AL.ARRAYLISTGNAL.AL.ARRAYLISTGNAL.AGNAL.AVAJGNAL.AVAJGNAL.AVAJGNAL.AVAJGNAL.AVAJGNAL.AVAJGNAL.AVAJGNAL.AVAJGNAL.AVAJGNAL.AVAJGNAL.AVAJGNAL.AVAJGNAL.AVAJGNAL.AVAJGNAL.AVAJGNAL.AVAJGNAL.AVAJGNAL.AVAJGNAL.AVAJGNAL.AVAJGNAL.AVAJGNAL.AVAJGNAL.AVAJGNAL.AVAJGNAL.AVAJGNAL.AVAJGNAL.AVAJGNAL.AVAGNAL.AVAAAAAAAAAAVAJARRAYLISTGNAL.AL.ARRAYLISTGNAL.AL.ARRAYLIST" + "'", str5, "GNAL.AL.ARRAYLISTGNAL.AL.ARRAYLISTGNAL.AGNAL.AVAJGNAL.AVAJGNAL.AVAJGNAL.AVAJGNAL.AVAJGNAL.AVAJGNAL.AVAJGNAL.AVAJGNAL.AVAJGNAL.AVAJGNAL.AVAJGNAL.AVAJGNAL.AVAJGNAL.AVAJGNAL.AVAJGNAL.AVAJGNAL.AVAJGNAL.AVAJGNAL.AVAJGNAL.AVAJGNAL.AVAJGNAL.AVAJGNAL.AVAJGNAL.AVAJGNAL.AVAJGNAL.AVAJGNAL.AVAJGNAL.AVAGNAL.AVAAAAAAAAAAVAJARRAYLISTGNAL.AL.ARRAYLISTGNAL.AL.ARRAYLIST");
    }

    @Test
    public void test38300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest76.test38300");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isWhitespace((java.lang.CharSequence) "j.v.tsily.rr.tsily.rr.tsily.r");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test38301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest76.test38301");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isBlank((java.lang.CharSequence) "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaajaval#.#agnaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaajaval#.#agnaaaaaaaaGnal");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test38302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest76.test38302");
        java.lang.String str2 = org.apache.commons.lang3.ClassUtils.getShortClassName((java.lang.Object) "object", "...                                                                irfCo$irfioSriiz...                                                                 ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "String" + "'", str2, "String");
    }

    @Test
    public void test38303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest76.test38303");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.normalizeSpace("interfacejava.lang.Cloneable#interfacejava.iointerfacejava.lang.Cloneable#interfacejava.iointerfacejava.la");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "interfacejava.lang.Cloneable#interfacejava.iointerfacejava.lang.Cloneable#interfacejava.iointerfacejava.la" + "'", str1, "interfacejava.lang.Cloneable#interfacejava.iointerfacejava.lang.Cloneable#interfacejava.iointerfacejava.la");
    }

    @Test
    public void test38304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest76.test38304");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.strip("..............................................................................................................................................................................................................................................................................................................................................................................................................................ArryList.................................................................................");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "..............................................................................................................................................................................................................................................................................................................................................................................................................................ArryList................................................................................." + "'", str1, "..............................................................................................................................................................................................................................................................................................................................................................................................................................ArryList.................................................................................");
    }

    @Test
    public void test38305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest76.test38305");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "vagnal.avajlang.javagnal.avajlang.javagnal.avajlang.javagnal.avajlang.javagnal.avajlang.javagnal.avajGNAL", "u                                                                                                                                                                                                                                                                                                       Java.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava...                                                                                                                                                                                                                                                                                                                                                                                                           ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test38306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest76.test38306");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphanumeric((java.lang.CharSequence) "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test38307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest76.test38307");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsIgnoreCase("       ", "atsiLytcejbO.gnal.avaj ssalcrrAtsiLytcejbO.gnal.avaj ssalcrrAva.langGNAL..langjava.langAGNAL.AVAJAtsiLytcejbO.gnal.avaj ssalcrrAtsiLytcejbO.gnal.avaj ssalcrrAva.langGNAL..langjava.langAGNAL.AVAJAtsiLytcejbO.gnal.avaj ssalcrrAtsiLytcejbO.gnal.avaj ssalcrrAva.langGNAL..langjava.langAGNAL.AVAJAtsiLytcejbO.gnal.avaj ssalcrrAtsiLytcejStringAtsiLytcejbO.gnal.avaj ssalcrrAtsiLytcejbO.gnal.avaj ssalcrrAva.langGNAL..langjava.langAGNAL.AVAJAtsiLytcejbO.gnal.avaj ssalcrrAtsiLytcejbO.gnal.avaj ssalcrrAva.langGNAL..langjava.langAGNAL.AVAJAtsiLytcejbO.gnal.avaj ssalcrrAtsiLytcejbO.gnal.avaj ssalcrrAva.langGNAL..langjava.langAGNAL.AVAJAtsiLytcejbO.gnal.avaj ssalcrrAtsiLytcejb");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test38308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest76.test38308");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.swapCase("JLVLlaLNG                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                  ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "jlvlLAlng                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                  " + "'", str1, "jlvlLAlng                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                  ");
    }

    @Test
    public void test38309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest76.test38309");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substring("##########################java.lang", 460);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test38310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest76.test38310");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfIgnoreCase("", ".VJ");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test38311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest76.test38311");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "iterfce Coebe$iterfce ioSeriizbeiterfce Coebe$iterfce ioSeriizbeiterfce Coebe$iterfce ioSeriizbeiterfce Coebe$iterfce ioSeriizbeiterfce Coebe$iterfce ioSeriizbeiterfce Coebe$iterfce ioSeriizbeiterfce Coebe$iterfce ioSeriizbeiterfce Coebe$iterfce ioSeriizbeiterfce Coebe$iterfce ioSeriizbeiterfce Coebe$iterfce ioSeriizbeiterfce Coebe$iterfce ioSeriizbeiterfce Coebe$iterfce ioSeriizbeiterfce Coebe$iterfce ioSeriizbeiterfce Coebe$iterfce ioSeriizbeiterfce Coebe$iterfce ioSeriizbeiterfce Coebe$iterfce ioSeriizbeiterfce Coebe$iterfce ioSeriizbeiterfce Coebe$iterfce ioSeriizbeiterfce", "                                           ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test38312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest76.test38312");
        int int2 = org.apache.commons.lang3.StringUtils.indexOf("...........................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................interface java.lang.Cloneablegnal.avajgnal..LANGgnal.avajgnal.interface java.io.Serializableinterface java.lang.Cloneablegnal.avajgnal..LANGgnal.avajgnal.interface java.io.Serializableinterface java.lang.Cloneablegnal.avajgnal..LANGgnal.avajgnal.interface java.io.Serializableinterface java.laninterface java.lang.Cloneableinterface java.lang.Cloneable$interface java.io.Serializableinterface java.io.Serializable", 125);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test38313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest76.test38313");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.reverse("                                                             javal$agn                                                             ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "                                                             nga$lavaj                                                             " + "'", str1, "                                                             nga$lavaj                                                             ");
    }

    @Test
    public void test38314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest76.test38314");
        java.lang.String str2 = org.apache.commons.lang3.ClassUtils.getShortCanonicalName((java.lang.Object) "...AAAAAAAAAA... AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA... AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA... AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA... AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA... AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAirfCo.irfioSrAaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaairfCo.irfioSrAaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaairfCo.irfioSrAaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaairfCo.irfioSrAaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaairfCo.irfioSrAaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaairfCo.irfioSrAaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "                                                                                                                                                                                                                                                                    JAVAlLANGJ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "String" + "'", str2, "String");
    }

    @Test
    public void test38315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest76.test38315");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.leftPad("                                                                                                                                                                                                                 UTIL                                                                                                                                                                                                                                                                                                                                                                                                                                                                     ", 486, "GN LU V J                       ....................................................................GN LU V J                       ....................................................................GN LU V J                       ......................................                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                     aRRAYlISTaRRAYlISTaRRAYlISTAVAJAGNAL");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "                                                                                                                                                                                                                 UTIL                                                                                                                                                                                                                                                                                                                                                                                                                                                                     " + "'", str3, "                                                                                                                                                                                                                 UTIL                                                                                                                                                                                                                                                                                                                                                                                                                                                                     ");
    }

    @Test
    public void test38316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest76.test38316");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphanumeric((java.lang.CharSequence) "Jaavaaaaaaaaaavaa.alangavaa.alangjavaa.alangjavaa.alangjavaa.alangjavaa.alangjavaa.alangjavaa.alangjavaa.alangjavaa.alangjavaa.alangjavaa.alangjavaa.alangjavaa.alangjavaa.alangjavaa.alan");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test38317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest76.test38317");
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.split("Booleaninterface java.lang.CloneableLANG.GNALJAVA.LANGAVAJ.GNALJAVA.LANGAVAJ.GNALJAVA.LANGAVAJ.GNALJAVA.LANGAVAJ.GNALJAVA.LANGAVAJ.GNALJAVA.LANGAVAJ.GNALJAVA.LANGAVAJ.GNALJAVA.LANGAVAJ.JAVAinterface java.io.Serializable", "CLASS JAVALANGCLASS                       JAVAULANG                       JAVAULANG                       JAVAULANG                       JAVAULANG                       JAVAULANG                       JAVAULANG                       JAVAULANG                       JAVAULANG                       JAVAULANG                       JAVAULANG                       JAVAULANG                       JAVAULANG                       JAVAULANG                       JAVAULANG                       JAVAULANG                       JAVAULANG                       JAVAULANG                       JAVAULANG                       JAVAULANG                       JAVAULANG        ", 1);
        boolean boolean5 = org.apache.commons.lang3.StringUtils.endsWithAny("$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$#agnaaaaaaaaGnal", strArray4);
        java.lang.Class<?>[] wildcardClassArray6 = org.apache.commons.lang3.ClassUtils.toClass((java.lang.Object[]) strArray4);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(wildcardClassArray6);
    }

    @Test
    public void test38318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest76.test38318");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isWhitespace((java.lang.CharSequence) "                   JAVAULANGrrayListyLA.");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test38319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest76.test38319");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("A                                      .A Lya", "ngaaaaaaaaaaaaaaaaaaaaaaa");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str6 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray2, '.', 4, 358);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 4");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test38320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest76.test38320");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.leftPad("....................................................................$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$GNAL$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$                       $$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$GNAL$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$JAVAULANG", 240, '$');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "....................................................................$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$GNAL$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$                       $$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$GNAL$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$JAVAULANG" + "'", str3, "....................................................................$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$GNAL$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$                       $$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$GNAL$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$JAVAULANG");
    }

    @Test
    public void test38321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest76.test38321");
        char[] charArray8 = new char[] {};
        int int9 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "$       ", charArray8);
        int int10 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) ".", charArray8);
        int int11 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "                          ", charArray8);
        boolean boolean12 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "interface java.lang.Cloneableainterface java.io.Serializable", charArray8);
        boolean boolean13 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) ".       .       .       .       .       .       .       .       .       .       .       .       .       .       .       .       .       .       .       .       .       .       .       .       .       .       .       .       .       .       .       .       .       .       .       .       .       .       .       .       .       .       .       .       .       .       .       .       .       .       .       .       .       .       .       .       .       .       .       .       .       .       .       .       .       .       .       .       .       .       .       .       .       .       .       .       .       .       .       .       .       .       .       .       .       .       .       .       .       .       .       .       .       .       .       .       .       .       .       .       ", charArray8);
        int int14 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "tsilyarrgnaluavajtsilyarrgnaluavaj", charArray8);
        boolean boolean15 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "...                                        ", charArray8);
        boolean boolean16 = org.apache.commons.lang3.StringUtils.containsAny("                                                                               JLANGAVLANGALLANGANG      ", charArray8);
        org.junit.Assert.assertNotNull(charArray8);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray8), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray8), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray8), "[]");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test38322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest76.test38322");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripToEmpty("IT.IT");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "IT.IT" + "'", str1, "IT.IT");
    }

    @Test
    public void test38323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest76.test38323");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.leftPad("i$terf$ce$$$$$$$$$$C$o$e$b$e$i$terf$ce$$$$$io$Seri$$iz$b$e", 444, '4');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "44444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444i$terf$ce$$$$$$$$$$C$o$e$b$e$i$terf$ce$$$$$io$Seri$$iz$b$e" + "'", str3, "44444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444i$terf$ce$$$$$$$$$$C$o$e$b$e$i$terf$ce$$$$$io$Seri$$iz$b$e");
    }

    @Test
    public void test38324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest76.test38324");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.defaultString("                                                                                                                                                                                                                                                                                 444444444444444444444444444...444444444444444444444444444...444444444444444444444444444...444444444444444444444444444...444444444444444444444444444...444444444444444444444444444...444444444444444444444444444...444444444444444444444444444...444444444444444444444444444...444444444444444444444444444...4444444][ssalCGNIRTGNIRTGNIRTGNIRTGNIRTGNIRTGNIRTGNIRTGNIRTGNIRTGNIRTGNIRTGNIRTGNIRTGNIRTGNIRTGNIRTGNIRTGNIRTGNIR4444444444444444444444444444444", "ssal$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$rrayList$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$C");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                                                                                                                                                                                                                                                                 444444444444444444444444444...444444444444444444444444444...444444444444444444444444444...444444444444444444444444444...444444444444444444444444444...444444444444444444444444444...444444444444444444444444444...444444444444444444444444444...444444444444444444444444444...444444444444444444444444444...4444444][ssalCGNIRTGNIRTGNIRTGNIRTGNIRTGNIRTGNIRTGNIRTGNIRTGNIRTGNIRTGNIRTGNIRTGNIRTGNIRTGNIRTGNIRTGNIRTGNIRTGNIR4444444444444444444444444444444" + "'", str2, "                                                                                                                                                                                                                                                                                 444444444444444444444444444...444444444444444444444444444...444444444444444444444444444...444444444444444444444444444...444444444444444444444444444...444444444444444444444444444...444444444444444444444444444...444444444444444444444444444...444444444444444444444444444...444444444444444444444444444...4444444][ssalCGNIRTGNIRTGNIRTGNIRTGNIRTGNIRTGNIRTGNIRTGNIRTGNIRTGNIRTGNIRTGNIRTGNIRTGNIRTGNIRTGNIRTGNIRTGNIRTGNIR4444444444444444444444444444444");
    }

    @Test
    public void test38325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest76.test38325");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOf("#########################################################...", 315);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test38326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest76.test38326");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("StringUtils", "AVAJ.GNAL", 2);
        java.lang.String[] strArray5 = org.apache.commons.lang3.StringUtils.stripAll(strArray3, "");
        java.lang.String str6 = org.apache.commons.lang3.StringUtils.concat((java.lang.Object[]) strArray3);
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray3, "                                                                               JLANGAVLANGALLANGANG                                                                                ");
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "StringUtils" + "'", str6, "StringUtils");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "StringUtils" + "'", str8, "StringUtils");
    }

    @Test
    public void test38327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest76.test38327");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeStartIgnoreCase("javalituavajlituavajjavalituavajlituavajjavalituavajlituavajjavalituavajlituavajjavalituavajlituavajjavalituavajlituavajjavalituavajlituavajjavalituavajlituavajjavalituavajlituavajjavalituavajlituavajjavalituavajlituavajjavalituavajlituavajjavalituavajlituavajjavalituavajlituavajjavalituavajlituavajjavalituavajlituavajjavalituavajlituavajjavalituavajlituavajjavalituavajlituavajjavalituavajlituavajjavalituavajlituavajjavalituavajlituavajjavalituavajlituavajjavalituavajlituavajjavalituavajlituavajjavalituavajlituavajjavalituavajlituavajjavalituavajlituavajjavalituavajlituavajjavalituavajlituavajjavalituavajlituavajjavalituavajlituavajjavalituavajlituavaj", "arrtsclassjava.lang");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "javalituavajlituavajjavalituavajlituavajjavalituavajlituavajjavalituavajlituavajjavalituavajlituavajjavalituavajlituavajjavalituavajlituavajjavalituavajlituavajjavalituavajlituavajjavalituavajlituavajjavalituavajlituavajjavalituavajlituavajjavalituavajlituavajjavalituavajlituavajjavalituavajlituavajjavalituavajlituavajjavalituavajlituavajjavalituavajlituavajjavalituavajlituavajjavalituavajlituavajjavalituavajlituavajjavalituavajlituavajjavalituavajlituavajjavalituavajlituavajjavalituavajlituavajjavalituavajlituavajjavalituavajlituavajjavalituavajlituavajjavalituavajlituavajjavalituavajlituavajjavalituavajlituavajjavalituavajlituavajjavalituavajlituavaj" + "'", str2, "javalituavajlituavajjavalituavajlituavajjavalituavajlituavajjavalituavajlituavajjavalituavajlituavajjavalituavajlituavajjavalituavajlituavajjavalituavajlituavajjavalituavajlituavajjavalituavajlituavajjavalituavajlituavajjavalituavajlituavajjavalituavajlituavajjavalituavajlituavajjavalituavajlituavajjavalituavajlituavajjavalituavajlituavajjavalituavajlituavajjavalituavajlituavajjavalituavajlituavajjavalituavajlituavajjavalituavajlituavajjavalituavajlituavajjavalituavajlituavajjavalituavajlituavajjavalituavajlituavajjavalituavajlituavajjavalituavajlituavajjavalituavajlituavajjavalituavajlituavajjavalituavajlituavajjavalituavajlituavajjavalituavajlituavaj");
    }

    @Test
    public void test38328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest76.test38328");
        char[] charArray12 = new char[] { ' ', ' ', '#', 'a', '4', 'a' };
        int int13 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "", charArray12);
        boolean boolean14 = org.apache.commons.lang3.StringUtils.containsAny("$", charArray12);
        int int15 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "", charArray12);
        boolean boolean16 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "...       AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA", charArray12);
        int int17 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "tu", charArray12);
        int int18 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "                                   TU                                   $ArrayLis", charArray12);
        org.junit.Assert.assertNotNull(charArray12);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray12), "  #a4a");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray12), "  #a4a");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray12), "[ ,  , #, a, 4, a]");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
    }

    @Test
    public void test38329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest76.test38329");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOf("Arr... AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA... AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA... AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA... AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA... AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA... AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA... AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA... AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA... AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA... AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAyList", 584, 57);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test38330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest76.test38330");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.chop("                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                            LANGH!IH!IH!IH!IH!IH!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                            LANGH!IH!IH!IH!IH!IH" + "'", str1, "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                            LANGH!IH!IH!IH!IH!IH");
    }

    @Test
    public void test38331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest76.test38331");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.rightPad("ass...", 119, '4');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "ass...44444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444" + "'", str3, "ass...44444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444");
    }

    @Test
    public void test38332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest76.test38332");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("aa..", "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                             a.lang.CloneableStringinterface java.io                          ", 113);
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void test38333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest76.test38333");
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
        java.lang.String str26 = org.apache.commons.lang3.ClassUtils.getPackageCanonicalName((java.lang.Object) wildcardClassArray22, ".class javalangClass                       JAVAULANG                       JAVAULANG                       JAVAULANG                       JAVAULANG                       JAVAULANG                       JAVAULANG                       JAVAULANG                       JAVAULANG                       JAVAULANG                       JAVAULANG                       JAVAULANG                       JAVAULANG                       JAVAULANG                       JAVAULANG                       JAVAULANG                       JAVAULANG                       JAVAULANG                       JAVAULANG                       JAVAULANG                       JAVAULANG        rayListArrayListArrayListavaj.gnalArrayListArrayListArrayListavaj.gnalArrayListArrayListArrayLi.                       javaulang");
        java.lang.Class<?>[] wildcardClassArray27 = org.apache.commons.lang3.ClassUtils.wrappersToPrimitives(wildcardClassArray22);
        java.lang.String[] strArray29 = org.apache.commons.lang3.StringUtils.splitByCharacterType("... AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA... AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA... AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA... AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA... AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA... AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA... AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA... AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA... AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA... AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA");
        java.lang.Class<?>[] wildcardClassArray30 = org.apache.commons.lang3.ClassUtils.toClass((java.lang.Object[]) strArray29);
        java.lang.Class<?>[] wildcardClassArray31 = org.apache.commons.lang3.ClassUtils.primitivesToWrappers(wildcardClassArray30);
        java.lang.Class<?>[] wildcardClassArray32 = org.apache.commons.lang3.ClassUtils.wrappersToPrimitives(wildcardClassArray31);
        java.lang.String[] strArray35 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("hi!", "");
        java.lang.String[] strArray37 = org.apache.commons.lang3.StringUtils.stripAll(strArray35, "$");
        java.lang.Class<?>[] wildcardClassArray38 = org.apache.commons.lang3.ClassUtils.toClass((java.lang.Object[]) strArray35);
        java.lang.String[] strArray41 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("hi!", "");
        java.lang.String[] strArray43 = org.apache.commons.lang3.StringUtils.stripAll(strArray41, "$");
        java.lang.Class<?>[] wildcardClassArray44 = org.apache.commons.lang3.ClassUtils.toClass((java.lang.Object[]) strArray41);
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
        boolean boolean67 = org.apache.commons.lang3.ClassUtils.isAssignable(wildcardClassArray44, wildcardClassArray59, false);
        java.lang.Class<?>[] wildcardClassArray68 = org.apache.commons.lang3.ClassUtils.primitivesToWrappers(wildcardClassArray44);
        boolean boolean69 = org.apache.commons.lang3.ClassUtils.isAssignable(wildcardClassArray38, wildcardClassArray68);
        java.lang.Class<?>[] wildcardClassArray70 = org.apache.commons.lang3.ClassUtils.wrappersToPrimitives(wildcardClassArray68);
        boolean boolean71 = org.apache.commons.lang3.ClassUtils.isAssignable(wildcardClassArray31, wildcardClassArray68);
        boolean boolean72 = org.apache.commons.lang3.ClassUtils.isAssignable(wildcardClassArray22, wildcardClassArray31);
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
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "java.lang" + "'", str26, "java.lang");
        org.junit.Assert.assertNotNull(wildcardClassArray27);
        org.junit.Assert.assertNotNull(strArray29);
        org.junit.Assert.assertNotNull(wildcardClassArray30);
        org.junit.Assert.assertNotNull(wildcardClassArray31);
        org.junit.Assert.assertNotNull(wildcardClassArray32);
        org.junit.Assert.assertNotNull(strArray35);
        org.junit.Assert.assertNotNull(strArray37);
        org.junit.Assert.assertNotNull(wildcardClassArray38);
        org.junit.Assert.assertNotNull(strArray41);
        org.junit.Assert.assertNotNull(strArray43);
        org.junit.Assert.assertNotNull(wildcardClassArray44);
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
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + false + "'", boolean67 == false);
        org.junit.Assert.assertNotNull(wildcardClassArray68);
        org.junit.Assert.assertTrue("'" + boolean69 + "' != '" + true + "'", boolean69 == true);
        org.junit.Assert.assertNotNull(wildcardClassArray70);
        org.junit.Assert.assertTrue("'" + boolean71 + "' != '" + false + "'", boolean71 == false);
        org.junit.Assert.assertTrue("'" + boolean72 + "' != '" + false + "'", boolean72 == false);
    }

    @Test
    public void test38334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest76.test38334");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNumeric((java.lang.CharSequence) "interface java.lang.CloneableJ#v#.l#ngj#v#.l#ngj#v#.l#ngj#v#.l#ngj#v#.l#ngj#v#.l#ngj#v#.l#ngj#v#.l#ngj#v#.l#ngj#v#.l#ngj#v#.l#ngj#v#.l#ngj#v#.l#ngj#v#.l#ngj#v#.l#ngj#v#.l#ngj#v#.l#ngj#v#.l#ngj#v#.l#ngj#v#.l#ngj#v#.l#ngj#v#.l#ngj#v#.l#ngj#v#.l#ngj#v#.l#ngj#v#.l#ngj#v#.l#ngj#v#.l#ngj#v#.l#ngj#v#.l#ngj#v#.l#ngj#v#.l#ngj#v#.l#nginterface java.io.Serializabl$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test38335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest76.test38335");
        java.util.Locale locale1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.apache.commons.lang3.StringUtils.lowerCase("jAVAAAAAAAAAAVA.LANG..", locale1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test38336() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest76.test38336");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.split("ArrayList", 'a');
        java.lang.String str5 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray3, "... AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA... AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA... AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA... AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA... AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA... AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA... AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA... AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA... AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA... AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA");
        boolean boolean6 = org.apache.commons.lang3.StringUtils.startsWithAny("     A..ayL A.44444444444444444444444444      ", strArray3);
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray3, "GNAL");
        int int9 = org.apache.commons.lang3.StringUtils.indexOfDifference((java.lang.CharSequence[]) strArray3);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Arr... AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA... AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA... AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA... AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA... AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA... AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA... AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA... AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA... AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA... AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAyList" + "'", str5, "Arr... AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA... AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA... AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA... AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA... AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA... AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA... AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA... AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA... AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA... AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAyList");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "ArrGNALyList" + "'", str8, "ArrGNALyList");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test38337() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest76.test38337");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.substring("...O.gnal.avaj ssalcr4444444444444444444444444444444444444444444444444444444444444444444444444444444", 106, 788);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test38338() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest76.test38338");
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.replace("JAVA.IO.sERIALIZABLE JAVA.LANG.cLONEABLEsTRINGINTERFACE INTERFACE", "irfCo$irfioSriizaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "$         44444444444444444444444444444444444444444444444444444444444444444444444444444444                                                           ...sAitUJAirtSsAijavaulainterface java.lang.Cloneable4interface java.io.Serializable...sAitUJAirtSsAijavaulainterface java.lang.Cloneable4interface java.io.Serializable...sAitUJAirtSsAijavaulainterface java.lang.Cloneable4interface java.io.Serializable...sAitUJAirtSsAijavaulainterface java.lang.Cloneable4interface java.io.Serializabl", 948);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "JAVA.IO.sERIALIZABLE JAVA.LANG.cLONEABLEsTRINGINTERFACE INTERFACE" + "'", str4, "JAVA.IO.sERIALIZABLE JAVA.LANG.cLONEABLEsTRINGINTERFACE INTERFACE");
    }

    @Test
    public void test38339() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest76.test38339");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.center("", 348, 'a');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa" + "'", str3, "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
    }

    @Test
    public void test38340() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest76.test38340");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("siLyarrA.La...");
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test38341() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest76.test38341");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeStartIgnoreCase("4444444444444JAVASTRINGSLITUGNIRTSARRAYLISTARRAYLISTAVAJ.GNALARRAYLISTARRAYLISTARRAYLI44444444444444", "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "4444444444444JAVASTRINGSLITUGNIRTSARRAYLISTARRAYLISTAVAJ.GNALARRAYLISTARRAYLISTARRAYLI44444444444444" + "'", str2, "4444444444444JAVASTRINGSLITUGNIRTSARRAYLISTARRAYLISTAVAJ.GNALARRAYLISTARRAYLISTARRAYLI44444444444444");
    }

    @Test
    public void test38342() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest76.test38342");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replace("444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444INTERFACE JAVA.LANG.CLONEABLE4IGNIRTINTERFACE JAVA.LANG", "SeriaA..AYLA", "                                                                                                                                                                                                                                                                                                                                                                                                                                    aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa                                                                                                                                                                                                                                                                                                                                                                                                                                    ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444INTERFACE JAVA.LANG.CLONEABLE4IGNIRTINTERFACE JAVA.LANG" + "'", str3, "444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444INTERFACE JAVA.LANG.CLONEABLE4IGNIRTINTERFACE JAVA.LANG");
    }

    @Test
    public void test38343() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest76.test38343");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.center("aaaaaaaINTEGERaaaaaaa", 34, '4');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "444444aaaaaaaINTEGERaaaaaaa4444444" + "'", str3, "444444aaaaaaaINTEGERaaaaaaa4444444");
    }

    @Test
    public void test38344() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest76.test38344");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOf("JAVA.LANGAVAJ.GNALJAVA.LANGAVAJ.GNALJAVA.LANGAVAJ.GNALJAVA.LANGAVAJ.GNALJAVA.LANGAVAJ.GNALJAVA.LANGAVAJ.GNALJAVA.LANGAVAJ.GNALJAVA.LANGAVAJ.GNALJAVA.LANG", 303, 486);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test38345() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest76.test38345");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass1 = org.apache.commons.lang3.ClassUtils.getClass("interface java.lang.cloneablestringinterface java.io");
            org.junit.Assert.fail("Expected exception of type java.lang.ClassNotFoundException; message: interfacejava.lang.cloneablestringinterfacejava.io");
        } catch (java.lang.ClassNotFoundException e) {
            // Expected exception.
        }
    }

    @Test
    public void test38346() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest76.test38346");
        int int2 = org.apache.commons.lang3.StringUtils.countMatches("EABLELANG.GNALJAVA.LAN", "ssalc gnirtsagnalaavaj");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test38347() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest76.test38347");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceChars(".............................................................................................................................................................................................................................................................................................................................................................................................................................................jAV..............................................................................................................................................................................................................................................................................................................................................................................................................................................", "saylavv", "4444444444444444444444444444444444444444444444444444444444444444444444444444444N4444444444444444444444444444444444444444444444444444444444444444444444444444444");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + ".............................................................................................................................................................................................................................................................................................................................................................................................................................................jAV.............................................................................................................................................................................................................................................................................................................................................................................................................................................." + "'", str3, ".............................................................................................................................................................................................................................................................................................................................................................................................................................................jAV..............................................................................................................................................................................................................................................................................................................................................................................................................................................");
    }

    @Test
    public void test38348() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest76.test38348");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBeforeLast("", "A$L.AVAj  ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test38349() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest76.test38349");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNumeric((java.lang.CharSequence) "CLASSSLITUGNIRTSSLITUGNIRTSSLITUGNIRTSSLITUGNIRTSSLITUGNIRTSSLITUGNIRUTILsTRING.UTILsTRING-1JAVA.-1JAVACLASSSLITUGNIRTSSLITUGNIRTSSLITUGNIRTSSLITUGNIRTSSLITUGNIRTSSLITUGNIRT");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test38350() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest76.test38350");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.lowerCase("ArrayListArrayListArrayListavaj.gnal                                                                                                                                         ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "arraylistarraylistarraylistavaj.gnal                                                                                                                                         " + "'", str1, "arraylistarraylistarraylistavaj.gnal                                                                                                                                         ");
    }

    @Test
    public void test38351() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest76.test38351");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.endsWith("interface java.lang.CloneableVAJhi!ArrayLis.       444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444", "AAAAAAAAAAAAAAAAAAAAAAAAA...1AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA...1AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA...1AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA...1AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA...1AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA...1AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test38352() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest76.test38352");
        int int1 = org.apache.commons.lang3.StringUtils.length((java.lang.CharSequence) "agnAAAAAAAAAA");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 13 + "'", int1 == 13);
    }

    @Test
    public void test38353() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest76.test38353");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trimToNull("rLLryLiyyALLryLiyyALLryLiyyrrrALrAriiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiAv");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "rLLryLiyyALLryLiyyALLryLiyyrrrALrAriiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiAv" + "'", str1, "rLLryLiyyALLryLiyyALLryLiyyrrrALrAriiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiAv");
    }

    @Test
    public void test38354() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest76.test38354");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.rightPad("ASALYAVV", 788);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "ASALYAVV                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                            " + "'", str2, "ASALYAVV                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                            ");
    }

    @Test
    public void test38355() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest76.test38355");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceChars("                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                        iRFCO.IRFIOSRIIZ", '4', ' ');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                        iRFCO.IRFIOSRIIZ" + "'", str3, "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                        iRFCO.IRFIOSRIIZ");
    }

    @Test
    public void test38356() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest76.test38356");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBefore("############################...", "                                                                                                                                                                                                                                                                  ###########################################################################################################################################gn gnal.avaj                                                                                                                                                                                                                                                                  ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "############################..." + "'", str2, "############################...");
    }

    @Test
    public void test38357() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest76.test38357");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAllLowerCase((java.lang.CharSequence) "                                                                  AVAJECAFRETNI                                                                   ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test38358() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest76.test38358");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.split("javastringnalarraylistarraylistarraylistavaj.gnalarraylistarraylistarrayli", "     AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA");
        java.lang.String str6 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray2, ' ', 70, (int) ' ');
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str10 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray2, '4', 325, 665);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 325");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
    }

    @Test
    public void test38359() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest76.test38359");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass1 = org.apache.commons.lang3.ClassUtils.getClass("interface java.lang.Cloneable4interface java.io.Serializableaa ");
            org.junit.Assert.fail("Expected exception of type java.lang.ClassNotFoundException; message: interfacejava.lang.Cloneable4interfacejava.io.Serializableaa");
        } catch (java.lang.ClassNotFoundException e) {
            // Expected exception.
        }
    }

    @Test
    public void test38360() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest76.test38360");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.swapCase("$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$vaj.gnaljava.langavaj.gnaljava.langavaj.gnaljava.langavaj.gnaljava.langavaj.gnaljava.langavaj.gnaljava.lang$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$VAJ.GNALJAVA.LANGAVAJ.GNALJAVA.LANGAVAJ.GNALJAVA.LANGAVAJ.GNALJAVA.LANGAVAJ.GNALJAVA.LANGAVAJ.GNALJAVA.LANG$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$" + "'", str1, "$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$VAJ.GNALJAVA.LANGAVAJ.GNALJAVA.LANGAVAJ.GNALJAVA.LANGAVAJ.GNALJAVA.LANGAVAJ.GNALJAVA.LANGAVAJ.GNALJAVA.LANG$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$");
    }

    @Test
    public void test38361() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest76.test38361");
        java.lang.String[] strArray2 = new java.lang.String[] { "                                   " };
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.getCommonPrefix(strArray2);
        java.lang.String[] strArray7 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("NTERFACEJAVA.LANG.cLONEABLE.......JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVAINTERFACEJAVA.IO.sERIALIZABLE", ".       .       .       .       .       .       .       .       .       .       .       .       .       .       .       .       .       .       .       .       .       .       .       .       .       .       .       .       .       .       .       .       .       .       .       .       .       .       .       .       .       .       .       .       .       .       .       .       .       .       .       .       .       .       .       .       .       .       .       .       .       .       .       .       .       .       .       .       .       .       .       .       .       .       .       .       .       .       .       .       .       .       .       .       .       .       .       .       .       .       .       .       .       .       .       .       .       .       .       .       ", 159);
        int int8 = org.apache.commons.lang3.StringUtils.indexOfDifference((java.lang.CharSequence[]) strArray7);
        java.lang.String str9 = org.apache.commons.lang3.StringUtils.replaceEach("tsiLyarrA.La.langtsiLyarrA.La.langtsiLyarrA.La.langtsiLyarrA.La.langtsiLyarrA.La.langtsiLyarrA.La.langtsiLyarrA.La.langtsiLyarrA.La.lang", strArray2, strArray7);
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
        java.lang.String str40 = org.apache.commons.lang3.StringUtils.concat((java.lang.Object[]) wildcardClassArray31);
        java.lang.Class[] classArray42 = new java.lang.Class[0];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray43 = (java.lang.Class<?>[]) classArray42;
        java.lang.Class<?>[] wildcardClassArray44 = org.apache.commons.lang3.ClassUtils.primitivesToWrappers(wildcardClassArray43);
        boolean boolean45 = org.apache.commons.lang3.ClassUtils.isAssignable(wildcardClassArray31, wildcardClassArray44);
        java.lang.String str47 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) wildcardClassArray31, '#');
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
        java.lang.Class<?> wildcardClass69 = null;
        java.lang.Class[] classArray71 = new java.lang.Class[1];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray72 = (java.lang.Class<?>[]) classArray71;
        wildcardClassArray72[0] = wildcardClass69;
        java.lang.Class[] classArray76 = new java.lang.Class[0];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray77 = (java.lang.Class<?>[]) classArray76;
        boolean boolean79 = org.apache.commons.lang3.ClassUtils.isAssignable(wildcardClassArray72, wildcardClassArray77, false);
        boolean boolean80 = org.apache.commons.lang3.ClassUtils.isAssignable(wildcardClassArray62, wildcardClassArray77);
        boolean boolean82 = org.apache.commons.lang3.ClassUtils.isAssignable(wildcardClassArray31, wildcardClassArray77, false);
        boolean boolean83 = org.apache.commons.lang3.ClassUtils.isAssignable(wildcardClassArray10, wildcardClassArray31);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "                                   " + "'", str3, "                                   ");
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "tsiLyarrA.La.langtsiLyarrA.La.langtsiLyarrA.La.langtsiLyarrA.La.langtsiLyarrA.La.langtsiLyarrA.La.langtsiLyarrA.La.langtsiLyarrA.La.lang" + "'", str9, "tsiLyarrA.La.langtsiLyarrA.La.langtsiLyarrA.La.langtsiLyarrA.La.langtsiLyarrA.La.langtsiLyarrA.La.langtsiLyarrA.La.langtsiLyarrA.La.lang");
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
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "" + "'", str40, "");
        org.junit.Assert.assertNotNull(classArray42);
        org.junit.Assert.assertNotNull(wildcardClassArray43);
        org.junit.Assert.assertNotNull(wildcardClassArray44);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertEquals("'" + str47 + "' != '" + "" + "'", str47, "");
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
        org.junit.Assert.assertNotNull(classArray71);
        org.junit.Assert.assertNotNull(wildcardClassArray72);
        org.junit.Assert.assertNotNull(classArray76);
        org.junit.Assert.assertNotNull(wildcardClassArray77);
        org.junit.Assert.assertTrue("'" + boolean79 + "' != '" + false + "'", boolean79 == false);
        org.junit.Assert.assertTrue("'" + boolean80 + "' != '" + false + "'", boolean80 == false);
        org.junit.Assert.assertTrue("'" + boolean82 + "' != '" + false + "'", boolean82 == false);
        org.junit.Assert.assertTrue("'" + boolean83 + "' != '" + false + "'", boolean83 == false);
    }

    @Test
    public void test38362() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest76.test38362");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("][ssalC                         ", "G.JAVAGNAL.AVAJLANG.J");
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test38363() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest76.test38363");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.split("interfacejava.lang.Cloneable#interfacejava.io");
        java.lang.String str6 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray2, "class java.lang.Class                       JAVAULANG                       JAVAULANG                       JAVAULANG                       JAVAULANG                       JAVAULANG                       JAVAULANG                       JAVAULANG                       JAVAULANG                       JAVAULANG                       JAVAULANG                       JAVAULANG                       JAVAULANG                       JAVAULANG                       JAVAULANG                       JAVAULANG                       JAVAULANG                       JAVAULANG                       JAVAULANG                       JAVAULANG                       JAVAULANG        ", 578, 523);
        java.lang.String[] strArray9 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                           ", "h!ih!ih!ih!ih!ih!va.langavaj.gnaljava.langavaj.gnaljava.langavaj.gnaljava.langavaj.gnaljava.langavaj.gnaljava.langh!ih!ih!ih!ih!ih!");
        java.lang.String str10 = org.apache.commons.lang3.StringUtils.replaceEach("...4444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444...", strArray2, strArray9);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(strArray9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "...4444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444..." + "'", str10, "...4444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444...");
    }

    @Test
    public void test38364() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest76.test38364");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.endsWith("ArrayListArrayListArrayListArrayLis", "ELBAZILAIREs");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test38365() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest76.test38365");
        java.lang.String[] strArray5 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("...", "                                   ", (int) 'a');
        java.lang.String str9 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray5, "                                   ", (int) 'a', (int) '4');
        boolean boolean10 = org.apache.commons.lang3.StringUtils.startsWithAny(" String  ", strArray5);
        java.lang.String[] strArray12 = org.apache.commons.lang3.StringUtils.splitByCharacterType("aaaaaaa       INTEGER        aaaaaaa                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                            ");
        java.lang.String str13 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray12);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str14 = org.apache.commons.lang3.StringUtils.replaceEachRepeatedly("ss java.lang.Stringu.................................u.................................u.................................u.....................Lass j...stg.JAVA.L$ArrayListg.JAVA.L$ArrayListg.JAVA.L$ArrayListg.JAVA.L$ArrayListg.JAVA.L$ArrayListg.JAVA.L$ArrayListg.JAVA.L$ArrayListg.JAVA.L$ArrayListg.JAVA.L$ArrayListg.JAVA.L$ArrayListg.JAVA.L$ArrayListg.JAVA.L$Ar...tssaijavaulainterface java.lang.cloneable4interface java.io.serializable...saitujairtssaijavaulainterface java.lang.cloneable4interface java.io.serializable...saitujairtssaijavaulainterface java.lang.cloneable4interface java.io.serializablLass java.lang.Stringu.................................u.................................u.................................u.....................Lass java.lang.Stringu.................................u............................", strArray5, strArray12);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Search and Replace array lengths don't match: 1 vs 6");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(strArray12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "aaaaaaa       INTEGER        aaaaaaa                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                            " + "'", str13, "aaaaaaa       INTEGER        aaaaaaa                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                            ");
    }

    @Test
    public void test38366() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest76.test38366");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.upperCase(".............................................................................................................................................................................................................................................................................................................................................................................................................................................jAV..............................................................................................................................................................................................................................................................................................................................................................................................................................................");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + ".............................................................................................................................................................................................................................................................................................................................................................................................................................................JAV.............................................................................................................................................................................................................................................................................................................................................................................................................................................." + "'", str1, ".............................................................................................................................................................................................................................................................................................................................................................................................................................................JAV..............................................................................................................................................................................................................................................................................................................................................................................................................................................");
    }

    @Test
    public void test38367() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest76.test38367");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.abbreviate("JAVALITUJAVALITUJAVALITUJAVALITUJAVALITUJAVALITUJAVALITUJAVALITUJAVALITUJAVALITUJAVALITUJAVALITUJAVALITUJAVALITUJAVALITUJAVALITUJAVALITUJAVALITUJAVALITUJAVALITUJAVALITUJAVALITUJAVALITUJAVALITUJAVALITUJAVALITUJAVALITUJAVALITUJAVALITUJAVALITUJAVALITUJAVALITUJAVALITUJAVALITUJAVALITUJAVALITUJAVALITUJAVALITUJAVALITUJAVALITUJAVALITUJAVALITUJAVALITUJAVALITUJAVALITUJAVALITUJAVALITUJAVALITUJAVALITUJAVALITUJAVALITUJAVALITUJAVALITUJAVALITUJAVALITUJAVALITUJAVALITUJAVALITUJAVALITUJAVALITUJAVALITUJAVALITUJAVALITUJAVALITUJAVALITUJAVALITUJAVALITUJAVALITUJAVALITU", 145);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "JAVALITUJAVALITUJAVALITUJAVALITUJAVALITUJAVALITUJAVALITUJAVALITUJAVALITUJAVALITUJAVALITUJAVALITUJAVALITUJAVALITUJAVALITUJAVALITUJAVALITUJAVALI..." + "'", str2, "JAVALITUJAVALITUJAVALITUJAVALITUJAVALITUJAVALITUJAVALITUJAVALITUJAVALITUJAVALITUJAVALITUJAVALITUJAVALITUJAVALITUJAVALITUJAVALITUJAVALITUJAVALI...");
    }

    @Test
    public void test38368() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest76.test38368");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByCharacterType("####");
        java.lang.Class<?>[] wildcardClassArray3 = org.apache.commons.lang3.ClassUtils.toClass((java.lang.Object[]) strArray2);
        java.lang.String str5 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray2, ' ');
        java.lang.String[] strArray9 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("h!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ihLITU.AVAJ", "#", 33);
        java.lang.String[] strArray10 = org.apache.commons.lang3.StringUtils.stripAll(strArray9);
        java.lang.String str11 = org.apache.commons.lang3.StringUtils.replaceEachRepeatedly("AVAJ.GNALNaaaaaaaaaaJAVAL.AGNaaaaaaaaaaJAVAL.AGNaaaaaaaaaaJAVAL.AGNaaaaaaaaaaJAVAL.AGNaaaaaaaaaaJAVAL.AGNaaaaaaaaaaJAVAL.AGNaaaaaaaaaaJAVAL.AGNaaaaaaaaaaJAVAL.AGNaaaaaaaaaaJAVAL.AGNaaaaaaaaaaJAVAL.AGNaaaaaaaaaaJAVAL.AGNaaaaaaaaaaJAVAL.AGNaaaaaaaaaaJAVAL.AGNaaaaaaaaaaJAVAL.AGNaaaaaaaaaaJAVAL.AGNaaaaaaaaaaJAVAL.AGNaaaaaaaaaaJAVAL.AGNaaaaaaaaaaJAVAL.AGNaaaaaaaaaaJAVAL.AGNaaaaaaaaaaJAVAL.AGNaaaaaaaaaaJAVAL.AGNaaaaaaaaaaJAVAL.AGNaaaaaaaaaaJAVAL.AGNaaaaaaaaaaJAVAL.AGNaaaaaaaaaaJAVAL.AGNaaaaaaaaaaJAVAL.AGNaaaaaaaaaaJAVAL.AGNaaaaaaaaaaJAVAL.AGNaaaaaaaaaaJAVAL.AGNaaaaaaaaaaJAVAL.AGNaaaaaaaaaaJAVAL.AGNaaaaaaaaaaJAVAL.AGNaaaaaaaaaaJAVAL.AGNaaaaaaaaaaJAVAL.AGNaaaaaaaaaa", strArray2, strArray9);
        int int12 = org.apache.commons.lang3.StringUtils.indexOfDifference((java.lang.CharSequence[]) strArray9);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertNotNull(wildcardClassArray3);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "####" + "'", str5, "####");
        org.junit.Assert.assertNotNull(strArray9);
        org.junit.Assert.assertNotNull(strArray10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "AVAJ.GNALNaaaaaaaaaaJAVAL.AGNaaaaaaaaaaJAVAL.AGNaaaaaaaaaaJAVAL.AGNaaaaaaaaaaJAVAL.AGNaaaaaaaaaaJAVAL.AGNaaaaaaaaaaJAVAL.AGNaaaaaaaaaaJAVAL.AGNaaaaaaaaaaJAVAL.AGNaaaaaaaaaaJAVAL.AGNaaaaaaaaaaJAVAL.AGNaaaaaaaaaaJAVAL.AGNaaaaaaaaaaJAVAL.AGNaaaaaaaaaaJAVAL.AGNaaaaaaaaaaJAVAL.AGNaaaaaaaaaaJAVAL.AGNaaaaaaaaaaJAVAL.AGNaaaaaaaaaaJAVAL.AGNaaaaaaaaaaJAVAL.AGNaaaaaaaaaaJAVAL.AGNaaaaaaaaaaJAVAL.AGNaaaaaaaaaaJAVAL.AGNaaaaaaaaaaJAVAL.AGNaaaaaaaaaaJAVAL.AGNaaaaaaaaaaJAVAL.AGNaaaaaaaaaaJAVAL.AGNaaaaaaaaaaJAVAL.AGNaaaaaaaaaaJAVAL.AGNaaaaaaaaaaJAVAL.AGNaaaaaaaaaaJAVAL.AGNaaaaaaaaaaJAVAL.AGNaaaaaaaaaaJAVAL.AGNaaaaaaaaaaJAVAL.AGNaaaaaaaaaaJAVAL.AGNaaaaaaaaaaJAVAL.AGNaaaaaaaaaa" + "'", str11, "AVAJ.GNALNaaaaaaaaaaJAVAL.AGNaaaaaaaaaaJAVAL.AGNaaaaaaaaaaJAVAL.AGNaaaaaaaaaaJAVAL.AGNaaaaaaaaaaJAVAL.AGNaaaaaaaaaaJAVAL.AGNaaaaaaaaaaJAVAL.AGNaaaaaaaaaaJAVAL.AGNaaaaaaaaaaJAVAL.AGNaaaaaaaaaaJAVAL.AGNaaaaaaaaaaJAVAL.AGNaaaaaaaaaaJAVAL.AGNaaaaaaaaaaJAVAL.AGNaaaaaaaaaaJAVAL.AGNaaaaaaaaaaJAVAL.AGNaaaaaaaaaaJAVAL.AGNaaaaaaaaaaJAVAL.AGNaaaaaaaaaaJAVAL.AGNaaaaaaaaaaJAVAL.AGNaaaaaaaaaaJAVAL.AGNaaaaaaaaaaJAVAL.AGNaaaaaaaaaaJAVAL.AGNaaaaaaaaaaJAVAL.AGNaaaaaaaaaaJAVAL.AGNaaaaaaaaaaJAVAL.AGNaaaaaaaaaaJAVAL.AGNaaaaaaaaaaJAVAL.AGNaaaaaaaaaaJAVAL.AGNaaaaaaaaaaJAVAL.AGNaaaaaaaaaaJAVAL.AGNaaaaaaaaaaJAVAL.AGNaaaaaaaaaaJAVAL.AGNaaaaaaaaaaJAVAL.AGNaaaaaaaaaaJAVAL.AGNaaaaaaaaaa");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
    }

    @Test
    public void test38369() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest76.test38369");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", ".........................................................................................................................................................................");
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test38370() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest76.test38370");
        int int3 = org.apache.commons.lang3.StringUtils.indexOf("", "$..........................................................................................................................................................................................................................................................................................................................", 56);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test38371() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest76.test38371");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.startsWithIgnoreCase("4444444444444AAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.ag", "Sho$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$rrayList$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$t");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test38372() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest76.test38372");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.leftPad("A Lya..A                                      ", 139, 'a');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaA Lya..A                                      " + "'", str3, "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaA Lya..A                                      ");
    }

    @Test
    public void test38373() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest76.test38373");
        int int3 = org.apache.commons.lang3.StringUtils.indexOfIgnoreCase("4444444444444444444444444444444444444444444444444444444ssssssssss4444444444444444444444444444444444444444", "...................................................................................................................................................Class", 486);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test38374() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest76.test38374");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.rightPad("Aaaaaaaaaaaa", 144, '$');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Aaaaaaaaaaaa$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$" + "'", str3, "Aaaaaaaaaaaa$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$");
    }

    @Test
    public void test38375() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest76.test38375");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfDifference((java.lang.CharSequence) "aaaaaaaaaaaa                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                              ", (java.lang.CharSequence) "                                                                 ");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test38376() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest76.test38376");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass2 = org.apache.commons.lang3.ClassUtils.getClass(".langjava.langjava.langjava.langjava...................................................................................................", true);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassNotFoundException; message: /langjava/langjava/langjava/langjava///////////////////////////////////////////////////////////////////////////////////////////////////");
        } catch (java.lang.ClassNotFoundException e) {
            // Expected exception.
        }
    }

    @Test
    public void test38377() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest76.test38377");
        java.lang.String[] strArray5 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("tsiLyarrA.La.langtsiLyarrA.La.langtsiLyarrA.La.langtsiLyarrA.La.langtsiLyarrA.La.langtsiLyarrA.La.langtsiLyarrA.La.langtsiLyarrA.La.lang", "JAVA.LANG", 67);
        boolean boolean6 = org.apache.commons.lang3.StringUtils.endsWithAny("gnal.avajgnal..LANGgnal.avajgnal", strArray5);
        int int7 = org.apache.commons.lang3.StringUtils.indexOfAny("AAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAri", strArray5);
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
    }

    @Test
    public void test38378() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest76.test38378");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOfIgnoreCase("INTERFACEJAVA.LANG.cLONEABLE#INTERFACEJAVA.IOINTERFACEJAVA.LANG.cLONEABLE#INTERFACEJAVA.IOINTERFACEJAVA.LANG.cLONEABLE#INTERFACEJAVA.IOINTERFACEJAVABooleanINTERFACEJAVA.LANG.cLONEABLE#INTERFACEJAVA.IOINTERFACEJAVA.LANG.cLONEABLE#INTERFACEJAVA.IOINTERFACEJAVA.LANG.cLONEABLE#INTERFACEJAVA.IOINTERFACEJAVAIN$$$$$$$$$$$$$$$$$$$$$$$$$$$$$...$$$$$$$$$$$$$$$$$$$$$$$$$$$$$...$$$$$$$$$$$$$$$$$$$$$$$$$$aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaINTERFACEJAVA.LANG.cLONEABLE#INTERFACEJAVA.IOINTERFACEJAVA.LANG.cLONEABLE#INTERFACEJAVA.IOINTERFACEJAVA.LANG.cLONEABLE#INTERFACEJAVA.IOINTERFACEJAVABooleanINTERFACEJAVA.LANG.cLONEABLE#INTERFACEJAVA.IOINTERFACEJAVA.LANG.cLONEABLE#INTERFACEJAVA.IOINTERFACEJAVA.LANG.cLONEABLE#INTERFACEJAVA.IOINTERFACEJAVAIN", "uti");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test38379() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest76.test38379");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripToEmpty("...       OI.AVAJECAFRETNI#ELBAENOLc.GNAL.AVAJECAFRETNIsTRINGuTILSsTRINGuTILSsTRINGuTILSsTRINGuTILSsTRINGuTILSsTRINGuTILSsTRINGuTILSsTRINGuTILSsTRINGuTILSsTRINGuTILS");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "...       OI.AVAJECAFRETNI#ELBAENOLc.GNAL.AVAJECAFRETNIsTRINGuTILSsTRINGuTILSsTRINGuTILSsTRINGuTILSsTRINGuTILSsTRINGuTILSsTRINGuTILSsTRINGuTILSsTRINGuTILSsTRINGuTILS" + "'", str1, "...       OI.AVAJECAFRETNI#ELBAENOLc.GNAL.AVAJECAFRETNIsTRINGuTILSsTRINGuTILSsTRINGuTILSsTRINGuTILSsTRINGuTILSsTRINGuTILSsTRINGuTILSsTRINGuTILSsTRINGuTILSsTRINGuTILS");
    }

    @Test
    public void test38380() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest76.test38380");
        java.lang.String str1 = org.apache.commons.lang3.ClassUtils.getPackageCanonicalName("class java.util.AbstractList       .class java.util.AbstractCollection       .class java.lang.Object");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "classjava.util.AbstractList.classjava.util.AbstractCollection.classjava.lang" + "'", str1, "classjava.util.AbstractList.classjava.util.AbstractCollection.classjava.lang");
    }

    @Test
    public void test38381() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest76.test38381");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.containsWhitespace("AA...                                                                                                                                   ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test38382() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest76.test38382");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfAnyBut("Hi!ArrayLis", "44444444444444444444444444444444444444444444444444444444JAVA.LANGAgnal.avajgnal..LANGgnal.avJAVA.LANGAgnal.avajgnal..LANGgnal.avJAVA.LANGAgnal.avajgnal..LANGgnal.avJAVA.LANGAgnal.avajgnal..LANGgnal.avJAVA.LANGAgnal.avajgnal..LANGgnal.avJAVA.LANGAgnal.avajgnal..LANGgnal.avJAVA.LANGAgnal.avajgnal..LANGgnal.avJAVA.LANGAgnal.avajgnal..LANGgnal.avJAVA.LANGAgnal.avajgnal..LANGgnal.avJAVA.LANGAgnal.avajgnal.");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test38383() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest76.test38383");
        int int1 = org.apache.commons.lang3.StringUtils.length((java.lang.CharSequence) "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa                   GNAL.AVAJaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 540 + "'", int1 == 540);
    }

    @Test
    public void test38384() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest76.test38384");
        int int3 = org.apache.commons.lang3.StringUtils.indexOf("4", (int) '#', 448);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test38385() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest76.test38385");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsIgnoreCase("rrayListrrayListrrayListrrayListrrayListrrayListrrayListrrayListrrayListrra.    .aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaListrrayListrrayListrrayListrrayListrrayListrrayListrrayListrrayListrr", "A$L");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test38386() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest76.test38386");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("J4V4.L4NGJ4V4.L4NGJ4V4.L4NGJ4V4.L4NGJ4V4.L4NGJ4V4.L4                                                ", '#');
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test38387() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest76.test38387");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("A##RyLRsA##RyLRsA##RyLRsA##RyLRsA##        A##RyLRsA##RyLRsA##RyLRsA##RyLRsA##        A##RyLRsA##RyLRsA##RyLRsA##RyLRsA##        A##RyLRsA##RyLRsA##RyLRsA##RyLRsA##        A##RyLRsA##RyLRsA##RyLRsA##RyLRsA##        A##RyLRsA##RyLRsA##RyLRsA##RyLRsA##        A##RyLRsA##RyLRsA##RyLRsA##RyLRsA##        A##RyLRsA##RyLRsA##RyLRsA##RyLRsA##        A##RyLRsA##RyLRsA##RyLRsA##RyLRsA##        A##RyLRsA##RyLRsA##RyLRsA##RyLRsA##        A##RyLRsA##RyLRsA##RyLRsA##RyLRsA##        A##RyLRsA##RyLRsA##RyLRsA##RyLRsA##        A##RyLRsA##RyLRs                                    cafretni", "javaaaaaaaaaava.langava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava");
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray2, 'a');
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "A##RyLRsA##RyLRsA##RyLRsA##RyLRsA##        A##RyLRsA##RyLRsA##RyLRsA##RyLRsA##        A##RyLRsA##RyLRsA##RyLRsA##RyLRsA##        A##RyLRsA##RyLRsA##RyLRsA##RyLRsA##        A##RyLRsA##RyLRsA##RyLRsA##RyLRsA##        A##RyLRsA##RyLRsA##RyLRsA##RyLRsA##        A##RyLRsA##RyLRsA##RyLRsA##RyLRsA##        A##RyLRsA##RyLRsA##RyLRsA##RyLRsA##        A##RyLRsA##RyLRsA##RyLRsA##RyLRsA##        A##RyLRsA##RyLRsA##RyLRsA##RyLRsA##        A##RyLRsA##RyLRsA##RyLRsA##RyLRsA##        A##RyLRsA##RyLRsA##RyLRsA##RyLRsA##        A##RyLRsA##RyLRs                                    cafretni" + "'", str4, "A##RyLRsA##RyLRsA##RyLRsA##RyLRsA##        A##RyLRsA##RyLRsA##RyLRsA##RyLRsA##        A##RyLRsA##RyLRsA##RyLRsA##RyLRsA##        A##RyLRsA##RyLRsA##RyLRsA##RyLRsA##        A##RyLRsA##RyLRsA##RyLRsA##RyLRsA##        A##RyLRsA##RyLRsA##RyLRsA##RyLRsA##        A##RyLRsA##RyLRsA##RyLRsA##RyLRsA##        A##RyLRsA##RyLRsA##RyLRsA##RyLRsA##        A##RyLRsA##RyLRsA##RyLRsA##RyLRsA##        A##RyLRsA##RyLRsA##RyLRsA##RyLRsA##        A##RyLRsA##RyLRsA##RyLRsA##RyLRsA##        A##RyLRsA##RyLRsA##RyLRsA##RyLRsA##        A##RyLRsA##RyLRs                                    cafretni");
    }

    @Test
    public void test38388() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest76.test38388");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAllUpperCase((java.lang.CharSequence) "...VAULANGJAVAULANGJAVAULANGJAVAULANGJAVAULANG");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test38389() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest76.test38389");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNumeric((java.lang.CharSequence) "AVAJ.AVAJ.AVAJ.AJ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test38390() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest76.test38390");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("ELBAZILAIRES", "StringUtilsStringUtilsStringUtilsStringUtilsStringUtilsStringUtilsStringUtilsStringUtilsStringUtilsStringUtil", 28);
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void test38391() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest76.test38391");
        int int3 = org.apache.commons.lang3.StringUtils.lastOrdinalIndexOf("444444444444444444444444444.alya..arsoifri$ocfri", "interface java.lang.Cloneable.......java.......Objectava..........javainterface java.iointerface java.lang.Cloneable.......java.......Objectava..........javainterface java.iointerface java.lang.Cloneable.......ja                                                                                                            interface java.lang.Cloneable.......java.......Objectava..........javainterface java.iointerface java.lang.Cloneable.......java.......Objectava..........javainterface java.iointerface java.lang.Cloneable.......ja", 65);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test38392() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest76.test38392");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.split("lang.gnaljava.langavaj.gnaljava.langavaj.gnaljava.langavaj.gnaljava.la");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str5 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray1, 'a', 444, 905);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 444");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test38393() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest76.test38393");
        java.lang.CharSequence charSequence0 = null;
        boolean boolean2 = org.apache.commons.lang3.StringUtils.equals(charSequence0, (java.lang.CharSequence) "$         44444444444444444444444444444444444444444444444444444444444444444444444444444444                                                           ...sAitUJAirtSsAijavaulainterface java.lang.Cloneable4interface java.io.Serializable...sAitUJAirtSsAijavaulainterface java.lang.Cloneable4interface java.io.Serializable...sAitUJAirtSsAijavaulainterface java.lang.Cloneable4interface java.io.Serializable...sAitUJAirtSsAijavaulainterface java.lang.Cloneable4interface java.io.Serializabl");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test38394() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest76.test38394");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitByCharacterTypeCamelCase("..........a                       ..............................................................................a                       ..............................................................................a                       ..............................................................................a                       ..............................................................................a                       ..............................................................................a                       ..............................................................................a                       ..............................................................................a                       ..............................................................................a");
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test38395() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest76.test38395");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replace("Arr... aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa... aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa... aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa... aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa... aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa... aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa... aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa... aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa... aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa..", "gnalArrayListArrayListArrayLi                                                                       ", "AAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAja                                              AAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAring");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Arr... aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa... aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa... aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa... aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa... aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa... aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa... aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa... aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa... aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa.." + "'", str3, "Arr... aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa... aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa... aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa... aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa... aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa... aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa... aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa... aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa... aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa..");
    }

    @Test
    public void test38396() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest76.test38396");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.rightPad("arrNAL.AVAJNAL.AVAJNAL.AVAJNAL.AVAJNAL.AVAJNAL.", 24, '4');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "arrNAL.AVAJNAL.AVAJNAL.AVAJNAL.AVAJNAL.AVAJNAL." + "'", str3, "arrNAL.AVAJNAL.AVAJNAL.AVAJNAL.AVAJNAL.AVAJNAL.");
    }

    @Test
    public void test38397() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest76.test38397");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.startsWithIgnoreCase("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaagn                                            ", "                                      A..ayL a");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test38398() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest76.test38398");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.reverse("aaaaaaaaaaaaaaaaaaaaaalitu");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "utilaaaaaaaaaaaaaaaaaaaaaa" + "'", str1, "utilaaaaaaaaaaaaaaaaaaaaaa");
    }

    @Test
    public void test38399() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest76.test38399");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.split("gnal.avaj", "gnal.avaj", (int) (byte) -1);
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.stripAll(strArray3);
        java.lang.String str5 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray4);
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray4, "JAVAGNAL.AVAJLANG.JAVAGNAL.AVAJLANG.JAVAGNAL.AVAJLANG.JAVAGNAL.AVAJLANG.JAVAGNAL.AVAJLANG.JAVAGNAL.AVAJLANG.JAVAGNAL.AVAJLANG.JAVAGNAL.AVAJLANG. ArrayListArrayListArrayListavajGNAL");
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
    }

    @Test
    public void test38400() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest76.test38400");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfDifference((java.lang.CharSequence) "ARRAYLISTARRAYLISTARRAYLISTAVAJ.GNAL", (java.lang.CharSequence) "stri");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test38401() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest76.test38401");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOf("...hahactaRChahactaRChahactaRChahactaRChahactaRChahactaRChahactaRChahactaRChahactaRChahactaRChahactaRChaha...", "irfCo$irfioSrA..ayL.A.44444444444444444444444444", 788);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test38402() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest76.test38402");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.split("nterface java.lang.CloneableAvaj.gnalinterface java.io.Serializable");
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test38403() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest76.test38403");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.split("              ", "interface java.lang.cloneable.......java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........javainterface java.io.serializable", 0);
        java.lang.String str5 = org.apache.commons.lang3.ClassUtils.getShortCanonicalName((java.lang.Object) 0, "44444444444444444.444444444444444444");
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Integer" + "'", str5, "Integer");
    }

    @Test
    public void test38404() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest76.test38404");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBetween("NG.Llit                                                                                                                                 ", "44444444444444444444-1java444444444444444444444");
        org.junit.Assert.assertNull(str2);
    }

    @Test
    public void test38405() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest76.test38405");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringAfter("a..AYL A.44444444444444444444444444", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test38406() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest76.test38406");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("hinterface java.lang.cloneable4interface java.io.serializabl....1aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa...1aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa...1aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa...1aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa...1aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa...1aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa...1aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa...1aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa...1aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa...1aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "44444444444444444444444444444444444444444444444444444444444444444444444444       util");
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test38407() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest76.test38407");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.split("                                                                                      gNAL", "AVAJ.GNAL");
        boolean boolean4 = org.apache.commons.lang3.StringUtils.endsWithAny("interface java.lang.CloneableAvaj.gnalinterface java.io.Serializable", strArray3);
        java.lang.Class<?>[] wildcardClassArray5 = org.apache.commons.lang3.ClassUtils.toClass((java.lang.Object[]) strArray3);
        java.lang.Class<?>[] wildcardClassArray6 = org.apache.commons.lang3.ClassUtils.toClass((java.lang.Object[]) strArray3);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(wildcardClassArray5);
        org.junit.Assert.assertNotNull(wildcardClassArray6);
    }

    @Test
    public void test38408() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest76.test38408");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.substringBetween("GNALGNALGNALGNALGNALGNALGNALGNALGNALGNALGNALGNALGNALGNALGNALGNALGNALGNALGNALGNALGNALGNALGNALGNALGNALGNALGNALGNALGNAL.lang.lang.lang.lang.lang.lang.lLITUAVA.LA", "       GNALUAVAJ                       GNALUAVAJ                       GNALUAVAJ                       GNALUAVAJ                       GNALUAVAJ                       GNALUAVAJ                       GNALUAVAJ                       GNALUAVAJ                       GNALUAVAJ                       GNALUAVAJ                       GNALUAVAJ                       GNALUAVAJ                       GNALUAVAJ                       GNALUAVAJ                       GNALUAVAJ                       GNALUAVAJ                       GNALUAVAJ                       GNALUAVAJ                       GNALUAVAJ                       GNALUAVAJ                       SSALCGNALAVAJ SSALC", "...sjlaga.gL.AaagyLvsj...gL.AaagyLvsjlaga.gL.");
        org.junit.Assert.assertNull(str3);
    }

    @Test
    public void test38409() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest76.test38409");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOf("        GNALUAVAJ                       GNALUAVAJ                       GNALUAVAJ                       GNALUAVAJ                       GNALUAVAJ                       GNALUAVAJ                       GNALUAVAJ                       GNALUAVAJ                       GNALUAVAJ                       GNALUAVAJ                       GNALUAVAJ                       GNALUAVAJ                       GNALUAVAJ                       GNALUAVAJ                       GNALUAVAJ                       GNALUAVAJ                       GNALUAVAJ                       GNALUAVAJ                       GNALUAVAJ                       GNALUAVAJ                       SSALCGNALAVAJ SSALC", "GGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGnjavalagnGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGG");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test38410() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest76.test38410");
        int int2 = org.apache.commons.lang3.StringUtils.getLevenshteinDistance((java.lang.CharSequence) "interface#java.lang.Cloneable4interface#java.io.Serializableinterface#java.lang.Cloneable4interface#java.io.Serializableinterface#java.lang.Cloneable4interface#java.io.Serializableinterface#java.lang.Cloneable4interface#java.io.Serializableinterface#java.lang.Cloneable4interface#java.io.Serializableinterface#java.lang.Cloneable4interface#java.io.Serializableinterface#java.lang.Cloneable4interface#java.io.Serializableaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", (java.lang.CharSequence) "                              aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 355 + "'", int2 == 355);
    }

    @Test
    public void test38411() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest76.test38411");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringAfterLast("GGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGNJAVALAGNGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGG", "uti");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test38412() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest76.test38412");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isWhitespace((java.lang.CharSequence) "JAVA.UTILJAVA.UTILSTRINGCJAVA.UTILJAVA.UTILSTRINGCJAVA.UTILJAVA.UTILSTRINGCJAVA.UTILJAVA.UTILSTRINGCJAVA.UTILJAVA.UTILSTRINGCJAVA.UTILJAVA.UTILSTRINGCJAVA.UTILJAVA.UTILSTRINGCJAVA.UTILJAVA.UTILSTRINGCJAVA.UTILJAVA.UTILSTRINGCJAVA.UTILJAVA.UTILSTRINGCJAVA.UTILJAVA.UTILSTRINGCJAVA.UTILJAVA.UTILSTRINGCJAVA.UTILJAVA.UTILSTRINGCJAVA.UTILJAVA.UTILSTRINGCJAVA.UTILJAVA.UTILSTRINGCJAVA.UTILJAVA.UTILSTRINGCJAVA.UTILJAVA.UTILSTRINGCJAVA.UTILJAVA.UTILSTRINGCJAVA.UTILJAVA.UTILSTRINGCJAVA.UTILJAVA.UTILSTRINGCJAVA.UTILJAVA.UTILSTRINGCJAVA.UTILJAVA.UTILSTRINGCJAVA.UTILJAVA.UTIL");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test38413() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest76.test38413");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAllUpperCase((java.lang.CharSequence) "io                          ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test38414() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest76.test38414");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBetween("                                          $$$$$$$$$$$$$$$$$$$$$$$siLyarrA!iH                                         ", "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test38415() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest76.test38415");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.reverseDelimited("aaaaaa...interface java.lang.Cloneable.......java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........javainterface java.io.Serializableinterface java.lang.Cloneable.......java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........ja", 'a');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........javable.......jang.Clonea.lavace jableinterfaliza.io.Seriavace jainterfava..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........javable.......jang.Clonea.lavace ja...interf" + "'", str2, "..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........javable.......jang.Clonea.lavace jableinterfaliza.io.Seriavace jainterfava..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........javable.......jang.Clonea.lavace ja...interf");
    }

    @Test
    public void test38416() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest76.test38416");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfAnyBut("javal#####################", "       #############################################$$$$$$$$$$$$$$$$$$$$$$$$$$$$$...$$$$$$$$$$$$$$$$$$$$$$$$$$$$$...$$$$$$$$$$$$$$$$$$$$$$$$$$$$$...$$$$$$$$$$$$$$$$$$$");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test38417() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest76.test38417");
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("...", "                                   ", (int) 'a');
        java.lang.String[] strArray5 = org.apache.commons.lang3.StringUtils.stripAll(strArray4);
        java.lang.String str6 = org.apache.commons.lang3.StringUtils.getCommonPrefix(strArray5);
        java.lang.String[] strArray7 = org.apache.commons.lang3.StringUtils.stripAll(strArray5);
        java.lang.String[] strArray8 = org.apache.commons.lang3.StringUtils.stripAll(strArray5);
        java.lang.String str9 = org.apache.commons.lang3.StringUtils.concatWith("... java.lang.stringclass java.lang.stringclass...", (java.lang.Object[]) strArray8);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "..." + "'", str6, "...");
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "..." + "'", str9, "...");
    }

    @Test
    public void test38418() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest76.test38418");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.strip("gagnAAAAAAAAAAistArrayListArrayListavaj.gnalArrayListArrayListArrayLigagnAAAAAAAAAAistArrayListArrayListavaj.gnalArrayListArrayListArrayLigagnAAAAAAAAAAistArrayListArrayListavaj.gnalArrayListArrayListArrayLigagnAAAAAAAAAAistArrayListArrayListavaj.gnalArrayListArrayListArrayLigagnAAAAAAAAAAistArrayListArrayListavaj.gnalArrayListArrayListArrayLigagnAAAAAAAAAAistArrayListArrayListavaj.gnalArrayListArrayListArrayLigagnAAAAAAAAAAistArrayListArrayListavaj.gnalArrayListArrayListArrayLigagnAAAAAAAAAAistArrayListArrayListavaj.gnalArrayListArrayListArrayLigagnAAAAAAAAAAistArrayListArrayListavaj.gnalArrayListArrayListArrayLigagnAAAAAAAAAAistArrayListArrayListavaj.gnalArrayListArrayListArrayLigagnAAAAAAAAAAistArrayListArrayListavaj.gnalArrayListArrayListArrayLigagnAAAAAAAAAAistArrayListArrayListavaj.gnalArrayListArrayListArrayLigagnAAAAAAAAAAistinterface#java.lang.Cloneable#############Character#############interface#java.io.Serializable", "aaaaaaaaaaaaaaaLNuaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "gagnAAAAAAAAAAistArrayListArrayListavaj.gnalArrayListArrayListArrayLigagnAAAAAAAAAAistArrayListArrayListavaj.gnalArrayListArrayListArrayLigagnAAAAAAAAAAistArrayListArrayListavaj.gnalArrayListArrayListArrayLigagnAAAAAAAAAAistArrayListArrayListavaj.gnalArrayListArrayListArrayLigagnAAAAAAAAAAistArrayListArrayListavaj.gnalArrayListArrayListArrayLigagnAAAAAAAAAAistArrayListArrayListavaj.gnalArrayListArrayListArrayLigagnAAAAAAAAAAistArrayListArrayListavaj.gnalArrayListArrayListArrayLigagnAAAAAAAAAAistArrayListArrayListavaj.gnalArrayListArrayListArrayLigagnAAAAAAAAAAistArrayListArrayListavaj.gnalArrayListArrayListArrayLigagnAAAAAAAAAAistArrayListArrayListavaj.gnalArrayListArrayListArrayLigagnAAAAAAAAAAistArrayListArrayListavaj.gnalArrayListArrayListArrayLigagnAAAAAAAAAAistArrayListArrayListavaj.gnalArrayListArrayListArrayLigagnAAAAAAAAAAistinterface#java.lang.Cloneable#############Character#############interface#java.io.Serializable" + "'", str2, "gagnAAAAAAAAAAistArrayListArrayListavaj.gnalArrayListArrayListArrayLigagnAAAAAAAAAAistArrayListArrayListavaj.gnalArrayListArrayListArrayLigagnAAAAAAAAAAistArrayListArrayListavaj.gnalArrayListArrayListArrayLigagnAAAAAAAAAAistArrayListArrayListavaj.gnalArrayListArrayListArrayLigagnAAAAAAAAAAistArrayListArrayListavaj.gnalArrayListArrayListArrayLigagnAAAAAAAAAAistArrayListArrayListavaj.gnalArrayListArrayListArrayLigagnAAAAAAAAAAistArrayListArrayListavaj.gnalArrayListArrayListArrayLigagnAAAAAAAAAAistArrayListArrayListavaj.gnalArrayListArrayListArrayLigagnAAAAAAAAAAistArrayListArrayListavaj.gnalArrayListArrayListArrayLigagnAAAAAAAAAAistArrayListArrayListavaj.gnalArrayListArrayListArrayLigagnAAAAAAAAAAistArrayListArrayListavaj.gnalArrayListArrayListArrayLigagnAAAAAAAAAAistArrayListArrayListavaj.gnalArrayListArrayListArrayLigagnAAAAAAAAAAistinterface#java.lang.Cloneable#############Character#############interface#java.io.Serializable");
    }

    @Test
    public void test38419() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest76.test38419");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass1 = org.apache.commons.lang3.ClassUtils.getClass("irfSeriaCoSeria$SeriairfioSeriInterface java.lang.Cloneable             Character             interface java.io.SerializableirfSeriaCoSeria$SeriairfioSeria###################################################################################################################################################################################################################################################################################################");
            org.junit.Assert.fail("Expected exception of type java.lang.ClassNotFoundException; message: irfSeriaCoSeria$SeriairfioSeriInterfacejava.lang.CloneableCharacterinterfacejava.io.SerializableirfSeriaCoSeria$SeriairfioSeria###################################################################################################################################################################################################################################################################################################");
        } catch (java.lang.ClassNotFoundException e) {
            // Expected exception.
        }
    }

    @Test
    public void test38420() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest76.test38420");
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.replace("                                                                    aAAAAAAAAAAA                                  tractList$class java.util.AbstractCollection$class java.lang.Object", "                              ", "siLyrrA", 42);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "siLyrrAsiLyrrA        aAAAAAAAAAAAsiLyrrA    tractList$class java.util.AbstractCollection$class java.lang.Object" + "'", str4, "siLyrrAsiLyrrA        aAAAAAAAAAAAsiLyrrA    tractList$class java.util.AbstractCollection$class java.lang.Object");
    }

    @Test
    public void test38421() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest76.test38421");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.reverse("interface java.lang.Cloneable4interface java.io.Serializabl");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "lbazilaireS.oi.avaj ecafretni4elbaenolC.gnal.avaj ecafretni" + "'", str1, "lbazilaireS.oi.avaj ecafretni4elbaenolC.gnal.avaj ecafretni");
    }

    @Test
    public void test38422() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest76.test38422");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("AAAA                       JAVAULANGrrayList", "hi!ArrayLis");
        java.lang.String str5 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray3, '$');
        boolean boolean6 = org.apache.commons.lang3.StringUtils.endsWithAny("objec", strArray3);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "AAAA                       JAVAULANGrrayList" + "'", str5, "AAAA                       JAVAULANGrrayList");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test38423() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest76.test38423");
        int int3 = org.apache.commons.lang3.StringUtils.lastOrdinalIndexOf("                                                                                                                                                                                                                                                                                                                                                                ###################################################################################################################################################################################################################################################################################################################################################################################################################################################################                                   ", "                                                                                                                       4444444                                                                                            LlituLlituLlituLlituLlituLlituLlituLlituLlituLlituLlituLlituLlituLlituLlituLlituLlituLlituLlituLlituLlituLlituLlituLlituLlituLlituLlituLlituLlituLlituLlituLlituLlituLlituLlitu                                                                                                                                                  4444444                                                                                             ", 325);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test38424() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest76.test38424");
        java.lang.Object obj0 = null;
        java.lang.String str2 = org.apache.commons.lang3.ClassUtils.getShortClassName(obj0, "gnirtS.gnal.avajssalcgnirtS.gnal.avajssalcgnirtS.gnal.avajssalcgnirtS.gnal.avajssalcgnirtS.gnal.avajssalcArrayListArrayListArrayListavaj.gnaljava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.lang........java.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.lang........java.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.lang.......");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "gnirtS.gnal.avajssalcgnirtS.gnal.avajssalcgnirtS.gnal.avajssalcgnirtS.gnal.avajssalcgnirtS.gnal.avajssalcArrayListArrayListArrayListavaj.gnaljava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.lang........java.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.lang........java.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.lang......." + "'", str2, "gnirtS.gnal.avajssalcgnirtS.gnal.avajssalcgnirtS.gnal.avajssalcgnirtS.gnal.avajssalcgnirtS.gnal.avajssalcArrayListArrayListArrayListavaj.gnaljava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.lang........java.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.lang........java.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.lang.......");
    }

    @Test
    public void test38425() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest76.test38425");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.deleteWhitespace("############44444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "############44444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444" + "'", str1, "############44444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444");
    }

    @Test
    public void test38426() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest76.test38426");
        java.lang.Iterable<java.lang.Class<?>> wildcardClassIterable0 = null;
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.join(wildcardClassIterable0, ".........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........javainterfaceinterface java.lang.CloneableJAVAJAVAJAVAJAVAJAVAJAVAJAVAJAVAJAVAJAVAJAVAJAVAJAVAJAVAJAVAJAVAJAVAJAVAJAVAJAVAJAVAJAVAJAVAJAVAJAVAJAVAJAVAJAVAJAVAJAVAJAVAJAVAJAVAJAVAinterface java.io.Serializablejava.io");
        org.junit.Assert.assertNull(str2);
    }

    @Test
    public void test38427() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest76.test38427");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isWhitespace((java.lang.CharSequence) "interface java.lang.Cloneable.######################################################################interface java.io.Serializable");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test38428() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest76.test38428");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isWhitespace((java.lang.CharSequence) "Sho$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$rrayList$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$t");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test38429() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest76.test38429");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.abbreviateMiddle("AAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAri", "GNALgn", 108);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "AAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjavGNALgnnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAri" + "'", str3, "AAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjavGNALgnnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAri");
    }

    @Test
    public void test38430() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest76.test38430");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substring("                                                                           ..gnirtsavaJ                                                                           ", 36);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                       ..gnirtsavaJ                                                                           " + "'", str2, "                                       ..gnirtsavaJ                                                                           ");
    }

    @Test
    public void test38431() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest76.test38431");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.center("TSILYARRA.LA.LANGTSILYARRA.LA.LANGTSILYARRAJAVAAAAAAAAAAVA.LANGAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGA.LANGTSILYARRA.LA.LANGTSILYARRA.LA.LANG", 954);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                                                                                                                                                                                                                                                                                            TSILYARRA.LA.LANGTSILYARRA.LA.LANGTSILYARRAJAVAAAAAAAAAAVA.LANGAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGA.LANGTSILYARRA.LA.LANGTSILYARRA.LA.LANG                                                                                                                                                                                                                                                                                                            " + "'", str2, "                                                                                                                                                                                                                                                                                                            TSILYARRA.LA.LANGTSILYARRA.LA.LANGTSILYARRAJAVAAAAAAAAAAVA.LANGAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGA.LANGTSILYARRA.LA.LANGTSILYARRA.LA.LANG                                                                                                                                                                                                                                                                                                            ");
    }

    @Test
    public void test38432() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest76.test38432");
        int int2 = org.apache.commons.lang3.StringUtils.indexOf("", "a.Leyface javaAla..AClo.eableAAAAAAAjavaAAAAAAAObjecLavaAAAAAAAAAAjavaa.Leyface javaAaoASeyaalazable##################################################");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test38433() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest76.test38433");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.center("       .##javal###########################javal###########################javal###########################", 20, '.');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "       .##javal###########################javal###########################javal###########################" + "'", str3, "       .##javal###########################javal###########################javal###########################");
    }

    @Test
    public void test38434() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest76.test38434");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.rightPad("gnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalLANGLANGLANGLANGLANGLANGLlituava", 169, "                                                                                      g");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "gnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalLANGLANGLANGLANGLANGLANGLlituava                     " + "'", str3, "gnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalLANGLANGLANGLANGLANGLANGLlituava                     ");
    }

    @Test
    public void test38435() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest76.test38435");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.substringsBetween("cLASS", "#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#lss jv#lng#String", "class java.lang");
        org.junit.Assert.assertNull(strArray3);
    }

    @Test
    public void test38436() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest76.test38436");
        char[] charArray1 = null;
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsAny("INTEGER                                        ", charArray1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test38437() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest76.test38437");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("lang.gnaljava.langavaj.gnaljava.langavaj.gnaljava.langavaj.gnaljava.lalang.gnaljava.langavaj.gnaljava.langavaj.gnaljava.langavaj.gnaljava.lalang.gnaljava.langavaj.gnaljava.langavaj.gnaljava.langavaj.gnaljava.lalang.gnaljava.langavaj.gnaljava.langavaj.gnaljava.langavaj.gnaljava.lalang.gnaljava.langavaj.gnaljava.langavaj.gnaljava.langavaj.gnaljava.lalang.gnaljava.langavaj.gnaljava.langavaj.gnaljava.langavaj.gnaljava.lalang.gnaljava.langavaj.gnaljava.langavaj.gnaljava.langavaj.gnaljava.lalang.gnaljava.langavaj.gnaljava.langavaj.gnaljava.langavaj.gnaljava.lalang.gnaljava.ljAV");
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test38438() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest76.test38438");
        java.lang.String str1 = org.apache.commons.lang3.ClassUtils.getShortCanonicalName("ziirSoifri$oCfri");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "ziirSoifri.oCfri" + "'", str1, "ziirSoifri.oCfri");
    }

    @Test
    public void test38439() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest76.test38439");
        char[] charArray15 = new char[] { ' ', ' ', '#', 'a', '4', 'a' };
        int int16 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "", charArray15);
        boolean boolean17 = org.apache.commons.lang3.StringUtils.containsAny("......", charArray15);
        int int18 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "AAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAA", charArray15);
        int int19 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "JAVA.LANGAVAJ.GNALJAVA.LANGAVAJ.GNALJAVA.LANGAVAJ.GNALJAVA.LANGAVAJ.GNALJAVA.LANGAVAJ.GNALJAVA.LANGAVAJ.GNALJAVA.LANGAVAJ.GNALJAVA.LANGAVAJ.GNALJAVA.LANG", charArray15);
        boolean boolean20 = org.apache.commons.lang3.StringUtils.containsAny("gnal.avajgnal..LANGgnal.avajgnal.", charArray15);
        int int21 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "aaaaaaaaaajaval.agnaaaaaaaaaajaval.agnaaaaaaaaaajaval.agnaaaaaaaaaajaval.agnaaaaaaaaaajaval.agnaaaaaaaaaajaval.agnaaaaaaaaaajaval.agnaaaaaaaaaajaval.agnaaaaaaaaaajaval.agnaaaaaaaaaajaval.agnaaaaaaaaaajaval.agnaaaaaaaaaajaval.agnaaaaaaaaaaja                                              aaaaaaajaval.agnaaaaaaaaaajaval.agnaaaaaaaaaajaval.agnaaaaaaaaaajaval.agnaaaaaaaaaajaval.agnaaaaaaaaaajaval.agnaaaaaaaaaajaval.agnaaaaaaaaaajaval.agnaaaaaaaaaajaval.agnaaaaaaaaaajaval.agnaaaaaaaaaajaval.agnaaaaaaaaaajaval.agnaaaaaaaaaarin", charArray15);
        int int22 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "       aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", charArray15);
        int int23 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "-1JAVA.UTILSTRING[]", charArray15);
        boolean boolean24 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "                                 int", charArray15);
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
    public void test38440() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest76.test38440");
        java.lang.String[] strArray4 = new java.lang.String[] { "                                   " };
        java.lang.String str5 = org.apache.commons.lang3.StringUtils.getCommonPrefix(strArray4);
        int int6 = org.apache.commons.lang3.StringUtils.indexOfDifference((java.lang.CharSequence[]) strArray4);
        int int7 = org.apache.commons.lang3.StringUtils.lastIndexOfAny("...       ", strArray4);
        int int8 = org.apache.commons.lang3.StringUtils.indexOfAny("#                                             ", strArray4);
        int int9 = org.apache.commons.lang3.StringUtils.indexOfDifference((java.lang.CharSequence[]) strArray4);
        java.lang.String[] strArray13 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("hi!", "java.lang", (int) '.');
        java.lang.String str15 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray13, "slitUgnirtS");
        java.lang.String str16 = org.apache.commons.lang3.StringUtils.replaceEach("INTERFACE JAVA.LANG.cLONEABLEa RRR RRR RRR RRR RRR RRR RRR RRR RNAL....................INTERFACE JAVA.LANG.cLONEABLEa RRR RRR RRR RRR RRR RRR RRR RRR R", strArray4, strArray13);
        java.lang.String[] strArray18 = org.apache.commons.lang3.StringUtils.stripAll(strArray13, "4444444444444444444444");
        java.lang.String[] strArray19 = org.apache.commons.lang3.StringUtils.stripAll(strArray18);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "                                   " + "'", str5, "                                   ");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertNotNull(strArray13);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "INTERFACE JAVA.LANG.cLONEABLEa RRR RRR RRR RRR RRR RRR RRR RRR RNAL....................INTERFACE JAVA.LANG.cLONEABLEa RRR RRR RRR RRR RRR RRR RRR RRR R" + "'", str16, "INTERFACE JAVA.LANG.cLONEABLEa RRR RRR RRR RRR RRR RRR RRR RRR RNAL....................INTERFACE JAVA.LANG.cLONEABLEa RRR RRR RRR RRR RRR RRR RRR RRR R");
        org.junit.Assert.assertNotNull(strArray18);
        org.junit.Assert.assertNotNull(strArray19);
    }

    @Test
    public void test38441() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest76.test38441");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass2 = org.apache.commons.lang3.ClassUtils.getClass("                                                                                                                                                                                                                                               vvaylasa                                                                                                                                                                                                                                                ", false);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassNotFoundException; message: vvaylasa");
        } catch (java.lang.ClassNotFoundException e) {
            // Expected exception.
        }
    }

    @Test
    public void test38442() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest76.test38442");
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
        java.lang.Class<?>[] wildcardClassArray23 = org.apache.commons.lang3.ClassUtils.primitivesToWrappers(wildcardClassArray22);
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
        java.lang.String str39 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) wildcardClassArray31, "$", 18, (int) (byte) 1);
        java.lang.Class<?>[] wildcardClassArray40 = org.apache.commons.lang3.ClassUtils.wrappersToPrimitives(wildcardClassArray31);
        java.lang.String[] strArray43 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("class java.lang.String", "                                   ");
        java.lang.String[] strArray44 = org.apache.commons.lang3.StringUtils.stripAll(strArray43);
        java.lang.Class<?>[] wildcardClassArray45 = org.apache.commons.lang3.ClassUtils.toClass((java.lang.Object[]) strArray44);
        java.lang.String[] strArray47 = new java.lang.String[] { "                                   " };
        java.lang.String str48 = org.apache.commons.lang3.StringUtils.getCommonPrefix(strArray47);
        java.lang.Class<?>[] wildcardClassArray49 = org.apache.commons.lang3.ClassUtils.toClass((java.lang.Object[]) strArray47);
        java.lang.Class<?>[] wildcardClassArray50 = org.apache.commons.lang3.ClassUtils.primitivesToWrappers(wildcardClassArray49);
        boolean boolean52 = org.apache.commons.lang3.ClassUtils.isAssignable(wildcardClassArray45, wildcardClassArray49, false);
        java.lang.String str54 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) wildcardClassArray49, "");
        java.lang.String str55 = org.apache.commons.lang3.StringUtils.concat((java.lang.Object[]) wildcardClassArray49);
        boolean boolean56 = org.apache.commons.lang3.ClassUtils.isAssignable(wildcardClassArray31, wildcardClassArray49);
        java.lang.String[] strArray59 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("hi!", "");
        java.lang.String[] strArray61 = org.apache.commons.lang3.StringUtils.stripAll(strArray59, "$");
        java.lang.Class<?>[] wildcardClassArray62 = org.apache.commons.lang3.ClassUtils.toClass((java.lang.Object[]) strArray59);
        java.lang.Class<?>[] wildcardClassArray63 = org.apache.commons.lang3.ClassUtils.toClass((java.lang.Object[]) wildcardClassArray62);
        java.lang.Class<?>[] wildcardClassArray64 = org.apache.commons.lang3.ClassUtils.wrappersToPrimitives(wildcardClassArray63);
        java.lang.Class<?> wildcardClass65 = null;
        java.lang.Class[] classArray67 = new java.lang.Class[1];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray68 = (java.lang.Class<?>[]) classArray67;
        wildcardClassArray68[0] = wildcardClass65;
        java.lang.Class<?>[] wildcardClassArray71 = org.apache.commons.lang3.ClassUtils.primitivesToWrappers(wildcardClassArray68);
        boolean boolean73 = org.apache.commons.lang3.ClassUtils.isAssignable(wildcardClassArray64, wildcardClassArray71, true);
        java.lang.String str74 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) wildcardClassArray64);
        java.lang.String[] strArray78 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("...       ", "hi!", (int) (byte) 0);
        java.lang.String str79 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray78);
        java.lang.String[] strArray80 = org.apache.commons.lang3.StringUtils.stripAll(strArray78);
        java.lang.Class<?>[] wildcardClassArray81 = org.apache.commons.lang3.ClassUtils.toClass((java.lang.Object[]) strArray80);
        boolean boolean83 = org.apache.commons.lang3.ClassUtils.isAssignable(wildcardClassArray64, wildcardClassArray81, true);
        boolean boolean84 = org.apache.commons.lang3.ClassUtils.isAssignable(wildcardClassArray49, wildcardClassArray81);
        boolean boolean85 = org.apache.commons.lang3.ClassUtils.isAssignable(wildcardClassArray23, wildcardClassArray81);
        java.lang.Class<?>[] wildcardClassArray86 = org.apache.commons.lang3.ClassUtils.primitivesToWrappers(wildcardClassArray23);
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
        org.junit.Assert.assertNotNull(strArray25);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "                                   " + "'", str26, "                                   ");
        org.junit.Assert.assertNotNull(wildcardClassArray27);
        org.junit.Assert.assertNotNull(classArray30);
        org.junit.Assert.assertNotNull(wildcardClassArray31);
        org.junit.Assert.assertNotNull(wildcardClassArray34);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "" + "'", str39, "");
        org.junit.Assert.assertNotNull(wildcardClassArray40);
        org.junit.Assert.assertNotNull(strArray43);
        org.junit.Assert.assertNotNull(strArray44);
        org.junit.Assert.assertNotNull(wildcardClassArray45);
        org.junit.Assert.assertNotNull(strArray47);
        org.junit.Assert.assertEquals("'" + str48 + "' != '" + "                                   " + "'", str48, "                                   ");
        org.junit.Assert.assertNotNull(wildcardClassArray49);
        org.junit.Assert.assertNotNull(wildcardClassArray50);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + true + "'", boolean52 == true);
        org.junit.Assert.assertEquals("'" + str54 + "' != '" + "class java.lang.String" + "'", str54, "class java.lang.String");
        org.junit.Assert.assertEquals("'" + str55 + "' != '" + "class java.lang.String" + "'", str55, "class java.lang.String");
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + true + "'", boolean56 == true);
        org.junit.Assert.assertNotNull(strArray59);
        org.junit.Assert.assertNotNull(strArray61);
        org.junit.Assert.assertNotNull(wildcardClassArray62);
        org.junit.Assert.assertNotNull(wildcardClassArray63);
        org.junit.Assert.assertNotNull(wildcardClassArray64);
        org.junit.Assert.assertNotNull(classArray67);
        org.junit.Assert.assertNotNull(wildcardClassArray68);
        org.junit.Assert.assertNotNull(wildcardClassArray71);
        org.junit.Assert.assertTrue("'" + boolean73 + "' != '" + false + "'", boolean73 == false);
        org.junit.Assert.assertEquals("'" + str74 + "' != '" + "" + "'", str74, "");
        org.junit.Assert.assertNotNull(strArray78);
        org.junit.Assert.assertEquals("'" + str79 + "' != '" + "...       " + "'", str79, "...       ");
        org.junit.Assert.assertNotNull(strArray80);
        org.junit.Assert.assertNotNull(wildcardClassArray81);
        org.junit.Assert.assertTrue("'" + boolean83 + "' != '" + true + "'", boolean83 == true);
        org.junit.Assert.assertTrue("'" + boolean84 + "' != '" + true + "'", boolean84 == true);
        org.junit.Assert.assertTrue("'" + boolean85 + "' != '" + true + "'", boolean85 == true);
        org.junit.Assert.assertNotNull(wildcardClassArray86);
    }

    @Test
    public void test38443() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest76.test38443");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.abbreviate("4444444444444444chaa[]", 113);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "4444444444444444chaa[]" + "'", str2, "4444444444444444chaa[]");
    }

    @Test
    public void test38444() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest76.test38444");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.startsWith("INTERFACEJAVA.LANG.CLONEABLELANG.GNALJAVA.LANGAVAJ.GNALJAVA.LANGAVAJ.GNALJAVA.LANGAVAJ.GNALJAVA.LANGAVAJ.GNALJAVA.LANGAVAJ.GNALJAVA.LANGAVAJ.GNALJAVA.LANGAVAJ.GNALJAVA.LANGAVAJ.JAVAINTERFACEJAVA.IO.SERIALIZABLE", "CLASS JAVALANGCLASS                       JAVAULANG                       JAVAULANG                       JAVAULANG                       JAVAULANG                       JAVAULANG                       JAVAULANG                       JAVAULANG                       JAVAULANG                       JAVAULANG                       JAVAULANG                       JAVAULANG                       JAVAULANG                       JAVAULANG                       JAVAULANG                       JAVAULANG                       JAVAULANG                       JAVAULANG                       JAVAULANG                       JAVAULANG                       JAVAULANG        ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test38445() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest76.test38445");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens(".............java..........java..........java..........java..........java..........java..........java..........java..........java..........java...........");
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test38446() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest76.test38446");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAllLowerCase((java.lang.CharSequence) "gnalArrayListArrayListArrayL");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test38447() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest76.test38447");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceChars("                                  $$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$", '$', ' ');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "                                                                    " + "'", str3, "                                                                    ");
    }

    @Test
    public void test38448() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest76.test38448");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.abbreviate("A44444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444", 243);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "A44444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444..." + "'", str2, "A44444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444...");
    }

    @Test
    public void test38449() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest76.test38449");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.split("UTILSTRING.UTILSTRING-1JAVA.-1JAVA", "ulangrraylist                       javaulangrraylis", 63);
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void test38450() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest76.test38450");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNumericSpace((java.lang.CharSequence) "GNALSSILLAASSTAAASSILLAASSTAAASSILLAASST");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test38451() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest76.test38451");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.rightPad("b$YTE", 502);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "b$YTE                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                 " + "'", str2, "b$YTE                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                 ");
    }

    @Test
    public void test38452() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest76.test38452");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOfIgnoreCase("tsilyarrgn...", "gn lu v j                       ....................................................................");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test38453() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest76.test38453");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens(".........................................................................................................................................................................................................................................................................................................Airfco$irfiosriizcirfco$irfiosriizObirfco$irfiosriizecirfco$irfiosriizL..........................................................................................................................................................................................................................................................................................................", '4');
        boolean boolean4 = org.apache.commons.lang3.StringUtils.startsWithAny("", strArray3);
        java.lang.String str5 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray3);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + ".........................................................................................................................................................................................................................................................................................................Airfco$irfiosriizcirfco$irfiosriizObirfco$irfiosriizecirfco$irfiosriizL.........................................................................................................................................................................................................................................................................................................." + "'", str5, ".........................................................................................................................................................................................................................................................................................................Airfco$irfiosriizcirfco$irfiosriizObirfco$irfiosriizecirfco$irfiosriizL..........................................................................................................................................................................................................................................................................................................");
    }

    @Test
    public void test38454() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest76.test38454");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.strip("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa       Javaaaaaaaaaava.langava.langjava.langjava.langjava.la", "interface java.lang.Cloneable4iGNIRTinterface java.lang.Cloneable4i");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "J" + "'", str2, "J");
    }

    @Test
    public void test38455() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest76.test38455");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replace("... ... ... ... ... ... ... ... ...... ... ... ... ... ... ... ... ...... ... ... ... ... ... ... ...AAAAAAAAAAAAAAAAAAA      $$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$", "java.lang.Cloneable4interface java.io.Serializa", "CEAJ V AL ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "... ... ... ... ... ... ... ... ...... ... ... ... ... ... ... ... ...... ... ... ... ... ... ... ...AAAAAAAAAAAAAAAAAAA      $$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$" + "'", str3, "... ... ... ... ... ... ... ... ...... ... ... ... ... ... ... ... ...... ... ... ... ... ... ... ...AAAAAAAAAAAAAAAAAAA      $$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$");
    }

    @Test
    public void test38456() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest76.test38456");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripToNull("..........4444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444rclass java.lang.O...");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "..........4444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444rclass java.lang.O..." + "'", str1, "..........4444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444rclass java.lang.O...");
    }

    @Test
    public void test38457() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest76.test38457");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.abbreviateMiddle("hi!arraylistarraylistarraylistavaj.gnalarraylistarraylistarraylist", "                                    ", 717);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!arraylistarraylistarraylistavaj.gnalarraylistarraylistarraylist" + "'", str3, "hi!arraylistarraylistarraylistavaj.gnalarraylistarraylistarraylist");
    }

    @Test
    public void test38458() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest76.test38458");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfIgnoreCase(".lang.stringclass java.lang.stringclass java.lang.stringclas", "                                                                                                                                                                                                                             aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa                                                                                                                                                                                                                             ");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test38459() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest76.test38459");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBeforeLast("n", "jv..........jv..........jv4444444444..");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "n" + "'", str2, "n");
    }

    @Test
    public void test38460() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest76.test38460");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.reverse("                                                                                                                                                                                                                                             HI!ARRAYLISTARRAYLISTARRAYLISTAVAJ.GNALARRAYLISTARRAYLISTARRAYLISTAVAJ                                                                                                                                                                                                                                              ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "                                                                                                                                                                                                                                              JAVATSILYARRATSILYARRATSILYARRALANG.JAVATSILYARRATSILYARRATSILYARRA!IH                                                                                                                                                                                                                                             " + "'", str1, "                                                                                                                                                                                                                                              JAVATSILYARRATSILYARRATSILYARRALANG.JAVATSILYARRATSILYARRATSILYARRA!IH                                                                                                                                                                                                                                             ");
    }

    @Test
    public void test38461() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest76.test38461");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.substringBetween("                                        4444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444", "gn", "gnal.avaj ecafretni");
        org.junit.Assert.assertNull(str3);
    }

    @Test
    public void test38462() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest76.test38462");
        int int2 = org.apache.commons.lang3.StringUtils.getLevenshteinDistance((java.lang.CharSequence) "etyBetyBetyBetyBetyBetyBAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA...etyBetyBetyBetyBetyBetyBestststststststststststststststststststststststststststststststststststststststststststststststststststststststststststs", (java.lang.CharSequence) "...aaaaaaaaj v aaaaaaaaaaj v aaaaaaaaaaj v interf ceaj v aioaSeri liz ble");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 202 + "'", int2 == 202);
    }

    @Test
    public void test38463() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest76.test38463");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.startsWithIgnoreCase("java.langjava.langjava.langjava.langjava.langjava.la                                                ", "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test38464() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest76.test38464");
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
        java.lang.String str42 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) wildcardClassArray38, ' ', (int) '#', (int) (short) 0);
        java.lang.String str44 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) wildcardClassArray38, ' ');
        java.lang.Class<?>[] wildcardClassArray45 = org.apache.commons.lang3.ClassUtils.wrappersToPrimitives(wildcardClassArray38);
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
        java.lang.String str61 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) wildcardClassArray53, "$", 18, (int) (byte) 1);
        java.lang.Class<?>[] wildcardClassArray62 = org.apache.commons.lang3.ClassUtils.primitivesToWrappers(wildcardClassArray53);
        java.lang.Class<?>[] wildcardClassArray63 = org.apache.commons.lang3.ClassUtils.wrappersToPrimitives(wildcardClassArray62);
        boolean boolean64 = org.apache.commons.lang3.ClassUtils.isAssignable(wildcardClassArray38, wildcardClassArray62);
        java.lang.Class<?>[] wildcardClassArray65 = org.apache.commons.lang3.ClassUtils.wrappersToPrimitives(wildcardClassArray62);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str69 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) wildcardClassArray62, "Arr... AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA... AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA... AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA... AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA... AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA... AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA... AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA... AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA... AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA..", 262, 838);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
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
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "" + "'", str29, "");
        org.junit.Assert.assertNotNull(classArray31);
        org.junit.Assert.assertNotNull(wildcardClassArray32);
        org.junit.Assert.assertNotNull(wildcardClassArray33);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "" + "'", str36, "");
        org.junit.Assert.assertNotNull(wildcardClassArray37);
        org.junit.Assert.assertNotNull(wildcardClassArray38);
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "" + "'", str42, "");
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "" + "'", str44, "");
        org.junit.Assert.assertNotNull(wildcardClassArray45);
        org.junit.Assert.assertNotNull(strArray47);
        org.junit.Assert.assertEquals("'" + str48 + "' != '" + "                                   " + "'", str48, "                                   ");
        org.junit.Assert.assertNotNull(wildcardClassArray49);
        org.junit.Assert.assertNotNull(classArray52);
        org.junit.Assert.assertNotNull(wildcardClassArray53);
        org.junit.Assert.assertNotNull(wildcardClassArray56);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
        org.junit.Assert.assertEquals("'" + str61 + "' != '" + "" + "'", str61, "");
        org.junit.Assert.assertNotNull(wildcardClassArray62);
        org.junit.Assert.assertNotNull(wildcardClassArray63);
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + false + "'", boolean64 == false);
        org.junit.Assert.assertNotNull(wildcardClassArray65);
    }

    @Test
    public void test38465() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest76.test38465");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.left("", 136);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test38466() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest76.test38466");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.defaultString("JAVAULANGJAVAULANGJAVAULANGJAVAULANGJAVAULANGJAVAULANGJAVAULANGJAVAULANGJAVAULANGJAVAULANGJAVAULANGJAVAULANGJAVAULANGJAVAULANGJAVAULANGJAVAULANG", "JAVA.LANGaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "JAVAULANGJAVAULANGJAVAULANGJAVAULANGJAVAULANGJAVAULANGJAVAULANGJAVAULANGJAVAULANGJAVAULANGJAVAULANGJAVAULANGJAVAULANGJAVAULANGJAVAULANGJAVAULANG" + "'", str2, "JAVAULANGJAVAULANGJAVAULANGJAVAULANGJAVAULANGJAVAULANGJAVAULANGJAVAULANGJAVAULANGJAVAULANGJAVAULANGJAVAULANGJAVAULANGJAVAULANGJAVAULANGJAVAULANG");
    }

    @Test
    public void test38467() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest76.test38467");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.startsWith("Arralitu.avajlitu.avaj", ".........................................................................................................................................................................................................................................................................................................AIRFCO$IRFIOSRIIZCIRFCO$IRFIOSRIIZOBIRFCO$IRFIOSRIIZECIRFCO$IRFIOSRIIZL..........................................................................................................................................................................................................................................................................................................");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test38468() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest76.test38468");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripToNull("44444444444444444444444444444444444444444444444444444444444444444444444444444444$");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "44444444444444444444444444444444444444444444444444444444444444444444444444444444$" + "'", str1, "44444444444444444444444444444444444444444444444444444444444444444444444444444444$");
    }

    @Test
    public void test38469() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest76.test38469");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNumericSpace((java.lang.CharSequence) "vaj.gnalarraylistarraylistarraylitavaj.gnalarraylistarraylistarraylitavaj.gna...");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test38470() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest76.test38470");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.substringsBetween("JAVALITUAVAJLITUAVAJJAVALITUAVAJLITUAVAJJAVALITUAVAJLITUAVAJJAVALITUAVAJLITUAVAJJAVALITUAVAJLITUAVAJJAVALITUAVAJLITUAVAJJAVALITUAVAJLITUAVAJJAVALITUAVAJLITUAVAJJAVALITUAVAJLITUAVAJJAVALITUAVAJLITUAVAJJAVALITUAVAJLITUAVAJJAVALITUAVAJLITUAVAJJAVALITUAVAJLITUAVAJJAVALITUAVAJLITUAVAJJAVALITUAVAJLITUAVAJJAVALITUAVAJLITUAVAJJAVALITUAVAJLITUAVAJJAVALITUAVAJLITUAVAJJAVALITUAVAJLITUAVAJJAVALITUAVAJLITUAVAJJAVALITUAVAJLITUAVAJJAVALITUAVAJLITUAVAJJAVALITUAVAJLITUAVAJJAVALITUAVAJLITUAVAJJAVALITUAVAJLITUAVAJJAVALITUAVAJLITUAVAJJAVALITUAVAJLITUAVAJJAVALITUAVAJLITUAVAJJAVALITUAVAJLITUAVAJJAVALITUAVAJLITUAVAJJAVALITUAVAJLITUAVAJJAVALITUAVAJLITUAVAJJAVALITUAVAJLITUAVAJ", "", "rayListArrayListavaj.gnal                                                           ");
        org.junit.Assert.assertNull(strArray3);
    }

    @Test
    public void test38471() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest76.test38471");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.reverse("Interface java.lang.Cloneable             Character             interface java.io.Serializable");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "elbazilaireS.oi.avaj ecafretni             retcarahC             elbaenolC.gnal.avaj ecafretnI" + "'", str1, "elbazilaireS.oi.avaj ecafretni             retcarahC             elbaenolC.gnal.avaj ecafretnI");
    }

    @Test
    public void test38472() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest76.test38472");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass1 = org.apache.commons.lang3.ClassUtils.getClass("RFACE JAVA.LANG.CLONEA#                                   J.GNALJAVA.LANGAVAJ.GN                                                                                                                                                                                                                                                                                                                                                                                                                                                                      INTERFACE JAVALANGCLONEABLELANGGNALJAVALANGAVAJGNALJAVALANGAVAJGNALJAVALANGAVAJGNALJAVALANGAVAJGNALJAVALANGAVAJGNALJAVALANGAVAJGNALJAVALANGAVAJGNALJAVALANGAVAJJAVAINTERFACE JAVAIOSERIALIZABLE");
            org.junit.Assert.fail("Expected exception of type java.lang.ClassNotFoundException; message: RFACEJAVA.LANG.CLONEA#J.GNALJAVA.LANGAVAJ.GNINTERFACEJAVALANGCLONEABLELANGGNALJAVALANGAVAJGNALJAVALANGAVAJGNALJAVALANGAVAJGNALJAVALANGAVAJGNALJAVALANGAVAJGNALJAVALANGAVAJGNALJAVALANGAVAJGNALJAVALANGAVAJJAVAINTERFACEJAVAIOSERIALIZABLE");
        } catch (java.lang.ClassNotFoundException e) {
            // Expected exception.
        }
    }

    @Test
    public void test38473() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest76.test38473");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsIgnoreCase("ass.........................................................................................................................................................", "OI.AVAJECAFRETNI#ELBAENOLc.GNAL.AVAJECAFRETNIaRRAYlISTaRRAYlISTaRRAYlISTaRRAYlISaRRAYlISTaRRAYlISTaRRAYlISTaRRAYlISaRRAYlISTaRRAYlISTaRRAYlISTaRRAYlISaRRAYlISTaRRAYlISTaRRAYlISTaRRAYlISaRRAYlISTaRRAYlISTaRRAYlISTaRRAYlISaRRAYlISTaRRAYlISTaRRAYlISTaRRAYlISaRRAYlISTaRRAYlISTaRRAYlISTaRRAYlISaRRAYlISTaRRAYlISTaRRAYlISTaRRAYlISaRRAYlISTaRRAYlISTaRRAYlISTaRRAYlISaRRAYlISTaRRAYlISTaRRAYlISTaRRAYlISaRRAYlISTaRRAYlISTaRRAYlISTaRRAYlISaRRAYlISTaRRAYlISTaRRAYlISTaRRAYlISaRRAYlISTaRRAYlISTaRRAYlISTaRRAYlISaRRAYlISTaRRAYlISTaRRAYlISTaRRAYlISaRRAYlISTaRRAYlISTaRRAYlISTaRRAYlISaRRAYlISTaRRAYlISTaRRAYlISTaRRAYlISaRRAYlISTaRRAYlISTaRRAYlISTaRRAYlISaRRAYlISTaRRAYlISTaRRAYlIST");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test38474() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest76.test38474");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripAccents((java.lang.CharSequence) "                                                                                                                                                                                                                      irfSeriaCoSeria$SeriairfioSeriInterface java.lang.Cloneable             Character             interface java.io.SerializableirfSeriaCoSeria$SeriairfioSeria                                                                                                                                                                                                                                                                                                                                    ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "                                                                                                                                                                                                                      irfSeriaCoSeria$SeriairfioSeriInterface java.lang.Cloneable             Character             interface java.io.SerializableirfSeriaCoSeria$SeriairfioSeria                                                                                                                                                                                                                                                                                                                                    " + "'", str1, "                                                                                                                                                                                                                      irfSeriaCoSeria$SeriairfioSeriInterface java.lang.Cloneable             Character             interface java.io.SerializableirfSeriaCoSeria$SeriairfioSeria                                                                                                                                                                                                                                                                                                                                    ");
    }

    @Test
    public void test38475() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest76.test38475");
        int int1 = org.apache.commons.lang3.StringUtils.length((java.lang.CharSequence) " t i  tcejbO.gnal.avaj  alcrr t i  tcejbO.gnal.avaj  alcrr va.langGN  ..langjava.lang GN  elbazilaireSelbazilaireSelbazilaireSelbazilaireSelbazilaireSelbazilaireSelbazilaireSelbazilaireSelbazilaireSelbazilaireSelbazilaireSelbazilaireSelbazilaireSelbazilaireSelbazilaireSelbazilaireSelbazilaireSelbazilaireSelbazilaireSelbazilaireSelbazilaireSelbazilaireSelbazilaireSelbazilaireSelbazilaireSelbazilaireSelbazilaireSelbazilaireSelbazilaireSelbazilaireSelbazilaireSelbazilaireSelbazilaireSe");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 487 + "'", int1 == 487);
    }

    @Test
    public void test38476() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest76.test38476");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.abbreviate("INTERF", 58, 929);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "INTERF" + "'", str3, "INTERF");
    }

    @Test
    public void test38477() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest76.test38477");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.chomp("tsiLyarrA.La.langtsiLyarrA.La.langtsiLyarrA.La.langtsiLyarrA.La.langtsiLyarrA.La.langtsiLyarrA.La.langtsiLyarrA.La.langtsiLyarrA.La.lang", "irfCo$irfioSrA..ayL A.444444444444444444444444444");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "tsiLyarrA.La.langtsiLyarrA.La.langtsiLyarrA.La.langtsiLyarrA.La.langtsiLyarrA.La.langtsiLyarrA.La.langtsiLyarrA.La.langtsiLyarrA.La.lang" + "'", str2, "tsiLyarrA.La.langtsiLyarrA.La.langtsiLyarrA.La.langtsiLyarrA.La.langtsiLyarrA.La.langtsiLyarrA.La.langtsiLyarrA.La.langtsiLyarrA.La.lang");
    }

    @Test
    public void test38478() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest76.test38478");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNumericSpace((java.lang.CharSequence) "GNAL.AVAJLANG.JAVAGNAL.AVAJLANG.JAVAGNAL.AVAJLANG.JAVAGNAL.AVAJLANG.JAVAGNAL.AVAJLANG.JAVAGNAL.AVAJLANG.JAVAGNAL.AVAJLANG.JAVAGNAL.AVAJLANG.JAVAGNAL.AVAJ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test38479() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest76.test38479");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replace("hi!arraylistarraylistarraylistavaj.gnalarraylistarraylistarraylist", "4444444444444444444444444444444444444444444444gnAI", "aAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA       ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!arraylistarraylistarraylistavaj.gnalarraylistarraylistarraylist" + "'", str3, "hi!arraylistarraylistarraylistavaj.gnalarraylistarraylistarraylist");
    }

    @Test
    public void test38480() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest76.test38480");
        char[] charArray8 = new char[] { '$' };
        int int9 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "java.util", charArray8);
        boolean boolean10 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "                                   ", charArray8);
        boolean boolean11 = org.apache.commons.lang3.StringUtils.containsAny("...       ....       .", charArray8);
        int int12 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "hi!ArrayListArrayListArrayListavaj.gnalArrayListArrayListArrayListavaj", charArray8);
        boolean boolean13 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "....................................................................................................", charArray8);
        int int14 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444lituavajli", charArray8);
        boolean boolean15 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa...aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", charArray8);
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
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
    }

    @Test
    public void test38481() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest76.test38481");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                             a.lang.CloneableStringinterface java.io                          ", "irfCo$irfioSrA..ayL.A.444444444444444444444444444", 486);
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void test38482() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest76.test38482");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByCharacterType("JAVA");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.stripAll(strArray2);
        int int4 = org.apache.commons.lang3.StringUtils.indexOfAny("gnalarraylistarraylistarrayli", strArray2);
        java.lang.String str6 = org.apache.commons.lang3.ClassUtils.getPackageName((java.lang.Object) int4, "4444");
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "java.lang" + "'", str6, "java.lang");
    }

    @Test
    public void test38483() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest76.test38483");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.split("                                                                                                                                                                                                                                                                                                                                                                                                ...VA.LANGAVAJ.GNALJAVA.LANGAVAJ.GNALJAVA.LANGAVAJ.GNALJAVA.LANGAVAJ.GNALJAVA.LANGAVAJ.GNALJAVA.LANGgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalg", '$');
        java.lang.String str5 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray3, '$');
        java.lang.String[] strArray8 = org.apache.commons.lang3.StringUtils.split("                          a                                a  ", "class");
        java.lang.String[] strArray10 = org.apache.commons.lang3.StringUtils.stripAll(strArray8, "..............................");
        java.lang.String str11 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray8);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str12 = org.apache.commons.lang3.StringUtils.replaceEachRepeatedly("jvstringnlrrylistrrylistrrylistvj.gnlrrylistrrylistrryli-1jv.utilString-1jv.utilString-1jv.utilString-1jv.utilString-1jv.utilString-1jv.utilString-1jv.utilString-1jv.utilString-1jv.utilString-1jv.utilString-1jv.utilString-1jv.utilString-1jv.utilString-1jv.utilString-1jv.utilString-1jv.utilString-1jv.utilString-1jv.utilString-1jv.utilString-1jv.utilString-1jv.utilString-1jv.utilString-1jv.utilString-1jv.utilString-1jv.utilString-1jv.utilString-1jv.utilString-1jv.utilString-1jv.utilString-1jv.utilString-1jv.utilString-1jv.utilString-1jv.utilString-1jv.utilString-1jv.utilString-1jv.utilString-1jv.utilString-1jv.utilString-1jv.utilString-1jv.utilString-1jv.utilString-1jv.utilString-1jv.utilString-1jv.utilString-1jv.utilString-1jv.utilString-1jv.utilString-1jv.utilString-1jv.utilString-1jv.utilString-1jv.utilString-1jv.utilString-1jv.utilString-1jv.utilString-1jv.utilString-1jv.utilString-1jv.utilString-1jv.utilString-1jv.utilString-", strArray3, strArray8);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Search and Replace array lengths don't match: 1 vs 3");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "                                                                                                                                                                                                                                                                                                                                                                                                ...VA.LANGAVAJ.GNALJAVA.LANGAVAJ.GNALJAVA.LANGAVAJ.GNALJAVA.LANGAVAJ.GNALJAVA.LANGAVAJ.GNALJAVA.LANGgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalg" + "'", str5, "                                                                                                                                                                                                                                                                                                                                                                                                ...VA.LANGAVAJ.GNALJAVA.LANGAVAJ.GNALJAVA.LANGAVAJ.GNALJAVA.LANGAVAJ.GNALJAVA.LANGAVAJ.GNALJAVA.LANGgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalg");
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertNotNull(strArray10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "                                                            " + "'", str11, "                                                            ");
    }

    @Test
    public void test38484() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest76.test38484");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.abbreviateMiddle("AV", "JAVA.LANGAVAJ.GNALJAVA.LANGAVAJ.GNALJAVA.LANGAVAJ.GNALJAVA.LANGAVAJ.GNALJAVA.LANGAVAJ.GNALJAVA.LANGAVAJ.GNALJAVA.LANGAVAJ.GNALJAVA.LANGAVAJ.GNALJAVA.LANG", (-1));
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "AV" + "'", str3, "AV");
    }

    @Test
    public void test38485() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest76.test38485");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.substring("AyL A4444444444", 158, 938);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test38486() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest76.test38486");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceOnce("aaaaaa...aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "JvstringnlrrylistrrylistrryliJAVA..........JAVA..........JAVA...Jvstringnlrrylistrrylistrryli", "StringCLAS");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "aaaaaa...aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa" + "'", str3, "aaaaaa...aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
    }

    @Test
    public void test38487() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest76.test38487");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.rightPad("javastring...", 576);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "javastring...                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                   " + "'", str2, "javastring...                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                   ");
    }

    @Test
    public void test38488() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest76.test38488");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.leftPad("                                                                                                                                                                                                                          ........................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................INTERFACE JAVA.LANG.cLONEABLE4INTERFACE JAVA.IO.sERIALIZABL", 149, "gagnAAAAAAAAAAistArrayListArrayListavaj.gnalArrayListArrayListArrayLi");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "                                                                                                                                                                                                                          ........................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................INTERFACE JAVA.LANG.cLONEABLE4INTERFACE JAVA.IO.sERIALIZABL" + "'", str3, "                                                                                                                                                                                                                          ........................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................INTERFACE JAVA.LANG.cLONEABLE4INTERFACE JAVA.IO.sERIALIZABL");
    }

    @Test
    public void test38489() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest76.test38489");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.deleteWhitespace("AAAAAAAAAAngalavajAAAAAAAAAAngalavajAAAAAAAAAAngalavajAAAAAAAAAAngalavajAAAAAAAAAAngalavajAAAAAAAAAAngalavajAAAAAAAAAAngalavajAAAAAAAAAAngalavajAAAAAAAAAAngalavajAAAAAAAAAAngalavajAAAAAAAAAAngalavajAAAAAAAAAAngalavajAAAAAAAAAAngalavajAAAAAAAAAAngalavajAAAAAAAAAAngalavajAAAAAAAAAAngalavajAAAAAAAAAAngalavajAAAAAAAAAAngalavajAAAAAAAAAAngalavajAAAAAAAAAAngalavajAAAAAAAAAAngalavajAAAAAAAAAAngalavajAAAAAAAAAAngalavajAAAAAAAAAAngalavajAAAAAAAAAAngalavajAAAAAAAAAAngalavajAAAAAAAAAAngalavajAAAAAAAAAAngalavajAAAAAAAAAAngalavajAAAAAAAAAAngalavajAAAAAAAAAAngalavajAAAAAAAAAAngalavajAAAAAAAAAAngalavajAAAAAAAAAAngalavajAAAAAAAAAAngalavajAAAAAAAAAA][gnirtSlitu.avaj1-][gnirtSlitu.avaj1-                                                                                   ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "AAAAAAAAAAngalavajAAAAAAAAAAngalavajAAAAAAAAAAngalavajAAAAAAAAAAngalavajAAAAAAAAAAngalavajAAAAAAAAAAngalavajAAAAAAAAAAngalavajAAAAAAAAAAngalavajAAAAAAAAAAngalavajAAAAAAAAAAngalavajAAAAAAAAAAngalavajAAAAAAAAAAngalavajAAAAAAAAAAngalavajAAAAAAAAAAngalavajAAAAAAAAAAngalavajAAAAAAAAAAngalavajAAAAAAAAAAngalavajAAAAAAAAAAngalavajAAAAAAAAAAngalavajAAAAAAAAAAngalavajAAAAAAAAAAngalavajAAAAAAAAAAngalavajAAAAAAAAAAngalavajAAAAAAAAAAngalavajAAAAAAAAAAngalavajAAAAAAAAAAngalavajAAAAAAAAAAngalavajAAAAAAAAAAngalavajAAAAAAAAAAngalavajAAAAAAAAAAngalavajAAAAAAAAAAngalavajAAAAAAAAAAngalavajAAAAAAAAAAngalavajAAAAAAAAAAngalavajAAAAAAAAAAngalavajAAAAAAAAAA][gnirtSlitu.avaj1-][gnirtSlitu.avaj1-" + "'", str1, "AAAAAAAAAAngalavajAAAAAAAAAAngalavajAAAAAAAAAAngalavajAAAAAAAAAAngalavajAAAAAAAAAAngalavajAAAAAAAAAAngalavajAAAAAAAAAAngalavajAAAAAAAAAAngalavajAAAAAAAAAAngalavajAAAAAAAAAAngalavajAAAAAAAAAAngalavajAAAAAAAAAAngalavajAAAAAAAAAAngalavajAAAAAAAAAAngalavajAAAAAAAAAAngalavajAAAAAAAAAAngalavajAAAAAAAAAAngalavajAAAAAAAAAAngalavajAAAAAAAAAAngalavajAAAAAAAAAAngalavajAAAAAAAAAAngalavajAAAAAAAAAAngalavajAAAAAAAAAAngalavajAAAAAAAAAAngalavajAAAAAAAAAAngalavajAAAAAAAAAAngalavajAAAAAAAAAAngalavajAAAAAAAAAAngalavajAAAAAAAAAAngalavajAAAAAAAAAAngalavajAAAAAAAAAAngalavajAAAAAAAAAAngalavajAAAAAAAAAAngalavajAAAAAAAAAAngalavajAAAAAAAAAAngalavajAAAAAAAAAA][gnirtSlitu.avaj1-][gnirtSlitu.avaj1-");
    }

    @Test
    public void test38490() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest76.test38490");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.strip("aRRYlIS");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "aRRYlIS" + "'", str1, "aRRYlIS");
    }

    @Test
    public void test38491() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest76.test38491");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeEndIgnoreCase("interface java.lang.Cloneablehi!interface java.io.Serializable", "interface java.lang.Cloneableinterface java.io.Serializable");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "interface java.lang.Cloneablehi!interface java.io.Serializable" + "'", str2, "interface java.lang.Cloneablehi!interface java.io.Serializable");
    }

    @Test
    public void test38492() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest76.test38492");
        int int3 = org.apache.commons.lang3.StringUtils.lastOrdinalIndexOf("agnAAAAAAAAA", "EBy eBy eBy eBy eBy eBy eBy eBy eBy eBy eBy eBy eBy eBy eBy eBy eBy eBy eBy eBy", 629);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test38493() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest76.test38493");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.deleteWhitespace("ELB ZIL IREsAOIA V JAEC FRETNI V JAAAAAAAAAA V JAAAAAAAAAA V JAAAAAAAAAA V JAAAAAAAAAA V JAAAAAAAAAA V JAAAAAAAAAA V JAAAAAAAAAA V JAAAAAAAAAA V JAAAAAAAAAA V JAAAAAAAAAA V JAAAAAAAAAA V JAAAAAAAAAA V JAAAAAAAAAA V JAAAAAAAAAA V JAAAAAAAAAA V JAAAAAAAAAA V JAAAAAAAAAA V JAAAAAAAAAA V JAAAAAAAAAA V JAAAAAAAAAA V JAAAAAAAAAA V JAAAAAAAAAA V JAAAAAAAAAA V JAAAAAAAAAA V JAAAAAAAAAA V JAAAAAAAAAA V JAAAAAAAAAA V JAAAAAAAAAA V JAAAAAAAAAA V JAAAAAAAAAA V JAAAAAAAAAA V JAAAAAAAAAA V JAAAAAAAAAA V JAAAAAAAAAA V JAAAAAAAELB ENOLcAGN LA V JAEC FRETN");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "ELBZILIREsAOIAVJAECFRETNIVJAAAAAAAAAAVJAAAAAAAAAAVJAAAAAAAAAAVJAAAAAAAAAAVJAAAAAAAAAAVJAAAAAAAAAAVJAAAAAAAAAAVJAAAAAAAAAAVJAAAAAAAAAAVJAAAAAAAAAAVJAAAAAAAAAAVJAAAAAAAAAAVJAAAAAAAAAAVJAAAAAAAAAAVJAAAAAAAAAAVJAAAAAAAAAAVJAAAAAAAAAAVJAAAAAAAAAAVJAAAAAAAAAAVJAAAAAAAAAAVJAAAAAAAAAAVJAAAAAAAAAAVJAAAAAAAAAAVJAAAAAAAAAAVJAAAAAAAAAAVJAAAAAAAAAAVJAAAAAAAAAAVJAAAAAAAAAAVJAAAAAAAAAAVJAAAAAAAAAAVJAAAAAAAAAAVJAAAAAAAAAAVJAAAAAAAAAAVJAAAAAAAAAAVJAAAAAAAELBENOLcAGNLAVJAECFRETN" + "'", str1, "ELBZILIREsAOIAVJAECFRETNIVJAAAAAAAAAAVJAAAAAAAAAAVJAAAAAAAAAAVJAAAAAAAAAAVJAAAAAAAAAAVJAAAAAAAAAAVJAAAAAAAAAAVJAAAAAAAAAAVJAAAAAAAAAAVJAAAAAAAAAAVJAAAAAAAAAAVJAAAAAAAAAAVJAAAAAAAAAAVJAAAAAAAAAAVJAAAAAAAAAAVJAAAAAAAAAAVJAAAAAAAAAAVJAAAAAAAAAAVJAAAAAAAAAAVJAAAAAAAAAAVJAAAAAAAAAAVJAAAAAAAAAAVJAAAAAAAAAAVJAAAAAAAAAAVJAAAAAAAAAAVJAAAAAAAAAAVJAAAAAAAAAAVJAAAAAAAAAAVJAAAAAAAAAAVJAAAAAAAAAAVJAAAAAAAAAAVJAAAAAAAAAAVJAAAAAAAAAAVJAAAAAAAAAAVJAAAAAAAELBENOLcAGNLAVJAECFRETN");
    }

    @Test
    public void test38494() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest76.test38494");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.deleteWhitespace("Cl");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Cl" + "'", str1, "Cl");
    }

    @Test
    public void test38495() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest76.test38495");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripToNull("##############################################################################################################################################################################################################################################################################################################################################################################################################################################################4444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444aaaaaaaaaava.lang");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "##############################################################################################################################################################################################################################################################################################################################################################################################################################################################4444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444aaaaaaaaaava.lang" + "'", str1, "##############################################################################################################################################################################################################################################################################################################################################################################################################################################################4444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444aaaaaaaaaava.lang");
    }

    @Test
    public void test38496() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest76.test38496");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.split("avaj.gnal", "##########");
        java.lang.String[] strArray7 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("#                                   ", "SERIALIZABLE", (int) (byte) 10);
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.replaceEach("##########", strArray3, strArray7);
        java.lang.String str10 = org.apache.commons.lang3.ClassUtils.getShortCanonicalName((java.lang.Object) strArray3, "JAVA.LANGA");
        java.lang.String str12 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray3, 'a');
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "##########" + "'", str8, "##########");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "String[]" + "'", str10, "String[]");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "avaj.gnal" + "'", str12, "avaj.gnal");
    }

    @Test
    public void test38497() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest76.test38497");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.swapCase(".. u");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + ".. U" + "'", str1, ".. U");
    }

    @Test
    public void test38498() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest76.test38498");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.upperCase(".......                                      ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + ".......                                      " + "'", str1, ".......                                      ");
    }

    @Test
    public void test38499() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest76.test38499");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isWhitespace((java.lang.CharSequence) " lang.javalang.javalang.javava                                      va                                      va                                      va                                      va                                      va                                      va                                      va                                      va                                      va                                      va                                      va                   ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test38500() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest76.test38500");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.split("gnalArrayListArrayListArrayListavaj.gnalArrayListArrayListArrayLi", "AAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAA");
        int int3 = org.apache.commons.lang3.StringUtils.indexOfDifference((java.lang.CharSequence[]) strArray2);
        java.lang.String str5 = org.apache.commons.lang3.ClassUtils.getShortClassName((java.lang.Object) strArray2, "java.langjava.langjava.langjava.langjava.langjava.la");
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "String[]" + "'", str5, "String[]");
    }
}

