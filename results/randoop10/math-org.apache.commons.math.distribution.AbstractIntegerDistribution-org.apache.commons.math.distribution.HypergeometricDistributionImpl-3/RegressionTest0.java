import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest0 {

    public static boolean debug = false;

    @Test
    public void test00001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00001");
        // The following exception was thrown during execution in test generation
        try {
            java.io.PrintStream printStream2 = new java.io.PrintStream("hi!", "hi!");
            org.junit.Assert.fail("Expected exception of type java.io.UnsupportedEncodingException; message: hi!");
        } catch (java.io.UnsupportedEncodingException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00002");
        java.io.Writer writer0 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.io.PrintWriter printWriter1 = new java.io.PrintWriter(writer0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00003");
        java.util.Locale locale3 = new java.util.Locale("", "", "");
        boolean boolean5 = locale3.equals((java.lang.Object) "hi!");
        org.junit.Assert.assertEquals(locale3.toString(), "");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test00004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00004");
        java.util.Locale locale3 = new java.util.Locale("", "", "");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str5 = locale3.getExtension('4');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Ill-formed extension key: 4");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals(locale3.toString(), "");
    }

    @Test
    public void test00005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00005");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.LanguageRange languageRange1 = new java.util.Locale.LanguageRange("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: range=hi!");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00006");
        java.util.Locale locale0 = java.util.Locale.FRENCH;
        java.lang.String str1 = locale0.toString();
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "fr");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "fr" + "'", str1, "fr");
    }

    @Test
    public void test00007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00007");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.LanguageRange languageRange1 = new java.util.Locale.LanguageRange("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: range=");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00008");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.LanguageRange languageRange2 = new java.util.Locale.LanguageRange("", (double) 10L);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: weight=10.0");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00009");
        java.util.Locale.Category category0 = null;
        java.util.Locale locale1 = java.util.Locale.ITALY;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.setDefault(category0, locale1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Category cannot be NULL");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "it_IT");
    }

    @Test
    public void test00010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00010");
        java.util.Locale locale0 = java.util.Locale.ROOT;
        boolean boolean1 = locale0.hasExtensions();
        boolean boolean3 = locale0.equals((java.lang.Object) (-1.0d));
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test00011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00011");
        java.util.Locale locale0 = java.util.Locale.ROOT;
        boolean boolean1 = locale0.hasExtensions();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str3 = locale0.getExtension(' ');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Ill-formed extension key:  ");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test00012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00012");
        java.io.File file0 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.io.PrintStream printStream1 = new java.io.PrintStream(file0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00013");
        java.util.Locale locale0 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.setDefault(locale0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Can't set default locale to NULL");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00014");
        java.util.Locale locale0 = java.util.Locale.ITALY;
        java.util.Locale locale1 = java.util.Locale.ROOT;
        boolean boolean2 = locale1.hasExtensions();
        java.lang.String str3 = locale0.getDisplayCountry(locale1);
        java.lang.String str4 = locale0.toString();
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "it_IT");
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Italy" + "'", str3, "Italy");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "it_IT" + "'", str4, "it_IT");
    }

    @Test
    public void test00015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00015");
        double double0 = java.util.Locale.LanguageRange.MAX_WEIGHT;
        org.junit.Assert.assertTrue("'" + double0 + "' != '" + 1.0d + "'", double0 == 1.0d);
    }

    @Test
    public void test00016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00016");
        char char0 = java.util.Locale.UNICODE_LOCALE_EXTENSION;
        org.junit.Assert.assertTrue("'" + char0 + "' != '" + 'u' + "'", char0 == 'u');
    }

    @Test
    public void test00017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00017");
        java.util.Locale locale0 = java.util.Locale.FRENCH;
        java.util.Set<java.lang.String> strSet1 = locale0.getUnicodeLocaleKeys();
        java.util.Locale locale2 = java.util.Locale.ROOT;
        java.util.Set<java.lang.String> strSet3 = locale2.getUnicodeLocaleKeys();
        boolean boolean4 = locale0.equals((java.lang.Object) locale2);
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "fr");
        org.junit.Assert.assertNotNull(strSet1);
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "");
        org.junit.Assert.assertNotNull(strSet3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test00018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00018");
        java.io.File file0 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.io.PrintStream printStream2 = new java.io.PrintStream(file0, "Italy");
            org.junit.Assert.fail("Expected exception of type java.io.UnsupportedEncodingException; message: Italy");
        } catch (java.io.UnsupportedEncodingException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00019");
        // The following exception was thrown during execution in test generation
        try {
            java.io.PrintStream printStream2 = new java.io.PrintStream("", "it_IT");
            org.junit.Assert.fail("Expected exception of type java.io.UnsupportedEncodingException; message: it_IT");
        } catch (java.io.UnsupportedEncodingException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00020");
        java.util.Locale locale2 = new java.util.Locale("hi!", "Italy");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str4 = locale2.getUnicodeLocaleType("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Ill-formed Unicode locale key: hi!");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals(locale2.toString(), "hi!_ITALY");
    }

    @Test
    public void test00021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00021");
        // The following exception was thrown during execution in test generation
        try {
            java.io.PrintWriter printWriter1 = new java.io.PrintWriter("hi!");
// flaky:             org.junit.Assert.fail("Expected exception of type java.io.FileNotFoundException; message: hi! (Is a directory)");
        } catch (java.io.FileNotFoundException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00022");
        double double0 = java.util.Locale.LanguageRange.MIN_WEIGHT;
        org.junit.Assert.assertTrue("'" + double0 + "' != '" + 0.0d + "'", double0 == 0.0d);
    }

    @Test
    public void test00023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00023");
        java.io.OutputStream outputStream0 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.io.PrintStream printStream1 = new java.io.PrintStream(outputStream0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Null output stream");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00024");
        char char0 = java.util.Locale.PRIVATE_USE_EXTENSION;
        org.junit.Assert.assertTrue("'" + char0 + "' != '" + 'x' + "'", char0 == 'x');
    }

    @Test
    public void test00025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00025");
        java.util.Locale locale0 = java.util.Locale.ITALY;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = locale0.getUnicodeLocaleType("Italy");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Ill-formed Unicode locale key: Italy");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "it_IT");
    }

    @Test
    public void test00026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00026");
        java.util.Locale.Category category0 = null;
        java.util.Locale locale1 = java.util.Locale.ROOT;
        boolean boolean2 = locale1.hasExtensions();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.setDefault(category0, locale1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Category cannot be NULL");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test00027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00027");
        java.io.OutputStream outputStream0 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.io.PrintWriter printWriter1 = new java.io.PrintWriter(outputStream0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00028");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.LanguageRange languageRange2 = new java.util.Locale.LanguageRange("hi!", (double) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: weight=32.0");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00029");
        java.io.File file0 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.io.PrintStream printStream2 = new java.io.PrintStream(file0, "");
            org.junit.Assert.fail("Expected exception of type java.io.UnsupportedEncodingException; message: ");
        } catch (java.io.UnsupportedEncodingException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00030");
        java.io.PrintWriter printWriter1 = new java.io.PrintWriter("fr");
        char[] charArray4 = new char[] { '#', 'u' };
        // The following exception was thrown during execution in test generation
        try {
            printWriter1.write(charArray4, (int) (byte) 100, (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray4), "#u");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray4), "#u");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray4), "[#, u]");
    }

    @Test
    public void test00031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00031");
        java.io.File file0 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.io.PrintWriter printWriter2 = new java.io.PrintWriter(file0, "Italy");
            org.junit.Assert.fail("Expected exception of type java.io.UnsupportedEncodingException; message: Italy");
        } catch (java.io.UnsupportedEncodingException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00032");
        java.util.Locale locale0 = java.util.Locale.ROOT;
        java.lang.String str1 = locale0.toString();
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
    }

    @Test
    public void test00033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00033");
        java.io.PrintWriter printWriter1 = new java.io.PrintWriter("fr");
        printWriter1.print("it_IT");
        // The following exception was thrown during execution in test generation
        try {
            printWriter1.write("Italy", (int) (short) 10, 10);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 20");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00034");
        java.io.PrintWriter printWriter1 = new java.io.PrintWriter("fr");
        printWriter1.print("it_IT");
        java.lang.Object[] objArray5 = new java.lang.Object[] {};
        java.io.PrintWriter printWriter6 = printWriter1.printf("fr", objArray5);
        // The following exception was thrown during execution in test generation
        try {
            printWriter1.write("hi!", (int) '4', (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 87");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray5), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray5), "[]");
        org.junit.Assert.assertNotNull(printWriter6);
    }

    @Test
    public void test00035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00035");
        java.io.PrintWriter printWriter1 = new java.io.PrintWriter("fr");
        printWriter1.print("it_IT");
        java.lang.Object[] objArray5 = new java.lang.Object[] {};
        java.io.PrintWriter printWriter6 = printWriter1.printf("fr", objArray5);
        // The following exception was thrown during execution in test generation
        try {
            printWriter6.write("fr", (int) (short) 0, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 10");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray5), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray5), "[]");
        org.junit.Assert.assertNotNull(printWriter6);
    }

    @Test
    public void test00036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00036");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.LanguageRange languageRange2 = new java.util.Locale.LanguageRange("Italy", 100.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: weight=100.0");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00037");
        java.util.Locale locale0 = java.util.Locale.JAPANESE;
        java.util.Locale locale1 = java.util.Locale.JAPANESE;
        java.lang.String str2 = locale0.getDisplayCountry(locale1);
        boolean boolean3 = locale1.hasExtensions();
        java.util.Locale.setDefault(locale1);
        java.lang.Object obj5 = locale1.clone();
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "ja");
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "ja");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(obj5);
        org.junit.Assert.assertEquals(obj5.toString(), "ja");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj5), "ja");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj5), "ja");
    }

    @Test
    public void test00038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00038");
        java.util.Locale locale0 = java.util.Locale.CHINESE;
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "zh");
    }

    @Test
    public void test00039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00039");
        java.util.Locale locale0 = java.util.Locale.FRENCH;
        java.util.Set<java.lang.String> strSet1 = locale0.getUnicodeLocaleKeys();
        java.lang.String str2 = locale0.getVariant();
        java.lang.Object obj3 = locale0.clone();
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "fr");
        org.junit.Assert.assertNotNull(strSet1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertNotNull(obj3);
        org.junit.Assert.assertEquals(obj3.toString(), "fr");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj3), "fr");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj3), "fr");
    }

    @Test
    public void test00040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00040");
        java.io.PrintWriter printWriter1 = new java.io.PrintWriter("fr");
        printWriter1.print("it_IT");
        java.util.Locale locale4 = java.util.Locale.ROOT;
        boolean boolean5 = locale4.hasExtensions();
        java.util.Locale locale6 = java.util.Locale.ROOT;
        java.lang.String str7 = locale4.getDisplayName(locale6);
        java.util.Locale locale8 = java.util.Locale.ROOT;
        boolean boolean9 = locale8.hasExtensions();
        java.lang.String str10 = locale4.getDisplayCountry(locale8);
        java.lang.Object[] objArray13 = new java.lang.Object[] {};
        org.apache.commons.math.MathException mathException14 = new org.apache.commons.math.MathException("hi!", objArray13);
        java.io.PrintWriter printWriter15 = printWriter1.printf(locale8, "it_IT", objArray13);
        printWriter1.println();
        char[] charArray21 = new char[] { 'a', 'u', '4', '4' };
        // The following exception was thrown during execution in test generation
        try {
            printWriter1.write(charArray21, (int) (short) 100, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(locale6);
        org.junit.Assert.assertEquals(locale6.toString(), "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(locale8);
        org.junit.Assert.assertEquals(locale8.toString(), "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(objArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray13), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray13), "[]");
        org.junit.Assert.assertNotNull(printWriter15);
        org.junit.Assert.assertNotNull(charArray21);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray21), "au44");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray21), "au44");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray21), "[a, u, 4, 4]");
    }

    @Test
    public void test00041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00041");
        java.io.File file0 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.io.PrintWriter printWriter1 = new java.io.PrintWriter(file0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00042");
        java.io.PrintWriter printWriter1 = new java.io.PrintWriter("fr");
        java.io.PrintWriter printWriter3 = printWriter1.append(' ');
        char[] charArray6 = new char[] { 'x', 'a' };
        printWriter3.print(charArray6);
        char[] charArray8 = null;
        // The following exception was thrown during execution in test generation
        try {
            printWriter3.write(charArray8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(printWriter3);
        org.junit.Assert.assertNotNull(charArray6);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray6), "xa");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray6), "xa");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray6), "[x, a]");
    }

    @Test
    public void test00043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00043");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.LanguageRange languageRange2 = new java.util.Locale.LanguageRange("Italy", (double) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: weight=52.0");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00044");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.LanguageRange languageRange2 = new java.util.Locale.LanguageRange("en-GB", (double) (-1L));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: weight=-1.0");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00045");
        java.util.Locale locale2 = new java.util.Locale("fr", "fr");
        java.lang.Class<?> wildcardClass3 = locale2.getClass();
        org.junit.Assert.assertEquals(locale2.toString(), "fr_FR");
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test00046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00046");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder2 = builder0.setLanguage("it_IT");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed language: it_IT [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00047");
        java.io.OutputStream outputStream0 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.io.PrintStream printStream2 = new java.io.PrintStream(outputStream0, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Null output stream");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00048");
        java.util.Locale.LanguageRange[] languageRangeArray0 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList1 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList1, languageRangeArray0);
        java.lang.String[] strArray8 = new java.lang.String[] { "fr", "", "Italy", "", "fr" };
        java.util.ArrayList<java.lang.String> strList9 = new java.util.ArrayList<java.lang.String>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList9, strArray8);
        java.util.List<java.lang.String> strList11 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList1, (java.util.Collection<java.lang.String>) strList9);
        java.lang.Class<?> wildcardClass12 = strList9.getClass();
        org.junit.Assert.assertNotNull(languageRangeArray0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(strList11);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test00049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00049");
        java.io.File file0 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.io.PrintStream printStream2 = new java.io.PrintStream(file0, "fr");
            org.junit.Assert.fail("Expected exception of type java.io.UnsupportedEncodingException; message: fr");
        } catch (java.io.UnsupportedEncodingException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00050");
        java.io.OutputStream outputStream0 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.io.PrintWriter printWriter2 = new java.io.PrintWriter(outputStream0, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00051");
        java.io.File file0 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.io.PrintWriter printWriter2 = new java.io.PrintWriter(file0, "hi!");
            org.junit.Assert.fail("Expected exception of type java.io.UnsupportedEncodingException; message: hi!");
        } catch (java.io.UnsupportedEncodingException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00052");
        java.io.PrintWriter printWriter1 = new java.io.PrintWriter("fr");
        java.io.PrintWriter printWriter3 = printWriter1.append(' ');
        char[] charArray6 = new char[] { 'x', 'a' };
        printWriter3.print(charArray6);
        // The following exception was thrown during execution in test generation
        try {
            printWriter3.write("en-GB", (int) 'u', 10);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 127");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(printWriter3);
        org.junit.Assert.assertNotNull(charArray6);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray6), "xa");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray6), "xa");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray6), "[x, a]");
    }

    @Test
    public void test00053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00053");
        java.io.OutputStream outputStream0 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.io.PrintWriter printWriter2 = new java.io.PrintWriter(outputStream0, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00054");
        java.util.Locale locale0 = java.util.Locale.SIMPLIFIED_CHINESE;
        java.lang.String str1 = locale0.toString();
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "zh_CN" + "'", str1, "zh_CN");
    }

    @Test
    public void test00055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00055");
        // The following exception was thrown during execution in test generation
        try {
            java.io.PrintWriter printWriter2 = new java.io.PrintWriter("fr", "");
            org.junit.Assert.fail("Expected exception of type java.io.UnsupportedEncodingException; message: ");
        } catch (java.io.UnsupportedEncodingException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00056");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl((int) (byte) 0, (int) 'a', (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: number of successes must be less than or equal to population size");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00057");
        java.util.Locale locale0 = java.util.Locale.JAPANESE;
        java.util.Locale locale1 = java.util.Locale.JAPANESE;
        java.lang.String str2 = locale0.getDisplayCountry(locale1);
        java.lang.String str3 = locale0.getVariant();
        java.util.Locale locale4 = java.util.Locale.CANADA;
        java.lang.String str5 = locale0.getDisplayScript(locale4);
        java.util.Locale locale8 = new java.util.Locale("Italy", "Italy");
        java.lang.String str9 = locale4.getDisplayLanguage(locale8);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str10 = locale8.getISO3Country();
            org.junit.Assert.fail("Expected exception of type java.util.MissingResourceException; message: Couldn't find 3-letter country code for ITALY");
        } catch (java.util.MissingResourceException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "ja");
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "ja");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "en_CA");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals(locale8.toString(), "italy_ITALY");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "English" + "'", str9, "English");
    }

    @Test
    public void test00058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00058");
        java.io.PrintWriter printWriter1 = new java.io.PrintWriter("fr");
        printWriter1.print("it_IT");
        java.util.Locale locale4 = java.util.Locale.ROOT;
        boolean boolean5 = locale4.hasExtensions();
        java.util.Locale locale6 = java.util.Locale.ROOT;
        java.lang.String str7 = locale4.getDisplayName(locale6);
        java.util.Locale locale8 = java.util.Locale.ROOT;
        boolean boolean9 = locale8.hasExtensions();
        java.lang.String str10 = locale4.getDisplayCountry(locale8);
        java.lang.Object[] objArray13 = new java.lang.Object[] {};
        org.apache.commons.math.MathException mathException14 = new org.apache.commons.math.MathException("hi!", objArray13);
        java.io.PrintWriter printWriter15 = printWriter1.printf(locale8, "it_IT", objArray13);
        printWriter15.print((double) 100L);
        char[] charArray20 = new char[] { '#', 'x' };
        // The following exception was thrown during execution in test generation
        try {
            printWriter15.write(charArray20, 10, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(locale6);
        org.junit.Assert.assertEquals(locale6.toString(), "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(locale8);
        org.junit.Assert.assertEquals(locale8.toString(), "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(objArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray13), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray13), "[]");
        org.junit.Assert.assertNotNull(printWriter15);
        org.junit.Assert.assertNotNull(charArray20);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray20), "#x");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray20), "#x");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray20), "[#, x]");
    }

    @Test
    public void test00059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00059");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder2 = builder0.setScript("ita");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed script: ita [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00060");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl((int) 'u', (int) (byte) 1, (int) '#');
        // The following exception was thrown during execution in test generation
        try {
            double double6 = hypergeometricDistributionImpl3.cumulativeProbability((double) ' ', 10.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: lower endpoint must be less than or equal to upper endpoint");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00061");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl((int) ' ', 1, (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: sample size must be less than or equal to population size");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00062");
        // The following exception was thrown during execution in test generation
        try {
            java.io.PrintStream printStream2 = new java.io.PrintStream("ja", "hi!");
            org.junit.Assert.fail("Expected exception of type java.io.UnsupportedEncodingException; message: hi!");
        } catch (java.io.UnsupportedEncodingException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00063");
        java.io.PrintStream printStream1 = new java.io.PrintStream("zh_CN");
        printStream1.print((float) (byte) -1);
        printStream1.println();
        printStream1.println();
        java.io.PrintStream printStream7 = new java.io.PrintStream((java.io.OutputStream) printStream1, true);
        // The following exception was thrown during execution in test generation
        try {
            java.io.PrintStream printStream10 = new java.io.PrintStream((java.io.OutputStream) printStream1, true, "italien (Italie)");
            org.junit.Assert.fail("Expected exception of type java.io.UnsupportedEncodingException; message: italien (Italie)");
        } catch (java.io.UnsupportedEncodingException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00064");
        // The following exception was thrown during execution in test generation
        try {
            java.io.PrintWriter printWriter2 = new java.io.PrintWriter("English", "");
            org.junit.Assert.fail("Expected exception of type java.io.UnsupportedEncodingException; message: ");
        } catch (java.io.UnsupportedEncodingException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00065");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl((int) 'u', (int) (byte) 1, (int) '#');
        int int4 = hypergeometricDistributionImpl3.getPopulationSize();
        // The following exception was thrown during execution in test generation
        try {
            double double7 = hypergeometricDistributionImpl3.cumulativeProbability((double) 10, (double) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: lower endpoint must be less than or equal to upper endpoint");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 117 + "'", int4 == 117);
    }

    @Test
    public void test00066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00066");
        java.io.PrintStream printStream1 = new java.io.PrintStream("zh_CN");
        printStream1.println();
        java.io.PrintStream printStream4 = printStream1.append('#');
        printStream1.close();
        // The following exception was thrown during execution in test generation
        try {
            java.io.PrintStream printStream9 = printStream1.append((java.lang.CharSequence) "Italy", 117, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 100");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(printStream4);
    }

    @Test
    public void test00067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00067");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clearExtensions();
        java.util.Locale.Builder builder3 = builder0.setScript("");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder5 = builder0.setScript("italien (Italie)");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed script: italien (Italie) [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(builder3);
    }

    @Test
    public void test00068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00068");
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<java.util.Locale.LanguageRange> languageRangeList2 = java.util.Locale.LanguageRange.parse("hi!", strMap1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: range=hi!");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00069");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clearExtensions();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder3 = builder0.removeUnicodeLocaleAttribute("zh_CN");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed Unicode locale attribute: zh_CN [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder1);
    }

    @Test
    public void test00070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00070");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clearExtensions();
        java.util.Locale.Builder builder3 = builder0.setScript("");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder5 = builder0.addUnicodeLocaleAttribute("en-GB");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed Unicode locale attribute: en-GB [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(builder3);
    }

    @Test
    public void test00071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00071");
        java.io.PrintWriter printWriter1 = new java.io.PrintWriter("fr");
        java.io.PrintWriter printWriter3 = printWriter1.append(' ');
        char[] charArray7 = new char[] { 'u', ' ', ' ' };
        // The following exception was thrown during execution in test generation
        try {
            printWriter1.write(charArray7, (int) (byte) -1, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(printWriter3);
        org.junit.Assert.assertNotNull(charArray7);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray7), "u  ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray7), "u  ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray7), "[u,  ,  ]");
    }

    @Test
    public void test00072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00072");
        java.util.Locale locale1 = new java.util.Locale("Italy");
        java.lang.Object obj2 = new java.lang.Object();
        boolean boolean3 = locale1.equals(obj2);
        org.junit.Assert.assertEquals(locale1.toString(), "italy");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test00073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00073");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.LanguageRange languageRange2 = new java.util.Locale.LanguageRange("zh_CN", (double) (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: weight=-1.0");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00074");
        java.util.List<java.util.Locale.LanguageRange> languageRangeList0 = null;
        java.util.Locale.LanguageRange[] languageRangeArray1 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList2 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList2, languageRangeArray1);
        java.lang.String[] strArray7 = new java.lang.String[] { "", "Italy", "fr" };
        java.util.ArrayList<java.lang.String> strList8 = new java.util.ArrayList<java.lang.String>();
        boolean boolean9 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList8, strArray7);
        java.util.List<java.lang.String> strList10 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList2, (java.util.Collection<java.lang.String>) strList8);
        java.util.Locale.LanguageRange[] languageRangeArray11 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList12 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean13 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList12, languageRangeArray11);
        java.util.Collection<java.util.Locale> localeCollection14 = null;
        java.util.Locale locale15 = java.util.Locale.lookup((java.util.List<java.util.Locale.LanguageRange>) languageRangeList12, localeCollection14);
        java.lang.String[] strArray21 = new java.lang.String[] { "hi!", "", "it_IT", "Italy", "" };
        java.util.ArrayList<java.lang.String> strList22 = new java.util.ArrayList<java.lang.String>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList22, strArray21);
        java.util.List<java.lang.String> strList24 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList12, (java.util.Collection<java.lang.String>) strList22);
        java.util.List<java.lang.String> strList25 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList2, (java.util.Collection<java.lang.String>) strList24);
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<java.lang.String> strList26 = java.util.Locale.filterTags(languageRangeList0, (java.util.Collection<java.lang.String>) strList24);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(languageRangeArray1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(strList10);
        org.junit.Assert.assertNotNull(languageRangeArray11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNull(locale15);
        org.junit.Assert.assertNotNull(strArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertNotNull(strList24);
        org.junit.Assert.assertNotNull(strList25);
    }

    @Test
    public void test00075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00075");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl((int) 'u', (int) (byte) 1, (int) '#');
        hypergeometricDistributionImpl3.setPopulationSize(117);
        // The following exception was thrown during execution in test generation
        try {
            hypergeometricDistributionImpl3.setPopulationSize((int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: population size must be positive.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00076");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clearExtensions();
        java.util.Locale.Builder builder2 = builder1.clearExtensions();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder4 = builder2.removeUnicodeLocaleAttribute("");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed Unicode locale attribute:  [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(builder2);
    }

    @Test
    public void test00077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00077");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl((int) 'u', (int) (byte) 1, (int) '#');
        double double5 = hypergeometricDistributionImpl3.probability((double) 100.0f);
        // The following exception was thrown during execution in test generation
        try {
            int int7 = hypergeometricDistributionImpl3.inverseCumulativeProbability((double) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: p must be between 0 and 1.0 (inclusive)");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
    }

    @Test
    public void test00078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00078");
        java.io.PrintWriter printWriter1 = new java.io.PrintWriter("fr");
        java.io.PrintWriter printWriter3 = new java.io.PrintWriter("fr");
        printWriter3.print("it_IT");
        java.util.Locale locale7 = java.util.Locale.forLanguageTag("");
        java.lang.Object[] objArray10 = new java.lang.Object[] {};
        org.apache.commons.math.MathException mathException11 = new org.apache.commons.math.MathException("hi!", objArray10);
        java.lang.Throwable[] throwableArray12 = mathException11.getSuppressed();
        java.lang.Throwable[] throwableArray13 = mathException11.getSuppressed();
        java.io.PrintWriter printWriter14 = printWriter3.printf(locale7, "it_IT", (java.lang.Object[]) throwableArray13);
        java.io.PrintWriter printWriter17 = new java.io.PrintWriter("fr");
        printWriter17.print("it_IT");
        java.util.Locale locale20 = java.util.Locale.ROOT;
        boolean boolean21 = locale20.hasExtensions();
        java.util.Locale locale22 = java.util.Locale.ROOT;
        java.lang.String str23 = locale20.getDisplayName(locale22);
        java.util.Locale locale24 = java.util.Locale.ROOT;
        boolean boolean25 = locale24.hasExtensions();
        java.lang.String str26 = locale20.getDisplayCountry(locale24);
        java.lang.Object[] objArray29 = new java.lang.Object[] {};
        org.apache.commons.math.MathException mathException30 = new org.apache.commons.math.MathException("hi!", objArray29);
        java.io.PrintWriter printWriter31 = printWriter17.printf(locale24, "it_IT", objArray29);
        java.io.PrintWriter printWriter32 = printWriter1.printf(locale7, "fr", objArray29);
        java.util.Locale locale33 = java.util.Locale.FRENCH;
        java.util.Set<java.lang.String> strSet34 = locale33.getUnicodeLocaleKeys();
        java.util.Set<java.lang.String> strSet35 = locale33.getUnicodeLocaleAttributes();
        java.util.Set<java.lang.String> strSet36 = locale33.getUnicodeLocaleKeys();
        java.lang.String str38 = locale33.getExtension('x');
        boolean boolean39 = locale7.equals((java.lang.Object) 'x');
        org.junit.Assert.assertNotNull(locale7);
        org.junit.Assert.assertEquals(locale7.toString(), "");
        org.junit.Assert.assertNotNull(objArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray10), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray10), "[]");
        org.junit.Assert.assertNotNull(throwableArray12);
        org.junit.Assert.assertNotNull(throwableArray13);
        org.junit.Assert.assertNotNull(printWriter14);
        org.junit.Assert.assertNotNull(locale20);
        org.junit.Assert.assertEquals(locale20.toString(), "");
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(locale22);
        org.junit.Assert.assertEquals(locale22.toString(), "");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertNotNull(locale24);
        org.junit.Assert.assertEquals(locale24.toString(), "");
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
        org.junit.Assert.assertNotNull(objArray29);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray29), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray29), "[]");
        org.junit.Assert.assertNotNull(printWriter31);
        org.junit.Assert.assertNotNull(printWriter32);
        org.junit.Assert.assertNotNull(locale33);
        org.junit.Assert.assertEquals(locale33.toString(), "fr");
        org.junit.Assert.assertNotNull(strSet34);
        org.junit.Assert.assertNotNull(strSet35);
        org.junit.Assert.assertNotNull(strSet36);
        org.junit.Assert.assertNull(str38);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
    }

    @Test
    public void test00079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00079");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl((int) 'u', (int) (byte) 1, (int) '#');
        int int4 = hypergeometricDistributionImpl3.getPopulationSize();
        double double6 = hypergeometricDistributionImpl3.cumulativeProbability((int) (short) 100);
        // The following exception was thrown during execution in test generation
        try {
            int int8 = hypergeometricDistributionImpl3.inverseCumulativeProbability((double) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: p must be between 0 and 1.0 (inclusive)");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 117 + "'", int4 == 117);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0d + "'", double6 == 1.0d);
    }

    @Test
    public void test00080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00080");
        java.util.Locale locale0 = java.util.Locale.ROOT;
        boolean boolean1 = locale0.hasExtensions();
        java.util.Locale locale2 = java.util.Locale.ROOT;
        java.lang.String str3 = locale0.getDisplayName(locale2);
        java.util.Locale locale4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str5 = locale0.getDisplayName(locale4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test00081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00081");
        java.util.Locale locale0 = java.util.Locale.FRANCE;
        java.util.Locale.setDefault(locale0);
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "fr_FR");
    }

    @Test
    public void test00082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00082");
        java.io.PrintWriter printWriter1 = new java.io.PrintWriter("fr");
        printWriter1.println();
        printWriter1.write(117);
    }

    @Test
    public void test00083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00083");
        java.io.PrintStream printStream1 = new java.io.PrintStream("zh_CN");
        printStream1.print((float) (byte) -1);
        printStream1.println();
        printStream1.print("ita");
        // The following exception was thrown during execution in test generation
        try {
            java.io.PrintStream printStream9 = new java.io.PrintStream((java.io.OutputStream) printStream1, false, "zh_CN");
            org.junit.Assert.fail("Expected exception of type java.io.UnsupportedEncodingException; message: zh_CN");
        } catch (java.io.UnsupportedEncodingException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00084");
        java.io.PrintWriter printWriter1 = new java.io.PrintWriter("fr");
        printWriter1.print("it_IT");
        java.util.Locale locale5 = java.util.Locale.forLanguageTag("");
        java.lang.Object[] objArray8 = new java.lang.Object[] {};
        org.apache.commons.math.MathException mathException9 = new org.apache.commons.math.MathException("hi!", objArray8);
        java.lang.Throwable[] throwableArray10 = mathException9.getSuppressed();
        java.lang.Throwable[] throwableArray11 = mathException9.getSuppressed();
        java.io.PrintWriter printWriter12 = printWriter1.printf(locale5, "it_IT", (java.lang.Object[]) throwableArray11);
        printWriter1.println((float) (byte) 10);
        java.io.PrintWriter printWriter16 = new java.io.PrintWriter("fr");
        printWriter16.write("hi!");
        printWriter1.println((java.lang.Object) printWriter16);
        java.io.PrintWriter printWriter21 = printWriter1.append('#');
        printWriter1.write((int) ' ');
        // The following exception was thrown during execution in test generation
        try {
            java.io.PrintWriter printWriter27 = printWriter1.append((java.lang.CharSequence) "", 100, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: -101");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(locale5);
        org.junit.Assert.assertEquals(locale5.toString(), "");
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray8), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray8), "[]");
        org.junit.Assert.assertNotNull(throwableArray10);
        org.junit.Assert.assertNotNull(throwableArray11);
        org.junit.Assert.assertNotNull(printWriter12);
        org.junit.Assert.assertNotNull(printWriter21);
    }

    @Test
    public void test00085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00085");
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<java.util.Locale.LanguageRange> languageRangeList2 = java.util.Locale.LanguageRange.parse("it_IT", strMap1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: range=it_it");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00086");
        java.io.PrintStream printStream1 = new java.io.PrintStream("zh_CN");
        printStream1.print((float) (byte) -1);
        char[] charArray6 = new char[] { 'x', 'u' };
        printStream1.println(charArray6);
        // The following exception was thrown during execution in test generation
        try {
            java.io.PrintStream printStream10 = new java.io.PrintStream((java.io.OutputStream) printStream1, true, "ita");
            org.junit.Assert.fail("Expected exception of type java.io.UnsupportedEncodingException; message: ita");
        } catch (java.io.UnsupportedEncodingException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray6);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray6), "xu");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray6), "xu");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray6), "[x, u]");
    }

    @Test
    public void test00087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00087");
        java.io.PrintStream printStream1 = new java.io.PrintStream("zh_CN");
        printStream1.print((float) (byte) -1);
        printStream1.println();
        printStream1.println();
        java.io.PrintStream printStream7 = new java.io.PrintStream((java.io.OutputStream) printStream1, true);
        java.io.PrintWriter printWriter9 = new java.io.PrintWriter("fr");
        printWriter9.print("it_IT");
        java.util.Locale locale12 = java.util.Locale.ROOT;
        boolean boolean13 = locale12.hasExtensions();
        java.util.Locale locale14 = java.util.Locale.ROOT;
        java.lang.String str15 = locale12.getDisplayName(locale14);
        java.util.Locale locale16 = java.util.Locale.ROOT;
        boolean boolean17 = locale16.hasExtensions();
        java.lang.String str18 = locale12.getDisplayCountry(locale16);
        java.lang.Object[] objArray21 = new java.lang.Object[] {};
        org.apache.commons.math.MathException mathException22 = new org.apache.commons.math.MathException("hi!", objArray21);
        java.io.PrintWriter printWriter23 = printWriter9.printf(locale16, "it_IT", objArray21);
        printStream7.println((java.lang.Object) "it_IT");
        java.io.PrintStream printStream26 = printStream7.append((java.lang.CharSequence) "fr");
        // The following exception was thrown during execution in test generation
        try {
            java.io.PrintStream printStream30 = printStream26.append((java.lang.CharSequence) "zh_CN", (int) (byte) 1, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: -1");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(locale12);
        org.junit.Assert.assertEquals(locale12.toString(), "");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(locale14);
        org.junit.Assert.assertEquals(locale14.toString(), "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertNotNull(locale16);
        org.junit.Assert.assertEquals(locale16.toString(), "");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertNotNull(objArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray21), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray21), "[]");
        org.junit.Assert.assertNotNull(printWriter23);
        org.junit.Assert.assertNotNull(printStream26);
    }

    @Test
    public void test00088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00088");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clearExtensions();
        java.util.Locale.Builder builder3 = builder0.setScript("");
        java.util.Locale.Builder builder5 = builder3.removeUnicodeLocaleAttribute("Italy");
        java.util.Locale.Builder builder6 = builder3.clearExtensions();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder8 = builder3.addUnicodeLocaleAttribute("ja");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed Unicode locale attribute: ja [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder6);
    }

    @Test
    public void test00089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00089");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl((int) 'u', (int) (byte) 1, (int) '#');
        int int4 = hypergeometricDistributionImpl3.getPopulationSize();
        // The following exception was thrown during execution in test generation
        try {
            double double7 = hypergeometricDistributionImpl3.cumulativeProbability(10, (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: lower endpoint must be less than or equal to upper endpoint");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 117 + "'", int4 == 117);
    }

    @Test
    public void test00090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00090");
        // The following exception was thrown during execution in test generation
        try {
            java.io.PrintStream printStream2 = new java.io.PrintStream("ITALY", "italien (Italie)");
            org.junit.Assert.fail("Expected exception of type java.io.UnsupportedEncodingException; message: italien (Italie)");
        } catch (java.io.UnsupportedEncodingException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00091");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl((int) 'u', (int) (byte) 1, (int) '#');
        int int4 = hypergeometricDistributionImpl3.getSampleSize();
        hypergeometricDistributionImpl3.setPopulationSize((int) 'u');
        // The following exception was thrown during execution in test generation
        try {
            int int8 = hypergeometricDistributionImpl3.inverseCumulativeProbability((double) (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: p must be between 0 and 1.0 (inclusive)");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 35 + "'", int4 == 35);
    }

    @Test
    public void test00092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00092");
        java.io.PrintStream printStream1 = new java.io.PrintStream("zh_CN");
        printStream1.println();
        java.lang.Class<?> wildcardClass3 = printStream1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test00093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00093");
        java.io.PrintWriter printWriter1 = new java.io.PrintWriter("fr");
        printWriter1.print("it_IT");
        java.util.Locale locale4 = java.util.Locale.ROOT;
        boolean boolean5 = locale4.hasExtensions();
        java.util.Locale locale6 = java.util.Locale.ROOT;
        java.lang.String str7 = locale4.getDisplayName(locale6);
        java.util.Locale locale8 = java.util.Locale.ROOT;
        boolean boolean9 = locale8.hasExtensions();
        java.lang.String str10 = locale4.getDisplayCountry(locale8);
        java.lang.Object[] objArray13 = new java.lang.Object[] {};
        org.apache.commons.math.MathException mathException14 = new org.apache.commons.math.MathException("hi!", objArray13);
        java.io.PrintWriter printWriter15 = printWriter1.printf(locale8, "it_IT", objArray13);
        printWriter1.println();
        printWriter1.print(10);
        java.io.PrintWriter printWriter22 = printWriter1.append((java.lang.CharSequence) "fr", (int) (short) 0, (int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            java.io.PrintWriter printWriter26 = printWriter22.append((java.lang.CharSequence) "italien (Italie)", (int) '4', (int) 'u');
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 117");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(locale6);
        org.junit.Assert.assertEquals(locale6.toString(), "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(locale8);
        org.junit.Assert.assertEquals(locale8.toString(), "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(objArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray13), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray13), "[]");
        org.junit.Assert.assertNotNull(printWriter15);
        org.junit.Assert.assertNotNull(printWriter22);
    }

    @Test
    public void test00094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00094");
        java.util.Locale locale0 = java.util.Locale.JAPANESE;
        java.util.Locale locale1 = java.util.Locale.JAPANESE;
        java.lang.String str2 = locale0.getDisplayCountry(locale1);
        java.lang.String str3 = locale0.getVariant();
        java.lang.String str4 = locale0.getCountry();
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl8 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl((int) 'u', (int) (byte) 1, (int) '#');
        int int9 = hypergeometricDistributionImpl8.getPopulationSize();
        double double11 = hypergeometricDistributionImpl8.cumulativeProbability((int) (short) 100);
        hypergeometricDistributionImpl8.setNumberOfSuccesses(0);
        boolean boolean14 = locale0.equals((java.lang.Object) 0);
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "ja");
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "ja");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 117 + "'", int9 == 117);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 1.0d + "'", double11 == 1.0d);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test00095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00095");
        java.io.File file0 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.io.PrintWriter printWriter2 = new java.io.PrintWriter(file0, "");
            org.junit.Assert.fail("Expected exception of type java.io.UnsupportedEncodingException; message: ");
        } catch (java.io.UnsupportedEncodingException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00096");
        java.io.PrintWriter printWriter1 = new java.io.PrintWriter("fr");
        printWriter1.print("it_IT");
        java.util.Locale locale5 = java.util.Locale.forLanguageTag("");
        java.lang.Object[] objArray8 = new java.lang.Object[] {};
        org.apache.commons.math.MathException mathException9 = new org.apache.commons.math.MathException("hi!", objArray8);
        java.lang.Throwable[] throwableArray10 = mathException9.getSuppressed();
        java.lang.Throwable[] throwableArray11 = mathException9.getSuppressed();
        java.io.PrintWriter printWriter12 = printWriter1.printf(locale5, "it_IT", (java.lang.Object[]) throwableArray11);
        java.lang.String str13 = locale5.getLanguage();
        java.util.Set<java.lang.String> strSet14 = locale5.getUnicodeLocaleAttributes();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str16 = locale5.getExtension(' ');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Ill-formed extension key:  ");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(locale5);
        org.junit.Assert.assertEquals(locale5.toString(), "");
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray8), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray8), "[]");
        org.junit.Assert.assertNotNull(throwableArray10);
        org.junit.Assert.assertNotNull(throwableArray11);
        org.junit.Assert.assertNotNull(printWriter12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNotNull(strSet14);
    }

    @Test
    public void test00097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00097");
        java.io.PrintWriter printWriter1 = new java.io.PrintWriter("fr");
        java.io.PrintWriter printWriter3 = printWriter1.append(' ');
        printWriter3.println((int) (short) 1);
        printWriter3.println(false);
        char[] charArray11 = new char[] { ' ', ' ', 'a' };
        // The following exception was thrown during execution in test generation
        try {
            printWriter3.write(charArray11, 117, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(printWriter3);
        org.junit.Assert.assertNotNull(charArray11);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray11), "  a");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray11), "  a");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray11), "[ ,  , a]");
    }

    @Test
    public void test00098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00098");
        // The following exception was thrown during execution in test generation
        try {
            java.io.PrintStream printStream2 = new java.io.PrintStream("zh_CN", "zh_CN");
            org.junit.Assert.fail("Expected exception of type java.io.UnsupportedEncodingException; message: zh_CN");
        } catch (java.io.UnsupportedEncodingException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00099");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl((int) '#', (int) (byte) 0, 117);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: sample size must be less than or equal to population size");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00100");
        java.io.PrintStream printStream1 = new java.io.PrintStream("zh_CN");
        printStream1.print((float) (byte) -1);
        printStream1.println();
        printStream1.println();
        // The following exception was thrown during execution in test generation
        try {
            java.io.PrintStream printStream9 = printStream1.append((java.lang.CharSequence) "ita", (int) 'a', (int) 'u');
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 117");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00101");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl((int) 'u', (int) (byte) 1, (int) '#');
        int int4 = hypergeometricDistributionImpl3.getPopulationSize();
        double double6 = hypergeometricDistributionImpl3.cumulativeProbability((int) (short) 100);
        int int7 = hypergeometricDistributionImpl3.getPopulationSize();
        // The following exception was thrown during execution in test generation
        try {
            hypergeometricDistributionImpl3.setSampleSize((int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: sample size must be non-negative.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 117 + "'", int4 == 117);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0d + "'", double6 == 1.0d);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 117 + "'", int7 == 117);
    }

    @Test
    public void test00102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00102");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder2 = builder0.setLanguageTag("ita");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder4 = builder0.removeUnicodeLocaleAttribute("fr");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed Unicode locale attribute: fr [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder2);
    }

    @Test
    public void test00103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00103");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl((int) 'u', (int) (byte) 1, (int) '#');
        int int4 = hypergeometricDistributionImpl3.getPopulationSize();
        double double6 = hypergeometricDistributionImpl3.cumulativeProbability((double) (short) -1);
        double double8 = hypergeometricDistributionImpl3.probability((double) (short) 100);
        int int9 = hypergeometricDistributionImpl3.getPopulationSize();
        // The following exception was thrown during execution in test generation
        try {
            hypergeometricDistributionImpl3.setNumberOfSuccesses((-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: number of successes must be non-negative.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 117 + "'", int4 == 117);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 117 + "'", int9 == 117);
    }

    @Test
    public void test00104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00104");
        java.io.PrintWriter printWriter1 = new java.io.PrintWriter("fr");
        java.io.PrintWriter printWriter3 = printWriter1.append(' ');
        printWriter3.println((int) (short) 1);
        printWriter3.println(false);
        java.io.PrintStream printStream9 = new java.io.PrintStream("zh_CN");
        printStream9.print((float) (byte) -1);
        printStream9.println();
        printStream9.println();
        java.io.PrintStream printStream15 = new java.io.PrintStream((java.io.OutputStream) printStream9, true);
        java.io.PrintWriter printWriter17 = new java.io.PrintWriter("fr");
        java.io.PrintWriter printWriter19 = printWriter17.append(' ');
        java.io.PrintWriter printWriter22 = new java.io.PrintWriter("fr");
        printWriter22.print("it_IT");
        java.util.Locale locale25 = java.util.Locale.ROOT;
        boolean boolean26 = locale25.hasExtensions();
        java.util.Locale locale27 = java.util.Locale.ROOT;
        java.lang.String str28 = locale25.getDisplayName(locale27);
        java.util.Locale locale29 = java.util.Locale.ROOT;
        boolean boolean30 = locale29.hasExtensions();
        java.lang.String str31 = locale25.getDisplayCountry(locale29);
        java.lang.Object[] objArray34 = new java.lang.Object[] {};
        org.apache.commons.math.MathException mathException35 = new org.apache.commons.math.MathException("hi!", objArray34);
        java.io.PrintWriter printWriter36 = printWriter22.printf(locale29, "it_IT", objArray34);
        java.io.PrintWriter printWriter39 = new java.io.PrintWriter("fr");
        printWriter39.print("it_IT");
        java.util.Locale locale43 = java.util.Locale.forLanguageTag("");
        java.lang.Object[] objArray46 = new java.lang.Object[] {};
        org.apache.commons.math.MathException mathException47 = new org.apache.commons.math.MathException("hi!", objArray46);
        java.lang.Throwable[] throwableArray48 = mathException47.getSuppressed();
        java.lang.Throwable[] throwableArray49 = mathException47.getSuppressed();
        java.io.PrintWriter printWriter50 = printWriter39.printf(locale43, "it_IT", (java.lang.Object[]) throwableArray49);
        java.io.PrintWriter printWriter51 = printWriter22.format("it_IT", (java.lang.Object[]) throwableArray49);
        java.io.PrintWriter printWriter52 = printWriter19.format("zh_CN", (java.lang.Object[]) throwableArray49);
        java.io.PrintStream printStream54 = new java.io.PrintStream("zh_CN");
        printStream54.print((float) (byte) -1);
        char[] charArray59 = new char[] { 'x', 'u' };
        printStream54.println(charArray59);
        printWriter52.print(charArray59);
        printStream9.print(charArray59);
        // The following exception was thrown during execution in test generation
        try {
            printWriter3.write(charArray59, (int) (short) -1, 35);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(printWriter3);
        org.junit.Assert.assertNotNull(printWriter19);
        org.junit.Assert.assertNotNull(locale25);
        org.junit.Assert.assertEquals(locale25.toString(), "");
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(locale27);
        org.junit.Assert.assertEquals(locale27.toString(), "");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "" + "'", str28, "");
        org.junit.Assert.assertNotNull(locale29);
        org.junit.Assert.assertEquals(locale29.toString(), "");
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "" + "'", str31, "");
        org.junit.Assert.assertNotNull(objArray34);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray34), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray34), "[]");
        org.junit.Assert.assertNotNull(printWriter36);
        org.junit.Assert.assertNotNull(locale43);
        org.junit.Assert.assertEquals(locale43.toString(), "");
        org.junit.Assert.assertNotNull(objArray46);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray46), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray46), "[]");
        org.junit.Assert.assertNotNull(throwableArray48);
        org.junit.Assert.assertNotNull(throwableArray49);
        org.junit.Assert.assertNotNull(printWriter50);
        org.junit.Assert.assertNotNull(printWriter51);
        org.junit.Assert.assertNotNull(printWriter52);
        org.junit.Assert.assertNotNull(charArray59);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray59), "xu");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray59), "xu");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray59), "[x, u]");
    }

    @Test
    public void test00105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00105");
        java.util.List<java.util.Locale.LanguageRange> languageRangeList0 = null;
        java.util.Locale.LanguageRange[] languageRangeArray1 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList2 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList2, languageRangeArray1);
        java.util.Collection<java.util.Locale> localeCollection4 = null;
        java.util.Locale locale5 = java.util.Locale.lookup((java.util.List<java.util.Locale.LanguageRange>) languageRangeList2, localeCollection4);
        java.lang.String[] strArray7 = new java.lang.String[] { "hi!" };
        java.util.ArrayList<java.lang.String> strList8 = new java.util.ArrayList<java.lang.String>();
        boolean boolean9 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList8, strArray7);
        java.lang.String str10 = java.util.Locale.lookupTag((java.util.List<java.util.Locale.LanguageRange>) languageRangeList2, (java.util.Collection<java.lang.String>) strList8);
        java.util.Locale locale11 = java.util.Locale.ROOT;
        boolean boolean12 = locale11.hasExtensions();
        java.lang.String str13 = locale11.getCountry();
        java.util.Locale locale14 = java.util.Locale.JAPAN;
        java.util.Locale locale15 = java.util.Locale.FRENCH;
        java.util.Locale locale19 = new java.util.Locale("", "", "");
        java.util.Locale[] localeArray20 = new java.util.Locale[] { locale11, locale14, locale15, locale19 };
        java.util.ArrayList<java.util.Locale> localeList21 = new java.util.ArrayList<java.util.Locale>();
        boolean boolean22 = java.util.Collections.addAll((java.util.Collection<java.util.Locale>) localeList21, localeArray20);
        java.util.List<java.util.Locale> localeList23 = java.util.Locale.filter((java.util.List<java.util.Locale.LanguageRange>) languageRangeList2, (java.util.Collection<java.util.Locale>) localeList21);
        java.util.Locale.LanguageRange[] languageRangeArray24 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList25 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean26 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList25, languageRangeArray24);
        java.util.Collection<java.util.Locale> localeCollection27 = null;
        java.util.Locale locale28 = java.util.Locale.lookup((java.util.List<java.util.Locale.LanguageRange>) languageRangeList25, localeCollection27);
        java.lang.String[] strArray30 = new java.lang.String[] { "hi!" };
        java.util.ArrayList<java.lang.String> strList31 = new java.util.ArrayList<java.lang.String>();
        boolean boolean32 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList31, strArray30);
        java.lang.String str33 = java.util.Locale.lookupTag((java.util.List<java.util.Locale.LanguageRange>) languageRangeList25, (java.util.Collection<java.lang.String>) strList31);
        java.util.Locale locale34 = java.util.Locale.ROOT;
        boolean boolean35 = locale34.hasExtensions();
        java.lang.String str36 = locale34.getCountry();
        java.util.Locale locale37 = java.util.Locale.JAPAN;
        java.util.Locale locale38 = java.util.Locale.FRENCH;
        java.util.Locale locale42 = new java.util.Locale("", "", "");
        java.util.Locale[] localeArray43 = new java.util.Locale[] { locale34, locale37, locale38, locale42 };
        java.util.ArrayList<java.util.Locale> localeList44 = new java.util.ArrayList<java.util.Locale>();
        boolean boolean45 = java.util.Collections.addAll((java.util.Collection<java.util.Locale>) localeList44, localeArray43);
        java.util.List<java.util.Locale> localeList46 = java.util.Locale.filter((java.util.List<java.util.Locale.LanguageRange>) languageRangeList25, (java.util.Collection<java.util.Locale>) localeList44);
        java.util.List<java.util.Locale> localeList47 = java.util.Locale.filter((java.util.List<java.util.Locale.LanguageRange>) languageRangeList2, (java.util.Collection<java.util.Locale>) localeList46);
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap48 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList49 = java.util.Locale.LanguageRange.mapEquivalents((java.util.List<java.util.Locale.LanguageRange>) languageRangeList2, strMap48);
        java.util.Locale.LanguageRange[] languageRangeArray50 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList51 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean52 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList51, languageRangeArray50);
        java.util.Collection<java.util.Locale> localeCollection53 = null;
        java.util.Locale locale54 = java.util.Locale.lookup((java.util.List<java.util.Locale.LanguageRange>) languageRangeList51, localeCollection53);
        java.lang.String[] strArray56 = new java.lang.String[] { "hi!" };
        java.util.ArrayList<java.lang.String> strList57 = new java.util.ArrayList<java.lang.String>();
        boolean boolean58 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList57, strArray56);
        java.lang.String str59 = java.util.Locale.lookupTag((java.util.List<java.util.Locale.LanguageRange>) languageRangeList51, (java.util.Collection<java.lang.String>) strList57);
        java.util.Locale locale60 = java.util.Locale.ROOT;
        boolean boolean61 = locale60.hasExtensions();
        java.lang.String str62 = locale60.getCountry();
        java.util.Locale locale63 = java.util.Locale.JAPAN;
        java.util.Locale locale64 = java.util.Locale.FRENCH;
        java.util.Locale locale68 = new java.util.Locale("", "", "");
        java.util.Locale[] localeArray69 = new java.util.Locale[] { locale60, locale63, locale64, locale68 };
        java.util.ArrayList<java.util.Locale> localeList70 = new java.util.ArrayList<java.util.Locale>();
        boolean boolean71 = java.util.Collections.addAll((java.util.Collection<java.util.Locale>) localeList70, localeArray69);
        java.util.List<java.util.Locale> localeList72 = java.util.Locale.filter((java.util.List<java.util.Locale.LanguageRange>) languageRangeList51, (java.util.Collection<java.util.Locale>) localeList70);
        java.util.Locale.LanguageRange[] languageRangeArray73 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList74 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean75 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList74, languageRangeArray73);
        java.util.Collection<java.util.Locale> localeCollection76 = null;
        java.util.Locale locale77 = java.util.Locale.lookup((java.util.List<java.util.Locale.LanguageRange>) languageRangeList74, localeCollection76);
        java.lang.String[] strArray79 = new java.lang.String[] { "hi!" };
        java.util.ArrayList<java.lang.String> strList80 = new java.util.ArrayList<java.lang.String>();
        boolean boolean81 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList80, strArray79);
        java.lang.String str82 = java.util.Locale.lookupTag((java.util.List<java.util.Locale.LanguageRange>) languageRangeList74, (java.util.Collection<java.lang.String>) strList80);
        java.util.Locale locale83 = java.util.Locale.ROOT;
        boolean boolean84 = locale83.hasExtensions();
        java.lang.String str85 = locale83.getCountry();
        java.util.Locale locale86 = java.util.Locale.JAPAN;
        java.util.Locale locale87 = java.util.Locale.FRENCH;
        java.util.Locale locale91 = new java.util.Locale("", "", "");
        java.util.Locale[] localeArray92 = new java.util.Locale[] { locale83, locale86, locale87, locale91 };
        java.util.ArrayList<java.util.Locale> localeList93 = new java.util.ArrayList<java.util.Locale>();
        boolean boolean94 = java.util.Collections.addAll((java.util.Collection<java.util.Locale>) localeList93, localeArray92);
        java.util.List<java.util.Locale> localeList95 = java.util.Locale.filter((java.util.List<java.util.Locale.LanguageRange>) languageRangeList74, (java.util.Collection<java.util.Locale>) localeList93);
        java.util.List<java.util.Locale> localeList96 = java.util.Locale.filter((java.util.List<java.util.Locale.LanguageRange>) languageRangeList51, (java.util.Collection<java.util.Locale>) localeList95);
        java.util.Locale locale97 = java.util.Locale.lookup(languageRangeList49, (java.util.Collection<java.util.Locale>) localeList95);
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<java.util.Locale> localeList98 = java.util.Locale.filter(languageRangeList0, (java.util.Collection<java.util.Locale>) localeList95);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(languageRangeArray1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(locale5);
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNotNull(locale11);
        org.junit.Assert.assertEquals(locale11.toString(), "");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNotNull(locale14);
        org.junit.Assert.assertEquals(locale14.toString(), "ja_JP");
        org.junit.Assert.assertNotNull(locale15);
        org.junit.Assert.assertEquals(locale15.toString(), "fr");
        org.junit.Assert.assertEquals(locale19.toString(), "");
        org.junit.Assert.assertNotNull(localeArray20);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertNotNull(localeList23);
        org.junit.Assert.assertNotNull(languageRangeArray24);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNull(locale28);
        org.junit.Assert.assertNotNull(strArray30);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertNull(str33);
        org.junit.Assert.assertNotNull(locale34);
        org.junit.Assert.assertEquals(locale34.toString(), "");
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "" + "'", str36, "");
        org.junit.Assert.assertNotNull(locale37);
        org.junit.Assert.assertEquals(locale37.toString(), "ja_JP");
        org.junit.Assert.assertNotNull(locale38);
        org.junit.Assert.assertEquals(locale38.toString(), "fr");
        org.junit.Assert.assertEquals(locale42.toString(), "");
        org.junit.Assert.assertNotNull(localeArray43);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + true + "'", boolean45 == true);
        org.junit.Assert.assertNotNull(localeList46);
        org.junit.Assert.assertNotNull(localeList47);
        org.junit.Assert.assertNotNull(languageRangeList49);
        org.junit.Assert.assertNotNull(languageRangeArray50);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertNull(locale54);
        org.junit.Assert.assertNotNull(strArray56);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + true + "'", boolean58 == true);
        org.junit.Assert.assertNull(str59);
        org.junit.Assert.assertNotNull(locale60);
        org.junit.Assert.assertEquals(locale60.toString(), "");
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + false + "'", boolean61 == false);
        org.junit.Assert.assertEquals("'" + str62 + "' != '" + "" + "'", str62, "");
        org.junit.Assert.assertNotNull(locale63);
        org.junit.Assert.assertEquals(locale63.toString(), "ja_JP");
        org.junit.Assert.assertNotNull(locale64);
        org.junit.Assert.assertEquals(locale64.toString(), "fr");
        org.junit.Assert.assertEquals(locale68.toString(), "");
        org.junit.Assert.assertNotNull(localeArray69);
        org.junit.Assert.assertTrue("'" + boolean71 + "' != '" + true + "'", boolean71 == true);
        org.junit.Assert.assertNotNull(localeList72);
        org.junit.Assert.assertNotNull(languageRangeArray73);
        org.junit.Assert.assertTrue("'" + boolean75 + "' != '" + false + "'", boolean75 == false);
        org.junit.Assert.assertNull(locale77);
        org.junit.Assert.assertNotNull(strArray79);
        org.junit.Assert.assertTrue("'" + boolean81 + "' != '" + true + "'", boolean81 == true);
        org.junit.Assert.assertNull(str82);
        org.junit.Assert.assertNotNull(locale83);
        org.junit.Assert.assertEquals(locale83.toString(), "");
        org.junit.Assert.assertTrue("'" + boolean84 + "' != '" + false + "'", boolean84 == false);
        org.junit.Assert.assertEquals("'" + str85 + "' != '" + "" + "'", str85, "");
        org.junit.Assert.assertNotNull(locale86);
        org.junit.Assert.assertEquals(locale86.toString(), "ja_JP");
        org.junit.Assert.assertNotNull(locale87);
        org.junit.Assert.assertEquals(locale87.toString(), "fr");
        org.junit.Assert.assertEquals(locale91.toString(), "");
        org.junit.Assert.assertNotNull(localeArray92);
        org.junit.Assert.assertTrue("'" + boolean94 + "' != '" + true + "'", boolean94 == true);
        org.junit.Assert.assertNotNull(localeList95);
        org.junit.Assert.assertNotNull(localeList96);
        org.junit.Assert.assertNull(locale97);
    }

    @Test
    public void test00106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00106");
        java.io.PrintStream printStream1 = new java.io.PrintStream("zh_CN");
        printStream1.print((float) (byte) -1);
        printStream1.println();
        printStream1.println();
        printStream1.println((float) ' ');
        printStream1.println("hi!");
        // The following exception was thrown during execution in test generation
        try {
            java.io.PrintStream printStream12 = new java.io.PrintStream((java.io.OutputStream) printStream1, false, "en-GB");
            org.junit.Assert.fail("Expected exception of type java.io.UnsupportedEncodingException; message: en-GB");
        } catch (java.io.UnsupportedEncodingException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00107");
        java.io.PrintStream printStream1 = new java.io.PrintStream("zh_CN");
        printStream1.print((float) (byte) -1);
        printStream1.println();
        printStream1.println();
        java.io.PrintStream printStream7 = new java.io.PrintStream((java.io.OutputStream) printStream1, true);
        // The following exception was thrown during execution in test generation
        try {
            java.io.PrintStream printStream10 = new java.io.PrintStream((java.io.OutputStream) printStream1, true, "en-GB");
            org.junit.Assert.fail("Expected exception of type java.io.UnsupportedEncodingException; message: en-GB");
        } catch (java.io.UnsupportedEncodingException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00108");
        java.io.PrintStream printStream1 = new java.io.PrintStream("zh_CN");
        printStream1.println();
        java.io.PrintStream printStream4 = printStream1.append('#');
        printStream1.close();
        byte[] byteArray10 = new byte[] { (byte) -1, (byte) 100, (byte) -1, (byte) -1 };
        printStream1.write(byteArray10);
        // The following exception was thrown during execution in test generation
        try {
            java.io.PrintStream printStream15 = printStream1.append((java.lang.CharSequence) "en-GB", 0, (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 52");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(printStream4);
        org.junit.Assert.assertNotNull(byteArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray10), "[-1, 100, -1, -1]");
    }

    @Test
    public void test00109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00109");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clearExtensions();
        java.util.Locale.Builder builder3 = builder0.setScript("");
        java.util.Locale.Builder builder5 = builder3.removeUnicodeLocaleAttribute("Italy");
        java.util.Locale.Builder builder7 = builder3.setRegion("ja");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder10 = builder7.setExtension('#', "fr");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed extension key: # [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder7);
    }

    @Test
    public void test00110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00110");
        java.io.File file0 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.io.PrintWriter printWriter2 = new java.io.PrintWriter(file0, "English");
            org.junit.Assert.fail("Expected exception of type java.io.UnsupportedEncodingException; message: English");
        } catch (java.io.UnsupportedEncodingException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00111");
        java.util.Locale.LanguageRange[] languageRangeArray0 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList1 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList1, languageRangeArray0);
        java.util.Collection<java.util.Locale> localeCollection3 = null;
        java.util.Locale locale4 = java.util.Locale.lookup((java.util.List<java.util.Locale.LanguageRange>) languageRangeList1, localeCollection3);
        java.lang.String[] strArray6 = new java.lang.String[] { "hi!" };
        java.util.ArrayList<java.lang.String> strList7 = new java.util.ArrayList<java.lang.String>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList7, strArray6);
        java.lang.String str9 = java.util.Locale.lookupTag((java.util.List<java.util.Locale.LanguageRange>) languageRangeList1, (java.util.Collection<java.lang.String>) strList7);
        java.util.Locale locale10 = java.util.Locale.ROOT;
        boolean boolean11 = locale10.hasExtensions();
        java.lang.String str12 = locale10.getCountry();
        java.util.Locale locale13 = java.util.Locale.JAPAN;
        java.util.Locale locale14 = java.util.Locale.FRENCH;
        java.util.Locale locale18 = new java.util.Locale("", "", "");
        java.util.Locale[] localeArray19 = new java.util.Locale[] { locale10, locale13, locale14, locale18 };
        java.util.ArrayList<java.util.Locale> localeList20 = new java.util.ArrayList<java.util.Locale>();
        boolean boolean21 = java.util.Collections.addAll((java.util.Collection<java.util.Locale>) localeList20, localeArray19);
        java.util.List<java.util.Locale> localeList22 = java.util.Locale.filter((java.util.List<java.util.Locale.LanguageRange>) languageRangeList1, (java.util.Collection<java.util.Locale>) localeList20);
        java.util.Locale.LanguageRange[] languageRangeArray23 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList24 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean25 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList24, languageRangeArray23);
        java.util.Collection<java.util.Locale> localeCollection26 = null;
        java.util.Locale locale27 = java.util.Locale.lookup((java.util.List<java.util.Locale.LanguageRange>) languageRangeList24, localeCollection26);
        java.lang.String[] strArray29 = new java.lang.String[] { "hi!" };
        java.util.ArrayList<java.lang.String> strList30 = new java.util.ArrayList<java.lang.String>();
        boolean boolean31 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList30, strArray29);
        java.lang.String str32 = java.util.Locale.lookupTag((java.util.List<java.util.Locale.LanguageRange>) languageRangeList24, (java.util.Collection<java.lang.String>) strList30);
        java.util.Locale locale33 = java.util.Locale.ROOT;
        boolean boolean34 = locale33.hasExtensions();
        java.lang.String str35 = locale33.getCountry();
        java.util.Locale locale36 = java.util.Locale.JAPAN;
        java.util.Locale locale37 = java.util.Locale.FRENCH;
        java.util.Locale locale41 = new java.util.Locale("", "", "");
        java.util.Locale[] localeArray42 = new java.util.Locale[] { locale33, locale36, locale37, locale41 };
        java.util.ArrayList<java.util.Locale> localeList43 = new java.util.ArrayList<java.util.Locale>();
        boolean boolean44 = java.util.Collections.addAll((java.util.Collection<java.util.Locale>) localeList43, localeArray42);
        java.util.List<java.util.Locale> localeList45 = java.util.Locale.filter((java.util.List<java.util.Locale.LanguageRange>) languageRangeList24, (java.util.Collection<java.util.Locale>) localeList43);
        java.util.List<java.util.Locale> localeList46 = java.util.Locale.filter((java.util.List<java.util.Locale.LanguageRange>) languageRangeList1, (java.util.Collection<java.util.Locale>) localeList45);
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap47 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList48 = java.util.Locale.LanguageRange.mapEquivalents((java.util.List<java.util.Locale.LanguageRange>) languageRangeList1, strMap47);
        java.util.Locale.LanguageRange[] languageRangeArray49 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList50 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean51 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList50, languageRangeArray49);
        java.util.Collection<java.util.Locale> localeCollection52 = null;
        java.util.Locale locale53 = java.util.Locale.lookup((java.util.List<java.util.Locale.LanguageRange>) languageRangeList50, localeCollection52);
        java.lang.String[] strArray55 = new java.lang.String[] { "hi!" };
        java.util.ArrayList<java.lang.String> strList56 = new java.util.ArrayList<java.lang.String>();
        boolean boolean57 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList56, strArray55);
        java.lang.String str58 = java.util.Locale.lookupTag((java.util.List<java.util.Locale.LanguageRange>) languageRangeList50, (java.util.Collection<java.lang.String>) strList56);
        java.util.Locale locale59 = java.util.Locale.ROOT;
        boolean boolean60 = locale59.hasExtensions();
        java.lang.String str61 = locale59.getCountry();
        java.util.Locale locale62 = java.util.Locale.JAPAN;
        java.util.Locale locale63 = java.util.Locale.FRENCH;
        java.util.Locale locale67 = new java.util.Locale("", "", "");
        java.util.Locale[] localeArray68 = new java.util.Locale[] { locale59, locale62, locale63, locale67 };
        java.util.ArrayList<java.util.Locale> localeList69 = new java.util.ArrayList<java.util.Locale>();
        boolean boolean70 = java.util.Collections.addAll((java.util.Collection<java.util.Locale>) localeList69, localeArray68);
        java.util.List<java.util.Locale> localeList71 = java.util.Locale.filter((java.util.List<java.util.Locale.LanguageRange>) languageRangeList50, (java.util.Collection<java.util.Locale>) localeList69);
        java.util.Locale.FilteringMode filteringMode72 = java.util.Locale.FilteringMode.REJECT_EXTENDED_RANGES;
        java.util.List<java.util.Locale> localeList73 = java.util.Locale.filter(languageRangeList48, (java.util.Collection<java.util.Locale>) localeList69, filteringMode72);
        java.util.Collection<java.lang.String> strCollection74 = null;
        java.lang.String str75 = java.util.Locale.lookupTag(languageRangeList48, strCollection74);
        org.junit.Assert.assertNotNull(languageRangeArray0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(locale4);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNotNull(locale10);
        org.junit.Assert.assertEquals(locale10.toString(), "");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNotNull(locale13);
        org.junit.Assert.assertEquals(locale13.toString(), "ja_JP");
        org.junit.Assert.assertNotNull(locale14);
        org.junit.Assert.assertEquals(locale14.toString(), "fr");
        org.junit.Assert.assertEquals(locale18.toString(), "");
        org.junit.Assert.assertNotNull(localeArray19);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertNotNull(localeList22);
        org.junit.Assert.assertNotNull(languageRangeArray23);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNull(locale27);
        org.junit.Assert.assertNotNull(strArray29);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
        org.junit.Assert.assertNull(str32);
        org.junit.Assert.assertNotNull(locale33);
        org.junit.Assert.assertEquals(locale33.toString(), "");
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "" + "'", str35, "");
        org.junit.Assert.assertNotNull(locale36);
        org.junit.Assert.assertEquals(locale36.toString(), "ja_JP");
        org.junit.Assert.assertNotNull(locale37);
        org.junit.Assert.assertEquals(locale37.toString(), "fr");
        org.junit.Assert.assertEquals(locale41.toString(), "");
        org.junit.Assert.assertNotNull(localeArray42);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + true + "'", boolean44 == true);
        org.junit.Assert.assertNotNull(localeList45);
        org.junit.Assert.assertNotNull(localeList46);
        org.junit.Assert.assertNotNull(languageRangeList48);
        org.junit.Assert.assertNotNull(languageRangeArray49);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertNull(locale53);
        org.junit.Assert.assertNotNull(strArray55);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + true + "'", boolean57 == true);
        org.junit.Assert.assertNull(str58);
        org.junit.Assert.assertNotNull(locale59);
        org.junit.Assert.assertEquals(locale59.toString(), "");
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + false + "'", boolean60 == false);
        org.junit.Assert.assertEquals("'" + str61 + "' != '" + "" + "'", str61, "");
        org.junit.Assert.assertNotNull(locale62);
        org.junit.Assert.assertEquals(locale62.toString(), "ja_JP");
        org.junit.Assert.assertNotNull(locale63);
        org.junit.Assert.assertEquals(locale63.toString(), "fr");
        org.junit.Assert.assertEquals(locale67.toString(), "");
        org.junit.Assert.assertNotNull(localeArray68);
        org.junit.Assert.assertTrue("'" + boolean70 + "' != '" + true + "'", boolean70 == true);
        org.junit.Assert.assertNotNull(localeList71);
        org.junit.Assert.assertTrue("'" + filteringMode72 + "' != '" + java.util.Locale.FilteringMode.REJECT_EXTENDED_RANGES + "'", filteringMode72.equals(java.util.Locale.FilteringMode.REJECT_EXTENDED_RANGES));
        org.junit.Assert.assertNotNull(localeList73);
        org.junit.Assert.assertNull(str75);
    }

    @Test
    public void test00112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00112");
        java.io.PrintWriter printWriter1 = new java.io.PrintWriter("fr");
        printWriter1.println();
        boolean boolean3 = printWriter1.checkError();
        printWriter1.println(0.0f);
        printWriter1.write("fr");
        printWriter1.println(10.0f);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test00113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00113");
        java.util.Locale.Category category0 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale locale1 = java.util.Locale.getDefault(category0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00114");
        java.util.List<java.util.Locale.LanguageRange> languageRangeList0 = null;
        java.util.Locale.LanguageRange[] languageRangeArray1 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList2 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList2, languageRangeArray1);
        java.util.Collection<java.util.Locale> localeCollection4 = null;
        java.util.Locale locale5 = java.util.Locale.lookup((java.util.List<java.util.Locale.LanguageRange>) languageRangeList2, localeCollection4);
        java.lang.String[] strArray7 = new java.lang.String[] { "hi!" };
        java.util.ArrayList<java.lang.String> strList8 = new java.util.ArrayList<java.lang.String>();
        boolean boolean9 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList8, strArray7);
        java.lang.String str10 = java.util.Locale.lookupTag((java.util.List<java.util.Locale.LanguageRange>) languageRangeList2, (java.util.Collection<java.lang.String>) strList8);
        java.util.Locale locale11 = java.util.Locale.ROOT;
        boolean boolean12 = locale11.hasExtensions();
        java.lang.String str13 = locale11.getCountry();
        java.util.Locale locale14 = java.util.Locale.JAPAN;
        java.util.Locale locale15 = java.util.Locale.FRENCH;
        java.util.Locale locale19 = new java.util.Locale("", "", "");
        java.util.Locale[] localeArray20 = new java.util.Locale[] { locale11, locale14, locale15, locale19 };
        java.util.ArrayList<java.util.Locale> localeList21 = new java.util.ArrayList<java.util.Locale>();
        boolean boolean22 = java.util.Collections.addAll((java.util.Collection<java.util.Locale>) localeList21, localeArray20);
        java.util.List<java.util.Locale> localeList23 = java.util.Locale.filter((java.util.List<java.util.Locale.LanguageRange>) languageRangeList2, (java.util.Collection<java.util.Locale>) localeList21);
        java.util.Locale.LanguageRange[] languageRangeArray24 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList25 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean26 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList25, languageRangeArray24);
        java.util.Collection<java.util.Locale> localeCollection27 = null;
        java.util.Locale locale28 = java.util.Locale.lookup((java.util.List<java.util.Locale.LanguageRange>) languageRangeList25, localeCollection27);
        java.lang.String[] strArray30 = new java.lang.String[] { "hi!" };
        java.util.ArrayList<java.lang.String> strList31 = new java.util.ArrayList<java.lang.String>();
        boolean boolean32 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList31, strArray30);
        java.lang.String str33 = java.util.Locale.lookupTag((java.util.List<java.util.Locale.LanguageRange>) languageRangeList25, (java.util.Collection<java.lang.String>) strList31);
        java.util.Locale locale34 = java.util.Locale.ROOT;
        boolean boolean35 = locale34.hasExtensions();
        java.lang.String str36 = locale34.getCountry();
        java.util.Locale locale37 = java.util.Locale.JAPAN;
        java.util.Locale locale38 = java.util.Locale.FRENCH;
        java.util.Locale locale42 = new java.util.Locale("", "", "");
        java.util.Locale[] localeArray43 = new java.util.Locale[] { locale34, locale37, locale38, locale42 };
        java.util.ArrayList<java.util.Locale> localeList44 = new java.util.ArrayList<java.util.Locale>();
        boolean boolean45 = java.util.Collections.addAll((java.util.Collection<java.util.Locale>) localeList44, localeArray43);
        java.util.List<java.util.Locale> localeList46 = java.util.Locale.filter((java.util.List<java.util.Locale.LanguageRange>) languageRangeList25, (java.util.Collection<java.util.Locale>) localeList44);
        java.util.List<java.util.Locale> localeList47 = java.util.Locale.filter((java.util.List<java.util.Locale.LanguageRange>) languageRangeList2, (java.util.Collection<java.util.Locale>) localeList46);
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<java.util.Locale> localeList48 = java.util.Locale.filter(languageRangeList0, (java.util.Collection<java.util.Locale>) localeList46);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(languageRangeArray1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(locale5);
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNotNull(locale11);
        org.junit.Assert.assertEquals(locale11.toString(), "");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNotNull(locale14);
        org.junit.Assert.assertEquals(locale14.toString(), "ja_JP");
        org.junit.Assert.assertNotNull(locale15);
        org.junit.Assert.assertEquals(locale15.toString(), "fr");
        org.junit.Assert.assertEquals(locale19.toString(), "");
        org.junit.Assert.assertNotNull(localeArray20);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertNotNull(localeList23);
        org.junit.Assert.assertNotNull(languageRangeArray24);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNull(locale28);
        org.junit.Assert.assertNotNull(strArray30);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertNull(str33);
        org.junit.Assert.assertNotNull(locale34);
        org.junit.Assert.assertEquals(locale34.toString(), "");
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "" + "'", str36, "");
        org.junit.Assert.assertNotNull(locale37);
        org.junit.Assert.assertEquals(locale37.toString(), "ja_JP");
        org.junit.Assert.assertNotNull(locale38);
        org.junit.Assert.assertEquals(locale38.toString(), "fr");
        org.junit.Assert.assertEquals(locale42.toString(), "");
        org.junit.Assert.assertNotNull(localeArray43);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + true + "'", boolean45 == true);
        org.junit.Assert.assertNotNull(localeList46);
        org.junit.Assert.assertNotNull(localeList47);
    }

    @Test
    public void test00115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00115");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl((int) 'u', (int) (byte) 1, (int) '#');
        int int4 = hypergeometricDistributionImpl3.getPopulationSize();
        double double6 = hypergeometricDistributionImpl3.cumulativeProbability((double) (short) -1);
        hypergeometricDistributionImpl3.setSampleSize((int) '#');
        int int9 = hypergeometricDistributionImpl3.getSampleSize();
        int int10 = hypergeometricDistributionImpl3.getNumberOfSuccesses();
        // The following exception was thrown during execution in test generation
        try {
            double double13 = hypergeometricDistributionImpl3.cumulativeProbability(117, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: lower endpoint must be less than or equal to upper endpoint");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 117 + "'", int4 == 117);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 35 + "'", int9 == 35);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
    }

    @Test
    public void test00116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00116");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clearExtensions();
        java.util.Locale.Builder builder2 = builder1.clearExtensions();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder4 = builder1.addUnicodeLocaleAttribute("ja");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed Unicode locale attribute: ja [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(builder2);
    }

    @Test
    public void test00117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00117");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clearExtensions();
        java.util.Locale.Builder builder3 = builder1.setLanguageTag("fr");
        java.util.Locale locale4 = builder3.build();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder6 = builder3.setScript("chinois");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed script: chinois [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "fr");
    }

    @Test
    public void test00118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00118");
        java.util.List<java.util.Locale.LanguageRange> languageRangeList0 = null;
        java.util.Locale.LanguageRange[] languageRangeArray1 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList2 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList2, languageRangeArray1);
        java.util.Collection<java.util.Locale> localeCollection4 = null;
        java.util.Locale locale5 = java.util.Locale.lookup((java.util.List<java.util.Locale.LanguageRange>) languageRangeList2, localeCollection4);
        java.lang.String[] strArray7 = new java.lang.String[] { "hi!" };
        java.util.ArrayList<java.lang.String> strList8 = new java.util.ArrayList<java.lang.String>();
        boolean boolean9 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList8, strArray7);
        java.lang.String str10 = java.util.Locale.lookupTag((java.util.List<java.util.Locale.LanguageRange>) languageRangeList2, (java.util.Collection<java.lang.String>) strList8);
        java.util.Locale.LanguageRange[] languageRangeArray11 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList12 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean13 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList12, languageRangeArray11);
        java.util.Collection<java.util.Locale> localeCollection14 = null;
        java.util.Locale locale15 = java.util.Locale.lookup((java.util.List<java.util.Locale.LanguageRange>) languageRangeList12, localeCollection14);
        java.lang.String[] strArray17 = new java.lang.String[] { "hi!" };
        java.util.ArrayList<java.lang.String> strList18 = new java.util.ArrayList<java.lang.String>();
        boolean boolean19 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList18, strArray17);
        java.lang.String str20 = java.util.Locale.lookupTag((java.util.List<java.util.Locale.LanguageRange>) languageRangeList12, (java.util.Collection<java.lang.String>) strList18);
        java.util.Locale locale21 = java.util.Locale.ROOT;
        boolean boolean22 = locale21.hasExtensions();
        java.lang.String str23 = locale21.getCountry();
        java.util.Locale locale24 = java.util.Locale.JAPAN;
        java.util.Locale locale25 = java.util.Locale.FRENCH;
        java.util.Locale locale29 = new java.util.Locale("", "", "");
        java.util.Locale[] localeArray30 = new java.util.Locale[] { locale21, locale24, locale25, locale29 };
        java.util.ArrayList<java.util.Locale> localeList31 = new java.util.ArrayList<java.util.Locale>();
        boolean boolean32 = java.util.Collections.addAll((java.util.Collection<java.util.Locale>) localeList31, localeArray30);
        java.util.List<java.util.Locale> localeList33 = java.util.Locale.filter((java.util.List<java.util.Locale.LanguageRange>) languageRangeList12, (java.util.Collection<java.util.Locale>) localeList31);
        java.util.List<java.util.Locale> localeList34 = java.util.Locale.filter((java.util.List<java.util.Locale.LanguageRange>) languageRangeList2, (java.util.Collection<java.util.Locale>) localeList31);
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<java.util.Locale> localeList35 = java.util.Locale.filter(languageRangeList0, (java.util.Collection<java.util.Locale>) localeList31);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(languageRangeArray1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(locale5);
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNotNull(languageRangeArray11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNull(locale15);
        org.junit.Assert.assertNotNull(strArray17);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNull(str20);
        org.junit.Assert.assertNotNull(locale21);
        org.junit.Assert.assertEquals(locale21.toString(), "");
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertNotNull(locale24);
        org.junit.Assert.assertEquals(locale24.toString(), "ja_JP");
        org.junit.Assert.assertNotNull(locale25);
        org.junit.Assert.assertEquals(locale25.toString(), "fr");
        org.junit.Assert.assertEquals(locale29.toString(), "");
        org.junit.Assert.assertNotNull(localeArray30);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertNotNull(localeList33);
        org.junit.Assert.assertNotNull(localeList34);
    }

    @Test
    public void test00119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00119");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clearExtensions();
        java.util.Locale.Builder builder3 = builder0.setScript("");
        java.util.Locale.Builder builder5 = builder3.removeUnicodeLocaleAttribute("Italy");
        java.util.Locale.Builder builder6 = builder3.clearExtensions();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder8 = builder6.setVariant("fr");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed variant: fr [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder6);
    }

    @Test
    public void test00120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00120");
        java.io.PrintWriter printWriter1 = new java.io.PrintWriter("fr");
        printWriter1.print("it_IT");
        java.util.Locale locale4 = java.util.Locale.ROOT;
        boolean boolean5 = locale4.hasExtensions();
        java.util.Locale locale6 = java.util.Locale.ROOT;
        java.lang.String str7 = locale4.getDisplayName(locale6);
        java.util.Locale locale8 = java.util.Locale.ROOT;
        boolean boolean9 = locale8.hasExtensions();
        java.lang.String str10 = locale4.getDisplayCountry(locale8);
        java.lang.Object[] objArray13 = new java.lang.Object[] {};
        org.apache.commons.math.MathException mathException14 = new org.apache.commons.math.MathException("hi!", objArray13);
        java.io.PrintWriter printWriter15 = printWriter1.printf(locale8, "it_IT", objArray13);
        printWriter1.println();
        printWriter1.print(10);
        java.io.PrintWriter printWriter22 = printWriter1.append((java.lang.CharSequence) "fr", (int) (short) 0, (int) (byte) 1);
        java.io.PrintWriter printWriter24 = new java.io.PrintWriter((java.io.Writer) printWriter1, true);
        java.io.PrintWriter printWriter26 = new java.io.PrintWriter("fr");
        java.io.PrintWriter printWriter28 = new java.io.PrintWriter("fr");
        printWriter28.print("it_IT");
        java.util.Locale locale32 = java.util.Locale.forLanguageTag("");
        java.lang.Object[] objArray35 = new java.lang.Object[] {};
        org.apache.commons.math.MathException mathException36 = new org.apache.commons.math.MathException("hi!", objArray35);
        java.lang.Throwable[] throwableArray37 = mathException36.getSuppressed();
        java.lang.Throwable[] throwableArray38 = mathException36.getSuppressed();
        java.io.PrintWriter printWriter39 = printWriter28.printf(locale32, "it_IT", (java.lang.Object[]) throwableArray38);
        java.io.PrintWriter printWriter42 = new java.io.PrintWriter("fr");
        printWriter42.print("it_IT");
        java.util.Locale locale45 = java.util.Locale.ROOT;
        boolean boolean46 = locale45.hasExtensions();
        java.util.Locale locale47 = java.util.Locale.ROOT;
        java.lang.String str48 = locale45.getDisplayName(locale47);
        java.util.Locale locale49 = java.util.Locale.ROOT;
        boolean boolean50 = locale49.hasExtensions();
        java.lang.String str51 = locale45.getDisplayCountry(locale49);
        java.lang.Object[] objArray54 = new java.lang.Object[] {};
        org.apache.commons.math.MathException mathException55 = new org.apache.commons.math.MathException("hi!", objArray54);
        java.io.PrintWriter printWriter56 = printWriter42.printf(locale49, "it_IT", objArray54);
        java.io.PrintWriter printWriter57 = printWriter26.printf(locale32, "fr", objArray54);
        char[] charArray61 = new char[] { '#', ' ', 'x' };
        printWriter26.write(charArray61);
        // The following exception was thrown during execution in test generation
        try {
            printWriter1.write(charArray61, (int) (short) 100, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(locale6);
        org.junit.Assert.assertEquals(locale6.toString(), "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(locale8);
        org.junit.Assert.assertEquals(locale8.toString(), "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(objArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray13), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray13), "[]");
        org.junit.Assert.assertNotNull(printWriter15);
        org.junit.Assert.assertNotNull(printWriter22);
        org.junit.Assert.assertNotNull(locale32);
        org.junit.Assert.assertEquals(locale32.toString(), "");
        org.junit.Assert.assertNotNull(objArray35);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray35), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray35), "[]");
        org.junit.Assert.assertNotNull(throwableArray37);
        org.junit.Assert.assertNotNull(throwableArray38);
        org.junit.Assert.assertNotNull(printWriter39);
        org.junit.Assert.assertNotNull(locale45);
        org.junit.Assert.assertEquals(locale45.toString(), "");
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertNotNull(locale47);
        org.junit.Assert.assertEquals(locale47.toString(), "");
        org.junit.Assert.assertEquals("'" + str48 + "' != '" + "" + "'", str48, "");
        org.junit.Assert.assertNotNull(locale49);
        org.junit.Assert.assertEquals(locale49.toString(), "");
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertEquals("'" + str51 + "' != '" + "" + "'", str51, "");
        org.junit.Assert.assertNotNull(objArray54);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray54), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray54), "[]");
        org.junit.Assert.assertNotNull(printWriter56);
        org.junit.Assert.assertNotNull(printWriter57);
        org.junit.Assert.assertNotNull(charArray61);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray61), "# x");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray61), "# x");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray61), "[#,  , x]");
    }

    @Test
    public void test00121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00121");
        // The following exception was thrown during execution in test generation
        try {
            java.io.PrintWriter printWriter1 = new java.io.PrintWriter("");
            org.junit.Assert.fail("Expected exception of type java.io.FileNotFoundException; message:  (No such file or directory)");
        } catch (java.io.FileNotFoundException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00122");
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<java.util.Locale.LanguageRange> languageRangeList2 = java.util.Locale.LanguageRange.parse("zh_CN", strMap1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: range=zh_cn");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00123");
        java.io.PrintStream printStream1 = new java.io.PrintStream("zh_CN");
        printStream1.println();
        java.io.PrintStream printStream4 = printStream1.append('#');
        printStream1.close();
        byte[] byteArray9 = new byte[] { (byte) 1, (byte) 10, (byte) -1 };
        printStream1.write(byteArray9);
        printStream1.write((int) 'a');
        // The following exception was thrown during execution in test generation
        try {
            java.io.PrintStream printStream15 = new java.io.PrintStream((java.io.OutputStream) printStream1, true, "italiano (Italia)");
            org.junit.Assert.fail("Expected exception of type java.io.UnsupportedEncodingException; message: italiano (Italia)");
        } catch (java.io.UnsupportedEncodingException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(printStream4);
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray9), "[1, 10, -1]");
    }

    @Test
    public void test00124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00124");
        // The following exception was thrown during execution in test generation
        try {
            java.io.PrintStream printStream2 = new java.io.PrintStream("English", "");
            org.junit.Assert.fail("Expected exception of type java.io.UnsupportedEncodingException; message: ");
        } catch (java.io.UnsupportedEncodingException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00125");
        java.io.PrintWriter printWriter1 = new java.io.PrintWriter("fr");
        printWriter1.print("it_IT");
        java.util.Locale locale4 = java.util.Locale.ROOT;
        boolean boolean5 = locale4.hasExtensions();
        java.util.Locale locale6 = java.util.Locale.ROOT;
        java.lang.String str7 = locale4.getDisplayName(locale6);
        java.util.Locale locale8 = java.util.Locale.ROOT;
        boolean boolean9 = locale8.hasExtensions();
        java.lang.String str10 = locale4.getDisplayCountry(locale8);
        java.lang.Object[] objArray13 = new java.lang.Object[] {};
        org.apache.commons.math.MathException mathException14 = new org.apache.commons.math.MathException("hi!", objArray13);
        java.io.PrintWriter printWriter15 = printWriter1.printf(locale8, "it_IT", objArray13);
        java.util.Locale locale18 = new java.util.Locale("Italy", "Italy");
        java.lang.String str19 = locale8.getDisplayScript(locale18);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str21 = locale8.getExtension('4');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Ill-formed extension key: 4");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(locale6);
        org.junit.Assert.assertEquals(locale6.toString(), "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(locale8);
        org.junit.Assert.assertEquals(locale8.toString(), "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(objArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray13), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray13), "[]");
        org.junit.Assert.assertNotNull(printWriter15);
        org.junit.Assert.assertEquals(locale18.toString(), "italy_ITALY");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
    }

    @Test
    public void test00126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00126");
        org.apache.commons.math.MathException mathException1 = new org.apache.commons.math.MathException();
        org.apache.commons.math.MathException mathException2 = new org.apache.commons.math.MathException("", (java.lang.Throwable) mathException1);
        java.lang.String str3 = mathException2.toString();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "org.apache.commons.math.MathException: " + "'", str3, "org.apache.commons.math.MathException: ");
    }

    @Test
    public void test00127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00127");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clearExtensions();
        java.util.Locale.Builder builder2 = builder1.clearExtensions();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder4 = builder2.setLanguage("fr-CA");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed language: fr-CA [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(builder2);
    }

    @Test
    public void test00128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00128");
        // The following exception was thrown during execution in test generation
        try {
            java.io.PrintStream printStream1 = new java.io.PrintStream("English");
// flaky:             org.junit.Assert.fail("Expected exception of type java.io.FileNotFoundException; message: English (Is a directory)");
        } catch (java.io.FileNotFoundException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00129");
        java.io.File file0 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.io.PrintStream printStream2 = new java.io.PrintStream(file0, "anglais");
            org.junit.Assert.fail("Expected exception of type java.io.UnsupportedEncodingException; message: anglais");
        } catch (java.io.UnsupportedEncodingException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00130");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl((int) 'u', (int) (byte) 1, (int) '#');
        int int4 = hypergeometricDistributionImpl3.getPopulationSize();
        double double6 = hypergeometricDistributionImpl3.cumulativeProbability((double) (short) -1);
        // The following exception was thrown during execution in test generation
        try {
            double double9 = hypergeometricDistributionImpl3.cumulativeProbability((double) ' ', (double) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: lower endpoint must be less than or equal to upper endpoint");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 117 + "'", int4 == 117);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
    }

    @Test
    public void test00131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00131");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder2 = builder0.setLanguageTag("ita");
        java.util.Locale.Builder builder4 = builder0.setLanguageTag("ITALY");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder6 = builder4.setRegion("Italy");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed region: Italy [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
    }

    @Test
    public void test00132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00132");
        java.io.PrintStream printStream1 = new java.io.PrintStream("zh_CN");
        printStream1.print((float) (byte) -1);
        printStream1.println();
        printStream1.print("ita");
        printStream1.println('#');
        printStream1.println('u');
        // The following exception was thrown during execution in test generation
        try {
            java.io.PrintStream printStream14 = printStream1.append((java.lang.CharSequence) "fra", (int) 'x', (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 32");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00133");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clearExtensions();
        java.util.Locale locale2 = builder1.build();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder4 = builder1.setVariant("en-gb");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed variant: en-gb [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "");
    }

    @Test
    public void test00134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00134");
        java.io.PrintStream printStream1 = new java.io.PrintStream("zh_CN");
        printStream1.println();
        java.io.PrintStream printStream4 = printStream1.append('#');
        java.io.PrintWriter printWriter6 = new java.io.PrintWriter((java.io.OutputStream) printStream1, true);
        printWriter6.println(false);
        org.junit.Assert.assertNotNull(printStream4);
    }

    @Test
    public void test00135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00135");
        java.lang.Object[] objArray2 = new java.lang.Object[] {};
        org.apache.commons.math.MathException mathException3 = new org.apache.commons.math.MathException("hi!", objArray2);
        java.lang.Throwable[] throwableArray4 = mathException3.getSuppressed();
        org.apache.commons.math.MathException mathException5 = new org.apache.commons.math.MathException("fr", (java.lang.Object[]) throwableArray4);
        java.lang.Class<?> wildcardClass6 = throwableArray4.getClass();
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray2), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray2), "[]");
        org.junit.Assert.assertNotNull(throwableArray4);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test00136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00136");
        java.io.PrintStream printStream1 = new java.io.PrintStream("zh_CN");
        printStream1.print((float) (byte) -1);
        printStream1.println();
        printStream1.println();
        printStream1.println((float) ' ');
        printStream1.println("hi!");
        printStream1.print(false);
        printStream1.write((int) 'a');
        // The following exception was thrown during execution in test generation
        try {
            java.io.PrintStream printStream16 = new java.io.PrintStream((java.io.OutputStream) printStream1, true, "tedesco");
            org.junit.Assert.fail("Expected exception of type java.io.UnsupportedEncodingException; message: tedesco");
        } catch (java.io.UnsupportedEncodingException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00137");
        java.io.PrintStream printStream1 = new java.io.PrintStream("zh_CN");
        printStream1.print((float) (byte) -1);
        printStream1.println();
        printStream1.println();
        printStream1.println((float) ' ');
        printStream1.println("hi!");
        java.io.PrintStream printStream11 = new java.io.PrintStream("zh_CN");
        printStream11.print((float) (byte) -1);
        printStream11.println();
        printStream11.println();
        java.io.PrintStream printStream17 = new java.io.PrintStream((java.io.OutputStream) printStream11, true);
        java.io.PrintWriter printWriter19 = new java.io.PrintWriter("fr");
        java.io.PrintWriter printWriter21 = printWriter19.append(' ');
        java.io.PrintWriter printWriter24 = new java.io.PrintWriter("fr");
        printWriter24.print("it_IT");
        java.util.Locale locale27 = java.util.Locale.ROOT;
        boolean boolean28 = locale27.hasExtensions();
        java.util.Locale locale29 = java.util.Locale.ROOT;
        java.lang.String str30 = locale27.getDisplayName(locale29);
        java.util.Locale locale31 = java.util.Locale.ROOT;
        boolean boolean32 = locale31.hasExtensions();
        java.lang.String str33 = locale27.getDisplayCountry(locale31);
        java.lang.Object[] objArray36 = new java.lang.Object[] {};
        org.apache.commons.math.MathException mathException37 = new org.apache.commons.math.MathException("hi!", objArray36);
        java.io.PrintWriter printWriter38 = printWriter24.printf(locale31, "it_IT", objArray36);
        java.io.PrintWriter printWriter41 = new java.io.PrintWriter("fr");
        printWriter41.print("it_IT");
        java.util.Locale locale45 = java.util.Locale.forLanguageTag("");
        java.lang.Object[] objArray48 = new java.lang.Object[] {};
        org.apache.commons.math.MathException mathException49 = new org.apache.commons.math.MathException("hi!", objArray48);
        java.lang.Throwable[] throwableArray50 = mathException49.getSuppressed();
        java.lang.Throwable[] throwableArray51 = mathException49.getSuppressed();
        java.io.PrintWriter printWriter52 = printWriter41.printf(locale45, "it_IT", (java.lang.Object[]) throwableArray51);
        java.io.PrintWriter printWriter53 = printWriter24.format("it_IT", (java.lang.Object[]) throwableArray51);
        java.io.PrintWriter printWriter54 = printWriter21.format("zh_CN", (java.lang.Object[]) throwableArray51);
        java.io.PrintStream printStream56 = new java.io.PrintStream("zh_CN");
        printStream56.print((float) (byte) -1);
        char[] charArray61 = new char[] { 'x', 'u' };
        printStream56.println(charArray61);
        printWriter54.print(charArray61);
        printStream11.print(charArray61);
        java.io.PrintWriter printWriter65 = new java.io.PrintWriter((java.io.OutputStream) printStream11);
        java.io.PrintStream printStream67 = new java.io.PrintStream("zh_CN");
        printStream67.println();
        java.io.PrintStream printStream70 = printStream67.append('#');
        printStream67.close();
        byte[] byteArray75 = new byte[] { (byte) 1, (byte) 10, (byte) -1 };
        printStream67.write(byteArray75);
        printStream11.write(byteArray75);
        // The following exception was thrown during execution in test generation
        try {
            printStream1.write(byteArray75, (int) ' ', (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(printWriter21);
        org.junit.Assert.assertNotNull(locale27);
        org.junit.Assert.assertEquals(locale27.toString(), "");
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNotNull(locale29);
        org.junit.Assert.assertEquals(locale29.toString(), "");
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "" + "'", str30, "");
        org.junit.Assert.assertNotNull(locale31);
        org.junit.Assert.assertEquals(locale31.toString(), "");
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "" + "'", str33, "");
        org.junit.Assert.assertNotNull(objArray36);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray36), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray36), "[]");
        org.junit.Assert.assertNotNull(printWriter38);
        org.junit.Assert.assertNotNull(locale45);
        org.junit.Assert.assertEquals(locale45.toString(), "");
        org.junit.Assert.assertNotNull(objArray48);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray48), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray48), "[]");
        org.junit.Assert.assertNotNull(throwableArray50);
        org.junit.Assert.assertNotNull(throwableArray51);
        org.junit.Assert.assertNotNull(printWriter52);
        org.junit.Assert.assertNotNull(printWriter53);
        org.junit.Assert.assertNotNull(printWriter54);
        org.junit.Assert.assertNotNull(charArray61);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray61), "xu");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray61), "xu");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray61), "[x, u]");
        org.junit.Assert.assertNotNull(printStream70);
        org.junit.Assert.assertNotNull(byteArray75);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray75), "[1, 10, -1]");
    }

    @Test
    public void test00138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00138");
        java.io.PrintStream printStream1 = new java.io.PrintStream("zh_CN");
        printStream1.print((float) (byte) -1);
        printStream1.println();
        printStream1.println();
        java.io.PrintStream printStream7 = new java.io.PrintStream((java.io.OutputStream) printStream1, true);
        java.io.PrintWriter printWriter9 = new java.io.PrintWriter("fr");
        printWriter9.print("it_IT");
        java.util.Locale locale12 = java.util.Locale.ROOT;
        boolean boolean13 = locale12.hasExtensions();
        java.util.Locale locale14 = java.util.Locale.ROOT;
        java.lang.String str15 = locale12.getDisplayName(locale14);
        java.util.Locale locale16 = java.util.Locale.ROOT;
        boolean boolean17 = locale16.hasExtensions();
        java.lang.String str18 = locale12.getDisplayCountry(locale16);
        java.lang.Object[] objArray21 = new java.lang.Object[] {};
        org.apache.commons.math.MathException mathException22 = new org.apache.commons.math.MathException("hi!", objArray21);
        java.io.PrintWriter printWriter23 = printWriter9.printf(locale16, "it_IT", objArray21);
        printStream7.println((java.lang.Object) "it_IT");
        java.io.PrintStream printStream26 = printStream7.append((java.lang.CharSequence) "fr");
        // The following exception was thrown during execution in test generation
        try {
            java.io.PrintStream printStream30 = printStream26.append((java.lang.CharSequence) "ITALY", (int) 'x', (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 35");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(locale12);
        org.junit.Assert.assertEquals(locale12.toString(), "");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(locale14);
        org.junit.Assert.assertEquals(locale14.toString(), "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertNotNull(locale16);
        org.junit.Assert.assertEquals(locale16.toString(), "");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertNotNull(objArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray21), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray21), "[]");
        org.junit.Assert.assertNotNull(printWriter23);
        org.junit.Assert.assertNotNull(printStream26);
    }

    @Test
    public void test00139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00139");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clearExtensions();
        java.util.Locale locale2 = builder1.build();
        java.util.Locale.Builder builder3 = builder1.clearExtensions();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder5 = builder3.setLanguage("org.apache.commons.math.MathException: ");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed language: org.apache.commons.math.MathException:  [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "");
        org.junit.Assert.assertNotNull(builder3);
    }

    @Test
    public void test00140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00140");
        java.util.Locale.LanguageRange languageRange1 = new java.util.Locale.LanguageRange("English");
        java.util.Locale locale2 = java.util.Locale.FRENCH;
        java.util.Set<java.lang.String> strSet3 = locale2.getUnicodeLocaleKeys();
        java.lang.String str4 = locale2.getVariant();
        boolean boolean5 = locale2.hasExtensions();
        java.util.Locale locale6 = locale2.stripExtensions();
        boolean boolean7 = languageRange1.equals((java.lang.Object) locale2);
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "fr");
        org.junit.Assert.assertNotNull(strSet3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(locale6);
        org.junit.Assert.assertEquals(locale6.toString(), "fr");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test00141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00141");
        // The following exception was thrown during execution in test generation
        try {
            java.io.PrintStream printStream2 = new java.io.PrintStream("fra", "");
            org.junit.Assert.fail("Expected exception of type java.io.UnsupportedEncodingException; message: ");
        } catch (java.io.UnsupportedEncodingException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00142");
        java.lang.Throwable throwable0 = null;
        org.apache.commons.math.MathException mathException1 = new org.apache.commons.math.MathException(throwable0);
        org.apache.commons.math.MathException mathException2 = new org.apache.commons.math.MathException((java.lang.Throwable) mathException1);
        java.lang.String str3 = mathException1.toString();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "org.apache.commons.math.MathException" + "'", str3, "org.apache.commons.math.MathException");
    }

    @Test
    public void test00143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00143");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl((int) 'u', (int) (byte) 1, (int) '#');
        hypergeometricDistributionImpl3.setPopulationSize(117);
        // The following exception was thrown during execution in test generation
        try {
            int int7 = hypergeometricDistributionImpl3.inverseCumulativeProbability((double) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: p must be between 0 and 1.0 (inclusive)");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00144");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl((int) (short) 1, 100, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: number of successes must be less than or equal to population size");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00145");
        java.lang.Throwable throwable1 = null;
        org.apache.commons.math.MathException mathException2 = new org.apache.commons.math.MathException(throwable1);
        org.apache.commons.math.MathException mathException3 = new org.apache.commons.math.MathException((java.lang.Throwable) mathException2);
        org.apache.commons.math.MathException mathException4 = new org.apache.commons.math.MathException("", (java.lang.Throwable) mathException2);
        java.lang.String str5 = mathException4.toString();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "org.apache.commons.math.MathException: " + "'", str5, "org.apache.commons.math.MathException: ");
    }

    @Test
    public void test00146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00146");
        java.lang.Object[] objArray1 = new java.lang.Object[] {};
        org.apache.commons.math.MathException mathException2 = new org.apache.commons.math.MathException("hi!", objArray1);
        java.lang.Object[] objArray3 = mathException2.getArguments();
        java.lang.Object[] objArray5 = new java.lang.Object[] {};
        org.apache.commons.math.MathException mathException6 = new org.apache.commons.math.MathException("hi!", objArray5);
        java.lang.Throwable[] throwableArray7 = mathException6.getSuppressed();
        mathException2.addSuppressed((java.lang.Throwable) mathException6);
        java.lang.String str9 = mathException2.toString();
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray1), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray1), "[]");
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray3), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray3), "[]");
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray5), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray5), "[]");
        org.junit.Assert.assertNotNull(throwableArray7);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "org.apache.commons.math.MathException: hi!" + "'", str9, "org.apache.commons.math.MathException: hi!");
    }

    @Test
    public void test00147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00147");
        java.lang.Object[] objArray1 = new java.lang.Object[] {};
        org.apache.commons.math.MathException mathException2 = new org.apache.commons.math.MathException("hi!", objArray1);
        org.apache.commons.math.MathException mathException3 = new org.apache.commons.math.MathException((java.lang.Throwable) mathException2);
        java.lang.Object[] objArray6 = new java.lang.Object[] {};
        org.apache.commons.math.MathException mathException7 = new org.apache.commons.math.MathException("hi!", objArray6);
        java.lang.Throwable[] throwableArray8 = mathException7.getSuppressed();
        org.apache.commons.math.MathException mathException9 = new org.apache.commons.math.MathException("fr", (java.lang.Object[]) throwableArray8);
        mathException2.addSuppressed((java.lang.Throwable) mathException9);
        java.lang.String str11 = mathException9.toString();
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray1), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray1), "[]");
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray6), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray6), "[]");
        org.junit.Assert.assertNotNull(throwableArray8);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "org.apache.commons.math.MathException: fr" + "'", str11, "org.apache.commons.math.MathException: fr");
    }

    @Test
    public void test00148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00148");
        java.util.Locale locale0 = java.util.Locale.JAPANESE;
        java.util.Locale locale1 = java.util.Locale.JAPANESE;
        java.lang.String str2 = locale0.getDisplayCountry(locale1);
        java.lang.String str3 = locale0.getVariant();
        java.util.Locale locale4 = java.util.Locale.CANADA;
        java.lang.String str5 = locale0.getDisplayScript(locale4);
        boolean boolean6 = locale0.hasExtensions();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str8 = locale0.getUnicodeLocaleType("English");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Ill-formed Unicode locale key: English");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "ja");
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "ja");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "en_CA");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test00149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00149");
        java.io.PrintWriter printWriter1 = new java.io.PrintWriter("fr");
        printWriter1.print("it_IT");
        java.util.Locale locale4 = java.util.Locale.ROOT;
        boolean boolean5 = locale4.hasExtensions();
        java.util.Locale locale6 = java.util.Locale.ROOT;
        java.lang.String str7 = locale4.getDisplayName(locale6);
        java.util.Locale locale8 = java.util.Locale.ROOT;
        boolean boolean9 = locale8.hasExtensions();
        java.lang.String str10 = locale4.getDisplayCountry(locale8);
        java.lang.Object[] objArray13 = new java.lang.Object[] {};
        org.apache.commons.math.MathException mathException14 = new org.apache.commons.math.MathException("hi!", objArray13);
        java.io.PrintWriter printWriter15 = printWriter1.printf(locale8, "it_IT", objArray13);
        printWriter1.println();
        printWriter1.println("");
        // The following exception was thrown during execution in test generation
        try {
            java.io.PrintWriter printWriter22 = printWriter1.append((java.lang.CharSequence) "tedesco", (int) '4', 117);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 117");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(locale6);
        org.junit.Assert.assertEquals(locale6.toString(), "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(locale8);
        org.junit.Assert.assertEquals(locale8.toString(), "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(objArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray13), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray13), "[]");
        org.junit.Assert.assertNotNull(printWriter15);
    }

    @Test
    public void test00150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00150");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl((int) 'u', (int) (byte) 1, (int) '#');
        hypergeometricDistributionImpl3.setPopulationSize(117);
        double double7 = hypergeometricDistributionImpl3.probability((double) 0);
        hypergeometricDistributionImpl3.setNumberOfSuccesses(100);
        // The following exception was thrown during execution in test generation
        try {
            hypergeometricDistributionImpl3.setSampleSize((-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: sample size must be non-negative.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.7008547008546866d + "'", double7 == 0.7008547008546866d);
    }

    @Test
    public void test00151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00151");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl((int) 'u', (int) (byte) 1, (int) '#');
        int int4 = hypergeometricDistributionImpl3.getSampleSize();
        int int5 = hypergeometricDistributionImpl3.getPopulationSize();
        double double7 = hypergeometricDistributionImpl3.upperCumulativeProbability((int) '#');
        // The following exception was thrown during execution in test generation
        try {
            hypergeometricDistributionImpl3.setNumberOfSuccesses((-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: number of successes must be non-negative.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 35 + "'", int4 == 35);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 117 + "'", int5 == 117);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
    }

    @Test
    public void test00152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00152");
        java.io.PrintStream printStream1 = new java.io.PrintStream("zh_CN");
        printStream1.println();
        java.io.PrintStream printStream4 = printStream1.append('#');
        printStream1.close();
        byte[] byteArray9 = new byte[] { (byte) 1, (byte) 10, (byte) -1 };
        printStream1.write(byteArray9);
        // The following exception was thrown during execution in test generation
        try {
            java.io.PrintStream printStream13 = new java.io.PrintStream((java.io.OutputStream) printStream1, false, "\u65e5\u672c\u8a9e");
            org.junit.Assert.fail("Expected exception of type java.io.UnsupportedEncodingException; message: ???");
        } catch (java.io.UnsupportedEncodingException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(printStream4);
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray9), "[1, 10, -1]");
    }

    @Test
    public void test00153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00153");
        java.io.PrintWriter printWriter1 = new java.io.PrintWriter("fr");
        printWriter1.print("it_IT");
        java.util.Locale locale4 = java.util.Locale.ROOT;
        boolean boolean5 = locale4.hasExtensions();
        java.util.Locale locale6 = java.util.Locale.ROOT;
        java.lang.String str7 = locale4.getDisplayName(locale6);
        java.util.Locale locale8 = java.util.Locale.ROOT;
        boolean boolean9 = locale8.hasExtensions();
        java.lang.String str10 = locale4.getDisplayCountry(locale8);
        java.lang.Object[] objArray13 = new java.lang.Object[] {};
        org.apache.commons.math.MathException mathException14 = new org.apache.commons.math.MathException("hi!", objArray13);
        java.io.PrintWriter printWriter15 = printWriter1.printf(locale8, "it_IT", objArray13);
        java.io.PrintWriter printWriter18 = new java.io.PrintWriter("fr");
        printWriter18.print("it_IT");
        java.util.Locale locale22 = java.util.Locale.forLanguageTag("");
        java.lang.Object[] objArray25 = new java.lang.Object[] {};
        org.apache.commons.math.MathException mathException26 = new org.apache.commons.math.MathException("hi!", objArray25);
        java.lang.Throwable[] throwableArray27 = mathException26.getSuppressed();
        java.lang.Throwable[] throwableArray28 = mathException26.getSuppressed();
        java.io.PrintWriter printWriter29 = printWriter18.printf(locale22, "it_IT", (java.lang.Object[]) throwableArray28);
        java.io.PrintWriter printWriter30 = printWriter1.format("it_IT", (java.lang.Object[]) throwableArray28);
        java.io.PrintWriter printWriter32 = printWriter1.append('u');
        // The following exception was thrown during execution in test generation
        try {
            printWriter1.write("", 10, (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 45");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(locale6);
        org.junit.Assert.assertEquals(locale6.toString(), "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(locale8);
        org.junit.Assert.assertEquals(locale8.toString(), "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(objArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray13), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray13), "[]");
        org.junit.Assert.assertNotNull(printWriter15);
        org.junit.Assert.assertNotNull(locale22);
        org.junit.Assert.assertEquals(locale22.toString(), "");
        org.junit.Assert.assertNotNull(objArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray25), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray25), "[]");
        org.junit.Assert.assertNotNull(throwableArray27);
        org.junit.Assert.assertNotNull(throwableArray28);
        org.junit.Assert.assertNotNull(printWriter29);
        org.junit.Assert.assertNotNull(printWriter30);
        org.junit.Assert.assertNotNull(printWriter32);
    }

    @Test
    public void test00154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00154");
        // The following exception was thrown during execution in test generation
        try {
            java.io.PrintWriter printWriter2 = new java.io.PrintWriter("org.apache.commons.math.MathException", "");
            org.junit.Assert.fail("Expected exception of type java.io.UnsupportedEncodingException; message: ");
        } catch (java.io.UnsupportedEncodingException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00155");
        java.io.PrintStream printStream1 = new java.io.PrintStream("zh_CN");
        printStream1.print((float) (byte) -1);
        printStream1.println();
        printStream1.print("ita");
        java.util.Locale locale8 = new java.util.Locale("Italy");
        java.lang.Object[] objArray11 = new java.lang.Object[] {};
        org.apache.commons.math.MathException mathException12 = new org.apache.commons.math.MathException("hi!", objArray11);
        java.lang.Throwable[] throwableArray13 = mathException12.getSuppressed();
        java.lang.Throwable[] throwableArray14 = mathException12.getSuppressed();
        java.io.PrintStream printStream15 = printStream1.printf(locale8, "chinois", (java.lang.Object[]) throwableArray14);
        java.io.PrintStream printStream17 = new java.io.PrintStream("zh_CN");
        printStream17.println();
        java.io.PrintStream printStream20 = printStream17.append('#');
        printStream17.close();
        byte[] byteArray25 = new byte[] { (byte) 1, (byte) 10, (byte) -1 };
        printStream17.write(byteArray25);
        printStream17.write((int) 'a');
        java.io.PrintStream printStream29 = new java.io.PrintStream((java.io.OutputStream) printStream17);
        java.io.PrintStream printStream31 = printStream17.append((java.lang.CharSequence) "italiano (Italia)");
        boolean boolean32 = locale8.equals((java.lang.Object) printStream31);
        org.junit.Assert.assertEquals(locale8.toString(), "italy");
        org.junit.Assert.assertNotNull(objArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray11), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray11), "[]");
        org.junit.Assert.assertNotNull(throwableArray13);
        org.junit.Assert.assertNotNull(throwableArray14);
        org.junit.Assert.assertNotNull(printStream15);
        org.junit.Assert.assertNotNull(printStream20);
        org.junit.Assert.assertNotNull(byteArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray25), "[1, 10, -1]");
        org.junit.Assert.assertNotNull(printStream31);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
    }

    @Test
    public void test00156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00156");
        java.io.PrintStream printStream1 = new java.io.PrintStream("zh_CN");
        printStream1.println();
        java.io.PrintStream printStream4 = new java.io.PrintStream("zh_CN");
        printStream4.print((float) (byte) -1);
        printStream4.println();
        printStream4.println();
        java.io.PrintStream printStream10 = new java.io.PrintStream((java.io.OutputStream) printStream4, true);
        java.io.PrintWriter printWriter12 = new java.io.PrintWriter("fr");
        java.io.PrintWriter printWriter14 = printWriter12.append(' ');
        java.io.PrintWriter printWriter17 = new java.io.PrintWriter("fr");
        printWriter17.print("it_IT");
        java.util.Locale locale20 = java.util.Locale.ROOT;
        boolean boolean21 = locale20.hasExtensions();
        java.util.Locale locale22 = java.util.Locale.ROOT;
        java.lang.String str23 = locale20.getDisplayName(locale22);
        java.util.Locale locale24 = java.util.Locale.ROOT;
        boolean boolean25 = locale24.hasExtensions();
        java.lang.String str26 = locale20.getDisplayCountry(locale24);
        java.lang.Object[] objArray29 = new java.lang.Object[] {};
        org.apache.commons.math.MathException mathException30 = new org.apache.commons.math.MathException("hi!", objArray29);
        java.io.PrintWriter printWriter31 = printWriter17.printf(locale24, "it_IT", objArray29);
        java.io.PrintWriter printWriter34 = new java.io.PrintWriter("fr");
        printWriter34.print("it_IT");
        java.util.Locale locale38 = java.util.Locale.forLanguageTag("");
        java.lang.Object[] objArray41 = new java.lang.Object[] {};
        org.apache.commons.math.MathException mathException42 = new org.apache.commons.math.MathException("hi!", objArray41);
        java.lang.Throwable[] throwableArray43 = mathException42.getSuppressed();
        java.lang.Throwable[] throwableArray44 = mathException42.getSuppressed();
        java.io.PrintWriter printWriter45 = printWriter34.printf(locale38, "it_IT", (java.lang.Object[]) throwableArray44);
        java.io.PrintWriter printWriter46 = printWriter17.format("it_IT", (java.lang.Object[]) throwableArray44);
        java.io.PrintWriter printWriter47 = printWriter14.format("zh_CN", (java.lang.Object[]) throwableArray44);
        java.io.PrintStream printStream49 = new java.io.PrintStream("zh_CN");
        printStream49.print((float) (byte) -1);
        char[] charArray54 = new char[] { 'x', 'u' };
        printStream49.println(charArray54);
        printWriter47.print(charArray54);
        printStream4.print(charArray54);
        java.util.Locale locale58 = java.util.Locale.ROOT;
        java.util.Set<java.lang.String> strSet59 = locale58.getUnicodeLocaleKeys();
        java.io.PrintWriter printWriter62 = new java.io.PrintWriter("fr");
        printWriter62.print("it_IT");
        java.util.Locale locale66 = java.util.Locale.forLanguageTag("");
        java.lang.Object[] objArray69 = new java.lang.Object[] {};
        org.apache.commons.math.MathException mathException70 = new org.apache.commons.math.MathException("hi!", objArray69);
        java.lang.Throwable[] throwableArray71 = mathException70.getSuppressed();
        java.lang.Throwable[] throwableArray72 = mathException70.getSuppressed();
        java.io.PrintWriter printWriter73 = printWriter62.printf(locale66, "it_IT", (java.lang.Object[]) throwableArray72);
        java.io.PrintStream printStream74 = printStream4.format(locale58, "hi!", (java.lang.Object[]) throwableArray72);
        java.lang.String str75 = locale58.getLanguage();
        java.lang.Object[] objArray78 = new java.lang.Object[] {};
        org.apache.commons.math.MathException mathException79 = new org.apache.commons.math.MathException("hi!", objArray78);
        java.lang.Throwable[] throwableArray80 = mathException79.getSuppressed();
        java.lang.Throwable[] throwableArray81 = mathException79.getSuppressed();
        java.io.PrintStream printStream82 = printStream1.printf(locale58, "", (java.lang.Object[]) throwableArray81);
        // The following exception was thrown during execution in test generation
        try {
            java.io.PrintStream printStream86 = printStream1.append((java.lang.CharSequence) "italiano (Italia)", (int) (byte) 100, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: -100");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(printWriter14);
        org.junit.Assert.assertNotNull(locale20);
        org.junit.Assert.assertEquals(locale20.toString(), "");
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(locale22);
        org.junit.Assert.assertEquals(locale22.toString(), "");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertNotNull(locale24);
        org.junit.Assert.assertEquals(locale24.toString(), "");
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
        org.junit.Assert.assertNotNull(objArray29);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray29), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray29), "[]");
        org.junit.Assert.assertNotNull(printWriter31);
        org.junit.Assert.assertNotNull(locale38);
        org.junit.Assert.assertEquals(locale38.toString(), "");
        org.junit.Assert.assertNotNull(objArray41);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray41), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray41), "[]");
        org.junit.Assert.assertNotNull(throwableArray43);
        org.junit.Assert.assertNotNull(throwableArray44);
        org.junit.Assert.assertNotNull(printWriter45);
        org.junit.Assert.assertNotNull(printWriter46);
        org.junit.Assert.assertNotNull(printWriter47);
        org.junit.Assert.assertNotNull(charArray54);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray54), "xu");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray54), "xu");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray54), "[x, u]");
        org.junit.Assert.assertNotNull(locale58);
        org.junit.Assert.assertEquals(locale58.toString(), "");
        org.junit.Assert.assertNotNull(strSet59);
        org.junit.Assert.assertNotNull(locale66);
        org.junit.Assert.assertEquals(locale66.toString(), "");
        org.junit.Assert.assertNotNull(objArray69);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray69), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray69), "[]");
        org.junit.Assert.assertNotNull(throwableArray71);
        org.junit.Assert.assertNotNull(throwableArray72);
        org.junit.Assert.assertNotNull(printWriter73);
        org.junit.Assert.assertNotNull(printStream74);
        org.junit.Assert.assertEquals("'" + str75 + "' != '" + "" + "'", str75, "");
        org.junit.Assert.assertNotNull(objArray78);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray78), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray78), "[]");
        org.junit.Assert.assertNotNull(throwableArray80);
        org.junit.Assert.assertNotNull(throwableArray81);
        org.junit.Assert.assertNotNull(printStream82);
    }

    @Test
    public void test00157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00157");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl((int) 'u', (int) (byte) 1, (int) '#');
        int int4 = hypergeometricDistributionImpl3.getSampleSize();
        int int5 = hypergeometricDistributionImpl3.getPopulationSize();
        // The following exception was thrown during execution in test generation
        try {
            double double8 = hypergeometricDistributionImpl3.cumulativeProbability((double) 117, (double) (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: lower endpoint must be less than or equal to upper endpoint");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 35 + "'", int4 == 35);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 117 + "'", int5 == 117);
    }

    @Test
    public void test00158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00158");
        java.io.PrintWriter printWriter1 = new java.io.PrintWriter("fr");
        java.io.PrintWriter printWriter3 = new java.io.PrintWriter("fr");
        printWriter3.print("it_IT");
        java.util.Locale locale7 = java.util.Locale.forLanguageTag("");
        java.lang.Object[] objArray10 = new java.lang.Object[] {};
        org.apache.commons.math.MathException mathException11 = new org.apache.commons.math.MathException("hi!", objArray10);
        java.lang.Throwable[] throwableArray12 = mathException11.getSuppressed();
        java.lang.Throwable[] throwableArray13 = mathException11.getSuppressed();
        java.io.PrintWriter printWriter14 = printWriter3.printf(locale7, "it_IT", (java.lang.Object[]) throwableArray13);
        java.io.PrintWriter printWriter17 = new java.io.PrintWriter("fr");
        printWriter17.print("it_IT");
        java.util.Locale locale20 = java.util.Locale.ROOT;
        boolean boolean21 = locale20.hasExtensions();
        java.util.Locale locale22 = java.util.Locale.ROOT;
        java.lang.String str23 = locale20.getDisplayName(locale22);
        java.util.Locale locale24 = java.util.Locale.ROOT;
        boolean boolean25 = locale24.hasExtensions();
        java.lang.String str26 = locale20.getDisplayCountry(locale24);
        java.lang.Object[] objArray29 = new java.lang.Object[] {};
        org.apache.commons.math.MathException mathException30 = new org.apache.commons.math.MathException("hi!", objArray29);
        java.io.PrintWriter printWriter31 = printWriter17.printf(locale24, "it_IT", objArray29);
        java.io.PrintWriter printWriter32 = printWriter1.printf(locale7, "fr", objArray29);
        char[] charArray33 = null;
        // The following exception was thrown during execution in test generation
        try {
            printWriter32.write(charArray33);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(locale7);
        org.junit.Assert.assertEquals(locale7.toString(), "");
        org.junit.Assert.assertNotNull(objArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray10), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray10), "[]");
        org.junit.Assert.assertNotNull(throwableArray12);
        org.junit.Assert.assertNotNull(throwableArray13);
        org.junit.Assert.assertNotNull(printWriter14);
        org.junit.Assert.assertNotNull(locale20);
        org.junit.Assert.assertEquals(locale20.toString(), "");
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(locale22);
        org.junit.Assert.assertEquals(locale22.toString(), "");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertNotNull(locale24);
        org.junit.Assert.assertEquals(locale24.toString(), "");
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
        org.junit.Assert.assertNotNull(objArray29);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray29), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray29), "[]");
        org.junit.Assert.assertNotNull(printWriter31);
        org.junit.Assert.assertNotNull(printWriter32);
    }

    @Test
    public void test00159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00159");
        java.io.PrintWriter printWriter1 = new java.io.PrintWriter("fr");
        printWriter1.println();
        boolean boolean3 = printWriter1.checkError();
        java.io.PrintWriter printWriter5 = new java.io.PrintWriter((java.io.Writer) printWriter1, false);
        printWriter1.println('a');
        // The following exception was thrown during execution in test generation
        try {
            java.io.PrintWriter printWriter11 = printWriter1.append((java.lang.CharSequence) "\u30a4\u30bf\u30ea\u30a2\u8a9e\u30a4\u30bf\u30ea\u30a2)", (int) (short) 100, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: -90");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test00160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00160");
        java.io.PrintWriter printWriter1 = new java.io.PrintWriter("fr");
        printWriter1.print("it_IT");
        java.util.Locale locale4 = java.util.Locale.ROOT;
        boolean boolean5 = locale4.hasExtensions();
        java.util.Locale locale6 = java.util.Locale.ROOT;
        java.lang.String str7 = locale4.getDisplayName(locale6);
        java.util.Locale locale8 = java.util.Locale.ROOT;
        boolean boolean9 = locale8.hasExtensions();
        java.lang.String str10 = locale4.getDisplayCountry(locale8);
        java.lang.Object[] objArray13 = new java.lang.Object[] {};
        org.apache.commons.math.MathException mathException14 = new org.apache.commons.math.MathException("hi!", objArray13);
        java.io.PrintWriter printWriter15 = printWriter1.printf(locale8, "it_IT", objArray13);
        printWriter15.print((double) 100L);
        java.util.Locale locale18 = java.util.Locale.JAPANESE;
        java.util.Locale locale19 = java.util.Locale.JAPANESE;
        java.lang.String str20 = locale18.getDisplayCountry(locale19);
        java.lang.String str21 = locale18.getVariant();
        java.lang.String str22 = locale18.getCountry();
        java.io.PrintStream printStream25 = new java.io.PrintStream("zh_CN");
        printStream25.print((float) (byte) -1);
        printStream25.println();
        printStream25.print("ita");
        java.util.Locale locale31 = java.util.Locale.FRENCH;
        java.util.Set<java.lang.String> strSet32 = locale31.getUnicodeLocaleKeys();
        java.util.Locale locale33 = locale31.stripExtensions();
        java.lang.Object[] objArray36 = new java.lang.Object[] {};
        org.apache.commons.math.MathException mathException37 = new org.apache.commons.math.MathException("hi!", objArray36);
        java.lang.Throwable[] throwableArray38 = mathException37.getSuppressed();
        java.lang.Throwable[] throwableArray39 = mathException37.getSuppressed();
        java.io.PrintStream printStream40 = printStream25.printf(locale33, "fr", (java.lang.Object[]) throwableArray39);
        java.io.PrintWriter printWriter41 = printWriter15.format(locale18, "fra", (java.lang.Object[]) throwableArray39);
        char[] charArray42 = new char[] {};
        printWriter15.print(charArray42);
        // The following exception was thrown during execution in test generation
        try {
            java.io.PrintWriter printWriter47 = printWriter15.append((java.lang.CharSequence) "\u65e5\u672c\u8a9e", (int) (short) 0, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 97");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(locale6);
        org.junit.Assert.assertEquals(locale6.toString(), "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(locale8);
        org.junit.Assert.assertEquals(locale8.toString(), "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(objArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray13), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray13), "[]");
        org.junit.Assert.assertNotNull(printWriter15);
        org.junit.Assert.assertNotNull(locale18);
        org.junit.Assert.assertEquals(locale18.toString(), "ja");
        org.junit.Assert.assertNotNull(locale19);
        org.junit.Assert.assertEquals(locale19.toString(), "ja");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertNotNull(locale31);
        org.junit.Assert.assertEquals(locale31.toString(), "fr");
        org.junit.Assert.assertNotNull(strSet32);
        org.junit.Assert.assertNotNull(locale33);
        org.junit.Assert.assertEquals(locale33.toString(), "fr");
        org.junit.Assert.assertNotNull(objArray36);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray36), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray36), "[]");
        org.junit.Assert.assertNotNull(throwableArray38);
        org.junit.Assert.assertNotNull(throwableArray39);
        org.junit.Assert.assertNotNull(printStream40);
        org.junit.Assert.assertNotNull(printWriter41);
        org.junit.Assert.assertNotNull(charArray42);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray42), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray42), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray42), "[]");
    }

    @Test
    public void test00161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00161");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clearExtensions();
        java.util.Locale.Builder builder2 = builder1.clearExtensions();
        java.util.Locale.Builder builder4 = builder2.setVariant("anglais");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder6 = builder4.removeUnicodeLocaleAttribute("it_IT");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed Unicode locale attribute: it_IT [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
    }

    @Test
    public void test00162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00162");
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<java.util.Locale.LanguageRange> languageRangeList1 = java.util.Locale.LanguageRange.parse("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: range=");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00163");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl((int) 'u', (int) (byte) 1, (int) '#');
        hypergeometricDistributionImpl3.setPopulationSize(117);
        int int6 = hypergeometricDistributionImpl3.getSampleSize();
        // The following exception was thrown during execution in test generation
        try {
            double double9 = hypergeometricDistributionImpl3.cumulativeProbability(10, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: lower endpoint must be less than or equal to upper endpoint");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 35 + "'", int6 == 35);
    }

    @Test
    public void test00164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00164");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clearExtensions();
        java.util.Locale.Builder builder2 = builder1.clear();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder4 = builder1.removeUnicodeLocaleAttribute("Italian (Italy)");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed Unicode locale attribute: Italian (Italy) [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(builder2);
    }

    @Test
    public void test00165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00165");
        // The following exception was thrown during execution in test generation
        try {
            java.io.PrintWriter printWriter2 = new java.io.PrintWriter("", "cinese");
            org.junit.Assert.fail("Expected exception of type java.io.UnsupportedEncodingException; message: cinese");
        } catch (java.io.UnsupportedEncodingException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00166");
        java.io.PrintWriter printWriter1 = new java.io.PrintWriter("fr");
        printWriter1.print("it_IT");
        java.util.Locale locale5 = java.util.Locale.forLanguageTag("");
        java.lang.Object[] objArray8 = new java.lang.Object[] {};
        org.apache.commons.math.MathException mathException9 = new org.apache.commons.math.MathException("hi!", objArray8);
        java.lang.Throwable[] throwableArray10 = mathException9.getSuppressed();
        java.lang.Throwable[] throwableArray11 = mathException9.getSuppressed();
        java.io.PrintWriter printWriter12 = printWriter1.printf(locale5, "it_IT", (java.lang.Object[]) throwableArray11);
        printWriter1.write("fr");
        printWriter1.print((double) (byte) 100);
        printWriter1.println((long) (byte) 1);
        org.junit.Assert.assertNotNull(locale5);
        org.junit.Assert.assertEquals(locale5.toString(), "");
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray8), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray8), "[]");
        org.junit.Assert.assertNotNull(throwableArray10);
        org.junit.Assert.assertNotNull(throwableArray11);
        org.junit.Assert.assertNotNull(printWriter12);
    }

    @Test
    public void test00167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00167");
        java.util.Locale.LanguageRange[] languageRangeArray0 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList1 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList1, languageRangeArray0);
        java.lang.String[] strArray6 = new java.lang.String[] { "", "Italy", "fr" };
        java.util.ArrayList<java.lang.String> strList7 = new java.util.ArrayList<java.lang.String>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList7, strArray6);
        java.util.List<java.lang.String> strList9 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList1, (java.util.Collection<java.lang.String>) strList7);
        java.util.Locale.LanguageRange[] languageRangeArray10 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList11 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean12 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList11, languageRangeArray10);
        java.lang.String[] strArray18 = new java.lang.String[] { "fr", "", "Italy", "", "fr" };
        java.util.ArrayList<java.lang.String> strList19 = new java.util.ArrayList<java.lang.String>();
        boolean boolean20 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList19, strArray18);
        java.util.List<java.lang.String> strList21 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList11, (java.util.Collection<java.lang.String>) strList19);
        java.util.Locale.FilteringMode filteringMode22 = java.util.Locale.FilteringMode.EXTENDED_FILTERING;
        java.util.List<java.lang.String> strList23 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList1, (java.util.Collection<java.lang.String>) strList21, filteringMode22);
        java.util.Locale.LanguageRange[] languageRangeArray24 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList25 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean26 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList25, languageRangeArray24);
        java.util.Collection<java.util.Locale> localeCollection27 = null;
        java.util.Locale locale28 = java.util.Locale.lookup((java.util.List<java.util.Locale.LanguageRange>) languageRangeList25, localeCollection27);
        java.lang.String[] strArray34 = new java.lang.String[] { "hi!", "", "it_IT", "Italy", "" };
        java.util.ArrayList<java.lang.String> strList35 = new java.util.ArrayList<java.lang.String>();
        boolean boolean36 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList35, strArray34);
        java.util.List<java.lang.String> strList37 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList25, (java.util.Collection<java.lang.String>) strList35);
        java.util.List<java.lang.String> strList38 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList1, (java.util.Collection<java.lang.String>) strList35);
        java.util.Locale.LanguageRange[] languageRangeArray39 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList40 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean41 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList40, languageRangeArray39);
        java.lang.String[] strArray45 = new java.lang.String[] { "", "Italy", "fr" };
        java.util.ArrayList<java.lang.String> strList46 = new java.util.ArrayList<java.lang.String>();
        boolean boolean47 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList46, strArray45);
        java.util.List<java.lang.String> strList48 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList40, (java.util.Collection<java.lang.String>) strList46);
        java.util.Locale.LanguageRange[] languageRangeArray49 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList50 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean51 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList50, languageRangeArray49);
        java.util.Collection<java.util.Locale> localeCollection52 = null;
        java.util.Locale locale53 = java.util.Locale.lookup((java.util.List<java.util.Locale.LanguageRange>) languageRangeList50, localeCollection52);
        java.lang.String[] strArray59 = new java.lang.String[] { "hi!", "", "it_IT", "Italy", "" };
        java.util.ArrayList<java.lang.String> strList60 = new java.util.ArrayList<java.lang.String>();
        boolean boolean61 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList60, strArray59);
        java.util.List<java.lang.String> strList62 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList50, (java.util.Collection<java.lang.String>) strList60);
        java.util.List<java.lang.String> strList63 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList40, (java.util.Collection<java.lang.String>) strList62);
        java.lang.String str64 = java.util.Locale.lookupTag((java.util.List<java.util.Locale.LanguageRange>) languageRangeList1, (java.util.Collection<java.lang.String>) strList62);
        java.util.Locale locale65 = java.util.Locale.FRENCH;
        java.util.Set<java.lang.String> strSet66 = locale65.getUnicodeLocaleKeys();
        java.util.Set<java.lang.String> strSet67 = locale65.getUnicodeLocaleAttributes();
        java.util.Set<java.lang.String> strSet68 = locale65.getUnicodeLocaleKeys();
        java.lang.String str69 = java.util.Locale.lookupTag((java.util.List<java.util.Locale.LanguageRange>) languageRangeList1, (java.util.Collection<java.lang.String>) strSet68);
        org.junit.Assert.assertNotNull(languageRangeArray0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(strList9);
        org.junit.Assert.assertNotNull(languageRangeArray10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(strArray18);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertNotNull(strList21);
        org.junit.Assert.assertTrue("'" + filteringMode22 + "' != '" + java.util.Locale.FilteringMode.EXTENDED_FILTERING + "'", filteringMode22.equals(java.util.Locale.FilteringMode.EXTENDED_FILTERING));
        org.junit.Assert.assertNotNull(strList23);
        org.junit.Assert.assertNotNull(languageRangeArray24);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNull(locale28);
        org.junit.Assert.assertNotNull(strArray34);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
        org.junit.Assert.assertNotNull(strList37);
        org.junit.Assert.assertNotNull(strList38);
        org.junit.Assert.assertNotNull(languageRangeArray39);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertNotNull(strArray45);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + true + "'", boolean47 == true);
        org.junit.Assert.assertNotNull(strList48);
        org.junit.Assert.assertNotNull(languageRangeArray49);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertNull(locale53);
        org.junit.Assert.assertNotNull(strArray59);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + true + "'", boolean61 == true);
        org.junit.Assert.assertNotNull(strList62);
        org.junit.Assert.assertNotNull(strList63);
        org.junit.Assert.assertNull(str64);
        org.junit.Assert.assertNotNull(locale65);
        org.junit.Assert.assertEquals(locale65.toString(), "fr");
        org.junit.Assert.assertNotNull(strSet66);
        org.junit.Assert.assertNotNull(strSet67);
        org.junit.Assert.assertNotNull(strSet68);
        org.junit.Assert.assertNull(str69);
    }

    @Test
    public void test00168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00168");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clearExtensions();
        java.util.Locale locale2 = builder1.build();
        java.util.Locale.Builder builder3 = builder1.clearExtensions();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder5 = builder3.removeUnicodeLocaleAttribute("en-GB");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed Unicode locale attribute: en-GB [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "");
        org.junit.Assert.assertNotNull(builder3);
    }

    @Test
    public void test00169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00169");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl((int) 'u', (int) (byte) 1, (int) '#');
        double double6 = hypergeometricDistributionImpl3.cumulativeProbability(0.0d, (double) '4');
        int int7 = hypergeometricDistributionImpl3.getNumberOfSuccesses();
        // The following exception was thrown during execution in test generation
        try {
            int int9 = hypergeometricDistributionImpl3.inverseCumulativeProbability((double) 'u');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: p must be between 0 and 1.0 (inclusive)");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0d + "'", double6 == 1.0d);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
    }

    @Test
    public void test00170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00170");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl((int) 'u', (int) (byte) 1, (int) '#');
        int int4 = hypergeometricDistributionImpl3.getPopulationSize();
        double double6 = hypergeometricDistributionImpl3.cumulativeProbability((int) (short) 100);
        hypergeometricDistributionImpl3.setSampleSize(0);
        // The following exception was thrown during execution in test generation
        try {
            hypergeometricDistributionImpl3.setPopulationSize((int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: population size must be positive.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 117 + "'", int4 == 117);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0d + "'", double6 == 1.0d);
    }

    @Test
    public void test00171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00171");
        java.io.PrintStream printStream1 = new java.io.PrintStream("zh_CN");
        printStream1.print((float) (byte) -1);
        printStream1.println();
        printStream1.print("ita");
        java.util.Locale locale7 = java.util.Locale.FRENCH;
        java.util.Set<java.lang.String> strSet8 = locale7.getUnicodeLocaleKeys();
        java.util.Locale locale9 = locale7.stripExtensions();
        java.lang.Object[] objArray12 = new java.lang.Object[] {};
        org.apache.commons.math.MathException mathException13 = new org.apache.commons.math.MathException("hi!", objArray12);
        java.lang.Throwable[] throwableArray14 = mathException13.getSuppressed();
        java.lang.Throwable[] throwableArray15 = mathException13.getSuppressed();
        java.io.PrintStream printStream16 = printStream1.printf(locale9, "fr", (java.lang.Object[]) throwableArray15);
        printStream16.print(100);
        org.junit.Assert.assertNotNull(locale7);
        org.junit.Assert.assertEquals(locale7.toString(), "fr");
        org.junit.Assert.assertNotNull(strSet8);
        org.junit.Assert.assertNotNull(locale9);
        org.junit.Assert.assertEquals(locale9.toString(), "fr");
        org.junit.Assert.assertNotNull(objArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray12), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray12), "[]");
        org.junit.Assert.assertNotNull(throwableArray14);
        org.junit.Assert.assertNotNull(throwableArray15);
        org.junit.Assert.assertNotNull(printStream16);
    }

    @Test
    public void test00172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00172");
        java.util.Locale locale0 = java.util.Locale.FRANCE;
        boolean boolean1 = locale0.hasExtensions();
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl5 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl((int) 'u', (int) (byte) 1, (int) '#');
        double double8 = hypergeometricDistributionImpl5.cumulativeProbability(0.0d, (double) '4');
        int int9 = hypergeometricDistributionImpl5.getNumberOfSuccesses();
        double double11 = hypergeometricDistributionImpl5.cumulativeProbability((int) (byte) 1);
        boolean boolean12 = locale0.equals((java.lang.Object) (byte) 1);
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "fr_FR");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0d + "'", double8 == 1.0d);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 1.0d + "'", double11 == 1.0d);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test00173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00173");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl((int) 'u', (int) (byte) 1, (int) '#');
        int int4 = hypergeometricDistributionImpl3.getPopulationSize();
        hypergeometricDistributionImpl3.setSampleSize(117);
        double double8 = hypergeometricDistributionImpl3.cumulativeProbability(117);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 117 + "'", int4 == 117);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0d + "'", double8 == 1.0d);
    }

    @Test
    public void test00174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00174");
        // The following exception was thrown during execution in test generation
        try {
            java.io.PrintStream printStream2 = new java.io.PrintStream("chinois", "\u30a4\u30bf\u30ea\u30a2\u8a9e\u30a4\u30bf\u30ea\u30a2)");
            org.junit.Assert.fail("Expected exception of type java.io.UnsupportedEncodingException; message: ????? (????)");
        } catch (java.io.UnsupportedEncodingException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00175");
        java.io.PrintWriter printWriter1 = new java.io.PrintWriter("fr");
        printWriter1.print("it_IT");
        java.util.Locale locale4 = java.util.Locale.ROOT;
        boolean boolean5 = locale4.hasExtensions();
        java.util.Locale locale6 = java.util.Locale.ROOT;
        java.lang.String str7 = locale4.getDisplayName(locale6);
        java.util.Locale locale8 = java.util.Locale.ROOT;
        boolean boolean9 = locale8.hasExtensions();
        java.lang.String str10 = locale4.getDisplayCountry(locale8);
        java.lang.Object[] objArray13 = new java.lang.Object[] {};
        org.apache.commons.math.MathException mathException14 = new org.apache.commons.math.MathException("hi!", objArray13);
        java.io.PrintWriter printWriter15 = printWriter1.printf(locale8, "it_IT", objArray13);
        java.util.Locale locale18 = new java.util.Locale("Italy", "Italy");
        java.lang.String str19 = locale8.getDisplayScript(locale18);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str20 = locale18.getISO3Language();
            org.junit.Assert.fail("Expected exception of type java.util.MissingResourceException; message: Couldn't find 3-letter language code for italy");
        } catch (java.util.MissingResourceException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(locale6);
        org.junit.Assert.assertEquals(locale6.toString(), "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(locale8);
        org.junit.Assert.assertEquals(locale8.toString(), "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(objArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray13), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray13), "[]");
        org.junit.Assert.assertNotNull(printWriter15);
        org.junit.Assert.assertEquals(locale18.toString(), "italy_ITALY");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
    }

    @Test
    public void test00176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00176");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder2 = builder0.setLanguageTag("ita");
        java.util.Locale.Builder builder4 = builder0.setLanguageTag("ITALY");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder6 = builder0.setScript("\u65e5\u672c\u8a9e");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed script: ??? [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
    }

    @Test
    public void test00177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00177");
        java.util.List<java.util.Locale.LanguageRange> languageRangeList0 = null;
        java.util.Locale.LanguageRange[] languageRangeArray1 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList2 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList2, languageRangeArray1);
        java.lang.String[] strArray7 = new java.lang.String[] { "", "Italy", "fr" };
        java.util.ArrayList<java.lang.String> strList8 = new java.util.ArrayList<java.lang.String>();
        boolean boolean9 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList8, strArray7);
        java.util.List<java.lang.String> strList10 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList2, (java.util.Collection<java.lang.String>) strList8);
        java.util.Locale.LanguageRange[] languageRangeArray11 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList12 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean13 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList12, languageRangeArray11);
        java.util.Collection<java.util.Locale> localeCollection14 = null;
        java.util.Locale locale15 = java.util.Locale.lookup((java.util.List<java.util.Locale.LanguageRange>) languageRangeList12, localeCollection14);
        java.lang.String[] strArray21 = new java.lang.String[] { "hi!", "", "it_IT", "Italy", "" };
        java.util.ArrayList<java.lang.String> strList22 = new java.util.ArrayList<java.lang.String>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList22, strArray21);
        java.util.List<java.lang.String> strList24 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList12, (java.util.Collection<java.lang.String>) strList22);
        java.util.List<java.lang.String> strList25 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList2, (java.util.Collection<java.lang.String>) strList24);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str26 = java.util.Locale.lookupTag(languageRangeList0, (java.util.Collection<java.lang.String>) strList24);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(languageRangeArray1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(strList10);
        org.junit.Assert.assertNotNull(languageRangeArray11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNull(locale15);
        org.junit.Assert.assertNotNull(strArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertNotNull(strList24);
        org.junit.Assert.assertNotNull(strList25);
    }

    @Test
    public void test00178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00178");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder2 = builder0.setLanguageTag("ita");
        java.util.Locale locale3 = java.util.Locale.JAPANESE;
        java.util.Locale locale4 = java.util.Locale.JAPANESE;
        java.lang.String str5 = locale3.getDisplayCountry(locale4);
        java.lang.String str6 = locale3.getVariant();
        java.util.Locale locale7 = java.util.Locale.CANADA;
        java.lang.String str8 = locale3.getDisplayScript(locale7);
        boolean boolean9 = locale3.hasExtensions();
        java.util.Locale.Builder builder10 = builder0.setLocale(locale3);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder12 = builder0.setScript("\u30a4\u30bf\u30ea\u30a2\u8a9e\u30a4\u30bf\u30ea\u30a2)");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed script: ????? (????) [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "ja");
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "ja");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(locale7);
        org.junit.Assert.assertEquals(locale7.toString(), "en_CA");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(builder10);
    }

    @Test
    public void test00179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00179");
        java.io.PrintWriter printWriter1 = new java.io.PrintWriter("fr");
        printWriter1.print("it_IT");
        java.lang.Object[] objArray5 = new java.lang.Object[] {};
        java.io.PrintWriter printWriter6 = printWriter1.printf("fr", objArray5);
        printWriter6.print((float) (byte) 100);
        printWriter6.print("Italy");
        java.util.Locale locale11 = java.util.Locale.GERMANY;
        java.io.PrintStream printStream14 = new java.io.PrintStream("zh_CN");
        printStream14.print((float) (byte) -1);
        printStream14.println();
        printStream14.println();
        java.io.PrintStream printStream20 = new java.io.PrintStream((java.io.OutputStream) printStream14, true);
        java.io.PrintWriter printWriter22 = new java.io.PrintWriter("fr");
        java.io.PrintWriter printWriter24 = printWriter22.append(' ');
        java.io.PrintWriter printWriter27 = new java.io.PrintWriter("fr");
        printWriter27.print("it_IT");
        java.util.Locale locale30 = java.util.Locale.ROOT;
        boolean boolean31 = locale30.hasExtensions();
        java.util.Locale locale32 = java.util.Locale.ROOT;
        java.lang.String str33 = locale30.getDisplayName(locale32);
        java.util.Locale locale34 = java.util.Locale.ROOT;
        boolean boolean35 = locale34.hasExtensions();
        java.lang.String str36 = locale30.getDisplayCountry(locale34);
        java.lang.Object[] objArray39 = new java.lang.Object[] {};
        org.apache.commons.math.MathException mathException40 = new org.apache.commons.math.MathException("hi!", objArray39);
        java.io.PrintWriter printWriter41 = printWriter27.printf(locale34, "it_IT", objArray39);
        java.io.PrintWriter printWriter44 = new java.io.PrintWriter("fr");
        printWriter44.print("it_IT");
        java.util.Locale locale48 = java.util.Locale.forLanguageTag("");
        java.lang.Object[] objArray51 = new java.lang.Object[] {};
        org.apache.commons.math.MathException mathException52 = new org.apache.commons.math.MathException("hi!", objArray51);
        java.lang.Throwable[] throwableArray53 = mathException52.getSuppressed();
        java.lang.Throwable[] throwableArray54 = mathException52.getSuppressed();
        java.io.PrintWriter printWriter55 = printWriter44.printf(locale48, "it_IT", (java.lang.Object[]) throwableArray54);
        java.io.PrintWriter printWriter56 = printWriter27.format("it_IT", (java.lang.Object[]) throwableArray54);
        java.io.PrintWriter printWriter57 = printWriter24.format("zh_CN", (java.lang.Object[]) throwableArray54);
        java.io.PrintStream printStream59 = new java.io.PrintStream("zh_CN");
        printStream59.print((float) (byte) -1);
        char[] charArray64 = new char[] { 'x', 'u' };
        printStream59.println(charArray64);
        printWriter57.print(charArray64);
        printStream14.print(charArray64);
        java.util.Locale locale68 = java.util.Locale.ROOT;
        java.util.Set<java.lang.String> strSet69 = locale68.getUnicodeLocaleKeys();
        java.io.PrintWriter printWriter72 = new java.io.PrintWriter("fr");
        printWriter72.print("it_IT");
        java.util.Locale locale76 = java.util.Locale.forLanguageTag("");
        java.lang.Object[] objArray79 = new java.lang.Object[] {};
        org.apache.commons.math.MathException mathException80 = new org.apache.commons.math.MathException("hi!", objArray79);
        java.lang.Throwable[] throwableArray81 = mathException80.getSuppressed();
        java.lang.Throwable[] throwableArray82 = mathException80.getSuppressed();
        java.io.PrintWriter printWriter83 = printWriter72.printf(locale76, "it_IT", (java.lang.Object[]) throwableArray82);
        java.io.PrintStream printStream84 = printStream14.format(locale68, "hi!", (java.lang.Object[]) throwableArray82);
        java.io.PrintWriter printWriter85 = printWriter6.printf(locale11, "", (java.lang.Object[]) throwableArray82);
        java.util.Locale locale86 = locale11.stripExtensions();
        java.util.Locale locale87 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str88 = locale86.getDisplayLanguage(locale87);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray5), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray5), "[]");
        org.junit.Assert.assertNotNull(printWriter6);
        org.junit.Assert.assertNotNull(locale11);
        org.junit.Assert.assertEquals(locale11.toString(), "de_DE");
        org.junit.Assert.assertNotNull(printWriter24);
        org.junit.Assert.assertNotNull(locale30);
        org.junit.Assert.assertEquals(locale30.toString(), "");
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNotNull(locale32);
        org.junit.Assert.assertEquals(locale32.toString(), "");
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "" + "'", str33, "");
        org.junit.Assert.assertNotNull(locale34);
        org.junit.Assert.assertEquals(locale34.toString(), "");
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "" + "'", str36, "");
        org.junit.Assert.assertNotNull(objArray39);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray39), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray39), "[]");
        org.junit.Assert.assertNotNull(printWriter41);
        org.junit.Assert.assertNotNull(locale48);
        org.junit.Assert.assertEquals(locale48.toString(), "");
        org.junit.Assert.assertNotNull(objArray51);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray51), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray51), "[]");
        org.junit.Assert.assertNotNull(throwableArray53);
        org.junit.Assert.assertNotNull(throwableArray54);
        org.junit.Assert.assertNotNull(printWriter55);
        org.junit.Assert.assertNotNull(printWriter56);
        org.junit.Assert.assertNotNull(printWriter57);
        org.junit.Assert.assertNotNull(charArray64);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray64), "xu");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray64), "xu");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray64), "[x, u]");
        org.junit.Assert.assertNotNull(locale68);
        org.junit.Assert.assertEquals(locale68.toString(), "");
        org.junit.Assert.assertNotNull(strSet69);
        org.junit.Assert.assertNotNull(locale76);
        org.junit.Assert.assertEquals(locale76.toString(), "");
        org.junit.Assert.assertNotNull(objArray79);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray79), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray79), "[]");
        org.junit.Assert.assertNotNull(throwableArray81);
        org.junit.Assert.assertNotNull(throwableArray82);
        org.junit.Assert.assertNotNull(printWriter83);
        org.junit.Assert.assertNotNull(printStream84);
        org.junit.Assert.assertNotNull(printWriter85);
        org.junit.Assert.assertNotNull(locale86);
        org.junit.Assert.assertEquals(locale86.toString(), "de_DE");
    }

    @Test
    public void test00180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00180");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl((int) 'u', (int) (byte) 1, (int) '#');
        double double6 = hypergeometricDistributionImpl3.cumulativeProbability(0.0d, (double) '4');
        int int7 = hypergeometricDistributionImpl3.getNumberOfSuccesses();
        double double10 = hypergeometricDistributionImpl3.cumulativeProbability(0.0d, (double) 0L);
        double double12 = hypergeometricDistributionImpl3.probability((int) 'a');
        // The following exception was thrown during execution in test generation
        try {
            double double15 = hypergeometricDistributionImpl3.cumulativeProbability((double) 0L, (double) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: lower endpoint must be less than or equal to upper endpoint");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0d + "'", double6 == 1.0d);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.7008547008546866d + "'", double10 == 0.7008547008546866d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
    }

    @Test
    public void test00181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00181");
        java.io.PrintStream printStream1 = new java.io.PrintStream("zh_CN");
        printStream1.print((float) (byte) -1);
        printStream1.println();
        java.lang.Throwable throwable6 = null;
        org.apache.commons.math.MathException mathException7 = new org.apache.commons.math.MathException(throwable6);
        org.apache.commons.math.MathException mathException8 = new org.apache.commons.math.MathException((java.lang.Throwable) mathException7);
        java.lang.Throwable[] throwableArray9 = mathException7.getSuppressed();
        java.io.PrintStream printStream10 = printStream1.format("italien (Italie)", (java.lang.Object[]) throwableArray9);
        printStream10.print('x');
        java.lang.Object obj13 = null;
        printStream10.println(obj13);
        org.junit.Assert.assertNotNull(throwableArray9);
        org.junit.Assert.assertNotNull(printStream10);
    }

    @Test
    public void test00182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00182");
        java.io.PrintStream printStream1 = new java.io.PrintStream("zh_CN");
        printStream1.print((float) (byte) -1);
        printStream1.println();
        printStream1.println();
        printStream1.println((float) ' ');
        printStream1.println((double) 0L);
        java.io.PrintWriter printWriter11 = new java.io.PrintWriter((java.io.OutputStream) printStream1, true);
        printWriter11.println(true);
        printWriter11.print(true);
        printWriter11.flush();
    }

    @Test
    public void test00183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00183");
        // The following exception was thrown during execution in test generation
        try {
            java.io.PrintStream printStream2 = new java.io.PrintStream("hi! (ITALY)", "fra");
            org.junit.Assert.fail("Expected exception of type java.io.UnsupportedEncodingException; message: fra");
        } catch (java.io.UnsupportedEncodingException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00184");
        java.util.Locale locale0 = java.util.Locale.FRENCH;
        java.util.Set<java.lang.String> strSet1 = locale0.getUnicodeLocaleKeys();
        java.lang.String str2 = locale0.toString();
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "fr");
        org.junit.Assert.assertNotNull(strSet1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "fr" + "'", str2, "fr");
    }

    @Test
    public void test00185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00185");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clearExtensions();
        java.util.Locale.Builder builder2 = builder1.clearExtensions();
        java.util.Locale.Builder builder4 = builder2.setVariant("anglais");
        java.util.Locale locale5 = builder4.build();
        java.lang.Object obj6 = locale5.clone();
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(locale5);
        org.junit.Assert.assertEquals(locale5.toString(), "");
        org.junit.Assert.assertNotNull(obj6);
        org.junit.Assert.assertEquals(obj6.toString(), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj6), "");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj6), "");
    }

    @Test
    public void test00186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00186");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clearExtensions();
        java.util.Locale.Builder builder3 = builder0.removeUnicodeLocaleAttribute("fra");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder5 = builder3.setVariant("\u65e5\u672c\u8a9e");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed variant: ??? [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(builder3);
    }

    @Test
    public void test00187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00187");
        java.io.PrintStream printStream1 = new java.io.PrintStream("ita");
        // The following exception was thrown during execution in test generation
        try {
            java.io.PrintStream printStream4 = new java.io.PrintStream((java.io.OutputStream) printStream1, true, "de");
            org.junit.Assert.fail("Expected exception of type java.io.UnsupportedEncodingException; message: de");
        } catch (java.io.UnsupportedEncodingException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00188");
        java.io.File file0 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.io.PrintWriter printWriter2 = new java.io.PrintWriter(file0, "japonais");
            org.junit.Assert.fail("Expected exception of type java.io.UnsupportedEncodingException; message: japonais");
        } catch (java.io.UnsupportedEncodingException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00189");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.LanguageRange languageRange1 = new java.util.Locale.LanguageRange("hi! (ITALY)");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: range=hi! (italy)");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00190");
        java.io.PrintStream printStream1 = new java.io.PrintStream("zh_CN");
        printStream1.print((float) (byte) -1);
        char[] charArray6 = new char[] { 'x', 'u' };
        printStream1.println(charArray6);
        java.util.Locale locale10 = new java.util.Locale("en-GB", "Italy");
        java.lang.String str11 = locale10.getCountry();
        java.io.PrintStream printStream14 = new java.io.PrintStream("zh_CN");
        printStream14.print((float) (byte) -1);
        printStream14.println();
        java.lang.Throwable throwable19 = null;
        org.apache.commons.math.MathException mathException20 = new org.apache.commons.math.MathException(throwable19);
        org.apache.commons.math.MathException mathException21 = new org.apache.commons.math.MathException((java.lang.Throwable) mathException20);
        java.lang.Throwable[] throwableArray22 = mathException20.getSuppressed();
        java.io.PrintStream printStream23 = printStream14.format("italien (Italie)", (java.lang.Object[]) throwableArray22);
        java.io.PrintStream printStream24 = printStream1.printf(locale10, "fr-CA", (java.lang.Object[]) throwableArray22);
        // The following exception was thrown during execution in test generation
        try {
            java.io.PrintStream printStream28 = printStream24.append((java.lang.CharSequence) "\u30a4\u30bf\u30ea\u30a2\u8a9e\u30a4\u30bf\u30ea\u30a2)", (int) (byte) 100, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 100");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray6);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray6), "xu");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray6), "xu");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray6), "[x, u]");
        org.junit.Assert.assertEquals(locale10.toString(), "en-gb_ITALY");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "ITALY" + "'", str11, "ITALY");
        org.junit.Assert.assertNotNull(throwableArray22);
        org.junit.Assert.assertNotNull(printStream23);
        org.junit.Assert.assertNotNull(printStream24);
    }

    @Test
    public void test00191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00191");
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<java.util.Locale.LanguageRange> languageRangeList2 = java.util.Locale.LanguageRange.parse("org.apache.commons.math.MathException", strMap1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: range=org.apache.commons.math.mathexception");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00192");
        java.io.PrintStream printStream1 = new java.io.PrintStream("zh_CN");
        printStream1.print((float) (byte) -1);
        printStream1.println();
        printStream1.println();
        printStream1.println((float) ' ');
        printStream1.println("hi!");
        printStream1.println('4');
        java.io.PrintWriter printWriter13 = new java.io.PrintWriter("fr");
        printWriter13.print("it_IT");
        java.lang.Object[] objArray17 = new java.lang.Object[] {};
        java.io.PrintWriter printWriter18 = printWriter13.printf("fr", objArray17);
        printWriter18.print((float) (byte) 100);
        printWriter18.print("Italy");
        java.util.Locale locale23 = java.util.Locale.GERMANY;
        java.io.PrintStream printStream26 = new java.io.PrintStream("zh_CN");
        printStream26.print((float) (byte) -1);
        printStream26.println();
        printStream26.println();
        java.io.PrintStream printStream32 = new java.io.PrintStream((java.io.OutputStream) printStream26, true);
        java.io.PrintWriter printWriter34 = new java.io.PrintWriter("fr");
        java.io.PrintWriter printWriter36 = printWriter34.append(' ');
        java.io.PrintWriter printWriter39 = new java.io.PrintWriter("fr");
        printWriter39.print("it_IT");
        java.util.Locale locale42 = java.util.Locale.ROOT;
        boolean boolean43 = locale42.hasExtensions();
        java.util.Locale locale44 = java.util.Locale.ROOT;
        java.lang.String str45 = locale42.getDisplayName(locale44);
        java.util.Locale locale46 = java.util.Locale.ROOT;
        boolean boolean47 = locale46.hasExtensions();
        java.lang.String str48 = locale42.getDisplayCountry(locale46);
        java.lang.Object[] objArray51 = new java.lang.Object[] {};
        org.apache.commons.math.MathException mathException52 = new org.apache.commons.math.MathException("hi!", objArray51);
        java.io.PrintWriter printWriter53 = printWriter39.printf(locale46, "it_IT", objArray51);
        java.io.PrintWriter printWriter56 = new java.io.PrintWriter("fr");
        printWriter56.print("it_IT");
        java.util.Locale locale60 = java.util.Locale.forLanguageTag("");
        java.lang.Object[] objArray63 = new java.lang.Object[] {};
        org.apache.commons.math.MathException mathException64 = new org.apache.commons.math.MathException("hi!", objArray63);
        java.lang.Throwable[] throwableArray65 = mathException64.getSuppressed();
        java.lang.Throwable[] throwableArray66 = mathException64.getSuppressed();
        java.io.PrintWriter printWriter67 = printWriter56.printf(locale60, "it_IT", (java.lang.Object[]) throwableArray66);
        java.io.PrintWriter printWriter68 = printWriter39.format("it_IT", (java.lang.Object[]) throwableArray66);
        java.io.PrintWriter printWriter69 = printWriter36.format("zh_CN", (java.lang.Object[]) throwableArray66);
        java.io.PrintStream printStream71 = new java.io.PrintStream("zh_CN");
        printStream71.print((float) (byte) -1);
        char[] charArray76 = new char[] { 'x', 'u' };
        printStream71.println(charArray76);
        printWriter69.print(charArray76);
        printStream26.print(charArray76);
        java.util.Locale locale80 = java.util.Locale.ROOT;
        java.util.Set<java.lang.String> strSet81 = locale80.getUnicodeLocaleKeys();
        java.io.PrintWriter printWriter84 = new java.io.PrintWriter("fr");
        printWriter84.print("it_IT");
        java.util.Locale locale88 = java.util.Locale.forLanguageTag("");
        java.lang.Object[] objArray91 = new java.lang.Object[] {};
        org.apache.commons.math.MathException mathException92 = new org.apache.commons.math.MathException("hi!", objArray91);
        java.lang.Throwable[] throwableArray93 = mathException92.getSuppressed();
        java.lang.Throwable[] throwableArray94 = mathException92.getSuppressed();
        java.io.PrintWriter printWriter95 = printWriter84.printf(locale88, "it_IT", (java.lang.Object[]) throwableArray94);
        java.io.PrintStream printStream96 = printStream26.format(locale80, "hi!", (java.lang.Object[]) throwableArray94);
        java.io.PrintWriter printWriter97 = printWriter18.printf(locale23, "", (java.lang.Object[]) throwableArray94);
        printStream1.print((java.lang.Object) "");
        printStream1.flush();
        org.junit.Assert.assertNotNull(objArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray17), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray17), "[]");
        org.junit.Assert.assertNotNull(printWriter18);
        org.junit.Assert.assertNotNull(locale23);
        org.junit.Assert.assertEquals(locale23.toString(), "de_DE");
        org.junit.Assert.assertNotNull(printWriter36);
        org.junit.Assert.assertNotNull(locale42);
        org.junit.Assert.assertEquals(locale42.toString(), "");
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertNotNull(locale44);
        org.junit.Assert.assertEquals(locale44.toString(), "");
        org.junit.Assert.assertEquals("'" + str45 + "' != '" + "" + "'", str45, "");
        org.junit.Assert.assertNotNull(locale46);
        org.junit.Assert.assertEquals(locale46.toString(), "");
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertEquals("'" + str48 + "' != '" + "" + "'", str48, "");
        org.junit.Assert.assertNotNull(objArray51);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray51), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray51), "[]");
        org.junit.Assert.assertNotNull(printWriter53);
        org.junit.Assert.assertNotNull(locale60);
        org.junit.Assert.assertEquals(locale60.toString(), "");
        org.junit.Assert.assertNotNull(objArray63);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray63), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray63), "[]");
        org.junit.Assert.assertNotNull(throwableArray65);
        org.junit.Assert.assertNotNull(throwableArray66);
        org.junit.Assert.assertNotNull(printWriter67);
        org.junit.Assert.assertNotNull(printWriter68);
        org.junit.Assert.assertNotNull(printWriter69);
        org.junit.Assert.assertNotNull(charArray76);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray76), "xu");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray76), "xu");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray76), "[x, u]");
        org.junit.Assert.assertNotNull(locale80);
        org.junit.Assert.assertEquals(locale80.toString(), "");
        org.junit.Assert.assertNotNull(strSet81);
        org.junit.Assert.assertNotNull(locale88);
        org.junit.Assert.assertEquals(locale88.toString(), "");
        org.junit.Assert.assertNotNull(objArray91);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray91), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray91), "[]");
        org.junit.Assert.assertNotNull(throwableArray93);
        org.junit.Assert.assertNotNull(throwableArray94);
        org.junit.Assert.assertNotNull(printWriter95);
        org.junit.Assert.assertNotNull(printStream96);
        org.junit.Assert.assertNotNull(printWriter97);
    }

    @Test
    public void test00193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00193");
        java.io.PrintStream printStream1 = new java.io.PrintStream("zh_CN");
        printStream1.println();
        java.io.PrintStream printStream4 = printStream1.append('#');
        printStream1.close();
        byte[] byteArray10 = new byte[] { (byte) -1, (byte) 100, (byte) -1, (byte) -1 };
        printStream1.write(byteArray10);
        printStream1.print(false);
        printStream1.println("Italy");
        // The following exception was thrown during execution in test generation
        try {
            java.io.PrintStream printStream18 = new java.io.PrintStream((java.io.OutputStream) printStream1, false, "italiano (Italia)");
            org.junit.Assert.fail("Expected exception of type java.io.UnsupportedEncodingException; message: italiano (Italia)");
        } catch (java.io.UnsupportedEncodingException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(printStream4);
        org.junit.Assert.assertNotNull(byteArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray10), "[-1, 100, -1, -1]");
    }

    @Test
    public void test00194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00194");
        java.util.Locale locale0 = java.util.Locale.FRENCH;
        java.util.Set<java.lang.String> strSet1 = locale0.getUnicodeLocaleKeys();
        java.util.Set<java.lang.String> strSet2 = locale0.getUnicodeLocaleAttributes();
        java.util.Set<java.lang.String> strSet3 = locale0.getUnicodeLocaleKeys();
        java.lang.String str5 = locale0.getExtension('x');
        java.io.PrintStream printStream7 = new java.io.PrintStream("zh_CN");
        printStream7.print((float) (byte) -1);
        printStream7.println();
        printStream7.println();
        java.io.PrintStream printStream13 = new java.io.PrintStream((java.io.OutputStream) printStream7, true);
        java.io.PrintWriter printWriter15 = new java.io.PrintWriter("fr");
        printWriter15.print("it_IT");
        java.util.Locale locale18 = java.util.Locale.ROOT;
        boolean boolean19 = locale18.hasExtensions();
        java.util.Locale locale20 = java.util.Locale.ROOT;
        java.lang.String str21 = locale18.getDisplayName(locale20);
        java.util.Locale locale22 = java.util.Locale.ROOT;
        boolean boolean23 = locale22.hasExtensions();
        java.lang.String str24 = locale18.getDisplayCountry(locale22);
        java.lang.Object[] objArray27 = new java.lang.Object[] {};
        org.apache.commons.math.MathException mathException28 = new org.apache.commons.math.MathException("hi!", objArray27);
        java.io.PrintWriter printWriter29 = printWriter15.printf(locale22, "it_IT", objArray27);
        printStream13.println((java.lang.Object) "it_IT");
        java.io.PrintStream printStream32 = printStream13.append((java.lang.CharSequence) "fr");
        java.io.PrintStream printStream34 = new java.io.PrintStream((java.io.OutputStream) printStream32, false);
        java.io.PrintWriter printWriter36 = new java.io.PrintWriter((java.io.OutputStream) printStream32, true);
        boolean boolean37 = locale0.equals((java.lang.Object) printWriter36);
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "fr");
        org.junit.Assert.assertNotNull(strSet1);
        org.junit.Assert.assertNotNull(strSet2);
        org.junit.Assert.assertNotNull(strSet3);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(locale18);
        org.junit.Assert.assertEquals(locale18.toString(), "");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(locale20);
        org.junit.Assert.assertEquals(locale20.toString(), "");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertNotNull(locale22);
        org.junit.Assert.assertEquals(locale22.toString(), "");
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
        org.junit.Assert.assertNotNull(objArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray27), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray27), "[]");
        org.junit.Assert.assertNotNull(printWriter29);
        org.junit.Assert.assertNotNull(printStream32);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
    }

    @Test
    public void test00195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00195");
        java.util.Locale locale0 = java.util.Locale.TAIWAN;
        java.lang.Object obj1 = locale0.clone();
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "zh_TW");
        org.junit.Assert.assertNotNull(obj1);
        org.junit.Assert.assertEquals(obj1.toString(), "zh_TW");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj1), "zh_TW");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj1), "zh_TW");
    }

    @Test
    public void test00196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00196");
        java.io.PrintStream printStream1 = new java.io.PrintStream("zh_CN");
        printStream1.print((float) (byte) -1);
        printStream1.println();
        printStream1.println();
        java.io.PrintStream printStream7 = new java.io.PrintStream((java.io.OutputStream) printStream1, true);
        java.io.PrintWriter printWriter9 = new java.io.PrintWriter("fr");
        java.io.PrintWriter printWriter11 = printWriter9.append(' ');
        java.io.PrintWriter printWriter14 = new java.io.PrintWriter("fr");
        printWriter14.print("it_IT");
        java.util.Locale locale17 = java.util.Locale.ROOT;
        boolean boolean18 = locale17.hasExtensions();
        java.util.Locale locale19 = java.util.Locale.ROOT;
        java.lang.String str20 = locale17.getDisplayName(locale19);
        java.util.Locale locale21 = java.util.Locale.ROOT;
        boolean boolean22 = locale21.hasExtensions();
        java.lang.String str23 = locale17.getDisplayCountry(locale21);
        java.lang.Object[] objArray26 = new java.lang.Object[] {};
        org.apache.commons.math.MathException mathException27 = new org.apache.commons.math.MathException("hi!", objArray26);
        java.io.PrintWriter printWriter28 = printWriter14.printf(locale21, "it_IT", objArray26);
        java.io.PrintWriter printWriter31 = new java.io.PrintWriter("fr");
        printWriter31.print("it_IT");
        java.util.Locale locale35 = java.util.Locale.forLanguageTag("");
        java.lang.Object[] objArray38 = new java.lang.Object[] {};
        org.apache.commons.math.MathException mathException39 = new org.apache.commons.math.MathException("hi!", objArray38);
        java.lang.Throwable[] throwableArray40 = mathException39.getSuppressed();
        java.lang.Throwable[] throwableArray41 = mathException39.getSuppressed();
        java.io.PrintWriter printWriter42 = printWriter31.printf(locale35, "it_IT", (java.lang.Object[]) throwableArray41);
        java.io.PrintWriter printWriter43 = printWriter14.format("it_IT", (java.lang.Object[]) throwableArray41);
        java.io.PrintWriter printWriter44 = printWriter11.format("zh_CN", (java.lang.Object[]) throwableArray41);
        java.io.PrintStream printStream46 = new java.io.PrintStream("zh_CN");
        printStream46.print((float) (byte) -1);
        char[] charArray51 = new char[] { 'x', 'u' };
        printStream46.println(charArray51);
        printWriter44.print(charArray51);
        printStream1.print(charArray51);
        java.util.Locale locale55 = java.util.Locale.ROOT;
        java.util.Set<java.lang.String> strSet56 = locale55.getUnicodeLocaleKeys();
        java.io.PrintWriter printWriter59 = new java.io.PrintWriter("fr");
        printWriter59.print("it_IT");
        java.util.Locale locale63 = java.util.Locale.forLanguageTag("");
        java.lang.Object[] objArray66 = new java.lang.Object[] {};
        org.apache.commons.math.MathException mathException67 = new org.apache.commons.math.MathException("hi!", objArray66);
        java.lang.Throwable[] throwableArray68 = mathException67.getSuppressed();
        java.lang.Throwable[] throwableArray69 = mathException67.getSuppressed();
        java.io.PrintWriter printWriter70 = printWriter59.printf(locale63, "it_IT", (java.lang.Object[]) throwableArray69);
        java.io.PrintStream printStream71 = printStream1.format(locale55, "hi!", (java.lang.Object[]) throwableArray69);
        // The following exception was thrown during execution in test generation
        try {
            java.io.PrintStream printStream75 = printStream71.append((java.lang.CharSequence) "anglais", 100, 1);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: -99");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(printWriter11);
        org.junit.Assert.assertNotNull(locale17);
        org.junit.Assert.assertEquals(locale17.toString(), "");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(locale19);
        org.junit.Assert.assertEquals(locale19.toString(), "");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertNotNull(locale21);
        org.junit.Assert.assertEquals(locale21.toString(), "");
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertNotNull(objArray26);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray26), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray26), "[]");
        org.junit.Assert.assertNotNull(printWriter28);
        org.junit.Assert.assertNotNull(locale35);
        org.junit.Assert.assertEquals(locale35.toString(), "");
        org.junit.Assert.assertNotNull(objArray38);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray38), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray38), "[]");
        org.junit.Assert.assertNotNull(throwableArray40);
        org.junit.Assert.assertNotNull(throwableArray41);
        org.junit.Assert.assertNotNull(printWriter42);
        org.junit.Assert.assertNotNull(printWriter43);
        org.junit.Assert.assertNotNull(printWriter44);
        org.junit.Assert.assertNotNull(charArray51);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray51), "xu");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray51), "xu");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray51), "[x, u]");
        org.junit.Assert.assertNotNull(locale55);
        org.junit.Assert.assertEquals(locale55.toString(), "");
        org.junit.Assert.assertNotNull(strSet56);
        org.junit.Assert.assertNotNull(locale63);
        org.junit.Assert.assertEquals(locale63.toString(), "");
        org.junit.Assert.assertNotNull(objArray66);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray66), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray66), "[]");
        org.junit.Assert.assertNotNull(throwableArray68);
        org.junit.Assert.assertNotNull(throwableArray69);
        org.junit.Assert.assertNotNull(printWriter70);
        org.junit.Assert.assertNotNull(printStream71);
    }

    @Test
    public void test00197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00197");
        java.io.PrintWriter printWriter1 = new java.io.PrintWriter("fr");
        printWriter1.print("it_IT");
        java.util.Locale locale5 = java.util.Locale.forLanguageTag("");
        java.lang.Object[] objArray8 = new java.lang.Object[] {};
        org.apache.commons.math.MathException mathException9 = new org.apache.commons.math.MathException("hi!", objArray8);
        java.lang.Throwable[] throwableArray10 = mathException9.getSuppressed();
        java.lang.Throwable[] throwableArray11 = mathException9.getSuppressed();
        java.io.PrintWriter printWriter12 = printWriter1.printf(locale5, "it_IT", (java.lang.Object[]) throwableArray11);
        java.lang.String str13 = locale5.getLanguage();
        java.util.Set<java.lang.String> strSet14 = locale5.getUnicodeLocaleAttributes();
        java.lang.String str15 = locale5.getDisplayCountry();
        java.lang.Object obj16 = locale5.clone();
        org.junit.Assert.assertNotNull(locale5);
        org.junit.Assert.assertEquals(locale5.toString(), "");
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray8), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray8), "[]");
        org.junit.Assert.assertNotNull(throwableArray10);
        org.junit.Assert.assertNotNull(throwableArray11);
        org.junit.Assert.assertNotNull(printWriter12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNotNull(strSet14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertNotNull(obj16);
        org.junit.Assert.assertEquals(obj16.toString(), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj16), "");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj16), "");
    }

    @Test
    public void test00198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00198");
        // The following exception was thrown during execution in test generation
        try {
            java.io.PrintWriter printWriter2 = new java.io.PrintWriter("fran\347ais (France)", "ita");
            org.junit.Assert.fail("Expected exception of type java.io.UnsupportedEncodingException; message: ita");
        } catch (java.io.UnsupportedEncodingException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00199");
        java.util.Locale locale0 = java.util.Locale.ITALIAN;
        java.lang.String str1 = locale0.getDisplayName();
        java.lang.String str2 = locale0.getCountry();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str4 = locale0.getUnicodeLocaleType("italiano");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Ill-formed Unicode locale key: italiano");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "it");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "italien" + "'", str1, "italien");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test00200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00200");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.LanguageRange languageRange2 = new java.util.Locale.LanguageRange("zh_CN", (double) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: weight=35.0");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00201");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clearExtensions();
        java.util.Locale.Builder builder3 = builder1.setLanguageTag("fr");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder6 = builder3.setUnicodeLocaleKeyword("\u30a4\u30bf\u30ea\u30a2\u8a9e\u30a4\u30bf\u30ea\u30a2)", "org.apache.commons.math.MathException");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed Unicode locale keyword key: ????? (????) [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(builder3);
    }

    @Test
    public void test00202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00202");
        java.util.Locale locale2 = new java.util.Locale("en-GB", "Italy");
        java.lang.String str3 = locale2.toLanguageTag();
        java.util.Locale locale4 = java.util.Locale.JAPANESE;
        java.lang.String str5 = locale4.getISO3Country();
        java.lang.String str6 = locale4.getDisplayCountry();
        java.lang.String str7 = locale4.getVariant();
        java.lang.String str8 = locale2.getDisplayVariant(locale4);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str10 = locale4.getUnicodeLocaleType("org.apache.commons.math.MathException: hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Ill-formed Unicode locale key: org.apache.commons.math.MathException: hi!");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals(locale2.toString(), "en-gb_ITALY");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "und" + "'", str3, "und");
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "ja");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test00203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00203");
        java.io.PrintStream printStream1 = new java.io.PrintStream("zh_CN");
        printStream1.print((float) (byte) -1);
        printStream1.println();
        printStream1.println();
        java.io.PrintStream printStream7 = new java.io.PrintStream((java.io.OutputStream) printStream1, true);
        java.io.PrintWriter printWriter9 = new java.io.PrintWriter("fr");
        printWriter9.print("it_IT");
        java.util.Locale locale12 = java.util.Locale.ROOT;
        boolean boolean13 = locale12.hasExtensions();
        java.util.Locale locale14 = java.util.Locale.ROOT;
        java.lang.String str15 = locale12.getDisplayName(locale14);
        java.util.Locale locale16 = java.util.Locale.ROOT;
        boolean boolean17 = locale16.hasExtensions();
        java.lang.String str18 = locale12.getDisplayCountry(locale16);
        java.lang.Object[] objArray21 = new java.lang.Object[] {};
        org.apache.commons.math.MathException mathException22 = new org.apache.commons.math.MathException("hi!", objArray21);
        java.io.PrintWriter printWriter23 = printWriter9.printf(locale16, "it_IT", objArray21);
        printStream7.println((java.lang.Object) "it_IT");
        java.io.PrintStream printStream26 = printStream7.append((java.lang.CharSequence) "fr");
        printStream26.println((float) 117);
        printStream26.println((long) (byte) 10);
        // The following exception was thrown during execution in test generation
        try {
            java.io.PrintStream printStream33 = new java.io.PrintStream((java.io.OutputStream) printStream26, true, "zh_CN");
            org.junit.Assert.fail("Expected exception of type java.io.UnsupportedEncodingException; message: zh_CN");
        } catch (java.io.UnsupportedEncodingException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(locale12);
        org.junit.Assert.assertEquals(locale12.toString(), "");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(locale14);
        org.junit.Assert.assertEquals(locale14.toString(), "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertNotNull(locale16);
        org.junit.Assert.assertEquals(locale16.toString(), "");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertNotNull(objArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray21), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray21), "[]");
        org.junit.Assert.assertNotNull(printWriter23);
        org.junit.Assert.assertNotNull(printStream26);
    }

    @Test
    public void test00204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00204");
        java.io.PrintWriter printWriter1 = new java.io.PrintWriter("fr");
        printWriter1.print("it_IT");
        java.lang.Object[] objArray5 = new java.lang.Object[] {};
        java.io.PrintWriter printWriter6 = printWriter1.printf("fr", objArray5);
        printWriter1.println((float) 'u');
        printWriter1.write("en-GB");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl14 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl((int) 'u', (int) (byte) 1, (int) '#');
        int int15 = hypergeometricDistributionImpl14.getSampleSize();
        int int16 = hypergeometricDistributionImpl14.getPopulationSize();
        double double18 = hypergeometricDistributionImpl14.upperCumulativeProbability((int) '#');
        int int19 = hypergeometricDistributionImpl14.getPopulationSize();
        int int20 = hypergeometricDistributionImpl14.getNumberOfSuccesses();
        hypergeometricDistributionImpl14.setNumberOfSuccesses((int) (byte) 10);
        printWriter1.print((java.lang.Object) hypergeometricDistributionImpl14);
        // The following exception was thrown during execution in test generation
        try {
            double double26 = hypergeometricDistributionImpl14.cumulativeProbability((int) (short) 0, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: lower endpoint must be less than or equal to upper endpoint");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray5), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray5), "[]");
        org.junit.Assert.assertNotNull(printWriter6);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 35 + "'", int15 == 35);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 117 + "'", int16 == 117);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 0.0d + "'", double18 == 0.0d);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 117 + "'", int19 == 117);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1 + "'", int20 == 1);
    }

    @Test
    public void test00205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00205");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl((int) 'u', (int) (byte) 1, (int) '#');
        int int4 = hypergeometricDistributionImpl3.getPopulationSize();
        double double6 = hypergeometricDistributionImpl3.cumulativeProbability((int) (short) 100);
        // The following exception was thrown during execution in test generation
        try {
            int int8 = hypergeometricDistributionImpl3.inverseCumulativeProbability((double) 100.0f);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: p must be between 0 and 1.0 (inclusive)");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 117 + "'", int4 == 117);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0d + "'", double6 == 1.0d);
    }

    @Test
    public void test00206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00206");
        java.util.Locale locale1 = new java.util.Locale("org.apache.commons.math.MathException");
        java.lang.Object obj2 = locale1.clone();
        org.junit.Assert.assertEquals(locale1.toString(), "org.apache.commons.math.mathexception");
        org.junit.Assert.assertNotNull(obj2);
        org.junit.Assert.assertEquals(obj2.toString(), "org.apache.commons.math.mathexception");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj2), "org.apache.commons.math.mathexception");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj2), "org.apache.commons.math.mathexception");
    }

    @Test
    public void test00207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00207");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clearExtensions();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder4 = builder0.setExtension('4', "");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed extension key: 4 [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder1);
    }

    @Test
    public void test00208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00208");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clearExtensions();
        java.util.Locale.Builder builder2 = builder1.clearExtensions();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder4 = builder1.setRegion("en-gb");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed region: en-gb [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(builder2);
    }

    @Test
    public void test00209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00209");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl((int) 'u', (int) (byte) 1, (int) '#');
        hypergeometricDistributionImpl3.setPopulationSize(117);
        double double7 = hypergeometricDistributionImpl3.probability((double) 0);
        hypergeometricDistributionImpl3.setNumberOfSuccesses(100);
        // The following exception was thrown during execution in test generation
        try {
            int int11 = hypergeometricDistributionImpl3.inverseCumulativeProbability((double) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: p must be between 0 and 1.0 (inclusive)");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.7008547008546866d + "'", double7 == 0.7008547008546866d);
    }

    @Test
    public void test00210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00210");
        java.lang.Throwable throwable1 = null;
        org.apache.commons.math.MathException mathException2 = new org.apache.commons.math.MathException(throwable1);
        org.apache.commons.math.MathException mathException3 = new org.apache.commons.math.MathException((java.lang.Throwable) mathException2);
        java.lang.Throwable[] throwableArray4 = mathException2.getSuppressed();
        org.apache.commons.math.MathException mathException5 = new org.apache.commons.math.MathException("hi!", (java.lang.Object[]) throwableArray4);
        java.lang.String str6 = mathException5.toString();
        org.junit.Assert.assertNotNull(throwableArray4);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "org.apache.commons.math.MathException: hi!" + "'", str6, "org.apache.commons.math.MathException: hi!");
    }

    @Test
    public void test00211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00211");
        java.io.PrintStream printStream1 = new java.io.PrintStream("zh_CN");
        printStream1.println();
        java.io.PrintStream printStream4 = printStream1.append('#');
        printStream1.close();
        byte[] byteArray9 = new byte[] { (byte) 1, (byte) 10, (byte) -1 };
        printStream1.write(byteArray9);
        printStream1.write((int) 'a');
        java.io.PrintStream printStream13 = new java.io.PrintStream((java.io.OutputStream) printStream1);
        printStream13.print(false);
        java.util.Locale locale18 = new java.util.Locale("hi!", "Italy");
        boolean boolean19 = locale18.hasExtensions();
        java.lang.String str20 = locale18.getVariant();
        java.io.PrintWriter printWriter23 = new java.io.PrintWriter("fr");
        java.io.PrintWriter printWriter25 = printWriter23.append(' ');
        java.io.PrintWriter printWriter28 = new java.io.PrintWriter("fr");
        printWriter28.print("it_IT");
        java.util.Locale locale31 = java.util.Locale.ROOT;
        boolean boolean32 = locale31.hasExtensions();
        java.util.Locale locale33 = java.util.Locale.ROOT;
        java.lang.String str34 = locale31.getDisplayName(locale33);
        java.util.Locale locale35 = java.util.Locale.ROOT;
        boolean boolean36 = locale35.hasExtensions();
        java.lang.String str37 = locale31.getDisplayCountry(locale35);
        java.lang.Object[] objArray40 = new java.lang.Object[] {};
        org.apache.commons.math.MathException mathException41 = new org.apache.commons.math.MathException("hi!", objArray40);
        java.io.PrintWriter printWriter42 = printWriter28.printf(locale35, "it_IT", objArray40);
        java.io.PrintWriter printWriter45 = new java.io.PrintWriter("fr");
        printWriter45.print("it_IT");
        java.util.Locale locale49 = java.util.Locale.forLanguageTag("");
        java.lang.Object[] objArray52 = new java.lang.Object[] {};
        org.apache.commons.math.MathException mathException53 = new org.apache.commons.math.MathException("hi!", objArray52);
        java.lang.Throwable[] throwableArray54 = mathException53.getSuppressed();
        java.lang.Throwable[] throwableArray55 = mathException53.getSuppressed();
        java.io.PrintWriter printWriter56 = printWriter45.printf(locale49, "it_IT", (java.lang.Object[]) throwableArray55);
        java.io.PrintWriter printWriter57 = printWriter28.format("it_IT", (java.lang.Object[]) throwableArray55);
        java.io.PrintWriter printWriter58 = printWriter25.format("zh_CN", (java.lang.Object[]) throwableArray55);
        java.io.PrintStream printStream59 = printStream13.format(locale18, "zh_CN", (java.lang.Object[]) throwableArray55);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str60 = locale18.getISO3Country();
            org.junit.Assert.fail("Expected exception of type java.util.MissingResourceException; message: Couldn't find 3-letter country code for ITALY");
        } catch (java.util.MissingResourceException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(printStream4);
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray9), "[1, 10, -1]");
        org.junit.Assert.assertEquals(locale18.toString(), "hi!_ITALY");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertNotNull(printWriter25);
        org.junit.Assert.assertNotNull(locale31);
        org.junit.Assert.assertEquals(locale31.toString(), "");
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertNotNull(locale33);
        org.junit.Assert.assertEquals(locale33.toString(), "");
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "" + "'", str34, "");
        org.junit.Assert.assertNotNull(locale35);
        org.junit.Assert.assertEquals(locale35.toString(), "");
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "" + "'", str37, "");
        org.junit.Assert.assertNotNull(objArray40);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray40), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray40), "[]");
        org.junit.Assert.assertNotNull(printWriter42);
        org.junit.Assert.assertNotNull(locale49);
        org.junit.Assert.assertEquals(locale49.toString(), "");
        org.junit.Assert.assertNotNull(objArray52);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray52), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray52), "[]");
        org.junit.Assert.assertNotNull(throwableArray54);
        org.junit.Assert.assertNotNull(throwableArray55);
        org.junit.Assert.assertNotNull(printWriter56);
        org.junit.Assert.assertNotNull(printWriter57);
        org.junit.Assert.assertNotNull(printWriter58);
        org.junit.Assert.assertNotNull(printStream59);
    }

    @Test
    public void test00212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00212");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl((int) 'u', (int) (byte) 1, (int) '#');
        int int4 = hypergeometricDistributionImpl3.getPopulationSize();
        double double6 = hypergeometricDistributionImpl3.cumulativeProbability((int) (short) 100);
        int int7 = hypergeometricDistributionImpl3.getPopulationSize();
        double double10 = hypergeometricDistributionImpl3.cumulativeProbability(0, (int) 'a');
        int int11 = hypergeometricDistributionImpl3.getSampleSize();
        int int12 = hypergeometricDistributionImpl3.getNumberOfSuccesses();
        // The following exception was thrown during execution in test generation
        try {
            int int14 = hypergeometricDistributionImpl3.inverseCumulativeProbability((double) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: p must be between 0 and 1.0 (inclusive)");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 117 + "'", int4 == 117);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0d + "'", double6 == 1.0d);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 117 + "'", int7 == 117);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 1.0d + "'", double10 == 1.0d);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 35 + "'", int11 == 35);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
    }

    @Test
    public void test00213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00213");
        java.io.File file0 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.io.PrintWriter printWriter2 = new java.io.PrintWriter(file0, "Canada");
            org.junit.Assert.fail("Expected exception of type java.io.UnsupportedEncodingException; message: Canada");
        } catch (java.io.UnsupportedEncodingException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00214");
        java.util.Locale.Category category0 = null;
        java.io.PrintWriter printWriter2 = new java.io.PrintWriter("fr");
        printWriter2.print("it_IT");
        java.util.Locale locale5 = java.util.Locale.ROOT;
        boolean boolean6 = locale5.hasExtensions();
        java.util.Locale locale7 = java.util.Locale.ROOT;
        java.lang.String str8 = locale5.getDisplayName(locale7);
        java.util.Locale locale9 = java.util.Locale.ROOT;
        boolean boolean10 = locale9.hasExtensions();
        java.lang.String str11 = locale5.getDisplayCountry(locale9);
        java.lang.Object[] objArray14 = new java.lang.Object[] {};
        org.apache.commons.math.MathException mathException15 = new org.apache.commons.math.MathException("hi!", objArray14);
        java.io.PrintWriter printWriter16 = printWriter2.printf(locale9, "it_IT", objArray14);
        printWriter16.print((double) 100L);
        java.util.Locale locale19 = java.util.Locale.JAPANESE;
        java.util.Locale locale20 = java.util.Locale.JAPANESE;
        java.lang.String str21 = locale19.getDisplayCountry(locale20);
        java.lang.String str22 = locale19.getVariant();
        java.lang.String str23 = locale19.getCountry();
        java.io.PrintStream printStream26 = new java.io.PrintStream("zh_CN");
        printStream26.print((float) (byte) -1);
        printStream26.println();
        printStream26.print("ita");
        java.util.Locale locale32 = java.util.Locale.FRENCH;
        java.util.Set<java.lang.String> strSet33 = locale32.getUnicodeLocaleKeys();
        java.util.Locale locale34 = locale32.stripExtensions();
        java.lang.Object[] objArray37 = new java.lang.Object[] {};
        org.apache.commons.math.MathException mathException38 = new org.apache.commons.math.MathException("hi!", objArray37);
        java.lang.Throwable[] throwableArray39 = mathException38.getSuppressed();
        java.lang.Throwable[] throwableArray40 = mathException38.getSuppressed();
        java.io.PrintStream printStream41 = printStream26.printf(locale34, "fr", (java.lang.Object[]) throwableArray40);
        java.io.PrintWriter printWriter42 = printWriter16.format(locale19, "fra", (java.lang.Object[]) throwableArray40);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.setDefault(category0, locale19);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Category cannot be NULL");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(locale5);
        org.junit.Assert.assertEquals(locale5.toString(), "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(locale7);
        org.junit.Assert.assertEquals(locale7.toString(), "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(locale9);
        org.junit.Assert.assertEquals(locale9.toString(), "");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNotNull(objArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray14), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray14), "[]");
        org.junit.Assert.assertNotNull(printWriter16);
        org.junit.Assert.assertNotNull(locale19);
        org.junit.Assert.assertEquals(locale19.toString(), "ja");
        org.junit.Assert.assertNotNull(locale20);
        org.junit.Assert.assertEquals(locale20.toString(), "ja");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertNotNull(locale32);
        org.junit.Assert.assertEquals(locale32.toString(), "fr");
        org.junit.Assert.assertNotNull(strSet33);
        org.junit.Assert.assertNotNull(locale34);
        org.junit.Assert.assertEquals(locale34.toString(), "fr");
        org.junit.Assert.assertNotNull(objArray37);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray37), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray37), "[]");
        org.junit.Assert.assertNotNull(throwableArray39);
        org.junit.Assert.assertNotNull(throwableArray40);
        org.junit.Assert.assertNotNull(printStream41);
        org.junit.Assert.assertNotNull(printWriter42);
    }

    @Test
    public void test00215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00215");
        java.util.List<java.util.Locale.LanguageRange> languageRangeList1 = java.util.Locale.LanguageRange.parse("ja");
        java.util.Locale.LanguageRange[] languageRangeArray2 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList3 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList3, languageRangeArray2);
        java.lang.String[] strArray8 = new java.lang.String[] { "", "Italy", "fr" };
        java.util.ArrayList<java.lang.String> strList9 = new java.util.ArrayList<java.lang.String>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList9, strArray8);
        java.util.List<java.lang.String> strList11 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList3, (java.util.Collection<java.lang.String>) strList9);
        java.util.Locale.LanguageRange[] languageRangeArray12 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList13 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean14 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList13, languageRangeArray12);
        java.lang.String[] strArray20 = new java.lang.String[] { "fr", "", "Italy", "", "fr" };
        java.util.ArrayList<java.lang.String> strList21 = new java.util.ArrayList<java.lang.String>();
        boolean boolean22 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList21, strArray20);
        java.util.List<java.lang.String> strList23 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList13, (java.util.Collection<java.lang.String>) strList21);
        java.util.Locale.FilteringMode filteringMode24 = java.util.Locale.FilteringMode.EXTENDED_FILTERING;
        java.util.List<java.lang.String> strList25 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList3, (java.util.Collection<java.lang.String>) strList23, filteringMode24);
        java.util.Locale.LanguageRange[] languageRangeArray26 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList27 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean28 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList27, languageRangeArray26);
        java.util.Collection<java.util.Locale> localeCollection29 = null;
        java.util.Locale locale30 = java.util.Locale.lookup((java.util.List<java.util.Locale.LanguageRange>) languageRangeList27, localeCollection29);
        java.lang.String[] strArray32 = new java.lang.String[] { "hi!" };
        java.util.ArrayList<java.lang.String> strList33 = new java.util.ArrayList<java.lang.String>();
        boolean boolean34 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList33, strArray32);
        java.lang.String str35 = java.util.Locale.lookupTag((java.util.List<java.util.Locale.LanguageRange>) languageRangeList27, (java.util.Collection<java.lang.String>) strList33);
        java.util.Locale locale36 = java.util.Locale.ROOT;
        boolean boolean37 = locale36.hasExtensions();
        java.lang.String str38 = locale36.getCountry();
        java.util.Locale locale39 = java.util.Locale.JAPAN;
        java.util.Locale locale40 = java.util.Locale.FRENCH;
        java.util.Locale locale44 = new java.util.Locale("", "", "");
        java.util.Locale[] localeArray45 = new java.util.Locale[] { locale36, locale39, locale40, locale44 };
        java.util.ArrayList<java.util.Locale> localeList46 = new java.util.ArrayList<java.util.Locale>();
        boolean boolean47 = java.util.Collections.addAll((java.util.Collection<java.util.Locale>) localeList46, localeArray45);
        java.util.List<java.util.Locale> localeList48 = java.util.Locale.filter((java.util.List<java.util.Locale.LanguageRange>) languageRangeList27, (java.util.Collection<java.util.Locale>) localeList46);
        java.util.Locale.LanguageRange[] languageRangeArray49 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList50 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean51 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList50, languageRangeArray49);
        java.util.Collection<java.util.Locale> localeCollection52 = null;
        java.util.Locale locale53 = java.util.Locale.lookup((java.util.List<java.util.Locale.LanguageRange>) languageRangeList50, localeCollection52);
        java.lang.String[] strArray55 = new java.lang.String[] { "hi!" };
        java.util.ArrayList<java.lang.String> strList56 = new java.util.ArrayList<java.lang.String>();
        boolean boolean57 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList56, strArray55);
        java.lang.String str58 = java.util.Locale.lookupTag((java.util.List<java.util.Locale.LanguageRange>) languageRangeList50, (java.util.Collection<java.lang.String>) strList56);
        java.util.Locale locale59 = java.util.Locale.ROOT;
        boolean boolean60 = locale59.hasExtensions();
        java.lang.String str61 = locale59.getCountry();
        java.util.Locale locale62 = java.util.Locale.JAPAN;
        java.util.Locale locale63 = java.util.Locale.FRENCH;
        java.util.Locale locale67 = new java.util.Locale("", "", "");
        java.util.Locale[] localeArray68 = new java.util.Locale[] { locale59, locale62, locale63, locale67 };
        java.util.ArrayList<java.util.Locale> localeList69 = new java.util.ArrayList<java.util.Locale>();
        boolean boolean70 = java.util.Collections.addAll((java.util.Collection<java.util.Locale>) localeList69, localeArray68);
        java.util.List<java.util.Locale> localeList71 = java.util.Locale.filter((java.util.List<java.util.Locale.LanguageRange>) languageRangeList50, (java.util.Collection<java.util.Locale>) localeList69);
        java.util.List<java.util.Locale> localeList72 = java.util.Locale.filter((java.util.List<java.util.Locale.LanguageRange>) languageRangeList27, (java.util.Collection<java.util.Locale>) localeList71);
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap73 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList74 = java.util.Locale.LanguageRange.mapEquivalents((java.util.List<java.util.Locale.LanguageRange>) languageRangeList27, strMap73);
        java.util.Locale locale75 = java.util.Locale.GERMANY;
        java.util.Set<java.lang.String> strSet76 = locale75.getUnicodeLocaleKeys();
        java.util.List<java.lang.String> strList77 = java.util.Locale.filterTags(languageRangeList74, (java.util.Collection<java.lang.String>) strSet76);
        java.util.List<java.lang.String> strList78 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList3, (java.util.Collection<java.lang.String>) strSet76);
        java.lang.String str79 = java.util.Locale.lookupTag(languageRangeList1, (java.util.Collection<java.lang.String>) strList78);
        org.junit.Assert.assertNotNull(languageRangeList1);
        org.junit.Assert.assertNotNull(languageRangeArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(strList11);
        org.junit.Assert.assertNotNull(languageRangeArray12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(strArray20);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertNotNull(strList23);
        org.junit.Assert.assertTrue("'" + filteringMode24 + "' != '" + java.util.Locale.FilteringMode.EXTENDED_FILTERING + "'", filteringMode24.equals(java.util.Locale.FilteringMode.EXTENDED_FILTERING));
        org.junit.Assert.assertNotNull(strList25);
        org.junit.Assert.assertNotNull(languageRangeArray26);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNull(locale30);
        org.junit.Assert.assertNotNull(strArray32);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertNull(str35);
        org.junit.Assert.assertNotNull(locale36);
        org.junit.Assert.assertEquals(locale36.toString(), "");
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "" + "'", str38, "");
        org.junit.Assert.assertNotNull(locale39);
        org.junit.Assert.assertEquals(locale39.toString(), "ja_JP");
        org.junit.Assert.assertNotNull(locale40);
        org.junit.Assert.assertEquals(locale40.toString(), "fr");
        org.junit.Assert.assertEquals(locale44.toString(), "");
        org.junit.Assert.assertNotNull(localeArray45);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + true + "'", boolean47 == true);
        org.junit.Assert.assertNotNull(localeList48);
        org.junit.Assert.assertNotNull(languageRangeArray49);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertNull(locale53);
        org.junit.Assert.assertNotNull(strArray55);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + true + "'", boolean57 == true);
        org.junit.Assert.assertNull(str58);
        org.junit.Assert.assertNotNull(locale59);
        org.junit.Assert.assertEquals(locale59.toString(), "");
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + false + "'", boolean60 == false);
        org.junit.Assert.assertEquals("'" + str61 + "' != '" + "" + "'", str61, "");
        org.junit.Assert.assertNotNull(locale62);
        org.junit.Assert.assertEquals(locale62.toString(), "ja_JP");
        org.junit.Assert.assertNotNull(locale63);
        org.junit.Assert.assertEquals(locale63.toString(), "fr");
        org.junit.Assert.assertEquals(locale67.toString(), "");
        org.junit.Assert.assertNotNull(localeArray68);
        org.junit.Assert.assertTrue("'" + boolean70 + "' != '" + true + "'", boolean70 == true);
        org.junit.Assert.assertNotNull(localeList71);
        org.junit.Assert.assertNotNull(localeList72);
        org.junit.Assert.assertNotNull(languageRangeList74);
        org.junit.Assert.assertNotNull(locale75);
        org.junit.Assert.assertEquals(locale75.toString(), "de_DE");
        org.junit.Assert.assertNotNull(strSet76);
        org.junit.Assert.assertNotNull(strList77);
        org.junit.Assert.assertNotNull(strList78);
        org.junit.Assert.assertNull(str79);
    }

    @Test
    public void test00216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00216");
        java.util.List<java.util.Locale.LanguageRange> languageRangeList0 = null;
        java.util.Locale.LanguageRange[] languageRangeArray1 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList2 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList2, languageRangeArray1);
        java.util.Collection<java.util.Locale> localeCollection4 = null;
        java.util.Locale locale5 = java.util.Locale.lookup((java.util.List<java.util.Locale.LanguageRange>) languageRangeList2, localeCollection4);
        java.lang.String[] strArray7 = new java.lang.String[] { "hi!" };
        java.util.ArrayList<java.lang.String> strList8 = new java.util.ArrayList<java.lang.String>();
        boolean boolean9 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList8, strArray7);
        java.lang.String str10 = java.util.Locale.lookupTag((java.util.List<java.util.Locale.LanguageRange>) languageRangeList2, (java.util.Collection<java.lang.String>) strList8);
        java.util.Locale locale11 = java.util.Locale.ROOT;
        boolean boolean12 = locale11.hasExtensions();
        java.lang.String str13 = locale11.getCountry();
        java.util.Locale locale14 = java.util.Locale.JAPAN;
        java.util.Locale locale15 = java.util.Locale.FRENCH;
        java.util.Locale locale19 = new java.util.Locale("", "", "");
        java.util.Locale[] localeArray20 = new java.util.Locale[] { locale11, locale14, locale15, locale19 };
        java.util.ArrayList<java.util.Locale> localeList21 = new java.util.ArrayList<java.util.Locale>();
        boolean boolean22 = java.util.Collections.addAll((java.util.Collection<java.util.Locale>) localeList21, localeArray20);
        java.util.List<java.util.Locale> localeList23 = java.util.Locale.filter((java.util.List<java.util.Locale.LanguageRange>) languageRangeList2, (java.util.Collection<java.util.Locale>) localeList21);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale locale24 = java.util.Locale.lookup(languageRangeList0, (java.util.Collection<java.util.Locale>) localeList23);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(languageRangeArray1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(locale5);
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNotNull(locale11);
        org.junit.Assert.assertEquals(locale11.toString(), "");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNotNull(locale14);
        org.junit.Assert.assertEquals(locale14.toString(), "ja_JP");
        org.junit.Assert.assertNotNull(locale15);
        org.junit.Assert.assertEquals(locale15.toString(), "fr");
        org.junit.Assert.assertEquals(locale19.toString(), "");
        org.junit.Assert.assertNotNull(localeArray20);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertNotNull(localeList23);
    }

    @Test
    public void test00217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00217");
        java.io.PrintWriter printWriter1 = new java.io.PrintWriter("fr");
        printWriter1.print("it_IT");
        java.lang.Object[] objArray5 = new java.lang.Object[] {};
        java.io.PrintWriter printWriter6 = printWriter1.printf("fr", objArray5);
        printWriter1.println((float) 'u');
        printWriter1.write("en-GB");
        printWriter1.println((java.lang.Object) 100L);
        printWriter1.println((long) 'x');
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray5), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray5), "[]");
        org.junit.Assert.assertNotNull(printWriter6);
    }

    @Test
    public void test00218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00218");
        java.io.File file0 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.io.PrintWriter printWriter2 = new java.io.PrintWriter(file0, "en-GB");
            org.junit.Assert.fail("Expected exception of type java.io.UnsupportedEncodingException; message: en-GB");
        } catch (java.io.UnsupportedEncodingException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00219");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clearExtensions();
        java.util.Locale.Builder builder3 = builder0.setScript("");
        java.util.Locale.Builder builder5 = builder3.removeUnicodeLocaleAttribute("Italy");
        java.util.Locale.Builder builder7 = builder3.setRegion("ja");
        java.util.Locale.Builder builder8 = builder7.clear();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder10 = builder7.setVariant("en-gb");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed variant: en-gb [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(builder8);
    }

    @Test
    public void test00220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00220");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl((int) 'u', (int) (byte) 1, (int) '#');
        int int4 = hypergeometricDistributionImpl3.getPopulationSize();
        double double6 = hypergeometricDistributionImpl3.cumulativeProbability((int) (short) 100);
        int int7 = hypergeometricDistributionImpl3.getPopulationSize();
        double double10 = hypergeometricDistributionImpl3.cumulativeProbability(0, (int) 'a');
        int int11 = hypergeometricDistributionImpl3.getSampleSize();
        int int12 = hypergeometricDistributionImpl3.getNumberOfSuccesses();
        int int13 = hypergeometricDistributionImpl3.getNumberOfSuccesses();
        // The following exception was thrown during execution in test generation
        try {
            int int15 = hypergeometricDistributionImpl3.inverseCumulativeProbability((double) 117);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: p must be between 0 and 1.0 (inclusive)");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 117 + "'", int4 == 117);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0d + "'", double6 == 1.0d);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 117 + "'", int7 == 117);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 1.0d + "'", double10 == 1.0d);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 35 + "'", int11 == 35);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
    }

    @Test
    public void test00221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00221");
        java.io.PrintStream printStream1 = new java.io.PrintStream("zh_CN");
        printStream1.println();
        java.io.PrintStream printStream4 = printStream1.append('#');
        printStream1.close();
        byte[] byteArray9 = new byte[] { (byte) 1, (byte) 10, (byte) -1 };
        printStream1.write(byteArray9);
        printStream1.write((int) 'a');
        java.io.PrintStream printStream13 = new java.io.PrintStream((java.io.OutputStream) printStream1);
        java.io.PrintStream printStream15 = printStream1.append((java.lang.CharSequence) "italiano (Italia)");
        java.io.PrintWriter printWriter16 = new java.io.PrintWriter((java.io.OutputStream) printStream15);
        // The following exception was thrown during execution in test generation
        try {
            printWriter16.write("", (int) '4', (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 53");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(printStream4);
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray9), "[1, 10, -1]");
        org.junit.Assert.assertNotNull(printStream15);
    }

    @Test
    public void test00222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00222");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl((int) 'u', (int) (byte) 1, (int) '#');
        int int4 = hypergeometricDistributionImpl3.getPopulationSize();
        double double6 = hypergeometricDistributionImpl3.cumulativeProbability((int) (short) 100);
        hypergeometricDistributionImpl3.setNumberOfSuccesses(0);
        // The following exception was thrown during execution in test generation
        try {
            double double11 = hypergeometricDistributionImpl3.cumulativeProbability((int) 'u', 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: lower endpoint must be less than or equal to upper endpoint");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 117 + "'", int4 == 117);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0d + "'", double6 == 1.0d);
    }

    @Test
    public void test00223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00223");
        java.util.Locale locale0 = java.util.Locale.CANADA_FRENCH;
        java.lang.String str1 = locale0.getDisplayCountry();
        java.util.Set<java.lang.Character> charSet2 = locale0.getExtensionKeys();
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "fr_CA");
// flaky:         org.junit.Assert.assertEquals("'" + str1 + "' != '" + "\u30ab\u30ca\u30c0" + "'", str1, "\u30ab\u30ca\u30c0");
        org.junit.Assert.assertNotNull(charSet2);
    }

    @Test
    public void test00224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00224");
        // The following exception was thrown during execution in test generation
        try {
            java.io.PrintWriter printWriter1 = new java.io.PrintWriter("\u82f1\u8a9e");
// flaky:             org.junit.Assert.fail("Expected exception of type java.io.FileNotFoundException; message: ?? (Is a directory)");
        } catch (java.io.FileNotFoundException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00225");
        java.util.Locale.LanguageRange languageRange2 = new java.util.Locale.LanguageRange("chinois", 0.0d);
        java.util.Locale.Category category3 = java.util.Locale.Category.FORMAT;
        java.util.Locale locale4 = java.util.Locale.getDefault(category3);
        java.util.Locale locale5 = java.util.Locale.getDefault(category3);
        java.lang.String str6 = locale5.getDisplayScript();
        java.util.Set<java.lang.String> strSet7 = locale5.getUnicodeLocaleAttributes();
        boolean boolean8 = languageRange2.equals((java.lang.Object) locale5);
        org.junit.Assert.assertTrue("'" + category3 + "' != '" + java.util.Locale.Category.FORMAT + "'", category3.equals(java.util.Locale.Category.FORMAT));
        org.junit.Assert.assertNotNull(locale4);
// flaky:         org.junit.Assert.assertEquals(locale4.toString(), "de_DE");
        org.junit.Assert.assertNotNull(locale5);
// flaky:         org.junit.Assert.assertEquals(locale5.toString(), "de_DE");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(strSet7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test00226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00226");
        java.io.PrintWriter printWriter1 = new java.io.PrintWriter("fr");
        printWriter1.print("it_IT");
        java.util.Locale locale4 = java.util.Locale.ROOT;
        boolean boolean5 = locale4.hasExtensions();
        java.util.Locale locale6 = java.util.Locale.ROOT;
        java.lang.String str7 = locale4.getDisplayName(locale6);
        java.util.Locale locale8 = java.util.Locale.ROOT;
        boolean boolean9 = locale8.hasExtensions();
        java.lang.String str10 = locale4.getDisplayCountry(locale8);
        java.lang.Object[] objArray13 = new java.lang.Object[] {};
        org.apache.commons.math.MathException mathException14 = new org.apache.commons.math.MathException("hi!", objArray13);
        java.io.PrintWriter printWriter15 = printWriter1.printf(locale8, "it_IT", objArray13);
        printWriter1.println();
        printWriter1.print(10);
        printWriter1.println("FR");
        // The following exception was thrown during execution in test generation
        try {
            printWriter1.write("\u30a4\u30bf\u30ea\u30a2\u8a9e\u30a4\u30bf\u30ea\u30a2)", 100, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 200");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(locale6);
        org.junit.Assert.assertEquals(locale6.toString(), "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(locale8);
        org.junit.Assert.assertEquals(locale8.toString(), "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(objArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray13), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray13), "[]");
        org.junit.Assert.assertNotNull(printWriter15);
    }

    @Test
    public void test00227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00227");
        java.util.Locale.Category category0 = java.util.Locale.Category.FORMAT;
        java.util.Locale locale1 = java.util.Locale.GERMANY;
        java.util.Set<java.lang.String> strSet2 = locale1.getUnicodeLocaleKeys();
        java.util.Locale.setDefault(category0, locale1);
        java.util.Locale locale4 = java.util.Locale.JAPAN;
        java.lang.String str5 = locale1.getDisplayScript(locale4);
        java.lang.String str6 = locale4.getLanguage();
        org.junit.Assert.assertTrue("'" + category0 + "' != '" + java.util.Locale.Category.FORMAT + "'", category0.equals(java.util.Locale.Category.FORMAT));
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "de_DE");
        org.junit.Assert.assertNotNull(strSet2);
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "ja_JP");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "ja" + "'", str6, "ja");
    }

    @Test
    public void test00228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00228");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl((int) 'u', (int) (byte) 1, (int) '#');
        int int4 = hypergeometricDistributionImpl3.getPopulationSize();
        double double6 = hypergeometricDistributionImpl3.cumulativeProbability((double) (short) -1);
        hypergeometricDistributionImpl3.setSampleSize((int) '#');
        int int9 = hypergeometricDistributionImpl3.getSampleSize();
        int int10 = hypergeometricDistributionImpl3.getNumberOfSuccesses();
        hypergeometricDistributionImpl3.setNumberOfSuccesses((int) (byte) 10);
        double double14 = hypergeometricDistributionImpl3.cumulativeProbability((int) (byte) -1);
        // The following exception was thrown during execution in test generation
        try {
            double double17 = hypergeometricDistributionImpl3.cumulativeProbability((int) 'x', (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: lower endpoint must be less than or equal to upper endpoint");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 117 + "'", int4 == 117);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 35 + "'", int9 == 35);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
    }

    @Test
    public void test00229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00229");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clearExtensions();
        java.util.Locale.Builder builder3 = builder1.setLanguageTag("fr");
        java.util.Locale.Builder builder5 = builder3.setLanguageTag("fr-CA");
        java.util.Locale.Builder builder6 = builder3.clear();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder8 = builder6.setScript("fr-CA");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed script: fr-CA [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder6);
    }

    @Test
    public void test00230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00230");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clearExtensions();
        java.util.Locale locale2 = builder1.build();
        java.util.Locale.Builder builder3 = builder1.clearExtensions();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder6 = builder3.setUnicodeLocaleKeyword("fra", "org.apache.commons.math.MathException: ");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed Unicode locale keyword key: fra [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "");
        org.junit.Assert.assertNotNull(builder3);
    }

    @Test
    public void test00231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00231");
        java.util.Locale locale3 = new java.util.Locale("", "", "");
        java.util.Locale locale4 = locale3.stripExtensions();
        java.io.PrintStream printStream6 = new java.io.PrintStream("zh_CN");
        printStream6.print((float) (byte) -1);
        printStream6.println();
        printStream6.print("ita");
        java.util.Locale locale12 = java.util.Locale.FRENCH;
        java.util.Set<java.lang.String> strSet13 = locale12.getUnicodeLocaleKeys();
        java.util.Locale locale14 = locale12.stripExtensions();
        java.lang.Object[] objArray17 = new java.lang.Object[] {};
        org.apache.commons.math.MathException mathException18 = new org.apache.commons.math.MathException("hi!", objArray17);
        java.lang.Throwable[] throwableArray19 = mathException18.getSuppressed();
        java.lang.Throwable[] throwableArray20 = mathException18.getSuppressed();
        java.io.PrintStream printStream21 = printStream6.printf(locale14, "fr", (java.lang.Object[]) throwableArray20);
        java.lang.String str22 = locale3.getDisplayCountry(locale14);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str24 = locale14.getUnicodeLocaleType("italiano");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Ill-formed Unicode locale key: italiano");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals(locale3.toString(), "");
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "");
        org.junit.Assert.assertNotNull(locale12);
        org.junit.Assert.assertEquals(locale12.toString(), "fr");
        org.junit.Assert.assertNotNull(strSet13);
        org.junit.Assert.assertNotNull(locale14);
        org.junit.Assert.assertEquals(locale14.toString(), "fr");
        org.junit.Assert.assertNotNull(objArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray17), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray17), "[]");
        org.junit.Assert.assertNotNull(throwableArray19);
        org.junit.Assert.assertNotNull(throwableArray20);
        org.junit.Assert.assertNotNull(printStream21);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
    }

    @Test
    public void test00232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00232");
        java.io.PrintWriter printWriter1 = new java.io.PrintWriter("fr");
        printWriter1.println();
        java.io.PrintWriter printWriter5 = new java.io.PrintWriter("fr");
        printWriter5.print("it_IT");
        java.util.Locale locale8 = java.util.Locale.ROOT;
        boolean boolean9 = locale8.hasExtensions();
        java.util.Locale locale10 = java.util.Locale.ROOT;
        java.lang.String str11 = locale8.getDisplayName(locale10);
        java.util.Locale locale12 = java.util.Locale.ROOT;
        boolean boolean13 = locale12.hasExtensions();
        java.lang.String str14 = locale8.getDisplayCountry(locale12);
        java.lang.Object[] objArray17 = new java.lang.Object[] {};
        org.apache.commons.math.MathException mathException18 = new org.apache.commons.math.MathException("hi!", objArray17);
        java.io.PrintWriter printWriter19 = printWriter5.printf(locale12, "it_IT", objArray17);
        java.io.PrintWriter printWriter20 = printWriter1.printf("zh_CN", objArray17);
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl24 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl((int) 'u', (int) (byte) 1, (int) '#');
        int int25 = hypergeometricDistributionImpl24.getPopulationSize();
        double double27 = hypergeometricDistributionImpl24.cumulativeProbability((int) (short) 100);
        hypergeometricDistributionImpl24.setSampleSize(0);
        printWriter1.print((java.lang.Object) hypergeometricDistributionImpl24);
        boolean boolean31 = printWriter1.checkError();
        org.junit.Assert.assertNotNull(locale8);
        org.junit.Assert.assertEquals(locale8.toString(), "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(locale10);
        org.junit.Assert.assertEquals(locale10.toString(), "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNotNull(locale12);
        org.junit.Assert.assertEquals(locale12.toString(), "");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertNotNull(objArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray17), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray17), "[]");
        org.junit.Assert.assertNotNull(printWriter19);
        org.junit.Assert.assertNotNull(printWriter20);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 117 + "'", int25 == 117);
        org.junit.Assert.assertTrue("'" + double27 + "' != '" + 1.0d + "'", double27 == 1.0d);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
    }

    @Test
    public void test00233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00233");
        java.io.PrintStream printStream1 = new java.io.PrintStream("zh_CN");
        printStream1.print((float) (byte) -1);
        printStream1.println();
        printStream1.println();
        java.io.PrintStream printStream7 = new java.io.PrintStream((java.io.OutputStream) printStream1, true);
        java.io.PrintWriter printWriter9 = new java.io.PrintWriter("fr");
        printWriter9.print("it_IT");
        java.util.Locale locale12 = java.util.Locale.ROOT;
        boolean boolean13 = locale12.hasExtensions();
        java.util.Locale locale14 = java.util.Locale.ROOT;
        java.lang.String str15 = locale12.getDisplayName(locale14);
        java.util.Locale locale16 = java.util.Locale.ROOT;
        boolean boolean17 = locale16.hasExtensions();
        java.lang.String str18 = locale12.getDisplayCountry(locale16);
        java.lang.Object[] objArray21 = new java.lang.Object[] {};
        org.apache.commons.math.MathException mathException22 = new org.apache.commons.math.MathException("hi!", objArray21);
        java.io.PrintWriter printWriter23 = printWriter9.printf(locale16, "it_IT", objArray21);
        printStream7.println((java.lang.Object) "it_IT");
        java.io.PrintStream printStream26 = printStream7.append((java.lang.CharSequence) "fr");
        java.io.PrintStream printStream27 = new java.io.PrintStream((java.io.OutputStream) printStream7);
        java.io.PrintStream printStream28 = new java.io.PrintStream((java.io.OutputStream) printStream27);
        printStream28.print((float) 10);
        java.io.PrintStream printStream32 = new java.io.PrintStream("zh_CN");
        byte[] byteArray35 = new byte[] { (byte) -1, (byte) 1 };
        printStream32.write(byteArray35, (int) (byte) 0, 0);
        // The following exception was thrown during execution in test generation
        try {
            printStream28.write(byteArray35, (int) '4', 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(locale12);
        org.junit.Assert.assertEquals(locale12.toString(), "");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(locale14);
        org.junit.Assert.assertEquals(locale14.toString(), "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertNotNull(locale16);
        org.junit.Assert.assertEquals(locale16.toString(), "");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertNotNull(objArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray21), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray21), "[]");
        org.junit.Assert.assertNotNull(printWriter23);
        org.junit.Assert.assertNotNull(printStream26);
        org.junit.Assert.assertNotNull(byteArray35);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray35), "[-1, 1]");
    }

    @Test
    public void test00234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00234");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.LanguageRange languageRange2 = new java.util.Locale.LanguageRange("", (double) 'u');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: weight=117.0");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00235");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl((int) (byte) 1, (int) 'x', (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: number of successes must be less than or equal to population size");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00236");
        java.util.Locale locale0 = java.util.Locale.ITALY;
        java.util.Locale locale1 = java.util.Locale.ROOT;
        boolean boolean2 = locale1.hasExtensions();
        java.lang.String str3 = locale0.getDisplayCountry(locale1);
        java.lang.Object obj4 = locale0.clone();
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "it_IT");
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Italy" + "'", str3, "Italy");
        org.junit.Assert.assertNotNull(obj4);
        org.junit.Assert.assertEquals(obj4.toString(), "it_IT");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj4), "it_IT");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj4), "it_IT");
    }

    @Test
    public void test00237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00237");
        java.io.PrintWriter printWriter1 = new java.io.PrintWriter("fr");
        printWriter1.println();
        java.io.PrintWriter printWriter5 = new java.io.PrintWriter("fr");
        printWriter5.print("it_IT");
        java.util.Locale locale8 = java.util.Locale.ROOT;
        boolean boolean9 = locale8.hasExtensions();
        java.util.Locale locale10 = java.util.Locale.ROOT;
        java.lang.String str11 = locale8.getDisplayName(locale10);
        java.util.Locale locale12 = java.util.Locale.ROOT;
        boolean boolean13 = locale12.hasExtensions();
        java.lang.String str14 = locale8.getDisplayCountry(locale12);
        java.lang.Object[] objArray17 = new java.lang.Object[] {};
        org.apache.commons.math.MathException mathException18 = new org.apache.commons.math.MathException("hi!", objArray17);
        java.io.PrintWriter printWriter19 = printWriter5.printf(locale12, "it_IT", objArray17);
        java.io.PrintWriter printWriter20 = printWriter1.printf("English", objArray17);
        printWriter1.println();
        printWriter1.write("chinois");
        // The following exception was thrown during execution in test generation
        try {
            java.io.PrintWriter printWriter27 = printWriter1.append((java.lang.CharSequence) "English", (int) (byte) 1, (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 35");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(locale8);
        org.junit.Assert.assertEquals(locale8.toString(), "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(locale10);
        org.junit.Assert.assertEquals(locale10.toString(), "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNotNull(locale12);
        org.junit.Assert.assertEquals(locale12.toString(), "");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertNotNull(objArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray17), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray17), "[]");
        org.junit.Assert.assertNotNull(printWriter19);
        org.junit.Assert.assertNotNull(printWriter20);
    }

    @Test
    public void test00238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00238");
        java.io.Writer writer0 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.io.PrintWriter printWriter2 = new java.io.PrintWriter(writer0, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00239");
        java.util.Locale locale1 = new java.util.Locale("Italy");
        java.util.Locale.LanguageRange[] languageRangeArray2 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList3 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList3, languageRangeArray2);
        java.util.Collection<java.util.Locale> localeCollection5 = null;
        java.util.Locale locale6 = java.util.Locale.lookup((java.util.List<java.util.Locale.LanguageRange>) languageRangeList3, localeCollection5);
        java.lang.String[] strArray8 = new java.lang.String[] { "hi!" };
        java.util.ArrayList<java.lang.String> strList9 = new java.util.ArrayList<java.lang.String>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList9, strArray8);
        java.lang.String str11 = java.util.Locale.lookupTag((java.util.List<java.util.Locale.LanguageRange>) languageRangeList3, (java.util.Collection<java.lang.String>) strList9);
        java.util.Locale.LanguageRange[] languageRangeArray12 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList13 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean14 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList13, languageRangeArray12);
        java.util.Collection<java.util.Locale> localeCollection15 = null;
        java.util.Locale locale16 = java.util.Locale.lookup((java.util.List<java.util.Locale.LanguageRange>) languageRangeList13, localeCollection15);
        java.lang.String[] strArray18 = new java.lang.String[] { "hi!" };
        java.util.ArrayList<java.lang.String> strList19 = new java.util.ArrayList<java.lang.String>();
        boolean boolean20 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList19, strArray18);
        java.lang.String str21 = java.util.Locale.lookupTag((java.util.List<java.util.Locale.LanguageRange>) languageRangeList13, (java.util.Collection<java.lang.String>) strList19);
        java.util.Locale locale22 = java.util.Locale.ROOT;
        boolean boolean23 = locale22.hasExtensions();
        java.lang.String str24 = locale22.getCountry();
        java.util.Locale locale25 = java.util.Locale.JAPAN;
        java.util.Locale locale26 = java.util.Locale.FRENCH;
        java.util.Locale locale30 = new java.util.Locale("", "", "");
        java.util.Locale[] localeArray31 = new java.util.Locale[] { locale22, locale25, locale26, locale30 };
        java.util.ArrayList<java.util.Locale> localeList32 = new java.util.ArrayList<java.util.Locale>();
        boolean boolean33 = java.util.Collections.addAll((java.util.Collection<java.util.Locale>) localeList32, localeArray31);
        java.util.List<java.util.Locale> localeList34 = java.util.Locale.filter((java.util.List<java.util.Locale.LanguageRange>) languageRangeList13, (java.util.Collection<java.util.Locale>) localeList32);
        java.util.List<java.util.Locale> localeList35 = java.util.Locale.filter((java.util.List<java.util.Locale.LanguageRange>) languageRangeList3, (java.util.Collection<java.util.Locale>) localeList32);
        boolean boolean36 = locale1.equals((java.lang.Object) languageRangeList3);
        org.junit.Assert.assertEquals(locale1.toString(), "italy");
        org.junit.Assert.assertNotNull(languageRangeArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(locale6);
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNotNull(languageRangeArray12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNull(locale16);
        org.junit.Assert.assertNotNull(strArray18);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertNull(str21);
        org.junit.Assert.assertNotNull(locale22);
        org.junit.Assert.assertEquals(locale22.toString(), "");
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
        org.junit.Assert.assertNotNull(locale25);
        org.junit.Assert.assertEquals(locale25.toString(), "ja_JP");
        org.junit.Assert.assertNotNull(locale26);
        org.junit.Assert.assertEquals(locale26.toString(), "fr");
        org.junit.Assert.assertEquals(locale30.toString(), "");
        org.junit.Assert.assertNotNull(localeArray31);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
        org.junit.Assert.assertNotNull(localeList34);
        org.junit.Assert.assertNotNull(localeList35);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
    }

    @Test
    public void test00240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00240");
        java.io.PrintWriter printWriter1 = new java.io.PrintWriter("fr");
        java.io.PrintWriter printWriter3 = printWriter1.append(' ');
        char[] charArray6 = new char[] { 'x', 'a' };
        printWriter3.print(charArray6);
        java.lang.Object[] objArray11 = new java.lang.Object[] {};
        org.apache.commons.math.MathException mathException12 = new org.apache.commons.math.MathException("hi!", objArray11);
        java.lang.Throwable[] throwableArray13 = mathException12.getSuppressed();
        org.apache.commons.math.MathException mathException14 = new org.apache.commons.math.MathException("fr", (java.lang.Object[]) throwableArray13);
        java.io.PrintWriter printWriter15 = printWriter3.printf("en-GB", (java.lang.Object[]) throwableArray13);
        printWriter15.write("fr");
        printWriter15.write((int) (short) 10);
        org.junit.Assert.assertNotNull(printWriter3);
        org.junit.Assert.assertNotNull(charArray6);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray6), "xa");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray6), "xa");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray6), "[x, a]");
        org.junit.Assert.assertNotNull(objArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray11), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray11), "[]");
        org.junit.Assert.assertNotNull(throwableArray13);
        org.junit.Assert.assertNotNull(printWriter15);
    }

    @Test
    public void test00241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00241");
        java.util.Locale locale3 = new java.util.Locale("English", "", "chinois");
        java.lang.String str4 = locale3.getVariant();
        org.junit.Assert.assertEquals(locale3.toString(), "english__chinois");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "chinois" + "'", str4, "chinois");
    }

    @Test
    public void test00242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00242");
        // The following exception was thrown during execution in test generation
        try {
            java.io.PrintStream printStream2 = new java.io.PrintStream("", "ja");
            org.junit.Assert.fail("Expected exception of type java.io.UnsupportedEncodingException; message: ja");
        } catch (java.io.UnsupportedEncodingException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00243");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clearExtensions();
        java.util.Locale.Builder builder3 = builder0.setScript("");
        java.util.Locale.Builder builder5 = builder3.removeUnicodeLocaleAttribute("Italy");
        java.util.Locale.Builder builder6 = builder3.clearExtensions();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder9 = builder3.setUnicodeLocaleKeyword("anglais", "zh_CN");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed Unicode locale keyword key: anglais [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder6);
    }

    @Test
    public void test00244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00244");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.LanguageRange languageRange2 = new java.util.Locale.LanguageRange("jpn", (double) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: weight=100.0");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00245");
        java.io.PrintWriter printWriter1 = new java.io.PrintWriter("fr");
        printWriter1.print("it_IT");
        java.util.Locale locale4 = java.util.Locale.ROOT;
        boolean boolean5 = locale4.hasExtensions();
        java.util.Locale locale6 = java.util.Locale.ROOT;
        java.lang.String str7 = locale4.getDisplayName(locale6);
        java.util.Locale locale8 = java.util.Locale.ROOT;
        boolean boolean9 = locale8.hasExtensions();
        java.lang.String str10 = locale4.getDisplayCountry(locale8);
        java.lang.Object[] objArray13 = new java.lang.Object[] {};
        org.apache.commons.math.MathException mathException14 = new org.apache.commons.math.MathException("hi!", objArray13);
        java.io.PrintWriter printWriter15 = printWriter1.printf(locale8, "it_IT", objArray13);
        printWriter15.print((double) 100L);
        java.util.Locale locale18 = java.util.Locale.JAPANESE;
        java.util.Locale locale19 = java.util.Locale.JAPANESE;
        java.lang.String str20 = locale18.getDisplayCountry(locale19);
        java.lang.String str21 = locale18.getVariant();
        java.lang.String str22 = locale18.getCountry();
        java.io.PrintStream printStream25 = new java.io.PrintStream("zh_CN");
        printStream25.print((float) (byte) -1);
        printStream25.println();
        printStream25.print("ita");
        java.util.Locale locale31 = java.util.Locale.FRENCH;
        java.util.Set<java.lang.String> strSet32 = locale31.getUnicodeLocaleKeys();
        java.util.Locale locale33 = locale31.stripExtensions();
        java.lang.Object[] objArray36 = new java.lang.Object[] {};
        org.apache.commons.math.MathException mathException37 = new org.apache.commons.math.MathException("hi!", objArray36);
        java.lang.Throwable[] throwableArray38 = mathException37.getSuppressed();
        java.lang.Throwable[] throwableArray39 = mathException37.getSuppressed();
        java.io.PrintStream printStream40 = printStream25.printf(locale33, "fr", (java.lang.Object[]) throwableArray39);
        java.io.PrintWriter printWriter41 = printWriter15.format(locale18, "fra", (java.lang.Object[]) throwableArray39);
        java.util.Locale locale43 = new java.util.Locale("Italy");
        printWriter15.print((java.lang.Object) "Italy");
        printWriter15.println((long) '#');
        printWriter15.print((float) 0L);
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(locale6);
        org.junit.Assert.assertEquals(locale6.toString(), "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(locale8);
        org.junit.Assert.assertEquals(locale8.toString(), "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(objArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray13), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray13), "[]");
        org.junit.Assert.assertNotNull(printWriter15);
        org.junit.Assert.assertNotNull(locale18);
        org.junit.Assert.assertEquals(locale18.toString(), "ja");
        org.junit.Assert.assertNotNull(locale19);
        org.junit.Assert.assertEquals(locale19.toString(), "ja");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertNotNull(locale31);
        org.junit.Assert.assertEquals(locale31.toString(), "fr");
        org.junit.Assert.assertNotNull(strSet32);
        org.junit.Assert.assertNotNull(locale33);
        org.junit.Assert.assertEquals(locale33.toString(), "fr");
        org.junit.Assert.assertNotNull(objArray36);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray36), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray36), "[]");
        org.junit.Assert.assertNotNull(throwableArray38);
        org.junit.Assert.assertNotNull(throwableArray39);
        org.junit.Assert.assertNotNull(printStream40);
        org.junit.Assert.assertNotNull(printWriter41);
        org.junit.Assert.assertEquals(locale43.toString(), "italy");
    }

    @Test
    public void test00246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00246");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl((int) 'u', (int) (byte) 1, (int) '#');
        int int4 = hypergeometricDistributionImpl3.getPopulationSize();
        double double6 = hypergeometricDistributionImpl3.cumulativeProbability((int) (short) 100);
        int int7 = hypergeometricDistributionImpl3.getPopulationSize();
        double double10 = hypergeometricDistributionImpl3.cumulativeProbability(0, (int) 'a');
        hypergeometricDistributionImpl3.setSampleSize((int) 'a');
        double double14 = hypergeometricDistributionImpl3.probability((int) '4');
        java.lang.Class<?> wildcardClass15 = hypergeometricDistributionImpl3.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 117 + "'", int4 == 117);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0d + "'", double6 == 1.0d);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 117 + "'", int7 == 117);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 1.0d + "'", double10 == 1.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test00247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00247");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clearExtensions();
        java.util.Locale.Builder builder3 = builder0.setScript("");
        java.util.Locale.Builder builder5 = builder3.removeUnicodeLocaleAttribute("Italy");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder7 = builder5.setScript("it_IT");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed script: it_IT [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder5);
    }

    @Test
    public void test00248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00248");
        // The following exception was thrown during execution in test generation
        try {
            java.io.PrintStream printStream2 = new java.io.PrintStream("Chinesisch (Taiwan)", "japonais");
            org.junit.Assert.fail("Expected exception of type java.io.UnsupportedEncodingException; message: japonais");
        } catch (java.io.UnsupportedEncodingException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00249");
        // The following exception was thrown during execution in test generation
        try {
            java.io.PrintStream printStream2 = new java.io.PrintStream("fran\347ais (France)", "italiano");
            org.junit.Assert.fail("Expected exception of type java.io.UnsupportedEncodingException; message: italiano");
        } catch (java.io.UnsupportedEncodingException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00250");
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<java.util.Locale.LanguageRange> languageRangeList1 = java.util.Locale.LanguageRange.parse("org.apache.commons.math.MathException: hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: range=org.apache.commons.math.mathexception:hi!");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00251");
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<java.util.Locale.LanguageRange> languageRangeList2 = java.util.Locale.LanguageRange.parse("italiano (Italia)", strMap1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: range=italiano(italia)");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00252");
        java.io.PrintWriter printWriter1 = new java.io.PrintWriter("fr");
        printWriter1.print("it_IT");
        java.util.Locale locale4 = java.util.Locale.ROOT;
        boolean boolean5 = locale4.hasExtensions();
        java.util.Locale locale6 = java.util.Locale.ROOT;
        java.lang.String str7 = locale4.getDisplayName(locale6);
        java.util.Locale locale8 = java.util.Locale.ROOT;
        boolean boolean9 = locale8.hasExtensions();
        java.lang.String str10 = locale4.getDisplayCountry(locale8);
        java.lang.Object[] objArray13 = new java.lang.Object[] {};
        org.apache.commons.math.MathException mathException14 = new org.apache.commons.math.MathException("hi!", objArray13);
        java.io.PrintWriter printWriter15 = printWriter1.printf(locale8, "it_IT", objArray13);
        printWriter15.print((double) 100L);
        java.util.Locale locale18 = java.util.Locale.JAPANESE;
        java.util.Locale locale19 = java.util.Locale.JAPANESE;
        java.lang.String str20 = locale18.getDisplayCountry(locale19);
        java.lang.String str21 = locale18.getVariant();
        java.lang.String str22 = locale18.getCountry();
        java.io.PrintStream printStream25 = new java.io.PrintStream("zh_CN");
        printStream25.print((float) (byte) -1);
        printStream25.println();
        printStream25.print("ita");
        java.util.Locale locale31 = java.util.Locale.FRENCH;
        java.util.Set<java.lang.String> strSet32 = locale31.getUnicodeLocaleKeys();
        java.util.Locale locale33 = locale31.stripExtensions();
        java.lang.Object[] objArray36 = new java.lang.Object[] {};
        org.apache.commons.math.MathException mathException37 = new org.apache.commons.math.MathException("hi!", objArray36);
        java.lang.Throwable[] throwableArray38 = mathException37.getSuppressed();
        java.lang.Throwable[] throwableArray39 = mathException37.getSuppressed();
        java.io.PrintStream printStream40 = printStream25.printf(locale33, "fr", (java.lang.Object[]) throwableArray39);
        java.io.PrintWriter printWriter41 = printWriter15.format(locale18, "fra", (java.lang.Object[]) throwableArray39);
        printWriter15.print((float) 'u');
        // The following exception was thrown during execution in test generation
        try {
            printWriter15.write("italiano", (int) (byte) 10, (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 11");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(locale6);
        org.junit.Assert.assertEquals(locale6.toString(), "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(locale8);
        org.junit.Assert.assertEquals(locale8.toString(), "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(objArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray13), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray13), "[]");
        org.junit.Assert.assertNotNull(printWriter15);
        org.junit.Assert.assertNotNull(locale18);
        org.junit.Assert.assertEquals(locale18.toString(), "ja");
        org.junit.Assert.assertNotNull(locale19);
        org.junit.Assert.assertEquals(locale19.toString(), "ja");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertNotNull(locale31);
        org.junit.Assert.assertEquals(locale31.toString(), "fr");
        org.junit.Assert.assertNotNull(strSet32);
        org.junit.Assert.assertNotNull(locale33);
        org.junit.Assert.assertEquals(locale33.toString(), "fr");
        org.junit.Assert.assertNotNull(objArray36);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray36), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray36), "[]");
        org.junit.Assert.assertNotNull(throwableArray38);
        org.junit.Assert.assertNotNull(throwableArray39);
        org.junit.Assert.assertNotNull(printStream40);
        org.junit.Assert.assertNotNull(printWriter41);
    }

    @Test
    public void test00253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00253");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl((int) 'u', (int) (byte) 1, (int) '#');
        int int4 = hypergeometricDistributionImpl3.getPopulationSize();
        double double6 = hypergeometricDistributionImpl3.cumulativeProbability((double) (short) -1);
        hypergeometricDistributionImpl3.setSampleSize((int) '#');
        int int9 = hypergeometricDistributionImpl3.getSampleSize();
        int int10 = hypergeometricDistributionImpl3.getNumberOfSuccesses();
        // The following exception was thrown during execution in test generation
        try {
            int int12 = hypergeometricDistributionImpl3.inverseCumulativeProbability((double) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: p must be between 0 and 1.0 (inclusive)");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 117 + "'", int4 == 117);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 35 + "'", int9 == 35);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
    }

    @Test
    public void test00254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00254");
        // The following exception was thrown during execution in test generation
        try {
            java.io.PrintStream printStream2 = new java.io.PrintStream("org.apache.commons.math.MathException: hi!", "Deutschland");
            org.junit.Assert.fail("Expected exception of type java.io.UnsupportedEncodingException; message: Deutschland");
        } catch (java.io.UnsupportedEncodingException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00255");
        java.lang.Throwable throwable1 = null;
        org.apache.commons.math.MathException mathException2 = new org.apache.commons.math.MathException(throwable1);
        org.apache.commons.math.MathException mathException3 = new org.apache.commons.math.MathException((java.lang.Throwable) mathException2);
        java.lang.Throwable[] throwableArray4 = mathException3.getSuppressed();
        org.apache.commons.math.MathException mathException5 = new org.apache.commons.math.MathException("English", (java.lang.Throwable) mathException3);
        java.lang.String str6 = mathException5.toString();
        org.junit.Assert.assertNotNull(throwableArray4);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "org.apache.commons.math.MathException: English" + "'", str6, "org.apache.commons.math.MathException: English");
    }

    @Test
    public void test00256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00256");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl((int) 'u', (int) (byte) 1, (int) '#');
        int int4 = hypergeometricDistributionImpl3.getPopulationSize();
        double double6 = hypergeometricDistributionImpl3.cumulativeProbability((int) (short) 100);
        hypergeometricDistributionImpl3.setSampleSize(0);
        double double10 = hypergeometricDistributionImpl3.cumulativeProbability((int) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            double double13 = hypergeometricDistributionImpl3.cumulativeProbability(0, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: lower endpoint must be less than or equal to upper endpoint");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 117 + "'", int4 == 117);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0d + "'", double6 == 1.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 1.0d + "'", double10 == 1.0d);
    }

    @Test
    public void test00257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00257");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clearExtensions();
        java.util.Locale.Builder builder3 = builder0.setScript("");
        java.util.Locale.Builder builder5 = builder3.removeUnicodeLocaleAttribute("Italy");
        java.util.Locale.Builder builder6 = builder3.clearExtensions();
        java.util.Locale.Builder builder7 = builder3.clear();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder10 = builder3.setUnicodeLocaleKeyword("italiano (Italia)", "italiano");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed Unicode locale keyword key: italiano (Italia) [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder7);
    }

    @Test
    public void test00258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00258");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl((int) 'u', (int) (byte) 1, (int) '#');
        int int4 = hypergeometricDistributionImpl3.getPopulationSize();
        double double6 = hypergeometricDistributionImpl3.cumulativeProbability((int) (short) 100);
        hypergeometricDistributionImpl3.setNumberOfSuccesses((int) (short) 1);
        int int9 = hypergeometricDistributionImpl3.getSampleSize();
        double double11 = hypergeometricDistributionImpl3.upperCumulativeProbability(1);
        int int12 = hypergeometricDistributionImpl3.getNumberOfSuccesses();
        // The following exception was thrown during execution in test generation
        try {
            hypergeometricDistributionImpl3.setNumberOfSuccesses((int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: number of successes must be non-negative.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 117 + "'", int4 == 117);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0d + "'", double6 == 1.0d);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 35 + "'", int9 == 35);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.2991452991452851d + "'", double11 == 0.2991452991452851d);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
    }

    @Test
    public void test00259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00259");
        java.io.PrintWriter printWriter1 = new java.io.PrintWriter("fr");
        printWriter1.print("it_IT");
        java.util.Locale locale4 = java.util.Locale.ROOT;
        boolean boolean5 = locale4.hasExtensions();
        java.util.Locale locale6 = java.util.Locale.ROOT;
        java.lang.String str7 = locale4.getDisplayName(locale6);
        java.util.Locale locale8 = java.util.Locale.ROOT;
        boolean boolean9 = locale8.hasExtensions();
        java.lang.String str10 = locale4.getDisplayCountry(locale8);
        java.lang.Object[] objArray13 = new java.lang.Object[] {};
        org.apache.commons.math.MathException mathException14 = new org.apache.commons.math.MathException("hi!", objArray13);
        java.io.PrintWriter printWriter15 = printWriter1.printf(locale8, "it_IT", objArray13);
        printWriter15.close();
        java.io.PrintWriter printWriter18 = new java.io.PrintWriter("fr");
        printWriter18.println();
        java.io.PrintWriter printWriter22 = new java.io.PrintWriter("fr");
        printWriter22.print("it_IT");
        java.util.Locale locale25 = java.util.Locale.ROOT;
        boolean boolean26 = locale25.hasExtensions();
        java.util.Locale locale27 = java.util.Locale.ROOT;
        java.lang.String str28 = locale25.getDisplayName(locale27);
        java.util.Locale locale29 = java.util.Locale.ROOT;
        boolean boolean30 = locale29.hasExtensions();
        java.lang.String str31 = locale25.getDisplayCountry(locale29);
        java.lang.Object[] objArray34 = new java.lang.Object[] {};
        org.apache.commons.math.MathException mathException35 = new org.apache.commons.math.MathException("hi!", objArray34);
        java.io.PrintWriter printWriter36 = printWriter22.printf(locale29, "it_IT", objArray34);
        java.io.PrintWriter printWriter37 = printWriter18.printf("English", objArray34);
        java.io.PrintStream printStream39 = new java.io.PrintStream("zh_CN");
        printStream39.print((float) (byte) -1);
        printStream39.println();
        printStream39.println();
        java.io.PrintStream printStream45 = new java.io.PrintStream((java.io.OutputStream) printStream39, true);
        java.io.PrintWriter printWriter47 = new java.io.PrintWriter("fr");
        java.io.PrintWriter printWriter49 = printWriter47.append(' ');
        java.io.PrintWriter printWriter52 = new java.io.PrintWriter("fr");
        printWriter52.print("it_IT");
        java.util.Locale locale55 = java.util.Locale.ROOT;
        boolean boolean56 = locale55.hasExtensions();
        java.util.Locale locale57 = java.util.Locale.ROOT;
        java.lang.String str58 = locale55.getDisplayName(locale57);
        java.util.Locale locale59 = java.util.Locale.ROOT;
        boolean boolean60 = locale59.hasExtensions();
        java.lang.String str61 = locale55.getDisplayCountry(locale59);
        java.lang.Object[] objArray64 = new java.lang.Object[] {};
        org.apache.commons.math.MathException mathException65 = new org.apache.commons.math.MathException("hi!", objArray64);
        java.io.PrintWriter printWriter66 = printWriter52.printf(locale59, "it_IT", objArray64);
        java.io.PrintWriter printWriter69 = new java.io.PrintWriter("fr");
        printWriter69.print("it_IT");
        java.util.Locale locale73 = java.util.Locale.forLanguageTag("");
        java.lang.Object[] objArray76 = new java.lang.Object[] {};
        org.apache.commons.math.MathException mathException77 = new org.apache.commons.math.MathException("hi!", objArray76);
        java.lang.Throwable[] throwableArray78 = mathException77.getSuppressed();
        java.lang.Throwable[] throwableArray79 = mathException77.getSuppressed();
        java.io.PrintWriter printWriter80 = printWriter69.printf(locale73, "it_IT", (java.lang.Object[]) throwableArray79);
        java.io.PrintWriter printWriter81 = printWriter52.format("it_IT", (java.lang.Object[]) throwableArray79);
        java.io.PrintWriter printWriter82 = printWriter49.format("zh_CN", (java.lang.Object[]) throwableArray79);
        java.io.PrintStream printStream84 = new java.io.PrintStream("zh_CN");
        printStream84.print((float) (byte) -1);
        char[] charArray89 = new char[] { 'x', 'u' };
        printStream84.println(charArray89);
        printWriter82.print(charArray89);
        printStream39.print(charArray89);
        printWriter37.write(charArray89);
        printWriter15.write(charArray89);
        // The following exception was thrown during execution in test generation
        try {
            java.io.PrintWriter printWriter98 = printWriter15.append((java.lang.CharSequence) "Canada", 10, (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: -10");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(locale6);
        org.junit.Assert.assertEquals(locale6.toString(), "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(locale8);
        org.junit.Assert.assertEquals(locale8.toString(), "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(objArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray13), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray13), "[]");
        org.junit.Assert.assertNotNull(printWriter15);
        org.junit.Assert.assertNotNull(locale25);
        org.junit.Assert.assertEquals(locale25.toString(), "");
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(locale27);
        org.junit.Assert.assertEquals(locale27.toString(), "");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "" + "'", str28, "");
        org.junit.Assert.assertNotNull(locale29);
        org.junit.Assert.assertEquals(locale29.toString(), "");
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "" + "'", str31, "");
        org.junit.Assert.assertNotNull(objArray34);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray34), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray34), "[]");
        org.junit.Assert.assertNotNull(printWriter36);
        org.junit.Assert.assertNotNull(printWriter37);
        org.junit.Assert.assertNotNull(printWriter49);
        org.junit.Assert.assertNotNull(locale55);
        org.junit.Assert.assertEquals(locale55.toString(), "");
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
        org.junit.Assert.assertNotNull(locale57);
        org.junit.Assert.assertEquals(locale57.toString(), "");
        org.junit.Assert.assertEquals("'" + str58 + "' != '" + "" + "'", str58, "");
        org.junit.Assert.assertNotNull(locale59);
        org.junit.Assert.assertEquals(locale59.toString(), "");
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + false + "'", boolean60 == false);
        org.junit.Assert.assertEquals("'" + str61 + "' != '" + "" + "'", str61, "");
        org.junit.Assert.assertNotNull(objArray64);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray64), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray64), "[]");
        org.junit.Assert.assertNotNull(printWriter66);
        org.junit.Assert.assertNotNull(locale73);
        org.junit.Assert.assertEquals(locale73.toString(), "");
        org.junit.Assert.assertNotNull(objArray76);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray76), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray76), "[]");
        org.junit.Assert.assertNotNull(throwableArray78);
        org.junit.Assert.assertNotNull(throwableArray79);
        org.junit.Assert.assertNotNull(printWriter80);
        org.junit.Assert.assertNotNull(printWriter81);
        org.junit.Assert.assertNotNull(printWriter82);
        org.junit.Assert.assertNotNull(charArray89);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray89), "xu");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray89), "xu");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray89), "[x, u]");
    }

    @Test
    public void test00260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00260");
        java.io.PrintStream printStream1 = new java.io.PrintStream("zh_CN");
        printStream1.print((float) (byte) -1);
        printStream1.println();
        printStream1.println();
        java.io.PrintStream printStream7 = new java.io.PrintStream((java.io.OutputStream) printStream1, true);
        java.io.PrintWriter printWriter9 = new java.io.PrintWriter("fr");
        printWriter9.print("it_IT");
        java.util.Locale locale12 = java.util.Locale.ROOT;
        boolean boolean13 = locale12.hasExtensions();
        java.util.Locale locale14 = java.util.Locale.ROOT;
        java.lang.String str15 = locale12.getDisplayName(locale14);
        java.util.Locale locale16 = java.util.Locale.ROOT;
        boolean boolean17 = locale16.hasExtensions();
        java.lang.String str18 = locale12.getDisplayCountry(locale16);
        java.lang.Object[] objArray21 = new java.lang.Object[] {};
        org.apache.commons.math.MathException mathException22 = new org.apache.commons.math.MathException("hi!", objArray21);
        java.io.PrintWriter printWriter23 = printWriter9.printf(locale16, "it_IT", objArray21);
        printStream7.println((java.lang.Object) "it_IT");
        java.io.PrintStream printStream26 = printStream7.append((java.lang.CharSequence) "fr");
        java.io.PrintStream printStream28 = new java.io.PrintStream((java.io.OutputStream) printStream26, false);
        printStream28.write((-1));
        org.junit.Assert.assertNotNull(locale12);
        org.junit.Assert.assertEquals(locale12.toString(), "");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(locale14);
        org.junit.Assert.assertEquals(locale14.toString(), "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertNotNull(locale16);
        org.junit.Assert.assertEquals(locale16.toString(), "");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertNotNull(objArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray21), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray21), "[]");
        org.junit.Assert.assertNotNull(printWriter23);
        org.junit.Assert.assertNotNull(printStream26);
    }

    @Test
    public void test00261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00261");
        java.util.Locale.Category category0 = java.util.Locale.Category.FORMAT;
        java.io.PrintWriter printWriter2 = new java.io.PrintWriter("fr");
        printWriter2.write("hi!");
        printWriter2.println((java.lang.Object) (-1L));
        java.util.Locale locale7 = java.util.Locale.ITALY;
        java.lang.String str8 = locale7.getDisplayName();
        java.lang.Object[] objArray11 = new java.lang.Object[] {};
        org.apache.commons.math.MathException mathException12 = new org.apache.commons.math.MathException("hi!", objArray11);
        java.lang.Object[] objArray13 = mathException12.getArguments();
        java.io.PrintWriter printWriter14 = printWriter2.format(locale7, "anglais", objArray13);
        java.util.Locale.setDefault(category0, locale7);
        java.util.Locale locale16 = java.util.Locale.getDefault(category0);
        java.util.Locale locale17 = java.util.Locale.PRC;
        boolean boolean18 = locale16.equals((java.lang.Object) locale17);
        org.junit.Assert.assertTrue("'" + category0 + "' != '" + java.util.Locale.Category.FORMAT + "'", category0.equals(java.util.Locale.Category.FORMAT));
        org.junit.Assert.assertNotNull(locale7);
        org.junit.Assert.assertEquals(locale7.toString(), "it_IT");
// flaky:         org.junit.Assert.assertEquals("'" + str8 + "' != '" + "italiano (Italia)" + "'", str8, "italiano (Italia)");
        org.junit.Assert.assertNotNull(objArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray11), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray11), "[]");
        org.junit.Assert.assertNotNull(objArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray13), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray13), "[]");
        org.junit.Assert.assertNotNull(printWriter14);
        org.junit.Assert.assertNotNull(locale16);
        org.junit.Assert.assertEquals(locale16.toString(), "it_IT");
        org.junit.Assert.assertNotNull(locale17);
        org.junit.Assert.assertEquals(locale17.toString(), "zh_CN");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test00262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00262");
        java.io.PrintStream printStream1 = new java.io.PrintStream("zh_CN");
        printStream1.print((float) (byte) -1);
        printStream1.println();
        printStream1.println();
        java.io.PrintStream printStream7 = new java.io.PrintStream((java.io.OutputStream) printStream1, true);
        java.io.PrintWriter printWriter9 = new java.io.PrintWriter("fr");
        printWriter9.print("it_IT");
        java.util.Locale locale12 = java.util.Locale.ROOT;
        boolean boolean13 = locale12.hasExtensions();
        java.util.Locale locale14 = java.util.Locale.ROOT;
        java.lang.String str15 = locale12.getDisplayName(locale14);
        java.util.Locale locale16 = java.util.Locale.ROOT;
        boolean boolean17 = locale16.hasExtensions();
        java.lang.String str18 = locale12.getDisplayCountry(locale16);
        java.lang.Object[] objArray21 = new java.lang.Object[] {};
        org.apache.commons.math.MathException mathException22 = new org.apache.commons.math.MathException("hi!", objArray21);
        java.io.PrintWriter printWriter23 = printWriter9.printf(locale16, "it_IT", objArray21);
        printStream7.println((java.lang.Object) "it_IT");
        java.io.PrintStream printStream26 = printStream7.append((java.lang.CharSequence) "fr");
        java.io.PrintStream printStream27 = new java.io.PrintStream((java.io.OutputStream) printStream7);
        printStream7.println("");
        java.util.Locale.Builder builder30 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder31 = builder30.clearExtensions();
        java.util.Locale.Builder builder33 = builder31.setLanguageTag("fr");
        java.util.Locale locale34 = builder33.build();
        java.util.Locale.Builder builder35 = builder33.clearExtensions();
        printStream7.print((java.lang.Object) builder35);
        java.util.Locale.Builder builder37 = builder35.clear();
        java.util.Locale.Builder builder38 = builder37.clear();
        java.util.Locale locale39 = builder38.build();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder41 = builder38.setLanguageTag("org.apache.commons.math.MathException");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Invalid subtag: org.apache.commons.math.MathException [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(locale12);
        org.junit.Assert.assertEquals(locale12.toString(), "");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(locale14);
        org.junit.Assert.assertEquals(locale14.toString(), "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertNotNull(locale16);
        org.junit.Assert.assertEquals(locale16.toString(), "");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertNotNull(objArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray21), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray21), "[]");
        org.junit.Assert.assertNotNull(printWriter23);
        org.junit.Assert.assertNotNull(printStream26);
        org.junit.Assert.assertNotNull(builder31);
        org.junit.Assert.assertNotNull(builder33);
        org.junit.Assert.assertNotNull(locale34);
        org.junit.Assert.assertEquals(locale34.toString(), "fr");
        org.junit.Assert.assertNotNull(builder35);
        org.junit.Assert.assertNotNull(builder37);
        org.junit.Assert.assertNotNull(builder38);
        org.junit.Assert.assertNotNull(locale39);
        org.junit.Assert.assertEquals(locale39.toString(), "");
    }

    @Test
    public void test00263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00263");
        java.io.File file0 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.io.PrintStream printStream2 = new java.io.PrintStream(file0, "FR");
            org.junit.Assert.fail("Expected exception of type java.io.UnsupportedEncodingException; message: FR");
        } catch (java.io.UnsupportedEncodingException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00264");
        java.io.PrintWriter printWriter1 = new java.io.PrintWriter("fr");
        java.io.PrintWriter printWriter3 = printWriter1.append(' ');
        printWriter1.write("chinois");
        java.util.Locale locale6 = java.util.Locale.ROOT;
        boolean boolean7 = locale6.hasExtensions();
        java.lang.String str8 = locale6.getCountry();
        java.lang.String str9 = locale6.getDisplayLanguage();
        java.lang.String str10 = locale6.getISO3Country();
        java.util.Set<java.lang.Character> charSet11 = locale6.getExtensionKeys();
        java.io.PrintStream printStream14 = new java.io.PrintStream("zh_CN");
        printStream14.print((float) (byte) -1);
        char[] charArray19 = new char[] { 'x', 'u' };
        printStream14.println(charArray19);
        java.util.Locale locale23 = new java.util.Locale("en-GB", "Italy");
        java.lang.String str24 = locale23.getCountry();
        java.io.PrintStream printStream27 = new java.io.PrintStream("zh_CN");
        printStream27.print((float) (byte) -1);
        printStream27.println();
        java.lang.Throwable throwable32 = null;
        org.apache.commons.math.MathException mathException33 = new org.apache.commons.math.MathException(throwable32);
        org.apache.commons.math.MathException mathException34 = new org.apache.commons.math.MathException((java.lang.Throwable) mathException33);
        java.lang.Throwable[] throwableArray35 = mathException33.getSuppressed();
        java.io.PrintStream printStream36 = printStream27.format("italien (Italie)", (java.lang.Object[]) throwableArray35);
        java.io.PrintStream printStream37 = printStream14.printf(locale23, "fr-CA", (java.lang.Object[]) throwableArray35);
        java.io.PrintWriter printWriter38 = printWriter1.printf(locale6, "italiano", (java.lang.Object[]) throwableArray35);
        // The following exception was thrown during execution in test generation
        try {
            java.io.PrintWriter printWriter42 = printWriter1.append((java.lang.CharSequence) "org.apache.commons.math.MathException: ", (int) 'u', (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: -107");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(printWriter3);
        org.junit.Assert.assertNotNull(locale6);
        org.junit.Assert.assertEquals(locale6.toString(), "");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(charSet11);
        org.junit.Assert.assertNotNull(charArray19);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray19), "xu");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray19), "xu");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray19), "[x, u]");
        org.junit.Assert.assertEquals(locale23.toString(), "en-gb_ITALY");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "ITALY" + "'", str24, "ITALY");
        org.junit.Assert.assertNotNull(throwableArray35);
        org.junit.Assert.assertNotNull(printStream36);
        org.junit.Assert.assertNotNull(printStream37);
        org.junit.Assert.assertNotNull(printWriter38);
    }

    @Test
    public void test00265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00265");
        java.io.File file0 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.io.PrintStream printStream2 = new java.io.PrintStream(file0, "en-GB");
            org.junit.Assert.fail("Expected exception of type java.io.UnsupportedEncodingException; message: en-GB");
        } catch (java.io.UnsupportedEncodingException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00266");
        java.io.PrintStream printStream1 = new java.io.PrintStream("zh_CN");
        printStream1.print((float) (byte) -1);
        printStream1.println();
        printStream1.println();
        java.io.PrintStream printStream7 = new java.io.PrintStream((java.io.OutputStream) printStream1, true);
        java.io.PrintWriter printWriter9 = new java.io.PrintWriter("fr");
        java.io.PrintWriter printWriter11 = printWriter9.append(' ');
        java.io.PrintWriter printWriter14 = new java.io.PrintWriter("fr");
        printWriter14.print("it_IT");
        java.util.Locale locale17 = java.util.Locale.ROOT;
        boolean boolean18 = locale17.hasExtensions();
        java.util.Locale locale19 = java.util.Locale.ROOT;
        java.lang.String str20 = locale17.getDisplayName(locale19);
        java.util.Locale locale21 = java.util.Locale.ROOT;
        boolean boolean22 = locale21.hasExtensions();
        java.lang.String str23 = locale17.getDisplayCountry(locale21);
        java.lang.Object[] objArray26 = new java.lang.Object[] {};
        org.apache.commons.math.MathException mathException27 = new org.apache.commons.math.MathException("hi!", objArray26);
        java.io.PrintWriter printWriter28 = printWriter14.printf(locale21, "it_IT", objArray26);
        java.io.PrintWriter printWriter31 = new java.io.PrintWriter("fr");
        printWriter31.print("it_IT");
        java.util.Locale locale35 = java.util.Locale.forLanguageTag("");
        java.lang.Object[] objArray38 = new java.lang.Object[] {};
        org.apache.commons.math.MathException mathException39 = new org.apache.commons.math.MathException("hi!", objArray38);
        java.lang.Throwable[] throwableArray40 = mathException39.getSuppressed();
        java.lang.Throwable[] throwableArray41 = mathException39.getSuppressed();
        java.io.PrintWriter printWriter42 = printWriter31.printf(locale35, "it_IT", (java.lang.Object[]) throwableArray41);
        java.io.PrintWriter printWriter43 = printWriter14.format("it_IT", (java.lang.Object[]) throwableArray41);
        java.io.PrintWriter printWriter44 = printWriter11.format("zh_CN", (java.lang.Object[]) throwableArray41);
        java.io.PrintStream printStream46 = new java.io.PrintStream("zh_CN");
        printStream46.print((float) (byte) -1);
        char[] charArray51 = new char[] { 'x', 'u' };
        printStream46.println(charArray51);
        printWriter44.print(charArray51);
        printStream1.print(charArray51);
        java.util.Locale locale55 = java.util.Locale.ROOT;
        java.util.Set<java.lang.String> strSet56 = locale55.getUnicodeLocaleKeys();
        java.io.PrintWriter printWriter59 = new java.io.PrintWriter("fr");
        printWriter59.print("it_IT");
        java.util.Locale locale63 = java.util.Locale.forLanguageTag("");
        java.lang.Object[] objArray66 = new java.lang.Object[] {};
        org.apache.commons.math.MathException mathException67 = new org.apache.commons.math.MathException("hi!", objArray66);
        java.lang.Throwable[] throwableArray68 = mathException67.getSuppressed();
        java.lang.Throwable[] throwableArray69 = mathException67.getSuppressed();
        java.io.PrintWriter printWriter70 = printWriter59.printf(locale63, "it_IT", (java.lang.Object[]) throwableArray69);
        java.io.PrintStream printStream71 = printStream1.format(locale55, "hi!", (java.lang.Object[]) throwableArray69);
        java.lang.String str72 = locale55.getLanguage();
        java.util.Set<java.lang.String> strSet73 = locale55.getUnicodeLocaleKeys();
        java.util.Locale locale74 = java.util.Locale.ROOT;
        boolean boolean75 = locale74.hasExtensions();
        java.util.Locale locale76 = java.util.Locale.ROOT;
        java.lang.String str77 = locale74.getDisplayName(locale76);
        java.util.Locale locale78 = java.util.Locale.ROOT;
        boolean boolean79 = locale78.hasExtensions();
        java.lang.String str80 = locale74.getDisplayCountry(locale78);
        java.lang.String str81 = locale74.getDisplayCountry();
        java.lang.String str82 = locale55.getDisplayScript(locale74);
        java.util.Locale locale83 = java.util.Locale.CANADA_FRENCH;
        boolean boolean84 = locale55.equals((java.lang.Object) locale83);
        org.junit.Assert.assertNotNull(printWriter11);
        org.junit.Assert.assertNotNull(locale17);
        org.junit.Assert.assertEquals(locale17.toString(), "");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(locale19);
        org.junit.Assert.assertEquals(locale19.toString(), "");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertNotNull(locale21);
        org.junit.Assert.assertEquals(locale21.toString(), "");
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertNotNull(objArray26);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray26), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray26), "[]");
        org.junit.Assert.assertNotNull(printWriter28);
        org.junit.Assert.assertNotNull(locale35);
        org.junit.Assert.assertEquals(locale35.toString(), "");
        org.junit.Assert.assertNotNull(objArray38);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray38), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray38), "[]");
        org.junit.Assert.assertNotNull(throwableArray40);
        org.junit.Assert.assertNotNull(throwableArray41);
        org.junit.Assert.assertNotNull(printWriter42);
        org.junit.Assert.assertNotNull(printWriter43);
        org.junit.Assert.assertNotNull(printWriter44);
        org.junit.Assert.assertNotNull(charArray51);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray51), "xu");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray51), "xu");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray51), "[x, u]");
        org.junit.Assert.assertNotNull(locale55);
        org.junit.Assert.assertEquals(locale55.toString(), "");
        org.junit.Assert.assertNotNull(strSet56);
        org.junit.Assert.assertNotNull(locale63);
        org.junit.Assert.assertEquals(locale63.toString(), "");
        org.junit.Assert.assertNotNull(objArray66);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray66), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray66), "[]");
        org.junit.Assert.assertNotNull(throwableArray68);
        org.junit.Assert.assertNotNull(throwableArray69);
        org.junit.Assert.assertNotNull(printWriter70);
        org.junit.Assert.assertNotNull(printStream71);
        org.junit.Assert.assertEquals("'" + str72 + "' != '" + "" + "'", str72, "");
        org.junit.Assert.assertNotNull(strSet73);
        org.junit.Assert.assertNotNull(locale74);
        org.junit.Assert.assertEquals(locale74.toString(), "");
        org.junit.Assert.assertTrue("'" + boolean75 + "' != '" + false + "'", boolean75 == false);
        org.junit.Assert.assertNotNull(locale76);
        org.junit.Assert.assertEquals(locale76.toString(), "");
        org.junit.Assert.assertEquals("'" + str77 + "' != '" + "" + "'", str77, "");
        org.junit.Assert.assertNotNull(locale78);
        org.junit.Assert.assertEquals(locale78.toString(), "");
        org.junit.Assert.assertTrue("'" + boolean79 + "' != '" + false + "'", boolean79 == false);
        org.junit.Assert.assertEquals("'" + str80 + "' != '" + "" + "'", str80, "");
        org.junit.Assert.assertEquals("'" + str81 + "' != '" + "" + "'", str81, "");
        org.junit.Assert.assertEquals("'" + str82 + "' != '" + "" + "'", str82, "");
        org.junit.Assert.assertNotNull(locale83);
        org.junit.Assert.assertEquals(locale83.toString(), "fr_CA");
        org.junit.Assert.assertTrue("'" + boolean84 + "' != '" + false + "'", boolean84 == false);
    }

    @Test
    public void test00267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00267");
        java.io.PrintStream printStream1 = new java.io.PrintStream("zh_CN");
        printStream1.print((float) (byte) -1);
        printStream1.println();
        printStream1.print("ita");
        java.util.Locale locale8 = new java.util.Locale("Italy");
        java.lang.Object[] objArray11 = new java.lang.Object[] {};
        org.apache.commons.math.MathException mathException12 = new org.apache.commons.math.MathException("hi!", objArray11);
        java.lang.Throwable[] throwableArray13 = mathException12.getSuppressed();
        java.lang.Throwable[] throwableArray14 = mathException12.getSuppressed();
        java.io.PrintStream printStream15 = printStream1.printf(locale8, "chinois", (java.lang.Object[]) throwableArray14);
        printStream15.println((long) '4');
        // The following exception was thrown during execution in test generation
        try {
            java.io.PrintStream printStream20 = new java.io.PrintStream((java.io.OutputStream) printStream15, true, "Canada");
            org.junit.Assert.fail("Expected exception of type java.io.UnsupportedEncodingException; message: Canada");
        } catch (java.io.UnsupportedEncodingException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals(locale8.toString(), "italy");
        org.junit.Assert.assertNotNull(objArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray11), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray11), "[]");
        org.junit.Assert.assertNotNull(throwableArray13);
        org.junit.Assert.assertNotNull(throwableArray14);
        org.junit.Assert.assertNotNull(printStream15);
    }

    @Test
    public void test00268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00268");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl((int) 'u', (int) (byte) 1, (int) '#');
        double double6 = hypergeometricDistributionImpl3.cumulativeProbability((double) 10, (double) 10.0f);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
    }

    @Test
    public void test00269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00269");
        java.io.File file0 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.io.PrintStream printStream2 = new java.io.PrintStream(file0, "chinois");
            org.junit.Assert.fail("Expected exception of type java.io.UnsupportedEncodingException; message: chinois");
        } catch (java.io.UnsupportedEncodingException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00270");
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<java.util.Locale.LanguageRange> languageRangeList2 = java.util.Locale.LanguageRange.parse("\u30ab\u30ca\u30c0", strMap1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: range=????");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00271");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl((int) 'u', (int) (byte) 1, (int) '#');
        int int4 = hypergeometricDistributionImpl3.getPopulationSize();
        double double6 = hypergeometricDistributionImpl3.cumulativeProbability((int) (short) 100);
        hypergeometricDistributionImpl3.setNumberOfSuccesses(0);
        int int9 = hypergeometricDistributionImpl3.getPopulationSize();
        double double11 = hypergeometricDistributionImpl3.cumulativeProbability((int) 'u');
        int int12 = hypergeometricDistributionImpl3.getSampleSize();
        // The following exception was thrown during execution in test generation
        try {
            hypergeometricDistributionImpl3.setPopulationSize((-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: population size must be positive.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 117 + "'", int4 == 117);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0d + "'", double6 == 1.0d);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 117 + "'", int9 == 117);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 1.0d + "'", double11 == 1.0d);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 35 + "'", int12 == 35);
    }

    @Test
    public void test00272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00272");
        java.io.PrintWriter printWriter1 = new java.io.PrintWriter("fr");
        java.io.PrintWriter printWriter3 = printWriter1.append(' ');
        printWriter3.println((double) '4');
        java.io.PrintWriter printWriter7 = new java.io.PrintWriter("fr");
        printWriter7.print("it_IT");
        java.util.Locale locale11 = java.util.Locale.forLanguageTag("");
        java.lang.Object[] objArray14 = new java.lang.Object[] {};
        org.apache.commons.math.MathException mathException15 = new org.apache.commons.math.MathException("hi!", objArray14);
        java.lang.Throwable[] throwableArray16 = mathException15.getSuppressed();
        java.lang.Throwable[] throwableArray17 = mathException15.getSuppressed();
        java.io.PrintWriter printWriter18 = printWriter7.printf(locale11, "it_IT", (java.lang.Object[]) throwableArray17);
        printWriter7.println((float) (byte) 10);
        java.io.PrintWriter printWriter22 = new java.io.PrintWriter("fr");
        printWriter22.write("hi!");
        printWriter7.println((java.lang.Object) printWriter22);
        java.io.PrintWriter printWriter27 = printWriter7.append('#');
        printWriter3.println((java.lang.Object) printWriter7);
        // The following exception was thrown during execution in test generation
        try {
            printWriter7.write("", 35, (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 36");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(printWriter3);
        org.junit.Assert.assertNotNull(locale11);
        org.junit.Assert.assertEquals(locale11.toString(), "");
        org.junit.Assert.assertNotNull(objArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray14), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray14), "[]");
        org.junit.Assert.assertNotNull(throwableArray16);
        org.junit.Assert.assertNotNull(throwableArray17);
        org.junit.Assert.assertNotNull(printWriter18);
        org.junit.Assert.assertNotNull(printWriter27);
    }

    @Test
    public void test00273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00273");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clearExtensions();
        java.util.Locale.Builder builder3 = builder0.setScript("");
        java.util.Locale.Builder builder5 = builder3.removeUnicodeLocaleAttribute("Italy");
        java.util.Locale.Builder builder7 = builder3.setRegion("ja");
        java.util.Locale.Builder builder9 = builder7.setLanguageTag("japonais");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder11 = builder7.setVariant("org.apache.commons.math.MathException: fr");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed variant: org.apache.commons.math.MathException: fr [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(builder9);
    }

    @Test
    public void test00274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00274");
        java.io.File file0 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.io.PrintWriter printWriter2 = new java.io.PrintWriter(file0, "org.apache.commons.math.MathException: fr");
            org.junit.Assert.fail("Expected exception of type java.io.UnsupportedEncodingException; message: org.apache.commons.math.MathException: fr");
        } catch (java.io.UnsupportedEncodingException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00275");
        org.apache.commons.math.MathException mathException1 = new org.apache.commons.math.MathException("fran\347ais (France)");
    }

    @Test
    public void test00276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00276");
        java.util.Locale.Category category0 = java.util.Locale.Category.DISPLAY;
        java.util.Locale locale1 = java.util.Locale.JAPANESE;
        java.util.Locale.setDefault(category0, locale1);
        java.lang.String str3 = locale1.getScript();
        java.util.Locale.Builder builder4 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder5 = builder4.clearExtensions();
        java.util.Locale.Builder builder7 = builder5.setLanguageTag("fr");
        java.util.Locale locale8 = builder7.build();
        java.util.Set<java.lang.String> strSet9 = locale8.getUnicodeLocaleKeys();
        java.lang.String str10 = locale1.getDisplayScript(locale8);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str12 = locale8.getUnicodeLocaleType("fr-CA");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Ill-formed Unicode locale key: fr-CA");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + category0 + "' != '" + java.util.Locale.Category.DISPLAY + "'", category0.equals(java.util.Locale.Category.DISPLAY));
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "ja");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(locale8);
        org.junit.Assert.assertEquals(locale8.toString(), "fr");
        org.junit.Assert.assertNotNull(strSet9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void test00277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00277");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl((int) 'u', (int) (byte) 1, (int) '#');
        int int4 = hypergeometricDistributionImpl3.getSampleSize();
        hypergeometricDistributionImpl3.setPopulationSize((int) 'u');
        int int7 = hypergeometricDistributionImpl3.getNumberOfSuccesses();
        int int8 = hypergeometricDistributionImpl3.getSampleSize();
        double double10 = hypergeometricDistributionImpl3.cumulativeProbability((double) 10.0f);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 35 + "'", int4 == 35);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 35 + "'", int8 == 35);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 1.0d + "'", double10 == 1.0d);
    }

    @Test
    public void test00278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00278");
        java.util.Locale locale0 = java.util.Locale.TAIWAN;
        java.util.Locale locale1 = java.util.Locale.FRENCH;
        java.util.Set<java.lang.String> strSet2 = locale1.getUnicodeLocaleKeys();
        java.lang.String str3 = locale0.getDisplayVariant(locale1);
        java.lang.String str4 = locale0.getDisplayLanguage();
        java.lang.Object obj5 = locale0.clone();
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "zh_TW");
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "fr");
        org.junit.Assert.assertNotNull(strSet2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "\u4e2d\u56fd\u8a9e" + "'", str4, "\u4e2d\u56fd\u8a9e");
        org.junit.Assert.assertNotNull(obj5);
        org.junit.Assert.assertEquals(obj5.toString(), "zh_TW");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj5), "zh_TW");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj5), "zh_TW");
    }

    @Test
    public void test00279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00279");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clearExtensions();
        java.util.Locale locale2 = java.util.Locale.TRADITIONAL_CHINESE;
        java.util.Locale locale3 = java.util.Locale.GERMAN;
        java.lang.String str4 = locale3.getVariant();
        java.lang.String str5 = locale3.toLanguageTag();
        java.lang.String str6 = locale2.getDisplayName(locale3);
        java.util.Locale.Builder builder7 = builder0.setLocale(locale2);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder9 = builder0.setScript("jpn");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed script: jpn [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "zh_TW");
        org.junit.Assert.assertNotNull(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "de");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "de" + "'", str5, "de");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Chinesisch (Taiwan)" + "'", str6, "Chinesisch (Taiwan)");
        org.junit.Assert.assertNotNull(builder7);
    }

    @Test
    public void test00280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00280");
        java.io.PrintStream printStream1 = new java.io.PrintStream("zh_CN");
        printStream1.print((float) (byte) -1);
        printStream1.println();
        java.io.PrintWriter printWriter6 = new java.io.PrintWriter("fr");
        printWriter6.println();
        java.io.PrintWriter printWriter10 = new java.io.PrintWriter("fr");
        printWriter10.print("it_IT");
        java.util.Locale locale13 = java.util.Locale.ROOT;
        boolean boolean14 = locale13.hasExtensions();
        java.util.Locale locale15 = java.util.Locale.ROOT;
        java.lang.String str16 = locale13.getDisplayName(locale15);
        java.util.Locale locale17 = java.util.Locale.ROOT;
        boolean boolean18 = locale17.hasExtensions();
        java.lang.String str19 = locale13.getDisplayCountry(locale17);
        java.lang.Object[] objArray22 = new java.lang.Object[] {};
        org.apache.commons.math.MathException mathException23 = new org.apache.commons.math.MathException("hi!", objArray22);
        java.io.PrintWriter printWriter24 = printWriter10.printf(locale17, "it_IT", objArray22);
        java.io.PrintWriter printWriter25 = printWriter6.printf("English", objArray22);
        java.io.PrintStream printStream27 = new java.io.PrintStream("zh_CN");
        printStream27.print((float) (byte) -1);
        printStream27.println();
        printStream27.println();
        java.io.PrintStream printStream33 = new java.io.PrintStream((java.io.OutputStream) printStream27, true);
        java.io.PrintWriter printWriter35 = new java.io.PrintWriter("fr");
        java.io.PrintWriter printWriter37 = printWriter35.append(' ');
        java.io.PrintWriter printWriter40 = new java.io.PrintWriter("fr");
        printWriter40.print("it_IT");
        java.util.Locale locale43 = java.util.Locale.ROOT;
        boolean boolean44 = locale43.hasExtensions();
        java.util.Locale locale45 = java.util.Locale.ROOT;
        java.lang.String str46 = locale43.getDisplayName(locale45);
        java.util.Locale locale47 = java.util.Locale.ROOT;
        boolean boolean48 = locale47.hasExtensions();
        java.lang.String str49 = locale43.getDisplayCountry(locale47);
        java.lang.Object[] objArray52 = new java.lang.Object[] {};
        org.apache.commons.math.MathException mathException53 = new org.apache.commons.math.MathException("hi!", objArray52);
        java.io.PrintWriter printWriter54 = printWriter40.printf(locale47, "it_IT", objArray52);
        java.io.PrintWriter printWriter57 = new java.io.PrintWriter("fr");
        printWriter57.print("it_IT");
        java.util.Locale locale61 = java.util.Locale.forLanguageTag("");
        java.lang.Object[] objArray64 = new java.lang.Object[] {};
        org.apache.commons.math.MathException mathException65 = new org.apache.commons.math.MathException("hi!", objArray64);
        java.lang.Throwable[] throwableArray66 = mathException65.getSuppressed();
        java.lang.Throwable[] throwableArray67 = mathException65.getSuppressed();
        java.io.PrintWriter printWriter68 = printWriter57.printf(locale61, "it_IT", (java.lang.Object[]) throwableArray67);
        java.io.PrintWriter printWriter69 = printWriter40.format("it_IT", (java.lang.Object[]) throwableArray67);
        java.io.PrintWriter printWriter70 = printWriter37.format("zh_CN", (java.lang.Object[]) throwableArray67);
        java.io.PrintStream printStream72 = new java.io.PrintStream("zh_CN");
        printStream72.print((float) (byte) -1);
        char[] charArray77 = new char[] { 'x', 'u' };
        printStream72.println(charArray77);
        printWriter70.print(charArray77);
        printStream27.print(charArray77);
        printWriter25.write(charArray77);
        printStream1.print(charArray77);
        printStream1.println((int) (byte) -1);
        org.junit.Assert.assertNotNull(locale13);
        org.junit.Assert.assertEquals(locale13.toString(), "");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(locale15);
        org.junit.Assert.assertEquals(locale15.toString(), "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertNotNull(locale17);
        org.junit.Assert.assertEquals(locale17.toString(), "");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertNotNull(objArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray22), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray22), "[]");
        org.junit.Assert.assertNotNull(printWriter24);
        org.junit.Assert.assertNotNull(printWriter25);
        org.junit.Assert.assertNotNull(printWriter37);
        org.junit.Assert.assertNotNull(locale43);
        org.junit.Assert.assertEquals(locale43.toString(), "");
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertNotNull(locale45);
        org.junit.Assert.assertEquals(locale45.toString(), "");
        org.junit.Assert.assertEquals("'" + str46 + "' != '" + "" + "'", str46, "");
        org.junit.Assert.assertNotNull(locale47);
        org.junit.Assert.assertEquals(locale47.toString(), "");
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertEquals("'" + str49 + "' != '" + "" + "'", str49, "");
        org.junit.Assert.assertNotNull(objArray52);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray52), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray52), "[]");
        org.junit.Assert.assertNotNull(printWriter54);
        org.junit.Assert.assertNotNull(locale61);
        org.junit.Assert.assertEquals(locale61.toString(), "");
        org.junit.Assert.assertNotNull(objArray64);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray64), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray64), "[]");
        org.junit.Assert.assertNotNull(throwableArray66);
        org.junit.Assert.assertNotNull(throwableArray67);
        org.junit.Assert.assertNotNull(printWriter68);
        org.junit.Assert.assertNotNull(printWriter69);
        org.junit.Assert.assertNotNull(printWriter70);
        org.junit.Assert.assertNotNull(charArray77);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray77), "xu");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray77), "xu");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray77), "[x, u]");
    }

    @Test
    public void test00281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00281");
        java.io.PrintStream printStream1 = new java.io.PrintStream("zh_CN");
        printStream1.println();
        java.io.PrintStream printStream4 = printStream1.append('#');
        printStream1.close();
        printStream1.print((float) 'u');
        printStream1.println(35);
        printStream1.println(0.0d);
        printStream1.print(0.2991452991452851d);
        org.junit.Assert.assertNotNull(printStream4);
    }

    @Test
    public void test00282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00282");
        java.util.Locale.LanguageRange[] languageRangeArray0 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList1 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList1, languageRangeArray0);
        java.util.Collection<java.util.Locale> localeCollection3 = null;
        java.util.Locale locale4 = java.util.Locale.lookup((java.util.List<java.util.Locale.LanguageRange>) languageRangeList1, localeCollection3);
        java.lang.String[] strArray6 = new java.lang.String[] { "hi!" };
        java.util.ArrayList<java.lang.String> strList7 = new java.util.ArrayList<java.lang.String>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList7, strArray6);
        java.lang.String str9 = java.util.Locale.lookupTag((java.util.List<java.util.Locale.LanguageRange>) languageRangeList1, (java.util.Collection<java.lang.String>) strList7);
        java.util.Locale locale10 = java.util.Locale.ROOT;
        boolean boolean11 = locale10.hasExtensions();
        java.lang.String str12 = locale10.getCountry();
        java.util.Locale locale13 = java.util.Locale.JAPAN;
        java.util.Locale locale14 = java.util.Locale.FRENCH;
        java.util.Locale locale18 = new java.util.Locale("", "", "");
        java.util.Locale[] localeArray19 = new java.util.Locale[] { locale10, locale13, locale14, locale18 };
        java.util.ArrayList<java.util.Locale> localeList20 = new java.util.ArrayList<java.util.Locale>();
        boolean boolean21 = java.util.Collections.addAll((java.util.Collection<java.util.Locale>) localeList20, localeArray19);
        java.util.List<java.util.Locale> localeList22 = java.util.Locale.filter((java.util.List<java.util.Locale.LanguageRange>) languageRangeList1, (java.util.Collection<java.util.Locale>) localeList20);
        java.util.Locale.LanguageRange[] languageRangeArray23 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList24 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean25 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList24, languageRangeArray23);
        java.util.Collection<java.util.Locale> localeCollection26 = null;
        java.util.Locale locale27 = java.util.Locale.lookup((java.util.List<java.util.Locale.LanguageRange>) languageRangeList24, localeCollection26);
        java.lang.String[] strArray29 = new java.lang.String[] { "hi!" };
        java.util.ArrayList<java.lang.String> strList30 = new java.util.ArrayList<java.lang.String>();
        boolean boolean31 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList30, strArray29);
        java.lang.String str32 = java.util.Locale.lookupTag((java.util.List<java.util.Locale.LanguageRange>) languageRangeList24, (java.util.Collection<java.lang.String>) strList30);
        java.util.Locale locale33 = java.util.Locale.ROOT;
        boolean boolean34 = locale33.hasExtensions();
        java.lang.String str35 = locale33.getCountry();
        java.util.Locale locale36 = java.util.Locale.JAPAN;
        java.util.Locale locale37 = java.util.Locale.FRENCH;
        java.util.Locale locale41 = new java.util.Locale("", "", "");
        java.util.Locale[] localeArray42 = new java.util.Locale[] { locale33, locale36, locale37, locale41 };
        java.util.ArrayList<java.util.Locale> localeList43 = new java.util.ArrayList<java.util.Locale>();
        boolean boolean44 = java.util.Collections.addAll((java.util.Collection<java.util.Locale>) localeList43, localeArray42);
        java.util.List<java.util.Locale> localeList45 = java.util.Locale.filter((java.util.List<java.util.Locale.LanguageRange>) languageRangeList24, (java.util.Collection<java.util.Locale>) localeList43);
        java.util.List<java.util.Locale> localeList46 = java.util.Locale.filter((java.util.List<java.util.Locale.LanguageRange>) languageRangeList1, (java.util.Collection<java.util.Locale>) localeList45);
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap47 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList48 = java.util.Locale.LanguageRange.mapEquivalents((java.util.List<java.util.Locale.LanguageRange>) languageRangeList1, strMap47);
        java.util.Locale.LanguageRange[] languageRangeArray49 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList50 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean51 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList50, languageRangeArray49);
        java.lang.String[] strArray55 = new java.lang.String[] { "", "Italy", "fr" };
        java.util.ArrayList<java.lang.String> strList56 = new java.util.ArrayList<java.lang.String>();
        boolean boolean57 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList56, strArray55);
        java.util.List<java.lang.String> strList58 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList50, (java.util.Collection<java.lang.String>) strList56);
        java.lang.String str59 = java.util.Locale.lookupTag(languageRangeList48, (java.util.Collection<java.lang.String>) strList58);
        org.junit.Assert.assertNotNull(languageRangeArray0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(locale4);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNotNull(locale10);
        org.junit.Assert.assertEquals(locale10.toString(), "");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNotNull(locale13);
        org.junit.Assert.assertEquals(locale13.toString(), "ja_JP");
        org.junit.Assert.assertNotNull(locale14);
        org.junit.Assert.assertEquals(locale14.toString(), "fr");
        org.junit.Assert.assertEquals(locale18.toString(), "");
        org.junit.Assert.assertNotNull(localeArray19);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertNotNull(localeList22);
        org.junit.Assert.assertNotNull(languageRangeArray23);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNull(locale27);
        org.junit.Assert.assertNotNull(strArray29);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
        org.junit.Assert.assertNull(str32);
        org.junit.Assert.assertNotNull(locale33);
        org.junit.Assert.assertEquals(locale33.toString(), "");
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "" + "'", str35, "");
        org.junit.Assert.assertNotNull(locale36);
        org.junit.Assert.assertEquals(locale36.toString(), "ja_JP");
        org.junit.Assert.assertNotNull(locale37);
        org.junit.Assert.assertEquals(locale37.toString(), "fr");
        org.junit.Assert.assertEquals(locale41.toString(), "");
        org.junit.Assert.assertNotNull(localeArray42);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + true + "'", boolean44 == true);
        org.junit.Assert.assertNotNull(localeList45);
        org.junit.Assert.assertNotNull(localeList46);
        org.junit.Assert.assertNotNull(languageRangeList48);
        org.junit.Assert.assertNotNull(languageRangeArray49);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertNotNull(strArray55);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + true + "'", boolean57 == true);
        org.junit.Assert.assertNotNull(strList58);
        org.junit.Assert.assertNull(str59);
    }

    @Test
    public void test00283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00283");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl((int) 'u', (int) (byte) 1, (int) '#');
        hypergeometricDistributionImpl3.setPopulationSize(117);
        double double7 = hypergeometricDistributionImpl3.probability((double) 0);
        hypergeometricDistributionImpl3.setNumberOfSuccesses(100);
        double double12 = hypergeometricDistributionImpl3.cumulativeProbability((double) (-1L), 0.0d);
        double double14 = hypergeometricDistributionImpl3.upperCumulativeProbability(35);
        // The following exception was thrown during execution in test generation
        try {
            hypergeometricDistributionImpl3.setNumberOfSuccesses((int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: number of successes must be non-negative.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.7008547008546866d + "'", double7 == 0.7008547008546866d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.001354928450285685d + "'", double14 == 0.001354928450285685d);
    }

    @Test
    public void test00284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00284");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl((int) 'u', (int) (byte) 1, (int) '#');
        int int4 = hypergeometricDistributionImpl3.getPopulationSize();
        double double6 = hypergeometricDistributionImpl3.cumulativeProbability((double) (short) -1);
        hypergeometricDistributionImpl3.setSampleSize((int) '#');
        // The following exception was thrown during execution in test generation
        try {
            int int10 = hypergeometricDistributionImpl3.inverseCumulativeProbability((double) 10L);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: p must be between 0 and 1.0 (inclusive)");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 117 + "'", int4 == 117);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
    }

    @Test
    public void test00285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00285");
        java.lang.Object[] objArray2 = new java.lang.Object[] {};
        org.apache.commons.math.MathException mathException3 = new org.apache.commons.math.MathException("hi!", objArray2);
        org.apache.commons.math.MathException mathException4 = new org.apache.commons.math.MathException("fr", objArray2);
        java.lang.Throwable[] throwableArray5 = mathException4.getSuppressed();
        java.lang.String str6 = mathException4.toString();
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray2), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray2), "[]");
        org.junit.Assert.assertNotNull(throwableArray5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "org.apache.commons.math.MathException: fr" + "'", str6, "org.apache.commons.math.MathException: fr");
    }

    @Test
    public void test00286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00286");
        java.io.File file0 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.io.PrintWriter printWriter2 = new java.io.PrintWriter(file0, "FR");
            org.junit.Assert.fail("Expected exception of type java.io.UnsupportedEncodingException; message: FR");
        } catch (java.io.UnsupportedEncodingException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00287");
        java.util.Locale locale0 = java.util.Locale.TAIWAN;
        java.util.Locale.Category category1 = java.util.Locale.Category.FORMAT;
        java.util.Locale locale2 = java.util.Locale.getDefault(category1);
        java.util.Locale locale3 = java.util.Locale.getDefault(category1);
        java.lang.String str4 = locale3.getDisplayScript();
        java.util.Set<java.lang.String> strSet5 = locale3.getUnicodeLocaleAttributes();
        java.lang.String str6 = locale0.getDisplayName(locale3);
        java.lang.String str7 = locale0.toString();
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "zh_TW");
        org.junit.Assert.assertTrue("'" + category1 + "' != '" + java.util.Locale.Category.FORMAT + "'", category1.equals(java.util.Locale.Category.FORMAT));
        org.junit.Assert.assertNotNull(locale2);
// flaky:         org.junit.Assert.assertEquals(locale2.toString(), "de_DE");
        org.junit.Assert.assertNotNull(locale3);
// flaky:         org.junit.Assert.assertEquals(locale3.toString(), "de_DE");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(strSet5);
// flaky:         org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Chinesisch (Taiwan)" + "'", str6, "Chinesisch (Taiwan)");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "zh_TW" + "'", str7, "zh_TW");
    }

    @Test
    public void test00288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00288");
        java.io.PrintWriter printWriter2 = new java.io.PrintWriter("fr");
        printWriter2.print("it_IT");
        java.util.Locale locale5 = java.util.Locale.ROOT;
        boolean boolean6 = locale5.hasExtensions();
        java.util.Locale locale7 = java.util.Locale.ROOT;
        java.lang.String str8 = locale5.getDisplayName(locale7);
        java.util.Locale locale9 = java.util.Locale.ROOT;
        boolean boolean10 = locale9.hasExtensions();
        java.lang.String str11 = locale5.getDisplayCountry(locale9);
        java.lang.Object[] objArray14 = new java.lang.Object[] {};
        org.apache.commons.math.MathException mathException15 = new org.apache.commons.math.MathException("hi!", objArray14);
        java.io.PrintWriter printWriter16 = printWriter2.printf(locale9, "it_IT", objArray14);
        org.apache.commons.math.MathException mathException17 = new org.apache.commons.math.MathException("", objArray14);
        java.lang.Object[] objArray18 = mathException17.getArguments();
        java.lang.String str19 = mathException17.toString();
        org.junit.Assert.assertNotNull(locale5);
        org.junit.Assert.assertEquals(locale5.toString(), "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(locale7);
        org.junit.Assert.assertEquals(locale7.toString(), "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(locale9);
        org.junit.Assert.assertEquals(locale9.toString(), "");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNotNull(objArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray14), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray14), "[]");
        org.junit.Assert.assertNotNull(printWriter16);
        org.junit.Assert.assertNotNull(objArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray18), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray18), "[]");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "org.apache.commons.math.MathException: " + "'", str19, "org.apache.commons.math.MathException: ");
    }

    @Test
    public void test00289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00289");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clearExtensions();
        java.util.Locale.Builder builder2 = builder1.clearExtensions();
        java.util.Locale.Builder builder3 = builder1.clear();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder6 = builder1.setUnicodeLocaleKeyword("italiano", "en-GB");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed Unicode locale keyword key: italiano [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder3);
    }

    @Test
    public void test00290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00290");
        java.io.PrintWriter printWriter1 = new java.io.PrintWriter("fr");
        printWriter1.print("it_IT");
        java.lang.Object[] objArray5 = new java.lang.Object[] {};
        java.io.PrintWriter printWriter6 = printWriter1.printf("fr", objArray5);
        printWriter1.println((float) 'u');
        printWriter1.write("it_IT");
        java.util.Locale.LanguageRange languageRange12 = new java.util.Locale.LanguageRange("English");
        printWriter1.println((java.lang.Object) "English");
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray5), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray5), "[]");
        org.junit.Assert.assertNotNull(printWriter6);
    }

    @Test
    public void test00291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00291");
        java.util.Locale.Category category0 = java.util.Locale.Category.FORMAT;
        java.util.Locale locale1 = java.util.Locale.getDefault(category0);
        java.util.Locale locale2 = java.util.Locale.getDefault(category0);
        java.lang.String str3 = locale2.getDisplayScript();
        java.util.Set<java.lang.String> strSet4 = locale2.getUnicodeLocaleAttributes();
        java.lang.String str5 = locale2.getISO3Language();
        java.lang.Object obj6 = locale2.clone();
        org.junit.Assert.assertTrue("'" + category0 + "' != '" + java.util.Locale.Category.FORMAT + "'", category0.equals(java.util.Locale.Category.FORMAT));
        org.junit.Assert.assertNotNull(locale1);
// flaky:         org.junit.Assert.assertEquals(locale1.toString(), "de_DE");
        org.junit.Assert.assertNotNull(locale2);
// flaky:         org.junit.Assert.assertEquals(locale2.toString(), "de_DE");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNotNull(strSet4);
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "deu" + "'", str5, "deu");
        org.junit.Assert.assertNotNull(obj6);
// flaky:         org.junit.Assert.assertEquals(obj6.toString(), "de_DE");
// flaky:         org.junit.Assert.assertEquals(java.lang.String.valueOf(obj6), "de_DE");
// flaky:         org.junit.Assert.assertEquals(java.util.Objects.toString(obj6), "de_DE");
    }

    @Test
    public void test00292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00292");
        java.util.Locale locale0 = java.util.Locale.GERMANY;
        java.util.Set<java.lang.String> strSet1 = locale0.getUnicodeLocaleKeys();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str3 = locale0.getUnicodeLocaleType("eng");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Ill-formed Unicode locale key: eng");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "de_DE");
        org.junit.Assert.assertNotNull(strSet1);
    }

    @Test
    public void test00293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00293");
        java.io.PrintStream printStream1 = new java.io.PrintStream("zh_CN");
        printStream1.println();
        java.io.PrintStream printStream4 = printStream1.append('#');
        printStream1.close();
        byte[] byteArray9 = new byte[] { (byte) 1, (byte) 10, (byte) -1 };
        printStream1.write(byteArray9);
        printStream1.write((int) 'a');
        java.io.PrintStream printStream13 = new java.io.PrintStream((java.io.OutputStream) printStream1);
        java.io.PrintStream printStream15 = printStream1.append((java.lang.CharSequence) "italiano (Italia)");
        java.io.PrintWriter printWriter16 = new java.io.PrintWriter((java.io.OutputStream) printStream15);
        printWriter16.print(false);
        // The following exception was thrown during execution in test generation
        try {
            java.io.PrintWriter printWriter22 = printWriter16.append((java.lang.CharSequence) "italiano (Italia)", (int) 'u', 10);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: -107");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(printStream4);
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray9), "[1, 10, -1]");
        org.junit.Assert.assertNotNull(printStream15);
    }

    @Test
    public void test00294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00294");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clearExtensions();
        java.util.Locale.Builder builder3 = builder1.setLanguageTag("fr");
        java.util.Locale.Builder builder5 = builder3.setLanguageTag("fr-CA");
        java.util.Locale.Builder builder6 = builder3.clear();
        java.util.Locale locale7 = java.util.Locale.JAPANESE;
        java.util.Locale locale8 = java.util.Locale.JAPANESE;
        java.lang.String str9 = locale7.getDisplayCountry(locale8);
        java.lang.String str10 = locale7.getVariant();
        java.util.Locale.Builder builder11 = builder3.setLocale(locale7);
        java.io.PrintWriter printWriter13 = new java.io.PrintWriter("fr");
        printWriter13.print("it_IT");
        java.util.Locale locale17 = java.util.Locale.forLanguageTag("");
        java.lang.Object[] objArray20 = new java.lang.Object[] {};
        org.apache.commons.math.MathException mathException21 = new org.apache.commons.math.MathException("hi!", objArray20);
        java.lang.Throwable[] throwableArray22 = mathException21.getSuppressed();
        java.lang.Throwable[] throwableArray23 = mathException21.getSuppressed();
        java.io.PrintWriter printWriter24 = printWriter13.printf(locale17, "it_IT", (java.lang.Object[]) throwableArray23);
        printWriter13.println((float) (byte) 10);
        java.io.PrintWriter printWriter28 = new java.io.PrintWriter("fr");
        printWriter28.write("hi!");
        printWriter13.println((java.lang.Object) printWriter28);
        java.io.PrintWriter printWriter33 = printWriter13.append('#');
        boolean boolean34 = locale7.equals((java.lang.Object) '#');
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(locale7);
        org.junit.Assert.assertEquals(locale7.toString(), "ja");
        org.junit.Assert.assertNotNull(locale8);
        org.junit.Assert.assertEquals(locale8.toString(), "ja");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(builder11);
        org.junit.Assert.assertNotNull(locale17);
        org.junit.Assert.assertEquals(locale17.toString(), "");
        org.junit.Assert.assertNotNull(objArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray20), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray20), "[]");
        org.junit.Assert.assertNotNull(throwableArray22);
        org.junit.Assert.assertNotNull(throwableArray23);
        org.junit.Assert.assertNotNull(printWriter24);
        org.junit.Assert.assertNotNull(printWriter33);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
    }

    @Test
    public void test00295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00295");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl((int) 'u', (int) (byte) 1, (int) '#');
        int int4 = hypergeometricDistributionImpl3.getSampleSize();
        int int5 = hypergeometricDistributionImpl3.getPopulationSize();
        double double7 = hypergeometricDistributionImpl3.upperCumulativeProbability((int) '#');
        int int8 = hypergeometricDistributionImpl3.getPopulationSize();
        int int9 = hypergeometricDistributionImpl3.getPopulationSize();
        double double12 = hypergeometricDistributionImpl3.cumulativeProbability((double) (short) 0, (double) 'a');
        int int13 = hypergeometricDistributionImpl3.getPopulationSize();
        int int14 = hypergeometricDistributionImpl3.getSampleSize();
        // The following exception was thrown during execution in test generation
        try {
            double double17 = hypergeometricDistributionImpl3.cumulativeProbability((double) 'u', (double) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: lower endpoint must be less than or equal to upper endpoint");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 35 + "'", int4 == 35);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 117 + "'", int5 == 117);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 117 + "'", int8 == 117);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 117 + "'", int9 == 117);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 1.0d + "'", double12 == 1.0d);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 117 + "'", int13 == 117);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 35 + "'", int14 == 35);
    }

    @Test
    public void test00296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00296");
        // The following exception was thrown during execution in test generation
        try {
            java.io.PrintWriter printWriter2 = new java.io.PrintWriter("zh", "italien (Italie)");
            org.junit.Assert.fail("Expected exception of type java.io.UnsupportedEncodingException; message: italien (Italie)");
        } catch (java.io.UnsupportedEncodingException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00297");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder2 = builder0.setVariant("CN");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed variant: CN [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00298");
        java.io.PrintWriter printWriter1 = new java.io.PrintWriter("english");
        // The following exception was thrown during execution in test generation
        try {
            printWriter1.write("Italy", (int) (short) -1, (int) 'u');
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: -1");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00299");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.LanguageRange languageRange2 = new java.util.Locale.LanguageRange("", 0.1709401709401705d);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: range=");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00300");
        java.io.PrintWriter printWriter1 = new java.io.PrintWriter("fr");
        printWriter1.print("it_IT");
        java.lang.Object[] objArray5 = new java.lang.Object[] {};
        java.io.PrintWriter printWriter6 = printWriter1.printf("fr", objArray5);
        printWriter1.println((float) 'u');
        printWriter1.write("en-GB");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl14 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl((int) 'u', (int) (byte) 1, (int) '#');
        int int15 = hypergeometricDistributionImpl14.getSampleSize();
        int int16 = hypergeometricDistributionImpl14.getPopulationSize();
        double double18 = hypergeometricDistributionImpl14.upperCumulativeProbability((int) '#');
        int int19 = hypergeometricDistributionImpl14.getPopulationSize();
        int int20 = hypergeometricDistributionImpl14.getNumberOfSuccesses();
        hypergeometricDistributionImpl14.setNumberOfSuccesses((int) (byte) 10);
        printWriter1.print((java.lang.Object) hypergeometricDistributionImpl14);
        // The following exception was thrown during execution in test generation
        try {
            printWriter1.write("hi! (ITALY)", (int) (short) -1, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: -1");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray5), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray5), "[]");
        org.junit.Assert.assertNotNull(printWriter6);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 35 + "'", int15 == 35);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 117 + "'", int16 == 117);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 0.0d + "'", double18 == 0.0d);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 117 + "'", int19 == 117);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1 + "'", int20 == 1);
    }

    @Test
    public void test00301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00301");
        java.io.File file0 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.io.PrintWriter printWriter2 = new java.io.PrintWriter(file0, "China");
            org.junit.Assert.fail("Expected exception of type java.io.UnsupportedEncodingException; message: China");
        } catch (java.io.UnsupportedEncodingException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00302");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl((int) (byte) -1, (int) 'u', (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: number of successes must be less than or equal to population size");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00303");
        // The following exception was thrown during execution in test generation
        try {
            java.io.PrintStream printStream2 = new java.io.PrintStream("zh", "ja");
            org.junit.Assert.fail("Expected exception of type java.io.UnsupportedEncodingException; message: ja");
        } catch (java.io.UnsupportedEncodingException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00304");
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<java.util.Locale.LanguageRange> languageRangeList2 = java.util.Locale.LanguageRange.parse("\u65e5\u672c\u8a9e", strMap1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: range=???");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00305");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl((int) 'u', (int) (byte) 1, (int) '#');
        double double6 = hypergeometricDistributionImpl3.cumulativeProbability(0.0d, (double) '4');
        int int7 = hypergeometricDistributionImpl3.getNumberOfSuccesses();
        double double9 = hypergeometricDistributionImpl3.cumulativeProbability((int) (byte) 1);
        double double11 = hypergeometricDistributionImpl3.probability((double) 10L);
        int int12 = hypergeometricDistributionImpl3.getNumberOfSuccesses();
        double double14 = hypergeometricDistributionImpl3.probability(0.7008547008546866d);
        // The following exception was thrown during execution in test generation
        try {
            double double17 = hypergeometricDistributionImpl3.cumulativeProbability((double) '#', 0.02999999999999997d);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: lower endpoint must be less than or equal to upper endpoint");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0d + "'", double6 == 1.0d);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.0d + "'", double9 == 1.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
    }

    @Test
    public void test00306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00306");
        java.io.PrintWriter printWriter1 = new java.io.PrintWriter("fr");
        printWriter1.print("it_IT");
        java.util.Locale locale4 = java.util.Locale.ROOT;
        boolean boolean5 = locale4.hasExtensions();
        java.util.Locale locale6 = java.util.Locale.ROOT;
        java.lang.String str7 = locale4.getDisplayName(locale6);
        java.util.Locale locale8 = java.util.Locale.ROOT;
        boolean boolean9 = locale8.hasExtensions();
        java.lang.String str10 = locale4.getDisplayCountry(locale8);
        java.lang.Object[] objArray13 = new java.lang.Object[] {};
        org.apache.commons.math.MathException mathException14 = new org.apache.commons.math.MathException("hi!", objArray13);
        java.io.PrintWriter printWriter15 = printWriter1.printf(locale8, "it_IT", objArray13);
        printWriter15.print((double) 100L);
        java.util.Locale locale18 = java.util.Locale.JAPANESE;
        java.util.Locale locale19 = java.util.Locale.JAPANESE;
        java.lang.String str20 = locale18.getDisplayCountry(locale19);
        java.lang.String str21 = locale18.getVariant();
        java.lang.String str22 = locale18.getCountry();
        java.io.PrintStream printStream25 = new java.io.PrintStream("zh_CN");
        printStream25.print((float) (byte) -1);
        printStream25.println();
        printStream25.print("ita");
        java.util.Locale locale31 = java.util.Locale.FRENCH;
        java.util.Set<java.lang.String> strSet32 = locale31.getUnicodeLocaleKeys();
        java.util.Locale locale33 = locale31.stripExtensions();
        java.lang.Object[] objArray36 = new java.lang.Object[] {};
        org.apache.commons.math.MathException mathException37 = new org.apache.commons.math.MathException("hi!", objArray36);
        java.lang.Throwable[] throwableArray38 = mathException37.getSuppressed();
        java.lang.Throwable[] throwableArray39 = mathException37.getSuppressed();
        java.io.PrintStream printStream40 = printStream25.printf(locale33, "fr", (java.lang.Object[]) throwableArray39);
        java.io.PrintWriter printWriter41 = printWriter15.format(locale18, "fra", (java.lang.Object[]) throwableArray39);
        char[] charArray42 = new char[] {};
        printWriter15.print(charArray42);
        printWriter15.flush();
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(locale6);
        org.junit.Assert.assertEquals(locale6.toString(), "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(locale8);
        org.junit.Assert.assertEquals(locale8.toString(), "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(objArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray13), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray13), "[]");
        org.junit.Assert.assertNotNull(printWriter15);
        org.junit.Assert.assertNotNull(locale18);
        org.junit.Assert.assertEquals(locale18.toString(), "ja");
        org.junit.Assert.assertNotNull(locale19);
        org.junit.Assert.assertEquals(locale19.toString(), "ja");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertNotNull(locale31);
        org.junit.Assert.assertEquals(locale31.toString(), "fr");
        org.junit.Assert.assertNotNull(strSet32);
        org.junit.Assert.assertNotNull(locale33);
        org.junit.Assert.assertEquals(locale33.toString(), "fr");
        org.junit.Assert.assertNotNull(objArray36);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray36), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray36), "[]");
        org.junit.Assert.assertNotNull(throwableArray38);
        org.junit.Assert.assertNotNull(throwableArray39);
        org.junit.Assert.assertNotNull(printStream40);
        org.junit.Assert.assertNotNull(printWriter41);
        org.junit.Assert.assertNotNull(charArray42);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray42), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray42), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray42), "[]");
    }

    @Test
    public void test00307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00307");
        java.util.Locale locale3 = new java.util.Locale("ko", "tedesco", "italien");
        org.junit.Assert.assertEquals(locale3.toString(), "ko_TEDESCO_italien");
    }

    @Test
    public void test00308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00308");
        java.io.PrintWriter printWriter1 = new java.io.PrintWriter("fr");
        // The following exception was thrown during execution in test generation
        try {
            printWriter1.write("english", (int) 'x', 97);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 217");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00309");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clearExtensions();
        java.util.Locale.Builder builder3 = builder1.setLanguageTag("fr");
        java.util.Locale.Builder builder5 = builder3.setLanguage("Italy");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder7 = builder3.setScript("\u65e5\u672c\u8a9e");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed script: ??? [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder5);
    }

    @Test
    public void test00310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00310");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clearExtensions();
        java.util.Locale.Builder builder3 = builder1.setLanguageTag("fr");
        java.util.Locale locale4 = builder3.build();
        java.util.Locale.Builder builder6 = builder3.setLanguageTag("ja");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder8 = builder3.addUnicodeLocaleAttribute("Chinese (Taiwan)");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed Unicode locale attribute: Chinese (Taiwan) [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "fr");
        org.junit.Assert.assertNotNull(builder6);
    }

    @Test
    public void test00311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00311");
        java.io.PrintWriter printWriter1 = new java.io.PrintWriter("fr");
        printWriter1.write("hi!");
        printWriter1.println((java.lang.Object) (-1L));
        java.util.Locale locale6 = java.util.Locale.ITALY;
        java.lang.String str7 = locale6.getDisplayName();
        java.lang.Object[] objArray10 = new java.lang.Object[] {};
        org.apache.commons.math.MathException mathException11 = new org.apache.commons.math.MathException("hi!", objArray10);
        java.lang.Object[] objArray12 = mathException11.getArguments();
        java.io.PrintWriter printWriter13 = printWriter1.format(locale6, "anglais", objArray12);
        // The following exception was thrown during execution in test generation
        try {
            printWriter1.write("italiano", (int) (short) 0, (int) 'u');
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 117");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(locale6);
        org.junit.Assert.assertEquals(locale6.toString(), "it_IT");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Italian (Italy)" + "'", str7, "Italian (Italy)");
        org.junit.Assert.assertNotNull(objArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray10), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray10), "[]");
        org.junit.Assert.assertNotNull(objArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray12), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray12), "[]");
        org.junit.Assert.assertNotNull(printWriter13);
    }

    @Test
    public void test00312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00312");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl((int) 'u', (int) (byte) 1, (int) '#');
        int int4 = hypergeometricDistributionImpl3.getPopulationSize();
        double double6 = hypergeometricDistributionImpl3.cumulativeProbability((int) (short) 100);
        int int7 = hypergeometricDistributionImpl3.getPopulationSize();
        double double9 = hypergeometricDistributionImpl3.cumulativeProbability((int) '4');
        int int10 = hypergeometricDistributionImpl3.getNumberOfSuccesses();
        hypergeometricDistributionImpl3.setPopulationSize((int) (short) 100);
        double double15 = hypergeometricDistributionImpl3.cumulativeProbability(0.0d, (double) (short) 100);
        // The following exception was thrown during execution in test generation
        try {
            int int17 = hypergeometricDistributionImpl3.inverseCumulativeProbability((double) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: p must be between 0 and 1.0 (inclusive)");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 117 + "'", int4 == 117);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0d + "'", double6 == 1.0d);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 117 + "'", int7 == 117);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.0d + "'", double9 == 1.0d);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 1.0d + "'", double15 == 1.0d);
    }

    @Test
    public void test00313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00313");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl((int) 'u', (int) (byte) 1, (int) '#');
        int int4 = hypergeometricDistributionImpl3.getSampleSize();
        int int5 = hypergeometricDistributionImpl3.getPopulationSize();
        double double7 = hypergeometricDistributionImpl3.upperCumulativeProbability((int) '#');
        int int8 = hypergeometricDistributionImpl3.getPopulationSize();
        int int9 = hypergeometricDistributionImpl3.getNumberOfSuccesses();
        hypergeometricDistributionImpl3.setNumberOfSuccesses((int) (byte) 10);
        double double13 = hypergeometricDistributionImpl3.cumulativeProbability(100.0d);
        // The following exception was thrown during execution in test generation
        try {
            hypergeometricDistributionImpl3.setPopulationSize((int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: population size must be positive.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 35 + "'", int4 == 35);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 117 + "'", int5 == 117);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 117 + "'", int8 == 117);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 1.0d + "'", double13 == 1.0d);
    }

    @Test
    public void test00314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00314");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clearExtensions();
        java.util.Locale.Builder builder2 = builder1.clearExtensions();
        java.util.Locale.Builder builder4 = builder1.setLanguage("de");
        java.util.Locale.Builder builder5 = builder1.clearExtensions();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder7 = builder5.setScript("\u4e2d\u56fd\u8a9e");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed script: ??? [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder5);
    }

    @Test
    public void test00315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00315");
        // The following exception was thrown during execution in test generation
        try {
            java.io.PrintStream printStream2 = new java.io.PrintStream("en-GB", "en-GB");
            org.junit.Assert.fail("Expected exception of type java.io.UnsupportedEncodingException; message: en-GB");
        } catch (java.io.UnsupportedEncodingException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00316");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clearExtensions();
        java.util.Locale locale2 = builder1.build();
        java.util.Locale.Builder builder3 = builder1.clearExtensions();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder5 = builder3.removeUnicodeLocaleAttribute("org.apache.commons.math.mathexception");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed Unicode locale attribute: org.apache.commons.math.mathexception [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "");
        org.junit.Assert.assertNotNull(builder3);
    }

    @Test
    public void test00317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00317");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl((int) 'u', (int) (byte) 1, (int) '#');
        int int4 = hypergeometricDistributionImpl3.getPopulationSize();
        double double6 = hypergeometricDistributionImpl3.cumulativeProbability((double) (short) -1);
        hypergeometricDistributionImpl3.setSampleSize((int) '#');
        int int9 = hypergeometricDistributionImpl3.getSampleSize();
        // The following exception was thrown during execution in test generation
        try {
            double double12 = hypergeometricDistributionImpl3.cumulativeProbability((int) (byte) 100, (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: lower endpoint must be less than or equal to upper endpoint");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 117 + "'", int4 == 117);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 35 + "'", int9 == 35);
    }

    @Test
    public void test00318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00318");
        java.util.Locale.Category category0 = java.util.Locale.Category.DISPLAY;
        java.util.Locale locale1 = java.util.Locale.JAPANESE;
        java.util.Locale.setDefault(category0, locale1);
        java.lang.String str3 = locale1.getDisplayLanguage();
        java.lang.String str4 = locale1.getDisplayVariant();
        java.lang.String str5 = locale1.toString();
        org.junit.Assert.assertTrue("'" + category0 + "' != '" + java.util.Locale.Category.DISPLAY + "'", category0.equals(java.util.Locale.Category.DISPLAY));
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "ja");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\u65e5\u672c\u8a9e" + "'", str3, "\u65e5\u672c\u8a9e");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "ja" + "'", str5, "ja");
    }

    @Test
    public void test00319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00319");
        java.util.Locale.Category category0 = java.util.Locale.Category.DISPLAY;
        java.util.Locale locale1 = java.util.Locale.JAPANESE;
        java.util.Locale.setDefault(category0, locale1);
        java.lang.String str3 = locale1.getDisplayLanguage();
        java.lang.String str4 = locale1.getDisplayName();
        org.junit.Assert.assertTrue("'" + category0 + "' != '" + java.util.Locale.Category.DISPLAY + "'", category0.equals(java.util.Locale.Category.DISPLAY));
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "ja");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\u65e5\u672c\u8a9e" + "'", str3, "\u65e5\u672c\u8a9e");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "\u65e5\u672c\u8a9e" + "'", str4, "\u65e5\u672c\u8a9e");
    }

    @Test
    public void test00320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00320");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl((int) 'u', (int) (byte) 1, (int) '#');
        int int4 = hypergeometricDistributionImpl3.getPopulationSize();
        double double6 = hypergeometricDistributionImpl3.cumulativeProbability((int) (short) 100);
        int int7 = hypergeometricDistributionImpl3.getPopulationSize();
        hypergeometricDistributionImpl3.setSampleSize((int) (byte) 100);
        int int10 = hypergeometricDistributionImpl3.getNumberOfSuccesses();
        // The following exception was thrown during execution in test generation
        try {
            double double13 = hypergeometricDistributionImpl3.cumulativeProbability(0.11499182616210182d, 0.7008547008546866d);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: lower endpoint must be less than or equal to upper endpoint");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 117 + "'", int4 == 117);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0d + "'", double6 == 1.0d);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 117 + "'", int7 == 117);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
    }

    @Test
    public void test00321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00321");
        java.util.Locale locale0 = java.util.Locale.getDefault();
        java.lang.String str2 = locale0.getExtension('a');
        java.util.Locale locale3 = java.util.Locale.JAPANESE;
        java.util.Locale locale4 = java.util.Locale.JAPANESE;
        java.lang.String str5 = locale3.getDisplayCountry(locale4);
        java.lang.String str6 = locale3.getVariant();
        java.util.Locale locale7 = java.util.Locale.CANADA;
        java.lang.String str8 = locale3.getDisplayScript(locale7);
        java.util.Locale locale11 = new java.util.Locale("Italy", "Italy");
        java.lang.String str12 = locale7.getDisplayLanguage(locale11);
        java.lang.String str13 = locale0.getDisplayVariant(locale7);
        java.lang.Object obj14 = locale7.clone();
        org.junit.Assert.assertNotNull(locale0);
// flaky:         org.junit.Assert.assertEquals(locale0.toString(), "ja");
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNotNull(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "ja");
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "ja");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(locale7);
        org.junit.Assert.assertEquals(locale7.toString(), "en_CA");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals(locale11.toString(), "italy_ITALY");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "English" + "'", str12, "English");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNotNull(obj14);
        org.junit.Assert.assertEquals(obj14.toString(), "en_CA");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj14), "en_CA");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj14), "en_CA");
    }

    @Test
    public void test00322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00322");
        java.io.PrintStream printStream1 = new java.io.PrintStream("zh_CN");
        printStream1.print((float) (byte) -1);
        printStream1.println();
        printStream1.println();
        java.io.PrintStream printStream7 = new java.io.PrintStream((java.io.OutputStream) printStream1, true);
        java.io.PrintWriter printWriter9 = new java.io.PrintWriter("fr");
        printWriter9.print("it_IT");
        java.util.Locale locale12 = java.util.Locale.ROOT;
        boolean boolean13 = locale12.hasExtensions();
        java.util.Locale locale14 = java.util.Locale.ROOT;
        java.lang.String str15 = locale12.getDisplayName(locale14);
        java.util.Locale locale16 = java.util.Locale.ROOT;
        boolean boolean17 = locale16.hasExtensions();
        java.lang.String str18 = locale12.getDisplayCountry(locale16);
        java.lang.Object[] objArray21 = new java.lang.Object[] {};
        org.apache.commons.math.MathException mathException22 = new org.apache.commons.math.MathException("hi!", objArray21);
        java.io.PrintWriter printWriter23 = printWriter9.printf(locale16, "it_IT", objArray21);
        printStream7.println((java.lang.Object) "it_IT");
        java.io.PrintStream printStream26 = printStream7.append((java.lang.CharSequence) "fr");
        java.io.PrintStream printStream27 = new java.io.PrintStream((java.io.OutputStream) printStream7);
        printStream7.println("");
        java.util.Locale.Builder builder30 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder31 = builder30.clearExtensions();
        java.util.Locale.Builder builder33 = builder31.setLanguageTag("fr");
        java.util.Locale locale34 = builder33.build();
        java.util.Locale.Builder builder35 = builder33.clearExtensions();
        printStream7.print((java.lang.Object) builder35);
        java.util.Locale.Builder builder37 = builder35.clear();
        java.util.Locale.Builder builder38 = builder37.clear();
        java.util.Locale.Builder builder40 = builder37.setRegion("FR");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder43 = builder37.setUnicodeLocaleKeyword("China", "\u30a4\u30bf\u30ea\u30a2\u8a9e\u30a4\u30bf\u30ea\u30a2)");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed Unicode locale keyword key: China [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(locale12);
        org.junit.Assert.assertEquals(locale12.toString(), "");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(locale14);
        org.junit.Assert.assertEquals(locale14.toString(), "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertNotNull(locale16);
        org.junit.Assert.assertEquals(locale16.toString(), "");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertNotNull(objArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray21), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray21), "[]");
        org.junit.Assert.assertNotNull(printWriter23);
        org.junit.Assert.assertNotNull(printStream26);
        org.junit.Assert.assertNotNull(builder31);
        org.junit.Assert.assertNotNull(builder33);
        org.junit.Assert.assertNotNull(locale34);
        org.junit.Assert.assertEquals(locale34.toString(), "fr");
        org.junit.Assert.assertNotNull(builder35);
        org.junit.Assert.assertNotNull(builder37);
        org.junit.Assert.assertNotNull(builder38);
        org.junit.Assert.assertNotNull(builder40);
    }

    @Test
    public void test00323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00323");
        // The following exception was thrown during execution in test generation
        try {
            java.io.PrintStream printStream2 = new java.io.PrintStream("Italy", "en-GB");
            org.junit.Assert.fail("Expected exception of type java.io.UnsupportedEncodingException; message: en-GB");
        } catch (java.io.UnsupportedEncodingException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00324");
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<java.util.Locale.LanguageRange> languageRangeList1 = java.util.Locale.LanguageRange.parse("hi! (ITALY)");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: range=hi!(italy)");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00325");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl((int) 'u', (int) (byte) 1, (int) '#');
        int int4 = hypergeometricDistributionImpl3.getPopulationSize();
        double double6 = hypergeometricDistributionImpl3.cumulativeProbability((double) (short) -1);
        double double8 = hypergeometricDistributionImpl3.probability((double) (short) 100);
        double double10 = hypergeometricDistributionImpl3.cumulativeProbability((double) 117);
        double double12 = hypergeometricDistributionImpl3.cumulativeProbability((double) 'a');
        double double14 = hypergeometricDistributionImpl3.cumulativeProbability((int) '4');
        hypergeometricDistributionImpl3.setNumberOfSuccesses((int) (byte) 1);
        int int17 = hypergeometricDistributionImpl3.getPopulationSize();
        // The following exception was thrown during execution in test generation
        try {
            hypergeometricDistributionImpl3.setNumberOfSuccesses((int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: number of successes must be non-negative.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 117 + "'", int4 == 117);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 1.0d + "'", double10 == 1.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 1.0d + "'", double12 == 1.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 1.0d + "'", double14 == 1.0d);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 117 + "'", int17 == 117);
    }

    @Test
    public void test00326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00326");
        java.io.PrintStream printStream2 = new java.io.PrintStream("zh_CN");
        printStream2.print((float) (byte) -1);
        printStream2.println();
        printStream2.print("ita");
        java.util.Locale locale8 = java.util.Locale.FRENCH;
        java.util.Set<java.lang.String> strSet9 = locale8.getUnicodeLocaleKeys();
        java.util.Locale locale10 = locale8.stripExtensions();
        java.lang.Object[] objArray13 = new java.lang.Object[] {};
        org.apache.commons.math.MathException mathException14 = new org.apache.commons.math.MathException("hi!", objArray13);
        java.lang.Throwable[] throwableArray15 = mathException14.getSuppressed();
        java.lang.Throwable[] throwableArray16 = mathException14.getSuppressed();
        java.io.PrintStream printStream17 = printStream2.printf(locale10, "fr", (java.lang.Object[]) throwableArray16);
        java.lang.Throwable throwable18 = null;
        org.apache.commons.math.MathException mathException19 = new org.apache.commons.math.MathException(throwable18);
        org.apache.commons.math.MathException mathException20 = new org.apache.commons.math.MathException((java.lang.Throwable) mathException19);
        org.apache.commons.math.MathException mathException21 = new org.apache.commons.math.MathException((java.lang.Throwable) mathException20);
        org.apache.commons.math.MathException mathException22 = new org.apache.commons.math.MathException("zh_CN", (java.lang.Object[]) throwableArray16, (java.lang.Throwable) mathException21);
        java.lang.String str23 = mathException21.toString();
        org.junit.Assert.assertNotNull(locale8);
        org.junit.Assert.assertEquals(locale8.toString(), "fr");
        org.junit.Assert.assertNotNull(strSet9);
        org.junit.Assert.assertNotNull(locale10);
        org.junit.Assert.assertEquals(locale10.toString(), "fr");
        org.junit.Assert.assertNotNull(objArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray13), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray13), "[]");
        org.junit.Assert.assertNotNull(throwableArray15);
        org.junit.Assert.assertNotNull(throwableArray16);
        org.junit.Assert.assertNotNull(printStream17);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "org.apache.commons.math.MathException" + "'", str23, "org.apache.commons.math.MathException");
    }

    @Test
    public void test00327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00327");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clearExtensions();
        java.util.Locale.Builder builder3 = builder1.setLanguageTag("fr");
        java.util.Locale.Builder builder5 = builder3.setLanguage("Italy");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder7 = builder3.setVariant("hi! (ITALY)");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed variant: hi! (ITALY) [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder5);
    }

    @Test
    public void test00328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00328");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clearExtensions();
        java.util.Locale.Builder builder3 = builder0.setScript("");
        java.util.Locale.Builder builder5 = builder3.removeUnicodeLocaleAttribute("Italy");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder8 = builder3.setUnicodeLocaleKeyword("ja", "de");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed Unicode locale keyword type: de [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder5);
    }

    @Test
    public void test00329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00329");
        java.io.PrintWriter printWriter1 = new java.io.PrintWriter("ita");
        printWriter1.close();
    }

    @Test
    public void test00330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00330");
        java.util.Locale.LanguageRange[] languageRangeArray0 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList1 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList1, languageRangeArray0);
        java.util.Collection<java.util.Locale> localeCollection3 = null;
        java.util.Locale locale4 = java.util.Locale.lookup((java.util.List<java.util.Locale.LanguageRange>) languageRangeList1, localeCollection3);
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap5 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList6 = java.util.Locale.LanguageRange.mapEquivalents((java.util.List<java.util.Locale.LanguageRange>) languageRangeList1, strMap5);
        java.util.Locale.LanguageRange[] languageRangeArray7 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList8 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean9 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList8, languageRangeArray7);
        java.util.Collection<java.util.Locale> localeCollection10 = null;
        java.util.Locale locale11 = java.util.Locale.lookup((java.util.List<java.util.Locale.LanguageRange>) languageRangeList8, localeCollection10);
        java.lang.String[] strArray13 = new java.lang.String[] { "hi!" };
        java.util.ArrayList<java.lang.String> strList14 = new java.util.ArrayList<java.lang.String>();
        boolean boolean15 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList14, strArray13);
        java.lang.String str16 = java.util.Locale.lookupTag((java.util.List<java.util.Locale.LanguageRange>) languageRangeList8, (java.util.Collection<java.lang.String>) strList14);
        java.util.Locale locale17 = java.util.Locale.ROOT;
        boolean boolean18 = locale17.hasExtensions();
        java.lang.String str19 = locale17.getCountry();
        java.util.Locale locale20 = java.util.Locale.JAPAN;
        java.util.Locale locale21 = java.util.Locale.FRENCH;
        java.util.Locale locale25 = new java.util.Locale("", "", "");
        java.util.Locale[] localeArray26 = new java.util.Locale[] { locale17, locale20, locale21, locale25 };
        java.util.ArrayList<java.util.Locale> localeList27 = new java.util.ArrayList<java.util.Locale>();
        boolean boolean28 = java.util.Collections.addAll((java.util.Collection<java.util.Locale>) localeList27, localeArray26);
        java.util.List<java.util.Locale> localeList29 = java.util.Locale.filter((java.util.List<java.util.Locale.LanguageRange>) languageRangeList8, (java.util.Collection<java.util.Locale>) localeList27);
        java.util.Locale.LanguageRange[] languageRangeArray30 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList31 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean32 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList31, languageRangeArray30);
        java.util.Collection<java.util.Locale> localeCollection33 = null;
        java.util.Locale locale34 = java.util.Locale.lookup((java.util.List<java.util.Locale.LanguageRange>) languageRangeList31, localeCollection33);
        java.lang.String[] strArray36 = new java.lang.String[] { "hi!" };
        java.util.ArrayList<java.lang.String> strList37 = new java.util.ArrayList<java.lang.String>();
        boolean boolean38 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList37, strArray36);
        java.lang.String str39 = java.util.Locale.lookupTag((java.util.List<java.util.Locale.LanguageRange>) languageRangeList31, (java.util.Collection<java.lang.String>) strList37);
        java.util.Locale locale40 = java.util.Locale.ROOT;
        boolean boolean41 = locale40.hasExtensions();
        java.lang.String str42 = locale40.getCountry();
        java.util.Locale locale43 = java.util.Locale.JAPAN;
        java.util.Locale locale44 = java.util.Locale.FRENCH;
        java.util.Locale locale48 = new java.util.Locale("", "", "");
        java.util.Locale[] localeArray49 = new java.util.Locale[] { locale40, locale43, locale44, locale48 };
        java.util.ArrayList<java.util.Locale> localeList50 = new java.util.ArrayList<java.util.Locale>();
        boolean boolean51 = java.util.Collections.addAll((java.util.Collection<java.util.Locale>) localeList50, localeArray49);
        java.util.List<java.util.Locale> localeList52 = java.util.Locale.filter((java.util.List<java.util.Locale.LanguageRange>) languageRangeList31, (java.util.Collection<java.util.Locale>) localeList50);
        java.util.List<java.util.Locale> localeList53 = java.util.Locale.filter((java.util.List<java.util.Locale.LanguageRange>) languageRangeList8, (java.util.Collection<java.util.Locale>) localeList52);
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap54 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList55 = java.util.Locale.LanguageRange.mapEquivalents((java.util.List<java.util.Locale.LanguageRange>) languageRangeList8, strMap54);
        java.util.Locale.LanguageRange[] languageRangeArray56 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList57 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean58 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList57, languageRangeArray56);
        java.util.Collection<java.util.Locale> localeCollection59 = null;
        java.util.Locale locale60 = java.util.Locale.lookup((java.util.List<java.util.Locale.LanguageRange>) languageRangeList57, localeCollection59);
        java.lang.String[] strArray62 = new java.lang.String[] { "hi!" };
        java.util.ArrayList<java.lang.String> strList63 = new java.util.ArrayList<java.lang.String>();
        boolean boolean64 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList63, strArray62);
        java.lang.String str65 = java.util.Locale.lookupTag((java.util.List<java.util.Locale.LanguageRange>) languageRangeList57, (java.util.Collection<java.lang.String>) strList63);
        java.util.Locale locale66 = java.util.Locale.ROOT;
        boolean boolean67 = locale66.hasExtensions();
        java.lang.String str68 = locale66.getCountry();
        java.util.Locale locale69 = java.util.Locale.JAPAN;
        java.util.Locale locale70 = java.util.Locale.FRENCH;
        java.util.Locale locale74 = new java.util.Locale("", "", "");
        java.util.Locale[] localeArray75 = new java.util.Locale[] { locale66, locale69, locale70, locale74 };
        java.util.ArrayList<java.util.Locale> localeList76 = new java.util.ArrayList<java.util.Locale>();
        boolean boolean77 = java.util.Collections.addAll((java.util.Collection<java.util.Locale>) localeList76, localeArray75);
        java.util.List<java.util.Locale> localeList78 = java.util.Locale.filter((java.util.List<java.util.Locale.LanguageRange>) languageRangeList57, (java.util.Collection<java.util.Locale>) localeList76);
        java.util.Locale.FilteringMode filteringMode79 = java.util.Locale.FilteringMode.REJECT_EXTENDED_RANGES;
        java.util.List<java.util.Locale> localeList80 = java.util.Locale.filter(languageRangeList55, (java.util.Collection<java.util.Locale>) localeList76, filteringMode79);
        java.util.Locale locale81 = java.util.Locale.lookup((java.util.List<java.util.Locale.LanguageRange>) languageRangeList1, (java.util.Collection<java.util.Locale>) localeList80);
        java.util.Locale locale82 = java.util.Locale.GERMANY;
        java.util.Set<java.lang.String> strSet83 = locale82.getUnicodeLocaleKeys();
        java.lang.String str84 = java.util.Locale.lookupTag((java.util.List<java.util.Locale.LanguageRange>) languageRangeList1, (java.util.Collection<java.lang.String>) strSet83);
        org.junit.Assert.assertNotNull(languageRangeArray0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(locale4);
        org.junit.Assert.assertNotNull(languageRangeList6);
        org.junit.Assert.assertNotNull(languageRangeArray7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(locale11);
        org.junit.Assert.assertNotNull(strArray13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertNotNull(locale17);
        org.junit.Assert.assertEquals(locale17.toString(), "");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertNotNull(locale20);
        org.junit.Assert.assertEquals(locale20.toString(), "ja_JP");
        org.junit.Assert.assertNotNull(locale21);
        org.junit.Assert.assertEquals(locale21.toString(), "fr");
        org.junit.Assert.assertEquals(locale25.toString(), "");
        org.junit.Assert.assertNotNull(localeArray26);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertNotNull(localeList29);
        org.junit.Assert.assertNotNull(languageRangeArray30);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertNull(locale34);
        org.junit.Assert.assertNotNull(strArray36);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + true + "'", boolean38 == true);
        org.junit.Assert.assertNull(str39);
        org.junit.Assert.assertNotNull(locale40);
        org.junit.Assert.assertEquals(locale40.toString(), "");
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "" + "'", str42, "");
        org.junit.Assert.assertNotNull(locale43);
        org.junit.Assert.assertEquals(locale43.toString(), "ja_JP");
        org.junit.Assert.assertNotNull(locale44);
        org.junit.Assert.assertEquals(locale44.toString(), "fr");
        org.junit.Assert.assertEquals(locale48.toString(), "");
        org.junit.Assert.assertNotNull(localeArray49);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + true + "'", boolean51 == true);
        org.junit.Assert.assertNotNull(localeList52);
        org.junit.Assert.assertNotNull(localeList53);
        org.junit.Assert.assertNotNull(languageRangeList55);
        org.junit.Assert.assertNotNull(languageRangeArray56);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + false + "'", boolean58 == false);
        org.junit.Assert.assertNull(locale60);
        org.junit.Assert.assertNotNull(strArray62);
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + true + "'", boolean64 == true);
        org.junit.Assert.assertNull(str65);
        org.junit.Assert.assertNotNull(locale66);
        org.junit.Assert.assertEquals(locale66.toString(), "");
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + false + "'", boolean67 == false);
        org.junit.Assert.assertEquals("'" + str68 + "' != '" + "" + "'", str68, "");
        org.junit.Assert.assertNotNull(locale69);
        org.junit.Assert.assertEquals(locale69.toString(), "ja_JP");
        org.junit.Assert.assertNotNull(locale70);
        org.junit.Assert.assertEquals(locale70.toString(), "fr");
        org.junit.Assert.assertEquals(locale74.toString(), "");
        org.junit.Assert.assertNotNull(localeArray75);
        org.junit.Assert.assertTrue("'" + boolean77 + "' != '" + true + "'", boolean77 == true);
        org.junit.Assert.assertNotNull(localeList78);
        org.junit.Assert.assertTrue("'" + filteringMode79 + "' != '" + java.util.Locale.FilteringMode.REJECT_EXTENDED_RANGES + "'", filteringMode79.equals(java.util.Locale.FilteringMode.REJECT_EXTENDED_RANGES));
        org.junit.Assert.assertNotNull(localeList80);
        org.junit.Assert.assertNull(locale81);
        org.junit.Assert.assertNotNull(locale82);
        org.junit.Assert.assertEquals(locale82.toString(), "de_DE");
        org.junit.Assert.assertNotNull(strSet83);
        org.junit.Assert.assertNull(str84);
    }

    @Test
    public void test00331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00331");
        java.util.Locale locale0 = java.util.Locale.JAPANESE;
        java.lang.String str1 = locale0.getCountry();
        java.io.PrintWriter printWriter3 = new java.io.PrintWriter("fr");
        printWriter3.print("it_IT");
        java.util.Locale locale6 = java.util.Locale.ROOT;
        boolean boolean7 = locale6.hasExtensions();
        java.util.Locale locale8 = java.util.Locale.ROOT;
        java.lang.String str9 = locale6.getDisplayName(locale8);
        java.util.Locale locale10 = java.util.Locale.ROOT;
        boolean boolean11 = locale10.hasExtensions();
        java.lang.String str12 = locale6.getDisplayCountry(locale10);
        java.lang.Object[] objArray15 = new java.lang.Object[] {};
        org.apache.commons.math.MathException mathException16 = new org.apache.commons.math.MathException("hi!", objArray15);
        java.io.PrintWriter printWriter17 = printWriter3.printf(locale10, "it_IT", objArray15);
        printWriter3.println();
        printWriter3.print(10);
        java.io.PrintWriter printWriter24 = printWriter3.append((java.lang.CharSequence) "fr", (int) (short) 0, (int) (byte) 1);
        java.io.PrintWriter printWriter26 = new java.io.PrintWriter((java.io.Writer) printWriter3, true);
        printWriter3.println(false);
        java.io.PrintWriter printWriter32 = printWriter3.append((java.lang.CharSequence) "Italy", 0, 0);
        printWriter32.flush();
        boolean boolean34 = locale0.equals((java.lang.Object) printWriter32);
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "ja");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertNotNull(locale6);
        org.junit.Assert.assertEquals(locale6.toString(), "");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(locale8);
        org.junit.Assert.assertEquals(locale8.toString(), "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNotNull(locale10);
        org.junit.Assert.assertEquals(locale10.toString(), "");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNotNull(objArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray15), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray15), "[]");
        org.junit.Assert.assertNotNull(printWriter17);
        org.junit.Assert.assertNotNull(printWriter24);
        org.junit.Assert.assertNotNull(printWriter32);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
    }

    @Test
    public void test00332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00332");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clearExtensions();
        java.util.Locale.Builder builder3 = builder0.setScript("");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder5 = builder0.removeUnicodeLocaleAttribute("\u82f1\u8a9e");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed Unicode locale attribute: ?? [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(builder3);
    }

    @Test
    public void test00333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00333");
        java.io.PrintWriter printWriter1 = new java.io.PrintWriter("fr");
        java.io.PrintWriter printWriter3 = new java.io.PrintWriter("fr");
        printWriter3.print("it_IT");
        java.util.Locale locale7 = java.util.Locale.forLanguageTag("");
        java.lang.Object[] objArray10 = new java.lang.Object[] {};
        org.apache.commons.math.MathException mathException11 = new org.apache.commons.math.MathException("hi!", objArray10);
        java.lang.Throwable[] throwableArray12 = mathException11.getSuppressed();
        java.lang.Throwable[] throwableArray13 = mathException11.getSuppressed();
        java.io.PrintWriter printWriter14 = printWriter3.printf(locale7, "it_IT", (java.lang.Object[]) throwableArray13);
        java.io.PrintWriter printWriter17 = new java.io.PrintWriter("fr");
        printWriter17.print("it_IT");
        java.util.Locale locale20 = java.util.Locale.ROOT;
        boolean boolean21 = locale20.hasExtensions();
        java.util.Locale locale22 = java.util.Locale.ROOT;
        java.lang.String str23 = locale20.getDisplayName(locale22);
        java.util.Locale locale24 = java.util.Locale.ROOT;
        boolean boolean25 = locale24.hasExtensions();
        java.lang.String str26 = locale20.getDisplayCountry(locale24);
        java.lang.Object[] objArray29 = new java.lang.Object[] {};
        org.apache.commons.math.MathException mathException30 = new org.apache.commons.math.MathException("hi!", objArray29);
        java.io.PrintWriter printWriter31 = printWriter17.printf(locale24, "it_IT", objArray29);
        java.io.PrintWriter printWriter32 = printWriter1.printf(locale7, "fr", objArray29);
        printWriter1.print('a');
        java.io.PrintWriter printWriter36 = printWriter1.append('4');
        java.io.PrintWriter printWriter38 = new java.io.PrintWriter("fr");
        printWriter38.print("it_IT");
        java.util.Locale locale41 = java.util.Locale.ROOT;
        boolean boolean42 = locale41.hasExtensions();
        java.util.Locale locale43 = java.util.Locale.ROOT;
        java.lang.String str44 = locale41.getDisplayName(locale43);
        java.util.Locale locale45 = java.util.Locale.ROOT;
        boolean boolean46 = locale45.hasExtensions();
        java.lang.String str47 = locale41.getDisplayCountry(locale45);
        java.lang.Object[] objArray50 = new java.lang.Object[] {};
        org.apache.commons.math.MathException mathException51 = new org.apache.commons.math.MathException("hi!", objArray50);
        java.io.PrintWriter printWriter52 = printWriter38.printf(locale45, "it_IT", objArray50);
        printWriter38.println();
        printWriter38.print(10);
        java.io.PrintWriter printWriter59 = printWriter38.append((java.lang.CharSequence) "fr", (int) (short) 0, (int) (byte) 1);
        java.io.PrintWriter printWriter61 = new java.io.PrintWriter((java.io.Writer) printWriter38, true);
        printWriter38.println(false);
        java.io.PrintWriter printWriter67 = printWriter38.append((java.lang.CharSequence) "Italy", 0, 0);
        printWriter67.flush();
        printWriter67.print(false);
        printWriter1.print((java.lang.Object) false);
        org.junit.Assert.assertNotNull(locale7);
        org.junit.Assert.assertEquals(locale7.toString(), "");
        org.junit.Assert.assertNotNull(objArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray10), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray10), "[]");
        org.junit.Assert.assertNotNull(throwableArray12);
        org.junit.Assert.assertNotNull(throwableArray13);
        org.junit.Assert.assertNotNull(printWriter14);
        org.junit.Assert.assertNotNull(locale20);
        org.junit.Assert.assertEquals(locale20.toString(), "");
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(locale22);
        org.junit.Assert.assertEquals(locale22.toString(), "");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertNotNull(locale24);
        org.junit.Assert.assertEquals(locale24.toString(), "");
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
        org.junit.Assert.assertNotNull(objArray29);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray29), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray29), "[]");
        org.junit.Assert.assertNotNull(printWriter31);
        org.junit.Assert.assertNotNull(printWriter32);
        org.junit.Assert.assertNotNull(printWriter36);
        org.junit.Assert.assertNotNull(locale41);
        org.junit.Assert.assertEquals(locale41.toString(), "");
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertNotNull(locale43);
        org.junit.Assert.assertEquals(locale43.toString(), "");
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "" + "'", str44, "");
        org.junit.Assert.assertNotNull(locale45);
        org.junit.Assert.assertEquals(locale45.toString(), "");
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertEquals("'" + str47 + "' != '" + "" + "'", str47, "");
        org.junit.Assert.assertNotNull(objArray50);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray50), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray50), "[]");
        org.junit.Assert.assertNotNull(printWriter52);
        org.junit.Assert.assertNotNull(printWriter59);
        org.junit.Assert.assertNotNull(printWriter67);
    }

    @Test
    public void test00334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00334");
        java.util.Locale locale1 = java.util.Locale.forLanguageTag("org.apache.commons.math.mathexception");
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "");
    }

    @Test
    public void test00335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00335");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clearExtensions();
        java.util.Locale.Builder builder3 = builder1.setLanguageTag("fr");
        java.util.Locale.Builder builder5 = builder3.setLanguage("Italy");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder7 = builder5.removeUnicodeLocaleAttribute("\u4e2d\u56fd\u8a9e");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed Unicode locale attribute: ??? [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder5);
    }

    @Test
    public void test00336() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00336");
        java.io.PrintStream printStream1 = new java.io.PrintStream("zh_CN");
        printStream1.println();
        java.io.PrintStream printStream4 = printStream1.append('#');
        printStream1.close();
        byte[] byteArray10 = new byte[] { (byte) -1, (byte) 100, (byte) -1, (byte) -1 };
        printStream1.write(byteArray10);
        printStream1.print(false);
        printStream1.print("org.apache.commons.math.MathException: fr");
        printStream1.print("ITA");
        org.junit.Assert.assertNotNull(printStream4);
        org.junit.Assert.assertNotNull(byteArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray10), "[-1, 100, -1, -1]");
    }

    @Test
    public void test00337() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00337");
        java.io.PrintStream printStream1 = new java.io.PrintStream("zh_CN");
        printStream1.print((float) (byte) -1);
        printStream1.println();
        printStream1.println();
        java.io.PrintStream printStream7 = new java.io.PrintStream((java.io.OutputStream) printStream1, true);
        java.io.PrintWriter printWriter9 = new java.io.PrintWriter("fr");
        java.io.PrintWriter printWriter11 = printWriter9.append(' ');
        java.io.PrintWriter printWriter14 = new java.io.PrintWriter("fr");
        printWriter14.print("it_IT");
        java.util.Locale locale17 = java.util.Locale.ROOT;
        boolean boolean18 = locale17.hasExtensions();
        java.util.Locale locale19 = java.util.Locale.ROOT;
        java.lang.String str20 = locale17.getDisplayName(locale19);
        java.util.Locale locale21 = java.util.Locale.ROOT;
        boolean boolean22 = locale21.hasExtensions();
        java.lang.String str23 = locale17.getDisplayCountry(locale21);
        java.lang.Object[] objArray26 = new java.lang.Object[] {};
        org.apache.commons.math.MathException mathException27 = new org.apache.commons.math.MathException("hi!", objArray26);
        java.io.PrintWriter printWriter28 = printWriter14.printf(locale21, "it_IT", objArray26);
        java.io.PrintWriter printWriter31 = new java.io.PrintWriter("fr");
        printWriter31.print("it_IT");
        java.util.Locale locale35 = java.util.Locale.forLanguageTag("");
        java.lang.Object[] objArray38 = new java.lang.Object[] {};
        org.apache.commons.math.MathException mathException39 = new org.apache.commons.math.MathException("hi!", objArray38);
        java.lang.Throwable[] throwableArray40 = mathException39.getSuppressed();
        java.lang.Throwable[] throwableArray41 = mathException39.getSuppressed();
        java.io.PrintWriter printWriter42 = printWriter31.printf(locale35, "it_IT", (java.lang.Object[]) throwableArray41);
        java.io.PrintWriter printWriter43 = printWriter14.format("it_IT", (java.lang.Object[]) throwableArray41);
        java.io.PrintWriter printWriter44 = printWriter11.format("zh_CN", (java.lang.Object[]) throwableArray41);
        java.io.PrintStream printStream46 = new java.io.PrintStream("zh_CN");
        printStream46.print((float) (byte) -1);
        char[] charArray51 = new char[] { 'x', 'u' };
        printStream46.println(charArray51);
        printWriter44.print(charArray51);
        printStream1.print(charArray51);
        java.io.PrintWriter printWriter55 = new java.io.PrintWriter((java.io.OutputStream) printStream1);
        // The following exception was thrown during execution in test generation
        try {
            java.io.PrintStream printStream58 = new java.io.PrintStream((java.io.OutputStream) printStream1, true, "");
            org.junit.Assert.fail("Expected exception of type java.io.UnsupportedEncodingException; message: ");
        } catch (java.io.UnsupportedEncodingException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(printWriter11);
        org.junit.Assert.assertNotNull(locale17);
        org.junit.Assert.assertEquals(locale17.toString(), "");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(locale19);
        org.junit.Assert.assertEquals(locale19.toString(), "");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertNotNull(locale21);
        org.junit.Assert.assertEquals(locale21.toString(), "");
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertNotNull(objArray26);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray26), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray26), "[]");
        org.junit.Assert.assertNotNull(printWriter28);
        org.junit.Assert.assertNotNull(locale35);
        org.junit.Assert.assertEquals(locale35.toString(), "");
        org.junit.Assert.assertNotNull(objArray38);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray38), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray38), "[]");
        org.junit.Assert.assertNotNull(throwableArray40);
        org.junit.Assert.assertNotNull(throwableArray41);
        org.junit.Assert.assertNotNull(printWriter42);
        org.junit.Assert.assertNotNull(printWriter43);
        org.junit.Assert.assertNotNull(printWriter44);
        org.junit.Assert.assertNotNull(charArray51);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray51), "xu");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray51), "xu");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray51), "[x, u]");
    }

    @Test
    public void test00338() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00338");
        java.io.PrintStream printStream1 = new java.io.PrintStream("ita");
        java.util.Locale.Builder builder2 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder3 = builder2.clearExtensions();
        java.util.Locale.Builder builder5 = builder2.setScript("");
        java.util.Locale.Builder builder7 = builder2.setScript("");
        printStream1.println((java.lang.Object) builder7);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder11 = builder7.setUnicodeLocaleKeyword("Royaume-Uni", "chinois");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed Unicode locale keyword key: Royaume-Uni [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder7);
    }

    @Test
    public void test00339() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00339");
        java.io.PrintWriter printWriter1 = new java.io.PrintWriter("fr");
        java.io.PrintWriter printWriter3 = printWriter1.append(' ');
        java.io.PrintWriter printWriter6 = new java.io.PrintWriter("fr");
        printWriter6.print("it_IT");
        java.util.Locale locale9 = java.util.Locale.ROOT;
        boolean boolean10 = locale9.hasExtensions();
        java.util.Locale locale11 = java.util.Locale.ROOT;
        java.lang.String str12 = locale9.getDisplayName(locale11);
        java.util.Locale locale13 = java.util.Locale.ROOT;
        boolean boolean14 = locale13.hasExtensions();
        java.lang.String str15 = locale9.getDisplayCountry(locale13);
        java.lang.Object[] objArray18 = new java.lang.Object[] {};
        org.apache.commons.math.MathException mathException19 = new org.apache.commons.math.MathException("hi!", objArray18);
        java.io.PrintWriter printWriter20 = printWriter6.printf(locale13, "it_IT", objArray18);
        java.io.PrintWriter printWriter23 = new java.io.PrintWriter("fr");
        printWriter23.print("it_IT");
        java.util.Locale locale27 = java.util.Locale.forLanguageTag("");
        java.lang.Object[] objArray30 = new java.lang.Object[] {};
        org.apache.commons.math.MathException mathException31 = new org.apache.commons.math.MathException("hi!", objArray30);
        java.lang.Throwable[] throwableArray32 = mathException31.getSuppressed();
        java.lang.Throwable[] throwableArray33 = mathException31.getSuppressed();
        java.io.PrintWriter printWriter34 = printWriter23.printf(locale27, "it_IT", (java.lang.Object[]) throwableArray33);
        java.io.PrintWriter printWriter35 = printWriter6.format("it_IT", (java.lang.Object[]) throwableArray33);
        java.io.PrintWriter printWriter36 = printWriter3.format("zh_CN", (java.lang.Object[]) throwableArray33);
        printWriter36.println((double) 100);
        // The following exception was thrown during execution in test generation
        try {
            printWriter36.write("en-gb", (int) (short) 100, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 200");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(printWriter3);
        org.junit.Assert.assertNotNull(locale9);
        org.junit.Assert.assertEquals(locale9.toString(), "");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(locale11);
        org.junit.Assert.assertEquals(locale11.toString(), "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNotNull(locale13);
        org.junit.Assert.assertEquals(locale13.toString(), "");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertNotNull(objArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray18), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray18), "[]");
        org.junit.Assert.assertNotNull(printWriter20);
        org.junit.Assert.assertNotNull(locale27);
        org.junit.Assert.assertEquals(locale27.toString(), "");
        org.junit.Assert.assertNotNull(objArray30);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray30), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray30), "[]");
        org.junit.Assert.assertNotNull(throwableArray32);
        org.junit.Assert.assertNotNull(throwableArray33);
        org.junit.Assert.assertNotNull(printWriter34);
        org.junit.Assert.assertNotNull(printWriter35);
        org.junit.Assert.assertNotNull(printWriter36);
    }

    @Test
    public void test00340() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00340");
        java.io.PrintStream printStream1 = new java.io.PrintStream("zh_CN");
        printStream1.print((float) (byte) -1);
        printStream1.println();
        java.io.PrintWriter printWriter6 = new java.io.PrintWriter("fr");
        printWriter6.println();
        java.io.PrintWriter printWriter10 = new java.io.PrintWriter("fr");
        printWriter10.print("it_IT");
        java.util.Locale locale13 = java.util.Locale.ROOT;
        boolean boolean14 = locale13.hasExtensions();
        java.util.Locale locale15 = java.util.Locale.ROOT;
        java.lang.String str16 = locale13.getDisplayName(locale15);
        java.util.Locale locale17 = java.util.Locale.ROOT;
        boolean boolean18 = locale17.hasExtensions();
        java.lang.String str19 = locale13.getDisplayCountry(locale17);
        java.lang.Object[] objArray22 = new java.lang.Object[] {};
        org.apache.commons.math.MathException mathException23 = new org.apache.commons.math.MathException("hi!", objArray22);
        java.io.PrintWriter printWriter24 = printWriter10.printf(locale17, "it_IT", objArray22);
        java.io.PrintWriter printWriter25 = printWriter6.printf("English", objArray22);
        java.io.PrintStream printStream27 = new java.io.PrintStream("zh_CN");
        printStream27.print((float) (byte) -1);
        printStream27.println();
        printStream27.println();
        java.io.PrintStream printStream33 = new java.io.PrintStream((java.io.OutputStream) printStream27, true);
        java.io.PrintWriter printWriter35 = new java.io.PrintWriter("fr");
        java.io.PrintWriter printWriter37 = printWriter35.append(' ');
        java.io.PrintWriter printWriter40 = new java.io.PrintWriter("fr");
        printWriter40.print("it_IT");
        java.util.Locale locale43 = java.util.Locale.ROOT;
        boolean boolean44 = locale43.hasExtensions();
        java.util.Locale locale45 = java.util.Locale.ROOT;
        java.lang.String str46 = locale43.getDisplayName(locale45);
        java.util.Locale locale47 = java.util.Locale.ROOT;
        boolean boolean48 = locale47.hasExtensions();
        java.lang.String str49 = locale43.getDisplayCountry(locale47);
        java.lang.Object[] objArray52 = new java.lang.Object[] {};
        org.apache.commons.math.MathException mathException53 = new org.apache.commons.math.MathException("hi!", objArray52);
        java.io.PrintWriter printWriter54 = printWriter40.printf(locale47, "it_IT", objArray52);
        java.io.PrintWriter printWriter57 = new java.io.PrintWriter("fr");
        printWriter57.print("it_IT");
        java.util.Locale locale61 = java.util.Locale.forLanguageTag("");
        java.lang.Object[] objArray64 = new java.lang.Object[] {};
        org.apache.commons.math.MathException mathException65 = new org.apache.commons.math.MathException("hi!", objArray64);
        java.lang.Throwable[] throwableArray66 = mathException65.getSuppressed();
        java.lang.Throwable[] throwableArray67 = mathException65.getSuppressed();
        java.io.PrintWriter printWriter68 = printWriter57.printf(locale61, "it_IT", (java.lang.Object[]) throwableArray67);
        java.io.PrintWriter printWriter69 = printWriter40.format("it_IT", (java.lang.Object[]) throwableArray67);
        java.io.PrintWriter printWriter70 = printWriter37.format("zh_CN", (java.lang.Object[]) throwableArray67);
        java.io.PrintStream printStream72 = new java.io.PrintStream("zh_CN");
        printStream72.print((float) (byte) -1);
        char[] charArray77 = new char[] { 'x', 'u' };
        printStream72.println(charArray77);
        printWriter70.print(charArray77);
        printStream27.print(charArray77);
        printWriter25.write(charArray77);
        printStream1.print(charArray77);
        // The following exception was thrown during execution in test generation
        try {
            java.io.PrintStream printStream85 = new java.io.PrintStream((java.io.OutputStream) printStream1, false, "italiano");
            org.junit.Assert.fail("Expected exception of type java.io.UnsupportedEncodingException; message: italiano");
        } catch (java.io.UnsupportedEncodingException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(locale13);
        org.junit.Assert.assertEquals(locale13.toString(), "");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(locale15);
        org.junit.Assert.assertEquals(locale15.toString(), "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertNotNull(locale17);
        org.junit.Assert.assertEquals(locale17.toString(), "");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertNotNull(objArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray22), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray22), "[]");
        org.junit.Assert.assertNotNull(printWriter24);
        org.junit.Assert.assertNotNull(printWriter25);
        org.junit.Assert.assertNotNull(printWriter37);
        org.junit.Assert.assertNotNull(locale43);
        org.junit.Assert.assertEquals(locale43.toString(), "");
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertNotNull(locale45);
        org.junit.Assert.assertEquals(locale45.toString(), "");
        org.junit.Assert.assertEquals("'" + str46 + "' != '" + "" + "'", str46, "");
        org.junit.Assert.assertNotNull(locale47);
        org.junit.Assert.assertEquals(locale47.toString(), "");
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertEquals("'" + str49 + "' != '" + "" + "'", str49, "");
        org.junit.Assert.assertNotNull(objArray52);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray52), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray52), "[]");
        org.junit.Assert.assertNotNull(printWriter54);
        org.junit.Assert.assertNotNull(locale61);
        org.junit.Assert.assertEquals(locale61.toString(), "");
        org.junit.Assert.assertNotNull(objArray64);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray64), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray64), "[]");
        org.junit.Assert.assertNotNull(throwableArray66);
        org.junit.Assert.assertNotNull(throwableArray67);
        org.junit.Assert.assertNotNull(printWriter68);
        org.junit.Assert.assertNotNull(printWriter69);
        org.junit.Assert.assertNotNull(printWriter70);
        org.junit.Assert.assertNotNull(charArray77);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray77), "xu");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray77), "xu");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray77), "[x, u]");
    }

    @Test
    public void test00341() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00341");
        java.util.Locale locale3 = new java.util.Locale("", "", "");
        java.util.Locale locale6 = new java.util.Locale("hi!", "Italy");
        java.lang.String str7 = locale3.getDisplayCountry(locale6);
        java.util.Locale locale8 = java.util.Locale.JAPAN;
        java.lang.String str9 = locale6.getDisplayName(locale8);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str10 = locale6.getISO3Country();
            org.junit.Assert.fail("Expected exception of type java.util.MissingResourceException; message: Couldn't find 3-letter country code for ITALY");
        } catch (java.util.MissingResourceException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals(locale3.toString(), "");
        org.junit.Assert.assertEquals(locale6.toString(), "hi!_ITALY");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(locale8);
        org.junit.Assert.assertEquals(locale8.toString(), "ja_JP");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi! (ITALY)" + "'", str9, "hi! (ITALY)");
    }

    @Test
    public void test00342() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00342");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl((int) 'u', (int) (byte) 1, (int) '#');
        int int4 = hypergeometricDistributionImpl3.getPopulationSize();
        double double6 = hypergeometricDistributionImpl3.cumulativeProbability((int) (short) 100);
        hypergeometricDistributionImpl3.setNumberOfSuccesses(0);
        double double10 = hypergeometricDistributionImpl3.cumulativeProbability((int) (short) 1);
        double double12 = hypergeometricDistributionImpl3.probability((double) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            double double15 = hypergeometricDistributionImpl3.cumulativeProbability((int) 'x', 117);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: lower endpoint must be less than or equal to upper endpoint");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 117 + "'", int4 == 117);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0d + "'", double6 == 1.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 1.0d + "'", double10 == 1.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 1.0d + "'", double12 == 1.0d);
    }

    @Test
    public void test00343() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00343");
        java.io.PrintStream printStream1 = new java.io.PrintStream("zh_CN");
        printStream1.print((float) (byte) -1);
        printStream1.println();
        printStream1.println();
        java.io.PrintStream printStream7 = new java.io.PrintStream((java.io.OutputStream) printStream1, true);
        java.io.PrintWriter printWriter9 = new java.io.PrintWriter("fr");
        printWriter9.print("it_IT");
        java.util.Locale locale12 = java.util.Locale.ROOT;
        boolean boolean13 = locale12.hasExtensions();
        java.util.Locale locale14 = java.util.Locale.ROOT;
        java.lang.String str15 = locale12.getDisplayName(locale14);
        java.util.Locale locale16 = java.util.Locale.ROOT;
        boolean boolean17 = locale16.hasExtensions();
        java.lang.String str18 = locale12.getDisplayCountry(locale16);
        java.lang.Object[] objArray21 = new java.lang.Object[] {};
        org.apache.commons.math.MathException mathException22 = new org.apache.commons.math.MathException("hi!", objArray21);
        java.io.PrintWriter printWriter23 = printWriter9.printf(locale16, "it_IT", objArray21);
        printStream7.println((java.lang.Object) "it_IT");
        java.io.PrintStream printStream26 = printStream7.append((java.lang.CharSequence) "fr");
        java.io.PrintStream printStream27 = new java.io.PrintStream((java.io.OutputStream) printStream7);
        printStream7.println("");
        java.util.Locale.Builder builder30 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder31 = builder30.clearExtensions();
        java.util.Locale.Builder builder33 = builder31.setLanguageTag("fr");
        java.util.Locale locale34 = builder33.build();
        java.util.Locale.Builder builder35 = builder33.clearExtensions();
        printStream7.print((java.lang.Object) builder35);
        java.util.Locale.Builder builder37 = builder35.clear();
        java.util.Locale.Builder builder38 = builder37.clear();
        java.util.Locale.Builder builder40 = builder37.setRegion("FR");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder42 = builder40.addUnicodeLocaleAttribute("\u82f1\u8a9e");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed Unicode locale attribute: ?? [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(locale12);
        org.junit.Assert.assertEquals(locale12.toString(), "");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(locale14);
        org.junit.Assert.assertEquals(locale14.toString(), "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertNotNull(locale16);
        org.junit.Assert.assertEquals(locale16.toString(), "");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertNotNull(objArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray21), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray21), "[]");
        org.junit.Assert.assertNotNull(printWriter23);
        org.junit.Assert.assertNotNull(printStream26);
        org.junit.Assert.assertNotNull(builder31);
        org.junit.Assert.assertNotNull(builder33);
        org.junit.Assert.assertNotNull(locale34);
        org.junit.Assert.assertEquals(locale34.toString(), "fr");
        org.junit.Assert.assertNotNull(builder35);
        org.junit.Assert.assertNotNull(builder37);
        org.junit.Assert.assertNotNull(builder38);
        org.junit.Assert.assertNotNull(builder40);
    }

    @Test
    public void test00344() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00344");
        java.io.PrintWriter printWriter1 = new java.io.PrintWriter("fr");
        printWriter1.print("it_IT");
        java.lang.Object[] objArray5 = new java.lang.Object[] {};
        java.io.PrintWriter printWriter6 = printWriter1.printf("fr", objArray5);
        printWriter1.println((float) 'u');
        printWriter1.println("English");
        printWriter1.write("");
        printWriter1.print("italiano");
        // The following exception was thrown during execution in test generation
        try {
            java.io.PrintWriter printWriter18 = printWriter1.append((java.lang.CharSequence) "Deutschland", (int) (short) 10, (int) 'x');
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 120");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray5), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray5), "[]");
        org.junit.Assert.assertNotNull(printWriter6);
    }

    @Test
    public void test00345() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00345");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl((int) 'u', (int) (byte) 1, (int) '#');
        int int4 = hypergeometricDistributionImpl3.getPopulationSize();
        double double6 = hypergeometricDistributionImpl3.cumulativeProbability((int) (short) 100);
        hypergeometricDistributionImpl3.setSampleSize(0);
        double double10 = hypergeometricDistributionImpl3.cumulativeProbability((int) (short) 0);
        hypergeometricDistributionImpl3.setNumberOfSuccesses((int) (short) 0);
        int int14 = hypergeometricDistributionImpl3.inverseCumulativeProbability(1.0d);
        int int15 = hypergeometricDistributionImpl3.getPopulationSize();
        // The following exception was thrown during execution in test generation
        try {
            double double18 = hypergeometricDistributionImpl3.cumulativeProbability((double) 'x', (double) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: lower endpoint must be less than or equal to upper endpoint");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 117 + "'", int4 == 117);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0d + "'", double6 == 1.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 1.0d + "'", double10 == 1.0d);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 117 + "'", int15 == 117);
    }

    @Test
    public void test00346() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00346");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clearExtensions();
        java.util.Locale locale2 = java.util.Locale.TRADITIONAL_CHINESE;
        java.util.Locale locale3 = java.util.Locale.GERMAN;
        java.lang.String str4 = locale3.getVariant();
        java.lang.String str5 = locale3.toLanguageTag();
        java.lang.String str6 = locale2.getDisplayName(locale3);
        java.util.Locale.Builder builder7 = builder0.setLocale(locale2);
        java.util.Locale.Builder builder8 = builder7.clearExtensions();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder10 = builder8.setRegion("zh_TW");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed region: zh_TW [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "zh_TW");
        org.junit.Assert.assertNotNull(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "de");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "de" + "'", str5, "de");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Chinesisch (Taiwan)" + "'", str6, "Chinesisch (Taiwan)");
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(builder8);
    }

    @Test
    public void test00347() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00347");
        java.io.PrintWriter printWriter1 = new java.io.PrintWriter("fr");
        printWriter1.print("it_IT");
        java.util.Locale locale5 = java.util.Locale.forLanguageTag("");
        java.lang.Object[] objArray8 = new java.lang.Object[] {};
        org.apache.commons.math.MathException mathException9 = new org.apache.commons.math.MathException("hi!", objArray8);
        java.lang.Throwable[] throwableArray10 = mathException9.getSuppressed();
        java.lang.Throwable[] throwableArray11 = mathException9.getSuppressed();
        java.io.PrintWriter printWriter12 = printWriter1.printf(locale5, "it_IT", (java.lang.Object[]) throwableArray11);
        printWriter1.println((float) (byte) 10);
        java.io.PrintWriter printWriter16 = new java.io.PrintWriter("fr");
        java.io.PrintWriter printWriter18 = printWriter16.append(' ');
        java.io.PrintWriter printWriter21 = new java.io.PrintWriter("fr");
        printWriter21.print("it_IT");
        java.util.Locale locale24 = java.util.Locale.ROOT;
        boolean boolean25 = locale24.hasExtensions();
        java.util.Locale locale26 = java.util.Locale.ROOT;
        java.lang.String str27 = locale24.getDisplayName(locale26);
        java.util.Locale locale28 = java.util.Locale.ROOT;
        boolean boolean29 = locale28.hasExtensions();
        java.lang.String str30 = locale24.getDisplayCountry(locale28);
        java.lang.Object[] objArray33 = new java.lang.Object[] {};
        org.apache.commons.math.MathException mathException34 = new org.apache.commons.math.MathException("hi!", objArray33);
        java.io.PrintWriter printWriter35 = printWriter21.printf(locale28, "it_IT", objArray33);
        java.io.PrintWriter printWriter38 = new java.io.PrintWriter("fr");
        printWriter38.print("it_IT");
        java.util.Locale locale42 = java.util.Locale.forLanguageTag("");
        java.lang.Object[] objArray45 = new java.lang.Object[] {};
        org.apache.commons.math.MathException mathException46 = new org.apache.commons.math.MathException("hi!", objArray45);
        java.lang.Throwable[] throwableArray47 = mathException46.getSuppressed();
        java.lang.Throwable[] throwableArray48 = mathException46.getSuppressed();
        java.io.PrintWriter printWriter49 = printWriter38.printf(locale42, "it_IT", (java.lang.Object[]) throwableArray48);
        java.io.PrintWriter printWriter50 = printWriter21.format("it_IT", (java.lang.Object[]) throwableArray48);
        java.io.PrintWriter printWriter51 = printWriter18.format("zh_CN", (java.lang.Object[]) throwableArray48);
        java.io.PrintStream printStream53 = new java.io.PrintStream("zh_CN");
        printStream53.print((float) (byte) -1);
        char[] charArray58 = new char[] { 'x', 'u' };
        printStream53.println(charArray58);
        printWriter51.print(charArray58);
        printWriter1.write(charArray58);
        printWriter1.println("");
        org.junit.Assert.assertNotNull(locale5);
        org.junit.Assert.assertEquals(locale5.toString(), "");
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray8), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray8), "[]");
        org.junit.Assert.assertNotNull(throwableArray10);
        org.junit.Assert.assertNotNull(throwableArray11);
        org.junit.Assert.assertNotNull(printWriter12);
        org.junit.Assert.assertNotNull(printWriter18);
        org.junit.Assert.assertNotNull(locale24);
        org.junit.Assert.assertEquals(locale24.toString(), "");
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(locale26);
        org.junit.Assert.assertEquals(locale26.toString(), "");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "" + "'", str27, "");
        org.junit.Assert.assertNotNull(locale28);
        org.junit.Assert.assertEquals(locale28.toString(), "");
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "" + "'", str30, "");
        org.junit.Assert.assertNotNull(objArray33);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray33), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray33), "[]");
        org.junit.Assert.assertNotNull(printWriter35);
        org.junit.Assert.assertNotNull(locale42);
        org.junit.Assert.assertEquals(locale42.toString(), "");
        org.junit.Assert.assertNotNull(objArray45);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray45), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray45), "[]");
        org.junit.Assert.assertNotNull(throwableArray47);
        org.junit.Assert.assertNotNull(throwableArray48);
        org.junit.Assert.assertNotNull(printWriter49);
        org.junit.Assert.assertNotNull(printWriter50);
        org.junit.Assert.assertNotNull(printWriter51);
        org.junit.Assert.assertNotNull(charArray58);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray58), "xu");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray58), "xu");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray58), "[x, u]");
    }

    @Test
    public void test00348() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00348");
        java.util.Locale.LanguageRange[] languageRangeArray0 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList1 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList1, languageRangeArray0);
        java.lang.String[] strArray6 = new java.lang.String[] { "", "Italy", "fr" };
        java.util.ArrayList<java.lang.String> strList7 = new java.util.ArrayList<java.lang.String>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList7, strArray6);
        java.util.List<java.lang.String> strList9 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList1, (java.util.Collection<java.lang.String>) strList7);
        java.util.Locale.LanguageRange[] languageRangeArray10 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList11 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean12 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList11, languageRangeArray10);
        java.util.Collection<java.util.Locale> localeCollection13 = null;
        java.util.Locale locale14 = java.util.Locale.lookup((java.util.List<java.util.Locale.LanguageRange>) languageRangeList11, localeCollection13);
        java.lang.String[] strArray20 = new java.lang.String[] { "hi!", "", "it_IT", "Italy", "" };
        java.util.ArrayList<java.lang.String> strList21 = new java.util.ArrayList<java.lang.String>();
        boolean boolean22 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList21, strArray20);
        java.util.List<java.lang.String> strList23 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList11, (java.util.Collection<java.lang.String>) strList21);
        java.util.List<java.lang.String> strList24 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList1, (java.util.Collection<java.lang.String>) strList23);
        java.util.Locale.LanguageRange[] languageRangeArray25 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList26 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean27 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList26, languageRangeArray25);
        java.util.Collection<java.util.Locale> localeCollection28 = null;
        java.util.Locale locale29 = java.util.Locale.lookup((java.util.List<java.util.Locale.LanguageRange>) languageRangeList26, localeCollection28);
        java.lang.String[] strArray31 = new java.lang.String[] { "hi!" };
        java.util.ArrayList<java.lang.String> strList32 = new java.util.ArrayList<java.lang.String>();
        boolean boolean33 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList32, strArray31);
        java.lang.String str34 = java.util.Locale.lookupTag((java.util.List<java.util.Locale.LanguageRange>) languageRangeList26, (java.util.Collection<java.lang.String>) strList32);
        java.util.Locale locale35 = java.util.Locale.ROOT;
        boolean boolean36 = locale35.hasExtensions();
        java.lang.String str37 = locale35.getCountry();
        java.util.Locale locale38 = java.util.Locale.JAPAN;
        java.util.Locale locale39 = java.util.Locale.FRENCH;
        java.util.Locale locale43 = new java.util.Locale("", "", "");
        java.util.Locale[] localeArray44 = new java.util.Locale[] { locale35, locale38, locale39, locale43 };
        java.util.ArrayList<java.util.Locale> localeList45 = new java.util.ArrayList<java.util.Locale>();
        boolean boolean46 = java.util.Collections.addAll((java.util.Collection<java.util.Locale>) localeList45, localeArray44);
        java.util.List<java.util.Locale> localeList47 = java.util.Locale.filter((java.util.List<java.util.Locale.LanguageRange>) languageRangeList26, (java.util.Collection<java.util.Locale>) localeList45);
        java.util.Locale.LanguageRange[] languageRangeArray48 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList49 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean50 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList49, languageRangeArray48);
        java.util.Collection<java.util.Locale> localeCollection51 = null;
        java.util.Locale locale52 = java.util.Locale.lookup((java.util.List<java.util.Locale.LanguageRange>) languageRangeList49, localeCollection51);
        java.lang.String[] strArray54 = new java.lang.String[] { "hi!" };
        java.util.ArrayList<java.lang.String> strList55 = new java.util.ArrayList<java.lang.String>();
        boolean boolean56 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList55, strArray54);
        java.lang.String str57 = java.util.Locale.lookupTag((java.util.List<java.util.Locale.LanguageRange>) languageRangeList49, (java.util.Collection<java.lang.String>) strList55);
        java.util.Locale locale58 = java.util.Locale.ROOT;
        boolean boolean59 = locale58.hasExtensions();
        java.lang.String str60 = locale58.getCountry();
        java.util.Locale locale61 = java.util.Locale.JAPAN;
        java.util.Locale locale62 = java.util.Locale.FRENCH;
        java.util.Locale locale66 = new java.util.Locale("", "", "");
        java.util.Locale[] localeArray67 = new java.util.Locale[] { locale58, locale61, locale62, locale66 };
        java.util.ArrayList<java.util.Locale> localeList68 = new java.util.ArrayList<java.util.Locale>();
        boolean boolean69 = java.util.Collections.addAll((java.util.Collection<java.util.Locale>) localeList68, localeArray67);
        java.util.List<java.util.Locale> localeList70 = java.util.Locale.filter((java.util.List<java.util.Locale.LanguageRange>) languageRangeList49, (java.util.Collection<java.util.Locale>) localeList68);
        java.util.List<java.util.Locale> localeList71 = java.util.Locale.filter((java.util.List<java.util.Locale.LanguageRange>) languageRangeList26, (java.util.Collection<java.util.Locale>) localeList70);
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap72 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList73 = java.util.Locale.LanguageRange.mapEquivalents((java.util.List<java.util.Locale.LanguageRange>) languageRangeList26, strMap72);
        java.util.Locale.LanguageRange[] languageRangeArray74 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList75 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean76 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList75, languageRangeArray74);
        java.util.Collection<java.util.Locale> localeCollection77 = null;
        java.util.Locale locale78 = java.util.Locale.lookup((java.util.List<java.util.Locale.LanguageRange>) languageRangeList75, localeCollection77);
        java.lang.String[] strArray80 = new java.lang.String[] { "hi!" };
        java.util.ArrayList<java.lang.String> strList81 = new java.util.ArrayList<java.lang.String>();
        boolean boolean82 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList81, strArray80);
        java.lang.String str83 = java.util.Locale.lookupTag((java.util.List<java.util.Locale.LanguageRange>) languageRangeList75, (java.util.Collection<java.lang.String>) strList81);
        java.util.Locale locale84 = java.util.Locale.ROOT;
        boolean boolean85 = locale84.hasExtensions();
        java.lang.String str86 = locale84.getCountry();
        java.util.Locale locale87 = java.util.Locale.JAPAN;
        java.util.Locale locale88 = java.util.Locale.FRENCH;
        java.util.Locale locale92 = new java.util.Locale("", "", "");
        java.util.Locale[] localeArray93 = new java.util.Locale[] { locale84, locale87, locale88, locale92 };
        java.util.ArrayList<java.util.Locale> localeList94 = new java.util.ArrayList<java.util.Locale>();
        boolean boolean95 = java.util.Collections.addAll((java.util.Collection<java.util.Locale>) localeList94, localeArray93);
        java.util.List<java.util.Locale> localeList96 = java.util.Locale.filter((java.util.List<java.util.Locale.LanguageRange>) languageRangeList75, (java.util.Collection<java.util.Locale>) localeList94);
        java.util.Locale.FilteringMode filteringMode97 = java.util.Locale.FilteringMode.REJECT_EXTENDED_RANGES;
        java.util.List<java.util.Locale> localeList98 = java.util.Locale.filter(languageRangeList73, (java.util.Collection<java.util.Locale>) localeList94, filteringMode97);
        java.util.Locale locale99 = java.util.Locale.lookup((java.util.List<java.util.Locale.LanguageRange>) languageRangeList1, (java.util.Collection<java.util.Locale>) localeList94);
        org.junit.Assert.assertNotNull(languageRangeArray0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(strList9);
        org.junit.Assert.assertNotNull(languageRangeArray10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNull(locale14);
        org.junit.Assert.assertNotNull(strArray20);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertNotNull(strList23);
        org.junit.Assert.assertNotNull(strList24);
        org.junit.Assert.assertNotNull(languageRangeArray25);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNull(locale29);
        org.junit.Assert.assertNotNull(strArray31);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
        org.junit.Assert.assertNull(str34);
        org.junit.Assert.assertNotNull(locale35);
        org.junit.Assert.assertEquals(locale35.toString(), "");
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "" + "'", str37, "");
        org.junit.Assert.assertNotNull(locale38);
        org.junit.Assert.assertEquals(locale38.toString(), "ja_JP");
        org.junit.Assert.assertNotNull(locale39);
        org.junit.Assert.assertEquals(locale39.toString(), "fr");
        org.junit.Assert.assertEquals(locale43.toString(), "");
        org.junit.Assert.assertNotNull(localeArray44);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + true + "'", boolean46 == true);
        org.junit.Assert.assertNotNull(localeList47);
        org.junit.Assert.assertNotNull(languageRangeArray48);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertNull(locale52);
        org.junit.Assert.assertNotNull(strArray54);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + true + "'", boolean56 == true);
        org.junit.Assert.assertNull(str57);
        org.junit.Assert.assertNotNull(locale58);
        org.junit.Assert.assertEquals(locale58.toString(), "");
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + false + "'", boolean59 == false);
        org.junit.Assert.assertEquals("'" + str60 + "' != '" + "" + "'", str60, "");
        org.junit.Assert.assertNotNull(locale61);
        org.junit.Assert.assertEquals(locale61.toString(), "ja_JP");
        org.junit.Assert.assertNotNull(locale62);
        org.junit.Assert.assertEquals(locale62.toString(), "fr");
        org.junit.Assert.assertEquals(locale66.toString(), "");
        org.junit.Assert.assertNotNull(localeArray67);
        org.junit.Assert.assertTrue("'" + boolean69 + "' != '" + true + "'", boolean69 == true);
        org.junit.Assert.assertNotNull(localeList70);
        org.junit.Assert.assertNotNull(localeList71);
        org.junit.Assert.assertNotNull(languageRangeList73);
        org.junit.Assert.assertNotNull(languageRangeArray74);
        org.junit.Assert.assertTrue("'" + boolean76 + "' != '" + false + "'", boolean76 == false);
        org.junit.Assert.assertNull(locale78);
        org.junit.Assert.assertNotNull(strArray80);
        org.junit.Assert.assertTrue("'" + boolean82 + "' != '" + true + "'", boolean82 == true);
        org.junit.Assert.assertNull(str83);
        org.junit.Assert.assertNotNull(locale84);
        org.junit.Assert.assertEquals(locale84.toString(), "");
        org.junit.Assert.assertTrue("'" + boolean85 + "' != '" + false + "'", boolean85 == false);
        org.junit.Assert.assertEquals("'" + str86 + "' != '" + "" + "'", str86, "");
        org.junit.Assert.assertNotNull(locale87);
        org.junit.Assert.assertEquals(locale87.toString(), "ja_JP");
        org.junit.Assert.assertNotNull(locale88);
        org.junit.Assert.assertEquals(locale88.toString(), "fr");
        org.junit.Assert.assertEquals(locale92.toString(), "");
        org.junit.Assert.assertNotNull(localeArray93);
        org.junit.Assert.assertTrue("'" + boolean95 + "' != '" + true + "'", boolean95 == true);
        org.junit.Assert.assertNotNull(localeList96);
        org.junit.Assert.assertTrue("'" + filteringMode97 + "' != '" + java.util.Locale.FilteringMode.REJECT_EXTENDED_RANGES + "'", filteringMode97.equals(java.util.Locale.FilteringMode.REJECT_EXTENDED_RANGES));
        org.junit.Assert.assertNotNull(localeList98);
        org.junit.Assert.assertNull(locale99);
    }

    @Test
    public void test00349() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00349");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clearExtensions();
        java.util.Locale.Builder builder2 = builder1.clearExtensions();
        java.util.Locale.Builder builder4 = builder1.setLanguage("de");
        java.util.Locale.Builder builder5 = builder1.clearExtensions();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder7 = builder5.setRegion("Italy");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed region: Italy [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder5);
    }

    @Test
    public void test00350() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00350");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl((int) 'u', (int) (byte) 1, (int) '#');
        int int4 = hypergeometricDistributionImpl3.getPopulationSize();
        double double6 = hypergeometricDistributionImpl3.cumulativeProbability((int) (short) 100);
        int int7 = hypergeometricDistributionImpl3.getPopulationSize();
        double double10 = hypergeometricDistributionImpl3.cumulativeProbability(0, (int) 'a');
        hypergeometricDistributionImpl3.setSampleSize((int) 'a');
        double double14 = hypergeometricDistributionImpl3.probability((int) '4');
        double double16 = hypergeometricDistributionImpl3.cumulativeProbability(0.0d);
        int int17 = hypergeometricDistributionImpl3.getPopulationSize();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 117 + "'", int4 == 117);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0d + "'", double6 == 1.0d);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 117 + "'", int7 == 117);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 1.0d + "'", double10 == 1.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.1709401709401705d + "'", double16 == 0.1709401709401705d);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 117 + "'", int17 == 117);
    }

    @Test
    public void test00351() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00351");
        java.io.PrintWriter printWriter2 = new java.io.PrintWriter("fr");
        printWriter2.print("it_IT");
        java.util.Locale locale5 = java.util.Locale.ROOT;
        boolean boolean6 = locale5.hasExtensions();
        java.util.Locale locale7 = java.util.Locale.ROOT;
        java.lang.String str8 = locale5.getDisplayName(locale7);
        java.util.Locale locale9 = java.util.Locale.ROOT;
        boolean boolean10 = locale9.hasExtensions();
        java.lang.String str11 = locale5.getDisplayCountry(locale9);
        java.lang.Object[] objArray14 = new java.lang.Object[] {};
        org.apache.commons.math.MathException mathException15 = new org.apache.commons.math.MathException("hi!", objArray14);
        java.io.PrintWriter printWriter16 = printWriter2.printf(locale9, "it_IT", objArray14);
        org.apache.commons.math.MathException mathException17 = new org.apache.commons.math.MathException("", objArray14);
        org.apache.commons.math.MathException mathException18 = new org.apache.commons.math.MathException((java.lang.Throwable) mathException17);
        java.lang.Object[] objArray19 = mathException17.getArguments();
        java.lang.Object[] objArray20 = mathException17.getArguments();
        java.lang.String str21 = mathException17.toString();
        org.junit.Assert.assertNotNull(locale5);
        org.junit.Assert.assertEquals(locale5.toString(), "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(locale7);
        org.junit.Assert.assertEquals(locale7.toString(), "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(locale9);
        org.junit.Assert.assertEquals(locale9.toString(), "");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNotNull(objArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray14), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray14), "[]");
        org.junit.Assert.assertNotNull(printWriter16);
        org.junit.Assert.assertNotNull(objArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray19), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray19), "[]");
        org.junit.Assert.assertNotNull(objArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray20), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray20), "[]");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "org.apache.commons.math.MathException: " + "'", str21, "org.apache.commons.math.MathException: ");
    }

    @Test
    public void test00352() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00352");
        java.io.PrintStream printStream1 = new java.io.PrintStream("zh_CN");
        printStream1.print((float) (byte) -1);
        printStream1.println();
        printStream1.println();
        java.io.PrintStream printStream7 = new java.io.PrintStream((java.io.OutputStream) printStream1, true);
        java.io.PrintWriter printWriter9 = new java.io.PrintWriter("fr");
        printWriter9.print("it_IT");
        java.util.Locale locale12 = java.util.Locale.ROOT;
        boolean boolean13 = locale12.hasExtensions();
        java.util.Locale locale14 = java.util.Locale.ROOT;
        java.lang.String str15 = locale12.getDisplayName(locale14);
        java.util.Locale locale16 = java.util.Locale.ROOT;
        boolean boolean17 = locale16.hasExtensions();
        java.lang.String str18 = locale12.getDisplayCountry(locale16);
        java.lang.Object[] objArray21 = new java.lang.Object[] {};
        org.apache.commons.math.MathException mathException22 = new org.apache.commons.math.MathException("hi!", objArray21);
        java.io.PrintWriter printWriter23 = printWriter9.printf(locale16, "it_IT", objArray21);
        printStream7.println((java.lang.Object) "it_IT");
        java.io.PrintStream printStream26 = printStream7.append((java.lang.CharSequence) "fr");
        java.io.PrintStream printStream28 = new java.io.PrintStream((java.io.OutputStream) printStream26, false);
        java.io.PrintWriter printWriter30 = new java.io.PrintWriter((java.io.OutputStream) printStream26, true);
        // The following exception was thrown during execution in test generation
        try {
            java.io.PrintStream printStream34 = printStream26.append((java.lang.CharSequence) "Italian (Italy)", 117, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: -107");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(locale12);
        org.junit.Assert.assertEquals(locale12.toString(), "");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(locale14);
        org.junit.Assert.assertEquals(locale14.toString(), "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertNotNull(locale16);
        org.junit.Assert.assertEquals(locale16.toString(), "");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertNotNull(objArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray21), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray21), "[]");
        org.junit.Assert.assertNotNull(printWriter23);
        org.junit.Assert.assertNotNull(printStream26);
    }

    @Test
    public void test00353() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00353");
        java.util.Locale locale0 = java.util.Locale.JAPANESE;
        java.util.Locale locale1 = java.util.Locale.JAPANESE;
        java.lang.String str2 = locale0.getDisplayCountry(locale1);
        java.lang.String str3 = locale0.getVariant();
        java.util.Locale locale4 = java.util.Locale.CANADA;
        java.lang.String str5 = locale0.getDisplayScript(locale4);
        java.util.Locale locale8 = new java.util.Locale("Italy", "Italy");
        java.lang.String str9 = locale4.getDisplayLanguage(locale8);
        boolean boolean10 = locale4.hasExtensions();
        java.lang.String str11 = locale4.getISO3Language();
        boolean boolean12 = locale4.hasExtensions();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str14 = locale4.getUnicodeLocaleType("italiano (Italia)");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Ill-formed Unicode locale key: italiano (Italia)");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "ja");
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "ja");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "en_CA");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals(locale8.toString(), "italy_ITALY");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "English" + "'", str9, "English");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "eng" + "'", str11, "eng");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test00354() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00354");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl((int) (byte) 0, 117, (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: number of successes must be less than or equal to population size");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00355() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00355");
        java.io.PrintWriter printWriter1 = new java.io.PrintWriter("fr");
        printWriter1.print("it_IT");
        java.lang.Object[] objArray5 = new java.lang.Object[] {};
        java.io.PrintWriter printWriter6 = printWriter1.printf("fr", objArray5);
        printWriter1.println((float) 'u');
        printWriter1.write("en-GB");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl14 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl((int) 'u', (int) (byte) 1, (int) '#');
        int int15 = hypergeometricDistributionImpl14.getSampleSize();
        int int16 = hypergeometricDistributionImpl14.getPopulationSize();
        double double18 = hypergeometricDistributionImpl14.upperCumulativeProbability((int) '#');
        int int19 = hypergeometricDistributionImpl14.getPopulationSize();
        int int20 = hypergeometricDistributionImpl14.getNumberOfSuccesses();
        hypergeometricDistributionImpl14.setNumberOfSuccesses((int) (byte) 10);
        printWriter1.print((java.lang.Object) hypergeometricDistributionImpl14);
        double double25 = hypergeometricDistributionImpl14.probability((double) (byte) 1);
        double double27 = hypergeometricDistributionImpl14.cumulativeProbability((int) ' ');
        double double29 = hypergeometricDistributionImpl14.cumulativeProbability(0.11499182616210182d);
        // The following exception was thrown during execution in test generation
        try {
            int int31 = hypergeometricDistributionImpl14.inverseCumulativeProbability((double) 'x');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: p must be between 0 and 1.0 (inclusive)");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray5), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray5), "[]");
        org.junit.Assert.assertNotNull(printWriter6);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 35 + "'", int15 == 35);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 117 + "'", int16 == 117);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 0.0d + "'", double18 == 0.0d);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 117 + "'", int19 == 117);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1 + "'", int20 == 1);
        org.junit.Assert.assertTrue("'" + double25 + "' != '" + 0.11499182616210182d + "'", double25 == 0.11499182616210182d);
        org.junit.Assert.assertTrue("'" + double27 + "' != '" + 1.0d + "'", double27 == 1.0d);
        org.junit.Assert.assertTrue("'" + double29 + "' != '" + 0.023984009456667447d + "'", double29 == 0.023984009456667447d);
    }

    @Test
    public void test00356() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00356");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl(100, 0, (int) 'x');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: sample size must be less than or equal to population size");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00357() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00357");
        java.io.PrintWriter printWriter1 = new java.io.PrintWriter("fr");
        printWriter1.print("it_IT");
        java.util.Locale locale4 = java.util.Locale.ROOT;
        boolean boolean5 = locale4.hasExtensions();
        java.util.Locale locale6 = java.util.Locale.ROOT;
        java.lang.String str7 = locale4.getDisplayName(locale6);
        java.util.Locale locale8 = java.util.Locale.ROOT;
        boolean boolean9 = locale8.hasExtensions();
        java.lang.String str10 = locale4.getDisplayCountry(locale8);
        java.lang.Object[] objArray13 = new java.lang.Object[] {};
        org.apache.commons.math.MathException mathException14 = new org.apache.commons.math.MathException("hi!", objArray13);
        java.io.PrintWriter printWriter15 = printWriter1.printf(locale8, "it_IT", objArray13);
        java.util.Locale locale18 = new java.util.Locale("Italy", "Italy");
        java.lang.String str19 = locale8.getDisplayScript(locale18);
        java.lang.Class<?> wildcardClass20 = locale8.getClass();
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(locale6);
        org.junit.Assert.assertEquals(locale6.toString(), "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(locale8);
        org.junit.Assert.assertEquals(locale8.toString(), "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(objArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray13), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray13), "[]");
        org.junit.Assert.assertNotNull(printWriter15);
        org.junit.Assert.assertEquals(locale18.toString(), "italy_ITALY");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test00358() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00358");
        java.io.PrintStream printStream1 = new java.io.PrintStream("zh_CN");
        printStream1.println();
        java.io.PrintStream printStream4 = printStream1.append('#');
        java.io.PrintWriter printWriter5 = new java.io.PrintWriter((java.io.OutputStream) printStream4);
        printStream4.println('#');
        printStream4.println();
        printStream4.print("italien (Italie)");
        java.io.PrintStream printStream11 = new java.io.PrintStream((java.io.OutputStream) printStream4);
        // The following exception was thrown during execution in test generation
        try {
            java.io.PrintStream printStream14 = new java.io.PrintStream((java.io.OutputStream) printStream11, true, "org.apache.commons.math.MathException: hi!");
            org.junit.Assert.fail("Expected exception of type java.io.UnsupportedEncodingException; message: org.apache.commons.math.MathException: hi!");
        } catch (java.io.UnsupportedEncodingException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(printStream4);
    }

    @Test
    public void test00359() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00359");
        java.util.Locale locale0 = java.util.Locale.ITALY;
        java.lang.String str1 = locale0.getISO3Language();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str3 = locale0.getUnicodeLocaleType("italiano");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Ill-formed Unicode locale key: italiano");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "it_IT");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "ita" + "'", str1, "ita");
    }

    @Test
    public void test00360() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00360");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clearExtensions();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder4 = builder1.setExtension('x', "italiano (Italia)");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed extension value: italiano (Italia) [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder1);
    }

    @Test
    public void test00361() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00361");
        java.io.PrintWriter printWriter2 = new java.io.PrintWriter("fr");
        printWriter2.print("it_IT");
        java.util.Locale locale5 = java.util.Locale.ROOT;
        boolean boolean6 = locale5.hasExtensions();
        java.util.Locale locale7 = java.util.Locale.ROOT;
        java.lang.String str8 = locale5.getDisplayName(locale7);
        java.util.Locale locale9 = java.util.Locale.ROOT;
        boolean boolean10 = locale9.hasExtensions();
        java.lang.String str11 = locale5.getDisplayCountry(locale9);
        java.lang.Object[] objArray14 = new java.lang.Object[] {};
        org.apache.commons.math.MathException mathException15 = new org.apache.commons.math.MathException("hi!", objArray14);
        java.io.PrintWriter printWriter16 = printWriter2.printf(locale9, "it_IT", objArray14);
        org.apache.commons.math.MathException mathException17 = new org.apache.commons.math.MathException("", objArray14);
        org.apache.commons.math.MathException mathException18 = new org.apache.commons.math.MathException((java.lang.Throwable) mathException17);
        java.lang.Object[] objArray19 = mathException17.getArguments();
        java.lang.Object[] objArray21 = new java.lang.Object[] {};
        org.apache.commons.math.MathException mathException22 = new org.apache.commons.math.MathException("hi!", objArray21);
        java.lang.Object[] objArray23 = mathException22.getArguments();
        java.lang.Object[] objArray25 = new java.lang.Object[] {};
        org.apache.commons.math.MathException mathException26 = new org.apache.commons.math.MathException("hi!", objArray25);
        java.lang.Throwable[] throwableArray27 = mathException26.getSuppressed();
        mathException22.addSuppressed((java.lang.Throwable) mathException26);
        mathException17.addSuppressed((java.lang.Throwable) mathException22);
        java.lang.String str30 = mathException17.toString();
        org.junit.Assert.assertNotNull(locale5);
        org.junit.Assert.assertEquals(locale5.toString(), "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(locale7);
        org.junit.Assert.assertEquals(locale7.toString(), "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(locale9);
        org.junit.Assert.assertEquals(locale9.toString(), "");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNotNull(objArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray14), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray14), "[]");
        org.junit.Assert.assertNotNull(printWriter16);
        org.junit.Assert.assertNotNull(objArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray19), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray19), "[]");
        org.junit.Assert.assertNotNull(objArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray21), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray21), "[]");
        org.junit.Assert.assertNotNull(objArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray23), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray23), "[]");
        org.junit.Assert.assertNotNull(objArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray25), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray25), "[]");
        org.junit.Assert.assertNotNull(throwableArray27);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "org.apache.commons.math.MathException: " + "'", str30, "org.apache.commons.math.MathException: ");
    }

    @Test
    public void test00362() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00362");
        java.io.PrintWriter printWriter1 = new java.io.PrintWriter("fr");
        printWriter1.println();
        printWriter1.write("Italy", 0, (int) (short) -1);
        printWriter1.print((long) '4');
        java.lang.Throwable throwable10 = null;
        org.apache.commons.math.MathException mathException11 = new org.apache.commons.math.MathException(throwable10);
        org.apache.commons.math.MathException mathException12 = new org.apache.commons.math.MathException((java.lang.Throwable) mathException11);
        java.lang.Throwable[] throwableArray13 = mathException11.getSuppressed();
        java.io.PrintWriter printWriter14 = printWriter1.format("\u82f1\u8a9e", (java.lang.Object[]) throwableArray13);
        java.io.PrintWriter printWriter16 = new java.io.PrintWriter("fr");
        printWriter16.print("it_IT");
        java.util.Locale locale19 = java.util.Locale.ROOT;
        boolean boolean20 = locale19.hasExtensions();
        java.util.Locale locale21 = java.util.Locale.ROOT;
        java.lang.String str22 = locale19.getDisplayName(locale21);
        java.util.Locale locale23 = java.util.Locale.ROOT;
        boolean boolean24 = locale23.hasExtensions();
        java.lang.String str25 = locale19.getDisplayCountry(locale23);
        java.lang.Object[] objArray28 = new java.lang.Object[] {};
        org.apache.commons.math.MathException mathException29 = new org.apache.commons.math.MathException("hi!", objArray28);
        java.io.PrintWriter printWriter30 = printWriter16.printf(locale23, "it_IT", objArray28);
        java.io.PrintWriter printWriter32 = new java.io.PrintWriter("fr");
        printWriter32.print("it_IT");
        java.util.Locale locale35 = java.util.Locale.ROOT;
        boolean boolean36 = locale35.hasExtensions();
        java.util.Locale locale37 = java.util.Locale.ROOT;
        java.lang.String str38 = locale35.getDisplayName(locale37);
        java.util.Locale locale39 = java.util.Locale.ROOT;
        boolean boolean40 = locale39.hasExtensions();
        java.lang.String str41 = locale35.getDisplayCountry(locale39);
        java.lang.Object[] objArray44 = new java.lang.Object[] {};
        org.apache.commons.math.MathException mathException45 = new org.apache.commons.math.MathException("hi!", objArray44);
        java.io.PrintWriter printWriter46 = printWriter32.printf(locale39, "it_IT", objArray44);
        printWriter46.print((double) 100L);
        java.util.Locale locale49 = java.util.Locale.JAPANESE;
        java.util.Locale locale50 = java.util.Locale.JAPANESE;
        java.lang.String str51 = locale49.getDisplayCountry(locale50);
        java.lang.String str52 = locale49.getVariant();
        java.lang.String str53 = locale49.getCountry();
        java.io.PrintStream printStream56 = new java.io.PrintStream("zh_CN");
        printStream56.print((float) (byte) -1);
        printStream56.println();
        printStream56.print("ita");
        java.util.Locale locale62 = java.util.Locale.FRENCH;
        java.util.Set<java.lang.String> strSet63 = locale62.getUnicodeLocaleKeys();
        java.util.Locale locale64 = locale62.stripExtensions();
        java.lang.Object[] objArray67 = new java.lang.Object[] {};
        org.apache.commons.math.MathException mathException68 = new org.apache.commons.math.MathException("hi!", objArray67);
        java.lang.Throwable[] throwableArray69 = mathException68.getSuppressed();
        java.lang.Throwable[] throwableArray70 = mathException68.getSuppressed();
        java.io.PrintStream printStream71 = printStream56.printf(locale64, "fr", (java.lang.Object[]) throwableArray70);
        java.io.PrintWriter printWriter72 = printWriter46.format(locale49, "fra", (java.lang.Object[]) throwableArray70);
        char[] charArray73 = new char[] {};
        printWriter46.print(charArray73);
        printWriter30.println(charArray73);
        // The following exception was thrown during execution in test generation
        try {
            printWriter14.write(charArray73, (int) (short) 100, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(throwableArray13);
        org.junit.Assert.assertNotNull(printWriter14);
        org.junit.Assert.assertNotNull(locale19);
        org.junit.Assert.assertEquals(locale19.toString(), "");
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(locale21);
        org.junit.Assert.assertEquals(locale21.toString(), "");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertNotNull(locale23);
        org.junit.Assert.assertEquals(locale23.toString(), "");
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
        org.junit.Assert.assertNotNull(objArray28);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray28), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray28), "[]");
        org.junit.Assert.assertNotNull(printWriter30);
        org.junit.Assert.assertNotNull(locale35);
        org.junit.Assert.assertEquals(locale35.toString(), "");
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertNotNull(locale37);
        org.junit.Assert.assertEquals(locale37.toString(), "");
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "" + "'", str38, "");
        org.junit.Assert.assertNotNull(locale39);
        org.junit.Assert.assertEquals(locale39.toString(), "");
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "" + "'", str41, "");
        org.junit.Assert.assertNotNull(objArray44);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray44), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray44), "[]");
        org.junit.Assert.assertNotNull(printWriter46);
        org.junit.Assert.assertNotNull(locale49);
        org.junit.Assert.assertEquals(locale49.toString(), "ja");
        org.junit.Assert.assertNotNull(locale50);
        org.junit.Assert.assertEquals(locale50.toString(), "ja");
        org.junit.Assert.assertEquals("'" + str51 + "' != '" + "" + "'", str51, "");
        org.junit.Assert.assertEquals("'" + str52 + "' != '" + "" + "'", str52, "");
        org.junit.Assert.assertEquals("'" + str53 + "' != '" + "" + "'", str53, "");
        org.junit.Assert.assertNotNull(locale62);
        org.junit.Assert.assertEquals(locale62.toString(), "fr");
        org.junit.Assert.assertNotNull(strSet63);
        org.junit.Assert.assertNotNull(locale64);
        org.junit.Assert.assertEquals(locale64.toString(), "fr");
        org.junit.Assert.assertNotNull(objArray67);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray67), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray67), "[]");
        org.junit.Assert.assertNotNull(throwableArray69);
        org.junit.Assert.assertNotNull(throwableArray70);
        org.junit.Assert.assertNotNull(printStream71);
        org.junit.Assert.assertNotNull(printWriter72);
        org.junit.Assert.assertNotNull(charArray73);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray73), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray73), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray73), "[]");
    }

    @Test
    public void test00363() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00363");
        java.util.Locale locale2 = new java.util.Locale("en-GB", "Italy");
        java.lang.String str3 = locale2.toLanguageTag();
        java.util.Locale.Category category4 = java.util.Locale.Category.FORMAT;
        java.io.PrintWriter printWriter6 = new java.io.PrintWriter("fr");
        printWriter6.write("hi!");
        printWriter6.println((java.lang.Object) (-1L));
        java.util.Locale locale11 = java.util.Locale.ITALY;
        java.lang.String str12 = locale11.getDisplayName();
        java.lang.Object[] objArray15 = new java.lang.Object[] {};
        org.apache.commons.math.MathException mathException16 = new org.apache.commons.math.MathException("hi!", objArray15);
        java.lang.Object[] objArray17 = mathException16.getArguments();
        java.io.PrintWriter printWriter18 = printWriter6.format(locale11, "anglais", objArray17);
        java.util.Locale.setDefault(category4, locale11);
        java.util.Locale locale20 = java.util.Locale.getDefault(category4);
        java.util.Locale locale21 = java.util.Locale.JAPANESE;
        java.util.Locale locale22 = java.util.Locale.JAPANESE;
        java.lang.String str23 = locale21.getDisplayCountry(locale22);
        java.lang.String str24 = locale20.getDisplayName(locale22);
        java.lang.String str25 = locale2.getDisplayLanguage(locale20);
        java.io.PrintStream printStream29 = new java.io.PrintStream("zh_CN");
        printStream29.print((float) (byte) -1);
        printStream29.println();
        printStream29.print("ita");
        java.util.Locale locale35 = java.util.Locale.FRENCH;
        java.util.Set<java.lang.String> strSet36 = locale35.getUnicodeLocaleKeys();
        java.util.Locale locale37 = locale35.stripExtensions();
        java.lang.Object[] objArray40 = new java.lang.Object[] {};
        org.apache.commons.math.MathException mathException41 = new org.apache.commons.math.MathException("hi!", objArray40);
        java.lang.Throwable[] throwableArray42 = mathException41.getSuppressed();
        java.lang.Throwable[] throwableArray43 = mathException41.getSuppressed();
        java.io.PrintStream printStream44 = printStream29.printf(locale37, "fr", (java.lang.Object[]) throwableArray43);
        java.lang.Object[] objArray46 = new java.lang.Object[] {};
        org.apache.commons.math.MathException mathException47 = new org.apache.commons.math.MathException("hi!", objArray46);
        java.lang.Object[] objArray48 = mathException47.getArguments();
        org.apache.commons.math.MathException mathException49 = new org.apache.commons.math.MathException("italien (Italie)", (java.lang.Object[]) throwableArray43, (java.lang.Throwable) mathException47);
        java.lang.Object[] objArray51 = new java.lang.Object[] {};
        org.apache.commons.math.MathException mathException52 = new org.apache.commons.math.MathException("hi!", objArray51);
        java.lang.Object[] objArray53 = mathException52.getArguments();
        mathException47.addSuppressed((java.lang.Throwable) mathException52);
        java.lang.Throwable throwable55 = null;
        org.apache.commons.math.MathException mathException56 = new org.apache.commons.math.MathException(throwable55);
        org.apache.commons.math.MathException mathException57 = new org.apache.commons.math.MathException((java.lang.Throwable) mathException56);
        org.apache.commons.math.MathException mathException58 = new org.apache.commons.math.MathException((java.lang.Throwable) mathException57);
        mathException47.addSuppressed((java.lang.Throwable) mathException58);
        org.apache.commons.math.MathException mathException60 = new org.apache.commons.math.MathException("deu", (java.lang.Throwable) mathException58);
        boolean boolean61 = locale2.equals((java.lang.Object) mathException60);
        org.junit.Assert.assertEquals(locale2.toString(), "en-gb_ITALY");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "und" + "'", str3, "und");
        org.junit.Assert.assertTrue("'" + category4 + "' != '" + java.util.Locale.Category.FORMAT + "'", category4.equals(java.util.Locale.Category.FORMAT));
        org.junit.Assert.assertNotNull(locale11);
        org.junit.Assert.assertEquals(locale11.toString(), "it_IT");
// flaky:         org.junit.Assert.assertEquals("'" + str12 + "' != '" + "\u30a4\u30bf\u30ea\u30a2\u8a9e\u30a4\u30bf\u30ea\u30a2)" + "'", str12, "\u30a4\u30bf\u30ea\u30a2\u8a9e\u30a4\u30bf\u30ea\u30a2)");
        org.junit.Assert.assertNotNull(objArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray15), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray15), "[]");
        org.junit.Assert.assertNotNull(objArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray17), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray17), "[]");
        org.junit.Assert.assertNotNull(printWriter18);
        org.junit.Assert.assertNotNull(locale20);
        org.junit.Assert.assertEquals(locale20.toString(), "it_IT");
        org.junit.Assert.assertNotNull(locale21);
        org.junit.Assert.assertEquals(locale21.toString(), "ja");
        org.junit.Assert.assertNotNull(locale22);
        org.junit.Assert.assertEquals(locale22.toString(), "ja");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
// flaky:         org.junit.Assert.assertEquals("'" + str24 + "' != '" + "\u30a4\u30bf\u30ea\u30a2\u8a9e\u30a4\u30bf\u30ea\u30a2)" + "'", str24, "\u30a4\u30bf\u30ea\u30a2\u8a9e\u30a4\u30bf\u30ea\u30a2)");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "en-gb" + "'", str25, "en-gb");
        org.junit.Assert.assertNotNull(locale35);
        org.junit.Assert.assertEquals(locale35.toString(), "fr");
        org.junit.Assert.assertNotNull(strSet36);
        org.junit.Assert.assertNotNull(locale37);
        org.junit.Assert.assertEquals(locale37.toString(), "fr");
        org.junit.Assert.assertNotNull(objArray40);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray40), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray40), "[]");
        org.junit.Assert.assertNotNull(throwableArray42);
        org.junit.Assert.assertNotNull(throwableArray43);
        org.junit.Assert.assertNotNull(printStream44);
        org.junit.Assert.assertNotNull(objArray46);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray46), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray46), "[]");
        org.junit.Assert.assertNotNull(objArray48);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray48), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray48), "[]");
        org.junit.Assert.assertNotNull(objArray51);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray51), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray51), "[]");
        org.junit.Assert.assertNotNull(objArray53);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray53), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray53), "[]");
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + false + "'", boolean61 == false);
    }

    @Test
    public void test00364() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00364");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl((int) 'u', (int) (byte) 1, (int) '#');
        int int4 = hypergeometricDistributionImpl3.getPopulationSize();
        double double6 = hypergeometricDistributionImpl3.cumulativeProbability((double) (short) -1);
        double double8 = hypergeometricDistributionImpl3.probability((double) (short) 100);
        int int9 = hypergeometricDistributionImpl3.getPopulationSize();
        double double11 = hypergeometricDistributionImpl3.probability((int) ' ');
        // The following exception was thrown during execution in test generation
        try {
            int int13 = hypergeometricDistributionImpl3.inverseCumulativeProbability((double) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: p must be between 0 and 1.0 (inclusive)");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 117 + "'", int4 == 117);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 117 + "'", int9 == 117);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
    }

    @Test
    public void test00365() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00365");
        java.util.Locale.LanguageRange languageRange2 = new java.util.Locale.LanguageRange("tedesco", 0.0d);
        java.io.PrintWriter printWriter4 = new java.io.PrintWriter("fr");
        printWriter4.print("it_IT");
        java.util.Locale locale7 = java.util.Locale.ROOT;
        boolean boolean8 = locale7.hasExtensions();
        java.util.Locale locale9 = java.util.Locale.ROOT;
        java.lang.String str10 = locale7.getDisplayName(locale9);
        java.util.Locale locale11 = java.util.Locale.ROOT;
        boolean boolean12 = locale11.hasExtensions();
        java.lang.String str13 = locale7.getDisplayCountry(locale11);
        java.lang.Object[] objArray16 = new java.lang.Object[] {};
        org.apache.commons.math.MathException mathException17 = new org.apache.commons.math.MathException("hi!", objArray16);
        java.io.PrintWriter printWriter18 = printWriter4.printf(locale11, "it_IT", objArray16);
        printWriter4.println();
        printWriter4.print(10);
        boolean boolean22 = languageRange2.equals((java.lang.Object) printWriter4);
        org.junit.Assert.assertNotNull(locale7);
        org.junit.Assert.assertEquals(locale7.toString(), "");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(locale9);
        org.junit.Assert.assertEquals(locale9.toString(), "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(locale11);
        org.junit.Assert.assertEquals(locale11.toString(), "");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNotNull(objArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray16), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray16), "[]");
        org.junit.Assert.assertNotNull(printWriter18);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
    }

    @Test
    public void test00366() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00366");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder2 = builder0.setLanguageTag("ita");
        java.util.Locale.Builder builder3 = builder0.clearExtensions();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder5 = builder3.setRegion("jpn");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed region: jpn [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder3);
    }

    @Test
    public void test00367() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00367");
        // The following exception was thrown during execution in test generation
        try {
            java.io.PrintWriter printWriter2 = new java.io.PrintWriter("", "org.apache.commons.math.MathException: ");
            org.junit.Assert.fail("Expected exception of type java.io.UnsupportedEncodingException; message: org.apache.commons.math.MathException: ");
        } catch (java.io.UnsupportedEncodingException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00368() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00368");
        java.util.Locale locale3 = new java.util.Locale("CA", "", "fr-CA");
        org.junit.Assert.assertEquals(locale3.toString(), "ca__fr-CA");
    }

    @Test
    public void test00369() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00369");
        // The following exception was thrown during execution in test generation
        try {
            java.io.PrintStream printStream2 = new java.io.PrintStream("\u30a4\u30ae\u30ea\u30b9", "hi!");
            org.junit.Assert.fail("Expected exception of type java.io.UnsupportedEncodingException; message: hi!");
        } catch (java.io.UnsupportedEncodingException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00370() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00370");
        java.lang.Throwable throwable0 = null;
        org.apache.commons.math.MathException mathException1 = new org.apache.commons.math.MathException(throwable0);
        org.apache.commons.math.MathException mathException2 = new org.apache.commons.math.MathException(throwable0);
        java.lang.String str3 = mathException2.toString();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "org.apache.commons.math.MathException" + "'", str3, "org.apache.commons.math.MathException");
    }

    @Test
    public void test00371() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00371");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clearExtensions();
        java.util.Locale locale2 = builder1.build();
        java.util.Locale.Builder builder3 = builder1.clearExtensions();
        java.util.Locale.Builder builder4 = builder3.clear();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder7 = builder4.setUnicodeLocaleKeyword("org.apache.commons.math.mathexception", "CA");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed Unicode locale keyword key: org.apache.commons.math.mathexception [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "");
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder4);
    }

    @Test
    public void test00372() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00372");
        java.util.Locale locale3 = new java.util.Locale("", "", "");
        java.util.Locale locale4 = locale3.stripExtensions();
        java.lang.String str5 = locale4.getISO3Country();
        java.lang.String str6 = locale4.getScript();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str8 = locale4.getUnicodeLocaleType("en-GB");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Ill-formed Unicode locale key: en-GB");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals(locale3.toString(), "");
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
    }

    @Test
    public void test00373() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00373");
        java.util.Locale.Category category0 = java.util.Locale.Category.FORMAT;
        java.util.Locale locale1 = java.util.Locale.GERMANY;
        java.util.Set<java.lang.String> strSet2 = locale1.getUnicodeLocaleKeys();
        java.util.Locale.setDefault(category0, locale1);
        java.util.Locale locale4 = java.util.Locale.getDefault(category0);
        java.util.Set<java.lang.String> strSet5 = locale4.getUnicodeLocaleAttributes();
        org.junit.Assert.assertTrue("'" + category0 + "' != '" + java.util.Locale.Category.FORMAT + "'", category0.equals(java.util.Locale.Category.FORMAT));
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "de_DE");
        org.junit.Assert.assertNotNull(strSet2);
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "de_DE");
        org.junit.Assert.assertNotNull(strSet5);
    }

    @Test
    public void test00374() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00374");
        java.util.Locale locale3 = new java.util.Locale("", "", "");
        java.util.Locale locale6 = new java.util.Locale("hi!", "Italy");
        java.lang.String str7 = locale3.getDisplayCountry(locale6);
        java.util.Locale locale8 = java.util.Locale.JAPAN;
        java.lang.String str9 = locale6.getDisplayName(locale8);
        java.util.Locale locale12 = new java.util.Locale("fr", "fr");
        java.lang.String str13 = locale12.getDisplayScript();
        java.util.Locale.setDefault(locale12);
        java.lang.String str15 = locale8.getDisplayLanguage(locale12);
        java.lang.String str16 = locale8.getLanguage();
        java.io.PrintWriter printWriter18 = new java.io.PrintWriter("fr");
        printWriter18.print("it_IT");
        java.lang.Object[] objArray22 = new java.lang.Object[] {};
        java.io.PrintWriter printWriter23 = printWriter18.printf("fr", objArray22);
        printWriter18.println((float) 'u');
        printWriter18.println("English");
        printWriter18.write("");
        printWriter18.println(0.1709401709401705d);
        printWriter18.println(false);
        boolean boolean34 = locale8.equals((java.lang.Object) printWriter18);
        org.junit.Assert.assertEquals(locale3.toString(), "");
        org.junit.Assert.assertEquals(locale6.toString(), "hi!_ITALY");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(locale8);
        org.junit.Assert.assertEquals(locale8.toString(), "ja_JP");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi! (ITALY)" + "'", str9, "hi! (ITALY)");
        org.junit.Assert.assertEquals(locale12.toString(), "fr_FR");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "japonais" + "'", str15, "japonais");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "ja" + "'", str16, "ja");
        org.junit.Assert.assertNotNull(objArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray22), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray22), "[]");
        org.junit.Assert.assertNotNull(printWriter23);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
    }

    @Test
    public void test00375() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00375");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl((int) 'u', (int) (byte) 1, (int) '#');
        hypergeometricDistributionImpl3.setPopulationSize(117);
        double double7 = hypergeometricDistributionImpl3.probability((double) 0);
        hypergeometricDistributionImpl3.setNumberOfSuccesses(100);
        // The following exception was thrown during execution in test generation
        try {
            hypergeometricDistributionImpl3.setNumberOfSuccesses((-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: number of successes must be non-negative.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.7008547008546866d + "'", double7 == 0.7008547008546866d);
    }

    @Test
    public void test00376() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00376");
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<java.util.Locale.LanguageRange> languageRangeList2 = java.util.Locale.LanguageRange.parse("", strMap1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: range=");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00377() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00377");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl((int) 'u', (int) (byte) 1, (int) '#');
        int int4 = hypergeometricDistributionImpl3.getPopulationSize();
        double double6 = hypergeometricDistributionImpl3.cumulativeProbability((int) (short) 100);
        int int7 = hypergeometricDistributionImpl3.getPopulationSize();
        // The following exception was thrown during execution in test generation
        try {
            hypergeometricDistributionImpl3.setPopulationSize((int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: population size must be positive.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 117 + "'", int4 == 117);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0d + "'", double6 == 1.0d);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 117 + "'", int7 == 117);
    }

    @Test
    public void test00378() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00378");
        // The following exception was thrown during execution in test generation
        try {
            java.io.PrintStream printStream1 = new java.io.PrintStream("fra");
// flaky:             org.junit.Assert.fail("Expected exception of type java.io.FileNotFoundException; message: fra (Is a directory)");
        } catch (java.io.FileNotFoundException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00379() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00379");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl((int) 'u', (int) (byte) 1, (int) '#');
        int int4 = hypergeometricDistributionImpl3.getPopulationSize();
        double double6 = hypergeometricDistributionImpl3.cumulativeProbability((double) (short) -1);
        double double8 = hypergeometricDistributionImpl3.probability((double) (short) 100);
        double double10 = hypergeometricDistributionImpl3.cumulativeProbability(0);
        double double12 = hypergeometricDistributionImpl3.cumulativeProbability((int) (short) -1);
        // The following exception was thrown during execution in test generation
        try {
            int int14 = hypergeometricDistributionImpl3.inverseCumulativeProbability((double) 'u');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: p must be between 0 and 1.0 (inclusive)");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 117 + "'", int4 == 117);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.7008547008546866d + "'", double10 == 0.7008547008546866d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
    }

    @Test
    public void test00380() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00380");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clearExtensions();
        java.util.Locale.Builder builder2 = builder1.clearExtensions();
        java.util.Locale.Builder builder4 = builder2.setVariant("anglais");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder6 = builder2.setLanguageTag("org.apache.commons.math.MathException: hi!");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Invalid subtag: org.apache.commons.math.MathException: hi! [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
    }

    @Test
    public void test00381() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00381");
        java.io.PrintStream printStream1 = new java.io.PrintStream("zh_CN");
        printStream1.print((float) (byte) -1);
        printStream1.println();
        printStream1.print("ita");
        java.util.Locale locale8 = new java.util.Locale("Italy");
        java.lang.Object[] objArray11 = new java.lang.Object[] {};
        org.apache.commons.math.MathException mathException12 = new org.apache.commons.math.MathException("hi!", objArray11);
        java.lang.Throwable[] throwableArray13 = mathException12.getSuppressed();
        java.lang.Throwable[] throwableArray14 = mathException12.getSuppressed();
        java.io.PrintStream printStream15 = printStream1.printf(locale8, "chinois", (java.lang.Object[]) throwableArray14);
        java.io.PrintStream printStream17 = printStream15.append((java.lang.CharSequence) "cinese");
        java.io.PrintWriter printWriter19 = new java.io.PrintWriter("fr");
        java.io.PrintWriter printWriter21 = printWriter19.append(' ');
        printWriter19.println(false);
        java.io.PrintWriter printWriter25 = new java.io.PrintWriter("fr");
        printWriter25.write("hi!");
        java.io.PrintWriter printWriter29 = new java.io.PrintWriter("fr");
        printWriter29.print("it_IT");
        java.lang.Object[] objArray33 = new java.lang.Object[] {};
        java.io.PrintWriter printWriter34 = printWriter29.printf("fr", objArray33);
        printWriter34.print((float) (byte) 100);
        java.io.PrintWriter printWriter38 = printWriter34.append((java.lang.CharSequence) "ja");
        java.io.PrintWriter printWriter40 = new java.io.PrintWriter("fr");
        java.io.PrintWriter printWriter42 = printWriter40.append(' ');
        java.io.PrintWriter printWriter45 = new java.io.PrintWriter("fr");
        printWriter45.print("it_IT");
        java.util.Locale locale48 = java.util.Locale.ROOT;
        boolean boolean49 = locale48.hasExtensions();
        java.util.Locale locale50 = java.util.Locale.ROOT;
        java.lang.String str51 = locale48.getDisplayName(locale50);
        java.util.Locale locale52 = java.util.Locale.ROOT;
        boolean boolean53 = locale52.hasExtensions();
        java.lang.String str54 = locale48.getDisplayCountry(locale52);
        java.lang.Object[] objArray57 = new java.lang.Object[] {};
        org.apache.commons.math.MathException mathException58 = new org.apache.commons.math.MathException("hi!", objArray57);
        java.io.PrintWriter printWriter59 = printWriter45.printf(locale52, "it_IT", objArray57);
        java.io.PrintWriter printWriter62 = new java.io.PrintWriter("fr");
        printWriter62.print("it_IT");
        java.util.Locale locale66 = java.util.Locale.forLanguageTag("");
        java.lang.Object[] objArray69 = new java.lang.Object[] {};
        org.apache.commons.math.MathException mathException70 = new org.apache.commons.math.MathException("hi!", objArray69);
        java.lang.Throwable[] throwableArray71 = mathException70.getSuppressed();
        java.lang.Throwable[] throwableArray72 = mathException70.getSuppressed();
        java.io.PrintWriter printWriter73 = printWriter62.printf(locale66, "it_IT", (java.lang.Object[]) throwableArray72);
        java.io.PrintWriter printWriter74 = printWriter45.format("it_IT", (java.lang.Object[]) throwableArray72);
        java.io.PrintWriter printWriter75 = printWriter42.format("zh_CN", (java.lang.Object[]) throwableArray72);
        java.io.PrintStream printStream77 = new java.io.PrintStream("zh_CN");
        printStream77.print((float) (byte) -1);
        char[] charArray82 = new char[] { 'x', 'u' };
        printStream77.println(charArray82);
        printWriter75.print(charArray82);
        printWriter38.write(charArray82);
        printWriter25.println(charArray82);
        printWriter19.write(charArray82);
        printStream15.print(charArray82);
        printStream15.println(0L);
        org.junit.Assert.assertEquals(locale8.toString(), "italy");
        org.junit.Assert.assertNotNull(objArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray11), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray11), "[]");
        org.junit.Assert.assertNotNull(throwableArray13);
        org.junit.Assert.assertNotNull(throwableArray14);
        org.junit.Assert.assertNotNull(printStream15);
        org.junit.Assert.assertNotNull(printStream17);
        org.junit.Assert.assertNotNull(printWriter21);
        org.junit.Assert.assertNotNull(objArray33);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray33), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray33), "[]");
        org.junit.Assert.assertNotNull(printWriter34);
        org.junit.Assert.assertNotNull(printWriter38);
        org.junit.Assert.assertNotNull(printWriter42);
        org.junit.Assert.assertNotNull(locale48);
        org.junit.Assert.assertEquals(locale48.toString(), "");
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertNotNull(locale50);
        org.junit.Assert.assertEquals(locale50.toString(), "");
        org.junit.Assert.assertEquals("'" + str51 + "' != '" + "" + "'", str51, "");
        org.junit.Assert.assertNotNull(locale52);
        org.junit.Assert.assertEquals(locale52.toString(), "");
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
        org.junit.Assert.assertEquals("'" + str54 + "' != '" + "" + "'", str54, "");
        org.junit.Assert.assertNotNull(objArray57);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray57), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray57), "[]");
        org.junit.Assert.assertNotNull(printWriter59);
        org.junit.Assert.assertNotNull(locale66);
        org.junit.Assert.assertEquals(locale66.toString(), "");
        org.junit.Assert.assertNotNull(objArray69);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray69), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray69), "[]");
        org.junit.Assert.assertNotNull(throwableArray71);
        org.junit.Assert.assertNotNull(throwableArray72);
        org.junit.Assert.assertNotNull(printWriter73);
        org.junit.Assert.assertNotNull(printWriter74);
        org.junit.Assert.assertNotNull(printWriter75);
        org.junit.Assert.assertNotNull(charArray82);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray82), "xu");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray82), "xu");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray82), "[x, u]");
    }

    @Test
    public void test00382() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00382");
        java.lang.String[] strArray0 = java.util.Locale.getISOCountries();
        java.lang.Class<?> wildcardClass1 = strArray0.getClass();
        org.junit.Assert.assertNotNull(strArray0);
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test00383() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00383");
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<java.util.Locale.LanguageRange> languageRangeList1 = java.util.Locale.LanguageRange.parse("\u65e5\u672c\u8a9e");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: range=???");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00384() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00384");
        java.io.PrintStream printStream2 = new java.io.PrintStream("zh_CN");
        printStream2.print((float) (byte) -1);
        printStream2.println();
        printStream2.print("ita");
        java.util.Locale locale8 = java.util.Locale.FRENCH;
        java.util.Set<java.lang.String> strSet9 = locale8.getUnicodeLocaleKeys();
        java.util.Locale locale10 = locale8.stripExtensions();
        java.lang.Object[] objArray13 = new java.lang.Object[] {};
        org.apache.commons.math.MathException mathException14 = new org.apache.commons.math.MathException("hi!", objArray13);
        java.lang.Throwable[] throwableArray15 = mathException14.getSuppressed();
        java.lang.Throwable[] throwableArray16 = mathException14.getSuppressed();
        java.io.PrintStream printStream17 = printStream2.printf(locale10, "fr", (java.lang.Object[]) throwableArray16);
        java.lang.Object[] objArray19 = new java.lang.Object[] {};
        org.apache.commons.math.MathException mathException20 = new org.apache.commons.math.MathException("hi!", objArray19);
        java.lang.Object[] objArray21 = mathException20.getArguments();
        org.apache.commons.math.MathException mathException22 = new org.apache.commons.math.MathException("italien (Italie)", (java.lang.Object[]) throwableArray16, (java.lang.Throwable) mathException20);
        java.lang.Object[] objArray24 = new java.lang.Object[] {};
        org.apache.commons.math.MathException mathException25 = new org.apache.commons.math.MathException("hi!", objArray24);
        java.lang.Object[] objArray26 = mathException25.getArguments();
        mathException20.addSuppressed((java.lang.Throwable) mathException25);
        java.lang.Throwable throwable28 = null;
        org.apache.commons.math.MathException mathException29 = new org.apache.commons.math.MathException(throwable28);
        org.apache.commons.math.MathException mathException30 = new org.apache.commons.math.MathException((java.lang.Throwable) mathException29);
        org.apache.commons.math.MathException mathException31 = new org.apache.commons.math.MathException((java.lang.Throwable) mathException30);
        mathException20.addSuppressed((java.lang.Throwable) mathException31);
        java.lang.Object[] objArray36 = new java.lang.Object[] {};
        org.apache.commons.math.MathException mathException37 = new org.apache.commons.math.MathException("hi!", objArray36);
        java.lang.Object[] objArray38 = mathException37.getArguments();
        java.lang.Object[] objArray40 = new java.lang.Object[] {};
        org.apache.commons.math.MathException mathException41 = new org.apache.commons.math.MathException("hi!", objArray40);
        java.lang.Throwable[] throwableArray42 = mathException41.getSuppressed();
        mathException37.addSuppressed((java.lang.Throwable) mathException41);
        java.lang.Throwable[] throwableArray44 = mathException37.getSuppressed();
        org.apache.commons.math.MathException mathException45 = new org.apache.commons.math.MathException();
        java.lang.String str46 = mathException45.getPattern();
        org.apache.commons.math.MathException mathException47 = new org.apache.commons.math.MathException("anglais", (java.lang.Object[]) throwableArray44, (java.lang.Throwable) mathException45);
        org.apache.commons.math.MathException mathException48 = new org.apache.commons.math.MathException("", (java.lang.Object[]) throwableArray44);
        mathException20.addSuppressed((java.lang.Throwable) mathException48);
        org.apache.commons.math.MathException mathException50 = new org.apache.commons.math.MathException((java.lang.Throwable) mathException20);
        java.lang.String str51 = mathException50.toString();
        org.junit.Assert.assertNotNull(locale8);
        org.junit.Assert.assertEquals(locale8.toString(), "fr");
        org.junit.Assert.assertNotNull(strSet9);
        org.junit.Assert.assertNotNull(locale10);
        org.junit.Assert.assertEquals(locale10.toString(), "fr");
        org.junit.Assert.assertNotNull(objArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray13), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray13), "[]");
        org.junit.Assert.assertNotNull(throwableArray15);
        org.junit.Assert.assertNotNull(throwableArray16);
        org.junit.Assert.assertNotNull(printStream17);
        org.junit.Assert.assertNotNull(objArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray19), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray19), "[]");
        org.junit.Assert.assertNotNull(objArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray21), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray21), "[]");
        org.junit.Assert.assertNotNull(objArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray24), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray24), "[]");
        org.junit.Assert.assertNotNull(objArray26);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray26), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray26), "[]");
        org.junit.Assert.assertNotNull(objArray36);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray36), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray36), "[]");
        org.junit.Assert.assertNotNull(objArray38);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray38), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray38), "[]");
        org.junit.Assert.assertNotNull(objArray40);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray40), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray40), "[]");
        org.junit.Assert.assertNotNull(throwableArray42);
        org.junit.Assert.assertNotNull(throwableArray44);
        org.junit.Assert.assertNull(str46);
        org.junit.Assert.assertEquals("'" + str51 + "' != '" + "org.apache.commons.math.MathException: hi!" + "'", str51, "org.apache.commons.math.MathException: hi!");
    }

    @Test
    public void test00385() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00385");
        java.io.PrintStream printStream1 = new java.io.PrintStream("zh_CN");
        printStream1.print((float) (byte) -1);
        printStream1.println();
        printStream1.println();
        printStream1.print((long) 'x');
        // The following exception was thrown during execution in test generation
        try {
            java.io.PrintStream printStream10 = new java.io.PrintStream((java.io.OutputStream) printStream1, false, "hi! (ITALY)");
            org.junit.Assert.fail("Expected exception of type java.io.UnsupportedEncodingException; message: hi! (ITALY)");
        } catch (java.io.UnsupportedEncodingException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00386() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00386");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl((int) 'u', (int) (byte) 1, (int) '#');
        int int4 = hypergeometricDistributionImpl3.getPopulationSize();
        double double6 = hypergeometricDistributionImpl3.cumulativeProbability((double) (short) -1);
        double double8 = hypergeometricDistributionImpl3.probability((double) (short) 100);
        double double10 = hypergeometricDistributionImpl3.cumulativeProbability((double) 117);
        double double12 = hypergeometricDistributionImpl3.cumulativeProbability((double) 'a');
        int int13 = hypergeometricDistributionImpl3.getNumberOfSuccesses();
        double double16 = hypergeometricDistributionImpl3.cumulativeProbability(0.001354928450285685d, (double) 117);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 117 + "'", int4 == 117);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 1.0d + "'", double10 == 1.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 1.0d + "'", double12 == 1.0d);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.2991452991453134d + "'", double16 == 0.2991452991453134d);
    }

    @Test
    public void test00387() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00387");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clearExtensions();
        java.util.Locale locale2 = java.util.Locale.TRADITIONAL_CHINESE;
        java.util.Locale locale3 = java.util.Locale.GERMAN;
        java.lang.String str4 = locale3.getVariant();
        java.lang.String str5 = locale3.toLanguageTag();
        java.lang.String str6 = locale2.getDisplayName(locale3);
        java.util.Locale.Builder builder7 = builder0.setLocale(locale2);
        java.util.Locale.Builder builder9 = builder0.setLanguage("jpn");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder11 = builder0.setScript("anglais");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed script: anglais [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "zh_TW");
        org.junit.Assert.assertNotNull(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "de");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "de" + "'", str5, "de");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Chinesisch (Taiwan)" + "'", str6, "Chinesisch (Taiwan)");
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(builder9);
    }

    @Test
    public void test00388() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00388");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl(0, (-1), 117);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: sample size must be less than or equal to population size");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00389() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00389");
        java.io.PrintStream printStream1 = new java.io.PrintStream("zh_CN");
        printStream1.print((float) (byte) -1);
        printStream1.println();
        printStream1.print("ita");
        java.util.Locale locale8 = new java.util.Locale("Italy");
        java.lang.Object[] objArray11 = new java.lang.Object[] {};
        org.apache.commons.math.MathException mathException12 = new org.apache.commons.math.MathException("hi!", objArray11);
        java.lang.Throwable[] throwableArray13 = mathException12.getSuppressed();
        java.lang.Throwable[] throwableArray14 = mathException12.getSuppressed();
        java.io.PrintStream printStream15 = printStream1.printf(locale8, "chinois", (java.lang.Object[]) throwableArray14);
        byte[] byteArray16 = null;
        // The following exception was thrown during execution in test generation
        try {
            printStream15.write(byteArray16, 0, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals(locale8.toString(), "italy");
        org.junit.Assert.assertNotNull(objArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray11), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray11), "[]");
        org.junit.Assert.assertNotNull(throwableArray13);
        org.junit.Assert.assertNotNull(throwableArray14);
        org.junit.Assert.assertNotNull(printStream15);
    }

    @Test
    public void test00390() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00390");
        java.io.PrintStream printStream1 = new java.io.PrintStream("zh_CN");
        printStream1.print((float) (byte) -1);
        printStream1.println();
        printStream1.print("ita");
        printStream1.println('#');
        java.lang.CharSequence charSequence9 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.io.PrintStream printStream12 = printStream1.append(charSequence9, 0, (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 35");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00391() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00391");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clearExtensions();
        java.util.Locale.Builder builder2 = builder0.clearExtensions();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder4 = builder2.setLanguage("allemand (Allemagne)");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed language: allemand (Allemagne) [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(builder2);
    }

    @Test
    public void test00392() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00392");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.LanguageRange languageRange2 = new java.util.Locale.LanguageRange("zh_CN", 0.11499182616210182d);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: range=zh_cn");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00393() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00393");
        java.io.PrintStream printStream1 = new java.io.PrintStream("zh_CN");
        printStream1.print((float) (byte) -1);
        printStream1.println();
        java.lang.Throwable throwable6 = null;
        org.apache.commons.math.MathException mathException7 = new org.apache.commons.math.MathException(throwable6);
        org.apache.commons.math.MathException mathException8 = new org.apache.commons.math.MathException((java.lang.Throwable) mathException7);
        java.lang.Throwable[] throwableArray9 = mathException7.getSuppressed();
        java.io.PrintStream printStream10 = printStream1.format("italien (Italie)", (java.lang.Object[]) throwableArray9);
        java.util.Locale locale11 = java.util.Locale.FRENCH;
        java.lang.Object[] objArray14 = new java.lang.Object[] {};
        org.apache.commons.math.MathException mathException15 = new org.apache.commons.math.MathException("hi!", objArray14);
        java.lang.Throwable[] throwableArray16 = mathException15.getSuppressed();
        java.io.PrintStream printStream17 = printStream1.printf(locale11, "ja", (java.lang.Object[]) throwableArray16);
        printStream1.println((float) 0);
        // The following exception was thrown during execution in test generation
        try {
            java.io.PrintStream printStream22 = new java.io.PrintStream((java.io.OutputStream) printStream1, true, "English");
            org.junit.Assert.fail("Expected exception of type java.io.UnsupportedEncodingException; message: English");
        } catch (java.io.UnsupportedEncodingException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(throwableArray9);
        org.junit.Assert.assertNotNull(printStream10);
        org.junit.Assert.assertNotNull(locale11);
        org.junit.Assert.assertEquals(locale11.toString(), "fr");
        org.junit.Assert.assertNotNull(objArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray14), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray14), "[]");
        org.junit.Assert.assertNotNull(throwableArray16);
        org.junit.Assert.assertNotNull(printStream17);
    }

    @Test
    public void test00394() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00394");
        // The following exception was thrown during execution in test generation
        try {
            java.io.PrintStream printStream2 = new java.io.PrintStream("hi!", "Italian (Italy)");
            org.junit.Assert.fail("Expected exception of type java.io.UnsupportedEncodingException; message: Italian (Italy)");
        } catch (java.io.UnsupportedEncodingException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00395() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00395");
        java.io.File file0 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.io.PrintStream printStream2 = new java.io.PrintStream(file0, "zh_CN");
            org.junit.Assert.fail("Expected exception of type java.io.UnsupportedEncodingException; message: zh_CN");
        } catch (java.io.UnsupportedEncodingException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00396() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00396");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl((int) 'u', (int) (byte) 1, (int) '#');
        int int4 = hypergeometricDistributionImpl3.getSampleSize();
        int int5 = hypergeometricDistributionImpl3.getPopulationSize();
        double double7 = hypergeometricDistributionImpl3.upperCumulativeProbability((int) '#');
        int int8 = hypergeometricDistributionImpl3.getPopulationSize();
        int int9 = hypergeometricDistributionImpl3.getPopulationSize();
        hypergeometricDistributionImpl3.setSampleSize(100);
        // The following exception was thrown during execution in test generation
        try {
            double double14 = hypergeometricDistributionImpl3.cumulativeProbability((double) (byte) 100, (double) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: lower endpoint must be less than or equal to upper endpoint");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 35 + "'", int4 == 35);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 117 + "'", int5 == 117);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 117 + "'", int8 == 117);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 117 + "'", int9 == 117);
    }

    @Test
    public void test00397() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00397");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clearExtensions();
        java.util.Locale.Builder builder2 = builder1.clearExtensions();
        java.util.Locale.Builder builder3 = builder1.clear();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder5 = builder3.setRegion("tedesco");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed region: tedesco [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder3);
    }

    @Test
    public void test00398() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00398");
        java.util.Locale locale0 = java.util.Locale.TAIWAN;
        java.util.Locale locale1 = java.util.Locale.FRENCH;
        java.util.Set<java.lang.String> strSet2 = locale1.getUnicodeLocaleKeys();
        java.lang.String str3 = locale0.getDisplayVariant(locale1);
        java.lang.String str4 = locale1.toLanguageTag();
        java.lang.String str5 = locale1.getISO3Language();
        java.io.PrintStream printStream7 = new java.io.PrintStream("zh_CN");
        printStream7.println();
        java.io.PrintStream printStream10 = printStream7.append('#');
        printStream7.close();
        byte[] byteArray15 = new byte[] { (byte) 1, (byte) 10, (byte) -1 };
        printStream7.write(byteArray15);
        printStream7.write((int) 'a');
        java.io.PrintStream printStream19 = new java.io.PrintStream((java.io.OutputStream) printStream7);
        printStream19.print(false);
        java.util.Locale locale24 = new java.util.Locale("hi!", "Italy");
        boolean boolean25 = locale24.hasExtensions();
        java.lang.String str26 = locale24.getVariant();
        java.io.PrintWriter printWriter29 = new java.io.PrintWriter("fr");
        java.io.PrintWriter printWriter31 = printWriter29.append(' ');
        java.io.PrintWriter printWriter34 = new java.io.PrintWriter("fr");
        printWriter34.print("it_IT");
        java.util.Locale locale37 = java.util.Locale.ROOT;
        boolean boolean38 = locale37.hasExtensions();
        java.util.Locale locale39 = java.util.Locale.ROOT;
        java.lang.String str40 = locale37.getDisplayName(locale39);
        java.util.Locale locale41 = java.util.Locale.ROOT;
        boolean boolean42 = locale41.hasExtensions();
        java.lang.String str43 = locale37.getDisplayCountry(locale41);
        java.lang.Object[] objArray46 = new java.lang.Object[] {};
        org.apache.commons.math.MathException mathException47 = new org.apache.commons.math.MathException("hi!", objArray46);
        java.io.PrintWriter printWriter48 = printWriter34.printf(locale41, "it_IT", objArray46);
        java.io.PrintWriter printWriter51 = new java.io.PrintWriter("fr");
        printWriter51.print("it_IT");
        java.util.Locale locale55 = java.util.Locale.forLanguageTag("");
        java.lang.Object[] objArray58 = new java.lang.Object[] {};
        org.apache.commons.math.MathException mathException59 = new org.apache.commons.math.MathException("hi!", objArray58);
        java.lang.Throwable[] throwableArray60 = mathException59.getSuppressed();
        java.lang.Throwable[] throwableArray61 = mathException59.getSuppressed();
        java.io.PrintWriter printWriter62 = printWriter51.printf(locale55, "it_IT", (java.lang.Object[]) throwableArray61);
        java.io.PrintWriter printWriter63 = printWriter34.format("it_IT", (java.lang.Object[]) throwableArray61);
        java.io.PrintWriter printWriter64 = printWriter31.format("zh_CN", (java.lang.Object[]) throwableArray61);
        java.io.PrintStream printStream65 = printStream19.format(locale24, "zh_CN", (java.lang.Object[]) throwableArray61);
        boolean boolean66 = locale1.equals((java.lang.Object) printStream65);
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "zh_TW");
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "fr");
        org.junit.Assert.assertNotNull(strSet2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "fr" + "'", str4, "fr");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "fra" + "'", str5, "fra");
        org.junit.Assert.assertNotNull(printStream10);
        org.junit.Assert.assertNotNull(byteArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray15), "[1, 10, -1]");
        org.junit.Assert.assertEquals(locale24.toString(), "hi!_ITALY");
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
        org.junit.Assert.assertNotNull(printWriter31);
        org.junit.Assert.assertNotNull(locale37);
        org.junit.Assert.assertEquals(locale37.toString(), "");
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertNotNull(locale39);
        org.junit.Assert.assertEquals(locale39.toString(), "");
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "" + "'", str40, "");
        org.junit.Assert.assertNotNull(locale41);
        org.junit.Assert.assertEquals(locale41.toString(), "");
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "" + "'", str43, "");
        org.junit.Assert.assertNotNull(objArray46);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray46), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray46), "[]");
        org.junit.Assert.assertNotNull(printWriter48);
        org.junit.Assert.assertNotNull(locale55);
        org.junit.Assert.assertEquals(locale55.toString(), "");
        org.junit.Assert.assertNotNull(objArray58);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray58), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray58), "[]");
        org.junit.Assert.assertNotNull(throwableArray60);
        org.junit.Assert.assertNotNull(throwableArray61);
        org.junit.Assert.assertNotNull(printWriter62);
        org.junit.Assert.assertNotNull(printWriter63);
        org.junit.Assert.assertNotNull(printWriter64);
        org.junit.Assert.assertNotNull(printStream65);
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + false + "'", boolean66 == false);
    }

    @Test
    public void test00399() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00399");
        java.util.Locale.LanguageRange languageRange1 = new java.util.Locale.LanguageRange("en-GB");
        java.util.Locale.LanguageRange languageRange4 = new java.util.Locale.LanguageRange("English", (double) 0);
        java.util.Locale.LanguageRange[] languageRangeArray5 = new java.util.Locale.LanguageRange[] { languageRange1, languageRange4 };
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList6 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean7 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList6, languageRangeArray5);
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap8 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList9 = java.util.Locale.LanguageRange.mapEquivalents((java.util.List<java.util.Locale.LanguageRange>) languageRangeList6, strMap8);
        java.util.Locale.LanguageRange[] languageRangeArray10 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList11 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean12 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList11, languageRangeArray10);
        java.util.Collection<java.util.Locale> localeCollection13 = null;
        java.util.Locale locale14 = java.util.Locale.lookup((java.util.List<java.util.Locale.LanguageRange>) languageRangeList11, localeCollection13);
        java.lang.String[] strArray20 = new java.lang.String[] { "hi!", "", "it_IT", "Italy", "" };
        java.util.ArrayList<java.lang.String> strList21 = new java.util.ArrayList<java.lang.String>();
        boolean boolean22 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList21, strArray20);
        java.util.List<java.lang.String> strList23 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList11, (java.util.Collection<java.lang.String>) strList21);
        java.util.List<java.lang.String> strList24 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList6, (java.util.Collection<java.lang.String>) strList23);
        java.util.Locale.LanguageRange[] languageRangeArray25 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList26 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean27 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList26, languageRangeArray25);
        java.lang.String[] strArray33 = new java.lang.String[] { "fr", "", "Italy", "", "fr" };
        java.util.ArrayList<java.lang.String> strList34 = new java.util.ArrayList<java.lang.String>();
        boolean boolean35 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList34, strArray33);
        java.util.List<java.lang.String> strList36 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList26, (java.util.Collection<java.lang.String>) strList34);
        java.util.Locale.LanguageRange[] languageRangeArray37 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList38 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean39 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList38, languageRangeArray37);
        java.util.Collection<java.util.Locale> localeCollection40 = null;
        java.util.Locale locale41 = java.util.Locale.lookup((java.util.List<java.util.Locale.LanguageRange>) languageRangeList38, localeCollection40);
        java.lang.String[] strArray43 = new java.lang.String[] { "hi!" };
        java.util.ArrayList<java.lang.String> strList44 = new java.util.ArrayList<java.lang.String>();
        boolean boolean45 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList44, strArray43);
        java.lang.String str46 = java.util.Locale.lookupTag((java.util.List<java.util.Locale.LanguageRange>) languageRangeList38, (java.util.Collection<java.lang.String>) strList44);
        java.util.Locale locale47 = java.util.Locale.ROOT;
        boolean boolean48 = locale47.hasExtensions();
        java.lang.String str49 = locale47.getCountry();
        java.util.Locale locale50 = java.util.Locale.JAPAN;
        java.util.Locale locale51 = java.util.Locale.FRENCH;
        java.util.Locale locale55 = new java.util.Locale("", "", "");
        java.util.Locale[] localeArray56 = new java.util.Locale[] { locale47, locale50, locale51, locale55 };
        java.util.ArrayList<java.util.Locale> localeList57 = new java.util.ArrayList<java.util.Locale>();
        boolean boolean58 = java.util.Collections.addAll((java.util.Collection<java.util.Locale>) localeList57, localeArray56);
        java.util.List<java.util.Locale> localeList59 = java.util.Locale.filter((java.util.List<java.util.Locale.LanguageRange>) languageRangeList38, (java.util.Collection<java.util.Locale>) localeList57);
        java.util.Locale.LanguageRange[] languageRangeArray60 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList61 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean62 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList61, languageRangeArray60);
        java.util.Collection<java.util.Locale> localeCollection63 = null;
        java.util.Locale locale64 = java.util.Locale.lookup((java.util.List<java.util.Locale.LanguageRange>) languageRangeList61, localeCollection63);
        java.lang.String[] strArray66 = new java.lang.String[] { "hi!" };
        java.util.ArrayList<java.lang.String> strList67 = new java.util.ArrayList<java.lang.String>();
        boolean boolean68 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList67, strArray66);
        java.lang.String str69 = java.util.Locale.lookupTag((java.util.List<java.util.Locale.LanguageRange>) languageRangeList61, (java.util.Collection<java.lang.String>) strList67);
        java.util.Locale locale70 = java.util.Locale.ROOT;
        boolean boolean71 = locale70.hasExtensions();
        java.lang.String str72 = locale70.getCountry();
        java.util.Locale locale73 = java.util.Locale.JAPAN;
        java.util.Locale locale74 = java.util.Locale.FRENCH;
        java.util.Locale locale78 = new java.util.Locale("", "", "");
        java.util.Locale[] localeArray79 = new java.util.Locale[] { locale70, locale73, locale74, locale78 };
        java.util.ArrayList<java.util.Locale> localeList80 = new java.util.ArrayList<java.util.Locale>();
        boolean boolean81 = java.util.Collections.addAll((java.util.Collection<java.util.Locale>) localeList80, localeArray79);
        java.util.List<java.util.Locale> localeList82 = java.util.Locale.filter((java.util.List<java.util.Locale.LanguageRange>) languageRangeList61, (java.util.Collection<java.util.Locale>) localeList80);
        java.util.List<java.util.Locale> localeList83 = java.util.Locale.filter((java.util.List<java.util.Locale.LanguageRange>) languageRangeList38, (java.util.Collection<java.util.Locale>) localeList82);
        java.util.Locale locale84 = java.util.Locale.lookup((java.util.List<java.util.Locale.LanguageRange>) languageRangeList26, (java.util.Collection<java.util.Locale>) localeList82);
        java.util.Locale locale85 = java.util.Locale.lookup((java.util.List<java.util.Locale.LanguageRange>) languageRangeList6, (java.util.Collection<java.util.Locale>) localeList82);
        org.junit.Assert.assertNotNull(languageRangeArray5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(languageRangeList9);
        org.junit.Assert.assertNotNull(languageRangeArray10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNull(locale14);
        org.junit.Assert.assertNotNull(strArray20);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertNotNull(strList23);
        org.junit.Assert.assertNotNull(strList24);
        org.junit.Assert.assertNotNull(languageRangeArray25);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(strArray33);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
        org.junit.Assert.assertNotNull(strList36);
        org.junit.Assert.assertNotNull(languageRangeArray37);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertNull(locale41);
        org.junit.Assert.assertNotNull(strArray43);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + true + "'", boolean45 == true);
        org.junit.Assert.assertNull(str46);
        org.junit.Assert.assertNotNull(locale47);
        org.junit.Assert.assertEquals(locale47.toString(), "");
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertEquals("'" + str49 + "' != '" + "" + "'", str49, "");
        org.junit.Assert.assertNotNull(locale50);
        org.junit.Assert.assertEquals(locale50.toString(), "ja_JP");
        org.junit.Assert.assertNotNull(locale51);
        org.junit.Assert.assertEquals(locale51.toString(), "fr");
        org.junit.Assert.assertEquals(locale55.toString(), "");
        org.junit.Assert.assertNotNull(localeArray56);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + true + "'", boolean58 == true);
        org.junit.Assert.assertNotNull(localeList59);
        org.junit.Assert.assertNotNull(languageRangeArray60);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + false + "'", boolean62 == false);
        org.junit.Assert.assertNull(locale64);
        org.junit.Assert.assertNotNull(strArray66);
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + true + "'", boolean68 == true);
        org.junit.Assert.assertNull(str69);
        org.junit.Assert.assertNotNull(locale70);
        org.junit.Assert.assertEquals(locale70.toString(), "");
        org.junit.Assert.assertTrue("'" + boolean71 + "' != '" + false + "'", boolean71 == false);
        org.junit.Assert.assertEquals("'" + str72 + "' != '" + "" + "'", str72, "");
        org.junit.Assert.assertNotNull(locale73);
        org.junit.Assert.assertEquals(locale73.toString(), "ja_JP");
        org.junit.Assert.assertNotNull(locale74);
        org.junit.Assert.assertEquals(locale74.toString(), "fr");
        org.junit.Assert.assertEquals(locale78.toString(), "");
        org.junit.Assert.assertNotNull(localeArray79);
        org.junit.Assert.assertTrue("'" + boolean81 + "' != '" + true + "'", boolean81 == true);
        org.junit.Assert.assertNotNull(localeList82);
        org.junit.Assert.assertNotNull(localeList83);
        org.junit.Assert.assertNull(locale84);
        org.junit.Assert.assertNull(locale85);
    }

    @Test
    public void test00400() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00400");
        java.io.File file0 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.io.PrintWriter printWriter2 = new java.io.PrintWriter(file0, "Chinesisch (Taiwan)");
            org.junit.Assert.fail("Expected exception of type java.io.UnsupportedEncodingException; message: Chinesisch (Taiwan)");
        } catch (java.io.UnsupportedEncodingException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00401() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00401");
        // The following exception was thrown during execution in test generation
        try {
            java.io.PrintStream printStream2 = new java.io.PrintStream("Chinese (Taiwan)", "\u65e5\u672c\u8a9e");
            org.junit.Assert.fail("Expected exception of type java.io.UnsupportedEncodingException; message: ???");
        } catch (java.io.UnsupportedEncodingException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00402() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00402");
        java.io.PrintStream printStream1 = new java.io.PrintStream("zh_CN");
        printStream1.print((float) (byte) -1);
        java.io.PrintWriter printWriter5 = new java.io.PrintWriter("fr");
        printWriter5.print("it_IT");
        java.lang.Object[] objArray9 = new java.lang.Object[] {};
        java.io.PrintWriter printWriter10 = printWriter5.printf("fr", objArray9);
        printWriter5.println((float) 'u');
        printStream1.print((java.lang.Object) 'u');
        printStream1.println(0L);
        java.io.PrintStream printStream17 = printStream1.append((java.lang.CharSequence) "und");
        java.io.PrintStream printStream19 = new java.io.PrintStream((java.io.OutputStream) printStream17, false);
        // The following exception was thrown during execution in test generation
        try {
            java.io.PrintStream printStream22 = new java.io.PrintStream((java.io.OutputStream) printStream17, false, "hi!");
            org.junit.Assert.fail("Expected exception of type java.io.UnsupportedEncodingException; message: hi!");
        } catch (java.io.UnsupportedEncodingException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray9), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray9), "[]");
        org.junit.Assert.assertNotNull(printWriter10);
        org.junit.Assert.assertNotNull(printStream17);
    }

    @Test
    public void test00403() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00403");
        java.io.PrintStream printStream1 = new java.io.PrintStream("zh_CN");
        printStream1.print((float) (byte) -1);
        printStream1.println();
        printStream1.print("ita");
        java.util.Locale locale7 = java.util.Locale.FRENCH;
        java.util.Set<java.lang.String> strSet8 = locale7.getUnicodeLocaleKeys();
        java.util.Locale locale9 = locale7.stripExtensions();
        java.lang.Object[] objArray12 = new java.lang.Object[] {};
        org.apache.commons.math.MathException mathException13 = new org.apache.commons.math.MathException("hi!", objArray12);
        java.lang.Throwable[] throwableArray14 = mathException13.getSuppressed();
        java.lang.Throwable[] throwableArray15 = mathException13.getSuppressed();
        java.io.PrintStream printStream16 = printStream1.printf(locale9, "fr", (java.lang.Object[]) throwableArray15);
        java.io.PrintStream printStream18 = new java.io.PrintStream("zh_CN");
        printStream18.print((float) (byte) -1);
        char[] charArray23 = new char[] { 'x', 'u' };
        printStream18.println(charArray23);
        printStream18.println(0);
        byte[] byteArray31 = new byte[] { (byte) 0, (byte) 100, (byte) 0, (byte) 10 };
        printStream18.write(byteArray31);
        printStream16.write(byteArray31);
        java.io.PrintStream printStream35 = new java.io.PrintStream((java.io.OutputStream) printStream16, true);
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl39 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl((int) 'u', (int) (byte) 1, (int) '#');
        int int40 = hypergeometricDistributionImpl39.getPopulationSize();
        double double42 = hypergeometricDistributionImpl39.cumulativeProbability((int) (short) 100);
        int int43 = hypergeometricDistributionImpl39.getPopulationSize();
        double double46 = hypergeometricDistributionImpl39.cumulativeProbability(0, (int) 'a');
        hypergeometricDistributionImpl39.setSampleSize((int) 'a');
        double double50 = hypergeometricDistributionImpl39.probability((int) '4');
        hypergeometricDistributionImpl39.setPopulationSize(1);
        printStream35.println((java.lang.Object) hypergeometricDistributionImpl39);
        int int54 = hypergeometricDistributionImpl39.getPopulationSize();
        // The following exception was thrown during execution in test generation
        try {
            double double57 = hypergeometricDistributionImpl39.cumulativeProbability((double) 'x', 0.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: lower endpoint must be less than or equal to upper endpoint");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(locale7);
        org.junit.Assert.assertEquals(locale7.toString(), "fr");
        org.junit.Assert.assertNotNull(strSet8);
        org.junit.Assert.assertNotNull(locale9);
        org.junit.Assert.assertEquals(locale9.toString(), "fr");
        org.junit.Assert.assertNotNull(objArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray12), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray12), "[]");
        org.junit.Assert.assertNotNull(throwableArray14);
        org.junit.Assert.assertNotNull(throwableArray15);
        org.junit.Assert.assertNotNull(printStream16);
        org.junit.Assert.assertNotNull(charArray23);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray23), "xu");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray23), "xu");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray23), "[x, u]");
        org.junit.Assert.assertNotNull(byteArray31);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray31), "[0, 100, 0, 10]");
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 117 + "'", int40 == 117);
        org.junit.Assert.assertTrue("'" + double42 + "' != '" + 1.0d + "'", double42 == 1.0d);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 117 + "'", int43 == 117);
        org.junit.Assert.assertTrue("'" + double46 + "' != '" + 1.0d + "'", double46 == 1.0d);
        org.junit.Assert.assertTrue("'" + double50 + "' != '" + 0.0d + "'", double50 == 0.0d);
        org.junit.Assert.assertTrue("'" + int54 + "' != '" + 1 + "'", int54 == 1);
    }

    @Test
    public void test00404() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00404");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clearExtensions();
        java.util.Locale locale2 = builder1.build();
        java.util.Locale.Builder builder3 = builder1.clearExtensions();
        java.util.Locale.Builder builder4 = builder3.clear();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder6 = builder3.setRegion("fra");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed region: fra [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "");
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder4);
    }

    @Test
    public void test00405() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00405");
        java.io.PrintStream printStream1 = new java.io.PrintStream("zh_CN");
        printStream1.print((float) (byte) -1);
        printStream1.println();
        printStream1.println();
        java.io.PrintStream printStream7 = new java.io.PrintStream((java.io.OutputStream) printStream1, true);
        printStream1.println();
        java.lang.Throwable throwable9 = null;
        org.apache.commons.math.MathException mathException10 = new org.apache.commons.math.MathException(throwable9);
        org.apache.commons.math.MathException mathException11 = new org.apache.commons.math.MathException((java.lang.Throwable) mathException10);
        java.lang.Throwable[] throwableArray12 = mathException10.getSuppressed();
        printStream1.println((java.lang.Object) throwableArray12);
        printStream1.close();
        printStream1.print((long) (short) 100);
        org.junit.Assert.assertNotNull(throwableArray12);
    }

    @Test
    public void test00406() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00406");
        java.io.PrintWriter printWriter1 = new java.io.PrintWriter("fr");
        printWriter1.print("it_IT");
        java.lang.Object[] objArray5 = new java.lang.Object[] {};
        java.io.PrintWriter printWriter6 = printWriter1.printf("fr", objArray5);
        printWriter6.print((float) (byte) 100);
        java.io.PrintWriter printWriter10 = printWriter6.append((java.lang.CharSequence) "ja");
        java.util.Locale locale14 = new java.util.Locale("", "", "");
        java.util.Locale locale15 = locale14.stripExtensions();
        java.lang.String str16 = locale15.getISO3Country();
        java.io.PrintWriter printWriter20 = new java.io.PrintWriter("fr");
        printWriter20.println();
        java.io.PrintWriter printWriter24 = new java.io.PrintWriter("fr");
        printWriter24.print("it_IT");
        java.util.Locale locale27 = java.util.Locale.ROOT;
        boolean boolean28 = locale27.hasExtensions();
        java.util.Locale locale29 = java.util.Locale.ROOT;
        java.lang.String str30 = locale27.getDisplayName(locale29);
        java.util.Locale locale31 = java.util.Locale.ROOT;
        boolean boolean32 = locale31.hasExtensions();
        java.lang.String str33 = locale27.getDisplayCountry(locale31);
        java.lang.Object[] objArray36 = new java.lang.Object[] {};
        org.apache.commons.math.MathException mathException37 = new org.apache.commons.math.MathException("hi!", objArray36);
        java.io.PrintWriter printWriter38 = printWriter24.printf(locale31, "it_IT", objArray36);
        java.io.PrintWriter printWriter39 = printWriter20.printf("English", objArray36);
        java.io.PrintWriter printWriter41 = new java.io.PrintWriter((java.io.Writer) printWriter20, false);
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl45 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl((int) 'u', (int) (byte) 1, (int) '#');
        int int46 = hypergeometricDistributionImpl45.getPopulationSize();
        double double48 = hypergeometricDistributionImpl45.cumulativeProbability((double) (short) -1);
        double double50 = hypergeometricDistributionImpl45.probability((double) (short) 100);
        double double52 = hypergeometricDistributionImpl45.cumulativeProbability((double) 117);
        printWriter20.print((java.lang.Object) 117);
        java.io.PrintWriter printWriter55 = printWriter20.append('4');
        java.lang.Object[] objArray59 = new java.lang.Object[] {};
        org.apache.commons.math.MathException mathException60 = new org.apache.commons.math.MathException("hi!", objArray59);
        org.apache.commons.math.MathException mathException61 = new org.apache.commons.math.MathException("fr", objArray59);
        java.io.PrintWriter printWriter62 = printWriter55.format("en-GB", objArray59);
        java.lang.Object[] objArray64 = new java.lang.Object[] {};
        org.apache.commons.math.MathException mathException65 = new org.apache.commons.math.MathException("hi!", objArray64);
        java.lang.Object[] objArray66 = mathException65.getArguments();
        java.lang.Object[] objArray68 = new java.lang.Object[] {};
        org.apache.commons.math.MathException mathException69 = new org.apache.commons.math.MathException("hi!", objArray68);
        java.lang.Throwable[] throwableArray70 = mathException69.getSuppressed();
        mathException65.addSuppressed((java.lang.Throwable) mathException69);
        org.apache.commons.math.MathException mathException72 = new org.apache.commons.math.MathException((java.lang.Throwable) mathException69);
        org.apache.commons.math.MathException mathException73 = new org.apache.commons.math.MathException("chinois", objArray59, (java.lang.Throwable) mathException69);
        java.io.PrintWriter printWriter74 = printWriter6.printf(locale15, "ita", objArray59);
        // The following exception was thrown during execution in test generation
        try {
            java.io.PrintWriter printWriter78 = printWriter6.append((java.lang.CharSequence) "Italy", (int) 'x', 97);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 97");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray5), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray5), "[]");
        org.junit.Assert.assertNotNull(printWriter6);
        org.junit.Assert.assertNotNull(printWriter10);
        org.junit.Assert.assertEquals(locale14.toString(), "");
        org.junit.Assert.assertNotNull(locale15);
        org.junit.Assert.assertEquals(locale15.toString(), "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertNotNull(locale27);
        org.junit.Assert.assertEquals(locale27.toString(), "");
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNotNull(locale29);
        org.junit.Assert.assertEquals(locale29.toString(), "");
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "" + "'", str30, "");
        org.junit.Assert.assertNotNull(locale31);
        org.junit.Assert.assertEquals(locale31.toString(), "");
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "" + "'", str33, "");
        org.junit.Assert.assertNotNull(objArray36);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray36), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray36), "[]");
        org.junit.Assert.assertNotNull(printWriter38);
        org.junit.Assert.assertNotNull(printWriter39);
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + 117 + "'", int46 == 117);
        org.junit.Assert.assertTrue("'" + double48 + "' != '" + 0.0d + "'", double48 == 0.0d);
        org.junit.Assert.assertTrue("'" + double50 + "' != '" + 0.0d + "'", double50 == 0.0d);
        org.junit.Assert.assertTrue("'" + double52 + "' != '" + 1.0d + "'", double52 == 1.0d);
        org.junit.Assert.assertNotNull(printWriter55);
        org.junit.Assert.assertNotNull(objArray59);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray59), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray59), "[]");
        org.junit.Assert.assertNotNull(printWriter62);
        org.junit.Assert.assertNotNull(objArray64);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray64), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray64), "[]");
        org.junit.Assert.assertNotNull(objArray66);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray66), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray66), "[]");
        org.junit.Assert.assertNotNull(objArray68);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray68), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray68), "[]");
        org.junit.Assert.assertNotNull(throwableArray70);
        org.junit.Assert.assertNotNull(printWriter74);
    }

    @Test
    public void test00407() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00407");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl((int) 'u', (int) (byte) 1, (int) '#');
        int int4 = hypergeometricDistributionImpl3.getPopulationSize();
        double double6 = hypergeometricDistributionImpl3.cumulativeProbability((int) (short) 100);
        int int7 = hypergeometricDistributionImpl3.getPopulationSize();
        double double10 = hypergeometricDistributionImpl3.cumulativeProbability(0, (int) 'a');
        hypergeometricDistributionImpl3.setSampleSize((int) 'a');
        double double14 = hypergeometricDistributionImpl3.probability((int) '4');
        int int15 = hypergeometricDistributionImpl3.getNumberOfSuccesses();
        // The following exception was thrown during execution in test generation
        try {
            int int17 = hypergeometricDistributionImpl3.inverseCumulativeProbability((double) 10L);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: p must be between 0 and 1.0 (inclusive)");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 117 + "'", int4 == 117);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0d + "'", double6 == 1.0d);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 117 + "'", int7 == 117);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 1.0d + "'", double10 == 1.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
    }

    @Test
    public void test00408() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00408");
        java.io.PrintWriter printWriter1 = new java.io.PrintWriter("fr");
        printWriter1.print("it_IT");
        java.util.Locale locale4 = java.util.Locale.ROOT;
        boolean boolean5 = locale4.hasExtensions();
        java.util.Locale locale6 = java.util.Locale.ROOT;
        java.lang.String str7 = locale4.getDisplayName(locale6);
        java.util.Locale locale8 = java.util.Locale.ROOT;
        boolean boolean9 = locale8.hasExtensions();
        java.lang.String str10 = locale4.getDisplayCountry(locale8);
        java.lang.Object[] objArray13 = new java.lang.Object[] {};
        org.apache.commons.math.MathException mathException14 = new org.apache.commons.math.MathException("hi!", objArray13);
        java.io.PrintWriter printWriter15 = printWriter1.printf(locale8, "it_IT", objArray13);
        printWriter1.println();
        printWriter1.print(10);
        java.io.PrintWriter printWriter22 = printWriter1.append((java.lang.CharSequence) "fr", (int) (short) 0, (int) (byte) 1);
        java.io.PrintWriter printWriter24 = new java.io.PrintWriter((java.io.Writer) printWriter1, true);
        printWriter1.println(false);
        java.io.PrintWriter printWriter30 = printWriter1.append((java.lang.CharSequence) "Italy", 0, 0);
        printWriter1.write("hi!");
        printWriter1.println();
        printWriter1.print((long) 'x');
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(locale6);
        org.junit.Assert.assertEquals(locale6.toString(), "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(locale8);
        org.junit.Assert.assertEquals(locale8.toString(), "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(objArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray13), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray13), "[]");
        org.junit.Assert.assertNotNull(printWriter15);
        org.junit.Assert.assertNotNull(printWriter22);
        org.junit.Assert.assertNotNull(printWriter30);
    }

    @Test
    public void test00409() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00409");
        java.io.PrintWriter printWriter1 = new java.io.PrintWriter("fr");
        java.io.PrintWriter printWriter3 = new java.io.PrintWriter("fr");
        printWriter3.print("it_IT");
        java.util.Locale locale7 = java.util.Locale.forLanguageTag("");
        java.lang.Object[] objArray10 = new java.lang.Object[] {};
        org.apache.commons.math.MathException mathException11 = new org.apache.commons.math.MathException("hi!", objArray10);
        java.lang.Throwable[] throwableArray12 = mathException11.getSuppressed();
        java.lang.Throwable[] throwableArray13 = mathException11.getSuppressed();
        java.io.PrintWriter printWriter14 = printWriter3.printf(locale7, "it_IT", (java.lang.Object[]) throwableArray13);
        java.io.PrintWriter printWriter17 = new java.io.PrintWriter("fr");
        printWriter17.print("it_IT");
        java.util.Locale locale20 = java.util.Locale.ROOT;
        boolean boolean21 = locale20.hasExtensions();
        java.util.Locale locale22 = java.util.Locale.ROOT;
        java.lang.String str23 = locale20.getDisplayName(locale22);
        java.util.Locale locale24 = java.util.Locale.ROOT;
        boolean boolean25 = locale24.hasExtensions();
        java.lang.String str26 = locale20.getDisplayCountry(locale24);
        java.lang.Object[] objArray29 = new java.lang.Object[] {};
        org.apache.commons.math.MathException mathException30 = new org.apache.commons.math.MathException("hi!", objArray29);
        java.io.PrintWriter printWriter31 = printWriter17.printf(locale24, "it_IT", objArray29);
        java.io.PrintWriter printWriter32 = printWriter1.printf(locale7, "fr", objArray29);
        java.lang.String str33 = locale7.getDisplayName();
        boolean boolean34 = locale7.hasExtensions();
        org.junit.Assert.assertNotNull(locale7);
        org.junit.Assert.assertEquals(locale7.toString(), "");
        org.junit.Assert.assertNotNull(objArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray10), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray10), "[]");
        org.junit.Assert.assertNotNull(throwableArray12);
        org.junit.Assert.assertNotNull(throwableArray13);
        org.junit.Assert.assertNotNull(printWriter14);
        org.junit.Assert.assertNotNull(locale20);
        org.junit.Assert.assertEquals(locale20.toString(), "");
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(locale22);
        org.junit.Assert.assertEquals(locale22.toString(), "");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertNotNull(locale24);
        org.junit.Assert.assertEquals(locale24.toString(), "");
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
        org.junit.Assert.assertNotNull(objArray29);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray29), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray29), "[]");
        org.junit.Assert.assertNotNull(printWriter31);
        org.junit.Assert.assertNotNull(printWriter32);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "" + "'", str33, "");
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
    }

    @Test
    public void test00410() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00410");
        java.util.Locale locale0 = java.util.Locale.ROOT;
        boolean boolean1 = locale0.hasExtensions();
        java.lang.String str2 = locale0.getCountry();
        java.lang.String str3 = locale0.getDisplayLanguage();
        java.lang.String str4 = locale0.getVariant();
        java.lang.Class<?> wildcardClass5 = locale0.getClass();
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test00411() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00411");
        java.io.PrintStream printStream1 = new java.io.PrintStream("zh_CN");
        printStream1.print((float) (byte) -1);
        java.io.PrintWriter printWriter5 = new java.io.PrintWriter("fr");
        printWriter5.print("it_IT");
        java.lang.Object[] objArray9 = new java.lang.Object[] {};
        java.io.PrintWriter printWriter10 = printWriter5.printf("fr", objArray9);
        printWriter5.println((float) 'u');
        printStream1.print((java.lang.Object) 'u');
        printStream1.println(false);
        printStream1.println(0L);
        java.io.PrintWriter printWriter19 = new java.io.PrintWriter((java.io.OutputStream) printStream1, true);
        java.io.PrintWriter printWriter20 = new java.io.PrintWriter((java.io.OutputStream) printStream1);
        // The following exception was thrown during execution in test generation
        try {
            java.io.PrintStream printStream23 = new java.io.PrintStream((java.io.OutputStream) printStream1, false, "China");
            org.junit.Assert.fail("Expected exception of type java.io.UnsupportedEncodingException; message: China");
        } catch (java.io.UnsupportedEncodingException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray9), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray9), "[]");
        org.junit.Assert.assertNotNull(printWriter10);
    }

    @Test
    public void test00412() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00412");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clearExtensions();
        java.util.Locale.Builder builder3 = builder0.setScript("");
        java.util.Locale.Builder builder5 = builder3.removeUnicodeLocaleAttribute("Italy");
        java.util.Locale.Builder builder7 = builder3.setRegion("ja");
        java.util.Locale.Builder builder10 = builder7.setExtension('a', "italien");
        java.util.Locale.Builder builder12 = builder7.setLanguage("jpn");
        java.util.Locale.Builder builder14 = builder12.setLanguage("");
        java.util.Locale.Builder builder15 = builder14.clear();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder17 = builder15.setRegion("Italy");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed region: Italy [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(builder12);
        org.junit.Assert.assertNotNull(builder14);
        org.junit.Assert.assertNotNull(builder15);
    }

    @Test
    public void test00413() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00413");
        java.io.PrintWriter printWriter1 = new java.io.PrintWriter("fr");
        printWriter1.print("it_IT");
        java.util.Locale locale5 = java.util.Locale.forLanguageTag("");
        java.lang.Object[] objArray8 = new java.lang.Object[] {};
        org.apache.commons.math.MathException mathException9 = new org.apache.commons.math.MathException("hi!", objArray8);
        java.lang.Throwable[] throwableArray10 = mathException9.getSuppressed();
        java.lang.Throwable[] throwableArray11 = mathException9.getSuppressed();
        java.io.PrintWriter printWriter12 = printWriter1.printf(locale5, "it_IT", (java.lang.Object[]) throwableArray11);
        printWriter1.println((float) (byte) 10);
        printWriter1.print(true);
        java.util.Locale locale17 = java.util.Locale.JAPANESE;
        java.util.Locale locale18 = java.util.Locale.JAPANESE;
        java.lang.String str19 = locale17.getDisplayCountry(locale18);
        java.lang.String str20 = locale17.getVariant();
        java.util.Locale locale21 = java.util.Locale.CANADA;
        java.lang.String str22 = locale17.getDisplayScript(locale21);
        java.io.PrintWriter printWriter25 = new java.io.PrintWriter("fr");
        printWriter25.write("hi!");
        printWriter25.println((java.lang.Object) (-1L));
        java.util.Locale locale30 = java.util.Locale.ITALY;
        java.lang.String str31 = locale30.getDisplayName();
        java.lang.Object[] objArray34 = new java.lang.Object[] {};
        org.apache.commons.math.MathException mathException35 = new org.apache.commons.math.MathException("hi!", objArray34);
        java.lang.Object[] objArray36 = mathException35.getArguments();
        java.io.PrintWriter printWriter37 = printWriter25.format(locale30, "anglais", objArray36);
        java.io.PrintWriter printWriter38 = printWriter1.format(locale21, "Italy", objArray36);
        java.lang.String str39 = locale21.getDisplayLanguage();
        java.lang.String str40 = locale21.getCountry();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str42 = locale21.getUnicodeLocaleType("allemand (Allemagne)");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Ill-formed Unicode locale key: allemand (Allemagne)");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(locale5);
        org.junit.Assert.assertEquals(locale5.toString(), "");
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray8), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray8), "[]");
        org.junit.Assert.assertNotNull(throwableArray10);
        org.junit.Assert.assertNotNull(throwableArray11);
        org.junit.Assert.assertNotNull(printWriter12);
        org.junit.Assert.assertNotNull(locale17);
        org.junit.Assert.assertEquals(locale17.toString(), "ja");
        org.junit.Assert.assertNotNull(locale18);
        org.junit.Assert.assertEquals(locale18.toString(), "ja");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertNotNull(locale21);
        org.junit.Assert.assertEquals(locale21.toString(), "en_CA");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertNotNull(locale30);
        org.junit.Assert.assertEquals(locale30.toString(), "it_IT");
// flaky:         org.junit.Assert.assertEquals("'" + str31 + "' != '" + "\u30a4\u30bf\u30ea\u30a2\u8a9e\u30a4\u30bf\u30ea\u30a2)" + "'", str31, "\u30a4\u30bf\u30ea\u30a2\u8a9e\u30a4\u30bf\u30ea\u30a2)");
        org.junit.Assert.assertNotNull(objArray34);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray34), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray34), "[]");
        org.junit.Assert.assertNotNull(objArray36);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray36), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray36), "[]");
        org.junit.Assert.assertNotNull(printWriter37);
        org.junit.Assert.assertNotNull(printWriter38);
// flaky:         org.junit.Assert.assertEquals("'" + str39 + "' != '" + "\u82f1\u8a9e" + "'", str39, "\u82f1\u8a9e");
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "CA" + "'", str40, "CA");
    }

    @Test
    public void test00414() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00414");
        java.io.PrintStream printStream1 = new java.io.PrintStream("zh_CN");
        printStream1.print((float) (byte) -1);
        printStream1.println();
        printStream1.println();
        java.io.PrintStream printStream7 = new java.io.PrintStream((java.io.OutputStream) printStream1, true);
        java.io.PrintWriter printWriter9 = new java.io.PrintWriter("fr");
        printWriter9.print("it_IT");
        java.util.Locale locale12 = java.util.Locale.ROOT;
        boolean boolean13 = locale12.hasExtensions();
        java.util.Locale locale14 = java.util.Locale.ROOT;
        java.lang.String str15 = locale12.getDisplayName(locale14);
        java.util.Locale locale16 = java.util.Locale.ROOT;
        boolean boolean17 = locale16.hasExtensions();
        java.lang.String str18 = locale12.getDisplayCountry(locale16);
        java.lang.Object[] objArray21 = new java.lang.Object[] {};
        org.apache.commons.math.MathException mathException22 = new org.apache.commons.math.MathException("hi!", objArray21);
        java.io.PrintWriter printWriter23 = printWriter9.printf(locale16, "it_IT", objArray21);
        printStream7.println((java.lang.Object) "it_IT");
        printStream7.print((float) (byte) 1);
        printStream7.print('u');
        // The following exception was thrown during execution in test generation
        try {
            java.io.PrintStream printStream32 = printStream7.append((java.lang.CharSequence) "eng", (int) 'u', (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 10");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(locale12);
        org.junit.Assert.assertEquals(locale12.toString(), "");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(locale14);
        org.junit.Assert.assertEquals(locale14.toString(), "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertNotNull(locale16);
        org.junit.Assert.assertEquals(locale16.toString(), "");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertNotNull(objArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray21), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray21), "[]");
        org.junit.Assert.assertNotNull(printWriter23);
    }

    @Test
    public void test00415() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00415");
        java.util.Locale.LanguageRange languageRange2 = new java.util.Locale.LanguageRange("English", (double) 0);
        java.lang.String str3 = languageRange2.getRange();
        double double4 = languageRange2.getWeight();
        boolean boolean6 = languageRange2.equals((java.lang.Object) (-1.0d));
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "english" + "'", str3, "english");
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test00416() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00416");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clearExtensions();
        java.util.Locale.Builder builder3 = builder0.setScript("");
        java.util.Locale.Builder builder5 = builder3.removeUnicodeLocaleAttribute("Italy");
        java.util.Locale.Builder builder7 = builder3.setRegion("ja");
        java.util.Locale.Builder builder10 = builder7.setExtension('a', "italien");
        java.util.Locale.Builder builder12 = builder7.setLanguage("jpn");
        java.util.Locale.Builder builder14 = builder12.setLanguage("");
        java.util.Locale.Builder builder15 = builder14.clear();
        java.util.Locale locale16 = builder14.build();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder18 = builder14.setVariant("Chinese (Taiwan)");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed variant: Chinese (Taiwan) [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(builder12);
        org.junit.Assert.assertNotNull(builder14);
        org.junit.Assert.assertNotNull(builder15);
        org.junit.Assert.assertNotNull(locale16);
        org.junit.Assert.assertEquals(locale16.toString(), "");
    }

    @Test
    public void test00417() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00417");
        java.io.PrintStream printStream1 = new java.io.PrintStream("zh_CN");
        printStream1.println();
        java.io.PrintStream printStream4 = printStream1.append('#');
        printStream1.close();
        printStream1.print((float) 'u');
        printStream1.println(35);
        printStream1.println(0.0d);
        java.io.PrintStream printStream13 = new java.io.PrintStream("zh_CN");
        printStream13.println();
        java.io.PrintStream printStream16 = printStream13.append('#');
        printStream13.close();
        byte[] byteArray22 = new byte[] { (byte) -1, (byte) 100, (byte) -1, (byte) -1 };
        printStream13.write(byteArray22);
        printStream1.write(byteArray22);
        java.io.PrintStream printStream25 = new java.io.PrintStream((java.io.OutputStream) printStream1);
        // The following exception was thrown during execution in test generation
        try {
            java.io.PrintStream printStream29 = printStream25.append((java.lang.CharSequence) "allemand", (-1), 117);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: -1");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(printStream4);
        org.junit.Assert.assertNotNull(printStream16);
        org.junit.Assert.assertNotNull(byteArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray22), "[-1, 100, -1, -1]");
    }

    @Test
    public void test00418() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00418");
        java.io.PrintStream printStream1 = new java.io.PrintStream("zh_CN");
        printStream1.print((float) (byte) -1);
        printStream1.println();
        printStream1.println();
        java.io.PrintStream printStream7 = new java.io.PrintStream((java.io.OutputStream) printStream1, true);
        java.io.PrintWriter printWriter9 = new java.io.PrintWriter("fr");
        printWriter9.print("it_IT");
        java.util.Locale locale12 = java.util.Locale.ROOT;
        boolean boolean13 = locale12.hasExtensions();
        java.util.Locale locale14 = java.util.Locale.ROOT;
        java.lang.String str15 = locale12.getDisplayName(locale14);
        java.util.Locale locale16 = java.util.Locale.ROOT;
        boolean boolean17 = locale16.hasExtensions();
        java.lang.String str18 = locale12.getDisplayCountry(locale16);
        java.lang.Object[] objArray21 = new java.lang.Object[] {};
        org.apache.commons.math.MathException mathException22 = new org.apache.commons.math.MathException("hi!", objArray21);
        java.io.PrintWriter printWriter23 = printWriter9.printf(locale16, "it_IT", objArray21);
        printStream7.println((java.lang.Object) "it_IT");
        java.io.PrintStream printStream26 = printStream7.append((java.lang.CharSequence) "fr");
        printStream26.println((float) 117);
        java.util.Locale locale29 = java.util.Locale.JAPANESE;
        java.util.Locale locale30 = java.util.Locale.JAPANESE;
        java.lang.String str31 = locale29.getDisplayCountry(locale30);
        java.lang.String str32 = locale29.getVariant();
        java.util.Locale locale33 = java.util.Locale.CANADA;
        java.lang.String str34 = locale29.getDisplayScript(locale33);
        java.io.PrintWriter printWriter37 = new java.io.PrintWriter("fr");
        printWriter37.print("it_IT");
        java.util.Locale locale40 = java.util.Locale.ROOT;
        boolean boolean41 = locale40.hasExtensions();
        java.util.Locale locale42 = java.util.Locale.ROOT;
        java.lang.String str43 = locale40.getDisplayName(locale42);
        java.util.Locale locale44 = java.util.Locale.ROOT;
        boolean boolean45 = locale44.hasExtensions();
        java.lang.String str46 = locale40.getDisplayCountry(locale44);
        java.lang.Object[] objArray49 = new java.lang.Object[] {};
        org.apache.commons.math.MathException mathException50 = new org.apache.commons.math.MathException("hi!", objArray49);
        java.io.PrintWriter printWriter51 = printWriter37.printf(locale44, "it_IT", objArray49);
        java.io.PrintWriter printWriter54 = new java.io.PrintWriter("fr");
        printWriter54.print("it_IT");
        java.util.Locale locale58 = java.util.Locale.forLanguageTag("");
        java.lang.Object[] objArray61 = new java.lang.Object[] {};
        org.apache.commons.math.MathException mathException62 = new org.apache.commons.math.MathException("hi!", objArray61);
        java.lang.Throwable[] throwableArray63 = mathException62.getSuppressed();
        java.lang.Throwable[] throwableArray64 = mathException62.getSuppressed();
        java.io.PrintWriter printWriter65 = printWriter54.printf(locale58, "it_IT", (java.lang.Object[]) throwableArray64);
        java.io.PrintWriter printWriter66 = printWriter37.format("it_IT", (java.lang.Object[]) throwableArray64);
        java.io.PrintStream printStream67 = printStream26.format(locale33, "italien (Italie)", (java.lang.Object[]) throwableArray64);
        java.io.PrintStream printStream69 = new java.io.PrintStream("zh_CN");
        printStream69.print((float) (byte) -1);
        char[] charArray74 = new char[] { 'x', 'u' };
        printStream69.println(charArray74);
        printStream67.print(charArray74);
        org.junit.Assert.assertNotNull(locale12);
        org.junit.Assert.assertEquals(locale12.toString(), "");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(locale14);
        org.junit.Assert.assertEquals(locale14.toString(), "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertNotNull(locale16);
        org.junit.Assert.assertEquals(locale16.toString(), "");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertNotNull(objArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray21), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray21), "[]");
        org.junit.Assert.assertNotNull(printWriter23);
        org.junit.Assert.assertNotNull(printStream26);
        org.junit.Assert.assertNotNull(locale29);
        org.junit.Assert.assertEquals(locale29.toString(), "ja");
        org.junit.Assert.assertNotNull(locale30);
        org.junit.Assert.assertEquals(locale30.toString(), "ja");
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "" + "'", str31, "");
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "" + "'", str32, "");
        org.junit.Assert.assertNotNull(locale33);
        org.junit.Assert.assertEquals(locale33.toString(), "en_CA");
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "" + "'", str34, "");
        org.junit.Assert.assertNotNull(locale40);
        org.junit.Assert.assertEquals(locale40.toString(), "");
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertNotNull(locale42);
        org.junit.Assert.assertEquals(locale42.toString(), "");
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "" + "'", str43, "");
        org.junit.Assert.assertNotNull(locale44);
        org.junit.Assert.assertEquals(locale44.toString(), "");
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertEquals("'" + str46 + "' != '" + "" + "'", str46, "");
        org.junit.Assert.assertNotNull(objArray49);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray49), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray49), "[]");
        org.junit.Assert.assertNotNull(printWriter51);
        org.junit.Assert.assertNotNull(locale58);
        org.junit.Assert.assertEquals(locale58.toString(), "");
        org.junit.Assert.assertNotNull(objArray61);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray61), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray61), "[]");
        org.junit.Assert.assertNotNull(throwableArray63);
        org.junit.Assert.assertNotNull(throwableArray64);
        org.junit.Assert.assertNotNull(printWriter65);
        org.junit.Assert.assertNotNull(printWriter66);
        org.junit.Assert.assertNotNull(printStream67);
        org.junit.Assert.assertNotNull(charArray74);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray74), "xu");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray74), "xu");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray74), "[x, u]");
    }

    @Test
    public void test00419() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00419");
        java.io.PrintWriter printWriter1 = new java.io.PrintWriter("fr");
        printWriter1.println();
        char[] charArray3 = null;
        // The following exception was thrown during execution in test generation
        try {
            printWriter1.print(charArray3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00420() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00420");
        java.io.PrintStream printStream1 = new java.io.PrintStream("zh_CN");
        printStream1.println();
        java.io.PrintStream printStream4 = printStream1.append('#');
        printStream1.close();
        printStream1.print((float) 'u');
        printStream1.println(35);
        printStream1.print((int) ' ');
        org.junit.Assert.assertNotNull(printStream4);
    }

    @Test
    public void test00421() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00421");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl((int) 'u', (int) (byte) 1, (int) '#');
        int int4 = hypergeometricDistributionImpl3.getSampleSize();
        int int5 = hypergeometricDistributionImpl3.getPopulationSize();
        double double7 = hypergeometricDistributionImpl3.upperCumulativeProbability((int) '#');
        int int8 = hypergeometricDistributionImpl3.getPopulationSize();
        int int9 = hypergeometricDistributionImpl3.getPopulationSize();
        // The following exception was thrown during execution in test generation
        try {
            int int11 = hypergeometricDistributionImpl3.inverseCumulativeProbability((double) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: p must be between 0 and 1.0 (inclusive)");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 35 + "'", int4 == 35);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 117 + "'", int5 == 117);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 117 + "'", int8 == 117);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 117 + "'", int9 == 117);
    }

    @Test
    public void test00422() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00422");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl((int) 'u', (int) (byte) 1, (int) '#');
        int int4 = hypergeometricDistributionImpl3.getPopulationSize();
        double double6 = hypergeometricDistributionImpl3.cumulativeProbability((int) (short) 100);
        int int7 = hypergeometricDistributionImpl3.getPopulationSize();
        double double10 = hypergeometricDistributionImpl3.cumulativeProbability(0, (int) 'a');
        hypergeometricDistributionImpl3.setSampleSize((int) 'a');
        double double15 = hypergeometricDistributionImpl3.cumulativeProbability(0.2991452991452851d, (double) 97);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 117 + "'", int4 == 117);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0d + "'", double6 == 1.0d);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 117 + "'", int7 == 117);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 1.0d + "'", double10 == 1.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.8290598290598294d + "'", double15 == 0.8290598290598294d);
    }

    @Test
    public void test00423() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00423");
        java.io.PrintStream printStream2 = new java.io.PrintStream("zh_CN");
        printStream2.print((float) (byte) -1);
        printStream2.println();
        printStream2.print("ita");
        java.util.Locale locale8 = java.util.Locale.FRENCH;
        java.util.Set<java.lang.String> strSet9 = locale8.getUnicodeLocaleKeys();
        java.util.Locale locale10 = locale8.stripExtensions();
        java.lang.Object[] objArray13 = new java.lang.Object[] {};
        org.apache.commons.math.MathException mathException14 = new org.apache.commons.math.MathException("hi!", objArray13);
        java.lang.Throwable[] throwableArray15 = mathException14.getSuppressed();
        java.lang.Throwable[] throwableArray16 = mathException14.getSuppressed();
        java.io.PrintStream printStream17 = printStream2.printf(locale10, "fr", (java.lang.Object[]) throwableArray16);
        java.lang.Object[] objArray19 = new java.lang.Object[] {};
        org.apache.commons.math.MathException mathException20 = new org.apache.commons.math.MathException("hi!", objArray19);
        java.lang.Object[] objArray21 = mathException20.getArguments();
        org.apache.commons.math.MathException mathException22 = new org.apache.commons.math.MathException("italien (Italie)", (java.lang.Object[]) throwableArray16, (java.lang.Throwable) mathException20);
        java.lang.Object[] objArray24 = new java.lang.Object[] {};
        org.apache.commons.math.MathException mathException25 = new org.apache.commons.math.MathException("hi!", objArray24);
        java.lang.Object[] objArray26 = mathException25.getArguments();
        mathException20.addSuppressed((java.lang.Throwable) mathException25);
        java.lang.Throwable throwable28 = null;
        org.apache.commons.math.MathException mathException29 = new org.apache.commons.math.MathException(throwable28);
        org.apache.commons.math.MathException mathException30 = new org.apache.commons.math.MathException((java.lang.Throwable) mathException29);
        org.apache.commons.math.MathException mathException31 = new org.apache.commons.math.MathException((java.lang.Throwable) mathException30);
        mathException20.addSuppressed((java.lang.Throwable) mathException31);
        java.lang.Object[] objArray36 = new java.lang.Object[] {};
        org.apache.commons.math.MathException mathException37 = new org.apache.commons.math.MathException("hi!", objArray36);
        java.lang.Object[] objArray38 = mathException37.getArguments();
        java.lang.Object[] objArray40 = new java.lang.Object[] {};
        org.apache.commons.math.MathException mathException41 = new org.apache.commons.math.MathException("hi!", objArray40);
        java.lang.Throwable[] throwableArray42 = mathException41.getSuppressed();
        mathException37.addSuppressed((java.lang.Throwable) mathException41);
        java.lang.Throwable[] throwableArray44 = mathException37.getSuppressed();
        org.apache.commons.math.MathException mathException45 = new org.apache.commons.math.MathException();
        java.lang.String str46 = mathException45.getPattern();
        org.apache.commons.math.MathException mathException47 = new org.apache.commons.math.MathException("anglais", (java.lang.Object[]) throwableArray44, (java.lang.Throwable) mathException45);
        org.apache.commons.math.MathException mathException48 = new org.apache.commons.math.MathException("", (java.lang.Object[]) throwableArray44);
        mathException20.addSuppressed((java.lang.Throwable) mathException48);
        org.apache.commons.math.MathException mathException50 = new org.apache.commons.math.MathException((java.lang.Throwable) mathException20);
        java.lang.String str51 = mathException20.toString();
        org.junit.Assert.assertNotNull(locale8);
        org.junit.Assert.assertEquals(locale8.toString(), "fr");
        org.junit.Assert.assertNotNull(strSet9);
        org.junit.Assert.assertNotNull(locale10);
        org.junit.Assert.assertEquals(locale10.toString(), "fr");
        org.junit.Assert.assertNotNull(objArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray13), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray13), "[]");
        org.junit.Assert.assertNotNull(throwableArray15);
        org.junit.Assert.assertNotNull(throwableArray16);
        org.junit.Assert.assertNotNull(printStream17);
        org.junit.Assert.assertNotNull(objArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray19), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray19), "[]");
        org.junit.Assert.assertNotNull(objArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray21), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray21), "[]");
        org.junit.Assert.assertNotNull(objArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray24), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray24), "[]");
        org.junit.Assert.assertNotNull(objArray26);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray26), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray26), "[]");
        org.junit.Assert.assertNotNull(objArray36);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray36), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray36), "[]");
        org.junit.Assert.assertNotNull(objArray38);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray38), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray38), "[]");
        org.junit.Assert.assertNotNull(objArray40);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray40), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray40), "[]");
        org.junit.Assert.assertNotNull(throwableArray42);
        org.junit.Assert.assertNotNull(throwableArray44);
        org.junit.Assert.assertNull(str46);
        org.junit.Assert.assertEquals("'" + str51 + "' != '" + "org.apache.commons.math.MathException: hi!" + "'", str51, "org.apache.commons.math.MathException: hi!");
    }

    @Test
    public void test00424() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00424");
        java.util.List<java.util.Locale.LanguageRange> languageRangeList1 = java.util.Locale.LanguageRange.parse("ita");
        java.lang.Class<?> wildcardClass2 = languageRangeList1.getClass();
        org.junit.Assert.assertNotNull(languageRangeList1);
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test00425() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00425");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clearExtensions();
        java.util.Locale locale2 = builder1.build();
        java.util.Locale.Builder builder5 = builder1.setExtension('x', "italien");
        java.util.Locale.Builder builder8 = builder1.setExtension('a', "jpn");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder10 = builder1.addUnicodeLocaleAttribute("org.apache.commons.math.MathException: fr");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed Unicode locale attribute: org.apache.commons.math.MathException: fr [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "");
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder8);
    }

    @Test
    public void test00426() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00426");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl((int) 'u', (int) (byte) 1, (int) '#');
        int int4 = hypergeometricDistributionImpl3.getPopulationSize();
        double double6 = hypergeometricDistributionImpl3.cumulativeProbability((int) (short) 100);
        int int8 = hypergeometricDistributionImpl3.inverseCumulativeProbability((double) 1L);
        // The following exception was thrown during execution in test generation
        try {
            double double11 = hypergeometricDistributionImpl3.cumulativeProbability(0.2991452991452851d, 0.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: lower endpoint must be less than or equal to upper endpoint");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 117 + "'", int4 == 117);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0d + "'", double6 == 1.0d);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
    }

    @Test
    public void test00427() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00427");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl((int) 'u', (int) (byte) 1, (int) '#');
        int int4 = hypergeometricDistributionImpl3.getSampleSize();
        double double6 = hypergeometricDistributionImpl3.cumulativeProbability(10);
        double double8 = hypergeometricDistributionImpl3.probability((int) (byte) -1);
        // The following exception was thrown during execution in test generation
        try {
            double double11 = hypergeometricDistributionImpl3.cumulativeProbability((int) (short) 1, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: lower endpoint must be less than or equal to upper endpoint");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 35 + "'", int4 == 35);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0d + "'", double6 == 1.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
    }

    @Test
    public void test00428() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00428");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clearExtensions();
        java.util.Locale.Builder builder3 = builder1.setLanguageTag("fr");
        java.util.Locale locale4 = builder3.build();
        java.util.Locale.Builder builder6 = builder3.setLanguageTag("ja");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder8 = builder3.setRegion("zh_CN");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed region: zh_CN [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "fr");
        org.junit.Assert.assertNotNull(builder6);
    }

    @Test
    public void test00429() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00429");
        java.io.PrintWriter printWriter1 = new java.io.PrintWriter("fr");
        java.io.PrintWriter printWriter3 = printWriter1.append(' ');
        char[] charArray6 = new char[] { 'x', 'a' };
        printWriter3.print(charArray6);
        java.lang.Object[] objArray11 = new java.lang.Object[] {};
        org.apache.commons.math.MathException mathException12 = new org.apache.commons.math.MathException("hi!", objArray11);
        java.lang.Throwable[] throwableArray13 = mathException12.getSuppressed();
        org.apache.commons.math.MathException mathException14 = new org.apache.commons.math.MathException("fr", (java.lang.Object[]) throwableArray13);
        java.io.PrintWriter printWriter15 = printWriter3.printf("en-GB", (java.lang.Object[]) throwableArray13);
        printWriter15.println(1L);
        printWriter15.print(0.02999999999999997d);
        // The following exception was thrown during execution in test generation
        try {
            java.io.PrintWriter printWriter23 = printWriter15.append((java.lang.CharSequence) "ITA", (int) 'u', 117);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 117");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(printWriter3);
        org.junit.Assert.assertNotNull(charArray6);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray6), "xa");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray6), "xa");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray6), "[x, a]");
        org.junit.Assert.assertNotNull(objArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray11), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray11), "[]");
        org.junit.Assert.assertNotNull(throwableArray13);
        org.junit.Assert.assertNotNull(printWriter15);
    }

    @Test
    public void test00430() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00430");
        java.util.List<java.util.Locale.LanguageRange> languageRangeList0 = null;
        java.util.Locale.LanguageRange languageRange2 = new java.util.Locale.LanguageRange("en-GB");
        double double3 = languageRange2.getWeight();
        java.lang.String str4 = languageRange2.getRange();
        java.util.Locale.LanguageRange languageRange7 = new java.util.Locale.LanguageRange("English", (double) 0);
        java.util.Locale.LanguageRange languageRange10 = new java.util.Locale.LanguageRange("fr", (double) (short) 1);
        java.util.Locale.LanguageRange languageRange13 = new java.util.Locale.LanguageRange("ita", (double) 0L);
        java.util.Locale.LanguageRange languageRange16 = new java.util.Locale.LanguageRange("chinois", 0.0d);
        double double17 = languageRange16.getWeight();
        java.lang.String str18 = languageRange16.getRange();
        java.util.Locale.LanguageRange[] languageRangeArray19 = new java.util.Locale.LanguageRange[] { languageRange2, languageRange7, languageRange10, languageRange13, languageRange16 };
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList20 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean21 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList20, languageRangeArray19);
        java.util.Locale locale22 = java.util.Locale.JAPANESE;
        java.lang.String str23 = locale22.getISO3Country();
        java.lang.String str24 = locale22.getDisplayCountry();
        java.util.Set<java.lang.String> strSet25 = locale22.getUnicodeLocaleAttributes();
        java.util.List<java.lang.String> strList26 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList20, (java.util.Collection<java.lang.String>) strSet25);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str27 = java.util.Locale.lookupTag(languageRangeList0, (java.util.Collection<java.lang.String>) strSet25);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "en-gb" + "'", str4, "en-gb");
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.0d + "'", double17 == 0.0d);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "chinois" + "'", str18, "chinois");
        org.junit.Assert.assertNotNull(languageRangeArray19);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertNotNull(locale22);
        org.junit.Assert.assertEquals(locale22.toString(), "ja");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
        org.junit.Assert.assertNotNull(strSet25);
        org.junit.Assert.assertNotNull(strList26);
    }

    @Test
    public void test00431() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00431");
        java.io.PrintStream printStream1 = new java.io.PrintStream("zh_CN");
        printStream1.println();
        java.io.PrintStream printStream4 = printStream1.append('#');
        java.io.PrintWriter printWriter5 = new java.io.PrintWriter((java.io.OutputStream) printStream4);
        java.io.PrintStream printStream7 = new java.io.PrintStream("zh_CN");
        printStream7.print((float) (byte) -1);
        printStream7.println();
        printStream7.println();
        java.io.PrintStream printStream13 = new java.io.PrintStream((java.io.OutputStream) printStream7, true);
        java.io.PrintWriter printWriter15 = new java.io.PrintWriter("fr");
        printWriter15.print("it_IT");
        java.util.Locale locale18 = java.util.Locale.ROOT;
        boolean boolean19 = locale18.hasExtensions();
        java.util.Locale locale20 = java.util.Locale.ROOT;
        java.lang.String str21 = locale18.getDisplayName(locale20);
        java.util.Locale locale22 = java.util.Locale.ROOT;
        boolean boolean23 = locale22.hasExtensions();
        java.lang.String str24 = locale18.getDisplayCountry(locale22);
        java.lang.Object[] objArray27 = new java.lang.Object[] {};
        org.apache.commons.math.MathException mathException28 = new org.apache.commons.math.MathException("hi!", objArray27);
        java.io.PrintWriter printWriter29 = printWriter15.printf(locale22, "it_IT", objArray27);
        printStream13.println((java.lang.Object) "it_IT");
        java.io.PrintStream printStream32 = printStream13.append((java.lang.CharSequence) "fr");
        java.io.PrintStream printStream33 = new java.io.PrintStream((java.io.OutputStream) printStream13);
        printStream13.println("");
        java.util.Locale.Builder builder36 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder37 = builder36.clearExtensions();
        java.util.Locale.Builder builder39 = builder37.setLanguageTag("fr");
        java.util.Locale locale40 = builder39.build();
        java.util.Locale.Builder builder41 = builder39.clearExtensions();
        printStream13.print((java.lang.Object) builder41);
        java.util.Locale.Builder builder43 = builder41.clear();
        java.util.Locale.Builder builder44 = builder43.clear();
        java.util.Locale locale45 = builder44.build();
        java.lang.String[] strArray47 = java.util.Locale.getISOLanguages();
        java.io.PrintStream printStream48 = printStream4.printf(locale45, "zh_CN", (java.lang.Object[]) strArray47);
        java.io.PrintWriter printWriter50 = new java.io.PrintWriter((java.io.OutputStream) printStream48, false);
        // The following exception was thrown during execution in test generation
        try {
            printWriter50.write("\u82f1\u8a9e", 0, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 32");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(printStream4);
        org.junit.Assert.assertNotNull(locale18);
        org.junit.Assert.assertEquals(locale18.toString(), "");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(locale20);
        org.junit.Assert.assertEquals(locale20.toString(), "");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertNotNull(locale22);
        org.junit.Assert.assertEquals(locale22.toString(), "");
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
        org.junit.Assert.assertNotNull(objArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray27), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray27), "[]");
        org.junit.Assert.assertNotNull(printWriter29);
        org.junit.Assert.assertNotNull(printStream32);
        org.junit.Assert.assertNotNull(builder37);
        org.junit.Assert.assertNotNull(builder39);
        org.junit.Assert.assertNotNull(locale40);
        org.junit.Assert.assertEquals(locale40.toString(), "fr");
        org.junit.Assert.assertNotNull(builder41);
        org.junit.Assert.assertNotNull(builder43);
        org.junit.Assert.assertNotNull(builder44);
        org.junit.Assert.assertNotNull(locale45);
        org.junit.Assert.assertEquals(locale45.toString(), "");
        org.junit.Assert.assertNotNull(strArray47);
        org.junit.Assert.assertNotNull(printStream48);
    }

    @Test
    public void test00432() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00432");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clearExtensions();
        java.util.Locale.Builder builder3 = builder0.removeUnicodeLocaleAttribute("fra");
        java.util.Locale locale4 = builder0.build();
        java.util.Locale.Builder builder5 = builder0.clearExtensions();
        java.util.Locale.Builder builder7 = builder0.setRegion("CN");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder10 = builder7.setUnicodeLocaleKeyword("\u30a4\u30ae\u30ea\u30b9", "Chinesisch (Taiwan)");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed Unicode locale keyword key: ????? [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "");
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder7);
    }

    @Test
    public void test00433() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00433");
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<java.util.Locale.LanguageRange> languageRangeList1 = java.util.Locale.LanguageRange.parse("\u30a4\u30ae\u30ea\u30b9");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: range=?????");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00434() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00434");
        java.util.Locale locale0 = java.util.Locale.JAPANESE;
        java.lang.String str1 = locale0.getISO3Country();
        java.util.Set<java.lang.String> strSet2 = locale0.getUnicodeLocaleAttributes();
        java.lang.String str3 = locale0.getDisplayName();
        java.util.Locale locale4 = locale0.stripExtensions();
        java.lang.String str5 = locale4.toString();
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "ja");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertNotNull(strSet2);
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\u65e5\u672c\u8a9e" + "'", str3, "\u65e5\u672c\u8a9e");
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "ja");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "ja" + "'", str5, "ja");
    }

    @Test
    public void test00435() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00435");
        java.io.File file0 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.io.PrintWriter printWriter2 = new java.io.PrintWriter(file0, "en-gb");
            org.junit.Assert.fail("Expected exception of type java.io.UnsupportedEncodingException; message: en-gb");
        } catch (java.io.UnsupportedEncodingException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00436() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00436");
        java.io.PrintWriter printWriter1 = new java.io.PrintWriter("fr");
        printWriter1.print("it_IT");
        java.lang.Object[] objArray5 = new java.lang.Object[] {};
        java.io.PrintWriter printWriter6 = printWriter1.printf("fr", objArray5);
        printWriter6.print((float) (byte) 100);
        printWriter6.print("Italy");
        printWriter6.write("ITALY");
        // The following exception was thrown during execution in test generation
        try {
            printWriter6.write("China", 117, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 127");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray5), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray5), "[]");
        org.junit.Assert.assertNotNull(printWriter6);
    }

    @Test
    public void test00437() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00437");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl((int) 'u', (int) (byte) 1, (int) '#');
        double double5 = hypergeometricDistributionImpl3.probability((double) 100.0f);
        hypergeometricDistributionImpl3.setNumberOfSuccesses((int) 'u');
        // The following exception was thrown during execution in test generation
        try {
            double double10 = hypergeometricDistributionImpl3.cumulativeProbability((double) 35, 0.11499182616210182d);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: lower endpoint must be less than or equal to upper endpoint");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
    }

    @Test
    public void test00438() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00438");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl((int) 'u', (int) (byte) 1, (int) '#');
        int int4 = hypergeometricDistributionImpl3.getPopulationSize();
        double double6 = hypergeometricDistributionImpl3.cumulativeProbability((int) (short) 100);
        int int7 = hypergeometricDistributionImpl3.getPopulationSize();
        double double10 = hypergeometricDistributionImpl3.cumulativeProbability(0, (int) 'a');
        hypergeometricDistributionImpl3.setSampleSize((int) 'a');
        hypergeometricDistributionImpl3.setPopulationSize((int) (byte) 100);
        hypergeometricDistributionImpl3.setNumberOfSuccesses(0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 117 + "'", int4 == 117);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0d + "'", double6 == 1.0d);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 117 + "'", int7 == 117);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 1.0d + "'", double10 == 1.0d);
    }

    @Test
    public void test00439() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00439");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clearExtensions();
        java.util.Locale locale2 = java.util.Locale.TRADITIONAL_CHINESE;
        java.util.Locale locale3 = java.util.Locale.GERMAN;
        java.lang.String str4 = locale3.getVariant();
        java.lang.String str5 = locale3.toLanguageTag();
        java.lang.String str6 = locale2.getDisplayName(locale3);
        java.util.Locale.Builder builder7 = builder0.setLocale(locale2);
        java.util.Locale.Builder builder8 = builder7.clearExtensions();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder11 = builder7.setExtension('u', "org.apache.commons.math.mathexception");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed extension value: org.apache.commons.math.mathexception [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "zh_TW");
        org.junit.Assert.assertNotNull(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "de");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "de" + "'", str5, "de");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Chinesisch (Taiwan)" + "'", str6, "Chinesisch (Taiwan)");
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(builder8);
    }

    @Test
    public void test00440() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00440");
        java.io.PrintWriter printWriter1 = new java.io.PrintWriter("fr");
        printWriter1.print("it_IT");
        java.util.Locale locale4 = java.util.Locale.ROOT;
        boolean boolean5 = locale4.hasExtensions();
        java.util.Locale locale6 = java.util.Locale.ROOT;
        java.lang.String str7 = locale4.getDisplayName(locale6);
        java.util.Locale locale8 = java.util.Locale.ROOT;
        boolean boolean9 = locale8.hasExtensions();
        java.lang.String str10 = locale4.getDisplayCountry(locale8);
        java.lang.Object[] objArray13 = new java.lang.Object[] {};
        org.apache.commons.math.MathException mathException14 = new org.apache.commons.math.MathException("hi!", objArray13);
        java.io.PrintWriter printWriter15 = printWriter1.printf(locale8, "it_IT", objArray13);
        printWriter1.println();
        printWriter1.print(10);
        java.io.PrintWriter printWriter22 = printWriter1.append((java.lang.CharSequence) "fr", (int) (short) 0, (int) (byte) 1);
        java.io.PrintWriter printWriter24 = new java.io.PrintWriter((java.io.Writer) printWriter1, true);
        printWriter1.println(false);
        java.io.PrintWriter printWriter30 = printWriter1.append((java.lang.CharSequence) "Italy", 0, 0);
        java.io.PrintWriter printWriter32 = new java.io.PrintWriter("fr");
        printWriter32.print("it_IT");
        java.util.Locale locale36 = java.util.Locale.forLanguageTag("");
        java.lang.Object[] objArray39 = new java.lang.Object[] {};
        org.apache.commons.math.MathException mathException40 = new org.apache.commons.math.MathException("hi!", objArray39);
        java.lang.Throwable[] throwableArray41 = mathException40.getSuppressed();
        java.lang.Throwable[] throwableArray42 = mathException40.getSuppressed();
        java.io.PrintWriter printWriter43 = printWriter32.printf(locale36, "it_IT", (java.lang.Object[]) throwableArray42);
        printWriter32.println((float) (byte) 10);
        java.io.PrintWriter printWriter47 = new java.io.PrintWriter("fr");
        java.io.PrintWriter printWriter49 = printWriter47.append(' ');
        java.io.PrintWriter printWriter52 = new java.io.PrintWriter("fr");
        printWriter52.print("it_IT");
        java.util.Locale locale55 = java.util.Locale.ROOT;
        boolean boolean56 = locale55.hasExtensions();
        java.util.Locale locale57 = java.util.Locale.ROOT;
        java.lang.String str58 = locale55.getDisplayName(locale57);
        java.util.Locale locale59 = java.util.Locale.ROOT;
        boolean boolean60 = locale59.hasExtensions();
        java.lang.String str61 = locale55.getDisplayCountry(locale59);
        java.lang.Object[] objArray64 = new java.lang.Object[] {};
        org.apache.commons.math.MathException mathException65 = new org.apache.commons.math.MathException("hi!", objArray64);
        java.io.PrintWriter printWriter66 = printWriter52.printf(locale59, "it_IT", objArray64);
        java.io.PrintWriter printWriter69 = new java.io.PrintWriter("fr");
        printWriter69.print("it_IT");
        java.util.Locale locale73 = java.util.Locale.forLanguageTag("");
        java.lang.Object[] objArray76 = new java.lang.Object[] {};
        org.apache.commons.math.MathException mathException77 = new org.apache.commons.math.MathException("hi!", objArray76);
        java.lang.Throwable[] throwableArray78 = mathException77.getSuppressed();
        java.lang.Throwable[] throwableArray79 = mathException77.getSuppressed();
        java.io.PrintWriter printWriter80 = printWriter69.printf(locale73, "it_IT", (java.lang.Object[]) throwableArray79);
        java.io.PrintWriter printWriter81 = printWriter52.format("it_IT", (java.lang.Object[]) throwableArray79);
        java.io.PrintWriter printWriter82 = printWriter49.format("zh_CN", (java.lang.Object[]) throwableArray79);
        java.io.PrintStream printStream84 = new java.io.PrintStream("zh_CN");
        printStream84.print((float) (byte) -1);
        char[] charArray89 = new char[] { 'x', 'u' };
        printStream84.println(charArray89);
        printWriter82.print(charArray89);
        printWriter32.write(charArray89);
        printWriter30.write(charArray89);
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(locale6);
        org.junit.Assert.assertEquals(locale6.toString(), "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(locale8);
        org.junit.Assert.assertEquals(locale8.toString(), "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(objArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray13), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray13), "[]");
        org.junit.Assert.assertNotNull(printWriter15);
        org.junit.Assert.assertNotNull(printWriter22);
        org.junit.Assert.assertNotNull(printWriter30);
        org.junit.Assert.assertNotNull(locale36);
        org.junit.Assert.assertEquals(locale36.toString(), "");
        org.junit.Assert.assertNotNull(objArray39);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray39), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray39), "[]");
        org.junit.Assert.assertNotNull(throwableArray41);
        org.junit.Assert.assertNotNull(throwableArray42);
        org.junit.Assert.assertNotNull(printWriter43);
        org.junit.Assert.assertNotNull(printWriter49);
        org.junit.Assert.assertNotNull(locale55);
        org.junit.Assert.assertEquals(locale55.toString(), "");
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
        org.junit.Assert.assertNotNull(locale57);
        org.junit.Assert.assertEquals(locale57.toString(), "");
        org.junit.Assert.assertEquals("'" + str58 + "' != '" + "" + "'", str58, "");
        org.junit.Assert.assertNotNull(locale59);
        org.junit.Assert.assertEquals(locale59.toString(), "");
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + false + "'", boolean60 == false);
        org.junit.Assert.assertEquals("'" + str61 + "' != '" + "" + "'", str61, "");
        org.junit.Assert.assertNotNull(objArray64);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray64), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray64), "[]");
        org.junit.Assert.assertNotNull(printWriter66);
        org.junit.Assert.assertNotNull(locale73);
        org.junit.Assert.assertEquals(locale73.toString(), "");
        org.junit.Assert.assertNotNull(objArray76);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray76), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray76), "[]");
        org.junit.Assert.assertNotNull(throwableArray78);
        org.junit.Assert.assertNotNull(throwableArray79);
        org.junit.Assert.assertNotNull(printWriter80);
        org.junit.Assert.assertNotNull(printWriter81);
        org.junit.Assert.assertNotNull(printWriter82);
        org.junit.Assert.assertNotNull(charArray89);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray89), "xu");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray89), "xu");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray89), "[x, u]");
    }

    @Test
    public void test00441() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00441");
        java.io.PrintStream printStream1 = new java.io.PrintStream("zh_CN");
        printStream1.print((float) (byte) -1);
        printStream1.println();
        printStream1.println();
        java.io.PrintStream printStream7 = new java.io.PrintStream((java.io.OutputStream) printStream1, true);
        java.io.PrintWriter printWriter9 = new java.io.PrintWriter("fr");
        printWriter9.print("it_IT");
        java.util.Locale locale12 = java.util.Locale.ROOT;
        boolean boolean13 = locale12.hasExtensions();
        java.util.Locale locale14 = java.util.Locale.ROOT;
        java.lang.String str15 = locale12.getDisplayName(locale14);
        java.util.Locale locale16 = java.util.Locale.ROOT;
        boolean boolean17 = locale16.hasExtensions();
        java.lang.String str18 = locale12.getDisplayCountry(locale16);
        java.lang.Object[] objArray21 = new java.lang.Object[] {};
        org.apache.commons.math.MathException mathException22 = new org.apache.commons.math.MathException("hi!", objArray21);
        java.io.PrintWriter printWriter23 = printWriter9.printf(locale16, "it_IT", objArray21);
        printStream7.println((java.lang.Object) "it_IT");
        java.io.PrintStream printStream26 = printStream7.append((java.lang.CharSequence) "fr");
        java.io.PrintStream printStream28 = new java.io.PrintStream((java.io.OutputStream) printStream26, false);
        java.io.PrintWriter printWriter30 = new java.io.PrintWriter((java.io.OutputStream) printStream26, true);
        java.io.PrintStream printStream32 = printStream26.append('x');
        java.io.PrintStream printStream34 = new java.io.PrintStream("zh_CN");
        printStream34.print((float) (byte) -1);
        printStream34.println();
        printStream34.println();
        printStream34.println((float) ' ');
        printStream34.println("hi!");
        printStream34.print(false);
        printStream34.write((int) 'a');
        printStream34.println((java.lang.Object) 'x');
        printStream26.print((java.lang.Object) 'x');
        printStream26.println();
        java.io.PrintStream printStream52 = new java.io.PrintStream("zh_CN");
        printStream52.println();
        java.io.PrintStream printStream55 = printStream52.append('#');
        printStream52.close();
        byte[] byteArray61 = new byte[] { (byte) -1, (byte) 100, (byte) -1, (byte) -1 };
        printStream52.write(byteArray61);
        printStream52.print(false);
        printStream52.println("Italy");
        java.io.PrintStream printStream68 = new java.io.PrintStream("zh_CN");
        printStream68.println((float) (-1));
        java.io.PrintStream printStream72 = new java.io.PrintStream("zh_CN");
        printStream72.println();
        java.io.PrintStream printStream75 = printStream72.append('#');
        printStream72.close();
        byte[] byteArray81 = new byte[] { (byte) -1, (byte) 100, (byte) -1, (byte) -1 };
        printStream72.write(byteArray81);
        printStream68.write(byteArray81);
        printStream52.write(byteArray81);
        // The following exception was thrown during execution in test generation
        try {
            printStream26.write(byteArray81, (int) (byte) -1, (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(locale12);
        org.junit.Assert.assertEquals(locale12.toString(), "");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(locale14);
        org.junit.Assert.assertEquals(locale14.toString(), "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertNotNull(locale16);
        org.junit.Assert.assertEquals(locale16.toString(), "");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertNotNull(objArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray21), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray21), "[]");
        org.junit.Assert.assertNotNull(printWriter23);
        org.junit.Assert.assertNotNull(printStream26);
        org.junit.Assert.assertNotNull(printStream32);
        org.junit.Assert.assertNotNull(printStream55);
        org.junit.Assert.assertNotNull(byteArray61);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray61), "[-1, 100, -1, -1]");
        org.junit.Assert.assertNotNull(printStream75);
        org.junit.Assert.assertNotNull(byteArray81);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray81), "[-1, 100, -1, -1]");
    }

    @Test
    public void test00442() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00442");
        org.apache.commons.math.MathException mathException0 = new org.apache.commons.math.MathException();
        java.lang.String str1 = mathException0.getPattern();
        java.lang.String str2 = mathException0.getPattern();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
    }

    @Test
    public void test00443() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00443");
        java.util.Locale locale3 = new java.util.Locale("", "", "");
        java.util.Locale locale6 = new java.util.Locale("hi!", "Italy");
        java.lang.String str7 = locale3.getDisplayCountry(locale6);
        java.lang.String str8 = locale6.getDisplayName();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str10 = locale6.getUnicodeLocaleType("Chinese (Taiwan)");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Ill-formed Unicode locale key: Chinese (Taiwan)");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals(locale3.toString(), "");
        org.junit.Assert.assertEquals(locale6.toString(), "hi!_ITALY");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi! (ITALY)" + "'", str8, "hi! (ITALY)");
    }

    @Test
    public void test00444() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00444");
        java.io.PrintStream printStream1 = new java.io.PrintStream("zh_CN");
        printStream1.print((float) (byte) -1);
        printStream1.println();
        printStream1.println();
        java.io.PrintStream printStream7 = new java.io.PrintStream((java.io.OutputStream) printStream1, true);
        java.io.PrintWriter printWriter9 = new java.io.PrintWriter("fr");
        printWriter9.print("it_IT");
        java.util.Locale locale12 = java.util.Locale.ROOT;
        boolean boolean13 = locale12.hasExtensions();
        java.util.Locale locale14 = java.util.Locale.ROOT;
        java.lang.String str15 = locale12.getDisplayName(locale14);
        java.util.Locale locale16 = java.util.Locale.ROOT;
        boolean boolean17 = locale16.hasExtensions();
        java.lang.String str18 = locale12.getDisplayCountry(locale16);
        java.lang.Object[] objArray21 = new java.lang.Object[] {};
        org.apache.commons.math.MathException mathException22 = new org.apache.commons.math.MathException("hi!", objArray21);
        java.io.PrintWriter printWriter23 = printWriter9.printf(locale16, "it_IT", objArray21);
        printStream7.println((java.lang.Object) "it_IT");
        printStream7.print((float) (byte) 1);
        printStream7.print(0);
        java.io.PrintStream printStream32 = new java.io.PrintStream("zh_CN");
        printStream32.print((float) (byte) -1);
        printStream32.println();
        printStream32.print("ita");
        java.util.Locale locale38 = java.util.Locale.FRENCH;
        java.util.Set<java.lang.String> strSet39 = locale38.getUnicodeLocaleKeys();
        java.util.Locale locale40 = locale38.stripExtensions();
        java.lang.Object[] objArray43 = new java.lang.Object[] {};
        org.apache.commons.math.MathException mathException44 = new org.apache.commons.math.MathException("hi!", objArray43);
        java.lang.Throwable[] throwableArray45 = mathException44.getSuppressed();
        java.lang.Throwable[] throwableArray46 = mathException44.getSuppressed();
        java.io.PrintStream printStream47 = printStream32.printf(locale40, "fr", (java.lang.Object[]) throwableArray46);
        org.apache.commons.math.MathException mathException48 = new org.apache.commons.math.MathException("org.apache.commons.math.MathException", (java.lang.Object[]) throwableArray46);
        java.io.PrintStream printStream49 = printStream7.format("org.apache.commons.math.MathException: ", (java.lang.Object[]) throwableArray46);
        printStream49.println((int) (byte) 100);
        // The following exception was thrown during execution in test generation
        try {
            java.io.PrintStream printStream55 = printStream49.append((java.lang.CharSequence) "en-GB", (int) (byte) -1, 97);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: -1");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(locale12);
        org.junit.Assert.assertEquals(locale12.toString(), "");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(locale14);
        org.junit.Assert.assertEquals(locale14.toString(), "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertNotNull(locale16);
        org.junit.Assert.assertEquals(locale16.toString(), "");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertNotNull(objArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray21), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray21), "[]");
        org.junit.Assert.assertNotNull(printWriter23);
        org.junit.Assert.assertNotNull(locale38);
        org.junit.Assert.assertEquals(locale38.toString(), "fr");
        org.junit.Assert.assertNotNull(strSet39);
        org.junit.Assert.assertNotNull(locale40);
        org.junit.Assert.assertEquals(locale40.toString(), "fr");
        org.junit.Assert.assertNotNull(objArray43);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray43), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray43), "[]");
        org.junit.Assert.assertNotNull(throwableArray45);
        org.junit.Assert.assertNotNull(throwableArray46);
        org.junit.Assert.assertNotNull(printStream47);
        org.junit.Assert.assertNotNull(printStream49);
    }

    @Test
    public void test00445() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00445");
        java.io.PrintStream printStream1 = new java.io.PrintStream("zh_CN");
        printStream1.print((float) (byte) -1);
        java.io.PrintWriter printWriter5 = new java.io.PrintWriter("fr");
        printWriter5.print("it_IT");
        java.lang.Object[] objArray9 = new java.lang.Object[] {};
        java.io.PrintWriter printWriter10 = printWriter5.printf("fr", objArray9);
        printWriter5.println((float) 'u');
        printStream1.print((java.lang.Object) 'u');
        printStream1.println(0L);
        java.io.PrintStream printStream16 = new java.io.PrintStream((java.io.OutputStream) printStream1);
        boolean boolean17 = printStream16.checkError();
        printStream16.println(false);
        printStream16.flush();
        printStream16.print((double) 1);
        java.io.PrintStream printStream24 = new java.io.PrintStream("zh_CN");
        printStream24.print((float) (byte) -1);
        printStream24.println();
        printStream24.println();
        java.io.PrintStream printStream30 = new java.io.PrintStream((java.io.OutputStream) printStream24, true);
        printStream24.println();
        printStream24.print((-1));
        java.io.PrintStream printStream35 = new java.io.PrintStream("zh_CN");
        printStream35.println();
        java.io.PrintStream printStream38 = printStream35.append('#');
        printStream35.close();
        byte[] byteArray43 = new byte[] { (byte) 1, (byte) 10, (byte) -1 };
        printStream35.write(byteArray43);
        printStream24.write(byteArray43);
        // The following exception was thrown during execution in test generation
        try {
            printStream16.write(byteArray43, (int) (short) 0, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray9), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray9), "[]");
        org.junit.Assert.assertNotNull(printWriter10);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(printStream38);
        org.junit.Assert.assertNotNull(byteArray43);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray43), "[1, 10, -1]");
    }

    @Test
    public void test00446() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00446");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl((int) 'u', (int) (byte) 1, (int) '#');
        int int4 = hypergeometricDistributionImpl3.getPopulationSize();
        double double6 = hypergeometricDistributionImpl3.cumulativeProbability((int) (short) 100);
        int int7 = hypergeometricDistributionImpl3.getPopulationSize();
        double double10 = hypergeometricDistributionImpl3.cumulativeProbability(0, (int) 'a');
        hypergeometricDistributionImpl3.setSampleSize((int) 'a');
        double double14 = hypergeometricDistributionImpl3.probability((int) '4');
        double double16 = hypergeometricDistributionImpl3.cumulativeProbability(0.0d);
        hypergeometricDistributionImpl3.setNumberOfSuccesses(1);
        int int19 = hypergeometricDistributionImpl3.getNumberOfSuccesses();
        // The following exception was thrown during execution in test generation
        try {
            double double22 = hypergeometricDistributionImpl3.cumulativeProbability((double) '4', 0.8290598290598294d);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: lower endpoint must be less than or equal to upper endpoint");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 117 + "'", int4 == 117);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0d + "'", double6 == 1.0d);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 117 + "'", int7 == 117);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 1.0d + "'", double10 == 1.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.1709401709401705d + "'", double16 == 0.1709401709401705d);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 1 + "'", int19 == 1);
    }

    @Test
    public void test00447() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00447");
        java.io.PrintWriter printWriter1 = new java.io.PrintWriter("fr");
        printWriter1.print("it_IT");
        java.util.Locale locale4 = java.util.Locale.ROOT;
        boolean boolean5 = locale4.hasExtensions();
        java.util.Locale locale6 = java.util.Locale.ROOT;
        java.lang.String str7 = locale4.getDisplayName(locale6);
        java.util.Locale locale8 = java.util.Locale.ROOT;
        boolean boolean9 = locale8.hasExtensions();
        java.lang.String str10 = locale4.getDisplayCountry(locale8);
        java.lang.Object[] objArray13 = new java.lang.Object[] {};
        org.apache.commons.math.MathException mathException14 = new org.apache.commons.math.MathException("hi!", objArray13);
        java.io.PrintWriter printWriter15 = printWriter1.printf(locale8, "it_IT", objArray13);
        java.io.PrintWriter printWriter18 = new java.io.PrintWriter("fr");
        printWriter18.print("it_IT");
        java.util.Locale locale22 = java.util.Locale.forLanguageTag("");
        java.lang.Object[] objArray25 = new java.lang.Object[] {};
        org.apache.commons.math.MathException mathException26 = new org.apache.commons.math.MathException("hi!", objArray25);
        java.lang.Throwable[] throwableArray27 = mathException26.getSuppressed();
        java.lang.Throwable[] throwableArray28 = mathException26.getSuppressed();
        java.io.PrintWriter printWriter29 = printWriter18.printf(locale22, "it_IT", (java.lang.Object[]) throwableArray28);
        java.io.PrintWriter printWriter30 = printWriter1.format("it_IT", (java.lang.Object[]) throwableArray28);
        printWriter30.println('x');
        // The following exception was thrown during execution in test generation
        try {
            printWriter30.write("Canada", 52, (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 104");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(locale6);
        org.junit.Assert.assertEquals(locale6.toString(), "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(locale8);
        org.junit.Assert.assertEquals(locale8.toString(), "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(objArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray13), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray13), "[]");
        org.junit.Assert.assertNotNull(printWriter15);
        org.junit.Assert.assertNotNull(locale22);
        org.junit.Assert.assertEquals(locale22.toString(), "");
        org.junit.Assert.assertNotNull(objArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray25), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray25), "[]");
        org.junit.Assert.assertNotNull(throwableArray27);
        org.junit.Assert.assertNotNull(throwableArray28);
        org.junit.Assert.assertNotNull(printWriter29);
        org.junit.Assert.assertNotNull(printWriter30);
    }

    @Test
    public void test00448() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00448");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clearExtensions();
        java.util.Locale.Builder builder3 = builder0.removeUnicodeLocaleAttribute("fra");
        java.util.Locale locale4 = builder0.build();
        java.util.Locale.Builder builder5 = builder0.clearExtensions();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder7 = builder0.addUnicodeLocaleAttribute("");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed Unicode locale attribute:  [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "");
        org.junit.Assert.assertNotNull(builder5);
    }

    @Test
    public void test00449() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00449");
        java.io.PrintStream printStream1 = new java.io.PrintStream("org.apache.commons.math.mathexception");
        printStream1.print(true);
    }

    @Test
    public void test00450() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00450");
        java.lang.Object[] objArray3 = new java.lang.Object[] {};
        org.apache.commons.math.MathException mathException4 = new org.apache.commons.math.MathException("hi!", objArray3);
        org.apache.commons.math.MathException mathException6 = new org.apache.commons.math.MathException("fr-CA");
        org.apache.commons.math.MathException mathException7 = new org.apache.commons.math.MathException("tedesco", objArray3, (java.lang.Throwable) mathException6);
        org.apache.commons.math.MathException mathException9 = new org.apache.commons.math.MathException();
        org.apache.commons.math.MathException mathException10 = new org.apache.commons.math.MathException("", (java.lang.Throwable) mathException9);
        org.apache.commons.math.MathException mathException11 = new org.apache.commons.math.MathException("fr-CA", objArray3, (java.lang.Throwable) mathException9);
        java.lang.String str12 = mathException9.toString();
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray3), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray3), "[]");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "org.apache.commons.math.MathException" + "'", str12, "org.apache.commons.math.MathException");
    }

    @Test
    public void test00451() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00451");
        java.util.Locale.LanguageRange[] languageRangeArray0 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList1 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList1, languageRangeArray0);
        java.lang.String[] strArray6 = new java.lang.String[] { "", "Italy", "fr" };
        java.util.ArrayList<java.lang.String> strList7 = new java.util.ArrayList<java.lang.String>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList7, strArray6);
        java.util.List<java.lang.String> strList9 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList1, (java.util.Collection<java.lang.String>) strList7);
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap10 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList11 = java.util.Locale.LanguageRange.mapEquivalents((java.util.List<java.util.Locale.LanguageRange>) languageRangeList1, strMap10);
        java.util.Locale.LanguageRange[] languageRangeArray12 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList13 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean14 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList13, languageRangeArray12);
        java.util.Collection<java.util.Locale> localeCollection15 = null;
        java.util.Locale locale16 = java.util.Locale.lookup((java.util.List<java.util.Locale.LanguageRange>) languageRangeList13, localeCollection15);
        java.lang.String[] strArray18 = new java.lang.String[] { "hi!" };
        java.util.ArrayList<java.lang.String> strList19 = new java.util.ArrayList<java.lang.String>();
        boolean boolean20 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList19, strArray18);
        java.lang.String str21 = java.util.Locale.lookupTag((java.util.List<java.util.Locale.LanguageRange>) languageRangeList13, (java.util.Collection<java.lang.String>) strList19);
        java.util.Locale locale22 = java.util.Locale.ROOT;
        boolean boolean23 = locale22.hasExtensions();
        java.lang.String str24 = locale22.getCountry();
        java.util.Locale locale25 = java.util.Locale.JAPAN;
        java.util.Locale locale26 = java.util.Locale.FRENCH;
        java.util.Locale locale30 = new java.util.Locale("", "", "");
        java.util.Locale[] localeArray31 = new java.util.Locale[] { locale22, locale25, locale26, locale30 };
        java.util.ArrayList<java.util.Locale> localeList32 = new java.util.ArrayList<java.util.Locale>();
        boolean boolean33 = java.util.Collections.addAll((java.util.Collection<java.util.Locale>) localeList32, localeArray31);
        java.util.List<java.util.Locale> localeList34 = java.util.Locale.filter((java.util.List<java.util.Locale.LanguageRange>) languageRangeList13, (java.util.Collection<java.util.Locale>) localeList32);
        java.util.Locale.LanguageRange[] languageRangeArray35 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList36 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean37 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList36, languageRangeArray35);
        java.util.Collection<java.util.Locale> localeCollection38 = null;
        java.util.Locale locale39 = java.util.Locale.lookup((java.util.List<java.util.Locale.LanguageRange>) languageRangeList36, localeCollection38);
        java.lang.String[] strArray41 = new java.lang.String[] { "hi!" };
        java.util.ArrayList<java.lang.String> strList42 = new java.util.ArrayList<java.lang.String>();
        boolean boolean43 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList42, strArray41);
        java.lang.String str44 = java.util.Locale.lookupTag((java.util.List<java.util.Locale.LanguageRange>) languageRangeList36, (java.util.Collection<java.lang.String>) strList42);
        java.util.Locale locale45 = java.util.Locale.ROOT;
        boolean boolean46 = locale45.hasExtensions();
        java.lang.String str47 = locale45.getCountry();
        java.util.Locale locale48 = java.util.Locale.JAPAN;
        java.util.Locale locale49 = java.util.Locale.FRENCH;
        java.util.Locale locale53 = new java.util.Locale("", "", "");
        java.util.Locale[] localeArray54 = new java.util.Locale[] { locale45, locale48, locale49, locale53 };
        java.util.ArrayList<java.util.Locale> localeList55 = new java.util.ArrayList<java.util.Locale>();
        boolean boolean56 = java.util.Collections.addAll((java.util.Collection<java.util.Locale>) localeList55, localeArray54);
        java.util.List<java.util.Locale> localeList57 = java.util.Locale.filter((java.util.List<java.util.Locale.LanguageRange>) languageRangeList36, (java.util.Collection<java.util.Locale>) localeList55);
        java.util.List<java.util.Locale> localeList58 = java.util.Locale.filter((java.util.List<java.util.Locale.LanguageRange>) languageRangeList13, (java.util.Collection<java.util.Locale>) localeList57);
        java.util.Locale.LanguageRange[] languageRangeArray59 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList60 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean61 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList60, languageRangeArray59);
        java.util.Collection<java.util.Locale> localeCollection62 = null;
        java.util.Locale locale63 = java.util.Locale.lookup((java.util.List<java.util.Locale.LanguageRange>) languageRangeList60, localeCollection62);
        java.util.Locale.LanguageRange[] languageRangeArray64 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList65 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean66 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList65, languageRangeArray64);
        java.util.Collection<java.util.Locale> localeCollection67 = null;
        java.util.Locale locale68 = java.util.Locale.lookup((java.util.List<java.util.Locale.LanguageRange>) languageRangeList65, localeCollection67);
        java.lang.String[] strArray74 = new java.lang.String[] { "hi!", "", "it_IT", "Italy", "" };
        java.util.ArrayList<java.lang.String> strList75 = new java.util.ArrayList<java.lang.String>();
        boolean boolean76 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList75, strArray74);
        java.util.List<java.lang.String> strList77 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList65, (java.util.Collection<java.lang.String>) strList75);
        java.util.Locale.FilteringMode filteringMode78 = java.util.Locale.FilteringMode.IGNORE_EXTENDED_RANGES;
        java.util.List<java.lang.String> strList79 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList60, (java.util.Collection<java.lang.String>) strList77, filteringMode78);
        java.util.List<java.util.Locale> localeList80 = java.util.Locale.filter((java.util.List<java.util.Locale.LanguageRange>) languageRangeList1, (java.util.Collection<java.util.Locale>) localeList57, filteringMode78);
        org.junit.Assert.assertNotNull(languageRangeArray0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(strList9);
        org.junit.Assert.assertNotNull(languageRangeList11);
        org.junit.Assert.assertNotNull(languageRangeArray12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNull(locale16);
        org.junit.Assert.assertNotNull(strArray18);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertNull(str21);
        org.junit.Assert.assertNotNull(locale22);
        org.junit.Assert.assertEquals(locale22.toString(), "");
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
        org.junit.Assert.assertNotNull(locale25);
        org.junit.Assert.assertEquals(locale25.toString(), "ja_JP");
        org.junit.Assert.assertNotNull(locale26);
        org.junit.Assert.assertEquals(locale26.toString(), "fr");
        org.junit.Assert.assertEquals(locale30.toString(), "");
        org.junit.Assert.assertNotNull(localeArray31);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
        org.junit.Assert.assertNotNull(localeList34);
        org.junit.Assert.assertNotNull(languageRangeArray35);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertNull(locale39);
        org.junit.Assert.assertNotNull(strArray41);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + true + "'", boolean43 == true);
        org.junit.Assert.assertNull(str44);
        org.junit.Assert.assertNotNull(locale45);
        org.junit.Assert.assertEquals(locale45.toString(), "");
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertEquals("'" + str47 + "' != '" + "" + "'", str47, "");
        org.junit.Assert.assertNotNull(locale48);
        org.junit.Assert.assertEquals(locale48.toString(), "ja_JP");
        org.junit.Assert.assertNotNull(locale49);
        org.junit.Assert.assertEquals(locale49.toString(), "fr");
        org.junit.Assert.assertEquals(locale53.toString(), "");
        org.junit.Assert.assertNotNull(localeArray54);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + true + "'", boolean56 == true);
        org.junit.Assert.assertNotNull(localeList57);
        org.junit.Assert.assertNotNull(localeList58);
        org.junit.Assert.assertNotNull(languageRangeArray59);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + false + "'", boolean61 == false);
        org.junit.Assert.assertNull(locale63);
        org.junit.Assert.assertNotNull(languageRangeArray64);
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + false + "'", boolean66 == false);
        org.junit.Assert.assertNull(locale68);
        org.junit.Assert.assertNotNull(strArray74);
        org.junit.Assert.assertTrue("'" + boolean76 + "' != '" + true + "'", boolean76 == true);
        org.junit.Assert.assertNotNull(strList77);
        org.junit.Assert.assertTrue("'" + filteringMode78 + "' != '" + java.util.Locale.FilteringMode.IGNORE_EXTENDED_RANGES + "'", filteringMode78.equals(java.util.Locale.FilteringMode.IGNORE_EXTENDED_RANGES));
        org.junit.Assert.assertNotNull(strList79);
        org.junit.Assert.assertNotNull(localeList80);
    }

    @Test
    public void test00452() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00452");
        // The following exception was thrown during execution in test generation
        try {
            java.io.PrintStream printStream2 = new java.io.PrintStream("\u53f0\u7063", "eng");
            org.junit.Assert.fail("Expected exception of type java.io.UnsupportedEncodingException; message: eng");
        } catch (java.io.UnsupportedEncodingException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00453() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00453");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder2 = builder0.setLanguageTag("ita");
        java.util.Locale.Builder builder3 = builder0.clearExtensions();
        java.util.Locale locale4 = builder3.build();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder6 = builder3.setLanguage("org.apache.commons.math.MathException: fr");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed language: org.apache.commons.math.MathException: fr [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "ita");
    }

    @Test
    public void test00454() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00454");
        java.io.PrintStream printStream1 = new java.io.PrintStream("zh_CN");
        printStream1.println();
        java.io.PrintStream printStream4 = printStream1.append('#');
        printStream1.close();
        byte[] byteArray10 = new byte[] { (byte) -1, (byte) 100, (byte) -1, (byte) -1 };
        printStream1.write(byteArray10);
        printStream1.print(false);
        printStream1.println("Italy");
        java.io.PrintStream printStream17 = new java.io.PrintStream("zh_CN");
        printStream17.println((float) (-1));
        java.io.PrintStream printStream21 = new java.io.PrintStream("zh_CN");
        printStream21.println();
        java.io.PrintStream printStream24 = printStream21.append('#');
        printStream21.close();
        byte[] byteArray30 = new byte[] { (byte) -1, (byte) 100, (byte) -1, (byte) -1 };
        printStream21.write(byteArray30);
        printStream17.write(byteArray30);
        printStream1.write(byteArray30);
        printStream1.println((int) (byte) -1);
        printStream1.print(' ');
        org.junit.Assert.assertNotNull(printStream4);
        org.junit.Assert.assertNotNull(byteArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray10), "[-1, 100, -1, -1]");
        org.junit.Assert.assertNotNull(printStream24);
        org.junit.Assert.assertNotNull(byteArray30);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray30), "[-1, 100, -1, -1]");
    }

    @Test
    public void test00455() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00455");
        java.io.PrintStream printStream1 = new java.io.PrintStream("zh_CN");
        printStream1.print((float) (byte) -1);
        printStream1.println();
        printStream1.println();
        java.io.PrintStream printStream7 = new java.io.PrintStream((java.io.OutputStream) printStream1, true);
        java.io.PrintWriter printWriter9 = new java.io.PrintWriter("fr");
        java.io.PrintWriter printWriter11 = printWriter9.append(' ');
        java.io.PrintWriter printWriter14 = new java.io.PrintWriter("fr");
        printWriter14.print("it_IT");
        java.util.Locale locale17 = java.util.Locale.ROOT;
        boolean boolean18 = locale17.hasExtensions();
        java.util.Locale locale19 = java.util.Locale.ROOT;
        java.lang.String str20 = locale17.getDisplayName(locale19);
        java.util.Locale locale21 = java.util.Locale.ROOT;
        boolean boolean22 = locale21.hasExtensions();
        java.lang.String str23 = locale17.getDisplayCountry(locale21);
        java.lang.Object[] objArray26 = new java.lang.Object[] {};
        org.apache.commons.math.MathException mathException27 = new org.apache.commons.math.MathException("hi!", objArray26);
        java.io.PrintWriter printWriter28 = printWriter14.printf(locale21, "it_IT", objArray26);
        java.io.PrintWriter printWriter31 = new java.io.PrintWriter("fr");
        printWriter31.print("it_IT");
        java.util.Locale locale35 = java.util.Locale.forLanguageTag("");
        java.lang.Object[] objArray38 = new java.lang.Object[] {};
        org.apache.commons.math.MathException mathException39 = new org.apache.commons.math.MathException("hi!", objArray38);
        java.lang.Throwable[] throwableArray40 = mathException39.getSuppressed();
        java.lang.Throwable[] throwableArray41 = mathException39.getSuppressed();
        java.io.PrintWriter printWriter42 = printWriter31.printf(locale35, "it_IT", (java.lang.Object[]) throwableArray41);
        java.io.PrintWriter printWriter43 = printWriter14.format("it_IT", (java.lang.Object[]) throwableArray41);
        java.io.PrintWriter printWriter44 = printWriter11.format("zh_CN", (java.lang.Object[]) throwableArray41);
        java.io.PrintStream printStream46 = new java.io.PrintStream("zh_CN");
        printStream46.print((float) (byte) -1);
        char[] charArray51 = new char[] { 'x', 'u' };
        printStream46.println(charArray51);
        printWriter44.print(charArray51);
        printStream1.print(charArray51);
        java.util.Locale locale55 = java.util.Locale.ROOT;
        java.util.Set<java.lang.String> strSet56 = locale55.getUnicodeLocaleKeys();
        java.io.PrintWriter printWriter59 = new java.io.PrintWriter("fr");
        printWriter59.print("it_IT");
        java.util.Locale locale63 = java.util.Locale.forLanguageTag("");
        java.lang.Object[] objArray66 = new java.lang.Object[] {};
        org.apache.commons.math.MathException mathException67 = new org.apache.commons.math.MathException("hi!", objArray66);
        java.lang.Throwable[] throwableArray68 = mathException67.getSuppressed();
        java.lang.Throwable[] throwableArray69 = mathException67.getSuppressed();
        java.io.PrintWriter printWriter70 = printWriter59.printf(locale63, "it_IT", (java.lang.Object[]) throwableArray69);
        java.io.PrintStream printStream71 = printStream1.format(locale55, "hi!", (java.lang.Object[]) throwableArray69);
        // The following exception was thrown during execution in test generation
        try {
            java.io.PrintStream printStream74 = new java.io.PrintStream((java.io.OutputStream) printStream1, false, "\u5fb7\u6587");
            org.junit.Assert.fail("Expected exception of type java.io.UnsupportedEncodingException; message: ??");
        } catch (java.io.UnsupportedEncodingException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(printWriter11);
        org.junit.Assert.assertNotNull(locale17);
        org.junit.Assert.assertEquals(locale17.toString(), "");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(locale19);
        org.junit.Assert.assertEquals(locale19.toString(), "");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertNotNull(locale21);
        org.junit.Assert.assertEquals(locale21.toString(), "");
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertNotNull(objArray26);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray26), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray26), "[]");
        org.junit.Assert.assertNotNull(printWriter28);
        org.junit.Assert.assertNotNull(locale35);
        org.junit.Assert.assertEquals(locale35.toString(), "");
        org.junit.Assert.assertNotNull(objArray38);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray38), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray38), "[]");
        org.junit.Assert.assertNotNull(throwableArray40);
        org.junit.Assert.assertNotNull(throwableArray41);
        org.junit.Assert.assertNotNull(printWriter42);
        org.junit.Assert.assertNotNull(printWriter43);
        org.junit.Assert.assertNotNull(printWriter44);
        org.junit.Assert.assertNotNull(charArray51);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray51), "xu");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray51), "xu");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray51), "[x, u]");
        org.junit.Assert.assertNotNull(locale55);
        org.junit.Assert.assertEquals(locale55.toString(), "");
        org.junit.Assert.assertNotNull(strSet56);
        org.junit.Assert.assertNotNull(locale63);
        org.junit.Assert.assertEquals(locale63.toString(), "");
        org.junit.Assert.assertNotNull(objArray66);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray66), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray66), "[]");
        org.junit.Assert.assertNotNull(throwableArray68);
        org.junit.Assert.assertNotNull(throwableArray69);
        org.junit.Assert.assertNotNull(printWriter70);
        org.junit.Assert.assertNotNull(printStream71);
    }

    @Test
    public void test00456() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00456");
        java.io.PrintStream printStream1 = new java.io.PrintStream("zh_CN");
        printStream1.print((float) (byte) -1);
        printStream1.println();
        printStream1.println();
        java.io.PrintStream printStream7 = new java.io.PrintStream((java.io.OutputStream) printStream1, true);
        java.io.PrintWriter printWriter9 = new java.io.PrintWriter("fr");
        printWriter9.print("it_IT");
        java.util.Locale locale12 = java.util.Locale.ROOT;
        boolean boolean13 = locale12.hasExtensions();
        java.util.Locale locale14 = java.util.Locale.ROOT;
        java.lang.String str15 = locale12.getDisplayName(locale14);
        java.util.Locale locale16 = java.util.Locale.ROOT;
        boolean boolean17 = locale16.hasExtensions();
        java.lang.String str18 = locale12.getDisplayCountry(locale16);
        java.lang.Object[] objArray21 = new java.lang.Object[] {};
        org.apache.commons.math.MathException mathException22 = new org.apache.commons.math.MathException("hi!", objArray21);
        java.io.PrintWriter printWriter23 = printWriter9.printf(locale16, "it_IT", objArray21);
        printStream7.println((java.lang.Object) "it_IT");
        java.io.PrintStream printStream26 = printStream7.append((java.lang.CharSequence) "fr");
        java.io.PrintStream printStream28 = new java.io.PrintStream((java.io.OutputStream) printStream26, false);
        java.io.PrintWriter printWriter30 = new java.io.PrintWriter((java.io.OutputStream) printStream26, true);
        java.io.PrintStream printStream32 = printStream26.append('x');
        printStream32.print(false);
        // The following exception was thrown during execution in test generation
        try {
            java.io.PrintStream printStream38 = printStream32.append((java.lang.CharSequence) "Chinesisch (Taiwan)", 0, 97);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 97");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(locale12);
        org.junit.Assert.assertEquals(locale12.toString(), "");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(locale14);
        org.junit.Assert.assertEquals(locale14.toString(), "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertNotNull(locale16);
        org.junit.Assert.assertEquals(locale16.toString(), "");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertNotNull(objArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray21), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray21), "[]");
        org.junit.Assert.assertNotNull(printWriter23);
        org.junit.Assert.assertNotNull(printStream26);
        org.junit.Assert.assertNotNull(printStream32);
    }

    @Test
    public void test00457() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00457");
        // The following exception was thrown during execution in test generation
        try {
            java.io.PrintStream printStream2 = new java.io.PrintStream("Frankreich", "English");
            org.junit.Assert.fail("Expected exception of type java.io.UnsupportedEncodingException; message: English");
        } catch (java.io.UnsupportedEncodingException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00458() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00458");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clearExtensions();
        java.util.Locale.Builder builder2 = builder1.clearExtensions();
        java.util.Locale.Builder builder3 = builder1.clear();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder5 = builder3.setLanguage("org.apache.commons.math.MathException: fr");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed language: org.apache.commons.math.MathException: fr [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder3);
    }

    @Test
    public void test00459() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00459");
        java.io.PrintWriter printWriter1 = new java.io.PrintWriter("fr");
        printWriter1.print("it_IT");
        java.util.Locale locale5 = java.util.Locale.forLanguageTag("");
        java.lang.Object[] objArray8 = new java.lang.Object[] {};
        org.apache.commons.math.MathException mathException9 = new org.apache.commons.math.MathException("hi!", objArray8);
        java.lang.Throwable[] throwableArray10 = mathException9.getSuppressed();
        java.lang.Throwable[] throwableArray11 = mathException9.getSuppressed();
        java.io.PrintWriter printWriter12 = printWriter1.printf(locale5, "it_IT", (java.lang.Object[]) throwableArray11);
        java.lang.Object obj13 = locale5.clone();
        org.junit.Assert.assertNotNull(locale5);
        org.junit.Assert.assertEquals(locale5.toString(), "");
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray8), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray8), "[]");
        org.junit.Assert.assertNotNull(throwableArray10);
        org.junit.Assert.assertNotNull(throwableArray11);
        org.junit.Assert.assertNotNull(printWriter12);
        org.junit.Assert.assertNotNull(obj13);
        org.junit.Assert.assertEquals(obj13.toString(), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj13), "");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj13), "");
    }

    @Test
    public void test00460() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00460");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder2 = builder0.setLanguageTag("ita");
        java.util.Locale locale3 = java.util.Locale.JAPANESE;
        java.util.Locale locale4 = java.util.Locale.JAPANESE;
        java.lang.String str5 = locale3.getDisplayCountry(locale4);
        java.lang.String str6 = locale3.getVariant();
        java.util.Locale locale7 = java.util.Locale.CANADA;
        java.lang.String str8 = locale3.getDisplayScript(locale7);
        boolean boolean9 = locale3.hasExtensions();
        java.util.Locale.Builder builder10 = builder0.setLocale(locale3);
        java.util.Locale locale11 = java.util.Locale.JAPANESE;
        java.util.Locale locale12 = java.util.Locale.JAPANESE;
        java.lang.String str13 = locale11.getDisplayCountry(locale12);
        java.lang.String str14 = locale11.getVariant();
        java.util.Locale locale15 = java.util.Locale.CANADA;
        java.lang.String str16 = locale11.getDisplayScript(locale15);
        java.util.Locale locale19 = new java.util.Locale("Italy", "Italy");
        java.lang.String str20 = locale15.getDisplayLanguage(locale19);
        boolean boolean21 = locale15.hasExtensions();
        java.lang.String str22 = locale15.getISO3Language();
        boolean boolean23 = locale15.hasExtensions();
        java.util.Locale.Builder builder24 = builder0.setLocale(locale15);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder26 = builder0.setScript("Chinesisch (Taiwan)");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed script: Chinesisch (Taiwan) [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "ja");
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "ja");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(locale7);
        org.junit.Assert.assertEquals(locale7.toString(), "en_CA");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(locale11);
        org.junit.Assert.assertEquals(locale11.toString(), "ja");
        org.junit.Assert.assertNotNull(locale12);
        org.junit.Assert.assertEquals(locale12.toString(), "ja");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertNotNull(locale15);
        org.junit.Assert.assertEquals(locale15.toString(), "en_CA");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals(locale19.toString(), "italy_ITALY");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "English" + "'", str20, "English");
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "eng" + "'", str22, "eng");
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(builder24);
    }

    @Test
    public void test00461() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00461");
        java.io.PrintWriter printWriter1 = new java.io.PrintWriter("fr");
        java.io.PrintWriter printWriter3 = printWriter1.append(' ');
        java.io.PrintWriter printWriter6 = new java.io.PrintWriter("fr");
        printWriter6.print("it_IT");
        java.util.Locale locale9 = java.util.Locale.ROOT;
        boolean boolean10 = locale9.hasExtensions();
        java.util.Locale locale11 = java.util.Locale.ROOT;
        java.lang.String str12 = locale9.getDisplayName(locale11);
        java.util.Locale locale13 = java.util.Locale.ROOT;
        boolean boolean14 = locale13.hasExtensions();
        java.lang.String str15 = locale9.getDisplayCountry(locale13);
        java.lang.Object[] objArray18 = new java.lang.Object[] {};
        org.apache.commons.math.MathException mathException19 = new org.apache.commons.math.MathException("hi!", objArray18);
        java.io.PrintWriter printWriter20 = printWriter6.printf(locale13, "it_IT", objArray18);
        java.io.PrintWriter printWriter23 = new java.io.PrintWriter("fr");
        printWriter23.print("it_IT");
        java.util.Locale locale27 = java.util.Locale.forLanguageTag("");
        java.lang.Object[] objArray30 = new java.lang.Object[] {};
        org.apache.commons.math.MathException mathException31 = new org.apache.commons.math.MathException("hi!", objArray30);
        java.lang.Throwable[] throwableArray32 = mathException31.getSuppressed();
        java.lang.Throwable[] throwableArray33 = mathException31.getSuppressed();
        java.io.PrintWriter printWriter34 = printWriter23.printf(locale27, "it_IT", (java.lang.Object[]) throwableArray33);
        java.io.PrintWriter printWriter35 = printWriter6.format("it_IT", (java.lang.Object[]) throwableArray33);
        java.io.PrintWriter printWriter36 = printWriter3.format("zh_CN", (java.lang.Object[]) throwableArray33);
        java.io.PrintWriter printWriter39 = new java.io.PrintWriter("fr");
        printWriter39.println();
        java.io.PrintWriter printWriter43 = new java.io.PrintWriter("fr");
        printWriter43.print("it_IT");
        java.util.Locale locale46 = java.util.Locale.ROOT;
        boolean boolean47 = locale46.hasExtensions();
        java.util.Locale locale48 = java.util.Locale.ROOT;
        java.lang.String str49 = locale46.getDisplayName(locale48);
        java.util.Locale locale50 = java.util.Locale.ROOT;
        boolean boolean51 = locale50.hasExtensions();
        java.lang.String str52 = locale46.getDisplayCountry(locale50);
        java.lang.Object[] objArray55 = new java.lang.Object[] {};
        org.apache.commons.math.MathException mathException56 = new org.apache.commons.math.MathException("hi!", objArray55);
        java.io.PrintWriter printWriter57 = printWriter43.printf(locale50, "it_IT", objArray55);
        java.io.PrintWriter printWriter58 = printWriter39.printf("English", objArray55);
        java.io.PrintWriter printWriter59 = printWriter36.format("fran\347ais (France)", objArray55);
        printWriter36.println(10L);
        org.junit.Assert.assertNotNull(printWriter3);
        org.junit.Assert.assertNotNull(locale9);
        org.junit.Assert.assertEquals(locale9.toString(), "");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(locale11);
        org.junit.Assert.assertEquals(locale11.toString(), "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNotNull(locale13);
        org.junit.Assert.assertEquals(locale13.toString(), "");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertNotNull(objArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray18), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray18), "[]");
        org.junit.Assert.assertNotNull(printWriter20);
        org.junit.Assert.assertNotNull(locale27);
        org.junit.Assert.assertEquals(locale27.toString(), "");
        org.junit.Assert.assertNotNull(objArray30);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray30), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray30), "[]");
        org.junit.Assert.assertNotNull(throwableArray32);
        org.junit.Assert.assertNotNull(throwableArray33);
        org.junit.Assert.assertNotNull(printWriter34);
        org.junit.Assert.assertNotNull(printWriter35);
        org.junit.Assert.assertNotNull(printWriter36);
        org.junit.Assert.assertNotNull(locale46);
        org.junit.Assert.assertEquals(locale46.toString(), "");
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertNotNull(locale48);
        org.junit.Assert.assertEquals(locale48.toString(), "");
        org.junit.Assert.assertEquals("'" + str49 + "' != '" + "" + "'", str49, "");
        org.junit.Assert.assertNotNull(locale50);
        org.junit.Assert.assertEquals(locale50.toString(), "");
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertEquals("'" + str52 + "' != '" + "" + "'", str52, "");
        org.junit.Assert.assertNotNull(objArray55);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray55), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray55), "[]");
        org.junit.Assert.assertNotNull(printWriter57);
        org.junit.Assert.assertNotNull(printWriter58);
        org.junit.Assert.assertNotNull(printWriter59);
    }

    @Test
    public void test00462() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00462");
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<java.util.Locale.LanguageRange> languageRangeList2 = java.util.Locale.LanguageRange.parse("\u5fb7\u6587", strMap1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: range=??");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00463() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00463");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clearExtensions();
        java.util.Locale.Builder builder3 = builder0.setScript("");
        java.util.Locale.Builder builder5 = builder3.removeUnicodeLocaleAttribute("Italy");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder7 = builder5.setScript("ko");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed script: ko [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder5);
    }

    @Test
    public void test00464() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00464");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clearExtensions();
        java.util.Locale.Builder builder3 = builder1.setLanguageTag("fr");
        java.util.Locale.Builder builder5 = builder3.setLanguageTag("fr-CA");
        java.util.Locale.Builder builder7 = builder3.setVariant("China");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder9 = builder7.setLanguage("\u82f1\u8a9e");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed language: ?? [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder7);
    }

    @Test
    public void test00465() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00465");
        java.io.PrintWriter printWriter1 = new java.io.PrintWriter("fr");
        printWriter1.print("it_IT");
        java.util.Locale locale4 = java.util.Locale.ROOT;
        boolean boolean5 = locale4.hasExtensions();
        java.util.Locale locale6 = java.util.Locale.ROOT;
        java.lang.String str7 = locale4.getDisplayName(locale6);
        java.util.Locale locale8 = java.util.Locale.ROOT;
        boolean boolean9 = locale8.hasExtensions();
        java.lang.String str10 = locale4.getDisplayCountry(locale8);
        java.lang.Object[] objArray13 = new java.lang.Object[] {};
        org.apache.commons.math.MathException mathException14 = new org.apache.commons.math.MathException("hi!", objArray13);
        java.io.PrintWriter printWriter15 = printWriter1.printf(locale8, "it_IT", objArray13);
        printWriter1.println();
        printWriter1.print(10);
        java.io.PrintWriter printWriter22 = printWriter1.append((java.lang.CharSequence) "fr", (int) (short) 0, (int) (byte) 1);
        java.io.PrintWriter printWriter24 = new java.io.PrintWriter((java.io.Writer) printWriter1, true);
        printWriter1.println(false);
        java.io.PrintWriter printWriter30 = printWriter1.append((java.lang.CharSequence) "Italy", 0, 0);
        printWriter30.flush();
        printWriter30.println('a');
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(locale6);
        org.junit.Assert.assertEquals(locale6.toString(), "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(locale8);
        org.junit.Assert.assertEquals(locale8.toString(), "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(objArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray13), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray13), "[]");
        org.junit.Assert.assertNotNull(printWriter15);
        org.junit.Assert.assertNotNull(printWriter22);
        org.junit.Assert.assertNotNull(printWriter30);
    }

    @Test
    public void test00466() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00466");
        java.util.Locale locale3 = new java.util.Locale("ja", "", "ja");
        java.util.Locale locale4 = java.util.Locale.GERMANY;
        java.util.Set<java.lang.String> strSet5 = locale4.getUnicodeLocaleKeys();
        java.lang.String str6 = locale3.getDisplayCountry(locale4);
        java.lang.String str7 = locale3.getISO3Country();
        java.util.Locale locale8 = locale3.stripExtensions();
        org.junit.Assert.assertEquals(locale3.toString(), "ja__ja");
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "de_DE");
        org.junit.Assert.assertNotNull(strSet5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(locale8);
        org.junit.Assert.assertEquals(locale8.toString(), "ja__ja");
    }

    @Test
    public void test00467() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00467");
        java.io.PrintStream printStream1 = new java.io.PrintStream("zh_CN");
        printStream1.println();
        java.io.PrintStream printStream4 = new java.io.PrintStream("zh_CN");
        printStream4.print((float) (byte) -1);
        printStream4.println();
        printStream4.println();
        java.io.PrintStream printStream10 = new java.io.PrintStream((java.io.OutputStream) printStream4, true);
        java.io.PrintWriter printWriter12 = new java.io.PrintWriter("fr");
        java.io.PrintWriter printWriter14 = printWriter12.append(' ');
        java.io.PrintWriter printWriter17 = new java.io.PrintWriter("fr");
        printWriter17.print("it_IT");
        java.util.Locale locale20 = java.util.Locale.ROOT;
        boolean boolean21 = locale20.hasExtensions();
        java.util.Locale locale22 = java.util.Locale.ROOT;
        java.lang.String str23 = locale20.getDisplayName(locale22);
        java.util.Locale locale24 = java.util.Locale.ROOT;
        boolean boolean25 = locale24.hasExtensions();
        java.lang.String str26 = locale20.getDisplayCountry(locale24);
        java.lang.Object[] objArray29 = new java.lang.Object[] {};
        org.apache.commons.math.MathException mathException30 = new org.apache.commons.math.MathException("hi!", objArray29);
        java.io.PrintWriter printWriter31 = printWriter17.printf(locale24, "it_IT", objArray29);
        java.io.PrintWriter printWriter34 = new java.io.PrintWriter("fr");
        printWriter34.print("it_IT");
        java.util.Locale locale38 = java.util.Locale.forLanguageTag("");
        java.lang.Object[] objArray41 = new java.lang.Object[] {};
        org.apache.commons.math.MathException mathException42 = new org.apache.commons.math.MathException("hi!", objArray41);
        java.lang.Throwable[] throwableArray43 = mathException42.getSuppressed();
        java.lang.Throwable[] throwableArray44 = mathException42.getSuppressed();
        java.io.PrintWriter printWriter45 = printWriter34.printf(locale38, "it_IT", (java.lang.Object[]) throwableArray44);
        java.io.PrintWriter printWriter46 = printWriter17.format("it_IT", (java.lang.Object[]) throwableArray44);
        java.io.PrintWriter printWriter47 = printWriter14.format("zh_CN", (java.lang.Object[]) throwableArray44);
        java.io.PrintStream printStream49 = new java.io.PrintStream("zh_CN");
        printStream49.print((float) (byte) -1);
        char[] charArray54 = new char[] { 'x', 'u' };
        printStream49.println(charArray54);
        printWriter47.print(charArray54);
        printStream4.print(charArray54);
        java.util.Locale locale58 = java.util.Locale.ROOT;
        java.util.Set<java.lang.String> strSet59 = locale58.getUnicodeLocaleKeys();
        java.io.PrintWriter printWriter62 = new java.io.PrintWriter("fr");
        printWriter62.print("it_IT");
        java.util.Locale locale66 = java.util.Locale.forLanguageTag("");
        java.lang.Object[] objArray69 = new java.lang.Object[] {};
        org.apache.commons.math.MathException mathException70 = new org.apache.commons.math.MathException("hi!", objArray69);
        java.lang.Throwable[] throwableArray71 = mathException70.getSuppressed();
        java.lang.Throwable[] throwableArray72 = mathException70.getSuppressed();
        java.io.PrintWriter printWriter73 = printWriter62.printf(locale66, "it_IT", (java.lang.Object[]) throwableArray72);
        java.io.PrintStream printStream74 = printStream4.format(locale58, "hi!", (java.lang.Object[]) throwableArray72);
        java.lang.String str75 = locale58.getLanguage();
        java.lang.Object[] objArray78 = new java.lang.Object[] {};
        org.apache.commons.math.MathException mathException79 = new org.apache.commons.math.MathException("hi!", objArray78);
        java.lang.Throwable[] throwableArray80 = mathException79.getSuppressed();
        java.lang.Throwable[] throwableArray81 = mathException79.getSuppressed();
        java.io.PrintStream printStream82 = printStream1.printf(locale58, "", (java.lang.Object[]) throwableArray81);
        // The following exception was thrown during execution in test generation
        try {
            java.io.PrintStream printStream85 = new java.io.PrintStream((java.io.OutputStream) printStream1, false, "\u65e5\u672c\u8a9e");
            org.junit.Assert.fail("Expected exception of type java.io.UnsupportedEncodingException; message: ???");
        } catch (java.io.UnsupportedEncodingException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(printWriter14);
        org.junit.Assert.assertNotNull(locale20);
        org.junit.Assert.assertEquals(locale20.toString(), "");
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(locale22);
        org.junit.Assert.assertEquals(locale22.toString(), "");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertNotNull(locale24);
        org.junit.Assert.assertEquals(locale24.toString(), "");
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
        org.junit.Assert.assertNotNull(objArray29);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray29), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray29), "[]");
        org.junit.Assert.assertNotNull(printWriter31);
        org.junit.Assert.assertNotNull(locale38);
        org.junit.Assert.assertEquals(locale38.toString(), "");
        org.junit.Assert.assertNotNull(objArray41);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray41), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray41), "[]");
        org.junit.Assert.assertNotNull(throwableArray43);
        org.junit.Assert.assertNotNull(throwableArray44);
        org.junit.Assert.assertNotNull(printWriter45);
        org.junit.Assert.assertNotNull(printWriter46);
        org.junit.Assert.assertNotNull(printWriter47);
        org.junit.Assert.assertNotNull(charArray54);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray54), "xu");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray54), "xu");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray54), "[x, u]");
        org.junit.Assert.assertNotNull(locale58);
        org.junit.Assert.assertEquals(locale58.toString(), "");
        org.junit.Assert.assertNotNull(strSet59);
        org.junit.Assert.assertNotNull(locale66);
        org.junit.Assert.assertEquals(locale66.toString(), "");
        org.junit.Assert.assertNotNull(objArray69);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray69), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray69), "[]");
        org.junit.Assert.assertNotNull(throwableArray71);
        org.junit.Assert.assertNotNull(throwableArray72);
        org.junit.Assert.assertNotNull(printWriter73);
        org.junit.Assert.assertNotNull(printStream74);
        org.junit.Assert.assertEquals("'" + str75 + "' != '" + "" + "'", str75, "");
        org.junit.Assert.assertNotNull(objArray78);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray78), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray78), "[]");
        org.junit.Assert.assertNotNull(throwableArray80);
        org.junit.Assert.assertNotNull(throwableArray81);
        org.junit.Assert.assertNotNull(printStream82);
    }

    @Test
    public void test00468() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00468");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl((int) 'u', (int) (byte) 1, (int) '#');
        int int4 = hypergeometricDistributionImpl3.getPopulationSize();
        double double6 = hypergeometricDistributionImpl3.cumulativeProbability((int) (short) 100);
        int int7 = hypergeometricDistributionImpl3.getPopulationSize();
        double double10 = hypergeometricDistributionImpl3.cumulativeProbability(0, (int) 'a');
        hypergeometricDistributionImpl3.setSampleSize((int) 'a');
        hypergeometricDistributionImpl3.setPopulationSize((int) (byte) 100);
        int int15 = hypergeometricDistributionImpl3.getNumberOfSuccesses();
        double double18 = hypergeometricDistributionImpl3.cumulativeProbability((double) 0L, 0.2991452991452851d);
        // The following exception was thrown during execution in test generation
        try {
            hypergeometricDistributionImpl3.setPopulationSize((int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: population size must be positive.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 117 + "'", int4 == 117);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0d + "'", double6 == 1.0d);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 117 + "'", int7 == 117);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 1.0d + "'", double10 == 1.0d);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 0.02999999999999997d + "'", double18 == 0.02999999999999997d);
    }

    @Test
    public void test00469() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00469");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl((-1), (int) (byte) 1, (int) 'x');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: number of successes must be less than or equal to population size");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00470() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00470");
        java.io.File file0 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.io.PrintWriter printWriter2 = new java.io.PrintWriter(file0, "ko");
            org.junit.Assert.fail("Expected exception of type java.io.UnsupportedEncodingException; message: ko");
        } catch (java.io.UnsupportedEncodingException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00471() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00471");
        java.io.File file0 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.io.PrintStream printStream2 = new java.io.PrintStream(file0, "zh_cn");
            org.junit.Assert.fail("Expected exception of type java.io.UnsupportedEncodingException; message: zh_cn");
        } catch (java.io.UnsupportedEncodingException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00472() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00472");
        java.util.Locale locale0 = java.util.Locale.FRENCH;
        java.util.Set<java.lang.String> strSet1 = locale0.getUnicodeLocaleKeys();
        java.util.Locale locale2 = locale0.stripExtensions();
        java.lang.Object obj3 = locale2.clone();
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "fr");
        org.junit.Assert.assertNotNull(strSet1);
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "fr");
        org.junit.Assert.assertNotNull(obj3);
        org.junit.Assert.assertEquals(obj3.toString(), "fr");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj3), "fr");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj3), "fr");
    }

    @Test
    public void test00473() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00473");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl((int) 'u', (int) (byte) 1, (int) '#');
        int int4 = hypergeometricDistributionImpl3.getPopulationSize();
        double double6 = hypergeometricDistributionImpl3.cumulativeProbability((int) (short) 100);
        int int7 = hypergeometricDistributionImpl3.getPopulationSize();
        double double9 = hypergeometricDistributionImpl3.cumulativeProbability((int) '4');
        int int10 = hypergeometricDistributionImpl3.getNumberOfSuccesses();
        hypergeometricDistributionImpl3.setPopulationSize((int) (short) 100);
        double double15 = hypergeometricDistributionImpl3.cumulativeProbability(0.0d, (double) (short) 100);
        hypergeometricDistributionImpl3.setNumberOfSuccesses(35);
        int int18 = hypergeometricDistributionImpl3.getNumberOfSuccesses();
        // The following exception was thrown during execution in test generation
        try {
            int int20 = hypergeometricDistributionImpl3.inverseCumulativeProbability((double) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: p must be between 0 and 1.0 (inclusive)");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 117 + "'", int4 == 117);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0d + "'", double6 == 1.0d);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 117 + "'", int7 == 117);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.0d + "'", double9 == 1.0d);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 1.0d + "'", double15 == 1.0d);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 35 + "'", int18 == 35);
    }

    @Test
    public void test00474() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00474");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl((int) 'u', (int) (byte) 1, (int) '#');
        int int4 = hypergeometricDistributionImpl3.getPopulationSize();
        int int5 = hypergeometricDistributionImpl3.getPopulationSize();
        double double7 = hypergeometricDistributionImpl3.cumulativeProbability((int) '4');
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 117 + "'", int4 == 117);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 117 + "'", int5 == 117);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
    }

    @Test
    public void test00475() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00475");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl((int) (byte) 100, (int) (byte) 1, (int) (byte) 1);
    }

    @Test
    public void test00476() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00476");
        java.util.Locale.LanguageRange languageRange2 = new java.util.Locale.LanguageRange("ita", (double) 0L);
        java.lang.Object obj3 = null;
        boolean boolean4 = languageRange2.equals(obj3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test00477() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00477");
        // The following exception was thrown during execution in test generation
        try {
            java.io.PrintStream printStream2 = new java.io.PrintStream("english", "english");
            org.junit.Assert.fail("Expected exception of type java.io.UnsupportedEncodingException; message: english");
        } catch (java.io.UnsupportedEncodingException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00478() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00478");
        java.util.Locale.LanguageRange[] languageRangeArray0 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList1 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList1, languageRangeArray0);
        java.util.Collection<java.util.Locale> localeCollection3 = null;
        java.util.Locale locale4 = java.util.Locale.lookup((java.util.List<java.util.Locale.LanguageRange>) languageRangeList1, localeCollection3);
        java.lang.String[] strArray6 = new java.lang.String[] { "hi!" };
        java.util.ArrayList<java.lang.String> strList7 = new java.util.ArrayList<java.lang.String>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList7, strArray6);
        java.lang.String str9 = java.util.Locale.lookupTag((java.util.List<java.util.Locale.LanguageRange>) languageRangeList1, (java.util.Collection<java.lang.String>) strList7);
        java.util.Locale locale10 = java.util.Locale.ROOT;
        boolean boolean11 = locale10.hasExtensions();
        java.lang.String str12 = locale10.getCountry();
        java.util.Locale locale13 = java.util.Locale.JAPAN;
        java.util.Locale locale14 = java.util.Locale.FRENCH;
        java.util.Locale locale18 = new java.util.Locale("", "", "");
        java.util.Locale[] localeArray19 = new java.util.Locale[] { locale10, locale13, locale14, locale18 };
        java.util.ArrayList<java.util.Locale> localeList20 = new java.util.ArrayList<java.util.Locale>();
        boolean boolean21 = java.util.Collections.addAll((java.util.Collection<java.util.Locale>) localeList20, localeArray19);
        java.util.List<java.util.Locale> localeList22 = java.util.Locale.filter((java.util.List<java.util.Locale.LanguageRange>) languageRangeList1, (java.util.Collection<java.util.Locale>) localeList20);
        java.util.Locale.LanguageRange[] languageRangeArray23 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList24 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean25 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList24, languageRangeArray23);
        java.util.Collection<java.util.Locale> localeCollection26 = null;
        java.util.Locale locale27 = java.util.Locale.lookup((java.util.List<java.util.Locale.LanguageRange>) languageRangeList24, localeCollection26);
        java.lang.String[] strArray29 = new java.lang.String[] { "hi!" };
        java.util.ArrayList<java.lang.String> strList30 = new java.util.ArrayList<java.lang.String>();
        boolean boolean31 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList30, strArray29);
        java.lang.String str32 = java.util.Locale.lookupTag((java.util.List<java.util.Locale.LanguageRange>) languageRangeList24, (java.util.Collection<java.lang.String>) strList30);
        java.util.Locale locale33 = java.util.Locale.ROOT;
        boolean boolean34 = locale33.hasExtensions();
        java.lang.String str35 = locale33.getCountry();
        java.util.Locale locale36 = java.util.Locale.JAPAN;
        java.util.Locale locale37 = java.util.Locale.FRENCH;
        java.util.Locale locale41 = new java.util.Locale("", "", "");
        java.util.Locale[] localeArray42 = new java.util.Locale[] { locale33, locale36, locale37, locale41 };
        java.util.ArrayList<java.util.Locale> localeList43 = new java.util.ArrayList<java.util.Locale>();
        boolean boolean44 = java.util.Collections.addAll((java.util.Collection<java.util.Locale>) localeList43, localeArray42);
        java.util.List<java.util.Locale> localeList45 = java.util.Locale.filter((java.util.List<java.util.Locale.LanguageRange>) languageRangeList24, (java.util.Collection<java.util.Locale>) localeList43);
        java.util.List<java.util.Locale> localeList46 = java.util.Locale.filter((java.util.List<java.util.Locale.LanguageRange>) languageRangeList1, (java.util.Collection<java.util.Locale>) localeList45);
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap47 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList48 = java.util.Locale.LanguageRange.mapEquivalents((java.util.List<java.util.Locale.LanguageRange>) languageRangeList1, strMap47);
        java.util.Locale.LanguageRange[] languageRangeArray49 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList50 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean51 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList50, languageRangeArray49);
        java.util.Collection<java.util.Locale> localeCollection52 = null;
        java.util.Locale locale53 = java.util.Locale.lookup((java.util.List<java.util.Locale.LanguageRange>) languageRangeList50, localeCollection52);
        java.lang.String[] strArray55 = new java.lang.String[] { "hi!" };
        java.util.ArrayList<java.lang.String> strList56 = new java.util.ArrayList<java.lang.String>();
        boolean boolean57 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList56, strArray55);
        java.lang.String str58 = java.util.Locale.lookupTag((java.util.List<java.util.Locale.LanguageRange>) languageRangeList50, (java.util.Collection<java.lang.String>) strList56);
        java.util.Locale locale59 = java.util.Locale.ROOT;
        boolean boolean60 = locale59.hasExtensions();
        java.lang.String str61 = locale59.getCountry();
        java.util.Locale locale62 = java.util.Locale.JAPAN;
        java.util.Locale locale63 = java.util.Locale.FRENCH;
        java.util.Locale locale67 = new java.util.Locale("", "", "");
        java.util.Locale[] localeArray68 = new java.util.Locale[] { locale59, locale62, locale63, locale67 };
        java.util.ArrayList<java.util.Locale> localeList69 = new java.util.ArrayList<java.util.Locale>();
        boolean boolean70 = java.util.Collections.addAll((java.util.Collection<java.util.Locale>) localeList69, localeArray68);
        java.util.List<java.util.Locale> localeList71 = java.util.Locale.filter((java.util.List<java.util.Locale.LanguageRange>) languageRangeList50, (java.util.Collection<java.util.Locale>) localeList69);
        java.util.Locale.FilteringMode filteringMode72 = java.util.Locale.FilteringMode.REJECT_EXTENDED_RANGES;
        java.util.List<java.util.Locale> localeList73 = java.util.Locale.filter(languageRangeList48, (java.util.Collection<java.util.Locale>) localeList69, filteringMode72);
        java.util.Locale.LanguageRange languageRange75 = new java.util.Locale.LanguageRange("en-GB");
        java.util.Locale.LanguageRange languageRange78 = new java.util.Locale.LanguageRange("English", (double) 0);
        java.util.Locale.LanguageRange[] languageRangeArray79 = new java.util.Locale.LanguageRange[] { languageRange75, languageRange78 };
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList80 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean81 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList80, languageRangeArray79);
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap82 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList83 = java.util.Locale.LanguageRange.mapEquivalents((java.util.List<java.util.Locale.LanguageRange>) languageRangeList80, strMap82);
        java.util.Locale.LanguageRange[] languageRangeArray84 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList85 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean86 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList85, languageRangeArray84);
        java.util.Collection<java.util.Locale> localeCollection87 = null;
        java.util.Locale locale88 = java.util.Locale.lookup((java.util.List<java.util.Locale.LanguageRange>) languageRangeList85, localeCollection87);
        java.lang.String[] strArray94 = new java.lang.String[] { "hi!", "", "it_IT", "Italy", "" };
        java.util.ArrayList<java.lang.String> strList95 = new java.util.ArrayList<java.lang.String>();
        boolean boolean96 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList95, strArray94);
        java.util.List<java.lang.String> strList97 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList85, (java.util.Collection<java.lang.String>) strList95);
        java.util.List<java.lang.String> strList98 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList80, (java.util.Collection<java.lang.String>) strList97);
        java.lang.String str99 = java.util.Locale.lookupTag(languageRangeList48, (java.util.Collection<java.lang.String>) strList97);
        org.junit.Assert.assertNotNull(languageRangeArray0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(locale4);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNotNull(locale10);
        org.junit.Assert.assertEquals(locale10.toString(), "");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNotNull(locale13);
        org.junit.Assert.assertEquals(locale13.toString(), "ja_JP");
        org.junit.Assert.assertNotNull(locale14);
        org.junit.Assert.assertEquals(locale14.toString(), "fr");
        org.junit.Assert.assertEquals(locale18.toString(), "");
        org.junit.Assert.assertNotNull(localeArray19);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertNotNull(localeList22);
        org.junit.Assert.assertNotNull(languageRangeArray23);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNull(locale27);
        org.junit.Assert.assertNotNull(strArray29);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
        org.junit.Assert.assertNull(str32);
        org.junit.Assert.assertNotNull(locale33);
        org.junit.Assert.assertEquals(locale33.toString(), "");
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "" + "'", str35, "");
        org.junit.Assert.assertNotNull(locale36);
        org.junit.Assert.assertEquals(locale36.toString(), "ja_JP");
        org.junit.Assert.assertNotNull(locale37);
        org.junit.Assert.assertEquals(locale37.toString(), "fr");
        org.junit.Assert.assertEquals(locale41.toString(), "");
        org.junit.Assert.assertNotNull(localeArray42);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + true + "'", boolean44 == true);
        org.junit.Assert.assertNotNull(localeList45);
        org.junit.Assert.assertNotNull(localeList46);
        org.junit.Assert.assertNotNull(languageRangeList48);
        org.junit.Assert.assertNotNull(languageRangeArray49);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertNull(locale53);
        org.junit.Assert.assertNotNull(strArray55);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + true + "'", boolean57 == true);
        org.junit.Assert.assertNull(str58);
        org.junit.Assert.assertNotNull(locale59);
        org.junit.Assert.assertEquals(locale59.toString(), "");
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + false + "'", boolean60 == false);
        org.junit.Assert.assertEquals("'" + str61 + "' != '" + "" + "'", str61, "");
        org.junit.Assert.assertNotNull(locale62);
        org.junit.Assert.assertEquals(locale62.toString(), "ja_JP");
        org.junit.Assert.assertNotNull(locale63);
        org.junit.Assert.assertEquals(locale63.toString(), "fr");
        org.junit.Assert.assertEquals(locale67.toString(), "");
        org.junit.Assert.assertNotNull(localeArray68);
        org.junit.Assert.assertTrue("'" + boolean70 + "' != '" + true + "'", boolean70 == true);
        org.junit.Assert.assertNotNull(localeList71);
        org.junit.Assert.assertTrue("'" + filteringMode72 + "' != '" + java.util.Locale.FilteringMode.REJECT_EXTENDED_RANGES + "'", filteringMode72.equals(java.util.Locale.FilteringMode.REJECT_EXTENDED_RANGES));
        org.junit.Assert.assertNotNull(localeList73);
        org.junit.Assert.assertNotNull(languageRangeArray79);
        org.junit.Assert.assertTrue("'" + boolean81 + "' != '" + true + "'", boolean81 == true);
        org.junit.Assert.assertNotNull(languageRangeList83);
        org.junit.Assert.assertNotNull(languageRangeArray84);
        org.junit.Assert.assertTrue("'" + boolean86 + "' != '" + false + "'", boolean86 == false);
        org.junit.Assert.assertNull(locale88);
        org.junit.Assert.assertNotNull(strArray94);
        org.junit.Assert.assertTrue("'" + boolean96 + "' != '" + true + "'", boolean96 == true);
        org.junit.Assert.assertNotNull(strList97);
        org.junit.Assert.assertNotNull(strList98);
        org.junit.Assert.assertNull(str99);
    }

    @Test
    public void test00479() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00479");
        org.apache.commons.math.MathException mathException1 = new org.apache.commons.math.MathException("italien (Italie)");
        java.lang.String str2 = mathException1.toString();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "org.apache.commons.math.MathException: italien (Italie)" + "'", str2, "org.apache.commons.math.MathException: italien (Italie)");
    }

    @Test
    public void test00480() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00480");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl((int) 'u', (int) (byte) 1, (int) '#');
        int int4 = hypergeometricDistributionImpl3.getSampleSize();
        int int5 = hypergeometricDistributionImpl3.getPopulationSize();
        double double7 = hypergeometricDistributionImpl3.upperCumulativeProbability((int) '#');
        int int8 = hypergeometricDistributionImpl3.getPopulationSize();
        int int9 = hypergeometricDistributionImpl3.getPopulationSize();
        double double12 = hypergeometricDistributionImpl3.cumulativeProbability((double) (short) 0, (double) 'a');
        int int13 = hypergeometricDistributionImpl3.getPopulationSize();
        double double16 = hypergeometricDistributionImpl3.cumulativeProbability(1, (int) (short) 10);
        hypergeometricDistributionImpl3.setPopulationSize((int) (short) 10);
        // The following exception was thrown during execution in test generation
        try {
            hypergeometricDistributionImpl3.setPopulationSize((-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: population size must be positive.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 35 + "'", int4 == 35);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 117 + "'", int5 == 117);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 117 + "'", int8 == 117);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 117 + "'", int9 == 117);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 1.0d + "'", double12 == 1.0d);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 117 + "'", int13 == 117);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.2991452991453134d + "'", double16 == 0.2991452991453134d);
    }

    @Test
    public void test00481() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00481");
        java.io.PrintStream printStream1 = new java.io.PrintStream("zh_CN");
        printStream1.print((float) (byte) -1);
        char[] charArray6 = new char[] { 'x', 'u' };
        printStream1.println(charArray6);
        java.util.Locale locale10 = new java.util.Locale("en-GB", "Italy");
        java.lang.String str11 = locale10.getCountry();
        java.io.PrintStream printStream14 = new java.io.PrintStream("zh_CN");
        printStream14.print((float) (byte) -1);
        printStream14.println();
        java.lang.Throwable throwable19 = null;
        org.apache.commons.math.MathException mathException20 = new org.apache.commons.math.MathException(throwable19);
        org.apache.commons.math.MathException mathException21 = new org.apache.commons.math.MathException((java.lang.Throwable) mathException20);
        java.lang.Throwable[] throwableArray22 = mathException20.getSuppressed();
        java.io.PrintStream printStream23 = printStream14.format("italien (Italie)", (java.lang.Object[]) throwableArray22);
        java.io.PrintStream printStream24 = printStream1.printf(locale10, "fr-CA", (java.lang.Object[]) throwableArray22);
        java.io.PrintWriter printWriter26 = new java.io.PrintWriter("fr");
        java.io.PrintWriter printWriter28 = printWriter26.append(' ');
        printWriter26.println(false);
        java.io.PrintWriter printWriter32 = new java.io.PrintWriter("fr");
        printWriter32.write("hi!");
        java.io.PrintWriter printWriter36 = new java.io.PrintWriter("fr");
        printWriter36.print("it_IT");
        java.lang.Object[] objArray40 = new java.lang.Object[] {};
        java.io.PrintWriter printWriter41 = printWriter36.printf("fr", objArray40);
        printWriter41.print((float) (byte) 100);
        java.io.PrintWriter printWriter45 = printWriter41.append((java.lang.CharSequence) "ja");
        java.io.PrintWriter printWriter47 = new java.io.PrintWriter("fr");
        java.io.PrintWriter printWriter49 = printWriter47.append(' ');
        java.io.PrintWriter printWriter52 = new java.io.PrintWriter("fr");
        printWriter52.print("it_IT");
        java.util.Locale locale55 = java.util.Locale.ROOT;
        boolean boolean56 = locale55.hasExtensions();
        java.util.Locale locale57 = java.util.Locale.ROOT;
        java.lang.String str58 = locale55.getDisplayName(locale57);
        java.util.Locale locale59 = java.util.Locale.ROOT;
        boolean boolean60 = locale59.hasExtensions();
        java.lang.String str61 = locale55.getDisplayCountry(locale59);
        java.lang.Object[] objArray64 = new java.lang.Object[] {};
        org.apache.commons.math.MathException mathException65 = new org.apache.commons.math.MathException("hi!", objArray64);
        java.io.PrintWriter printWriter66 = printWriter52.printf(locale59, "it_IT", objArray64);
        java.io.PrintWriter printWriter69 = new java.io.PrintWriter("fr");
        printWriter69.print("it_IT");
        java.util.Locale locale73 = java.util.Locale.forLanguageTag("");
        java.lang.Object[] objArray76 = new java.lang.Object[] {};
        org.apache.commons.math.MathException mathException77 = new org.apache.commons.math.MathException("hi!", objArray76);
        java.lang.Throwable[] throwableArray78 = mathException77.getSuppressed();
        java.lang.Throwable[] throwableArray79 = mathException77.getSuppressed();
        java.io.PrintWriter printWriter80 = printWriter69.printf(locale73, "it_IT", (java.lang.Object[]) throwableArray79);
        java.io.PrintWriter printWriter81 = printWriter52.format("it_IT", (java.lang.Object[]) throwableArray79);
        java.io.PrintWriter printWriter82 = printWriter49.format("zh_CN", (java.lang.Object[]) throwableArray79);
        java.io.PrintStream printStream84 = new java.io.PrintStream("zh_CN");
        printStream84.print((float) (byte) -1);
        char[] charArray89 = new char[] { 'x', 'u' };
        printStream84.println(charArray89);
        printWriter82.print(charArray89);
        printWriter45.write(charArray89);
        printWriter32.println(charArray89);
        printWriter26.write(charArray89);
        printStream1.print(charArray89);
        printStream1.print((int) '#');
        java.io.PrintStream printStream99 = new java.io.PrintStream((java.io.OutputStream) printStream1, false);
        org.junit.Assert.assertNotNull(charArray6);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray6), "xu");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray6), "xu");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray6), "[x, u]");
        org.junit.Assert.assertEquals(locale10.toString(), "en-gb_ITALY");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "ITALY" + "'", str11, "ITALY");
        org.junit.Assert.assertNotNull(throwableArray22);
        org.junit.Assert.assertNotNull(printStream23);
        org.junit.Assert.assertNotNull(printStream24);
        org.junit.Assert.assertNotNull(printWriter28);
        org.junit.Assert.assertNotNull(objArray40);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray40), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray40), "[]");
        org.junit.Assert.assertNotNull(printWriter41);
        org.junit.Assert.assertNotNull(printWriter45);
        org.junit.Assert.assertNotNull(printWriter49);
        org.junit.Assert.assertNotNull(locale55);
        org.junit.Assert.assertEquals(locale55.toString(), "");
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
        org.junit.Assert.assertNotNull(locale57);
        org.junit.Assert.assertEquals(locale57.toString(), "");
        org.junit.Assert.assertEquals("'" + str58 + "' != '" + "" + "'", str58, "");
        org.junit.Assert.assertNotNull(locale59);
        org.junit.Assert.assertEquals(locale59.toString(), "");
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + false + "'", boolean60 == false);
        org.junit.Assert.assertEquals("'" + str61 + "' != '" + "" + "'", str61, "");
        org.junit.Assert.assertNotNull(objArray64);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray64), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray64), "[]");
        org.junit.Assert.assertNotNull(printWriter66);
        org.junit.Assert.assertNotNull(locale73);
        org.junit.Assert.assertEquals(locale73.toString(), "");
        org.junit.Assert.assertNotNull(objArray76);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray76), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray76), "[]");
        org.junit.Assert.assertNotNull(throwableArray78);
        org.junit.Assert.assertNotNull(throwableArray79);
        org.junit.Assert.assertNotNull(printWriter80);
        org.junit.Assert.assertNotNull(printWriter81);
        org.junit.Assert.assertNotNull(printWriter82);
        org.junit.Assert.assertNotNull(charArray89);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray89), "xu");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray89), "xu");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray89), "[x, u]");
    }

    @Test
    public void test00482() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00482");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clearExtensions();
        java.util.Locale.Builder builder3 = builder0.setScript("");
        java.util.Locale.Builder builder5 = builder3.removeUnicodeLocaleAttribute("Italy");
        java.util.Locale.Builder builder7 = builder3.setRegion("ja");
        java.util.Locale.Builder builder10 = builder3.setExtension('u', "it_IT");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder12 = builder3.setVariant("italiano (Italia)");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed variant: italiano (Italia) [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(builder10);
    }

    @Test
    public void test00483() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00483");
        java.io.PrintWriter printWriter1 = new java.io.PrintWriter("fr");
        printWriter1.println();
        java.lang.Object obj3 = null;
        printWriter1.print(obj3);
        java.lang.Object[] objArray8 = new java.lang.Object[] {};
        org.apache.commons.math.MathException mathException9 = new org.apache.commons.math.MathException("hi!", objArray8);
        org.apache.commons.math.MathException mathException10 = new org.apache.commons.math.MathException("fr", objArray8);
        java.lang.Throwable[] throwableArray11 = mathException10.getSuppressed();
        java.io.PrintWriter printWriter12 = printWriter1.printf("ita", (java.lang.Object[]) throwableArray11);
        java.util.Locale.Category category13 = java.util.Locale.Category.FORMAT;
        java.util.Locale locale14 = java.util.Locale.GERMANY;
        java.util.Set<java.lang.String> strSet15 = locale14.getUnicodeLocaleKeys();
        java.util.Locale.setDefault(category13, locale14);
        java.util.Locale locale17 = java.util.Locale.getDefault(category13);
        java.io.PrintStream printStream20 = new java.io.PrintStream("ita");
        java.lang.Throwable throwable23 = null;
        org.apache.commons.math.MathException mathException24 = new org.apache.commons.math.MathException(throwable23);
        org.apache.commons.math.MathException mathException25 = new org.apache.commons.math.MathException((java.lang.Throwable) mathException24);
        java.lang.Throwable[] throwableArray26 = mathException24.getSuppressed();
        java.io.PrintStream printStream29 = new java.io.PrintStream("zh_CN");
        printStream29.print((float) (byte) -1);
        printStream29.println();
        printStream29.print("ita");
        java.util.Locale locale35 = java.util.Locale.FRENCH;
        java.util.Set<java.lang.String> strSet36 = locale35.getUnicodeLocaleKeys();
        java.util.Locale locale37 = locale35.stripExtensions();
        java.lang.Object[] objArray40 = new java.lang.Object[] {};
        org.apache.commons.math.MathException mathException41 = new org.apache.commons.math.MathException("hi!", objArray40);
        java.lang.Throwable[] throwableArray42 = mathException41.getSuppressed();
        java.lang.Throwable[] throwableArray43 = mathException41.getSuppressed();
        java.io.PrintStream printStream44 = printStream29.printf(locale37, "fr", (java.lang.Object[]) throwableArray43);
        org.apache.commons.math.MathException mathException45 = new org.apache.commons.math.MathException("org.apache.commons.math.MathException", (java.lang.Object[]) throwableArray43);
        org.apache.commons.math.MathException mathException46 = new org.apache.commons.math.MathException("", (java.lang.Object[]) throwableArray26, (java.lang.Throwable) mathException45);
        java.io.PrintStream printStream47 = printStream20.printf("ita", (java.lang.Object[]) throwableArray26);
        java.io.PrintWriter printWriter48 = printWriter12.format(locale17, "italien (Italie)", (java.lang.Object[]) throwableArray26);
        printWriter12.print(' ');
        printWriter12.println("ko");
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray8), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray8), "[]");
        org.junit.Assert.assertNotNull(throwableArray11);
        org.junit.Assert.assertNotNull(printWriter12);
        org.junit.Assert.assertTrue("'" + category13 + "' != '" + java.util.Locale.Category.FORMAT + "'", category13.equals(java.util.Locale.Category.FORMAT));
        org.junit.Assert.assertNotNull(locale14);
        org.junit.Assert.assertEquals(locale14.toString(), "de_DE");
        org.junit.Assert.assertNotNull(strSet15);
        org.junit.Assert.assertNotNull(locale17);
        org.junit.Assert.assertEquals(locale17.toString(), "de_DE");
        org.junit.Assert.assertNotNull(throwableArray26);
        org.junit.Assert.assertNotNull(locale35);
        org.junit.Assert.assertEquals(locale35.toString(), "fr");
        org.junit.Assert.assertNotNull(strSet36);
        org.junit.Assert.assertNotNull(locale37);
        org.junit.Assert.assertEquals(locale37.toString(), "fr");
        org.junit.Assert.assertNotNull(objArray40);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray40), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray40), "[]");
        org.junit.Assert.assertNotNull(throwableArray42);
        org.junit.Assert.assertNotNull(throwableArray43);
        org.junit.Assert.assertNotNull(printStream44);
        org.junit.Assert.assertNotNull(printStream47);
        org.junit.Assert.assertNotNull(printWriter48);
    }

    @Test
    public void test00484() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00484");
        java.io.PrintStream printStream2 = new java.io.PrintStream("zh_CN");
        printStream2.print((float) (byte) -1);
        printStream2.println();
        printStream2.println();
        java.io.PrintStream printStream8 = new java.io.PrintStream((java.io.OutputStream) printStream2, true);
        printStream2.println();
        printStream2.print((-1));
        java.io.PrintStream printStream13 = new java.io.PrintStream("zh_CN");
        printStream13.println();
        java.io.PrintStream printStream16 = printStream13.append('#');
        printStream13.close();
        byte[] byteArray21 = new byte[] { (byte) 1, (byte) 10, (byte) -1 };
        printStream13.write(byteArray21);
        printStream2.write(byteArray21);
        java.util.Locale locale25 = java.util.Locale.forLanguageTag("italien");
        java.io.PrintWriter printWriter29 = new java.io.PrintWriter("fr");
        printWriter29.print("it_IT");
        java.util.Locale locale32 = java.util.Locale.ROOT;
        boolean boolean33 = locale32.hasExtensions();
        java.util.Locale locale34 = java.util.Locale.ROOT;
        java.lang.String str35 = locale32.getDisplayName(locale34);
        java.util.Locale locale36 = java.util.Locale.ROOT;
        boolean boolean37 = locale36.hasExtensions();
        java.lang.String str38 = locale32.getDisplayCountry(locale36);
        java.lang.Object[] objArray41 = new java.lang.Object[] {};
        org.apache.commons.math.MathException mathException42 = new org.apache.commons.math.MathException("hi!", objArray41);
        java.io.PrintWriter printWriter43 = printWriter29.printf(locale36, "it_IT", objArray41);
        org.apache.commons.math.MathException mathException44 = new org.apache.commons.math.MathException("", objArray41);
        org.apache.commons.math.MathException mathException45 = new org.apache.commons.math.MathException((java.lang.Throwable) mathException44);
        java.lang.Object[] objArray46 = mathException44.getArguments();
        java.io.PrintStream printStream47 = printStream2.printf(locale25, "it_IT", objArray46);
        java.lang.Object[] objArray49 = new java.lang.Object[] {};
        org.apache.commons.math.MathException mathException50 = new org.apache.commons.math.MathException("hi!", objArray49);
        org.apache.commons.math.MathException mathException51 = new org.apache.commons.math.MathException((java.lang.Throwable) mathException50);
        java.lang.Object[] objArray54 = new java.lang.Object[] {};
        org.apache.commons.math.MathException mathException55 = new org.apache.commons.math.MathException("hi!", objArray54);
        java.lang.Throwable[] throwableArray56 = mathException55.getSuppressed();
        org.apache.commons.math.MathException mathException57 = new org.apache.commons.math.MathException("fr", (java.lang.Object[]) throwableArray56);
        mathException50.addSuppressed((java.lang.Throwable) mathException57);
        org.apache.commons.math.MathException mathException59 = new org.apache.commons.math.MathException((java.lang.Throwable) mathException50);
        org.apache.commons.math.MathException mathException60 = new org.apache.commons.math.MathException("italiano (Italia)", objArray46, (java.lang.Throwable) mathException50);
        java.lang.Object[] objArray63 = new java.lang.Object[] {};
        org.apache.commons.math.MathException mathException64 = new org.apache.commons.math.MathException("hi!", objArray63);
        org.apache.commons.math.MathException mathException65 = new org.apache.commons.math.MathException("fr", objArray63);
        java.lang.Throwable[] throwableArray66 = mathException65.getSuppressed();
        java.lang.Object[] objArray67 = mathException65.getArguments();
        mathException50.addSuppressed((java.lang.Throwable) mathException65);
        org.junit.Assert.assertNotNull(printStream16);
        org.junit.Assert.assertNotNull(byteArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray21), "[1, 10, -1]");
        org.junit.Assert.assertNotNull(locale25);
        org.junit.Assert.assertEquals(locale25.toString(), "italien");
        org.junit.Assert.assertNotNull(locale32);
        org.junit.Assert.assertEquals(locale32.toString(), "");
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertNotNull(locale34);
        org.junit.Assert.assertEquals(locale34.toString(), "");
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "" + "'", str35, "");
        org.junit.Assert.assertNotNull(locale36);
        org.junit.Assert.assertEquals(locale36.toString(), "");
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "" + "'", str38, "");
        org.junit.Assert.assertNotNull(objArray41);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray41), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray41), "[]");
        org.junit.Assert.assertNotNull(printWriter43);
        org.junit.Assert.assertNotNull(objArray46);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray46), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray46), "[]");
        org.junit.Assert.assertNotNull(printStream47);
        org.junit.Assert.assertNotNull(objArray49);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray49), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray49), "[]");
        org.junit.Assert.assertNotNull(objArray54);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray54), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray54), "[]");
        org.junit.Assert.assertNotNull(throwableArray56);
        org.junit.Assert.assertNotNull(objArray63);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray63), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray63), "[]");
        org.junit.Assert.assertNotNull(throwableArray66);
        org.junit.Assert.assertNotNull(objArray67);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray67), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray67), "[]");
    }

    @Test
    public void test00485() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00485");
        java.io.PrintWriter printWriter1 = new java.io.PrintWriter("fr");
        printWriter1.print("it_IT");
        java.lang.Object[] objArray5 = new java.lang.Object[] {};
        java.io.PrintWriter printWriter6 = printWriter1.printf("fr", objArray5);
        printWriter1.println((float) 'u');
        printWriter1.println("English");
        printWriter1.write("");
        printWriter1.print("italiano");
        printWriter1.write("und");
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray5), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray5), "[]");
        org.junit.Assert.assertNotNull(printWriter6);
    }

    @Test
    public void test00486() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00486");
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<java.util.Locale.LanguageRange> languageRangeList1 = java.util.Locale.LanguageRange.parse("Frankreich");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: range=frankreich");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00487() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00487");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder2 = builder0.setLanguageTag("ita");
        java.util.Locale locale3 = java.util.Locale.JAPANESE;
        java.util.Locale locale4 = java.util.Locale.JAPANESE;
        java.lang.String str5 = locale3.getDisplayCountry(locale4);
        java.lang.String str6 = locale3.getVariant();
        java.util.Locale locale7 = java.util.Locale.CANADA;
        java.lang.String str8 = locale3.getDisplayScript(locale7);
        boolean boolean9 = locale3.hasExtensions();
        java.util.Locale.Builder builder10 = builder0.setLocale(locale3);
        java.util.Locale locale11 = java.util.Locale.JAPANESE;
        java.util.Locale locale12 = java.util.Locale.JAPANESE;
        java.lang.String str13 = locale11.getDisplayCountry(locale12);
        java.lang.String str14 = locale11.getVariant();
        java.util.Locale locale15 = java.util.Locale.CANADA;
        java.lang.String str16 = locale11.getDisplayScript(locale15);
        java.util.Locale locale19 = new java.util.Locale("Italy", "Italy");
        java.lang.String str20 = locale15.getDisplayLanguage(locale19);
        boolean boolean21 = locale15.hasExtensions();
        java.lang.String str22 = locale15.getISO3Language();
        boolean boolean23 = locale15.hasExtensions();
        java.util.Locale.Builder builder24 = builder0.setLocale(locale15);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder26 = builder24.removeUnicodeLocaleAttribute("Chinese (Taiwan)");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed Unicode locale attribute: Chinese (Taiwan) [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "ja");
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "ja");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(locale7);
        org.junit.Assert.assertEquals(locale7.toString(), "en_CA");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(locale11);
        org.junit.Assert.assertEquals(locale11.toString(), "ja");
        org.junit.Assert.assertNotNull(locale12);
        org.junit.Assert.assertEquals(locale12.toString(), "ja");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertNotNull(locale15);
        org.junit.Assert.assertEquals(locale15.toString(), "en_CA");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals(locale19.toString(), "italy_ITALY");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "English" + "'", str20, "English");
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "eng" + "'", str22, "eng");
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(builder24);
    }

    @Test
    public void test00488() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00488");
        java.io.File file0 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.io.PrintStream printStream2 = new java.io.PrintStream(file0, "\u4e2d\u56fd\u8a9e");
            org.junit.Assert.fail("Expected exception of type java.io.UnsupportedEncodingException; message: ???");
        } catch (java.io.UnsupportedEncodingException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00489() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00489");
        java.io.PrintStream printStream1 = new java.io.PrintStream("zh_CN");
        printStream1.print((float) (byte) -1);
        printStream1.println();
        printStream1.println();
        printStream1.println((float) ' ');
        printStream1.print((long) 'u');
        printStream1.println((long) 'x');
        // The following exception was thrown during execution in test generation
        try {
            java.io.PrintStream printStream14 = new java.io.PrintStream((java.io.OutputStream) printStream1, true, "it-IT");
            org.junit.Assert.fail("Expected exception of type java.io.UnsupportedEncodingException; message: it-IT");
        } catch (java.io.UnsupportedEncodingException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00490() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00490");
        java.lang.Object[] objArray1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.MathException mathException2 = new org.apache.commons.math.MathException("en-gb", objArray1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00491() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00491");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl((int) 'u', (int) (byte) 1, (int) '#');
        int int4 = hypergeometricDistributionImpl3.getSampleSize();
        int int5 = hypergeometricDistributionImpl3.getPopulationSize();
        double double7 = hypergeometricDistributionImpl3.upperCumulativeProbability((int) '#');
        int int8 = hypergeometricDistributionImpl3.getPopulationSize();
        int int9 = hypergeometricDistributionImpl3.getNumberOfSuccesses();
        hypergeometricDistributionImpl3.setNumberOfSuccesses((int) (byte) 10);
        // The following exception was thrown during execution in test generation
        try {
            double double14 = hypergeometricDistributionImpl3.cumulativeProbability((double) (short) 100, (double) 1.0f);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: lower endpoint must be less than or equal to upper endpoint");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 35 + "'", int4 == 35);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 117 + "'", int5 == 117);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 117 + "'", int8 == 117);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
    }

    @Test
    public void test00492() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00492");
        java.io.File file0 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.io.PrintWriter printWriter2 = new java.io.PrintWriter(file0, "italiano");
            org.junit.Assert.fail("Expected exception of type java.io.UnsupportedEncodingException; message: italiano");
        } catch (java.io.UnsupportedEncodingException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00493() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00493");
        java.io.PrintStream printStream1 = new java.io.PrintStream("zh_CN");
        printStream1.print((float) (byte) -1);
        printStream1.println();
        printStream1.println();
        java.io.PrintStream printStream7 = new java.io.PrintStream((java.io.OutputStream) printStream1, true);
        java.io.PrintWriter printWriter9 = new java.io.PrintWriter("fr");
        java.io.PrintWriter printWriter11 = printWriter9.append(' ');
        java.io.PrintWriter printWriter14 = new java.io.PrintWriter("fr");
        printWriter14.print("it_IT");
        java.util.Locale locale17 = java.util.Locale.ROOT;
        boolean boolean18 = locale17.hasExtensions();
        java.util.Locale locale19 = java.util.Locale.ROOT;
        java.lang.String str20 = locale17.getDisplayName(locale19);
        java.util.Locale locale21 = java.util.Locale.ROOT;
        boolean boolean22 = locale21.hasExtensions();
        java.lang.String str23 = locale17.getDisplayCountry(locale21);
        java.lang.Object[] objArray26 = new java.lang.Object[] {};
        org.apache.commons.math.MathException mathException27 = new org.apache.commons.math.MathException("hi!", objArray26);
        java.io.PrintWriter printWriter28 = printWriter14.printf(locale21, "it_IT", objArray26);
        java.io.PrintWriter printWriter31 = new java.io.PrintWriter("fr");
        printWriter31.print("it_IT");
        java.util.Locale locale35 = java.util.Locale.forLanguageTag("");
        java.lang.Object[] objArray38 = new java.lang.Object[] {};
        org.apache.commons.math.MathException mathException39 = new org.apache.commons.math.MathException("hi!", objArray38);
        java.lang.Throwable[] throwableArray40 = mathException39.getSuppressed();
        java.lang.Throwable[] throwableArray41 = mathException39.getSuppressed();
        java.io.PrintWriter printWriter42 = printWriter31.printf(locale35, "it_IT", (java.lang.Object[]) throwableArray41);
        java.io.PrintWriter printWriter43 = printWriter14.format("it_IT", (java.lang.Object[]) throwableArray41);
        java.io.PrintWriter printWriter44 = printWriter11.format("zh_CN", (java.lang.Object[]) throwableArray41);
        java.io.PrintStream printStream46 = new java.io.PrintStream("zh_CN");
        printStream46.print((float) (byte) -1);
        char[] charArray51 = new char[] { 'x', 'u' };
        printStream46.println(charArray51);
        printWriter44.print(charArray51);
        printStream1.print(charArray51);
        java.util.Locale locale55 = java.util.Locale.ROOT;
        java.util.Set<java.lang.String> strSet56 = locale55.getUnicodeLocaleKeys();
        java.io.PrintWriter printWriter59 = new java.io.PrintWriter("fr");
        printWriter59.print("it_IT");
        java.util.Locale locale63 = java.util.Locale.forLanguageTag("");
        java.lang.Object[] objArray66 = new java.lang.Object[] {};
        org.apache.commons.math.MathException mathException67 = new org.apache.commons.math.MathException("hi!", objArray66);
        java.lang.Throwable[] throwableArray68 = mathException67.getSuppressed();
        java.lang.Throwable[] throwableArray69 = mathException67.getSuppressed();
        java.io.PrintWriter printWriter70 = printWriter59.printf(locale63, "it_IT", (java.lang.Object[]) throwableArray69);
        java.io.PrintStream printStream71 = printStream1.format(locale55, "hi!", (java.lang.Object[]) throwableArray69);
        java.lang.String str72 = locale55.getLanguage();
        java.lang.String str73 = locale55.getDisplayCountry();
        java.lang.Object obj74 = locale55.clone();
        org.junit.Assert.assertNotNull(printWriter11);
        org.junit.Assert.assertNotNull(locale17);
        org.junit.Assert.assertEquals(locale17.toString(), "");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(locale19);
        org.junit.Assert.assertEquals(locale19.toString(), "");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertNotNull(locale21);
        org.junit.Assert.assertEquals(locale21.toString(), "");
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertNotNull(objArray26);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray26), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray26), "[]");
        org.junit.Assert.assertNotNull(printWriter28);
        org.junit.Assert.assertNotNull(locale35);
        org.junit.Assert.assertEquals(locale35.toString(), "");
        org.junit.Assert.assertNotNull(objArray38);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray38), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray38), "[]");
        org.junit.Assert.assertNotNull(throwableArray40);
        org.junit.Assert.assertNotNull(throwableArray41);
        org.junit.Assert.assertNotNull(printWriter42);
        org.junit.Assert.assertNotNull(printWriter43);
        org.junit.Assert.assertNotNull(printWriter44);
        org.junit.Assert.assertNotNull(charArray51);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray51), "xu");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray51), "xu");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray51), "[x, u]");
        org.junit.Assert.assertNotNull(locale55);
        org.junit.Assert.assertEquals(locale55.toString(), "");
        org.junit.Assert.assertNotNull(strSet56);
        org.junit.Assert.assertNotNull(locale63);
        org.junit.Assert.assertEquals(locale63.toString(), "");
        org.junit.Assert.assertNotNull(objArray66);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray66), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray66), "[]");
        org.junit.Assert.assertNotNull(throwableArray68);
        org.junit.Assert.assertNotNull(throwableArray69);
        org.junit.Assert.assertNotNull(printWriter70);
        org.junit.Assert.assertNotNull(printStream71);
        org.junit.Assert.assertEquals("'" + str72 + "' != '" + "" + "'", str72, "");
        org.junit.Assert.assertEquals("'" + str73 + "' != '" + "" + "'", str73, "");
        org.junit.Assert.assertNotNull(obj74);
        org.junit.Assert.assertEquals(obj74.toString(), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj74), "");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj74), "");
    }

    @Test
    public void test00494() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00494");
        java.util.Locale locale2 = new java.util.Locale("fr", "fr");
        java.lang.String str3 = locale2.getDisplayScript();
        java.lang.String str4 = locale2.getCountry();
        java.util.Locale locale5 = null;
        java.lang.String str6 = locale2.getDisplayVariant(locale5);
        java.lang.String str7 = locale2.toString();
        org.junit.Assert.assertEquals(locale2.toString(), "fr_FR");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "FR" + "'", str4, "FR");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "fr_FR" + "'", str7, "fr_FR");
    }

    @Test
    public void test00495() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00495");
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<java.util.Locale.LanguageRange> languageRangeList1 = java.util.Locale.LanguageRange.parse("italien (Italie)");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: range=italien(italie)");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00496() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00496");
        java.util.Locale locale2 = new java.util.Locale("fr", "fr");
        java.lang.String str3 = locale2.getDisplayScript();
        java.lang.String str4 = locale2.getCountry();
        java.util.Locale.Builder builder5 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder7 = builder5.setLanguageTag("ita");
        boolean boolean8 = locale2.equals((java.lang.Object) "ita");
        org.junit.Assert.assertEquals(locale2.toString(), "fr_FR");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "FR" + "'", str4, "FR");
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test00497() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00497");
        java.util.Locale.LanguageRange[] languageRangeArray0 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList1 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList1, languageRangeArray0);
        java.lang.String[] strArray6 = new java.lang.String[] { "", "Italy", "fr" };
        java.util.ArrayList<java.lang.String> strList7 = new java.util.ArrayList<java.lang.String>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList7, strArray6);
        java.util.List<java.lang.String> strList9 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList1, (java.util.Collection<java.lang.String>) strList7);
        java.util.Locale.LanguageRange[] languageRangeArray10 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList11 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean12 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList11, languageRangeArray10);
        java.lang.String[] strArray18 = new java.lang.String[] { "fr", "", "Italy", "", "fr" };
        java.util.ArrayList<java.lang.String> strList19 = new java.util.ArrayList<java.lang.String>();
        boolean boolean20 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList19, strArray18);
        java.util.List<java.lang.String> strList21 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList11, (java.util.Collection<java.lang.String>) strList19);
        java.util.Locale.FilteringMode filteringMode22 = java.util.Locale.FilteringMode.EXTENDED_FILTERING;
        java.util.List<java.lang.String> strList23 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList1, (java.util.Collection<java.lang.String>) strList21, filteringMode22);
        java.util.Locale.LanguageRange[] languageRangeArray24 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList25 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean26 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList25, languageRangeArray24);
        java.util.Collection<java.util.Locale> localeCollection27 = null;
        java.util.Locale locale28 = java.util.Locale.lookup((java.util.List<java.util.Locale.LanguageRange>) languageRangeList25, localeCollection27);
        java.lang.String[] strArray34 = new java.lang.String[] { "hi!", "", "it_IT", "Italy", "" };
        java.util.ArrayList<java.lang.String> strList35 = new java.util.ArrayList<java.lang.String>();
        boolean boolean36 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList35, strArray34);
        java.util.List<java.lang.String> strList37 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList25, (java.util.Collection<java.lang.String>) strList35);
        java.util.List<java.lang.String> strList38 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList1, (java.util.Collection<java.lang.String>) strList35);
        java.util.Locale.LanguageRange[] languageRangeArray39 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList40 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean41 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList40, languageRangeArray39);
        java.lang.String[] strArray45 = new java.lang.String[] { "", "Italy", "fr" };
        java.util.ArrayList<java.lang.String> strList46 = new java.util.ArrayList<java.lang.String>();
        boolean boolean47 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList46, strArray45);
        java.util.List<java.lang.String> strList48 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList40, (java.util.Collection<java.lang.String>) strList46);
        java.util.Locale.LanguageRange[] languageRangeArray49 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList50 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean51 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList50, languageRangeArray49);
        java.util.Collection<java.util.Locale> localeCollection52 = null;
        java.util.Locale locale53 = java.util.Locale.lookup((java.util.List<java.util.Locale.LanguageRange>) languageRangeList50, localeCollection52);
        java.lang.String[] strArray59 = new java.lang.String[] { "hi!", "", "it_IT", "Italy", "" };
        java.util.ArrayList<java.lang.String> strList60 = new java.util.ArrayList<java.lang.String>();
        boolean boolean61 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList60, strArray59);
        java.util.List<java.lang.String> strList62 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList50, (java.util.Collection<java.lang.String>) strList60);
        java.util.List<java.lang.String> strList63 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList40, (java.util.Collection<java.lang.String>) strList62);
        java.lang.String str64 = java.util.Locale.lookupTag((java.util.List<java.util.Locale.LanguageRange>) languageRangeList1, (java.util.Collection<java.lang.String>) strList62);
        java.util.Locale.LanguageRange[] languageRangeArray65 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList66 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean67 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList66, languageRangeArray65);
        java.util.Collection<java.util.Locale> localeCollection68 = null;
        java.util.Locale locale69 = java.util.Locale.lookup((java.util.List<java.util.Locale.LanguageRange>) languageRangeList66, localeCollection68);
        java.lang.String[] strArray71 = new java.lang.String[] { "hi!" };
        java.util.ArrayList<java.lang.String> strList72 = new java.util.ArrayList<java.lang.String>();
        boolean boolean73 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList72, strArray71);
        java.lang.String str74 = java.util.Locale.lookupTag((java.util.List<java.util.Locale.LanguageRange>) languageRangeList66, (java.util.Collection<java.lang.String>) strList72);
        java.util.Locale locale75 = java.util.Locale.ROOT;
        boolean boolean76 = locale75.hasExtensions();
        java.lang.String str77 = locale75.getCountry();
        java.util.Locale locale78 = java.util.Locale.JAPAN;
        java.util.Locale locale79 = java.util.Locale.FRENCH;
        java.util.Locale locale83 = new java.util.Locale("", "", "");
        java.util.Locale[] localeArray84 = new java.util.Locale[] { locale75, locale78, locale79, locale83 };
        java.util.ArrayList<java.util.Locale> localeList85 = new java.util.ArrayList<java.util.Locale>();
        boolean boolean86 = java.util.Collections.addAll((java.util.Collection<java.util.Locale>) localeList85, localeArray84);
        java.util.List<java.util.Locale> localeList87 = java.util.Locale.filter((java.util.List<java.util.Locale.LanguageRange>) languageRangeList66, (java.util.Collection<java.util.Locale>) localeList85);
        java.util.Locale locale88 = java.util.Locale.lookup((java.util.List<java.util.Locale.LanguageRange>) languageRangeList1, (java.util.Collection<java.util.Locale>) localeList87);
        java.util.Locale locale89 = java.util.Locale.FRENCH;
        java.util.Set<java.lang.String> strSet90 = locale89.getUnicodeLocaleKeys();
        java.lang.String str91 = java.util.Locale.lookupTag((java.util.List<java.util.Locale.LanguageRange>) languageRangeList1, (java.util.Collection<java.lang.String>) strSet90);
        org.junit.Assert.assertNotNull(languageRangeArray0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(strList9);
        org.junit.Assert.assertNotNull(languageRangeArray10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(strArray18);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertNotNull(strList21);
        org.junit.Assert.assertTrue("'" + filteringMode22 + "' != '" + java.util.Locale.FilteringMode.EXTENDED_FILTERING + "'", filteringMode22.equals(java.util.Locale.FilteringMode.EXTENDED_FILTERING));
        org.junit.Assert.assertNotNull(strList23);
        org.junit.Assert.assertNotNull(languageRangeArray24);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNull(locale28);
        org.junit.Assert.assertNotNull(strArray34);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
        org.junit.Assert.assertNotNull(strList37);
        org.junit.Assert.assertNotNull(strList38);
        org.junit.Assert.assertNotNull(languageRangeArray39);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertNotNull(strArray45);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + true + "'", boolean47 == true);
        org.junit.Assert.assertNotNull(strList48);
        org.junit.Assert.assertNotNull(languageRangeArray49);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertNull(locale53);
        org.junit.Assert.assertNotNull(strArray59);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + true + "'", boolean61 == true);
        org.junit.Assert.assertNotNull(strList62);
        org.junit.Assert.assertNotNull(strList63);
        org.junit.Assert.assertNull(str64);
        org.junit.Assert.assertNotNull(languageRangeArray65);
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + false + "'", boolean67 == false);
        org.junit.Assert.assertNull(locale69);
        org.junit.Assert.assertNotNull(strArray71);
        org.junit.Assert.assertTrue("'" + boolean73 + "' != '" + true + "'", boolean73 == true);
        org.junit.Assert.assertNull(str74);
        org.junit.Assert.assertNotNull(locale75);
        org.junit.Assert.assertEquals(locale75.toString(), "");
        org.junit.Assert.assertTrue("'" + boolean76 + "' != '" + false + "'", boolean76 == false);
        org.junit.Assert.assertEquals("'" + str77 + "' != '" + "" + "'", str77, "");
        org.junit.Assert.assertNotNull(locale78);
        org.junit.Assert.assertEquals(locale78.toString(), "ja_JP");
        org.junit.Assert.assertNotNull(locale79);
        org.junit.Assert.assertEquals(locale79.toString(), "fr");
        org.junit.Assert.assertEquals(locale83.toString(), "");
        org.junit.Assert.assertNotNull(localeArray84);
        org.junit.Assert.assertTrue("'" + boolean86 + "' != '" + true + "'", boolean86 == true);
        org.junit.Assert.assertNotNull(localeList87);
        org.junit.Assert.assertNull(locale88);
        org.junit.Assert.assertNotNull(locale89);
        org.junit.Assert.assertEquals(locale89.toString(), "fr");
        org.junit.Assert.assertNotNull(strSet90);
        org.junit.Assert.assertNull(str91);
    }

    @Test
    public void test00498() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00498");
        java.io.PrintStream printStream1 = new java.io.PrintStream("zh_CN");
        printStream1.print((float) (byte) -1);
        printStream1.println();
        printStream1.println();
        java.io.PrintStream printStream7 = new java.io.PrintStream((java.io.OutputStream) printStream1, true);
        printStream1.println();
        printStream1.print((-1));
        printStream1.print((double) '#');
        java.io.PrintWriter printWriter16 = new java.io.PrintWriter("fr");
        printWriter16.print("it_IT");
        java.util.Locale locale19 = java.util.Locale.ROOT;
        boolean boolean20 = locale19.hasExtensions();
        java.util.Locale locale21 = java.util.Locale.ROOT;
        java.lang.String str22 = locale19.getDisplayName(locale21);
        java.util.Locale locale23 = java.util.Locale.ROOT;
        boolean boolean24 = locale23.hasExtensions();
        java.lang.String str25 = locale19.getDisplayCountry(locale23);
        java.lang.Object[] objArray28 = new java.lang.Object[] {};
        org.apache.commons.math.MathException mathException29 = new org.apache.commons.math.MathException("hi!", objArray28);
        java.io.PrintWriter printWriter30 = printWriter16.printf(locale23, "it_IT", objArray28);
        org.apache.commons.math.MathException mathException31 = new org.apache.commons.math.MathException("", objArray28);
        org.apache.commons.math.MathException mathException32 = new org.apache.commons.math.MathException((java.lang.Throwable) mathException31);
        java.lang.Object[] objArray33 = mathException31.getArguments();
        java.io.PrintStream printStream34 = printStream1.format("italiano (Italia)", objArray33);
        // The following exception was thrown during execution in test generation
        try {
            java.io.PrintStream printStream37 = new java.io.PrintStream((java.io.OutputStream) printStream34, false, "Chinesisch (Taiwan)");
            org.junit.Assert.fail("Expected exception of type java.io.UnsupportedEncodingException; message: Chinesisch (Taiwan)");
        } catch (java.io.UnsupportedEncodingException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(locale19);
        org.junit.Assert.assertEquals(locale19.toString(), "");
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(locale21);
        org.junit.Assert.assertEquals(locale21.toString(), "");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertNotNull(locale23);
        org.junit.Assert.assertEquals(locale23.toString(), "");
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
        org.junit.Assert.assertNotNull(objArray28);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray28), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray28), "[]");
        org.junit.Assert.assertNotNull(printWriter30);
        org.junit.Assert.assertNotNull(objArray33);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray33), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray33), "[]");
        org.junit.Assert.assertNotNull(printStream34);
    }

    @Test
    public void test00499() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00499");
        java.io.PrintWriter printWriter1 = new java.io.PrintWriter("fr");
        printWriter1.print("it_IT");
        java.util.Locale locale4 = java.util.Locale.ROOT;
        boolean boolean5 = locale4.hasExtensions();
        java.util.Locale locale6 = java.util.Locale.ROOT;
        java.lang.String str7 = locale4.getDisplayName(locale6);
        java.util.Locale locale8 = java.util.Locale.ROOT;
        boolean boolean9 = locale8.hasExtensions();
        java.lang.String str10 = locale4.getDisplayCountry(locale8);
        java.lang.Object[] objArray13 = new java.lang.Object[] {};
        org.apache.commons.math.MathException mathException14 = new org.apache.commons.math.MathException("hi!", objArray13);
        java.io.PrintWriter printWriter15 = printWriter1.printf(locale8, "it_IT", objArray13);
        java.util.Locale locale18 = new java.util.Locale("Italy", "Italy");
        java.lang.String str19 = locale8.getDisplayScript(locale18);
        java.lang.String str20 = locale18.getDisplayLanguage();
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(locale6);
        org.junit.Assert.assertEquals(locale6.toString(), "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(locale8);
        org.junit.Assert.assertEquals(locale8.toString(), "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(objArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray13), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray13), "[]");
        org.junit.Assert.assertNotNull(printWriter15);
        org.junit.Assert.assertEquals(locale18.toString(), "italy_ITALY");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "italy" + "'", str20, "italy");
    }

    @Test
    public void test00500() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00500");
        java.util.Locale locale1 = java.util.Locale.forLanguageTag("hi!");
        java.lang.String str2 = locale1.toString();
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }
}
