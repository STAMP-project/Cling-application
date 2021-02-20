import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest4 {

    public static boolean debug = false;

    @Test
    public void test2001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2001");
        org.apache.commons.lang3.text.StrSubstitutor strSubstitutor0 = new org.apache.commons.lang3.text.StrSubstitutor();
        org.apache.commons.lang3.text.StrSubstitutor strSubstitutor2 = strSubstitutor0.setVariablePrefix('a');
        java.lang.StringBuffer stringBuffer3 = null;
        java.lang.String str4 = strSubstitutor2.replace(stringBuffer3);
        org.apache.commons.lang3.text.StrBuilder strBuilder5 = null;
        java.lang.String str8 = strSubstitutor2.replace(strBuilder5, 0, (int) (byte) 1);
        java.lang.String str10 = strSubstitutor2.replace((java.lang.Object) (byte) 10);
        org.apache.commons.lang3.text.StrSubstitutor strSubstitutor12 = strSubstitutor2.setVariableSuffix(' ');
        org.apache.commons.lang3.text.StrBuilder strBuilder13 = null;
        java.lang.String str16 = strSubstitutor12.replace(strBuilder13, 100, (int) (byte) 0);
        org.apache.commons.lang3.text.StrMatcher strMatcher17 = strSubstitutor12.getVariableSuffixMatcher();
        org.apache.commons.lang3.text.StrBuilder strBuilder18 = null;
        boolean boolean19 = strSubstitutor12.replaceIn(strBuilder18);
        org.junit.Assert.assertNotNull(strSubstitutor2);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "10" + "'", str10, "10");
        org.junit.Assert.assertNotNull(strSubstitutor12);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertNotNull(strMatcher17);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test2002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2002");
        org.apache.commons.lang3.text.StrSubstitutor strSubstitutor0 = new org.apache.commons.lang3.text.StrSubstitutor();
        org.apache.commons.lang3.text.StrSubstitutor strSubstitutor2 = strSubstitutor0.setVariablePrefix('a');
        org.apache.commons.lang3.text.StrLookup<?> wildcardStrLookup3 = strSubstitutor0.getVariableResolver();
        org.apache.commons.lang3.text.StrBuilder strBuilder4 = null;
        boolean boolean7 = strSubstitutor0.replaceIn(strBuilder4, 100, (int) '4');
        org.apache.commons.lang3.text.StrSubstitutor strSubstitutor9 = strSubstitutor0.setVariablePrefix("true");
        org.apache.commons.lang3.text.StrSubstitutor strSubstitutor11 = strSubstitutor9.setVariableSuffix('a');
        org.apache.commons.lang3.text.StrLookup<?> wildcardStrLookup12 = strSubstitutor11.getVariableResolver();
        org.apache.commons.lang3.text.StrBuilder strBuilder13 = null;
        boolean boolean14 = strSubstitutor11.replaceIn(strBuilder13);
        org.apache.commons.lang3.text.StrSubstitutor strSubstitutor16 = strSubstitutor11.setVariableSuffix('4');
        java.lang.StringBuffer stringBuffer17 = null;
        boolean boolean20 = strSubstitutor16.replaceIn(stringBuffer17, (int) (byte) 100, (int) '4');
        org.junit.Assert.assertNotNull(strSubstitutor2);
        org.junit.Assert.assertNull(wildcardStrLookup3);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(strSubstitutor9);
        org.junit.Assert.assertNotNull(strSubstitutor11);
        org.junit.Assert.assertNull(wildcardStrLookup12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(strSubstitutor16);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test2003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2003");
        org.apache.commons.lang3.text.StrSubstitutor strSubstitutor0 = new org.apache.commons.lang3.text.StrSubstitutor();
        org.apache.commons.lang3.text.StrSubstitutor strSubstitutor2 = strSubstitutor0.setVariablePrefix('a');
        java.lang.StringBuffer stringBuffer3 = null;
        boolean boolean6 = strSubstitutor0.replaceIn(stringBuffer3, (int) 'a', 1);
        org.apache.commons.lang3.text.StrLookup<?> wildcardStrLookup7 = strSubstitutor0.getVariableResolver();
        boolean boolean8 = strSubstitutor0.isEnableSubstitutionInVariables();
        java.lang.StringBuffer stringBuffer9 = null;
        boolean boolean10 = strSubstitutor0.replaceIn(stringBuffer9);
        org.apache.commons.lang3.text.StrSubstitutor strSubstitutor12 = strSubstitutor0.setVariablePrefix("4##4");
        boolean boolean13 = strSubstitutor12.isEnableSubstitutionInVariables();
        java.lang.StringBuffer stringBuffer14 = null;
        java.lang.String str15 = strSubstitutor12.replace(stringBuffer14);
        java.lang.StringBuffer stringBuffer16 = null;
        boolean boolean19 = strSubstitutor12.replaceIn(stringBuffer16, (int) 'a', (int) (short) 1);
        org.apache.commons.lang3.text.StrMatcher strMatcher20 = strSubstitutor12.getVariableSuffixMatcher();
        org.junit.Assert.assertNotNull(strSubstitutor2);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(wildcardStrLookup7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(strSubstitutor12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(strMatcher20);
    }

    @Test
    public void test2004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2004");
        org.apache.commons.lang3.text.StrSubstitutor strSubstitutor0 = new org.apache.commons.lang3.text.StrSubstitutor();
        org.apache.commons.lang3.text.StrSubstitutor strSubstitutor2 = strSubstitutor0.setVariablePrefix('a');
        org.apache.commons.lang3.text.StrLookup<?> wildcardStrLookup3 = strSubstitutor0.getVariableResolver();
        org.apache.commons.lang3.text.StrBuilder strBuilder4 = null;
        boolean boolean7 = strSubstitutor0.replaceIn(strBuilder4, 100, (int) '4');
        org.apache.commons.lang3.text.StrSubstitutor strSubstitutor9 = strSubstitutor0.setVariablePrefix("true");
        org.apache.commons.lang3.text.StrSubstitutor strSubstitutor11 = strSubstitutor9.setVariableSuffix('a');
        org.apache.commons.lang3.text.StrLookup<?> wildcardStrLookup12 = strSubstitutor11.getVariableResolver();
        org.apache.commons.lang3.text.StrSubstitutor strSubstitutor14 = strSubstitutor11.setVariablePrefix(" a");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str18 = strSubstitutor14.replace("a", (int) (short) -1, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: startIndex must be valid");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strSubstitutor2);
        org.junit.Assert.assertNull(wildcardStrLookup3);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(strSubstitutor9);
        org.junit.Assert.assertNotNull(strSubstitutor11);
        org.junit.Assert.assertNull(wildcardStrLookup12);
        org.junit.Assert.assertNotNull(strSubstitutor14);
    }

    @Test
    public void test2005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2005");
        org.apache.commons.lang3.text.StrSubstitutor strSubstitutor0 = new org.apache.commons.lang3.text.StrSubstitutor();
        org.apache.commons.lang3.text.StrSubstitutor strSubstitutor2 = strSubstitutor0.setVariablePrefix('a');
        java.lang.StringBuffer stringBuffer3 = null;
        java.lang.String str6 = strSubstitutor2.replace(stringBuffer3, (int) (short) -1, (int) (short) -1);
        org.apache.commons.lang3.text.StrSubstitutor strSubstitutor7 = new org.apache.commons.lang3.text.StrSubstitutor();
        org.apache.commons.lang3.text.StrSubstitutor strSubstitutor9 = strSubstitutor7.setVariablePrefix('a');
        char char10 = strSubstitutor7.getEscapeChar();
        org.apache.commons.lang3.text.StrSubstitutor strSubstitutor11 = new org.apache.commons.lang3.text.StrSubstitutor();
        org.apache.commons.lang3.text.StrSubstitutor strSubstitutor13 = strSubstitutor11.setVariablePrefix('a');
        org.apache.commons.lang3.text.StrBuilder strBuilder14 = null;
        boolean boolean15 = strSubstitutor13.replaceIn(strBuilder14);
        org.apache.commons.lang3.text.StrMatcher strMatcher16 = strSubstitutor13.getVariableSuffixMatcher();
        org.apache.commons.lang3.text.StrSubstitutor strSubstitutor17 = strSubstitutor7.setVariableSuffixMatcher(strMatcher16);
        org.apache.commons.lang3.text.StrSubstitutor strSubstitutor18 = strSubstitutor2.setVariablePrefixMatcher(strMatcher16);
        org.apache.commons.lang3.text.StrBuilder strBuilder19 = null;
        java.lang.String str22 = strSubstitutor18.replace(strBuilder19, (int) (short) 10, (int) ' ');
        org.apache.commons.lang3.text.StrSubstitutor strSubstitutor23 = new org.apache.commons.lang3.text.StrSubstitutor();
        org.apache.commons.lang3.text.StrSubstitutor strSubstitutor25 = strSubstitutor23.setVariablePrefix('a');
        org.apache.commons.lang3.text.StrLookup<?> wildcardStrLookup26 = strSubstitutor23.getVariableResolver();
        org.apache.commons.lang3.text.StrSubstitutor strSubstitutor28 = strSubstitutor23.setVariableSuffix(' ');
        org.apache.commons.lang3.text.StrSubstitutor strSubstitutor29 = new org.apache.commons.lang3.text.StrSubstitutor();
        org.apache.commons.lang3.text.StrSubstitutor strSubstitutor31 = strSubstitutor29.setVariablePrefix('a');
        java.lang.StringBuffer stringBuffer32 = null;
        java.lang.String str35 = strSubstitutor31.replace(stringBuffer32, (int) (short) -1, (int) (short) -1);
        org.apache.commons.lang3.text.StrMatcher strMatcher36 = org.apache.commons.lang3.text.StrSubstitutor.DEFAULT_PREFIX;
        org.apache.commons.lang3.text.StrSubstitutor strSubstitutor37 = strSubstitutor31.setVariablePrefixMatcher(strMatcher36);
        org.apache.commons.lang3.text.StrSubstitutor strSubstitutor38 = strSubstitutor23.setVariableSuffixMatcher(strMatcher36);
        org.apache.commons.lang3.text.StrBuilder strBuilder39 = null;
        java.lang.String str40 = strSubstitutor23.replace(strBuilder39);
        org.apache.commons.lang3.text.StrSubstitutor strSubstitutor41 = new org.apache.commons.lang3.text.StrSubstitutor();
        org.apache.commons.lang3.text.StrSubstitutor strSubstitutor43 = strSubstitutor41.setVariablePrefix('a');
        java.lang.StringBuffer stringBuffer44 = null;
        java.lang.String str45 = strSubstitutor43.replace(stringBuffer44);
        org.apache.commons.lang3.text.StrMatcher strMatcher46 = strSubstitutor43.getVariableSuffixMatcher();
        org.apache.commons.lang3.text.StrSubstitutor strSubstitutor47 = strSubstitutor23.setVariablePrefixMatcher(strMatcher46);
        org.apache.commons.lang3.text.StrSubstitutor strSubstitutor48 = strSubstitutor18.setVariableSuffixMatcher(strMatcher46);
        org.apache.commons.lang3.text.StrSubstitutor strSubstitutor49 = new org.apache.commons.lang3.text.StrSubstitutor();
        org.apache.commons.lang3.text.StrSubstitutor strSubstitutor51 = strSubstitutor49.setVariablePrefix('a');
        org.apache.commons.lang3.text.StrLookup<?> wildcardStrLookup52 = strSubstitutor49.getVariableResolver();
        org.apache.commons.lang3.text.StrSubstitutor strSubstitutor54 = strSubstitutor49.setVariableSuffix(' ');
        strSubstitutor49.setEnableSubstitutionInVariables(true);
        java.lang.String str58 = strSubstitutor49.replace("true");
        org.apache.commons.lang3.text.StrMatcher strMatcher59 = strSubstitutor49.getVariableSuffixMatcher();
        org.apache.commons.lang3.text.StrSubstitutor strSubstitutor60 = strSubstitutor18.setVariablePrefixMatcher(strMatcher59);
        java.util.Properties properties61 = null;
        java.lang.String str62 = org.apache.commons.lang3.text.StrSubstitutor.replace((java.lang.Object) strSubstitutor60, properties61);
        boolean boolean63 = strSubstitutor60.isEnableSubstitutionInVariables();
        java.lang.Class<?> wildcardClass64 = strSubstitutor60.getClass();
        org.junit.Assert.assertNotNull(strSubstitutor2);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(strSubstitutor9);
        org.junit.Assert.assertTrue("'" + char10 + "' != '" + '$' + "'", char10 == '$');
        org.junit.Assert.assertNotNull(strSubstitutor13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(strMatcher16);
        org.junit.Assert.assertNotNull(strSubstitutor17);
        org.junit.Assert.assertNotNull(strSubstitutor18);
        org.junit.Assert.assertNull(str22);
        org.junit.Assert.assertNotNull(strSubstitutor25);
        org.junit.Assert.assertNull(wildcardStrLookup26);
        org.junit.Assert.assertNotNull(strSubstitutor28);
        org.junit.Assert.assertNotNull(strSubstitutor31);
        org.junit.Assert.assertNull(str35);
        org.junit.Assert.assertNotNull(strMatcher36);
        org.junit.Assert.assertNotNull(strSubstitutor37);
        org.junit.Assert.assertNotNull(strSubstitutor38);
        org.junit.Assert.assertNull(str40);
        org.junit.Assert.assertNotNull(strSubstitutor43);
        org.junit.Assert.assertNull(str45);
        org.junit.Assert.assertNotNull(strMatcher46);
        org.junit.Assert.assertNotNull(strSubstitutor47);
        org.junit.Assert.assertNotNull(strSubstitutor48);
        org.junit.Assert.assertNotNull(strSubstitutor51);
        org.junit.Assert.assertNull(wildcardStrLookup52);
        org.junit.Assert.assertNotNull(strSubstitutor54);
        org.junit.Assert.assertEquals("'" + str58 + "' != '" + "true" + "'", str58, "true");
        org.junit.Assert.assertNotNull(strMatcher59);
        org.junit.Assert.assertNotNull(strSubstitutor60);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + false + "'", boolean63 == false);
        org.junit.Assert.assertNotNull(wildcardClass64);
    }

    @Test
    public void test2006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2006");
        org.apache.commons.lang3.text.StrSubstitutor strSubstitutor0 = new org.apache.commons.lang3.text.StrSubstitutor();
        org.apache.commons.lang3.text.StrSubstitutor strSubstitutor2 = strSubstitutor0.setVariablePrefix('a');
        org.apache.commons.lang3.text.StrLookup<?> wildcardStrLookup3 = strSubstitutor0.getVariableResolver();
        org.apache.commons.lang3.text.StrSubstitutor strSubstitutor5 = strSubstitutor0.setVariableSuffix(' ');
        strSubstitutor0.setEnableSubstitutionInVariables(true);
        java.lang.String str9 = strSubstitutor0.replace("true");
        org.apache.commons.lang3.text.StrSubstitutor strSubstitutor11 = strSubstitutor0.setVariablePrefix("1");
        char char12 = strSubstitutor11.getEscapeChar();
        char char13 = strSubstitutor11.getEscapeChar();
        org.apache.commons.lang3.text.StrSubstitutor strSubstitutor14 = new org.apache.commons.lang3.text.StrSubstitutor();
        org.apache.commons.lang3.text.StrSubstitutor strSubstitutor16 = strSubstitutor14.setVariablePrefix('a');
        org.apache.commons.lang3.text.StrBuilder strBuilder17 = null;
        boolean boolean18 = strSubstitutor16.replaceIn(strBuilder17);
        org.apache.commons.lang3.text.StrBuilder strBuilder19 = null;
        boolean boolean20 = strSubstitutor16.replaceIn(strBuilder19);
        char[] charArray24 = new char[] { '4', 'a', '4' };
        java.lang.String str25 = strSubstitutor16.replace(charArray24);
        org.apache.commons.lang3.text.StrBuilder strBuilder26 = null;
        boolean boolean27 = strSubstitutor16.replaceIn(strBuilder26);
        org.apache.commons.lang3.text.StrSubstitutor strSubstitutor28 = new org.apache.commons.lang3.text.StrSubstitutor();
        org.apache.commons.lang3.text.StrSubstitutor strSubstitutor30 = strSubstitutor28.setVariablePrefix('a');
        char char31 = strSubstitutor28.getEscapeChar();
        org.apache.commons.lang3.text.StrSubstitutor strSubstitutor32 = new org.apache.commons.lang3.text.StrSubstitutor();
        org.apache.commons.lang3.text.StrSubstitutor strSubstitutor34 = strSubstitutor32.setVariablePrefix('a');
        org.apache.commons.lang3.text.StrBuilder strBuilder35 = null;
        boolean boolean36 = strSubstitutor34.replaceIn(strBuilder35);
        org.apache.commons.lang3.text.StrMatcher strMatcher37 = strSubstitutor34.getVariableSuffixMatcher();
        org.apache.commons.lang3.text.StrSubstitutor strSubstitutor38 = strSubstitutor28.setVariableSuffixMatcher(strMatcher37);
        org.apache.commons.lang3.text.StrSubstitutor strSubstitutor39 = strSubstitutor16.setVariableSuffixMatcher(strMatcher37);
        org.apache.commons.lang3.text.StrSubstitutor strSubstitutor40 = strSubstitutor11.setVariableSuffixMatcher(strMatcher37);
        org.apache.commons.lang3.text.StrBuilder strBuilder41 = null;
        boolean boolean42 = strSubstitutor11.replaceIn(strBuilder41);
        org.apache.commons.lang3.text.StrSubstitutor strSubstitutor44 = strSubstitutor11.setVariableSuffix('#');
        org.apache.commons.lang3.text.StrMatcher strMatcher45 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.text.StrSubstitutor strSubstitutor46 = strSubstitutor44.setVariableSuffixMatcher(strMatcher45);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Variable suffix matcher must not be null!");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strSubstitutor2);
        org.junit.Assert.assertNull(wildcardStrLookup3);
        org.junit.Assert.assertNotNull(strSubstitutor5);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "true" + "'", str9, "true");
        org.junit.Assert.assertNotNull(strSubstitutor11);
        org.junit.Assert.assertTrue("'" + char12 + "' != '" + '$' + "'", char12 == '$');
        org.junit.Assert.assertTrue("'" + char13 + "' != '" + '$' + "'", char13 == '$');
        org.junit.Assert.assertNotNull(strSubstitutor16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(charArray24);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray24), "4a4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray24), "4a4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray24), "[4, a, 4]");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "4a4" + "'", str25, "4a4");
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(strSubstitutor30);
        org.junit.Assert.assertTrue("'" + char31 + "' != '" + '$' + "'", char31 == '$');
        org.junit.Assert.assertNotNull(strSubstitutor34);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertNotNull(strMatcher37);
        org.junit.Assert.assertNotNull(strSubstitutor38);
        org.junit.Assert.assertNotNull(strSubstitutor39);
        org.junit.Assert.assertNotNull(strSubstitutor40);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertNotNull(strSubstitutor44);
    }

    @Test
    public void test2007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2007");
        org.apache.commons.lang3.text.StrSubstitutor strSubstitutor0 = new org.apache.commons.lang3.text.StrSubstitutor();
        org.apache.commons.lang3.text.StrSubstitutor strSubstitutor2 = strSubstitutor0.setVariablePrefix('a');
        char char3 = strSubstitutor0.getEscapeChar();
        org.apache.commons.lang3.text.StrSubstitutor strSubstitutor4 = new org.apache.commons.lang3.text.StrSubstitutor();
        org.apache.commons.lang3.text.StrSubstitutor strSubstitutor6 = strSubstitutor4.setVariablePrefix('a');
        org.apache.commons.lang3.text.StrBuilder strBuilder7 = null;
        boolean boolean8 = strSubstitutor6.replaceIn(strBuilder7);
        org.apache.commons.lang3.text.StrMatcher strMatcher9 = strSubstitutor6.getVariableSuffixMatcher();
        org.apache.commons.lang3.text.StrSubstitutor strSubstitutor10 = strSubstitutor0.setVariableSuffixMatcher(strMatcher9);
        org.apache.commons.lang3.text.StrSubstitutor strSubstitutor12 = strSubstitutor0.setVariableSuffix(' ');
        org.apache.commons.lang3.text.StrMatcher strMatcher13 = strSubstitutor0.getVariablePrefixMatcher();
        org.apache.commons.lang3.text.StrSubstitutor strSubstitutor14 = new org.apache.commons.lang3.text.StrSubstitutor();
        org.apache.commons.lang3.text.StrSubstitutor strSubstitutor16 = strSubstitutor14.setVariablePrefix('a');
        org.apache.commons.lang3.text.StrLookup<?> wildcardStrLookup17 = strSubstitutor14.getVariableResolver();
        org.apache.commons.lang3.text.StrMatcher strMatcher18 = strSubstitutor14.getVariablePrefixMatcher();
        org.apache.commons.lang3.text.StrSubstitutor strSubstitutor19 = strSubstitutor0.setVariableSuffixMatcher(strMatcher18);
        org.apache.commons.lang3.text.StrSubstitutor strSubstitutor21 = strSubstitutor19.setVariableSuffix("false");
        org.apache.commons.lang3.text.StrSubstitutor strSubstitutor22 = new org.apache.commons.lang3.text.StrSubstitutor();
        org.apache.commons.lang3.text.StrSubstitutor strSubstitutor24 = strSubstitutor22.setVariablePrefix('a');
        org.apache.commons.lang3.text.StrBuilder strBuilder25 = null;
        boolean boolean26 = strSubstitutor24.replaceIn(strBuilder25);
        org.apache.commons.lang3.text.StrBuilder strBuilder27 = null;
        boolean boolean28 = strSubstitutor24.replaceIn(strBuilder27);
        char[] charArray32 = new char[] { '4', 'a', '4' };
        java.lang.String str33 = strSubstitutor24.replace(charArray32);
        java.lang.String str34 = strSubstitutor19.replace((java.lang.Object) str33);
        boolean boolean35 = strSubstitutor19.isEnableSubstitutionInVariables();
        org.apache.commons.lang3.text.StrMatcher strMatcher36 = strSubstitutor19.getVariableSuffixMatcher();
        org.apache.commons.lang3.text.StrBuilder strBuilder37 = null;
        boolean boolean38 = strSubstitutor19.replaceIn(strBuilder37);
        org.junit.Assert.assertNotNull(strSubstitutor2);
        org.junit.Assert.assertTrue("'" + char3 + "' != '" + '$' + "'", char3 == '$');
        org.junit.Assert.assertNotNull(strSubstitutor6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(strMatcher9);
        org.junit.Assert.assertNotNull(strSubstitutor10);
        org.junit.Assert.assertNotNull(strSubstitutor12);
        org.junit.Assert.assertNotNull(strMatcher13);
        org.junit.Assert.assertNotNull(strSubstitutor16);
        org.junit.Assert.assertNull(wildcardStrLookup17);
        org.junit.Assert.assertNotNull(strMatcher18);
        org.junit.Assert.assertNotNull(strSubstitutor19);
        org.junit.Assert.assertNotNull(strSubstitutor21);
        org.junit.Assert.assertNotNull(strSubstitutor24);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNotNull(charArray32);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray32), "4a4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray32), "4a4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray32), "[4, a, 4]");
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "4a4" + "'", str33, "4a4");
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "4a4" + "'", str34, "4a4");
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertNotNull(strMatcher36);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
    }

    @Test
    public void test2008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2008");
        org.apache.commons.lang3.text.StrSubstitutor strSubstitutor0 = new org.apache.commons.lang3.text.StrSubstitutor();
        org.apache.commons.lang3.text.StrSubstitutor strSubstitutor2 = strSubstitutor0.setVariablePrefix('a');
        org.apache.commons.lang3.text.StrBuilder strBuilder3 = null;
        boolean boolean4 = strSubstitutor2.replaceIn(strBuilder3);
        org.apache.commons.lang3.text.StrBuilder strBuilder5 = null;
        boolean boolean6 = strSubstitutor2.replaceIn(strBuilder5);
        char[] charArray10 = new char[] { '4', 'a', '4' };
        java.lang.String str11 = strSubstitutor2.replace(charArray10);
        org.apache.commons.lang3.text.StrBuilder strBuilder12 = null;
        boolean boolean13 = strSubstitutor2.replaceIn(strBuilder12);
        org.apache.commons.lang3.text.StrMatcher strMatcher14 = org.apache.commons.lang3.text.StrSubstitutor.DEFAULT_PREFIX;
        org.apache.commons.lang3.text.StrSubstitutor strSubstitutor15 = strSubstitutor2.setVariableSuffixMatcher(strMatcher14);
        java.lang.StringBuffer stringBuffer16 = null;
        java.lang.String str19 = strSubstitutor2.replace(stringBuffer16, (int) ' ', (-1));
        org.apache.commons.lang3.text.StrSubstitutor strSubstitutor20 = new org.apache.commons.lang3.text.StrSubstitutor();
        org.apache.commons.lang3.text.StrSubstitutor strSubstitutor22 = strSubstitutor20.setVariablePrefix('a');
        char char23 = strSubstitutor20.getEscapeChar();
        org.apache.commons.lang3.text.StrSubstitutor strSubstitutor24 = new org.apache.commons.lang3.text.StrSubstitutor();
        org.apache.commons.lang3.text.StrSubstitutor strSubstitutor26 = strSubstitutor24.setVariablePrefix('a');
        org.apache.commons.lang3.text.StrBuilder strBuilder27 = null;
        boolean boolean28 = strSubstitutor26.replaceIn(strBuilder27);
        org.apache.commons.lang3.text.StrMatcher strMatcher29 = strSubstitutor26.getVariableSuffixMatcher();
        org.apache.commons.lang3.text.StrSubstitutor strSubstitutor30 = strSubstitutor20.setVariableSuffixMatcher(strMatcher29);
        org.apache.commons.lang3.text.StrBuilder strBuilder31 = null;
        boolean boolean34 = strSubstitutor20.replaceIn(strBuilder31, 0, (int) (byte) 1);
        java.lang.String str35 = strSubstitutor2.replace((java.lang.Object) (byte) 1);
        org.apache.commons.lang3.text.StrSubstitutor strSubstitutor37 = strSubstitutor2.setVariablePrefix('a');
        org.apache.commons.lang3.text.StrSubstitutor strSubstitutor39 = strSubstitutor2.setVariablePrefix("4");
        org.apache.commons.lang3.text.StrSubstitutor strSubstitutor41 = strSubstitutor2.setVariablePrefix("true");
        char char42 = strSubstitutor41.getEscapeChar();
        org.junit.Assert.assertNotNull(strSubstitutor2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(charArray10);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray10), "4a4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray10), "4a4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray10), "[4, a, 4]");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "4a4" + "'", str11, "4a4");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(strMatcher14);
        org.junit.Assert.assertNotNull(strSubstitutor15);
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertNotNull(strSubstitutor22);
        org.junit.Assert.assertTrue("'" + char23 + "' != '" + '$' + "'", char23 == '$');
        org.junit.Assert.assertNotNull(strSubstitutor26);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNotNull(strMatcher29);
        org.junit.Assert.assertNotNull(strSubstitutor30);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "1" + "'", str35, "1");
        org.junit.Assert.assertNotNull(strSubstitutor37);
        org.junit.Assert.assertNotNull(strSubstitutor39);
        org.junit.Assert.assertNotNull(strSubstitutor41);
        org.junit.Assert.assertTrue("'" + char42 + "' != '" + '$' + "'", char42 == '$');
    }

    @Test
    public void test2009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2009");
        org.apache.commons.lang3.text.StrSubstitutor strSubstitutor0 = new org.apache.commons.lang3.text.StrSubstitutor();
        org.apache.commons.lang3.text.StrSubstitutor strSubstitutor2 = strSubstitutor0.setVariablePrefix('a');
        org.apache.commons.lang3.text.StrLookup<?> wildcardStrLookup3 = strSubstitutor0.getVariableResolver();
        org.apache.commons.lang3.text.StrSubstitutor strSubstitutor5 = strSubstitutor0.setVariableSuffix(' ');
        org.apache.commons.lang3.text.StrSubstitutor strSubstitutor6 = new org.apache.commons.lang3.text.StrSubstitutor();
        org.apache.commons.lang3.text.StrSubstitutor strSubstitutor8 = strSubstitutor6.setVariablePrefix('a');
        java.lang.StringBuffer stringBuffer9 = null;
        java.lang.String str12 = strSubstitutor8.replace(stringBuffer9, (int) (short) -1, (int) (short) -1);
        org.apache.commons.lang3.text.StrMatcher strMatcher13 = org.apache.commons.lang3.text.StrSubstitutor.DEFAULT_PREFIX;
        org.apache.commons.lang3.text.StrSubstitutor strSubstitutor14 = strSubstitutor8.setVariablePrefixMatcher(strMatcher13);
        org.apache.commons.lang3.text.StrSubstitutor strSubstitutor15 = strSubstitutor0.setVariableSuffixMatcher(strMatcher13);
        org.apache.commons.lang3.text.StrBuilder strBuilder16 = null;
        java.lang.String str17 = strSubstitutor0.replace(strBuilder16);
        org.apache.commons.lang3.text.StrSubstitutor strSubstitutor18 = new org.apache.commons.lang3.text.StrSubstitutor();
        org.apache.commons.lang3.text.StrSubstitutor strSubstitutor20 = strSubstitutor18.setVariablePrefix('a');
        java.lang.StringBuffer stringBuffer21 = null;
        java.lang.String str22 = strSubstitutor20.replace(stringBuffer21);
        org.apache.commons.lang3.text.StrMatcher strMatcher23 = strSubstitutor20.getVariableSuffixMatcher();
        org.apache.commons.lang3.text.StrSubstitutor strSubstitutor24 = strSubstitutor0.setVariablePrefixMatcher(strMatcher23);
        org.apache.commons.lang3.text.StrSubstitutor strSubstitutor26 = strSubstitutor24.setVariableSuffix('$');
        org.apache.commons.lang3.text.StrMatcher strMatcher27 = strSubstitutor26.getVariablePrefixMatcher();
        strSubstitutor26.setEscapeChar('$');
        org.junit.Assert.assertNotNull(strSubstitutor2);
        org.junit.Assert.assertNull(wildcardStrLookup3);
        org.junit.Assert.assertNotNull(strSubstitutor5);
        org.junit.Assert.assertNotNull(strSubstitutor8);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNotNull(strMatcher13);
        org.junit.Assert.assertNotNull(strSubstitutor14);
        org.junit.Assert.assertNotNull(strSubstitutor15);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertNotNull(strSubstitutor20);
        org.junit.Assert.assertNull(str22);
        org.junit.Assert.assertNotNull(strMatcher23);
        org.junit.Assert.assertNotNull(strSubstitutor24);
        org.junit.Assert.assertNotNull(strSubstitutor26);
        org.junit.Assert.assertNotNull(strMatcher27);
    }

    @Test
    public void test2010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2010");
        org.apache.commons.lang3.text.StrSubstitutor strSubstitutor0 = new org.apache.commons.lang3.text.StrSubstitutor();
        org.apache.commons.lang3.text.StrSubstitutor strSubstitutor2 = strSubstitutor0.setVariablePrefix('a');
        java.lang.StringBuffer stringBuffer3 = null;
        boolean boolean6 = strSubstitutor0.replaceIn(stringBuffer3, (int) 'a', 1);
        org.apache.commons.lang3.text.StrLookup<?> wildcardStrLookup7 = strSubstitutor0.getVariableResolver();
        org.apache.commons.lang3.text.StrSubstitutor strSubstitutor9 = strSubstitutor0.setVariablePrefix('a');
        org.apache.commons.lang3.text.StrSubstitutor strSubstitutor10 = new org.apache.commons.lang3.text.StrSubstitutor();
        org.apache.commons.lang3.text.StrSubstitutor strSubstitutor12 = strSubstitutor10.setVariablePrefix('a');
        java.lang.StringBuffer stringBuffer13 = null;
        java.lang.String str16 = strSubstitutor12.replace(stringBuffer13, (int) (short) -1, (int) (short) -1);
        org.apache.commons.lang3.text.StrMatcher strMatcher17 = org.apache.commons.lang3.text.StrSubstitutor.DEFAULT_PREFIX;
        org.apache.commons.lang3.text.StrSubstitutor strSubstitutor18 = strSubstitutor12.setVariablePrefixMatcher(strMatcher17);
        strSubstitutor12.setEnableSubstitutionInVariables(false);
        org.apache.commons.lang3.text.StrSubstitutor strSubstitutor21 = new org.apache.commons.lang3.text.StrSubstitutor();
        org.apache.commons.lang3.text.StrSubstitutor strSubstitutor23 = strSubstitutor21.setVariablePrefix('a');
        org.apache.commons.lang3.text.StrBuilder strBuilder24 = null;
        boolean boolean25 = strSubstitutor23.replaceIn(strBuilder24);
        org.apache.commons.lang3.text.StrMatcher strMatcher26 = strSubstitutor23.getVariablePrefixMatcher();
        java.lang.String str28 = strSubstitutor23.replace((java.lang.Object) 100);
        org.apache.commons.lang3.text.StrMatcher strMatcher29 = strSubstitutor23.getVariablePrefixMatcher();
        org.apache.commons.lang3.text.StrSubstitutor strSubstitutor30 = strSubstitutor12.setVariablePrefixMatcher(strMatcher29);
        org.apache.commons.lang3.text.StrSubstitutor strSubstitutor31 = strSubstitutor9.setVariablePrefixMatcher(strMatcher29);
        org.apache.commons.lang3.text.StrSubstitutor strSubstitutor33 = strSubstitutor31.setVariablePrefix(" a");
        org.apache.commons.lang3.text.StrSubstitutor strSubstitutor34 = new org.apache.commons.lang3.text.StrSubstitutor();
        org.apache.commons.lang3.text.StrSubstitutor strSubstitutor36 = strSubstitutor34.setVariablePrefix('a');
        char char37 = strSubstitutor34.getEscapeChar();
        org.apache.commons.lang3.text.StrSubstitutor strSubstitutor39 = strSubstitutor34.setVariableSuffix("");
        strSubstitutor39.setEscapeChar('$');
        org.apache.commons.lang3.text.StrBuilder strBuilder42 = null;
        java.lang.String str43 = strSubstitutor39.replace(strBuilder42);
        org.apache.commons.lang3.text.StrMatcher strMatcher44 = org.apache.commons.lang3.text.StrSubstitutor.DEFAULT_PREFIX;
        org.apache.commons.lang3.text.StrSubstitutor strSubstitutor45 = strSubstitutor39.setVariableSuffixMatcher(strMatcher44);
        org.apache.commons.lang3.text.StrBuilder strBuilder46 = null;
        java.lang.String str49 = strSubstitutor45.replace(strBuilder46, 0, 0);
        org.apache.commons.lang3.text.StrSubstitutor strSubstitutor50 = new org.apache.commons.lang3.text.StrSubstitutor();
        org.apache.commons.lang3.text.StrSubstitutor strSubstitutor52 = strSubstitutor50.setVariablePrefix('a');
        org.apache.commons.lang3.text.StrLookup<?> wildcardStrLookup53 = strSubstitutor50.getVariableResolver();
        org.apache.commons.lang3.text.StrSubstitutor strSubstitutor55 = strSubstitutor50.setVariableSuffix(' ');
        org.apache.commons.lang3.text.StrSubstitutor strSubstitutor57 = strSubstitutor55.setVariableSuffix("1");
        java.lang.String str59 = strSubstitutor57.replace("4");
        org.apache.commons.lang3.text.StrSubstitutor strSubstitutor60 = new org.apache.commons.lang3.text.StrSubstitutor();
        org.apache.commons.lang3.text.StrSubstitutor strSubstitutor62 = strSubstitutor60.setVariablePrefix('a');
        java.lang.StringBuffer stringBuffer63 = null;
        java.lang.String str64 = strSubstitutor62.replace(stringBuffer63);
        org.apache.commons.lang3.text.StrBuilder strBuilder65 = null;
        java.lang.String str68 = strSubstitutor62.replace(strBuilder65, 0, (int) (byte) 1);
        java.lang.String str70 = strSubstitutor62.replace((java.lang.Object) true);
        org.apache.commons.lang3.text.StrSubstitutor strSubstitutor71 = new org.apache.commons.lang3.text.StrSubstitutor();
        org.apache.commons.lang3.text.StrSubstitutor strSubstitutor73 = strSubstitutor71.setVariablePrefix('a');
        java.lang.StringBuffer stringBuffer74 = null;
        java.lang.String str75 = strSubstitutor73.replace(stringBuffer74);
        org.apache.commons.lang3.text.StrSubstitutor strSubstitutor76 = new org.apache.commons.lang3.text.StrSubstitutor();
        org.apache.commons.lang3.text.StrSubstitutor strSubstitutor78 = strSubstitutor76.setVariablePrefix('a');
        org.apache.commons.lang3.text.StrBuilder strBuilder79 = null;
        boolean boolean80 = strSubstitutor78.replaceIn(strBuilder79);
        org.apache.commons.lang3.text.StrBuilder strBuilder81 = null;
        boolean boolean82 = strSubstitutor78.replaceIn(strBuilder81);
        char[] charArray86 = new char[] { '4', 'a', '4' };
        java.lang.String str87 = strSubstitutor78.replace(charArray86);
        java.lang.String str90 = strSubstitutor73.replace(charArray86, (int) (short) 0, (int) (short) 0);
        java.lang.String str91 = strSubstitutor62.replace(charArray86);
        java.lang.String str92 = strSubstitutor57.replace(charArray86);
        java.lang.String str93 = strSubstitutor45.replace(charArray86);
        java.lang.String str94 = strSubstitutor33.replace(charArray86);
        org.junit.Assert.assertNotNull(strSubstitutor2);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(wildcardStrLookup7);
        org.junit.Assert.assertNotNull(strSubstitutor9);
        org.junit.Assert.assertNotNull(strSubstitutor12);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertNotNull(strMatcher17);
        org.junit.Assert.assertNotNull(strSubstitutor18);
        org.junit.Assert.assertNotNull(strSubstitutor23);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(strMatcher26);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "100" + "'", str28, "100");
        org.junit.Assert.assertNotNull(strMatcher29);
        org.junit.Assert.assertNotNull(strSubstitutor30);
        org.junit.Assert.assertNotNull(strSubstitutor31);
        org.junit.Assert.assertNotNull(strSubstitutor33);
        org.junit.Assert.assertNotNull(strSubstitutor36);
        org.junit.Assert.assertTrue("'" + char37 + "' != '" + '$' + "'", char37 == '$');
        org.junit.Assert.assertNotNull(strSubstitutor39);
        org.junit.Assert.assertNull(str43);
        org.junit.Assert.assertNotNull(strMatcher44);
        org.junit.Assert.assertNotNull(strSubstitutor45);
        org.junit.Assert.assertNull(str49);
        org.junit.Assert.assertNotNull(strSubstitutor52);
        org.junit.Assert.assertNull(wildcardStrLookup53);
        org.junit.Assert.assertNotNull(strSubstitutor55);
        org.junit.Assert.assertNotNull(strSubstitutor57);
        org.junit.Assert.assertEquals("'" + str59 + "' != '" + "4" + "'", str59, "4");
        org.junit.Assert.assertNotNull(strSubstitutor62);
        org.junit.Assert.assertNull(str64);
        org.junit.Assert.assertNull(str68);
        org.junit.Assert.assertEquals("'" + str70 + "' != '" + "true" + "'", str70, "true");
        org.junit.Assert.assertNotNull(strSubstitutor73);
        org.junit.Assert.assertNull(str75);
        org.junit.Assert.assertNotNull(strSubstitutor78);
        org.junit.Assert.assertTrue("'" + boolean80 + "' != '" + false + "'", boolean80 == false);
        org.junit.Assert.assertTrue("'" + boolean82 + "' != '" + false + "'", boolean82 == false);
        org.junit.Assert.assertNotNull(charArray86);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray86), "4a4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray86), "4a4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray86), "[4, a, 4]");
        org.junit.Assert.assertEquals("'" + str87 + "' != '" + "4a4" + "'", str87, "4a4");
        org.junit.Assert.assertEquals("'" + str90 + "' != '" + "" + "'", str90, "");
        org.junit.Assert.assertEquals("'" + str91 + "' != '" + "4a4" + "'", str91, "4a4");
        org.junit.Assert.assertEquals("'" + str92 + "' != '" + "4a4" + "'", str92, "4a4");
        org.junit.Assert.assertEquals("'" + str93 + "' != '" + "4a4" + "'", str93, "4a4");
        org.junit.Assert.assertEquals("'" + str94 + "' != '" + "4a4" + "'", str94, "4a4");
    }

    @Test
    public void test2011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2011");
        org.apache.commons.lang3.text.StrSubstitutor strSubstitutor0 = new org.apache.commons.lang3.text.StrSubstitutor();
        org.apache.commons.lang3.text.StrSubstitutor strSubstitutor2 = strSubstitutor0.setVariablePrefix('a');
        org.apache.commons.lang3.text.StrLookup<?> wildcardStrLookup3 = strSubstitutor0.getVariableResolver();
        org.apache.commons.lang3.text.StrSubstitutor strSubstitutor5 = strSubstitutor0.setVariableSuffix(' ');
        org.apache.commons.lang3.text.StrSubstitutor strSubstitutor7 = strSubstitutor5.setVariablePrefix("");
        org.apache.commons.lang3.text.StrSubstitutor strSubstitutor9 = strSubstitutor7.setVariableSuffix("");
        strSubstitutor9.setEscapeChar('#');
        org.apache.commons.lang3.text.StrSubstitutor strSubstitutor12 = new org.apache.commons.lang3.text.StrSubstitutor();
        org.apache.commons.lang3.text.StrSubstitutor strSubstitutor14 = strSubstitutor12.setVariablePrefix('a');
        java.lang.StringBuffer stringBuffer15 = null;
        java.lang.String str18 = strSubstitutor14.replace(stringBuffer15, (int) (short) -1, (int) (short) -1);
        org.apache.commons.lang3.text.StrMatcher strMatcher19 = org.apache.commons.lang3.text.StrSubstitutor.DEFAULT_PREFIX;
        org.apache.commons.lang3.text.StrSubstitutor strSubstitutor20 = strSubstitutor14.setVariablePrefixMatcher(strMatcher19);
        org.apache.commons.lang3.text.StrSubstitutor strSubstitutor21 = strSubstitutor9.setVariableSuffixMatcher(strMatcher19);
        org.apache.commons.lang3.text.StrSubstitutor strSubstitutor23 = strSubstitutor21.setVariableSuffix("hi!");
        org.apache.commons.lang3.text.StrSubstitutor strSubstitutor24 = new org.apache.commons.lang3.text.StrSubstitutor();
        org.apache.commons.lang3.text.StrSubstitutor strSubstitutor25 = new org.apache.commons.lang3.text.StrSubstitutor();
        org.apache.commons.lang3.text.StrSubstitutor strSubstitutor27 = strSubstitutor25.setVariablePrefix('a');
        org.apache.commons.lang3.text.StrBuilder strBuilder28 = null;
        boolean boolean29 = strSubstitutor27.replaceIn(strBuilder28);
        java.lang.String str30 = strSubstitutor24.replace((java.lang.Object) strSubstitutor27);
        org.apache.commons.lang3.text.StrSubstitutor strSubstitutor32 = strSubstitutor27.setVariablePrefix("1");
        org.apache.commons.lang3.text.StrBuilder strBuilder33 = null;
        java.lang.String str36 = strSubstitutor27.replace(strBuilder33, (int) (short) 10, (int) (short) 1);
        java.lang.String str37 = strSubstitutor21.replace((java.lang.Object) str36);
        org.junit.Assert.assertNotNull(strSubstitutor2);
        org.junit.Assert.assertNull(wildcardStrLookup3);
        org.junit.Assert.assertNotNull(strSubstitutor5);
        org.junit.Assert.assertNotNull(strSubstitutor7);
        org.junit.Assert.assertNotNull(strSubstitutor9);
        org.junit.Assert.assertNotNull(strSubstitutor14);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertNotNull(strMatcher19);
        org.junit.Assert.assertNotNull(strSubstitutor20);
        org.junit.Assert.assertNotNull(strSubstitutor21);
        org.junit.Assert.assertNotNull(strSubstitutor23);
        org.junit.Assert.assertNotNull(strSubstitutor27);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNotNull(strSubstitutor32);
        org.junit.Assert.assertNull(str36);
        org.junit.Assert.assertNull(str37);
    }

    @Test
    public void test2012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2012");
        org.apache.commons.lang3.text.StrSubstitutor strSubstitutor0 = new org.apache.commons.lang3.text.StrSubstitutor();
        org.apache.commons.lang3.text.StrSubstitutor strSubstitutor2 = strSubstitutor0.setVariablePrefix('a');
        char char3 = strSubstitutor0.getEscapeChar();
        org.apache.commons.lang3.text.StrSubstitutor strSubstitutor4 = new org.apache.commons.lang3.text.StrSubstitutor();
        org.apache.commons.lang3.text.StrSubstitutor strSubstitutor6 = strSubstitutor4.setVariablePrefix('a');
        org.apache.commons.lang3.text.StrBuilder strBuilder7 = null;
        boolean boolean8 = strSubstitutor6.replaceIn(strBuilder7);
        org.apache.commons.lang3.text.StrMatcher strMatcher9 = strSubstitutor6.getVariableSuffixMatcher();
        org.apache.commons.lang3.text.StrSubstitutor strSubstitutor10 = strSubstitutor0.setVariableSuffixMatcher(strMatcher9);
        org.apache.commons.lang3.text.StrSubstitutor strSubstitutor12 = strSubstitutor0.setVariableSuffix(' ');
        org.apache.commons.lang3.text.StrMatcher strMatcher13 = strSubstitutor0.getVariablePrefixMatcher();
        org.apache.commons.lang3.text.StrSubstitutor strSubstitutor14 = new org.apache.commons.lang3.text.StrSubstitutor();
        org.apache.commons.lang3.text.StrSubstitutor strSubstitutor16 = strSubstitutor14.setVariablePrefix('a');
        org.apache.commons.lang3.text.StrLookup<?> wildcardStrLookup17 = strSubstitutor14.getVariableResolver();
        org.apache.commons.lang3.text.StrMatcher strMatcher18 = strSubstitutor14.getVariablePrefixMatcher();
        org.apache.commons.lang3.text.StrSubstitutor strSubstitutor19 = strSubstitutor0.setVariableSuffixMatcher(strMatcher18);
        org.apache.commons.lang3.text.StrSubstitutor strSubstitutor21 = strSubstitutor19.setVariableSuffix("false");
        org.apache.commons.lang3.text.StrMatcher strMatcher22 = strSubstitutor19.getVariableSuffixMatcher();
        org.apache.commons.lang3.text.StrLookup<?> wildcardStrLookup23 = strSubstitutor19.getVariableResolver();
        org.junit.Assert.assertNotNull(strSubstitutor2);
        org.junit.Assert.assertTrue("'" + char3 + "' != '" + '$' + "'", char3 == '$');
        org.junit.Assert.assertNotNull(strSubstitutor6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(strMatcher9);
        org.junit.Assert.assertNotNull(strSubstitutor10);
        org.junit.Assert.assertNotNull(strSubstitutor12);
        org.junit.Assert.assertNotNull(strMatcher13);
        org.junit.Assert.assertNotNull(strSubstitutor16);
        org.junit.Assert.assertNull(wildcardStrLookup17);
        org.junit.Assert.assertNotNull(strMatcher18);
        org.junit.Assert.assertNotNull(strSubstitutor19);
        org.junit.Assert.assertNotNull(strSubstitutor21);
        org.junit.Assert.assertNotNull(strMatcher22);
        org.junit.Assert.assertNull(wildcardStrLookup23);
    }

    @Test
    public void test2013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2013");
        org.apache.commons.lang3.text.StrSubstitutor strSubstitutor0 = new org.apache.commons.lang3.text.StrSubstitutor();
        org.apache.commons.lang3.text.StrSubstitutor strSubstitutor2 = strSubstitutor0.setVariablePrefix('a');
        org.apache.commons.lang3.text.StrBuilder strBuilder3 = null;
        boolean boolean4 = strSubstitutor2.replaceIn(strBuilder3);
        org.apache.commons.lang3.text.StrBuilder strBuilder5 = null;
        boolean boolean6 = strSubstitutor2.replaceIn(strBuilder5);
        char[] charArray10 = new char[] { '4', 'a', '4' };
        java.lang.String str11 = strSubstitutor2.replace(charArray10);
        org.apache.commons.lang3.text.StrBuilder strBuilder12 = null;
        boolean boolean13 = strSubstitutor2.replaceIn(strBuilder12);
        org.apache.commons.lang3.text.StrMatcher strMatcher14 = org.apache.commons.lang3.text.StrSubstitutor.DEFAULT_PREFIX;
        org.apache.commons.lang3.text.StrSubstitutor strSubstitutor15 = strSubstitutor2.setVariableSuffixMatcher(strMatcher14);
        org.apache.commons.lang3.text.StrBuilder strBuilder16 = null;
        boolean boolean19 = strSubstitutor15.replaceIn(strBuilder16, 1, (int) (byte) 10);
        org.apache.commons.lang3.text.StrSubstitutor strSubstitutor21 = strSubstitutor15.setVariablePrefix("hi!");
        org.apache.commons.lang3.text.StrSubstitutor strSubstitutor23 = strSubstitutor15.setVariablePrefix("class org.apache.commons.lang3.text.StrSubstitutor");
        java.util.Properties properties24 = null;
        java.lang.String str25 = org.apache.commons.lang3.text.StrSubstitutor.replace((java.lang.Object) strSubstitutor23, properties24);
        org.junit.Assert.assertNotNull(strSubstitutor2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(charArray10);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray10), "4a4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray10), "4a4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray10), "[4, a, 4]");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "4a4" + "'", str11, "4a4");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(strMatcher14);
        org.junit.Assert.assertNotNull(strSubstitutor15);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(strSubstitutor21);
        org.junit.Assert.assertNotNull(strSubstitutor23);
    }

    @Test
    public void test2014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2014");
        org.apache.commons.lang3.text.StrSubstitutor strSubstitutor0 = new org.apache.commons.lang3.text.StrSubstitutor();
        org.apache.commons.lang3.text.StrSubstitutor strSubstitutor2 = strSubstitutor0.setVariablePrefix('a');
        java.lang.StringBuffer stringBuffer3 = null;
        java.lang.String str6 = strSubstitutor2.replace(stringBuffer3, (int) (short) -1, (int) (short) -1);
        org.apache.commons.lang3.text.StrSubstitutor strSubstitutor7 = new org.apache.commons.lang3.text.StrSubstitutor();
        org.apache.commons.lang3.text.StrSubstitutor strSubstitutor9 = strSubstitutor7.setVariablePrefix('a');
        char char10 = strSubstitutor7.getEscapeChar();
        org.apache.commons.lang3.text.StrSubstitutor strSubstitutor11 = new org.apache.commons.lang3.text.StrSubstitutor();
        org.apache.commons.lang3.text.StrSubstitutor strSubstitutor13 = strSubstitutor11.setVariablePrefix('a');
        org.apache.commons.lang3.text.StrBuilder strBuilder14 = null;
        boolean boolean15 = strSubstitutor13.replaceIn(strBuilder14);
        org.apache.commons.lang3.text.StrMatcher strMatcher16 = strSubstitutor13.getVariableSuffixMatcher();
        org.apache.commons.lang3.text.StrSubstitutor strSubstitutor17 = strSubstitutor7.setVariableSuffixMatcher(strMatcher16);
        org.apache.commons.lang3.text.StrSubstitutor strSubstitutor18 = strSubstitutor2.setVariablePrefixMatcher(strMatcher16);
        org.apache.commons.lang3.text.StrBuilder strBuilder19 = null;
        boolean boolean20 = strSubstitutor18.replaceIn(strBuilder19);
        org.apache.commons.lang3.text.StrSubstitutor strSubstitutor22 = strSubstitutor18.setVariablePrefix("4##4");
        org.apache.commons.lang3.text.StrSubstitutor strSubstitutor23 = new org.apache.commons.lang3.text.StrSubstitutor();
        org.apache.commons.lang3.text.StrSubstitutor strSubstitutor25 = strSubstitutor23.setVariablePrefix('a');
        char char26 = strSubstitutor23.getEscapeChar();
        org.apache.commons.lang3.text.StrSubstitutor strSubstitutor28 = strSubstitutor23.setVariableSuffix("");
        org.apache.commons.lang3.text.StrSubstitutor strSubstitutor30 = strSubstitutor28.setVariableSuffix("");
        java.lang.String str31 = strSubstitutor18.replace((java.lang.Object) strSubstitutor30);
        java.lang.StringBuffer stringBuffer32 = null;
        boolean boolean35 = strSubstitutor18.replaceIn(stringBuffer32, 100, 100);
        org.apache.commons.lang3.text.StrSubstitutor strSubstitutor37 = strSubstitutor18.setVariableSuffix('a');
        org.apache.commons.lang3.text.StrBuilder strBuilder38 = null;
        boolean boolean39 = strSubstitutor37.replaceIn(strBuilder38);
        strSubstitutor37.setEscapeChar(' ');
        org.junit.Assert.assertNotNull(strSubstitutor2);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(strSubstitutor9);
        org.junit.Assert.assertTrue("'" + char10 + "' != '" + '$' + "'", char10 == '$');
        org.junit.Assert.assertNotNull(strSubstitutor13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(strMatcher16);
        org.junit.Assert.assertNotNull(strSubstitutor17);
        org.junit.Assert.assertNotNull(strSubstitutor18);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(strSubstitutor22);
        org.junit.Assert.assertNotNull(strSubstitutor25);
        org.junit.Assert.assertTrue("'" + char26 + "' != '" + '$' + "'", char26 == '$');
        org.junit.Assert.assertNotNull(strSubstitutor28);
        org.junit.Assert.assertNotNull(strSubstitutor30);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertNotNull(strSubstitutor37);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
    }

    @Test
    public void test2015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2015");
        org.apache.commons.lang3.text.StrSubstitutor strSubstitutor0 = new org.apache.commons.lang3.text.StrSubstitutor();
        org.apache.commons.lang3.text.StrSubstitutor strSubstitutor2 = strSubstitutor0.setVariablePrefix('a');
        org.apache.commons.lang3.text.StrLookup<?> wildcardStrLookup3 = strSubstitutor0.getVariableResolver();
        org.apache.commons.lang3.text.StrBuilder strBuilder4 = null;
        boolean boolean7 = strSubstitutor0.replaceIn(strBuilder4, 100, (int) '4');
        org.apache.commons.lang3.text.StrMatcher strMatcher8 = strSubstitutor0.getVariableSuffixMatcher();
        org.apache.commons.lang3.text.StrSubstitutor strSubstitutor10 = strSubstitutor0.setVariablePrefix("false");
        java.util.Properties properties11 = null;
        java.lang.String str12 = org.apache.commons.lang3.text.StrSubstitutor.replace((java.lang.Object) strSubstitutor10, properties11);
        java.lang.StringBuffer stringBuffer13 = null;
        boolean boolean16 = strSubstitutor10.replaceIn(stringBuffer13, (int) (byte) -1, (int) (short) 100);
        strSubstitutor10.setEnableSubstitutionInVariables(false);
        java.lang.StringBuffer stringBuffer19 = null;
        java.lang.String str20 = strSubstitutor10.replace(stringBuffer19);
        org.apache.commons.lang3.text.StrSubstitutor strSubstitutor22 = strSubstitutor10.setVariableSuffix("-1");
        org.apache.commons.lang3.text.StrMatcher strMatcher23 = strSubstitutor10.getVariableSuffixMatcher();
        org.junit.Assert.assertNotNull(strSubstitutor2);
        org.junit.Assert.assertNull(wildcardStrLookup3);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(strMatcher8);
        org.junit.Assert.assertNotNull(strSubstitutor10);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNull(str20);
        org.junit.Assert.assertNotNull(strSubstitutor22);
        org.junit.Assert.assertNotNull(strMatcher23);
    }

    @Test
    public void test2016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2016");
        org.apache.commons.lang3.text.StrSubstitutor strSubstitutor0 = new org.apache.commons.lang3.text.StrSubstitutor();
        org.apache.commons.lang3.text.StrSubstitutor strSubstitutor2 = strSubstitutor0.setVariablePrefix('a');
        char char3 = strSubstitutor0.getEscapeChar();
        java.lang.String str7 = strSubstitutor0.replace("10", 0, (int) (byte) 1);
        java.lang.StringBuffer stringBuffer8 = null;
        java.lang.String str11 = strSubstitutor0.replace(stringBuffer8, (int) (byte) 100, (int) (byte) -1);
        org.apache.commons.lang3.text.StrSubstitutor strSubstitutor13 = strSubstitutor0.setVariablePrefix("1");
        org.junit.Assert.assertNotNull(strSubstitutor2);
        org.junit.Assert.assertTrue("'" + char3 + "' != '" + '$' + "'", char3 == '$');
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "1" + "'", str7, "1");
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNotNull(strSubstitutor13);
    }

    @Test
    public void test2017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2017");
        org.apache.commons.lang3.text.StrSubstitutor strSubstitutor0 = new org.apache.commons.lang3.text.StrSubstitutor();
        org.apache.commons.lang3.text.StrSubstitutor strSubstitutor2 = strSubstitutor0.setVariablePrefix('a');
        org.apache.commons.lang3.text.StrLookup<?> wildcardStrLookup3 = strSubstitutor0.getVariableResolver();
        org.apache.commons.lang3.text.StrSubstitutor strSubstitutor5 = strSubstitutor0.setVariableSuffix(' ');
        strSubstitutor0.setEnableSubstitutionInVariables(true);
        java.lang.String str9 = strSubstitutor0.replace("true");
        org.apache.commons.lang3.text.StrSubstitutor strSubstitutor11 = strSubstitutor0.setVariablePrefix("1");
        java.lang.StringBuffer stringBuffer12 = null;
        java.lang.String str15 = strSubstitutor11.replace(stringBuffer12, (int) '4', (int) (short) 100);
        org.apache.commons.lang3.text.StrSubstitutor strSubstitutor17 = strSubstitutor11.setVariableSuffix('4');
        java.lang.StringBuffer stringBuffer18 = null;
        boolean boolean19 = strSubstitutor17.replaceIn(stringBuffer18);
        org.apache.commons.lang3.text.StrSubstitutor strSubstitutor20 = new org.apache.commons.lang3.text.StrSubstitutor();
        org.apache.commons.lang3.text.StrSubstitutor strSubstitutor22 = strSubstitutor20.setVariablePrefix('a');
        org.apache.commons.lang3.text.StrBuilder strBuilder23 = null;
        boolean boolean24 = strSubstitutor22.replaceIn(strBuilder23);
        org.apache.commons.lang3.text.StrBuilder strBuilder25 = null;
        boolean boolean26 = strSubstitutor22.replaceIn(strBuilder25);
        char[] charArray30 = new char[] { '4', 'a', '4' };
        java.lang.String str31 = strSubstitutor22.replace(charArray30);
        java.lang.StringBuffer stringBuffer32 = null;
        boolean boolean33 = strSubstitutor22.replaceIn(stringBuffer32);
        org.apache.commons.lang3.text.StrSubstitutor strSubstitutor34 = new org.apache.commons.lang3.text.StrSubstitutor();
        org.apache.commons.lang3.text.StrSubstitutor strSubstitutor36 = strSubstitutor34.setVariablePrefix('a');
        char char37 = strSubstitutor34.getEscapeChar();
        org.apache.commons.lang3.text.StrSubstitutor strSubstitutor38 = new org.apache.commons.lang3.text.StrSubstitutor();
        org.apache.commons.lang3.text.StrSubstitutor strSubstitutor40 = strSubstitutor38.setVariablePrefix('a');
        org.apache.commons.lang3.text.StrBuilder strBuilder41 = null;
        boolean boolean42 = strSubstitutor40.replaceIn(strBuilder41);
        org.apache.commons.lang3.text.StrMatcher strMatcher43 = strSubstitutor40.getVariableSuffixMatcher();
        org.apache.commons.lang3.text.StrSubstitutor strSubstitutor44 = strSubstitutor34.setVariableSuffixMatcher(strMatcher43);
        org.apache.commons.lang3.text.StrSubstitutor strSubstitutor46 = strSubstitutor34.setVariableSuffix(' ');
        org.apache.commons.lang3.text.StrMatcher strMatcher47 = strSubstitutor46.getVariablePrefixMatcher();
        java.util.Properties properties48 = null;
        java.lang.String str49 = org.apache.commons.lang3.text.StrSubstitutor.replace((java.lang.Object) strMatcher47, properties48);
        org.apache.commons.lang3.text.StrSubstitutor strSubstitutor50 = strSubstitutor22.setVariableSuffixMatcher(strMatcher47);
        org.apache.commons.lang3.text.StrSubstitutor strSubstitutor52 = strSubstitutor50.setVariableSuffix('$');
        org.apache.commons.lang3.text.StrSubstitutor strSubstitutor53 = new org.apache.commons.lang3.text.StrSubstitutor();
        org.apache.commons.lang3.text.StrSubstitutor strSubstitutor55 = strSubstitutor53.setVariablePrefix('a');
        char char56 = strSubstitutor53.getEscapeChar();
        org.apache.commons.lang3.text.StrSubstitutor strSubstitutor57 = new org.apache.commons.lang3.text.StrSubstitutor();
        org.apache.commons.lang3.text.StrSubstitutor strSubstitutor59 = strSubstitutor57.setVariablePrefix('a');
        org.apache.commons.lang3.text.StrBuilder strBuilder60 = null;
        boolean boolean61 = strSubstitutor59.replaceIn(strBuilder60);
        org.apache.commons.lang3.text.StrMatcher strMatcher62 = strSubstitutor59.getVariableSuffixMatcher();
        org.apache.commons.lang3.text.StrSubstitutor strSubstitutor63 = strSubstitutor53.setVariableSuffixMatcher(strMatcher62);
        org.apache.commons.lang3.text.StrBuilder strBuilder64 = null;
        boolean boolean67 = strSubstitutor53.replaceIn(strBuilder64, 0, (int) (byte) 1);
        java.lang.StringBuffer stringBuffer68 = null;
        java.lang.String str71 = strSubstitutor53.replace(stringBuffer68, (int) (byte) -1, 1);
        org.apache.commons.lang3.text.StrLookup<?> wildcardStrLookup72 = strSubstitutor53.getVariableResolver();
        org.apache.commons.lang3.text.StrMatcher strMatcher73 = strSubstitutor53.getVariableSuffixMatcher();
        org.apache.commons.lang3.text.StrSubstitutor strSubstitutor74 = strSubstitutor50.setVariablePrefixMatcher(strMatcher73);
        org.apache.commons.lang3.text.StrBuilder strBuilder75 = null;
        boolean boolean76 = strSubstitutor74.replaceIn(strBuilder75);
        java.lang.String str77 = strSubstitutor17.replace((java.lang.Object) strSubstitutor74);
        org.apache.commons.lang3.text.StrSubstitutor strSubstitutor79 = strSubstitutor17.setVariableSuffix("100");
        org.apache.commons.lang3.text.StrBuilder strBuilder80 = null;
        boolean boolean83 = strSubstitutor17.replaceIn(strBuilder80, (int) 'a', (int) '#');
        org.junit.Assert.assertNotNull(strSubstitutor2);
        org.junit.Assert.assertNull(wildcardStrLookup3);
        org.junit.Assert.assertNotNull(strSubstitutor5);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "true" + "'", str9, "true");
        org.junit.Assert.assertNotNull(strSubstitutor11);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNotNull(strSubstitutor17);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(strSubstitutor22);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(charArray30);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray30), "4a4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray30), "4a4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray30), "[4, a, 4]");
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "4a4" + "'", str31, "4a4");
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertNotNull(strSubstitutor36);
        org.junit.Assert.assertTrue("'" + char37 + "' != '" + '$' + "'", char37 == '$');
        org.junit.Assert.assertNotNull(strSubstitutor40);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertNotNull(strMatcher43);
        org.junit.Assert.assertNotNull(strSubstitutor44);
        org.junit.Assert.assertNotNull(strSubstitutor46);
        org.junit.Assert.assertNotNull(strMatcher47);
        org.junit.Assert.assertNotNull(strSubstitutor50);
        org.junit.Assert.assertNotNull(strSubstitutor52);
        org.junit.Assert.assertNotNull(strSubstitutor55);
        org.junit.Assert.assertTrue("'" + char56 + "' != '" + '$' + "'", char56 == '$');
        org.junit.Assert.assertNotNull(strSubstitutor59);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + false + "'", boolean61 == false);
        org.junit.Assert.assertNotNull(strMatcher62);
        org.junit.Assert.assertNotNull(strSubstitutor63);
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + false + "'", boolean67 == false);
        org.junit.Assert.assertNull(str71);
        org.junit.Assert.assertNull(wildcardStrLookup72);
        org.junit.Assert.assertNotNull(strMatcher73);
        org.junit.Assert.assertNotNull(strSubstitutor74);
        org.junit.Assert.assertTrue("'" + boolean76 + "' != '" + false + "'", boolean76 == false);
        org.junit.Assert.assertNotNull(strSubstitutor79);
        org.junit.Assert.assertTrue("'" + boolean83 + "' != '" + false + "'", boolean83 == false);
    }

    @Test
    public void test2018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2018");
        org.apache.commons.lang3.text.StrSubstitutor strSubstitutor0 = new org.apache.commons.lang3.text.StrSubstitutor();
        org.apache.commons.lang3.text.StrSubstitutor strSubstitutor2 = strSubstitutor0.setVariablePrefix('a');
        java.lang.StringBuffer stringBuffer3 = null;
        java.lang.String str4 = strSubstitutor2.replace(stringBuffer3);
        org.apache.commons.lang3.text.StrBuilder strBuilder5 = null;
        java.lang.String str8 = strSubstitutor2.replace(strBuilder5, 0, (int) (byte) 1);
        java.lang.String str10 = strSubstitutor2.replace((java.lang.Object) true);
        org.apache.commons.lang3.text.StrSubstitutor strSubstitutor11 = new org.apache.commons.lang3.text.StrSubstitutor();
        org.apache.commons.lang3.text.StrSubstitutor strSubstitutor13 = strSubstitutor11.setVariablePrefix('a');
        org.apache.commons.lang3.text.StrBuilder strBuilder14 = null;
        boolean boolean15 = strSubstitutor13.replaceIn(strBuilder14);
        org.apache.commons.lang3.text.StrMatcher strMatcher16 = strSubstitutor13.getVariableSuffixMatcher();
        org.apache.commons.lang3.text.StrSubstitutor strSubstitutor17 = strSubstitutor2.setVariablePrefixMatcher(strMatcher16);
        strSubstitutor17.setEscapeChar('$');
        boolean boolean20 = strSubstitutor17.isEnableSubstitutionInVariables();
        org.apache.commons.lang3.text.StrSubstitutor strSubstitutor22 = strSubstitutor17.setVariableSuffix("4a4");
        java.lang.Class<?> wildcardClass23 = strSubstitutor22.getClass();
        org.junit.Assert.assertNotNull(strSubstitutor2);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "true" + "'", str10, "true");
        org.junit.Assert.assertNotNull(strSubstitutor13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(strMatcher16);
        org.junit.Assert.assertNotNull(strSubstitutor17);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(strSubstitutor22);
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test2019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2019");
        org.apache.commons.lang3.text.StrSubstitutor strSubstitutor0 = new org.apache.commons.lang3.text.StrSubstitutor();
        org.apache.commons.lang3.text.StrSubstitutor strSubstitutor2 = strSubstitutor0.setVariablePrefix('a');
        java.lang.StringBuffer stringBuffer3 = null;
        java.lang.String str6 = strSubstitutor2.replace(stringBuffer3, (int) (short) -1, (int) (short) -1);
        org.apache.commons.lang3.text.StrMatcher strMatcher7 = org.apache.commons.lang3.text.StrSubstitutor.DEFAULT_PREFIX;
        org.apache.commons.lang3.text.StrSubstitutor strSubstitutor8 = strSubstitutor2.setVariablePrefixMatcher(strMatcher7);
        char[] charArray11 = new char[] { ' ', 'a' };
        java.lang.String str14 = strSubstitutor2.replace(charArray11, (int) (byte) 1, (int) (byte) 1);
        org.apache.commons.lang3.text.StrSubstitutor strSubstitutor15 = new org.apache.commons.lang3.text.StrSubstitutor();
        org.apache.commons.lang3.text.StrSubstitutor strSubstitutor17 = strSubstitutor15.setVariablePrefix('a');
        java.lang.StringBuffer stringBuffer18 = null;
        java.lang.String str19 = strSubstitutor17.replace(stringBuffer18);
        org.apache.commons.lang3.text.StrBuilder strBuilder20 = null;
        java.lang.String str23 = strSubstitutor17.replace(strBuilder20, 0, (int) (byte) 1);
        java.lang.String str25 = strSubstitutor17.replace((java.lang.Object) true);
        org.apache.commons.lang3.text.StrSubstitutor strSubstitutor26 = new org.apache.commons.lang3.text.StrSubstitutor();
        org.apache.commons.lang3.text.StrSubstitutor strSubstitutor28 = strSubstitutor26.setVariablePrefix('a');
        org.apache.commons.lang3.text.StrBuilder strBuilder29 = null;
        boolean boolean30 = strSubstitutor28.replaceIn(strBuilder29);
        org.apache.commons.lang3.text.StrMatcher strMatcher31 = strSubstitutor28.getVariableSuffixMatcher();
        org.apache.commons.lang3.text.StrSubstitutor strSubstitutor32 = strSubstitutor17.setVariablePrefixMatcher(strMatcher31);
        org.apache.commons.lang3.text.StrSubstitutor strSubstitutor34 = strSubstitutor32.setVariableSuffix('#');
        org.apache.commons.lang3.text.StrMatcher strMatcher35 = strSubstitutor32.getVariablePrefixMatcher();
        org.apache.commons.lang3.text.StrSubstitutor strSubstitutor36 = strSubstitutor2.setVariablePrefixMatcher(strMatcher35);
        org.apache.commons.lang3.text.StrSubstitutor strSubstitutor38 = strSubstitutor36.setVariableSuffix('a');
        java.lang.StringBuffer stringBuffer39 = null;
        java.lang.String str42 = strSubstitutor36.replace(stringBuffer39, (int) (short) -1, (int) (byte) 10);
        java.lang.StringBuffer stringBuffer43 = null;
        java.lang.String str44 = strSubstitutor36.replace(stringBuffer43);
        org.junit.Assert.assertNotNull(strSubstitutor2);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(strMatcher7);
        org.junit.Assert.assertNotNull(strSubstitutor8);
        org.junit.Assert.assertNotNull(charArray11);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray11), " a");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray11), " a");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray11), "[ , a]");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "a" + "'", str14, "a");
        org.junit.Assert.assertNotNull(strSubstitutor17);
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertNull(str23);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "true" + "'", str25, "true");
        org.junit.Assert.assertNotNull(strSubstitutor28);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNotNull(strMatcher31);
        org.junit.Assert.assertNotNull(strSubstitutor32);
        org.junit.Assert.assertNotNull(strSubstitutor34);
        org.junit.Assert.assertNotNull(strMatcher35);
        org.junit.Assert.assertNotNull(strSubstitutor36);
        org.junit.Assert.assertNotNull(strSubstitutor38);
        org.junit.Assert.assertNull(str42);
        org.junit.Assert.assertNull(str44);
    }

    @Test
    public void test2020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2020");
        org.apache.commons.lang3.text.StrSubstitutor strSubstitutor0 = new org.apache.commons.lang3.text.StrSubstitutor();
        org.apache.commons.lang3.text.StrSubstitutor strSubstitutor2 = strSubstitutor0.setVariablePrefix('a');
        org.apache.commons.lang3.text.StrLookup<?> wildcardStrLookup3 = strSubstitutor0.getVariableResolver();
        org.apache.commons.lang3.text.StrSubstitutor strSubstitutor5 = strSubstitutor0.setVariableSuffix(' ');
        strSubstitutor0.setEnableSubstitutionInVariables(true);
        java.lang.String str9 = strSubstitutor0.replace("true");
        org.apache.commons.lang3.text.StrMatcher strMatcher10 = strSubstitutor0.getVariableSuffixMatcher();
        org.apache.commons.lang3.text.StrBuilder strBuilder11 = null;
        java.lang.String str12 = strSubstitutor0.replace(strBuilder11);
        org.apache.commons.lang3.text.StrMatcher strMatcher13 = strSubstitutor0.getVariablePrefixMatcher();
        org.apache.commons.lang3.text.StrSubstitutor strSubstitutor15 = strSubstitutor0.setVariableSuffix("-1");
        org.apache.commons.lang3.text.StrSubstitutor strSubstitutor17 = strSubstitutor15.setVariableSuffix("4##4");
        org.apache.commons.lang3.text.StrSubstitutor strSubstitutor18 = new org.apache.commons.lang3.text.StrSubstitutor();
        org.apache.commons.lang3.text.StrSubstitutor strSubstitutor20 = strSubstitutor18.setVariablePrefix('a');
        java.lang.StringBuffer stringBuffer21 = null;
        java.lang.String str22 = strSubstitutor20.replace(stringBuffer21);
        org.apache.commons.lang3.text.StrMatcher strMatcher23 = strSubstitutor20.getVariableSuffixMatcher();
        org.apache.commons.lang3.text.StrSubstitutor strSubstitutor25 = strSubstitutor20.setVariablePrefix(' ');
        org.apache.commons.lang3.text.StrSubstitutor strSubstitutor27 = strSubstitutor25.setVariablePrefix('$');
        java.lang.String str28 = strSubstitutor17.replace((java.lang.Object) strSubstitutor25);
        strSubstitutor25.setEnableSubstitutionInVariables(false);
        java.lang.String str32 = strSubstitutor25.replace("class org.apache.commons.lang3.text.StrSubstitutor");
        org.junit.Assert.assertNotNull(strSubstitutor2);
        org.junit.Assert.assertNull(wildcardStrLookup3);
        org.junit.Assert.assertNotNull(strSubstitutor5);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "true" + "'", str9, "true");
        org.junit.Assert.assertNotNull(strMatcher10);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNotNull(strMatcher13);
        org.junit.Assert.assertNotNull(strSubstitutor15);
        org.junit.Assert.assertNotNull(strSubstitutor17);
        org.junit.Assert.assertNotNull(strSubstitutor20);
        org.junit.Assert.assertNull(str22);
        org.junit.Assert.assertNotNull(strMatcher23);
        org.junit.Assert.assertNotNull(strSubstitutor25);
        org.junit.Assert.assertNotNull(strSubstitutor27);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "class org.apache.commons.lang3.text.StrSubstitutor" + "'", str32, "class org.apache.commons.lang3.text.StrSubstitutor");
    }

    @Test
    public void test2021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2021");
        org.apache.commons.lang3.text.StrSubstitutor strSubstitutor0 = new org.apache.commons.lang3.text.StrSubstitutor();
        org.apache.commons.lang3.text.StrSubstitutor strSubstitutor2 = strSubstitutor0.setVariablePrefix('a');
        org.apache.commons.lang3.text.StrLookup<?> wildcardStrLookup3 = strSubstitutor0.getVariableResolver();
        org.apache.commons.lang3.text.StrSubstitutor strSubstitutor5 = strSubstitutor0.setVariableSuffix(' ');
        strSubstitutor0.setEnableSubstitutionInVariables(true);
        java.lang.String str9 = strSubstitutor0.replace("true");
        org.apache.commons.lang3.text.StrSubstitutor strSubstitutor11 = strSubstitutor0.setVariablePrefix("1");
        char char12 = strSubstitutor11.getEscapeChar();
        char char13 = strSubstitutor11.getEscapeChar();
        org.apache.commons.lang3.text.StrSubstitutor strSubstitutor14 = new org.apache.commons.lang3.text.StrSubstitutor();
        org.apache.commons.lang3.text.StrSubstitutor strSubstitutor16 = strSubstitutor14.setVariablePrefix('a');
        org.apache.commons.lang3.text.StrBuilder strBuilder17 = null;
        boolean boolean18 = strSubstitutor16.replaceIn(strBuilder17);
        org.apache.commons.lang3.text.StrBuilder strBuilder19 = null;
        boolean boolean20 = strSubstitutor16.replaceIn(strBuilder19);
        char[] charArray24 = new char[] { '4', 'a', '4' };
        java.lang.String str25 = strSubstitutor16.replace(charArray24);
        org.apache.commons.lang3.text.StrBuilder strBuilder26 = null;
        boolean boolean27 = strSubstitutor16.replaceIn(strBuilder26);
        org.apache.commons.lang3.text.StrSubstitutor strSubstitutor28 = new org.apache.commons.lang3.text.StrSubstitutor();
        org.apache.commons.lang3.text.StrSubstitutor strSubstitutor30 = strSubstitutor28.setVariablePrefix('a');
        char char31 = strSubstitutor28.getEscapeChar();
        org.apache.commons.lang3.text.StrSubstitutor strSubstitutor32 = new org.apache.commons.lang3.text.StrSubstitutor();
        org.apache.commons.lang3.text.StrSubstitutor strSubstitutor34 = strSubstitutor32.setVariablePrefix('a');
        org.apache.commons.lang3.text.StrBuilder strBuilder35 = null;
        boolean boolean36 = strSubstitutor34.replaceIn(strBuilder35);
        org.apache.commons.lang3.text.StrMatcher strMatcher37 = strSubstitutor34.getVariableSuffixMatcher();
        org.apache.commons.lang3.text.StrSubstitutor strSubstitutor38 = strSubstitutor28.setVariableSuffixMatcher(strMatcher37);
        org.apache.commons.lang3.text.StrSubstitutor strSubstitutor39 = strSubstitutor16.setVariableSuffixMatcher(strMatcher37);
        org.apache.commons.lang3.text.StrSubstitutor strSubstitutor40 = strSubstitutor11.setVariableSuffixMatcher(strMatcher37);
        org.apache.commons.lang3.text.StrSubstitutor strSubstitutor42 = strSubstitutor40.setVariablePrefix('a');
        org.apache.commons.lang3.text.StrLookup<?> wildcardStrLookup43 = strSubstitutor42.getVariableResolver();
        java.lang.StringBuffer stringBuffer44 = null;
        boolean boolean45 = strSubstitutor42.replaceIn(stringBuffer44);
        org.apache.commons.lang3.text.StrSubstitutor strSubstitutor47 = strSubstitutor42.setVariablePrefix('#');
        org.apache.commons.lang3.text.StrMatcher strMatcher48 = strSubstitutor47.getVariablePrefixMatcher();
        org.junit.Assert.assertNotNull(strSubstitutor2);
        org.junit.Assert.assertNull(wildcardStrLookup3);
        org.junit.Assert.assertNotNull(strSubstitutor5);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "true" + "'", str9, "true");
        org.junit.Assert.assertNotNull(strSubstitutor11);
        org.junit.Assert.assertTrue("'" + char12 + "' != '" + '$' + "'", char12 == '$');
        org.junit.Assert.assertTrue("'" + char13 + "' != '" + '$' + "'", char13 == '$');
        org.junit.Assert.assertNotNull(strSubstitutor16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(charArray24);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray24), "4a4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray24), "4a4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray24), "[4, a, 4]");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "4a4" + "'", str25, "4a4");
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(strSubstitutor30);
        org.junit.Assert.assertTrue("'" + char31 + "' != '" + '$' + "'", char31 == '$');
        org.junit.Assert.assertNotNull(strSubstitutor34);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertNotNull(strMatcher37);
        org.junit.Assert.assertNotNull(strSubstitutor38);
        org.junit.Assert.assertNotNull(strSubstitutor39);
        org.junit.Assert.assertNotNull(strSubstitutor40);
        org.junit.Assert.assertNotNull(strSubstitutor42);
        org.junit.Assert.assertNull(wildcardStrLookup43);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertNotNull(strSubstitutor47);
        org.junit.Assert.assertNotNull(strMatcher48);
    }

    @Test
    public void test2022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2022");
        org.apache.commons.lang3.text.StrSubstitutor strSubstitutor0 = new org.apache.commons.lang3.text.StrSubstitutor();
        org.apache.commons.lang3.text.StrSubstitutor strSubstitutor2 = strSubstitutor0.setVariablePrefix('a');
        java.lang.StringBuffer stringBuffer3 = null;
        boolean boolean6 = strSubstitutor0.replaceIn(stringBuffer3, (int) 'a', 1);
        org.apache.commons.lang3.text.StrLookup<?> wildcardStrLookup7 = strSubstitutor0.getVariableResolver();
        org.apache.commons.lang3.text.StrSubstitutor strSubstitutor9 = strSubstitutor0.setVariablePrefix('a');
        org.apache.commons.lang3.text.StrSubstitutor strSubstitutor11 = strSubstitutor9.setVariableSuffix("4a4");
        org.apache.commons.lang3.text.StrSubstitutor strSubstitutor13 = strSubstitutor9.setVariableSuffix('4');
        org.apache.commons.lang3.text.StrLookup<?> wildcardStrLookup14 = strSubstitutor9.getVariableResolver();
        org.junit.Assert.assertNotNull(strSubstitutor2);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(wildcardStrLookup7);
        org.junit.Assert.assertNotNull(strSubstitutor9);
        org.junit.Assert.assertNotNull(strSubstitutor11);
        org.junit.Assert.assertNotNull(strSubstitutor13);
        org.junit.Assert.assertNull(wildcardStrLookup14);
    }

    @Test
    public void test2023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2023");
        org.apache.commons.lang3.text.StrSubstitutor strSubstitutor0 = new org.apache.commons.lang3.text.StrSubstitutor();
        org.apache.commons.lang3.text.StrSubstitutor strSubstitutor2 = strSubstitutor0.setVariablePrefix('a');
        java.lang.StringBuffer stringBuffer3 = null;
        java.lang.String str4 = strSubstitutor2.replace(stringBuffer3);
        org.apache.commons.lang3.text.StrSubstitutor strSubstitutor5 = new org.apache.commons.lang3.text.StrSubstitutor();
        org.apache.commons.lang3.text.StrSubstitutor strSubstitutor7 = strSubstitutor5.setVariablePrefix('a');
        org.apache.commons.lang3.text.StrBuilder strBuilder8 = null;
        boolean boolean9 = strSubstitutor7.replaceIn(strBuilder8);
        org.apache.commons.lang3.text.StrBuilder strBuilder10 = null;
        boolean boolean11 = strSubstitutor7.replaceIn(strBuilder10);
        char[] charArray15 = new char[] { '4', 'a', '4' };
        java.lang.String str16 = strSubstitutor7.replace(charArray15);
        java.lang.String str19 = strSubstitutor2.replace(charArray15, (int) (short) 0, (int) (short) 0);
        org.apache.commons.lang3.text.StrMatcher strMatcher20 = strSubstitutor2.getVariablePrefixMatcher();
        org.apache.commons.lang3.text.StrSubstitutor strSubstitutor22 = strSubstitutor2.setVariablePrefix("true");
        org.apache.commons.lang3.text.StrSubstitutor strSubstitutor23 = new org.apache.commons.lang3.text.StrSubstitutor();
        org.apache.commons.lang3.text.StrSubstitutor strSubstitutor25 = strSubstitutor23.setVariablePrefix('a');
        char char26 = strSubstitutor23.getEscapeChar();
        org.apache.commons.lang3.text.StrSubstitutor strSubstitutor28 = strSubstitutor23.setVariableSuffix("");
        org.apache.commons.lang3.text.StrMatcher strMatcher29 = strSubstitutor23.getVariablePrefixMatcher();
        org.apache.commons.lang3.text.StrSubstitutor strSubstitutor30 = strSubstitutor22.setVariableSuffixMatcher(strMatcher29);
        org.apache.commons.lang3.text.StrBuilder strBuilder31 = null;
        boolean boolean34 = strSubstitutor22.replaceIn(strBuilder31, (-1), (int) (short) -1);
        java.lang.StringBuffer stringBuffer35 = null;
        java.lang.String str36 = strSubstitutor22.replace(stringBuffer35);
        java.lang.String str40 = strSubstitutor22.replace("class [C", 0, 0);
        org.junit.Assert.assertNotNull(strSubstitutor2);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNotNull(strSubstitutor7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(charArray15);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray15), "4a4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray15), "4a4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray15), "[4, a, 4]");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "4a4" + "'", str16, "4a4");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertNotNull(strMatcher20);
        org.junit.Assert.assertNotNull(strSubstitutor22);
        org.junit.Assert.assertNotNull(strSubstitutor25);
        org.junit.Assert.assertTrue("'" + char26 + "' != '" + '$' + "'", char26 == '$');
        org.junit.Assert.assertNotNull(strSubstitutor28);
        org.junit.Assert.assertNotNull(strMatcher29);
        org.junit.Assert.assertNotNull(strSubstitutor30);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertNull(str36);
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "" + "'", str40, "");
    }
}

