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
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper0 = new org.apache.commons.lang3.text.translate.UnicodeEscaper();
        java.lang.Class<?> wildcardClass1 = unicodeEscaper0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test00002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00002");
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper1 = org.apache.commons.lang3.text.translate.UnicodeEscaper.below((int) (short) 1);
        java.io.Writer writer4 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int5 = unicodeEscaper1.translate((java.lang.CharSequence) "", (-1), writer4);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: -1");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(unicodeEscaper1);
    }

    @Test
    public void test00003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00003");
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper0 = new org.apache.commons.lang3.text.translate.UnicodeEscaper();
        java.io.Writer writer3 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int4 = unicodeEscaper0.translate((java.lang.CharSequence) "\\u0068\\u0069\\u0021", 100, writer3);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 100");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00004");
        java.io.IOException iOException0 = new java.io.IOException();
        java.io.IOException iOException1 = new java.io.IOException();
        iOException0.addSuppressed((java.lang.Throwable) iOException1);
        java.lang.String str3 = iOException1.toString();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "java.io.IOException" + "'", str3, "java.io.IOException");
    }

    @Test
    public void test00005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00005");
        java.lang.String str1 = org.apache.commons.lang3.text.translate.CharSequenceTranslator.hex((int) (byte) 0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "0" + "'", str1, "0");
    }

    @Test
    public void test00006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00006");
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper0 = new org.apache.commons.lang3.text.translate.UnicodeEscaper();
        java.io.Writer writer3 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int4 = unicodeEscaper0.translate((java.lang.CharSequence) "\\u0068\\u0069\\u0021", 0, writer3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00007");
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper2 = org.apache.commons.lang3.text.translate.UnicodeEscaper.between((int) (byte) 1, (int) '#');
        java.io.Writer writer5 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int6 = unicodeEscaper2.translate((java.lang.CharSequence) "", (int) (byte) 0, writer5);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(unicodeEscaper2);
    }

    @Test
    public void test00008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00008");
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper0 = new org.apache.commons.lang3.text.translate.UnicodeEscaper();
        java.io.Writer writer2 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = unicodeEscaper0.translate((int) (byte) 1, writer2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00009");
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper2 = org.apache.commons.lang3.text.translate.UnicodeEscaper.outsideOf(0, (int) 'a');
        java.io.Writer writer5 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int6 = unicodeEscaper2.translate((java.lang.CharSequence) "hi!", (-1), writer5);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: -1");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(unicodeEscaper2);
    }

    @Test
    public void test00010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00010");
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper0 = new org.apache.commons.lang3.text.translate.UnicodeEscaper();
        java.io.Writer writer2 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = unicodeEscaper0.translate((int) (byte) 10, writer2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00011");
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper2 = org.apache.commons.lang3.text.translate.UnicodeEscaper.outsideOf(0, (int) 'a');
        java.io.Writer writer5 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int6 = unicodeEscaper2.translate((java.lang.CharSequence) "", 10, writer5);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 10");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(unicodeEscaper2);
    }

    @Test
    public void test00012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00012");
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper2 = org.apache.commons.lang3.text.translate.UnicodeEscaper.outsideOf((int) (short) 10, (int) (short) 10);
        java.io.Writer writer4 = null;
        // The following exception was thrown during execution in test generation
        try {
            unicodeEscaper2.translate((java.lang.CharSequence) "0", writer4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Writer must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(unicodeEscaper2);
    }

    @Test
    public void test00013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00013");
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper2 = org.apache.commons.lang3.text.translate.UnicodeEscaper.outsideOf(0, (int) 'a');
        java.io.Writer writer5 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int6 = unicodeEscaper2.translate((java.lang.CharSequence) "", 0, writer5);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(unicodeEscaper2);
    }

    @Test
    public void test00014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00014");
        java.io.IOException iOException0 = new java.io.IOException();
        java.io.IOException iOException1 = new java.io.IOException();
        iOException0.addSuppressed((java.lang.Throwable) iOException1);
        java.io.IOException iOException3 = new java.io.IOException();
        java.io.IOException iOException4 = new java.io.IOException();
        iOException3.addSuppressed((java.lang.Throwable) iOException4);
        java.lang.Throwable[] throwableArray6 = iOException4.getSuppressed();
        java.io.IOException iOException7 = new java.io.IOException((java.lang.Throwable) iOException4);
        java.io.IOException iOException9 = new java.io.IOException("");
        java.io.IOException iOException10 = new java.io.IOException((java.lang.Throwable) iOException9);
        iOException4.addSuppressed((java.lang.Throwable) iOException10);
        iOException1.addSuppressed((java.lang.Throwable) iOException10);
        java.lang.String str13 = iOException1.toString();
        org.junit.Assert.assertNotNull(throwableArray6);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "java.io.IOException" + "'", str13, "java.io.IOException");
    }

    @Test
    public void test00015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00015");
        java.io.IOException iOException1 = new java.io.IOException("");
        java.io.IOException iOException2 = new java.io.IOException((java.lang.Throwable) iOException1);
        java.lang.String str3 = iOException2.toString();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "java.io.IOException: java.io.IOException: " + "'", str3, "java.io.IOException: java.io.IOException: ");
    }

    @Test
    public void test00016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00016");
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper0 = new org.apache.commons.lang3.text.translate.UnicodeEscaper();
        java.lang.String str2 = unicodeEscaper0.translate((java.lang.CharSequence) "hi!");
        java.lang.String str4 = unicodeEscaper0.translate((java.lang.CharSequence) "");
        java.io.Writer writer6 = null;
        // The following exception was thrown during execution in test generation
        try {
            unicodeEscaper0.translate((java.lang.CharSequence) "hi!", writer6);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Writer must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\\u0068\\u0069\\u0021" + "'", str2, "\\u0068\\u0069\\u0021");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
    }

    @Test
    public void test00017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00017");
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper2 = org.apache.commons.lang3.text.translate.UnicodeEscaper.outsideOf(0, (int) 'a');
        java.io.Writer writer4 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean5 = unicodeEscaper2.translate(100, writer4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(unicodeEscaper2);
    }

    @Test
    public void test00018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00018");
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper2 = org.apache.commons.lang3.text.translate.UnicodeEscaper.outsideOf(0, (int) 'a');
        java.io.Writer writer4 = null;
        boolean boolean5 = unicodeEscaper2.translate((int) (short) 10, writer4);
        java.io.Writer writer8 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int9 = unicodeEscaper2.translate((java.lang.CharSequence) "hi!", (int) (byte) 100, writer8);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 100");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(unicodeEscaper2);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test00019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00019");
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper0 = new org.apache.commons.lang3.text.translate.UnicodeEscaper();
        java.lang.String str2 = unicodeEscaper0.translate((java.lang.CharSequence) "hi!");
        java.io.Writer writer4 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean5 = unicodeEscaper0.translate((int) (short) 10, writer4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\\u0068\\u0069\\u0021" + "'", str2, "\\u0068\\u0069\\u0021");
    }

    @Test
    public void test00020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00020");
        java.io.IOException iOException0 = new java.io.IOException();
        java.io.IOException iOException1 = new java.io.IOException();
        iOException0.addSuppressed((java.lang.Throwable) iOException1);
        java.lang.Throwable[] throwableArray3 = iOException1.getSuppressed();
        java.io.IOException iOException4 = new java.io.IOException((java.lang.Throwable) iOException1);
        java.io.IOException iOException6 = new java.io.IOException("");
        java.io.IOException iOException7 = new java.io.IOException((java.lang.Throwable) iOException6);
        iOException1.addSuppressed((java.lang.Throwable) iOException7);
        java.lang.Class<?> wildcardClass9 = iOException7.getClass();
        org.junit.Assert.assertNotNull(throwableArray3);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test00021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00021");
        java.io.IOException iOException1 = new java.io.IOException("");
        java.io.IOException iOException2 = new java.io.IOException((java.lang.Throwable) iOException1);
        java.lang.Class<?> wildcardClass3 = iOException1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test00022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00022");
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper0 = new org.apache.commons.lang3.text.translate.UnicodeEscaper();
        java.lang.String str2 = unicodeEscaper0.translate((java.lang.CharSequence) "hi!");
        java.lang.String str4 = unicodeEscaper0.translate((java.lang.CharSequence) "");
        java.io.Writer writer6 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean7 = unicodeEscaper0.translate((int) (byte) 10, writer6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\\u0068\\u0069\\u0021" + "'", str2, "\\u0068\\u0069\\u0021");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
    }

    @Test
    public void test00023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00023");
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper2 = org.apache.commons.lang3.text.translate.UnicodeEscaper.between((int) (byte) 1, (int) '#');
        java.io.Writer writer5 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int6 = unicodeEscaper2.translate((java.lang.CharSequence) "hi!", 10, writer5);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 10");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(unicodeEscaper2);
    }

    @Test
    public void test00024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00024");
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper2 = org.apache.commons.lang3.text.translate.UnicodeEscaper.outsideOf(0, (int) 'a');
        java.io.Writer writer4 = null;
        boolean boolean5 = unicodeEscaper2.translate((int) (short) 10, writer4);
        java.io.Writer writer7 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean8 = unicodeEscaper2.translate((int) (short) -1, writer7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(unicodeEscaper2);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test00025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00025");
        java.io.IOException iOException0 = new java.io.IOException();
        java.io.IOException iOException1 = new java.io.IOException();
        iOException0.addSuppressed((java.lang.Throwable) iOException1);
        java.lang.Throwable[] throwableArray3 = iOException1.getSuppressed();
        java.io.IOException iOException4 = new java.io.IOException((java.lang.Throwable) iOException1);
        java.lang.String str5 = iOException4.toString();
        org.junit.Assert.assertNotNull(throwableArray3);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "java.io.IOException: java.io.IOException" + "'", str5, "java.io.IOException: java.io.IOException");
    }

    @Test
    public void test00026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00026");
        java.io.IOException iOException0 = new java.io.IOException();
        java.io.IOException iOException1 = new java.io.IOException();
        iOException0.addSuppressed((java.lang.Throwable) iOException1);
        java.lang.Throwable[] throwableArray3 = iOException1.getSuppressed();
        java.lang.Throwable[] throwableArray4 = iOException1.getSuppressed();
        java.lang.String str5 = iOException1.toString();
        org.junit.Assert.assertNotNull(throwableArray3);
        org.junit.Assert.assertNotNull(throwableArray4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "java.io.IOException" + "'", str5, "java.io.IOException");
    }

    @Test
    public void test00027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00027");
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper2 = org.apache.commons.lang3.text.translate.UnicodeEscaper.outsideOf(0, (int) 'a');
        java.io.Writer writer4 = null;
        boolean boolean5 = unicodeEscaper2.translate((int) (short) 10, writer4);
        java.io.Writer writer7 = null;
        boolean boolean8 = unicodeEscaper2.translate((int) (short) 10, writer7);
        java.io.Writer writer11 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int12 = unicodeEscaper2.translate((java.lang.CharSequence) "hi!", (int) (byte) -1, writer11);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: -1");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(unicodeEscaper2);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test00028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00028");
        java.lang.String str1 = org.apache.commons.lang3.text.translate.CharSequenceTranslator.hex((int) (byte) 10);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "A" + "'", str1, "A");
    }

    @Test
    public void test00029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00029");
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper2 = org.apache.commons.lang3.text.translate.UnicodeEscaper.outsideOf((int) (short) 10, (int) (short) 10);
        java.io.Writer writer4 = null;
        // The following exception was thrown during execution in test generation
        try {
            unicodeEscaper2.translate((java.lang.CharSequence) "\\u0068\\u0069\\u0021", writer4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Writer must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(unicodeEscaper2);
    }

    @Test
    public void test00030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00030");
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper2 = org.apache.commons.lang3.text.translate.UnicodeEscaper.outsideOf(0, (int) 'a');
        java.io.Writer writer4 = null;
        boolean boolean5 = unicodeEscaper2.translate((int) (short) 10, writer4);
        java.io.Writer writer8 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int9 = unicodeEscaper2.translate((java.lang.CharSequence) "hi!", (int) '4', writer8);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 52");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(unicodeEscaper2);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test00031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00031");
        java.io.IOException iOException1 = new java.io.IOException("");
        java.lang.Class<?> wildcardClass2 = iOException1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test00032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00032");
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper0 = new org.apache.commons.lang3.text.translate.UnicodeEscaper();
        java.lang.String str2 = unicodeEscaper0.translate((java.lang.CharSequence) "hi!");
        org.apache.commons.lang3.text.translate.CharSequenceTranslator[] charSequenceTranslatorArray3 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator4 = unicodeEscaper0.with(charSequenceTranslatorArray3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\\u0068\\u0069\\u0021" + "'", str2, "\\u0068\\u0069\\u0021");
    }

    @Test
    public void test00033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00033");
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper2 = org.apache.commons.lang3.text.translate.UnicodeEscaper.outsideOf(0, (int) 'a');
        java.io.Writer writer4 = null;
        boolean boolean5 = unicodeEscaper2.translate((int) (short) 10, writer4);
        java.io.Writer writer8 = null;
        int int9 = unicodeEscaper2.translate((java.lang.CharSequence) "0", (int) (byte) 0, writer8);
        java.io.Writer writer12 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int13 = unicodeEscaper2.translate((java.lang.CharSequence) "A", (int) ' ', writer12);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 32");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(unicodeEscaper2);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test00034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00034");
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper2 = org.apache.commons.lang3.text.translate.UnicodeEscaper.between((-1), (int) (byte) -1);
        java.io.Writer writer5 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int6 = unicodeEscaper2.translate((java.lang.CharSequence) "A", (int) '4', writer5);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 52");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(unicodeEscaper2);
    }

    @Test
    public void test00035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00035");
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper0 = new org.apache.commons.lang3.text.translate.UnicodeEscaper();
        java.io.Writer writer3 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int4 = unicodeEscaper0.translate((java.lang.CharSequence) "", (int) (short) 10, writer3);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 10");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00036");
        java.io.IOException iOException1 = new java.io.IOException("hi!");
        java.lang.Throwable[] throwableArray2 = iOException1.getSuppressed();
        java.lang.Class<?> wildcardClass3 = throwableArray2.getClass();
        org.junit.Assert.assertNotNull(throwableArray2);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test00037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00037");
        java.lang.String str1 = org.apache.commons.lang3.text.translate.CharSequenceTranslator.hex((int) (short) 100);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "64" + "'", str1, "64");
    }

    @Test
    public void test00038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00038");
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper2 = org.apache.commons.lang3.text.translate.UnicodeEscaper.outsideOf((int) (byte) 10, (int) (byte) -1);
        java.io.Writer writer4 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean5 = unicodeEscaper2.translate((int) '4', writer4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(unicodeEscaper2);
    }

    @Test
    public void test00039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00039");
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper2 = org.apache.commons.lang3.text.translate.UnicodeEscaper.between((int) (byte) 1, (int) '#');
        java.io.Writer writer4 = null;
        boolean boolean5 = unicodeEscaper2.translate((int) '4', writer4);
        java.io.Writer writer7 = null;
        // The following exception was thrown during execution in test generation
        try {
            unicodeEscaper2.translate((java.lang.CharSequence) "java.io.IOException: java.io.IOException: ", writer7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Writer must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(unicodeEscaper2);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test00040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00040");
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper2 = org.apache.commons.lang3.text.translate.UnicodeEscaper.between((int) (byte) 1, (int) '#');
        java.lang.Class<?> wildcardClass3 = unicodeEscaper2.getClass();
        org.junit.Assert.assertNotNull(unicodeEscaper2);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test00041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00041");
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper2 = org.apache.commons.lang3.text.translate.UnicodeEscaper.between((-1), 0);
        java.io.Writer writer4 = null;
        // The following exception was thrown during execution in test generation
        try {
            unicodeEscaper2.translate((java.lang.CharSequence) "A", writer4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Writer must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(unicodeEscaper2);
    }

    @Test
    public void test00042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00042");
        java.io.IOException iOException1 = new java.io.IOException();
        java.io.IOException iOException2 = new java.io.IOException();
        iOException1.addSuppressed((java.lang.Throwable) iOException2);
        java.io.IOException iOException4 = new java.io.IOException("0", (java.lang.Throwable) iOException1);
        java.lang.String str5 = iOException1.toString();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "java.io.IOException" + "'", str5, "java.io.IOException");
    }

    @Test
    public void test00043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00043");
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper1 = org.apache.commons.lang3.text.translate.UnicodeEscaper.above((int) (short) 100);
        java.io.Writer writer3 = null;
        // The following exception was thrown during execution in test generation
        try {
            unicodeEscaper1.translate((java.lang.CharSequence) "A", writer3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Writer must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(unicodeEscaper1);
    }

    @Test
    public void test00044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00044");
        java.io.IOException iOException1 = new java.io.IOException("\\u0068\\u0069\\u0021");
        java.lang.String str2 = iOException1.toString();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "java.io.IOException: \\u0068\\u0069\\u0021" + "'", str2, "java.io.IOException: \\u0068\\u0069\\u0021");
    }

    @Test
    public void test00045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00045");
        java.lang.String str1 = org.apache.commons.lang3.text.translate.CharSequenceTranslator.hex((int) '#');
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "23" + "'", str1, "23");
    }

    @Test
    public void test00046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00046");
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper2 = org.apache.commons.lang3.text.translate.UnicodeEscaper.outsideOf(0, (int) 'a');
        java.io.Writer writer4 = null;
        boolean boolean5 = unicodeEscaper2.translate((int) (short) 10, writer4);
        java.io.Writer writer8 = null;
        int int9 = unicodeEscaper2.translate((java.lang.CharSequence) "0", (int) (byte) 0, writer8);
        java.io.Writer writer12 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int13 = unicodeEscaper2.translate((java.lang.CharSequence) "java\\u002Eio\\u002E\\u0049\\u004F\\u0045xception\\u003A\\u0020java\\u002Eio\\u002E\\u0049\\u004F\\u0045xception", (int) (short) 10, writer12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(unicodeEscaper2);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test00047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00047");
        java.io.IOException iOException1 = new java.io.IOException("");
        java.io.IOException iOException2 = new java.io.IOException((java.lang.Throwable) iOException1);
        java.io.IOException iOException3 = new java.io.IOException((java.lang.Throwable) iOException1);
        java.lang.String str4 = iOException3.toString();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "java.io.IOException: java.io.IOException: " + "'", str4, "java.io.IOException: java.io.IOException: ");
    }

    @Test
    public void test00048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00048");
        java.io.IOException iOException0 = new java.io.IOException();
        java.io.IOException iOException1 = new java.io.IOException();
        iOException0.addSuppressed((java.lang.Throwable) iOException1);
        java.lang.String str3 = iOException0.toString();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "java.io.IOException" + "'", str3, "java.io.IOException");
    }

    @Test
    public void test00049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00049");
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper2 = org.apache.commons.lang3.text.translate.UnicodeEscaper.outsideOf((int) (short) 10, (int) (byte) 100);
        java.io.Writer writer5 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int6 = unicodeEscaper2.translate((java.lang.CharSequence) "A", (int) ' ', writer5);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 32");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(unicodeEscaper2);
    }

    @Test
    public void test00050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00050");
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper1 = org.apache.commons.lang3.text.translate.UnicodeEscaper.below(100);
        java.lang.String str3 = unicodeEscaper1.translate((java.lang.CharSequence) "\\u0068\\u0069\\u0021");
        java.io.Writer writer6 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int7 = unicodeEscaper1.translate((java.lang.CharSequence) "\\u0036\\u0034", (int) '#', writer6);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 35");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(unicodeEscaper1);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\\u005Cu\\u0030\\u0030\\u0036\\u0038\\u005Cu\\u0030\\u0030\\u0036\\u0039\\u005Cu\\u0030\\u0030\\u0032\\u0031" + "'", str3, "\\u005Cu\\u0030\\u0030\\u0036\\u0038\\u005Cu\\u0030\\u0030\\u0036\\u0039\\u005Cu\\u0030\\u0030\\u0032\\u0031");
    }

    @Test
    public void test00051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00051");
        java.io.IOException iOException0 = new java.io.IOException();
        java.io.IOException iOException1 = new java.io.IOException();
        iOException0.addSuppressed((java.lang.Throwable) iOException1);
        java.lang.Throwable[] throwableArray3 = iOException1.getSuppressed();
        java.io.IOException iOException4 = new java.io.IOException((java.lang.Throwable) iOException1);
        java.io.IOException iOException6 = new java.io.IOException("");
        java.io.IOException iOException7 = new java.io.IOException((java.lang.Throwable) iOException6);
        iOException1.addSuppressed((java.lang.Throwable) iOException7);
        java.lang.Throwable[] throwableArray9 = iOException1.getSuppressed();
        java.lang.String str10 = iOException1.toString();
        org.junit.Assert.assertNotNull(throwableArray3);
        org.junit.Assert.assertNotNull(throwableArray9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "java.io.IOException" + "'", str10, "java.io.IOException");
    }

    @Test
    public void test00052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00052");
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper2 = org.apache.commons.lang3.text.translate.UnicodeEscaper.between((int) (byte) 1, (int) '#');
        java.io.Writer writer4 = null;
        boolean boolean5 = unicodeEscaper2.translate((int) '4', writer4);
        java.io.Writer writer7 = null;
        boolean boolean8 = unicodeEscaper2.translate((int) (byte) -1, writer7);
        java.io.Writer writer10 = null;
        boolean boolean11 = unicodeEscaper2.translate((int) (byte) -1, writer10);
        java.lang.String str13 = unicodeEscaper2.translate((java.lang.CharSequence) "A");
        java.io.Writer writer15 = null;
        // The following exception was thrown during execution in test generation
        try {
            unicodeEscaper2.translate((java.lang.CharSequence) "java.io.IOException", writer15);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Writer must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(unicodeEscaper2);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "A" + "'", str13, "A");
    }

    @Test
    public void test00053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00053");
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper1 = org.apache.commons.lang3.text.translate.UnicodeEscaper.above((int) (short) 0);
        java.io.Writer writer3 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean4 = unicodeEscaper1.translate(1, writer3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(unicodeEscaper1);
    }

    @Test
    public void test00054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00054");
        java.lang.String str1 = org.apache.commons.lang3.text.translate.CharSequenceTranslator.hex((int) (byte) -1);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "FFFFFFFF" + "'", str1, "FFFFFFFF");
    }

    @Test
    public void test00055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00055");
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper2 = org.apache.commons.lang3.text.translate.UnicodeEscaper.outsideOf((int) (byte) 10, (int) (byte) -1);
        java.io.Writer writer5 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int6 = unicodeEscaper2.translate((java.lang.CharSequence) "64", (int) (byte) 10, writer5);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 10");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(unicodeEscaper2);
    }

    @Test
    public void test00056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00056");
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper2 = org.apache.commons.lang3.text.translate.UnicodeEscaper.outsideOf(0, (int) 'a');
        java.io.Writer writer4 = null;
        boolean boolean5 = unicodeEscaper2.translate((int) (short) 10, writer4);
        java.io.Writer writer7 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean8 = unicodeEscaper2.translate((int) (byte) -1, writer7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(unicodeEscaper2);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test00057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00057");
        java.lang.String str1 = org.apache.commons.lang3.text.translate.CharSequenceTranslator.hex((int) (byte) 100);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "64" + "'", str1, "64");
    }

    @Test
    public void test00058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00058");
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper2 = org.apache.commons.lang3.text.translate.UnicodeEscaper.outsideOf(0, (int) 'a');
        java.io.Writer writer4 = null;
        boolean boolean5 = unicodeEscaper2.translate((int) (short) 10, writer4);
        java.io.Writer writer8 = null;
        int int9 = unicodeEscaper2.translate((java.lang.CharSequence) "0", (int) (byte) 0, writer8);
        java.lang.Class<?> wildcardClass10 = unicodeEscaper2.getClass();
        org.junit.Assert.assertNotNull(unicodeEscaper2);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test00059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00059");
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper2 = org.apache.commons.lang3.text.translate.UnicodeEscaper.outsideOf((int) (short) 10, (int) (byte) 100);
        java.lang.Class<?> wildcardClass3 = unicodeEscaper2.getClass();
        org.junit.Assert.assertNotNull(unicodeEscaper2);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test00060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00060");
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper2 = org.apache.commons.lang3.text.translate.UnicodeEscaper.between((int) (byte) 1, (int) '#');
        java.io.Writer writer4 = null;
        boolean boolean5 = unicodeEscaper2.translate((int) '4', writer4);
        java.io.Writer writer7 = null;
        boolean boolean8 = unicodeEscaper2.translate((int) (byte) -1, writer7);
        java.io.Writer writer10 = null;
        boolean boolean11 = unicodeEscaper2.translate((int) (byte) -1, writer10);
        java.io.Writer writer13 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean14 = unicodeEscaper2.translate((int) (short) 10, writer13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(unicodeEscaper2);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test00061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00061");
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper2 = org.apache.commons.lang3.text.translate.UnicodeEscaper.between((-1), (int) (byte) 10);
        java.lang.Class<?> wildcardClass3 = unicodeEscaper2.getClass();
        org.junit.Assert.assertNotNull(unicodeEscaper2);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test00062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00062");
        java.io.IOException iOException1 = new java.io.IOException("");
        java.io.IOException iOException2 = new java.io.IOException((java.lang.Throwable) iOException1);
        java.io.IOException iOException4 = new java.io.IOException("");
        iOException2.addSuppressed((java.lang.Throwable) iOException4);
        java.lang.Throwable[] throwableArray6 = iOException4.getSuppressed();
        java.lang.Class<?> wildcardClass7 = throwableArray6.getClass();
        org.junit.Assert.assertNotNull(throwableArray6);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test00063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00063");
        java.lang.String str1 = org.apache.commons.lang3.text.translate.CharSequenceTranslator.hex((int) 'a');
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "61" + "'", str1, "61");
    }

    @Test
    public void test00064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00064");
        java.io.IOException iOException0 = new java.io.IOException();
        java.io.IOException iOException1 = new java.io.IOException();
        iOException0.addSuppressed((java.lang.Throwable) iOException1);
        java.lang.Throwable[] throwableArray3 = iOException1.getSuppressed();
        java.io.IOException iOException4 = new java.io.IOException((java.lang.Throwable) iOException1);
        java.io.IOException iOException6 = new java.io.IOException("");
        java.io.IOException iOException7 = new java.io.IOException((java.lang.Throwable) iOException6);
        iOException1.addSuppressed((java.lang.Throwable) iOException7);
        java.io.IOException iOException10 = new java.io.IOException("0");
        java.io.IOException iOException11 = new java.io.IOException((java.lang.Throwable) iOException10);
        iOException1.addSuppressed((java.lang.Throwable) iOException10);
        java.lang.Class<?> wildcardClass13 = iOException10.getClass();
        org.junit.Assert.assertNotNull(throwableArray3);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test00065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00065");
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper2 = org.apache.commons.lang3.text.translate.UnicodeEscaper.between((-1), (int) (byte) 10);
        java.io.Writer writer4 = null;
        // The following exception was thrown during execution in test generation
        try {
            unicodeEscaper2.translate((java.lang.CharSequence) "\\u006Aa\\u0076a.\\u0069\\u006F.IOE\\u0078c\\u0065\\u0070\\u0074\\u0069\\u006F\\u006E:\\u0020\\u006Aa\\u0076a.\\u0069\\u006F.IOE\\u0078c\\u0065\\u0070\\u0074\\u0069\\u006F\\u006E", writer4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Writer must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(unicodeEscaper2);
    }

    @Test
    public void test00066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00066");
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper2 = org.apache.commons.lang3.text.translate.UnicodeEscaper.outsideOf((int) (short) 10, (int) (short) 10);
        java.lang.CharSequence charSequence3 = null;
        java.io.Writer writer5 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int6 = unicodeEscaper2.translate(charSequence3, 0, writer5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(unicodeEscaper2);
    }

    @Test
    public void test00067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00067");
        java.lang.String str1 = org.apache.commons.lang3.text.translate.CharSequenceTranslator.hex((-1));
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "FFFFFFFF" + "'", str1, "FFFFFFFF");
    }

    @Test
    public void test00068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00068");
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper2 = org.apache.commons.lang3.text.translate.UnicodeEscaper.outsideOf((int) (short) 10, (int) (short) 10);
        java.io.Writer writer5 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int6 = unicodeEscaper2.translate((java.lang.CharSequence) "java.io.IOException: java.io.IOException: ", 100, writer5);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 100");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(unicodeEscaper2);
    }

    @Test
    public void test00069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00069");
        java.lang.String str1 = org.apache.commons.lang3.text.translate.CharSequenceTranslator.hex((int) (short) 0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "0" + "'", str1, "0");
    }

    @Test
    public void test00070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00070");
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper0 = new org.apache.commons.lang3.text.translate.UnicodeEscaper();
        java.lang.String str2 = unicodeEscaper0.translate((java.lang.CharSequence) "hi!");
        java.io.Writer writer4 = null;
        boolean boolean5 = unicodeEscaper0.translate((int) (byte) -1, writer4);
        java.lang.String str7 = unicodeEscaper0.translate((java.lang.CharSequence) "");
        java.io.Writer writer9 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean10 = unicodeEscaper0.translate(10, writer9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\\u0068\\u0069\\u0021" + "'", str2, "\\u0068\\u0069\\u0021");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
    }

    @Test
    public void test00071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00071");
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper2 = org.apache.commons.lang3.text.translate.UnicodeEscaper.outsideOf(0, (int) 'a');
        java.io.Writer writer4 = null;
        boolean boolean5 = unicodeEscaper2.translate((int) '4', writer4);
        java.io.Writer writer7 = null;
        // The following exception was thrown during execution in test generation
        try {
            unicodeEscaper2.translate((java.lang.CharSequence) "hi!", writer7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Writer must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(unicodeEscaper2);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test00072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00072");
        java.io.IOException iOException1 = new java.io.IOException("");
        java.lang.Throwable[] throwableArray2 = iOException1.getSuppressed();
        java.lang.Throwable throwable3 = null;
        // The following exception was thrown during execution in test generation
        try {
            iOException1.addSuppressed(throwable3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot suppress a null exception.");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(throwableArray2);
    }

    @Test
    public void test00073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00073");
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper2 = org.apache.commons.lang3.text.translate.UnicodeEscaper.outsideOf(0, (int) 'a');
        java.io.Writer writer4 = null;
        boolean boolean5 = unicodeEscaper2.translate((int) (short) 10, writer4);
        java.io.Writer writer7 = null;
        boolean boolean8 = unicodeEscaper2.translate((int) '#', writer7);
        java.io.Writer writer11 = null;
        int int12 = unicodeEscaper2.translate((java.lang.CharSequence) "java.io.IOException: java.io.IOException", (int) (byte) 1, writer11);
        java.io.Writer writer15 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int16 = unicodeEscaper2.translate((java.lang.CharSequence) "64", (int) (short) 100, writer15);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 100");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(unicodeEscaper2);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
    }

    @Test
    public void test00074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00074");
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper1 = org.apache.commons.lang3.text.translate.UnicodeEscaper.below((int) (short) 0);
        java.io.Writer writer4 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int5 = unicodeEscaper1.translate((java.lang.CharSequence) "23", (int) (byte) -1, writer4);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: -1");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(unicodeEscaper1);
    }

    @Test
    public void test00075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00075");
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper1 = org.apache.commons.lang3.text.translate.UnicodeEscaper.below(100);
        java.lang.String str3 = unicodeEscaper1.translate((java.lang.CharSequence) "\\u0068\\u0069\\u0021");
        java.io.Writer writer6 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int7 = unicodeEscaper1.translate((java.lang.CharSequence) "FFFFFFFF", 0, writer6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(unicodeEscaper1);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\\u005Cu\\u0030\\u0030\\u0036\\u0038\\u005Cu\\u0030\\u0030\\u0036\\u0039\\u005Cu\\u0030\\u0030\\u0032\\u0031" + "'", str3, "\\u005Cu\\u0030\\u0030\\u0036\\u0038\\u005Cu\\u0030\\u0030\\u0036\\u0039\\u005Cu\\u0030\\u0030\\u0032\\u0031");
    }

    @Test
    public void test00076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00076");
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper2 = org.apache.commons.lang3.text.translate.UnicodeEscaper.outsideOf(10, 10);
        java.io.Writer writer5 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int6 = unicodeEscaper2.translate((java.lang.CharSequence) "\\u006Aa\\u0076a.\\u0069\\u006F.IOE\\u0078c\\u0065\\u0070\\u0074\\u0069\\u006F\\u006E: \\u006Aa\\u0076a.\\u0069\\u006F.IOE\\u0078c\\u0065\\u0070\\u0074\\u0069\\u006F\\u006E", (int) (byte) -1, writer5);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: -1");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(unicodeEscaper2);
    }

    @Test
    public void test00077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00077");
        java.io.IOException iOException1 = new java.io.IOException("");
        java.io.IOException iOException2 = new java.io.IOException((java.lang.Throwable) iOException1);
        java.io.IOException iOException4 = new java.io.IOException("");
        iOException2.addSuppressed((java.lang.Throwable) iOException4);
        java.lang.Class<?> wildcardClass6 = iOException2.getClass();
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test00078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00078");
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper2 = org.apache.commons.lang3.text.translate.UnicodeEscaper.between((int) (byte) 1, (int) '#');
        java.io.Writer writer4 = null;
        boolean boolean5 = unicodeEscaper2.translate((int) '4', writer4);
        java.io.Writer writer7 = null;
        boolean boolean8 = unicodeEscaper2.translate((int) (byte) -1, writer7);
        java.io.Writer writer10 = null;
        boolean boolean11 = unicodeEscaper2.translate(0, writer10);
        java.io.Writer writer13 = null;
        // The following exception was thrown during execution in test generation
        try {
            unicodeEscaper2.translate((java.lang.CharSequence) "\\u006Aa\\u0076a.\\u0069\\u006F.IOE\\u0078c\\u0065\\u0070\\u0074\\u0069\\u006F\\u006E: \\u006Aa\\u0076a.\\u0069\\u006F.IOE\\u0078c\\u0065\\u0070\\u0074\\u0069\\u006F\\u006E", writer13);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Writer must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(unicodeEscaper2);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test00079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00079");
        java.lang.String str1 = org.apache.commons.lang3.text.translate.CharSequenceTranslator.hex((int) (short) 1);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "1" + "'", str1, "1");
    }

    @Test
    public void test00080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00080");
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper2 = org.apache.commons.lang3.text.translate.UnicodeEscaper.between((int) (byte) 1, (int) '#');
        java.lang.CharSequence charSequence3 = null;
        java.io.Writer writer4 = null;
        // The following exception was thrown during execution in test generation
        try {
            unicodeEscaper2.translate(charSequence3, writer4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Writer must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(unicodeEscaper2);
    }

    @Test
    public void test00081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00081");
        java.io.IOException iOException0 = new java.io.IOException();
        java.io.IOException iOException1 = new java.io.IOException();
        iOException0.addSuppressed((java.lang.Throwable) iOException1);
        java.lang.Throwable[] throwableArray3 = iOException1.getSuppressed();
        java.io.IOException iOException4 = new java.io.IOException((java.lang.Throwable) iOException1);
        java.io.IOException iOException6 = new java.io.IOException("");
        java.io.IOException iOException7 = new java.io.IOException((java.lang.Throwable) iOException6);
        iOException1.addSuppressed((java.lang.Throwable) iOException7);
        java.lang.Throwable[] throwableArray9 = iOException1.getSuppressed();
        java.io.IOException iOException10 = new java.io.IOException();
        java.io.IOException iOException11 = new java.io.IOException();
        iOException10.addSuppressed((java.lang.Throwable) iOException11);
        java.lang.Throwable[] throwableArray13 = iOException11.getSuppressed();
        java.io.IOException iOException14 = new java.io.IOException((java.lang.Throwable) iOException11);
        iOException1.addSuppressed((java.lang.Throwable) iOException11);
        java.lang.Class<?> wildcardClass16 = iOException1.getClass();
        org.junit.Assert.assertNotNull(throwableArray3);
        org.junit.Assert.assertNotNull(throwableArray9);
        org.junit.Assert.assertNotNull(throwableArray13);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test00082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00082");
        java.io.IOException iOException0 = new java.io.IOException();
        java.io.IOException iOException1 = new java.io.IOException();
        iOException0.addSuppressed((java.lang.Throwable) iOException1);
        java.io.IOException iOException3 = new java.io.IOException((java.lang.Throwable) iOException0);
        java.lang.Class<?> wildcardClass4 = iOException3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test00083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00083");
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper2 = org.apache.commons.lang3.text.translate.UnicodeEscaper.between(10, (int) '4');
        java.io.Writer writer4 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean5 = unicodeEscaper2.translate((int) (byte) 10, writer4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(unicodeEscaper2);
    }

    @Test
    public void test00084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00084");
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper2 = org.apache.commons.lang3.text.translate.UnicodeEscaper.between((int) (byte) 1, (int) '#');
        java.io.Writer writer4 = null;
        boolean boolean5 = unicodeEscaper2.translate((int) '4', writer4);
        java.io.Writer writer7 = null;
        boolean boolean8 = unicodeEscaper2.translate((int) (byte) -1, writer7);
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper11 = org.apache.commons.lang3.text.translate.UnicodeEscaper.between((int) (byte) 1, (int) '#');
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper13 = org.apache.commons.lang3.text.translate.UnicodeEscaper.below(100);
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper15 = org.apache.commons.lang3.text.translate.UnicodeEscaper.below((int) 'a');
        java.lang.String str17 = unicodeEscaper15.translate((java.lang.CharSequence) "java.io.IOException: java.io.IOException");
        org.apache.commons.lang3.text.translate.CharSequenceTranslator[] charSequenceTranslatorArray18 = new org.apache.commons.lang3.text.translate.CharSequenceTranslator[] { unicodeEscaper11, unicodeEscaper13, unicodeEscaper15 };
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator19 = unicodeEscaper2.with(charSequenceTranslatorArray18);
        java.io.Writer writer22 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int23 = charSequenceTranslator19.translate((java.lang.CharSequence) "", (-1), writer22);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: -1");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(unicodeEscaper2);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(unicodeEscaper11);
        org.junit.Assert.assertNotNull(unicodeEscaper13);
        org.junit.Assert.assertNotNull(unicodeEscaper15);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "java\\u002Eio\\u002E\\u0049\\u004F\\u0045xception\\u003A\\u0020java\\u002Eio\\u002E\\u0049\\u004F\\u0045xception" + "'", str17, "java\\u002Eio\\u002E\\u0049\\u004F\\u0045xception\\u003A\\u0020java\\u002Eio\\u002E\\u0049\\u004F\\u0045xception");
        org.junit.Assert.assertNotNull(charSequenceTranslatorArray18);
        org.junit.Assert.assertNotNull(charSequenceTranslator19);
    }

    @Test
    public void test00085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00085");
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper2 = org.apache.commons.lang3.text.translate.UnicodeEscaper.between((-1), (int) (byte) 1);
        java.io.Writer writer4 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean5 = unicodeEscaper2.translate((int) (byte) -1, writer4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(unicodeEscaper2);
    }

    @Test
    public void test00086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00086");
        java.io.IOException iOException1 = new java.io.IOException();
        java.io.IOException iOException2 = new java.io.IOException();
        iOException1.addSuppressed((java.lang.Throwable) iOException2);
        java.io.IOException iOException4 = new java.io.IOException("0", (java.lang.Throwable) iOException1);
        java.io.IOException iOException5 = new java.io.IOException((java.lang.Throwable) iOException4);
        java.io.IOException iOException6 = new java.io.IOException((java.lang.Throwable) iOException5);
        java.io.IOException iOException7 = new java.io.IOException((java.lang.Throwable) iOException6);
        java.lang.String str8 = iOException7.toString();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "java.io.IOException: java.io.IOException: java.io.IOException: java.io.IOException: 0" + "'", str8, "java.io.IOException: java.io.IOException: java.io.IOException: java.io.IOException: 0");
    }

    @Test
    public void test00087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00087");
        java.io.IOException iOException0 = new java.io.IOException();
        java.io.IOException iOException1 = new java.io.IOException();
        iOException0.addSuppressed((java.lang.Throwable) iOException1);
        java.lang.Throwable[] throwableArray3 = iOException1.getSuppressed();
        java.io.IOException iOException4 = new java.io.IOException((java.lang.Throwable) iOException1);
        java.io.IOException iOException6 = new java.io.IOException("");
        java.io.IOException iOException7 = new java.io.IOException((java.lang.Throwable) iOException6);
        iOException1.addSuppressed((java.lang.Throwable) iOException7);
        java.io.IOException iOException10 = new java.io.IOException("0");
        java.io.IOException iOException11 = new java.io.IOException((java.lang.Throwable) iOException10);
        iOException1.addSuppressed((java.lang.Throwable) iOException10);
        java.lang.Class<?> wildcardClass13 = iOException1.getClass();
        org.junit.Assert.assertNotNull(throwableArray3);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test00088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00088");
        java.io.IOException iOException1 = new java.io.IOException("");
        java.io.IOException iOException2 = new java.io.IOException((java.lang.Throwable) iOException1);
        java.io.IOException iOException4 = new java.io.IOException("");
        iOException2.addSuppressed((java.lang.Throwable) iOException4);
        java.lang.String str6 = iOException2.toString();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "java.io.IOException: java.io.IOException: " + "'", str6, "java.io.IOException: java.io.IOException: ");
    }

    @Test
    public void test00089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00089");
        java.io.IOException iOException2 = new java.io.IOException("");
        java.io.IOException iOException3 = new java.io.IOException((java.lang.Throwable) iOException2);
        java.io.IOException iOException5 = new java.io.IOException("");
        iOException3.addSuppressed((java.lang.Throwable) iOException5);
        java.io.IOException iOException7 = new java.io.IOException("java.io.IOException", (java.lang.Throwable) iOException5);
        java.io.IOException iOException9 = new java.io.IOException("");
        java.io.IOException iOException10 = new java.io.IOException((java.lang.Throwable) iOException9);
        java.io.IOException iOException11 = new java.io.IOException((java.lang.Throwable) iOException9);
        iOException7.addSuppressed((java.lang.Throwable) iOException9);
        java.lang.String str13 = iOException9.toString();
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "java.io.IOException: " + "'", str13, "java.io.IOException: ");
    }

    @Test
    public void test00090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00090");
        java.io.IOException iOException1 = new java.io.IOException("0");
        java.lang.String str2 = iOException1.toString();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "java.io.IOException: 0" + "'", str2, "java.io.IOException: 0");
    }

    @Test
    public void test00091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00091");
        java.io.IOException iOException1 = new java.io.IOException();
        java.io.IOException iOException2 = new java.io.IOException();
        iOException1.addSuppressed((java.lang.Throwable) iOException2);
        java.io.IOException iOException4 = new java.io.IOException("0", (java.lang.Throwable) iOException1);
        java.io.IOException iOException5 = new java.io.IOException((java.lang.Throwable) iOException4);
        java.io.IOException iOException6 = new java.io.IOException((java.lang.Throwable) iOException5);
        java.io.IOException iOException7 = new java.io.IOException((java.lang.Throwable) iOException6);
        java.lang.String str8 = iOException6.toString();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "java.io.IOException: java.io.IOException: java.io.IOException: 0" + "'", str8, "java.io.IOException: java.io.IOException: java.io.IOException: 0");
    }

    @Test
    public void test00092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00092");
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper2 = org.apache.commons.lang3.text.translate.UnicodeEscaper.outsideOf((int) (short) 10, (int) (byte) 100);
        java.io.Writer writer4 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean5 = unicodeEscaper2.translate(1, writer4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(unicodeEscaper2);
    }

    @Test
    public void test00093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00093");
        java.io.IOException iOException1 = new java.io.IOException("0");
        java.io.IOException iOException2 = new java.io.IOException();
        java.io.IOException iOException3 = new java.io.IOException();
        iOException2.addSuppressed((java.lang.Throwable) iOException3);
        java.io.IOException iOException5 = new java.io.IOException();
        java.io.IOException iOException6 = new java.io.IOException();
        iOException5.addSuppressed((java.lang.Throwable) iOException6);
        java.lang.Throwable[] throwableArray8 = iOException6.getSuppressed();
        java.io.IOException iOException9 = new java.io.IOException((java.lang.Throwable) iOException6);
        java.io.IOException iOException11 = new java.io.IOException("");
        java.io.IOException iOException12 = new java.io.IOException((java.lang.Throwable) iOException11);
        iOException6.addSuppressed((java.lang.Throwable) iOException12);
        iOException3.addSuppressed((java.lang.Throwable) iOException12);
        iOException1.addSuppressed((java.lang.Throwable) iOException3);
        java.lang.String str16 = iOException1.toString();
        org.junit.Assert.assertNotNull(throwableArray8);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "java.io.IOException: 0" + "'", str16, "java.io.IOException: 0");
    }

    @Test
    public void test00094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00094");
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper2 = org.apache.commons.lang3.text.translate.UnicodeEscaper.outsideOf((int) (short) 10, (int) (byte) 100);
        java.io.Writer writer4 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean5 = unicodeEscaper2.translate((int) (short) 1, writer4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(unicodeEscaper2);
    }

    @Test
    public void test00095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00095");
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper1 = org.apache.commons.lang3.text.translate.UnicodeEscaper.above(10);
        java.io.Writer writer3 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean4 = unicodeEscaper1.translate((int) (short) 100, writer3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(unicodeEscaper1);
    }

    @Test
    public void test00096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00096");
        java.lang.String str1 = org.apache.commons.lang3.text.translate.CharSequenceTranslator.hex(0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "0" + "'", str1, "0");
    }

    @Test
    public void test00097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00097");
        java.io.IOException iOException2 = new java.io.IOException("");
        java.io.IOException iOException3 = new java.io.IOException("A", (java.lang.Throwable) iOException2);
        java.lang.String str4 = iOException2.toString();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "java.io.IOException: " + "'", str4, "java.io.IOException: ");
    }

    @Test
    public void test00098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00098");
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper0 = new org.apache.commons.lang3.text.translate.UnicodeEscaper();
        java.lang.String str2 = unicodeEscaper0.translate((java.lang.CharSequence) "hi!");
        java.io.Writer writer4 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean5 = unicodeEscaper0.translate((int) (byte) 10, writer4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\\u0068\\u0069\\u0021" + "'", str2, "\\u0068\\u0069\\u0021");
    }

    @Test
    public void test00099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00099");
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper1 = org.apache.commons.lang3.text.translate.UnicodeEscaper.below(100);
        java.lang.String str3 = unicodeEscaper1.translate((java.lang.CharSequence) "\\u0068\\u0069\\u0021");
        java.io.Writer writer5 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean6 = unicodeEscaper1.translate((int) (short) 1, writer5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(unicodeEscaper1);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\\u005Cu\\u0030\\u0030\\u0036\\u0038\\u005Cu\\u0030\\u0030\\u0036\\u0039\\u005Cu\\u0030\\u0030\\u0032\\u0031" + "'", str3, "\\u005Cu\\u0030\\u0030\\u0036\\u0038\\u005Cu\\u0030\\u0030\\u0036\\u0039\\u005Cu\\u0030\\u0030\\u0032\\u0031");
    }

    @Test
    public void test00100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00100");
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper1 = org.apache.commons.lang3.text.translate.UnicodeEscaper.above(1);
        java.lang.CharSequence charSequence2 = null;
        java.io.Writer writer4 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int5 = unicodeEscaper1.translate(charSequence2, (int) (byte) 1, writer4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(unicodeEscaper1);
    }

    @Test
    public void test00101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00101");
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper2 = org.apache.commons.lang3.text.translate.UnicodeEscaper.outsideOf(0, (int) 'a');
        java.io.Writer writer4 = null;
        boolean boolean5 = unicodeEscaper2.translate((int) (short) 10, writer4);
        java.lang.String str7 = unicodeEscaper2.translate((java.lang.CharSequence) "0");
        java.io.Writer writer10 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int11 = unicodeEscaper2.translate((java.lang.CharSequence) "1", (int) (byte) 100, writer10);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 100");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(unicodeEscaper2);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "0" + "'", str7, "0");
    }

    @Test
    public void test00102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00102");
        java.lang.String str1 = org.apache.commons.lang3.text.translate.CharSequenceTranslator.hex(1);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "1" + "'", str1, "1");
    }

    @Test
    public void test00103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00103");
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper2 = org.apache.commons.lang3.text.translate.UnicodeEscaper.outsideOf((-1), (int) (short) 0);
        java.io.Writer writer4 = null;
        // The following exception was thrown during execution in test generation
        try {
            unicodeEscaper2.translate((java.lang.CharSequence) "\\u0068\\u0069\\u0021", writer4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Writer must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(unicodeEscaper2);
    }

    @Test
    public void test00104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00104");
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper2 = org.apache.commons.lang3.text.translate.UnicodeEscaper.outsideOf((int) (short) 0, 1);
        java.io.Writer writer4 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean5 = unicodeEscaper2.translate((int) (short) -1, writer4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(unicodeEscaper2);
    }

    @Test
    public void test00105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00105");
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper1 = org.apache.commons.lang3.text.translate.UnicodeEscaper.above((int) (byte) 0);
        java.io.Writer writer4 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int5 = unicodeEscaper1.translate((java.lang.CharSequence) "61", (int) (short) 0, writer4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(unicodeEscaper1);
    }

    @Test
    public void test00106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00106");
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper2 = org.apache.commons.lang3.text.translate.UnicodeEscaper.between((int) '4', (int) (short) 1);
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper5 = org.apache.commons.lang3.text.translate.UnicodeEscaper.between((-1), (int) (byte) -1);
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper8 = org.apache.commons.lang3.text.translate.UnicodeEscaper.outsideOf((int) '4', (int) (short) 0);
        org.apache.commons.lang3.text.translate.CharSequenceTranslator[] charSequenceTranslatorArray9 = new org.apache.commons.lang3.text.translate.CharSequenceTranslator[] { unicodeEscaper8 };
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator10 = unicodeEscaper5.with(charSequenceTranslatorArray9);
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator11 = unicodeEscaper2.with(charSequenceTranslatorArray9);
        java.io.Writer writer14 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int15 = charSequenceTranslator11.translate((java.lang.CharSequence) "\\u005Cu\\u0030\\u0030\\u0036\\u0038\\u005Cu\\u0030\\u0030\\u0036\\u0039\\u005Cu\\u0030\\u0030\\u0032\\u0031", (int) 'a', writer14);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 97");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(unicodeEscaper2);
        org.junit.Assert.assertNotNull(unicodeEscaper5);
        org.junit.Assert.assertNotNull(unicodeEscaper8);
        org.junit.Assert.assertNotNull(charSequenceTranslatorArray9);
        org.junit.Assert.assertNotNull(charSequenceTranslator10);
        org.junit.Assert.assertNotNull(charSequenceTranslator11);
    }

    @Test
    public void test00107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00107");
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper2 = org.apache.commons.lang3.text.translate.UnicodeEscaper.between((int) (byte) -1, (int) ' ');
        java.io.Writer writer5 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int6 = unicodeEscaper2.translate((java.lang.CharSequence) "java.io.IOException: 0", (int) (byte) -1, writer5);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: -1");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(unicodeEscaper2);
    }

    @Test
    public void test00108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00108");
        java.lang.String str1 = org.apache.commons.lang3.text.translate.CharSequenceTranslator.hex((int) (byte) 1);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "1" + "'", str1, "1");
    }

    @Test
    public void test00109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00109");
        java.io.IOException iOException0 = new java.io.IOException();
        java.io.IOException iOException1 = new java.io.IOException();
        iOException0.addSuppressed((java.lang.Throwable) iOException1);
        java.lang.Throwable[] throwableArray3 = iOException1.getSuppressed();
        java.io.IOException iOException4 = new java.io.IOException((java.lang.Throwable) iOException1);
        java.lang.Class<?> wildcardClass5 = iOException4.getClass();
        org.junit.Assert.assertNotNull(throwableArray3);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test00110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00110");
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper2 = org.apache.commons.lang3.text.translate.UnicodeEscaper.between((int) (byte) 1, (int) '#');
        java.io.Writer writer4 = null;
        boolean boolean5 = unicodeEscaper2.translate((int) '4', writer4);
        java.io.Writer writer7 = null;
        boolean boolean8 = unicodeEscaper2.translate((int) (byte) -1, writer7);
        java.io.Writer writer10 = null;
        boolean boolean11 = unicodeEscaper2.translate(0, writer10);
        java.io.Writer writer13 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean14 = unicodeEscaper2.translate(1, writer13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(unicodeEscaper2);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test00111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00111");
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper1 = org.apache.commons.lang3.text.translate.UnicodeEscaper.above((int) ' ');
        java.io.Writer writer4 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int5 = unicodeEscaper1.translate((java.lang.CharSequence) "\\u0068\\u0069\\u0021", (int) (byte) -1, writer4);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: -1");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(unicodeEscaper1);
    }

    @Test
    public void test00112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00112");
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper2 = org.apache.commons.lang3.text.translate.UnicodeEscaper.between((int) (byte) 10, 100);
        java.lang.CharSequence charSequence3 = null;
        java.io.Writer writer4 = null;
        // The following exception was thrown during execution in test generation
        try {
            unicodeEscaper2.translate(charSequence3, writer4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Writer must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(unicodeEscaper2);
    }

    @Test
    public void test00113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00113");
        java.lang.String str1 = org.apache.commons.lang3.text.translate.CharSequenceTranslator.hex((int) (short) -1);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "FFFFFFFF" + "'", str1, "FFFFFFFF");
    }

    @Test
    public void test00114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00114");
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper2 = org.apache.commons.lang3.text.translate.UnicodeEscaper.between((-1), (int) (byte) -1);
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper5 = org.apache.commons.lang3.text.translate.UnicodeEscaper.outsideOf((int) '4', (int) (short) 0);
        org.apache.commons.lang3.text.translate.CharSequenceTranslator[] charSequenceTranslatorArray6 = new org.apache.commons.lang3.text.translate.CharSequenceTranslator[] { unicodeEscaper5 };
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator7 = unicodeEscaper2.with(charSequenceTranslatorArray6);
        java.io.Writer writer9 = null;
        // The following exception was thrown during execution in test generation
        try {
            unicodeEscaper2.translate((java.lang.CharSequence) "\\u006A\\u0061\\u0076\\u0061\\u002E\\u0069\\u006F\\u002E\\u0049\\u004F\\u0045\\u0078\\u0063\\u0065\\u0070\\u0074\\u0069\\u006F\\u006E\\u003A\\u0020\\u006A\\u0061\\u0076\\u0061\\u002E\\u0069\\u006F\\u002E\\u0049\\u004F\\u0045\\u0078\\u0063\\u0065\\u0070\\u0074\\u0069\\u006F\\u006E", writer9);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Writer must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(unicodeEscaper2);
        org.junit.Assert.assertNotNull(unicodeEscaper5);
        org.junit.Assert.assertNotNull(charSequenceTranslatorArray6);
        org.junit.Assert.assertNotNull(charSequenceTranslator7);
    }

    @Test
    public void test00115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00115");
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper2 = org.apache.commons.lang3.text.translate.UnicodeEscaper.outsideOf(0, (int) 'a');
        java.io.Writer writer4 = null;
        boolean boolean5 = unicodeEscaper2.translate((int) (short) 10, writer4);
        java.io.Writer writer7 = null;
        boolean boolean8 = unicodeEscaper2.translate((int) '#', writer7);
        java.io.Writer writer11 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int12 = unicodeEscaper2.translate((java.lang.CharSequence) "64", (int) (byte) 10, writer11);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 10");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(unicodeEscaper2);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test00116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00116");
        java.io.IOException iOException3 = new java.io.IOException("0");
        java.lang.Throwable[] throwableArray4 = iOException3.getSuppressed();
        java.io.IOException iOException5 = new java.io.IOException("hi!", (java.lang.Throwable) iOException3);
        java.io.IOException iOException7 = new java.io.IOException("");
        java.io.IOException iOException8 = new java.io.IOException((java.lang.Throwable) iOException7);
        java.io.IOException iOException10 = new java.io.IOException("");
        iOException8.addSuppressed((java.lang.Throwable) iOException10);
        java.io.IOException iOException13 = new java.io.IOException("");
        java.io.IOException iOException14 = new java.io.IOException((java.lang.Throwable) iOException13);
        java.io.IOException iOException16 = new java.io.IOException("");
        iOException14.addSuppressed((java.lang.Throwable) iOException16);
        iOException8.addSuppressed((java.lang.Throwable) iOException14);
        iOException5.addSuppressed((java.lang.Throwable) iOException8);
        java.io.IOException iOException20 = new java.io.IOException("hi!", (java.lang.Throwable) iOException8);
        java.lang.String str21 = iOException20.toString();
        org.junit.Assert.assertNotNull(throwableArray4);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "java.io.IOException: hi!" + "'", str21, "java.io.IOException: hi!");
    }

    @Test
    public void test00117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00117");
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper2 = org.apache.commons.lang3.text.translate.UnicodeEscaper.between((int) (byte) 0, (int) 'a');
        java.io.Writer writer4 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean5 = unicodeEscaper2.translate(0, writer4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(unicodeEscaper2);
    }

    @Test
    public void test00118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00118");
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper2 = org.apache.commons.lang3.text.translate.UnicodeEscaper.outsideOf(0, (int) (byte) -1);
        java.io.Writer writer5 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int6 = unicodeEscaper2.translate((java.lang.CharSequence) "java.io.IOException: java.io.IOException: java.io.IOException: 0", (int) (byte) 0, writer5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(unicodeEscaper2);
    }

    @Test
    public void test00119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00119");
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper1 = org.apache.commons.lang3.text.translate.UnicodeEscaper.below((int) 'a');
        java.io.Writer writer4 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int5 = unicodeEscaper1.translate((java.lang.CharSequence) "", (int) '#', writer4);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 35");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(unicodeEscaper1);
    }

    @Test
    public void test00120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00120");
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper2 = org.apache.commons.lang3.text.translate.UnicodeEscaper.outsideOf((int) '#', (int) '4');
        java.io.Writer writer5 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int6 = unicodeEscaper2.translate((java.lang.CharSequence) "java.io.IOException: 0", 0, writer5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(unicodeEscaper2);
    }

    @Test
    public void test00121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00121");
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper2 = org.apache.commons.lang3.text.translate.UnicodeEscaper.outsideOf((int) (short) 10, (int) (byte) -1);
        java.io.Writer writer4 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean5 = unicodeEscaper2.translate((int) ' ', writer4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(unicodeEscaper2);
    }

    @Test
    public void test00122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00122");
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper1 = org.apache.commons.lang3.text.translate.UnicodeEscaper.above(1);
        java.io.Writer writer3 = null;
        // The following exception was thrown during execution in test generation
        try {
            unicodeEscaper1.translate((java.lang.CharSequence) "java.io.IOException: 0", writer3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Writer must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(unicodeEscaper1);
    }

    @Test
    public void test00123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00123");
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper0 = new org.apache.commons.lang3.text.translate.UnicodeEscaper();
        java.lang.String str2 = unicodeEscaper0.translate((java.lang.CharSequence) "hi!");
        java.io.Writer writer4 = null;
        boolean boolean5 = unicodeEscaper0.translate((int) (byte) -1, writer4);
        java.io.Writer writer7 = null;
        boolean boolean8 = unicodeEscaper0.translate((int) (byte) -1, writer7);
        java.io.Writer writer11 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int12 = unicodeEscaper0.translate((java.lang.CharSequence) "", (int) (short) 0, writer11);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\\u0068\\u0069\\u0021" + "'", str2, "\\u0068\\u0069\\u0021");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test00124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00124");
        java.io.IOException iOException1 = new java.io.IOException();
        java.io.IOException iOException2 = new java.io.IOException();
        iOException1.addSuppressed((java.lang.Throwable) iOException2);
        java.io.IOException iOException4 = new java.io.IOException("0", (java.lang.Throwable) iOException1);
        java.lang.Throwable[] throwableArray5 = iOException4.getSuppressed();
        java.lang.Class<?> wildcardClass6 = iOException4.getClass();
        org.junit.Assert.assertNotNull(throwableArray5);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test00125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00125");
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper1 = org.apache.commons.lang3.text.translate.UnicodeEscaper.below((int) 'a');
        java.lang.String str3 = unicodeEscaper1.translate((java.lang.CharSequence) "java.io.IOException: java.io.IOException");
        java.io.Writer writer5 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean6 = unicodeEscaper1.translate(1, writer5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(unicodeEscaper1);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "java\\u002Eio\\u002E\\u0049\\u004F\\u0045xception\\u003A\\u0020java\\u002Eio\\u002E\\u0049\\u004F\\u0045xception" + "'", str3, "java\\u002Eio\\u002E\\u0049\\u004F\\u0045xception\\u003A\\u0020java\\u002Eio\\u002E\\u0049\\u004F\\u0045xception");
    }

    @Test
    public void test00126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00126");
        java.io.IOException iOException2 = new java.io.IOException("0");
        java.lang.Throwable[] throwableArray3 = iOException2.getSuppressed();
        java.io.IOException iOException4 = new java.io.IOException("hi!", (java.lang.Throwable) iOException2);
        java.lang.Throwable[] throwableArray5 = iOException2.getSuppressed();
        java.lang.Class<?> wildcardClass6 = iOException2.getClass();
        org.junit.Assert.assertNotNull(throwableArray3);
        org.junit.Assert.assertNotNull(throwableArray5);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test00127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00127");
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper2 = org.apache.commons.lang3.text.translate.UnicodeEscaper.outsideOf((int) (byte) 0, 0);
        java.io.Writer writer4 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean5 = unicodeEscaper2.translate(10, writer4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(unicodeEscaper2);
    }

    @Test
    public void test00128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00128");
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper0 = new org.apache.commons.lang3.text.translate.UnicodeEscaper();
        java.lang.String str2 = unicodeEscaper0.translate((java.lang.CharSequence) "hi!");
        java.io.Writer writer5 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int6 = unicodeEscaper0.translate((java.lang.CharSequence) "\\u0036\\u0034", 100, writer5);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 100");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\\u0068\\u0069\\u0021" + "'", str2, "\\u0068\\u0069\\u0021");
    }

    @Test
    public void test00129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00129");
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper1 = org.apache.commons.lang3.text.translate.UnicodeEscaper.below((int) (short) 1);
        java.lang.CharSequence charSequence2 = null;
        java.io.Writer writer3 = null;
        // The following exception was thrown during execution in test generation
        try {
            unicodeEscaper1.translate(charSequence2, writer3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Writer must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(unicodeEscaper1);
    }

    @Test
    public void test00130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00130");
        java.io.IOException iOException3 = new java.io.IOException("0");
        java.lang.Throwable[] throwableArray4 = iOException3.getSuppressed();
        java.io.IOException iOException5 = new java.io.IOException("hi!", (java.lang.Throwable) iOException3);
        java.io.IOException iOException6 = new java.io.IOException("java.io.IOException", (java.lang.Throwable) iOException3);
        java.lang.String str7 = iOException3.toString();
        org.junit.Assert.assertNotNull(throwableArray4);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "java.io.IOException: 0" + "'", str7, "java.io.IOException: 0");
    }

    @Test
    public void test00131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00131");
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper2 = org.apache.commons.lang3.text.translate.UnicodeEscaper.between((int) (byte) 1, (int) '#');
        java.io.Writer writer4 = null;
        boolean boolean5 = unicodeEscaper2.translate((int) '4', writer4);
        java.io.Writer writer7 = null;
        boolean boolean8 = unicodeEscaper2.translate((int) (byte) -1, writer7);
        java.lang.String str10 = unicodeEscaper2.translate((java.lang.CharSequence) "java.io.IOException");
        java.lang.Class<?> wildcardClass11 = unicodeEscaper2.getClass();
        org.junit.Assert.assertNotNull(unicodeEscaper2);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "java.io.IOException" + "'", str10, "java.io.IOException");
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test00132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00132");
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper2 = org.apache.commons.lang3.text.translate.UnicodeEscaper.between((int) (byte) 0, (int) 'a');
        java.io.Writer writer5 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int6 = unicodeEscaper2.translate((java.lang.CharSequence) "1", (int) 'a', writer5);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 97");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(unicodeEscaper2);
    }

    @Test
    public void test00133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00133");
        java.io.IOException iOException1 = new java.io.IOException("0");
        java.lang.Throwable[] throwableArray2 = iOException1.getSuppressed();
        java.lang.Class<?> wildcardClass3 = throwableArray2.getClass();
        org.junit.Assert.assertNotNull(throwableArray2);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test00134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00134");
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper1 = org.apache.commons.lang3.text.translate.UnicodeEscaper.below((int) 'a');
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper4 = org.apache.commons.lang3.text.translate.UnicodeEscaper.between((int) (byte) 1, (int) '#');
        java.io.Writer writer6 = null;
        boolean boolean7 = unicodeEscaper4.translate((int) '4', writer6);
        java.io.Writer writer9 = null;
        boolean boolean10 = unicodeEscaper4.translate((int) (byte) -1, writer9);
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper13 = org.apache.commons.lang3.text.translate.UnicodeEscaper.between((int) (byte) 1, (int) '#');
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper15 = org.apache.commons.lang3.text.translate.UnicodeEscaper.below(100);
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper17 = org.apache.commons.lang3.text.translate.UnicodeEscaper.below((int) 'a');
        java.lang.String str19 = unicodeEscaper17.translate((java.lang.CharSequence) "java.io.IOException: java.io.IOException");
        org.apache.commons.lang3.text.translate.CharSequenceTranslator[] charSequenceTranslatorArray20 = new org.apache.commons.lang3.text.translate.CharSequenceTranslator[] { unicodeEscaper13, unicodeEscaper15, unicodeEscaper17 };
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator21 = unicodeEscaper4.with(charSequenceTranslatorArray20);
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper24 = org.apache.commons.lang3.text.translate.UnicodeEscaper.outsideOf(0, (int) 'a');
        java.io.Writer writer26 = null;
        boolean boolean27 = unicodeEscaper24.translate((int) (short) 10, writer26);
        java.lang.String str29 = unicodeEscaper24.translate((java.lang.CharSequence) "0");
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper32 = org.apache.commons.lang3.text.translate.UnicodeEscaper.between((int) (byte) 1, (int) '#');
        java.io.Writer writer34 = null;
        boolean boolean35 = unicodeEscaper32.translate((int) '4', writer34);
        java.io.Writer writer37 = null;
        boolean boolean38 = unicodeEscaper32.translate((int) (byte) -1, writer37);
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper41 = org.apache.commons.lang3.text.translate.UnicodeEscaper.between((int) (byte) 1, (int) '#');
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper43 = org.apache.commons.lang3.text.translate.UnicodeEscaper.below(100);
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper45 = org.apache.commons.lang3.text.translate.UnicodeEscaper.below((int) 'a');
        java.lang.String str47 = unicodeEscaper45.translate((java.lang.CharSequence) "java.io.IOException: java.io.IOException");
        org.apache.commons.lang3.text.translate.CharSequenceTranslator[] charSequenceTranslatorArray48 = new org.apache.commons.lang3.text.translate.CharSequenceTranslator[] { unicodeEscaper41, unicodeEscaper43, unicodeEscaper45 };
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator49 = unicodeEscaper32.with(charSequenceTranslatorArray48);
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator50 = unicodeEscaper24.with(charSequenceTranslatorArray48);
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator51 = unicodeEscaper4.with(charSequenceTranslatorArray48);
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator52 = unicodeEscaper1.with(charSequenceTranslatorArray48);
        java.lang.Class<?> wildcardClass53 = unicodeEscaper1.getClass();
        org.junit.Assert.assertNotNull(unicodeEscaper1);
        org.junit.Assert.assertNotNull(unicodeEscaper4);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(unicodeEscaper13);
        org.junit.Assert.assertNotNull(unicodeEscaper15);
        org.junit.Assert.assertNotNull(unicodeEscaper17);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "java\\u002Eio\\u002E\\u0049\\u004F\\u0045xception\\u003A\\u0020java\\u002Eio\\u002E\\u0049\\u004F\\u0045xception" + "'", str19, "java\\u002Eio\\u002E\\u0049\\u004F\\u0045xception\\u003A\\u0020java\\u002Eio\\u002E\\u0049\\u004F\\u0045xception");
        org.junit.Assert.assertNotNull(charSequenceTranslatorArray20);
        org.junit.Assert.assertNotNull(charSequenceTranslator21);
        org.junit.Assert.assertNotNull(unicodeEscaper24);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "0" + "'", str29, "0");
        org.junit.Assert.assertNotNull(unicodeEscaper32);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertNotNull(unicodeEscaper41);
        org.junit.Assert.assertNotNull(unicodeEscaper43);
        org.junit.Assert.assertNotNull(unicodeEscaper45);
        org.junit.Assert.assertEquals("'" + str47 + "' != '" + "java\\u002Eio\\u002E\\u0049\\u004F\\u0045xception\\u003A\\u0020java\\u002Eio\\u002E\\u0049\\u004F\\u0045xception" + "'", str47, "java\\u002Eio\\u002E\\u0049\\u004F\\u0045xception\\u003A\\u0020java\\u002Eio\\u002E\\u0049\\u004F\\u0045xception");
        org.junit.Assert.assertNotNull(charSequenceTranslatorArray48);
        org.junit.Assert.assertNotNull(charSequenceTranslator49);
        org.junit.Assert.assertNotNull(charSequenceTranslator50);
        org.junit.Assert.assertNotNull(charSequenceTranslator51);
        org.junit.Assert.assertNotNull(charSequenceTranslator52);
        org.junit.Assert.assertNotNull(wildcardClass53);
    }

    @Test
    public void test00135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00135");
        java.io.IOException iOException1 = new java.io.IOException();
        java.io.IOException iOException2 = new java.io.IOException();
        iOException1.addSuppressed((java.lang.Throwable) iOException2);
        java.io.IOException iOException4 = new java.io.IOException("0", (java.lang.Throwable) iOException1);
        java.io.IOException iOException5 = new java.io.IOException((java.lang.Throwable) iOException4);
        java.io.IOException iOException6 = new java.io.IOException((java.lang.Throwable) iOException5);
        java.io.IOException iOException8 = new java.io.IOException();
        java.io.IOException iOException9 = new java.io.IOException();
        iOException8.addSuppressed((java.lang.Throwable) iOException9);
        java.lang.Throwable[] throwableArray11 = iOException9.getSuppressed();
        java.lang.Throwable[] throwableArray12 = iOException9.getSuppressed();
        java.io.IOException iOException13 = new java.io.IOException("java.io.IOException", (java.lang.Throwable) iOException9);
        java.io.IOException iOException14 = new java.io.IOException();
        java.io.IOException iOException15 = new java.io.IOException();
        iOException14.addSuppressed((java.lang.Throwable) iOException15);
        java.io.IOException iOException17 = new java.io.IOException((java.lang.Throwable) iOException14);
        java.lang.Throwable[] throwableArray18 = iOException17.getSuppressed();
        iOException13.addSuppressed((java.lang.Throwable) iOException17);
        iOException5.addSuppressed((java.lang.Throwable) iOException17);
        java.io.IOException iOException21 = new java.io.IOException((java.lang.Throwable) iOException17);
        java.lang.Class<?> wildcardClass22 = iOException17.getClass();
        org.junit.Assert.assertNotNull(throwableArray11);
        org.junit.Assert.assertNotNull(throwableArray12);
        org.junit.Assert.assertNotNull(throwableArray18);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test00136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00136");
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper2 = org.apache.commons.lang3.text.translate.UnicodeEscaper.outsideOf(0, (int) 'a');
        java.io.Writer writer4 = null;
        boolean boolean5 = unicodeEscaper2.translate((int) (short) 10, writer4);
        java.io.Writer writer7 = null;
        boolean boolean8 = unicodeEscaper2.translate((int) (short) 10, writer7);
        java.io.Writer writer10 = null;
        // The following exception was thrown during execution in test generation
        try {
            unicodeEscaper2.translate((java.lang.CharSequence) "java.io.IOException", writer10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Writer must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(unicodeEscaper2);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test00137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00137");
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper1 = org.apache.commons.lang3.text.translate.UnicodeEscaper.below((int) 'a');
        java.lang.String str3 = unicodeEscaper1.translate((java.lang.CharSequence) "java.io.IOException: java.io.IOException");
        java.io.Writer writer6 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int7 = unicodeEscaper1.translate((java.lang.CharSequence) "\\u006A\\u0061\\u0076\\u0061\\u005C\\u0075\\u0030\\u0030\\u0032\\u0045\\u0069\\u006F\\u005C\\u0075\\u0030\\u0030\\u0032\\u0045\\u005C\\u0075\\u0030\\u0030\\u0034\\u0039\\u005C\\u0075\\u0030\\u0030\\u0034\\u0046\\u005C\\u0075\\u0030\\u0030\\u0034\\u0035\\u0078\\u0063\\u0065\\u0070\\u0074\\u0069\\u006F\\u006E\\u005C\\u0075\\u0030\\u0030\\u0033\\u0041\\u005C\\u0075\\u0030\\u0030\\u0032\\u0030\\u006A\\u0061\\u0076\\u0061\\u005C\\u0075\\u0030\\u0030\\u0032\\u0045\\u0069\\u006F\\u005C\\u0075\\u0030\\u0030\\u0032\\u0045\\u005C\\u0075\\u0030\\u0030\\u0034\\u0039\\u005C\\u0075\\u0030\\u0030\\u0034\\u0046\\u005C\\u0075\\u0030\\u0030\\u0034\\u0035\\u0078\\u0063\\u0065\\u0070\\u0074\\u0069\\u006F\\u006E", (int) (short) 10, writer6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(unicodeEscaper1);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "java\\u002Eio\\u002E\\u0049\\u004F\\u0045xception\\u003A\\u0020java\\u002Eio\\u002E\\u0049\\u004F\\u0045xception" + "'", str3, "java\\u002Eio\\u002E\\u0049\\u004F\\u0045xception\\u003A\\u0020java\\u002Eio\\u002E\\u0049\\u004F\\u0045xception");
    }

    @Test
    public void test00138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00138");
        java.lang.String str1 = org.apache.commons.lang3.text.translate.CharSequenceTranslator.hex((int) (short) 10);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "A" + "'", str1, "A");
    }

    @Test
    public void test00139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00139");
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper2 = org.apache.commons.lang3.text.translate.UnicodeEscaper.outsideOf((int) (short) 10, (int) (byte) 100);
        java.io.Writer writer5 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int6 = unicodeEscaper2.translate((java.lang.CharSequence) "java.io.IOException: 0", (-1), writer5);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: -1");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(unicodeEscaper2);
    }

    @Test
    public void test00140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00140");
        java.io.IOException iOException2 = new java.io.IOException();
        java.io.IOException iOException3 = new java.io.IOException();
        iOException2.addSuppressed((java.lang.Throwable) iOException3);
        java.io.IOException iOException5 = new java.io.IOException("0", (java.lang.Throwable) iOException2);
        java.io.IOException iOException6 = new java.io.IOException((java.lang.Throwable) iOException5);
        java.io.IOException iOException7 = new java.io.IOException("", (java.lang.Throwable) iOException6);
        java.lang.Class<?> wildcardClass8 = iOException7.getClass();
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test00141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00141");
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper2 = org.apache.commons.lang3.text.translate.UnicodeEscaper.outsideOf((int) (short) 1, (int) 'a');
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper4 = org.apache.commons.lang3.text.translate.UnicodeEscaper.below((int) (byte) 0);
        java.io.Writer writer6 = null;
        boolean boolean7 = unicodeEscaper4.translate((int) ' ', writer6);
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper10 = org.apache.commons.lang3.text.translate.UnicodeEscaper.between((-1), (int) (short) 0);
        java.lang.String str12 = unicodeEscaper10.translate((java.lang.CharSequence) "0");
        org.apache.commons.lang3.text.translate.CharSequenceTranslator[] charSequenceTranslatorArray13 = new org.apache.commons.lang3.text.translate.CharSequenceTranslator[] {};
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator14 = unicodeEscaper10.with(charSequenceTranslatorArray13);
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator15 = unicodeEscaper4.with(charSequenceTranslatorArray13);
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator16 = unicodeEscaper2.with(charSequenceTranslatorArray13);
        java.lang.Class<?> wildcardClass17 = charSequenceTranslatorArray13.getClass();
        org.junit.Assert.assertNotNull(unicodeEscaper2);
        org.junit.Assert.assertNotNull(unicodeEscaper4);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(unicodeEscaper10);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "0" + "'", str12, "0");
        org.junit.Assert.assertNotNull(charSequenceTranslatorArray13);
        org.junit.Assert.assertNotNull(charSequenceTranslator14);
        org.junit.Assert.assertNotNull(charSequenceTranslator15);
        org.junit.Assert.assertNotNull(charSequenceTranslator16);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test00142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00142");
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper2 = org.apache.commons.lang3.text.translate.UnicodeEscaper.between((int) (byte) 100, (-1));
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper5 = org.apache.commons.lang3.text.translate.UnicodeEscaper.outsideOf(0, (int) 'a');
        java.io.Writer writer7 = null;
        boolean boolean8 = unicodeEscaper5.translate((int) (short) 10, writer7);
        java.lang.String str10 = unicodeEscaper5.translate((java.lang.CharSequence) "0");
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper13 = org.apache.commons.lang3.text.translate.UnicodeEscaper.between((int) (byte) 1, (int) '#');
        java.io.Writer writer15 = null;
        boolean boolean16 = unicodeEscaper13.translate((int) '4', writer15);
        java.io.Writer writer18 = null;
        boolean boolean19 = unicodeEscaper13.translate((int) (byte) -1, writer18);
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper22 = org.apache.commons.lang3.text.translate.UnicodeEscaper.between((int) (byte) 1, (int) '#');
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper24 = org.apache.commons.lang3.text.translate.UnicodeEscaper.below(100);
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper26 = org.apache.commons.lang3.text.translate.UnicodeEscaper.below((int) 'a');
        java.lang.String str28 = unicodeEscaper26.translate((java.lang.CharSequence) "java.io.IOException: java.io.IOException");
        org.apache.commons.lang3.text.translate.CharSequenceTranslator[] charSequenceTranslatorArray29 = new org.apache.commons.lang3.text.translate.CharSequenceTranslator[] { unicodeEscaper22, unicodeEscaper24, unicodeEscaper26 };
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator30 = unicodeEscaper13.with(charSequenceTranslatorArray29);
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator31 = unicodeEscaper5.with(charSequenceTranslatorArray29);
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator32 = unicodeEscaper2.with(charSequenceTranslatorArray29);
        java.io.Writer writer34 = null;
        // The following exception was thrown during execution in test generation
        try {
            unicodeEscaper2.translate((java.lang.CharSequence) "hi!", writer34);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Writer must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(unicodeEscaper2);
        org.junit.Assert.assertNotNull(unicodeEscaper5);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "0" + "'", str10, "0");
        org.junit.Assert.assertNotNull(unicodeEscaper13);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(unicodeEscaper22);
        org.junit.Assert.assertNotNull(unicodeEscaper24);
        org.junit.Assert.assertNotNull(unicodeEscaper26);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "java\\u002Eio\\u002E\\u0049\\u004F\\u0045xception\\u003A\\u0020java\\u002Eio\\u002E\\u0049\\u004F\\u0045xception" + "'", str28, "java\\u002Eio\\u002E\\u0049\\u004F\\u0045xception\\u003A\\u0020java\\u002Eio\\u002E\\u0049\\u004F\\u0045xception");
        org.junit.Assert.assertNotNull(charSequenceTranslatorArray29);
        org.junit.Assert.assertNotNull(charSequenceTranslator30);
        org.junit.Assert.assertNotNull(charSequenceTranslator31);
        org.junit.Assert.assertNotNull(charSequenceTranslator32);
    }

    @Test
    public void test00143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00143");
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper2 = org.apache.commons.lang3.text.translate.UnicodeEscaper.outsideOf((int) (short) -1, (int) (byte) -1);
        java.lang.CharSequence charSequence3 = null;
        java.io.Writer writer5 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int6 = unicodeEscaper2.translate(charSequence3, (int) (byte) -1, writer5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(unicodeEscaper2);
    }

    @Test
    public void test00144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00144");
        java.lang.String str1 = org.apache.commons.lang3.text.translate.CharSequenceTranslator.hex(10);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "A" + "'", str1, "A");
    }

    @Test
    public void test00145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00145");
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper2 = org.apache.commons.lang3.text.translate.UnicodeEscaper.outsideOf(0, (int) 'a');
        java.io.Writer writer4 = null;
        boolean boolean5 = unicodeEscaper2.translate((int) (short) 10, writer4);
        java.lang.String str7 = unicodeEscaper2.translate((java.lang.CharSequence) "0");
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper10 = org.apache.commons.lang3.text.translate.UnicodeEscaper.between((int) (byte) 1, (int) '#');
        java.io.Writer writer12 = null;
        boolean boolean13 = unicodeEscaper10.translate((int) '4', writer12);
        java.io.Writer writer15 = null;
        boolean boolean16 = unicodeEscaper10.translate((int) (byte) -1, writer15);
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper19 = org.apache.commons.lang3.text.translate.UnicodeEscaper.between((int) (byte) 1, (int) '#');
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper21 = org.apache.commons.lang3.text.translate.UnicodeEscaper.below(100);
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper23 = org.apache.commons.lang3.text.translate.UnicodeEscaper.below((int) 'a');
        java.lang.String str25 = unicodeEscaper23.translate((java.lang.CharSequence) "java.io.IOException: java.io.IOException");
        org.apache.commons.lang3.text.translate.CharSequenceTranslator[] charSequenceTranslatorArray26 = new org.apache.commons.lang3.text.translate.CharSequenceTranslator[] { unicodeEscaper19, unicodeEscaper21, unicodeEscaper23 };
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator27 = unicodeEscaper10.with(charSequenceTranslatorArray26);
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator28 = unicodeEscaper2.with(charSequenceTranslatorArray26);
        java.lang.Class<?> wildcardClass29 = unicodeEscaper2.getClass();
        org.junit.Assert.assertNotNull(unicodeEscaper2);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "0" + "'", str7, "0");
        org.junit.Assert.assertNotNull(unicodeEscaper10);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(unicodeEscaper19);
        org.junit.Assert.assertNotNull(unicodeEscaper21);
        org.junit.Assert.assertNotNull(unicodeEscaper23);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "java\\u002Eio\\u002E\\u0049\\u004F\\u0045xception\\u003A\\u0020java\\u002Eio\\u002E\\u0049\\u004F\\u0045xception" + "'", str25, "java\\u002Eio\\u002E\\u0049\\u004F\\u0045xception\\u003A\\u0020java\\u002Eio\\u002E\\u0049\\u004F\\u0045xception");
        org.junit.Assert.assertNotNull(charSequenceTranslatorArray26);
        org.junit.Assert.assertNotNull(charSequenceTranslator27);
        org.junit.Assert.assertNotNull(charSequenceTranslator28);
        org.junit.Assert.assertNotNull(wildcardClass29);
    }

    @Test
    public void test00146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00146");
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper1 = org.apache.commons.lang3.text.translate.UnicodeEscaper.above(1);
        java.io.Writer writer3 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean4 = unicodeEscaper1.translate((-1), writer3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(unicodeEscaper1);
    }

    @Test
    public void test00147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00147");
        java.io.IOException iOException3 = new java.io.IOException("0");
        java.lang.Throwable[] throwableArray4 = iOException3.getSuppressed();
        java.io.IOException iOException5 = new java.io.IOException("hi!", (java.lang.Throwable) iOException3);
        java.io.IOException iOException7 = new java.io.IOException("");
        java.io.IOException iOException8 = new java.io.IOException((java.lang.Throwable) iOException7);
        java.io.IOException iOException10 = new java.io.IOException("");
        iOException8.addSuppressed((java.lang.Throwable) iOException10);
        java.io.IOException iOException13 = new java.io.IOException("");
        java.io.IOException iOException14 = new java.io.IOException((java.lang.Throwable) iOException13);
        java.io.IOException iOException16 = new java.io.IOException("");
        iOException14.addSuppressed((java.lang.Throwable) iOException16);
        iOException8.addSuppressed((java.lang.Throwable) iOException14);
        iOException5.addSuppressed((java.lang.Throwable) iOException8);
        java.io.IOException iOException20 = new java.io.IOException("0", (java.lang.Throwable) iOException5);
        java.lang.String str21 = iOException5.toString();
        org.junit.Assert.assertNotNull(throwableArray4);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "java.io.IOException: hi!" + "'", str21, "java.io.IOException: hi!");
    }

    @Test
    public void test00148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00148");
        java.io.IOException iOException2 = new java.io.IOException("");
        java.io.IOException iOException3 = new java.io.IOException("A", (java.lang.Throwable) iOException2);
        java.lang.Throwable[] throwableArray4 = iOException2.getSuppressed();
        java.lang.String str5 = iOException2.toString();
        org.junit.Assert.assertNotNull(throwableArray4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "java.io.IOException: " + "'", str5, "java.io.IOException: ");
    }

    @Test
    public void test00149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00149");
        java.io.IOException iOException1 = new java.io.IOException();
        java.io.IOException iOException2 = new java.io.IOException();
        iOException1.addSuppressed((java.lang.Throwable) iOException2);
        java.io.IOException iOException4 = new java.io.IOException("0", (java.lang.Throwable) iOException1);
        java.io.IOException iOException5 = new java.io.IOException((java.lang.Throwable) iOException4);
        java.io.IOException iOException6 = new java.io.IOException((java.lang.Throwable) iOException5);
        java.lang.Class<?> wildcardClass7 = iOException6.getClass();
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test00150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00150");
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper2 = org.apache.commons.lang3.text.translate.UnicodeEscaper.between(10, (int) '4');
        java.io.Writer writer5 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int6 = unicodeEscaper2.translate((java.lang.CharSequence) "1", (int) (byte) 100, writer5);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 100");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(unicodeEscaper2);
    }

    @Test
    public void test00151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00151");
        java.lang.String str1 = org.apache.commons.lang3.text.translate.CharSequenceTranslator.hex(100);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "64" + "'", str1, "64");
    }

    @Test
    public void test00152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00152");
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper0 = new org.apache.commons.lang3.text.translate.UnicodeEscaper();
        java.lang.String str2 = unicodeEscaper0.translate((java.lang.CharSequence) "hi!");
        java.io.Writer writer4 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean5 = unicodeEscaper0.translate(1, writer4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\\u0068\\u0069\\u0021" + "'", str2, "\\u0068\\u0069\\u0021");
    }

    @Test
    public void test00153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00153");
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper2 = org.apache.commons.lang3.text.translate.UnicodeEscaper.between((int) (byte) 1, (int) '#');
        java.io.Writer writer4 = null;
        boolean boolean5 = unicodeEscaper2.translate((int) '4', writer4);
        java.io.Writer writer7 = null;
        boolean boolean8 = unicodeEscaper2.translate((int) (byte) -1, writer7);
        java.io.Writer writer11 = null;
        int int12 = unicodeEscaper2.translate((java.lang.CharSequence) "java\\u002Eio\\u002E\\u0049\\u004F\\u0045xception\\u003A\\u0020java\\u002Eio\\u002E\\u0049\\u004F\\u0045xception", 1, writer11);
        java.io.Writer writer14 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean15 = unicodeEscaper2.translate((int) (byte) 1, writer14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(unicodeEscaper2);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
    }

    @Test
    public void test00154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00154");
        java.io.IOException iOException2 = new java.io.IOException();
        java.io.IOException iOException3 = new java.io.IOException();
        iOException2.addSuppressed((java.lang.Throwable) iOException3);
        java.io.IOException iOException5 = new java.io.IOException();
        java.io.IOException iOException6 = new java.io.IOException();
        iOException5.addSuppressed((java.lang.Throwable) iOException6);
        java.lang.Throwable[] throwableArray8 = iOException6.getSuppressed();
        java.io.IOException iOException9 = new java.io.IOException((java.lang.Throwable) iOException6);
        java.io.IOException iOException11 = new java.io.IOException("");
        java.io.IOException iOException12 = new java.io.IOException((java.lang.Throwable) iOException11);
        iOException6.addSuppressed((java.lang.Throwable) iOException12);
        iOException3.addSuppressed((java.lang.Throwable) iOException12);
        java.io.IOException iOException15 = new java.io.IOException("java.io.IOException", (java.lang.Throwable) iOException12);
        java.io.IOException iOException16 = new java.io.IOException("64", (java.lang.Throwable) iOException15);
        java.lang.String str17 = iOException16.toString();
        org.junit.Assert.assertNotNull(throwableArray8);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "java.io.IOException: 64" + "'", str17, "java.io.IOException: 64");
    }

    @Test
    public void test00155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00155");
        java.io.IOException iOException0 = new java.io.IOException();
        java.io.IOException iOException1 = new java.io.IOException();
        iOException0.addSuppressed((java.lang.Throwable) iOException1);
        java.io.IOException iOException3 = new java.io.IOException((java.lang.Throwable) iOException0);
        java.io.IOException iOException4 = new java.io.IOException((java.lang.Throwable) iOException3);
        java.lang.String str5 = iOException4.toString();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "java.io.IOException: java.io.IOException: java.io.IOException" + "'", str5, "java.io.IOException: java.io.IOException: java.io.IOException");
    }

    @Test
    public void test00156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00156");
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper2 = org.apache.commons.lang3.text.translate.UnicodeEscaper.outsideOf((int) (short) 100, 0);
        java.io.Writer writer5 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int6 = unicodeEscaper2.translate((java.lang.CharSequence) "", (int) (short) 100, writer5);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 100");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(unicodeEscaper2);
    }

    @Test
    public void test00157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00157");
        java.io.IOException iOException4 = new java.io.IOException("0");
        java.lang.Throwable[] throwableArray5 = iOException4.getSuppressed();
        java.io.IOException iOException6 = new java.io.IOException("hi!", (java.lang.Throwable) iOException4);
        java.io.IOException iOException8 = new java.io.IOException("");
        java.io.IOException iOException9 = new java.io.IOException((java.lang.Throwable) iOException8);
        java.io.IOException iOException11 = new java.io.IOException("");
        iOException9.addSuppressed((java.lang.Throwable) iOException11);
        java.io.IOException iOException14 = new java.io.IOException("");
        java.io.IOException iOException15 = new java.io.IOException((java.lang.Throwable) iOException14);
        java.io.IOException iOException17 = new java.io.IOException("");
        iOException15.addSuppressed((java.lang.Throwable) iOException17);
        iOException9.addSuppressed((java.lang.Throwable) iOException15);
        iOException6.addSuppressed((java.lang.Throwable) iOException9);
        java.io.IOException iOException21 = new java.io.IOException("java\\u002Eio\\u002E\\u0049\\u004F\\u0045xception\\u003A\\u0020java\\u002Eio\\u002E\\u0049\\u004F\\u0045xception", (java.lang.Throwable) iOException9);
        java.io.IOException iOException22 = new java.io.IOException("\\u0068\\u0069\\u0021", (java.lang.Throwable) iOException9);
        java.lang.String str23 = iOException22.toString();
        org.junit.Assert.assertNotNull(throwableArray5);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "java.io.IOException: \\u0068\\u0069\\u0021" + "'", str23, "java.io.IOException: \\u0068\\u0069\\u0021");
    }

    @Test
    public void test00158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00158");
        java.io.IOException iOException3 = new java.io.IOException("0");
        java.lang.Throwable[] throwableArray4 = iOException3.getSuppressed();
        java.io.IOException iOException5 = new java.io.IOException("hi!", (java.lang.Throwable) iOException3);
        java.io.IOException iOException6 = new java.io.IOException("java.io.IOException", (java.lang.Throwable) iOException3);
        java.lang.Throwable[] throwableArray7 = iOException3.getSuppressed();
        java.lang.Class<?> wildcardClass8 = throwableArray7.getClass();
        org.junit.Assert.assertNotNull(throwableArray4);
        org.junit.Assert.assertNotNull(throwableArray7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test00159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00159");
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper2 = org.apache.commons.lang3.text.translate.UnicodeEscaper.outsideOf((int) (short) 10, (int) (byte) -1);
        java.io.Writer writer4 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean5 = unicodeEscaper2.translate((int) '#', writer4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(unicodeEscaper2);
    }

    @Test
    public void test00160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00160");
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper1 = org.apache.commons.lang3.text.translate.UnicodeEscaper.below((int) 'a');
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper4 = org.apache.commons.lang3.text.translate.UnicodeEscaper.between((int) (byte) 1, (int) '#');
        java.io.Writer writer6 = null;
        boolean boolean7 = unicodeEscaper4.translate((int) '4', writer6);
        java.io.Writer writer9 = null;
        boolean boolean10 = unicodeEscaper4.translate((int) (byte) -1, writer9);
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper13 = org.apache.commons.lang3.text.translate.UnicodeEscaper.between((int) (byte) 1, (int) '#');
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper15 = org.apache.commons.lang3.text.translate.UnicodeEscaper.below(100);
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper17 = org.apache.commons.lang3.text.translate.UnicodeEscaper.below((int) 'a');
        java.lang.String str19 = unicodeEscaper17.translate((java.lang.CharSequence) "java.io.IOException: java.io.IOException");
        org.apache.commons.lang3.text.translate.CharSequenceTranslator[] charSequenceTranslatorArray20 = new org.apache.commons.lang3.text.translate.CharSequenceTranslator[] { unicodeEscaper13, unicodeEscaper15, unicodeEscaper17 };
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator21 = unicodeEscaper4.with(charSequenceTranslatorArray20);
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper24 = org.apache.commons.lang3.text.translate.UnicodeEscaper.outsideOf(0, (int) 'a');
        java.io.Writer writer26 = null;
        boolean boolean27 = unicodeEscaper24.translate((int) (short) 10, writer26);
        java.lang.String str29 = unicodeEscaper24.translate((java.lang.CharSequence) "0");
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper32 = org.apache.commons.lang3.text.translate.UnicodeEscaper.between((int) (byte) 1, (int) '#');
        java.io.Writer writer34 = null;
        boolean boolean35 = unicodeEscaper32.translate((int) '4', writer34);
        java.io.Writer writer37 = null;
        boolean boolean38 = unicodeEscaper32.translate((int) (byte) -1, writer37);
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper41 = org.apache.commons.lang3.text.translate.UnicodeEscaper.between((int) (byte) 1, (int) '#');
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper43 = org.apache.commons.lang3.text.translate.UnicodeEscaper.below(100);
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper45 = org.apache.commons.lang3.text.translate.UnicodeEscaper.below((int) 'a');
        java.lang.String str47 = unicodeEscaper45.translate((java.lang.CharSequence) "java.io.IOException: java.io.IOException");
        org.apache.commons.lang3.text.translate.CharSequenceTranslator[] charSequenceTranslatorArray48 = new org.apache.commons.lang3.text.translate.CharSequenceTranslator[] { unicodeEscaper41, unicodeEscaper43, unicodeEscaper45 };
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator49 = unicodeEscaper32.with(charSequenceTranslatorArray48);
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator50 = unicodeEscaper24.with(charSequenceTranslatorArray48);
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator51 = unicodeEscaper4.with(charSequenceTranslatorArray48);
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator52 = unicodeEscaper1.with(charSequenceTranslatorArray48);
        java.lang.String str54 = unicodeEscaper1.translate((java.lang.CharSequence) "java.io.IOException: java.io.IOException");
        java.io.Writer writer56 = null;
        // The following exception was thrown during execution in test generation
        try {
            unicodeEscaper1.translate((java.lang.CharSequence) "64", writer56);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Writer must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(unicodeEscaper1);
        org.junit.Assert.assertNotNull(unicodeEscaper4);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(unicodeEscaper13);
        org.junit.Assert.assertNotNull(unicodeEscaper15);
        org.junit.Assert.assertNotNull(unicodeEscaper17);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "java\\u002Eio\\u002E\\u0049\\u004F\\u0045xception\\u003A\\u0020java\\u002Eio\\u002E\\u0049\\u004F\\u0045xception" + "'", str19, "java\\u002Eio\\u002E\\u0049\\u004F\\u0045xception\\u003A\\u0020java\\u002Eio\\u002E\\u0049\\u004F\\u0045xception");
        org.junit.Assert.assertNotNull(charSequenceTranslatorArray20);
        org.junit.Assert.assertNotNull(charSequenceTranslator21);
        org.junit.Assert.assertNotNull(unicodeEscaper24);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "0" + "'", str29, "0");
        org.junit.Assert.assertNotNull(unicodeEscaper32);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertNotNull(unicodeEscaper41);
        org.junit.Assert.assertNotNull(unicodeEscaper43);
        org.junit.Assert.assertNotNull(unicodeEscaper45);
        org.junit.Assert.assertEquals("'" + str47 + "' != '" + "java\\u002Eio\\u002E\\u0049\\u004F\\u0045xception\\u003A\\u0020java\\u002Eio\\u002E\\u0049\\u004F\\u0045xception" + "'", str47, "java\\u002Eio\\u002E\\u0049\\u004F\\u0045xception\\u003A\\u0020java\\u002Eio\\u002E\\u0049\\u004F\\u0045xception");
        org.junit.Assert.assertNotNull(charSequenceTranslatorArray48);
        org.junit.Assert.assertNotNull(charSequenceTranslator49);
        org.junit.Assert.assertNotNull(charSequenceTranslator50);
        org.junit.Assert.assertNotNull(charSequenceTranslator51);
        org.junit.Assert.assertNotNull(charSequenceTranslator52);
        org.junit.Assert.assertEquals("'" + str54 + "' != '" + "java\\u002Eio\\u002E\\u0049\\u004F\\u0045xception\\u003A\\u0020java\\u002Eio\\u002E\\u0049\\u004F\\u0045xception" + "'", str54, "java\\u002Eio\\u002E\\u0049\\u004F\\u0045xception\\u003A\\u0020java\\u002Eio\\u002E\\u0049\\u004F\\u0045xception");
    }

    @Test
    public void test00161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00161");
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper2 = org.apache.commons.lang3.text.translate.UnicodeEscaper.outsideOf((int) '4', (int) (byte) 100);
        java.io.Writer writer4 = null;
        boolean boolean5 = unicodeEscaper2.translate((int) 'a', writer4);
        java.io.Writer writer7 = null;
        // The following exception was thrown during execution in test generation
        try {
            unicodeEscaper2.translate((java.lang.CharSequence) "java.io.IOException: 64", writer7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Writer must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(unicodeEscaper2);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test00162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00162");
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper2 = org.apache.commons.lang3.text.translate.UnicodeEscaper.between(100, (int) (short) 10);
        java.io.Writer writer4 = null;
        boolean boolean5 = unicodeEscaper2.translate(10, writer4);
        java.lang.CharSequence charSequence6 = null;
        java.io.Writer writer7 = null;
        // The following exception was thrown during execution in test generation
        try {
            unicodeEscaper2.translate(charSequence6, writer7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Writer must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(unicodeEscaper2);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test00163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00163");
        java.io.IOException iOException1 = new java.io.IOException("");
        java.io.IOException iOException2 = new java.io.IOException((java.lang.Throwable) iOException1);
        java.io.IOException iOException3 = new java.io.IOException((java.lang.Throwable) iOException1);
        java.io.IOException iOException5 = new java.io.IOException();
        java.io.IOException iOException6 = new java.io.IOException();
        iOException5.addSuppressed((java.lang.Throwable) iOException6);
        java.io.IOException iOException8 = new java.io.IOException("0", (java.lang.Throwable) iOException5);
        java.io.IOException iOException9 = new java.io.IOException((java.lang.Throwable) iOException8);
        java.io.IOException iOException10 = new java.io.IOException((java.lang.Throwable) iOException8);
        iOException1.addSuppressed((java.lang.Throwable) iOException8);
        java.lang.String str12 = iOException8.toString();
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "java.io.IOException: 0" + "'", str12, "java.io.IOException: 0");
    }

    @Test
    public void test00164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00164");
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper2 = org.apache.commons.lang3.text.translate.UnicodeEscaper.between((int) (byte) 1, (int) '#');
        java.io.Writer writer4 = null;
        boolean boolean5 = unicodeEscaper2.translate((int) '4', writer4);
        java.io.Writer writer7 = null;
        boolean boolean8 = unicodeEscaper2.translate((int) (byte) -1, writer7);
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper11 = org.apache.commons.lang3.text.translate.UnicodeEscaper.between((int) (byte) 1, (int) '#');
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper13 = org.apache.commons.lang3.text.translate.UnicodeEscaper.below(100);
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper15 = org.apache.commons.lang3.text.translate.UnicodeEscaper.below((int) 'a');
        java.lang.String str17 = unicodeEscaper15.translate((java.lang.CharSequence) "java.io.IOException: java.io.IOException");
        org.apache.commons.lang3.text.translate.CharSequenceTranslator[] charSequenceTranslatorArray18 = new org.apache.commons.lang3.text.translate.CharSequenceTranslator[] { unicodeEscaper11, unicodeEscaper13, unicodeEscaper15 };
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator19 = unicodeEscaper2.with(charSequenceTranslatorArray18);
        java.io.Writer writer22 = null;
        int int23 = unicodeEscaper2.translate((java.lang.CharSequence) "java.io.IOException: ", (int) (byte) 10, writer22);
        java.io.Writer writer25 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean26 = unicodeEscaper2.translate(1, writer25);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(unicodeEscaper2);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(unicodeEscaper11);
        org.junit.Assert.assertNotNull(unicodeEscaper13);
        org.junit.Assert.assertNotNull(unicodeEscaper15);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "java\\u002Eio\\u002E\\u0049\\u004F\\u0045xception\\u003A\\u0020java\\u002Eio\\u002E\\u0049\\u004F\\u0045xception" + "'", str17, "java\\u002Eio\\u002E\\u0049\\u004F\\u0045xception\\u003A\\u0020java\\u002Eio\\u002E\\u0049\\u004F\\u0045xception");
        org.junit.Assert.assertNotNull(charSequenceTranslatorArray18);
        org.junit.Assert.assertNotNull(charSequenceTranslator19);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
    }

    @Test
    public void test00165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00165");
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper2 = org.apache.commons.lang3.text.translate.UnicodeEscaper.outsideOf((int) (short) -1, (int) (byte) -1);
        java.lang.Class<?> wildcardClass3 = unicodeEscaper2.getClass();
        org.junit.Assert.assertNotNull(unicodeEscaper2);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test00166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00166");
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper2 = org.apache.commons.lang3.text.translate.UnicodeEscaper.outsideOf((int) (short) 1, (int) 'a');
        java.io.Writer writer5 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int6 = unicodeEscaper2.translate((java.lang.CharSequence) "java.io.IOException: java.io.IOException: ", (int) '#', writer5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(unicodeEscaper2);
    }

    @Test
    public void test00167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00167");
        java.io.IOException iOException1 = new java.io.IOException();
        java.io.IOException iOException2 = new java.io.IOException();
        iOException1.addSuppressed((java.lang.Throwable) iOException2);
        java.io.IOException iOException4 = new java.io.IOException("0", (java.lang.Throwable) iOException1);
        java.io.IOException iOException5 = new java.io.IOException((java.lang.Throwable) iOException4);
        java.io.IOException iOException6 = new java.io.IOException((java.lang.Throwable) iOException5);
        java.io.IOException iOException7 = new java.io.IOException((java.lang.Throwable) iOException6);
        java.lang.Throwable[] throwableArray8 = iOException7.getSuppressed();
        java.lang.Class<?> wildcardClass9 = throwableArray8.getClass();
        org.junit.Assert.assertNotNull(throwableArray8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test00168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00168");
        java.io.IOException iOException1 = new java.io.IOException();
        java.io.IOException iOException2 = new java.io.IOException();
        iOException1.addSuppressed((java.lang.Throwable) iOException2);
        java.io.IOException iOException4 = new java.io.IOException();
        java.io.IOException iOException5 = new java.io.IOException();
        iOException4.addSuppressed((java.lang.Throwable) iOException5);
        java.lang.Throwable[] throwableArray7 = iOException5.getSuppressed();
        java.io.IOException iOException8 = new java.io.IOException((java.lang.Throwable) iOException5);
        java.io.IOException iOException10 = new java.io.IOException("");
        java.io.IOException iOException11 = new java.io.IOException((java.lang.Throwable) iOException10);
        iOException5.addSuppressed((java.lang.Throwable) iOException11);
        iOException2.addSuppressed((java.lang.Throwable) iOException11);
        java.io.IOException iOException14 = new java.io.IOException("java.io.IOException", (java.lang.Throwable) iOException11);
        java.lang.String str15 = iOException11.toString();
        org.junit.Assert.assertNotNull(throwableArray7);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "java.io.IOException: java.io.IOException: " + "'", str15, "java.io.IOException: java.io.IOException: ");
    }

    @Test
    public void test00169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00169");
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper2 = org.apache.commons.lang3.text.translate.UnicodeEscaper.outsideOf(0, (int) 'a');
        java.io.Writer writer4 = null;
        boolean boolean5 = unicodeEscaper2.translate((int) '4', writer4);
        java.io.Writer writer8 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int9 = unicodeEscaper2.translate((java.lang.CharSequence) "23", (int) (short) 100, writer8);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 100");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(unicodeEscaper2);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test00170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00170");
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper2 = org.apache.commons.lang3.text.translate.UnicodeEscaper.outsideOf(0, 10);
        java.lang.String str4 = unicodeEscaper2.translate((java.lang.CharSequence) "hi!");
        java.lang.Class<?> wildcardClass5 = unicodeEscaper2.getClass();
        org.junit.Assert.assertNotNull(unicodeEscaper2);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "\\u0068\\u0069\\u0021" + "'", str4, "\\u0068\\u0069\\u0021");
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test00171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00171");
        java.io.IOException iOException1 = new java.io.IOException("\\u006A\\u0061\\u0076\\u0061\\u002E\\u0069\\u006F\\u002E\\u0049\\u004F\\u0045\\u0078\\u0063\\u0065\\u0070\\u0074\\u0069\\u006F\\u006E\\u003A\\u0020\\u006A\\u0061\\u0076\\u0061\\u002E\\u0069\\u006F\\u002E\\u0049\\u004F\\u0045\\u0078\\u0063\\u0065\\u0070\\u0074\\u0069\\u006F\\u006E");
        java.lang.String str2 = iOException1.toString();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "java.io.IOException: \\u006A\\u0061\\u0076\\u0061\\u002E\\u0069\\u006F\\u002E\\u0049\\u004F\\u0045\\u0078\\u0063\\u0065\\u0070\\u0074\\u0069\\u006F\\u006E\\u003A\\u0020\\u006A\\u0061\\u0076\\u0061\\u002E\\u0069\\u006F\\u002E\\u0049\\u004F\\u0045\\u0078\\u0063\\u0065\\u0070\\u0074\\u0069\\u006F\\u006E" + "'", str2, "java.io.IOException: \\u006A\\u0061\\u0076\\u0061\\u002E\\u0069\\u006F\\u002E\\u0049\\u004F\\u0045\\u0078\\u0063\\u0065\\u0070\\u0074\\u0069\\u006F\\u006E\\u003A\\u0020\\u006A\\u0061\\u0076\\u0061\\u002E\\u0069\\u006F\\u002E\\u0049\\u004F\\u0045\\u0078\\u0063\\u0065\\u0070\\u0074\\u0069\\u006F\\u006E");
    }

    @Test
    public void test00172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00172");
        java.io.IOException iOException3 = new java.io.IOException("");
        java.io.IOException iOException4 = new java.io.IOException((java.lang.Throwable) iOException3);
        java.io.IOException iOException5 = new java.io.IOException((java.lang.Throwable) iOException4);
        java.io.IOException iOException6 = new java.io.IOException("23", (java.lang.Throwable) iOException4);
        java.io.IOException iOException9 = new java.io.IOException("0");
        java.io.IOException iOException10 = new java.io.IOException();
        java.io.IOException iOException11 = new java.io.IOException();
        iOException10.addSuppressed((java.lang.Throwable) iOException11);
        java.io.IOException iOException13 = new java.io.IOException();
        java.io.IOException iOException14 = new java.io.IOException();
        iOException13.addSuppressed((java.lang.Throwable) iOException14);
        java.lang.Throwable[] throwableArray16 = iOException14.getSuppressed();
        java.io.IOException iOException17 = new java.io.IOException((java.lang.Throwable) iOException14);
        java.io.IOException iOException19 = new java.io.IOException("");
        java.io.IOException iOException20 = new java.io.IOException((java.lang.Throwable) iOException19);
        iOException14.addSuppressed((java.lang.Throwable) iOException20);
        iOException11.addSuppressed((java.lang.Throwable) iOException20);
        iOException9.addSuppressed((java.lang.Throwable) iOException20);
        java.io.IOException iOException24 = new java.io.IOException("61", (java.lang.Throwable) iOException20);
        iOException4.addSuppressed((java.lang.Throwable) iOException20);
        java.io.IOException iOException26 = new java.io.IOException("java.io.IOException: 0", (java.lang.Throwable) iOException4);
        java.lang.String str27 = iOException4.toString();
        org.junit.Assert.assertNotNull(throwableArray16);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "java.io.IOException: java.io.IOException: " + "'", str27, "java.io.IOException: java.io.IOException: ");
    }

    @Test
    public void test00173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00173");
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper1 = org.apache.commons.lang3.text.translate.UnicodeEscaper.below((int) (byte) 0);
        java.io.Writer writer3 = null;
        boolean boolean4 = unicodeEscaper1.translate((int) ' ', writer3);
        java.io.Writer writer6 = null;
        boolean boolean7 = unicodeEscaper1.translate((int) (byte) 0, writer6);
        java.io.Writer writer10 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int11 = unicodeEscaper1.translate((java.lang.CharSequence) "java.io.IOException: \\u0068\\u0069\\u0021", (int) '4', writer10);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 52");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(unicodeEscaper1);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test00174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00174");
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper1 = org.apache.commons.lang3.text.translate.UnicodeEscaper.above((int) (byte) 0);
        java.io.Writer writer3 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean4 = unicodeEscaper1.translate(10, writer3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(unicodeEscaper1);
    }

    @Test
    public void test00175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00175");
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper1 = org.apache.commons.lang3.text.translate.UnicodeEscaper.below((int) (byte) 1);
        java.lang.String str3 = unicodeEscaper1.translate((java.lang.CharSequence) "java.io.IOException: java.io.IOException: java.io.IOException: java.io.IOException: 0");
        java.io.Writer writer6 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int7 = unicodeEscaper1.translate((java.lang.CharSequence) "\\u0068\\u0069\\u0021", (-1), writer6);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: -1");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(unicodeEscaper1);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "java.io.IOException: java.io.IOException: java.io.IOException: java.io.IOException: 0" + "'", str3, "java.io.IOException: java.io.IOException: java.io.IOException: java.io.IOException: 0");
    }

    @Test
    public void test00176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00176");
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper2 = org.apache.commons.lang3.text.translate.UnicodeEscaper.outsideOf(0, (int) 'a');
        java.io.Writer writer4 = null;
        boolean boolean5 = unicodeEscaper2.translate((int) (short) 10, writer4);
        java.io.Writer writer8 = null;
        int int9 = unicodeEscaper2.translate((java.lang.CharSequence) "0", (int) (byte) 0, writer8);
        java.io.Writer writer12 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int13 = unicodeEscaper2.translate((java.lang.CharSequence) "\\u006Aa\\u0076a.\\u0069\\u006F.IOE\\u0078c\\u0065\\u0070\\u0074\\u0069\\u006F\\u006E:\\u0020\\u006Aa\\u0076a.\\u0069\\u006F.IOE\\u0078c\\u0065\\u0070\\u0074\\u0069\\u006F\\u006E", (-1), writer12);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: -1");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(unicodeEscaper2);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test00177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00177");
        java.io.IOException iOException3 = new java.io.IOException("");
        java.io.IOException iOException4 = new java.io.IOException((java.lang.Throwable) iOException3);
        java.io.IOException iOException6 = new java.io.IOException("");
        iOException4.addSuppressed((java.lang.Throwable) iOException6);
        java.io.IOException iOException8 = new java.io.IOException("java.io.IOException", (java.lang.Throwable) iOException6);
        java.io.IOException iOException10 = new java.io.IOException("");
        java.io.IOException iOException11 = new java.io.IOException((java.lang.Throwable) iOException10);
        java.io.IOException iOException12 = new java.io.IOException((java.lang.Throwable) iOException10);
        iOException8.addSuppressed((java.lang.Throwable) iOException10);
        java.io.IOException iOException14 = new java.io.IOException("\\u005C\\u0075\\u0030\\u0030\\u0035\\u0043\\u005C\\u0075\\u0030\\u0030\\u0037\\u0035\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0033\\u005C\\u0075\\u0030\\u0030\\u0033\\u0036\\u005C\\u0075\\u0030\\u0030\\u0035\\u0043\\u005C\\u0075\\u0030\\u0030\\u0037\\u0035\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0033\\u005C\\u0075\\u0030\\u0030\\u0033\\u0034", (java.lang.Throwable) iOException8);
        java.lang.Throwable[] throwableArray15 = iOException8.getSuppressed();
        org.junit.Assert.assertNotNull(throwableArray15);
    }

    @Test
    public void test00178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00178");
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper1 = org.apache.commons.lang3.text.translate.UnicodeEscaper.below((int) (byte) 0);
        java.io.Writer writer4 = null;
        int int5 = unicodeEscaper1.translate((java.lang.CharSequence) "\\u006A\\u0061\\u0076\\u0061\\u002E\\u0069\\u006F\\u002E\\u0049\\u004F\\u0045\\u0078\\u0063\\u0065\\u0070\\u0074\\u0069\\u006F\\u006E\\u003A\\u0020\\u006A\\u0061\\u0076\\u0061\\u002E\\u0069\\u006F\\u002E\\u0049\\u004F\\u0045\\u0078\\u0063\\u0065\\u0070\\u0074\\u0069\\u006F\\u006E", (int) (short) 1, writer4);
        java.io.Writer writer7 = null;
        // The following exception was thrown during execution in test generation
        try {
            unicodeEscaper1.translate((java.lang.CharSequence) "\\u006A\\u0061\\u0076\\u0061\\u002E\\u0069\\u006F\\u002E\\u0049\\u004F\\u0045\\u0078\\u0063\\u0065\\u0070\\u0074\\u0069\\u006F\\u006E\\u003A\\u0020", writer7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Writer must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(unicodeEscaper1);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void test00179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00179");
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper1 = org.apache.commons.lang3.text.translate.UnicodeEscaper.below(100);
        java.lang.String str3 = unicodeEscaper1.translate((java.lang.CharSequence) "\\u0068\\u0069\\u0021");
        java.io.Writer writer5 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean6 = unicodeEscaper1.translate((int) (byte) -1, writer5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(unicodeEscaper1);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\\u005Cu\\u0030\\u0030\\u0036\\u0038\\u005Cu\\u0030\\u0030\\u0036\\u0039\\u005Cu\\u0030\\u0030\\u0032\\u0031" + "'", str3, "\\u005Cu\\u0030\\u0030\\u0036\\u0038\\u005Cu\\u0030\\u0030\\u0036\\u0039\\u005Cu\\u0030\\u0030\\u0032\\u0031");
    }

    @Test
    public void test00180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00180");
        java.io.IOException iOException0 = new java.io.IOException();
        java.io.IOException iOException1 = new java.io.IOException();
        iOException0.addSuppressed((java.lang.Throwable) iOException1);
        java.io.IOException iOException3 = new java.io.IOException();
        java.io.IOException iOException4 = new java.io.IOException();
        iOException3.addSuppressed((java.lang.Throwable) iOException4);
        java.lang.Throwable[] throwableArray6 = iOException4.getSuppressed();
        java.io.IOException iOException7 = new java.io.IOException((java.lang.Throwable) iOException4);
        java.io.IOException iOException9 = new java.io.IOException("");
        java.io.IOException iOException10 = new java.io.IOException((java.lang.Throwable) iOException9);
        iOException4.addSuppressed((java.lang.Throwable) iOException10);
        iOException1.addSuppressed((java.lang.Throwable) iOException10);
        java.lang.Throwable throwable13 = null;
        // The following exception was thrown during execution in test generation
        try {
            iOException10.addSuppressed(throwable13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot suppress a null exception.");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(throwableArray6);
    }

    @Test
    public void test00181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00181");
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper1 = org.apache.commons.lang3.text.translate.UnicodeEscaper.below((int) (short) 100);
        java.io.Writer writer4 = null;
        int int5 = unicodeEscaper1.translate((java.lang.CharSequence) "java.io.IOException: java.io.IOException", 0, writer4);
        java.io.Writer writer7 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean8 = unicodeEscaper1.translate((int) ' ', writer7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(unicodeEscaper1);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void test00182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00182");
        java.io.IOException iOException1 = new java.io.IOException("java.io.IOException: java.io.IOException");
        java.lang.Throwable[] throwableArray2 = iOException1.getSuppressed();
        java.lang.String str3 = iOException1.toString();
        org.junit.Assert.assertNotNull(throwableArray2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "java.io.IOException: java.io.IOException: java.io.IOException" + "'", str3, "java.io.IOException: java.io.IOException: java.io.IOException");
    }

    @Test
    public void test00183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00183");
        java.io.IOException iOException2 = new java.io.IOException("");
        java.io.IOException iOException3 = new java.io.IOException((java.lang.Throwable) iOException2);
        java.io.IOException iOException5 = new java.io.IOException("");
        iOException3.addSuppressed((java.lang.Throwable) iOException5);
        java.lang.Throwable[] throwableArray7 = iOException5.getSuppressed();
        java.io.IOException iOException8 = new java.io.IOException("\\u006A\\u0061\\u0076\\u0061\\u005C\\u0075\\u0030\\u0030\\u0032\\u0045\\u0069\\u006F\\u005C\\u0075\\u0030\\u0030\\u0032\\u0045\\u005C\\u0075\\u0030\\u0030\\u0034\\u0039\\u005C\\u0075\\u0030\\u0030\\u0034\\u0046\\u005C\\u0075\\u0030\\u0030\\u0034\\u0035\\u0078\\u0063\\u0065\\u0070\\u0074\\u0069\\u006F\\u006E\\u005C\\u0075\\u0030\\u0030\\u0033\\u0041\\u005C\\u0075\\u0030\\u0030\\u0032\\u0030\\u006A\\u0061\\u0076\\u0061\\u005C\\u0075\\u0030\\u0030\\u0032\\u0045\\u0069\\u006F\\u005C\\u0075\\u0030\\u0030\\u0032\\u0045\\u005C\\u0075\\u0030\\u0030\\u0034\\u0039\\u005C\\u0075\\u0030\\u0030\\u0034\\u0046\\u005C\\u0075\\u0030\\u0030\\u0034\\u0035\\u0078\\u0063\\u0065\\u0070\\u0074\\u0069\\u006F\\u006E", (java.lang.Throwable) iOException5);
        java.lang.Class<?> wildcardClass9 = iOException5.getClass();
        org.junit.Assert.assertNotNull(throwableArray7);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test00184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00184");
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper2 = org.apache.commons.lang3.text.translate.UnicodeEscaper.outsideOf((int) (short) 100, 1);
        java.io.Writer writer4 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean5 = unicodeEscaper2.translate((int) (short) 0, writer4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(unicodeEscaper2);
    }

    @Test
    public void test00185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00185");
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper1 = org.apache.commons.lang3.text.translate.UnicodeEscaper.below(100);
        java.lang.String str3 = unicodeEscaper1.translate((java.lang.CharSequence) "\\u0068\\u0069\\u0021");
        java.io.Writer writer5 = null;
        // The following exception was thrown during execution in test generation
        try {
            unicodeEscaper1.translate((java.lang.CharSequence) "\\u005C\\u0075\\u0030\\u0030\\u0033\\u0036\\u005C\\u0075\\u0030\\u0030\\u0033\\u0034", writer5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Writer must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(unicodeEscaper1);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\\u005Cu\\u0030\\u0030\\u0036\\u0038\\u005Cu\\u0030\\u0030\\u0036\\u0039\\u005Cu\\u0030\\u0030\\u0032\\u0031" + "'", str3, "\\u005Cu\\u0030\\u0030\\u0036\\u0038\\u005Cu\\u0030\\u0030\\u0036\\u0039\\u005Cu\\u0030\\u0030\\u0032\\u0031");
    }

    @Test
    public void test00186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00186");
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper1 = org.apache.commons.lang3.text.translate.UnicodeEscaper.above((int) '#');
        java.io.Writer writer3 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean4 = unicodeEscaper1.translate((int) 'a', writer3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(unicodeEscaper1);
    }

    @Test
    public void test00187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00187");
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper1 = org.apache.commons.lang3.text.translate.UnicodeEscaper.above((int) ' ');
        java.io.Writer writer4 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int5 = unicodeEscaper1.translate((java.lang.CharSequence) "java.io.IOException: \\u0068\\u0069\\u0021", (int) '4', writer4);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 52");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(unicodeEscaper1);
    }

    @Test
    public void test00188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00188");
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper2 = org.apache.commons.lang3.text.translate.UnicodeEscaper.outsideOf((int) (byte) 100, (int) (byte) -1);
        java.io.Writer writer4 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean5 = unicodeEscaper2.translate((int) (byte) 10, writer4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(unicodeEscaper2);
    }

    @Test
    public void test00189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00189");
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper2 = org.apache.commons.lang3.text.translate.UnicodeEscaper.between((-1), (int) (short) 0);
        java.lang.String str4 = unicodeEscaper2.translate((java.lang.CharSequence) "0");
        org.apache.commons.lang3.text.translate.CharSequenceTranslator[] charSequenceTranslatorArray5 = new org.apache.commons.lang3.text.translate.CharSequenceTranslator[] {};
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator6 = unicodeEscaper2.with(charSequenceTranslatorArray5);
        java.io.Writer writer8 = null;
        // The following exception was thrown during execution in test generation
        try {
            unicodeEscaper2.translate((java.lang.CharSequence) "\\u006A\\u0061\\u0076\\u0061\\u002E\\u0069\\u006F\\u002E\\u0049\\u004F\\u0045\\u0078\\u0063\\u0065\\u0070\\u0074\\u0069\\u006F\\u006E\\u003A\\u0020\\u006A\\u0061\\u0076\\u0061\\u002E\\u0069\\u006F\\u002E\\u0049\\u004F\\u0045\\u0078\\u0063\\u0065\\u0070\\u0074\\u0069\\u006F\\u006E\\u003A\\u0020\\u006A\\u0061\\u0076\\u0061\\u002E\\u0069\\u006F\\u002E\\u0049\\u004F\\u0045\\u0078\\u0063\\u0065\\u0070\\u0074\\u0069\\u006F\\u006E\\u003A\\u0020\\u0030", writer8);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Writer must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(unicodeEscaper2);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "0" + "'", str4, "0");
        org.junit.Assert.assertNotNull(charSequenceTranslatorArray5);
        org.junit.Assert.assertNotNull(charSequenceTranslator6);
    }

    @Test
    public void test00190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00190");
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper2 = org.apache.commons.lang3.text.translate.UnicodeEscaper.outsideOf((int) (byte) 10, (int) (byte) -1);
        java.lang.String str4 = unicodeEscaper2.translate((java.lang.CharSequence) "\\u005C\\u0075\\u0030\\u0030\\u0033\\u0036\\u005C\\u0075\\u0030\\u0030\\u0033\\u0034");
        java.io.Writer writer6 = null;
        // The following exception was thrown during execution in test generation
        try {
            unicodeEscaper2.translate((java.lang.CharSequence) "64", writer6);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Writer must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(unicodeEscaper2);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "\\u005C\\u0075\\u0030\\u0030\\u0035\\u0043\\u005C\\u0075\\u0030\\u0030\\u0037\\u0035\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0033\\u005C\\u0075\\u0030\\u0030\\u0033\\u0036\\u005C\\u0075\\u0030\\u0030\\u0035\\u0043\\u005C\\u0075\\u0030\\u0030\\u0037\\u0035\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0033\\u005C\\u0075\\u0030\\u0030\\u0033\\u0034" + "'", str4, "\\u005C\\u0075\\u0030\\u0030\\u0035\\u0043\\u005C\\u0075\\u0030\\u0030\\u0037\\u0035\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0033\\u005C\\u0075\\u0030\\u0030\\u0033\\u0036\\u005C\\u0075\\u0030\\u0030\\u0035\\u0043\\u005C\\u0075\\u0030\\u0030\\u0037\\u0035\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0033\\u005C\\u0075\\u0030\\u0030\\u0033\\u0034");
    }

    @Test
    public void test00191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00191");
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper2 = org.apache.commons.lang3.text.translate.UnicodeEscaper.outsideOf(1, (int) ' ');
        java.io.Writer writer4 = null;
        // The following exception was thrown during execution in test generation
        try {
            unicodeEscaper2.translate((java.lang.CharSequence) "j\\u0061v\\u0061\\u002Eio\\u002E\\u0049\\u004F\\u0045x\\u0063eption\\u003A\\u0020", writer4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Writer must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(unicodeEscaper2);
    }

    @Test
    public void test00192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00192");
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper2 = org.apache.commons.lang3.text.translate.UnicodeEscaper.outsideOf(0, (int) 'a');
        java.io.Writer writer4 = null;
        boolean boolean5 = unicodeEscaper2.translate((int) (short) 10, writer4);
        java.io.Writer writer7 = null;
        boolean boolean8 = unicodeEscaper2.translate((int) '#', writer7);
        java.io.Writer writer11 = null;
        int int12 = unicodeEscaper2.translate((java.lang.CharSequence) "java.io.IOException: java.io.IOException", (int) (byte) 1, writer11);
        java.io.Writer writer14 = null;
        // The following exception was thrown during execution in test generation
        try {
            unicodeEscaper2.translate((java.lang.CharSequence) "java.io.IOException: java.io.IOException", writer14);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Writer must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(unicodeEscaper2);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
    }

    @Test
    public void test00193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00193");
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper1 = org.apache.commons.lang3.text.translate.UnicodeEscaper.below(100);
        java.io.Writer writer3 = null;
        // The following exception was thrown during execution in test generation
        try {
            unicodeEscaper1.translate((java.lang.CharSequence) "java.io.IOException: hi!", writer3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Writer must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(unicodeEscaper1);
    }

    @Test
    public void test00194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00194");
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper0 = new org.apache.commons.lang3.text.translate.UnicodeEscaper();
        java.lang.String str2 = unicodeEscaper0.translate((java.lang.CharSequence) "hi!");
        java.io.Writer writer4 = null;
        boolean boolean5 = unicodeEscaper0.translate((int) (byte) -1, writer4);
        java.lang.String str7 = unicodeEscaper0.translate((java.lang.CharSequence) "");
        java.lang.String str9 = unicodeEscaper0.translate((java.lang.CharSequence) "64");
        java.io.Writer writer11 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean12 = unicodeEscaper0.translate((int) (short) 0, writer11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\\u0068\\u0069\\u0021" + "'", str2, "\\u0068\\u0069\\u0021");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "\\u0036\\u0034" + "'", str9, "\\u0036\\u0034");
    }

    @Test
    public void test00195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00195");
        java.io.IOException iOException0 = new java.io.IOException();
        java.io.IOException iOException1 = new java.io.IOException();
        iOException0.addSuppressed((java.lang.Throwable) iOException1);
        java.io.IOException iOException3 = new java.io.IOException((java.lang.Throwable) iOException0);
        java.lang.Class<?> wildcardClass4 = iOException0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test00196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00196");
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper2 = org.apache.commons.lang3.text.translate.UnicodeEscaper.between((int) '4', (int) (short) 1);
        java.io.Writer writer5 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int6 = unicodeEscaper2.translate((java.lang.CharSequence) "\\u0036\\u0034", 100, writer5);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 100");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(unicodeEscaper2);
    }

    @Test
    public void test00197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00197");
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper2 = org.apache.commons.lang3.text.translate.UnicodeEscaper.outsideOf(0, (int) (byte) -1);
        java.io.Writer writer5 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int6 = unicodeEscaper2.translate((java.lang.CharSequence) "java.io.IOException: \\u006A\\u0061\\u0076\\u0061\\u002E\\u0069\\u006F\\u002E\\u0049\\u004F\\u0045\\u0078\\u0063\\u0065\\u0070\\u0074\\u0069\\u006F\\u006E\\u003A\\u0020\\u006A\\u0061\\u0076\\u0061\\u002E\\u0069\\u006F\\u002E\\u0049\\u004F\\u0045\\u0078\\u0063\\u0065\\u0070\\u0074\\u0069\\u006F\\u006E", (int) (short) 0, writer5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(unicodeEscaper2);
    }

    @Test
    public void test00198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00198");
        java.io.IOException iOException2 = new java.io.IOException("0");
        java.lang.Throwable[] throwableArray3 = iOException2.getSuppressed();
        java.io.IOException iOException4 = new java.io.IOException("hi!", (java.lang.Throwable) iOException2);
        java.lang.Throwable[] throwableArray5 = iOException2.getSuppressed();
        java.lang.Throwable[] throwableArray6 = iOException2.getSuppressed();
        java.lang.String str7 = iOException2.toString();
        org.junit.Assert.assertNotNull(throwableArray3);
        org.junit.Assert.assertNotNull(throwableArray5);
        org.junit.Assert.assertNotNull(throwableArray6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "java.io.IOException: 0" + "'", str7, "java.io.IOException: 0");
    }

    @Test
    public void test00199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00199");
        java.io.IOException iOException3 = new java.io.IOException("0");
        java.lang.Throwable[] throwableArray4 = iOException3.getSuppressed();
        java.io.IOException iOException5 = new java.io.IOException("hi!", (java.lang.Throwable) iOException3);
        java.io.IOException iOException6 = new java.io.IOException("java.io.IOException", (java.lang.Throwable) iOException3);
        java.lang.Throwable[] throwableArray7 = iOException3.getSuppressed();
        java.io.IOException iOException9 = new java.io.IOException();
        java.io.IOException iOException10 = new java.io.IOException();
        iOException9.addSuppressed((java.lang.Throwable) iOException10);
        java.lang.Throwable[] throwableArray12 = iOException10.getSuppressed();
        java.lang.Throwable[] throwableArray13 = iOException10.getSuppressed();
        java.io.IOException iOException14 = new java.io.IOException("java.io.IOException", (java.lang.Throwable) iOException10);
        java.io.IOException iOException15 = new java.io.IOException();
        java.io.IOException iOException16 = new java.io.IOException();
        iOException15.addSuppressed((java.lang.Throwable) iOException16);
        java.io.IOException iOException18 = new java.io.IOException((java.lang.Throwable) iOException15);
        java.lang.Throwable[] throwableArray19 = iOException18.getSuppressed();
        iOException14.addSuppressed((java.lang.Throwable) iOException18);
        java.io.IOException iOException22 = new java.io.IOException();
        java.io.IOException iOException23 = new java.io.IOException();
        iOException22.addSuppressed((java.lang.Throwable) iOException23);
        java.io.IOException iOException25 = new java.io.IOException();
        java.io.IOException iOException26 = new java.io.IOException();
        iOException25.addSuppressed((java.lang.Throwable) iOException26);
        java.lang.Throwable[] throwableArray28 = iOException26.getSuppressed();
        java.io.IOException iOException29 = new java.io.IOException((java.lang.Throwable) iOException26);
        java.io.IOException iOException31 = new java.io.IOException("");
        java.io.IOException iOException32 = new java.io.IOException((java.lang.Throwable) iOException31);
        iOException26.addSuppressed((java.lang.Throwable) iOException32);
        iOException23.addSuppressed((java.lang.Throwable) iOException32);
        java.io.IOException iOException35 = new java.io.IOException("java.io.IOException", (java.lang.Throwable) iOException32);
        iOException18.addSuppressed((java.lang.Throwable) iOException35);
        java.io.IOException iOException38 = new java.io.IOException("");
        java.io.IOException iOException39 = new java.io.IOException((java.lang.Throwable) iOException38);
        java.io.IOException iOException41 = new java.io.IOException("");
        iOException39.addSuppressed((java.lang.Throwable) iOException41);
        java.io.IOException iOException44 = new java.io.IOException("");
        java.io.IOException iOException45 = new java.io.IOException((java.lang.Throwable) iOException44);
        java.io.IOException iOException47 = new java.io.IOException("");
        iOException45.addSuppressed((java.lang.Throwable) iOException47);
        iOException39.addSuppressed((java.lang.Throwable) iOException45);
        iOException18.addSuppressed((java.lang.Throwable) iOException45);
        java.io.IOException iOException51 = new java.io.IOException((java.lang.Throwable) iOException45);
        iOException3.addSuppressed((java.lang.Throwable) iOException45);
        java.lang.Throwable[] throwableArray53 = iOException3.getSuppressed();
        org.junit.Assert.assertNotNull(throwableArray4);
        org.junit.Assert.assertNotNull(throwableArray7);
        org.junit.Assert.assertNotNull(throwableArray12);
        org.junit.Assert.assertNotNull(throwableArray13);
        org.junit.Assert.assertNotNull(throwableArray19);
        org.junit.Assert.assertNotNull(throwableArray28);
        org.junit.Assert.assertNotNull(throwableArray53);
    }

    @Test
    public void test00200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00200");
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper2 = org.apache.commons.lang3.text.translate.UnicodeEscaper.outsideOf(10, 10);
        java.lang.String str4 = unicodeEscaper2.translate((java.lang.CharSequence) "hi!");
        java.io.Writer writer6 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean7 = unicodeEscaper2.translate((int) ' ', writer6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(unicodeEscaper2);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "\\u0068\\u0069\\u0021" + "'", str4, "\\u0068\\u0069\\u0021");
    }

    @Test
    public void test00201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00201");
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper0 = new org.apache.commons.lang3.text.translate.UnicodeEscaper();
        java.lang.String str2 = unicodeEscaper0.translate((java.lang.CharSequence) "hi!");
        java.io.Writer writer4 = null;
        boolean boolean5 = unicodeEscaper0.translate((int) (byte) -1, writer4);
        java.lang.String str7 = unicodeEscaper0.translate((java.lang.CharSequence) "");
        java.lang.String str9 = unicodeEscaper0.translate((java.lang.CharSequence) "java\\u002Eio\\u002E\\u0049\\u004F\\u0045xception\\u003A\\u0020java\\u002Eio\\u002E\\u0049\\u004F\\u0045xception");
        java.io.Writer writer12 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int13 = unicodeEscaper0.translate((java.lang.CharSequence) "", (int) (short) -1, writer12);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: -1");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\\u0068\\u0069\\u0021" + "'", str2, "\\u0068\\u0069\\u0021");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "\\u006A\\u0061\\u0076\\u0061\\u005C\\u0075\\u0030\\u0030\\u0032\\u0045\\u0069\\u006F\\u005C\\u0075\\u0030\\u0030\\u0032\\u0045\\u005C\\u0075\\u0030\\u0030\\u0034\\u0039\\u005C\\u0075\\u0030\\u0030\\u0034\\u0046\\u005C\\u0075\\u0030\\u0030\\u0034\\u0035\\u0078\\u0063\\u0065\\u0070\\u0074\\u0069\\u006F\\u006E\\u005C\\u0075\\u0030\\u0030\\u0033\\u0041\\u005C\\u0075\\u0030\\u0030\\u0032\\u0030\\u006A\\u0061\\u0076\\u0061\\u005C\\u0075\\u0030\\u0030\\u0032\\u0045\\u0069\\u006F\\u005C\\u0075\\u0030\\u0030\\u0032\\u0045\\u005C\\u0075\\u0030\\u0030\\u0034\\u0039\\u005C\\u0075\\u0030\\u0030\\u0034\\u0046\\u005C\\u0075\\u0030\\u0030\\u0034\\u0035\\u0078\\u0063\\u0065\\u0070\\u0074\\u0069\\u006F\\u006E" + "'", str9, "\\u006A\\u0061\\u0076\\u0061\\u005C\\u0075\\u0030\\u0030\\u0032\\u0045\\u0069\\u006F\\u005C\\u0075\\u0030\\u0030\\u0032\\u0045\\u005C\\u0075\\u0030\\u0030\\u0034\\u0039\\u005C\\u0075\\u0030\\u0030\\u0034\\u0046\\u005C\\u0075\\u0030\\u0030\\u0034\\u0035\\u0078\\u0063\\u0065\\u0070\\u0074\\u0069\\u006F\\u006E\\u005C\\u0075\\u0030\\u0030\\u0033\\u0041\\u005C\\u0075\\u0030\\u0030\\u0032\\u0030\\u006A\\u0061\\u0076\\u0061\\u005C\\u0075\\u0030\\u0030\\u0032\\u0045\\u0069\\u006F\\u005C\\u0075\\u0030\\u0030\\u0032\\u0045\\u005C\\u0075\\u0030\\u0030\\u0034\\u0039\\u005C\\u0075\\u0030\\u0030\\u0034\\u0046\\u005C\\u0075\\u0030\\u0030\\u0034\\u0035\\u0078\\u0063\\u0065\\u0070\\u0074\\u0069\\u006F\\u006E");
    }

    @Test
    public void test00202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00202");
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper2 = org.apache.commons.lang3.text.translate.UnicodeEscaper.outsideOf((int) (byte) 100, (int) (byte) 10);
        java.lang.String str4 = unicodeEscaper2.translate((java.lang.CharSequence) "hi!");
        java.io.Writer writer7 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int8 = unicodeEscaper2.translate((java.lang.CharSequence) "61", (int) ' ', writer7);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 32");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(unicodeEscaper2);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "\\u0068\\u0069\\u0021" + "'", str4, "\\u0068\\u0069\\u0021");
    }

    @Test
    public void test00203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00203");
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper2 = org.apache.commons.lang3.text.translate.UnicodeEscaper.outsideOf(1, (int) ' ');
        java.io.Writer writer5 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int6 = unicodeEscaper2.translate((java.lang.CharSequence) "java.io.IOException: java.io.IOException", 0, writer5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(unicodeEscaper2);
    }

    @Test
    public void test00204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00204");
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper2 = org.apache.commons.lang3.text.translate.UnicodeEscaper.outsideOf((int) '4', (int) '4');
        java.io.Writer writer4 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean5 = unicodeEscaper2.translate(10, writer4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(unicodeEscaper2);
    }

    @Test
    public void test00205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00205");
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper2 = org.apache.commons.lang3.text.translate.UnicodeEscaper.outsideOf(0, (int) 'a');
        java.io.Writer writer4 = null;
        boolean boolean5 = unicodeEscaper2.translate((int) '4', writer4);
        java.io.Writer writer7 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean8 = unicodeEscaper2.translate((int) (short) -1, writer7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(unicodeEscaper2);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test00206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00206");
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper1 = org.apache.commons.lang3.text.translate.UnicodeEscaper.below((int) (short) 100);
        java.io.Writer writer4 = null;
        int int5 = unicodeEscaper1.translate((java.lang.CharSequence) "java.io.IOException: java.io.IOException", 0, writer4);
        java.lang.String str7 = unicodeEscaper1.translate((java.lang.CharSequence) "java.io.IOException: ");
        java.io.Writer writer9 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean10 = unicodeEscaper1.translate((int) (byte) 1, writer9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(unicodeEscaper1);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "j\\u0061v\\u0061\\u002Eio\\u002E\\u0049\\u004F\\u0045x\\u0063eption\\u003A\\u0020" + "'", str7, "j\\u0061v\\u0061\\u002Eio\\u002E\\u0049\\u004F\\u0045x\\u0063eption\\u003A\\u0020");
    }

    @Test
    public void test00207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00207");
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper1 = org.apache.commons.lang3.text.translate.UnicodeEscaper.above((int) (short) 1);
        java.lang.Class<?> wildcardClass2 = unicodeEscaper1.getClass();
        org.junit.Assert.assertNotNull(unicodeEscaper1);
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test00208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00208");
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper2 = org.apache.commons.lang3.text.translate.UnicodeEscaper.between((int) (byte) 100, (int) (short) 100);
        java.io.Writer writer5 = null;
        int int6 = unicodeEscaper2.translate((java.lang.CharSequence) "java\\u002Eio\\u002E\\u0049\\u004F\\u0045xception\\u003A\\u0020java\\u002Eio\\u002E\\u0049\\u004F\\u0045xception", (int) (byte) 0, writer5);
        java.io.Writer writer9 = null;
        int int10 = unicodeEscaper2.translate((java.lang.CharSequence) "\\u005Cu\\u0030\\u0030\\u0036\\u0038\\u005Cu\\u0030\\u0030\\u0036\\u0039\\u005Cu\\u0030\\u0030\\u0032\\u0031", 1, writer9);
        java.lang.Class<?> wildcardClass11 = unicodeEscaper2.getClass();
        org.junit.Assert.assertNotNull(unicodeEscaper2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test00209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00209");
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper1 = org.apache.commons.lang3.text.translate.UnicodeEscaper.above((int) 'a');
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper3 = org.apache.commons.lang3.text.translate.UnicodeEscaper.below((int) (byte) 0);
        java.io.Writer writer5 = null;
        boolean boolean6 = unicodeEscaper3.translate((int) ' ', writer5);
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper9 = org.apache.commons.lang3.text.translate.UnicodeEscaper.between((-1), (int) (short) 0);
        java.lang.String str11 = unicodeEscaper9.translate((java.lang.CharSequence) "0");
        org.apache.commons.lang3.text.translate.CharSequenceTranslator[] charSequenceTranslatorArray12 = new org.apache.commons.lang3.text.translate.CharSequenceTranslator[] {};
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator13 = unicodeEscaper9.with(charSequenceTranslatorArray12);
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator14 = unicodeEscaper3.with(charSequenceTranslatorArray12);
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator15 = unicodeEscaper1.with(charSequenceTranslatorArray12);
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper18 = org.apache.commons.lang3.text.translate.UnicodeEscaper.between((int) (byte) 1, (int) '#');
        java.io.Writer writer20 = null;
        boolean boolean21 = unicodeEscaper18.translate((int) '4', writer20);
        java.io.Writer writer23 = null;
        boolean boolean24 = unicodeEscaper18.translate((int) (byte) -1, writer23);
        java.io.Writer writer26 = null;
        boolean boolean27 = unicodeEscaper18.translate((int) (byte) -1, writer26);
        org.apache.commons.lang3.text.translate.CharSequenceTranslator[] charSequenceTranslatorArray28 = new org.apache.commons.lang3.text.translate.CharSequenceTranslator[] {};
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator29 = unicodeEscaper18.with(charSequenceTranslatorArray28);
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator30 = charSequenceTranslator15.with(charSequenceTranslatorArray28);
        java.io.Writer writer32 = null;
        // The following exception was thrown during execution in test generation
        try {
            charSequenceTranslator15.translate((java.lang.CharSequence) "1", writer32);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Writer must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(unicodeEscaper1);
        org.junit.Assert.assertNotNull(unicodeEscaper3);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(unicodeEscaper9);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "0" + "'", str11, "0");
        org.junit.Assert.assertNotNull(charSequenceTranslatorArray12);
        org.junit.Assert.assertNotNull(charSequenceTranslator13);
        org.junit.Assert.assertNotNull(charSequenceTranslator14);
        org.junit.Assert.assertNotNull(charSequenceTranslator15);
        org.junit.Assert.assertNotNull(unicodeEscaper18);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(charSequenceTranslatorArray28);
        org.junit.Assert.assertNotNull(charSequenceTranslator29);
        org.junit.Assert.assertNotNull(charSequenceTranslator30);
    }

    @Test
    public void test00210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00210");
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper0 = new org.apache.commons.lang3.text.translate.UnicodeEscaper();
        java.lang.String str2 = unicodeEscaper0.translate((java.lang.CharSequence) "hi!");
        java.io.Writer writer4 = null;
        boolean boolean5 = unicodeEscaper0.translate((int) (byte) -1, writer4);
        java.io.Writer writer7 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean8 = unicodeEscaper0.translate(10, writer7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\\u0068\\u0069\\u0021" + "'", str2, "\\u0068\\u0069\\u0021");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test00211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00211");
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper0 = new org.apache.commons.lang3.text.translate.UnicodeEscaper();
        java.lang.String str2 = unicodeEscaper0.translate((java.lang.CharSequence) "hi!");
        java.io.Writer writer4 = null;
        boolean boolean5 = unicodeEscaper0.translate((int) (byte) -1, writer4);
        java.lang.String str7 = unicodeEscaper0.translate((java.lang.CharSequence) "");
        java.lang.String str9 = unicodeEscaper0.translate((java.lang.CharSequence) "64");
        java.io.Writer writer11 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean12 = unicodeEscaper0.translate((int) (byte) 10, writer11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\\u0068\\u0069\\u0021" + "'", str2, "\\u0068\\u0069\\u0021");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "\\u0036\\u0034" + "'", str9, "\\u0036\\u0034");
    }

    @Test
    public void test00212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00212");
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper1 = org.apache.commons.lang3.text.translate.UnicodeEscaper.above((int) 'a');
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper3 = org.apache.commons.lang3.text.translate.UnicodeEscaper.below((int) (byte) 0);
        java.io.Writer writer5 = null;
        boolean boolean6 = unicodeEscaper3.translate((int) ' ', writer5);
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper9 = org.apache.commons.lang3.text.translate.UnicodeEscaper.between((-1), (int) (short) 0);
        java.lang.String str11 = unicodeEscaper9.translate((java.lang.CharSequence) "0");
        org.apache.commons.lang3.text.translate.CharSequenceTranslator[] charSequenceTranslatorArray12 = new org.apache.commons.lang3.text.translate.CharSequenceTranslator[] {};
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator13 = unicodeEscaper9.with(charSequenceTranslatorArray12);
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator14 = unicodeEscaper3.with(charSequenceTranslatorArray12);
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator15 = unicodeEscaper1.with(charSequenceTranslatorArray12);
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper18 = org.apache.commons.lang3.text.translate.UnicodeEscaper.between((int) (byte) 1, (int) '#');
        java.io.Writer writer20 = null;
        boolean boolean21 = unicodeEscaper18.translate((int) '4', writer20);
        java.io.Writer writer23 = null;
        boolean boolean24 = unicodeEscaper18.translate((int) (byte) -1, writer23);
        java.io.Writer writer26 = null;
        boolean boolean27 = unicodeEscaper18.translate((int) (byte) -1, writer26);
        org.apache.commons.lang3.text.translate.CharSequenceTranslator[] charSequenceTranslatorArray28 = new org.apache.commons.lang3.text.translate.CharSequenceTranslator[] {};
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator29 = unicodeEscaper18.with(charSequenceTranslatorArray28);
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator30 = charSequenceTranslator15.with(charSequenceTranslatorArray28);
        java.lang.Class<?> wildcardClass31 = charSequenceTranslatorArray28.getClass();
        org.junit.Assert.assertNotNull(unicodeEscaper1);
        org.junit.Assert.assertNotNull(unicodeEscaper3);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(unicodeEscaper9);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "0" + "'", str11, "0");
        org.junit.Assert.assertNotNull(charSequenceTranslatorArray12);
        org.junit.Assert.assertNotNull(charSequenceTranslator13);
        org.junit.Assert.assertNotNull(charSequenceTranslator14);
        org.junit.Assert.assertNotNull(charSequenceTranslator15);
        org.junit.Assert.assertNotNull(unicodeEscaper18);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(charSequenceTranslatorArray28);
        org.junit.Assert.assertNotNull(charSequenceTranslator29);
        org.junit.Assert.assertNotNull(charSequenceTranslator30);
        org.junit.Assert.assertNotNull(wildcardClass31);
    }

    @Test
    public void test00213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00213");
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper1 = org.apache.commons.lang3.text.translate.UnicodeEscaper.above((int) (byte) 100);
        java.io.Writer writer4 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int5 = unicodeEscaper1.translate((java.lang.CharSequence) "java.io.IOException: java.io.IOException: java.io.IOException: java.io.IOException: 0", (int) ' ', writer4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(unicodeEscaper1);
    }

    @Test
    public void test00214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00214");
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper1 = org.apache.commons.lang3.text.translate.UnicodeEscaper.below((int) (byte) 0);
        java.io.Writer writer3 = null;
        boolean boolean4 = unicodeEscaper1.translate((int) ' ', writer3);
        java.lang.Class<?> wildcardClass5 = unicodeEscaper1.getClass();
        org.junit.Assert.assertNotNull(unicodeEscaper1);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test00215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00215");
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper2 = org.apache.commons.lang3.text.translate.UnicodeEscaper.between((-1), (int) (byte) 10);
        java.io.Writer writer4 = null;
        // The following exception was thrown during execution in test generation
        try {
            unicodeEscaper2.translate((java.lang.CharSequence) "\\u006A\\u0061\\u0076\\u0061\\u002E\\u0069\\u006F\\u002E\\u0049\\u004F\\u0045\\u0078\\u0063\\u0065\\u0070\\u0074\\u0069\\u006F\\u006E\\u003A\\u0020\\u006A\\u0061\\u0076\\u0061\\u002E\\u0069\\u006F\\u002E\\u0049\\u004F\\u0045\\u0078\\u0063\\u0065\\u0070\\u0074\\u0069\\u006F\\u006E\\u003A\\u0020\\u006A\\u0061\\u0076\\u0061\\u002E\\u0069\\u006F\\u002E\\u0049\\u004F\\u0045\\u0078\\u0063\\u0065\\u0070\\u0074\\u0069\\u006F\\u006E\\u003A\\u0020\\u0030", writer4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Writer must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(unicodeEscaper2);
    }

    @Test
    public void test00216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00216");
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper2 = org.apache.commons.lang3.text.translate.UnicodeEscaper.outsideOf((-1), (int) (short) 0);
        java.lang.String str4 = unicodeEscaper2.translate((java.lang.CharSequence) "java.io.IOException: ");
        java.io.Writer writer7 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int8 = unicodeEscaper2.translate((java.lang.CharSequence) "java.io.IOException: hi!", (int) (short) -1, writer7);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: -1");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(unicodeEscaper2);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "\\u006A\\u0061\\u0076\\u0061\\u002E\\u0069\\u006F\\u002E\\u0049\\u004F\\u0045\\u0078\\u0063\\u0065\\u0070\\u0074\\u0069\\u006F\\u006E\\u003A\\u0020" + "'", str4, "\\u006A\\u0061\\u0076\\u0061\\u002E\\u0069\\u006F\\u002E\\u0049\\u004F\\u0045\\u0078\\u0063\\u0065\\u0070\\u0074\\u0069\\u006F\\u006E\\u003A\\u0020");
    }

    @Test
    public void test00217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00217");
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper1 = org.apache.commons.lang3.text.translate.UnicodeEscaper.below((int) '4');
        java.io.Writer writer3 = null;
        boolean boolean4 = unicodeEscaper1.translate((int) 'a', writer3);
        java.io.Writer writer6 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean7 = unicodeEscaper1.translate(10, writer6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(unicodeEscaper1);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test00218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00218");
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper1 = org.apache.commons.lang3.text.translate.UnicodeEscaper.above((int) '#');
        java.io.Writer writer3 = null;
        boolean boolean4 = unicodeEscaper1.translate(0, writer3);
        java.io.Writer writer7 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int8 = unicodeEscaper1.translate((java.lang.CharSequence) "\\u006A\\u0061\\u0076\\u0061\\u002E\\u0069\\u006F\\u002E\\u0049\\u004F\\u0045\\u0078\\u0063\\u0065\\u0070\\u0074\\u0069\\u006F\\u006E\\u003A\\u0020\\u006A\\u0061\\u0076\\u0061\\u002E\\u0069\\u006F\\u002E\\u0049\\u004F\\u0045\\u0078\\u0063\\u0065\\u0070\\u0074\\u0069\\u006F\\u006E\\u003A\\u0020\\u006A\\u0061\\u0076\\u0061\\u002E\\u0069\\u006F\\u002E\\u0049\\u004F\\u0045\\u0078\\u0063\\u0065\\u0070\\u0074\\u0069\\u006F\\u006E\\u003A\\u0020\\u006A\\u0061\\u0076\\u0061\\u002E\\u0069\\u006F\\u002E\\u0049\\u004F\\u0045\\u0078\\u0063\\u0065\\u0070\\u0074\\u0069\\u006F\\u006E\\u003A\\u0020\\u0030", 1, writer7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(unicodeEscaper1);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test00219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00219");
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper2 = org.apache.commons.lang3.text.translate.UnicodeEscaper.outsideOf(0, (int) 'a');
        java.lang.String str4 = unicodeEscaper2.translate((java.lang.CharSequence) "0");
        java.io.Writer writer6 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean7 = unicodeEscaper2.translate((int) (byte) -1, writer6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(unicodeEscaper2);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "0" + "'", str4, "0");
    }

    @Test
    public void test00220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00220");
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper2 = org.apache.commons.lang3.text.translate.UnicodeEscaper.outsideOf((int) (byte) 100, (int) (byte) 0);
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper5 = org.apache.commons.lang3.text.translate.UnicodeEscaper.between((-1), (int) (short) 0);
        java.lang.String str7 = unicodeEscaper5.translate((java.lang.CharSequence) "0");
        org.apache.commons.lang3.text.translate.CharSequenceTranslator[] charSequenceTranslatorArray8 = new org.apache.commons.lang3.text.translate.CharSequenceTranslator[] {};
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator9 = unicodeEscaper5.with(charSequenceTranslatorArray8);
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator10 = unicodeEscaper2.with(charSequenceTranslatorArray8);
        java.lang.Class<?> wildcardClass11 = charSequenceTranslator10.getClass();
        org.junit.Assert.assertNotNull(unicodeEscaper2);
        org.junit.Assert.assertNotNull(unicodeEscaper5);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "0" + "'", str7, "0");
        org.junit.Assert.assertNotNull(charSequenceTranslatorArray8);
        org.junit.Assert.assertNotNull(charSequenceTranslator9);
        org.junit.Assert.assertNotNull(charSequenceTranslator10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test00221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00221");
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper2 = org.apache.commons.lang3.text.translate.UnicodeEscaper.outsideOf((int) 'a', (int) (byte) 1);
        java.io.Writer writer4 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean5 = unicodeEscaper2.translate((int) '#', writer4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(unicodeEscaper2);
    }

    @Test
    public void test00222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00222");
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper2 = org.apache.commons.lang3.text.translate.UnicodeEscaper.outsideOf((int) '4', (int) '4');
        java.io.Writer writer5 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int6 = unicodeEscaper2.translate((java.lang.CharSequence) "0", (int) (short) 100, writer5);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 100");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(unicodeEscaper2);
    }

    @Test
    public void test00223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00223");
        java.io.IOException iOException3 = new java.io.IOException("0");
        java.lang.Throwable[] throwableArray4 = iOException3.getSuppressed();
        java.io.IOException iOException5 = new java.io.IOException("hi!", (java.lang.Throwable) iOException3);
        java.io.IOException iOException6 = new java.io.IOException("java.io.IOException", (java.lang.Throwable) iOException3);
        java.lang.Throwable[] throwableArray7 = iOException3.getSuppressed();
        java.io.IOException iOException9 = new java.io.IOException();
        java.io.IOException iOException10 = new java.io.IOException();
        iOException9.addSuppressed((java.lang.Throwable) iOException10);
        java.lang.Throwable[] throwableArray12 = iOException10.getSuppressed();
        java.lang.Throwable[] throwableArray13 = iOException10.getSuppressed();
        java.io.IOException iOException14 = new java.io.IOException("java.io.IOException", (java.lang.Throwable) iOException10);
        java.io.IOException iOException15 = new java.io.IOException();
        java.io.IOException iOException16 = new java.io.IOException();
        iOException15.addSuppressed((java.lang.Throwable) iOException16);
        java.io.IOException iOException18 = new java.io.IOException((java.lang.Throwable) iOException15);
        java.lang.Throwable[] throwableArray19 = iOException18.getSuppressed();
        iOException14.addSuppressed((java.lang.Throwable) iOException18);
        java.io.IOException iOException22 = new java.io.IOException();
        java.io.IOException iOException23 = new java.io.IOException();
        iOException22.addSuppressed((java.lang.Throwable) iOException23);
        java.io.IOException iOException25 = new java.io.IOException();
        java.io.IOException iOException26 = new java.io.IOException();
        iOException25.addSuppressed((java.lang.Throwable) iOException26);
        java.lang.Throwable[] throwableArray28 = iOException26.getSuppressed();
        java.io.IOException iOException29 = new java.io.IOException((java.lang.Throwable) iOException26);
        java.io.IOException iOException31 = new java.io.IOException("");
        java.io.IOException iOException32 = new java.io.IOException((java.lang.Throwable) iOException31);
        iOException26.addSuppressed((java.lang.Throwable) iOException32);
        iOException23.addSuppressed((java.lang.Throwable) iOException32);
        java.io.IOException iOException35 = new java.io.IOException("java.io.IOException", (java.lang.Throwable) iOException32);
        iOException18.addSuppressed((java.lang.Throwable) iOException35);
        java.io.IOException iOException38 = new java.io.IOException("");
        java.io.IOException iOException39 = new java.io.IOException((java.lang.Throwable) iOException38);
        java.io.IOException iOException41 = new java.io.IOException("");
        iOException39.addSuppressed((java.lang.Throwable) iOException41);
        java.io.IOException iOException44 = new java.io.IOException("");
        java.io.IOException iOException45 = new java.io.IOException((java.lang.Throwable) iOException44);
        java.io.IOException iOException47 = new java.io.IOException("");
        iOException45.addSuppressed((java.lang.Throwable) iOException47);
        iOException39.addSuppressed((java.lang.Throwable) iOException45);
        iOException18.addSuppressed((java.lang.Throwable) iOException45);
        java.io.IOException iOException51 = new java.io.IOException((java.lang.Throwable) iOException45);
        iOException3.addSuppressed((java.lang.Throwable) iOException45);
        java.lang.String str53 = iOException3.toString();
        org.junit.Assert.assertNotNull(throwableArray4);
        org.junit.Assert.assertNotNull(throwableArray7);
        org.junit.Assert.assertNotNull(throwableArray12);
        org.junit.Assert.assertNotNull(throwableArray13);
        org.junit.Assert.assertNotNull(throwableArray19);
        org.junit.Assert.assertNotNull(throwableArray28);
        org.junit.Assert.assertEquals("'" + str53 + "' != '" + "java.io.IOException: 0" + "'", str53, "java.io.IOException: 0");
    }

    @Test
    public void test00224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00224");
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper2 = org.apache.commons.lang3.text.translate.UnicodeEscaper.between((int) (byte) 10, (int) (short) 100);
        java.io.Writer writer4 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean5 = unicodeEscaper2.translate((int) (short) 100, writer4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(unicodeEscaper2);
    }

    @Test
    public void test00225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00225");
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper2 = org.apache.commons.lang3.text.translate.UnicodeEscaper.outsideOf(0, 10);
        java.lang.String str4 = unicodeEscaper2.translate((java.lang.CharSequence) "hi!");
        java.io.Writer writer6 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean7 = unicodeEscaper2.translate((int) '#', writer6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(unicodeEscaper2);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "\\u0068\\u0069\\u0021" + "'", str4, "\\u0068\\u0069\\u0021");
    }

    @Test
    public void test00226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00226");
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper2 = org.apache.commons.lang3.text.translate.UnicodeEscaper.outsideOf((int) (byte) 100, (int) (byte) 0);
        org.apache.commons.lang3.text.translate.CharSequenceTranslator[] charSequenceTranslatorArray3 = new org.apache.commons.lang3.text.translate.CharSequenceTranslator[] {};
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator4 = unicodeEscaper2.with(charSequenceTranslatorArray3);
        java.io.Writer writer7 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int8 = charSequenceTranslator4.translate((java.lang.CharSequence) "61", (int) (byte) 1, writer7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(unicodeEscaper2);
        org.junit.Assert.assertNotNull(charSequenceTranslatorArray3);
        org.junit.Assert.assertNotNull(charSequenceTranslator4);
    }

    @Test
    public void test00227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00227");
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper1 = org.apache.commons.lang3.text.translate.UnicodeEscaper.below((int) (short) 10);
        java.lang.String str3 = unicodeEscaper1.translate((java.lang.CharSequence) "\\u0068\\u0069\\u0021");
        java.io.Writer writer5 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean6 = unicodeEscaper1.translate((int) (short) -1, writer5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(unicodeEscaper1);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\\u0068\\u0069\\u0021" + "'", str3, "\\u0068\\u0069\\u0021");
    }

    @Test
    public void test00228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00228");
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper1 = org.apache.commons.lang3.text.translate.UnicodeEscaper.below((int) ' ');
        java.io.Writer writer3 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean4 = unicodeEscaper1.translate((int) (short) 10, writer3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(unicodeEscaper1);
    }

    @Test
    public void test00229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00229");
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper2 = org.apache.commons.lang3.text.translate.UnicodeEscaper.outsideOf((int) (short) 10, (int) (byte) -1);
        java.io.Writer writer5 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int6 = unicodeEscaper2.translate((java.lang.CharSequence) "java.io.IOException", (int) '#', writer5);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 35");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(unicodeEscaper2);
    }

    @Test
    public void test00230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00230");
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper1 = org.apache.commons.lang3.text.translate.UnicodeEscaper.below((int) (byte) 10);
        java.io.Writer writer4 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int5 = unicodeEscaper1.translate((java.lang.CharSequence) "0", (int) '4', writer4);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 52");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(unicodeEscaper1);
    }

    @Test
    public void test00231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00231");
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper2 = org.apache.commons.lang3.text.translate.UnicodeEscaper.outsideOf((int) ' ', 10);
        java.io.Writer writer4 = null;
        // The following exception was thrown during execution in test generation
        try {
            unicodeEscaper2.translate((java.lang.CharSequence) "\\u005C\\u0075\\u0030\\u0030\\u0033\\u0036\\u005C\\u0075\\u0030\\u0030\\u0033\\u0034", writer4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Writer must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(unicodeEscaper2);
    }

    @Test
    public void test00232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00232");
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper2 = org.apache.commons.lang3.text.translate.UnicodeEscaper.outsideOf((int) (byte) 100, 0);
        java.io.Writer writer5 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int6 = unicodeEscaper2.translate((java.lang.CharSequence) "", (int) (short) 100, writer5);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 100");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(unicodeEscaper2);
    }

    @Test
    public void test00233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00233");
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper2 = org.apache.commons.lang3.text.translate.UnicodeEscaper.between((int) (byte) 1, (int) '#');
        java.io.Writer writer4 = null;
        boolean boolean5 = unicodeEscaper2.translate((int) '4', writer4);
        java.io.Writer writer7 = null;
        boolean boolean8 = unicodeEscaper2.translate((int) (byte) -1, writer7);
        java.io.Writer writer10 = null;
        boolean boolean11 = unicodeEscaper2.translate((int) (byte) -1, writer10);
        java.lang.CharSequence charSequence12 = null;
        java.io.Writer writer13 = null;
        // The following exception was thrown during execution in test generation
        try {
            unicodeEscaper2.translate(charSequence12, writer13);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Writer must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(unicodeEscaper2);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test00234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00234");
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper2 = org.apache.commons.lang3.text.translate.UnicodeEscaper.between((int) (byte) -1, (int) (short) 0);
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper5 = org.apache.commons.lang3.text.translate.UnicodeEscaper.between((int) (byte) 1, (int) '#');
        java.io.Writer writer7 = null;
        boolean boolean8 = unicodeEscaper5.translate((int) '4', writer7);
        java.io.Writer writer10 = null;
        boolean boolean11 = unicodeEscaper5.translate((int) (byte) -1, writer10);
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper14 = org.apache.commons.lang3.text.translate.UnicodeEscaper.between((int) (byte) 1, (int) '#');
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper16 = org.apache.commons.lang3.text.translate.UnicodeEscaper.below(100);
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper18 = org.apache.commons.lang3.text.translate.UnicodeEscaper.below((int) 'a');
        java.lang.String str20 = unicodeEscaper18.translate((java.lang.CharSequence) "java.io.IOException: java.io.IOException");
        org.apache.commons.lang3.text.translate.CharSequenceTranslator[] charSequenceTranslatorArray21 = new org.apache.commons.lang3.text.translate.CharSequenceTranslator[] { unicodeEscaper14, unicodeEscaper16, unicodeEscaper18 };
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator22 = unicodeEscaper5.with(charSequenceTranslatorArray21);
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator23 = unicodeEscaper2.with(charSequenceTranslatorArray21);
        java.io.Writer writer26 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int27 = charSequenceTranslator23.translate((java.lang.CharSequence) "\\u005C\\u0075\\u0030\\u0030\\u0035\\u0043\\u005C\\u0075\\u0030\\u0030\\u0037\\u0035\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0033\\u005C\\u0075\\u0030\\u0030\\u0033\\u0036\\u005C\\u0075\\u0030\\u0030\\u0035\\u0043\\u005C\\u0075\\u0030\\u0030\\u0037\\u0035\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0033\\u005C\\u0075\\u0030\\u0030\\u0033\\u0034", 0, writer26);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(unicodeEscaper2);
        org.junit.Assert.assertNotNull(unicodeEscaper5);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(unicodeEscaper14);
        org.junit.Assert.assertNotNull(unicodeEscaper16);
        org.junit.Assert.assertNotNull(unicodeEscaper18);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "java\\u002Eio\\u002E\\u0049\\u004F\\u0045xception\\u003A\\u0020java\\u002Eio\\u002E\\u0049\\u004F\\u0045xception" + "'", str20, "java\\u002Eio\\u002E\\u0049\\u004F\\u0045xception\\u003A\\u0020java\\u002Eio\\u002E\\u0049\\u004F\\u0045xception");
        org.junit.Assert.assertNotNull(charSequenceTranslatorArray21);
        org.junit.Assert.assertNotNull(charSequenceTranslator22);
        org.junit.Assert.assertNotNull(charSequenceTranslator23);
    }

    @Test
    public void test00235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00235");
        java.lang.String str1 = org.apache.commons.lang3.text.translate.CharSequenceTranslator.hex((int) '4');
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "34" + "'", str1, "34");
    }

    @Test
    public void test00236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00236");
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper1 = org.apache.commons.lang3.text.translate.UnicodeEscaper.above((int) (byte) 1);
        java.io.Writer writer4 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int5 = unicodeEscaper1.translate((java.lang.CharSequence) "\\u0068\\u0069\\u0021", (int) (short) 10, writer4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(unicodeEscaper1);
    }

    @Test
    public void test00237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00237");
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper0 = new org.apache.commons.lang3.text.translate.UnicodeEscaper();
        java.lang.String str2 = unicodeEscaper0.translate((java.lang.CharSequence) "hi!");
        java.lang.String str4 = unicodeEscaper0.translate((java.lang.CharSequence) "");
        java.io.Writer writer6 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean7 = unicodeEscaper0.translate(0, writer6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\\u0068\\u0069\\u0021" + "'", str2, "\\u0068\\u0069\\u0021");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
    }

    @Test
    public void test00238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00238");
        java.io.IOException iOException1 = new java.io.IOException();
        java.io.IOException iOException2 = new java.io.IOException();
        iOException1.addSuppressed((java.lang.Throwable) iOException2);
        java.lang.Throwable[] throwableArray4 = iOException2.getSuppressed();
        java.lang.Throwable[] throwableArray5 = iOException2.getSuppressed();
        java.io.IOException iOException6 = new java.io.IOException("java.io.IOException", (java.lang.Throwable) iOException2);
        java.io.IOException iOException7 = new java.io.IOException();
        java.io.IOException iOException8 = new java.io.IOException();
        iOException7.addSuppressed((java.lang.Throwable) iOException8);
        java.io.IOException iOException10 = new java.io.IOException((java.lang.Throwable) iOException7);
        java.lang.Throwable[] throwableArray11 = iOException10.getSuppressed();
        iOException6.addSuppressed((java.lang.Throwable) iOException10);
        java.io.IOException iOException14 = new java.io.IOException();
        java.io.IOException iOException15 = new java.io.IOException();
        iOException14.addSuppressed((java.lang.Throwable) iOException15);
        java.io.IOException iOException17 = new java.io.IOException();
        java.io.IOException iOException18 = new java.io.IOException();
        iOException17.addSuppressed((java.lang.Throwable) iOException18);
        java.lang.Throwable[] throwableArray20 = iOException18.getSuppressed();
        java.io.IOException iOException21 = new java.io.IOException((java.lang.Throwable) iOException18);
        java.io.IOException iOException23 = new java.io.IOException("");
        java.io.IOException iOException24 = new java.io.IOException((java.lang.Throwable) iOException23);
        iOException18.addSuppressed((java.lang.Throwable) iOException24);
        iOException15.addSuppressed((java.lang.Throwable) iOException24);
        java.io.IOException iOException27 = new java.io.IOException("java.io.IOException", (java.lang.Throwable) iOException24);
        iOException10.addSuppressed((java.lang.Throwable) iOException27);
        java.io.IOException iOException30 = new java.io.IOException("");
        java.io.IOException iOException31 = new java.io.IOException((java.lang.Throwable) iOException30);
        java.io.IOException iOException33 = new java.io.IOException("");
        iOException31.addSuppressed((java.lang.Throwable) iOException33);
        java.io.IOException iOException36 = new java.io.IOException("");
        java.io.IOException iOException37 = new java.io.IOException((java.lang.Throwable) iOException36);
        java.io.IOException iOException39 = new java.io.IOException("");
        iOException37.addSuppressed((java.lang.Throwable) iOException39);
        iOException31.addSuppressed((java.lang.Throwable) iOException37);
        iOException10.addSuppressed((java.lang.Throwable) iOException37);
        java.lang.Throwable[] throwableArray43 = iOException37.getSuppressed();
        java.lang.String str44 = iOException37.toString();
        org.junit.Assert.assertNotNull(throwableArray4);
        org.junit.Assert.assertNotNull(throwableArray5);
        org.junit.Assert.assertNotNull(throwableArray11);
        org.junit.Assert.assertNotNull(throwableArray20);
        org.junit.Assert.assertNotNull(throwableArray43);
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "java.io.IOException: java.io.IOException: " + "'", str44, "java.io.IOException: java.io.IOException: ");
    }

    @Test
    public void test00239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00239");
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper2 = org.apache.commons.lang3.text.translate.UnicodeEscaper.outsideOf((int) (short) 10, (int) (byte) -1);
        java.io.Writer writer4 = null;
        // The following exception was thrown during execution in test generation
        try {
            unicodeEscaper2.translate((java.lang.CharSequence) "java.io.IOException: java.io.IOException: ", writer4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Writer must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(unicodeEscaper2);
    }

    @Test
    public void test00240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00240");
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper2 = org.apache.commons.lang3.text.translate.UnicodeEscaper.between((-1), (int) (byte) -1);
        java.io.Writer writer4 = null;
        // The following exception was thrown during execution in test generation
        try {
            unicodeEscaper2.translate((java.lang.CharSequence) "FFFFFFFF", writer4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Writer must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(unicodeEscaper2);
    }

    @Test
    public void test00241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00241");
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper1 = org.apache.commons.lang3.text.translate.UnicodeEscaper.above((int) (short) 1);
        java.io.Writer writer4 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int5 = unicodeEscaper1.translate((java.lang.CharSequence) "A", (int) 'a', writer4);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 97");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(unicodeEscaper1);
    }

    @Test
    public void test00242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00242");
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper2 = org.apache.commons.lang3.text.translate.UnicodeEscaper.outsideOf((int) (byte) 100, (int) (byte) 0);
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper5 = org.apache.commons.lang3.text.translate.UnicodeEscaper.between((-1), (int) (short) 0);
        java.lang.String str7 = unicodeEscaper5.translate((java.lang.CharSequence) "0");
        org.apache.commons.lang3.text.translate.CharSequenceTranslator[] charSequenceTranslatorArray8 = new org.apache.commons.lang3.text.translate.CharSequenceTranslator[] {};
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator9 = unicodeEscaper5.with(charSequenceTranslatorArray8);
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator10 = unicodeEscaper2.with(charSequenceTranslatorArray8);
        java.io.Writer writer13 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int14 = unicodeEscaper2.translate((java.lang.CharSequence) "1", (int) (byte) 1, writer13);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 1");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(unicodeEscaper2);
        org.junit.Assert.assertNotNull(unicodeEscaper5);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "0" + "'", str7, "0");
        org.junit.Assert.assertNotNull(charSequenceTranslatorArray8);
        org.junit.Assert.assertNotNull(charSequenceTranslator9);
        org.junit.Assert.assertNotNull(charSequenceTranslator10);
    }

    @Test
    public void test00243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00243");
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper2 = org.apache.commons.lang3.text.translate.UnicodeEscaper.outsideOf((int) (byte) 100, (int) (byte) 10);
        java.lang.String str4 = unicodeEscaper2.translate((java.lang.CharSequence) "hi!");
        java.lang.String str6 = unicodeEscaper2.translate((java.lang.CharSequence) "java.io.IOException: java.io.IOException");
        java.io.Writer writer9 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int10 = unicodeEscaper2.translate((java.lang.CharSequence) "\\\\u0075006Aa\\\\u00750076a.\\\\u00750069\\\\u0075006F.IOE\\\\u00750078\\u0063\\\\u00750065\\\\u00750070\\\\u00750074\\\\u00750069\\\\u0075006F\\\\u0075006E: \\\\u0075006Aa\\\\u00750076a.\\\\u00750069\\\\u0075006F.IOE\\\\u00750078\\u0063\\\\u00750065\\\\u00750070\\\\u00750074\\\\u00750069\\\\u0075006F\\\\u0075006E", (int) (byte) -1, writer9);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: -1");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(unicodeEscaper2);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "\\u0068\\u0069\\u0021" + "'", str4, "\\u0068\\u0069\\u0021");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "\\u006A\\u0061\\u0076\\u0061\\u002E\\u0069\\u006F\\u002E\\u0049\\u004F\\u0045\\u0078\\u0063\\u0065\\u0070\\u0074\\u0069\\u006F\\u006E\\u003A\\u0020\\u006A\\u0061\\u0076\\u0061\\u002E\\u0069\\u006F\\u002E\\u0049\\u004F\\u0045\\u0078\\u0063\\u0065\\u0070\\u0074\\u0069\\u006F\\u006E" + "'", str6, "\\u006A\\u0061\\u0076\\u0061\\u002E\\u0069\\u006F\\u002E\\u0049\\u004F\\u0045\\u0078\\u0063\\u0065\\u0070\\u0074\\u0069\\u006F\\u006E\\u003A\\u0020\\u006A\\u0061\\u0076\\u0061\\u002E\\u0069\\u006F\\u002E\\u0049\\u004F\\u0045\\u0078\\u0063\\u0065\\u0070\\u0074\\u0069\\u006F\\u006E");
    }

    @Test
    public void test00244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00244");
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper2 = org.apache.commons.lang3.text.translate.UnicodeEscaper.outsideOf(0, (int) 'a');
        java.io.Writer writer4 = null;
        boolean boolean5 = unicodeEscaper2.translate((int) '4', writer4);
        java.lang.String str7 = unicodeEscaper2.translate((java.lang.CharSequence) "\\u006Aa\\u0076a.\\u0069\\u006F.IOE\\u0078c\\u0065\\u0070\\u0074\\u0069\\u006F\\u006E: \\u006Aa\\u0076a.\\u0069\\u006F.IOE\\u0078c\\u0065\\u0070\\u0074\\u0069\\u006F\\u006E");
        java.io.Writer writer9 = null;
        boolean boolean10 = unicodeEscaper2.translate((int) '#', writer9);
        java.lang.CharSequence charSequence11 = null;
        java.io.Writer writer13 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int14 = unicodeEscaper2.translate(charSequence11, (int) (short) 0, writer13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(unicodeEscaper2);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\\\\u0075006Aa\\\\u00750076a.\\\\u00750069\\\\u0075006F.IOE\\\\u00750078\\u0063\\\\u00750065\\\\u00750070\\\\u00750074\\\\u00750069\\\\u0075006F\\\\u0075006E: \\\\u0075006Aa\\\\u00750076a.\\\\u00750069\\\\u0075006F.IOE\\\\u00750078\\u0063\\\\u00750065\\\\u00750070\\\\u00750074\\\\u00750069\\\\u0075006F\\\\u0075006E" + "'", str7, "\\\\u0075006Aa\\\\u00750076a.\\\\u00750069\\\\u0075006F.IOE\\\\u00750078\\u0063\\\\u00750065\\\\u00750070\\\\u00750074\\\\u00750069\\\\u0075006F\\\\u0075006E: \\\\u0075006Aa\\\\u00750076a.\\\\u00750069\\\\u0075006F.IOE\\\\u00750078\\u0063\\\\u00750065\\\\u00750070\\\\u00750074\\\\u00750069\\\\u0075006F\\\\u0075006E");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test00245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00245");
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper2 = org.apache.commons.lang3.text.translate.UnicodeEscaper.outsideOf((int) (short) -1, (int) (byte) -1);
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper4 = org.apache.commons.lang3.text.translate.UnicodeEscaper.above((int) 'a');
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper6 = org.apache.commons.lang3.text.translate.UnicodeEscaper.below((int) (byte) 0);
        java.io.Writer writer8 = null;
        boolean boolean9 = unicodeEscaper6.translate((int) ' ', writer8);
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper12 = org.apache.commons.lang3.text.translate.UnicodeEscaper.between((-1), (int) (short) 0);
        java.lang.String str14 = unicodeEscaper12.translate((java.lang.CharSequence) "0");
        org.apache.commons.lang3.text.translate.CharSequenceTranslator[] charSequenceTranslatorArray15 = new org.apache.commons.lang3.text.translate.CharSequenceTranslator[] {};
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator16 = unicodeEscaper12.with(charSequenceTranslatorArray15);
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator17 = unicodeEscaper6.with(charSequenceTranslatorArray15);
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator18 = unicodeEscaper4.with(charSequenceTranslatorArray15);
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper21 = org.apache.commons.lang3.text.translate.UnicodeEscaper.between((int) (byte) 1, (int) '#');
        java.io.Writer writer23 = null;
        boolean boolean24 = unicodeEscaper21.translate((int) '4', writer23);
        java.io.Writer writer26 = null;
        boolean boolean27 = unicodeEscaper21.translate((int) (byte) -1, writer26);
        java.io.Writer writer29 = null;
        boolean boolean30 = unicodeEscaper21.translate((int) (byte) -1, writer29);
        org.apache.commons.lang3.text.translate.CharSequenceTranslator[] charSequenceTranslatorArray31 = new org.apache.commons.lang3.text.translate.CharSequenceTranslator[] {};
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator32 = unicodeEscaper21.with(charSequenceTranslatorArray31);
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator33 = charSequenceTranslator18.with(charSequenceTranslatorArray31);
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator34 = unicodeEscaper2.with(charSequenceTranslatorArray31);
        java.io.Writer writer36 = null;
        // The following exception was thrown during execution in test generation
        try {
            unicodeEscaper2.translate((java.lang.CharSequence) "java.io.IOException: \\u0068\\u0069\\u0021", writer36);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Writer must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(unicodeEscaper2);
        org.junit.Assert.assertNotNull(unicodeEscaper4);
        org.junit.Assert.assertNotNull(unicodeEscaper6);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(unicodeEscaper12);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "0" + "'", str14, "0");
        org.junit.Assert.assertNotNull(charSequenceTranslatorArray15);
        org.junit.Assert.assertNotNull(charSequenceTranslator16);
        org.junit.Assert.assertNotNull(charSequenceTranslator17);
        org.junit.Assert.assertNotNull(charSequenceTranslator18);
        org.junit.Assert.assertNotNull(unicodeEscaper21);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNotNull(charSequenceTranslatorArray31);
        org.junit.Assert.assertNotNull(charSequenceTranslator32);
        org.junit.Assert.assertNotNull(charSequenceTranslator33);
        org.junit.Assert.assertNotNull(charSequenceTranslator34);
    }

    @Test
    public void test00246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00246");
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper2 = org.apache.commons.lang3.text.translate.UnicodeEscaper.outsideOf(0, (int) (byte) 1);
        java.io.Writer writer5 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int6 = unicodeEscaper2.translate((java.lang.CharSequence) "\\u0068\\u0069\\u0021", (int) (short) 10, writer5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(unicodeEscaper2);
    }

    @Test
    public void test00247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00247");
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper2 = org.apache.commons.lang3.text.translate.UnicodeEscaper.outsideOf((int) '4', (int) (short) 0);
        java.io.Writer writer4 = null;
        // The following exception was thrown during execution in test generation
        try {
            unicodeEscaper2.translate((java.lang.CharSequence) "j\\u0061v\\u0061\\u002Eio\\u002E\\u0049\\u004F\\u0045x\\u0063eption\\u003A\\u0020", writer4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Writer must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(unicodeEscaper2);
    }

    @Test
    public void test00248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00248");
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper0 = new org.apache.commons.lang3.text.translate.UnicodeEscaper();
        java.lang.String str2 = unicodeEscaper0.translate((java.lang.CharSequence) "hi!");
        java.io.Writer writer4 = null;
        boolean boolean5 = unicodeEscaper0.translate((int) (byte) -1, writer4);
        java.lang.String str7 = unicodeEscaper0.translate((java.lang.CharSequence) "");
        java.io.Writer writer9 = null;
        boolean boolean10 = unicodeEscaper0.translate((-1), writer9);
        java.io.Writer writer12 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean13 = unicodeEscaper0.translate((int) '4', writer12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\\u0068\\u0069\\u0021" + "'", str2, "\\u0068\\u0069\\u0021");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test00249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00249");
        java.io.IOException iOException1 = new java.io.IOException();
        java.io.IOException iOException2 = new java.io.IOException();
        iOException1.addSuppressed((java.lang.Throwable) iOException2);
        java.io.IOException iOException4 = new java.io.IOException("0", (java.lang.Throwable) iOException1);
        java.io.IOException iOException5 = new java.io.IOException((java.lang.Throwable) iOException4);
        java.io.IOException iOException6 = new java.io.IOException((java.lang.Throwable) iOException5);
        java.io.IOException iOException7 = new java.io.IOException();
        java.io.IOException iOException8 = new java.io.IOException();
        iOException7.addSuppressed((java.lang.Throwable) iOException8);
        java.io.IOException iOException10 = new java.io.IOException();
        java.io.IOException iOException11 = new java.io.IOException();
        iOException10.addSuppressed((java.lang.Throwable) iOException11);
        java.lang.Throwable[] throwableArray13 = iOException11.getSuppressed();
        java.io.IOException iOException14 = new java.io.IOException((java.lang.Throwable) iOException11);
        java.io.IOException iOException16 = new java.io.IOException("");
        java.io.IOException iOException17 = new java.io.IOException((java.lang.Throwable) iOException16);
        iOException11.addSuppressed((java.lang.Throwable) iOException17);
        iOException8.addSuppressed((java.lang.Throwable) iOException17);
        iOException6.addSuppressed((java.lang.Throwable) iOException17);
        java.lang.Class<?> wildcardClass21 = iOException17.getClass();
        org.junit.Assert.assertNotNull(throwableArray13);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test00250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00250");
        java.io.IOException iOException1 = new java.io.IOException("");
        java.lang.Throwable[] throwableArray2 = iOException1.getSuppressed();
        java.lang.String str3 = iOException1.toString();
        org.junit.Assert.assertNotNull(throwableArray2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "java.io.IOException: " + "'", str3, "java.io.IOException: ");
    }

    @Test
    public void test00251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00251");
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper1 = org.apache.commons.lang3.text.translate.UnicodeEscaper.above((int) (byte) 10);
        java.lang.String str3 = unicodeEscaper1.translate((java.lang.CharSequence) "\\u0036\\u0034");
        java.io.Writer writer5 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean6 = unicodeEscaper1.translate((int) ' ', writer5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(unicodeEscaper1);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\\u005C\\u0075\\u0030\\u0030\\u0033\\u0036\\u005C\\u0075\\u0030\\u0030\\u0033\\u0034" + "'", str3, "\\u005C\\u0075\\u0030\\u0030\\u0033\\u0036\\u005C\\u0075\\u0030\\u0030\\u0033\\u0034");
    }

    @Test
    public void test00252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00252");
        java.io.IOException iOException3 = new java.io.IOException();
        java.io.IOException iOException4 = new java.io.IOException();
        iOException3.addSuppressed((java.lang.Throwable) iOException4);
        java.io.IOException iOException6 = new java.io.IOException("0", (java.lang.Throwable) iOException3);
        java.io.IOException iOException7 = new java.io.IOException((java.lang.Throwable) iOException6);
        java.io.IOException iOException8 = new java.io.IOException((java.lang.Throwable) iOException7);
        java.io.IOException iOException9 = new java.io.IOException((java.lang.Throwable) iOException8);
        java.lang.Throwable[] throwableArray10 = iOException9.getSuppressed();
        java.io.IOException iOException11 = new java.io.IOException("java.io.IOException: java.io.IOException", (java.lang.Throwable) iOException9);
        java.io.IOException iOException12 = new java.io.IOException("\\u005Cu\\u0030\\u0030\\u0036\\u0038\\u005Cu\\u0030\\u0030\\u0036\\u0039\\u005Cu\\u0030\\u0030\\u0032\\u0031", (java.lang.Throwable) iOException9);
        java.lang.String str13 = iOException9.toString();
        org.junit.Assert.assertNotNull(throwableArray10);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "java.io.IOException: java.io.IOException: java.io.IOException: java.io.IOException: 0" + "'", str13, "java.io.IOException: java.io.IOException: java.io.IOException: java.io.IOException: 0");
    }

    @Test
    public void test00253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00253");
        java.io.IOException iOException1 = new java.io.IOException("hi!");
        java.lang.Throwable[] throwableArray2 = iOException1.getSuppressed();
        java.io.IOException iOException3 = new java.io.IOException((java.lang.Throwable) iOException1);
        java.lang.Class<?> wildcardClass4 = iOException3.getClass();
        org.junit.Assert.assertNotNull(throwableArray2);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test00254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00254");
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper2 = org.apache.commons.lang3.text.translate.UnicodeEscaper.outsideOf((int) (short) 10, (int) (byte) -1);
        java.io.Writer writer4 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean5 = unicodeEscaper2.translate((int) '4', writer4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(unicodeEscaper2);
    }

    @Test
    public void test00255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00255");
        java.io.IOException iOException2 = new java.io.IOException("0");
        java.lang.Throwable[] throwableArray3 = iOException2.getSuppressed();
        java.io.IOException iOException4 = new java.io.IOException("hi!", (java.lang.Throwable) iOException2);
        java.lang.Throwable[] throwableArray5 = iOException2.getSuppressed();
        java.lang.String str6 = iOException2.toString();
        org.junit.Assert.assertNotNull(throwableArray3);
        org.junit.Assert.assertNotNull(throwableArray5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "java.io.IOException: 0" + "'", str6, "java.io.IOException: 0");
    }

    @Test
    public void test00256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00256");
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper2 = org.apache.commons.lang3.text.translate.UnicodeEscaper.outsideOf((int) (short) 0, 1);
        java.lang.String str4 = unicodeEscaper2.translate((java.lang.CharSequence) "java.io.IOException: java.io.IOException: java.io.IOException: 0");
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper6 = org.apache.commons.lang3.text.translate.UnicodeEscaper.below((int) 'a');
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper9 = org.apache.commons.lang3.text.translate.UnicodeEscaper.between((int) (byte) 1, (int) '#');
        java.io.Writer writer11 = null;
        boolean boolean12 = unicodeEscaper9.translate((int) '4', writer11);
        java.io.Writer writer14 = null;
        boolean boolean15 = unicodeEscaper9.translate((int) (byte) -1, writer14);
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper18 = org.apache.commons.lang3.text.translate.UnicodeEscaper.between((int) (byte) 1, (int) '#');
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper20 = org.apache.commons.lang3.text.translate.UnicodeEscaper.below(100);
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper22 = org.apache.commons.lang3.text.translate.UnicodeEscaper.below((int) 'a');
        java.lang.String str24 = unicodeEscaper22.translate((java.lang.CharSequence) "java.io.IOException: java.io.IOException");
        org.apache.commons.lang3.text.translate.CharSequenceTranslator[] charSequenceTranslatorArray25 = new org.apache.commons.lang3.text.translate.CharSequenceTranslator[] { unicodeEscaper18, unicodeEscaper20, unicodeEscaper22 };
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator26 = unicodeEscaper9.with(charSequenceTranslatorArray25);
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper29 = org.apache.commons.lang3.text.translate.UnicodeEscaper.outsideOf(0, (int) 'a');
        java.io.Writer writer31 = null;
        boolean boolean32 = unicodeEscaper29.translate((int) (short) 10, writer31);
        java.lang.String str34 = unicodeEscaper29.translate((java.lang.CharSequence) "0");
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper37 = org.apache.commons.lang3.text.translate.UnicodeEscaper.between((int) (byte) 1, (int) '#');
        java.io.Writer writer39 = null;
        boolean boolean40 = unicodeEscaper37.translate((int) '4', writer39);
        java.io.Writer writer42 = null;
        boolean boolean43 = unicodeEscaper37.translate((int) (byte) -1, writer42);
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper46 = org.apache.commons.lang3.text.translate.UnicodeEscaper.between((int) (byte) 1, (int) '#');
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper48 = org.apache.commons.lang3.text.translate.UnicodeEscaper.below(100);
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper50 = org.apache.commons.lang3.text.translate.UnicodeEscaper.below((int) 'a');
        java.lang.String str52 = unicodeEscaper50.translate((java.lang.CharSequence) "java.io.IOException: java.io.IOException");
        org.apache.commons.lang3.text.translate.CharSequenceTranslator[] charSequenceTranslatorArray53 = new org.apache.commons.lang3.text.translate.CharSequenceTranslator[] { unicodeEscaper46, unicodeEscaper48, unicodeEscaper50 };
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator54 = unicodeEscaper37.with(charSequenceTranslatorArray53);
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator55 = unicodeEscaper29.with(charSequenceTranslatorArray53);
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator56 = unicodeEscaper9.with(charSequenceTranslatorArray53);
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator57 = unicodeEscaper6.with(charSequenceTranslatorArray53);
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator58 = unicodeEscaper2.with(charSequenceTranslatorArray53);
        java.io.Writer writer60 = null;
        // The following exception was thrown during execution in test generation
        try {
            charSequenceTranslator58.translate((java.lang.CharSequence) "\\u006A\\u0061\\u0076\\u0061\\u002E\\u0069\\u006F\\u002E\\u0049\\u004F\\u0045\\u0078\\u0063\\u0065\\u0070\\u0074\\u0069\\u006F\\u006E\\u003A\\u0020\\u006A\\u0061\\u0076\\u0061\\u002E\\u0069\\u006F\\u002E\\u0049\\u004F\\u0045\\u0078\\u0063\\u0065\\u0070\\u0074\\u0069\\u006F\\u006E\\u003A\\u0020\\u006A\\u0061\\u0076\\u0061\\u002E\\u0069\\u006F\\u002E\\u0049\\u004F\\u0045\\u0078\\u0063\\u0065\\u0070\\u0074\\u0069\\u006F\\u006E\\u003A\\u0020\\u0030", writer60);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Writer must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(unicodeEscaper2);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "\\u006A\\u0061\\u0076\\u0061\\u002E\\u0069\\u006F\\u002E\\u0049\\u004F\\u0045\\u0078\\u0063\\u0065\\u0070\\u0074\\u0069\\u006F\\u006E\\u003A\\u0020\\u006A\\u0061\\u0076\\u0061\\u002E\\u0069\\u006F\\u002E\\u0049\\u004F\\u0045\\u0078\\u0063\\u0065\\u0070\\u0074\\u0069\\u006F\\u006E\\u003A\\u0020\\u006A\\u0061\\u0076\\u0061\\u002E\\u0069\\u006F\\u002E\\u0049\\u004F\\u0045\\u0078\\u0063\\u0065\\u0070\\u0074\\u0069\\u006F\\u006E\\u003A\\u0020\\u0030" + "'", str4, "\\u006A\\u0061\\u0076\\u0061\\u002E\\u0069\\u006F\\u002E\\u0049\\u004F\\u0045\\u0078\\u0063\\u0065\\u0070\\u0074\\u0069\\u006F\\u006E\\u003A\\u0020\\u006A\\u0061\\u0076\\u0061\\u002E\\u0069\\u006F\\u002E\\u0049\\u004F\\u0045\\u0078\\u0063\\u0065\\u0070\\u0074\\u0069\\u006F\\u006E\\u003A\\u0020\\u006A\\u0061\\u0076\\u0061\\u002E\\u0069\\u006F\\u002E\\u0049\\u004F\\u0045\\u0078\\u0063\\u0065\\u0070\\u0074\\u0069\\u006F\\u006E\\u003A\\u0020\\u0030");
        org.junit.Assert.assertNotNull(unicodeEscaper6);
        org.junit.Assert.assertNotNull(unicodeEscaper9);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(unicodeEscaper18);
        org.junit.Assert.assertNotNull(unicodeEscaper20);
        org.junit.Assert.assertNotNull(unicodeEscaper22);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "java\\u002Eio\\u002E\\u0049\\u004F\\u0045xception\\u003A\\u0020java\\u002Eio\\u002E\\u0049\\u004F\\u0045xception" + "'", str24, "java\\u002Eio\\u002E\\u0049\\u004F\\u0045xception\\u003A\\u0020java\\u002Eio\\u002E\\u0049\\u004F\\u0045xception");
        org.junit.Assert.assertNotNull(charSequenceTranslatorArray25);
        org.junit.Assert.assertNotNull(charSequenceTranslator26);
        org.junit.Assert.assertNotNull(unicodeEscaper29);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "0" + "'", str34, "0");
        org.junit.Assert.assertNotNull(unicodeEscaper37);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertNotNull(unicodeEscaper46);
        org.junit.Assert.assertNotNull(unicodeEscaper48);
        org.junit.Assert.assertNotNull(unicodeEscaper50);
        org.junit.Assert.assertEquals("'" + str52 + "' != '" + "java\\u002Eio\\u002E\\u0049\\u004F\\u0045xception\\u003A\\u0020java\\u002Eio\\u002E\\u0049\\u004F\\u0045xception" + "'", str52, "java\\u002Eio\\u002E\\u0049\\u004F\\u0045xception\\u003A\\u0020java\\u002Eio\\u002E\\u0049\\u004F\\u0045xception");
        org.junit.Assert.assertNotNull(charSequenceTranslatorArray53);
        org.junit.Assert.assertNotNull(charSequenceTranslator54);
        org.junit.Assert.assertNotNull(charSequenceTranslator55);
        org.junit.Assert.assertNotNull(charSequenceTranslator56);
        org.junit.Assert.assertNotNull(charSequenceTranslator57);
        org.junit.Assert.assertNotNull(charSequenceTranslator58);
    }

    @Test
    public void test00257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00257");
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper2 = org.apache.commons.lang3.text.translate.UnicodeEscaper.outsideOf((int) ' ', 1);
        java.lang.Class<?> wildcardClass3 = unicodeEscaper2.getClass();
        org.junit.Assert.assertNotNull(unicodeEscaper2);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test00258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00258");
        java.io.IOException iOException2 = new java.io.IOException();
        java.io.IOException iOException3 = new java.io.IOException();
        iOException2.addSuppressed((java.lang.Throwable) iOException3);
        java.io.IOException iOException5 = new java.io.IOException("0", (java.lang.Throwable) iOException2);
        java.io.IOException iOException6 = new java.io.IOException((java.lang.Throwable) iOException5);
        java.io.IOException iOException7 = new java.io.IOException((java.lang.Throwable) iOException6);
        java.io.IOException iOException8 = new java.io.IOException((java.lang.Throwable) iOException7);
        java.lang.Throwable[] throwableArray9 = iOException8.getSuppressed();
        java.io.IOException iOException10 = new java.io.IOException("java.io.IOException: java.io.IOException", (java.lang.Throwable) iOException8);
        java.io.IOException iOException11 = new java.io.IOException((java.lang.Throwable) iOException10);
        java.io.IOException iOException15 = new java.io.IOException("0");
        java.lang.Throwable[] throwableArray16 = iOException15.getSuppressed();
        java.io.IOException iOException17 = new java.io.IOException("hi!", (java.lang.Throwable) iOException15);
        java.io.IOException iOException18 = new java.io.IOException("java.io.IOException", (java.lang.Throwable) iOException15);
        iOException10.addSuppressed((java.lang.Throwable) iOException18);
        java.lang.String str20 = iOException18.toString();
        org.junit.Assert.assertNotNull(throwableArray9);
        org.junit.Assert.assertNotNull(throwableArray16);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "java.io.IOException: java.io.IOException" + "'", str20, "java.io.IOException: java.io.IOException");
    }

    @Test
    public void test00259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00259");
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper2 = org.apache.commons.lang3.text.translate.UnicodeEscaper.outsideOf((int) (short) -1, (int) (short) 100);
        java.io.Writer writer4 = null;
        boolean boolean5 = unicodeEscaper2.translate((int) '4', writer4);
        java.io.Writer writer7 = null;
        boolean boolean8 = unicodeEscaper2.translate((int) (short) 0, writer7);
        java.lang.Class<?> wildcardClass9 = unicodeEscaper2.getClass();
        org.junit.Assert.assertNotNull(unicodeEscaper2);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test00260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00260");
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper2 = org.apache.commons.lang3.text.translate.UnicodeEscaper.between((int) (short) 1, (int) (short) 100);
        java.io.Writer writer4 = null;
        // The following exception was thrown during execution in test generation
        try {
            unicodeEscaper2.translate((java.lang.CharSequence) "java.io.IOException: ", writer4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Writer must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(unicodeEscaper2);
    }

    @Test
    public void test00261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00261");
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper2 = org.apache.commons.lang3.text.translate.UnicodeEscaper.outsideOf((int) 'a', (int) (byte) 1);
        java.io.Writer writer4 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean5 = unicodeEscaper2.translate((int) '#', writer4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(unicodeEscaper2);
    }

    @Test
    public void test00262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00262");
        java.io.IOException iOException2 = new java.io.IOException("0");
        java.lang.Throwable[] throwableArray3 = iOException2.getSuppressed();
        java.io.IOException iOException4 = new java.io.IOException("hi!", (java.lang.Throwable) iOException2);
        java.lang.Throwable[] throwableArray5 = iOException2.getSuppressed();
        java.lang.Throwable[] throwableArray6 = iOException2.getSuppressed();
        java.lang.Class<?> wildcardClass7 = iOException2.getClass();
        org.junit.Assert.assertNotNull(throwableArray3);
        org.junit.Assert.assertNotNull(throwableArray5);
        org.junit.Assert.assertNotNull(throwableArray6);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test00263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00263");
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper2 = org.apache.commons.lang3.text.translate.UnicodeEscaper.outsideOf((int) (short) 0, 1);
        java.io.Writer writer5 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int6 = unicodeEscaper2.translate((java.lang.CharSequence) "java.io.IOException", (int) (short) 1, writer5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(unicodeEscaper2);
    }

    @Test
    public void test00264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00264");
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper1 = org.apache.commons.lang3.text.translate.UnicodeEscaper.above((int) 'a');
        java.io.Writer writer3 = null;
        boolean boolean4 = unicodeEscaper1.translate((int) 'a', writer3);
        java.lang.Class<?> wildcardClass5 = unicodeEscaper1.getClass();
        org.junit.Assert.assertNotNull(unicodeEscaper1);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test00265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00265");
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper1 = org.apache.commons.lang3.text.translate.UnicodeEscaper.below(0);
        java.io.Writer writer3 = null;
        // The following exception was thrown during execution in test generation
        try {
            unicodeEscaper1.translate((java.lang.CharSequence) "\\u006A\\u0061\\u0076\\u0061\\u002E\\u0069\\u006F\\u002E\\u0049\\u004F\\u0045\\u0078\\u0063\\u0065\\u0070\\u0074\\u0069\\u006F\\u006E\\u003A\\u0020", writer3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Writer must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(unicodeEscaper1);
    }

    @Test
    public void test00266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00266");
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper2 = org.apache.commons.lang3.text.translate.UnicodeEscaper.between((int) (byte) -1, (int) (short) 0);
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper5 = org.apache.commons.lang3.text.translate.UnicodeEscaper.between((int) (byte) 1, (int) '#');
        java.io.Writer writer7 = null;
        boolean boolean8 = unicodeEscaper5.translate((int) '4', writer7);
        java.io.Writer writer10 = null;
        boolean boolean11 = unicodeEscaper5.translate((int) (byte) -1, writer10);
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper14 = org.apache.commons.lang3.text.translate.UnicodeEscaper.between((int) (byte) 1, (int) '#');
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper16 = org.apache.commons.lang3.text.translate.UnicodeEscaper.below(100);
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper18 = org.apache.commons.lang3.text.translate.UnicodeEscaper.below((int) 'a');
        java.lang.String str20 = unicodeEscaper18.translate((java.lang.CharSequence) "java.io.IOException: java.io.IOException");
        org.apache.commons.lang3.text.translate.CharSequenceTranslator[] charSequenceTranslatorArray21 = new org.apache.commons.lang3.text.translate.CharSequenceTranslator[] { unicodeEscaper14, unicodeEscaper16, unicodeEscaper18 };
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator22 = unicodeEscaper5.with(charSequenceTranslatorArray21);
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator23 = unicodeEscaper2.with(charSequenceTranslatorArray21);
        java.io.Writer writer25 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean26 = unicodeEscaper2.translate((int) (byte) 0, writer25);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(unicodeEscaper2);
        org.junit.Assert.assertNotNull(unicodeEscaper5);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(unicodeEscaper14);
        org.junit.Assert.assertNotNull(unicodeEscaper16);
        org.junit.Assert.assertNotNull(unicodeEscaper18);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "java\\u002Eio\\u002E\\u0049\\u004F\\u0045xception\\u003A\\u0020java\\u002Eio\\u002E\\u0049\\u004F\\u0045xception" + "'", str20, "java\\u002Eio\\u002E\\u0049\\u004F\\u0045xception\\u003A\\u0020java\\u002Eio\\u002E\\u0049\\u004F\\u0045xception");
        org.junit.Assert.assertNotNull(charSequenceTranslatorArray21);
        org.junit.Assert.assertNotNull(charSequenceTranslator22);
        org.junit.Assert.assertNotNull(charSequenceTranslator23);
    }

    @Test
    public void test00267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00267");
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper2 = org.apache.commons.lang3.text.translate.UnicodeEscaper.between((int) (byte) -1, (int) ' ');
        java.lang.Class<?> wildcardClass3 = unicodeEscaper2.getClass();
        org.junit.Assert.assertNotNull(unicodeEscaper2);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test00268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00268");
        java.io.IOException iOException1 = new java.io.IOException();
        java.io.IOException iOException2 = new java.io.IOException();
        iOException1.addSuppressed((java.lang.Throwable) iOException2);
        java.io.IOException iOException4 = new java.io.IOException("0", (java.lang.Throwable) iOException1);
        java.io.IOException iOException5 = new java.io.IOException((java.lang.Throwable) iOException4);
        java.io.IOException iOException6 = new java.io.IOException((java.lang.Throwable) iOException4);
        java.lang.Throwable[] throwableArray7 = iOException4.getSuppressed();
        java.lang.String str8 = iOException4.toString();
        org.junit.Assert.assertNotNull(throwableArray7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "java.io.IOException: 0" + "'", str8, "java.io.IOException: 0");
    }

    @Test
    public void test00269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00269");
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper1 = org.apache.commons.lang3.text.translate.UnicodeEscaper.above((int) (byte) 10);
        java.io.Writer writer3 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean4 = unicodeEscaper1.translate((int) '4', writer3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(unicodeEscaper1);
    }

    @Test
    public void test00270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00270");
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper2 = org.apache.commons.lang3.text.translate.UnicodeEscaper.outsideOf((-1), (int) (short) 100);
        java.io.Writer writer4 = null;
        // The following exception was thrown during execution in test generation
        try {
            unicodeEscaper2.translate((java.lang.CharSequence) "java.io.IOException: java.io.IOException: ", writer4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Writer must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(unicodeEscaper2);
    }

    @Test
    public void test00271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00271");
        java.io.IOException iOException3 = new java.io.IOException("");
        java.io.IOException iOException4 = new java.io.IOException("A", (java.lang.Throwable) iOException3);
        java.lang.Throwable[] throwableArray5 = iOException3.getSuppressed();
        java.io.IOException iOException6 = new java.io.IOException("java\\u002Eio\\u002E\\u0049\\u004F\\u0045xception\\u003A\\u0020java\\u002Eio\\u002E\\u0049\\u004F\\u0045xception", (java.lang.Throwable) iOException3);
        java.lang.Throwable throwable7 = null;
        // The following exception was thrown during execution in test generation
        try {
            iOException3.addSuppressed(throwable7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot suppress a null exception.");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(throwableArray5);
    }

    @Test
    public void test00272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00272");
        java.lang.String str1 = org.apache.commons.lang3.text.translate.CharSequenceTranslator.hex((int) ' ');
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "20" + "'", str1, "20");
    }

    @Test
    public void test00273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00273");
        java.io.IOException iOException0 = new java.io.IOException();
        java.io.IOException iOException1 = new java.io.IOException();
        iOException0.addSuppressed((java.lang.Throwable) iOException1);
        java.io.IOException iOException3 = new java.io.IOException();
        java.io.IOException iOException4 = new java.io.IOException();
        iOException3.addSuppressed((java.lang.Throwable) iOException4);
        java.lang.Throwable[] throwableArray6 = iOException4.getSuppressed();
        java.io.IOException iOException7 = new java.io.IOException((java.lang.Throwable) iOException4);
        java.io.IOException iOException9 = new java.io.IOException("");
        java.io.IOException iOException10 = new java.io.IOException((java.lang.Throwable) iOException9);
        iOException4.addSuppressed((java.lang.Throwable) iOException10);
        iOException1.addSuppressed((java.lang.Throwable) iOException10);
        java.lang.Throwable[] throwableArray13 = iOException1.getSuppressed();
        java.lang.Throwable[] throwableArray14 = iOException1.getSuppressed();
        java.lang.Throwable[] throwableArray15 = iOException1.getSuppressed();
        java.io.IOException iOException17 = new java.io.IOException("0");
        java.io.IOException iOException18 = new java.io.IOException((java.lang.Throwable) iOException17);
        iOException1.addSuppressed((java.lang.Throwable) iOException17);
        java.lang.Class<?> wildcardClass20 = iOException17.getClass();
        org.junit.Assert.assertNotNull(throwableArray6);
        org.junit.Assert.assertNotNull(throwableArray13);
        org.junit.Assert.assertNotNull(throwableArray14);
        org.junit.Assert.assertNotNull(throwableArray15);
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test00274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00274");
        java.io.IOException iOException1 = new java.io.IOException();
        java.io.IOException iOException2 = new java.io.IOException();
        iOException1.addSuppressed((java.lang.Throwable) iOException2);
        java.io.IOException iOException4 = new java.io.IOException("0", (java.lang.Throwable) iOException1);
        java.io.IOException iOException5 = new java.io.IOException((java.lang.Throwable) iOException4);
        java.io.IOException iOException6 = new java.io.IOException((java.lang.Throwable) iOException4);
        java.lang.Throwable[] throwableArray7 = iOException4.getSuppressed();
        java.lang.Class<?> wildcardClass8 = iOException4.getClass();
        org.junit.Assert.assertNotNull(throwableArray7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test00275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00275");
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper2 = org.apache.commons.lang3.text.translate.UnicodeEscaper.between((-1), (int) (byte) -1);
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper5 = org.apache.commons.lang3.text.translate.UnicodeEscaper.outsideOf((int) '4', (int) (short) 0);
        org.apache.commons.lang3.text.translate.CharSequenceTranslator[] charSequenceTranslatorArray6 = new org.apache.commons.lang3.text.translate.CharSequenceTranslator[] { unicodeEscaper5 };
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator7 = unicodeEscaper2.with(charSequenceTranslatorArray6);
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper10 = org.apache.commons.lang3.text.translate.UnicodeEscaper.outsideOf(0, (int) 'a');
        java.io.Writer writer12 = null;
        boolean boolean13 = unicodeEscaper10.translate((int) (short) 10, writer12);
        java.lang.String str15 = unicodeEscaper10.translate((java.lang.CharSequence) "0");
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper18 = org.apache.commons.lang3.text.translate.UnicodeEscaper.between((int) (byte) 1, (int) '#');
        java.io.Writer writer20 = null;
        boolean boolean21 = unicodeEscaper18.translate((int) '4', writer20);
        java.io.Writer writer23 = null;
        boolean boolean24 = unicodeEscaper18.translate((int) (byte) -1, writer23);
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper27 = org.apache.commons.lang3.text.translate.UnicodeEscaper.between((int) (byte) 1, (int) '#');
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper29 = org.apache.commons.lang3.text.translate.UnicodeEscaper.below(100);
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper31 = org.apache.commons.lang3.text.translate.UnicodeEscaper.below((int) 'a');
        java.lang.String str33 = unicodeEscaper31.translate((java.lang.CharSequence) "java.io.IOException: java.io.IOException");
        org.apache.commons.lang3.text.translate.CharSequenceTranslator[] charSequenceTranslatorArray34 = new org.apache.commons.lang3.text.translate.CharSequenceTranslator[] { unicodeEscaper27, unicodeEscaper29, unicodeEscaper31 };
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator35 = unicodeEscaper18.with(charSequenceTranslatorArray34);
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator36 = unicodeEscaper10.with(charSequenceTranslatorArray34);
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator37 = unicodeEscaper2.with(charSequenceTranslatorArray34);
        java.io.Writer writer39 = null;
        // The following exception was thrown during execution in test generation
        try {
            unicodeEscaper2.translate((java.lang.CharSequence) "java.io.IOException: ", writer39);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Writer must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(unicodeEscaper2);
        org.junit.Assert.assertNotNull(unicodeEscaper5);
        org.junit.Assert.assertNotNull(charSequenceTranslatorArray6);
        org.junit.Assert.assertNotNull(charSequenceTranslator7);
        org.junit.Assert.assertNotNull(unicodeEscaper10);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "0" + "'", str15, "0");
        org.junit.Assert.assertNotNull(unicodeEscaper18);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(unicodeEscaper27);
        org.junit.Assert.assertNotNull(unicodeEscaper29);
        org.junit.Assert.assertNotNull(unicodeEscaper31);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "java\\u002Eio\\u002E\\u0049\\u004F\\u0045xception\\u003A\\u0020java\\u002Eio\\u002E\\u0049\\u004F\\u0045xception" + "'", str33, "java\\u002Eio\\u002E\\u0049\\u004F\\u0045xception\\u003A\\u0020java\\u002Eio\\u002E\\u0049\\u004F\\u0045xception");
        org.junit.Assert.assertNotNull(charSequenceTranslatorArray34);
        org.junit.Assert.assertNotNull(charSequenceTranslator35);
        org.junit.Assert.assertNotNull(charSequenceTranslator36);
        org.junit.Assert.assertNotNull(charSequenceTranslator37);
    }

    @Test
    public void test00276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00276");
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper2 = org.apache.commons.lang3.text.translate.UnicodeEscaper.outsideOf((int) '#', (int) '4');
        java.io.Writer writer4 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean5 = unicodeEscaper2.translate((int) (byte) 0, writer4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(unicodeEscaper2);
    }

    @Test
    public void test00277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00277");
        java.io.IOException iOException1 = new java.io.IOException();
        java.io.IOException iOException2 = new java.io.IOException();
        iOException1.addSuppressed((java.lang.Throwable) iOException2);
        java.lang.Throwable[] throwableArray4 = iOException2.getSuppressed();
        java.io.IOException iOException5 = new java.io.IOException((java.lang.Throwable) iOException2);
        java.io.IOException iOException7 = new java.io.IOException("");
        java.io.IOException iOException8 = new java.io.IOException((java.lang.Throwable) iOException7);
        iOException2.addSuppressed((java.lang.Throwable) iOException8);
        java.lang.Throwable[] throwableArray10 = iOException2.getSuppressed();
        java.lang.Throwable[] throwableArray11 = iOException2.getSuppressed();
        java.io.IOException iOException12 = new java.io.IOException("java.io.IOException: java.io.IOException", (java.lang.Throwable) iOException2);
        java.lang.Throwable throwable13 = null;
        // The following exception was thrown during execution in test generation
        try {
            iOException2.addSuppressed(throwable13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot suppress a null exception.");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(throwableArray4);
        org.junit.Assert.assertNotNull(throwableArray10);
        org.junit.Assert.assertNotNull(throwableArray11);
    }

    @Test
    public void test00278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00278");
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper2 = org.apache.commons.lang3.text.translate.UnicodeEscaper.between((-1), (int) (short) 0);
        java.io.Writer writer5 = null;
        int int6 = unicodeEscaper2.translate((java.lang.CharSequence) "23", (int) (short) 0, writer5);
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper8 = org.apache.commons.lang3.text.translate.UnicodeEscaper.above((int) 'a');
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper10 = org.apache.commons.lang3.text.translate.UnicodeEscaper.below((int) (byte) 0);
        java.io.Writer writer12 = null;
        boolean boolean13 = unicodeEscaper10.translate((int) ' ', writer12);
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper16 = org.apache.commons.lang3.text.translate.UnicodeEscaper.between((-1), (int) (short) 0);
        java.lang.String str18 = unicodeEscaper16.translate((java.lang.CharSequence) "0");
        org.apache.commons.lang3.text.translate.CharSequenceTranslator[] charSequenceTranslatorArray19 = new org.apache.commons.lang3.text.translate.CharSequenceTranslator[] {};
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator20 = unicodeEscaper16.with(charSequenceTranslatorArray19);
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator21 = unicodeEscaper10.with(charSequenceTranslatorArray19);
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator22 = unicodeEscaper8.with(charSequenceTranslatorArray19);
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator23 = unicodeEscaper2.with(charSequenceTranslatorArray19);
        java.lang.CharSequence charSequence24 = null;
        java.io.Writer writer26 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int27 = unicodeEscaper2.translate(charSequence24, (int) (short) 0, writer26);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(unicodeEscaper2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(unicodeEscaper8);
        org.junit.Assert.assertNotNull(unicodeEscaper10);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(unicodeEscaper16);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "0" + "'", str18, "0");
        org.junit.Assert.assertNotNull(charSequenceTranslatorArray19);
        org.junit.Assert.assertNotNull(charSequenceTranslator20);
        org.junit.Assert.assertNotNull(charSequenceTranslator21);
        org.junit.Assert.assertNotNull(charSequenceTranslator22);
        org.junit.Assert.assertNotNull(charSequenceTranslator23);
    }

    @Test
    public void test00279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00279");
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper2 = org.apache.commons.lang3.text.translate.UnicodeEscaper.outsideOf(0, 10);
        java.lang.String str4 = unicodeEscaper2.translate((java.lang.CharSequence) "hi!");
        java.io.Writer writer7 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int8 = unicodeEscaper2.translate((java.lang.CharSequence) "java.io.IOException", (int) '#', writer7);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 35");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(unicodeEscaper2);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "\\u0068\\u0069\\u0021" + "'", str4, "\\u0068\\u0069\\u0021");
    }

    @Test
    public void test00280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00280");
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper0 = new org.apache.commons.lang3.text.translate.UnicodeEscaper();
        java.lang.String str2 = unicodeEscaper0.translate((java.lang.CharSequence) "hi!");
        java.io.Writer writer4 = null;
        boolean boolean5 = unicodeEscaper0.translate((int) (byte) -1, writer4);
        java.io.Writer writer7 = null;
        boolean boolean8 = unicodeEscaper0.translate((int) (byte) -1, writer7);
        java.io.Writer writer11 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int12 = unicodeEscaper0.translate((java.lang.CharSequence) "A", (int) ' ', writer11);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 32");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\\u0068\\u0069\\u0021" + "'", str2, "\\u0068\\u0069\\u0021");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test00281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00281");
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper2 = org.apache.commons.lang3.text.translate.UnicodeEscaper.outsideOf((-1), (int) (byte) -1);
        java.io.Writer writer4 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean5 = unicodeEscaper2.translate((int) (byte) 100, writer4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(unicodeEscaper2);
    }

    @Test
    public void test00282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00282");
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper2 = org.apache.commons.lang3.text.translate.UnicodeEscaper.outsideOf((int) (byte) 100, (int) (byte) 10);
        java.lang.String str4 = unicodeEscaper2.translate((java.lang.CharSequence) "hi!");
        java.io.Writer writer6 = null;
        // The following exception was thrown during execution in test generation
        try {
            unicodeEscaper2.translate((java.lang.CharSequence) "java.io.IOException", writer6);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Writer must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(unicodeEscaper2);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "\\u0068\\u0069\\u0021" + "'", str4, "\\u0068\\u0069\\u0021");
    }

    @Test
    public void test00283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00283");
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper2 = org.apache.commons.lang3.text.translate.UnicodeEscaper.between(100, (int) (short) 10);
        java.io.Writer writer4 = null;
        // The following exception was thrown during execution in test generation
        try {
            unicodeEscaper2.translate((java.lang.CharSequence) "java.io.IOException: java.io.IOException: java.io.IOException", writer4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Writer must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(unicodeEscaper2);
    }

    @Test
    public void test00284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00284");
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper2 = org.apache.commons.lang3.text.translate.UnicodeEscaper.between((int) (short) 100, (int) (short) 0);
        java.io.Writer writer4 = null;
        // The following exception was thrown during execution in test generation
        try {
            unicodeEscaper2.translate((java.lang.CharSequence) "", writer4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Writer must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(unicodeEscaper2);
    }

    @Test
    public void test00285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00285");
        java.io.IOException iOException0 = new java.io.IOException();
        java.io.IOException iOException1 = new java.io.IOException();
        iOException0.addSuppressed((java.lang.Throwable) iOException1);
        java.io.IOException iOException3 = new java.io.IOException();
        java.io.IOException iOException4 = new java.io.IOException();
        iOException3.addSuppressed((java.lang.Throwable) iOException4);
        java.lang.Throwable[] throwableArray6 = iOException4.getSuppressed();
        java.io.IOException iOException7 = new java.io.IOException((java.lang.Throwable) iOException4);
        java.io.IOException iOException9 = new java.io.IOException("");
        java.io.IOException iOException10 = new java.io.IOException((java.lang.Throwable) iOException9);
        iOException4.addSuppressed((java.lang.Throwable) iOException10);
        iOException1.addSuppressed((java.lang.Throwable) iOException10);
        java.lang.Throwable[] throwableArray13 = iOException1.getSuppressed();
        java.lang.Throwable[] throwableArray14 = iOException1.getSuppressed();
        java.lang.Throwable[] throwableArray15 = iOException1.getSuppressed();
        java.io.IOException iOException16 = new java.io.IOException((java.lang.Throwable) iOException1);
        java.lang.Class<?> wildcardClass17 = iOException16.getClass();
        org.junit.Assert.assertNotNull(throwableArray6);
        org.junit.Assert.assertNotNull(throwableArray13);
        org.junit.Assert.assertNotNull(throwableArray14);
        org.junit.Assert.assertNotNull(throwableArray15);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test00286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00286");
        java.io.IOException iOException0 = new java.io.IOException();
        java.io.IOException iOException1 = new java.io.IOException();
        iOException0.addSuppressed((java.lang.Throwable) iOException1);
        java.lang.Throwable[] throwableArray3 = iOException1.getSuppressed();
        java.io.IOException iOException4 = new java.io.IOException((java.lang.Throwable) iOException1);
        java.io.IOException iOException6 = new java.io.IOException("");
        java.io.IOException iOException7 = new java.io.IOException((java.lang.Throwable) iOException6);
        iOException1.addSuppressed((java.lang.Throwable) iOException7);
        java.lang.Throwable[] throwableArray9 = iOException1.getSuppressed();
        java.io.IOException iOException10 = new java.io.IOException();
        java.io.IOException iOException11 = new java.io.IOException();
        iOException10.addSuppressed((java.lang.Throwable) iOException11);
        java.lang.Throwable[] throwableArray13 = iOException11.getSuppressed();
        java.io.IOException iOException14 = new java.io.IOException((java.lang.Throwable) iOException11);
        iOException1.addSuppressed((java.lang.Throwable) iOException11);
        java.lang.String str16 = iOException11.toString();
        org.junit.Assert.assertNotNull(throwableArray3);
        org.junit.Assert.assertNotNull(throwableArray9);
        org.junit.Assert.assertNotNull(throwableArray13);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "java.io.IOException" + "'", str16, "java.io.IOException");
    }

    @Test
    public void test00287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00287");
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper2 = org.apache.commons.lang3.text.translate.UnicodeEscaper.outsideOf((int) (short) 1, (int) (byte) -1);
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper5 = org.apache.commons.lang3.text.translate.UnicodeEscaper.outsideOf((int) (short) 1, (int) (byte) -1);
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper8 = org.apache.commons.lang3.text.translate.UnicodeEscaper.outsideOf(0, (int) 'a');
        java.io.Writer writer10 = null;
        boolean boolean11 = unicodeEscaper8.translate((int) (short) 10, writer10);
        java.lang.String str13 = unicodeEscaper8.translate((java.lang.CharSequence) "0");
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper16 = org.apache.commons.lang3.text.translate.UnicodeEscaper.between((int) (byte) 1, (int) '#');
        java.io.Writer writer18 = null;
        boolean boolean19 = unicodeEscaper16.translate((int) '4', writer18);
        java.io.Writer writer21 = null;
        boolean boolean22 = unicodeEscaper16.translate((int) (byte) -1, writer21);
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper25 = org.apache.commons.lang3.text.translate.UnicodeEscaper.between((int) (byte) 1, (int) '#');
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper27 = org.apache.commons.lang3.text.translate.UnicodeEscaper.below(100);
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper29 = org.apache.commons.lang3.text.translate.UnicodeEscaper.below((int) 'a');
        java.lang.String str31 = unicodeEscaper29.translate((java.lang.CharSequence) "java.io.IOException: java.io.IOException");
        org.apache.commons.lang3.text.translate.CharSequenceTranslator[] charSequenceTranslatorArray32 = new org.apache.commons.lang3.text.translate.CharSequenceTranslator[] { unicodeEscaper25, unicodeEscaper27, unicodeEscaper29 };
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator33 = unicodeEscaper16.with(charSequenceTranslatorArray32);
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator34 = unicodeEscaper8.with(charSequenceTranslatorArray32);
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator35 = unicodeEscaper5.with(charSequenceTranslatorArray32);
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator36 = unicodeEscaper2.with(charSequenceTranslatorArray32);
        java.io.Writer writer38 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean39 = unicodeEscaper2.translate(1, writer38);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(unicodeEscaper2);
        org.junit.Assert.assertNotNull(unicodeEscaper5);
        org.junit.Assert.assertNotNull(unicodeEscaper8);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "0" + "'", str13, "0");
        org.junit.Assert.assertNotNull(unicodeEscaper16);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(unicodeEscaper25);
        org.junit.Assert.assertNotNull(unicodeEscaper27);
        org.junit.Assert.assertNotNull(unicodeEscaper29);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "java\\u002Eio\\u002E\\u0049\\u004F\\u0045xception\\u003A\\u0020java\\u002Eio\\u002E\\u0049\\u004F\\u0045xception" + "'", str31, "java\\u002Eio\\u002E\\u0049\\u004F\\u0045xception\\u003A\\u0020java\\u002Eio\\u002E\\u0049\\u004F\\u0045xception");
        org.junit.Assert.assertNotNull(charSequenceTranslatorArray32);
        org.junit.Assert.assertNotNull(charSequenceTranslator33);
        org.junit.Assert.assertNotNull(charSequenceTranslator34);
        org.junit.Assert.assertNotNull(charSequenceTranslator35);
        org.junit.Assert.assertNotNull(charSequenceTranslator36);
    }

    @Test
    public void test00288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00288");
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper2 = org.apache.commons.lang3.text.translate.UnicodeEscaper.outsideOf((int) ' ', (int) (short) 0);
        java.io.Writer writer4 = null;
        // The following exception was thrown during execution in test generation
        try {
            unicodeEscaper2.translate((java.lang.CharSequence) "A", writer4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Writer must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(unicodeEscaper2);
    }

    @Test
    public void test00289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00289");
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper1 = org.apache.commons.lang3.text.translate.UnicodeEscaper.above((int) (short) 100);
        java.io.Writer writer3 = null;
        boolean boolean4 = unicodeEscaper1.translate(0, writer3);
        java.lang.String str6 = unicodeEscaper1.translate((java.lang.CharSequence) "java.io.IOException: java.io.IOException");
        java.io.Writer writer9 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int10 = unicodeEscaper1.translate((java.lang.CharSequence) "1", 10, writer9);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 10");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(unicodeEscaper1);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "\\u006Aa\\u0076a.\\u0069\\u006F.IOE\\u0078c\\u0065\\u0070\\u0074\\u0069\\u006F\\u006E: \\u006Aa\\u0076a.\\u0069\\u006F.IOE\\u0078c\\u0065\\u0070\\u0074\\u0069\\u006F\\u006E" + "'", str6, "\\u006Aa\\u0076a.\\u0069\\u006F.IOE\\u0078c\\u0065\\u0070\\u0074\\u0069\\u006F\\u006E: \\u006Aa\\u0076a.\\u0069\\u006F.IOE\\u0078c\\u0065\\u0070\\u0074\\u0069\\u006F\\u006E");
    }

    @Test
    public void test00290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00290");
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper2 = org.apache.commons.lang3.text.translate.UnicodeEscaper.outsideOf((int) (short) 10, (int) ' ');
        java.io.Writer writer4 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean5 = unicodeEscaper2.translate((int) (byte) 1, writer4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(unicodeEscaper2);
    }

    @Test
    public void test00291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00291");
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper2 = org.apache.commons.lang3.text.translate.UnicodeEscaper.between((int) (byte) 1, (int) '#');
        java.io.Writer writer4 = null;
        boolean boolean5 = unicodeEscaper2.translate((int) '4', writer4);
        java.io.Writer writer7 = null;
        boolean boolean8 = unicodeEscaper2.translate((int) (byte) -1, writer7);
        java.io.Writer writer11 = null;
        int int12 = unicodeEscaper2.translate((java.lang.CharSequence) "java\\u002Eio\\u002E\\u0049\\u004F\\u0045xception\\u003A\\u0020java\\u002Eio\\u002E\\u0049\\u004F\\u0045xception", 1, writer11);
        java.io.Writer writer15 = null;
        int int16 = unicodeEscaper2.translate((java.lang.CharSequence) "java.io.IOException: hi!", 0, writer15);
        java.io.Writer writer18 = null;
        // The following exception was thrown during execution in test generation
        try {
            unicodeEscaper2.translate((java.lang.CharSequence) "java.io.IOException: java.io.IOException: ", writer18);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Writer must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(unicodeEscaper2);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
    }

    @Test
    public void test00292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00292");
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper2 = org.apache.commons.lang3.text.translate.UnicodeEscaper.between((int) (byte) -1, (int) ' ');
        java.io.Writer writer4 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean5 = unicodeEscaper2.translate(0, writer4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(unicodeEscaper2);
    }

    @Test
    public void test00293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00293");
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper0 = new org.apache.commons.lang3.text.translate.UnicodeEscaper();
        java.lang.String str2 = unicodeEscaper0.translate((java.lang.CharSequence) "hi!");
        java.io.Writer writer4 = null;
        boolean boolean5 = unicodeEscaper0.translate((int) (byte) -1, writer4);
        java.lang.String str7 = unicodeEscaper0.translate((java.lang.CharSequence) "");
        java.lang.String str9 = unicodeEscaper0.translate((java.lang.CharSequence) "java\\u002Eio\\u002E\\u0049\\u004F\\u0045xception\\u003A\\u0020java\\u002Eio\\u002E\\u0049\\u004F\\u0045xception");
        java.io.Writer writer11 = null;
        // The following exception was thrown during execution in test generation
        try {
            unicodeEscaper0.translate((java.lang.CharSequence) "java.io.IOException: 0", writer11);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Writer must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\\u0068\\u0069\\u0021" + "'", str2, "\\u0068\\u0069\\u0021");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "\\u006A\\u0061\\u0076\\u0061\\u005C\\u0075\\u0030\\u0030\\u0032\\u0045\\u0069\\u006F\\u005C\\u0075\\u0030\\u0030\\u0032\\u0045\\u005C\\u0075\\u0030\\u0030\\u0034\\u0039\\u005C\\u0075\\u0030\\u0030\\u0034\\u0046\\u005C\\u0075\\u0030\\u0030\\u0034\\u0035\\u0078\\u0063\\u0065\\u0070\\u0074\\u0069\\u006F\\u006E\\u005C\\u0075\\u0030\\u0030\\u0033\\u0041\\u005C\\u0075\\u0030\\u0030\\u0032\\u0030\\u006A\\u0061\\u0076\\u0061\\u005C\\u0075\\u0030\\u0030\\u0032\\u0045\\u0069\\u006F\\u005C\\u0075\\u0030\\u0030\\u0032\\u0045\\u005C\\u0075\\u0030\\u0030\\u0034\\u0039\\u005C\\u0075\\u0030\\u0030\\u0034\\u0046\\u005C\\u0075\\u0030\\u0030\\u0034\\u0035\\u0078\\u0063\\u0065\\u0070\\u0074\\u0069\\u006F\\u006E" + "'", str9, "\\u006A\\u0061\\u0076\\u0061\\u005C\\u0075\\u0030\\u0030\\u0032\\u0045\\u0069\\u006F\\u005C\\u0075\\u0030\\u0030\\u0032\\u0045\\u005C\\u0075\\u0030\\u0030\\u0034\\u0039\\u005C\\u0075\\u0030\\u0030\\u0034\\u0046\\u005C\\u0075\\u0030\\u0030\\u0034\\u0035\\u0078\\u0063\\u0065\\u0070\\u0074\\u0069\\u006F\\u006E\\u005C\\u0075\\u0030\\u0030\\u0033\\u0041\\u005C\\u0075\\u0030\\u0030\\u0032\\u0030\\u006A\\u0061\\u0076\\u0061\\u005C\\u0075\\u0030\\u0030\\u0032\\u0045\\u0069\\u006F\\u005C\\u0075\\u0030\\u0030\\u0032\\u0045\\u005C\\u0075\\u0030\\u0030\\u0034\\u0039\\u005C\\u0075\\u0030\\u0030\\u0034\\u0046\\u005C\\u0075\\u0030\\u0030\\u0034\\u0035\\u0078\\u0063\\u0065\\u0070\\u0074\\u0069\\u006F\\u006E");
    }

    @Test
    public void test00294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00294");
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper1 = org.apache.commons.lang3.text.translate.UnicodeEscaper.below((int) (short) 10);
        java.lang.String str3 = unicodeEscaper1.translate((java.lang.CharSequence) "\\u0068\\u0069\\u0021");
        java.io.Writer writer5 = null;
        boolean boolean6 = unicodeEscaper1.translate((int) '#', writer5);
        java.lang.String str8 = unicodeEscaper1.translate((java.lang.CharSequence) "\\u005Cu\\u0030\\u0030\\u0036\\u0038\\u005Cu\\u0030\\u0030\\u0036\\u0039\\u005Cu\\u0030\\u0030\\u0032\\u0031");
        java.io.Writer writer10 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean11 = unicodeEscaper1.translate(0, writer10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(unicodeEscaper1);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\\u0068\\u0069\\u0021" + "'", str3, "\\u0068\\u0069\\u0021");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "\\u005Cu\\u0030\\u0030\\u0036\\u0038\\u005Cu\\u0030\\u0030\\u0036\\u0039\\u005Cu\\u0030\\u0030\\u0032\\u0031" + "'", str8, "\\u005Cu\\u0030\\u0030\\u0036\\u0038\\u005Cu\\u0030\\u0030\\u0036\\u0039\\u005Cu\\u0030\\u0030\\u0032\\u0031");
    }

    @Test
    public void test00295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00295");
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper2 = org.apache.commons.lang3.text.translate.UnicodeEscaper.outsideOf(0, (int) 'a');
        java.io.Writer writer4 = null;
        boolean boolean5 = unicodeEscaper2.translate((int) (short) 10, writer4);
        java.lang.String str7 = unicodeEscaper2.translate((java.lang.CharSequence) "0");
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper10 = org.apache.commons.lang3.text.translate.UnicodeEscaper.between((int) (byte) 1, (int) '#');
        java.io.Writer writer12 = null;
        boolean boolean13 = unicodeEscaper10.translate((int) '4', writer12);
        java.io.Writer writer15 = null;
        boolean boolean16 = unicodeEscaper10.translate((int) (byte) -1, writer15);
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper19 = org.apache.commons.lang3.text.translate.UnicodeEscaper.between((int) (byte) 1, (int) '#');
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper21 = org.apache.commons.lang3.text.translate.UnicodeEscaper.below(100);
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper23 = org.apache.commons.lang3.text.translate.UnicodeEscaper.below((int) 'a');
        java.lang.String str25 = unicodeEscaper23.translate((java.lang.CharSequence) "java.io.IOException: java.io.IOException");
        org.apache.commons.lang3.text.translate.CharSequenceTranslator[] charSequenceTranslatorArray26 = new org.apache.commons.lang3.text.translate.CharSequenceTranslator[] { unicodeEscaper19, unicodeEscaper21, unicodeEscaper23 };
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator27 = unicodeEscaper10.with(charSequenceTranslatorArray26);
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator28 = unicodeEscaper2.with(charSequenceTranslatorArray26);
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper31 = org.apache.commons.lang3.text.translate.UnicodeEscaper.between((int) (byte) 1, (int) '#');
        java.lang.String str33 = unicodeEscaper31.translate((java.lang.CharSequence) "\\u006A\\u0061\\u0076\\u0061\\u005C\\u0075\\u0030\\u0030\\u0032\\u0045\\u0069\\u006F\\u005C\\u0075\\u0030\\u0030\\u0032\\u0045\\u005C\\u0075\\u0030\\u0030\\u0034\\u0039\\u005C\\u0075\\u0030\\u0030\\u0034\\u0046\\u005C\\u0075\\u0030\\u0030\\u0034\\u0035\\u0078\\u0063\\u0065\\u0070\\u0074\\u0069\\u006F\\u006E\\u005C\\u0075\\u0030\\u0030\\u0033\\u0041\\u005C\\u0075\\u0030\\u0030\\u0032\\u0030\\u006A\\u0061\\u0076\\u0061\\u005C\\u0075\\u0030\\u0030\\u0032\\u0045\\u0069\\u006F\\u005C\\u0075\\u0030\\u0030\\u0032\\u0045\\u005C\\u0075\\u0030\\u0030\\u0034\\u0039\\u005C\\u0075\\u0030\\u0030\\u0034\\u0046\\u005C\\u0075\\u0030\\u0030\\u0034\\u0035\\u0078\\u0063\\u0065\\u0070\\u0074\\u0069\\u006F\\u006E");
        org.apache.commons.lang3.text.translate.CharSequenceTranslator[] charSequenceTranslatorArray34 = new org.apache.commons.lang3.text.translate.CharSequenceTranslator[] { unicodeEscaper31 };
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator35 = unicodeEscaper2.with(charSequenceTranslatorArray34);
        java.io.Writer writer37 = null;
        // The following exception was thrown during execution in test generation
        try {
            charSequenceTranslator35.translate((java.lang.CharSequence) "23", writer37);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Writer must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(unicodeEscaper2);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "0" + "'", str7, "0");
        org.junit.Assert.assertNotNull(unicodeEscaper10);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(unicodeEscaper19);
        org.junit.Assert.assertNotNull(unicodeEscaper21);
        org.junit.Assert.assertNotNull(unicodeEscaper23);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "java\\u002Eio\\u002E\\u0049\\u004F\\u0045xception\\u003A\\u0020java\\u002Eio\\u002E\\u0049\\u004F\\u0045xception" + "'", str25, "java\\u002Eio\\u002E\\u0049\\u004F\\u0045xception\\u003A\\u0020java\\u002Eio\\u002E\\u0049\\u004F\\u0045xception");
        org.junit.Assert.assertNotNull(charSequenceTranslatorArray26);
        org.junit.Assert.assertNotNull(charSequenceTranslator27);
        org.junit.Assert.assertNotNull(charSequenceTranslator28);
        org.junit.Assert.assertNotNull(unicodeEscaper31);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "\\u006A\\u0061\\u0076\\u0061\\u005C\\u0075\\u0030\\u0030\\u0032\\u0045\\u0069\\u006F\\u005C\\u0075\\u0030\\u0030\\u0032\\u0045\\u005C\\u0075\\u0030\\u0030\\u0034\\u0039\\u005C\\u0075\\u0030\\u0030\\u0034\\u0046\\u005C\\u0075\\u0030\\u0030\\u0034\\u0035\\u0078\\u0063\\u0065\\u0070\\u0074\\u0069\\u006F\\u006E\\u005C\\u0075\\u0030\\u0030\\u0033\\u0041\\u005C\\u0075\\u0030\\u0030\\u0032\\u0030\\u006A\\u0061\\u0076\\u0061\\u005C\\u0075\\u0030\\u0030\\u0032\\u0045\\u0069\\u006F\\u005C\\u0075\\u0030\\u0030\\u0032\\u0045\\u005C\\u0075\\u0030\\u0030\\u0034\\u0039\\u005C\\u0075\\u0030\\u0030\\u0034\\u0046\\u005C\\u0075\\u0030\\u0030\\u0034\\u0035\\u0078\\u0063\\u0065\\u0070\\u0074\\u0069\\u006F\\u006E" + "'", str33, "\\u006A\\u0061\\u0076\\u0061\\u005C\\u0075\\u0030\\u0030\\u0032\\u0045\\u0069\\u006F\\u005C\\u0075\\u0030\\u0030\\u0032\\u0045\\u005C\\u0075\\u0030\\u0030\\u0034\\u0039\\u005C\\u0075\\u0030\\u0030\\u0034\\u0046\\u005C\\u0075\\u0030\\u0030\\u0034\\u0035\\u0078\\u0063\\u0065\\u0070\\u0074\\u0069\\u006F\\u006E\\u005C\\u0075\\u0030\\u0030\\u0033\\u0041\\u005C\\u0075\\u0030\\u0030\\u0032\\u0030\\u006A\\u0061\\u0076\\u0061\\u005C\\u0075\\u0030\\u0030\\u0032\\u0045\\u0069\\u006F\\u005C\\u0075\\u0030\\u0030\\u0032\\u0045\\u005C\\u0075\\u0030\\u0030\\u0034\\u0039\\u005C\\u0075\\u0030\\u0030\\u0034\\u0046\\u005C\\u0075\\u0030\\u0030\\u0034\\u0035\\u0078\\u0063\\u0065\\u0070\\u0074\\u0069\\u006F\\u006E");
        org.junit.Assert.assertNotNull(charSequenceTranslatorArray34);
        org.junit.Assert.assertNotNull(charSequenceTranslator35);
    }

    @Test
    public void test00296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00296");
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper2 = org.apache.commons.lang3.text.translate.UnicodeEscaper.outsideOf((int) 'a', 0);
        java.io.Writer writer4 = null;
        // The following exception was thrown during execution in test generation
        try {
            unicodeEscaper2.translate((java.lang.CharSequence) "\\u005C\\u0075\\u0030\\u0030\\u0035\\u0043\\u005C\\u0075\\u0030\\u0030\\u0037\\u0035\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0033\\u005C\\u0075\\u0030\\u0030\\u0033\\u0036\\u005C\\u0075\\u0030\\u0030\\u0035\\u0043\\u005C\\u0075\\u0030\\u0030\\u0037\\u0035\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0033\\u005C\\u0075\\u0030\\u0030\\u0033\\u0034", writer4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Writer must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(unicodeEscaper2);
    }

    @Test
    public void test00297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00297");
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper1 = org.apache.commons.lang3.text.translate.UnicodeEscaper.below((int) (byte) 0);
        java.io.Writer writer3 = null;
        boolean boolean4 = unicodeEscaper1.translate((int) ' ', writer3);
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper7 = org.apache.commons.lang3.text.translate.UnicodeEscaper.between((-1), (int) (short) 0);
        java.lang.String str9 = unicodeEscaper7.translate((java.lang.CharSequence) "0");
        org.apache.commons.lang3.text.translate.CharSequenceTranslator[] charSequenceTranslatorArray10 = new org.apache.commons.lang3.text.translate.CharSequenceTranslator[] {};
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator11 = unicodeEscaper7.with(charSequenceTranslatorArray10);
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator12 = unicodeEscaper1.with(charSequenceTranslatorArray10);
        java.io.Writer writer14 = null;
        boolean boolean15 = unicodeEscaper1.translate((int) (byte) 1, writer14);
        java.io.Writer writer17 = null;
        boolean boolean18 = unicodeEscaper1.translate((int) (byte) 100, writer17);
        java.io.Writer writer20 = null;
        boolean boolean21 = unicodeEscaper1.translate((int) '4', writer20);
        java.lang.Class<?> wildcardClass22 = unicodeEscaper1.getClass();
        org.junit.Assert.assertNotNull(unicodeEscaper1);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(unicodeEscaper7);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "0" + "'", str9, "0");
        org.junit.Assert.assertNotNull(charSequenceTranslatorArray10);
        org.junit.Assert.assertNotNull(charSequenceTranslator11);
        org.junit.Assert.assertNotNull(charSequenceTranslator12);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test00298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00298");
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper2 = org.apache.commons.lang3.text.translate.UnicodeEscaper.outsideOf(0, (int) 'a');
        java.io.Writer writer4 = null;
        boolean boolean5 = unicodeEscaper2.translate((int) (short) 10, writer4);
        java.lang.String str7 = unicodeEscaper2.translate((java.lang.CharSequence) "0");
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper10 = org.apache.commons.lang3.text.translate.UnicodeEscaper.between((int) (byte) 1, (int) '#');
        java.io.Writer writer12 = null;
        boolean boolean13 = unicodeEscaper10.translate((int) '4', writer12);
        java.io.Writer writer15 = null;
        boolean boolean16 = unicodeEscaper10.translate((int) (byte) -1, writer15);
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper19 = org.apache.commons.lang3.text.translate.UnicodeEscaper.between((int) (byte) 1, (int) '#');
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper21 = org.apache.commons.lang3.text.translate.UnicodeEscaper.below(100);
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper23 = org.apache.commons.lang3.text.translate.UnicodeEscaper.below((int) 'a');
        java.lang.String str25 = unicodeEscaper23.translate((java.lang.CharSequence) "java.io.IOException: java.io.IOException");
        org.apache.commons.lang3.text.translate.CharSequenceTranslator[] charSequenceTranslatorArray26 = new org.apache.commons.lang3.text.translate.CharSequenceTranslator[] { unicodeEscaper19, unicodeEscaper21, unicodeEscaper23 };
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator27 = unicodeEscaper10.with(charSequenceTranslatorArray26);
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator28 = unicodeEscaper2.with(charSequenceTranslatorArray26);
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper31 = org.apache.commons.lang3.text.translate.UnicodeEscaper.between((int) (byte) 1, (int) '#');
        java.lang.String str33 = unicodeEscaper31.translate((java.lang.CharSequence) "\\u006A\\u0061\\u0076\\u0061\\u005C\\u0075\\u0030\\u0030\\u0032\\u0045\\u0069\\u006F\\u005C\\u0075\\u0030\\u0030\\u0032\\u0045\\u005C\\u0075\\u0030\\u0030\\u0034\\u0039\\u005C\\u0075\\u0030\\u0030\\u0034\\u0046\\u005C\\u0075\\u0030\\u0030\\u0034\\u0035\\u0078\\u0063\\u0065\\u0070\\u0074\\u0069\\u006F\\u006E\\u005C\\u0075\\u0030\\u0030\\u0033\\u0041\\u005C\\u0075\\u0030\\u0030\\u0032\\u0030\\u006A\\u0061\\u0076\\u0061\\u005C\\u0075\\u0030\\u0030\\u0032\\u0045\\u0069\\u006F\\u005C\\u0075\\u0030\\u0030\\u0032\\u0045\\u005C\\u0075\\u0030\\u0030\\u0034\\u0039\\u005C\\u0075\\u0030\\u0030\\u0034\\u0046\\u005C\\u0075\\u0030\\u0030\\u0034\\u0035\\u0078\\u0063\\u0065\\u0070\\u0074\\u0069\\u006F\\u006E");
        org.apache.commons.lang3.text.translate.CharSequenceTranslator[] charSequenceTranslatorArray34 = new org.apache.commons.lang3.text.translate.CharSequenceTranslator[] { unicodeEscaper31 };
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator35 = unicodeEscaper2.with(charSequenceTranslatorArray34);
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper37 = org.apache.commons.lang3.text.translate.UnicodeEscaper.below((int) (byte) 0);
        java.io.Writer writer39 = null;
        boolean boolean40 = unicodeEscaper37.translate((int) ' ', writer39);
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper43 = org.apache.commons.lang3.text.translate.UnicodeEscaper.between((-1), (int) (short) 0);
        java.lang.String str45 = unicodeEscaper43.translate((java.lang.CharSequence) "0");
        org.apache.commons.lang3.text.translate.CharSequenceTranslator[] charSequenceTranslatorArray46 = new org.apache.commons.lang3.text.translate.CharSequenceTranslator[] {};
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator47 = unicodeEscaper43.with(charSequenceTranslatorArray46);
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator48 = unicodeEscaper37.with(charSequenceTranslatorArray46);
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator49 = unicodeEscaper2.with(charSequenceTranslatorArray46);
        java.io.Writer writer52 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int53 = unicodeEscaper2.translate((java.lang.CharSequence) "\\u005C\\u0075\\u0030\\u0030\\u0035\\u0043\\u005C\\u0075\\u0030\\u0030\\u0037\\u0035\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0033\\u005C\\u0075\\u0030\\u0030\\u0033\\u0036\\u005C\\u0075\\u0030\\u0030\\u0035\\u0043\\u005C\\u0075\\u0030\\u0030\\u0037\\u0035\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0033\\u005C\\u0075\\u0030\\u0030\\u0033\\u0034", (int) (short) 1, writer52);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(unicodeEscaper2);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "0" + "'", str7, "0");
        org.junit.Assert.assertNotNull(unicodeEscaper10);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(unicodeEscaper19);
        org.junit.Assert.assertNotNull(unicodeEscaper21);
        org.junit.Assert.assertNotNull(unicodeEscaper23);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "java\\u002Eio\\u002E\\u0049\\u004F\\u0045xception\\u003A\\u0020java\\u002Eio\\u002E\\u0049\\u004F\\u0045xception" + "'", str25, "java\\u002Eio\\u002E\\u0049\\u004F\\u0045xception\\u003A\\u0020java\\u002Eio\\u002E\\u0049\\u004F\\u0045xception");
        org.junit.Assert.assertNotNull(charSequenceTranslatorArray26);
        org.junit.Assert.assertNotNull(charSequenceTranslator27);
        org.junit.Assert.assertNotNull(charSequenceTranslator28);
        org.junit.Assert.assertNotNull(unicodeEscaper31);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "\\u006A\\u0061\\u0076\\u0061\\u005C\\u0075\\u0030\\u0030\\u0032\\u0045\\u0069\\u006F\\u005C\\u0075\\u0030\\u0030\\u0032\\u0045\\u005C\\u0075\\u0030\\u0030\\u0034\\u0039\\u005C\\u0075\\u0030\\u0030\\u0034\\u0046\\u005C\\u0075\\u0030\\u0030\\u0034\\u0035\\u0078\\u0063\\u0065\\u0070\\u0074\\u0069\\u006F\\u006E\\u005C\\u0075\\u0030\\u0030\\u0033\\u0041\\u005C\\u0075\\u0030\\u0030\\u0032\\u0030\\u006A\\u0061\\u0076\\u0061\\u005C\\u0075\\u0030\\u0030\\u0032\\u0045\\u0069\\u006F\\u005C\\u0075\\u0030\\u0030\\u0032\\u0045\\u005C\\u0075\\u0030\\u0030\\u0034\\u0039\\u005C\\u0075\\u0030\\u0030\\u0034\\u0046\\u005C\\u0075\\u0030\\u0030\\u0034\\u0035\\u0078\\u0063\\u0065\\u0070\\u0074\\u0069\\u006F\\u006E" + "'", str33, "\\u006A\\u0061\\u0076\\u0061\\u005C\\u0075\\u0030\\u0030\\u0032\\u0045\\u0069\\u006F\\u005C\\u0075\\u0030\\u0030\\u0032\\u0045\\u005C\\u0075\\u0030\\u0030\\u0034\\u0039\\u005C\\u0075\\u0030\\u0030\\u0034\\u0046\\u005C\\u0075\\u0030\\u0030\\u0034\\u0035\\u0078\\u0063\\u0065\\u0070\\u0074\\u0069\\u006F\\u006E\\u005C\\u0075\\u0030\\u0030\\u0033\\u0041\\u005C\\u0075\\u0030\\u0030\\u0032\\u0030\\u006A\\u0061\\u0076\\u0061\\u005C\\u0075\\u0030\\u0030\\u0032\\u0045\\u0069\\u006F\\u005C\\u0075\\u0030\\u0030\\u0032\\u0045\\u005C\\u0075\\u0030\\u0030\\u0034\\u0039\\u005C\\u0075\\u0030\\u0030\\u0034\\u0046\\u005C\\u0075\\u0030\\u0030\\u0034\\u0035\\u0078\\u0063\\u0065\\u0070\\u0074\\u0069\\u006F\\u006E");
        org.junit.Assert.assertNotNull(charSequenceTranslatorArray34);
        org.junit.Assert.assertNotNull(charSequenceTranslator35);
        org.junit.Assert.assertNotNull(unicodeEscaper37);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertNotNull(unicodeEscaper43);
        org.junit.Assert.assertEquals("'" + str45 + "' != '" + "0" + "'", str45, "0");
        org.junit.Assert.assertNotNull(charSequenceTranslatorArray46);
        org.junit.Assert.assertNotNull(charSequenceTranslator47);
        org.junit.Assert.assertNotNull(charSequenceTranslator48);
        org.junit.Assert.assertNotNull(charSequenceTranslator49);
    }

    @Test
    public void test00299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00299");
        java.io.IOException iOException1 = new java.io.IOException("");
        java.io.IOException iOException2 = new java.io.IOException((java.lang.Throwable) iOException1);
        java.io.IOException iOException4 = new java.io.IOException("");
        iOException2.addSuppressed((java.lang.Throwable) iOException4);
        java.lang.Throwable[] throwableArray6 = iOException4.getSuppressed();
        java.io.IOException iOException7 = new java.io.IOException((java.lang.Throwable) iOException4);
        java.lang.String str8 = iOException7.toString();
        org.junit.Assert.assertNotNull(throwableArray6);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "java.io.IOException: java.io.IOException: " + "'", str8, "java.io.IOException: java.io.IOException: ");
    }

    @Test
    public void test00300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00300");
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper2 = org.apache.commons.lang3.text.translate.UnicodeEscaper.outsideOf((-1), (int) (byte) -1);
        java.io.Writer writer5 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int6 = unicodeEscaper2.translate((java.lang.CharSequence) "\\u006A\\u0061\\u0076\\u0061\\u002E\\u0069\\u006F\\u002E\\u0049\\u004F\\u0045\\u0078\\u0063\\u0065\\u0070\\u0074\\u0069\\u006F\\u006E\\u003A\\u0020\\u006A\\u0061\\u0076\\u0061\\u002E\\u0069\\u006F\\u002E\\u0049\\u004F\\u0045\\u0078\\u0063\\u0065\\u0070\\u0074\\u0069\\u006F\\u006E\\u003A\\u0020\\u006A\\u0061\\u0076\\u0061\\u002E\\u0069\\u006F\\u002E\\u0049\\u004F\\u0045\\u0078\\u0063\\u0065\\u0070\\u0074\\u0069\\u006F\\u006E\\u003A\\u0020\\u0030", (int) (short) 100, writer5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(unicodeEscaper2);
    }

    @Test
    public void test00301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00301");
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper2 = org.apache.commons.lang3.text.translate.UnicodeEscaper.between((int) (byte) 1, (int) '#');
        java.io.Writer writer4 = null;
        boolean boolean5 = unicodeEscaper2.translate((int) '4', writer4);
        java.io.Writer writer7 = null;
        boolean boolean8 = unicodeEscaper2.translate((int) (byte) -1, writer7);
        java.io.Writer writer10 = null;
        boolean boolean11 = unicodeEscaper2.translate((int) (byte) -1, writer10);
        java.io.Writer writer13 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean14 = unicodeEscaper2.translate((int) ' ', writer13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(unicodeEscaper2);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test00302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00302");
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper1 = org.apache.commons.lang3.text.translate.UnicodeEscaper.below(100);
        java.io.Writer writer3 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean4 = unicodeEscaper1.translate((int) (byte) 1, writer3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(unicodeEscaper1);
    }

    @Test
    public void test00303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00303");
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper1 = org.apache.commons.lang3.text.translate.UnicodeEscaper.below((int) (byte) 100);
        java.io.Writer writer3 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean4 = unicodeEscaper1.translate((int) (short) 10, writer3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(unicodeEscaper1);
    }

    @Test
    public void test00304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00304");
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper2 = org.apache.commons.lang3.text.translate.UnicodeEscaper.outsideOf((-1), (int) (byte) -1);
        java.io.Writer writer5 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int6 = unicodeEscaper2.translate((java.lang.CharSequence) "\\u006A\\u0061\\u0076\\u0061\\u002E\\u0069\\u006F\\u002E\\u0049\\u004F\\u0045\\u0078\\u0063\\u0065\\u0070\\u0074\\u0069\\u006F\\u006E\\u003A\\u0020\\u006A\\u0061\\u0076\\u0061\\u002E\\u0069\\u006F\\u002E\\u0049\\u004F\\u0045\\u0078\\u0063\\u0065\\u0070\\u0074\\u0069\\u006F\\u006E", (int) (byte) 0, writer5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(unicodeEscaper2);
    }

    @Test
    public void test00305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00305");
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper2 = org.apache.commons.lang3.text.translate.UnicodeEscaper.outsideOf((int) (short) 10, (int) (byte) -1);
        java.io.Writer writer4 = null;
        // The following exception was thrown during execution in test generation
        try {
            unicodeEscaper2.translate((java.lang.CharSequence) "\\u006A\\u0061\\u0076\\u0061\\u005C\\u0075\\u0030\\u0030\\u0032\\u0045\\u0069\\u006F\\u005C\\u0075\\u0030\\u0030\\u0032\\u0045\\u005C\\u0075\\u0030\\u0030\\u0034\\u0039\\u005C\\u0075\\u0030\\u0030\\u0034\\u0046\\u005C\\u0075\\u0030\\u0030\\u0034\\u0035\\u0078\\u0063\\u0065\\u0070\\u0074\\u0069\\u006F\\u006E\\u005C\\u0075\\u0030\\u0030\\u0033\\u0041\\u005C\\u0075\\u0030\\u0030\\u0032\\u0030\\u006A\\u0061\\u0076\\u0061\\u005C\\u0075\\u0030\\u0030\\u0032\\u0045\\u0069\\u006F\\u005C\\u0075\\u0030\\u0030\\u0032\\u0045\\u005C\\u0075\\u0030\\u0030\\u0034\\u0039\\u005C\\u0075\\u0030\\u0030\\u0034\\u0046\\u005C\\u0075\\u0030\\u0030\\u0034\\u0035\\u0078\\u0063\\u0065\\u0070\\u0074\\u0069\\u006F\\u006E", writer4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Writer must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(unicodeEscaper2);
    }

    @Test
    public void test00306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00306");
        java.io.IOException iOException2 = new java.io.IOException("0");
        java.lang.Throwable[] throwableArray3 = iOException2.getSuppressed();
        java.io.IOException iOException4 = new java.io.IOException("hi!", (java.lang.Throwable) iOException2);
        java.lang.Throwable[] throwableArray5 = iOException2.getSuppressed();
        java.io.IOException iOException7 = new java.io.IOException("0");
        java.io.IOException iOException8 = new java.io.IOException();
        java.io.IOException iOException9 = new java.io.IOException();
        iOException8.addSuppressed((java.lang.Throwable) iOException9);
        java.io.IOException iOException11 = new java.io.IOException();
        java.io.IOException iOException12 = new java.io.IOException();
        iOException11.addSuppressed((java.lang.Throwable) iOException12);
        java.lang.Throwable[] throwableArray14 = iOException12.getSuppressed();
        java.io.IOException iOException15 = new java.io.IOException((java.lang.Throwable) iOException12);
        java.io.IOException iOException17 = new java.io.IOException("");
        java.io.IOException iOException18 = new java.io.IOException((java.lang.Throwable) iOException17);
        iOException12.addSuppressed((java.lang.Throwable) iOException18);
        iOException9.addSuppressed((java.lang.Throwable) iOException18);
        iOException7.addSuppressed((java.lang.Throwable) iOException18);
        iOException2.addSuppressed((java.lang.Throwable) iOException7);
        java.lang.String str23 = iOException7.toString();
        org.junit.Assert.assertNotNull(throwableArray3);
        org.junit.Assert.assertNotNull(throwableArray5);
        org.junit.Assert.assertNotNull(throwableArray14);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "java.io.IOException: 0" + "'", str23, "java.io.IOException: 0");
    }

    @Test
    public void test00307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00307");
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper2 = org.apache.commons.lang3.text.translate.UnicodeEscaper.outsideOf(10, 10);
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper5 = org.apache.commons.lang3.text.translate.UnicodeEscaper.outsideOf((int) (short) -1, (int) (byte) -1);
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper7 = org.apache.commons.lang3.text.translate.UnicodeEscaper.above((int) 'a');
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper9 = org.apache.commons.lang3.text.translate.UnicodeEscaper.below((int) (byte) 0);
        java.io.Writer writer11 = null;
        boolean boolean12 = unicodeEscaper9.translate((int) ' ', writer11);
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper15 = org.apache.commons.lang3.text.translate.UnicodeEscaper.between((-1), (int) (short) 0);
        java.lang.String str17 = unicodeEscaper15.translate((java.lang.CharSequence) "0");
        org.apache.commons.lang3.text.translate.CharSequenceTranslator[] charSequenceTranslatorArray18 = new org.apache.commons.lang3.text.translate.CharSequenceTranslator[] {};
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator19 = unicodeEscaper15.with(charSequenceTranslatorArray18);
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator20 = unicodeEscaper9.with(charSequenceTranslatorArray18);
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator21 = unicodeEscaper7.with(charSequenceTranslatorArray18);
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper24 = org.apache.commons.lang3.text.translate.UnicodeEscaper.between((int) (byte) 1, (int) '#');
        java.io.Writer writer26 = null;
        boolean boolean27 = unicodeEscaper24.translate((int) '4', writer26);
        java.io.Writer writer29 = null;
        boolean boolean30 = unicodeEscaper24.translate((int) (byte) -1, writer29);
        java.io.Writer writer32 = null;
        boolean boolean33 = unicodeEscaper24.translate((int) (byte) -1, writer32);
        org.apache.commons.lang3.text.translate.CharSequenceTranslator[] charSequenceTranslatorArray34 = new org.apache.commons.lang3.text.translate.CharSequenceTranslator[] {};
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator35 = unicodeEscaper24.with(charSequenceTranslatorArray34);
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator36 = charSequenceTranslator21.with(charSequenceTranslatorArray34);
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator37 = unicodeEscaper5.with(charSequenceTranslatorArray34);
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator38 = unicodeEscaper2.with(charSequenceTranslatorArray34);
        org.apache.commons.lang3.text.translate.CharSequenceTranslator[] charSequenceTranslatorArray39 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator40 = charSequenceTranslator38.with(charSequenceTranslatorArray39);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(unicodeEscaper2);
        org.junit.Assert.assertNotNull(unicodeEscaper5);
        org.junit.Assert.assertNotNull(unicodeEscaper7);
        org.junit.Assert.assertNotNull(unicodeEscaper9);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(unicodeEscaper15);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "0" + "'", str17, "0");
        org.junit.Assert.assertNotNull(charSequenceTranslatorArray18);
        org.junit.Assert.assertNotNull(charSequenceTranslator19);
        org.junit.Assert.assertNotNull(charSequenceTranslator20);
        org.junit.Assert.assertNotNull(charSequenceTranslator21);
        org.junit.Assert.assertNotNull(unicodeEscaper24);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertNotNull(charSequenceTranslatorArray34);
        org.junit.Assert.assertNotNull(charSequenceTranslator35);
        org.junit.Assert.assertNotNull(charSequenceTranslator36);
        org.junit.Assert.assertNotNull(charSequenceTranslator37);
        org.junit.Assert.assertNotNull(charSequenceTranslator38);
    }

    @Test
    public void test00308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00308");
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper2 = org.apache.commons.lang3.text.translate.UnicodeEscaper.outsideOf((int) (short) 10, (int) (byte) -1);
        java.io.Writer writer4 = null;
        // The following exception was thrown during execution in test generation
        try {
            unicodeEscaper2.translate((java.lang.CharSequence) "1", writer4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Writer must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(unicodeEscaper2);
    }

    @Test
    public void test00309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00309");
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper2 = org.apache.commons.lang3.text.translate.UnicodeEscaper.outsideOf((-1), (int) (short) 0);
        java.lang.String str4 = unicodeEscaper2.translate((java.lang.CharSequence) "java.io.IOException: ");
        java.io.Writer writer7 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int8 = unicodeEscaper2.translate((java.lang.CharSequence) "\\u005C\\u0075\\u0030\\u0030\\u0035\\u0043\\u005C\\u0075\\u0030\\u0030\\u0037\\u0035\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0033\\u005C\\u0075\\u0030\\u0030\\u0033\\u0036\\u005C\\u0075\\u0030\\u0030\\u0035\\u0043\\u005C\\u0075\\u0030\\u0030\\u0037\\u0035\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0033\\u005C\\u0075\\u0030\\u0030\\u0033\\u0034", (int) '#', writer7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(unicodeEscaper2);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "\\u006A\\u0061\\u0076\\u0061\\u002E\\u0069\\u006F\\u002E\\u0049\\u004F\\u0045\\u0078\\u0063\\u0065\\u0070\\u0074\\u0069\\u006F\\u006E\\u003A\\u0020" + "'", str4, "\\u006A\\u0061\\u0076\\u0061\\u002E\\u0069\\u006F\\u002E\\u0049\\u004F\\u0045\\u0078\\u0063\\u0065\\u0070\\u0074\\u0069\\u006F\\u006E\\u003A\\u0020");
    }

    @Test
    public void test00310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00310");
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper2 = org.apache.commons.lang3.text.translate.UnicodeEscaper.outsideOf(0, (int) 'a');
        java.io.Writer writer4 = null;
        boolean boolean5 = unicodeEscaper2.translate((int) (short) 10, writer4);
        java.lang.String str7 = unicodeEscaper2.translate((java.lang.CharSequence) "0");
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper10 = org.apache.commons.lang3.text.translate.UnicodeEscaper.between((int) (byte) 1, (int) '#');
        java.io.Writer writer12 = null;
        boolean boolean13 = unicodeEscaper10.translate((int) '4', writer12);
        java.io.Writer writer15 = null;
        boolean boolean16 = unicodeEscaper10.translate((int) (byte) -1, writer15);
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper19 = org.apache.commons.lang3.text.translate.UnicodeEscaper.between((int) (byte) 1, (int) '#');
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper21 = org.apache.commons.lang3.text.translate.UnicodeEscaper.below(100);
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper23 = org.apache.commons.lang3.text.translate.UnicodeEscaper.below((int) 'a');
        java.lang.String str25 = unicodeEscaper23.translate((java.lang.CharSequence) "java.io.IOException: java.io.IOException");
        org.apache.commons.lang3.text.translate.CharSequenceTranslator[] charSequenceTranslatorArray26 = new org.apache.commons.lang3.text.translate.CharSequenceTranslator[] { unicodeEscaper19, unicodeEscaper21, unicodeEscaper23 };
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator27 = unicodeEscaper10.with(charSequenceTranslatorArray26);
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator28 = unicodeEscaper2.with(charSequenceTranslatorArray26);
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper31 = org.apache.commons.lang3.text.translate.UnicodeEscaper.between((int) (byte) 1, (int) '#');
        java.lang.String str33 = unicodeEscaper31.translate((java.lang.CharSequence) "\\u006A\\u0061\\u0076\\u0061\\u005C\\u0075\\u0030\\u0030\\u0032\\u0045\\u0069\\u006F\\u005C\\u0075\\u0030\\u0030\\u0032\\u0045\\u005C\\u0075\\u0030\\u0030\\u0034\\u0039\\u005C\\u0075\\u0030\\u0030\\u0034\\u0046\\u005C\\u0075\\u0030\\u0030\\u0034\\u0035\\u0078\\u0063\\u0065\\u0070\\u0074\\u0069\\u006F\\u006E\\u005C\\u0075\\u0030\\u0030\\u0033\\u0041\\u005C\\u0075\\u0030\\u0030\\u0032\\u0030\\u006A\\u0061\\u0076\\u0061\\u005C\\u0075\\u0030\\u0030\\u0032\\u0045\\u0069\\u006F\\u005C\\u0075\\u0030\\u0030\\u0032\\u0045\\u005C\\u0075\\u0030\\u0030\\u0034\\u0039\\u005C\\u0075\\u0030\\u0030\\u0034\\u0046\\u005C\\u0075\\u0030\\u0030\\u0034\\u0035\\u0078\\u0063\\u0065\\u0070\\u0074\\u0069\\u006F\\u006E");
        org.apache.commons.lang3.text.translate.CharSequenceTranslator[] charSequenceTranslatorArray34 = new org.apache.commons.lang3.text.translate.CharSequenceTranslator[] { unicodeEscaper31 };
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator35 = unicodeEscaper2.with(charSequenceTranslatorArray34);
        org.apache.commons.lang3.text.translate.CharSequenceTranslator[] charSequenceTranslatorArray36 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator37 = charSequenceTranslator35.with(charSequenceTranslatorArray36);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(unicodeEscaper2);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "0" + "'", str7, "0");
        org.junit.Assert.assertNotNull(unicodeEscaper10);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(unicodeEscaper19);
        org.junit.Assert.assertNotNull(unicodeEscaper21);
        org.junit.Assert.assertNotNull(unicodeEscaper23);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "java\\u002Eio\\u002E\\u0049\\u004F\\u0045xception\\u003A\\u0020java\\u002Eio\\u002E\\u0049\\u004F\\u0045xception" + "'", str25, "java\\u002Eio\\u002E\\u0049\\u004F\\u0045xception\\u003A\\u0020java\\u002Eio\\u002E\\u0049\\u004F\\u0045xception");
        org.junit.Assert.assertNotNull(charSequenceTranslatorArray26);
        org.junit.Assert.assertNotNull(charSequenceTranslator27);
        org.junit.Assert.assertNotNull(charSequenceTranslator28);
        org.junit.Assert.assertNotNull(unicodeEscaper31);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "\\u006A\\u0061\\u0076\\u0061\\u005C\\u0075\\u0030\\u0030\\u0032\\u0045\\u0069\\u006F\\u005C\\u0075\\u0030\\u0030\\u0032\\u0045\\u005C\\u0075\\u0030\\u0030\\u0034\\u0039\\u005C\\u0075\\u0030\\u0030\\u0034\\u0046\\u005C\\u0075\\u0030\\u0030\\u0034\\u0035\\u0078\\u0063\\u0065\\u0070\\u0074\\u0069\\u006F\\u006E\\u005C\\u0075\\u0030\\u0030\\u0033\\u0041\\u005C\\u0075\\u0030\\u0030\\u0032\\u0030\\u006A\\u0061\\u0076\\u0061\\u005C\\u0075\\u0030\\u0030\\u0032\\u0045\\u0069\\u006F\\u005C\\u0075\\u0030\\u0030\\u0032\\u0045\\u005C\\u0075\\u0030\\u0030\\u0034\\u0039\\u005C\\u0075\\u0030\\u0030\\u0034\\u0046\\u005C\\u0075\\u0030\\u0030\\u0034\\u0035\\u0078\\u0063\\u0065\\u0070\\u0074\\u0069\\u006F\\u006E" + "'", str33, "\\u006A\\u0061\\u0076\\u0061\\u005C\\u0075\\u0030\\u0030\\u0032\\u0045\\u0069\\u006F\\u005C\\u0075\\u0030\\u0030\\u0032\\u0045\\u005C\\u0075\\u0030\\u0030\\u0034\\u0039\\u005C\\u0075\\u0030\\u0030\\u0034\\u0046\\u005C\\u0075\\u0030\\u0030\\u0034\\u0035\\u0078\\u0063\\u0065\\u0070\\u0074\\u0069\\u006F\\u006E\\u005C\\u0075\\u0030\\u0030\\u0033\\u0041\\u005C\\u0075\\u0030\\u0030\\u0032\\u0030\\u006A\\u0061\\u0076\\u0061\\u005C\\u0075\\u0030\\u0030\\u0032\\u0045\\u0069\\u006F\\u005C\\u0075\\u0030\\u0030\\u0032\\u0045\\u005C\\u0075\\u0030\\u0030\\u0034\\u0039\\u005C\\u0075\\u0030\\u0030\\u0034\\u0046\\u005C\\u0075\\u0030\\u0030\\u0034\\u0035\\u0078\\u0063\\u0065\\u0070\\u0074\\u0069\\u006F\\u006E");
        org.junit.Assert.assertNotNull(charSequenceTranslatorArray34);
        org.junit.Assert.assertNotNull(charSequenceTranslator35);
    }

    @Test
    public void test00311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00311");
        java.io.IOException iOException2 = new java.io.IOException("");
        java.io.IOException iOException3 = new java.io.IOException("A", (java.lang.Throwable) iOException2);
        java.io.IOException iOException4 = new java.io.IOException((java.lang.Throwable) iOException2);
        java.io.IOException iOException5 = new java.io.IOException((java.lang.Throwable) iOException4);
        java.io.IOException iOException8 = new java.io.IOException();
        java.io.IOException iOException9 = new java.io.IOException();
        iOException8.addSuppressed((java.lang.Throwable) iOException9);
        java.io.IOException iOException11 = new java.io.IOException("0", (java.lang.Throwable) iOException8);
        java.io.IOException iOException12 = new java.io.IOException((java.lang.Throwable) iOException11);
        java.io.IOException iOException13 = new java.io.IOException((java.lang.Throwable) iOException12);
        java.io.IOException iOException14 = new java.io.IOException((java.lang.Throwable) iOException13);
        java.io.IOException iOException15 = new java.io.IOException("java.io.IOException: java.io.IOException", (java.lang.Throwable) iOException13);
        iOException4.addSuppressed((java.lang.Throwable) iOException15);
        java.lang.Class<?> wildcardClass17 = iOException4.getClass();
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test00312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00312");
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper2 = org.apache.commons.lang3.text.translate.UnicodeEscaper.between((int) (byte) 1, (int) '#');
        java.io.Writer writer4 = null;
        boolean boolean5 = unicodeEscaper2.translate((int) '4', writer4);
        java.io.Writer writer7 = null;
        boolean boolean8 = unicodeEscaper2.translate((int) (byte) -1, writer7);
        java.io.Writer writer10 = null;
        boolean boolean11 = unicodeEscaper2.translate((int) (byte) -1, writer10);
        org.apache.commons.lang3.text.translate.CharSequenceTranslator[] charSequenceTranslatorArray12 = new org.apache.commons.lang3.text.translate.CharSequenceTranslator[] {};
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator13 = unicodeEscaper2.with(charSequenceTranslatorArray12);
        java.io.Writer writer15 = null;
        // The following exception was thrown during execution in test generation
        try {
            charSequenceTranslator13.translate((java.lang.CharSequence) "FFFFFFFF", writer15);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Writer must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(unicodeEscaper2);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(charSequenceTranslatorArray12);
        org.junit.Assert.assertNotNull(charSequenceTranslator13);
    }

    @Test
    public void test00313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00313");
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper2 = org.apache.commons.lang3.text.translate.UnicodeEscaper.outsideOf((int) (byte) 100, (int) (byte) 10);
        java.lang.String str4 = unicodeEscaper2.translate((java.lang.CharSequence) "hi!");
        java.lang.String str6 = unicodeEscaper2.translate((java.lang.CharSequence) "java.io.IOException: java.io.IOException");
        java.io.Writer writer8 = null;
        // The following exception was thrown during execution in test generation
        try {
            unicodeEscaper2.translate((java.lang.CharSequence) "\\u006Aa\\u0076a.\\u0069\\u006F.IOE\\u0078\\u0063\\u0065\\u0070\\u0074\\u0069\\u006F\\u006E: \\u006Aa\\u0076a.\\u0069\\u006F.IOE\\u0078\\u0063\\u0065\\u0070\\u0074\\u0069\\u006F\\u006E", writer8);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Writer must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(unicodeEscaper2);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "\\u0068\\u0069\\u0021" + "'", str4, "\\u0068\\u0069\\u0021");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "\\u006A\\u0061\\u0076\\u0061\\u002E\\u0069\\u006F\\u002E\\u0049\\u004F\\u0045\\u0078\\u0063\\u0065\\u0070\\u0074\\u0069\\u006F\\u006E\\u003A\\u0020\\u006A\\u0061\\u0076\\u0061\\u002E\\u0069\\u006F\\u002E\\u0049\\u004F\\u0045\\u0078\\u0063\\u0065\\u0070\\u0074\\u0069\\u006F\\u006E" + "'", str6, "\\u006A\\u0061\\u0076\\u0061\\u002E\\u0069\\u006F\\u002E\\u0049\\u004F\\u0045\\u0078\\u0063\\u0065\\u0070\\u0074\\u0069\\u006F\\u006E\\u003A\\u0020\\u006A\\u0061\\u0076\\u0061\\u002E\\u0069\\u006F\\u002E\\u0049\\u004F\\u0045\\u0078\\u0063\\u0065\\u0070\\u0074\\u0069\\u006F\\u006E");
    }

    @Test
    public void test00314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00314");
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper2 = org.apache.commons.lang3.text.translate.UnicodeEscaper.between((int) (byte) 10, 100);
        java.io.Writer writer5 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int6 = unicodeEscaper2.translate((java.lang.CharSequence) "0", (int) (byte) 100, writer5);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 100");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(unicodeEscaper2);
    }

    @Test
    public void test00315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00315");
        java.io.IOException iOException1 = new java.io.IOException("\\u0068\\u0069\\u0021");
        java.io.IOException iOException2 = new java.io.IOException((java.lang.Throwable) iOException1);
        java.lang.String str3 = iOException1.toString();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "java.io.IOException: \\u0068\\u0069\\u0021" + "'", str3, "java.io.IOException: \\u0068\\u0069\\u0021");
    }

    @Test
    public void test00316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00316");
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper2 = org.apache.commons.lang3.text.translate.UnicodeEscaper.outsideOf((int) '#', 100);
        java.lang.String str4 = unicodeEscaper2.translate((java.lang.CharSequence) "java.io.IOException: java.io.IOException");
        java.io.Writer writer6 = null;
        // The following exception was thrown during execution in test generation
        try {
            unicodeEscaper2.translate((java.lang.CharSequence) "\\u005Cu\\u0030\\u0030\\u0033\\u0033\\u005Cu\\u0030\\u0030\\u0033\\u0034", writer6);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Writer must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(unicodeEscaper2);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "\\u006Aa\\u0076a.\\u0069\\u006F.IOE\\u0078c\\u0065\\u0070\\u0074\\u0069\\u006F\\u006E:\\u0020\\u006Aa\\u0076a.\\u0069\\u006F.IOE\\u0078c\\u0065\\u0070\\u0074\\u0069\\u006F\\u006E" + "'", str4, "\\u006Aa\\u0076a.\\u0069\\u006F.IOE\\u0078c\\u0065\\u0070\\u0074\\u0069\\u006F\\u006E:\\u0020\\u006Aa\\u0076a.\\u0069\\u006F.IOE\\u0078c\\u0065\\u0070\\u0074\\u0069\\u006F\\u006E");
    }

    @Test
    public void test00317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00317");
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper2 = org.apache.commons.lang3.text.translate.UnicodeEscaper.outsideOf(0, 0);
        java.io.Writer writer4 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean5 = unicodeEscaper2.translate(100, writer4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(unicodeEscaper2);
    }

    @Test
    public void test00318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00318");
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper2 = org.apache.commons.lang3.text.translate.UnicodeEscaper.outsideOf(0, (int) 'a');
        java.io.Writer writer4 = null;
        boolean boolean5 = unicodeEscaper2.translate((int) (short) 10, writer4);
        java.lang.String str7 = unicodeEscaper2.translate((java.lang.CharSequence) "0");
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper10 = org.apache.commons.lang3.text.translate.UnicodeEscaper.between((int) (byte) 1, (int) '#');
        java.io.Writer writer12 = null;
        boolean boolean13 = unicodeEscaper10.translate((int) '4', writer12);
        java.io.Writer writer15 = null;
        boolean boolean16 = unicodeEscaper10.translate((int) (byte) -1, writer15);
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper19 = org.apache.commons.lang3.text.translate.UnicodeEscaper.between((int) (byte) 1, (int) '#');
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper21 = org.apache.commons.lang3.text.translate.UnicodeEscaper.below(100);
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper23 = org.apache.commons.lang3.text.translate.UnicodeEscaper.below((int) 'a');
        java.lang.String str25 = unicodeEscaper23.translate((java.lang.CharSequence) "java.io.IOException: java.io.IOException");
        org.apache.commons.lang3.text.translate.CharSequenceTranslator[] charSequenceTranslatorArray26 = new org.apache.commons.lang3.text.translate.CharSequenceTranslator[] { unicodeEscaper19, unicodeEscaper21, unicodeEscaper23 };
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator27 = unicodeEscaper10.with(charSequenceTranslatorArray26);
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator28 = unicodeEscaper2.with(charSequenceTranslatorArray26);
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper31 = org.apache.commons.lang3.text.translate.UnicodeEscaper.between((int) (byte) 1, (int) '#');
        java.lang.String str33 = unicodeEscaper31.translate((java.lang.CharSequence) "\\u006A\\u0061\\u0076\\u0061\\u005C\\u0075\\u0030\\u0030\\u0032\\u0045\\u0069\\u006F\\u005C\\u0075\\u0030\\u0030\\u0032\\u0045\\u005C\\u0075\\u0030\\u0030\\u0034\\u0039\\u005C\\u0075\\u0030\\u0030\\u0034\\u0046\\u005C\\u0075\\u0030\\u0030\\u0034\\u0035\\u0078\\u0063\\u0065\\u0070\\u0074\\u0069\\u006F\\u006E\\u005C\\u0075\\u0030\\u0030\\u0033\\u0041\\u005C\\u0075\\u0030\\u0030\\u0032\\u0030\\u006A\\u0061\\u0076\\u0061\\u005C\\u0075\\u0030\\u0030\\u0032\\u0045\\u0069\\u006F\\u005C\\u0075\\u0030\\u0030\\u0032\\u0045\\u005C\\u0075\\u0030\\u0030\\u0034\\u0039\\u005C\\u0075\\u0030\\u0030\\u0034\\u0046\\u005C\\u0075\\u0030\\u0030\\u0034\\u0035\\u0078\\u0063\\u0065\\u0070\\u0074\\u0069\\u006F\\u006E");
        org.apache.commons.lang3.text.translate.CharSequenceTranslator[] charSequenceTranslatorArray34 = new org.apache.commons.lang3.text.translate.CharSequenceTranslator[] { unicodeEscaper31 };
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator35 = unicodeEscaper2.with(charSequenceTranslatorArray34);
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper37 = org.apache.commons.lang3.text.translate.UnicodeEscaper.below((int) (byte) 0);
        java.io.Writer writer39 = null;
        boolean boolean40 = unicodeEscaper37.translate((int) ' ', writer39);
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper43 = org.apache.commons.lang3.text.translate.UnicodeEscaper.between((-1), (int) (short) 0);
        java.lang.String str45 = unicodeEscaper43.translate((java.lang.CharSequence) "0");
        org.apache.commons.lang3.text.translate.CharSequenceTranslator[] charSequenceTranslatorArray46 = new org.apache.commons.lang3.text.translate.CharSequenceTranslator[] {};
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator47 = unicodeEscaper43.with(charSequenceTranslatorArray46);
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator48 = unicodeEscaper37.with(charSequenceTranslatorArray46);
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator49 = unicodeEscaper2.with(charSequenceTranslatorArray46);
        java.io.Writer writer51 = null;
        // The following exception was thrown during execution in test generation
        try {
            charSequenceTranslator49.translate((java.lang.CharSequence) "java.io.IOException: 0", writer51);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Writer must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(unicodeEscaper2);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "0" + "'", str7, "0");
        org.junit.Assert.assertNotNull(unicodeEscaper10);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(unicodeEscaper19);
        org.junit.Assert.assertNotNull(unicodeEscaper21);
        org.junit.Assert.assertNotNull(unicodeEscaper23);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "java\\u002Eio\\u002E\\u0049\\u004F\\u0045xception\\u003A\\u0020java\\u002Eio\\u002E\\u0049\\u004F\\u0045xception" + "'", str25, "java\\u002Eio\\u002E\\u0049\\u004F\\u0045xception\\u003A\\u0020java\\u002Eio\\u002E\\u0049\\u004F\\u0045xception");
        org.junit.Assert.assertNotNull(charSequenceTranslatorArray26);
        org.junit.Assert.assertNotNull(charSequenceTranslator27);
        org.junit.Assert.assertNotNull(charSequenceTranslator28);
        org.junit.Assert.assertNotNull(unicodeEscaper31);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "\\u006A\\u0061\\u0076\\u0061\\u005C\\u0075\\u0030\\u0030\\u0032\\u0045\\u0069\\u006F\\u005C\\u0075\\u0030\\u0030\\u0032\\u0045\\u005C\\u0075\\u0030\\u0030\\u0034\\u0039\\u005C\\u0075\\u0030\\u0030\\u0034\\u0046\\u005C\\u0075\\u0030\\u0030\\u0034\\u0035\\u0078\\u0063\\u0065\\u0070\\u0074\\u0069\\u006F\\u006E\\u005C\\u0075\\u0030\\u0030\\u0033\\u0041\\u005C\\u0075\\u0030\\u0030\\u0032\\u0030\\u006A\\u0061\\u0076\\u0061\\u005C\\u0075\\u0030\\u0030\\u0032\\u0045\\u0069\\u006F\\u005C\\u0075\\u0030\\u0030\\u0032\\u0045\\u005C\\u0075\\u0030\\u0030\\u0034\\u0039\\u005C\\u0075\\u0030\\u0030\\u0034\\u0046\\u005C\\u0075\\u0030\\u0030\\u0034\\u0035\\u0078\\u0063\\u0065\\u0070\\u0074\\u0069\\u006F\\u006E" + "'", str33, "\\u006A\\u0061\\u0076\\u0061\\u005C\\u0075\\u0030\\u0030\\u0032\\u0045\\u0069\\u006F\\u005C\\u0075\\u0030\\u0030\\u0032\\u0045\\u005C\\u0075\\u0030\\u0030\\u0034\\u0039\\u005C\\u0075\\u0030\\u0030\\u0034\\u0046\\u005C\\u0075\\u0030\\u0030\\u0034\\u0035\\u0078\\u0063\\u0065\\u0070\\u0074\\u0069\\u006F\\u006E\\u005C\\u0075\\u0030\\u0030\\u0033\\u0041\\u005C\\u0075\\u0030\\u0030\\u0032\\u0030\\u006A\\u0061\\u0076\\u0061\\u005C\\u0075\\u0030\\u0030\\u0032\\u0045\\u0069\\u006F\\u005C\\u0075\\u0030\\u0030\\u0032\\u0045\\u005C\\u0075\\u0030\\u0030\\u0034\\u0039\\u005C\\u0075\\u0030\\u0030\\u0034\\u0046\\u005C\\u0075\\u0030\\u0030\\u0034\\u0035\\u0078\\u0063\\u0065\\u0070\\u0074\\u0069\\u006F\\u006E");
        org.junit.Assert.assertNotNull(charSequenceTranslatorArray34);
        org.junit.Assert.assertNotNull(charSequenceTranslator35);
        org.junit.Assert.assertNotNull(unicodeEscaper37);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertNotNull(unicodeEscaper43);
        org.junit.Assert.assertEquals("'" + str45 + "' != '" + "0" + "'", str45, "0");
        org.junit.Assert.assertNotNull(charSequenceTranslatorArray46);
        org.junit.Assert.assertNotNull(charSequenceTranslator47);
        org.junit.Assert.assertNotNull(charSequenceTranslator48);
        org.junit.Assert.assertNotNull(charSequenceTranslator49);
    }

    @Test
    public void test00319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00319");
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper0 = new org.apache.commons.lang3.text.translate.UnicodeEscaper();
        java.lang.String str2 = unicodeEscaper0.translate((java.lang.CharSequence) "hi!");
        java.io.Writer writer5 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int6 = unicodeEscaper0.translate((java.lang.CharSequence) "FFFFFFFF", (-1), writer5);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: -1");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\\u0068\\u0069\\u0021" + "'", str2, "\\u0068\\u0069\\u0021");
    }

    @Test
    public void test00320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00320");
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper2 = org.apache.commons.lang3.text.translate.UnicodeEscaper.between((int) (byte) 1, (int) '#');
        java.io.Writer writer4 = null;
        boolean boolean5 = unicodeEscaper2.translate((int) '4', writer4);
        java.io.Writer writer7 = null;
        boolean boolean8 = unicodeEscaper2.translate((int) (byte) -1, writer7);
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper11 = org.apache.commons.lang3.text.translate.UnicodeEscaper.between((int) (byte) 1, (int) '#');
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper13 = org.apache.commons.lang3.text.translate.UnicodeEscaper.below(100);
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper15 = org.apache.commons.lang3.text.translate.UnicodeEscaper.below((int) 'a');
        java.lang.String str17 = unicodeEscaper15.translate((java.lang.CharSequence) "java.io.IOException: java.io.IOException");
        org.apache.commons.lang3.text.translate.CharSequenceTranslator[] charSequenceTranslatorArray18 = new org.apache.commons.lang3.text.translate.CharSequenceTranslator[] { unicodeEscaper11, unicodeEscaper13, unicodeEscaper15 };
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator19 = unicodeEscaper2.with(charSequenceTranslatorArray18);
        java.io.Writer writer21 = null;
        boolean boolean22 = unicodeEscaper2.translate((-1), writer21);
        java.io.Writer writer25 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int26 = unicodeEscaper2.translate((java.lang.CharSequence) "java.io.IOException: hi!", (int) (short) 100, writer25);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 100");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(unicodeEscaper2);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(unicodeEscaper11);
        org.junit.Assert.assertNotNull(unicodeEscaper13);
        org.junit.Assert.assertNotNull(unicodeEscaper15);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "java\\u002Eio\\u002E\\u0049\\u004F\\u0045xception\\u003A\\u0020java\\u002Eio\\u002E\\u0049\\u004F\\u0045xception" + "'", str17, "java\\u002Eio\\u002E\\u0049\\u004F\\u0045xception\\u003A\\u0020java\\u002Eio\\u002E\\u0049\\u004F\\u0045xception");
        org.junit.Assert.assertNotNull(charSequenceTranslatorArray18);
        org.junit.Assert.assertNotNull(charSequenceTranslator19);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
    }

    @Test
    public void test00321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00321");
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper2 = org.apache.commons.lang3.text.translate.UnicodeEscaper.between((int) (byte) 0, (int) 'a');
        org.apache.commons.lang3.text.translate.CharSequenceTranslator[] charSequenceTranslatorArray3 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator4 = unicodeEscaper2.with(charSequenceTranslatorArray3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(unicodeEscaper2);
    }

    @Test
    public void test00322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00322");
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper2 = org.apache.commons.lang3.text.translate.UnicodeEscaper.outsideOf((int) (byte) 10, (int) ' ');
        java.io.Writer writer4 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean5 = unicodeEscaper2.translate((int) (short) 1, writer4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(unicodeEscaper2);
    }

    @Test
    public void test00323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00323");
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper1 = org.apache.commons.lang3.text.translate.UnicodeEscaper.above(10);
        java.io.Writer writer4 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int5 = unicodeEscaper1.translate((java.lang.CharSequence) "java.io.IOException: java.io.IOException: java.io.IOException", (int) (short) 0, writer4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(unicodeEscaper1);
    }

    @Test
    public void test00324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00324");
        java.io.IOException iOException2 = new java.io.IOException("");
        java.io.IOException iOException3 = new java.io.IOException((java.lang.Throwable) iOException2);
        java.io.IOException iOException5 = new java.io.IOException("");
        iOException3.addSuppressed((java.lang.Throwable) iOException5);
        java.io.IOException iOException8 = new java.io.IOException("");
        java.io.IOException iOException9 = new java.io.IOException((java.lang.Throwable) iOException8);
        java.io.IOException iOException11 = new java.io.IOException("");
        iOException9.addSuppressed((java.lang.Throwable) iOException11);
        iOException3.addSuppressed((java.lang.Throwable) iOException9);
        java.io.IOException iOException14 = new java.io.IOException("0", (java.lang.Throwable) iOException3);
        java.lang.String str15 = iOException3.toString();
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "java.io.IOException: java.io.IOException: " + "'", str15, "java.io.IOException: java.io.IOException: ");
    }

    @Test
    public void test00325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00325");
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper1 = org.apache.commons.lang3.text.translate.UnicodeEscaper.above((int) 'a');
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper3 = org.apache.commons.lang3.text.translate.UnicodeEscaper.below((int) (byte) 0);
        java.io.Writer writer5 = null;
        boolean boolean6 = unicodeEscaper3.translate((int) ' ', writer5);
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper9 = org.apache.commons.lang3.text.translate.UnicodeEscaper.between((-1), (int) (short) 0);
        java.lang.String str11 = unicodeEscaper9.translate((java.lang.CharSequence) "0");
        org.apache.commons.lang3.text.translate.CharSequenceTranslator[] charSequenceTranslatorArray12 = new org.apache.commons.lang3.text.translate.CharSequenceTranslator[] {};
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator13 = unicodeEscaper9.with(charSequenceTranslatorArray12);
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator14 = unicodeEscaper3.with(charSequenceTranslatorArray12);
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator15 = unicodeEscaper1.with(charSequenceTranslatorArray12);
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper18 = org.apache.commons.lang3.text.translate.UnicodeEscaper.between((int) (byte) 1, (int) '#');
        java.io.Writer writer20 = null;
        boolean boolean21 = unicodeEscaper18.translate((int) '4', writer20);
        java.io.Writer writer23 = null;
        boolean boolean24 = unicodeEscaper18.translate((int) (byte) -1, writer23);
        java.io.Writer writer26 = null;
        boolean boolean27 = unicodeEscaper18.translate((int) (byte) -1, writer26);
        org.apache.commons.lang3.text.translate.CharSequenceTranslator[] charSequenceTranslatorArray28 = new org.apache.commons.lang3.text.translate.CharSequenceTranslator[] {};
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator29 = unicodeEscaper18.with(charSequenceTranslatorArray28);
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator30 = charSequenceTranslator15.with(charSequenceTranslatorArray28);
        java.io.Writer writer32 = null;
        // The following exception was thrown during execution in test generation
        try {
            charSequenceTranslator30.translate((java.lang.CharSequence) "java.io.IOException:\\u0020hi\\u0021", writer32);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Writer must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(unicodeEscaper1);
        org.junit.Assert.assertNotNull(unicodeEscaper3);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(unicodeEscaper9);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "0" + "'", str11, "0");
        org.junit.Assert.assertNotNull(charSequenceTranslatorArray12);
        org.junit.Assert.assertNotNull(charSequenceTranslator13);
        org.junit.Assert.assertNotNull(charSequenceTranslator14);
        org.junit.Assert.assertNotNull(charSequenceTranslator15);
        org.junit.Assert.assertNotNull(unicodeEscaper18);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(charSequenceTranslatorArray28);
        org.junit.Assert.assertNotNull(charSequenceTranslator29);
        org.junit.Assert.assertNotNull(charSequenceTranslator30);
    }

    @Test
    public void test00326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00326");
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper2 = org.apache.commons.lang3.text.translate.UnicodeEscaper.outsideOf(0, (int) 'a');
        java.io.Writer writer4 = null;
        boolean boolean5 = unicodeEscaper2.translate((int) (short) 10, writer4);
        java.io.Writer writer7 = null;
        boolean boolean8 = unicodeEscaper2.translate((int) '#', writer7);
        java.io.Writer writer10 = null;
        boolean boolean11 = unicodeEscaper2.translate(10, writer10);
        java.io.Writer writer14 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int15 = unicodeEscaper2.translate((java.lang.CharSequence) "FFFFFFFF", (int) (short) 10, writer14);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 10");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(unicodeEscaper2);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test00327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00327");
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper1 = org.apache.commons.lang3.text.translate.UnicodeEscaper.below((int) (short) 1);
        org.apache.commons.lang3.text.translate.CharSequenceTranslator[] charSequenceTranslatorArray2 = new org.apache.commons.lang3.text.translate.CharSequenceTranslator[] {};
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator3 = unicodeEscaper1.with(charSequenceTranslatorArray2);
        java.io.Writer writer5 = null;
        boolean boolean6 = unicodeEscaper1.translate((int) '#', writer5);
        java.io.Writer writer8 = null;
        boolean boolean9 = unicodeEscaper1.translate(10, writer8);
        java.io.Writer writer11 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean12 = unicodeEscaper1.translate(0, writer11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(unicodeEscaper1);
        org.junit.Assert.assertNotNull(charSequenceTranslatorArray2);
        org.junit.Assert.assertNotNull(charSequenceTranslator3);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test00328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00328");
        java.io.IOException iOException3 = new java.io.IOException("");
        java.io.IOException iOException4 = new java.io.IOException((java.lang.Throwable) iOException3);
        java.io.IOException iOException6 = new java.io.IOException("");
        iOException4.addSuppressed((java.lang.Throwable) iOException6);
        java.io.IOException iOException8 = new java.io.IOException("java.io.IOException", (java.lang.Throwable) iOException6);
        java.io.IOException iOException10 = new java.io.IOException("");
        java.io.IOException iOException11 = new java.io.IOException((java.lang.Throwable) iOException10);
        java.io.IOException iOException12 = new java.io.IOException((java.lang.Throwable) iOException10);
        iOException8.addSuppressed((java.lang.Throwable) iOException10);
        java.io.IOException iOException14 = new java.io.IOException("\\u005C\\u0075\\u0030\\u0030\\u0035\\u0043\\u005C\\u0075\\u0030\\u0030\\u0037\\u0035\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0033\\u005C\\u0075\\u0030\\u0030\\u0033\\u0036\\u005C\\u0075\\u0030\\u0030\\u0035\\u0043\\u005C\\u0075\\u0030\\u0030\\u0037\\u0035\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0033\\u005C\\u0075\\u0030\\u0030\\u0033\\u0034", (java.lang.Throwable) iOException8);
        java.lang.Class<?> wildcardClass15 = iOException14.getClass();
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test00329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00329");
        java.io.IOException iOException3 = new java.io.IOException("0");
        java.lang.Throwable[] throwableArray4 = iOException3.getSuppressed();
        java.io.IOException iOException5 = new java.io.IOException("hi!", (java.lang.Throwable) iOException3);
        java.io.IOException iOException7 = new java.io.IOException("");
        java.io.IOException iOException8 = new java.io.IOException((java.lang.Throwable) iOException7);
        java.io.IOException iOException10 = new java.io.IOException("");
        iOException8.addSuppressed((java.lang.Throwable) iOException10);
        java.io.IOException iOException13 = new java.io.IOException("");
        java.io.IOException iOException14 = new java.io.IOException((java.lang.Throwable) iOException13);
        java.io.IOException iOException16 = new java.io.IOException("");
        iOException14.addSuppressed((java.lang.Throwable) iOException16);
        iOException8.addSuppressed((java.lang.Throwable) iOException14);
        iOException5.addSuppressed((java.lang.Throwable) iOException8);
        java.io.IOException iOException20 = new java.io.IOException("0", (java.lang.Throwable) iOException5);
        java.io.IOException iOException22 = new java.io.IOException("");
        iOException5.addSuppressed((java.lang.Throwable) iOException22);
        java.lang.String str24 = iOException5.toString();
        org.junit.Assert.assertNotNull(throwableArray4);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "java.io.IOException: hi!" + "'", str24, "java.io.IOException: hi!");
    }

    @Test
    public void test00330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00330");
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper2 = org.apache.commons.lang3.text.translate.UnicodeEscaper.outsideOf(0, (int) 'a');
        java.io.Writer writer4 = null;
        boolean boolean5 = unicodeEscaper2.translate((int) (short) 10, writer4);
        java.io.Writer writer7 = null;
        boolean boolean8 = unicodeEscaper2.translate((int) '#', writer7);
        java.io.Writer writer10 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean11 = unicodeEscaper2.translate((int) (short) -1, writer10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(unicodeEscaper2);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test00331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00331");
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper2 = org.apache.commons.lang3.text.translate.UnicodeEscaper.between((int) (byte) 1, (int) '#');
        java.io.Writer writer4 = null;
        boolean boolean5 = unicodeEscaper2.translate((int) '4', writer4);
        java.io.Writer writer7 = null;
        boolean boolean8 = unicodeEscaper2.translate((int) (byte) -1, writer7);
        java.lang.CharSequence charSequence9 = null;
        java.io.Writer writer11 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int12 = unicodeEscaper2.translate(charSequence9, (int) (byte) 100, writer11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(unicodeEscaper2);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test00332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00332");
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper2 = org.apache.commons.lang3.text.translate.UnicodeEscaper.between((int) (byte) 1, (int) '#');
        java.io.Writer writer4 = null;
        boolean boolean5 = unicodeEscaper2.translate((int) '4', writer4);
        java.io.Writer writer7 = null;
        boolean boolean8 = unicodeEscaper2.translate((int) (byte) -1, writer7);
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper11 = org.apache.commons.lang3.text.translate.UnicodeEscaper.between((int) (byte) 1, (int) '#');
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper13 = org.apache.commons.lang3.text.translate.UnicodeEscaper.below(100);
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper15 = org.apache.commons.lang3.text.translate.UnicodeEscaper.below((int) 'a');
        java.lang.String str17 = unicodeEscaper15.translate((java.lang.CharSequence) "java.io.IOException: java.io.IOException");
        org.apache.commons.lang3.text.translate.CharSequenceTranslator[] charSequenceTranslatorArray18 = new org.apache.commons.lang3.text.translate.CharSequenceTranslator[] { unicodeEscaper11, unicodeEscaper13, unicodeEscaper15 };
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator19 = unicodeEscaper2.with(charSequenceTranslatorArray18);
        java.io.Writer writer21 = null;
        boolean boolean22 = unicodeEscaper2.translate((-1), writer21);
        java.io.Writer writer24 = null;
        // The following exception was thrown during execution in test generation
        try {
            unicodeEscaper2.translate((java.lang.CharSequence) "\\u005C\\u0075\\u0030\\u0030\\u0035\\u0043\\u005C\\u0075\\u0030\\u0030\\u0037\\u0035\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0033\\u005C\\u0075\\u0030\\u0030\\u0033\\u0036\\u005C\\u0075\\u0030\\u0030\\u0035\\u0043\\u005C\\u0075\\u0030\\u0030\\u0037\\u0035\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0033\\u005C\\u0075\\u0030\\u0030\\u0033\\u0034", writer24);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Writer must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(unicodeEscaper2);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(unicodeEscaper11);
        org.junit.Assert.assertNotNull(unicodeEscaper13);
        org.junit.Assert.assertNotNull(unicodeEscaper15);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "java\\u002Eio\\u002E\\u0049\\u004F\\u0045xception\\u003A\\u0020java\\u002Eio\\u002E\\u0049\\u004F\\u0045xception" + "'", str17, "java\\u002Eio\\u002E\\u0049\\u004F\\u0045xception\\u003A\\u0020java\\u002Eio\\u002E\\u0049\\u004F\\u0045xception");
        org.junit.Assert.assertNotNull(charSequenceTranslatorArray18);
        org.junit.Assert.assertNotNull(charSequenceTranslator19);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
    }

    @Test
    public void test00333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00333");
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper2 = org.apache.commons.lang3.text.translate.UnicodeEscaper.outsideOf((int) '4', (int) (byte) 100);
        java.io.Writer writer5 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int6 = unicodeEscaper2.translate((java.lang.CharSequence) "java.io.IOException: ", (int) '#', writer5);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 35");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(unicodeEscaper2);
    }

    @Test
    public void test00334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00334");
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper2 = org.apache.commons.lang3.text.translate.UnicodeEscaper.outsideOf((-1), (int) (byte) -1);
        java.io.Writer writer5 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int6 = unicodeEscaper2.translate((java.lang.CharSequence) "java.io.IOException: \\u0068\\u0069\\u0021", (int) (short) 10, writer5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(unicodeEscaper2);
    }

    @Test
    public void test00335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00335");
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper2 = org.apache.commons.lang3.text.translate.UnicodeEscaper.between((int) ' ', (int) (short) 10);
        java.io.Writer writer5 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int6 = unicodeEscaper2.translate((java.lang.CharSequence) "java.io.IOException: java.io.IOException", (int) 'a', writer5);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 97");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(unicodeEscaper2);
    }

    @Test
    public void test00336() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00336");
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper2 = org.apache.commons.lang3.text.translate.UnicodeEscaper.outsideOf((int) (short) -1, (int) (short) 100);
        java.io.Writer writer5 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int6 = unicodeEscaper2.translate((java.lang.CharSequence) "64", 10, writer5);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 10");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(unicodeEscaper2);
    }

    @Test
    public void test00337() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00337");
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper2 = org.apache.commons.lang3.text.translate.UnicodeEscaper.outsideOf((int) (short) 100, (int) (short) 1);
        java.lang.String str4 = unicodeEscaper2.translate((java.lang.CharSequence) "java.io.IOException: \\u0068\\u0069\\u0021");
        java.io.Writer writer7 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int8 = unicodeEscaper2.translate((java.lang.CharSequence) "java.io.IOException: hi!", (int) (short) 0, writer7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(unicodeEscaper2);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "\\u006A\\u0061\\u0076\\u0061\\u002E\\u0069\\u006F\\u002E\\u0049\\u004F\\u0045\\u0078\\u0063\\u0065\\u0070\\u0074\\u0069\\u006F\\u006E\\u003A\\u0020\\u005C\\u0075\\u0030\\u0030\\u0036\\u0038\\u005C\\u0075\\u0030\\u0030\\u0036\\u0039\\u005C\\u0075\\u0030\\u0030\\u0032\\u0031" + "'", str4, "\\u006A\\u0061\\u0076\\u0061\\u002E\\u0069\\u006F\\u002E\\u0049\\u004F\\u0045\\u0078\\u0063\\u0065\\u0070\\u0074\\u0069\\u006F\\u006E\\u003A\\u0020\\u005C\\u0075\\u0030\\u0030\\u0036\\u0038\\u005C\\u0075\\u0030\\u0030\\u0036\\u0039\\u005C\\u0075\\u0030\\u0030\\u0032\\u0031");
    }

    @Test
    public void test00338() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00338");
        java.io.IOException iOException1 = new java.io.IOException("java.io.IOException: java.io.IOException: java.io.IOException: java.io.IOException: 0");
        java.lang.String str2 = iOException1.toString();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "java.io.IOException: java.io.IOException: java.io.IOException: java.io.IOException: java.io.IOException: 0" + "'", str2, "java.io.IOException: java.io.IOException: java.io.IOException: java.io.IOException: java.io.IOException: 0");
    }

    @Test
    public void test00339() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00339");
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper2 = org.apache.commons.lang3.text.translate.UnicodeEscaper.outsideOf((int) (short) 0, 1);
        java.lang.String str4 = unicodeEscaper2.translate((java.lang.CharSequence) "java.io.IOException: java.io.IOException: java.io.IOException: 0");
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper6 = org.apache.commons.lang3.text.translate.UnicodeEscaper.below((int) 'a');
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper9 = org.apache.commons.lang3.text.translate.UnicodeEscaper.between((int) (byte) 1, (int) '#');
        java.io.Writer writer11 = null;
        boolean boolean12 = unicodeEscaper9.translate((int) '4', writer11);
        java.io.Writer writer14 = null;
        boolean boolean15 = unicodeEscaper9.translate((int) (byte) -1, writer14);
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper18 = org.apache.commons.lang3.text.translate.UnicodeEscaper.between((int) (byte) 1, (int) '#');
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper20 = org.apache.commons.lang3.text.translate.UnicodeEscaper.below(100);
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper22 = org.apache.commons.lang3.text.translate.UnicodeEscaper.below((int) 'a');
        java.lang.String str24 = unicodeEscaper22.translate((java.lang.CharSequence) "java.io.IOException: java.io.IOException");
        org.apache.commons.lang3.text.translate.CharSequenceTranslator[] charSequenceTranslatorArray25 = new org.apache.commons.lang3.text.translate.CharSequenceTranslator[] { unicodeEscaper18, unicodeEscaper20, unicodeEscaper22 };
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator26 = unicodeEscaper9.with(charSequenceTranslatorArray25);
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper29 = org.apache.commons.lang3.text.translate.UnicodeEscaper.outsideOf(0, (int) 'a');
        java.io.Writer writer31 = null;
        boolean boolean32 = unicodeEscaper29.translate((int) (short) 10, writer31);
        java.lang.String str34 = unicodeEscaper29.translate((java.lang.CharSequence) "0");
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper37 = org.apache.commons.lang3.text.translate.UnicodeEscaper.between((int) (byte) 1, (int) '#');
        java.io.Writer writer39 = null;
        boolean boolean40 = unicodeEscaper37.translate((int) '4', writer39);
        java.io.Writer writer42 = null;
        boolean boolean43 = unicodeEscaper37.translate((int) (byte) -1, writer42);
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper46 = org.apache.commons.lang3.text.translate.UnicodeEscaper.between((int) (byte) 1, (int) '#');
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper48 = org.apache.commons.lang3.text.translate.UnicodeEscaper.below(100);
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper50 = org.apache.commons.lang3.text.translate.UnicodeEscaper.below((int) 'a');
        java.lang.String str52 = unicodeEscaper50.translate((java.lang.CharSequence) "java.io.IOException: java.io.IOException");
        org.apache.commons.lang3.text.translate.CharSequenceTranslator[] charSequenceTranslatorArray53 = new org.apache.commons.lang3.text.translate.CharSequenceTranslator[] { unicodeEscaper46, unicodeEscaper48, unicodeEscaper50 };
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator54 = unicodeEscaper37.with(charSequenceTranslatorArray53);
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator55 = unicodeEscaper29.with(charSequenceTranslatorArray53);
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator56 = unicodeEscaper9.with(charSequenceTranslatorArray53);
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator57 = unicodeEscaper6.with(charSequenceTranslatorArray53);
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator58 = unicodeEscaper2.with(charSequenceTranslatorArray53);
        java.lang.Class<?> wildcardClass59 = charSequenceTranslatorArray53.getClass();
        org.junit.Assert.assertNotNull(unicodeEscaper2);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "\\u006A\\u0061\\u0076\\u0061\\u002E\\u0069\\u006F\\u002E\\u0049\\u004F\\u0045\\u0078\\u0063\\u0065\\u0070\\u0074\\u0069\\u006F\\u006E\\u003A\\u0020\\u006A\\u0061\\u0076\\u0061\\u002E\\u0069\\u006F\\u002E\\u0049\\u004F\\u0045\\u0078\\u0063\\u0065\\u0070\\u0074\\u0069\\u006F\\u006E\\u003A\\u0020\\u006A\\u0061\\u0076\\u0061\\u002E\\u0069\\u006F\\u002E\\u0049\\u004F\\u0045\\u0078\\u0063\\u0065\\u0070\\u0074\\u0069\\u006F\\u006E\\u003A\\u0020\\u0030" + "'", str4, "\\u006A\\u0061\\u0076\\u0061\\u002E\\u0069\\u006F\\u002E\\u0049\\u004F\\u0045\\u0078\\u0063\\u0065\\u0070\\u0074\\u0069\\u006F\\u006E\\u003A\\u0020\\u006A\\u0061\\u0076\\u0061\\u002E\\u0069\\u006F\\u002E\\u0049\\u004F\\u0045\\u0078\\u0063\\u0065\\u0070\\u0074\\u0069\\u006F\\u006E\\u003A\\u0020\\u006A\\u0061\\u0076\\u0061\\u002E\\u0069\\u006F\\u002E\\u0049\\u004F\\u0045\\u0078\\u0063\\u0065\\u0070\\u0074\\u0069\\u006F\\u006E\\u003A\\u0020\\u0030");
        org.junit.Assert.assertNotNull(unicodeEscaper6);
        org.junit.Assert.assertNotNull(unicodeEscaper9);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(unicodeEscaper18);
        org.junit.Assert.assertNotNull(unicodeEscaper20);
        org.junit.Assert.assertNotNull(unicodeEscaper22);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "java\\u002Eio\\u002E\\u0049\\u004F\\u0045xception\\u003A\\u0020java\\u002Eio\\u002E\\u0049\\u004F\\u0045xception" + "'", str24, "java\\u002Eio\\u002E\\u0049\\u004F\\u0045xception\\u003A\\u0020java\\u002Eio\\u002E\\u0049\\u004F\\u0045xception");
        org.junit.Assert.assertNotNull(charSequenceTranslatorArray25);
        org.junit.Assert.assertNotNull(charSequenceTranslator26);
        org.junit.Assert.assertNotNull(unicodeEscaper29);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "0" + "'", str34, "0");
        org.junit.Assert.assertNotNull(unicodeEscaper37);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertNotNull(unicodeEscaper46);
        org.junit.Assert.assertNotNull(unicodeEscaper48);
        org.junit.Assert.assertNotNull(unicodeEscaper50);
        org.junit.Assert.assertEquals("'" + str52 + "' != '" + "java\\u002Eio\\u002E\\u0049\\u004F\\u0045xception\\u003A\\u0020java\\u002Eio\\u002E\\u0049\\u004F\\u0045xception" + "'", str52, "java\\u002Eio\\u002E\\u0049\\u004F\\u0045xception\\u003A\\u0020java\\u002Eio\\u002E\\u0049\\u004F\\u0045xception");
        org.junit.Assert.assertNotNull(charSequenceTranslatorArray53);
        org.junit.Assert.assertNotNull(charSequenceTranslator54);
        org.junit.Assert.assertNotNull(charSequenceTranslator55);
        org.junit.Assert.assertNotNull(charSequenceTranslator56);
        org.junit.Assert.assertNotNull(charSequenceTranslator57);
        org.junit.Assert.assertNotNull(charSequenceTranslator58);
        org.junit.Assert.assertNotNull(wildcardClass59);
    }

    @Test
    public void test00340() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00340");
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper2 = org.apache.commons.lang3.text.translate.UnicodeEscaper.between((int) (byte) 100, (int) (short) 100);
        java.lang.String str4 = unicodeEscaper2.translate((java.lang.CharSequence) "hi!");
        java.lang.String str6 = unicodeEscaper2.translate((java.lang.CharSequence) "java.io.IOException: \\u0068\\u0069\\u0021");
        java.io.Writer writer8 = null;
        // The following exception was thrown during execution in test generation
        try {
            unicodeEscaper2.translate((java.lang.CharSequence) "\\u006A\\u0061\\u0076\\u0061\\u002E\\u0069\\u006F\\u002E\\u0049\\u004F\\u0045\\u0078\\u0063\\u0065\\u0070\\u0074\\u0069\\u006F\\u006E\\u003A\\u0020\\u005C\\u0075\\u0030\\u0030\\u0036\\u0038\\u005C\\u0075\\u0030\\u0030\\u0036\\u0039\\u005C\\u0075\\u0030\\u0030\\u0032\\u0031", writer8);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Writer must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(unicodeEscaper2);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "java.io.IOException: \\u0068\\u0069\\u0021" + "'", str6, "java.io.IOException: \\u0068\\u0069\\u0021");
    }

    @Test
    public void test00341() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00341");
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper2 = org.apache.commons.lang3.text.translate.UnicodeEscaper.between((int) (byte) 1, (int) '#');
        java.io.Writer writer4 = null;
        boolean boolean5 = unicodeEscaper2.translate((int) '4', writer4);
        java.io.Writer writer7 = null;
        boolean boolean8 = unicodeEscaper2.translate((int) (byte) -1, writer7);
        java.lang.String str10 = unicodeEscaper2.translate((java.lang.CharSequence) "java.io.IOException");
        java.io.Writer writer12 = null;
        boolean boolean13 = unicodeEscaper2.translate(0, writer12);
        java.io.Writer writer15 = null;
        // The following exception was thrown during execution in test generation
        try {
            unicodeEscaper2.translate((java.lang.CharSequence) "java.io.IOException: java.io.IOException: java.io.IOException", writer15);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Writer must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(unicodeEscaper2);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "java.io.IOException" + "'", str10, "java.io.IOException");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test00342() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00342");
        java.io.IOException iOException2 = new java.io.IOException("");
        java.io.IOException iOException3 = new java.io.IOException((java.lang.Throwable) iOException2);
        java.io.IOException iOException5 = new java.io.IOException("");
        iOException3.addSuppressed((java.lang.Throwable) iOException5);
        java.io.IOException iOException7 = new java.io.IOException("java.io.IOException: 0", (java.lang.Throwable) iOException5);
        java.lang.String str8 = iOException5.toString();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "java.io.IOException: " + "'", str8, "java.io.IOException: ");
    }

    @Test
    public void test00343() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00343");
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper2 = org.apache.commons.lang3.text.translate.UnicodeEscaper.between((int) '4', (int) '#');
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper5 = org.apache.commons.lang3.text.translate.UnicodeEscaper.between((-1), (int) (short) 0);
        java.io.Writer writer8 = null;
        int int9 = unicodeEscaper5.translate((java.lang.CharSequence) "23", (int) (short) 0, writer8);
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper11 = org.apache.commons.lang3.text.translate.UnicodeEscaper.above((int) 'a');
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper13 = org.apache.commons.lang3.text.translate.UnicodeEscaper.below((int) (byte) 0);
        java.io.Writer writer15 = null;
        boolean boolean16 = unicodeEscaper13.translate((int) ' ', writer15);
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper19 = org.apache.commons.lang3.text.translate.UnicodeEscaper.between((-1), (int) (short) 0);
        java.lang.String str21 = unicodeEscaper19.translate((java.lang.CharSequence) "0");
        org.apache.commons.lang3.text.translate.CharSequenceTranslator[] charSequenceTranslatorArray22 = new org.apache.commons.lang3.text.translate.CharSequenceTranslator[] {};
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator23 = unicodeEscaper19.with(charSequenceTranslatorArray22);
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator24 = unicodeEscaper13.with(charSequenceTranslatorArray22);
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator25 = unicodeEscaper11.with(charSequenceTranslatorArray22);
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator26 = unicodeEscaper5.with(charSequenceTranslatorArray22);
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator27 = unicodeEscaper2.with(charSequenceTranslatorArray22);
        java.lang.String str29 = charSequenceTranslator27.translate((java.lang.CharSequence) "java.io.IOException: 0");
        java.io.Writer writer32 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int33 = charSequenceTranslator27.translate((java.lang.CharSequence) "FFFFFFFF", (-1), writer32);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: -1");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(unicodeEscaper2);
        org.junit.Assert.assertNotNull(unicodeEscaper5);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(unicodeEscaper11);
        org.junit.Assert.assertNotNull(unicodeEscaper13);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(unicodeEscaper19);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "0" + "'", str21, "0");
        org.junit.Assert.assertNotNull(charSequenceTranslatorArray22);
        org.junit.Assert.assertNotNull(charSequenceTranslator23);
        org.junit.Assert.assertNotNull(charSequenceTranslator24);
        org.junit.Assert.assertNotNull(charSequenceTranslator25);
        org.junit.Assert.assertNotNull(charSequenceTranslator26);
        org.junit.Assert.assertNotNull(charSequenceTranslator27);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "java.io.IOException: 0" + "'", str29, "java.io.IOException: 0");
    }

    @Test
    public void test00344() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00344");
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper2 = org.apache.commons.lang3.text.translate.UnicodeEscaper.outsideOf(0, (int) 'a');
        java.io.Writer writer4 = null;
        boolean boolean5 = unicodeEscaper2.translate((int) (short) 10, writer4);
        java.lang.String str7 = unicodeEscaper2.translate((java.lang.CharSequence) "0");
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper10 = org.apache.commons.lang3.text.translate.UnicodeEscaper.between((int) (byte) 1, (int) '#');
        java.io.Writer writer12 = null;
        boolean boolean13 = unicodeEscaper10.translate((int) '4', writer12);
        java.io.Writer writer15 = null;
        boolean boolean16 = unicodeEscaper10.translate((int) (byte) -1, writer15);
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper19 = org.apache.commons.lang3.text.translate.UnicodeEscaper.between((int) (byte) 1, (int) '#');
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper21 = org.apache.commons.lang3.text.translate.UnicodeEscaper.below(100);
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper23 = org.apache.commons.lang3.text.translate.UnicodeEscaper.below((int) 'a');
        java.lang.String str25 = unicodeEscaper23.translate((java.lang.CharSequence) "java.io.IOException: java.io.IOException");
        org.apache.commons.lang3.text.translate.CharSequenceTranslator[] charSequenceTranslatorArray26 = new org.apache.commons.lang3.text.translate.CharSequenceTranslator[] { unicodeEscaper19, unicodeEscaper21, unicodeEscaper23 };
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator27 = unicodeEscaper10.with(charSequenceTranslatorArray26);
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator28 = unicodeEscaper2.with(charSequenceTranslatorArray26);
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper31 = org.apache.commons.lang3.text.translate.UnicodeEscaper.between((int) (byte) 1, (int) '#');
        java.lang.String str33 = unicodeEscaper31.translate((java.lang.CharSequence) "\\u006A\\u0061\\u0076\\u0061\\u005C\\u0075\\u0030\\u0030\\u0032\\u0045\\u0069\\u006F\\u005C\\u0075\\u0030\\u0030\\u0032\\u0045\\u005C\\u0075\\u0030\\u0030\\u0034\\u0039\\u005C\\u0075\\u0030\\u0030\\u0034\\u0046\\u005C\\u0075\\u0030\\u0030\\u0034\\u0035\\u0078\\u0063\\u0065\\u0070\\u0074\\u0069\\u006F\\u006E\\u005C\\u0075\\u0030\\u0030\\u0033\\u0041\\u005C\\u0075\\u0030\\u0030\\u0032\\u0030\\u006A\\u0061\\u0076\\u0061\\u005C\\u0075\\u0030\\u0030\\u0032\\u0045\\u0069\\u006F\\u005C\\u0075\\u0030\\u0030\\u0032\\u0045\\u005C\\u0075\\u0030\\u0030\\u0034\\u0039\\u005C\\u0075\\u0030\\u0030\\u0034\\u0046\\u005C\\u0075\\u0030\\u0030\\u0034\\u0035\\u0078\\u0063\\u0065\\u0070\\u0074\\u0069\\u006F\\u006E");
        org.apache.commons.lang3.text.translate.CharSequenceTranslator[] charSequenceTranslatorArray34 = new org.apache.commons.lang3.text.translate.CharSequenceTranslator[] { unicodeEscaper31 };
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator35 = unicodeEscaper2.with(charSequenceTranslatorArray34);
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper37 = org.apache.commons.lang3.text.translate.UnicodeEscaper.below((int) (byte) 0);
        java.io.Writer writer39 = null;
        boolean boolean40 = unicodeEscaper37.translate((int) ' ', writer39);
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper43 = org.apache.commons.lang3.text.translate.UnicodeEscaper.between((-1), (int) (short) 0);
        java.lang.String str45 = unicodeEscaper43.translate((java.lang.CharSequence) "0");
        org.apache.commons.lang3.text.translate.CharSequenceTranslator[] charSequenceTranslatorArray46 = new org.apache.commons.lang3.text.translate.CharSequenceTranslator[] {};
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator47 = unicodeEscaper43.with(charSequenceTranslatorArray46);
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator48 = unicodeEscaper37.with(charSequenceTranslatorArray46);
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator49 = unicodeEscaper2.with(charSequenceTranslatorArray46);
        java.io.Writer writer52 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int53 = charSequenceTranslator49.translate((java.lang.CharSequence) "java.io.IOException: java.io.IOException: java.io.IOException: java.io.IOException: 0", (int) ' ', writer52);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(unicodeEscaper2);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "0" + "'", str7, "0");
        org.junit.Assert.assertNotNull(unicodeEscaper10);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(unicodeEscaper19);
        org.junit.Assert.assertNotNull(unicodeEscaper21);
        org.junit.Assert.assertNotNull(unicodeEscaper23);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "java\\u002Eio\\u002E\\u0049\\u004F\\u0045xception\\u003A\\u0020java\\u002Eio\\u002E\\u0049\\u004F\\u0045xception" + "'", str25, "java\\u002Eio\\u002E\\u0049\\u004F\\u0045xception\\u003A\\u0020java\\u002Eio\\u002E\\u0049\\u004F\\u0045xception");
        org.junit.Assert.assertNotNull(charSequenceTranslatorArray26);
        org.junit.Assert.assertNotNull(charSequenceTranslator27);
        org.junit.Assert.assertNotNull(charSequenceTranslator28);
        org.junit.Assert.assertNotNull(unicodeEscaper31);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "\\u006A\\u0061\\u0076\\u0061\\u005C\\u0075\\u0030\\u0030\\u0032\\u0045\\u0069\\u006F\\u005C\\u0075\\u0030\\u0030\\u0032\\u0045\\u005C\\u0075\\u0030\\u0030\\u0034\\u0039\\u005C\\u0075\\u0030\\u0030\\u0034\\u0046\\u005C\\u0075\\u0030\\u0030\\u0034\\u0035\\u0078\\u0063\\u0065\\u0070\\u0074\\u0069\\u006F\\u006E\\u005C\\u0075\\u0030\\u0030\\u0033\\u0041\\u005C\\u0075\\u0030\\u0030\\u0032\\u0030\\u006A\\u0061\\u0076\\u0061\\u005C\\u0075\\u0030\\u0030\\u0032\\u0045\\u0069\\u006F\\u005C\\u0075\\u0030\\u0030\\u0032\\u0045\\u005C\\u0075\\u0030\\u0030\\u0034\\u0039\\u005C\\u0075\\u0030\\u0030\\u0034\\u0046\\u005C\\u0075\\u0030\\u0030\\u0034\\u0035\\u0078\\u0063\\u0065\\u0070\\u0074\\u0069\\u006F\\u006E" + "'", str33, "\\u006A\\u0061\\u0076\\u0061\\u005C\\u0075\\u0030\\u0030\\u0032\\u0045\\u0069\\u006F\\u005C\\u0075\\u0030\\u0030\\u0032\\u0045\\u005C\\u0075\\u0030\\u0030\\u0034\\u0039\\u005C\\u0075\\u0030\\u0030\\u0034\\u0046\\u005C\\u0075\\u0030\\u0030\\u0034\\u0035\\u0078\\u0063\\u0065\\u0070\\u0074\\u0069\\u006F\\u006E\\u005C\\u0075\\u0030\\u0030\\u0033\\u0041\\u005C\\u0075\\u0030\\u0030\\u0032\\u0030\\u006A\\u0061\\u0076\\u0061\\u005C\\u0075\\u0030\\u0030\\u0032\\u0045\\u0069\\u006F\\u005C\\u0075\\u0030\\u0030\\u0032\\u0045\\u005C\\u0075\\u0030\\u0030\\u0034\\u0039\\u005C\\u0075\\u0030\\u0030\\u0034\\u0046\\u005C\\u0075\\u0030\\u0030\\u0034\\u0035\\u0078\\u0063\\u0065\\u0070\\u0074\\u0069\\u006F\\u006E");
        org.junit.Assert.assertNotNull(charSequenceTranslatorArray34);
        org.junit.Assert.assertNotNull(charSequenceTranslator35);
        org.junit.Assert.assertNotNull(unicodeEscaper37);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertNotNull(unicodeEscaper43);
        org.junit.Assert.assertEquals("'" + str45 + "' != '" + "0" + "'", str45, "0");
        org.junit.Assert.assertNotNull(charSequenceTranslatorArray46);
        org.junit.Assert.assertNotNull(charSequenceTranslator47);
        org.junit.Assert.assertNotNull(charSequenceTranslator48);
        org.junit.Assert.assertNotNull(charSequenceTranslator49);
    }

    @Test
    public void test00345() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00345");
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper2 = org.apache.commons.lang3.text.translate.UnicodeEscaper.between((-1), (int) (short) 0);
        java.io.Writer writer5 = null;
        int int6 = unicodeEscaper2.translate((java.lang.CharSequence) "23", (int) (short) 0, writer5);
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper8 = org.apache.commons.lang3.text.translate.UnicodeEscaper.above((int) 'a');
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper10 = org.apache.commons.lang3.text.translate.UnicodeEscaper.below((int) (byte) 0);
        java.io.Writer writer12 = null;
        boolean boolean13 = unicodeEscaper10.translate((int) ' ', writer12);
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper16 = org.apache.commons.lang3.text.translate.UnicodeEscaper.between((-1), (int) (short) 0);
        java.lang.String str18 = unicodeEscaper16.translate((java.lang.CharSequence) "0");
        org.apache.commons.lang3.text.translate.CharSequenceTranslator[] charSequenceTranslatorArray19 = new org.apache.commons.lang3.text.translate.CharSequenceTranslator[] {};
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator20 = unicodeEscaper16.with(charSequenceTranslatorArray19);
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator21 = unicodeEscaper10.with(charSequenceTranslatorArray19);
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator22 = unicodeEscaper8.with(charSequenceTranslatorArray19);
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator23 = unicodeEscaper2.with(charSequenceTranslatorArray19);
        java.io.Writer writer25 = null;
        // The following exception was thrown during execution in test generation
        try {
            charSequenceTranslator23.translate((java.lang.CharSequence) "\\u006Aa\\u0076a.\\u0069\\u006F.IOE\\u0078\\u0063\\u0065\\u0070\\u0074\\u0069\\u006F\\u006E: \\u006Aa\\u0076a.\\u0069\\u006F.IOE\\u0078\\u0063\\u0065\\u0070\\u0074\\u0069\\u006F\\u006E", writer25);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Writer must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(unicodeEscaper2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(unicodeEscaper8);
        org.junit.Assert.assertNotNull(unicodeEscaper10);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(unicodeEscaper16);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "0" + "'", str18, "0");
        org.junit.Assert.assertNotNull(charSequenceTranslatorArray19);
        org.junit.Assert.assertNotNull(charSequenceTranslator20);
        org.junit.Assert.assertNotNull(charSequenceTranslator21);
        org.junit.Assert.assertNotNull(charSequenceTranslator22);
        org.junit.Assert.assertNotNull(charSequenceTranslator23);
    }

    @Test
    public void test00346() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00346");
        java.io.IOException iOException1 = new java.io.IOException("23");
        java.lang.Class<?> wildcardClass2 = iOException1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test00347() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00347");
        java.io.IOException iOException1 = new java.io.IOException();
        java.io.IOException iOException2 = new java.io.IOException();
        iOException1.addSuppressed((java.lang.Throwable) iOException2);
        java.lang.Throwable[] throwableArray4 = iOException2.getSuppressed();
        java.io.IOException iOException5 = new java.io.IOException("\\u005Cu\\u0030\\u0030\\u0036\\u0038\\u005Cu\\u0030\\u0030\\u0036\\u0039\\u005Cu\\u0030\\u0030\\u0032\\u0031", (java.lang.Throwable) iOException2);
        java.lang.String str6 = iOException5.toString();
        org.junit.Assert.assertNotNull(throwableArray4);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "java.io.IOException: \\u005Cu\\u0030\\u0030\\u0036\\u0038\\u005Cu\\u0030\\u0030\\u0036\\u0039\\u005Cu\\u0030\\u0030\\u0032\\u0031" + "'", str6, "java.io.IOException: \\u005Cu\\u0030\\u0030\\u0036\\u0038\\u005Cu\\u0030\\u0030\\u0036\\u0039\\u005Cu\\u0030\\u0030\\u0032\\u0031");
    }

    @Test
    public void test00348() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00348");
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper1 = org.apache.commons.lang3.text.translate.UnicodeEscaper.below((int) (short) 100);
        java.io.Writer writer3 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean4 = unicodeEscaper1.translate(0, writer3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(unicodeEscaper1);
    }

    @Test
    public void test00349() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00349");
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper2 = org.apache.commons.lang3.text.translate.UnicodeEscaper.outsideOf(10, 10);
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper5 = org.apache.commons.lang3.text.translate.UnicodeEscaper.outsideOf((int) (short) -1, (int) (byte) -1);
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper7 = org.apache.commons.lang3.text.translate.UnicodeEscaper.above((int) 'a');
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper9 = org.apache.commons.lang3.text.translate.UnicodeEscaper.below((int) (byte) 0);
        java.io.Writer writer11 = null;
        boolean boolean12 = unicodeEscaper9.translate((int) ' ', writer11);
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper15 = org.apache.commons.lang3.text.translate.UnicodeEscaper.between((-1), (int) (short) 0);
        java.lang.String str17 = unicodeEscaper15.translate((java.lang.CharSequence) "0");
        org.apache.commons.lang3.text.translate.CharSequenceTranslator[] charSequenceTranslatorArray18 = new org.apache.commons.lang3.text.translate.CharSequenceTranslator[] {};
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator19 = unicodeEscaper15.with(charSequenceTranslatorArray18);
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator20 = unicodeEscaper9.with(charSequenceTranslatorArray18);
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator21 = unicodeEscaper7.with(charSequenceTranslatorArray18);
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper24 = org.apache.commons.lang3.text.translate.UnicodeEscaper.between((int) (byte) 1, (int) '#');
        java.io.Writer writer26 = null;
        boolean boolean27 = unicodeEscaper24.translate((int) '4', writer26);
        java.io.Writer writer29 = null;
        boolean boolean30 = unicodeEscaper24.translate((int) (byte) -1, writer29);
        java.io.Writer writer32 = null;
        boolean boolean33 = unicodeEscaper24.translate((int) (byte) -1, writer32);
        org.apache.commons.lang3.text.translate.CharSequenceTranslator[] charSequenceTranslatorArray34 = new org.apache.commons.lang3.text.translate.CharSequenceTranslator[] {};
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator35 = unicodeEscaper24.with(charSequenceTranslatorArray34);
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator36 = charSequenceTranslator21.with(charSequenceTranslatorArray34);
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator37 = unicodeEscaper5.with(charSequenceTranslatorArray34);
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator38 = unicodeEscaper2.with(charSequenceTranslatorArray34);
        java.io.Writer writer41 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int42 = unicodeEscaper2.translate((java.lang.CharSequence) "\\u005Cu\\u0030\\u0030\\u0033\\u0033\\u005Cu\\u0030\\u0030\\u0033\\u0034", (int) (byte) 10, writer41);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(unicodeEscaper2);
        org.junit.Assert.assertNotNull(unicodeEscaper5);
        org.junit.Assert.assertNotNull(unicodeEscaper7);
        org.junit.Assert.assertNotNull(unicodeEscaper9);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(unicodeEscaper15);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "0" + "'", str17, "0");
        org.junit.Assert.assertNotNull(charSequenceTranslatorArray18);
        org.junit.Assert.assertNotNull(charSequenceTranslator19);
        org.junit.Assert.assertNotNull(charSequenceTranslator20);
        org.junit.Assert.assertNotNull(charSequenceTranslator21);
        org.junit.Assert.assertNotNull(unicodeEscaper24);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertNotNull(charSequenceTranslatorArray34);
        org.junit.Assert.assertNotNull(charSequenceTranslator35);
        org.junit.Assert.assertNotNull(charSequenceTranslator36);
        org.junit.Assert.assertNotNull(charSequenceTranslator37);
        org.junit.Assert.assertNotNull(charSequenceTranslator38);
    }

    @Test
    public void test00350() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00350");
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper1 = org.apache.commons.lang3.text.translate.UnicodeEscaper.below((int) '#');
        java.lang.String str3 = unicodeEscaper1.translate((java.lang.CharSequence) "1");
        java.io.Writer writer6 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int7 = unicodeEscaper1.translate((java.lang.CharSequence) "java.io.IOException: ", (int) (short) -1, writer6);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: -1");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(unicodeEscaper1);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "1" + "'", str3, "1");
    }

    @Test
    public void test00351() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00351");
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper1 = org.apache.commons.lang3.text.translate.UnicodeEscaper.above((int) '#');
        java.io.Writer writer3 = null;
        boolean boolean4 = unicodeEscaper1.translate(0, writer3);
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper6 = org.apache.commons.lang3.text.translate.UnicodeEscaper.below((int) 'a');
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper9 = org.apache.commons.lang3.text.translate.UnicodeEscaper.between((int) (byte) 1, (int) '#');
        java.io.Writer writer11 = null;
        boolean boolean12 = unicodeEscaper9.translate((int) '4', writer11);
        java.io.Writer writer14 = null;
        boolean boolean15 = unicodeEscaper9.translate((int) (byte) -1, writer14);
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper18 = org.apache.commons.lang3.text.translate.UnicodeEscaper.between((int) (byte) 1, (int) '#');
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper20 = org.apache.commons.lang3.text.translate.UnicodeEscaper.below(100);
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper22 = org.apache.commons.lang3.text.translate.UnicodeEscaper.below((int) 'a');
        java.lang.String str24 = unicodeEscaper22.translate((java.lang.CharSequence) "java.io.IOException: java.io.IOException");
        org.apache.commons.lang3.text.translate.CharSequenceTranslator[] charSequenceTranslatorArray25 = new org.apache.commons.lang3.text.translate.CharSequenceTranslator[] { unicodeEscaper18, unicodeEscaper20, unicodeEscaper22 };
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator26 = unicodeEscaper9.with(charSequenceTranslatorArray25);
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper29 = org.apache.commons.lang3.text.translate.UnicodeEscaper.outsideOf(0, (int) 'a');
        java.io.Writer writer31 = null;
        boolean boolean32 = unicodeEscaper29.translate((int) (short) 10, writer31);
        java.lang.String str34 = unicodeEscaper29.translate((java.lang.CharSequence) "0");
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper37 = org.apache.commons.lang3.text.translate.UnicodeEscaper.between((int) (byte) 1, (int) '#');
        java.io.Writer writer39 = null;
        boolean boolean40 = unicodeEscaper37.translate((int) '4', writer39);
        java.io.Writer writer42 = null;
        boolean boolean43 = unicodeEscaper37.translate((int) (byte) -1, writer42);
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper46 = org.apache.commons.lang3.text.translate.UnicodeEscaper.between((int) (byte) 1, (int) '#');
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper48 = org.apache.commons.lang3.text.translate.UnicodeEscaper.below(100);
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper50 = org.apache.commons.lang3.text.translate.UnicodeEscaper.below((int) 'a');
        java.lang.String str52 = unicodeEscaper50.translate((java.lang.CharSequence) "java.io.IOException: java.io.IOException");
        org.apache.commons.lang3.text.translate.CharSequenceTranslator[] charSequenceTranslatorArray53 = new org.apache.commons.lang3.text.translate.CharSequenceTranslator[] { unicodeEscaper46, unicodeEscaper48, unicodeEscaper50 };
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator54 = unicodeEscaper37.with(charSequenceTranslatorArray53);
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator55 = unicodeEscaper29.with(charSequenceTranslatorArray53);
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator56 = unicodeEscaper9.with(charSequenceTranslatorArray53);
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator57 = unicodeEscaper6.with(charSequenceTranslatorArray53);
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator58 = unicodeEscaper1.with(charSequenceTranslatorArray53);
        java.io.Writer writer60 = null;
        // The following exception was thrown during execution in test generation
        try {
            unicodeEscaper1.translate((java.lang.CharSequence) "java.io.IOException: java.io.IOException: java.io.IOException", writer60);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Writer must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(unicodeEscaper1);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(unicodeEscaper6);
        org.junit.Assert.assertNotNull(unicodeEscaper9);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(unicodeEscaper18);
        org.junit.Assert.assertNotNull(unicodeEscaper20);
        org.junit.Assert.assertNotNull(unicodeEscaper22);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "java\\u002Eio\\u002E\\u0049\\u004F\\u0045xception\\u003A\\u0020java\\u002Eio\\u002E\\u0049\\u004F\\u0045xception" + "'", str24, "java\\u002Eio\\u002E\\u0049\\u004F\\u0045xception\\u003A\\u0020java\\u002Eio\\u002E\\u0049\\u004F\\u0045xception");
        org.junit.Assert.assertNotNull(charSequenceTranslatorArray25);
        org.junit.Assert.assertNotNull(charSequenceTranslator26);
        org.junit.Assert.assertNotNull(unicodeEscaper29);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "0" + "'", str34, "0");
        org.junit.Assert.assertNotNull(unicodeEscaper37);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertNotNull(unicodeEscaper46);
        org.junit.Assert.assertNotNull(unicodeEscaper48);
        org.junit.Assert.assertNotNull(unicodeEscaper50);
        org.junit.Assert.assertEquals("'" + str52 + "' != '" + "java\\u002Eio\\u002E\\u0049\\u004F\\u0045xception\\u003A\\u0020java\\u002Eio\\u002E\\u0049\\u004F\\u0045xception" + "'", str52, "java\\u002Eio\\u002E\\u0049\\u004F\\u0045xception\\u003A\\u0020java\\u002Eio\\u002E\\u0049\\u004F\\u0045xception");
        org.junit.Assert.assertNotNull(charSequenceTranslatorArray53);
        org.junit.Assert.assertNotNull(charSequenceTranslator54);
        org.junit.Assert.assertNotNull(charSequenceTranslator55);
        org.junit.Assert.assertNotNull(charSequenceTranslator56);
        org.junit.Assert.assertNotNull(charSequenceTranslator57);
        org.junit.Assert.assertNotNull(charSequenceTranslator58);
    }

    @Test
    public void test00352() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00352");
        java.io.IOException iOException3 = new java.io.IOException("");
        java.io.IOException iOException4 = new java.io.IOException((java.lang.Throwable) iOException3);
        java.io.IOException iOException6 = new java.io.IOException("");
        iOException4.addSuppressed((java.lang.Throwable) iOException6);
        java.io.IOException iOException8 = new java.io.IOException("java.io.IOException", (java.lang.Throwable) iOException6);
        java.io.IOException iOException9 = new java.io.IOException("java.io.IOException: \\u0068\\u0069\\u0021", (java.lang.Throwable) iOException6);
        java.io.IOException iOException10 = new java.io.IOException();
        java.io.IOException iOException11 = new java.io.IOException();
        iOException10.addSuppressed((java.lang.Throwable) iOException11);
        java.lang.Throwable[] throwableArray13 = iOException11.getSuppressed();
        java.lang.Throwable[] throwableArray14 = iOException11.getSuppressed();
        java.io.IOException iOException16 = new java.io.IOException();
        java.io.IOException iOException17 = new java.io.IOException();
        iOException16.addSuppressed((java.lang.Throwable) iOException17);
        java.io.IOException iOException19 = new java.io.IOException("0", (java.lang.Throwable) iOException16);
        java.io.IOException iOException20 = new java.io.IOException((java.lang.Throwable) iOException19);
        iOException11.addSuppressed((java.lang.Throwable) iOException20);
        java.lang.Throwable[] throwableArray22 = iOException11.getSuppressed();
        iOException6.addSuppressed((java.lang.Throwable) iOException11);
        java.lang.String str24 = iOException11.toString();
        org.junit.Assert.assertNotNull(throwableArray13);
        org.junit.Assert.assertNotNull(throwableArray14);
        org.junit.Assert.assertNotNull(throwableArray22);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "java.io.IOException" + "'", str24, "java.io.IOException");
    }

    @Test
    public void test00353() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00353");
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper1 = org.apache.commons.lang3.text.translate.UnicodeEscaper.below((int) (short) 10);
        java.lang.String str3 = unicodeEscaper1.translate((java.lang.CharSequence) "\\u0068\\u0069\\u0021");
        java.io.Writer writer5 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean6 = unicodeEscaper1.translate(1, writer5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(unicodeEscaper1);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\\u0068\\u0069\\u0021" + "'", str3, "\\u0068\\u0069\\u0021");
    }

    @Test
    public void test00354() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00354");
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper0 = new org.apache.commons.lang3.text.translate.UnicodeEscaper();
        java.lang.String str2 = unicodeEscaper0.translate((java.lang.CharSequence) "hi!");
        java.io.Writer writer4 = null;
        boolean boolean5 = unicodeEscaper0.translate((int) (byte) -1, writer4);
        java.lang.String str7 = unicodeEscaper0.translate((java.lang.CharSequence) "");
        java.lang.String str9 = unicodeEscaper0.translate((java.lang.CharSequence) "64");
        java.io.Writer writer12 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int13 = unicodeEscaper0.translate((java.lang.CharSequence) "\\u0068\\u0069\\u0021", (int) 'a', writer12);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 97");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\\u0068\\u0069\\u0021" + "'", str2, "\\u0068\\u0069\\u0021");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "\\u0036\\u0034" + "'", str9, "\\u0036\\u0034");
    }

    @Test
    public void test00355() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00355");
        java.io.IOException iOException3 = new java.io.IOException("0");
        java.lang.Throwable[] throwableArray4 = iOException3.getSuppressed();
        java.io.IOException iOException5 = new java.io.IOException("hi!", (java.lang.Throwable) iOException3);
        java.io.IOException iOException6 = new java.io.IOException("java.io.IOException", (java.lang.Throwable) iOException3);
        java.io.IOException iOException8 = new java.io.IOException();
        java.io.IOException iOException9 = new java.io.IOException();
        iOException8.addSuppressed((java.lang.Throwable) iOException9);
        java.lang.Throwable[] throwableArray11 = iOException9.getSuppressed();
        java.io.IOException iOException12 = new java.io.IOException("\\u005Cu\\u0030\\u0030\\u0036\\u0038\\u005Cu\\u0030\\u0030\\u0036\\u0039\\u005Cu\\u0030\\u0030\\u0032\\u0031", (java.lang.Throwable) iOException9);
        iOException6.addSuppressed((java.lang.Throwable) iOException12);
        java.lang.String str14 = iOException6.toString();
        org.junit.Assert.assertNotNull(throwableArray4);
        org.junit.Assert.assertNotNull(throwableArray11);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "java.io.IOException: java.io.IOException" + "'", str14, "java.io.IOException: java.io.IOException");
    }

    @Test
    public void test00356() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00356");
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper2 = org.apache.commons.lang3.text.translate.UnicodeEscaper.between((int) (byte) 1, (int) '#');
        java.io.Writer writer4 = null;
        boolean boolean5 = unicodeEscaper2.translate((int) '4', writer4);
        java.io.Writer writer7 = null;
        boolean boolean8 = unicodeEscaper2.translate((int) (byte) -1, writer7);
        java.io.Writer writer11 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int12 = unicodeEscaper2.translate((java.lang.CharSequence) "23", 10, writer11);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 10");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(unicodeEscaper2);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test00357() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00357");
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper1 = org.apache.commons.lang3.text.translate.UnicodeEscaper.below((int) (byte) 10);
        org.apache.commons.lang3.text.translate.CharSequenceTranslator[] charSequenceTranslatorArray2 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator3 = unicodeEscaper1.with(charSequenceTranslatorArray2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(unicodeEscaper1);
    }

    @Test
    public void test00358() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00358");
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper1 = org.apache.commons.lang3.text.translate.UnicodeEscaper.above((int) (byte) 100);
        java.io.Writer writer4 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int5 = unicodeEscaper1.translate((java.lang.CharSequence) "\\u006A\\u0061\\u0076\\u0061\\u005C\\u0075\\u0030\\u0030\\u0032\\u0045\\u0069\\u006F\\u005C\\u0075\\u0030\\u0030\\u0032\\u0045\\u005C\\u0075\\u0030\\u0030\\u0034\\u0039\\u005C\\u0075\\u0030\\u0030\\u0034\\u0046\\u005C\\u0075\\u0030\\u0030\\u0034\\u0035\\u0078\\u0063\\u0065\\u0070\\u0074\\u0069\\u006F\\u006E\\u005C\\u0075\\u0030\\u0030\\u0033\\u0041\\u005C\\u0075\\u0030\\u0030\\u0032\\u0030\\u006A\\u0061\\u0076\\u0061\\u005C\\u0075\\u0030\\u0030\\u0032\\u0045\\u0069\\u006F\\u005C\\u0075\\u0030\\u0030\\u0032\\u0045\\u005C\\u0075\\u0030\\u0030\\u0034\\u0039\\u005C\\u0075\\u0030\\u0030\\u0034\\u0046\\u005C\\u0075\\u0030\\u0030\\u0034\\u0035\\u0078\\u0063\\u0065\\u0070\\u0074\\u0069\\u006F\\u006E", (int) (short) -1, writer4);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: -1");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(unicodeEscaper1);
    }

    @Test
    public void test00359() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00359");
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper2 = org.apache.commons.lang3.text.translate.UnicodeEscaper.between((int) (short) 1, (int) (short) 100);
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper5 = org.apache.commons.lang3.text.translate.UnicodeEscaper.between((int) 'a', (int) (byte) 100);
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper8 = org.apache.commons.lang3.text.translate.UnicodeEscaper.between((-1), (int) (short) 0);
        java.io.Writer writer11 = null;
        int int12 = unicodeEscaper8.translate((java.lang.CharSequence) "23", (int) (short) 0, writer11);
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper14 = org.apache.commons.lang3.text.translate.UnicodeEscaper.above((int) 'a');
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper16 = org.apache.commons.lang3.text.translate.UnicodeEscaper.below((int) (byte) 0);
        java.io.Writer writer18 = null;
        boolean boolean19 = unicodeEscaper16.translate((int) ' ', writer18);
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper22 = org.apache.commons.lang3.text.translate.UnicodeEscaper.between((-1), (int) (short) 0);
        java.lang.String str24 = unicodeEscaper22.translate((java.lang.CharSequence) "0");
        org.apache.commons.lang3.text.translate.CharSequenceTranslator[] charSequenceTranslatorArray25 = new org.apache.commons.lang3.text.translate.CharSequenceTranslator[] {};
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator26 = unicodeEscaper22.with(charSequenceTranslatorArray25);
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator27 = unicodeEscaper16.with(charSequenceTranslatorArray25);
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator28 = unicodeEscaper14.with(charSequenceTranslatorArray25);
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator29 = unicodeEscaper8.with(charSequenceTranslatorArray25);
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper31 = org.apache.commons.lang3.text.translate.UnicodeEscaper.below((int) (byte) 0);
        java.io.Writer writer33 = null;
        boolean boolean34 = unicodeEscaper31.translate((int) ' ', writer33);
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper37 = org.apache.commons.lang3.text.translate.UnicodeEscaper.between((-1), (int) (short) 0);
        java.lang.String str39 = unicodeEscaper37.translate((java.lang.CharSequence) "0");
        org.apache.commons.lang3.text.translate.CharSequenceTranslator[] charSequenceTranslatorArray40 = new org.apache.commons.lang3.text.translate.CharSequenceTranslator[] {};
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator41 = unicodeEscaper37.with(charSequenceTranslatorArray40);
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator42 = unicodeEscaper31.with(charSequenceTranslatorArray40);
        java.io.Writer writer44 = null;
        boolean boolean45 = unicodeEscaper31.translate((int) (byte) 1, writer44);
        java.io.Writer writer47 = null;
        boolean boolean48 = unicodeEscaper31.translate((int) (byte) 100, writer47);
        java.io.Writer writer50 = null;
        boolean boolean51 = unicodeEscaper31.translate((int) '4', writer50);
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper53 = org.apache.commons.lang3.text.translate.UnicodeEscaper.above((int) (byte) 1);
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper55 = org.apache.commons.lang3.text.translate.UnicodeEscaper.above(100);
        org.apache.commons.lang3.text.translate.CharSequenceTranslator[] charSequenceTranslatorArray56 = new org.apache.commons.lang3.text.translate.CharSequenceTranslator[] { unicodeEscaper5, charSequenceTranslator29, unicodeEscaper31, unicodeEscaper53, unicodeEscaper55 };
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator57 = unicodeEscaper2.with(charSequenceTranslatorArray56);
        java.io.Writer writer60 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int61 = unicodeEscaper2.translate((java.lang.CharSequence) "\\\\u00750068\\\\u00750069\\\\u00750021", (int) (byte) 100, writer60);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 100");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(unicodeEscaper2);
        org.junit.Assert.assertNotNull(unicodeEscaper5);
        org.junit.Assert.assertNotNull(unicodeEscaper8);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(unicodeEscaper14);
        org.junit.Assert.assertNotNull(unicodeEscaper16);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(unicodeEscaper22);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "0" + "'", str24, "0");
        org.junit.Assert.assertNotNull(charSequenceTranslatorArray25);
        org.junit.Assert.assertNotNull(charSequenceTranslator26);
        org.junit.Assert.assertNotNull(charSequenceTranslator27);
        org.junit.Assert.assertNotNull(charSequenceTranslator28);
        org.junit.Assert.assertNotNull(charSequenceTranslator29);
        org.junit.Assert.assertNotNull(unicodeEscaper31);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertNotNull(unicodeEscaper37);
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "0" + "'", str39, "0");
        org.junit.Assert.assertNotNull(charSequenceTranslatorArray40);
        org.junit.Assert.assertNotNull(charSequenceTranslator41);
        org.junit.Assert.assertNotNull(charSequenceTranslator42);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertNotNull(unicodeEscaper53);
        org.junit.Assert.assertNotNull(unicodeEscaper55);
        org.junit.Assert.assertNotNull(charSequenceTranslatorArray56);
        org.junit.Assert.assertNotNull(charSequenceTranslator57);
    }

    @Test
    public void test00360() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00360");
        java.io.IOException iOException3 = new java.io.IOException("");
        java.io.IOException iOException4 = new java.io.IOException("A", (java.lang.Throwable) iOException3);
        java.lang.Throwable[] throwableArray5 = iOException3.getSuppressed();
        java.io.IOException iOException6 = new java.io.IOException("java\\u002Eio\\u002E\\u0049\\u004F\\u0045xception\\u003A\\u0020java\\u002Eio\\u002E\\u0049\\u004F\\u0045xception", (java.lang.Throwable) iOException3);
        java.lang.String str7 = iOException6.toString();
        org.junit.Assert.assertNotNull(throwableArray5);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "java.io.IOException: java\\u002Eio\\u002E\\u0049\\u004F\\u0045xception\\u003A\\u0020java\\u002Eio\\u002E\\u0049\\u004F\\u0045xception" + "'", str7, "java.io.IOException: java\\u002Eio\\u002E\\u0049\\u004F\\u0045xception\\u003A\\u0020java\\u002Eio\\u002E\\u0049\\u004F\\u0045xception");
    }

    @Test
    public void test00361() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00361");
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper2 = org.apache.commons.lang3.text.translate.UnicodeEscaper.outsideOf((int) (byte) -1, (int) (byte) 10);
        java.io.Writer writer5 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int6 = unicodeEscaper2.translate((java.lang.CharSequence) "34", (int) '#', writer5);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 35");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(unicodeEscaper2);
    }

    @Test
    public void test00362() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00362");
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper1 = org.apache.commons.lang3.text.translate.UnicodeEscaper.above((int) (short) 0);
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper4 = org.apache.commons.lang3.text.translate.UnicodeEscaper.outsideOf((int) '#', 100);
        java.lang.String str6 = unicodeEscaper4.translate((java.lang.CharSequence) "java.io.IOException: java.io.IOException");
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper9 = org.apache.commons.lang3.text.translate.UnicodeEscaper.between((int) '4', (int) (short) 1);
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper12 = org.apache.commons.lang3.text.translate.UnicodeEscaper.between((-1), (int) (byte) -1);
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper15 = org.apache.commons.lang3.text.translate.UnicodeEscaper.outsideOf((int) '4', (int) (short) 0);
        org.apache.commons.lang3.text.translate.CharSequenceTranslator[] charSequenceTranslatorArray16 = new org.apache.commons.lang3.text.translate.CharSequenceTranslator[] { unicodeEscaper15 };
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator17 = unicodeEscaper12.with(charSequenceTranslatorArray16);
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator18 = unicodeEscaper9.with(charSequenceTranslatorArray16);
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator19 = unicodeEscaper4.with(charSequenceTranslatorArray16);
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator20 = unicodeEscaper1.with(charSequenceTranslatorArray16);
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper23 = org.apache.commons.lang3.text.translate.UnicodeEscaper.between((int) (byte) -1, (int) (short) 0);
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper26 = org.apache.commons.lang3.text.translate.UnicodeEscaper.between((int) (byte) 1, (int) '#');
        java.io.Writer writer28 = null;
        boolean boolean29 = unicodeEscaper26.translate((int) '4', writer28);
        java.io.Writer writer31 = null;
        boolean boolean32 = unicodeEscaper26.translate((int) (byte) -1, writer31);
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper35 = org.apache.commons.lang3.text.translate.UnicodeEscaper.between((int) (byte) 1, (int) '#');
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper37 = org.apache.commons.lang3.text.translate.UnicodeEscaper.below(100);
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper39 = org.apache.commons.lang3.text.translate.UnicodeEscaper.below((int) 'a');
        java.lang.String str41 = unicodeEscaper39.translate((java.lang.CharSequence) "java.io.IOException: java.io.IOException");
        org.apache.commons.lang3.text.translate.CharSequenceTranslator[] charSequenceTranslatorArray42 = new org.apache.commons.lang3.text.translate.CharSequenceTranslator[] { unicodeEscaper35, unicodeEscaper37, unicodeEscaper39 };
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator43 = unicodeEscaper26.with(charSequenceTranslatorArray42);
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator44 = unicodeEscaper23.with(charSequenceTranslatorArray42);
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator45 = unicodeEscaper1.with(charSequenceTranslatorArray42);
        java.io.Writer writer47 = null;
        // The following exception was thrown during execution in test generation
        try {
            charSequenceTranslator45.translate((java.lang.CharSequence) "java.io.IOException: \\u0068\\u0069\\u0021", writer47);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Writer must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(unicodeEscaper1);
        org.junit.Assert.assertNotNull(unicodeEscaper4);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "\\u006Aa\\u0076a.\\u0069\\u006F.IOE\\u0078c\\u0065\\u0070\\u0074\\u0069\\u006F\\u006E:\\u0020\\u006Aa\\u0076a.\\u0069\\u006F.IOE\\u0078c\\u0065\\u0070\\u0074\\u0069\\u006F\\u006E" + "'", str6, "\\u006Aa\\u0076a.\\u0069\\u006F.IOE\\u0078c\\u0065\\u0070\\u0074\\u0069\\u006F\\u006E:\\u0020\\u006Aa\\u0076a.\\u0069\\u006F.IOE\\u0078c\\u0065\\u0070\\u0074\\u0069\\u006F\\u006E");
        org.junit.Assert.assertNotNull(unicodeEscaper9);
        org.junit.Assert.assertNotNull(unicodeEscaper12);
        org.junit.Assert.assertNotNull(unicodeEscaper15);
        org.junit.Assert.assertNotNull(charSequenceTranslatorArray16);
        org.junit.Assert.assertNotNull(charSequenceTranslator17);
        org.junit.Assert.assertNotNull(charSequenceTranslator18);
        org.junit.Assert.assertNotNull(charSequenceTranslator19);
        org.junit.Assert.assertNotNull(charSequenceTranslator20);
        org.junit.Assert.assertNotNull(unicodeEscaper23);
        org.junit.Assert.assertNotNull(unicodeEscaper26);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertNotNull(unicodeEscaper35);
        org.junit.Assert.assertNotNull(unicodeEscaper37);
        org.junit.Assert.assertNotNull(unicodeEscaper39);
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "java\\u002Eio\\u002E\\u0049\\u004F\\u0045xception\\u003A\\u0020java\\u002Eio\\u002E\\u0049\\u004F\\u0045xception" + "'", str41, "java\\u002Eio\\u002E\\u0049\\u004F\\u0045xception\\u003A\\u0020java\\u002Eio\\u002E\\u0049\\u004F\\u0045xception");
        org.junit.Assert.assertNotNull(charSequenceTranslatorArray42);
        org.junit.Assert.assertNotNull(charSequenceTranslator43);
        org.junit.Assert.assertNotNull(charSequenceTranslator44);
        org.junit.Assert.assertNotNull(charSequenceTranslator45);
    }

    @Test
    public void test00363() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00363");
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper2 = org.apache.commons.lang3.text.translate.UnicodeEscaper.outsideOf((int) '4', 0);
        java.io.Writer writer4 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean5 = unicodeEscaper2.translate((int) (byte) 1, writer4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(unicodeEscaper2);
    }

    @Test
    public void test00364() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00364");
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper2 = org.apache.commons.lang3.text.translate.UnicodeEscaper.outsideOf(10, 10);
        java.io.Writer writer4 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean5 = unicodeEscaper2.translate(1, writer4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(unicodeEscaper2);
    }

    @Test
    public void test00365() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00365");
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper2 = org.apache.commons.lang3.text.translate.UnicodeEscaper.between((int) (short) -1, (int) 'a');
        java.io.Writer writer4 = null;
        // The following exception was thrown during execution in test generation
        try {
            unicodeEscaper2.translate((java.lang.CharSequence) "\\u006A\\u0061\\u0076\\u0061\\u002E\\u0069\\u006F\\u002E\\u0049\\u004F\\u0045\\u0078\\u0063\\u0065\\u0070\\u0074\\u0069\\u006F\\u006E\\u003A\\u0020\\u006A\\u0061\\u0076\\u0061\\u002E\\u0069\\u006F\\u002E\\u0049\\u004F\\u0045\\u0078\\u0063\\u0065\\u0070\\u0074\\u0069\\u006F\\u006E", writer4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Writer must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(unicodeEscaper2);
    }

    @Test
    public void test00366() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00366");
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper1 = org.apache.commons.lang3.text.translate.UnicodeEscaper.above((int) (short) 0);
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper4 = org.apache.commons.lang3.text.translate.UnicodeEscaper.outsideOf((int) '#', 100);
        java.lang.String str6 = unicodeEscaper4.translate((java.lang.CharSequence) "java.io.IOException: java.io.IOException");
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper9 = org.apache.commons.lang3.text.translate.UnicodeEscaper.between((int) '4', (int) (short) 1);
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper12 = org.apache.commons.lang3.text.translate.UnicodeEscaper.between((-1), (int) (byte) -1);
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper15 = org.apache.commons.lang3.text.translate.UnicodeEscaper.outsideOf((int) '4', (int) (short) 0);
        org.apache.commons.lang3.text.translate.CharSequenceTranslator[] charSequenceTranslatorArray16 = new org.apache.commons.lang3.text.translate.CharSequenceTranslator[] { unicodeEscaper15 };
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator17 = unicodeEscaper12.with(charSequenceTranslatorArray16);
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator18 = unicodeEscaper9.with(charSequenceTranslatorArray16);
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator19 = unicodeEscaper4.with(charSequenceTranslatorArray16);
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator20 = unicodeEscaper1.with(charSequenceTranslatorArray16);
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper23 = org.apache.commons.lang3.text.translate.UnicodeEscaper.between((int) (byte) -1, (int) (short) 0);
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper26 = org.apache.commons.lang3.text.translate.UnicodeEscaper.between((int) (byte) 1, (int) '#');
        java.io.Writer writer28 = null;
        boolean boolean29 = unicodeEscaper26.translate((int) '4', writer28);
        java.io.Writer writer31 = null;
        boolean boolean32 = unicodeEscaper26.translate((int) (byte) -1, writer31);
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper35 = org.apache.commons.lang3.text.translate.UnicodeEscaper.between((int) (byte) 1, (int) '#');
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper37 = org.apache.commons.lang3.text.translate.UnicodeEscaper.below(100);
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper39 = org.apache.commons.lang3.text.translate.UnicodeEscaper.below((int) 'a');
        java.lang.String str41 = unicodeEscaper39.translate((java.lang.CharSequence) "java.io.IOException: java.io.IOException");
        org.apache.commons.lang3.text.translate.CharSequenceTranslator[] charSequenceTranslatorArray42 = new org.apache.commons.lang3.text.translate.CharSequenceTranslator[] { unicodeEscaper35, unicodeEscaper37, unicodeEscaper39 };
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator43 = unicodeEscaper26.with(charSequenceTranslatorArray42);
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator44 = unicodeEscaper23.with(charSequenceTranslatorArray42);
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator45 = unicodeEscaper1.with(charSequenceTranslatorArray42);
        java.io.Writer writer48 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int49 = unicodeEscaper1.translate((java.lang.CharSequence) "", (-1), writer48);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: -1");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(unicodeEscaper1);
        org.junit.Assert.assertNotNull(unicodeEscaper4);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "\\u006Aa\\u0076a.\\u0069\\u006F.IOE\\u0078c\\u0065\\u0070\\u0074\\u0069\\u006F\\u006E:\\u0020\\u006Aa\\u0076a.\\u0069\\u006F.IOE\\u0078c\\u0065\\u0070\\u0074\\u0069\\u006F\\u006E" + "'", str6, "\\u006Aa\\u0076a.\\u0069\\u006F.IOE\\u0078c\\u0065\\u0070\\u0074\\u0069\\u006F\\u006E:\\u0020\\u006Aa\\u0076a.\\u0069\\u006F.IOE\\u0078c\\u0065\\u0070\\u0074\\u0069\\u006F\\u006E");
        org.junit.Assert.assertNotNull(unicodeEscaper9);
        org.junit.Assert.assertNotNull(unicodeEscaper12);
        org.junit.Assert.assertNotNull(unicodeEscaper15);
        org.junit.Assert.assertNotNull(charSequenceTranslatorArray16);
        org.junit.Assert.assertNotNull(charSequenceTranslator17);
        org.junit.Assert.assertNotNull(charSequenceTranslator18);
        org.junit.Assert.assertNotNull(charSequenceTranslator19);
        org.junit.Assert.assertNotNull(charSequenceTranslator20);
        org.junit.Assert.assertNotNull(unicodeEscaper23);
        org.junit.Assert.assertNotNull(unicodeEscaper26);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertNotNull(unicodeEscaper35);
        org.junit.Assert.assertNotNull(unicodeEscaper37);
        org.junit.Assert.assertNotNull(unicodeEscaper39);
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "java\\u002Eio\\u002E\\u0049\\u004F\\u0045xception\\u003A\\u0020java\\u002Eio\\u002E\\u0049\\u004F\\u0045xception" + "'", str41, "java\\u002Eio\\u002E\\u0049\\u004F\\u0045xception\\u003A\\u0020java\\u002Eio\\u002E\\u0049\\u004F\\u0045xception");
        org.junit.Assert.assertNotNull(charSequenceTranslatorArray42);
        org.junit.Assert.assertNotNull(charSequenceTranslator43);
        org.junit.Assert.assertNotNull(charSequenceTranslator44);
        org.junit.Assert.assertNotNull(charSequenceTranslator45);
    }

    @Test
    public void test00367() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00367");
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper2 = org.apache.commons.lang3.text.translate.UnicodeEscaper.between((-1), (int) (byte) 10);
        java.lang.CharSequence charSequence3 = null;
        java.io.Writer writer5 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int6 = unicodeEscaper2.translate(charSequence3, 10, writer5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(unicodeEscaper2);
    }

    @Test
    public void test00368() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00368");
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper2 = org.apache.commons.lang3.text.translate.UnicodeEscaper.between((int) (byte) 100, (int) (short) 100);
        java.lang.String str4 = unicodeEscaper2.translate((java.lang.CharSequence) "hi!");
        java.lang.Class<?> wildcardClass5 = unicodeEscaper2.getClass();
        org.junit.Assert.assertNotNull(unicodeEscaper2);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test00369() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00369");
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper2 = org.apache.commons.lang3.text.translate.UnicodeEscaper.between(1, (int) (short) 0);
        java.io.Writer writer5 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int6 = unicodeEscaper2.translate((java.lang.CharSequence) "", 100, writer5);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 100");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(unicodeEscaper2);
    }

    @Test
    public void test00370() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00370");
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper1 = org.apache.commons.lang3.text.translate.UnicodeEscaper.above((int) ' ');
        java.io.Writer writer3 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean4 = unicodeEscaper1.translate((int) (short) -1, writer3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(unicodeEscaper1);
    }

    @Test
    public void test00371() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00371");
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper2 = org.apache.commons.lang3.text.translate.UnicodeEscaper.between((int) 'a', (int) (byte) 0);
        java.io.Writer writer4 = null;
        boolean boolean5 = unicodeEscaper2.translate(100, writer4);
        java.io.Writer writer8 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int9 = unicodeEscaper2.translate((java.lang.CharSequence) "java\\u002Eio\\u002E\\u0049\\u004F\\u0045xception\\u003A\\u0020java\\u002Eio\\u002E\\u0049\\u004F\\u0045xception", (int) (byte) 100, writer8);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 100");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(unicodeEscaper2);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test00372() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00372");
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper2 = org.apache.commons.lang3.text.translate.UnicodeEscaper.outsideOf(1, (int) ' ');
        java.io.Writer writer4 = null;
        boolean boolean5 = unicodeEscaper2.translate((int) (byte) 1, writer4);
        java.io.Writer writer7 = null;
        // The following exception was thrown during execution in test generation
        try {
            unicodeEscaper2.translate((java.lang.CharSequence) "\\u006Aa\\u0076a.\\u0069\\u006F.IOE\\u0078c\\u0065\\u0070\\u0074\\u0069\\u006F\\u006E: \\u006Aa\\u0076a.\\u0069\\u006F.IOE\\u0078c\\u0065\\u0070\\u0074\\u0069\\u006F\\u006E", writer7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Writer must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(unicodeEscaper2);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test00373() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00373");
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper2 = org.apache.commons.lang3.text.translate.UnicodeEscaper.outsideOf(100, 0);
        java.io.Writer writer4 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean5 = unicodeEscaper2.translate(0, writer4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(unicodeEscaper2);
    }

    @Test
    public void test00374() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00374");
        java.io.IOException iOException3 = new java.io.IOException("0");
        java.lang.Throwable[] throwableArray4 = iOException3.getSuppressed();
        java.io.IOException iOException5 = new java.io.IOException("hi!", (java.lang.Throwable) iOException3);
        java.io.IOException iOException7 = new java.io.IOException("");
        java.io.IOException iOException8 = new java.io.IOException((java.lang.Throwable) iOException7);
        java.io.IOException iOException10 = new java.io.IOException("");
        iOException8.addSuppressed((java.lang.Throwable) iOException10);
        java.io.IOException iOException13 = new java.io.IOException("");
        java.io.IOException iOException14 = new java.io.IOException((java.lang.Throwable) iOException13);
        java.io.IOException iOException16 = new java.io.IOException("");
        iOException14.addSuppressed((java.lang.Throwable) iOException16);
        iOException8.addSuppressed((java.lang.Throwable) iOException14);
        iOException5.addSuppressed((java.lang.Throwable) iOException8);
        java.io.IOException iOException20 = new java.io.IOException("hi!", (java.lang.Throwable) iOException8);
        java.lang.String str21 = iOException8.toString();
        org.junit.Assert.assertNotNull(throwableArray4);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "java.io.IOException: java.io.IOException: " + "'", str21, "java.io.IOException: java.io.IOException: ");
    }

    @Test
    public void test00375() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00375");
        java.io.IOException iOException1 = new java.io.IOException("0");
        java.io.IOException iOException2 = new java.io.IOException((java.lang.Throwable) iOException1);
        java.lang.Throwable[] throwableArray3 = iOException2.getSuppressed();
        java.lang.Throwable[] throwableArray4 = iOException2.getSuppressed();
        java.io.IOException iOException5 = new java.io.IOException((java.lang.Throwable) iOException2);
        java.lang.String str6 = iOException5.toString();
        org.junit.Assert.assertNotNull(throwableArray3);
        org.junit.Assert.assertNotNull(throwableArray4);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "java.io.IOException: java.io.IOException: java.io.IOException: 0" + "'", str6, "java.io.IOException: java.io.IOException: java.io.IOException: 0");
    }

    @Test
    public void test00376() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00376");
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper2 = org.apache.commons.lang3.text.translate.UnicodeEscaper.outsideOf((int) (short) 1, (int) (byte) -1);
        java.io.Writer writer5 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int6 = unicodeEscaper2.translate((java.lang.CharSequence) "\\u006A\\u0061\\u0076\\u0061\\u002E\\u0069\\u006F\\u002E\\u0049\\u004F\\u0045\\u0078\\u0063\\u0065\\u0070\\u0074\\u0069\\u006F\\u006E\\u003A\\u0020\\u005C\\u0075\\u0030\\u0030\\u0036\\u0038\\u005C\\u0075\\u0030\\u0030\\u0036\\u0039\\u005C\\u0075\\u0030\\u0030\\u0032\\u0031", (int) '#', writer5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(unicodeEscaper2);
    }

    @Test
    public void test00377() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00377");
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper2 = org.apache.commons.lang3.text.translate.UnicodeEscaper.outsideOf((int) 'a', 0);
        java.io.Writer writer4 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean5 = unicodeEscaper2.translate(0, writer4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(unicodeEscaper2);
    }

    @Test
    public void test00378() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00378");
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper2 = org.apache.commons.lang3.text.translate.UnicodeEscaper.outsideOf(0, (int) 'a');
        java.io.Writer writer5 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int6 = unicodeEscaper2.translate((java.lang.CharSequence) "java.io.IOException: 0", (int) '4', writer5);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 52");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(unicodeEscaper2);
    }

    @Test
    public void test00379() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00379");
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper2 = org.apache.commons.lang3.text.translate.UnicodeEscaper.between((int) (short) 1, (int) '4');
        java.io.Writer writer5 = null;
        int int6 = unicodeEscaper2.translate((java.lang.CharSequence) "\\u006A\\u0061\\u0076\\u0061\\u002E\\u0069\\u006F\\u002E\\u0049\\u004F\\u0045\\u0078\\u0063\\u0065\\u0070\\u0074\\u0069\\u006F\\u006E\\u003A\\u0020", (int) 'a', writer5);
        java.lang.Class<?> wildcardClass7 = unicodeEscaper2.getClass();
        org.junit.Assert.assertNotNull(unicodeEscaper2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test00380() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00380");
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper2 = org.apache.commons.lang3.text.translate.UnicodeEscaper.between((int) (short) -1, 100);
        java.io.Writer writer4 = null;
        // The following exception was thrown during execution in test generation
        try {
            unicodeEscaper2.translate((java.lang.CharSequence) "\\\\u0075006Aa\\\\u00750076a.\\\\u00750069\\\\u0075006F.IOE\\\\u00750078\\u0063\\\\u00750065\\\\u00750070\\\\u00750074\\\\u00750069\\\\u0075006F\\\\u0075006E: \\\\u0075006Aa\\\\u00750076a.\\\\u00750069\\\\u0075006F.IOE\\\\u00750078\\u0063\\\\u00750065\\\\u00750070\\\\u00750074\\\\u00750069\\\\u0075006F\\\\u0075006E", writer4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Writer must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(unicodeEscaper2);
    }

    @Test
    public void test00381() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00381");
        java.io.IOException iOException3 = new java.io.IOException();
        java.io.IOException iOException4 = new java.io.IOException();
        iOException3.addSuppressed((java.lang.Throwable) iOException4);
        java.io.IOException iOException6 = new java.io.IOException();
        java.io.IOException iOException7 = new java.io.IOException();
        iOException6.addSuppressed((java.lang.Throwable) iOException7);
        java.lang.Throwable[] throwableArray9 = iOException7.getSuppressed();
        java.io.IOException iOException10 = new java.io.IOException((java.lang.Throwable) iOException7);
        java.io.IOException iOException12 = new java.io.IOException("");
        java.io.IOException iOException13 = new java.io.IOException((java.lang.Throwable) iOException12);
        iOException7.addSuppressed((java.lang.Throwable) iOException13);
        iOException4.addSuppressed((java.lang.Throwable) iOException13);
        java.io.IOException iOException16 = new java.io.IOException("java.io.IOException", (java.lang.Throwable) iOException13);
        java.io.IOException iOException17 = new java.io.IOException("64", (java.lang.Throwable) iOException16);
        java.io.IOException iOException18 = new java.io.IOException("java.io.IOException: java.io.IOException: ", (java.lang.Throwable) iOException17);
        java.lang.String str19 = iOException18.toString();
        org.junit.Assert.assertNotNull(throwableArray9);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "java.io.IOException: java.io.IOException: java.io.IOException: " + "'", str19, "java.io.IOException: java.io.IOException: java.io.IOException: ");
    }

    @Test
    public void test00382() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00382");
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper2 = org.apache.commons.lang3.text.translate.UnicodeEscaper.between((int) (byte) 0, (int) 'a');
        java.io.Writer writer4 = null;
        boolean boolean5 = unicodeEscaper2.translate(100, writer4);
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper8 = org.apache.commons.lang3.text.translate.UnicodeEscaper.between((-1), (int) (byte) -1);
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper11 = org.apache.commons.lang3.text.translate.UnicodeEscaper.outsideOf((int) '4', (int) (short) 0);
        org.apache.commons.lang3.text.translate.CharSequenceTranslator[] charSequenceTranslatorArray12 = new org.apache.commons.lang3.text.translate.CharSequenceTranslator[] { unicodeEscaper11 };
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator13 = unicodeEscaper8.with(charSequenceTranslatorArray12);
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator14 = unicodeEscaper2.with(charSequenceTranslatorArray12);
        java.lang.CharSequence charSequence15 = null;
        java.io.Writer writer17 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int18 = unicodeEscaper2.translate(charSequence15, 0, writer17);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(unicodeEscaper2);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(unicodeEscaper8);
        org.junit.Assert.assertNotNull(unicodeEscaper11);
        org.junit.Assert.assertNotNull(charSequenceTranslatorArray12);
        org.junit.Assert.assertNotNull(charSequenceTranslator13);
        org.junit.Assert.assertNotNull(charSequenceTranslator14);
    }

    @Test
    public void test00383() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00383");
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper2 = org.apache.commons.lang3.text.translate.UnicodeEscaper.outsideOf((int) (short) -1, 0);
        java.io.Writer writer4 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean5 = unicodeEscaper2.translate((int) (short) 100, writer4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(unicodeEscaper2);
    }

    @Test
    public void test00384() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00384");
        java.io.IOException iOException2 = new java.io.IOException();
        java.io.IOException iOException3 = new java.io.IOException();
        iOException2.addSuppressed((java.lang.Throwable) iOException3);
        java.lang.Throwable[] throwableArray5 = iOException3.getSuppressed();
        java.lang.Throwable[] throwableArray6 = iOException3.getSuppressed();
        java.io.IOException iOException7 = new java.io.IOException("java.io.IOException", (java.lang.Throwable) iOException3);
        java.io.IOException iOException8 = new java.io.IOException();
        java.io.IOException iOException9 = new java.io.IOException();
        iOException8.addSuppressed((java.lang.Throwable) iOException9);
        java.io.IOException iOException11 = new java.io.IOException((java.lang.Throwable) iOException8);
        java.lang.Throwable[] throwableArray12 = iOException11.getSuppressed();
        iOException7.addSuppressed((java.lang.Throwable) iOException11);
        java.io.IOException iOException15 = new java.io.IOException();
        java.io.IOException iOException16 = new java.io.IOException();
        iOException15.addSuppressed((java.lang.Throwable) iOException16);
        java.io.IOException iOException18 = new java.io.IOException();
        java.io.IOException iOException19 = new java.io.IOException();
        iOException18.addSuppressed((java.lang.Throwable) iOException19);
        java.lang.Throwable[] throwableArray21 = iOException19.getSuppressed();
        java.io.IOException iOException22 = new java.io.IOException((java.lang.Throwable) iOException19);
        java.io.IOException iOException24 = new java.io.IOException("");
        java.io.IOException iOException25 = new java.io.IOException((java.lang.Throwable) iOException24);
        iOException19.addSuppressed((java.lang.Throwable) iOException25);
        iOException16.addSuppressed((java.lang.Throwable) iOException25);
        java.io.IOException iOException28 = new java.io.IOException("java.io.IOException", (java.lang.Throwable) iOException25);
        iOException11.addSuppressed((java.lang.Throwable) iOException28);
        java.io.IOException iOException31 = new java.io.IOException("");
        java.io.IOException iOException32 = new java.io.IOException((java.lang.Throwable) iOException31);
        java.io.IOException iOException34 = new java.io.IOException("");
        iOException32.addSuppressed((java.lang.Throwable) iOException34);
        java.io.IOException iOException37 = new java.io.IOException("");
        java.io.IOException iOException38 = new java.io.IOException((java.lang.Throwable) iOException37);
        java.io.IOException iOException40 = new java.io.IOException("");
        iOException38.addSuppressed((java.lang.Throwable) iOException40);
        iOException32.addSuppressed((java.lang.Throwable) iOException38);
        iOException11.addSuppressed((java.lang.Throwable) iOException38);
        java.io.IOException iOException44 = new java.io.IOException((java.lang.Throwable) iOException38);
        java.io.IOException iOException45 = new java.io.IOException("\\u006A\\u0061\\u0076\\u0061\\u002E\\u0069\\u006F\\u002E\\u0049\\u004F\\u0045\\u0078\\u0063\\u0065\\u0070\\u0074\\u0069\\u006F\\u006E\\u003A\\u0020", (java.lang.Throwable) iOException38);
        java.io.IOException iOException46 = new java.io.IOException((java.lang.Throwable) iOException38);
        java.lang.String str47 = iOException46.toString();
        org.junit.Assert.assertNotNull(throwableArray5);
        org.junit.Assert.assertNotNull(throwableArray6);
        org.junit.Assert.assertNotNull(throwableArray12);
        org.junit.Assert.assertNotNull(throwableArray21);
        org.junit.Assert.assertEquals("'" + str47 + "' != '" + "java.io.IOException: java.io.IOException: java.io.IOException: " + "'", str47, "java.io.IOException: java.io.IOException: java.io.IOException: ");
    }

    @Test
    public void test00385() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00385");
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper2 = org.apache.commons.lang3.text.translate.UnicodeEscaper.outsideOf((int) (short) 100, (int) (short) 1);
        java.io.Writer writer4 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean5 = unicodeEscaper2.translate((int) (byte) 1, writer4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(unicodeEscaper2);
    }

    @Test
    public void test00386() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00386");
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper2 = org.apache.commons.lang3.text.translate.UnicodeEscaper.between((int) (byte) 100, (-1));
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper5 = org.apache.commons.lang3.text.translate.UnicodeEscaper.outsideOf(0, (int) 'a');
        java.io.Writer writer7 = null;
        boolean boolean8 = unicodeEscaper5.translate((int) (short) 10, writer7);
        java.lang.String str10 = unicodeEscaper5.translate((java.lang.CharSequence) "0");
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper13 = org.apache.commons.lang3.text.translate.UnicodeEscaper.between((int) (byte) 1, (int) '#');
        java.io.Writer writer15 = null;
        boolean boolean16 = unicodeEscaper13.translate((int) '4', writer15);
        java.io.Writer writer18 = null;
        boolean boolean19 = unicodeEscaper13.translate((int) (byte) -1, writer18);
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper22 = org.apache.commons.lang3.text.translate.UnicodeEscaper.between((int) (byte) 1, (int) '#');
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper24 = org.apache.commons.lang3.text.translate.UnicodeEscaper.below(100);
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper26 = org.apache.commons.lang3.text.translate.UnicodeEscaper.below((int) 'a');
        java.lang.String str28 = unicodeEscaper26.translate((java.lang.CharSequence) "java.io.IOException: java.io.IOException");
        org.apache.commons.lang3.text.translate.CharSequenceTranslator[] charSequenceTranslatorArray29 = new org.apache.commons.lang3.text.translate.CharSequenceTranslator[] { unicodeEscaper22, unicodeEscaper24, unicodeEscaper26 };
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator30 = unicodeEscaper13.with(charSequenceTranslatorArray29);
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator31 = unicodeEscaper5.with(charSequenceTranslatorArray29);
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator32 = unicodeEscaper2.with(charSequenceTranslatorArray29);
        java.lang.Class<?> wildcardClass33 = unicodeEscaper2.getClass();
        org.junit.Assert.assertNotNull(unicodeEscaper2);
        org.junit.Assert.assertNotNull(unicodeEscaper5);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "0" + "'", str10, "0");
        org.junit.Assert.assertNotNull(unicodeEscaper13);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(unicodeEscaper22);
        org.junit.Assert.assertNotNull(unicodeEscaper24);
        org.junit.Assert.assertNotNull(unicodeEscaper26);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "java\\u002Eio\\u002E\\u0049\\u004F\\u0045xception\\u003A\\u0020java\\u002Eio\\u002E\\u0049\\u004F\\u0045xception" + "'", str28, "java\\u002Eio\\u002E\\u0049\\u004F\\u0045xception\\u003A\\u0020java\\u002Eio\\u002E\\u0049\\u004F\\u0045xception");
        org.junit.Assert.assertNotNull(charSequenceTranslatorArray29);
        org.junit.Assert.assertNotNull(charSequenceTranslator30);
        org.junit.Assert.assertNotNull(charSequenceTranslator31);
        org.junit.Assert.assertNotNull(charSequenceTranslator32);
        org.junit.Assert.assertNotNull(wildcardClass33);
    }

    @Test
    public void test00387() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00387");
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper2 = org.apache.commons.lang3.text.translate.UnicodeEscaper.outsideOf((int) (short) 100, 10);
        java.io.Writer writer4 = null;
        // The following exception was thrown during execution in test generation
        try {
            unicodeEscaper2.translate((java.lang.CharSequence) "\\\\u0075006A\\\\u00750061\\\\u00750076\\\\u00750061\\\\u0075002E\\\\u00750069\\\\u0075006F\\\\u0075002E\\\\u00750049\\\\u0075004F\\\\u00750045\\\\u00750078\\\\u00750063\\\\u00750065\\\\u00750070\\\\u00750074\\\\u00750069\\\\u0075006F\\\\u0075006E\\\\u0075003A\\\\u00750020", writer4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Writer must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(unicodeEscaper2);
    }

    @Test
    public void test00388() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00388");
        java.io.IOException iOException1 = new java.io.IOException();
        java.io.IOException iOException2 = new java.io.IOException();
        iOException1.addSuppressed((java.lang.Throwable) iOException2);
        java.io.IOException iOException4 = new java.io.IOException("0", (java.lang.Throwable) iOException1);
        java.io.IOException iOException5 = new java.io.IOException((java.lang.Throwable) iOException4);
        java.io.IOException iOException6 = new java.io.IOException((java.lang.Throwable) iOException5);
        java.io.IOException iOException7 = new java.io.IOException((java.lang.Throwable) iOException6);
        java.lang.Throwable[] throwableArray8 = iOException7.getSuppressed();
        java.lang.String str9 = iOException7.toString();
        org.junit.Assert.assertNotNull(throwableArray8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "java.io.IOException: java.io.IOException: java.io.IOException: java.io.IOException: 0" + "'", str9, "java.io.IOException: java.io.IOException: java.io.IOException: java.io.IOException: 0");
    }

    @Test
    public void test00389() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00389");
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper2 = org.apache.commons.lang3.text.translate.UnicodeEscaper.between((int) (byte) 0, (int) 'a');
        java.io.Writer writer4 = null;
        boolean boolean5 = unicodeEscaper2.translate(100, writer4);
        java.io.Writer writer8 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int9 = unicodeEscaper2.translate((java.lang.CharSequence) "\\u006Aa\\u0076a.\\u0069\\u006F.IOE\\u0078\\u0063\\u0065\\u0070\\u0074\\u0069\\u006F\\u006E: \\u0068\\u0069!", (int) (short) 0, writer8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(unicodeEscaper2);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test00390() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00390");
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper1 = org.apache.commons.lang3.text.translate.UnicodeEscaper.below((int) (short) 0);
        java.lang.Class<?> wildcardClass2 = unicodeEscaper1.getClass();
        org.junit.Assert.assertNotNull(unicodeEscaper1);
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test00391() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00391");
        java.io.IOException iOException3 = new java.io.IOException("0");
        java.lang.Throwable[] throwableArray4 = iOException3.getSuppressed();
        java.io.IOException iOException5 = new java.io.IOException("hi!", (java.lang.Throwable) iOException3);
        java.io.IOException iOException6 = new java.io.IOException("java.io.IOException", (java.lang.Throwable) iOException3);
        java.io.IOException iOException8 = new java.io.IOException();
        java.io.IOException iOException9 = new java.io.IOException();
        iOException8.addSuppressed((java.lang.Throwable) iOException9);
        java.lang.Throwable[] throwableArray11 = iOException9.getSuppressed();
        java.io.IOException iOException12 = new java.io.IOException("\\u005Cu\\u0030\\u0030\\u0036\\u0038\\u005Cu\\u0030\\u0030\\u0036\\u0039\\u005Cu\\u0030\\u0030\\u0032\\u0031", (java.lang.Throwable) iOException9);
        iOException6.addSuppressed((java.lang.Throwable) iOException12);
        java.io.IOException iOException14 = new java.io.IOException((java.lang.Throwable) iOException12);
        java.lang.String str15 = iOException14.toString();
        org.junit.Assert.assertNotNull(throwableArray4);
        org.junit.Assert.assertNotNull(throwableArray11);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "java.io.IOException: java.io.IOException: \\u005Cu\\u0030\\u0030\\u0036\\u0038\\u005Cu\\u0030\\u0030\\u0036\\u0039\\u005Cu\\u0030\\u0030\\u0032\\u0031" + "'", str15, "java.io.IOException: java.io.IOException: \\u005Cu\\u0030\\u0030\\u0036\\u0038\\u005Cu\\u0030\\u0030\\u0036\\u0039\\u005Cu\\u0030\\u0030\\u0032\\u0031");
    }

    @Test
    public void test00392() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00392");
        java.io.IOException iOException1 = new java.io.IOException("64");
        java.lang.Class<?> wildcardClass2 = iOException1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test00393() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00393");
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper1 = org.apache.commons.lang3.text.translate.UnicodeEscaper.above((int) '#');
        java.io.Writer writer3 = null;
        boolean boolean4 = unicodeEscaper1.translate(0, writer3);
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper6 = org.apache.commons.lang3.text.translate.UnicodeEscaper.below((int) 'a');
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper9 = org.apache.commons.lang3.text.translate.UnicodeEscaper.between((int) (byte) 1, (int) '#');
        java.io.Writer writer11 = null;
        boolean boolean12 = unicodeEscaper9.translate((int) '4', writer11);
        java.io.Writer writer14 = null;
        boolean boolean15 = unicodeEscaper9.translate((int) (byte) -1, writer14);
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper18 = org.apache.commons.lang3.text.translate.UnicodeEscaper.between((int) (byte) 1, (int) '#');
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper20 = org.apache.commons.lang3.text.translate.UnicodeEscaper.below(100);
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper22 = org.apache.commons.lang3.text.translate.UnicodeEscaper.below((int) 'a');
        java.lang.String str24 = unicodeEscaper22.translate((java.lang.CharSequence) "java.io.IOException: java.io.IOException");
        org.apache.commons.lang3.text.translate.CharSequenceTranslator[] charSequenceTranslatorArray25 = new org.apache.commons.lang3.text.translate.CharSequenceTranslator[] { unicodeEscaper18, unicodeEscaper20, unicodeEscaper22 };
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator26 = unicodeEscaper9.with(charSequenceTranslatorArray25);
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper29 = org.apache.commons.lang3.text.translate.UnicodeEscaper.outsideOf(0, (int) 'a');
        java.io.Writer writer31 = null;
        boolean boolean32 = unicodeEscaper29.translate((int) (short) 10, writer31);
        java.lang.String str34 = unicodeEscaper29.translate((java.lang.CharSequence) "0");
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper37 = org.apache.commons.lang3.text.translate.UnicodeEscaper.between((int) (byte) 1, (int) '#');
        java.io.Writer writer39 = null;
        boolean boolean40 = unicodeEscaper37.translate((int) '4', writer39);
        java.io.Writer writer42 = null;
        boolean boolean43 = unicodeEscaper37.translate((int) (byte) -1, writer42);
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper46 = org.apache.commons.lang3.text.translate.UnicodeEscaper.between((int) (byte) 1, (int) '#');
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper48 = org.apache.commons.lang3.text.translate.UnicodeEscaper.below(100);
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper50 = org.apache.commons.lang3.text.translate.UnicodeEscaper.below((int) 'a');
        java.lang.String str52 = unicodeEscaper50.translate((java.lang.CharSequence) "java.io.IOException: java.io.IOException");
        org.apache.commons.lang3.text.translate.CharSequenceTranslator[] charSequenceTranslatorArray53 = new org.apache.commons.lang3.text.translate.CharSequenceTranslator[] { unicodeEscaper46, unicodeEscaper48, unicodeEscaper50 };
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator54 = unicodeEscaper37.with(charSequenceTranslatorArray53);
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator55 = unicodeEscaper29.with(charSequenceTranslatorArray53);
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator56 = unicodeEscaper9.with(charSequenceTranslatorArray53);
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator57 = unicodeEscaper6.with(charSequenceTranslatorArray53);
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator58 = unicodeEscaper1.with(charSequenceTranslatorArray53);
        java.io.Writer writer61 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int62 = charSequenceTranslator58.translate((java.lang.CharSequence) "\\u006Aa\\u0076a.\\u0069\\u006F.IOE\\u0078\\u0063\\u0065\\u0070\\u0074\\u0069\\u006F\\u006E: \\u006Aa\\u0076a.\\u0069\\u006F.IOE\\u0078\\u0063\\u0065\\u0070\\u0074\\u0069\\u006F\\u006E", (int) (byte) -1, writer61);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: -1");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(unicodeEscaper1);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(unicodeEscaper6);
        org.junit.Assert.assertNotNull(unicodeEscaper9);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(unicodeEscaper18);
        org.junit.Assert.assertNotNull(unicodeEscaper20);
        org.junit.Assert.assertNotNull(unicodeEscaper22);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "java\\u002Eio\\u002E\\u0049\\u004F\\u0045xception\\u003A\\u0020java\\u002Eio\\u002E\\u0049\\u004F\\u0045xception" + "'", str24, "java\\u002Eio\\u002E\\u0049\\u004F\\u0045xception\\u003A\\u0020java\\u002Eio\\u002E\\u0049\\u004F\\u0045xception");
        org.junit.Assert.assertNotNull(charSequenceTranslatorArray25);
        org.junit.Assert.assertNotNull(charSequenceTranslator26);
        org.junit.Assert.assertNotNull(unicodeEscaper29);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "0" + "'", str34, "0");
        org.junit.Assert.assertNotNull(unicodeEscaper37);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertNotNull(unicodeEscaper46);
        org.junit.Assert.assertNotNull(unicodeEscaper48);
        org.junit.Assert.assertNotNull(unicodeEscaper50);
        org.junit.Assert.assertEquals("'" + str52 + "' != '" + "java\\u002Eio\\u002E\\u0049\\u004F\\u0045xception\\u003A\\u0020java\\u002Eio\\u002E\\u0049\\u004F\\u0045xception" + "'", str52, "java\\u002Eio\\u002E\\u0049\\u004F\\u0045xception\\u003A\\u0020java\\u002Eio\\u002E\\u0049\\u004F\\u0045xception");
        org.junit.Assert.assertNotNull(charSequenceTranslatorArray53);
        org.junit.Assert.assertNotNull(charSequenceTranslator54);
        org.junit.Assert.assertNotNull(charSequenceTranslator55);
        org.junit.Assert.assertNotNull(charSequenceTranslator56);
        org.junit.Assert.assertNotNull(charSequenceTranslator57);
        org.junit.Assert.assertNotNull(charSequenceTranslator58);
    }

    @Test
    public void test00394() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00394");
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper1 = org.apache.commons.lang3.text.translate.UnicodeEscaper.below((int) (short) 1);
        java.io.Writer writer3 = null;
        // The following exception was thrown during execution in test generation
        try {
            unicodeEscaper1.translate((java.lang.CharSequence) "\\u006A\\u0061\\u0076\\u0061\\u002E\\u0069\\u006F\\u002E\\u0049\\u004F\\u0045\\u0078\\u0063\\u0065\\u0070\\u0074\\u0069\\u006F\\u006E\\u003A\\u0020", writer3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Writer must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(unicodeEscaper1);
    }

    @Test
    public void test00395() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00395");
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper2 = org.apache.commons.lang3.text.translate.UnicodeEscaper.between((int) '4', (int) '#');
        java.lang.Class<?> wildcardClass3 = unicodeEscaper2.getClass();
        org.junit.Assert.assertNotNull(unicodeEscaper2);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test00396() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00396");
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper2 = org.apache.commons.lang3.text.translate.UnicodeEscaper.between((int) (byte) 0, (int) '#');
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper4 = org.apache.commons.lang3.text.translate.UnicodeEscaper.below((int) (byte) 0);
        java.io.Writer writer6 = null;
        boolean boolean7 = unicodeEscaper4.translate((int) ' ', writer6);
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper10 = org.apache.commons.lang3.text.translate.UnicodeEscaper.between((-1), (int) (short) 0);
        java.lang.String str12 = unicodeEscaper10.translate((java.lang.CharSequence) "0");
        org.apache.commons.lang3.text.translate.CharSequenceTranslator[] charSequenceTranslatorArray13 = new org.apache.commons.lang3.text.translate.CharSequenceTranslator[] {};
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator14 = unicodeEscaper10.with(charSequenceTranslatorArray13);
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator15 = unicodeEscaper4.with(charSequenceTranslatorArray13);
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator16 = unicodeEscaper2.with(charSequenceTranslatorArray13);
        java.lang.Class<?> wildcardClass17 = charSequenceTranslator16.getClass();
        org.junit.Assert.assertNotNull(unicodeEscaper2);
        org.junit.Assert.assertNotNull(unicodeEscaper4);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(unicodeEscaper10);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "0" + "'", str12, "0");
        org.junit.Assert.assertNotNull(charSequenceTranslatorArray13);
        org.junit.Assert.assertNotNull(charSequenceTranslator14);
        org.junit.Assert.assertNotNull(charSequenceTranslator15);
        org.junit.Assert.assertNotNull(charSequenceTranslator16);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test00397() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00397");
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper2 = org.apache.commons.lang3.text.translate.UnicodeEscaper.between((int) (byte) 10, 100);
        java.io.Writer writer5 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int6 = unicodeEscaper2.translate((java.lang.CharSequence) "\\u006Aa\\u0076a.\\u0069\\u006F.IOE\\u0078c\\u0065\\u0070\\u0074\\u0069\\u006F\\u006E: \\u006Aa\\u0076a.\\u0069\\u006F.IOE\\u0078c\\u0065\\u0070\\u0074\\u0069\\u006F\\u006E", (int) (short) 10, writer5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(unicodeEscaper2);
    }

    @Test
    public void test00398() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00398");
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper2 = org.apache.commons.lang3.text.translate.UnicodeEscaper.between(0, (int) (byte) 100);
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper5 = org.apache.commons.lang3.text.translate.UnicodeEscaper.outsideOf(10, 10);
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper8 = org.apache.commons.lang3.text.translate.UnicodeEscaper.outsideOf((int) (short) -1, (int) (byte) -1);
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper10 = org.apache.commons.lang3.text.translate.UnicodeEscaper.above((int) 'a');
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper12 = org.apache.commons.lang3.text.translate.UnicodeEscaper.below((int) (byte) 0);
        java.io.Writer writer14 = null;
        boolean boolean15 = unicodeEscaper12.translate((int) ' ', writer14);
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper18 = org.apache.commons.lang3.text.translate.UnicodeEscaper.between((-1), (int) (short) 0);
        java.lang.String str20 = unicodeEscaper18.translate((java.lang.CharSequence) "0");
        org.apache.commons.lang3.text.translate.CharSequenceTranslator[] charSequenceTranslatorArray21 = new org.apache.commons.lang3.text.translate.CharSequenceTranslator[] {};
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator22 = unicodeEscaper18.with(charSequenceTranslatorArray21);
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator23 = unicodeEscaper12.with(charSequenceTranslatorArray21);
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator24 = unicodeEscaper10.with(charSequenceTranslatorArray21);
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper27 = org.apache.commons.lang3.text.translate.UnicodeEscaper.between((int) (byte) 1, (int) '#');
        java.io.Writer writer29 = null;
        boolean boolean30 = unicodeEscaper27.translate((int) '4', writer29);
        java.io.Writer writer32 = null;
        boolean boolean33 = unicodeEscaper27.translate((int) (byte) -1, writer32);
        java.io.Writer writer35 = null;
        boolean boolean36 = unicodeEscaper27.translate((int) (byte) -1, writer35);
        org.apache.commons.lang3.text.translate.CharSequenceTranslator[] charSequenceTranslatorArray37 = new org.apache.commons.lang3.text.translate.CharSequenceTranslator[] {};
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator38 = unicodeEscaper27.with(charSequenceTranslatorArray37);
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator39 = charSequenceTranslator24.with(charSequenceTranslatorArray37);
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator40 = unicodeEscaper8.with(charSequenceTranslatorArray37);
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator41 = unicodeEscaper5.with(charSequenceTranslatorArray37);
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator42 = unicodeEscaper2.with(charSequenceTranslatorArray37);
        java.io.Writer writer44 = null;
        // The following exception was thrown during execution in test generation
        try {
            charSequenceTranslator42.translate((java.lang.CharSequence) "java.io.IOException: \\u0068\\u0069\\u0021", writer44);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Writer must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(unicodeEscaper2);
        org.junit.Assert.assertNotNull(unicodeEscaper5);
        org.junit.Assert.assertNotNull(unicodeEscaper8);
        org.junit.Assert.assertNotNull(unicodeEscaper10);
        org.junit.Assert.assertNotNull(unicodeEscaper12);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(unicodeEscaper18);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "0" + "'", str20, "0");
        org.junit.Assert.assertNotNull(charSequenceTranslatorArray21);
        org.junit.Assert.assertNotNull(charSequenceTranslator22);
        org.junit.Assert.assertNotNull(charSequenceTranslator23);
        org.junit.Assert.assertNotNull(charSequenceTranslator24);
        org.junit.Assert.assertNotNull(unicodeEscaper27);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertNotNull(charSequenceTranslatorArray37);
        org.junit.Assert.assertNotNull(charSequenceTranslator38);
        org.junit.Assert.assertNotNull(charSequenceTranslator39);
        org.junit.Assert.assertNotNull(charSequenceTranslator40);
        org.junit.Assert.assertNotNull(charSequenceTranslator41);
        org.junit.Assert.assertNotNull(charSequenceTranslator42);
    }

    @Test
    public void test00399() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00399");
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper2 = org.apache.commons.lang3.text.translate.UnicodeEscaper.outsideOf((int) (short) 1, (int) (byte) 10);
        java.lang.String str4 = unicodeEscaper2.translate((java.lang.CharSequence) "java.io.IOException");
        java.io.Writer writer6 = null;
        // The following exception was thrown during execution in test generation
        try {
            unicodeEscaper2.translate((java.lang.CharSequence) "java.io.IOException: hi!", writer6);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Writer must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(unicodeEscaper2);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "\\u006A\\u0061\\u0076\\u0061\\u002E\\u0069\\u006F\\u002E\\u0049\\u004F\\u0045\\u0078\\u0063\\u0065\\u0070\\u0074\\u0069\\u006F\\u006E" + "'", str4, "\\u006A\\u0061\\u0076\\u0061\\u002E\\u0069\\u006F\\u002E\\u0049\\u004F\\u0045\\u0078\\u0063\\u0065\\u0070\\u0074\\u0069\\u006F\\u006E");
    }

    @Test
    public void test00400() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00400");
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper2 = org.apache.commons.lang3.text.translate.UnicodeEscaper.outsideOf(100, (int) (short) 1);
        java.io.Writer writer5 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int6 = unicodeEscaper2.translate((java.lang.CharSequence) "java.io.IOException: 0", (int) '4', writer5);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 52");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(unicodeEscaper2);
    }

    @Test
    public void test00401() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00401");
        java.io.IOException iOException1 = new java.io.IOException("0");
        java.io.IOException iOException2 = new java.io.IOException((java.lang.Throwable) iOException1);
        java.lang.Throwable[] throwableArray3 = iOException2.getSuppressed();
        java.lang.Throwable[] throwableArray4 = iOException2.getSuppressed();
        java.lang.Class<?> wildcardClass5 = throwableArray4.getClass();
        org.junit.Assert.assertNotNull(throwableArray3);
        org.junit.Assert.assertNotNull(throwableArray4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test00402() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00402");
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper2 = org.apache.commons.lang3.text.translate.UnicodeEscaper.outsideOf((int) (short) 0, (int) (short) 1);
        java.io.Writer writer5 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int6 = unicodeEscaper2.translate((java.lang.CharSequence) "java.io.IOException: java.io.IOException: ", (int) ' ', writer5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(unicodeEscaper2);
    }

    @Test
    public void test00403() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00403");
        java.io.IOException iOException1 = new java.io.IOException();
        java.io.IOException iOException2 = new java.io.IOException();
        iOException1.addSuppressed((java.lang.Throwable) iOException2);
        java.lang.Throwable[] throwableArray4 = iOException2.getSuppressed();
        java.lang.Throwable[] throwableArray5 = iOException2.getSuppressed();
        java.io.IOException iOException6 = new java.io.IOException("java.io.IOException", (java.lang.Throwable) iOException2);
        java.io.IOException iOException7 = new java.io.IOException();
        java.io.IOException iOException8 = new java.io.IOException();
        iOException7.addSuppressed((java.lang.Throwable) iOException8);
        java.io.IOException iOException10 = new java.io.IOException((java.lang.Throwable) iOException7);
        java.lang.Throwable[] throwableArray11 = iOException10.getSuppressed();
        iOException6.addSuppressed((java.lang.Throwable) iOException10);
        java.io.IOException iOException14 = new java.io.IOException();
        java.io.IOException iOException15 = new java.io.IOException();
        iOException14.addSuppressed((java.lang.Throwable) iOException15);
        java.io.IOException iOException17 = new java.io.IOException();
        java.io.IOException iOException18 = new java.io.IOException();
        iOException17.addSuppressed((java.lang.Throwable) iOException18);
        java.lang.Throwable[] throwableArray20 = iOException18.getSuppressed();
        java.io.IOException iOException21 = new java.io.IOException((java.lang.Throwable) iOException18);
        java.io.IOException iOException23 = new java.io.IOException("");
        java.io.IOException iOException24 = new java.io.IOException((java.lang.Throwable) iOException23);
        iOException18.addSuppressed((java.lang.Throwable) iOException24);
        iOException15.addSuppressed((java.lang.Throwable) iOException24);
        java.io.IOException iOException27 = new java.io.IOException("java.io.IOException", (java.lang.Throwable) iOException24);
        iOException10.addSuppressed((java.lang.Throwable) iOException27);
        java.io.IOException iOException30 = new java.io.IOException("");
        java.io.IOException iOException31 = new java.io.IOException((java.lang.Throwable) iOException30);
        java.io.IOException iOException33 = new java.io.IOException("");
        iOException31.addSuppressed((java.lang.Throwable) iOException33);
        java.lang.Throwable[] throwableArray35 = iOException33.getSuppressed();
        iOException27.addSuppressed((java.lang.Throwable) iOException33);
        java.lang.String str37 = iOException27.toString();
        org.junit.Assert.assertNotNull(throwableArray4);
        org.junit.Assert.assertNotNull(throwableArray5);
        org.junit.Assert.assertNotNull(throwableArray11);
        org.junit.Assert.assertNotNull(throwableArray20);
        org.junit.Assert.assertNotNull(throwableArray35);
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "java.io.IOException: java.io.IOException" + "'", str37, "java.io.IOException: java.io.IOException");
    }

    @Test
    public void test00404() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00404");
        java.io.IOException iOException0 = new java.io.IOException();
        java.io.IOException iOException1 = new java.io.IOException();
        iOException0.addSuppressed((java.lang.Throwable) iOException1);
        java.lang.Throwable[] throwableArray3 = iOException1.getSuppressed();
        java.io.IOException iOException4 = new java.io.IOException((java.lang.Throwable) iOException1);
        java.io.IOException iOException6 = new java.io.IOException("");
        java.io.IOException iOException7 = new java.io.IOException((java.lang.Throwable) iOException6);
        iOException1.addSuppressed((java.lang.Throwable) iOException7);
        java.lang.Throwable[] throwableArray9 = iOException1.getSuppressed();
        java.lang.Throwable[] throwableArray10 = iOException1.getSuppressed();
        java.lang.String str11 = iOException1.toString();
        org.junit.Assert.assertNotNull(throwableArray3);
        org.junit.Assert.assertNotNull(throwableArray9);
        org.junit.Assert.assertNotNull(throwableArray10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "java.io.IOException" + "'", str11, "java.io.IOException");
    }

    @Test
    public void test00405() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00405");
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper2 = org.apache.commons.lang3.text.translate.UnicodeEscaper.outsideOf(10, 10);
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper5 = org.apache.commons.lang3.text.translate.UnicodeEscaper.outsideOf((int) (short) -1, (int) (byte) -1);
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper7 = org.apache.commons.lang3.text.translate.UnicodeEscaper.above((int) 'a');
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper9 = org.apache.commons.lang3.text.translate.UnicodeEscaper.below((int) (byte) 0);
        java.io.Writer writer11 = null;
        boolean boolean12 = unicodeEscaper9.translate((int) ' ', writer11);
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper15 = org.apache.commons.lang3.text.translate.UnicodeEscaper.between((-1), (int) (short) 0);
        java.lang.String str17 = unicodeEscaper15.translate((java.lang.CharSequence) "0");
        org.apache.commons.lang3.text.translate.CharSequenceTranslator[] charSequenceTranslatorArray18 = new org.apache.commons.lang3.text.translate.CharSequenceTranslator[] {};
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator19 = unicodeEscaper15.with(charSequenceTranslatorArray18);
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator20 = unicodeEscaper9.with(charSequenceTranslatorArray18);
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator21 = unicodeEscaper7.with(charSequenceTranslatorArray18);
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper24 = org.apache.commons.lang3.text.translate.UnicodeEscaper.between((int) (byte) 1, (int) '#');
        java.io.Writer writer26 = null;
        boolean boolean27 = unicodeEscaper24.translate((int) '4', writer26);
        java.io.Writer writer29 = null;
        boolean boolean30 = unicodeEscaper24.translate((int) (byte) -1, writer29);
        java.io.Writer writer32 = null;
        boolean boolean33 = unicodeEscaper24.translate((int) (byte) -1, writer32);
        org.apache.commons.lang3.text.translate.CharSequenceTranslator[] charSequenceTranslatorArray34 = new org.apache.commons.lang3.text.translate.CharSequenceTranslator[] {};
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator35 = unicodeEscaper24.with(charSequenceTranslatorArray34);
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator36 = charSequenceTranslator21.with(charSequenceTranslatorArray34);
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator37 = unicodeEscaper5.with(charSequenceTranslatorArray34);
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator38 = unicodeEscaper2.with(charSequenceTranslatorArray34);
        java.io.Writer writer40 = null;
        // The following exception was thrown during execution in test generation
        try {
            charSequenceTranslator38.translate((java.lang.CharSequence) "64", writer40);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Writer must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(unicodeEscaper2);
        org.junit.Assert.assertNotNull(unicodeEscaper5);
        org.junit.Assert.assertNotNull(unicodeEscaper7);
        org.junit.Assert.assertNotNull(unicodeEscaper9);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(unicodeEscaper15);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "0" + "'", str17, "0");
        org.junit.Assert.assertNotNull(charSequenceTranslatorArray18);
        org.junit.Assert.assertNotNull(charSequenceTranslator19);
        org.junit.Assert.assertNotNull(charSequenceTranslator20);
        org.junit.Assert.assertNotNull(charSequenceTranslator21);
        org.junit.Assert.assertNotNull(unicodeEscaper24);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertNotNull(charSequenceTranslatorArray34);
        org.junit.Assert.assertNotNull(charSequenceTranslator35);
        org.junit.Assert.assertNotNull(charSequenceTranslator36);
        org.junit.Assert.assertNotNull(charSequenceTranslator37);
        org.junit.Assert.assertNotNull(charSequenceTranslator38);
    }

    @Test
    public void test00406() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00406");
        java.io.IOException iOException1 = new java.io.IOException("0");
        java.io.IOException iOException2 = new java.io.IOException((java.lang.Throwable) iOException1);
        java.lang.String str3 = iOException2.toString();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "java.io.IOException: java.io.IOException: 0" + "'", str3, "java.io.IOException: java.io.IOException: 0");
    }

    @Test
    public void test00407() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00407");
        java.io.IOException iOException2 = new java.io.IOException();
        java.io.IOException iOException3 = new java.io.IOException();
        iOException2.addSuppressed((java.lang.Throwable) iOException3);
        java.io.IOException iOException5 = new java.io.IOException("0", (java.lang.Throwable) iOException2);
        java.io.IOException iOException6 = new java.io.IOException((java.lang.Throwable) iOException5);
        java.io.IOException iOException7 = new java.io.IOException((java.lang.Throwable) iOException6);
        java.io.IOException iOException8 = new java.io.IOException((java.lang.Throwable) iOException7);
        java.lang.Throwable[] throwableArray9 = iOException8.getSuppressed();
        java.io.IOException iOException13 = new java.io.IOException("0");
        java.lang.Throwable[] throwableArray14 = iOException13.getSuppressed();
        java.io.IOException iOException15 = new java.io.IOException("hi!", (java.lang.Throwable) iOException13);
        java.io.IOException iOException17 = new java.io.IOException("");
        java.io.IOException iOException18 = new java.io.IOException((java.lang.Throwable) iOException17);
        java.io.IOException iOException20 = new java.io.IOException("");
        iOException18.addSuppressed((java.lang.Throwable) iOException20);
        java.io.IOException iOException23 = new java.io.IOException("");
        java.io.IOException iOException24 = new java.io.IOException((java.lang.Throwable) iOException23);
        java.io.IOException iOException26 = new java.io.IOException("");
        iOException24.addSuppressed((java.lang.Throwable) iOException26);
        iOException18.addSuppressed((java.lang.Throwable) iOException24);
        iOException15.addSuppressed((java.lang.Throwable) iOException18);
        java.io.IOException iOException30 = new java.io.IOException("java\\u002Eio\\u002E\\u0049\\u004F\\u0045xception\\u003A\\u0020java\\u002Eio\\u002E\\u0049\\u004F\\u0045xception", (java.lang.Throwable) iOException18);
        iOException8.addSuppressed((java.lang.Throwable) iOException30);
        java.io.IOException iOException32 = new java.io.IOException("61", (java.lang.Throwable) iOException8);
        java.lang.String str33 = iOException32.toString();
        org.junit.Assert.assertNotNull(throwableArray9);
        org.junit.Assert.assertNotNull(throwableArray14);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "java.io.IOException: 61" + "'", str33, "java.io.IOException: 61");
    }

    @Test
    public void test00408() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00408");
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper2 = org.apache.commons.lang3.text.translate.UnicodeEscaper.outsideOf((-1), (int) (short) 100);
        java.lang.String str4 = unicodeEscaper2.translate((java.lang.CharSequence) "\\u0068\\u0069\\u0021");
        java.lang.CharSequence charSequence5 = null;
        java.io.Writer writer7 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int8 = unicodeEscaper2.translate(charSequence5, (int) (short) 100, writer7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(unicodeEscaper2);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "\\\\u00750068\\\\u00750069\\\\u00750021" + "'", str4, "\\\\u00750068\\\\u00750069\\\\u00750021");
    }

    @Test
    public void test00409() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00409");
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper2 = org.apache.commons.lang3.text.translate.UnicodeEscaper.outsideOf(100, (int) (short) -1);
        java.io.Writer writer4 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean5 = unicodeEscaper2.translate((int) (byte) 100, writer4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(unicodeEscaper2);
    }

    @Test
    public void test00410() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00410");
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper2 = org.apache.commons.lang3.text.translate.UnicodeEscaper.between((int) (byte) 1, (int) '#');
        java.io.Writer writer4 = null;
        boolean boolean5 = unicodeEscaper2.translate((int) '4', writer4);
        java.io.Writer writer7 = null;
        boolean boolean8 = unicodeEscaper2.translate((int) (byte) -1, writer7);
        java.lang.String str10 = unicodeEscaper2.translate((java.lang.CharSequence) "java.io.IOException");
        java.io.Writer writer12 = null;
        boolean boolean13 = unicodeEscaper2.translate(0, writer12);
        java.io.Writer writer15 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean16 = unicodeEscaper2.translate((int) '#', writer15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(unicodeEscaper2);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "java.io.IOException" + "'", str10, "java.io.IOException");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test00411() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00411");
        java.io.IOException iOException2 = new java.io.IOException("0");
        java.lang.Throwable[] throwableArray3 = iOException2.getSuppressed();
        java.io.IOException iOException4 = new java.io.IOException("hi!", (java.lang.Throwable) iOException2);
        java.io.IOException iOException6 = new java.io.IOException("");
        java.io.IOException iOException7 = new java.io.IOException((java.lang.Throwable) iOException6);
        java.io.IOException iOException9 = new java.io.IOException("");
        iOException7.addSuppressed((java.lang.Throwable) iOException9);
        java.io.IOException iOException12 = new java.io.IOException("");
        java.io.IOException iOException13 = new java.io.IOException((java.lang.Throwable) iOException12);
        java.io.IOException iOException15 = new java.io.IOException("");
        iOException13.addSuppressed((java.lang.Throwable) iOException15);
        iOException7.addSuppressed((java.lang.Throwable) iOException13);
        iOException4.addSuppressed((java.lang.Throwable) iOException7);
        java.lang.String str19 = iOException7.toString();
        org.junit.Assert.assertNotNull(throwableArray3);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "java.io.IOException: java.io.IOException: " + "'", str19, "java.io.IOException: java.io.IOException: ");
    }

    @Test
    public void test00412() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00412");
        java.io.IOException iOException1 = new java.io.IOException();
        java.io.IOException iOException2 = new java.io.IOException();
        iOException1.addSuppressed((java.lang.Throwable) iOException2);
        java.lang.Throwable[] throwableArray4 = iOException2.getSuppressed();
        java.lang.Throwable[] throwableArray5 = iOException2.getSuppressed();
        java.io.IOException iOException6 = new java.io.IOException("java.io.IOException", (java.lang.Throwable) iOException2);
        java.io.IOException iOException7 = new java.io.IOException();
        java.io.IOException iOException8 = new java.io.IOException();
        iOException7.addSuppressed((java.lang.Throwable) iOException8);
        java.io.IOException iOException10 = new java.io.IOException((java.lang.Throwable) iOException7);
        java.lang.Throwable[] throwableArray11 = iOException10.getSuppressed();
        iOException6.addSuppressed((java.lang.Throwable) iOException10);
        java.io.IOException iOException14 = new java.io.IOException();
        java.io.IOException iOException15 = new java.io.IOException();
        iOException14.addSuppressed((java.lang.Throwable) iOException15);
        java.io.IOException iOException17 = new java.io.IOException();
        java.io.IOException iOException18 = new java.io.IOException();
        iOException17.addSuppressed((java.lang.Throwable) iOException18);
        java.lang.Throwable[] throwableArray20 = iOException18.getSuppressed();
        java.io.IOException iOException21 = new java.io.IOException((java.lang.Throwable) iOException18);
        java.io.IOException iOException23 = new java.io.IOException("");
        java.io.IOException iOException24 = new java.io.IOException((java.lang.Throwable) iOException23);
        iOException18.addSuppressed((java.lang.Throwable) iOException24);
        iOException15.addSuppressed((java.lang.Throwable) iOException24);
        java.io.IOException iOException27 = new java.io.IOException("java.io.IOException", (java.lang.Throwable) iOException24);
        iOException10.addSuppressed((java.lang.Throwable) iOException27);
        java.io.IOException iOException30 = new java.io.IOException("");
        java.io.IOException iOException31 = new java.io.IOException((java.lang.Throwable) iOException30);
        java.io.IOException iOException33 = new java.io.IOException("");
        iOException31.addSuppressed((java.lang.Throwable) iOException33);
        java.io.IOException iOException36 = new java.io.IOException("");
        java.io.IOException iOException37 = new java.io.IOException((java.lang.Throwable) iOException36);
        java.io.IOException iOException39 = new java.io.IOException("");
        iOException37.addSuppressed((java.lang.Throwable) iOException39);
        iOException31.addSuppressed((java.lang.Throwable) iOException37);
        iOException10.addSuppressed((java.lang.Throwable) iOException37);
        java.io.IOException iOException43 = new java.io.IOException((java.lang.Throwable) iOException10);
        java.lang.String str44 = iOException43.toString();
        org.junit.Assert.assertNotNull(throwableArray4);
        org.junit.Assert.assertNotNull(throwableArray5);
        org.junit.Assert.assertNotNull(throwableArray11);
        org.junit.Assert.assertNotNull(throwableArray20);
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "java.io.IOException: java.io.IOException: java.io.IOException" + "'", str44, "java.io.IOException: java.io.IOException: java.io.IOException");
    }

    @Test
    public void test00413() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00413");
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper2 = org.apache.commons.lang3.text.translate.UnicodeEscaper.outsideOf(0, 10);
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper5 = org.apache.commons.lang3.text.translate.UnicodeEscaper.outsideOf((int) (short) 1, (int) 'a');
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper7 = org.apache.commons.lang3.text.translate.UnicodeEscaper.below((int) (byte) 0);
        java.io.Writer writer9 = null;
        boolean boolean10 = unicodeEscaper7.translate((int) ' ', writer9);
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper13 = org.apache.commons.lang3.text.translate.UnicodeEscaper.between((-1), (int) (short) 0);
        java.lang.String str15 = unicodeEscaper13.translate((java.lang.CharSequence) "0");
        org.apache.commons.lang3.text.translate.CharSequenceTranslator[] charSequenceTranslatorArray16 = new org.apache.commons.lang3.text.translate.CharSequenceTranslator[] {};
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator17 = unicodeEscaper13.with(charSequenceTranslatorArray16);
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator18 = unicodeEscaper7.with(charSequenceTranslatorArray16);
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator19 = unicodeEscaper5.with(charSequenceTranslatorArray16);
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator20 = unicodeEscaper2.with(charSequenceTranslatorArray16);
        java.lang.Class<?> wildcardClass21 = charSequenceTranslator20.getClass();
        org.junit.Assert.assertNotNull(unicodeEscaper2);
        org.junit.Assert.assertNotNull(unicodeEscaper5);
        org.junit.Assert.assertNotNull(unicodeEscaper7);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(unicodeEscaper13);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "0" + "'", str15, "0");
        org.junit.Assert.assertNotNull(charSequenceTranslatorArray16);
        org.junit.Assert.assertNotNull(charSequenceTranslator17);
        org.junit.Assert.assertNotNull(charSequenceTranslator18);
        org.junit.Assert.assertNotNull(charSequenceTranslator19);
        org.junit.Assert.assertNotNull(charSequenceTranslator20);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test00414() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00414");
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper2 = org.apache.commons.lang3.text.translate.UnicodeEscaper.between((int) (byte) 0, (int) 'a');
        java.io.Writer writer4 = null;
        boolean boolean5 = unicodeEscaper2.translate(100, writer4);
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper8 = org.apache.commons.lang3.text.translate.UnicodeEscaper.between((-1), (int) (byte) -1);
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper11 = org.apache.commons.lang3.text.translate.UnicodeEscaper.outsideOf((int) '4', (int) (short) 0);
        org.apache.commons.lang3.text.translate.CharSequenceTranslator[] charSequenceTranslatorArray12 = new org.apache.commons.lang3.text.translate.CharSequenceTranslator[] { unicodeEscaper11 };
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator13 = unicodeEscaper8.with(charSequenceTranslatorArray12);
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator14 = unicodeEscaper2.with(charSequenceTranslatorArray12);
        java.io.Writer writer17 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int18 = charSequenceTranslator14.translate((java.lang.CharSequence) "java.io.IOException: \\u006A\\u0061\\u0076\\u0061\\u002E\\u0069\\u006F\\u002E\\u0049\\u004F\\u0045\\u0078\\u0063\\u0065\\u0070\\u0074\\u0069\\u006F\\u006E\\u003A\\u0020\\u006A\\u0061\\u0076\\u0061\\u002E\\u0069\\u006F\\u002E\\u0049\\u004F\\u0045\\u0078\\u0063\\u0065\\u0070\\u0074\\u0069\\u006F\\u006E", (int) (byte) 1, writer17);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(unicodeEscaper2);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(unicodeEscaper8);
        org.junit.Assert.assertNotNull(unicodeEscaper11);
        org.junit.Assert.assertNotNull(charSequenceTranslatorArray12);
        org.junit.Assert.assertNotNull(charSequenceTranslator13);
        org.junit.Assert.assertNotNull(charSequenceTranslator14);
    }

    @Test
    public void test00415() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00415");
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper1 = org.apache.commons.lang3.text.translate.UnicodeEscaper.below((int) (byte) 100);
        java.io.Writer writer3 = null;
        // The following exception was thrown during execution in test generation
        try {
            unicodeEscaper1.translate((java.lang.CharSequence) "java.io.IOException:\\u0020hi\\u0021", writer3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Writer must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(unicodeEscaper1);
    }

    @Test
    public void test00416() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00416");
        java.io.IOException iOException2 = new java.io.IOException();
        java.io.IOException iOException3 = new java.io.IOException();
        iOException2.addSuppressed((java.lang.Throwable) iOException3);
        java.lang.Throwable[] throwableArray5 = iOException3.getSuppressed();
        java.lang.Throwable[] throwableArray6 = iOException3.getSuppressed();
        java.io.IOException iOException8 = new java.io.IOException();
        java.io.IOException iOException9 = new java.io.IOException();
        iOException8.addSuppressed((java.lang.Throwable) iOException9);
        java.io.IOException iOException11 = new java.io.IOException("0", (java.lang.Throwable) iOException8);
        java.io.IOException iOException12 = new java.io.IOException((java.lang.Throwable) iOException11);
        iOException3.addSuppressed((java.lang.Throwable) iOException12);
        java.lang.Throwable[] throwableArray14 = iOException12.getSuppressed();
        java.io.IOException iOException15 = new java.io.IOException("A", (java.lang.Throwable) iOException12);
        java.io.IOException iOException16 = new java.io.IOException("\\u006Aa\\u0076a.\\u0069\\u006F.IOE\\u0078\\u0063\\u0065\\u0070\\u0074\\u0069\\u006F\\u006E: \\u0068\\u0069!", (java.lang.Throwable) iOException15);
        java.lang.String str17 = iOException15.toString();
        org.junit.Assert.assertNotNull(throwableArray5);
        org.junit.Assert.assertNotNull(throwableArray6);
        org.junit.Assert.assertNotNull(throwableArray14);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "java.io.IOException: A" + "'", str17, "java.io.IOException: A");
    }

    @Test
    public void test00417() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00417");
        java.io.IOException iOException1 = new java.io.IOException("java.io.IOException: java.io.IOException: java.io.IOException: 0");
        java.lang.String str2 = iOException1.toString();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "java.io.IOException: java.io.IOException: java.io.IOException: java.io.IOException: 0" + "'", str2, "java.io.IOException: java.io.IOException: java.io.IOException: java.io.IOException: 0");
    }

    @Test
    public void test00418() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00418");
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper2 = org.apache.commons.lang3.text.translate.UnicodeEscaper.outsideOf(10, 10);
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper5 = org.apache.commons.lang3.text.translate.UnicodeEscaper.outsideOf((int) (short) -1, (int) (byte) -1);
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper7 = org.apache.commons.lang3.text.translate.UnicodeEscaper.above((int) 'a');
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper9 = org.apache.commons.lang3.text.translate.UnicodeEscaper.below((int) (byte) 0);
        java.io.Writer writer11 = null;
        boolean boolean12 = unicodeEscaper9.translate((int) ' ', writer11);
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper15 = org.apache.commons.lang3.text.translate.UnicodeEscaper.between((-1), (int) (short) 0);
        java.lang.String str17 = unicodeEscaper15.translate((java.lang.CharSequence) "0");
        org.apache.commons.lang3.text.translate.CharSequenceTranslator[] charSequenceTranslatorArray18 = new org.apache.commons.lang3.text.translate.CharSequenceTranslator[] {};
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator19 = unicodeEscaper15.with(charSequenceTranslatorArray18);
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator20 = unicodeEscaper9.with(charSequenceTranslatorArray18);
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator21 = unicodeEscaper7.with(charSequenceTranslatorArray18);
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper24 = org.apache.commons.lang3.text.translate.UnicodeEscaper.between((int) (byte) 1, (int) '#');
        java.io.Writer writer26 = null;
        boolean boolean27 = unicodeEscaper24.translate((int) '4', writer26);
        java.io.Writer writer29 = null;
        boolean boolean30 = unicodeEscaper24.translate((int) (byte) -1, writer29);
        java.io.Writer writer32 = null;
        boolean boolean33 = unicodeEscaper24.translate((int) (byte) -1, writer32);
        org.apache.commons.lang3.text.translate.CharSequenceTranslator[] charSequenceTranslatorArray34 = new org.apache.commons.lang3.text.translate.CharSequenceTranslator[] {};
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator35 = unicodeEscaper24.with(charSequenceTranslatorArray34);
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator36 = charSequenceTranslator21.with(charSequenceTranslatorArray34);
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator37 = unicodeEscaper5.with(charSequenceTranslatorArray34);
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator38 = unicodeEscaper2.with(charSequenceTranslatorArray34);
        java.io.Writer writer40 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean41 = unicodeEscaper2.translate((int) (byte) 100, writer40);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(unicodeEscaper2);
        org.junit.Assert.assertNotNull(unicodeEscaper5);
        org.junit.Assert.assertNotNull(unicodeEscaper7);
        org.junit.Assert.assertNotNull(unicodeEscaper9);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(unicodeEscaper15);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "0" + "'", str17, "0");
        org.junit.Assert.assertNotNull(charSequenceTranslatorArray18);
        org.junit.Assert.assertNotNull(charSequenceTranslator19);
        org.junit.Assert.assertNotNull(charSequenceTranslator20);
        org.junit.Assert.assertNotNull(charSequenceTranslator21);
        org.junit.Assert.assertNotNull(unicodeEscaper24);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertNotNull(charSequenceTranslatorArray34);
        org.junit.Assert.assertNotNull(charSequenceTranslator35);
        org.junit.Assert.assertNotNull(charSequenceTranslator36);
        org.junit.Assert.assertNotNull(charSequenceTranslator37);
        org.junit.Assert.assertNotNull(charSequenceTranslator38);
    }

    @Test
    public void test00419() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00419");
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper2 = org.apache.commons.lang3.text.translate.UnicodeEscaper.between(0, (int) (short) 100);
        java.io.Writer writer4 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean5 = unicodeEscaper2.translate(100, writer4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(unicodeEscaper2);
    }

    @Test
    public void test00420() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00420");
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper2 = org.apache.commons.lang3.text.translate.UnicodeEscaper.outsideOf((int) (short) 1, (int) ' ');
        java.io.Writer writer4 = null;
        // The following exception was thrown during execution in test generation
        try {
            unicodeEscaper2.translate((java.lang.CharSequence) "\\\\u0075006Aa\\\\u00750076a.\\\\u00750069\\\\u0075006F.IOE\\\\u00750078\\u0063\\\\u00750065\\\\u00750070\\\\u00750074\\\\u00750069\\\\u0075006F\\\\u0075006E: \\\\u0075006Aa\\\\u00750076a.\\\\u00750069\\\\u0075006F.IOE\\\\u00750078\\u0063\\\\u00750065\\\\u00750070\\\\u00750074\\\\u00750069\\\\u0075006F\\\\u0075006E", writer4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Writer must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(unicodeEscaper2);
    }

    @Test
    public void test00421() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00421");
        java.io.IOException iOException2 = new java.io.IOException();
        java.io.IOException iOException3 = new java.io.IOException();
        iOException2.addSuppressed((java.lang.Throwable) iOException3);
        java.io.IOException iOException5 = new java.io.IOException();
        java.io.IOException iOException6 = new java.io.IOException();
        iOException5.addSuppressed((java.lang.Throwable) iOException6);
        java.lang.Throwable[] throwableArray8 = iOException6.getSuppressed();
        java.io.IOException iOException9 = new java.io.IOException((java.lang.Throwable) iOException6);
        java.io.IOException iOException11 = new java.io.IOException("");
        java.io.IOException iOException12 = new java.io.IOException((java.lang.Throwable) iOException11);
        iOException6.addSuppressed((java.lang.Throwable) iOException12);
        iOException3.addSuppressed((java.lang.Throwable) iOException12);
        java.io.IOException iOException15 = new java.io.IOException("java.io.IOException", (java.lang.Throwable) iOException12);
        java.io.IOException iOException16 = new java.io.IOException("64", (java.lang.Throwable) iOException15);
        java.lang.String str17 = iOException15.toString();
        org.junit.Assert.assertNotNull(throwableArray8);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "java.io.IOException: java.io.IOException" + "'", str17, "java.io.IOException: java.io.IOException");
    }

    @Test
    public void test00422() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00422");
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper2 = org.apache.commons.lang3.text.translate.UnicodeEscaper.between((int) ' ', (int) '#');
        java.lang.CharSequence charSequence3 = null;
        java.io.Writer writer4 = null;
        // The following exception was thrown during execution in test generation
        try {
            unicodeEscaper2.translate(charSequence3, writer4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Writer must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(unicodeEscaper2);
    }

    @Test
    public void test00423() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00423");
        java.io.IOException iOException2 = new java.io.IOException();
        java.io.IOException iOException3 = new java.io.IOException();
        iOException2.addSuppressed((java.lang.Throwable) iOException3);
        java.lang.Throwable[] throwableArray5 = iOException3.getSuppressed();
        java.lang.Throwable[] throwableArray6 = iOException3.getSuppressed();
        java.io.IOException iOException8 = new java.io.IOException();
        java.io.IOException iOException9 = new java.io.IOException();
        iOException8.addSuppressed((java.lang.Throwable) iOException9);
        java.io.IOException iOException11 = new java.io.IOException("0", (java.lang.Throwable) iOException8);
        java.io.IOException iOException12 = new java.io.IOException((java.lang.Throwable) iOException11);
        iOException3.addSuppressed((java.lang.Throwable) iOException12);
        java.lang.Throwable[] throwableArray14 = iOException12.getSuppressed();
        java.io.IOException iOException15 = new java.io.IOException("A", (java.lang.Throwable) iOException12);
        java.io.IOException iOException16 = new java.io.IOException((java.lang.Throwable) iOException12);
        java.io.IOException iOException17 = new java.io.IOException("\\u006A\\u0061\\u0076\\u0061\\u002E\\u0069\\u006F\\u002E\\u0049\\u004F\\u0045\\u0078\\u0063\\u0065\\u0070\\u0074\\u0069\\u006F\\u006E\\u003A\\u0020\\u006A\\u0061\\u0076\\u0061\\u002E\\u0069\\u006F\\u002E\\u0049\\u004F\\u0045\\u0078\\u0063\\u0065\\u0070\\u0074\\u0069\\u006F\\u006E\\u003A\\u0020\\u006A\\u0061\\u0076\\u0061\\u002E\\u0069\\u006F\\u002E\\u0049\\u004F\\u0045\\u0078\\u0063\\u0065\\u0070\\u0074\\u0069\\u006F\\u006E\\u003A\\u0020\\u0030", (java.lang.Throwable) iOException12);
        java.lang.String str18 = iOException17.toString();
        org.junit.Assert.assertNotNull(throwableArray5);
        org.junit.Assert.assertNotNull(throwableArray6);
        org.junit.Assert.assertNotNull(throwableArray14);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "java.io.IOException: \\u006A\\u0061\\u0076\\u0061\\u002E\\u0069\\u006F\\u002E\\u0049\\u004F\\u0045\\u0078\\u0063\\u0065\\u0070\\u0074\\u0069\\u006F\\u006E\\u003A\\u0020\\u006A\\u0061\\u0076\\u0061\\u002E\\u0069\\u006F\\u002E\\u0049\\u004F\\u0045\\u0078\\u0063\\u0065\\u0070\\u0074\\u0069\\u006F\\u006E\\u003A\\u0020\\u006A\\u0061\\u0076\\u0061\\u002E\\u0069\\u006F\\u002E\\u0049\\u004F\\u0045\\u0078\\u0063\\u0065\\u0070\\u0074\\u0069\\u006F\\u006E\\u003A\\u0020\\u0030" + "'", str18, "java.io.IOException: \\u006A\\u0061\\u0076\\u0061\\u002E\\u0069\\u006F\\u002E\\u0049\\u004F\\u0045\\u0078\\u0063\\u0065\\u0070\\u0074\\u0069\\u006F\\u006E\\u003A\\u0020\\u006A\\u0061\\u0076\\u0061\\u002E\\u0069\\u006F\\u002E\\u0049\\u004F\\u0045\\u0078\\u0063\\u0065\\u0070\\u0074\\u0069\\u006F\\u006E\\u003A\\u0020\\u006A\\u0061\\u0076\\u0061\\u002E\\u0069\\u006F\\u002E\\u0049\\u004F\\u0045\\u0078\\u0063\\u0065\\u0070\\u0074\\u0069\\u006F\\u006E\\u003A\\u0020\\u0030");
    }

    @Test
    public void test00424() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00424");
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper2 = org.apache.commons.lang3.text.translate.UnicodeEscaper.outsideOf((int) '4', (-1));
        java.io.Writer writer4 = null;
        // The following exception was thrown during execution in test generation
        try {
            unicodeEscaper2.translate((java.lang.CharSequence) "\\\\u00750036\\\\u00750034", writer4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Writer must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(unicodeEscaper2);
    }

    @Test
    public void test00425() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00425");
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper2 = org.apache.commons.lang3.text.translate.UnicodeEscaper.between((int) (byte) 0, (int) 'a');
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper5 = org.apache.commons.lang3.text.translate.UnicodeEscaper.between((int) (byte) -1, (int) (short) 0);
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper8 = org.apache.commons.lang3.text.translate.UnicodeEscaper.between((int) (byte) 1, (int) '#');
        java.io.Writer writer10 = null;
        boolean boolean11 = unicodeEscaper8.translate((int) '4', writer10);
        java.io.Writer writer13 = null;
        boolean boolean14 = unicodeEscaper8.translate((int) (byte) -1, writer13);
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper17 = org.apache.commons.lang3.text.translate.UnicodeEscaper.between((int) (byte) 1, (int) '#');
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper19 = org.apache.commons.lang3.text.translate.UnicodeEscaper.below(100);
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper21 = org.apache.commons.lang3.text.translate.UnicodeEscaper.below((int) 'a');
        java.lang.String str23 = unicodeEscaper21.translate((java.lang.CharSequence) "java.io.IOException: java.io.IOException");
        org.apache.commons.lang3.text.translate.CharSequenceTranslator[] charSequenceTranslatorArray24 = new org.apache.commons.lang3.text.translate.CharSequenceTranslator[] { unicodeEscaper17, unicodeEscaper19, unicodeEscaper21 };
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator25 = unicodeEscaper8.with(charSequenceTranslatorArray24);
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator26 = unicodeEscaper5.with(charSequenceTranslatorArray24);
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator27 = unicodeEscaper2.with(charSequenceTranslatorArray24);
        java.io.Writer writer30 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int31 = unicodeEscaper2.translate((java.lang.CharSequence) "java.io.IOException: java.io.IOException: 0", 1, writer30);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(unicodeEscaper2);
        org.junit.Assert.assertNotNull(unicodeEscaper5);
        org.junit.Assert.assertNotNull(unicodeEscaper8);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(unicodeEscaper17);
        org.junit.Assert.assertNotNull(unicodeEscaper19);
        org.junit.Assert.assertNotNull(unicodeEscaper21);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "java\\u002Eio\\u002E\\u0049\\u004F\\u0045xception\\u003A\\u0020java\\u002Eio\\u002E\\u0049\\u004F\\u0045xception" + "'", str23, "java\\u002Eio\\u002E\\u0049\\u004F\\u0045xception\\u003A\\u0020java\\u002Eio\\u002E\\u0049\\u004F\\u0045xception");
        org.junit.Assert.assertNotNull(charSequenceTranslatorArray24);
        org.junit.Assert.assertNotNull(charSequenceTranslator25);
        org.junit.Assert.assertNotNull(charSequenceTranslator26);
        org.junit.Assert.assertNotNull(charSequenceTranslator27);
    }

    @Test
    public void test00426() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00426");
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper2 = org.apache.commons.lang3.text.translate.UnicodeEscaper.outsideOf(0, 1);
        java.io.Writer writer4 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean5 = unicodeEscaper2.translate((int) (short) 10, writer4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(unicodeEscaper2);
    }

    @Test
    public void test00427() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00427");
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper2 = org.apache.commons.lang3.text.translate.UnicodeEscaper.between((int) (short) 100, 0);
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper5 = org.apache.commons.lang3.text.translate.UnicodeEscaper.between((int) (byte) 100, (-1));
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper8 = org.apache.commons.lang3.text.translate.UnicodeEscaper.outsideOf(0, (int) 'a');
        java.io.Writer writer10 = null;
        boolean boolean11 = unicodeEscaper8.translate((int) (short) 10, writer10);
        java.lang.String str13 = unicodeEscaper8.translate((java.lang.CharSequence) "0");
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper16 = org.apache.commons.lang3.text.translate.UnicodeEscaper.between((int) (byte) 1, (int) '#');
        java.io.Writer writer18 = null;
        boolean boolean19 = unicodeEscaper16.translate((int) '4', writer18);
        java.io.Writer writer21 = null;
        boolean boolean22 = unicodeEscaper16.translate((int) (byte) -1, writer21);
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper25 = org.apache.commons.lang3.text.translate.UnicodeEscaper.between((int) (byte) 1, (int) '#');
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper27 = org.apache.commons.lang3.text.translate.UnicodeEscaper.below(100);
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper29 = org.apache.commons.lang3.text.translate.UnicodeEscaper.below((int) 'a');
        java.lang.String str31 = unicodeEscaper29.translate((java.lang.CharSequence) "java.io.IOException: java.io.IOException");
        org.apache.commons.lang3.text.translate.CharSequenceTranslator[] charSequenceTranslatorArray32 = new org.apache.commons.lang3.text.translate.CharSequenceTranslator[] { unicodeEscaper25, unicodeEscaper27, unicodeEscaper29 };
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator33 = unicodeEscaper16.with(charSequenceTranslatorArray32);
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator34 = unicodeEscaper8.with(charSequenceTranslatorArray32);
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator35 = unicodeEscaper5.with(charSequenceTranslatorArray32);
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator36 = unicodeEscaper2.with(charSequenceTranslatorArray32);
        java.io.Writer writer39 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int40 = charSequenceTranslator36.translate((java.lang.CharSequence) "java.io.IOException: 61", (int) '4', writer39);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 52");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(unicodeEscaper2);
        org.junit.Assert.assertNotNull(unicodeEscaper5);
        org.junit.Assert.assertNotNull(unicodeEscaper8);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "0" + "'", str13, "0");
        org.junit.Assert.assertNotNull(unicodeEscaper16);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(unicodeEscaper25);
        org.junit.Assert.assertNotNull(unicodeEscaper27);
        org.junit.Assert.assertNotNull(unicodeEscaper29);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "java\\u002Eio\\u002E\\u0049\\u004F\\u0045xception\\u003A\\u0020java\\u002Eio\\u002E\\u0049\\u004F\\u0045xception" + "'", str31, "java\\u002Eio\\u002E\\u0049\\u004F\\u0045xception\\u003A\\u0020java\\u002Eio\\u002E\\u0049\\u004F\\u0045xception");
        org.junit.Assert.assertNotNull(charSequenceTranslatorArray32);
        org.junit.Assert.assertNotNull(charSequenceTranslator33);
        org.junit.Assert.assertNotNull(charSequenceTranslator34);
        org.junit.Assert.assertNotNull(charSequenceTranslator35);
        org.junit.Assert.assertNotNull(charSequenceTranslator36);
    }

    @Test
    public void test00428() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00428");
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper1 = org.apache.commons.lang3.text.translate.UnicodeEscaper.above((int) (byte) 10);
        java.io.Writer writer4 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int5 = unicodeEscaper1.translate((java.lang.CharSequence) "java.io.IOException", (int) (byte) 0, writer4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(unicodeEscaper1);
    }

    @Test
    public void test00429() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00429");
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper2 = org.apache.commons.lang3.text.translate.UnicodeEscaper.outsideOf((int) (byte) -1, (int) (byte) 1);
        java.io.Writer writer5 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int6 = unicodeEscaper2.translate((java.lang.CharSequence) "\\u006A\\u0061\\u0076\\u0061\\u002E\\u0069\\u006F\\u002E\\u0049\\u004F\\u0045\\u0078\\u0063\\u0065\\u0070\\u0074\\u0069\\u006F\\u006E", (int) (short) 10, writer5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(unicodeEscaper2);
    }

    @Test
    public void test00430() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00430");
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper1 = org.apache.commons.lang3.text.translate.UnicodeEscaper.above((int) (short) 100);
        java.io.Writer writer3 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean4 = unicodeEscaper1.translate((int) (byte) -1, writer3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(unicodeEscaper1);
    }

    @Test
    public void test00431() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00431");
        java.io.IOException iOException3 = new java.io.IOException("0");
        java.lang.Throwable[] throwableArray4 = iOException3.getSuppressed();
        java.io.IOException iOException5 = new java.io.IOException("hi!", (java.lang.Throwable) iOException3);
        java.io.IOException iOException7 = new java.io.IOException("");
        java.io.IOException iOException8 = new java.io.IOException((java.lang.Throwable) iOException7);
        java.io.IOException iOException10 = new java.io.IOException("");
        iOException8.addSuppressed((java.lang.Throwable) iOException10);
        java.io.IOException iOException13 = new java.io.IOException("");
        java.io.IOException iOException14 = new java.io.IOException((java.lang.Throwable) iOException13);
        java.io.IOException iOException16 = new java.io.IOException("");
        iOException14.addSuppressed((java.lang.Throwable) iOException16);
        iOException8.addSuppressed((java.lang.Throwable) iOException14);
        iOException5.addSuppressed((java.lang.Throwable) iOException8);
        java.io.IOException iOException20 = new java.io.IOException("java.io.IOException: ", (java.lang.Throwable) iOException5);
        java.lang.Class<?> wildcardClass21 = iOException5.getClass();
        org.junit.Assert.assertNotNull(throwableArray4);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test00432() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00432");
        java.io.IOException iOException0 = new java.io.IOException();
        java.io.IOException iOException1 = new java.io.IOException();
        iOException0.addSuppressed((java.lang.Throwable) iOException1);
        java.io.IOException iOException3 = new java.io.IOException((java.lang.Throwable) iOException0);
        java.lang.Throwable[] throwableArray4 = iOException3.getSuppressed();
        java.io.IOException iOException7 = new java.io.IOException();
        java.io.IOException iOException8 = new java.io.IOException();
        iOException7.addSuppressed((java.lang.Throwable) iOException8);
        java.io.IOException iOException10 = new java.io.IOException();
        java.io.IOException iOException11 = new java.io.IOException();
        iOException10.addSuppressed((java.lang.Throwable) iOException11);
        java.lang.Throwable[] throwableArray13 = iOException11.getSuppressed();
        java.io.IOException iOException14 = new java.io.IOException((java.lang.Throwable) iOException11);
        java.io.IOException iOException16 = new java.io.IOException("");
        java.io.IOException iOException17 = new java.io.IOException((java.lang.Throwable) iOException16);
        iOException11.addSuppressed((java.lang.Throwable) iOException17);
        iOException8.addSuppressed((java.lang.Throwable) iOException17);
        java.io.IOException iOException20 = new java.io.IOException("java.io.IOException", (java.lang.Throwable) iOException17);
        java.io.IOException iOException21 = new java.io.IOException("64", (java.lang.Throwable) iOException20);
        iOException3.addSuppressed((java.lang.Throwable) iOException20);
        java.io.IOException iOException24 = new java.io.IOException();
        java.io.IOException iOException25 = new java.io.IOException();
        iOException24.addSuppressed((java.lang.Throwable) iOException25);
        java.lang.Throwable[] throwableArray27 = iOException25.getSuppressed();
        java.lang.Throwable[] throwableArray28 = iOException25.getSuppressed();
        java.io.IOException iOException29 = new java.io.IOException("java.io.IOException", (java.lang.Throwable) iOException25);
        java.io.IOException iOException30 = new java.io.IOException();
        java.io.IOException iOException31 = new java.io.IOException();
        iOException30.addSuppressed((java.lang.Throwable) iOException31);
        java.io.IOException iOException33 = new java.io.IOException((java.lang.Throwable) iOException30);
        java.lang.Throwable[] throwableArray34 = iOException33.getSuppressed();
        iOException29.addSuppressed((java.lang.Throwable) iOException33);
        java.io.IOException iOException37 = new java.io.IOException();
        java.io.IOException iOException38 = new java.io.IOException();
        iOException37.addSuppressed((java.lang.Throwable) iOException38);
        java.io.IOException iOException40 = new java.io.IOException();
        java.io.IOException iOException41 = new java.io.IOException();
        iOException40.addSuppressed((java.lang.Throwable) iOException41);
        java.lang.Throwable[] throwableArray43 = iOException41.getSuppressed();
        java.io.IOException iOException44 = new java.io.IOException((java.lang.Throwable) iOException41);
        java.io.IOException iOException46 = new java.io.IOException("");
        java.io.IOException iOException47 = new java.io.IOException((java.lang.Throwable) iOException46);
        iOException41.addSuppressed((java.lang.Throwable) iOException47);
        iOException38.addSuppressed((java.lang.Throwable) iOException47);
        java.io.IOException iOException50 = new java.io.IOException("java.io.IOException", (java.lang.Throwable) iOException47);
        iOException33.addSuppressed((java.lang.Throwable) iOException50);
        java.io.IOException iOException53 = new java.io.IOException("");
        java.io.IOException iOException54 = new java.io.IOException((java.lang.Throwable) iOException53);
        java.io.IOException iOException56 = new java.io.IOException("");
        iOException54.addSuppressed((java.lang.Throwable) iOException56);
        java.io.IOException iOException59 = new java.io.IOException("");
        java.io.IOException iOException60 = new java.io.IOException((java.lang.Throwable) iOException59);
        java.io.IOException iOException62 = new java.io.IOException("");
        iOException60.addSuppressed((java.lang.Throwable) iOException62);
        iOException54.addSuppressed((java.lang.Throwable) iOException60);
        iOException33.addSuppressed((java.lang.Throwable) iOException60);
        java.io.IOException iOException66 = new java.io.IOException((java.lang.Throwable) iOException60);
        iOException20.addSuppressed((java.lang.Throwable) iOException60);
        java.lang.Throwable throwable68 = null;
        // The following exception was thrown during execution in test generation
        try {
            iOException60.addSuppressed(throwable68);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot suppress a null exception.");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(throwableArray4);
        org.junit.Assert.assertNotNull(throwableArray13);
        org.junit.Assert.assertNotNull(throwableArray27);
        org.junit.Assert.assertNotNull(throwableArray28);
        org.junit.Assert.assertNotNull(throwableArray34);
        org.junit.Assert.assertNotNull(throwableArray43);
    }

    @Test
    public void test00433() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00433");
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper2 = org.apache.commons.lang3.text.translate.UnicodeEscaper.between((int) (byte) 100, (int) (short) 100);
        java.io.Writer writer5 = null;
        int int6 = unicodeEscaper2.translate((java.lang.CharSequence) "java\\u002Eio\\u002E\\u0049\\u004F\\u0045xception\\u003A\\u0020java\\u002Eio\\u002E\\u0049\\u004F\\u0045xception", (int) (byte) 0, writer5);
        java.io.Writer writer9 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int10 = unicodeEscaper2.translate((java.lang.CharSequence) "java.io.IOException: java.io.IOException: java.io.IOException: ", (int) (short) 100, writer9);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 100");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(unicodeEscaper2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test00434() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00434");
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper1 = org.apache.commons.lang3.text.translate.UnicodeEscaper.above(10);
        java.io.Writer writer4 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int5 = unicodeEscaper1.translate((java.lang.CharSequence) "java.io.IOException: java.io.IOException: java.io.IOException: java.io.IOException: 0", (int) (short) 100, writer4);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 100");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(unicodeEscaper1);
    }

    @Test
    public void test00435() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00435");
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper2 = org.apache.commons.lang3.text.translate.UnicodeEscaper.between(0, (int) 'a');
        java.io.Writer writer4 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean5 = unicodeEscaper2.translate(0, writer4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(unicodeEscaper2);
    }

    @Test
    public void test00436() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00436");
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper2 = org.apache.commons.lang3.text.translate.UnicodeEscaper.between((int) 'a', (int) (byte) 100);
        java.io.Writer writer4 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean5 = unicodeEscaper2.translate((int) (byte) 100, writer4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(unicodeEscaper2);
    }

    @Test
    public void test00437() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00437");
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper2 = org.apache.commons.lang3.text.translate.UnicodeEscaper.outsideOf((int) (byte) 100, (int) (byte) 10);
        java.lang.String str4 = unicodeEscaper2.translate((java.lang.CharSequence) "hi!");
        java.io.Writer writer7 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int8 = unicodeEscaper2.translate((java.lang.CharSequence) "\\u006Aa\\u0076a.\\u0069\\u006F.IOE\\u0078\\u0063\\u0065\\u0070\\u0074\\u0069\\u006F\\u006E: \\u0068\\u0069!", (int) (short) 1, writer7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(unicodeEscaper2);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "\\u0068\\u0069\\u0021" + "'", str4, "\\u0068\\u0069\\u0021");
    }

    @Test
    public void test00438() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00438");
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper1 = org.apache.commons.lang3.text.translate.UnicodeEscaper.above((int) (byte) 10);
        java.io.Writer writer3 = null;
        boolean boolean4 = unicodeEscaper1.translate((int) (short) 1, writer3);
        java.io.Writer writer6 = null;
        // The following exception was thrown during execution in test generation
        try {
            unicodeEscaper1.translate((java.lang.CharSequence) "java.io.IOException: java.io.IOException: java.io.IOException: 0", writer6);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Writer must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(unicodeEscaper1);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test00439() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00439");
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper2 = org.apache.commons.lang3.text.translate.UnicodeEscaper.outsideOf(10, 10);
        java.io.Writer writer4 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean5 = unicodeEscaper2.translate(0, writer4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(unicodeEscaper2);
    }

    @Test
    public void test00440() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00440");
        java.io.IOException iOException1 = new java.io.IOException("hi!");
        java.lang.Throwable[] throwableArray2 = iOException1.getSuppressed();
        java.io.IOException iOException3 = new java.io.IOException((java.lang.Throwable) iOException1);
        java.io.IOException iOException4 = new java.io.IOException();
        java.io.IOException iOException5 = new java.io.IOException();
        iOException4.addSuppressed((java.lang.Throwable) iOException5);
        java.lang.Throwable[] throwableArray7 = iOException5.getSuppressed();
        java.io.IOException iOException8 = new java.io.IOException((java.lang.Throwable) iOException5);
        java.io.IOException iOException10 = new java.io.IOException("");
        java.io.IOException iOException11 = new java.io.IOException((java.lang.Throwable) iOException10);
        iOException5.addSuppressed((java.lang.Throwable) iOException11);
        iOException3.addSuppressed((java.lang.Throwable) iOException5);
        java.lang.String str14 = iOException5.toString();
        org.junit.Assert.assertNotNull(throwableArray2);
        org.junit.Assert.assertNotNull(throwableArray7);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "java.io.IOException" + "'", str14, "java.io.IOException");
    }

    @Test
    public void test00441() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00441");
        java.io.IOException iOException1 = new java.io.IOException();
        java.io.IOException iOException2 = new java.io.IOException();
        iOException1.addSuppressed((java.lang.Throwable) iOException2);
        java.lang.Throwable[] throwableArray4 = iOException2.getSuppressed();
        java.lang.Throwable[] throwableArray5 = iOException2.getSuppressed();
        java.io.IOException iOException6 = new java.io.IOException("java.io.IOException", (java.lang.Throwable) iOException2);
        java.io.IOException iOException7 = new java.io.IOException();
        java.io.IOException iOException8 = new java.io.IOException();
        iOException7.addSuppressed((java.lang.Throwable) iOException8);
        java.io.IOException iOException10 = new java.io.IOException((java.lang.Throwable) iOException7);
        java.lang.Throwable[] throwableArray11 = iOException10.getSuppressed();
        iOException6.addSuppressed((java.lang.Throwable) iOException10);
        java.io.IOException iOException14 = new java.io.IOException();
        java.io.IOException iOException15 = new java.io.IOException();
        iOException14.addSuppressed((java.lang.Throwable) iOException15);
        java.io.IOException iOException17 = new java.io.IOException();
        java.io.IOException iOException18 = new java.io.IOException();
        iOException17.addSuppressed((java.lang.Throwable) iOException18);
        java.lang.Throwable[] throwableArray20 = iOException18.getSuppressed();
        java.io.IOException iOException21 = new java.io.IOException((java.lang.Throwable) iOException18);
        java.io.IOException iOException23 = new java.io.IOException("");
        java.io.IOException iOException24 = new java.io.IOException((java.lang.Throwable) iOException23);
        iOException18.addSuppressed((java.lang.Throwable) iOException24);
        iOException15.addSuppressed((java.lang.Throwable) iOException24);
        java.io.IOException iOException27 = new java.io.IOException("java.io.IOException", (java.lang.Throwable) iOException24);
        iOException10.addSuppressed((java.lang.Throwable) iOException27);
        java.io.IOException iOException30 = new java.io.IOException("");
        java.io.IOException iOException31 = new java.io.IOException((java.lang.Throwable) iOException30);
        java.io.IOException iOException33 = new java.io.IOException("");
        iOException31.addSuppressed((java.lang.Throwable) iOException33);
        java.io.IOException iOException36 = new java.io.IOException("");
        java.io.IOException iOException37 = new java.io.IOException((java.lang.Throwable) iOException36);
        java.io.IOException iOException39 = new java.io.IOException("");
        iOException37.addSuppressed((java.lang.Throwable) iOException39);
        iOException31.addSuppressed((java.lang.Throwable) iOException37);
        iOException10.addSuppressed((java.lang.Throwable) iOException37);
        java.lang.Class<?> wildcardClass43 = iOException10.getClass();
        org.junit.Assert.assertNotNull(throwableArray4);
        org.junit.Assert.assertNotNull(throwableArray5);
        org.junit.Assert.assertNotNull(throwableArray11);
        org.junit.Assert.assertNotNull(throwableArray20);
        org.junit.Assert.assertNotNull(wildcardClass43);
    }

    @Test
    public void test00442() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00442");
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper2 = org.apache.commons.lang3.text.translate.UnicodeEscaper.outsideOf((int) ' ', (int) (short) 0);
        java.io.Writer writer5 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int6 = unicodeEscaper2.translate((java.lang.CharSequence) "java.io.IOException: java.io.IOException: 0", (int) (byte) 1, writer5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(unicodeEscaper2);
    }

    @Test
    public void test00443() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00443");
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper2 = org.apache.commons.lang3.text.translate.UnicodeEscaper.outsideOf((int) (byte) 100, (int) (byte) 0);
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper5 = org.apache.commons.lang3.text.translate.UnicodeEscaper.between((-1), (int) (short) 0);
        java.lang.String str7 = unicodeEscaper5.translate((java.lang.CharSequence) "0");
        org.apache.commons.lang3.text.translate.CharSequenceTranslator[] charSequenceTranslatorArray8 = new org.apache.commons.lang3.text.translate.CharSequenceTranslator[] {};
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator9 = unicodeEscaper5.with(charSequenceTranslatorArray8);
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator10 = unicodeEscaper2.with(charSequenceTranslatorArray8);
        java.io.Writer writer12 = null;
        // The following exception was thrown during execution in test generation
        try {
            charSequenceTranslator10.translate((java.lang.CharSequence) "java.io.IOException:\\u0020java.io.IOException:\\u0020java.io.IOException:\\u0020java.io.IOException:\\u0020java.io.IOException:\\u00200", writer12);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Writer must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(unicodeEscaper2);
        org.junit.Assert.assertNotNull(unicodeEscaper5);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "0" + "'", str7, "0");
        org.junit.Assert.assertNotNull(charSequenceTranslatorArray8);
        org.junit.Assert.assertNotNull(charSequenceTranslator9);
        org.junit.Assert.assertNotNull(charSequenceTranslator10);
    }

    @Test
    public void test00444() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00444");
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper1 = org.apache.commons.lang3.text.translate.UnicodeEscaper.above((int) 'a');
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper3 = org.apache.commons.lang3.text.translate.UnicodeEscaper.below((int) (byte) 0);
        java.io.Writer writer5 = null;
        boolean boolean6 = unicodeEscaper3.translate((int) ' ', writer5);
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper9 = org.apache.commons.lang3.text.translate.UnicodeEscaper.between((-1), (int) (short) 0);
        java.lang.String str11 = unicodeEscaper9.translate((java.lang.CharSequence) "0");
        org.apache.commons.lang3.text.translate.CharSequenceTranslator[] charSequenceTranslatorArray12 = new org.apache.commons.lang3.text.translate.CharSequenceTranslator[] {};
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator13 = unicodeEscaper9.with(charSequenceTranslatorArray12);
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator14 = unicodeEscaper3.with(charSequenceTranslatorArray12);
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator15 = unicodeEscaper1.with(charSequenceTranslatorArray12);
        java.io.Writer writer17 = null;
        // The following exception was thrown during execution in test generation
        try {
            unicodeEscaper1.translate((java.lang.CharSequence) "java.io.IOException: A", writer17);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Writer must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(unicodeEscaper1);
        org.junit.Assert.assertNotNull(unicodeEscaper3);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(unicodeEscaper9);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "0" + "'", str11, "0");
        org.junit.Assert.assertNotNull(charSequenceTranslatorArray12);
        org.junit.Assert.assertNotNull(charSequenceTranslator13);
        org.junit.Assert.assertNotNull(charSequenceTranslator14);
        org.junit.Assert.assertNotNull(charSequenceTranslator15);
    }

    @Test
    public void test00445() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00445");
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper1 = org.apache.commons.lang3.text.translate.UnicodeEscaper.below((int) ' ');
        java.lang.String str3 = unicodeEscaper1.translate((java.lang.CharSequence) "java.io.IOException: java.io.IOException: java.io.IOException: 0");
        java.io.Writer writer5 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean6 = unicodeEscaper1.translate((int) (short) 0, writer5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(unicodeEscaper1);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "java.io.IOException: java.io.IOException: java.io.IOException: 0" + "'", str3, "java.io.IOException: java.io.IOException: java.io.IOException: 0");
    }

    @Test
    public void test00446() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00446");
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper1 = org.apache.commons.lang3.text.translate.UnicodeEscaper.above((int) (byte) 0);
        java.lang.Class<?> wildcardClass2 = unicodeEscaper1.getClass();
        org.junit.Assert.assertNotNull(unicodeEscaper1);
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test00447() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00447");
        java.io.IOException iOException2 = new java.io.IOException("0");
        java.io.IOException iOException3 = new java.io.IOException();
        java.io.IOException iOException4 = new java.io.IOException();
        iOException3.addSuppressed((java.lang.Throwable) iOException4);
        java.io.IOException iOException6 = new java.io.IOException();
        java.io.IOException iOException7 = new java.io.IOException();
        iOException6.addSuppressed((java.lang.Throwable) iOException7);
        java.lang.Throwable[] throwableArray9 = iOException7.getSuppressed();
        java.io.IOException iOException10 = new java.io.IOException((java.lang.Throwable) iOException7);
        java.io.IOException iOException12 = new java.io.IOException("");
        java.io.IOException iOException13 = new java.io.IOException((java.lang.Throwable) iOException12);
        iOException7.addSuppressed((java.lang.Throwable) iOException13);
        iOException4.addSuppressed((java.lang.Throwable) iOException13);
        iOException2.addSuppressed((java.lang.Throwable) iOException13);
        java.io.IOException iOException17 = new java.io.IOException("61", (java.lang.Throwable) iOException13);
        java.io.IOException iOException18 = new java.io.IOException((java.lang.Throwable) iOException13);
        java.io.IOException iOException19 = new java.io.IOException();
        java.io.IOException iOException20 = new java.io.IOException();
        iOException19.addSuppressed((java.lang.Throwable) iOException20);
        java.io.IOException iOException22 = new java.io.IOException();
        java.io.IOException iOException23 = new java.io.IOException();
        iOException22.addSuppressed((java.lang.Throwable) iOException23);
        java.lang.Throwable[] throwableArray25 = iOException23.getSuppressed();
        java.io.IOException iOException26 = new java.io.IOException((java.lang.Throwable) iOException23);
        java.io.IOException iOException28 = new java.io.IOException("");
        java.io.IOException iOException29 = new java.io.IOException((java.lang.Throwable) iOException28);
        iOException23.addSuppressed((java.lang.Throwable) iOException29);
        iOException20.addSuppressed((java.lang.Throwable) iOException29);
        java.lang.Throwable[] throwableArray32 = iOException20.getSuppressed();
        java.lang.Throwable[] throwableArray33 = iOException20.getSuppressed();
        java.lang.Throwable[] throwableArray34 = iOException20.getSuppressed();
        java.io.IOException iOException35 = new java.io.IOException((java.lang.Throwable) iOException20);
        java.io.IOException iOException36 = new java.io.IOException((java.lang.Throwable) iOException35);
        java.io.IOException iOException37 = new java.io.IOException((java.lang.Throwable) iOException35);
        iOException13.addSuppressed((java.lang.Throwable) iOException37);
        java.lang.String str39 = iOException13.toString();
        org.junit.Assert.assertNotNull(throwableArray9);
        org.junit.Assert.assertNotNull(throwableArray25);
        org.junit.Assert.assertNotNull(throwableArray32);
        org.junit.Assert.assertNotNull(throwableArray33);
        org.junit.Assert.assertNotNull(throwableArray34);
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "java.io.IOException: java.io.IOException: " + "'", str39, "java.io.IOException: java.io.IOException: ");
    }

    @Test
    public void test00448() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00448");
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper1 = org.apache.commons.lang3.text.translate.UnicodeEscaper.above(10);
        java.lang.String str3 = unicodeEscaper1.translate((java.lang.CharSequence) "java\\u002Eio\\u002E\\u0049\\u004F\\u0045xception\\u003A\\u0020java\\u002Eio\\u002E\\u0049\\u004F\\u0045xception");
        java.io.Writer writer5 = null;
        // The following exception was thrown during execution in test generation
        try {
            unicodeEscaper1.translate((java.lang.CharSequence) "java.io.IOException:\\u0020java.io.IOException:\\u0020java.io.IOException:\\u0020java.io.IOException:\\u0020java.io.IOException:\\u00200", writer5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Writer must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(unicodeEscaper1);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\\u006A\\u0061\\u0076\\u0061\\u005C\\u0075\\u0030\\u0030\\u0032\\u0045\\u0069\\u006F\\u005C\\u0075\\u0030\\u0030\\u0032\\u0045\\u005C\\u0075\\u0030\\u0030\\u0034\\u0039\\u005C\\u0075\\u0030\\u0030\\u0034\\u0046\\u005C\\u0075\\u0030\\u0030\\u0034\\u0035\\u0078\\u0063\\u0065\\u0070\\u0074\\u0069\\u006F\\u006E\\u005C\\u0075\\u0030\\u0030\\u0033\\u0041\\u005C\\u0075\\u0030\\u0030\\u0032\\u0030\\u006A\\u0061\\u0076\\u0061\\u005C\\u0075\\u0030\\u0030\\u0032\\u0045\\u0069\\u006F\\u005C\\u0075\\u0030\\u0030\\u0032\\u0045\\u005C\\u0075\\u0030\\u0030\\u0034\\u0039\\u005C\\u0075\\u0030\\u0030\\u0034\\u0046\\u005C\\u0075\\u0030\\u0030\\u0034\\u0035\\u0078\\u0063\\u0065\\u0070\\u0074\\u0069\\u006F\\u006E" + "'", str3, "\\u006A\\u0061\\u0076\\u0061\\u005C\\u0075\\u0030\\u0030\\u0032\\u0045\\u0069\\u006F\\u005C\\u0075\\u0030\\u0030\\u0032\\u0045\\u005C\\u0075\\u0030\\u0030\\u0034\\u0039\\u005C\\u0075\\u0030\\u0030\\u0034\\u0046\\u005C\\u0075\\u0030\\u0030\\u0034\\u0035\\u0078\\u0063\\u0065\\u0070\\u0074\\u0069\\u006F\\u006E\\u005C\\u0075\\u0030\\u0030\\u0033\\u0041\\u005C\\u0075\\u0030\\u0030\\u0032\\u0030\\u006A\\u0061\\u0076\\u0061\\u005C\\u0075\\u0030\\u0030\\u0032\\u0045\\u0069\\u006F\\u005C\\u0075\\u0030\\u0030\\u0032\\u0045\\u005C\\u0075\\u0030\\u0030\\u0034\\u0039\\u005C\\u0075\\u0030\\u0030\\u0034\\u0046\\u005C\\u0075\\u0030\\u0030\\u0034\\u0035\\u0078\\u0063\\u0065\\u0070\\u0074\\u0069\\u006F\\u006E");
    }

    @Test
    public void test00449() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00449");
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper2 = org.apache.commons.lang3.text.translate.UnicodeEscaper.outsideOf(10, (int) (byte) 0);
        java.io.Writer writer5 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int6 = unicodeEscaper2.translate((java.lang.CharSequence) "java.io.IOException: hi!", (int) (short) 1, writer5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(unicodeEscaper2);
    }

    @Test
    public void test00450() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00450");
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper2 = org.apache.commons.lang3.text.translate.UnicodeEscaper.outsideOf((int) (byte) 100, 0);
        java.io.Writer writer4 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean5 = unicodeEscaper2.translate((int) 'a', writer4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(unicodeEscaper2);
    }

    @Test
    public void test00451() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00451");
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper1 = org.apache.commons.lang3.text.translate.UnicodeEscaper.below(10);
        java.io.Writer writer3 = null;
        // The following exception was thrown during execution in test generation
        try {
            unicodeEscaper1.translate((java.lang.CharSequence) "\\u006A\\u0061\\u0076\\u0061\\u002E\\u0069\\u006F\\u002E\\u0049\\u004F\\u0045\\u0078\\u0063\\u0065\\u0070\\u0074\\u0069\\u006F\\u006E\\u003A\\u0020\\u005C\\u0075\\u0030\\u0030\\u0036\\u0038\\u005C\\u0075\\u0030\\u0030\\u0036\\u0039\\u005C\\u0075\\u0030\\u0030\\u0032\\u0031", writer3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Writer must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(unicodeEscaper1);
    }

    @Test
    public void test00452() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00452");
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper2 = org.apache.commons.lang3.text.translate.UnicodeEscaper.between((int) '#', 10);
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper4 = org.apache.commons.lang3.text.translate.UnicodeEscaper.below((int) 'a');
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper7 = org.apache.commons.lang3.text.translate.UnicodeEscaper.between((int) (byte) 1, (int) '#');
        java.io.Writer writer9 = null;
        boolean boolean10 = unicodeEscaper7.translate((int) '4', writer9);
        java.io.Writer writer12 = null;
        boolean boolean13 = unicodeEscaper7.translate((int) (byte) -1, writer12);
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper16 = org.apache.commons.lang3.text.translate.UnicodeEscaper.between((int) (byte) 1, (int) '#');
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper18 = org.apache.commons.lang3.text.translate.UnicodeEscaper.below(100);
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper20 = org.apache.commons.lang3.text.translate.UnicodeEscaper.below((int) 'a');
        java.lang.String str22 = unicodeEscaper20.translate((java.lang.CharSequence) "java.io.IOException: java.io.IOException");
        org.apache.commons.lang3.text.translate.CharSequenceTranslator[] charSequenceTranslatorArray23 = new org.apache.commons.lang3.text.translate.CharSequenceTranslator[] { unicodeEscaper16, unicodeEscaper18, unicodeEscaper20 };
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator24 = unicodeEscaper7.with(charSequenceTranslatorArray23);
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper27 = org.apache.commons.lang3.text.translate.UnicodeEscaper.outsideOf(0, (int) 'a');
        java.io.Writer writer29 = null;
        boolean boolean30 = unicodeEscaper27.translate((int) (short) 10, writer29);
        java.lang.String str32 = unicodeEscaper27.translate((java.lang.CharSequence) "0");
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper35 = org.apache.commons.lang3.text.translate.UnicodeEscaper.between((int) (byte) 1, (int) '#');
        java.io.Writer writer37 = null;
        boolean boolean38 = unicodeEscaper35.translate((int) '4', writer37);
        java.io.Writer writer40 = null;
        boolean boolean41 = unicodeEscaper35.translate((int) (byte) -1, writer40);
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper44 = org.apache.commons.lang3.text.translate.UnicodeEscaper.between((int) (byte) 1, (int) '#');
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper46 = org.apache.commons.lang3.text.translate.UnicodeEscaper.below(100);
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper48 = org.apache.commons.lang3.text.translate.UnicodeEscaper.below((int) 'a');
        java.lang.String str50 = unicodeEscaper48.translate((java.lang.CharSequence) "java.io.IOException: java.io.IOException");
        org.apache.commons.lang3.text.translate.CharSequenceTranslator[] charSequenceTranslatorArray51 = new org.apache.commons.lang3.text.translate.CharSequenceTranslator[] { unicodeEscaper44, unicodeEscaper46, unicodeEscaper48 };
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator52 = unicodeEscaper35.with(charSequenceTranslatorArray51);
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator53 = unicodeEscaper27.with(charSequenceTranslatorArray51);
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator54 = unicodeEscaper7.with(charSequenceTranslatorArray51);
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator55 = unicodeEscaper4.with(charSequenceTranslatorArray51);
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator56 = unicodeEscaper2.with(charSequenceTranslatorArray51);
        java.io.Writer writer59 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int60 = charSequenceTranslator56.translate((java.lang.CharSequence) "j\\u0061v\\u0061\\u002Eio\\u002E\\u0049\\u004F\\u0045x\\u0063eption\\u003A\\u0020j\\u0061v\\u0061\\u002Eio\\u002E\\u0049\\u004F\\u0045x\\u0063eption", (int) (short) 10, writer59);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(unicodeEscaper2);
        org.junit.Assert.assertNotNull(unicodeEscaper4);
        org.junit.Assert.assertNotNull(unicodeEscaper7);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(unicodeEscaper16);
        org.junit.Assert.assertNotNull(unicodeEscaper18);
        org.junit.Assert.assertNotNull(unicodeEscaper20);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "java\\u002Eio\\u002E\\u0049\\u004F\\u0045xception\\u003A\\u0020java\\u002Eio\\u002E\\u0049\\u004F\\u0045xception" + "'", str22, "java\\u002Eio\\u002E\\u0049\\u004F\\u0045xception\\u003A\\u0020java\\u002Eio\\u002E\\u0049\\u004F\\u0045xception");
        org.junit.Assert.assertNotNull(charSequenceTranslatorArray23);
        org.junit.Assert.assertNotNull(charSequenceTranslator24);
        org.junit.Assert.assertNotNull(unicodeEscaper27);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "0" + "'", str32, "0");
        org.junit.Assert.assertNotNull(unicodeEscaper35);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertNotNull(unicodeEscaper44);
        org.junit.Assert.assertNotNull(unicodeEscaper46);
        org.junit.Assert.assertNotNull(unicodeEscaper48);
        org.junit.Assert.assertEquals("'" + str50 + "' != '" + "java\\u002Eio\\u002E\\u0049\\u004F\\u0045xception\\u003A\\u0020java\\u002Eio\\u002E\\u0049\\u004F\\u0045xception" + "'", str50, "java\\u002Eio\\u002E\\u0049\\u004F\\u0045xception\\u003A\\u0020java\\u002Eio\\u002E\\u0049\\u004F\\u0045xception");
        org.junit.Assert.assertNotNull(charSequenceTranslatorArray51);
        org.junit.Assert.assertNotNull(charSequenceTranslator52);
        org.junit.Assert.assertNotNull(charSequenceTranslator53);
        org.junit.Assert.assertNotNull(charSequenceTranslator54);
        org.junit.Assert.assertNotNull(charSequenceTranslator55);
        org.junit.Assert.assertNotNull(charSequenceTranslator56);
    }

    @Test
    public void test00453() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00453");
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper2 = org.apache.commons.lang3.text.translate.UnicodeEscaper.outsideOf((int) '4', (-1));
        org.apache.commons.lang3.text.translate.CharSequenceTranslator[] charSequenceTranslatorArray3 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator4 = unicodeEscaper2.with(charSequenceTranslatorArray3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(unicodeEscaper2);
    }

    @Test
    public void test00454() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00454");
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper2 = org.apache.commons.lang3.text.translate.UnicodeEscaper.between((int) (byte) 100, (int) (short) 100);
        java.io.Writer writer5 = null;
        int int6 = unicodeEscaper2.translate((java.lang.CharSequence) "java\\u002Eio\\u002E\\u0049\\u004F\\u0045xception\\u003A\\u0020java\\u002Eio\\u002E\\u0049\\u004F\\u0045xception", (int) (byte) 0, writer5);
        java.io.Writer writer9 = null;
        int int10 = unicodeEscaper2.translate((java.lang.CharSequence) "34", (int) (byte) 1, writer9);
        java.io.Writer writer12 = null;
        // The following exception was thrown during execution in test generation
        try {
            unicodeEscaper2.translate((java.lang.CharSequence) "\\u006A\\u0061\\u0076\\u0061\\u002E\\u0069\\u006F\\u002E\\u0049\\u004F\\u0045\\u0078\\u0063\\u0065\\u0070\\u0074\\u0069\\u006F\\u006E", writer12);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Writer must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(unicodeEscaper2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test00455() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00455");
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper2 = org.apache.commons.lang3.text.translate.UnicodeEscaper.outsideOf((int) (short) 10, (int) ' ');
        java.io.Writer writer4 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean5 = unicodeEscaper2.translate(1, writer4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(unicodeEscaper2);
    }

    @Test
    public void test00456() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00456");
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper0 = new org.apache.commons.lang3.text.translate.UnicodeEscaper();
        java.lang.String str2 = unicodeEscaper0.translate((java.lang.CharSequence) "hi!");
        java.io.Writer writer4 = null;
        boolean boolean5 = unicodeEscaper0.translate((int) (byte) -1, writer4);
        java.lang.String str7 = unicodeEscaper0.translate((java.lang.CharSequence) "");
        java.lang.String str9 = unicodeEscaper0.translate((java.lang.CharSequence) "64");
        java.io.Writer writer11 = null;
        // The following exception was thrown during execution in test generation
        try {
            unicodeEscaper0.translate((java.lang.CharSequence) "\\\\u0075006Aa\\\\u00750076a.\\\\u00750069\\\\u0075006F.IOE\\\\u00750078\\u0063\\\\u00750065\\\\u00750070\\\\u00750074\\\\u00750069\\\\u0075006F\\\\u0075006E: \\\\u0075006Aa\\\\u00750076a.\\\\u00750069\\\\u0075006F.IOE\\\\u00750078\\u0063\\\\u00750065\\\\u00750070\\\\u00750074\\\\u00750069\\\\u0075006F\\\\u0075006E", writer11);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Writer must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\\u0068\\u0069\\u0021" + "'", str2, "\\u0068\\u0069\\u0021");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "\\u0036\\u0034" + "'", str9, "\\u0036\\u0034");
    }

    @Test
    public void test00457() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00457");
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper2 = org.apache.commons.lang3.text.translate.UnicodeEscaper.between((int) '#', 10);
        java.io.Writer writer5 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int6 = unicodeEscaper2.translate((java.lang.CharSequence) "java.io.IOException: java.io.IOException: java.io.IOException: java.io.IOException: 0", (int) (short) 100, writer5);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 100");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(unicodeEscaper2);
    }

    @Test
    public void test00458() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00458");
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper1 = org.apache.commons.lang3.text.translate.UnicodeEscaper.above((int) (byte) 10);
        java.lang.String str3 = unicodeEscaper1.translate((java.lang.CharSequence) "\\u0036\\u0034");
        java.io.Writer writer6 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int7 = unicodeEscaper1.translate((java.lang.CharSequence) "A", 0, writer6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(unicodeEscaper1);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\\u005C\\u0075\\u0030\\u0030\\u0033\\u0036\\u005C\\u0075\\u0030\\u0030\\u0033\\u0034" + "'", str3, "\\u005C\\u0075\\u0030\\u0030\\u0033\\u0036\\u005C\\u0075\\u0030\\u0030\\u0033\\u0034");
    }

    @Test
    public void test00459() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00459");
        java.io.IOException iOException1 = new java.io.IOException();
        java.io.IOException iOException2 = new java.io.IOException();
        iOException1.addSuppressed((java.lang.Throwable) iOException2);
        java.io.IOException iOException4 = new java.io.IOException("0", (java.lang.Throwable) iOException1);
        java.io.IOException iOException5 = new java.io.IOException((java.lang.Throwable) iOException4);
        java.io.IOException iOException6 = new java.io.IOException((java.lang.Throwable) iOException5);
        java.io.IOException iOException8 = new java.io.IOException();
        java.io.IOException iOException9 = new java.io.IOException();
        iOException8.addSuppressed((java.lang.Throwable) iOException9);
        java.lang.Throwable[] throwableArray11 = iOException9.getSuppressed();
        java.lang.Throwable[] throwableArray12 = iOException9.getSuppressed();
        java.io.IOException iOException13 = new java.io.IOException("java.io.IOException", (java.lang.Throwable) iOException9);
        java.io.IOException iOException14 = new java.io.IOException();
        java.io.IOException iOException15 = new java.io.IOException();
        iOException14.addSuppressed((java.lang.Throwable) iOException15);
        java.io.IOException iOException17 = new java.io.IOException((java.lang.Throwable) iOException14);
        java.lang.Throwable[] throwableArray18 = iOException17.getSuppressed();
        iOException13.addSuppressed((java.lang.Throwable) iOException17);
        iOException5.addSuppressed((java.lang.Throwable) iOException17);
        java.lang.Throwable[] throwableArray21 = iOException17.getSuppressed();
        java.lang.Throwable throwable22 = null;
        java.io.IOException iOException23 = new java.io.IOException(throwable22);
        // The following exception was thrown during execution in test generation
        try {
            iOException17.addSuppressed(throwable22);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot suppress a null exception.");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(throwableArray11);
        org.junit.Assert.assertNotNull(throwableArray12);
        org.junit.Assert.assertNotNull(throwableArray18);
        org.junit.Assert.assertNotNull(throwableArray21);
    }

    @Test
    public void test00460() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00460");
        java.lang.Throwable throwable0 = null;
        java.io.IOException iOException1 = new java.io.IOException(throwable0);
        java.io.IOException iOException2 = new java.io.IOException((java.lang.Throwable) iOException1);
        java.lang.Class<?> wildcardClass3 = iOException1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test00461() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00461");
        java.io.IOException iOException2 = new java.io.IOException("");
        java.io.IOException iOException3 = new java.io.IOException((java.lang.Throwable) iOException2);
        java.io.IOException iOException4 = new java.io.IOException((java.lang.Throwable) iOException3);
        java.io.IOException iOException5 = new java.io.IOException("23", (java.lang.Throwable) iOException3);
        java.lang.String str6 = iOException5.toString();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "java.io.IOException: 23" + "'", str6, "java.io.IOException: 23");
    }

    @Test
    public void test00462() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00462");
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper2 = org.apache.commons.lang3.text.translate.UnicodeEscaper.outsideOf((int) (short) 100, 0);
        java.io.Writer writer5 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int6 = unicodeEscaper2.translate((java.lang.CharSequence) "java.io.IOException", (int) (byte) 10, writer5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(unicodeEscaper2);
    }

    @Test
    public void test00463() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00463");
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper2 = org.apache.commons.lang3.text.translate.UnicodeEscaper.outsideOf((int) (byte) 0, 0);
        java.io.Writer writer4 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean5 = unicodeEscaper2.translate(10, writer4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(unicodeEscaper2);
    }

    @Test
    public void test00464() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00464");
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper1 = org.apache.commons.lang3.text.translate.UnicodeEscaper.above((int) (byte) 10);
        java.io.Writer writer3 = null;
        boolean boolean4 = unicodeEscaper1.translate((int) (short) 1, writer3);
        java.io.Writer writer7 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int8 = unicodeEscaper1.translate((java.lang.CharSequence) "20", (int) (byte) 0, writer7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(unicodeEscaper1);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test00465() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00465");
        java.io.IOException iOException4 = new java.io.IOException();
        java.io.IOException iOException5 = new java.io.IOException();
        iOException4.addSuppressed((java.lang.Throwable) iOException5);
        java.io.IOException iOException7 = new java.io.IOException();
        java.io.IOException iOException8 = new java.io.IOException();
        iOException7.addSuppressed((java.lang.Throwable) iOException8);
        java.lang.Throwable[] throwableArray10 = iOException8.getSuppressed();
        java.io.IOException iOException11 = new java.io.IOException((java.lang.Throwable) iOException8);
        java.io.IOException iOException13 = new java.io.IOException("");
        java.io.IOException iOException14 = new java.io.IOException((java.lang.Throwable) iOException13);
        iOException8.addSuppressed((java.lang.Throwable) iOException14);
        iOException5.addSuppressed((java.lang.Throwable) iOException14);
        java.io.IOException iOException17 = new java.io.IOException("java.io.IOException", (java.lang.Throwable) iOException14);
        java.io.IOException iOException18 = new java.io.IOException("64", (java.lang.Throwable) iOException17);
        java.io.IOException iOException19 = new java.io.IOException("java.io.IOException: java.io.IOException: ", (java.lang.Throwable) iOException18);
        java.io.IOException iOException20 = new java.io.IOException("\\u0036\\u0034", (java.lang.Throwable) iOException18);
        java.io.IOException iOException21 = new java.io.IOException((java.lang.Throwable) iOException18);
        java.lang.Class<?> wildcardClass22 = iOException21.getClass();
        org.junit.Assert.assertNotNull(throwableArray10);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test00466() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00466");
        java.io.IOException iOException1 = new java.io.IOException();
        java.io.IOException iOException2 = new java.io.IOException();
        iOException1.addSuppressed((java.lang.Throwable) iOException2);
        java.io.IOException iOException4 = new java.io.IOException("0", (java.lang.Throwable) iOException1);
        java.io.IOException iOException5 = new java.io.IOException((java.lang.Throwable) iOException4);
        java.io.IOException iOException6 = new java.io.IOException((java.lang.Throwable) iOException5);
        java.io.IOException iOException7 = new java.io.IOException((java.lang.Throwable) iOException6);
        java.lang.Throwable[] throwableArray8 = iOException7.getSuppressed();
        java.io.IOException iOException12 = new java.io.IOException("0");
        java.lang.Throwable[] throwableArray13 = iOException12.getSuppressed();
        java.io.IOException iOException14 = new java.io.IOException("hi!", (java.lang.Throwable) iOException12);
        java.io.IOException iOException16 = new java.io.IOException("");
        java.io.IOException iOException17 = new java.io.IOException((java.lang.Throwable) iOException16);
        java.io.IOException iOException19 = new java.io.IOException("");
        iOException17.addSuppressed((java.lang.Throwable) iOException19);
        java.io.IOException iOException22 = new java.io.IOException("");
        java.io.IOException iOException23 = new java.io.IOException((java.lang.Throwable) iOException22);
        java.io.IOException iOException25 = new java.io.IOException("");
        iOException23.addSuppressed((java.lang.Throwable) iOException25);
        iOException17.addSuppressed((java.lang.Throwable) iOException23);
        iOException14.addSuppressed((java.lang.Throwable) iOException17);
        java.io.IOException iOException29 = new java.io.IOException("java\\u002Eio\\u002E\\u0049\\u004F\\u0045xception\\u003A\\u0020java\\u002Eio\\u002E\\u0049\\u004F\\u0045xception", (java.lang.Throwable) iOException17);
        iOException7.addSuppressed((java.lang.Throwable) iOException29);
        java.lang.Throwable[] throwableArray31 = iOException29.getSuppressed();
        java.io.IOException iOException33 = new java.io.IOException();
        java.io.IOException iOException34 = new java.io.IOException();
        iOException33.addSuppressed((java.lang.Throwable) iOException34);
        java.io.IOException iOException36 = new java.io.IOException("0", (java.lang.Throwable) iOException33);
        java.io.IOException iOException37 = new java.io.IOException((java.lang.Throwable) iOException36);
        java.io.IOException iOException38 = new java.io.IOException((java.lang.Throwable) iOException37);
        java.io.IOException iOException40 = new java.io.IOException();
        java.io.IOException iOException41 = new java.io.IOException();
        iOException40.addSuppressed((java.lang.Throwable) iOException41);
        java.lang.Throwable[] throwableArray43 = iOException41.getSuppressed();
        java.lang.Throwable[] throwableArray44 = iOException41.getSuppressed();
        java.io.IOException iOException45 = new java.io.IOException("java.io.IOException", (java.lang.Throwable) iOException41);
        java.io.IOException iOException46 = new java.io.IOException();
        java.io.IOException iOException47 = new java.io.IOException();
        iOException46.addSuppressed((java.lang.Throwable) iOException47);
        java.io.IOException iOException49 = new java.io.IOException((java.lang.Throwable) iOException46);
        java.lang.Throwable[] throwableArray50 = iOException49.getSuppressed();
        iOException45.addSuppressed((java.lang.Throwable) iOException49);
        iOException37.addSuppressed((java.lang.Throwable) iOException49);
        iOException29.addSuppressed((java.lang.Throwable) iOException49);
        java.lang.Class<?> wildcardClass54 = iOException29.getClass();
        org.junit.Assert.assertNotNull(throwableArray8);
        org.junit.Assert.assertNotNull(throwableArray13);
        org.junit.Assert.assertNotNull(throwableArray31);
        org.junit.Assert.assertNotNull(throwableArray43);
        org.junit.Assert.assertNotNull(throwableArray44);
        org.junit.Assert.assertNotNull(throwableArray50);
        org.junit.Assert.assertNotNull(wildcardClass54);
    }

    @Test
    public void test00467() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00467");
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper1 = org.apache.commons.lang3.text.translate.UnicodeEscaper.above((int) (short) 100);
        java.io.Writer writer3 = null;
        boolean boolean4 = unicodeEscaper1.translate(0, writer3);
        java.lang.Class<?> wildcardClass5 = unicodeEscaper1.getClass();
        org.junit.Assert.assertNotNull(unicodeEscaper1);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test00468() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00468");
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper2 = org.apache.commons.lang3.text.translate.UnicodeEscaper.outsideOf((-1), (int) (short) 0);
        java.lang.String str4 = unicodeEscaper2.translate((java.lang.CharSequence) "java.io.IOException: ");
        java.io.Writer writer6 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean7 = unicodeEscaper2.translate(10, writer6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(unicodeEscaper2);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "\\u006A\\u0061\\u0076\\u0061\\u002E\\u0069\\u006F\\u002E\\u0049\\u004F\\u0045\\u0078\\u0063\\u0065\\u0070\\u0074\\u0069\\u006F\\u006E\\u003A\\u0020" + "'", str4, "\\u006A\\u0061\\u0076\\u0061\\u002E\\u0069\\u006F\\u002E\\u0049\\u004F\\u0045\\u0078\\u0063\\u0065\\u0070\\u0074\\u0069\\u006F\\u006E\\u003A\\u0020");
    }

    @Test
    public void test00469() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00469");
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper2 = org.apache.commons.lang3.text.translate.UnicodeEscaper.outsideOf((int) (short) 1, (int) ' ');
        java.io.Writer writer5 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int6 = unicodeEscaper2.translate((java.lang.CharSequence) "java.io.IOException: 23", 0, writer5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(unicodeEscaper2);
    }

    @Test
    public void test00470() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00470");
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper2 = org.apache.commons.lang3.text.translate.UnicodeEscaper.outsideOf(0, (int) 'a');
        java.io.Writer writer4 = null;
        boolean boolean5 = unicodeEscaper2.translate((int) (short) 10, writer4);
        java.io.Writer writer7 = null;
        boolean boolean8 = unicodeEscaper2.translate((int) '#', writer7);
        java.io.Writer writer10 = null;
        boolean boolean11 = unicodeEscaper2.translate(10, writer10);
        java.io.Writer writer13 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean14 = unicodeEscaper2.translate((int) (short) 100, writer13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(unicodeEscaper2);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test00471() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00471");
        java.io.IOException iOException1 = new java.io.IOException();
        java.io.IOException iOException2 = new java.io.IOException();
        iOException1.addSuppressed((java.lang.Throwable) iOException2);
        java.io.IOException iOException4 = new java.io.IOException("0", (java.lang.Throwable) iOException1);
        java.io.IOException iOException5 = new java.io.IOException((java.lang.Throwable) iOException4);
        java.lang.Throwable[] throwableArray6 = iOException4.getSuppressed();
        java.lang.String str7 = iOException4.toString();
        org.junit.Assert.assertNotNull(throwableArray6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "java.io.IOException: 0" + "'", str7, "java.io.IOException: 0");
    }

    @Test
    public void test00472() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00472");
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper2 = org.apache.commons.lang3.text.translate.UnicodeEscaper.between((int) (byte) 1, (int) '#');
        java.io.Writer writer4 = null;
        boolean boolean5 = unicodeEscaper2.translate((int) '4', writer4);
        java.io.Writer writer7 = null;
        boolean boolean8 = unicodeEscaper2.translate((int) (byte) -1, writer7);
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper11 = org.apache.commons.lang3.text.translate.UnicodeEscaper.between((int) (byte) 1, (int) '#');
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper13 = org.apache.commons.lang3.text.translate.UnicodeEscaper.below(100);
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper15 = org.apache.commons.lang3.text.translate.UnicodeEscaper.below((int) 'a');
        java.lang.String str17 = unicodeEscaper15.translate((java.lang.CharSequence) "java.io.IOException: java.io.IOException");
        org.apache.commons.lang3.text.translate.CharSequenceTranslator[] charSequenceTranslatorArray18 = new org.apache.commons.lang3.text.translate.CharSequenceTranslator[] { unicodeEscaper11, unicodeEscaper13, unicodeEscaper15 };
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator19 = unicodeEscaper2.with(charSequenceTranslatorArray18);
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper22 = org.apache.commons.lang3.text.translate.UnicodeEscaper.outsideOf(0, (int) 'a');
        java.io.Writer writer24 = null;
        boolean boolean25 = unicodeEscaper22.translate((int) (short) 10, writer24);
        java.lang.String str27 = unicodeEscaper22.translate((java.lang.CharSequence) "0");
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper30 = org.apache.commons.lang3.text.translate.UnicodeEscaper.between((int) (byte) 1, (int) '#');
        java.io.Writer writer32 = null;
        boolean boolean33 = unicodeEscaper30.translate((int) '4', writer32);
        java.io.Writer writer35 = null;
        boolean boolean36 = unicodeEscaper30.translate((int) (byte) -1, writer35);
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper39 = org.apache.commons.lang3.text.translate.UnicodeEscaper.between((int) (byte) 1, (int) '#');
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper41 = org.apache.commons.lang3.text.translate.UnicodeEscaper.below(100);
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper43 = org.apache.commons.lang3.text.translate.UnicodeEscaper.below((int) 'a');
        java.lang.String str45 = unicodeEscaper43.translate((java.lang.CharSequence) "java.io.IOException: java.io.IOException");
        org.apache.commons.lang3.text.translate.CharSequenceTranslator[] charSequenceTranslatorArray46 = new org.apache.commons.lang3.text.translate.CharSequenceTranslator[] { unicodeEscaper39, unicodeEscaper41, unicodeEscaper43 };
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator47 = unicodeEscaper30.with(charSequenceTranslatorArray46);
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator48 = unicodeEscaper22.with(charSequenceTranslatorArray46);
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator49 = unicodeEscaper2.with(charSequenceTranslatorArray46);
        java.io.Writer writer51 = null;
        // The following exception was thrown during execution in test generation
        try {
            charSequenceTranslator49.translate((java.lang.CharSequence) "j\\u0061v\\u0061\\u002Eio\\u002E\\u0049\\u004F\\u0045x\\u0063eption\\u003A\\u0020j\\u0061v\\u0061\\u002Eio\\u002E\\u0049\\u004F\\u0045x\\u0063eption\\u003A\\u0020j\\u0061v\\u0061\\u002Eio\\u002E\\u0049\\u004F\\u0045x\\u0063eption\\u003A\\u0020", writer51);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Writer must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(unicodeEscaper2);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(unicodeEscaper11);
        org.junit.Assert.assertNotNull(unicodeEscaper13);
        org.junit.Assert.assertNotNull(unicodeEscaper15);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "java\\u002Eio\\u002E\\u0049\\u004F\\u0045xception\\u003A\\u0020java\\u002Eio\\u002E\\u0049\\u004F\\u0045xception" + "'", str17, "java\\u002Eio\\u002E\\u0049\\u004F\\u0045xception\\u003A\\u0020java\\u002Eio\\u002E\\u0049\\u004F\\u0045xception");
        org.junit.Assert.assertNotNull(charSequenceTranslatorArray18);
        org.junit.Assert.assertNotNull(charSequenceTranslator19);
        org.junit.Assert.assertNotNull(unicodeEscaper22);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "0" + "'", str27, "0");
        org.junit.Assert.assertNotNull(unicodeEscaper30);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertNotNull(unicodeEscaper39);
        org.junit.Assert.assertNotNull(unicodeEscaper41);
        org.junit.Assert.assertNotNull(unicodeEscaper43);
        org.junit.Assert.assertEquals("'" + str45 + "' != '" + "java\\u002Eio\\u002E\\u0049\\u004F\\u0045xception\\u003A\\u0020java\\u002Eio\\u002E\\u0049\\u004F\\u0045xception" + "'", str45, "java\\u002Eio\\u002E\\u0049\\u004F\\u0045xception\\u003A\\u0020java\\u002Eio\\u002E\\u0049\\u004F\\u0045xception");
        org.junit.Assert.assertNotNull(charSequenceTranslatorArray46);
        org.junit.Assert.assertNotNull(charSequenceTranslator47);
        org.junit.Assert.assertNotNull(charSequenceTranslator48);
        org.junit.Assert.assertNotNull(charSequenceTranslator49);
    }

    @Test
    public void test00473() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00473");
        java.io.IOException iOException0 = new java.io.IOException();
        java.io.IOException iOException1 = new java.io.IOException();
        iOException0.addSuppressed((java.lang.Throwable) iOException1);
        java.io.IOException iOException3 = new java.io.IOException((java.lang.Throwable) iOException0);
        java.lang.Throwable[] throwableArray4 = iOException3.getSuppressed();
        java.io.IOException iOException7 = new java.io.IOException();
        java.io.IOException iOException8 = new java.io.IOException();
        iOException7.addSuppressed((java.lang.Throwable) iOException8);
        java.io.IOException iOException10 = new java.io.IOException();
        java.io.IOException iOException11 = new java.io.IOException();
        iOException10.addSuppressed((java.lang.Throwable) iOException11);
        java.lang.Throwable[] throwableArray13 = iOException11.getSuppressed();
        java.io.IOException iOException14 = new java.io.IOException((java.lang.Throwable) iOException11);
        java.io.IOException iOException16 = new java.io.IOException("");
        java.io.IOException iOException17 = new java.io.IOException((java.lang.Throwable) iOException16);
        iOException11.addSuppressed((java.lang.Throwable) iOException17);
        iOException8.addSuppressed((java.lang.Throwable) iOException17);
        java.io.IOException iOException20 = new java.io.IOException("java.io.IOException", (java.lang.Throwable) iOException17);
        java.io.IOException iOException21 = new java.io.IOException("64", (java.lang.Throwable) iOException20);
        iOException3.addSuppressed((java.lang.Throwable) iOException20);
        java.lang.String str23 = iOException3.toString();
        org.junit.Assert.assertNotNull(throwableArray4);
        org.junit.Assert.assertNotNull(throwableArray13);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "java.io.IOException: java.io.IOException" + "'", str23, "java.io.IOException: java.io.IOException");
    }

    @Test
    public void test00474() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00474");
        java.io.IOException iOException1 = new java.io.IOException("0");
        java.io.IOException iOException2 = new java.io.IOException();
        java.io.IOException iOException3 = new java.io.IOException();
        iOException2.addSuppressed((java.lang.Throwable) iOException3);
        java.io.IOException iOException5 = new java.io.IOException();
        java.io.IOException iOException6 = new java.io.IOException();
        iOException5.addSuppressed((java.lang.Throwable) iOException6);
        java.lang.Throwable[] throwableArray8 = iOException6.getSuppressed();
        java.io.IOException iOException9 = new java.io.IOException((java.lang.Throwable) iOException6);
        java.io.IOException iOException11 = new java.io.IOException("");
        java.io.IOException iOException12 = new java.io.IOException((java.lang.Throwable) iOException11);
        iOException6.addSuppressed((java.lang.Throwable) iOException12);
        iOException3.addSuppressed((java.lang.Throwable) iOException12);
        iOException1.addSuppressed((java.lang.Throwable) iOException3);
        java.io.IOException iOException16 = new java.io.IOException((java.lang.Throwable) iOException3);
        java.lang.String str17 = iOException3.toString();
        org.junit.Assert.assertNotNull(throwableArray8);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "java.io.IOException" + "'", str17, "java.io.IOException");
    }

    @Test
    public void test00475() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00475");
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper1 = org.apache.commons.lang3.text.translate.UnicodeEscaper.below((int) (byte) 0);
        java.io.Writer writer3 = null;
        boolean boolean4 = unicodeEscaper1.translate((int) ' ', writer3);
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper7 = org.apache.commons.lang3.text.translate.UnicodeEscaper.between((-1), (int) (short) 0);
        java.lang.String str9 = unicodeEscaper7.translate((java.lang.CharSequence) "0");
        org.apache.commons.lang3.text.translate.CharSequenceTranslator[] charSequenceTranslatorArray10 = new org.apache.commons.lang3.text.translate.CharSequenceTranslator[] {};
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator11 = unicodeEscaper7.with(charSequenceTranslatorArray10);
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator12 = unicodeEscaper1.with(charSequenceTranslatorArray10);
        java.io.Writer writer15 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int16 = charSequenceTranslator12.translate((java.lang.CharSequence) "\\u0032\\u0030", (-1), writer15);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: -1");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(unicodeEscaper1);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(unicodeEscaper7);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "0" + "'", str9, "0");
        org.junit.Assert.assertNotNull(charSequenceTranslatorArray10);
        org.junit.Assert.assertNotNull(charSequenceTranslator11);
        org.junit.Assert.assertNotNull(charSequenceTranslator12);
    }

    @Test
    public void test00476() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00476");
        java.io.IOException iOException0 = new java.io.IOException();
        java.io.IOException iOException1 = new java.io.IOException();
        iOException0.addSuppressed((java.lang.Throwable) iOException1);
        java.io.IOException iOException3 = new java.io.IOException();
        java.io.IOException iOException4 = new java.io.IOException();
        iOException3.addSuppressed((java.lang.Throwable) iOException4);
        java.lang.Throwable[] throwableArray6 = iOException4.getSuppressed();
        java.io.IOException iOException7 = new java.io.IOException((java.lang.Throwable) iOException4);
        java.io.IOException iOException9 = new java.io.IOException("");
        java.io.IOException iOException10 = new java.io.IOException((java.lang.Throwable) iOException9);
        iOException4.addSuppressed((java.lang.Throwable) iOException10);
        iOException1.addSuppressed((java.lang.Throwable) iOException10);
        java.lang.Throwable[] throwableArray13 = iOException1.getSuppressed();
        java.lang.Throwable[] throwableArray14 = iOException1.getSuppressed();
        java.lang.Throwable[] throwableArray15 = iOException1.getSuppressed();
        java.io.IOException iOException16 = new java.io.IOException((java.lang.Throwable) iOException1);
        java.io.IOException iOException17 = new java.io.IOException((java.lang.Throwable) iOException16);
        java.lang.String str18 = iOException17.toString();
        org.junit.Assert.assertNotNull(throwableArray6);
        org.junit.Assert.assertNotNull(throwableArray13);
        org.junit.Assert.assertNotNull(throwableArray14);
        org.junit.Assert.assertNotNull(throwableArray15);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "java.io.IOException: java.io.IOException: java.io.IOException" + "'", str18, "java.io.IOException: java.io.IOException: java.io.IOException");
    }

    @Test
    public void test00477() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00477");
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper2 = org.apache.commons.lang3.text.translate.UnicodeEscaper.outsideOf((int) '4', (int) '4');
        java.io.Writer writer4 = null;
        // The following exception was thrown during execution in test generation
        try {
            unicodeEscaper2.translate((java.lang.CharSequence) "61", writer4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Writer must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(unicodeEscaper2);
    }

    @Test
    public void test00478() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00478");
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper2 = org.apache.commons.lang3.text.translate.UnicodeEscaper.outsideOf(10, (int) (short) -1);
        java.io.Writer writer4 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean5 = unicodeEscaper2.translate((int) (byte) 1, writer4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(unicodeEscaper2);
    }

    @Test
    public void test00479() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00479");
        java.io.IOException iOException3 = new java.io.IOException("");
        java.io.IOException iOException4 = new java.io.IOException("A", (java.lang.Throwable) iOException3);
        java.io.IOException iOException5 = new java.io.IOException((java.lang.Throwable) iOException3);
        java.io.IOException iOException6 = new java.io.IOException((java.lang.Throwable) iOException5);
        java.io.IOException iOException9 = new java.io.IOException();
        java.io.IOException iOException10 = new java.io.IOException();
        iOException9.addSuppressed((java.lang.Throwable) iOException10);
        java.io.IOException iOException12 = new java.io.IOException("0", (java.lang.Throwable) iOException9);
        java.io.IOException iOException13 = new java.io.IOException((java.lang.Throwable) iOException12);
        java.io.IOException iOException14 = new java.io.IOException((java.lang.Throwable) iOException13);
        java.io.IOException iOException15 = new java.io.IOException((java.lang.Throwable) iOException14);
        java.io.IOException iOException16 = new java.io.IOException("java.io.IOException: java.io.IOException", (java.lang.Throwable) iOException14);
        iOException5.addSuppressed((java.lang.Throwable) iOException16);
        java.io.IOException iOException18 = new java.io.IOException("j\\u0061v\\u0061\\u002Eio\\u002E\\u0049\\u004F\\u0045x\\u0063eption\\u003A\\u0020", (java.lang.Throwable) iOException5);
        java.lang.Class<?> wildcardClass19 = iOException18.getClass();
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test00480() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00480");
        java.io.IOException iOException1 = new java.io.IOException("");
        java.io.IOException iOException2 = new java.io.IOException((java.lang.Throwable) iOException1);
        java.io.IOException iOException4 = new java.io.IOException("");
        iOException2.addSuppressed((java.lang.Throwable) iOException4);
        java.lang.Throwable[] throwableArray6 = iOException2.getSuppressed();
        java.lang.Class<?> wildcardClass7 = throwableArray6.getClass();
        org.junit.Assert.assertNotNull(throwableArray6);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test00481() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00481");
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper1 = org.apache.commons.lang3.text.translate.UnicodeEscaper.below((int) (byte) 10);
        java.io.Writer writer3 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean4 = unicodeEscaper1.translate((int) (byte) 0, writer3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(unicodeEscaper1);
    }

    @Test
    public void test00482() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00482");
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper2 = org.apache.commons.lang3.text.translate.UnicodeEscaper.between((int) (byte) 100, (int) (short) 10);
        java.io.Writer writer5 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int6 = unicodeEscaper2.translate((java.lang.CharSequence) "java.io.IOException: java\\u002Eio\\u002E\\u0049\\u004F\\u0045xception\\u003A\\u0020java\\u002Eio\\u002E\\u0049\\u004F\\u0045xception", (int) (byte) -1, writer5);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: -1");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(unicodeEscaper2);
    }

    @Test
    public void test00483() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00483");
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper1 = org.apache.commons.lang3.text.translate.UnicodeEscaper.above((int) 'a');
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper3 = org.apache.commons.lang3.text.translate.UnicodeEscaper.below((int) (byte) 0);
        java.io.Writer writer5 = null;
        boolean boolean6 = unicodeEscaper3.translate((int) ' ', writer5);
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper9 = org.apache.commons.lang3.text.translate.UnicodeEscaper.between((-1), (int) (short) 0);
        java.lang.String str11 = unicodeEscaper9.translate((java.lang.CharSequence) "0");
        org.apache.commons.lang3.text.translate.CharSequenceTranslator[] charSequenceTranslatorArray12 = new org.apache.commons.lang3.text.translate.CharSequenceTranslator[] {};
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator13 = unicodeEscaper9.with(charSequenceTranslatorArray12);
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator14 = unicodeEscaper3.with(charSequenceTranslatorArray12);
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator15 = unicodeEscaper1.with(charSequenceTranslatorArray12);
        java.lang.Class<?> wildcardClass16 = charSequenceTranslatorArray12.getClass();
        org.junit.Assert.assertNotNull(unicodeEscaper1);
        org.junit.Assert.assertNotNull(unicodeEscaper3);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(unicodeEscaper9);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "0" + "'", str11, "0");
        org.junit.Assert.assertNotNull(charSequenceTranslatorArray12);
        org.junit.Assert.assertNotNull(charSequenceTranslator13);
        org.junit.Assert.assertNotNull(charSequenceTranslator14);
        org.junit.Assert.assertNotNull(charSequenceTranslator15);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test00484() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00484");
        java.lang.Throwable throwable2 = null;
        java.io.IOException iOException3 = new java.io.IOException("java.io.IOException: \\u0068\\u0069\\u0021", throwable2);
        java.io.IOException iOException6 = new java.io.IOException("");
        java.io.IOException iOException7 = new java.io.IOException((java.lang.Throwable) iOException6);
        java.io.IOException iOException9 = new java.io.IOException("");
        iOException7.addSuppressed((java.lang.Throwable) iOException9);
        java.io.IOException iOException11 = new java.io.IOException("java.io.IOException", (java.lang.Throwable) iOException9);
        iOException3.addSuppressed((java.lang.Throwable) iOException9);
        java.io.IOException iOException13 = new java.io.IOException((java.lang.Throwable) iOException9);
        java.io.IOException iOException14 = new java.io.IOException("\\u005C\\u0075\\u0030\\u0030\\u0035\\u0043\\u005C\\u0075\\u0030\\u0030\\u0037\\u0035\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0033\\u005C\\u0075\\u0030\\u0030\\u0033\\u0036\\u005C\\u0075\\u0030\\u0030\\u0035\\u0043\\u005C\\u0075\\u0030\\u0030\\u0037\\u0035\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0033\\u005C\\u0075\\u0030\\u0030\\u0033\\u0034", (java.lang.Throwable) iOException9);
        java.lang.Class<?> wildcardClass15 = iOException14.getClass();
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test00485() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00485");
        java.io.IOException iOException2 = new java.io.IOException("");
        java.io.IOException iOException3 = new java.io.IOException("A", (java.lang.Throwable) iOException2);
        java.lang.Throwable[] throwableArray4 = iOException2.getSuppressed();
        java.io.IOException iOException5 = new java.io.IOException((java.lang.Throwable) iOException2);
        java.io.IOException iOException7 = new java.io.IOException();
        java.io.IOException iOException8 = new java.io.IOException();
        iOException7.addSuppressed((java.lang.Throwable) iOException8);
        java.io.IOException iOException10 = new java.io.IOException();
        java.io.IOException iOException11 = new java.io.IOException();
        iOException10.addSuppressed((java.lang.Throwable) iOException11);
        java.lang.Throwable[] throwableArray13 = iOException11.getSuppressed();
        java.io.IOException iOException14 = new java.io.IOException((java.lang.Throwable) iOException11);
        java.io.IOException iOException16 = new java.io.IOException("");
        java.io.IOException iOException17 = new java.io.IOException((java.lang.Throwable) iOException16);
        iOException11.addSuppressed((java.lang.Throwable) iOException17);
        iOException8.addSuppressed((java.lang.Throwable) iOException17);
        java.io.IOException iOException20 = new java.io.IOException("java.io.IOException", (java.lang.Throwable) iOException17);
        java.io.IOException iOException23 = new java.io.IOException("");
        java.io.IOException iOException24 = new java.io.IOException((java.lang.Throwable) iOException23);
        java.io.IOException iOException26 = new java.io.IOException("");
        iOException24.addSuppressed((java.lang.Throwable) iOException26);
        java.io.IOException iOException28 = new java.io.IOException("java.io.IOException: 0", (java.lang.Throwable) iOException26);
        iOException17.addSuppressed((java.lang.Throwable) iOException26);
        iOException2.addSuppressed((java.lang.Throwable) iOException17);
        java.lang.String str31 = iOException2.toString();
        org.junit.Assert.assertNotNull(throwableArray4);
        org.junit.Assert.assertNotNull(throwableArray13);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "java.io.IOException: " + "'", str31, "java.io.IOException: ");
    }

    @Test
    public void test00486() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00486");
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper1 = org.apache.commons.lang3.text.translate.UnicodeEscaper.below((int) (byte) 0);
        java.io.Writer writer3 = null;
        boolean boolean4 = unicodeEscaper1.translate((int) ' ', writer3);
        java.io.Writer writer6 = null;
        boolean boolean7 = unicodeEscaper1.translate((int) (byte) 0, writer6);
        java.io.Writer writer10 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int11 = unicodeEscaper1.translate((java.lang.CharSequence) "java.io.IOException: 64", (int) 'a', writer10);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 97");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(unicodeEscaper1);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test00487() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00487");
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper2 = org.apache.commons.lang3.text.translate.UnicodeEscaper.outsideOf((int) (byte) 0, (int) (byte) 0);
        java.io.Writer writer5 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int6 = unicodeEscaper2.translate((java.lang.CharSequence) "hi!", (int) (short) -1, writer5);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: -1");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(unicodeEscaper2);
    }

    @Test
    public void test00488() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00488");
        java.io.IOException iOException0 = new java.io.IOException();
        java.io.IOException iOException1 = new java.io.IOException();
        iOException0.addSuppressed((java.lang.Throwable) iOException1);
        java.io.IOException iOException3 = new java.io.IOException((java.lang.Throwable) iOException0);
        java.io.IOException iOException4 = new java.io.IOException((java.lang.Throwable) iOException3);
        java.lang.String str5 = iOException3.toString();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "java.io.IOException: java.io.IOException" + "'", str5, "java.io.IOException: java.io.IOException");
    }

    @Test
    public void test00489() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00489");
        java.io.IOException iOException1 = new java.io.IOException();
        java.io.IOException iOException2 = new java.io.IOException();
        iOException1.addSuppressed((java.lang.Throwable) iOException2);
        java.io.IOException iOException4 = new java.io.IOException("0", (java.lang.Throwable) iOException1);
        java.io.IOException iOException5 = new java.io.IOException((java.lang.Throwable) iOException4);
        java.io.IOException iOException6 = new java.io.IOException((java.lang.Throwable) iOException5);
        java.io.IOException iOException8 = new java.io.IOException();
        java.io.IOException iOException9 = new java.io.IOException();
        iOException8.addSuppressed((java.lang.Throwable) iOException9);
        java.lang.Throwable[] throwableArray11 = iOException9.getSuppressed();
        java.lang.Throwable[] throwableArray12 = iOException9.getSuppressed();
        java.io.IOException iOException13 = new java.io.IOException("java.io.IOException", (java.lang.Throwable) iOException9);
        java.io.IOException iOException14 = new java.io.IOException();
        java.io.IOException iOException15 = new java.io.IOException();
        iOException14.addSuppressed((java.lang.Throwable) iOException15);
        java.io.IOException iOException17 = new java.io.IOException((java.lang.Throwable) iOException14);
        java.lang.Throwable[] throwableArray18 = iOException17.getSuppressed();
        iOException13.addSuppressed((java.lang.Throwable) iOException17);
        iOException5.addSuppressed((java.lang.Throwable) iOException17);
        java.lang.Throwable[] throwableArray21 = iOException17.getSuppressed();
        java.lang.String str22 = iOException17.toString();
        org.junit.Assert.assertNotNull(throwableArray11);
        org.junit.Assert.assertNotNull(throwableArray12);
        org.junit.Assert.assertNotNull(throwableArray18);
        org.junit.Assert.assertNotNull(throwableArray21);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "java.io.IOException: java.io.IOException" + "'", str22, "java.io.IOException: java.io.IOException");
    }

    @Test
    public void test00490() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00490");
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper2 = org.apache.commons.lang3.text.translate.UnicodeEscaper.outsideOf((int) 'a', 0);
        java.io.Writer writer4 = null;
        // The following exception was thrown during execution in test generation
        try {
            unicodeEscaper2.translate((java.lang.CharSequence) "java.io.IOException", writer4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Writer must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(unicodeEscaper2);
    }

    @Test
    public void test00491() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00491");
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper1 = org.apache.commons.lang3.text.translate.UnicodeEscaper.below((int) (byte) 0);
        java.io.Writer writer3 = null;
        boolean boolean4 = unicodeEscaper1.translate((int) ' ', writer3);
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper7 = org.apache.commons.lang3.text.translate.UnicodeEscaper.between((-1), (int) (short) 0);
        java.lang.String str9 = unicodeEscaper7.translate((java.lang.CharSequence) "0");
        org.apache.commons.lang3.text.translate.CharSequenceTranslator[] charSequenceTranslatorArray10 = new org.apache.commons.lang3.text.translate.CharSequenceTranslator[] {};
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator11 = unicodeEscaper7.with(charSequenceTranslatorArray10);
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator12 = unicodeEscaper1.with(charSequenceTranslatorArray10);
        java.io.Writer writer14 = null;
        boolean boolean15 = unicodeEscaper1.translate((int) (byte) 1, writer14);
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper18 = org.apache.commons.lang3.text.translate.UnicodeEscaper.outsideOf((int) '#', 100);
        java.lang.String str20 = unicodeEscaper18.translate((java.lang.CharSequence) "java.io.IOException: java.io.IOException");
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper23 = org.apache.commons.lang3.text.translate.UnicodeEscaper.between((int) '4', (int) (short) 1);
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper26 = org.apache.commons.lang3.text.translate.UnicodeEscaper.between((-1), (int) (byte) -1);
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper29 = org.apache.commons.lang3.text.translate.UnicodeEscaper.outsideOf((int) '4', (int) (short) 0);
        org.apache.commons.lang3.text.translate.CharSequenceTranslator[] charSequenceTranslatorArray30 = new org.apache.commons.lang3.text.translate.CharSequenceTranslator[] { unicodeEscaper29 };
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator31 = unicodeEscaper26.with(charSequenceTranslatorArray30);
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator32 = unicodeEscaper23.with(charSequenceTranslatorArray30);
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator33 = unicodeEscaper18.with(charSequenceTranslatorArray30);
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator34 = unicodeEscaper1.with(charSequenceTranslatorArray30);
        java.lang.CharSequence charSequence35 = null;
        java.io.Writer writer36 = null;
        // The following exception was thrown during execution in test generation
        try {
            unicodeEscaper1.translate(charSequence35, writer36);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Writer must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(unicodeEscaper1);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(unicodeEscaper7);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "0" + "'", str9, "0");
        org.junit.Assert.assertNotNull(charSequenceTranslatorArray10);
        org.junit.Assert.assertNotNull(charSequenceTranslator11);
        org.junit.Assert.assertNotNull(charSequenceTranslator12);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(unicodeEscaper18);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "\\u006Aa\\u0076a.\\u0069\\u006F.IOE\\u0078c\\u0065\\u0070\\u0074\\u0069\\u006F\\u006E:\\u0020\\u006Aa\\u0076a.\\u0069\\u006F.IOE\\u0078c\\u0065\\u0070\\u0074\\u0069\\u006F\\u006E" + "'", str20, "\\u006Aa\\u0076a.\\u0069\\u006F.IOE\\u0078c\\u0065\\u0070\\u0074\\u0069\\u006F\\u006E:\\u0020\\u006Aa\\u0076a.\\u0069\\u006F.IOE\\u0078c\\u0065\\u0070\\u0074\\u0069\\u006F\\u006E");
        org.junit.Assert.assertNotNull(unicodeEscaper23);
        org.junit.Assert.assertNotNull(unicodeEscaper26);
        org.junit.Assert.assertNotNull(unicodeEscaper29);
        org.junit.Assert.assertNotNull(charSequenceTranslatorArray30);
        org.junit.Assert.assertNotNull(charSequenceTranslator31);
        org.junit.Assert.assertNotNull(charSequenceTranslator32);
        org.junit.Assert.assertNotNull(charSequenceTranslator33);
        org.junit.Assert.assertNotNull(charSequenceTranslator34);
    }

    @Test
    public void test00492() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00492");
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper2 = org.apache.commons.lang3.text.translate.UnicodeEscaper.between((int) (byte) -1, (int) (short) 0);
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper5 = org.apache.commons.lang3.text.translate.UnicodeEscaper.between((int) (byte) 1, (int) '#');
        java.io.Writer writer7 = null;
        boolean boolean8 = unicodeEscaper5.translate((int) '4', writer7);
        java.io.Writer writer10 = null;
        boolean boolean11 = unicodeEscaper5.translate((int) (byte) -1, writer10);
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper14 = org.apache.commons.lang3.text.translate.UnicodeEscaper.between((int) (byte) 1, (int) '#');
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper16 = org.apache.commons.lang3.text.translate.UnicodeEscaper.below(100);
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper18 = org.apache.commons.lang3.text.translate.UnicodeEscaper.below((int) 'a');
        java.lang.String str20 = unicodeEscaper18.translate((java.lang.CharSequence) "java.io.IOException: java.io.IOException");
        org.apache.commons.lang3.text.translate.CharSequenceTranslator[] charSequenceTranslatorArray21 = new org.apache.commons.lang3.text.translate.CharSequenceTranslator[] { unicodeEscaper14, unicodeEscaper16, unicodeEscaper18 };
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator22 = unicodeEscaper5.with(charSequenceTranslatorArray21);
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator23 = unicodeEscaper2.with(charSequenceTranslatorArray21);
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper26 = org.apache.commons.lang3.text.translate.UnicodeEscaper.outsideOf(0, (int) 'a');
        java.io.Writer writer28 = null;
        boolean boolean29 = unicodeEscaper26.translate((int) (short) 10, writer28);
        java.lang.String str31 = unicodeEscaper26.translate((java.lang.CharSequence) "0");
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper34 = org.apache.commons.lang3.text.translate.UnicodeEscaper.between((int) (byte) 1, (int) '#');
        java.io.Writer writer36 = null;
        boolean boolean37 = unicodeEscaper34.translate((int) '4', writer36);
        java.io.Writer writer39 = null;
        boolean boolean40 = unicodeEscaper34.translate((int) (byte) -1, writer39);
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper43 = org.apache.commons.lang3.text.translate.UnicodeEscaper.between((int) (byte) 1, (int) '#');
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper45 = org.apache.commons.lang3.text.translate.UnicodeEscaper.below(100);
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper47 = org.apache.commons.lang3.text.translate.UnicodeEscaper.below((int) 'a');
        java.lang.String str49 = unicodeEscaper47.translate((java.lang.CharSequence) "java.io.IOException: java.io.IOException");
        org.apache.commons.lang3.text.translate.CharSequenceTranslator[] charSequenceTranslatorArray50 = new org.apache.commons.lang3.text.translate.CharSequenceTranslator[] { unicodeEscaper43, unicodeEscaper45, unicodeEscaper47 };
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator51 = unicodeEscaper34.with(charSequenceTranslatorArray50);
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator52 = unicodeEscaper26.with(charSequenceTranslatorArray50);
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper55 = org.apache.commons.lang3.text.translate.UnicodeEscaper.between((int) (byte) 1, (int) '#');
        java.lang.String str57 = unicodeEscaper55.translate((java.lang.CharSequence) "\\u006A\\u0061\\u0076\\u0061\\u005C\\u0075\\u0030\\u0030\\u0032\\u0045\\u0069\\u006F\\u005C\\u0075\\u0030\\u0030\\u0032\\u0045\\u005C\\u0075\\u0030\\u0030\\u0034\\u0039\\u005C\\u0075\\u0030\\u0030\\u0034\\u0046\\u005C\\u0075\\u0030\\u0030\\u0034\\u0035\\u0078\\u0063\\u0065\\u0070\\u0074\\u0069\\u006F\\u006E\\u005C\\u0075\\u0030\\u0030\\u0033\\u0041\\u005C\\u0075\\u0030\\u0030\\u0032\\u0030\\u006A\\u0061\\u0076\\u0061\\u005C\\u0075\\u0030\\u0030\\u0032\\u0045\\u0069\\u006F\\u005C\\u0075\\u0030\\u0030\\u0032\\u0045\\u005C\\u0075\\u0030\\u0030\\u0034\\u0039\\u005C\\u0075\\u0030\\u0030\\u0034\\u0046\\u005C\\u0075\\u0030\\u0030\\u0034\\u0035\\u0078\\u0063\\u0065\\u0070\\u0074\\u0069\\u006F\\u006E");
        org.apache.commons.lang3.text.translate.CharSequenceTranslator[] charSequenceTranslatorArray58 = new org.apache.commons.lang3.text.translate.CharSequenceTranslator[] { unicodeEscaper55 };
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator59 = unicodeEscaper26.with(charSequenceTranslatorArray58);
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator60 = charSequenceTranslator23.with(charSequenceTranslatorArray58);
        java.lang.String str62 = charSequenceTranslator23.translate((java.lang.CharSequence) "\\u0033\\u0034");
        java.io.Writer writer65 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int66 = charSequenceTranslator23.translate((java.lang.CharSequence) "61", (int) '4', writer65);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 52");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(unicodeEscaper2);
        org.junit.Assert.assertNotNull(unicodeEscaper5);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(unicodeEscaper14);
        org.junit.Assert.assertNotNull(unicodeEscaper16);
        org.junit.Assert.assertNotNull(unicodeEscaper18);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "java\\u002Eio\\u002E\\u0049\\u004F\\u0045xception\\u003A\\u0020java\\u002Eio\\u002E\\u0049\\u004F\\u0045xception" + "'", str20, "java\\u002Eio\\u002E\\u0049\\u004F\\u0045xception\\u003A\\u0020java\\u002Eio\\u002E\\u0049\\u004F\\u0045xception");
        org.junit.Assert.assertNotNull(charSequenceTranslatorArray21);
        org.junit.Assert.assertNotNull(charSequenceTranslator22);
        org.junit.Assert.assertNotNull(charSequenceTranslator23);
        org.junit.Assert.assertNotNull(unicodeEscaper26);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "0" + "'", str31, "0");
        org.junit.Assert.assertNotNull(unicodeEscaper34);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertNotNull(unicodeEscaper43);
        org.junit.Assert.assertNotNull(unicodeEscaper45);
        org.junit.Assert.assertNotNull(unicodeEscaper47);
        org.junit.Assert.assertEquals("'" + str49 + "' != '" + "java\\u002Eio\\u002E\\u0049\\u004F\\u0045xception\\u003A\\u0020java\\u002Eio\\u002E\\u0049\\u004F\\u0045xception" + "'", str49, "java\\u002Eio\\u002E\\u0049\\u004F\\u0045xception\\u003A\\u0020java\\u002Eio\\u002E\\u0049\\u004F\\u0045xception");
        org.junit.Assert.assertNotNull(charSequenceTranslatorArray50);
        org.junit.Assert.assertNotNull(charSequenceTranslator51);
        org.junit.Assert.assertNotNull(charSequenceTranslator52);
        org.junit.Assert.assertNotNull(unicodeEscaper55);
        org.junit.Assert.assertEquals("'" + str57 + "' != '" + "\\u006A\\u0061\\u0076\\u0061\\u005C\\u0075\\u0030\\u0030\\u0032\\u0045\\u0069\\u006F\\u005C\\u0075\\u0030\\u0030\\u0032\\u0045\\u005C\\u0075\\u0030\\u0030\\u0034\\u0039\\u005C\\u0075\\u0030\\u0030\\u0034\\u0046\\u005C\\u0075\\u0030\\u0030\\u0034\\u0035\\u0078\\u0063\\u0065\\u0070\\u0074\\u0069\\u006F\\u006E\\u005C\\u0075\\u0030\\u0030\\u0033\\u0041\\u005C\\u0075\\u0030\\u0030\\u0032\\u0030\\u006A\\u0061\\u0076\\u0061\\u005C\\u0075\\u0030\\u0030\\u0032\\u0045\\u0069\\u006F\\u005C\\u0075\\u0030\\u0030\\u0032\\u0045\\u005C\\u0075\\u0030\\u0030\\u0034\\u0039\\u005C\\u0075\\u0030\\u0030\\u0034\\u0046\\u005C\\u0075\\u0030\\u0030\\u0034\\u0035\\u0078\\u0063\\u0065\\u0070\\u0074\\u0069\\u006F\\u006E" + "'", str57, "\\u006A\\u0061\\u0076\\u0061\\u005C\\u0075\\u0030\\u0030\\u0032\\u0045\\u0069\\u006F\\u005C\\u0075\\u0030\\u0030\\u0032\\u0045\\u005C\\u0075\\u0030\\u0030\\u0034\\u0039\\u005C\\u0075\\u0030\\u0030\\u0034\\u0046\\u005C\\u0075\\u0030\\u0030\\u0034\\u0035\\u0078\\u0063\\u0065\\u0070\\u0074\\u0069\\u006F\\u006E\\u005C\\u0075\\u0030\\u0030\\u0033\\u0041\\u005C\\u0075\\u0030\\u0030\\u0032\\u0030\\u006A\\u0061\\u0076\\u0061\\u005C\\u0075\\u0030\\u0030\\u0032\\u0045\\u0069\\u006F\\u005C\\u0075\\u0030\\u0030\\u0032\\u0045\\u005C\\u0075\\u0030\\u0030\\u0034\\u0039\\u005C\\u0075\\u0030\\u0030\\u0034\\u0046\\u005C\\u0075\\u0030\\u0030\\u0034\\u0035\\u0078\\u0063\\u0065\\u0070\\u0074\\u0069\\u006F\\u006E");
        org.junit.Assert.assertNotNull(charSequenceTranslatorArray58);
        org.junit.Assert.assertNotNull(charSequenceTranslator59);
        org.junit.Assert.assertNotNull(charSequenceTranslator60);
        org.junit.Assert.assertEquals("'" + str62 + "' != '" + "\\u005Cu\\u0030\\u0030\\u0033\\u0033\\u005Cu\\u0030\\u0030\\u0033\\u0034" + "'", str62, "\\u005Cu\\u0030\\u0030\\u0033\\u0033\\u005Cu\\u0030\\u0030\\u0033\\u0034");
    }

    @Test
    public void test00493() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00493");
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper2 = org.apache.commons.lang3.text.translate.UnicodeEscaper.between(1, (int) (short) 0);
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper5 = org.apache.commons.lang3.text.translate.UnicodeEscaper.between((-1), (int) (short) 0);
        java.lang.String str7 = unicodeEscaper5.translate((java.lang.CharSequence) "0");
        org.apache.commons.lang3.text.translate.CharSequenceTranslator[] charSequenceTranslatorArray8 = new org.apache.commons.lang3.text.translate.CharSequenceTranslator[] {};
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator9 = unicodeEscaper5.with(charSequenceTranslatorArray8);
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator10 = unicodeEscaper2.with(charSequenceTranslatorArray8);
        java.io.Writer writer12 = null;
        // The following exception was thrown during execution in test generation
        try {
            unicodeEscaper2.translate((java.lang.CharSequence) "\\u005Cu\\u0030\\u0030\\u0033\\u0033\\u005Cu\\u0030\\u0030\\u0033\\u0034", writer12);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Writer must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(unicodeEscaper2);
        org.junit.Assert.assertNotNull(unicodeEscaper5);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "0" + "'", str7, "0");
        org.junit.Assert.assertNotNull(charSequenceTranslatorArray8);
        org.junit.Assert.assertNotNull(charSequenceTranslator9);
        org.junit.Assert.assertNotNull(charSequenceTranslator10);
    }

    @Test
    public void test00494() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00494");
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper1 = org.apache.commons.lang3.text.translate.UnicodeEscaper.below((int) (short) 0);
        java.lang.String str3 = unicodeEscaper1.translate((java.lang.CharSequence) "\\u006Aa\\u0076a.\\u0069\\u006F.IOE\\u0078c\\u0065\\u0070\\u0074\\u0069\\u006F\\u006E: \\u006Aa\\u0076a.\\u0069\\u006F.IOE\\u0078c\\u0065\\u0070\\u0074\\u0069\\u006F\\u006E");
        java.io.Writer writer5 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean6 = unicodeEscaper1.translate((int) (short) -1, writer5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(unicodeEscaper1);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\\u006Aa\\u0076a.\\u0069\\u006F.IOE\\u0078c\\u0065\\u0070\\u0074\\u0069\\u006F\\u006E: \\u006Aa\\u0076a.\\u0069\\u006F.IOE\\u0078c\\u0065\\u0070\\u0074\\u0069\\u006F\\u006E" + "'", str3, "\\u006Aa\\u0076a.\\u0069\\u006F.IOE\\u0078c\\u0065\\u0070\\u0074\\u0069\\u006F\\u006E: \\u006Aa\\u0076a.\\u0069\\u006F.IOE\\u0078c\\u0065\\u0070\\u0074\\u0069\\u006F\\u006E");
    }

    @Test
    public void test00495() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00495");
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper2 = org.apache.commons.lang3.text.translate.UnicodeEscaper.outsideOf((int) ' ', (int) (short) 0);
        java.io.Writer writer4 = null;
        // The following exception was thrown during execution in test generation
        try {
            unicodeEscaper2.translate((java.lang.CharSequence) "j\\u0061v\\u0061\\u002Eio\\u002E\\u0049\\u004F\\u0045x\\u0063eption\\u003A\\u0020j\\u0061v\\u0061\\u002Eio\\u002E\\u0049\\u004F\\u0045x\\u0063eption\\u003A\\u0020j\\u0061v\\u0061\\u002Eio\\u002E\\u0049\\u004F\\u0045x\\u0063eption\\u003A\\u0020", writer4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Writer must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(unicodeEscaper2);
    }

    @Test
    public void test00496() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00496");
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper2 = org.apache.commons.lang3.text.translate.UnicodeEscaper.outsideOf((int) (short) 100, (int) (short) 1);
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper5 = org.apache.commons.lang3.text.translate.UnicodeEscaper.outsideOf((int) '#', 100);
        java.lang.String str7 = unicodeEscaper5.translate((java.lang.CharSequence) "java.io.IOException: java.io.IOException");
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper10 = org.apache.commons.lang3.text.translate.UnicodeEscaper.between((int) '4', (int) (short) 1);
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper13 = org.apache.commons.lang3.text.translate.UnicodeEscaper.between((-1), (int) (byte) -1);
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper16 = org.apache.commons.lang3.text.translate.UnicodeEscaper.outsideOf((int) '4', (int) (short) 0);
        org.apache.commons.lang3.text.translate.CharSequenceTranslator[] charSequenceTranslatorArray17 = new org.apache.commons.lang3.text.translate.CharSequenceTranslator[] { unicodeEscaper16 };
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator18 = unicodeEscaper13.with(charSequenceTranslatorArray17);
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator19 = unicodeEscaper10.with(charSequenceTranslatorArray17);
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator20 = unicodeEscaper5.with(charSequenceTranslatorArray17);
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator21 = unicodeEscaper2.with(charSequenceTranslatorArray17);
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper24 = org.apache.commons.lang3.text.translate.UnicodeEscaper.between(0, (int) (byte) 100);
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper27 = org.apache.commons.lang3.text.translate.UnicodeEscaper.outsideOf(10, 10);
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper30 = org.apache.commons.lang3.text.translate.UnicodeEscaper.outsideOf((int) (short) -1, (int) (byte) -1);
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper32 = org.apache.commons.lang3.text.translate.UnicodeEscaper.above((int) 'a');
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper34 = org.apache.commons.lang3.text.translate.UnicodeEscaper.below((int) (byte) 0);
        java.io.Writer writer36 = null;
        boolean boolean37 = unicodeEscaper34.translate((int) ' ', writer36);
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper40 = org.apache.commons.lang3.text.translate.UnicodeEscaper.between((-1), (int) (short) 0);
        java.lang.String str42 = unicodeEscaper40.translate((java.lang.CharSequence) "0");
        org.apache.commons.lang3.text.translate.CharSequenceTranslator[] charSequenceTranslatorArray43 = new org.apache.commons.lang3.text.translate.CharSequenceTranslator[] {};
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator44 = unicodeEscaper40.with(charSequenceTranslatorArray43);
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator45 = unicodeEscaper34.with(charSequenceTranslatorArray43);
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator46 = unicodeEscaper32.with(charSequenceTranslatorArray43);
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper49 = org.apache.commons.lang3.text.translate.UnicodeEscaper.between((int) (byte) 1, (int) '#');
        java.io.Writer writer51 = null;
        boolean boolean52 = unicodeEscaper49.translate((int) '4', writer51);
        java.io.Writer writer54 = null;
        boolean boolean55 = unicodeEscaper49.translate((int) (byte) -1, writer54);
        java.io.Writer writer57 = null;
        boolean boolean58 = unicodeEscaper49.translate((int) (byte) -1, writer57);
        org.apache.commons.lang3.text.translate.CharSequenceTranslator[] charSequenceTranslatorArray59 = new org.apache.commons.lang3.text.translate.CharSequenceTranslator[] {};
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator60 = unicodeEscaper49.with(charSequenceTranslatorArray59);
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator61 = charSequenceTranslator46.with(charSequenceTranslatorArray59);
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator62 = unicodeEscaper30.with(charSequenceTranslatorArray59);
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator63 = unicodeEscaper27.with(charSequenceTranslatorArray59);
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator64 = unicodeEscaper24.with(charSequenceTranslatorArray59);
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator65 = unicodeEscaper2.with(charSequenceTranslatorArray59);
        java.io.Writer writer68 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int69 = unicodeEscaper2.translate((java.lang.CharSequence) "\\u005C\\u0075\\u0030\\u0030\\u0033\\u0032\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030", (int) (byte) 1, writer68);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(unicodeEscaper2);
        org.junit.Assert.assertNotNull(unicodeEscaper5);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\\u006Aa\\u0076a.\\u0069\\u006F.IOE\\u0078c\\u0065\\u0070\\u0074\\u0069\\u006F\\u006E:\\u0020\\u006Aa\\u0076a.\\u0069\\u006F.IOE\\u0078c\\u0065\\u0070\\u0074\\u0069\\u006F\\u006E" + "'", str7, "\\u006Aa\\u0076a.\\u0069\\u006F.IOE\\u0078c\\u0065\\u0070\\u0074\\u0069\\u006F\\u006E:\\u0020\\u006Aa\\u0076a.\\u0069\\u006F.IOE\\u0078c\\u0065\\u0070\\u0074\\u0069\\u006F\\u006E");
        org.junit.Assert.assertNotNull(unicodeEscaper10);
        org.junit.Assert.assertNotNull(unicodeEscaper13);
        org.junit.Assert.assertNotNull(unicodeEscaper16);
        org.junit.Assert.assertNotNull(charSequenceTranslatorArray17);
        org.junit.Assert.assertNotNull(charSequenceTranslator18);
        org.junit.Assert.assertNotNull(charSequenceTranslator19);
        org.junit.Assert.assertNotNull(charSequenceTranslator20);
        org.junit.Assert.assertNotNull(charSequenceTranslator21);
        org.junit.Assert.assertNotNull(unicodeEscaper24);
        org.junit.Assert.assertNotNull(unicodeEscaper27);
        org.junit.Assert.assertNotNull(unicodeEscaper30);
        org.junit.Assert.assertNotNull(unicodeEscaper32);
        org.junit.Assert.assertNotNull(unicodeEscaper34);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertNotNull(unicodeEscaper40);
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "0" + "'", str42, "0");
        org.junit.Assert.assertNotNull(charSequenceTranslatorArray43);
        org.junit.Assert.assertNotNull(charSequenceTranslator44);
        org.junit.Assert.assertNotNull(charSequenceTranslator45);
        org.junit.Assert.assertNotNull(charSequenceTranslator46);
        org.junit.Assert.assertNotNull(unicodeEscaper49);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + false + "'", boolean58 == false);
        org.junit.Assert.assertNotNull(charSequenceTranslatorArray59);
        org.junit.Assert.assertNotNull(charSequenceTranslator60);
        org.junit.Assert.assertNotNull(charSequenceTranslator61);
        org.junit.Assert.assertNotNull(charSequenceTranslator62);
        org.junit.Assert.assertNotNull(charSequenceTranslator63);
        org.junit.Assert.assertNotNull(charSequenceTranslator64);
        org.junit.Assert.assertNotNull(charSequenceTranslator65);
    }

    @Test
    public void test00497() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00497");
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper2 = org.apache.commons.lang3.text.translate.UnicodeEscaper.outsideOf((int) '#', 100);
        java.io.Writer writer4 = null;
        // The following exception was thrown during execution in test generation
        try {
            unicodeEscaper2.translate((java.lang.CharSequence) "\\u006A\\u0061\\u0076\\u0061\\u002E\\u0069\\u006F\\u002E\\u0049\\u004F\\u0045\\u0078\\u0063\\u0065\\u0070\\u0074\\u0069\\u006F\\u006E", writer4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Writer must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(unicodeEscaper2);
    }

    @Test
    public void test00498() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00498");
        java.io.IOException iOException0 = new java.io.IOException();
        java.io.IOException iOException1 = new java.io.IOException();
        iOException0.addSuppressed((java.lang.Throwable) iOException1);
        java.io.IOException iOException3 = new java.io.IOException((java.lang.Throwable) iOException0);
        java.lang.Throwable[] throwableArray4 = iOException3.getSuppressed();
        java.io.IOException iOException7 = new java.io.IOException();
        java.io.IOException iOException8 = new java.io.IOException();
        iOException7.addSuppressed((java.lang.Throwable) iOException8);
        java.io.IOException iOException10 = new java.io.IOException();
        java.io.IOException iOException11 = new java.io.IOException();
        iOException10.addSuppressed((java.lang.Throwable) iOException11);
        java.lang.Throwable[] throwableArray13 = iOException11.getSuppressed();
        java.io.IOException iOException14 = new java.io.IOException((java.lang.Throwable) iOException11);
        java.io.IOException iOException16 = new java.io.IOException("");
        java.io.IOException iOException17 = new java.io.IOException((java.lang.Throwable) iOException16);
        iOException11.addSuppressed((java.lang.Throwable) iOException17);
        iOException8.addSuppressed((java.lang.Throwable) iOException17);
        java.io.IOException iOException20 = new java.io.IOException("java.io.IOException", (java.lang.Throwable) iOException17);
        java.io.IOException iOException21 = new java.io.IOException("64", (java.lang.Throwable) iOException20);
        iOException3.addSuppressed((java.lang.Throwable) iOException20);
        java.io.IOException iOException24 = new java.io.IOException();
        java.io.IOException iOException25 = new java.io.IOException();
        iOException24.addSuppressed((java.lang.Throwable) iOException25);
        java.lang.Throwable[] throwableArray27 = iOException25.getSuppressed();
        java.lang.Throwable[] throwableArray28 = iOException25.getSuppressed();
        java.io.IOException iOException29 = new java.io.IOException("java.io.IOException", (java.lang.Throwable) iOException25);
        java.io.IOException iOException30 = new java.io.IOException();
        java.io.IOException iOException31 = new java.io.IOException();
        iOException30.addSuppressed((java.lang.Throwable) iOException31);
        java.io.IOException iOException33 = new java.io.IOException((java.lang.Throwable) iOException30);
        java.lang.Throwable[] throwableArray34 = iOException33.getSuppressed();
        iOException29.addSuppressed((java.lang.Throwable) iOException33);
        java.io.IOException iOException37 = new java.io.IOException();
        java.io.IOException iOException38 = new java.io.IOException();
        iOException37.addSuppressed((java.lang.Throwable) iOException38);
        java.io.IOException iOException40 = new java.io.IOException();
        java.io.IOException iOException41 = new java.io.IOException();
        iOException40.addSuppressed((java.lang.Throwable) iOException41);
        java.lang.Throwable[] throwableArray43 = iOException41.getSuppressed();
        java.io.IOException iOException44 = new java.io.IOException((java.lang.Throwable) iOException41);
        java.io.IOException iOException46 = new java.io.IOException("");
        java.io.IOException iOException47 = new java.io.IOException((java.lang.Throwable) iOException46);
        iOException41.addSuppressed((java.lang.Throwable) iOException47);
        iOException38.addSuppressed((java.lang.Throwable) iOException47);
        java.io.IOException iOException50 = new java.io.IOException("java.io.IOException", (java.lang.Throwable) iOException47);
        iOException33.addSuppressed((java.lang.Throwable) iOException50);
        java.io.IOException iOException53 = new java.io.IOException("");
        java.io.IOException iOException54 = new java.io.IOException((java.lang.Throwable) iOException53);
        java.io.IOException iOException56 = new java.io.IOException("");
        iOException54.addSuppressed((java.lang.Throwable) iOException56);
        java.io.IOException iOException59 = new java.io.IOException("");
        java.io.IOException iOException60 = new java.io.IOException((java.lang.Throwable) iOException59);
        java.io.IOException iOException62 = new java.io.IOException("");
        iOException60.addSuppressed((java.lang.Throwable) iOException62);
        iOException54.addSuppressed((java.lang.Throwable) iOException60);
        iOException33.addSuppressed((java.lang.Throwable) iOException60);
        java.io.IOException iOException66 = new java.io.IOException((java.lang.Throwable) iOException60);
        iOException20.addSuppressed((java.lang.Throwable) iOException60);
        java.lang.Class<?> wildcardClass68 = iOException20.getClass();
        org.junit.Assert.assertNotNull(throwableArray4);
        org.junit.Assert.assertNotNull(throwableArray13);
        org.junit.Assert.assertNotNull(throwableArray27);
        org.junit.Assert.assertNotNull(throwableArray28);
        org.junit.Assert.assertNotNull(throwableArray34);
        org.junit.Assert.assertNotNull(throwableArray43);
        org.junit.Assert.assertNotNull(wildcardClass68);
    }

    @Test
    public void test00499() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00499");
        java.io.IOException iOException2 = new java.io.IOException();
        java.io.IOException iOException3 = new java.io.IOException();
        iOException2.addSuppressed((java.lang.Throwable) iOException3);
        java.io.IOException iOException5 = new java.io.IOException("0", (java.lang.Throwable) iOException2);
        java.lang.Throwable[] throwableArray6 = iOException5.getSuppressed();
        java.io.IOException iOException7 = new java.io.IOException("", (java.lang.Throwable) iOException5);
        java.lang.Throwable[] throwableArray8 = iOException5.getSuppressed();
        java.lang.String str9 = iOException5.toString();
        org.junit.Assert.assertNotNull(throwableArray6);
        org.junit.Assert.assertNotNull(throwableArray8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "java.io.IOException: 0" + "'", str9, "java.io.IOException: 0");
    }

    @Test
    public void test00500() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00500");
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper2 = org.apache.commons.lang3.text.translate.UnicodeEscaper.between((int) (byte) 0, 1);
        java.io.Writer writer4 = null;
        // The following exception was thrown during execution in test generation
        try {
            unicodeEscaper2.translate((java.lang.CharSequence) "java.io.IOException: java.io.IOException: java.io.IOException: ", writer4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Writer must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(unicodeEscaper2);
    }
}

