import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest3 {

    public static boolean debug = false;

    @Test
    public void test1501() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1501");
        char[] charArray2 = new char[] { '4', ' ' };
        org.apache.commons.lang3.text.StrTokenizer strTokenizer5 = new org.apache.commons.lang3.text.StrTokenizer(charArray2, 'a', ' ');
        org.apache.commons.lang3.text.StrTokenizer strTokenizer6 = org.apache.commons.lang3.text.StrTokenizer.getCSVInstance(charArray2);
        char[] charArray9 = null;
        org.apache.commons.lang3.text.StrTokenizer strTokenizer11 = new org.apache.commons.lang3.text.StrTokenizer(charArray9, "");
        java.lang.String str12 = strTokenizer11.getContent();
        org.apache.commons.lang3.text.StrMatcher strMatcher13 = strTokenizer11.getDelimiterMatcher();
        org.apache.commons.lang3.text.StrTokenizer strTokenizer14 = new org.apache.commons.lang3.text.StrTokenizer("StrTokenizer[4 ]", strMatcher13);
        org.apache.commons.lang3.text.StrMatcher strMatcher15 = null;
        org.apache.commons.lang3.text.StrTokenizer strTokenizer16 = new org.apache.commons.lang3.text.StrTokenizer("StrTokenizer[not tokenized yet]", strMatcher13, strMatcher15);
        char[] charArray20 = null;
        org.apache.commons.lang3.text.StrTokenizer strTokenizer22 = new org.apache.commons.lang3.text.StrTokenizer(charArray20, "");
        java.lang.String str23 = strTokenizer22.getContent();
        org.apache.commons.lang3.text.StrMatcher strMatcher24 = strTokenizer22.getDelimiterMatcher();
        org.apache.commons.lang3.text.StrTokenizer strTokenizer25 = new org.apache.commons.lang3.text.StrTokenizer("StrTokenizer[4 ]", strMatcher24);
        org.apache.commons.lang3.text.StrMatcher strMatcher26 = null;
        org.apache.commons.lang3.text.StrTokenizer strTokenizer27 = new org.apache.commons.lang3.text.StrTokenizer("StrTokenizer[not tokenized yet]", strMatcher24, strMatcher26);
        char[] charArray29 = null;
        org.apache.commons.lang3.text.StrTokenizer strTokenizer31 = new org.apache.commons.lang3.text.StrTokenizer(charArray29, "");
        java.lang.String str32 = strTokenizer31.getContent();
        org.apache.commons.lang3.text.StrMatcher strMatcher33 = strTokenizer31.getDelimiterMatcher();
        org.apache.commons.lang3.text.StrTokenizer strTokenizer34 = new org.apache.commons.lang3.text.StrTokenizer("hi!", strMatcher33);
        org.apache.commons.lang3.text.StrTokenizer strTokenizer35 = new org.apache.commons.lang3.text.StrTokenizer("4", strMatcher24, strMatcher33);
        org.apache.commons.lang3.text.StrTokenizer strTokenizer36 = new org.apache.commons.lang3.text.StrTokenizer(charArray2, strMatcher13, strMatcher24);
        org.apache.commons.lang3.text.StrTokenizer strTokenizer37 = org.apache.commons.lang3.text.StrTokenizer.getTSVInstance(charArray2);
        org.apache.commons.lang3.text.StrTokenizer strTokenizer38 = new org.apache.commons.lang3.text.StrTokenizer(charArray2);
        org.apache.commons.lang3.text.StrTokenizer strTokenizer41 = new org.apache.commons.lang3.text.StrTokenizer(charArray2, '#', ' ');
        org.junit.Assert.assertNotNull(charArray2);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray2), "4 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray2), "4 ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray2), "[4,  ]");
        org.junit.Assert.assertNotNull(strTokenizer6);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNotNull(strMatcher13);
        org.junit.Assert.assertNull(str23);
        org.junit.Assert.assertNotNull(strMatcher24);
        org.junit.Assert.assertNull(str32);
        org.junit.Assert.assertNotNull(strMatcher33);
        org.junit.Assert.assertNotNull(strTokenizer37);
    }

    @Test
    public void test1502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1502");
        org.apache.commons.lang3.text.StrTokenizer strTokenizer2 = new org.apache.commons.lang3.text.StrTokenizer("StrTokenizer[", "StrTokenizer[]");
    }

    @Test
    public void test1503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1503");
        org.apache.commons.lang3.text.StrTokenizer strTokenizer1 = org.apache.commons.lang3.text.StrTokenizer.getTSVInstance("");
        org.apache.commons.lang3.text.StrTokenizer strTokenizer2 = strTokenizer1.reset();
        org.apache.commons.lang3.text.StrTokenizer strTokenizer3 = strTokenizer1.reset();
        java.util.List<java.lang.String> strList4 = strTokenizer3.getTokenList();
        org.junit.Assert.assertNotNull(strTokenizer1);
        org.junit.Assert.assertNotNull(strTokenizer2);
        org.junit.Assert.assertNotNull(strTokenizer3);
        org.junit.Assert.assertNotNull(strList4);
    }

    @Test
    public void test1504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1504");
        char[] charArray2 = new char[] { '4', ' ' };
        org.apache.commons.lang3.text.StrTokenizer strTokenizer5 = new org.apache.commons.lang3.text.StrTokenizer(charArray2, 'a', ' ');
        char[] charArray8 = new char[] { '4', ' ' };
        org.apache.commons.lang3.text.StrTokenizer strTokenizer11 = new org.apache.commons.lang3.text.StrTokenizer(charArray8, 'a', ' ');
        org.apache.commons.lang3.text.StrMatcher strMatcher12 = strTokenizer11.getTrimmerMatcher();
        org.apache.commons.lang3.text.StrTokenizer strTokenizer14 = strTokenizer11.setDelimiterString("");
        org.apache.commons.lang3.text.StrMatcher strMatcher15 = strTokenizer14.getTrimmerMatcher();
        org.apache.commons.lang3.text.StrMatcher strMatcher16 = strTokenizer14.getTrimmerMatcher();
        char[] charArray18 = null;
        org.apache.commons.lang3.text.StrTokenizer strTokenizer20 = new org.apache.commons.lang3.text.StrTokenizer(charArray18, "");
        java.lang.String str21 = strTokenizer20.getContent();
        org.apache.commons.lang3.text.StrMatcher strMatcher22 = strTokenizer20.getDelimiterMatcher();
        org.apache.commons.lang3.text.StrTokenizer strTokenizer23 = new org.apache.commons.lang3.text.StrTokenizer("hi!", strMatcher22);
        org.apache.commons.lang3.text.StrTokenizer strTokenizer24 = new org.apache.commons.lang3.text.StrTokenizer(charArray2, strMatcher16, strMatcher22);
        org.apache.commons.lang3.text.StrTokenizer strTokenizer25 = strTokenizer24.reset();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str26 = strTokenizer25.previous();
            org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException; message: null");
        } catch (java.util.NoSuchElementException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray2);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray2), "4 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray2), "4 ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray2), "[4,  ]");
        org.junit.Assert.assertNotNull(charArray8);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray8), "4 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray8), "4 ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray8), "[4,  ]");
        org.junit.Assert.assertNotNull(strMatcher12);
        org.junit.Assert.assertNotNull(strTokenizer14);
        org.junit.Assert.assertNotNull(strMatcher15);
        org.junit.Assert.assertNotNull(strMatcher16);
        org.junit.Assert.assertNull(str21);
        org.junit.Assert.assertNotNull(strMatcher22);
        org.junit.Assert.assertNotNull(strTokenizer25);
    }

    @Test
    public void test1505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1505");
        org.apache.commons.lang3.text.StrTokenizer strTokenizer1 = org.apache.commons.lang3.text.StrTokenizer.getTSVInstance("");
        org.apache.commons.lang3.text.StrTokenizer strTokenizer3 = org.apache.commons.lang3.text.StrTokenizer.getCSVInstance("hi!");
        char[] charArray6 = new char[] { 'a', '#' };
        org.apache.commons.lang3.text.StrTokenizer strTokenizer7 = org.apache.commons.lang3.text.StrTokenizer.getCSVInstance(charArray6);
        org.apache.commons.lang3.text.StrTokenizer strTokenizer8 = strTokenizer3.reset(charArray6);
        org.apache.commons.lang3.text.StrTokenizer strTokenizer9 = org.apache.commons.lang3.text.StrTokenizer.getTSVInstance(charArray6);
        org.apache.commons.lang3.text.StrTokenizer strTokenizer10 = strTokenizer1.reset(charArray6);
        boolean boolean11 = strTokenizer10.isEmptyTokenAsNull();
        boolean boolean12 = strTokenizer10.hasPrevious();
        boolean boolean13 = strTokenizer10.isEmptyTokenAsNull();
        org.junit.Assert.assertNotNull(strTokenizer1);
        org.junit.Assert.assertNotNull(strTokenizer3);
        org.junit.Assert.assertNotNull(charArray6);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray6), "a#");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray6), "a#");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray6), "[a, #]");
        org.junit.Assert.assertNotNull(strTokenizer7);
        org.junit.Assert.assertNotNull(strTokenizer8);
        org.junit.Assert.assertNotNull(strTokenizer9);
        org.junit.Assert.assertNotNull(strTokenizer10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test1506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1506");
        char[] charArray3 = new char[] { '4', ' ' };
        org.apache.commons.lang3.text.StrTokenizer strTokenizer6 = new org.apache.commons.lang3.text.StrTokenizer(charArray3, 'a', ' ');
        org.apache.commons.lang3.text.StrMatcher strMatcher7 = strTokenizer6.getTrimmerMatcher();
        org.apache.commons.lang3.text.StrTokenizer strTokenizer9 = strTokenizer6.setDelimiterString("");
        org.apache.commons.lang3.text.StrMatcher strMatcher10 = strTokenizer9.getTrimmerMatcher();
        boolean boolean11 = strTokenizer9.hasNext();
        org.apache.commons.lang3.text.StrTokenizer strTokenizer13 = strTokenizer9.setIgnoredChar(' ');
        java.lang.String str14 = strTokenizer13.nextToken();
        boolean boolean15 = strTokenizer13.isIgnoreEmptyTokens();
        org.apache.commons.lang3.text.StrMatcher strMatcher16 = strTokenizer13.getQuoteMatcher();
        org.apache.commons.lang3.text.StrTokenizer strTokenizer17 = new org.apache.commons.lang3.text.StrTokenizer("StrTokenizer[StrTokenizer[4 ]]", strMatcher16);
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray3), "4 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray3), "4 ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray3), "[4,  ]");
        org.junit.Assert.assertNotNull(strMatcher7);
        org.junit.Assert.assertNotNull(strTokenizer9);
        org.junit.Assert.assertNotNull(strMatcher10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(strTokenizer13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "4 " + "'", str14, "4 ");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(strMatcher16);
    }

    @Test
    public void test1507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1507");
        char[] charArray0 = null;
        org.apache.commons.lang3.text.StrTokenizer strTokenizer2 = new org.apache.commons.lang3.text.StrTokenizer(charArray0, "StrTokenizer[4 ]");
        org.apache.commons.lang3.text.StrTokenizer strTokenizer4 = strTokenizer2.setDelimiterChar('4');
        int int5 = strTokenizer2.size();
        org.apache.commons.lang3.text.StrTokenizer strTokenizer8 = new org.apache.commons.lang3.text.StrTokenizer("StrTokenizer[StrTokenizer[4 ]]", "");
        char[] charArray12 = new char[] { '4', ' ' };
        org.apache.commons.lang3.text.StrTokenizer strTokenizer15 = new org.apache.commons.lang3.text.StrTokenizer(charArray12, 'a', ' ');
        char[] charArray18 = new char[] { '4', ' ' };
        org.apache.commons.lang3.text.StrTokenizer strTokenizer21 = new org.apache.commons.lang3.text.StrTokenizer(charArray18, 'a', ' ');
        org.apache.commons.lang3.text.StrMatcher strMatcher22 = strTokenizer21.getTrimmerMatcher();
        org.apache.commons.lang3.text.StrTokenizer strTokenizer24 = strTokenizer21.setDelimiterString("");
        org.apache.commons.lang3.text.StrMatcher strMatcher25 = strTokenizer24.getTrimmerMatcher();
        org.apache.commons.lang3.text.StrMatcher strMatcher26 = strTokenizer24.getTrimmerMatcher();
        char[] charArray28 = null;
        org.apache.commons.lang3.text.StrTokenizer strTokenizer30 = new org.apache.commons.lang3.text.StrTokenizer(charArray28, "");
        java.lang.String str31 = strTokenizer30.getContent();
        org.apache.commons.lang3.text.StrMatcher strMatcher32 = strTokenizer30.getDelimiterMatcher();
        org.apache.commons.lang3.text.StrTokenizer strTokenizer33 = new org.apache.commons.lang3.text.StrTokenizer("hi!", strMatcher32);
        org.apache.commons.lang3.text.StrTokenizer strTokenizer34 = new org.apache.commons.lang3.text.StrTokenizer(charArray12, strMatcher26, strMatcher32);
        char[] charArray36 = null;
        org.apache.commons.lang3.text.StrTokenizer strTokenizer38 = new org.apache.commons.lang3.text.StrTokenizer(charArray36, "");
        java.lang.String str39 = strTokenizer38.getContent();
        org.apache.commons.lang3.text.StrMatcher strMatcher40 = strTokenizer38.getDelimiterMatcher();
        org.apache.commons.lang3.text.StrTokenizer strTokenizer42 = org.apache.commons.lang3.text.StrTokenizer.getCSVInstance("");
        java.util.List<java.lang.String> strList43 = strTokenizer42.getTokenList();
        boolean boolean44 = strTokenizer42.hasPrevious();
        java.lang.String[] strArray45 = strTokenizer42.getTokenArray();
        char[] charArray48 = new char[] { '4', ' ' };
        org.apache.commons.lang3.text.StrTokenizer strTokenizer51 = new org.apache.commons.lang3.text.StrTokenizer(charArray48, 'a', ' ');
        org.apache.commons.lang3.text.StrTokenizer strTokenizer52 = org.apache.commons.lang3.text.StrTokenizer.getCSVInstance(charArray48);
        org.apache.commons.lang3.text.StrMatcher strMatcher53 = null;
        org.apache.commons.lang3.text.StrTokenizer strTokenizer54 = new org.apache.commons.lang3.text.StrTokenizer(charArray48, strMatcher53);
        char[] charArray57 = new char[] { '4', ' ' };
        org.apache.commons.lang3.text.StrTokenizer strTokenizer60 = new org.apache.commons.lang3.text.StrTokenizer(charArray57, 'a', ' ');
        org.apache.commons.lang3.text.StrMatcher strMatcher61 = strTokenizer60.getTrimmerMatcher();
        org.apache.commons.lang3.text.StrTokenizer strTokenizer63 = strTokenizer60.setDelimiterString("");
        org.apache.commons.lang3.text.StrMatcher strMatcher64 = strTokenizer63.getTrimmerMatcher();
        org.apache.commons.lang3.text.StrTokenizer strTokenizer65 = new org.apache.commons.lang3.text.StrTokenizer(charArray48, strMatcher64);
        org.apache.commons.lang3.text.StrTokenizer strTokenizer66 = strTokenizer42.setTrimmerMatcher(strMatcher64);
        org.apache.commons.lang3.text.StrTokenizer strTokenizer67 = new org.apache.commons.lang3.text.StrTokenizer("StrTokenizer[]", strMatcher40, strMatcher64);
        org.apache.commons.lang3.text.StrTokenizer strTokenizer68 = new org.apache.commons.lang3.text.StrTokenizer("StrTokenizer[4 ]", strMatcher32, strMatcher64);
        org.apache.commons.lang3.text.StrTokenizer strTokenizer69 = strTokenizer8.setDelimiterMatcher(strMatcher64);
        org.apache.commons.lang3.text.StrTokenizer strTokenizer70 = strTokenizer2.setTrimmerMatcher(strMatcher64);
        org.apache.commons.lang3.text.StrMatcher strMatcher71 = strTokenizer2.getTrimmerMatcher();
        java.lang.String str72 = strTokenizer2.getContent();
        org.junit.Assert.assertNotNull(strTokenizer4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(charArray12);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray12), "4 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray12), "4 ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray12), "[4,  ]");
        org.junit.Assert.assertNotNull(charArray18);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray18), "4 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray18), "4 ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray18), "[4,  ]");
        org.junit.Assert.assertNotNull(strMatcher22);
        org.junit.Assert.assertNotNull(strTokenizer24);
        org.junit.Assert.assertNotNull(strMatcher25);
        org.junit.Assert.assertNotNull(strMatcher26);
        org.junit.Assert.assertNull(str31);
        org.junit.Assert.assertNotNull(strMatcher32);
        org.junit.Assert.assertNull(str39);
        org.junit.Assert.assertNotNull(strMatcher40);
        org.junit.Assert.assertNotNull(strTokenizer42);
        org.junit.Assert.assertNotNull(strList43);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertNotNull(strArray45);
        org.junit.Assert.assertNotNull(charArray48);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray48), "4 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray48), "4 ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray48), "[4,  ]");
        org.junit.Assert.assertNotNull(strTokenizer52);
        org.junit.Assert.assertNotNull(charArray57);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray57), "4 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray57), "4 ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray57), "[4,  ]");
        org.junit.Assert.assertNotNull(strMatcher61);
        org.junit.Assert.assertNotNull(strTokenizer63);
        org.junit.Assert.assertNotNull(strMatcher64);
        org.junit.Assert.assertNotNull(strTokenizer66);
        org.junit.Assert.assertNotNull(strTokenizer69);
        org.junit.Assert.assertNotNull(strTokenizer70);
        org.junit.Assert.assertNotNull(strMatcher71);
        org.junit.Assert.assertNull(str72);
    }

    @Test
    public void test1508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1508");
        org.apache.commons.lang3.text.StrTokenizer strTokenizer2 = new org.apache.commons.lang3.text.StrTokenizer("StrTokenizer[ ]", "StrTokenizer[4 ]");
        org.apache.commons.lang3.text.StrMatcher strMatcher3 = strTokenizer2.getTrimmerMatcher();
        org.apache.commons.lang3.text.StrTokenizer strTokenizer5 = strTokenizer2.setDelimiterChar(' ');
        org.apache.commons.lang3.text.StrTokenizer strTokenizer6 = strTokenizer2.reset();
        org.junit.Assert.assertNotNull(strMatcher3);
        org.junit.Assert.assertNotNull(strTokenizer5);
        org.junit.Assert.assertNotNull(strTokenizer6);
    }

    @Test
    public void test1509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1509");
        char[] charArray2 = new char[] { '4', ' ' };
        org.apache.commons.lang3.text.StrTokenizer strTokenizer5 = new org.apache.commons.lang3.text.StrTokenizer(charArray2, 'a', ' ');
        org.apache.commons.lang3.text.StrTokenizer strTokenizer6 = org.apache.commons.lang3.text.StrTokenizer.getCSVInstance(charArray2);
        org.apache.commons.lang3.text.StrTokenizer strTokenizer7 = org.apache.commons.lang3.text.StrTokenizer.getCSVInstance(charArray2);
        org.apache.commons.lang3.text.StrTokenizer strTokenizer8 = new org.apache.commons.lang3.text.StrTokenizer(charArray2);
        org.apache.commons.lang3.text.StrTokenizer strTokenizer9 = org.apache.commons.lang3.text.StrTokenizer.getCSVInstance(charArray2);
        boolean boolean10 = strTokenizer9.isEmptyTokenAsNull();
        char[] charArray13 = new char[] { '4', ' ' };
        org.apache.commons.lang3.text.StrTokenizer strTokenizer16 = new org.apache.commons.lang3.text.StrTokenizer(charArray13, 'a', ' ');
        org.apache.commons.lang3.text.StrTokenizer strTokenizer18 = new org.apache.commons.lang3.text.StrTokenizer(charArray13, "hi!");
        org.apache.commons.lang3.text.StrTokenizer strTokenizer19 = new org.apache.commons.lang3.text.StrTokenizer(charArray13);
        char[] charArray22 = new char[] { '4', ' ' };
        org.apache.commons.lang3.text.StrTokenizer strTokenizer25 = new org.apache.commons.lang3.text.StrTokenizer(charArray22, 'a', ' ');
        org.apache.commons.lang3.text.StrMatcher strMatcher26 = strTokenizer25.getTrimmerMatcher();
        char[] charArray29 = new char[] { '4', ' ' };
        org.apache.commons.lang3.text.StrTokenizer strTokenizer32 = new org.apache.commons.lang3.text.StrTokenizer(charArray29, 'a', ' ');
        org.apache.commons.lang3.text.StrTokenizer strTokenizer33 = org.apache.commons.lang3.text.StrTokenizer.getCSVInstance(charArray29);
        org.apache.commons.lang3.text.StrMatcher strMatcher34 = null;
        org.apache.commons.lang3.text.StrTokenizer strTokenizer35 = new org.apache.commons.lang3.text.StrTokenizer(charArray29, strMatcher34);
        org.apache.commons.lang3.text.StrTokenizer strTokenizer36 = strTokenizer25.reset(charArray29);
        org.apache.commons.lang3.text.StrTokenizer strTokenizer37 = org.apache.commons.lang3.text.StrTokenizer.getCSVInstance(charArray29);
        char[] charArray40 = new char[] { '4', ' ' };
        org.apache.commons.lang3.text.StrTokenizer strTokenizer43 = new org.apache.commons.lang3.text.StrTokenizer(charArray40, 'a', ' ');
        org.apache.commons.lang3.text.StrMatcher strMatcher44 = strTokenizer43.getTrimmerMatcher();
        org.apache.commons.lang3.text.StrTokenizer strTokenizer46 = strTokenizer43.setDelimiterString("");
        char[] charArray50 = new char[] { '4', ' ' };
        org.apache.commons.lang3.text.StrTokenizer strTokenizer53 = new org.apache.commons.lang3.text.StrTokenizer(charArray50, 'a', ' ');
        org.apache.commons.lang3.text.StrMatcher strMatcher54 = strTokenizer53.getTrimmerMatcher();
        org.apache.commons.lang3.text.StrTokenizer strTokenizer56 = strTokenizer53.setDelimiterString("");
        org.apache.commons.lang3.text.StrMatcher strMatcher57 = strTokenizer56.getTrimmerMatcher();
        org.apache.commons.lang3.text.StrTokenizer strTokenizer58 = new org.apache.commons.lang3.text.StrTokenizer("", strMatcher57);
        char[] charArray61 = new char[] { '4', ' ' };
        org.apache.commons.lang3.text.StrTokenizer strTokenizer64 = new org.apache.commons.lang3.text.StrTokenizer(charArray61, 'a', ' ');
        org.apache.commons.lang3.text.StrMatcher strMatcher65 = strTokenizer64.getTrimmerMatcher();
        org.apache.commons.lang3.text.StrTokenizer strTokenizer67 = strTokenizer64.setDelimiterString("");
        org.apache.commons.lang3.text.StrMatcher strMatcher68 = strTokenizer67.getTrimmerMatcher();
        org.apache.commons.lang3.text.StrTokenizer strTokenizer69 = strTokenizer58.setTrimmerMatcher(strMatcher68);
        org.apache.commons.lang3.text.StrTokenizer strTokenizer70 = strTokenizer46.setTrimmerMatcher(strMatcher68);
        org.apache.commons.lang3.text.StrMatcher strMatcher71 = strTokenizer46.getDelimiterMatcher();
        char[] charArray74 = new char[] { '4', ' ' };
        org.apache.commons.lang3.text.StrTokenizer strTokenizer77 = new org.apache.commons.lang3.text.StrTokenizer(charArray74, 'a', ' ');
        org.apache.commons.lang3.text.StrMatcher strMatcher78 = strTokenizer77.getTrimmerMatcher();
        org.apache.commons.lang3.text.StrTokenizer strTokenizer80 = strTokenizer77.setDelimiterString("");
        org.apache.commons.lang3.text.StrMatcher strMatcher81 = strTokenizer80.getTrimmerMatcher();
        org.apache.commons.lang3.text.StrTokenizer strTokenizer82 = new org.apache.commons.lang3.text.StrTokenizer(charArray29, strMatcher71, strMatcher81);
        org.apache.commons.lang3.text.StrTokenizer strTokenizer83 = new org.apache.commons.lang3.text.StrTokenizer(charArray13, strMatcher81);
        org.apache.commons.lang3.text.StrTokenizer strTokenizer84 = strTokenizer9.setTrimmerMatcher(strMatcher81);
        java.lang.String[] strArray85 = strTokenizer9.getTokenArray();
        org.junit.Assert.assertNotNull(charArray2);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray2), "4 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray2), "4 ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray2), "[4,  ]");
        org.junit.Assert.assertNotNull(strTokenizer6);
        org.junit.Assert.assertNotNull(strTokenizer7);
        org.junit.Assert.assertNotNull(strTokenizer9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(charArray13);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray13), "4 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray13), "4 ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray13), "[4,  ]");
        org.junit.Assert.assertNotNull(charArray22);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray22), "4 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray22), "4 ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray22), "[4,  ]");
        org.junit.Assert.assertNotNull(strMatcher26);
        org.junit.Assert.assertNotNull(charArray29);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray29), "4 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray29), "4 ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray29), "[4,  ]");
        org.junit.Assert.assertNotNull(strTokenizer33);
        org.junit.Assert.assertNotNull(strTokenizer36);
        org.junit.Assert.assertNotNull(strTokenizer37);
        org.junit.Assert.assertNotNull(charArray40);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray40), "4 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray40), "4 ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray40), "[4,  ]");
        org.junit.Assert.assertNotNull(strMatcher44);
        org.junit.Assert.assertNotNull(strTokenizer46);
        org.junit.Assert.assertNotNull(charArray50);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray50), "4 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray50), "4 ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray50), "[4,  ]");
        org.junit.Assert.assertNotNull(strMatcher54);
        org.junit.Assert.assertNotNull(strTokenizer56);
        org.junit.Assert.assertNotNull(strMatcher57);
        org.junit.Assert.assertNotNull(charArray61);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray61), "4 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray61), "4 ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray61), "[4,  ]");
        org.junit.Assert.assertNotNull(strMatcher65);
        org.junit.Assert.assertNotNull(strTokenizer67);
        org.junit.Assert.assertNotNull(strMatcher68);
        org.junit.Assert.assertNotNull(strTokenizer69);
        org.junit.Assert.assertNotNull(strTokenizer70);
        org.junit.Assert.assertNotNull(strMatcher71);
        org.junit.Assert.assertNotNull(charArray74);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray74), "4 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray74), "4 ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray74), "[4,  ]");
        org.junit.Assert.assertNotNull(strMatcher78);
        org.junit.Assert.assertNotNull(strTokenizer80);
        org.junit.Assert.assertNotNull(strMatcher81);
        org.junit.Assert.assertNotNull(strTokenizer84);
        org.junit.Assert.assertNotNull(strArray85);
    }

    @Test
    public void test1510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1510");
        char[] charArray2 = new char[] { '4', ' ' };
        org.apache.commons.lang3.text.StrTokenizer strTokenizer5 = new org.apache.commons.lang3.text.StrTokenizer(charArray2, 'a', ' ');
        org.apache.commons.lang3.text.StrTokenizer strTokenizer6 = org.apache.commons.lang3.text.StrTokenizer.getCSVInstance(charArray2);
        org.apache.commons.lang3.text.StrTokenizer strTokenizer7 = org.apache.commons.lang3.text.StrTokenizer.getCSVInstance(charArray2);
        org.apache.commons.lang3.text.StrTokenizer strTokenizer8 = new org.apache.commons.lang3.text.StrTokenizer(charArray2);
        org.apache.commons.lang3.text.StrTokenizer strTokenizer9 = org.apache.commons.lang3.text.StrTokenizer.getCSVInstance(charArray2);
        java.lang.String str10 = strTokenizer9.previousToken();
        org.junit.Assert.assertNotNull(charArray2);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray2), "4 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray2), "4 ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray2), "[4,  ]");
        org.junit.Assert.assertNotNull(strTokenizer6);
        org.junit.Assert.assertNotNull(strTokenizer7);
        org.junit.Assert.assertNotNull(strTokenizer9);
        org.junit.Assert.assertNull(str10);
    }

    @Test
    public void test1511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1511");
        org.apache.commons.lang3.text.StrTokenizer strTokenizer2 = new org.apache.commons.lang3.text.StrTokenizer("StrTokenizer[a#]", " ");
    }

    @Test
    public void test1512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1512");
        org.apache.commons.lang3.text.StrTokenizer strTokenizer1 = new org.apache.commons.lang3.text.StrTokenizer("StrTokenizer[StrTokenizer[4 ]]");
        java.lang.String str2 = strTokenizer1.toString();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "StrTokenizer[not tokenized yet]" + "'", str2, "StrTokenizer[not tokenized yet]");
    }

    @Test
    public void test1513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1513");
        char[] charArray2 = new char[] { '4', ' ' };
        org.apache.commons.lang3.text.StrTokenizer strTokenizer5 = new org.apache.commons.lang3.text.StrTokenizer(charArray2, 'a', ' ');
        org.apache.commons.lang3.text.StrTokenizer strTokenizer8 = new org.apache.commons.lang3.text.StrTokenizer(charArray2, '4', 'a');
        char[] charArray11 = new char[] { '4', ' ' };
        org.apache.commons.lang3.text.StrTokenizer strTokenizer14 = new org.apache.commons.lang3.text.StrTokenizer(charArray11, 'a', ' ');
        org.apache.commons.lang3.text.StrMatcher strMatcher15 = strTokenizer14.getTrimmerMatcher();
        org.apache.commons.lang3.text.StrMatcher strMatcher16 = strTokenizer14.getQuoteMatcher();
        org.apache.commons.lang3.text.StrTokenizer strTokenizer17 = new org.apache.commons.lang3.text.StrTokenizer(charArray2, strMatcher16);
        org.apache.commons.lang3.text.StrTokenizer strTokenizer19 = new org.apache.commons.lang3.text.StrTokenizer(charArray2, "");
        org.apache.commons.lang3.text.StrTokenizer strTokenizer20 = new org.apache.commons.lang3.text.StrTokenizer(charArray2);
        org.apache.commons.lang3.text.StrTokenizer strTokenizer22 = new org.apache.commons.lang3.text.StrTokenizer(charArray2, "StrTokenizer[not tokenized yet]");
        org.apache.commons.lang3.text.StrTokenizer strTokenizer24 = new org.apache.commons.lang3.text.StrTokenizer(charArray2, ' ');
        org.apache.commons.lang3.text.StrTokenizer strTokenizer25 = new org.apache.commons.lang3.text.StrTokenizer(charArray2);
        org.apache.commons.lang3.text.StrTokenizer strTokenizer27 = strTokenizer25.setEmptyTokenAsNull(false);
        org.junit.Assert.assertNotNull(charArray2);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray2), "4 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray2), "4 ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray2), "[4,  ]");
        org.junit.Assert.assertNotNull(charArray11);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray11), "4 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray11), "4 ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray11), "[4,  ]");
        org.junit.Assert.assertNotNull(strMatcher15);
        org.junit.Assert.assertNotNull(strMatcher16);
        org.junit.Assert.assertNotNull(strTokenizer27);
    }

    @Test
    public void test1514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1514");
        char[] charArray1 = null;
        org.apache.commons.lang3.text.StrTokenizer strTokenizer3 = new org.apache.commons.lang3.text.StrTokenizer(charArray1, "");
        java.lang.String str4 = strTokenizer3.getContent();
        org.apache.commons.lang3.text.StrMatcher strMatcher5 = strTokenizer3.getDelimiterMatcher();
        org.apache.commons.lang3.text.StrTokenizer strTokenizer6 = new org.apache.commons.lang3.text.StrTokenizer("StrTokenizer[4 ]", strMatcher5);
        java.lang.String str7 = strTokenizer6.nextToken();
        char[] charArray11 = new char[] { '4', ' ' };
        org.apache.commons.lang3.text.StrTokenizer strTokenizer14 = new org.apache.commons.lang3.text.StrTokenizer(charArray11, 'a', ' ');
        org.apache.commons.lang3.text.StrMatcher strMatcher15 = strTokenizer14.getTrimmerMatcher();
        org.apache.commons.lang3.text.StrTokenizer strTokenizer17 = strTokenizer14.setDelimiterString("");
        org.apache.commons.lang3.text.StrMatcher strMatcher18 = strTokenizer17.getTrimmerMatcher();
        org.apache.commons.lang3.text.StrTokenizer strTokenizer19 = new org.apache.commons.lang3.text.StrTokenizer("", strMatcher18);
        char[] charArray22 = new char[] { '4', ' ' };
        org.apache.commons.lang3.text.StrTokenizer strTokenizer25 = new org.apache.commons.lang3.text.StrTokenizer(charArray22, 'a', ' ');
        org.apache.commons.lang3.text.StrMatcher strMatcher26 = strTokenizer25.getTrimmerMatcher();
        org.apache.commons.lang3.text.StrMatcher strMatcher27 = strTokenizer25.getQuoteMatcher();
        org.apache.commons.lang3.text.StrTokenizer strTokenizer28 = strTokenizer19.setDelimiterMatcher(strMatcher27);
        org.apache.commons.lang3.text.StrTokenizer strTokenizer29 = strTokenizer6.setIgnoredMatcher(strMatcher27);
        java.lang.String str30 = strTokenizer6.previousToken();
        // The following exception was thrown during execution in test generation
        try {
            strTokenizer6.remove();
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: remove() is unsupported");
        } catch (java.lang.UnsupportedOperationException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNotNull(strMatcher5);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "StrTokenizer[4 ]" + "'", str7, "StrTokenizer[4 ]");
        org.junit.Assert.assertNotNull(charArray11);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray11), "4 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray11), "4 ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray11), "[4,  ]");
        org.junit.Assert.assertNotNull(strMatcher15);
        org.junit.Assert.assertNotNull(strTokenizer17);
        org.junit.Assert.assertNotNull(strMatcher18);
        org.junit.Assert.assertNotNull(charArray22);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray22), "4 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray22), "4 ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray22), "[4,  ]");
        org.junit.Assert.assertNotNull(strMatcher26);
        org.junit.Assert.assertNotNull(strMatcher27);
        org.junit.Assert.assertNotNull(strTokenizer28);
        org.junit.Assert.assertNotNull(strTokenizer29);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "StrTokenizer[4 ]" + "'", str30, "StrTokenizer[4 ]");
    }

    @Test
    public void test1515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1515");
        char[] charArray2 = new char[] { '4', ' ' };
        org.apache.commons.lang3.text.StrTokenizer strTokenizer5 = new org.apache.commons.lang3.text.StrTokenizer(charArray2, 'a', ' ');
        org.apache.commons.lang3.text.StrTokenizer strTokenizer7 = new org.apache.commons.lang3.text.StrTokenizer(charArray2, "hi!");
        org.apache.commons.lang3.text.StrTokenizer strTokenizer9 = new org.apache.commons.lang3.text.StrTokenizer(charArray2, '#');
        org.apache.commons.lang3.text.StrTokenizer strTokenizer10 = new org.apache.commons.lang3.text.StrTokenizer(charArray2);
        org.apache.commons.lang3.text.StrTokenizer strTokenizer11 = org.apache.commons.lang3.text.StrTokenizer.getCSVInstance(charArray2);
        org.apache.commons.lang3.text.StrTokenizer strTokenizer13 = new org.apache.commons.lang3.text.StrTokenizer(charArray2, "StrTokenizer[StrTokenizer[4, ]]");
        org.apache.commons.lang3.text.StrTokenizer strTokenizer14 = new org.apache.commons.lang3.text.StrTokenizer(charArray2);
        org.junit.Assert.assertNotNull(charArray2);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray2), "4 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray2), "4 ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray2), "[4,  ]");
        org.junit.Assert.assertNotNull(strTokenizer11);
    }

    @Test
    public void test1516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1516");
        org.apache.commons.lang3.text.StrTokenizer strTokenizer2 = new org.apache.commons.lang3.text.StrTokenizer("StrTokenizer[StrTokenizer[4, ]]", "4 ");
        java.lang.Object obj3 = strTokenizer2.clone();
        org.junit.Assert.assertNotNull(obj3);
        org.junit.Assert.assertEquals(obj3.toString(), "StrTokenizer[not tokenized yet]");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj3), "StrTokenizer[not tokenized yet]");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj3), "StrTokenizer[not tokenized yet]");
    }

    @Test
    public void test1517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1517");
        char[] charArray2 = new char[] { '4', ' ' };
        org.apache.commons.lang3.text.StrTokenizer strTokenizer5 = new org.apache.commons.lang3.text.StrTokenizer(charArray2, 'a', ' ');
        char[] charArray8 = new char[] { '4', ' ' };
        org.apache.commons.lang3.text.StrTokenizer strTokenizer11 = new org.apache.commons.lang3.text.StrTokenizer(charArray8, 'a', ' ');
        org.apache.commons.lang3.text.StrMatcher strMatcher12 = strTokenizer11.getTrimmerMatcher();
        org.apache.commons.lang3.text.StrTokenizer strTokenizer14 = strTokenizer11.setDelimiterString("");
        org.apache.commons.lang3.text.StrMatcher strMatcher15 = strTokenizer14.getTrimmerMatcher();
        org.apache.commons.lang3.text.StrMatcher strMatcher16 = strTokenizer14.getTrimmerMatcher();
        char[] charArray18 = null;
        org.apache.commons.lang3.text.StrTokenizer strTokenizer20 = new org.apache.commons.lang3.text.StrTokenizer(charArray18, "");
        java.lang.String str21 = strTokenizer20.getContent();
        org.apache.commons.lang3.text.StrMatcher strMatcher22 = strTokenizer20.getDelimiterMatcher();
        org.apache.commons.lang3.text.StrTokenizer strTokenizer23 = new org.apache.commons.lang3.text.StrTokenizer("hi!", strMatcher22);
        org.apache.commons.lang3.text.StrTokenizer strTokenizer24 = new org.apache.commons.lang3.text.StrTokenizer(charArray2, strMatcher16, strMatcher22);
        char[] charArray27 = new char[] { '4', ' ' };
        org.apache.commons.lang3.text.StrTokenizer strTokenizer30 = new org.apache.commons.lang3.text.StrTokenizer(charArray27, 'a', ' ');
        org.apache.commons.lang3.text.StrTokenizer strTokenizer31 = org.apache.commons.lang3.text.StrTokenizer.getCSVInstance(charArray27);
        org.apache.commons.lang3.text.StrMatcher strMatcher32 = null;
        org.apache.commons.lang3.text.StrTokenizer strTokenizer33 = new org.apache.commons.lang3.text.StrTokenizer(charArray27, strMatcher32);
        org.apache.commons.lang3.text.StrTokenizer strTokenizer36 = new org.apache.commons.lang3.text.StrTokenizer(charArray27, ' ', '#');
        char[] charArray40 = new char[] { '4', ' ' };
        org.apache.commons.lang3.text.StrTokenizer strTokenizer43 = new org.apache.commons.lang3.text.StrTokenizer(charArray40, 'a', ' ');
        org.apache.commons.lang3.text.StrMatcher strMatcher44 = strTokenizer43.getTrimmerMatcher();
        org.apache.commons.lang3.text.StrTokenizer strTokenizer46 = strTokenizer43.setDelimiterString("");
        org.apache.commons.lang3.text.StrMatcher strMatcher47 = strTokenizer46.getTrimmerMatcher();
        org.apache.commons.lang3.text.StrTokenizer strTokenizer48 = new org.apache.commons.lang3.text.StrTokenizer("", strMatcher47);
        char[] charArray51 = new char[] { '4', ' ' };
        org.apache.commons.lang3.text.StrTokenizer strTokenizer54 = new org.apache.commons.lang3.text.StrTokenizer(charArray51, 'a', ' ');
        org.apache.commons.lang3.text.StrMatcher strMatcher55 = strTokenizer54.getTrimmerMatcher();
        org.apache.commons.lang3.text.StrTokenizer strTokenizer57 = strTokenizer54.setDelimiterString("");
        org.apache.commons.lang3.text.StrMatcher strMatcher58 = strTokenizer57.getTrimmerMatcher();
        org.apache.commons.lang3.text.StrTokenizer strTokenizer59 = strTokenizer48.setTrimmerMatcher(strMatcher58);
        org.apache.commons.lang3.text.StrTokenizer strTokenizer60 = new org.apache.commons.lang3.text.StrTokenizer(charArray27, strMatcher58);
        org.apache.commons.lang3.text.StrTokenizer strTokenizer61 = new org.apache.commons.lang3.text.StrTokenizer(charArray2, strMatcher58);
        org.apache.commons.lang3.text.StrTokenizer strTokenizer64 = new org.apache.commons.lang3.text.StrTokenizer(charArray2, 'a', 'a');
        org.apache.commons.lang3.text.StrTokenizer strTokenizer66 = new org.apache.commons.lang3.text.StrTokenizer(charArray2, "hi!");
        // The following exception was thrown during execution in test generation
        try {
            strTokenizer66.add("a#");
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: add() is unsupported");
        } catch (java.lang.UnsupportedOperationException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray2);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray2), "4 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray2), "4 ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray2), "[4,  ]");
        org.junit.Assert.assertNotNull(charArray8);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray8), "4 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray8), "4 ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray8), "[4,  ]");
        org.junit.Assert.assertNotNull(strMatcher12);
        org.junit.Assert.assertNotNull(strTokenizer14);
        org.junit.Assert.assertNotNull(strMatcher15);
        org.junit.Assert.assertNotNull(strMatcher16);
        org.junit.Assert.assertNull(str21);
        org.junit.Assert.assertNotNull(strMatcher22);
        org.junit.Assert.assertNotNull(charArray27);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray27), "4 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray27), "4 ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray27), "[4,  ]");
        org.junit.Assert.assertNotNull(strTokenizer31);
        org.junit.Assert.assertNotNull(charArray40);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray40), "4 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray40), "4 ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray40), "[4,  ]");
        org.junit.Assert.assertNotNull(strMatcher44);
        org.junit.Assert.assertNotNull(strTokenizer46);
        org.junit.Assert.assertNotNull(strMatcher47);
        org.junit.Assert.assertNotNull(charArray51);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray51), "4 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray51), "4 ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray51), "[4,  ]");
        org.junit.Assert.assertNotNull(strMatcher55);
        org.junit.Assert.assertNotNull(strTokenizer57);
        org.junit.Assert.assertNotNull(strMatcher58);
        org.junit.Assert.assertNotNull(strTokenizer59);
    }

    @Test
    public void test1518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1518");
        char[] charArray2 = new char[] { '4', ' ' };
        org.apache.commons.lang3.text.StrTokenizer strTokenizer5 = new org.apache.commons.lang3.text.StrTokenizer(charArray2, 'a', ' ');
        org.apache.commons.lang3.text.StrMatcher strMatcher6 = strTokenizer5.getTrimmerMatcher();
        org.apache.commons.lang3.text.StrTokenizer strTokenizer8 = strTokenizer5.setDelimiterString("");
        org.apache.commons.lang3.text.StrMatcher strMatcher9 = strTokenizer8.getTrimmerMatcher();
        org.apache.commons.lang3.text.StrMatcher strMatcher10 = strTokenizer8.getTrimmerMatcher();
        char[] charArray13 = new char[] { '4', ' ' };
        org.apache.commons.lang3.text.StrTokenizer strTokenizer16 = new org.apache.commons.lang3.text.StrTokenizer(charArray13, 'a', ' ');
        org.apache.commons.lang3.text.StrTokenizer strTokenizer17 = strTokenizer8.reset(charArray13);
        char[] charArray20 = new char[] { '4', ' ' };
        org.apache.commons.lang3.text.StrTokenizer strTokenizer23 = new org.apache.commons.lang3.text.StrTokenizer(charArray20, 'a', ' ');
        org.apache.commons.lang3.text.StrMatcher strMatcher24 = strTokenizer23.getTrimmerMatcher();
        org.apache.commons.lang3.text.StrTokenizer strTokenizer26 = strTokenizer23.setDelimiterString("");
        char[] charArray30 = new char[] { '4', ' ' };
        org.apache.commons.lang3.text.StrTokenizer strTokenizer33 = new org.apache.commons.lang3.text.StrTokenizer(charArray30, 'a', ' ');
        org.apache.commons.lang3.text.StrMatcher strMatcher34 = strTokenizer33.getTrimmerMatcher();
        org.apache.commons.lang3.text.StrTokenizer strTokenizer36 = strTokenizer33.setDelimiterString("");
        org.apache.commons.lang3.text.StrMatcher strMatcher37 = strTokenizer36.getTrimmerMatcher();
        org.apache.commons.lang3.text.StrTokenizer strTokenizer38 = new org.apache.commons.lang3.text.StrTokenizer("", strMatcher37);
        char[] charArray41 = new char[] { '4', ' ' };
        org.apache.commons.lang3.text.StrTokenizer strTokenizer44 = new org.apache.commons.lang3.text.StrTokenizer(charArray41, 'a', ' ');
        org.apache.commons.lang3.text.StrMatcher strMatcher45 = strTokenizer44.getTrimmerMatcher();
        org.apache.commons.lang3.text.StrTokenizer strTokenizer47 = strTokenizer44.setDelimiterString("");
        org.apache.commons.lang3.text.StrMatcher strMatcher48 = strTokenizer47.getTrimmerMatcher();
        org.apache.commons.lang3.text.StrTokenizer strTokenizer49 = strTokenizer38.setTrimmerMatcher(strMatcher48);
        org.apache.commons.lang3.text.StrTokenizer strTokenizer50 = strTokenizer26.setTrimmerMatcher(strMatcher48);
        org.apache.commons.lang3.text.StrTokenizer strTokenizer51 = strTokenizer8.setQuoteMatcher(strMatcher48);
        java.lang.String str52 = strTokenizer51.getContent();
        org.apache.commons.lang3.text.StrTokenizer strTokenizer54 = strTokenizer51.setDelimiterString("StrTokenizer[4 ]");
        int int55 = strTokenizer51.size();
        org.apache.commons.lang3.text.StrMatcher strMatcher56 = strTokenizer51.getQuoteMatcher();
        java.lang.String str57 = strTokenizer51.toString();
        org.apache.commons.lang3.text.StrTokenizer strTokenizer59 = strTokenizer51.setDelimiterChar(' ');
        org.junit.Assert.assertNotNull(charArray2);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray2), "4 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray2), "4 ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray2), "[4,  ]");
        org.junit.Assert.assertNotNull(strMatcher6);
        org.junit.Assert.assertNotNull(strTokenizer8);
        org.junit.Assert.assertNotNull(strMatcher9);
        org.junit.Assert.assertNotNull(strMatcher10);
        org.junit.Assert.assertNotNull(charArray13);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray13), "4 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray13), "4 ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray13), "[4,  ]");
        org.junit.Assert.assertNotNull(strTokenizer17);
        org.junit.Assert.assertNotNull(charArray20);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray20), "4 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray20), "4 ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray20), "[4,  ]");
        org.junit.Assert.assertNotNull(strMatcher24);
        org.junit.Assert.assertNotNull(strTokenizer26);
        org.junit.Assert.assertNotNull(charArray30);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray30), "4 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray30), "4 ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray30), "[4,  ]");
        org.junit.Assert.assertNotNull(strMatcher34);
        org.junit.Assert.assertNotNull(strTokenizer36);
        org.junit.Assert.assertNotNull(strMatcher37);
        org.junit.Assert.assertNotNull(charArray41);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray41), "4 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray41), "4 ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray41), "[4,  ]");
        org.junit.Assert.assertNotNull(strMatcher45);
        org.junit.Assert.assertNotNull(strTokenizer47);
        org.junit.Assert.assertNotNull(strMatcher48);
        org.junit.Assert.assertNotNull(strTokenizer49);
        org.junit.Assert.assertNotNull(strTokenizer50);
        org.junit.Assert.assertNotNull(strTokenizer51);
        org.junit.Assert.assertEquals("'" + str52 + "' != '" + "4 " + "'", str52, "4 ");
        org.junit.Assert.assertNotNull(strTokenizer54);
        org.junit.Assert.assertTrue("'" + int55 + "' != '" + 1 + "'", int55 == 1);
        org.junit.Assert.assertNotNull(strMatcher56);
        org.junit.Assert.assertEquals("'" + str57 + "' != '" + "StrTokenizer[4 ]" + "'", str57, "StrTokenizer[4 ]");
        org.junit.Assert.assertNotNull(strTokenizer59);
    }

    @Test
    public void test1519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1519");
        char[] charArray2 = new char[] { '4', ' ' };
        org.apache.commons.lang3.text.StrTokenizer strTokenizer5 = new org.apache.commons.lang3.text.StrTokenizer(charArray2, 'a', ' ');
        org.apache.commons.lang3.text.StrTokenizer strTokenizer6 = org.apache.commons.lang3.text.StrTokenizer.getCSVInstance(charArray2);
        org.apache.commons.lang3.text.StrMatcher strMatcher7 = null;
        org.apache.commons.lang3.text.StrTokenizer strTokenizer8 = new org.apache.commons.lang3.text.StrTokenizer(charArray2, strMatcher7);
        char[] charArray11 = new char[] { '4', ' ' };
        org.apache.commons.lang3.text.StrTokenizer strTokenizer14 = new org.apache.commons.lang3.text.StrTokenizer(charArray11, 'a', ' ');
        org.apache.commons.lang3.text.StrMatcher strMatcher15 = strTokenizer14.getTrimmerMatcher();
        org.apache.commons.lang3.text.StrTokenizer strTokenizer17 = strTokenizer14.setDelimiterString("");
        org.apache.commons.lang3.text.StrMatcher strMatcher18 = strTokenizer17.getTrimmerMatcher();
        org.apache.commons.lang3.text.StrTokenizer strTokenizer19 = new org.apache.commons.lang3.text.StrTokenizer(charArray2, strMatcher18);
        org.apache.commons.lang3.text.StrTokenizer strTokenizer20 = org.apache.commons.lang3.text.StrTokenizer.getTSVInstance(charArray2);
        org.apache.commons.lang3.text.StrTokenizer strTokenizer22 = new org.apache.commons.lang3.text.StrTokenizer(charArray2, ' ');
        boolean boolean23 = strTokenizer22.isEmptyTokenAsNull();
        org.junit.Assert.assertNotNull(charArray2);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray2), "4 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray2), "4 ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray2), "[4,  ]");
        org.junit.Assert.assertNotNull(strTokenizer6);
        org.junit.Assert.assertNotNull(charArray11);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray11), "4 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray11), "4 ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray11), "[4,  ]");
        org.junit.Assert.assertNotNull(strMatcher15);
        org.junit.Assert.assertNotNull(strTokenizer17);
        org.junit.Assert.assertNotNull(strMatcher18);
        org.junit.Assert.assertNotNull(strTokenizer20);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
    }

    @Test
    public void test1520() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1520");
        char[] charArray0 = null;
        org.apache.commons.lang3.text.StrTokenizer strTokenizer2 = new org.apache.commons.lang3.text.StrTokenizer(charArray0, "");
        org.apache.commons.lang3.text.StrTokenizer strTokenizer4 = strTokenizer2.setQuoteChar('#');
        // The following exception was thrown during execution in test generation
        try {
            strTokenizer4.remove();
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: remove() is unsupported");
        } catch (java.lang.UnsupportedOperationException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strTokenizer4);
    }

    @Test
    public void test1521() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1521");
        org.apache.commons.lang3.text.StrTokenizer strTokenizer1 = org.apache.commons.lang3.text.StrTokenizer.getCSVInstance("hi!");
        char[] charArray4 = new char[] { 'a', '#' };
        org.apache.commons.lang3.text.StrTokenizer strTokenizer5 = org.apache.commons.lang3.text.StrTokenizer.getCSVInstance(charArray4);
        org.apache.commons.lang3.text.StrTokenizer strTokenizer6 = strTokenizer1.reset(charArray4);
        char[] charArray9 = new char[] { '4', ' ' };
        org.apache.commons.lang3.text.StrTokenizer strTokenizer12 = new org.apache.commons.lang3.text.StrTokenizer(charArray9, 'a', ' ');
        org.apache.commons.lang3.text.StrTokenizer strTokenizer14 = new org.apache.commons.lang3.text.StrTokenizer(charArray9, "hi!");
        org.apache.commons.lang3.text.StrTokenizer strTokenizer15 = new org.apache.commons.lang3.text.StrTokenizer(charArray9);
        char[] charArray20 = new char[] { '4', ' ' };
        org.apache.commons.lang3.text.StrTokenizer strTokenizer23 = new org.apache.commons.lang3.text.StrTokenizer(charArray20, 'a', ' ');
        org.apache.commons.lang3.text.StrMatcher strMatcher24 = strTokenizer23.getTrimmerMatcher();
        org.apache.commons.lang3.text.StrTokenizer strTokenizer26 = strTokenizer23.setDelimiterString("");
        org.apache.commons.lang3.text.StrMatcher strMatcher27 = strTokenizer26.getTrimmerMatcher();
        org.apache.commons.lang3.text.StrTokenizer strTokenizer28 = new org.apache.commons.lang3.text.StrTokenizer("", strMatcher27);
        char[] charArray31 = new char[] { '4', ' ' };
        org.apache.commons.lang3.text.StrTokenizer strTokenizer34 = new org.apache.commons.lang3.text.StrTokenizer(charArray31, 'a', ' ');
        org.apache.commons.lang3.text.StrMatcher strMatcher35 = strTokenizer34.getTrimmerMatcher();
        org.apache.commons.lang3.text.StrMatcher strMatcher36 = strTokenizer34.getQuoteMatcher();
        org.apache.commons.lang3.text.StrTokenizer strTokenizer37 = strTokenizer28.setDelimiterMatcher(strMatcher36);
        char[] charArray40 = new char[] { '4', ' ' };
        org.apache.commons.lang3.text.StrTokenizer strTokenizer43 = new org.apache.commons.lang3.text.StrTokenizer(charArray40, 'a', ' ');
        org.apache.commons.lang3.text.StrMatcher strMatcher44 = strTokenizer43.getTrimmerMatcher();
        org.apache.commons.lang3.text.StrMatcher strMatcher45 = strTokenizer43.getQuoteMatcher();
        org.apache.commons.lang3.text.StrTokenizer strTokenizer46 = new org.apache.commons.lang3.text.StrTokenizer("", strMatcher36, strMatcher45);
        org.apache.commons.lang3.text.StrTokenizer strTokenizer47 = strTokenizer15.setTrimmerMatcher(strMatcher45);
        org.apache.commons.lang3.text.StrTokenizer strTokenizer48 = new org.apache.commons.lang3.text.StrTokenizer(charArray4, strMatcher45);
        org.apache.commons.lang3.text.StrTokenizer strTokenizer49 = org.apache.commons.lang3.text.StrTokenizer.getTSVInstance(charArray4);
        boolean boolean50 = strTokenizer49.isEmptyTokenAsNull();
        org.junit.Assert.assertNotNull(strTokenizer1);
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray4), "a#");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray4), "a#");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray4), "[a, #]");
        org.junit.Assert.assertNotNull(strTokenizer5);
        org.junit.Assert.assertNotNull(strTokenizer6);
        org.junit.Assert.assertNotNull(charArray9);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray9), "4 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray9), "4 ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray9), "[4,  ]");
        org.junit.Assert.assertNotNull(charArray20);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray20), "4 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray20), "4 ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray20), "[4,  ]");
        org.junit.Assert.assertNotNull(strMatcher24);
        org.junit.Assert.assertNotNull(strTokenizer26);
        org.junit.Assert.assertNotNull(strMatcher27);
        org.junit.Assert.assertNotNull(charArray31);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray31), "4 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray31), "4 ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray31), "[4,  ]");
        org.junit.Assert.assertNotNull(strMatcher35);
        org.junit.Assert.assertNotNull(strMatcher36);
        org.junit.Assert.assertNotNull(strTokenizer37);
        org.junit.Assert.assertNotNull(charArray40);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray40), "4 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray40), "4 ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray40), "[4,  ]");
        org.junit.Assert.assertNotNull(strMatcher44);
        org.junit.Assert.assertNotNull(strMatcher45);
        org.junit.Assert.assertNotNull(strTokenizer47);
        org.junit.Assert.assertNotNull(strTokenizer49);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
    }

    @Test
    public void test1522() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1522");
        char[] charArray2 = new char[] { '4', ' ' };
        org.apache.commons.lang3.text.StrTokenizer strTokenizer5 = new org.apache.commons.lang3.text.StrTokenizer(charArray2, 'a', ' ');
        org.apache.commons.lang3.text.StrMatcher strMatcher6 = strTokenizer5.getTrimmerMatcher();
        org.apache.commons.lang3.text.StrTokenizer strTokenizer8 = strTokenizer5.setDelimiterString("");
        char[] charArray12 = new char[] { '4', ' ' };
        org.apache.commons.lang3.text.StrTokenizer strTokenizer15 = new org.apache.commons.lang3.text.StrTokenizer(charArray12, 'a', ' ');
        org.apache.commons.lang3.text.StrMatcher strMatcher16 = strTokenizer15.getTrimmerMatcher();
        org.apache.commons.lang3.text.StrTokenizer strTokenizer18 = strTokenizer15.setDelimiterString("");
        org.apache.commons.lang3.text.StrMatcher strMatcher19 = strTokenizer18.getTrimmerMatcher();
        org.apache.commons.lang3.text.StrTokenizer strTokenizer20 = new org.apache.commons.lang3.text.StrTokenizer("", strMatcher19);
        char[] charArray23 = new char[] { '4', ' ' };
        org.apache.commons.lang3.text.StrTokenizer strTokenizer26 = new org.apache.commons.lang3.text.StrTokenizer(charArray23, 'a', ' ');
        org.apache.commons.lang3.text.StrMatcher strMatcher27 = strTokenizer26.getTrimmerMatcher();
        org.apache.commons.lang3.text.StrTokenizer strTokenizer29 = strTokenizer26.setDelimiterString("");
        org.apache.commons.lang3.text.StrMatcher strMatcher30 = strTokenizer29.getTrimmerMatcher();
        org.apache.commons.lang3.text.StrTokenizer strTokenizer31 = strTokenizer20.setTrimmerMatcher(strMatcher30);
        org.apache.commons.lang3.text.StrTokenizer strTokenizer32 = strTokenizer8.setTrimmerMatcher(strMatcher30);
        int int33 = strTokenizer32.nextIndex();
        char[] charArray35 = new char[] { '#' };
        org.apache.commons.lang3.text.StrTokenizer strTokenizer36 = new org.apache.commons.lang3.text.StrTokenizer(charArray35);
        org.apache.commons.lang3.text.StrTokenizer strTokenizer38 = new org.apache.commons.lang3.text.StrTokenizer(charArray35, "4 ");
        org.apache.commons.lang3.text.StrTokenizer strTokenizer39 = strTokenizer32.reset(charArray35);
        org.apache.commons.lang3.text.StrTokenizer strTokenizer40 = new org.apache.commons.lang3.text.StrTokenizer(charArray35);
        boolean boolean41 = strTokenizer40.isIgnoreEmptyTokens();
        org.junit.Assert.assertNotNull(charArray2);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray2), "4 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray2), "4 ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray2), "[4,  ]");
        org.junit.Assert.assertNotNull(strMatcher6);
        org.junit.Assert.assertNotNull(strTokenizer8);
        org.junit.Assert.assertNotNull(charArray12);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray12), "4 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray12), "4 ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray12), "[4,  ]");
        org.junit.Assert.assertNotNull(strMatcher16);
        org.junit.Assert.assertNotNull(strTokenizer18);
        org.junit.Assert.assertNotNull(strMatcher19);
        org.junit.Assert.assertNotNull(charArray23);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray23), "4 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray23), "4 ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray23), "[4,  ]");
        org.junit.Assert.assertNotNull(strMatcher27);
        org.junit.Assert.assertNotNull(strTokenizer29);
        org.junit.Assert.assertNotNull(strMatcher30);
        org.junit.Assert.assertNotNull(strTokenizer31);
        org.junit.Assert.assertNotNull(strTokenizer32);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertNotNull(charArray35);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray35), "#");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray35), "#");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray35), "[#]");
        org.junit.Assert.assertNotNull(strTokenizer39);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + true + "'", boolean41 == true);
    }

    @Test
    public void test1523() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1523");
        char[] charArray2 = new char[] { '4', ' ' };
        org.apache.commons.lang3.text.StrTokenizer strTokenizer5 = new org.apache.commons.lang3.text.StrTokenizer(charArray2, 'a', ' ');
        org.apache.commons.lang3.text.StrTokenizer strTokenizer6 = org.apache.commons.lang3.text.StrTokenizer.getCSVInstance(charArray2);
        org.apache.commons.lang3.text.StrMatcher strMatcher7 = null;
        org.apache.commons.lang3.text.StrTokenizer strTokenizer8 = new org.apache.commons.lang3.text.StrTokenizer(charArray2, strMatcher7);
        char[] charArray11 = new char[] { '4', ' ' };
        org.apache.commons.lang3.text.StrTokenizer strTokenizer14 = new org.apache.commons.lang3.text.StrTokenizer(charArray11, 'a', ' ');
        org.apache.commons.lang3.text.StrMatcher strMatcher15 = strTokenizer14.getTrimmerMatcher();
        org.apache.commons.lang3.text.StrTokenizer strTokenizer17 = strTokenizer14.setDelimiterString("");
        org.apache.commons.lang3.text.StrMatcher strMatcher18 = strTokenizer17.getTrimmerMatcher();
        org.apache.commons.lang3.text.StrTokenizer strTokenizer19 = new org.apache.commons.lang3.text.StrTokenizer(charArray2, strMatcher18);
        org.apache.commons.lang3.text.StrTokenizer strTokenizer21 = new org.apache.commons.lang3.text.StrTokenizer(charArray2, "StrTokenizer[4 ]");
        boolean boolean22 = strTokenizer21.isIgnoreEmptyTokens();
        org.junit.Assert.assertNotNull(charArray2);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray2), "4 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray2), "4 ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray2), "[4,  ]");
        org.junit.Assert.assertNotNull(strTokenizer6);
        org.junit.Assert.assertNotNull(charArray11);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray11), "4 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray11), "4 ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray11), "[4,  ]");
        org.junit.Assert.assertNotNull(strMatcher15);
        org.junit.Assert.assertNotNull(strTokenizer17);
        org.junit.Assert.assertNotNull(strMatcher18);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
    }

    @Test
    public void test1524() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1524");
        char[] charArray2 = new char[] { '4', ' ' };
        org.apache.commons.lang3.text.StrTokenizer strTokenizer5 = new org.apache.commons.lang3.text.StrTokenizer(charArray2, 'a', ' ');
        org.apache.commons.lang3.text.StrTokenizer strTokenizer6 = org.apache.commons.lang3.text.StrTokenizer.getTSVInstance(charArray2);
        java.lang.String str7 = strTokenizer6.getContent();
        org.apache.commons.lang3.text.StrTokenizer strTokenizer9 = strTokenizer6.setEmptyTokenAsNull(true);
        char[] charArray13 = new char[] { '4', ' ' };
        org.apache.commons.lang3.text.StrTokenizer strTokenizer16 = new org.apache.commons.lang3.text.StrTokenizer(charArray13, 'a', ' ');
        char[] charArray19 = new char[] { '4', ' ' };
        org.apache.commons.lang3.text.StrTokenizer strTokenizer22 = new org.apache.commons.lang3.text.StrTokenizer(charArray19, 'a', ' ');
        org.apache.commons.lang3.text.StrMatcher strMatcher23 = strTokenizer22.getTrimmerMatcher();
        org.apache.commons.lang3.text.StrTokenizer strTokenizer25 = strTokenizer22.setDelimiterString("");
        org.apache.commons.lang3.text.StrMatcher strMatcher26 = strTokenizer25.getTrimmerMatcher();
        org.apache.commons.lang3.text.StrMatcher strMatcher27 = strTokenizer25.getTrimmerMatcher();
        char[] charArray29 = null;
        org.apache.commons.lang3.text.StrTokenizer strTokenizer31 = new org.apache.commons.lang3.text.StrTokenizer(charArray29, "");
        java.lang.String str32 = strTokenizer31.getContent();
        org.apache.commons.lang3.text.StrMatcher strMatcher33 = strTokenizer31.getDelimiterMatcher();
        org.apache.commons.lang3.text.StrTokenizer strTokenizer34 = new org.apache.commons.lang3.text.StrTokenizer("hi!", strMatcher33);
        org.apache.commons.lang3.text.StrTokenizer strTokenizer35 = new org.apache.commons.lang3.text.StrTokenizer(charArray13, strMatcher27, strMatcher33);
        char[] charArray37 = null;
        org.apache.commons.lang3.text.StrTokenizer strTokenizer39 = new org.apache.commons.lang3.text.StrTokenizer(charArray37, "");
        java.lang.String str40 = strTokenizer39.getContent();
        org.apache.commons.lang3.text.StrMatcher strMatcher41 = strTokenizer39.getDelimiterMatcher();
        org.apache.commons.lang3.text.StrTokenizer strTokenizer43 = org.apache.commons.lang3.text.StrTokenizer.getCSVInstance("");
        java.util.List<java.lang.String> strList44 = strTokenizer43.getTokenList();
        boolean boolean45 = strTokenizer43.hasPrevious();
        java.lang.String[] strArray46 = strTokenizer43.getTokenArray();
        char[] charArray49 = new char[] { '4', ' ' };
        org.apache.commons.lang3.text.StrTokenizer strTokenizer52 = new org.apache.commons.lang3.text.StrTokenizer(charArray49, 'a', ' ');
        org.apache.commons.lang3.text.StrTokenizer strTokenizer53 = org.apache.commons.lang3.text.StrTokenizer.getCSVInstance(charArray49);
        org.apache.commons.lang3.text.StrMatcher strMatcher54 = null;
        org.apache.commons.lang3.text.StrTokenizer strTokenizer55 = new org.apache.commons.lang3.text.StrTokenizer(charArray49, strMatcher54);
        char[] charArray58 = new char[] { '4', ' ' };
        org.apache.commons.lang3.text.StrTokenizer strTokenizer61 = new org.apache.commons.lang3.text.StrTokenizer(charArray58, 'a', ' ');
        org.apache.commons.lang3.text.StrMatcher strMatcher62 = strTokenizer61.getTrimmerMatcher();
        org.apache.commons.lang3.text.StrTokenizer strTokenizer64 = strTokenizer61.setDelimiterString("");
        org.apache.commons.lang3.text.StrMatcher strMatcher65 = strTokenizer64.getTrimmerMatcher();
        org.apache.commons.lang3.text.StrTokenizer strTokenizer66 = new org.apache.commons.lang3.text.StrTokenizer(charArray49, strMatcher65);
        org.apache.commons.lang3.text.StrTokenizer strTokenizer67 = strTokenizer43.setTrimmerMatcher(strMatcher65);
        org.apache.commons.lang3.text.StrTokenizer strTokenizer68 = new org.apache.commons.lang3.text.StrTokenizer("StrTokenizer[]", strMatcher41, strMatcher65);
        org.apache.commons.lang3.text.StrTokenizer strTokenizer69 = new org.apache.commons.lang3.text.StrTokenizer("StrTokenizer[4 ]", strMatcher33, strMatcher65);
        org.apache.commons.lang3.text.StrTokenizer strTokenizer70 = strTokenizer9.setIgnoredMatcher(strMatcher65);
        org.junit.Assert.assertNotNull(charArray2);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray2), "4 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray2), "4 ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray2), "[4,  ]");
        org.junit.Assert.assertNotNull(strTokenizer6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "4 " + "'", str7, "4 ");
        org.junit.Assert.assertNotNull(strTokenizer9);
        org.junit.Assert.assertNotNull(charArray13);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray13), "4 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray13), "4 ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray13), "[4,  ]");
        org.junit.Assert.assertNotNull(charArray19);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray19), "4 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray19), "4 ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray19), "[4,  ]");
        org.junit.Assert.assertNotNull(strMatcher23);
        org.junit.Assert.assertNotNull(strTokenizer25);
        org.junit.Assert.assertNotNull(strMatcher26);
        org.junit.Assert.assertNotNull(strMatcher27);
        org.junit.Assert.assertNull(str32);
        org.junit.Assert.assertNotNull(strMatcher33);
        org.junit.Assert.assertNull(str40);
        org.junit.Assert.assertNotNull(strMatcher41);
        org.junit.Assert.assertNotNull(strTokenizer43);
        org.junit.Assert.assertNotNull(strList44);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertNotNull(strArray46);
        org.junit.Assert.assertNotNull(charArray49);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray49), "4 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray49), "4 ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray49), "[4,  ]");
        org.junit.Assert.assertNotNull(strTokenizer53);
        org.junit.Assert.assertNotNull(charArray58);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray58), "4 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray58), "4 ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray58), "[4,  ]");
        org.junit.Assert.assertNotNull(strMatcher62);
        org.junit.Assert.assertNotNull(strTokenizer64);
        org.junit.Assert.assertNotNull(strMatcher65);
        org.junit.Assert.assertNotNull(strTokenizer67);
        org.junit.Assert.assertNotNull(strTokenizer70);
    }

    @Test
    public void test1525() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1525");
        char[] charArray6 = new char[] { '#', ' ', ' ', 'a', '#' };
        org.apache.commons.lang3.text.StrTokenizer strTokenizer9 = new org.apache.commons.lang3.text.StrTokenizer(charArray6, '#', ' ');
        org.apache.commons.lang3.text.StrTokenizer strTokenizer11 = new org.apache.commons.lang3.text.StrTokenizer(charArray6, "StrTokenizer[]");
        org.apache.commons.lang3.text.StrTokenizer strTokenizer13 = new org.apache.commons.lang3.text.StrTokenizer(charArray6, "StrTokenizer[]");
        org.apache.commons.lang3.text.StrTokenizer strTokenizer16 = org.apache.commons.lang3.text.StrTokenizer.getCSVInstance();
        boolean boolean17 = strTokenizer16.isIgnoreEmptyTokens();
        int int18 = strTokenizer16.nextIndex();
        org.apache.commons.lang3.text.StrTokenizer strTokenizer20 = strTokenizer16.setIgnoreEmptyTokens(false);
        org.apache.commons.lang3.text.StrMatcher strMatcher21 = null;
        org.apache.commons.lang3.text.StrTokenizer strTokenizer22 = strTokenizer20.setDelimiterMatcher(strMatcher21);
        org.apache.commons.lang3.text.StrMatcher strMatcher23 = strTokenizer20.getDelimiterMatcher();
        char[] charArray26 = new char[] { '4', ' ' };
        org.apache.commons.lang3.text.StrTokenizer strTokenizer29 = new org.apache.commons.lang3.text.StrTokenizer(charArray26, 'a', ' ');
        org.apache.commons.lang3.text.StrTokenizer strTokenizer30 = org.apache.commons.lang3.text.StrTokenizer.getCSVInstance(charArray26);
        org.apache.commons.lang3.text.StrMatcher strMatcher31 = null;
        org.apache.commons.lang3.text.StrTokenizer strTokenizer32 = new org.apache.commons.lang3.text.StrTokenizer(charArray26, strMatcher31);
        char[] charArray35 = new char[] { '4', ' ' };
        org.apache.commons.lang3.text.StrTokenizer strTokenizer38 = new org.apache.commons.lang3.text.StrTokenizer(charArray35, 'a', ' ');
        org.apache.commons.lang3.text.StrMatcher strMatcher39 = strTokenizer38.getTrimmerMatcher();
        org.apache.commons.lang3.text.StrTokenizer strTokenizer41 = strTokenizer38.setDelimiterString("");
        org.apache.commons.lang3.text.StrMatcher strMatcher42 = strTokenizer41.getTrimmerMatcher();
        org.apache.commons.lang3.text.StrTokenizer strTokenizer43 = new org.apache.commons.lang3.text.StrTokenizer(charArray26, strMatcher42);
        char[] charArray46 = new char[] { '4', ' ' };
        org.apache.commons.lang3.text.StrTokenizer strTokenizer49 = new org.apache.commons.lang3.text.StrTokenizer(charArray46, 'a', ' ');
        org.apache.commons.lang3.text.StrMatcher strMatcher50 = strTokenizer49.getTrimmerMatcher();
        org.apache.commons.lang3.text.StrTokenizer strTokenizer51 = new org.apache.commons.lang3.text.StrTokenizer(charArray26, strMatcher50);
        org.apache.commons.lang3.text.StrTokenizer strTokenizer52 = org.apache.commons.lang3.text.StrTokenizer.getTSVInstance(charArray26);
        org.apache.commons.lang3.text.StrMatcher strMatcher53 = strTokenizer52.getIgnoredMatcher();
        org.apache.commons.lang3.text.StrTokenizer strTokenizer54 = new org.apache.commons.lang3.text.StrTokenizer("", strMatcher23, strMatcher53);
        org.apache.commons.lang3.text.StrTokenizer strTokenizer55 = new org.apache.commons.lang3.text.StrTokenizer("StrTokenizer[StrTokenizer[4 ]]", strMatcher53);
        org.apache.commons.lang3.text.StrTokenizer strTokenizer56 = strTokenizer13.setQuoteMatcher(strMatcher53);
        org.apache.commons.lang3.text.StrTokenizer strTokenizer57 = new org.apache.commons.lang3.text.StrTokenizer("StrTokenizer[]", strMatcher53);
        org.junit.Assert.assertNotNull(charArray6);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray6), "#  a#");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray6), "#  a#");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray6), "[#,  ,  , a, #]");
        org.junit.Assert.assertNotNull(strTokenizer16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertNotNull(strTokenizer20);
        org.junit.Assert.assertNotNull(strTokenizer22);
        org.junit.Assert.assertNotNull(strMatcher23);
        org.junit.Assert.assertNotNull(charArray26);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray26), "4 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray26), "4 ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray26), "[4,  ]");
        org.junit.Assert.assertNotNull(strTokenizer30);
        org.junit.Assert.assertNotNull(charArray35);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray35), "4 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray35), "4 ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray35), "[4,  ]");
        org.junit.Assert.assertNotNull(strMatcher39);
        org.junit.Assert.assertNotNull(strTokenizer41);
        org.junit.Assert.assertNotNull(strMatcher42);
        org.junit.Assert.assertNotNull(charArray46);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray46), "4 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray46), "4 ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray46), "[4,  ]");
        org.junit.Assert.assertNotNull(strMatcher50);
        org.junit.Assert.assertNotNull(strTokenizer52);
        org.junit.Assert.assertNotNull(strMatcher53);
        org.junit.Assert.assertNotNull(strTokenizer56);
    }

    @Test
    public void test1526() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1526");
        char[] charArray1 = null;
        org.apache.commons.lang3.text.StrTokenizer strTokenizer3 = new org.apache.commons.lang3.text.StrTokenizer(charArray1, "StrTokenizer[4 ]");
        org.apache.commons.lang3.text.StrTokenizer strTokenizer5 = strTokenizer3.setDelimiterChar('4');
        int int6 = strTokenizer3.size();
        org.apache.commons.lang3.text.StrTokenizer strTokenizer9 = new org.apache.commons.lang3.text.StrTokenizer("StrTokenizer[StrTokenizer[4 ]]", "");
        char[] charArray13 = new char[] { '4', ' ' };
        org.apache.commons.lang3.text.StrTokenizer strTokenizer16 = new org.apache.commons.lang3.text.StrTokenizer(charArray13, 'a', ' ');
        char[] charArray19 = new char[] { '4', ' ' };
        org.apache.commons.lang3.text.StrTokenizer strTokenizer22 = new org.apache.commons.lang3.text.StrTokenizer(charArray19, 'a', ' ');
        org.apache.commons.lang3.text.StrMatcher strMatcher23 = strTokenizer22.getTrimmerMatcher();
        org.apache.commons.lang3.text.StrTokenizer strTokenizer25 = strTokenizer22.setDelimiterString("");
        org.apache.commons.lang3.text.StrMatcher strMatcher26 = strTokenizer25.getTrimmerMatcher();
        org.apache.commons.lang3.text.StrMatcher strMatcher27 = strTokenizer25.getTrimmerMatcher();
        char[] charArray29 = null;
        org.apache.commons.lang3.text.StrTokenizer strTokenizer31 = new org.apache.commons.lang3.text.StrTokenizer(charArray29, "");
        java.lang.String str32 = strTokenizer31.getContent();
        org.apache.commons.lang3.text.StrMatcher strMatcher33 = strTokenizer31.getDelimiterMatcher();
        org.apache.commons.lang3.text.StrTokenizer strTokenizer34 = new org.apache.commons.lang3.text.StrTokenizer("hi!", strMatcher33);
        org.apache.commons.lang3.text.StrTokenizer strTokenizer35 = new org.apache.commons.lang3.text.StrTokenizer(charArray13, strMatcher27, strMatcher33);
        char[] charArray37 = null;
        org.apache.commons.lang3.text.StrTokenizer strTokenizer39 = new org.apache.commons.lang3.text.StrTokenizer(charArray37, "");
        java.lang.String str40 = strTokenizer39.getContent();
        org.apache.commons.lang3.text.StrMatcher strMatcher41 = strTokenizer39.getDelimiterMatcher();
        org.apache.commons.lang3.text.StrTokenizer strTokenizer43 = org.apache.commons.lang3.text.StrTokenizer.getCSVInstance("");
        java.util.List<java.lang.String> strList44 = strTokenizer43.getTokenList();
        boolean boolean45 = strTokenizer43.hasPrevious();
        java.lang.String[] strArray46 = strTokenizer43.getTokenArray();
        char[] charArray49 = new char[] { '4', ' ' };
        org.apache.commons.lang3.text.StrTokenizer strTokenizer52 = new org.apache.commons.lang3.text.StrTokenizer(charArray49, 'a', ' ');
        org.apache.commons.lang3.text.StrTokenizer strTokenizer53 = org.apache.commons.lang3.text.StrTokenizer.getCSVInstance(charArray49);
        org.apache.commons.lang3.text.StrMatcher strMatcher54 = null;
        org.apache.commons.lang3.text.StrTokenizer strTokenizer55 = new org.apache.commons.lang3.text.StrTokenizer(charArray49, strMatcher54);
        char[] charArray58 = new char[] { '4', ' ' };
        org.apache.commons.lang3.text.StrTokenizer strTokenizer61 = new org.apache.commons.lang3.text.StrTokenizer(charArray58, 'a', ' ');
        org.apache.commons.lang3.text.StrMatcher strMatcher62 = strTokenizer61.getTrimmerMatcher();
        org.apache.commons.lang3.text.StrTokenizer strTokenizer64 = strTokenizer61.setDelimiterString("");
        org.apache.commons.lang3.text.StrMatcher strMatcher65 = strTokenizer64.getTrimmerMatcher();
        org.apache.commons.lang3.text.StrTokenizer strTokenizer66 = new org.apache.commons.lang3.text.StrTokenizer(charArray49, strMatcher65);
        org.apache.commons.lang3.text.StrTokenizer strTokenizer67 = strTokenizer43.setTrimmerMatcher(strMatcher65);
        org.apache.commons.lang3.text.StrTokenizer strTokenizer68 = new org.apache.commons.lang3.text.StrTokenizer("StrTokenizer[]", strMatcher41, strMatcher65);
        org.apache.commons.lang3.text.StrTokenizer strTokenizer69 = new org.apache.commons.lang3.text.StrTokenizer("StrTokenizer[4 ]", strMatcher33, strMatcher65);
        org.apache.commons.lang3.text.StrTokenizer strTokenizer70 = strTokenizer9.setDelimiterMatcher(strMatcher65);
        org.apache.commons.lang3.text.StrTokenizer strTokenizer71 = strTokenizer3.setTrimmerMatcher(strMatcher65);
        org.apache.commons.lang3.text.StrTokenizer strTokenizer72 = new org.apache.commons.lang3.text.StrTokenizer("StrTokenizer[a#]", strMatcher65);
        org.junit.Assert.assertNotNull(strTokenizer5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(charArray13);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray13), "4 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray13), "4 ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray13), "[4,  ]");
        org.junit.Assert.assertNotNull(charArray19);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray19), "4 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray19), "4 ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray19), "[4,  ]");
        org.junit.Assert.assertNotNull(strMatcher23);
        org.junit.Assert.assertNotNull(strTokenizer25);
        org.junit.Assert.assertNotNull(strMatcher26);
        org.junit.Assert.assertNotNull(strMatcher27);
        org.junit.Assert.assertNull(str32);
        org.junit.Assert.assertNotNull(strMatcher33);
        org.junit.Assert.assertNull(str40);
        org.junit.Assert.assertNotNull(strMatcher41);
        org.junit.Assert.assertNotNull(strTokenizer43);
        org.junit.Assert.assertNotNull(strList44);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertNotNull(strArray46);
        org.junit.Assert.assertNotNull(charArray49);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray49), "4 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray49), "4 ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray49), "[4,  ]");
        org.junit.Assert.assertNotNull(strTokenizer53);
        org.junit.Assert.assertNotNull(charArray58);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray58), "4 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray58), "4 ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray58), "[4,  ]");
        org.junit.Assert.assertNotNull(strMatcher62);
        org.junit.Assert.assertNotNull(strTokenizer64);
        org.junit.Assert.assertNotNull(strMatcher65);
        org.junit.Assert.assertNotNull(strTokenizer67);
        org.junit.Assert.assertNotNull(strTokenizer70);
        org.junit.Assert.assertNotNull(strTokenizer71);
    }

    @Test
    public void test1527() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1527");
        char[] charArray2 = new char[] { '4', ' ' };
        org.apache.commons.lang3.text.StrTokenizer strTokenizer5 = new org.apache.commons.lang3.text.StrTokenizer(charArray2, 'a', ' ');
        org.apache.commons.lang3.text.StrTokenizer strTokenizer8 = new org.apache.commons.lang3.text.StrTokenizer(charArray2, '4', 'a');
        char[] charArray11 = new char[] { '4', ' ' };
        org.apache.commons.lang3.text.StrTokenizer strTokenizer14 = new org.apache.commons.lang3.text.StrTokenizer(charArray11, 'a', ' ');
        org.apache.commons.lang3.text.StrMatcher strMatcher15 = strTokenizer14.getTrimmerMatcher();
        org.apache.commons.lang3.text.StrMatcher strMatcher16 = strTokenizer14.getQuoteMatcher();
        org.apache.commons.lang3.text.StrTokenizer strTokenizer17 = new org.apache.commons.lang3.text.StrTokenizer(charArray2, strMatcher16);
        char[] charArray20 = new char[] { '4', ' ' };
        org.apache.commons.lang3.text.StrTokenizer strTokenizer23 = new org.apache.commons.lang3.text.StrTokenizer(charArray20, 'a', ' ');
        org.apache.commons.lang3.text.StrMatcher strMatcher24 = strTokenizer23.getTrimmerMatcher();
        char[] charArray27 = new char[] { '4', ' ' };
        org.apache.commons.lang3.text.StrTokenizer strTokenizer30 = new org.apache.commons.lang3.text.StrTokenizer(charArray27, 'a', ' ');
        org.apache.commons.lang3.text.StrTokenizer strTokenizer31 = org.apache.commons.lang3.text.StrTokenizer.getCSVInstance(charArray27);
        org.apache.commons.lang3.text.StrMatcher strMatcher32 = null;
        org.apache.commons.lang3.text.StrTokenizer strTokenizer33 = new org.apache.commons.lang3.text.StrTokenizer(charArray27, strMatcher32);
        org.apache.commons.lang3.text.StrTokenizer strTokenizer34 = strTokenizer23.reset(charArray27);
        org.apache.commons.lang3.text.StrTokenizer strTokenizer35 = org.apache.commons.lang3.text.StrTokenizer.getCSVInstance(charArray27);
        char[] charArray38 = new char[] { '4', ' ' };
        org.apache.commons.lang3.text.StrTokenizer strTokenizer41 = new org.apache.commons.lang3.text.StrTokenizer(charArray38, 'a', ' ');
        org.apache.commons.lang3.text.StrMatcher strMatcher42 = strTokenizer41.getTrimmerMatcher();
        org.apache.commons.lang3.text.StrTokenizer strTokenizer44 = strTokenizer41.setDelimiterString("");
        char[] charArray48 = new char[] { '4', ' ' };
        org.apache.commons.lang3.text.StrTokenizer strTokenizer51 = new org.apache.commons.lang3.text.StrTokenizer(charArray48, 'a', ' ');
        org.apache.commons.lang3.text.StrMatcher strMatcher52 = strTokenizer51.getTrimmerMatcher();
        org.apache.commons.lang3.text.StrTokenizer strTokenizer54 = strTokenizer51.setDelimiterString("");
        org.apache.commons.lang3.text.StrMatcher strMatcher55 = strTokenizer54.getTrimmerMatcher();
        org.apache.commons.lang3.text.StrTokenizer strTokenizer56 = new org.apache.commons.lang3.text.StrTokenizer("", strMatcher55);
        char[] charArray59 = new char[] { '4', ' ' };
        org.apache.commons.lang3.text.StrTokenizer strTokenizer62 = new org.apache.commons.lang3.text.StrTokenizer(charArray59, 'a', ' ');
        org.apache.commons.lang3.text.StrMatcher strMatcher63 = strTokenizer62.getTrimmerMatcher();
        org.apache.commons.lang3.text.StrTokenizer strTokenizer65 = strTokenizer62.setDelimiterString("");
        org.apache.commons.lang3.text.StrMatcher strMatcher66 = strTokenizer65.getTrimmerMatcher();
        org.apache.commons.lang3.text.StrTokenizer strTokenizer67 = strTokenizer56.setTrimmerMatcher(strMatcher66);
        org.apache.commons.lang3.text.StrTokenizer strTokenizer68 = strTokenizer44.setTrimmerMatcher(strMatcher66);
        org.apache.commons.lang3.text.StrMatcher strMatcher69 = strTokenizer44.getDelimiterMatcher();
        char[] charArray72 = new char[] { '4', ' ' };
        org.apache.commons.lang3.text.StrTokenizer strTokenizer75 = new org.apache.commons.lang3.text.StrTokenizer(charArray72, 'a', ' ');
        org.apache.commons.lang3.text.StrMatcher strMatcher76 = strTokenizer75.getTrimmerMatcher();
        org.apache.commons.lang3.text.StrTokenizer strTokenizer78 = strTokenizer75.setDelimiterString("");
        org.apache.commons.lang3.text.StrMatcher strMatcher79 = strTokenizer78.getTrimmerMatcher();
        org.apache.commons.lang3.text.StrTokenizer strTokenizer80 = new org.apache.commons.lang3.text.StrTokenizer(charArray27, strMatcher69, strMatcher79);
        org.apache.commons.lang3.text.StrTokenizer strTokenizer81 = new org.apache.commons.lang3.text.StrTokenizer(charArray2, strMatcher79);
        org.apache.commons.lang3.text.StrTokenizer strTokenizer83 = new org.apache.commons.lang3.text.StrTokenizer(charArray2, 'a');
        org.apache.commons.lang3.text.StrTokenizer strTokenizer85 = new org.apache.commons.lang3.text.StrTokenizer(charArray2, "");
        org.junit.Assert.assertNotNull(charArray2);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray2), "4 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray2), "4 ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray2), "[4,  ]");
        org.junit.Assert.assertNotNull(charArray11);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray11), "4 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray11), "4 ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray11), "[4,  ]");
        org.junit.Assert.assertNotNull(strMatcher15);
        org.junit.Assert.assertNotNull(strMatcher16);
        org.junit.Assert.assertNotNull(charArray20);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray20), "4 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray20), "4 ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray20), "[4,  ]");
        org.junit.Assert.assertNotNull(strMatcher24);
        org.junit.Assert.assertNotNull(charArray27);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray27), "4 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray27), "4 ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray27), "[4,  ]");
        org.junit.Assert.assertNotNull(strTokenizer31);
        org.junit.Assert.assertNotNull(strTokenizer34);
        org.junit.Assert.assertNotNull(strTokenizer35);
        org.junit.Assert.assertNotNull(charArray38);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray38), "4 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray38), "4 ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray38), "[4,  ]");
        org.junit.Assert.assertNotNull(strMatcher42);
        org.junit.Assert.assertNotNull(strTokenizer44);
        org.junit.Assert.assertNotNull(charArray48);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray48), "4 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray48), "4 ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray48), "[4,  ]");
        org.junit.Assert.assertNotNull(strMatcher52);
        org.junit.Assert.assertNotNull(strTokenizer54);
        org.junit.Assert.assertNotNull(strMatcher55);
        org.junit.Assert.assertNotNull(charArray59);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray59), "4 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray59), "4 ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray59), "[4,  ]");
        org.junit.Assert.assertNotNull(strMatcher63);
        org.junit.Assert.assertNotNull(strTokenizer65);
        org.junit.Assert.assertNotNull(strMatcher66);
        org.junit.Assert.assertNotNull(strTokenizer67);
        org.junit.Assert.assertNotNull(strTokenizer68);
        org.junit.Assert.assertNotNull(strMatcher69);
        org.junit.Assert.assertNotNull(charArray72);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray72), "4 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray72), "4 ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray72), "[4,  ]");
        org.junit.Assert.assertNotNull(strMatcher76);
        org.junit.Assert.assertNotNull(strTokenizer78);
        org.junit.Assert.assertNotNull(strMatcher79);
    }

    @Test
    public void test1528() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1528");
        char[] charArray2 = new char[] { '4', ' ' };
        org.apache.commons.lang3.text.StrTokenizer strTokenizer5 = new org.apache.commons.lang3.text.StrTokenizer(charArray2, 'a', ' ');
        org.apache.commons.lang3.text.StrTokenizer strTokenizer6 = org.apache.commons.lang3.text.StrTokenizer.getCSVInstance(charArray2);
        org.apache.commons.lang3.text.StrTokenizer strTokenizer8 = new org.apache.commons.lang3.text.StrTokenizer(charArray2, '4');
        org.apache.commons.lang3.text.StrTokenizer strTokenizer9 = new org.apache.commons.lang3.text.StrTokenizer(charArray2);
        char[] charArray12 = new char[] { '4', ' ' };
        org.apache.commons.lang3.text.StrTokenizer strTokenizer15 = new org.apache.commons.lang3.text.StrTokenizer(charArray12, 'a', ' ');
        org.apache.commons.lang3.text.StrMatcher strMatcher16 = strTokenizer15.getTrimmerMatcher();
        org.apache.commons.lang3.text.StrTokenizer strTokenizer18 = strTokenizer15.setDelimiterString("");
        org.apache.commons.lang3.text.StrTokenizer strTokenizer20 = strTokenizer18.reset("");
        org.apache.commons.lang3.text.StrTokenizer strTokenizer21 = strTokenizer18.reset();
        org.apache.commons.lang3.text.StrTokenizer strTokenizer23 = strTokenizer18.setQuoteChar('4');
        char[] charArray25 = new char[] { '#' };
        org.apache.commons.lang3.text.StrTokenizer strTokenizer26 = new org.apache.commons.lang3.text.StrTokenizer(charArray25);
        org.apache.commons.lang3.text.StrTokenizer strTokenizer28 = new org.apache.commons.lang3.text.StrTokenizer(charArray25, ' ');
        char[] charArray29 = null;
        org.apache.commons.lang3.text.StrTokenizer strTokenizer31 = new org.apache.commons.lang3.text.StrTokenizer(charArray29, "");
        org.apache.commons.lang3.text.StrMatcher strMatcher32 = strTokenizer31.getQuoteMatcher();
        char[] charArray36 = new char[] { '4', ' ' };
        org.apache.commons.lang3.text.StrTokenizer strTokenizer39 = new org.apache.commons.lang3.text.StrTokenizer(charArray36, 'a', ' ');
        org.apache.commons.lang3.text.StrMatcher strMatcher40 = strTokenizer39.getTrimmerMatcher();
        org.apache.commons.lang3.text.StrTokenizer strTokenizer42 = strTokenizer39.setDelimiterString("");
        org.apache.commons.lang3.text.StrMatcher strMatcher43 = strTokenizer42.getTrimmerMatcher();
        org.apache.commons.lang3.text.StrTokenizer strTokenizer44 = new org.apache.commons.lang3.text.StrTokenizer("", strMatcher43);
        char[] charArray47 = new char[] { '4', ' ' };
        org.apache.commons.lang3.text.StrTokenizer strTokenizer50 = new org.apache.commons.lang3.text.StrTokenizer(charArray47, 'a', ' ');
        org.apache.commons.lang3.text.StrMatcher strMatcher51 = strTokenizer50.getTrimmerMatcher();
        org.apache.commons.lang3.text.StrMatcher strMatcher52 = strTokenizer50.getQuoteMatcher();
        org.apache.commons.lang3.text.StrTokenizer strTokenizer53 = strTokenizer44.setDelimiterMatcher(strMatcher52);
        org.apache.commons.lang3.text.StrTokenizer strTokenizer54 = new org.apache.commons.lang3.text.StrTokenizer(charArray25, strMatcher32, strMatcher52);
        org.apache.commons.lang3.text.StrTokenizer strTokenizer55 = strTokenizer18.setDelimiterMatcher(strMatcher32);
        char[] charArray58 = new char[] { '4', ' ' };
        org.apache.commons.lang3.text.StrTokenizer strTokenizer61 = new org.apache.commons.lang3.text.StrTokenizer(charArray58, 'a', ' ');
        org.apache.commons.lang3.text.StrMatcher strMatcher62 = strTokenizer61.getTrimmerMatcher();
        org.apache.commons.lang3.text.StrTokenizer strTokenizer64 = strTokenizer61.setDelimiterString("");
        org.apache.commons.lang3.text.StrMatcher strMatcher65 = strTokenizer64.getTrimmerMatcher();
        boolean boolean66 = strTokenizer64.hasNext();
        org.apache.commons.lang3.text.StrTokenizer strTokenizer67 = strTokenizer64.reset();
        org.apache.commons.lang3.text.StrTokenizer strTokenizer71 = new org.apache.commons.lang3.text.StrTokenizer("4 ", 'a');
        org.apache.commons.lang3.text.StrMatcher strMatcher72 = strTokenizer71.getDelimiterMatcher();
        org.apache.commons.lang3.text.StrTokenizer strTokenizer73 = new org.apache.commons.lang3.text.StrTokenizer("", strMatcher72);
        org.apache.commons.lang3.text.StrTokenizer strTokenizer74 = strTokenizer64.setTrimmerMatcher(strMatcher72);
        org.apache.commons.lang3.text.StrTokenizer strTokenizer75 = new org.apache.commons.lang3.text.StrTokenizer(charArray2, strMatcher32, strMatcher72);
        char[] charArray78 = new char[] { '4', ' ' };
        org.apache.commons.lang3.text.StrTokenizer strTokenizer81 = new org.apache.commons.lang3.text.StrTokenizer(charArray78, 'a', ' ');
        org.apache.commons.lang3.text.StrMatcher strMatcher82 = strTokenizer81.getTrimmerMatcher();
        char[] charArray85 = new char[] { '4', ' ' };
        org.apache.commons.lang3.text.StrTokenizer strTokenizer88 = new org.apache.commons.lang3.text.StrTokenizer(charArray85, 'a', ' ');
        org.apache.commons.lang3.text.StrTokenizer strTokenizer89 = org.apache.commons.lang3.text.StrTokenizer.getCSVInstance(charArray85);
        org.apache.commons.lang3.text.StrMatcher strMatcher90 = null;
        org.apache.commons.lang3.text.StrTokenizer strTokenizer91 = new org.apache.commons.lang3.text.StrTokenizer(charArray85, strMatcher90);
        org.apache.commons.lang3.text.StrTokenizer strTokenizer92 = strTokenizer81.reset(charArray85);
        java.lang.Object obj93 = strTokenizer81.clone();
        boolean boolean94 = strTokenizer81.hasNext();
        org.apache.commons.lang3.text.StrMatcher strMatcher95 = strTokenizer81.getTrimmerMatcher();
        org.apache.commons.lang3.text.StrTokenizer strTokenizer96 = new org.apache.commons.lang3.text.StrTokenizer(charArray2, strMatcher95);
        java.lang.String str97 = strTokenizer96.toString();
        org.apache.commons.lang3.text.StrMatcher strMatcher98 = strTokenizer96.getDelimiterMatcher();
        org.junit.Assert.assertNotNull(charArray2);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray2), "4 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray2), "4 ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray2), "[4,  ]");
        org.junit.Assert.assertNotNull(strTokenizer6);
        org.junit.Assert.assertNotNull(charArray12);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray12), "4 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray12), "4 ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray12), "[4,  ]");
        org.junit.Assert.assertNotNull(strMatcher16);
        org.junit.Assert.assertNotNull(strTokenizer18);
        org.junit.Assert.assertNotNull(strTokenizer20);
        org.junit.Assert.assertNotNull(strTokenizer21);
        org.junit.Assert.assertNotNull(strTokenizer23);
        org.junit.Assert.assertNotNull(charArray25);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray25), "#");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray25), "#");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray25), "[#]");
        org.junit.Assert.assertNotNull(strMatcher32);
        org.junit.Assert.assertNotNull(charArray36);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray36), "4 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray36), "4 ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray36), "[4,  ]");
        org.junit.Assert.assertNotNull(strMatcher40);
        org.junit.Assert.assertNotNull(strTokenizer42);
        org.junit.Assert.assertNotNull(strMatcher43);
        org.junit.Assert.assertNotNull(charArray47);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray47), "4 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray47), "4 ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray47), "[4,  ]");
        org.junit.Assert.assertNotNull(strMatcher51);
        org.junit.Assert.assertNotNull(strMatcher52);
        org.junit.Assert.assertNotNull(strTokenizer53);
        org.junit.Assert.assertNotNull(strTokenizer55);
        org.junit.Assert.assertNotNull(charArray58);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray58), "4 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray58), "4 ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray58), "[4,  ]");
        org.junit.Assert.assertNotNull(strMatcher62);
        org.junit.Assert.assertNotNull(strTokenizer64);
        org.junit.Assert.assertNotNull(strMatcher65);
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + true + "'", boolean66 == true);
        org.junit.Assert.assertNotNull(strTokenizer67);
        org.junit.Assert.assertNotNull(strMatcher72);
        org.junit.Assert.assertNotNull(strTokenizer74);
        org.junit.Assert.assertNotNull(charArray78);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray78), "4 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray78), "4 ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray78), "[4,  ]");
        org.junit.Assert.assertNotNull(strMatcher82);
        org.junit.Assert.assertNotNull(charArray85);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray85), "4 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray85), "4 ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray85), "[4,  ]");
        org.junit.Assert.assertNotNull(strTokenizer89);
        org.junit.Assert.assertNotNull(strTokenizer92);
        org.junit.Assert.assertNotNull(obj93);
        org.junit.Assert.assertEquals(obj93.toString(), "StrTokenizer[not tokenized yet]");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj93), "StrTokenizer[not tokenized yet]");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj93), "StrTokenizer[not tokenized yet]");
        org.junit.Assert.assertTrue("'" + boolean94 + "' != '" + true + "'", boolean94 == true);
        org.junit.Assert.assertNotNull(strMatcher95);
        org.junit.Assert.assertEquals("'" + str97 + "' != '" + "StrTokenizer[not tokenized yet]" + "'", str97, "StrTokenizer[not tokenized yet]");
        org.junit.Assert.assertNotNull(strMatcher98);
    }

    @Test
    public void test1529() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1529");
        char[] charArray2 = new char[] { '4', ' ' };
        org.apache.commons.lang3.text.StrTokenizer strTokenizer5 = new org.apache.commons.lang3.text.StrTokenizer(charArray2, 'a', ' ');
        org.apache.commons.lang3.text.StrMatcher strMatcher6 = strTokenizer5.getTrimmerMatcher();
        org.apache.commons.lang3.text.StrTokenizer strTokenizer8 = strTokenizer5.setDelimiterString("");
        char[] charArray12 = new char[] { '4', ' ' };
        org.apache.commons.lang3.text.StrTokenizer strTokenizer15 = new org.apache.commons.lang3.text.StrTokenizer(charArray12, 'a', ' ');
        org.apache.commons.lang3.text.StrMatcher strMatcher16 = strTokenizer15.getTrimmerMatcher();
        org.apache.commons.lang3.text.StrTokenizer strTokenizer18 = strTokenizer15.setDelimiterString("");
        org.apache.commons.lang3.text.StrMatcher strMatcher19 = strTokenizer18.getTrimmerMatcher();
        org.apache.commons.lang3.text.StrTokenizer strTokenizer20 = new org.apache.commons.lang3.text.StrTokenizer("", strMatcher19);
        char[] charArray23 = new char[] { '4', ' ' };
        org.apache.commons.lang3.text.StrTokenizer strTokenizer26 = new org.apache.commons.lang3.text.StrTokenizer(charArray23, 'a', ' ');
        org.apache.commons.lang3.text.StrMatcher strMatcher27 = strTokenizer26.getTrimmerMatcher();
        org.apache.commons.lang3.text.StrTokenizer strTokenizer29 = strTokenizer26.setDelimiterString("");
        org.apache.commons.lang3.text.StrMatcher strMatcher30 = strTokenizer29.getTrimmerMatcher();
        org.apache.commons.lang3.text.StrTokenizer strTokenizer31 = strTokenizer20.setTrimmerMatcher(strMatcher30);
        org.apache.commons.lang3.text.StrTokenizer strTokenizer32 = strTokenizer8.setTrimmerMatcher(strMatcher30);
        java.lang.String str33 = strTokenizer8.getContent();
        char[] charArray34 = null;
        org.apache.commons.lang3.text.StrTokenizer strTokenizer36 = new org.apache.commons.lang3.text.StrTokenizer(charArray34, "");
        java.lang.String str37 = strTokenizer36.getContent();
        org.apache.commons.lang3.text.StrMatcher strMatcher38 = strTokenizer36.getDelimiterMatcher();
        org.apache.commons.lang3.text.StrTokenizer strTokenizer39 = strTokenizer8.setDelimiterMatcher(strMatcher38);
        boolean boolean40 = strTokenizer8.isIgnoreEmptyTokens();
        org.apache.commons.lang3.text.StrTokenizer strTokenizer43 = new org.apache.commons.lang3.text.StrTokenizer("4 ", 'a');
        org.apache.commons.lang3.text.StrMatcher strMatcher44 = strTokenizer43.getDelimiterMatcher();
        org.apache.commons.lang3.text.StrTokenizer strTokenizer45 = strTokenizer8.setIgnoredMatcher(strMatcher44);
        java.lang.String[] strArray46 = strTokenizer45.getTokenArray();
        java.util.List<java.lang.String> strList47 = strTokenizer45.getTokenList();
        org.junit.Assert.assertNotNull(charArray2);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray2), "4 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray2), "4 ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray2), "[4,  ]");
        org.junit.Assert.assertNotNull(strMatcher6);
        org.junit.Assert.assertNotNull(strTokenizer8);
        org.junit.Assert.assertNotNull(charArray12);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray12), "4 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray12), "4 ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray12), "[4,  ]");
        org.junit.Assert.assertNotNull(strMatcher16);
        org.junit.Assert.assertNotNull(strTokenizer18);
        org.junit.Assert.assertNotNull(strMatcher19);
        org.junit.Assert.assertNotNull(charArray23);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray23), "4 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray23), "4 ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray23), "[4,  ]");
        org.junit.Assert.assertNotNull(strMatcher27);
        org.junit.Assert.assertNotNull(strTokenizer29);
        org.junit.Assert.assertNotNull(strMatcher30);
        org.junit.Assert.assertNotNull(strTokenizer31);
        org.junit.Assert.assertNotNull(strTokenizer32);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "4 " + "'", str33, "4 ");
        org.junit.Assert.assertNull(str37);
        org.junit.Assert.assertNotNull(strMatcher38);
        org.junit.Assert.assertNotNull(strTokenizer39);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + true + "'", boolean40 == true);
        org.junit.Assert.assertNotNull(strMatcher44);
        org.junit.Assert.assertNotNull(strTokenizer45);
        org.junit.Assert.assertNotNull(strArray46);
        org.junit.Assert.assertNotNull(strList47);
    }

    @Test
    public void test1530() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1530");
        char[] charArray2 = new char[] { '4', ' ' };
        org.apache.commons.lang3.text.StrTokenizer strTokenizer5 = new org.apache.commons.lang3.text.StrTokenizer(charArray2, 'a', ' ');
        org.apache.commons.lang3.text.StrTokenizer strTokenizer6 = org.apache.commons.lang3.text.StrTokenizer.getCSVInstance(charArray2);
        org.apache.commons.lang3.text.StrMatcher strMatcher7 = null;
        org.apache.commons.lang3.text.StrTokenizer strTokenizer8 = new org.apache.commons.lang3.text.StrTokenizer(charArray2, strMatcher7);
        char[] charArray9 = null;
        org.apache.commons.lang3.text.StrTokenizer strTokenizer11 = new org.apache.commons.lang3.text.StrTokenizer(charArray9, "");
        org.apache.commons.lang3.text.StrMatcher strMatcher12 = strTokenizer11.getQuoteMatcher();
        char[] charArray16 = new char[] { '4', ' ' };
        org.apache.commons.lang3.text.StrTokenizer strTokenizer19 = new org.apache.commons.lang3.text.StrTokenizer(charArray16, 'a', ' ');
        org.apache.commons.lang3.text.StrMatcher strMatcher20 = strTokenizer19.getTrimmerMatcher();
        org.apache.commons.lang3.text.StrTokenizer strTokenizer22 = strTokenizer19.setDelimiterString("");
        org.apache.commons.lang3.text.StrMatcher strMatcher23 = strTokenizer22.getTrimmerMatcher();
        org.apache.commons.lang3.text.StrTokenizer strTokenizer24 = new org.apache.commons.lang3.text.StrTokenizer("", strMatcher23);
        char[] charArray27 = new char[] { '4', ' ' };
        org.apache.commons.lang3.text.StrTokenizer strTokenizer30 = new org.apache.commons.lang3.text.StrTokenizer(charArray27, 'a', ' ');
        org.apache.commons.lang3.text.StrMatcher strMatcher31 = strTokenizer30.getTrimmerMatcher();
        org.apache.commons.lang3.text.StrMatcher strMatcher32 = strTokenizer30.getQuoteMatcher();
        org.apache.commons.lang3.text.StrTokenizer strTokenizer33 = strTokenizer24.setDelimiterMatcher(strMatcher32);
        org.apache.commons.lang3.text.StrTokenizer strTokenizer34 = new org.apache.commons.lang3.text.StrTokenizer(charArray2, strMatcher12, strMatcher32);
        org.apache.commons.lang3.text.StrTokenizer strTokenizer35 = new org.apache.commons.lang3.text.StrTokenizer(charArray2);
        org.apache.commons.lang3.text.StrTokenizer strTokenizer37 = new org.apache.commons.lang3.text.StrTokenizer(charArray2, '4');
        char[] charArray39 = null;
        org.apache.commons.lang3.text.StrTokenizer strTokenizer41 = new org.apache.commons.lang3.text.StrTokenizer(charArray39, "");
        java.lang.String str42 = strTokenizer41.getContent();
        org.apache.commons.lang3.text.StrMatcher strMatcher43 = strTokenizer41.getDelimiterMatcher();
        org.apache.commons.lang3.text.StrTokenizer strTokenizer45 = org.apache.commons.lang3.text.StrTokenizer.getCSVInstance("");
        java.util.List<java.lang.String> strList46 = strTokenizer45.getTokenList();
        boolean boolean47 = strTokenizer45.hasPrevious();
        java.lang.String[] strArray48 = strTokenizer45.getTokenArray();
        char[] charArray51 = new char[] { '4', ' ' };
        org.apache.commons.lang3.text.StrTokenizer strTokenizer54 = new org.apache.commons.lang3.text.StrTokenizer(charArray51, 'a', ' ');
        org.apache.commons.lang3.text.StrTokenizer strTokenizer55 = org.apache.commons.lang3.text.StrTokenizer.getCSVInstance(charArray51);
        org.apache.commons.lang3.text.StrMatcher strMatcher56 = null;
        org.apache.commons.lang3.text.StrTokenizer strTokenizer57 = new org.apache.commons.lang3.text.StrTokenizer(charArray51, strMatcher56);
        char[] charArray60 = new char[] { '4', ' ' };
        org.apache.commons.lang3.text.StrTokenizer strTokenizer63 = new org.apache.commons.lang3.text.StrTokenizer(charArray60, 'a', ' ');
        org.apache.commons.lang3.text.StrMatcher strMatcher64 = strTokenizer63.getTrimmerMatcher();
        org.apache.commons.lang3.text.StrTokenizer strTokenizer66 = strTokenizer63.setDelimiterString("");
        org.apache.commons.lang3.text.StrMatcher strMatcher67 = strTokenizer66.getTrimmerMatcher();
        org.apache.commons.lang3.text.StrTokenizer strTokenizer68 = new org.apache.commons.lang3.text.StrTokenizer(charArray51, strMatcher67);
        org.apache.commons.lang3.text.StrTokenizer strTokenizer69 = strTokenizer45.setTrimmerMatcher(strMatcher67);
        org.apache.commons.lang3.text.StrTokenizer strTokenizer70 = new org.apache.commons.lang3.text.StrTokenizer("StrTokenizer[]", strMatcher43, strMatcher67);
        char[] charArray73 = new char[] { '4', ' ' };
        org.apache.commons.lang3.text.StrTokenizer strTokenizer76 = new org.apache.commons.lang3.text.StrTokenizer(charArray73, 'a', ' ');
        org.apache.commons.lang3.text.StrMatcher strMatcher77 = strTokenizer76.getTrimmerMatcher();
        org.apache.commons.lang3.text.StrTokenizer strTokenizer79 = strTokenizer76.setDelimiterString("");
        org.apache.commons.lang3.text.StrMatcher strMatcher80 = strTokenizer79.getTrimmerMatcher();
        org.apache.commons.lang3.text.StrMatcher strMatcher81 = strTokenizer79.getTrimmerMatcher();
        org.apache.commons.lang3.text.StrTokenizer strTokenizer82 = new org.apache.commons.lang3.text.StrTokenizer(charArray2, strMatcher43, strMatcher81);
        java.lang.String str83 = strTokenizer82.next();
        org.junit.Assert.assertNotNull(charArray2);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray2), "4 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray2), "4 ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray2), "[4,  ]");
        org.junit.Assert.assertNotNull(strTokenizer6);
        org.junit.Assert.assertNotNull(strMatcher12);
        org.junit.Assert.assertNotNull(charArray16);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray16), "4 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray16), "4 ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray16), "[4,  ]");
        org.junit.Assert.assertNotNull(strMatcher20);
        org.junit.Assert.assertNotNull(strTokenizer22);
        org.junit.Assert.assertNotNull(strMatcher23);
        org.junit.Assert.assertNotNull(charArray27);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray27), "4 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray27), "4 ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray27), "[4,  ]");
        org.junit.Assert.assertNotNull(strMatcher31);
        org.junit.Assert.assertNotNull(strMatcher32);
        org.junit.Assert.assertNotNull(strTokenizer33);
        org.junit.Assert.assertNull(str42);
        org.junit.Assert.assertNotNull(strMatcher43);
        org.junit.Assert.assertNotNull(strTokenizer45);
        org.junit.Assert.assertNotNull(strList46);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertNotNull(strArray48);
        org.junit.Assert.assertNotNull(charArray51);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray51), "4 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray51), "4 ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray51), "[4,  ]");
        org.junit.Assert.assertNotNull(strTokenizer55);
        org.junit.Assert.assertNotNull(charArray60);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray60), "4 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray60), "4 ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray60), "[4,  ]");
        org.junit.Assert.assertNotNull(strMatcher64);
        org.junit.Assert.assertNotNull(strTokenizer66);
        org.junit.Assert.assertNotNull(strMatcher67);
        org.junit.Assert.assertNotNull(strTokenizer69);
        org.junit.Assert.assertNotNull(charArray73);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray73), "4 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray73), "4 ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray73), "[4,  ]");
        org.junit.Assert.assertNotNull(strMatcher77);
        org.junit.Assert.assertNotNull(strTokenizer79);
        org.junit.Assert.assertNotNull(strMatcher80);
        org.junit.Assert.assertNotNull(strMatcher81);
        org.junit.Assert.assertEquals("'" + str83 + "' != '" + "4 " + "'", str83, "4 ");
    }

    @Test
    public void test1531() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1531");
        org.apache.commons.lang3.text.StrTokenizer strTokenizer3 = new org.apache.commons.lang3.text.StrTokenizer("StrTokenizer[ ]", 'a', 'a');
        org.apache.commons.lang3.text.StrMatcher strMatcher4 = strTokenizer3.getTrimmerMatcher();
        org.junit.Assert.assertNotNull(strMatcher4);
    }

    @Test
    public void test1532() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1532");
        org.apache.commons.lang3.text.StrTokenizer strTokenizer2 = new org.apache.commons.lang3.text.StrTokenizer("StrTokenizer[StrTokenizer[4 ]]", 'a');
        boolean boolean3 = strTokenizer2.hasNext();
        // The following exception was thrown during execution in test generation
        try {
            strTokenizer2.set("#");
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: set() is unsupported");
        } catch (java.lang.UnsupportedOperationException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
    }

    @Test
    public void test1533() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1533");
        char[] charArray2 = new char[] { '4', ' ' };
        org.apache.commons.lang3.text.StrTokenizer strTokenizer5 = new org.apache.commons.lang3.text.StrTokenizer(charArray2, 'a', ' ');
        org.apache.commons.lang3.text.StrMatcher strMatcher6 = strTokenizer5.getTrimmerMatcher();
        char[] charArray9 = new char[] { '4', ' ' };
        org.apache.commons.lang3.text.StrTokenizer strTokenizer12 = new org.apache.commons.lang3.text.StrTokenizer(charArray9, 'a', ' ');
        org.apache.commons.lang3.text.StrTokenizer strTokenizer13 = org.apache.commons.lang3.text.StrTokenizer.getCSVInstance(charArray9);
        org.apache.commons.lang3.text.StrMatcher strMatcher14 = null;
        org.apache.commons.lang3.text.StrTokenizer strTokenizer15 = new org.apache.commons.lang3.text.StrTokenizer(charArray9, strMatcher14);
        org.apache.commons.lang3.text.StrTokenizer strTokenizer16 = strTokenizer5.reset(charArray9);
        org.apache.commons.lang3.text.StrTokenizer strTokenizer17 = org.apache.commons.lang3.text.StrTokenizer.getCSVInstance(charArray9);
        org.apache.commons.lang3.text.StrTokenizer strTokenizer19 = new org.apache.commons.lang3.text.StrTokenizer(charArray9, "4");
        org.apache.commons.lang3.text.StrTokenizer strTokenizer21 = strTokenizer19.setIgnoredChar('4');
        org.junit.Assert.assertNotNull(charArray2);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray2), "4 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray2), "4 ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray2), "[4,  ]");
        org.junit.Assert.assertNotNull(strMatcher6);
        org.junit.Assert.assertNotNull(charArray9);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray9), "4 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray9), "4 ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray9), "[4,  ]");
        org.junit.Assert.assertNotNull(strTokenizer13);
        org.junit.Assert.assertNotNull(strTokenizer16);
        org.junit.Assert.assertNotNull(strTokenizer17);
        org.junit.Assert.assertNotNull(strTokenizer21);
    }

    @Test
    public void test1534() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1534");
        char[] charArray2 = new char[] { '4', ' ' };
        org.apache.commons.lang3.text.StrTokenizer strTokenizer5 = new org.apache.commons.lang3.text.StrTokenizer(charArray2, 'a', ' ');
        org.apache.commons.lang3.text.StrTokenizer strTokenizer7 = new org.apache.commons.lang3.text.StrTokenizer(charArray2, "hi!");
        org.apache.commons.lang3.text.StrTokenizer strTokenizer9 = new org.apache.commons.lang3.text.StrTokenizer(charArray2, '#');
        org.apache.commons.lang3.text.StrTokenizer strTokenizer10 = org.apache.commons.lang3.text.StrTokenizer.getCSVInstance(charArray2);
        org.apache.commons.lang3.text.StrTokenizer strTokenizer12 = new org.apache.commons.lang3.text.StrTokenizer(charArray2, '#');
        char[] charArray17 = new char[] { '4', ' ' };
        org.apache.commons.lang3.text.StrTokenizer strTokenizer20 = new org.apache.commons.lang3.text.StrTokenizer(charArray17, 'a', ' ');
        org.apache.commons.lang3.text.StrMatcher strMatcher21 = strTokenizer20.getTrimmerMatcher();
        org.apache.commons.lang3.text.StrMatcher strMatcher22 = strTokenizer20.getQuoteMatcher();
        char[] charArray25 = new char[] { '4', ' ' };
        org.apache.commons.lang3.text.StrTokenizer strTokenizer28 = new org.apache.commons.lang3.text.StrTokenizer(charArray25, 'a', ' ');
        org.apache.commons.lang3.text.StrMatcher strMatcher29 = strTokenizer28.getTrimmerMatcher();
        org.apache.commons.lang3.text.StrTokenizer strTokenizer30 = new org.apache.commons.lang3.text.StrTokenizer("StrTokenizer[4 ]", strMatcher22, strMatcher29);
        org.apache.commons.lang3.text.StrTokenizer strTokenizer31 = new org.apache.commons.lang3.text.StrTokenizer(" ", strMatcher22);
        org.apache.commons.lang3.text.StrTokenizer strTokenizer32 = new org.apache.commons.lang3.text.StrTokenizer(charArray2, strMatcher22);
        char[] charArray35 = new char[] { '4', ' ' };
        org.apache.commons.lang3.text.StrTokenizer strTokenizer38 = new org.apache.commons.lang3.text.StrTokenizer(charArray35, 'a', ' ');
        org.apache.commons.lang3.text.StrMatcher strMatcher39 = strTokenizer38.getTrimmerMatcher();
        org.apache.commons.lang3.text.StrTokenizer strTokenizer41 = strTokenizer38.setDelimiterString("");
        char[] charArray45 = new char[] { '4', ' ' };
        org.apache.commons.lang3.text.StrTokenizer strTokenizer48 = new org.apache.commons.lang3.text.StrTokenizer(charArray45, 'a', ' ');
        org.apache.commons.lang3.text.StrMatcher strMatcher49 = strTokenizer48.getTrimmerMatcher();
        org.apache.commons.lang3.text.StrTokenizer strTokenizer51 = strTokenizer48.setDelimiterString("");
        org.apache.commons.lang3.text.StrMatcher strMatcher52 = strTokenizer51.getTrimmerMatcher();
        org.apache.commons.lang3.text.StrTokenizer strTokenizer53 = new org.apache.commons.lang3.text.StrTokenizer("", strMatcher52);
        char[] charArray56 = new char[] { '4', ' ' };
        org.apache.commons.lang3.text.StrTokenizer strTokenizer59 = new org.apache.commons.lang3.text.StrTokenizer(charArray56, 'a', ' ');
        org.apache.commons.lang3.text.StrMatcher strMatcher60 = strTokenizer59.getTrimmerMatcher();
        org.apache.commons.lang3.text.StrTokenizer strTokenizer62 = strTokenizer59.setDelimiterString("");
        org.apache.commons.lang3.text.StrMatcher strMatcher63 = strTokenizer62.getTrimmerMatcher();
        org.apache.commons.lang3.text.StrTokenizer strTokenizer64 = strTokenizer53.setTrimmerMatcher(strMatcher63);
        org.apache.commons.lang3.text.StrTokenizer strTokenizer65 = strTokenizer41.setTrimmerMatcher(strMatcher63);
        java.lang.String str66 = strTokenizer41.getContent();
        char[] charArray69 = new char[] { '4', ' ' };
        org.apache.commons.lang3.text.StrTokenizer strTokenizer72 = new org.apache.commons.lang3.text.StrTokenizer(charArray69, 'a', ' ');
        org.apache.commons.lang3.text.StrTokenizer strTokenizer75 = new org.apache.commons.lang3.text.StrTokenizer(charArray69, '4', 'a');
        char[] charArray78 = new char[] { '4', ' ' };
        org.apache.commons.lang3.text.StrTokenizer strTokenizer81 = new org.apache.commons.lang3.text.StrTokenizer(charArray78, 'a', ' ');
        org.apache.commons.lang3.text.StrMatcher strMatcher82 = strTokenizer81.getTrimmerMatcher();
        org.apache.commons.lang3.text.StrMatcher strMatcher83 = strTokenizer81.getQuoteMatcher();
        org.apache.commons.lang3.text.StrTokenizer strTokenizer84 = new org.apache.commons.lang3.text.StrTokenizer(charArray69, strMatcher83);
        org.apache.commons.lang3.text.StrTokenizer strTokenizer85 = strTokenizer41.reset(charArray69);
        java.util.List<java.lang.String> strList86 = strTokenizer85.getTokenList();
        org.apache.commons.lang3.text.StrMatcher strMatcher87 = strTokenizer85.getIgnoredMatcher();
        org.apache.commons.lang3.text.StrTokenizer strTokenizer88 = new org.apache.commons.lang3.text.StrTokenizer(charArray2, strMatcher87);
        org.junit.Assert.assertNotNull(charArray2);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray2), "4 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray2), "4 ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray2), "[4,  ]");
        org.junit.Assert.assertNotNull(strTokenizer10);
        org.junit.Assert.assertNotNull(charArray17);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray17), "4 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray17), "4 ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray17), "[4,  ]");
        org.junit.Assert.assertNotNull(strMatcher21);
        org.junit.Assert.assertNotNull(strMatcher22);
        org.junit.Assert.assertNotNull(charArray25);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray25), "4 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray25), "4 ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray25), "[4,  ]");
        org.junit.Assert.assertNotNull(strMatcher29);
        org.junit.Assert.assertNotNull(charArray35);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray35), "4 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray35), "4 ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray35), "[4,  ]");
        org.junit.Assert.assertNotNull(strMatcher39);
        org.junit.Assert.assertNotNull(strTokenizer41);
        org.junit.Assert.assertNotNull(charArray45);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray45), "4 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray45), "4 ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray45), "[4,  ]");
        org.junit.Assert.assertNotNull(strMatcher49);
        org.junit.Assert.assertNotNull(strTokenizer51);
        org.junit.Assert.assertNotNull(strMatcher52);
        org.junit.Assert.assertNotNull(charArray56);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray56), "4 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray56), "4 ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray56), "[4,  ]");
        org.junit.Assert.assertNotNull(strMatcher60);
        org.junit.Assert.assertNotNull(strTokenizer62);
        org.junit.Assert.assertNotNull(strMatcher63);
        org.junit.Assert.assertNotNull(strTokenizer64);
        org.junit.Assert.assertNotNull(strTokenizer65);
        org.junit.Assert.assertEquals("'" + str66 + "' != '" + "4 " + "'", str66, "4 ");
        org.junit.Assert.assertNotNull(charArray69);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray69), "4 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray69), "4 ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray69), "[4,  ]");
        org.junit.Assert.assertNotNull(charArray78);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray78), "4 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray78), "4 ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray78), "[4,  ]");
        org.junit.Assert.assertNotNull(strMatcher82);
        org.junit.Assert.assertNotNull(strMatcher83);
        org.junit.Assert.assertNotNull(strTokenizer85);
        org.junit.Assert.assertNotNull(strList86);
        org.junit.Assert.assertNotNull(strMatcher87);
    }

    @Test
    public void test1535() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1535");
        org.apache.commons.lang3.text.StrTokenizer strTokenizer2 = new org.apache.commons.lang3.text.StrTokenizer(" ", ' ');
    }

    @Test
    public void test1536() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1536");
        org.apache.commons.lang3.text.StrTokenizer strTokenizer2 = new org.apache.commons.lang3.text.StrTokenizer("4 ", 'a');
        org.apache.commons.lang3.text.StrMatcher strMatcher3 = strTokenizer2.getDelimiterMatcher();
        org.apache.commons.lang3.text.StrTokenizer strTokenizer5 = strTokenizer2.setDelimiterString("4");
        org.apache.commons.lang3.text.StrMatcher strMatcher6 = strTokenizer2.getIgnoredMatcher();
        org.apache.commons.lang3.text.StrTokenizer strTokenizer8 = strTokenizer2.setIgnoreEmptyTokens(true);
        boolean boolean9 = strTokenizer2.hasPrevious();
        org.junit.Assert.assertNotNull(strMatcher3);
        org.junit.Assert.assertNotNull(strTokenizer5);
        org.junit.Assert.assertNotNull(strMatcher6);
        org.junit.Assert.assertNotNull(strTokenizer8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test1537() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1537");
        char[] charArray2 = new char[] { '4', ' ' };
        org.apache.commons.lang3.text.StrTokenizer strTokenizer5 = new org.apache.commons.lang3.text.StrTokenizer(charArray2, 'a', ' ');
        org.apache.commons.lang3.text.StrTokenizer strTokenizer7 = new org.apache.commons.lang3.text.StrTokenizer(charArray2, "hi!");
        org.apache.commons.lang3.text.StrTokenizer strTokenizer9 = new org.apache.commons.lang3.text.StrTokenizer(charArray2, '#');
        org.apache.commons.lang3.text.StrTokenizer strTokenizer10 = new org.apache.commons.lang3.text.StrTokenizer(charArray2);
        org.apache.commons.lang3.text.StrTokenizer strTokenizer11 = org.apache.commons.lang3.text.StrTokenizer.getTSVInstance(charArray2);
        java.lang.String str12 = strTokenizer11.previousToken();
        org.junit.Assert.assertNotNull(charArray2);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray2), "4 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray2), "4 ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray2), "[4,  ]");
        org.junit.Assert.assertNotNull(strTokenizer11);
        org.junit.Assert.assertNull(str12);
    }

    @Test
    public void test1538() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1538");
        char[] charArray2 = new char[] { '4', ' ' };
        org.apache.commons.lang3.text.StrTokenizer strTokenizer5 = new org.apache.commons.lang3.text.StrTokenizer(charArray2, 'a', ' ');
        org.apache.commons.lang3.text.StrMatcher strMatcher6 = strTokenizer5.getTrimmerMatcher();
        org.apache.commons.lang3.text.StrTokenizer strTokenizer8 = strTokenizer5.setDelimiterString("");
        char[] charArray12 = new char[] { '4', ' ' };
        org.apache.commons.lang3.text.StrTokenizer strTokenizer15 = new org.apache.commons.lang3.text.StrTokenizer(charArray12, 'a', ' ');
        org.apache.commons.lang3.text.StrMatcher strMatcher16 = strTokenizer15.getTrimmerMatcher();
        org.apache.commons.lang3.text.StrTokenizer strTokenizer18 = strTokenizer15.setDelimiterString("");
        org.apache.commons.lang3.text.StrMatcher strMatcher19 = strTokenizer18.getTrimmerMatcher();
        org.apache.commons.lang3.text.StrTokenizer strTokenizer20 = new org.apache.commons.lang3.text.StrTokenizer("", strMatcher19);
        char[] charArray23 = new char[] { '4', ' ' };
        org.apache.commons.lang3.text.StrTokenizer strTokenizer26 = new org.apache.commons.lang3.text.StrTokenizer(charArray23, 'a', ' ');
        org.apache.commons.lang3.text.StrMatcher strMatcher27 = strTokenizer26.getTrimmerMatcher();
        org.apache.commons.lang3.text.StrTokenizer strTokenizer29 = strTokenizer26.setDelimiterString("");
        org.apache.commons.lang3.text.StrMatcher strMatcher30 = strTokenizer29.getTrimmerMatcher();
        org.apache.commons.lang3.text.StrTokenizer strTokenizer31 = strTokenizer20.setTrimmerMatcher(strMatcher30);
        org.apache.commons.lang3.text.StrTokenizer strTokenizer32 = strTokenizer8.setTrimmerMatcher(strMatcher30);
        java.lang.String str33 = strTokenizer8.getContent();
        char[] charArray36 = new char[] { '4', ' ' };
        org.apache.commons.lang3.text.StrTokenizer strTokenizer39 = new org.apache.commons.lang3.text.StrTokenizer(charArray36, 'a', ' ');
        org.apache.commons.lang3.text.StrTokenizer strTokenizer42 = new org.apache.commons.lang3.text.StrTokenizer(charArray36, '4', 'a');
        char[] charArray45 = new char[] { '4', ' ' };
        org.apache.commons.lang3.text.StrTokenizer strTokenizer48 = new org.apache.commons.lang3.text.StrTokenizer(charArray45, 'a', ' ');
        org.apache.commons.lang3.text.StrMatcher strMatcher49 = strTokenizer48.getTrimmerMatcher();
        org.apache.commons.lang3.text.StrMatcher strMatcher50 = strTokenizer48.getQuoteMatcher();
        org.apache.commons.lang3.text.StrTokenizer strTokenizer51 = new org.apache.commons.lang3.text.StrTokenizer(charArray36, strMatcher50);
        org.apache.commons.lang3.text.StrTokenizer strTokenizer52 = strTokenizer8.reset(charArray36);
        org.apache.commons.lang3.text.StrMatcher strMatcher53 = strTokenizer52.getQuoteMatcher();
        char[] charArray56 = new char[] { '4', ' ' };
        org.apache.commons.lang3.text.StrTokenizer strTokenizer59 = new org.apache.commons.lang3.text.StrTokenizer(charArray56, 'a', ' ');
        org.apache.commons.lang3.text.StrTokenizer strTokenizer60 = org.apache.commons.lang3.text.StrTokenizer.getCSVInstance(charArray56);
        org.apache.commons.lang3.text.StrTokenizer strTokenizer61 = org.apache.commons.lang3.text.StrTokenizer.getCSVInstance(charArray56);
        org.apache.commons.lang3.text.StrTokenizer strTokenizer62 = new org.apache.commons.lang3.text.StrTokenizer(charArray56);
        org.apache.commons.lang3.text.StrTokenizer strTokenizer63 = strTokenizer52.reset(charArray56);
        int int64 = strTokenizer63.previousIndex();
        org.junit.Assert.assertNotNull(charArray2);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray2), "4 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray2), "4 ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray2), "[4,  ]");
        org.junit.Assert.assertNotNull(strMatcher6);
        org.junit.Assert.assertNotNull(strTokenizer8);
        org.junit.Assert.assertNotNull(charArray12);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray12), "4 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray12), "4 ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray12), "[4,  ]");
        org.junit.Assert.assertNotNull(strMatcher16);
        org.junit.Assert.assertNotNull(strTokenizer18);
        org.junit.Assert.assertNotNull(strMatcher19);
        org.junit.Assert.assertNotNull(charArray23);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray23), "4 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray23), "4 ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray23), "[4,  ]");
        org.junit.Assert.assertNotNull(strMatcher27);
        org.junit.Assert.assertNotNull(strTokenizer29);
        org.junit.Assert.assertNotNull(strMatcher30);
        org.junit.Assert.assertNotNull(strTokenizer31);
        org.junit.Assert.assertNotNull(strTokenizer32);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "4 " + "'", str33, "4 ");
        org.junit.Assert.assertNotNull(charArray36);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray36), "4 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray36), "4 ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray36), "[4,  ]");
        org.junit.Assert.assertNotNull(charArray45);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray45), "4 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray45), "4 ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray45), "[4,  ]");
        org.junit.Assert.assertNotNull(strMatcher49);
        org.junit.Assert.assertNotNull(strMatcher50);
        org.junit.Assert.assertNotNull(strTokenizer52);
        org.junit.Assert.assertNotNull(strMatcher53);
        org.junit.Assert.assertNotNull(charArray56);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray56), "4 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray56), "4 ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray56), "[4,  ]");
        org.junit.Assert.assertNotNull(strTokenizer60);
        org.junit.Assert.assertNotNull(strTokenizer61);
        org.junit.Assert.assertNotNull(strTokenizer63);
        org.junit.Assert.assertTrue("'" + int64 + "' != '" + (-1) + "'", int64 == (-1));
    }

    @Test
    public void test1539() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1539");
        char[] charArray2 = new char[] { '4', ' ' };
        org.apache.commons.lang3.text.StrTokenizer strTokenizer5 = new org.apache.commons.lang3.text.StrTokenizer(charArray2, 'a', ' ');
        org.apache.commons.lang3.text.StrTokenizer strTokenizer6 = org.apache.commons.lang3.text.StrTokenizer.getCSVInstance(charArray2);
        org.apache.commons.lang3.text.StrTokenizer strTokenizer7 = org.apache.commons.lang3.text.StrTokenizer.getCSVInstance(charArray2);
        org.apache.commons.lang3.text.StrTokenizer strTokenizer9 = new org.apache.commons.lang3.text.StrTokenizer(charArray2, 'a');
        char[] charArray13 = new char[] { '4', ' ' };
        org.apache.commons.lang3.text.StrTokenizer strTokenizer16 = new org.apache.commons.lang3.text.StrTokenizer(charArray13, 'a', ' ');
        org.apache.commons.lang3.text.StrMatcher strMatcher17 = strTokenizer16.getTrimmerMatcher();
        char[] charArray20 = new char[] { '4', ' ' };
        org.apache.commons.lang3.text.StrTokenizer strTokenizer23 = new org.apache.commons.lang3.text.StrTokenizer(charArray20, 'a', ' ');
        org.apache.commons.lang3.text.StrTokenizer strTokenizer24 = org.apache.commons.lang3.text.StrTokenizer.getCSVInstance(charArray20);
        org.apache.commons.lang3.text.StrMatcher strMatcher25 = null;
        org.apache.commons.lang3.text.StrTokenizer strTokenizer26 = new org.apache.commons.lang3.text.StrTokenizer(charArray20, strMatcher25);
        org.apache.commons.lang3.text.StrTokenizer strTokenizer27 = strTokenizer16.reset(charArray20);
        org.apache.commons.lang3.text.StrMatcher strMatcher28 = strTokenizer27.getIgnoredMatcher();
        org.apache.commons.lang3.text.StrTokenizer strTokenizer29 = new org.apache.commons.lang3.text.StrTokenizer("", strMatcher28);
        char[] charArray32 = new char[] { '4', ' ' };
        org.apache.commons.lang3.text.StrTokenizer strTokenizer35 = new org.apache.commons.lang3.text.StrTokenizer(charArray32, 'a', ' ');
        org.apache.commons.lang3.text.StrTokenizer strTokenizer36 = org.apache.commons.lang3.text.StrTokenizer.getTSVInstance(charArray32);
        org.apache.commons.lang3.text.StrTokenizer strTokenizer39 = new org.apache.commons.lang3.text.StrTokenizer(charArray32, '#', 'a');
        org.apache.commons.lang3.text.StrMatcher strMatcher40 = null;
        char[] charArray44 = new char[] { '4', ' ' };
        org.apache.commons.lang3.text.StrTokenizer strTokenizer47 = new org.apache.commons.lang3.text.StrTokenizer(charArray44, 'a', ' ');
        org.apache.commons.lang3.text.StrMatcher strMatcher48 = strTokenizer47.getTrimmerMatcher();
        org.apache.commons.lang3.text.StrTokenizer strTokenizer50 = strTokenizer47.setDelimiterString("");
        org.apache.commons.lang3.text.StrMatcher strMatcher51 = strTokenizer50.getTrimmerMatcher();
        org.apache.commons.lang3.text.StrTokenizer strTokenizer52 = new org.apache.commons.lang3.text.StrTokenizer("", strMatcher51);
        org.apache.commons.lang3.text.StrTokenizer strTokenizer53 = new org.apache.commons.lang3.text.StrTokenizer(charArray32, strMatcher40, strMatcher51);
        org.apache.commons.lang3.text.StrTokenizer strTokenizer54 = strTokenizer29.setTrimmerMatcher(strMatcher51);
        char[] charArray56 = new char[] { '#' };
        org.apache.commons.lang3.text.StrTokenizer strTokenizer57 = new org.apache.commons.lang3.text.StrTokenizer(charArray56);
        boolean boolean58 = strTokenizer57.hasPrevious();
        org.apache.commons.lang3.text.StrTokenizer strTokenizer60 = strTokenizer57.setIgnoreEmptyTokens(true);
        org.apache.commons.lang3.text.StrMatcher strMatcher61 = strTokenizer60.getQuoteMatcher();
        org.apache.commons.lang3.text.StrTokenizer strTokenizer62 = new org.apache.commons.lang3.text.StrTokenizer(charArray2, strMatcher51, strMatcher61);
        org.apache.commons.lang3.text.StrTokenizer strTokenizer63 = org.apache.commons.lang3.text.StrTokenizer.getTSVInstance(charArray2);
        org.junit.Assert.assertNotNull(charArray2);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray2), "4 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray2), "4 ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray2), "[4,  ]");
        org.junit.Assert.assertNotNull(strTokenizer6);
        org.junit.Assert.assertNotNull(strTokenizer7);
        org.junit.Assert.assertNotNull(charArray13);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray13), "4 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray13), "4 ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray13), "[4,  ]");
        org.junit.Assert.assertNotNull(strMatcher17);
        org.junit.Assert.assertNotNull(charArray20);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray20), "4 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray20), "4 ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray20), "[4,  ]");
        org.junit.Assert.assertNotNull(strTokenizer24);
        org.junit.Assert.assertNotNull(strTokenizer27);
        org.junit.Assert.assertNotNull(strMatcher28);
        org.junit.Assert.assertNotNull(charArray32);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray32), "4 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray32), "4 ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray32), "[4,  ]");
        org.junit.Assert.assertNotNull(strTokenizer36);
        org.junit.Assert.assertNotNull(charArray44);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray44), "4 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray44), "4 ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray44), "[4,  ]");
        org.junit.Assert.assertNotNull(strMatcher48);
        org.junit.Assert.assertNotNull(strTokenizer50);
        org.junit.Assert.assertNotNull(strMatcher51);
        org.junit.Assert.assertNotNull(strTokenizer54);
        org.junit.Assert.assertNotNull(charArray56);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray56), "#");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray56), "#");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray56), "[#]");
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + false + "'", boolean58 == false);
        org.junit.Assert.assertNotNull(strTokenizer60);
        org.junit.Assert.assertNotNull(strMatcher61);
        org.junit.Assert.assertNotNull(strTokenizer63);
    }

    @Test
    public void test1540() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1540");
        char[] charArray2 = new char[] { '4', ' ' };
        org.apache.commons.lang3.text.StrTokenizer strTokenizer5 = new org.apache.commons.lang3.text.StrTokenizer(charArray2, 'a', ' ');
        org.apache.commons.lang3.text.StrTokenizer strTokenizer7 = new org.apache.commons.lang3.text.StrTokenizer(charArray2, '#');
        org.apache.commons.lang3.text.StrTokenizer strTokenizer8 = org.apache.commons.lang3.text.StrTokenizer.getTSVInstance(charArray2);
        boolean boolean9 = strTokenizer8.hasPrevious();
        org.junit.Assert.assertNotNull(charArray2);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray2), "4 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray2), "4 ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray2), "[4,  ]");
        org.junit.Assert.assertNotNull(strTokenizer8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test1541() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1541");
        char[] charArray2 = new char[] { '4', ' ' };
        org.apache.commons.lang3.text.StrTokenizer strTokenizer5 = new org.apache.commons.lang3.text.StrTokenizer(charArray2, 'a', ' ');
        org.apache.commons.lang3.text.StrMatcher strMatcher6 = strTokenizer5.getTrimmerMatcher();
        org.apache.commons.lang3.text.StrTokenizer strTokenizer8 = strTokenizer5.setDelimiterString("");
        char[] charArray11 = new char[] { '4', ' ' };
        org.apache.commons.lang3.text.StrTokenizer strTokenizer14 = new org.apache.commons.lang3.text.StrTokenizer(charArray11, 'a', ' ');
        org.apache.commons.lang3.text.StrTokenizer strTokenizer15 = org.apache.commons.lang3.text.StrTokenizer.getTSVInstance(charArray11);
        org.apache.commons.lang3.text.StrTokenizer strTokenizer16 = org.apache.commons.lang3.text.StrTokenizer.getTSVInstance(charArray11);
        org.apache.commons.lang3.text.StrTokenizer strTokenizer18 = new org.apache.commons.lang3.text.StrTokenizer(charArray11, "4 ");
        org.apache.commons.lang3.text.StrTokenizer strTokenizer19 = strTokenizer5.reset(charArray11);
        org.apache.commons.lang3.text.StrMatcher strMatcher20 = strTokenizer5.getDelimiterMatcher();
        org.junit.Assert.assertNotNull(charArray2);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray2), "4 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray2), "4 ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray2), "[4,  ]");
        org.junit.Assert.assertNotNull(strMatcher6);
        org.junit.Assert.assertNotNull(strTokenizer8);
        org.junit.Assert.assertNotNull(charArray11);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray11), "4 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray11), "4 ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray11), "[4,  ]");
        org.junit.Assert.assertNotNull(strTokenizer15);
        org.junit.Assert.assertNotNull(strTokenizer16);
        org.junit.Assert.assertNotNull(strTokenizer19);
        org.junit.Assert.assertNotNull(strMatcher20);
    }

    @Test
    public void test1542() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1542");
        char[] charArray0 = null;
        org.apache.commons.lang3.text.StrTokenizer strTokenizer2 = new org.apache.commons.lang3.text.StrTokenizer(charArray0, "");
        java.lang.String str3 = strTokenizer2.getContent();
        org.apache.commons.lang3.text.StrMatcher strMatcher4 = strTokenizer2.getDelimiterMatcher();
        boolean boolean5 = strTokenizer2.isEmptyTokenAsNull();
        java.lang.String str6 = strTokenizer2.previousToken();
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(strMatcher4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(str6);
    }

    @Test
    public void test1543() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1543");
        char[] charArray2 = new char[] { '4', ' ' };
        org.apache.commons.lang3.text.StrTokenizer strTokenizer5 = new org.apache.commons.lang3.text.StrTokenizer(charArray2, 'a', ' ');
        org.apache.commons.lang3.text.StrTokenizer strTokenizer6 = org.apache.commons.lang3.text.StrTokenizer.getCSVInstance(charArray2);
        org.apache.commons.lang3.text.StrTokenizer strTokenizer7 = org.apache.commons.lang3.text.StrTokenizer.getCSVInstance(charArray2);
        org.apache.commons.lang3.text.StrTokenizer strTokenizer8 = new org.apache.commons.lang3.text.StrTokenizer(charArray2);
        org.apache.commons.lang3.text.StrTokenizer strTokenizer10 = new org.apache.commons.lang3.text.StrTokenizer(charArray2, "StrTokenizer[4 ]");
        boolean boolean11 = strTokenizer10.isEmptyTokenAsNull();
        java.lang.String str12 = strTokenizer10.next();
        org.junit.Assert.assertNotNull(charArray2);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray2), "4 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray2), "4 ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray2), "[4,  ]");
        org.junit.Assert.assertNotNull(strTokenizer6);
        org.junit.Assert.assertNotNull(strTokenizer7);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "4 " + "'", str12, "4 ");
    }

    @Test
    public void test1544() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1544");
        char[] charArray2 = new char[] { '4', ' ' };
        org.apache.commons.lang3.text.StrTokenizer strTokenizer5 = new org.apache.commons.lang3.text.StrTokenizer(charArray2, 'a', ' ');
        org.apache.commons.lang3.text.StrTokenizer strTokenizer6 = org.apache.commons.lang3.text.StrTokenizer.getCSVInstance(charArray2);
        org.apache.commons.lang3.text.StrMatcher strMatcher7 = null;
        org.apache.commons.lang3.text.StrTokenizer strTokenizer8 = new org.apache.commons.lang3.text.StrTokenizer(charArray2, strMatcher7);
        org.apache.commons.lang3.text.StrTokenizer strTokenizer11 = new org.apache.commons.lang3.text.StrTokenizer(charArray2, ' ', '#');
        char[] charArray15 = new char[] { '4', ' ' };
        org.apache.commons.lang3.text.StrTokenizer strTokenizer18 = new org.apache.commons.lang3.text.StrTokenizer(charArray15, 'a', ' ');
        org.apache.commons.lang3.text.StrMatcher strMatcher19 = strTokenizer18.getTrimmerMatcher();
        org.apache.commons.lang3.text.StrTokenizer strTokenizer21 = strTokenizer18.setDelimiterString("");
        org.apache.commons.lang3.text.StrMatcher strMatcher22 = strTokenizer21.getTrimmerMatcher();
        org.apache.commons.lang3.text.StrTokenizer strTokenizer23 = new org.apache.commons.lang3.text.StrTokenizer("", strMatcher22);
        char[] charArray26 = new char[] { '4', ' ' };
        org.apache.commons.lang3.text.StrTokenizer strTokenizer29 = new org.apache.commons.lang3.text.StrTokenizer(charArray26, 'a', ' ');
        org.apache.commons.lang3.text.StrMatcher strMatcher30 = strTokenizer29.getTrimmerMatcher();
        org.apache.commons.lang3.text.StrTokenizer strTokenizer32 = strTokenizer29.setDelimiterString("");
        org.apache.commons.lang3.text.StrMatcher strMatcher33 = strTokenizer32.getTrimmerMatcher();
        org.apache.commons.lang3.text.StrTokenizer strTokenizer34 = strTokenizer23.setTrimmerMatcher(strMatcher33);
        org.apache.commons.lang3.text.StrTokenizer strTokenizer35 = new org.apache.commons.lang3.text.StrTokenizer(charArray2, strMatcher33);
        org.apache.commons.lang3.text.StrTokenizer strTokenizer36 = org.apache.commons.lang3.text.StrTokenizer.getCSVInstance(charArray2);
        org.apache.commons.lang3.text.StrTokenizer strTokenizer39 = new org.apache.commons.lang3.text.StrTokenizer(charArray2, ' ', 'a');
        org.apache.commons.lang3.text.StrTokenizer strTokenizer41 = strTokenizer39.setDelimiterChar('4');
        org.apache.commons.lang3.text.StrTokenizer strTokenizer43 = strTokenizer39.setDelimiterString(" ");
        org.apache.commons.lang3.text.StrMatcher strMatcher44 = strTokenizer39.getIgnoredMatcher();
        int int45 = strTokenizer39.size();
        org.apache.commons.lang3.text.StrTokenizer strTokenizer47 = strTokenizer39.setEmptyTokenAsNull(true);
        org.junit.Assert.assertNotNull(charArray2);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray2), "4 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray2), "4 ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray2), "[4,  ]");
        org.junit.Assert.assertNotNull(strTokenizer6);
        org.junit.Assert.assertNotNull(charArray15);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray15), "4 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray15), "4 ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray15), "[4,  ]");
        org.junit.Assert.assertNotNull(strMatcher19);
        org.junit.Assert.assertNotNull(strTokenizer21);
        org.junit.Assert.assertNotNull(strMatcher22);
        org.junit.Assert.assertNotNull(charArray26);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray26), "4 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray26), "4 ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray26), "[4,  ]");
        org.junit.Assert.assertNotNull(strMatcher30);
        org.junit.Assert.assertNotNull(strTokenizer32);
        org.junit.Assert.assertNotNull(strMatcher33);
        org.junit.Assert.assertNotNull(strTokenizer34);
        org.junit.Assert.assertNotNull(strTokenizer36);
        org.junit.Assert.assertNotNull(strTokenizer41);
        org.junit.Assert.assertNotNull(strTokenizer43);
        org.junit.Assert.assertNotNull(strMatcher44);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 1 + "'", int45 == 1);
        org.junit.Assert.assertNotNull(strTokenizer47);
    }

    @Test
    public void test1545() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1545");
        char[] charArray2 = new char[] { '4', ' ' };
        org.apache.commons.lang3.text.StrTokenizer strTokenizer5 = new org.apache.commons.lang3.text.StrTokenizer(charArray2, 'a', ' ');
        org.apache.commons.lang3.text.StrTokenizer strTokenizer6 = org.apache.commons.lang3.text.StrTokenizer.getCSVInstance(charArray2);
        org.apache.commons.lang3.text.StrTokenizer strTokenizer7 = org.apache.commons.lang3.text.StrTokenizer.getCSVInstance(charArray2);
        org.apache.commons.lang3.text.StrTokenizer strTokenizer8 = new org.apache.commons.lang3.text.StrTokenizer(charArray2);
        char[] charArray11 = new char[] { '4', ' ' };
        org.apache.commons.lang3.text.StrTokenizer strTokenizer14 = new org.apache.commons.lang3.text.StrTokenizer(charArray11, 'a', ' ');
        org.apache.commons.lang3.text.StrMatcher strMatcher15 = strTokenizer14.getTrimmerMatcher();
        java.lang.String str16 = strTokenizer14.nextToken();
        char[] charArray19 = new char[] { '4', ' ' };
        org.apache.commons.lang3.text.StrTokenizer strTokenizer22 = new org.apache.commons.lang3.text.StrTokenizer(charArray19, 'a', ' ');
        org.apache.commons.lang3.text.StrMatcher strMatcher23 = strTokenizer22.getTrimmerMatcher();
        org.apache.commons.lang3.text.StrTokenizer strTokenizer25 = strTokenizer22.setDelimiterString("");
        org.apache.commons.lang3.text.StrMatcher strMatcher26 = strTokenizer25.getTrimmerMatcher();
        org.apache.commons.lang3.text.StrMatcher strMatcher27 = strTokenizer25.getTrimmerMatcher();
        char[] charArray30 = new char[] { '4', ' ' };
        org.apache.commons.lang3.text.StrTokenizer strTokenizer33 = new org.apache.commons.lang3.text.StrTokenizer(charArray30, 'a', ' ');
        org.apache.commons.lang3.text.StrTokenizer strTokenizer34 = strTokenizer25.reset(charArray30);
        org.apache.commons.lang3.text.StrTokenizer strTokenizer36 = new org.apache.commons.lang3.text.StrTokenizer(charArray30, "");
        org.apache.commons.lang3.text.StrTokenizer strTokenizer37 = strTokenizer14.reset(charArray30);
        org.apache.commons.lang3.text.StrMatcher strMatcher38 = strTokenizer37.getDelimiterMatcher();
        java.util.List<java.lang.String> strList39 = strTokenizer37.getTokenList();
        char[] charArray42 = new char[] { '4', ' ' };
        org.apache.commons.lang3.text.StrTokenizer strTokenizer45 = new org.apache.commons.lang3.text.StrTokenizer(charArray42, 'a', ' ');
        char[] charArray48 = new char[] { '4', ' ' };
        org.apache.commons.lang3.text.StrTokenizer strTokenizer51 = new org.apache.commons.lang3.text.StrTokenizer(charArray48, 'a', ' ');
        org.apache.commons.lang3.text.StrMatcher strMatcher52 = strTokenizer51.getTrimmerMatcher();
        org.apache.commons.lang3.text.StrTokenizer strTokenizer54 = strTokenizer51.setDelimiterString("");
        org.apache.commons.lang3.text.StrMatcher strMatcher55 = strTokenizer54.getTrimmerMatcher();
        org.apache.commons.lang3.text.StrMatcher strMatcher56 = strTokenizer54.getTrimmerMatcher();
        char[] charArray58 = null;
        org.apache.commons.lang3.text.StrTokenizer strTokenizer60 = new org.apache.commons.lang3.text.StrTokenizer(charArray58, "");
        java.lang.String str61 = strTokenizer60.getContent();
        org.apache.commons.lang3.text.StrMatcher strMatcher62 = strTokenizer60.getDelimiterMatcher();
        org.apache.commons.lang3.text.StrTokenizer strTokenizer63 = new org.apache.commons.lang3.text.StrTokenizer("hi!", strMatcher62);
        org.apache.commons.lang3.text.StrTokenizer strTokenizer64 = new org.apache.commons.lang3.text.StrTokenizer(charArray42, strMatcher56, strMatcher62);
        org.apache.commons.lang3.text.StrTokenizer strTokenizer65 = strTokenizer37.setQuoteMatcher(strMatcher62);
        char[] charArray68 = new char[] { '4', ' ' };
        org.apache.commons.lang3.text.StrTokenizer strTokenizer71 = new org.apache.commons.lang3.text.StrTokenizer(charArray68, 'a', ' ');
        org.apache.commons.lang3.text.StrMatcher strMatcher72 = strTokenizer71.getTrimmerMatcher();
        char[] charArray75 = new char[] { '4', ' ' };
        org.apache.commons.lang3.text.StrTokenizer strTokenizer78 = new org.apache.commons.lang3.text.StrTokenizer(charArray75, 'a', ' ');
        org.apache.commons.lang3.text.StrTokenizer strTokenizer79 = org.apache.commons.lang3.text.StrTokenizer.getCSVInstance(charArray75);
        org.apache.commons.lang3.text.StrMatcher strMatcher80 = null;
        org.apache.commons.lang3.text.StrTokenizer strTokenizer81 = new org.apache.commons.lang3.text.StrTokenizer(charArray75, strMatcher80);
        org.apache.commons.lang3.text.StrTokenizer strTokenizer82 = strTokenizer71.reset(charArray75);
        java.lang.Object obj83 = strTokenizer71.clone();
        boolean boolean84 = strTokenizer71.hasNext();
        org.apache.commons.lang3.text.StrMatcher strMatcher85 = strTokenizer71.getTrimmerMatcher();
        org.apache.commons.lang3.text.StrTokenizer strTokenizer86 = strTokenizer37.setTrimmerMatcher(strMatcher85);
        org.apache.commons.lang3.text.StrTokenizer strTokenizer87 = new org.apache.commons.lang3.text.StrTokenizer(charArray2, strMatcher85);
        org.apache.commons.lang3.text.StrTokenizer strTokenizer89 = strTokenizer87.setDelimiterString("");
        org.apache.commons.lang3.text.StrTokenizer strTokenizer91 = strTokenizer87.setQuoteChar(' ');
        java.util.List<java.lang.String> strList92 = strTokenizer87.getTokenList();
        org.junit.Assert.assertNotNull(charArray2);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray2), "4 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray2), "4 ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray2), "[4,  ]");
        org.junit.Assert.assertNotNull(strTokenizer6);
        org.junit.Assert.assertNotNull(strTokenizer7);
        org.junit.Assert.assertNotNull(charArray11);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray11), "4 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray11), "4 ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray11), "[4,  ]");
        org.junit.Assert.assertNotNull(strMatcher15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "4 " + "'", str16, "4 ");
        org.junit.Assert.assertNotNull(charArray19);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray19), "4 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray19), "4 ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray19), "[4,  ]");
        org.junit.Assert.assertNotNull(strMatcher23);
        org.junit.Assert.assertNotNull(strTokenizer25);
        org.junit.Assert.assertNotNull(strMatcher26);
        org.junit.Assert.assertNotNull(strMatcher27);
        org.junit.Assert.assertNotNull(charArray30);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray30), "4 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray30), "4 ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray30), "[4,  ]");
        org.junit.Assert.assertNotNull(strTokenizer34);
        org.junit.Assert.assertNotNull(strTokenizer37);
        org.junit.Assert.assertNotNull(strMatcher38);
        org.junit.Assert.assertNotNull(strList39);
        org.junit.Assert.assertNotNull(charArray42);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray42), "4 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray42), "4 ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray42), "[4,  ]");
        org.junit.Assert.assertNotNull(charArray48);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray48), "4 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray48), "4 ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray48), "[4,  ]");
        org.junit.Assert.assertNotNull(strMatcher52);
        org.junit.Assert.assertNotNull(strTokenizer54);
        org.junit.Assert.assertNotNull(strMatcher55);
        org.junit.Assert.assertNotNull(strMatcher56);
        org.junit.Assert.assertNull(str61);
        org.junit.Assert.assertNotNull(strMatcher62);
        org.junit.Assert.assertNotNull(strTokenizer65);
        org.junit.Assert.assertNotNull(charArray68);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray68), "4 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray68), "4 ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray68), "[4,  ]");
        org.junit.Assert.assertNotNull(strMatcher72);
        org.junit.Assert.assertNotNull(charArray75);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray75), "4 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray75), "4 ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray75), "[4,  ]");
        org.junit.Assert.assertNotNull(strTokenizer79);
        org.junit.Assert.assertNotNull(strTokenizer82);
        org.junit.Assert.assertNotNull(obj83);
        org.junit.Assert.assertEquals(obj83.toString(), "StrTokenizer[not tokenized yet]");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj83), "StrTokenizer[not tokenized yet]");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj83), "StrTokenizer[not tokenized yet]");
        org.junit.Assert.assertTrue("'" + boolean84 + "' != '" + true + "'", boolean84 == true);
        org.junit.Assert.assertNotNull(strMatcher85);
        org.junit.Assert.assertNotNull(strTokenizer86);
        org.junit.Assert.assertNotNull(strTokenizer89);
        org.junit.Assert.assertNotNull(strTokenizer91);
        org.junit.Assert.assertNotNull(strList92);
    }

    @Test
    public void test1546() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1546");
        char[] charArray2 = new char[] { '4', ' ' };
        org.apache.commons.lang3.text.StrTokenizer strTokenizer5 = new org.apache.commons.lang3.text.StrTokenizer(charArray2, 'a', ' ');
        org.apache.commons.lang3.text.StrTokenizer strTokenizer7 = new org.apache.commons.lang3.text.StrTokenizer(charArray2, "hi!");
        org.apache.commons.lang3.text.StrTokenizer strTokenizer9 = new org.apache.commons.lang3.text.StrTokenizer(charArray2, '4');
        org.apache.commons.lang3.text.StrTokenizer strTokenizer10 = org.apache.commons.lang3.text.StrTokenizer.getCSVInstance(charArray2);
        org.junit.Assert.assertNotNull(charArray2);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray2), "4 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray2), "4 ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray2), "[4,  ]");
        org.junit.Assert.assertNotNull(strTokenizer10);
    }

    @Test
    public void test1547() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1547");
        org.apache.commons.lang3.text.StrTokenizer strTokenizer2 = org.apache.commons.lang3.text.StrTokenizer.getCSVInstance("");
        java.util.List<java.lang.String> strList3 = strTokenizer2.getTokenList();
        char[] charArray6 = new char[] { '4', ' ' };
        org.apache.commons.lang3.text.StrTokenizer strTokenizer9 = new org.apache.commons.lang3.text.StrTokenizer(charArray6, 'a', ' ');
        org.apache.commons.lang3.text.StrMatcher strMatcher10 = strTokenizer9.getTrimmerMatcher();
        char[] charArray13 = new char[] { '4', ' ' };
        org.apache.commons.lang3.text.StrTokenizer strTokenizer16 = new org.apache.commons.lang3.text.StrTokenizer(charArray13, 'a', ' ');
        org.apache.commons.lang3.text.StrTokenizer strTokenizer17 = org.apache.commons.lang3.text.StrTokenizer.getCSVInstance(charArray13);
        org.apache.commons.lang3.text.StrMatcher strMatcher18 = null;
        org.apache.commons.lang3.text.StrTokenizer strTokenizer19 = new org.apache.commons.lang3.text.StrTokenizer(charArray13, strMatcher18);
        org.apache.commons.lang3.text.StrTokenizer strTokenizer20 = strTokenizer9.reset(charArray13);
        org.apache.commons.lang3.text.StrTokenizer strTokenizer21 = org.apache.commons.lang3.text.StrTokenizer.getCSVInstance(charArray13);
        org.apache.commons.lang3.text.StrTokenizer strTokenizer22 = new org.apache.commons.lang3.text.StrTokenizer(charArray13);
        org.apache.commons.lang3.text.StrTokenizer strTokenizer24 = strTokenizer22.setDelimiterChar('4');
        org.apache.commons.lang3.text.StrMatcher strMatcher25 = strTokenizer22.getDelimiterMatcher();
        org.apache.commons.lang3.text.StrTokenizer strTokenizer26 = strTokenizer2.setDelimiterMatcher(strMatcher25);
        char[] charArray29 = new char[] { '4', ' ' };
        org.apache.commons.lang3.text.StrTokenizer strTokenizer32 = new org.apache.commons.lang3.text.StrTokenizer(charArray29, 'a', ' ');
        org.apache.commons.lang3.text.StrMatcher strMatcher33 = strTokenizer32.getTrimmerMatcher();
        org.apache.commons.lang3.text.StrTokenizer strTokenizer35 = strTokenizer32.setDelimiterString("");
        org.apache.commons.lang3.text.StrMatcher strMatcher36 = strTokenizer35.getTrimmerMatcher();
        boolean boolean37 = strTokenizer35.hasNext();
        org.apache.commons.lang3.text.StrTokenizer strTokenizer39 = strTokenizer35.setIgnoredChar(' ');
        java.lang.String str40 = strTokenizer39.nextToken();
        org.apache.commons.lang3.text.StrMatcher strMatcher41 = strTokenizer39.getDelimiterMatcher();
        org.apache.commons.lang3.text.StrTokenizer strTokenizer42 = new org.apache.commons.lang3.text.StrTokenizer("StrTokenizer[StrTokenizer[4 ]]", strMatcher25, strMatcher41);
        org.junit.Assert.assertNotNull(strTokenizer2);
        org.junit.Assert.assertNotNull(strList3);
        org.junit.Assert.assertNotNull(charArray6);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray6), "4 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray6), "4 ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray6), "[4,  ]");
        org.junit.Assert.assertNotNull(strMatcher10);
        org.junit.Assert.assertNotNull(charArray13);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray13), "4 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray13), "4 ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray13), "[4,  ]");
        org.junit.Assert.assertNotNull(strTokenizer17);
        org.junit.Assert.assertNotNull(strTokenizer20);
        org.junit.Assert.assertNotNull(strTokenizer21);
        org.junit.Assert.assertNotNull(strTokenizer24);
        org.junit.Assert.assertNotNull(strMatcher25);
        org.junit.Assert.assertNotNull(strTokenizer26);
        org.junit.Assert.assertNotNull(charArray29);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray29), "4 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray29), "4 ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray29), "[4,  ]");
        org.junit.Assert.assertNotNull(strMatcher33);
        org.junit.Assert.assertNotNull(strTokenizer35);
        org.junit.Assert.assertNotNull(strMatcher36);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
        org.junit.Assert.assertNotNull(strTokenizer39);
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "4 " + "'", str40, "4 ");
        org.junit.Assert.assertNotNull(strMatcher41);
    }

    @Test
    public void test1548() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1548");
        char[] charArray5 = new char[] { '#', ' ', ' ', 'a', '#' };
        org.apache.commons.lang3.text.StrTokenizer strTokenizer8 = new org.apache.commons.lang3.text.StrTokenizer(charArray5, '#', ' ');
        org.apache.commons.lang3.text.StrTokenizer strTokenizer10 = strTokenizer8.setEmptyTokenAsNull(false);
        org.apache.commons.lang3.text.StrMatcher strMatcher11 = strTokenizer8.getIgnoredMatcher();
        boolean boolean12 = strTokenizer8.hasNext();
        int int13 = strTokenizer8.nextIndex();
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray5), "#  a#");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray5), "#  a#");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray5), "[#,  ,  , a, #]");
        org.junit.Assert.assertNotNull(strTokenizer10);
        org.junit.Assert.assertNotNull(strMatcher11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
    }

    @Test
    public void test1549() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1549");
        org.apache.commons.lang3.text.StrTokenizer strTokenizer2 = new org.apache.commons.lang3.text.StrTokenizer("StrTokenizer[", "hi!");
        org.apache.commons.lang3.text.StrTokenizer strTokenizer5 = new org.apache.commons.lang3.text.StrTokenizer("StrTokenizer[StrTokenizer[4 ]]", "");
        char[] charArray9 = new char[] { '4', ' ' };
        org.apache.commons.lang3.text.StrTokenizer strTokenizer12 = new org.apache.commons.lang3.text.StrTokenizer(charArray9, 'a', ' ');
        char[] charArray15 = new char[] { '4', ' ' };
        org.apache.commons.lang3.text.StrTokenizer strTokenizer18 = new org.apache.commons.lang3.text.StrTokenizer(charArray15, 'a', ' ');
        org.apache.commons.lang3.text.StrMatcher strMatcher19 = strTokenizer18.getTrimmerMatcher();
        org.apache.commons.lang3.text.StrTokenizer strTokenizer21 = strTokenizer18.setDelimiterString("");
        org.apache.commons.lang3.text.StrMatcher strMatcher22 = strTokenizer21.getTrimmerMatcher();
        org.apache.commons.lang3.text.StrMatcher strMatcher23 = strTokenizer21.getTrimmerMatcher();
        char[] charArray25 = null;
        org.apache.commons.lang3.text.StrTokenizer strTokenizer27 = new org.apache.commons.lang3.text.StrTokenizer(charArray25, "");
        java.lang.String str28 = strTokenizer27.getContent();
        org.apache.commons.lang3.text.StrMatcher strMatcher29 = strTokenizer27.getDelimiterMatcher();
        org.apache.commons.lang3.text.StrTokenizer strTokenizer30 = new org.apache.commons.lang3.text.StrTokenizer("hi!", strMatcher29);
        org.apache.commons.lang3.text.StrTokenizer strTokenizer31 = new org.apache.commons.lang3.text.StrTokenizer(charArray9, strMatcher23, strMatcher29);
        char[] charArray33 = null;
        org.apache.commons.lang3.text.StrTokenizer strTokenizer35 = new org.apache.commons.lang3.text.StrTokenizer(charArray33, "");
        java.lang.String str36 = strTokenizer35.getContent();
        org.apache.commons.lang3.text.StrMatcher strMatcher37 = strTokenizer35.getDelimiterMatcher();
        org.apache.commons.lang3.text.StrTokenizer strTokenizer39 = org.apache.commons.lang3.text.StrTokenizer.getCSVInstance("");
        java.util.List<java.lang.String> strList40 = strTokenizer39.getTokenList();
        boolean boolean41 = strTokenizer39.hasPrevious();
        java.lang.String[] strArray42 = strTokenizer39.getTokenArray();
        char[] charArray45 = new char[] { '4', ' ' };
        org.apache.commons.lang3.text.StrTokenizer strTokenizer48 = new org.apache.commons.lang3.text.StrTokenizer(charArray45, 'a', ' ');
        org.apache.commons.lang3.text.StrTokenizer strTokenizer49 = org.apache.commons.lang3.text.StrTokenizer.getCSVInstance(charArray45);
        org.apache.commons.lang3.text.StrMatcher strMatcher50 = null;
        org.apache.commons.lang3.text.StrTokenizer strTokenizer51 = new org.apache.commons.lang3.text.StrTokenizer(charArray45, strMatcher50);
        char[] charArray54 = new char[] { '4', ' ' };
        org.apache.commons.lang3.text.StrTokenizer strTokenizer57 = new org.apache.commons.lang3.text.StrTokenizer(charArray54, 'a', ' ');
        org.apache.commons.lang3.text.StrMatcher strMatcher58 = strTokenizer57.getTrimmerMatcher();
        org.apache.commons.lang3.text.StrTokenizer strTokenizer60 = strTokenizer57.setDelimiterString("");
        org.apache.commons.lang3.text.StrMatcher strMatcher61 = strTokenizer60.getTrimmerMatcher();
        org.apache.commons.lang3.text.StrTokenizer strTokenizer62 = new org.apache.commons.lang3.text.StrTokenizer(charArray45, strMatcher61);
        org.apache.commons.lang3.text.StrTokenizer strTokenizer63 = strTokenizer39.setTrimmerMatcher(strMatcher61);
        org.apache.commons.lang3.text.StrTokenizer strTokenizer64 = new org.apache.commons.lang3.text.StrTokenizer("StrTokenizer[]", strMatcher37, strMatcher61);
        org.apache.commons.lang3.text.StrTokenizer strTokenizer65 = new org.apache.commons.lang3.text.StrTokenizer("StrTokenizer[4 ]", strMatcher29, strMatcher61);
        org.apache.commons.lang3.text.StrTokenizer strTokenizer66 = strTokenizer5.setDelimiterMatcher(strMatcher61);
        org.apache.commons.lang3.text.StrTokenizer strTokenizer67 = strTokenizer2.setTrimmerMatcher(strMatcher61);
        org.apache.commons.lang3.text.StrMatcher strMatcher68 = strTokenizer67.getQuoteMatcher();
        org.junit.Assert.assertNotNull(charArray9);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray9), "4 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray9), "4 ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray9), "[4,  ]");
        org.junit.Assert.assertNotNull(charArray15);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray15), "4 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray15), "4 ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray15), "[4,  ]");
        org.junit.Assert.assertNotNull(strMatcher19);
        org.junit.Assert.assertNotNull(strTokenizer21);
        org.junit.Assert.assertNotNull(strMatcher22);
        org.junit.Assert.assertNotNull(strMatcher23);
        org.junit.Assert.assertNull(str28);
        org.junit.Assert.assertNotNull(strMatcher29);
        org.junit.Assert.assertNull(str36);
        org.junit.Assert.assertNotNull(strMatcher37);
        org.junit.Assert.assertNotNull(strTokenizer39);
        org.junit.Assert.assertNotNull(strList40);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertNotNull(strArray42);
        org.junit.Assert.assertNotNull(charArray45);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray45), "4 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray45), "4 ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray45), "[4,  ]");
        org.junit.Assert.assertNotNull(strTokenizer49);
        org.junit.Assert.assertNotNull(charArray54);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray54), "4 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray54), "4 ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray54), "[4,  ]");
        org.junit.Assert.assertNotNull(strMatcher58);
        org.junit.Assert.assertNotNull(strTokenizer60);
        org.junit.Assert.assertNotNull(strMatcher61);
        org.junit.Assert.assertNotNull(strTokenizer63);
        org.junit.Assert.assertNotNull(strTokenizer66);
        org.junit.Assert.assertNotNull(strTokenizer67);
        org.junit.Assert.assertNotNull(strMatcher68);
    }

    @Test
    public void test1550() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1550");
        char[] charArray2 = new char[] { '4', ' ' };
        org.apache.commons.lang3.text.StrTokenizer strTokenizer5 = new org.apache.commons.lang3.text.StrTokenizer(charArray2, 'a', ' ');
        org.apache.commons.lang3.text.StrTokenizer strTokenizer8 = new org.apache.commons.lang3.text.StrTokenizer(charArray2, '4', 'a');
        char[] charArray11 = new char[] { '4', ' ' };
        org.apache.commons.lang3.text.StrTokenizer strTokenizer14 = new org.apache.commons.lang3.text.StrTokenizer(charArray11, 'a', ' ');
        org.apache.commons.lang3.text.StrMatcher strMatcher15 = strTokenizer14.getTrimmerMatcher();
        org.apache.commons.lang3.text.StrMatcher strMatcher16 = strTokenizer14.getQuoteMatcher();
        org.apache.commons.lang3.text.StrTokenizer strTokenizer17 = new org.apache.commons.lang3.text.StrTokenizer(charArray2, strMatcher16);
        org.apache.commons.lang3.text.StrTokenizer strTokenizer19 = org.apache.commons.lang3.text.StrTokenizer.getCSVInstance("hi!");
        char[] charArray22 = new char[] { 'a', '#' };
        org.apache.commons.lang3.text.StrTokenizer strTokenizer23 = org.apache.commons.lang3.text.StrTokenizer.getCSVInstance(charArray22);
        org.apache.commons.lang3.text.StrTokenizer strTokenizer24 = strTokenizer19.reset(charArray22);
        org.apache.commons.lang3.text.StrTokenizer strTokenizer25 = org.apache.commons.lang3.text.StrTokenizer.getTSVInstance(charArray22);
        org.apache.commons.lang3.text.StrTokenizer strTokenizer28 = new org.apache.commons.lang3.text.StrTokenizer("4 ", 'a');
        org.apache.commons.lang3.text.StrMatcher strMatcher29 = strTokenizer28.getDelimiterMatcher();
        char[] charArray32 = new char[] { '4', ' ' };
        org.apache.commons.lang3.text.StrTokenizer strTokenizer35 = new org.apache.commons.lang3.text.StrTokenizer(charArray32, 'a', ' ');
        org.apache.commons.lang3.text.StrMatcher strMatcher36 = strTokenizer35.getTrimmerMatcher();
        org.apache.commons.lang3.text.StrTokenizer strTokenizer38 = strTokenizer35.setDelimiterString("");
        char[] charArray42 = new char[] { '4', ' ' };
        org.apache.commons.lang3.text.StrTokenizer strTokenizer45 = new org.apache.commons.lang3.text.StrTokenizer(charArray42, 'a', ' ');
        org.apache.commons.lang3.text.StrMatcher strMatcher46 = strTokenizer45.getTrimmerMatcher();
        org.apache.commons.lang3.text.StrTokenizer strTokenizer48 = strTokenizer45.setDelimiterString("");
        org.apache.commons.lang3.text.StrMatcher strMatcher49 = strTokenizer48.getTrimmerMatcher();
        org.apache.commons.lang3.text.StrTokenizer strTokenizer50 = new org.apache.commons.lang3.text.StrTokenizer("", strMatcher49);
        char[] charArray53 = new char[] { '4', ' ' };
        org.apache.commons.lang3.text.StrTokenizer strTokenizer56 = new org.apache.commons.lang3.text.StrTokenizer(charArray53, 'a', ' ');
        org.apache.commons.lang3.text.StrMatcher strMatcher57 = strTokenizer56.getTrimmerMatcher();
        org.apache.commons.lang3.text.StrTokenizer strTokenizer59 = strTokenizer56.setDelimiterString("");
        org.apache.commons.lang3.text.StrMatcher strMatcher60 = strTokenizer59.getTrimmerMatcher();
        org.apache.commons.lang3.text.StrTokenizer strTokenizer61 = strTokenizer50.setTrimmerMatcher(strMatcher60);
        org.apache.commons.lang3.text.StrTokenizer strTokenizer62 = strTokenizer38.setTrimmerMatcher(strMatcher60);
        char[] charArray65 = new char[] { '4', ' ' };
        org.apache.commons.lang3.text.StrTokenizer strTokenizer68 = new org.apache.commons.lang3.text.StrTokenizer(charArray65, 'a', ' ');
        org.apache.commons.lang3.text.StrMatcher strMatcher69 = strTokenizer68.getTrimmerMatcher();
        org.apache.commons.lang3.text.StrTokenizer strTokenizer71 = strTokenizer68.setDelimiterString("");
        char[] charArray75 = new char[] { '4', ' ' };
        org.apache.commons.lang3.text.StrTokenizer strTokenizer78 = new org.apache.commons.lang3.text.StrTokenizer(charArray75, 'a', ' ');
        org.apache.commons.lang3.text.StrMatcher strMatcher79 = strTokenizer78.getTrimmerMatcher();
        org.apache.commons.lang3.text.StrTokenizer strTokenizer81 = strTokenizer78.setDelimiterString("");
        org.apache.commons.lang3.text.StrMatcher strMatcher82 = strTokenizer81.getTrimmerMatcher();
        org.apache.commons.lang3.text.StrTokenizer strTokenizer83 = new org.apache.commons.lang3.text.StrTokenizer("", strMatcher82);
        char[] charArray86 = new char[] { '4', ' ' };
        org.apache.commons.lang3.text.StrTokenizer strTokenizer89 = new org.apache.commons.lang3.text.StrTokenizer(charArray86, 'a', ' ');
        org.apache.commons.lang3.text.StrMatcher strMatcher90 = strTokenizer89.getTrimmerMatcher();
        org.apache.commons.lang3.text.StrTokenizer strTokenizer92 = strTokenizer89.setDelimiterString("");
        org.apache.commons.lang3.text.StrMatcher strMatcher93 = strTokenizer92.getTrimmerMatcher();
        org.apache.commons.lang3.text.StrTokenizer strTokenizer94 = strTokenizer83.setTrimmerMatcher(strMatcher93);
        org.apache.commons.lang3.text.StrTokenizer strTokenizer95 = strTokenizer71.setTrimmerMatcher(strMatcher93);
        org.apache.commons.lang3.text.StrTokenizer strTokenizer96 = strTokenizer62.setIgnoredMatcher(strMatcher93);
        org.apache.commons.lang3.text.StrTokenizer strTokenizer97 = new org.apache.commons.lang3.text.StrTokenizer(charArray22, strMatcher29, strMatcher93);
        org.apache.commons.lang3.text.StrTokenizer strTokenizer98 = strTokenizer17.reset(charArray22);
        java.lang.String str99 = strTokenizer98.next();
        org.junit.Assert.assertNotNull(charArray2);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray2), "4 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray2), "4 ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray2), "[4,  ]");
        org.junit.Assert.assertNotNull(charArray11);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray11), "4 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray11), "4 ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray11), "[4,  ]");
        org.junit.Assert.assertNotNull(strMatcher15);
        org.junit.Assert.assertNotNull(strMatcher16);
        org.junit.Assert.assertNotNull(strTokenizer19);
        org.junit.Assert.assertNotNull(charArray22);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray22), "a#");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray22), "a#");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray22), "[a, #]");
        org.junit.Assert.assertNotNull(strTokenizer23);
        org.junit.Assert.assertNotNull(strTokenizer24);
        org.junit.Assert.assertNotNull(strTokenizer25);
        org.junit.Assert.assertNotNull(strMatcher29);
        org.junit.Assert.assertNotNull(charArray32);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray32), "4 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray32), "4 ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray32), "[4,  ]");
        org.junit.Assert.assertNotNull(strMatcher36);
        org.junit.Assert.assertNotNull(strTokenizer38);
        org.junit.Assert.assertNotNull(charArray42);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray42), "4 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray42), "4 ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray42), "[4,  ]");
        org.junit.Assert.assertNotNull(strMatcher46);
        org.junit.Assert.assertNotNull(strTokenizer48);
        org.junit.Assert.assertNotNull(strMatcher49);
        org.junit.Assert.assertNotNull(charArray53);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray53), "4 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray53), "4 ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray53), "[4,  ]");
        org.junit.Assert.assertNotNull(strMatcher57);
        org.junit.Assert.assertNotNull(strTokenizer59);
        org.junit.Assert.assertNotNull(strMatcher60);
        org.junit.Assert.assertNotNull(strTokenizer61);
        org.junit.Assert.assertNotNull(strTokenizer62);
        org.junit.Assert.assertNotNull(charArray65);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray65), "4 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray65), "4 ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray65), "[4,  ]");
        org.junit.Assert.assertNotNull(strMatcher69);
        org.junit.Assert.assertNotNull(strTokenizer71);
        org.junit.Assert.assertNotNull(charArray75);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray75), "4 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray75), "4 ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray75), "[4,  ]");
        org.junit.Assert.assertNotNull(strMatcher79);
        org.junit.Assert.assertNotNull(strTokenizer81);
        org.junit.Assert.assertNotNull(strMatcher82);
        org.junit.Assert.assertNotNull(charArray86);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray86), "4 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray86), "4 ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray86), "[4,  ]");
        org.junit.Assert.assertNotNull(strMatcher90);
        org.junit.Assert.assertNotNull(strTokenizer92);
        org.junit.Assert.assertNotNull(strMatcher93);
        org.junit.Assert.assertNotNull(strTokenizer94);
        org.junit.Assert.assertNotNull(strTokenizer95);
        org.junit.Assert.assertNotNull(strTokenizer96);
        org.junit.Assert.assertNotNull(strTokenizer98);
        org.junit.Assert.assertEquals("'" + str99 + "' != '" + "a#" + "'", str99, "a#");
    }

    @Test
    public void test1551() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1551");
        char[] charArray2 = new char[] { '4', ' ' };
        org.apache.commons.lang3.text.StrTokenizer strTokenizer5 = new org.apache.commons.lang3.text.StrTokenizer(charArray2, 'a', ' ');
        org.apache.commons.lang3.text.StrMatcher strMatcher6 = strTokenizer5.getTrimmerMatcher();
        org.apache.commons.lang3.text.StrTokenizer strTokenizer8 = strTokenizer5.setDelimiterString("");
        char[] charArray12 = new char[] { '4', ' ' };
        org.apache.commons.lang3.text.StrTokenizer strTokenizer15 = new org.apache.commons.lang3.text.StrTokenizer(charArray12, 'a', ' ');
        org.apache.commons.lang3.text.StrMatcher strMatcher16 = strTokenizer15.getTrimmerMatcher();
        org.apache.commons.lang3.text.StrTokenizer strTokenizer18 = strTokenizer15.setDelimiterString("");
        org.apache.commons.lang3.text.StrMatcher strMatcher19 = strTokenizer18.getTrimmerMatcher();
        org.apache.commons.lang3.text.StrTokenizer strTokenizer20 = new org.apache.commons.lang3.text.StrTokenizer("", strMatcher19);
        char[] charArray23 = new char[] { '4', ' ' };
        org.apache.commons.lang3.text.StrTokenizer strTokenizer26 = new org.apache.commons.lang3.text.StrTokenizer(charArray23, 'a', ' ');
        org.apache.commons.lang3.text.StrMatcher strMatcher27 = strTokenizer26.getTrimmerMatcher();
        org.apache.commons.lang3.text.StrTokenizer strTokenizer29 = strTokenizer26.setDelimiterString("");
        org.apache.commons.lang3.text.StrMatcher strMatcher30 = strTokenizer29.getTrimmerMatcher();
        org.apache.commons.lang3.text.StrTokenizer strTokenizer31 = strTokenizer20.setTrimmerMatcher(strMatcher30);
        org.apache.commons.lang3.text.StrTokenizer strTokenizer32 = strTokenizer8.setTrimmerMatcher(strMatcher30);
        java.lang.String str33 = strTokenizer8.getContent();
        char[] charArray34 = null;
        org.apache.commons.lang3.text.StrTokenizer strTokenizer36 = new org.apache.commons.lang3.text.StrTokenizer(charArray34, "");
        java.lang.String str37 = strTokenizer36.getContent();
        org.apache.commons.lang3.text.StrMatcher strMatcher38 = strTokenizer36.getDelimiterMatcher();
        org.apache.commons.lang3.text.StrTokenizer strTokenizer39 = strTokenizer8.setDelimiterMatcher(strMatcher38);
        int int40 = strTokenizer8.nextIndex();
        java.lang.String str41 = strTokenizer8.nextToken();
        org.junit.Assert.assertNotNull(charArray2);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray2), "4 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray2), "4 ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray2), "[4,  ]");
        org.junit.Assert.assertNotNull(strMatcher6);
        org.junit.Assert.assertNotNull(strTokenizer8);
        org.junit.Assert.assertNotNull(charArray12);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray12), "4 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray12), "4 ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray12), "[4,  ]");
        org.junit.Assert.assertNotNull(strMatcher16);
        org.junit.Assert.assertNotNull(strTokenizer18);
        org.junit.Assert.assertNotNull(strMatcher19);
        org.junit.Assert.assertNotNull(charArray23);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray23), "4 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray23), "4 ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray23), "[4,  ]");
        org.junit.Assert.assertNotNull(strMatcher27);
        org.junit.Assert.assertNotNull(strTokenizer29);
        org.junit.Assert.assertNotNull(strMatcher30);
        org.junit.Assert.assertNotNull(strTokenizer31);
        org.junit.Assert.assertNotNull(strTokenizer32);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "4 " + "'", str33, "4 ");
        org.junit.Assert.assertNull(str37);
        org.junit.Assert.assertNotNull(strMatcher38);
        org.junit.Assert.assertNotNull(strTokenizer39);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 0 + "'", int40 == 0);
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "4 " + "'", str41, "4 ");
    }

    @Test
    public void test1552() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1552");
        char[] charArray2 = new char[] { '4', ' ' };
        org.apache.commons.lang3.text.StrTokenizer strTokenizer5 = new org.apache.commons.lang3.text.StrTokenizer(charArray2, 'a', ' ');
        org.apache.commons.lang3.text.StrTokenizer strTokenizer7 = new org.apache.commons.lang3.text.StrTokenizer(charArray2, "hi!");
        org.apache.commons.lang3.text.StrTokenizer strTokenizer9 = new org.apache.commons.lang3.text.StrTokenizer(charArray2, '#');
        org.apache.commons.lang3.text.StrTokenizer strTokenizer10 = org.apache.commons.lang3.text.StrTokenizer.getCSVInstance(charArray2);
        org.apache.commons.lang3.text.StrTokenizer strTokenizer12 = new org.apache.commons.lang3.text.StrTokenizer(charArray2, '4');
        org.apache.commons.lang3.text.StrTokenizer strTokenizer14 = new org.apache.commons.lang3.text.StrTokenizer(charArray2, "");
        char[] charArray17 = new char[] { '4', ' ' };
        org.apache.commons.lang3.text.StrTokenizer strTokenizer20 = new org.apache.commons.lang3.text.StrTokenizer(charArray17, 'a', ' ');
        org.apache.commons.lang3.text.StrMatcher strMatcher21 = strTokenizer20.getTrimmerMatcher();
        java.lang.String str22 = strTokenizer20.nextToken();
        char[] charArray25 = new char[] { '4', ' ' };
        org.apache.commons.lang3.text.StrTokenizer strTokenizer28 = new org.apache.commons.lang3.text.StrTokenizer(charArray25, 'a', ' ');
        org.apache.commons.lang3.text.StrMatcher strMatcher29 = strTokenizer28.getTrimmerMatcher();
        org.apache.commons.lang3.text.StrTokenizer strTokenizer31 = strTokenizer28.setDelimiterString("");
        org.apache.commons.lang3.text.StrMatcher strMatcher32 = strTokenizer31.getTrimmerMatcher();
        org.apache.commons.lang3.text.StrMatcher strMatcher33 = strTokenizer31.getTrimmerMatcher();
        char[] charArray36 = new char[] { '4', ' ' };
        org.apache.commons.lang3.text.StrTokenizer strTokenizer39 = new org.apache.commons.lang3.text.StrTokenizer(charArray36, 'a', ' ');
        org.apache.commons.lang3.text.StrTokenizer strTokenizer40 = strTokenizer31.reset(charArray36);
        org.apache.commons.lang3.text.StrTokenizer strTokenizer42 = new org.apache.commons.lang3.text.StrTokenizer(charArray36, "");
        org.apache.commons.lang3.text.StrTokenizer strTokenizer43 = strTokenizer20.reset(charArray36);
        org.apache.commons.lang3.text.StrMatcher strMatcher44 = strTokenizer43.getDelimiterMatcher();
        org.apache.commons.lang3.text.StrTokenizer strTokenizer45 = strTokenizer14.setIgnoredMatcher(strMatcher44);
        java.lang.String str46 = strTokenizer45.getContent();
        org.junit.Assert.assertNotNull(charArray2);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray2), "4 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray2), "4 ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray2), "[4,  ]");
        org.junit.Assert.assertNotNull(strTokenizer10);
        org.junit.Assert.assertNotNull(charArray17);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray17), "4 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray17), "4 ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray17), "[4,  ]");
        org.junit.Assert.assertNotNull(strMatcher21);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "4 " + "'", str22, "4 ");
        org.junit.Assert.assertNotNull(charArray25);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray25), "4 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray25), "4 ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray25), "[4,  ]");
        org.junit.Assert.assertNotNull(strMatcher29);
        org.junit.Assert.assertNotNull(strTokenizer31);
        org.junit.Assert.assertNotNull(strMatcher32);
        org.junit.Assert.assertNotNull(strMatcher33);
        org.junit.Assert.assertNotNull(charArray36);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray36), "4 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray36), "4 ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray36), "[4,  ]");
        org.junit.Assert.assertNotNull(strTokenizer40);
        org.junit.Assert.assertNotNull(strTokenizer43);
        org.junit.Assert.assertNotNull(strMatcher44);
        org.junit.Assert.assertNotNull(strTokenizer45);
        org.junit.Assert.assertEquals("'" + str46 + "' != '" + "4 " + "'", str46, "4 ");
    }

    @Test
    public void test1553() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1553");
        org.apache.commons.lang3.text.StrTokenizer strTokenizer2 = new org.apache.commons.lang3.text.StrTokenizer("StrTokenizer[", "hi!");
        org.apache.commons.lang3.text.StrTokenizer strTokenizer5 = new org.apache.commons.lang3.text.StrTokenizer("StrTokenizer[StrTokenizer[4 ]]", "");
        char[] charArray9 = new char[] { '4', ' ' };
        org.apache.commons.lang3.text.StrTokenizer strTokenizer12 = new org.apache.commons.lang3.text.StrTokenizer(charArray9, 'a', ' ');
        char[] charArray15 = new char[] { '4', ' ' };
        org.apache.commons.lang3.text.StrTokenizer strTokenizer18 = new org.apache.commons.lang3.text.StrTokenizer(charArray15, 'a', ' ');
        org.apache.commons.lang3.text.StrMatcher strMatcher19 = strTokenizer18.getTrimmerMatcher();
        org.apache.commons.lang3.text.StrTokenizer strTokenizer21 = strTokenizer18.setDelimiterString("");
        org.apache.commons.lang3.text.StrMatcher strMatcher22 = strTokenizer21.getTrimmerMatcher();
        org.apache.commons.lang3.text.StrMatcher strMatcher23 = strTokenizer21.getTrimmerMatcher();
        char[] charArray25 = null;
        org.apache.commons.lang3.text.StrTokenizer strTokenizer27 = new org.apache.commons.lang3.text.StrTokenizer(charArray25, "");
        java.lang.String str28 = strTokenizer27.getContent();
        org.apache.commons.lang3.text.StrMatcher strMatcher29 = strTokenizer27.getDelimiterMatcher();
        org.apache.commons.lang3.text.StrTokenizer strTokenizer30 = new org.apache.commons.lang3.text.StrTokenizer("hi!", strMatcher29);
        org.apache.commons.lang3.text.StrTokenizer strTokenizer31 = new org.apache.commons.lang3.text.StrTokenizer(charArray9, strMatcher23, strMatcher29);
        char[] charArray33 = null;
        org.apache.commons.lang3.text.StrTokenizer strTokenizer35 = new org.apache.commons.lang3.text.StrTokenizer(charArray33, "");
        java.lang.String str36 = strTokenizer35.getContent();
        org.apache.commons.lang3.text.StrMatcher strMatcher37 = strTokenizer35.getDelimiterMatcher();
        org.apache.commons.lang3.text.StrTokenizer strTokenizer39 = org.apache.commons.lang3.text.StrTokenizer.getCSVInstance("");
        java.util.List<java.lang.String> strList40 = strTokenizer39.getTokenList();
        boolean boolean41 = strTokenizer39.hasPrevious();
        java.lang.String[] strArray42 = strTokenizer39.getTokenArray();
        char[] charArray45 = new char[] { '4', ' ' };
        org.apache.commons.lang3.text.StrTokenizer strTokenizer48 = new org.apache.commons.lang3.text.StrTokenizer(charArray45, 'a', ' ');
        org.apache.commons.lang3.text.StrTokenizer strTokenizer49 = org.apache.commons.lang3.text.StrTokenizer.getCSVInstance(charArray45);
        org.apache.commons.lang3.text.StrMatcher strMatcher50 = null;
        org.apache.commons.lang3.text.StrTokenizer strTokenizer51 = new org.apache.commons.lang3.text.StrTokenizer(charArray45, strMatcher50);
        char[] charArray54 = new char[] { '4', ' ' };
        org.apache.commons.lang3.text.StrTokenizer strTokenizer57 = new org.apache.commons.lang3.text.StrTokenizer(charArray54, 'a', ' ');
        org.apache.commons.lang3.text.StrMatcher strMatcher58 = strTokenizer57.getTrimmerMatcher();
        org.apache.commons.lang3.text.StrTokenizer strTokenizer60 = strTokenizer57.setDelimiterString("");
        org.apache.commons.lang3.text.StrMatcher strMatcher61 = strTokenizer60.getTrimmerMatcher();
        org.apache.commons.lang3.text.StrTokenizer strTokenizer62 = new org.apache.commons.lang3.text.StrTokenizer(charArray45, strMatcher61);
        org.apache.commons.lang3.text.StrTokenizer strTokenizer63 = strTokenizer39.setTrimmerMatcher(strMatcher61);
        org.apache.commons.lang3.text.StrTokenizer strTokenizer64 = new org.apache.commons.lang3.text.StrTokenizer("StrTokenizer[]", strMatcher37, strMatcher61);
        org.apache.commons.lang3.text.StrTokenizer strTokenizer65 = new org.apache.commons.lang3.text.StrTokenizer("StrTokenizer[4 ]", strMatcher29, strMatcher61);
        org.apache.commons.lang3.text.StrTokenizer strTokenizer66 = strTokenizer5.setDelimiterMatcher(strMatcher61);
        org.apache.commons.lang3.text.StrTokenizer strTokenizer67 = strTokenizer2.setTrimmerMatcher(strMatcher61);
        java.lang.Class<?> wildcardClass68 = strTokenizer2.getClass();
        org.junit.Assert.assertNotNull(charArray9);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray9), "4 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray9), "4 ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray9), "[4,  ]");
        org.junit.Assert.assertNotNull(charArray15);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray15), "4 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray15), "4 ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray15), "[4,  ]");
        org.junit.Assert.assertNotNull(strMatcher19);
        org.junit.Assert.assertNotNull(strTokenizer21);
        org.junit.Assert.assertNotNull(strMatcher22);
        org.junit.Assert.assertNotNull(strMatcher23);
        org.junit.Assert.assertNull(str28);
        org.junit.Assert.assertNotNull(strMatcher29);
        org.junit.Assert.assertNull(str36);
        org.junit.Assert.assertNotNull(strMatcher37);
        org.junit.Assert.assertNotNull(strTokenizer39);
        org.junit.Assert.assertNotNull(strList40);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertNotNull(strArray42);
        org.junit.Assert.assertNotNull(charArray45);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray45), "4 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray45), "4 ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray45), "[4,  ]");
        org.junit.Assert.assertNotNull(strTokenizer49);
        org.junit.Assert.assertNotNull(charArray54);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray54), "4 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray54), "4 ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray54), "[4,  ]");
        org.junit.Assert.assertNotNull(strMatcher58);
        org.junit.Assert.assertNotNull(strTokenizer60);
        org.junit.Assert.assertNotNull(strMatcher61);
        org.junit.Assert.assertNotNull(strTokenizer63);
        org.junit.Assert.assertNotNull(strTokenizer66);
        org.junit.Assert.assertNotNull(strTokenizer67);
        org.junit.Assert.assertNotNull(wildcardClass68);
    }

    @Test
    public void test1554() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1554");
        org.apache.commons.lang3.text.StrTokenizer strTokenizer2 = new org.apache.commons.lang3.text.StrTokenizer("StrTokenizer[]", 'a');
        char[] charArray4 = new char[] { '#' };
        org.apache.commons.lang3.text.StrTokenizer strTokenizer5 = new org.apache.commons.lang3.text.StrTokenizer(charArray4);
        org.apache.commons.lang3.text.StrTokenizer strTokenizer7 = new org.apache.commons.lang3.text.StrTokenizer(charArray4, "4 ");
        org.apache.commons.lang3.text.StrTokenizer strTokenizer8 = strTokenizer2.reset(charArray4);
        org.apache.commons.lang3.text.StrTokenizer strTokenizer10 = strTokenizer2.setEmptyTokenAsNull(true);
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray4), "#");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray4), "#");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray4), "[#]");
        org.junit.Assert.assertNotNull(strTokenizer8);
        org.junit.Assert.assertNotNull(strTokenizer10);
    }

    @Test
    public void test1555() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1555");
        org.apache.commons.lang3.text.StrTokenizer strTokenizer2 = new org.apache.commons.lang3.text.StrTokenizer("StrTokenizer[a#]", '#');
        boolean boolean3 = strTokenizer2.hasNext();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
    }

    @Test
    public void test1556() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1556");
        char[] charArray2 = new char[] { '4', ' ' };
        org.apache.commons.lang3.text.StrTokenizer strTokenizer5 = new org.apache.commons.lang3.text.StrTokenizer(charArray2, 'a', ' ');
        org.apache.commons.lang3.text.StrMatcher strMatcher6 = strTokenizer5.getTrimmerMatcher();
        java.lang.String str7 = strTokenizer5.nextToken();
        char[] charArray10 = new char[] { '4', ' ' };
        org.apache.commons.lang3.text.StrTokenizer strTokenizer13 = new org.apache.commons.lang3.text.StrTokenizer(charArray10, 'a', ' ');
        org.apache.commons.lang3.text.StrMatcher strMatcher14 = strTokenizer13.getTrimmerMatcher();
        org.apache.commons.lang3.text.StrTokenizer strTokenizer16 = strTokenizer13.setDelimiterString("");
        org.apache.commons.lang3.text.StrMatcher strMatcher17 = strTokenizer16.getTrimmerMatcher();
        org.apache.commons.lang3.text.StrMatcher strMatcher18 = strTokenizer16.getTrimmerMatcher();
        char[] charArray21 = new char[] { '4', ' ' };
        org.apache.commons.lang3.text.StrTokenizer strTokenizer24 = new org.apache.commons.lang3.text.StrTokenizer(charArray21, 'a', ' ');
        org.apache.commons.lang3.text.StrTokenizer strTokenizer25 = strTokenizer16.reset(charArray21);
        org.apache.commons.lang3.text.StrTokenizer strTokenizer27 = new org.apache.commons.lang3.text.StrTokenizer(charArray21, "");
        org.apache.commons.lang3.text.StrTokenizer strTokenizer28 = strTokenizer5.reset(charArray21);
        org.apache.commons.lang3.text.StrTokenizer strTokenizer30 = new org.apache.commons.lang3.text.StrTokenizer(charArray21, "StrTokenizer[4 ]");
        org.apache.commons.lang3.text.StrTokenizer strTokenizer31 = org.apache.commons.lang3.text.StrTokenizer.getTSVInstance(charArray21);
        org.junit.Assert.assertNotNull(charArray2);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray2), "4 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray2), "4 ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray2), "[4,  ]");
        org.junit.Assert.assertNotNull(strMatcher6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "4 " + "'", str7, "4 ");
        org.junit.Assert.assertNotNull(charArray10);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray10), "4 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray10), "4 ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray10), "[4,  ]");
        org.junit.Assert.assertNotNull(strMatcher14);
        org.junit.Assert.assertNotNull(strTokenizer16);
        org.junit.Assert.assertNotNull(strMatcher17);
        org.junit.Assert.assertNotNull(strMatcher18);
        org.junit.Assert.assertNotNull(charArray21);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray21), "4 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray21), "4 ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray21), "[4,  ]");
        org.junit.Assert.assertNotNull(strTokenizer25);
        org.junit.Assert.assertNotNull(strTokenizer28);
        org.junit.Assert.assertNotNull(strTokenizer31);
    }

    @Test
    public void test1557() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1557");
        char[] charArray3 = new char[] { '4', ' ' };
        org.apache.commons.lang3.text.StrTokenizer strTokenizer6 = new org.apache.commons.lang3.text.StrTokenizer(charArray3, 'a', ' ');
        org.apache.commons.lang3.text.StrTokenizer strTokenizer7 = org.apache.commons.lang3.text.StrTokenizer.getCSVInstance(charArray3);
        org.apache.commons.lang3.text.StrMatcher strMatcher8 = null;
        org.apache.commons.lang3.text.StrTokenizer strTokenizer9 = new org.apache.commons.lang3.text.StrTokenizer(charArray3, strMatcher8);
        char[] charArray10 = null;
        org.apache.commons.lang3.text.StrTokenizer strTokenizer12 = new org.apache.commons.lang3.text.StrTokenizer(charArray10, "");
        org.apache.commons.lang3.text.StrMatcher strMatcher13 = strTokenizer12.getQuoteMatcher();
        char[] charArray17 = new char[] { '4', ' ' };
        org.apache.commons.lang3.text.StrTokenizer strTokenizer20 = new org.apache.commons.lang3.text.StrTokenizer(charArray17, 'a', ' ');
        org.apache.commons.lang3.text.StrMatcher strMatcher21 = strTokenizer20.getTrimmerMatcher();
        org.apache.commons.lang3.text.StrTokenizer strTokenizer23 = strTokenizer20.setDelimiterString("");
        org.apache.commons.lang3.text.StrMatcher strMatcher24 = strTokenizer23.getTrimmerMatcher();
        org.apache.commons.lang3.text.StrTokenizer strTokenizer25 = new org.apache.commons.lang3.text.StrTokenizer("", strMatcher24);
        char[] charArray28 = new char[] { '4', ' ' };
        org.apache.commons.lang3.text.StrTokenizer strTokenizer31 = new org.apache.commons.lang3.text.StrTokenizer(charArray28, 'a', ' ');
        org.apache.commons.lang3.text.StrMatcher strMatcher32 = strTokenizer31.getTrimmerMatcher();
        org.apache.commons.lang3.text.StrMatcher strMatcher33 = strTokenizer31.getQuoteMatcher();
        org.apache.commons.lang3.text.StrTokenizer strTokenizer34 = strTokenizer25.setDelimiterMatcher(strMatcher33);
        org.apache.commons.lang3.text.StrTokenizer strTokenizer35 = new org.apache.commons.lang3.text.StrTokenizer(charArray3, strMatcher13, strMatcher33);
        char[] charArray38 = new char[] { '4', ' ' };
        org.apache.commons.lang3.text.StrTokenizer strTokenizer41 = new org.apache.commons.lang3.text.StrTokenizer(charArray38, 'a', ' ');
        org.apache.commons.lang3.text.StrTokenizer strTokenizer42 = org.apache.commons.lang3.text.StrTokenizer.getCSVInstance(charArray38);
        org.apache.commons.lang3.text.StrMatcher strMatcher43 = null;
        org.apache.commons.lang3.text.StrTokenizer strTokenizer44 = new org.apache.commons.lang3.text.StrTokenizer(charArray38, strMatcher43);
        char[] charArray45 = null;
        org.apache.commons.lang3.text.StrTokenizer strTokenizer47 = new org.apache.commons.lang3.text.StrTokenizer(charArray45, "");
        org.apache.commons.lang3.text.StrMatcher strMatcher48 = strTokenizer47.getQuoteMatcher();
        char[] charArray52 = new char[] { '4', ' ' };
        org.apache.commons.lang3.text.StrTokenizer strTokenizer55 = new org.apache.commons.lang3.text.StrTokenizer(charArray52, 'a', ' ');
        org.apache.commons.lang3.text.StrMatcher strMatcher56 = strTokenizer55.getTrimmerMatcher();
        org.apache.commons.lang3.text.StrTokenizer strTokenizer58 = strTokenizer55.setDelimiterString("");
        org.apache.commons.lang3.text.StrMatcher strMatcher59 = strTokenizer58.getTrimmerMatcher();
        org.apache.commons.lang3.text.StrTokenizer strTokenizer60 = new org.apache.commons.lang3.text.StrTokenizer("", strMatcher59);
        char[] charArray63 = new char[] { '4', ' ' };
        org.apache.commons.lang3.text.StrTokenizer strTokenizer66 = new org.apache.commons.lang3.text.StrTokenizer(charArray63, 'a', ' ');
        org.apache.commons.lang3.text.StrMatcher strMatcher67 = strTokenizer66.getTrimmerMatcher();
        org.apache.commons.lang3.text.StrMatcher strMatcher68 = strTokenizer66.getQuoteMatcher();
        org.apache.commons.lang3.text.StrTokenizer strTokenizer69 = strTokenizer60.setDelimiterMatcher(strMatcher68);
        org.apache.commons.lang3.text.StrTokenizer strTokenizer70 = new org.apache.commons.lang3.text.StrTokenizer(charArray38, strMatcher48, strMatcher68);
        org.apache.commons.lang3.text.StrTokenizer strTokenizer71 = new org.apache.commons.lang3.text.StrTokenizer("hi!", strMatcher33, strMatcher68);
        org.apache.commons.lang3.text.StrMatcher strMatcher72 = strTokenizer71.getQuoteMatcher();
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray3), "4 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray3), "4 ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray3), "[4,  ]");
        org.junit.Assert.assertNotNull(strTokenizer7);
        org.junit.Assert.assertNotNull(strMatcher13);
        org.junit.Assert.assertNotNull(charArray17);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray17), "4 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray17), "4 ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray17), "[4,  ]");
        org.junit.Assert.assertNotNull(strMatcher21);
        org.junit.Assert.assertNotNull(strTokenizer23);
        org.junit.Assert.assertNotNull(strMatcher24);
        org.junit.Assert.assertNotNull(charArray28);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray28), "4 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray28), "4 ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray28), "[4,  ]");
        org.junit.Assert.assertNotNull(strMatcher32);
        org.junit.Assert.assertNotNull(strMatcher33);
        org.junit.Assert.assertNotNull(strTokenizer34);
        org.junit.Assert.assertNotNull(charArray38);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray38), "4 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray38), "4 ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray38), "[4,  ]");
        org.junit.Assert.assertNotNull(strTokenizer42);
        org.junit.Assert.assertNotNull(strMatcher48);
        org.junit.Assert.assertNotNull(charArray52);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray52), "4 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray52), "4 ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray52), "[4,  ]");
        org.junit.Assert.assertNotNull(strMatcher56);
        org.junit.Assert.assertNotNull(strTokenizer58);
        org.junit.Assert.assertNotNull(strMatcher59);
        org.junit.Assert.assertNotNull(charArray63);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray63), "4 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray63), "4 ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray63), "[4,  ]");
        org.junit.Assert.assertNotNull(strMatcher67);
        org.junit.Assert.assertNotNull(strMatcher68);
        org.junit.Assert.assertNotNull(strTokenizer69);
        org.junit.Assert.assertNotNull(strMatcher72);
    }

    @Test
    public void test1558() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1558");
        org.apache.commons.lang3.text.StrTokenizer strTokenizer2 = new org.apache.commons.lang3.text.StrTokenizer("a#", "StrTokenizer[StrTokenizer[4, ]]");
    }

    @Test
    public void test1559() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1559");
        char[] charArray2 = new char[] { '4', ' ' };
        org.apache.commons.lang3.text.StrTokenizer strTokenizer5 = new org.apache.commons.lang3.text.StrTokenizer(charArray2, 'a', ' ');
        org.apache.commons.lang3.text.StrMatcher strMatcher6 = strTokenizer5.getTrimmerMatcher();
        org.apache.commons.lang3.text.StrTokenizer strTokenizer8 = strTokenizer5.setDelimiterString("");
        char[] charArray12 = new char[] { '4', ' ' };
        org.apache.commons.lang3.text.StrTokenizer strTokenizer15 = new org.apache.commons.lang3.text.StrTokenizer(charArray12, 'a', ' ');
        org.apache.commons.lang3.text.StrMatcher strMatcher16 = strTokenizer15.getTrimmerMatcher();
        org.apache.commons.lang3.text.StrTokenizer strTokenizer18 = strTokenizer15.setDelimiterString("");
        org.apache.commons.lang3.text.StrMatcher strMatcher19 = strTokenizer18.getTrimmerMatcher();
        org.apache.commons.lang3.text.StrTokenizer strTokenizer20 = new org.apache.commons.lang3.text.StrTokenizer("", strMatcher19);
        char[] charArray23 = new char[] { '4', ' ' };
        org.apache.commons.lang3.text.StrTokenizer strTokenizer26 = new org.apache.commons.lang3.text.StrTokenizer(charArray23, 'a', ' ');
        org.apache.commons.lang3.text.StrMatcher strMatcher27 = strTokenizer26.getTrimmerMatcher();
        org.apache.commons.lang3.text.StrTokenizer strTokenizer29 = strTokenizer26.setDelimiterString("");
        org.apache.commons.lang3.text.StrMatcher strMatcher30 = strTokenizer29.getTrimmerMatcher();
        org.apache.commons.lang3.text.StrTokenizer strTokenizer31 = strTokenizer20.setTrimmerMatcher(strMatcher30);
        org.apache.commons.lang3.text.StrTokenizer strTokenizer32 = strTokenizer8.setTrimmerMatcher(strMatcher30);
        java.lang.String str33 = strTokenizer8.getContent();
        char[] charArray36 = new char[] { '4', ' ' };
        org.apache.commons.lang3.text.StrTokenizer strTokenizer39 = new org.apache.commons.lang3.text.StrTokenizer(charArray36, 'a', ' ');
        org.apache.commons.lang3.text.StrTokenizer strTokenizer42 = new org.apache.commons.lang3.text.StrTokenizer(charArray36, '4', 'a');
        char[] charArray45 = new char[] { '4', ' ' };
        org.apache.commons.lang3.text.StrTokenizer strTokenizer48 = new org.apache.commons.lang3.text.StrTokenizer(charArray45, 'a', ' ');
        org.apache.commons.lang3.text.StrMatcher strMatcher49 = strTokenizer48.getTrimmerMatcher();
        org.apache.commons.lang3.text.StrMatcher strMatcher50 = strTokenizer48.getQuoteMatcher();
        org.apache.commons.lang3.text.StrTokenizer strTokenizer51 = new org.apache.commons.lang3.text.StrTokenizer(charArray36, strMatcher50);
        org.apache.commons.lang3.text.StrTokenizer strTokenizer52 = strTokenizer8.reset(charArray36);
        org.apache.commons.lang3.text.StrTokenizer strTokenizer55 = new org.apache.commons.lang3.text.StrTokenizer(charArray36, 'a', 'a');
        org.apache.commons.lang3.text.StrTokenizer strTokenizer58 = new org.apache.commons.lang3.text.StrTokenizer(charArray36, '#', 'a');
        org.apache.commons.lang3.text.StrTokenizer strTokenizer59 = org.apache.commons.lang3.text.StrTokenizer.getCSVInstance(charArray36);
        org.apache.commons.lang3.text.StrMatcher strMatcher60 = strTokenizer59.getIgnoredMatcher();
        org.junit.Assert.assertNotNull(charArray2);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray2), "4 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray2), "4 ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray2), "[4,  ]");
        org.junit.Assert.assertNotNull(strMatcher6);
        org.junit.Assert.assertNotNull(strTokenizer8);
        org.junit.Assert.assertNotNull(charArray12);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray12), "4 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray12), "4 ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray12), "[4,  ]");
        org.junit.Assert.assertNotNull(strMatcher16);
        org.junit.Assert.assertNotNull(strTokenizer18);
        org.junit.Assert.assertNotNull(strMatcher19);
        org.junit.Assert.assertNotNull(charArray23);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray23), "4 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray23), "4 ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray23), "[4,  ]");
        org.junit.Assert.assertNotNull(strMatcher27);
        org.junit.Assert.assertNotNull(strTokenizer29);
        org.junit.Assert.assertNotNull(strMatcher30);
        org.junit.Assert.assertNotNull(strTokenizer31);
        org.junit.Assert.assertNotNull(strTokenizer32);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "4 " + "'", str33, "4 ");
        org.junit.Assert.assertNotNull(charArray36);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray36), "4 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray36), "4 ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray36), "[4,  ]");
        org.junit.Assert.assertNotNull(charArray45);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray45), "4 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray45), "4 ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray45), "[4,  ]");
        org.junit.Assert.assertNotNull(strMatcher49);
        org.junit.Assert.assertNotNull(strMatcher50);
        org.junit.Assert.assertNotNull(strTokenizer52);
        org.junit.Assert.assertNotNull(strTokenizer59);
        org.junit.Assert.assertNotNull(strMatcher60);
    }

    @Test
    public void test1560() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1560");
        char[] charArray1 = new char[] { '#' };
        org.apache.commons.lang3.text.StrTokenizer strTokenizer2 = new org.apache.commons.lang3.text.StrTokenizer(charArray1);
        boolean boolean3 = strTokenizer2.hasPrevious();
        org.apache.commons.lang3.text.StrTokenizer strTokenizer5 = strTokenizer2.setIgnoreEmptyTokens(true);
        org.apache.commons.lang3.text.StrMatcher strMatcher6 = strTokenizer5.getQuoteMatcher();
        org.apache.commons.lang3.text.StrTokenizer strTokenizer8 = strTokenizer5.setIgnoreEmptyTokens(false);
        java.lang.String str9 = strTokenizer5.nextToken();
        org.junit.Assert.assertNotNull(charArray1);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray1), "#");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray1), "#");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray1), "[#]");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(strTokenizer5);
        org.junit.Assert.assertNotNull(strMatcher6);
        org.junit.Assert.assertNotNull(strTokenizer8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "#" + "'", str9, "#");
    }

    @Test
    public void test1561() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1561");
        org.apache.commons.lang3.text.StrTokenizer strTokenizer0 = org.apache.commons.lang3.text.StrTokenizer.getTSVInstance();
        java.lang.String str1 = strTokenizer0.getContent();
        // The following exception was thrown during execution in test generation
        try {
            strTokenizer0.add("#");
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: add() is unsupported");
        } catch (java.lang.UnsupportedOperationException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strTokenizer0);
        org.junit.Assert.assertNull(str1);
    }

    @Test
    public void test1562() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1562");
        char[] charArray2 = new char[] { '4', ' ' };
        org.apache.commons.lang3.text.StrTokenizer strTokenizer5 = new org.apache.commons.lang3.text.StrTokenizer(charArray2, 'a', ' ');
        org.apache.commons.lang3.text.StrTokenizer strTokenizer7 = new org.apache.commons.lang3.text.StrTokenizer(charArray2, "hi!");
        char[] charArray10 = new char[] { '4', ' ' };
        org.apache.commons.lang3.text.StrTokenizer strTokenizer13 = new org.apache.commons.lang3.text.StrTokenizer(charArray10, 'a', ' ');
        org.apache.commons.lang3.text.StrTokenizer strTokenizer14 = org.apache.commons.lang3.text.StrTokenizer.getCSVInstance(charArray10);
        org.apache.commons.lang3.text.StrMatcher strMatcher15 = null;
        org.apache.commons.lang3.text.StrTokenizer strTokenizer16 = new org.apache.commons.lang3.text.StrTokenizer(charArray10, strMatcher15);
        char[] charArray17 = null;
        org.apache.commons.lang3.text.StrTokenizer strTokenizer19 = new org.apache.commons.lang3.text.StrTokenizer(charArray17, "");
        org.apache.commons.lang3.text.StrMatcher strMatcher20 = strTokenizer19.getQuoteMatcher();
        char[] charArray24 = new char[] { '4', ' ' };
        org.apache.commons.lang3.text.StrTokenizer strTokenizer27 = new org.apache.commons.lang3.text.StrTokenizer(charArray24, 'a', ' ');
        org.apache.commons.lang3.text.StrMatcher strMatcher28 = strTokenizer27.getTrimmerMatcher();
        org.apache.commons.lang3.text.StrTokenizer strTokenizer30 = strTokenizer27.setDelimiterString("");
        org.apache.commons.lang3.text.StrMatcher strMatcher31 = strTokenizer30.getTrimmerMatcher();
        org.apache.commons.lang3.text.StrTokenizer strTokenizer32 = new org.apache.commons.lang3.text.StrTokenizer("", strMatcher31);
        char[] charArray35 = new char[] { '4', ' ' };
        org.apache.commons.lang3.text.StrTokenizer strTokenizer38 = new org.apache.commons.lang3.text.StrTokenizer(charArray35, 'a', ' ');
        org.apache.commons.lang3.text.StrMatcher strMatcher39 = strTokenizer38.getTrimmerMatcher();
        org.apache.commons.lang3.text.StrMatcher strMatcher40 = strTokenizer38.getQuoteMatcher();
        org.apache.commons.lang3.text.StrTokenizer strTokenizer41 = strTokenizer32.setDelimiterMatcher(strMatcher40);
        org.apache.commons.lang3.text.StrTokenizer strTokenizer42 = new org.apache.commons.lang3.text.StrTokenizer(charArray10, strMatcher20, strMatcher40);
        char[] charArray43 = null;
        org.apache.commons.lang3.text.StrTokenizer strTokenizer45 = new org.apache.commons.lang3.text.StrTokenizer(charArray43, "");
        java.lang.String str46 = strTokenizer45.getContent();
        org.apache.commons.lang3.text.StrMatcher strMatcher47 = strTokenizer45.getIgnoredMatcher();
        org.apache.commons.lang3.text.StrTokenizer strTokenizer48 = new org.apache.commons.lang3.text.StrTokenizer(charArray2, strMatcher20, strMatcher47);
        java.lang.String[] strArray49 = strTokenizer48.getTokenArray();
        org.junit.Assert.assertNotNull(charArray2);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray2), "4 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray2), "4 ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray2), "[4,  ]");
        org.junit.Assert.assertNotNull(charArray10);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray10), "4 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray10), "4 ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray10), "[4,  ]");
        org.junit.Assert.assertNotNull(strTokenizer14);
        org.junit.Assert.assertNotNull(strMatcher20);
        org.junit.Assert.assertNotNull(charArray24);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray24), "4 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray24), "4 ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray24), "[4,  ]");
        org.junit.Assert.assertNotNull(strMatcher28);
        org.junit.Assert.assertNotNull(strTokenizer30);
        org.junit.Assert.assertNotNull(strMatcher31);
        org.junit.Assert.assertNotNull(charArray35);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray35), "4 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray35), "4 ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray35), "[4,  ]");
        org.junit.Assert.assertNotNull(strMatcher39);
        org.junit.Assert.assertNotNull(strMatcher40);
        org.junit.Assert.assertNotNull(strTokenizer41);
        org.junit.Assert.assertNull(str46);
        org.junit.Assert.assertNotNull(strMatcher47);
        org.junit.Assert.assertNotNull(strArray49);
    }

    @Test
    public void test1563() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1563");
        char[] charArray2 = new char[] { '4', ' ' };
        org.apache.commons.lang3.text.StrTokenizer strTokenizer5 = new org.apache.commons.lang3.text.StrTokenizer(charArray2, 'a', ' ');
        org.apache.commons.lang3.text.StrMatcher strMatcher6 = strTokenizer5.getTrimmerMatcher();
        org.apache.commons.lang3.text.StrTokenizer strTokenizer8 = strTokenizer5.setDelimiterString("");
        char[] charArray12 = new char[] { '4', ' ' };
        org.apache.commons.lang3.text.StrTokenizer strTokenizer15 = new org.apache.commons.lang3.text.StrTokenizer(charArray12, 'a', ' ');
        org.apache.commons.lang3.text.StrMatcher strMatcher16 = strTokenizer15.getTrimmerMatcher();
        org.apache.commons.lang3.text.StrTokenizer strTokenizer18 = strTokenizer15.setDelimiterString("");
        org.apache.commons.lang3.text.StrMatcher strMatcher19 = strTokenizer18.getTrimmerMatcher();
        org.apache.commons.lang3.text.StrTokenizer strTokenizer20 = new org.apache.commons.lang3.text.StrTokenizer("", strMatcher19);
        char[] charArray23 = new char[] { '4', ' ' };
        org.apache.commons.lang3.text.StrTokenizer strTokenizer26 = new org.apache.commons.lang3.text.StrTokenizer(charArray23, 'a', ' ');
        org.apache.commons.lang3.text.StrMatcher strMatcher27 = strTokenizer26.getTrimmerMatcher();
        org.apache.commons.lang3.text.StrTokenizer strTokenizer29 = strTokenizer26.setDelimiterString("");
        org.apache.commons.lang3.text.StrMatcher strMatcher30 = strTokenizer29.getTrimmerMatcher();
        org.apache.commons.lang3.text.StrTokenizer strTokenizer31 = strTokenizer20.setTrimmerMatcher(strMatcher30);
        org.apache.commons.lang3.text.StrTokenizer strTokenizer32 = strTokenizer8.setTrimmerMatcher(strMatcher30);
        org.apache.commons.lang3.text.StrTokenizer strTokenizer34 = strTokenizer32.setDelimiterString("hi!");
        java.lang.String[] strArray35 = strTokenizer32.getTokenArray();
        org.junit.Assert.assertNotNull(charArray2);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray2), "4 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray2), "4 ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray2), "[4,  ]");
        org.junit.Assert.assertNotNull(strMatcher6);
        org.junit.Assert.assertNotNull(strTokenizer8);
        org.junit.Assert.assertNotNull(charArray12);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray12), "4 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray12), "4 ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray12), "[4,  ]");
        org.junit.Assert.assertNotNull(strMatcher16);
        org.junit.Assert.assertNotNull(strTokenizer18);
        org.junit.Assert.assertNotNull(strMatcher19);
        org.junit.Assert.assertNotNull(charArray23);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray23), "4 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray23), "4 ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray23), "[4,  ]");
        org.junit.Assert.assertNotNull(strMatcher27);
        org.junit.Assert.assertNotNull(strTokenizer29);
        org.junit.Assert.assertNotNull(strMatcher30);
        org.junit.Assert.assertNotNull(strTokenizer31);
        org.junit.Assert.assertNotNull(strTokenizer32);
        org.junit.Assert.assertNotNull(strTokenizer34);
        org.junit.Assert.assertNotNull(strArray35);
    }

    @Test
    public void test1564() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1564");
        char[] charArray2 = new char[] { '4', ' ' };
        org.apache.commons.lang3.text.StrTokenizer strTokenizer5 = new org.apache.commons.lang3.text.StrTokenizer(charArray2, 'a', ' ');
        org.apache.commons.lang3.text.StrMatcher strMatcher6 = strTokenizer5.getTrimmerMatcher();
        org.apache.commons.lang3.text.StrTokenizer strTokenizer8 = strTokenizer5.setDelimiterString("");
        char[] charArray12 = new char[] { '4', ' ' };
        org.apache.commons.lang3.text.StrTokenizer strTokenizer15 = new org.apache.commons.lang3.text.StrTokenizer(charArray12, 'a', ' ');
        org.apache.commons.lang3.text.StrMatcher strMatcher16 = strTokenizer15.getTrimmerMatcher();
        org.apache.commons.lang3.text.StrTokenizer strTokenizer18 = strTokenizer15.setDelimiterString("");
        org.apache.commons.lang3.text.StrMatcher strMatcher19 = strTokenizer18.getTrimmerMatcher();
        org.apache.commons.lang3.text.StrTokenizer strTokenizer20 = new org.apache.commons.lang3.text.StrTokenizer("", strMatcher19);
        char[] charArray23 = new char[] { '4', ' ' };
        org.apache.commons.lang3.text.StrTokenizer strTokenizer26 = new org.apache.commons.lang3.text.StrTokenizer(charArray23, 'a', ' ');
        org.apache.commons.lang3.text.StrMatcher strMatcher27 = strTokenizer26.getTrimmerMatcher();
        org.apache.commons.lang3.text.StrTokenizer strTokenizer29 = strTokenizer26.setDelimiterString("");
        org.apache.commons.lang3.text.StrMatcher strMatcher30 = strTokenizer29.getTrimmerMatcher();
        org.apache.commons.lang3.text.StrTokenizer strTokenizer31 = strTokenizer20.setTrimmerMatcher(strMatcher30);
        org.apache.commons.lang3.text.StrTokenizer strTokenizer32 = strTokenizer8.setTrimmerMatcher(strMatcher30);
        java.lang.String str33 = strTokenizer8.getContent();
        char[] charArray36 = new char[] { '4', ' ' };
        org.apache.commons.lang3.text.StrTokenizer strTokenizer39 = new org.apache.commons.lang3.text.StrTokenizer(charArray36, 'a', ' ');
        org.apache.commons.lang3.text.StrTokenizer strTokenizer42 = new org.apache.commons.lang3.text.StrTokenizer(charArray36, '4', 'a');
        char[] charArray45 = new char[] { '4', ' ' };
        org.apache.commons.lang3.text.StrTokenizer strTokenizer48 = new org.apache.commons.lang3.text.StrTokenizer(charArray45, 'a', ' ');
        org.apache.commons.lang3.text.StrMatcher strMatcher49 = strTokenizer48.getTrimmerMatcher();
        org.apache.commons.lang3.text.StrMatcher strMatcher50 = strTokenizer48.getQuoteMatcher();
        org.apache.commons.lang3.text.StrTokenizer strTokenizer51 = new org.apache.commons.lang3.text.StrTokenizer(charArray36, strMatcher50);
        org.apache.commons.lang3.text.StrTokenizer strTokenizer52 = strTokenizer8.reset(charArray36);
        org.apache.commons.lang3.text.StrMatcher strMatcher53 = strTokenizer52.getQuoteMatcher();
        char[] charArray56 = new char[] { '4', ' ' };
        org.apache.commons.lang3.text.StrTokenizer strTokenizer59 = new org.apache.commons.lang3.text.StrTokenizer(charArray56, 'a', ' ');
        org.apache.commons.lang3.text.StrTokenizer strTokenizer61 = new org.apache.commons.lang3.text.StrTokenizer(charArray56, "hi!");
        org.apache.commons.lang3.text.StrTokenizer strTokenizer62 = new org.apache.commons.lang3.text.StrTokenizer(charArray56);
        char[] charArray65 = new char[] { '4', ' ' };
        org.apache.commons.lang3.text.StrTokenizer strTokenizer68 = new org.apache.commons.lang3.text.StrTokenizer(charArray65, 'a', ' ');
        org.apache.commons.lang3.text.StrMatcher strMatcher69 = strTokenizer68.getTrimmerMatcher();
        org.apache.commons.lang3.text.StrTokenizer strTokenizer70 = strTokenizer62.setTrimmerMatcher(strMatcher69);
        org.apache.commons.lang3.text.StrTokenizer strTokenizer71 = strTokenizer52.setTrimmerMatcher(strMatcher69);
        char[] charArray75 = new char[] { '4', ' ' };
        org.apache.commons.lang3.text.StrTokenizer strTokenizer78 = new org.apache.commons.lang3.text.StrTokenizer(charArray75, 'a', ' ');
        org.apache.commons.lang3.text.StrMatcher strMatcher79 = strTokenizer78.getTrimmerMatcher();
        org.apache.commons.lang3.text.StrTokenizer strTokenizer80 = new org.apache.commons.lang3.text.StrTokenizer("4 ", strMatcher79);
        java.lang.String str81 = strTokenizer80.next();
        org.apache.commons.lang3.text.StrMatcher strMatcher82 = strTokenizer80.getTrimmerMatcher();
        org.apache.commons.lang3.text.StrTokenizer strTokenizer83 = strTokenizer71.setDelimiterMatcher(strMatcher82);
        org.junit.Assert.assertNotNull(charArray2);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray2), "4 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray2), "4 ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray2), "[4,  ]");
        org.junit.Assert.assertNotNull(strMatcher6);
        org.junit.Assert.assertNotNull(strTokenizer8);
        org.junit.Assert.assertNotNull(charArray12);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray12), "4 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray12), "4 ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray12), "[4,  ]");
        org.junit.Assert.assertNotNull(strMatcher16);
        org.junit.Assert.assertNotNull(strTokenizer18);
        org.junit.Assert.assertNotNull(strMatcher19);
        org.junit.Assert.assertNotNull(charArray23);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray23), "4 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray23), "4 ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray23), "[4,  ]");
        org.junit.Assert.assertNotNull(strMatcher27);
        org.junit.Assert.assertNotNull(strTokenizer29);
        org.junit.Assert.assertNotNull(strMatcher30);
        org.junit.Assert.assertNotNull(strTokenizer31);
        org.junit.Assert.assertNotNull(strTokenizer32);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "4 " + "'", str33, "4 ");
        org.junit.Assert.assertNotNull(charArray36);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray36), "4 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray36), "4 ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray36), "[4,  ]");
        org.junit.Assert.assertNotNull(charArray45);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray45), "4 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray45), "4 ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray45), "[4,  ]");
        org.junit.Assert.assertNotNull(strMatcher49);
        org.junit.Assert.assertNotNull(strMatcher50);
        org.junit.Assert.assertNotNull(strTokenizer52);
        org.junit.Assert.assertNotNull(strMatcher53);
        org.junit.Assert.assertNotNull(charArray56);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray56), "4 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray56), "4 ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray56), "[4,  ]");
        org.junit.Assert.assertNotNull(charArray65);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray65), "4 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray65), "4 ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray65), "[4,  ]");
        org.junit.Assert.assertNotNull(strMatcher69);
        org.junit.Assert.assertNotNull(strTokenizer70);
        org.junit.Assert.assertNotNull(strTokenizer71);
        org.junit.Assert.assertNotNull(charArray75);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray75), "4 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray75), "4 ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray75), "[4,  ]");
        org.junit.Assert.assertNotNull(strMatcher79);
        org.junit.Assert.assertEquals("'" + str81 + "' != '" + "4 " + "'", str81, "4 ");
        org.junit.Assert.assertNotNull(strMatcher82);
        org.junit.Assert.assertNotNull(strTokenizer83);
    }

    @Test
    public void test1565() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1565");
        org.apache.commons.lang3.text.StrTokenizer strTokenizer2 = new org.apache.commons.lang3.text.StrTokenizer("", "StrTokenizer[]");
        org.apache.commons.lang3.text.StrTokenizer strTokenizer4 = strTokenizer2.setDelimiterString("hi!");
        org.junit.Assert.assertNotNull(strTokenizer4);
    }

    @Test
    public void test1566() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1566");
        char[] charArray2 = new char[] { '4', ' ' };
        org.apache.commons.lang3.text.StrTokenizer strTokenizer5 = new org.apache.commons.lang3.text.StrTokenizer(charArray2, 'a', ' ');
        org.apache.commons.lang3.text.StrTokenizer strTokenizer7 = new org.apache.commons.lang3.text.StrTokenizer(charArray2, '#');
        java.lang.String str8 = strTokenizer7.nextToken();
        // The following exception was thrown during execution in test generation
        try {
            strTokenizer7.set("StrTokenizer[ ]");
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: set() is unsupported");
        } catch (java.lang.UnsupportedOperationException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray2);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray2), "4 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray2), "4 ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray2), "[4,  ]");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "4 " + "'", str8, "4 ");
    }

    @Test
    public void test1567() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1567");
        char[] charArray2 = new char[] { '4', ' ' };
        org.apache.commons.lang3.text.StrTokenizer strTokenizer5 = new org.apache.commons.lang3.text.StrTokenizer(charArray2, 'a', ' ');
        org.apache.commons.lang3.text.StrTokenizer strTokenizer6 = org.apache.commons.lang3.text.StrTokenizer.getCSVInstance(charArray2);
        org.apache.commons.lang3.text.StrMatcher strMatcher7 = null;
        org.apache.commons.lang3.text.StrTokenizer strTokenizer8 = new org.apache.commons.lang3.text.StrTokenizer(charArray2, strMatcher7);
        org.apache.commons.lang3.text.StrTokenizer strTokenizer10 = strTokenizer8.setIgnoreEmptyTokens(true);
        char[] charArray15 = new char[] { '4', ' ' };
        org.apache.commons.lang3.text.StrTokenizer strTokenizer18 = new org.apache.commons.lang3.text.StrTokenizer(charArray15, 'a', ' ');
        org.apache.commons.lang3.text.StrMatcher strMatcher19 = strTokenizer18.getTrimmerMatcher();
        org.apache.commons.lang3.text.StrTokenizer strTokenizer21 = strTokenizer18.setDelimiterString("");
        char[] charArray25 = new char[] { '4', ' ' };
        org.apache.commons.lang3.text.StrTokenizer strTokenizer28 = new org.apache.commons.lang3.text.StrTokenizer(charArray25, 'a', ' ');
        org.apache.commons.lang3.text.StrMatcher strMatcher29 = strTokenizer28.getTrimmerMatcher();
        org.apache.commons.lang3.text.StrTokenizer strTokenizer31 = strTokenizer28.setDelimiterString("");
        org.apache.commons.lang3.text.StrMatcher strMatcher32 = strTokenizer31.getTrimmerMatcher();
        org.apache.commons.lang3.text.StrTokenizer strTokenizer33 = new org.apache.commons.lang3.text.StrTokenizer("", strMatcher32);
        char[] charArray36 = new char[] { '4', ' ' };
        org.apache.commons.lang3.text.StrTokenizer strTokenizer39 = new org.apache.commons.lang3.text.StrTokenizer(charArray36, 'a', ' ');
        org.apache.commons.lang3.text.StrMatcher strMatcher40 = strTokenizer39.getTrimmerMatcher();
        org.apache.commons.lang3.text.StrTokenizer strTokenizer42 = strTokenizer39.setDelimiterString("");
        org.apache.commons.lang3.text.StrMatcher strMatcher43 = strTokenizer42.getTrimmerMatcher();
        org.apache.commons.lang3.text.StrTokenizer strTokenizer44 = strTokenizer33.setTrimmerMatcher(strMatcher43);
        org.apache.commons.lang3.text.StrTokenizer strTokenizer45 = strTokenizer21.setTrimmerMatcher(strMatcher43);
        org.apache.commons.lang3.text.StrMatcher strMatcher46 = strTokenizer21.getDelimiterMatcher();
        boolean boolean47 = strTokenizer21.isIgnoreEmptyTokens();
        org.apache.commons.lang3.text.StrMatcher strMatcher48 = strTokenizer21.getQuoteMatcher();
        char[] charArray49 = null;
        org.apache.commons.lang3.text.StrTokenizer strTokenizer51 = new org.apache.commons.lang3.text.StrTokenizer(charArray49, "");
        java.lang.String str52 = strTokenizer51.getContent();
        org.apache.commons.lang3.text.StrMatcher strMatcher53 = strTokenizer51.getTrimmerMatcher();
        org.apache.commons.lang3.text.StrTokenizer strTokenizer54 = new org.apache.commons.lang3.text.StrTokenizer("4 ", strMatcher48, strMatcher53);
        org.apache.commons.lang3.text.StrTokenizer strTokenizer55 = new org.apache.commons.lang3.text.StrTokenizer("hi!", strMatcher53);
        char[] charArray58 = new char[] { '4', ' ' };
        org.apache.commons.lang3.text.StrTokenizer strTokenizer61 = new org.apache.commons.lang3.text.StrTokenizer(charArray58, 'a', ' ');
        org.apache.commons.lang3.text.StrTokenizer strTokenizer62 = org.apache.commons.lang3.text.StrTokenizer.getCSVInstance(charArray58);
        org.apache.commons.lang3.text.StrTokenizer strTokenizer63 = org.apache.commons.lang3.text.StrTokenizer.getCSVInstance(charArray58);
        org.apache.commons.lang3.text.StrTokenizer strTokenizer64 = new org.apache.commons.lang3.text.StrTokenizer(charArray58);
        org.apache.commons.lang3.text.StrTokenizer strTokenizer66 = new org.apache.commons.lang3.text.StrTokenizer(charArray58, "StrTokenizer[4 ]");
        org.apache.commons.lang3.text.StrTokenizer strTokenizer67 = strTokenizer55.reset(charArray58);
        org.apache.commons.lang3.text.StrTokenizer strTokenizer70 = new org.apache.commons.lang3.text.StrTokenizer(charArray58, '4', '4');
        org.apache.commons.lang3.text.StrTokenizer strTokenizer71 = strTokenizer10.reset(charArray58);
        java.lang.String str72 = strTokenizer71.next();
        org.junit.Assert.assertNotNull(charArray2);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray2), "4 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray2), "4 ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray2), "[4,  ]");
        org.junit.Assert.assertNotNull(strTokenizer6);
        org.junit.Assert.assertNotNull(strTokenizer10);
        org.junit.Assert.assertNotNull(charArray15);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray15), "4 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray15), "4 ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray15), "[4,  ]");
        org.junit.Assert.assertNotNull(strMatcher19);
        org.junit.Assert.assertNotNull(strTokenizer21);
        org.junit.Assert.assertNotNull(charArray25);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray25), "4 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray25), "4 ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray25), "[4,  ]");
        org.junit.Assert.assertNotNull(strMatcher29);
        org.junit.Assert.assertNotNull(strTokenizer31);
        org.junit.Assert.assertNotNull(strMatcher32);
        org.junit.Assert.assertNotNull(charArray36);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray36), "4 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray36), "4 ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray36), "[4,  ]");
        org.junit.Assert.assertNotNull(strMatcher40);
        org.junit.Assert.assertNotNull(strTokenizer42);
        org.junit.Assert.assertNotNull(strMatcher43);
        org.junit.Assert.assertNotNull(strTokenizer44);
        org.junit.Assert.assertNotNull(strTokenizer45);
        org.junit.Assert.assertNotNull(strMatcher46);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + true + "'", boolean47 == true);
        org.junit.Assert.assertNotNull(strMatcher48);
        org.junit.Assert.assertNull(str52);
        org.junit.Assert.assertNotNull(strMatcher53);
        org.junit.Assert.assertNotNull(charArray58);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray58), "4 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray58), "4 ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray58), "[4,  ]");
        org.junit.Assert.assertNotNull(strTokenizer62);
        org.junit.Assert.assertNotNull(strTokenizer63);
        org.junit.Assert.assertNotNull(strTokenizer67);
        org.junit.Assert.assertNotNull(strTokenizer71);
        org.junit.Assert.assertEquals("'" + str72 + "' != '" + "4 " + "'", str72, "4 ");
    }

    @Test
    public void test1568() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1568");
        char[] charArray2 = new char[] { '4', ' ' };
        org.apache.commons.lang3.text.StrTokenizer strTokenizer5 = new org.apache.commons.lang3.text.StrTokenizer(charArray2, 'a', ' ');
        org.apache.commons.lang3.text.StrMatcher strMatcher6 = strTokenizer5.getTrimmerMatcher();
        org.apache.commons.lang3.text.StrMatcher strMatcher7 = strTokenizer5.getQuoteMatcher();
        char[] charArray10 = new char[] { '4', ' ' };
        org.apache.commons.lang3.text.StrTokenizer strTokenizer13 = new org.apache.commons.lang3.text.StrTokenizer(charArray10, 'a', ' ');
        org.apache.commons.lang3.text.StrMatcher strMatcher14 = strTokenizer13.getTrimmerMatcher();
        char[] charArray17 = new char[] { '4', ' ' };
        org.apache.commons.lang3.text.StrTokenizer strTokenizer20 = new org.apache.commons.lang3.text.StrTokenizer(charArray17, 'a', ' ');
        org.apache.commons.lang3.text.StrTokenizer strTokenizer21 = org.apache.commons.lang3.text.StrTokenizer.getCSVInstance(charArray17);
        org.apache.commons.lang3.text.StrMatcher strMatcher22 = null;
        org.apache.commons.lang3.text.StrTokenizer strTokenizer23 = new org.apache.commons.lang3.text.StrTokenizer(charArray17, strMatcher22);
        org.apache.commons.lang3.text.StrTokenizer strTokenizer24 = strTokenizer13.reset(charArray17);
        org.apache.commons.lang3.text.StrTokenizer strTokenizer25 = org.apache.commons.lang3.text.StrTokenizer.getCSVInstance(charArray17);
        char[] charArray28 = new char[] { '4', ' ' };
        org.apache.commons.lang3.text.StrTokenizer strTokenizer31 = new org.apache.commons.lang3.text.StrTokenizer(charArray28, 'a', ' ');
        org.apache.commons.lang3.text.StrMatcher strMatcher32 = strTokenizer31.getTrimmerMatcher();
        org.apache.commons.lang3.text.StrTokenizer strTokenizer34 = strTokenizer31.setDelimiterString("");
        char[] charArray38 = new char[] { '4', ' ' };
        org.apache.commons.lang3.text.StrTokenizer strTokenizer41 = new org.apache.commons.lang3.text.StrTokenizer(charArray38, 'a', ' ');
        org.apache.commons.lang3.text.StrMatcher strMatcher42 = strTokenizer41.getTrimmerMatcher();
        org.apache.commons.lang3.text.StrTokenizer strTokenizer44 = strTokenizer41.setDelimiterString("");
        org.apache.commons.lang3.text.StrMatcher strMatcher45 = strTokenizer44.getTrimmerMatcher();
        org.apache.commons.lang3.text.StrTokenizer strTokenizer46 = new org.apache.commons.lang3.text.StrTokenizer("", strMatcher45);
        char[] charArray49 = new char[] { '4', ' ' };
        org.apache.commons.lang3.text.StrTokenizer strTokenizer52 = new org.apache.commons.lang3.text.StrTokenizer(charArray49, 'a', ' ');
        org.apache.commons.lang3.text.StrMatcher strMatcher53 = strTokenizer52.getTrimmerMatcher();
        org.apache.commons.lang3.text.StrTokenizer strTokenizer55 = strTokenizer52.setDelimiterString("");
        org.apache.commons.lang3.text.StrMatcher strMatcher56 = strTokenizer55.getTrimmerMatcher();
        org.apache.commons.lang3.text.StrTokenizer strTokenizer57 = strTokenizer46.setTrimmerMatcher(strMatcher56);
        org.apache.commons.lang3.text.StrTokenizer strTokenizer58 = strTokenizer34.setTrimmerMatcher(strMatcher56);
        org.apache.commons.lang3.text.StrMatcher strMatcher59 = strTokenizer34.getDelimiterMatcher();
        char[] charArray62 = new char[] { '4', ' ' };
        org.apache.commons.lang3.text.StrTokenizer strTokenizer65 = new org.apache.commons.lang3.text.StrTokenizer(charArray62, 'a', ' ');
        org.apache.commons.lang3.text.StrMatcher strMatcher66 = strTokenizer65.getTrimmerMatcher();
        org.apache.commons.lang3.text.StrTokenizer strTokenizer68 = strTokenizer65.setDelimiterString("");
        org.apache.commons.lang3.text.StrMatcher strMatcher69 = strTokenizer68.getTrimmerMatcher();
        org.apache.commons.lang3.text.StrTokenizer strTokenizer70 = new org.apache.commons.lang3.text.StrTokenizer(charArray17, strMatcher59, strMatcher69);
        org.apache.commons.lang3.text.StrTokenizer strTokenizer71 = strTokenizer5.setIgnoredMatcher(strMatcher69);
        org.apache.commons.lang3.text.StrTokenizer strTokenizer73 = strTokenizer71.setIgnoreEmptyTokens(false);
        org.apache.commons.lang3.text.StrTokenizer strTokenizer75 = strTokenizer71.setEmptyTokenAsNull(false);
        org.apache.commons.lang3.text.StrTokenizer strTokenizer76 = strTokenizer75.reset();
        // The following exception was thrown during execution in test generation
        try {
            strTokenizer75.add("StrTokenizer[4]");
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: add() is unsupported");
        } catch (java.lang.UnsupportedOperationException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray2);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray2), "4 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray2), "4 ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray2), "[4,  ]");
        org.junit.Assert.assertNotNull(strMatcher6);
        org.junit.Assert.assertNotNull(strMatcher7);
        org.junit.Assert.assertNotNull(charArray10);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray10), "4 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray10), "4 ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray10), "[4,  ]");
        org.junit.Assert.assertNotNull(strMatcher14);
        org.junit.Assert.assertNotNull(charArray17);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray17), "4 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray17), "4 ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray17), "[4,  ]");
        org.junit.Assert.assertNotNull(strTokenizer21);
        org.junit.Assert.assertNotNull(strTokenizer24);
        org.junit.Assert.assertNotNull(strTokenizer25);
        org.junit.Assert.assertNotNull(charArray28);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray28), "4 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray28), "4 ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray28), "[4,  ]");
        org.junit.Assert.assertNotNull(strMatcher32);
        org.junit.Assert.assertNotNull(strTokenizer34);
        org.junit.Assert.assertNotNull(charArray38);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray38), "4 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray38), "4 ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray38), "[4,  ]");
        org.junit.Assert.assertNotNull(strMatcher42);
        org.junit.Assert.assertNotNull(strTokenizer44);
        org.junit.Assert.assertNotNull(strMatcher45);
        org.junit.Assert.assertNotNull(charArray49);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray49), "4 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray49), "4 ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray49), "[4,  ]");
        org.junit.Assert.assertNotNull(strMatcher53);
        org.junit.Assert.assertNotNull(strTokenizer55);
        org.junit.Assert.assertNotNull(strMatcher56);
        org.junit.Assert.assertNotNull(strTokenizer57);
        org.junit.Assert.assertNotNull(strTokenizer58);
        org.junit.Assert.assertNotNull(strMatcher59);
        org.junit.Assert.assertNotNull(charArray62);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray62), "4 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray62), "4 ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray62), "[4,  ]");
        org.junit.Assert.assertNotNull(strMatcher66);
        org.junit.Assert.assertNotNull(strTokenizer68);
        org.junit.Assert.assertNotNull(strMatcher69);
        org.junit.Assert.assertNotNull(strTokenizer71);
        org.junit.Assert.assertNotNull(strTokenizer73);
        org.junit.Assert.assertNotNull(strTokenizer75);
        org.junit.Assert.assertNotNull(strTokenizer76);
    }

    @Test
    public void test1569() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1569");
        char[] charArray2 = new char[] { '4', ' ' };
        org.apache.commons.lang3.text.StrTokenizer strTokenizer5 = new org.apache.commons.lang3.text.StrTokenizer(charArray2, 'a', ' ');
        org.apache.commons.lang3.text.StrTokenizer strTokenizer6 = org.apache.commons.lang3.text.StrTokenizer.getTSVInstance(charArray2);
        java.lang.String str7 = strTokenizer6.toString();
        java.lang.Class<?> wildcardClass8 = strTokenizer6.getClass();
        org.junit.Assert.assertNotNull(charArray2);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray2), "4 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray2), "4 ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray2), "[4,  ]");
        org.junit.Assert.assertNotNull(strTokenizer6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "StrTokenizer[not tokenized yet]" + "'", str7, "StrTokenizer[not tokenized yet]");
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test1570() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1570");
        char[] charArray2 = new char[] { '4', ' ' };
        org.apache.commons.lang3.text.StrTokenizer strTokenizer5 = new org.apache.commons.lang3.text.StrTokenizer(charArray2, 'a', ' ');
        org.apache.commons.lang3.text.StrTokenizer strTokenizer6 = org.apache.commons.lang3.text.StrTokenizer.getCSVInstance(charArray2);
        char[] charArray9 = null;
        org.apache.commons.lang3.text.StrTokenizer strTokenizer11 = new org.apache.commons.lang3.text.StrTokenizer(charArray9, "");
        java.lang.String str12 = strTokenizer11.getContent();
        org.apache.commons.lang3.text.StrMatcher strMatcher13 = strTokenizer11.getDelimiterMatcher();
        org.apache.commons.lang3.text.StrTokenizer strTokenizer14 = new org.apache.commons.lang3.text.StrTokenizer("StrTokenizer[4 ]", strMatcher13);
        org.apache.commons.lang3.text.StrMatcher strMatcher15 = null;
        org.apache.commons.lang3.text.StrTokenizer strTokenizer16 = new org.apache.commons.lang3.text.StrTokenizer("StrTokenizer[not tokenized yet]", strMatcher13, strMatcher15);
        char[] charArray20 = null;
        org.apache.commons.lang3.text.StrTokenizer strTokenizer22 = new org.apache.commons.lang3.text.StrTokenizer(charArray20, "");
        java.lang.String str23 = strTokenizer22.getContent();
        org.apache.commons.lang3.text.StrMatcher strMatcher24 = strTokenizer22.getDelimiterMatcher();
        org.apache.commons.lang3.text.StrTokenizer strTokenizer25 = new org.apache.commons.lang3.text.StrTokenizer("StrTokenizer[4 ]", strMatcher24);
        org.apache.commons.lang3.text.StrMatcher strMatcher26 = null;
        org.apache.commons.lang3.text.StrTokenizer strTokenizer27 = new org.apache.commons.lang3.text.StrTokenizer("StrTokenizer[not tokenized yet]", strMatcher24, strMatcher26);
        char[] charArray29 = null;
        org.apache.commons.lang3.text.StrTokenizer strTokenizer31 = new org.apache.commons.lang3.text.StrTokenizer(charArray29, "");
        java.lang.String str32 = strTokenizer31.getContent();
        org.apache.commons.lang3.text.StrMatcher strMatcher33 = strTokenizer31.getDelimiterMatcher();
        org.apache.commons.lang3.text.StrTokenizer strTokenizer34 = new org.apache.commons.lang3.text.StrTokenizer("hi!", strMatcher33);
        org.apache.commons.lang3.text.StrTokenizer strTokenizer35 = new org.apache.commons.lang3.text.StrTokenizer("4", strMatcher24, strMatcher33);
        org.apache.commons.lang3.text.StrTokenizer strTokenizer36 = new org.apache.commons.lang3.text.StrTokenizer(charArray2, strMatcher13, strMatcher24);
        org.apache.commons.lang3.text.StrTokenizer strTokenizer37 = org.apache.commons.lang3.text.StrTokenizer.getTSVInstance(charArray2);
        org.apache.commons.lang3.text.StrMatcher strMatcher38 = strTokenizer37.getTrimmerMatcher();
        org.junit.Assert.assertNotNull(charArray2);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray2), "4 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray2), "4 ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray2), "[4,  ]");
        org.junit.Assert.assertNotNull(strTokenizer6);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNotNull(strMatcher13);
        org.junit.Assert.assertNull(str23);
        org.junit.Assert.assertNotNull(strMatcher24);
        org.junit.Assert.assertNull(str32);
        org.junit.Assert.assertNotNull(strMatcher33);
        org.junit.Assert.assertNotNull(strTokenizer37);
        org.junit.Assert.assertNotNull(strMatcher38);
    }

    @Test
    public void test1571() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1571");
        org.apache.commons.lang3.text.StrTokenizer strTokenizer3 = new org.apache.commons.lang3.text.StrTokenizer("StrTokenizer[not tokenized yet]", 'a', ' ');
        // The following exception was thrown during execution in test generation
        try {
            strTokenizer3.remove();
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: remove() is unsupported");
        } catch (java.lang.UnsupportedOperationException e) {
        // Expected exception.
        }
    }

    @Test
    public void test1572() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1572");
        char[] charArray2 = new char[] { '4', ' ' };
        org.apache.commons.lang3.text.StrTokenizer strTokenizer5 = new org.apache.commons.lang3.text.StrTokenizer(charArray2, 'a', ' ');
        org.apache.commons.lang3.text.StrTokenizer strTokenizer6 = org.apache.commons.lang3.text.StrTokenizer.getCSVInstance(charArray2);
        org.apache.commons.lang3.text.StrTokenizer strTokenizer7 = org.apache.commons.lang3.text.StrTokenizer.getCSVInstance(charArray2);
        org.apache.commons.lang3.text.StrTokenizer strTokenizer8 = new org.apache.commons.lang3.text.StrTokenizer(charArray2);
        char[] charArray11 = new char[] { '4', ' ' };
        org.apache.commons.lang3.text.StrTokenizer strTokenizer14 = new org.apache.commons.lang3.text.StrTokenizer(charArray11, 'a', ' ');
        org.apache.commons.lang3.text.StrMatcher strMatcher15 = strTokenizer14.getTrimmerMatcher();
        java.lang.String str16 = strTokenizer14.nextToken();
        char[] charArray19 = new char[] { '4', ' ' };
        org.apache.commons.lang3.text.StrTokenizer strTokenizer22 = new org.apache.commons.lang3.text.StrTokenizer(charArray19, 'a', ' ');
        org.apache.commons.lang3.text.StrMatcher strMatcher23 = strTokenizer22.getTrimmerMatcher();
        org.apache.commons.lang3.text.StrTokenizer strTokenizer25 = strTokenizer22.setDelimiterString("");
        org.apache.commons.lang3.text.StrMatcher strMatcher26 = strTokenizer25.getTrimmerMatcher();
        org.apache.commons.lang3.text.StrMatcher strMatcher27 = strTokenizer25.getTrimmerMatcher();
        char[] charArray30 = new char[] { '4', ' ' };
        org.apache.commons.lang3.text.StrTokenizer strTokenizer33 = new org.apache.commons.lang3.text.StrTokenizer(charArray30, 'a', ' ');
        org.apache.commons.lang3.text.StrTokenizer strTokenizer34 = strTokenizer25.reset(charArray30);
        org.apache.commons.lang3.text.StrTokenizer strTokenizer36 = new org.apache.commons.lang3.text.StrTokenizer(charArray30, "");
        org.apache.commons.lang3.text.StrTokenizer strTokenizer37 = strTokenizer14.reset(charArray30);
        org.apache.commons.lang3.text.StrMatcher strMatcher38 = strTokenizer37.getDelimiterMatcher();
        java.util.List<java.lang.String> strList39 = strTokenizer37.getTokenList();
        char[] charArray42 = new char[] { '4', ' ' };
        org.apache.commons.lang3.text.StrTokenizer strTokenizer45 = new org.apache.commons.lang3.text.StrTokenizer(charArray42, 'a', ' ');
        char[] charArray48 = new char[] { '4', ' ' };
        org.apache.commons.lang3.text.StrTokenizer strTokenizer51 = new org.apache.commons.lang3.text.StrTokenizer(charArray48, 'a', ' ');
        org.apache.commons.lang3.text.StrMatcher strMatcher52 = strTokenizer51.getTrimmerMatcher();
        org.apache.commons.lang3.text.StrTokenizer strTokenizer54 = strTokenizer51.setDelimiterString("");
        org.apache.commons.lang3.text.StrMatcher strMatcher55 = strTokenizer54.getTrimmerMatcher();
        org.apache.commons.lang3.text.StrMatcher strMatcher56 = strTokenizer54.getTrimmerMatcher();
        char[] charArray58 = null;
        org.apache.commons.lang3.text.StrTokenizer strTokenizer60 = new org.apache.commons.lang3.text.StrTokenizer(charArray58, "");
        java.lang.String str61 = strTokenizer60.getContent();
        org.apache.commons.lang3.text.StrMatcher strMatcher62 = strTokenizer60.getDelimiterMatcher();
        org.apache.commons.lang3.text.StrTokenizer strTokenizer63 = new org.apache.commons.lang3.text.StrTokenizer("hi!", strMatcher62);
        org.apache.commons.lang3.text.StrTokenizer strTokenizer64 = new org.apache.commons.lang3.text.StrTokenizer(charArray42, strMatcher56, strMatcher62);
        org.apache.commons.lang3.text.StrTokenizer strTokenizer65 = strTokenizer37.setQuoteMatcher(strMatcher62);
        char[] charArray68 = new char[] { '4', ' ' };
        org.apache.commons.lang3.text.StrTokenizer strTokenizer71 = new org.apache.commons.lang3.text.StrTokenizer(charArray68, 'a', ' ');
        org.apache.commons.lang3.text.StrMatcher strMatcher72 = strTokenizer71.getTrimmerMatcher();
        char[] charArray75 = new char[] { '4', ' ' };
        org.apache.commons.lang3.text.StrTokenizer strTokenizer78 = new org.apache.commons.lang3.text.StrTokenizer(charArray75, 'a', ' ');
        org.apache.commons.lang3.text.StrTokenizer strTokenizer79 = org.apache.commons.lang3.text.StrTokenizer.getCSVInstance(charArray75);
        org.apache.commons.lang3.text.StrMatcher strMatcher80 = null;
        org.apache.commons.lang3.text.StrTokenizer strTokenizer81 = new org.apache.commons.lang3.text.StrTokenizer(charArray75, strMatcher80);
        org.apache.commons.lang3.text.StrTokenizer strTokenizer82 = strTokenizer71.reset(charArray75);
        java.lang.Object obj83 = strTokenizer71.clone();
        boolean boolean84 = strTokenizer71.hasNext();
        org.apache.commons.lang3.text.StrMatcher strMatcher85 = strTokenizer71.getTrimmerMatcher();
        org.apache.commons.lang3.text.StrTokenizer strTokenizer86 = strTokenizer37.setTrimmerMatcher(strMatcher85);
        org.apache.commons.lang3.text.StrTokenizer strTokenizer87 = new org.apache.commons.lang3.text.StrTokenizer(charArray2, strMatcher85);
        org.apache.commons.lang3.text.StrTokenizer strTokenizer89 = strTokenizer87.setDelimiterString("");
        org.apache.commons.lang3.text.StrTokenizer strTokenizer91 = strTokenizer87.setQuoteChar(' ');
        boolean boolean92 = strTokenizer91.hasNext();
        org.junit.Assert.assertNotNull(charArray2);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray2), "4 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray2), "4 ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray2), "[4,  ]");
        org.junit.Assert.assertNotNull(strTokenizer6);
        org.junit.Assert.assertNotNull(strTokenizer7);
        org.junit.Assert.assertNotNull(charArray11);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray11), "4 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray11), "4 ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray11), "[4,  ]");
        org.junit.Assert.assertNotNull(strMatcher15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "4 " + "'", str16, "4 ");
        org.junit.Assert.assertNotNull(charArray19);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray19), "4 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray19), "4 ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray19), "[4,  ]");
        org.junit.Assert.assertNotNull(strMatcher23);
        org.junit.Assert.assertNotNull(strTokenizer25);
        org.junit.Assert.assertNotNull(strMatcher26);
        org.junit.Assert.assertNotNull(strMatcher27);
        org.junit.Assert.assertNotNull(charArray30);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray30), "4 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray30), "4 ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray30), "[4,  ]");
        org.junit.Assert.assertNotNull(strTokenizer34);
        org.junit.Assert.assertNotNull(strTokenizer37);
        org.junit.Assert.assertNotNull(strMatcher38);
        org.junit.Assert.assertNotNull(strList39);
        org.junit.Assert.assertNotNull(charArray42);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray42), "4 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray42), "4 ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray42), "[4,  ]");
        org.junit.Assert.assertNotNull(charArray48);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray48), "4 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray48), "4 ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray48), "[4,  ]");
        org.junit.Assert.assertNotNull(strMatcher52);
        org.junit.Assert.assertNotNull(strTokenizer54);
        org.junit.Assert.assertNotNull(strMatcher55);
        org.junit.Assert.assertNotNull(strMatcher56);
        org.junit.Assert.assertNull(str61);
        org.junit.Assert.assertNotNull(strMatcher62);
        org.junit.Assert.assertNotNull(strTokenizer65);
        org.junit.Assert.assertNotNull(charArray68);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray68), "4 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray68), "4 ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray68), "[4,  ]");
        org.junit.Assert.assertNotNull(strMatcher72);
        org.junit.Assert.assertNotNull(charArray75);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray75), "4 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray75), "4 ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray75), "[4,  ]");
        org.junit.Assert.assertNotNull(strTokenizer79);
        org.junit.Assert.assertNotNull(strTokenizer82);
        org.junit.Assert.assertNotNull(obj83);
        org.junit.Assert.assertEquals(obj83.toString(), "StrTokenizer[not tokenized yet]");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj83), "StrTokenizer[not tokenized yet]");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj83), "StrTokenizer[not tokenized yet]");
        org.junit.Assert.assertTrue("'" + boolean84 + "' != '" + true + "'", boolean84 == true);
        org.junit.Assert.assertNotNull(strMatcher85);
        org.junit.Assert.assertNotNull(strTokenizer86);
        org.junit.Assert.assertNotNull(strTokenizer89);
        org.junit.Assert.assertNotNull(strTokenizer91);
        org.junit.Assert.assertTrue("'" + boolean92 + "' != '" + true + "'", boolean92 == true);
    }

    @Test
    public void test1573() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1573");
        char[] charArray5 = new char[] { '4', ' ' };
        org.apache.commons.lang3.text.StrTokenizer strTokenizer8 = new org.apache.commons.lang3.text.StrTokenizer(charArray5, 'a', ' ');
        org.apache.commons.lang3.text.StrMatcher strMatcher9 = strTokenizer8.getTrimmerMatcher();
        org.apache.commons.lang3.text.StrTokenizer strTokenizer11 = strTokenizer8.setDelimiterString("");
        org.apache.commons.lang3.text.StrMatcher strMatcher12 = strTokenizer11.getTrimmerMatcher();
        org.apache.commons.lang3.text.StrTokenizer strTokenizer13 = new org.apache.commons.lang3.text.StrTokenizer("", strMatcher12);
        char[] charArray16 = new char[] { '4', ' ' };
        org.apache.commons.lang3.text.StrTokenizer strTokenizer19 = new org.apache.commons.lang3.text.StrTokenizer(charArray16, 'a', ' ');
        org.apache.commons.lang3.text.StrMatcher strMatcher20 = strTokenizer19.getTrimmerMatcher();
        org.apache.commons.lang3.text.StrTokenizer strTokenizer22 = strTokenizer19.setDelimiterString("");
        org.apache.commons.lang3.text.StrMatcher strMatcher23 = strTokenizer22.getTrimmerMatcher();
        org.apache.commons.lang3.text.StrTokenizer strTokenizer24 = strTokenizer13.setTrimmerMatcher(strMatcher23);
        char[] charArray27 = new char[] { '4', ' ' };
        org.apache.commons.lang3.text.StrTokenizer strTokenizer30 = new org.apache.commons.lang3.text.StrTokenizer(charArray27, 'a', ' ');
        org.apache.commons.lang3.text.StrMatcher strMatcher31 = strTokenizer30.getTrimmerMatcher();
        org.apache.commons.lang3.text.StrTokenizer strTokenizer33 = strTokenizer30.setDelimiterString("");
        char[] charArray37 = new char[] { '4', ' ' };
        org.apache.commons.lang3.text.StrTokenizer strTokenizer40 = new org.apache.commons.lang3.text.StrTokenizer(charArray37, 'a', ' ');
        org.apache.commons.lang3.text.StrMatcher strMatcher41 = strTokenizer40.getTrimmerMatcher();
        org.apache.commons.lang3.text.StrTokenizer strTokenizer43 = strTokenizer40.setDelimiterString("");
        org.apache.commons.lang3.text.StrMatcher strMatcher44 = strTokenizer43.getTrimmerMatcher();
        org.apache.commons.lang3.text.StrTokenizer strTokenizer45 = new org.apache.commons.lang3.text.StrTokenizer("", strMatcher44);
        char[] charArray48 = new char[] { '4', ' ' };
        org.apache.commons.lang3.text.StrTokenizer strTokenizer51 = new org.apache.commons.lang3.text.StrTokenizer(charArray48, 'a', ' ');
        org.apache.commons.lang3.text.StrMatcher strMatcher52 = strTokenizer51.getTrimmerMatcher();
        org.apache.commons.lang3.text.StrTokenizer strTokenizer54 = strTokenizer51.setDelimiterString("");
        org.apache.commons.lang3.text.StrMatcher strMatcher55 = strTokenizer54.getTrimmerMatcher();
        org.apache.commons.lang3.text.StrTokenizer strTokenizer56 = strTokenizer45.setTrimmerMatcher(strMatcher55);
        org.apache.commons.lang3.text.StrTokenizer strTokenizer57 = strTokenizer33.setTrimmerMatcher(strMatcher55);
        org.apache.commons.lang3.text.StrTokenizer strTokenizer58 = new org.apache.commons.lang3.text.StrTokenizer("4 ", strMatcher23, strMatcher55);
        org.apache.commons.lang3.text.StrTokenizer strTokenizer59 = new org.apache.commons.lang3.text.StrTokenizer("", strMatcher55);
        org.apache.commons.lang3.text.StrTokenizer strTokenizer62 = new org.apache.commons.lang3.text.StrTokenizer("4", 'a');
        char[] charArray65 = new char[] { '4', ' ' };
        org.apache.commons.lang3.text.StrTokenizer strTokenizer68 = new org.apache.commons.lang3.text.StrTokenizer(charArray65, 'a', ' ');
        org.apache.commons.lang3.text.StrTokenizer strTokenizer69 = org.apache.commons.lang3.text.StrTokenizer.getTSVInstance(charArray65);
        org.apache.commons.lang3.text.StrTokenizer strTokenizer72 = new org.apache.commons.lang3.text.StrTokenizer(charArray65, '#', 'a');
        org.apache.commons.lang3.text.StrMatcher strMatcher73 = null;
        char[] charArray77 = new char[] { '4', ' ' };
        org.apache.commons.lang3.text.StrTokenizer strTokenizer80 = new org.apache.commons.lang3.text.StrTokenizer(charArray77, 'a', ' ');
        org.apache.commons.lang3.text.StrMatcher strMatcher81 = strTokenizer80.getTrimmerMatcher();
        org.apache.commons.lang3.text.StrTokenizer strTokenizer83 = strTokenizer80.setDelimiterString("");
        org.apache.commons.lang3.text.StrMatcher strMatcher84 = strTokenizer83.getTrimmerMatcher();
        org.apache.commons.lang3.text.StrTokenizer strTokenizer85 = new org.apache.commons.lang3.text.StrTokenizer("", strMatcher84);
        org.apache.commons.lang3.text.StrTokenizer strTokenizer86 = new org.apache.commons.lang3.text.StrTokenizer(charArray65, strMatcher73, strMatcher84);
        org.apache.commons.lang3.text.StrTokenizer strTokenizer88 = new org.apache.commons.lang3.text.StrTokenizer(charArray65, 'a');
        org.apache.commons.lang3.text.StrTokenizer strTokenizer89 = strTokenizer62.reset(charArray65);
        org.apache.commons.lang3.text.StrTokenizer strTokenizer90 = org.apache.commons.lang3.text.StrTokenizer.getCSVInstance(charArray65);
        org.apache.commons.lang3.text.StrTokenizer strTokenizer91 = strTokenizer59.reset(charArray65);
        org.apache.commons.lang3.text.StrTokenizer strTokenizer94 = new org.apache.commons.lang3.text.StrTokenizer(charArray65, '4', '4');
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray5), "4 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray5), "4 ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray5), "[4,  ]");
        org.junit.Assert.assertNotNull(strMatcher9);
        org.junit.Assert.assertNotNull(strTokenizer11);
        org.junit.Assert.assertNotNull(strMatcher12);
        org.junit.Assert.assertNotNull(charArray16);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray16), "4 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray16), "4 ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray16), "[4,  ]");
        org.junit.Assert.assertNotNull(strMatcher20);
        org.junit.Assert.assertNotNull(strTokenizer22);
        org.junit.Assert.assertNotNull(strMatcher23);
        org.junit.Assert.assertNotNull(strTokenizer24);
        org.junit.Assert.assertNotNull(charArray27);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray27), "4 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray27), "4 ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray27), "[4,  ]");
        org.junit.Assert.assertNotNull(strMatcher31);
        org.junit.Assert.assertNotNull(strTokenizer33);
        org.junit.Assert.assertNotNull(charArray37);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray37), "4 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray37), "4 ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray37), "[4,  ]");
        org.junit.Assert.assertNotNull(strMatcher41);
        org.junit.Assert.assertNotNull(strTokenizer43);
        org.junit.Assert.assertNotNull(strMatcher44);
        org.junit.Assert.assertNotNull(charArray48);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray48), "4 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray48), "4 ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray48), "[4,  ]");
        org.junit.Assert.assertNotNull(strMatcher52);
        org.junit.Assert.assertNotNull(strTokenizer54);
        org.junit.Assert.assertNotNull(strMatcher55);
        org.junit.Assert.assertNotNull(strTokenizer56);
        org.junit.Assert.assertNotNull(strTokenizer57);
        org.junit.Assert.assertNotNull(charArray65);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray65), "4 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray65), "4 ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray65), "[4,  ]");
        org.junit.Assert.assertNotNull(strTokenizer69);
        org.junit.Assert.assertNotNull(charArray77);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray77), "4 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray77), "4 ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray77), "[4,  ]");
        org.junit.Assert.assertNotNull(strMatcher81);
        org.junit.Assert.assertNotNull(strTokenizer83);
        org.junit.Assert.assertNotNull(strMatcher84);
        org.junit.Assert.assertNotNull(strTokenizer89);
        org.junit.Assert.assertNotNull(strTokenizer90);
        org.junit.Assert.assertNotNull(strTokenizer91);
    }

    @Test
    public void test1574() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1574");
        org.apache.commons.lang3.text.StrTokenizer strTokenizer2 = org.apache.commons.lang3.text.StrTokenizer.getCSVInstance("StrTokenizer[4 ]");
        org.apache.commons.lang3.text.StrMatcher strMatcher3 = strTokenizer2.getTrimmerMatcher();
        char[] charArray6 = new char[] { '4', ' ' };
        org.apache.commons.lang3.text.StrTokenizer strTokenizer9 = new org.apache.commons.lang3.text.StrTokenizer(charArray6, 'a', ' ');
        org.apache.commons.lang3.text.StrTokenizer strTokenizer10 = org.apache.commons.lang3.text.StrTokenizer.getCSVInstance(charArray6);
        org.apache.commons.lang3.text.StrMatcher strMatcher11 = null;
        org.apache.commons.lang3.text.StrTokenizer strTokenizer12 = new org.apache.commons.lang3.text.StrTokenizer(charArray6, strMatcher11);
        char[] charArray15 = new char[] { '4', ' ' };
        org.apache.commons.lang3.text.StrTokenizer strTokenizer18 = new org.apache.commons.lang3.text.StrTokenizer(charArray15, 'a', ' ');
        org.apache.commons.lang3.text.StrMatcher strMatcher19 = strTokenizer18.getTrimmerMatcher();
        org.apache.commons.lang3.text.StrTokenizer strTokenizer21 = strTokenizer18.setDelimiterString("");
        org.apache.commons.lang3.text.StrMatcher strMatcher22 = strTokenizer21.getTrimmerMatcher();
        org.apache.commons.lang3.text.StrTokenizer strTokenizer23 = new org.apache.commons.lang3.text.StrTokenizer(charArray6, strMatcher22);
        char[] charArray26 = new char[] { '4', ' ' };
        org.apache.commons.lang3.text.StrTokenizer strTokenizer29 = new org.apache.commons.lang3.text.StrTokenizer(charArray26, 'a', ' ');
        org.apache.commons.lang3.text.StrMatcher strMatcher30 = strTokenizer29.getTrimmerMatcher();
        org.apache.commons.lang3.text.StrTokenizer strTokenizer31 = new org.apache.commons.lang3.text.StrTokenizer(charArray6, strMatcher30);
        boolean boolean32 = strTokenizer31.hasPrevious();
        char[] charArray38 = new char[] { '#', ' ', ' ', 'a', '#' };
        org.apache.commons.lang3.text.StrTokenizer strTokenizer41 = new org.apache.commons.lang3.text.StrTokenizer(charArray38, '#', ' ');
        org.apache.commons.lang3.text.StrTokenizer strTokenizer43 = strTokenizer41.setEmptyTokenAsNull(false);
        org.apache.commons.lang3.text.StrMatcher strMatcher44 = strTokenizer43.getTrimmerMatcher();
        org.apache.commons.lang3.text.StrTokenizer strTokenizer45 = strTokenizer31.setDelimiterMatcher(strMatcher44);
        org.apache.commons.lang3.text.StrTokenizer strTokenizer46 = new org.apache.commons.lang3.text.StrTokenizer("StrTokenizer[ ]", strMatcher3, strMatcher44);
        org.junit.Assert.assertNotNull(strTokenizer2);
        org.junit.Assert.assertNotNull(strMatcher3);
        org.junit.Assert.assertNotNull(charArray6);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray6), "4 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray6), "4 ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray6), "[4,  ]");
        org.junit.Assert.assertNotNull(strTokenizer10);
        org.junit.Assert.assertNotNull(charArray15);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray15), "4 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray15), "4 ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray15), "[4,  ]");
        org.junit.Assert.assertNotNull(strMatcher19);
        org.junit.Assert.assertNotNull(strTokenizer21);
        org.junit.Assert.assertNotNull(strMatcher22);
        org.junit.Assert.assertNotNull(charArray26);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray26), "4 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray26), "4 ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray26), "[4,  ]");
        org.junit.Assert.assertNotNull(strMatcher30);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertNotNull(charArray38);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray38), "#  a#");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray38), "#  a#");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray38), "[#,  ,  , a, #]");
        org.junit.Assert.assertNotNull(strTokenizer43);
        org.junit.Assert.assertNotNull(strMatcher44);
        org.junit.Assert.assertNotNull(strTokenizer45);
    }

    @Test
    public void test1575() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1575");
        char[] charArray1 = new char[] { '#' };
        org.apache.commons.lang3.text.StrTokenizer strTokenizer2 = new org.apache.commons.lang3.text.StrTokenizer(charArray1);
        org.apache.commons.lang3.text.StrTokenizer strTokenizer4 = new org.apache.commons.lang3.text.StrTokenizer(charArray1, "4 ");
        java.lang.String[] strArray5 = strTokenizer4.getTokenArray();
        org.junit.Assert.assertNotNull(charArray1);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray1), "#");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray1), "#");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray1), "[#]");
        org.junit.Assert.assertNotNull(strArray5);
    }

    @Test
    public void test1576() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1576");
        org.apache.commons.lang3.text.StrTokenizer strTokenizer2 = new org.apache.commons.lang3.text.StrTokenizer("StrTokenizer[4 ]", 'a');
        int int3 = strTokenizer2.size();
        org.apache.commons.lang3.text.StrTokenizer strTokenizer5 = strTokenizer2.setDelimiterString("StrTokenizer[not tokenized yet]");
        org.apache.commons.lang3.text.StrMatcher strMatcher6 = strTokenizer5.getDelimiterMatcher();
        org.apache.commons.lang3.text.StrMatcher strMatcher7 = strTokenizer5.getQuoteMatcher();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertNotNull(strTokenizer5);
        org.junit.Assert.assertNotNull(strMatcher6);
        org.junit.Assert.assertNotNull(strMatcher7);
    }

    @Test
    public void test1577() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1577");
        char[] charArray2 = new char[] { '4', ' ' };
        org.apache.commons.lang3.text.StrTokenizer strTokenizer5 = new org.apache.commons.lang3.text.StrTokenizer(charArray2, 'a', ' ');
        org.apache.commons.lang3.text.StrTokenizer strTokenizer6 = org.apache.commons.lang3.text.StrTokenizer.getCSVInstance(charArray2);
        org.apache.commons.lang3.text.StrMatcher strMatcher7 = null;
        org.apache.commons.lang3.text.StrTokenizer strTokenizer8 = new org.apache.commons.lang3.text.StrTokenizer(charArray2, strMatcher7);
        char[] charArray11 = new char[] { '4', ' ' };
        org.apache.commons.lang3.text.StrTokenizer strTokenizer14 = new org.apache.commons.lang3.text.StrTokenizer(charArray11, 'a', ' ');
        org.apache.commons.lang3.text.StrMatcher strMatcher15 = strTokenizer14.getTrimmerMatcher();
        org.apache.commons.lang3.text.StrTokenizer strTokenizer17 = strTokenizer14.setDelimiterString("");
        org.apache.commons.lang3.text.StrMatcher strMatcher18 = strTokenizer17.getTrimmerMatcher();
        org.apache.commons.lang3.text.StrTokenizer strTokenizer19 = new org.apache.commons.lang3.text.StrTokenizer(charArray2, strMatcher18);
        org.apache.commons.lang3.text.StrTokenizer strTokenizer20 = strTokenizer19.reset();
        boolean boolean21 = strTokenizer19.hasPrevious();
        org.junit.Assert.assertNotNull(charArray2);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray2), "4 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray2), "4 ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray2), "[4,  ]");
        org.junit.Assert.assertNotNull(strTokenizer6);
        org.junit.Assert.assertNotNull(charArray11);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray11), "4 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray11), "4 ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray11), "[4,  ]");
        org.junit.Assert.assertNotNull(strMatcher15);
        org.junit.Assert.assertNotNull(strTokenizer17);
        org.junit.Assert.assertNotNull(strMatcher18);
        org.junit.Assert.assertNotNull(strTokenizer20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
    }

    @Test
    public void test1578() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1578");
        char[] charArray2 = new char[] { '4', ' ' };
        org.apache.commons.lang3.text.StrTokenizer strTokenizer5 = new org.apache.commons.lang3.text.StrTokenizer(charArray2, 'a', ' ');
        org.apache.commons.lang3.text.StrTokenizer strTokenizer8 = new org.apache.commons.lang3.text.StrTokenizer(charArray2, '4', 'a');
        org.apache.commons.lang3.text.StrTokenizer strTokenizer10 = strTokenizer8.setIgnoreEmptyTokens(true);
        boolean boolean11 = strTokenizer8.hasNext();
        java.lang.String str12 = strTokenizer8.nextToken();
        org.apache.commons.lang3.text.StrTokenizer strTokenizer14 = strTokenizer8.setEmptyTokenAsNull(false);
        org.junit.Assert.assertNotNull(charArray2);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray2), "4 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray2), "4 ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray2), "[4,  ]");
        org.junit.Assert.assertNotNull(strTokenizer10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + " " + "'", str12, " ");
        org.junit.Assert.assertNotNull(strTokenizer14);
    }

    @Test
    public void test1579() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1579");
        char[] charArray2 = new char[] { '4', ' ' };
        org.apache.commons.lang3.text.StrTokenizer strTokenizer5 = new org.apache.commons.lang3.text.StrTokenizer(charArray2, 'a', ' ');
        org.apache.commons.lang3.text.StrMatcher strMatcher6 = strTokenizer5.getTrimmerMatcher();
        char[] charArray9 = new char[] { '4', ' ' };
        org.apache.commons.lang3.text.StrTokenizer strTokenizer12 = new org.apache.commons.lang3.text.StrTokenizer(charArray9, 'a', ' ');
        org.apache.commons.lang3.text.StrTokenizer strTokenizer13 = org.apache.commons.lang3.text.StrTokenizer.getCSVInstance(charArray9);
        org.apache.commons.lang3.text.StrMatcher strMatcher14 = null;
        org.apache.commons.lang3.text.StrTokenizer strTokenizer15 = new org.apache.commons.lang3.text.StrTokenizer(charArray9, strMatcher14);
        org.apache.commons.lang3.text.StrTokenizer strTokenizer16 = strTokenizer5.reset(charArray9);
        org.apache.commons.lang3.text.StrTokenizer strTokenizer17 = org.apache.commons.lang3.text.StrTokenizer.getCSVInstance(charArray9);
        org.apache.commons.lang3.text.StrTokenizer strTokenizer18 = new org.apache.commons.lang3.text.StrTokenizer(charArray9);
        org.apache.commons.lang3.text.StrTokenizer strTokenizer20 = new org.apache.commons.lang3.text.StrTokenizer(charArray9, '#');
        char[] charArray24 = new char[] { '4', ' ' };
        org.apache.commons.lang3.text.StrTokenizer strTokenizer27 = new org.apache.commons.lang3.text.StrTokenizer(charArray24, 'a', ' ');
        org.apache.commons.lang3.text.StrMatcher strMatcher28 = strTokenizer27.getTrimmerMatcher();
        char[] charArray31 = new char[] { '4', ' ' };
        org.apache.commons.lang3.text.StrTokenizer strTokenizer34 = new org.apache.commons.lang3.text.StrTokenizer(charArray31, 'a', ' ');
        org.apache.commons.lang3.text.StrTokenizer strTokenizer35 = org.apache.commons.lang3.text.StrTokenizer.getCSVInstance(charArray31);
        org.apache.commons.lang3.text.StrMatcher strMatcher36 = null;
        org.apache.commons.lang3.text.StrTokenizer strTokenizer37 = new org.apache.commons.lang3.text.StrTokenizer(charArray31, strMatcher36);
        org.apache.commons.lang3.text.StrTokenizer strTokenizer38 = strTokenizer27.reset(charArray31);
        int int39 = strTokenizer27.nextIndex();
        org.apache.commons.lang3.text.StrMatcher strMatcher40 = strTokenizer27.getQuoteMatcher();
        org.apache.commons.lang3.text.StrTokenizer strTokenizer41 = new org.apache.commons.lang3.text.StrTokenizer("StrTokenizer[StrTokenizer[4, ]]", strMatcher40);
        org.apache.commons.lang3.text.StrTokenizer strTokenizer42 = strTokenizer20.setIgnoredMatcher(strMatcher40);
        org.junit.Assert.assertNotNull(charArray2);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray2), "4 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray2), "4 ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray2), "[4,  ]");
        org.junit.Assert.assertNotNull(strMatcher6);
        org.junit.Assert.assertNotNull(charArray9);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray9), "4 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray9), "4 ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray9), "[4,  ]");
        org.junit.Assert.assertNotNull(strTokenizer13);
        org.junit.Assert.assertNotNull(strTokenizer16);
        org.junit.Assert.assertNotNull(strTokenizer17);
        org.junit.Assert.assertNotNull(charArray24);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray24), "4 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray24), "4 ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray24), "[4,  ]");
        org.junit.Assert.assertNotNull(strMatcher28);
        org.junit.Assert.assertNotNull(charArray31);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray31), "4 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray31), "4 ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray31), "[4,  ]");
        org.junit.Assert.assertNotNull(strTokenizer35);
        org.junit.Assert.assertNotNull(strTokenizer38);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 0 + "'", int39 == 0);
        org.junit.Assert.assertNotNull(strMatcher40);
        org.junit.Assert.assertNotNull(strTokenizer42);
    }

    @Test
    public void test1580() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1580");
        org.apache.commons.lang3.text.StrTokenizer strTokenizer1 = new org.apache.commons.lang3.text.StrTokenizer("hi!");
        // The following exception was thrown during execution in test generation
        try {
            strTokenizer1.set("StrTokenizer[StrTokenizer[4, ]]");
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: set() is unsupported");
        } catch (java.lang.UnsupportedOperationException e) {
        // Expected exception.
        }
    }

    @Test
    public void test1581() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1581");
        char[] charArray2 = new char[] { '4', ' ' };
        org.apache.commons.lang3.text.StrTokenizer strTokenizer5 = new org.apache.commons.lang3.text.StrTokenizer(charArray2, 'a', ' ');
        org.apache.commons.lang3.text.StrMatcher strMatcher6 = strTokenizer5.getTrimmerMatcher();
        char[] charArray9 = new char[] { '4', ' ' };
        org.apache.commons.lang3.text.StrTokenizer strTokenizer12 = new org.apache.commons.lang3.text.StrTokenizer(charArray9, 'a', ' ');
        org.apache.commons.lang3.text.StrTokenizer strTokenizer13 = org.apache.commons.lang3.text.StrTokenizer.getCSVInstance(charArray9);
        org.apache.commons.lang3.text.StrMatcher strMatcher14 = null;
        org.apache.commons.lang3.text.StrTokenizer strTokenizer15 = new org.apache.commons.lang3.text.StrTokenizer(charArray9, strMatcher14);
        org.apache.commons.lang3.text.StrTokenizer strTokenizer16 = strTokenizer5.reset(charArray9);
        boolean boolean17 = strTokenizer5.hasPrevious();
        boolean boolean18 = strTokenizer5.hasPrevious();
        org.junit.Assert.assertNotNull(charArray2);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray2), "4 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray2), "4 ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray2), "[4,  ]");
        org.junit.Assert.assertNotNull(strMatcher6);
        org.junit.Assert.assertNotNull(charArray9);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray9), "4 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray9), "4 ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray9), "[4,  ]");
        org.junit.Assert.assertNotNull(strTokenizer13);
        org.junit.Assert.assertNotNull(strTokenizer16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test1582() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1582");
        char[] charArray2 = new char[] { '4', ' ' };
        org.apache.commons.lang3.text.StrTokenizer strTokenizer5 = new org.apache.commons.lang3.text.StrTokenizer(charArray2, 'a', ' ');
        org.apache.commons.lang3.text.StrTokenizer strTokenizer6 = org.apache.commons.lang3.text.StrTokenizer.getTSVInstance(charArray2);
        org.apache.commons.lang3.text.StrTokenizer strTokenizer7 = org.apache.commons.lang3.text.StrTokenizer.getTSVInstance(charArray2);
        org.apache.commons.lang3.text.StrTokenizer strTokenizer9 = new org.apache.commons.lang3.text.StrTokenizer(charArray2, "4 ");
        org.apache.commons.lang3.text.StrTokenizer strTokenizer12 = new org.apache.commons.lang3.text.StrTokenizer("4 ", 'a');
        char[] charArray16 = new char[] { '4', ' ' };
        org.apache.commons.lang3.text.StrTokenizer strTokenizer19 = new org.apache.commons.lang3.text.StrTokenizer(charArray16, 'a', ' ');
        org.apache.commons.lang3.text.StrMatcher strMatcher20 = strTokenizer19.getTrimmerMatcher();
        org.apache.commons.lang3.text.StrTokenizer strTokenizer22 = strTokenizer19.setDelimiterString("");
        char[] charArray26 = new char[] { '4', ' ' };
        org.apache.commons.lang3.text.StrTokenizer strTokenizer29 = new org.apache.commons.lang3.text.StrTokenizer(charArray26, 'a', ' ');
        org.apache.commons.lang3.text.StrMatcher strMatcher30 = strTokenizer29.getTrimmerMatcher();
        org.apache.commons.lang3.text.StrTokenizer strTokenizer32 = strTokenizer29.setDelimiterString("");
        org.apache.commons.lang3.text.StrMatcher strMatcher33 = strTokenizer32.getTrimmerMatcher();
        org.apache.commons.lang3.text.StrTokenizer strTokenizer34 = new org.apache.commons.lang3.text.StrTokenizer("", strMatcher33);
        char[] charArray37 = new char[] { '4', ' ' };
        org.apache.commons.lang3.text.StrTokenizer strTokenizer40 = new org.apache.commons.lang3.text.StrTokenizer(charArray37, 'a', ' ');
        org.apache.commons.lang3.text.StrMatcher strMatcher41 = strTokenizer40.getTrimmerMatcher();
        org.apache.commons.lang3.text.StrTokenizer strTokenizer43 = strTokenizer40.setDelimiterString("");
        org.apache.commons.lang3.text.StrMatcher strMatcher44 = strTokenizer43.getTrimmerMatcher();
        org.apache.commons.lang3.text.StrTokenizer strTokenizer45 = strTokenizer34.setTrimmerMatcher(strMatcher44);
        org.apache.commons.lang3.text.StrTokenizer strTokenizer46 = strTokenizer22.setTrimmerMatcher(strMatcher44);
        org.apache.commons.lang3.text.StrMatcher strMatcher47 = strTokenizer22.getDelimiterMatcher();
        boolean boolean48 = strTokenizer22.isIgnoreEmptyTokens();
        org.apache.commons.lang3.text.StrMatcher strMatcher49 = strTokenizer22.getQuoteMatcher();
        char[] charArray50 = null;
        org.apache.commons.lang3.text.StrTokenizer strTokenizer52 = new org.apache.commons.lang3.text.StrTokenizer(charArray50, "");
        java.lang.String str53 = strTokenizer52.getContent();
        org.apache.commons.lang3.text.StrMatcher strMatcher54 = strTokenizer52.getTrimmerMatcher();
        org.apache.commons.lang3.text.StrTokenizer strTokenizer55 = new org.apache.commons.lang3.text.StrTokenizer("4 ", strMatcher49, strMatcher54);
        org.apache.commons.lang3.text.StrTokenizer strTokenizer56 = strTokenizer12.setDelimiterMatcher(strMatcher49);
        org.apache.commons.lang3.text.StrMatcher strMatcher57 = strTokenizer12.getQuoteMatcher();
        char[] charArray59 = null;
        org.apache.commons.lang3.text.StrTokenizer strTokenizer61 = new org.apache.commons.lang3.text.StrTokenizer(charArray59, "");
        java.lang.String str62 = strTokenizer61.getContent();
        org.apache.commons.lang3.text.StrMatcher strMatcher63 = strTokenizer61.getDelimiterMatcher();
        org.apache.commons.lang3.text.StrTokenizer strTokenizer65 = org.apache.commons.lang3.text.StrTokenizer.getCSVInstance("");
        java.util.List<java.lang.String> strList66 = strTokenizer65.getTokenList();
        boolean boolean67 = strTokenizer65.hasPrevious();
        java.lang.String[] strArray68 = strTokenizer65.getTokenArray();
        char[] charArray71 = new char[] { '4', ' ' };
        org.apache.commons.lang3.text.StrTokenizer strTokenizer74 = new org.apache.commons.lang3.text.StrTokenizer(charArray71, 'a', ' ');
        org.apache.commons.lang3.text.StrTokenizer strTokenizer75 = org.apache.commons.lang3.text.StrTokenizer.getCSVInstance(charArray71);
        org.apache.commons.lang3.text.StrMatcher strMatcher76 = null;
        org.apache.commons.lang3.text.StrTokenizer strTokenizer77 = new org.apache.commons.lang3.text.StrTokenizer(charArray71, strMatcher76);
        char[] charArray80 = new char[] { '4', ' ' };
        org.apache.commons.lang3.text.StrTokenizer strTokenizer83 = new org.apache.commons.lang3.text.StrTokenizer(charArray80, 'a', ' ');
        org.apache.commons.lang3.text.StrMatcher strMatcher84 = strTokenizer83.getTrimmerMatcher();
        org.apache.commons.lang3.text.StrTokenizer strTokenizer86 = strTokenizer83.setDelimiterString("");
        org.apache.commons.lang3.text.StrMatcher strMatcher87 = strTokenizer86.getTrimmerMatcher();
        org.apache.commons.lang3.text.StrTokenizer strTokenizer88 = new org.apache.commons.lang3.text.StrTokenizer(charArray71, strMatcher87);
        org.apache.commons.lang3.text.StrTokenizer strTokenizer89 = strTokenizer65.setTrimmerMatcher(strMatcher87);
        org.apache.commons.lang3.text.StrTokenizer strTokenizer90 = new org.apache.commons.lang3.text.StrTokenizer("StrTokenizer[]", strMatcher63, strMatcher87);
        org.apache.commons.lang3.text.StrTokenizer strTokenizer91 = new org.apache.commons.lang3.text.StrTokenizer(charArray2, strMatcher57, strMatcher63);
        org.apache.commons.lang3.text.StrTokenizer strTokenizer93 = new org.apache.commons.lang3.text.StrTokenizer(charArray2, "StrTokenizer[StrTokenizer[4, ]]");
        org.apache.commons.lang3.text.StrTokenizer strTokenizer94 = org.apache.commons.lang3.text.StrTokenizer.getTSVInstance(charArray2);
        org.junit.Assert.assertNotNull(charArray2);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray2), "4 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray2), "4 ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray2), "[4,  ]");
        org.junit.Assert.assertNotNull(strTokenizer6);
        org.junit.Assert.assertNotNull(strTokenizer7);
        org.junit.Assert.assertNotNull(charArray16);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray16), "4 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray16), "4 ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray16), "[4,  ]");
        org.junit.Assert.assertNotNull(strMatcher20);
        org.junit.Assert.assertNotNull(strTokenizer22);
        org.junit.Assert.assertNotNull(charArray26);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray26), "4 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray26), "4 ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray26), "[4,  ]");
        org.junit.Assert.assertNotNull(strMatcher30);
        org.junit.Assert.assertNotNull(strTokenizer32);
        org.junit.Assert.assertNotNull(strMatcher33);
        org.junit.Assert.assertNotNull(charArray37);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray37), "4 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray37), "4 ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray37), "[4,  ]");
        org.junit.Assert.assertNotNull(strMatcher41);
        org.junit.Assert.assertNotNull(strTokenizer43);
        org.junit.Assert.assertNotNull(strMatcher44);
        org.junit.Assert.assertNotNull(strTokenizer45);
        org.junit.Assert.assertNotNull(strTokenizer46);
        org.junit.Assert.assertNotNull(strMatcher47);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + true + "'", boolean48 == true);
        org.junit.Assert.assertNotNull(strMatcher49);
        org.junit.Assert.assertNull(str53);
        org.junit.Assert.assertNotNull(strMatcher54);
        org.junit.Assert.assertNotNull(strTokenizer56);
        org.junit.Assert.assertNotNull(strMatcher57);
        org.junit.Assert.assertNull(str62);
        org.junit.Assert.assertNotNull(strMatcher63);
        org.junit.Assert.assertNotNull(strTokenizer65);
        org.junit.Assert.assertNotNull(strList66);
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + false + "'", boolean67 == false);
        org.junit.Assert.assertNotNull(strArray68);
        org.junit.Assert.assertNotNull(charArray71);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray71), "4 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray71), "4 ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray71), "[4,  ]");
        org.junit.Assert.assertNotNull(strTokenizer75);
        org.junit.Assert.assertNotNull(charArray80);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray80), "4 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray80), "4 ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray80), "[4,  ]");
        org.junit.Assert.assertNotNull(strMatcher84);
        org.junit.Assert.assertNotNull(strTokenizer86);
        org.junit.Assert.assertNotNull(strMatcher87);
        org.junit.Assert.assertNotNull(strTokenizer89);
        org.junit.Assert.assertNotNull(strTokenizer94);
    }

    @Test
    public void test1583() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1583");
        char[] charArray2 = new char[] { '4', ' ' };
        org.apache.commons.lang3.text.StrTokenizer strTokenizer5 = new org.apache.commons.lang3.text.StrTokenizer(charArray2, 'a', ' ');
        org.apache.commons.lang3.text.StrMatcher strMatcher6 = strTokenizer5.getTrimmerMatcher();
        org.apache.commons.lang3.text.StrTokenizer strTokenizer8 = strTokenizer5.setDelimiterString("");
        char[] charArray12 = new char[] { '4', ' ' };
        org.apache.commons.lang3.text.StrTokenizer strTokenizer15 = new org.apache.commons.lang3.text.StrTokenizer(charArray12, 'a', ' ');
        org.apache.commons.lang3.text.StrMatcher strMatcher16 = strTokenizer15.getTrimmerMatcher();
        org.apache.commons.lang3.text.StrTokenizer strTokenizer18 = strTokenizer15.setDelimiterString("");
        org.apache.commons.lang3.text.StrMatcher strMatcher19 = strTokenizer18.getTrimmerMatcher();
        org.apache.commons.lang3.text.StrTokenizer strTokenizer20 = new org.apache.commons.lang3.text.StrTokenizer("", strMatcher19);
        char[] charArray23 = new char[] { '4', ' ' };
        org.apache.commons.lang3.text.StrTokenizer strTokenizer26 = new org.apache.commons.lang3.text.StrTokenizer(charArray23, 'a', ' ');
        org.apache.commons.lang3.text.StrMatcher strMatcher27 = strTokenizer26.getTrimmerMatcher();
        org.apache.commons.lang3.text.StrTokenizer strTokenizer29 = strTokenizer26.setDelimiterString("");
        org.apache.commons.lang3.text.StrMatcher strMatcher30 = strTokenizer29.getTrimmerMatcher();
        org.apache.commons.lang3.text.StrTokenizer strTokenizer31 = strTokenizer20.setTrimmerMatcher(strMatcher30);
        org.apache.commons.lang3.text.StrTokenizer strTokenizer32 = strTokenizer8.setTrimmerMatcher(strMatcher30);
        java.lang.String str33 = strTokenizer8.getContent();
        char[] charArray36 = new char[] { '4', ' ' };
        org.apache.commons.lang3.text.StrTokenizer strTokenizer39 = new org.apache.commons.lang3.text.StrTokenizer(charArray36, 'a', ' ');
        org.apache.commons.lang3.text.StrTokenizer strTokenizer42 = new org.apache.commons.lang3.text.StrTokenizer(charArray36, '4', 'a');
        char[] charArray45 = new char[] { '4', ' ' };
        org.apache.commons.lang3.text.StrTokenizer strTokenizer48 = new org.apache.commons.lang3.text.StrTokenizer(charArray45, 'a', ' ');
        org.apache.commons.lang3.text.StrMatcher strMatcher49 = strTokenizer48.getTrimmerMatcher();
        org.apache.commons.lang3.text.StrMatcher strMatcher50 = strTokenizer48.getQuoteMatcher();
        org.apache.commons.lang3.text.StrTokenizer strTokenizer51 = new org.apache.commons.lang3.text.StrTokenizer(charArray36, strMatcher50);
        org.apache.commons.lang3.text.StrTokenizer strTokenizer52 = strTokenizer8.reset(charArray36);
        org.apache.commons.lang3.text.StrTokenizer strTokenizer53 = org.apache.commons.lang3.text.StrTokenizer.getTSVInstance(charArray36);
        char[] charArray56 = new char[] { '4', ' ' };
        org.apache.commons.lang3.text.StrTokenizer strTokenizer59 = new org.apache.commons.lang3.text.StrTokenizer(charArray56, 'a', ' ');
        org.apache.commons.lang3.text.StrMatcher strMatcher60 = strTokenizer59.getTrimmerMatcher();
        org.apache.commons.lang3.text.StrTokenizer strTokenizer62 = strTokenizer59.setDelimiterString("");
        char[] charArray66 = new char[] { '4', ' ' };
        org.apache.commons.lang3.text.StrTokenizer strTokenizer69 = new org.apache.commons.lang3.text.StrTokenizer(charArray66, 'a', ' ');
        org.apache.commons.lang3.text.StrMatcher strMatcher70 = strTokenizer69.getTrimmerMatcher();
        org.apache.commons.lang3.text.StrTokenizer strTokenizer72 = strTokenizer69.setDelimiterString("");
        org.apache.commons.lang3.text.StrMatcher strMatcher73 = strTokenizer72.getTrimmerMatcher();
        org.apache.commons.lang3.text.StrTokenizer strTokenizer74 = new org.apache.commons.lang3.text.StrTokenizer("", strMatcher73);
        char[] charArray77 = new char[] { '4', ' ' };
        org.apache.commons.lang3.text.StrTokenizer strTokenizer80 = new org.apache.commons.lang3.text.StrTokenizer(charArray77, 'a', ' ');
        org.apache.commons.lang3.text.StrMatcher strMatcher81 = strTokenizer80.getTrimmerMatcher();
        org.apache.commons.lang3.text.StrTokenizer strTokenizer83 = strTokenizer80.setDelimiterString("");
        org.apache.commons.lang3.text.StrMatcher strMatcher84 = strTokenizer83.getTrimmerMatcher();
        org.apache.commons.lang3.text.StrTokenizer strTokenizer85 = strTokenizer74.setTrimmerMatcher(strMatcher84);
        org.apache.commons.lang3.text.StrTokenizer strTokenizer86 = strTokenizer62.setTrimmerMatcher(strMatcher84);
        org.apache.commons.lang3.text.StrMatcher strMatcher87 = strTokenizer62.getDelimiterMatcher();
        boolean boolean88 = strTokenizer62.isIgnoreEmptyTokens();
        org.apache.commons.lang3.text.StrMatcher strMatcher89 = strTokenizer62.getQuoteMatcher();
        org.apache.commons.lang3.text.StrTokenizer strTokenizer90 = new org.apache.commons.lang3.text.StrTokenizer(charArray36, strMatcher89);
        org.apache.commons.lang3.text.StrTokenizer strTokenizer91 = org.apache.commons.lang3.text.StrTokenizer.getTSVInstance(charArray36);
        org.apache.commons.lang3.text.StrTokenizer strTokenizer93 = new org.apache.commons.lang3.text.StrTokenizer(charArray36, '#');
        int int94 = strTokenizer93.size();
        org.apache.commons.lang3.text.StrTokenizer strTokenizer96 = strTokenizer93.setDelimiterString("StrTokenizer[a#]");
        org.apache.commons.lang3.text.StrTokenizer strTokenizer98 = strTokenizer96.setQuoteChar('4');
        org.junit.Assert.assertNotNull(charArray2);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray2), "4 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray2), "4 ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray2), "[4,  ]");
        org.junit.Assert.assertNotNull(strMatcher6);
        org.junit.Assert.assertNotNull(strTokenizer8);
        org.junit.Assert.assertNotNull(charArray12);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray12), "4 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray12), "4 ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray12), "[4,  ]");
        org.junit.Assert.assertNotNull(strMatcher16);
        org.junit.Assert.assertNotNull(strTokenizer18);
        org.junit.Assert.assertNotNull(strMatcher19);
        org.junit.Assert.assertNotNull(charArray23);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray23), "4 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray23), "4 ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray23), "[4,  ]");
        org.junit.Assert.assertNotNull(strMatcher27);
        org.junit.Assert.assertNotNull(strTokenizer29);
        org.junit.Assert.assertNotNull(strMatcher30);
        org.junit.Assert.assertNotNull(strTokenizer31);
        org.junit.Assert.assertNotNull(strTokenizer32);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "4 " + "'", str33, "4 ");
        org.junit.Assert.assertNotNull(charArray36);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray36), "4 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray36), "4 ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray36), "[4,  ]");
        org.junit.Assert.assertNotNull(charArray45);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray45), "4 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray45), "4 ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray45), "[4,  ]");
        org.junit.Assert.assertNotNull(strMatcher49);
        org.junit.Assert.assertNotNull(strMatcher50);
        org.junit.Assert.assertNotNull(strTokenizer52);
        org.junit.Assert.assertNotNull(strTokenizer53);
        org.junit.Assert.assertNotNull(charArray56);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray56), "4 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray56), "4 ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray56), "[4,  ]");
        org.junit.Assert.assertNotNull(strMatcher60);
        org.junit.Assert.assertNotNull(strTokenizer62);
        org.junit.Assert.assertNotNull(charArray66);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray66), "4 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray66), "4 ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray66), "[4,  ]");
        org.junit.Assert.assertNotNull(strMatcher70);
        org.junit.Assert.assertNotNull(strTokenizer72);
        org.junit.Assert.assertNotNull(strMatcher73);
        org.junit.Assert.assertNotNull(charArray77);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray77), "4 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray77), "4 ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray77), "[4,  ]");
        org.junit.Assert.assertNotNull(strMatcher81);
        org.junit.Assert.assertNotNull(strTokenizer83);
        org.junit.Assert.assertNotNull(strMatcher84);
        org.junit.Assert.assertNotNull(strTokenizer85);
        org.junit.Assert.assertNotNull(strTokenizer86);
        org.junit.Assert.assertNotNull(strMatcher87);
        org.junit.Assert.assertTrue("'" + boolean88 + "' != '" + true + "'", boolean88 == true);
        org.junit.Assert.assertNotNull(strMatcher89);
        org.junit.Assert.assertNotNull(strTokenizer91);
        org.junit.Assert.assertTrue("'" + int94 + "' != '" + 1 + "'", int94 == 1);
        org.junit.Assert.assertNotNull(strTokenizer96);
        org.junit.Assert.assertNotNull(strTokenizer98);
    }

    @Test
    public void test1584() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1584");
        char[] charArray4 = new char[] { '4', ' ' };
        org.apache.commons.lang3.text.StrTokenizer strTokenizer7 = new org.apache.commons.lang3.text.StrTokenizer(charArray4, 'a', ' ');
        org.apache.commons.lang3.text.StrMatcher strMatcher8 = strTokenizer7.getTrimmerMatcher();
        org.apache.commons.lang3.text.StrMatcher strMatcher9 = strTokenizer7.getQuoteMatcher();
        org.apache.commons.lang3.text.StrTokenizer strTokenizer13 = new org.apache.commons.lang3.text.StrTokenizer("StrTokenizer[4 ]", '4', '4');
        org.apache.commons.lang3.text.StrTokenizer strTokenizer15 = org.apache.commons.lang3.text.StrTokenizer.getCSVInstance("hi!");
        char[] charArray18 = new char[] { 'a', '#' };
        org.apache.commons.lang3.text.StrTokenizer strTokenizer19 = org.apache.commons.lang3.text.StrTokenizer.getCSVInstance(charArray18);
        org.apache.commons.lang3.text.StrTokenizer strTokenizer20 = strTokenizer15.reset(charArray18);
        org.apache.commons.lang3.text.StrTokenizer strTokenizer21 = org.apache.commons.lang3.text.StrTokenizer.getTSVInstance(charArray18);
        org.apache.commons.lang3.text.StrTokenizer strTokenizer24 = new org.apache.commons.lang3.text.StrTokenizer("4 ", 'a');
        org.apache.commons.lang3.text.StrMatcher strMatcher25 = strTokenizer24.getDelimiterMatcher();
        char[] charArray28 = new char[] { '4', ' ' };
        org.apache.commons.lang3.text.StrTokenizer strTokenizer31 = new org.apache.commons.lang3.text.StrTokenizer(charArray28, 'a', ' ');
        org.apache.commons.lang3.text.StrMatcher strMatcher32 = strTokenizer31.getTrimmerMatcher();
        org.apache.commons.lang3.text.StrTokenizer strTokenizer34 = strTokenizer31.setDelimiterString("");
        char[] charArray38 = new char[] { '4', ' ' };
        org.apache.commons.lang3.text.StrTokenizer strTokenizer41 = new org.apache.commons.lang3.text.StrTokenizer(charArray38, 'a', ' ');
        org.apache.commons.lang3.text.StrMatcher strMatcher42 = strTokenizer41.getTrimmerMatcher();
        org.apache.commons.lang3.text.StrTokenizer strTokenizer44 = strTokenizer41.setDelimiterString("");
        org.apache.commons.lang3.text.StrMatcher strMatcher45 = strTokenizer44.getTrimmerMatcher();
        org.apache.commons.lang3.text.StrTokenizer strTokenizer46 = new org.apache.commons.lang3.text.StrTokenizer("", strMatcher45);
        char[] charArray49 = new char[] { '4', ' ' };
        org.apache.commons.lang3.text.StrTokenizer strTokenizer52 = new org.apache.commons.lang3.text.StrTokenizer(charArray49, 'a', ' ');
        org.apache.commons.lang3.text.StrMatcher strMatcher53 = strTokenizer52.getTrimmerMatcher();
        org.apache.commons.lang3.text.StrTokenizer strTokenizer55 = strTokenizer52.setDelimiterString("");
        org.apache.commons.lang3.text.StrMatcher strMatcher56 = strTokenizer55.getTrimmerMatcher();
        org.apache.commons.lang3.text.StrTokenizer strTokenizer57 = strTokenizer46.setTrimmerMatcher(strMatcher56);
        org.apache.commons.lang3.text.StrTokenizer strTokenizer58 = strTokenizer34.setTrimmerMatcher(strMatcher56);
        char[] charArray61 = new char[] { '4', ' ' };
        org.apache.commons.lang3.text.StrTokenizer strTokenizer64 = new org.apache.commons.lang3.text.StrTokenizer(charArray61, 'a', ' ');
        org.apache.commons.lang3.text.StrMatcher strMatcher65 = strTokenizer64.getTrimmerMatcher();
        org.apache.commons.lang3.text.StrTokenizer strTokenizer67 = strTokenizer64.setDelimiterString("");
        char[] charArray71 = new char[] { '4', ' ' };
        org.apache.commons.lang3.text.StrTokenizer strTokenizer74 = new org.apache.commons.lang3.text.StrTokenizer(charArray71, 'a', ' ');
        org.apache.commons.lang3.text.StrMatcher strMatcher75 = strTokenizer74.getTrimmerMatcher();
        org.apache.commons.lang3.text.StrTokenizer strTokenizer77 = strTokenizer74.setDelimiterString("");
        org.apache.commons.lang3.text.StrMatcher strMatcher78 = strTokenizer77.getTrimmerMatcher();
        org.apache.commons.lang3.text.StrTokenizer strTokenizer79 = new org.apache.commons.lang3.text.StrTokenizer("", strMatcher78);
        char[] charArray82 = new char[] { '4', ' ' };
        org.apache.commons.lang3.text.StrTokenizer strTokenizer85 = new org.apache.commons.lang3.text.StrTokenizer(charArray82, 'a', ' ');
        org.apache.commons.lang3.text.StrMatcher strMatcher86 = strTokenizer85.getTrimmerMatcher();
        org.apache.commons.lang3.text.StrTokenizer strTokenizer88 = strTokenizer85.setDelimiterString("");
        org.apache.commons.lang3.text.StrMatcher strMatcher89 = strTokenizer88.getTrimmerMatcher();
        org.apache.commons.lang3.text.StrTokenizer strTokenizer90 = strTokenizer79.setTrimmerMatcher(strMatcher89);
        org.apache.commons.lang3.text.StrTokenizer strTokenizer91 = strTokenizer67.setTrimmerMatcher(strMatcher89);
        org.apache.commons.lang3.text.StrTokenizer strTokenizer92 = strTokenizer58.setIgnoredMatcher(strMatcher89);
        org.apache.commons.lang3.text.StrTokenizer strTokenizer93 = new org.apache.commons.lang3.text.StrTokenizer(charArray18, strMatcher25, strMatcher89);
        org.apache.commons.lang3.text.StrTokenizer strTokenizer94 = strTokenizer13.setQuoteMatcher(strMatcher25);
        org.apache.commons.lang3.text.StrTokenizer strTokenizer95 = new org.apache.commons.lang3.text.StrTokenizer("a#", strMatcher9, strMatcher25);
        org.apache.commons.lang3.text.StrTokenizer strTokenizer96 = new org.apache.commons.lang3.text.StrTokenizer("4 ", strMatcher9);
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray4), "4 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray4), "4 ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray4), "[4,  ]");
        org.junit.Assert.assertNotNull(strMatcher8);
        org.junit.Assert.assertNotNull(strMatcher9);
        org.junit.Assert.assertNotNull(strTokenizer15);
        org.junit.Assert.assertNotNull(charArray18);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray18), "a#");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray18), "a#");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray18), "[a, #]");
        org.junit.Assert.assertNotNull(strTokenizer19);
        org.junit.Assert.assertNotNull(strTokenizer20);
        org.junit.Assert.assertNotNull(strTokenizer21);
        org.junit.Assert.assertNotNull(strMatcher25);
        org.junit.Assert.assertNotNull(charArray28);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray28), "4 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray28), "4 ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray28), "[4,  ]");
        org.junit.Assert.assertNotNull(strMatcher32);
        org.junit.Assert.assertNotNull(strTokenizer34);
        org.junit.Assert.assertNotNull(charArray38);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray38), "4 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray38), "4 ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray38), "[4,  ]");
        org.junit.Assert.assertNotNull(strMatcher42);
        org.junit.Assert.assertNotNull(strTokenizer44);
        org.junit.Assert.assertNotNull(strMatcher45);
        org.junit.Assert.assertNotNull(charArray49);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray49), "4 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray49), "4 ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray49), "[4,  ]");
        org.junit.Assert.assertNotNull(strMatcher53);
        org.junit.Assert.assertNotNull(strTokenizer55);
        org.junit.Assert.assertNotNull(strMatcher56);
        org.junit.Assert.assertNotNull(strTokenizer57);
        org.junit.Assert.assertNotNull(strTokenizer58);
        org.junit.Assert.assertNotNull(charArray61);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray61), "4 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray61), "4 ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray61), "[4,  ]");
        org.junit.Assert.assertNotNull(strMatcher65);
        org.junit.Assert.assertNotNull(strTokenizer67);
        org.junit.Assert.assertNotNull(charArray71);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray71), "4 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray71), "4 ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray71), "[4,  ]");
        org.junit.Assert.assertNotNull(strMatcher75);
        org.junit.Assert.assertNotNull(strTokenizer77);
        org.junit.Assert.assertNotNull(strMatcher78);
        org.junit.Assert.assertNotNull(charArray82);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray82), "4 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray82), "4 ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray82), "[4,  ]");
        org.junit.Assert.assertNotNull(strMatcher86);
        org.junit.Assert.assertNotNull(strTokenizer88);
        org.junit.Assert.assertNotNull(strMatcher89);
        org.junit.Assert.assertNotNull(strTokenizer90);
        org.junit.Assert.assertNotNull(strTokenizer91);
        org.junit.Assert.assertNotNull(strTokenizer92);
        org.junit.Assert.assertNotNull(strTokenizer94);
    }

    @Test
    public void test1585() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1585");
        char[] charArray2 = new char[] { '4', ' ' };
        org.apache.commons.lang3.text.StrTokenizer strTokenizer5 = new org.apache.commons.lang3.text.StrTokenizer(charArray2, 'a', ' ');
        org.apache.commons.lang3.text.StrMatcher strMatcher6 = strTokenizer5.getTrimmerMatcher();
        org.apache.commons.lang3.text.StrMatcher strMatcher7 = strTokenizer5.getQuoteMatcher();
        char[] charArray10 = new char[] { '4', ' ' };
        org.apache.commons.lang3.text.StrTokenizer strTokenizer13 = new org.apache.commons.lang3.text.StrTokenizer(charArray10, 'a', ' ');
        org.apache.commons.lang3.text.StrMatcher strMatcher14 = strTokenizer13.getTrimmerMatcher();
        char[] charArray17 = new char[] { '4', ' ' };
        org.apache.commons.lang3.text.StrTokenizer strTokenizer20 = new org.apache.commons.lang3.text.StrTokenizer(charArray17, 'a', ' ');
        org.apache.commons.lang3.text.StrTokenizer strTokenizer21 = org.apache.commons.lang3.text.StrTokenizer.getCSVInstance(charArray17);
        org.apache.commons.lang3.text.StrMatcher strMatcher22 = null;
        org.apache.commons.lang3.text.StrTokenizer strTokenizer23 = new org.apache.commons.lang3.text.StrTokenizer(charArray17, strMatcher22);
        org.apache.commons.lang3.text.StrTokenizer strTokenizer24 = strTokenizer13.reset(charArray17);
        org.apache.commons.lang3.text.StrTokenizer strTokenizer25 = org.apache.commons.lang3.text.StrTokenizer.getCSVInstance(charArray17);
        char[] charArray28 = new char[] { '4', ' ' };
        org.apache.commons.lang3.text.StrTokenizer strTokenizer31 = new org.apache.commons.lang3.text.StrTokenizer(charArray28, 'a', ' ');
        org.apache.commons.lang3.text.StrMatcher strMatcher32 = strTokenizer31.getTrimmerMatcher();
        org.apache.commons.lang3.text.StrTokenizer strTokenizer34 = strTokenizer31.setDelimiterString("");
        char[] charArray38 = new char[] { '4', ' ' };
        org.apache.commons.lang3.text.StrTokenizer strTokenizer41 = new org.apache.commons.lang3.text.StrTokenizer(charArray38, 'a', ' ');
        org.apache.commons.lang3.text.StrMatcher strMatcher42 = strTokenizer41.getTrimmerMatcher();
        org.apache.commons.lang3.text.StrTokenizer strTokenizer44 = strTokenizer41.setDelimiterString("");
        org.apache.commons.lang3.text.StrMatcher strMatcher45 = strTokenizer44.getTrimmerMatcher();
        org.apache.commons.lang3.text.StrTokenizer strTokenizer46 = new org.apache.commons.lang3.text.StrTokenizer("", strMatcher45);
        char[] charArray49 = new char[] { '4', ' ' };
        org.apache.commons.lang3.text.StrTokenizer strTokenizer52 = new org.apache.commons.lang3.text.StrTokenizer(charArray49, 'a', ' ');
        org.apache.commons.lang3.text.StrMatcher strMatcher53 = strTokenizer52.getTrimmerMatcher();
        org.apache.commons.lang3.text.StrTokenizer strTokenizer55 = strTokenizer52.setDelimiterString("");
        org.apache.commons.lang3.text.StrMatcher strMatcher56 = strTokenizer55.getTrimmerMatcher();
        org.apache.commons.lang3.text.StrTokenizer strTokenizer57 = strTokenizer46.setTrimmerMatcher(strMatcher56);
        org.apache.commons.lang3.text.StrTokenizer strTokenizer58 = strTokenizer34.setTrimmerMatcher(strMatcher56);
        org.apache.commons.lang3.text.StrMatcher strMatcher59 = strTokenizer34.getDelimiterMatcher();
        char[] charArray62 = new char[] { '4', ' ' };
        org.apache.commons.lang3.text.StrTokenizer strTokenizer65 = new org.apache.commons.lang3.text.StrTokenizer(charArray62, 'a', ' ');
        org.apache.commons.lang3.text.StrMatcher strMatcher66 = strTokenizer65.getTrimmerMatcher();
        org.apache.commons.lang3.text.StrTokenizer strTokenizer68 = strTokenizer65.setDelimiterString("");
        org.apache.commons.lang3.text.StrMatcher strMatcher69 = strTokenizer68.getTrimmerMatcher();
        org.apache.commons.lang3.text.StrTokenizer strTokenizer70 = new org.apache.commons.lang3.text.StrTokenizer(charArray17, strMatcher59, strMatcher69);
        org.apache.commons.lang3.text.StrTokenizer strTokenizer71 = strTokenizer5.setIgnoredMatcher(strMatcher69);
        org.apache.commons.lang3.text.StrTokenizer strTokenizer73 = strTokenizer71.setIgnoreEmptyTokens(false);
        org.apache.commons.lang3.text.StrTokenizer strTokenizer75 = strTokenizer71.setQuoteChar('a');
        org.apache.commons.lang3.text.StrMatcher strMatcher76 = strTokenizer71.getIgnoredMatcher();
        org.apache.commons.lang3.text.StrTokenizer strTokenizer78 = strTokenizer71.setEmptyTokenAsNull(true);
        org.apache.commons.lang3.text.StrTokenizer strTokenizer80 = strTokenizer78.setDelimiterChar(' ');
        java.lang.String str81 = strTokenizer78.nextToken();
        org.apache.commons.lang3.text.StrMatcher strMatcher82 = strTokenizer78.getDelimiterMatcher();
        org.junit.Assert.assertNotNull(charArray2);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray2), "4 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray2), "4 ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray2), "[4,  ]");
        org.junit.Assert.assertNotNull(strMatcher6);
        org.junit.Assert.assertNotNull(strMatcher7);
        org.junit.Assert.assertNotNull(charArray10);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray10), "4 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray10), "4 ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray10), "[4,  ]");
        org.junit.Assert.assertNotNull(strMatcher14);
        org.junit.Assert.assertNotNull(charArray17);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray17), "4 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray17), "4 ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray17), "[4,  ]");
        org.junit.Assert.assertNotNull(strTokenizer21);
        org.junit.Assert.assertNotNull(strTokenizer24);
        org.junit.Assert.assertNotNull(strTokenizer25);
        org.junit.Assert.assertNotNull(charArray28);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray28), "4 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray28), "4 ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray28), "[4,  ]");
        org.junit.Assert.assertNotNull(strMatcher32);
        org.junit.Assert.assertNotNull(strTokenizer34);
        org.junit.Assert.assertNotNull(charArray38);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray38), "4 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray38), "4 ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray38), "[4,  ]");
        org.junit.Assert.assertNotNull(strMatcher42);
        org.junit.Assert.assertNotNull(strTokenizer44);
        org.junit.Assert.assertNotNull(strMatcher45);
        org.junit.Assert.assertNotNull(charArray49);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray49), "4 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray49), "4 ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray49), "[4,  ]");
        org.junit.Assert.assertNotNull(strMatcher53);
        org.junit.Assert.assertNotNull(strTokenizer55);
        org.junit.Assert.assertNotNull(strMatcher56);
        org.junit.Assert.assertNotNull(strTokenizer57);
        org.junit.Assert.assertNotNull(strTokenizer58);
        org.junit.Assert.assertNotNull(strMatcher59);
        org.junit.Assert.assertNotNull(charArray62);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray62), "4 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray62), "4 ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray62), "[4,  ]");
        org.junit.Assert.assertNotNull(strMatcher66);
        org.junit.Assert.assertNotNull(strTokenizer68);
        org.junit.Assert.assertNotNull(strMatcher69);
        org.junit.Assert.assertNotNull(strTokenizer71);
        org.junit.Assert.assertNotNull(strTokenizer73);
        org.junit.Assert.assertNotNull(strTokenizer75);
        org.junit.Assert.assertNotNull(strMatcher76);
        org.junit.Assert.assertNotNull(strTokenizer78);
        org.junit.Assert.assertNotNull(strTokenizer80);
        org.junit.Assert.assertEquals("'" + str81 + "' != '" + "4" + "'", str81, "4");
        org.junit.Assert.assertNotNull(strMatcher82);
    }

    @Test
    public void test1586() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1586");
        char[] charArray2 = new char[] { '4', ' ' };
        org.apache.commons.lang3.text.StrTokenizer strTokenizer5 = new org.apache.commons.lang3.text.StrTokenizer(charArray2, 'a', ' ');
        org.apache.commons.lang3.text.StrMatcher strMatcher6 = strTokenizer5.getTrimmerMatcher();
        java.lang.String str7 = strTokenizer5.nextToken();
        char[] charArray10 = new char[] { '4', ' ' };
        org.apache.commons.lang3.text.StrTokenizer strTokenizer13 = new org.apache.commons.lang3.text.StrTokenizer(charArray10, 'a', ' ');
        org.apache.commons.lang3.text.StrMatcher strMatcher14 = strTokenizer13.getTrimmerMatcher();
        org.apache.commons.lang3.text.StrTokenizer strTokenizer16 = strTokenizer13.setDelimiterString("");
        org.apache.commons.lang3.text.StrMatcher strMatcher17 = strTokenizer16.getTrimmerMatcher();
        org.apache.commons.lang3.text.StrMatcher strMatcher18 = strTokenizer16.getTrimmerMatcher();
        char[] charArray21 = new char[] { '4', ' ' };
        org.apache.commons.lang3.text.StrTokenizer strTokenizer24 = new org.apache.commons.lang3.text.StrTokenizer(charArray21, 'a', ' ');
        org.apache.commons.lang3.text.StrTokenizer strTokenizer25 = strTokenizer16.reset(charArray21);
        org.apache.commons.lang3.text.StrTokenizer strTokenizer27 = new org.apache.commons.lang3.text.StrTokenizer(charArray21, "");
        org.apache.commons.lang3.text.StrTokenizer strTokenizer28 = strTokenizer5.reset(charArray21);
        org.apache.commons.lang3.text.StrMatcher strMatcher29 = strTokenizer28.getDelimiterMatcher();
        char[] charArray32 = new char[] { '4', ' ' };
        org.apache.commons.lang3.text.StrTokenizer strTokenizer35 = new org.apache.commons.lang3.text.StrTokenizer(charArray32, 'a', ' ');
        char[] charArray38 = new char[] { '4', ' ' };
        org.apache.commons.lang3.text.StrTokenizer strTokenizer41 = new org.apache.commons.lang3.text.StrTokenizer(charArray38, 'a', ' ');
        org.apache.commons.lang3.text.StrMatcher strMatcher42 = strTokenizer41.getTrimmerMatcher();
        org.apache.commons.lang3.text.StrTokenizer strTokenizer44 = strTokenizer41.setDelimiterString("");
        org.apache.commons.lang3.text.StrMatcher strMatcher45 = strTokenizer44.getTrimmerMatcher();
        org.apache.commons.lang3.text.StrMatcher strMatcher46 = strTokenizer44.getTrimmerMatcher();
        char[] charArray48 = null;
        org.apache.commons.lang3.text.StrTokenizer strTokenizer50 = new org.apache.commons.lang3.text.StrTokenizer(charArray48, "");
        java.lang.String str51 = strTokenizer50.getContent();
        org.apache.commons.lang3.text.StrMatcher strMatcher52 = strTokenizer50.getDelimiterMatcher();
        org.apache.commons.lang3.text.StrTokenizer strTokenizer53 = new org.apache.commons.lang3.text.StrTokenizer("hi!", strMatcher52);
        org.apache.commons.lang3.text.StrTokenizer strTokenizer54 = new org.apache.commons.lang3.text.StrTokenizer(charArray32, strMatcher46, strMatcher52);
        org.apache.commons.lang3.text.StrTokenizer strTokenizer55 = strTokenizer28.reset(charArray32);
        org.apache.commons.lang3.text.StrTokenizer strTokenizer57 = strTokenizer55.setEmptyTokenAsNull(false);
        int int58 = strTokenizer55.previousIndex();
        org.junit.Assert.assertNotNull(charArray2);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray2), "4 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray2), "4 ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray2), "[4,  ]");
        org.junit.Assert.assertNotNull(strMatcher6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "4 " + "'", str7, "4 ");
        org.junit.Assert.assertNotNull(charArray10);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray10), "4 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray10), "4 ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray10), "[4,  ]");
        org.junit.Assert.assertNotNull(strMatcher14);
        org.junit.Assert.assertNotNull(strTokenizer16);
        org.junit.Assert.assertNotNull(strMatcher17);
        org.junit.Assert.assertNotNull(strMatcher18);
        org.junit.Assert.assertNotNull(charArray21);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray21), "4 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray21), "4 ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray21), "[4,  ]");
        org.junit.Assert.assertNotNull(strTokenizer25);
        org.junit.Assert.assertNotNull(strTokenizer28);
        org.junit.Assert.assertNotNull(strMatcher29);
        org.junit.Assert.assertNotNull(charArray32);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray32), "4 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray32), "4 ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray32), "[4,  ]");
        org.junit.Assert.assertNotNull(charArray38);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray38), "4 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray38), "4 ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray38), "[4,  ]");
        org.junit.Assert.assertNotNull(strMatcher42);
        org.junit.Assert.assertNotNull(strTokenizer44);
        org.junit.Assert.assertNotNull(strMatcher45);
        org.junit.Assert.assertNotNull(strMatcher46);
        org.junit.Assert.assertNull(str51);
        org.junit.Assert.assertNotNull(strMatcher52);
        org.junit.Assert.assertNotNull(strTokenizer55);
        org.junit.Assert.assertNotNull(strTokenizer57);
        org.junit.Assert.assertTrue("'" + int58 + "' != '" + (-1) + "'", int58 == (-1));
    }

    @Test
    public void test1587() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1587");
        org.apache.commons.lang3.text.StrTokenizer strTokenizer2 = new org.apache.commons.lang3.text.StrTokenizer("StrTokenizer[not tokenized yet]", "4 ");
        org.apache.commons.lang3.text.StrTokenizer strTokenizer4 = strTokenizer2.reset("a#");
        org.junit.Assert.assertNotNull(strTokenizer4);
    }

    @Test
    public void test1588() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1588");
        org.apache.commons.lang3.text.StrTokenizer strTokenizer0 = org.apache.commons.lang3.text.StrTokenizer.getCSVInstance();
        boolean boolean1 = strTokenizer0.isIgnoreEmptyTokens();
        int int2 = strTokenizer0.nextIndex();
        org.apache.commons.lang3.text.StrTokenizer strTokenizer4 = strTokenizer0.setIgnoreEmptyTokens(false);
        org.apache.commons.lang3.text.StrMatcher strMatcher5 = null;
        org.apache.commons.lang3.text.StrTokenizer strTokenizer6 = strTokenizer4.setDelimiterMatcher(strMatcher5);
        org.apache.commons.lang3.text.StrMatcher strMatcher7 = strTokenizer4.getDelimiterMatcher();
        boolean boolean8 = strTokenizer4.isEmptyTokenAsNull();
        org.apache.commons.lang3.text.StrMatcher strMatcher9 = strTokenizer4.getQuoteMatcher();
        org.junit.Assert.assertNotNull(strTokenizer0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(strTokenizer4);
        org.junit.Assert.assertNotNull(strTokenizer6);
        org.junit.Assert.assertNotNull(strMatcher7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(strMatcher9);
    }

    @Test
    public void test1589() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1589");
        char[] charArray2 = new char[] { '4', ' ' };
        org.apache.commons.lang3.text.StrTokenizer strTokenizer5 = new org.apache.commons.lang3.text.StrTokenizer(charArray2, 'a', ' ');
        org.apache.commons.lang3.text.StrTokenizer strTokenizer6 = org.apache.commons.lang3.text.StrTokenizer.getCSVInstance(charArray2);
        org.apache.commons.lang3.text.StrMatcher strMatcher7 = null;
        org.apache.commons.lang3.text.StrTokenizer strTokenizer8 = new org.apache.commons.lang3.text.StrTokenizer(charArray2, strMatcher7);
        char[] charArray11 = new char[] { '4', ' ' };
        org.apache.commons.lang3.text.StrTokenizer strTokenizer14 = new org.apache.commons.lang3.text.StrTokenizer(charArray11, 'a', ' ');
        org.apache.commons.lang3.text.StrMatcher strMatcher15 = strTokenizer14.getTrimmerMatcher();
        org.apache.commons.lang3.text.StrTokenizer strTokenizer17 = strTokenizer14.setDelimiterString("");
        org.apache.commons.lang3.text.StrMatcher strMatcher18 = strTokenizer17.getTrimmerMatcher();
        org.apache.commons.lang3.text.StrTokenizer strTokenizer19 = new org.apache.commons.lang3.text.StrTokenizer(charArray2, strMatcher18);
        char[] charArray22 = new char[] { '4', ' ' };
        org.apache.commons.lang3.text.StrTokenizer strTokenizer25 = new org.apache.commons.lang3.text.StrTokenizer(charArray22, 'a', ' ');
        org.apache.commons.lang3.text.StrMatcher strMatcher26 = strTokenizer25.getTrimmerMatcher();
        org.apache.commons.lang3.text.StrTokenizer strTokenizer27 = new org.apache.commons.lang3.text.StrTokenizer(charArray2, strMatcher26);
        org.apache.commons.lang3.text.StrTokenizer strTokenizer28 = org.apache.commons.lang3.text.StrTokenizer.getTSVInstance(charArray2);
        org.apache.commons.lang3.text.StrTokenizer strTokenizer29 = org.apache.commons.lang3.text.StrTokenizer.getTSVInstance(charArray2);
        org.apache.commons.lang3.text.StrTokenizer strTokenizer30 = org.apache.commons.lang3.text.StrTokenizer.getTSVInstance(charArray2);
        org.junit.Assert.assertNotNull(charArray2);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray2), "4 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray2), "4 ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray2), "[4,  ]");
        org.junit.Assert.assertNotNull(strTokenizer6);
        org.junit.Assert.assertNotNull(charArray11);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray11), "4 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray11), "4 ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray11), "[4,  ]");
        org.junit.Assert.assertNotNull(strMatcher15);
        org.junit.Assert.assertNotNull(strTokenizer17);
        org.junit.Assert.assertNotNull(strMatcher18);
        org.junit.Assert.assertNotNull(charArray22);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray22), "4 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray22), "4 ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray22), "[4,  ]");
        org.junit.Assert.assertNotNull(strMatcher26);
        org.junit.Assert.assertNotNull(strTokenizer28);
        org.junit.Assert.assertNotNull(strTokenizer29);
        org.junit.Assert.assertNotNull(strTokenizer30);
    }

    @Test
    public void test1590() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1590");
        char[] charArray2 = new char[] { '4', ' ' };
        org.apache.commons.lang3.text.StrTokenizer strTokenizer5 = new org.apache.commons.lang3.text.StrTokenizer(charArray2, 'a', ' ');
        org.apache.commons.lang3.text.StrTokenizer strTokenizer6 = org.apache.commons.lang3.text.StrTokenizer.getTSVInstance(charArray2);
        org.apache.commons.lang3.text.StrTokenizer strTokenizer9 = new org.apache.commons.lang3.text.StrTokenizer(charArray2, '#', 'a');
        org.apache.commons.lang3.text.StrMatcher strMatcher10 = null;
        char[] charArray14 = new char[] { '4', ' ' };
        org.apache.commons.lang3.text.StrTokenizer strTokenizer17 = new org.apache.commons.lang3.text.StrTokenizer(charArray14, 'a', ' ');
        org.apache.commons.lang3.text.StrMatcher strMatcher18 = strTokenizer17.getTrimmerMatcher();
        org.apache.commons.lang3.text.StrTokenizer strTokenizer20 = strTokenizer17.setDelimiterString("");
        org.apache.commons.lang3.text.StrMatcher strMatcher21 = strTokenizer20.getTrimmerMatcher();
        org.apache.commons.lang3.text.StrTokenizer strTokenizer22 = new org.apache.commons.lang3.text.StrTokenizer("", strMatcher21);
        org.apache.commons.lang3.text.StrTokenizer strTokenizer23 = new org.apache.commons.lang3.text.StrTokenizer(charArray2, strMatcher10, strMatcher21);
        org.apache.commons.lang3.text.StrTokenizer strTokenizer25 = new org.apache.commons.lang3.text.StrTokenizer(charArray2, 'a');
        org.apache.commons.lang3.text.StrTokenizer strTokenizer27 = strTokenizer25.setEmptyTokenAsNull(true);
        org.apache.commons.lang3.text.StrTokenizer strTokenizer29 = strTokenizer25.setIgnoreEmptyTokens(false);
        org.junit.Assert.assertNotNull(charArray2);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray2), "4 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray2), "4 ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray2), "[4,  ]");
        org.junit.Assert.assertNotNull(strTokenizer6);
        org.junit.Assert.assertNotNull(charArray14);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray14), "4 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray14), "4 ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray14), "[4,  ]");
        org.junit.Assert.assertNotNull(strMatcher18);
        org.junit.Assert.assertNotNull(strTokenizer20);
        org.junit.Assert.assertNotNull(strMatcher21);
        org.junit.Assert.assertNotNull(strTokenizer27);
        org.junit.Assert.assertNotNull(strTokenizer29);
    }

    @Test
    public void test1591() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1591");
        char[] charArray2 = new char[] { '4', ' ' };
        org.apache.commons.lang3.text.StrTokenizer strTokenizer5 = new org.apache.commons.lang3.text.StrTokenizer(charArray2, 'a', ' ');
        org.apache.commons.lang3.text.StrTokenizer strTokenizer6 = org.apache.commons.lang3.text.StrTokenizer.getTSVInstance(charArray2);
        java.lang.String str7 = strTokenizer6.getContent();
        org.apache.commons.lang3.text.StrTokenizer strTokenizer9 = strTokenizer6.setEmptyTokenAsNull(true);
        boolean boolean10 = strTokenizer6.hasNext();
        org.junit.Assert.assertNotNull(charArray2);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray2), "4 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray2), "4 ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray2), "[4,  ]");
        org.junit.Assert.assertNotNull(strTokenizer6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "4 " + "'", str7, "4 ");
        org.junit.Assert.assertNotNull(strTokenizer9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test1592() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1592");
        char[] charArray2 = new char[] { '4', ' ' };
        org.apache.commons.lang3.text.StrTokenizer strTokenizer5 = new org.apache.commons.lang3.text.StrTokenizer(charArray2, 'a', ' ');
        org.apache.commons.lang3.text.StrTokenizer strTokenizer8 = new org.apache.commons.lang3.text.StrTokenizer(charArray2, '4', 'a');
        char[] charArray11 = new char[] { '4', ' ' };
        org.apache.commons.lang3.text.StrTokenizer strTokenizer14 = new org.apache.commons.lang3.text.StrTokenizer(charArray11, 'a', ' ');
        org.apache.commons.lang3.text.StrTokenizer strTokenizer17 = new org.apache.commons.lang3.text.StrTokenizer(charArray11, '4', 'a');
        org.apache.commons.lang3.text.StrTokenizer strTokenizer19 = strTokenizer17.setIgnoreEmptyTokens(true);
        org.apache.commons.lang3.text.StrMatcher strMatcher20 = strTokenizer17.getIgnoredMatcher();
        char[] charArray23 = new char[] { '4', ' ' };
        org.apache.commons.lang3.text.StrTokenizer strTokenizer26 = new org.apache.commons.lang3.text.StrTokenizer(charArray23, 'a', ' ');
        org.apache.commons.lang3.text.StrMatcher strMatcher27 = strTokenizer26.getTrimmerMatcher();
        org.apache.commons.lang3.text.StrTokenizer strTokenizer29 = strTokenizer26.setDelimiterString("");
        org.apache.commons.lang3.text.StrMatcher strMatcher30 = strTokenizer29.getTrimmerMatcher();
        org.apache.commons.lang3.text.StrMatcher strMatcher31 = strTokenizer29.getTrimmerMatcher();
        char[] charArray34 = new char[] { '4', ' ' };
        org.apache.commons.lang3.text.StrTokenizer strTokenizer37 = new org.apache.commons.lang3.text.StrTokenizer(charArray34, 'a', ' ');
        org.apache.commons.lang3.text.StrTokenizer strTokenizer38 = strTokenizer29.reset(charArray34);
        char[] charArray41 = new char[] { '4', ' ' };
        org.apache.commons.lang3.text.StrTokenizer strTokenizer44 = new org.apache.commons.lang3.text.StrTokenizer(charArray41, 'a', ' ');
        org.apache.commons.lang3.text.StrMatcher strMatcher45 = strTokenizer44.getTrimmerMatcher();
        org.apache.commons.lang3.text.StrTokenizer strTokenizer47 = strTokenizer44.setDelimiterString("");
        char[] charArray51 = new char[] { '4', ' ' };
        org.apache.commons.lang3.text.StrTokenizer strTokenizer54 = new org.apache.commons.lang3.text.StrTokenizer(charArray51, 'a', ' ');
        org.apache.commons.lang3.text.StrMatcher strMatcher55 = strTokenizer54.getTrimmerMatcher();
        org.apache.commons.lang3.text.StrTokenizer strTokenizer57 = strTokenizer54.setDelimiterString("");
        org.apache.commons.lang3.text.StrMatcher strMatcher58 = strTokenizer57.getTrimmerMatcher();
        org.apache.commons.lang3.text.StrTokenizer strTokenizer59 = new org.apache.commons.lang3.text.StrTokenizer("", strMatcher58);
        char[] charArray62 = new char[] { '4', ' ' };
        org.apache.commons.lang3.text.StrTokenizer strTokenizer65 = new org.apache.commons.lang3.text.StrTokenizer(charArray62, 'a', ' ');
        org.apache.commons.lang3.text.StrMatcher strMatcher66 = strTokenizer65.getTrimmerMatcher();
        org.apache.commons.lang3.text.StrTokenizer strTokenizer68 = strTokenizer65.setDelimiterString("");
        org.apache.commons.lang3.text.StrMatcher strMatcher69 = strTokenizer68.getTrimmerMatcher();
        org.apache.commons.lang3.text.StrTokenizer strTokenizer70 = strTokenizer59.setTrimmerMatcher(strMatcher69);
        org.apache.commons.lang3.text.StrTokenizer strTokenizer71 = strTokenizer47.setTrimmerMatcher(strMatcher69);
        org.apache.commons.lang3.text.StrTokenizer strTokenizer72 = strTokenizer29.setQuoteMatcher(strMatcher69);
        org.apache.commons.lang3.text.StrTokenizer strTokenizer73 = new org.apache.commons.lang3.text.StrTokenizer(charArray2, strMatcher20, strMatcher69);
        org.apache.commons.lang3.text.StrTokenizer strTokenizer74 = org.apache.commons.lang3.text.StrTokenizer.getTSVInstance(charArray2);
        org.apache.commons.lang3.text.StrTokenizer strTokenizer76 = new org.apache.commons.lang3.text.StrTokenizer(charArray2, '#');
        org.junit.Assert.assertNotNull(charArray2);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray2), "4 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray2), "4 ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray2), "[4,  ]");
        org.junit.Assert.assertNotNull(charArray11);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray11), "4 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray11), "4 ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray11), "[4,  ]");
        org.junit.Assert.assertNotNull(strTokenizer19);
        org.junit.Assert.assertNotNull(strMatcher20);
        org.junit.Assert.assertNotNull(charArray23);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray23), "4 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray23), "4 ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray23), "[4,  ]");
        org.junit.Assert.assertNotNull(strMatcher27);
        org.junit.Assert.assertNotNull(strTokenizer29);
        org.junit.Assert.assertNotNull(strMatcher30);
        org.junit.Assert.assertNotNull(strMatcher31);
        org.junit.Assert.assertNotNull(charArray34);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray34), "4 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray34), "4 ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray34), "[4,  ]");
        org.junit.Assert.assertNotNull(strTokenizer38);
        org.junit.Assert.assertNotNull(charArray41);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray41), "4 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray41), "4 ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray41), "[4,  ]");
        org.junit.Assert.assertNotNull(strMatcher45);
        org.junit.Assert.assertNotNull(strTokenizer47);
        org.junit.Assert.assertNotNull(charArray51);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray51), "4 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray51), "4 ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray51), "[4,  ]");
        org.junit.Assert.assertNotNull(strMatcher55);
        org.junit.Assert.assertNotNull(strTokenizer57);
        org.junit.Assert.assertNotNull(strMatcher58);
        org.junit.Assert.assertNotNull(charArray62);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray62), "4 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray62), "4 ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray62), "[4,  ]");
        org.junit.Assert.assertNotNull(strMatcher66);
        org.junit.Assert.assertNotNull(strTokenizer68);
        org.junit.Assert.assertNotNull(strMatcher69);
        org.junit.Assert.assertNotNull(strTokenizer70);
        org.junit.Assert.assertNotNull(strTokenizer71);
        org.junit.Assert.assertNotNull(strTokenizer72);
        org.junit.Assert.assertNotNull(strTokenizer74);
    }

    @Test
    public void test1593() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1593");
        org.apache.commons.lang3.text.StrTokenizer strTokenizer2 = new org.apache.commons.lang3.text.StrTokenizer("StrTokenizer[4 ]", 'a');
        int int3 = strTokenizer2.size();
        char[] charArray4 = null;
        org.apache.commons.lang3.text.StrTokenizer strTokenizer6 = new org.apache.commons.lang3.text.StrTokenizer(charArray4, "");
        java.lang.String str7 = strTokenizer6.getContent();
        org.apache.commons.lang3.text.StrMatcher strMatcher8 = strTokenizer6.getTrimmerMatcher();
        org.apache.commons.lang3.text.StrTokenizer strTokenizer9 = strTokenizer2.setIgnoredMatcher(strMatcher8);
        char[] charArray12 = new char[] { 'a', '#' };
        org.apache.commons.lang3.text.StrTokenizer strTokenizer13 = org.apache.commons.lang3.text.StrTokenizer.getCSVInstance(charArray12);
        org.apache.commons.lang3.text.StrMatcher strMatcher14 = strTokenizer13.getIgnoredMatcher();
        org.apache.commons.lang3.text.StrTokenizer strTokenizer15 = strTokenizer2.setIgnoredMatcher(strMatcher14);
        org.apache.commons.lang3.text.StrTokenizer strTokenizer17 = strTokenizer15.setDelimiterChar('a');
        char[] charArray19 = null;
        org.apache.commons.lang3.text.StrTokenizer strTokenizer21 = new org.apache.commons.lang3.text.StrTokenizer(charArray19, "");
        java.lang.String str22 = strTokenizer21.getContent();
        org.apache.commons.lang3.text.StrMatcher strMatcher23 = strTokenizer21.getDelimiterMatcher();
        org.apache.commons.lang3.text.StrTokenizer strTokenizer24 = new org.apache.commons.lang3.text.StrTokenizer("StrTokenizer[4 ]", strMatcher23);
        org.apache.commons.lang3.text.StrTokenizer strTokenizer25 = strTokenizer15.setQuoteMatcher(strMatcher23);
        java.lang.String str26 = strTokenizer25.previousToken();
        int int27 = strTokenizer25.size();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNotNull(strMatcher8);
        org.junit.Assert.assertNotNull(strTokenizer9);
        org.junit.Assert.assertNotNull(charArray12);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray12), "a#");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray12), "a#");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray12), "[a, #]");
        org.junit.Assert.assertNotNull(strTokenizer13);
        org.junit.Assert.assertNotNull(strMatcher14);
        org.junit.Assert.assertNotNull(strTokenizer15);
        org.junit.Assert.assertNotNull(strTokenizer17);
        org.junit.Assert.assertNull(str22);
        org.junit.Assert.assertNotNull(strMatcher23);
        org.junit.Assert.assertNotNull(strTokenizer25);
        org.junit.Assert.assertNull(str26);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 1 + "'", int27 == 1);
    }

    @Test
    public void test1594() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1594");
        char[] charArray2 = new char[] { '4', ' ' };
        org.apache.commons.lang3.text.StrTokenizer strTokenizer5 = new org.apache.commons.lang3.text.StrTokenizer(charArray2, 'a', ' ');
        org.apache.commons.lang3.text.StrMatcher strMatcher6 = strTokenizer5.getTrimmerMatcher();
        char[] charArray9 = new char[] { '4', ' ' };
        org.apache.commons.lang3.text.StrTokenizer strTokenizer12 = new org.apache.commons.lang3.text.StrTokenizer(charArray9, 'a', ' ');
        org.apache.commons.lang3.text.StrTokenizer strTokenizer13 = org.apache.commons.lang3.text.StrTokenizer.getCSVInstance(charArray9);
        org.apache.commons.lang3.text.StrMatcher strMatcher14 = null;
        org.apache.commons.lang3.text.StrTokenizer strTokenizer15 = new org.apache.commons.lang3.text.StrTokenizer(charArray9, strMatcher14);
        org.apache.commons.lang3.text.StrTokenizer strTokenizer16 = strTokenizer5.reset(charArray9);
        int int17 = strTokenizer5.nextIndex();
        org.apache.commons.lang3.text.StrTokenizer strTokenizer18 = strTokenizer5.reset();
        int int19 = strTokenizer5.nextIndex();
        boolean boolean20 = strTokenizer5.isEmptyTokenAsNull();
        org.junit.Assert.assertNotNull(charArray2);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray2), "4 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray2), "4 ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray2), "[4,  ]");
        org.junit.Assert.assertNotNull(strMatcher6);
        org.junit.Assert.assertNotNull(charArray9);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray9), "4 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray9), "4 ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray9), "[4,  ]");
        org.junit.Assert.assertNotNull(strTokenizer13);
        org.junit.Assert.assertNotNull(strTokenizer16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertNotNull(strTokenizer18);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test1595() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1595");
        org.apache.commons.lang3.text.StrTokenizer strTokenizer3 = new org.apache.commons.lang3.text.StrTokenizer("StrTokenizer[a#]", ' ', '4');
        org.apache.commons.lang3.text.StrTokenizer strTokenizer5 = strTokenizer3.setIgnoreEmptyTokens(true);
        org.junit.Assert.assertNotNull(strTokenizer5);
    }

    @Test
    public void test1596() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1596");
        char[] charArray2 = new char[] { '4', ' ' };
        org.apache.commons.lang3.text.StrTokenizer strTokenizer5 = new org.apache.commons.lang3.text.StrTokenizer(charArray2, 'a', ' ');
        org.apache.commons.lang3.text.StrMatcher strMatcher6 = strTokenizer5.getTrimmerMatcher();
        char[] charArray9 = new char[] { '4', ' ' };
        org.apache.commons.lang3.text.StrTokenizer strTokenizer12 = new org.apache.commons.lang3.text.StrTokenizer(charArray9, 'a', ' ');
        org.apache.commons.lang3.text.StrTokenizer strTokenizer13 = org.apache.commons.lang3.text.StrTokenizer.getCSVInstance(charArray9);
        org.apache.commons.lang3.text.StrMatcher strMatcher14 = null;
        org.apache.commons.lang3.text.StrTokenizer strTokenizer15 = new org.apache.commons.lang3.text.StrTokenizer(charArray9, strMatcher14);
        org.apache.commons.lang3.text.StrTokenizer strTokenizer16 = strTokenizer5.reset(charArray9);
        org.apache.commons.lang3.text.StrTokenizer strTokenizer17 = org.apache.commons.lang3.text.StrTokenizer.getCSVInstance(charArray9);
        boolean boolean18 = strTokenizer17.isEmptyTokenAsNull();
        boolean boolean19 = strTokenizer17.hasNext();
        org.apache.commons.lang3.text.StrTokenizer strTokenizer21 = strTokenizer17.setIgnoreEmptyTokens(true);
        org.apache.commons.lang3.text.StrMatcher strMatcher22 = strTokenizer17.getTrimmerMatcher();
        int int23 = strTokenizer17.previousIndex();
        org.junit.Assert.assertNotNull(charArray2);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray2), "4 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray2), "4 ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray2), "[4,  ]");
        org.junit.Assert.assertNotNull(strMatcher6);
        org.junit.Assert.assertNotNull(charArray9);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray9), "4 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray9), "4 ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray9), "[4,  ]");
        org.junit.Assert.assertNotNull(strTokenizer13);
        org.junit.Assert.assertNotNull(strTokenizer16);
        org.junit.Assert.assertNotNull(strTokenizer17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNotNull(strTokenizer21);
        org.junit.Assert.assertNotNull(strMatcher22);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + (-1) + "'", int23 == (-1));
    }

    @Test
    public void test1597() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1597");
        char[] charArray2 = new char[] { '4', ' ' };
        org.apache.commons.lang3.text.StrTokenizer strTokenizer5 = new org.apache.commons.lang3.text.StrTokenizer(charArray2, 'a', ' ');
        org.apache.commons.lang3.text.StrMatcher strMatcher6 = strTokenizer5.getTrimmerMatcher();
        org.apache.commons.lang3.text.StrMatcher strMatcher7 = strTokenizer5.getQuoteMatcher();
        char[] charArray10 = new char[] { '4', ' ' };
        org.apache.commons.lang3.text.StrTokenizer strTokenizer13 = new org.apache.commons.lang3.text.StrTokenizer(charArray10, 'a', ' ');
        org.apache.commons.lang3.text.StrMatcher strMatcher14 = strTokenizer13.getTrimmerMatcher();
        char[] charArray17 = new char[] { '4', ' ' };
        org.apache.commons.lang3.text.StrTokenizer strTokenizer20 = new org.apache.commons.lang3.text.StrTokenizer(charArray17, 'a', ' ');
        org.apache.commons.lang3.text.StrTokenizer strTokenizer21 = org.apache.commons.lang3.text.StrTokenizer.getCSVInstance(charArray17);
        org.apache.commons.lang3.text.StrMatcher strMatcher22 = null;
        org.apache.commons.lang3.text.StrTokenizer strTokenizer23 = new org.apache.commons.lang3.text.StrTokenizer(charArray17, strMatcher22);
        org.apache.commons.lang3.text.StrTokenizer strTokenizer24 = strTokenizer13.reset(charArray17);
        org.apache.commons.lang3.text.StrTokenizer strTokenizer25 = org.apache.commons.lang3.text.StrTokenizer.getCSVInstance(charArray17);
        char[] charArray28 = new char[] { '4', ' ' };
        org.apache.commons.lang3.text.StrTokenizer strTokenizer31 = new org.apache.commons.lang3.text.StrTokenizer(charArray28, 'a', ' ');
        org.apache.commons.lang3.text.StrMatcher strMatcher32 = strTokenizer31.getTrimmerMatcher();
        org.apache.commons.lang3.text.StrTokenizer strTokenizer34 = strTokenizer31.setDelimiterString("");
        char[] charArray38 = new char[] { '4', ' ' };
        org.apache.commons.lang3.text.StrTokenizer strTokenizer41 = new org.apache.commons.lang3.text.StrTokenizer(charArray38, 'a', ' ');
        org.apache.commons.lang3.text.StrMatcher strMatcher42 = strTokenizer41.getTrimmerMatcher();
        org.apache.commons.lang3.text.StrTokenizer strTokenizer44 = strTokenizer41.setDelimiterString("");
        org.apache.commons.lang3.text.StrMatcher strMatcher45 = strTokenizer44.getTrimmerMatcher();
        org.apache.commons.lang3.text.StrTokenizer strTokenizer46 = new org.apache.commons.lang3.text.StrTokenizer("", strMatcher45);
        char[] charArray49 = new char[] { '4', ' ' };
        org.apache.commons.lang3.text.StrTokenizer strTokenizer52 = new org.apache.commons.lang3.text.StrTokenizer(charArray49, 'a', ' ');
        org.apache.commons.lang3.text.StrMatcher strMatcher53 = strTokenizer52.getTrimmerMatcher();
        org.apache.commons.lang3.text.StrTokenizer strTokenizer55 = strTokenizer52.setDelimiterString("");
        org.apache.commons.lang3.text.StrMatcher strMatcher56 = strTokenizer55.getTrimmerMatcher();
        org.apache.commons.lang3.text.StrTokenizer strTokenizer57 = strTokenizer46.setTrimmerMatcher(strMatcher56);
        org.apache.commons.lang3.text.StrTokenizer strTokenizer58 = strTokenizer34.setTrimmerMatcher(strMatcher56);
        org.apache.commons.lang3.text.StrMatcher strMatcher59 = strTokenizer34.getDelimiterMatcher();
        char[] charArray62 = new char[] { '4', ' ' };
        org.apache.commons.lang3.text.StrTokenizer strTokenizer65 = new org.apache.commons.lang3.text.StrTokenizer(charArray62, 'a', ' ');
        org.apache.commons.lang3.text.StrMatcher strMatcher66 = strTokenizer65.getTrimmerMatcher();
        org.apache.commons.lang3.text.StrTokenizer strTokenizer68 = strTokenizer65.setDelimiterString("");
        org.apache.commons.lang3.text.StrMatcher strMatcher69 = strTokenizer68.getTrimmerMatcher();
        org.apache.commons.lang3.text.StrTokenizer strTokenizer70 = new org.apache.commons.lang3.text.StrTokenizer(charArray17, strMatcher59, strMatcher69);
        org.apache.commons.lang3.text.StrTokenizer strTokenizer71 = strTokenizer5.setIgnoredMatcher(strMatcher69);
        org.apache.commons.lang3.text.StrTokenizer strTokenizer73 = strTokenizer71.setIgnoreEmptyTokens(false);
        org.apache.commons.lang3.text.StrTokenizer strTokenizer75 = strTokenizer71.setQuoteChar('a');
        org.apache.commons.lang3.text.StrMatcher strMatcher76 = strTokenizer71.getIgnoredMatcher();
        org.apache.commons.lang3.text.StrTokenizer strTokenizer78 = strTokenizer71.setEmptyTokenAsNull(true);
        // The following exception was thrown during execution in test generation
        try {
            strTokenizer71.add("#");
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: add() is unsupported");
        } catch (java.lang.UnsupportedOperationException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray2);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray2), "4 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray2), "4 ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray2), "[4,  ]");
        org.junit.Assert.assertNotNull(strMatcher6);
        org.junit.Assert.assertNotNull(strMatcher7);
        org.junit.Assert.assertNotNull(charArray10);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray10), "4 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray10), "4 ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray10), "[4,  ]");
        org.junit.Assert.assertNotNull(strMatcher14);
        org.junit.Assert.assertNotNull(charArray17);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray17), "4 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray17), "4 ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray17), "[4,  ]");
        org.junit.Assert.assertNotNull(strTokenizer21);
        org.junit.Assert.assertNotNull(strTokenizer24);
        org.junit.Assert.assertNotNull(strTokenizer25);
        org.junit.Assert.assertNotNull(charArray28);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray28), "4 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray28), "4 ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray28), "[4,  ]");
        org.junit.Assert.assertNotNull(strMatcher32);
        org.junit.Assert.assertNotNull(strTokenizer34);
        org.junit.Assert.assertNotNull(charArray38);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray38), "4 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray38), "4 ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray38), "[4,  ]");
        org.junit.Assert.assertNotNull(strMatcher42);
        org.junit.Assert.assertNotNull(strTokenizer44);
        org.junit.Assert.assertNotNull(strMatcher45);
        org.junit.Assert.assertNotNull(charArray49);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray49), "4 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray49), "4 ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray49), "[4,  ]");
        org.junit.Assert.assertNotNull(strMatcher53);
        org.junit.Assert.assertNotNull(strTokenizer55);
        org.junit.Assert.assertNotNull(strMatcher56);
        org.junit.Assert.assertNotNull(strTokenizer57);
        org.junit.Assert.assertNotNull(strTokenizer58);
        org.junit.Assert.assertNotNull(strMatcher59);
        org.junit.Assert.assertNotNull(charArray62);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray62), "4 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray62), "4 ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray62), "[4,  ]");
        org.junit.Assert.assertNotNull(strMatcher66);
        org.junit.Assert.assertNotNull(strTokenizer68);
        org.junit.Assert.assertNotNull(strMatcher69);
        org.junit.Assert.assertNotNull(strTokenizer71);
        org.junit.Assert.assertNotNull(strTokenizer73);
        org.junit.Assert.assertNotNull(strTokenizer75);
        org.junit.Assert.assertNotNull(strMatcher76);
        org.junit.Assert.assertNotNull(strTokenizer78);
    }

    @Test
    public void test1598() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1598");
        char[] charArray2 = new char[] { '4', ' ' };
        org.apache.commons.lang3.text.StrTokenizer strTokenizer5 = new org.apache.commons.lang3.text.StrTokenizer(charArray2, 'a', ' ');
        org.apache.commons.lang3.text.StrMatcher strMatcher6 = strTokenizer5.getTrimmerMatcher();
        java.lang.String str7 = strTokenizer5.toString();
        org.junit.Assert.assertNotNull(charArray2);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray2), "4 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray2), "4 ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray2), "[4,  ]");
        org.junit.Assert.assertNotNull(strMatcher6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "StrTokenizer[not tokenized yet]" + "'", str7, "StrTokenizer[not tokenized yet]");
    }

    @Test
    public void test1599() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1599");
        org.apache.commons.lang3.text.StrTokenizer strTokenizer3 = new org.apache.commons.lang3.text.StrTokenizer("4 ", ' ', '4');
        org.apache.commons.lang3.text.StrTokenizer strTokenizer5 = strTokenizer3.reset("hi!");
        boolean boolean6 = strTokenizer5.isIgnoreEmptyTokens();
        org.junit.Assert.assertNotNull(strTokenizer5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test1600() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1600");
        org.apache.commons.lang3.text.StrTokenizer strTokenizer3 = new org.apache.commons.lang3.text.StrTokenizer("StrTokenizer[StrTokenizer[4 ]]", '4', '4');
        java.lang.String str4 = strTokenizer3.toString();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "StrTokenizer[not tokenized yet]" + "'", str4, "StrTokenizer[not tokenized yet]");
    }

    @Test
    public void test1601() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1601");
        char[] charArray2 = new char[] { '4', ' ' };
        org.apache.commons.lang3.text.StrTokenizer strTokenizer5 = new org.apache.commons.lang3.text.StrTokenizer(charArray2, 'a', ' ');
        org.apache.commons.lang3.text.StrTokenizer strTokenizer6 = org.apache.commons.lang3.text.StrTokenizer.getCSVInstance(charArray2);
        org.apache.commons.lang3.text.StrTokenizer strTokenizer8 = new org.apache.commons.lang3.text.StrTokenizer(charArray2, '4');
        org.apache.commons.lang3.text.StrTokenizer strTokenizer9 = new org.apache.commons.lang3.text.StrTokenizer(charArray2);
        org.apache.commons.lang3.text.StrTokenizer strTokenizer10 = org.apache.commons.lang3.text.StrTokenizer.getCSVInstance(charArray2);
        int int11 = strTokenizer10.nextIndex();
        char[] charArray17 = new char[] { '#', ' ', ' ', 'a', '#' };
        org.apache.commons.lang3.text.StrTokenizer strTokenizer20 = new org.apache.commons.lang3.text.StrTokenizer(charArray17, '#', ' ');
        org.apache.commons.lang3.text.StrTokenizer strTokenizer22 = new org.apache.commons.lang3.text.StrTokenizer(charArray17, "StrTokenizer[]");
        org.apache.commons.lang3.text.StrTokenizer strTokenizer23 = strTokenizer10.reset(charArray17);
        org.junit.Assert.assertNotNull(charArray2);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray2), "4 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray2), "4 ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray2), "[4,  ]");
        org.junit.Assert.assertNotNull(strTokenizer6);
        org.junit.Assert.assertNotNull(strTokenizer10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNotNull(charArray17);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray17), "#  a#");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray17), "#  a#");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray17), "[#,  ,  , a, #]");
        org.junit.Assert.assertNotNull(strTokenizer23);
    }

    @Test
    public void test1602() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1602");
        org.apache.commons.lang3.text.StrTokenizer strTokenizer1 = org.apache.commons.lang3.text.StrTokenizer.getCSVInstance("");
        org.apache.commons.lang3.text.StrTokenizer strTokenizer3 = org.apache.commons.lang3.text.StrTokenizer.getCSVInstance("hi!");
        char[] charArray6 = new char[] { 'a', '#' };
        org.apache.commons.lang3.text.StrTokenizer strTokenizer7 = org.apache.commons.lang3.text.StrTokenizer.getCSVInstance(charArray6);
        org.apache.commons.lang3.text.StrTokenizer strTokenizer8 = strTokenizer3.reset(charArray6);
        org.apache.commons.lang3.text.StrTokenizer strTokenizer9 = strTokenizer1.reset(charArray6);
        org.apache.commons.lang3.text.StrTokenizer strTokenizer11 = new org.apache.commons.lang3.text.StrTokenizer(charArray6, 'a');
        java.lang.Class<?> wildcardClass12 = charArray6.getClass();
        org.junit.Assert.assertNotNull(strTokenizer1);
        org.junit.Assert.assertNotNull(strTokenizer3);
        org.junit.Assert.assertNotNull(charArray6);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray6), "a#");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray6), "a#");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray6), "[a, #]");
        org.junit.Assert.assertNotNull(strTokenizer7);
        org.junit.Assert.assertNotNull(strTokenizer8);
        org.junit.Assert.assertNotNull(strTokenizer9);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test1603() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1603");
        org.apache.commons.lang3.text.StrTokenizer strTokenizer2 = new org.apache.commons.lang3.text.StrTokenizer("hi!", " ");
        char[] charArray5 = new char[] { '4', ' ' };
        org.apache.commons.lang3.text.StrTokenizer strTokenizer8 = new org.apache.commons.lang3.text.StrTokenizer(charArray5, 'a', ' ');
        org.apache.commons.lang3.text.StrMatcher strMatcher9 = strTokenizer8.getTrimmerMatcher();
        org.apache.commons.lang3.text.StrTokenizer strTokenizer11 = strTokenizer8.setDelimiterString("");
        char[] charArray15 = new char[] { '4', ' ' };
        org.apache.commons.lang3.text.StrTokenizer strTokenizer18 = new org.apache.commons.lang3.text.StrTokenizer(charArray15, 'a', ' ');
        org.apache.commons.lang3.text.StrMatcher strMatcher19 = strTokenizer18.getTrimmerMatcher();
        org.apache.commons.lang3.text.StrTokenizer strTokenizer21 = strTokenizer18.setDelimiterString("");
        org.apache.commons.lang3.text.StrMatcher strMatcher22 = strTokenizer21.getTrimmerMatcher();
        org.apache.commons.lang3.text.StrTokenizer strTokenizer23 = new org.apache.commons.lang3.text.StrTokenizer("", strMatcher22);
        char[] charArray26 = new char[] { '4', ' ' };
        org.apache.commons.lang3.text.StrTokenizer strTokenizer29 = new org.apache.commons.lang3.text.StrTokenizer(charArray26, 'a', ' ');
        org.apache.commons.lang3.text.StrMatcher strMatcher30 = strTokenizer29.getTrimmerMatcher();
        org.apache.commons.lang3.text.StrTokenizer strTokenizer32 = strTokenizer29.setDelimiterString("");
        org.apache.commons.lang3.text.StrMatcher strMatcher33 = strTokenizer32.getTrimmerMatcher();
        org.apache.commons.lang3.text.StrTokenizer strTokenizer34 = strTokenizer23.setTrimmerMatcher(strMatcher33);
        org.apache.commons.lang3.text.StrTokenizer strTokenizer35 = strTokenizer11.setTrimmerMatcher(strMatcher33);
        java.lang.String str36 = strTokenizer11.getContent();
        char[] charArray39 = new char[] { '4', ' ' };
        org.apache.commons.lang3.text.StrTokenizer strTokenizer42 = new org.apache.commons.lang3.text.StrTokenizer(charArray39, 'a', ' ');
        org.apache.commons.lang3.text.StrTokenizer strTokenizer45 = new org.apache.commons.lang3.text.StrTokenizer(charArray39, '4', 'a');
        char[] charArray48 = new char[] { '4', ' ' };
        org.apache.commons.lang3.text.StrTokenizer strTokenizer51 = new org.apache.commons.lang3.text.StrTokenizer(charArray48, 'a', ' ');
        org.apache.commons.lang3.text.StrMatcher strMatcher52 = strTokenizer51.getTrimmerMatcher();
        org.apache.commons.lang3.text.StrMatcher strMatcher53 = strTokenizer51.getQuoteMatcher();
        org.apache.commons.lang3.text.StrTokenizer strTokenizer54 = new org.apache.commons.lang3.text.StrTokenizer(charArray39, strMatcher53);
        org.apache.commons.lang3.text.StrTokenizer strTokenizer55 = strTokenizer11.reset(charArray39);
        java.util.List<java.lang.String> strList56 = strTokenizer55.getTokenList();
        java.lang.String str57 = strTokenizer55.toString();
        org.apache.commons.lang3.text.StrTokenizer strTokenizer60 = new org.apache.commons.lang3.text.StrTokenizer("StrTokenizer[4 ]", 'a');
        int int61 = strTokenizer60.size();
        char[] charArray62 = null;
        org.apache.commons.lang3.text.StrTokenizer strTokenizer64 = new org.apache.commons.lang3.text.StrTokenizer(charArray62, "");
        java.lang.String str65 = strTokenizer64.getContent();
        org.apache.commons.lang3.text.StrMatcher strMatcher66 = strTokenizer64.getTrimmerMatcher();
        org.apache.commons.lang3.text.StrTokenizer strTokenizer67 = strTokenizer60.setIgnoredMatcher(strMatcher66);
        org.apache.commons.lang3.text.StrTokenizer strTokenizer68 = strTokenizer55.setTrimmerMatcher(strMatcher66);
        org.apache.commons.lang3.text.StrTokenizer strTokenizer69 = strTokenizer2.setQuoteMatcher(strMatcher66);
        java.lang.String str70 = strTokenizer69.next();
        org.apache.commons.lang3.text.StrTokenizer strTokenizer72 = strTokenizer69.setEmptyTokenAsNull(false);
        int int73 = strTokenizer72.previousIndex();
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray5), "4 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray5), "4 ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray5), "[4,  ]");
        org.junit.Assert.assertNotNull(strMatcher9);
        org.junit.Assert.assertNotNull(strTokenizer11);
        org.junit.Assert.assertNotNull(charArray15);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray15), "4 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray15), "4 ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray15), "[4,  ]");
        org.junit.Assert.assertNotNull(strMatcher19);
        org.junit.Assert.assertNotNull(strTokenizer21);
        org.junit.Assert.assertNotNull(strMatcher22);
        org.junit.Assert.assertNotNull(charArray26);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray26), "4 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray26), "4 ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray26), "[4,  ]");
        org.junit.Assert.assertNotNull(strMatcher30);
        org.junit.Assert.assertNotNull(strTokenizer32);
        org.junit.Assert.assertNotNull(strMatcher33);
        org.junit.Assert.assertNotNull(strTokenizer34);
        org.junit.Assert.assertNotNull(strTokenizer35);
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "4 " + "'", str36, "4 ");
        org.junit.Assert.assertNotNull(charArray39);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray39), "4 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray39), "4 ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray39), "[4,  ]");
        org.junit.Assert.assertNotNull(charArray48);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray48), "4 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray48), "4 ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray48), "[4,  ]");
        org.junit.Assert.assertNotNull(strMatcher52);
        org.junit.Assert.assertNotNull(strMatcher53);
        org.junit.Assert.assertNotNull(strTokenizer55);
        org.junit.Assert.assertNotNull(strList56);
        org.junit.Assert.assertEquals("'" + str57 + "' != '" + "StrTokenizer[4 ]" + "'", str57, "StrTokenizer[4 ]");
        org.junit.Assert.assertTrue("'" + int61 + "' != '" + 1 + "'", int61 == 1);
        org.junit.Assert.assertNull(str65);
        org.junit.Assert.assertNotNull(strMatcher66);
        org.junit.Assert.assertNotNull(strTokenizer67);
        org.junit.Assert.assertNotNull(strTokenizer68);
        org.junit.Assert.assertNotNull(strTokenizer69);
        org.junit.Assert.assertEquals("'" + str70 + "' != '" + "hi!" + "'", str70, "hi!");
        org.junit.Assert.assertNotNull(strTokenizer72);
        org.junit.Assert.assertTrue("'" + int73 + "' != '" + 0 + "'", int73 == 0);
    }

    @Test
    public void test1604() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1604");
        org.apache.commons.lang3.text.StrTokenizer strTokenizer2 = new org.apache.commons.lang3.text.StrTokenizer("4 ", 'a');
        int int3 = strTokenizer2.previousIndex();
        char[] charArray6 = new char[] { '4', ' ' };
        org.apache.commons.lang3.text.StrTokenizer strTokenizer9 = new org.apache.commons.lang3.text.StrTokenizer(charArray6, 'a', ' ');
        org.apache.commons.lang3.text.StrMatcher strMatcher10 = strTokenizer9.getTrimmerMatcher();
        char[] charArray13 = new char[] { '4', ' ' };
        org.apache.commons.lang3.text.StrTokenizer strTokenizer16 = new org.apache.commons.lang3.text.StrTokenizer(charArray13, 'a', ' ');
        org.apache.commons.lang3.text.StrTokenizer strTokenizer17 = org.apache.commons.lang3.text.StrTokenizer.getCSVInstance(charArray13);
        org.apache.commons.lang3.text.StrMatcher strMatcher18 = null;
        org.apache.commons.lang3.text.StrTokenizer strTokenizer19 = new org.apache.commons.lang3.text.StrTokenizer(charArray13, strMatcher18);
        org.apache.commons.lang3.text.StrTokenizer strTokenizer20 = strTokenizer9.reset(charArray13);
        org.apache.commons.lang3.text.StrTokenizer strTokenizer21 = org.apache.commons.lang3.text.StrTokenizer.getCSVInstance(charArray13);
        char[] charArray24 = new char[] { '4', ' ' };
        org.apache.commons.lang3.text.StrTokenizer strTokenizer27 = new org.apache.commons.lang3.text.StrTokenizer(charArray24, 'a', ' ');
        org.apache.commons.lang3.text.StrMatcher strMatcher28 = strTokenizer27.getTrimmerMatcher();
        org.apache.commons.lang3.text.StrTokenizer strTokenizer30 = strTokenizer27.setDelimiterString("");
        char[] charArray34 = new char[] { '4', ' ' };
        org.apache.commons.lang3.text.StrTokenizer strTokenizer37 = new org.apache.commons.lang3.text.StrTokenizer(charArray34, 'a', ' ');
        org.apache.commons.lang3.text.StrMatcher strMatcher38 = strTokenizer37.getTrimmerMatcher();
        org.apache.commons.lang3.text.StrTokenizer strTokenizer40 = strTokenizer37.setDelimiterString("");
        org.apache.commons.lang3.text.StrMatcher strMatcher41 = strTokenizer40.getTrimmerMatcher();
        org.apache.commons.lang3.text.StrTokenizer strTokenizer42 = new org.apache.commons.lang3.text.StrTokenizer("", strMatcher41);
        char[] charArray45 = new char[] { '4', ' ' };
        org.apache.commons.lang3.text.StrTokenizer strTokenizer48 = new org.apache.commons.lang3.text.StrTokenizer(charArray45, 'a', ' ');
        org.apache.commons.lang3.text.StrMatcher strMatcher49 = strTokenizer48.getTrimmerMatcher();
        org.apache.commons.lang3.text.StrTokenizer strTokenizer51 = strTokenizer48.setDelimiterString("");
        org.apache.commons.lang3.text.StrMatcher strMatcher52 = strTokenizer51.getTrimmerMatcher();
        org.apache.commons.lang3.text.StrTokenizer strTokenizer53 = strTokenizer42.setTrimmerMatcher(strMatcher52);
        org.apache.commons.lang3.text.StrTokenizer strTokenizer54 = strTokenizer30.setTrimmerMatcher(strMatcher52);
        org.apache.commons.lang3.text.StrMatcher strMatcher55 = strTokenizer30.getDelimiterMatcher();
        char[] charArray58 = new char[] { '4', ' ' };
        org.apache.commons.lang3.text.StrTokenizer strTokenizer61 = new org.apache.commons.lang3.text.StrTokenizer(charArray58, 'a', ' ');
        org.apache.commons.lang3.text.StrMatcher strMatcher62 = strTokenizer61.getTrimmerMatcher();
        org.apache.commons.lang3.text.StrTokenizer strTokenizer64 = strTokenizer61.setDelimiterString("");
        org.apache.commons.lang3.text.StrMatcher strMatcher65 = strTokenizer64.getTrimmerMatcher();
        org.apache.commons.lang3.text.StrTokenizer strTokenizer66 = new org.apache.commons.lang3.text.StrTokenizer(charArray13, strMatcher55, strMatcher65);
        char[] charArray69 = new char[] { '4', ' ' };
        org.apache.commons.lang3.text.StrTokenizer strTokenizer72 = new org.apache.commons.lang3.text.StrTokenizer(charArray69, 'a', ' ');
        org.apache.commons.lang3.text.StrTokenizer strTokenizer74 = new org.apache.commons.lang3.text.StrTokenizer(charArray69, "hi!");
        org.apache.commons.lang3.text.StrTokenizer strTokenizer75 = new org.apache.commons.lang3.text.StrTokenizer(charArray69);
        char[] charArray78 = new char[] { '4', ' ' };
        org.apache.commons.lang3.text.StrTokenizer strTokenizer81 = new org.apache.commons.lang3.text.StrTokenizer(charArray78, 'a', ' ');
        org.apache.commons.lang3.text.StrMatcher strMatcher82 = strTokenizer81.getTrimmerMatcher();
        org.apache.commons.lang3.text.StrTokenizer strTokenizer83 = strTokenizer75.setTrimmerMatcher(strMatcher82);
        org.apache.commons.lang3.text.StrMatcher strMatcher84 = null;
        org.apache.commons.lang3.text.StrTokenizer strTokenizer85 = new org.apache.commons.lang3.text.StrTokenizer(charArray13, strMatcher82, strMatcher84);
        org.apache.commons.lang3.text.StrTokenizer strTokenizer86 = strTokenizer2.setTrimmerMatcher(strMatcher84);
        org.apache.commons.lang3.text.StrTokenizer strTokenizer87 = strTokenizer86.reset();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertNotNull(charArray6);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray6), "4 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray6), "4 ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray6), "[4,  ]");
        org.junit.Assert.assertNotNull(strMatcher10);
        org.junit.Assert.assertNotNull(charArray13);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray13), "4 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray13), "4 ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray13), "[4,  ]");
        org.junit.Assert.assertNotNull(strTokenizer17);
        org.junit.Assert.assertNotNull(strTokenizer20);
        org.junit.Assert.assertNotNull(strTokenizer21);
        org.junit.Assert.assertNotNull(charArray24);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray24), "4 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray24), "4 ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray24), "[4,  ]");
        org.junit.Assert.assertNotNull(strMatcher28);
        org.junit.Assert.assertNotNull(strTokenizer30);
        org.junit.Assert.assertNotNull(charArray34);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray34), "4 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray34), "4 ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray34), "[4,  ]");
        org.junit.Assert.assertNotNull(strMatcher38);
        org.junit.Assert.assertNotNull(strTokenizer40);
        org.junit.Assert.assertNotNull(strMatcher41);
        org.junit.Assert.assertNotNull(charArray45);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray45), "4 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray45), "4 ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray45), "[4,  ]");
        org.junit.Assert.assertNotNull(strMatcher49);
        org.junit.Assert.assertNotNull(strTokenizer51);
        org.junit.Assert.assertNotNull(strMatcher52);
        org.junit.Assert.assertNotNull(strTokenizer53);
        org.junit.Assert.assertNotNull(strTokenizer54);
        org.junit.Assert.assertNotNull(strMatcher55);
        org.junit.Assert.assertNotNull(charArray58);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray58), "4 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray58), "4 ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray58), "[4,  ]");
        org.junit.Assert.assertNotNull(strMatcher62);
        org.junit.Assert.assertNotNull(strTokenizer64);
        org.junit.Assert.assertNotNull(strMatcher65);
        org.junit.Assert.assertNotNull(charArray69);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray69), "4 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray69), "4 ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray69), "[4,  ]");
        org.junit.Assert.assertNotNull(charArray78);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray78), "4 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray78), "4 ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray78), "[4,  ]");
        org.junit.Assert.assertNotNull(strMatcher82);
        org.junit.Assert.assertNotNull(strTokenizer83);
        org.junit.Assert.assertNotNull(strTokenizer86);
        org.junit.Assert.assertNotNull(strTokenizer87);
    }

    @Test
    public void test1605() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1605");
        char[] charArray2 = new char[] { '4', ' ' };
        org.apache.commons.lang3.text.StrTokenizer strTokenizer5 = new org.apache.commons.lang3.text.StrTokenizer(charArray2, 'a', ' ');
        org.apache.commons.lang3.text.StrTokenizer strTokenizer6 = org.apache.commons.lang3.text.StrTokenizer.getCSVInstance(charArray2);
        org.apache.commons.lang3.text.StrTokenizer strTokenizer8 = new org.apache.commons.lang3.text.StrTokenizer(charArray2, '4');
        org.apache.commons.lang3.text.StrTokenizer strTokenizer9 = new org.apache.commons.lang3.text.StrTokenizer(charArray2);
        char[] charArray12 = new char[] { '4', ' ' };
        org.apache.commons.lang3.text.StrTokenizer strTokenizer15 = new org.apache.commons.lang3.text.StrTokenizer(charArray12, 'a', ' ');
        org.apache.commons.lang3.text.StrMatcher strMatcher16 = strTokenizer15.getTrimmerMatcher();
        org.apache.commons.lang3.text.StrTokenizer strTokenizer18 = strTokenizer15.setDelimiterString("");
        org.apache.commons.lang3.text.StrTokenizer strTokenizer20 = strTokenizer18.reset("");
        org.apache.commons.lang3.text.StrTokenizer strTokenizer21 = strTokenizer18.reset();
        org.apache.commons.lang3.text.StrTokenizer strTokenizer23 = strTokenizer18.setQuoteChar('4');
        char[] charArray25 = new char[] { '#' };
        org.apache.commons.lang3.text.StrTokenizer strTokenizer26 = new org.apache.commons.lang3.text.StrTokenizer(charArray25);
        org.apache.commons.lang3.text.StrTokenizer strTokenizer28 = new org.apache.commons.lang3.text.StrTokenizer(charArray25, ' ');
        char[] charArray29 = null;
        org.apache.commons.lang3.text.StrTokenizer strTokenizer31 = new org.apache.commons.lang3.text.StrTokenizer(charArray29, "");
        org.apache.commons.lang3.text.StrMatcher strMatcher32 = strTokenizer31.getQuoteMatcher();
        char[] charArray36 = new char[] { '4', ' ' };
        org.apache.commons.lang3.text.StrTokenizer strTokenizer39 = new org.apache.commons.lang3.text.StrTokenizer(charArray36, 'a', ' ');
        org.apache.commons.lang3.text.StrMatcher strMatcher40 = strTokenizer39.getTrimmerMatcher();
        org.apache.commons.lang3.text.StrTokenizer strTokenizer42 = strTokenizer39.setDelimiterString("");
        org.apache.commons.lang3.text.StrMatcher strMatcher43 = strTokenizer42.getTrimmerMatcher();
        org.apache.commons.lang3.text.StrTokenizer strTokenizer44 = new org.apache.commons.lang3.text.StrTokenizer("", strMatcher43);
        char[] charArray47 = new char[] { '4', ' ' };
        org.apache.commons.lang3.text.StrTokenizer strTokenizer50 = new org.apache.commons.lang3.text.StrTokenizer(charArray47, 'a', ' ');
        org.apache.commons.lang3.text.StrMatcher strMatcher51 = strTokenizer50.getTrimmerMatcher();
        org.apache.commons.lang3.text.StrMatcher strMatcher52 = strTokenizer50.getQuoteMatcher();
        org.apache.commons.lang3.text.StrTokenizer strTokenizer53 = strTokenizer44.setDelimiterMatcher(strMatcher52);
        org.apache.commons.lang3.text.StrTokenizer strTokenizer54 = new org.apache.commons.lang3.text.StrTokenizer(charArray25, strMatcher32, strMatcher52);
        org.apache.commons.lang3.text.StrTokenizer strTokenizer55 = strTokenizer18.setDelimiterMatcher(strMatcher32);
        char[] charArray58 = new char[] { '4', ' ' };
        org.apache.commons.lang3.text.StrTokenizer strTokenizer61 = new org.apache.commons.lang3.text.StrTokenizer(charArray58, 'a', ' ');
        org.apache.commons.lang3.text.StrMatcher strMatcher62 = strTokenizer61.getTrimmerMatcher();
        org.apache.commons.lang3.text.StrTokenizer strTokenizer64 = strTokenizer61.setDelimiterString("");
        org.apache.commons.lang3.text.StrMatcher strMatcher65 = strTokenizer64.getTrimmerMatcher();
        boolean boolean66 = strTokenizer64.hasNext();
        org.apache.commons.lang3.text.StrTokenizer strTokenizer67 = strTokenizer64.reset();
        org.apache.commons.lang3.text.StrTokenizer strTokenizer71 = new org.apache.commons.lang3.text.StrTokenizer("4 ", 'a');
        org.apache.commons.lang3.text.StrMatcher strMatcher72 = strTokenizer71.getDelimiterMatcher();
        org.apache.commons.lang3.text.StrTokenizer strTokenizer73 = new org.apache.commons.lang3.text.StrTokenizer("", strMatcher72);
        org.apache.commons.lang3.text.StrTokenizer strTokenizer74 = strTokenizer64.setTrimmerMatcher(strMatcher72);
        org.apache.commons.lang3.text.StrTokenizer strTokenizer75 = new org.apache.commons.lang3.text.StrTokenizer(charArray2, strMatcher32, strMatcher72);
        char[] charArray78 = new char[] { '4', ' ' };
        org.apache.commons.lang3.text.StrTokenizer strTokenizer81 = new org.apache.commons.lang3.text.StrTokenizer(charArray78, 'a', ' ');
        org.apache.commons.lang3.text.StrMatcher strMatcher82 = strTokenizer81.getTrimmerMatcher();
        char[] charArray85 = new char[] { '4', ' ' };
        org.apache.commons.lang3.text.StrTokenizer strTokenizer88 = new org.apache.commons.lang3.text.StrTokenizer(charArray85, 'a', ' ');
        org.apache.commons.lang3.text.StrTokenizer strTokenizer89 = org.apache.commons.lang3.text.StrTokenizer.getCSVInstance(charArray85);
        org.apache.commons.lang3.text.StrMatcher strMatcher90 = null;
        org.apache.commons.lang3.text.StrTokenizer strTokenizer91 = new org.apache.commons.lang3.text.StrTokenizer(charArray85, strMatcher90);
        org.apache.commons.lang3.text.StrTokenizer strTokenizer92 = strTokenizer81.reset(charArray85);
        java.lang.Object obj93 = strTokenizer81.clone();
        boolean boolean94 = strTokenizer81.hasNext();
        org.apache.commons.lang3.text.StrMatcher strMatcher95 = strTokenizer81.getTrimmerMatcher();
        org.apache.commons.lang3.text.StrTokenizer strTokenizer96 = new org.apache.commons.lang3.text.StrTokenizer(charArray2, strMatcher95);
        org.apache.commons.lang3.text.StrTokenizer strTokenizer97 = org.apache.commons.lang3.text.StrTokenizer.getTSVInstance(charArray2);
        org.apache.commons.lang3.text.StrTokenizer strTokenizer99 = new org.apache.commons.lang3.text.StrTokenizer(charArray2, ' ');
        org.junit.Assert.assertNotNull(charArray2);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray2), "4 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray2), "4 ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray2), "[4,  ]");
        org.junit.Assert.assertNotNull(strTokenizer6);
        org.junit.Assert.assertNotNull(charArray12);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray12), "4 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray12), "4 ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray12), "[4,  ]");
        org.junit.Assert.assertNotNull(strMatcher16);
        org.junit.Assert.assertNotNull(strTokenizer18);
        org.junit.Assert.assertNotNull(strTokenizer20);
        org.junit.Assert.assertNotNull(strTokenizer21);
        org.junit.Assert.assertNotNull(strTokenizer23);
        org.junit.Assert.assertNotNull(charArray25);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray25), "#");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray25), "#");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray25), "[#]");
        org.junit.Assert.assertNotNull(strMatcher32);
        org.junit.Assert.assertNotNull(charArray36);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray36), "4 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray36), "4 ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray36), "[4,  ]");
        org.junit.Assert.assertNotNull(strMatcher40);
        org.junit.Assert.assertNotNull(strTokenizer42);
        org.junit.Assert.assertNotNull(strMatcher43);
        org.junit.Assert.assertNotNull(charArray47);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray47), "4 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray47), "4 ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray47), "[4,  ]");
        org.junit.Assert.assertNotNull(strMatcher51);
        org.junit.Assert.assertNotNull(strMatcher52);
        org.junit.Assert.assertNotNull(strTokenizer53);
        org.junit.Assert.assertNotNull(strTokenizer55);
        org.junit.Assert.assertNotNull(charArray58);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray58), "4 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray58), "4 ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray58), "[4,  ]");
        org.junit.Assert.assertNotNull(strMatcher62);
        org.junit.Assert.assertNotNull(strTokenizer64);
        org.junit.Assert.assertNotNull(strMatcher65);
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + true + "'", boolean66 == true);
        org.junit.Assert.assertNotNull(strTokenizer67);
        org.junit.Assert.assertNotNull(strMatcher72);
        org.junit.Assert.assertNotNull(strTokenizer74);
        org.junit.Assert.assertNotNull(charArray78);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray78), "4 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray78), "4 ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray78), "[4,  ]");
        org.junit.Assert.assertNotNull(strMatcher82);
        org.junit.Assert.assertNotNull(charArray85);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray85), "4 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray85), "4 ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray85), "[4,  ]");
        org.junit.Assert.assertNotNull(strTokenizer89);
        org.junit.Assert.assertNotNull(strTokenizer92);
        org.junit.Assert.assertNotNull(obj93);
        org.junit.Assert.assertEquals(obj93.toString(), "StrTokenizer[not tokenized yet]");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj93), "StrTokenizer[not tokenized yet]");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj93), "StrTokenizer[not tokenized yet]");
        org.junit.Assert.assertTrue("'" + boolean94 + "' != '" + true + "'", boolean94 == true);
        org.junit.Assert.assertNotNull(strMatcher95);
        org.junit.Assert.assertNotNull(strTokenizer97);
    }

    @Test
    public void test1606() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1606");
        char[] charArray2 = new char[] { '4', ' ' };
        org.apache.commons.lang3.text.StrTokenizer strTokenizer5 = new org.apache.commons.lang3.text.StrTokenizer(charArray2, 'a', ' ');
        org.apache.commons.lang3.text.StrMatcher strMatcher6 = strTokenizer5.getTrimmerMatcher();
        org.apache.commons.lang3.text.StrTokenizer strTokenizer7 = strTokenizer5.reset();
        java.lang.Object obj8 = strTokenizer5.clone();
        // The following exception was thrown during execution in test generation
        try {
            strTokenizer5.remove();
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: remove() is unsupported");
        } catch (java.lang.UnsupportedOperationException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray2);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray2), "4 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray2), "4 ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray2), "[4,  ]");
        org.junit.Assert.assertNotNull(strMatcher6);
        org.junit.Assert.assertNotNull(strTokenizer7);
        org.junit.Assert.assertNotNull(obj8);
        org.junit.Assert.assertEquals(obj8.toString(), "StrTokenizer[not tokenized yet]");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj8), "StrTokenizer[not tokenized yet]");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj8), "StrTokenizer[not tokenized yet]");
    }

    @Test
    public void test1607() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1607");
        char[] charArray2 = new char[] { '4', ' ' };
        org.apache.commons.lang3.text.StrTokenizer strTokenizer5 = new org.apache.commons.lang3.text.StrTokenizer(charArray2, 'a', ' ');
        org.apache.commons.lang3.text.StrTokenizer strTokenizer6 = org.apache.commons.lang3.text.StrTokenizer.getTSVInstance(charArray2);
        java.lang.String str7 = strTokenizer6.getContent();
        org.apache.commons.lang3.text.StrTokenizer strTokenizer8 = strTokenizer6.reset();
        org.apache.commons.lang3.text.StrTokenizer strTokenizer10 = strTokenizer8.setEmptyTokenAsNull(true);
        int int11 = strTokenizer10.size();
        char[] charArray14 = new char[] { '4', ' ' };
        org.apache.commons.lang3.text.StrTokenizer strTokenizer17 = new org.apache.commons.lang3.text.StrTokenizer(charArray14, 'a', ' ');
        org.apache.commons.lang3.text.StrTokenizer strTokenizer18 = org.apache.commons.lang3.text.StrTokenizer.getCSVInstance(charArray14);
        org.apache.commons.lang3.text.StrMatcher strMatcher19 = null;
        org.apache.commons.lang3.text.StrTokenizer strTokenizer20 = new org.apache.commons.lang3.text.StrTokenizer(charArray14, strMatcher19);
        org.apache.commons.lang3.text.StrTokenizer strTokenizer23 = new org.apache.commons.lang3.text.StrTokenizer(charArray14, ' ', '#');
        char[] charArray27 = new char[] { '4', ' ' };
        org.apache.commons.lang3.text.StrTokenizer strTokenizer30 = new org.apache.commons.lang3.text.StrTokenizer(charArray27, 'a', ' ');
        org.apache.commons.lang3.text.StrMatcher strMatcher31 = strTokenizer30.getTrimmerMatcher();
        org.apache.commons.lang3.text.StrTokenizer strTokenizer33 = strTokenizer30.setDelimiterString("");
        org.apache.commons.lang3.text.StrMatcher strMatcher34 = strTokenizer33.getTrimmerMatcher();
        org.apache.commons.lang3.text.StrTokenizer strTokenizer35 = new org.apache.commons.lang3.text.StrTokenizer("", strMatcher34);
        char[] charArray38 = new char[] { '4', ' ' };
        org.apache.commons.lang3.text.StrTokenizer strTokenizer41 = new org.apache.commons.lang3.text.StrTokenizer(charArray38, 'a', ' ');
        org.apache.commons.lang3.text.StrMatcher strMatcher42 = strTokenizer41.getTrimmerMatcher();
        org.apache.commons.lang3.text.StrTokenizer strTokenizer44 = strTokenizer41.setDelimiterString("");
        org.apache.commons.lang3.text.StrMatcher strMatcher45 = strTokenizer44.getTrimmerMatcher();
        org.apache.commons.lang3.text.StrTokenizer strTokenizer46 = strTokenizer35.setTrimmerMatcher(strMatcher45);
        org.apache.commons.lang3.text.StrTokenizer strTokenizer47 = new org.apache.commons.lang3.text.StrTokenizer(charArray14, strMatcher45);
        org.apache.commons.lang3.text.StrTokenizer strTokenizer48 = org.apache.commons.lang3.text.StrTokenizer.getCSVInstance(charArray14);
        char[] charArray51 = new char[] { '4', ' ' };
        org.apache.commons.lang3.text.StrTokenizer strTokenizer54 = new org.apache.commons.lang3.text.StrTokenizer(charArray51, 'a', ' ');
        org.apache.commons.lang3.text.StrTokenizer strTokenizer55 = org.apache.commons.lang3.text.StrTokenizer.getCSVInstance(charArray51);
        org.apache.commons.lang3.text.StrMatcher strMatcher56 = null;
        org.apache.commons.lang3.text.StrTokenizer strTokenizer57 = new org.apache.commons.lang3.text.StrTokenizer(charArray51, strMatcher56);
        char[] charArray60 = new char[] { '4', ' ' };
        org.apache.commons.lang3.text.StrTokenizer strTokenizer63 = new org.apache.commons.lang3.text.StrTokenizer(charArray60, 'a', ' ');
        org.apache.commons.lang3.text.StrMatcher strMatcher64 = strTokenizer63.getTrimmerMatcher();
        org.apache.commons.lang3.text.StrTokenizer strTokenizer66 = strTokenizer63.setDelimiterString("");
        org.apache.commons.lang3.text.StrMatcher strMatcher67 = strTokenizer66.getTrimmerMatcher();
        org.apache.commons.lang3.text.StrTokenizer strTokenizer68 = new org.apache.commons.lang3.text.StrTokenizer(charArray51, strMatcher67);
        org.apache.commons.lang3.text.StrTokenizer strTokenizer70 = new org.apache.commons.lang3.text.StrTokenizer(charArray51, "StrTokenizer[4 ]");
        org.apache.commons.lang3.text.StrTokenizer strTokenizer71 = org.apache.commons.lang3.text.StrTokenizer.getTSVInstance(charArray51);
        org.apache.commons.lang3.text.StrTokenizer strTokenizer72 = strTokenizer48.reset(charArray51);
        org.apache.commons.lang3.text.StrMatcher strMatcher73 = strTokenizer72.getIgnoredMatcher();
        org.apache.commons.lang3.text.StrTokenizer strTokenizer74 = strTokenizer10.setDelimiterMatcher(strMatcher73);
        org.junit.Assert.assertNotNull(charArray2);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray2), "4 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray2), "4 ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray2), "[4,  ]");
        org.junit.Assert.assertNotNull(strTokenizer6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "4 " + "'", str7, "4 ");
        org.junit.Assert.assertNotNull(strTokenizer8);
        org.junit.Assert.assertNotNull(strTokenizer10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertNotNull(charArray14);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray14), "4 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray14), "4 ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray14), "[4,  ]");
        org.junit.Assert.assertNotNull(strTokenizer18);
        org.junit.Assert.assertNotNull(charArray27);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray27), "4 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray27), "4 ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray27), "[4,  ]");
        org.junit.Assert.assertNotNull(strMatcher31);
        org.junit.Assert.assertNotNull(strTokenizer33);
        org.junit.Assert.assertNotNull(strMatcher34);
        org.junit.Assert.assertNotNull(charArray38);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray38), "4 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray38), "4 ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray38), "[4,  ]");
        org.junit.Assert.assertNotNull(strMatcher42);
        org.junit.Assert.assertNotNull(strTokenizer44);
        org.junit.Assert.assertNotNull(strMatcher45);
        org.junit.Assert.assertNotNull(strTokenizer46);
        org.junit.Assert.assertNotNull(strTokenizer48);
        org.junit.Assert.assertNotNull(charArray51);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray51), "4 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray51), "4 ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray51), "[4,  ]");
        org.junit.Assert.assertNotNull(strTokenizer55);
        org.junit.Assert.assertNotNull(charArray60);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray60), "4 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray60), "4 ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray60), "[4,  ]");
        org.junit.Assert.assertNotNull(strMatcher64);
        org.junit.Assert.assertNotNull(strTokenizer66);
        org.junit.Assert.assertNotNull(strMatcher67);
        org.junit.Assert.assertNotNull(strTokenizer71);
        org.junit.Assert.assertNotNull(strTokenizer72);
        org.junit.Assert.assertNotNull(strMatcher73);
        org.junit.Assert.assertNotNull(strTokenizer74);
    }

    @Test
    public void test1608() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1608");
        org.apache.commons.lang3.text.StrTokenizer strTokenizer1 = new org.apache.commons.lang3.text.StrTokenizer("StrTokenizer[StrTokenizer[4 ]]");
        org.apache.commons.lang3.text.StrMatcher strMatcher2 = strTokenizer1.getTrimmerMatcher();
        org.junit.Assert.assertNotNull(strMatcher2);
    }

    @Test
    public void test1609() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1609");
        char[] charArray2 = new char[] { '4', ' ' };
        org.apache.commons.lang3.text.StrTokenizer strTokenizer5 = new org.apache.commons.lang3.text.StrTokenizer(charArray2, 'a', ' ');
        boolean boolean6 = strTokenizer5.hasPrevious();
        char[] charArray9 = new char[] { '4', ' ' };
        org.apache.commons.lang3.text.StrTokenizer strTokenizer12 = new org.apache.commons.lang3.text.StrTokenizer(charArray9, 'a', ' ');
        org.apache.commons.lang3.text.StrMatcher strMatcher13 = strTokenizer12.getTrimmerMatcher();
        org.apache.commons.lang3.text.StrMatcher strMatcher14 = strTokenizer12.getQuoteMatcher();
        org.apache.commons.lang3.text.StrTokenizer strTokenizer15 = strTokenizer5.setIgnoredMatcher(strMatcher14);
        java.lang.String str16 = strTokenizer5.toString();
        org.apache.commons.lang3.text.StrTokenizer strTokenizer18 = strTokenizer5.setDelimiterChar('#');
        org.apache.commons.lang3.text.StrTokenizer strTokenizer20 = strTokenizer18.setIgnoreEmptyTokens(false);
        boolean boolean21 = strTokenizer20.isEmptyTokenAsNull();
        org.junit.Assert.assertNotNull(charArray2);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray2), "4 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray2), "4 ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray2), "[4,  ]");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(charArray9);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray9), "4 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray9), "4 ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray9), "[4,  ]");
        org.junit.Assert.assertNotNull(strMatcher13);
        org.junit.Assert.assertNotNull(strMatcher14);
        org.junit.Assert.assertNotNull(strTokenizer15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "StrTokenizer[4 ]" + "'", str16, "StrTokenizer[4 ]");
        org.junit.Assert.assertNotNull(strTokenizer18);
        org.junit.Assert.assertNotNull(strTokenizer20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
    }

    @Test
    public void test1610() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1610");
        org.apache.commons.lang3.text.StrTokenizer strTokenizer3 = new org.apache.commons.lang3.text.StrTokenizer("StrTokenizer[4 ]", ' ', 'a');
        org.apache.commons.lang3.text.StrMatcher strMatcher4 = strTokenizer3.getDelimiterMatcher();
        java.lang.Class<?> wildcardClass5 = strTokenizer3.getClass();
        org.junit.Assert.assertNotNull(strMatcher4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test1611() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1611");
        char[] charArray2 = new char[] { '4', ' ' };
        org.apache.commons.lang3.text.StrTokenizer strTokenizer5 = new org.apache.commons.lang3.text.StrTokenizer(charArray2, 'a', ' ');
        org.apache.commons.lang3.text.StrTokenizer strTokenizer6 = org.apache.commons.lang3.text.StrTokenizer.getCSVInstance(charArray2);
        org.apache.commons.lang3.text.StrMatcher strMatcher7 = null;
        org.apache.commons.lang3.text.StrTokenizer strTokenizer8 = new org.apache.commons.lang3.text.StrTokenizer(charArray2, strMatcher7);
        org.apache.commons.lang3.text.StrTokenizer strTokenizer11 = new org.apache.commons.lang3.text.StrTokenizer(charArray2, ' ', '#');
        char[] charArray15 = new char[] { '4', ' ' };
        org.apache.commons.lang3.text.StrTokenizer strTokenizer18 = new org.apache.commons.lang3.text.StrTokenizer(charArray15, 'a', ' ');
        org.apache.commons.lang3.text.StrMatcher strMatcher19 = strTokenizer18.getTrimmerMatcher();
        org.apache.commons.lang3.text.StrTokenizer strTokenizer21 = strTokenizer18.setDelimiterString("");
        org.apache.commons.lang3.text.StrMatcher strMatcher22 = strTokenizer21.getTrimmerMatcher();
        org.apache.commons.lang3.text.StrTokenizer strTokenizer23 = new org.apache.commons.lang3.text.StrTokenizer("", strMatcher22);
        char[] charArray26 = new char[] { '4', ' ' };
        org.apache.commons.lang3.text.StrTokenizer strTokenizer29 = new org.apache.commons.lang3.text.StrTokenizer(charArray26, 'a', ' ');
        org.apache.commons.lang3.text.StrMatcher strMatcher30 = strTokenizer29.getTrimmerMatcher();
        org.apache.commons.lang3.text.StrTokenizer strTokenizer32 = strTokenizer29.setDelimiterString("");
        org.apache.commons.lang3.text.StrMatcher strMatcher33 = strTokenizer32.getTrimmerMatcher();
        org.apache.commons.lang3.text.StrTokenizer strTokenizer34 = strTokenizer23.setTrimmerMatcher(strMatcher33);
        org.apache.commons.lang3.text.StrTokenizer strTokenizer35 = new org.apache.commons.lang3.text.StrTokenizer(charArray2, strMatcher33);
        char[] charArray38 = new char[] { '4', ' ' };
        org.apache.commons.lang3.text.StrTokenizer strTokenizer41 = new org.apache.commons.lang3.text.StrTokenizer(charArray38, 'a', ' ');
        org.apache.commons.lang3.text.StrTokenizer strTokenizer42 = org.apache.commons.lang3.text.StrTokenizer.getCSVInstance(charArray38);
        org.apache.commons.lang3.text.StrMatcher strMatcher43 = null;
        org.apache.commons.lang3.text.StrTokenizer strTokenizer44 = new org.apache.commons.lang3.text.StrTokenizer(charArray38, strMatcher43);
        char[] charArray47 = new char[] { '4', ' ' };
        org.apache.commons.lang3.text.StrTokenizer strTokenizer50 = new org.apache.commons.lang3.text.StrTokenizer(charArray47, 'a', ' ');
        org.apache.commons.lang3.text.StrMatcher strMatcher51 = strTokenizer50.getTrimmerMatcher();
        org.apache.commons.lang3.text.StrTokenizer strTokenizer53 = strTokenizer50.setDelimiterString("");
        org.apache.commons.lang3.text.StrMatcher strMatcher54 = strTokenizer53.getTrimmerMatcher();
        org.apache.commons.lang3.text.StrTokenizer strTokenizer55 = new org.apache.commons.lang3.text.StrTokenizer(charArray38, strMatcher54);
        org.apache.commons.lang3.text.StrTokenizer strTokenizer56 = new org.apache.commons.lang3.text.StrTokenizer(charArray2, strMatcher54);
        org.apache.commons.lang3.text.StrTokenizer strTokenizer59 = new org.apache.commons.lang3.text.StrTokenizer(charArray2, '4', '4');
        int int60 = strTokenizer59.previousIndex();
        org.junit.Assert.assertNotNull(charArray2);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray2), "4 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray2), "4 ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray2), "[4,  ]");
        org.junit.Assert.assertNotNull(strTokenizer6);
        org.junit.Assert.assertNotNull(charArray15);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray15), "4 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray15), "4 ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray15), "[4,  ]");
        org.junit.Assert.assertNotNull(strMatcher19);
        org.junit.Assert.assertNotNull(strTokenizer21);
        org.junit.Assert.assertNotNull(strMatcher22);
        org.junit.Assert.assertNotNull(charArray26);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray26), "4 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray26), "4 ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray26), "[4,  ]");
        org.junit.Assert.assertNotNull(strMatcher30);
        org.junit.Assert.assertNotNull(strTokenizer32);
        org.junit.Assert.assertNotNull(strMatcher33);
        org.junit.Assert.assertNotNull(strTokenizer34);
        org.junit.Assert.assertNotNull(charArray38);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray38), "4 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray38), "4 ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray38), "[4,  ]");
        org.junit.Assert.assertNotNull(strTokenizer42);
        org.junit.Assert.assertNotNull(charArray47);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray47), "4 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray47), "4 ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray47), "[4,  ]");
        org.junit.Assert.assertNotNull(strMatcher51);
        org.junit.Assert.assertNotNull(strTokenizer53);
        org.junit.Assert.assertNotNull(strMatcher54);
        org.junit.Assert.assertTrue("'" + int60 + "' != '" + (-1) + "'", int60 == (-1));
    }

    @Test
    public void test1612() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1612");
        char[] charArray2 = new char[] { '4', ' ' };
        org.apache.commons.lang3.text.StrTokenizer strTokenizer5 = new org.apache.commons.lang3.text.StrTokenizer(charArray2, 'a', ' ');
        org.apache.commons.lang3.text.StrMatcher strMatcher6 = strTokenizer5.getTrimmerMatcher();
        char[] charArray9 = new char[] { '4', ' ' };
        org.apache.commons.lang3.text.StrTokenizer strTokenizer12 = new org.apache.commons.lang3.text.StrTokenizer(charArray9, 'a', ' ');
        org.apache.commons.lang3.text.StrTokenizer strTokenizer13 = org.apache.commons.lang3.text.StrTokenizer.getCSVInstance(charArray9);
        org.apache.commons.lang3.text.StrMatcher strMatcher14 = null;
        org.apache.commons.lang3.text.StrTokenizer strTokenizer15 = new org.apache.commons.lang3.text.StrTokenizer(charArray9, strMatcher14);
        org.apache.commons.lang3.text.StrTokenizer strTokenizer16 = strTokenizer5.reset(charArray9);
        org.apache.commons.lang3.text.StrTokenizer strTokenizer17 = org.apache.commons.lang3.text.StrTokenizer.getCSVInstance(charArray9);
        char[] charArray20 = new char[] { '4', ' ' };
        org.apache.commons.lang3.text.StrTokenizer strTokenizer23 = new org.apache.commons.lang3.text.StrTokenizer(charArray20, 'a', ' ');
        org.apache.commons.lang3.text.StrMatcher strMatcher24 = strTokenizer23.getTrimmerMatcher();
        org.apache.commons.lang3.text.StrTokenizer strTokenizer26 = strTokenizer23.setDelimiterString("");
        char[] charArray30 = new char[] { '4', ' ' };
        org.apache.commons.lang3.text.StrTokenizer strTokenizer33 = new org.apache.commons.lang3.text.StrTokenizer(charArray30, 'a', ' ');
        org.apache.commons.lang3.text.StrMatcher strMatcher34 = strTokenizer33.getTrimmerMatcher();
        org.apache.commons.lang3.text.StrTokenizer strTokenizer36 = strTokenizer33.setDelimiterString("");
        org.apache.commons.lang3.text.StrMatcher strMatcher37 = strTokenizer36.getTrimmerMatcher();
        org.apache.commons.lang3.text.StrTokenizer strTokenizer38 = new org.apache.commons.lang3.text.StrTokenizer("", strMatcher37);
        char[] charArray41 = new char[] { '4', ' ' };
        org.apache.commons.lang3.text.StrTokenizer strTokenizer44 = new org.apache.commons.lang3.text.StrTokenizer(charArray41, 'a', ' ');
        org.apache.commons.lang3.text.StrMatcher strMatcher45 = strTokenizer44.getTrimmerMatcher();
        org.apache.commons.lang3.text.StrTokenizer strTokenizer47 = strTokenizer44.setDelimiterString("");
        org.apache.commons.lang3.text.StrMatcher strMatcher48 = strTokenizer47.getTrimmerMatcher();
        org.apache.commons.lang3.text.StrTokenizer strTokenizer49 = strTokenizer38.setTrimmerMatcher(strMatcher48);
        org.apache.commons.lang3.text.StrTokenizer strTokenizer50 = strTokenizer26.setTrimmerMatcher(strMatcher48);
        org.apache.commons.lang3.text.StrMatcher strMatcher51 = strTokenizer26.getDelimiterMatcher();
        char[] charArray54 = new char[] { '4', ' ' };
        org.apache.commons.lang3.text.StrTokenizer strTokenizer57 = new org.apache.commons.lang3.text.StrTokenizer(charArray54, 'a', ' ');
        org.apache.commons.lang3.text.StrMatcher strMatcher58 = strTokenizer57.getTrimmerMatcher();
        org.apache.commons.lang3.text.StrTokenizer strTokenizer60 = strTokenizer57.setDelimiterString("");
        org.apache.commons.lang3.text.StrMatcher strMatcher61 = strTokenizer60.getTrimmerMatcher();
        org.apache.commons.lang3.text.StrTokenizer strTokenizer62 = new org.apache.commons.lang3.text.StrTokenizer(charArray9, strMatcher51, strMatcher61);
        org.apache.commons.lang3.text.StrTokenizer strTokenizer64 = new org.apache.commons.lang3.text.StrTokenizer(charArray9, '#');
        org.apache.commons.lang3.text.StrTokenizer strTokenizer65 = org.apache.commons.lang3.text.StrTokenizer.getCSVInstance(charArray9);
        int int66 = strTokenizer65.size();
        char[] charArray72 = new char[] { '#', ' ', ' ', 'a', '#' };
        org.apache.commons.lang3.text.StrTokenizer strTokenizer75 = new org.apache.commons.lang3.text.StrTokenizer(charArray72, '#', ' ');
        org.apache.commons.lang3.text.StrTokenizer strTokenizer77 = strTokenizer75.setEmptyTokenAsNull(false);
        org.apache.commons.lang3.text.StrMatcher strMatcher78 = strTokenizer77.getTrimmerMatcher();
        org.apache.commons.lang3.text.StrMatcher strMatcher79 = strTokenizer77.getQuoteMatcher();
        org.apache.commons.lang3.text.StrTokenizer strTokenizer80 = strTokenizer65.setDelimiterMatcher(strMatcher79);
        org.junit.Assert.assertNotNull(charArray2);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray2), "4 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray2), "4 ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray2), "[4,  ]");
        org.junit.Assert.assertNotNull(strMatcher6);
        org.junit.Assert.assertNotNull(charArray9);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray9), "4 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray9), "4 ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray9), "[4,  ]");
        org.junit.Assert.assertNotNull(strTokenizer13);
        org.junit.Assert.assertNotNull(strTokenizer16);
        org.junit.Assert.assertNotNull(strTokenizer17);
        org.junit.Assert.assertNotNull(charArray20);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray20), "4 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray20), "4 ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray20), "[4,  ]");
        org.junit.Assert.assertNotNull(strMatcher24);
        org.junit.Assert.assertNotNull(strTokenizer26);
        org.junit.Assert.assertNotNull(charArray30);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray30), "4 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray30), "4 ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray30), "[4,  ]");
        org.junit.Assert.assertNotNull(strMatcher34);
        org.junit.Assert.assertNotNull(strTokenizer36);
        org.junit.Assert.assertNotNull(strMatcher37);
        org.junit.Assert.assertNotNull(charArray41);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray41), "4 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray41), "4 ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray41), "[4,  ]");
        org.junit.Assert.assertNotNull(strMatcher45);
        org.junit.Assert.assertNotNull(strTokenizer47);
        org.junit.Assert.assertNotNull(strMatcher48);
        org.junit.Assert.assertNotNull(strTokenizer49);
        org.junit.Assert.assertNotNull(strTokenizer50);
        org.junit.Assert.assertNotNull(strMatcher51);
        org.junit.Assert.assertNotNull(charArray54);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray54), "4 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray54), "4 ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray54), "[4,  ]");
        org.junit.Assert.assertNotNull(strMatcher58);
        org.junit.Assert.assertNotNull(strTokenizer60);
        org.junit.Assert.assertNotNull(strMatcher61);
        org.junit.Assert.assertNotNull(strTokenizer65);
        org.junit.Assert.assertTrue("'" + int66 + "' != '" + 1 + "'", int66 == 1);
        org.junit.Assert.assertNotNull(charArray72);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray72), "#  a#");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray72), "#  a#");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray72), "[#,  ,  , a, #]");
        org.junit.Assert.assertNotNull(strTokenizer77);
        org.junit.Assert.assertNotNull(strMatcher78);
        org.junit.Assert.assertNotNull(strMatcher79);
        org.junit.Assert.assertNotNull(strTokenizer80);
    }

    @Test
    public void test1613() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1613");
        org.apache.commons.lang3.text.StrTokenizer strTokenizer2 = new org.apache.commons.lang3.text.StrTokenizer("StrTokenizer[]", "StrTokenizer[StrTokenizer[4, ]]");
    }

    @Test
    public void test1614() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1614");
        char[] charArray2 = new char[] { '4', ' ' };
        org.apache.commons.lang3.text.StrTokenizer strTokenizer5 = new org.apache.commons.lang3.text.StrTokenizer(charArray2, 'a', ' ');
        org.apache.commons.lang3.text.StrMatcher strMatcher6 = strTokenizer5.getTrimmerMatcher();
        org.apache.commons.lang3.text.StrTokenizer strTokenizer8 = strTokenizer5.setDelimiterString("");
        org.apache.commons.lang3.text.StrTokenizer strTokenizer10 = strTokenizer8.reset("");
        org.apache.commons.lang3.text.StrTokenizer strTokenizer12 = strTokenizer8.reset("4");
        java.lang.String[] strArray13 = strTokenizer8.getTokenArray();
        org.junit.Assert.assertNotNull(charArray2);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray2), "4 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray2), "4 ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray2), "[4,  ]");
        org.junit.Assert.assertNotNull(strMatcher6);
        org.junit.Assert.assertNotNull(strTokenizer8);
        org.junit.Assert.assertNotNull(strTokenizer10);
        org.junit.Assert.assertNotNull(strTokenizer12);
        org.junit.Assert.assertNotNull(strArray13);
    }

    @Test
    public void test1615() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1615");
        char[] charArray2 = new char[] { '4', ' ' };
        org.apache.commons.lang3.text.StrTokenizer strTokenizer5 = new org.apache.commons.lang3.text.StrTokenizer(charArray2, 'a', ' ');
        org.apache.commons.lang3.text.StrTokenizer strTokenizer6 = org.apache.commons.lang3.text.StrTokenizer.getTSVInstance(charArray2);
        org.apache.commons.lang3.text.StrTokenizer strTokenizer9 = new org.apache.commons.lang3.text.StrTokenizer(charArray2, '#', 'a');
        org.apache.commons.lang3.text.StrMatcher strMatcher10 = null;
        char[] charArray14 = new char[] { '4', ' ' };
        org.apache.commons.lang3.text.StrTokenizer strTokenizer17 = new org.apache.commons.lang3.text.StrTokenizer(charArray14, 'a', ' ');
        org.apache.commons.lang3.text.StrMatcher strMatcher18 = strTokenizer17.getTrimmerMatcher();
        org.apache.commons.lang3.text.StrTokenizer strTokenizer20 = strTokenizer17.setDelimiterString("");
        org.apache.commons.lang3.text.StrMatcher strMatcher21 = strTokenizer20.getTrimmerMatcher();
        org.apache.commons.lang3.text.StrTokenizer strTokenizer22 = new org.apache.commons.lang3.text.StrTokenizer("", strMatcher21);
        org.apache.commons.lang3.text.StrTokenizer strTokenizer23 = new org.apache.commons.lang3.text.StrTokenizer(charArray2, strMatcher10, strMatcher21);
        org.apache.commons.lang3.text.StrTokenizer strTokenizer26 = new org.apache.commons.lang3.text.StrTokenizer(charArray2, '#', ' ');
        org.apache.commons.lang3.text.StrTokenizer strTokenizer28 = new org.apache.commons.lang3.text.StrTokenizer(charArray2, "StrTokenizer[StrTokenizer[4 ]]");
        org.apache.commons.lang3.text.StrTokenizer strTokenizer31 = new org.apache.commons.lang3.text.StrTokenizer(charArray2, '4', '#');
        char[] charArray34 = new char[] { 'a', '#' };
        org.apache.commons.lang3.text.StrTokenizer strTokenizer35 = org.apache.commons.lang3.text.StrTokenizer.getCSVInstance(charArray34);
        org.apache.commons.lang3.text.StrTokenizer strTokenizer37 = new org.apache.commons.lang3.text.StrTokenizer(charArray34, "4 ");
        int int38 = strTokenizer37.previousIndex();
        org.apache.commons.lang3.text.StrMatcher strMatcher39 = strTokenizer37.getIgnoredMatcher();
        char[] charArray42 = new char[] { '4', ' ' };
        org.apache.commons.lang3.text.StrTokenizer strTokenizer45 = new org.apache.commons.lang3.text.StrTokenizer(charArray42, 'a', ' ');
        char[] charArray48 = new char[] { '4', ' ' };
        org.apache.commons.lang3.text.StrTokenizer strTokenizer51 = new org.apache.commons.lang3.text.StrTokenizer(charArray48, 'a', ' ');
        org.apache.commons.lang3.text.StrMatcher strMatcher52 = strTokenizer51.getTrimmerMatcher();
        org.apache.commons.lang3.text.StrTokenizer strTokenizer54 = strTokenizer51.setDelimiterString("");
        org.apache.commons.lang3.text.StrMatcher strMatcher55 = strTokenizer54.getTrimmerMatcher();
        org.apache.commons.lang3.text.StrMatcher strMatcher56 = strTokenizer54.getTrimmerMatcher();
        char[] charArray58 = null;
        org.apache.commons.lang3.text.StrTokenizer strTokenizer60 = new org.apache.commons.lang3.text.StrTokenizer(charArray58, "");
        java.lang.String str61 = strTokenizer60.getContent();
        org.apache.commons.lang3.text.StrMatcher strMatcher62 = strTokenizer60.getDelimiterMatcher();
        org.apache.commons.lang3.text.StrTokenizer strTokenizer63 = new org.apache.commons.lang3.text.StrTokenizer("hi!", strMatcher62);
        org.apache.commons.lang3.text.StrTokenizer strTokenizer64 = new org.apache.commons.lang3.text.StrTokenizer(charArray42, strMatcher56, strMatcher62);
        org.apache.commons.lang3.text.StrTokenizer strTokenizer65 = new org.apache.commons.lang3.text.StrTokenizer(charArray2, strMatcher39, strMatcher62);
        org.junit.Assert.assertNotNull(charArray2);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray2), "4 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray2), "4 ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray2), "[4,  ]");
        org.junit.Assert.assertNotNull(strTokenizer6);
        org.junit.Assert.assertNotNull(charArray14);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray14), "4 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray14), "4 ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray14), "[4,  ]");
        org.junit.Assert.assertNotNull(strMatcher18);
        org.junit.Assert.assertNotNull(strTokenizer20);
        org.junit.Assert.assertNotNull(strMatcher21);
        org.junit.Assert.assertNotNull(charArray34);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray34), "a#");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray34), "a#");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray34), "[a, #]");
        org.junit.Assert.assertNotNull(strTokenizer35);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + (-1) + "'", int38 == (-1));
        org.junit.Assert.assertNotNull(strMatcher39);
        org.junit.Assert.assertNotNull(charArray42);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray42), "4 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray42), "4 ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray42), "[4,  ]");
        org.junit.Assert.assertNotNull(charArray48);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray48), "4 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray48), "4 ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray48), "[4,  ]");
        org.junit.Assert.assertNotNull(strMatcher52);
        org.junit.Assert.assertNotNull(strTokenizer54);
        org.junit.Assert.assertNotNull(strMatcher55);
        org.junit.Assert.assertNotNull(strMatcher56);
        org.junit.Assert.assertNull(str61);
        org.junit.Assert.assertNotNull(strMatcher62);
    }

    @Test
    public void test1616() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1616");
        char[] charArray2 = new char[] { '4', ' ' };
        org.apache.commons.lang3.text.StrTokenizer strTokenizer5 = new org.apache.commons.lang3.text.StrTokenizer(charArray2, 'a', ' ');
        org.apache.commons.lang3.text.StrMatcher strMatcher6 = strTokenizer5.getTrimmerMatcher();
        char[] charArray9 = new char[] { '4', ' ' };
        org.apache.commons.lang3.text.StrTokenizer strTokenizer12 = new org.apache.commons.lang3.text.StrTokenizer(charArray9, 'a', ' ');
        org.apache.commons.lang3.text.StrTokenizer strTokenizer13 = org.apache.commons.lang3.text.StrTokenizer.getCSVInstance(charArray9);
        org.apache.commons.lang3.text.StrMatcher strMatcher14 = null;
        org.apache.commons.lang3.text.StrTokenizer strTokenizer15 = new org.apache.commons.lang3.text.StrTokenizer(charArray9, strMatcher14);
        org.apache.commons.lang3.text.StrTokenizer strTokenizer16 = strTokenizer5.reset(charArray9);
        java.lang.Object obj17 = strTokenizer5.clone();
        boolean boolean18 = strTokenizer5.hasNext();
        java.lang.String[] strArray19 = strTokenizer5.getTokenArray();
        org.apache.commons.lang3.text.StrTokenizer strTokenizer20 = strTokenizer5.reset();
        java.lang.String[] strArray21 = strTokenizer20.getTokenArray();
        org.junit.Assert.assertNotNull(charArray2);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray2), "4 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray2), "4 ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray2), "[4,  ]");
        org.junit.Assert.assertNotNull(strMatcher6);
        org.junit.Assert.assertNotNull(charArray9);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray9), "4 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray9), "4 ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray9), "[4,  ]");
        org.junit.Assert.assertNotNull(strTokenizer13);
        org.junit.Assert.assertNotNull(strTokenizer16);
        org.junit.Assert.assertNotNull(obj17);
        org.junit.Assert.assertEquals(obj17.toString(), "StrTokenizer[not tokenized yet]");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj17), "StrTokenizer[not tokenized yet]");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj17), "StrTokenizer[not tokenized yet]");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(strArray19);
        org.junit.Assert.assertNotNull(strTokenizer20);
        org.junit.Assert.assertNotNull(strArray21);
    }

    @Test
    public void test1617() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1617");
        char[] charArray2 = new char[] { '4', ' ' };
        org.apache.commons.lang3.text.StrTokenizer strTokenizer5 = new org.apache.commons.lang3.text.StrTokenizer(charArray2, 'a', ' ');
        org.apache.commons.lang3.text.StrTokenizer strTokenizer7 = new org.apache.commons.lang3.text.StrTokenizer(charArray2, "hi!");
        org.apache.commons.lang3.text.StrTokenizer strTokenizer9 = new org.apache.commons.lang3.text.StrTokenizer(charArray2, '#');
        org.apache.commons.lang3.text.StrTokenizer strTokenizer10 = new org.apache.commons.lang3.text.StrTokenizer(charArray2);
        org.apache.commons.lang3.text.StrTokenizer strTokenizer13 = new org.apache.commons.lang3.text.StrTokenizer("", '#');
        org.apache.commons.lang3.text.StrMatcher strMatcher14 = strTokenizer13.getTrimmerMatcher();
        org.apache.commons.lang3.text.StrTokenizer strTokenizer15 = new org.apache.commons.lang3.text.StrTokenizer(charArray2, strMatcher14);
        org.apache.commons.lang3.text.StrTokenizer strTokenizer18 = new org.apache.commons.lang3.text.StrTokenizer(charArray2, 'a', ' ');
        org.apache.commons.lang3.text.StrTokenizer strTokenizer21 = new org.apache.commons.lang3.text.StrTokenizer("hi!", "StrTokenizer[4 ]");
        char[] charArray24 = new char[] { '4', ' ' };
        org.apache.commons.lang3.text.StrTokenizer strTokenizer27 = new org.apache.commons.lang3.text.StrTokenizer(charArray24, 'a', ' ');
        org.apache.commons.lang3.text.StrTokenizer strTokenizer28 = org.apache.commons.lang3.text.StrTokenizer.getCSVInstance(charArray24);
        org.apache.commons.lang3.text.StrTokenizer strTokenizer29 = org.apache.commons.lang3.text.StrTokenizer.getCSVInstance(charArray24);
        char[] charArray33 = new char[] { '4', ' ' };
        org.apache.commons.lang3.text.StrTokenizer strTokenizer36 = new org.apache.commons.lang3.text.StrTokenizer(charArray33, 'a', ' ');
        org.apache.commons.lang3.text.StrMatcher strMatcher37 = strTokenizer36.getTrimmerMatcher();
        char[] charArray40 = new char[] { '4', ' ' };
        org.apache.commons.lang3.text.StrTokenizer strTokenizer43 = new org.apache.commons.lang3.text.StrTokenizer(charArray40, 'a', ' ');
        org.apache.commons.lang3.text.StrTokenizer strTokenizer44 = org.apache.commons.lang3.text.StrTokenizer.getCSVInstance(charArray40);
        org.apache.commons.lang3.text.StrMatcher strMatcher45 = null;
        org.apache.commons.lang3.text.StrTokenizer strTokenizer46 = new org.apache.commons.lang3.text.StrTokenizer(charArray40, strMatcher45);
        org.apache.commons.lang3.text.StrTokenizer strTokenizer47 = strTokenizer36.reset(charArray40);
        org.apache.commons.lang3.text.StrMatcher strMatcher48 = strTokenizer47.getIgnoredMatcher();
        org.apache.commons.lang3.text.StrTokenizer strTokenizer49 = new org.apache.commons.lang3.text.StrTokenizer("", strMatcher48);
        char[] charArray52 = new char[] { '4', ' ' };
        org.apache.commons.lang3.text.StrTokenizer strTokenizer55 = new org.apache.commons.lang3.text.StrTokenizer(charArray52, 'a', ' ');
        org.apache.commons.lang3.text.StrTokenizer strTokenizer56 = org.apache.commons.lang3.text.StrTokenizer.getCSVInstance(charArray52);
        org.apache.commons.lang3.text.StrMatcher strMatcher57 = null;
        org.apache.commons.lang3.text.StrTokenizer strTokenizer58 = new org.apache.commons.lang3.text.StrTokenizer(charArray52, strMatcher57);
        char[] charArray59 = null;
        org.apache.commons.lang3.text.StrTokenizer strTokenizer61 = new org.apache.commons.lang3.text.StrTokenizer(charArray59, "");
        org.apache.commons.lang3.text.StrMatcher strMatcher62 = strTokenizer61.getQuoteMatcher();
        char[] charArray66 = new char[] { '4', ' ' };
        org.apache.commons.lang3.text.StrTokenizer strTokenizer69 = new org.apache.commons.lang3.text.StrTokenizer(charArray66, 'a', ' ');
        org.apache.commons.lang3.text.StrMatcher strMatcher70 = strTokenizer69.getTrimmerMatcher();
        org.apache.commons.lang3.text.StrTokenizer strTokenizer72 = strTokenizer69.setDelimiterString("");
        org.apache.commons.lang3.text.StrMatcher strMatcher73 = strTokenizer72.getTrimmerMatcher();
        org.apache.commons.lang3.text.StrTokenizer strTokenizer74 = new org.apache.commons.lang3.text.StrTokenizer("", strMatcher73);
        char[] charArray77 = new char[] { '4', ' ' };
        org.apache.commons.lang3.text.StrTokenizer strTokenizer80 = new org.apache.commons.lang3.text.StrTokenizer(charArray77, 'a', ' ');
        org.apache.commons.lang3.text.StrMatcher strMatcher81 = strTokenizer80.getTrimmerMatcher();
        org.apache.commons.lang3.text.StrMatcher strMatcher82 = strTokenizer80.getQuoteMatcher();
        org.apache.commons.lang3.text.StrTokenizer strTokenizer83 = strTokenizer74.setDelimiterMatcher(strMatcher82);
        org.apache.commons.lang3.text.StrTokenizer strTokenizer84 = new org.apache.commons.lang3.text.StrTokenizer(charArray52, strMatcher62, strMatcher82);
        org.apache.commons.lang3.text.StrTokenizer strTokenizer85 = new org.apache.commons.lang3.text.StrTokenizer(charArray24, strMatcher48, strMatcher62);
        org.apache.commons.lang3.text.StrTokenizer strTokenizer86 = strTokenizer21.setIgnoredMatcher(strMatcher62);
        org.apache.commons.lang3.text.StrTokenizer strTokenizer87 = new org.apache.commons.lang3.text.StrTokenizer(charArray2, strMatcher62);
        java.lang.String str88 = strTokenizer87.toString();
        org.junit.Assert.assertNotNull(charArray2);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray2), "4 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray2), "4 ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray2), "[4,  ]");
        org.junit.Assert.assertNotNull(strMatcher14);
        org.junit.Assert.assertNotNull(charArray24);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray24), "4 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray24), "4 ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray24), "[4,  ]");
        org.junit.Assert.assertNotNull(strTokenizer28);
        org.junit.Assert.assertNotNull(strTokenizer29);
        org.junit.Assert.assertNotNull(charArray33);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray33), "4 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray33), "4 ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray33), "[4,  ]");
        org.junit.Assert.assertNotNull(strMatcher37);
        org.junit.Assert.assertNotNull(charArray40);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray40), "4 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray40), "4 ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray40), "[4,  ]");
        org.junit.Assert.assertNotNull(strTokenizer44);
        org.junit.Assert.assertNotNull(strTokenizer47);
        org.junit.Assert.assertNotNull(strMatcher48);
        org.junit.Assert.assertNotNull(charArray52);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray52), "4 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray52), "4 ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray52), "[4,  ]");
        org.junit.Assert.assertNotNull(strTokenizer56);
        org.junit.Assert.assertNotNull(strMatcher62);
        org.junit.Assert.assertNotNull(charArray66);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray66), "4 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray66), "4 ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray66), "[4,  ]");
        org.junit.Assert.assertNotNull(strMatcher70);
        org.junit.Assert.assertNotNull(strTokenizer72);
        org.junit.Assert.assertNotNull(strMatcher73);
        org.junit.Assert.assertNotNull(charArray77);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray77), "4 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray77), "4 ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray77), "[4,  ]");
        org.junit.Assert.assertNotNull(strMatcher81);
        org.junit.Assert.assertNotNull(strMatcher82);
        org.junit.Assert.assertNotNull(strTokenizer83);
        org.junit.Assert.assertNotNull(strTokenizer86);
        org.junit.Assert.assertEquals("'" + str88 + "' != '" + "StrTokenizer[not tokenized yet]" + "'", str88, "StrTokenizer[not tokenized yet]");
    }

    @Test
    public void test1618() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1618");
        char[] charArray0 = null;
        org.apache.commons.lang3.text.StrTokenizer strTokenizer2 = new org.apache.commons.lang3.text.StrTokenizer(charArray0, "");
        java.lang.String str3 = strTokenizer2.getContent();
        org.apache.commons.lang3.text.StrMatcher strMatcher4 = strTokenizer2.getIgnoredMatcher();
        org.apache.commons.lang3.text.StrTokenizer strTokenizer5 = strTokenizer2.reset();
        boolean boolean6 = strTokenizer2.hasPrevious();
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(strMatcher4);
        org.junit.Assert.assertNotNull(strTokenizer5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test1619() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1619");
        char[] charArray2 = new char[] { '4', ' ' };
        org.apache.commons.lang3.text.StrTokenizer strTokenizer5 = new org.apache.commons.lang3.text.StrTokenizer(charArray2, 'a', ' ');
        org.apache.commons.lang3.text.StrMatcher strMatcher6 = strTokenizer5.getTrimmerMatcher();
        char[] charArray9 = new char[] { '4', ' ' };
        org.apache.commons.lang3.text.StrTokenizer strTokenizer12 = new org.apache.commons.lang3.text.StrTokenizer(charArray9, 'a', ' ');
        org.apache.commons.lang3.text.StrTokenizer strTokenizer13 = org.apache.commons.lang3.text.StrTokenizer.getCSVInstance(charArray9);
        org.apache.commons.lang3.text.StrMatcher strMatcher14 = null;
        org.apache.commons.lang3.text.StrTokenizer strTokenizer15 = new org.apache.commons.lang3.text.StrTokenizer(charArray9, strMatcher14);
        org.apache.commons.lang3.text.StrTokenizer strTokenizer16 = strTokenizer5.reset(charArray9);
        org.apache.commons.lang3.text.StrTokenizer strTokenizer18 = strTokenizer16.setIgnoreEmptyTokens(false);
        boolean boolean19 = strTokenizer16.isEmptyTokenAsNull();
        org.apache.commons.lang3.text.StrMatcher strMatcher20 = strTokenizer16.getDelimiterMatcher();
        org.apache.commons.lang3.text.StrTokenizer strTokenizer22 = strTokenizer16.setDelimiterChar('#');
        org.junit.Assert.assertNotNull(charArray2);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray2), "4 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray2), "4 ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray2), "[4,  ]");
        org.junit.Assert.assertNotNull(strMatcher6);
        org.junit.Assert.assertNotNull(charArray9);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray9), "4 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray9), "4 ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray9), "[4,  ]");
        org.junit.Assert.assertNotNull(strTokenizer13);
        org.junit.Assert.assertNotNull(strTokenizer16);
        org.junit.Assert.assertNotNull(strTokenizer18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(strMatcher20);
        org.junit.Assert.assertNotNull(strTokenizer22);
    }

    @Test
    public void test1620() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1620");
        char[] charArray2 = new char[] { '4', ' ' };
        org.apache.commons.lang3.text.StrTokenizer strTokenizer5 = new org.apache.commons.lang3.text.StrTokenizer(charArray2, 'a', ' ');
        org.apache.commons.lang3.text.StrMatcher strMatcher6 = strTokenizer5.getTrimmerMatcher();
        char[] charArray9 = new char[] { '4', ' ' };
        org.apache.commons.lang3.text.StrTokenizer strTokenizer12 = new org.apache.commons.lang3.text.StrTokenizer(charArray9, 'a', ' ');
        org.apache.commons.lang3.text.StrTokenizer strTokenizer13 = org.apache.commons.lang3.text.StrTokenizer.getCSVInstance(charArray9);
        org.apache.commons.lang3.text.StrMatcher strMatcher14 = null;
        org.apache.commons.lang3.text.StrTokenizer strTokenizer15 = new org.apache.commons.lang3.text.StrTokenizer(charArray9, strMatcher14);
        org.apache.commons.lang3.text.StrTokenizer strTokenizer16 = strTokenizer5.reset(charArray9);
        java.lang.Object obj17 = strTokenizer5.clone();
        boolean boolean18 = strTokenizer5.hasNext();
        java.lang.String[] strArray19 = strTokenizer5.getTokenArray();
        org.apache.commons.lang3.text.StrTokenizer strTokenizer21 = strTokenizer5.setIgnoreEmptyTokens(true);
        boolean boolean22 = strTokenizer21.hasPrevious();
        org.apache.commons.lang3.text.StrTokenizer strTokenizer24 = strTokenizer21.setEmptyTokenAsNull(false);
        org.junit.Assert.assertNotNull(charArray2);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray2), "4 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray2), "4 ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray2), "[4,  ]");
        org.junit.Assert.assertNotNull(strMatcher6);
        org.junit.Assert.assertNotNull(charArray9);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray9), "4 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray9), "4 ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray9), "[4,  ]");
        org.junit.Assert.assertNotNull(strTokenizer13);
        org.junit.Assert.assertNotNull(strTokenizer16);
        org.junit.Assert.assertNotNull(obj17);
        org.junit.Assert.assertEquals(obj17.toString(), "StrTokenizer[not tokenized yet]");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj17), "StrTokenizer[not tokenized yet]");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj17), "StrTokenizer[not tokenized yet]");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(strArray19);
        org.junit.Assert.assertNotNull(strTokenizer21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(strTokenizer24);
    }

    @Test
    public void test1621() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1621");
        char[] charArray2 = new char[] { '4', ' ' };
        org.apache.commons.lang3.text.StrTokenizer strTokenizer5 = new org.apache.commons.lang3.text.StrTokenizer(charArray2, 'a', ' ');
        org.apache.commons.lang3.text.StrMatcher strMatcher6 = strTokenizer5.getTrimmerMatcher();
        org.apache.commons.lang3.text.StrTokenizer strTokenizer8 = strTokenizer5.setDelimiterString("");
        org.apache.commons.lang3.text.StrMatcher strMatcher9 = strTokenizer8.getTrimmerMatcher();
        boolean boolean10 = strTokenizer8.hasNext();
        org.apache.commons.lang3.text.StrTokenizer strTokenizer11 = strTokenizer8.reset();
        char[] charArray14 = new char[] { '4', ' ' };
        org.apache.commons.lang3.text.StrTokenizer strTokenizer17 = new org.apache.commons.lang3.text.StrTokenizer(charArray14, 'a', ' ');
        org.apache.commons.lang3.text.StrTokenizer strTokenizer18 = org.apache.commons.lang3.text.StrTokenizer.getCSVInstance(charArray14);
        org.apache.commons.lang3.text.StrTokenizer strTokenizer20 = new org.apache.commons.lang3.text.StrTokenizer(charArray14, "hi!");
        org.apache.commons.lang3.text.StrTokenizer strTokenizer21 = strTokenizer8.reset(charArray14);
        org.junit.Assert.assertNotNull(charArray2);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray2), "4 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray2), "4 ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray2), "[4,  ]");
        org.junit.Assert.assertNotNull(strMatcher6);
        org.junit.Assert.assertNotNull(strTokenizer8);
        org.junit.Assert.assertNotNull(strMatcher9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(strTokenizer11);
        org.junit.Assert.assertNotNull(charArray14);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray14), "4 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray14), "4 ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray14), "[4,  ]");
        org.junit.Assert.assertNotNull(strTokenizer18);
        org.junit.Assert.assertNotNull(strTokenizer21);
    }

    @Test
    public void test1622() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1622");
        org.apache.commons.lang3.text.StrTokenizer strTokenizer0 = org.apache.commons.lang3.text.StrTokenizer.getTSVInstance();
        boolean boolean1 = strTokenizer0.isIgnoreEmptyTokens();
        org.apache.commons.lang3.text.StrTokenizer strTokenizer3 = strTokenizer0.setIgnoredChar(' ');
        org.apache.commons.lang3.text.StrTokenizer strTokenizer5 = strTokenizer3.setDelimiterString("");
        org.junit.Assert.assertNotNull(strTokenizer0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNotNull(strTokenizer3);
        org.junit.Assert.assertNotNull(strTokenizer5);
    }

    @Test
    public void test1623() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1623");
        char[] charArray5 = new char[] { '4', ' ' };
        org.apache.commons.lang3.text.StrTokenizer strTokenizer8 = new org.apache.commons.lang3.text.StrTokenizer(charArray5, 'a', ' ');
        org.apache.commons.lang3.text.StrMatcher strMatcher9 = strTokenizer8.getTrimmerMatcher();
        org.apache.commons.lang3.text.StrTokenizer strTokenizer11 = strTokenizer8.setDelimiterString("");
        char[] charArray15 = new char[] { '4', ' ' };
        org.apache.commons.lang3.text.StrTokenizer strTokenizer18 = new org.apache.commons.lang3.text.StrTokenizer(charArray15, 'a', ' ');
        org.apache.commons.lang3.text.StrMatcher strMatcher19 = strTokenizer18.getTrimmerMatcher();
        org.apache.commons.lang3.text.StrTokenizer strTokenizer21 = strTokenizer18.setDelimiterString("");
        org.apache.commons.lang3.text.StrMatcher strMatcher22 = strTokenizer21.getTrimmerMatcher();
        org.apache.commons.lang3.text.StrTokenizer strTokenizer23 = new org.apache.commons.lang3.text.StrTokenizer("", strMatcher22);
        char[] charArray26 = new char[] { '4', ' ' };
        org.apache.commons.lang3.text.StrTokenizer strTokenizer29 = new org.apache.commons.lang3.text.StrTokenizer(charArray26, 'a', ' ');
        org.apache.commons.lang3.text.StrMatcher strMatcher30 = strTokenizer29.getTrimmerMatcher();
        org.apache.commons.lang3.text.StrTokenizer strTokenizer32 = strTokenizer29.setDelimiterString("");
        org.apache.commons.lang3.text.StrMatcher strMatcher33 = strTokenizer32.getTrimmerMatcher();
        org.apache.commons.lang3.text.StrTokenizer strTokenizer34 = strTokenizer23.setTrimmerMatcher(strMatcher33);
        org.apache.commons.lang3.text.StrTokenizer strTokenizer35 = strTokenizer11.setTrimmerMatcher(strMatcher33);
        org.apache.commons.lang3.text.StrMatcher strMatcher36 = strTokenizer11.getDelimiterMatcher();
        boolean boolean37 = strTokenizer11.isIgnoreEmptyTokens();
        org.apache.commons.lang3.text.StrMatcher strMatcher38 = strTokenizer11.getQuoteMatcher();
        char[] charArray39 = null;
        org.apache.commons.lang3.text.StrTokenizer strTokenizer41 = new org.apache.commons.lang3.text.StrTokenizer(charArray39, "");
        java.lang.String str42 = strTokenizer41.getContent();
        org.apache.commons.lang3.text.StrMatcher strMatcher43 = strTokenizer41.getTrimmerMatcher();
        org.apache.commons.lang3.text.StrTokenizer strTokenizer44 = new org.apache.commons.lang3.text.StrTokenizer("4 ", strMatcher38, strMatcher43);
        org.apache.commons.lang3.text.StrTokenizer strTokenizer45 = new org.apache.commons.lang3.text.StrTokenizer("hi!", strMatcher43);
        char[] charArray48 = new char[] { '4', ' ' };
        org.apache.commons.lang3.text.StrTokenizer strTokenizer51 = new org.apache.commons.lang3.text.StrTokenizer(charArray48, 'a', ' ');
        org.apache.commons.lang3.text.StrTokenizer strTokenizer52 = org.apache.commons.lang3.text.StrTokenizer.getCSVInstance(charArray48);
        org.apache.commons.lang3.text.StrMatcher strMatcher53 = null;
        org.apache.commons.lang3.text.StrTokenizer strTokenizer54 = new org.apache.commons.lang3.text.StrTokenizer(charArray48, strMatcher53);
        char[] charArray57 = new char[] { '4', ' ' };
        org.apache.commons.lang3.text.StrTokenizer strTokenizer60 = new org.apache.commons.lang3.text.StrTokenizer(charArray57, 'a', ' ');
        org.apache.commons.lang3.text.StrMatcher strMatcher61 = strTokenizer60.getTrimmerMatcher();
        org.apache.commons.lang3.text.StrTokenizer strTokenizer63 = strTokenizer60.setDelimiterString("");
        org.apache.commons.lang3.text.StrMatcher strMatcher64 = strTokenizer63.getTrimmerMatcher();
        org.apache.commons.lang3.text.StrTokenizer strTokenizer65 = new org.apache.commons.lang3.text.StrTokenizer(charArray48, strMatcher64);
        org.apache.commons.lang3.text.StrTokenizer strTokenizer67 = new org.apache.commons.lang3.text.StrTokenizer(charArray48, "StrTokenizer[4 ]");
        org.apache.commons.lang3.text.StrTokenizer strTokenizer68 = strTokenizer45.reset(charArray48);
        boolean boolean69 = strTokenizer45.isEmptyTokenAsNull();
        char[] charArray72 = new char[] { '4', ' ' };
        org.apache.commons.lang3.text.StrTokenizer strTokenizer75 = new org.apache.commons.lang3.text.StrTokenizer(charArray72, 'a', ' ');
        org.apache.commons.lang3.text.StrMatcher strMatcher76 = strTokenizer75.getTrimmerMatcher();
        org.apache.commons.lang3.text.StrTokenizer strTokenizer78 = strTokenizer75.setDelimiterString("");
        org.apache.commons.lang3.text.StrMatcher strMatcher79 = strTokenizer78.getTrimmerMatcher();
        org.apache.commons.lang3.text.StrMatcher strMatcher80 = strTokenizer78.getTrimmerMatcher();
        char[] charArray83 = new char[] { '4', ' ' };
        org.apache.commons.lang3.text.StrTokenizer strTokenizer86 = new org.apache.commons.lang3.text.StrTokenizer(charArray83, 'a', ' ');
        org.apache.commons.lang3.text.StrTokenizer strTokenizer87 = strTokenizer78.reset(charArray83);
        org.apache.commons.lang3.text.StrTokenizer strTokenizer88 = org.apache.commons.lang3.text.StrTokenizer.getTSVInstance(charArray83);
        int int89 = strTokenizer88.previousIndex();
        org.apache.commons.lang3.text.StrMatcher strMatcher90 = strTokenizer88.getTrimmerMatcher();
        org.apache.commons.lang3.text.StrTokenizer strTokenizer91 = strTokenizer45.setDelimiterMatcher(strMatcher90);
        org.apache.commons.lang3.text.StrTokenizer strTokenizer92 = new org.apache.commons.lang3.text.StrTokenizer("StrTokenizer[]", strMatcher90);
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray5), "4 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray5), "4 ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray5), "[4,  ]");
        org.junit.Assert.assertNotNull(strMatcher9);
        org.junit.Assert.assertNotNull(strTokenizer11);
        org.junit.Assert.assertNotNull(charArray15);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray15), "4 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray15), "4 ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray15), "[4,  ]");
        org.junit.Assert.assertNotNull(strMatcher19);
        org.junit.Assert.assertNotNull(strTokenizer21);
        org.junit.Assert.assertNotNull(strMatcher22);
        org.junit.Assert.assertNotNull(charArray26);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray26), "4 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray26), "4 ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray26), "[4,  ]");
        org.junit.Assert.assertNotNull(strMatcher30);
        org.junit.Assert.assertNotNull(strTokenizer32);
        org.junit.Assert.assertNotNull(strMatcher33);
        org.junit.Assert.assertNotNull(strTokenizer34);
        org.junit.Assert.assertNotNull(strTokenizer35);
        org.junit.Assert.assertNotNull(strMatcher36);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
        org.junit.Assert.assertNotNull(strMatcher38);
        org.junit.Assert.assertNull(str42);
        org.junit.Assert.assertNotNull(strMatcher43);
        org.junit.Assert.assertNotNull(charArray48);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray48), "4 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray48), "4 ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray48), "[4,  ]");
        org.junit.Assert.assertNotNull(strTokenizer52);
        org.junit.Assert.assertNotNull(charArray57);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray57), "4 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray57), "4 ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray57), "[4,  ]");
        org.junit.Assert.assertNotNull(strMatcher61);
        org.junit.Assert.assertNotNull(strTokenizer63);
        org.junit.Assert.assertNotNull(strMatcher64);
        org.junit.Assert.assertNotNull(strTokenizer68);
        org.junit.Assert.assertTrue("'" + boolean69 + "' != '" + false + "'", boolean69 == false);
        org.junit.Assert.assertNotNull(charArray72);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray72), "4 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray72), "4 ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray72), "[4,  ]");
        org.junit.Assert.assertNotNull(strMatcher76);
        org.junit.Assert.assertNotNull(strTokenizer78);
        org.junit.Assert.assertNotNull(strMatcher79);
        org.junit.Assert.assertNotNull(strMatcher80);
        org.junit.Assert.assertNotNull(charArray83);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray83), "4 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray83), "4 ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray83), "[4,  ]");
        org.junit.Assert.assertNotNull(strTokenizer87);
        org.junit.Assert.assertNotNull(strTokenizer88);
        org.junit.Assert.assertTrue("'" + int89 + "' != '" + (-1) + "'", int89 == (-1));
        org.junit.Assert.assertNotNull(strMatcher90);
        org.junit.Assert.assertNotNull(strTokenizer91);
    }

    @Test
    public void test1624() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1624");
        org.apache.commons.lang3.text.StrTokenizer strTokenizer2 = new org.apache.commons.lang3.text.StrTokenizer(" ", " ");
        char[] charArray5 = new char[] { '4', ' ' };
        org.apache.commons.lang3.text.StrTokenizer strTokenizer8 = new org.apache.commons.lang3.text.StrTokenizer(charArray5, 'a', ' ');
        org.apache.commons.lang3.text.StrTokenizer strTokenizer9 = org.apache.commons.lang3.text.StrTokenizer.getCSVInstance(charArray5);
        org.apache.commons.lang3.text.StrMatcher strMatcher10 = null;
        org.apache.commons.lang3.text.StrTokenizer strTokenizer11 = new org.apache.commons.lang3.text.StrTokenizer(charArray5, strMatcher10);
        char[] charArray14 = new char[] { '4', ' ' };
        org.apache.commons.lang3.text.StrTokenizer strTokenizer17 = new org.apache.commons.lang3.text.StrTokenizer(charArray14, 'a', ' ');
        org.apache.commons.lang3.text.StrMatcher strMatcher18 = strTokenizer17.getTrimmerMatcher();
        org.apache.commons.lang3.text.StrTokenizer strTokenizer20 = strTokenizer17.setDelimiterString("");
        org.apache.commons.lang3.text.StrMatcher strMatcher21 = strTokenizer20.getTrimmerMatcher();
        org.apache.commons.lang3.text.StrTokenizer strTokenizer22 = new org.apache.commons.lang3.text.StrTokenizer(charArray5, strMatcher21);
        org.apache.commons.lang3.text.StrTokenizer strTokenizer23 = strTokenizer2.reset(charArray5);
        boolean boolean24 = strTokenizer23.hasNext();
        org.apache.commons.lang3.text.StrTokenizer strTokenizer26 = strTokenizer23.setIgnoreEmptyTokens(true);
        java.lang.Object obj27 = strTokenizer26.clone();
        org.apache.commons.lang3.text.StrTokenizer strTokenizer29 = strTokenizer26.setIgnoredChar('#');
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray5), "4 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray5), "4 ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray5), "[4,  ]");
        org.junit.Assert.assertNotNull(strTokenizer9);
        org.junit.Assert.assertNotNull(charArray14);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray14), "4 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray14), "4 ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray14), "[4,  ]");
        org.junit.Assert.assertNotNull(strMatcher18);
        org.junit.Assert.assertNotNull(strTokenizer20);
        org.junit.Assert.assertNotNull(strMatcher21);
        org.junit.Assert.assertNotNull(strTokenizer23);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertNotNull(strTokenizer26);
        org.junit.Assert.assertNotNull(obj27);
        org.junit.Assert.assertEquals(obj27.toString(), "StrTokenizer[not tokenized yet]");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj27), "StrTokenizer[not tokenized yet]");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj27), "StrTokenizer[not tokenized yet]");
        org.junit.Assert.assertNotNull(strTokenizer29);
    }

    @Test
    public void test1625() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1625");
        char[] charArray2 = new char[] { '4', ' ' };
        org.apache.commons.lang3.text.StrTokenizer strTokenizer5 = new org.apache.commons.lang3.text.StrTokenizer(charArray2, 'a', ' ');
        org.apache.commons.lang3.text.StrTokenizer strTokenizer6 = org.apache.commons.lang3.text.StrTokenizer.getCSVInstance(charArray2);
        org.apache.commons.lang3.text.StrMatcher strMatcher7 = null;
        org.apache.commons.lang3.text.StrTokenizer strTokenizer8 = new org.apache.commons.lang3.text.StrTokenizer(charArray2, strMatcher7);
        char[] charArray9 = null;
        org.apache.commons.lang3.text.StrTokenizer strTokenizer11 = new org.apache.commons.lang3.text.StrTokenizer(charArray9, "");
        org.apache.commons.lang3.text.StrMatcher strMatcher12 = strTokenizer11.getQuoteMatcher();
        char[] charArray16 = new char[] { '4', ' ' };
        org.apache.commons.lang3.text.StrTokenizer strTokenizer19 = new org.apache.commons.lang3.text.StrTokenizer(charArray16, 'a', ' ');
        org.apache.commons.lang3.text.StrMatcher strMatcher20 = strTokenizer19.getTrimmerMatcher();
        org.apache.commons.lang3.text.StrTokenizer strTokenizer22 = strTokenizer19.setDelimiterString("");
        org.apache.commons.lang3.text.StrMatcher strMatcher23 = strTokenizer22.getTrimmerMatcher();
        org.apache.commons.lang3.text.StrTokenizer strTokenizer24 = new org.apache.commons.lang3.text.StrTokenizer("", strMatcher23);
        char[] charArray27 = new char[] { '4', ' ' };
        org.apache.commons.lang3.text.StrTokenizer strTokenizer30 = new org.apache.commons.lang3.text.StrTokenizer(charArray27, 'a', ' ');
        org.apache.commons.lang3.text.StrMatcher strMatcher31 = strTokenizer30.getTrimmerMatcher();
        org.apache.commons.lang3.text.StrMatcher strMatcher32 = strTokenizer30.getQuoteMatcher();
        org.apache.commons.lang3.text.StrTokenizer strTokenizer33 = strTokenizer24.setDelimiterMatcher(strMatcher32);
        org.apache.commons.lang3.text.StrTokenizer strTokenizer34 = new org.apache.commons.lang3.text.StrTokenizer(charArray2, strMatcher12, strMatcher32);
        org.apache.commons.lang3.text.StrTokenizer strTokenizer35 = new org.apache.commons.lang3.text.StrTokenizer(charArray2);
        int int36 = strTokenizer35.nextIndex();
        // The following exception was thrown during execution in test generation
        try {
            strTokenizer35.remove();
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: remove() is unsupported");
        } catch (java.lang.UnsupportedOperationException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray2);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray2), "4 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray2), "4 ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray2), "[4,  ]");
        org.junit.Assert.assertNotNull(strTokenizer6);
        org.junit.Assert.assertNotNull(strMatcher12);
        org.junit.Assert.assertNotNull(charArray16);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray16), "4 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray16), "4 ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray16), "[4,  ]");
        org.junit.Assert.assertNotNull(strMatcher20);
        org.junit.Assert.assertNotNull(strTokenizer22);
        org.junit.Assert.assertNotNull(strMatcher23);
        org.junit.Assert.assertNotNull(charArray27);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray27), "4 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray27), "4 ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray27), "[4,  ]");
        org.junit.Assert.assertNotNull(strMatcher31);
        org.junit.Assert.assertNotNull(strMatcher32);
        org.junit.Assert.assertNotNull(strTokenizer33);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
    }

    @Test
    public void test1626() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1626");
        org.apache.commons.lang3.text.StrTokenizer strTokenizer2 = new org.apache.commons.lang3.text.StrTokenizer("StrTokenizer[4 ]", ' ');
        int int3 = strTokenizer2.previousIndex();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test1627() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1627");
        char[] charArray2 = new char[] { '4', ' ' };
        org.apache.commons.lang3.text.StrTokenizer strTokenizer5 = new org.apache.commons.lang3.text.StrTokenizer(charArray2, 'a', ' ');
        org.apache.commons.lang3.text.StrTokenizer strTokenizer7 = new org.apache.commons.lang3.text.StrTokenizer(charArray2, "hi!");
        org.apache.commons.lang3.text.StrTokenizer strTokenizer9 = new org.apache.commons.lang3.text.StrTokenizer(charArray2, '#');
        org.apache.commons.lang3.text.StrTokenizer strTokenizer10 = org.apache.commons.lang3.text.StrTokenizer.getCSVInstance(charArray2);
        org.apache.commons.lang3.text.StrTokenizer strTokenizer12 = new org.apache.commons.lang3.text.StrTokenizer(charArray2, '4');
        org.apache.commons.lang3.text.StrTokenizer strTokenizer14 = new org.apache.commons.lang3.text.StrTokenizer(charArray2, "");
        char[] charArray17 = new char[] { '4', ' ' };
        org.apache.commons.lang3.text.StrTokenizer strTokenizer20 = new org.apache.commons.lang3.text.StrTokenizer(charArray17, 'a', ' ');
        org.apache.commons.lang3.text.StrMatcher strMatcher21 = strTokenizer20.getTrimmerMatcher();
        java.lang.String str22 = strTokenizer20.nextToken();
        char[] charArray25 = new char[] { '4', ' ' };
        org.apache.commons.lang3.text.StrTokenizer strTokenizer28 = new org.apache.commons.lang3.text.StrTokenizer(charArray25, 'a', ' ');
        org.apache.commons.lang3.text.StrMatcher strMatcher29 = strTokenizer28.getTrimmerMatcher();
        org.apache.commons.lang3.text.StrTokenizer strTokenizer31 = strTokenizer28.setDelimiterString("");
        org.apache.commons.lang3.text.StrMatcher strMatcher32 = strTokenizer31.getTrimmerMatcher();
        org.apache.commons.lang3.text.StrMatcher strMatcher33 = strTokenizer31.getTrimmerMatcher();
        char[] charArray36 = new char[] { '4', ' ' };
        org.apache.commons.lang3.text.StrTokenizer strTokenizer39 = new org.apache.commons.lang3.text.StrTokenizer(charArray36, 'a', ' ');
        org.apache.commons.lang3.text.StrTokenizer strTokenizer40 = strTokenizer31.reset(charArray36);
        org.apache.commons.lang3.text.StrTokenizer strTokenizer42 = new org.apache.commons.lang3.text.StrTokenizer(charArray36, "");
        org.apache.commons.lang3.text.StrTokenizer strTokenizer43 = strTokenizer20.reset(charArray36);
        org.apache.commons.lang3.text.StrMatcher strMatcher44 = strTokenizer43.getDelimiterMatcher();
        org.apache.commons.lang3.text.StrTokenizer strTokenizer45 = strTokenizer14.setIgnoredMatcher(strMatcher44);
        boolean boolean46 = strTokenizer14.isIgnoreEmptyTokens();
        org.junit.Assert.assertNotNull(charArray2);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray2), "4 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray2), "4 ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray2), "[4,  ]");
        org.junit.Assert.assertNotNull(strTokenizer10);
        org.junit.Assert.assertNotNull(charArray17);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray17), "4 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray17), "4 ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray17), "[4,  ]");
        org.junit.Assert.assertNotNull(strMatcher21);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "4 " + "'", str22, "4 ");
        org.junit.Assert.assertNotNull(charArray25);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray25), "4 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray25), "4 ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray25), "[4,  ]");
        org.junit.Assert.assertNotNull(strMatcher29);
        org.junit.Assert.assertNotNull(strTokenizer31);
        org.junit.Assert.assertNotNull(strMatcher32);
        org.junit.Assert.assertNotNull(strMatcher33);
        org.junit.Assert.assertNotNull(charArray36);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray36), "4 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray36), "4 ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray36), "[4,  ]");
        org.junit.Assert.assertNotNull(strTokenizer40);
        org.junit.Assert.assertNotNull(strTokenizer43);
        org.junit.Assert.assertNotNull(strMatcher44);
        org.junit.Assert.assertNotNull(strTokenizer45);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + true + "'", boolean46 == true);
    }

    @Test
    public void test1628() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1628");
        char[] charArray2 = new char[] { '4', ' ' };
        org.apache.commons.lang3.text.StrTokenizer strTokenizer5 = new org.apache.commons.lang3.text.StrTokenizer(charArray2, 'a', ' ');
        org.apache.commons.lang3.text.StrTokenizer strTokenizer6 = org.apache.commons.lang3.text.StrTokenizer.getCSVInstance(charArray2);
        org.apache.commons.lang3.text.StrMatcher strMatcher7 = null;
        org.apache.commons.lang3.text.StrTokenizer strTokenizer8 = new org.apache.commons.lang3.text.StrTokenizer(charArray2, strMatcher7);
        org.apache.commons.lang3.text.StrTokenizer strTokenizer11 = new org.apache.commons.lang3.text.StrTokenizer(charArray2, ' ', '#');
        char[] charArray15 = new char[] { '4', ' ' };
        org.apache.commons.lang3.text.StrTokenizer strTokenizer18 = new org.apache.commons.lang3.text.StrTokenizer(charArray15, 'a', ' ');
        org.apache.commons.lang3.text.StrMatcher strMatcher19 = strTokenizer18.getTrimmerMatcher();
        org.apache.commons.lang3.text.StrTokenizer strTokenizer21 = strTokenizer18.setDelimiterString("");
        org.apache.commons.lang3.text.StrMatcher strMatcher22 = strTokenizer21.getTrimmerMatcher();
        org.apache.commons.lang3.text.StrTokenizer strTokenizer23 = new org.apache.commons.lang3.text.StrTokenizer("", strMatcher22);
        char[] charArray26 = new char[] { '4', ' ' };
        org.apache.commons.lang3.text.StrTokenizer strTokenizer29 = new org.apache.commons.lang3.text.StrTokenizer(charArray26, 'a', ' ');
        org.apache.commons.lang3.text.StrMatcher strMatcher30 = strTokenizer29.getTrimmerMatcher();
        org.apache.commons.lang3.text.StrTokenizer strTokenizer32 = strTokenizer29.setDelimiterString("");
        org.apache.commons.lang3.text.StrMatcher strMatcher33 = strTokenizer32.getTrimmerMatcher();
        org.apache.commons.lang3.text.StrTokenizer strTokenizer34 = strTokenizer23.setTrimmerMatcher(strMatcher33);
        org.apache.commons.lang3.text.StrTokenizer strTokenizer35 = new org.apache.commons.lang3.text.StrTokenizer(charArray2, strMatcher33);
        org.apache.commons.lang3.text.StrTokenizer strTokenizer36 = org.apache.commons.lang3.text.StrTokenizer.getCSVInstance(charArray2);
        org.apache.commons.lang3.text.StrTokenizer strTokenizer39 = new org.apache.commons.lang3.text.StrTokenizer(charArray2, ' ', 'a');
        org.apache.commons.lang3.text.StrTokenizer strTokenizer41 = new org.apache.commons.lang3.text.StrTokenizer(charArray2, "");
        boolean boolean42 = strTokenizer41.isEmptyTokenAsNull();
        org.junit.Assert.assertNotNull(charArray2);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray2), "4 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray2), "4 ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray2), "[4,  ]");
        org.junit.Assert.assertNotNull(strTokenizer6);
        org.junit.Assert.assertNotNull(charArray15);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray15), "4 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray15), "4 ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray15), "[4,  ]");
        org.junit.Assert.assertNotNull(strMatcher19);
        org.junit.Assert.assertNotNull(strTokenizer21);
        org.junit.Assert.assertNotNull(strMatcher22);
        org.junit.Assert.assertNotNull(charArray26);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray26), "4 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray26), "4 ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray26), "[4,  ]");
        org.junit.Assert.assertNotNull(strMatcher30);
        org.junit.Assert.assertNotNull(strTokenizer32);
        org.junit.Assert.assertNotNull(strMatcher33);
        org.junit.Assert.assertNotNull(strTokenizer34);
        org.junit.Assert.assertNotNull(strTokenizer36);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
    }

    @Test
    public void test1629() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1629");
        org.apache.commons.lang3.text.StrTokenizer strTokenizer2 = new org.apache.commons.lang3.text.StrTokenizer(" ", " ");
        char[] charArray5 = new char[] { '4', ' ' };
        org.apache.commons.lang3.text.StrTokenizer strTokenizer8 = new org.apache.commons.lang3.text.StrTokenizer(charArray5, 'a', ' ');
        org.apache.commons.lang3.text.StrTokenizer strTokenizer9 = org.apache.commons.lang3.text.StrTokenizer.getCSVInstance(charArray5);
        org.apache.commons.lang3.text.StrMatcher strMatcher10 = null;
        org.apache.commons.lang3.text.StrTokenizer strTokenizer11 = new org.apache.commons.lang3.text.StrTokenizer(charArray5, strMatcher10);
        char[] charArray14 = new char[] { '4', ' ' };
        org.apache.commons.lang3.text.StrTokenizer strTokenizer17 = new org.apache.commons.lang3.text.StrTokenizer(charArray14, 'a', ' ');
        org.apache.commons.lang3.text.StrMatcher strMatcher18 = strTokenizer17.getTrimmerMatcher();
        org.apache.commons.lang3.text.StrTokenizer strTokenizer20 = strTokenizer17.setDelimiterString("");
        org.apache.commons.lang3.text.StrMatcher strMatcher21 = strTokenizer20.getTrimmerMatcher();
        org.apache.commons.lang3.text.StrTokenizer strTokenizer22 = new org.apache.commons.lang3.text.StrTokenizer(charArray5, strMatcher21);
        org.apache.commons.lang3.text.StrTokenizer strTokenizer23 = strTokenizer2.reset(charArray5);
        org.apache.commons.lang3.text.StrTokenizer strTokenizer25 = strTokenizer23.setDelimiterString("StrTokenizer[ ]");
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray5), "4 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray5), "4 ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray5), "[4,  ]");
        org.junit.Assert.assertNotNull(strTokenizer9);
        org.junit.Assert.assertNotNull(charArray14);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray14), "4 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray14), "4 ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray14), "[4,  ]");
        org.junit.Assert.assertNotNull(strMatcher18);
        org.junit.Assert.assertNotNull(strTokenizer20);
        org.junit.Assert.assertNotNull(strMatcher21);
        org.junit.Assert.assertNotNull(strTokenizer23);
        org.junit.Assert.assertNotNull(strTokenizer25);
    }

    @Test
    public void test1630() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1630");
        char[] charArray2 = new char[] { '4', ' ' };
        org.apache.commons.lang3.text.StrTokenizer strTokenizer5 = new org.apache.commons.lang3.text.StrTokenizer(charArray2, 'a', ' ');
        org.apache.commons.lang3.text.StrMatcher strMatcher6 = strTokenizer5.getTrimmerMatcher();
        org.apache.commons.lang3.text.StrTokenizer strTokenizer8 = strTokenizer5.setDelimiterString("");
        char[] charArray12 = new char[] { '4', ' ' };
        org.apache.commons.lang3.text.StrTokenizer strTokenizer15 = new org.apache.commons.lang3.text.StrTokenizer(charArray12, 'a', ' ');
        org.apache.commons.lang3.text.StrMatcher strMatcher16 = strTokenizer15.getTrimmerMatcher();
        org.apache.commons.lang3.text.StrTokenizer strTokenizer18 = strTokenizer15.setDelimiterString("");
        org.apache.commons.lang3.text.StrMatcher strMatcher19 = strTokenizer18.getTrimmerMatcher();
        org.apache.commons.lang3.text.StrTokenizer strTokenizer20 = new org.apache.commons.lang3.text.StrTokenizer("", strMatcher19);
        char[] charArray23 = new char[] { '4', ' ' };
        org.apache.commons.lang3.text.StrTokenizer strTokenizer26 = new org.apache.commons.lang3.text.StrTokenizer(charArray23, 'a', ' ');
        org.apache.commons.lang3.text.StrMatcher strMatcher27 = strTokenizer26.getTrimmerMatcher();
        org.apache.commons.lang3.text.StrTokenizer strTokenizer29 = strTokenizer26.setDelimiterString("");
        org.apache.commons.lang3.text.StrMatcher strMatcher30 = strTokenizer29.getTrimmerMatcher();
        org.apache.commons.lang3.text.StrTokenizer strTokenizer31 = strTokenizer20.setTrimmerMatcher(strMatcher30);
        org.apache.commons.lang3.text.StrTokenizer strTokenizer32 = strTokenizer8.setTrimmerMatcher(strMatcher30);
        java.lang.String str33 = strTokenizer8.getContent();
        char[] charArray36 = new char[] { '4', ' ' };
        org.apache.commons.lang3.text.StrTokenizer strTokenizer39 = new org.apache.commons.lang3.text.StrTokenizer(charArray36, 'a', ' ');
        org.apache.commons.lang3.text.StrTokenizer strTokenizer42 = new org.apache.commons.lang3.text.StrTokenizer(charArray36, '4', 'a');
        char[] charArray45 = new char[] { '4', ' ' };
        org.apache.commons.lang3.text.StrTokenizer strTokenizer48 = new org.apache.commons.lang3.text.StrTokenizer(charArray45, 'a', ' ');
        org.apache.commons.lang3.text.StrMatcher strMatcher49 = strTokenizer48.getTrimmerMatcher();
        org.apache.commons.lang3.text.StrMatcher strMatcher50 = strTokenizer48.getQuoteMatcher();
        org.apache.commons.lang3.text.StrTokenizer strTokenizer51 = new org.apache.commons.lang3.text.StrTokenizer(charArray36, strMatcher50);
        org.apache.commons.lang3.text.StrTokenizer strTokenizer52 = strTokenizer8.reset(charArray36);
        org.apache.commons.lang3.text.StrTokenizer strTokenizer55 = new org.apache.commons.lang3.text.StrTokenizer(charArray36, 'a', 'a');
        java.lang.String[] strArray56 = strTokenizer55.getTokenArray();
        char[] charArray60 = new char[] { '4', ' ' };
        org.apache.commons.lang3.text.StrTokenizer strTokenizer63 = new org.apache.commons.lang3.text.StrTokenizer(charArray60, 'a', ' ');
        org.apache.commons.lang3.text.StrMatcher strMatcher64 = strTokenizer63.getTrimmerMatcher();
        char[] charArray66 = null;
        org.apache.commons.lang3.text.StrTokenizer strTokenizer68 = new org.apache.commons.lang3.text.StrTokenizer(charArray66, "");
        java.lang.String str69 = strTokenizer68.getContent();
        org.apache.commons.lang3.text.StrMatcher strMatcher70 = strTokenizer68.getDelimiterMatcher();
        org.apache.commons.lang3.text.StrTokenizer strTokenizer71 = new org.apache.commons.lang3.text.StrTokenizer(" ", strMatcher70);
        org.apache.commons.lang3.text.StrTokenizer strTokenizer72 = new org.apache.commons.lang3.text.StrTokenizer("StrTokenizer[4]", strMatcher64, strMatcher70);
        org.apache.commons.lang3.text.StrTokenizer strTokenizer73 = strTokenizer55.setQuoteMatcher(strMatcher70);
        boolean boolean74 = strTokenizer73.isEmptyTokenAsNull();
        org.apache.commons.lang3.text.StrTokenizer strTokenizer76 = strTokenizer73.setDelimiterString("StrTokenizer[not tokenized yet]");
        org.junit.Assert.assertNotNull(charArray2);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray2), "4 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray2), "4 ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray2), "[4,  ]");
        org.junit.Assert.assertNotNull(strMatcher6);
        org.junit.Assert.assertNotNull(strTokenizer8);
        org.junit.Assert.assertNotNull(charArray12);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray12), "4 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray12), "4 ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray12), "[4,  ]");
        org.junit.Assert.assertNotNull(strMatcher16);
        org.junit.Assert.assertNotNull(strTokenizer18);
        org.junit.Assert.assertNotNull(strMatcher19);
        org.junit.Assert.assertNotNull(charArray23);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray23), "4 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray23), "4 ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray23), "[4,  ]");
        org.junit.Assert.assertNotNull(strMatcher27);
        org.junit.Assert.assertNotNull(strTokenizer29);
        org.junit.Assert.assertNotNull(strMatcher30);
        org.junit.Assert.assertNotNull(strTokenizer31);
        org.junit.Assert.assertNotNull(strTokenizer32);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "4 " + "'", str33, "4 ");
        org.junit.Assert.assertNotNull(charArray36);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray36), "4 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray36), "4 ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray36), "[4,  ]");
        org.junit.Assert.assertNotNull(charArray45);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray45), "4 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray45), "4 ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray45), "[4,  ]");
        org.junit.Assert.assertNotNull(strMatcher49);
        org.junit.Assert.assertNotNull(strMatcher50);
        org.junit.Assert.assertNotNull(strTokenizer52);
        org.junit.Assert.assertNotNull(strArray56);
        org.junit.Assert.assertNotNull(charArray60);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray60), "4 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray60), "4 ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray60), "[4,  ]");
        org.junit.Assert.assertNotNull(strMatcher64);
        org.junit.Assert.assertNull(str69);
        org.junit.Assert.assertNotNull(strMatcher70);
        org.junit.Assert.assertNotNull(strTokenizer73);
        org.junit.Assert.assertTrue("'" + boolean74 + "' != '" + false + "'", boolean74 == false);
        org.junit.Assert.assertNotNull(strTokenizer76);
    }

    @Test
    public void test1631() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1631");
        char[] charArray0 = null;
        org.apache.commons.lang3.text.StrTokenizer strTokenizer2 = new org.apache.commons.lang3.text.StrTokenizer(charArray0, "");
        java.lang.String str3 = strTokenizer2.getContent();
        org.apache.commons.lang3.text.StrMatcher strMatcher4 = strTokenizer2.getTrimmerMatcher();
        boolean boolean5 = strTokenizer2.hasNext();
        java.lang.String str6 = strTokenizer2.toString();
        org.apache.commons.lang3.text.StrTokenizer strTokenizer8 = strTokenizer2.setEmptyTokenAsNull(false);
        org.apache.commons.lang3.text.StrTokenizer strTokenizer10 = strTokenizer8.setQuoteChar('#');
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(strMatcher4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "StrTokenizer[]" + "'", str6, "StrTokenizer[]");
        org.junit.Assert.assertNotNull(strTokenizer8);
        org.junit.Assert.assertNotNull(strTokenizer10);
    }

    @Test
    public void test1632() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1632");
        char[] charArray2 = new char[] { '4', ' ' };
        org.apache.commons.lang3.text.StrTokenizer strTokenizer5 = new org.apache.commons.lang3.text.StrTokenizer(charArray2, 'a', ' ');
        org.apache.commons.lang3.text.StrMatcher strMatcher6 = strTokenizer5.getTrimmerMatcher();
        java.lang.String str7 = strTokenizer5.nextToken();
        char[] charArray10 = new char[] { '4', ' ' };
        org.apache.commons.lang3.text.StrTokenizer strTokenizer13 = new org.apache.commons.lang3.text.StrTokenizer(charArray10, 'a', ' ');
        org.apache.commons.lang3.text.StrMatcher strMatcher14 = strTokenizer13.getTrimmerMatcher();
        org.apache.commons.lang3.text.StrTokenizer strTokenizer16 = strTokenizer13.setDelimiterString("");
        org.apache.commons.lang3.text.StrMatcher strMatcher17 = strTokenizer16.getTrimmerMatcher();
        org.apache.commons.lang3.text.StrMatcher strMatcher18 = strTokenizer16.getTrimmerMatcher();
        char[] charArray21 = new char[] { '4', ' ' };
        org.apache.commons.lang3.text.StrTokenizer strTokenizer24 = new org.apache.commons.lang3.text.StrTokenizer(charArray21, 'a', ' ');
        org.apache.commons.lang3.text.StrTokenizer strTokenizer25 = strTokenizer16.reset(charArray21);
        org.apache.commons.lang3.text.StrTokenizer strTokenizer27 = new org.apache.commons.lang3.text.StrTokenizer(charArray21, "");
        org.apache.commons.lang3.text.StrTokenizer strTokenizer28 = strTokenizer5.reset(charArray21);
        org.apache.commons.lang3.text.StrTokenizer strTokenizer30 = strTokenizer28.setQuoteChar('#');
        char[] charArray34 = new char[] { '4', ' ' };
        org.apache.commons.lang3.text.StrTokenizer strTokenizer37 = new org.apache.commons.lang3.text.StrTokenizer(charArray34, 'a', ' ');
        org.apache.commons.lang3.text.StrMatcher strMatcher38 = strTokenizer37.getTrimmerMatcher();
        char[] charArray41 = new char[] { '4', ' ' };
        org.apache.commons.lang3.text.StrTokenizer strTokenizer44 = new org.apache.commons.lang3.text.StrTokenizer(charArray41, 'a', ' ');
        org.apache.commons.lang3.text.StrTokenizer strTokenizer45 = org.apache.commons.lang3.text.StrTokenizer.getCSVInstance(charArray41);
        org.apache.commons.lang3.text.StrMatcher strMatcher46 = null;
        org.apache.commons.lang3.text.StrTokenizer strTokenizer47 = new org.apache.commons.lang3.text.StrTokenizer(charArray41, strMatcher46);
        org.apache.commons.lang3.text.StrTokenizer strTokenizer48 = strTokenizer37.reset(charArray41);
        org.apache.commons.lang3.text.StrMatcher strMatcher49 = strTokenizer48.getIgnoredMatcher();
        org.apache.commons.lang3.text.StrTokenizer strTokenizer50 = new org.apache.commons.lang3.text.StrTokenizer("", strMatcher49);
        org.apache.commons.lang3.text.StrTokenizer strTokenizer51 = strTokenizer30.setIgnoredMatcher(strMatcher49);
        org.apache.commons.lang3.text.StrMatcher strMatcher52 = strTokenizer51.getIgnoredMatcher();
        org.junit.Assert.assertNotNull(charArray2);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray2), "4 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray2), "4 ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray2), "[4,  ]");
        org.junit.Assert.assertNotNull(strMatcher6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "4 " + "'", str7, "4 ");
        org.junit.Assert.assertNotNull(charArray10);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray10), "4 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray10), "4 ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray10), "[4,  ]");
        org.junit.Assert.assertNotNull(strMatcher14);
        org.junit.Assert.assertNotNull(strTokenizer16);
        org.junit.Assert.assertNotNull(strMatcher17);
        org.junit.Assert.assertNotNull(strMatcher18);
        org.junit.Assert.assertNotNull(charArray21);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray21), "4 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray21), "4 ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray21), "[4,  ]");
        org.junit.Assert.assertNotNull(strTokenizer25);
        org.junit.Assert.assertNotNull(strTokenizer28);
        org.junit.Assert.assertNotNull(strTokenizer30);
        org.junit.Assert.assertNotNull(charArray34);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray34), "4 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray34), "4 ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray34), "[4,  ]");
        org.junit.Assert.assertNotNull(strMatcher38);
        org.junit.Assert.assertNotNull(charArray41);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray41), "4 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray41), "4 ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray41), "[4,  ]");
        org.junit.Assert.assertNotNull(strTokenizer45);
        org.junit.Assert.assertNotNull(strTokenizer48);
        org.junit.Assert.assertNotNull(strMatcher49);
        org.junit.Assert.assertNotNull(strTokenizer51);
        org.junit.Assert.assertNotNull(strMatcher52);
    }

    @Test
    public void test1633() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1633");
        char[] charArray2 = new char[] { '4', ' ' };
        org.apache.commons.lang3.text.StrTokenizer strTokenizer5 = new org.apache.commons.lang3.text.StrTokenizer(charArray2, 'a', ' ');
        org.apache.commons.lang3.text.StrTokenizer strTokenizer6 = org.apache.commons.lang3.text.StrTokenizer.getCSVInstance(charArray2);
        org.apache.commons.lang3.text.StrMatcher strMatcher7 = null;
        org.apache.commons.lang3.text.StrTokenizer strTokenizer8 = new org.apache.commons.lang3.text.StrTokenizer(charArray2, strMatcher7);
        char[] charArray11 = new char[] { '4', ' ' };
        org.apache.commons.lang3.text.StrTokenizer strTokenizer14 = new org.apache.commons.lang3.text.StrTokenizer(charArray11, 'a', ' ');
        org.apache.commons.lang3.text.StrMatcher strMatcher15 = strTokenizer14.getTrimmerMatcher();
        org.apache.commons.lang3.text.StrTokenizer strTokenizer17 = strTokenizer14.setDelimiterString("");
        org.apache.commons.lang3.text.StrMatcher strMatcher18 = strTokenizer17.getTrimmerMatcher();
        org.apache.commons.lang3.text.StrTokenizer strTokenizer19 = new org.apache.commons.lang3.text.StrTokenizer(charArray2, strMatcher18);
        org.apache.commons.lang3.text.StrTokenizer strTokenizer20 = org.apache.commons.lang3.text.StrTokenizer.getTSVInstance(charArray2);
        char[] charArray24 = new char[] { '4', ' ' };
        org.apache.commons.lang3.text.StrTokenizer strTokenizer27 = new org.apache.commons.lang3.text.StrTokenizer(charArray24, 'a', ' ');
        org.apache.commons.lang3.text.StrMatcher strMatcher28 = strTokenizer27.getTrimmerMatcher();
        org.apache.commons.lang3.text.StrTokenizer strTokenizer30 = strTokenizer27.setDelimiterString("");
        char[] charArray34 = new char[] { '4', ' ' };
        org.apache.commons.lang3.text.StrTokenizer strTokenizer37 = new org.apache.commons.lang3.text.StrTokenizer(charArray34, 'a', ' ');
        org.apache.commons.lang3.text.StrMatcher strMatcher38 = strTokenizer37.getTrimmerMatcher();
        org.apache.commons.lang3.text.StrTokenizer strTokenizer40 = strTokenizer37.setDelimiterString("");
        org.apache.commons.lang3.text.StrMatcher strMatcher41 = strTokenizer40.getTrimmerMatcher();
        org.apache.commons.lang3.text.StrTokenizer strTokenizer42 = new org.apache.commons.lang3.text.StrTokenizer("", strMatcher41);
        char[] charArray45 = new char[] { '4', ' ' };
        org.apache.commons.lang3.text.StrTokenizer strTokenizer48 = new org.apache.commons.lang3.text.StrTokenizer(charArray45, 'a', ' ');
        org.apache.commons.lang3.text.StrMatcher strMatcher49 = strTokenizer48.getTrimmerMatcher();
        org.apache.commons.lang3.text.StrTokenizer strTokenizer51 = strTokenizer48.setDelimiterString("");
        org.apache.commons.lang3.text.StrMatcher strMatcher52 = strTokenizer51.getTrimmerMatcher();
        org.apache.commons.lang3.text.StrTokenizer strTokenizer53 = strTokenizer42.setTrimmerMatcher(strMatcher52);
        org.apache.commons.lang3.text.StrTokenizer strTokenizer54 = strTokenizer30.setTrimmerMatcher(strMatcher52);
        org.apache.commons.lang3.text.StrMatcher strMatcher55 = strTokenizer30.getDelimiterMatcher();
        boolean boolean56 = strTokenizer30.isIgnoreEmptyTokens();
        org.apache.commons.lang3.text.StrMatcher strMatcher57 = strTokenizer30.getQuoteMatcher();
        char[] charArray58 = null;
        org.apache.commons.lang3.text.StrTokenizer strTokenizer60 = new org.apache.commons.lang3.text.StrTokenizer(charArray58, "");
        java.lang.String str61 = strTokenizer60.getContent();
        org.apache.commons.lang3.text.StrMatcher strMatcher62 = strTokenizer60.getTrimmerMatcher();
        org.apache.commons.lang3.text.StrTokenizer strTokenizer63 = new org.apache.commons.lang3.text.StrTokenizer("4 ", strMatcher57, strMatcher62);
        org.apache.commons.lang3.text.StrTokenizer strTokenizer64 = strTokenizer20.setIgnoredMatcher(strMatcher57);
        org.apache.commons.lang3.text.StrTokenizer strTokenizer66 = strTokenizer20.setDelimiterChar('4');
        org.apache.commons.lang3.text.StrTokenizer strTokenizer68 = strTokenizer66.setIgnoredChar('a');
        org.junit.Assert.assertNotNull(charArray2);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray2), "4 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray2), "4 ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray2), "[4,  ]");
        org.junit.Assert.assertNotNull(strTokenizer6);
        org.junit.Assert.assertNotNull(charArray11);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray11), "4 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray11), "4 ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray11), "[4,  ]");
        org.junit.Assert.assertNotNull(strMatcher15);
        org.junit.Assert.assertNotNull(strTokenizer17);
        org.junit.Assert.assertNotNull(strMatcher18);
        org.junit.Assert.assertNotNull(strTokenizer20);
        org.junit.Assert.assertNotNull(charArray24);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray24), "4 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray24), "4 ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray24), "[4,  ]");
        org.junit.Assert.assertNotNull(strMatcher28);
        org.junit.Assert.assertNotNull(strTokenizer30);
        org.junit.Assert.assertNotNull(charArray34);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray34), "4 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray34), "4 ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray34), "[4,  ]");
        org.junit.Assert.assertNotNull(strMatcher38);
        org.junit.Assert.assertNotNull(strTokenizer40);
        org.junit.Assert.assertNotNull(strMatcher41);
        org.junit.Assert.assertNotNull(charArray45);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray45), "4 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray45), "4 ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray45), "[4,  ]");
        org.junit.Assert.assertNotNull(strMatcher49);
        org.junit.Assert.assertNotNull(strTokenizer51);
        org.junit.Assert.assertNotNull(strMatcher52);
        org.junit.Assert.assertNotNull(strTokenizer53);
        org.junit.Assert.assertNotNull(strTokenizer54);
        org.junit.Assert.assertNotNull(strMatcher55);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + true + "'", boolean56 == true);
        org.junit.Assert.assertNotNull(strMatcher57);
        org.junit.Assert.assertNull(str61);
        org.junit.Assert.assertNotNull(strMatcher62);
        org.junit.Assert.assertNotNull(strTokenizer64);
        org.junit.Assert.assertNotNull(strTokenizer66);
        org.junit.Assert.assertNotNull(strTokenizer68);
    }

    @Test
    public void test1634() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1634");
        char[] charArray2 = new char[] { '4', ' ' };
        org.apache.commons.lang3.text.StrTokenizer strTokenizer5 = new org.apache.commons.lang3.text.StrTokenizer(charArray2, 'a', ' ');
        org.apache.commons.lang3.text.StrMatcher strMatcher6 = strTokenizer5.getTrimmerMatcher();
        org.apache.commons.lang3.text.StrTokenizer strTokenizer8 = strTokenizer5.setDelimiterString("");
        org.apache.commons.lang3.text.StrMatcher strMatcher9 = strTokenizer8.getTrimmerMatcher();
        org.apache.commons.lang3.text.StrMatcher strMatcher10 = strTokenizer8.getTrimmerMatcher();
        char[] charArray13 = new char[] { '4', ' ' };
        org.apache.commons.lang3.text.StrTokenizer strTokenizer16 = new org.apache.commons.lang3.text.StrTokenizer(charArray13, 'a', ' ');
        org.apache.commons.lang3.text.StrTokenizer strTokenizer17 = strTokenizer8.reset(charArray13);
        org.apache.commons.lang3.text.StrTokenizer strTokenizer18 = org.apache.commons.lang3.text.StrTokenizer.getTSVInstance(charArray13);
        org.apache.commons.lang3.text.StrTokenizer strTokenizer21 = new org.apache.commons.lang3.text.StrTokenizer(charArray13, 'a', '4');
        org.junit.Assert.assertNotNull(charArray2);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray2), "4 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray2), "4 ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray2), "[4,  ]");
        org.junit.Assert.assertNotNull(strMatcher6);
        org.junit.Assert.assertNotNull(strTokenizer8);
        org.junit.Assert.assertNotNull(strMatcher9);
        org.junit.Assert.assertNotNull(strMatcher10);
        org.junit.Assert.assertNotNull(charArray13);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray13), "4 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray13), "4 ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray13), "[4,  ]");
        org.junit.Assert.assertNotNull(strTokenizer17);
        org.junit.Assert.assertNotNull(strTokenizer18);
    }

    @Test
    public void test1635() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1635");
        org.apache.commons.lang3.text.StrTokenizer strTokenizer3 = new org.apache.commons.lang3.text.StrTokenizer("", 'a', 'a');
        org.apache.commons.lang3.text.StrTokenizer strTokenizer5 = strTokenizer3.reset("StrTokenizer[4 ]");
        char[] charArray8 = new char[] { '4', ' ' };
        org.apache.commons.lang3.text.StrTokenizer strTokenizer11 = new org.apache.commons.lang3.text.StrTokenizer(charArray8, 'a', ' ');
        org.apache.commons.lang3.text.StrTokenizer strTokenizer13 = new org.apache.commons.lang3.text.StrTokenizer(charArray8, "hi!");
        org.apache.commons.lang3.text.StrTokenizer strTokenizer15 = new org.apache.commons.lang3.text.StrTokenizer(charArray8, '4');
        org.apache.commons.lang3.text.StrTokenizer strTokenizer16 = strTokenizer3.reset(charArray8);
        org.apache.commons.lang3.text.StrTokenizer strTokenizer18 = strTokenizer3.setEmptyTokenAsNull(false);
        org.apache.commons.lang3.text.StrTokenizer strTokenizer20 = strTokenizer18.setEmptyTokenAsNull(true);
        org.junit.Assert.assertNotNull(strTokenizer5);
        org.junit.Assert.assertNotNull(charArray8);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray8), "4 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray8), "4 ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray8), "[4,  ]");
        org.junit.Assert.assertNotNull(strTokenizer16);
        org.junit.Assert.assertNotNull(strTokenizer18);
        org.junit.Assert.assertNotNull(strTokenizer20);
    }

    @Test
    public void test1636() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1636");
        org.apache.commons.lang3.text.StrTokenizer strTokenizer3 = new org.apache.commons.lang3.text.StrTokenizer("", 'a', 'a');
        org.apache.commons.lang3.text.StrTokenizer strTokenizer5 = strTokenizer3.reset("StrTokenizer[4 ]");
        char[] charArray8 = new char[] { '4', ' ' };
        org.apache.commons.lang3.text.StrTokenizer strTokenizer11 = new org.apache.commons.lang3.text.StrTokenizer(charArray8, 'a', ' ');
        org.apache.commons.lang3.text.StrTokenizer strTokenizer12 = org.apache.commons.lang3.text.StrTokenizer.getCSVInstance(charArray8);
        org.apache.commons.lang3.text.StrMatcher strMatcher13 = null;
        org.apache.commons.lang3.text.StrTokenizer strTokenizer14 = new org.apache.commons.lang3.text.StrTokenizer(charArray8, strMatcher13);
        char[] charArray15 = null;
        org.apache.commons.lang3.text.StrTokenizer strTokenizer17 = new org.apache.commons.lang3.text.StrTokenizer(charArray15, "");
        org.apache.commons.lang3.text.StrMatcher strMatcher18 = strTokenizer17.getQuoteMatcher();
        char[] charArray22 = new char[] { '4', ' ' };
        org.apache.commons.lang3.text.StrTokenizer strTokenizer25 = new org.apache.commons.lang3.text.StrTokenizer(charArray22, 'a', ' ');
        org.apache.commons.lang3.text.StrMatcher strMatcher26 = strTokenizer25.getTrimmerMatcher();
        org.apache.commons.lang3.text.StrTokenizer strTokenizer28 = strTokenizer25.setDelimiterString("");
        org.apache.commons.lang3.text.StrMatcher strMatcher29 = strTokenizer28.getTrimmerMatcher();
        org.apache.commons.lang3.text.StrTokenizer strTokenizer30 = new org.apache.commons.lang3.text.StrTokenizer("", strMatcher29);
        char[] charArray33 = new char[] { '4', ' ' };
        org.apache.commons.lang3.text.StrTokenizer strTokenizer36 = new org.apache.commons.lang3.text.StrTokenizer(charArray33, 'a', ' ');
        org.apache.commons.lang3.text.StrMatcher strMatcher37 = strTokenizer36.getTrimmerMatcher();
        org.apache.commons.lang3.text.StrMatcher strMatcher38 = strTokenizer36.getQuoteMatcher();
        org.apache.commons.lang3.text.StrTokenizer strTokenizer39 = strTokenizer30.setDelimiterMatcher(strMatcher38);
        org.apache.commons.lang3.text.StrTokenizer strTokenizer40 = new org.apache.commons.lang3.text.StrTokenizer(charArray8, strMatcher18, strMatcher38);
        org.apache.commons.lang3.text.StrTokenizer strTokenizer41 = new org.apache.commons.lang3.text.StrTokenizer(charArray8);
        org.apache.commons.lang3.text.StrTokenizer strTokenizer43 = new org.apache.commons.lang3.text.StrTokenizer(charArray8, '4');
        char[] charArray45 = null;
        org.apache.commons.lang3.text.StrTokenizer strTokenizer47 = new org.apache.commons.lang3.text.StrTokenizer(charArray45, "");
        java.lang.String str48 = strTokenizer47.getContent();
        org.apache.commons.lang3.text.StrMatcher strMatcher49 = strTokenizer47.getDelimiterMatcher();
        org.apache.commons.lang3.text.StrTokenizer strTokenizer51 = org.apache.commons.lang3.text.StrTokenizer.getCSVInstance("");
        java.util.List<java.lang.String> strList52 = strTokenizer51.getTokenList();
        boolean boolean53 = strTokenizer51.hasPrevious();
        java.lang.String[] strArray54 = strTokenizer51.getTokenArray();
        char[] charArray57 = new char[] { '4', ' ' };
        org.apache.commons.lang3.text.StrTokenizer strTokenizer60 = new org.apache.commons.lang3.text.StrTokenizer(charArray57, 'a', ' ');
        org.apache.commons.lang3.text.StrTokenizer strTokenizer61 = org.apache.commons.lang3.text.StrTokenizer.getCSVInstance(charArray57);
        org.apache.commons.lang3.text.StrMatcher strMatcher62 = null;
        org.apache.commons.lang3.text.StrTokenizer strTokenizer63 = new org.apache.commons.lang3.text.StrTokenizer(charArray57, strMatcher62);
        char[] charArray66 = new char[] { '4', ' ' };
        org.apache.commons.lang3.text.StrTokenizer strTokenizer69 = new org.apache.commons.lang3.text.StrTokenizer(charArray66, 'a', ' ');
        org.apache.commons.lang3.text.StrMatcher strMatcher70 = strTokenizer69.getTrimmerMatcher();
        org.apache.commons.lang3.text.StrTokenizer strTokenizer72 = strTokenizer69.setDelimiterString("");
        org.apache.commons.lang3.text.StrMatcher strMatcher73 = strTokenizer72.getTrimmerMatcher();
        org.apache.commons.lang3.text.StrTokenizer strTokenizer74 = new org.apache.commons.lang3.text.StrTokenizer(charArray57, strMatcher73);
        org.apache.commons.lang3.text.StrTokenizer strTokenizer75 = strTokenizer51.setTrimmerMatcher(strMatcher73);
        org.apache.commons.lang3.text.StrTokenizer strTokenizer76 = new org.apache.commons.lang3.text.StrTokenizer("StrTokenizer[]", strMatcher49, strMatcher73);
        char[] charArray79 = new char[] { '4', ' ' };
        org.apache.commons.lang3.text.StrTokenizer strTokenizer82 = new org.apache.commons.lang3.text.StrTokenizer(charArray79, 'a', ' ');
        org.apache.commons.lang3.text.StrMatcher strMatcher83 = strTokenizer82.getTrimmerMatcher();
        org.apache.commons.lang3.text.StrTokenizer strTokenizer85 = strTokenizer82.setDelimiterString("");
        org.apache.commons.lang3.text.StrMatcher strMatcher86 = strTokenizer85.getTrimmerMatcher();
        org.apache.commons.lang3.text.StrMatcher strMatcher87 = strTokenizer85.getTrimmerMatcher();
        org.apache.commons.lang3.text.StrTokenizer strTokenizer88 = new org.apache.commons.lang3.text.StrTokenizer(charArray8, strMatcher49, strMatcher87);
        org.apache.commons.lang3.text.StrTokenizer strTokenizer89 = strTokenizer3.setTrimmerMatcher(strMatcher49);
        org.apache.commons.lang3.text.StrMatcher strMatcher90 = strTokenizer89.getTrimmerMatcher();
        org.junit.Assert.assertNotNull(strTokenizer5);
        org.junit.Assert.assertNotNull(charArray8);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray8), "4 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray8), "4 ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray8), "[4,  ]");
        org.junit.Assert.assertNotNull(strTokenizer12);
        org.junit.Assert.assertNotNull(strMatcher18);
        org.junit.Assert.assertNotNull(charArray22);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray22), "4 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray22), "4 ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray22), "[4,  ]");
        org.junit.Assert.assertNotNull(strMatcher26);
        org.junit.Assert.assertNotNull(strTokenizer28);
        org.junit.Assert.assertNotNull(strMatcher29);
        org.junit.Assert.assertNotNull(charArray33);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray33), "4 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray33), "4 ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray33), "[4,  ]");
        org.junit.Assert.assertNotNull(strMatcher37);
        org.junit.Assert.assertNotNull(strMatcher38);
        org.junit.Assert.assertNotNull(strTokenizer39);
        org.junit.Assert.assertNull(str48);
        org.junit.Assert.assertNotNull(strMatcher49);
        org.junit.Assert.assertNotNull(strTokenizer51);
        org.junit.Assert.assertNotNull(strList52);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
        org.junit.Assert.assertNotNull(strArray54);
        org.junit.Assert.assertNotNull(charArray57);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray57), "4 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray57), "4 ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray57), "[4,  ]");
        org.junit.Assert.assertNotNull(strTokenizer61);
        org.junit.Assert.assertNotNull(charArray66);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray66), "4 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray66), "4 ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray66), "[4,  ]");
        org.junit.Assert.assertNotNull(strMatcher70);
        org.junit.Assert.assertNotNull(strTokenizer72);
        org.junit.Assert.assertNotNull(strMatcher73);
        org.junit.Assert.assertNotNull(strTokenizer75);
        org.junit.Assert.assertNotNull(charArray79);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray79), "4 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray79), "4 ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray79), "[4,  ]");
        org.junit.Assert.assertNotNull(strMatcher83);
        org.junit.Assert.assertNotNull(strTokenizer85);
        org.junit.Assert.assertNotNull(strMatcher86);
        org.junit.Assert.assertNotNull(strMatcher87);
        org.junit.Assert.assertNotNull(strTokenizer89);
        org.junit.Assert.assertNotNull(strMatcher90);
    }

    @Test
    public void test1637() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1637");
        char[] charArray2 = new char[] { '4', ' ' };
        org.apache.commons.lang3.text.StrTokenizer strTokenizer5 = new org.apache.commons.lang3.text.StrTokenizer(charArray2, 'a', ' ');
        org.apache.commons.lang3.text.StrMatcher strMatcher6 = strTokenizer5.getTrimmerMatcher();
        char[] charArray9 = new char[] { '4', ' ' };
        org.apache.commons.lang3.text.StrTokenizer strTokenizer12 = new org.apache.commons.lang3.text.StrTokenizer(charArray9, 'a', ' ');
        org.apache.commons.lang3.text.StrTokenizer strTokenizer13 = org.apache.commons.lang3.text.StrTokenizer.getCSVInstance(charArray9);
        org.apache.commons.lang3.text.StrMatcher strMatcher14 = null;
        org.apache.commons.lang3.text.StrTokenizer strTokenizer15 = new org.apache.commons.lang3.text.StrTokenizer(charArray9, strMatcher14);
        org.apache.commons.lang3.text.StrTokenizer strTokenizer16 = strTokenizer5.reset(charArray9);
        org.apache.commons.lang3.text.StrTokenizer strTokenizer17 = org.apache.commons.lang3.text.StrTokenizer.getCSVInstance(charArray9);
        org.apache.commons.lang3.text.StrTokenizer strTokenizer18 = new org.apache.commons.lang3.text.StrTokenizer(charArray9);
        org.apache.commons.lang3.text.StrTokenizer strTokenizer20 = new org.apache.commons.lang3.text.StrTokenizer(charArray9, '#');
        java.lang.String str21 = strTokenizer20.next();
        char[] charArray24 = new char[] { '4', ' ' };
        org.apache.commons.lang3.text.StrTokenizer strTokenizer27 = new org.apache.commons.lang3.text.StrTokenizer(charArray24, 'a', ' ');
        org.apache.commons.lang3.text.StrTokenizer strTokenizer28 = org.apache.commons.lang3.text.StrTokenizer.getCSVInstance(charArray24);
        char[] charArray31 = null;
        org.apache.commons.lang3.text.StrTokenizer strTokenizer33 = new org.apache.commons.lang3.text.StrTokenizer(charArray31, "");
        java.lang.String str34 = strTokenizer33.getContent();
        org.apache.commons.lang3.text.StrMatcher strMatcher35 = strTokenizer33.getDelimiterMatcher();
        org.apache.commons.lang3.text.StrTokenizer strTokenizer36 = new org.apache.commons.lang3.text.StrTokenizer("StrTokenizer[4 ]", strMatcher35);
        org.apache.commons.lang3.text.StrMatcher strMatcher37 = null;
        org.apache.commons.lang3.text.StrTokenizer strTokenizer38 = new org.apache.commons.lang3.text.StrTokenizer("StrTokenizer[not tokenized yet]", strMatcher35, strMatcher37);
        char[] charArray42 = null;
        org.apache.commons.lang3.text.StrTokenizer strTokenizer44 = new org.apache.commons.lang3.text.StrTokenizer(charArray42, "");
        java.lang.String str45 = strTokenizer44.getContent();
        org.apache.commons.lang3.text.StrMatcher strMatcher46 = strTokenizer44.getDelimiterMatcher();
        org.apache.commons.lang3.text.StrTokenizer strTokenizer47 = new org.apache.commons.lang3.text.StrTokenizer("StrTokenizer[4 ]", strMatcher46);
        org.apache.commons.lang3.text.StrMatcher strMatcher48 = null;
        org.apache.commons.lang3.text.StrTokenizer strTokenizer49 = new org.apache.commons.lang3.text.StrTokenizer("StrTokenizer[not tokenized yet]", strMatcher46, strMatcher48);
        char[] charArray51 = null;
        org.apache.commons.lang3.text.StrTokenizer strTokenizer53 = new org.apache.commons.lang3.text.StrTokenizer(charArray51, "");
        java.lang.String str54 = strTokenizer53.getContent();
        org.apache.commons.lang3.text.StrMatcher strMatcher55 = strTokenizer53.getDelimiterMatcher();
        org.apache.commons.lang3.text.StrTokenizer strTokenizer56 = new org.apache.commons.lang3.text.StrTokenizer("hi!", strMatcher55);
        org.apache.commons.lang3.text.StrTokenizer strTokenizer57 = new org.apache.commons.lang3.text.StrTokenizer("4", strMatcher46, strMatcher55);
        org.apache.commons.lang3.text.StrTokenizer strTokenizer58 = new org.apache.commons.lang3.text.StrTokenizer(charArray24, strMatcher35, strMatcher46);
        org.apache.commons.lang3.text.StrTokenizer strTokenizer59 = strTokenizer20.setQuoteMatcher(strMatcher46);
        org.junit.Assert.assertNotNull(charArray2);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray2), "4 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray2), "4 ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray2), "[4,  ]");
        org.junit.Assert.assertNotNull(strMatcher6);
        org.junit.Assert.assertNotNull(charArray9);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray9), "4 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray9), "4 ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray9), "[4,  ]");
        org.junit.Assert.assertNotNull(strTokenizer13);
        org.junit.Assert.assertNotNull(strTokenizer16);
        org.junit.Assert.assertNotNull(strTokenizer17);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "4 " + "'", str21, "4 ");
        org.junit.Assert.assertNotNull(charArray24);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray24), "4 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray24), "4 ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray24), "[4,  ]");
        org.junit.Assert.assertNotNull(strTokenizer28);
        org.junit.Assert.assertNull(str34);
        org.junit.Assert.assertNotNull(strMatcher35);
        org.junit.Assert.assertNull(str45);
        org.junit.Assert.assertNotNull(strMatcher46);
        org.junit.Assert.assertNull(str54);
        org.junit.Assert.assertNotNull(strMatcher55);
        org.junit.Assert.assertNotNull(strTokenizer59);
    }

    @Test
    public void test1638() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1638");
        char[] charArray2 = new char[] { '4', ' ' };
        org.apache.commons.lang3.text.StrTokenizer strTokenizer5 = new org.apache.commons.lang3.text.StrTokenizer(charArray2, 'a', ' ');
        org.apache.commons.lang3.text.StrMatcher strMatcher6 = strTokenizer5.getTrimmerMatcher();
        org.apache.commons.lang3.text.StrTokenizer strTokenizer8 = strTokenizer5.setDelimiterString("");
        org.apache.commons.lang3.text.StrMatcher strMatcher9 = strTokenizer8.getTrimmerMatcher();
        org.apache.commons.lang3.text.StrMatcher strMatcher10 = strTokenizer8.getTrimmerMatcher();
        char[] charArray13 = new char[] { '4', ' ' };
        org.apache.commons.lang3.text.StrTokenizer strTokenizer16 = new org.apache.commons.lang3.text.StrTokenizer(charArray13, 'a', ' ');
        org.apache.commons.lang3.text.StrTokenizer strTokenizer17 = strTokenizer8.reset(charArray13);
        char[] charArray20 = new char[] { '4', ' ' };
        org.apache.commons.lang3.text.StrTokenizer strTokenizer23 = new org.apache.commons.lang3.text.StrTokenizer(charArray20, 'a', ' ');
        org.apache.commons.lang3.text.StrMatcher strMatcher24 = strTokenizer23.getTrimmerMatcher();
        org.apache.commons.lang3.text.StrTokenizer strTokenizer26 = strTokenizer23.setDelimiterString("");
        char[] charArray30 = new char[] { '4', ' ' };
        org.apache.commons.lang3.text.StrTokenizer strTokenizer33 = new org.apache.commons.lang3.text.StrTokenizer(charArray30, 'a', ' ');
        org.apache.commons.lang3.text.StrMatcher strMatcher34 = strTokenizer33.getTrimmerMatcher();
        org.apache.commons.lang3.text.StrTokenizer strTokenizer36 = strTokenizer33.setDelimiterString("");
        org.apache.commons.lang3.text.StrMatcher strMatcher37 = strTokenizer36.getTrimmerMatcher();
        org.apache.commons.lang3.text.StrTokenizer strTokenizer38 = new org.apache.commons.lang3.text.StrTokenizer("", strMatcher37);
        char[] charArray41 = new char[] { '4', ' ' };
        org.apache.commons.lang3.text.StrTokenizer strTokenizer44 = new org.apache.commons.lang3.text.StrTokenizer(charArray41, 'a', ' ');
        org.apache.commons.lang3.text.StrMatcher strMatcher45 = strTokenizer44.getTrimmerMatcher();
        org.apache.commons.lang3.text.StrTokenizer strTokenizer47 = strTokenizer44.setDelimiterString("");
        org.apache.commons.lang3.text.StrMatcher strMatcher48 = strTokenizer47.getTrimmerMatcher();
        org.apache.commons.lang3.text.StrTokenizer strTokenizer49 = strTokenizer38.setTrimmerMatcher(strMatcher48);
        org.apache.commons.lang3.text.StrTokenizer strTokenizer50 = strTokenizer26.setTrimmerMatcher(strMatcher48);
        org.apache.commons.lang3.text.StrTokenizer strTokenizer51 = strTokenizer8.setQuoteMatcher(strMatcher48);
        java.lang.String str52 = strTokenizer51.getContent();
        org.apache.commons.lang3.text.StrTokenizer strTokenizer54 = strTokenizer51.setDelimiterString("StrTokenizer[4 ]");
        org.apache.commons.lang3.text.StrTokenizer strTokenizer56 = strTokenizer54.setIgnoreEmptyTokens(false);
        org.apache.commons.lang3.text.StrTokenizer strTokenizer57 = strTokenizer56.reset();
        boolean boolean58 = strTokenizer57.hasPrevious();
        org.junit.Assert.assertNotNull(charArray2);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray2), "4 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray2), "4 ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray2), "[4,  ]");
        org.junit.Assert.assertNotNull(strMatcher6);
        org.junit.Assert.assertNotNull(strTokenizer8);
        org.junit.Assert.assertNotNull(strMatcher9);
        org.junit.Assert.assertNotNull(strMatcher10);
        org.junit.Assert.assertNotNull(charArray13);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray13), "4 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray13), "4 ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray13), "[4,  ]");
        org.junit.Assert.assertNotNull(strTokenizer17);
        org.junit.Assert.assertNotNull(charArray20);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray20), "4 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray20), "4 ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray20), "[4,  ]");
        org.junit.Assert.assertNotNull(strMatcher24);
        org.junit.Assert.assertNotNull(strTokenizer26);
        org.junit.Assert.assertNotNull(charArray30);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray30), "4 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray30), "4 ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray30), "[4,  ]");
        org.junit.Assert.assertNotNull(strMatcher34);
        org.junit.Assert.assertNotNull(strTokenizer36);
        org.junit.Assert.assertNotNull(strMatcher37);
        org.junit.Assert.assertNotNull(charArray41);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray41), "4 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray41), "4 ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray41), "[4,  ]");
        org.junit.Assert.assertNotNull(strMatcher45);
        org.junit.Assert.assertNotNull(strTokenizer47);
        org.junit.Assert.assertNotNull(strMatcher48);
        org.junit.Assert.assertNotNull(strTokenizer49);
        org.junit.Assert.assertNotNull(strTokenizer50);
        org.junit.Assert.assertNotNull(strTokenizer51);
        org.junit.Assert.assertEquals("'" + str52 + "' != '" + "4 " + "'", str52, "4 ");
        org.junit.Assert.assertNotNull(strTokenizer54);
        org.junit.Assert.assertNotNull(strTokenizer56);
        org.junit.Assert.assertNotNull(strTokenizer57);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + false + "'", boolean58 == false);
    }

    @Test
    public void test1639() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1639");
        char[] charArray2 = new char[] { '4', ' ' };
        org.apache.commons.lang3.text.StrTokenizer strTokenizer5 = new org.apache.commons.lang3.text.StrTokenizer(charArray2, 'a', ' ');
        org.apache.commons.lang3.text.StrTokenizer strTokenizer6 = org.apache.commons.lang3.text.StrTokenizer.getTSVInstance(charArray2);
        org.apache.commons.lang3.text.StrTokenizer strTokenizer9 = new org.apache.commons.lang3.text.StrTokenizer(charArray2, '#', 'a');
        org.apache.commons.lang3.text.StrMatcher strMatcher10 = null;
        char[] charArray14 = new char[] { '4', ' ' };
        org.apache.commons.lang3.text.StrTokenizer strTokenizer17 = new org.apache.commons.lang3.text.StrTokenizer(charArray14, 'a', ' ');
        org.apache.commons.lang3.text.StrMatcher strMatcher18 = strTokenizer17.getTrimmerMatcher();
        org.apache.commons.lang3.text.StrTokenizer strTokenizer20 = strTokenizer17.setDelimiterString("");
        org.apache.commons.lang3.text.StrMatcher strMatcher21 = strTokenizer20.getTrimmerMatcher();
        org.apache.commons.lang3.text.StrTokenizer strTokenizer22 = new org.apache.commons.lang3.text.StrTokenizer("", strMatcher21);
        org.apache.commons.lang3.text.StrTokenizer strTokenizer23 = new org.apache.commons.lang3.text.StrTokenizer(charArray2, strMatcher10, strMatcher21);
        org.apache.commons.lang3.text.StrTokenizer strTokenizer26 = new org.apache.commons.lang3.text.StrTokenizer(charArray2, '#', ' ');
        org.apache.commons.lang3.text.StrTokenizer strTokenizer28 = new org.apache.commons.lang3.text.StrTokenizer(charArray2, ' ');
        org.junit.Assert.assertNotNull(charArray2);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray2), "4 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray2), "4 ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray2), "[4,  ]");
        org.junit.Assert.assertNotNull(strTokenizer6);
        org.junit.Assert.assertNotNull(charArray14);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray14), "4 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray14), "4 ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray14), "[4,  ]");
        org.junit.Assert.assertNotNull(strMatcher18);
        org.junit.Assert.assertNotNull(strTokenizer20);
        org.junit.Assert.assertNotNull(strMatcher21);
    }

    @Test
    public void test1640() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1640");
        char[] charArray4 = new char[] { '4', ' ' };
        org.apache.commons.lang3.text.StrTokenizer strTokenizer7 = new org.apache.commons.lang3.text.StrTokenizer(charArray4, 'a', ' ');
        org.apache.commons.lang3.text.StrTokenizer strTokenizer9 = new org.apache.commons.lang3.text.StrTokenizer(charArray4, "hi!");
        org.apache.commons.lang3.text.StrTokenizer strTokenizer10 = new org.apache.commons.lang3.text.StrTokenizer(charArray4);
        char[] charArray15 = new char[] { '4', ' ' };
        org.apache.commons.lang3.text.StrTokenizer strTokenizer18 = new org.apache.commons.lang3.text.StrTokenizer(charArray15, 'a', ' ');
        org.apache.commons.lang3.text.StrMatcher strMatcher19 = strTokenizer18.getTrimmerMatcher();
        org.apache.commons.lang3.text.StrTokenizer strTokenizer21 = strTokenizer18.setDelimiterString("");
        org.apache.commons.lang3.text.StrMatcher strMatcher22 = strTokenizer21.getTrimmerMatcher();
        org.apache.commons.lang3.text.StrTokenizer strTokenizer23 = new org.apache.commons.lang3.text.StrTokenizer("", strMatcher22);
        char[] charArray26 = new char[] { '4', ' ' };
        org.apache.commons.lang3.text.StrTokenizer strTokenizer29 = new org.apache.commons.lang3.text.StrTokenizer(charArray26, 'a', ' ');
        org.apache.commons.lang3.text.StrMatcher strMatcher30 = strTokenizer29.getTrimmerMatcher();
        org.apache.commons.lang3.text.StrMatcher strMatcher31 = strTokenizer29.getQuoteMatcher();
        org.apache.commons.lang3.text.StrTokenizer strTokenizer32 = strTokenizer23.setDelimiterMatcher(strMatcher31);
        char[] charArray35 = new char[] { '4', ' ' };
        org.apache.commons.lang3.text.StrTokenizer strTokenizer38 = new org.apache.commons.lang3.text.StrTokenizer(charArray35, 'a', ' ');
        org.apache.commons.lang3.text.StrMatcher strMatcher39 = strTokenizer38.getTrimmerMatcher();
        org.apache.commons.lang3.text.StrMatcher strMatcher40 = strTokenizer38.getQuoteMatcher();
        org.apache.commons.lang3.text.StrTokenizer strTokenizer41 = new org.apache.commons.lang3.text.StrTokenizer("", strMatcher31, strMatcher40);
        org.apache.commons.lang3.text.StrTokenizer strTokenizer42 = strTokenizer10.setTrimmerMatcher(strMatcher40);
        org.apache.commons.lang3.text.StrTokenizer strTokenizer45 = new org.apache.commons.lang3.text.StrTokenizer("4 ", 'a');
        char[] charArray49 = new char[] { '4', ' ' };
        org.apache.commons.lang3.text.StrTokenizer strTokenizer52 = new org.apache.commons.lang3.text.StrTokenizer(charArray49, 'a', ' ');
        org.apache.commons.lang3.text.StrMatcher strMatcher53 = strTokenizer52.getTrimmerMatcher();
        org.apache.commons.lang3.text.StrTokenizer strTokenizer55 = strTokenizer52.setDelimiterString("");
        char[] charArray59 = new char[] { '4', ' ' };
        org.apache.commons.lang3.text.StrTokenizer strTokenizer62 = new org.apache.commons.lang3.text.StrTokenizer(charArray59, 'a', ' ');
        org.apache.commons.lang3.text.StrMatcher strMatcher63 = strTokenizer62.getTrimmerMatcher();
        org.apache.commons.lang3.text.StrTokenizer strTokenizer65 = strTokenizer62.setDelimiterString("");
        org.apache.commons.lang3.text.StrMatcher strMatcher66 = strTokenizer65.getTrimmerMatcher();
        org.apache.commons.lang3.text.StrTokenizer strTokenizer67 = new org.apache.commons.lang3.text.StrTokenizer("", strMatcher66);
        char[] charArray70 = new char[] { '4', ' ' };
        org.apache.commons.lang3.text.StrTokenizer strTokenizer73 = new org.apache.commons.lang3.text.StrTokenizer(charArray70, 'a', ' ');
        org.apache.commons.lang3.text.StrMatcher strMatcher74 = strTokenizer73.getTrimmerMatcher();
        org.apache.commons.lang3.text.StrTokenizer strTokenizer76 = strTokenizer73.setDelimiterString("");
        org.apache.commons.lang3.text.StrMatcher strMatcher77 = strTokenizer76.getTrimmerMatcher();
        org.apache.commons.lang3.text.StrTokenizer strTokenizer78 = strTokenizer67.setTrimmerMatcher(strMatcher77);
        org.apache.commons.lang3.text.StrTokenizer strTokenizer79 = strTokenizer55.setTrimmerMatcher(strMatcher77);
        org.apache.commons.lang3.text.StrMatcher strMatcher80 = strTokenizer55.getDelimiterMatcher();
        boolean boolean81 = strTokenizer55.isIgnoreEmptyTokens();
        org.apache.commons.lang3.text.StrMatcher strMatcher82 = strTokenizer55.getQuoteMatcher();
        char[] charArray83 = null;
        org.apache.commons.lang3.text.StrTokenizer strTokenizer85 = new org.apache.commons.lang3.text.StrTokenizer(charArray83, "");
        java.lang.String str86 = strTokenizer85.getContent();
        org.apache.commons.lang3.text.StrMatcher strMatcher87 = strTokenizer85.getTrimmerMatcher();
        org.apache.commons.lang3.text.StrTokenizer strTokenizer88 = new org.apache.commons.lang3.text.StrTokenizer("4 ", strMatcher82, strMatcher87);
        org.apache.commons.lang3.text.StrTokenizer strTokenizer89 = strTokenizer45.setDelimiterMatcher(strMatcher82);
        org.apache.commons.lang3.text.StrMatcher strMatcher90 = strTokenizer45.getQuoteMatcher();
        org.apache.commons.lang3.text.StrTokenizer strTokenizer91 = strTokenizer42.setIgnoredMatcher(strMatcher90);
        org.apache.commons.lang3.text.StrTokenizer strTokenizer92 = new org.apache.commons.lang3.text.StrTokenizer("4 ", strMatcher90);
        org.apache.commons.lang3.text.StrMatcher strMatcher93 = strTokenizer92.getIgnoredMatcher();
        org.apache.commons.lang3.text.StrTokenizer strTokenizer94 = new org.apache.commons.lang3.text.StrTokenizer("StrTokenizer[4 ]", strMatcher93);
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray4), "4 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray4), "4 ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray4), "[4,  ]");
        org.junit.Assert.assertNotNull(charArray15);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray15), "4 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray15), "4 ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray15), "[4,  ]");
        org.junit.Assert.assertNotNull(strMatcher19);
        org.junit.Assert.assertNotNull(strTokenizer21);
        org.junit.Assert.assertNotNull(strMatcher22);
        org.junit.Assert.assertNotNull(charArray26);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray26), "4 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray26), "4 ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray26), "[4,  ]");
        org.junit.Assert.assertNotNull(strMatcher30);
        org.junit.Assert.assertNotNull(strMatcher31);
        org.junit.Assert.assertNotNull(strTokenizer32);
        org.junit.Assert.assertNotNull(charArray35);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray35), "4 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray35), "4 ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray35), "[4,  ]");
        org.junit.Assert.assertNotNull(strMatcher39);
        org.junit.Assert.assertNotNull(strMatcher40);
        org.junit.Assert.assertNotNull(strTokenizer42);
        org.junit.Assert.assertNotNull(charArray49);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray49), "4 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray49), "4 ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray49), "[4,  ]");
        org.junit.Assert.assertNotNull(strMatcher53);
        org.junit.Assert.assertNotNull(strTokenizer55);
        org.junit.Assert.assertNotNull(charArray59);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray59), "4 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray59), "4 ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray59), "[4,  ]");
        org.junit.Assert.assertNotNull(strMatcher63);
        org.junit.Assert.assertNotNull(strTokenizer65);
        org.junit.Assert.assertNotNull(strMatcher66);
        org.junit.Assert.assertNotNull(charArray70);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray70), "4 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray70), "4 ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray70), "[4,  ]");
        org.junit.Assert.assertNotNull(strMatcher74);
        org.junit.Assert.assertNotNull(strTokenizer76);
        org.junit.Assert.assertNotNull(strMatcher77);
        org.junit.Assert.assertNotNull(strTokenizer78);
        org.junit.Assert.assertNotNull(strTokenizer79);
        org.junit.Assert.assertNotNull(strMatcher80);
        org.junit.Assert.assertTrue("'" + boolean81 + "' != '" + true + "'", boolean81 == true);
        org.junit.Assert.assertNotNull(strMatcher82);
        org.junit.Assert.assertNull(str86);
        org.junit.Assert.assertNotNull(strMatcher87);
        org.junit.Assert.assertNotNull(strTokenizer89);
        org.junit.Assert.assertNotNull(strMatcher90);
        org.junit.Assert.assertNotNull(strTokenizer91);
        org.junit.Assert.assertNotNull(strMatcher93);
    }

    @Test
    public void test1641() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1641");
        char[] charArray2 = new char[] { '4', ' ' };
        org.apache.commons.lang3.text.StrTokenizer strTokenizer5 = new org.apache.commons.lang3.text.StrTokenizer(charArray2, 'a', ' ');
        org.apache.commons.lang3.text.StrTokenizer strTokenizer6 = org.apache.commons.lang3.text.StrTokenizer.getCSVInstance(charArray2);
        org.apache.commons.lang3.text.StrMatcher strMatcher7 = null;
        org.apache.commons.lang3.text.StrTokenizer strTokenizer8 = new org.apache.commons.lang3.text.StrTokenizer(charArray2, strMatcher7);
        org.apache.commons.lang3.text.StrTokenizer strTokenizer11 = new org.apache.commons.lang3.text.StrTokenizer(charArray2, ' ', '#');
        char[] charArray15 = new char[] { '4', ' ' };
        org.apache.commons.lang3.text.StrTokenizer strTokenizer18 = new org.apache.commons.lang3.text.StrTokenizer(charArray15, 'a', ' ');
        org.apache.commons.lang3.text.StrMatcher strMatcher19 = strTokenizer18.getTrimmerMatcher();
        org.apache.commons.lang3.text.StrTokenizer strTokenizer21 = strTokenizer18.setDelimiterString("");
        org.apache.commons.lang3.text.StrMatcher strMatcher22 = strTokenizer21.getTrimmerMatcher();
        org.apache.commons.lang3.text.StrTokenizer strTokenizer23 = new org.apache.commons.lang3.text.StrTokenizer("", strMatcher22);
        char[] charArray26 = new char[] { '4', ' ' };
        org.apache.commons.lang3.text.StrTokenizer strTokenizer29 = new org.apache.commons.lang3.text.StrTokenizer(charArray26, 'a', ' ');
        org.apache.commons.lang3.text.StrMatcher strMatcher30 = strTokenizer29.getTrimmerMatcher();
        org.apache.commons.lang3.text.StrTokenizer strTokenizer32 = strTokenizer29.setDelimiterString("");
        org.apache.commons.lang3.text.StrMatcher strMatcher33 = strTokenizer32.getTrimmerMatcher();
        org.apache.commons.lang3.text.StrTokenizer strTokenizer34 = strTokenizer23.setTrimmerMatcher(strMatcher33);
        org.apache.commons.lang3.text.StrTokenizer strTokenizer35 = new org.apache.commons.lang3.text.StrTokenizer(charArray2, strMatcher33);
        org.apache.commons.lang3.text.StrTokenizer strTokenizer36 = org.apache.commons.lang3.text.StrTokenizer.getCSVInstance(charArray2);
        org.apache.commons.lang3.text.StrTokenizer strTokenizer39 = new org.apache.commons.lang3.text.StrTokenizer(charArray2, ' ', 'a');
        org.apache.commons.lang3.text.StrTokenizer strTokenizer41 = new org.apache.commons.lang3.text.StrTokenizer(charArray2, "StrTokenizer[]");
        org.apache.commons.lang3.text.StrTokenizer strTokenizer42 = org.apache.commons.lang3.text.StrTokenizer.getTSVInstance(charArray2);
        char[] charArray47 = new char[] { '4', ' ' };
        org.apache.commons.lang3.text.StrTokenizer strTokenizer50 = new org.apache.commons.lang3.text.StrTokenizer(charArray47, 'a', ' ');
        org.apache.commons.lang3.text.StrMatcher strMatcher51 = strTokenizer50.getTrimmerMatcher();
        org.apache.commons.lang3.text.StrMatcher strMatcher52 = strTokenizer50.getQuoteMatcher();
        char[] charArray55 = new char[] { '4', ' ' };
        org.apache.commons.lang3.text.StrTokenizer strTokenizer58 = new org.apache.commons.lang3.text.StrTokenizer(charArray55, 'a', ' ');
        org.apache.commons.lang3.text.StrMatcher strMatcher59 = strTokenizer58.getTrimmerMatcher();
        org.apache.commons.lang3.text.StrTokenizer strTokenizer60 = new org.apache.commons.lang3.text.StrTokenizer("StrTokenizer[4 ]", strMatcher52, strMatcher59);
        org.apache.commons.lang3.text.StrTokenizer strTokenizer61 = new org.apache.commons.lang3.text.StrTokenizer(" ", strMatcher52);
        char[] charArray65 = new char[] { '4', ' ' };
        org.apache.commons.lang3.text.StrTokenizer strTokenizer68 = new org.apache.commons.lang3.text.StrTokenizer(charArray65, 'a', ' ');
        org.apache.commons.lang3.text.StrTokenizer strTokenizer69 = org.apache.commons.lang3.text.StrTokenizer.getCSVInstance(charArray65);
        org.apache.commons.lang3.text.StrMatcher strMatcher70 = null;
        org.apache.commons.lang3.text.StrTokenizer strTokenizer71 = new org.apache.commons.lang3.text.StrTokenizer(charArray65, strMatcher70);
        char[] charArray74 = new char[] { '4', ' ' };
        org.apache.commons.lang3.text.StrTokenizer strTokenizer77 = new org.apache.commons.lang3.text.StrTokenizer(charArray74, 'a', ' ');
        org.apache.commons.lang3.text.StrMatcher strMatcher78 = strTokenizer77.getTrimmerMatcher();
        org.apache.commons.lang3.text.StrTokenizer strTokenizer80 = strTokenizer77.setDelimiterString("");
        org.apache.commons.lang3.text.StrMatcher strMatcher81 = strTokenizer80.getTrimmerMatcher();
        org.apache.commons.lang3.text.StrTokenizer strTokenizer82 = new org.apache.commons.lang3.text.StrTokenizer(charArray65, strMatcher81);
        org.apache.commons.lang3.text.StrTokenizer strTokenizer83 = org.apache.commons.lang3.text.StrTokenizer.getTSVInstance(charArray65);
        org.apache.commons.lang3.text.StrMatcher strMatcher84 = strTokenizer83.getIgnoredMatcher();
        org.apache.commons.lang3.text.StrTokenizer strTokenizer85 = new org.apache.commons.lang3.text.StrTokenizer("StrTokenizer[a#]", strMatcher84);
        org.apache.commons.lang3.text.StrTokenizer strTokenizer86 = new org.apache.commons.lang3.text.StrTokenizer(charArray2, strMatcher52, strMatcher84);
        org.apache.commons.lang3.text.StrTokenizer strTokenizer88 = new org.apache.commons.lang3.text.StrTokenizer(charArray2, "4 ");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str89 = strTokenizer88.next();
            org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException; message: null");
        } catch (java.util.NoSuchElementException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray2);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray2), "4 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray2), "4 ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray2), "[4,  ]");
        org.junit.Assert.assertNotNull(strTokenizer6);
        org.junit.Assert.assertNotNull(charArray15);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray15), "4 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray15), "4 ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray15), "[4,  ]");
        org.junit.Assert.assertNotNull(strMatcher19);
        org.junit.Assert.assertNotNull(strTokenizer21);
        org.junit.Assert.assertNotNull(strMatcher22);
        org.junit.Assert.assertNotNull(charArray26);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray26), "4 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray26), "4 ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray26), "[4,  ]");
        org.junit.Assert.assertNotNull(strMatcher30);
        org.junit.Assert.assertNotNull(strTokenizer32);
        org.junit.Assert.assertNotNull(strMatcher33);
        org.junit.Assert.assertNotNull(strTokenizer34);
        org.junit.Assert.assertNotNull(strTokenizer36);
        org.junit.Assert.assertNotNull(strTokenizer42);
        org.junit.Assert.assertNotNull(charArray47);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray47), "4 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray47), "4 ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray47), "[4,  ]");
        org.junit.Assert.assertNotNull(strMatcher51);
        org.junit.Assert.assertNotNull(strMatcher52);
        org.junit.Assert.assertNotNull(charArray55);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray55), "4 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray55), "4 ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray55), "[4,  ]");
        org.junit.Assert.assertNotNull(strMatcher59);
        org.junit.Assert.assertNotNull(charArray65);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray65), "4 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray65), "4 ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray65), "[4,  ]");
        org.junit.Assert.assertNotNull(strTokenizer69);
        org.junit.Assert.assertNotNull(charArray74);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray74), "4 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray74), "4 ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray74), "[4,  ]");
        org.junit.Assert.assertNotNull(strMatcher78);
        org.junit.Assert.assertNotNull(strTokenizer80);
        org.junit.Assert.assertNotNull(strMatcher81);
        org.junit.Assert.assertNotNull(strTokenizer83);
        org.junit.Assert.assertNotNull(strMatcher84);
    }

    @Test
    public void test1642() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1642");
        char[] charArray2 = new char[] { '4', ' ' };
        org.apache.commons.lang3.text.StrTokenizer strTokenizer5 = new org.apache.commons.lang3.text.StrTokenizer(charArray2, 'a', ' ');
        org.apache.commons.lang3.text.StrTokenizer strTokenizer6 = org.apache.commons.lang3.text.StrTokenizer.getCSVInstance(charArray2);
        org.apache.commons.lang3.text.StrMatcher strMatcher7 = null;
        org.apache.commons.lang3.text.StrTokenizer strTokenizer8 = new org.apache.commons.lang3.text.StrTokenizer(charArray2, strMatcher7);
        char[] charArray11 = new char[] { '4', ' ' };
        org.apache.commons.lang3.text.StrTokenizer strTokenizer14 = new org.apache.commons.lang3.text.StrTokenizer(charArray11, 'a', ' ');
        org.apache.commons.lang3.text.StrMatcher strMatcher15 = strTokenizer14.getTrimmerMatcher();
        org.apache.commons.lang3.text.StrTokenizer strTokenizer17 = strTokenizer14.setDelimiterString("");
        org.apache.commons.lang3.text.StrMatcher strMatcher18 = strTokenizer17.getTrimmerMatcher();
        org.apache.commons.lang3.text.StrTokenizer strTokenizer19 = new org.apache.commons.lang3.text.StrTokenizer(charArray2, strMatcher18);
        org.apache.commons.lang3.text.StrTokenizer strTokenizer20 = org.apache.commons.lang3.text.StrTokenizer.getTSVInstance(charArray2);
        boolean boolean21 = strTokenizer20.isIgnoreEmptyTokens();
        org.junit.Assert.assertNotNull(charArray2);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray2), "4 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray2), "4 ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray2), "[4,  ]");
        org.junit.Assert.assertNotNull(strTokenizer6);
        org.junit.Assert.assertNotNull(charArray11);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray11), "4 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray11), "4 ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray11), "[4,  ]");
        org.junit.Assert.assertNotNull(strMatcher15);
        org.junit.Assert.assertNotNull(strTokenizer17);
        org.junit.Assert.assertNotNull(strMatcher18);
        org.junit.Assert.assertNotNull(strTokenizer20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
    }

    @Test
    public void test1643() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1643");
        char[] charArray2 = new char[] { '4', ' ' };
        org.apache.commons.lang3.text.StrTokenizer strTokenizer5 = new org.apache.commons.lang3.text.StrTokenizer(charArray2, 'a', ' ');
        boolean boolean6 = strTokenizer5.hasPrevious();
        char[] charArray9 = new char[] { '4', ' ' };
        org.apache.commons.lang3.text.StrTokenizer strTokenizer12 = new org.apache.commons.lang3.text.StrTokenizer(charArray9, 'a', ' ');
        org.apache.commons.lang3.text.StrMatcher strMatcher13 = strTokenizer12.getTrimmerMatcher();
        org.apache.commons.lang3.text.StrMatcher strMatcher14 = strTokenizer12.getQuoteMatcher();
        org.apache.commons.lang3.text.StrTokenizer strTokenizer15 = strTokenizer5.setIgnoredMatcher(strMatcher14);
        java.lang.String str16 = strTokenizer5.toString();
        org.apache.commons.lang3.text.StrTokenizer strTokenizer18 = strTokenizer5.setDelimiterChar('#');
        org.apache.commons.lang3.text.StrMatcher strMatcher19 = strTokenizer18.getDelimiterMatcher();
        org.junit.Assert.assertNotNull(charArray2);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray2), "4 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray2), "4 ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray2), "[4,  ]");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(charArray9);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray9), "4 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray9), "4 ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray9), "[4,  ]");
        org.junit.Assert.assertNotNull(strMatcher13);
        org.junit.Assert.assertNotNull(strMatcher14);
        org.junit.Assert.assertNotNull(strTokenizer15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "StrTokenizer[4 ]" + "'", str16, "StrTokenizer[4 ]");
        org.junit.Assert.assertNotNull(strTokenizer18);
        org.junit.Assert.assertNotNull(strMatcher19);
    }

    @Test
    public void test1644() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1644");
        org.apache.commons.lang3.text.StrTokenizer strTokenizer2 = new org.apache.commons.lang3.text.StrTokenizer("StrTokenizer[4 ]", '4');
        org.apache.commons.lang3.text.StrTokenizer strTokenizer4 = strTokenizer2.setIgnoreEmptyTokens(false);
        org.apache.commons.lang3.text.StrTokenizer strTokenizer6 = strTokenizer2.setIgnoredChar('4');
        org.junit.Assert.assertNotNull(strTokenizer4);
        org.junit.Assert.assertNotNull(strTokenizer6);
    }

    @Test
    public void test1645() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1645");
        char[] charArray2 = new char[] { '4', ' ' };
        org.apache.commons.lang3.text.StrTokenizer strTokenizer5 = new org.apache.commons.lang3.text.StrTokenizer(charArray2, 'a', ' ');
        org.apache.commons.lang3.text.StrMatcher strMatcher6 = strTokenizer5.getTrimmerMatcher();
        java.lang.String str7 = strTokenizer5.nextToken();
        char[] charArray10 = new char[] { '4', ' ' };
        org.apache.commons.lang3.text.StrTokenizer strTokenizer13 = new org.apache.commons.lang3.text.StrTokenizer(charArray10, 'a', ' ');
        org.apache.commons.lang3.text.StrMatcher strMatcher14 = strTokenizer13.getTrimmerMatcher();
        org.apache.commons.lang3.text.StrTokenizer strTokenizer16 = strTokenizer13.setDelimiterString("");
        org.apache.commons.lang3.text.StrMatcher strMatcher17 = strTokenizer16.getTrimmerMatcher();
        org.apache.commons.lang3.text.StrMatcher strMatcher18 = strTokenizer16.getTrimmerMatcher();
        char[] charArray21 = new char[] { '4', ' ' };
        org.apache.commons.lang3.text.StrTokenizer strTokenizer24 = new org.apache.commons.lang3.text.StrTokenizer(charArray21, 'a', ' ');
        org.apache.commons.lang3.text.StrTokenizer strTokenizer25 = strTokenizer16.reset(charArray21);
        org.apache.commons.lang3.text.StrTokenizer strTokenizer27 = new org.apache.commons.lang3.text.StrTokenizer(charArray21, "");
        org.apache.commons.lang3.text.StrTokenizer strTokenizer28 = strTokenizer5.reset(charArray21);
        org.apache.commons.lang3.text.StrTokenizer strTokenizer30 = new org.apache.commons.lang3.text.StrTokenizer(charArray21, "StrTokenizer[4 ]");
        org.apache.commons.lang3.text.StrMatcher strMatcher31 = strTokenizer30.getIgnoredMatcher();
        org.apache.commons.lang3.text.StrTokenizer strTokenizer33 = strTokenizer30.setDelimiterString("4");
        org.apache.commons.lang3.text.StrTokenizer strTokenizer35 = strTokenizer33.setDelimiterChar('4');
        char[] charArray36 = null;
        org.apache.commons.lang3.text.StrTokenizer strTokenizer37 = strTokenizer35.reset(charArray36);
        org.apache.commons.lang3.text.StrMatcher strMatcher38 = null;
        org.apache.commons.lang3.text.StrTokenizer strTokenizer39 = strTokenizer35.setQuoteMatcher(strMatcher38);
        org.junit.Assert.assertNotNull(charArray2);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray2), "4 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray2), "4 ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray2), "[4,  ]");
        org.junit.Assert.assertNotNull(strMatcher6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "4 " + "'", str7, "4 ");
        org.junit.Assert.assertNotNull(charArray10);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray10), "4 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray10), "4 ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray10), "[4,  ]");
        org.junit.Assert.assertNotNull(strMatcher14);
        org.junit.Assert.assertNotNull(strTokenizer16);
        org.junit.Assert.assertNotNull(strMatcher17);
        org.junit.Assert.assertNotNull(strMatcher18);
        org.junit.Assert.assertNotNull(charArray21);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray21), "4 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray21), "4 ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray21), "[4,  ]");
        org.junit.Assert.assertNotNull(strTokenizer25);
        org.junit.Assert.assertNotNull(strTokenizer28);
        org.junit.Assert.assertNotNull(strMatcher31);
        org.junit.Assert.assertNotNull(strTokenizer33);
        org.junit.Assert.assertNotNull(strTokenizer35);
        org.junit.Assert.assertNotNull(strTokenizer37);
        org.junit.Assert.assertNotNull(strTokenizer39);
    }

    @Test
    public void test1646() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1646");
        char[] charArray3 = new char[] { '4', ' ' };
        org.apache.commons.lang3.text.StrTokenizer strTokenizer6 = new org.apache.commons.lang3.text.StrTokenizer(charArray3, 'a', ' ');
        org.apache.commons.lang3.text.StrMatcher strMatcher7 = strTokenizer6.getTrimmerMatcher();
        char[] charArray10 = new char[] { '4', ' ' };
        org.apache.commons.lang3.text.StrTokenizer strTokenizer13 = new org.apache.commons.lang3.text.StrTokenizer(charArray10, 'a', ' ');
        org.apache.commons.lang3.text.StrTokenizer strTokenizer14 = org.apache.commons.lang3.text.StrTokenizer.getCSVInstance(charArray10);
        org.apache.commons.lang3.text.StrMatcher strMatcher15 = null;
        org.apache.commons.lang3.text.StrTokenizer strTokenizer16 = new org.apache.commons.lang3.text.StrTokenizer(charArray10, strMatcher15);
        org.apache.commons.lang3.text.StrTokenizer strTokenizer17 = strTokenizer6.reset(charArray10);
        org.apache.commons.lang3.text.StrMatcher strMatcher18 = strTokenizer17.getIgnoredMatcher();
        org.apache.commons.lang3.text.StrTokenizer strTokenizer19 = new org.apache.commons.lang3.text.StrTokenizer("", strMatcher18);
        boolean boolean20 = strTokenizer19.hasPrevious();
        org.apache.commons.lang3.text.StrMatcher strMatcher21 = strTokenizer19.getQuoteMatcher();
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray3), "4 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray3), "4 ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray3), "[4,  ]");
        org.junit.Assert.assertNotNull(strMatcher7);
        org.junit.Assert.assertNotNull(charArray10);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray10), "4 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray10), "4 ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray10), "[4,  ]");
        org.junit.Assert.assertNotNull(strTokenizer14);
        org.junit.Assert.assertNotNull(strTokenizer17);
        org.junit.Assert.assertNotNull(strMatcher18);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(strMatcher21);
    }

    @Test
    public void test1647() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1647");
        char[] charArray4 = new char[] { '4', ' ' };
        org.apache.commons.lang3.text.StrTokenizer strTokenizer7 = new org.apache.commons.lang3.text.StrTokenizer(charArray4, 'a', ' ');
        org.apache.commons.lang3.text.StrMatcher strMatcher8 = strTokenizer7.getTrimmerMatcher();
        org.apache.commons.lang3.text.StrTokenizer strTokenizer10 = strTokenizer7.setDelimiterString("");
        char[] charArray14 = new char[] { '4', ' ' };
        org.apache.commons.lang3.text.StrTokenizer strTokenizer17 = new org.apache.commons.lang3.text.StrTokenizer(charArray14, 'a', ' ');
        org.apache.commons.lang3.text.StrMatcher strMatcher18 = strTokenizer17.getTrimmerMatcher();
        org.apache.commons.lang3.text.StrTokenizer strTokenizer20 = strTokenizer17.setDelimiterString("");
        org.apache.commons.lang3.text.StrMatcher strMatcher21 = strTokenizer20.getTrimmerMatcher();
        org.apache.commons.lang3.text.StrTokenizer strTokenizer22 = new org.apache.commons.lang3.text.StrTokenizer("", strMatcher21);
        char[] charArray25 = new char[] { '4', ' ' };
        org.apache.commons.lang3.text.StrTokenizer strTokenizer28 = new org.apache.commons.lang3.text.StrTokenizer(charArray25, 'a', ' ');
        org.apache.commons.lang3.text.StrMatcher strMatcher29 = strTokenizer28.getTrimmerMatcher();
        org.apache.commons.lang3.text.StrTokenizer strTokenizer31 = strTokenizer28.setDelimiterString("");
        org.apache.commons.lang3.text.StrMatcher strMatcher32 = strTokenizer31.getTrimmerMatcher();
        org.apache.commons.lang3.text.StrTokenizer strTokenizer33 = strTokenizer22.setTrimmerMatcher(strMatcher32);
        org.apache.commons.lang3.text.StrTokenizer strTokenizer34 = strTokenizer10.setTrimmerMatcher(strMatcher32);
        org.apache.commons.lang3.text.StrMatcher strMatcher35 = strTokenizer10.getDelimiterMatcher();
        boolean boolean36 = strTokenizer10.isIgnoreEmptyTokens();
        org.apache.commons.lang3.text.StrMatcher strMatcher37 = strTokenizer10.getQuoteMatcher();
        char[] charArray38 = null;
        org.apache.commons.lang3.text.StrTokenizer strTokenizer40 = new org.apache.commons.lang3.text.StrTokenizer(charArray38, "");
        java.lang.String str41 = strTokenizer40.getContent();
        org.apache.commons.lang3.text.StrMatcher strMatcher42 = strTokenizer40.getTrimmerMatcher();
        org.apache.commons.lang3.text.StrTokenizer strTokenizer43 = new org.apache.commons.lang3.text.StrTokenizer("4 ", strMatcher37, strMatcher42);
        org.apache.commons.lang3.text.StrTokenizer strTokenizer44 = new org.apache.commons.lang3.text.StrTokenizer("hi!", strMatcher42);
        char[] charArray47 = new char[] { '4', ' ' };
        org.apache.commons.lang3.text.StrTokenizer strTokenizer50 = new org.apache.commons.lang3.text.StrTokenizer(charArray47, 'a', ' ');
        org.apache.commons.lang3.text.StrTokenizer strTokenizer51 = org.apache.commons.lang3.text.StrTokenizer.getCSVInstance(charArray47);
        org.apache.commons.lang3.text.StrMatcher strMatcher52 = null;
        org.apache.commons.lang3.text.StrTokenizer strTokenizer53 = new org.apache.commons.lang3.text.StrTokenizer(charArray47, strMatcher52);
        char[] charArray56 = new char[] { '4', ' ' };
        org.apache.commons.lang3.text.StrTokenizer strTokenizer59 = new org.apache.commons.lang3.text.StrTokenizer(charArray56, 'a', ' ');
        org.apache.commons.lang3.text.StrMatcher strMatcher60 = strTokenizer59.getTrimmerMatcher();
        org.apache.commons.lang3.text.StrTokenizer strTokenizer62 = strTokenizer59.setDelimiterString("");
        org.apache.commons.lang3.text.StrMatcher strMatcher63 = strTokenizer62.getTrimmerMatcher();
        org.apache.commons.lang3.text.StrTokenizer strTokenizer64 = new org.apache.commons.lang3.text.StrTokenizer(charArray47, strMatcher63);
        org.apache.commons.lang3.text.StrTokenizer strTokenizer66 = new org.apache.commons.lang3.text.StrTokenizer(charArray47, "StrTokenizer[4 ]");
        org.apache.commons.lang3.text.StrTokenizer strTokenizer67 = strTokenizer44.reset(charArray47);
        int int68 = strTokenizer67.size();
        int int69 = strTokenizer67.previousIndex();
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray4), "4 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray4), "4 ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray4), "[4,  ]");
        org.junit.Assert.assertNotNull(strMatcher8);
        org.junit.Assert.assertNotNull(strTokenizer10);
        org.junit.Assert.assertNotNull(charArray14);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray14), "4 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray14), "4 ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray14), "[4,  ]");
        org.junit.Assert.assertNotNull(strMatcher18);
        org.junit.Assert.assertNotNull(strTokenizer20);
        org.junit.Assert.assertNotNull(strMatcher21);
        org.junit.Assert.assertNotNull(charArray25);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray25), "4 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray25), "4 ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray25), "[4,  ]");
        org.junit.Assert.assertNotNull(strMatcher29);
        org.junit.Assert.assertNotNull(strTokenizer31);
        org.junit.Assert.assertNotNull(strMatcher32);
        org.junit.Assert.assertNotNull(strTokenizer33);
        org.junit.Assert.assertNotNull(strTokenizer34);
        org.junit.Assert.assertNotNull(strMatcher35);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
        org.junit.Assert.assertNotNull(strMatcher37);
        org.junit.Assert.assertNull(str41);
        org.junit.Assert.assertNotNull(strMatcher42);
        org.junit.Assert.assertNotNull(charArray47);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray47), "4 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray47), "4 ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray47), "[4,  ]");
        org.junit.Assert.assertNotNull(strTokenizer51);
        org.junit.Assert.assertNotNull(charArray56);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray56), "4 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray56), "4 ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray56), "[4,  ]");
        org.junit.Assert.assertNotNull(strMatcher60);
        org.junit.Assert.assertNotNull(strTokenizer62);
        org.junit.Assert.assertNotNull(strMatcher63);
        org.junit.Assert.assertNotNull(strTokenizer67);
        org.junit.Assert.assertTrue("'" + int68 + "' != '" + 1 + "'", int68 == 1);
        org.junit.Assert.assertTrue("'" + int69 + "' != '" + (-1) + "'", int69 == (-1));
    }

    @Test
    public void test1648() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1648");
        char[] charArray0 = null;
        org.apache.commons.lang3.text.StrTokenizer strTokenizer2 = new org.apache.commons.lang3.text.StrTokenizer(charArray0, "StrTokenizer[4 ]");
        org.apache.commons.lang3.text.StrTokenizer strTokenizer4 = strTokenizer2.setDelimiterChar('4');
        int int5 = strTokenizer2.size();
        org.apache.commons.lang3.text.StrTokenizer strTokenizer8 = new org.apache.commons.lang3.text.StrTokenizer("StrTokenizer[StrTokenizer[4 ]]", "");
        char[] charArray12 = new char[] { '4', ' ' };
        org.apache.commons.lang3.text.StrTokenizer strTokenizer15 = new org.apache.commons.lang3.text.StrTokenizer(charArray12, 'a', ' ');
        char[] charArray18 = new char[] { '4', ' ' };
        org.apache.commons.lang3.text.StrTokenizer strTokenizer21 = new org.apache.commons.lang3.text.StrTokenizer(charArray18, 'a', ' ');
        org.apache.commons.lang3.text.StrMatcher strMatcher22 = strTokenizer21.getTrimmerMatcher();
        org.apache.commons.lang3.text.StrTokenizer strTokenizer24 = strTokenizer21.setDelimiterString("");
        org.apache.commons.lang3.text.StrMatcher strMatcher25 = strTokenizer24.getTrimmerMatcher();
        org.apache.commons.lang3.text.StrMatcher strMatcher26 = strTokenizer24.getTrimmerMatcher();
        char[] charArray28 = null;
        org.apache.commons.lang3.text.StrTokenizer strTokenizer30 = new org.apache.commons.lang3.text.StrTokenizer(charArray28, "");
        java.lang.String str31 = strTokenizer30.getContent();
        org.apache.commons.lang3.text.StrMatcher strMatcher32 = strTokenizer30.getDelimiterMatcher();
        org.apache.commons.lang3.text.StrTokenizer strTokenizer33 = new org.apache.commons.lang3.text.StrTokenizer("hi!", strMatcher32);
        org.apache.commons.lang3.text.StrTokenizer strTokenizer34 = new org.apache.commons.lang3.text.StrTokenizer(charArray12, strMatcher26, strMatcher32);
        char[] charArray36 = null;
        org.apache.commons.lang3.text.StrTokenizer strTokenizer38 = new org.apache.commons.lang3.text.StrTokenizer(charArray36, "");
        java.lang.String str39 = strTokenizer38.getContent();
        org.apache.commons.lang3.text.StrMatcher strMatcher40 = strTokenizer38.getDelimiterMatcher();
        org.apache.commons.lang3.text.StrTokenizer strTokenizer42 = org.apache.commons.lang3.text.StrTokenizer.getCSVInstance("");
        java.util.List<java.lang.String> strList43 = strTokenizer42.getTokenList();
        boolean boolean44 = strTokenizer42.hasPrevious();
        java.lang.String[] strArray45 = strTokenizer42.getTokenArray();
        char[] charArray48 = new char[] { '4', ' ' };
        org.apache.commons.lang3.text.StrTokenizer strTokenizer51 = new org.apache.commons.lang3.text.StrTokenizer(charArray48, 'a', ' ');
        org.apache.commons.lang3.text.StrTokenizer strTokenizer52 = org.apache.commons.lang3.text.StrTokenizer.getCSVInstance(charArray48);
        org.apache.commons.lang3.text.StrMatcher strMatcher53 = null;
        org.apache.commons.lang3.text.StrTokenizer strTokenizer54 = new org.apache.commons.lang3.text.StrTokenizer(charArray48, strMatcher53);
        char[] charArray57 = new char[] { '4', ' ' };
        org.apache.commons.lang3.text.StrTokenizer strTokenizer60 = new org.apache.commons.lang3.text.StrTokenizer(charArray57, 'a', ' ');
        org.apache.commons.lang3.text.StrMatcher strMatcher61 = strTokenizer60.getTrimmerMatcher();
        org.apache.commons.lang3.text.StrTokenizer strTokenizer63 = strTokenizer60.setDelimiterString("");
        org.apache.commons.lang3.text.StrMatcher strMatcher64 = strTokenizer63.getTrimmerMatcher();
        org.apache.commons.lang3.text.StrTokenizer strTokenizer65 = new org.apache.commons.lang3.text.StrTokenizer(charArray48, strMatcher64);
        org.apache.commons.lang3.text.StrTokenizer strTokenizer66 = strTokenizer42.setTrimmerMatcher(strMatcher64);
        org.apache.commons.lang3.text.StrTokenizer strTokenizer67 = new org.apache.commons.lang3.text.StrTokenizer("StrTokenizer[]", strMatcher40, strMatcher64);
        org.apache.commons.lang3.text.StrTokenizer strTokenizer68 = new org.apache.commons.lang3.text.StrTokenizer("StrTokenizer[4 ]", strMatcher32, strMatcher64);
        org.apache.commons.lang3.text.StrTokenizer strTokenizer69 = strTokenizer8.setDelimiterMatcher(strMatcher64);
        org.apache.commons.lang3.text.StrTokenizer strTokenizer70 = strTokenizer2.setTrimmerMatcher(strMatcher64);
        org.apache.commons.lang3.text.StrMatcher strMatcher71 = strTokenizer2.getTrimmerMatcher();
        // The following exception was thrown during execution in test generation
        try {
            strTokenizer2.add("StrTokenizer[4]");
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: add() is unsupported");
        } catch (java.lang.UnsupportedOperationException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strTokenizer4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(charArray12);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray12), "4 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray12), "4 ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray12), "[4,  ]");
        org.junit.Assert.assertNotNull(charArray18);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray18), "4 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray18), "4 ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray18), "[4,  ]");
        org.junit.Assert.assertNotNull(strMatcher22);
        org.junit.Assert.assertNotNull(strTokenizer24);
        org.junit.Assert.assertNotNull(strMatcher25);
        org.junit.Assert.assertNotNull(strMatcher26);
        org.junit.Assert.assertNull(str31);
        org.junit.Assert.assertNotNull(strMatcher32);
        org.junit.Assert.assertNull(str39);
        org.junit.Assert.assertNotNull(strMatcher40);
        org.junit.Assert.assertNotNull(strTokenizer42);
        org.junit.Assert.assertNotNull(strList43);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertNotNull(strArray45);
        org.junit.Assert.assertNotNull(charArray48);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray48), "4 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray48), "4 ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray48), "[4,  ]");
        org.junit.Assert.assertNotNull(strTokenizer52);
        org.junit.Assert.assertNotNull(charArray57);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray57), "4 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray57), "4 ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray57), "[4,  ]");
        org.junit.Assert.assertNotNull(strMatcher61);
        org.junit.Assert.assertNotNull(strTokenizer63);
        org.junit.Assert.assertNotNull(strMatcher64);
        org.junit.Assert.assertNotNull(strTokenizer66);
        org.junit.Assert.assertNotNull(strTokenizer69);
        org.junit.Assert.assertNotNull(strTokenizer70);
        org.junit.Assert.assertNotNull(strMatcher71);
    }

    @Test
    public void test1649() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1649");
        char[] charArray2 = new char[] { '4', ' ' };
        org.apache.commons.lang3.text.StrTokenizer strTokenizer5 = new org.apache.commons.lang3.text.StrTokenizer(charArray2, 'a', ' ');
        org.apache.commons.lang3.text.StrMatcher strMatcher6 = strTokenizer5.getTrimmerMatcher();
        org.apache.commons.lang3.text.StrTokenizer strTokenizer8 = strTokenizer5.setDelimiterString("");
        org.apache.commons.lang3.text.StrMatcher strMatcher9 = strTokenizer8.getTrimmerMatcher();
        boolean boolean10 = strTokenizer8.hasNext();
        org.apache.commons.lang3.text.StrTokenizer strTokenizer11 = strTokenizer8.reset();
        org.apache.commons.lang3.text.StrTokenizer strTokenizer15 = new org.apache.commons.lang3.text.StrTokenizer("4 ", 'a');
        org.apache.commons.lang3.text.StrMatcher strMatcher16 = strTokenizer15.getDelimiterMatcher();
        org.apache.commons.lang3.text.StrTokenizer strTokenizer17 = new org.apache.commons.lang3.text.StrTokenizer("", strMatcher16);
        org.apache.commons.lang3.text.StrTokenizer strTokenizer18 = strTokenizer8.setTrimmerMatcher(strMatcher16);
        int int19 = strTokenizer18.size();
        java.lang.String str20 = strTokenizer18.getContent();
        org.junit.Assert.assertNotNull(charArray2);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray2), "4 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray2), "4 ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray2), "[4,  ]");
        org.junit.Assert.assertNotNull(strMatcher6);
        org.junit.Assert.assertNotNull(strTokenizer8);
        org.junit.Assert.assertNotNull(strMatcher9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(strTokenizer11);
        org.junit.Assert.assertNotNull(strMatcher16);
        org.junit.Assert.assertNotNull(strTokenizer18);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 1 + "'", int19 == 1);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "4 " + "'", str20, "4 ");
    }

    @Test
    public void test1650() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1650");
        char[] charArray2 = new char[] { '4', ' ' };
        org.apache.commons.lang3.text.StrTokenizer strTokenizer5 = new org.apache.commons.lang3.text.StrTokenizer(charArray2, 'a', ' ');
        org.apache.commons.lang3.text.StrMatcher strMatcher6 = strTokenizer5.getTrimmerMatcher();
        org.apache.commons.lang3.text.StrTokenizer strTokenizer8 = strTokenizer5.setDelimiterString("");
        char[] charArray12 = new char[] { '4', ' ' };
        org.apache.commons.lang3.text.StrTokenizer strTokenizer15 = new org.apache.commons.lang3.text.StrTokenizer(charArray12, 'a', ' ');
        org.apache.commons.lang3.text.StrMatcher strMatcher16 = strTokenizer15.getTrimmerMatcher();
        org.apache.commons.lang3.text.StrTokenizer strTokenizer18 = strTokenizer15.setDelimiterString("");
        org.apache.commons.lang3.text.StrMatcher strMatcher19 = strTokenizer18.getTrimmerMatcher();
        org.apache.commons.lang3.text.StrTokenizer strTokenizer20 = new org.apache.commons.lang3.text.StrTokenizer("", strMatcher19);
        char[] charArray23 = new char[] { '4', ' ' };
        org.apache.commons.lang3.text.StrTokenizer strTokenizer26 = new org.apache.commons.lang3.text.StrTokenizer(charArray23, 'a', ' ');
        org.apache.commons.lang3.text.StrMatcher strMatcher27 = strTokenizer26.getTrimmerMatcher();
        org.apache.commons.lang3.text.StrTokenizer strTokenizer29 = strTokenizer26.setDelimiterString("");
        org.apache.commons.lang3.text.StrMatcher strMatcher30 = strTokenizer29.getTrimmerMatcher();
        org.apache.commons.lang3.text.StrTokenizer strTokenizer31 = strTokenizer20.setTrimmerMatcher(strMatcher30);
        org.apache.commons.lang3.text.StrTokenizer strTokenizer32 = strTokenizer8.setTrimmerMatcher(strMatcher30);
        java.lang.String str33 = strTokenizer8.getContent();
        char[] charArray36 = new char[] { '4', ' ' };
        org.apache.commons.lang3.text.StrTokenizer strTokenizer39 = new org.apache.commons.lang3.text.StrTokenizer(charArray36, 'a', ' ');
        org.apache.commons.lang3.text.StrTokenizer strTokenizer42 = new org.apache.commons.lang3.text.StrTokenizer(charArray36, '4', 'a');
        char[] charArray45 = new char[] { '4', ' ' };
        org.apache.commons.lang3.text.StrTokenizer strTokenizer48 = new org.apache.commons.lang3.text.StrTokenizer(charArray45, 'a', ' ');
        org.apache.commons.lang3.text.StrMatcher strMatcher49 = strTokenizer48.getTrimmerMatcher();
        org.apache.commons.lang3.text.StrMatcher strMatcher50 = strTokenizer48.getQuoteMatcher();
        org.apache.commons.lang3.text.StrTokenizer strTokenizer51 = new org.apache.commons.lang3.text.StrTokenizer(charArray36, strMatcher50);
        org.apache.commons.lang3.text.StrTokenizer strTokenizer52 = strTokenizer8.reset(charArray36);
        org.apache.commons.lang3.text.StrTokenizer strTokenizer53 = org.apache.commons.lang3.text.StrTokenizer.getTSVInstance(charArray36);
        org.apache.commons.lang3.text.StrTokenizer strTokenizer55 = new org.apache.commons.lang3.text.StrTokenizer(charArray36, ' ');
        org.apache.commons.lang3.text.StrTokenizer strTokenizer58 = new org.apache.commons.lang3.text.StrTokenizer(charArray36, 'a', 'a');
        char[] charArray61 = new char[] { '4', ' ' };
        org.apache.commons.lang3.text.StrTokenizer strTokenizer64 = new org.apache.commons.lang3.text.StrTokenizer(charArray61, 'a', ' ');
        org.apache.commons.lang3.text.StrTokenizer strTokenizer66 = new org.apache.commons.lang3.text.StrTokenizer(charArray61, "hi!");
        org.apache.commons.lang3.text.StrTokenizer strTokenizer68 = new org.apache.commons.lang3.text.StrTokenizer(charArray61, '#');
        org.apache.commons.lang3.text.StrTokenizer strTokenizer69 = org.apache.commons.lang3.text.StrTokenizer.getCSVInstance(charArray61);
        org.apache.commons.lang3.text.StrTokenizer strTokenizer71 = new org.apache.commons.lang3.text.StrTokenizer(charArray61, '4');
        org.apache.commons.lang3.text.StrTokenizer strTokenizer73 = new org.apache.commons.lang3.text.StrTokenizer(charArray61, "");
        org.apache.commons.lang3.text.StrMatcher strMatcher74 = strTokenizer73.getIgnoredMatcher();
        org.apache.commons.lang3.text.StrTokenizer strTokenizer75 = strTokenizer58.setQuoteMatcher(strMatcher74);
        org.junit.Assert.assertNotNull(charArray2);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray2), "4 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray2), "4 ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray2), "[4,  ]");
        org.junit.Assert.assertNotNull(strMatcher6);
        org.junit.Assert.assertNotNull(strTokenizer8);
        org.junit.Assert.assertNotNull(charArray12);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray12), "4 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray12), "4 ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray12), "[4,  ]");
        org.junit.Assert.assertNotNull(strMatcher16);
        org.junit.Assert.assertNotNull(strTokenizer18);
        org.junit.Assert.assertNotNull(strMatcher19);
        org.junit.Assert.assertNotNull(charArray23);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray23), "4 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray23), "4 ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray23), "[4,  ]");
        org.junit.Assert.assertNotNull(strMatcher27);
        org.junit.Assert.assertNotNull(strTokenizer29);
        org.junit.Assert.assertNotNull(strMatcher30);
        org.junit.Assert.assertNotNull(strTokenizer31);
        org.junit.Assert.assertNotNull(strTokenizer32);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "4 " + "'", str33, "4 ");
        org.junit.Assert.assertNotNull(charArray36);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray36), "4 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray36), "4 ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray36), "[4,  ]");
        org.junit.Assert.assertNotNull(charArray45);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray45), "4 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray45), "4 ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray45), "[4,  ]");
        org.junit.Assert.assertNotNull(strMatcher49);
        org.junit.Assert.assertNotNull(strMatcher50);
        org.junit.Assert.assertNotNull(strTokenizer52);
        org.junit.Assert.assertNotNull(strTokenizer53);
        org.junit.Assert.assertNotNull(charArray61);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray61), "4 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray61), "4 ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray61), "[4,  ]");
        org.junit.Assert.assertNotNull(strTokenizer69);
        org.junit.Assert.assertNotNull(strMatcher74);
        org.junit.Assert.assertNotNull(strTokenizer75);
    }

    @Test
    public void test1651() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1651");
        org.apache.commons.lang3.text.StrTokenizer strTokenizer2 = new org.apache.commons.lang3.text.StrTokenizer("StrTokenizer[StrTokenizer[4 ]]", 'a');
        org.apache.commons.lang3.text.StrMatcher strMatcher3 = strTokenizer2.getTrimmerMatcher();
        int int4 = strTokenizer2.nextIndex();
        org.junit.Assert.assertNotNull(strMatcher3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test1652() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1652");
        org.apache.commons.lang3.text.StrTokenizer strTokenizer3 = new org.apache.commons.lang3.text.StrTokenizer("", 'a', 'a');
        org.apache.commons.lang3.text.StrTokenizer strTokenizer5 = strTokenizer3.reset("StrTokenizer[4 ]");
        org.apache.commons.lang3.text.StrTokenizer strTokenizer7 = strTokenizer5.setEmptyTokenAsNull(true);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str8 = strTokenizer5.previous();
            org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException; message: null");
        } catch (java.util.NoSuchElementException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strTokenizer5);
        org.junit.Assert.assertNotNull(strTokenizer7);
    }

    @Test
    public void test1653() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1653");
        char[] charArray3 = new char[] { '4', ' ' };
        org.apache.commons.lang3.text.StrTokenizer strTokenizer6 = new org.apache.commons.lang3.text.StrTokenizer(charArray3, 'a', ' ');
        org.apache.commons.lang3.text.StrMatcher strMatcher7 = strTokenizer6.getTrimmerMatcher();
        org.apache.commons.lang3.text.StrTokenizer strTokenizer9 = strTokenizer6.setDelimiterString("");
        org.apache.commons.lang3.text.StrMatcher strMatcher10 = strTokenizer9.getTrimmerMatcher();
        org.apache.commons.lang3.text.StrTokenizer strTokenizer11 = new org.apache.commons.lang3.text.StrTokenizer("", strMatcher10);
        char[] charArray14 = new char[] { '4', ' ' };
        org.apache.commons.lang3.text.StrTokenizer strTokenizer17 = new org.apache.commons.lang3.text.StrTokenizer(charArray14, 'a', ' ');
        org.apache.commons.lang3.text.StrMatcher strMatcher18 = strTokenizer17.getTrimmerMatcher();
        org.apache.commons.lang3.text.StrMatcher strMatcher19 = strTokenizer17.getQuoteMatcher();
        org.apache.commons.lang3.text.StrTokenizer strTokenizer20 = strTokenizer11.setDelimiterMatcher(strMatcher19);
        boolean boolean21 = strTokenizer20.hasNext();
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray3), "4 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray3), "4 ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray3), "[4,  ]");
        org.junit.Assert.assertNotNull(strMatcher7);
        org.junit.Assert.assertNotNull(strTokenizer9);
        org.junit.Assert.assertNotNull(strMatcher10);
        org.junit.Assert.assertNotNull(charArray14);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray14), "4 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray14), "4 ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray14), "[4,  ]");
        org.junit.Assert.assertNotNull(strMatcher18);
        org.junit.Assert.assertNotNull(strMatcher19);
        org.junit.Assert.assertNotNull(strTokenizer20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
    }

    @Test
    public void test1654() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1654");
        char[] charArray3 = new char[] { '4', ' ' };
        org.apache.commons.lang3.text.StrTokenizer strTokenizer6 = new org.apache.commons.lang3.text.StrTokenizer(charArray3, 'a', ' ');
        org.apache.commons.lang3.text.StrMatcher strMatcher7 = strTokenizer6.getTrimmerMatcher();
        org.apache.commons.lang3.text.StrTokenizer strTokenizer9 = strTokenizer6.setDelimiterString("");
        char[] charArray13 = new char[] { '4', ' ' };
        org.apache.commons.lang3.text.StrTokenizer strTokenizer16 = new org.apache.commons.lang3.text.StrTokenizer(charArray13, 'a', ' ');
        org.apache.commons.lang3.text.StrMatcher strMatcher17 = strTokenizer16.getTrimmerMatcher();
        org.apache.commons.lang3.text.StrTokenizer strTokenizer19 = strTokenizer16.setDelimiterString("");
        org.apache.commons.lang3.text.StrMatcher strMatcher20 = strTokenizer19.getTrimmerMatcher();
        org.apache.commons.lang3.text.StrTokenizer strTokenizer21 = new org.apache.commons.lang3.text.StrTokenizer("", strMatcher20);
        char[] charArray24 = new char[] { '4', ' ' };
        org.apache.commons.lang3.text.StrTokenizer strTokenizer27 = new org.apache.commons.lang3.text.StrTokenizer(charArray24, 'a', ' ');
        org.apache.commons.lang3.text.StrMatcher strMatcher28 = strTokenizer27.getTrimmerMatcher();
        org.apache.commons.lang3.text.StrTokenizer strTokenizer30 = strTokenizer27.setDelimiterString("");
        org.apache.commons.lang3.text.StrMatcher strMatcher31 = strTokenizer30.getTrimmerMatcher();
        org.apache.commons.lang3.text.StrTokenizer strTokenizer32 = strTokenizer21.setTrimmerMatcher(strMatcher31);
        org.apache.commons.lang3.text.StrTokenizer strTokenizer33 = strTokenizer9.setTrimmerMatcher(strMatcher31);
        org.apache.commons.lang3.text.StrMatcher strMatcher34 = strTokenizer9.getDelimiterMatcher();
        boolean boolean35 = strTokenizer9.isIgnoreEmptyTokens();
        org.apache.commons.lang3.text.StrMatcher strMatcher36 = strTokenizer9.getQuoteMatcher();
        org.apache.commons.lang3.text.StrTokenizer strTokenizer38 = strTokenizer9.setDelimiterChar(' ');
        org.apache.commons.lang3.text.StrMatcher strMatcher39 = strTokenizer38.getQuoteMatcher();
        org.apache.commons.lang3.text.StrTokenizer strTokenizer42 = new org.apache.commons.lang3.text.StrTokenizer("4 ", 'a');
        char[] charArray46 = new char[] { '4', ' ' };
        org.apache.commons.lang3.text.StrTokenizer strTokenizer49 = new org.apache.commons.lang3.text.StrTokenizer(charArray46, 'a', ' ');
        org.apache.commons.lang3.text.StrMatcher strMatcher50 = strTokenizer49.getTrimmerMatcher();
        org.apache.commons.lang3.text.StrTokenizer strTokenizer52 = strTokenizer49.setDelimiterString("");
        char[] charArray56 = new char[] { '4', ' ' };
        org.apache.commons.lang3.text.StrTokenizer strTokenizer59 = new org.apache.commons.lang3.text.StrTokenizer(charArray56, 'a', ' ');
        org.apache.commons.lang3.text.StrMatcher strMatcher60 = strTokenizer59.getTrimmerMatcher();
        org.apache.commons.lang3.text.StrTokenizer strTokenizer62 = strTokenizer59.setDelimiterString("");
        org.apache.commons.lang3.text.StrMatcher strMatcher63 = strTokenizer62.getTrimmerMatcher();
        org.apache.commons.lang3.text.StrTokenizer strTokenizer64 = new org.apache.commons.lang3.text.StrTokenizer("", strMatcher63);
        char[] charArray67 = new char[] { '4', ' ' };
        org.apache.commons.lang3.text.StrTokenizer strTokenizer70 = new org.apache.commons.lang3.text.StrTokenizer(charArray67, 'a', ' ');
        org.apache.commons.lang3.text.StrMatcher strMatcher71 = strTokenizer70.getTrimmerMatcher();
        org.apache.commons.lang3.text.StrTokenizer strTokenizer73 = strTokenizer70.setDelimiterString("");
        org.apache.commons.lang3.text.StrMatcher strMatcher74 = strTokenizer73.getTrimmerMatcher();
        org.apache.commons.lang3.text.StrTokenizer strTokenizer75 = strTokenizer64.setTrimmerMatcher(strMatcher74);
        org.apache.commons.lang3.text.StrTokenizer strTokenizer76 = strTokenizer52.setTrimmerMatcher(strMatcher74);
        org.apache.commons.lang3.text.StrMatcher strMatcher77 = strTokenizer52.getDelimiterMatcher();
        boolean boolean78 = strTokenizer52.isIgnoreEmptyTokens();
        org.apache.commons.lang3.text.StrMatcher strMatcher79 = strTokenizer52.getQuoteMatcher();
        char[] charArray80 = null;
        org.apache.commons.lang3.text.StrTokenizer strTokenizer82 = new org.apache.commons.lang3.text.StrTokenizer(charArray80, "");
        java.lang.String str83 = strTokenizer82.getContent();
        org.apache.commons.lang3.text.StrMatcher strMatcher84 = strTokenizer82.getTrimmerMatcher();
        org.apache.commons.lang3.text.StrTokenizer strTokenizer85 = new org.apache.commons.lang3.text.StrTokenizer("4 ", strMatcher79, strMatcher84);
        org.apache.commons.lang3.text.StrTokenizer strTokenizer86 = strTokenizer42.setDelimiterMatcher(strMatcher79);
        org.apache.commons.lang3.text.StrMatcher strMatcher87 = strTokenizer42.getQuoteMatcher();
        org.apache.commons.lang3.text.StrTokenizer strTokenizer88 = new org.apache.commons.lang3.text.StrTokenizer("4", strMatcher39, strMatcher87);
        org.apache.commons.lang3.text.StrTokenizer strTokenizer90 = strTokenizer88.setIgnoredChar('#');
        boolean boolean91 = strTokenizer90.isIgnoreEmptyTokens();
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray3), "4 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray3), "4 ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray3), "[4,  ]");
        org.junit.Assert.assertNotNull(strMatcher7);
        org.junit.Assert.assertNotNull(strTokenizer9);
        org.junit.Assert.assertNotNull(charArray13);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray13), "4 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray13), "4 ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray13), "[4,  ]");
        org.junit.Assert.assertNotNull(strMatcher17);
        org.junit.Assert.assertNotNull(strTokenizer19);
        org.junit.Assert.assertNotNull(strMatcher20);
        org.junit.Assert.assertNotNull(charArray24);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray24), "4 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray24), "4 ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray24), "[4,  ]");
        org.junit.Assert.assertNotNull(strMatcher28);
        org.junit.Assert.assertNotNull(strTokenizer30);
        org.junit.Assert.assertNotNull(strMatcher31);
        org.junit.Assert.assertNotNull(strTokenizer32);
        org.junit.Assert.assertNotNull(strTokenizer33);
        org.junit.Assert.assertNotNull(strMatcher34);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
        org.junit.Assert.assertNotNull(strMatcher36);
        org.junit.Assert.assertNotNull(strTokenizer38);
        org.junit.Assert.assertNotNull(strMatcher39);
        org.junit.Assert.assertNotNull(charArray46);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray46), "4 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray46), "4 ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray46), "[4,  ]");
        org.junit.Assert.assertNotNull(strMatcher50);
        org.junit.Assert.assertNotNull(strTokenizer52);
        org.junit.Assert.assertNotNull(charArray56);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray56), "4 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray56), "4 ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray56), "[4,  ]");
        org.junit.Assert.assertNotNull(strMatcher60);
        org.junit.Assert.assertNotNull(strTokenizer62);
        org.junit.Assert.assertNotNull(strMatcher63);
        org.junit.Assert.assertNotNull(charArray67);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray67), "4 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray67), "4 ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray67), "[4,  ]");
        org.junit.Assert.assertNotNull(strMatcher71);
        org.junit.Assert.assertNotNull(strTokenizer73);
        org.junit.Assert.assertNotNull(strMatcher74);
        org.junit.Assert.assertNotNull(strTokenizer75);
        org.junit.Assert.assertNotNull(strTokenizer76);
        org.junit.Assert.assertNotNull(strMatcher77);
        org.junit.Assert.assertTrue("'" + boolean78 + "' != '" + true + "'", boolean78 == true);
        org.junit.Assert.assertNotNull(strMatcher79);
        org.junit.Assert.assertNull(str83);
        org.junit.Assert.assertNotNull(strMatcher84);
        org.junit.Assert.assertNotNull(strTokenizer86);
        org.junit.Assert.assertNotNull(strMatcher87);
        org.junit.Assert.assertNotNull(strTokenizer90);
        org.junit.Assert.assertTrue("'" + boolean91 + "' != '" + true + "'", boolean91 == true);
    }

    @Test
    public void test1655() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1655");
        org.apache.commons.lang3.text.StrTokenizer strTokenizer1 = org.apache.commons.lang3.text.StrTokenizer.getCSVInstance("");
        java.util.List<java.lang.String> strList2 = strTokenizer1.getTokenList();
        org.apache.commons.lang3.text.StrTokenizer strTokenizer4 = strTokenizer1.setDelimiterString("hi!");
        org.apache.commons.lang3.text.StrMatcher strMatcher5 = strTokenizer1.getQuoteMatcher();
        // The following exception was thrown during execution in test generation
        try {
            strTokenizer1.add("StrTokenizer[4 ]");
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: add() is unsupported");
        } catch (java.lang.UnsupportedOperationException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strTokenizer1);
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(strTokenizer4);
        org.junit.Assert.assertNotNull(strMatcher5);
    }

    @Test
    public void test1656() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1656");
        char[] charArray2 = new char[] { 'a', '#' };
        org.apache.commons.lang3.text.StrTokenizer strTokenizer3 = org.apache.commons.lang3.text.StrTokenizer.getCSVInstance(charArray2);
        org.apache.commons.lang3.text.StrMatcher strMatcher4 = strTokenizer3.getIgnoredMatcher();
        java.lang.String str5 = strTokenizer3.previousToken();
        java.lang.String str6 = strTokenizer3.toString();
        char[] charArray9 = new char[] { '4', ' ' };
        org.apache.commons.lang3.text.StrTokenizer strTokenizer12 = new org.apache.commons.lang3.text.StrTokenizer(charArray9, 'a', ' ');
        org.apache.commons.lang3.text.StrTokenizer strTokenizer13 = org.apache.commons.lang3.text.StrTokenizer.getCSVInstance(charArray9);
        org.apache.commons.lang3.text.StrMatcher strMatcher14 = null;
        org.apache.commons.lang3.text.StrTokenizer strTokenizer15 = new org.apache.commons.lang3.text.StrTokenizer(charArray9, strMatcher14);
        org.apache.commons.lang3.text.StrTokenizer strTokenizer18 = new org.apache.commons.lang3.text.StrTokenizer(charArray9, ' ', '#');
        org.apache.commons.lang3.text.StrTokenizer strTokenizer19 = org.apache.commons.lang3.text.StrTokenizer.getCSVInstance(charArray9);
        org.apache.commons.lang3.text.StrTokenizer strTokenizer21 = new org.apache.commons.lang3.text.StrTokenizer(charArray9, "hi!");
        char[] charArray24 = new char[] { '4', ' ' };
        org.apache.commons.lang3.text.StrTokenizer strTokenizer27 = new org.apache.commons.lang3.text.StrTokenizer(charArray24, 'a', ' ');
        org.apache.commons.lang3.text.StrTokenizer strTokenizer28 = org.apache.commons.lang3.text.StrTokenizer.getCSVInstance(charArray24);
        org.apache.commons.lang3.text.StrTokenizer strTokenizer29 = org.apache.commons.lang3.text.StrTokenizer.getCSVInstance(charArray24);
        org.apache.commons.lang3.text.StrTokenizer strTokenizer30 = new org.apache.commons.lang3.text.StrTokenizer(charArray24);
        org.apache.commons.lang3.text.StrTokenizer strTokenizer31 = org.apache.commons.lang3.text.StrTokenizer.getCSVInstance(charArray24);
        org.apache.commons.lang3.text.StrTokenizer strTokenizer33 = new org.apache.commons.lang3.text.StrTokenizer(charArray24, "4");
        org.apache.commons.lang3.text.StrTokenizer strTokenizer34 = strTokenizer21.reset(charArray24);
        org.apache.commons.lang3.text.StrTokenizer strTokenizer35 = strTokenizer3.reset(charArray24);
        org.junit.Assert.assertNotNull(charArray2);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray2), "a#");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray2), "a#");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray2), "[a, #]");
        org.junit.Assert.assertNotNull(strTokenizer3);
        org.junit.Assert.assertNotNull(strMatcher4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "StrTokenizer[a#]" + "'", str6, "StrTokenizer[a#]");
        org.junit.Assert.assertNotNull(charArray9);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray9), "4 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray9), "4 ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray9), "[4,  ]");
        org.junit.Assert.assertNotNull(strTokenizer13);
        org.junit.Assert.assertNotNull(strTokenizer19);
        org.junit.Assert.assertNotNull(charArray24);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray24), "4 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray24), "4 ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray24), "[4,  ]");
        org.junit.Assert.assertNotNull(strTokenizer28);
        org.junit.Assert.assertNotNull(strTokenizer29);
        org.junit.Assert.assertNotNull(strTokenizer31);
        org.junit.Assert.assertNotNull(strTokenizer34);
        org.junit.Assert.assertNotNull(strTokenizer35);
    }

    @Test
    public void test1657() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1657");
        char[] charArray2 = new char[] { '4', ' ' };
        org.apache.commons.lang3.text.StrTokenizer strTokenizer5 = new org.apache.commons.lang3.text.StrTokenizer(charArray2, 'a', ' ');
        org.apache.commons.lang3.text.StrMatcher strMatcher6 = strTokenizer5.getTrimmerMatcher();
        org.apache.commons.lang3.text.StrTokenizer strTokenizer8 = strTokenizer5.setDelimiterString("");
        org.apache.commons.lang3.text.StrMatcher strMatcher9 = strTokenizer8.getTrimmerMatcher();
        boolean boolean10 = strTokenizer8.hasNext();
        org.apache.commons.lang3.text.StrTokenizer strTokenizer11 = strTokenizer8.reset();
        java.lang.String str12 = strTokenizer11.getContent();
        org.junit.Assert.assertNotNull(charArray2);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray2), "4 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray2), "4 ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray2), "[4,  ]");
        org.junit.Assert.assertNotNull(strMatcher6);
        org.junit.Assert.assertNotNull(strTokenizer8);
        org.junit.Assert.assertNotNull(strMatcher9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(strTokenizer11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "4 " + "'", str12, "4 ");
    }

    @Test
    public void test1658() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1658");
        char[] charArray2 = new char[] { '4', ' ' };
        org.apache.commons.lang3.text.StrTokenizer strTokenizer5 = new org.apache.commons.lang3.text.StrTokenizer(charArray2, 'a', ' ');
        org.apache.commons.lang3.text.StrMatcher strMatcher6 = strTokenizer5.getTrimmerMatcher();
        char[] charArray9 = new char[] { '4', ' ' };
        org.apache.commons.lang3.text.StrTokenizer strTokenizer12 = new org.apache.commons.lang3.text.StrTokenizer(charArray9, 'a', ' ');
        org.apache.commons.lang3.text.StrTokenizer strTokenizer13 = org.apache.commons.lang3.text.StrTokenizer.getCSVInstance(charArray9);
        org.apache.commons.lang3.text.StrMatcher strMatcher14 = null;
        org.apache.commons.lang3.text.StrTokenizer strTokenizer15 = new org.apache.commons.lang3.text.StrTokenizer(charArray9, strMatcher14);
        org.apache.commons.lang3.text.StrTokenizer strTokenizer16 = strTokenizer5.reset(charArray9);
        java.lang.String str17 = strTokenizer16.next();
        boolean boolean18 = strTokenizer16.isIgnoreEmptyTokens();
        org.apache.commons.lang3.text.StrTokenizer strTokenizer20 = strTokenizer16.setEmptyTokenAsNull(false);
        java.lang.String str21 = strTokenizer16.previousToken();
        org.apache.commons.lang3.text.StrTokenizer strTokenizer23 = strTokenizer16.reset("4");
        org.junit.Assert.assertNotNull(charArray2);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray2), "4 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray2), "4 ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray2), "[4,  ]");
        org.junit.Assert.assertNotNull(strMatcher6);
        org.junit.Assert.assertNotNull(charArray9);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray9), "4 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray9), "4 ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray9), "[4,  ]");
        org.junit.Assert.assertNotNull(strTokenizer13);
        org.junit.Assert.assertNotNull(strTokenizer16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "4 " + "'", str17, "4 ");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(strTokenizer20);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "4 " + "'", str21, "4 ");
        org.junit.Assert.assertNotNull(strTokenizer23);
    }

    @Test
    public void test1659() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1659");
        char[] charArray2 = new char[] { '4', ' ' };
        org.apache.commons.lang3.text.StrTokenizer strTokenizer5 = new org.apache.commons.lang3.text.StrTokenizer(charArray2, 'a', ' ');
        org.apache.commons.lang3.text.StrTokenizer strTokenizer7 = new org.apache.commons.lang3.text.StrTokenizer(charArray2, "hi!");
        org.apache.commons.lang3.text.StrTokenizer strTokenizer8 = new org.apache.commons.lang3.text.StrTokenizer(charArray2);
        org.apache.commons.lang3.text.StrTokenizer strTokenizer9 = strTokenizer8.reset();
        java.lang.String str10 = strTokenizer9.nextToken();
        char[] charArray13 = new char[] { '4', ' ' };
        org.apache.commons.lang3.text.StrTokenizer strTokenizer16 = new org.apache.commons.lang3.text.StrTokenizer(charArray13, 'a', ' ');
        org.apache.commons.lang3.text.StrMatcher strMatcher17 = strTokenizer16.getTrimmerMatcher();
        org.apache.commons.lang3.text.StrTokenizer strTokenizer19 = strTokenizer16.setDelimiterString("");
        org.apache.commons.lang3.text.StrTokenizer strTokenizer21 = strTokenizer19.reset("");
        java.lang.String str22 = strTokenizer21.toString();
        org.apache.commons.lang3.text.StrMatcher strMatcher23 = strTokenizer21.getDelimiterMatcher();
        org.apache.commons.lang3.text.StrTokenizer strTokenizer24 = strTokenizer9.setQuoteMatcher(strMatcher23);
        org.junit.Assert.assertNotNull(charArray2);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray2), "4 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray2), "4 ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray2), "[4,  ]");
        org.junit.Assert.assertNotNull(strTokenizer9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "4" + "'", str10, "4");
        org.junit.Assert.assertNotNull(charArray13);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray13), "4 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray13), "4 ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray13), "[4,  ]");
        org.junit.Assert.assertNotNull(strMatcher17);
        org.junit.Assert.assertNotNull(strTokenizer19);
        org.junit.Assert.assertNotNull(strTokenizer21);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "StrTokenizer[not tokenized yet]" + "'", str22, "StrTokenizer[not tokenized yet]");
        org.junit.Assert.assertNotNull(strMatcher23);
        org.junit.Assert.assertNotNull(strTokenizer24);
    }

    @Test
    public void test1660() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1660");
        char[] charArray0 = null;
        org.apache.commons.lang3.text.StrTokenizer strTokenizer2 = new org.apache.commons.lang3.text.StrTokenizer(charArray0, "StrTokenizer[4 ]");
        org.apache.commons.lang3.text.StrTokenizer strTokenizer4 = strTokenizer2.setDelimiterChar('4');
        org.apache.commons.lang3.text.StrTokenizer strTokenizer6 = strTokenizer4.setIgnoreEmptyTokens(true);
        org.apache.commons.lang3.text.StrTokenizer strTokenizer8 = strTokenizer4.setQuoteChar(' ');
        char[] charArray11 = new char[] { '4', ' ' };
        org.apache.commons.lang3.text.StrTokenizer strTokenizer14 = new org.apache.commons.lang3.text.StrTokenizer(charArray11, 'a', ' ');
        org.apache.commons.lang3.text.StrTokenizer strTokenizer16 = new org.apache.commons.lang3.text.StrTokenizer(charArray11, "hi!");
        org.apache.commons.lang3.text.StrTokenizer strTokenizer17 = new org.apache.commons.lang3.text.StrTokenizer(charArray11);
        org.apache.commons.lang3.text.StrTokenizer strTokenizer19 = new org.apache.commons.lang3.text.StrTokenizer(charArray11, '#');
        boolean boolean20 = strTokenizer19.isIgnoreEmptyTokens();
        org.apache.commons.lang3.text.StrMatcher strMatcher21 = strTokenizer19.getQuoteMatcher();
        org.apache.commons.lang3.text.StrMatcher strMatcher22 = strTokenizer19.getQuoteMatcher();
        org.apache.commons.lang3.text.StrTokenizer strTokenizer23 = strTokenizer8.setQuoteMatcher(strMatcher22);
        org.junit.Assert.assertNotNull(strTokenizer4);
        org.junit.Assert.assertNotNull(strTokenizer6);
        org.junit.Assert.assertNotNull(strTokenizer8);
        org.junit.Assert.assertNotNull(charArray11);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray11), "4 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray11), "4 ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray11), "[4,  ]");
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertNotNull(strMatcher21);
        org.junit.Assert.assertNotNull(strMatcher22);
        org.junit.Assert.assertNotNull(strTokenizer23);
    }

    @Test
    public void test1661() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1661");
        char[] charArray2 = new char[] { '4', ' ' };
        org.apache.commons.lang3.text.StrTokenizer strTokenizer5 = new org.apache.commons.lang3.text.StrTokenizer(charArray2, 'a', ' ');
        org.apache.commons.lang3.text.StrMatcher strMatcher6 = strTokenizer5.getTrimmerMatcher();
        org.apache.commons.lang3.text.StrTokenizer strTokenizer8 = strTokenizer5.setDelimiterString("");
        char[] charArray12 = new char[] { '4', ' ' };
        org.apache.commons.lang3.text.StrTokenizer strTokenizer15 = new org.apache.commons.lang3.text.StrTokenizer(charArray12, 'a', ' ');
        org.apache.commons.lang3.text.StrMatcher strMatcher16 = strTokenizer15.getTrimmerMatcher();
        org.apache.commons.lang3.text.StrTokenizer strTokenizer18 = strTokenizer15.setDelimiterString("");
        org.apache.commons.lang3.text.StrMatcher strMatcher19 = strTokenizer18.getTrimmerMatcher();
        org.apache.commons.lang3.text.StrTokenizer strTokenizer20 = new org.apache.commons.lang3.text.StrTokenizer("", strMatcher19);
        char[] charArray23 = new char[] { '4', ' ' };
        org.apache.commons.lang3.text.StrTokenizer strTokenizer26 = new org.apache.commons.lang3.text.StrTokenizer(charArray23, 'a', ' ');
        org.apache.commons.lang3.text.StrMatcher strMatcher27 = strTokenizer26.getTrimmerMatcher();
        org.apache.commons.lang3.text.StrTokenizer strTokenizer29 = strTokenizer26.setDelimiterString("");
        org.apache.commons.lang3.text.StrMatcher strMatcher30 = strTokenizer29.getTrimmerMatcher();
        org.apache.commons.lang3.text.StrTokenizer strTokenizer31 = strTokenizer20.setTrimmerMatcher(strMatcher30);
        org.apache.commons.lang3.text.StrTokenizer strTokenizer32 = strTokenizer8.setTrimmerMatcher(strMatcher30);
        java.lang.String str33 = strTokenizer8.getContent();
        char[] charArray36 = new char[] { '4', ' ' };
        org.apache.commons.lang3.text.StrTokenizer strTokenizer39 = new org.apache.commons.lang3.text.StrTokenizer(charArray36, 'a', ' ');
        org.apache.commons.lang3.text.StrTokenizer strTokenizer42 = new org.apache.commons.lang3.text.StrTokenizer(charArray36, '4', 'a');
        char[] charArray45 = new char[] { '4', ' ' };
        org.apache.commons.lang3.text.StrTokenizer strTokenizer48 = new org.apache.commons.lang3.text.StrTokenizer(charArray45, 'a', ' ');
        org.apache.commons.lang3.text.StrMatcher strMatcher49 = strTokenizer48.getTrimmerMatcher();
        org.apache.commons.lang3.text.StrMatcher strMatcher50 = strTokenizer48.getQuoteMatcher();
        org.apache.commons.lang3.text.StrTokenizer strTokenizer51 = new org.apache.commons.lang3.text.StrTokenizer(charArray36, strMatcher50);
        org.apache.commons.lang3.text.StrTokenizer strTokenizer52 = strTokenizer8.reset(charArray36);
        org.apache.commons.lang3.text.StrTokenizer strTokenizer53 = org.apache.commons.lang3.text.StrTokenizer.getTSVInstance(charArray36);
        org.apache.commons.lang3.text.StrTokenizer strTokenizer55 = new org.apache.commons.lang3.text.StrTokenizer(charArray36, ' ');
        int int56 = strTokenizer55.previousIndex();
        org.junit.Assert.assertNotNull(charArray2);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray2), "4 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray2), "4 ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray2), "[4,  ]");
        org.junit.Assert.assertNotNull(strMatcher6);
        org.junit.Assert.assertNotNull(strTokenizer8);
        org.junit.Assert.assertNotNull(charArray12);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray12), "4 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray12), "4 ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray12), "[4,  ]");
        org.junit.Assert.assertNotNull(strMatcher16);
        org.junit.Assert.assertNotNull(strTokenizer18);
        org.junit.Assert.assertNotNull(strMatcher19);
        org.junit.Assert.assertNotNull(charArray23);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray23), "4 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray23), "4 ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray23), "[4,  ]");
        org.junit.Assert.assertNotNull(strMatcher27);
        org.junit.Assert.assertNotNull(strTokenizer29);
        org.junit.Assert.assertNotNull(strMatcher30);
        org.junit.Assert.assertNotNull(strTokenizer31);
        org.junit.Assert.assertNotNull(strTokenizer32);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "4 " + "'", str33, "4 ");
        org.junit.Assert.assertNotNull(charArray36);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray36), "4 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray36), "4 ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray36), "[4,  ]");
        org.junit.Assert.assertNotNull(charArray45);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray45), "4 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray45), "4 ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray45), "[4,  ]");
        org.junit.Assert.assertNotNull(strMatcher49);
        org.junit.Assert.assertNotNull(strMatcher50);
        org.junit.Assert.assertNotNull(strTokenizer52);
        org.junit.Assert.assertNotNull(strTokenizer53);
        org.junit.Assert.assertTrue("'" + int56 + "' != '" + (-1) + "'", int56 == (-1));
    }

    @Test
    public void test1662() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1662");
        char[] charArray2 = new char[] { '4', ' ' };
        org.apache.commons.lang3.text.StrTokenizer strTokenizer5 = new org.apache.commons.lang3.text.StrTokenizer(charArray2, 'a', ' ');
        org.apache.commons.lang3.text.StrMatcher strMatcher6 = strTokenizer5.getTrimmerMatcher();
        int int7 = strTokenizer5.nextIndex();
        boolean boolean8 = strTokenizer5.hasNext();
        boolean boolean9 = strTokenizer5.hasNext();
        char[] charArray12 = new char[] { '4', ' ' };
        org.apache.commons.lang3.text.StrTokenizer strTokenizer15 = new org.apache.commons.lang3.text.StrTokenizer(charArray12, 'a', ' ');
        org.apache.commons.lang3.text.StrTokenizer strTokenizer16 = org.apache.commons.lang3.text.StrTokenizer.getTSVInstance(charArray12);
        org.apache.commons.lang3.text.StrTokenizer strTokenizer18 = new org.apache.commons.lang3.text.StrTokenizer(charArray12, '4');
        org.apache.commons.lang3.text.StrMatcher strMatcher19 = strTokenizer18.getDelimiterMatcher();
        org.apache.commons.lang3.text.StrTokenizer strTokenizer20 = strTokenizer5.setQuoteMatcher(strMatcher19);
        org.junit.Assert.assertNotNull(charArray2);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray2), "4 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray2), "4 ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray2), "[4,  ]");
        org.junit.Assert.assertNotNull(strMatcher6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(charArray12);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray12), "4 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray12), "4 ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray12), "[4,  ]");
        org.junit.Assert.assertNotNull(strTokenizer16);
        org.junit.Assert.assertNotNull(strMatcher19);
        org.junit.Assert.assertNotNull(strTokenizer20);
    }

    @Test
    public void test1663() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1663");
        org.apache.commons.lang3.text.StrTokenizer strTokenizer2 = new org.apache.commons.lang3.text.StrTokenizer("4 ", "hi!");
        int int3 = strTokenizer2.size();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
    }

    @Test
    public void test1664() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1664");
        char[] charArray1 = new char[] { '#' };
        org.apache.commons.lang3.text.StrTokenizer strTokenizer2 = new org.apache.commons.lang3.text.StrTokenizer(charArray1);
        org.apache.commons.lang3.text.StrTokenizer strTokenizer4 = new org.apache.commons.lang3.text.StrTokenizer(charArray1, ' ');
        char[] charArray5 = null;
        org.apache.commons.lang3.text.StrTokenizer strTokenizer7 = new org.apache.commons.lang3.text.StrTokenizer(charArray5, "");
        org.apache.commons.lang3.text.StrMatcher strMatcher8 = strTokenizer7.getQuoteMatcher();
        char[] charArray12 = new char[] { '4', ' ' };
        org.apache.commons.lang3.text.StrTokenizer strTokenizer15 = new org.apache.commons.lang3.text.StrTokenizer(charArray12, 'a', ' ');
        org.apache.commons.lang3.text.StrMatcher strMatcher16 = strTokenizer15.getTrimmerMatcher();
        org.apache.commons.lang3.text.StrTokenizer strTokenizer18 = strTokenizer15.setDelimiterString("");
        org.apache.commons.lang3.text.StrMatcher strMatcher19 = strTokenizer18.getTrimmerMatcher();
        org.apache.commons.lang3.text.StrTokenizer strTokenizer20 = new org.apache.commons.lang3.text.StrTokenizer("", strMatcher19);
        char[] charArray23 = new char[] { '4', ' ' };
        org.apache.commons.lang3.text.StrTokenizer strTokenizer26 = new org.apache.commons.lang3.text.StrTokenizer(charArray23, 'a', ' ');
        org.apache.commons.lang3.text.StrMatcher strMatcher27 = strTokenizer26.getTrimmerMatcher();
        org.apache.commons.lang3.text.StrMatcher strMatcher28 = strTokenizer26.getQuoteMatcher();
        org.apache.commons.lang3.text.StrTokenizer strTokenizer29 = strTokenizer20.setDelimiterMatcher(strMatcher28);
        org.apache.commons.lang3.text.StrTokenizer strTokenizer30 = new org.apache.commons.lang3.text.StrTokenizer(charArray1, strMatcher8, strMatcher28);
        int int31 = strTokenizer30.nextIndex();
        org.apache.commons.lang3.text.StrMatcher strMatcher32 = strTokenizer30.getTrimmerMatcher();
        org.junit.Assert.assertNotNull(charArray1);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray1), "#");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray1), "#");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray1), "[#]");
        org.junit.Assert.assertNotNull(strMatcher8);
        org.junit.Assert.assertNotNull(charArray12);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray12), "4 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray12), "4 ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray12), "[4,  ]");
        org.junit.Assert.assertNotNull(strMatcher16);
        org.junit.Assert.assertNotNull(strTokenizer18);
        org.junit.Assert.assertNotNull(strMatcher19);
        org.junit.Assert.assertNotNull(charArray23);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray23), "4 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray23), "4 ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray23), "[4,  ]");
        org.junit.Assert.assertNotNull(strMatcher27);
        org.junit.Assert.assertNotNull(strMatcher28);
        org.junit.Assert.assertNotNull(strTokenizer29);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
        org.junit.Assert.assertNotNull(strMatcher32);
    }

    @Test
    public void test1665() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1665");
        org.apache.commons.lang3.text.StrTokenizer strTokenizer2 = new org.apache.commons.lang3.text.StrTokenizer("4 ", 'a');
        int int3 = strTokenizer2.previousIndex();
        char[] charArray6 = new char[] { '4', ' ' };
        org.apache.commons.lang3.text.StrTokenizer strTokenizer9 = new org.apache.commons.lang3.text.StrTokenizer(charArray6, 'a', ' ');
        org.apache.commons.lang3.text.StrMatcher strMatcher10 = strTokenizer9.getTrimmerMatcher();
        char[] charArray13 = new char[] { '4', ' ' };
        org.apache.commons.lang3.text.StrTokenizer strTokenizer16 = new org.apache.commons.lang3.text.StrTokenizer(charArray13, 'a', ' ');
        org.apache.commons.lang3.text.StrTokenizer strTokenizer17 = org.apache.commons.lang3.text.StrTokenizer.getCSVInstance(charArray13);
        org.apache.commons.lang3.text.StrMatcher strMatcher18 = null;
        org.apache.commons.lang3.text.StrTokenizer strTokenizer19 = new org.apache.commons.lang3.text.StrTokenizer(charArray13, strMatcher18);
        org.apache.commons.lang3.text.StrTokenizer strTokenizer20 = strTokenizer9.reset(charArray13);
        org.apache.commons.lang3.text.StrTokenizer strTokenizer21 = org.apache.commons.lang3.text.StrTokenizer.getCSVInstance(charArray13);
        char[] charArray24 = new char[] { '4', ' ' };
        org.apache.commons.lang3.text.StrTokenizer strTokenizer27 = new org.apache.commons.lang3.text.StrTokenizer(charArray24, 'a', ' ');
        org.apache.commons.lang3.text.StrMatcher strMatcher28 = strTokenizer27.getTrimmerMatcher();
        org.apache.commons.lang3.text.StrTokenizer strTokenizer30 = strTokenizer27.setDelimiterString("");
        char[] charArray34 = new char[] { '4', ' ' };
        org.apache.commons.lang3.text.StrTokenizer strTokenizer37 = new org.apache.commons.lang3.text.StrTokenizer(charArray34, 'a', ' ');
        org.apache.commons.lang3.text.StrMatcher strMatcher38 = strTokenizer37.getTrimmerMatcher();
        org.apache.commons.lang3.text.StrTokenizer strTokenizer40 = strTokenizer37.setDelimiterString("");
        org.apache.commons.lang3.text.StrMatcher strMatcher41 = strTokenizer40.getTrimmerMatcher();
        org.apache.commons.lang3.text.StrTokenizer strTokenizer42 = new org.apache.commons.lang3.text.StrTokenizer("", strMatcher41);
        char[] charArray45 = new char[] { '4', ' ' };
        org.apache.commons.lang3.text.StrTokenizer strTokenizer48 = new org.apache.commons.lang3.text.StrTokenizer(charArray45, 'a', ' ');
        org.apache.commons.lang3.text.StrMatcher strMatcher49 = strTokenizer48.getTrimmerMatcher();
        org.apache.commons.lang3.text.StrTokenizer strTokenizer51 = strTokenizer48.setDelimiterString("");
        org.apache.commons.lang3.text.StrMatcher strMatcher52 = strTokenizer51.getTrimmerMatcher();
        org.apache.commons.lang3.text.StrTokenizer strTokenizer53 = strTokenizer42.setTrimmerMatcher(strMatcher52);
        org.apache.commons.lang3.text.StrTokenizer strTokenizer54 = strTokenizer30.setTrimmerMatcher(strMatcher52);
        org.apache.commons.lang3.text.StrMatcher strMatcher55 = strTokenizer30.getDelimiterMatcher();
        char[] charArray58 = new char[] { '4', ' ' };
        org.apache.commons.lang3.text.StrTokenizer strTokenizer61 = new org.apache.commons.lang3.text.StrTokenizer(charArray58, 'a', ' ');
        org.apache.commons.lang3.text.StrMatcher strMatcher62 = strTokenizer61.getTrimmerMatcher();
        org.apache.commons.lang3.text.StrTokenizer strTokenizer64 = strTokenizer61.setDelimiterString("");
        org.apache.commons.lang3.text.StrMatcher strMatcher65 = strTokenizer64.getTrimmerMatcher();
        org.apache.commons.lang3.text.StrTokenizer strTokenizer66 = new org.apache.commons.lang3.text.StrTokenizer(charArray13, strMatcher55, strMatcher65);
        char[] charArray69 = new char[] { '4', ' ' };
        org.apache.commons.lang3.text.StrTokenizer strTokenizer72 = new org.apache.commons.lang3.text.StrTokenizer(charArray69, 'a', ' ');
        org.apache.commons.lang3.text.StrTokenizer strTokenizer74 = new org.apache.commons.lang3.text.StrTokenizer(charArray69, "hi!");
        org.apache.commons.lang3.text.StrTokenizer strTokenizer75 = new org.apache.commons.lang3.text.StrTokenizer(charArray69);
        char[] charArray78 = new char[] { '4', ' ' };
        org.apache.commons.lang3.text.StrTokenizer strTokenizer81 = new org.apache.commons.lang3.text.StrTokenizer(charArray78, 'a', ' ');
        org.apache.commons.lang3.text.StrMatcher strMatcher82 = strTokenizer81.getTrimmerMatcher();
        org.apache.commons.lang3.text.StrTokenizer strTokenizer83 = strTokenizer75.setTrimmerMatcher(strMatcher82);
        org.apache.commons.lang3.text.StrMatcher strMatcher84 = null;
        org.apache.commons.lang3.text.StrTokenizer strTokenizer85 = new org.apache.commons.lang3.text.StrTokenizer(charArray13, strMatcher82, strMatcher84);
        org.apache.commons.lang3.text.StrTokenizer strTokenizer86 = strTokenizer2.setTrimmerMatcher(strMatcher84);
        org.apache.commons.lang3.text.StrTokenizer strTokenizer88 = strTokenizer2.setEmptyTokenAsNull(false);
        java.util.List<java.lang.String> strList89 = strTokenizer2.getTokenList();
        org.apache.commons.lang3.text.StrTokenizer strTokenizer91 = strTokenizer2.setIgnoredChar('4');
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertNotNull(charArray6);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray6), "4 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray6), "4 ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray6), "[4,  ]");
        org.junit.Assert.assertNotNull(strMatcher10);
        org.junit.Assert.assertNotNull(charArray13);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray13), "4 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray13), "4 ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray13), "[4,  ]");
        org.junit.Assert.assertNotNull(strTokenizer17);
        org.junit.Assert.assertNotNull(strTokenizer20);
        org.junit.Assert.assertNotNull(strTokenizer21);
        org.junit.Assert.assertNotNull(charArray24);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray24), "4 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray24), "4 ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray24), "[4,  ]");
        org.junit.Assert.assertNotNull(strMatcher28);
        org.junit.Assert.assertNotNull(strTokenizer30);
        org.junit.Assert.assertNotNull(charArray34);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray34), "4 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray34), "4 ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray34), "[4,  ]");
        org.junit.Assert.assertNotNull(strMatcher38);
        org.junit.Assert.assertNotNull(strTokenizer40);
        org.junit.Assert.assertNotNull(strMatcher41);
        org.junit.Assert.assertNotNull(charArray45);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray45), "4 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray45), "4 ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray45), "[4,  ]");
        org.junit.Assert.assertNotNull(strMatcher49);
        org.junit.Assert.assertNotNull(strTokenizer51);
        org.junit.Assert.assertNotNull(strMatcher52);
        org.junit.Assert.assertNotNull(strTokenizer53);
        org.junit.Assert.assertNotNull(strTokenizer54);
        org.junit.Assert.assertNotNull(strMatcher55);
        org.junit.Assert.assertNotNull(charArray58);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray58), "4 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray58), "4 ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray58), "[4,  ]");
        org.junit.Assert.assertNotNull(strMatcher62);
        org.junit.Assert.assertNotNull(strTokenizer64);
        org.junit.Assert.assertNotNull(strMatcher65);
        org.junit.Assert.assertNotNull(charArray69);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray69), "4 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray69), "4 ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray69), "[4,  ]");
        org.junit.Assert.assertNotNull(charArray78);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray78), "4 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray78), "4 ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray78), "[4,  ]");
        org.junit.Assert.assertNotNull(strMatcher82);
        org.junit.Assert.assertNotNull(strTokenizer83);
        org.junit.Assert.assertNotNull(strTokenizer86);
        org.junit.Assert.assertNotNull(strTokenizer88);
        org.junit.Assert.assertNotNull(strList89);
        org.junit.Assert.assertNotNull(strTokenizer91);
    }

    @Test
    public void test1666() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1666");
        char[] charArray2 = new char[] { '4', ' ' };
        org.apache.commons.lang3.text.StrTokenizer strTokenizer5 = new org.apache.commons.lang3.text.StrTokenizer(charArray2, 'a', ' ');
        org.apache.commons.lang3.text.StrMatcher strMatcher6 = strTokenizer5.getTrimmerMatcher();
        org.apache.commons.lang3.text.StrTokenizer strTokenizer8 = strTokenizer5.setDelimiterString("");
        char[] charArray12 = new char[] { '4', ' ' };
        org.apache.commons.lang3.text.StrTokenizer strTokenizer15 = new org.apache.commons.lang3.text.StrTokenizer(charArray12, 'a', ' ');
        org.apache.commons.lang3.text.StrMatcher strMatcher16 = strTokenizer15.getTrimmerMatcher();
        org.apache.commons.lang3.text.StrTokenizer strTokenizer18 = strTokenizer15.setDelimiterString("");
        org.apache.commons.lang3.text.StrMatcher strMatcher19 = strTokenizer18.getTrimmerMatcher();
        org.apache.commons.lang3.text.StrTokenizer strTokenizer20 = new org.apache.commons.lang3.text.StrTokenizer("", strMatcher19);
        char[] charArray23 = new char[] { '4', ' ' };
        org.apache.commons.lang3.text.StrTokenizer strTokenizer26 = new org.apache.commons.lang3.text.StrTokenizer(charArray23, 'a', ' ');
        org.apache.commons.lang3.text.StrMatcher strMatcher27 = strTokenizer26.getTrimmerMatcher();
        org.apache.commons.lang3.text.StrTokenizer strTokenizer29 = strTokenizer26.setDelimiterString("");
        org.apache.commons.lang3.text.StrMatcher strMatcher30 = strTokenizer29.getTrimmerMatcher();
        org.apache.commons.lang3.text.StrTokenizer strTokenizer31 = strTokenizer20.setTrimmerMatcher(strMatcher30);
        org.apache.commons.lang3.text.StrTokenizer strTokenizer32 = strTokenizer8.setTrimmerMatcher(strMatcher30);
        java.lang.String str33 = strTokenizer8.getContent();
        char[] charArray36 = new char[] { '4', ' ' };
        org.apache.commons.lang3.text.StrTokenizer strTokenizer39 = new org.apache.commons.lang3.text.StrTokenizer(charArray36, 'a', ' ');
        org.apache.commons.lang3.text.StrTokenizer strTokenizer42 = new org.apache.commons.lang3.text.StrTokenizer(charArray36, '4', 'a');
        char[] charArray45 = new char[] { '4', ' ' };
        org.apache.commons.lang3.text.StrTokenizer strTokenizer48 = new org.apache.commons.lang3.text.StrTokenizer(charArray45, 'a', ' ');
        org.apache.commons.lang3.text.StrMatcher strMatcher49 = strTokenizer48.getTrimmerMatcher();
        org.apache.commons.lang3.text.StrMatcher strMatcher50 = strTokenizer48.getQuoteMatcher();
        org.apache.commons.lang3.text.StrTokenizer strTokenizer51 = new org.apache.commons.lang3.text.StrTokenizer(charArray36, strMatcher50);
        org.apache.commons.lang3.text.StrTokenizer strTokenizer52 = strTokenizer8.reset(charArray36);
        boolean boolean53 = strTokenizer8.isEmptyTokenAsNull();
        org.apache.commons.lang3.text.StrTokenizer strTokenizer55 = strTokenizer8.setDelimiterString("hi!");
        org.apache.commons.lang3.text.StrTokenizer strTokenizer57 = strTokenizer55.setIgnoreEmptyTokens(false);
        java.lang.Object obj58 = strTokenizer55.clone();
        java.util.List<java.lang.String> strList59 = strTokenizer55.getTokenList();
        char[] charArray65 = new char[] { '#', ' ', ' ', 'a', '#' };
        org.apache.commons.lang3.text.StrTokenizer strTokenizer68 = new org.apache.commons.lang3.text.StrTokenizer(charArray65, '#', ' ');
        org.apache.commons.lang3.text.StrTokenizer strTokenizer69 = new org.apache.commons.lang3.text.StrTokenizer(charArray65);
        org.apache.commons.lang3.text.StrTokenizer strTokenizer70 = strTokenizer55.reset(charArray65);
        org.apache.commons.lang3.text.StrTokenizer strTokenizer72 = strTokenizer70.setDelimiterChar(' ');
        int int73 = strTokenizer72.previousIndex();
        org.junit.Assert.assertNotNull(charArray2);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray2), "4 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray2), "4 ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray2), "[4,  ]");
        org.junit.Assert.assertNotNull(strMatcher6);
        org.junit.Assert.assertNotNull(strTokenizer8);
        org.junit.Assert.assertNotNull(charArray12);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray12), "4 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray12), "4 ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray12), "[4,  ]");
        org.junit.Assert.assertNotNull(strMatcher16);
        org.junit.Assert.assertNotNull(strTokenizer18);
        org.junit.Assert.assertNotNull(strMatcher19);
        org.junit.Assert.assertNotNull(charArray23);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray23), "4 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray23), "4 ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray23), "[4,  ]");
        org.junit.Assert.assertNotNull(strMatcher27);
        org.junit.Assert.assertNotNull(strTokenizer29);
        org.junit.Assert.assertNotNull(strMatcher30);
        org.junit.Assert.assertNotNull(strTokenizer31);
        org.junit.Assert.assertNotNull(strTokenizer32);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "4 " + "'", str33, "4 ");
        org.junit.Assert.assertNotNull(charArray36);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray36), "4 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray36), "4 ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray36), "[4,  ]");
        org.junit.Assert.assertNotNull(charArray45);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray45), "4 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray45), "4 ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray45), "[4,  ]");
        org.junit.Assert.assertNotNull(strMatcher49);
        org.junit.Assert.assertNotNull(strMatcher50);
        org.junit.Assert.assertNotNull(strTokenizer52);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
        org.junit.Assert.assertNotNull(strTokenizer55);
        org.junit.Assert.assertNotNull(strTokenizer57);
        org.junit.Assert.assertNotNull(obj58);
        org.junit.Assert.assertEquals(obj58.toString(), "StrTokenizer[not tokenized yet]");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj58), "StrTokenizer[not tokenized yet]");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj58), "StrTokenizer[not tokenized yet]");
        org.junit.Assert.assertNotNull(strList59);
        org.junit.Assert.assertNotNull(charArray65);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray65), "#  a#");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray65), "#  a#");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray65), "[#,  ,  , a, #]");
        org.junit.Assert.assertNotNull(strTokenizer70);
        org.junit.Assert.assertNotNull(strTokenizer72);
        org.junit.Assert.assertTrue("'" + int73 + "' != '" + (-1) + "'", int73 == (-1));
    }

    @Test
    public void test1667() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1667");
        char[] charArray0 = null;
        org.apache.commons.lang3.text.StrTokenizer strTokenizer2 = new org.apache.commons.lang3.text.StrTokenizer(charArray0, "StrTokenizer[4 ]");
        org.apache.commons.lang3.text.StrTokenizer strTokenizer4 = strTokenizer2.setDelimiterChar('4');
        int int5 = strTokenizer2.size();
        org.apache.commons.lang3.text.StrTokenizer strTokenizer8 = new org.apache.commons.lang3.text.StrTokenizer("hi!", " ");
        char[] charArray11 = new char[] { '4', ' ' };
        org.apache.commons.lang3.text.StrTokenizer strTokenizer14 = new org.apache.commons.lang3.text.StrTokenizer(charArray11, 'a', ' ');
        org.apache.commons.lang3.text.StrMatcher strMatcher15 = strTokenizer14.getTrimmerMatcher();
        org.apache.commons.lang3.text.StrTokenizer strTokenizer17 = strTokenizer14.setDelimiterString("");
        char[] charArray21 = new char[] { '4', ' ' };
        org.apache.commons.lang3.text.StrTokenizer strTokenizer24 = new org.apache.commons.lang3.text.StrTokenizer(charArray21, 'a', ' ');
        org.apache.commons.lang3.text.StrMatcher strMatcher25 = strTokenizer24.getTrimmerMatcher();
        org.apache.commons.lang3.text.StrTokenizer strTokenizer27 = strTokenizer24.setDelimiterString("");
        org.apache.commons.lang3.text.StrMatcher strMatcher28 = strTokenizer27.getTrimmerMatcher();
        org.apache.commons.lang3.text.StrTokenizer strTokenizer29 = new org.apache.commons.lang3.text.StrTokenizer("", strMatcher28);
        char[] charArray32 = new char[] { '4', ' ' };
        org.apache.commons.lang3.text.StrTokenizer strTokenizer35 = new org.apache.commons.lang3.text.StrTokenizer(charArray32, 'a', ' ');
        org.apache.commons.lang3.text.StrMatcher strMatcher36 = strTokenizer35.getTrimmerMatcher();
        org.apache.commons.lang3.text.StrTokenizer strTokenizer38 = strTokenizer35.setDelimiterString("");
        org.apache.commons.lang3.text.StrMatcher strMatcher39 = strTokenizer38.getTrimmerMatcher();
        org.apache.commons.lang3.text.StrTokenizer strTokenizer40 = strTokenizer29.setTrimmerMatcher(strMatcher39);
        org.apache.commons.lang3.text.StrTokenizer strTokenizer41 = strTokenizer17.setTrimmerMatcher(strMatcher39);
        java.lang.String str42 = strTokenizer17.getContent();
        char[] charArray45 = new char[] { '4', ' ' };
        org.apache.commons.lang3.text.StrTokenizer strTokenizer48 = new org.apache.commons.lang3.text.StrTokenizer(charArray45, 'a', ' ');
        org.apache.commons.lang3.text.StrTokenizer strTokenizer51 = new org.apache.commons.lang3.text.StrTokenizer(charArray45, '4', 'a');
        char[] charArray54 = new char[] { '4', ' ' };
        org.apache.commons.lang3.text.StrTokenizer strTokenizer57 = new org.apache.commons.lang3.text.StrTokenizer(charArray54, 'a', ' ');
        org.apache.commons.lang3.text.StrMatcher strMatcher58 = strTokenizer57.getTrimmerMatcher();
        org.apache.commons.lang3.text.StrMatcher strMatcher59 = strTokenizer57.getQuoteMatcher();
        org.apache.commons.lang3.text.StrTokenizer strTokenizer60 = new org.apache.commons.lang3.text.StrTokenizer(charArray45, strMatcher59);
        org.apache.commons.lang3.text.StrTokenizer strTokenizer61 = strTokenizer17.reset(charArray45);
        java.util.List<java.lang.String> strList62 = strTokenizer61.getTokenList();
        java.lang.String str63 = strTokenizer61.toString();
        org.apache.commons.lang3.text.StrTokenizer strTokenizer66 = new org.apache.commons.lang3.text.StrTokenizer("StrTokenizer[4 ]", 'a');
        int int67 = strTokenizer66.size();
        char[] charArray68 = null;
        org.apache.commons.lang3.text.StrTokenizer strTokenizer70 = new org.apache.commons.lang3.text.StrTokenizer(charArray68, "");
        java.lang.String str71 = strTokenizer70.getContent();
        org.apache.commons.lang3.text.StrMatcher strMatcher72 = strTokenizer70.getTrimmerMatcher();
        org.apache.commons.lang3.text.StrTokenizer strTokenizer73 = strTokenizer66.setIgnoredMatcher(strMatcher72);
        org.apache.commons.lang3.text.StrTokenizer strTokenizer74 = strTokenizer61.setTrimmerMatcher(strMatcher72);
        org.apache.commons.lang3.text.StrTokenizer strTokenizer75 = strTokenizer8.setQuoteMatcher(strMatcher72);
        org.apache.commons.lang3.text.StrTokenizer strTokenizer77 = org.apache.commons.lang3.text.StrTokenizer.getCSVInstance("hi!");
        char[] charArray80 = new char[] { 'a', '#' };
        org.apache.commons.lang3.text.StrTokenizer strTokenizer81 = org.apache.commons.lang3.text.StrTokenizer.getCSVInstance(charArray80);
        org.apache.commons.lang3.text.StrTokenizer strTokenizer82 = strTokenizer77.reset(charArray80);
        org.apache.commons.lang3.text.StrTokenizer strTokenizer83 = org.apache.commons.lang3.text.StrTokenizer.getTSVInstance(charArray80);
        org.apache.commons.lang3.text.StrMatcher strMatcher84 = strTokenizer83.getTrimmerMatcher();
        org.apache.commons.lang3.text.StrTokenizer strTokenizer85 = strTokenizer75.setDelimiterMatcher(strMatcher84);
        org.apache.commons.lang3.text.StrTokenizer strTokenizer86 = strTokenizer2.setQuoteMatcher(strMatcher84);
        org.apache.commons.lang3.text.StrTokenizer strTokenizer88 = strTokenizer2.setEmptyTokenAsNull(true);
        org.junit.Assert.assertNotNull(strTokenizer4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(charArray11);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray11), "4 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray11), "4 ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray11), "[4,  ]");
        org.junit.Assert.assertNotNull(strMatcher15);
        org.junit.Assert.assertNotNull(strTokenizer17);
        org.junit.Assert.assertNotNull(charArray21);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray21), "4 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray21), "4 ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray21), "[4,  ]");
        org.junit.Assert.assertNotNull(strMatcher25);
        org.junit.Assert.assertNotNull(strTokenizer27);
        org.junit.Assert.assertNotNull(strMatcher28);
        org.junit.Assert.assertNotNull(charArray32);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray32), "4 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray32), "4 ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray32), "[4,  ]");
        org.junit.Assert.assertNotNull(strMatcher36);
        org.junit.Assert.assertNotNull(strTokenizer38);
        org.junit.Assert.assertNotNull(strMatcher39);
        org.junit.Assert.assertNotNull(strTokenizer40);
        org.junit.Assert.assertNotNull(strTokenizer41);
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "4 " + "'", str42, "4 ");
        org.junit.Assert.assertNotNull(charArray45);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray45), "4 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray45), "4 ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray45), "[4,  ]");
        org.junit.Assert.assertNotNull(charArray54);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray54), "4 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray54), "4 ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray54), "[4,  ]");
        org.junit.Assert.assertNotNull(strMatcher58);
        org.junit.Assert.assertNotNull(strMatcher59);
        org.junit.Assert.assertNotNull(strTokenizer61);
        org.junit.Assert.assertNotNull(strList62);
        org.junit.Assert.assertEquals("'" + str63 + "' != '" + "StrTokenizer[4 ]" + "'", str63, "StrTokenizer[4 ]");
        org.junit.Assert.assertTrue("'" + int67 + "' != '" + 1 + "'", int67 == 1);
        org.junit.Assert.assertNull(str71);
        org.junit.Assert.assertNotNull(strMatcher72);
        org.junit.Assert.assertNotNull(strTokenizer73);
        org.junit.Assert.assertNotNull(strTokenizer74);
        org.junit.Assert.assertNotNull(strTokenizer75);
        org.junit.Assert.assertNotNull(strTokenizer77);
        org.junit.Assert.assertNotNull(charArray80);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray80), "a#");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray80), "a#");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray80), "[a, #]");
        org.junit.Assert.assertNotNull(strTokenizer81);
        org.junit.Assert.assertNotNull(strTokenizer82);
        org.junit.Assert.assertNotNull(strTokenizer83);
        org.junit.Assert.assertNotNull(strMatcher84);
        org.junit.Assert.assertNotNull(strTokenizer85);
        org.junit.Assert.assertNotNull(strTokenizer86);
        org.junit.Assert.assertNotNull(strTokenizer88);
    }

    @Test
    public void test1668() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1668");
        char[] charArray2 = new char[] { '4', ' ' };
        org.apache.commons.lang3.text.StrTokenizer strTokenizer5 = new org.apache.commons.lang3.text.StrTokenizer(charArray2, 'a', ' ');
        org.apache.commons.lang3.text.StrMatcher strMatcher6 = strTokenizer5.getTrimmerMatcher();
        char[] charArray9 = new char[] { '4', ' ' };
        org.apache.commons.lang3.text.StrTokenizer strTokenizer12 = new org.apache.commons.lang3.text.StrTokenizer(charArray9, 'a', ' ');
        org.apache.commons.lang3.text.StrTokenizer strTokenizer13 = org.apache.commons.lang3.text.StrTokenizer.getCSVInstance(charArray9);
        org.apache.commons.lang3.text.StrMatcher strMatcher14 = null;
        org.apache.commons.lang3.text.StrTokenizer strTokenizer15 = new org.apache.commons.lang3.text.StrTokenizer(charArray9, strMatcher14);
        org.apache.commons.lang3.text.StrTokenizer strTokenizer16 = strTokenizer5.reset(charArray9);
        org.apache.commons.lang3.text.StrTokenizer strTokenizer17 = org.apache.commons.lang3.text.StrTokenizer.getCSVInstance(charArray9);
        org.apache.commons.lang3.text.StrTokenizer strTokenizer18 = new org.apache.commons.lang3.text.StrTokenizer(charArray9);
        char[] charArray21 = new char[] { '4', ' ' };
        org.apache.commons.lang3.text.StrTokenizer strTokenizer24 = new org.apache.commons.lang3.text.StrTokenizer(charArray21, 'a', ' ');
        org.apache.commons.lang3.text.StrMatcher strMatcher25 = strTokenizer24.getTrimmerMatcher();
        org.apache.commons.lang3.text.StrTokenizer strTokenizer27 = strTokenizer24.setDelimiterString("");
        char[] charArray31 = new char[] { '4', ' ' };
        org.apache.commons.lang3.text.StrTokenizer strTokenizer34 = new org.apache.commons.lang3.text.StrTokenizer(charArray31, 'a', ' ');
        org.apache.commons.lang3.text.StrMatcher strMatcher35 = strTokenizer34.getTrimmerMatcher();
        org.apache.commons.lang3.text.StrTokenizer strTokenizer37 = strTokenizer34.setDelimiterString("");
        org.apache.commons.lang3.text.StrMatcher strMatcher38 = strTokenizer37.getTrimmerMatcher();
        org.apache.commons.lang3.text.StrTokenizer strTokenizer39 = new org.apache.commons.lang3.text.StrTokenizer("", strMatcher38);
        char[] charArray42 = new char[] { '4', ' ' };
        org.apache.commons.lang3.text.StrTokenizer strTokenizer45 = new org.apache.commons.lang3.text.StrTokenizer(charArray42, 'a', ' ');
        org.apache.commons.lang3.text.StrMatcher strMatcher46 = strTokenizer45.getTrimmerMatcher();
        org.apache.commons.lang3.text.StrTokenizer strTokenizer48 = strTokenizer45.setDelimiterString("");
        org.apache.commons.lang3.text.StrMatcher strMatcher49 = strTokenizer48.getTrimmerMatcher();
        org.apache.commons.lang3.text.StrTokenizer strTokenizer50 = strTokenizer39.setTrimmerMatcher(strMatcher49);
        org.apache.commons.lang3.text.StrTokenizer strTokenizer51 = strTokenizer27.setTrimmerMatcher(strMatcher49);
        java.lang.String str52 = strTokenizer27.getContent();
        char[] charArray55 = new char[] { '4', ' ' };
        org.apache.commons.lang3.text.StrTokenizer strTokenizer58 = new org.apache.commons.lang3.text.StrTokenizer(charArray55, 'a', ' ');
        org.apache.commons.lang3.text.StrTokenizer strTokenizer61 = new org.apache.commons.lang3.text.StrTokenizer(charArray55, '4', 'a');
        char[] charArray64 = new char[] { '4', ' ' };
        org.apache.commons.lang3.text.StrTokenizer strTokenizer67 = new org.apache.commons.lang3.text.StrTokenizer(charArray64, 'a', ' ');
        org.apache.commons.lang3.text.StrMatcher strMatcher68 = strTokenizer67.getTrimmerMatcher();
        org.apache.commons.lang3.text.StrMatcher strMatcher69 = strTokenizer67.getQuoteMatcher();
        org.apache.commons.lang3.text.StrTokenizer strTokenizer70 = new org.apache.commons.lang3.text.StrTokenizer(charArray55, strMatcher69);
        org.apache.commons.lang3.text.StrTokenizer strTokenizer71 = strTokenizer27.reset(charArray55);
        java.util.List<java.lang.String> strList72 = strTokenizer71.getTokenList();
        org.apache.commons.lang3.text.StrMatcher strMatcher73 = strTokenizer71.getIgnoredMatcher();
        org.apache.commons.lang3.text.StrTokenizer strTokenizer74 = strTokenizer18.setIgnoredMatcher(strMatcher73);
        boolean boolean75 = strTokenizer18.isEmptyTokenAsNull();
        org.junit.Assert.assertNotNull(charArray2);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray2), "4 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray2), "4 ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray2), "[4,  ]");
        org.junit.Assert.assertNotNull(strMatcher6);
        org.junit.Assert.assertNotNull(charArray9);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray9), "4 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray9), "4 ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray9), "[4,  ]");
        org.junit.Assert.assertNotNull(strTokenizer13);
        org.junit.Assert.assertNotNull(strTokenizer16);
        org.junit.Assert.assertNotNull(strTokenizer17);
        org.junit.Assert.assertNotNull(charArray21);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray21), "4 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray21), "4 ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray21), "[4,  ]");
        org.junit.Assert.assertNotNull(strMatcher25);
        org.junit.Assert.assertNotNull(strTokenizer27);
        org.junit.Assert.assertNotNull(charArray31);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray31), "4 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray31), "4 ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray31), "[4,  ]");
        org.junit.Assert.assertNotNull(strMatcher35);
        org.junit.Assert.assertNotNull(strTokenizer37);
        org.junit.Assert.assertNotNull(strMatcher38);
        org.junit.Assert.assertNotNull(charArray42);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray42), "4 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray42), "4 ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray42), "[4,  ]");
        org.junit.Assert.assertNotNull(strMatcher46);
        org.junit.Assert.assertNotNull(strTokenizer48);
        org.junit.Assert.assertNotNull(strMatcher49);
        org.junit.Assert.assertNotNull(strTokenizer50);
        org.junit.Assert.assertNotNull(strTokenizer51);
        org.junit.Assert.assertEquals("'" + str52 + "' != '" + "4 " + "'", str52, "4 ");
        org.junit.Assert.assertNotNull(charArray55);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray55), "4 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray55), "4 ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray55), "[4,  ]");
        org.junit.Assert.assertNotNull(charArray64);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray64), "4 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray64), "4 ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray64), "[4,  ]");
        org.junit.Assert.assertNotNull(strMatcher68);
        org.junit.Assert.assertNotNull(strMatcher69);
        org.junit.Assert.assertNotNull(strTokenizer71);
        org.junit.Assert.assertNotNull(strList72);
        org.junit.Assert.assertNotNull(strMatcher73);
        org.junit.Assert.assertNotNull(strTokenizer74);
        org.junit.Assert.assertTrue("'" + boolean75 + "' != '" + false + "'", boolean75 == false);
    }

    @Test
    public void test1669() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1669");
        org.apache.commons.lang3.text.StrTokenizer strTokenizer3 = new org.apache.commons.lang3.text.StrTokenizer("", 'a', 'a');
        org.apache.commons.lang3.text.StrTokenizer strTokenizer5 = strTokenizer3.reset("StrTokenizer[4 ]");
        char[] charArray8 = new char[] { '4', ' ' };
        org.apache.commons.lang3.text.StrTokenizer strTokenizer11 = new org.apache.commons.lang3.text.StrTokenizer(charArray8, 'a', ' ');
        org.apache.commons.lang3.text.StrTokenizer strTokenizer12 = org.apache.commons.lang3.text.StrTokenizer.getCSVInstance(charArray8);
        org.apache.commons.lang3.text.StrMatcher strMatcher13 = null;
        org.apache.commons.lang3.text.StrTokenizer strTokenizer14 = new org.apache.commons.lang3.text.StrTokenizer(charArray8, strMatcher13);
        char[] charArray15 = null;
        org.apache.commons.lang3.text.StrTokenizer strTokenizer17 = new org.apache.commons.lang3.text.StrTokenizer(charArray15, "");
        org.apache.commons.lang3.text.StrMatcher strMatcher18 = strTokenizer17.getQuoteMatcher();
        char[] charArray22 = new char[] { '4', ' ' };
        org.apache.commons.lang3.text.StrTokenizer strTokenizer25 = new org.apache.commons.lang3.text.StrTokenizer(charArray22, 'a', ' ');
        org.apache.commons.lang3.text.StrMatcher strMatcher26 = strTokenizer25.getTrimmerMatcher();
        org.apache.commons.lang3.text.StrTokenizer strTokenizer28 = strTokenizer25.setDelimiterString("");
        org.apache.commons.lang3.text.StrMatcher strMatcher29 = strTokenizer28.getTrimmerMatcher();
        org.apache.commons.lang3.text.StrTokenizer strTokenizer30 = new org.apache.commons.lang3.text.StrTokenizer("", strMatcher29);
        char[] charArray33 = new char[] { '4', ' ' };
        org.apache.commons.lang3.text.StrTokenizer strTokenizer36 = new org.apache.commons.lang3.text.StrTokenizer(charArray33, 'a', ' ');
        org.apache.commons.lang3.text.StrMatcher strMatcher37 = strTokenizer36.getTrimmerMatcher();
        org.apache.commons.lang3.text.StrMatcher strMatcher38 = strTokenizer36.getQuoteMatcher();
        org.apache.commons.lang3.text.StrTokenizer strTokenizer39 = strTokenizer30.setDelimiterMatcher(strMatcher38);
        org.apache.commons.lang3.text.StrTokenizer strTokenizer40 = new org.apache.commons.lang3.text.StrTokenizer(charArray8, strMatcher18, strMatcher38);
        org.apache.commons.lang3.text.StrTokenizer strTokenizer41 = new org.apache.commons.lang3.text.StrTokenizer(charArray8);
        org.apache.commons.lang3.text.StrTokenizer strTokenizer43 = new org.apache.commons.lang3.text.StrTokenizer(charArray8, '4');
        char[] charArray45 = null;
        org.apache.commons.lang3.text.StrTokenizer strTokenizer47 = new org.apache.commons.lang3.text.StrTokenizer(charArray45, "");
        java.lang.String str48 = strTokenizer47.getContent();
        org.apache.commons.lang3.text.StrMatcher strMatcher49 = strTokenizer47.getDelimiterMatcher();
        org.apache.commons.lang3.text.StrTokenizer strTokenizer51 = org.apache.commons.lang3.text.StrTokenizer.getCSVInstance("");
        java.util.List<java.lang.String> strList52 = strTokenizer51.getTokenList();
        boolean boolean53 = strTokenizer51.hasPrevious();
        java.lang.String[] strArray54 = strTokenizer51.getTokenArray();
        char[] charArray57 = new char[] { '4', ' ' };
        org.apache.commons.lang3.text.StrTokenizer strTokenizer60 = new org.apache.commons.lang3.text.StrTokenizer(charArray57, 'a', ' ');
        org.apache.commons.lang3.text.StrTokenizer strTokenizer61 = org.apache.commons.lang3.text.StrTokenizer.getCSVInstance(charArray57);
        org.apache.commons.lang3.text.StrMatcher strMatcher62 = null;
        org.apache.commons.lang3.text.StrTokenizer strTokenizer63 = new org.apache.commons.lang3.text.StrTokenizer(charArray57, strMatcher62);
        char[] charArray66 = new char[] { '4', ' ' };
        org.apache.commons.lang3.text.StrTokenizer strTokenizer69 = new org.apache.commons.lang3.text.StrTokenizer(charArray66, 'a', ' ');
        org.apache.commons.lang3.text.StrMatcher strMatcher70 = strTokenizer69.getTrimmerMatcher();
        org.apache.commons.lang3.text.StrTokenizer strTokenizer72 = strTokenizer69.setDelimiterString("");
        org.apache.commons.lang3.text.StrMatcher strMatcher73 = strTokenizer72.getTrimmerMatcher();
        org.apache.commons.lang3.text.StrTokenizer strTokenizer74 = new org.apache.commons.lang3.text.StrTokenizer(charArray57, strMatcher73);
        org.apache.commons.lang3.text.StrTokenizer strTokenizer75 = strTokenizer51.setTrimmerMatcher(strMatcher73);
        org.apache.commons.lang3.text.StrTokenizer strTokenizer76 = new org.apache.commons.lang3.text.StrTokenizer("StrTokenizer[]", strMatcher49, strMatcher73);
        char[] charArray79 = new char[] { '4', ' ' };
        org.apache.commons.lang3.text.StrTokenizer strTokenizer82 = new org.apache.commons.lang3.text.StrTokenizer(charArray79, 'a', ' ');
        org.apache.commons.lang3.text.StrMatcher strMatcher83 = strTokenizer82.getTrimmerMatcher();
        org.apache.commons.lang3.text.StrTokenizer strTokenizer85 = strTokenizer82.setDelimiterString("");
        org.apache.commons.lang3.text.StrMatcher strMatcher86 = strTokenizer85.getTrimmerMatcher();
        org.apache.commons.lang3.text.StrMatcher strMatcher87 = strTokenizer85.getTrimmerMatcher();
        org.apache.commons.lang3.text.StrTokenizer strTokenizer88 = new org.apache.commons.lang3.text.StrTokenizer(charArray8, strMatcher49, strMatcher87);
        org.apache.commons.lang3.text.StrTokenizer strTokenizer89 = strTokenizer3.setTrimmerMatcher(strMatcher49);
        boolean boolean90 = strTokenizer89.hasNext();
        org.apache.commons.lang3.text.StrMatcher strMatcher91 = null;
        org.apache.commons.lang3.text.StrTokenizer strTokenizer92 = strTokenizer89.setDelimiterMatcher(strMatcher91);
        java.lang.String str93 = strTokenizer89.next();
        org.junit.Assert.assertNotNull(strTokenizer5);
        org.junit.Assert.assertNotNull(charArray8);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray8), "4 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray8), "4 ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray8), "[4,  ]");
        org.junit.Assert.assertNotNull(strTokenizer12);
        org.junit.Assert.assertNotNull(strMatcher18);
        org.junit.Assert.assertNotNull(charArray22);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray22), "4 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray22), "4 ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray22), "[4,  ]");
        org.junit.Assert.assertNotNull(strMatcher26);
        org.junit.Assert.assertNotNull(strTokenizer28);
        org.junit.Assert.assertNotNull(strMatcher29);
        org.junit.Assert.assertNotNull(charArray33);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray33), "4 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray33), "4 ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray33), "[4,  ]");
        org.junit.Assert.assertNotNull(strMatcher37);
        org.junit.Assert.assertNotNull(strMatcher38);
        org.junit.Assert.assertNotNull(strTokenizer39);
        org.junit.Assert.assertNull(str48);
        org.junit.Assert.assertNotNull(strMatcher49);
        org.junit.Assert.assertNotNull(strTokenizer51);
        org.junit.Assert.assertNotNull(strList52);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
        org.junit.Assert.assertNotNull(strArray54);
        org.junit.Assert.assertNotNull(charArray57);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray57), "4 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray57), "4 ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray57), "[4,  ]");
        org.junit.Assert.assertNotNull(strTokenizer61);
        org.junit.Assert.assertNotNull(charArray66);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray66), "4 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray66), "4 ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray66), "[4,  ]");
        org.junit.Assert.assertNotNull(strMatcher70);
        org.junit.Assert.assertNotNull(strTokenizer72);
        org.junit.Assert.assertNotNull(strMatcher73);
        org.junit.Assert.assertNotNull(strTokenizer75);
        org.junit.Assert.assertNotNull(charArray79);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray79), "4 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray79), "4 ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray79), "[4,  ]");
        org.junit.Assert.assertNotNull(strMatcher83);
        org.junit.Assert.assertNotNull(strTokenizer85);
        org.junit.Assert.assertNotNull(strMatcher86);
        org.junit.Assert.assertNotNull(strMatcher87);
        org.junit.Assert.assertNotNull(strTokenizer89);
        org.junit.Assert.assertTrue("'" + boolean90 + "' != '" + true + "'", boolean90 == true);
        org.junit.Assert.assertNotNull(strTokenizer92);
        org.junit.Assert.assertEquals("'" + str93 + "' != '" + "StrTokenizer[4 ]" + "'", str93, "StrTokenizer[4 ]");
    }

    @Test
    public void test1670() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1670");
        char[] charArray2 = new char[] { '4', ' ' };
        org.apache.commons.lang3.text.StrTokenizer strTokenizer5 = new org.apache.commons.lang3.text.StrTokenizer(charArray2, 'a', ' ');
        org.apache.commons.lang3.text.StrMatcher strMatcher6 = strTokenizer5.getTrimmerMatcher();
        org.apache.commons.lang3.text.StrMatcher strMatcher7 = strTokenizer5.getQuoteMatcher();
        char[] charArray10 = new char[] { '4', ' ' };
        org.apache.commons.lang3.text.StrTokenizer strTokenizer13 = new org.apache.commons.lang3.text.StrTokenizer(charArray10, 'a', ' ');
        org.apache.commons.lang3.text.StrMatcher strMatcher14 = strTokenizer13.getTrimmerMatcher();
        char[] charArray17 = new char[] { '4', ' ' };
        org.apache.commons.lang3.text.StrTokenizer strTokenizer20 = new org.apache.commons.lang3.text.StrTokenizer(charArray17, 'a', ' ');
        org.apache.commons.lang3.text.StrTokenizer strTokenizer21 = org.apache.commons.lang3.text.StrTokenizer.getCSVInstance(charArray17);
        org.apache.commons.lang3.text.StrMatcher strMatcher22 = null;
        org.apache.commons.lang3.text.StrTokenizer strTokenizer23 = new org.apache.commons.lang3.text.StrTokenizer(charArray17, strMatcher22);
        org.apache.commons.lang3.text.StrTokenizer strTokenizer24 = strTokenizer13.reset(charArray17);
        org.apache.commons.lang3.text.StrTokenizer strTokenizer25 = org.apache.commons.lang3.text.StrTokenizer.getCSVInstance(charArray17);
        char[] charArray28 = new char[] { '4', ' ' };
        org.apache.commons.lang3.text.StrTokenizer strTokenizer31 = new org.apache.commons.lang3.text.StrTokenizer(charArray28, 'a', ' ');
        org.apache.commons.lang3.text.StrMatcher strMatcher32 = strTokenizer31.getTrimmerMatcher();
        org.apache.commons.lang3.text.StrTokenizer strTokenizer34 = strTokenizer31.setDelimiterString("");
        char[] charArray38 = new char[] { '4', ' ' };
        org.apache.commons.lang3.text.StrTokenizer strTokenizer41 = new org.apache.commons.lang3.text.StrTokenizer(charArray38, 'a', ' ');
        org.apache.commons.lang3.text.StrMatcher strMatcher42 = strTokenizer41.getTrimmerMatcher();
        org.apache.commons.lang3.text.StrTokenizer strTokenizer44 = strTokenizer41.setDelimiterString("");
        org.apache.commons.lang3.text.StrMatcher strMatcher45 = strTokenizer44.getTrimmerMatcher();
        org.apache.commons.lang3.text.StrTokenizer strTokenizer46 = new org.apache.commons.lang3.text.StrTokenizer("", strMatcher45);
        char[] charArray49 = new char[] { '4', ' ' };
        org.apache.commons.lang3.text.StrTokenizer strTokenizer52 = new org.apache.commons.lang3.text.StrTokenizer(charArray49, 'a', ' ');
        org.apache.commons.lang3.text.StrMatcher strMatcher53 = strTokenizer52.getTrimmerMatcher();
        org.apache.commons.lang3.text.StrTokenizer strTokenizer55 = strTokenizer52.setDelimiterString("");
        org.apache.commons.lang3.text.StrMatcher strMatcher56 = strTokenizer55.getTrimmerMatcher();
        org.apache.commons.lang3.text.StrTokenizer strTokenizer57 = strTokenizer46.setTrimmerMatcher(strMatcher56);
        org.apache.commons.lang3.text.StrTokenizer strTokenizer58 = strTokenizer34.setTrimmerMatcher(strMatcher56);
        org.apache.commons.lang3.text.StrMatcher strMatcher59 = strTokenizer34.getDelimiterMatcher();
        char[] charArray62 = new char[] { '4', ' ' };
        org.apache.commons.lang3.text.StrTokenizer strTokenizer65 = new org.apache.commons.lang3.text.StrTokenizer(charArray62, 'a', ' ');
        org.apache.commons.lang3.text.StrMatcher strMatcher66 = strTokenizer65.getTrimmerMatcher();
        org.apache.commons.lang3.text.StrTokenizer strTokenizer68 = strTokenizer65.setDelimiterString("");
        org.apache.commons.lang3.text.StrMatcher strMatcher69 = strTokenizer68.getTrimmerMatcher();
        org.apache.commons.lang3.text.StrTokenizer strTokenizer70 = new org.apache.commons.lang3.text.StrTokenizer(charArray17, strMatcher59, strMatcher69);
        org.apache.commons.lang3.text.StrTokenizer strTokenizer71 = strTokenizer5.setIgnoredMatcher(strMatcher69);
        org.apache.commons.lang3.text.StrTokenizer strTokenizer73 = strTokenizer71.setIgnoreEmptyTokens(false);
        org.apache.commons.lang3.text.StrTokenizer strTokenizer75 = strTokenizer71.setQuoteChar('a');
        org.apache.commons.lang3.text.StrMatcher strMatcher76 = strTokenizer71.getIgnoredMatcher();
        org.apache.commons.lang3.text.StrTokenizer strTokenizer78 = strTokenizer71.setEmptyTokenAsNull(true);
        org.apache.commons.lang3.text.StrTokenizer strTokenizer80 = strTokenizer78.setDelimiterChar(' ');
        java.lang.Object obj81 = strTokenizer78.clone();
        org.junit.Assert.assertNotNull(charArray2);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray2), "4 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray2), "4 ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray2), "[4,  ]");
        org.junit.Assert.assertNotNull(strMatcher6);
        org.junit.Assert.assertNotNull(strMatcher7);
        org.junit.Assert.assertNotNull(charArray10);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray10), "4 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray10), "4 ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray10), "[4,  ]");
        org.junit.Assert.assertNotNull(strMatcher14);
        org.junit.Assert.assertNotNull(charArray17);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray17), "4 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray17), "4 ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray17), "[4,  ]");
        org.junit.Assert.assertNotNull(strTokenizer21);
        org.junit.Assert.assertNotNull(strTokenizer24);
        org.junit.Assert.assertNotNull(strTokenizer25);
        org.junit.Assert.assertNotNull(charArray28);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray28), "4 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray28), "4 ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray28), "[4,  ]");
        org.junit.Assert.assertNotNull(strMatcher32);
        org.junit.Assert.assertNotNull(strTokenizer34);
        org.junit.Assert.assertNotNull(charArray38);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray38), "4 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray38), "4 ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray38), "[4,  ]");
        org.junit.Assert.assertNotNull(strMatcher42);
        org.junit.Assert.assertNotNull(strTokenizer44);
        org.junit.Assert.assertNotNull(strMatcher45);
        org.junit.Assert.assertNotNull(charArray49);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray49), "4 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray49), "4 ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray49), "[4,  ]");
        org.junit.Assert.assertNotNull(strMatcher53);
        org.junit.Assert.assertNotNull(strTokenizer55);
        org.junit.Assert.assertNotNull(strMatcher56);
        org.junit.Assert.assertNotNull(strTokenizer57);
        org.junit.Assert.assertNotNull(strTokenizer58);
        org.junit.Assert.assertNotNull(strMatcher59);
        org.junit.Assert.assertNotNull(charArray62);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray62), "4 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray62), "4 ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray62), "[4,  ]");
        org.junit.Assert.assertNotNull(strMatcher66);
        org.junit.Assert.assertNotNull(strTokenizer68);
        org.junit.Assert.assertNotNull(strMatcher69);
        org.junit.Assert.assertNotNull(strTokenizer71);
        org.junit.Assert.assertNotNull(strTokenizer73);
        org.junit.Assert.assertNotNull(strTokenizer75);
        org.junit.Assert.assertNotNull(strMatcher76);
        org.junit.Assert.assertNotNull(strTokenizer78);
        org.junit.Assert.assertNotNull(strTokenizer80);
        org.junit.Assert.assertNotNull(obj81);
        org.junit.Assert.assertEquals(obj81.toString(), "StrTokenizer[not tokenized yet]");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj81), "StrTokenizer[not tokenized yet]");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj81), "StrTokenizer[not tokenized yet]");
    }

    @Test
    public void test1671() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1671");
        org.apache.commons.lang3.text.StrTokenizer strTokenizer3 = new org.apache.commons.lang3.text.StrTokenizer("", 'a', 'a');
        org.apache.commons.lang3.text.StrTokenizer strTokenizer5 = strTokenizer3.reset("StrTokenizer[4 ]");
        java.lang.String str6 = strTokenizer5.toString();
        // The following exception was thrown during execution in test generation
        try {
            strTokenizer5.remove();
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: remove() is unsupported");
        } catch (java.lang.UnsupportedOperationException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strTokenizer5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "StrTokenizer[not tokenized yet]" + "'", str6, "StrTokenizer[not tokenized yet]");
    }

    @Test
    public void test1672() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1672");
        char[] charArray2 = new char[] { '4', ' ' };
        org.apache.commons.lang3.text.StrTokenizer strTokenizer5 = new org.apache.commons.lang3.text.StrTokenizer(charArray2, 'a', ' ');
        org.apache.commons.lang3.text.StrTokenizer strTokenizer6 = org.apache.commons.lang3.text.StrTokenizer.getCSVInstance(charArray2);
        org.apache.commons.lang3.text.StrMatcher strMatcher7 = null;
        org.apache.commons.lang3.text.StrTokenizer strTokenizer8 = new org.apache.commons.lang3.text.StrTokenizer(charArray2, strMatcher7);
        org.apache.commons.lang3.text.StrTokenizer strTokenizer11 = new org.apache.commons.lang3.text.StrTokenizer(charArray2, ' ', '#');
        org.apache.commons.lang3.text.StrTokenizer strTokenizer12 = org.apache.commons.lang3.text.StrTokenizer.getTSVInstance(charArray2);
        org.apache.commons.lang3.text.StrTokenizer strTokenizer15 = new org.apache.commons.lang3.text.StrTokenizer(charArray2, '#', '#');
        char[] charArray18 = new char[] { '4', ' ' };
        org.apache.commons.lang3.text.StrTokenizer strTokenizer21 = new org.apache.commons.lang3.text.StrTokenizer(charArray18, 'a', ' ');
        org.apache.commons.lang3.text.StrMatcher strMatcher22 = strTokenizer21.getTrimmerMatcher();
        java.lang.String str23 = strTokenizer21.nextToken();
        char[] charArray26 = new char[] { '4', ' ' };
        org.apache.commons.lang3.text.StrTokenizer strTokenizer29 = new org.apache.commons.lang3.text.StrTokenizer(charArray26, 'a', ' ');
        org.apache.commons.lang3.text.StrMatcher strMatcher30 = strTokenizer29.getTrimmerMatcher();
        org.apache.commons.lang3.text.StrTokenizer strTokenizer32 = strTokenizer29.setDelimiterString("");
        org.apache.commons.lang3.text.StrMatcher strMatcher33 = strTokenizer32.getTrimmerMatcher();
        org.apache.commons.lang3.text.StrMatcher strMatcher34 = strTokenizer32.getTrimmerMatcher();
        char[] charArray37 = new char[] { '4', ' ' };
        org.apache.commons.lang3.text.StrTokenizer strTokenizer40 = new org.apache.commons.lang3.text.StrTokenizer(charArray37, 'a', ' ');
        org.apache.commons.lang3.text.StrTokenizer strTokenizer41 = strTokenizer32.reset(charArray37);
        org.apache.commons.lang3.text.StrTokenizer strTokenizer43 = new org.apache.commons.lang3.text.StrTokenizer(charArray37, "");
        org.apache.commons.lang3.text.StrTokenizer strTokenizer44 = strTokenizer21.reset(charArray37);
        org.apache.commons.lang3.text.StrMatcher strMatcher45 = strTokenizer44.getDelimiterMatcher();
        java.util.List<java.lang.String> strList46 = strTokenizer44.getTokenList();
        char[] charArray49 = new char[] { '4', ' ' };
        org.apache.commons.lang3.text.StrTokenizer strTokenizer52 = new org.apache.commons.lang3.text.StrTokenizer(charArray49, 'a', ' ');
        char[] charArray55 = new char[] { '4', ' ' };
        org.apache.commons.lang3.text.StrTokenizer strTokenizer58 = new org.apache.commons.lang3.text.StrTokenizer(charArray55, 'a', ' ');
        org.apache.commons.lang3.text.StrMatcher strMatcher59 = strTokenizer58.getTrimmerMatcher();
        org.apache.commons.lang3.text.StrTokenizer strTokenizer61 = strTokenizer58.setDelimiterString("");
        org.apache.commons.lang3.text.StrMatcher strMatcher62 = strTokenizer61.getTrimmerMatcher();
        org.apache.commons.lang3.text.StrMatcher strMatcher63 = strTokenizer61.getTrimmerMatcher();
        char[] charArray65 = null;
        org.apache.commons.lang3.text.StrTokenizer strTokenizer67 = new org.apache.commons.lang3.text.StrTokenizer(charArray65, "");
        java.lang.String str68 = strTokenizer67.getContent();
        org.apache.commons.lang3.text.StrMatcher strMatcher69 = strTokenizer67.getDelimiterMatcher();
        org.apache.commons.lang3.text.StrTokenizer strTokenizer70 = new org.apache.commons.lang3.text.StrTokenizer("hi!", strMatcher69);
        org.apache.commons.lang3.text.StrTokenizer strTokenizer71 = new org.apache.commons.lang3.text.StrTokenizer(charArray49, strMatcher63, strMatcher69);
        org.apache.commons.lang3.text.StrTokenizer strTokenizer72 = strTokenizer44.setQuoteMatcher(strMatcher69);
        char[] charArray75 = new char[] { '4', ' ' };
        org.apache.commons.lang3.text.StrTokenizer strTokenizer78 = new org.apache.commons.lang3.text.StrTokenizer(charArray75, 'a', ' ');
        org.apache.commons.lang3.text.StrMatcher strMatcher79 = strTokenizer78.getTrimmerMatcher();
        char[] charArray82 = new char[] { '4', ' ' };
        org.apache.commons.lang3.text.StrTokenizer strTokenizer85 = new org.apache.commons.lang3.text.StrTokenizer(charArray82, 'a', ' ');
        org.apache.commons.lang3.text.StrTokenizer strTokenizer86 = org.apache.commons.lang3.text.StrTokenizer.getCSVInstance(charArray82);
        org.apache.commons.lang3.text.StrMatcher strMatcher87 = null;
        org.apache.commons.lang3.text.StrTokenizer strTokenizer88 = new org.apache.commons.lang3.text.StrTokenizer(charArray82, strMatcher87);
        org.apache.commons.lang3.text.StrTokenizer strTokenizer89 = strTokenizer78.reset(charArray82);
        java.lang.Object obj90 = strTokenizer78.clone();
        boolean boolean91 = strTokenizer78.hasNext();
        org.apache.commons.lang3.text.StrMatcher strMatcher92 = strTokenizer78.getTrimmerMatcher();
        org.apache.commons.lang3.text.StrTokenizer strTokenizer93 = strTokenizer44.setTrimmerMatcher(strMatcher92);
        org.apache.commons.lang3.text.StrMatcher strMatcher94 = strTokenizer44.getQuoteMatcher();
        org.apache.commons.lang3.text.StrTokenizer strTokenizer95 = strTokenizer15.setTrimmerMatcher(strMatcher94);
        java.lang.Class<?> wildcardClass96 = strTokenizer15.getClass();
        org.junit.Assert.assertNotNull(charArray2);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray2), "4 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray2), "4 ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray2), "[4,  ]");
        org.junit.Assert.assertNotNull(strTokenizer6);
        org.junit.Assert.assertNotNull(strTokenizer12);
        org.junit.Assert.assertNotNull(charArray18);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray18), "4 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray18), "4 ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray18), "[4,  ]");
        org.junit.Assert.assertNotNull(strMatcher22);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "4 " + "'", str23, "4 ");
        org.junit.Assert.assertNotNull(charArray26);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray26), "4 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray26), "4 ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray26), "[4,  ]");
        org.junit.Assert.assertNotNull(strMatcher30);
        org.junit.Assert.assertNotNull(strTokenizer32);
        org.junit.Assert.assertNotNull(strMatcher33);
        org.junit.Assert.assertNotNull(strMatcher34);
        org.junit.Assert.assertNotNull(charArray37);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray37), "4 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray37), "4 ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray37), "[4,  ]");
        org.junit.Assert.assertNotNull(strTokenizer41);
        org.junit.Assert.assertNotNull(strTokenizer44);
        org.junit.Assert.assertNotNull(strMatcher45);
        org.junit.Assert.assertNotNull(strList46);
        org.junit.Assert.assertNotNull(charArray49);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray49), "4 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray49), "4 ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray49), "[4,  ]");
        org.junit.Assert.assertNotNull(charArray55);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray55), "4 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray55), "4 ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray55), "[4,  ]");
        org.junit.Assert.assertNotNull(strMatcher59);
        org.junit.Assert.assertNotNull(strTokenizer61);
        org.junit.Assert.assertNotNull(strMatcher62);
        org.junit.Assert.assertNotNull(strMatcher63);
        org.junit.Assert.assertNull(str68);
        org.junit.Assert.assertNotNull(strMatcher69);
        org.junit.Assert.assertNotNull(strTokenizer72);
        org.junit.Assert.assertNotNull(charArray75);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray75), "4 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray75), "4 ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray75), "[4,  ]");
        org.junit.Assert.assertNotNull(strMatcher79);
        org.junit.Assert.assertNotNull(charArray82);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray82), "4 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray82), "4 ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray82), "[4,  ]");
        org.junit.Assert.assertNotNull(strTokenizer86);
        org.junit.Assert.assertNotNull(strTokenizer89);
        org.junit.Assert.assertNotNull(obj90);
        org.junit.Assert.assertEquals(obj90.toString(), "StrTokenizer[not tokenized yet]");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj90), "StrTokenizer[not tokenized yet]");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj90), "StrTokenizer[not tokenized yet]");
        org.junit.Assert.assertTrue("'" + boolean91 + "' != '" + true + "'", boolean91 == true);
        org.junit.Assert.assertNotNull(strMatcher92);
        org.junit.Assert.assertNotNull(strTokenizer93);
        org.junit.Assert.assertNotNull(strMatcher94);
        org.junit.Assert.assertNotNull(strTokenizer95);
        org.junit.Assert.assertNotNull(wildcardClass96);
    }

    @Test
    public void test1673() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1673");
        org.apache.commons.lang3.text.StrTokenizer strTokenizer2 = new org.apache.commons.lang3.text.StrTokenizer("4 ", "4 ");
        java.lang.Class<?> wildcardClass3 = strTokenizer2.getClass();
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test1674() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1674");
        char[] charArray2 = new char[] { '4', ' ' };
        org.apache.commons.lang3.text.StrTokenizer strTokenizer5 = new org.apache.commons.lang3.text.StrTokenizer(charArray2, 'a', ' ');
        org.apache.commons.lang3.text.StrTokenizer strTokenizer7 = new org.apache.commons.lang3.text.StrTokenizer(charArray2, "hi!");
        org.apache.commons.lang3.text.StrTokenizer strTokenizer8 = new org.apache.commons.lang3.text.StrTokenizer(charArray2);
        org.apache.commons.lang3.text.StrTokenizer strTokenizer10 = strTokenizer8.reset("StrTokenizer[4 ]");
        char[] charArray13 = new char[] { '4', ' ' };
        org.apache.commons.lang3.text.StrTokenizer strTokenizer16 = new org.apache.commons.lang3.text.StrTokenizer(charArray13, 'a', ' ');
        org.apache.commons.lang3.text.StrMatcher strMatcher17 = strTokenizer16.getTrimmerMatcher();
        org.apache.commons.lang3.text.StrTokenizer strTokenizer19 = strTokenizer16.setDelimiterString("");
        org.apache.commons.lang3.text.StrMatcher strMatcher20 = strTokenizer19.getTrimmerMatcher();
        org.apache.commons.lang3.text.StrMatcher strMatcher21 = strTokenizer19.getTrimmerMatcher();
        char[] charArray24 = new char[] { '4', ' ' };
        org.apache.commons.lang3.text.StrTokenizer strTokenizer27 = new org.apache.commons.lang3.text.StrTokenizer(charArray24, 'a', ' ');
        org.apache.commons.lang3.text.StrTokenizer strTokenizer28 = strTokenizer19.reset(charArray24);
        char[] charArray31 = new char[] { '4', ' ' };
        org.apache.commons.lang3.text.StrTokenizer strTokenizer34 = new org.apache.commons.lang3.text.StrTokenizer(charArray31, 'a', ' ');
        org.apache.commons.lang3.text.StrMatcher strMatcher35 = strTokenizer34.getTrimmerMatcher();
        org.apache.commons.lang3.text.StrTokenizer strTokenizer37 = strTokenizer34.setDelimiterString("");
        char[] charArray41 = new char[] { '4', ' ' };
        org.apache.commons.lang3.text.StrTokenizer strTokenizer44 = new org.apache.commons.lang3.text.StrTokenizer(charArray41, 'a', ' ');
        org.apache.commons.lang3.text.StrMatcher strMatcher45 = strTokenizer44.getTrimmerMatcher();
        org.apache.commons.lang3.text.StrTokenizer strTokenizer47 = strTokenizer44.setDelimiterString("");
        org.apache.commons.lang3.text.StrMatcher strMatcher48 = strTokenizer47.getTrimmerMatcher();
        org.apache.commons.lang3.text.StrTokenizer strTokenizer49 = new org.apache.commons.lang3.text.StrTokenizer("", strMatcher48);
        char[] charArray52 = new char[] { '4', ' ' };
        org.apache.commons.lang3.text.StrTokenizer strTokenizer55 = new org.apache.commons.lang3.text.StrTokenizer(charArray52, 'a', ' ');
        org.apache.commons.lang3.text.StrMatcher strMatcher56 = strTokenizer55.getTrimmerMatcher();
        org.apache.commons.lang3.text.StrTokenizer strTokenizer58 = strTokenizer55.setDelimiterString("");
        org.apache.commons.lang3.text.StrMatcher strMatcher59 = strTokenizer58.getTrimmerMatcher();
        org.apache.commons.lang3.text.StrTokenizer strTokenizer60 = strTokenizer49.setTrimmerMatcher(strMatcher59);
        org.apache.commons.lang3.text.StrTokenizer strTokenizer61 = strTokenizer37.setTrimmerMatcher(strMatcher59);
        org.apache.commons.lang3.text.StrTokenizer strTokenizer62 = strTokenizer19.setQuoteMatcher(strMatcher59);
        org.apache.commons.lang3.text.StrTokenizer strTokenizer63 = strTokenizer8.setDelimiterMatcher(strMatcher59);
        java.util.List<java.lang.String> strList64 = strTokenizer63.getTokenList();
        java.lang.Object obj65 = strTokenizer63.clone();
        java.util.List<java.lang.String> strList66 = strTokenizer63.getTokenList();
        org.junit.Assert.assertNotNull(charArray2);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray2), "4 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray2), "4 ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray2), "[4,  ]");
        org.junit.Assert.assertNotNull(strTokenizer10);
        org.junit.Assert.assertNotNull(charArray13);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray13), "4 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray13), "4 ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray13), "[4,  ]");
        org.junit.Assert.assertNotNull(strMatcher17);
        org.junit.Assert.assertNotNull(strTokenizer19);
        org.junit.Assert.assertNotNull(strMatcher20);
        org.junit.Assert.assertNotNull(strMatcher21);
        org.junit.Assert.assertNotNull(charArray24);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray24), "4 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray24), "4 ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray24), "[4,  ]");
        org.junit.Assert.assertNotNull(strTokenizer28);
        org.junit.Assert.assertNotNull(charArray31);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray31), "4 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray31), "4 ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray31), "[4,  ]");
        org.junit.Assert.assertNotNull(strMatcher35);
        org.junit.Assert.assertNotNull(strTokenizer37);
        org.junit.Assert.assertNotNull(charArray41);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray41), "4 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray41), "4 ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray41), "[4,  ]");
        org.junit.Assert.assertNotNull(strMatcher45);
        org.junit.Assert.assertNotNull(strTokenizer47);
        org.junit.Assert.assertNotNull(strMatcher48);
        org.junit.Assert.assertNotNull(charArray52);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray52), "4 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray52), "4 ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray52), "[4,  ]");
        org.junit.Assert.assertNotNull(strMatcher56);
        org.junit.Assert.assertNotNull(strTokenizer58);
        org.junit.Assert.assertNotNull(strMatcher59);
        org.junit.Assert.assertNotNull(strTokenizer60);
        org.junit.Assert.assertNotNull(strTokenizer61);
        org.junit.Assert.assertNotNull(strTokenizer62);
        org.junit.Assert.assertNotNull(strTokenizer63);
        org.junit.Assert.assertNotNull(strList64);
        org.junit.Assert.assertNotNull(obj65);
        org.junit.Assert.assertEquals(obj65.toString(), "StrTokenizer[not tokenized yet]");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj65), "StrTokenizer[not tokenized yet]");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj65), "StrTokenizer[not tokenized yet]");
        org.junit.Assert.assertNotNull(strList66);
    }

    @Test
    public void test1675() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1675");
        char[] charArray2 = new char[] { '4', ' ' };
        org.apache.commons.lang3.text.StrTokenizer strTokenizer5 = new org.apache.commons.lang3.text.StrTokenizer(charArray2, 'a', ' ');
        org.apache.commons.lang3.text.StrTokenizer strTokenizer6 = org.apache.commons.lang3.text.StrTokenizer.getCSVInstance(charArray2);
        org.apache.commons.lang3.text.StrMatcher strMatcher7 = null;
        org.apache.commons.lang3.text.StrTokenizer strTokenizer8 = new org.apache.commons.lang3.text.StrTokenizer(charArray2, strMatcher7);
        char[] charArray11 = new char[] { '4', ' ' };
        org.apache.commons.lang3.text.StrTokenizer strTokenizer14 = new org.apache.commons.lang3.text.StrTokenizer(charArray11, 'a', ' ');
        org.apache.commons.lang3.text.StrMatcher strMatcher15 = strTokenizer14.getTrimmerMatcher();
        org.apache.commons.lang3.text.StrTokenizer strTokenizer17 = strTokenizer14.setDelimiterString("");
        org.apache.commons.lang3.text.StrMatcher strMatcher18 = strTokenizer17.getTrimmerMatcher();
        org.apache.commons.lang3.text.StrTokenizer strTokenizer19 = new org.apache.commons.lang3.text.StrTokenizer(charArray2, strMatcher18);
        char[] charArray22 = new char[] { '4', ' ' };
        org.apache.commons.lang3.text.StrTokenizer strTokenizer25 = new org.apache.commons.lang3.text.StrTokenizer(charArray22, 'a', ' ');
        org.apache.commons.lang3.text.StrMatcher strMatcher26 = strTokenizer25.getTrimmerMatcher();
        org.apache.commons.lang3.text.StrTokenizer strTokenizer27 = new org.apache.commons.lang3.text.StrTokenizer(charArray2, strMatcher26);
        org.apache.commons.lang3.text.StrTokenizer strTokenizer29 = new org.apache.commons.lang3.text.StrTokenizer(charArray2, "");
        boolean boolean30 = strTokenizer29.hasNext();
        org.apache.commons.lang3.text.StrMatcher strMatcher31 = strTokenizer29.getIgnoredMatcher();
        java.lang.String[] strArray32 = strTokenizer29.getTokenArray();
        org.junit.Assert.assertNotNull(charArray2);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray2), "4 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray2), "4 ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray2), "[4,  ]");
        org.junit.Assert.assertNotNull(strTokenizer6);
        org.junit.Assert.assertNotNull(charArray11);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray11), "4 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray11), "4 ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray11), "[4,  ]");
        org.junit.Assert.assertNotNull(strMatcher15);
        org.junit.Assert.assertNotNull(strTokenizer17);
        org.junit.Assert.assertNotNull(strMatcher18);
        org.junit.Assert.assertNotNull(charArray22);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray22), "4 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray22), "4 ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray22), "[4,  ]");
        org.junit.Assert.assertNotNull(strMatcher26);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertNotNull(strMatcher31);
        org.junit.Assert.assertNotNull(strArray32);
    }

    @Test
    public void test1676() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1676");
        org.apache.commons.lang3.text.StrTokenizer strTokenizer3 = new org.apache.commons.lang3.text.StrTokenizer("", 'a', 'a');
        org.apache.commons.lang3.text.StrTokenizer strTokenizer5 = strTokenizer3.reset("StrTokenizer[4 ]");
        char[] charArray8 = new char[] { '4', ' ' };
        org.apache.commons.lang3.text.StrTokenizer strTokenizer11 = new org.apache.commons.lang3.text.StrTokenizer(charArray8, 'a', ' ');
        org.apache.commons.lang3.text.StrTokenizer strTokenizer12 = org.apache.commons.lang3.text.StrTokenizer.getCSVInstance(charArray8);
        org.apache.commons.lang3.text.StrMatcher strMatcher13 = null;
        org.apache.commons.lang3.text.StrTokenizer strTokenizer14 = new org.apache.commons.lang3.text.StrTokenizer(charArray8, strMatcher13);
        char[] charArray15 = null;
        org.apache.commons.lang3.text.StrTokenizer strTokenizer17 = new org.apache.commons.lang3.text.StrTokenizer(charArray15, "");
        org.apache.commons.lang3.text.StrMatcher strMatcher18 = strTokenizer17.getQuoteMatcher();
        char[] charArray22 = new char[] { '4', ' ' };
        org.apache.commons.lang3.text.StrTokenizer strTokenizer25 = new org.apache.commons.lang3.text.StrTokenizer(charArray22, 'a', ' ');
        org.apache.commons.lang3.text.StrMatcher strMatcher26 = strTokenizer25.getTrimmerMatcher();
        org.apache.commons.lang3.text.StrTokenizer strTokenizer28 = strTokenizer25.setDelimiterString("");
        org.apache.commons.lang3.text.StrMatcher strMatcher29 = strTokenizer28.getTrimmerMatcher();
        org.apache.commons.lang3.text.StrTokenizer strTokenizer30 = new org.apache.commons.lang3.text.StrTokenizer("", strMatcher29);
        char[] charArray33 = new char[] { '4', ' ' };
        org.apache.commons.lang3.text.StrTokenizer strTokenizer36 = new org.apache.commons.lang3.text.StrTokenizer(charArray33, 'a', ' ');
        org.apache.commons.lang3.text.StrMatcher strMatcher37 = strTokenizer36.getTrimmerMatcher();
        org.apache.commons.lang3.text.StrMatcher strMatcher38 = strTokenizer36.getQuoteMatcher();
        org.apache.commons.lang3.text.StrTokenizer strTokenizer39 = strTokenizer30.setDelimiterMatcher(strMatcher38);
        org.apache.commons.lang3.text.StrTokenizer strTokenizer40 = new org.apache.commons.lang3.text.StrTokenizer(charArray8, strMatcher18, strMatcher38);
        org.apache.commons.lang3.text.StrTokenizer strTokenizer41 = new org.apache.commons.lang3.text.StrTokenizer(charArray8);
        org.apache.commons.lang3.text.StrTokenizer strTokenizer43 = new org.apache.commons.lang3.text.StrTokenizer(charArray8, '4');
        char[] charArray45 = null;
        org.apache.commons.lang3.text.StrTokenizer strTokenizer47 = new org.apache.commons.lang3.text.StrTokenizer(charArray45, "");
        java.lang.String str48 = strTokenizer47.getContent();
        org.apache.commons.lang3.text.StrMatcher strMatcher49 = strTokenizer47.getDelimiterMatcher();
        org.apache.commons.lang3.text.StrTokenizer strTokenizer51 = org.apache.commons.lang3.text.StrTokenizer.getCSVInstance("");
        java.util.List<java.lang.String> strList52 = strTokenizer51.getTokenList();
        boolean boolean53 = strTokenizer51.hasPrevious();
        java.lang.String[] strArray54 = strTokenizer51.getTokenArray();
        char[] charArray57 = new char[] { '4', ' ' };
        org.apache.commons.lang3.text.StrTokenizer strTokenizer60 = new org.apache.commons.lang3.text.StrTokenizer(charArray57, 'a', ' ');
        org.apache.commons.lang3.text.StrTokenizer strTokenizer61 = org.apache.commons.lang3.text.StrTokenizer.getCSVInstance(charArray57);
        org.apache.commons.lang3.text.StrMatcher strMatcher62 = null;
        org.apache.commons.lang3.text.StrTokenizer strTokenizer63 = new org.apache.commons.lang3.text.StrTokenizer(charArray57, strMatcher62);
        char[] charArray66 = new char[] { '4', ' ' };
        org.apache.commons.lang3.text.StrTokenizer strTokenizer69 = new org.apache.commons.lang3.text.StrTokenizer(charArray66, 'a', ' ');
        org.apache.commons.lang3.text.StrMatcher strMatcher70 = strTokenizer69.getTrimmerMatcher();
        org.apache.commons.lang3.text.StrTokenizer strTokenizer72 = strTokenizer69.setDelimiterString("");
        org.apache.commons.lang3.text.StrMatcher strMatcher73 = strTokenizer72.getTrimmerMatcher();
        org.apache.commons.lang3.text.StrTokenizer strTokenizer74 = new org.apache.commons.lang3.text.StrTokenizer(charArray57, strMatcher73);
        org.apache.commons.lang3.text.StrTokenizer strTokenizer75 = strTokenizer51.setTrimmerMatcher(strMatcher73);
        org.apache.commons.lang3.text.StrTokenizer strTokenizer76 = new org.apache.commons.lang3.text.StrTokenizer("StrTokenizer[]", strMatcher49, strMatcher73);
        char[] charArray79 = new char[] { '4', ' ' };
        org.apache.commons.lang3.text.StrTokenizer strTokenizer82 = new org.apache.commons.lang3.text.StrTokenizer(charArray79, 'a', ' ');
        org.apache.commons.lang3.text.StrMatcher strMatcher83 = strTokenizer82.getTrimmerMatcher();
        org.apache.commons.lang3.text.StrTokenizer strTokenizer85 = strTokenizer82.setDelimiterString("");
        org.apache.commons.lang3.text.StrMatcher strMatcher86 = strTokenizer85.getTrimmerMatcher();
        org.apache.commons.lang3.text.StrMatcher strMatcher87 = strTokenizer85.getTrimmerMatcher();
        org.apache.commons.lang3.text.StrTokenizer strTokenizer88 = new org.apache.commons.lang3.text.StrTokenizer(charArray8, strMatcher49, strMatcher87);
        org.apache.commons.lang3.text.StrTokenizer strTokenizer89 = strTokenizer3.setTrimmerMatcher(strMatcher49);
        char[] charArray91 = new char[] { '#' };
        org.apache.commons.lang3.text.StrTokenizer strTokenizer92 = new org.apache.commons.lang3.text.StrTokenizer(charArray91);
        org.apache.commons.lang3.text.StrTokenizer strTokenizer94 = new org.apache.commons.lang3.text.StrTokenizer(charArray91, "4 ");
        org.apache.commons.lang3.text.StrTokenizer strTokenizer95 = new org.apache.commons.lang3.text.StrTokenizer(charArray91);
        org.apache.commons.lang3.text.StrTokenizer strTokenizer96 = strTokenizer3.reset(charArray91);
        // The following exception was thrown during execution in test generation
        try {
            strTokenizer3.set("StrTokenizer[StrTokenizer[4 ]]");
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: set() is unsupported");
        } catch (java.lang.UnsupportedOperationException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strTokenizer5);
        org.junit.Assert.assertNotNull(charArray8);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray8), "4 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray8), "4 ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray8), "[4,  ]");
        org.junit.Assert.assertNotNull(strTokenizer12);
        org.junit.Assert.assertNotNull(strMatcher18);
        org.junit.Assert.assertNotNull(charArray22);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray22), "4 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray22), "4 ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray22), "[4,  ]");
        org.junit.Assert.assertNotNull(strMatcher26);
        org.junit.Assert.assertNotNull(strTokenizer28);
        org.junit.Assert.assertNotNull(strMatcher29);
        org.junit.Assert.assertNotNull(charArray33);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray33), "4 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray33), "4 ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray33), "[4,  ]");
        org.junit.Assert.assertNotNull(strMatcher37);
        org.junit.Assert.assertNotNull(strMatcher38);
        org.junit.Assert.assertNotNull(strTokenizer39);
        org.junit.Assert.assertNull(str48);
        org.junit.Assert.assertNotNull(strMatcher49);
        org.junit.Assert.assertNotNull(strTokenizer51);
        org.junit.Assert.assertNotNull(strList52);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
        org.junit.Assert.assertNotNull(strArray54);
        org.junit.Assert.assertNotNull(charArray57);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray57), "4 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray57), "4 ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray57), "[4,  ]");
        org.junit.Assert.assertNotNull(strTokenizer61);
        org.junit.Assert.assertNotNull(charArray66);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray66), "4 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray66), "4 ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray66), "[4,  ]");
        org.junit.Assert.assertNotNull(strMatcher70);
        org.junit.Assert.assertNotNull(strTokenizer72);
        org.junit.Assert.assertNotNull(strMatcher73);
        org.junit.Assert.assertNotNull(strTokenizer75);
        org.junit.Assert.assertNotNull(charArray79);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray79), "4 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray79), "4 ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray79), "[4,  ]");
        org.junit.Assert.assertNotNull(strMatcher83);
        org.junit.Assert.assertNotNull(strTokenizer85);
        org.junit.Assert.assertNotNull(strMatcher86);
        org.junit.Assert.assertNotNull(strMatcher87);
        org.junit.Assert.assertNotNull(strTokenizer89);
        org.junit.Assert.assertNotNull(charArray91);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray91), "#");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray91), "#");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray91), "[#]");
        org.junit.Assert.assertNotNull(strTokenizer96);
    }

    @Test
    public void test1677() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1677");
        org.apache.commons.lang3.text.StrTokenizer strTokenizer2 = new org.apache.commons.lang3.text.StrTokenizer("hi!", "StrTokenizer[ ]");
    }

    @Test
    public void test1678() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1678");
        char[] charArray2 = new char[] { '4', ' ' };
        org.apache.commons.lang3.text.StrTokenizer strTokenizer5 = new org.apache.commons.lang3.text.StrTokenizer(charArray2, 'a', ' ');
        org.apache.commons.lang3.text.StrTokenizer strTokenizer6 = org.apache.commons.lang3.text.StrTokenizer.getCSVInstance(charArray2);
        org.apache.commons.lang3.text.StrMatcher strMatcher7 = null;
        org.apache.commons.lang3.text.StrTokenizer strTokenizer8 = new org.apache.commons.lang3.text.StrTokenizer(charArray2, strMatcher7);
        char[] charArray11 = new char[] { '4', ' ' };
        org.apache.commons.lang3.text.StrTokenizer strTokenizer14 = new org.apache.commons.lang3.text.StrTokenizer(charArray11, 'a', ' ');
        org.apache.commons.lang3.text.StrMatcher strMatcher15 = strTokenizer14.getTrimmerMatcher();
        org.apache.commons.lang3.text.StrTokenizer strTokenizer17 = strTokenizer14.setDelimiterString("");
        org.apache.commons.lang3.text.StrMatcher strMatcher18 = strTokenizer17.getTrimmerMatcher();
        org.apache.commons.lang3.text.StrTokenizer strTokenizer19 = new org.apache.commons.lang3.text.StrTokenizer(charArray2, strMatcher18);
        char[] charArray22 = new char[] { '4', ' ' };
        org.apache.commons.lang3.text.StrTokenizer strTokenizer25 = new org.apache.commons.lang3.text.StrTokenizer(charArray22, 'a', ' ');
        org.apache.commons.lang3.text.StrMatcher strMatcher26 = strTokenizer25.getTrimmerMatcher();
        org.apache.commons.lang3.text.StrTokenizer strTokenizer27 = new org.apache.commons.lang3.text.StrTokenizer(charArray2, strMatcher26);
        boolean boolean28 = strTokenizer27.hasPrevious();
        org.apache.commons.lang3.text.StrMatcher strMatcher29 = null;
        org.apache.commons.lang3.text.StrTokenizer strTokenizer30 = strTokenizer27.setQuoteMatcher(strMatcher29);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str31 = strTokenizer27.previous();
            org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException; message: null");
        } catch (java.util.NoSuchElementException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray2);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray2), "4 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray2), "4 ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray2), "[4,  ]");
        org.junit.Assert.assertNotNull(strTokenizer6);
        org.junit.Assert.assertNotNull(charArray11);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray11), "4 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray11), "4 ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray11), "[4,  ]");
        org.junit.Assert.assertNotNull(strMatcher15);
        org.junit.Assert.assertNotNull(strTokenizer17);
        org.junit.Assert.assertNotNull(strMatcher18);
        org.junit.Assert.assertNotNull(charArray22);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray22), "4 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray22), "4 ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray22), "[4,  ]");
        org.junit.Assert.assertNotNull(strMatcher26);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNotNull(strTokenizer30);
    }

    @Test
    public void test1679() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1679");
        char[] charArray2 = new char[] { '4', ' ' };
        org.apache.commons.lang3.text.StrTokenizer strTokenizer5 = new org.apache.commons.lang3.text.StrTokenizer(charArray2, 'a', ' ');
        org.apache.commons.lang3.text.StrMatcher strMatcher6 = strTokenizer5.getTrimmerMatcher();
        java.lang.String str7 = strTokenizer5.nextToken();
        char[] charArray10 = new char[] { '4', ' ' };
        org.apache.commons.lang3.text.StrTokenizer strTokenizer13 = new org.apache.commons.lang3.text.StrTokenizer(charArray10, 'a', ' ');
        org.apache.commons.lang3.text.StrMatcher strMatcher14 = strTokenizer13.getTrimmerMatcher();
        org.apache.commons.lang3.text.StrTokenizer strTokenizer16 = strTokenizer13.setDelimiterString("");
        org.apache.commons.lang3.text.StrMatcher strMatcher17 = strTokenizer16.getTrimmerMatcher();
        org.apache.commons.lang3.text.StrMatcher strMatcher18 = strTokenizer16.getTrimmerMatcher();
        char[] charArray21 = new char[] { '4', ' ' };
        org.apache.commons.lang3.text.StrTokenizer strTokenizer24 = new org.apache.commons.lang3.text.StrTokenizer(charArray21, 'a', ' ');
        org.apache.commons.lang3.text.StrTokenizer strTokenizer25 = strTokenizer16.reset(charArray21);
        org.apache.commons.lang3.text.StrTokenizer strTokenizer27 = new org.apache.commons.lang3.text.StrTokenizer(charArray21, "");
        org.apache.commons.lang3.text.StrTokenizer strTokenizer28 = strTokenizer5.reset(charArray21);
        org.apache.commons.lang3.text.StrTokenizer strTokenizer30 = strTokenizer28.setQuoteChar('#');
        char[] charArray34 = new char[] { '4', ' ' };
        org.apache.commons.lang3.text.StrTokenizer strTokenizer37 = new org.apache.commons.lang3.text.StrTokenizer(charArray34, 'a', ' ');
        org.apache.commons.lang3.text.StrMatcher strMatcher38 = strTokenizer37.getTrimmerMatcher();
        char[] charArray41 = new char[] { '4', ' ' };
        org.apache.commons.lang3.text.StrTokenizer strTokenizer44 = new org.apache.commons.lang3.text.StrTokenizer(charArray41, 'a', ' ');
        org.apache.commons.lang3.text.StrTokenizer strTokenizer45 = org.apache.commons.lang3.text.StrTokenizer.getCSVInstance(charArray41);
        org.apache.commons.lang3.text.StrMatcher strMatcher46 = null;
        org.apache.commons.lang3.text.StrTokenizer strTokenizer47 = new org.apache.commons.lang3.text.StrTokenizer(charArray41, strMatcher46);
        org.apache.commons.lang3.text.StrTokenizer strTokenizer48 = strTokenizer37.reset(charArray41);
        org.apache.commons.lang3.text.StrMatcher strMatcher49 = strTokenizer48.getIgnoredMatcher();
        org.apache.commons.lang3.text.StrTokenizer strTokenizer50 = new org.apache.commons.lang3.text.StrTokenizer("", strMatcher49);
        org.apache.commons.lang3.text.StrTokenizer strTokenizer51 = strTokenizer30.setIgnoredMatcher(strMatcher49);
        char[] charArray54 = new char[] { '4', ' ' };
        org.apache.commons.lang3.text.StrTokenizer strTokenizer57 = new org.apache.commons.lang3.text.StrTokenizer(charArray54, 'a', ' ');
        org.apache.commons.lang3.text.StrMatcher strMatcher58 = strTokenizer57.getTrimmerMatcher();
        org.apache.commons.lang3.text.StrTokenizer strTokenizer60 = strTokenizer57.setDelimiterString("");
        char[] charArray64 = new char[] { '4', ' ' };
        org.apache.commons.lang3.text.StrTokenizer strTokenizer67 = new org.apache.commons.lang3.text.StrTokenizer(charArray64, 'a', ' ');
        org.apache.commons.lang3.text.StrMatcher strMatcher68 = strTokenizer67.getTrimmerMatcher();
        org.apache.commons.lang3.text.StrTokenizer strTokenizer70 = strTokenizer67.setDelimiterString("");
        org.apache.commons.lang3.text.StrMatcher strMatcher71 = strTokenizer70.getTrimmerMatcher();
        org.apache.commons.lang3.text.StrTokenizer strTokenizer72 = new org.apache.commons.lang3.text.StrTokenizer("", strMatcher71);
        char[] charArray75 = new char[] { '4', ' ' };
        org.apache.commons.lang3.text.StrTokenizer strTokenizer78 = new org.apache.commons.lang3.text.StrTokenizer(charArray75, 'a', ' ');
        org.apache.commons.lang3.text.StrMatcher strMatcher79 = strTokenizer78.getTrimmerMatcher();
        org.apache.commons.lang3.text.StrTokenizer strTokenizer81 = strTokenizer78.setDelimiterString("");
        org.apache.commons.lang3.text.StrMatcher strMatcher82 = strTokenizer81.getTrimmerMatcher();
        org.apache.commons.lang3.text.StrTokenizer strTokenizer83 = strTokenizer72.setTrimmerMatcher(strMatcher82);
        org.apache.commons.lang3.text.StrTokenizer strTokenizer84 = strTokenizer60.setTrimmerMatcher(strMatcher82);
        org.apache.commons.lang3.text.StrTokenizer strTokenizer85 = strTokenizer51.setQuoteMatcher(strMatcher82);
        boolean boolean86 = strTokenizer85.isIgnoreEmptyTokens();
        org.apache.commons.lang3.text.StrTokenizer strTokenizer88 = strTokenizer85.setIgnoreEmptyTokens(true);
        org.junit.Assert.assertNotNull(charArray2);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray2), "4 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray2), "4 ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray2), "[4,  ]");
        org.junit.Assert.assertNotNull(strMatcher6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "4 " + "'", str7, "4 ");
        org.junit.Assert.assertNotNull(charArray10);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray10), "4 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray10), "4 ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray10), "[4,  ]");
        org.junit.Assert.assertNotNull(strMatcher14);
        org.junit.Assert.assertNotNull(strTokenizer16);
        org.junit.Assert.assertNotNull(strMatcher17);
        org.junit.Assert.assertNotNull(strMatcher18);
        org.junit.Assert.assertNotNull(charArray21);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray21), "4 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray21), "4 ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray21), "[4,  ]");
        org.junit.Assert.assertNotNull(strTokenizer25);
        org.junit.Assert.assertNotNull(strTokenizer28);
        org.junit.Assert.assertNotNull(strTokenizer30);
        org.junit.Assert.assertNotNull(charArray34);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray34), "4 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray34), "4 ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray34), "[4,  ]");
        org.junit.Assert.assertNotNull(strMatcher38);
        org.junit.Assert.assertNotNull(charArray41);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray41), "4 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray41), "4 ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray41), "[4,  ]");
        org.junit.Assert.assertNotNull(strTokenizer45);
        org.junit.Assert.assertNotNull(strTokenizer48);
        org.junit.Assert.assertNotNull(strMatcher49);
        org.junit.Assert.assertNotNull(strTokenizer51);
        org.junit.Assert.assertNotNull(charArray54);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray54), "4 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray54), "4 ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray54), "[4,  ]");
        org.junit.Assert.assertNotNull(strMatcher58);
        org.junit.Assert.assertNotNull(strTokenizer60);
        org.junit.Assert.assertNotNull(charArray64);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray64), "4 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray64), "4 ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray64), "[4,  ]");
        org.junit.Assert.assertNotNull(strMatcher68);
        org.junit.Assert.assertNotNull(strTokenizer70);
        org.junit.Assert.assertNotNull(strMatcher71);
        org.junit.Assert.assertNotNull(charArray75);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray75), "4 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray75), "4 ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray75), "[4,  ]");
        org.junit.Assert.assertNotNull(strMatcher79);
        org.junit.Assert.assertNotNull(strTokenizer81);
        org.junit.Assert.assertNotNull(strMatcher82);
        org.junit.Assert.assertNotNull(strTokenizer83);
        org.junit.Assert.assertNotNull(strTokenizer84);
        org.junit.Assert.assertNotNull(strTokenizer85);
        org.junit.Assert.assertTrue("'" + boolean86 + "' != '" + true + "'", boolean86 == true);
        org.junit.Assert.assertNotNull(strTokenizer88);
    }

    @Test
    public void test1680() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1680");
        char[] charArray2 = new char[] { 'a', '#' };
        org.apache.commons.lang3.text.StrTokenizer strTokenizer3 = org.apache.commons.lang3.text.StrTokenizer.getCSVInstance(charArray2);
        org.apache.commons.lang3.text.StrMatcher strMatcher4 = strTokenizer3.getIgnoredMatcher();
        char[] charArray7 = new char[] { '4', ' ' };
        org.apache.commons.lang3.text.StrTokenizer strTokenizer10 = new org.apache.commons.lang3.text.StrTokenizer(charArray7, 'a', ' ');
        org.apache.commons.lang3.text.StrMatcher strMatcher11 = strTokenizer10.getTrimmerMatcher();
        char[] charArray14 = new char[] { '4', ' ' };
        org.apache.commons.lang3.text.StrTokenizer strTokenizer17 = new org.apache.commons.lang3.text.StrTokenizer(charArray14, 'a', ' ');
        org.apache.commons.lang3.text.StrTokenizer strTokenizer18 = org.apache.commons.lang3.text.StrTokenizer.getCSVInstance(charArray14);
        org.apache.commons.lang3.text.StrMatcher strMatcher19 = null;
        org.apache.commons.lang3.text.StrTokenizer strTokenizer20 = new org.apache.commons.lang3.text.StrTokenizer(charArray14, strMatcher19);
        org.apache.commons.lang3.text.StrTokenizer strTokenizer21 = strTokenizer10.reset(charArray14);
        org.apache.commons.lang3.text.StrTokenizer strTokenizer22 = org.apache.commons.lang3.text.StrTokenizer.getCSVInstance(charArray14);
        char[] charArray25 = new char[] { '4', ' ' };
        org.apache.commons.lang3.text.StrTokenizer strTokenizer28 = new org.apache.commons.lang3.text.StrTokenizer(charArray25, 'a', ' ');
        org.apache.commons.lang3.text.StrMatcher strMatcher29 = strTokenizer28.getTrimmerMatcher();
        org.apache.commons.lang3.text.StrTokenizer strTokenizer31 = strTokenizer28.setDelimiterString("");
        char[] charArray35 = new char[] { '4', ' ' };
        org.apache.commons.lang3.text.StrTokenizer strTokenizer38 = new org.apache.commons.lang3.text.StrTokenizer(charArray35, 'a', ' ');
        org.apache.commons.lang3.text.StrMatcher strMatcher39 = strTokenizer38.getTrimmerMatcher();
        org.apache.commons.lang3.text.StrTokenizer strTokenizer41 = strTokenizer38.setDelimiterString("");
        org.apache.commons.lang3.text.StrMatcher strMatcher42 = strTokenizer41.getTrimmerMatcher();
        org.apache.commons.lang3.text.StrTokenizer strTokenizer43 = new org.apache.commons.lang3.text.StrTokenizer("", strMatcher42);
        char[] charArray46 = new char[] { '4', ' ' };
        org.apache.commons.lang3.text.StrTokenizer strTokenizer49 = new org.apache.commons.lang3.text.StrTokenizer(charArray46, 'a', ' ');
        org.apache.commons.lang3.text.StrMatcher strMatcher50 = strTokenizer49.getTrimmerMatcher();
        org.apache.commons.lang3.text.StrTokenizer strTokenizer52 = strTokenizer49.setDelimiterString("");
        org.apache.commons.lang3.text.StrMatcher strMatcher53 = strTokenizer52.getTrimmerMatcher();
        org.apache.commons.lang3.text.StrTokenizer strTokenizer54 = strTokenizer43.setTrimmerMatcher(strMatcher53);
        org.apache.commons.lang3.text.StrTokenizer strTokenizer55 = strTokenizer31.setTrimmerMatcher(strMatcher53);
        org.apache.commons.lang3.text.StrMatcher strMatcher56 = strTokenizer31.getDelimiterMatcher();
        char[] charArray59 = new char[] { '4', ' ' };
        org.apache.commons.lang3.text.StrTokenizer strTokenizer62 = new org.apache.commons.lang3.text.StrTokenizer(charArray59, 'a', ' ');
        org.apache.commons.lang3.text.StrMatcher strMatcher63 = strTokenizer62.getTrimmerMatcher();
        org.apache.commons.lang3.text.StrTokenizer strTokenizer65 = strTokenizer62.setDelimiterString("");
        org.apache.commons.lang3.text.StrMatcher strMatcher66 = strTokenizer65.getTrimmerMatcher();
        org.apache.commons.lang3.text.StrTokenizer strTokenizer67 = new org.apache.commons.lang3.text.StrTokenizer(charArray14, strMatcher56, strMatcher66);
        org.apache.commons.lang3.text.StrTokenizer strTokenizer68 = strTokenizer3.setTrimmerMatcher(strMatcher56);
        org.apache.commons.lang3.text.StrTokenizer strTokenizer70 = strTokenizer68.setIgnoredChar(' ');
        char[] charArray76 = new char[] { '#', ' ', ' ', 'a', '#' };
        org.apache.commons.lang3.text.StrTokenizer strTokenizer79 = new org.apache.commons.lang3.text.StrTokenizer(charArray76, '#', ' ');
        org.apache.commons.lang3.text.StrTokenizer strTokenizer81 = new org.apache.commons.lang3.text.StrTokenizer(charArray76, "StrTokenizer[]");
        org.apache.commons.lang3.text.StrTokenizer strTokenizer83 = new org.apache.commons.lang3.text.StrTokenizer(charArray76, "StrTokenizer[]");
        org.apache.commons.lang3.text.StrTokenizer strTokenizer84 = strTokenizer70.reset(charArray76);
        org.apache.commons.lang3.text.StrTokenizer strTokenizer87 = new org.apache.commons.lang3.text.StrTokenizer(charArray76, 'a', '#');
        org.junit.Assert.assertNotNull(charArray2);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray2), "a#");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray2), "a#");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray2), "[a, #]");
        org.junit.Assert.assertNotNull(strTokenizer3);
        org.junit.Assert.assertNotNull(strMatcher4);
        org.junit.Assert.assertNotNull(charArray7);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray7), "4 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray7), "4 ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray7), "[4,  ]");
        org.junit.Assert.assertNotNull(strMatcher11);
        org.junit.Assert.assertNotNull(charArray14);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray14), "4 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray14), "4 ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray14), "[4,  ]");
        org.junit.Assert.assertNotNull(strTokenizer18);
        org.junit.Assert.assertNotNull(strTokenizer21);
        org.junit.Assert.assertNotNull(strTokenizer22);
        org.junit.Assert.assertNotNull(charArray25);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray25), "4 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray25), "4 ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray25), "[4,  ]");
        org.junit.Assert.assertNotNull(strMatcher29);
        org.junit.Assert.assertNotNull(strTokenizer31);
        org.junit.Assert.assertNotNull(charArray35);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray35), "4 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray35), "4 ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray35), "[4,  ]");
        org.junit.Assert.assertNotNull(strMatcher39);
        org.junit.Assert.assertNotNull(strTokenizer41);
        org.junit.Assert.assertNotNull(strMatcher42);
        org.junit.Assert.assertNotNull(charArray46);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray46), "4 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray46), "4 ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray46), "[4,  ]");
        org.junit.Assert.assertNotNull(strMatcher50);
        org.junit.Assert.assertNotNull(strTokenizer52);
        org.junit.Assert.assertNotNull(strMatcher53);
        org.junit.Assert.assertNotNull(strTokenizer54);
        org.junit.Assert.assertNotNull(strTokenizer55);
        org.junit.Assert.assertNotNull(strMatcher56);
        org.junit.Assert.assertNotNull(charArray59);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray59), "4 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray59), "4 ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray59), "[4,  ]");
        org.junit.Assert.assertNotNull(strMatcher63);
        org.junit.Assert.assertNotNull(strTokenizer65);
        org.junit.Assert.assertNotNull(strMatcher66);
        org.junit.Assert.assertNotNull(strTokenizer68);
        org.junit.Assert.assertNotNull(strTokenizer70);
        org.junit.Assert.assertNotNull(charArray76);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray76), "#  a#");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray76), "#  a#");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray76), "[#,  ,  , a, #]");
        org.junit.Assert.assertNotNull(strTokenizer84);
    }

    @Test
    public void test1681() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1681");
        char[] charArray2 = new char[] { '4', ' ' };
        org.apache.commons.lang3.text.StrTokenizer strTokenizer5 = new org.apache.commons.lang3.text.StrTokenizer(charArray2, 'a', ' ');
        org.apache.commons.lang3.text.StrMatcher strMatcher6 = strTokenizer5.getTrimmerMatcher();
        org.apache.commons.lang3.text.StrTokenizer strTokenizer8 = strTokenizer5.setDelimiterString("");
        char[] charArray12 = new char[] { '4', ' ' };
        org.apache.commons.lang3.text.StrTokenizer strTokenizer15 = new org.apache.commons.lang3.text.StrTokenizer(charArray12, 'a', ' ');
        org.apache.commons.lang3.text.StrMatcher strMatcher16 = strTokenizer15.getTrimmerMatcher();
        org.apache.commons.lang3.text.StrTokenizer strTokenizer18 = strTokenizer15.setDelimiterString("");
        org.apache.commons.lang3.text.StrMatcher strMatcher19 = strTokenizer18.getTrimmerMatcher();
        org.apache.commons.lang3.text.StrTokenizer strTokenizer20 = new org.apache.commons.lang3.text.StrTokenizer("", strMatcher19);
        char[] charArray23 = new char[] { '4', ' ' };
        org.apache.commons.lang3.text.StrTokenizer strTokenizer26 = new org.apache.commons.lang3.text.StrTokenizer(charArray23, 'a', ' ');
        org.apache.commons.lang3.text.StrMatcher strMatcher27 = strTokenizer26.getTrimmerMatcher();
        org.apache.commons.lang3.text.StrTokenizer strTokenizer29 = strTokenizer26.setDelimiterString("");
        org.apache.commons.lang3.text.StrMatcher strMatcher30 = strTokenizer29.getTrimmerMatcher();
        org.apache.commons.lang3.text.StrTokenizer strTokenizer31 = strTokenizer20.setTrimmerMatcher(strMatcher30);
        org.apache.commons.lang3.text.StrTokenizer strTokenizer32 = strTokenizer8.setTrimmerMatcher(strMatcher30);
        java.lang.String str33 = strTokenizer8.getContent();
        char[] charArray36 = new char[] { '4', ' ' };
        org.apache.commons.lang3.text.StrTokenizer strTokenizer39 = new org.apache.commons.lang3.text.StrTokenizer(charArray36, 'a', ' ');
        org.apache.commons.lang3.text.StrTokenizer strTokenizer42 = new org.apache.commons.lang3.text.StrTokenizer(charArray36, '4', 'a');
        char[] charArray45 = new char[] { '4', ' ' };
        org.apache.commons.lang3.text.StrTokenizer strTokenizer48 = new org.apache.commons.lang3.text.StrTokenizer(charArray45, 'a', ' ');
        org.apache.commons.lang3.text.StrMatcher strMatcher49 = strTokenizer48.getTrimmerMatcher();
        org.apache.commons.lang3.text.StrMatcher strMatcher50 = strTokenizer48.getQuoteMatcher();
        org.apache.commons.lang3.text.StrTokenizer strTokenizer51 = new org.apache.commons.lang3.text.StrTokenizer(charArray36, strMatcher50);
        org.apache.commons.lang3.text.StrTokenizer strTokenizer52 = strTokenizer8.reset(charArray36);
        org.apache.commons.lang3.text.StrTokenizer strTokenizer55 = new org.apache.commons.lang3.text.StrTokenizer(charArray36, 'a', 'a');
        org.apache.commons.lang3.text.StrTokenizer strTokenizer57 = new org.apache.commons.lang3.text.StrTokenizer(charArray36, "StrTokenizer[not tokenized yet]");
        org.apache.commons.lang3.text.StrTokenizer strTokenizer59 = new org.apache.commons.lang3.text.StrTokenizer(charArray36, ' ');
        org.junit.Assert.assertNotNull(charArray2);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray2), "4 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray2), "4 ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray2), "[4,  ]");
        org.junit.Assert.assertNotNull(strMatcher6);
        org.junit.Assert.assertNotNull(strTokenizer8);
        org.junit.Assert.assertNotNull(charArray12);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray12), "4 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray12), "4 ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray12), "[4,  ]");
        org.junit.Assert.assertNotNull(strMatcher16);
        org.junit.Assert.assertNotNull(strTokenizer18);
        org.junit.Assert.assertNotNull(strMatcher19);
        org.junit.Assert.assertNotNull(charArray23);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray23), "4 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray23), "4 ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray23), "[4,  ]");
        org.junit.Assert.assertNotNull(strMatcher27);
        org.junit.Assert.assertNotNull(strTokenizer29);
        org.junit.Assert.assertNotNull(strMatcher30);
        org.junit.Assert.assertNotNull(strTokenizer31);
        org.junit.Assert.assertNotNull(strTokenizer32);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "4 " + "'", str33, "4 ");
        org.junit.Assert.assertNotNull(charArray36);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray36), "4 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray36), "4 ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray36), "[4,  ]");
        org.junit.Assert.assertNotNull(charArray45);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray45), "4 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray45), "4 ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray45), "[4,  ]");
        org.junit.Assert.assertNotNull(strMatcher49);
        org.junit.Assert.assertNotNull(strMatcher50);
        org.junit.Assert.assertNotNull(strTokenizer52);
    }

    @Test
    public void test1682() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1682");
        char[] charArray3 = new char[] { '4', ' ' };
        org.apache.commons.lang3.text.StrTokenizer strTokenizer6 = new org.apache.commons.lang3.text.StrTokenizer(charArray3, 'a', ' ');
        org.apache.commons.lang3.text.StrTokenizer strTokenizer7 = org.apache.commons.lang3.text.StrTokenizer.getCSVInstance(charArray3);
        org.apache.commons.lang3.text.StrTokenizer strTokenizer8 = org.apache.commons.lang3.text.StrTokenizer.getCSVInstance(charArray3);
        org.apache.commons.lang3.text.StrTokenizer strTokenizer9 = new org.apache.commons.lang3.text.StrTokenizer(charArray3);
        org.apache.commons.lang3.text.StrTokenizer strTokenizer11 = new org.apache.commons.lang3.text.StrTokenizer(charArray3, '#');
        org.apache.commons.lang3.text.StrTokenizer strTokenizer12 = org.apache.commons.lang3.text.StrTokenizer.getTSVInstance(charArray3);
        char[] charArray15 = new char[] { '4', ' ' };
        org.apache.commons.lang3.text.StrTokenizer strTokenizer18 = new org.apache.commons.lang3.text.StrTokenizer(charArray15, 'a', ' ');
        org.apache.commons.lang3.text.StrTokenizer strTokenizer20 = new org.apache.commons.lang3.text.StrTokenizer(charArray15, "hi!");
        char[] charArray23 = new char[] { '4', ' ' };
        org.apache.commons.lang3.text.StrTokenizer strTokenizer26 = new org.apache.commons.lang3.text.StrTokenizer(charArray23, 'a', ' ');
        org.apache.commons.lang3.text.StrTokenizer strTokenizer27 = org.apache.commons.lang3.text.StrTokenizer.getCSVInstance(charArray23);
        org.apache.commons.lang3.text.StrMatcher strMatcher28 = null;
        org.apache.commons.lang3.text.StrTokenizer strTokenizer29 = new org.apache.commons.lang3.text.StrTokenizer(charArray23, strMatcher28);
        char[] charArray30 = null;
        org.apache.commons.lang3.text.StrTokenizer strTokenizer32 = new org.apache.commons.lang3.text.StrTokenizer(charArray30, "");
        org.apache.commons.lang3.text.StrMatcher strMatcher33 = strTokenizer32.getQuoteMatcher();
        char[] charArray37 = new char[] { '4', ' ' };
        org.apache.commons.lang3.text.StrTokenizer strTokenizer40 = new org.apache.commons.lang3.text.StrTokenizer(charArray37, 'a', ' ');
        org.apache.commons.lang3.text.StrMatcher strMatcher41 = strTokenizer40.getTrimmerMatcher();
        org.apache.commons.lang3.text.StrTokenizer strTokenizer43 = strTokenizer40.setDelimiterString("");
        org.apache.commons.lang3.text.StrMatcher strMatcher44 = strTokenizer43.getTrimmerMatcher();
        org.apache.commons.lang3.text.StrTokenizer strTokenizer45 = new org.apache.commons.lang3.text.StrTokenizer("", strMatcher44);
        char[] charArray48 = new char[] { '4', ' ' };
        org.apache.commons.lang3.text.StrTokenizer strTokenizer51 = new org.apache.commons.lang3.text.StrTokenizer(charArray48, 'a', ' ');
        org.apache.commons.lang3.text.StrMatcher strMatcher52 = strTokenizer51.getTrimmerMatcher();
        org.apache.commons.lang3.text.StrMatcher strMatcher53 = strTokenizer51.getQuoteMatcher();
        org.apache.commons.lang3.text.StrTokenizer strTokenizer54 = strTokenizer45.setDelimiterMatcher(strMatcher53);
        org.apache.commons.lang3.text.StrTokenizer strTokenizer55 = new org.apache.commons.lang3.text.StrTokenizer(charArray23, strMatcher33, strMatcher53);
        char[] charArray56 = null;
        org.apache.commons.lang3.text.StrTokenizer strTokenizer58 = new org.apache.commons.lang3.text.StrTokenizer(charArray56, "");
        java.lang.String str59 = strTokenizer58.getContent();
        org.apache.commons.lang3.text.StrMatcher strMatcher60 = strTokenizer58.getIgnoredMatcher();
        org.apache.commons.lang3.text.StrTokenizer strTokenizer61 = new org.apache.commons.lang3.text.StrTokenizer(charArray15, strMatcher33, strMatcher60);
        char[] charArray64 = new char[] { '4', ' ' };
        org.apache.commons.lang3.text.StrTokenizer strTokenizer67 = new org.apache.commons.lang3.text.StrTokenizer(charArray64, 'a', ' ');
        org.apache.commons.lang3.text.StrMatcher strMatcher68 = strTokenizer67.getTrimmerMatcher();
        org.apache.commons.lang3.text.StrTokenizer strTokenizer69 = new org.apache.commons.lang3.text.StrTokenizer(charArray3, strMatcher33, strMatcher68);
        org.apache.commons.lang3.text.StrTokenizer strTokenizer70 = new org.apache.commons.lang3.text.StrTokenizer("StrTokenizer[4 ]", strMatcher33);
        // The following exception was thrown during execution in test generation
        try {
            strTokenizer70.add("StrTokenizer[4 ]");
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: add() is unsupported");
        } catch (java.lang.UnsupportedOperationException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray3), "4 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray3), "4 ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray3), "[4,  ]");
        org.junit.Assert.assertNotNull(strTokenizer7);
        org.junit.Assert.assertNotNull(strTokenizer8);
        org.junit.Assert.assertNotNull(strTokenizer12);
        org.junit.Assert.assertNotNull(charArray15);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray15), "4 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray15), "4 ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray15), "[4,  ]");
        org.junit.Assert.assertNotNull(charArray23);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray23), "4 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray23), "4 ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray23), "[4,  ]");
        org.junit.Assert.assertNotNull(strTokenizer27);
        org.junit.Assert.assertNotNull(strMatcher33);
        org.junit.Assert.assertNotNull(charArray37);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray37), "4 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray37), "4 ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray37), "[4,  ]");
        org.junit.Assert.assertNotNull(strMatcher41);
        org.junit.Assert.assertNotNull(strTokenizer43);
        org.junit.Assert.assertNotNull(strMatcher44);
        org.junit.Assert.assertNotNull(charArray48);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray48), "4 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray48), "4 ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray48), "[4,  ]");
        org.junit.Assert.assertNotNull(strMatcher52);
        org.junit.Assert.assertNotNull(strMatcher53);
        org.junit.Assert.assertNotNull(strTokenizer54);
        org.junit.Assert.assertNull(str59);
        org.junit.Assert.assertNotNull(strMatcher60);
        org.junit.Assert.assertNotNull(charArray64);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray64), "4 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray64), "4 ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray64), "[4,  ]");
        org.junit.Assert.assertNotNull(strMatcher68);
    }

    @Test
    public void test1683() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1683");
        char[] charArray2 = new char[] { '4', ' ' };
        org.apache.commons.lang3.text.StrTokenizer strTokenizer5 = new org.apache.commons.lang3.text.StrTokenizer(charArray2, 'a', ' ');
        org.apache.commons.lang3.text.StrTokenizer strTokenizer6 = org.apache.commons.lang3.text.StrTokenizer.getCSVInstance(charArray2);
        org.apache.commons.lang3.text.StrMatcher strMatcher7 = null;
        org.apache.commons.lang3.text.StrTokenizer strTokenizer8 = new org.apache.commons.lang3.text.StrTokenizer(charArray2, strMatcher7);
        org.apache.commons.lang3.text.StrTokenizer strTokenizer11 = new org.apache.commons.lang3.text.StrTokenizer(charArray2, ' ', '#');
        char[] charArray15 = new char[] { '4', ' ' };
        org.apache.commons.lang3.text.StrTokenizer strTokenizer18 = new org.apache.commons.lang3.text.StrTokenizer(charArray15, 'a', ' ');
        org.apache.commons.lang3.text.StrMatcher strMatcher19 = strTokenizer18.getTrimmerMatcher();
        org.apache.commons.lang3.text.StrTokenizer strTokenizer21 = strTokenizer18.setDelimiterString("");
        org.apache.commons.lang3.text.StrMatcher strMatcher22 = strTokenizer21.getTrimmerMatcher();
        org.apache.commons.lang3.text.StrTokenizer strTokenizer23 = new org.apache.commons.lang3.text.StrTokenizer("", strMatcher22);
        char[] charArray26 = new char[] { '4', ' ' };
        org.apache.commons.lang3.text.StrTokenizer strTokenizer29 = new org.apache.commons.lang3.text.StrTokenizer(charArray26, 'a', ' ');
        org.apache.commons.lang3.text.StrMatcher strMatcher30 = strTokenizer29.getTrimmerMatcher();
        org.apache.commons.lang3.text.StrTokenizer strTokenizer32 = strTokenizer29.setDelimiterString("");
        org.apache.commons.lang3.text.StrMatcher strMatcher33 = strTokenizer32.getTrimmerMatcher();
        org.apache.commons.lang3.text.StrTokenizer strTokenizer34 = strTokenizer23.setTrimmerMatcher(strMatcher33);
        org.apache.commons.lang3.text.StrTokenizer strTokenizer35 = new org.apache.commons.lang3.text.StrTokenizer(charArray2, strMatcher33);
        java.lang.String str36 = strTokenizer35.next();
        java.lang.String str37 = strTokenizer35.previous();
        java.lang.String str38 = strTokenizer35.previousToken();
        char[] charArray41 = new char[] { '4', ' ' };
        org.apache.commons.lang3.text.StrTokenizer strTokenizer44 = new org.apache.commons.lang3.text.StrTokenizer(charArray41, 'a', ' ');
        org.apache.commons.lang3.text.StrTokenizer strTokenizer47 = new org.apache.commons.lang3.text.StrTokenizer(charArray41, '4', 'a');
        char[] charArray50 = new char[] { '4', ' ' };
        org.apache.commons.lang3.text.StrTokenizer strTokenizer53 = new org.apache.commons.lang3.text.StrTokenizer(charArray50, 'a', ' ');
        org.apache.commons.lang3.text.StrMatcher strMatcher54 = strTokenizer53.getTrimmerMatcher();
        org.apache.commons.lang3.text.StrMatcher strMatcher55 = strTokenizer53.getQuoteMatcher();
        org.apache.commons.lang3.text.StrTokenizer strTokenizer56 = new org.apache.commons.lang3.text.StrTokenizer(charArray41, strMatcher55);
        org.apache.commons.lang3.text.StrTokenizer strTokenizer58 = new org.apache.commons.lang3.text.StrTokenizer(charArray41, "");
        org.apache.commons.lang3.text.StrTokenizer strTokenizer61 = new org.apache.commons.lang3.text.StrTokenizer(charArray41, ' ', 'a');
        org.apache.commons.lang3.text.StrTokenizer strTokenizer62 = strTokenizer35.reset(charArray41);
        char[] charArray64 = null;
        org.apache.commons.lang3.text.StrTokenizer strTokenizer66 = new org.apache.commons.lang3.text.StrTokenizer(charArray64, "");
        java.lang.String str67 = strTokenizer66.getContent();
        org.apache.commons.lang3.text.StrMatcher strMatcher68 = strTokenizer66.getDelimiterMatcher();
        org.apache.commons.lang3.text.StrTokenizer strTokenizer69 = new org.apache.commons.lang3.text.StrTokenizer(" ", strMatcher68);
        org.apache.commons.lang3.text.StrTokenizer strTokenizer70 = new org.apache.commons.lang3.text.StrTokenizer(charArray41, strMatcher68);
        java.lang.String str71 = strTokenizer70.previousToken();
        org.junit.Assert.assertNotNull(charArray2);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray2), "4 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray2), "4 ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray2), "[4,  ]");
        org.junit.Assert.assertNotNull(strTokenizer6);
        org.junit.Assert.assertNotNull(charArray15);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray15), "4 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray15), "4 ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray15), "[4,  ]");
        org.junit.Assert.assertNotNull(strMatcher19);
        org.junit.Assert.assertNotNull(strTokenizer21);
        org.junit.Assert.assertNotNull(strMatcher22);
        org.junit.Assert.assertNotNull(charArray26);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray26), "4 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray26), "4 ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray26), "[4,  ]");
        org.junit.Assert.assertNotNull(strMatcher30);
        org.junit.Assert.assertNotNull(strTokenizer32);
        org.junit.Assert.assertNotNull(strMatcher33);
        org.junit.Assert.assertNotNull(strTokenizer34);
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "4 " + "'", str36, "4 ");
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "4 " + "'", str37, "4 ");
        org.junit.Assert.assertNull(str38);
        org.junit.Assert.assertNotNull(charArray41);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray41), "4 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray41), "4 ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray41), "[4,  ]");
        org.junit.Assert.assertNotNull(charArray50);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray50), "4 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray50), "4 ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray50), "[4,  ]");
        org.junit.Assert.assertNotNull(strMatcher54);
        org.junit.Assert.assertNotNull(strMatcher55);
        org.junit.Assert.assertNotNull(strTokenizer62);
        org.junit.Assert.assertNull(str67);
        org.junit.Assert.assertNotNull(strMatcher68);
        org.junit.Assert.assertNull(str71);
    }

    @Test
    public void test1684() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1684");
        org.apache.commons.lang3.text.StrTokenizer strTokenizer1 = org.apache.commons.lang3.text.StrTokenizer.getTSVInstance("");
        org.apache.commons.lang3.text.StrTokenizer strTokenizer3 = org.apache.commons.lang3.text.StrTokenizer.getCSVInstance("hi!");
        char[] charArray6 = new char[] { 'a', '#' };
        org.apache.commons.lang3.text.StrTokenizer strTokenizer7 = org.apache.commons.lang3.text.StrTokenizer.getCSVInstance(charArray6);
        org.apache.commons.lang3.text.StrTokenizer strTokenizer8 = strTokenizer3.reset(charArray6);
        org.apache.commons.lang3.text.StrTokenizer strTokenizer9 = org.apache.commons.lang3.text.StrTokenizer.getTSVInstance(charArray6);
        org.apache.commons.lang3.text.StrTokenizer strTokenizer10 = strTokenizer1.reset(charArray6);
        boolean boolean11 = strTokenizer10.isEmptyTokenAsNull();
        org.apache.commons.lang3.text.StrMatcher strMatcher12 = null;
        org.apache.commons.lang3.text.StrTokenizer strTokenizer13 = strTokenizer10.setIgnoredMatcher(strMatcher12);
        java.lang.String str14 = strTokenizer10.toString();
        java.lang.String str15 = strTokenizer10.nextToken();
        org.junit.Assert.assertNotNull(strTokenizer1);
        org.junit.Assert.assertNotNull(strTokenizer3);
        org.junit.Assert.assertNotNull(charArray6);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray6), "a#");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray6), "a#");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray6), "[a, #]");
        org.junit.Assert.assertNotNull(strTokenizer7);
        org.junit.Assert.assertNotNull(strTokenizer8);
        org.junit.Assert.assertNotNull(strTokenizer9);
        org.junit.Assert.assertNotNull(strTokenizer10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(strTokenizer13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "StrTokenizer[not tokenized yet]" + "'", str14, "StrTokenizer[not tokenized yet]");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "a#" + "'", str15, "a#");
    }

    @Test
    public void test1685() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1685");
        char[] charArray2 = new char[] { '4', ' ' };
        org.apache.commons.lang3.text.StrTokenizer strTokenizer5 = new org.apache.commons.lang3.text.StrTokenizer(charArray2, 'a', ' ');
        org.apache.commons.lang3.text.StrTokenizer strTokenizer8 = new org.apache.commons.lang3.text.StrTokenizer(charArray2, '4', 'a');
        org.apache.commons.lang3.text.StrTokenizer strTokenizer10 = strTokenizer8.setIgnoreEmptyTokens(true);
        org.apache.commons.lang3.text.StrMatcher strMatcher11 = strTokenizer8.getIgnoredMatcher();
        java.lang.Object obj12 = strTokenizer8.clone();
        char[] charArray15 = new char[] { '4', ' ' };
        org.apache.commons.lang3.text.StrTokenizer strTokenizer18 = new org.apache.commons.lang3.text.StrTokenizer(charArray15, 'a', ' ');
        org.apache.commons.lang3.text.StrMatcher strMatcher19 = strTokenizer18.getTrimmerMatcher();
        org.apache.commons.lang3.text.StrTokenizer strTokenizer21 = strTokenizer18.setDelimiterString("");
        char[] charArray24 = new char[] { '4', ' ' };
        org.apache.commons.lang3.text.StrTokenizer strTokenizer27 = new org.apache.commons.lang3.text.StrTokenizer(charArray24, 'a', ' ');
        org.apache.commons.lang3.text.StrTokenizer strTokenizer28 = org.apache.commons.lang3.text.StrTokenizer.getTSVInstance(charArray24);
        org.apache.commons.lang3.text.StrTokenizer strTokenizer29 = org.apache.commons.lang3.text.StrTokenizer.getTSVInstance(charArray24);
        org.apache.commons.lang3.text.StrTokenizer strTokenizer31 = new org.apache.commons.lang3.text.StrTokenizer(charArray24, "4 ");
        org.apache.commons.lang3.text.StrTokenizer strTokenizer32 = strTokenizer18.reset(charArray24);
        org.apache.commons.lang3.text.StrTokenizer strTokenizer35 = new org.apache.commons.lang3.text.StrTokenizer(charArray24, '4', ' ');
        org.apache.commons.lang3.text.StrTokenizer strTokenizer36 = strTokenizer8.reset(charArray24);
        int int37 = strTokenizer36.size();
        int int38 = strTokenizer36.size();
        int int39 = strTokenizer36.previousIndex();
        org.junit.Assert.assertNotNull(charArray2);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray2), "4 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray2), "4 ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray2), "[4,  ]");
        org.junit.Assert.assertNotNull(strTokenizer10);
        org.junit.Assert.assertNotNull(strMatcher11);
        org.junit.Assert.assertNotNull(obj12);
        org.junit.Assert.assertEquals(obj12.toString(), "StrTokenizer[not tokenized yet]");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj12), "StrTokenizer[not tokenized yet]");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj12), "StrTokenizer[not tokenized yet]");
        org.junit.Assert.assertNotNull(charArray15);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray15), "4 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray15), "4 ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray15), "[4,  ]");
        org.junit.Assert.assertNotNull(strMatcher19);
        org.junit.Assert.assertNotNull(strTokenizer21);
        org.junit.Assert.assertNotNull(charArray24);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray24), "4 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray24), "4 ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray24), "[4,  ]");
        org.junit.Assert.assertNotNull(strTokenizer28);
        org.junit.Assert.assertNotNull(strTokenizer29);
        org.junit.Assert.assertNotNull(strTokenizer32);
        org.junit.Assert.assertNotNull(strTokenizer36);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 1 + "'", int37 == 1);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 1 + "'", int38 == 1);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + (-1) + "'", int39 == (-1));
    }

    @Test
    public void test1686() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1686");
        char[] charArray4 = new char[] { '4', ' ' };
        org.apache.commons.lang3.text.StrTokenizer strTokenizer7 = new org.apache.commons.lang3.text.StrTokenizer(charArray4, 'a', ' ');
        org.apache.commons.lang3.text.StrMatcher strMatcher8 = strTokenizer7.getTrimmerMatcher();
        org.apache.commons.lang3.text.StrMatcher strMatcher9 = strTokenizer7.getQuoteMatcher();
        char[] charArray12 = new char[] { '4', ' ' };
        org.apache.commons.lang3.text.StrTokenizer strTokenizer15 = new org.apache.commons.lang3.text.StrTokenizer(charArray12, 'a', ' ');
        org.apache.commons.lang3.text.StrMatcher strMatcher16 = strTokenizer15.getTrimmerMatcher();
        org.apache.commons.lang3.text.StrTokenizer strTokenizer17 = new org.apache.commons.lang3.text.StrTokenizer("StrTokenizer[4 ]", strMatcher9, strMatcher16);
        org.apache.commons.lang3.text.StrTokenizer strTokenizer18 = new org.apache.commons.lang3.text.StrTokenizer(" ", strMatcher9);
        java.lang.String str19 = strTokenizer18.getContent();
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray4), "4 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray4), "4 ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray4), "[4,  ]");
        org.junit.Assert.assertNotNull(strMatcher8);
        org.junit.Assert.assertNotNull(strMatcher9);
        org.junit.Assert.assertNotNull(charArray12);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray12), "4 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray12), "4 ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray12), "[4,  ]");
        org.junit.Assert.assertNotNull(strMatcher16);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + " " + "'", str19, " ");
    }

    @Test
    public void test1687() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1687");
        char[] charArray2 = new char[] { '4', ' ' };
        org.apache.commons.lang3.text.StrTokenizer strTokenizer5 = new org.apache.commons.lang3.text.StrTokenizer(charArray2, 'a', ' ');
        org.apache.commons.lang3.text.StrTokenizer strTokenizer8 = new org.apache.commons.lang3.text.StrTokenizer(charArray2, '4', 'a');
        char[] charArray11 = new char[] { '4', ' ' };
        org.apache.commons.lang3.text.StrTokenizer strTokenizer14 = new org.apache.commons.lang3.text.StrTokenizer(charArray11, 'a', ' ');
        org.apache.commons.lang3.text.StrMatcher strMatcher15 = strTokenizer14.getTrimmerMatcher();
        org.apache.commons.lang3.text.StrMatcher strMatcher16 = strTokenizer14.getQuoteMatcher();
        org.apache.commons.lang3.text.StrTokenizer strTokenizer17 = new org.apache.commons.lang3.text.StrTokenizer(charArray2, strMatcher16);
        org.apache.commons.lang3.text.StrTokenizer strTokenizer19 = new org.apache.commons.lang3.text.StrTokenizer(charArray2, "");
        org.apache.commons.lang3.text.StrTokenizer strTokenizer20 = new org.apache.commons.lang3.text.StrTokenizer(charArray2);
        org.apache.commons.lang3.text.StrTokenizer strTokenizer21 = org.apache.commons.lang3.text.StrTokenizer.getTSVInstance(charArray2);
        org.apache.commons.lang3.text.StrTokenizer strTokenizer23 = new org.apache.commons.lang3.text.StrTokenizer(charArray2, "a#");
        char[] charArray26 = new char[] { '4', ' ' };
        org.apache.commons.lang3.text.StrTokenizer strTokenizer29 = new org.apache.commons.lang3.text.StrTokenizer(charArray26, 'a', ' ');
        org.apache.commons.lang3.text.StrMatcher strMatcher30 = strTokenizer29.getTrimmerMatcher();
        org.apache.commons.lang3.text.StrMatcher strMatcher31 = strTokenizer29.getQuoteMatcher();
        char[] charArray34 = null;
        org.apache.commons.lang3.text.StrTokenizer strTokenizer36 = new org.apache.commons.lang3.text.StrTokenizer(charArray34, "");
        java.lang.String str37 = strTokenizer36.getContent();
        org.apache.commons.lang3.text.StrMatcher strMatcher38 = strTokenizer36.getDelimiterMatcher();
        org.apache.commons.lang3.text.StrTokenizer strTokenizer39 = new org.apache.commons.lang3.text.StrTokenizer("StrTokenizer[4 ]", strMatcher38);
        org.apache.commons.lang3.text.StrMatcher strMatcher40 = null;
        org.apache.commons.lang3.text.StrTokenizer strTokenizer41 = new org.apache.commons.lang3.text.StrTokenizer("StrTokenizer[not tokenized yet]", strMatcher38, strMatcher40);
        org.apache.commons.lang3.text.StrMatcher strMatcher42 = strTokenizer41.getDelimiterMatcher();
        org.apache.commons.lang3.text.StrTokenizer strTokenizer43 = strTokenizer29.setIgnoredMatcher(strMatcher42);
        org.apache.commons.lang3.text.StrTokenizer strTokenizer44 = strTokenizer23.setQuoteMatcher(strMatcher42);
        org.junit.Assert.assertNotNull(charArray2);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray2), "4 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray2), "4 ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray2), "[4,  ]");
        org.junit.Assert.assertNotNull(charArray11);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray11), "4 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray11), "4 ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray11), "[4,  ]");
        org.junit.Assert.assertNotNull(strMatcher15);
        org.junit.Assert.assertNotNull(strMatcher16);
        org.junit.Assert.assertNotNull(strTokenizer21);
        org.junit.Assert.assertNotNull(charArray26);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray26), "4 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray26), "4 ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray26), "[4,  ]");
        org.junit.Assert.assertNotNull(strMatcher30);
        org.junit.Assert.assertNotNull(strMatcher31);
        org.junit.Assert.assertNull(str37);
        org.junit.Assert.assertNotNull(strMatcher38);
        org.junit.Assert.assertNotNull(strMatcher42);
        org.junit.Assert.assertNotNull(strTokenizer43);
        org.junit.Assert.assertNotNull(strTokenizer44);
    }

    @Test
    public void test1688() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1688");
        char[] charArray2 = new char[] { '4', ' ' };
        org.apache.commons.lang3.text.StrTokenizer strTokenizer5 = new org.apache.commons.lang3.text.StrTokenizer(charArray2, 'a', ' ');
        org.apache.commons.lang3.text.StrMatcher strMatcher6 = strTokenizer5.getTrimmerMatcher();
        org.apache.commons.lang3.text.StrMatcher strMatcher7 = strTokenizer5.getQuoteMatcher();
        org.apache.commons.lang3.text.StrTokenizer strTokenizer9 = strTokenizer5.setEmptyTokenAsNull(true);
        org.apache.commons.lang3.text.StrTokenizer strTokenizer11 = strTokenizer5.setEmptyTokenAsNull(false);
        org.apache.commons.lang3.text.StrTokenizer strTokenizer12 = strTokenizer11.reset();
        char[] charArray15 = new char[] { '4', ' ' };
        org.apache.commons.lang3.text.StrTokenizer strTokenizer18 = new org.apache.commons.lang3.text.StrTokenizer(charArray15, 'a', ' ');
        org.apache.commons.lang3.text.StrMatcher strMatcher19 = strTokenizer18.getTrimmerMatcher();
        char[] charArray22 = new char[] { '4', ' ' };
        org.apache.commons.lang3.text.StrTokenizer strTokenizer25 = new org.apache.commons.lang3.text.StrTokenizer(charArray22, 'a', ' ');
        org.apache.commons.lang3.text.StrTokenizer strTokenizer26 = org.apache.commons.lang3.text.StrTokenizer.getCSVInstance(charArray22);
        org.apache.commons.lang3.text.StrMatcher strMatcher27 = null;
        org.apache.commons.lang3.text.StrTokenizer strTokenizer28 = new org.apache.commons.lang3.text.StrTokenizer(charArray22, strMatcher27);
        org.apache.commons.lang3.text.StrTokenizer strTokenizer29 = strTokenizer18.reset(charArray22);
        org.apache.commons.lang3.text.StrTokenizer strTokenizer31 = strTokenizer29.setIgnoreEmptyTokens(false);
        boolean boolean32 = strTokenizer29.isEmptyTokenAsNull();
        org.apache.commons.lang3.text.StrMatcher strMatcher33 = strTokenizer29.getDelimiterMatcher();
        org.apache.commons.lang3.text.StrTokenizer strTokenizer34 = strTokenizer12.setQuoteMatcher(strMatcher33);
        org.junit.Assert.assertNotNull(charArray2);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray2), "4 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray2), "4 ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray2), "[4,  ]");
        org.junit.Assert.assertNotNull(strMatcher6);
        org.junit.Assert.assertNotNull(strMatcher7);
        org.junit.Assert.assertNotNull(strTokenizer9);
        org.junit.Assert.assertNotNull(strTokenizer11);
        org.junit.Assert.assertNotNull(strTokenizer12);
        org.junit.Assert.assertNotNull(charArray15);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray15), "4 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray15), "4 ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray15), "[4,  ]");
        org.junit.Assert.assertNotNull(strMatcher19);
        org.junit.Assert.assertNotNull(charArray22);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray22), "4 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray22), "4 ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray22), "[4,  ]");
        org.junit.Assert.assertNotNull(strTokenizer26);
        org.junit.Assert.assertNotNull(strTokenizer29);
        org.junit.Assert.assertNotNull(strTokenizer31);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertNotNull(strMatcher33);
        org.junit.Assert.assertNotNull(strTokenizer34);
    }

    @Test
    public void test1689() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1689");
        org.apache.commons.lang3.text.StrTokenizer strTokenizer0 = org.apache.commons.lang3.text.StrTokenizer.getCSVInstance();
        boolean boolean1 = strTokenizer0.isIgnoreEmptyTokens();
        int int2 = strTokenizer0.nextIndex();
        org.apache.commons.lang3.text.StrTokenizer strTokenizer4 = strTokenizer0.setIgnoreEmptyTokens(false);
        org.apache.commons.lang3.text.StrMatcher strMatcher5 = null;
        org.apache.commons.lang3.text.StrTokenizer strTokenizer6 = strTokenizer4.setDelimiterMatcher(strMatcher5);
        int int7 = strTokenizer4.previousIndex();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str8 = strTokenizer4.next();
            org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException; message: null");
        } catch (java.util.NoSuchElementException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strTokenizer0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(strTokenizer4);
        org.junit.Assert.assertNotNull(strTokenizer6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
    }

    @Test
    public void test1690() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1690");
        char[] charArray2 = new char[] { '4', ' ' };
        org.apache.commons.lang3.text.StrTokenizer strTokenizer5 = new org.apache.commons.lang3.text.StrTokenizer(charArray2, 'a', ' ');
        org.apache.commons.lang3.text.StrMatcher strMatcher6 = strTokenizer5.getTrimmerMatcher();
        org.apache.commons.lang3.text.StrTokenizer strTokenizer8 = strTokenizer5.setDelimiterString("");
        org.apache.commons.lang3.text.StrTokenizer strTokenizer10 = strTokenizer8.reset("");
        org.apache.commons.lang3.text.StrTokenizer strTokenizer12 = strTokenizer10.setQuoteChar('4');
        boolean boolean13 = strTokenizer12.hasPrevious();
        char[] charArray16 = new char[] { '4', ' ' };
        org.apache.commons.lang3.text.StrTokenizer strTokenizer19 = new org.apache.commons.lang3.text.StrTokenizer(charArray16, 'a', ' ');
        org.apache.commons.lang3.text.StrTokenizer strTokenizer22 = new org.apache.commons.lang3.text.StrTokenizer(charArray16, '4', 'a');
        char[] charArray25 = new char[] { '4', ' ' };
        org.apache.commons.lang3.text.StrTokenizer strTokenizer28 = new org.apache.commons.lang3.text.StrTokenizer(charArray25, 'a', ' ');
        org.apache.commons.lang3.text.StrTokenizer strTokenizer29 = org.apache.commons.lang3.text.StrTokenizer.getCSVInstance(charArray25);
        org.apache.commons.lang3.text.StrMatcher strMatcher30 = null;
        org.apache.commons.lang3.text.StrTokenizer strTokenizer31 = new org.apache.commons.lang3.text.StrTokenizer(charArray25, strMatcher30);
        org.apache.commons.lang3.text.StrTokenizer strTokenizer34 = new org.apache.commons.lang3.text.StrTokenizer(charArray25, ' ', '#');
        char[] charArray38 = new char[] { '4', ' ' };
        org.apache.commons.lang3.text.StrTokenizer strTokenizer41 = new org.apache.commons.lang3.text.StrTokenizer(charArray38, 'a', ' ');
        org.apache.commons.lang3.text.StrMatcher strMatcher42 = strTokenizer41.getTrimmerMatcher();
        org.apache.commons.lang3.text.StrTokenizer strTokenizer44 = strTokenizer41.setDelimiterString("");
        org.apache.commons.lang3.text.StrMatcher strMatcher45 = strTokenizer44.getTrimmerMatcher();
        org.apache.commons.lang3.text.StrTokenizer strTokenizer46 = new org.apache.commons.lang3.text.StrTokenizer("", strMatcher45);
        char[] charArray49 = new char[] { '4', ' ' };
        org.apache.commons.lang3.text.StrTokenizer strTokenizer52 = new org.apache.commons.lang3.text.StrTokenizer(charArray49, 'a', ' ');
        org.apache.commons.lang3.text.StrMatcher strMatcher53 = strTokenizer52.getTrimmerMatcher();
        org.apache.commons.lang3.text.StrTokenizer strTokenizer55 = strTokenizer52.setDelimiterString("");
        org.apache.commons.lang3.text.StrMatcher strMatcher56 = strTokenizer55.getTrimmerMatcher();
        org.apache.commons.lang3.text.StrTokenizer strTokenizer57 = strTokenizer46.setTrimmerMatcher(strMatcher56);
        org.apache.commons.lang3.text.StrTokenizer strTokenizer58 = new org.apache.commons.lang3.text.StrTokenizer(charArray25, strMatcher56);
        char[] charArray61 = new char[] { '4', ' ' };
        org.apache.commons.lang3.text.StrTokenizer strTokenizer64 = new org.apache.commons.lang3.text.StrTokenizer(charArray61, 'a', ' ');
        org.apache.commons.lang3.text.StrTokenizer strTokenizer65 = org.apache.commons.lang3.text.StrTokenizer.getCSVInstance(charArray61);
        org.apache.commons.lang3.text.StrMatcher strMatcher66 = null;
        org.apache.commons.lang3.text.StrTokenizer strTokenizer67 = new org.apache.commons.lang3.text.StrTokenizer(charArray61, strMatcher66);
        char[] charArray70 = new char[] { '4', ' ' };
        org.apache.commons.lang3.text.StrTokenizer strTokenizer73 = new org.apache.commons.lang3.text.StrTokenizer(charArray70, 'a', ' ');
        org.apache.commons.lang3.text.StrMatcher strMatcher74 = strTokenizer73.getTrimmerMatcher();
        org.apache.commons.lang3.text.StrTokenizer strTokenizer76 = strTokenizer73.setDelimiterString("");
        org.apache.commons.lang3.text.StrMatcher strMatcher77 = strTokenizer76.getTrimmerMatcher();
        org.apache.commons.lang3.text.StrTokenizer strTokenizer78 = new org.apache.commons.lang3.text.StrTokenizer(charArray61, strMatcher77);
        org.apache.commons.lang3.text.StrTokenizer strTokenizer79 = new org.apache.commons.lang3.text.StrTokenizer(charArray25, strMatcher77);
        org.apache.commons.lang3.text.StrTokenizer strTokenizer80 = new org.apache.commons.lang3.text.StrTokenizer(charArray16, strMatcher77);
        org.apache.commons.lang3.text.StrTokenizer strTokenizer81 = strTokenizer12.setDelimiterMatcher(strMatcher77);
        org.apache.commons.lang3.text.StrMatcher strMatcher82 = strTokenizer81.getTrimmerMatcher();
        boolean boolean83 = strTokenizer81.hasPrevious();
        java.lang.String str84 = strTokenizer81.previousToken();
        org.junit.Assert.assertNotNull(charArray2);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray2), "4 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray2), "4 ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray2), "[4,  ]");
        org.junit.Assert.assertNotNull(strMatcher6);
        org.junit.Assert.assertNotNull(strTokenizer8);
        org.junit.Assert.assertNotNull(strTokenizer10);
        org.junit.Assert.assertNotNull(strTokenizer12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(charArray16);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray16), "4 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray16), "4 ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray16), "[4,  ]");
        org.junit.Assert.assertNotNull(charArray25);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray25), "4 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray25), "4 ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray25), "[4,  ]");
        org.junit.Assert.assertNotNull(strTokenizer29);
        org.junit.Assert.assertNotNull(charArray38);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray38), "4 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray38), "4 ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray38), "[4,  ]");
        org.junit.Assert.assertNotNull(strMatcher42);
        org.junit.Assert.assertNotNull(strTokenizer44);
        org.junit.Assert.assertNotNull(strMatcher45);
        org.junit.Assert.assertNotNull(charArray49);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray49), "4 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray49), "4 ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray49), "[4,  ]");
        org.junit.Assert.assertNotNull(strMatcher53);
        org.junit.Assert.assertNotNull(strTokenizer55);
        org.junit.Assert.assertNotNull(strMatcher56);
        org.junit.Assert.assertNotNull(strTokenizer57);
        org.junit.Assert.assertNotNull(charArray61);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray61), "4 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray61), "4 ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray61), "[4,  ]");
        org.junit.Assert.assertNotNull(strTokenizer65);
        org.junit.Assert.assertNotNull(charArray70);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray70), "4 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray70), "4 ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray70), "[4,  ]");
        org.junit.Assert.assertNotNull(strMatcher74);
        org.junit.Assert.assertNotNull(strTokenizer76);
        org.junit.Assert.assertNotNull(strMatcher77);
        org.junit.Assert.assertNotNull(strTokenizer81);
        org.junit.Assert.assertNotNull(strMatcher82);
        org.junit.Assert.assertTrue("'" + boolean83 + "' != '" + false + "'", boolean83 == false);
        org.junit.Assert.assertNull(str84);
    }

    @Test
    public void test1691() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1691");
        org.apache.commons.lang3.text.StrTokenizer strTokenizer2 = new org.apache.commons.lang3.text.StrTokenizer("StrTokenizer[4 ]", "StrTokenizer[4]");
        java.lang.String str3 = strTokenizer2.next();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "StrTokenizer[4 ]" + "'", str3, "StrTokenizer[4 ]");
    }

    @Test
    public void test1692() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1692");
        char[] charArray2 = new char[] { '4', ' ' };
        org.apache.commons.lang3.text.StrTokenizer strTokenizer5 = new org.apache.commons.lang3.text.StrTokenizer(charArray2, 'a', ' ');
        org.apache.commons.lang3.text.StrTokenizer strTokenizer6 = org.apache.commons.lang3.text.StrTokenizer.getCSVInstance(charArray2);
        org.apache.commons.lang3.text.StrMatcher strMatcher7 = null;
        org.apache.commons.lang3.text.StrTokenizer strTokenizer8 = new org.apache.commons.lang3.text.StrTokenizer(charArray2, strMatcher7);
        char[] charArray11 = new char[] { '4', ' ' };
        org.apache.commons.lang3.text.StrTokenizer strTokenizer14 = new org.apache.commons.lang3.text.StrTokenizer(charArray11, 'a', ' ');
        org.apache.commons.lang3.text.StrMatcher strMatcher15 = strTokenizer14.getTrimmerMatcher();
        org.apache.commons.lang3.text.StrTokenizer strTokenizer17 = strTokenizer14.setDelimiterString("");
        org.apache.commons.lang3.text.StrMatcher strMatcher18 = strTokenizer17.getTrimmerMatcher();
        org.apache.commons.lang3.text.StrTokenizer strTokenizer19 = new org.apache.commons.lang3.text.StrTokenizer(charArray2, strMatcher18);
        org.apache.commons.lang3.text.StrTokenizer strTokenizer21 = new org.apache.commons.lang3.text.StrTokenizer(charArray2, "StrTokenizer[4 ]");
        org.apache.commons.lang3.text.StrTokenizer strTokenizer22 = org.apache.commons.lang3.text.StrTokenizer.getTSVInstance(charArray2);
        org.apache.commons.lang3.text.StrTokenizer strTokenizer24 = new org.apache.commons.lang3.text.StrTokenizer(charArray2, "");
        int int25 = strTokenizer24.nextIndex();
        org.apache.commons.lang3.text.StrTokenizer strTokenizer26 = strTokenizer24.reset();
        java.lang.String str27 = strTokenizer26.previousToken();
        org.junit.Assert.assertNotNull(charArray2);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray2), "4 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray2), "4 ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray2), "[4,  ]");
        org.junit.Assert.assertNotNull(strTokenizer6);
        org.junit.Assert.assertNotNull(charArray11);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray11), "4 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray11), "4 ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray11), "[4,  ]");
        org.junit.Assert.assertNotNull(strMatcher15);
        org.junit.Assert.assertNotNull(strTokenizer17);
        org.junit.Assert.assertNotNull(strMatcher18);
        org.junit.Assert.assertNotNull(strTokenizer22);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertNotNull(strTokenizer26);
        org.junit.Assert.assertNull(str27);
    }

    @Test
    public void test1693() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1693");
        org.apache.commons.lang3.text.StrTokenizer strTokenizer2 = new org.apache.commons.lang3.text.StrTokenizer("4 ", "4 ");
        boolean boolean3 = strTokenizer2.isEmptyTokenAsNull();
        int int4 = strTokenizer2.size();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test1694() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1694");
        char[] charArray0 = null;
        org.apache.commons.lang3.text.StrTokenizer strTokenizer2 = new org.apache.commons.lang3.text.StrTokenizer(charArray0, "");
        org.apache.commons.lang3.text.StrTokenizer strTokenizer4 = strTokenizer2.setQuoteChar('#');
        java.lang.String str5 = strTokenizer2.getContent();
        org.junit.Assert.assertNotNull(strTokenizer4);
        org.junit.Assert.assertNull(str5);
    }

    @Test
    public void test1695() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1695");
        org.apache.commons.lang3.text.StrTokenizer strTokenizer2 = new org.apache.commons.lang3.text.StrTokenizer("hi!", "");
        org.apache.commons.lang3.text.StrTokenizer strTokenizer3 = strTokenizer2.reset();
        char[] charArray7 = new char[] { '4', ' ' };
        org.apache.commons.lang3.text.StrTokenizer strTokenizer10 = new org.apache.commons.lang3.text.StrTokenizer(charArray7, 'a', ' ');
        org.apache.commons.lang3.text.StrMatcher strMatcher11 = strTokenizer10.getTrimmerMatcher();
        java.lang.String str12 = strTokenizer10.nextToken();
        char[] charArray15 = new char[] { '4', ' ' };
        org.apache.commons.lang3.text.StrTokenizer strTokenizer18 = new org.apache.commons.lang3.text.StrTokenizer(charArray15, 'a', ' ');
        org.apache.commons.lang3.text.StrMatcher strMatcher19 = strTokenizer18.getTrimmerMatcher();
        org.apache.commons.lang3.text.StrTokenizer strTokenizer21 = strTokenizer18.setDelimiterString("");
        org.apache.commons.lang3.text.StrMatcher strMatcher22 = strTokenizer21.getTrimmerMatcher();
        org.apache.commons.lang3.text.StrMatcher strMatcher23 = strTokenizer21.getTrimmerMatcher();
        char[] charArray26 = new char[] { '4', ' ' };
        org.apache.commons.lang3.text.StrTokenizer strTokenizer29 = new org.apache.commons.lang3.text.StrTokenizer(charArray26, 'a', ' ');
        org.apache.commons.lang3.text.StrTokenizer strTokenizer30 = strTokenizer21.reset(charArray26);
        org.apache.commons.lang3.text.StrTokenizer strTokenizer32 = new org.apache.commons.lang3.text.StrTokenizer(charArray26, "");
        org.apache.commons.lang3.text.StrTokenizer strTokenizer33 = strTokenizer10.reset(charArray26);
        org.apache.commons.lang3.text.StrTokenizer strTokenizer35 = new org.apache.commons.lang3.text.StrTokenizer(charArray26, "StrTokenizer[4 ]");
        org.apache.commons.lang3.text.StrMatcher strMatcher36 = strTokenizer35.getIgnoredMatcher();
        char[] charArray40 = new char[] { '4', ' ' };
        org.apache.commons.lang3.text.StrTokenizer strTokenizer43 = new org.apache.commons.lang3.text.StrTokenizer(charArray40, 'a', ' ');
        org.apache.commons.lang3.text.StrMatcher strMatcher44 = strTokenizer43.getTrimmerMatcher();
        org.apache.commons.lang3.text.StrTokenizer strTokenizer46 = strTokenizer43.setDelimiterString("");
        char[] charArray50 = new char[] { '4', ' ' };
        org.apache.commons.lang3.text.StrTokenizer strTokenizer53 = new org.apache.commons.lang3.text.StrTokenizer(charArray50, 'a', ' ');
        org.apache.commons.lang3.text.StrMatcher strMatcher54 = strTokenizer53.getTrimmerMatcher();
        org.apache.commons.lang3.text.StrTokenizer strTokenizer56 = strTokenizer53.setDelimiterString("");
        org.apache.commons.lang3.text.StrMatcher strMatcher57 = strTokenizer56.getTrimmerMatcher();
        org.apache.commons.lang3.text.StrTokenizer strTokenizer58 = new org.apache.commons.lang3.text.StrTokenizer("", strMatcher57);
        char[] charArray61 = new char[] { '4', ' ' };
        org.apache.commons.lang3.text.StrTokenizer strTokenizer64 = new org.apache.commons.lang3.text.StrTokenizer(charArray61, 'a', ' ');
        org.apache.commons.lang3.text.StrMatcher strMatcher65 = strTokenizer64.getTrimmerMatcher();
        org.apache.commons.lang3.text.StrTokenizer strTokenizer67 = strTokenizer64.setDelimiterString("");
        org.apache.commons.lang3.text.StrMatcher strMatcher68 = strTokenizer67.getTrimmerMatcher();
        org.apache.commons.lang3.text.StrTokenizer strTokenizer69 = strTokenizer58.setTrimmerMatcher(strMatcher68);
        org.apache.commons.lang3.text.StrTokenizer strTokenizer70 = strTokenizer46.setTrimmerMatcher(strMatcher68);
        org.apache.commons.lang3.text.StrMatcher strMatcher71 = strTokenizer46.getDelimiterMatcher();
        boolean boolean72 = strTokenizer46.isIgnoreEmptyTokens();
        org.apache.commons.lang3.text.StrMatcher strMatcher73 = strTokenizer46.getQuoteMatcher();
        char[] charArray74 = null;
        org.apache.commons.lang3.text.StrTokenizer strTokenizer76 = new org.apache.commons.lang3.text.StrTokenizer(charArray74, "");
        java.lang.String str77 = strTokenizer76.getContent();
        org.apache.commons.lang3.text.StrMatcher strMatcher78 = strTokenizer76.getTrimmerMatcher();
        org.apache.commons.lang3.text.StrTokenizer strTokenizer79 = new org.apache.commons.lang3.text.StrTokenizer("4 ", strMatcher73, strMatcher78);
        org.apache.commons.lang3.text.StrTokenizer strTokenizer80 = new org.apache.commons.lang3.text.StrTokenizer("", strMatcher36, strMatcher73);
        org.apache.commons.lang3.text.StrTokenizer strTokenizer81 = strTokenizer3.setDelimiterMatcher(strMatcher73);
        org.apache.commons.lang3.text.StrMatcher strMatcher82 = strTokenizer3.getQuoteMatcher();
        int int83 = strTokenizer3.size();
        org.junit.Assert.assertNotNull(strTokenizer3);
        org.junit.Assert.assertNotNull(charArray7);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray7), "4 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray7), "4 ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray7), "[4,  ]");
        org.junit.Assert.assertNotNull(strMatcher11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "4 " + "'", str12, "4 ");
        org.junit.Assert.assertNotNull(charArray15);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray15), "4 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray15), "4 ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray15), "[4,  ]");
        org.junit.Assert.assertNotNull(strMatcher19);
        org.junit.Assert.assertNotNull(strTokenizer21);
        org.junit.Assert.assertNotNull(strMatcher22);
        org.junit.Assert.assertNotNull(strMatcher23);
        org.junit.Assert.assertNotNull(charArray26);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray26), "4 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray26), "4 ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray26), "[4,  ]");
        org.junit.Assert.assertNotNull(strTokenizer30);
        org.junit.Assert.assertNotNull(strTokenizer33);
        org.junit.Assert.assertNotNull(strMatcher36);
        org.junit.Assert.assertNotNull(charArray40);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray40), "4 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray40), "4 ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray40), "[4,  ]");
        org.junit.Assert.assertNotNull(strMatcher44);
        org.junit.Assert.assertNotNull(strTokenizer46);
        org.junit.Assert.assertNotNull(charArray50);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray50), "4 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray50), "4 ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray50), "[4,  ]");
        org.junit.Assert.assertNotNull(strMatcher54);
        org.junit.Assert.assertNotNull(strTokenizer56);
        org.junit.Assert.assertNotNull(strMatcher57);
        org.junit.Assert.assertNotNull(charArray61);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray61), "4 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray61), "4 ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray61), "[4,  ]");
        org.junit.Assert.assertNotNull(strMatcher65);
        org.junit.Assert.assertNotNull(strTokenizer67);
        org.junit.Assert.assertNotNull(strMatcher68);
        org.junit.Assert.assertNotNull(strTokenizer69);
        org.junit.Assert.assertNotNull(strTokenizer70);
        org.junit.Assert.assertNotNull(strMatcher71);
        org.junit.Assert.assertTrue("'" + boolean72 + "' != '" + true + "'", boolean72 == true);
        org.junit.Assert.assertNotNull(strMatcher73);
        org.junit.Assert.assertNull(str77);
        org.junit.Assert.assertNotNull(strMatcher78);
        org.junit.Assert.assertNotNull(strTokenizer81);
        org.junit.Assert.assertNotNull(strMatcher82);
        org.junit.Assert.assertTrue("'" + int83 + "' != '" + 1 + "'", int83 == 1);
    }

    @Test
    public void test1696() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1696");
        char[] charArray4 = new char[] { '4', ' ' };
        org.apache.commons.lang3.text.StrTokenizer strTokenizer7 = new org.apache.commons.lang3.text.StrTokenizer(charArray4, 'a', ' ');
        org.apache.commons.lang3.text.StrMatcher strMatcher8 = strTokenizer7.getTrimmerMatcher();
        org.apache.commons.lang3.text.StrTokenizer strTokenizer10 = strTokenizer7.setDelimiterString("");
        char[] charArray14 = new char[] { '4', ' ' };
        org.apache.commons.lang3.text.StrTokenizer strTokenizer17 = new org.apache.commons.lang3.text.StrTokenizer(charArray14, 'a', ' ');
        org.apache.commons.lang3.text.StrMatcher strMatcher18 = strTokenizer17.getTrimmerMatcher();
        org.apache.commons.lang3.text.StrTokenizer strTokenizer20 = strTokenizer17.setDelimiterString("");
        org.apache.commons.lang3.text.StrMatcher strMatcher21 = strTokenizer20.getTrimmerMatcher();
        org.apache.commons.lang3.text.StrTokenizer strTokenizer22 = new org.apache.commons.lang3.text.StrTokenizer("", strMatcher21);
        char[] charArray25 = new char[] { '4', ' ' };
        org.apache.commons.lang3.text.StrTokenizer strTokenizer28 = new org.apache.commons.lang3.text.StrTokenizer(charArray25, 'a', ' ');
        org.apache.commons.lang3.text.StrMatcher strMatcher29 = strTokenizer28.getTrimmerMatcher();
        org.apache.commons.lang3.text.StrTokenizer strTokenizer31 = strTokenizer28.setDelimiterString("");
        org.apache.commons.lang3.text.StrMatcher strMatcher32 = strTokenizer31.getTrimmerMatcher();
        org.apache.commons.lang3.text.StrTokenizer strTokenizer33 = strTokenizer22.setTrimmerMatcher(strMatcher32);
        org.apache.commons.lang3.text.StrTokenizer strTokenizer34 = strTokenizer10.setTrimmerMatcher(strMatcher32);
        org.apache.commons.lang3.text.StrMatcher strMatcher35 = strTokenizer10.getDelimiterMatcher();
        boolean boolean36 = strTokenizer10.isIgnoreEmptyTokens();
        org.apache.commons.lang3.text.StrMatcher strMatcher37 = strTokenizer10.getQuoteMatcher();
        char[] charArray38 = null;
        org.apache.commons.lang3.text.StrTokenizer strTokenizer40 = new org.apache.commons.lang3.text.StrTokenizer(charArray38, "");
        java.lang.String str41 = strTokenizer40.getContent();
        org.apache.commons.lang3.text.StrMatcher strMatcher42 = strTokenizer40.getTrimmerMatcher();
        org.apache.commons.lang3.text.StrTokenizer strTokenizer43 = new org.apache.commons.lang3.text.StrTokenizer("4 ", strMatcher37, strMatcher42);
        org.apache.commons.lang3.text.StrTokenizer strTokenizer44 = new org.apache.commons.lang3.text.StrTokenizer("hi!", strMatcher42);
        char[] charArray47 = new char[] { '4', ' ' };
        org.apache.commons.lang3.text.StrTokenizer strTokenizer50 = new org.apache.commons.lang3.text.StrTokenizer(charArray47, 'a', ' ');
        org.apache.commons.lang3.text.StrTokenizer strTokenizer51 = org.apache.commons.lang3.text.StrTokenizer.getCSVInstance(charArray47);
        org.apache.commons.lang3.text.StrMatcher strMatcher52 = null;
        org.apache.commons.lang3.text.StrTokenizer strTokenizer53 = new org.apache.commons.lang3.text.StrTokenizer(charArray47, strMatcher52);
        char[] charArray56 = new char[] { '4', ' ' };
        org.apache.commons.lang3.text.StrTokenizer strTokenizer59 = new org.apache.commons.lang3.text.StrTokenizer(charArray56, 'a', ' ');
        org.apache.commons.lang3.text.StrMatcher strMatcher60 = strTokenizer59.getTrimmerMatcher();
        org.apache.commons.lang3.text.StrTokenizer strTokenizer62 = strTokenizer59.setDelimiterString("");
        org.apache.commons.lang3.text.StrMatcher strMatcher63 = strTokenizer62.getTrimmerMatcher();
        org.apache.commons.lang3.text.StrTokenizer strTokenizer64 = new org.apache.commons.lang3.text.StrTokenizer(charArray47, strMatcher63);
        org.apache.commons.lang3.text.StrTokenizer strTokenizer66 = new org.apache.commons.lang3.text.StrTokenizer(charArray47, "StrTokenizer[4 ]");
        org.apache.commons.lang3.text.StrTokenizer strTokenizer67 = strTokenizer44.reset(charArray47);
        int int68 = strTokenizer44.previousIndex();
        org.apache.commons.lang3.text.StrTokenizer strTokenizer70 = strTokenizer44.setDelimiterChar(' ');
        boolean boolean71 = strTokenizer70.hasNext();
        java.lang.String str72 = strTokenizer70.toString();
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray4), "4 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray4), "4 ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray4), "[4,  ]");
        org.junit.Assert.assertNotNull(strMatcher8);
        org.junit.Assert.assertNotNull(strTokenizer10);
        org.junit.Assert.assertNotNull(charArray14);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray14), "4 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray14), "4 ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray14), "[4,  ]");
        org.junit.Assert.assertNotNull(strMatcher18);
        org.junit.Assert.assertNotNull(strTokenizer20);
        org.junit.Assert.assertNotNull(strMatcher21);
        org.junit.Assert.assertNotNull(charArray25);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray25), "4 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray25), "4 ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray25), "[4,  ]");
        org.junit.Assert.assertNotNull(strMatcher29);
        org.junit.Assert.assertNotNull(strTokenizer31);
        org.junit.Assert.assertNotNull(strMatcher32);
        org.junit.Assert.assertNotNull(strTokenizer33);
        org.junit.Assert.assertNotNull(strTokenizer34);
        org.junit.Assert.assertNotNull(strMatcher35);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
        org.junit.Assert.assertNotNull(strMatcher37);
        org.junit.Assert.assertNull(str41);
        org.junit.Assert.assertNotNull(strMatcher42);
        org.junit.Assert.assertNotNull(charArray47);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray47), "4 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray47), "4 ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray47), "[4,  ]");
        org.junit.Assert.assertNotNull(strTokenizer51);
        org.junit.Assert.assertNotNull(charArray56);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray56), "4 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray56), "4 ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray56), "[4,  ]");
        org.junit.Assert.assertNotNull(strMatcher60);
        org.junit.Assert.assertNotNull(strTokenizer62);
        org.junit.Assert.assertNotNull(strMatcher63);
        org.junit.Assert.assertNotNull(strTokenizer67);
        org.junit.Assert.assertTrue("'" + int68 + "' != '" + (-1) + "'", int68 == (-1));
        org.junit.Assert.assertNotNull(strTokenizer70);
        org.junit.Assert.assertTrue("'" + boolean71 + "' != '" + true + "'", boolean71 == true);
        org.junit.Assert.assertEquals("'" + str72 + "' != '" + "StrTokenizer[4]" + "'", str72, "StrTokenizer[4]");
    }

    @Test
    public void test1697() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1697");
        char[] charArray2 = new char[] { '4', ' ' };
        org.apache.commons.lang3.text.StrTokenizer strTokenizer5 = new org.apache.commons.lang3.text.StrTokenizer(charArray2, 'a', ' ');
        org.apache.commons.lang3.text.StrMatcher strMatcher6 = strTokenizer5.getTrimmerMatcher();
        java.lang.String str7 = strTokenizer5.nextToken();
        char[] charArray10 = new char[] { '4', ' ' };
        org.apache.commons.lang3.text.StrTokenizer strTokenizer13 = new org.apache.commons.lang3.text.StrTokenizer(charArray10, 'a', ' ');
        org.apache.commons.lang3.text.StrMatcher strMatcher14 = strTokenizer13.getTrimmerMatcher();
        org.apache.commons.lang3.text.StrTokenizer strTokenizer16 = strTokenizer13.setDelimiterString("");
        org.apache.commons.lang3.text.StrMatcher strMatcher17 = strTokenizer16.getTrimmerMatcher();
        org.apache.commons.lang3.text.StrMatcher strMatcher18 = strTokenizer16.getTrimmerMatcher();
        char[] charArray21 = new char[] { '4', ' ' };
        org.apache.commons.lang3.text.StrTokenizer strTokenizer24 = new org.apache.commons.lang3.text.StrTokenizer(charArray21, 'a', ' ');
        org.apache.commons.lang3.text.StrTokenizer strTokenizer25 = strTokenizer16.reset(charArray21);
        org.apache.commons.lang3.text.StrTokenizer strTokenizer27 = new org.apache.commons.lang3.text.StrTokenizer(charArray21, "");
        org.apache.commons.lang3.text.StrTokenizer strTokenizer28 = strTokenizer5.reset(charArray21);
        org.apache.commons.lang3.text.StrMatcher strMatcher29 = strTokenizer28.getDelimiterMatcher();
        char[] charArray32 = new char[] { '4', ' ' };
        org.apache.commons.lang3.text.StrTokenizer strTokenizer35 = new org.apache.commons.lang3.text.StrTokenizer(charArray32, 'a', ' ');
        char[] charArray38 = new char[] { '4', ' ' };
        org.apache.commons.lang3.text.StrTokenizer strTokenizer41 = new org.apache.commons.lang3.text.StrTokenizer(charArray38, 'a', ' ');
        org.apache.commons.lang3.text.StrMatcher strMatcher42 = strTokenizer41.getTrimmerMatcher();
        org.apache.commons.lang3.text.StrTokenizer strTokenizer44 = strTokenizer41.setDelimiterString("");
        org.apache.commons.lang3.text.StrMatcher strMatcher45 = strTokenizer44.getTrimmerMatcher();
        org.apache.commons.lang3.text.StrMatcher strMatcher46 = strTokenizer44.getTrimmerMatcher();
        char[] charArray48 = null;
        org.apache.commons.lang3.text.StrTokenizer strTokenizer50 = new org.apache.commons.lang3.text.StrTokenizer(charArray48, "");
        java.lang.String str51 = strTokenizer50.getContent();
        org.apache.commons.lang3.text.StrMatcher strMatcher52 = strTokenizer50.getDelimiterMatcher();
        org.apache.commons.lang3.text.StrTokenizer strTokenizer53 = new org.apache.commons.lang3.text.StrTokenizer("hi!", strMatcher52);
        org.apache.commons.lang3.text.StrTokenizer strTokenizer54 = new org.apache.commons.lang3.text.StrTokenizer(charArray32, strMatcher46, strMatcher52);
        org.apache.commons.lang3.text.StrTokenizer strTokenizer55 = strTokenizer28.reset(charArray32);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str56 = strTokenizer55.previous();
            org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException; message: null");
        } catch (java.util.NoSuchElementException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray2);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray2), "4 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray2), "4 ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray2), "[4,  ]");
        org.junit.Assert.assertNotNull(strMatcher6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "4 " + "'", str7, "4 ");
        org.junit.Assert.assertNotNull(charArray10);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray10), "4 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray10), "4 ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray10), "[4,  ]");
        org.junit.Assert.assertNotNull(strMatcher14);
        org.junit.Assert.assertNotNull(strTokenizer16);
        org.junit.Assert.assertNotNull(strMatcher17);
        org.junit.Assert.assertNotNull(strMatcher18);
        org.junit.Assert.assertNotNull(charArray21);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray21), "4 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray21), "4 ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray21), "[4,  ]");
        org.junit.Assert.assertNotNull(strTokenizer25);
        org.junit.Assert.assertNotNull(strTokenizer28);
        org.junit.Assert.assertNotNull(strMatcher29);
        org.junit.Assert.assertNotNull(charArray32);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray32), "4 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray32), "4 ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray32), "[4,  ]");
        org.junit.Assert.assertNotNull(charArray38);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray38), "4 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray38), "4 ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray38), "[4,  ]");
        org.junit.Assert.assertNotNull(strMatcher42);
        org.junit.Assert.assertNotNull(strTokenizer44);
        org.junit.Assert.assertNotNull(strMatcher45);
        org.junit.Assert.assertNotNull(strMatcher46);
        org.junit.Assert.assertNull(str51);
        org.junit.Assert.assertNotNull(strMatcher52);
        org.junit.Assert.assertNotNull(strTokenizer55);
    }

    @Test
    public void test1698() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1698");
        char[] charArray2 = new char[] { '4', ' ' };
        org.apache.commons.lang3.text.StrTokenizer strTokenizer5 = new org.apache.commons.lang3.text.StrTokenizer(charArray2, 'a', ' ');
        org.apache.commons.lang3.text.StrTokenizer strTokenizer7 = new org.apache.commons.lang3.text.StrTokenizer(charArray2, "hi!");
        org.apache.commons.lang3.text.StrTokenizer strTokenizer8 = new org.apache.commons.lang3.text.StrTokenizer(charArray2);
        char[] charArray13 = new char[] { '4', ' ' };
        org.apache.commons.lang3.text.StrTokenizer strTokenizer16 = new org.apache.commons.lang3.text.StrTokenizer(charArray13, 'a', ' ');
        org.apache.commons.lang3.text.StrMatcher strMatcher17 = strTokenizer16.getTrimmerMatcher();
        org.apache.commons.lang3.text.StrTokenizer strTokenizer19 = strTokenizer16.setDelimiterString("");
        org.apache.commons.lang3.text.StrMatcher strMatcher20 = strTokenizer19.getTrimmerMatcher();
        org.apache.commons.lang3.text.StrTokenizer strTokenizer21 = new org.apache.commons.lang3.text.StrTokenizer("", strMatcher20);
        char[] charArray24 = new char[] { '4', ' ' };
        org.apache.commons.lang3.text.StrTokenizer strTokenizer27 = new org.apache.commons.lang3.text.StrTokenizer(charArray24, 'a', ' ');
        org.apache.commons.lang3.text.StrMatcher strMatcher28 = strTokenizer27.getTrimmerMatcher();
        org.apache.commons.lang3.text.StrMatcher strMatcher29 = strTokenizer27.getQuoteMatcher();
        org.apache.commons.lang3.text.StrTokenizer strTokenizer30 = strTokenizer21.setDelimiterMatcher(strMatcher29);
        char[] charArray33 = new char[] { '4', ' ' };
        org.apache.commons.lang3.text.StrTokenizer strTokenizer36 = new org.apache.commons.lang3.text.StrTokenizer(charArray33, 'a', ' ');
        org.apache.commons.lang3.text.StrMatcher strMatcher37 = strTokenizer36.getTrimmerMatcher();
        org.apache.commons.lang3.text.StrMatcher strMatcher38 = strTokenizer36.getQuoteMatcher();
        org.apache.commons.lang3.text.StrTokenizer strTokenizer39 = new org.apache.commons.lang3.text.StrTokenizer("", strMatcher29, strMatcher38);
        org.apache.commons.lang3.text.StrTokenizer strTokenizer40 = strTokenizer8.setTrimmerMatcher(strMatcher38);
        org.apache.commons.lang3.text.StrTokenizer strTokenizer43 = new org.apache.commons.lang3.text.StrTokenizer("4 ", 'a');
        char[] charArray47 = new char[] { '4', ' ' };
        org.apache.commons.lang3.text.StrTokenizer strTokenizer50 = new org.apache.commons.lang3.text.StrTokenizer(charArray47, 'a', ' ');
        org.apache.commons.lang3.text.StrMatcher strMatcher51 = strTokenizer50.getTrimmerMatcher();
        org.apache.commons.lang3.text.StrTokenizer strTokenizer53 = strTokenizer50.setDelimiterString("");
        char[] charArray57 = new char[] { '4', ' ' };
        org.apache.commons.lang3.text.StrTokenizer strTokenizer60 = new org.apache.commons.lang3.text.StrTokenizer(charArray57, 'a', ' ');
        org.apache.commons.lang3.text.StrMatcher strMatcher61 = strTokenizer60.getTrimmerMatcher();
        org.apache.commons.lang3.text.StrTokenizer strTokenizer63 = strTokenizer60.setDelimiterString("");
        org.apache.commons.lang3.text.StrMatcher strMatcher64 = strTokenizer63.getTrimmerMatcher();
        org.apache.commons.lang3.text.StrTokenizer strTokenizer65 = new org.apache.commons.lang3.text.StrTokenizer("", strMatcher64);
        char[] charArray68 = new char[] { '4', ' ' };
        org.apache.commons.lang3.text.StrTokenizer strTokenizer71 = new org.apache.commons.lang3.text.StrTokenizer(charArray68, 'a', ' ');
        org.apache.commons.lang3.text.StrMatcher strMatcher72 = strTokenizer71.getTrimmerMatcher();
        org.apache.commons.lang3.text.StrTokenizer strTokenizer74 = strTokenizer71.setDelimiterString("");
        org.apache.commons.lang3.text.StrMatcher strMatcher75 = strTokenizer74.getTrimmerMatcher();
        org.apache.commons.lang3.text.StrTokenizer strTokenizer76 = strTokenizer65.setTrimmerMatcher(strMatcher75);
        org.apache.commons.lang3.text.StrTokenizer strTokenizer77 = strTokenizer53.setTrimmerMatcher(strMatcher75);
        org.apache.commons.lang3.text.StrMatcher strMatcher78 = strTokenizer53.getDelimiterMatcher();
        boolean boolean79 = strTokenizer53.isIgnoreEmptyTokens();
        org.apache.commons.lang3.text.StrMatcher strMatcher80 = strTokenizer53.getQuoteMatcher();
        char[] charArray81 = null;
        org.apache.commons.lang3.text.StrTokenizer strTokenizer83 = new org.apache.commons.lang3.text.StrTokenizer(charArray81, "");
        java.lang.String str84 = strTokenizer83.getContent();
        org.apache.commons.lang3.text.StrMatcher strMatcher85 = strTokenizer83.getTrimmerMatcher();
        org.apache.commons.lang3.text.StrTokenizer strTokenizer86 = new org.apache.commons.lang3.text.StrTokenizer("4 ", strMatcher80, strMatcher85);
        org.apache.commons.lang3.text.StrTokenizer strTokenizer87 = strTokenizer43.setDelimiterMatcher(strMatcher80);
        org.apache.commons.lang3.text.StrMatcher strMatcher88 = strTokenizer43.getQuoteMatcher();
        org.apache.commons.lang3.text.StrTokenizer strTokenizer89 = strTokenizer40.setIgnoredMatcher(strMatcher88);
        org.apache.commons.lang3.text.StrMatcher strMatcher90 = strTokenizer40.getQuoteMatcher();
        org.apache.commons.lang3.text.StrMatcher strMatcher91 = null;
        org.apache.commons.lang3.text.StrTokenizer strTokenizer92 = strTokenizer40.setTrimmerMatcher(strMatcher91);
        org.apache.commons.lang3.text.StrTokenizer strTokenizer93 = strTokenizer92.reset();
        org.apache.commons.lang3.text.StrMatcher strMatcher94 = strTokenizer93.getQuoteMatcher();
        org.apache.commons.lang3.text.StrTokenizer strTokenizer96 = strTokenizer93.setDelimiterChar('#');
        org.junit.Assert.assertNotNull(charArray2);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray2), "4 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray2), "4 ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray2), "[4,  ]");
        org.junit.Assert.assertNotNull(charArray13);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray13), "4 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray13), "4 ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray13), "[4,  ]");
        org.junit.Assert.assertNotNull(strMatcher17);
        org.junit.Assert.assertNotNull(strTokenizer19);
        org.junit.Assert.assertNotNull(strMatcher20);
        org.junit.Assert.assertNotNull(charArray24);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray24), "4 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray24), "4 ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray24), "[4,  ]");
        org.junit.Assert.assertNotNull(strMatcher28);
        org.junit.Assert.assertNotNull(strMatcher29);
        org.junit.Assert.assertNotNull(strTokenizer30);
        org.junit.Assert.assertNotNull(charArray33);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray33), "4 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray33), "4 ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray33), "[4,  ]");
        org.junit.Assert.assertNotNull(strMatcher37);
        org.junit.Assert.assertNotNull(strMatcher38);
        org.junit.Assert.assertNotNull(strTokenizer40);
        org.junit.Assert.assertNotNull(charArray47);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray47), "4 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray47), "4 ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray47), "[4,  ]");
        org.junit.Assert.assertNotNull(strMatcher51);
        org.junit.Assert.assertNotNull(strTokenizer53);
        org.junit.Assert.assertNotNull(charArray57);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray57), "4 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray57), "4 ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray57), "[4,  ]");
        org.junit.Assert.assertNotNull(strMatcher61);
        org.junit.Assert.assertNotNull(strTokenizer63);
        org.junit.Assert.assertNotNull(strMatcher64);
        org.junit.Assert.assertNotNull(charArray68);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray68), "4 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray68), "4 ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray68), "[4,  ]");
        org.junit.Assert.assertNotNull(strMatcher72);
        org.junit.Assert.assertNotNull(strTokenizer74);
        org.junit.Assert.assertNotNull(strMatcher75);
        org.junit.Assert.assertNotNull(strTokenizer76);
        org.junit.Assert.assertNotNull(strTokenizer77);
        org.junit.Assert.assertNotNull(strMatcher78);
        org.junit.Assert.assertTrue("'" + boolean79 + "' != '" + true + "'", boolean79 == true);
        org.junit.Assert.assertNotNull(strMatcher80);
        org.junit.Assert.assertNull(str84);
        org.junit.Assert.assertNotNull(strMatcher85);
        org.junit.Assert.assertNotNull(strTokenizer87);
        org.junit.Assert.assertNotNull(strMatcher88);
        org.junit.Assert.assertNotNull(strTokenizer89);
        org.junit.Assert.assertNotNull(strMatcher90);
        org.junit.Assert.assertNotNull(strTokenizer92);
        org.junit.Assert.assertNotNull(strTokenizer93);
        org.junit.Assert.assertNotNull(strMatcher94);
        org.junit.Assert.assertNotNull(strTokenizer96);
    }

    @Test
    public void test1699() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1699");
        char[] charArray2 = new char[] { '4', ' ' };
        org.apache.commons.lang3.text.StrTokenizer strTokenizer5 = new org.apache.commons.lang3.text.StrTokenizer(charArray2, 'a', ' ');
        org.apache.commons.lang3.text.StrMatcher strMatcher6 = strTokenizer5.getTrimmerMatcher();
        org.apache.commons.lang3.text.StrTokenizer strTokenizer8 = strTokenizer5.setDelimiterString("");
        org.apache.commons.lang3.text.StrTokenizer strTokenizer10 = strTokenizer8.reset("");
        org.apache.commons.lang3.text.StrTokenizer strTokenizer11 = strTokenizer8.reset();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str12 = strTokenizer8.next();
            org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException; message: null");
        } catch (java.util.NoSuchElementException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray2);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray2), "4 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray2), "4 ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray2), "[4,  ]");
        org.junit.Assert.assertNotNull(strMatcher6);
        org.junit.Assert.assertNotNull(strTokenizer8);
        org.junit.Assert.assertNotNull(strTokenizer10);
        org.junit.Assert.assertNotNull(strTokenizer11);
    }

    @Test
    public void test1700() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1700");
        org.apache.commons.lang3.text.StrTokenizer strTokenizer1 = new org.apache.commons.lang3.text.StrTokenizer("StrTokenizer[]");
        boolean boolean2 = strTokenizer1.hasNext();
        org.apache.commons.lang3.text.StrTokenizer strTokenizer4 = strTokenizer1.reset("a#");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(strTokenizer4);
    }

    @Test
    public void test1701() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1701");
        org.apache.commons.lang3.text.StrTokenizer strTokenizer1 = org.apache.commons.lang3.text.StrTokenizer.getCSVInstance("");
        java.util.List<java.lang.String> strList2 = strTokenizer1.getTokenList();
        boolean boolean3 = strTokenizer1.hasPrevious();
        java.lang.String[] strArray4 = strTokenizer1.getTokenArray();
        char[] charArray7 = new char[] { '4', ' ' };
        org.apache.commons.lang3.text.StrTokenizer strTokenizer10 = new org.apache.commons.lang3.text.StrTokenizer(charArray7, 'a', ' ');
        org.apache.commons.lang3.text.StrTokenizer strTokenizer11 = org.apache.commons.lang3.text.StrTokenizer.getCSVInstance(charArray7);
        org.apache.commons.lang3.text.StrMatcher strMatcher12 = null;
        org.apache.commons.lang3.text.StrTokenizer strTokenizer13 = new org.apache.commons.lang3.text.StrTokenizer(charArray7, strMatcher12);
        char[] charArray16 = new char[] { '4', ' ' };
        org.apache.commons.lang3.text.StrTokenizer strTokenizer19 = new org.apache.commons.lang3.text.StrTokenizer(charArray16, 'a', ' ');
        org.apache.commons.lang3.text.StrMatcher strMatcher20 = strTokenizer19.getTrimmerMatcher();
        org.apache.commons.lang3.text.StrTokenizer strTokenizer22 = strTokenizer19.setDelimiterString("");
        org.apache.commons.lang3.text.StrMatcher strMatcher23 = strTokenizer22.getTrimmerMatcher();
        org.apache.commons.lang3.text.StrTokenizer strTokenizer24 = new org.apache.commons.lang3.text.StrTokenizer(charArray7, strMatcher23);
        org.apache.commons.lang3.text.StrTokenizer strTokenizer25 = strTokenizer1.setTrimmerMatcher(strMatcher23);
        java.lang.String str26 = strTokenizer25.nextToken();
        org.apache.commons.lang3.text.StrTokenizer strTokenizer27 = strTokenizer25.reset();
        org.junit.Assert.assertNotNull(strTokenizer1);
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertNotNull(charArray7);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray7), "4 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray7), "4 ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray7), "[4,  ]");
        org.junit.Assert.assertNotNull(strTokenizer11);
        org.junit.Assert.assertNotNull(charArray16);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray16), "4 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray16), "4 ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray16), "[4,  ]");
        org.junit.Assert.assertNotNull(strMatcher20);
        org.junit.Assert.assertNotNull(strTokenizer22);
        org.junit.Assert.assertNotNull(strMatcher23);
        org.junit.Assert.assertNotNull(strTokenizer25);
        org.junit.Assert.assertNull(str26);
        org.junit.Assert.assertNotNull(strTokenizer27);
    }

    @Test
    public void test1702() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1702");
        org.apache.commons.lang3.text.StrTokenizer strTokenizer1 = new org.apache.commons.lang3.text.StrTokenizer("StrTokenizer[4]");
        char[] charArray4 = new char[] { '4', ' ' };
        org.apache.commons.lang3.text.StrTokenizer strTokenizer7 = new org.apache.commons.lang3.text.StrTokenizer(charArray4, 'a', ' ');
        org.apache.commons.lang3.text.StrTokenizer strTokenizer10 = new org.apache.commons.lang3.text.StrTokenizer(charArray4, '4', 'a');
        org.apache.commons.lang3.text.StrTokenizer strTokenizer12 = strTokenizer10.setIgnoreEmptyTokens(true);
        org.apache.commons.lang3.text.StrMatcher strMatcher13 = strTokenizer10.getIgnoredMatcher();
        java.lang.Object obj14 = strTokenizer10.clone();
        char[] charArray17 = new char[] { '4', ' ' };
        org.apache.commons.lang3.text.StrTokenizer strTokenizer20 = new org.apache.commons.lang3.text.StrTokenizer(charArray17, 'a', ' ');
        org.apache.commons.lang3.text.StrMatcher strMatcher21 = strTokenizer20.getTrimmerMatcher();
        org.apache.commons.lang3.text.StrTokenizer strTokenizer23 = strTokenizer20.setDelimiterString("");
        char[] charArray26 = new char[] { '4', ' ' };
        org.apache.commons.lang3.text.StrTokenizer strTokenizer29 = new org.apache.commons.lang3.text.StrTokenizer(charArray26, 'a', ' ');
        org.apache.commons.lang3.text.StrTokenizer strTokenizer30 = org.apache.commons.lang3.text.StrTokenizer.getTSVInstance(charArray26);
        org.apache.commons.lang3.text.StrTokenizer strTokenizer31 = org.apache.commons.lang3.text.StrTokenizer.getTSVInstance(charArray26);
        org.apache.commons.lang3.text.StrTokenizer strTokenizer33 = new org.apache.commons.lang3.text.StrTokenizer(charArray26, "4 ");
        org.apache.commons.lang3.text.StrTokenizer strTokenizer34 = strTokenizer20.reset(charArray26);
        org.apache.commons.lang3.text.StrTokenizer strTokenizer37 = new org.apache.commons.lang3.text.StrTokenizer(charArray26, '4', ' ');
        org.apache.commons.lang3.text.StrTokenizer strTokenizer38 = strTokenizer10.reset(charArray26);
        org.apache.commons.lang3.text.StrTokenizer strTokenizer39 = strTokenizer1.reset(charArray26);
        org.apache.commons.lang3.text.StrMatcher strMatcher40 = strTokenizer39.getTrimmerMatcher();
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray4), "4 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray4), "4 ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray4), "[4,  ]");
        org.junit.Assert.assertNotNull(strTokenizer12);
        org.junit.Assert.assertNotNull(strMatcher13);
        org.junit.Assert.assertNotNull(obj14);
        org.junit.Assert.assertEquals(obj14.toString(), "StrTokenizer[not tokenized yet]");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj14), "StrTokenizer[not tokenized yet]");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj14), "StrTokenizer[not tokenized yet]");
        org.junit.Assert.assertNotNull(charArray17);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray17), "4 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray17), "4 ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray17), "[4,  ]");
        org.junit.Assert.assertNotNull(strMatcher21);
        org.junit.Assert.assertNotNull(strTokenizer23);
        org.junit.Assert.assertNotNull(charArray26);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray26), "4 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray26), "4 ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray26), "[4,  ]");
        org.junit.Assert.assertNotNull(strTokenizer30);
        org.junit.Assert.assertNotNull(strTokenizer31);
        org.junit.Assert.assertNotNull(strTokenizer34);
        org.junit.Assert.assertNotNull(strTokenizer38);
        org.junit.Assert.assertNotNull(strTokenizer39);
        org.junit.Assert.assertNotNull(strMatcher40);
    }

    @Test
    public void test1703() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1703");
        org.apache.commons.lang3.text.StrTokenizer strTokenizer3 = new org.apache.commons.lang3.text.StrTokenizer("", 'a', 'a');
        org.apache.commons.lang3.text.StrTokenizer strTokenizer5 = strTokenizer3.setIgnoredChar('#');
        java.lang.String str6 = strTokenizer5.getContent();
        org.apache.commons.lang3.text.StrTokenizer strTokenizer8 = strTokenizer5.setIgnoredChar('a');
        // The following exception was thrown during execution in test generation
        try {
            strTokenizer8.set("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: set() is unsupported");
        } catch (java.lang.UnsupportedOperationException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strTokenizer5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(strTokenizer8);
    }

    @Test
    public void test1704() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1704");
        char[] charArray2 = new char[] { '4', ' ' };
        org.apache.commons.lang3.text.StrTokenizer strTokenizer5 = new org.apache.commons.lang3.text.StrTokenizer(charArray2, 'a', ' ');
        org.apache.commons.lang3.text.StrMatcher strMatcher6 = strTokenizer5.getTrimmerMatcher();
        char[] charArray9 = new char[] { '4', ' ' };
        org.apache.commons.lang3.text.StrTokenizer strTokenizer12 = new org.apache.commons.lang3.text.StrTokenizer(charArray9, 'a', ' ');
        org.apache.commons.lang3.text.StrTokenizer strTokenizer13 = org.apache.commons.lang3.text.StrTokenizer.getCSVInstance(charArray9);
        org.apache.commons.lang3.text.StrMatcher strMatcher14 = null;
        org.apache.commons.lang3.text.StrTokenizer strTokenizer15 = new org.apache.commons.lang3.text.StrTokenizer(charArray9, strMatcher14);
        org.apache.commons.lang3.text.StrTokenizer strTokenizer16 = strTokenizer5.reset(charArray9);
        java.lang.Object obj17 = strTokenizer5.clone();
        boolean boolean18 = strTokenizer5.hasNext();
        java.lang.String str19 = strTokenizer5.next();
        org.apache.commons.lang3.text.StrTokenizer strTokenizer21 = strTokenizer5.setDelimiterChar(' ');
        org.apache.commons.lang3.text.StrMatcher strMatcher22 = strTokenizer5.getDelimiterMatcher();
        org.junit.Assert.assertNotNull(charArray2);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray2), "4 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray2), "4 ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray2), "[4,  ]");
        org.junit.Assert.assertNotNull(strMatcher6);
        org.junit.Assert.assertNotNull(charArray9);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray9), "4 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray9), "4 ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray9), "[4,  ]");
        org.junit.Assert.assertNotNull(strTokenizer13);
        org.junit.Assert.assertNotNull(strTokenizer16);
        org.junit.Assert.assertNotNull(obj17);
        org.junit.Assert.assertEquals(obj17.toString(), "StrTokenizer[not tokenized yet]");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj17), "StrTokenizer[not tokenized yet]");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj17), "StrTokenizer[not tokenized yet]");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "4 " + "'", str19, "4 ");
        org.junit.Assert.assertNotNull(strTokenizer21);
        org.junit.Assert.assertNotNull(strMatcher22);
    }

    @Test
    public void test1705() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1705");
        char[] charArray2 = new char[] { '4', ' ' };
        org.apache.commons.lang3.text.StrTokenizer strTokenizer5 = new org.apache.commons.lang3.text.StrTokenizer(charArray2, 'a', ' ');
        boolean boolean6 = strTokenizer5.hasPrevious();
        char[] charArray9 = new char[] { '4', ' ' };
        org.apache.commons.lang3.text.StrTokenizer strTokenizer12 = new org.apache.commons.lang3.text.StrTokenizer(charArray9, 'a', ' ');
        org.apache.commons.lang3.text.StrMatcher strMatcher13 = strTokenizer12.getTrimmerMatcher();
        org.apache.commons.lang3.text.StrMatcher strMatcher14 = strTokenizer12.getQuoteMatcher();
        org.apache.commons.lang3.text.StrTokenizer strTokenizer15 = strTokenizer5.setIgnoredMatcher(strMatcher14);
        java.lang.String str16 = strTokenizer5.toString();
        java.lang.String[] strArray17 = strTokenizer5.getTokenArray();
        org.apache.commons.lang3.text.StrMatcher strMatcher18 = strTokenizer5.getDelimiterMatcher();
        org.junit.Assert.assertNotNull(charArray2);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray2), "4 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray2), "4 ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray2), "[4,  ]");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(charArray9);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray9), "4 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray9), "4 ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray9), "[4,  ]");
        org.junit.Assert.assertNotNull(strMatcher13);
        org.junit.Assert.assertNotNull(strMatcher14);
        org.junit.Assert.assertNotNull(strTokenizer15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "StrTokenizer[4 ]" + "'", str16, "StrTokenizer[4 ]");
        org.junit.Assert.assertNotNull(strArray17);
        org.junit.Assert.assertNotNull(strMatcher18);
    }

    @Test
    public void test1706() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1706");
        org.apache.commons.lang3.text.StrTokenizer strTokenizer2 = new org.apache.commons.lang3.text.StrTokenizer(" ", " ");
        int int3 = strTokenizer2.nextIndex();
        java.lang.Object obj4 = strTokenizer2.clone();
        org.apache.commons.lang3.text.StrMatcher strMatcher5 = strTokenizer2.getTrimmerMatcher();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(obj4);
        org.junit.Assert.assertEquals(obj4.toString(), "StrTokenizer[not tokenized yet]");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj4), "StrTokenizer[not tokenized yet]");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj4), "StrTokenizer[not tokenized yet]");
        org.junit.Assert.assertNotNull(strMatcher5);
    }

    @Test
    public void test1707() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1707");
        char[] charArray3 = new char[] { 'a', '#' };
        org.apache.commons.lang3.text.StrTokenizer strTokenizer4 = org.apache.commons.lang3.text.StrTokenizer.getCSVInstance(charArray3);
        org.apache.commons.lang3.text.StrMatcher strMatcher5 = strTokenizer4.getIgnoredMatcher();
        org.apache.commons.lang3.text.StrTokenizer strTokenizer6 = new org.apache.commons.lang3.text.StrTokenizer("StrTokenizer[]", strMatcher5);
        char[] charArray9 = new char[] { '4', ' ' };
        org.apache.commons.lang3.text.StrTokenizer strTokenizer12 = new org.apache.commons.lang3.text.StrTokenizer(charArray9, 'a', ' ');
        org.apache.commons.lang3.text.StrTokenizer strTokenizer13 = org.apache.commons.lang3.text.StrTokenizer.getCSVInstance(charArray9);
        org.apache.commons.lang3.text.StrTokenizer strTokenizer14 = org.apache.commons.lang3.text.StrTokenizer.getCSVInstance(charArray9);
        org.apache.commons.lang3.text.StrTokenizer strTokenizer15 = new org.apache.commons.lang3.text.StrTokenizer(charArray9);
        org.apache.commons.lang3.text.StrTokenizer strTokenizer17 = new org.apache.commons.lang3.text.StrTokenizer(charArray9, '#');
        char[] charArray20 = new char[] { '4', ' ' };
        org.apache.commons.lang3.text.StrTokenizer strTokenizer23 = new org.apache.commons.lang3.text.StrTokenizer(charArray20, 'a', ' ');
        org.apache.commons.lang3.text.StrMatcher strMatcher24 = strTokenizer23.getTrimmerMatcher();
        char[] charArray27 = new char[] { '4', ' ' };
        org.apache.commons.lang3.text.StrTokenizer strTokenizer30 = new org.apache.commons.lang3.text.StrTokenizer(charArray27, 'a', ' ');
        org.apache.commons.lang3.text.StrTokenizer strTokenizer31 = org.apache.commons.lang3.text.StrTokenizer.getCSVInstance(charArray27);
        org.apache.commons.lang3.text.StrMatcher strMatcher32 = null;
        org.apache.commons.lang3.text.StrTokenizer strTokenizer33 = new org.apache.commons.lang3.text.StrTokenizer(charArray27, strMatcher32);
        org.apache.commons.lang3.text.StrTokenizer strTokenizer34 = strTokenizer23.reset(charArray27);
        java.lang.String str35 = strTokenizer34.toString();
        org.apache.commons.lang3.text.StrMatcher strMatcher36 = strTokenizer34.getDelimiterMatcher();
        org.apache.commons.lang3.text.StrTokenizer strTokenizer37 = new org.apache.commons.lang3.text.StrTokenizer(charArray9, strMatcher36);
        org.apache.commons.lang3.text.StrTokenizer strTokenizer38 = strTokenizer6.setQuoteMatcher(strMatcher36);
        org.apache.commons.lang3.text.StrTokenizer strTokenizer40 = strTokenizer38.setDelimiterChar('#');
        org.apache.commons.lang3.text.StrTokenizer strTokenizer42 = strTokenizer38.setDelimiterChar(' ');
        org.apache.commons.lang3.text.StrMatcher strMatcher43 = strTokenizer38.getIgnoredMatcher();
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray3), "a#");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray3), "a#");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray3), "[a, #]");
        org.junit.Assert.assertNotNull(strTokenizer4);
        org.junit.Assert.assertNotNull(strMatcher5);
        org.junit.Assert.assertNotNull(charArray9);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray9), "4 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray9), "4 ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray9), "[4,  ]");
        org.junit.Assert.assertNotNull(strTokenizer13);
        org.junit.Assert.assertNotNull(strTokenizer14);
        org.junit.Assert.assertNotNull(charArray20);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray20), "4 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray20), "4 ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray20), "[4,  ]");
        org.junit.Assert.assertNotNull(strMatcher24);
        org.junit.Assert.assertNotNull(charArray27);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray27), "4 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray27), "4 ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray27), "[4,  ]");
        org.junit.Assert.assertNotNull(strTokenizer31);
        org.junit.Assert.assertNotNull(strTokenizer34);
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "StrTokenizer[not tokenized yet]" + "'", str35, "StrTokenizer[not tokenized yet]");
        org.junit.Assert.assertNotNull(strMatcher36);
        org.junit.Assert.assertNotNull(strTokenizer38);
        org.junit.Assert.assertNotNull(strTokenizer40);
        org.junit.Assert.assertNotNull(strTokenizer42);
        org.junit.Assert.assertNotNull(strMatcher43);
    }

    @Test
    public void test1708() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1708");
        char[] charArray2 = new char[] { '4', ' ' };
        org.apache.commons.lang3.text.StrTokenizer strTokenizer5 = new org.apache.commons.lang3.text.StrTokenizer(charArray2, 'a', ' ');
        org.apache.commons.lang3.text.StrTokenizer strTokenizer6 = org.apache.commons.lang3.text.StrTokenizer.getCSVInstance(charArray2);
        org.apache.commons.lang3.text.StrTokenizer strTokenizer7 = org.apache.commons.lang3.text.StrTokenizer.getCSVInstance(charArray2);
        char[] charArray11 = new char[] { '4', ' ' };
        org.apache.commons.lang3.text.StrTokenizer strTokenizer14 = new org.apache.commons.lang3.text.StrTokenizer(charArray11, 'a', ' ');
        org.apache.commons.lang3.text.StrMatcher strMatcher15 = strTokenizer14.getTrimmerMatcher();
        char[] charArray18 = new char[] { '4', ' ' };
        org.apache.commons.lang3.text.StrTokenizer strTokenizer21 = new org.apache.commons.lang3.text.StrTokenizer(charArray18, 'a', ' ');
        org.apache.commons.lang3.text.StrTokenizer strTokenizer22 = org.apache.commons.lang3.text.StrTokenizer.getCSVInstance(charArray18);
        org.apache.commons.lang3.text.StrMatcher strMatcher23 = null;
        org.apache.commons.lang3.text.StrTokenizer strTokenizer24 = new org.apache.commons.lang3.text.StrTokenizer(charArray18, strMatcher23);
        org.apache.commons.lang3.text.StrTokenizer strTokenizer25 = strTokenizer14.reset(charArray18);
        org.apache.commons.lang3.text.StrMatcher strMatcher26 = strTokenizer25.getIgnoredMatcher();
        org.apache.commons.lang3.text.StrTokenizer strTokenizer27 = new org.apache.commons.lang3.text.StrTokenizer("", strMatcher26);
        char[] charArray30 = new char[] { '4', ' ' };
        org.apache.commons.lang3.text.StrTokenizer strTokenizer33 = new org.apache.commons.lang3.text.StrTokenizer(charArray30, 'a', ' ');
        org.apache.commons.lang3.text.StrTokenizer strTokenizer34 = org.apache.commons.lang3.text.StrTokenizer.getCSVInstance(charArray30);
        org.apache.commons.lang3.text.StrMatcher strMatcher35 = null;
        org.apache.commons.lang3.text.StrTokenizer strTokenizer36 = new org.apache.commons.lang3.text.StrTokenizer(charArray30, strMatcher35);
        char[] charArray37 = null;
        org.apache.commons.lang3.text.StrTokenizer strTokenizer39 = new org.apache.commons.lang3.text.StrTokenizer(charArray37, "");
        org.apache.commons.lang3.text.StrMatcher strMatcher40 = strTokenizer39.getQuoteMatcher();
        char[] charArray44 = new char[] { '4', ' ' };
        org.apache.commons.lang3.text.StrTokenizer strTokenizer47 = new org.apache.commons.lang3.text.StrTokenizer(charArray44, 'a', ' ');
        org.apache.commons.lang3.text.StrMatcher strMatcher48 = strTokenizer47.getTrimmerMatcher();
        org.apache.commons.lang3.text.StrTokenizer strTokenizer50 = strTokenizer47.setDelimiterString("");
        org.apache.commons.lang3.text.StrMatcher strMatcher51 = strTokenizer50.getTrimmerMatcher();
        org.apache.commons.lang3.text.StrTokenizer strTokenizer52 = new org.apache.commons.lang3.text.StrTokenizer("", strMatcher51);
        char[] charArray55 = new char[] { '4', ' ' };
        org.apache.commons.lang3.text.StrTokenizer strTokenizer58 = new org.apache.commons.lang3.text.StrTokenizer(charArray55, 'a', ' ');
        org.apache.commons.lang3.text.StrMatcher strMatcher59 = strTokenizer58.getTrimmerMatcher();
        org.apache.commons.lang3.text.StrMatcher strMatcher60 = strTokenizer58.getQuoteMatcher();
        org.apache.commons.lang3.text.StrTokenizer strTokenizer61 = strTokenizer52.setDelimiterMatcher(strMatcher60);
        org.apache.commons.lang3.text.StrTokenizer strTokenizer62 = new org.apache.commons.lang3.text.StrTokenizer(charArray30, strMatcher40, strMatcher60);
        org.apache.commons.lang3.text.StrTokenizer strTokenizer63 = new org.apache.commons.lang3.text.StrTokenizer(charArray2, strMatcher26, strMatcher40);
        int int64 = strTokenizer63.previousIndex();
        org.apache.commons.lang3.text.StrTokenizer strTokenizer66 = strTokenizer63.setDelimiterChar('#');
        boolean boolean67 = strTokenizer66.hasNext();
        org.junit.Assert.assertNotNull(charArray2);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray2), "4 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray2), "4 ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray2), "[4,  ]");
        org.junit.Assert.assertNotNull(strTokenizer6);
        org.junit.Assert.assertNotNull(strTokenizer7);
        org.junit.Assert.assertNotNull(charArray11);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray11), "4 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray11), "4 ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray11), "[4,  ]");
        org.junit.Assert.assertNotNull(strMatcher15);
        org.junit.Assert.assertNotNull(charArray18);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray18), "4 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray18), "4 ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray18), "[4,  ]");
        org.junit.Assert.assertNotNull(strTokenizer22);
        org.junit.Assert.assertNotNull(strTokenizer25);
        org.junit.Assert.assertNotNull(strMatcher26);
        org.junit.Assert.assertNotNull(charArray30);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray30), "4 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray30), "4 ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray30), "[4,  ]");
        org.junit.Assert.assertNotNull(strTokenizer34);
        org.junit.Assert.assertNotNull(strMatcher40);
        org.junit.Assert.assertNotNull(charArray44);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray44), "4 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray44), "4 ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray44), "[4,  ]");
        org.junit.Assert.assertNotNull(strMatcher48);
        org.junit.Assert.assertNotNull(strTokenizer50);
        org.junit.Assert.assertNotNull(strMatcher51);
        org.junit.Assert.assertNotNull(charArray55);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray55), "4 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray55), "4 ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray55), "[4,  ]");
        org.junit.Assert.assertNotNull(strMatcher59);
        org.junit.Assert.assertNotNull(strMatcher60);
        org.junit.Assert.assertNotNull(strTokenizer61);
        org.junit.Assert.assertTrue("'" + int64 + "' != '" + (-1) + "'", int64 == (-1));
        org.junit.Assert.assertNotNull(strTokenizer66);
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + true + "'", boolean67 == true);
    }

    @Test
    public void test1709() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1709");
        char[] charArray3 = new char[] { '4', ' ' };
        org.apache.commons.lang3.text.StrTokenizer strTokenizer6 = new org.apache.commons.lang3.text.StrTokenizer(charArray3, 'a', ' ');
        org.apache.commons.lang3.text.StrTokenizer strTokenizer7 = org.apache.commons.lang3.text.StrTokenizer.getCSVInstance(charArray3);
        org.apache.commons.lang3.text.StrTokenizer strTokenizer8 = org.apache.commons.lang3.text.StrTokenizer.getCSVInstance(charArray3);
        org.apache.commons.lang3.text.StrTokenizer strTokenizer9 = new org.apache.commons.lang3.text.StrTokenizer(charArray3);
        org.apache.commons.lang3.text.StrTokenizer strTokenizer11 = new org.apache.commons.lang3.text.StrTokenizer(charArray3, '#');
        char[] charArray14 = new char[] { '4', ' ' };
        org.apache.commons.lang3.text.StrTokenizer strTokenizer17 = new org.apache.commons.lang3.text.StrTokenizer(charArray14, 'a', ' ');
        org.apache.commons.lang3.text.StrMatcher strMatcher18 = strTokenizer17.getTrimmerMatcher();
        char[] charArray21 = new char[] { '4', ' ' };
        org.apache.commons.lang3.text.StrTokenizer strTokenizer24 = new org.apache.commons.lang3.text.StrTokenizer(charArray21, 'a', ' ');
        org.apache.commons.lang3.text.StrTokenizer strTokenizer25 = org.apache.commons.lang3.text.StrTokenizer.getCSVInstance(charArray21);
        org.apache.commons.lang3.text.StrMatcher strMatcher26 = null;
        org.apache.commons.lang3.text.StrTokenizer strTokenizer27 = new org.apache.commons.lang3.text.StrTokenizer(charArray21, strMatcher26);
        org.apache.commons.lang3.text.StrTokenizer strTokenizer28 = strTokenizer17.reset(charArray21);
        java.lang.String str29 = strTokenizer28.toString();
        org.apache.commons.lang3.text.StrMatcher strMatcher30 = strTokenizer28.getDelimiterMatcher();
        org.apache.commons.lang3.text.StrTokenizer strTokenizer31 = new org.apache.commons.lang3.text.StrTokenizer(charArray3, strMatcher30);
        org.apache.commons.lang3.text.StrTokenizer strTokenizer33 = org.apache.commons.lang3.text.StrTokenizer.getCSVInstance("");
        java.util.List<java.lang.String> strList34 = strTokenizer33.getTokenList();
        char[] charArray37 = new char[] { '4', ' ' };
        org.apache.commons.lang3.text.StrTokenizer strTokenizer40 = new org.apache.commons.lang3.text.StrTokenizer(charArray37, 'a', ' ');
        org.apache.commons.lang3.text.StrMatcher strMatcher41 = strTokenizer40.getTrimmerMatcher();
        char[] charArray44 = new char[] { '4', ' ' };
        org.apache.commons.lang3.text.StrTokenizer strTokenizer47 = new org.apache.commons.lang3.text.StrTokenizer(charArray44, 'a', ' ');
        org.apache.commons.lang3.text.StrTokenizer strTokenizer48 = org.apache.commons.lang3.text.StrTokenizer.getCSVInstance(charArray44);
        org.apache.commons.lang3.text.StrMatcher strMatcher49 = null;
        org.apache.commons.lang3.text.StrTokenizer strTokenizer50 = new org.apache.commons.lang3.text.StrTokenizer(charArray44, strMatcher49);
        org.apache.commons.lang3.text.StrTokenizer strTokenizer51 = strTokenizer40.reset(charArray44);
        org.apache.commons.lang3.text.StrTokenizer strTokenizer52 = org.apache.commons.lang3.text.StrTokenizer.getCSVInstance(charArray44);
        org.apache.commons.lang3.text.StrTokenizer strTokenizer53 = new org.apache.commons.lang3.text.StrTokenizer(charArray44);
        org.apache.commons.lang3.text.StrTokenizer strTokenizer55 = strTokenizer53.setDelimiterChar('4');
        org.apache.commons.lang3.text.StrMatcher strMatcher56 = strTokenizer53.getDelimiterMatcher();
        org.apache.commons.lang3.text.StrTokenizer strTokenizer57 = strTokenizer33.setDelimiterMatcher(strMatcher56);
        org.apache.commons.lang3.text.StrMatcher strMatcher58 = strTokenizer57.getQuoteMatcher();
        org.apache.commons.lang3.text.StrTokenizer strTokenizer59 = new org.apache.commons.lang3.text.StrTokenizer("", strMatcher30, strMatcher58);
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray3), "4 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray3), "4 ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray3), "[4,  ]");
        org.junit.Assert.assertNotNull(strTokenizer7);
        org.junit.Assert.assertNotNull(strTokenizer8);
        org.junit.Assert.assertNotNull(charArray14);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray14), "4 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray14), "4 ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray14), "[4,  ]");
        org.junit.Assert.assertNotNull(strMatcher18);
        org.junit.Assert.assertNotNull(charArray21);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray21), "4 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray21), "4 ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray21), "[4,  ]");
        org.junit.Assert.assertNotNull(strTokenizer25);
        org.junit.Assert.assertNotNull(strTokenizer28);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "StrTokenizer[not tokenized yet]" + "'", str29, "StrTokenizer[not tokenized yet]");
        org.junit.Assert.assertNotNull(strMatcher30);
        org.junit.Assert.assertNotNull(strTokenizer33);
        org.junit.Assert.assertNotNull(strList34);
        org.junit.Assert.assertNotNull(charArray37);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray37), "4 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray37), "4 ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray37), "[4,  ]");
        org.junit.Assert.assertNotNull(strMatcher41);
        org.junit.Assert.assertNotNull(charArray44);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray44), "4 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray44), "4 ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray44), "[4,  ]");
        org.junit.Assert.assertNotNull(strTokenizer48);
        org.junit.Assert.assertNotNull(strTokenizer51);
        org.junit.Assert.assertNotNull(strTokenizer52);
        org.junit.Assert.assertNotNull(strTokenizer55);
        org.junit.Assert.assertNotNull(strMatcher56);
        org.junit.Assert.assertNotNull(strTokenizer57);
        org.junit.Assert.assertNotNull(strMatcher58);
    }

    @Test
    public void test1710() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1710");
        char[] charArray2 = new char[] { '4', ' ' };
        org.apache.commons.lang3.text.StrTokenizer strTokenizer5 = new org.apache.commons.lang3.text.StrTokenizer(charArray2, 'a', ' ');
        org.apache.commons.lang3.text.StrMatcher strMatcher6 = strTokenizer5.getTrimmerMatcher();
        org.apache.commons.lang3.text.StrTokenizer strTokenizer7 = strTokenizer5.reset();
        java.lang.Object obj8 = strTokenizer5.clone();
        org.apache.commons.lang3.text.StrTokenizer strTokenizer10 = strTokenizer5.setDelimiterString("4 ");
        org.junit.Assert.assertNotNull(charArray2);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray2), "4 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray2), "4 ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray2), "[4,  ]");
        org.junit.Assert.assertNotNull(strMatcher6);
        org.junit.Assert.assertNotNull(strTokenizer7);
        org.junit.Assert.assertNotNull(obj8);
        org.junit.Assert.assertEquals(obj8.toString(), "StrTokenizer[not tokenized yet]");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj8), "StrTokenizer[not tokenized yet]");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj8), "StrTokenizer[not tokenized yet]");
        org.junit.Assert.assertNotNull(strTokenizer10);
    }

    @Test
    public void test1711() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1711");
        char[] charArray2 = new char[] { '4', ' ' };
        org.apache.commons.lang3.text.StrTokenizer strTokenizer5 = new org.apache.commons.lang3.text.StrTokenizer(charArray2, 'a', ' ');
        org.apache.commons.lang3.text.StrMatcher strMatcher6 = strTokenizer5.getTrimmerMatcher();
        org.apache.commons.lang3.text.StrTokenizer strTokenizer8 = strTokenizer5.setDelimiterString("");
        char[] charArray12 = new char[] { '4', ' ' };
        org.apache.commons.lang3.text.StrTokenizer strTokenizer15 = new org.apache.commons.lang3.text.StrTokenizer(charArray12, 'a', ' ');
        org.apache.commons.lang3.text.StrMatcher strMatcher16 = strTokenizer15.getTrimmerMatcher();
        org.apache.commons.lang3.text.StrTokenizer strTokenizer18 = strTokenizer15.setDelimiterString("");
        org.apache.commons.lang3.text.StrMatcher strMatcher19 = strTokenizer18.getTrimmerMatcher();
        org.apache.commons.lang3.text.StrTokenizer strTokenizer20 = new org.apache.commons.lang3.text.StrTokenizer("", strMatcher19);
        char[] charArray23 = new char[] { '4', ' ' };
        org.apache.commons.lang3.text.StrTokenizer strTokenizer26 = new org.apache.commons.lang3.text.StrTokenizer(charArray23, 'a', ' ');
        org.apache.commons.lang3.text.StrMatcher strMatcher27 = strTokenizer26.getTrimmerMatcher();
        org.apache.commons.lang3.text.StrTokenizer strTokenizer29 = strTokenizer26.setDelimiterString("");
        org.apache.commons.lang3.text.StrMatcher strMatcher30 = strTokenizer29.getTrimmerMatcher();
        org.apache.commons.lang3.text.StrTokenizer strTokenizer31 = strTokenizer20.setTrimmerMatcher(strMatcher30);
        org.apache.commons.lang3.text.StrTokenizer strTokenizer32 = strTokenizer8.setTrimmerMatcher(strMatcher30);
        java.lang.String str33 = strTokenizer8.getContent();
        char[] charArray36 = new char[] { '4', ' ' };
        org.apache.commons.lang3.text.StrTokenizer strTokenizer39 = new org.apache.commons.lang3.text.StrTokenizer(charArray36, 'a', ' ');
        org.apache.commons.lang3.text.StrTokenizer strTokenizer42 = new org.apache.commons.lang3.text.StrTokenizer(charArray36, '4', 'a');
        char[] charArray45 = new char[] { '4', ' ' };
        org.apache.commons.lang3.text.StrTokenizer strTokenizer48 = new org.apache.commons.lang3.text.StrTokenizer(charArray45, 'a', ' ');
        org.apache.commons.lang3.text.StrMatcher strMatcher49 = strTokenizer48.getTrimmerMatcher();
        org.apache.commons.lang3.text.StrMatcher strMatcher50 = strTokenizer48.getQuoteMatcher();
        org.apache.commons.lang3.text.StrTokenizer strTokenizer51 = new org.apache.commons.lang3.text.StrTokenizer(charArray36, strMatcher50);
        org.apache.commons.lang3.text.StrTokenizer strTokenizer52 = strTokenizer8.reset(charArray36);
        org.apache.commons.lang3.text.StrTokenizer strTokenizer53 = org.apache.commons.lang3.text.StrTokenizer.getTSVInstance(charArray36);
        char[] charArray56 = new char[] { '4', ' ' };
        org.apache.commons.lang3.text.StrTokenizer strTokenizer59 = new org.apache.commons.lang3.text.StrTokenizer(charArray56, 'a', ' ');
        org.apache.commons.lang3.text.StrMatcher strMatcher60 = strTokenizer59.getTrimmerMatcher();
        org.apache.commons.lang3.text.StrTokenizer strTokenizer62 = strTokenizer59.setDelimiterString("");
        char[] charArray66 = new char[] { '4', ' ' };
        org.apache.commons.lang3.text.StrTokenizer strTokenizer69 = new org.apache.commons.lang3.text.StrTokenizer(charArray66, 'a', ' ');
        org.apache.commons.lang3.text.StrMatcher strMatcher70 = strTokenizer69.getTrimmerMatcher();
        org.apache.commons.lang3.text.StrTokenizer strTokenizer72 = strTokenizer69.setDelimiterString("");
        org.apache.commons.lang3.text.StrMatcher strMatcher73 = strTokenizer72.getTrimmerMatcher();
        org.apache.commons.lang3.text.StrTokenizer strTokenizer74 = new org.apache.commons.lang3.text.StrTokenizer("", strMatcher73);
        char[] charArray77 = new char[] { '4', ' ' };
        org.apache.commons.lang3.text.StrTokenizer strTokenizer80 = new org.apache.commons.lang3.text.StrTokenizer(charArray77, 'a', ' ');
        org.apache.commons.lang3.text.StrMatcher strMatcher81 = strTokenizer80.getTrimmerMatcher();
        org.apache.commons.lang3.text.StrTokenizer strTokenizer83 = strTokenizer80.setDelimiterString("");
        org.apache.commons.lang3.text.StrMatcher strMatcher84 = strTokenizer83.getTrimmerMatcher();
        org.apache.commons.lang3.text.StrTokenizer strTokenizer85 = strTokenizer74.setTrimmerMatcher(strMatcher84);
        org.apache.commons.lang3.text.StrTokenizer strTokenizer86 = strTokenizer62.setTrimmerMatcher(strMatcher84);
        org.apache.commons.lang3.text.StrMatcher strMatcher87 = strTokenizer62.getDelimiterMatcher();
        boolean boolean88 = strTokenizer62.isIgnoreEmptyTokens();
        org.apache.commons.lang3.text.StrMatcher strMatcher89 = strTokenizer62.getQuoteMatcher();
        org.apache.commons.lang3.text.StrTokenizer strTokenizer90 = new org.apache.commons.lang3.text.StrTokenizer(charArray36, strMatcher89);
        org.apache.commons.lang3.text.StrTokenizer strTokenizer93 = new org.apache.commons.lang3.text.StrTokenizer(charArray36, '#', ' ');
        org.junit.Assert.assertNotNull(charArray2);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray2), "4 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray2), "4 ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray2), "[4,  ]");
        org.junit.Assert.assertNotNull(strMatcher6);
        org.junit.Assert.assertNotNull(strTokenizer8);
        org.junit.Assert.assertNotNull(charArray12);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray12), "4 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray12), "4 ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray12), "[4,  ]");
        org.junit.Assert.assertNotNull(strMatcher16);
        org.junit.Assert.assertNotNull(strTokenizer18);
        org.junit.Assert.assertNotNull(strMatcher19);
        org.junit.Assert.assertNotNull(charArray23);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray23), "4 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray23), "4 ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray23), "[4,  ]");
        org.junit.Assert.assertNotNull(strMatcher27);
        org.junit.Assert.assertNotNull(strTokenizer29);
        org.junit.Assert.assertNotNull(strMatcher30);
        org.junit.Assert.assertNotNull(strTokenizer31);
        org.junit.Assert.assertNotNull(strTokenizer32);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "4 " + "'", str33, "4 ");
        org.junit.Assert.assertNotNull(charArray36);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray36), "4 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray36), "4 ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray36), "[4,  ]");
        org.junit.Assert.assertNotNull(charArray45);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray45), "4 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray45), "4 ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray45), "[4,  ]");
        org.junit.Assert.assertNotNull(strMatcher49);
        org.junit.Assert.assertNotNull(strMatcher50);
        org.junit.Assert.assertNotNull(strTokenizer52);
        org.junit.Assert.assertNotNull(strTokenizer53);
        org.junit.Assert.assertNotNull(charArray56);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray56), "4 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray56), "4 ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray56), "[4,  ]");
        org.junit.Assert.assertNotNull(strMatcher60);
        org.junit.Assert.assertNotNull(strTokenizer62);
        org.junit.Assert.assertNotNull(charArray66);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray66), "4 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray66), "4 ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray66), "[4,  ]");
        org.junit.Assert.assertNotNull(strMatcher70);
        org.junit.Assert.assertNotNull(strTokenizer72);
        org.junit.Assert.assertNotNull(strMatcher73);
        org.junit.Assert.assertNotNull(charArray77);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray77), "4 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray77), "4 ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray77), "[4,  ]");
        org.junit.Assert.assertNotNull(strMatcher81);
        org.junit.Assert.assertNotNull(strTokenizer83);
        org.junit.Assert.assertNotNull(strMatcher84);
        org.junit.Assert.assertNotNull(strTokenizer85);
        org.junit.Assert.assertNotNull(strTokenizer86);
        org.junit.Assert.assertNotNull(strMatcher87);
        org.junit.Assert.assertTrue("'" + boolean88 + "' != '" + true + "'", boolean88 == true);
        org.junit.Assert.assertNotNull(strMatcher89);
    }

    @Test
    public void test1712() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1712");
        org.apache.commons.lang3.text.StrTokenizer strTokenizer1 = new org.apache.commons.lang3.text.StrTokenizer("4");
        int int2 = strTokenizer1.nextIndex();
        org.apache.commons.lang3.text.StrTokenizer strTokenizer4 = strTokenizer1.setIgnoreEmptyTokens(false);
        char[] charArray5 = null;
        org.apache.commons.lang3.text.StrTokenizer strTokenizer8 = new org.apache.commons.lang3.text.StrTokenizer(charArray5, 'a', 'a');
        org.apache.commons.lang3.text.StrMatcher strMatcher9 = strTokenizer8.getIgnoredMatcher();
        org.apache.commons.lang3.text.StrTokenizer strTokenizer11 = strTokenizer8.setIgnoreEmptyTokens(true);
        org.apache.commons.lang3.text.StrTokenizer strTokenizer13 = strTokenizer11.setDelimiterString("");
        org.apache.commons.lang3.text.StrTokenizer strTokenizer15 = strTokenizer11.setEmptyTokenAsNull(true);
        char[] charArray18 = new char[] { '4', ' ' };
        org.apache.commons.lang3.text.StrTokenizer strTokenizer21 = new org.apache.commons.lang3.text.StrTokenizer(charArray18, 'a', ' ');
        org.apache.commons.lang3.text.StrTokenizer strTokenizer22 = org.apache.commons.lang3.text.StrTokenizer.getCSVInstance(charArray18);
        org.apache.commons.lang3.text.StrMatcher strMatcher23 = null;
        org.apache.commons.lang3.text.StrTokenizer strTokenizer24 = new org.apache.commons.lang3.text.StrTokenizer(charArray18, strMatcher23);
        org.apache.commons.lang3.text.StrTokenizer strTokenizer27 = new org.apache.commons.lang3.text.StrTokenizer(charArray18, ' ', '#');
        org.apache.commons.lang3.text.StrTokenizer strTokenizer28 = org.apache.commons.lang3.text.StrTokenizer.getTSVInstance(charArray18);
        int int29 = strTokenizer28.nextIndex();
        org.apache.commons.lang3.text.StrMatcher strMatcher30 = strTokenizer28.getIgnoredMatcher();
        org.apache.commons.lang3.text.StrTokenizer strTokenizer31 = strTokenizer15.setTrimmerMatcher(strMatcher30);
        org.apache.commons.lang3.text.StrMatcher strMatcher32 = strTokenizer31.getQuoteMatcher();
        org.apache.commons.lang3.text.StrTokenizer strTokenizer33 = strTokenizer4.setTrimmerMatcher(strMatcher32);
        boolean boolean34 = strTokenizer4.isEmptyTokenAsNull();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(strTokenizer4);
        org.junit.Assert.assertNotNull(strMatcher9);
        org.junit.Assert.assertNotNull(strTokenizer11);
        org.junit.Assert.assertNotNull(strTokenizer13);
        org.junit.Assert.assertNotNull(strTokenizer15);
        org.junit.Assert.assertNotNull(charArray18);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray18), "4 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray18), "4 ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray18), "[4,  ]");
        org.junit.Assert.assertNotNull(strTokenizer22);
        org.junit.Assert.assertNotNull(strTokenizer28);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertNotNull(strMatcher30);
        org.junit.Assert.assertNotNull(strTokenizer31);
        org.junit.Assert.assertNotNull(strMatcher32);
        org.junit.Assert.assertNotNull(strTokenizer33);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
    }

    @Test
    public void test1713() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1713");
        char[] charArray3 = new char[] { '4', ' ' };
        org.apache.commons.lang3.text.StrTokenizer strTokenizer6 = new org.apache.commons.lang3.text.StrTokenizer(charArray3, 'a', ' ');
        org.apache.commons.lang3.text.StrTokenizer strTokenizer8 = new org.apache.commons.lang3.text.StrTokenizer(charArray3, "hi!");
        org.apache.commons.lang3.text.StrTokenizer strTokenizer9 = new org.apache.commons.lang3.text.StrTokenizer(charArray3);
        org.apache.commons.lang3.text.StrTokenizer strTokenizer11 = strTokenizer9.reset("StrTokenizer[4 ]");
        char[] charArray14 = new char[] { '4', ' ' };
        org.apache.commons.lang3.text.StrTokenizer strTokenizer17 = new org.apache.commons.lang3.text.StrTokenizer(charArray14, 'a', ' ');
        org.apache.commons.lang3.text.StrMatcher strMatcher18 = strTokenizer17.getTrimmerMatcher();
        org.apache.commons.lang3.text.StrTokenizer strTokenizer20 = strTokenizer17.setDelimiterString("");
        org.apache.commons.lang3.text.StrMatcher strMatcher21 = strTokenizer20.getTrimmerMatcher();
        org.apache.commons.lang3.text.StrMatcher strMatcher22 = strTokenizer20.getTrimmerMatcher();
        char[] charArray25 = new char[] { '4', ' ' };
        org.apache.commons.lang3.text.StrTokenizer strTokenizer28 = new org.apache.commons.lang3.text.StrTokenizer(charArray25, 'a', ' ');
        org.apache.commons.lang3.text.StrTokenizer strTokenizer29 = strTokenizer20.reset(charArray25);
        char[] charArray32 = new char[] { '4', ' ' };
        org.apache.commons.lang3.text.StrTokenizer strTokenizer35 = new org.apache.commons.lang3.text.StrTokenizer(charArray32, 'a', ' ');
        org.apache.commons.lang3.text.StrMatcher strMatcher36 = strTokenizer35.getTrimmerMatcher();
        org.apache.commons.lang3.text.StrTokenizer strTokenizer38 = strTokenizer35.setDelimiterString("");
        char[] charArray42 = new char[] { '4', ' ' };
        org.apache.commons.lang3.text.StrTokenizer strTokenizer45 = new org.apache.commons.lang3.text.StrTokenizer(charArray42, 'a', ' ');
        org.apache.commons.lang3.text.StrMatcher strMatcher46 = strTokenizer45.getTrimmerMatcher();
        org.apache.commons.lang3.text.StrTokenizer strTokenizer48 = strTokenizer45.setDelimiterString("");
        org.apache.commons.lang3.text.StrMatcher strMatcher49 = strTokenizer48.getTrimmerMatcher();
        org.apache.commons.lang3.text.StrTokenizer strTokenizer50 = new org.apache.commons.lang3.text.StrTokenizer("", strMatcher49);
        char[] charArray53 = new char[] { '4', ' ' };
        org.apache.commons.lang3.text.StrTokenizer strTokenizer56 = new org.apache.commons.lang3.text.StrTokenizer(charArray53, 'a', ' ');
        org.apache.commons.lang3.text.StrMatcher strMatcher57 = strTokenizer56.getTrimmerMatcher();
        org.apache.commons.lang3.text.StrTokenizer strTokenizer59 = strTokenizer56.setDelimiterString("");
        org.apache.commons.lang3.text.StrMatcher strMatcher60 = strTokenizer59.getTrimmerMatcher();
        org.apache.commons.lang3.text.StrTokenizer strTokenizer61 = strTokenizer50.setTrimmerMatcher(strMatcher60);
        org.apache.commons.lang3.text.StrTokenizer strTokenizer62 = strTokenizer38.setTrimmerMatcher(strMatcher60);
        org.apache.commons.lang3.text.StrTokenizer strTokenizer63 = strTokenizer20.setQuoteMatcher(strMatcher60);
        org.apache.commons.lang3.text.StrTokenizer strTokenizer64 = strTokenizer9.setDelimiterMatcher(strMatcher60);
        org.apache.commons.lang3.text.StrTokenizer strTokenizer65 = new org.apache.commons.lang3.text.StrTokenizer("", strMatcher60);
        // The following exception was thrown during execution in test generation
        try {
            strTokenizer65.add("StrTokenizer[4]");
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: add() is unsupported");
        } catch (java.lang.UnsupportedOperationException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray3), "4 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray3), "4 ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray3), "[4,  ]");
        org.junit.Assert.assertNotNull(strTokenizer11);
        org.junit.Assert.assertNotNull(charArray14);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray14), "4 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray14), "4 ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray14), "[4,  ]");
        org.junit.Assert.assertNotNull(strMatcher18);
        org.junit.Assert.assertNotNull(strTokenizer20);
        org.junit.Assert.assertNotNull(strMatcher21);
        org.junit.Assert.assertNotNull(strMatcher22);
        org.junit.Assert.assertNotNull(charArray25);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray25), "4 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray25), "4 ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray25), "[4,  ]");
        org.junit.Assert.assertNotNull(strTokenizer29);
        org.junit.Assert.assertNotNull(charArray32);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray32), "4 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray32), "4 ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray32), "[4,  ]");
        org.junit.Assert.assertNotNull(strMatcher36);
        org.junit.Assert.assertNotNull(strTokenizer38);
        org.junit.Assert.assertNotNull(charArray42);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray42), "4 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray42), "4 ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray42), "[4,  ]");
        org.junit.Assert.assertNotNull(strMatcher46);
        org.junit.Assert.assertNotNull(strTokenizer48);
        org.junit.Assert.assertNotNull(strMatcher49);
        org.junit.Assert.assertNotNull(charArray53);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray53), "4 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray53), "4 ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray53), "[4,  ]");
        org.junit.Assert.assertNotNull(strMatcher57);
        org.junit.Assert.assertNotNull(strTokenizer59);
        org.junit.Assert.assertNotNull(strMatcher60);
        org.junit.Assert.assertNotNull(strTokenizer61);
        org.junit.Assert.assertNotNull(strTokenizer62);
        org.junit.Assert.assertNotNull(strTokenizer63);
        org.junit.Assert.assertNotNull(strTokenizer64);
    }

    @Test
    public void test1714() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1714");
        org.apache.commons.lang3.text.StrTokenizer strTokenizer1 = org.apache.commons.lang3.text.StrTokenizer.getTSVInstance("");
        org.apache.commons.lang3.text.StrMatcher strMatcher2 = strTokenizer1.getIgnoredMatcher();
        org.junit.Assert.assertNotNull(strTokenizer1);
        org.junit.Assert.assertNotNull(strMatcher2);
    }
}

