import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest7 {

    public static boolean debug = false;

    @Test
    public void test03501() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03501");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA      ", "AVAJ.GNALAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA       ", (-1));
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void test03502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03502");
        int int2 = org.apache.commons.lang3.StringUtils.indexOf("se...", "ArrayList");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test03503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03503");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOf("Class[]aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "            java.util             ", (int) (short) 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test03504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03504");
        java.util.Locale locale1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.apache.commons.lang3.StringUtils.upperCase("java.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.lang", locale1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test03505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03505");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.swapCase("Byte");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "bYTE" + "'", str1, "bYTE");
    }

    @Test
    public void test03506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03506");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.rightPad("String[]String[]String[]String[]String[]String[]String[]String[]String[]String[]String[]String[]String[]String[]String[]String[]String[]String[]String[]String[]String[]String[]String[]String[]String[]String[]String[]String[]String[]String[]String[]String[]String[]String[]String[]String[]String[]String[]String[]String[]String[]String[]String[]String[]String[]String[]String[]String[]String[]String[]String[]String[]String[]String[]String[]String[]String[]String[]String[]String[]String[]String[]String[]String[]String[]String[]String[]", 23);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "String[]String[]String[]String[]String[]String[]String[]String[]String[]String[]String[]String[]String[]String[]String[]String[]String[]String[]String[]String[]String[]String[]String[]String[]String[]String[]String[]String[]String[]String[]String[]String[]String[]String[]String[]String[]String[]String[]String[]String[]String[]String[]String[]String[]String[]String[]String[]String[]String[]String[]String[]String[]String[]String[]String[]String[]String[]String[]String[]String[]String[]String[]String[]String[]String[]String[]String[]" + "'", str2, "String[]String[]String[]String[]String[]String[]String[]String[]String[]String[]String[]String[]String[]String[]String[]String[]String[]String[]String[]String[]String[]String[]String[]String[]String[]String[]String[]String[]String[]String[]String[]String[]String[]String[]String[]String[]String[]String[]String[]String[]String[]String[]String[]String[]String[]String[]String[]String[]String[]String[]String[]String[]String[]String[]String[]String[]String[]String[]String[]String[]String[]String[]String[]String[]String[]String[]String[]");
    }

    @Test
    public void test03507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03507");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOf("4444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444aaaaaaaaaa", 493, 43);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test03508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03508");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphanumericSpace((java.lang.CharSequence) ".LANG.LANG.LANG.LANG.Llitu");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test03509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03509");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                    JAVA.LANGAVAJ.GNALJAVA.LANGAVAJ.GNALJAVA.LANGAVAJ.GNALJAVA.LANGAVAJ.GNALJAVA.LANGAVAJ.GNALJAVA.LANGAVAJ.GNALJAVA.LANGAVAJ.GNALJAVA.LANGAVAJ.GNALJAVA.LANG", "NTERFACEJAVA.LANG.cLONEABLE.......JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVAINTERFACEJAVA.IO.sERIALIZABLE");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 516 + "'", int2 == 516);
    }

    @Test
    public void test03510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03510");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.endsWith("                      INTEGER                       ", "gnalArrayListArrayListArrayListavaj.gnalArrayListArrayListArrayLi");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test03511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03511");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripToNull("nterface java.lang.Cloneable.......java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........javainterface java.io.Serializable");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "nterface java.lang.Cloneable.......java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........javainterface java.io.Serializable" + "'", str1, "nterface java.lang.Cloneable.......java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........javainterface java.io.Serializable");
    }

    @Test
    public void test03512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03512");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trimToEmpty("$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$################################");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$################################" + "'", str1, "$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$################################");
    }

    @Test
    public void test03513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03513");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringAfterLast("...       aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "ARR.avalitu.AAAAAAAAAAAAAAAAAAAAAAAAAAAAAA... AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA... AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA... AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA... AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA... AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA... AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA... AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA... AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA... AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAYLIST");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test03514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03514");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("class java.lang.String", "                                   ");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.stripAll(strArray2);
        java.lang.Class<?>[] wildcardClassArray4 = org.apache.commons.lang3.ClassUtils.toClass((java.lang.Object[]) strArray3);
        java.lang.String[] strArray6 = new java.lang.String[] { "                                   " };
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.getCommonPrefix(strArray6);
        java.lang.Class<?>[] wildcardClassArray8 = org.apache.commons.lang3.ClassUtils.toClass((java.lang.Object[]) strArray6);
        java.lang.Class<?>[] wildcardClassArray9 = org.apache.commons.lang3.ClassUtils.primitivesToWrappers(wildcardClassArray8);
        boolean boolean11 = org.apache.commons.lang3.ClassUtils.isAssignable(wildcardClassArray4, wildcardClassArray8, false);
        java.lang.Class<?> wildcardClass12 = null;
        java.lang.Class[] classArray14 = new java.lang.Class[1];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray15 = (java.lang.Class<?>[]) classArray14;
        wildcardClassArray15[0] = wildcardClass12;
        java.lang.Class[] classArray19 = new java.lang.Class[0];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray20 = (java.lang.Class<?>[]) classArray19;
        boolean boolean22 = org.apache.commons.lang3.ClassUtils.isAssignable(wildcardClassArray15, wildcardClassArray20, false);
        boolean boolean24 = org.apache.commons.lang3.ClassUtils.isAssignable(wildcardClassArray8, wildcardClassArray20, false);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str28 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) wildcardClassArray20, 'a', (int) ' ', 34);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 32");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertNotNull(wildcardClassArray4);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "                                   " + "'", str7, "                                   ");
        org.junit.Assert.assertNotNull(wildcardClassArray8);
        org.junit.Assert.assertNotNull(wildcardClassArray9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(classArray14);
        org.junit.Assert.assertNotNull(wildcardClassArray15);
        org.junit.Assert.assertNotNull(classArray19);
        org.junit.Assert.assertNotNull(wildcardClassArray20);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
    }

    @Test
    public void test03515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03515");
        java.lang.String str1 = org.apache.commons.lang3.ClassUtils.getShortCanonicalName("Java.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.lang");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "lang" + "'", str1, "lang");
    }

    @Test
    public void test03516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03516");
        int int3 = org.apache.commons.lang3.StringUtils.indexOf("################################...       AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA", 525, 3);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test03517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03517");
        java.lang.String str1 = org.apache.commons.lang3.ClassUtils.getShortClassName("irfCo$irfioSriiz");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "irfCo.irfioSriiz" + "'", str1, "irfCo.irfioSriiz");
    }

    @Test
    public void test03518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03518");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.lowerCase("Arra");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "arra" + "'", str1, "arra");
    }

    @Test
    public void test03519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03519");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNumeric((java.lang.CharSequence) "gnalArrayListArrayListArrayListavaj.gnalArrayListArrayListArrayLi");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test03520() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03520");
        java.lang.ClassLoader classLoader0 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass3 = org.apache.commons.lang3.ClassUtils.getClass(classLoader0, "            java.util             ", true);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassNotFoundException; message: java/util");
        } catch (java.lang.ClassNotFoundException e) {
            // Expected exception.
        }
    }

    @Test
    public void test03521() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03521");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.remove("...VA.LANGAVAJ.GNALJAVA.LANGAVAJ.GNALJAVA.LANGAVAJ.GNALJAVA.LANGAVAJ.GNALJAVA.LANGAVAJ.GNALJAVA.LANG", 'a');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "...VA.LANGAVAJ.GNALJAVA.LANGAVAJ.GNALJAVA.LANGAVAJ.GNALJAVA.LANGAVAJ.GNALJAVA.LANGAVAJ.GNALJAVA.LANG" + "'", str2, "...VA.LANGAVAJ.GNALJAVA.LANGAVAJ.GNALJAVA.LANGAVAJ.GNALJAVA.LANGAVAJ.GNALJAVA.LANGAVAJ.GNALJAVA.LANG");
    }

    @Test
    public void test03522() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03522");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOf("...AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA...AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA...AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA...AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA...AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA...AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA...AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA...AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA...AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA..", "iNTERFACE JAVA.LANG.cLONEABLE.......JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVAINTERFACE JAVA.IO.sERIALIZABLE");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test03523() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03523");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replace("interface java.lang.cloneable.......java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........javainterface java.io.serializable", "gnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnal.LANG.LANG.LANG.LANG.LANG.LANG.Llituava.la", "       $");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "interface java.lang.cloneable.......java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........javainterface java.io.serializable" + "'", str3, "interface java.lang.cloneable.......java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........javainterface java.io.serializable");
    }

    @Test
    public void test03524() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03524");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substring("hi!Arr...", 6);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "..." + "'", str2, "...");
    }

    @Test
    public void test03525() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03525");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.swapCase("class java.lang.Class");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "CLASS JAVA.LANG.cLASS" + "'", str1, "CLASS JAVA.LANG.cLASS");
    }

    @Test
    public void test03526() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03526");
        int int2 = org.apache.commons.lang3.StringUtils.indexOf("Short", 11);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test03527() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03527");
        int int3 = org.apache.commons.lang3.StringUtils.indexOf("Class[]aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "JAVALITU", 153);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test03528() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03528");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.center("-1java.utilString[]                                                                                 ", (int) (short) 10);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "-1java.utilString[]                                                                                 " + "'", str2, "-1java.utilString[]                                                                                 ");
    }

    @Test
    public void test03529() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03529");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAllLowerCase((java.lang.CharSequence) "...AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA...AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA...AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA...AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA...AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA...AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA...AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA...AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA...AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA.");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test03530() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03530");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.endsWithIgnoreCase("AVAJ.GNALAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA       ", "              Integer              ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test03531() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03531");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.substring("interface gaga.lang.CloneableAAAAAAAAAAgagal.agnAAAAAAAAAAgagal.agnAAAAAAAAAAgagal.agnAAAAAAAAAAgagal.agnAAAAAAAAAAgagal.agnAAAAAAAAAAgagal.agnAAAAAAAAAAgagal.agnAAAAAAAAAAgagal.agnAAAAAAAAAAgagal.agnAAAAAAAAAAgagal.agnAAAAAAAAAAgagal.agnAAAAAAAAAAgagal.agnAAAAAAAAAAgagal.agnAAAAAAAAAAgagal.agnAAAAAAAAAAgagal.agnAAAAAAAAAAgagal.agnAAAAAAAAAAgagal.agnAAAAAAAAAAgagal.agnAAAAAAAAAAgagal.agnAAAAAAAAAAgagal.agnAAAAAAAAAAgagal.agnAAAAAAAAAAgagal.agnAAAAAAAAAAgagal.agnAAAAAAAAAAgagal.agnAAAAAAAAAAgagal.agnAAAAAAAAAAgagal.agnAAAAAAAAAAgagal.agnAAAAAAAAAAgagal.agnAAAAAAAAAAgagal.agnAAAAAAAAAAgagal.agnAAAAAAAAAAgagal.agnAAAAAAAAAAgagal.agnAAAAAAAAAAgagal.agnAAAAAAAAAAgagal.agnAAAAAAAAAAgagal.agnAAAAAAAAAAringinterface gaga.io.Serializable", (int) '$', 2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test03532() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03532");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "                       JAVAULANGrrayList", "4444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444AAAAAAAAAA");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test03533() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03533");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.center("HI!aRRAYlISTaRRAYlISTaRRAYlISTAVAJ.GNALaRRAYlISTaRRAYlISTaRRAYlISTAVAJ", 545, ' ');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "                                                                                                                                                                                                                                             HI!aRRAYlISTaRRAYlISTaRRAYlISTAVAJ.GNALaRRAYlISTaRRAYlISTaRRAYlISTAVAJ                                                                                                                                                                                                                                              " + "'", str3, "                                                                                                                                                                                                                                             HI!aRRAYlISTaRRAYlISTaRRAYlISTAVAJ.GNALaRRAYlISTaRRAYlISTaRRAYlISTAVAJ                                                                                                                                                                                                                                              ");
    }

    @Test
    public void test03534() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03534");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.defaultString("#", "JAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANG");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "#" + "'", str2, "#");
    }

    @Test
    public void test03535() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03535");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeEnd("#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#lass java#lang#String", "VAJ.GNALJAVA.LANGAVAJ.GNALJAVA.LANGAVAJ.GNALJAVA.LANGAVAJ.GNALJAVA.LANGAVAJ.GNALJAVA.LANGAVAJ.GNALJAVA.LANG");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#lass java#lang#String" + "'", str2, "#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#lass java#lang#String");
    }

    @Test
    public void test03536() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03536");
        java.lang.String str2 = org.apache.commons.lang3.ClassUtils.getPackageName((java.lang.Object) "tsiLyarrA.La.lang", "ARJAVAARRARJAVAARRARJAVAARRARJAVAARRARJAVAARRARJAVAARRARJAVAARRARJAVAARRARJAVAARRARJAVAARRARJAVAARRARJAVAARRARJAVAARRARJAVAARRARJAVAARRARJAVAARRARJAVAARRARJAVAARRARJAVAARRARJAVAARRARJAVAARRARJAVAARRARJAVAARRARJAVAARRARJAVAARRARJAVAARRARJAVAARRARJAVAARRARJAVAARRARJAVAARRARJAVAARRARJAVAARRARJAVAARRARJAVAARRARJAVAARRARJAVAARRARJAVAARRARJAVAARRARJAVAARRARJAVAARRARJAVAARRARJAVAARRARJAVAARRARJAVAARRARJAVAARRARJAVAARRARJAVAARRARJAVAARRARJAVAARRARJAVAARRARJAVAARRARJAVAARRARJAlass java.lang.String");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "java.lang" + "'", str2, "java.lang");
    }

    @Test
    public void test03537() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03537");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsAny("AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA", "gnal.avajgnal..LANGgnal.avajgnal");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test03538() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03538");
        java.lang.String str1 = org.apache.commons.lang3.ClassUtils.getShortCanonicalName("AtsiLytcejbO.gnal.avaj ssalcrrAtsiLytcejbO.gnal.avaj ssalcrrAva.langGNAL..langjava.langAGNAL.AVAJ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "AVAJ" + "'", str1, "AVAJ");
    }

    @Test
    public void test03539() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03539");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeStartIgnoreCase("                                                                                          GNAL.AVAJ ", "#########");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                                                                          GNAL.AVAJ " + "'", str2, "                                                                                          GNAL.AVAJ ");
    }

    @Test
    public void test03540() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03540");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trimToEmpty(" ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
    }

    @Test
    public void test03541() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03541");
        int int3 = org.apache.commons.lang3.StringUtils.indexOf("JAVA.UTIL", 46, (int) (byte) 100);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test03542() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03542");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceOnce("CLASS JAVALANGCLASS                       JAVAULANG                       JAVAULANG                       JAVAULANG                       JAVAULANG                       JAVAULANG                       JAVAULANG                       JAVAULANG                       JAVAULANG                       JAVAULANG                       JAVAULANG                       JAVAULANG                       JAVAULANG                       JAVAULANG                       JAVAULANG                       JAVAULANG                       JAVAULANG                       JAVAULANG                       JAVAULANG                       JAVAULANG                       JAVAULANG        ", "ARRAYLISTARRAYLISTARRAYLISTAVAJ", "AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "CLASS JAVALANGCLASS                       JAVAULANG                       JAVAULANG                       JAVAULANG                       JAVAULANG                       JAVAULANG                       JAVAULANG                       JAVAULANG                       JAVAULANG                       JAVAULANG                       JAVAULANG                       JAVAULANG                       JAVAULANG                       JAVAULANG                       JAVAULANG                       JAVAULANG                       JAVAULANG                       JAVAULANG                       JAVAULANG                       JAVAULANG                       JAVAULANG        " + "'", str3, "CLASS JAVALANGCLASS                       JAVAULANG                       JAVAULANG                       JAVAULANG                       JAVAULANG                       JAVAULANG                       JAVAULANG                       JAVAULANG                       JAVAULANG                       JAVAULANG                       JAVAULANG                       JAVAULANG                       JAVAULANG                       JAVAULANG                       JAVAULANG                       JAVAULANG                       JAVAULANG                       JAVAULANG                       JAVAULANG                       JAVAULANG                       JAVAULANG        ");
    }

    @Test
    public void test03543() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03543");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.substringsBetween("class java.lang.Class                       JAVAULANG                       JAVAULANG                       JAVAULANG                       JAVAULANG                       JAVAULANG                       JAVAULANG                       JAVAULANG                       JAVAULANG                       JAVAULANG                       JAVAULANG                       JAVAULANG                       JAVAULANG                       JAVAULANG                       JAVAULANG                       JAVAULANG                       JAVAULANG                       JAVAULANG                       JAVAULANG                       JAVAULANG                       JAVAULANG        ", "AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA       ", " AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA");
        org.junit.Assert.assertNull(strArray3);
    }

    @Test
    public void test03544() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03544");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.defaultString("sERIALIZABLE", "interface java.lang.Cloneable.......java.......Objectava..........javainterface java.io.Serializable");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "sERIALIZABLE" + "'", str2, "sERIALIZABLE");
    }

    @Test
    public void test03545() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03545");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.contains("ARRAYLISTARRAYLISTARRAYLISTAVAJ.GNAL", "Arr... aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa... aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa... aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa... aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa... aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa... aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa... aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa... aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa... aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa... aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaylist");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test03546() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03546");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.leftPad("44444444444444444.444444444444444444...                                 ", (int) (byte) 10);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "44444444444444444.444444444444444444...                                 " + "'", str2, "44444444444444444.444444444444444444...                                 ");
    }

    @Test
    public void test03547() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03547");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripToNull("AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA" + "'", str1, "AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA");
    }

    @Test
    public void test03548() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03548");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfIgnoreCase("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa      ", "javastringnalarraylistarraylistarraylistavaj.gnalarraylistarraylistarrayli");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test03549() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03549");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trim("BYTE");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "BYTE" + "'", str1, "BYTE");
    }

    @Test
    public void test03550() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03550");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.center("javaulang", 152, "44444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444             Character             ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "44444444444444444444444444444444444444444444444444444444444444444444444javaulang444444444444444444444444444444444444444444444444444444444444444444444444" + "'", str3, "44444444444444444444444444444444444444444444444444444444444444444444444javaulang444444444444444444444444444444444444444444444444444444444444444444444444");
    }

    @Test
    public void test03551() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03551");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.right("java.lang$interface java.lang.Cloneable$interface java.io.Serializableinterface java.lang.Cloneable$interface java.io.Serializableinterface java.lang.Cl", 10);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "va.lang.Cl" + "'", str2, "va.lang.Cl");
    }

    @Test
    public void test03552() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03552");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.chop("...       ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "...      " + "'", str1, "...      ");
    }

    @Test
    public void test03553() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03553");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "Object", "ArrayListArrayListArrayListavaj.gnal");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test03554() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03554");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.deleteWhitespace("                                                                                                    ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
    }

    @Test
    public void test03555() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03555");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.equals((java.lang.CharSequence) "rrayList", (java.lang.CharSequence) "Java.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test03556() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03556");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "irfCo.irfioSriiz", "interfacegaga.lang.CloneableAAAAAAAAAAgagal.agnAAAAAAAAAAgagal.agnAAAAAAAAAAgagal.agnAAAAAAAAAAgagal.agnAAAAAAAAAAgagal.agnAAAAAAAAAAgagal.agnAAAAAAAAAAgagal.agnAAAAAAAAAAgagal.agnAAAAAAAAAAgagal.agnAAAAAAAAAAgagal.agnAAAAAAAAAAgagal.agnAAAAAAAAAAgagal.agnAAAAAAAAAAgagal.agnAAAAAAAAAAgagal.agnAAAAAAAAAAgagal.agnAAAAAAAAAAgagal.agnAAAAAAAAAAgagal.agnAAAAAAAAAAgagal.agnAAAAAAAAAAgagal.agnAAAAAAAAAAgagal.agnAAAAAAAAAAgagal.agnAAAAAAAAAAgagal.agnAAAAAAAAAAgagal.agnAAAAAAAAAAgagal.agnAAAAAAAAAAgagal.agnAAAAAAAAAAgagal.agnAAAAAAAAAAgagal.agnAAAAAAAAAAgagal.agnAAAAAAAAAAgagal.agnAAAAAAAAAAgagal.agnAAAAAAAAAAgagal.agnAAAAAAAAAAgagal.agnAAAAAAAAAAgagal.agnAAAAAAAAAAgagal.agnAAAAAAAAAAgagal.agnAAAAAAAAAAringinterfacegaga.io.Serializable");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test03557() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03557");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.left("Boolean", 23);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Boolean" + "'", str2, "Boolean");
    }

    @Test
    public void test03558() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03558");
        int int3 = org.apache.commons.lang3.StringUtils.indexOfIgnoreCase("GNAL.AVAJLANG.JAVAGNAL.AVAJLANG.JAVAGNAL.AVAJLANG.JAVAGNAL.AVAJLANG.JAVAGNAL.AVAJLANG.JAVAGNAL.AVAJLANG.JAVAGNAL.AVAJLANG.JAVAGNAL.AVAJLANG.JAVAGNAL.AVAJ", "4444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444ssssssssss", 96);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test03559() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03559");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "gn                                            ", "INTEGE");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test03560() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03560");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.swapCase("                                           ...");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "                                           ..." + "'", str1, "                                           ...");
    }

    @Test
    public void test03561() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03561");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlpha((java.lang.CharSequence) "gnal.aL.ArrayList");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test03562() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03562");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("4444444444444", "       aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", 47);
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void test03563() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03563");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.strip("arraylistarraylistarraylistavaj.gnal", "lass java.lang.String");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "ylistarraylistarray" + "'", str2, "ylistarraylistarray");
    }

    @Test
    public void test03564() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03564");
        int int2 = org.apache.commons.lang3.StringUtils.countMatches("", "                                  ");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test03565() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03565");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.split("interface java.lang.CloneableString[]String[]String[]String[]String[]String[]String[]String[]String[]String[]String[]String[]String[]String[]String[]String[]String[]String[]String[]String[]String[]String[]String[]String[]String[]String[]String[]String[]String[]String[]String[]String[]String[]String[]String[]String[]String[]String[]String[]String[]String[]String[]String[]String[]String[]String[]String[]String[]String[]String[]String[]String[]String[]String[]String[]String[]String[]String[]String[]String[]String[]String[]String[]String[]String[]String[]String[]interface java.io.Serializable", "litu");
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test03566() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03566");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.endsWithIgnoreCase("$$$$$$$$$$$$$$$$$$$$$$$$$$$$$...$$$$$$$$$$$$$$$$$$$$$$$$$$$$$...$$$$$$$$$$$$$$$$$$$$$$$$$$$$$...       ", "       $");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test03567() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03567");
        int int3 = org.apache.commons.lang3.StringUtils.ordinalIndexOf("JAVAlLANG", "javal       aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaagn", 96);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test03568() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03568");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.rightPad("lang.javatsilyarratsilyarratsilyarra", (int) (byte) 1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "lang.javatsilyarratsilyarratsilyarra" + "'", str2, "lang.javatsilyarratsilyarratsilyarra");
    }

    @Test
    public void test03569() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03569");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.defaultIfBlank("javaStringnalArrayListArrayListArrayListavaj.gnalArrayListArrayListArrayLi", "ArrayListArrayListArrayListavajagnal");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "javaStringnalArrayListArrayListArrayListavaj.gnalArrayListArrayListArrayLi" + "'", str2, "javaStringnalArrayListArrayListArrayListavaj.gnalArrayListArrayListArrayLi");
    }

    @Test
    public void test03570() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03570");
        int int3 = org.apache.commons.lang3.StringUtils.ordinalIndexOf("gnirtS.gnal.avaj ssalc", "String[]String[]String[]String[]String[]String[]String[]String[]String[]String[]String[]String[]String[]String[]String[]String[]String[]String[]String[]String[]String[]String[]String[]String[]String[]String[]String[]String[]String[]String[]String[]String[]String[]String[]String[]String[]String[]String[]String[]String[]String[]String[]String[]String[]String[]String[]String[]String[]String[]String[]String[]String[]String[]String[]String[]String[]String[]String[]String[]String[]String[]String[]String[]String[]String[]String[]String[]", 525);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test03571() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03571");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.lowerCase("JAVAJAVAJAVAJAVAJAVAJAVAJAVAJAVAJAVAJAVAJAVAJAVAJAVAJAVAJAVAJAVAJAVAJAVAJAVAJAVAJAVAJAVAJAVAJAVAJAVAJAVAJAVAJAVAJAVAJAVAJAVAJAVAJAVAJAVA");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "javajavajavajavajavajavajavajavajavajavajavajavajavajavajavajavajavajavajavajavajavajavajavajavajavajavajavajavajavajavajavajavajavajava" + "'", str1, "javajavajavajavajavajavajavajavajavajavajavajavajavajavajavajavajavajavajavajavajavajavajavajavajavajavajavajavajavajavajavajavajavajava");
    }

    @Test
    public void test03572() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03572");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("", "etyBetyBetyBetyBetyBetyBetyBetyBetyBetyBetyBetyBetyBetyBetyBetyBetyBetyBetyBetyBetyBetyBetyB");
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray2, 'a');
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
    }

    @Test
    public void test03573() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03573");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.remove("litu.avajlitu.avaj", ".       .       .       .       .       .       .       .       .       .       .       .       .       .       .       .       .       .       .       .       .       .       .       .       .       .       .       .       .       .       .       .       .       .       .       .       .       .       .       .       .       .       .       .       .       .       .       .       .       .       .       .       .       .       .       .       .       .       .       .       .       .       .       .       .       .       .       .       .       .       .       .       .       .       .       .       .       .       .       .       .       .       .       .       .       .       .       .       .       .       .       .       .       .       .       .       .       .       .       .       ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "litu.avajlitu.avaj" + "'", str2, "litu.avajlitu.avaj");
    }

    @Test
    public void test03574() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03574");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass1 = org.apache.commons.lang3.ClassUtils.getClass("JAVA.LANGAgnal.avajgnal..LANGgnal.avArrclass java.lang.ObjectyListArrclass java.lang.ObjectyListA");
            org.junit.Assert.fail("Expected exception of type java.lang.ClassNotFoundException; message: JAVA/LANGAgnal/avajgnal//LANGgnal/avArrclassjava/lang/ObjectyListArrclassjava/lang/ObjectyListA");
        } catch (java.lang.ClassNotFoundException e) {
            // Expected exception.
        }
    }

    @Test
    public void test03575() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03575");
        int int3 = org.apache.commons.lang3.StringUtils.indexOf("JAVA.LANGAVAJ.GNALJAVA.LANGAVAJ.GNALJAVA.LANGAVAJ.GNALJAVA.LANGAVAJ.GNALJAVA.LANGAVAJ.GNALJAVA.LANGAVAJ.GNALJAVA.LANGAVAJ.GNALJAVA.LANGAVAJ.GNALJAVA.LANG", ".LANG.LANG.LANG.LANG.Llitu", 3);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test03576() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03576");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.rightPad("hi!ArrayListArrayListArrayListavajhhhh AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAhhh AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAhhh AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAhhh AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAhhh AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAhhh AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAhhh AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAhhh AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAhhh AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAhhh AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA", 2, 'a');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!ArrayListArrayListArrayListavajhhhh AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAhhh AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAhhh AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAhhh AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAhhh AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAhhh AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAhhh AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAhhh AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAhhh AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAhhh AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA" + "'", str3, "hi!ArrayListArrayListArrayListavajhhhh AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAhhh AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAhhh AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAhhh AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAhhh AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAhhh AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAhhh AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAhhh AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAhhh AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAhhh AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA");
    }

    @Test
    public void test03577() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03577");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitByCharacterTypeCamelCase("javal.agn");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.stripAll(strArray1, "");
        java.lang.Class<?> wildcardClass4 = strArray3.getClass();
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test03578() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03578");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.swapCase("GNAL.AVAJGNAL..langGNAL.AVAJGNAL.");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "gnal.avajgnal..LANGgnal.avajgnal." + "'", str1, "gnal.avajgnal..LANGgnal.avajgnal.");
    }

    @Test
    public void test03579() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03579");
        java.lang.CharSequence charSequence2 = org.apache.commons.lang3.StringUtils.defaultIfBlank((java.lang.CharSequence) "java.langjava.langjava.langjava.langjava.langjava.la                                                ", (java.lang.CharSequence) "######################                                                                                                                                  ");
        org.junit.Assert.assertEquals("'" + charSequence2 + "' != '" + "java.langjava.langjava.langjava.langjava.langjava.la                                                " + "'", charSequence2, "java.langjava.langjava.langjava.langjava.langjava.la                                                ");
    }

    @Test
    public void test03580() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03580");
        int int2 = org.apache.commons.lang3.StringUtils.indexOf("JAVAsTRIN", "AVAJ");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test03581() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03581");
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
        boolean boolean65 = org.apache.commons.lang3.ClassUtils.isAssignable(wildcardClassArray33, wildcardClassArray63);
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
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "" + "'", str32, "");
        org.junit.Assert.assertNotNull(wildcardClassArray33);
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
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + true + "'", boolean65 == true);
        org.junit.Assert.assertNotNull(wildcardClass66);
    }

    @Test
    public void test03582() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03582");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass1 = org.apache.commons.lang3.ClassUtils.getClass("avaj.gnalavaj.gnalavaj.gnal");
            org.junit.Assert.fail("Expected exception of type java.lang.ClassNotFoundException; message: avaj.gnalavaj.gnalavaj.gnal");
        } catch (java.lang.ClassNotFoundException e) {
            // Expected exception.
        }
    }

    @Test
    public void test03583() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03583");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceOnce("                                                                                                                                                      ...", "gnal$.$avaj", "String[]");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "                                                                                                                                                      ..." + "'", str3, "                                                                                                                                                      ...");
    }

    @Test
    public void test03584() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03584");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.stripStart("NTERF CEAJ V AL NGAcLONE BLEAAAAAAAJ V AAAAAAAAAAJ V AAAAAAAAAAJ V AAAAAAAAAAJ V AAAAAAAAAAJ V AAAAAAAAAAJ V AAAAAAAAAAJ V AAAAAAAAAAJ V AAAAAAAAAAJ V AAAAAAAAAAJ V AAAAAAAAAAJ V AAAAAAAAAAJ V AAAAAAAAAAJ V AAAAAAAAAAJ V AAAAAAAAAAJ V AAAAAAAAAAJ V AAAAAAAAAAJ V AAAAAAAAAAJ V AAAAAAAAAAJ V AAAAAAAAAAJ V AAAAAAAAAAJ V AAAAAAAAAAJ V AAAAAAAAAAJ V AAAAAAAAAAJ V AAAAAAAAAAJ V AAAAAAAAAAJ V AAAAAAAAAAJ V AAAAAAAAAAJ V AAAAAAAAAAJ V AAAAAAAAAAJ V AAAAAAAAAAJ V AAAAAAAAAAJ V AAAAAAAAAAJ V AAAAAAAAAAJ V AAAAAAAAAAJ V INTERF CEAJ V AIOAsERI LIZ BLE", "... AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA... AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA... AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA... AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA... AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA... AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA... AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA... AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA... AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA... AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "NTERF CEAJ V AL NGAcLONE BLEAAAAAAAJ V AAAAAAAAAAJ V AAAAAAAAAAJ V AAAAAAAAAAJ V AAAAAAAAAAJ V AAAAAAAAAAJ V AAAAAAAAAAJ V AAAAAAAAAAJ V AAAAAAAAAAJ V AAAAAAAAAAJ V AAAAAAAAAAJ V AAAAAAAAAAJ V AAAAAAAAAAJ V AAAAAAAAAAJ V AAAAAAAAAAJ V AAAAAAAAAAJ V AAAAAAAAAAJ V AAAAAAAAAAJ V AAAAAAAAAAJ V AAAAAAAAAAJ V AAAAAAAAAAJ V AAAAAAAAAAJ V AAAAAAAAAAJ V AAAAAAAAAAJ V AAAAAAAAAAJ V AAAAAAAAAAJ V AAAAAAAAAAJ V AAAAAAAAAAJ V AAAAAAAAAAJ V AAAAAAAAAAJ V AAAAAAAAAAJ V AAAAAAAAAAJ V AAAAAAAAAAJ V AAAAAAAAAAJ V AAAAAAAAAAJ V INTERF CEAJ V AIOAsERI LIZ BLE" + "'", str2, "NTERF CEAJ V AL NGAcLONE BLEAAAAAAAJ V AAAAAAAAAAJ V AAAAAAAAAAJ V AAAAAAAAAAJ V AAAAAAAAAAJ V AAAAAAAAAAJ V AAAAAAAAAAJ V AAAAAAAAAAJ V AAAAAAAAAAJ V AAAAAAAAAAJ V AAAAAAAAAAJ V AAAAAAAAAAJ V AAAAAAAAAAJ V AAAAAAAAAAJ V AAAAAAAAAAJ V AAAAAAAAAAJ V AAAAAAAAAAJ V AAAAAAAAAAJ V AAAAAAAAAAJ V AAAAAAAAAAJ V AAAAAAAAAAJ V AAAAAAAAAAJ V AAAAAAAAAAJ V AAAAAAAAAAJ V AAAAAAAAAAJ V AAAAAAAAAAJ V AAAAAAAAAAJ V AAAAAAAAAAJ V AAAAAAAAAAJ V AAAAAAAAAAJ V AAAAAAAAAAJ V AAAAAAAAAAJ V AAAAAAAAAAJ V AAAAAAAAAAJ V AAAAAAAAAAJ V INTERF CEAJ V AIOAsERI LIZ BLE");
    }

    @Test
    public void test03585() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03585");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replace("class java.lang.Class                       JAVAULANG                       JAVAULANG                       JAVAULANG                       JAVAULANG                       JAVAULANG                       JAVAULANG                       JAVAULANG                       JAVAULANG                       JAVAULANG                       JAVAULANG                       JAVAULANG                       JAVAULANG                       JAVAULANG                       JAVAULANG                       JAVAULANG                       JAVAULANG                       JAVAULANG                       JAVAULANG                       JAVAULANG                       JAVAULANG        ", "4444444string.44444444", "AAAAAAAAAAAAAAAAAAAjavaulangAAAAAAAAAAAAAAAAAAA");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "class java.lang.Class                       JAVAULANG                       JAVAULANG                       JAVAULANG                       JAVAULANG                       JAVAULANG                       JAVAULANG                       JAVAULANG                       JAVAULANG                       JAVAULANG                       JAVAULANG                       JAVAULANG                       JAVAULANG                       JAVAULANG                       JAVAULANG                       JAVAULANG                       JAVAULANG                       JAVAULANG                       JAVAULANG                       JAVAULANG                       JAVAULANG        " + "'", str3, "class java.lang.Class                       JAVAULANG                       JAVAULANG                       JAVAULANG                       JAVAULANG                       JAVAULANG                       JAVAULANG                       JAVAULANG                       JAVAULANG                       JAVAULANG                       JAVAULANG                       JAVAULANG                       JAVAULANG                       JAVAULANG                       JAVAULANG                       JAVAULANG                       JAVAULANG                       JAVAULANG                       JAVAULANG                       JAVAULANG                       JAVAULANG        ");
    }

    @Test
    public void test03586() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03586");
        int int3 = org.apache.commons.lang3.StringUtils.lastOrdinalIndexOf("java.lang$interface java.lang.Cloneable$interface java.io.Serializableinterface java.lang.Cloneable$interface java.io.Serializableinterface java.lang.Cl", ".. u", 940);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test03587() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03587");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "java");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test03588() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03588");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.abbreviate("     AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA", 106, 99);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "     AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA" + "'", str3, "     AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA");
    }

    @Test
    public void test03589() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03589");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsIgnoreCase("$$$$$$$$$$$$$$$$$$$$$$$$$$$$$...$$$$$$$$$$$$$$$$$$$$$$$$$$$$$...$$$$$$$$$$$$$$$$$$$$$$$$$$$$$...       ", "44444444444444444.444444444444444444...                                 ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test03590() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03590");
        java.lang.String str1 = org.apache.commons.lang3.ClassUtils.getShortCanonicalName("AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA       AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA       AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA       AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA       AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA       AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA       ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA" + "'", str1, "AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA");
    }

    @Test
    public void test03591() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03591");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.upperCase("ClassslitUgnirtSslitUgnirtSslitUgnirtSslitUgnirtSslitUgnirtSslitUgnirtSslitUgnirtSslitUgnirtSslitUgnirtSslitUgnirtS");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "CLASSSLITUGNIRTSSLITUGNIRTSSLITUGNIRTSSLITUGNIRTSSLITUGNIRTSSLITUGNIRTSSLITUGNIRTSSLITUGNIRTSSLITUGNIRTSSLITUGNIRTS" + "'", str1, "CLASSSLITUGNIRTSSLITUGNIRTSSLITUGNIRTSSLITUGNIRTSSLITUGNIRTSSLITUGNIRTSSLITUGNIRTSSLITUGNIRTSSLITUGNIRTSSLITUGNIRTS");
    }

    @Test
    public void test03592() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03592");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "CLASS JAVA.LANG.cLASS", "....................................................................                       JAVAULANG");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
    }

    @Test
    public void test03593() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03593");
        int int3 = org.apache.commons.lang3.StringUtils.ordinalIndexOf("...O.gnal.avaj ssalcrrAtsiLytcejbO.gnal.avaj ssalcrrAva.langGNAL..langjava.langAGNAL.AVAJ", "4444444string.44444444", 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test03594() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03594");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.split("AAAAAAAAAA", "java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........javainterface java.io.Serializable");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str6 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray2, ' ', (int) '4', 669);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 52");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test03595() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03595");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replace("", "                          ", "444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa       444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test03596() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03596");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAllLowerCase((java.lang.CharSequence) "INTEGE");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test03597() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03597");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.center("Java.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava", 1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Java.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava" + "'", str2, "Java.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava");
    }

    @Test
    public void test03598() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03598");
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.overlay("elbazilaireS.oi.avaj ecafretnignirtSelbaenolC.gnal.avaj ecafretni", "string.", 0, 47);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "string.nal.avaj ecafretni" + "'", str4, "string.nal.avaj ecafretni");
    }

    @Test
    public void test03599() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03599");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.remove("gnal.aL.ArrayList", "#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#lass java#lang#String");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "gnal.aL.ArrayList" + "'", str2, "gnal.aL.ArrayList");
    }

    @Test
    public void test03600() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03600");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.swapCase("LANG.GNALJAVA.LANGAVAJ.GNALJAVA.LANGAVAJ.GNALJAVA.LANGAVAJ.GNALJAVA.LA");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "lang.gnaljava.langavaj.gnaljava.langavaj.gnaljava.langavaj.gnaljava.la" + "'", str1, "lang.gnaljava.langavaj.gnaljava.langavaj.gnaljava.langavaj.gnaljava.la");
    }

    @Test
    public void test03601() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03601");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfDifference((java.lang.CharSequence) ". ", (java.lang.CharSequence) "Class[]");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test03602() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03602");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.defaultString(" AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA", "interface java.lang.CloneableStringinterface java.io");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + " AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA" + "'", str2, " AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA");
    }

    @Test
    public void test03603() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03603");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeEndIgnoreCase("gnal.aL.ArrayList", "irfCo$irfioSriizaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "gnal.aL.ArrayList" + "'", str2, "gnal.aL.ArrayList");
    }

    @Test
    public void test03604() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03604");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.split("AVAJ");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.stripAll(strArray1, "...AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA...AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA...AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA...AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA...AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA...AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA...AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA...AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA...AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA..");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str7 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray3, "            java.util             ", 96, 106);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 96");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void test03605() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03605");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.strip("hi!Arr...");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hi!Arr..." + "'", str1, "hi!Arr...");
    }

    @Test
    public void test03606() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03606");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOfIgnoreCase("...       ....       .java.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.lang...       ....       .java.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.lang...       ....       .java.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.lang...       ....       .java.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.lang...       ....       .java.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.lang...       ....       .", "AtsiLytcejbO.gnal.avaj ssalcrrAtsiLytcejbO.gnal.avaj ssalcrrAva.langGNAL..langjava.langAGNAL.AVAJ", 4);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test03607() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03607");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeEndIgnoreCase("... AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA... AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA... AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA... AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA... AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA... AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA... AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA... AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA... AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA... AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA", "][ssalC");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "... AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA... AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA... AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA... AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA... AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA... AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA... AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA... AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA... AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA... AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA" + "'", str2, "... AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA... AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA... AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA... AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA... AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA... AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA... AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA... AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA... AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA... AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA");
    }

    @Test
    public void test03608() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03608");
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.replace("gnirtS.gnal.avaj ssalc", "#                                   ", "etyB", 8);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "gnirtS.gnal.avaj ssalc" + "'", str4, "gnirtS.gnal.avaj ssalc");
    }

    @Test
    public void test03609() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03609");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeEndIgnoreCase("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "aaaaaaaaaa");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa" + "'", str2, "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
    }

    @Test
    public void test03610() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03610");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.substringsBetween("java.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.lang", "interfacegaga.lang.CloneableAAAAAAAAAAgagal.agnAAAAAAAAAAgagal.agnAAAAAAAAAAgagal.agnAAAAAAAAAAgagal.agnAAAAAAAAAAgagal.agnAAAAAAAAAAgagal.agnAAAAAAAAAAgagal.agnAAAAAAAAAAgagal.agnAAAAAAAAAAgagal.agnAAAAAAAAAAgagal.agnAAAAAAAAAAgagal.agnAAAAAAAAAAgagal.agnAAAAAAAAAAgagal.agnAAAAAAAAAAgagal.agnAAAAAAAAAAgagal.agnAAAAAAAAAAgagal.agnAAAAAAAAAAgagal.agnAAAAAAAAAAgagal.agnAAAAAAAAAAgagal.agnAAAAAAAAAAgagal.agnAAAAAAAAAAgagal.agnAAAAAAAAAAgagal.agnAAAAAAAAAAgagal.agnAAAAAAAAAAgagal.agnAAAAAAAAAAgagal.agnAAAAAAAAAAgagal.agnAAAAAAAAAAgagal.agnAAAAAAAAAAgagal.agnAAAAAAAAAAgagal.agnAAAAAAAAAAgagal.agnAAAAAAAAAAgagal.agnAAAAAAAAAAgagal.agnAAAAAAAAAAgagal.agnAAAAAAAAAAgagal.agnAAAAAAAAAAgagal.agnAAAAAAAAAAringinterfacegaga.io.Serializable", "...       ...       ...       ...       ...       ...       ...       ...       ...       ...   gna");
        org.junit.Assert.assertNull(strArray3);
    }

    @Test
    public void test03611() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03611");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.swapCase("avaj.gnalnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAA");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "AVAJ.GNALNaaaaaaaaaaJAVAL.AGNaaaaaaaaaaJAVAL.AGNaaaaaaaaaaJAVAL.AGNaaaaaaaaaaJAVAL.AGNaaaaaaaaaaJAVAL.AGNaaaaaaaaaaJAVAL.AGNaaaaaaaaaaJAVAL.AGNaaaaaaaaaaJAVAL.AGNaaaaaaaaaaJAVAL.AGNaaaaaaaaaaJAVAL.AGNaaaaaaaaaaJAVAL.AGNaaaaaaaaaaJAVAL.AGNaaaaaaaaaaJAVAL.AGNaaaaaaaaaaJAVAL.AGNaaaaaaaaaaJAVAL.AGNaaaaaaaaaaJAVAL.AGNaaaaaaaaaaJAVAL.AGNaaaaaaaaaaJAVAL.AGNaaaaaaaaaaJAVAL.AGNaaaaaaaaaaJAVAL.AGNaaaaaaaaaaJAVAL.AGNaaaaaaaaaaJAVAL.AGNaaaaaaaaaaJAVAL.AGNaaaaaaaaaaJAVAL.AGNaaaaaaaaaaJAVAL.AGNaaaaaaaaaaJAVAL.AGNaaaaaaaaaaJAVAL.AGNaaaaaaaaaaJAVAL.AGNaaaaaaaaaaJAVAL.AGNaaaaaaaaaaJAVAL.AGNaaaaaaaaaaJAVAL.AGNaaaaaaaaaaJAVAL.AGNaaaaaaaaaaJAVAL.AGNaaaaaaaaaaJAVAL.AGNaaaaaaaaaa" + "'", str1, "AVAJ.GNALNaaaaaaaaaaJAVAL.AGNaaaaaaaaaaJAVAL.AGNaaaaaaaaaaJAVAL.AGNaaaaaaaaaaJAVAL.AGNaaaaaaaaaaJAVAL.AGNaaaaaaaaaaJAVAL.AGNaaaaaaaaaaJAVAL.AGNaaaaaaaaaaJAVAL.AGNaaaaaaaaaaJAVAL.AGNaaaaaaaaaaJAVAL.AGNaaaaaaaaaaJAVAL.AGNaaaaaaaaaaJAVAL.AGNaaaaaaaaaaJAVAL.AGNaaaaaaaaaaJAVAL.AGNaaaaaaaaaaJAVAL.AGNaaaaaaaaaaJAVAL.AGNaaaaaaaaaaJAVAL.AGNaaaaaaaaaaJAVAL.AGNaaaaaaaaaaJAVAL.AGNaaaaaaaaaaJAVAL.AGNaaaaaaaaaaJAVAL.AGNaaaaaaaaaaJAVAL.AGNaaaaaaaaaaJAVAL.AGNaaaaaaaaaaJAVAL.AGNaaaaaaaaaaJAVAL.AGNaaaaaaaaaaJAVAL.AGNaaaaaaaaaaJAVAL.AGNaaaaaaaaaaJAVAL.AGNaaaaaaaaaaJAVAL.AGNaaaaaaaaaaJAVAL.AGNaaaaaaaaaaJAVAL.AGNaaaaaaaaaaJAVAL.AGNaaaaaaaaaaJAVAL.AGNaaaaaaaaaaJAVAL.AGNaaaaaaaaaa");
    }

    @Test
    public void test03612() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03612");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.equals((java.lang.CharSequence) "4444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444..........", (java.lang.CharSequence) "..........................................................................................");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test03613() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03613");
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("javal#.#agn", "", 6);
        boolean boolean5 = org.apache.commons.lang3.StringUtils.startsWithAny("vvaylasa", strArray4);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test03614() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03614");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("                      ", ' ');
        java.lang.String str6 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray2, '.', (int) (short) 100, (int) (byte) -1);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
    }

    @Test
    public void test03615() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03615");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.split("44444444444444444.444444444444444444", '#');
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.concat((java.lang.Object[]) strArray2);
        java.lang.Class<?>[] wildcardClassArray4 = org.apache.commons.lang3.ClassUtils.toClass((java.lang.Object[]) strArray2);
        java.lang.String[] strArray5 = org.apache.commons.lang3.StringUtils.stripAll(strArray2);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "44444444444444444.444444444444444444" + "'", str3, "44444444444444444.444444444444444444");
        org.junit.Assert.assertNotNull(wildcardClassArray4);
        org.junit.Assert.assertNotNull(strArray5);
    }

    @Test
    public void test03616() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03616");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfDifference((java.lang.CharSequence) "AAAAAAAAAAAAAAAAAAAgnaluavajAAAAAAAAAAAAAAAAAAA", (java.lang.CharSequence) "java.langjava.langjava.langjava.langjava.langjava.la                                                ");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test03617() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03617");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.apache.commons.lang3.StringUtils.abbreviate(". ", 3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Minimum abbreviation width is 4");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test03618() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03618");
        int int2 = org.apache.commons.lang3.StringUtils.indexOf("#########", (int) (short) 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test03619() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03619");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.rightPad("", 159, '#');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "###############################################################################################################################################################" + "'", str3, "###############################################################################################################################################################");
    }

    @Test
    public void test03620() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03620");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "4444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444aaaaaaaaaava.lang", "...AAAAA...");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 154 + "'", int2 == 154);
    }

    @Test
    public void test03621() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03621");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("...", "                                   ", (int) 'a');
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray3, "                                   ", (int) 'a', (int) '4');
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.concat((java.lang.Object[]) strArray3);
        java.lang.Class<?> wildcardClass9 = strArray3.getClass();
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "..." + "'", str8, "...");
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test03622() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03622");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOfIgnoreCase("                                  $$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$", "44444444444444444.444444444444444444...                                 ");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test03623() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03623");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.remove("....................................................................                       javaulang", "interface java.lang.Cloneable.......java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........javainterface java.io.Serializable");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "....................................................................                       javaulang" + "'", str2, "....................................................................                       javaulang");
    }

    @Test
    public void test03624() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03624");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.normalizeSpace("java.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.lang");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "java.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.lang" + "'", str1, "java.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.lang");
    }

    @Test
    public void test03625() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03625");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.deleteWhitespace("...AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA...AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA...AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA...AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA...AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA...AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA...AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA...AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA...AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA..");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "...AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA...AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA...AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA...AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA...AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA...AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA...AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA...AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA...AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA.." + "'", str1, "...AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA...AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA...AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA...AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA...AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA...AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA...AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA...AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA...AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA..");
    }

    @Test
    public void test03626() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03626");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfIgnoreCase("-1java", "...       .");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test03627() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03627");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.remove("              Integer              ", "irfCo.irfioSriiz");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "              Integer              " + "'", str2, "              Integer              ");
    }

    @Test
    public void test03628() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03628");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBeforeLast("-1java.utilString[]", "######################");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "-1java.utilString[]" + "'", str2, "-1java.utilString[]");
    }

    @Test
    public void test03629() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03629");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceOnce("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa      ", "AAAA                       JAVAULANGrrayList", "A..ayL A.");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa      " + "'", str3, "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa      ");
    }

    @Test
    public void test03630() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03630");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOf("javaulainterface java.lang.Cloneable4interface java.io.Serializable", "interface java.lang.Cloneable interface java.io.Serializable");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test03631() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03631");
        int int3 = org.apache.commons.lang3.StringUtils.indexOfIgnoreCase(".......", "....................................................................................................", 942);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test03632() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03632");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceOnce("INTEGE", "javal aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaagn", "4444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444aaaaaaaaaa");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "INTEGE" + "'", str3, "INTEGE");
    }

    @Test
    public void test03633() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03633");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("......", "avaj.gnalnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAA");
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test03634() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03634");
        int int2 = org.apache.commons.lang3.StringUtils.countMatches("java.lang$interface java.lang.Cloneable$interface java.io.Serializableinterface java.lang.Cloneable$interface java.io.Serializableinterface java.lang.Cl", "java$");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test03635() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03635");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.chomp("java.");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "java." + "'", str1, "java.");
    }

    @Test
    public void test03636() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03636");
        char[] charArray5 = new char[] { '$', 'a', '4', 'a' };
        boolean boolean6 = org.apache.commons.lang3.StringUtils.containsAny("                                    java.utiljava.util                                    ", charArray5);
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray5), "$a4a");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray5), "$a4a");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray5), "[$, a, 4, a]");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test03637() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03637");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.stripEnd("4444444string.44444444", "javal######################");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "4444444string.44444444" + "'", str2, "4444444string.44444444");
    }

    @Test
    public void test03638() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03638");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.stripStart("-1java.utilString[]    ", "AAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAring");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "-1java.utilString[]    " + "'", str2, "-1java.utilString[]    ");
    }

    @Test
    public void test03639() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03639");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripAccents((java.lang.CharSequence) "$######################################################################");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "$######################################################################" + "'", str1, "$######################################################################");
    }

    @Test
    public void test03640() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03640");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.split("JAVA.UTI");
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test03641() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03641");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNumeric((java.lang.CharSequence) "string.nal.avaj ecafretni");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test03642() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03642");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.abbreviate("#                                             ", 13, 67);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "#                                             " + "'", str3, "#                                             ");
    }

    @Test
    public void test03643() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03643");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.reverseDelimited("util", ' ');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "util" + "'", str2, "util");
    }

    @Test
    public void test03644() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03644");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.reverseDelimited("java.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.lang", ' ');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "java.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.lang" + "'", str2, "java.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.lang");
    }

    @Test
    public void test03645() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03645");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.containsWhitespace("$       ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test03646() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03646");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.right("Byte", 0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test03647() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03647");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOf("litulitulitulitulitul####litulitulitulitulitul", 67, (int) '.');
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test03648() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03648");
        java.lang.ClassLoader classLoader0 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass2 = org.apache.commons.lang3.ClassUtils.getClass(classLoader0, "...      ");
            org.junit.Assert.fail("Expected exception of type java.lang.ClassNotFoundException; message: ///");
        } catch (java.lang.ClassNotFoundException e) {
            // Expected exception.
        }
    }

    @Test
    public void test03649() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03649");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphanumericSpace((java.lang.CharSequence) "BYTE");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test03650() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03650");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.normalizeSpace("gnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnal.LANG.LANG.LANG.LANG.LANG.LANG.Llitu");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "gnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnal.LANG.LANG.LANG.LANG.LANG.LANG.Llitu" + "'", str1, "gnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnal.LANG.LANG.LANG.LANG.LANG.LANG.Llitu");
    }

    @Test
    public void test03651() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03651");
        java.util.Locale locale1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.apache.commons.lang3.StringUtils.lowerCase("JAVA.LANGaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", locale1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test03652() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03652");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.strip("java.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.lang");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "java.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.lang" + "'", str1, "java.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.lang");
    }

    @Test
    public void test03653() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03653");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringAfter("", "################################...       AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test03654() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03654");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripAccents((java.lang.CharSequence) "sERIALIZABLE");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "sERIALIZABLE" + "'", str1, "sERIALIZABLE");
    }

    @Test
    public void test03655() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03655");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "JAVALITU", "interface java.lang.CloneableStringinterface java.io.Serializable");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test03656() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03656");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOf("][ssalC", 9, 1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test03657() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03657");
        int int3 = org.apache.commons.lang3.StringUtils.indexOf("#", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", 50);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test03658() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03658");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBetween("A..ayL A.444444444444444444444444444", ".LANG");
        org.junit.Assert.assertNull(str2);
    }

    @Test
    public void test03659() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03659");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.rightPad("java$", (int) (short) 100, ".lang.Stringclass java.lang.Stringclass java.lang.Stringclas");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "java$.lang.Stringclass java.lang.Stringclass java.lang.Stringclas.lang.Stringclass java.lang.Stringc" + "'", str3, "java$.lang.Stringclass java.lang.Stringclass java.lang.Stringclas.lang.Stringclass java.lang.Stringc");
    }

    @Test
    public void test03660() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03660");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "slitUgnirtSslitUgnirtSslitUgnirtSslitUgnirtSslitUgnirtSslitUgnirtSslitUgnirtSslitUgnirtSslitUgnirtSslitUgnirtS", ".LANG");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test03661() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03661");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isWhitespace((java.lang.CharSequence) "gnaljava..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java.........");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test03662() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03662");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsIgnoreCase(" AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAyList", "Class");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test03663() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03663");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.lowerCase("ylistarraylistarray");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "ylistarraylistarray" + "'", str1, "ylistarraylistarray");
    }

    @Test
    public void test03664() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03664");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsIgnoreCase("avaj.gnalavaj.gnalavaj.gnal", "aVAJ.GNALAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA       CharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterChara");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test03665() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03665");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass2 = org.apache.commons.lang3.ClassUtils.getClass("java.lang$interface java.lang.Cloneable$interface java.io.Serializableinterface java.lang.Cloneable$interface java.io.Serializableinterface java.lang.Cl", false);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassNotFoundException; message: java.lang$interfacejava.lang.Cloneable$interfacejava.io.Serializableinterfacejava.lang.Cloneable$interfacejava.io.Serializableinterfacejava.lang.Cl");
        } catch (java.lang.ClassNotFoundException e) {
            // Expected exception.
        }
    }

    @Test
    public void test03666() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03666");
        java.lang.String str1 = org.apache.commons.lang3.ClassUtils.getShortCanonicalName("avaj");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "avaj" + "'", str1, "avaj");
    }

    @Test
    public void test03667() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03667");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.lowerCase("...       ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "...       " + "'", str1, "...       ");
    }

    @Test
    public void test03668() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03668");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.substringBetween("                          ", "             Character             ", "                                                                                          GNAL.AVAJ ");
        org.junit.Assert.assertNull(str3);
    }

    @Test
    public void test03669() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03669");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trimToNull("444       AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "444       AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA" + "'", str1, "444       AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA");
    }

    @Test
    public void test03670() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03670");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isWhitespace((java.lang.CharSequence) "$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$################################");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test03671() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03671");
        java.lang.String str1 = org.apache.commons.lang3.ClassUtils.getShortClassName("e");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "e" + "'", str1, "e");
    }

    @Test
    public void test03672() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03672");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOf("javastringnalarraylistarraylistarraylistavaj.gnalarraylistarraylistarrayli", 47);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test03673() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03673");
        int int2 = org.apache.commons.lang3.StringUtils.getLevenshteinDistance((java.lang.CharSequence) "...       .", (java.lang.CharSequence) "hi!ArrayLis");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 11 + "'", int2 == 11);
    }

    @Test
    public void test03674() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03674");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.left("CEAJ V AL NGAcLONE BLEAAAAAAAJ V AAAAAAAAAAJ V AAAAAAAAAAJ V AAAAAAAAAAJ V AAAAAAAAAAJ V AAAAAAAAAAJ V AAAAAAAAAAJ V AAAAAAAAAAJ V AAAAAAAAAAJ V AAAAAAAAAAJ V AAAAAAAAAAJ V AAAAAAAAAAJ V AAAAAAAAAAJ V AAAAAAAAAAJ V AAAAAAAAAAJ V AAAAAAAAAAJ V AAAAAAAAAAJ V AAAAAAAAAAJ V AAAAAAAAAAJ V AAAAAAAAAAJ V AAAAAAAAAAJ V AAAAAAAAAAJ V AAAAAAAAAAJ V AAAAAAAAAAJ V AAAAAAAAAAJ V AAAAAAAAAAJ V AAAAAAAAAAJ V AAAAAAAAAAJ V AAAAAAAAAAJ V AAAAAAAAAAJ V AAAAAAAAAAJ V AAAAAAAAAAJ V AAAAAAAAAAJ V AAAAAAAAAAJ V AAAAAAAAAAJ V INTERF CEAJ V AIOAsERI LIZ BLE", (int) (short) 10);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "CEAJ V AL " + "'", str2, "CEAJ V AL ");
    }

    @Test
    public void test03675() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03675");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfDifference((java.lang.CharSequence) "GNAL.AVAJLANG.JAVAGNAL.AVAJLANG.JAVAGNAL.AVAJLANG.JAVAGNAL.AVAJLANG.JAVAGNAL.AVAJLANG.JAVAGNAL.AVAJLANG.JAVAGNAL.AVAJLANG.JAVAGNAL.AVAJLANG.JAVAGNAL", (java.lang.CharSequence) "litu");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test03676() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03676");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.center("hi!ArrayLis", (int) (byte) 10, "interface java.lang.CloneableLANG.GNALJAVA.LANGAVAJ.GNALJAVA.LANGAVAJ.GNALJAVA.LANGAVAJ.GNALJAVA.LANGAVAJ.GNALJAVA.LANGAVAJ.GNALJAVA.LANGAVAJ.GNALJAVA.LANGAVAJ.GNALJAVA.LANGAVAJ.JAVAinterface java.io.Serializable");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!ArrayLis" + "'", str3, "hi!ArrayLis");
    }

    @Test
    public void test03677() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03677");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOfIgnoreCase("AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA       ", "...");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test03678() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03678");
        int int3 = org.apache.commons.lang3.StringUtils.indexOf("Javaaaaaaaaaava.langava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.lang", "classJAVA.LANGaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaULANG", 153);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test03679() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03679");
        java.util.Locale locale1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.apache.commons.lang3.StringUtils.upperCase("string.nal.avaj ecafretni", locale1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test03680() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03680");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringAfter("44444444444444444.444444444444444444...                                 44444444444444444.444444444444444444...                                 44444$         ", "hi!ArrayListArrayListArrayListavaj....1AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA...1AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA...1AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA...1AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA...1AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA...1AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA...1AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA...1AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA...1AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA...1AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test03681() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03681");
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.split("                                                                                                    ", "hi!", (int) (byte) -1);
        int int5 = org.apache.commons.lang3.StringUtils.lastIndexOfAny("Arr... aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa... aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa... aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa... aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa... aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa... aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa... aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa... aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa... aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa... aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaylist", strArray4);
        java.lang.String str6 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray4);
        int int7 = org.apache.commons.lang3.StringUtils.indexOfDifference((java.lang.CharSequence[]) strArray4);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "                                                                                                    " + "'", str6, "                                                                                                    ");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
    }

    @Test
    public void test03682() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03682");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "vaj.gnaljava.langavaj.gnaljava.langavaj.gnaljava.langavaj.gnaljava.langavaj.gnaljava.langavaj.gnaljava.lang", "yList");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test03683() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03683");
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.overlay("java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........javainterface java.io.Serializable", "AVAJ.GNAL", 36, 0);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "AVAJ.GNAL......java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........javainterface java.io.Serializable" + "'", str4, "AVAJ.GNAL......java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........javainterface java.io.Serializable");
    }

    @Test
    public void test03684() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03684");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBefore("nterface java.lang.Cloneable.......java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........javainterface java.io.Serializable", "gna");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "nterface java.lang.Cloneable.......java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........javainterface java.io.Serializable" + "'", str2, "nterface java.lang.Cloneable.......java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........javainterface java.io.Serializable");
    }

    @Test
    public void test03685() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03685");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.uncapitalize((java.lang.CharSequence) "Arr... aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa... aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa... aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa... aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa... aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa... aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa... aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa... aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa... aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa... aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaylist");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "arr... aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa... aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa... aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa... aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa... aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa... aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa... aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa... aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa... aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa... aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaylist" + "'", str1, "arr... aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa... aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa... aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa... aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa... aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa... aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa... aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa... aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa... aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa... aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaylist");
    }

    @Test
    public void test03686() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03686");
        java.lang.String str1 = org.apache.commons.lang3.ClassUtils.getPackageCanonicalName("                                                                       JAVAsTRIN                                                                        ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
    }

    @Test
    public void test03687() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03687");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.chomp("avalitu.", "hi!ArrayLis");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "avalitu." + "'", str2, "avalitu.");
    }

    @Test
    public void test03688() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03688");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphanumericSpace((java.lang.CharSequence) "AAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAja                                              AAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAring");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test03689() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03689");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.leftPad("INTERFACE JAVA.LANG.cLONEABLEsTRINGINTERFACE JAVA.IO.sERIALIZABLE", 2, "...       .");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "INTERFACE JAVA.LANG.cLONEABLEsTRINGINTERFACE JAVA.IO.sERIALIZABLE" + "'", str3, "INTERFACE JAVA.LANG.cLONEABLEsTRINGINTERFACE JAVA.IO.sERIALIZABLE");
    }

    @Test
    public void test03690() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03690");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.center("String", 669, "AtsiLytcejbO.gnal.avaj ssalcrrAtsiLytcejbO.gnal.avaj ssalcrrAva.langGNAL..langjava.langAGNAL.AVAJ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "AtsiLytcejbO.gnal.avaj ssalcrrAtsiLytcejbO.gnal.avaj ssalcrrAva.langGNAL..langjava.langAGNAL.AVAJAtsiLytcejbO.gnal.avaj ssalcrrAtsiLytcejbO.gnal.avaj ssalcrrAva.langGNAL..langjava.langAGNAL.AVAJAtsiLytcejbO.gnal.avaj ssalcrrAtsiLytcejbO.gnal.avaj ssalcrrAva.langGNAL..langjava.langAGNAL.AVAJAtsiLytcejbO.gnal.avaj ssalcrrAtsiLytcejStringAtsiLytcejbO.gnal.avaj ssalcrrAtsiLytcejbO.gnal.avaj ssalcrrAva.langGNAL..langjava.langAGNAL.AVAJAtsiLytcejbO.gnal.avaj ssalcrrAtsiLytcejbO.gnal.avaj ssalcrrAva.langGNAL..langjava.langAGNAL.AVAJAtsiLytcejbO.gnal.avaj ssalcrrAtsiLytcejbO.gnal.avaj ssalcrrAva.langGNAL..langjava.langAGNAL.AVAJAtsiLytcejbO.gnal.avaj ssalcrrAtsiLytcejb" + "'", str3, "AtsiLytcejbO.gnal.avaj ssalcrrAtsiLytcejbO.gnal.avaj ssalcrrAva.langGNAL..langjava.langAGNAL.AVAJAtsiLytcejbO.gnal.avaj ssalcrrAtsiLytcejbO.gnal.avaj ssalcrrAva.langGNAL..langjava.langAGNAL.AVAJAtsiLytcejbO.gnal.avaj ssalcrrAtsiLytcejbO.gnal.avaj ssalcrrAva.langGNAL..langjava.langAGNAL.AVAJAtsiLytcejbO.gnal.avaj ssalcrrAtsiLytcejStringAtsiLytcejbO.gnal.avaj ssalcrrAtsiLytcejbO.gnal.avaj ssalcrrAva.langGNAL..langjava.langAGNAL.AVAJAtsiLytcejbO.gnal.avaj ssalcrrAtsiLytcejbO.gnal.avaj ssalcrrAva.langGNAL..langjava.langAGNAL.AVAJAtsiLytcejbO.gnal.avaj ssalcrrAtsiLytcejbO.gnal.avaj ssalcrrAva.langGNAL..langjava.langAGNAL.AVAJAtsiLytcejbO.gnal.avaj ssalcrrAtsiLytcejb");
    }

    @Test
    public void test03691() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03691");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.reverse("$       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $" + "'", str1, "       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $");
    }

    @Test
    public void test03692() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03692");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.center("L.ArrayList", 11, '4');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "L.ArrayList" + "'", str3, "L.ArrayList");
    }

    @Test
    public void test03693() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03693");
        int int2 = org.apache.commons.lang3.StringUtils.indexOf("AA...", 22);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test03694() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03694");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.split("string.nal.avaj ecafretni", '4');
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test03695() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03695");
        java.lang.ClassLoader classLoader0 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass2 = org.apache.commons.lang3.ClassUtils.getClass(classLoader0, "String[]String[]String[]String[]String[]String[]String[]String[]String[]String[]");
            org.junit.Assert.fail("Expected exception of type java.lang.ClassNotFoundException; message: [LString[]String[]String[]String[]String[]String[]String[]String[]String[]String;");
        } catch (java.lang.ClassNotFoundException e) {
            // Expected exception.
        }
    }

    @Test
    public void test03696() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03696");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.leftPad("etyB", (int) (short) 1, "interface java.lang.CloneableStringinterface java.io");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "etyB" + "'", str3, "etyB");
    }

    @Test
    public void test03697() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03697");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.rightPad("...VA.LANGAVAJ.GNALJAVA.LANGAVAJ.GNALJAVA.LANGAVAJ.GNALJAVA.LANGAVAJ.GNALJAVA.LANGAVAJ.GNALJAVA.LANG", 545, "gnal");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "...VA.LANGAVAJ.GNALJAVA.LANGAVAJ.GNALJAVA.LANGAVAJ.GNALJAVA.LANGAVAJ.GNALJAVA.LANGAVAJ.GNALJAVA.LANGgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalg" + "'", str3, "...VA.LANGAVAJ.GNALJAVA.LANGAVAJ.GNALJAVA.LANGAVAJ.GNALJAVA.LANGAVAJ.GNALJAVA.LANGAVAJ.GNALJAVA.LANGgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalg");
    }

    @Test
    public void test03698() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03698");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isWhitespace((java.lang.CharSequence) "...       aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test03699() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03699");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.deleteWhitespace("ArryList");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "ArryList" + "'", str1, "ArryList");
    }

    @Test
    public void test03700() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03700");
        java.util.Locale locale1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.apache.commons.lang3.StringUtils.upperCase("                                   ", locale1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test03701() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03701");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeEndIgnoreCase("java.", "....................................................................                       javaulang");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "java." + "'", str2, "java.");
    }

    @Test
    public void test03702() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03702");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsIgnoreCase("etyBetyBetyBetyBetyBetyBetyBetyBetyBetyBetyBetyBetyBetyBetyBetyBetyBetyBetyBetyBetyBetyBetyB", "                      ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test03703() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03703");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlpha((java.lang.CharSequence) "Javaaaaaaaaaava.langava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.lang$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test03704() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03704");
        java.lang.CharSequence charSequence0 = null;
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsNone(charSequence0, "A..ayL A");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test03705() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03705");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOfIgnoreCase("hi!ArrayListArrayListArrayListavaj....1AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA...1AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA...1AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA...1AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA...1AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA...1AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA...1AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA...1AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA...1AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAJava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.lang", "$         ");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test03706() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03706");
        java.lang.CharSequence charSequence2 = org.apache.commons.lang3.StringUtils.defaultIfBlank((java.lang.CharSequence) "irfCo.irfioSriiz", (java.lang.CharSequence) ".LANG");
        org.junit.Assert.assertEquals("'" + charSequence2 + "' != '" + "irfCo.irfioSriiz" + "'", charSequence2, "irfCo.irfioSriiz");
    }

    @Test
    public void test03707() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03707");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("class java.lang.Object", ".....hi!ArrayListArrayListArrayListavaj.gnalArrayListArrayListArrayListavaj.gnalArrayListArrayListArrayLi.                       javaulang", 0);
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void test03708() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03708");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.center("String[]", (int) (short) 1, 'a');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "String[]" + "'", str3, "String[]");
    }

    @Test
    public void test03709() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03709");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.contains("saylavv", (int) '#');
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test03710() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03710");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.remove("AVAJ.GNAL......java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........javainterface java.io.Serializable", '.');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "AVAJGNALjavajavajavajavajavajavajavajavajavajavajavajavajavajavajavajavajavajavajavajavajavajavajavajavajavajavajavajavajavajavajavajavainterface javaioSerializable" + "'", str2, "AVAJGNALjavajavajavajavajavajavajavajavajavajavajavajavajavajavajavajavajavajavajavajavajavajavajavajavajavajavajavajavajavajavajavajavainterface javaioSerializable");
    }

    @Test
    public void test03711() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03711");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOf("java.langjava.langjava.langjava.langjava.langjava.la", "java.langjava.langjava.langjava.langjava.langjava.la", (int) '$');
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test03712() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03712");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.rightPad("classjavalangClassJAVAULANGJAVAULANGJAVAULANGJAVAULANGJAVAULANGJAVAULANGJAVAULANGJAVAULANGJAVAULANGJAVAULANGJAVAULANGJAVAULANGJAVAULANGJAVAULANGJAVAULANGJAVAULANGJAVAULANGJAVAULANGJAVAULANGJAVAULANG", 669, '$');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "classjavalangClassJAVAULANGJAVAULANGJAVAULANGJAVAULANGJAVAULANGJAVAULANGJAVAULANGJAVAULANGJAVAULANGJAVAULANGJAVAULANGJAVAULANGJAVAULANGJAVAULANGJAVAULANGJAVAULANGJAVAULANGJAVAULANGJAVAULANGJAVAULANG$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$" + "'", str3, "classjavalangClassJAVAULANGJAVAULANGJAVAULANGJAVAULANGJAVAULANGJAVAULANGJAVAULANGJAVAULANGJAVAULANGJAVAULANGJAVAULANGJAVAULANGJAVAULANGJAVAULANGJAVAULANGJAVAULANGJAVAULANGJAVAULANGJAVAULANGJAVAULANG$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$");
    }

    @Test
    public void test03713() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03713");
        int int2 = org.apache.commons.lang3.StringUtils.indexOf("NTERFACEJAVA.LANG.cLONEABLE.......J", 929);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test03714() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03714");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.capitalize((java.lang.CharSequence) "JAVA.LANG");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "JAVA.LANG" + "'", str1, "JAVA.LANG");
    }

    @Test
    public void test03715() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03715");
        int int3 = org.apache.commons.lang3.StringUtils.lastOrdinalIndexOf("JAVA.LANGAVAJ.GNALJAVA.LANGAVAJ.GNALJAVA.LANGAVAJ.GNALJAVA.LANGAVAJ.GNALJAVA.LANGAVAJ.GNALJAVA.LANGAVAJ.GNALJAVA.LANGAVAJ.GNALJAVA.LANGAVAJ.GNALJAVA.LANG", "GNAL.AVAJGNAL..langGNAL.AVAJGNAL.", (int) (byte) 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test03716() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03716");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOf("", "4444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444aaaaaaaaaa", (int) '4');
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test03717() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03717");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.upperCase("java.litu.avajlitu.avajjava.litu.avajlitu.avajjava.litu.avajlitu.avajjava.litu.avajlitu.avajjava.litu.avajlitu.avajjava.litu.avajlitu.avajjava.litu.avajlitu.avajjava.litu.avajlitu.avajjava.litu.avajlitu.avajjava.litu.avajlitu.avajjava.litu.avajlitu.avajjava.litu.avajlitu.avajjava.litu.avajlitu.avajjava.litu.avajlitu.avajjava.litu.avajlitu.avajjava.litu.avajlitu.avajjava.litu.avajlitu.avajjava.litu.avajlitu.avajjava.litu.avajlitu.avajjava.litu.avajlitu.avajjava.litu.avajlitu.avajjava.litu.avajlitu.avajjava.litu.avajlitu.avajjava.litu.avajlitu.avajjava.litu.avajlitu.avajjava.litu.avajlitu.avajjava.litu.avajlitu.avajjava.litu.avajlitu.avajjava.litu.avajlitu.avajjava.litu.avajlitu.avajjava.litu.avajlitu.avajjava.litu.avajlitu.avajjava.litu.avajlitu.avaj");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "JAVA.LITU.AVAJLITU.AVAJJAVA.LITU.AVAJLITU.AVAJJAVA.LITU.AVAJLITU.AVAJJAVA.LITU.AVAJLITU.AVAJJAVA.LITU.AVAJLITU.AVAJJAVA.LITU.AVAJLITU.AVAJJAVA.LITU.AVAJLITU.AVAJJAVA.LITU.AVAJLITU.AVAJJAVA.LITU.AVAJLITU.AVAJJAVA.LITU.AVAJLITU.AVAJJAVA.LITU.AVAJLITU.AVAJJAVA.LITU.AVAJLITU.AVAJJAVA.LITU.AVAJLITU.AVAJJAVA.LITU.AVAJLITU.AVAJJAVA.LITU.AVAJLITU.AVAJJAVA.LITU.AVAJLITU.AVAJJAVA.LITU.AVAJLITU.AVAJJAVA.LITU.AVAJLITU.AVAJJAVA.LITU.AVAJLITU.AVAJJAVA.LITU.AVAJLITU.AVAJJAVA.LITU.AVAJLITU.AVAJJAVA.LITU.AVAJLITU.AVAJJAVA.LITU.AVAJLITU.AVAJJAVA.LITU.AVAJLITU.AVAJJAVA.LITU.AVAJLITU.AVAJJAVA.LITU.AVAJLITU.AVAJJAVA.LITU.AVAJLITU.AVAJJAVA.LITU.AVAJLITU.AVAJJAVA.LITU.AVAJLITU.AVAJJAVA.LITU.AVAJLITU.AVAJJAVA.LITU.AVAJLITU.AVAJJAVA.LITU.AVAJLITU.AVAJJAVA.LITU.AVAJLITU.AVAJ" + "'", str1, "JAVA.LITU.AVAJLITU.AVAJJAVA.LITU.AVAJLITU.AVAJJAVA.LITU.AVAJLITU.AVAJJAVA.LITU.AVAJLITU.AVAJJAVA.LITU.AVAJLITU.AVAJJAVA.LITU.AVAJLITU.AVAJJAVA.LITU.AVAJLITU.AVAJJAVA.LITU.AVAJLITU.AVAJJAVA.LITU.AVAJLITU.AVAJJAVA.LITU.AVAJLITU.AVAJJAVA.LITU.AVAJLITU.AVAJJAVA.LITU.AVAJLITU.AVAJJAVA.LITU.AVAJLITU.AVAJJAVA.LITU.AVAJLITU.AVAJJAVA.LITU.AVAJLITU.AVAJJAVA.LITU.AVAJLITU.AVAJJAVA.LITU.AVAJLITU.AVAJJAVA.LITU.AVAJLITU.AVAJJAVA.LITU.AVAJLITU.AVAJJAVA.LITU.AVAJLITU.AVAJJAVA.LITU.AVAJLITU.AVAJJAVA.LITU.AVAJLITU.AVAJJAVA.LITU.AVAJLITU.AVAJJAVA.LITU.AVAJLITU.AVAJJAVA.LITU.AVAJLITU.AVAJJAVA.LITU.AVAJLITU.AVAJJAVA.LITU.AVAJLITU.AVAJJAVA.LITU.AVAJLITU.AVAJJAVA.LITU.AVAJLITU.AVAJJAVA.LITU.AVAJLITU.AVAJJAVA.LITU.AVAJLITU.AVAJJAVA.LITU.AVAJLITU.AVAJJAVA.LITU.AVAJLITU.AVAJ");
    }

    @Test
    public void test03718() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03718");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNotBlank((java.lang.CharSequence) "                                           ...");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test03719() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03719");
        java.lang.ClassLoader classLoader0 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass2 = org.apache.commons.lang3.ClassUtils.getClass(classLoader0, "saylavv");
            org.junit.Assert.fail("Expected exception of type java.lang.ClassNotFoundException; message: saylavv");
        } catch (java.lang.ClassNotFoundException e) {
            // Expected exception.
        }
    }

    @Test
    public void test03720() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03720");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.leftPad("", 90, "                       javaulangrraylist");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "                       javaulangrraylist                       javaulangrraylist          " + "'", str3, "                       javaulangrraylist                       javaulangrraylist          ");
    }

    @Test
    public void test03721() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03721");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfIgnoreCase("interface java.lang.CloneableStringinterface java.io", "$$$$$$$$$$$$$$$$$$$$$$$$$$$$$...");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test03722() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03722");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.strip("AAAAAAAAAAAAAAAAAAAgnaluavajAAAAAAAAAAAAAAAAAAA", "...    $         $         $         $         $         $         $         $         $         $         $         $         $         $         $ ...");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "AAAAAAAAAAAAAAAAAAAgnaluavajAAAAAAAAAAAAAAAAAAA" + "'", str2, "AAAAAAAAAAAAAAAAAAAgnaluavajAAAAAAAAAAAAAAAAAAA");
    }

    @Test
    public void test03723() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03723");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isWhitespace((java.lang.CharSequence) "1java");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test03724() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03724");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444litu.avajlitu.avaj");
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test03725() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03725");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass1 = org.apache.commons.lang3.ClassUtils.getClass("javalitu.");
            org.junit.Assert.fail("Expected exception of type java.lang.ClassNotFoundException; message: javalitu.");
        } catch (java.lang.ClassNotFoundException e) {
            // Expected exception.
        }
    }

    @Test
    public void test03726() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03726");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.center("AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA", 47, " AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA" + "'", str3, "AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA");
    }

    @Test
    public void test03727() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03727");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass2 = org.apache.commons.lang3.ClassUtils.getClass("4444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444..........", true);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassNotFoundException; message: 4444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444//////////");
        } catch (java.lang.ClassNotFoundException e) {
            // Expected exception.
        }
    }

    @Test
    public void test03728() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03728");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.reverse("java..........java..........java...");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "...avaj..........avaj..........avaj" + "'", str1, "...avaj..........avaj..........avaj");
    }

    @Test
    public void test03729() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03729");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBeforeLast("GNAL.AVAJLANG.JAVAGNAL.AVAJLANG.JAVAGNAL.AVAJLANG.JAVAGNAL.AVAJLANG.JAVAGNAL.AVAJLANG.JAVAGNAL.AVAJLANG.JAVAGNAL.AVAJLANG.JAVAGNAL.AVAJLANG.JAVAGNAL.AVAJ", "                                              ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "GNAL.AVAJLANG.JAVAGNAL.AVAJLANG.JAVAGNAL.AVAJLANG.JAVAGNAL.AVAJLANG.JAVAGNAL.AVAJLANG.JAVAGNAL.AVAJLANG.JAVAGNAL.AVAJLANG.JAVAGNAL.AVAJLANG.JAVAGNAL.AVAJ" + "'", str2, "GNAL.AVAJLANG.JAVAGNAL.AVAJLANG.JAVAGNAL.AVAJLANG.JAVAGNAL.AVAJLANG.JAVAGNAL.AVAJLANG.JAVAGNAL.AVAJLANG.JAVAGNAL.AVAJLANG.JAVAGNAL.AVAJLANG.JAVAGNAL.AVAJ");
    }

    @Test
    public void test03730() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03730");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.center("avalitu.", (int) (byte) -1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "avalitu." + "'", str2, "avalitu.");
    }

    @Test
    public void test03731() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03731");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAllLowerCase((java.lang.CharSequence) "JAVA.LANG                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                    ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test03732() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03732");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringAfter("", "4444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444aaaaaaaaaa");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test03733() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03733");
        char[] charArray12 = new char[] { ' ', ' ', '#', 'a', '4', 'a' };
        int int13 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "", charArray12);
        boolean boolean14 = org.apache.commons.lang3.StringUtils.containsAny("$", charArray12);
        int int15 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "", charArray12);
        boolean boolean16 = org.apache.commons.lang3.StringUtils.containsAny("$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$", charArray12);
        boolean boolean17 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "Integer", charArray12);
        int int18 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "                            rrayList", charArray12);
        org.junit.Assert.assertNotNull(charArray12);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray12), "  #a4a");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray12), "  #a4a");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray12), "[ ,  , #, a, 4, a]");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 28 + "'", int18 == 28);
    }

    @Test
    public void test03734() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03734");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.center("", 34, "-1java.utilString[]");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "-1java.utilString-1java.utilString" + "'", str3, "-1java.utilString-1java.utilString");
    }

    @Test
    public void test03735() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03735");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "...       AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA", "javastringnalarraylistarraylistarraylistavaj");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test03736() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03736");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.split("                                              ", '#');
        java.lang.String str4 = org.apache.commons.lang3.ClassUtils.getShortCanonicalName((java.lang.Object) '#', "yList");
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Character" + "'", str4, "Character");
    }

    @Test
    public void test03737() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03737");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass2 = org.apache.commons.lang3.ClassUtils.getClass("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa      ", true);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassNotFoundException; message: aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        } catch (java.lang.ClassNotFoundException e) {
            // Expected exception.
        }
    }

    @Test
    public void test03738() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03738");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOfIgnoreCase("CLASS JAVA.LANG.oBJECT", "$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$rrayList$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test03739() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03739");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.contains("Class[]", 7);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test03740() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03740");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOf("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaagn", 943, 2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test03741() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03741");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripToEmpty("LANG.GNALJAVA.LANGAVAJ.GNALJAVA.LANGAVAJ.GNALJAVA.LANGAVAJ.GNALJAVA.LANGAVAJ.GNALJAVA.LANGAVAJ.GNALJAVA.LANGAVAJ.GNALJAVA.LANGAVAJ.GNALJAVA.LANGAVAJ.JAVA");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "LANG.GNALJAVA.LANGAVAJ.GNALJAVA.LANGAVAJ.GNALJAVA.LANGAVAJ.GNALJAVA.LANGAVAJ.GNALJAVA.LANGAVAJ.GNALJAVA.LANGAVAJ.GNALJAVA.LANGAVAJ.GNALJAVA.LANGAVAJ.JAVA" + "'", str1, "LANG.GNALJAVA.LANGAVAJ.GNALJAVA.LANGAVAJ.GNALJAVA.LANGAVAJ.GNALJAVA.LANGAVAJ.GNALJAVA.LANGAVAJ.GNALJAVA.LANGAVAJ.GNALJAVA.LANGAVAJ.GNALJAVA.LANGAVAJ.JAVA");
    }

    @Test
    public void test03742() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03742");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.abbreviate("java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java.........", 89);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "java..........java..........java..........java..........java..........java..........ja..." + "'", str2, "java..........java..........java..........java..........java..........java..........ja...");
    }

    @Test
    public void test03743() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03743");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.rightPad("...", 545, "                                            ..");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "...                                            ..                                            ..                                            ..                                            ..                                            ..                                            ..                                            ..                                            ..                                            ..                                            ..                                            ..                                    " + "'", str3, "...                                            ..                                            ..                                            ..                                            ..                                            ..                                            ..                                            ..                                            ..                                            ..                                            ..                                            ..                                    ");
    }

    @Test
    public void test03744() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03744");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.center("...aaaaaaaaaaaaaaaaaaaaaaaaaa...", 0, '4');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "...aaaaaaaaaaaaaaaaaaaaaaaaaa..." + "'", str3, "...aaaaaaaaaaaaaaaaaaaaaaaaaa...");
    }

    @Test
    public void test03745() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03745");
        int int2 = org.apache.commons.lang3.StringUtils.indexOf("String[]String[]String[]String[]String[]String[]String[]String[]String[]String[]String[]String[]String[]String[]String[]String[]String[]String[]String[]String[]String[]String[]String[]String[]String[]String[]String[]String[]String[]String[]String[]String[]String[]String[]String[]String[]String[]String[]String[]String[]String[]String[]String[]String[]String[]String[]String[]String[]String[]String[]String[]String[]String[]String[]String[]String[]String[]String[]String[]String[]String[]String[]String[]String[]String[]String[]String[]", 893);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test03746() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03746");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNumeric((java.lang.CharSequence) "JAVAULANG");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test03747() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03747");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass2 = org.apache.commons.lang3.ClassUtils.getClass("hi!ArrayListArrayListArrayListavaj....1AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA...1AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA...1AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA...1AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA...1AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA...1AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA...1AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA...1AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA...1AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA...1AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA", false);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassNotFoundException; message: hi!ArrayListArrayListArrayListavaj////1AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA///1AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA///1AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA///1AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA///1AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA///1AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA///1AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA///1AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA///1AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA///1AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA");
        } catch (java.lang.ClassNotFoundException e) {
            // Expected exception.
        }
    }

    @Test
    public void test03748() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03748");
        java.lang.CharSequence charSequence2 = org.apache.commons.lang3.StringUtils.defaultIfEmpty((java.lang.CharSequence) "gnal.avajgnal..LANGgnal.avajgnal", (java.lang.CharSequence) "irfCo$irfioSriizaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertEquals("'" + charSequence2 + "' != '" + "gnal.avajgnal..LANGgnal.avajgnal" + "'", charSequence2, "gnal.avajgnal..LANGgnal.avajgnal");
    }

    @Test
    public void test03749() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03749");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfIgnoreCase("", "etyBetyBetyBetyBetyBetyBetyBetyBetyBetyBetyBetyBetyBetyBetyBetyBetyBetyBetyBetyBetyBetyBetyB");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test03750() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03750");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.chomp("iNTERFACE JAVA.LANG.cLONEABLE.......JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVAINTERFACE JAVA.IO.sERIALIZABLE");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "iNTERFACE JAVA.LANG.cLONEABLE.......JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVAINTERFACE JAVA.IO.sERIALIZABLE" + "'", str1, "iNTERFACE JAVA.LANG.cLONEABLE.......JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVAINTERFACE JAVA.IO.sERIALIZABLE");
    }

    @Test
    public void test03751() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03751");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.reverse("gna");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "ang" + "'", str1, "ang");
    }

    @Test
    public void test03752() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03752");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.contains("ArryList", 22);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test03753() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03753");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOf("AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA... AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA... AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA... AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA... AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA... AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA... AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA... AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA... AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA... ...", 153);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test03754() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03754");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBeforeLast("4444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444aaaaaaaaaa", "hi!ArrayListArrayListArrayListavaj....1AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA...1AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA...1AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA...1AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA...1AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA...1AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA...1AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA...1AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA...1AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAJava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.lang");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "4444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444aaaaaaaaaa" + "'", str2, "4444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444aaaaaaaaaa");
    }

    @Test
    public void test03755() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03755");
        java.lang.CharSequence charSequence2 = org.apache.commons.lang3.StringUtils.defaultIfBlank((java.lang.CharSequence) "JAVA.LANGaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", (java.lang.CharSequence) "AAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAA");
        org.junit.Assert.assertEquals("'" + charSequence2 + "' != '" + "JAVA.LANGaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa" + "'", charSequence2, "JAVA.LANGaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
    }

    @Test
    public void test03756() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03756");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.leftPad("NTERFACEJAVA.LANG.cLONEABLE.......JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVAINTERFACEJAVA.IO.sERIALIZABLE", 99);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "NTERFACEJAVA.LANG.cLONEABLE.......JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVAINTERFACEJAVA.IO.sERIALIZABLE" + "'", str2, "NTERFACEJAVA.LANG.cLONEABLE.......JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVAINTERFACEJAVA.IO.sERIALIZABLE");
    }

    @Test
    public void test03757() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03757");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.center("StringStringStringStringStringStringStringStringStringString", (int) (byte) -1, "AAAA                       JAVAULANGvvayLasa");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "StringStringStringStringStringStringStringStringStringString" + "'", str3, "StringStringStringStringStringStringStringStringStringString");
    }

    @Test
    public void test03758() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03758");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.contains("BYTE", (int) '#');
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test03759() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03759");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNotBlank((java.lang.CharSequence) "$         $         $         $         $         $         $         $         $         $         $         $         $         $         $         $         $         $         $         $         $         $         $         $         $         $         $         $         $         $         $         $         $         $         $         $         ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test03760() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03760");
        int int2 = org.apache.commons.lang3.StringUtils.indexOf("##########################################################################Byte###########################################################################", "");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test03761() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03761");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.upperCase("INTEGE");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "INTEGE" + "'", str1, "INTEGE");
    }

    @Test
    public void test03762() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03762");
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("AVAJ.GNAL", "class java.lang.String", 940);
        int int5 = org.apache.commons.lang3.StringUtils.indexOfAny("######################                                                                                                                                  ", strArray4);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
    }

    @Test
    public void test03763() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03763");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripAccents((java.lang.CharSequence) "JAVA.LANGAgnal.avajgnal..LANGgnal.av");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "JAVA.LANGAgnal.avajgnal..LANGgnal.av" + "'", str1, "JAVA.LANGAgnal.avajgnal..LANGgnal.av");
    }

    @Test
    public void test03764() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03764");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringAfterLast("Class[]", "arr... aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa... aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa... aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa... aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa... aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa... aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa... aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa... aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa... aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa... aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaylist");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test03765() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03765");
        int int3 = org.apache.commons.lang3.StringUtils.indexOf("                       JAVAULANG", "...       ....       .", 18);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test03766() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03766");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.leftPad("litu.avajlitu.avaj", 22, "Arra");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Arralitu.avajlitu.avaj" + "'", str3, "Arralitu.avajlitu.avaj");
    }

    @Test
    public void test03767() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03767");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.swapCase("ArrayListArrayListArrayListavajGNAL.AVAJLANG.JAVAGNAL.AVAJLANG.JAVAGNAL.AVAJLANG.JAVAGNAL.AVAJLANG.JAVAGNAL.AVAJLANG.JAVAGNAL.AVAJLANG.JAVAGNAL.AVAJLANG.JAVAGNAL.AVAJLANG.JAVAGNAL.AVAJgnal");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "aRRAYlISTaRRAYlISTaRRAYlISTAVAJgnal.avajlang.javagnal.avajlang.javagnal.avajlang.javagnal.avajlang.javagnal.avajlang.javagnal.avajlang.javagnal.avajlang.javagnal.avajlang.javagnal.avajGNAL" + "'", str1, "aRRAYlISTaRRAYlISTaRRAYlISTAVAJgnal.avajlang.javagnal.avajlang.javagnal.avajlang.javagnal.avajlang.javagnal.avajlang.javagnal.avajlang.javagnal.avajlang.javagnal.avajlang.javagnal.avajGNAL");
    }

    @Test
    public void test03768() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03768");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.leftPad("javajavajavajavajavajavajavajavajavajavajavajavajavajavajavajavajavajavajavajavajavajavajavajavajavajavajavajavajavajavajavajavajavajava", 43, "A..ayL A.");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "javajavajavajavajavajavajavajavajavajavajavajavajavajavajavajavajavajavajavajavajavajavajavajavajavajavajavajavajavajavajavajavajavajava" + "'", str3, "javajavajavajavajavajavajavajavajavajavajavajavajavajavajavajavajavajavajavajavajavajavajavajavajavajavajavajavajavajavajavajavajavajava");
    }

    @Test
    public void test03769() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03769");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeEndIgnoreCase("hi!ArrayListArrayListArrayListavaj.gnalArrayListArrayListArrayListavaj", "java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!ArrayListArrayListArrayListavaj.gnalArrayListArrayListArrayListavaj" + "'", str2, "hi!ArrayListArrayListArrayListavaj.gnalArrayListArrayListArrayListavaj");
    }

    @Test
    public void test03770() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03770");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.left("  ", 8);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "  " + "'", str2, "  ");
    }

    @Test
    public void test03771() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03771");
        int int3 = org.apache.commons.lang3.StringUtils.indexOf("AAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAring", 43, 99);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test03772() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03772");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.mid("...    $         $         $         $         $         $         $         $         $         $         $         $         $         $         $ ...", (int) '#', 152);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "  $         $         $         $         $         $         $         $         $         $         $         $ ..." + "'", str3, "  $         $         $         $         $         $         $         $         $         $         $         $ ...");
    }

    @Test
    public void test03773() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03773");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.defaultString("$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$################################", "litulitulitulitulitul####litulitulitulitulitul");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$################################" + "'", str2, "$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$################################");
    }

    @Test
    public void test03774() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03774");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isEmpty((java.lang.CharSequence) "util");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test03775() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03775");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.remove("java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........javainterface java.io", 'a');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "jv..........jv..........jv..........jv..........jv..........jv..........jv..........jv..........jv..........jv..........jv..........jv..........jv..........jv..........jv..........jv..........jv..........jv..........jv..........jv..........jv..........jv..........jv..........jv..........jv..........jv..........jv..........jv..........jv..........jv..........jv..........jv..........jv..........jv..........jvinterfce jv.io" + "'", str2, "jv..........jv..........jv..........jv..........jv..........jv..........jv..........jv..........jv..........jv..........jv..........jv..........jv..........jv..........jv..........jv..........jv..........jv..........jv..........jv..........jv..........jv..........jv..........jv..........jv..........jv..........jv..........jv..........jv..........jv..........jv..........jv..........jv..........jv..........jvinterfce jv.io");
    }

    @Test
    public void test03776() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03776");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.mid("interface java.lang.CloneableStringinterface java.io", 13, (int) '4');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "a.lang.CloneableStringinterface java.io" + "'", str3, "a.lang.CloneableStringinterface java.io");
    }

    @Test
    public void test03777() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03777");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNumeric((java.lang.CharSequence) "...                                 ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test03778() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03778");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeStartIgnoreCase("gNAL", "string.");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "gNAL" + "'", str2, "gNAL");
    }

    @Test
    public void test03779() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03779");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.substring("", 60, 33);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test03780() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03780");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.difference("gn", "         util          ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "         util          " + "'", str2, "         util          ");
    }

    @Test
    public void test03781() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03781");
        int int2 = org.apache.commons.lang3.StringUtils.indexOf("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa      ", "44444444444444444.444444444444444444");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test03782() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03782");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.defaultIfBlank("hi!ArrayLis", "...                                 ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!ArrayLis" + "'", str2, "hi!ArrayLis");
    }

    @Test
    public void test03783() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03783");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.right("java.langjava.langjava.langjava.langjava.langjava.la", 60);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "java.langjava.langjava.langjava.langjava.langjava.la" + "'", str2, "java.langjava.langjava.langjava.langjava.langjava.la");
    }

    @Test
    public void test03784() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03784");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "agnAAAAAAAAAA", "slitUgnirtS");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test03785() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03785");
        java.lang.ClassLoader classLoader0 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass3 = org.apache.commons.lang3.ClassUtils.getClass(classLoader0, "java$.$lang", true);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassNotFoundException; message: java$/$lang");
        } catch (java.lang.ClassNotFoundException e) {
            // Expected exception.
        }
    }

    @Test
    public void test03786() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03786");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAsciiPrintable((java.lang.CharSequence) "string");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test03787() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03787");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripToNull("interface java.lang.Cloneablegnal.avajgnal..LANGgnal.avajgnal.interface java.io.Serializable");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "interface java.lang.Cloneablegnal.avajgnal..LANGgnal.avajgnal.interface java.io.Serializable" + "'", str1, "interface java.lang.Cloneablegnal.avajgnal..LANGgnal.avajgnal.interface java.io.Serializable");
    }

    @Test
    public void test03788() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03788");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBefore("", "                       JAVAULANG");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test03789() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03789");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.lowerCase("                      INTEGER                       ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "                      integer                       " + "'", str1, "                      integer                       ");
    }

    @Test
    public void test03790() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03790");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.split("slitUgnirtSslitUgnirtSslitUgnirtSslitUgnirtSslitUgnirtSslitUgnirtSslitUgnirtSslitUgnirtSslitUgnirtSslitUgnirtS", "Java.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava");
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test03791() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03791");
        java.lang.String[] strArray7 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("hi!", "java.lang", (int) '.');
        int int8 = org.apache.commons.lang3.StringUtils.indexOfAny("Short", strArray7);
        boolean boolean9 = org.apache.commons.lang3.StringUtils.startsWithAny("...                                 ", strArray7);
        java.lang.String str10 = org.apache.commons.lang3.StringUtils.concatWith("...      ", (java.lang.Object[]) strArray7);
        int int11 = org.apache.commons.lang3.StringUtils.indexOfAny("NTERF CEAJ V AL NGAcLONE BLEAAAAAAAJ V AAAAAAAAAAJ V AAAAAAAAAAJ V AAAAAAAAAAJ V AAAAAAAAAAJ V AAAAAAAAAAJ V AAAAAAAAAAJ V AAAAAAAAAAJ V AAAAAAAAAAJ V AAAAAAAAAAJ V AAAAAAAAAAJ V AAAAAAAAAAJ V AAAAAAAAAAJ V AAAAAAAAAAJ V AAAAAAAAAAJ V AAAAAAAAAAJ V AAAAAAAAAAJ V AAAAAAAAAAJ V AAAAAAAAAAJ V AAAAAAAAAAJ V AAAAAAAAAAJ V AAAAAAAAAAJ V AAAAAAAAAAJ V AAAAAAAAAAJ V AAAAAAAAAAJ V AAAAAAAAAAJ V AAAAAAAAAAJ V AAAAAAAAAAJ V AAAAAAAAAAJ V AAAAAAAAAAJ V AAAAAAAAAAJ V AAAAAAAAAAJ V AAAAAAAAAAJ V AAAAAAAAAAJ V AAAAAAAAAAJ V INTERF CEAJ V AIOAsERI LIZ BLE", strArray7);
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
    }

    @Test
    public void test03792() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03792");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripAccents((java.lang.CharSequence) "SERIALIZABLE");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "SERIALIZABLE" + "'", str1, "SERIALIZABLE");
    }

    @Test
    public void test03793() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03793");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.substringsBetween("slitUgnirtSslitUgnirtSslitUgnirtSslitUgnirtSslitUgnirtSslitUgnirtSslitUgnirtSslitUgnirtSslitUgnirtSslitUgnirt", "                                            ..", "gnalArrayListArrayListArrayLi");
        org.junit.Assert.assertNull(strArray3);
    }

    @Test
    public void test03794() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03794");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "Arrclass java.lang.ObjectyList", "irfCo$irfioSriizaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test03795() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03795");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.swapCase("JAVA.UTI");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "java.uti" + "'", str1, "java.uti");
    }

    @Test
    public void test03796() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03796");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOfIgnoreCase("se...", "Arra");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test03797() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03797");
        int int3 = org.apache.commons.lang3.StringUtils.indexOf("litulitulitulitulitul####litulitulitulitulitul", (-1), 35);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test03798() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03798");
        java.lang.String str1 = org.apache.commons.lang3.ClassUtils.getShortCanonicalName("...VA.LANGAVAJ.GNALJAVA.LANGAVAJ.GNALJAVA.LANGAVAJ.GNALJAVA.LANGAVAJ.GNALJAVA.LANGAVAJ.GNALJAVA.LANGgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalg");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "LANGgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalg" + "'", str1, "LANGgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalg");
    }

    @Test
    public void test03799() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03799");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trim("AAAAAAAAAA");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "AAAAAAAAAA" + "'", str1, "AAAAAAAAAA");
    }

    @Test
    public void test03800() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03800");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.mid("AVAJ", (-1), 106);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "AVAJ" + "'", str3, "AVAJ");
    }

    @Test
    public void test03801() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03801");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.strip("elbazilaireS.oi.avaj ecafretnignirtSelbaenolC.gnal.avaj ecafretni");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "elbazilaireS.oi.avaj ecafretnignirtSelbaenolC.gnal.avaj ecafretni" + "'", str1, "elbazilaireS.oi.avaj ecafretnignirtSelbaenolC.gnal.avaj ecafretni");
    }

    @Test
    public void test03802() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03802");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOf("interface java.lang.CloneableStringinterface java.io", "gnirtS.gnal.avaj ssalc", 89);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test03803() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03803");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.right("String.", 2);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "g." + "'", str2, "g.");
    }

    @Test
    public void test03804() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03804");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.chop("...$$$$$$$$$$$$$$$...");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "...$$$$$$$$$$$$$$$.." + "'", str1, "...$$$$$$$$$$$$$$$..");
    }

    @Test
    public void test03805() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03805");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.uncapitalize((java.lang.CharSequence) "AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA... AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA... AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA... AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA... AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA... AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA... AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA... AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA... AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA... ...");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "aAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA... AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA... AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA... AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA... AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA... AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA... AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA... AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA... AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA... ..." + "'", str1, "aAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA... AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA... AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA... AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA... AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA... AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA... AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA... AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA... AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA... ...");
    }

    @Test
    public void test03806() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03806");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfIgnoreCase("4444444", "gnalArrayListArrayListArrayListavaj.gnalArrayListArrayListArrayLi");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test03807() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03807");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "javaStrinSerializableSerializableSerializableSeriali", "                                              ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test03808() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03808");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripAccents((java.lang.CharSequence) "lang");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "lang" + "'", str1, "lang");
    }

    @Test
    public void test03809() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03809");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.left("JAVA.L$ArrayList", (int) (byte) 100);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "JAVA.L$ArrayList" + "'", str2, "JAVA.L$ArrayList");
    }

    @Test
    public void test03810() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03810");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.remove("slitUgnirtSslitUgnirtSslitUgnirtSslitUgnirtSslitUgnirtSslitUgnirtSslitUgnirtSslitUgnirtSslitUgnirtSslitUgnirt", 'a');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "slitUgnirtSslitUgnirtSslitUgnirtSslitUgnirtSslitUgnirtSslitUgnirtSslitUgnirtSslitUgnirtSslitUgnirtSslitUgnirt" + "'", str2, "slitUgnirtSslitUgnirtSslitUgnirtSslitUgnirtSslitUgnirtSslitUgnirtSslitUgnirtSslitUgnirtSslitUgnirtSslitUgnirt");
    }

    @Test
    public void test03811() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03811");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.chomp("interface java.lang.CloneableStringinterface java.io");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "interface java.lang.CloneableStringinterface java.io" + "'", str1, "interface java.lang.CloneableStringinterface java.io");
    }

    @Test
    public void test03812() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03812");
        int int3 = org.apache.commons.lang3.StringUtils.lastOrdinalIndexOf("slitUgnirtSslitUgnirtSslitUgnirtSslitUgnirtSslitUgnirtSslitUgnirtSslitUgnirtSslitUgnirtSslitUgnirtSslitUgnirtS", "classjavalangClassJAVAULANGJAVAULANGJAVAULANGJAVAULANGJAVAULANGJAVAULANGJAVAULANGJAVAULANGJAVAULANGJAVAULANGJAVAULANGJAVAULANGJAVAULANGJAVAULANGJAVAULANGJAVAULANGJAVAULANGJAVAULANGJAVAULANGJAVAULANG$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$", 893);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test03813() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03813");
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.replace("javalitu", "...       AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA", "", 90);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "javalitu" + "'", str4, "javalitu");
    }

    @Test
    public void test03814() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03814");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.strip("hi!ArrayListArrayListArrayListavaj....1AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA...1AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA...1AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA...1AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA...1AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA...1AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA...1AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA...1AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA...1AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA...1AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hi!ArrayListArrayListArrayListavaj....1AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA...1AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA...1AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA...1AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA...1AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA...1AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA...1AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA...1AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA...1AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA...1AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA" + "'", str1, "hi!ArrayListArrayListArrayListavaj....1AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA...1AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA...1AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA...1AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA...1AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA...1AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA...1AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA...1AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA...1AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA...1AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA");
    }

    @Test
    public void test03815() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03815");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.leftPad("...       ....       .java.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.lang...       ....       .java.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.lang...       ....       .java.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.lang...       ....       .java.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.lang...       ....       .java.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.lang...       ....       .", 929, "gnirtS.gnal.avaj ssalc");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "gnirtS.gnal.avaj ssalcgnirtS.gnal.avaj ssalcgnirtS.gnal.avaj ssalcgnirtS.gnal.avaj ssalcgnirtS.gnal.avaj ssalcgnirtS.gnal.avaj ssalcgnirtS.gnal.avaj ssalcgnirtS.gnal.avaj ssalcgnirtS.gnal.avaj ssalcgnirtS.gnal.avaj ssalcgnirtS.gnal.avaj ssalcgnirtS.gnal.avaj ssalcgnirtS.gnal.avaj ssalcgnirtS.gnal.avaj ssalcgnirtS.gnal.avaj ssalcgnirtS.gnal.avaj ...       ....       .java.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.lang...       ....       .java.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.lang...       ....       .java.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.lang...       ....       .java.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.lang...       ....       .java.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.lang...       ....       ." + "'", str3, "gnirtS.gnal.avaj ssalcgnirtS.gnal.avaj ssalcgnirtS.gnal.avaj ssalcgnirtS.gnal.avaj ssalcgnirtS.gnal.avaj ssalcgnirtS.gnal.avaj ssalcgnirtS.gnal.avaj ssalcgnirtS.gnal.avaj ssalcgnirtS.gnal.avaj ssalcgnirtS.gnal.avaj ssalcgnirtS.gnal.avaj ssalcgnirtS.gnal.avaj ssalcgnirtS.gnal.avaj ssalcgnirtS.gnal.avaj ssalcgnirtS.gnal.avaj ssalcgnirtS.gnal.avaj ...       ....       .java.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.lang...       ....       .java.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.lang...       ....       .java.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.lang...       ....       .java.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.lang...       ....       .java.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.lang...       ....       .");
    }

    @Test
    public void test03816() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03816");
        java.util.Locale locale1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.apache.commons.lang3.StringUtils.upperCase("LANG.GNALJAVA.LANGAVAJ.GNALJAVA.LANGAVAJ.GNALJAVA.LANGAVAJ.GNALJAVA.LA", locale1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test03817() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03817");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isEmpty((java.lang.CharSequence) ".LANG");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test03818() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03818");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOf(".. u", "       $                                                                                            ");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test03819() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03819");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("interface java.lang.CloneableStringinterface java.io.Serializable", "Serializabl", 4);
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray3, "AVAJGNALjavajavajavajavajavajavajavajavajavajavajavajavajavajavajavajavajavajavajavajavajavajavajavajavajavajavajavajavajavajavajavajavainterface javaioSerializable", 669, 22);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
    }

    @Test
    public void test03820() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03820");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.startsWithIgnoreCase("       $                                                                                            ", "$$$$$$$$$$$$$$$$$$$$$$$$$$$$$...$$$$$$$$$$$$$$$$$$$$$$$$$$$$$...$$$$$$$$$$$$$$$$$$$$$$$$$$$$$...       ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test03821() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03821");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("class java.lang.String", "                                   ");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.stripAll(strArray2);
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray2, '4', 576, 23);
        java.lang.String str11 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray2, '.', 35, 2);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
    }

    @Test
    public void test03822() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03822");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAllUpperCase((java.lang.CharSequence) "LANGaGNALJAVAaLANGAVAJaGNALJAVAaLANGAVAJaGNALJAVAaLANGAVAJaGNALJAVAaLA");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test03823() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03823");
        java.lang.ClassLoader classLoader0 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass3 = org.apache.commons.lang3.ClassUtils.getClass(classLoader0, "                                             ...                                                    ", true);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassNotFoundException; message: ///");
        } catch (java.lang.ClassNotFoundException e) {
            // Expected exception.
        }
    }

    @Test
    public void test03824() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03824");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.contains("LANG.GNALJAVA.LANGAVAJ.GNALJAVA.LANGAVAJ.GNALJAVA.LANGAVAJ.GNALJAVA.LA", 23);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test03825() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03825");
        java.lang.String str1 = org.apache.commons.lang3.ClassUtils.getPackageCanonicalName("JAVA.UTILhi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!h");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "JAVA" + "'", str1, "JAVA");
    }

    @Test
    public void test03826() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03826");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAsciiPrintable((java.lang.CharSequence) "AVAJ.GNAL......java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........javainterface java.io.Serializable");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test03827() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03827");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.endsWithIgnoreCase("......", "javaStrin");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test03828() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03828");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfIgnoreCase("][sslC", "4444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444aaaaaaaaaava");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test03829() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03829");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("HI!aRRAYlISTaRRAYlISTaRRAYlISTAVAJ.GNALaRRAYlISTaRRAYlISTaRRAYlISTAVAJ", "SERIALIZABLE", 0);
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void test03830() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03830");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass2 = org.apache.commons.lang3.ClassUtils.getClass("                      Integer                       ", false);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassNotFoundException; message: Integer");
        } catch (java.lang.ClassNotFoundException e) {
            // Expected exception.
        }
    }

    @Test
    public void test03831() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03831");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNotBlank((java.lang.CharSequence) "...                                 ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test03832() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03832");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringAfterLast("4444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444aaaaaaaaaa", "4444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "aaaaaaaaaa" + "'", str2, "aaaaaaaaaa");
    }

    @Test
    public void test03833() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03833");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.mid("            java.util             ", (int) (byte) 10, 4);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "  ja" + "'", str3, "  ja");
    }

    @Test
    public void test03834() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03834");
        int int3 = org.apache.commons.lang3.StringUtils.ordinalIndexOf("hi!", "GNIRT", 22);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test03835() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03835");
        int int3 = org.apache.commons.lang3.StringUtils.indexOf("..........................................................................................", 940, 28);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test03836() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03836");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.rightPad("ho$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$rayList$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$t", 2);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "ho$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$rayList$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$t" + "'", str2, "ho$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$rayList$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$t");
    }

    @Test
    public void test03837() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03837");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isBlank((java.lang.CharSequence) "lang.gnaljava.langavaj.gnaljava.langavaj.gnaljava.langavaj.gnaljava.la");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test03838() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03838");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceChars("Character", "44444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444             Character             ", "AVAJ.GNALAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA       CharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterChara");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "rChahacta" + "'", str3, "rChahacta");
    }

    @Test
    public void test03839() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03839");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.difference("class java.lang.Stringclass java.lang.Stringclass java.lang.Stringclass java.lang.Stringclass java.lang.Stringclass java.lang.Stringclass java.lang.Stringclass java.lang.Stringclass java.lang.Stringclass java.lang.Stringclass java.lang.Stringclass java.lang.Stringclass java.lang.Stringclass java.lang.Stringclass java.lang.Stringclass java.lang.Stringclass java.lang.Stringclass java.lang.Stringclass java.lang.Stringclass java.lang.Stringclass java.lang.Stringclass java.lang.Stringclass java.lang.Stringclass java.lang.Stringclass java.lang.Stringclass java.lang.Stringclass java.lang.Stringclass java.lang.Stringclass java.lang.Stringclass java.lang.String", "h!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ihLITU.AVAJ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "h!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ihLITU.AVAJ" + "'", str2, "h!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ihLITU.AVAJ");
    }

    @Test
    public void test03840() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03840");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphanumericSpace((java.lang.CharSequence) "javal       aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaagn");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test03841() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03841");
        char[] charArray1 = null;
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsAny(".######################################################################", charArray1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test03842() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03842");
        int int2 = org.apache.commons.lang3.StringUtils.indexOf("                                                                        String[]String[]String[]String[]String[]String[]String[]String[]String[]String[]", (int) '#');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test03843() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03843");
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("javal#.#agn", "", 6);
        java.lang.String[] strArray8 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator(". ", "                                  ", 90);
        java.lang.String str9 = org.apache.commons.lang3.StringUtils.replaceEach("arr... aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa... aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa... aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa... aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa... aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa... aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa... aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa... aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa... aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa... aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaylist", strArray4, strArray8);
        int int10 = org.apache.commons.lang3.StringUtils.indexOfDifference((java.lang.CharSequence[]) strArray4);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str14 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray4, "4444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444ssssssssss", 7, 154);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 7");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "arr... aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa... aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa... aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa... aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa... aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa... aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa... aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa... aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa... aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa... aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaylist" + "'", str9, "arr... aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa... aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa... aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa... aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa... aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa... aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa... aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa... aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa... aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa... aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaylist");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
    }

    @Test
    public void test03844() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03844");
        java.lang.String str1 = org.apache.commons.lang3.ClassUtils.getShortCanonicalName(" AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA" + "'", str1, "AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA");
    }

    @Test
    public void test03845() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03845");
        int int1 = org.apache.commons.lang3.StringUtils.length((java.lang.CharSequence) "-1java.utilString[]                                                                                 ");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 100 + "'", int1 == 100);
    }

    @Test
    public void test03846() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03846");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripToNull("JAVA.LANGA");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "JAVA.LANGA" + "'", str1, "JAVA.LANGA");
    }

    @Test
    public void test03847() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03847");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphanumericSpace((java.lang.CharSequence) ".");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test03848() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03848");
        int int3 = org.apache.commons.lang3.StringUtils.indexOfIgnoreCase("AAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAja                                              AAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAring", "java.uti", 4);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test03849() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03849");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.equals((java.lang.CharSequence) "1java", (java.lang.CharSequence) "javalitu.");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test03850() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03850");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass1 = org.apache.commons.lang3.ClassUtils.getClass("ArrayLis");
            org.junit.Assert.fail("Expected exception of type java.lang.ClassNotFoundException; message: ArrayLis");
        } catch (java.lang.ClassNotFoundException e) {
            // Expected exception.
        }
    }

    @Test
    public void test03851() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03851");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceChars("Java.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.lang", 'a', '#');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "J#v#.l#ngj#v#.l#ngj#v#.l#ngj#v#.l#ngj#v#.l#ngj#v#.l#ngj#v#.l#ngj#v#.l#ngj#v#.l#ngj#v#.l#ngj#v#.l#ngj#v#.l#ngj#v#.l#ngj#v#.l#ngj#v#.l#ngj#v#.l#ngj#v#.l#ngj#v#.l#ngj#v#.l#ngj#v#.l#ngj#v#.l#ngj#v#.l#ngj#v#.l#ngj#v#.l#ngj#v#.l#ngj#v#.l#ngj#v#.l#ngj#v#.l#ngj#v#.l#ngj#v#.l#ngj#v#.l#ngj#v#.l#ngj#v#.l#ng" + "'", str3, "J#v#.l#ngj#v#.l#ngj#v#.l#ngj#v#.l#ngj#v#.l#ngj#v#.l#ngj#v#.l#ngj#v#.l#ngj#v#.l#ngj#v#.l#ngj#v#.l#ngj#v#.l#ngj#v#.l#ngj#v#.l#ngj#v#.l#ngj#v#.l#ngj#v#.l#ngj#v#.l#ngj#v#.l#ngj#v#.l#ngj#v#.l#ngj#v#.l#ngj#v#.l#ngj#v#.l#ngj#v#.l#ngj#v#.l#ngj#v#.l#ngj#v#.l#ngj#v#.l#ngj#v#.l#ngj#v#.l#ngj#v#.l#ngj#v#.l#ng");
    }

    @Test
    public void test03852() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03852");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass2 = org.apache.commons.lang3.ClassUtils.getClass("JAVA.L$ArrayList", true);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassNotFoundException; message: JAVA.L$ArrayList");
        } catch (java.lang.ClassNotFoundException e) {
            // Expected exception.
        }
    }

    @Test
    public void test03853() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03853");
        java.lang.ClassLoader classLoader0 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass2 = org.apache.commons.lang3.ClassUtils.getClass(classLoader0, "CLASS JAVA.LANG.cLASS");
            org.junit.Assert.fail("Expected exception of type java.lang.ClassNotFoundException; message: CLASSJAVA/LANG/cLASS");
        } catch (java.lang.ClassNotFoundException e) {
            // Expected exception.
        }
    }

    @Test
    public void test03854() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03854");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.center("     A..ayL A.44444444444444444444444444      ", (int) (short) 100, ' ');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "                                A..ayL A.44444444444444444444444444                                 " + "'", str3, "                                A..ayL A.44444444444444444444444444                                 ");
    }

    @Test
    public void test03855() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03855");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.startsWithIgnoreCase("va.lang.Cl", "                                                                                          gnal.avaj ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test03856() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03856");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.startsWithIgnoreCase("$         ", "avaj.gnalnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAA");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test03857() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03857");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.lowerCase("###############################################################################################################################################################");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "###############################################################################################################################################################" + "'", str1, "###############################################################################################################################################################");
    }

    @Test
    public void test03858() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03858");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeEndIgnoreCase("                                                                                                                                                                                                                                                                  GNAL.AVAJ                                                                                                                                                                                                                                                                  ", "javaStrin");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                                                                                                                                                                                                                                                  GNAL.AVAJ                                                                                                                                                                                                                                                                  " + "'", str2, "                                                                                                                                                                                                                                                                  GNAL.AVAJ                                                                                                                                                                                                                                                                  ");
    }

    @Test
    public void test03859() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03859");
        int int3 = org.apache.commons.lang3.StringUtils.indexOf("java", "...       ....       .", 493);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test03860() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03860");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAllLowerCase((java.lang.CharSequence) "java.");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test03861() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03861");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceChars("JAVA.LANG", '4', '#');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "JAVA.LANG" + "'", str3, "JAVA.LANG");
    }

    @Test
    public void test03862() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03862");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeStartIgnoreCase("String[]String[]String[]String[]String[]String[]String[]String[]String[]String[]", "JAVA.LANGAgnal.avajgnal..LANGgnal.av");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "String[]String[]String[]String[]String[]String[]String[]String[]String[]String[]" + "'", str2, "String[]String[]String[]String[]String[]String[]String[]String[]String[]String[]");
    }

    @Test
    public void test03863() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03863");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceOnce("ArryList", "][sslC", "       aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "ArryList" + "'", str3, "ArryList");
    }

    @Test
    public void test03864() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03864");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.lowerCase("Javaaaaaaaaaava.langava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.lang$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "javaaaaaaaaaava.langava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.lang$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$" + "'", str1, "javaaaaaaaaaava.langava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.lang$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$");
    }

    @Test
    public void test03865() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03865");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.startsWith("                                                                                                    ", "$######################################################################");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test03866() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03866");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNumericSpace((java.lang.CharSequence) "...aaaaaaaaaaaaaaaaaaaaaaaaaa...");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test03867() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03867");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.stripEnd("JAVA.LANG", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa      ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "JAVA.LANG" + "'", str2, "JAVA.LANG");
    }

    @Test
    public void test03868() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03868");
        java.util.Locale locale1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.apache.commons.lang3.StringUtils.upperCase("A..ayL A", locale1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test03869() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03869");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripAccents((java.lang.CharSequence) "$         44444444444444444444444444444444444444444444444444444444444444444444444444444444");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "$         44444444444444444444444444444444444444444444444444444444444444444444444444444444" + "'", str1, "$         44444444444444444444444444444444444444444444444444444444444444444444444444444444");
    }

    @Test
    public void test03870() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03870");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("class java.lang.String");
        boolean boolean3 = org.apache.commons.lang3.StringUtils.endsWithAny("e", strArray2);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test03871() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03871");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.split("$$$$$$$$", "hi!ArrayListArrayListArrayListavajhhhh AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAhhh AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAhhh AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAhhh AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAhhh AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAhhh AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAhhh AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAhhh AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAhhh AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAhhh AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA");
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test03872() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03872");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBefore("byte", "java..........java..........java...");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "byte" + "'", str2, "byte");
    }

    @Test
    public void test03873() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03873");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.strip("javajavajavajavajavajavajavajavajavajavajavajavajavajavajavajavajavajavajavajavajavajavajavajavajavajavajavajavajavajavajavajavajavajava");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "javajavajavajavajavajavajavajavajavajavajavajavajavajavajavajavajavajavajavajavajavajavajavajavajavajavajavajavajavajavajavajavajavajava" + "'", str1, "javajavajavajavajavajavajavajavajavajavajavajavajavajavajavajavajavajavajavajavajavajavajavajavajavajavajavajavajavajavajavajavajavajava");
    }

    @Test
    public void test03874() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03874");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceChars("hi!ArrayListArrayListArrayListavaj....1AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA...1AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA...1AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA...1AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA...1AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA...1AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA...1AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA...1AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA...1AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA...1AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA", "       $", "hi!ArrayListArrayListArrayListavaj.gnalArrayListArrayListArrayListavaj");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!ArrayListArrayListArrayListavaj....1AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA...1AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA...1AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA...1AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA...1AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA...1AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA...1AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA...1AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA...1AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA...1AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA" + "'", str3, "hi!ArrayListArrayListArrayListavaj....1AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA...1AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA...1AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA...1AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA...1AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA...1AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA...1AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA...1AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA...1AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA...1AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA");
    }

    @Test
    public void test03875() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03875");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitByCharacterType("JAVA");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.concat((java.lang.Object[]) strArray1);
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.concat((java.lang.Object[]) strArray1);
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "JAVA" + "'", str2, "JAVA");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "JAVA" + "'", str3, "JAVA");
    }

    @Test
    public void test03876() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03876");
        int int2 = org.apache.commons.lang3.StringUtils.getLevenshteinDistance((java.lang.CharSequence) "A..ayL A.444444444444444444444444444", (java.lang.CharSequence) " AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAyList");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 94 + "'", int2 == 94);
    }

    @Test
    public void test03877() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03877");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphanumericSpace((java.lang.CharSequence) "444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444litu.avajlitu.avaj");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test03878() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03878");
        int int2 = org.apache.commons.lang3.StringUtils.indexOf("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaagn                                            ", "AtsiLytcejbO.gnal.avaj ssalcrrAtsiLytcejbO.gnal.avaj ssalcrrAva.langGNAL..langjava.langAGNAL.AVAJ");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test03879() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03879");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.substringsBetween("GNIRT", "JAVA.UTIL.", "avaj.gnal");
        org.junit.Assert.assertNull(strArray3);
    }

    @Test
    public void test03880() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03880");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNotEmpty((java.lang.CharSequence) "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                 ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test03881() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03881");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphanumericSpace((java.lang.CharSequence) "JAVA.LANGAgnal.avajgnal..LANGgnal.avArrclass java.lang.ObjectyListArrclass java.lang.ObjectyListA");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test03882() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03882");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceChars("AAAAAAAAAA", ' ', '$');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "AAAAAAAAAA" + "'", str3, "AAAAAAAAAA");
    }

    @Test
    public void test03883() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03883");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.abbreviate("", (int) (short) 10);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test03884() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03884");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAsciiPrintable((java.lang.CharSequence) "AAAA                       JAVAULANGvvayLasa");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test03885() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03885");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.defaultString("$ArrayLis", "JAVA.LANGAVAJ.GNALJAVA.LANGAVAJ.GNALJAVA.LANGAVAJ.GNALJAVA.LANGAVAJ.GNALJAVA.LANGAVAJ.GNALJAVA.LANGAVAJ.GNALJAVA.LANGAVAJ.GNALJAVA.LANGAVAJ.GNALJAVA.LANG");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "$ArrayLis" + "'", str2, "$ArrayLis");
    }

    @Test
    public void test03886() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03886");
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.replace("RARJAVAARRARJAVAARRARJAVAARRARJAVAARRARJAVAARRARJAVAARRARJAVAARRARJAVAARRARJAVAARRARJAVAARRARJAVAARRARJAVAARRARJAVAARRARJAVAARRARJAVAARRARJAVAARRARJAVAARRARJAVAARRARJAVAARRARJAVAARRARJAVAARRARJAVAARRARJAVAARRARJAVAARRARJAVAARRARJAVAARRARJAVAARRARJAVAARRARJAVAARRARJAVAARRARJAVAARRARJAVAARRARJAVAARRARJAVAARRARJAVAARRARJAVAARRARJAVAARRARJAVAARRARJAVAARRARJAVAARRARJAVAARRARJAVAARRARJAVAARRARJAVAARRARJAVAARRARJAVAARRARJAVAARRARJAVAARRARJAlass java.lang.String", "AAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAja                                              AAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAring", "CLASS JAVALANGCLASS                       JAVAULANG                       JAVAULANG                       JAVAULANG                       JAVAULANG                       JAVAULANG                       JAVAULANG                       JAVAULANG                       JAVAULANG                       JAVAULANG                       JAVAULANG                       JAVAULANG                       JAVAULANG                       JAVAULANG                       JAVAULANG                       JAVAULANG                       JAVAULANG                       JAVAULANG                       JAVAULANG                       JAVAULANG                       JAVAULANG        ", 153);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "RARJAVAARRARJAVAARRARJAVAARRARJAVAARRARJAVAARRARJAVAARRARJAVAARRARJAVAARRARJAVAARRARJAVAARRARJAVAARRARJAVAARRARJAVAARRARJAVAARRARJAVAARRARJAVAARRARJAVAARRARJAVAARRARJAVAARRARJAVAARRARJAVAARRARJAVAARRARJAVAARRARJAVAARRARJAVAARRARJAVAARRARJAVAARRARJAVAARRARJAVAARRARJAVAARRARJAVAARRARJAVAARRARJAVAARRARJAVAARRARJAVAARRARJAVAARRARJAVAARRARJAVAARRARJAVAARRARJAVAARRARJAVAARRARJAVAARRARJAVAARRARJAVAARRARJAVAARRARJAVAARRARJAVAARRARJAVAARRARJAlass java.lang.String" + "'", str4, "RARJAVAARRARJAVAARRARJAVAARRARJAVAARRARJAVAARRARJAVAARRARJAVAARRARJAVAARRARJAVAARRARJAVAARRARJAVAARRARJAVAARRARJAVAARRARJAVAARRARJAVAARRARJAVAARRARJAVAARRARJAVAARRARJAVAARRARJAVAARRARJAVAARRARJAVAARRARJAVAARRARJAVAARRARJAVAARRARJAVAARRARJAVAARRARJAVAARRARJAVAARRARJAVAARRARJAVAARRARJAVAARRARJAVAARRARJAVAARRARJAVAARRARJAVAARRARJAVAARRARJAVAARRARJAVAARRARJAVAARRARJAVAARRARJAVAARRARJAVAARRARJAVAARRARJAVAARRARJAVAARRARJAVAARRARJAVAARRARJAlass java.lang.String");
    }

    @Test
    public void test03887() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03887");
        java.lang.CharSequence charSequence0 = null;
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isEmpty(charSequence0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test03888() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03888");
        java.lang.CharSequence charSequence0 = null;
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsOnly(charSequence0, "AAAAAAAAAAAAAAAAAAAgnaluavajAAAAAAAAAAAAAAAAAAA");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test03889() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03889");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.reverseDelimited("-1java", '$');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "-1java" + "'", str2, "-1java");
    }

    @Test
    public void test03890() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03890");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.rightPad("gnal.avaj ", (int) (byte) 10, "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "gnal.avaj " + "'", str3, "gnal.avaj ");
    }

    @Test
    public void test03891() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03891");
        java.lang.String[] strArray1 = null;
        int int2 = org.apache.commons.lang3.StringUtils.indexOfAny("litu.avaj", strArray1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test03892() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03892");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isWhitespace((java.lang.CharSequence) "GNAL.AVAJLANG.JAVAGNAL.AVAJLANG.JAVAGNAL.AVAJLANG.JAVAGNAL.AVAJLANG.JAVAGNAL.AVAJLANG.JAVAGNAL.AVAJLANG.JAVAGNAL.AVAJLANG.JAVAGNAL.AVAJLANG.JAVAGNAL.AVAJ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test03893() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03893");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOfIgnoreCase("a.lang.CloneableStringinterface java.io", "TRING", 33);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 17 + "'", int3 == 17);
    }

    @Test
    public void test03894() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03894");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.startsWithIgnoreCase("gnal.avajgnal..LANGgnal.avajgnal", "     AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test03895() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03895");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceChars("interface#java.lang.Cloneable....................................................................#######################JAVAULANGinterface#java.io.Serializable", '$', '.');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "interface#java.lang.Cloneable....................................................................#######################JAVAULANGinterface#java.io.Serializable" + "'", str3, "interface#java.lang.Cloneable....................................................................#######################JAVAULANGinterface#java.io.Serializable");
    }

    @Test
    public void test03896() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03896");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.chomp("Sho$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$rrayList$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$t", "44444444444444444.444444444444444444");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Sho$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$rrayList$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$t" + "'", str2, "Sho$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$rrayList$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$t");
    }

    @Test
    public void test03897() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03897");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.split("LANGgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalg", "gnal.avaj ", 23);
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void test03898() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03898");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("javajavajavajavajavajavajavajavajavajavajavajavajavajavajavajavajavajavajavajavajavajavajavajavajavajavajavajavajavajavajavajavajavajava", '.');
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test03899() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03899");
        java.lang.Object obj0 = null;
        java.lang.String str2 = org.apache.commons.lang3.ClassUtils.getPackageName(obj0, "stringnalarraylistarraylistarraylistavaj.gnalarraylistarraylistarrayli");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "stringnalarraylistarraylistarraylistavaj.gnalarraylistarraylistarrayli" + "'", str2, "stringnalarraylistarraylistarraylistavaj.gnalarraylistarraylistarrayli");
    }

    @Test
    public void test03900() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03900");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.startsWith("AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA ", "$$$$$$$$$$$$$$$$$$$$$$$$$$$$$...");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test03901() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03901");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.abbreviate("gnal", 493, 28);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "gnal" + "'", str3, "gnal");
    }

    @Test
    public void test03902() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03902");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("java.lang$interface java.lang.Cloneable$interface java.io.Serializableinterface java.lang.Cloneable$interface java.io.Serializableinterface java.lang.Cl", "$$$$$$$$$$$$$$$$$$$$$$$$$$$$$...", 13);
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void test03903() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03903");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfDifference((java.lang.CharSequence) "vvayLasa", (java.lang.CharSequence) ".class javalangClass                       JAVAULANG                       JAVAULANG                       JAVAULANG                       JAVAULANG                       JAVAULANG                       JAVAULANG                       JAVAULANG                       JAVAULANG                       JAVAULANG                       JAVAULANG                       JAVAULANG                       JAVAULANG                       JAVAULANG                       JAVAULANG                       JAVAULANG                       JAVAULANG                       JAVAULANG                       JAVAULANG                       JAVAULANG                       JAVAULANG        rayListArrayListArrayListavaj.gnalArrayListArrayListArrayListavaj.gnalArrayListArrayListArrayLi.                       javaulang");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test03904() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03904");
        int int3 = org.apache.commons.lang3.StringUtils.indexOf("Java.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.lang", 60, 43);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test03905() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03905");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("ArrayList", '#');
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.stripAll(strArray2, "                          ");
        java.lang.String str5 = org.apache.commons.lang3.StringUtils.getCommonPrefix(strArray2);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "ArrayList" + "'", str5, "ArrayList");
    }

    @Test
    public void test03906() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03906");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.endsWithIgnoreCase("JAVA.UTIL", "Gnal");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test03907() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03907");
        int int2 = org.apache.commons.lang3.StringUtils.countMatches("                                                                                                    ", "Arra");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test03908() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03908");
        java.lang.String str1 = org.apache.commons.lang3.ClassUtils.getPackageCanonicalName("interface java.lang.Cloneable...                                 interface java.io.Serializable");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "interfacejava.lang.Cloneable...interfacejava.io" + "'", str1, "interfacejava.lang.Cloneable...interfacejava.io");
    }

    @Test
    public void test03909() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03909");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlpha((java.lang.CharSequence) "$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$Gnal$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test03910() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03910");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfAnyBut(".. u", "ssalC");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test03911() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03911");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripAccents((java.lang.CharSequence) "                       JAVAULANGrrayList");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "                       JAVAULANGrrayList" + "'", str1, "                       JAVAULANGrrayList");
    }

    @Test
    public void test03912() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03912");
        java.lang.String str1 = org.apache.commons.lang3.ClassUtils.getShortCanonicalName("ylistarraylistarray");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "ylistarraylistarray" + "'", str1, "ylistarraylistarray");
    }

    @Test
    public void test03913() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03913");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "g.", "4444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444aaaaaaaaaava");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test03914() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03914");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.uncapitalize((java.lang.CharSequence) "gnalArrayListArrayListArrayListavaj.gnalArrayListArrayListArrayL");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "gnalArrayListArrayListArrayListavaj.gnalArrayListArrayListArrayL" + "'", str1, "gnalArrayListArrayListArrayListavaj.gnalArrayListArrayListArrayL");
    }

    @Test
    public void test03915() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03915");
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.replace("$$$$$$$$$$$$$$$$$$$$$$$$$$$$$...", "", "       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $", 89);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "$$$$$$$$$$$$$$$$$$$$$$$$$$$$$..." + "'", str4, "$$$$$$$$$$$$$$$$$$$$$$$$$$$$$...");
    }

    @Test
    public void test03916() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03916");
        java.lang.CharSequence charSequence1 = null;
        java.lang.CharSequence charSequence2 = org.apache.commons.lang3.StringUtils.defaultIfBlank((java.lang.CharSequence) "                      Integer                       ", charSequence1);
        org.junit.Assert.assertEquals("'" + charSequence2 + "' != '" + "                      Integer                       " + "'", charSequence2, "                      Integer                       ");
    }

    @Test
    public void test03917() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03917");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeStart("Object", "INTERFACE JAVA.LANG.cLONEABLE.......JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVAINTERFACE JAVA.IO.sERIALIZABLE");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Object" + "'", str2, "Object");
    }

    @Test
    public void test03918() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03918");
        java.util.Locale locale1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.apache.commons.lang3.StringUtils.upperCase("CLASS JAVA.LANG.oBJECT", locale1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test03919() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03919");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeStart("string.nal.avaj ecafretni", "lang");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "string.nal.avaj ecafretni" + "'", str2, "string.nal.avaj ecafretni");
    }

    @Test
    public void test03920() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03920");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "javastringslitUgnirtSarraylistarraylistavaj.gnalarraylistarraylistarrayli", "...nAAAAAAAAAAjaval.agnAAAAAAAAAA...");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test03921() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03921");
        int int3 = org.apache.commons.lang3.StringUtils.indexOfIgnoreCase("String[]String[]String[]String[]String[]String[]String[]String[]String[]String[]", "va.lang.Cl", 106);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test03922() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03922");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.chomp("GNAL.AVAJGNAL..langGNAL.AVAJGNAL.");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "GNAL.AVAJGNAL..langGNAL.AVAJGNAL." + "'", str1, "GNAL.AVAJGNAL..langGNAL.AVAJGNAL.");
    }

    @Test
    public void test03923() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03923");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.defaultString("slitUgnirtSslitUgnirtSslitUgnirtSslitUgnirtSslitUgnirtSslitUgnirtSslitUgnirtSslitUgnirtSslitUgnirtSslitUgnirtS");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "slitUgnirtSslitUgnirtSslitUgnirtSslitUgnirtSslitUgnirtSslitUgnirtSslitUgnirtSslitUgnirtSslitUgnirtSslitUgnirtS" + "'", str1, "slitUgnirtSslitUgnirtSslitUgnirtSslitUgnirtSslitUgnirtSslitUgnirtSslitUgnirtSslitUgnirtSslitUgnirtSslitUgnirtS");
    }

    @Test
    public void test03924() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03924");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.stripEnd("                                                                                                                                                                                                                                             HI!aRRAYlISTaRRAYlISTaRRAYlISTAVAJ.GNALaRRAYlISTaRRAYlISTaRRAYlISTAVAJ                                                                                                                                                                                                                                              ", "AVAJ.GNALAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA       ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                                                                                                                                                                                                                             HI!aRRAYlISTaRRAYlISTaRRAYlISTAVAJ.GNALaRRAYlISTaRRAYlISTaRRAYlIST" + "'", str2, "                                                                                                                                                                                                                                             HI!aRRAYlISTaRRAYlISTaRRAYlISTAVAJ.GNALaRRAYlISTaRRAYlISTaRRAYlIST");
    }

    @Test
    public void test03925() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03925");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.rightPad("                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                             ", (-1), ' ');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                             " + "'", str3, "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                             ");
    }

    @Test
    public void test03926() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03926");
        java.lang.String[] strArray4 = new java.lang.String[] { "                                   " };
        java.lang.String str5 = org.apache.commons.lang3.StringUtils.getCommonPrefix(strArray4);
        java.lang.Class<?>[] wildcardClassArray6 = org.apache.commons.lang3.ClassUtils.toClass((java.lang.Object[]) strArray4);
        java.lang.String[] strArray9 = new java.lang.String[] { "                                   " };
        java.lang.String str10 = org.apache.commons.lang3.StringUtils.getCommonPrefix(strArray9);
        int int11 = org.apache.commons.lang3.StringUtils.indexOfDifference((java.lang.CharSequence[]) strArray9);
        int int12 = org.apache.commons.lang3.StringUtils.lastIndexOfAny("...       ", strArray9);
        java.lang.String str13 = org.apache.commons.lang3.StringUtils.replaceEach("...       AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA", strArray4, strArray9);
        int int14 = org.apache.commons.lang3.StringUtils.lastIndexOfAny("...                                 ", strArray9);
        boolean boolean15 = org.apache.commons.lang3.StringUtils.endsWithAny("java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java", strArray9);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "                                   " + "'", str5, "                                   ");
        org.junit.Assert.assertNotNull(wildcardClassArray6);
        org.junit.Assert.assertNotNull(strArray9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "                                   " + "'", str10, "                                   ");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "...       AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA" + "'", str13, "...       AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test03927() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03927");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.contains("       ", "4444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test03928() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03928");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.strip("gnalArrayListArrayListArrayListavaj.gnalArrayListArrayListArrayL");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "gnalArrayListArrayListArrayListavaj.gnalArrayListArrayListArrayL" + "'", str1, "gnalArrayListArrayListArrayListavaj.gnalArrayListArrayListArrayL");
    }

    @Test
    public void test03929() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03929");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceChars("..........................................................................................", '#', ' ');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + ".........................................................................................." + "'", str3, "..........................................................................................");
    }

    @Test
    public void test03930() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03930");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "javaulainterface java.lang.Cloneable4interface java.io.Serializable", "...AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA...AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA...AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA...AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA...AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA...AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA...AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA...AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA...AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA..");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 21 + "'", int2 == 21);
    }

    @Test
    public void test03931() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03931");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.endsWithIgnoreCase("javaaaaaaaaaava.langava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.lang$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$", "hi!ArrayListArrayListArrayListavaj.gnalArrayListArrayListArrayListavaj.gnalArrayListArrayListArrayLi");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test03932() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03932");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.left("etyBetyBetyBetyBetyBetyBetyBetyBetyBetyBetyBetyBetyBetyBetyBetyBetyBetyBetyBetyBetyBetyBetyB", 36);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "etyBetyBetyBetyBetyBetyBetyBetyBetyB" + "'", str2, "etyBetyBetyBetyBetyBetyBetyBetyBetyB");
    }

    @Test
    public void test03933() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03933");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitByCharacterType("AAAAAAAAAA");
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test03934() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03934");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOf("javaaaaaaaaaava.langava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.lang$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$", 99, 100);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test03935() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03935");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.endsWithIgnoreCase("vvaylasa", "tring");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test03936() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03936");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA", "Arr... AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA... AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA... AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA... AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA... AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA... AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA... AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA... AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA... AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA... AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAyList", (int) (short) 100);
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void test03937() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03937");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.center("se...", 159);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                                                             se...                                                                             " + "'", str2, "                                                                             se...                                                                             ");
    }

    @Test
    public void test03938() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03938");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.leftPad("AAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAA", 940);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                                                                                                                                                                                                                                                         AAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAA" + "'", str2, "                                                                                                                                                                                                                                                                         AAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAA");
    }

    @Test
    public void test03939() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03939");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.chomp("A..ayL A.44444444444444444444444444", "Serializabl");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "A..ayL A.44444444444444444444444444" + "'", str2, "A..ayL A.44444444444444444444444444");
    }

    @Test
    public void test03940() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03940");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.normalizeSpace("gnal");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "gnal" + "'", str1, "gnal");
    }

    @Test
    public void test03941() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03941");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlpha((java.lang.CharSequence) "A..ayL A");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test03942() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03942");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeEnd("NTERF CEAJ V AL NGAcLONE BLEAAAAAAAJ V AAAAAAAAAAJ V AAAAAAAAAAJ V AAAAAAAAAAJ V AAAAAAAAAAJ V AAAAAAAAAAJ V AAAAAAAAAAJ V AAAAAAAAAAJ V AAAAAAAAAAJ V AAAAAAAAAAJ V AAAAAAAAAAJ V AAAAAAAAAAJ V AAAAAAAAAAJ V AAAAAAAAAAJ V AAAAAAAAAAJ V AAAAAAAAAAJ V AAAAAAAAAAJ V AAAAAAAAAAJ V AAAAAAAAAAJ V AAAAAAAAAAJ V AAAAAAAAAAJ V AAAAAAAAAAJ V AAAAAAAAAAJ V AAAAAAAAAAJ V AAAAAAAAAAJ V AAAAAAAAAAJ V AAAAAAAAAAJ V AAAAAAAAAAJ V AAAAAAAAAAJ V AAAAAAAAAAJ V AAAAAAAAAAJ V AAAAAAAAAAJ V AAAAAAAAAAJ V AAAAAAAAAAJ V AAAAAAAAAAJ V INTERF CEAJ V AIOAsERI LIZ BLE", "...    $         $         $         $         $         $         $         $         $         $         $         $         $         $         $ ...");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "NTERF CEAJ V AL NGAcLONE BLEAAAAAAAJ V AAAAAAAAAAJ V AAAAAAAAAAJ V AAAAAAAAAAJ V AAAAAAAAAAJ V AAAAAAAAAAJ V AAAAAAAAAAJ V AAAAAAAAAAJ V AAAAAAAAAAJ V AAAAAAAAAAJ V AAAAAAAAAAJ V AAAAAAAAAAJ V AAAAAAAAAAJ V AAAAAAAAAAJ V AAAAAAAAAAJ V AAAAAAAAAAJ V AAAAAAAAAAJ V AAAAAAAAAAJ V AAAAAAAAAAJ V AAAAAAAAAAJ V AAAAAAAAAAJ V AAAAAAAAAAJ V AAAAAAAAAAJ V AAAAAAAAAAJ V AAAAAAAAAAJ V AAAAAAAAAAJ V AAAAAAAAAAJ V AAAAAAAAAAJ V AAAAAAAAAAJ V AAAAAAAAAAJ V AAAAAAAAAAJ V AAAAAAAAAAJ V AAAAAAAAAAJ V AAAAAAAAAAJ V AAAAAAAAAAJ V INTERF CEAJ V AIOAsERI LIZ BLE" + "'", str2, "NTERF CEAJ V AL NGAcLONE BLEAAAAAAAJ V AAAAAAAAAAJ V AAAAAAAAAAJ V AAAAAAAAAAJ V AAAAAAAAAAJ V AAAAAAAAAAJ V AAAAAAAAAAJ V AAAAAAAAAAJ V AAAAAAAAAAJ V AAAAAAAAAAJ V AAAAAAAAAAJ V AAAAAAAAAAJ V AAAAAAAAAAJ V AAAAAAAAAAJ V AAAAAAAAAAJ V AAAAAAAAAAJ V AAAAAAAAAAJ V AAAAAAAAAAJ V AAAAAAAAAAJ V AAAAAAAAAAJ V AAAAAAAAAAJ V AAAAAAAAAAJ V AAAAAAAAAAJ V AAAAAAAAAAJ V AAAAAAAAAAJ V AAAAAAAAAAJ V AAAAAAAAAAJ V AAAAAAAAAAJ V AAAAAAAAAAJ V AAAAAAAAAAJ V AAAAAAAAAAJ V AAAAAAAAAAJ V AAAAAAAAAAJ V AAAAAAAAAAJ V AAAAAAAAAAJ V INTERF CEAJ V AIOAsERI LIZ BLE");
    }

    @Test
    public void test03943() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03943");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringAfterLast("44444444444444444444444444444444444444444444444444444444444444444444444javaulang444444444444444444444444444444444444444444444444444444444444444444444444", "slitUgnirtSslitUgnirtSslitUgnirtSslitUgnirtSslitUgnirtSslitUgnirtSslitUgnirtSslitUgnirtSslitUgnirtSslitUgnirtS");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test03944() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03944");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trim("...VA.LANGAVAJ.GNALJAVA.LANGAVAJ.GNALJAVA.LANGAVAJ.GNALJAVA.LANGAVAJ.GNALJAVA.LANGAVAJ.GNALJAVA.LANGgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalg");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "...VA.LANGAVAJ.GNALJAVA.LANGAVAJ.GNALJAVA.LANGAVAJ.GNALJAVA.LANGAVAJ.GNALJAVA.LANGAVAJ.GNALJAVA.LANGgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalg" + "'", str1, "...VA.LANGAVAJ.GNALJAVA.LANGAVAJ.GNALJAVA.LANGAVAJ.GNALJAVA.LANGAVAJ.GNALJAVA.LANGAVAJ.GNALJAVA.LANGgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalg");
    }

    @Test
    public void test03945() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03945");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBetween("java.langjava.langjava.langjava.langjava.langjava.la", "###############################################################################################################################################################");
        org.junit.Assert.assertNull(str2);
    }

    @Test
    public void test03946() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03946");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.stripStart("hi!Arr...", "...................................................................");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!Arr..." + "'", str2, "hi!Arr...");
    }

    @Test
    public void test03947() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03947");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringAfter("hi!ArrayListArrayListArrayListavaj.gnalArrayListArrayListArrayListavaj", "LANGgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalg");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test03948() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03948");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeEndIgnoreCase("#                                             ", "gn");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "#                                             " + "'", str2, "#                                             ");
    }

    @Test
    public void test03949() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03949");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.equals((java.lang.CharSequence) "java.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.lang", (java.lang.CharSequence) "class java.lang.Class                       JAVAULANG                       JAVAULANG                       JAVAULANG                       JAVAULANG                       JAVAULANG                       JAVAULANG                       JAVAULANG                       JAVAULANG                       JAVAULANG                       JAVAULANG                       JAVAULANG                       JAVAULANG                       JAVAULANG                       JAVAULANG                       JAVAULANG                       JAVAULANG                       JAVAULANG                       JAVAULANG                       JAVAULANG                       JAVAULANG        ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test03950() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03950");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("class java.lang.String", "                                   ");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.stripAll(strArray2);
        java.lang.Class<?>[] wildcardClassArray4 = org.apache.commons.lang3.ClassUtils.toClass((java.lang.Object[]) strArray3);
        java.lang.Class<?>[] wildcardClassArray5 = org.apache.commons.lang3.ClassUtils.primitivesToWrappers(wildcardClassArray4);
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
        boolean boolean39 = org.apache.commons.lang3.ClassUtils.isAssignable(wildcardClassArray5, wildcardClassArray27, false);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str43 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) wildcardClassArray5, '.', 3, 18);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 3");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertNotNull(wildcardClassArray4);
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
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
    }

    @Test
    public void test03951() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03951");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.defaultString("LANG.GNALJAVA.LANGAVAJ.GNALJAVA.LANGAVAJ.GNALJAVA.LANGAVAJ.GNALJAVA.LA");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "LANG.GNALJAVA.LANGAVAJ.GNALJAVA.LANGAVAJ.GNALJAVA.LANGAVAJ.GNALJAVA.LA" + "'", str1, "LANG.GNALJAVA.LANGAVAJ.GNALJAVA.LANGAVAJ.GNALJAVA.LANGAVAJ.GNALJAVA.LA");
    }

    @Test
    public void test03952() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03952");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isBlank((java.lang.CharSequence) "LANG.GNALJAVA.LANGAVAJ.GNALJAVA.LANGAVAJ.GNALJAVA.LANGAVAJ.GNALJAVA.LANGAVAJ.GNALJAVA.LANGAVAJ.GNALJAVA.LANGAVAJ.GNALJAVA.LANGAVAJ.GNALJAVA.LANGAVAJ.JAVA");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test03953() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03953");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeStart("...       AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA...       AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA...       AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA...       AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA...       AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA...       AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA...       AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA...       AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA...       AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA...       AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA", "4444444");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "...       AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA...       AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA...       AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA...       AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA...       AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA...       AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA...       AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA...       AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA...       AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA...       AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA" + "'", str2, "...       AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA...       AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA...       AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA...       AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA...       AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA...       AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA...       AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA...       AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA...       AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA...       AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA");
    }

    @Test
    public void test03954() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03954");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.deleteWhitespace("javal aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaagn");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "javalaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaagn" + "'", str1, "javalaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaagn");
    }

    @Test
    public void test03955() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03955");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.mid("class java.lang.Class                       JAVAULANG                       JAVAULANG                       JAVAULANG                       JAVAULANG                       JAVAULANG                       JAVAULANG                       JAVAULANG                       JAVAULANG                       JAVAULANG                       JAVAULANG                       JAVAULANG                       JAVAULANG                       JAVAULANG                       JAVAULANG                       JAVAULANG                       JAVAULANG                       JAVAULANG                       JAVAULANG                       JAVAULANG                       JAVAULANG        ", (int) (byte) 100, (-1));
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test03956() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03956");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeStartIgnoreCase("..", "Byte");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + ".." + "'", str2, "..");
    }

    @Test
    public void test03957() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03957");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trimToEmpty("AAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAring");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "AAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAring" + "'", str1, "AAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAring");
    }

    @Test
    public void test03958() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03958");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphanumeric((java.lang.CharSequence) "lang.gnaljava.langavaj.gnaljava.langavaj.gnaljava.langavaj.gnaljava.la");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test03959() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03959");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceChars("", "java.uti", "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test03960() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03960");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.lowerCase("       aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "       aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa" + "'", str1, "       aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
    }

    @Test
    public void test03961() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03961");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripToEmpty("java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........javainterface java.io");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........javainterface java.io" + "'", str1, "java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........javainterface java.io");
    }

    @Test
    public void test03962() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03962");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trimToEmpty("       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "$       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $" + "'", str1, "$       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $       $");
    }

    @Test
    public void test03963() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03963");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substring("irfCo.irfioSriiz", 46);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test03964() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03964");
        int int3 = org.apache.commons.lang3.StringUtils.indexOf("interface java.lang.CloneableStringinterface java.io", "JAVAULANG", 106);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test03965() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03965");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trim("Arralitu.avajlitu.avaj");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Arralitu.avajlitu.avaj" + "'", str1, "Arralitu.avajlitu.avaj");
    }

    @Test
    public void test03966() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03966");
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.replace("...VA.LANGAVAJ.GNALJAVA.LANGAVAJ.GNALJAVA.LANGAVAJ.GNALJAVA.LANGAVAJ.GNALJAVA.LANGAVAJ.GNALJAVA.LANG", "CEAJ V AL ", "Arr... AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA... AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA... AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA... AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA... AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA... AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA... AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA... AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA... AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA... AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAyList", 516);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "...VA.LANGAVAJ.GNALJAVA.LANGAVAJ.GNALJAVA.LANGAVAJ.GNALJAVA.LANGAVAJ.GNALJAVA.LANGAVAJ.GNALJAVA.LANG" + "'", str4, "...VA.LANGAVAJ.GNALJAVA.LANGAVAJ.GNALJAVA.LANGAVAJ.GNALJAVA.LANGAVAJ.GNALJAVA.LANGAVAJ.GNALJAVA.LANG");
    }

    @Test
    public void test03967() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03967");
        int int2 = org.apache.commons.lang3.StringUtils.getLevenshteinDistance((java.lang.CharSequence) "VAJ.GNAL", (java.lang.CharSequence) "jv..........jv..........jv..........jv..........jv..........jv..........jv..........jv..........jv..........jv..........jv..........jv..........jv..........jv..........jv..........jv..........jv..........jv..........jv..........jv..........jv..........jv..........jv..........jv..........jv..........jv..........jv..........jv..........jv..........jv..........jv..........jv..........jv..........jv..........jvinterfce jv.io");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 423 + "'", int2 == 423);
    }

    @Test
    public void test03968() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03968");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.chomp("AVAJ.GNALNaaaaaaaaaaJAVAL.AGNaaaaaaaaaaJAVAL.AGNaaaaaaaaaaJAVAL.AGNaaaaaaaaaaJAVAL.AGNaaaaaaaaaaJAVAL.AGNaaaaaaaaaaJAVAL.AGNaaaaaaaaaaJAVAL.AGNaaaaaaaaaaJAVAL.AGNaaaaaaaaaaJAVAL.AGNaaaaaaaaaaJAVAL.AGNaaaaaaaaaaJAVAL.AGNaaaaaaaaaaJAVAL.AGNaaaaaaaaaaJAVAL.AGNaaaaaaaaaaJAVAL.AGNaaaaaaaaaaJAVAL.AGNaaaaaaaaaaJAVAL.AGNaaaaaaaaaaJAVAL.AGNaaaaaaaaaaJAVAL.AGNaaaaaaaaaaJAVAL.AGNaaaaaaaaaaJAVAL.AGNaaaaaaaaaaJAVAL.AGNaaaaaaaaaaJAVAL.AGNaaaaaaaaaaJAVAL.AGNaaaaaaaaaaJAVAL.AGNaaaaaaaaaaJAVAL.AGNaaaaaaaaaaJAVAL.AGNaaaaaaaaaaJAVAL.AGNaaaaaaaaaaJAVAL.AGNaaaaaaaaaaJAVAL.AGNaaaaaaaaaaJAVAL.AGNaaaaaaaaaaJAVAL.AGNaaaaaaaaaaJAVAL.AGNaaaaaaaaaaJAVAL.AGNaaaaaaaaaaJAVAL.AGNaaaaaaaaaa");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "AVAJ.GNALNaaaaaaaaaaJAVAL.AGNaaaaaaaaaaJAVAL.AGNaaaaaaaaaaJAVAL.AGNaaaaaaaaaaJAVAL.AGNaaaaaaaaaaJAVAL.AGNaaaaaaaaaaJAVAL.AGNaaaaaaaaaaJAVAL.AGNaaaaaaaaaaJAVAL.AGNaaaaaaaaaaJAVAL.AGNaaaaaaaaaaJAVAL.AGNaaaaaaaaaaJAVAL.AGNaaaaaaaaaaJAVAL.AGNaaaaaaaaaaJAVAL.AGNaaaaaaaaaaJAVAL.AGNaaaaaaaaaaJAVAL.AGNaaaaaaaaaaJAVAL.AGNaaaaaaaaaaJAVAL.AGNaaaaaaaaaaJAVAL.AGNaaaaaaaaaaJAVAL.AGNaaaaaaaaaaJAVAL.AGNaaaaaaaaaaJAVAL.AGNaaaaaaaaaaJAVAL.AGNaaaaaaaaaaJAVAL.AGNaaaaaaaaaaJAVAL.AGNaaaaaaaaaaJAVAL.AGNaaaaaaaaaaJAVAL.AGNaaaaaaaaaaJAVAL.AGNaaaaaaaaaaJAVAL.AGNaaaaaaaaaaJAVAL.AGNaaaaaaaaaaJAVAL.AGNaaaaaaaaaaJAVAL.AGNaaaaaaaaaaJAVAL.AGNaaaaaaaaaaJAVAL.AGNaaaaaaaaaaJAVAL.AGNaaaaaaaaaa" + "'", str1, "AVAJ.GNALNaaaaaaaaaaJAVAL.AGNaaaaaaaaaaJAVAL.AGNaaaaaaaaaaJAVAL.AGNaaaaaaaaaaJAVAL.AGNaaaaaaaaaaJAVAL.AGNaaaaaaaaaaJAVAL.AGNaaaaaaaaaaJAVAL.AGNaaaaaaaaaaJAVAL.AGNaaaaaaaaaaJAVAL.AGNaaaaaaaaaaJAVAL.AGNaaaaaaaaaaJAVAL.AGNaaaaaaaaaaJAVAL.AGNaaaaaaaaaaJAVAL.AGNaaaaaaaaaaJAVAL.AGNaaaaaaaaaaJAVAL.AGNaaaaaaaaaaJAVAL.AGNaaaaaaaaaaJAVAL.AGNaaaaaaaaaaJAVAL.AGNaaaaaaaaaaJAVAL.AGNaaaaaaaaaaJAVAL.AGNaaaaaaaaaaJAVAL.AGNaaaaaaaaaaJAVAL.AGNaaaaaaaaaaJAVAL.AGNaaaaaaaaaaJAVAL.AGNaaaaaaaaaaJAVAL.AGNaaaaaaaaaaJAVAL.AGNaaaaaaaaaaJAVAL.AGNaaaaaaaaaaJAVAL.AGNaaaaaaaaaaJAVAL.AGNaaaaaaaaaaJAVAL.AGNaaaaaaaaaaJAVAL.AGNaaaaaaaaaaJAVAL.AGNaaaaaaaaaaJAVAL.AGNaaaaaaaaaaJAVAL.AGNaaaaaaaaaa");
    }

    @Test
    public void test03969() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03969");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBetween("JAVA.LANGAgnal.avajgnal..LANGgnal.avArrclass java.lang.ObjectyListArrclass java.lang.ObjectyListA", "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test03970() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03970");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.capitalize((java.lang.CharSequence) "AtsiLytcejbO.gnal.avaj ssalcrrAtsiLytcejbO.gnal.avaj ssalcrrAva.langGNAL..langjava.langAGNAL.AVAJAtsiLytcejbO.gnal.avaj ssalcrrAtsiLytcejbO.gnal.avaj ssalcrrAva.langGNAL..langjava.langAGNAL.AVAJAtsiLytcejbO.gnal.avaj ssalcrrAtsiLytcejbO.gnal.avaj ssalcrrAva.langGNAL..langjava.langAGNAL.AVAJAtsiLytcejbO.gnal.avaj ssalcrrAtsiLytcejStringAtsiLytcejbO.gnal.avaj ssalcrrAtsiLytcejbO.gnal.avaj ssalcrrAva.langGNAL..langjava.langAGNAL.AVAJAtsiLytcejbO.gnal.avaj ssalcrrAtsiLytcejbO.gnal.avaj ssalcrrAva.langGNAL..langjava.langAGNAL.AVAJAtsiLytcejbO.gnal.avaj ssalcrrAtsiLytcejbO.gnal.avaj ssalcrrAva.langGNAL..langjava.langAGNAL.AVAJAtsiLytcejbO.gnal.avaj ssalcrrAtsiLytcejb");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "AtsiLytcejbO.gnal.avaj ssalcrrAtsiLytcejbO.gnal.avaj ssalcrrAva.langGNAL..langjava.langAGNAL.AVAJAtsiLytcejbO.gnal.avaj ssalcrrAtsiLytcejbO.gnal.avaj ssalcrrAva.langGNAL..langjava.langAGNAL.AVAJAtsiLytcejbO.gnal.avaj ssalcrrAtsiLytcejbO.gnal.avaj ssalcrrAva.langGNAL..langjava.langAGNAL.AVAJAtsiLytcejbO.gnal.avaj ssalcrrAtsiLytcejStringAtsiLytcejbO.gnal.avaj ssalcrrAtsiLytcejbO.gnal.avaj ssalcrrAva.langGNAL..langjava.langAGNAL.AVAJAtsiLytcejbO.gnal.avaj ssalcrrAtsiLytcejbO.gnal.avaj ssalcrrAva.langGNAL..langjava.langAGNAL.AVAJAtsiLytcejbO.gnal.avaj ssalcrrAtsiLytcejbO.gnal.avaj ssalcrrAva.langGNAL..langjava.langAGNAL.AVAJAtsiLytcejbO.gnal.avaj ssalcrrAtsiLytcejb" + "'", str1, "AtsiLytcejbO.gnal.avaj ssalcrrAtsiLytcejbO.gnal.avaj ssalcrrAva.langGNAL..langjava.langAGNAL.AVAJAtsiLytcejbO.gnal.avaj ssalcrrAtsiLytcejbO.gnal.avaj ssalcrrAva.langGNAL..langjava.langAGNAL.AVAJAtsiLytcejbO.gnal.avaj ssalcrrAtsiLytcejbO.gnal.avaj ssalcrrAva.langGNAL..langjava.langAGNAL.AVAJAtsiLytcejbO.gnal.avaj ssalcrrAtsiLytcejStringAtsiLytcejbO.gnal.avaj ssalcrrAtsiLytcejbO.gnal.avaj ssalcrrAva.langGNAL..langjava.langAGNAL.AVAJAtsiLytcejbO.gnal.avaj ssalcrrAtsiLytcejbO.gnal.avaj ssalcrrAva.langGNAL..langjava.langAGNAL.AVAJAtsiLytcejbO.gnal.avaj ssalcrrAtsiLytcejbO.gnal.avaj ssalcrrAva.langGNAL..langjava.langAGNAL.AVAJAtsiLytcejbO.gnal.avaj ssalcrrAtsiLytcejb");
    }

    @Test
    public void test03971() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03971");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "Arr... aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa... aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa... aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa... aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa... aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa... aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa... aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa... aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa... aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa... aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaylist", "$$$$$$$$$$$$$$$$$$$$$$$$$$$$$...$$$$$$$$$$$$$$$$$$$$$$$$$$$$$...$$$$$$$$$$$$$$$$$$$$$$$$$$$$$...       ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test03972() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03972");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeEnd(".LANG", "44444444444444444.444444444444444444");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + ".LANG" + "'", str2, ".LANG");
    }

    @Test
    public void test03973() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03973");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.right("irfCo$irfioSriiz", 23);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "irfCo$irfioSriiz" + "'", str2, "irfCo$irfioSriiz");
    }

    @Test
    public void test03974() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03974");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripAccents((java.lang.CharSequence) "javalaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaagn");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "javalaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaagn" + "'", str1, "javalaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaagn");
    }

    @Test
    public void test03975() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03975");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.rightPad("...       AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA", 153);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "...       AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA                                                     " + "'", str2, "...       AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA                                                     ");
    }

    @Test
    public void test03976() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03976");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.abbreviate("4444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444..........", 47);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "44444444444444444444444444444444444444444444..." + "'", str2, "44444444444444444444444444444444444444444444...");
    }

    @Test
    public void test03977() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03977");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphaSpace((java.lang.CharSequence) "$$$$$$$$");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test03978() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03978");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBefore("...       ...       ...       ...       ...       ...       ...       ...       ...       ...   gna", "$         $         $         $         $         $         $         $         $         $         $         $         $         $         $         $         $         $         $         $         $         $         $         $         $         $         $         $         $         $         $         $         $         $         $         $         ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "...       ...       ...       ...       ...       ...       ...       ...       ...       ...   gna" + "'", str2, "...       ...       ...       ...       ...       ...       ...       ...       ...       ...   gna");
    }

    @Test
    public void test03979() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03979");
        int int2 = org.apache.commons.lang3.StringUtils.getLevenshteinDistance((java.lang.CharSequence) "java$.$lang", (java.lang.CharSequence) "#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#lass java#lang#String");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 487 + "'", int2 == 487);
    }

    @Test
    public void test03980() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03980");
        int int2 = org.apache.commons.lang3.StringUtils.getLevenshteinDistance((java.lang.CharSequence) "etyB", (java.lang.CharSequence) "javaaaaaaaaaava.langava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.lang$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 493 + "'", int2 == 493);
    }

    @Test
    public void test03981() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03981");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByCharacterTypeCamelCase("gnalArrayListArrayListArrayLi");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.concatWith("..", (java.lang.Object[]) strArray2);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "gnal..Array..List..Array..List..Array..Li" + "'", str3, "gnal..Array..List..Array..List..Array..Li");
    }

    @Test
    public void test03982() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03982");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphanumericSpace((java.lang.CharSequence) "CEAJ V AL NGAcLONE BLEAAAAAAAJ V AAAAAAAAAAJ V AAAAAAAAAAJ V AAAAAAAAAAJ V AAAAAAAAAAJ V AAAAAAAAAAJ V AAAAAAAAAAJ V AAAAAAAAAAJ V AAAAAAAAAAJ V AAAAAAAAAAJ V AAAAAAAAAAJ V AAAAAAAAAAJ V AAAAAAAAAAJ V AAAAAAAAAAJ V AAAAAAAAAAJ V AAAAAAAAAAJ V AAAAAAAAAAJ V AAAAAAAAAAJ V AAAAAAAAAAJ V AAAAAAAAAAJ V AAAAAAAAAAJ V AAAAAAAAAAJ V AAAAAAAAAAJ V AAAAAAAAAAJ V AAAAAAAAAAJ V AAAAAAAAAAJ V AAAAAAAAAAJ V AAAAAAAAAAJ V AAAAAAAAAAJ V AAAAAAAAAAJ V AAAAAAAAAAJ V AAAAAAAAAAJ V AAAAAAAAAAJ V AAAAAAAAAAJ V AAAAAAAAAAJ V INTERF CEAJ V AIOAsERI LIZ BLE");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test03983() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03983");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlpha((java.lang.CharSequence) "......");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test03984() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03984");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("etyB", "interface gaga.lang.CloneableAAAAAAAAAAgagal.agnAAAAAAAAAAgagal.agnAAAAAAAAAAgagal.agnAAAAAAAAAAgagal.agnAAAAAAAAAAgagal.agnAAAAAAAAAAgagal.agnAAAAAAAAAAgagal.agnAAAAAAAAAAgagal.agnAAAAAAAAAAgagal.agnAAAAAAAAAAgagal.agnAAAAAAAAAAgagal.agnAAAAAAAAAAgagal.agnAAAAAAAAAAgagal.agnAAAAAAAAAAgagal.agnAAAAAAAAAAgagal.agnAAAAAAAAAAgagal.agnAAAAAAAAAAgagal.agnAAAAAAAAAAgagal.agnAAAAAAAAAAgagal.agnAAAAAAAAAAgagal.agnAAAAAAAAAAgagal.agnAAAAAAAAAAgagal.agnAAAAAAAAAAgagal.agnAAAAAAAAAAgagal.agnAAAAAAAAAAgagal.agnAAAAAAAAAAgagal.agnAAAAAAAAAAgagal.agnAAAAAAAAAAgagal.agnAAAAAAAAAAgagal.agnAAAAAAAAAAgagal.agnAAAAAAAAAAgagal.agnAAAAAAAAAAgagal.agnAAAAAAAAAAgagal.agnAAAAAAAAAAgagal.agnAAAAAAAAAAgagal.agnAAAAAAAAAAringinterface gaga.io.Serializable");
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test03985() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03985");
        java.lang.Class<?>[] wildcardClassArray0 = null;
        java.lang.Class<?>[] wildcardClassArray1 = org.apache.commons.lang3.ClassUtils.wrappersToPrimitives(wildcardClassArray0);
        org.junit.Assert.assertNull(wildcardClassArray1);
    }

    @Test
    public void test03986() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03986");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeStartIgnoreCase("interface java.lang.Cloneable.......java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........javainterface java.io.Serializable", "LANGgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalg");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "interface java.lang.Cloneable.......java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........javainterface java.io.Serializable" + "'", str2, "interface java.lang.Cloneable.......java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........javainterface java.io.Serializable");
    }

    @Test
    public void test03987() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03987");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphanumericSpace((java.lang.CharSequence) "aAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA... AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA... AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA... AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA... AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA... AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA... AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA... AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA... AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA... ...");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test03988() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03988");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphanumeric((java.lang.CharSequence) "JAVA.LANG                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                    ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test03989() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03989");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("etyBetyBetyBetyBetyBetyBetyBetyBetyB", ". ");
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test03990() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03990");
        int int2 = org.apache.commons.lang3.StringUtils.indexOf("                                                                                                                                                                                                                                             HI!aRRAYlISTaRRAYlISTaRRAYlISTAVAJ.GNALaRRAYlISTaRRAYlISTaRRAYlIST", "4444444444444");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test03991() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03991");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.rightPad("javal#.#agn", 43, "       aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "javal#.#agn       aaaaaaaaaaaaaaaaaaaaaaaaa" + "'", str3, "javal#.#agn       aaaaaaaaaaaaaaaaaaaaaaaaa");
    }

    @Test
    public void test03992() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03992");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.center("interface java.lang.Cloneable....................................................................                       JAVAULANGinterface java.io.Serializable", (int) (short) 100, '4');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "interface java.lang.Cloneable....................................................................                       JAVAULANGinterface java.io.Serializable" + "'", str3, "interface java.lang.Cloneable....................................................................                       JAVAULANGinterface java.io.Serializable");
    }

    @Test
    public void test03993() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03993");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaajaval#.#agnaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaajaval#.#agnaaaaaaaaGnal", "####");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 64 + "'", int2 == 64);
    }

    @Test
    public void test03994() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03994");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("avalitu.", '$');
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test03995() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03995");
        int int2 = org.apache.commons.lang3.StringUtils.countMatches("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaagn                                            ", "-1java");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test03996() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03996");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.mid("CLASS JAVALANGCLASS                       JAVAULANG                       JAVAULANG                       JAVAULANG                       JAVAULANG                       JAVAULANG                       JAVAULANG                       JAVAULANG                       JAVAULANG                       JAVAULANG                       JAVAULANG                       JAVAULANG                       JAVAULANG                       JAVAULANG                       JAVAULANG                       JAVAULANG                       JAVAULANG                       JAVAULANG                       JAVAULANG                       JAVAULANG                       JAVAULANG        ", 487, (int) (short) 1);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + " " + "'", str3, " ");
    }

    @Test
    public void test03997() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03997");
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.replace("JAVAsTRIN", "STRING", ".........ava..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........javaj", 99);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "JAVAsTRIN" + "'", str4, "JAVAsTRIN");
    }

    @Test
    public void test03998() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03998");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isBlank((java.lang.CharSequence) "classJAVA.LANGaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaULANG");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test03999() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03999");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.mid("Class[]", 11, 516);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test04000() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test04000");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOf("aVAJ.GNALAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA       CharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterChara", 525, 9);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }
}

