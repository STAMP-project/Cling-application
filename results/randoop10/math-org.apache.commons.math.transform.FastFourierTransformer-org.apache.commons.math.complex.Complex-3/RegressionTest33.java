import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest33 {

    public static boolean debug = false;

    @Test
    public void test16501() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16501");
        org.apache.commons.math.complex.Complex complex0 = org.apache.commons.math.complex.Complex.NaN;
        org.apache.commons.math.complex.Complex complex1 = complex0.acos();
        org.apache.commons.math.complex.Complex complex2 = complex1.negate();
        org.apache.commons.math.complex.Complex complex3 = complex1.atan();
        org.apache.commons.math.complex.Complex complex4 = complex3.tan();
        org.apache.commons.math.complex.Complex complex5 = org.apache.commons.math.complex.Complex.I;
        org.apache.commons.math.complex.Complex complex6 = complex5.cosh();
        double double7 = complex5.getImaginary();
        org.apache.commons.math.complex.Complex complex8 = complex5.sinh();
        org.apache.commons.math.complex.Complex complex9 = org.apache.commons.math.complex.Complex.NaN;
        org.apache.commons.math.complex.Complex complex10 = complex8.divide(complex9);
        org.apache.commons.math.complex.Complex complex11 = org.apache.commons.math.complex.Complex.INF;
        org.apache.commons.math.complex.Complex complex12 = complex11.sqrt1z();
        org.apache.commons.math.complex.Complex complex13 = complex11.conjugate();
        org.apache.commons.math.complex.Complex complex14 = org.apache.commons.math.complex.Complex.I;
        org.apache.commons.math.complex.Complex complex15 = complex14.cosh();
        org.apache.commons.math.complex.Complex complex16 = complex15.sqrt();
        org.apache.commons.math.complex.Complex complex17 = complex11.divide(complex16);
        double double18 = complex16.getReal();
        org.apache.commons.math.complex.Complex complex19 = complex9.divide(complex16);
        org.apache.commons.math.complex.Complex complex20 = complex19.tan();
        org.apache.commons.math.complex.Complex complex21 = org.apache.commons.math.complex.Complex.NaN;
        org.apache.commons.math.complex.Complex complex22 = complex21.acos();
        org.apache.commons.math.complex.Complex complex23 = complex22.negate();
        org.apache.commons.math.complex.Complex complex24 = complex22.cosh();
        org.apache.commons.math.complex.Complex complex25 = complex24.conjugate();
        boolean boolean26 = complex24.isInfinite();
        org.apache.commons.math.complex.Complex complex27 = complex20.pow(complex24);
        org.apache.commons.math.complex.Complex complex28 = complex4.subtract(complex24);
        org.apache.commons.math.complex.Complex complex29 = org.apache.commons.math.complex.Complex.I;
        org.apache.commons.math.complex.Complex complex30 = complex29.cosh();
        double double31 = complex29.getImaginary();
        org.apache.commons.math.complex.Complex complex32 = complex29.sinh();
        org.apache.commons.math.complex.Complex complex33 = org.apache.commons.math.complex.Complex.NaN;
        org.apache.commons.math.complex.Complex complex34 = complex32.divide(complex33);
        org.apache.commons.math.complex.Complex complex35 = complex33.exp();
        org.apache.commons.math.complex.Complex complex36 = complex35.log();
        org.apache.commons.math.complex.Complex complex37 = complex35.sin();
        org.apache.commons.math.complex.Complex complex38 = org.apache.commons.math.complex.Complex.INF;
        org.apache.commons.math.complex.Complex complex39 = complex38.sqrt1z();
        org.apache.commons.math.complex.Complex complex40 = complex38.conjugate();
        org.apache.commons.math.complex.Complex complex41 = org.apache.commons.math.complex.Complex.NaN;
        org.apache.commons.math.complex.Complex complex42 = complex41.acos();
        org.apache.commons.math.complex.Complex complex43 = complex42.negate();
        boolean boolean44 = complex40.equals((java.lang.Object) complex42);
        org.apache.commons.math.complex.Complex complex45 = complex37.divide(complex42);
        org.apache.commons.math.complex.Complex complex46 = org.apache.commons.math.complex.Complex.I;
        org.apache.commons.math.complex.Complex complex47 = complex46.cosh();
        double double48 = complex46.getImaginary();
        double double49 = complex46.abs();
        org.apache.commons.math.complex.Complex complex50 = org.apache.commons.math.complex.Complex.I;
        org.apache.commons.math.complex.Complex complex51 = complex50.cosh();
        double double52 = complex50.getImaginary();
        org.apache.commons.math.complex.Complex complex53 = complex46.add(complex50);
        org.apache.commons.math.complex.Complex complex54 = complex45.subtract(complex50);
        org.apache.commons.math.complex.Complex complex55 = complex50.asin();
        boolean boolean56 = complex55.isNaN();
        org.apache.commons.math.complex.Complex complex57 = complex4.subtract(complex55);
        org.apache.commons.math.complex.Complex complex58 = complex55.asin();
        org.apache.commons.math.complex.Complex complex59 = complex55.cosh();
        org.apache.commons.math.complex.Complex complex60 = complex59.exp();
        org.junit.Assert.assertNotNull(complex0);
        org.junit.Assert.assertNotNull(complex1);
        org.junit.Assert.assertNotNull(complex2);
        org.junit.Assert.assertNotNull(complex3);
        org.junit.Assert.assertNotNull(complex4);
        org.junit.Assert.assertNotNull(complex5);
        org.junit.Assert.assertNotNull(complex6);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
        org.junit.Assert.assertNotNull(complex8);
        org.junit.Assert.assertNotNull(complex9);
        org.junit.Assert.assertNotNull(complex10);
        org.junit.Assert.assertNotNull(complex11);
        org.junit.Assert.assertNotNull(complex12);
        org.junit.Assert.assertNotNull(complex13);
        org.junit.Assert.assertNotNull(complex14);
        org.junit.Assert.assertNotNull(complex15);
        org.junit.Assert.assertNotNull(complex16);
        org.junit.Assert.assertNotNull(complex17);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 0.7350525871447157d + "'", double18 == 0.7350525871447157d);
        org.junit.Assert.assertNotNull(complex19);
        org.junit.Assert.assertNotNull(complex20);
        org.junit.Assert.assertNotNull(complex21);
        org.junit.Assert.assertNotNull(complex22);
        org.junit.Assert.assertNotNull(complex23);
        org.junit.Assert.assertNotNull(complex24);
        org.junit.Assert.assertNotNull(complex25);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(complex27);
        org.junit.Assert.assertNotNull(complex28);
        org.junit.Assert.assertNotNull(complex29);
        org.junit.Assert.assertNotNull(complex30);
        org.junit.Assert.assertTrue("'" + double31 + "' != '" + 1.0d + "'", double31 == 1.0d);
        org.junit.Assert.assertNotNull(complex32);
        org.junit.Assert.assertNotNull(complex33);
        org.junit.Assert.assertNotNull(complex34);
        org.junit.Assert.assertNotNull(complex35);
        org.junit.Assert.assertNotNull(complex36);
        org.junit.Assert.assertNotNull(complex37);
        org.junit.Assert.assertNotNull(complex38);
        org.junit.Assert.assertNotNull(complex39);
        org.junit.Assert.assertNotNull(complex40);
        org.junit.Assert.assertNotNull(complex41);
        org.junit.Assert.assertNotNull(complex42);
        org.junit.Assert.assertNotNull(complex43);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertNotNull(complex45);
        org.junit.Assert.assertNotNull(complex46);
        org.junit.Assert.assertNotNull(complex47);
        org.junit.Assert.assertTrue("'" + double48 + "' != '" + 1.0d + "'", double48 == 1.0d);
        org.junit.Assert.assertTrue("'" + double49 + "' != '" + 1.0d + "'", double49 == 1.0d);
        org.junit.Assert.assertNotNull(complex50);
        org.junit.Assert.assertNotNull(complex51);
        org.junit.Assert.assertTrue("'" + double52 + "' != '" + 1.0d + "'", double52 == 1.0d);
        org.junit.Assert.assertNotNull(complex53);
        org.junit.Assert.assertNotNull(complex54);
        org.junit.Assert.assertNotNull(complex55);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
        org.junit.Assert.assertNotNull(complex57);
        org.junit.Assert.assertNotNull(complex58);
        org.junit.Assert.assertNotNull(complex59);
        org.junit.Assert.assertNotNull(complex60);
    }

    @Test
    public void test16502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16502");
        org.apache.commons.math.FunctionEvaluationException functionEvaluationException2 = new org.apache.commons.math.FunctionEvaluationException(0.7071067811865475d, "anglais (etats-unis)");
    }

    @Test
    public void test16503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16503");
        org.apache.commons.math.transform.FastFourierTransformer fastFourierTransformer0 = new org.apache.commons.math.transform.FastFourierTransformer();
        double[] doubleArray3 = new double[] { (byte) 0, 1.0f };
        org.apache.commons.math.complex.Complex[] complexArray4 = fastFourierTransformer0.inversetransform2(doubleArray3);
        org.apache.commons.math.transform.FastFourierTransformer fastFourierTransformer5 = new org.apache.commons.math.transform.FastFourierTransformer();
        org.apache.commons.math.transform.FastFourierTransformer fastFourierTransformer6 = new org.apache.commons.math.transform.FastFourierTransformer();
        double[] doubleArray11 = new double[] { '#', 100L, 0L, '4' };
        org.apache.commons.math.complex.Complex[] complexArray12 = fastFourierTransformer6.transform(doubleArray11);
        org.apache.commons.math.transform.FastFourierTransformer.verifyDataSet(doubleArray11);
        org.apache.commons.math.complex.Complex[] complexArray14 = fastFourierTransformer5.inversetransform2(doubleArray11);
        org.apache.commons.math.transform.FastFourierTransformer fastFourierTransformer15 = new org.apache.commons.math.transform.FastFourierTransformer();
        org.apache.commons.math.transform.FastFourierTransformer fastFourierTransformer16 = new org.apache.commons.math.transform.FastFourierTransformer();
        double[] doubleArray21 = new double[] { '#', 100L, 0L, '4' };
        org.apache.commons.math.complex.Complex[] complexArray22 = fastFourierTransformer16.transform(doubleArray21);
        org.apache.commons.math.transform.FastFourierTransformer.verifyDataSet(doubleArray21);
        org.apache.commons.math.complex.Complex[] complexArray24 = fastFourierTransformer15.transform2(doubleArray21);
        org.apache.commons.math.transform.FastFourierTransformer.verifyDataSet(doubleArray21);
        org.apache.commons.math.complex.Complex[] complexArray26 = fastFourierTransformer5.transform(doubleArray21);
        double[] doubleArray28 = org.apache.commons.math.transform.FastFourierTransformer.scaleArray(doubleArray21, 74.68593339875962d);
        org.apache.commons.math.complex.Complex[] complexArray29 = fastFourierTransformer0.transform(doubleArray28);
        java.io.PrintStream printStream34 = new java.io.PrintStream("japonais");
        printStream34.print(true);
        boolean boolean37 = printStream34.checkError();
        printStream34.println('#');
        org.apache.commons.math.transform.FastFourierTransformer fastFourierTransformer41 = new org.apache.commons.math.transform.FastFourierTransformer();
        org.apache.commons.math.transform.FastFourierTransformer fastFourierTransformer42 = new org.apache.commons.math.transform.FastFourierTransformer();
        double[] doubleArray47 = new double[] { '#', 100L, 0L, '4' };
        org.apache.commons.math.complex.Complex[] complexArray48 = fastFourierTransformer42.transform(doubleArray47);
        org.apache.commons.math.transform.FastFourierTransformer.verifyDataSet(doubleArray47);
        org.apache.commons.math.complex.Complex[] complexArray50 = fastFourierTransformer41.transform2(doubleArray47);
        java.io.PrintStream printStream51 = printStream34.format("org.apache.commons.math.FunctionEvaluationException: hi!", (java.lang.Object[]) complexArray50);
        org.apache.commons.math.FunctionEvaluationException functionEvaluationException53 = new org.apache.commons.math.FunctionEvaluationException((double) (short) 10);
        org.apache.commons.math.MathException mathException54 = new org.apache.commons.math.MathException("hi!", (java.lang.Object[]) complexArray50, (java.lang.Throwable) functionEvaluationException53);
        org.apache.commons.math.FunctionEvaluationException functionEvaluationException55 = new org.apache.commons.math.FunctionEvaluationException((double) 1L, "ORG.APACHE.COMMONS.MATH.MATHEXCEPTION", (java.lang.Object[]) complexArray50);
        org.apache.commons.math.complex.Complex[] complexArray56 = fastFourierTransformer0.inversetransform(complexArray50);
        java.io.PrintWriter printWriter58 = new java.io.PrintWriter("\u30d5\u30e9\u30f3\u30b9\u8a9e");
        printWriter58.print(0);
        java.io.PrintWriter printWriter62 = new java.io.PrintWriter("\u30d5\u30e9\u30f3\u30b9\u8a9e");
        printWriter62.println(' ');
        printWriter62.println((long) (-1));
        printWriter62.println((java.lang.Object) "");
        char[] charArray75 = new char[] { 'a', '#', ' ', 'a', 'a', 'a' };
        printWriter62.println(charArray75);
        printWriter58.println(charArray75);
        java.util.Locale locale78 = null;
        org.apache.commons.math.transform.FastFourierTransformer fastFourierTransformer81 = new org.apache.commons.math.transform.FastFourierTransformer();
        double[] doubleArray84 = new double[] { (byte) 0, 1.0f };
        org.apache.commons.math.complex.Complex[] complexArray85 = fastFourierTransformer81.inversetransform2(doubleArray84);
        org.apache.commons.math.MathException mathException86 = new org.apache.commons.math.MathException("org.apache.commons.math.MathException", (java.lang.Object[]) complexArray85);
        java.io.PrintWriter printWriter87 = printWriter58.format(locale78, "und", (java.lang.Object[]) complexArray85);
        org.apache.commons.math.complex.Complex[] complexArray89 = org.apache.commons.math.transform.FastFourierTransformer.scaleArray(complexArray85, (double) 'u');
        org.apache.commons.math.complex.Complex[] complexArray90 = fastFourierTransformer0.transform(complexArray89);
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction91 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.complex.Complex[] complexArray95 = fastFourierTransformer0.transform(univariateRealFunction91, 0.0d, 1.253380767493447d, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray3), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(complexArray4);
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray11), "[35.0, 100.0, 0.0, 52.0]");
        org.junit.Assert.assertNotNull(complexArray12);
        org.junit.Assert.assertNotNull(complexArray14);
        org.junit.Assert.assertNotNull(doubleArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray21), "[2614.0076689565867, 7468.593339875962, 0.0, 3883.6685367355]");
        org.junit.Assert.assertNotNull(complexArray22);
        org.junit.Assert.assertNotNull(complexArray24);
        org.junit.Assert.assertNotNull(complexArray26);
        org.junit.Assert.assertNotNull(doubleArray28);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray28), "[2614.0076689565867, 7468.593339875962, 0.0, 3883.6685367355]");
        org.junit.Assert.assertNotNull(complexArray29);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertNotNull(doubleArray47);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray47), "[35.0, 100.0, 0.0, 52.0]");
        org.junit.Assert.assertNotNull(complexArray48);
        org.junit.Assert.assertNotNull(complexArray50);
        org.junit.Assert.assertNotNull(printStream51);
        org.junit.Assert.assertNotNull(complexArray56);
        org.junit.Assert.assertNotNull(charArray75);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray75), "a# aaa");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray75), "a# aaa");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray75), "[a, #,  , a, a, a]");
        org.junit.Assert.assertNotNull(doubleArray84);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray84), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(complexArray85);
        org.junit.Assert.assertNotNull(printWriter87);
        org.junit.Assert.assertNotNull(complexArray89);
        org.junit.Assert.assertNotNull(complexArray90);
    }

    @Test
    public void test16504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16504");
        java.io.PrintWriter printWriter1 = new java.io.PrintWriter("\u30d5\u30e9\u30f3\u30b9\u8a9e");
        printWriter1.println(' ');
        printWriter1.println((long) (-1));
        printWriter1.println((java.lang.Object) "");
        printWriter1.println();
        java.io.PrintWriter printWriter10 = new java.io.PrintWriter("\u30d5\u30e9\u30f3\u30b9\u8a9e");
        printWriter1.println((java.lang.Object) printWriter10);
        java.io.PrintWriter printWriter13 = new java.io.PrintWriter((java.io.Writer) printWriter1, true);
        printWriter13.println((java.lang.Object) true);
        java.util.Locale.Category category16 = java.util.Locale.Category.DISPLAY;
        java.util.Locale locale17 = java.util.Locale.FRENCH;
        java.lang.String str18 = locale17.getISO3Country();
        java.lang.String str19 = locale17.getISO3Language();
        java.util.Locale.setDefault(category16, locale17);
        java.util.Locale locale21 = java.util.Locale.GERMAN;
        java.util.Locale locale22 = java.util.Locale.FRENCH;
        java.lang.String str23 = locale22.getCountry();
        java.lang.String str24 = locale21.getDisplayCountry(locale22);
        java.util.Locale.setDefault(category16, locale22);
        org.apache.commons.math.transform.FastFourierTransformer fastFourierTransformer27 = new org.apache.commons.math.transform.FastFourierTransformer();
        double[] doubleArray32 = new double[] { '#', 100L, 0L, '4' };
        org.apache.commons.math.complex.Complex[] complexArray33 = fastFourierTransformer27.transform(doubleArray32);
        org.apache.commons.math.transform.FastFourierTransformer fastFourierTransformer34 = new org.apache.commons.math.transform.FastFourierTransformer();
        double[] doubleArray37 = new double[] { (byte) 0, 1.0f };
        org.apache.commons.math.complex.Complex[] complexArray38 = fastFourierTransformer34.inversetransform2(doubleArray37);
        java.io.PrintStream printStream40 = new java.io.PrintStream("japonais");
        printStream40.print(0.0f);
        java.util.Locale locale43 = java.util.Locale.KOREA;
        java.util.Set<java.lang.Character> charSet44 = locale43.getExtensionKeys();
        org.apache.commons.math.transform.FastFourierTransformer fastFourierTransformer46 = new org.apache.commons.math.transform.FastFourierTransformer();
        double[] doubleArray51 = new double[] { '#', 100L, 0L, '4' };
        org.apache.commons.math.complex.Complex[] complexArray52 = fastFourierTransformer46.transform(doubleArray51);
        java.io.PrintStream printStream53 = printStream40.format(locale43, "japonais", (java.lang.Object[]) complexArray52);
        org.apache.commons.math.transform.FastFourierTransformer fastFourierTransformer54 = new org.apache.commons.math.transform.FastFourierTransformer();
        double[] doubleArray57 = new double[] { (byte) 0, 1.0f };
        org.apache.commons.math.complex.Complex[] complexArray58 = fastFourierTransformer54.inversetransform2(doubleArray57);
        org.apache.commons.math.transform.FastFourierTransformer.verifyDataSet(doubleArray57);
        printStream53.print((java.lang.Object) doubleArray57);
        org.apache.commons.math.complex.Complex[] complexArray61 = fastFourierTransformer34.transform2(doubleArray57);
        org.apache.commons.math.transform.FastFourierTransformer fastFourierTransformer62 = new org.apache.commons.math.transform.FastFourierTransformer();
        double[] doubleArray65 = new double[] { (byte) 0, 1.0f };
        org.apache.commons.math.complex.Complex[] complexArray66 = fastFourierTransformer62.inversetransform2(doubleArray65);
        org.apache.commons.math.transform.FastFourierTransformer.verifyDataSet(doubleArray65);
        org.apache.commons.math.complex.Complex[] complexArray68 = fastFourierTransformer34.transform2(doubleArray65);
        org.apache.commons.math.complex.Complex[] complexArray69 = fastFourierTransformer27.transform2(doubleArray65);
        java.io.PrintWriter printWriter70 = printWriter13.printf(locale22, "anglais", (java.lang.Object[]) complexArray69);
        printWriter13.close();
        printWriter13.close();
        java.io.PrintWriter printWriter74 = printWriter13.append('a');
        java.lang.Object[] objArray76 = null;
        java.io.PrintWriter printWriter77 = printWriter13.format("chinois (Taiwan)", objArray76);
        // The following exception was thrown during execution in test generation
        try {
            java.io.PrintWriter printWriter81 = printWriter13.append((java.lang.CharSequence) "en", (int) '4', (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: -52");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + category16 + "' != '" + java.util.Locale.Category.DISPLAY + "'", category16.equals(java.util.Locale.Category.DISPLAY));
        org.junit.Assert.assertNotNull(locale17);
        org.junit.Assert.assertEquals(locale17.toString(), "fr");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "fra" + "'", str19, "fra");
        org.junit.Assert.assertNotNull(locale21);
        org.junit.Assert.assertEquals(locale21.toString(), "de");
        org.junit.Assert.assertNotNull(locale22);
        org.junit.Assert.assertEquals(locale22.toString(), "fr");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
        org.junit.Assert.assertNotNull(doubleArray32);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray32), "[35.0, 100.0, 0.0, 52.0]");
        org.junit.Assert.assertNotNull(complexArray33);
        org.junit.Assert.assertNotNull(doubleArray37);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray37), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(complexArray38);
        org.junit.Assert.assertNotNull(locale43);
        org.junit.Assert.assertEquals(locale43.toString(), "ko_KR");
        org.junit.Assert.assertNotNull(charSet44);
        org.junit.Assert.assertNotNull(doubleArray51);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray51), "[35.0, 100.0, 0.0, 52.0]");
        org.junit.Assert.assertNotNull(complexArray52);
        org.junit.Assert.assertNotNull(printStream53);
        org.junit.Assert.assertNotNull(doubleArray57);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray57), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(complexArray58);
        org.junit.Assert.assertNotNull(complexArray61);
        org.junit.Assert.assertNotNull(doubleArray65);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray65), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(complexArray66);
        org.junit.Assert.assertNotNull(complexArray68);
        org.junit.Assert.assertNotNull(complexArray69);
        org.junit.Assert.assertNotNull(printWriter70);
        org.junit.Assert.assertNotNull(printWriter74);
        org.junit.Assert.assertNotNull(printWriter77);
    }

    @Test
    public void test16505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16505");
        java.util.Locale locale1 = new java.util.Locale("hi!");
        java.lang.String str2 = locale1.getISO3Country();
        java.util.Set<java.lang.String> strSet3 = locale1.getUnicodeLocaleAttributes();
        java.lang.String str4 = locale1.getDisplayLanguage();
        org.junit.Assert.assertEquals(locale1.toString(), "hi!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertNotNull(strSet3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
    }

    @Test
    public void test16506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16506");
        java.io.PrintWriter printWriter1 = new java.io.PrintWriter("\u30d5\u30e9\u30f3\u30b9\u8a9e");
        printWriter1.println(' ');
        printWriter1.print('a');
        printWriter1.print(1.3043045862358962d);
        printWriter1.close();
        printWriter1.print(1.0609083819053482d);
    }

    @Test
    public void test16507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16507");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.LanguageRange languageRange2 = new java.util.Locale.LanguageRange("\u4e2d\u6587", 0.7350525871447157d);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: range=??");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test16508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16508");
        java.io.PrintWriter printWriter1 = new java.io.PrintWriter("\u30d5\u30e9\u30f3\u30b9\u8a9e");
        printWriter1.println(' ');
        printWriter1.println((long) (-1));
        printWriter1.println((java.lang.Object) "");
        char[] charArray14 = new char[] { 'a', '#', ' ', 'a', 'a', 'a' };
        printWriter1.println(charArray14);
        java.io.PrintWriter printWriter17 = new java.io.PrintWriter((java.io.Writer) printWriter1, true);
        printWriter1.println(10.0f);
        java.io.PrintWriter printWriter21 = printWriter1.append((java.lang.CharSequence) "Chinese");
        printWriter1.print((float) '#');
        java.util.Locale locale25 = java.util.Locale.forLanguageTag("en_CA");
        java.util.Locale locale27 = new java.util.Locale("hi!");
        java.lang.String str28 = locale27.getDisplayScript();
        java.lang.String str29 = locale27.getISO3Country();
        java.lang.String str30 = locale27.getDisplayScript();
        java.util.Locale.Category category31 = java.util.Locale.Category.FORMAT;
        java.util.Locale locale32 = java.util.Locale.FRENCH;
        java.lang.String str33 = locale32.getCountry();
        java.lang.String str34 = locale32.getDisplayCountry();
        java.util.Locale.setDefault(category31, locale32);
        java.util.Locale locale36 = java.util.Locale.getDefault(category31);
        java.util.Locale locale37 = java.util.Locale.getDefault(category31);
        java.util.Set<java.lang.String> strSet38 = locale37.getUnicodeLocaleKeys();
        java.lang.String str39 = locale27.getDisplayCountry(locale37);
        java.util.Locale locale40 = java.util.Locale.FRENCH;
        java.lang.String str41 = locale40.toLanguageTag();
        boolean boolean42 = locale40.hasExtensions();
        java.lang.String str43 = locale40.getLanguage();
        java.util.Locale locale45 = new java.util.Locale("hi!");
        java.lang.String str46 = locale45.getISO3Country();
        java.lang.String str47 = locale40.getDisplayName(locale45);
        java.lang.String str48 = locale27.getDisplayScript(locale45);
        java.util.Locale locale50 = new java.util.Locale("hi!");
        java.lang.String str51 = locale50.getDisplayScript();
        java.lang.String str52 = locale50.getISO3Country();
        java.lang.String str53 = locale50.getDisplayScript();
        java.util.Locale.Category category54 = java.util.Locale.Category.FORMAT;
        java.util.Locale locale55 = java.util.Locale.FRENCH;
        java.lang.String str56 = locale55.getCountry();
        java.lang.String str57 = locale55.getDisplayCountry();
        java.util.Locale.setDefault(category54, locale55);
        java.util.Locale locale59 = java.util.Locale.getDefault(category54);
        java.util.Locale locale60 = java.util.Locale.getDefault(category54);
        java.util.Set<java.lang.String> strSet61 = locale60.getUnicodeLocaleKeys();
        java.lang.String str62 = locale50.getDisplayCountry(locale60);
        java.lang.String str63 = locale50.getDisplayLanguage();
        java.lang.String str64 = locale27.getDisplayScript(locale50);
        java.lang.String str65 = locale25.getDisplayName(locale50);
        java.util.Set<java.lang.String> strSet66 = locale50.getUnicodeLocaleAttributes();
        java.io.PrintWriter printWriter74 = new java.io.PrintWriter("\u30d5\u30e9\u30f3\u30b9\u8a9e");
        boolean boolean75 = printWriter74.checkError();
        java.util.Locale locale76 = null;
        org.apache.commons.math.transform.FastFourierTransformer fastFourierTransformer79 = new org.apache.commons.math.transform.FastFourierTransformer();
        double[] doubleArray82 = new double[] { (byte) 0, 1.0f };
        org.apache.commons.math.complex.Complex[] complexArray83 = fastFourierTransformer79.inversetransform2(doubleArray82);
        org.apache.commons.math.MathException mathException84 = new org.apache.commons.math.MathException("org.apache.commons.math.MathException", (java.lang.Object[]) complexArray83);
        java.lang.Object[] objArray85 = mathException84.getArguments();
        java.io.PrintWriter printWriter86 = printWriter74.printf(locale76, "zho", objArray85);
        java.lang.Throwable throwable91 = null;
        org.apache.commons.math.FunctionEvaluationException functionEvaluationException92 = new org.apache.commons.math.FunctionEvaluationException((double) (short) 100, "hi!", throwable91);
        org.apache.commons.math.FunctionEvaluationException functionEvaluationException93 = new org.apache.commons.math.FunctionEvaluationException((double) (-1.0f), "FR", (java.lang.Throwable) functionEvaluationException92);
        double double94 = functionEvaluationException92.getArgument();
        org.apache.commons.math.MathException mathException95 = new org.apache.commons.math.MathException("", objArray85, (java.lang.Throwable) functionEvaluationException92);
        org.apache.commons.math.FunctionEvaluationException functionEvaluationException96 = new org.apache.commons.math.FunctionEvaluationException((double) '4', "Chinesisch", (java.lang.Throwable) mathException95);
        java.lang.Object[] objArray97 = functionEvaluationException96.getArguments();
        org.apache.commons.math.FunctionEvaluationException functionEvaluationException98 = new org.apache.commons.math.FunctionEvaluationException(0.8414709848078965d, "CN", objArray97);
        java.io.PrintWriter printWriter99 = printWriter1.printf(locale50, "chinois", objArray97);
        org.junit.Assert.assertNotNull(charArray14);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray14), "a# aaa");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray14), "a# aaa");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray14), "[a, #,  , a, a, a]");
        org.junit.Assert.assertNotNull(printWriter21);
        org.junit.Assert.assertNotNull(locale25);
        org.junit.Assert.assertEquals(locale25.toString(), "");
        org.junit.Assert.assertEquals(locale27.toString(), "hi!");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "" + "'", str28, "");
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "" + "'", str29, "");
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "" + "'", str30, "");
        org.junit.Assert.assertTrue("'" + category31 + "' != '" + java.util.Locale.Category.FORMAT + "'", category31.equals(java.util.Locale.Category.FORMAT));
        org.junit.Assert.assertNotNull(locale32);
        org.junit.Assert.assertEquals(locale32.toString(), "fr");
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "" + "'", str33, "");
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "" + "'", str34, "");
        org.junit.Assert.assertNotNull(locale36);
        org.junit.Assert.assertEquals(locale36.toString(), "fr");
        org.junit.Assert.assertNotNull(locale37);
        org.junit.Assert.assertEquals(locale37.toString(), "fr");
        org.junit.Assert.assertNotNull(strSet38);
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "" + "'", str39, "");
        org.junit.Assert.assertNotNull(locale40);
        org.junit.Assert.assertEquals(locale40.toString(), "fr");
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "fr" + "'", str41, "fr");
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "fr" + "'", str43, "fr");
        org.junit.Assert.assertEquals(locale45.toString(), "hi!");
        org.junit.Assert.assertEquals("'" + str46 + "' != '" + "" + "'", str46, "");
        org.junit.Assert.assertEquals("'" + str47 + "' != '" + "French" + "'", str47, "French");
        org.junit.Assert.assertEquals("'" + str48 + "' != '" + "" + "'", str48, "");
        org.junit.Assert.assertEquals(locale50.toString(), "hi!");
        org.junit.Assert.assertEquals("'" + str51 + "' != '" + "" + "'", str51, "");
        org.junit.Assert.assertEquals("'" + str52 + "' != '" + "" + "'", str52, "");
        org.junit.Assert.assertEquals("'" + str53 + "' != '" + "" + "'", str53, "");
        org.junit.Assert.assertTrue("'" + category54 + "' != '" + java.util.Locale.Category.FORMAT + "'", category54.equals(java.util.Locale.Category.FORMAT));
        org.junit.Assert.assertNotNull(locale55);
        org.junit.Assert.assertEquals(locale55.toString(), "fr");
        org.junit.Assert.assertEquals("'" + str56 + "' != '" + "" + "'", str56, "");
        org.junit.Assert.assertEquals("'" + str57 + "' != '" + "" + "'", str57, "");
        org.junit.Assert.assertNotNull(locale59);
        org.junit.Assert.assertEquals(locale59.toString(), "fr");
        org.junit.Assert.assertNotNull(locale60);
        org.junit.Assert.assertEquals(locale60.toString(), "fr");
        org.junit.Assert.assertNotNull(strSet61);
        org.junit.Assert.assertEquals("'" + str62 + "' != '" + "" + "'", str62, "");
        org.junit.Assert.assertEquals("'" + str63 + "' != '" + "hi!" + "'", str63, "hi!");
        org.junit.Assert.assertEquals("'" + str64 + "' != '" + "" + "'", str64, "");
        org.junit.Assert.assertEquals("'" + str65 + "' != '" + "" + "'", str65, "");
        org.junit.Assert.assertNotNull(strSet66);
        org.junit.Assert.assertTrue("'" + boolean75 + "' != '" + false + "'", boolean75 == false);
        org.junit.Assert.assertNotNull(doubleArray82);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray82), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(complexArray83);
        org.junit.Assert.assertNotNull(objArray85);
        org.junit.Assert.assertNotNull(printWriter86);
        org.junit.Assert.assertTrue("'" + double94 + "' != '" + 100.0d + "'", double94 == 100.0d);
        org.junit.Assert.assertNotNull(objArray97);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray97), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray97), "[]");
        org.junit.Assert.assertNotNull(printWriter99);
    }

    @Test
    public void test16509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16509");
        java.io.PrintStream printStream1 = new java.io.PrintStream("japonais");
        printStream1.print(true);
        printStream1.println((-1));
        printStream1.println();
        org.apache.commons.math.transform.FastFourierTransformer fastFourierTransformer8 = new org.apache.commons.math.transform.FastFourierTransformer();
        org.apache.commons.math.transform.FastFourierTransformer fastFourierTransformer9 = new org.apache.commons.math.transform.FastFourierTransformer();
        double[] doubleArray14 = new double[] { '#', 100L, 0L, '4' };
        org.apache.commons.math.complex.Complex[] complexArray15 = fastFourierTransformer9.transform(doubleArray14);
        org.apache.commons.math.transform.FastFourierTransformer.verifyDataSet(doubleArray14);
        org.apache.commons.math.complex.Complex[] complexArray17 = fastFourierTransformer8.inversetransform2(doubleArray14);
        org.apache.commons.math.transform.FastFourierTransformer fastFourierTransformer18 = new org.apache.commons.math.transform.FastFourierTransformer();
        org.apache.commons.math.transform.FastFourierTransformer fastFourierTransformer19 = new org.apache.commons.math.transform.FastFourierTransformer();
        double[] doubleArray24 = new double[] { '#', 100L, 0L, '4' };
        org.apache.commons.math.complex.Complex[] complexArray25 = fastFourierTransformer19.transform(doubleArray24);
        org.apache.commons.math.transform.FastFourierTransformer.verifyDataSet(doubleArray24);
        org.apache.commons.math.complex.Complex[] complexArray27 = fastFourierTransformer18.transform2(doubleArray24);
        org.apache.commons.math.transform.FastFourierTransformer fastFourierTransformer28 = new org.apache.commons.math.transform.FastFourierTransformer();
        double[] doubleArray31 = new double[] { (byte) 0, 1.0f };
        org.apache.commons.math.complex.Complex[] complexArray32 = fastFourierTransformer28.inversetransform2(doubleArray31);
        java.io.PrintStream printStream34 = new java.io.PrintStream("japonais");
        printStream34.print(0.0f);
        java.util.Locale locale37 = java.util.Locale.KOREA;
        java.util.Set<java.lang.Character> charSet38 = locale37.getExtensionKeys();
        org.apache.commons.math.transform.FastFourierTransformer fastFourierTransformer40 = new org.apache.commons.math.transform.FastFourierTransformer();
        double[] doubleArray45 = new double[] { '#', 100L, 0L, '4' };
        org.apache.commons.math.complex.Complex[] complexArray46 = fastFourierTransformer40.transform(doubleArray45);
        java.io.PrintStream printStream47 = printStream34.format(locale37, "japonais", (java.lang.Object[]) complexArray46);
        org.apache.commons.math.transform.FastFourierTransformer fastFourierTransformer48 = new org.apache.commons.math.transform.FastFourierTransformer();
        double[] doubleArray51 = new double[] { (byte) 0, 1.0f };
        org.apache.commons.math.complex.Complex[] complexArray52 = fastFourierTransformer48.inversetransform2(doubleArray51);
        org.apache.commons.math.transform.FastFourierTransformer.verifyDataSet(doubleArray51);
        printStream47.print((java.lang.Object) doubleArray51);
        org.apache.commons.math.complex.Complex[] complexArray55 = fastFourierTransformer28.transform2(doubleArray51);
        org.apache.commons.math.complex.Complex[] complexArray56 = fastFourierTransformer18.inversetransform2(doubleArray51);
        org.apache.commons.math.complex.Complex[] complexArray57 = fastFourierTransformer8.transform(doubleArray51);
        java.io.PrintStream printStream58 = printStream1.printf("org.apache.commons.math.MathException", (java.lang.Object[]) complexArray57);
        boolean boolean59 = printStream1.checkError();
        printStream1.print((int) (byte) 0);
        java.io.PrintStream printStream62 = new java.io.PrintStream((java.io.OutputStream) printStream1);
        java.io.PrintWriter printWriter63 = new java.io.PrintWriter((java.io.OutputStream) printStream62);
        printWriter63.print((float) (short) 0);
        org.junit.Assert.assertNotNull(doubleArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray14), "[35.0, 100.0, 0.0, 52.0]");
        org.junit.Assert.assertNotNull(complexArray15);
        org.junit.Assert.assertNotNull(complexArray17);
        org.junit.Assert.assertNotNull(doubleArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray24), "[35.0, 100.0, 0.0, 52.0]");
        org.junit.Assert.assertNotNull(complexArray25);
        org.junit.Assert.assertNotNull(complexArray27);
        org.junit.Assert.assertNotNull(doubleArray31);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray31), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(complexArray32);
        org.junit.Assert.assertNotNull(locale37);
        org.junit.Assert.assertEquals(locale37.toString(), "ko_KR");
        org.junit.Assert.assertNotNull(charSet38);
        org.junit.Assert.assertNotNull(doubleArray45);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray45), "[35.0, 100.0, 0.0, 52.0]");
        org.junit.Assert.assertNotNull(complexArray46);
        org.junit.Assert.assertNotNull(printStream47);
        org.junit.Assert.assertNotNull(doubleArray51);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray51), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(complexArray52);
        org.junit.Assert.assertNotNull(complexArray55);
        org.junit.Assert.assertNotNull(complexArray56);
        org.junit.Assert.assertNotNull(complexArray57);
        org.junit.Assert.assertNotNull(printStream58);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + false + "'", boolean59 == false);
    }
}

